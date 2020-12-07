package group2.tier2csep3.service.componentService;

import group2.tier2csep3.model.component.Component;
import group2.tier2csep3.networking.componentNetworking.Client_Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComponentServiceImpl implements ComponentService {

    private Client_Component client_component;

    public ComponentServiceImpl(Client_Component client_component)
    {
        this.client_component = client_component;
    }

    @Override
    public List<Component> getAllComponents() {
        return client_component.getAllComponents();
    }

    @Override
    public void addNewComponent(Component component) {
        client_component.addNewComponent(component);
    }

}
