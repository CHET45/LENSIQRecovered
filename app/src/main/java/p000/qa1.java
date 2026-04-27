package p000;

import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
@yjd
public final class qa1 extends fbd<boolean[]> {

    /* JADX INFO: renamed from: a */
    @yfb
    public boolean[] f73730a;

    /* JADX INFO: renamed from: b */
    public int f73731b;

    public qa1(@yfb boolean[] zArr) {
        md8.checkNotNullParameter(zArr, "bufferWithData");
        this.f73730a = zArr;
        this.f73731b = zArr.length;
        ensureCapacity$kotlinx_serialization_core(10);
    }

    public final void append$kotlinx_serialization_core(boolean z) {
        fbd.ensureCapacity$kotlinx_serialization_core$default(this, 0, 1, null);
        boolean[] zArr = this.f73730a;
        int position$kotlinx_serialization_core = getPosition$kotlinx_serialization_core();
        this.f73731b = position$kotlinx_serialization_core + 1;
        zArr[position$kotlinx_serialization_core] = z;
    }

    @Override // p000.fbd
    public void ensureCapacity$kotlinx_serialization_core(int i) {
        boolean[] zArr = this.f73730a;
        if (zArr.length < i) {
            boolean[] zArrCopyOf = Arrays.copyOf(zArr, kpd.coerceAtLeast(i, zArr.length * 2));
            md8.checkNotNullExpressionValue(zArrCopyOf, "copyOf(...)");
            this.f73730a = zArrCopyOf;
        }
    }

    @Override // p000.fbd
    public int getPosition$kotlinx_serialization_core() {
        return this.f73731b;
    }

    @Override // p000.fbd
    @yfb
    public boolean[] build$kotlinx_serialization_core() {
        boolean[] zArrCopyOf = Arrays.copyOf(this.f73730a, getPosition$kotlinx_serialization_core());
        md8.checkNotNullExpressionValue(zArrCopyOf, "copyOf(...)");
        return zArrCopyOf;
    }
}
