package p000;

import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class qlb<T, U extends Collection<? super T>, B> extends AbstractC10162o3<T, U> {

    /* JADX INFO: renamed from: b */
    public final Callable<? extends xub<B>> f74841b;

    /* JADX INFO: renamed from: c */
    public final Callable<U> f74842c;

    /* JADX INFO: renamed from: qlb$a */
    public static final class C11538a<T, U extends Collection<? super T>, B> extends gg4<B> {

        /* JADX INFO: renamed from: b */
        public final C11539b<T, U, B> f74843b;

        /* JADX INFO: renamed from: c */
        public boolean f74844c;

        public C11538a(C11539b<T, U, B> c11539b) {
            this.f74843b = c11539b;
        }

        @Override // p000.oxb
        public void onComplete() {
            if (this.f74844c) {
                return;
            }
            this.f74844c = true;
            this.f74843b.m20432d();
        }

        @Override // p000.oxb
        public void onError(Throwable th) {
            if (this.f74844c) {
                pfe.onError(th);
            } else {
                this.f74844c = true;
                this.f74843b.onError(th);
            }
        }

        @Override // p000.oxb
        public void onNext(B b) {
            if (this.f74844c) {
                return;
            }
            this.f74844c = true;
            dispose();
            this.f74843b.m20432d();
        }
    }

    /* JADX INFO: renamed from: qlb$b */
    public static final class C11539b<T, U extends Collection<? super T>, B> extends and<T, U, U> implements oxb<T>, mf4 {

        /* JADX INFO: renamed from: q2 */
        public final Callable<U> f74845q2;

        /* JADX INFO: renamed from: r2 */
        public final Callable<? extends xub<B>> f74846r2;

        /* JADX INFO: renamed from: s2 */
        public mf4 f74847s2;

        /* JADX INFO: renamed from: t2 */
        public final AtomicReference<mf4> f74848t2;

        /* JADX INFO: renamed from: u2 */
        public U f74849u2;

        public C11539b(oxb<? super U> oxbVar, Callable<U> callable, Callable<? extends xub<B>> callable2) {
            super(oxbVar, new s1b());
            this.f74848t2 = new AtomicReference<>();
            this.f74845q2 = callable;
            this.f74846r2 = callable2;
        }

        @Override // p000.and, p000.osb
        public /* bridge */ /* synthetic */ void accept(oxb oxbVar, Object obj) {
            accept((oxb<? super Collection>) oxbVar, (Collection) obj);
        }

        /* JADX INFO: renamed from: c */
        public void m20431c() {
            ag4.dispose(this.f74848t2);
        }

        /* JADX INFO: renamed from: d */
        public void m20432d() {
            try {
                U u = (U) xjb.requireNonNull(this.f74845q2.call(), "The buffer supplied is null");
                try {
                    xub xubVar = (xub) xjb.requireNonNull(this.f74846r2.call(), "The boundary ObservableSource supplied is null");
                    C11538a c11538a = new C11538a(this);
                    if (ag4.replace(this.f74848t2, c11538a)) {
                        synchronized (this) {
                            try {
                                U u2 = this.f74849u2;
                                if (u2 == null) {
                                    return;
                                }
                                this.f74849u2 = u;
                                xubVar.subscribe(c11538a);
                                m934a(u2, false, this);
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                } catch (Throwable th2) {
                    n75.throwIfFatal(th2);
                    this.f2167n2 = true;
                    this.f74847s2.dispose();
                    this.f2165l2.onError(th2);
                }
            } catch (Throwable th3) {
                n75.throwIfFatal(th3);
                dispose();
                this.f2165l2.onError(th3);
            }
        }

        @Override // p000.mf4
        public void dispose() {
            if (this.f2167n2) {
                return;
            }
            this.f2167n2 = true;
            this.f74847s2.dispose();
            m20431c();
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
                    U u = this.f74849u2;
                    if (u == null) {
                        return;
                    }
                    this.f74849u2 = null;
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
                    U u = this.f74849u2;
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
            if (ag4.validate(this.f74847s2, mf4Var)) {
                this.f74847s2 = mf4Var;
                oxb<? super V> oxbVar = this.f2165l2;
                try {
                    this.f74849u2 = (U) xjb.requireNonNull(this.f74845q2.call(), "The buffer supplied is null");
                    try {
                        xub xubVar = (xub) xjb.requireNonNull(this.f74846r2.call(), "The boundary ObservableSource supplied is null");
                        C11538a c11538a = new C11538a(this);
                        this.f74848t2.set(c11538a);
                        oxbVar.onSubscribe(this);
                        if (this.f2167n2) {
                            return;
                        }
                        xubVar.subscribe(c11538a);
                    } catch (Throwable th) {
                        n75.throwIfFatal(th);
                        this.f2167n2 = true;
                        mf4Var.dispose();
                        c05.error(th, oxbVar);
                    }
                } catch (Throwable th2) {
                    n75.throwIfFatal(th2);
                    this.f2167n2 = true;
                    mf4Var.dispose();
                    c05.error(th2, oxbVar);
                }
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        public void accept(oxb<? super U> oxbVar, U u) {
            this.f2165l2.onNext((Object) u);
        }
    }

    public qlb(xub<T> xubVar, Callable<? extends xub<B>> callable, Callable<U> callable2) {
        super(xubVar);
        this.f74841b = callable;
        this.f74842c = callable2;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(oxb<? super U> oxbVar) {
        this.f66354a.subscribe(new C11539b(new n1f(oxbVar), this.f74842c, this.f74841b));
    }
}
