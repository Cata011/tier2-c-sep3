package group2.tier2csep3.model.forum.posts;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class PostList {

    @JsonProperty
    private ArrayList<Post> Posts;

    public PostList()
    {
        this.Posts = new ArrayList<>();
    }

    public ArrayList<Post> getPosts() {
        return Posts;
    }

    public void setPosts(ArrayList<Post> posts) {
       Posts = posts;
    }

    public int size()
    {
        return Posts.size();
    }

    public Post get(int index)
    {
        return Posts.get(index);
    }

    @Override
    public String toString() {
        return "PostList{" +
                "Posts=" + Posts +
                '}';
    }
}
