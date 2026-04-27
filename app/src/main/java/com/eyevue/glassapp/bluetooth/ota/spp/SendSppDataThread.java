package com.eyevue.glassapp.bluetooth.ota.spp;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.eyevue.glassapp.bluetooth.ota.spp.interfaces.OnWriteSppDataCallback;
import java.io.IOException;
import java.util.UUID;
import java.util.concurrent.LinkedBlockingQueue;
import p000.pk1;

/* JADX INFO: loaded from: classes4.dex */
public class SendSppDataThread extends Thread {
    private static final String TAG = "SendSppDataThread";
    private final Context mContext;
    private final OnSendDataListener mListener;
    private final ISppOp mSppOp;
    private final LinkedBlockingQueue<SppSendTask> mQueue = new LinkedBlockingQueue<>();
    private volatile boolean isDataSend = false;
    private volatile boolean isQueueEmpty = false;
    private final Handler mHandler = new Handler(Looper.getMainLooper());

    public interface ISppOp {
        boolean writeDataToSppDevice(BluetoothDevice device, UUID sppUUID, byte[] data) throws IOException;
    }

    public interface OnSendDataListener {
        void onThreadStart(long threadID);

        void onThreadStop(long threadID);
    }

    public static class SppSendTask {
        public OnWriteSppDataCallback callback;
        public byte[] data;
        public BluetoothDevice device;
        public UUID sppUUID;

        public SppSendTask(BluetoothDevice device, UUID sppUUID, byte[] data, OnWriteSppDataCallback callback) {
            this.device = device;
            this.sppUUID = sppUUID;
            this.data = data;
            this.callback = callback;
        }

        public String toString() {
            return "SppSendTask{device=" + this.device + ", sppUUID=" + this.sppUUID + ", data=" + pk1.byte2HexStr(this.data) + ", callback=" + this.callback + '}';
        }
    }

