package p000;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class ylf<T, R> extends r4a<R> {

    /* JADX INFO: renamed from: a */
    public final oof<? extends T> f102029a;

    /* JADX INFO: renamed from: b */
    public final sy6<? super T, ? extends z9a<? extends R>> f102030b;

    /* JADX INFO: renamed from: ylf$a */
    public static final class C15716a<R> implements k9a<R> {

        /* JADX INFO: renamed from: a */
        public final AtomicReference<lf4> f102031a;

        /* JADX INFO: renamed from: b */
        public final k9a<? super R> f102032b;

        public C15716a(AtomicReference<lf4> parent, k9a<? super R> downstream) {
            this.f102031a = parent;
            this.f102032b = downstream;
        }

        @Override // p000.k9a
        public void onComplete() {
            this.f102032b.onComplete();
        }

        @Override // p000.k9a
        public void onError(final Throwable e) {
            this.f102032b.onError(e);
        }

        @Override // p000.k9a
        public void onSubscribe(final lf4 d) {
            zf4.replace(this.f102031a, d);
        }

        @Override // p000.k9a
        public void onSuccess(final R value) {
            this.f102032b.onSuccess(value);
        }
    }

    /* JADX INFO: renamed from: ylf$b */
    public static final class C15717b<T, R> extends AtomicReference<lf4> implements hnf<T>, lf4 {
        private static final long serialVersionUID = -5843758257109742742L;

        /* JADX INFO: renamed from: a */
        public final k9a<? super R> f102033a;

        /* JADX INFO: renamed from: b */
        public final sy6<? super T, ? extends z9a<? extends R>> f102034b;

        public C15717b(k9a<? super R> actual, sy6<? super T, ? extends z9a<? extends R>> mapper) {
            this.f102033a = actual;
            this.f102034b = mapper;
        }

        @Override // p000.lf4
        public void dispose() {
            zf4.dispose(this);
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return zf4.isDisposed(get());
        }

        @Override // p000.hnf
        public void onError(Throwable e) {
            this.f102033a.onError(e);
        }

        @Override // p000.hnf
        public void onSubscribe(lf4 d) {
            if (zf4.setOnce(this, d)) {
                this.f102033a.onSubscribe(this);
            }
        }

        @Override // p000.hnf
        public void onSuccess(T value) {
            try {
                z9a<? extends R> z9aVarApply = this.f102034b.apply(value);
                Objects.requireNonNull(z9aVarApply, "The mapper returned a null MaybeSource");
                z9a<? extends R> z9aVar = z9aVarApply;
                if (isDisposed()) {
                    return;
                }
                z9aVar.subscribe(new C15716a(this, this.f102033a));
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                onError(th);
            }
        }
    }

    public ylf(oof<? extends T> source, sy6<? super T, ? extends z9a<? extends R>> mapper) {
        this.f102030b = mapper;
        this.f102029a = source;
    }

    @Override // p000.r4a
    public void subscribeActual(k9a<? super R> downstream) {
        this.f102029a.subscribe(new C15717b(downstream, this.f102030b));
    }
}
