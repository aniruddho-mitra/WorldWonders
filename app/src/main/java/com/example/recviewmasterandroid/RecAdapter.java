package com.example.recviewmasterandroid;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

public class RecAdapter extends RecyclerView.Adapter<RecAdapter.ViewHolder>
{
    private ModelClass[] modelClasses;
    public RecAdapter(ModelClass[] modelClasses)
    {
        this.modelClasses=modelClasses;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
        View view=layoutInflater.inflate(R.layout.monuments,parent,false);
        ViewHolder viewHolder=new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final ModelClass listData=modelClasses[position];
        holder.textView.setText(modelClasses[position].getName());
        holder.textView2.setText(modelClasses[position].getLocation());
        holder.imgView.setImageResource(modelClasses[position].getImgId());
    }

    @Override
    public int getItemCount() {
        return modelClasses.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {
        private ImageView imgView;
        private TextView textView;
        private TextView textView2;
        private ConstraintLayout constraintLayout;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imgView=itemView.findViewById(R.id.imageView);
            textView=itemView.findViewById(R.id.name);
            textView2=itemView.findViewById(R.id.location);
            constraintLayout=itemView.findViewById(R.id.consLayout);
        }
    }
}
