package group2.tier2csep3.service.forumService;

import group2.tier2csep3.model.forum.posts.Post;
import group2.tier2csep3.networking.forumNetworking.Client_Forum;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ForumServiceImpl implements ForumService {

    private Client_Forum client_forum;

    public ForumServiceImpl(Client_Forum client_forum)
    {
        this.client_forum = client_forum;
    }


    @Override
    public List<Post> getAllPosts() {
        return client_forum.getAllPosts();
    }

    @Override
    public void addPost(Post post) {
        client_forum.addPost(post);
    }
}
