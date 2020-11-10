package group2.tier2csep3.networking.util;

public class NetworkPackage {
    private NetworkType type;

    public NetworkPackage(NetworkType type)
    {
        this.type = type;
    }

    public NetworkType getType()
    {
        return type;
    }
}
