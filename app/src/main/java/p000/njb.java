package p000;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.content.Context;
import com.eyevue.glassapp.bluetooth.ota.ConfigHelper;
import com.eyevue.glassapp.bluetooth.ota.OnBTEventCallback;
import com.eyevue.glassapp.bluetooth.ota.ble.BluetoothHelper;
import com.eyevue.glassapp.bluetooth.ota.spp.SppManager;
import com.eyevue.glassapp.utils.AppUtil;
import com.jieli.jl_bt_ota.impl.AbstractC3831a;
import com.jieli.jl_bt_ota.impl.RcspAuth;
import java.util.UUID;

/* JADX INFO: loaded from: classes6.dex */
@e0g(parameters = 0)
public final class njb extends AbstractC3831a {

    /* JADX INFO: renamed from: k0 */
    public static final int f64760k0 = 8;

    /* JADX INFO: renamed from: h0 */
    @yfb
    public final ConfigHelper f64761h0;

    /* JADX INFO: renamed from: i0 */
    @yfb
    public final BluetoothHelper f64762i0;

    /* JADX INFO: renamed from: j0 */
    @yfb
    public final C9907a f64763j0;

    /* JADX INFO: renamed from: njb$a */
    public static final class C9907a extends OnBTEventCallback {
        public C9907a() {
        }

        @Override // com.eyevue.glassapp.bluetooth.ota.OnBTEventCallback
        public void onBleMtuChange(BluetoothDevice bluetoothDevice, int i, int i2) {
            super.onBleMtuChange(bluetoothDevice, i, i2);
            njb njbVar = njb.this;
            njbVar.onMtuChanged(njbVar.f64762i0.getConnectedGatt(), i, i2);
        }

        @Override // com.eyevue.glassapp.bluetooth.ota.OnBTEventCallback
        public void onDeviceConnection(BluetoothDevice bluetoothDevice, int i, int i2) {
            super.onDeviceConnection(bluetoothDevice, i, i2);
            int iChangeConnectStatus = AppUtil.changeConnectStatus(i2);
            dh8.m9157i(njb.this.f90274a, "onDeviceConnection", "device : " + njb.this.printDeviceInfo(bluetoothDevice) + ", way = " + i + ", status ：" + i2 + ", change status : " + iChangeConnectStatus);
            njb.this.onBtDeviceConnection(bluetoothDevice, iChangeConnectStatus);
        }

        @Override // com.eyevue.glassapp.bluetooth.ota.OnBTEventCallback
        public void onReceiveData(BluetoothDevice bluetoothDevice, int i, UUID uuid, byte[] bArr) {
            super.onReceiveData(bluetoothDevice, i, uuid, bArr);
            dh8.m9152d(njb.this.f90274a, "onReceiveData", "device : " + njb.this.printDeviceInfo(bluetoothDevice) + ", way = " + i + ",\nuuid = " + uuid + ", data ：" + pk1.byte2HexStr(bArr));
            if (i != 1 || md8.areEqual(SppManager.UUID_SPP, uuid)) {
                njb.this.onReceiveDeviceData(bluetoothDevice, bArr);
            } else {
                dh8.m9152d(njb.this.f90274a, "onReceiveData", "skip spec");
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public njb(@yfb Context context) {
        super(context);
        md8.checkNotNullParameter(context, "context");
        ConfigHelper companion = ConfigHelper.Companion.getInstance();
        this.f64761h0 = companion;
        BluetoothHelper companion2 = BluetoothHelper.Companion.getInstance();
        this.f64762i0 = companion2;
        C9907a c9907a = new C9907a();
        this.f64763j0 = c9907a;
        j91 j91Var = new j91();
        j91Var.setPriority(!companion.isBleWay() ? 1 : 0);
        j91Var.setUseReconnect(companion.isUseCustomReConnectWay() && companion.isHidDevice());
        j91Var.setUseAuthDevice(true);
        j91Var.setMtu(500);
        j91Var.setNeedChangeMtu(false);
        j91Var.setUseJLServer(false);
        j91Var.setBleScanMode(2);
        configure(j91Var);
        RcspAuth.setAuthTimeout(5000L);
        companion2.registerCallback(c9907a);
        if (companion2.isConnected()) {
            onBtDeviceConnection(companion2.getConnectedDevice(), 1);
            if (companion.isBleWay()) {
                onMtuChanged(companion2.getConnectedGatt(), companion2.getBleMtu() + 3, 0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String printDeviceInfo(BluetoothDevice bluetoothDevice) {
        return v91.printBtDeviceInfo(this.f90279f, bluetoothDevice);
    }

    @Override // p000.op7
    public void connectBluetoothDevice(@gib BluetoothDevice bluetoothDevice) {
        if (this.f64762i0.connectBleDevice(bluetoothDevice)) {
            return;
        }
        onBtDeviceConnection(bluetoothDevice, 2);
    }

    @Override // p000.op7
    public void disconnectBluetoothDevice(@gib BluetoothDevice bluetoothDevice) {
        this.f64762i0.disconnectDevice(bluetoothDevice);
    }

    @Override // p000.op7
    @gib
    public BluetoothGatt getConnectedBluetoothGatt() {
        return this.f64762i0.getConnectedGatt();
    }

    @Override // p000.op7
    @gib
    public BluetoothDevice getConnectedDevice() {
        return this.f64762i0.getConnectedDevice();
    }

    @Override // com.jieli.jl_bt_ota.impl.AbstractC3831a, p000.w81, p000.a91, p000.v81, p000.mq7
    public void release() {
        super.release();
        this.f64762i0.unregisterCallback(this.f64763j0);
        this.f64762i0.destroy();
    }

    @Override // p000.op7
    public boolean sendDataToDevice(@gib BluetoothDevice bluetoothDevice, @gib byte[] bArr) {
        dh8.m9152d(this.f90274a, "sendDataToDevice", "device : " + printDeviceInfo(bluetoothDevice) + "\ndata = [" + pk1.byte2HexStr(bArr) + C4584d2.f28243l);
        return this.f64762i0.writeDataToDevice(bluetoothDevice, bArr);
    }

    public final void setReconnectAddr(@gib String str) {
    }
}
