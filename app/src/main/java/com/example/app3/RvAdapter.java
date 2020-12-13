package com.example.app3;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RvAdapter extends RecyclerView.Adapter<RvAdapter.RvViewHolder> {
    private List<RvData> list;
    public RvAdapter(List<RvData> list){
        this.list=list;
    }



    @NonNull
    @Override
    public RvViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item,parent,false);
         RvViewHolder holder=new RvViewHolder(view);
         holder.textView3.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 int position=holder.getAdapterPosition();
                 RvData rvData=list.get(position);
                 Toast.makeText(v.getContext(),rvData.getLink(),Toast.LENGTH_SHORT).show();
                 Intent intent=new Intent(v.getContext(),MainActivity2.class);
                 intent.putExtra("extra_data",rvData.getLink());
                 v.getContext().startActivity(intent);
             }
         });
         return holder;


    }

    @Override
    public void onBindViewHolder(@NonNull RvViewHolder holder, int position) {
        RvData rvData=list.get(position);
        holder.textView1.setText(rvData.getTitle());
        holder.textView2.setText(rvData.getUserId());
        holder.textView3.setText(rvData.getLink());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class RvViewHolder extends RecyclerView.ViewHolder {
        public TextView textView1;
        public TextView textView2;
        public TextView textView3;
        public RvViewHolder(@NonNull View itemView) {
            super(itemView);
            textView1=itemView.findViewById(R.id.title);
            textView2=itemView.findViewById(R.id.userId);
            textView3=itemView.findViewById(R.id.link);

        }
    }

}
