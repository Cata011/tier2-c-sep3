package group2.tier2csep3.networking.forumNetworking;

import group2.tier2csep3.model.forum.posts.Post;
import group2.tier2csep3.model.forum.posts.PostList;

public interface Client_Forum {
    PostList getAllPosts();

    void addPost(Post post);
}
