package com.internationalaset.whichcharacterareyou;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Quiz4 extends Activity {

   Button btn;
    RadioGroup rg4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quiz4);


        btn = (Button) findViewById(R.id.nextBtn4);
        rg4= (RadioGroup) findViewById(R.id.rg4);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                if (rg4.getCheckedRadioButtonId() == -1) {

                    Toast.makeText(getApplicationContext(), "Please select an answer",
                            Toast.LENGTH_SHORT).show();
                } else{
                    Intent intent = new Intent(getApplicationContext(), Quiz5.class);
                    //Bundle bundle4 = new Bundle();
                    Bundle bundle = getIntent().getExtras();
                    int id = rg4.getCheckedRadioButtonId();
                    RadioButton radioButton = (RadioButton) findViewById(id);
                    bundle.putString("rg4", radioButton.getText().toString());
                    intent.putExtras(bundle);
                    startActivity(intent);

                }

            }

        });
    }
}