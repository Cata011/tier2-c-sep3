package group2.tier2csep3.networking.util;

public class RegisterEnum extends NetworkPackage {


    public RegisterEnum(NetworkType type, Object content) {
        super(type, content);
    }

    public String toString()
    {
        return getType() + ": " + getContent();
    }
}
