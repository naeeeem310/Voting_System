package com.naeem.votingsystem;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.gson.Gson;

import java.util.List;

public class VotingAdapter extends RecyclerView.Adapter<VotingViewHolder> {

    Context context;
    List<Voting> data;

    public VotingAdapter(Context context, List<Voting> data) {
        this.context = context;
        this.data = data;
    }

    @NonNull
    @Override
    public VotingViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.voting_article,parent,false);
        return new VotingViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull VotingViewHolder holder, int position) {

        Voting voting=data.get(position);
        holder.designation.setText(voting.getDesignation());
        holder.name.setText(voting.getName());
        holder.image.setImageResource(voting.getImage());
        holder.post.setOnClickListener(v -> {
            Intent intent=new Intent(context,VotingDetailsActivity.class);
            intent.putExtra("data",new Gson().toJson(voting));
            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}
