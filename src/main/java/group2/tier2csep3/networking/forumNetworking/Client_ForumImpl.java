package group2.tier2csep3.networking.forumNetworking;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import group2.tier2csep3.model.forum.comments.Comment;
import group2.tier2csep3.model.forum.posts.Post;
import group2.tier2csep3.model.forum.report.Report;
import group2.tier2csep3.model.rating.RatingBuild;
import group2.tier2csep3.model.rating.RatingComponent;
import group2.tier2csep3.model.rating.RatingPost;
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

    @Override
    public void giveRating(RatingPost ratingPost) {
        Gson gson = new Gson();
        String serializedRating = gson.toJson(ratingPost);
        NetworkPackage networkPackage = new NetworkPackage(NetworkType.RATINGPOSTS, serializedRating);
        client.communicate(networkPackage);
    }

    @Override
    public void addComment(Comment comment) {
        Gson gson = new Gson();
        String serializedComment = gson.toJson(comment);
        NetworkPackage networkPackage = new NetworkPackage(NetworkType.POSTCOMMENT, serializedComment);
        client.communicate(networkPackage);
    }

    @Override
    public void savePost(Post post, int id) {
        Gson gson = new Gson();
        String serializedPost = gson.toJson(post);
        String toSend = serializedPost + "*" + id;
        NetworkPackage networkPackage = new NetworkPackage(NetworkType.SAVEPOST, toSend);
        client.communicate(networkPackage);
    }

    @Override
    public void deletePost(int id) {
        NetworkPackage networkPackage = new NetworkPackage(NetworkType.DELETEPOST, String.valueOf(id));
        client.communicate(networkPackage);
    }

    @Override
    public void report(Report report) {
        Gson gson = new Gson();
        String serializedReport = gson.toJson(report);
        NetworkPackage networkPackage = new NetworkPackage(NetworkType.REPORT, serializedReport);
        client.communicate(networkPackage);
    }

    @Override
    public void deleteReport(int id) {
        NetworkPackage networkPackage = new NetworkPackage(NetworkType.DELETEREPORT, String.valueOf(id));
        client.communicate(networkPackage);
    }

    @Override
    public List<Report> getAllReports() {
        Gson gson = new Gson();
        NetworkPackage networkPackage = new NetworkPackage(NetworkType.REPORTS, null);
        String input = client.communicate(networkPackage);
        return gson.fromJson(input, new TypeToken<List<Report>>(){}.getType());
    }

    @Override
    public List<RatingPost> getAllPostRatings(int id) {
        Gson gson = new Gson();
        NetworkPackage networkPackage = new NetworkPackage(NetworkType.POSTRATINGS,  String.valueOf(id));
        String input = client.communicate(networkPackage);
        return gson.fromJson(input, new TypeToken<List<RatingPost>>(){}.getType());
    }

    @Override
    public List<RatingBuild> getAllBuildRatings(int id) {
        Gson gson = new Gson();
        NetworkPackage networkPackage = new NetworkPackage(NetworkType.BUILDRATINGS,  String.valueOf(id));
        String input = client.communicate(networkPackage);
        return gson.fromJson(input, new TypeToken<List<RatingBuild>>(){}.getType());
    }

    @Override
    public List<RatingComponent> getAllComponentRatings(int id) {
        Gson gson = new Gson();
        NetworkPackage networkPackage = new NetworkPackage(NetworkType.COMPONENTRATINGS,  String.valueOf(id));
        String input = client.communicate(networkPackage);
        return gson.fromJson(input, new TypeToken<List<RatingComponent>>(){}.getType());
    }


}
