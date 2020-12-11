package group2.tier2csep3.service.buildService;

import group2.tier2csep3.model.build.Build;
import group2.tier2csep3.model.rating.RatingBuild;

import java.util.List;

public interface BuildService {
    List<Build> getMyBuilds(int userId);

    void addBuild(Build build);

    void editBuild(Build build);

    void deleteBuild(int id);

    void giveRating(RatingBuild ratingBuild);

    List<RatingBuild> getAllBuildRatings(int id);
}
