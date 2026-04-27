package p000;

import java.util.concurrent.Executor;
import java.util.concurrent.Semaphore;

/* JADX INFO: loaded from: classes5.dex */
@dwf({"SMAP\nBackgroundQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BackgroundQueue.kt\ncom/google/firebase/firestore/util/BackgroundQueue\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,87:1\n1#2:88\n*E\n"})
public final class fo0 {

    /* JADX INFO: renamed from: b */
    @yfb
    public static final C5898a f37206b = new C5898a(null);

    /* JADX INFO: renamed from: c */
    public static final int f37207c;

    /* JADX INFO: renamed from: d */
    @yfb
    public static final Executor f37208d;

    /* JADX INFO: renamed from: a */
    @yfb
    public InterfaceC5899b f37209a = new InterfaceC5899b.b();

    /* JADX INFO: renamed from: fo0$a */
    public static final class C5898a {
        public /* synthetic */ C5898a(jt3 jt3Var) {
            this();
        }

        public final int getMaxParallelism() {
            return fo0.f37207c;
        }

        private C5898a() {
        }
    }

    /* JADX INFO: renamed from: fo0$b */
    public interface InterfaceC5899b {

        /* JADX INFO: renamed from: fo0$b$a */
        public static final class a implements InterfaceC5899b {

            /* JADX INFO: renamed from: a */
            @yfb
            public static final a f37210a = new a();

            private a() {
            }
        }

        /* JADX INFO: renamed from: fo0$b$b */
        public static final class b implements InterfaceC5899b {

            /* JADX INFO: renamed from: a */
            @yfb
            public final Semaphore f37211a = new Semaphore(0);

            /* JADX INFO: renamed from: b */
            public int f37212b;

            @yfb
            public final Semaphore getCompletedTasks() {
                return this.f37211a;
            }

            public final int getTaskCount() {
                return this.f37212b;
            }

            public final void setTaskCount(int i) {
                this.f37212b = i;
            }
        }
    }

    static {
        int iCoerceAtLeast = kpd.coerceAtLeast(Runtime.getRuntime().availableProcessors(), 2);
        f37207c = iCoerceAtLeast;
        f37208d = a95.asExecutor(df4.getIO().limitedParallelism(iCoerceAtLeast, "firestore.BackgroundQueue"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void submit$lambda$1(Runnable runnable, InterfaceC5899b interfaceC5899b) {
        try {
            runnable.run();
        } finally {
            ((InterfaceC5899b.b) interfaceC5899b).getCompletedTasks().release();
        }
    }

    public final void drain() {
        InterfaceC5899b interfaceC5899b = this.f37209a;
        if (!(interfaceC5899b instanceof InterfaceC5899b.b)) {
            throw new IllegalStateException("drain() may not be called more than once");
        }
        this.f37209a = InterfaceC5899b.a.f37210a;
        InterfaceC5899b.b bVar = (InterfaceC5899b.b) interfaceC5899b;
        bVar.getCompletedTasks().acquire(bVar.getTaskCount());
    }

    public final void submit(@yfb final Runnable runnable) {
        md8.checkNotNullParameter(runnable, "runnable");
        final InterfaceC5899b interfaceC5899b = this.f37209a;
        if (!(interfaceC5899b instanceof InterfaceC5899b.b)) {
            throw new IllegalStateException("submit() may not be called after drain()");
        }
        InterfaceC5899b.b bVar = (InterfaceC5899b.b) interfaceC5899b;
        bVar.setTaskCount(bVar.getTaskCount() + 1);
        f37208d.execute(new Runnable() { // from class: eo0
            @Override // java.lang.Runnable
            public final void run() {
                fo0.submit$lambda$1(runnable, interfaceC5899b);
            }
        });
    }
}
