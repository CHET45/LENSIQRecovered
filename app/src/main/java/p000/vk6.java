package p000;

import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p000.xk6;

/* JADX INFO: loaded from: classes7.dex */
public final class vk6<T, U, V> extends AbstractC8162k1<T, T> {

    /* JADX INFO: renamed from: c */
    public final zjd<U> f91503c;

    /* JADX INFO: renamed from: d */
    public final py6<? super T, ? extends zjd<V>> f91504d;

    /* JADX INFO: renamed from: e */
    public final zjd<? extends T> f91505e;

    /* JADX INFO: renamed from: vk6$a */
    public static final class C14139a extends AtomicReference<fdg> implements lj6<Object>, mf4 {
        private static final long serialVersionUID = 8708641127342403073L;

        /* JADX INFO: renamed from: a */
        public final InterfaceC14141c f91506a;

        /* JADX INFO: renamed from: b */
        public final long f91507b;

        public C14139a(long j, InterfaceC14141c interfaceC14141c) {
            this.f91507b = j;
            this.f91506a = interfaceC14141c;
        }

        @Override // p000.mf4
        public void dispose() {
            mdg.cancel(this);
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return get() == mdg.CANCELLED;
        }

        @Override // p000.ycg
        public void onComplete() {
            Object obj = get();
            mdg mdgVar = mdg.CANCELLED;
            if (obj != mdgVar) {
                lazySet(mdgVar);
                this.f91506a.onTimeout(this.f91507b);
            }
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            Object obj = get();
            mdg mdgVar = mdg.CANCELLED;
            if (obj == mdgVar) {
                pfe.onError(th);
            } else {
                lazySet(mdgVar);
                this.f91506a.onTimeoutError(this.f91507b, th);
            }
        }

        @Override // p000.ycg
        public void onNext(Object obj) {
            fdg fdgVar = (fdg) get();
            mdg mdgVar = mdg.CANCELLED;
            if (fdgVar != mdgVar) {
                fdgVar.cancel();
                lazySet(mdgVar);
                this.f91506a.onTimeout(this.f91507b);
            }
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            mdg.setOnce(this, fdgVar, Long.MAX_VALUE);
        }
    }

    /* JADX INFO: renamed from: vk6$b */
    public static final class C14140b<T> extends hdg implements lj6<T>, InterfaceC14141c {
        private static final long serialVersionUID = 3764492702657003550L;

        /* JADX INFO: renamed from: F */
        public final ycg<? super T> f91508F;

        /* JADX INFO: renamed from: H */
        public final py6<? super T, ? extends zjd<?>> f91509H;

        /* JADX INFO: renamed from: L */
        public final b0f f91510L;

        /* JADX INFO: renamed from: M */
        public final AtomicReference<fdg> f91511M;

        /* JADX INFO: renamed from: N */
        public final AtomicLong f91512N;

        /* JADX INFO: renamed from: Q */
        public zjd<? extends T> f91513Q;

        /* JADX INFO: renamed from: X */
        public long f91514X;

        public C14140b(ycg<? super T> ycgVar, py6<? super T, ? extends zjd<?>> py6Var, zjd<? extends T> zjdVar) {
            super(true);
            this.f91508F = ycgVar;
            this.f91509H = py6Var;
            this.f91510L = new b0f();
            this.f91511M = new AtomicReference<>();
            this.f91513Q = zjdVar;
            this.f91512N = new AtomicLong();
        }

        /* JADX INFO: renamed from: c */
        public void m24045c(zjd<?> zjdVar) {
            if (zjdVar != null) {
                C14139a c14139a = new C14139a(0L, this);
                if (this.f91510L.replace(c14139a)) {
                    zjdVar.subscribe(c14139a);
                }
            }
        }

        @Override // p000.hdg, p000.fdg
        public void cancel() {
            super.cancel();
            this.f91510L.dispose();
        }

        @Override // p000.ycg
        public void onComplete() {
            if (this.f91512N.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.f91510L.dispose();
                this.f91508F.onComplete();
                this.f91510L.dispose();
            }
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            if (this.f91512N.getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
                pfe.onError(th);
                return;
            }
            this.f91510L.dispose();
            this.f91508F.onError(th);
            this.f91510L.dispose();
        }

        @Override // p000.ycg
        public void onNext(T t) {
            long j = this.f91512N.get();
            if (j != Long.MAX_VALUE) {
                long j2 = j + 1;
                if (this.f91512N.compareAndSet(j, j2)) {
                    mf4 mf4Var = this.f91510L.get();
                    if (mf4Var != null) {
                        mf4Var.dispose();
                    }
                    this.f91514X++;
                    this.f91508F.onNext(t);
                    try {
                        zjd zjdVar = (zjd) xjb.requireNonNull(this.f91509H.apply(t), "The itemTimeoutIndicator returned a null Publisher.");
                        C14139a c14139a = new C14139a(j2, this);
                        if (this.f91510L.replace(c14139a)) {
                            zjdVar.subscribe(c14139a);
                        }
                    } catch (Throwable th) {
                        n75.throwIfFatal(th);
                        this.f91511M.get().cancel();
                        this.f91512N.getAndSet(Long.MAX_VALUE);
                        this.f91508F.onError(th);
                    }
                }
            }
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            if (mdg.setOnce(this.f91511M, fdgVar)) {
                setSubscription(fdgVar);
            }
        }

