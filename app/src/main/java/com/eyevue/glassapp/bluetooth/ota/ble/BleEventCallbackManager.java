package com.eyevue.glassapp.bluetooth.ota.ble;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGattService;
import android.os.Handler;
import android.os.Looper;
import com.eyevue.glassapp.bluetooth.ota.ble.interfaces.BleEventCallback;
import com.eyevue.glassapp.bluetooth.ota.ble.model.BleScanInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes4.dex */
public class BleEventCallbackManager extends BleEventCallback {
    private final ArrayList<BleEventCallback> mCallbacks = new ArrayList<>();
    private final Handler mHandler = new Handler(Looper.getMainLooper());

    public static abstract class BleEventCallbackImpl {
        private BleEventCallbackImpl() {
        }

        public abstract void onCallback(BleEventCallback callback);
    }

    public class OnBleEventRunnable implements Runnable {
        private final BleEventCallbackImpl mImpl;

        public OnBleEventRunnable(BleEventCallbackImpl impl) {
            this.mImpl = impl;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (BleEventCallbackManager.this.mCallbacks.isEmpty() || this.mImpl == null) {
                return;
            }
            for (BleEventCallback bleEventCallback : new ArrayList(BleEventCallbackManager.this.mCallbacks)) {
                if (bleEventCallback != null) {
                    this.mImpl.onCallback(bleEventCallback);
                }
            }
        }
    }

    private void callbackBleEvent(BleEventCallbackImpl impl) {
        if (impl == null) {
            return;
        }
        OnBleEventRunnable onBleEventRunnable = new OnBleEventRunnable(impl);
        if (Thread.currentThread().getId() == Looper.getMainLooper().getThread().getId()) {
            onBleEventRunnable.run();
        } else {
            this.mHandler.post(onBleEventRunnable);
        }
    }

    @Override // com.eyevue.glassapp.bluetooth.ota.ble.interfaces.BleEventCallback, com.eyevue.glassapp.bluetooth.ota.ble.interfaces.IBleEventCallback
    public void onAdapterChange(final boolean bEnabled) {
        callbackBleEvent(new BleEventCallbackImpl() { // from class: com.eyevue.glassapp.bluetooth.ota.ble.BleEventCallbackManager.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.eyevue.glassapp.bluetooth.ota.ble.BleEventCallbackManager.BleEventCallbackImpl
            public void onCallback(BleEventCallback callback) {
                callback.onAdapterChange(bEnabled);
            }
        });
    }

    @Override // com.eyevue.glassapp.bluetooth.ota.ble.interfaces.BleEventCallback, com.eyevue.glassapp.bluetooth.ota.ble.interfaces.IBleEventCallback
    public void onBleConnection(final BluetoothDevice device, final int status) {
        callbackBleEvent(new BleEventCallbackImpl() { // from class: com.eyevue.glassapp.bluetooth.ota.ble.BleEventCallbackManager.4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.eyevue.glassapp.bluetooth.ota.ble.BleEventCallbackManager.BleEventCallbackImpl
            public void onCallback(BleEventCallback callback) {
                callback.onBleConnection(device, status);
            }
        });
    }

    @Override // com.eyevue.glassapp.bluetooth.ota.ble.interfaces.BleEventCallback, com.eyevue.glassapp.bluetooth.ota.ble.interfaces.IBleEventCallback
    public void onBleDataBlockChanged(final BluetoothDevice device, final int block, final int status) {
        callbackBleEvent(new BleEventCallbackImpl() { // from class: com.eyevue.glassapp.bluetooth.ota.ble.BleEventCallbackManager.7
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.eyevue.glassapp.bluetooth.ota.ble.BleEventCallbackManager.BleEventCallbackImpl
            public void onCallback(BleEventCallback callback) {
                callback.onBleDataBlockChanged(device, block, status);
            }
        });
    }

    @Override // com.eyevue.glassapp.bluetooth.ota.ble.interfaces.BleEventCallback, com.eyevue.glassapp.bluetooth.ota.ble.interfaces.IBleEventCallback
    public void onBleDataNotification(final BluetoothDevice device, final UUID serviceUuid, final UUID characteristicsUuid, final byte[] data) {
        callbackBleEvent(new BleEventCallbackImpl() { // from class: com.eyevue.glassapp.bluetooth.ota.ble.BleEventCallbackManager.8
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.eyevue.glassapp.bluetooth.ota.ble.BleEventCallbackManager.BleEventCallbackImpl
            public void onCallback(BleEventCallback callback) {
                callback.onBleDataNotification(device, serviceUuid, characteristicsUuid, data);
            }
        });
    }

