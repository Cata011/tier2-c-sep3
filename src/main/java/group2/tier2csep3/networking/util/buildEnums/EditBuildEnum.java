package group2.tier2csep3.networking.util.buildEnums;

import group2.tier2csep3.networking.util.NetworkPackage;
import group2.tier2csep3.networking.util.NetworkType;

public class EditBuildEnum extends NetworkPackage {
    public EditBuildEnum(NetworkType type, String content) {
        super(type, content);
    }

    public String toString()
    {
        return getType() + " " + getContent();
    }
}
