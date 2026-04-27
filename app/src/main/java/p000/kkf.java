package p000;

import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public final class kkf<T, R> extends r4a<R> {

    /* JADX INFO: renamed from: a */
    public final kjf<T> f54559a;

    /* JADX INFO: renamed from: b */
    public final sy6<? super T, jgb<R>> f54560b;

    /* JADX INFO: renamed from: kkf$a */
    public static final class C8438a<T, R> implements hnf<T>, lf4 {

        /* JADX INFO: renamed from: a */
        public final k9a<? super R> f54561a;

        /* JADX INFO: renamed from: b */
        public final sy6<? super T, jgb<R>> f54562b;

        /* JADX INFO: renamed from: c */
        public lf4 f54563c;

        public C8438a(k9a<? super R> downstream, sy6<? super T, jgb<R>> selector) {
            this.f54561a = downstream;
            this.f54562b = selector;
        }

        @Override // p000.lf4
        public void dispose() {
            this.f54563c.dispose();
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f54563c.isDisposed();
        }

        @Override // p000.hnf
        public void onError(Throwable e) {
            this.f54561a.onError(e);
        }

        @Override // p000.hnf
        public void onSubscribe(lf4 d) {
            if (zf4.validate(this.f54563c, d)) {
                this.f54563c = d;
                this.f54561a.onSubscribe(this);
            }
        }

        @Override // p000.hnf
        public void onSuccess(T t) {
            try {
                jgb<R> jgbVarApply = this.f54562b.apply(t);
                Objects.requireNonNull(jgbVarApply, "The selector returned a null Notification");
                jgb<R> jgbVar = jgbVarApply;
                if (jgbVar.isOnNext()) {
                    this.f54561a.onSuccess(jgbVar.getValue());
                } else if (jgbVar.isOnComplete()) {
                    this.f54561a.onComplete();
                } else {
                    this.f54561a.onError(jgbVar.getError());
                }
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                this.f54561a.onError(th);
            }
        }
    }

    public kkf(kjf<T> source, sy6<? super T, jgb<R>> selector) {
        this.f54559a = source;
        this.f54560b = selector;
    }

    @Override // p000.r4a
    public void subscribeActual(k9a<? super R> observer) {
        this.f54559a.subscribe(new C8438a(observer, this.f54560b));
    }
}
