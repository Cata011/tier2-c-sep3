package group2.tier2csep3.service.buildService;

import group2.tier2csep3.model.build.Build;
import group2.tier2csep3.model.build.BuildList;

public interface BuildService {
    BuildList getMyBuilds(int userId);

//    void addBuild(Build build);
//
//    void editBuild(Build build);
//
//    void deleteBuild(int id);
}
