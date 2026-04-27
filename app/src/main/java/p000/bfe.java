package p000;

import android.bluetooth.BluetoothDevice;
import java.util.concurrent.atomic.AtomicBoolean;
import p000.js2;
import p000.uee;

/* JADX INFO: loaded from: classes6.dex */
@n94
public class bfe implements yee {

    /* JADX INFO: renamed from: a */
    public final BluetoothDevice f13648a;

    /* JADX INFO: renamed from: b */
    public final at2 f13649b;

    /* JADX INFO: renamed from: c */
    public final q01<uee.EnumC13520d> f13650c;

    /* JADX INFO: renamed from: d */
    public final jy1 f13651d;

    /* JADX INFO: renamed from: e */
    public final AtomicBoolean f13652e = new AtomicBoolean(false);

    @b28
    public bfe(BluetoothDevice bluetoothDevice, at2 at2Var, q01<uee.EnumC13520d> q01Var, jy1 jy1Var) {
        this.f13648a = bluetoothDevice;
        this.f13649b = at2Var;
        this.f13650c = q01Var;
        this.f13651d = jy1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$establishConnection$0() throws Throwable {
        this.f13652e.set(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ wub lambda$establishConnection$1(js2 js2Var) throws Throwable {
        return this.f13652e.compareAndSet(false, true) ? this.f13649b.prepareConnection(js2Var).doFinally(new InterfaceC7776j8() { // from class: afe
            @Override // p000.InterfaceC7776j8
            public final void run() throws Throwable {
                this.f1355a.lambda$establishConnection$0();
            }
        }) : vkb.error(new s41(this.f13648a.getAddress()));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bfe) {
            return this.f13648a.equals(((bfe) obj).f13648a);
        }
        return false;
    }

    @Override // p000.yee
    public vkb<uee> establishConnection(boolean z) {
        return establishConnection(new js2.C8045a().setAutoConnect(z).setSuppressIllegalOperationCheck(true).build());
    }

    @Override // p000.yee
    public BluetoothDevice getBluetoothDevice() {
        return this.f13648a;
    }

    @Override // p000.yee
    public uee.EnumC13520d getConnectionState() {
        return this.f13650c.getValue();
    }

    @Override // p000.yee
    public String getMacAddress() {
        return this.f13648a.getAddress();
    }

    @Override // p000.yee
    @hib
    public String getName() {
        return getName(false);
    }

    public int hashCode() {
        return this.f13648a.hashCode();
    }

    @Override // p000.yee
    public vkb<uee.EnumC13520d> observeConnectionStateChanges() {
        return this.f13650c.distinctUntilChanged().skip(1L);
    }

    public String toString() {
        return "RxBleDeviceImpl{" + pj9.commonMacMessage(this.f13648a.getAddress()) + ", name=" + getName(true) + '}';
    }

    private String getName(boolean z) {
        return (!z || this.f13651d.isConnectRuntimePermissionGranted()) ? this.f13648a.getName() : "[NO BLUETOOTH_CONNECT PERMISSION]";
    }

    @Override // p000.yee
    public vkb<uee> establishConnection(boolean z, w1h w1hVar) {
        return establishConnection(new js2.C8045a().setAutoConnect(z).setOperationTimeout(w1hVar).setSuppressIllegalOperationCheck(true).build());
    }

    public vkb<uee> establishConnection(final js2 js2Var) {
        return vkb.defer(new nfg() { // from class: zee
            @Override // p000.nfg
            public final Object get() {
                return this.f104945a.lambda$establishConnection$1(js2Var);
            }
        });
    }
}
