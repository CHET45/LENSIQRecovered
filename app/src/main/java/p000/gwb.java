package p000;

import java.util.Objects;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p000.iwb;

/* JADX INFO: loaded from: classes7.dex */
public final class gwb<T, U, V> extends AbstractC9666n3<T, T> {

    /* JADX INFO: renamed from: b */
    public final wub<U> f41728b;

    /* JADX INFO: renamed from: c */
    public final sy6<? super T, ? extends wub<V>> f41729c;

    /* JADX INFO: renamed from: d */
    public final wub<? extends T> f41730d;

    /* JADX INFO: renamed from: gwb$a */
    public static final class C6629a extends AtomicReference<lf4> implements pxb<Object>, lf4 {
        private static final long serialVersionUID = 8708641127342403073L;

        /* JADX INFO: renamed from: a */
        public final InterfaceC6632d f41731a;

        /* JADX INFO: renamed from: b */
        public final long f41732b;

        public C6629a(long idx, InterfaceC6632d parent) {
            this.f41732b = idx;
            this.f41731a = parent;
        }

        @Override // p000.lf4
        public void dispose() {
            zf4.dispose(this);
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return zf4.isDisposed(get());
        }

        @Override // p000.pxb
        public void onComplete() {
            Object obj = get();
            zf4 zf4Var = zf4.DISPOSED;
            if (obj != zf4Var) {
                lazySet(zf4Var);
                this.f41731a.onTimeout(this.f41732b);
            }
        }

        @Override // p000.pxb
        public void onError(Throwable t) {
            Object obj = get();
            zf4 zf4Var = zf4.DISPOSED;
            if (obj == zf4Var) {
                ofe.onError(t);
            } else {
                lazySet(zf4Var);
                this.f41731a.onTimeoutError(this.f41732b, t);
            }
        }

        @Override // p000.pxb
        public void onNext(Object t) {
            lf4 lf4Var = (lf4) get();
            zf4 zf4Var = zf4.DISPOSED;
            if (lf4Var != zf4Var) {
                lf4Var.dispose();
                lazySet(zf4Var);
                this.f41731a.onTimeout(this.f41732b);
            }
        }

        @Override // p000.pxb
        public void onSubscribe(lf4 d) {
            zf4.setOnce(this, d);
        }
    }

    /* JADX INFO: renamed from: gwb$b */
    public static final class C6630b<T> extends AtomicReference<lf4> implements pxb<T>, lf4, InterfaceC6632d {
        private static final long serialVersionUID = -7508389464265974549L;

        /* JADX INFO: renamed from: a */
        public final pxb<? super T> f41733a;

        /* JADX INFO: renamed from: b */
        public final sy6<? super T, ? extends wub<?>> f41734b;

        /* JADX INFO: renamed from: c */
        public final a0f f41735c = new a0f();

        /* JADX INFO: renamed from: d */
        public final AtomicLong f41736d = new AtomicLong();

        /* JADX INFO: renamed from: e */
        public final AtomicReference<lf4> f41737e = new AtomicReference<>();

        /* JADX INFO: renamed from: f */
        public wub<? extends T> f41738f;

        public C6630b(pxb<? super T> actual, sy6<? super T, ? extends wub<?>> itemTimeoutIndicator, wub<? extends T> fallback) {
            this.f41733a = actual;
            this.f41734b = itemTimeoutIndicator;
            this.f41738f = fallback;
        }

        /* JADX INFO: renamed from: a */
        public void m12009a(wub<?> firstTimeoutIndicator) {
            if (firstTimeoutIndicator != null) {
                C6629a c6629a = new C6629a(0L, this);
                if (this.f41735c.replace(c6629a)) {
                    firstTimeoutIndicator.subscribe(c6629a);
                }
            }
        }

        @Override // p000.lf4
        public void dispose() {
            zf4.dispose(this.f41737e);
            zf4.dispose(this);
            this.f41735c.dispose();
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return zf4.isDisposed(get());
        }

        @Override // p000.pxb
        public void onComplete() {
            if (this.f41736d.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.f41735c.dispose();
                this.f41733a.onComplete();
                this.f41735c.dispose();
            }
        }

        @Override // p000.pxb
        public void onError(Throwable t) {
            if (this.f41736d.getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
                ofe.onError(t);
                return;
            }
            this.f41735c.dispose();
            this.f41733a.onError(t);
            this.f41735c.dispose();
        }

        @Override // p000.pxb
        public void onNext(T t) {
            long j = this.f41736d.get();
            if (j != Long.MAX_VALUE) {
                long j2 = 1 + j;
                if (this.f41736d.compareAndSet(j, j2)) {
                    lf4 lf4Var = this.f41735c.get();
                    if (lf4Var != null) {
                        lf4Var.dispose();
                    }
                    this.f41733a.onNext(t);
                    try {
                        wub<?> wubVarApply = this.f41734b.apply(t);
                        Objects.requireNonNull(wubVarApply, "The itemTimeoutIndicator returned a null ObservableSource.");
                        wub<?> wubVar = wubVarApply;
                        C6629a c6629a = new C6629a(j2, this);
                        if (this.f41735c.replace(c6629a)) {
                            wubVar.subscribe(c6629a);
                        }
                    } catch (Throwable th) {
                        o75.throwIfFatal(th);
                        this.f41737e.get().dispose();
                        this.f41736d.getAndSet(Long.MAX_VALUE);
                        this.f41733a.onError(th);
                    }
                }
            }
        }

