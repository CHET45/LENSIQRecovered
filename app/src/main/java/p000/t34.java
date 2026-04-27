package p000;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p000.p42;
import p000.y5g;

/* JADX INFO: loaded from: classes7.dex */
public class t34 implements o42 {

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ boolean f83556j = false;

    /* JADX INFO: renamed from: a */
    public volatile boolean f83557a;

    /* JADX INFO: renamed from: b */
    public p42 f83558b;

    /* JADX INFO: renamed from: c */
    public o42 f83559c;

    /* JADX INFO: renamed from: d */
    @vc7("this")
    public n4g f83560d;

    /* JADX INFO: renamed from: f */
    @vc7("this")
    public C12896p f83562f;

    /* JADX INFO: renamed from: g */
    @vc7("this")
    public long f83563g;

    /* JADX INFO: renamed from: h */
    @vc7("this")
    public long f83564h;

    /* JADX INFO: renamed from: e */
    @vc7("this")
    public List<Runnable> f83561e = new ArrayList();

    /* JADX INFO: renamed from: i */
    public List<Runnable> f83565i = new ArrayList();

    /* JADX INFO: renamed from: t34$a */
    public class RunnableC12881a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f83566a;

        public RunnableC12881a(int i) {
            this.f83566a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            t34.this.f83559c.request(this.f83566a);
        }
    }

    /* JADX INFO: renamed from: t34$b */
    public class RunnableC12882b implements Runnable {
        public RunnableC12882b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            t34.this.f83559c.optimizeForDirectExecutor();
        }
    }

    /* JADX INFO: renamed from: t34$c */
    public class RunnableC12883c implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ go2 f83569a;

        public RunnableC12883c(go2 go2Var) {
            this.f83569a = go2Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            t34.this.f83559c.setCompressor(this.f83569a);
        }
    }

    /* JADX INFO: renamed from: t34$d */
    public class RunnableC12884d implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f83571a;

        public RunnableC12884d(boolean z) {
            this.f83571a = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            t34.this.f83559c.setFullStreamDecompression(this.f83571a);
        }
    }

    /* JADX INFO: renamed from: t34$e */
    public class RunnableC12885e implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ bm3 f83573a;

        public RunnableC12885e(bm3 bm3Var) {
            this.f83573a = bm3Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            t34.this.f83559c.setDecompressorRegistry(this.f83573a);
        }
    }

    /* JADX INFO: renamed from: t34$f */
    public class RunnableC12886f implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f83575a;

        public RunnableC12886f(boolean z) {
            this.f83575a = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            t34.this.f83559c.setMessageCompression(this.f83575a);
        }
    }

    /* JADX INFO: renamed from: t34$g */
    public class RunnableC12887g implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f83577a;

        public RunnableC12887g(int i) {
            this.f83577a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            t34.this.f83559c.setMaxInboundMessageSize(this.f83577a);
        }
    }

    /* JADX INFO: renamed from: t34$h */
    public class RunnableC12888h implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f83579a;

        public RunnableC12888h(int i) {
            this.f83579a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            t34.this.f83559c.setMaxOutboundMessageSize(this.f83579a);
        }
    }

    /* JADX INFO: renamed from: t34$i */
    public class RunnableC12889i implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ sj3 f83581a;

        public RunnableC12889i(sj3 sj3Var) {
            this.f83581a = sj3Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            t34.this.f83559c.setDeadline(this.f83581a);
        }
    }

    /* JADX INFO: renamed from: t34$j */
    public class RunnableC12890j implements Runnable {
        public RunnableC12890j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            t34.this.drainPendingCalls();
        }
    }

    /* JADX INFO: renamed from: t34$k */
    public class RunnableC12891k implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f83584a;

        public RunnableC12891k(String str) {
            this.f83584a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            t34.this.f83559c.setAuthority(this.f83584a);
        }
    }

    /* JADX INFO: renamed from: t34$l */
    public class RunnableC12892l implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InputStream f83586a;

        public RunnableC12892l(InputStream inputStream) {
            this.f83586a = inputStream;
        }

        @Override // java.lang.Runnable
        public void run() {
            t34.this.f83559c.writeMessage(this.f83586a);
        }
    }

    /* JADX INFO: renamed from: t34$m */
    public class RunnableC12893m implements Runnable {
        public RunnableC12893m() {
        }

        @Override // java.lang.Runnable
        public void run() {
            t34.this.f83559c.flush();
        }
    }

    /* JADX INFO: renamed from: t34$n */
    public class RunnableC12894n implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ n4g f83589a;

        public RunnableC12894n(n4g n4gVar) {
            this.f83589a = n4gVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            t34.this.f83559c.cancel(this.f83589a);
        }
    }

    /* JADX INFO: renamed from: t34$o */
    public class RunnableC12895o implements Runnable {
        public RunnableC12895o() {
        }

        @Override // java.lang.Runnable
        public void run() {
            t34.this.f83559c.halfClose();
        }
    }

    /* JADX INFO: renamed from: t34$p */
    public static class C12896p implements p42 {

        /* JADX INFO: renamed from: d */
        public static final /* synthetic */ boolean f83592d = false;

        /* JADX INFO: renamed from: a */
        public final p42 f83593a;

        /* JADX INFO: renamed from: b */
        public volatile boolean f83594b;

        /* JADX INFO: renamed from: c */
        @vc7("this")
        public List<Runnable> f83595c = new ArrayList();

        /* JADX INFO: renamed from: t34$p$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ y5g.InterfaceC15496a f83596a;

            public a(y5g.InterfaceC15496a interfaceC15496a) {
                this.f83596a = interfaceC15496a;
            }

            @Override // java.lang.Runnable
            public void run() {
                C12896p.this.f83593a.messagesAvailable(this.f83596a);
            }
        }

        /* JADX INFO: renamed from: t34$p$b */
        public class b implements Runnable {
            public b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C12896p.this.f83593a.onReady();
            }
        }

        /* JADX INFO: renamed from: t34$p$c */
        public class c implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ fta f83599a;

            public c(fta ftaVar) {
                this.f83599a = ftaVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                C12896p.this.f83593a.headersRead(this.f83599a);
            }
        }

        /* JADX INFO: renamed from: t34$p$d */
        public class d implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ n4g f83601a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ p42.EnumC10788a f83602b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ fta f83603c;

            public d(n4g n4gVar, p42.EnumC10788a enumC10788a, fta ftaVar) {
                this.f83601a = n4gVar;
                this.f83602b = enumC10788a;
                this.f83603c = ftaVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                C12896p.this.f83593a.closed(this.f83601a, this.f83602b, this.f83603c);
            }
        }

        public C12896p(p42 p42Var) {
            this.f83593a = p42Var;
        }

        private void delayOrExecute(Runnable runnable) {
            synchronized (this) {
                try {
                    if (this.f83594b) {
                        runnable.run();
                    } else {
                        this.f83595c.add(runnable);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // p000.p42
        public void closed(n4g n4gVar, p42.EnumC10788a enumC10788a, fta ftaVar) {
            delayOrExecute(new d(n4gVar, enumC10788a, ftaVar));
        }

        public void drainPendingCallbacks() {
            List<Runnable> list;
            List<Runnable> arrayList = new ArrayList<>();
            while (true) {
                synchronized (this) {
                    try {
                        if (this.f83595c.isEmpty()) {
                            this.f83595c = null;
                            this.f83594b = true;
                            return;
                        } else {
                            list = this.f83595c;
                            this.f83595c = arrayList;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                Iterator<Runnable> it = list.iterator();
                while (it.hasNext()) {
                    it.next().run();
                }
                list.clear();
                arrayList = list;
            }
        }

        @Override // p000.p42
        public void headersRead(fta ftaVar) {
            delayOrExecute(new c(ftaVar));
        }

        @Override // p000.y5g
        public void messagesAvailable(y5g.InterfaceC15496a interfaceC15496a) {
            if (this.f83594b) {
                this.f83593a.messagesAvailable(interfaceC15496a);
            } else {
                delayOrExecute(new a(interfaceC15496a));
            }
        }

        @Override // p000.y5g
        public void onReady() {
            if (this.f83594b) {
                this.f83593a.onReady();
            } else {
                delayOrExecute(new b());
            }
        }
    }

    private void delayOrExecute(Runnable runnable) {
        v7d.checkState(this.f83558b != null, "May only be called after start");
        synchronized (this) {
            try {
                if (this.f83557a) {
                    runnable.run();
                } else {
                    this.f83561e.add(runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0024, code lost:
    
        r0 = r1.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002c, code lost:
    
        if (r0.hasNext() == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002e, code lost:
    
        r0.next().run();
     */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void drainPendingCalls() {
        /*
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L5:
            monitor-enter(r3)
            java.util.List<java.lang.Runnable> r1 = r3.f83561e     // Catch: java.lang.Throwable -> L1d
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L1d
            if (r1 == 0) goto L1f
            r0 = 0
            r3.f83561e = r0     // Catch: java.lang.Throwable -> L1d
            r0 = 1
            r3.f83557a = r0     // Catch: java.lang.Throwable -> L1d
            t34$p r0 = r3.f83562f     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1d
            if (r0 == 0) goto L1c
            r0.drainPendingCallbacks()
        L1c:
            return
        L1d:
            r0 = move-exception
            goto L3d
        L1f:
            java.util.List<java.lang.Runnable> r1 = r3.f83561e     // Catch: java.lang.Throwable -> L1d
            r3.f83561e = r0     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1d
            java.util.Iterator r0 = r1.iterator()
        L28:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L38
            java.lang.Object r2 = r0.next()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r2.run()
            goto L28
        L38:
            r1.clear()
            r0 = r1
            goto L5
        L3d:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1d
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.t34.drainPendingCalls():void");
    }

    private void internalStart(p42 p42Var) {
        Iterator<Runnable> it = this.f83565i.iterator();
        while (it.hasNext()) {
            it.next().run();
        }
        this.f83565i = null;
        this.f83559c.start(p42Var);
    }

    @vc7("this")
    private void setRealStream(o42 o42Var) {
        o42 o42Var2 = this.f83559c;
        v7d.checkState(o42Var2 == null, "realStream already set to %s", o42Var2);
        this.f83559c = o42Var;
        this.f83564h = System.nanoTime();
    }

    @Override // p000.o42
    public void appendTimeoutInsight(y48 y48Var) {
        synchronized (this) {
            try {
                if (this.f83558b == null) {
                    return;
                }
                if (this.f83559c != null) {
                    y48Var.appendKeyValue("buffered_nanos", Long.valueOf(this.f83564h - this.f83563g));
                    this.f83559c.appendTimeoutInsight(y48Var);
                } else {
                    y48Var.appendKeyValue("buffered_nanos", Long.valueOf(System.nanoTime() - this.f83563g));
                    y48Var.append("waiting_for_connection");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @gdi
    /* JADX INFO: renamed from: c */
    public o42 m22347c() {
        return this.f83559c;
    }

    @Override // p000.o42
    public void cancel(n4g n4gVar) {
        boolean z = false;
        v7d.checkState(this.f83558b != null, "May only be called after start");
        v7d.checkNotNull(n4gVar, "reason");
        synchronized (this) {
            try {
                if (this.f83559c == null) {
                    setRealStream(pfb.f70615a);
                    this.f83560d = n4gVar;
                } else {
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            delayOrExecute(new RunnableC12894n(n4gVar));
            return;
        }
        drainPendingCalls();
        mo21684d(n4gVar);
        this.f83558b.closed(n4gVar, p42.EnumC10788a.PROCESSED, new fta());
    }

    /* JADX INFO: renamed from: d */
    public void mo21684d(n4g n4gVar) {
    }

    @dy1
    /* JADX INFO: renamed from: e */
    public final Runnable m22348e(o42 o42Var) {
        synchronized (this) {
            try {
                if (this.f83559c != null) {
                    return null;
                }
                setRealStream((o42) v7d.checkNotNull(o42Var, "stream"));
                p42 p42Var = this.f83558b;
                if (p42Var == null) {
                    this.f83561e = null;
                    this.f83557a = true;
                }
                if (p42Var == null) {
                    return null;
                }
                internalStart(p42Var);
                return new RunnableC12890j();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.n5g
    public void flush() {
        v7d.checkState(this.f83558b != null, "May only be called after start");
        if (this.f83557a) {
            this.f83559c.flush();
        } else {
            delayOrExecute(new RunnableC12893m());
        }
    }

    @Override // p000.o42
    public sc0 getAttributes() {
        o42 o42Var;
        synchronized (this) {
            o42Var = this.f83559c;
        }
        return o42Var != null ? o42Var.getAttributes() : sc0.f81180c;
    }

    @Override // p000.o42
    public void halfClose() {
        v7d.checkState(this.f83558b != null, "May only be called after start");
        delayOrExecute(new RunnableC12895o());
    }

    @Override // p000.n5g
    public boolean isReady() {
        if (this.f83557a) {
            return this.f83559c.isReady();
        }
        return false;
    }

    @Override // p000.n5g
    public void optimizeForDirectExecutor() {
        v7d.checkState(this.f83558b == null, "May only be called before start");
        this.f83565i.add(new RunnableC12882b());
    }

    @Override // p000.n5g
    public void request(int i) {
        v7d.checkState(this.f83558b != null, "May only be called after start");
        if (this.f83557a) {
            this.f83559c.request(i);
        } else {
            delayOrExecute(new RunnableC12881a(i));
        }
    }

    @Override // p000.o42
    public void setAuthority(String str) {
        v7d.checkState(this.f83558b == null, "May only be called before start");
        v7d.checkNotNull(str, "authority");
        this.f83565i.add(new RunnableC12891k(str));
    }

    @Override // p000.n5g
    public void setCompressor(go2 go2Var) {
        v7d.checkState(this.f83558b == null, "May only be called before start");
        v7d.checkNotNull(go2Var, "compressor");
        this.f83565i.add(new RunnableC12883c(go2Var));
    }

    @Override // p000.o42
    public void setDeadline(sj3 sj3Var) {
        v7d.checkState(this.f83558b == null, "May only be called before start");
        this.f83565i.add(new RunnableC12889i(sj3Var));
    }

    @Override // p000.o42
    public void setDecompressorRegistry(bm3 bm3Var) {
        v7d.checkState(this.f83558b == null, "May only be called before start");
        v7d.checkNotNull(bm3Var, "decompressorRegistry");
        this.f83565i.add(new RunnableC12885e(bm3Var));
    }

    @Override // p000.o42
    public void setFullStreamDecompression(boolean z) {
        v7d.checkState(this.f83558b == null, "May only be called before start");
        this.f83565i.add(new RunnableC12884d(z));
    }

    @Override // p000.o42
    public void setMaxInboundMessageSize(int i) {
        v7d.checkState(this.f83558b == null, "May only be called before start");
        this.f83565i.add(new RunnableC12887g(i));
    }

    @Override // p000.o42
    public void setMaxOutboundMessageSize(int i) {
        v7d.checkState(this.f83558b == null, "May only be called before start");
        this.f83565i.add(new RunnableC12888h(i));
    }

    @Override // p000.n5g
    public void setMessageCompression(boolean z) {
        v7d.checkState(this.f83558b != null, "May only be called after start");
        if (this.f83557a) {
            this.f83559c.setMessageCompression(z);
        } else {
            delayOrExecute(new RunnableC12886f(z));
        }
    }

    @Override // p000.o42
    public void start(p42 p42Var) {
        n4g n4gVar;
        boolean z;
        v7d.checkNotNull(p42Var, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        v7d.checkState(this.f83558b == null, "already started");
        synchronized (this) {
            try {
                n4gVar = this.f83560d;
                z = this.f83557a;
                if (!z) {
                    C12896p c12896p = new C12896p(p42Var);
                    this.f83562f = c12896p;
                    p42Var = c12896p;
                }
                this.f83558b = p42Var;
                this.f83563g = System.nanoTime();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (n4gVar != null) {
            p42Var.closed(n4gVar, p42.EnumC10788a.PROCESSED, new fta());
        } else if (z) {
            internalStart(p42Var);
        }
    }

    @Override // p000.n5g
    public void writeMessage(InputStream inputStream) {
        v7d.checkState(this.f83558b != null, "May only be called after start");
        v7d.checkNotNull(inputStream, g55.f38799h);
        if (this.f83557a) {
            this.f83559c.writeMessage(inputStream);
        } else {
            delayOrExecute(new RunnableC12892l(inputStream));
        }
    }
}