    @Override // com.eyevue.glassapp.bluetooth.ota.ble.interfaces.BleEventCallback, com.eyevue.glassapp.bluetooth.ota.ble.interfaces.IBleEventCallback
    public void onBleNotificationStatus(final BluetoothDevice device, final UUID serviceUuid, final UUID characteristicUuid, final int status) {
        callbackBleEvent(new BleEventCallbackImpl() { // from class: com.eyevue.glassapp.bluetooth.ota.ble.BleEventCallbackManager.6
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.eyevue.glassapp.bluetooth.ota.ble.BleEventCallbackManager.BleEventCallbackImpl
            public void onCallback(BleEventCallback callback) {
                callback.onBleNotificationStatus(device, serviceUuid, characteristicUuid, status);
            }
        });
    }

    @Override // com.eyevue.glassapp.bluetooth.ota.ble.interfaces.BleEventCallback, com.eyevue.glassapp.bluetooth.ota.ble.interfaces.IBleEventCallback
    public void onBleServiceDiscovery(final BluetoothDevice device, final int status, final List<BluetoothGattService> services) {
        callbackBleEvent(new BleEventCallbackImpl() { // from class: com.eyevue.glassapp.bluetooth.ota.ble.BleEventCallbackManager.5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.eyevue.glassapp.bluetooth.ota.ble.BleEventCallbackManager.BleEventCallbackImpl
            public void onCallback(BleEventCallback callback) {
                callback.onBleServiceDiscovery(device, status, services);
            }
        });
    }

    @Override // com.eyevue.glassapp.bluetooth.ota.ble.interfaces.BleEventCallback, com.eyevue.glassapp.bluetooth.ota.ble.interfaces.IBleEventCallback
    public void onBleWriteStatus(final BluetoothDevice device, final UUID serviceUuid, final UUID characteristicsUuid, final byte[] data, final int status) {
        callbackBleEvent(new BleEventCallbackImpl() { // from class: com.eyevue.glassapp.bluetooth.ota.ble.BleEventCallbackManager.9
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.eyevue.glassapp.bluetooth.ota.ble.BleEventCallbackManager.BleEventCallbackImpl
            public void onCallback(BleEventCallback callback) {
                callback.onBleWriteStatus(device, serviceUuid, characteristicsUuid, data, status);
            }
        });
    }

    @Override // com.eyevue.glassapp.bluetooth.ota.ble.interfaces.BleEventCallback, com.eyevue.glassapp.bluetooth.ota.ble.interfaces.IBleEventCallback
    public void onConnectionUpdated(final BluetoothDevice device, final int interval, final int latency, final int timeout, final int status) {
        callbackBleEvent(new BleEventCallbackImpl() { // from class: com.eyevue.glassapp.bluetooth.ota.ble.BleEventCallbackManager.10
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.eyevue.glassapp.bluetooth.ota.ble.BleEventCallbackManager.BleEventCallbackImpl
            public void onCallback(BleEventCallback callback) {
                callback.onConnectionUpdated(device, interval, latency, timeout, status);
            }
        });
    }

    @Override // com.eyevue.glassapp.bluetooth.ota.ble.interfaces.BleEventCallback, com.eyevue.glassapp.bluetooth.ota.ble.interfaces.IBleEventCallback
    public void onDiscoveryBle(final BluetoothDevice device, final BleScanInfo bleScanMessage) {
        callbackBleEvent(new BleEventCallbackImpl() { // from class: com.eyevue.glassapp.bluetooth.ota.ble.BleEventCallbackManager.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.eyevue.glassapp.bluetooth.ota.ble.BleEventCallbackManager.BleEventCallbackImpl
            public void onCallback(BleEventCallback callback) {
                callback.onDiscoveryBle(device, bleScanMessage);
            }
        });
    }

    @Override // com.eyevue.glassapp.bluetooth.ota.ble.interfaces.BleEventCallback, com.eyevue.glassapp.bluetooth.ota.ble.interfaces.IBleEventCallback
    public void onDiscoveryBleChange(final boolean bStart) {
        callbackBleEvent(new BleEventCallbackImpl() { // from class: com.eyevue.glassapp.bluetooth.ota.ble.BleEventCallbackManager.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.eyevue.glassapp.bluetooth.ota.ble.BleEventCallbackManager.BleEventCallbackImpl
            public void onCallback(BleEventCallback callback) {
                callback.onDiscoveryBleChange(bStart);
            }
        });
    }

    public void registerBleEventCallback(BleEventCallback callback) {
        if (callback == null || this.mCallbacks.contains(callback)) {
            return;
        }
        this.mCallbacks.add(callback);
    }

    public void release() {
        this.mCallbacks.clear();
        this.mHandler.removeCallbacksAndMessages(null);
    }

    public void unregisterBleEventCallback(BleEventCallback callback) {
        if (callback == null || this.mCallbacks.isEmpty()) {
            return;
        }
        this.mCallbacks.remove(callback);
    }
}
