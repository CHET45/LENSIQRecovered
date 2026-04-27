package p000;

import androidx.compose.p002ui.InterfaceC0701e;

/* JADX INFO: loaded from: classes.dex */
public final class vp4 extends InterfaceC0701e.d implements fp4 {

    /* JADX INFO: renamed from: X */
    @yfb
    public qy6<? super ov2, bth> f91906X;

    public vp4(@yfb qy6<? super ov2, bth> qy6Var) {
        this.f91906X = qy6Var;
    }

    @Override // p000.fp4
    public void draw(@yfb ov2 ov2Var) {
        this.f91906X.invoke(ov2Var);
    }

    @yfb
    public final qy6<ov2, bth> getOnDraw() {
        return this.f91906X;
    }

    public final void setOnDraw(@yfb qy6<? super ov2, bth> qy6Var) {
        this.f91906X = qy6Var;
    }
}
