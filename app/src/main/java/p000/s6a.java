package p000;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class s6a<T> extends kjf<Boolean> {

    /* JADX INFO: renamed from: a */
    public final z9a<? extends T> f80789a;

    /* JADX INFO: renamed from: b */
    public final z9a<? extends T> f80790b;

    /* JADX INFO: renamed from: c */
    public final l11<? super T, ? super T> f80791c;

    /* JADX INFO: renamed from: s6a$a */
    public static final class C12464a<T> extends AtomicInteger implements lf4 {

        /* JADX INFO: renamed from: a */
        public final hnf<? super Boolean> f80792a;

        /* JADX INFO: renamed from: b */
        public final C12465b<T> f80793b;

        /* JADX INFO: renamed from: c */
        public final C12465b<T> f80794c;

        /* JADX INFO: renamed from: d */
        public final l11<? super T, ? super T> f80795d;

        public C12464a(hnf<? super Boolean> actual, l11<? super T, ? super T> isEqual) {
            super(2);
            this.f80792a = actual;
            this.f80795d = isEqual;
            this.f80793b = new C12465b<>(this);
            this.f80794c = new C12465b<>(this);
        }

        /* JADX INFO: renamed from: a */
        public void m21758a() {
            if (decrementAndGet() == 0) {
                Object obj = this.f80793b.f80797b;
                Object obj2 = this.f80794c.f80797b;
                if (obj == null || obj2 == null) {
                    this.f80792a.onSuccess(Boolean.valueOf(obj == null && obj2 == null));
                    return;
                }
                try {
                    this.f80792a.onSuccess(Boolean.valueOf(this.f80795d.test(obj, obj2)));
                } catch (Throwable th) {
                    o75.throwIfFatal(th);
                    this.f80792a.onError(th);
                }
            }
        }

        /* JADX INFO: renamed from: b */
        public void m21759b(C12465b<T> sender, Throwable ex) {
            if (getAndSet(0) <= 0) {
                ofe.onError(ex);
                return;
            }
            C12465b<T> c12465b = this.f80793b;
            if (sender == c12465b) {
                this.f80794c.dispose();
            } else {
                c12465b.dispose();
            }
            this.f80792a.onError(ex);
        }

        /* JADX INFO: renamed from: c */
        public void m21760c(z9a<? extends T> source1, z9a<? extends T> source2) {
            source1.subscribe(this.f80793b);
            source2.subscribe(this.f80794c);
        }

        @Override // p000.lf4
        public void dispose() {
            this.f80793b.dispose();
            this.f80794c.dispose();
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return zf4.isDisposed(this.f80793b.get());
        }
    }

    /* JADX INFO: renamed from: s6a$b */
    public static final class C12465b<T> extends AtomicReference<lf4> implements k9a<T> {
        private static final long serialVersionUID = -3031974433025990931L;

        /* JADX INFO: renamed from: a */
        public final C12464a<T> f80796a;

        /* JADX INFO: renamed from: b */
        public Object f80797b;

        public C12465b(C12464a<T> parent) {
            this.f80796a = parent;
        }

        public void dispose() {
            zf4.dispose(this);
        }

        @Override // p000.k9a
        public void onComplete() {
            this.f80796a.m21758a();
        }

        @Override // p000.k9a
        public void onError(Throwable e) {
            this.f80796a.m21759b(this, e);
        }

        @Override // p000.k9a
        public void onSubscribe(lf4 d) {
            zf4.setOnce(this, d);
        }

        @Override // p000.k9a
        public void onSuccess(T value) {
            this.f80797b = value;
            this.f80796a.m21758a();
        }
    }

    public s6a(z9a<? extends T> source1, z9a<? extends T> source2, l11<? super T, ? super T> isEqual) {
        this.f80789a = source1;
        this.f80790b = source2;
        this.f80791c = isEqual;
    }

    @Override // p000.kjf
    public void subscribeActual(hnf<? super Boolean> observer) {
        C12464a c12464a = new C12464a(observer, this.f80791c);
        observer.onSubscribe(c12464a);
        c12464a.m21760c(this.f80789a, this.f80790b);
    }
}
