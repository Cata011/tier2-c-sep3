package group2.tier2csep3.model.account;

import com.fasterxml.jackson.annotation.JsonProperty;
import group2.tier2csep3.model.build.BuildList;
import group2.tier2csep3.model.forum.comments.CommentList;
import group2.tier2csep3.model.forum.posts.PostList;

import java.io.Serializable;

public class Account implements Serializable {

    @JsonProperty
    private int id;
    @JsonProperty
    private String name;
    @JsonProperty
    private String username;
    @JsonProperty
    private String password;
    @JsonProperty
    private PostList Posts;
//    @JsonProperty
//    private CommentList Comments;

    public Account()
    {

    }

    public PostList getPosts() {
        return Posts;
    }

    public void setPosts(PostList posts) {
        Posts = posts;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return
                "id=" + id +
                ", name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\''
                ;
    }
}
