package com.naeem.votingsystem;

import android.annotation.SuppressLint;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.ActionBar;

import com.google.gson.Gson;

public class VotingDetailsActivity extends AppCompatActivity {
    TextView name;

    TextView designation;
    TextView details;
    ImageView image;
    Voting voting;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_voting_details);

        ActionBar actionBar = getSupportActionBar();


            actionBar.setTitle("Voting Details");



        name = findViewById(R.id.name);
        designation = findViewById(R.id.designation);
        details = findViewById(R.id.details);
        image = findViewById(R.id.image);

        voting = new Gson().fromJson(getIntent().getStringExtra("data"), Voting.class);

        name.setText(voting.getName());
        designation.setText(voting.getDesignation());
        details.setText(voting.getDescription());
        image.setImageResource(voting.getImage());

        name.setPaintFlags(Paint.UNDERLINE_TEXT_FLAG);
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }

}
