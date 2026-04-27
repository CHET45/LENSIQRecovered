package p000;

import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
public final class r08<T> implements Iterable<q08<? extends T>>, uo8 {

    /* JADX INFO: renamed from: a */
    @yfb
    public final ny6<Iterator<T>> f76681a;

    /* JADX WARN: Multi-variable type inference failed */
    public r08(@yfb ny6<? extends Iterator<? extends T>> ny6Var) {
        md8.checkNotNullParameter(ny6Var, "iteratorFactory");
        this.f76681a = ny6Var;
    }

    @Override // java.lang.Iterable
    @yfb
    public Iterator<q08<T>> iterator() {
        return new s08(this.f76681a.invoke());
    }
}
