package group2.tier2csep3.networking.util;

public class DeleteAccountEnum extends NetworkPackage {
    public DeleteAccountEnum(NetworkType type, String content) {
        super(type, content);
    }

    public String toString()
    {
        return getType() + " " + getContent();
    }
}
