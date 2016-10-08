package com.internationalaset.whichcharacterareyou;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Quiz5 extends Activity {

    Button btn;
    RadioGroup rg5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quiz5);


        btn = (Button) findViewById(R.id.nextBtn5);
        rg5= (RadioGroup) findViewById(R.id.rg5);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                if (rg5.getCheckedRadioButtonId() == -1) {

                    Toast.makeText(getApplicationContext(), "Please select an answer",
                            Toast.LENGTH_SHORT).show();
                } else{
                    Intent intent = new Intent(getApplicationContext(), Quiz6.class);
                   // Bundle bundle5 = new Bundle();
                    Bundle bundle = getIntent().getExtras();
                    int id = rg5.getCheckedRadioButtonId();
                    RadioButton radioButton = (RadioButton) findViewById(id);
                    bundle.putString("rg5", radioButton.getText().toString());
                    intent.putExtras(bundle);
                    startActivity(intent);

                }

            }

        });
    }
}