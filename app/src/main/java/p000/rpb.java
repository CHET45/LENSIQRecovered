package p000;

import io.reactivex.Observable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
public final class rpb<T> extends Observable<T> {

    /* JADX INFO: renamed from: a */
    public final Iterable<? extends T> f78991a;

    /* JADX INFO: renamed from: rpb$a */
    public static final class C12197a<T> extends aw0<T> {

        /* JADX INFO: renamed from: a */
        public final oxb<? super T> f78992a;

        /* JADX INFO: renamed from: b */
        public final Iterator<? extends T> f78993b;

        /* JADX INFO: renamed from: c */
        public volatile boolean f78994c;

        /* JADX INFO: renamed from: d */
        public boolean f78995d;

        /* JADX INFO: renamed from: e */
        public boolean f78996e;

        /* JADX INFO: renamed from: f */
        public boolean f78997f;

        public C12197a(oxb<? super T> oxbVar, Iterator<? extends T> it) {
            this.f78992a = oxbVar;
            this.f78993b = it;
        }

        /* JADX INFO: renamed from: a */
        public void m21467a() {
            while (!isDisposed()) {
                try {
                    this.f78992a.onNext(xjb.requireNonNull(this.f78993b.next(), "The iterator returned a null value"));
                    if (isDisposed()) {
                        return;
                    }
                    try {
                        if (!this.f78993b.hasNext()) {
                            if (isDisposed()) {
                                return;
                            }
                            this.f78992a.onComplete();
                            return;
                        }
                    } catch (Throwable th) {
                        n75.throwIfFatal(th);
                        this.f78992a.onError(th);
                        return;
                    }
                } catch (Throwable th2) {
                    n75.throwIfFatal(th2);
                    this.f78992a.onError(th2);
                    return;
                }
            }
        }

        @Override // p000.ajf
        public void clear() {
            this.f78996e = true;
        }

        @Override // p000.mf4
        public void dispose() {
            this.f78994c = true;
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f78994c;
        }

        @Override // p000.ajf
        public boolean isEmpty() {
            return this.f78996e;
        }

        @Override // p000.ajf
        @cib
        public T poll() {
            if (this.f78996e) {
                return null;
            }
            if (!this.f78997f) {
                this.f78997f = true;
            } else if (!this.f78993b.hasNext()) {
                this.f78996e = true;
                return null;
            }
            return (T) xjb.requireNonNull(this.f78993b.next(), "The iterator returned a null value");
        }

        @Override // p000.wnd
        public int requestFusion(int i) {
            if ((i & 1) == 0) {
                return 0;
            }
            this.f78995d = true;
            return 1;
        }
    }

    public rpb(Iterable<? extends T> iterable) {
        this.f78991a = iterable;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(oxb<? super T> oxbVar) {
        try {
            Iterator<? extends T> it = this.f78991a.iterator();
            try {
                if (!it.hasNext()) {
                    c05.complete(oxbVar);
                    return;
                }
                C12197a c12197a = new C12197a(oxbVar, it);
                oxbVar.onSubscribe(c12197a);
                if (c12197a.f78995d) {
                    return;
                }
                c12197a.m21467a();
            } catch (Throwable th) {
                n75.throwIfFatal(th);
                c05.error(th, oxbVar);
            }
        } catch (Throwable th2) {
            n75.throwIfFatal(th2);
            c05.error(th2, oxbVar);
        }
    }
}
