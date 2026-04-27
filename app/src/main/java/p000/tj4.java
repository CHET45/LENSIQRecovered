package p000;

import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
@yjd
public final class tj4 extends fbd<double[]> {

    /* JADX INFO: renamed from: a */
    @yfb
    public double[] f85025a;

    /* JADX INFO: renamed from: b */
    public int f85026b;

    public tj4(@yfb double[] dArr) {
        md8.checkNotNullParameter(dArr, "bufferWithData");
        this.f85025a = dArr;
        this.f85026b = dArr.length;
        ensureCapacity$kotlinx_serialization_core(10);
    }

    public final void append$kotlinx_serialization_core(double d) {
        fbd.ensureCapacity$kotlinx_serialization_core$default(this, 0, 1, null);
        double[] dArr = this.f85025a;
        int position$kotlinx_serialization_core = getPosition$kotlinx_serialization_core();
        this.f85026b = position$kotlinx_serialization_core + 1;
        dArr[position$kotlinx_serialization_core] = d;
    }

    @Override // p000.fbd
    public void ensureCapacity$kotlinx_serialization_core(int i) {
        double[] dArr = this.f85025a;
        if (dArr.length < i) {
            double[] dArrCopyOf = Arrays.copyOf(dArr, kpd.coerceAtLeast(i, dArr.length * 2));
            md8.checkNotNullExpressionValue(dArrCopyOf, "copyOf(...)");
            this.f85025a = dArrCopyOf;
        }
    }

    @Override // p000.fbd
    public int getPosition$kotlinx_serialization_core() {
        return this.f85026b;
    }

    @Override // p000.fbd
    @yfb
    public double[] build$kotlinx_serialization_core() {
        double[] dArrCopyOf = Arrays.copyOf(this.f85025a, getPosition$kotlinx_serialization_core());
        md8.checkNotNullExpressionValue(dArrCopyOf, "copyOf(...)");
        return dArrCopyOf;
    }
}
