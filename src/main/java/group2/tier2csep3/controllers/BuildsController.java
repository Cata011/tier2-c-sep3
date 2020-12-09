package group2.tier2csep3.controllers;

import group2.tier2csep3.model.build.Build;
import group2.tier2csep3.model.rating.RatingBuild;
import group2.tier2csep3.service.buildService.BuildService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BuildsController {

    @Autowired
    BuildService buildService;

    @GetMapping("/builds")
    public List<Build> getMyBuilds(@RequestParam("UserId") int userId)
    {
        return buildService.getMyBuilds(userId);
    }

    @PostMapping("/builds")
    public void addBuild(@RequestBody Build build)
    {
        buildService.addBuild(build);
    }

    @PatchMapping("/builds")
    public void editBuild(@RequestBody Build build)
    {
        buildService.editBuild(build);
    }

    @DeleteMapping("/builds/{id}")
    public void deleteBuild(@PathVariable int id)
    {
        buildService.deleteBuild(id);
    }

    @PatchMapping("/buildRating")
    public void giveRating(@RequestBody RatingBuild ratingBuild)
    {
        buildService.giveRating(ratingBuild);
    }
}
