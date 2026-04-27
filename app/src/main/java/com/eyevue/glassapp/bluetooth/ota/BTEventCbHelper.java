package com.eyevue.glassapp.bluetooth.ota;

import android.bluetooth.BluetoothDevice;
import android.os.Handler;
import android.os.Looper;
import com.eyevue.glassapp.bluetooth.ota.ble.model.BleScanInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import p000.dwf;
import p000.e0g;
import p000.gib;
import p000.md8;
import p000.yfb;

/* JADX INFO: loaded from: classes4.dex */
@e0g(parameters = 0)
public final class BTEventCbHelper extends OnBTEventCallback {
    public static final int $stable = 8;

    @yfb
    private final List<OnBTEventCallback> callbacks = new ArrayList();

    @yfb
    private final Handler uiHandler = new Handler(Looper.getMainLooper());

    public interface CallbackImpl<T> {
        void onCallback(T t);
    }

    @dwf({"SMAP\nBTEventCbHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BTEventCbHelper.kt\ncom/eyevue/glassapp/bluetooth/ota/BTEventCbHelper$CallbackRunnable\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,112:1\n1863#2,2:113\n*S KotlinDebug\n*F\n+ 1 BTEventCbHelper.kt\ncom/eyevue/glassapp/bluetooth/ota/BTEventCbHelper$CallbackRunnable\n*L\n107#1:113,2\n*E\n"})
    @e0g(parameters = 0)
    public static final class CallbackRunnable<T> implements Runnable {
        public static final int $stable = 8;

        @yfb
        private final List<T> callbacks;

        @gib
        private final CallbackImpl<T> impl;

        public CallbackRunnable(@yfb List<T> list, @gib CallbackImpl<T> callbackImpl) {
            md8.checkNotNullParameter(list, "callbacks");
            this.callbacks = list;
            this.impl = callbackImpl;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.callbacks.isEmpty() || this.impl == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(this.callbacks);
            Iterator<T> it = arrayList.iterator();
            while (it.hasNext()) {
                this.impl.onCallback(it.next());
            }
        }
    }

    private final void callbackEvent(CallbackImpl<OnBTEventCallback> callbackImpl) {
        if (callbackImpl == null) {
            return;
        }
        CallbackRunnable callbackRunnable = new CallbackRunnable(this.callbacks, callbackImpl);
        if (Thread.currentThread().getId() == Looper.getMainLooper().getThread().getId()) {
            callbackRunnable.run();
        } else {
            this.uiHandler.post(callbackRunnable);
        }
    }

    @Override // com.eyevue.glassapp.bluetooth.ota.OnBTEventCallback
    public void onAdapterChange(final boolean z) {
        callbackEvent(new CallbackImpl<OnBTEventCallback>() { // from class: com.eyevue.glassapp.bluetooth.ota.BTEventCbHelper.onAdapterChange.1
            @Override // com.eyevue.glassapp.bluetooth.ota.BTEventCbHelper.CallbackImpl
            public void onCallback(OnBTEventCallback onBTEventCallback) {
                md8.checkNotNullParameter(onBTEventCallback, "callback");
                onBTEventCallback.onAdapterChange(z);
            }
        });
    }

    @Override // com.eyevue.glassapp.bluetooth.ota.OnBTEventCallback
    public void onBleMtuChange(@gib final BluetoothDevice bluetoothDevice, final int i, final int i2) {
        callbackEvent(new CallbackImpl<OnBTEventCallback>() { // from class: com.eyevue.glassapp.bluetooth.ota.BTEventCbHelper.onBleMtuChange.1
            @Override // com.eyevue.glassapp.bluetooth.ota.BTEventCbHelper.CallbackImpl
            public void onCallback(OnBTEventCallback onBTEventCallback) {
                md8.checkNotNullParameter(onBTEventCallback, "callback");
                onBTEventCallback.onBleMtuChange(bluetoothDevice, i, i2);
            }
        });
    }

    @Override // com.eyevue.glassapp.bluetooth.ota.OnBTEventCallback
    public void onDeviceConnection(@gib final BluetoothDevice bluetoothDevice, final int i, final int i2) {
        callbackEvent(new CallbackImpl<OnBTEventCallback>() { // from class: com.eyevue.glassapp.bluetooth.ota.BTEventCbHelper.onDeviceConnection.1
            @Override // com.eyevue.glassapp.bluetooth.ota.BTEventCbHelper.CallbackImpl
            public void onCallback(OnBTEventCallback onBTEventCallback) {
                md8.checkNotNullParameter(onBTEventCallback, "callback");
                onBTEventCallback.onDeviceConnection(bluetoothDevice, i, i2);
            }
        });
    }

    @Override // com.eyevue.glassapp.bluetooth.ota.OnBTEventCallback
    public void onDiscovery(@gib final BluetoothDevice bluetoothDevice, @gib final BleScanInfo bleScanInfo) {
        callbackEvent(new CallbackImpl<OnBTEventCallback>() { // from class: com.eyevue.glassapp.bluetooth.ota.BTEventCbHelper.onDiscovery.1
            @Override // com.eyevue.glassapp.bluetooth.ota.BTEventCbHelper.CallbackImpl
            public void onCallback(OnBTEventCallback onBTEventCallback) {
                md8.checkNotNullParameter(onBTEventCallback, "callback");
                onBTEventCallback.onDiscovery(bluetoothDevice, bleScanInfo);
            }
        });
    }

    @Override // com.eyevue.glassapp.bluetooth.ota.OnBTEventCallback
    public void onDiscoveryChange(final boolean z, final int i) {
        callbackEvent(new CallbackImpl<OnBTEventCallback>() { // from class: com.eyevue.glassapp.bluetooth.ota.BTEventCbHelper.onDiscoveryChange.1
            @Override // com.eyevue.glassapp.bluetooth.ota.BTEventCbHelper.CallbackImpl
            public void onCallback(OnBTEventCallback onBTEventCallback) {
                md8.checkNotNullParameter(onBTEventCallback, "callback");
                onBTEventCallback.onDiscoveryChange(z, i);
            }
        });
    }

    @Override // com.eyevue.glassapp.bluetooth.ota.OnBTEventCallback
    public void onReceiveData(@gib final BluetoothDevice bluetoothDevice, final int i, @gib final UUID uuid, @gib final byte[] bArr) {
        callbackEvent(new CallbackImpl<OnBTEventCallback>() { // from class: com.eyevue.glassapp.bluetooth.ota.BTEventCbHelper.onReceiveData.1
            @Override // com.eyevue.glassapp.bluetooth.ota.BTEventCbHelper.CallbackImpl
            public void onCallback(OnBTEventCallback onBTEventCallback) {
                md8.checkNotNullParameter(onBTEventCallback, "callback");
                onBTEventCallback.onReceiveData(bluetoothDevice, i, uuid, bArr);
            }
        });
    }

    public final void registerCallback(@yfb OnBTEventCallback onBTEventCallback) {
        md8.checkNotNullParameter(onBTEventCallback, "callback");
        if (this.callbacks.contains(onBTEventCallback)) {
            return;
        }
        this.callbacks.add(onBTEventCallback);
    }

    public final void release() {
        this.callbacks.clear();
        this.uiHandler.removeCallbacksAndMessages(null);
    }

    public final void unregisterCallback(@yfb OnBTEventCallback onBTEventCallback) {
        md8.checkNotNullParameter(onBTEventCallback, "callback");
        if (this.callbacks.isEmpty()) {
            return;
        }
        this.callbacks.remove(onBTEventCallback);
    }
}
