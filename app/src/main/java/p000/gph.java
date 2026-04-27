package p000;

import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
@ph5
@yh5
@yjd
public final class gph extends fbd<fph> {

    /* JADX INFO: renamed from: a */
    @yfb
    public int[] f40725a;

    /* JADX INFO: renamed from: b */
    public int f40726b;

    public /* synthetic */ gph(int[] iArr, jt3 jt3Var) {
        this(iArr);
    }

    /* JADX INFO: renamed from: append-WZ4Q5Ns$kotlinx_serialization_core, reason: not valid java name */
    public final void m29853appendWZ4Q5Ns$kotlinx_serialization_core(int i) {
        fbd.ensureCapacity$kotlinx_serialization_core$default(this, 0, 1, null);
        int[] iArr = this.f40725a;
        int position$kotlinx_serialization_core = getPosition$kotlinx_serialization_core();
        this.f40726b = position$kotlinx_serialization_core + 1;
        fph.m29595setVXSXFK8(iArr, position$kotlinx_serialization_core, i);
    }

    @Override // p000.fbd
    public /* bridge */ /* synthetic */ fph build$kotlinx_serialization_core() {
        return fph.m29583boximpl(m29854buildhP7Qyg$kotlinx_serialization_core());
    }

    @yfb
    /* JADX INFO: renamed from: build--hP7Qyg$kotlinx_serialization_core, reason: not valid java name */
    public int[] m29854buildhP7Qyg$kotlinx_serialization_core() {
        int[] iArrCopyOf = Arrays.copyOf(this.f40725a, getPosition$kotlinx_serialization_core());
        md8.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
        return fph.m29585constructorimpl(iArrCopyOf);
    }

    @Override // p000.fbd
    public void ensureCapacity$kotlinx_serialization_core(int i) {
        if (fph.m29591getSizeimpl(this.f40725a) < i) {
            int[] iArr = this.f40725a;
            int[] iArrCopyOf = Arrays.copyOf(iArr, kpd.coerceAtLeast(i, fph.m29591getSizeimpl(iArr) * 2));
            md8.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
            this.f40725a = fph.m29585constructorimpl(iArrCopyOf);
        }
    }

    @Override // p000.fbd
    public int getPosition$kotlinx_serialization_core() {
        return this.f40726b;
    }

    private gph(int[] iArr) {
        md8.checkNotNullParameter(iArr, "bufferWithData");
        this.f40725a = iArr;
        this.f40726b = fph.m29591getSizeimpl(iArr);
        ensureCapacity$kotlinx_serialization_core(10);
    }
}
