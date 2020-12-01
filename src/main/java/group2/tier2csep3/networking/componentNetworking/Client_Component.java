package group2.tier2csep3.networking.componentNetworking;

import group2.tier2csep3.model.component.Component;
import group2.tier2csep3.model.component.ComponentList;

public interface Client_Component {
    ComponentList getAllComponents();

    void addNewComponent(Component component);
}
