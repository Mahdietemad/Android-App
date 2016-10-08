package com.internationalaset.whichcharacterareyou;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Quiz3 extends Activity {

   Button btn;
    RadioGroup rg3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quiz3);



        btn = (Button) findViewById(R.id.nextBtn3);
        rg3= (RadioGroup) findViewById(R.id.rg3);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                if (rg3.getCheckedRadioButtonId() == -1) {

                    Toast.makeText(getApplicationContext(), "Please select an answer",
                            Toast.LENGTH_SHORT).show();
                } else{
                    Intent intent = new Intent(getApplicationContext(), Quiz4.class);
                   // Bundle bundle3 = new Bundle();
                    Bundle bundle = getIntent().getExtras();
                    int id = rg3.getCheckedRadioButtonId();
                    RadioButton radioButton = (RadioButton) findViewById(id);
                    bundle.putString("rg3", radioButton.getText().toString());
                    intent.putExtras(bundle);
                    startActivity(intent);

                }

            }

        });
    }
}