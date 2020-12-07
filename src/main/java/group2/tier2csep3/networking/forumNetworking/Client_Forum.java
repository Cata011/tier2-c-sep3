package group2.tier2csep3.networking.forumNetworking;

import group2.tier2csep3.model.forum.posts.Post;

import java.util.List;

public interface Client_Forum {
    List<Post> getAllPosts();

    void addPost(Post post);
}
