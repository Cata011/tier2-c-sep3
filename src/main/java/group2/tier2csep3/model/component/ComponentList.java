package group2.tier2csep3.model.component;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.ArrayList;

public class ComponentList implements Serializable {

    @JsonProperty
    private ArrayList<Component> Components;

    public ComponentList()
    {
        this.Components = new ArrayList<>();
    }

    public Component getComponent(int index)
    {
        return Components.get(index);
    }

    public int size()
    {
        return Components.size();
    }
}
