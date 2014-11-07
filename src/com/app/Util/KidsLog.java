package com.app.Util;

import android.util.Log;

public class KidsLog {

    private static final String APP_TAG = "KidsStart";

    public static void i(String log) {
        Log.i(APP_TAG, log);
    }

    public static int i(String format, Object... args) {
        return Log.i(APP_TAG, String.format(format, args));
    }

    public static int d(String format, Object... args) {
        return Log.d(APP_TAG, String.format(format, args));
    }

    public static void d(String log) {
        Log.d(APP_TAG, log);
    }

    public static void v(String log) {
        Log.v(APP_TAG, log);
    }

    public static void e(String log) {
        Log.e(APP_TAG, log);
    }

    public static int e(String format, Object... args) {
        return Log.e(APP_TAG, String.format(format, args));
    }

    public static void i(String tag, String log) {
        Log.i(tag, log);
    }

    public static void d(String tag, String log) {
        Log.d(tag, log);
    }

    public static void v(String tag, String log) {
        Log.v(tag, log);
    }

    public static void e(String tag, String log) {
        Log.e(tag, log);
    }

    public static void w(String log) {
        Log.w(APP_TAG, log);
    }

    public static void w(String tag, String log) {
        Log.w(tag, log);
    }

}
