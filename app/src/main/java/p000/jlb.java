package p000;

import io.reactivex.Observable;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes7.dex */
public final class jlb<T> extends Observable<T> {

    /* JADX INFO: renamed from: a */
    public final pr2<? extends T> f51119a;

    /* JADX INFO: renamed from: b */
    public final int f51120b;

    /* JADX INFO: renamed from: c */
    public final tu2<? super mf4> f51121c;

    /* JADX INFO: renamed from: d */
    public final AtomicInteger f51122d = new AtomicInteger();

    public jlb(pr2<? extends T> pr2Var, int i, tu2<? super mf4> tu2Var) {
        this.f51119a = pr2Var;
        this.f51120b = i;
        this.f51121c = tu2Var;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(oxb<? super T> oxbVar) {
        this.f51119a.subscribe((oxb<? super Object>) oxbVar);
        if (this.f51122d.incrementAndGet() == this.f51120b) {
            this.f51119a.connect(this.f51121c);
        }
    }
}
