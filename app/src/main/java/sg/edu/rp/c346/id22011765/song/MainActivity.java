package sg.edu.rp.c346.id22011765.song;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvtitle,tvsingers,tvyear,tvstars;
    EditText ettitle,etsingers,etyear;
    Button btninsert, btnlist;
    RadioGroup rg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvtitle = findViewById(R.id.tvtitle);
        tvsingers = findViewById(R.id.tvsingers);
        tvyear = findViewById(R.id.tvyear);
        tvstars = findViewById(R.id.tvstars);

        ettitle = findViewById(R.id.ettitle);
        etsingers = findViewById(R.id.etsingers);
        etyear = findViewById(R.id.etyear);

        btninsert = findViewById(R.id.btninsert);
        btnlist = findViewById(R.id.btnshowlist);

        rg = findViewById(R.id.rgstars);


        btninsert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int checkedID = rg.getCheckedRadioButtonId();
                RadioButton button = rg.findViewById(checkedID);
                int stars = Integer.parseInt(button.getText().toString());

                DBHelper db = new DBHelper(MainActivity.this);
                db.insertSong(ettitle.getText().toString(), etsingers.getText().toString(),Integer.parseInt(etyear.getText().toString()) , stars);
            }
        });

        btnlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), secondActivity.class);
                startActivity(i);
                DBHelper db = new DBHelper(MainActivity.this);
                db.close();
            }
        });

    }
}


