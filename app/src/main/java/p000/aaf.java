package p000;

import java.util.IdentityHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
@kyg
public final class aaf {

    /* JADX INFO: renamed from: d */
    public static final long f840d = 1;

    /* JADX INFO: renamed from: e */
    public static final aaf f841e = new aaf(new C0121a());

    /* JADX INFO: renamed from: a */
    public final IdentityHashMap<InterfaceC0124d<?>, C0123c> f842a = new IdentityHashMap<>();

    /* JADX INFO: renamed from: b */
    public final InterfaceC0125e f843b;

    /* JADX INFO: renamed from: c */
    public ScheduledExecutorService f844c;

    /* JADX INFO: renamed from: aaf$a */
    public class C0121a implements InterfaceC0125e {
        @Override // p000.aaf.InterfaceC0125e
        public ScheduledExecutorService createScheduledExecutor() {
            return Executors.newSingleThreadScheduledExecutor(oc7.getThreadFactory("grpc-shared-destroyer-%d", true));
        }
    }

    /* JADX INFO: renamed from: aaf$b */
    public class RunnableC0122b implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C0123c f845a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC0124d f846b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Object f847c;

        public RunnableC0122b(C0123c c0123c, InterfaceC0124d interfaceC0124d, Object obj) {
            this.f845a = c0123c;
            this.f846b = interfaceC0124d;
            this.f847c = obj;
        }

        /* JADX WARN: Finally extract failed */
        @Override // java.lang.Runnable
        public void run() {
            synchronized (aaf.this) {
                try {
                    if (this.f845a.f850b == 0) {
                        try {
                            this.f846b.close(this.f847c);
                            aaf.this.f842a.remove(this.f846b);
                            if (aaf.this.f842a.isEmpty()) {
                                aaf.this.f844c.shutdown();
                                aaf.this.f844c = null;
                            }
                        } catch (Throwable th) {
                            aaf.this.f842a.remove(this.f846b);
                            if (aaf.this.f842a.isEmpty()) {
                                aaf.this.f844c.shutdown();
                                aaf.this.f844c = null;
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: renamed from: aaf$c */
    public static class C0123c {

        /* JADX INFO: renamed from: a */
        public final Object f849a;

        /* JADX INFO: renamed from: b */
        public int f850b;

        /* JADX INFO: renamed from: c */
        public ScheduledFuture<?> f851c;

        public C0123c(Object obj) {
            this.f849a = obj;
        }
    }

    /* JADX INFO: renamed from: aaf$d */
    public interface InterfaceC0124d<T> {
        void close(T t);

        T create();
    }

    /* JADX INFO: renamed from: aaf$e */
    public interface InterfaceC0125e {
        ScheduledExecutorService createScheduledExecutor();
    }

    public aaf(InterfaceC0125e interfaceC0125e) {
        this.f843b = interfaceC0125e;
    }

    public static <T> T get(InterfaceC0124d<T> interfaceC0124d) {
        return (T) f841e.m264d(interfaceC0124d);
    }

    public static <T> T release(InterfaceC0124d<T> interfaceC0124d, T t) {
        return (T) f841e.m265e(interfaceC0124d, t);
    }

    /* JADX INFO: renamed from: d */
    public synchronized <T> T m264d(InterfaceC0124d<T> interfaceC0124d) {
        C0123c c0123c;
        try {
            c0123c = this.f842a.get(interfaceC0124d);
            if (c0123c == null) {
                c0123c = new C0123c(interfaceC0124d.create());
                this.f842a.put(interfaceC0124d, c0123c);
            }
            ScheduledFuture<?> scheduledFuture = c0123c.f851c;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
                c0123c.f851c = null;
            }
            c0123c.f850b++;
        } catch (Throwable th) {
            throw th;
        }
        return (T) c0123c.f849a;
    }

    /* JADX INFO: renamed from: e */
    public synchronized <T> T m265e(InterfaceC0124d<T> interfaceC0124d, T t) {
        try {
            C0123c c0123c = this.f842a.get(interfaceC0124d);
            if (c0123c == null) {
                throw new IllegalArgumentException("No cached instance found for " + interfaceC0124d);
            }
            v7d.checkArgument(t == c0123c.f849a, "Releasing the wrong instance");
            v7d.checkState(c0123c.f850b > 0, "Refcount has already reached zero");
            int i = c0123c.f850b - 1;
            c0123c.f850b = i;
            if (i == 0) {
                v7d.checkState(c0123c.f851c == null, "Destroy task already scheduled");
                if (this.f844c == null) {
                    this.f844c = this.f843b.createScheduledExecutor();
                }
                c0123c.f851c = this.f844c.schedule(new fi9(new RunnableC0122b(c0123c, interfaceC0124d, t)), 1L, TimeUnit.SECONDS);
            }
        } catch (Throwable th) {
            throw th;
        }
        return null;
    }
}
