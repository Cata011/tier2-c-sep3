package group2.tier2csep3.model.forum;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class PostList {

    @JsonProperty
    private ArrayList<Post> Posts;

    public PostList()
    {
        this.Posts = new ArrayList<>();
    }
}
