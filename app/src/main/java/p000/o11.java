package p000;

import p000.InterfaceC9407mm;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nAlignment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Alignment.kt\nandroidx/compose/ui/BiasAlignment\n+ 2 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,273:1\n26#2:274\n*S KotlinDebug\n*F\n+ 1 Alignment.kt\nandroidx/compose/ui/BiasAlignment\n*L\n174#1:274\n*E\n"})
@vw7
public final class o11 implements InterfaceC9407mm {

    /* JADX INFO: renamed from: d */
    public static final int f66192d = 0;

    /* JADX INFO: renamed from: b */
    public final float f66193b;

    /* JADX INFO: renamed from: c */
    public final float f66194c;

    /* JADX INFO: renamed from: o11$a */
    @dwf({"SMAP\nAlignment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Alignment.kt\nandroidx/compose/ui/BiasAlignment$Horizontal\n+ 2 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,273:1\n26#2:274\n*S KotlinDebug\n*F\n+ 1 Alignment.kt\nandroidx/compose/ui/BiasAlignment$Horizontal\n*L\n194#1:274\n*E\n"})
    @vw7
    public static final class C10136a implements InterfaceC9407mm.b {

        /* JADX INFO: renamed from: b */
        public static final int f66195b = 0;

        /* JADX INFO: renamed from: a */
        public final float f66196a;

        public C10136a(float f) {
            this.f66196a = f;
        }

        public static /* synthetic */ C10136a copy$default(C10136a c10136a, float f, int i, Object obj) {
            if ((i & 1) != 0) {
                f = c10136a.f66196a;
            }
            return c10136a.copy(f);
        }

        @Override // p000.InterfaceC9407mm.b
        public int align(int i, int i2, @yfb ov8 ov8Var) {
            return Math.round(((i2 - i) / 2.0f) * (1 + (ov8Var == ov8.Ltr ? this.f66196a : (-1) * this.f66196a)));
        }

        public final float component1() {
            return this.f66196a;
        }

        @yfb
        public final C10136a copy(float f) {
            return new C10136a(f);
        }

        public boolean equals(@gib Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C10136a) && Float.compare(this.f66196a, ((C10136a) obj).f66196a) == 0;
        }

        public final float getBias() {
            return this.f66196a;
        }

        public int hashCode() {
            return Float.hashCode(this.f66196a);
        }

        @yfb
        public String toString() {
            return "Horizontal(bias=" + this.f66196a + ')';
        }
    }

    /* JADX INFO: renamed from: o11$b */
    @dwf({"SMAP\nAlignment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Alignment.kt\nandroidx/compose/ui/BiasAlignment$Vertical\n+ 2 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,273:1\n26#2:274\n*S KotlinDebug\n*F\n+ 1 Alignment.kt\nandroidx/compose/ui/BiasAlignment$Vertical\n*L\n213#1:274\n*E\n"})
    @vw7
    public static final class C10137b implements InterfaceC9407mm.c {

        /* JADX INFO: renamed from: b */
        public static final int f66197b = 0;

        /* JADX INFO: renamed from: a */
        public final float f66198a;

        public C10137b(float f) {
            this.f66198a = f;
        }

        public static /* synthetic */ C10137b copy$default(C10137b c10137b, float f, int i, Object obj) {
            if ((i & 1) != 0) {
                f = c10137b.f66198a;
            }
            return c10137b.copy(f);
        }

        @Override // p000.InterfaceC9407mm.c
        public int align(int i, int i2) {
            return Math.round(((i2 - i) / 2.0f) * (1 + this.f66198a));
        }

        public final float component1() {
            return this.f66198a;
        }

        @yfb
        public final C10137b copy(float f) {
            return new C10137b(f);
        }

        public boolean equals(@gib Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C10137b) && Float.compare(this.f66198a, ((C10137b) obj).f66198a) == 0;
        }

        public final float getBias() {
            return this.f66198a;
        }

        public int hashCode() {
            return Float.hashCode(this.f66198a);
        }

        @yfb
        public String toString() {
            return "Vertical(bias=" + this.f66198a + ')';
        }
    }

    public o11(float f, float f2) {
        this.f66193b = f;
        this.f66194c = f2;
    }

    public static /* synthetic */ o11 copy$default(o11 o11Var, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = o11Var.f66193b;
        }
        if ((i & 2) != 0) {
            f2 = o11Var.f66194c;
        }
        return o11Var.copy(f, f2);
    }

    @Override // p000.InterfaceC9407mm
    /* JADX INFO: renamed from: align-KFBX0sM */
    public long mo30996alignKFBX0sM(long j, long j2, @yfb ov8 ov8Var) {
        float fM32087getWidthimpl = (r78.m32087getWidthimpl(j2) - r78.m32087getWidthimpl(j)) / 2.0f;
        float fM32086getHeightimpl = (r78.m32086getHeightimpl(j2) - r78.m32086getHeightimpl(j)) / 2.0f;
        float f = 1;
        return b78.IntOffset(Math.round(fM32087getWidthimpl * ((ov8Var == ov8.Ltr ? this.f66193b : (-1) * this.f66193b) + f)), Math.round(fM32086getHeightimpl * (f + this.f66194c)));
    }

    public final float component1() {
        return this.f66193b;
    }

    public final float component2() {
        return this.f66194c;
    }

    @yfb
    public final o11 copy(float f, float f2) {
        return new o11(f, f2);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o11)) {
            return false;
        }
        o11 o11Var = (o11) obj;
        return Float.compare(this.f66193b, o11Var.f66193b) == 0 && Float.compare(this.f66194c, o11Var.f66194c) == 0;
    }

    public final float getHorizontalBias() {
        return this.f66193b;
    }

    public final float getVerticalBias() {
        return this.f66194c;
    }

    public int hashCode() {
        return (Float.hashCode(this.f66193b) * 31) + Float.hashCode(this.f66194c);
    }

    @yfb
    public String toString() {
        return "BiasAlignment(horizontalBias=" + this.f66193b + ", verticalBias=" + this.f66194c + ')';
    }
}
