package group2.tier2csep3.controllers;

import group2.tier2csep3.model.build.Build;
import group2.tier2csep3.model.forum.comments.Comment;
import group2.tier2csep3.model.forum.posts.Post;
import group2.tier2csep3.model.forum.report.Report;
import group2.tier2csep3.model.rating.RatingBuild;
import group2.tier2csep3.model.rating.RatingComponent;
import group2.tier2csep3.model.rating.RatingPost;
import group2.tier2csep3.service.forumService.ForumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ForumController {
    @Autowired
    ForumService forumService;

    @GetMapping("/posts")
    public List<Post> getAllPosts()
    {
        return forumService.getAllPosts();
    }

    @PostMapping("/posts")
    public void addPost(@RequestBody Post post)
    {
        forumService.addPost(post);
    }

    @PostMapping("/savedPosts/{userId}")
    public void savePost(@RequestBody Post post, @PathVariable int userId)
    {
        forumService.savePost(post, userId);
    }

    @PostMapping("/postComment")
    public void addComment(@RequestBody Comment comment)
    {
        forumService.addComment(comment);
    }

    @PatchMapping("/postRating")
    public void giveRating(@RequestBody RatingPost ratingPost)
    {
        forumService.giveRating(ratingPost);
    }

    @DeleteMapping("/posts/{id}")
    public void deletePost(@PathVariable int id)
    {
        forumService.deletePost(id);
    }

    @PostMapping("/report")
    public void report(@RequestBody Report report)
    {
        forumService.report(report);
    }

    @GetMapping("/reports")
    public List<Report> getAllReports()
    {
        return forumService.getAllReports();
    }

    @DeleteMapping("/reports/{id}")
    public void deleteReport(@PathVariable int id)
    {
        forumService.deleteReport(id);
    }

    @GetMapping("/postRating/{id}")
    public List<RatingPost> getAllPostRatings(@PathVariable int id)
    {
        return forumService.getAllPostRatings(id);
    }

    @GetMapping("/buildRating/{id}")
    public List<RatingBuild> getAllBuildRatings(@PathVariable int id)
    {
        return forumService.getAllBuildRatings(id);
    }

    @GetMapping("/componentRating/{id}")
    public List<RatingComponent> getAllComponentRatings(@PathVariable int id)
    {
        return forumService.getAllComponentRatings(id);
    }
}

