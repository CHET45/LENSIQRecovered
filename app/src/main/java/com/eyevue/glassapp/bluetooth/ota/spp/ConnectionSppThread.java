package com.eyevue.glassapp.bluetooth.ota.spp;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.eyevue.glassapp.utils.AppUtil;
import java.util.UUID;
import p000.dh8;
import p000.v91;

/* JADX INFO: loaded from: classes4.dex */
public class ConnectionSppThread extends Thread {
    private static final String TAG = "ConnectionSppThread";
    private final Context mContext;
    private final BluetoothDevice mDevice;
    private final Handler mHandler;
    private final OnConnectSppListener mListener;
    private final UUID mSppUUID;

    public interface OnConnectSppListener {
        void onThreadStart(long threadID);

        void onThreadStop(long threadID, boolean result, BluetoothDevice device, UUID sppUUID, BluetoothSocket socket);
    }

    public ConnectionSppThread(Context context, BluetoothDevice device, UUID sppUUID, OnConnectSppListener listener) {
        super(TAG);
        this.mHandler = new Handler(Looper.getMainLooper());
        this.mContext = context;
        this.mDevice = device;
        this.mSppUUID = sppUUID;
        this.mListener = listener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onThreadStart$0(long j) {
        this.mListener.onThreadStart(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onThreadStop$1(long j, boolean z, BluetoothDevice bluetoothDevice, UUID uuid, BluetoothSocket bluetoothSocket) {
        this.mListener.onThreadStop(j, z, bluetoothDevice, uuid, bluetoothSocket);
    }

    public void onThreadStart(final long id) {
        if (this.mListener != null) {
            this.mHandler.post(new Runnable() { // from class: ms2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f61899a.lambda$onThreadStart$0(id);
                }
            });
        }
    }

    public void onThreadStop(final long threadID, final boolean result, final BluetoothDevice device, final UUID sppUUID, final BluetoothSocket socket) {
        if (this.mListener != null) {
            this.mHandler.post(new Runnable() { // from class: ns2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f65429a.lambda$onThreadStop$1(threadID, result, device, sppUUID, socket);
                }
            });
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public synchronized void run() {
        boolean z;
        onThreadStart(getId());
        if (this.mDevice != null && AppUtil.checkHasConnectPermission(this.mContext)) {
            dh8.m9154e(TAG, "-ConnectionSppThread- connect device : " + v91.printBtDeviceInfo(this.mContext, this.mDevice) + ", uuid = " + this.mSppUUID);
            BluetoothSocket bluetoothSocketCreateRfcommSocketToServiceRecord = null;
            try {
                bluetoothSocketCreateRfcommSocketToServiceRecord = this.mDevice.createRfcommSocketToServiceRecord(this.mSppUUID);
                bluetoothSocketCreateRfcommSocketToServiceRecord.connect();
                z = true;
            } catch (Exception e) {
                e.printStackTrace();
                dh8.m9154e(TAG, "-ConnectionSppThread- exception : " + e.getMessage() + ", uuid = " + this.mSppUUID);
                z = false;
            }
            BluetoothSocket bluetoothSocket = bluetoothSocketCreateRfcommSocketToServiceRecord;
            boolean z2 = z;
            if (z2) {
                dh8.m9156i(TAG, "-ConnectionSppThread- connect spp ok, recv max = " + bluetoothSocket.getMaxReceivePacketSize() + ", send max = " + bluetoothSocket.getMaxTransmitPacketSize());
            }
            onThreadStop(getId(), z2, this.mDevice, this.mSppUUID, bluetoothSocket);
            return;
        }
        onThreadStop(getId(), false, null, null, null);
    }
}
