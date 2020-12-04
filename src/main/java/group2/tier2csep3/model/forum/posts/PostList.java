package group2.tier2csep3.model.forum.posts;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class PostList {

    @JsonProperty
    private ArrayList<Post> posts;

    public PostList()
    {
        this.posts = new ArrayList<>();
    }


    @Override
    public String toString() {
        return "PostList{" +
                "Posts=" + posts +
                '}';
    }
}
