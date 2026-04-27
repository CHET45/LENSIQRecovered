package p000;

import p000.InterfaceC9407mm;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nAlignment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Alignment.kt\nandroidx/compose/ui/BiasAbsoluteAlignment\n+ 2 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,273:1\n26#2:274\n*S KotlinDebug\n*F\n+ 1 Alignment.kt\nandroidx/compose/ui/BiasAbsoluteAlignment\n*L\n246#1:274\n*E\n"})
@vw7
public final class n11 implements InterfaceC9407mm {

    /* JADX INFO: renamed from: d */
    public static final int f62939d = 0;

    /* JADX INFO: renamed from: b */
    public final float f62940b;

    /* JADX INFO: renamed from: c */
    public final float f62941c;

    /* JADX INFO: renamed from: n11$a */
    @dwf({"SMAP\nAlignment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Alignment.kt\nandroidx/compose/ui/BiasAbsoluteAlignment$Horizontal\n+ 2 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,273:1\n26#2:274\n*S KotlinDebug\n*F\n+ 1 Alignment.kt\nandroidx/compose/ui/BiasAbsoluteAlignment$Horizontal\n*L\n269#1:274\n*E\n"})
    @vw7
    public static final class C9641a implements InterfaceC9407mm.b {

        /* JADX INFO: renamed from: b */
        public static final int f62942b = 0;

        /* JADX INFO: renamed from: a */
        public final float f62943a;

        public C9641a(float f) {
            this.f62943a = f;
        }

        public static /* synthetic */ C9641a copy$default(C9641a c9641a, float f, int i, Object obj) {
            if ((i & 1) != 0) {
                f = c9641a.f62943a;
            }
            return c9641a.copy(f);
        }

        @Override // p000.InterfaceC9407mm.b
        public int align(int i, int i2, @yfb ov8 ov8Var) {
            return Math.round(((i2 - i) / 2.0f) * (1 + this.f62943a));
        }

        public final float component1() {
            return this.f62943a;
        }

        @yfb
        public final C9641a copy(float f) {
            return new C9641a(f);
        }

        public boolean equals(@gib Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C9641a) && Float.compare(this.f62943a, ((C9641a) obj).f62943a) == 0;
        }

        public final float getBias() {
            return this.f62943a;
        }

        public int hashCode() {
            return Float.hashCode(this.f62943a);
        }

        @yfb
        public String toString() {
            return "Horizontal(bias=" + this.f62943a + ')';
        }
    }

    public n11(float f, float f2) {
        this.f62940b = f;
        this.f62941c = f2;
    }

    public static /* synthetic */ n11 copy$default(n11 n11Var, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = n11Var.f62940b;
        }
        if ((i & 2) != 0) {
            f2 = n11Var.f62941c;
        }
        return n11Var.copy(f, f2);
    }

    @Override // p000.InterfaceC9407mm
    /* JADX INFO: renamed from: align-KFBX0sM */
    public long mo30996alignKFBX0sM(long j, long j2, @yfb ov8 ov8Var) {
        long jIntSize = s78.IntSize(r78.m32087getWidthimpl(j2) - r78.m32087getWidthimpl(j), r78.m32086getHeightimpl(j2) - r78.m32086getHeightimpl(j));
        float f = 1;
        return b78.IntOffset(Math.round((r78.m32087getWidthimpl(jIntSize) / 2.0f) * (this.f62940b + f)), Math.round((r78.m32086getHeightimpl(jIntSize) / 2.0f) * (f + this.f62941c)));
    }

    public final float component1() {
        return this.f62940b;
    }

    public final float component2() {
        return this.f62941c;
    }

    @yfb
    public final n11 copy(float f, float f2) {
        return new n11(f, f2);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n11)) {
            return false;
        }
        n11 n11Var = (n11) obj;
        return Float.compare(this.f62940b, n11Var.f62940b) == 0 && Float.compare(this.f62941c, n11Var.f62941c) == 0;
    }

    public final float getHorizontalBias() {
        return this.f62940b;
    }

    public final float getVerticalBias() {
        return this.f62941c;
    }

    public int hashCode() {
        return (Float.hashCode(this.f62940b) * 31) + Float.hashCode(this.f62941c);
    }

    @yfb
    public String toString() {
        return "BiasAbsoluteAlignment(horizontalBias=" + this.f62940b + ", verticalBias=" + this.f62941c + ')';
    }
}
