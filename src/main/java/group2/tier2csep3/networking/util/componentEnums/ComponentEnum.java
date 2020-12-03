package group2.tier2csep3.networking.util.componentEnums;

import group2.tier2csep3.networking.util.NetworkPackage;
import group2.tier2csep3.networking.util.NetworkType;

public class ComponentEnum extends NetworkPackage {


    public ComponentEnum(NetworkType type, String content) {
        super(type, content);
    }

    public String toString()
    {
        return getType() + ": " + getContent();
    }
}
