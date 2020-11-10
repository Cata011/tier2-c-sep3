package group2.tier2csep3.networking.util;

public class ComponentEnum extends NetworkPackage {

    public ComponentEnum() {
        super(NetworkType.COMPONENTS);
    }

    public String toString()
    {
        return getType() + "";
    }
}
