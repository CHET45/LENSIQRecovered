package p000;

import io.reactivex.Observable;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p000.hwb;

/* JADX INFO: loaded from: classes7.dex */
public final class fwb<T, U, V> extends AbstractC10162o3<T, T> {

    /* JADX INFO: renamed from: b */
    public final xub<U> f37876b;

    /* JADX INFO: renamed from: c */
    public final py6<? super T, ? extends xub<V>> f37877c;

    /* JADX INFO: renamed from: d */
    public final xub<? extends T> f37878d;

    /* JADX INFO: renamed from: fwb$a */
    public static final class C6004a extends AtomicReference<mf4> implements oxb<Object>, mf4 {
        private static final long serialVersionUID = 8708641127342403073L;

        /* JADX INFO: renamed from: a */
        public final InterfaceC6007d f37879a;

        /* JADX INFO: renamed from: b */
        public final long f37880b;

        public C6004a(long j, InterfaceC6007d interfaceC6007d) {
            this.f37880b = j;
            this.f37879a = interfaceC6007d;
        }

        @Override // p000.mf4
        public void dispose() {
            ag4.dispose(this);
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return ag4.isDisposed(get());
        }

        @Override // p000.oxb
        public void onComplete() {
            Object obj = get();
            ag4 ag4Var = ag4.DISPOSED;
            if (obj != ag4Var) {
                lazySet(ag4Var);
                this.f37879a.onTimeout(this.f37880b);
            }
        }

        @Override // p000.oxb
        public void onError(Throwable th) {
            Object obj = get();
            ag4 ag4Var = ag4.DISPOSED;
            if (obj == ag4Var) {
                pfe.onError(th);
            } else {
                lazySet(ag4Var);
                this.f37879a.onTimeoutError(this.f37880b, th);
            }
        }

        @Override // p000.oxb
        public void onNext(Object obj) {
            mf4 mf4Var = (mf4) get();
            ag4 ag4Var = ag4.DISPOSED;
            if (mf4Var != ag4Var) {
                mf4Var.dispose();
                lazySet(ag4Var);
                this.f37879a.onTimeout(this.f37880b);
            }
        }

        @Override // p000.oxb
        public void onSubscribe(mf4 mf4Var) {
            ag4.setOnce(this, mf4Var);
        }
    }

    /* JADX INFO: renamed from: fwb$b */
    public static final class C6005b<T> extends AtomicReference<mf4> implements oxb<T>, mf4, InterfaceC6007d {
        private static final long serialVersionUID = -7508389464265974549L;

        /* JADX INFO: renamed from: a */
        public final oxb<? super T> f37881a;

        /* JADX INFO: renamed from: b */
        public final py6<? super T, ? extends xub<?>> f37882b;

        /* JADX INFO: renamed from: c */
        public final b0f f37883c = new b0f();

        /* JADX INFO: renamed from: d */
        public final AtomicLong f37884d = new AtomicLong();

        /* JADX INFO: renamed from: e */
        public final AtomicReference<mf4> f37885e = new AtomicReference<>();

        /* JADX INFO: renamed from: f */
        public xub<? extends T> f37886f;

        public C6005b(oxb<? super T> oxbVar, py6<? super T, ? extends xub<?>> py6Var, xub<? extends T> xubVar) {
            this.f37881a = oxbVar;
            this.f37882b = py6Var;
            this.f37886f = xubVar;
        }

        /* JADX INFO: renamed from: a */
        public void m11197a(xub<?> xubVar) {
            if (xubVar != null) {
                C6004a c6004a = new C6004a(0L, this);
                if (this.f37883c.replace(c6004a)) {
                    xubVar.subscribe(c6004a);
                }
            }
        }

        @Override // p000.mf4
        public void dispose() {
            ag4.dispose(this.f37885e);
            ag4.dispose(this);
            this.f37883c.dispose();
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return ag4.isDisposed(get());
        }

        @Override // p000.oxb
        public void onComplete() {
            if (this.f37884d.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.f37883c.dispose();
                this.f37881a.onComplete();
                this.f37883c.dispose();
            }
        }

        @Override // p000.oxb
        public void onError(Throwable th) {
            if (this.f37884d.getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
                pfe.onError(th);
                return;
            }
            this.f37883c.dispose();
            this.f37881a.onError(th);
            this.f37883c.dispose();
        }

        @Override // p000.oxb
        public void onNext(T t) {
            long j = this.f37884d.get();
            if (j != Long.MAX_VALUE) {
                long j2 = 1 + j;
                if (this.f37884d.compareAndSet(j, j2)) {
                    mf4 mf4Var = this.f37883c.get();
                    if (mf4Var != null) {
                        mf4Var.dispose();
                    }
                    this.f37881a.onNext(t);
                    try {
                        xub xubVar = (xub) xjb.requireNonNull(this.f37882b.apply(t), "The itemTimeoutIndicator returned a null ObservableSource.");
                        C6004a c6004a = new C6004a(j2, this);
                        if (this.f37883c.replace(c6004a)) {
                            xubVar.subscribe(c6004a);
                        }
                    } catch (Throwable th) {
                        n75.throwIfFatal(th);
                        this.f37885e.get().dispose();
                        this.f37884d.getAndSet(Long.MAX_VALUE);
                        this.f37881a.onError(th);
                    }
                }
            }
        }

