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
    private ComponentList ComponentList;

    public Build()
    {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ComponentList getComponentList() {
        return ComponentList;
    }

    public void setComponentList(ComponentList componentList) {
        this.ComponentList = componentList;
    }

    @Override
    public String toString() {
        return "Build{" +
                "id=" + id +
                ", userId=" + userId +
                ", name='" + name + '\'' +
                ", componentList=" + ComponentList +
                '}';
    }
}
