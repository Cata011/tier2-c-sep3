package group2.tier2csep3.model.forum.posts;

import com.fasterxml.jackson.annotation.JsonProperty;
import group2.tier2csep3.model.forum.comments.CommentList;
import org.springframework.stereotype.Component;

import java.io.Serializable;

public class Post implements Serializable {
    @JsonProperty
    private int id;
    @JsonProperty
    private int userId;
    @JsonProperty
    private String username;
    @JsonProperty
    private String content;
    @JsonProperty
    private int upVote;
    @JsonProperty
    private int downVote;
    @JsonProperty
    private CommentList commentList;

    public Post()
    {

    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", userId=" + userId +
                ", username='" + username + '\'' +
                ", content='" + content + '\'' +
                ", upVote=" + upVote +
                ", downVote=" + downVote +
                ", Comments=" + commentList +
                '}';
    }
}