        @Override // p000.oxb
        public void onSubscribe(mf4 mf4Var) {
            ag4.setOnce(this.f37885e, mf4Var);
        }

        @Override // p000.hwb.InterfaceC7069d
        public void onTimeout(long j) {
            if (this.f37884d.compareAndSet(j, Long.MAX_VALUE)) {
                ag4.dispose(this.f37885e);
                xub<? extends T> xubVar = this.f37886f;
                this.f37886f = null;
                xubVar.subscribe(new hwb.C7066a(this.f37881a, this));
            }
        }

        @Override // p000.fwb.InterfaceC6007d
        public void onTimeoutError(long j, Throwable th) {
            if (!this.f37884d.compareAndSet(j, Long.MAX_VALUE)) {
                pfe.onError(th);
            } else {
                ag4.dispose(this);
                this.f37881a.onError(th);
            }
        }
    }

    /* JADX INFO: renamed from: fwb$c */
    public static final class C6006c<T> extends AtomicLong implements oxb<T>, mf4, InterfaceC6007d {
        private static final long serialVersionUID = 3764492702657003550L;

        /* JADX INFO: renamed from: a */
        public final oxb<? super T> f37887a;

        /* JADX INFO: renamed from: b */
        public final py6<? super T, ? extends xub<?>> f37888b;

        /* JADX INFO: renamed from: c */
        public final b0f f37889c = new b0f();

        /* JADX INFO: renamed from: d */
        public final AtomicReference<mf4> f37890d = new AtomicReference<>();

        public C6006c(oxb<? super T> oxbVar, py6<? super T, ? extends xub<?>> py6Var) {
            this.f37887a = oxbVar;
            this.f37888b = py6Var;
        }

        /* JADX INFO: renamed from: a */
        public void m11198a(xub<?> xubVar) {
            if (xubVar != null) {
                C6004a c6004a = new C6004a(0L, this);
                if (this.f37889c.replace(c6004a)) {
                    xubVar.subscribe(c6004a);
                }
            }
        }

        @Override // p000.mf4
        public void dispose() {
            ag4.dispose(this.f37890d);
            this.f37889c.dispose();
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return ag4.isDisposed(this.f37890d.get());
        }

        @Override // p000.oxb
        public void onComplete() {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.f37889c.dispose();
                this.f37887a.onComplete();
            }
        }

        @Override // p000.oxb
        public void onError(Throwable th) {
            if (getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
                pfe.onError(th);
            } else {
                this.f37889c.dispose();
                this.f37887a.onError(th);
            }
        }

        @Override // p000.oxb
        public void onNext(T t) {
            long j = get();
            if (j != Long.MAX_VALUE) {
                long j2 = 1 + j;
                if (compareAndSet(j, j2)) {
                    mf4 mf4Var = this.f37889c.get();
                    if (mf4Var != null) {
                        mf4Var.dispose();
                    }
                    this.f37887a.onNext(t);
                    try {
                        xub xubVar = (xub) xjb.requireNonNull(this.f37888b.apply(t), "The itemTimeoutIndicator returned a null ObservableSource.");
                        C6004a c6004a = new C6004a(j2, this);
                        if (this.f37889c.replace(c6004a)) {
                            xubVar.subscribe(c6004a);
                        }
                    } catch (Throwable th) {
                        n75.throwIfFatal(th);
                        this.f37890d.get().dispose();
                        getAndSet(Long.MAX_VALUE);
                        this.f37887a.onError(th);
                    }
                }
            }
        }

        @Override // p000.oxb
        public void onSubscribe(mf4 mf4Var) {
            ag4.setOnce(this.f37890d, mf4Var);
        }

        @Override // p000.hwb.InterfaceC7069d
        public void onTimeout(long j) {
            if (compareAndSet(j, Long.MAX_VALUE)) {
                ag4.dispose(this.f37890d);
                this.f37887a.onError(new TimeoutException());
            }
        }

        @Override // p000.fwb.InterfaceC6007d
        public void onTimeoutError(long j, Throwable th) {
            if (!compareAndSet(j, Long.MAX_VALUE)) {
                pfe.onError(th);
            } else {
                ag4.dispose(this.f37890d);
                this.f37887a.onError(th);
            }
        }
    }

    /* JADX INFO: renamed from: fwb$d */
    public interface InterfaceC6007d extends hwb.InterfaceC7069d {
        void onTimeoutError(long j, Throwable th);
    }

    public fwb(Observable<T> observable, xub<U> xubVar, py6<? super T, ? extends xub<V>> py6Var, xub<? extends T> xubVar2) {
        super(observable);
        this.f37876b = xubVar;
        this.f37877c = py6Var;
        this.f37878d = xubVar2;
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
    @Override // io.reactivex.Observable
    public void subscribeActual(oxb<? super T> oxbVar) {
        if (this.f37878d == null) {
            C6006c c6006c = new C6006c(oxbVar, this.f37877c);
            oxbVar.onSubscribe(c6006c);
            c6006c.m11198a(this.f37876b);
            this.f66354a.subscribe(c6006c);
            return;
        }
        C6005b c6005b = new C6005b(oxbVar, this.f37877c, this.f37878d);
        oxbVar.onSubscribe(c6005b);
        c6005b.m11197a(this.f37876b);
        this.f66354a.subscribe(c6005b);
    }
}
