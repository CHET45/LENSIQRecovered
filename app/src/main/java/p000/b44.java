package p000;

import p000.xn6;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public final class b44 implements ywc {

    /* JADX INFO: renamed from: c */
    public static final int f12652c = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final xn6.InterfaceC15211b f12653a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final Object f12654b = new Object();

    public b44(@yfb xn6.InterfaceC15211b interfaceC15211b) {
        this.f12653a = interfaceC15211b;
    }

    @Override // p000.ywc
    @gib
    public Object awaitLoad(@yfb xn6 xn6Var, @yfb zy2<Object> zy2Var) {
        return this.f12653a.load(xn6Var);
    }

    @Override // p000.ywc
    @yfb
    public Object getCacheKey() {
        return this.f12654b;
    }

    @yfb
    public final xn6.InterfaceC15211b getLoader$ui_text_release() {
        return this.f12653a;
    }

    @Override // p000.ywc
    @yfb
    public Object loadBlocking(@yfb xn6 xn6Var) {
        return this.f12653a.load(xn6Var);
    }
}
