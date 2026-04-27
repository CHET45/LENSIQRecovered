package com.eyevue.glassapp.bluetooth;

import java.util.UUID;

/* JADX INFO: loaded from: classes4.dex */
public class BlueConstant {
    public static final int ALL_FILTER = 1;
    public static final int BLE_MTU_MAX = 509;
    public static final int BLE_MTU_MIN = 20;
    public static final byte CMD_BATTERY = 23;
    public static final byte CMD_WIFI = 37;
    public static final int CONNECT_BLE_OR_SPP_TIMEOUT = 30000;
    public static final int CONNECT_TIMEOUT = 40000;
    public static final int DEFAULT_SEND_CMD_TIMEOUT = 2000;
    public static final int FLAG_FILTER = 2;
    public static final int HASH_FILTER = 3;
    public static final int NONE_FILTER = 0;
    public static final int PAIR_OR_UNPAIR_TIMEOUT = 30000;
    public static final int PROTOCOL_TYPE_BLE = 0;
    public static final int PROTOCOL_TYPE_SPP = 1;
    public static final int RETRY_TIMES = 5;
    public static final int SCAN_TIMEOUT = 8000;
    public static final int SCAN_TYPE_BLE = 0;
    public static final int SCAN_TYPE_CLASSIC = 1;
    public static final String TAG = BlueConstant.class.toString();
    public static final UUID UUID_SERVICE = UUID.fromString("0000aa12-0000-1000-8000-00805F9B34FB");
    public static final UUID UUID_CMD_WRITE = UUID.fromString("0000aa13-0000-1000-8000-00805F9B34FB");
    public static final UUID UUID_CMD_NOTIFY = UUID.fromString("0000aa14-0000-1000-8000-00805F9B34FB");
    public static final UUID UUID_PHOTO_NOTIFY = UUID.fromString("0000aa15-0000-1000-8000-00805F9B34FB");
    public static final UUID UUID_2902 = UUID.fromString("00002902-0000-1000-8000-00805f9b34fb");
    public static final UUID UUID_SPP = UUID.fromString("00001101-0000-1000-8000-00805f9b34fb");
    public static final UUID UUID_HFP = UUID.fromString("0000111e-0000-1000-8000-00805f9b34fb");
    public static final UUID UUID_A2DP = UUID.fromString("0000110b-0000-1000-8000-00805f9b34fb");
}
