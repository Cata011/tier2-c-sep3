package group2.tier2csep3.controllers;

import group2.tier2csep3.model.build.Build;
import group2.tier2csep3.model.build.BuildList;
import group2.tier2csep3.service.buildService.BuildService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BuildsController {

    @Autowired
    BuildService buildService;

    @GetMapping("/builds")
    public
    BuildList getMyBuilds(@RequestParam("UserId") int userId)
    {
        System.out.println("USER: " + userId);
//        System.out.println("Controller " + buildService.getMyBuilds(userId));

//        System.out.println("Controller - 3");
//        BuildList list = buildService.getMyBuilds(userId);
//        System.out.println("Controller final                        :"  );
//        for (int i = 0 ;i<list.size();i++)
//        {
//            System.out.println(list.getBuild(i));
//        }

//        List<Build> d = new ArrayList<>();
//        d.add(list.getBuild(0));
        return buildService.getMyBuilds(userId);
    }

}
