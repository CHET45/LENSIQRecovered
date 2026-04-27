package p000;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public class hdg extends AtomicInteger implements fdg {
    private static final long serialVersionUID = -2189523197179400958L;

    /* JADX INFO: renamed from: C */
    public boolean f43202C;

    /* JADX INFO: renamed from: a */
    public fdg f43203a;

    /* JADX INFO: renamed from: b */
    public long f43204b;

    /* JADX INFO: renamed from: c */
    public final AtomicReference<fdg> f43205c = new AtomicReference<>();

    /* JADX INFO: renamed from: d */
    public final AtomicLong f43206d = new AtomicLong();

    /* JADX INFO: renamed from: e */
    public final AtomicLong f43207e = new AtomicLong();

    /* JADX INFO: renamed from: f */
    public final boolean f43208f;

    /* JADX INFO: renamed from: m */
    public volatile boolean f43209m;

    public hdg(boolean z) {
        this.f43208f = z;
    }

    /* JADX INFO: renamed from: a */
    public final void m12322a() {
        if (getAndIncrement() != 0) {
            return;
        }
        m12323b();
    }

    /* JADX INFO: renamed from: b */
    public final void m12323b() {
        int iAddAndGet = 1;
        long jAddCap = 0;
        fdg fdgVar = null;
        do {
            fdg andSet = this.f43205c.get();
            if (andSet != null) {
                andSet = this.f43205c.getAndSet(null);
            }
            long andSet2 = this.f43206d.get();
            if (andSet2 != 0) {
                andSet2 = this.f43206d.getAndSet(0L);
            }
            long andSet3 = this.f43207e.get();
            if (andSet3 != 0) {
                andSet3 = this.f43207e.getAndSet(0L);
            }
            fdg fdgVar2 = this.f43203a;
            if (this.f43209m) {
                if (fdgVar2 != null) {
                    fdgVar2.cancel();
                    this.f43203a = null;
                }
                if (andSet != null) {
                    andSet.cancel();
                }
            } else {
                long jAddCap2 = this.f43204b;
                if (jAddCap2 != Long.MAX_VALUE) {
                    jAddCap2 = so0.addCap(jAddCap2, andSet2);
                    if (jAddCap2 != Long.MAX_VALUE) {
                        jAddCap2 -= andSet3;
                        if (jAddCap2 < 0) {
                            mdg.reportMoreProduced(jAddCap2);
                            jAddCap2 = 0;
                        }
                    }
                    this.f43204b = jAddCap2;
                }
                if (andSet != null) {
                    if (fdgVar2 != null && this.f43208f) {
                        fdgVar2.cancel();
                    }
                    this.f43203a = andSet;
                    if (jAddCap2 != 0) {
                        jAddCap = so0.addCap(jAddCap, jAddCap2);
                        fdgVar = andSet;
                    }
                } else if (fdgVar2 != null && andSet2 != 0) {
                    jAddCap = so0.addCap(jAddCap, andSet2);
                    fdgVar = fdgVar2;
                }
            }
            iAddAndGet = addAndGet(-iAddAndGet);
        } while (iAddAndGet != 0);
        if (jAddCap != 0) {
            fdgVar.request(jAddCap);
        }
    }

    @Override // p000.fdg
    public void cancel() {
        if (this.f43209m) {
            return;
        }
        this.f43209m = true;
        m12322a();
    }

    public final boolean isCancelled() {
        return this.f43209m;
    }

    public final boolean isUnbounded() {
        return this.f43202C;
    }

    public final void produced(long j) {
        if (this.f43202C) {
            return;
        }
        if (get() != 0 || !compareAndSet(0, 1)) {
            so0.add(this.f43207e, j);
            m12322a();
            return;
        }
        long j2 = this.f43204b;
        if (j2 != Long.MAX_VALUE) {
            long j3 = j2 - j;
            if (j3 < 0) {
                mdg.reportMoreProduced(j3);
                j3 = 0;
            }
            this.f43204b = j3;
        }
        if (decrementAndGet() == 0) {
            return;
        }
        m12323b();
    }

    @Override // p000.fdg
    public final void request(long j) {
        if (!mdg.validate(j) || this.f43202C) {
            return;
        }
        if (get() != 0 || !compareAndSet(0, 1)) {
            so0.add(this.f43206d, j);
            m12322a();
            return;
        }
        long j2 = this.f43204b;
        if (j2 != Long.MAX_VALUE) {
            long jAddCap = so0.addCap(j2, j);
            this.f43204b = jAddCap;
            if (jAddCap == Long.MAX_VALUE) {
                this.f43202C = true;
            }
        }
        fdg fdgVar = this.f43203a;
        if (decrementAndGet() != 0) {
            m12323b();
        }
        if (fdgVar != null) {
            fdgVar.request(j);
        }
    }

    public final void setSubscription(fdg fdgVar) {
        if (this.f43209m) {
            fdgVar.cancel();
            return;
        }
        xjb.requireNonNull(fdgVar, "s is null");
        if (get() != 0 || !compareAndSet(0, 1)) {
            fdg andSet = this.f43205c.getAndSet(fdgVar);
            if (andSet != null && this.f43208f) {
                andSet.cancel();
            }
            m12322a();
            return;
        }
        fdg fdgVar2 = this.f43203a;
        if (fdgVar2 != null && this.f43208f) {
            fdgVar2.cancel();
        }
        this.f43203a = fdgVar;
        long j = this.f43204b;
        if (decrementAndGet() != 0) {
            m12323b();
        }
        if (j != 0) {
            fdgVar.request(j);
        }
    }
}
