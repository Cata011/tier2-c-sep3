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
        return buildService.getMyBuilds(userId);
    }

}
