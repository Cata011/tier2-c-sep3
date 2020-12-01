package group2.tier2csep3.networking.buildNetworking;

import com.google.gson.Gson;
import group2.tier2csep3.model.build.BuildList;
import group2.tier2csep3.networking.communcation.SocketClient;
import group2.tier2csep3.networking.util.BuildEnum;
import group2.tier2csep3.networking.util.NetworkPackage;
import group2.tier2csep3.networking.util.NetworkType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Client_BuildImpl implements Client_Build {

    @Autowired
    private SocketClient client; //TODO: or use normal dependency
    @Override
    public BuildList getMyBuilds(int userId) {
        Gson gson = new Gson();
        NetworkPackage networkPackage = new BuildEnum(NetworkType.BUILDS, String.valueOf(userId));
        String input = client.communicate(networkPackage);
        System.out.println(input);
        return gson.fromJson(input, BuildList.class);
    }
}
