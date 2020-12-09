package group2.tier2csep3.model.rating;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RatingComponent {
    @JsonProperty
    private int id;
    @JsonProperty
    private int userId;
    @JsonProperty
    private int componentId;
    @JsonProperty
    private int score;

    public RatingComponent()
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

    public int getComponentId() {
        return componentId;
    }

    public void setComponentId(int componentId) {
        this.componentId = componentId;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "RatingComponent{" +
                "id=" + id +
                ", userId=" + userId +
                ", componentId=" + componentId +
                ", score=" + score +
                '}';
    }
}
