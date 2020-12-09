package group2.tier2csep3.controllers;

import group2.tier2csep3.model.build.Build;
import group2.tier2csep3.model.forum.comments.Comment;
import group2.tier2csep3.model.forum.posts.Post;
import group2.tier2csep3.model.forum.report.Report;
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

    @PostMapping("/savedPosts?UserId={userId}")
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

    @DeleteMapping("/posts?Id={id}")
    public void deletePost(@PathVariable int id)
    {
        forumService.deletePost(id);
    }

    @PostMapping("/report")
    public void report(@RequestBody Report report)
    {
        forumService.report(report);
    }
}
