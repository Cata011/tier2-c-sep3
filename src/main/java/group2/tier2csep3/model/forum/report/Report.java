package group2.tier2csep3.model.forum.report;

import com.fasterxml.jackson.annotation.JsonProperty;
import group2.tier2csep3.model.forum.posts.Post;

public class Report {

    @JsonProperty
    private int id;
    @JsonProperty
    private int userId;
    @JsonProperty
    private int postId;
    @JsonProperty
    private String username;

    public Report()
    {

    }

    @Override
    public String toString() {
        return "Report{" +
                "id=" + id +
                ", userId=" + userId +
                ", postId=" + postId +
                '}';
    }
}
