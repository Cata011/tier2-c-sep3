package group2.tier2csep3.networking.componentNetworking;

import com.google.gson.Gson;
import group2.tier2csep3.model.component.ComponentList;
import group2.tier2csep3.networking.communcation.SocketClient;
import group2.tier2csep3.networking.util.ComponentEnum;
import group2.tier2csep3.networking.util.NetworkPackage;
import group2.tier2csep3.networking.util.NetworkType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Client_ComponentImpl implements Client_Component {

    @Autowired
    private SocketClient client; //TODO: or use normal dependency


    @Override
    public ComponentList getAllComponents() {
        Gson gson = new Gson();
        NetworkPackage networkPackage = new ComponentEnum(NetworkType.COMPONENTS, null);
        String input =  client.communicate(networkPackage);
        return gson.fromJson(input, ComponentList.class);
    }
}
