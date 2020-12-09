package group2.tier2csep3.networking.buildNetworking;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import group2.tier2csep3.model.build.Build;
import group2.tier2csep3.model.rating.RatingBuild;
import group2.tier2csep3.networking.communcation.SocketClient;
import group2.tier2csep3.networking.util.NetworkPackage;
import group2.tier2csep3.networking.util.NetworkType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Client_BuildImpl implements Client_Build {

    @Autowired
    private SocketClient client;

    @Override
    public List<Build> getMyBuilds(int userId) {
        Gson gson = new Gson();
        NetworkPackage networkPackage = new NetworkPackage(NetworkType.BUILDS, String.valueOf(userId));
        String input = client.communicate(networkPackage);
        System.out.println(input);
        return gson.fromJson(input, new TypeToken<List<Build>>() {
        }.getType());
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

    @Override
    public void giveRating(RatingBuild ratingBuild) {
        Gson gson = new Gson();
        String serializedRating = gson.toJson(ratingBuild);
        NetworkPackage networkPackage = new NetworkPackage(NetworkType.RATINGBUILDS, serializedRating);
        client.communicate(networkPackage);
    }
}
