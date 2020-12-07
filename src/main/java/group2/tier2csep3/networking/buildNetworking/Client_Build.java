package group2.tier2csep3.networking.buildNetworking;

import group2.tier2csep3.model.build.Build;

import java.util.List;

public interface Client_Build {
    List<Build> getMyBuilds(int userId);

    void addBuild(Build build);

    void editBuild(Build build);

    void deleteBuild(int id);
}
