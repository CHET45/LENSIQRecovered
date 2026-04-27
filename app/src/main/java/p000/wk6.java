package p000;

import java.util.Objects;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p000.yk6;

/* JADX INFO: loaded from: classes7.dex */
public final class wk6<T, U, V> extends AbstractC7714j1<T, T> {

    /* JADX INFO: renamed from: c */
    public final zjd<U> f94491c;

    /* JADX INFO: renamed from: d */
    public final sy6<? super T, ? extends zjd<V>> f94492d;

    /* JADX INFO: renamed from: e */
    public final zjd<? extends T> f94493e;

    /* JADX INFO: renamed from: wk6$a */
    public static final class C14657a extends AtomicReference<fdg> implements kj6<Object>, lf4 {
        private static final long serialVersionUID = 8708641127342403073L;

        /* JADX INFO: renamed from: a */
        public final InterfaceC14659c f94494a;

        /* JADX INFO: renamed from: b */
        public final long f94495b;

        public C14657a(long idx, InterfaceC14659c parent) {
            this.f94495b = idx;
            this.f94494a = parent;
        }

        @Override // p000.lf4
        public void dispose() {
            ldg.cancel(this);
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return get() == ldg.CANCELLED;
        }

        @Override // p000.ycg
        public void onComplete() {
            Object obj = get();
            ldg ldgVar = ldg.CANCELLED;
            if (obj != ldgVar) {
                lazySet(ldgVar);
                this.f94494a.onTimeout(this.f94495b);
            }
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            Object obj = get();
            ldg ldgVar = ldg.CANCELLED;
            if (obj == ldgVar) {
                ofe.onError(t);
            } else {
                lazySet(ldgVar);
                this.f94494a.onTimeoutError(this.f94495b, t);
            }
        }

        @Override // p000.ycg
        public void onNext(Object t) {
            fdg fdgVar = (fdg) get();
            ldg ldgVar = ldg.CANCELLED;
            if (fdgVar != ldgVar) {
                fdgVar.cancel();
                lazySet(ldgVar);
                this.f94494a.onTimeout(this.f94495b);
            }
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            ldg.setOnce(this, s, Long.MAX_VALUE);
        }
    }

    /* JADX INFO: renamed from: wk6$b */
    public static final class C14658b<T> extends gdg implements kj6<T>, InterfaceC14659c {
        private static final long serialVersionUID = 3764492702657003550L;

        /* JADX INFO: renamed from: F */
        public final ycg<? super T> f94496F;

        /* JADX INFO: renamed from: H */
        public final sy6<? super T, ? extends zjd<?>> f94497H;

        /* JADX INFO: renamed from: L */
        public final a0f f94498L;

        /* JADX INFO: renamed from: M */
        public final AtomicReference<fdg> f94499M;

        /* JADX INFO: renamed from: N */
        public final AtomicLong f94500N;

        /* JADX INFO: renamed from: Q */
        public zjd<? extends T> f94501Q;

        /* JADX INFO: renamed from: X */
        public long f94502X;

        public C14658b(ycg<? super T> actual, sy6<? super T, ? extends zjd<?>> itemTimeoutIndicator, zjd<? extends T> fallback) {
            super(true);
            this.f94496F = actual;
            this.f94497H = itemTimeoutIndicator;
            this.f94498L = new a0f();
            this.f94499M = new AtomicReference<>();
            this.f94501Q = fallback;
            this.f94500N = new AtomicLong();
        }

        /* JADX INFO: renamed from: c */
        public void m24632c(zjd<?> firstTimeoutIndicator) {
            if (firstTimeoutIndicator != null) {
                C14657a c14657a = new C14657a(0L, this);
                if (this.f94498L.replace(c14657a)) {
                    firstTimeoutIndicator.subscribe(c14657a);
                }
            }
        }

        @Override // p000.gdg, p000.fdg
        public void cancel() {
            super.cancel();
            this.f94498L.dispose();
        }

        @Override // p000.ycg
        public void onComplete() {
            if (this.f94500N.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.f94498L.dispose();
                this.f94496F.onComplete();
                this.f94498L.dispose();
            }
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            if (this.f94500N.getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
                ofe.onError(t);
                return;
            }
            this.f94498L.dispose();
            this.f94496F.onError(t);
            this.f94498L.dispose();
        }

        @Override // p000.ycg
        public void onNext(T t) {
            long j = this.f94500N.get();
            if (j != Long.MAX_VALUE) {
                long j2 = j + 1;
                if (this.f94500N.compareAndSet(j, j2)) {
                    lf4 lf4Var = this.f94498L.get();
                    if (lf4Var != null) {
                        lf4Var.dispose();
                    }
                    this.f94502X++;
                    this.f94496F.onNext(t);
                    try {
                        zjd<?> zjdVarApply = this.f94497H.apply(t);
                        Objects.requireNonNull(zjdVarApply, "The itemTimeoutIndicator returned a null Publisher.");
                        zjd<?> zjdVar = zjdVarApply;
                        C14657a c14657a = new C14657a(j2, this);
                        if (this.f94498L.replace(c14657a)) {
                            zjdVar.subscribe(c14657a);
                        }
                    } catch (Throwable th) {
                        o75.throwIfFatal(th);
                        this.f94499M.get().cancel();
                        this.f94500N.getAndSet(Long.MAX_VALUE);
                        this.f94496F.onError(th);
                    }
                }
            }
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            if (ldg.setOnce(this.f94499M, s)) {
                setSubscription(s);
            }
        }

