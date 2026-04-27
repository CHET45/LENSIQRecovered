package p000;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class stb<T> extends AbstractC10162o3<T, T> {

    /* JADX INFO: renamed from: b */
    public final xub<?> f82838b;

    /* JADX INFO: renamed from: c */
    public final boolean f82839c;

    /* JADX INFO: renamed from: stb$a */
    public static final class C12777a<T> extends AbstractC12779c<T> {
        private static final long serialVersionUID = -3029755663834015785L;

        /* JADX INFO: renamed from: e */
        public final AtomicInteger f82840e;

        /* JADX INFO: renamed from: f */
        public volatile boolean f82841f;

        public C12777a(oxb<? super T> oxbVar, xub<?> xubVar) {
            super(oxbVar, xubVar);
            this.f82840e = new AtomicInteger();
        }

        @Override // p000.stb.AbstractC12779c
        /* JADX INFO: renamed from: a */
        public void mo22224a() {
            this.f82841f = true;
            if (this.f82840e.getAndIncrement() == 0) {
                m22226b();
                this.f82842a.onComplete();
            }
        }

        @Override // p000.stb.AbstractC12779c
        /* JADX INFO: renamed from: c */
        public void mo22225c() {
            if (this.f82840e.getAndIncrement() == 0) {
                do {
                    boolean z = this.f82841f;
                    m22226b();
                    if (z) {
                        this.f82842a.onComplete();
                        return;
                    }
                } while (this.f82840e.decrementAndGet() != 0);
            }
        }
    }

    /* JADX INFO: renamed from: stb$b */
    public static final class C12778b<T> extends AbstractC12779c<T> {
        private static final long serialVersionUID = -3029755663834015785L;

        public C12778b(oxb<? super T> oxbVar, xub<?> xubVar) {
            super(oxbVar, xubVar);
        }

        @Override // p000.stb.AbstractC12779c
        /* JADX INFO: renamed from: a */
        public void mo22224a() {
            this.f82842a.onComplete();
        }

        @Override // p000.stb.AbstractC12779c
        /* JADX INFO: renamed from: c */
        public void mo22225c() {
            m22226b();
        }
    }

    /* JADX INFO: renamed from: stb$c */
    public static abstract class AbstractC12779c<T> extends AtomicReference<T> implements oxb<T>, mf4 {
        private static final long serialVersionUID = -3517602651313910099L;

        /* JADX INFO: renamed from: a */
        public final oxb<? super T> f82842a;

        /* JADX INFO: renamed from: b */
        public final xub<?> f82843b;

        /* JADX INFO: renamed from: c */
        public final AtomicReference<mf4> f82844c = new AtomicReference<>();

        /* JADX INFO: renamed from: d */
        public mf4 f82845d;

        public AbstractC12779c(oxb<? super T> oxbVar, xub<?> xubVar) {
            this.f82842a = oxbVar;
            this.f82843b = xubVar;
        }

        /* JADX INFO: renamed from: a */
        public abstract void mo22224a();

        /* JADX INFO: renamed from: b */
        public void m22226b() {
            T andSet = getAndSet(null);
            if (andSet != null) {
                this.f82842a.onNext(andSet);
            }
        }

        /* JADX INFO: renamed from: c */
        public abstract void mo22225c();

        public void complete() {
            this.f82845d.dispose();
            mo22224a();
        }

        /* JADX INFO: renamed from: d */
        public boolean m22227d(mf4 mf4Var) {
            return ag4.setOnce(this.f82844c, mf4Var);
        }

        @Override // p000.mf4
        public void dispose() {
            ag4.dispose(this.f82844c);
            this.f82845d.dispose();
        }

        public void error(Throwable th) {
            this.f82845d.dispose();
            this.f82842a.onError(th);
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f82844c.get() == ag4.DISPOSED;
        }

        @Override // p000.oxb
        public void onComplete() {
            ag4.dispose(this.f82844c);
            mo22224a();
        }

        @Override // p000.oxb
        public void onError(Throwable th) {
            ag4.dispose(this.f82844c);
            this.f82842a.onError(th);
        }

        @Override // p000.oxb
        public void onNext(T t) {
            lazySet(t);
        }

        @Override // p000.oxb
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.validate(this.f82845d, mf4Var)) {
                this.f82845d = mf4Var;
                this.f82842a.onSubscribe(this);
                if (this.f82844c.get() == null) {
                    this.f82843b.subscribe(new C12780d(this));
                }
            }
        }
    }

    /* JADX INFO: renamed from: stb$d */
    public static final class C12780d<T> implements oxb<Object> {

        /* JADX INFO: renamed from: a */
        public final AbstractC12779c<T> f82846a;

        public C12780d(AbstractC12779c<T> abstractC12779c) {
            this.f82846a = abstractC12779c;
        }

        @Override // p000.oxb
        public void onComplete() {
            this.f82846a.complete();
        }

        @Override // p000.oxb
        public void onError(Throwable th) {
            this.f82846a.error(th);
        }

        @Override // p000.oxb
        public void onNext(Object obj) {
            this.f82846a.mo22225c();
        }

        @Override // p000.oxb
        public void onSubscribe(mf4 mf4Var) {
            this.f82846a.m22227d(mf4Var);
        }
    }

    public stb(xub<T> xubVar, xub<?> xubVar2, boolean z) {
        super(xubVar);
        this.f82838b = xubVar2;
        this.f82839c = z;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(oxb<? super T> oxbVar) {
        n1f n1fVar = new n1f(oxbVar);
        if (this.f82839c) {
            this.f66354a.subscribe(new C12777a(n1fVar, this.f82838b));
        } else {
            this.f66354a.subscribe(new C12778b(n1fVar, this.f82838b));
        }
    }
}
