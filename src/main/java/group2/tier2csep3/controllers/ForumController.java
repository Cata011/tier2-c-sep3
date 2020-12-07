package group2.tier2csep3.controllers;

import group2.tier2csep3.model.build.Build;
import group2.tier2csep3.model.forum.posts.Post;
import group2.tier2csep3.service.forumService.ForumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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
        System.out.println(post);
        forumService.addPost(post);
    }
}
