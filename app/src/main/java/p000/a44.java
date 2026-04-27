package p000;

import android.content.Context;
import p000.xn6;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public final class a44 implements ywc {

    /* JADX INFO: renamed from: d */
    public static final int f354d = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final xn6.InterfaceC15211b f355a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final Context f356b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final Object f357c = new Object();

    public a44(@yfb xn6.InterfaceC15211b interfaceC15211b, @yfb Context context) {
        this.f355a = interfaceC15211b;
        this.f356b = context;
    }

    @Override // p000.ywc
    @gib
    public Object awaitLoad(@yfb xn6 xn6Var, @yfb zy2<Object> zy2Var) {
        if (!(xn6Var instanceof AbstractC11083ps)) {
            return this.f355a.load(xn6Var);
        }
        AbstractC11083ps abstractC11083ps = (AbstractC11083ps) xn6Var;
        return abstractC11083ps.getTypefaceLoader().awaitLoad(this.f356b, abstractC11083ps, zy2Var);
    }

    @Override // p000.ywc
    @yfb
    public Object getCacheKey() {
        return this.f357c;
    }

    @yfb
    public final xn6.InterfaceC15211b getLoader$ui_text_release() {
        return this.f355a;
    }

    @Override // p000.ywc
    @gib
    public Object loadBlocking(@yfb xn6 xn6Var) {
        if (!(xn6Var instanceof AbstractC11083ps)) {
            return this.f355a.load(xn6Var);
        }
        AbstractC11083ps abstractC11083ps = (AbstractC11083ps) xn6Var;
        return abstractC11083ps.getTypefaceLoader().loadBlocking(this.f356b, abstractC11083ps);
    }
}
