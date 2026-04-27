package p000;

import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
@yjd
public final class raf extends fbd<short[]> {

    /* JADX INFO: renamed from: a */
    @yfb
    public short[] f77611a;

    /* JADX INFO: renamed from: b */
    public int f77612b;

    public raf(@yfb short[] sArr) {
        md8.checkNotNullParameter(sArr, "bufferWithData");
        this.f77611a = sArr;
        this.f77612b = sArr.length;
        ensureCapacity$kotlinx_serialization_core(10);
    }

    public final void append$kotlinx_serialization_core(short s) {
        fbd.ensureCapacity$kotlinx_serialization_core$default(this, 0, 1, null);
        short[] sArr = this.f77611a;
        int position$kotlinx_serialization_core = getPosition$kotlinx_serialization_core();
        this.f77612b = position$kotlinx_serialization_core + 1;
        sArr[position$kotlinx_serialization_core] = s;
    }

    @Override // p000.fbd
    public void ensureCapacity$kotlinx_serialization_core(int i) {
        short[] sArr = this.f77611a;
        if (sArr.length < i) {
            short[] sArrCopyOf = Arrays.copyOf(sArr, kpd.coerceAtLeast(i, sArr.length * 2));
            md8.checkNotNullExpressionValue(sArrCopyOf, "copyOf(...)");
            this.f77611a = sArrCopyOf;
        }
    }

    @Override // p000.fbd
    public int getPosition$kotlinx_serialization_core() {
        return this.f77612b;
    }

    @Override // p000.fbd
    @yfb
    public short[] build$kotlinx_serialization_core() {
        short[] sArrCopyOf = Arrays.copyOf(this.f77611a, getPosition$kotlinx_serialization_core());
        md8.checkNotNullExpressionValue(sArrCopyOf, "copyOf(...)");
        return sArrCopyOf;
    }
}
