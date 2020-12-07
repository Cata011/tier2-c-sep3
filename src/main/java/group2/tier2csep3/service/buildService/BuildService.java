package group2.tier2csep3.service.buildService;

import group2.tier2csep3.model.build.Build;

import java.util.List;

public interface BuildService {
    List<Build> getMyBuilds(int userId);

    void addBuild(Build build);

    void editBuild(Build build);

    void deleteBuild(int id);
}
