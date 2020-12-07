package group2.tier2csep3.networking.communcation;

import group2.tier2csep3.networking.util.NetworkPackage;

public interface SocketClient {

    void startClient();

    String communicate(NetworkPackage networkPackage);

    void disconnect();

}
