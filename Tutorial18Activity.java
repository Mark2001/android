package com.voxstudios.mymarksapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Tutorial18Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorial18);
        //Create the object for the button.
        Button marksbutton = (Button)findViewById(R.id.Marksbutton);//R=Resource id=Marksbutton

        /*First thing to do is set-up the Event listener. To create an event listener first need
        * to declare what widget will listen to the event. Inside the button we need to create an
        * interface(This is part of the rules of Java), and inside the interface goes the callback
        * method. The text will be changed in this example*/

        marksbutton.setOnClickListener(
                new Button.OnClickListener()//Create an interface
                {
                    public void onClick(View v)//This is the callback method that's imlemented
                    {
                        TextView MarksText = (TextView)findViewById(R.id.Markstext);
                        MarksText.setText("Good job my Hoss?");
                    }
                }
        );

        /*This Event gets created when the user clicks on the mouse for a longer period of time
        * the onLongClick will decide weather to create the event or not, if the Event is not
        * generated it will return false and go to the onClickEvent above, so it needs to return true*/
        marksbutton.setOnLongClickListener(
                new Button.OnLongClickListener()
                {
                    public boolean onLongClick(View v)//pass in parameter v
                    {
                        TextView MarksText = (TextView) findViewById(R.id.Markstext);
                        MarksText.setText("Yeppe you clicked down on the button");
                        return true;//Return true if long click is pressed.
                    }
                }
        );
    }
}
