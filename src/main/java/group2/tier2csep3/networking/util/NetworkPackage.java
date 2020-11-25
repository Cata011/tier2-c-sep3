package group2.tier2csep3.networking.util;

import com.fasterxml.jackson.annotation.JsonProperty;

public class NetworkPackage {

    @JsonProperty("type")
    private NetworkType type;
    @JsonProperty("content")
    private String content;         //TODO: REMEMEMBER THAT IN TIER 3 YOU HAVE TO HAVE DIFFERENT HANDLERS AND DESERIALIZE THE OBJECT TYPE OBJECT DIRECTLY INTO SOMETHING SPEIFIC. OTHERWISE, LIKE TROELS SAID, MAKE STRING INSTEAD OF OBJECT AND SERIALIZE/DESERIALIZE TWICE

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
