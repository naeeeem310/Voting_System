package com.naeem.votingsystem;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    VotingAdapter adapter;
    List<Voting> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setTitle("Online Voting Blogs");
        }

        recyclerView = findViewById(R.id.recyclerView);
        data = getVotingData();
        adapter = new VotingAdapter(this, data);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private List<Voting> getVotingData() {
        List<Voting> votings = new ArrayList<>();

        Voting voting1 = new Voting(
                "Naeem",
                "DGK",
                "MNA",
                R.drawable.image3
        );
        votings.add(voting1);

        Voting voting2 = new Voting(
                "Ziafat",
                "Arifwala",
                "MNA",
                R.drawable.image1
        );
        votings.add(voting2);

        Voting voting3 = new Voting(
                "Ammr",
                "haroonabad",
                "MNA",
                R.drawable.image3
        );
        votings.add(voting3);

 Voting voting4 = new Voting(
         "Farhan",
         "DGK",
         "MNA",
                R.drawable.image2
        );
        votings.add(voting4);
 Voting voting5 = new Voting(
         "Naeem",
         "DGK",
         "MNA",
                R.drawable.image3
        );
        votings.add(voting5);
        Voting voting6 = new Voting(
                "Naeem",
                "DGK",
                "MNA",
                R.drawable.image3
        );
        votings.add(voting6
        );Voting voting7 = new Voting(
                "Naeem",
                "DGK",
                "MNA",
                R.drawable.image3
        );
        votings.add(voting5);
        Voting voting8 = new Voting(
                "Naeem",
                "DGK",
                "MNA",
                R.drawable.image3
        );
        votings.add(voting8);

        // Add more voting objects here if needed

        return votings;
    }
}
