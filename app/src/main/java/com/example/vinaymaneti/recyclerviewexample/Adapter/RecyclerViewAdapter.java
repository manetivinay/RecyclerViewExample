package com.example.vinaymaneti.recyclerviewexample.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.vinaymaneti.recyclerviewexample.R;
import com.example.vinaymaneti.recyclerviewexample.ViewHolder.SingleRowVH;
import com.example.vinaymaneti.recyclerviewexample.helper.RowData;

import java.util.Collections;
import java.util.List;


/**
 * Created by vinaymaneti on 6/15/16.
 */
public class RecyclerViewAdapter extends RecyclerView.Adapter<SingleRowVH> {

    private Context context;
    private LayoutInflater inflate;
    //this takes care of null pointer exception, ew don't have null pointer exceptions in our code
    List<RowData> data = Collections.emptyList();

    public RecyclerViewAdapter(Context context, List<RowData> data) {
        inflate = LayoutInflater.from(context);
        this.context = context;
        this.data = data;
    }

    @Override
    public SingleRowVH onCreateViewHolder(ViewGroup parent, int viewType) {
        //It will represents the root of our single_row -> RelativeLayout
        View view = inflate.inflate(R.layout.single_row, parent, false);
        SingleRowVH singleRowVH = new SingleRowVH(view);
        return singleRowVH;
    }

    @Override
    public void onBindViewHolder(SingleRowVH holder, final int position) {
        RowData rowData = data.get(position);
        holder.imageView.setImageResource(rowData.imageData);
        holder.textViewLarge.setText(rowData.someLargeDataText);
        holder.textViewSmall.setText(rowData.someSmallDataText);
        holder.textViewLarge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                deleteRow(position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return data.size();
    }


    public void deleteRow(int position) {
        data.remove(position);
        notifyItemRemoved(position);
    }
}
