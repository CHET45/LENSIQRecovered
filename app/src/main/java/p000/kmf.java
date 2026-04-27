package p000;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes7.dex */
public final class kmf<T> extends kjf<T> {

    /* JADX INFO: renamed from: a */
    public final zjd<? extends T> f54750a;

    /* JADX INFO: renamed from: kmf$a */
    public static final class C8456a<T> implements kj6<T>, lf4 {

        /* JADX INFO: renamed from: a */
        public final hnf<? super T> f54751a;

        /* JADX INFO: renamed from: b */
        public fdg f54752b;

        /* JADX INFO: renamed from: c */
        public T f54753c;

        /* JADX INFO: renamed from: d */
        public boolean f54754d;

        /* JADX INFO: renamed from: e */
        public volatile boolean f54755e;

        public C8456a(hnf<? super T> downstream) {
            this.f54751a = downstream;
        }

        @Override // p000.lf4
        public void dispose() {
            this.f54755e = true;
            this.f54752b.cancel();
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f54755e;
        }

        @Override // p000.ycg
        public void onComplete() {
            if (this.f54754d) {
                return;
            }
            this.f54754d = true;
            T t = this.f54753c;
            this.f54753c = null;
            if (t == null) {
                this.f54751a.onError(new NoSuchElementException("The source Publisher is empty"));
            } else {
                this.f54751a.onSuccess(t);
            }
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            if (this.f54754d) {
                ofe.onError(t);
                return;
            }
            this.f54754d = true;
            this.f54753c = null;
            this.f54751a.onError(t);
        }

        @Override // p000.ycg
        public void onNext(T t) {
            if (this.f54754d) {
                return;
            }
            if (this.f54753c == null) {
                this.f54753c = t;
                return;
            }
            this.f54752b.cancel();
            this.f54754d = true;
            this.f54753c = null;
            this.f54751a.onError(new IndexOutOfBoundsException("Too many elements in the Publisher"));
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            if (ldg.validate(this.f54752b, s)) {
                this.f54752b = s;
                this.f54751a.onSubscribe(this);
                s.request(Long.MAX_VALUE);
            }
        }
    }

    public kmf(zjd<? extends T> publisher) {
        this.f54750a = publisher;
    }

    @Override // p000.kjf
    public void subscribeActual(final hnf<? super T> observer) {
        this.f54750a.subscribe(new C8456a(observer));
    }
}
