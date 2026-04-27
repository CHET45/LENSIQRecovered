package p000;

import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public final class x8a<T, R> extends AbstractC15397y2<T, R> {

    /* JADX INFO: renamed from: b */
    public final u9a<? extends R, ? super T> f97189b;

    public x8a(z9a<T> source, u9a<? extends R, ? super T> operator) {
        super(source);
        this.f97189b = operator;
    }

    @Override // p000.r4a
    public void subscribeActual(k9a<? super R> observer) {
        try {
            k9a<? super Object> k9aVarApply = this.f97189b.apply(observer);
            Objects.requireNonNull(k9aVarApply, "The operator returned a null MaybeObserver");
            this.f100099a.subscribe(k9aVarApply);
        } catch (Throwable th) {
            o75.throwIfFatal(th);
            b05.error(th, observer);
        }
    }
}
