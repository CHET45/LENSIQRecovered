package p000;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import p000.a32;
import p000.uee;

/* JADX INFO: loaded from: classes6.dex */
@is2
public class gfe {

    /* JADX INFO: renamed from: a */
    public final woe f39710a;

    /* JADX INFO: renamed from: b */
    public final c91 f39711b;

    /* JADX INFO: renamed from: c */
    public final fe4 f39712c;

    /* JADX INFO: renamed from: d */
    public final m9b f39713d;

    /* JADX INFO: renamed from: e */
    public final vjd<uee.EnumC13520d> f39714e = vjd.create();

    /* JADX INFO: renamed from: f */
    public final C6288c<ffe> f39715f = new C6288c<>();

    /* JADX INFO: renamed from: g */
    public final C6288c<qi1<UUID>> f39716g = new C6288c<>();

    /* JADX INFO: renamed from: h */
    public final C6288c<qi1<UUID>> f39717h = new C6288c<>();

    /* JADX INFO: renamed from: i */
    public final xxd<lw1> f39718i = vjd.create().toSerialized();

    /* JADX INFO: renamed from: j */
    public final C6288c<qi1<BluetoothGattDescriptor>> f39719j = new C6288c<>();

    /* JADX INFO: renamed from: k */
    public final C6288c<qi1<BluetoothGattDescriptor>> f39720k = new C6288c<>();

    /* JADX INFO: renamed from: l */
    public final C6288c<Integer> f39721l = new C6288c<>();

    /* JADX INFO: renamed from: m */
    public final C6288c<Integer> f39722m = new C6288c<>();

    /* JADX INFO: renamed from: n */
    public final C6288c<es2> f39723n = new C6288c<>();

    /* JADX INFO: renamed from: o */
    public final sy6<h51, vkb<?>> f39724o = new C6286a();

    /* JADX INFO: renamed from: p */
    public final BluetoothGattCallback f39725p = new C6287b();

    /* JADX INFO: renamed from: gfe$a */
    public class C6286a implements sy6<h51, vkb<?>> {
        public C6286a() {
        }

        @Override // p000.sy6
        public vkb<?> apply(h51 h51Var) {
            return vkb.error(h51Var);
        }
    }

    /* JADX INFO: renamed from: gfe$b */
    public class C6287b extends BluetoothGattCallback {
        public C6287b() {
        }

