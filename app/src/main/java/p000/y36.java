package p000;

import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
@yjd
public final class y36 extends fbd<float[]> {

    /* JADX INFO: renamed from: a */
    @yfb
    public float[] f100209a;

    /* JADX INFO: renamed from: b */
    public int f100210b;

    public y36(@yfb float[] fArr) {
        md8.checkNotNullParameter(fArr, "bufferWithData");
        this.f100209a = fArr;
        this.f100210b = fArr.length;
        ensureCapacity$kotlinx_serialization_core(10);
    }

    public final void append$kotlinx_serialization_core(float f) {
        fbd.ensureCapacity$kotlinx_serialization_core$default(this, 0, 1, null);
        float[] fArr = this.f100209a;
        int position$kotlinx_serialization_core = getPosition$kotlinx_serialization_core();
        this.f100210b = position$kotlinx_serialization_core + 1;
        fArr[position$kotlinx_serialization_core] = f;
    }

    @Override // p000.fbd
    public void ensureCapacity$kotlinx_serialization_core(int i) {
        float[] fArr = this.f100209a;
        if (fArr.length < i) {
            float[] fArrCopyOf = Arrays.copyOf(fArr, kpd.coerceAtLeast(i, fArr.length * 2));
            md8.checkNotNullExpressionValue(fArrCopyOf, "copyOf(...)");
            this.f100209a = fArrCopyOf;
        }
    }

    @Override // p000.fbd
    public int getPosition$kotlinx_serialization_core() {
        return this.f100210b;
    }

    @Override // p000.fbd
    @yfb
    public float[] build$kotlinx_serialization_core() {
        float[] fArrCopyOf = Arrays.copyOf(this.f100209a, getPosition$kotlinx_serialization_core());
        md8.checkNotNullExpressionValue(fArrCopyOf, "copyOf(...)");
        return fArrCopyOf;
    }
}
