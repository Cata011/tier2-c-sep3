package group2.tier2csep3.model.component;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.ArrayList;

public class ComponentList {

    @JsonProperty
    private ArrayList<Component> components;

    public ComponentList()
    {
        this.components = new ArrayList<>();
    }

}
