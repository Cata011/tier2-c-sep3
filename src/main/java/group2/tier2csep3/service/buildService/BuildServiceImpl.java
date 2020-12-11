package group2.tier2csep3.service.buildService;

import group2.tier2csep3.model.build.Build;
import group2.tier2csep3.model.rating.RatingBuild;
import group2.tier2csep3.networking.buildNetworking.Client_Build;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BuildServiceImpl implements BuildService {

    private Client_Build client_build;

    public BuildServiceImpl(Client_Build client_build)
    {
        this.client_build = client_build;
    }

    @Override
    public List<Build> getMyBuilds(int userId) {
        return client_build.getMyBuilds(userId);
    }

    @Override
    public void addBuild(Build build) {
        client_build.addBuild(build);
    }

    @Override
    public void editBuild(Build build) {
        client_build.editBuild(build);
    }

    @Override
    public void deleteBuild(int id) {
        client_build.deleteBuild(id);
    }

    @Override
    public void giveRating(RatingBuild ratingBuild) {
        client_build.giveRating(ratingBuild);
    }

    @Override
    public List<RatingBuild> getAllBuildRatings(int id) {
        return client_build.getAllBuildRatings(id);
    }
}
