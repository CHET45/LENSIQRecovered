package p000;

import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public final class wlf<T, R> extends vkb<R> {

    /* JADX INFO: renamed from: a */
    public final oof<T> f94657a;

    /* JADX INFO: renamed from: b */
    public final sy6<? super T, ? extends Iterable<? extends R>> f94658b;

    /* JADX INFO: renamed from: wlf$a */
    public static final class C14675a<T, R> extends pv0<R> implements hnf<T> {
        private static final long serialVersionUID = -8938804753851907758L;

        /* JADX INFO: renamed from: a */
        public final pxb<? super R> f94659a;

        /* JADX INFO: renamed from: b */
        public final sy6<? super T, ? extends Iterable<? extends R>> f94660b;

        /* JADX INFO: renamed from: c */
        public lf4 f94661c;

        /* JADX INFO: renamed from: d */
        public volatile Iterator<? extends R> f94662d;

        /* JADX INFO: renamed from: e */
        public volatile boolean f94663e;

        /* JADX INFO: renamed from: f */
        public boolean f94664f;

        public C14675a(pxb<? super R> actual, sy6<? super T, ? extends Iterable<? extends R>> mapper) {
            this.f94659a = actual;
            this.f94660b = mapper;
        }

        @Override // p000.zif
        public void clear() {
            this.f94662d = null;
        }

        @Override // p000.lf4
        public void dispose() {
            this.f94663e = true;
            this.f94661c.dispose();
            this.f94661c = zf4.DISPOSED;
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f94663e;
        }

        @Override // p000.zif
        public boolean isEmpty() {
            return this.f94662d == null;
        }

        @Override // p000.hnf
        public void onError(Throwable e) {
            this.f94661c = zf4.DISPOSED;
            this.f94659a.onError(e);
        }

        @Override // p000.hnf
        public void onSubscribe(lf4 d) {
            if (zf4.validate(this.f94661c, d)) {
                this.f94661c = d;
                this.f94659a.onSubscribe(this);
            }
        }

        @Override // p000.hnf
        public void onSuccess(T t) {
            pxb<? super R> pxbVar = this.f94659a;
            try {
                Iterator<? extends R> it = this.f94660b.apply(t).iterator();
                if (!it.hasNext()) {
                    pxbVar.onComplete();
                    return;
                }
                if (this.f94664f) {
                    this.f94662d = it;
                    pxbVar.onNext(null);
                    pxbVar.onComplete();
                    return;
                }
                while (!this.f94663e) {
                    try {
                        pxbVar.onNext(it.next());
                        if (this.f94663e) {
                            return;
                        }
                        try {
                            if (!it.hasNext()) {
                                pxbVar.onComplete();
                                return;
                            }
                        } catch (Throwable th) {
                            o75.throwIfFatal(th);
                            pxbVar.onError(th);
                            return;
                        }
                    } catch (Throwable th2) {
                        o75.throwIfFatal(th2);
                        pxbVar.onError(th2);
                        return;
                    }
                }
            } catch (Throwable th3) {
                o75.throwIfFatal(th3);
                this.f94659a.onError(th3);
            }
        }

        @Override // p000.zif
        @dib
        public R poll() {
            Iterator<? extends R> it = this.f94662d;
            if (it == null) {
                return null;
            }
            R next = it.next();
            Objects.requireNonNull(next, "The iterator returned a null value");
            if (!it.hasNext()) {
                this.f94662d = null;
            }
            return next;
        }

        @Override // p000.vnd
        public int requestFusion(int mode) {
            if ((mode & 2) == 0) {
                return 0;
            }
            this.f94664f = true;
            return 2;
        }
    }

    public wlf(oof<T> source, sy6<? super T, ? extends Iterable<? extends R>> mapper) {
        this.f94657a = source;
        this.f94658b = mapper;
    }

    @Override // p000.vkb
    public void subscribeActual(pxb<? super R> observer) {
        this.f94657a.subscribe(new C14675a(observer, this.f94658b));
    }
}
