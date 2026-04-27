package p000;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes7.dex */
public final class mpe {

    /* JADX INFO: renamed from: a */
    @cfb
    public static final woe f61705a = ofe.initSingleScheduler(new C9463h());

    /* JADX INFO: renamed from: b */
    @cfb
    public static final woe f61706b = ofe.initComputationScheduler(new C9457b());

    /* JADX INFO: renamed from: c */
    @cfb
    public static final woe f61707c = ofe.initIoScheduler(new C9458c());

    /* JADX INFO: renamed from: d */
    @cfb
    public static final woe f61708d = b8h.instance();

    /* JADX INFO: renamed from: e */
    @cfb
    public static final woe f61709e = ofe.initNewThreadScheduler(new C9461f());

    /* JADX INFO: renamed from: mpe$a */
    public static final class C9456a {

        /* JADX INFO: renamed from: a */
        public static final woe f61710a = new so2();
    }

    /* JADX INFO: renamed from: mpe$b */
    public static final class C9457b implements nfg<woe> {
        @Override // p000.nfg
        public woe get() {
            return C9456a.f61710a;
        }
    }

    /* JADX INFO: renamed from: mpe$c */
    public static final class C9458c implements nfg<woe> {
        @Override // p000.nfg
        public woe get() {
            return C9459d.f61711a;
        }
    }

    /* JADX INFO: renamed from: mpe$d */
    public static final class C9459d {

        /* JADX INFO: renamed from: a */
        public static final woe f61711a = new af8();
    }

    /* JADX INFO: renamed from: mpe$e */
    public static final class C9460e {

        /* JADX INFO: renamed from: a */
        public static final woe f61712a = new ucb();
    }

    /* JADX INFO: renamed from: mpe$f */
    public static final class C9461f implements nfg<woe> {
        @Override // p000.nfg
        public woe get() {
            return C9460e.f61712a;
        }
    }

    /* JADX INFO: renamed from: mpe$g */
    public static final class C9462g {

        /* JADX INFO: renamed from: a */
        public static final woe f61713a = new lof();
    }

    /* JADX INFO: renamed from: mpe$h */
    public static final class C9463h implements nfg<woe> {
        @Override // p000.nfg
        public woe get() {
            return C9462g.f61713a;
        }
    }

    private mpe() {
        throw new IllegalStateException("No instances!");
    }

    @cfb
    public static woe computation() {
        return ofe.onComputationScheduler(f61706b);
    }

    @cfb
    public static woe from(@cfb Executor executor) {
        return from(executor, false, false);
    }

    @cfb
    /* JADX INFO: renamed from: io */
    public static woe m17504io() {
        return ofe.onIoScheduler(f61707c);
    }

    @cfb
    public static woe newThread() {
        return ofe.onNewThreadScheduler(f61709e);
    }

    public static void shutdown() {
        computation().shutdown();
        m17504io().shutdown();
        newThread().shutdown();
        single().shutdown();
        trampoline().shutdown();
    }

    @cfb
    public static woe single() {
        return ofe.onSingleScheduler(f61705a);
    }

    public static void start() {
        computation().start();
        m17504io().start();
        newThread().start();
        single().start();
        trampoline().start();
    }

    @cfb
    public static woe trampoline() {
        return f61708d;
    }

    @cfb
    public static woe from(@cfb Executor executor, boolean interruptibleWorker) {
        return from(executor, interruptibleWorker, false);
    }

    @cfb
    public static woe from(@cfb Executor executor, boolean interruptibleWorker, boolean fair) {
        return ofe.createExecutorScheduler(executor, interruptibleWorker, fair);
    }
}
