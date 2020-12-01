package group2.tier2csep3.networking.util;

public class AddNewComponentEnum extends NetworkPackage {
    public AddNewComponentEnum(NetworkType type, String content) {
        super(type, content);
    }

    public String toString()
    {
        return getType() + " " + getContent();
    }
}
