package com.internationalaset.whichcharacterareyou;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Final1 extends Activity {
    Button btnRestart;
    Button btnShare;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.final1);

        //Random rand = new Random();
        //int n = rand.nextInt(3);
        // TextView textView4 = (TextView)findViewById(R.id.textView4);
        //textView4.setText(n);
        CustomDialogClass cdd=new CustomDialogClass(Final1.this);
        cdd.show();



//a

      //add a 33% chance of it asking u to please rate the app

        TextView textViewInfo = (TextView)findViewById(R.id.textViewInfo);

        ImageView showImage = (ImageView)findViewById(R.id.showImage);

        Bundle bundle = getIntent().getExtras();


       /* TextView textView = (TextView)findViewById(R.id.txt);
        textView.setText(bundle.getCharSequence("rg"));

        TextView textView1 = (TextView)findViewById(R.id.txt1);
        textView1.setText(bundle.getCharSequence("rg1"));

        TextView textView2 = (TextView)findViewById(R.id.txt2);
        textView2.setText(bundle.getCharSequence("rg2"));

        TextView textView3 = (TextView)findViewById(R.id.txt3);
        textView3.setText(bundle.getCharSequence("rg3"));

        TextView textView4 = (TextView)findViewById(R.id.txt4);
        textView4.setText(bundle.getCharSequence("rg4"));

        TextView textView5 = (TextView)findViewById(R.id.txt5);
        textView5.setText(bundle.getCharSequence("rg5"));

        TextView textView6 = (TextView)findViewById(R.id.txt6);
        textView6.setText(bundle.getCharSequence("rg6"));
        */


        final TextView textviewResult = (TextView) findViewById(R.id.textViewResult);

         if (
                (bundle.getString("rg6").equals("Kill them") )
                )
        {
            showImage.setImageResource(R.drawable.negan);
            textviewResult.setText("Negan");
            textViewInfo.setText("You're a special type of evil. You're pretty smart and always come out on top, but the methods that get you there are ruthless!");

        }
       else if (
                (bundle.getString("rg4").equals("Use your friend as bait") )
                )
        {
            showImage.setImageResource(R.drawable.negan);
            textviewResult.setText("Negan");
            textViewInfo.setText("You're a special type of evil. You're pretty smart and always come out on top, but the methods that get you there are ruthless!");

        }
         else if(


                         (bundle.getString("rg2").equals("Bow and Arrow"))

                 )
         {
             showImage.setImageResource(R.drawable.daryl);
             textviewResult.setText("Daryl");
             textViewInfo.setText("You're kind, brave, and caring and end up helping out others. You're usually not too outgoing. You are especially good with your long range weapon, the bow and arrow");


         }
         else if(


                 (bundle.getString("rg2").equals("Sword"))

                 )
         {
             showImage.setImageResource(R.drawable.michonne);
             textviewResult.setText("Michonne");
             textViewInfo.setText("You're a generous human being and a great fighter too. You're especially good at using your sword");


         }
         else if(


                 (bundle.getString("rg2").equals("Stick"))

                 )
         {
             showImage.setImageResource(R.drawable.morgan);
             textviewResult.setText("Morgan");
             textViewInfo.setText("The way you view life may differ than other people. However, you're only trying to do well. You are also a great fighter with your fighting stick");


         }


        else if (

                (bundle.getString("rg2").equals("Revolver") )

                )
        {
            showImage.setImageResource(R.drawable.rick);
            textviewResult.setText("Rick");
            textViewInfo.setText("You're brave and want the best for your group. Your ideologies have transformed over the years, but you still never fail to be a great leader");

        }

        /* else if (
                (bundle.getString("rg").equals("The one who goes outside and gathers supplies"))
                        && (bundle.getString("rg1").equals("Male"))
                        && (bundle.getString("rg2").equals("Close range weapons") || bundle.getString("rg2").equals("Long range weapons"))
                        && (bundle.getString("rg3").equals("Shoot its legs"))
                        && (bundle.getString("rg4").equals("Run through them")||bundle.getString("rg4").equals("Stand and fight"))
                        && (bundle.getString("rg5").equals("Keep travelling") || bundle.getString("rg5").equals("Settle down in one spot"))
                        && (bundle.getString("rg6").equals("Allow them to join your group"))
                        && (bundle.getString("rg7").equals("Leave it alone") || bundle.getString("rg7").equals("Leave it alone"))
                )
        {
            showImage.setImageResource(R.drawable.abraham);
            textviewResult.setText("Abraham");
            textViewInfo.setText("You're not afraid to die. You go all out, and everyone loves you. You love bashin' those zombie skulls, too!");

        }
        else if (
                (bundle.getString("rg").equals("The one who stays inside and preforms the every day tasks") || bundle.getString("rg").equals("The one who goes outside and gathers supplies"))
                        && (bundle.getString("rg1").equals("Female"))
                        && (bundle.getString("rg2").equals("Close range weapons") || bundle.getString("rg2").equals("Long range weapons"))
                        && (bundle.getString("rg3").equals("Use camouflage and sneak up on it") || bundle.getString("rg3").equals("Use traps") || bundle.getString("rg3").equals("Shoot its legs"))
                        && (bundle.getString("rg4").equals("Run through them")||bundle.getString("rg4").equals("Stand and fight"))
                        && (bundle.getString("rg5").equals("Keep travelling") || bundle.getString("rg5").equals("Settle down in one spot"))
                        && (bundle.getString("rg6").equals("Allow them to join your group") || bundle.getString("rg6").equals("Leave them"))
                        && (bundle.getString("rg7").equals("Leave it alone") || bundle.getString("rg7").equals("Leave it alone"))
                )
        {
            showImage.setImageResource(R.drawable.carol2);
            textviewResult.setText("Carol");
            textViewInfo.setText("You became a strong independent women throughout the years, and have completely transformed. You are not afraid to get your hands dirty, but are still a sweetheart at the end.");

        }
        else if (
                ( bundle.getString("rg").equals("The one who goes outside and gathers supplies") ||bundle.getString("rg").equals("The one who comes up with the plans") )
                        && (bundle.getString("rg1").equals("Male"))
                        && (bundle.getString("rg2").equals("Close range weapons") || bundle.getString("rg2").equals("Long range weapons"))
                        && (bundle.getString("rg3").equals("Use traps") || bundle.getString("rg3").equals("Shoot its legs"))
                        && (bundle.getString("rg4").equals("Run through them")||bundle.getString("rg4").equals("Stand and fight")||bundle.getString("rg4").equals("Call for help"))
                        && (bundle.getString("rg5").equals("Keep travelling") || bundle.getString("rg5").equals("Settle down in one spot"))
                        && (bundle.getString("rg6").equals("Allow them to join your group"))
                        && (bundle.getString("rg7").equals("Leave it alone") || bundle.getString("rg7").equals("Leave it alone"))
                )
        {
            showImage.setImageResource(R.drawable.glenn);
            textviewResult.setText("Glenn");
            textViewInfo.setText(".........to be added..........");

        }
        else if (
                ( bundle.getString("rg").equals("The one who stays inside and preforms the every day tasks"))
                        && (bundle.getString("rg1").equals("Male"))
                        && (bundle.getString("rg2").equals("Close range weapons") || bundle.getString("rg2").equals("Long range weapons"))
                        && (bundle.getString("rg3").equals("Use camouflage") || bundle.getString("rg3").equals("Use traps and sneak up on it")||bundle.getString("rg3").equals("Shoot its legs"))
                        && (bundle.getString("rg4").equals("Run through them")||bundle.getString("rg4").equals("Stand and fight")||bundle.getString("rg4").equals("Call for help"))
                        && (bundle.getString("rg5").equals("Keep travelling") || bundle.getString("rg5").equals("Settle down in one spot"))
                        && (bundle.getString("rg6").equals("Allow them to join your group"))
                        && (bundle.getString("rg7").equals("Leave it alone") || bundle.getString("rg7").equals("Leave it alone"))
                )
        {
            showImage.setImageResource(R.drawable.zombie2);
            textviewResult.setText("Maggie");
            textViewInfo.setText(".........to be added..........");

        }

*/
        else {
             final String[] names = {"Glenn", "Maggie", "Carol", "Abraham", "Sasha", "Carl"};
             int rando = (int) (Math.random() * 4);
             textviewResult.setText(names[rando]);
             String text = textviewResult.getText().toString();

             if (text == "Glenn") {
                 showImage.setImageResource(R.drawable.glenn);
                 textviewResult.setText("Glenn");
                 textViewInfo.setText("You're kind hearted in nature, and good with pretty much every weapon");
             }

             else if (text == "Maggie") {
                 showImage.setImageResource(R.drawable.maggie);
                 textviewResult.setText("Maggie");
                 textViewInfo.setText("Over the years, you have gotten more confident and stronger both physically and mentally. You're generous and only want the best for others");
             }

             else if (text == "Carol") {
                 showImage.setImageResource(R.drawable.carol);
                 textviewResult.setText("Carol");
                 textViewInfo.setText("You started out weak hearted, but the apocalypse has made you into a great fierce and savage fighter. You do what needs to be done in order to protect the people around you");
             }
             else if (text == "Sasha") {
                 showImage.setImageResource(R.drawable.sasha);
                 textviewResult.setText("Sasha");
                 textViewInfo.setText("You are strong both physically and mentally even though you have went through a lot. You are fierce and really good at using assault rifles");
             }
             else if (text == "Carl") {
                 showImage.setImageResource(R.drawable.carl);
                 textviewResult.setText("Carl");
                 textViewInfo.setText("The traumatizing events you have went through have transformed you into a man. No one should go through what you have gone through, but it has made you what you are today, caring and brave.");
             }

             else {
                 showImage.setImageResource(R.drawable.abraham);
                 textviewResult.setText("Abraham");
                 textViewInfo.setText("You're sarcastic but badass at the same time. You give an alpha male vibe and can shoot guns like no other");
             }
         }

        btnRestart = (Button)findViewById(R.id.restartBtn);

        btnRestart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent in = new Intent(v.getContext(), Quiz.class);
                startActivityForResult(in, 0);

            }
        });

        btnShare = (Button)findViewById(R.id.btnShare);

        btnShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
                sharingIntent.setType("text/plain");
                String shareBody = "I just tried this quiz and got " + textviewResult.getText().toString() + " as my character!" + System.getProperty ("line.separator")+ "Try it for yourself to see who you get:" +  System.getProperty ("line.separator") +
                        "https://play.google.com/store/apps/details?id=com.nianticlabs.pokemongo&hl=en";
                sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Try this quiz! See who you get");
                sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, shareBody);
                startActivity(Intent.createChooser(sharingIntent, "Share via"));


            }
        });


    }

}


//  Bundle bundle6 = getIntent().getExtras();
