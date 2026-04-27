package p000;

import android.bluetooth.BluetoothGatt;

/* JADX INFO: loaded from: classes6.dex */
public class h51 extends c51 {

    /* JADX INFO: renamed from: d */
    public static final int f42386d = -1;

    /* JADX INFO: renamed from: a */
    @hib
    public final BluetoothGatt f42387a;

    /* JADX INFO: renamed from: b */
    public final int f42388b;

    /* JADX INFO: renamed from: c */
    public final i51 f42389c;

    @Deprecated
    public h51(int i, i51 i51Var) {
        super(createMessage(null, i, i51Var));
        this.f42387a = null;
        this.f42388b = i;
        this.f42389c = i51Var;
    }

    @igg({"DefaultLocale"})
    private static String createMessage(@hib BluetoothGatt bluetoothGatt, int i, i51 i51Var) {
        if (i == -1) {
            return String.format("GATT exception from MAC address %s, with type %s", getMacAddress(bluetoothGatt), i51Var);
        }
        return String.format("GATT exception from %s, status %d (%s), type %s. (Look up status 0x%02x here %s)", pj9.commonMacMessage(bluetoothGatt), Integer.valueOf(i), p27.getGattCallbackStatusDescription(i), i51Var, Integer.valueOf(i), "https://cs.android.com/android/platform/superproject/+/master:packages/modules/Bluetooth/system/stack/include/gatt_api.h");
    }

    public i51 getBleGattOperationType() {
        return this.f42389c;
    }

    public String getMacAddress() {
        return getMacAddress(this.f42387a);
    }

    public int getStatus() {
        return this.f42388b;
    }

    private static String getMacAddress(@hib BluetoothGatt bluetoothGatt) {
        if (bluetoothGatt == null || bluetoothGatt.getDevice() == null) {
            return null;
        }
        return bluetoothGatt.getDevice().getAddress();
    }

    public h51(@efb BluetoothGatt bluetoothGatt, int i, i51 i51Var) {
        super(createMessage(bluetoothGatt, i, i51Var));
        this.f42387a = bluetoothGatt;
        this.f42388b = i;
        this.f42389c = i51Var;
    }

    public h51(BluetoothGatt bluetoothGatt, i51 i51Var) {
        this(bluetoothGatt, -1, i51Var);
    }
}
