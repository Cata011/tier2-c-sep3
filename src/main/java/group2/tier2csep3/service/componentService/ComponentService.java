package group2.tier2csep3.service.componentService;

import group2.tier2csep3.model.component.Component;
import group2.tier2csep3.model.component.ComponentList;

public interface ComponentService
{
    ComponentList getAllComponents();

    void addNewComponent(Component component);
}
