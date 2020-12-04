package group2.tier2csep3.service.forumService;

import group2.tier2csep3.model.forum.posts.Post;
import group2.tier2csep3.model.forum.posts.PostList;

public interface ForumService {
    PostList getAllPosts();

    void addPost(Post post);
}
