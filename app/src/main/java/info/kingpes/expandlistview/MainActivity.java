package info.kingpes.expandlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //THE EXPANDABLE
        ExpandableListView elv=(ExpandableListView) findViewById(R.id.expandableListView1);
        final ArrayList<Team> team=getData();
        //CREATE AND BIND TO ADAPTER
        CustomAdapter adapter=new CustomAdapter(this, team);
        elv.setAdapter(adapter);
        //SET ONCLICK LISTENER
        elv.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView parent, View v, int groupPos,
                                        int childPos, long id) {
                Toast.makeText(getApplicationContext(), team.get(groupPos).players.get(childPos).getAge(), Toast.LENGTH_SHORT).show();
                return false;
            }
        });
    }
    //ADD AND GET DATA
    private ArrayList<Team> getData()
    {
        Team t1=new Team("Man Utd", "-->MU");
        t1.players.add(new Member("Wayne Rooney", "20"));
        t1.players.add(new Member("Van Persie","8"));
        t1.players.add(new Member("Ander Herera","12"));
        t1.players.add(new Member("Juan Mata","32"));

        Team t2=new Team("Arsenal","-->ARS");
        t2.players.add(new Member("Aaron Ramsey","100"));
        t2.players.add(new Member("Mesut Ozil","1"));
        t2.players.add(new Member("Jack Wilshere","4"));
        t2.players.add(new Member("Alexis Sanchez","31"));

        Team t3=new Team("Chelsea", "-->CLS");
        t3.players.add(new Member("John Terry","10"));
        t3.players.add(new Member("Eden Hazard","4"));
        t3.players.add(new Member("Diego Costa","5"));
        t3.players.add(new Member("Oscar","6"));

        ArrayList<Team> allTeams=new ArrayList<Team>();
        allTeams.add(t1);
        allTeams.add(t2);
        allTeams.add(t3);
        return allTeams;
    }
}
