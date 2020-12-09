package group2.tier2csep3.service.componentService;

import group2.tier2csep3.model.component.Component;
import group2.tier2csep3.model.rating.RatingComponent;

import java.util.List;

public interface ComponentService {
    List<Component> getAllComponents();

    void addNewComponent(Component component);

    void giveRating(RatingComponent ratingComponent);
}
