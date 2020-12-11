package group2.tier2csep3.service.forumService;

import group2.tier2csep3.model.forum.comments.Comment;
import group2.tier2csep3.model.forum.posts.Post;
import group2.tier2csep3.model.forum.report.Report;
import group2.tier2csep3.model.rating.RatingBuild;
import group2.tier2csep3.model.rating.RatingComponent;
import group2.tier2csep3.model.rating.RatingPost;
import group2.tier2csep3.networking.forumNetworking.Client_Forum;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ForumServiceImpl implements ForumService {

    private Client_Forum client_forum;

    public ForumServiceImpl(Client_Forum client_forum) {
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

    @Override
    public void giveRating(RatingPost ratingPost) {
        client_forum.giveRating(ratingPost);
    }

    @Override
    public void addComment(Comment comment) {
        client_forum.addComment(comment);
    }

    @Override
    public void savePost(Post post, int id) {
        client_forum.savePost(post, id);
    }

    @Override
    public void deletePost(int id) {
        client_forum.deletePost(id);
    }

    @Override
    public void report(Report report) {
        client_forum.report(report);
    }

    @Override
    public List<Report> getAllReports() {
        return client_forum.getAllReports();
    }

    @Override
    public void deleteReport(int id) {
        client_forum.deleteReport(id);
    }

    @Override
    public List<RatingPost> getAllPostRatings(int id) {
        return client_forum.getAllPostRatings(id);
    }

    @Override
    public void editPost(Post post) {
        client_forum.editPost(post);
    }

    @Override
    public List<Post> getPostsByUserId(int userId) {
        return client_forum.getPostByUserId(userId);
    }

    @Override
    public List<Post> getSavedPosts(int userId) {
        return client_forum.getSavedPosts(userId);
    }

}
