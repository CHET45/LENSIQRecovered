package p000;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes7.dex */
public final class npe {

    /* JADX INFO: renamed from: a */
    @bfb
    public static final voe f65213a = pfe.initSingleScheduler(new CallableC9975h());

    /* JADX INFO: renamed from: b */
    @bfb
    public static final voe f65214b = pfe.initComputationScheduler(new CallableC9969b());

    /* JADX INFO: renamed from: c */
    @bfb
    public static final voe f65215c = pfe.initIoScheduler(new CallableC9970c());

    /* JADX INFO: renamed from: d */
    @bfb
    public static final voe f65216d = a8h.instance();

    /* JADX INFO: renamed from: e */
    @bfb
    public static final voe f65217e = pfe.initNewThreadScheduler(new CallableC9973f());

    /* JADX INFO: renamed from: npe$a */
    public static final class C9968a {

        /* JADX INFO: renamed from: a */
        public static final voe f65218a = new ro2();
    }

    /* JADX INFO: renamed from: npe$b */
    public static final class CallableC9969b implements Callable<voe> {
        @Override // java.util.concurrent.Callable
        public voe call() throws Exception {
            return C9968a.f65218a;
        }
    }

    /* JADX INFO: renamed from: npe$c */
    public static final class CallableC9970c implements Callable<voe> {
        @Override // java.util.concurrent.Callable
        public voe call() throws Exception {
            return C9971d.f65219a;
        }
    }

    /* JADX INFO: renamed from: npe$d */
    public static final class C9971d {

        /* JADX INFO: renamed from: a */
        public static final voe f65219a = new ze8();
    }

    /* JADX INFO: renamed from: npe$e */
    public static final class C9972e {

        /* JADX INFO: renamed from: a */
        public static final voe f65220a = new vcb();
    }

    /* JADX INFO: renamed from: npe$f */
    public static final class CallableC9973f implements Callable<voe> {
        @Override // java.util.concurrent.Callable
        public voe call() throws Exception {
            return C9972e.f65220a;
        }
    }

    /* JADX INFO: renamed from: npe$g */
    public static final class C9974g {

        /* JADX INFO: renamed from: a */
        public static final voe f65221a = new kof();
    }

    /* JADX INFO: renamed from: npe$h */
    public static final class CallableC9975h implements Callable<voe> {
        @Override // java.util.concurrent.Callable
        public voe call() throws Exception {
            return C9974g.f65221a;
        }
    }

    private npe() {
        throw new IllegalStateException("No instances!");
    }

    @bfb
    public static voe computation() {
        return pfe.onComputationScheduler(f65214b);
    }

    @bfb
    public static voe from(@bfb Executor executor) {
        return new v85(executor, false);
    }

    @bfb
    /* JADX INFO: renamed from: io */
    public static voe m18057io() {
        return pfe.onIoScheduler(f65215c);
    }

    @bfb
    public static voe newThread() {
        return pfe.onNewThreadScheduler(f65217e);
    }

    public static void shutdown() {
        computation().shutdown();
        m18057io().shutdown();
        newThread().shutdown();
        single().shutdown();
        trampoline().shutdown();
        cpe.shutdown();
    }

    @bfb
    public static voe single() {
        return pfe.onSingleScheduler(f65213a);
    }

    public static void start() {
        computation().start();
        m18057io().start();
        newThread().start();
        single().start();
        trampoline().start();
        cpe.start();
    }

    @bfb
    public static voe trampoline() {
        return f65216d;
    }

    @bfb
    @fg5
    public static voe from(@bfb Executor executor, boolean z) {
        return new v85(executor, z);
    }
}
