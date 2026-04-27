package p000;

import java.util.Collection;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes7.dex */
public final class rlb<T, U extends Collection<? super T>, B> extends AbstractC10162o3<T, U> {

    /* JADX INFO: renamed from: b */
    public final xub<B> f78638b;

    /* JADX INFO: renamed from: c */
    public final Callable<U> f78639c;

    /* JADX INFO: renamed from: rlb$a */
    public static final class C12146a<T, U extends Collection<? super T>, B> extends gg4<B> {

        /* JADX INFO: renamed from: b */
        public final C12147b<T, U, B> f78640b;

        public C12146a(C12147b<T, U, B> c12147b) {
            this.f78640b = c12147b;
        }

        @Override // p000.oxb
        public void onComplete() {
            this.f78640b.onComplete();
        }

        @Override // p000.oxb
        public void onError(Throwable th) {
            this.f78640b.onError(th);
        }

        @Override // p000.oxb
        public void onNext(B b) {
            this.f78640b.m21425c();
        }
    }

    /* JADX INFO: renamed from: rlb$b */
    public static final class C12147b<T, U extends Collection<? super T>, B> extends and<T, U, U> implements oxb<T>, mf4 {

        /* JADX INFO: renamed from: q2 */
        public final Callable<U> f78641q2;

        /* JADX INFO: renamed from: r2 */
        public final xub<B> f78642r2;

        /* JADX INFO: renamed from: s2 */
        public mf4 f78643s2;

        /* JADX INFO: renamed from: t2 */
        public mf4 f78644t2;

        /* JADX INFO: renamed from: u2 */
        public U f78645u2;

        public C12147b(oxb<? super U> oxbVar, Callable<U> callable, xub<B> xubVar) {
            super(oxbVar, new s1b());
            this.f78641q2 = callable;
            this.f78642r2 = xubVar;
        }

        @Override // p000.and, p000.osb
        public /* bridge */ /* synthetic */ void accept(oxb oxbVar, Object obj) {
            accept((oxb<? super Collection>) oxbVar, (Collection) obj);
        }

        /* JADX INFO: renamed from: c */
        public void m21425c() {
            try {
                U u = (U) xjb.requireNonNull(this.f78641q2.call(), "The buffer supplied is null");
                synchronized (this) {
                    try {
                        U u2 = this.f78645u2;
                        if (u2 == null) {
                            return;
                        }
                        this.f78645u2 = u;
                        m934a(u2, false, this);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                n75.throwIfFatal(th2);
                dispose();
                this.f2165l2.onError(th2);
            }
        }

        @Override // p000.mf4
        public void dispose() {
            if (this.f2167n2) {
                return;
            }
            this.f2167n2 = true;
            this.f78644t2.dispose();
            this.f78643s2.dispose();
            if (enter()) {
                this.f2166m2.clear();
            }
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f2167n2;
        }

        @Override // p000.oxb
        public void onComplete() {
            synchronized (this) {
                try {
                    U u = this.f78645u2;
                    if (u == null) {
                        return;
                    }
                    this.f78645u2 = null;
                    this.f2166m2.offer(u);
                    this.f2168o2 = true;
                    if (enter()) {
                        ymd.drainLoop(this.f2166m2, this.f2165l2, false, this, this);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // p000.oxb
        public void onError(Throwable th) {
            dispose();
            this.f2165l2.onError(th);
        }

        @Override // p000.oxb
        public void onNext(T t) {
            synchronized (this) {
                try {
                    U u = this.f78645u2;
                    if (u == null) {
                        return;
                    }
                    u.add(t);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // p000.oxb
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.validate(this.f78643s2, mf4Var)) {
                this.f78643s2 = mf4Var;
                try {
                    this.f78645u2 = (U) xjb.requireNonNull(this.f78641q2.call(), "The buffer supplied is null");
                    C12146a c12146a = new C12146a(this);
                    this.f78644t2 = c12146a;
                    this.f2165l2.onSubscribe(this);
                    if (this.f2167n2) {
                        return;
                    }
                    this.f78642r2.subscribe(c12146a);
                } catch (Throwable th) {
                    n75.throwIfFatal(th);
                    this.f2167n2 = true;
                    mf4Var.dispose();
                    c05.error(th, this.f2165l2);
                }
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        public void accept(oxb<? super U> oxbVar, U u) {
            this.f2165l2.onNext((Object) u);
        }
    }

    public rlb(xub<T> xubVar, xub<B> xubVar2, Callable<U> callable) {
        super(xubVar);
        this.f78638b = xubVar2;
        this.f78639c = callable;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(oxb<? super U> oxbVar) {
        this.f66354a.subscribe(new C12147b(new n1f(oxbVar), this.f78639c, this.f78638b));
    }
}
