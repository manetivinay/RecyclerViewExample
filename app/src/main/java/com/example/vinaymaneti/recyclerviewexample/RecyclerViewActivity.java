package com.example.vinaymaneti.recyclerviewexample;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;

import com.example.vinaymaneti.recyclerviewexample.Adapter.RecyclerViewAdapter;
import com.example.vinaymaneti.recyclerviewexample.helper.RowData;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    private RecyclerViewAdapter recyclerViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerViewAdapter = new RecyclerViewAdapter(this, getData(this));
        recyclerView.setAdapter(recyclerViewAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private List<RowData> getData(RecyclerViewActivity recyclerViewActivity) {
        List<RowData> rowDataList = new ArrayList<>();
        Resources resources = recyclerViewActivity.getResources();
        String[] bigText = resources.getStringArray(R.array.bigText);
        String[] smallText = resources.getStringArray(R.array.smallText);
        int[] images = {
                R.drawable.icon_rcv_1,
                R.drawable.icon_rcv_2,
                R.drawable.icon_rcv_3,
                R.drawable.icon_rcv_4,
                R.drawable.icon_rcv_5,
                R.drawable.icon_rcv_6,
                R.drawable.icon_rcv_7,
                R.drawable.icon_rcv_8,
                R.drawable.icon_rcv_9,
                R.drawable.icon_rcv_10,
        };

        for (int i = 0; i < bigText.length && i < smallText.length && i < images.length; i++) {
            RowData rowData = new RowData();
            rowData.imageData = images[i];
            rowData.someLargeDataText = bigText[i];
            rowData.someSmallDataText = smallText[i];
            rowDataList.add(rowData);
        }
        return rowDataList;
    }
}
