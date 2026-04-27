package p000;

import android.os.SystemClock;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p000.cn4;

/* JADX INFO: loaded from: classes6.dex */
public class xk4 extends e9b implements Comparable<xk4> {

    /* JADX INFO: renamed from: H */
    public static final ExecutorService f98256H = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), q0i.threadFactory("OkDownload Block", false));

    /* JADX INFO: renamed from: L */
    public static final String f98257L = "DownloadCall";

    /* JADX INFO: renamed from: M */
    public static final int f98258M = 1;

    /* JADX INFO: renamed from: C */
    public volatile Thread f98259C;

    /* JADX INFO: renamed from: F */
    @efb
    public final an4 f98260F;

    /* JADX INFO: renamed from: b */
    public final cn4 f98261b;

    /* JADX INFO: renamed from: c */
    public final boolean f98262c;

    /* JADX INFO: renamed from: d */
    @efb
    public final ArrayList<yk4> f98263d;

    /* JADX INFO: renamed from: e */
    @hib
    public volatile wk4 f98264e;

    /* JADX INFO: renamed from: f */
    public volatile boolean f98265f;

    /* JADX INFO: renamed from: m */
    public volatile boolean f98266m;

    private xk4(cn4 cn4Var, boolean z, @efb an4 an4Var) {
        this(cn4Var, z, new ArrayList(), an4Var);
    }

    public static xk4 create(cn4 cn4Var, boolean z, @efb an4 an4Var) {
        return new xk4(cn4Var, z, an4Var);
    }

    private void inspectTaskEnd(wk4 wk4Var, @efb x15 x15Var, @hib Exception exc) {
        if (x15Var == x15.CANCELED) {
            throw new IllegalAccessError("can't recognize cancelled on here");
        }
        synchronized (this) {
            try {
                if (this.f98265f) {
                    return;
                }
                this.f98266m = true;
                this.f98260F.onTaskEnd(this.f98261b.getId(), x15Var, exc);
                if (x15Var == x15.COMPLETED) {
                    this.f98260F.markFileClear(this.f98261b.getId());
                    e0c.with().processFileStrategy().completeProcessStream(wk4Var.m24622a(), this.f98261b);
                }
                e0c.with().callbackDispatcher().dispatch().taskEnd(this.f98261b, x15Var, exc);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void inspectTaskStart() {
        this.f98260F.onTaskStart(this.f98261b.getId());
        e0c.with().callbackDispatcher().dispatch().taskStart(this.f98261b);
    }

    @Override // p000.e9b
    /* JADX INFO: renamed from: a */
    public void mo9815a() {
        e0c.with().downloadDispatcher().finish(this);
        q0i.m19913d(f98257L, "call is finished " + this.f98261b.getId());
    }

    @Override // p000.e9b
    /* JADX INFO: renamed from: b */
    public void mo9816b(InterruptedException interruptedException) {
    }

    /* JADX INFO: renamed from: c */
    public void m25243c(@efb bd1 bd1Var, @efb ed1 ed1Var, @efb c8e c8eVar) {
        q0i.assembleBlock(this.f98261b, bd1Var, ed1Var.getInstanceLength(), ed1Var.isAcceptRange());
        e0c.with().callbackDispatcher().dispatch().downloadFromBeginning(this.f98261b, bd1Var, c8eVar);
    }

    public boolean cancel() {
        synchronized (this) {
            try {
                if (this.f98265f) {
                    return false;
                }
                if (this.f98266m) {
                    return false;
                }
                this.f98265f = true;
                long jUptimeMillis = SystemClock.uptimeMillis();
                e0c.with().downloadDispatcher().flyingCanceled(this);
                wk4 wk4Var = this.f98264e;
                if (wk4Var != null) {
                    wk4Var.m24631j();
                }
                Object[] array = this.f98263d.toArray();
                if (array != null && array.length != 0) {
                    for (Object obj : array) {
                        if (obj instanceof yk4) {
                            ((yk4) obj).cancel();
                        }
                    }
                } else if (this.f98259C != null) {
                    q0i.m19913d(f98257L, "interrupt thread with cancel operation because of chains are not running " + this.f98261b.getId());
                    this.f98259C.interrupt();
                }
                if (wk4Var != null) {
                    wk4Var.m24622a().cancelAsync();
                }
                q0i.m19913d(f98257L, "cancel task " + this.f98261b.getId() + " consume: " + (SystemClock.uptimeMillis() - jUptimeMillis) + "ms");
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public wk4 m25244d(@efb bd1 bd1Var) {
        return new wk4(e0c.with().processFileStrategy().createProcessStream(this.f98261b, bd1Var, this.f98260F));
    }

    @efb
    /* JADX INFO: renamed from: e */
    public dd1 m25245e(@efb bd1 bd1Var, long j) {
        return new dd1(this.f98261b, bd1Var, j);
    }

    public boolean equalsTask(@efb cn4 cn4Var) {
        return this.f98261b.equals(cn4Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x015f A[EDGE_INSN: B:78:0x015f->B:47:0x015f BREAK  A[LOOP:0: B:3:0x0013->B:81:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[LOOP:0: B:3:0x0013->B:81:?, LOOP_END, SYNTHETIC] */
    @Override // p000.e9b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void execute() throws java.lang.InterruptedException {
        /*
            Method dump skipped, instruction units count: 422
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.xk4.execute():void");
    }

    @efb
    /* JADX INFO: renamed from: f */
    public ed1 m25246f(@efb bd1 bd1Var) {
        return new ed1(this.f98261b, bd1Var);
    }

    /* JADX INFO: renamed from: g */
    public int m25247g() {
        return this.f98261b.getPriority();
    }

    @hib
    public File getFile() {
        return this.f98261b.getFile();
    }

    /* JADX INFO: renamed from: h */
    public void m25248h(@efb bd1 bd1Var) {
        cn4.C2403c.setBreakpointInfo(this.f98261b, bd1Var);
    }

    /* JADX INFO: renamed from: i */
    public void m25249i(wk4 wk4Var, bd1 bd1Var) throws InterruptedException {
        int blockCount = bd1Var.getBlockCount();
        ArrayList arrayList = new ArrayList(bd1Var.getBlockCount());
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < blockCount; i++) {
            h61 block = bd1Var.getBlock(i);
            if (!q0i.isCorrectFull(block.getCurrentOffset(), block.getContentLength())) {
                q0i.resetBlockIfDirty(block);
                yk4 yk4VarM26157a = yk4.m26157a(i, this.f98261b, bd1Var, wk4Var, this.f98260F);
                arrayList.add(yk4VarM26157a);
                arrayList2.add(Integer.valueOf(yk4VarM26157a.getBlockIndex()));
            }
        }
        if (this.f98265f) {
            return;
        }
        wk4Var.m24622a().setRequireStreamBlocks(arrayList2);
        m25250j(arrayList);
    }

    public boolean isCanceled() {
        return this.f98265f;
    }

    public boolean isFinishing() {
        return this.f98266m;
    }

    /* JADX INFO: renamed from: j */
    public void m25250j(List<yk4> list) throws InterruptedException {
        ArrayList<Future> arrayList = new ArrayList(list.size());
        try {
            Iterator<yk4> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(m25251k(it.next()));
            }
            this.f98263d.addAll(list);
            for (Future future : arrayList) {
                if (!future.isDone()) {
                    try {
                        future.get();
                    } catch (CancellationException | ExecutionException unused) {
                    }
                }
            }
            this.f98263d.removeAll(list);
        } catch (Throwable th) {
            try {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((Future) it2.next()).cancel(true);
                }
                throw th;
            } finally {
                this.f98263d.removeAll(list);
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public Future<?> m25251k(yk4 yk4Var) {
        return f98256H.submit(yk4Var);
    }

    public xk4(cn4 cn4Var, boolean z, @efb ArrayList<yk4> arrayList, @efb an4 an4Var) {
        super("download call: " + cn4Var.getId());
        this.f98261b = cn4Var;
        this.f98262c = z;
        this.f98263d = arrayList;
        this.f98260F = an4Var;
    }

    @Override // java.lang.Comparable
    @SuppressFBWarnings(justification = "This special case is just for task priority", value = {"Eq"})
    public int compareTo(@efb xk4 xk4Var) {
        return xk4Var.m25247g() - m25247g();
    }
}
