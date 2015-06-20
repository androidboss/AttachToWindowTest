package com.example.attachtowindowtest.app;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

/**
 * 06-20 19:03:15.461    2858-2858/com.example.attachtowindowtest.app D/MainActivity﹕ onCreate
 06-20 19:03:15.461    2858-2858/com.example.attachtowindowtest.app D/MZPerfObserver﹕ com.example.attachtowindowtest.app onCreate consume 13 ms
 06-20 19:03:15.461    2858-2858/com.example.attachtowindowtest.app D/MainActivity﹕ onStart
 06-20 19:03:15.461    2858-2858/com.example.attachtowindowtest.app D/MainActivity﹕ onResume
 06-20 19:03:15.461    2858-2858/com.example.attachtowindowtest.app D/MainActivity﹕ onPostResume
 06-20 19:03:15.511    2858-2858/com.example.attachtowindowtest.app D/MainActivity﹕ onAttachedToWindow
 running 正在运行中......
 06-20 19:03:15.616    2858-2858/com.example.attachtowindowtest.app D/mali_winsys﹕ new_window_surface returns 0x3000
 06-20 19:03:15.626    2858-2858/com.example.attachtowindowtest.app D/OpenGLRenderer﹕ Enabling debug mode 0
 06-20 19:03:15.646    2858-2858/com.example.attachtowindowtest.app W/ViewRootImpl﹕ mView has no focus, use com.android.internal.policy.impl.PhoneWindow$DecorView{4319bd88 V.E..... R.....ID 0,0-1536,2560} instead
 06-20 19:04:35.166    2858-2858/com.example.attachtowindowtest.app D/MainActivity﹕ onPause
 06-20 19:04:35.626    2858-2858/com.example.attachtowindowtest.app D/MainActivity﹕ onStop
 06-20 19:04:35.626    2858-2858/com.example.attachtowindowtest.app D/MainActivity﹕ onDestroy
 06-20 19:04:35.626    2858-2858/com.example.attachtowindowtest.app D/MainActivity﹕ onDetachedFromWindow
 */

public class MainActivity extends Activity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart");
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Log.d(TAG, "onAttachedToWindow");
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.d(TAG, "onPostResume");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy");
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Log.d(TAG, "onDetachedFromWindow");
    }
}
