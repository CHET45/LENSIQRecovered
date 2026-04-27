package com.eyevue.glassapp.bluetooth.ota.spp;

import android.bluetooth.BluetoothDevice;
import android.os.Handler;
import android.os.Looper;
import com.eyevue.glassapp.bluetooth.ota.spp.interfaces.ISppEventCallback;
import com.eyevue.glassapp.bluetooth.ota.spp.interfaces.SppEventCallback;
import java.util.ArrayList;
import java.util.UUID;

/* JADX INFO: loaded from: classes4.dex */
public class SppEventCallbackManager implements ISppEventCallback {
    private final ArrayList<SppEventCallback> mCallbacks = new ArrayList<>();
    private final Handler mHandler = new Handler(Looper.getMainLooper());

    public class OnSppEventRunnable implements Runnable {
        private final SppEventCallbackImpl mImpl;

        public OnSppEventRunnable(SppEventCallbackImpl impl) {
            this.mImpl = impl;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (SppEventCallbackManager.this.mCallbacks.isEmpty() || this.mImpl == null) {
                return;
            }
            for (SppEventCallback sppEventCallback : new ArrayList(SppEventCallbackManager.this.mCallbacks)) {
                if (sppEventCallback != null) {
                    this.mImpl.onCallback(sppEventCallback);
                }
            }
        }
    }

    public static abstract class SppEventCallbackImpl {
        private SppEventCallbackImpl() {
        }

        public abstract void onCallback(SppEventCallback callback);
    }

    private void callbackSppEvent(SppEventCallbackImpl impl) {
        if (impl == null) {
            return;
        }
        OnSppEventRunnable onSppEventRunnable = new OnSppEventRunnable(impl);
        if (Thread.currentThread().getId() == Looper.getMainLooper().getThread().getId()) {
            onSppEventRunnable.run();
        } else {
            this.mHandler.post(onSppEventRunnable);
        }
    }

    @Override // com.eyevue.glassapp.bluetooth.ota.spp.interfaces.ISppEventCallback
    public void onAdapterChange(final boolean bEnabled) {
        callbackSppEvent(new SppEventCallbackImpl() { // from class: com.eyevue.glassapp.bluetooth.ota.spp.SppEventCallbackManager.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.eyevue.glassapp.bluetooth.ota.spp.SppEventCallbackManager.SppEventCallbackImpl
            public void onCallback(SppEventCallback callback) {
                callback.onAdapterChange(bEnabled);
            }
        });
    }

    @Override // com.eyevue.glassapp.bluetooth.ota.spp.interfaces.ISppEventCallback
    public void onDiscoveryDevice(final BluetoothDevice device, final int rssi) {
        callbackSppEvent(new SppEventCallbackImpl() { // from class: com.eyevue.glassapp.bluetooth.ota.spp.SppEventCallbackManager.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.eyevue.glassapp.bluetooth.ota.spp.SppEventCallbackManager.SppEventCallbackImpl
            public void onCallback(SppEventCallback callback) {
                callback.onDiscoveryDevice(device, rssi);
            }
        });
    }

    @Override // com.eyevue.glassapp.bluetooth.ota.spp.interfaces.ISppEventCallback
    public void onDiscoveryDeviceChange(final boolean bStart) {
        callbackSppEvent(new SppEventCallbackImpl() { // from class: com.eyevue.glassapp.bluetooth.ota.spp.SppEventCallbackManager.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.eyevue.glassapp.bluetooth.ota.spp.SppEventCallbackManager.SppEventCallbackImpl
            public void onCallback(SppEventCallback callback) {
                callback.onDiscoveryDeviceChange(bStart);
            }
        });
    }

    @Override // com.eyevue.glassapp.bluetooth.ota.spp.interfaces.ISppEventCallback
    public void onReceiveSppData(final BluetoothDevice device, final UUID uuid, final byte[] data) {
        callbackSppEvent(new SppEventCallbackImpl() { // from class: com.eyevue.glassapp.bluetooth.ota.spp.SppEventCallbackManager.5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.eyevue.glassapp.bluetooth.ota.spp.SppEventCallbackManager.SppEventCallbackImpl
            public void onCallback(SppEventCallback callback) {
                callback.onReceiveSppData(device, uuid, data);
            }
        });
    }

    @Override // com.eyevue.glassapp.bluetooth.ota.spp.interfaces.ISppEventCallback
    public void onSppConnection(final BluetoothDevice device, final UUID sppUUID, final int status) {
        callbackSppEvent(new SppEventCallbackImpl() { // from class: com.eyevue.glassapp.bluetooth.ota.spp.SppEventCallbackManager.4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.eyevue.glassapp.bluetooth.ota.spp.SppEventCallbackManager.SppEventCallbackImpl
            public void onCallback(SppEventCallback callback) {
                callback.onSppConnection(device, sppUUID, status);
            }
        });
    }

    public void registerSppEventCallback(SppEventCallback callback) {
        if (callback == null || this.mCallbacks.contains(callback)) {
            return;
        }
        this.mCallbacks.add(callback);
    }

    public void release() {
        this.mCallbacks.clear();
        this.mHandler.removeCallbacksAndMessages(null);
    }

    public void unregisterSppEventCallback(SppEventCallback callback) {
        if (callback == null || this.mCallbacks.isEmpty()) {
            return;
        }
        this.mCallbacks.remove(callback);
    }
}
