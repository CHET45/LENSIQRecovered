package com.watchfun.transcommon;

/* JADX INFO: loaded from: classes.dex */
public class HttpData {
    public static String deviceAddress;
    public static String deviceName;
    public static String version;

    public static void initHttpData(String str, String str2, String str3) {
        version = str;
        deviceAddress = str2;
        deviceName = str3;
    }
}
