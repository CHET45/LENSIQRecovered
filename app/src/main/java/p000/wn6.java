package p000;

import androidx.compose.p002ui.InterfaceC0701e;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public final class wn6 extends InterfaceC0701e.d implements shh {

    /* JADX INFO: renamed from: X */
    @yfb
    public qy6<? super mv8, bth> f94826X;

    /* JADX INFO: renamed from: Y */
    @yfb
    public final Object f94827Y = f94825Z;

    /* JADX INFO: renamed from: Z */
    @yfb
    public static final C14703a f94825Z = new C14703a(null);

    /* JADX INFO: renamed from: M1 */
    public static final int f94824M1 = 8;

    /* JADX INFO: renamed from: wn6$a */
    public static final class C14703a {
        public /* synthetic */ C14703a(jt3 jt3Var) {
            this();
        }

        private C14703a() {
        }
    }

    public wn6(@yfb qy6<? super mv8, bth> qy6Var) {
        this.f94826X = qy6Var;
    }

    @yfb
    public final qy6<mv8, bth> getOnPositioned() {
        return this.f94826X;
    }

    @Override // p000.shh
    @yfb
    public Object getTraverseKey() {
        return this.f94827Y;
    }

    public final void onFocusBoundsChanged(@gib mv8 mv8Var) {
        this.f94826X.invoke(mv8Var);
        wn6 wn6Var = (wn6) thh.findNearestAncestor(this);
        if (wn6Var != null) {
            wn6Var.onFocusBoundsChanged(mv8Var);
        }
    }

    public final void setOnPositioned(@yfb qy6<? super mv8, bth> qy6Var) {
        this.f94826X = qy6Var;
    }
}
