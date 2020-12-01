package group2.tier2csep3.networking.util;

import com.fasterxml.jackson.annotation.JsonProperty;

public class NetworkPackage {

    @JsonProperty("type")
    private NetworkType type;
    @JsonProperty("content")
    private String content;

    public NetworkPackage(NetworkType type, String content) {
        this.type = type;
        this.content = content;
    }

    public NetworkType getType() {
        return type;
    }

    public String getContent() {
        return content;
    }

    @Override
    public String toString() {
        return "NetworkPackage{" +
                "type=" + type +
                ", content=" + content +
                '}';
    }
}
