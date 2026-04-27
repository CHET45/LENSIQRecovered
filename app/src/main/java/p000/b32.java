package p000;

import android.bluetooth.BluetoothAdapter;
import p000.a32;

/* JADX INFO: loaded from: classes6.dex */
@ue3
@wkd
@zqe
public final class b32 implements jo5<BluetoothAdapter> {

    /* JADX INFO: renamed from: b32$a */
    public static final class C1715a {

        /* JADX INFO: renamed from: a */
        public static final b32 f12515a = new b32();

        private C1715a() {
        }
    }

    public static b32 create() {
        return C1715a.f12515a;
    }

    @hib
    public static BluetoothAdapter provideBluetoothAdapter() {
        return a32.AbstractC0031d.m94f();
    }

    @Override // p000.hid
    @hib
    public BluetoothAdapter get() {
        return provideBluetoothAdapter();
    }
}
