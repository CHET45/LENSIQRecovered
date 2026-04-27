package p000;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public class gdg extends AtomicInteger implements fdg {
    private static final long serialVersionUID = -2189523197179400958L;

    /* JADX INFO: renamed from: C */
    public boolean f39548C;

    /* JADX INFO: renamed from: a */
    public fdg f39549a;

    /* JADX INFO: renamed from: b */
    public long f39550b;

    /* JADX INFO: renamed from: c */
    public final AtomicReference<fdg> f39551c = new AtomicReference<>();

    /* JADX INFO: renamed from: d */
    public final AtomicLong f39552d = new AtomicLong();

    /* JADX INFO: renamed from: e */
    public final AtomicLong f39553e = new AtomicLong();

    /* JADX INFO: renamed from: f */
    public final boolean f39554f;

    /* JADX INFO: renamed from: m */
    public volatile boolean f39555m;

    public gdg(boolean cancelOnReplace) {
        this.f39554f = cancelOnReplace;
    }

    /* JADX INFO: renamed from: a */
    public final void m11653a() {
        if (getAndIncrement() != 0) {
            return;
        }
        m11654b();
    }

    /* JADX INFO: renamed from: b */
    public final void m11654b() {
        int iAddAndGet = 1;
        long jAddCap = 0;
        fdg fdgVar = null;
        do {
            fdg andSet = this.f39551c.get();
            if (andSet != null) {
                andSet = this.f39551c.getAndSet(null);
            }
            long andSet2 = this.f39552d.get();
            if (andSet2 != 0) {
                andSet2 = this.f39552d.getAndSet(0L);
            }
            long andSet3 = this.f39553e.get();
            if (andSet3 != 0) {
                andSet3 = this.f39553e.getAndSet(0L);
            }
            fdg fdgVar2 = this.f39549a;
            if (this.f39555m) {
                if (fdgVar2 != null) {
                    fdgVar2.cancel();
                    this.f39549a = null;
                }
                if (andSet != null) {
                    andSet.cancel();
                }
            } else {
                long jAddCap2 = this.f39550b;
                if (jAddCap2 != Long.MAX_VALUE) {
                    jAddCap2 = ro0.addCap(jAddCap2, andSet2);
                    if (jAddCap2 != Long.MAX_VALUE) {
                        jAddCap2 -= andSet3;
                        if (jAddCap2 < 0) {
                            ldg.reportMoreProduced(jAddCap2);
                            jAddCap2 = 0;
                        }
                    }
                    this.f39550b = jAddCap2;
                }
                if (andSet != null) {
                    if (fdgVar2 != null && this.f39554f) {
                        fdgVar2.cancel();
                    }
                    this.f39549a = andSet;
                    if (jAddCap2 != 0) {
                        jAddCap = ro0.addCap(jAddCap, jAddCap2);
                        fdgVar = andSet;
                    }
                } else if (fdgVar2 != null && andSet2 != 0) {
                    jAddCap = ro0.addCap(jAddCap, andSet2);
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
        if (this.f39555m) {
            return;
        }
        this.f39555m = true;
        m11653a();
    }

    public final boolean isCancelled() {
        return this.f39555m;
    }

    public final boolean isUnbounded() {
        return this.f39548C;
    }

    public final void produced(long n) {
        if (this.f39548C) {
            return;
        }
        if (get() != 0 || !compareAndSet(0, 1)) {
            ro0.add(this.f39553e, n);
            m11653a();
            return;
        }
        long j = this.f39550b;
        if (j != Long.MAX_VALUE) {
            long j2 = j - n;
            if (j2 < 0) {
                ldg.reportMoreProduced(j2);
                j2 = 0;
            }
            this.f39550b = j2;
        }
        if (decrementAndGet() == 0) {
            return;
        }
        m11654b();
    }

    @Override // p000.fdg
    public final void request(long n) {
        if (!ldg.validate(n) || this.f39548C) {
            return;
        }
        if (get() != 0 || !compareAndSet(0, 1)) {
            ro0.add(this.f39552d, n);
            m11653a();
            return;
        }
        long j = this.f39550b;
        if (j != Long.MAX_VALUE) {
            long jAddCap = ro0.addCap(j, n);
            this.f39550b = jAddCap;
            if (jAddCap == Long.MAX_VALUE) {
                this.f39548C = true;
            }
        }
        fdg fdgVar = this.f39549a;
        if (decrementAndGet() != 0) {
            m11654b();
        }
        if (fdgVar != null) {
            fdgVar.request(n);
        }
    }

    public final void setSubscription(fdg s) {
        if (this.f39555m) {
            s.cancel();
            return;
        }
        Objects.requireNonNull(s, "s is null");
        if (get() != 0 || !compareAndSet(0, 1)) {
            fdg andSet = this.f39551c.getAndSet(s);
            if (andSet != null && this.f39554f) {
                andSet.cancel();
            }
            m11653a();
            return;
        }
        fdg fdgVar = this.f39549a;
        if (fdgVar != null && this.f39554f) {
            fdgVar.cancel();
        }
        this.f39549a = s;
        long j = this.f39550b;
        if (decrementAndGet() != 0) {
            m11654b();
        }
        if (j != 0) {
            s.request(j);
        }
    }
}
