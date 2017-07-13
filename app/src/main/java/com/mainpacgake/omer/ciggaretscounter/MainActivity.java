package com.mainpacgake.omer.ciggaretscounter;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Build;
import android.preference.PreferenceManager;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.style.BackgroundColorSpan;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.OnClick;
import es.dmoral.toasty.Toasty;

public class MainActivity extends AppCompatActivity {
TextView textView, textView2;
    ImageView imageView;
    Button button;
    SharedPreferences preferences;
    SharedPreferences.Editor editor;
    int i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      final  LinearLayout l1 = (LinearLayout)findViewById(R.id.mylinear);

        preferences= PreferenceManager.getDefaultSharedPreferences(MainActivity.this);
        editor = preferences.edit();
        textView = (TextView)findViewById(R.id.textView);
        textView.setText("Smoking? You must be joking...");
        imageView = (ImageView)findViewById(R.id.imageView);
        textView2 = (TextView)findViewById(R.id.textView2);

        // if counter exist put value in i , if not i=0 (the user not pressed yet on the button)
        i = preferences.getInt("count",0);


        button = (Button)findViewById(R.id.button);
        button.setText("Click To Count ");
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // every click increase i value
                i++;

                textView2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int number = i;
                        int thefinalnumber = number-1;
                        AlertDialog.Builder builder;
                        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                            builder = new AlertDialog.Builder(MainActivity.this, android.R.style.Theme_Material_Dialog_Alert);
                        } else {
                            builder = new AlertDialog.Builder(MainActivity.this);
                        }
                        builder.setTitle("Dear Smoker,")
                                .setMessage("You Smoked Today "+thefinalnumber+" Ciggaretes, Tomorrow You will smoke less?")
                                .setPositiveButton("Yes!", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int which) {
                                        Toasty.success(MainActivity.this, "Good Way To Save Your Life", Toast.LENGTH_SHORT).show();
                                        // continue with delete
                                    }
                                })
                                .setNegativeButton("No.", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int which) {
                                        Toast.makeText(MainActivity.this, "You need to do ReThinking, trust me. ", Toast.LENGTH_SHORT).show();
                                        // do nothing
                                    }
                                })
                                .setIcon(android.R.drawable.ic_dialog_alert)
                                .show();
                    }
                });

                if(i == 1){
                i = 2;
                 editor.putInt("count", i);
                    //Toast.makeText(MainActivity.this, "its your first. Remember: Health is wealth.", Toast.LENGTH_LONG).show();
                    Toasty.info(MainActivity.this, " its your first. Remember: Health is wealth", Toast.LENGTH_LONG,true).show();
                }
                else{
                    int number = preferences.getInt("count", i);
                    if(number == 2) {
                        i=3;

                        Toasty.info(MainActivity.this, "I like smoking. It kills off a lot of stupid people.", Toast.LENGTH_LONG,true).show();

                    }
                  if(number ==3){
                      i=4;

                        Toasty.info(MainActivity.this, "I quit because my kids love me.", Toast.LENGTH_LONG,true).show();
                    }
                     if(number ==4){
                         i=5;
                        Toasty.info(MainActivity.this, "If you smoke, you're a joke.", Toast.LENGTH_LONG,true).show();
                }
                     if(number ==5){
                        i=6;
                         Toasty.info(MainActivity.this, "Save your lungs, save your life.", Toast.LENGTH_LONG,true).show();


                    }

                    ///Todo: from number 6 i need to change the sentences and the logic.
                    if(number ==6){
                        i=7;
                        Toasty.info(MainActivity.this, "Be Cool - Don't Be a Smoking Fool.", Toast.LENGTH_LONG,true).show();

                    }
                    if(number ==7){
                        i=8;
                        Toasty.info(MainActivity.this, "Arsenic kills if you swallow it; tobacco kills if you smoke it.", Toast.LENGTH_LONG,true).show();


                    }

                    if(number ==8){
                        i=9;
                        Toasty.info(MainActivity.this, "Don't be a butthead. Smoking kills.", Toast.LENGTH_LONG,true).show();



                    }

                    if(number ==9){
                        i=10;
                        Toasty.warning(MainActivity.this, "Don't puff your life away.", Toast.LENGTH_LONG,true).show();
                        textView.setText("Who’s going to retire on your hard-earned dollars… you or some tobacco company executive?");
                        imageView.setImageResource(R.drawable.check);
                        l1.setBackgroundColor(Color.GRAY);



                    }
                    if(number ==10){
                        i=11;
                        Toasty.warning(MainActivity.this, "Don't smoke - there are cooler ways to die.", Toast.LENGTH_LONG,true).show();


                    }
                    if(number ==11){
                        i=12;
                        Toasty.warning(MainActivity.this, "If God had wanted us to smoke, he would have given us a separate hole for it.", Toast.LENGTH_LONG,true).show();


                    }

                    if(number ==12){
                        i=13;
                        Toasty.warning(MainActivity.this, "If you think smoking is cool, you're a fool.", Toast.LENGTH_LONG,true).show();


                    }

                    if(number ==13){
                        i=14;
                        Toasty.warning(MainActivity.this, "Is smoking good for business? Not if you want long-term customers.", Toast.LENGTH_LONG,true).show();


                    }

                    if(number ==14){
                        i=15;
                        Toasty.warning(MainActivity.this, "Save your lungs, save your life.", Toast.LENGTH_LONG,true).show();


                    }

                    if(number ==15){
                        i=16;
                        Toasty.warning(MainActivity.this, "Kissing a smoker is like licking an ashtray", Toast.LENGTH_SHORT).show();


                    }
                    if(number ==16){
                        i=17;
                        Toasty.warning(MainActivity.this, "Save your lungs, save your life.", Toast.LENGTH_SHORT).show();


                    }
                    if(number ==17){
                        i=18;
                        Toasty.warning(MainActivity.this, "Live it or Burn it...", Toast.LENGTH_SHORT).show();

                    }
                    if(number ==18){
                        i=19;
                        Toasty.warning(MainActivity.this, "Make your choices, it's your life.", Toast.LENGTH_SHORT).show();

                    }
                    if(number ==19){
                        i=20;
                        Toasty.error(MainActivity.this, "Please keep smoking. Our planet is overcrowded.", Toast.LENGTH_SHORT).show();


                    }
                    if(number ==20){
                        i=21;
                        Toasty.error(MainActivity.this, "Put it out before it puts you out.", Toast.LENGTH_SHORT).show();
                        textView.setText("Who’s going to retire on your hard-earned dollars… you or some tobacco company executive?");
                        imageView.setImageResource(R.drawable.alotof);
                        textView2.setTextColor(Color.WHITE);
                        button.setTextColor(Color.RED);
                        button.setBackgroundColor(Color.WHITE);
                        l1.setBackgroundColor(Color.BLACK);


                    }

                    // save last i value to preference
                    editor.putInt("count",i);
                    editor.apply();


                }

// TODO : Trying to change the color slowly any press untill it will be black. on the part of the grey it will be setnences that nicer to hear, but with the increcment it will be harder.

               // int number = preferences.getInt("count", i);
             //   preferences.edit().putInt("count", i);

            }
        });

    }
}
