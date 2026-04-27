package p000;

import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
@yjd
public final class jv1 extends fbd<char[]> {

    /* JADX INFO: renamed from: a */
    @yfb
    public char[] f51993a;

    /* JADX INFO: renamed from: b */
    public int f51994b;

    public jv1(@yfb char[] cArr) {
        md8.checkNotNullParameter(cArr, "bufferWithData");
        this.f51993a = cArr;
        this.f51994b = cArr.length;
        ensureCapacity$kotlinx_serialization_core(10);
    }

    public final void append$kotlinx_serialization_core(char c) {
        fbd.ensureCapacity$kotlinx_serialization_core$default(this, 0, 1, null);
        char[] cArr = this.f51993a;
        int position$kotlinx_serialization_core = getPosition$kotlinx_serialization_core();
        this.f51994b = position$kotlinx_serialization_core + 1;
        cArr[position$kotlinx_serialization_core] = c;
    }

    @Override // p000.fbd
    public void ensureCapacity$kotlinx_serialization_core(int i) {
        char[] cArr = this.f51993a;
        if (cArr.length < i) {
            char[] cArrCopyOf = Arrays.copyOf(cArr, kpd.coerceAtLeast(i, cArr.length * 2));
            md8.checkNotNullExpressionValue(cArrCopyOf, "copyOf(...)");
            this.f51993a = cArrCopyOf;
        }
    }

    @Override // p000.fbd
    public int getPosition$kotlinx_serialization_core() {
        return this.f51994b;
    }

    @Override // p000.fbd
    @yfb
    public char[] build$kotlinx_serialization_core() {
        char[] cArrCopyOf = Arrays.copyOf(this.f51993a, getPosition$kotlinx_serialization_core());
        md8.checkNotNullExpressionValue(cArrCopyOf, "copyOf(...)");
        return cArrCopyOf;
    }
}
