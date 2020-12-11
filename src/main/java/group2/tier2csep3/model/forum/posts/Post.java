package group2.tier2csep3.model.forum.posts;

import com.fasterxml.jackson.annotation.JsonProperty;
import group2.tier2csep3.model.forum.comments.Comment;
import group2.tier2csep3.model.rating.RatingPost;

import java.util.List;

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
    private List<Comment> comments;
    @JsonProperty
    private List<RatingPost> ratingPosts;

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
                ", Comments=" + comments +
                '}';
    }
}
