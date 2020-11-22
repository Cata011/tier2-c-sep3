package group2.tier2csep3.networking.util;

public class LoginEnum extends NetworkPackage {


    public LoginEnum(NetworkType type, Object content) {
        super(type, content);
    }

    public String toString()
    {
        return getType() + ": " + getContent();
    }
}
