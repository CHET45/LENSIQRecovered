package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Executor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p000.dm4;

/* JADX INFO: loaded from: classes6.dex */
public class um4 extends yl4 implements Runnable {

    /* JADX INFO: renamed from: C */
    public static final int f88471C = 0;

    /* JADX INFO: renamed from: F */
    public static final String f88472F = "DownloadSerialQueue";

    /* JADX INFO: renamed from: m */
    public static final Executor f88473m = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 30, TimeUnit.SECONDS, new SynchronousQueue(), q0i.threadFactory("OkDownload DynamicSerial", false));

    /* JADX INFO: renamed from: a */
    public volatile boolean f88474a;

    /* JADX INFO: renamed from: b */
    public volatile boolean f88475b;

    /* JADX INFO: renamed from: c */
    public volatile boolean f88476c;

    /* JADX INFO: renamed from: d */
    public volatile cn4 f88477d;

    /* JADX INFO: renamed from: e */
    public final ArrayList<cn4> f88478e;

    /* JADX INFO: renamed from: f */
    @efb
    public dm4 f88479f;

    public um4() {
        this(null);
    }

    /* JADX INFO: renamed from: a */
    public void m23431a() {
        f88473m.execute(this);
    }

    public synchronized void enqueue(cn4 cn4Var) {
        this.f88478e.add(cn4Var);
        Collections.sort(this.f88478e);
        if (!this.f88476c && !this.f88475b) {
            this.f88475b = true;
            m23431a();
        }
    }

    public int getWaitingTaskCount() {
        return this.f88478e.size();
    }

    public int getWorkingTaskId() {
        if (this.f88477d != null) {
            return this.f88477d.getId();
        }
        return 0;
    }

    public synchronized void pause() {
        if (this.f88476c) {
            q0i.m19916w(f88472F, "require pause this queue(remain " + this.f88478e.size() + "), butit has already been paused");
            return;
        }
        this.f88476c = true;
        if (this.f88477d != null) {
            this.f88477d.cancel();
            this.f88478e.add(0, this.f88477d);
            this.f88477d = null;
        }
    }

    public synchronized void resume() {
        if (this.f88476c) {
            this.f88476c = false;
            if (!this.f88478e.isEmpty() && !this.f88475b) {
                this.f88475b = true;
                m23431a();
            }
            return;
        }
        q0i.m19916w(f88472F, "require resume this queue(remain " + this.f88478e.size() + "), but it is still running");
    }

    @Override // java.lang.Runnable
    public void run() {
        cn4 cn4VarRemove;
        while (!this.f88474a) {
            synchronized (this) {
                if (!this.f88478e.isEmpty() && !this.f88476c) {
                    cn4VarRemove = this.f88478e.remove(0);
                }
                this.f88477d = null;
                this.f88475b = false;
                return;
            }
            cn4VarRemove.execute(this.f88479f);
        }
    }

    public void setListener(cm4 cm4Var) {
        this.f88479f = new dm4.C4858a().append(this).append(cm4Var).build();
    }

    public synchronized cn4[] shutdown() {
        cn4[] cn4VarArr;
        try {
            this.f88474a = true;
            if (this.f88477d != null) {
                this.f88477d.cancel();
            }
            cn4VarArr = new cn4[this.f88478e.size()];
            this.f88478e.toArray(cn4VarArr);
            this.f88478e.clear();
        } catch (Throwable th) {
            throw th;
        }
        return cn4VarArr;
    }

    @Override // p000.cm4
    public synchronized void taskEnd(@efb cn4 cn4Var, @efb x15 x15Var, @hib Exception exc) {
        if (x15Var != x15.CANCELED && cn4Var == this.f88477d) {
            this.f88477d = null;
        }
    }

    @Override // p000.cm4
    public void taskStart(@efb cn4 cn4Var) {
        this.f88477d = cn4Var;
    }

    public um4(cm4 cm4Var, ArrayList<cn4> arrayList) {
        this.f88474a = false;
        this.f88475b = false;
        this.f88476c = false;
        this.f88479f = new dm4.C4858a().append(this).append(cm4Var).build();
        this.f88478e = arrayList;
    }

    public um4(cm4 cm4Var) {
        this(cm4Var, new ArrayList());
    }
}
