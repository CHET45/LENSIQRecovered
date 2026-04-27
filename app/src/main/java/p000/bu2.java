package p000;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class bu2<T> implements vye<T> {

    /* JADX INFO: renamed from: a */
    @yfb
    public final AtomicReference<vye<T>> f14767a;

    public bu2(@yfb vye<? extends T> vyeVar) {
        md8.checkNotNullParameter(vyeVar, "sequence");
        this.f14767a = new AtomicReference<>(vyeVar);
    }

    @Override // p000.vye
    @yfb
    public Iterator<T> iterator() {
        vye<T> andSet = this.f14767a.getAndSet(null);
        if (andSet != null) {
            return andSet.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
