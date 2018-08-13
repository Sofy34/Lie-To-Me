package com.sofya.apphit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class ActivityTwo extends AppCompatActivity    {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);


        CheckBox cb1 = (CheckBox) findViewById(R.id.checkBox2);

        cb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((CheckBox) v).isChecked()) {
                    Toast.makeText(getApplicationContext(), "Redirecting...",
                            Toast.LENGTH_SHORT).show();
                   Intent goTo = new Intent(ActivityTwo.this,ActivityThree.class);
                    startActivity(goTo);
                } else {
                    Toast.makeText(getApplicationContext(), "You have to agree with terms",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
