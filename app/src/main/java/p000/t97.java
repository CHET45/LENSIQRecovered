package p000;

/* JADX INFO: loaded from: classes.dex */
public final class t97 implements eyd {

    /* JADX INFO: renamed from: a */
    @yfb
    public final s97 f84046a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final u97 f84047b;

    public t97(@yfb s97 s97Var) {
        this.f84046a = s97Var;
        this.f84047b = s97Var.createGraphicsLayer();
    }

    @yfb
    public final u97 getGraphicsLayer() {
        return this.f84047b;
    }

    @Override // p000.eyd
    public void onAbandoned() {
        this.f84046a.releaseGraphicsLayer(this.f84047b);
    }

    @Override // p000.eyd
    public void onForgotten() {
        this.f84046a.releaseGraphicsLayer(this.f84047b);
    }

    @Override // p000.eyd
    public void onRemembered() {
    }
}
