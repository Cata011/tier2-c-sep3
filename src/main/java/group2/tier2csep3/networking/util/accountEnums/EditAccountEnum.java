package group2.tier2csep3.networking.util.accountEnums;

import group2.tier2csep3.networking.util.NetworkPackage;
import group2.tier2csep3.networking.util.NetworkType;

public class EditAccountEnum extends NetworkPackage {
    public EditAccountEnum(NetworkType type, String content) {
        super(type, content);
    }

    public String toString()
    {
        return getType() + " " + getContent();
    }
}
