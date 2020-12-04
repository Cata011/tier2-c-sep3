package group2.tier2csep3.networking.buildNetworking;

import group2.tier2csep3.model.build.Build;
import group2.tier2csep3.model.build.BuildList;

public interface Client_Build {
    BuildList getMyBuilds(int userId);

    void addBuild(Build build);

    void editBuild(Build build);

    void deleteBuild(int id);
}
