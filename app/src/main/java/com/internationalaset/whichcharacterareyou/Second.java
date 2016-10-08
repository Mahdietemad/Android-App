package com.internationalaset.whichcharacterareyou;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class Second extends Activity{
   Button btn;
ImageButton r1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);

        r1 = (ImageButton)findViewById(R.id.imageButton);
      r1.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
             Intent intent = new Intent(Intent.ACTION_VIEW);
              intent.setData(Uri.parse("market://details?id=com.nianticlabs.pokemongo&hl=en"));
              startActivity(intent);

          }
      });
         btn = (Button)findViewById(R.id.beginBtn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(v.getContext(), Quiz.class);
                startActivityForResult(in,0);

            }
        });
    }
}
