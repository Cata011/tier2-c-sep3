package group2.tier2csep3.model.component;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

@org.springframework.stereotype.Component
public class Component implements Serializable {
    @JsonProperty("id")
    private int id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("type")
    private String type;
    @JsonProperty("releaseYear")
    private String releaseYear;
    @JsonProperty("brand")
    private String brand;
    @JsonProperty("additionalInformation")
    private String additionalInformation;

    public Component() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(String releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getAdditionalInformation() {
        return additionalInformation;
    }

    public void setAdditionalInformation(String additionalInformation) {
        this.additionalInformation = additionalInformation;
    }

    @Override
    public String toString() {
        return "Component{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", releaseYear=" + releaseYear +
                ", brand='" + brand + '\'' +
                ", additionalInformation='" + additionalInformation + '\'' +
                '}';
    }
}
