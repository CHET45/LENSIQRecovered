package p000;

import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
@ph5
@yh5
@yjd
public final class qph extends fbd<pph> {

    /* JADX INFO: renamed from: a */
    @yfb
    public long[] f75088a;

    /* JADX INFO: renamed from: b */
    public int f75089b;

    public /* synthetic */ qph(long[] jArr, jt3 jt3Var) {
        this(jArr);
    }

    /* JADX INFO: renamed from: append-VKZWuLQ$kotlinx_serialization_core, reason: not valid java name */
    public final void m31984appendVKZWuLQ$kotlinx_serialization_core(long j) {
        fbd.ensureCapacity$kotlinx_serialization_core$default(this, 0, 1, null);
        long[] jArr = this.f75088a;
        int position$kotlinx_serialization_core = getPosition$kotlinx_serialization_core();
        this.f75089b = position$kotlinx_serialization_core + 1;
        pph.m31848setk8EXiF4(jArr, position$kotlinx_serialization_core, j);
    }

    @Override // p000.fbd
    public /* bridge */ /* synthetic */ pph build$kotlinx_serialization_core() {
        return pph.m31836boximpl(m31985buildY2RjT0g$kotlinx_serialization_core());
    }

    @yfb
    /* JADX INFO: renamed from: build-Y2RjT0g$kotlinx_serialization_core, reason: not valid java name */
    public long[] m31985buildY2RjT0g$kotlinx_serialization_core() {
        long[] jArrCopyOf = Arrays.copyOf(this.f75088a, getPosition$kotlinx_serialization_core());
        md8.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
        return pph.m31838constructorimpl(jArrCopyOf);
    }

    @Override // p000.fbd
    public void ensureCapacity$kotlinx_serialization_core(int i) {
        if (pph.m31844getSizeimpl(this.f75088a) < i) {
            long[] jArr = this.f75088a;
            long[] jArrCopyOf = Arrays.copyOf(jArr, kpd.coerceAtLeast(i, pph.m31844getSizeimpl(jArr) * 2));
            md8.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
            this.f75088a = pph.m31838constructorimpl(jArrCopyOf);
        }
    }

    @Override // p000.fbd
    public int getPosition$kotlinx_serialization_core() {
        return this.f75089b;
    }

    private qph(long[] jArr) {
        md8.checkNotNullParameter(jArr, "bufferWithData");
        this.f75088a = jArr;
        this.f75089b = pph.m31844getSizeimpl(jArr);
        ensureCapacity$kotlinx_serialization_core(10);
    }
}