        @Override // p000.xk6.InterfaceC15169d
        public void onTimeout(long j) {
            if (this.f91512N.compareAndSet(j, Long.MAX_VALUE)) {
                mdg.cancel(this.f91511M);
                zjd<? extends T> zjdVar = this.f91513Q;
                this.f91513Q = null;
                long j2 = this.f91514X;
                if (j2 != 0) {
                    produced(j2);
                }
                zjdVar.subscribe(new xk6.C15166a(this.f91508F, this));
            }
        }

        @Override // p000.vk6.InterfaceC14141c
        public void onTimeoutError(long j, Throwable th) {
            if (!this.f91512N.compareAndSet(j, Long.MAX_VALUE)) {
                pfe.onError(th);
            } else {
                mdg.cancel(this.f91511M);
                this.f91508F.onError(th);
            }
        }
    }

    /* JADX INFO: renamed from: vk6$c */
    public interface InterfaceC14141c extends xk6.InterfaceC15169d {
        void onTimeoutError(long j, Throwable th);
    }

    /* JADX INFO: renamed from: vk6$d */
    public static final class C14142d<T> extends AtomicLong implements lj6<T>, fdg, InterfaceC14141c {
        private static final long serialVersionUID = 3764492702657003550L;

        /* JADX INFO: renamed from: a */
        public final ycg<? super T> f91515a;

        /* JADX INFO: renamed from: b */
        public final py6<? super T, ? extends zjd<?>> f91516b;

        /* JADX INFO: renamed from: c */
        public final b0f f91517c = new b0f();

        /* JADX INFO: renamed from: d */
        public final AtomicReference<fdg> f91518d = new AtomicReference<>();

        /* JADX INFO: renamed from: e */
        public final AtomicLong f91519e = new AtomicLong();

        public C14142d(ycg<? super T> ycgVar, py6<? super T, ? extends zjd<?>> py6Var) {
            this.f91515a = ycgVar;
            this.f91516b = py6Var;
        }

        /* JADX INFO: renamed from: a */
        public void m24046a(zjd<?> zjdVar) {
            if (zjdVar != null) {
                C14139a c14139a = new C14139a(0L, this);
                if (this.f91517c.replace(c14139a)) {
                    zjdVar.subscribe(c14139a);
                }
            }
        }

        @Override // p000.fdg
        public void cancel() {
            mdg.cancel(this.f91518d);
            this.f91517c.dispose();
        }

        @Override // p000.ycg
        public void onComplete() {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.f91517c.dispose();
                this.f91515a.onComplete();
            }
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            if (getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
                pfe.onError(th);
            } else {
                this.f91517c.dispose();
                this.f91515a.onError(th);
            }
        }

        @Override // p000.ycg
        public void onNext(T t) {
            long j = get();
            if (j != Long.MAX_VALUE) {
                long j2 = 1 + j;
                if (compareAndSet(j, j2)) {
                    mf4 mf4Var = this.f91517c.get();
                    if (mf4Var != null) {
                        mf4Var.dispose();
                    }
                    this.f91515a.onNext(t);
                    try {
                        zjd zjdVar = (zjd) xjb.requireNonNull(this.f91516b.apply(t), "The itemTimeoutIndicator returned a null Publisher.");
                        C14139a c14139a = new C14139a(j2, this);
                        if (this.f91517c.replace(c14139a)) {
                            zjdVar.subscribe(c14139a);
                        }
                    } catch (Throwable th) {
                        n75.throwIfFatal(th);
                        this.f91518d.get().cancel();
                        getAndSet(Long.MAX_VALUE);
                        this.f91515a.onError(th);
                    }
                }
            }
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            mdg.deferredSetOnce(this.f91518d, this.f91519e, fdgVar);
        }

        @Override // p000.xk6.InterfaceC15169d
        public void onTimeout(long j) {
            if (compareAndSet(j, Long.MAX_VALUE)) {
                mdg.cancel(this.f91518d);
                this.f91515a.onError(new TimeoutException());
            }
        }

        @Override // p000.vk6.InterfaceC14141c
        public void onTimeoutError(long j, Throwable th) {
            if (!compareAndSet(j, Long.MAX_VALUE)) {
                pfe.onError(th);
            } else {
                mdg.cancel(this.f91518d);
                this.f91515a.onError(th);
            }
        }

        @Override // p000.fdg
        public void request(long j) {
            mdg.deferredRequest(this.f91518d, this.f91519e, j);
        }
    }

    public vk6(m86<T> m86Var, zjd<U> zjdVar, py6<? super T, ? extends zjd<V>> py6Var, zjd<? extends T> zjdVar2) {
        super(m86Var);
        this.f91503c = zjdVar;
        this.f91504d = py6Var;
        this.f91505e = zjdVar2;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p000.m86
    public void subscribeActual(ycg<? super T> ycgVar) {
        if (this.f91505e == null) {
            C14142d c14142d = new C14142d(ycgVar, this.f91504d);
            ycgVar.onSubscribe(c14142d);
            c14142d.m24046a(this.f91503c);
            this.f52360b.subscribe((lj6) c14142d);
            return;
        }
        C14140b c14140b = new C14140b(ycgVar, this.f91504d, this.f91505e);
        ycgVar.onSubscribe(c14140b);
        c14140b.m24045c(this.f91503c);
        this.f52360b.subscribe((lj6) c14140b);
    }
}
