package group2.tier2csep3.service.buildService;

import group2.tier2csep3.model.build.BuildList;

public interface BuildService {
    BuildList getMyBuilds(int userId);
}
