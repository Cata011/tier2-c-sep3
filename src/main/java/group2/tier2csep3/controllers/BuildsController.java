package group2.tier2csep3.controllers;

import group2.tier2csep3.model.build.BuildList;
import group2.tier2csep3.service.buildService.BuildService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BuildsController {

    @Autowired
    BuildService buildService;

    @GetMapping("/builds/{userId}")
    public BuildList getMyBuilds(@PathVariable int userId)
    {
        return buildService.getMyBuilds(userId);
    }

}
