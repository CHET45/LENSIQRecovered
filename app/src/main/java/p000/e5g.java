package p000;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes8.dex */
public abstract class e5g implements fpg {

    /* JADX INFO: renamed from: a */
    public final C5129b f31862a;

    /* JADX INFO: renamed from: b */
    public volatile long f31863b;

    /* JADX INFO: renamed from: c */
    public volatile long f31864c;

    /* JADX INFO: renamed from: e5g$b */
    public static class C5129b {
        public long nanoTime() {
            return System.nanoTime();
        }
    }

    /* JADX INFO: renamed from: e5g$c */
    public class C5130c extends rpg {
        private C5130c() {
        }

        @Override // p000.rpg
        /* JADX INFO: renamed from: f */
        public void mo9709f(Throwable th, j74 j74Var) {
            e5g.this.stopping();
            e5g e5gVar = e5g.this;
            e5gVar.m9705d(e5gVar.getNanos(), th, j74Var);
        }

        @Override // p000.rpg
        /* JADX INFO: renamed from: g */
        public void mo9710g(j74 j74Var) {
            e5g e5gVar = e5g.this;
            e5gVar.m9706e(e5gVar.getNanos(), j74Var);
        }

        @Override // p000.rpg
        /* JADX INFO: renamed from: i */
        public void mo9711i(h90 h90Var, j74 j74Var) {
            e5g.this.stopping();
            e5g e5gVar = e5g.this;
            e5gVar.m9707f(e5gVar.getNanos(), h90Var, j74Var);
        }

        @Override // p000.rpg
        /* JADX INFO: renamed from: j */
        public void mo2529j(j74 j74Var) {
            e5g.this.starting();
        }

        @Override // p000.rpg
        /* JADX INFO: renamed from: k */
        public void mo9712k(j74 j74Var) {
            e5g.this.stopping();
            e5g e5gVar = e5g.this;
            e5gVar.m9708g(e5gVar.getNanos(), j74Var);
        }
    }

    public e5g() {
        this(new C5129b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getNanos() {
        if (this.f31863b == 0) {
            throw new IllegalStateException("Test has not started");
        }
        long jNanoTime = this.f31864c;
        if (jNanoTime == 0) {
            jNanoTime = this.f31862a.nanoTime();
        }
        return jNanoTime - this.f31863b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void starting() {
        this.f31863b = this.f31862a.nanoTime();
        this.f31864c = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stopping() {
        this.f31864c = this.f31862a.nanoTime();
    }

    @Override // p000.fpg
    public final f3g apply(f3g f3gVar, j74 j74Var) {
        return new C5130c().apply(f3gVar, j74Var);
    }

    /* JADX INFO: renamed from: d */
    public void m9705d(long j, Throwable th, j74 j74Var) {
    }

    /* JADX INFO: renamed from: e */
    public void m9706e(long j, j74 j74Var) {
    }

    /* JADX INFO: renamed from: f */
    public void m9707f(long j, h90 h90Var, j74 j74Var) {
    }

    /* JADX INFO: renamed from: g */
    public void m9708g(long j, j74 j74Var) {
    }

    public long runtime(TimeUnit timeUnit) {
        return timeUnit.convert(getNanos(), TimeUnit.NANOSECONDS);
    }

    public e5g(C5129b c5129b) {
        this.f31862a = c5129b;
    }
}
