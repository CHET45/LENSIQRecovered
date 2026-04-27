package p000;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
@yjd
public final class xn2 implements eyd {

    /* JADX INFO: renamed from: b */
    public static final int f98558b = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final x13 f98559a;

    public xn2(@yfb x13 x13Var) {
        this.f98559a = x13Var;
    }

    @yfb
    public final x13 getCoroutineScope() {
        return this.f98559a;
    }

    @Override // p000.eyd
    public void onAbandoned() {
        y13.cancel(this.f98559a, new p39());
    }

    @Override // p000.eyd
    public void onForgotten() {
        y13.cancel(this.f98559a, new p39());
    }

    @Override // p000.eyd
    public void onRemembered() {
    }
}
