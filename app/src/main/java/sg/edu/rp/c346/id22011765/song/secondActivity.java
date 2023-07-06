package sg.edu.rp.c346.id22011765.song;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class secondActivity extends AppCompatActivity {

    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        DBHelper db = new DBHelper(secondActivity.this);
        setContentView(R.layout.activity_second);


        lv = findViewById(R.id.songlist);
        ArrayList al  = new ArrayList<>();
        ArrayAdapter adapter = new ArrayAdapter<>(secondActivity.this,android.R.layout.simple_list_item_1,al);
        lv.setAdapter(adapter);



        al.addAll(db.getSong());
        adapter.notifyDataSetChanged();
        db.close();
    }
}