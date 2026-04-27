package p000;

import android.bluetooth.BluetoothGattCharacteristic;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import p000.p7e;

/* JADX INFO: loaded from: classes6.dex */
public class t41 extends c51 {

    /* JADX INFO: renamed from: c */
    @Deprecated
    public static final int f83671c = -1;

    /* JADX INFO: renamed from: d */
    public static final int f83672d = 1;

    /* JADX INFO: renamed from: e */
    public static final int f83673e = 2;

    /* JADX INFO: renamed from: f */
    public static final int f83674f = 3;

    /* JADX INFO: renamed from: a */
    public final BluetoothGattCharacteristic f83675a;

    /* JADX INFO: renamed from: b */
    public final int f83676b;

    /* JADX INFO: renamed from: t41$a */
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC12908a {
    }

    @Deprecated
    public t41(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        super(createMessage(bluetoothGattCharacteristic, -1));
        this.f83675a = bluetoothGattCharacteristic;
        this.f83676b = -1;
    }

    private static String createMessage(BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
        return reasonDescription(i) + " (code " + i + ") with characteristic UUID " + bluetoothGattCharacteristic.getUuid();
    }

    private static String reasonDescription(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "Unknown error" : "Cannot write client characteristic config descriptor" : "Cannot find client characteristic config descriptor" : "Cannot set local notification";
    }

    public BluetoothGattCharacteristic getBluetoothGattCharacteristic() {
        return this.f83675a;
    }

    public int getReason() {
        return this.f83676b;
    }

    @p7e({p7e.EnumC10826a.f69935b})
    public t41(BluetoothGattCharacteristic bluetoothGattCharacteristic, int i, Throwable th) {
        super(createMessage(bluetoothGattCharacteristic, i), th);
        this.f83675a = bluetoothGattCharacteristic;
        this.f83676b = i;
    }
}
