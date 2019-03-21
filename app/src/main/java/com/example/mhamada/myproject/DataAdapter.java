package com.example.mhamada.myproject;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;
import java.util.zip.Inflater;

/**
 * Created by M.Hamada on 20/03/2019.
 */

public class DataAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    Context context;
    List<Datamodel> products;
    int viewType;
    public static final int MSG_TYPE_one=0;
    public static final int MSG_TYPE_two=1;
    public static final int MSG_TYPE_three=2;
    DataAdapter(Context context, List<Datamodel> products) {
        this.context = context;
        this.products = products;
    }
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if (viewType==MSG_TYPE_one) {

            ViewHolder0 viewHolder0 = new ViewHolder0(LayoutInflater.from(context).inflate(R.layout.data_item, parent, false));
            return viewHolder0;
        }else if(viewType==MSG_TYPE_two){

            ViewHolder2 viewHolder2 = new ViewHolder2(LayoutInflater.from(context).inflate(R.layout.data_item2, parent, false));
            return viewHolder2;
        }else
     return  new ViewHolder1(LayoutInflater.from(context).inflate(R.layout.data_item3, parent, false));

    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        if (holder.getItemViewType()==MSG_TYPE_one) {

            ViewHolder0 viewHolder0 = (ViewHolder0) holder;
            viewHolder0.txt.setText(products.get(position).getName());
            viewHolder0.imageView.setImageResource(products.get(position).getImage());
            holder.getItemViewType();
        }else if(holder.getItemViewType()==MSG_TYPE_two){

                ViewHolder2 viewHolder2 = (ViewHolder2)holder;
                viewHolder2.txt2.setText(products.get(position).getName());
                viewHolder2.imageView2.setImageResource(products.get(position).getImage());


        }else  {
            ViewHolder1 viewHolder1 = (ViewHolder1)holder;
            viewHolder1.txt3.setText(products.get(position).getName());
            viewHolder1.imageView3.setImageResource(products.get(position).getImage());

        }
    }



    @Override
    public int getItemCount() {
        return products.size();
    }



    class ViewHolder0 extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView txt;
        public ViewHolder0(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.img);
            txt = itemView.findViewById(R.id.txt);
        }
    }

    class ViewHolder1 extends RecyclerView.ViewHolder {
        ImageView imageView3;
        TextView txt3;
        public ViewHolder1(View itemView) {
            super(itemView);
            imageView3 = itemView.findViewById(R.id.img3);
            txt3 = itemView.findViewById(R.id.txt3);
        }
    }
    class ViewHolder2 extends RecyclerView.ViewHolder {
        ImageView imageView2;
        TextView txt2;
        public ViewHolder2(View itemView) {
            super(itemView);
            imageView2 = itemView.findViewById(R.id.img2);
            txt2 = itemView.findViewById(R.id.txt2);
        }
    }

    @Override
    public int getItemViewType(int position) {
          if(products.get(position).getViewtype()==MSG_TYPE_one){
              return MSG_TYPE_one;
          }else if(products.get(position).getViewtype()==MSG_TYPE_two){

              return MSG_TYPE_two;
          }else
              return MSG_TYPE_three;
    }
}