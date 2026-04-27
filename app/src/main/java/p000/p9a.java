package p000;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class p9a<T> extends AbstractC15397y2<T, T> {

    /* JADX INFO: renamed from: b */
    public final sy6<? super Throwable, ? extends z9a<? extends T>> f70097b;

    /* JADX INFO: renamed from: p9a$a */
    public static final class C10863a<T> extends AtomicReference<lf4> implements k9a<T>, lf4 {
        private static final long serialVersionUID = 2026620218879969836L;

        /* JADX INFO: renamed from: a */
        public final k9a<? super T> f70098a;

        /* JADX INFO: renamed from: b */
        public final sy6<? super Throwable, ? extends z9a<? extends T>> f70099b;

        /* JADX INFO: renamed from: p9a$a$a */
        public static final class a<T> implements k9a<T> {

            /* JADX INFO: renamed from: a */
            public final k9a<? super T> f70100a;

            /* JADX INFO: renamed from: b */
            public final AtomicReference<lf4> f70101b;

            public a(k9a<? super T> actual, AtomicReference<lf4> d) {
                this.f70100a = actual;
                this.f70101b = d;
            }

            @Override // p000.k9a
            public void onComplete() {
                this.f70100a.onComplete();
            }

            @Override // p000.k9a
            public void onError(Throwable e) {
                this.f70100a.onError(e);
            }

            @Override // p000.k9a
            public void onSubscribe(lf4 d) {
                zf4.setOnce(this.f70101b, d);
            }

            @Override // p000.k9a
            public void onSuccess(T value) {
                this.f70100a.onSuccess(value);
            }
        }

        public C10863a(k9a<? super T> actual, sy6<? super Throwable, ? extends z9a<? extends T>> resumeFunction) {
            this.f70098a = actual;
            this.f70099b = resumeFunction;
        }

        @Override // p000.lf4
        public void dispose() {
            zf4.dispose(this);
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return zf4.isDisposed(get());
        }

        @Override // p000.k9a
        public void onComplete() {
            this.f70098a.onComplete();
        }

        @Override // p000.k9a
        public void onError(Throwable e) {
            try {
                z9a<? extends T> z9aVarApply = this.f70099b.apply(e);
                Objects.requireNonNull(z9aVarApply, "The resumeFunction returned a null MaybeSource");
                z9a<? extends T> z9aVar = z9aVarApply;
                zf4.replace(this, null);
                z9aVar.subscribe(new a(this.f70098a, this));
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                this.f70098a.onError(new qm2(e, th));
            }
        }

        @Override // p000.k9a
        public void onSubscribe(lf4 d) {
            if (zf4.setOnce(this, d)) {
                this.f70098a.onSubscribe(this);
            }
        }

        @Override // p000.k9a
        public void onSuccess(T value) {
            this.f70098a.onSuccess(value);
        }
    }

    public p9a(z9a<T> source, sy6<? super Throwable, ? extends z9a<? extends T>> resumeFunction) {
        super(source);
        this.f70097b = resumeFunction;
    }

    @Override // p000.r4a
    public void subscribeActual(k9a<? super T> observer) {
        this.f100099a.subscribe(new C10863a(observer, this.f70097b));
    }
}
