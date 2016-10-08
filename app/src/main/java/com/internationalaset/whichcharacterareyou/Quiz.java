package com.internationalaset.whichcharacterareyou;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Quiz extends Activity {

    Button btn;
    RadioGroup rg;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quiz);

        btn = (Button) findViewById(R.id.nextBtn);
        rg = (RadioGroup) findViewById(R.id.rg);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                if (rg.getCheckedRadioButtonId() == -1) {

                    Toast.makeText(getApplicationContext(), "Please select an answer",
                            Toast.LENGTH_SHORT).show();
                } else {
                    Intent intent = new Intent(getApplicationContext(), Quiz1.class);
                    Bundle bundle = new Bundle();
                   // bundle = getIntent().getExtras();
                    int id = rg.getCheckedRadioButtonId();
                    RadioButton radioButton = (RadioButton) findViewById(id);
                    bundle.putString("rg", radioButton.getText().toString());
                    intent.putExtras(bundle);
                    startActivity(intent);

                }

            }

        });
    }
}
/*if (rg.getCheckedRadioButtonId() == -1) {

                    Toast.makeText(getApplicationContext(), "Please select an answer",
                            Toast.LENGTH_SHORT).show();
                } else {*/