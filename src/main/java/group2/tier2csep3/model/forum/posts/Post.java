package group2.tier2csep3.model.forum.posts;

import com.fasterxml.jackson.annotation.JsonProperty;
import group2.tier2csep3.model.forum.comments.CommentList;
import org.springframework.stereotype.Component;

public class Post {
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
    private CommentList CommentList;

    public Post()
    {

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getUpVote() {
        return upVote;
    }

    public void setUpVote(int upVote) {
        this.upVote = upVote;
    }

    public int getDownVote() {
        return downVote;
    }

    public void setDownVote(int downVote) {
        this.downVote = downVote;
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
        return upVote;
    }

    public void setUpVotes(int upVotes) {
        this.upVote = upVotes;
    }

    public int getDownVotes() {
        return downVote;
    }

    public void setDownVotes(int downVotes) {
        this.downVote = downVotes;
    }

    public CommentList getComments() {
        return CommentList;
    }

    public void setComments(CommentList comments) {
        CommentList = comments;
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
                ", Comments=" + CommentList +
                '}';
    }
}
