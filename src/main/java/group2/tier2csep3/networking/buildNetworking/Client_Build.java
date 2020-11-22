package group2.tier2csep3.networking.buildNetworking;

import group2.tier2csep3.model.build.BuildList;

public interface Client_Build {
    BuildList getMyBuilds(int userId);
}