        @Override // p000.yk6.InterfaceC15705d
        public void onTimeout(long idx) {
            if (this.f94500N.compareAndSet(idx, Long.MAX_VALUE)) {
                ldg.cancel(this.f94499M);
                zjd<? extends T> zjdVar = this.f94501Q;
                this.f94501Q = null;
                long j = this.f94502X;
                if (j != 0) {
                    produced(j);
                }
                zjdVar.subscribe(new yk6.C15702a(this.f94496F, this));
            }
        }

        @Override // p000.wk6.InterfaceC14659c
        public void onTimeoutError(long idx, Throwable ex) {
            if (!this.f94500N.compareAndSet(idx, Long.MAX_VALUE)) {
                ofe.onError(ex);
            } else {
                ldg.cancel(this.f94499M);
                this.f94496F.onError(ex);
            }
        }
    }

    /* JADX INFO: renamed from: wk6$c */
    public interface InterfaceC14659c extends yk6.InterfaceC15705d {
        void onTimeoutError(long idx, Throwable ex);
    }

    /* JADX INFO: renamed from: wk6$d */
    public static final class C14660d<T> extends AtomicLong implements kj6<T>, fdg, InterfaceC14659c {
        private static final long serialVersionUID = 3764492702657003550L;

        /* JADX INFO: renamed from: a */
        public final ycg<? super T> f94503a;

        /* JADX INFO: renamed from: b */
        public final sy6<? super T, ? extends zjd<?>> f94504b;

        /* JADX INFO: renamed from: c */
        public final a0f f94505c = new a0f();

        /* JADX INFO: renamed from: d */
        public final AtomicReference<fdg> f94506d = new AtomicReference<>();

        /* JADX INFO: renamed from: e */
        public final AtomicLong f94507e = new AtomicLong();

        public C14660d(ycg<? super T> actual, sy6<? super T, ? extends zjd<?>> itemTimeoutIndicator) {
            this.f94503a = actual;
            this.f94504b = itemTimeoutIndicator;
        }

        /* JADX INFO: renamed from: a */
        public void m24633a(zjd<?> firstTimeoutIndicator) {
            if (firstTimeoutIndicator != null) {
                C14657a c14657a = new C14657a(0L, this);
                if (this.f94505c.replace(c14657a)) {
                    firstTimeoutIndicator.subscribe(c14657a);
                }
            }
        }

        @Override // p000.fdg
        public void cancel() {
            ldg.cancel(this.f94506d);
            this.f94505c.dispose();
        }

        @Override // p000.ycg
        public void onComplete() {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.f94505c.dispose();
                this.f94503a.onComplete();
            }
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            if (getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
                ofe.onError(t);
            } else {
                this.f94505c.dispose();
                this.f94503a.onError(t);
            }
        }

        @Override // p000.ycg
        public void onNext(T t) {
            long j = get();
            if (j != Long.MAX_VALUE) {
                long j2 = 1 + j;
                if (compareAndSet(j, j2)) {
                    lf4 lf4Var = this.f94505c.get();
                    if (lf4Var != null) {
                        lf4Var.dispose();
                    }
                    this.f94503a.onNext(t);
                    try {
                        zjd<?> zjdVarApply = this.f94504b.apply(t);
                        Objects.requireNonNull(zjdVarApply, "The itemTimeoutIndicator returned a null Publisher.");
                        zjd<?> zjdVar = zjdVarApply;
                        C14657a c14657a = new C14657a(j2, this);
                        if (this.f94505c.replace(c14657a)) {
                            zjdVar.subscribe(c14657a);
                        }
                    } catch (Throwable th) {
                        o75.throwIfFatal(th);
                        this.f94506d.get().cancel();
                        getAndSet(Long.MAX_VALUE);
                        this.f94503a.onError(th);
                    }
                }
            }
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            ldg.deferredSetOnce(this.f94506d, this.f94507e, s);
        }

        @Override // p000.yk6.InterfaceC15705d
        public void onTimeout(long idx) {
            if (compareAndSet(idx, Long.MAX_VALUE)) {
                ldg.cancel(this.f94506d);
                this.f94503a.onError(new TimeoutException());
            }
        }

        @Override // p000.wk6.InterfaceC14659c
        public void onTimeoutError(long idx, Throwable ex) {
            if (!compareAndSet(idx, Long.MAX_VALUE)) {
                ofe.onError(ex);
            } else {
                ldg.cancel(this.f94506d);
                this.f94503a.onError(ex);
            }
        }

        @Override // p000.fdg
        public void request(long n) {
            ldg.deferredRequest(this.f94506d, this.f94507e, n);
        }
    }

    public wk6(l86<T> source, zjd<U> firstTimeoutIndicator, sy6<? super T, ? extends zjd<V>> itemTimeoutIndicator, zjd<? extends T> other) {
        super(source);
        this.f94491c = firstTimeoutIndicator;
        this.f94492d = itemTimeoutIndicator;
        this.f94493e = other;
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
    @Override // p000.l86
    public void subscribeActual(ycg<? super T> ycgVar) {
        if (this.f94493e == null) {
            C14660d c14660d = new C14660d(ycgVar, this.f94492d);
            ycgVar.onSubscribe(c14660d);
            c14660d.m24633a(this.f94491c);
            this.f49321b.subscribe((kj6) c14660d);
            return;
        }
        C14658b c14658b = new C14658b(ycgVar, this.f94492d, this.f94493e);
        ycgVar.onSubscribe(c14658b);
        c14658b.m24632c(this.f94491c);
        this.f49321b.subscribe((kj6) c14658b);
    }
}
