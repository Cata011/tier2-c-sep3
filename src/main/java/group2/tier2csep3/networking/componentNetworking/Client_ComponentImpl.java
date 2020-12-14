package group2.tier2csep3.networking.componentNetworking;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import group2.tier2csep3.model.forum.posts.Post;
import group2.tier2csep3.model.rating.RatingComponent;
import group2.tier2csep3.networking.communcation.SocketClient;
import group2.tier2csep3.networking.util.NetworkPackage;
import group2.tier2csep3.networking.util.NetworkType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Client_ComponentImpl implements Client_Component {

    @Autowired
    private SocketClient client;


    @Override
    public List<group2.tier2csep3.model.component.Component> getAllComponents() {
        Gson gson = new Gson();
        NetworkPackage networkPackage = new NetworkPackage(NetworkType.COMPONENTS, null);
        String input =  client.communicate(networkPackage);

        System.out.println(input);

        return gson.fromJson(input, new TypeToken<List<group2.tier2csep3.model.component.Component>>(){}.getType());
    }

    @Override
    public void addNewComponent(group2.tier2csep3.model.component.Component component) {
        Gson gson = new Gson();
        String componentSerialized = gson.toJson(component);
        NetworkPackage networkPackage = new NetworkPackage(NetworkType.ADDNEWCOMPONENT, componentSerialized);
        client.communicate(networkPackage);

    }

    @Override
    public void giveRating(RatingComponent ratingComponent) {
        Gson gson = new Gson();
        String serializedRating = gson.toJson(ratingComponent);
        NetworkPackage networkPackage = new NetworkPackage(NetworkType.RATINGCOMPONENTS, serializedRating);
        client.communicate(networkPackage);
    }

    @Override
    public List<RatingComponent> getAllComponentsRatings(int id) {
        Gson gson = new Gson();
        NetworkPackage networkPackage = new NetworkPackage(NetworkType.COMPONENTRATINGS,  String.valueOf(id));
        String input = client.communicate(networkPackage);
        return gson.fromJson(input, new TypeToken<List<RatingComponent>>(){}.getType());
    }

    @Override
    public List<group2.tier2csep3.model.component.Component> getFilteredList(String type) {
        Gson gson = new Gson();
        NetworkPackage networkPackage = new NetworkPackage(NetworkType.FILTERLIST, type);
        String input = client.communicate(networkPackage);
        return gson.fromJson(input, new TypeToken<List<group2.tier2csep3.model.component.Component>>(){}.getType());
    }
}
