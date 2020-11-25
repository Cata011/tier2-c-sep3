package group2.tier2csep3.networking.util;

public class BuildEnum extends NetworkPackage{


    public BuildEnum(NetworkType type, String content) {
        super(type, content);
    }

    public String toString()
    {
        return getType() + ": " + getContent();
    }
}
