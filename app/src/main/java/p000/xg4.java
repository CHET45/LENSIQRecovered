package p000;

import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
public final class xg4<T, K> implements vye<T> {

    /* JADX INFO: renamed from: a */
    @yfb
    public final vye<T> f97692a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final qy6<T, K> f97693b;

    /* JADX WARN: Multi-variable type inference failed */
    public xg4(@yfb vye<? extends T> vyeVar, @yfb qy6<? super T, ? extends K> qy6Var) {
        md8.checkNotNullParameter(vyeVar, "source");
        md8.checkNotNullParameter(qy6Var, "keySelector");
        this.f97692a = vyeVar;
        this.f97693b = qy6Var;
    }

    @Override // p000.vye
    @yfb
    public Iterator<T> iterator() {
        return new wg4(this.f97692a.iterator(), this.f97693b);
    }
}