        @Override // p000.pxb
        public void onSubscribe(lf4 d) {
            zf4.setOnce(this.f41737e, d);
        }

        @Override // p000.iwb.InterfaceC7642d
        public void onTimeout(long idx) {
            if (this.f41736d.compareAndSet(idx, Long.MAX_VALUE)) {
                zf4.dispose(this.f41737e);
                wub<? extends T> wubVar = this.f41738f;
                this.f41738f = null;
                wubVar.subscribe(new iwb.C7639a(this.f41733a, this));
            }
        }

        @Override // p000.gwb.InterfaceC6632d
        public void onTimeoutError(long idx, Throwable ex) {
            if (!this.f41736d.compareAndSet(idx, Long.MAX_VALUE)) {
                ofe.onError(ex);
            } else {
                zf4.dispose(this);
                this.f41733a.onError(ex);
            }
        }
    }

    /* JADX INFO: renamed from: gwb$c */
    public static final class C6631c<T> extends AtomicLong implements pxb<T>, lf4, InterfaceC6632d {
        private static final long serialVersionUID = 3764492702657003550L;

        /* JADX INFO: renamed from: a */
        public final pxb<? super T> f41739a;

        /* JADX INFO: renamed from: b */
        public final sy6<? super T, ? extends wub<?>> f41740b;

        /* JADX INFO: renamed from: c */
        public final a0f f41741c = new a0f();

        /* JADX INFO: renamed from: d */
        public final AtomicReference<lf4> f41742d = new AtomicReference<>();

        public C6631c(pxb<? super T> actual, sy6<? super T, ? extends wub<?>> itemTimeoutIndicator) {
            this.f41739a = actual;
            this.f41740b = itemTimeoutIndicator;
        }

        /* JADX INFO: renamed from: a */
        public void m12010a(wub<?> firstTimeoutIndicator) {
            if (firstTimeoutIndicator != null) {
                C6629a c6629a = new C6629a(0L, this);
                if (this.f41741c.replace(c6629a)) {
                    firstTimeoutIndicator.subscribe(c6629a);
                }
            }
        }

        @Override // p000.lf4
        public void dispose() {
            zf4.dispose(this.f41742d);
            this.f41741c.dispose();
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return zf4.isDisposed(this.f41742d.get());
        }

        @Override // p000.pxb
        public void onComplete() {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.f41741c.dispose();
                this.f41739a.onComplete();
            }
        }

        @Override // p000.pxb
        public void onError(Throwable t) {
            if (getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
                ofe.onError(t);
            } else {
                this.f41741c.dispose();
                this.f41739a.onError(t);
            }
        }

        @Override // p000.pxb
        public void onNext(T t) {
            long j = get();
            if (j != Long.MAX_VALUE) {
                long j2 = 1 + j;
                if (compareAndSet(j, j2)) {
                    lf4 lf4Var = this.f41741c.get();
                    if (lf4Var != null) {
                        lf4Var.dispose();
                    }
                    this.f41739a.onNext(t);
                    try {
                        wub<?> wubVarApply = this.f41740b.apply(t);
                        Objects.requireNonNull(wubVarApply, "The itemTimeoutIndicator returned a null ObservableSource.");
                        wub<?> wubVar = wubVarApply;
                        C6629a c6629a = new C6629a(j2, this);
                        if (this.f41741c.replace(c6629a)) {
                            wubVar.subscribe(c6629a);
                        }
                    } catch (Throwable th) {
                        o75.throwIfFatal(th);
                        this.f41742d.get().dispose();
                        getAndSet(Long.MAX_VALUE);
                        this.f41739a.onError(th);
                    }
                }
            }
        }

        @Override // p000.pxb
        public void onSubscribe(lf4 d) {
            zf4.setOnce(this.f41742d, d);
        }

        @Override // p000.iwb.InterfaceC7642d
        public void onTimeout(long idx) {
            if (compareAndSet(idx, Long.MAX_VALUE)) {
                zf4.dispose(this.f41742d);
                this.f41739a.onError(new TimeoutException());
            }
        }

        @Override // p000.gwb.InterfaceC6632d
        public void onTimeoutError(long idx, Throwable ex) {
            if (!compareAndSet(idx, Long.MAX_VALUE)) {
                ofe.onError(ex);
            } else {
                zf4.dispose(this.f41742d);
                this.f41739a.onError(ex);
            }
        }
    }

    /* JADX INFO: renamed from: gwb$d */
    public interface InterfaceC6632d extends iwb.InterfaceC7642d {
        void onTimeoutError(long idx, Throwable ex);
    }

    public gwb(vkb<T> source, wub<U> firstTimeoutIndicator, sy6<? super T, ? extends wub<V>> itemTimeoutIndicator, wub<? extends T> other) {
        super(source);
        this.f41728b = firstTimeoutIndicator;
        this.f41729c = itemTimeoutIndicator;
        this.f41730d = other;
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
    @Override // p000.vkb
    public void subscribeActual(pxb<? super T> pxbVar) {
        if (this.f41730d == null) {
            C6631c c6631c = new C6631c(pxbVar, this.f41729c);
            pxbVar.onSubscribe(c6631c);
            c6631c.m12010a(this.f41728b);
            this.f63101a.subscribe(c6631c);
            return;
        }
        C6630b c6630b = new C6630b(pxbVar, this.f41729c, this.f41730d);
        pxbVar.onSubscribe(c6630b);
        c6630b.m12009a(this.f41728b);
        this.f63101a.subscribe(c6630b);
    }
}
