package p000;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class ord<T> implements q9f<T>, kq1<T>, a17<T> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ q9f<T> f68393a;

    /* JADX INFO: renamed from: b */
    @gib
    public final jj8 f68394b;

    /* JADX WARN: Multi-variable type inference failed */
    public ord(@yfb q9f<? extends T> q9fVar, @gib jj8 jj8Var) {
        this.f68393a = q9fVar;
        this.f68394b = jj8Var;
    }

    @Override // p000.q9f, p000.y56
    @gib
    public Object collect(@yfb t66<? super T> t66Var, @yfb zy2<?> zy2Var) {
        return this.f68393a.collect(t66Var, zy2Var);
    }

    @Override // p000.a17
    @yfb
    public y56<T> fuse(@yfb e13 e13Var, int i, @yfb gf1 gf1Var) {
        return s9f.fuseSharedFlow(this, e13Var, i, gf1Var);
    }

    @Override // p000.q9f
    @yfb
    public List<T> getReplayCache() {
        return this.f68393a.getReplayCache();
    }
}
