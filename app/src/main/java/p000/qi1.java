package p000;

import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import java.util.Arrays;
import java.util.UUID;

/* JADX INFO: loaded from: classes6.dex */
public class qi1<T> {

    /* JADX INFO: renamed from: a */
    public final T f74482a;

    /* JADX INFO: renamed from: b */
    public final byte[] f74483b;

    public qi1(@efb T t, byte[] bArr) {
        this.f74482a = t;
        this.f74483b = bArr;
    }

    public static <T> qi1<T> create(T t, byte[] bArr) {
        return new qi1<>(t, bArr);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof qi1)) {
            return false;
        }
        qi1 qi1Var = (qi1) obj;
        return Arrays.equals(qi1Var.f74483b, this.f74483b) && qi1Var.f74482a.equals(this.f74482a);
    }

    public int hashCode() {
        return this.f74482a.hashCode() ^ Arrays.hashCode(this.f74483b);
    }

    public String toString() {
        String simpleName;
        T t = this.f74482a;
        if (t instanceof BluetoothGattCharacteristic) {
            simpleName = BluetoothGattCharacteristic.class.getSimpleName() + c0b.f15433c + ((BluetoothGattCharacteristic) this.f74482a).getUuid().toString() + c0b.f15434d;
        } else if (t instanceof BluetoothGattDescriptor) {
            simpleName = BluetoothGattDescriptor.class.getSimpleName() + c0b.f15433c + ((BluetoothGattDescriptor) this.f74482a).getUuid().toString() + c0b.f15434d;
        } else if (t instanceof UUID) {
            simpleName = UUID.class.getSimpleName() + c0b.f15433c + this.f74482a.toString() + c0b.f15434d;
        } else {
            simpleName = t.getClass().getSimpleName();
        }
        return getClass().getSimpleName() + "[first=" + simpleName + ", second=" + Arrays.toString(this.f74483b) + "]";
    }
}
