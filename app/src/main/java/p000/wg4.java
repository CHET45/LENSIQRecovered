package p000;

import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
public final class wg4<T, K> extends AbstractC1703b2<T> {

    /* JADX INFO: renamed from: c */
    @yfb
    public final Iterator<T> f94146c;

    /* JADX INFO: renamed from: d */
    @yfb
    public final qy6<T, K> f94147d;

    /* JADX INFO: renamed from: e */
    @yfb
    public final HashSet<K> f94148e;

    /* JADX WARN: Multi-variable type inference failed */
    public wg4(@yfb Iterator<? extends T> it, @yfb qy6<? super T, ? extends K> qy6Var) {
        md8.checkNotNullParameter(it, "source");
        md8.checkNotNullParameter(qy6Var, "keySelector");
        this.f94146c = it;
        this.f94147d = qy6Var;
        this.f94148e = new HashSet<>();
    }

    @Override // p000.AbstractC1703b2
    /* JADX INFO: renamed from: a */
    public void mo2803a() {
        while (this.f94146c.hasNext()) {
            T next = this.f94146c.next();
            if (this.f94148e.add(this.f94147d.invoke(next))) {
                m2805c(next);
                return;
            }
        }
        m2804b();
    }
}
