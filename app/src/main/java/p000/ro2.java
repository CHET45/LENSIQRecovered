package p000;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p000.ape;
import p000.voe;

/* JADX INFO: loaded from: classes7.dex */
public final class ro2 extends voe implements ape {

    /* JADX INFO: renamed from: C */
    public static final String f78840C = "rx2.computation-threads";

    /* JADX INFO: renamed from: F */
    public static final int f78841F = m21447b(Runtime.getRuntime().availableProcessors(), Integer.getInteger(f78840C, 0).intValue());

    /* JADX INFO: renamed from: H */
    public static final C12179c f78842H;

    /* JADX INFO: renamed from: L */
    public static final String f78843L = "rx2.computation-priority";

    /* JADX INFO: renamed from: e */
    public static final C12178b f78844e;

    /* JADX INFO: renamed from: f */
    public static final String f78845f = "RxComputationThreadPool";

    /* JADX INFO: renamed from: m */
    public static final qfe f78846m;

    /* JADX INFO: renamed from: c */
    public final ThreadFactory f78847c;

    /* JADX INFO: renamed from: d */
    public final AtomicReference<C12178b> f78848d;

    /* JADX INFO: renamed from: ro2$b */
    public static final class C12178b implements ape {

        /* JADX INFO: renamed from: a */
        public final int f78854a;

        /* JADX INFO: renamed from: b */
        public final C12179c[] f78855b;

        /* JADX INFO: renamed from: c */
        public long f78856c;

        public C12178b(int i, ThreadFactory threadFactory) {
            this.f78854a = i;
            this.f78855b = new C12179c[i];
            for (int i2 = 0; i2 < i; i2++) {
                this.f78855b[i2] = new C12179c(threadFactory);
            }
        }

        @Override // p000.ape
        public void createWorkers(int i, ape.InterfaceC1551a interfaceC1551a) {
            int i2 = this.f78854a;
            if (i2 == 0) {
                for (int i3 = 0; i3 < i; i3++) {
                    interfaceC1551a.onWorker(i3, ro2.f78842H);
                }
                return;
            }
            int i4 = ((int) this.f78856c) % i2;
            for (int i5 = 0; i5 < i; i5++) {
                interfaceC1551a.onWorker(i5, new C12177a(this.f78855b[i4]));
                i4++;
                if (i4 == i2) {
                    i4 = 0;
                }
            }
            this.f78856c = i4;
        }

        public C12179c getEventLoop() {
            int i = this.f78854a;
            if (i == 0) {
                return ro2.f78842H;
            }
            C12179c[] c12179cArr = this.f78855b;
            long j = this.f78856c;
            this.f78856c = 1 + j;
            return c12179cArr[(int) (j % ((long) i))];
        }

        public void shutdown() {
            for (C12179c c12179c : this.f78855b) {
                c12179c.dispose();
            }
        }
    }

    /* JADX INFO: renamed from: ro2$c */
    public static final class C12179c extends xcb {
        public C12179c(ThreadFactory threadFactory) {
            super(threadFactory);
        }
    }

    static {
        C12179c c12179c = new C12179c(new qfe("RxComputationShutdown"));
        f78842H = c12179c;
        c12179c.dispose();
        qfe qfeVar = new qfe("RxComputationThreadPool", Math.max(1, Math.min(10, Integer.getInteger(f78843L, 5).intValue())), true);
        f78846m = qfeVar;
        C12178b c12178b = new C12178b(0, qfeVar);
        f78844e = c12178b;
        c12178b.shutdown();
    }

    public ro2() {
        this(f78846m);
    }

    /* JADX INFO: renamed from: b */
    public static int m21447b(int i, int i2) {
        return (i2 <= 0 || i2 > i) ? i : i2;
    }

    @Override // p000.voe
    @bfb
    public voe.AbstractC14185c createWorker() {
        return new C12177a(this.f78848d.get().getEventLoop());
    }

    @Override // p000.ape
    public void createWorkers(int i, ape.InterfaceC1551a interfaceC1551a) {
        xjb.verifyPositive(i, "number > 0 required");
        this.f78848d.get().createWorkers(i, interfaceC1551a);
    }

    @Override // p000.voe
    @bfb
    public mf4 scheduleDirect(@bfb Runnable runnable, long j, TimeUnit timeUnit) {
        return this.f78848d.get().getEventLoop().scheduleDirect(runnable, j, timeUnit);
    }

    @Override // p000.voe
    @bfb
    public mf4 schedulePeriodicallyDirect(@bfb Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return this.f78848d.get().getEventLoop().schedulePeriodicallyDirect(runnable, j, j2, timeUnit);
    }

    @Override // p000.voe
    public void shutdown() {
        C12178b c12178b;
        C12178b c12178b2;
        do {
            c12178b = this.f78848d.get();
            c12178b2 = f78844e;
            if (c12178b == c12178b2) {
                return;
            }
        } while (!v7b.m23844a(this.f78848d, c12178b, c12178b2));
        c12178b.shutdown();
    }

    @Override // p000.voe
    public void start() {
        C12178b c12178b = new C12178b(f78841F, this.f78847c);
        if (v7b.m23844a(this.f78848d, f78844e, c12178b)) {
            return;
        }
        c12178b.shutdown();
    }

    public ro2(ThreadFactory threadFactory) {
        this.f78847c = threadFactory;
        this.f78848d = new AtomicReference<>(f78844e);
        start();
    }

    /* JADX INFO: renamed from: ro2$a */
    public static final class C12177a extends voe.AbstractC14185c {

        /* JADX INFO: renamed from: a */
        public final t89 f78849a;

        /* JADX INFO: renamed from: b */
        public final nm2 f78850b;

        /* JADX INFO: renamed from: c */
        public final t89 f78851c;

        /* JADX INFO: renamed from: d */
        public final C12179c f78852d;

        /* JADX INFO: renamed from: e */
        public volatile boolean f78853e;

        public C12177a(C12179c c12179c) {
            this.f78852d = c12179c;
            t89 t89Var = new t89();
            this.f78849a = t89Var;
            nm2 nm2Var = new nm2();
            this.f78850b = nm2Var;
            t89 t89Var2 = new t89();
            this.f78851c = t89Var2;
            t89Var2.add(t89Var);
            t89Var2.add(nm2Var);
        }

        @Override // p000.mf4
        public void dispose() {
            if (this.f78853e) {
                return;
            }
            this.f78853e = true;
            this.f78851c.dispose();
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f78853e;
        }

        @Override // p000.voe.AbstractC14185c
        @bfb
        public mf4 schedule(@bfb Runnable runnable) {
            return this.f78853e ? c05.INSTANCE : this.f78852d.scheduleActual(runnable, 0L, TimeUnit.MILLISECONDS, this.f78849a);
        }

        @Override // p000.voe.AbstractC14185c
        @bfb
        public mf4 schedule(@bfb Runnable runnable, long j, @bfb TimeUnit timeUnit) {
            if (this.f78853e) {
                return c05.INSTANCE;
            }
            return this.f78852d.scheduleActual(runnable, j, timeUnit, this.f78850b);
        }
    }
}
