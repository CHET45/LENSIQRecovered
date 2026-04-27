package p000;

import android.util.Pair;
import java.util.Arrays;
import java.util.UUID;

/* JADX INFO: loaded from: classes6.dex */
public class lw1 extends nw1 {

    /* JADX INFO: renamed from: a */
    public final byte[] f58951a;

    public lw1(UUID uuid, Integer num, byte[] bArr) {
        super(uuid, num);
        this.f58951a = bArr;
    }

    @Override // android.util.Pair
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lw1)) {
            return (obj instanceof nw1) && super.equals(obj);
        }
        if (super.equals(obj)) {
            return Arrays.equals(this.f58951a, ((lw1) obj).f58951a);
        }
        return false;
    }

    @Override // android.util.Pair
    public int hashCode() {
        return (super.hashCode() * 31) + Arrays.hashCode(this.f58951a);
    }

    @Override // p000.nw1, android.util.Pair
    public String toString() {
        return "CharacteristicChangedEvent{UUID=" + ((UUID) ((Pair) this).first).toString() + ", instanceId=" + ((Integer) ((Pair) this).second).toString() + ", data=" + Arrays.toString(this.f58951a) + '}';
    }
}
