package com.internationalaset.whichcharacterareyou;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Quiz7 extends Activity {

    Button btn;
    RadioGroup rg7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quiz7);


        btn = (Button) findViewById(R.id.nextBtn7);
        rg7= (RadioGroup) findViewById(R.id.rg7);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                if (rg7.getCheckedRadioButtonId() == -1) {

                    Toast.makeText(getApplicationContext(), "Please select an answer",
                            Toast.LENGTH_SHORT).show();
                } else{
                    Intent intent = new Intent(getApplicationContext(), Quiz8.class);
                   // Bundle bundle6 = new Bundle();
                    Bundle bundle = getIntent().getExtras();
                    int id = rg7.getCheckedRadioButtonId();
                    RadioButton radioButton = (RadioButton) findViewById(id);
                    bundle.putString("rg7", radioButton.getText().toString());
                    intent.putExtras(bundle);
                    startActivity(intent);

                }

            }

        });
    }
}