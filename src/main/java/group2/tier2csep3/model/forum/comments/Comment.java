package group2.tier2csep3.model.forum.comments;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Comment {
    @JsonProperty
    private int id;
    @JsonProperty
    private int userId;
    @JsonProperty
    private int postId;
    @JsonProperty
    private String content;
    @JsonProperty
    private int upVote;
    @JsonProperty
    private int downVote;

    public Comment(){

    }


    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", userId=" + userId +
                ", content='" + content + '\'' +
                ", upVote=" + upVote +
                ", downVote=" + downVote +
                '}';
    }
}
