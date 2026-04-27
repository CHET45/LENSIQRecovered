package p000;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class qrd<T> implements l2g<T>, kq1<T>, a17<T> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ l2g<T> f75399a;

    /* JADX INFO: renamed from: b */
    @gib
    public final jj8 f75400b;

    /* JADX WARN: Multi-variable type inference failed */
    public qrd(@yfb l2g<? extends T> l2gVar, @gib jj8 jj8Var) {
        this.f75399a = l2gVar;
        this.f75400b = jj8Var;
    }

    @Override // p000.q9f, p000.y56
    @gib
    public Object collect(@yfb t66<? super T> t66Var, @yfb zy2<?> zy2Var) {
        return this.f75399a.collect(t66Var, zy2Var);
    }

    @Override // p000.a17
    @yfb
    public y56<T> fuse(@yfb e13 e13Var, int i, @yfb gf1 gf1Var) {
        return n2g.fuseStateFlow(this, e13Var, i, gf1Var);
    }

    @Override // p000.q9f
    @yfb
    public List<T> getReplayCache() {
        return this.f75399a.getReplayCache();
    }

    @Override // p000.l2g
    public T getValue() {
        return this.f75399a.getValue();
    }
}
