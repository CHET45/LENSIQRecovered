package p000;

import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
@yjd
public final class a68 extends fbd<int[]> {

    /* JADX INFO: renamed from: a */
    @yfb
    public int[] f502a;

    /* JADX INFO: renamed from: b */
    public int f503b;

    public a68(@yfb int[] iArr) {
        md8.checkNotNullParameter(iArr, "bufferWithData");
        this.f502a = iArr;
        this.f503b = iArr.length;
        ensureCapacity$kotlinx_serialization_core(10);
    }

    public final void append$kotlinx_serialization_core(int i) {
        fbd.ensureCapacity$kotlinx_serialization_core$default(this, 0, 1, null);
        int[] iArr = this.f502a;
        int position$kotlinx_serialization_core = getPosition$kotlinx_serialization_core();
        this.f503b = position$kotlinx_serialization_core + 1;
        iArr[position$kotlinx_serialization_core] = i;
    }

    @Override // p000.fbd
    public void ensureCapacity$kotlinx_serialization_core(int i) {
        int[] iArr = this.f502a;
        if (iArr.length < i) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, kpd.coerceAtLeast(i, iArr.length * 2));
            md8.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
            this.f502a = iArrCopyOf;
        }
    }

    @Override // p000.fbd
    public int getPosition$kotlinx_serialization_core() {
        return this.f503b;
    }

    @Override // p000.fbd
    @yfb
    public int[] build$kotlinx_serialization_core() {
        int[] iArrCopyOf = Arrays.copyOf(this.f502a, getPosition$kotlinx_serialization_core());
        md8.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
        return iArrCopyOf;
    }
}
