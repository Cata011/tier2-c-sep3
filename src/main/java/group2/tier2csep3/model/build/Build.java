package group2.tier2csep3.model.build;

import com.fasterxml.jackson.annotation.JsonProperty;
import group2.tier2csep3.model.component.Component;

import java.util.List;


public class Build {
    @JsonProperty
    private int id;
    @JsonProperty
    private int userId;
    @JsonProperty
    private String name;
    @JsonProperty
    private List<Component> componentList;

    public Build()
    {

    }

    @Override
    public String toString() {
        return "Build{" +
                "id=" + id +
                ", userId=" + userId +
                ", name='" + name + '\'' +
                ", componentList=" + componentList +
                '}';
    }
}
