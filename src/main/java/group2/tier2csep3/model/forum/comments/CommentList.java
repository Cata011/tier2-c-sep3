package group2.tier2csep3.model.forum.comments;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

public class CommentList {

    @JsonProperty
    private ArrayList<Comment> Comments;

    public CommentList()
    {
        this.Comments = new ArrayList<>();
    }

    public ArrayList<Comment> getComments() {
        return Comments;
    }

    public void setComments(ArrayList<Comment> comments) {
        Comments = comments;
    }
}