package p000;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p000.voe;

/* JADX INFO: loaded from: classes7.dex */
public class kpe extends voe implements mf4 {

    /* JADX INFO: renamed from: f */
    public static final mf4 f54901f = new C8490g();

    /* JADX INFO: renamed from: m */
    public static final mf4 f54902m = pg4.disposed();

    /* JADX INFO: renamed from: c */
    public final voe f54903c;

    /* JADX INFO: renamed from: d */
    public final rg6<m86<yd2>> f54904d;

    /* JADX INFO: renamed from: e */
    public mf4 f54905e;

    /* JADX INFO: renamed from: kpe$a */
    public static final class C8484a implements py6<AbstractC8489f, yd2> {

        /* JADX INFO: renamed from: a */
        public final voe.AbstractC14185c f54906a;

        /* JADX INFO: renamed from: kpe$a$a */
        public final class a extends yd2 {

            /* JADX INFO: renamed from: a */
            public final AbstractC8489f f54907a;

            public a(AbstractC8489f abstractC8489f) {
                this.f54907a = abstractC8489f;
            }

            @Override // p000.yd2
            public void subscribeActual(dh2 dh2Var) {
                dh2Var.onSubscribe(this.f54907a);
                this.f54907a.m14893a(C8484a.this.f54906a, dh2Var);
            }
        }

        public C8484a(voe.AbstractC14185c abstractC14185c) {
            this.f54906a = abstractC14185c;
        }

        @Override // p000.py6
        public yd2 apply(AbstractC8489f abstractC8489f) {
            return new a(abstractC8489f);
        }
    }

    /* JADX INFO: renamed from: kpe$b */
    public static class C8485b extends AbstractC8489f {

        /* JADX INFO: renamed from: a */
        public final Runnable f54909a;

        /* JADX INFO: renamed from: b */
        public final long f54910b;

        /* JADX INFO: renamed from: c */
        public final TimeUnit f54911c;

        public C8485b(Runnable runnable, long j, TimeUnit timeUnit) {
            this.f54909a = runnable;
            this.f54910b = j;
            this.f54911c = timeUnit;
        }

        @Override // p000.kpe.AbstractC8489f
        /* JADX INFO: renamed from: b */
        public mf4 mo14892b(voe.AbstractC14185c abstractC14185c, dh2 dh2Var) {
            return abstractC14185c.schedule(new RunnableC8487d(this.f54909a, dh2Var), this.f54910b, this.f54911c);
        }
    }

    /* JADX INFO: renamed from: kpe$c */
    public static class C8486c extends AbstractC8489f {

        /* JADX INFO: renamed from: a */
        public final Runnable f54912a;

        public C8486c(Runnable runnable) {
            this.f54912a = runnable;
        }

        @Override // p000.kpe.AbstractC8489f
        /* JADX INFO: renamed from: b */
        public mf4 mo14892b(voe.AbstractC14185c abstractC14185c, dh2 dh2Var) {
            return abstractC14185c.schedule(new RunnableC8487d(this.f54912a, dh2Var));
        }
    }

    /* JADX INFO: renamed from: kpe$d */
    public static class RunnableC8487d implements Runnable {

        /* JADX INFO: renamed from: a */
        public final dh2 f54913a;

        /* JADX INFO: renamed from: b */
        public final Runnable f54914b;

        public RunnableC8487d(Runnable runnable, dh2 dh2Var) {
            this.f54914b = runnable;
            this.f54913a = dh2Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f54914b.run();
            } finally {
                this.f54913a.onComplete();
            }
        }
    }

    /* JADX INFO: renamed from: kpe$f */
    public static abstract class AbstractC8489f extends AtomicReference<mf4> implements mf4 {
        public AbstractC8489f() {
            super(kpe.f54901f);
        }

        /* JADX INFO: renamed from: a */
        public void m14893a(voe.AbstractC14185c abstractC14185c, dh2 dh2Var) {
            mf4 mf4Var;
            mf4 mf4Var2 = get();
            if (mf4Var2 != kpe.f54902m && mf4Var2 == (mf4Var = kpe.f54901f)) {
                mf4 mf4VarMo14892b = mo14892b(abstractC14185c, dh2Var);
                if (compareAndSet(mf4Var, mf4VarMo14892b)) {
                    return;
                }
                mf4VarMo14892b.dispose();
            }
        }

        /* JADX INFO: renamed from: b */
        public abstract mf4 mo14892b(voe.AbstractC14185c abstractC14185c, dh2 dh2Var);

        @Override // p000.mf4
        public void dispose() {
            mf4 mf4Var;
            mf4 mf4Var2 = kpe.f54902m;
            do {
                mf4Var = get();
                if (mf4Var == kpe.f54902m) {
                    return;
                }
            } while (!compareAndSet(mf4Var, mf4Var2));
            if (mf4Var != kpe.f54901f) {
                mf4Var.dispose();
            }
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return get().isDisposed();
        }
    }

    /* JADX INFO: renamed from: kpe$g */
    public static final class C8490g implements mf4 {
        @Override // p000.mf4
        public void dispose() {
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public kpe(py6<m86<m86<yd2>>, yd2> py6Var, voe voeVar) {
        this.f54903c = voeVar;
        rg6 serialized = msh.create().toSerialized();
        this.f54904d = serialized;
        try {
            this.f54905e = ((yd2) py6Var.apply(serialized)).subscribe();
        } catch (Throwable th) {
            throw j75.wrapOrThrow(th);
        }
    }

    @Override // p000.voe
    @bfb
    public voe.AbstractC14185c createWorker() {
        voe.AbstractC14185c abstractC14185cCreateWorker = this.f54903c.createWorker();
        rg6<T> serialized = msh.create().toSerialized();
        m86<yd2> map = serialized.map(new C8484a(abstractC14185cCreateWorker));
        C8488e c8488e = new C8488e(serialized, abstractC14185cCreateWorker);
        this.f54904d.onNext(map);
        return c8488e;
    }

    @Override // p000.mf4
    public void dispose() {
        this.f54905e.dispose();
    }

    @Override // p000.mf4
    public boolean isDisposed() {
        return this.f54905e.isDisposed();
    }

    /* JADX INFO: renamed from: kpe$e */
    public static final class C8488e extends voe.AbstractC14185c {

        /* JADX INFO: renamed from: a */
        public final AtomicBoolean f54915a = new AtomicBoolean();

        /* JADX INFO: renamed from: b */
        public final rg6<AbstractC8489f> f54916b;

        /* JADX INFO: renamed from: c */
        public final voe.AbstractC14185c f54917c;

        public C8488e(rg6<AbstractC8489f> rg6Var, voe.AbstractC14185c abstractC14185c) {
            this.f54916b = rg6Var;
            this.f54917c = abstractC14185c;
        }

        @Override // p000.mf4
        public void dispose() {
            if (this.f54915a.compareAndSet(false, true)) {
                this.f54916b.onComplete();
                this.f54917c.dispose();
            }
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f54915a.get();
        }

        @Override // p000.voe.AbstractC14185c
        @bfb
        public mf4 schedule(@bfb Runnable runnable, long j, @bfb TimeUnit timeUnit) {
            C8485b c8485b = new C8485b(runnable, j, timeUnit);
            this.f54916b.onNext(c8485b);
            return c8485b;
        }

        @Override // p000.voe.AbstractC14185c
        @bfb
        public mf4 schedule(@bfb Runnable runnable) {
            C8486c c8486c = new C8486c(runnable);
            this.f54916b.onNext(c8486c);
            return c8486c;
        }
    }
}
