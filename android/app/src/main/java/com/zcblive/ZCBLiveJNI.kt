// JNI bindings for ZCBLive

package com.zcblive;

import android.util.Log;

public class ZCBLiveJNI {
    static {
        System.loadLibrary("zcb_live_jni");
    }

    public native void initialize();
    public native void startStream(String streamUrl);
    public native void stopStream();

    private static final String TAG = "ZCBLiveJNI";
    
    public void logMessage(String message) {
        Log.d(TAG, message);
    }
}