package p000;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes7.dex */
public final class sr9 extends ps6 {

    /* JADX INFO: renamed from: c */
    public static final ReferenceQueue<sr9> f82686c = new ReferenceQueue<>();

    /* JADX INFO: renamed from: d */
    public static final ConcurrentMap<C12758a, C12758a> f82687d = new ConcurrentHashMap();

    /* JADX INFO: renamed from: e */
    public static final Logger f82688e = Logger.getLogger(sr9.class.getName());

    /* JADX INFO: renamed from: b */
    public final C12758a f82689b;

    /* JADX INFO: renamed from: sr9$a */
    @gdi
    public static final class C12758a extends WeakReference<sr9> {

        /* JADX INFO: renamed from: f */
        public static final String f82690f = "io.grpc.ManagedChannel.enableAllocationTracking";

        /* JADX INFO: renamed from: g */
        public static final boolean f82691g = Boolean.parseBoolean(System.getProperty(f82690f, "true"));

        /* JADX INFO: renamed from: h */
        public static final RuntimeException f82692h = missingCallSite();

        /* JADX INFO: renamed from: a */
        public final ReferenceQueue<sr9> f82693a;

        /* JADX INFO: renamed from: b */
        public final ConcurrentMap<C12758a, C12758a> f82694b;

        /* JADX INFO: renamed from: c */
        public final String f82695c;

        /* JADX INFO: renamed from: d */
        public final Reference<RuntimeException> f82696d;

        /* JADX INFO: renamed from: e */
        public final AtomicBoolean f82697e;

        public C12758a(sr9 sr9Var, or9 or9Var, ReferenceQueue<sr9> referenceQueue, ConcurrentMap<C12758a, C12758a> concurrentMap) {
            super(sr9Var, referenceQueue);
            this.f82697e = new AtomicBoolean();
            this.f82696d = new SoftReference(f82691g ? new RuntimeException("ManagedChannel allocation site") : f82692h);
            this.f82695c = or9Var.toString();
            this.f82693a = referenceQueue;
            this.f82694b = concurrentMap;
            concurrentMap.put(this, this);
            m22199b(referenceQueue);
        }

        @gdi
        /* JADX INFO: renamed from: b */
        public static int m22199b(ReferenceQueue<sr9> referenceQueue) {
            int i = 0;
            while (true) {
                C12758a c12758a = (C12758a) referenceQueue.poll();
                if (c12758a == null) {
                    return i;
                }
                RuntimeException runtimeException = c12758a.f82696d.get();
                c12758a.clearInternal();
                if (!c12758a.f82697e.get()) {
                    i++;
                    Level level = Level.SEVERE;
                    if (sr9.f82688e.isLoggable(level)) {
                        LogRecord logRecord = new LogRecord(level, "*~*~*~ Previous channel {0} was garbage collected without being shut down! ~*~*~*" + System.getProperty("line.separator") + "    Make sure to call shutdown()/shutdownNow()");
                        logRecord.setLoggerName(sr9.f82688e.getName());
                        logRecord.setParameters(new Object[]{c12758a.f82695c});
                        logRecord.setThrown(runtimeException);
                        sr9.f82688e.log(logRecord);
                    }
                }
            }
        }

        private void clearInternal() {
            super.clear();
            this.f82694b.remove(this);
            this.f82696d.clear();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSafely() {
            if (this.f82697e.getAndSet(true)) {
                return;
            }
            clear();
        }

        private static RuntimeException missingCallSite() {
            RuntimeException runtimeException = new RuntimeException("ManagedChannel allocation site not recorded.  Set -Dio.grpc.ManagedChannel.enableAllocationTracking=true to enable it");
            runtimeException.setStackTrace(new StackTraceElement[0]);
            return runtimeException;
        }

        @Override // java.lang.ref.Reference
        public void clear() {
            clearInternal();
            m22199b(this.f82693a);
        }
    }

    public sr9(or9 or9Var) {
        this(or9Var, f82686c, f82687d);
    }

    @Override // p000.ps6, p000.or9
    public or9 shutdown() {
        this.f82689b.clearSafely();
        return super.shutdown();
    }

    @Override // p000.ps6, p000.or9
    public or9 shutdownNow() {
        this.f82689b.clearSafely();
        return super.shutdownNow();
    }

    @gdi
    public sr9(or9 or9Var, ReferenceQueue<sr9> referenceQueue, ConcurrentMap<C12758a, C12758a> concurrentMap) {
        super(or9Var);
        this.f82689b = new C12758a(this, or9Var, referenceQueue, concurrentMap);
    }
}
