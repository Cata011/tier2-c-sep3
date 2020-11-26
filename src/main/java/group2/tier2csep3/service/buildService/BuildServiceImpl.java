package group2.tier2csep3.service.buildService;

import group2.tier2csep3.model.build.BuildList;
import group2.tier2csep3.networking.buildNetworking.Client_Build;
import org.springframework.stereotype.Service;

@Service
public class BuildServiceImpl implements BuildService {

    private Client_Build client_build;

    public BuildServiceImpl(Client_Build client_build)
    {

        this.client_build = client_build;
    }

    @Override
    public BuildList getMyBuilds(int userId) {

//        System.out.println("BuildService: " + client_build.getMyBuilds(userId));

//        System.out.println("Service - 2");
        return client_build.getMyBuilds(userId);
    }
}
