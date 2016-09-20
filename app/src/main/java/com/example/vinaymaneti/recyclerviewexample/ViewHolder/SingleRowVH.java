package com.example.vinaymaneti.recyclerviewexample.ViewHolder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.vinaymaneti.recyclerviewexample.R;

/**
 * Created by vinaymaneti on 6/15/16.
 */
public class SingleRowVH extends RecyclerView.ViewHolder {

    public ImageView imageView;
    public TextView textViewLarge;
    public TextView textViewSmall;

    public SingleRowVH(final View itemView) {
        super(itemView);
        imageView = (ImageView) itemView.findViewById(R.id.imageViewRecyclerView);
        textViewLarge = (TextView) itemView.findViewById(R.id.textViewLarge);
        textViewSmall = (TextView) itemView.findViewById(R.id.textViewSmall);
    }
}
