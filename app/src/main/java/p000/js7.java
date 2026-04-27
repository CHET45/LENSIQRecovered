package p000;

import android.bluetooth.BluetoothGattCharacteristic;
import java.util.Locale;

/* JADX INFO: loaded from: classes6.dex */
public class js7 {

    /* JADX INFO: renamed from: a */
    public final ow1 f51694a;

    @b28
    public js7(ow1 ow1Var) {
        this.f51694a = ow1Var;
    }

    public String createMismatchMessage(BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
        return String.format(Locale.getDefault(), "Characteristic %s supports properties: %s (%d) does not have any property matching %s (%d)", pj9.getUuidToLog(bluetoothGattCharacteristic.getUuid()), this.f51694a.propertiesIntToString(bluetoothGattCharacteristic.getProperties()), Integer.valueOf(bluetoothGattCharacteristic.getProperties()), this.f51694a.propertiesIntToString(i), Integer.valueOf(i));
    }
}
