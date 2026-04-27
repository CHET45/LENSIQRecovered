package p000;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;
import okhttp3.HttpUrl;

/* JADX INFO: loaded from: classes6.dex */
public class pj9 {

    /* JADX INFO: renamed from: a */
    public static final char[] f71102a = "0123456789ABCDEF".toCharArray();

    /* JADX INFO: renamed from: pj9$a */
    public static class C10988a {

        /* JADX INFO: renamed from: a */
        public final UUID f71103a;

        /* JADX INFO: renamed from: b */
        public final byte[] f71104b;

        /* JADX INFO: renamed from: c */
        public final boolean f71105c;

        public C10988a(UUID uuid, byte[] bArr, boolean z) {
            this.f71103a = uuid;
            this.f71104b = bArr;
            this.f71105c = z;
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append("[uuid='");
            sb.append(pj9.getUuidToLog(this.f71103a));
            if (this.f71105c) {
                str = "', hexValue=" + pj9.bytesToHex(this.f71104b);
            } else {
                str = "'";
            }
            sb.append(str);
            sb.append(C4584d2.f28243l);
            return sb.toString();
        }
    }

    private pj9() {
    }

    public static String bytesToHex(byte[] bArr) {
        if (bArr == null) {
            return "null";
        }
        if (!kfe.getShouldLogAttributeValues()) {
            return "[...]";
        }
        int length = bArr.length;
        if (length == 0) {
            return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
        int i = length - 1;
        int i2 = (length * 2) + (i * 2);
        char[] cArr = new char[i2 + 2];
        for (int i3 = 0; i3 < length; i3++) {
            byte b = bArr[i3];
            int i4 = i3 * 2;
            int i5 = i4 + 1 + i4;
            char[] cArr2 = f71102a;
            cArr[i5] = cArr2[(b & 255) >>> 4];
            cArr[i5 + 1] = cArr2[b & 15];
        }
        for (int i6 = 0; i6 < i; i6++) {
            int i7 = i6 * 2;
            int i8 = i7 + 1 + i7;
            cArr[i8 + 2] = C4584d2.f28238g;
            cArr[i8 + 3] = ' ';
        }
        cArr[0] = C4584d2.f28242k;
        cArr[i2 + 1] = C4584d2.f28243l;
        return new String(cArr);
    }

    private static String commonCallbackMessage() {
        return " %24s()";
    }

    public static String commonMacMessage(BluetoothGatt bluetoothGatt) {
        return bluetoothGatt == null ? "MAC=null" : commonMacMessage(bluetoothGatt.getDevice().getAddress());
    }

    private static String commonStatusMessage() {
        return ", status=%d";
    }

    private static String commonValueMessage() {
        return ", value=%s";
    }

    public static String getUuidSetToLog(Set<UUID> set) {
        int size = set.size();
        String[] strArr = new String[size];
        Iterator<UUID> it = set.iterator();
        for (int i = 0; i < size; i++) {
            strArr[i] = getUuidToLog(it.next());
        }
        return Arrays.toString(strArr);
    }

    public static String getUuidToLog(UUID uuid) {
        return kfe.getUuidLogSetting() == 2 ? uuid.toString() : "...";
    }

    public static void logCallback(String str, BluetoothGatt bluetoothGatt, int i, BluetoothGattCharacteristic bluetoothGattCharacteristic, boolean z) {
        if (kfe.isAtLeast(4)) {
            kfe.m14726i(commonMacMessage(bluetoothGatt) + commonCallbackMessage() + commonStatusMessage() + commonValueMessage(), str, Integer.valueOf(i), new C10988a(bluetoothGattCharacteristic.getUuid(), bluetoothGattCharacteristic.getValue(), z));
        }
    }

    public static void logConnectionUpdateCallback(String str, BluetoothGatt bluetoothGatt, int i, int i2, int i3, int i4) {
        if (kfe.isAtLeast(4)) {
            kfe.m14726i(commonMacMessage(bluetoothGatt) + commonCallbackMessage() + commonStatusMessage() + ", interval=%d (%.2f ms), latency=%d, timeout=%d (%.0f ms)", str, Integer.valueOf(i), Integer.valueOf(i2), Float.valueOf(i2 * 1.25f), Integer.valueOf(i3), Integer.valueOf(i4), Float.valueOf(i4 * 10.0f));
        }
    }

    public static void logOperationFinished(z5c z5cVar, long j, long j2) {
        if (kfe.isAtLeast(3)) {
            kfe.m14722d("FINISHED %s(%d) in %d ms", z5cVar.getClass().getSimpleName(), Integer.valueOf(System.identityHashCode(z5cVar)), Long.valueOf(j2 - j));
        }
    }

    public static void logOperationQueued(z5c z5cVar) {
        if (kfe.isAtLeast(3)) {
            kfe.m14722d("QUEUED   %s(%d)", z5cVar.getClass().getSimpleName(), Integer.valueOf(System.identityHashCode(z5cVar)));
        }
    }

    public static void logOperationRemoved(z5c z5cVar) {
        if (kfe.isAtLeast(3)) {
            kfe.m14722d("REMOVED  %s(%d)", z5cVar.getClass().getSimpleName(), Integer.valueOf(System.identityHashCode(z5cVar)));
        }
    }

    public static void logOperationRunning(z5c z5cVar) {
        kfe.m14726i("RUNNING  %s", z5cVar);
    }

    public static void logOperationSkippedBecauseDisposedWhenAboutToRun(z5c z5cVar) {
        if (kfe.isAtLeast(2)) {
            kfe.m14728v("SKIPPED  %s(%d) just before running — is disposed", z5cVar.getClass().getSimpleName(), Integer.valueOf(System.identityHashCode(z5cVar)));
        }
    }

    public static void logOperationStarted(z5c z5cVar) {
        if (kfe.isAtLeast(3)) {
            kfe.m14722d("STARTED  %s(%d)", z5cVar.getClass().getSimpleName(), Integer.valueOf(System.identityHashCode(z5cVar)));
        }
    }

    public static C10988a wrap(BluetoothGattCharacteristic bluetoothGattCharacteristic, boolean z) {
        return new C10988a(bluetoothGattCharacteristic.getUuid(), bluetoothGattCharacteristic.getValue(), z);
    }

    public static C10988a wrap(BluetoothGattDescriptor bluetoothGattDescriptor, boolean z) {
        return new C10988a(bluetoothGattDescriptor.getUuid(), bluetoothGattDescriptor.getValue(), z);
    }

    public static String commonMacMessage(String str) {
        if (str == null) {
            return "MAC=null";
        }
        int macAddressLogSetting = kfe.getMacAddressLogSetting();
        if (macAddressLogSetting == 3) {
            str = str.substring(0, 15) + "XX";
        } else if (macAddressLogSetting == Integer.MAX_VALUE) {
            str = "XX:XX:XX:XX:XX:XX";
        }
        return String.format("MAC='%s'", str);
    }

    public static void logCallback(String str, BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, boolean z) {
        if (kfe.isAtLeast(4)) {
            kfe.m14726i(commonMacMessage(bluetoothGatt) + commonCallbackMessage() + commonValueMessage(), str, new C10988a(bluetoothGattCharacteristic.getUuid(), bluetoothGattCharacteristic.getValue(), z));
        }
    }

    public static void logCallback(String str, BluetoothGatt bluetoothGatt, int i, BluetoothGattDescriptor bluetoothGattDescriptor, boolean z) {
        if (kfe.isAtLeast(4)) {
            kfe.m14726i(commonMacMessage(bluetoothGatt) + commonCallbackMessage() + commonStatusMessage() + commonValueMessage(), str, Integer.valueOf(i), new C10988a(bluetoothGattDescriptor.getUuid(), bluetoothGattDescriptor.getValue(), z));
        }
    }

    public static void logCallback(String str, BluetoothGatt bluetoothGatt, int i) {
        if (kfe.isAtLeast(4)) {
            kfe.m14726i(commonMacMessage(bluetoothGatt) + commonCallbackMessage() + commonStatusMessage(), str, Integer.valueOf(i));
        }
    }

    public static void logCallback(String str, BluetoothGatt bluetoothGatt, int i, int i2) {
        if (kfe.isAtLeast(4)) {
            kfe.m14726i(commonMacMessage(bluetoothGatt) + commonCallbackMessage() + commonStatusMessage() + commonValueMessage(), str, Integer.valueOf(i), Integer.valueOf(i2));
        }
    }
}
