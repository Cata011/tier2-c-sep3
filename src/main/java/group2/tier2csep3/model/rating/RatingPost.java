package group2.tier2csep3.model.rating;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RatingPost {
    @JsonProperty
    private int id;
    @JsonProperty
    private int userId;
    @JsonProperty
    private int postId;
    @JsonProperty
    private int score;

    public RatingPost()
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

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "RatingPost{" +
                "id=" + id +
                ", userId=" + userId +
                ", postId=" + postId +
                ", score=" + score +
                '}';
    }
}
