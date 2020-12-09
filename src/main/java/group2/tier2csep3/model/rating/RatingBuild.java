package group2.tier2csep3.model.rating;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RatingBuild {
    @JsonProperty
    private int id;
    @JsonProperty
    private int userId;
    @JsonProperty
    private int buildId;
    @JsonProperty
    private int score;

    public RatingBuild()
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

    public int getBuildId() {
        return buildId;
    }

    public void setBuildId(int buildId) {
        this.buildId = buildId;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "RatingBuild{" +
                "id=" + id +
                ", userId=" + userId +
                ", buildId=" + buildId +
                ", score=" + score +
                '}';
    }
}
