package group2.tier2csep3.model.build;

import com.fasterxml.jackson.annotation.JsonProperty;
import group2.tier2csep3.model.component.ComponentList;
import org.springframework.stereotype.Component;

import java.io.Serializable;


public class Build implements Serializable {
    @JsonProperty
    private int id;
    @JsonProperty
    private int userId;
    @JsonProperty
    private String name;
    @JsonProperty
    private ComponentList componentList;

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
