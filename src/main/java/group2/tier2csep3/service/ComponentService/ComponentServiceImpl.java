package group2.tier2csep3.service.ComponentService;

import group2.tier2csep3.model.Component;
import group2.tier2csep3.model.ComponentList;
import group2.tier2csep3.networking.SocketClient;
import org.springframework.stereotype.Service;

@Service
public class ComponentServiceImpl implements ComponentService {

    private ComponentList componentsList;
    private SocketClient client;

    public ComponentServiceImpl(SocketClient client)
    {
        this.componentsList = new ComponentList();
        this.client = client;
    }

    @Override
    public ComponentList getAllComponents() {
        return client.getAllComponents();
    }

}