        private boolean isDisconnectedOrDisconnecting(int i) {
            return i == 0 || i == 3;
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicChanged(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
            pj9.logCallback("onCharacteristicChanged", bluetoothGatt, bluetoothGattCharacteristic, true);
            gfe.this.f39713d.m17153a(bluetoothGatt, bluetoothGattCharacteristic);
            super.onCharacteristicChanged(bluetoothGatt, bluetoothGattCharacteristic);
            if (gfe.this.f39718i.hasObservers()) {
                gfe.this.f39718i.accept(new lw1(bluetoothGattCharacteristic.getUuid(), Integer.valueOf(bluetoothGattCharacteristic.getInstanceId()), bluetoothGattCharacteristic.getValue()));
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicRead(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
            pj9.logCallback("onCharacteristicRead", bluetoothGatt, i, bluetoothGattCharacteristic, true);
            gfe.this.f39713d.m17159g(bluetoothGatt, bluetoothGattCharacteristic, i);
            super.onCharacteristicRead(bluetoothGatt, bluetoothGattCharacteristic, i);
            if (!gfe.this.f39716g.m11680a() || gfe.m11678c(gfe.this.f39716g, bluetoothGatt, bluetoothGattCharacteristic, i, i51.f45761d)) {
                return;
            }
            gfe.this.f39716g.f39728a.accept(new qi1<>(bluetoothGattCharacteristic.getUuid(), bluetoothGattCharacteristic.getValue()));
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicWrite(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
            pj9.logCallback("onCharacteristicWrite", bluetoothGatt, i, bluetoothGattCharacteristic, false);
            gfe.this.f39713d.m17163k(bluetoothGatt, bluetoothGattCharacteristic, i);
            super.onCharacteristicWrite(bluetoothGatt, bluetoothGattCharacteristic, i);
            if (!gfe.this.f39717h.m11680a() || gfe.m11678c(gfe.this.f39717h, bluetoothGatt, bluetoothGattCharacteristic, i, i51.f45762e)) {
                return;
            }
            gfe.this.f39717h.f39728a.accept(new qi1<>(bluetoothGattCharacteristic.getUuid(), bluetoothGattCharacteristic.getValue()));
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onConnectionStateChange(BluetoothGatt bluetoothGatt, int i, int i2) {
            pj9.logCallback("onConnectionStateChange", bluetoothGatt, i, i2);
            gfe.this.f39713d.m17154b(bluetoothGatt, i, i2);
            super.onConnectionStateChange(bluetoothGatt, i, i2);
            gfe.this.f39711b.updateBluetoothGatt(bluetoothGatt);
            if (isDisconnectedOrDisconnecting(i2)) {
                gfe.this.f39712c.onDisconnectedException(new b51(bluetoothGatt.getDevice().getAddress(), i));
            } else if (i != 0) {
                gfe.this.f39712c.onGattConnectionStateException(new h51(bluetoothGatt, i, i51.f45759b));
            }
            gfe.this.f39714e.accept(gfe.m11676a(i2));
        }

        public void onConnectionUpdated(BluetoothGatt bluetoothGatt, int i, int i2, int i3, int i4) {
            pj9.logConnectionUpdateCallback("onConnectionUpdated", bluetoothGatt, i4, i, i2, i3);
            gfe.this.f39713d.m17158f(bluetoothGatt, i, i2, i3, i4);
            if (!gfe.this.f39723n.m11680a() || gfe.m11677b(gfe.this.f39723n, bluetoothGatt, i4, i51.f45770m)) {
                return;
            }
            gfe.this.f39723n.f39728a.accept(new fs2(i, i2, i3));
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onDescriptorRead(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
            pj9.logCallback("onDescriptorRead", bluetoothGatt, i, bluetoothGattDescriptor, true);
            gfe.this.f39713d.m17155c(bluetoothGatt, bluetoothGattDescriptor, i);
            super.onDescriptorRead(bluetoothGatt, bluetoothGattDescriptor, i);
            if (!gfe.this.f39719j.m11680a() || gfe.m11679d(gfe.this.f39719j, bluetoothGatt, bluetoothGattDescriptor, i, i51.f45765h)) {
                return;
            }
            gfe.this.f39719j.f39728a.accept(new qi1<>(bluetoothGattDescriptor, bluetoothGattDescriptor.getValue()));
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onDescriptorWrite(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
            pj9.logCallback("onDescriptorWrite", bluetoothGatt, i, bluetoothGattDescriptor, false);
            gfe.this.f39713d.m17156d(bluetoothGatt, bluetoothGattDescriptor, i);
            super.onDescriptorWrite(bluetoothGatt, bluetoothGattDescriptor, i);
            if (!gfe.this.f39720k.m11680a() || gfe.m11679d(gfe.this.f39720k, bluetoothGatt, bluetoothGattDescriptor, i, i51.f45766i)) {
                return;
            }
            gfe.this.f39720k.f39728a.accept(new qi1<>(bluetoothGattDescriptor, bluetoothGattDescriptor.getValue()));
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onMtuChanged(BluetoothGatt bluetoothGatt, int i, int i2) {
            pj9.logCallback("onMtuChanged", bluetoothGatt, i2, i);
            gfe.this.f39713d.m17157e(bluetoothGatt, i, i2);
            super.onMtuChanged(bluetoothGatt, i, i2);
            if (!gfe.this.f39722m.m11680a() || gfe.m11677b(gfe.this.f39722m, bluetoothGatt, i2, i51.f45769l)) {
                return;
            }
            gfe.this.f39722m.f39728a.accept(Integer.valueOf(i));
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onReadRemoteRssi(BluetoothGatt bluetoothGatt, int i, int i2) {
            pj9.logCallback("onReadRemoteRssi", bluetoothGatt, i2, i);
            gfe.this.f39713d.m17160h(bluetoothGatt, i, i2);
            super.onReadRemoteRssi(bluetoothGatt, i, i2);
            if (!gfe.this.f39721l.m11680a() || gfe.m11677b(gfe.this.f39721l, bluetoothGatt, i2, i51.f45768k)) {
                return;
            }
            gfe.this.f39721l.f39728a.accept(Integer.valueOf(i));
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onReliableWriteCompleted(BluetoothGatt bluetoothGatt, int i) {
            pj9.logCallback("onReliableWriteCompleted", bluetoothGatt, i);
            gfe.this.f39713d.m17161i(bluetoothGatt, i);
            super.onReliableWriteCompleted(bluetoothGatt, i);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onServicesDiscovered(BluetoothGatt bluetoothGatt, int i) {
            pj9.logCallback("onServicesDiscovered", bluetoothGatt, i);
            gfe.this.f39713d.m17162j(bluetoothGatt, i);
            super.onServicesDiscovered(bluetoothGatt, i);
            if (!gfe.this.f39715f.m11680a() || gfe.m11677b(gfe.this.f39715f, bluetoothGatt, i, i51.f45760c)) {
                return;
            }
            gfe.this.f39715f.f39728a.accept(new ffe(bluetoothGatt.getServices()));
        }
    }

    /* JADX INFO: renamed from: gfe$c */
    public static class C6288c<T> {

        /* JADX INFO: renamed from: a */
        public final vjd<T> f39728a = vjd.create();

        /* JADX INFO: renamed from: b */
        public final vjd<h51> f39729b = vjd.create();

        /* JADX INFO: renamed from: a */
        public boolean m11680a() {
            return this.f39728a.hasObservers() || this.f39729b.hasObservers();
        }
    }

    @b28
    public gfe(@w8b(a32.C0034g.f250d) woe woeVar, c91 c91Var, fe4 fe4Var, m9b m9bVar) {
        this.f39710a = woeVar;
        this.f39711b = c91Var;
        this.f39712c = fe4Var;
        this.f39713d = m9bVar;
    }

    /* JADX INFO: renamed from: a */
    public static uee.EnumC13520d m11676a(int i) {
        return i != 1 ? i != 2 ? i != 3 ? uee.EnumC13520d.DISCONNECTED : uee.EnumC13520d.DISCONNECTING : uee.EnumC13520d.CONNECTED : uee.EnumC13520d.CONNECTING;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m11677b(C6288c<?> c6288c, BluetoothGatt bluetoothGatt, int i, i51 i51Var) {
        return isException(i) && propagateStatusError(c6288c, new h51(bluetoothGatt, i, i51Var));
    }

    /* JADX INFO: renamed from: c */
    public static boolean m11678c(C6288c<?> c6288c, BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i, i51 i51Var) {
        return isException(i) && propagateStatusError(c6288c, new f51(bluetoothGatt, bluetoothGattCharacteristic, i, i51Var));
    }

    /* JADX INFO: renamed from: d */
    public static boolean m11679d(C6288c<?> c6288c, BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i, i51 i51Var) {
        return isException(i) && propagateStatusError(c6288c, new g51(bluetoothGatt, bluetoothGattDescriptor, i, i51Var));
    }

    private static boolean isException(int i) {
        return i != 0;
    }

    private static boolean propagateStatusError(C6288c<?> c6288c, h51 h51Var) {
        c6288c.f39729b.accept(h51Var);
        return true;
    }

    private <T> vkb<T> withDisconnectionHandling(C6288c<T> c6288c) {
        return vkb.merge(this.f39712c.asErrorOnlyObservable(), c6288c.f39728a, c6288c.f39729b.flatMap(this.f39724o));
    }

    public BluetoothGattCallback getBluetoothGattCallback() {
        return this.f39725p;
    }

    public vkb<es2> getConnectionParametersUpdates() {
        return withDisconnectionHandling(this.f39723n).delay(0L, TimeUnit.SECONDS, this.f39710a);
    }

    public vkb<lw1> getOnCharacteristicChanged() {
        return vkb.merge(this.f39712c.asErrorOnlyObservable(), this.f39718i).delay(0L, TimeUnit.SECONDS, this.f39710a);
    }

    public vkb<qi1<UUID>> getOnCharacteristicRead() {
        return withDisconnectionHandling(this.f39716g).delay(0L, TimeUnit.SECONDS, this.f39710a);
    }

    public vkb<qi1<UUID>> getOnCharacteristicWrite() {
        return withDisconnectionHandling(this.f39717h).delay(0L, TimeUnit.SECONDS, this.f39710a);
    }

    public vkb<uee.EnumC13520d> getOnConnectionStateChange() {
        return this.f39714e.delay(0L, TimeUnit.SECONDS, this.f39710a);
    }

    public vkb<qi1<BluetoothGattDescriptor>> getOnDescriptorRead() {
        return withDisconnectionHandling(this.f39719j).delay(0L, TimeUnit.SECONDS, this.f39710a);
    }

    public vkb<qi1<BluetoothGattDescriptor>> getOnDescriptorWrite() {
        return withDisconnectionHandling(this.f39720k).delay(0L, TimeUnit.SECONDS, this.f39710a);
    }

    public vkb<Integer> getOnMtuChanged() {
        return withDisconnectionHandling(this.f39722m).delay(0L, TimeUnit.SECONDS, this.f39710a);
    }

    public vkb<Integer> getOnRssiRead() {
        return withDisconnectionHandling(this.f39721l).delay(0L, TimeUnit.SECONDS, this.f39710a);
    }

    public vkb<ffe> getOnServicesDiscovered() {
        return withDisconnectionHandling(this.f39715f).delay(0L, TimeUnit.SECONDS, this.f39710a);
    }

    public <T> vkb<T> observeDisconnect() {
        return this.f39712c.asErrorOnlyObservable();
    }

    public void setHiddenNativeCallback(wj7 wj7Var) {
        this.f39713d.m17165m(wj7Var);
    }

    public void setNativeCallback(BluetoothGattCallback bluetoothGattCallback) {
        this.f39713d.m17164l(bluetoothGattCallback);
    }
}
