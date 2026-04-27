package p000;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.io.Closeable;
import java.util.ArrayDeque;
import java.util.Queue;
import p000.gsa;
import p000.n40;
import p000.y5g;

/* JADX INFO: loaded from: classes7.dex */
public final class nva implements cyg {

    /* JADX INFO: renamed from: C */
    @vc7("lock")
    public boolean f65790C;

    /* JADX INFO: renamed from: H */
    @vc7("lock")
    public boolean f65792H;

    /* JADX INFO: renamed from: a */
    public final gsa.InterfaceC6484b f65793a;

    /* JADX INFO: renamed from: b */
    public final n40 f65794b;

    /* JADX INFO: renamed from: c */
    public final C10081h f65795c;

    /* JADX INFO: renamed from: d */
    public final n40.InterfaceC9690d f65796d;

    /* JADX INFO: renamed from: e */
    public final gsa f65797e;

    /* JADX INFO: renamed from: f */
    public final C10080g f65798f = new C10080g();

    /* JADX INFO: renamed from: m */
    public final Object f65799m = new Object();

    /* JADX INFO: renamed from: F */
    @vc7("lock")
    public final Queue<InterfaceC10082i> f65791F = new ArrayDeque();

    /* JADX INFO: renamed from: nva$a */
    public class RunnableC10074a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ a79 f65800a;

