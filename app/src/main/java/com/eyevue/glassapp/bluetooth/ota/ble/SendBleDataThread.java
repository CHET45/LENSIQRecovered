package com.eyevue.glassapp.bluetooth.ota.ble;

import android.bluetooth.BluetoothGatt;
import com.eyevue.glassapp.bluetooth.ota.ble.interfaces.IBleOp;
import com.eyevue.glassapp.bluetooth.ota.ble.interfaces.OnThreadStateListener;
import com.eyevue.glassapp.bluetooth.ota.ble.interfaces.OnWriteDataCallback;
import java.util.Arrays;
import java.util.UUID;
import java.util.concurrent.LinkedBlockingQueue;
import p000.dh8;

/* JADX INFO: loaded from: classes4.dex */
public class SendBleDataThread extends Thread {
    private static final String TAG = "SendBleDataThread";
    private volatile boolean isDataSend;
    private volatile boolean isThreadWaiting;
    private volatile boolean isWaitingForCallback;
    private final IBleOp mBleManager;
    private BleSendTask mCurrentTask;
    private final OnThreadStateListener mListener;
    private final LinkedBlockingQueue<BleSendTask> mQueue;
    private volatile int retryNum;

    public static class BleSendTask {
        private UUID characteristicUUID;
        private byte[] data;
        private OnWriteDataCallback mCallback;
        private BluetoothGatt mGatt;
        private UUID serviceUUID;
        private int status = -1;

