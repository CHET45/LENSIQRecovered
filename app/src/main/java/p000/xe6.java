package p000;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes7.dex */
public final class xe6<T> extends kjf<T> {

    /* JADX INFO: renamed from: a */
    public final zjd<T> f97580a;

    /* JADX INFO: renamed from: b */
    public final T f97581b;

    /* JADX INFO: renamed from: xe6$a */
    public static final class C15037a<T> implements kj6<T>, lf4 {

        /* JADX INFO: renamed from: a */
        public final hnf<? super T> f97582a;

        /* JADX INFO: renamed from: b */
        public final T f97583b;

        /* JADX INFO: renamed from: c */
        public fdg f97584c;

        /* JADX INFO: renamed from: d */
        public T f97585d;

        public C15037a(hnf<? super T> actual, T defaultItem) {
            this.f97582a = actual;
            this.f97583b = defaultItem;
        }

        @Override // p000.lf4
        public void dispose() {
            this.f97584c.cancel();
            this.f97584c = ldg.CANCELLED;
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f97584c == ldg.CANCELLED;
        }

        @Override // p000.ycg
        public void onComplete() {
            this.f97584c = ldg.CANCELLED;
            T t = this.f97585d;
            if (t != null) {
                this.f97585d = null;
                this.f97582a.onSuccess(t);
                return;
            }
            T t2 = this.f97583b;
            if (t2 != null) {
                this.f97582a.onSuccess(t2);
            } else {
                this.f97582a.onError(new NoSuchElementException());
            }
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            this.f97584c = ldg.CANCELLED;
            this.f97585d = null;
            this.f97582a.onError(t);
        }

        @Override // p000.ycg
        public void onNext(T t) {
            this.f97585d = t;
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            if (ldg.validate(this.f97584c, s)) {
                this.f97584c = s;
                this.f97582a.onSubscribe(this);
                s.request(Long.MAX_VALUE);
            }
        }
    }

    public xe6(zjd<T> source, T defaultItem) {
        this.f97580a = source;
        this.f97581b = defaultItem;
    }

    @Override // p000.kjf
    public void subscribeActual(hnf<? super T> observer) {
        this.f97580a.subscribe(new C15037a(observer, this.f97581b));
    }
}
