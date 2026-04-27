package p000;

import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public final class umf<T, R> extends kjf<R> {

    /* JADX INFO: renamed from: a */
    public final oof<T> f88533a;

    /* JADX INFO: renamed from: b */
    public final onf<? extends R, ? super T> f88534b;

    public umf(oof<T> source, onf<? extends R, ? super T> onLift) {
        this.f88533a = source;
        this.f88534b = onLift;
    }

    @Override // p000.kjf
    public void subscribeActual(hnf<? super R> observer) {
        try {
            hnf<? super Object> hnfVarApply = this.f88534b.apply(observer);
            Objects.requireNonNull(hnfVarApply, "The onLift returned a null SingleObserver");
            this.f88533a.subscribe(hnfVarApply);
        } catch (Throwable th) {
            o75.throwIfFatal(th);
            b05.error(th, observer);
        }
    }
}
