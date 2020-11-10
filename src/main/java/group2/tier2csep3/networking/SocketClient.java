package group2.tier2csep3.networking;

import group2.tier2csep3.model.Component;
import group2.tier2csep3.model.ComponentList;

import java.util.ArrayList;

public interface SocketClient {
    ComponentList getAllComponents();
    void startClient();
    void disconnect();

}
