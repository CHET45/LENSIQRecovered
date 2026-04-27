package p000;

import androidx.compose.foundation.C0617l;
import androidx.compose.p002ui.InterfaceC0701e;

/* JADX INFO: loaded from: classes.dex */
public final class wre extends InterfaceC0701e.d implements rxe {

    /* JADX INFO: renamed from: M1 */
    public boolean f95225M1;

    /* JADX INFO: renamed from: V1 */
    public boolean f95226V1;

    /* JADX INFO: renamed from: X */
    @yfb
    public C0617l f95227X;

    /* JADX INFO: renamed from: Y */
    public boolean f95228Y;

    /* JADX INFO: renamed from: Z */
    @gib
    public s36 f95229Z;

    /* JADX INFO: renamed from: wre$a */
    public static final class C14758a extends tt8 implements ny6<Float> {
        public C14758a() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p000.ny6
        @yfb
        public final Float invoke() {
            return Float.valueOf(wre.this.getState().getValue());
        }
    }

    /* JADX INFO: renamed from: wre$b */
    public static final class C14759b extends tt8 implements ny6<Float> {
        public C14759b() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p000.ny6
        @yfb
        public final Float invoke() {
            return Float.valueOf(wre.this.getState().getMaxValue());
        }
    }

    public wre(@yfb C0617l c0617l, boolean z, @gib s36 s36Var, boolean z2, boolean z3) {
        this.f95227X = c0617l;
        this.f95228Y = z;
        this.f95229Z = s36Var;
        this.f95225M1 = z2;
        this.f95226V1 = z3;
    }

    @Override // p000.rxe
    public void applySemantics(@yfb eye eyeVar) {
        bye.setTraversalGroup(eyeVar, true);
        ire ireVar = new ire(new C14758a(), new C14759b(), this.f95228Y);
        if (this.f95226V1) {
            bye.setVerticalScrollAxisRange(eyeVar, ireVar);
        } else {
            bye.setHorizontalScrollAxisRange(eyeVar, ireVar);
        }
    }

    @gib
    public final s36 getFlingBehavior() {
        return this.f95229Z;
    }

    public final boolean getReverseScrolling() {
        return this.f95228Y;
    }

    @yfb
    public final C0617l getState() {
        return this.f95227X;
    }

    public final boolean isScrollable() {
        return this.f95225M1;
    }

    public final boolean isVertical() {
        return this.f95226V1;
    }

    public final void setFlingBehavior(@gib s36 s36Var) {
        this.f95229Z = s36Var;
    }

    public final void setReverseScrolling(boolean z) {
        this.f95228Y = z;
    }

    public final void setScrollable(boolean z) {
        this.f95225M1 = z;
    }

    public final void setState(@yfb C0617l c0617l) {
        this.f95227X = c0617l;
    }

    public final void setVertical(boolean z) {
        this.f95226V1 = z;
    }
}
