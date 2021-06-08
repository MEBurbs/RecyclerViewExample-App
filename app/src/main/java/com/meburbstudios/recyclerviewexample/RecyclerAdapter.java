package com.meburbstudios.recyclerviewexample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
/*
This class represents the card_design.xml components. So we have to define all of those components.
 */
public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.FlagViewHolder>{

    private ArrayList<String> flagNameList = new ArrayList<>();
    private ArrayList<String>flagDescList = new ArrayList<>();
    private ArrayList<Integer>imageList = new ArrayList<>();

    private Context context;

    public RecyclerAdapter(ArrayList<String> flagNameList, ArrayList<String> flagDescList, ArrayList<Integer> imageList, Context context) {
        this.flagNameList = flagNameList;
        this.flagDescList = flagDescList;
        this.imageList = imageList;
        this.context = context;
    }

    @NonNull
    @Override
    public FlagViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_design, parent, false);
        return null;
    }

    //Where we show the data UI element
    @Override
    public void onBindViewHolder(@NonNull RecyclerAdapter.FlagViewHolder holder, int position) {

        //use the holder to call the items we described in this class.
        holder.tvFlagName.setText(flagNameList.get(position));
        holder.tvFlagDesc.setText(flagDescList.get(position));
        holder.ivFlag.setImageResource(imageList.get(position));


    }

    //You don't know how big your items might be, so you always get the size from the source
    @Override
    public int getItemCount() {
        return flagNameList.size();
    }

    public class FlagViewHolder extends RecyclerView.ViewHolder{

        private TextView tvFlagName, tvFlagDesc;
        private ImageView ivFlag;

        public FlagViewHolder(@NonNull  View itemView) {
            super(itemView);

            tvFlagName = itemView.findViewById(R.id.textViewFlagName);
            tvFlagDesc = itemView.findViewById(R.id.textViewFlagDesc);
            ivFlag = itemView.findViewById(R.id.imageViewFlag);
        }
    }
}
