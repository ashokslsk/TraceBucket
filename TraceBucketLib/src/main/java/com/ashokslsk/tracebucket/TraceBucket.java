package com.ashokslsk.tracebucket;

import android.util.Log;

/**
 * Created by ashok.kumar on 21/09/16.
 */
public class TraceBucket {


    private static boolean DEBUGGABLE = false;
    private static String LOGTAG = "TraceBucket";

    private static String sideLimiterLeft = "-------------------------------------- TraceBucket : ";
    private static String sideLimiterRight = "--------------------------------------\n\n\n";
    private static String label = "DEBUG Log ";

    public static void init(String newLOGTAG, boolean debuggable) {
        LOGTAG = newLOGTAG;
        DEBUGGABLE = debuggable;
    }

    public static void log(String logdata) {
        if (DEBUGGABLE) {
            label = "Debug Log ";
            Log.d(LOGTAG, sideLimiterLeft + label + sideLimiterRight);
            Log.d(LOGTAG, logdata);
        }
    }

    public static void log(String logdata, Throwable ex) {
        if (DEBUGGABLE) {
            label = "Error Log ";
            Log.e(LOGTAG, sideLimiterLeft + label + sideLimiterRight);

            Log.e(LOGTAG, logdata);

            label = "TraceBucket START ";
            Log.e(LOGTAG, sideLimiterLeft + label + sideLimiterRight);

            ex.printStackTrace();

            label = "TraceBucket END ";
            Log.e(LOGTAG, sideLimiterLeft + label + sideLimiterRight);
        }

    }

}
