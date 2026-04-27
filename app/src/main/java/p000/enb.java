package p000;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class enb<T> extends vkb<T> {

    /* JADX INFO: renamed from: a */
    public final csb<T> f33605a;

    /* JADX INFO: renamed from: enb$a */
    public static final class C5412a<T> extends AtomicReference<lf4> implements lob<T>, lf4 {
        private static final long serialVersionUID = -3434801548987643227L;

        /* JADX INFO: renamed from: a */
        public final pxb<? super T> f33606a;

        public C5412a(pxb<? super T> observer) {
            this.f33606a = observer;
        }

        @Override // p000.lf4
        public void dispose() {
            zf4.dispose(this);
        }

        @Override // p000.lob, p000.lf4
        public boolean isDisposed() {
            return zf4.isDisposed(get());
        }

        @Override // p000.qy4
        public void onComplete() {
            if (isDisposed()) {
                return;
            }
            try {
                this.f33606a.onComplete();
            } finally {
                dispose();
            }
        }

        @Override // p000.qy4
        public void onError(Throwable t) {
            if (tryOnError(t)) {
                return;
            }
            ofe.onError(t);
        }

        @Override // p000.qy4
        public void onNext(T t) {
            if (t == null) {
                onError(k75.createNullPointerException("onNext called with a null value."));
            } else {
                if (isDisposed()) {
                    return;
                }
                this.f33606a.onNext(t);
            }
        }

        @Override // p000.lob
        public lob<T> serialize() {
            return new C5413b(this);
        }

        @Override // p000.lob
        public void setCancellable(bq1 c) {
            setDisposable(new iq1(c));
        }

        @Override // p000.lob
        public void setDisposable(lf4 d) {
            zf4.set(this, d);
        }

        @Override // java.util.concurrent.atomic.AtomicReference
        public String toString() {
            return String.format("%s{%s}", C5412a.class.getSimpleName(), super.toString());
        }

        @Override // p000.lob
        public boolean tryOnError(Throwable t) {
            if (t == null) {
                t = k75.createNullPointerException("onError called with a null Throwable.");
            }
            if (isDisposed()) {
                return false;
            }
            try {
                this.f33606a.onError(t);
                dispose();
                return true;
            } catch (Throwable th) {
                dispose();
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: enb$b */
    public static final class C5413b<T> extends AtomicInteger implements lob<T> {
        private static final long serialVersionUID = 4883307006032401862L;

        /* JADX INFO: renamed from: a */
        public final lob<T> f33607a;

        /* JADX INFO: renamed from: b */
        public final bc0 f33608b = new bc0();

        /* JADX INFO: renamed from: c */
        public final qzf<T> f33609c = new qzf<>(16);

        /* JADX INFO: renamed from: d */
        public volatile boolean f33610d;

        public C5413b(lob<T> emitter) {
            this.f33607a = emitter;
        }

        /* JADX INFO: renamed from: a */
        public void m10160a() {
            if (getAndIncrement() == 0) {
                m10161b();
            }
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
        /* JADX INFO: renamed from: b */
        public void m10161b() {
            lob<T> lobVar = this.f33607a;
            qzf<T> qzfVar = this.f33609c;
            bc0 bc0Var = this.f33608b;
            int iAddAndGet = 1;
            while (!lobVar.isDisposed()) {
                if (bc0Var.get() != null) {
                    qzfVar.clear();
                    bc0Var.tryTerminateConsumer(lobVar);
                    return;
                }
                boolean z = this.f33610d;
                T tPoll = qzfVar.poll();
                boolean z2 = tPoll == null;
                if (z && z2) {
                    lobVar.onComplete();
                    return;
                } else if (z2) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    lobVar.onNext(tPoll);
                }
            }
            qzfVar.clear();
        }

        @Override // p000.lob, p000.lf4
        public boolean isDisposed() {
            return this.f33607a.isDisposed();
        }

        @Override // p000.qy4
        public void onComplete() {
            if (this.f33610d || this.f33607a.isDisposed()) {
                return;
            }
            this.f33610d = true;
            m10160a();
        }

        @Override // p000.qy4
        public void onError(Throwable t) {
            if (tryOnError(t)) {
                return;
            }
            ofe.onError(t);
        }

        @Override // p000.qy4
        public void onNext(T t) {
            if (this.f33610d || this.f33607a.isDisposed()) {
                return;
            }
            if (t == null) {
                onError(k75.createNullPointerException("onNext called with a null value."));
                return;
            }
            if (get() == 0 && compareAndSet(0, 1)) {
                this.f33607a.onNext(t);
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                qzf<T> qzfVar = this.f33609c;
                synchronized (qzfVar) {
                    qzfVar.offer(t);
                }
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            m10161b();
        }

        @Override // p000.lob
        public lob<T> serialize() {
            return this;
        }

        @Override // p000.lob
        public void setCancellable(bq1 c) {
            this.f33607a.setCancellable(c);
        }

        @Override // p000.lob
        public void setDisposable(lf4 d) {
            this.f33607a.setDisposable(d);
        }

        @Override // java.util.concurrent.atomic.AtomicInteger
        public String toString() {
            return this.f33607a.toString();
        }

        @Override // p000.lob
        public boolean tryOnError(Throwable t) {
            if (!this.f33610d && !this.f33607a.isDisposed()) {
                if (t == null) {
                    t = k75.createNullPointerException("onError called with a null Throwable.");
                }
                if (this.f33608b.tryAddThrowable(t)) {
                    this.f33610d = true;
                    m10160a();
                    return true;
                }
            }
            return false;
        }
    }

    public enb(csb<T> source) {
        this.f33605a = source;
    }

    @Override // p000.vkb
    public void subscribeActual(pxb<? super T> observer) {
        C5412a c5412a = new C5412a(observer);
        observer.onSubscribe(c5412a);
        try {
            this.f33605a.subscribe(c5412a);
        } catch (Throwable th) {
            o75.throwIfFatal(th);
            c5412a.onError(th);
        }
    }
}
