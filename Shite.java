package com.voxstudios.againstthegrain;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.Button;  //library for a button
import android.graphics.Color; //color library
import android.widget.EditText; //library for password and text area
import android.content.res.Resources;
import android.util.TypedValue;

public class Shite extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*Always better to add layouts and stuff into the onCreate method because this
        * is the first method that gets loaded when app is first started*/

        //Layout
        RelativeLayout markslayout = new RelativeLayout(this);//Layout object now created
        markslayout.setBackgroundColor(Color.DKGRAY);

        //Button
        Button marksbutton = new Button(this);//button object created
        marksbutton.setText("Click me now"); //Set the text of the button
        marksbutton.setBackgroundColor(Color.RED);

        //Username input
        EditText username = new EditText(this);

        marksbutton.setId(1);
        username.setId(2);

        //Set the position of the button
        RelativeLayout.LayoutParams buttonposition = new RelativeLayout.LayoutParams(
                //make a container for the button Layout on screen
                RelativeLayout.LayoutParams.WRAP_CONTENT,  //pass in height
                RelativeLayout.LayoutParams.WRAP_CONTENT    //pass in the width

        );
        //set rules for button position
        buttonposition.addRule(RelativeLayout.CENTER_HORIZONTAL);
        buttonposition.addRule(RelativeLayout.CENTER_VERTICAL);

        //Set layout and pixel format of the app from dip's to pixels
        Resources r = getResources();
        int px = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,200,
                r.getDisplayMetrics());
        username.setWidth(px);

        //set the position of the username input text box
        RelativeLayout.LayoutParams usernamepostion = new RelativeLayout.LayoutParams(
                //make a container for the username Layout on screen
                RelativeLayout.LayoutParams.WRAP_CONTENT,  //pass in height
                RelativeLayout.LayoutParams.WRAP_CONTENT    //pass in the width


        );

        //give rules to position of the username panel
        usernamepostion.addRule(RelativeLayout.ABOVE, marksbutton.getId());//Position it above the button
        usernamepostion.addRule(RelativeLayout.CENTER_HORIZONTAL);//center it horizontally
        usernamepostion.setMargins(0, 0, 0, 50);//margin above the button is 50

        //add layout
        markslayout.addView(marksbutton, buttonposition);//add the button and position to view
        setContentView(markslayout);//attach objects to the Relativelayout
        markslayout.addView(username, usernamepostion );
    }
}
