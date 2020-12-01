package group2.tier2csep3.networking.util;

public class EditAccountEnum extends NetworkPackage{
    public EditAccountEnum(NetworkType type, String content) {
        super(type, content);
    }

    public String toString()
    {
        return getType() + " " + getContent();
    }
}
