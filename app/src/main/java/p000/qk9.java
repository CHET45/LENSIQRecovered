package p000;

import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
@yjd
public final class qk9 extends fbd<long[]> {

    /* JADX INFO: renamed from: a */
    @yfb
    public long[] f74754a;

    /* JADX INFO: renamed from: b */
    public int f74755b;

    public qk9(@yfb long[] jArr) {
        md8.checkNotNullParameter(jArr, "bufferWithData");
        this.f74754a = jArr;
        this.f74755b = jArr.length;
        ensureCapacity$kotlinx_serialization_core(10);
    }

    public final void append$kotlinx_serialization_core(long j) {
        fbd.ensureCapacity$kotlinx_serialization_core$default(this, 0, 1, null);
        long[] jArr = this.f74754a;
        int position$kotlinx_serialization_core = getPosition$kotlinx_serialization_core();
        this.f74755b = position$kotlinx_serialization_core + 1;
        jArr[position$kotlinx_serialization_core] = j;
    }

    @Override // p000.fbd
    public void ensureCapacity$kotlinx_serialization_core(int i) {
        long[] jArr = this.f74754a;
        if (jArr.length < i) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, kpd.coerceAtLeast(i, jArr.length * 2));
            md8.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
            this.f74754a = jArrCopyOf;
        }
    }

    @Override // p000.fbd
    public int getPosition$kotlinx_serialization_core() {
        return this.f74755b;
    }

    @Override // p000.fbd
    @yfb
    public long[] build$kotlinx_serialization_core() {
        long[] jArrCopyOf = Arrays.copyOf(this.f74754a, getPosition$kotlinx_serialization_core());
        md8.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
        return jArrCopyOf;
    }
}
