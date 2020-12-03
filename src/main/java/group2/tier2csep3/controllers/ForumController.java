package group2.tier2csep3.controllers;

import group2.tier2csep3.model.forum.posts.PostList;
import group2.tier2csep3.service.forumService.ForumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ForumController {
    @Autowired
    ForumService forumService;

    @GetMapping("/posts")
    public PostList getAllPosts()
    {
        PostList postList = forumService.getAllPosts();

//        for(int i = 0;i<postList.size();i++)
//        {
//            System.out.println("CEVA" + postList.get(i));
//            System.out.println(postList.getPosts());
//        }

        return postList;
    }

}