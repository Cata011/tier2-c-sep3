package group2.tier2csep3.networking.forumNetworking;

import com.google.gson.Gson;
import group2.tier2csep3.model.forum.posts.Post;
import group2.tier2csep3.model.forum.posts.PostList;
import group2.tier2csep3.networking.communcation.SocketClient;
import group2.tier2csep3.networking.util.NetworkPackage;
import group2.tier2csep3.networking.util.NetworkType;
import group2.tier2csep3.networking.util.forumEnums.AddPostEnum;
import group2.tier2csep3.networking.util.forumEnums.PostsEnum;
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

        System.out.println("INPUT in forumimpl" + input);

        return gson.fromJson(input, PostList.class);
    }

    @Override
    public void addPost(Post post) {
        Gson gson = new Gson();
        String serializedPost = gson.toJson(post);

        System.out.println("FORUMIMPL" + serializedPost);

        NetworkPackage networkPackage = new AddPostEnum(NetworkType.ADDPOST, serializedPost);
        client.communicate(networkPackage);
    }
}
