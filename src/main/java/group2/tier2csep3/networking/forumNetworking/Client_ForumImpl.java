package group2.tier2csep3.networking.forumNetworking;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import group2.tier2csep3.model.forum.posts.Post;
import group2.tier2csep3.networking.communcation.SocketClient;
import group2.tier2csep3.networking.util.NetworkPackage;
import group2.tier2csep3.networking.util.NetworkType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Client_ForumImpl implements Client_Forum{

    @Autowired
    private SocketClient client;

    @Override
    public List<Post> getAllPosts() {
        Gson gson = new Gson();
        NetworkPackage networkPackage = new NetworkPackage(NetworkType.POSTS, null);
        String input = client.communicate(networkPackage);
        return gson.fromJson(input, new TypeToken<List<Post>>(){}.getType());
    }

    @Override
    public void addPost(Post post) {
        Gson gson = new Gson();
        String serializedPost = gson.toJson(post);
        NetworkPackage networkPackage = new NetworkPackage(NetworkType.ADDPOST, serializedPost);
        client.communicate(networkPackage);
    }
}
