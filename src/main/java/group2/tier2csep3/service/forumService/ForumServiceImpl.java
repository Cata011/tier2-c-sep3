package group2.tier2csep3.service.forumService;

import group2.tier2csep3.model.forum.PostList;
import group2.tier2csep3.networking.forumNetworking.Client_Forum;
import org.springframework.stereotype.Service;

@Service
public class ForumServiceImpl implements ForumService {

    private Client_Forum client_forum;

    public ForumServiceImpl(Client_Forum client_forum)
    {
        this.client_forum = client_forum;
    }


    @Override
    public PostList getAllPosts() {
        return client_forum.getAllPosts();
    }
}
