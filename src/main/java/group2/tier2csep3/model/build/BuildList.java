package group2.tier2csep3.model.build;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.ArrayList;

@Component
public class BuildList implements Serializable {

    @JsonProperty
    private ArrayList<Build> Builds;

    public BuildList()
    {
        this.Builds = new ArrayList<>();
    }

    public Build getBuild(int index)
    {
        return Builds.get(index);
    }

    public int getUserId()
    {
        if(Builds != null)
        {
            return Builds.get(0).getUserId();
        }
        return -1;
    }

    @Override
    public String toString() {
        return "BuildList{" +
                "Builds=" + Builds +
                '}';
    }

    public int size()
    {
        return Builds.size();
    }
}
