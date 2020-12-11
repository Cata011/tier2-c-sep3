package group2.tier2csep3.networking.componentNetworking;

import group2.tier2csep3.model.component.Component;
import group2.tier2csep3.model.rating.RatingComponent;

import java.util.List;

public interface Client_Component {
    List<Component> getAllComponents();

    void addNewComponent(Component component);

    void giveRating(RatingComponent ratingComponent);

    List<RatingComponent> getAllComponentsRatings(int id);

    List<Component> getFilteredList(String type);
}
