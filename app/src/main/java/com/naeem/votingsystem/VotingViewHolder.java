package com.naeem.votingsystem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class VotingViewHolder extends RecyclerView.ViewHolder {
    ImageView image;
    TextView name;
    TextView designation;
    LinearLayout post;
    public VotingViewHolder(@NonNull View itemView) {

        super(itemView);
        image=itemView.findViewById(R.id.image);

        name=itemView.findViewById(R.id.name);

        designation=itemView.findViewById(R.id.designation);

        post=itemView.findViewById(R.id.post);
    }
}
