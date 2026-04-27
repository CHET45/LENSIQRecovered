package p000;

import android.bluetooth.BluetoothDevice;

/* JADX INFO: loaded from: classes6.dex */
public class af1 extends sq0<np7> implements np7 {
    @Override // p000.np7
    public void onA2dpStatus(final BluetoothDevice bluetoothDevice, final int i) {
        m22184a(new qp7() { // from class: qe1
            @Override // p000.qp7
            public final void onHandle(Object obj) {
                ((np7) obj).onA2dpStatus(bluetoothDevice, i);
            }
        });
    }

    @Override // p000.np7
    public void onAdapterStatus(final boolean z, final boolean z2) {
        m22184a(new qp7() { // from class: te1
            @Override // p000.qp7
            public final void onHandle(Object obj) {
                ((np7) obj).onAdapterStatus(z, z2);
            }
        });
    }

    @Override // p000.np7
    public void onBleDataBlockChanged(final BluetoothDevice bluetoothDevice, final int i, final int i2) {
        m22184a(new qp7() { // from class: re1
            @Override // p000.qp7
            public final void onHandle(Object obj) {
                ((np7) obj).onBleDataBlockChanged(bluetoothDevice, i, i2);
            }
        });
    }

    @Override // p000.np7
    public void onBtDeviceConnection(final BluetoothDevice bluetoothDevice, final int i) {
        m22184a(new qp7() { // from class: xe1
            @Override // p000.qp7
            public final void onHandle(Object obj) {
                ((np7) obj).onBtDeviceConnection(bluetoothDevice, i);
            }
        });
    }

    @Override // p000.np7
    public void onConnection(final BluetoothDevice bluetoothDevice, final int i) {
        m22184a(new qp7() { // from class: se1
            @Override // p000.qp7
            public final void onHandle(Object obj) {
                ((np7) obj).onConnection(bluetoothDevice, i);
            }
        });
    }

    @Override // p000.np7
    public void onDiscovery(final BluetoothDevice bluetoothDevice, final n51 n51Var) {
        m22184a(new qp7() { // from class: pe1
            @Override // p000.qp7
            public final void onHandle(Object obj) {
                ((np7) obj).onDiscovery(bluetoothDevice, n51Var);
            }
        });
    }

    @Override // p000.np7
    public void onDiscoveryStatus(final boolean z, final boolean z2) {
        m22184a(new qp7() { // from class: we1
            @Override // p000.qp7
            public final void onHandle(Object obj) {
                ((np7) obj).onDiscoveryStatus(z, z2);
            }
        });
    }

    @Override // p000.np7
    public void onError(final cr0 cr0Var) {
        m22184a(new qp7() { // from class: ye1
            @Override // p000.qp7
            public final void onHandle(Object obj) {
                ((np7) obj).onError(cr0Var);
            }
        });
    }

    @Override // p000.np7
    public void onHfpStatus(final BluetoothDevice bluetoothDevice, final int i) {
        m22184a(new qp7() { // from class: ze1
            @Override // p000.qp7
            public final void onHandle(Object obj) {
                ((np7) obj).onHfpStatus(bluetoothDevice, i);
            }
        });
    }

    @Override // p000.np7
    public void onMandatoryUpgrade(final BluetoothDevice bluetoothDevice) {
        m22184a(new qp7() { // from class: ue1
            @Override // p000.qp7
            public final void onHandle(Object obj) {
                ((np7) obj).onMandatoryUpgrade(bluetoothDevice);
            }
        });
    }

    @Override // p000.np7
    public void onReceiveCommand(final BluetoothDevice bluetoothDevice, final ob2 ob2Var) {
        m22184a(new qp7() { // from class: ve1
            @Override // p000.qp7
            public final void onHandle(Object obj) {
                ((np7) obj).onReceiveCommand(bluetoothDevice, ob2Var);
            }
        });
    }
}
