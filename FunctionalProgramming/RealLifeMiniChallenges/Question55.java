package FunctionalProgramming.RealLifeMiniChallenges;

import java.util.*;
import java.util.stream.*;

class Job {
    private String name;
    private String status;

    public Job(String name, String status) {
        this.name = name;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public String getStatus() {
        return status;
    }
}

public class Question55 {
    public static void main(String[] args) {
        List<Job> jobs = Arrays.asList(
                new Job("ImportData", "SUCCESS"),
                new Job("CleanUp", "FAILED"),
                new Job("Backup", "FAILED"),
                new Job("EmailReport", "SUCCESS"),
                new Job("SyncUsers", "FAILED")
        );


        List<String> failedJobNames = jobs.stream()
                .filter(job -> "FAILED".equalsIgnoreCase(job.getStatus()))
                .map(job -> job.getName().toUpperCase())
                .sorted()
                .collect(Collectors.toList());

        System.out.println("Failed Jobs: " + failedJobNames);
    }
}
