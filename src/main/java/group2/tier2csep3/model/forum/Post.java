package group2.tier2csep3.model.forum;

import com.fasterxml.jackson.annotation.JsonProperty;
import group2.tier2csep3.model.forum.comments.CommentList;
import org.springframework.stereotype.Component;

@Component
public class Post {
    @JsonProperty
    private int id;
    @JsonProperty
    private int userId;
    @JsonProperty
    private String content;
    @JsonProperty
    private int upVotes;
    @JsonProperty
    private int downVotes;
    @JsonProperty
    private CommentList Comments;

    public Post()
    {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getUpVotes() {
        return upVotes;
    }

    public void setUpVotes(int upVotes) {
        this.upVotes = upVotes;
    }

    public int getDownVotes() {
        return downVotes;
    }

    public void setDownVotes(int downVotes) {
        this.downVotes = downVotes;
    }

    public CommentList getComments() {
        return Comments;
    }

    public void setComments(CommentList comments) {
        Comments = comments;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", userId=" + userId +
                ", content='" + content + '\'' +
                ", upVotes=" + upVotes +
                ", downVotes=" + downVotes +
                ", Comments=" + Comments +
                '}';
    }
}
