package group2.tier2csep3.networking.util;

public class ComponentEnum extends NetworkPackage {


    public ComponentEnum(NetworkType type, String content) {
        super(type, content);
    }

    public String toString()
    {
        return getType() + ": " + getContent();
    }
}