    public SendSppDataThread(Context context, ISppOp op, OnSendDataListener listener) {
        this.mContext = context;
        this.mSppOp = op;
        this.mListener = listener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$run$0(long j) {
        this.mListener.onThreadStart(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$run$1(long j) {
        this.mListener.onThreadStop(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$run$2(SppSendTask sppSendTask, boolean z) {
        OnWriteSppDataCallback onWriteSppDataCallback = sppSendTask.callback;
        if (onWriteSppDataCallback != null) {
            onWriteSppDataCallback.onSppResult(sppSendTask.device, sppSendTask.sppUUID, z, sppSendTask.data);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$run$3(long j) {
        this.mListener.onThreadStop(j);
    }

    private void wakeupThread() {
        synchronized (this.mQueue) {
            try {
                if (this.isQueueEmpty) {
                    this.mQueue.notifyAll();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void addSendTask(SppSendTask task) {
        if (this.isDataSend) {
            try {
                this.mQueue.put(task);
                if (this.isQueueEmpty) {
                    this.isQueueEmpty = false;
                    synchronized (this.mQueue) {
                        this.mQueue.notifyAll();
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void run() {
        /*
            r8 = this;
            long r0 = r8.getId()
            com.eyevue.glassapp.bluetooth.ota.spp.SendSppDataThread$OnSendDataListener r2 = r8.mListener
            if (r2 == 0) goto L12
            android.os.Handler r2 = r8.mHandler
            pye r3 = new pye
            r3.<init>()
            r2.post(r3)
        L12:
            com.eyevue.glassapp.bluetooth.ota.spp.SendSppDataThread$ISppOp r2 = r8.mSppOp
            if (r2 == 0) goto L85
            android.content.Context r2 = r8.mContext
            boolean r2 = com.eyevue.glassapp.utils.AppUtil.checkHasConnectPermission(r2)
            if (r2 != 0) goto L1f
            goto L85
        L1f:
            java.util.concurrent.LinkedBlockingQueue<com.eyevue.glassapp.bluetooth.ota.spp.SendSppDataThread$SppSendTask> r2 = r8.mQueue
            monitor-enter(r2)
        L22:
            boolean r3 = r8.isDataSend     // Catch: java.lang.Throwable -> L3f
            if (r3 == 0) goto L6e
            java.util.concurrent.LinkedBlockingQueue<com.eyevue.glassapp.bluetooth.ota.spp.SendSppDataThread$SppSendTask> r3 = r8.mQueue     // Catch: java.lang.Throwable -> L3f
            boolean r3 = r3.isEmpty()     // Catch: java.lang.Throwable -> L3f
            r8.isQueueEmpty = r3     // Catch: java.lang.Throwable -> L3f
            boolean r3 = r8.isQueueEmpty     // Catch: java.lang.Throwable -> L3f
            if (r3 == 0) goto L46
            java.lang.String r3 = "SendSppDataThread"
            java.lang.String r4 = "queue is empty, so waiting for data"
            p000.dh8.m9151d(r3, r4)     // Catch: java.lang.Throwable -> L3f
            java.util.concurrent.LinkedBlockingQueue<com.eyevue.glassapp.bluetooth.ota.spp.SendSppDataThread$SppSendTask> r3 = r8.mQueue     // Catch: java.lang.Throwable -> L3f java.lang.InterruptedException -> L41
            r3.wait()     // Catch: java.lang.Throwable -> L3f java.lang.InterruptedException -> L41
            goto L22
        L3f:
            r0 = move-exception
            goto L83
        L41:
            r3 = move-exception
            r3.printStackTrace()     // Catch: java.lang.Throwable -> L3f
            goto L22
        L46:
            java.util.concurrent.LinkedBlockingQueue<com.eyevue.glassapp.bluetooth.ota.spp.SendSppDataThread$SppSendTask> r3 = r8.mQueue     // Catch: java.lang.Throwable -> L3f
            java.lang.Object r3 = r3.poll()     // Catch: java.lang.Throwable -> L3f
            com.eyevue.glassapp.bluetooth.ota.spp.SendSppDataThread$SppSendTask r3 = (com.eyevue.glassapp.bluetooth.ota.spp.SendSppDataThread.SppSendTask) r3     // Catch: java.lang.Throwable -> L3f
            if (r3 == 0) goto L22
            com.eyevue.glassapp.bluetooth.ota.spp.SendSppDataThread$ISppOp r4 = r8.mSppOp     // Catch: java.lang.Throwable -> L3f java.io.IOException -> L67
            android.bluetooth.BluetoothDevice r5 = r3.device     // Catch: java.lang.Throwable -> L3f java.io.IOException -> L67
            java.util.UUID r6 = r3.sppUUID     // Catch: java.lang.Throwable -> L3f java.io.IOException -> L67
            byte[] r7 = r3.data     // Catch: java.lang.Throwable -> L3f java.io.IOException -> L67
            boolean r4 = r4.writeDataToSppDevice(r5, r6, r7)     // Catch: java.lang.Throwable -> L3f java.io.IOException -> L67
            android.os.Handler r5 = r8.mHandler     // Catch: java.lang.Throwable -> L3f
            rye r6 = new rye     // Catch: java.lang.Throwable -> L3f
            r6.<init>()     // Catch: java.lang.Throwable -> L3f
            r5.post(r6)     // Catch: java.lang.Throwable -> L3f
            goto L22
        L67:
            r3 = move-exception
            r3.printStackTrace()     // Catch: java.lang.Throwable -> L3f
            r3 = 0
            r8.isDataSend = r3     // Catch: java.lang.Throwable -> L3f
        L6e:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3f
            java.util.concurrent.LinkedBlockingQueue<com.eyevue.glassapp.bluetooth.ota.spp.SendSppDataThread$SppSendTask> r2 = r8.mQueue
            r2.clear()
            com.eyevue.glassapp.bluetooth.ota.spp.SendSppDataThread$OnSendDataListener r2 = r8.mListener
            if (r2 == 0) goto L82
            android.os.Handler r2 = r8.mHandler
            sye r3 = new sye
            r3.<init>()
            r2.post(r3)
        L82:
            return
        L83:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3f
            throw r0
        L85:
            com.eyevue.glassapp.bluetooth.ota.spp.SendSppDataThread$OnSendDataListener r2 = r8.mListener
            if (r2 == 0) goto L93
            android.os.Handler r2 = r8.mHandler
            qye r3 = new qye
            r3.<init>()
            r2.post(r3)
        L93:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.eyevue.glassapp.bluetooth.ota.spp.SendSppDataThread.run():void");
    }

    @Override // java.lang.Thread
    public synchronized void start() {
        this.isDataSend = true;
        super.start();
    }

    public synchronized void stopThread() {
        this.isDataSend = false;
        wakeupThread();
    }
}
