package FunctionalProgramming.CollectorsSummarization;
import java.util.*;
import java.util.stream.*;

class Comment {
    private String username;
    private String content;

    public Comment(String username, String content) {
        this.username = username;
        this.content = content;
    }

    public String getUsername() {
        return username;
    }

    public String getContent() {
        return content;
    }
}



public class Question47 {
    public static void main(String[] args) {
        List<Comment> comments = Arrays.asList(
                new Comment("sanjana", "Great post!"),
                new Comment("ranu", "Thanks for sharing."),
                new Comment("kratika", "Interesting perspective."),
                new Comment("pragya", "Nice article."),
                new Comment("yamini", "I agree with you.")
        );


        Map<String, Long> commentCountByUser = comments.stream()
                .collect(Collectors.groupingBy(
                        Comment::getUsername,
                        Collectors.counting()
                ));


        commentCountByUser.forEach((user, count) ->
                System.out.println(user + ": " + count + " comment(s)")
        );
    }
}

