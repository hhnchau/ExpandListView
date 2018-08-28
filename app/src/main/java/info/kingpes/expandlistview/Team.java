package info.kingpes.expandlistview;

import java.util.ArrayList;

/**
 * Created by Chau Huynh on 4/2/2017.
 */

public class Team {
    //PROPERTIES OF A SINGLE TEAM
    public String Name;
    public String Image;
    public ArrayList<Member> players=new ArrayList<Member>();

    public Team(String Name, String Image)
    {
        this.Name=Name;
        this.Image = Image;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        Image = image;
    }
}
