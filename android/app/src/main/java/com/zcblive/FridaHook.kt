// Frida hooking code

package com.zcblive

import frida.*
import frida.helpers.*
import android.util.Log

object FridaHook {
    private const val TAG = "FridaHook"

    fun hook() {
        Runtime.getRuntime().exec("frida -U -l <path_to_script> --no-pause")
        Log.d(TAG, "Frida hook executed.")
    }
}