package com.ds.xylophone;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = "Xyphone";

    // Helpful Constants
    private final int NR_OF_SIMULTANEOUS_SOUNDS_STREAM = 7;
    private final float LEFT_VOLUME = 1.0f;
    private final float RIGHT_VOLUME = 1.0f;
    private final int NO_LOOP = 0;
    private final int PRIORITY = 0;
    private final float NORMAL_PLAY_RATE = 1.0f;

    // TODO: Add member variables here
    private SoundPool mSoundPool;
    private int mCSoundId;
    private int mDSoundId;
    private int mESoundId;
    private int mFSoundId;
    private int mGSoundId;
    private int mASoundId;
    private int mBSoundId;

    // TODO: Animation member variable
    private Animation buttonPress;

    // TODO: CardView member variable
    private CardView mCCardView;
    private CardView mDCardView;
    private CardView mECardView;
    private CardView mFCardView;
    private CardView mGCardView;
    private CardView mACardView;
    private CardView mBCardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate : finished");

        // TODO: Load animation resource file here
        buttonPress = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.button_pressed);

        // TODO: Load ID of CardView here
        mCCardView = findViewById(R.id.c_key);
        mDCardView = findViewById(R.id.d_key);
        mECardView = findViewById(R.id.e_key);
        mFCardView = findViewById(R.id.f_key);
        mGCardView = findViewById(R.id.g_key);
        mACardView = findViewById(R.id.a_key);
        mBCardView = findViewById(R.id.b_key);

        // TODO: Create a new SoundPool here
        mSoundPool = new SoundPool(NR_OF_SIMULTANEOUS_SOUNDS_STREAM, AudioManager.STREAM_MUSIC, 0);


        // TODO: Load and get the IDs to identify the sounds
        mCSoundId = mSoundPool.load(getApplicationContext(), R.raw.note1_c, 1);
        mDSoundId = mSoundPool.load(getApplicationContext(), R.raw.note2_d, 1);
        mESoundId = mSoundPool.load(getApplicationContext(), R.raw.note3_e, 1);
        mFSoundId = mSoundPool.load(getApplicationContext(), R.raw.note4_f, 1);
        mGSoundId = mSoundPool.load(getApplicationContext(), R.raw.note5_g, 1);
        mASoundId = mSoundPool.load(getApplicationContext(), R.raw.note6_a, 1);
        mBSoundId = mSoundPool.load(getApplicationContext(), R.raw.note7_b, 1);


    }

    // TODO: Add the play methods triggered by the buttons
    public void playC(View v) {
        Log.d(TAG, "C Button Clicked");
        mSoundPool.play(mCSoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
        //v.startAnimation(buttonPress);
        mCCardView.startAnimation(buttonPress);
    }

    public void playD(View v) {
        Log.d(TAG, "D Button Clicked");
        mSoundPool.play(mDSoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
        mDCardView.startAnimation(buttonPress);
    }

    public void playE(View v) {
        Log.d(TAG, "E Button Clicked");
        mSoundPool.play(mESoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
        mECardView.startAnimation(buttonPress);
    }

    public void playF(View v) {
        Log.d(TAG, "F Button Clicked");
        mSoundPool.play(mFSoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
        mFCardView.startAnimation(buttonPress);
    }

    public void playG(View v) {
        Log.d(TAG, "G Button Clicked");
        mSoundPool.play(mGSoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
        mGCardView.startAnimation(buttonPress);
    }

    public void playA(View v) {
        Log.d(TAG, "A Button Clicked");
        mSoundPool.play(mASoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
        mACardView.startAnimation(buttonPress);
    }

    public void playB(View v) {
        Log.d(TAG, "B Button Clicked");
        mSoundPool.play(mBSoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
        mBCardView.startAnimation(buttonPress);
    }


}
