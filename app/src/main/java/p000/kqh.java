package p000;

import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
@ph5
@yh5
@yjd
public final class kqh extends fbd<jqh> {

    /* JADX INFO: renamed from: a */
    @yfb
    public short[] f55068a;

    /* JADX INFO: renamed from: b */
    public int f55069b;

    public /* synthetic */ kqh(short[] sArr, jt3 jt3Var) {
        this(sArr);
    }

    /* JADX INFO: renamed from: append-xj2QHRw$kotlinx_serialization_core, reason: not valid java name */
    public final void m30742appendxj2QHRw$kotlinx_serialization_core(short s) {
        fbd.ensureCapacity$kotlinx_serialization_core$default(this, 0, 1, null);
        short[] sArr = this.f55068a;
        int position$kotlinx_serialization_core = getPosition$kotlinx_serialization_core();
        this.f55069b = position$kotlinx_serialization_core + 1;
        jqh.m30556set01HTLdE(sArr, position$kotlinx_serialization_core, s);
    }

    @Override // p000.fbd
    public /* bridge */ /* synthetic */ jqh build$kotlinx_serialization_core() {
        return jqh.m30544boximpl(m30743buildamswpOA$kotlinx_serialization_core());
    }

    @yfb
    /* JADX INFO: renamed from: build-amswpOA$kotlinx_serialization_core, reason: not valid java name */
    public short[] m30743buildamswpOA$kotlinx_serialization_core() {
        short[] sArrCopyOf = Arrays.copyOf(this.f55068a, getPosition$kotlinx_serialization_core());
        md8.checkNotNullExpressionValue(sArrCopyOf, "copyOf(...)");
        return jqh.m30546constructorimpl(sArrCopyOf);
    }

    @Override // p000.fbd
    public void ensureCapacity$kotlinx_serialization_core(int i) {
        if (jqh.m30552getSizeimpl(this.f55068a) < i) {
            short[] sArr = this.f55068a;
            short[] sArrCopyOf = Arrays.copyOf(sArr, kpd.coerceAtLeast(i, jqh.m30552getSizeimpl(sArr) * 2));
            md8.checkNotNullExpressionValue(sArrCopyOf, "copyOf(...)");
            this.f55068a = jqh.m30546constructorimpl(sArrCopyOf);
        }
    }

    @Override // p000.fbd
    public int getPosition$kotlinx_serialization_core() {
        return this.f55069b;
    }

    private kqh(short[] sArr) {
        md8.checkNotNullParameter(sArr, "bufferWithData");
        this.f55068a = sArr;
        this.f55069b = jqh.m30552getSizeimpl(sArr);
        ensureCapacity$kotlinx_serialization_core(10);
    }
}
