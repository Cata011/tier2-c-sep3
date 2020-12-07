package group2.tier2csep3.model.account;

import com.fasterxml.jackson.annotation.JsonProperty;
import group2.tier2csep3.model.forum.posts.Post;

import java.util.List;

public class Account {

    @JsonProperty
    private int id;
    @JsonProperty
    private String name;
    @JsonProperty
    private String username;
    @JsonProperty
    private String password;
    @JsonProperty
    private List<Post> posts;

    public Account()
    {

    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }


    public String getPassword() {
        return password;
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
