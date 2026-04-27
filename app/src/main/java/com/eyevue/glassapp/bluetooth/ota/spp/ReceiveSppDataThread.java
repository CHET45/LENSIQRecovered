package com.eyevue.glassapp.bluetooth.ota.spp;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;
import android.content.Context;
import java.util.UUID;
import p000.dh8;

/* JADX INFO: loaded from: classes4.dex */
public class ReceiveSppDataThread extends Thread {
    public static final int EXIT_REASON_IO_EXCEPTION = 2;
    public static final int EXIT_REASON_PARAM_ERROR = 1;
    public static final int EXIT_REASON_SUCCESS = 0;
    private static final String TAG = "ReceiveSppDataThread";
    private volatile boolean isRunning;
    private final int mBlockSize;
    private final BluetoothSocket mBluetoothSocket;
    private final BluetoothDevice mConnectedSppDev;
    private final Context mContext;
    private final OnRecvSppDataListener mOnRecvSppDataListener;
    private final UUID mSppUUID;

    public interface OnRecvSppDataListener {
        void onRecvSppData(long threadID, BluetoothDevice device, UUID sppUUID, byte[] data);

        void onThreadStart(long threadID);

        void onThreadStop(long threadID, int reason, BluetoothDevice device, UUID sppUUID);
    }

    public ReceiveSppDataThread(Context context, BluetoothDevice device, UUID sppUUID, BluetoothSocket socket, OnRecvSppDataListener listener) {
        this(context, device, sppUUID, socket, 4096, listener);
    }

    public BluetoothSocket getBluetoothSocket() {
        return this.mBluetoothSocket;
    }

    public UUID getSppUUID() {
        return this.mSppUUID;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0075 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x006d A[SYNTHETIC] */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void run() {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.eyevue.glassapp.bluetooth.ota.spp.ReceiveSppDataThread.run():void");
    }

    public void stopThread() {
        dh8.m9154e(TAG, "ReceiveDataThread stopThread.");
        this.isRunning = false;
    }

    public ReceiveSppDataThread(Context context, BluetoothDevice device, UUID sppUUID, BluetoothSocket socket, int blockSize, OnRecvSppDataListener listener) {
        super("ReceiveSppDataThread : " + device);
        this.mContext = context;
        this.mConnectedSppDev = device;
        this.mSppUUID = sppUUID;
        this.mBluetoothSocket = socket;
        this.mBlockSize = blockSize;
        this.mOnRecvSppDataListener = listener;
    }
}
