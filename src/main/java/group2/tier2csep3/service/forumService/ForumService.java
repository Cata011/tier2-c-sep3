package group2.tier2csep3.service.forumService;

import group2.tier2csep3.model.forum.posts.Post;

import java.util.List;

public interface ForumService {
    List<Post> getAllPosts();

    void addPost(Post post);
}
