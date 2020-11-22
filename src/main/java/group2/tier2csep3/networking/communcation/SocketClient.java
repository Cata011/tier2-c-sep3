package group2.tier2csep3.networking.communcation;

import group2.tier2csep3.model.account.Account;
import group2.tier2csep3.model.build.BuildList;
import group2.tier2csep3.model.component.ComponentList;
import group2.tier2csep3.networking.util.NetworkPackage;

public interface SocketClient {

    void startClient();

    String communicate(NetworkPackage networkPackage);

    void disconnect();

}
