package group2.tier2csep3.controllers;

import group2.tier2csep3.model.build.BuildList;
import group2.tier2csep3.service.buildService.BuildService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BuildsController {

    @Autowired
    BuildService buildService;

    @GetMapping("/builds?userId={userId}")
    public BuildList getMyBuilds(@PathVariable int userId)
    {
        System.out.println("USER: " + userId);
//        System.out.println("Controller " + buildService.getMyBuilds(userId));

//        System.out.println("Controller - 3");
        BuildList list = buildService.getMyBuilds(userId);
        System.out.println("Controller final                        :"  );
        for (int i = 0 ;i<list.size();i++)
        {
            System.out.println(list.getBuild(i));
        }
        return list;
    }

}
