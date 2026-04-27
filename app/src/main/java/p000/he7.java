package p000;

import p000.o34;

/* JADX INFO: loaded from: classes7.dex */
public abstract class he7 extends dr9 implements o34 {
    public /* synthetic */ he7(jt3 jt3Var) {
        this();
    }

    @Override // p000.o34
    @gib
    @q64(level = u64.f86866b, message = "Deprecated without replacement as an internal method never intended for public use")
    public Object delay(long j, @yfb zy2<? super bth> zy2Var) {
        return o34.C10164a.delay(this, j, zy2Var);
    }

    @Override // p000.dr9
    @yfb
    public abstract he7 getImmediate();

    @yfb
    public yf4 invokeOnTimeout(long j, @yfb Runnable runnable, @yfb e13 e13Var) {
        return o34.C10164a.invokeOnTimeout(this, j, runnable, e13Var);
    }

    private he7() {
    }
}
