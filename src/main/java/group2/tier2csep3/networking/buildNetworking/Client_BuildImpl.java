package group2.tier2csep3.networking.buildNetworking;

import com.google.gson.Gson;
import group2.tier2csep3.model.build.Build;
import group2.tier2csep3.model.build.BuildList;
import group2.tier2csep3.networking.communcation.SocketClient;
import group2.tier2csep3.networking.util.NetworkPackage;
import group2.tier2csep3.networking.util.NetworkType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Client_BuildImpl implements Client_Build {

    @Autowired
    private SocketClient client;

    @Override
    public BuildList getMyBuilds(int userId) {
        Gson gson = new Gson();
        NetworkPackage networkPackage = new NetworkPackage(NetworkType.BUILDS, String.valueOf(userId));
        String input = client.communicate(networkPackage);
        System.out.println(input);
        return gson.fromJson(input, BuildList.class);
    }

    @Override
    public void addBuild(Build build) {
        Gson gson = new Gson();
        String serializedBuild = gson.toJson(build);
        NetworkPackage networkPackage = new NetworkPackage(NetworkType.ADDBUILD, serializedBuild);
        client.communicate(networkPackage);
    }

    @Override
    public void editBuild(Build build) {
        Gson gson = new Gson();
        String serializedBuild = gson.toJson(build);
        NetworkPackage networkPackage = new NetworkPackage(NetworkType.EDITBUILD, serializedBuild);
        client.communicate(networkPackage);
    }

    @Override
    public void deleteBuild(int id) {
        Gson gson = new Gson();
        NetworkPackage networkPackage = new NetworkPackage(NetworkType.DELETEBUILD, String.valueOf(id));
        client.communicate(networkPackage);
    }
}
