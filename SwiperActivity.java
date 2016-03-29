package com.voxstudios.swiperdiper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.MotionEvent;
import android.view.GestureDetector;
import android.support.v4.view.GestureDetectorCompat;

/*Now its time to implement the interface classes, Once interface are declared they need to be
* implemented*/

public class SwiperActivity extends AppCompatActivity implements GestureDetector.OnGestureListener,
                                                              GestureDetector.OnDoubleTapListener{

    private TextView text1swipe;
    private GestureDetectorCompat gestureDetector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swiper);

        text1swipe = (TextView)findViewById(R.id.text1swipe); //make a reference to the gesture detector
        this.gestureDetector = new GestureDetectorCompat(this,this);//create the object to detect gestures
        gestureDetector.setOnDoubleTapListener(this);
    }
    //////////////Start of the Gesture methods///////////
    @Override
    public boolean onSingleTapConfirmed(MotionEvent e) {
        text1swipe.setText("Single tap Yippe Do dah");
        return true;
    }

    @Override
    public boolean onDoubleTap(MotionEvent e) {
        text1swipe.setText("Double tap Yippe Do dah");
        return true;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent e) {
        text1swipe.setText("DoubleTap event yeh haaaaa");
        return true;
    }

    @Override
    public boolean onDown(MotionEvent e) {
        text1swipe.setText("onDown good man Hoss!");
        return true;
    }

    @Override
    public void onShowPress(MotionEvent e) {
        text1swipe.setText("onShowPress Hossie Hossie!");

    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        text1swipe.setText("onSingleTap Down!");
        return true;
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        text1swipe.setText("onScroll is Wesley snipes here");
        return true;
    }

    @Override
    public void onLongPress(MotionEvent e) {
        text1swipe.setText("onLongPress");
    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        text1swipe.setText("onFling, show me da fling");
        return true;
    }
    /*want to see if there touch event was a gesture if so handle accordingly, if there was a
    * gesture event then come into this event and override it from one of the gesture events
    * above. onTouchEvent is the default event that gets called whenever the user touches the screen*/
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        this.gestureDetector.onTouchEvent(event);//Changes here to original
        return super.onTouchEvent(event);
    }

    ///////////End of the Gestures methods/////////////

}
