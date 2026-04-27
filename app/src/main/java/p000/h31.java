package p000;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/BitVector\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,4151:1\n1#2:4152\n*E\n"})
@e0g(parameters = 0)
public final class h31 {

    /* JADX INFO: renamed from: d */
    public static final int f42154d = 8;

    /* JADX INFO: renamed from: a */
    public long f42155a;

    /* JADX INFO: renamed from: b */
    public long f42156b;

    /* JADX INFO: renamed from: c */
    @gib
    public long[] f42157c;

    public final boolean get(int i) {
        int i2;
        if (i < 0 || i >= getSize()) {
            throw new IllegalStateException(("Index " + i + " out of bound").toString());
        }
        if (i < 64) {
            return ((1 << i) & this.f42155a) != 0;
        }
        if (i < 128) {
            return ((1 << (i - 64)) & this.f42156b) != 0;
        }
        long[] jArr = this.f42157c;
        if (jArr != null && (i / 64) - 2 < jArr.length) {
            return ((1 << (i % 64)) & jArr[i2]) != 0;
        }
        return false;
    }

    public final int getSize() {
        long[] jArr = this.f42157c;
        if (jArr != null) {
            return (jArr.length + 2) * 64;
        }
        return 128;
    }

    public final int nextClear(int i) {
        int size = getSize();
        while (i < size) {
            if (!get(i)) {
                return i;
            }
            i++;
        }
        return Integer.MAX_VALUE;
    }

    public final int nextSet(int i) {
        int size = getSize();
        while (i < size) {
            if (get(i)) {
                return i;
            }
            i++;
        }
        return Integer.MAX_VALUE;
    }

    public final void set(int i, boolean z) {
        if (i < 64) {
            long j = 1 << i;
            this.f42155a = z ? this.f42155a | j : this.f42155a & (~j);
            return;
        }
        if (i < 128) {
            long j2 = 1 << (i - 64);
            this.f42156b = z ? this.f42156b | j2 : this.f42156b & (~j2);
            return;
        }
        int i2 = i / 64;
        int i3 = i2 - 2;
        long j3 = 1 << (i % 64);
        long[] jArrCopyOf = this.f42157c;
        if (jArrCopyOf == null) {
            jArrCopyOf = new long[i2 - 1];
            this.f42157c = jArrCopyOf;
        }
        if (i3 >= jArrCopyOf.length) {
            jArrCopyOf = Arrays.copyOf(jArrCopyOf, i2 - 1);
            md8.checkNotNullExpressionValue(jArrCopyOf, "copyOf(this, newSize)");
            this.f42157c = jArrCopyOf;
        }
        long j4 = jArrCopyOf[i3];
        jArrCopyOf[i3] = z ? j3 | j4 : (~j3) & j4;
    }

    public final void setRange(int i, int i2) {
        while (i < i2) {
            set(i, true);
            i++;
        }
    }

    @yfb
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BitVector [");
        int size = getSize();
        boolean z = true;
        for (int i = 0; i < size; i++) {
            if (get(i)) {
                if (!z) {
                    sb.append(", ");
                }
                sb.append(i);
                z = false;
            }
        }
        sb.append(C4584d2.f28243l);
        String string = sb.toString();
        md8.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
