package p000;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class h2e<T> implements e23<T> {

    /* JADX INFO: renamed from: a */
    @yfb
    public final qy6<d23, T> f42133a;

    /* JADX WARN: Multi-variable type inference failed */
    public h2e(@yfb qy6<? super d23, ? extends T> qy6Var) {
        md8.checkNotNullParameter(qy6Var, "produceNewData");
        this.f42133a = qy6Var;
    }

    @Override // p000.e23
    @gib
    public Object handleCorruption(@yfb d23 d23Var, @yfb zy2<? super T> zy2Var) throws IOException {
        return this.f42133a.invoke(d23Var);
    }
}
