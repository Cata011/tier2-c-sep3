package group2.tier2csep3.networking.forumNetworking;

import com.google.gson.Gson;
import group2.tier2csep3.model.forum.PostList;
import group2.tier2csep3.networking.communcation.SocketClient;
import group2.tier2csep3.networking.util.NetworkPackage;
import group2.tier2csep3.networking.util.NetworkType;
import group2.tier2csep3.networking.util.PostsEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Client_ForumImpl implements Client_Forum{

    @Autowired
    private SocketClient client;

    @Override
    public PostList getAllPosts() {
        Gson gson = new Gson();
        NetworkPackage networkPackage = new PostsEnum(NetworkType.POSTS, null);
        String input = client.communicate(networkPackage);
        return gson.fromJson(input, PostList.class);
    }
}
