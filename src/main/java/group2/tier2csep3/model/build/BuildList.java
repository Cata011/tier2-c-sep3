package group2.tier2csep3.model.build;

import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.ArrayList;

@Component
public class BuildList implements Serializable {

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
        return "BuildListtttttttttttttttttttttttttttt{" +
                "Builds=" + Builds +
                '}';
    }

    public int size()
    {
        return Builds.size();
    }
}
