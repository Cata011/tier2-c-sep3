package group2.tier2csep3.networking.util;

public class PostsEnum extends NetworkPackage{
    public PostsEnum(NetworkType type, String content) {
        super(type, content);
    }

    public String toString()
    {
        return getType() + " " + getContent();
    }
}
