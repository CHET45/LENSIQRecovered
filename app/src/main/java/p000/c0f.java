package p000;

import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes5.dex */
public final class c0f implements Executor {

    /* JADX INFO: renamed from: f */
    public static final Logger f15436f = Logger.getLogger(c0f.class.getName());

    /* JADX INFO: renamed from: a */
    public final Executor f15437a;

    /* JADX INFO: renamed from: b */
    @xc7("queue")
    public final Deque<Runnable> f15438b = new ArrayDeque();

    /* JADX INFO: renamed from: c */
    @xc7("queue")
    public EnumC2141c f15439c = EnumC2141c.IDLE;

    /* JADX INFO: renamed from: d */
    @xc7("queue")
    public long f15440d = 0;

    /* JADX INFO: renamed from: e */
    public final RunnableC2140b f15441e = new RunnableC2140b(this, null);

    /* JADX INFO: renamed from: c0f$a */
    public class RunnableC2139a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Runnable f15442a;

        public RunnableC2139a(Runnable runnable) {
            this.f15442a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f15442a.run();
        }

        public String toString() {
            return this.f15442a.toString();
        }
    }

    /* JADX INFO: renamed from: c0f$b */
    public final class RunnableC2140b implements Runnable {

        /* JADX INFO: renamed from: a */
        @wx1
        public Runnable f15444a;

        private RunnableC2140b() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x004e, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0054, code lost:
        
            r1 = r1 | java.lang.Thread.interrupted();
            r2 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0056, code lost:
        
            r8.f15444a.run();
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0060, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0062, code lost:
        
            r3 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0063, code lost:
        
            p000.c0f.f15436f.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + r8.f15444a, (java.lang.Throwable) r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0080, code lost:
        
            r8.f15444a = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x0082, code lost:
        
            throw r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:?, code lost:
        
            return;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private void workOnQueue() {
            /*
                r8 = this;
                r0 = 0
                r1 = r0
            L2:
                c0f r2 = p000.c0f.this     // Catch: java.lang.Throwable -> L5e
                java.util.Deque r2 = p000.c0f.m3576a(r2)     // Catch: java.lang.Throwable -> L5e
                monitor-enter(r2)     // Catch: java.lang.Throwable -> L5e
                if (r0 != 0) goto L2d
                c0f r0 = p000.c0f.this     // Catch: java.lang.Throwable -> L20
                c0f$c r0 = p000.c0f.m3577b(r0)     // Catch: java.lang.Throwable -> L20
                c0f$c r3 = p000.c0f.EnumC2141c.RUNNING     // Catch: java.lang.Throwable -> L20
                if (r0 != r3) goto L22
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
                if (r1 == 0) goto L1f
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
            L1f:
                return
            L20:
                r0 = move-exception
                goto L83
            L22:
                c0f r0 = p000.c0f.this     // Catch: java.lang.Throwable -> L20
                p000.c0f.m3579d(r0)     // Catch: java.lang.Throwable -> L20
                c0f r0 = p000.c0f.this     // Catch: java.lang.Throwable -> L20
                p000.c0f.m3578c(r0, r3)     // Catch: java.lang.Throwable -> L20
                r0 = 1
            L2d:
                c0f r3 = p000.c0f.this     // Catch: java.lang.Throwable -> L20
                java.util.Deque r3 = p000.c0f.m3576a(r3)     // Catch: java.lang.Throwable -> L20
                java.lang.Object r3 = r3.poll()     // Catch: java.lang.Throwable -> L20
                java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch: java.lang.Throwable -> L20
                r8.f15444a = r3     // Catch: java.lang.Throwable -> L20
                if (r3 != 0) goto L4f
                c0f r0 = p000.c0f.this     // Catch: java.lang.Throwable -> L20
                c0f$c r3 = p000.c0f.EnumC2141c.IDLE     // Catch: java.lang.Throwable -> L20
                p000.c0f.m3578c(r0, r3)     // Catch: java.lang.Throwable -> L20
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
                if (r1 == 0) goto L4e
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
            L4e:
                return
            L4f:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
                boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L5e
                r1 = r1 | r2
                r2 = 0
                java.lang.Runnable r3 = r8.f15444a     // Catch: java.lang.Throwable -> L60 java.lang.RuntimeException -> L62
                r3.run()     // Catch: java.lang.Throwable -> L60 java.lang.RuntimeException -> L62
            L5b:
                r8.f15444a = r2     // Catch: java.lang.Throwable -> L5e
                goto L2
            L5e:
                r0 = move-exception
                goto L85
            L60:
                r0 = move-exception
                goto L80
            L62:
                r3 = move-exception
                java.util.logging.Logger r4 = p000.c0f.m3580e()     // Catch: java.lang.Throwable -> L60
                java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch: java.lang.Throwable -> L60
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L60
                r6.<init>()     // Catch: java.lang.Throwable -> L60
                java.lang.String r7 = "Exception while executing runnable "
                r6.append(r7)     // Catch: java.lang.Throwable -> L60
                java.lang.Runnable r7 = r8.f15444a     // Catch: java.lang.Throwable -> L60
                r6.append(r7)     // Catch: java.lang.Throwable -> L60
                java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L60
                r4.log(r5, r6, r3)     // Catch: java.lang.Throwable -> L60
                goto L5b
            L80:
                r8.f15444a = r2     // Catch: java.lang.Throwable -> L5e
                throw r0     // Catch: java.lang.Throwable -> L5e
            L83:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
                throw r0     // Catch: java.lang.Throwable -> L5e
            L85:
                if (r1 == 0) goto L8e
                java.lang.Thread r1 = java.lang.Thread.currentThread()
                r1.interrupt()
            L8e:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.c0f.RunnableC2140b.workOnQueue():void");
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                workOnQueue();
            } catch (Error e) {
                synchronized (c0f.this.f15438b) {
                    c0f.this.f15439c = EnumC2141c.IDLE;
                    throw e;
                }
            }
        }

        public String toString() {
            Runnable runnable = this.f15444a;
            if (runnable != null) {
                return "SequentialExecutorWorker{running=" + runnable + "}";
            }
            return "SequentialExecutorWorker{state=" + c0f.this.f15439c + "}";
        }

        public /* synthetic */ RunnableC2140b(c0f c0fVar, RunnableC2139a runnableC2139a) {
            this();
        }
    }

    /* JADX INFO: renamed from: c0f$c */
    public enum EnumC2141c {
        IDLE,
        QUEUING,
        QUEUED,
        RUNNING
    }

    public c0f(Executor executor) {
        this.f15437a = (Executor) Preconditions.checkNotNull(executor);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ long m3579d(c0f c0fVar) {
        long j = c0fVar.f15440d;
        c0fVar.f15440d = 1 + j;
        return j;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0061  */
    @Override // java.util.concurrent.Executor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void execute(java.lang.Runnable r8) {
        /*
            r7 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r8)
            java.util.Deque<java.lang.Runnable> r0 = r7.f15438b
            monitor-enter(r0)
            c0f$c r1 = r7.f15439c     // Catch: java.lang.Throwable -> L6d
            c0f$c r2 = p000.c0f.EnumC2141c.RUNNING     // Catch: java.lang.Throwable -> L6d
            if (r1 == r2) goto L6f
            c0f$c r2 = p000.c0f.EnumC2141c.QUEUED     // Catch: java.lang.Throwable -> L6d
            if (r1 != r2) goto L11
            goto L6f
        L11:
            long r3 = r7.f15440d     // Catch: java.lang.Throwable -> L6d
            c0f$a r1 = new c0f$a     // Catch: java.lang.Throwable -> L6d
            r1.<init>(r8)     // Catch: java.lang.Throwable -> L6d
            java.util.Deque<java.lang.Runnable> r8 = r7.f15438b     // Catch: java.lang.Throwable -> L6d
            r8.add(r1)     // Catch: java.lang.Throwable -> L6d
            c0f$c r8 = p000.c0f.EnumC2141c.QUEUING     // Catch: java.lang.Throwable -> L6d
            r7.f15439c = r8     // Catch: java.lang.Throwable -> L6d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6d
            java.util.concurrent.Executor r0 = r7.f15437a     // Catch: java.lang.Error -> L44 java.lang.RuntimeException -> L46
            c0f$b r5 = r7.f15441e     // Catch: java.lang.Error -> L44 java.lang.RuntimeException -> L46
            r0.execute(r5)     // Catch: java.lang.Error -> L44 java.lang.RuntimeException -> L46
            c0f$c r0 = r7.f15439c
            if (r0 == r8) goto L2e
            return
        L2e:
            java.util.Deque<java.lang.Runnable> r0 = r7.f15438b
            monitor-enter(r0)
            long r5 = r7.f15440d     // Catch: java.lang.Throwable -> L3e
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 != 0) goto L40
            c0f$c r1 = r7.f15439c     // Catch: java.lang.Throwable -> L3e
            if (r1 != r8) goto L40
            r7.f15439c = r2     // Catch: java.lang.Throwable -> L3e
            goto L40
        L3e:
            r8 = move-exception
            goto L42
        L40:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3e
            return
        L42:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3e
            throw r8
        L44:
            r8 = move-exception
            goto L47
        L46:
            r8 = move-exception
        L47:
            java.util.Deque<java.lang.Runnable> r2 = r7.f15438b
            monitor-enter(r2)
            c0f$c r0 = r7.f15439c     // Catch: java.lang.Throwable -> L55
            c0f$c r3 = p000.c0f.EnumC2141c.IDLE     // Catch: java.lang.Throwable -> L55
            if (r0 == r3) goto L57
            c0f$c r3 = p000.c0f.EnumC2141c.QUEUING     // Catch: java.lang.Throwable -> L55
            if (r0 != r3) goto L61
            goto L57
        L55:
            r8 = move-exception
            goto L6b
        L57:
            java.util.Deque<java.lang.Runnable> r0 = r7.f15438b     // Catch: java.lang.Throwable -> L55
            boolean r0 = r0.removeLastOccurrence(r1)     // Catch: java.lang.Throwable -> L55
            if (r0 == 0) goto L61
            r0 = 1
            goto L62
        L61:
            r0 = 0
        L62:
            boolean r1 = r8 instanceof java.util.concurrent.RejectedExecutionException     // Catch: java.lang.Throwable -> L55
            if (r1 == 0) goto L6a
            if (r0 != 0) goto L6a
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L55
            return
        L6a:
            throw r8     // Catch: java.lang.Throwable -> L55
        L6b:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L55
            throw r8
        L6d:
            r8 = move-exception
            goto L76
        L6f:
            java.util.Deque<java.lang.Runnable> r1 = r7.f15438b     // Catch: java.lang.Throwable -> L6d
            r1.add(r8)     // Catch: java.lang.Throwable -> L6d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6d
            return
        L76:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6d
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.c0f.execute(java.lang.Runnable):void");
    }

    public String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.f15437a + "}";
    }
}
