package com.group_2_BSIT_3D_NS.pinasarap;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ExampleAdapterDesserts extends RecyclerView.Adapter<ExampleAdapterDesserts.ExampleViewHolder> {

    private ArrayList <ExampleItem> mExampleList;
    private OnItemClickListener mListener;

    public interface OnItemClickListener {

        void onItemClick (int position);

    }


    public void setOnItemClickListener (OnItemClickListener listener){

        mListener=listener;
    }

    public static class ExampleViewHolder extends RecyclerView.ViewHolder {

        public ImageView mImageView;
        public TextView mText;

        public ExampleViewHolder(View itemView, OnItemClickListener listener) {
            super (itemView);
            mImageView=itemView.findViewById(R.id.desserts_img);
            mText=itemView.findViewById(R.id.desserts_desc);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if (listener!=null) {
                        int position = getAdapterPosition();

                        if (position != RecyclerView.NO_POSITION) {
                            listener.onItemClick(position);

                        }

                    }

                }
            });
        }
    }


    public ExampleAdapterDesserts(ArrayList<ExampleItem> exampleList) {

        mExampleList=exampleList;


    }

    @Override
    public ExampleViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.recycleitemdesserts,parent, false);
        ExampleViewHolder evh= new ExampleViewHolder(v, mListener);

        return evh;
    }

    @Override
    public void onBindViewHolder( ExampleViewHolder holder, int position) {
        ExampleItem currentItem = mExampleList.get(position);

        holder.mImageView.setImageResource(currentItem.getImg_resource());
        holder.mText.setText(currentItem.getText());
    }

    @Override
    public int getItemCount() {

        return mExampleList.size();
    }

    public void filterList (ArrayList<ExampleItem> filteredList) {
        mExampleList=filteredList;
        notifyDataSetChanged();

    }


}
