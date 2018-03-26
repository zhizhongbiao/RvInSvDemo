package cn.com.tianyudg.rvinsvdemo;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rv;
    private ArrayList<String> strings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        strings = new ArrayList<>();
        for (int i = 0; i < 40; i++) {
            strings.add(i + "");
        }


        rv = (RecyclerView) findViewById(R.id.rv);
        rv.setLayoutManager(new FullyLinearLayoutManager(this));
        rv.setAdapter(new RecyclerView.Adapter() {
            @Override
            public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

                TextView textView = new TextView(MainActivity.this);

                RecyclerView.LayoutParams params = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 200);
                params.topMargin = 2;
                textView.setGravity(Gravity.CENTER);
                textView.setBackgroundColor(Color.GREEN);
                textView.setLayoutParams(params);
                return new MyHolder(textView);
            }

            @Override
            public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
                ((TextView) holder.itemView).setText(strings.get(position));
            }

            @Override
            public int getItemCount() {
                return strings.size();
            }
        });
    }


    class MyHolder extends RecyclerView.ViewHolder {

        public MyHolder(View itemView) {
            super(itemView);
        }
    }
}