        public RunnableC10074a(a79 a79Var) {
            this.f65800a = a79Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            nng nngVarTraceTask = tnc.traceTask("MigratingThreadDeframer.messageAvailable");
            try {
                tnc.linkIn(this.f65800a);
                nva.this.f65793a.messagesAvailable(nva.this.f65798f);
                if (nngVarTraceTask != null) {
                    nngVarTraceTask.close();
                }
            } catch (Throwable th) {
                if (nngVarTraceTask != null) {
                    try {
                        nngVarTraceTask.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: nva$b */
    public class C10075b implements InterfaceC10082i {
        public C10075b() {
        }

        @Override // p000.nva.InterfaceC10082i
        public void run(boolean z) {
            nva.this.f65797e.close();
        }
    }

    /* JADX INFO: renamed from: nva$c */
    public class C10076c implements InterfaceC10082i {
        public C10076c() {
        }

        @Override // p000.nva.InterfaceC10082i
        public void run(boolean z) {
            nva.this.f65797e.closeWhenComplete();
        }
    }

    /* JADX INFO: renamed from: nva$d */
    public class C10077d implements InterfaceC10082i, Closeable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ frd f65804a;

        public C10077d(frd frdVar) {
            this.f65804a = frdVar;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f65804a.close();
        }

        @Override // p000.nva.InterfaceC10082i
        public void run(boolean z) {
            nng nngVarTraceTask = tnc.traceTask("MigratingThreadDeframer.deframe");
            try {
                if (z) {
                    nva.this.f65797e.deframe(this.f65804a);
                    if (nngVarTraceTask != null) {
                        nngVarTraceTask.close();
                        return;
                    }
                    return;
                }
                try {
                    nva.this.f65797e.deframe(this.f65804a);
                } catch (Throwable th) {
                    nva.this.f65794b.deframeFailed(th);
                    nva.this.f65797e.close();
                }
                if (nngVarTraceTask != null) {
                    nngVarTraceTask.close();
                }
            } catch (Throwable th2) {
                if (nngVarTraceTask != null) {
                    try {
                        nngVarTraceTask.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: nva$e */
    public class C10078e implements InterfaceC10082i {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f65806a;

        public C10078e(int i) {
            this.f65806a = i;
        }

        @Override // p000.nva.InterfaceC10082i
        public void run(boolean z) {
            if (!z) {
                nva.this.request(this.f65806a);
                return;
            }
            try {
                nva.this.f65797e.request(this.f65806a);
            } catch (Throwable th) {
                nva.this.f65794b.deframeFailed(th);
                nva.this.f65797e.close();
            }
            if (nva.this.f65797e.m11834a()) {
                return;
            }
            synchronized (nva.this.f65799m) {
                tnc.event("MigratingThreadDeframer.deframerOnApplicationThread");
                nva.this.f65795c.setDelegate(nva.this.f65794b);
                nva.this.f65790C = false;
            }
        }
    }

    /* JADX INFO: renamed from: nva$f */
    public class C10079f implements InterfaceC10082i {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f65808a;

        /* JADX INFO: renamed from: nva$f$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ a79 f65810a;

            public a(a79 a79Var) {
                this.f65810a = a79Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                nng nngVarTraceTask = tnc.traceTask("MigratingThreadDeframer.request");
                try {
                    tnc.linkIn(this.f65810a);
                    C10079f c10079f = C10079f.this;
                    nva.this.requestFromTransportThread(c10079f.f65808a);
                    if (nngVarTraceTask != null) {
                        nngVarTraceTask.close();
                    }
                } catch (Throwable th) {
                    if (nngVarTraceTask != null) {
                        try {
                            nngVarTraceTask.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            }
        }

        public C10079f(int i) {
            this.f65808a = i;
        }

        @Override // p000.nva.InterfaceC10082i
        public void run(boolean z) {
            if (z) {
                nva.this.f65796d.runOnTransportThread(new a(tnc.linkOut()));
                return;
            }
            try {
                nng nngVarTraceTask = tnc.traceTask("MigratingThreadDeframer.request");
                try {
                    nva.this.f65797e.request(this.f65808a);
                    if (nngVarTraceTask != null) {
                        nngVarTraceTask.close();
                    }
                } finally {
                }
            } catch (Throwable th) {
                nva.this.f65794b.deframeFailed(th);
                nva.this.f65797e.close();
            }
        }
    }

    /* JADX INFO: renamed from: nva$g */
    public class C10080g implements y5g.InterfaceC15496a, Closeable {
        public C10080g() {
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            InterfaceC10082i interfaceC10082i;
            while (true) {
                synchronized (nva.this.f65799m) {
                    do {
                        try {
                            interfaceC10082i = (InterfaceC10082i) nva.this.f65791F.poll();
                            if (interfaceC10082i == null) {
                                break;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    } while (!(interfaceC10082i instanceof Closeable));
                    if (interfaceC10082i == null) {
                        nva.this.f65792H = false;
                        return;
                    }
                }
                oc7.closeQuietly((Closeable) interfaceC10082i);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x002d, code lost:
        
            if (r4.f65812a.f65797e.m11834a() == false) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x002f, code lost:
        
            p000.tnc.event("MigratingThreadDeframer.deframerOnTransportThread");
            r4.f65812a.f65795c.setDelegate(r4.f65812a.f65793a);
            r4.f65812a.f65790C = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x004c, code lost:
        
            r4.f65812a.f65792H = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0052, code lost:
        
            return null;
         */
        @Override // p000.y5g.InterfaceC15496a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.io.InputStream next() {
            /*
                r4 = this;
            L0:
                nva r0 = p000.nva.this
                n40 r0 = p000.nva.m18157g(r0)
                java.io.InputStream r0 = r0.messageReadQueuePoll()
                if (r0 == 0) goto Ld
                return r0
            Ld:
                nva r0 = p000.nva.this
                java.lang.Object r0 = p000.nva.m18158h(r0)
                monitor-enter(r0)
                nva r1 = p000.nva.this     // Catch: java.lang.Throwable -> L4a
                java.util.Queue r1 = p000.nva.m18161k(r1)     // Catch: java.lang.Throwable -> L4a
                java.lang.Object r1 = r1.poll()     // Catch: java.lang.Throwable -> L4a
                nva$i r1 = (p000.nva.InterfaceC10082i) r1     // Catch: java.lang.Throwable -> L4a
                r2 = 0
                if (r1 != 0) goto L54
                nva r1 = p000.nva.this     // Catch: java.lang.Throwable -> L4a
                gsa r1 = p000.nva.m18156f(r1)     // Catch: java.lang.Throwable -> L4a
                boolean r1 = r1.m11834a()     // Catch: java.lang.Throwable -> L4a
                if (r1 == 0) goto L4c
                java.lang.String r1 = "MigratingThreadDeframer.deframerOnTransportThread"
                p000.tnc.event(r1)     // Catch: java.lang.Throwable -> L4a
                nva r1 = p000.nva.this     // Catch: java.lang.Throwable -> L4a
                nva$h r1 = p000.nva.m18159i(r1)     // Catch: java.lang.Throwable -> L4a
                nva r3 = p000.nva.this     // Catch: java.lang.Throwable -> L4a
                gsa$b r3 = p000.nva.m18152b(r3)     // Catch: java.lang.Throwable -> L4a
                r1.setDelegate(r3)     // Catch: java.lang.Throwable -> L4a
                nva r1 = p000.nva.this     // Catch: java.lang.Throwable -> L4a
                r3 = 1
                p000.nva.m18160j(r1, r3)     // Catch: java.lang.Throwable -> L4a
                goto L4c
            L4a:
                r1 = move-exception
                goto L59
            L4c:
                nva r1 = p000.nva.this     // Catch: java.lang.Throwable -> L4a
                p000.nva.m18153c(r1, r2)     // Catch: java.lang.Throwable -> L4a
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L4a
                r0 = 0
                return r0
            L54:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L4a
                r1.run(r2)
                goto L0
            L59:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L4a
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.nva.C10080g.next():java.io.InputStream");
        }
    }

    /* JADX INFO: renamed from: nva$h */
    public static class C10081h extends pr6 {

        /* JADX INFO: renamed from: a */
        public gsa.InterfaceC6484b f65813a;

        public C10081h(gsa.InterfaceC6484b interfaceC6484b) {
            setDelegate(interfaceC6484b);
        }

        @Override // p000.pr6
        /* JADX INFO: renamed from: a */
        public gsa.InterfaceC6484b mo18162a() {
            return this.f65813a;
        }

        public void setDelegate(gsa.InterfaceC6484b interfaceC6484b) {
            this.f65813a = (gsa.InterfaceC6484b) v7d.checkNotNull(interfaceC6484b, "delegate");
        }
    }

    /* JADX INFO: renamed from: nva$i */
    public interface InterfaceC10082i {
        void run(boolean z);
    }

    public nva(gsa.InterfaceC6484b interfaceC6484b, n40.InterfaceC9690d interfaceC9690d, gsa gsaVar) {
        szf szfVar = new szf((gsa.InterfaceC6484b) v7d.checkNotNull(interfaceC6484b, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER));
        this.f65793a = szfVar;
        this.f65796d = (n40.InterfaceC9690d) v7d.checkNotNull(interfaceC9690d, "transportExecutor");
        n40 n40Var = new n40(szfVar, interfaceC9690d);
        this.f65794b = n40Var;
        C10081h c10081h = new C10081h(n40Var);
        this.f65795c = c10081h;
        gsaVar.m11835b(c10081h);
        this.f65797e = gsaVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void requestFromTransportThread(int i) {
        runWhereAppropriate(new C10078e(i));
    }

    private boolean runWhereAppropriate(InterfaceC10082i interfaceC10082i) {
        return runWhereAppropriate(interfaceC10082i, true);
    }

    @Override // p000.m34, java.lang.AutoCloseable
    public void close() {
        if (runWhereAppropriate(new C10075b())) {
            return;
        }
        this.f65797e.m11836c();
    }

    @Override // p000.m34
    public void closeWhenComplete() {
        runWhereAppropriate(new C10076c());
    }

    @Override // p000.m34
    public void deframe(frd frdVar) {
        runWhereAppropriate(new C10077d(frdVar));
    }

    @Override // p000.cyg, p000.m34
    public void request(int i) {
        runWhereAppropriate(new C10079f(i), false);
    }

    @Override // p000.m34
    public void setDecompressor(am3 am3Var) {
        this.f65797e.setDecompressor(am3Var);
    }

    @Override // p000.m34
    public void setFullStreamDecompressor(md7 md7Var) {
        this.f65797e.setFullStreamDecompressor(md7Var);
    }

    @Override // p000.m34
    public void setMaxInboundMessageSize(int i) {
        this.f65797e.setMaxInboundMessageSize(i);
    }

    private boolean runWhereAppropriate(InterfaceC10082i interfaceC10082i, boolean z) {
        boolean z2;
        boolean z3;
        synchronized (this.f65799m) {
            try {
                z2 = this.f65790C;
                z3 = this.f65792H;
                if (!z2) {
                    this.f65791F.offer(interfaceC10082i);
                    this.f65792H = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z2) {
            interfaceC10082i.run(true);
            return true;
        }
        if (z3) {
            return false;
        }
        if (!z) {
            this.f65796d.runOnTransportThread(new RunnableC10074a(tnc.linkOut()));
            return false;
        }
        nng nngVarTraceTask = tnc.traceTask("MigratingThreadDeframer.messageAvailable");
        try {
            this.f65793a.messagesAvailable(this.f65798f);
            if (nngVarTraceTask == null) {
                return false;
            }
            nngVarTraceTask.close();
            return false;
        } catch (Throwable th2) {
            if (nngVarTraceTask != null) {
                try {
                    nngVarTraceTask.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }
}
