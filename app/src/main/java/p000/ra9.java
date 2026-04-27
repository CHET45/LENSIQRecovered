package p000;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes5.dex */
@jd7
@yg8
@qx4
public final class ra9<L> {

    /* JADX INFO: renamed from: b */
    public static final Logger f77584b = Logger.getLogger(ra9.class.getName());

    /* JADX INFO: renamed from: a */
    public final List<RunnableC11966b<L>> f77585a = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: renamed from: ra9$a */
    public interface InterfaceC11965a<L> {
        void call(L listener);
    }

    /* JADX INFO: renamed from: ra9$b */
    public static final class RunnableC11966b<L> implements Runnable {

        /* JADX INFO: renamed from: a */
        public final L f77586a;

        /* JADX INFO: renamed from: b */
        public final Executor f77587b;

        /* JADX INFO: renamed from: c */
        @uc7("this")
        public final Queue<InterfaceC11965a<L>> f77588c = dod.newArrayDeque();

        /* JADX INFO: renamed from: d */
        @uc7("this")
        public final Queue<Object> f77589d = dod.newArrayDeque();

        /* JADX INFO: renamed from: e */
        @uc7("this")
        public boolean f77590e;

        public RunnableC11966b(L l, Executor executor) {
            this.f77586a = (L) v7d.checkNotNull(l);
            this.f77587b = (Executor) v7d.checkNotNull(executor);
        }

        /* JADX INFO: renamed from: a */
        public synchronized void m21105a(InterfaceC11965a<L> event, Object label) {
            this.f77588c.add(event);
            this.f77589d.add(label);
        }

        /* JADX INFO: renamed from: b */
        public void m21106b() {
            boolean z;
            synchronized (this) {
                try {
                    if (this.f77590e) {
                        z = false;
                    } else {
                        z = true;
                        this.f77590e = true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z) {
                try {
                    this.f77587b.execute(this);
                } catch (RuntimeException e) {
                    synchronized (this) {
                        this.f77590e = false;
                        ra9.f77584b.log(Level.SEVERE, "Exception while running callbacks for " + this.f77586a + " on " + this.f77587b, (Throwable) e);
                        throw e;
                    }
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0025, code lost:
        
            r2.call(r9.f77586a);
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x002d, code lost:
        
            r2 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x002e, code lost:
        
            p000.ra9.f77584b.log(java.util.logging.Level.SEVERE, "Exception while executing callback: " + r9.f77586a + com.blankj.utilcode.util.C2473f.f17566z + r3, (java.lang.Throwable) r2);
         */
        /* JADX WARN: Removed duplicated region for block: B:28:0x005e  */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() throws java.lang.Throwable {
            /*
                r9 = this;
            L0:
                r0 = 0
                r1 = 1
                monitor-enter(r9)     // Catch: java.lang.Throwable -> L2b
                boolean r2 = r9.f77590e     // Catch: java.lang.Throwable -> L1f
                p000.v7d.checkState(r2)     // Catch: java.lang.Throwable -> L1f
                java.util.Queue<ra9$a<L>> r2 = r9.f77588c     // Catch: java.lang.Throwable -> L1f
                java.lang.Object r2 = r2.poll()     // Catch: java.lang.Throwable -> L1f
                ra9$a r2 = (p000.ra9.InterfaceC11965a) r2     // Catch: java.lang.Throwable -> L1f
                java.util.Queue<java.lang.Object> r3 = r9.f77589d     // Catch: java.lang.Throwable -> L1f
                java.lang.Object r3 = r3.poll()     // Catch: java.lang.Throwable -> L1f
                if (r2 != 0) goto L24
                r9.f77590e = r0     // Catch: java.lang.Throwable -> L1f
                monitor-exit(r9)     // Catch: java.lang.Throwable -> L1c
                return
            L1c:
                r1 = move-exception
                r2 = r0
                goto L53
            L1f:
                r2 = move-exception
                r8 = r2
                r2 = r1
                r1 = r8
                goto L53
            L24:
                monitor-exit(r9)     // Catch: java.lang.Throwable -> L1f
                L r4 = r9.f77586a     // Catch: java.lang.Throwable -> L2b java.lang.RuntimeException -> L2d
                r2.call(r4)     // Catch: java.lang.Throwable -> L2b java.lang.RuntimeException -> L2d
                goto L0
            L2b:
                r2 = move-exception
                goto L5c
            L2d:
                r2 = move-exception
                java.util.logging.Logger r4 = p000.ra9.m21104a()     // Catch: java.lang.Throwable -> L2b
                java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch: java.lang.Throwable -> L2b
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2b
                r6.<init>()     // Catch: java.lang.Throwable -> L2b
                java.lang.String r7 = "Exception while executing callback: "
                r6.append(r7)     // Catch: java.lang.Throwable -> L2b
                L r7 = r9.f77586a     // Catch: java.lang.Throwable -> L2b
                r6.append(r7)     // Catch: java.lang.Throwable -> L2b
                java.lang.String r7 = " "
                r6.append(r7)     // Catch: java.lang.Throwable -> L2b
                r6.append(r3)     // Catch: java.lang.Throwable -> L2b
                java.lang.String r3 = r6.toString()     // Catch: java.lang.Throwable -> L2b
                r4.log(r5, r3, r2)     // Catch: java.lang.Throwable -> L2b
                goto L0
            L53:
                monitor-exit(r9)     // Catch: java.lang.Throwable -> L5a
                throw r1     // Catch: java.lang.Throwable -> L55
            L55:
                r1 = move-exception
                r8 = r2
                r2 = r1
                r1 = r8
                goto L5c
            L5a:
                r1 = move-exception
                goto L53
            L5c:
                if (r1 == 0) goto L66
                monitor-enter(r9)
                r9.f77590e = r0     // Catch: java.lang.Throwable -> L63
                monitor-exit(r9)     // Catch: java.lang.Throwable -> L63
                goto L66
            L63:
                r0 = move-exception
                monitor-exit(r9)     // Catch: java.lang.Throwable -> L63
                throw r0
            L66:
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.ra9.RunnableC11966b.run():void");
        }
    }

    private void enqueueHelper(InterfaceC11965a<L> event, Object label) {
        v7d.checkNotNull(event, "event");
        v7d.checkNotNull(label, "label");
        synchronized (this.f77585a) {
            try {
                Iterator<RunnableC11966b<L>> it = this.f77585a.iterator();
                while (it.hasNext()) {
                    it.next().m21105a(event, label);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void addListener(L listener, Executor executor) {
        v7d.checkNotNull(listener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        v7d.checkNotNull(executor, "executor");
        this.f77585a.add(new RunnableC11966b<>(listener, executor));
    }

    public void dispatch() {
        for (int i = 0; i < this.f77585a.size(); i++) {
            this.f77585a.get(i).m21106b();
        }
    }

    public void enqueue(InterfaceC11965a<L> event) {
        enqueueHelper(event, event);
    }

    public void enqueue(InterfaceC11965a<L> event, String label) {
        enqueueHelper(event, label);
    }
}
