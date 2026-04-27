package p000;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;
import p000.dm6;

/* JADX INFO: loaded from: classes5.dex */
@gd7
@qx4
public class jjh<V> extends dm6.AbstractC4859a<V> implements RunnableFuture<V> {

    /* JADX INFO: renamed from: F */
    @wx1
    public volatile pc8<?> f50732F;

    /* JADX INFO: renamed from: jjh$a */
    public final class C7921a extends pc8<ja9<V>> {

        /* JADX INFO: renamed from: d */
        public final l90<V> f50733d;

        public C7921a(l90<V> callable) {
            this.f50733d = (l90) v7d.checkNotNull(callable);
        }

        @Override // p000.pc8
        /* JADX INFO: renamed from: a */
        public void mo14139a(Throwable error) {
            jjh.this.setException(error);
        }

        @Override // p000.pc8
        /* JADX INFO: renamed from: d */
        public final boolean mo14141d() {
            return jjh.this.isDone();
        }

        @Override // p000.pc8
        /* JADX INFO: renamed from: f */
        public String mo14143f() {
            return this.f50733d.toString();
        }

        @Override // p000.pc8
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void mo14140b(ja9<V> result) {
            jjh.this.setFuture(result);
        }

        @Override // p000.pc8
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public ja9<V> mo14142e() throws Exception {
            return (ja9) v7d.checkNotNull(this.f50733d.call(), "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", this.f50733d);
        }
    }

    /* JADX INFO: renamed from: jjh$b */
    public final class C7922b extends pc8<V> {

        /* JADX INFO: renamed from: d */
        public final Callable<V> f50735d;

        public C7922b(Callable<V> callable) {
            this.f50735d = (Callable) v7d.checkNotNull(callable);
        }

        @Override // p000.pc8
        /* JADX INFO: renamed from: a */
        public void mo14139a(Throwable error) {
            jjh.this.setException(error);
        }

        @Override // p000.pc8
        /* JADX INFO: renamed from: b */
        public void mo14140b(@agc V result) {
            jjh.this.set(result);
        }

        @Override // p000.pc8
        /* JADX INFO: renamed from: d */
        public final boolean mo14141d() {
            return jjh.this.isDone();
        }

        @Override // p000.pc8
        @agc
        /* JADX INFO: renamed from: e */
        public V mo14142e() throws Exception {
            return this.f50735d.call();
        }

        @Override // p000.pc8
        /* JADX INFO: renamed from: f */
        public String mo14143f() {
            return this.f50735d.toString();
        }
    }

    public jjh(Callable<V> callable) {
        this.f50732F = new C7922b(callable);
    }

    /* JADX INFO: renamed from: p */
    public static <V> jjh<V> m14136p(l90<V> callable) {
        return new jjh<>(callable);
    }

    /* JADX INFO: renamed from: q */
    public static <V> jjh<V> m14137q(Runnable runnable, @agc V result) {
        return new jjh<>(Executors.callable(runnable, result));
    }

    /* JADX INFO: renamed from: r */
    public static <V> jjh<V> m14138r(Callable<V> callable) {
        return new jjh<>(callable);
    }

    @Override // p000.AbstractC9640n1
    /* JADX INFO: renamed from: k */
    public void mo2822k() {
        pc8<?> pc8Var;
        super.mo2822k();
        if (m17708o() && (pc8Var = this.f50732F) != null) {
            pc8Var.m19412c();
        }
        this.f50732F = null;
    }

    @Override // p000.AbstractC9640n1
    @wx1
    /* JADX INFO: renamed from: n */
    public String mo2823n() {
        pc8<?> pc8Var = this.f50732F;
        if (pc8Var == null) {
            return super.mo2823n();
        }
        return "task=[" + pc8Var + "]";
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public void run() {
        pc8<?> pc8Var = this.f50732F;
        if (pc8Var != null) {
            pc8Var.run();
        }
        this.f50732F = null;
    }

    public jjh(l90<V> callable) {
        this.f50732F = new C7921a(callable);
    }
}
