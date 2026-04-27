package p000;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import p000.t98;
import p000.zk4;

/* JADX INFO: loaded from: classes6.dex */
public class yk4 implements Runnable {

    /* JADX INFO: renamed from: M1 */
    public static final String f101877M1 = "DownloadChain";

    /* JADX INFO: renamed from: Z */
    public static final ExecutorService f101878Z = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), q0i.threadFactory("OkDownload Cancel Block", false));

    /* JADX INFO: renamed from: F */
    public long f101880F;

    /* JADX INFO: renamed from: H */
    public volatile zk4 f101881H;

    /* JADX INFO: renamed from: L */
    public long f101882L;

    /* JADX INFO: renamed from: M */
    public volatile Thread f101883M;

    /* JADX INFO: renamed from: Q */
    @efb
    public final an4 f101885Q;

    /* JADX INFO: renamed from: a */
    public final int f101888a;

    /* JADX INFO: renamed from: b */
    @efb
    public final cn4 f101889b;

    /* JADX INFO: renamed from: c */
    @efb
    public final bd1 f101890c;

    /* JADX INFO: renamed from: d */
    @efb
    public final wk4 f101891d;

    /* JADX INFO: renamed from: e */
    public final List<t98.InterfaceC12958a> f101892e = new ArrayList();

    /* JADX INFO: renamed from: f */
    public final List<t98.InterfaceC12959b> f101893f = new ArrayList();

    /* JADX INFO: renamed from: m */
    public int f101894m = 0;

    /* JADX INFO: renamed from: C */
    public int f101879C = 0;

    /* JADX INFO: renamed from: X */
    public final AtomicBoolean f101886X = new AtomicBoolean(false);

    /* JADX INFO: renamed from: Y */
    public final Runnable f101887Y = new RunnableC15701a();

    /* JADX INFO: renamed from: N */
    public final go1 f101884N = e0c.with().callbackDispatcher();

    /* JADX INFO: renamed from: yk4$a */
    public class RunnableC15701a implements Runnable {
        public RunnableC15701a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            yk4.this.releaseConnection();
        }
    }

    private yk4(int i, @efb cn4 cn4Var, @efb bd1 bd1Var, @efb wk4 wk4Var, @efb an4 an4Var) {
        this.f101888a = i;
        this.f101889b = cn4Var;
        this.f101891d = wk4Var;
        this.f101890c = bd1Var;
        this.f101885Q = an4Var;
    }

    /* JADX INFO: renamed from: a */
    public static yk4 m26157a(int i, cn4 cn4Var, @efb bd1 bd1Var, @efb wk4 wk4Var, @efb an4 an4Var) {
        return new yk4(i, cn4Var, bd1Var, wk4Var, an4Var);
    }

    /* JADX INFO: renamed from: b */
    public boolean m26158b() {
        return this.f101886X.get();
    }

    /* JADX INFO: renamed from: c */
    public void m26159c() {
        f101878Z.execute(this.f101887Y);
    }

    public void cancel() {
        if (this.f101886X.get() || this.f101883M == null) {
            return;
        }
        this.f101883M.interrupt();
    }

    /* JADX INFO: renamed from: d */
    public void m26160d() throws IOException {
        go1 go1VarCallbackDispatcher = e0c.with().callbackDispatcher();
        t8e t8eVar = new t8e();
        cd1 cd1Var = new cd1();
        this.f101892e.add(t8eVar);
        this.f101892e.add(cd1Var);
        this.f101892e.add(new gi7());
        this.f101892e.add(new sn1());
        this.f101894m = 0;
        zk4.InterfaceC16164a interfaceC16164aProcessConnect = processConnect();
        if (this.f101891d.isInterrupt()) {
            throw nc8.f63949a;
        }
        go1VarCallbackDispatcher.dispatch().fetchStart(this.f101889b, this.f101888a, getResponseContentLength());
        rq5 rq5Var = new rq5(this.f101888a, interfaceC16164aProcessConnect.getInputStream(), getOutputStream(), this.f101889b);
        this.f101893f.add(t8eVar);
        this.f101893f.add(cd1Var);
        this.f101893f.add(rq5Var);
        this.f101879C = 0;
        go1VarCallbackDispatcher.dispatch().fetchEnd(this.f101889b, this.f101888a, processFetch());
    }

    public void flushNoCallbackIncreaseBytes() {
        if (this.f101882L == 0) {
            return;
        }
        this.f101884N.dispatch().fetchProgress(this.f101889b, this.f101888a, this.f101882L);
        this.f101882L = 0L;
    }

    public int getBlockIndex() {
        return this.f101888a;
    }

    @efb
    public wk4 getCache() {
        return this.f101891d;
    }

    @hib
    public synchronized zk4 getConnection() {
        return this.f101881H;
    }

    @efb
    public synchronized zk4 getConnectionOrCreate() throws IOException {
        try {
            if (this.f101891d.isInterrupt()) {
                throw nc8.f63949a;
            }
            if (this.f101881H == null) {
                String strM24624c = this.f101891d.m24624c();
                if (strM24624c == null) {
                    strM24624c = this.f101890c.getUrl();
                }
                q0i.m19913d(f101877M1, "create connection on url: " + strM24624c);
                this.f101881H = e0c.with().connectionFactory().create(strM24624c);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f101881H;
    }

    @efb
    public an4 getDownloadStore() {
        return this.f101885Q;
    }

    @efb
    public bd1 getInfo() {
        return this.f101890c;
    }

    public z2b getOutputStream() {
        return this.f101891d.m24622a();
    }

    public long getResponseContentLength() {
        return this.f101880F;
    }

    @efb
    public cn4 getTask() {
        return this.f101889b;
    }

    public void increaseCallbackBytes(long j) {
        this.f101882L += j;
    }

    public long loopFetch() throws IOException {
        if (this.f101879C == this.f101893f.size()) {
            this.f101879C--;
        }
        return processFetch();
    }

    public zk4.InterfaceC16164a processConnect() throws IOException {
        if (this.f101891d.isInterrupt()) {
            throw nc8.f63949a;
        }
        List<t98.InterfaceC12958a> list = this.f101892e;
        int i = this.f101894m;
        this.f101894m = i + 1;
        return list.get(i).interceptConnect(this);
    }

    public long processFetch() throws IOException {
        if (this.f101891d.isInterrupt()) {
            throw nc8.f63949a;
        }
        List<t98.InterfaceC12959b> list = this.f101893f;
        int i = this.f101879C;
        this.f101879C = i + 1;
        return list.get(i).interceptFetch(this);
    }

    public synchronized void releaseConnection() {
        try {
            if (this.f101881H != null) {
                this.f101881H.release();
                q0i.m19913d(f101877M1, "release connection " + this.f101881H + " task[" + this.f101889b.getId() + "] block[" + this.f101888a + "]");
            }
            this.f101881H = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public void resetConnectForRetry() {
        this.f101894m = 1;
        releaseConnection();
    }

    @Override // java.lang.Runnable
    public void run() {
        if (m26158b()) {
            throw new IllegalAccessError("The chain has been finished!");
        }
        this.f101883M = Thread.currentThread();
        try {
            m26160d();
        } catch (IOException unused) {
        } catch (Throwable th) {
            this.f101886X.set(true);
            m26159c();
            throw th;
        }
        this.f101886X.set(true);
        m26159c();
    }

    public synchronized void setConnection(@efb zk4 zk4Var) {
        this.f101881H = zk4Var;
    }

    public void setRedirectLocation(String str) {
        this.f101891d.m24630i(str);
    }

    public void setResponseContentLength(long j) {
        this.f101880F = j;
    }
}
