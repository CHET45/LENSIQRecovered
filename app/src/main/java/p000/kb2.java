package p000;

import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import p000.AbstractC8831lj;

/* JADX INFO: loaded from: classes5.dex */
@gd7
@qx4
public final class kb2<V> extends AbstractC8831lj<Object, V> {

    /* JADX INFO: renamed from: Z */
    @wx1
    public kb2<V>.AbstractC8275c<?> f53509Z;

    /* JADX INFO: renamed from: kb2$a */
    public final class C8273a extends kb2<V>.AbstractC8275c<ja9<V>> {

        /* JADX INFO: renamed from: f */
        public final l90<V> f53510f;

        public C8273a(l90<V> callable, Executor listenerExecutor) {
            super(listenerExecutor);
            this.f53510f = (l90) v7d.checkNotNull(callable);
        }

        @Override // p000.pc8
        /* JADX INFO: renamed from: f */
        public String mo14143f() {
            return this.f53510f.toString();
        }

        @Override // p000.pc8
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public ja9<V> mo14142e() throws Exception {
            return (ja9) v7d.checkNotNull(this.f53510f.call(), "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", this.f53510f);
        }

        @Override // p000.kb2.AbstractC8275c
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public void mo14640h(ja9<V> value) {
            kb2.this.setFuture(value);
        }
    }

    /* JADX INFO: renamed from: kb2$b */
    public final class C8274b extends kb2<V>.AbstractC8275c<V> {

        /* JADX INFO: renamed from: f */
        public final Callable<V> f53512f;

        public C8274b(Callable<V> callable, Executor listenerExecutor) {
            super(listenerExecutor);
            this.f53512f = (Callable) v7d.checkNotNull(callable);
        }

        @Override // p000.pc8
        @agc
        /* JADX INFO: renamed from: e */
        public V mo14142e() throws Exception {
            return this.f53512f.call();
        }

        @Override // p000.pc8
        /* JADX INFO: renamed from: f */
        public String mo14143f() {
            return this.f53512f.toString();
        }

        @Override // p000.kb2.AbstractC8275c
        /* JADX INFO: renamed from: h */
        public void mo14640h(@agc V value) {
            kb2.this.set(value);
        }
    }

    /* JADX INFO: renamed from: kb2$c */
    public abstract class AbstractC8275c<T> extends pc8<T> {

        /* JADX INFO: renamed from: d */
        public final Executor f53514d;

        public AbstractC8275c(Executor listenerExecutor) {
            this.f53514d = (Executor) v7d.checkNotNull(listenerExecutor);
        }

        @Override // p000.pc8
        /* JADX INFO: renamed from: a */
        public final void mo14139a(Throwable error) {
            kb2.this.f53509Z = null;
            if (error instanceof ExecutionException) {
                kb2.this.setException(((ExecutionException) error).getCause());
            } else if (error instanceof CancellationException) {
                kb2.this.cancel(false);
            } else {
                kb2.this.setException(error);
            }
        }

        @Override // p000.pc8
        /* JADX INFO: renamed from: b */
        public final void mo14140b(@agc T result) {
            kb2.this.f53509Z = null;
            mo14640h(result);
        }

        @Override // p000.pc8
        /* JADX INFO: renamed from: d */
        public final boolean mo14141d() {
            return kb2.this.isDone();
        }

        /* JADX INFO: renamed from: g */
        public final void m14643g() {
            try {
                this.f53514d.execute(this);
            } catch (RejectedExecutionException e) {
                kb2.this.setException(e);
            }
        }

        /* JADX INFO: renamed from: h */
        public abstract void mo14640h(@agc T value);
    }

    public kb2(ax7<? extends ja9<?>> futures, boolean allMustSucceed, Executor listenerExecutor, l90<V> callable) {
        super(futures, allMustSucceed, false);
        this.f53509Z = new C8273a(callable, listenerExecutor);
        m16167A();
    }

    @Override // p000.AbstractC8831lj
    /* JADX INFO: renamed from: B */
    public void mo14636B(AbstractC8831lj.a reason) {
        super.mo14636B(reason);
        if (reason == AbstractC8831lj.a.OUTPUT_FUTURE_DONE) {
            this.f53509Z = null;
        }
    }

    @Override // p000.AbstractC9640n1
    /* JADX INFO: renamed from: l */
    public void mo14637l() {
        kb2<V>.AbstractC8275c<?> abstractC8275c = this.f53509Z;
        if (abstractC8275c != null) {
            abstractC8275c.m19412c();
        }
    }

    @Override // p000.AbstractC8831lj
    /* JADX INFO: renamed from: y */
    public void mo14638y(int index, @wx1 Object returnValue) {
    }

    @Override // p000.AbstractC8831lj
    /* JADX INFO: renamed from: z */
    public void mo14639z() {
        kb2<V>.AbstractC8275c<?> abstractC8275c = this.f53509Z;
        if (abstractC8275c != null) {
            abstractC8275c.m14643g();
        }
    }

    public kb2(ax7<? extends ja9<?>> futures, boolean allMustSucceed, Executor listenerExecutor, Callable<V> callable) {
        super(futures, allMustSucceed, false);
        this.f53509Z = new C8274b(callable, listenerExecutor);
        m16167A();
    }
}
