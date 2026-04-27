package p000;

import androidx.compose.p002ui.InterfaceC0701e;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public final class yo4 extends InterfaceC0701e.d implements fp4 {

    /* JADX INFO: renamed from: Y */
    public static final int f102387Y = 8;

    /* JADX INFO: renamed from: X */
    @yfb
    public qy6<? super ip4, bth> f102388X;

    public yo4(@yfb qy6<? super ip4, bth> qy6Var) {
        this.f102388X = qy6Var;
    }

    @Override // p000.fp4
    public void draw(@yfb ov2 ov2Var) {
        this.f102388X.invoke(ov2Var);
        ov2Var.drawContent();
    }

    @yfb
    public final qy6<ip4, bth> getOnDraw() {
        return this.f102388X;
    }

    public final void setOnDraw(@yfb qy6<? super ip4, bth> qy6Var) {
        this.f102388X = qy6Var;
    }
}
