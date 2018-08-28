package info.kingpes.expandlistview;

/**
 * Created by Chau Huynh on 4/2/2017.
 */

public class Member {
    private String Name;
    private String Age;

    public Member(String name, String age) {
        Name = name;
        Age = age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAge() {
        return Age;
    }

    public void setAge(String age) {
        Age = age;
    }
}