        public BleSendTask(BluetoothGatt gatt, UUID serviceUUID, UUID characteristicUUID, byte[] data, OnWriteDataCallback callback) {
            this.mGatt = gatt;
            this.serviceUUID = serviceUUID;
            this.characteristicUUID = characteristicUUID;
            this.data = data;
            this.mCallback = callback;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof BleSendTask)) {
                return false;
            }
            BleSendTask bleSendTask = (BleSendTask) obj;
            BluetoothGatt bluetoothGatt = this.mGatt;
            return bluetoothGatt != null && this.serviceUUID != null && this.characteristicUUID != null && bluetoothGatt.equals(bleSendTask.getBleGatt()) && this.serviceUUID.equals(bleSendTask.getServiceUUID()) && this.characteristicUUID.equals(bleSendTask.getCharacteristicUUID());
        }

        public BluetoothGatt getBleGatt() {
            return this.mGatt;
        }

        public OnWriteDataCallback getCallback() {
            return this.mCallback;
        }

        public UUID getCharacteristicUUID() {
            return this.characteristicUUID;
        }

        public byte[] getData() {
            return this.data;
        }

        public UUID getServiceUUID() {
            return this.serviceUUID;
        }

        public int getStatus() {
            return this.status;
        }

        public int hashCode() {
            BluetoothGatt bluetoothGatt = this.mGatt;
            return (bluetoothGatt == null || this.serviceUUID == null || this.characteristicUUID == null) ? super.hashCode() : bluetoothGatt.hashCode() + this.serviceUUID.hashCode() + this.characteristicUUID.hashCode();
        }

        public void setCallback(OnWriteDataCallback callback) {
            this.mCallback = callback;
        }

        public void setCharacteristicUUID(UUID characteristicUUID) {
            this.characteristicUUID = characteristicUUID;
        }

        public void setData(byte[] data) {
            this.data = data;
        }

        public void setDevice(BluetoothGatt gatt) {
            this.mGatt = gatt;
        }

        public void setServiceUUID(UUID serviceUUID) {
            this.serviceUUID = serviceUUID;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public String toString() {
            return "BleSendTask{mGatt=" + this.mGatt + ", serviceUUID=" + this.serviceUUID + ", characteristicUUID=" + this.characteristicUUID + ", data=" + Arrays.toString(this.data) + ", status=" + this.status + ", mCallback=" + this.mCallback + '}';
        }
    }

    public SendBleDataThread(IBleOp manager, OnThreadStateListener listener) {
        super(TAG);
        this.mQueue = new LinkedBlockingQueue<>();
        this.isDataSend = false;
        this.isThreadWaiting = false;
        this.isWaitingForCallback = false;
        this.retryNum = 0;
        this.mBleManager = manager;
        this.mListener = listener;
    }

    private boolean addSendData(BluetoothGatt gatt, UUID serviceUUID, UUID characteristicUUID, byte[] data, OnWriteDataCallback callback) {
        boolean z;
        if (!this.isDataSend) {
            return false;
        }
        try {
            this.mQueue.put(new BleSendTask(gatt, serviceUUID, characteristicUUID, data, callback));
            z = true;
        } catch (InterruptedException e) {
            e.printStackTrace();
            z = false;
        }
        if (z && this.isThreadWaiting && !this.isWaitingForCallback) {
            this.isThreadWaiting = false;
            synchronized (this.mQueue) {
                this.mQueue.notify();
            }
        }
        return z;
    }

    private void callbackResult(BleSendTask task, boolean result) {
        if (task == null || task.getCallback() == null) {
            dh8.m9156i(TAG, "getCallback is null.");
        } else {
            if (task.getBleGatt() == null) {
                return;
            }
            task.getCallback().onBleResult(task.getBleGatt().getDevice(), task.getServiceUUID(), task.getCharacteristicUUID(), result, task.getData());
        }
    }

    public boolean addSendTask(BluetoothGatt gatt, UUID serviceUUID, UUID characteristicUUID, byte[] data, OnWriteDataCallback callback) {
        IBleOp iBleOp = this.mBleManager;
        if (iBleOp == null || gatt == null || serviceUUID == null || characteristicUUID == null || data == null || data.length == 0) {
            return false;
        }
        int bleMtu = iBleOp.getBleMtu();
        dh8.m9151d(TAG, "addSendTask : " + bleMtu);
        int length = data.length;
        int i = length / bleMtu;
        boolean zAddSendData = false;
        for (int i2 = 0; i2 < i; i2++) {
            byte[] bArr = new byte[bleMtu];
            System.arraycopy(data, i2 * bleMtu, bArr, 0, bleMtu);
            zAddSendData = addSendData(gatt, serviceUUID, characteristicUUID, bArr, callback);
        }
        int i3 = length % bleMtu;
        if (i3 == 0) {
            return zAddSendData;
        }
        byte[] bArr2 = new byte[i3];
        System.arraycopy(data, length - i3, bArr2, 0, i3);
        return addSendData(gatt, serviceUUID, characteristicUUID, bArr2, callback);
    }

    public boolean isRunning() {
        return this.isDataSend;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        dh8.m9151d(TAG, "send ble data thread is started.");
        OnThreadStateListener onThreadStateListener = this.mListener;
        if (onThreadStateListener != null) {
            onThreadStateListener.onStart(getId(), getName());
        }
        if (this.mBleManager != null) {
            synchronized (this.mQueue) {
                while (this.isDataSend) {
                    this.mCurrentTask = null;
                    this.isThreadWaiting = false;
                    this.isWaitingForCallback = false;
                    if (this.mQueue.isEmpty()) {
                        this.isThreadWaiting = true;
                        dh8.m9151d(TAG, "queue is empty, so waiting for data");
                        try {
                            this.mQueue.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    } else {
                        BleSendTask bleSendTaskPeek = this.mQueue.peek();
                        this.mCurrentTask = bleSendTaskPeek;
                        if (bleSendTaskPeek != null) {
                            this.isWaitingForCallback = this.mBleManager.writeDataByBle(bleSendTaskPeek.mGatt, this.mCurrentTask.getServiceUUID(), this.mCurrentTask.getCharacteristicUUID(), this.mCurrentTask.getData());
                            if (this.isWaitingForCallback) {
                                try {
                                    this.mQueue.wait(8000L);
                                } catch (InterruptedException e2) {
                                    e2.printStackTrace();
                                }
                            } else {
                                this.mCurrentTask.setStatus(-1);
                            }
                            dh8.m9151d(TAG, "data send ret :" + this.mCurrentTask.getStatus());
                            if (this.mCurrentTask.getStatus() != 0) {
                                this.retryNum++;
                                if (this.retryNum >= 3) {
                                    callbackResult(this.mCurrentTask, false);
                                    this.mQueue.clear();
                                } else if (this.mCurrentTask.getStatus() != -1) {
                                    this.mCurrentTask.setStatus(-1);
                                    try {
                                        Thread.sleep(10L);
                                    } catch (InterruptedException e3) {
                                        e3.printStackTrace();
                                    }
                                }
                            } else {
                                callbackResult(this.mCurrentTask, true);
                            }
                        }
                        this.retryNum = 0;
                        if (!this.mQueue.isEmpty()) {
                            this.mQueue.poll();
                        }
                    }
                }
            }
            this.isWaitingForCallback = false;
            this.isThreadWaiting = false;
            this.mQueue.clear();
            OnThreadStateListener onThreadStateListener2 = this.mListener;
            if (onThreadStateListener2 != null) {
                onThreadStateListener2.onEnd(getId(), getName());
            }
            dh8.m9151d(TAG, "send ble data thread exit.");
        }
    }

    @Override // java.lang.Thread
    public synchronized void start() {
        this.isDataSend = true;
        super.start();
    }

    public synchronized void stopThread() {
        this.isDataSend = false;
        wakeupSendThread(null);
    }

    public void wakeupSendThread(BleSendTask sendTask) {
        BleSendTask bleSendTask;
        if (sendTask == null || ((bleSendTask = this.mCurrentTask) != null && bleSendTask.equals(sendTask))) {
            if (sendTask != null) {
                sendTask.setCallback(this.mCurrentTask.getCallback());
                this.mCurrentTask = sendTask;
            }
            synchronized (this.mQueue) {
                try {
                    if (this.isThreadWaiting) {
                        if (this.isWaitingForCallback) {
                            this.mQueue.notifyAll();
                        } else {
                            this.mQueue.notify();
                        }
                    } else if (this.isWaitingForCallback) {
                        this.mQueue.notify();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
