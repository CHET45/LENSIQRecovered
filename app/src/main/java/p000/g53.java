package p000;

import android.os.Looper;
import java.util.concurrent.ExecutorService;
import p000.g53;

/* JADX INFO: loaded from: classes5.dex */
public final class g53 {

    /* JADX INFO: renamed from: e */
    @yfb
    public static final C6132a f38787e = new C6132a(null);

    /* JADX INFO: renamed from: f */
    public static boolean f38788f;

    /* JADX INFO: renamed from: a */
    @un8
    @yfb
    public final c53 f38789a;

    /* JADX INFO: renamed from: b */
    @un8
    @yfb
    public final c53 f38790b;

    /* JADX INFO: renamed from: c */
    @un8
    @yfb
    public final c53 f38791c;

    /* JADX INFO: renamed from: d */
    @un8
    @yfb
    public final c53 f38792d;

    /* JADX INFO: renamed from: g53$a */
    public static final class C6132a {

        /* JADX INFO: renamed from: g53$a$a */
        public /* synthetic */ class a extends n07 implements ny6<Boolean> {
            public a(Object obj) {
                super(0, obj, C6132a.class, "isBackgroundThread", "isBackgroundThread()Z", 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p000.ny6
            public final Boolean invoke() {
                return Boolean.valueOf(((C6132a) this.receiver).isBackgroundThread());
            }
        }

        /* JADX INFO: renamed from: g53$a$b */
        public /* synthetic */ class b extends n07 implements ny6<Boolean> {
            public b(Object obj) {
                super(0, obj, C6132a.class, "isBlockingThread", "isBlockingThread()Z", 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p000.ny6
            public final Boolean invoke() {
                return Boolean.valueOf(((C6132a) this.receiver).isBlockingThread());
            }
        }

        /* JADX INFO: renamed from: g53$a$c */
        public /* synthetic */ class c extends n07 implements ny6<Boolean> {
            public c(Object obj) {
                super(0, obj, C6132a.class, "isNotMainThread", "isNotMainThread()Z", 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p000.ny6
            public final Boolean invoke() {
                return Boolean.valueOf(((C6132a) this.receiver).isNotMainThread());
            }
        }

        public /* synthetic */ C6132a(jt3 jt3Var) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String checkBackgroundThread$lambda$2() {
            return "Must be called on a background thread, was called on " + g53.f38787e.getThreadName() + a18.f100c;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String checkBlockingThread$lambda$1() {
            return "Must be called on a blocking thread, was called on " + g53.f38787e.getThreadName() + a18.f100c;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String checkNotMainThread$lambda$0() {
            return "Must not be called on a main thread, was called on " + g53.f38787e.getThreadName() + a18.f100c;
        }

        private final void checkThread(ny6<Boolean> ny6Var, ny6<String> ny6Var2) {
            if (ny6Var.invoke().booleanValue()) {
                return;
            }
            ej9.getLogger().m10061d(ny6Var2.invoke());
            getEnforcement();
        }

        @do8
        public static /* synthetic */ void getEnforcement$annotations() {
        }

        private final String getThreadName() {
            return Thread.currentThread().getName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isBackgroundThread() {
            String threadName = getThreadName();
            md8.checkNotNullExpressionValue(threadName, "<get-threadName>(...)");
            return m9g.contains$default((CharSequence) threadName, (CharSequence) "Firebase Background Thread #", false, 2, (Object) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isBlockingThread() {
            String threadName = getThreadName();
            md8.checkNotNullExpressionValue(threadName, "<get-threadName>(...)");
            return m9g.contains$default((CharSequence) threadName, (CharSequence) "Firebase Blocking Thread #", false, 2, (Object) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isNotMainThread() {
            return !Looper.getMainLooper().isCurrentThread();
        }

        @do8
        public final void checkBackgroundThread() {
            checkThread(new a(this), new ny6() { // from class: d53
                @Override // p000.ny6
                public final Object invoke() {
                    return g53.C6132a.checkBackgroundThread$lambda$2();
                }
            });
        }

        @do8
        public final void checkBlockingThread() {
            checkThread(new b(this), new ny6() { // from class: f53
                @Override // p000.ny6
                public final Object invoke() {
                    return g53.C6132a.checkBlockingThread$lambda$1();
                }
            });
        }

        @do8
        public final void checkNotMainThread() {
            checkThread(new c(this), new ny6() { // from class: e53
                @Override // p000.ny6
                public final Object invoke() {
                    return g53.C6132a.checkNotMainThread$lambda$0();
                }
            });
        }

        public final boolean getEnforcement() {
            return g53.f38788f;
        }

        public final void setEnforcement(boolean z) {
            g53.f38788f = z;
        }

        private C6132a() {
        }
    }

    public g53(@yfb ExecutorService executorService, @yfb ExecutorService executorService2) {
        md8.checkNotNullParameter(executorService, "backgroundExecutorService");
        md8.checkNotNullParameter(executorService2, "blockingExecutorService");
        this.f38789a = new c53(executorService);
        this.f38790b = new c53(executorService);
        this.f38791c = new c53(executorService);
        this.f38792d = new c53(executorService2);
    }

    @do8
    public static final void checkBackgroundThread() {
        f38787e.checkBackgroundThread();
    }

    @do8
    public static final void checkBlockingThread() {
        f38787e.checkBlockingThread();
    }

    @do8
    public static final void checkNotMainThread() {
        f38787e.checkNotMainThread();
    }

    public static final boolean getEnforcement() {
        return f38787e.getEnforcement();
    }

    public static final void setEnforcement(boolean z) {
        f38787e.setEnforcement(z);
    }
}
