package p000;

import androidx.core.app.NotificationCompat;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p000.r42;

/* JADX INFO: loaded from: classes7.dex */
public class vp8 {

    /* JADX INFO: renamed from: l */
    public static final long f91908l = TimeUnit.SECONDS.toNanos(10);

    /* JADX INFO: renamed from: m */
    public static final long f91909m = TimeUnit.MILLISECONDS.toNanos(10);

    /* JADX INFO: renamed from: a */
    public final ScheduledExecutorService f91910a;

    /* JADX INFO: renamed from: b */
    @vc7("this")
    public final d5g f91911b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC14210d f91912c;

    /* JADX INFO: renamed from: d */
    public final boolean f91913d;

    /* JADX INFO: renamed from: e */
    @vc7("this")
    public EnumC14211e f91914e;

    /* JADX INFO: renamed from: f */
    @vc7("this")
    public ScheduledFuture<?> f91915f;

    /* JADX INFO: renamed from: g */
    @vc7("this")
    public ScheduledFuture<?> f91916g;

    /* JADX INFO: renamed from: h */
    public final Runnable f91917h;

    /* JADX INFO: renamed from: i */
    public final Runnable f91918i;

    /* JADX INFO: renamed from: j */
    public final long f91919j;

    /* JADX INFO: renamed from: k */
    public final long f91920k;

    /* JADX INFO: renamed from: vp8$a */
    public class RunnableC14207a implements Runnable {
        public RunnableC14207a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z;
            synchronized (vp8.this) {
                try {
                    EnumC14211e enumC14211e = vp8.this.f91914e;
                    EnumC14211e enumC14211e2 = EnumC14211e.DISCONNECTED;
                    if (enumC14211e != enumC14211e2) {
                        vp8.this.f91914e = enumC14211e2;
                        z = true;
                    } else {
                        z = false;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z) {
                vp8.this.f91912c.onPingTimeout();
            }
        }
    }

    /* JADX INFO: renamed from: vp8$b */
    public class RunnableC14208b implements Runnable {
        public RunnableC14208b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z;
            synchronized (vp8.this) {
                try {
                    vp8.this.f91916g = null;
                    EnumC14211e enumC14211e = vp8.this.f91914e;
                    EnumC14211e enumC14211e2 = EnumC14211e.PING_SCHEDULED;
                    if (enumC14211e == enumC14211e2) {
                        vp8.this.f91914e = EnumC14211e.PING_SENT;
                        vp8 vp8Var = vp8.this;
                        vp8Var.f91915f = vp8Var.f91910a.schedule(vp8.this.f91917h, vp8.this.f91920k, TimeUnit.NANOSECONDS);
                        z = true;
                    } else {
                        if (vp8.this.f91914e == EnumC14211e.PING_DELAYED) {
                            vp8 vp8Var2 = vp8.this;
                            ScheduledExecutorService scheduledExecutorService = vp8Var2.f91910a;
                            Runnable runnable = vp8.this.f91918i;
                            long j = vp8.this.f91919j;
                            d5g d5gVar = vp8.this.f91911b;
                            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                            vp8Var2.f91916g = scheduledExecutorService.schedule(runnable, j - d5gVar.elapsed(timeUnit), timeUnit);
                            vp8.this.f91914e = enumC14211e2;
                        }
                        z = false;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z) {
                vp8.this.f91912c.ping();
            }
        }
    }

    /* JADX INFO: renamed from: vp8$c */
    public static final class C14209c implements InterfaceC14210d {

        /* JADX INFO: renamed from: a */
        public final qr2 f91923a;

        /* JADX INFO: renamed from: vp8$c$a */
        public class a implements r42.InterfaceC11878a {
            public a() {
            }

            @Override // p000.r42.InterfaceC11878a
            public void onFailure(Throwable th) {
                C14209c.this.f91923a.shutdownNow(n4g.f63273t.withDescription("Keepalive failed. The connection is likely gone"));
            }

            @Override // p000.r42.InterfaceC11878a
            public void onSuccess(long j) {
            }
        }

        public C14209c(qr2 qr2Var) {
            this.f91923a = qr2Var;
        }

        @Override // p000.vp8.InterfaceC14210d
        public void onPingTimeout() {
            this.f91923a.shutdownNow(n4g.f63273t.withDescription("Keepalive failed. The connection is likely gone"));
        }

        @Override // p000.vp8.InterfaceC14210d
        public void ping() {
            this.f91923a.ping(new a(), xya.directExecutor());
        }
    }

    /* JADX INFO: renamed from: vp8$d */
    public interface InterfaceC14210d {
        void onPingTimeout();

        void ping();
    }

    /* JADX INFO: renamed from: vp8$e */
    public enum EnumC14211e {
        IDLE,
        PING_SCHEDULED,
        PING_DELAYED,
        PING_SENT,
        IDLE_AND_PING_SENT,
        DISCONNECTED
    }

    public vp8(InterfaceC14210d interfaceC14210d, ScheduledExecutorService scheduledExecutorService, long j, long j2, boolean z) {
        this(interfaceC14210d, scheduledExecutorService, d5g.createUnstarted(), j, j2, z);
    }

    public static long clampKeepAliveTimeInNanos(long j) {
        return Math.max(j, f91908l);
    }

    public static long clampKeepAliveTimeoutInNanos(long j) {
        return Math.max(j, f91909m);
    }

    public synchronized void onDataReceived() {
        try {
            this.f91911b.reset().start();
            EnumC14211e enumC14211e = this.f91914e;
            EnumC14211e enumC14211e2 = EnumC14211e.PING_SCHEDULED;
            if (enumC14211e == enumC14211e2) {
                this.f91914e = EnumC14211e.PING_DELAYED;
            } else if (enumC14211e == EnumC14211e.PING_SENT || enumC14211e == EnumC14211e.IDLE_AND_PING_SENT) {
                ScheduledFuture<?> scheduledFuture = this.f91915f;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                if (this.f91914e == EnumC14211e.IDLE_AND_PING_SENT) {
                    this.f91914e = EnumC14211e.IDLE;
                } else {
                    this.f91914e = enumC14211e2;
                    v7d.checkState(this.f91916g == null, "There should be no outstanding pingFuture");
                    this.f91916g = this.f91910a.schedule(this.f91918i, this.f91919j, TimeUnit.NANOSECONDS);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void onTransportActive() {
        try {
            EnumC14211e enumC14211e = this.f91914e;
            if (enumC14211e == EnumC14211e.IDLE) {
                this.f91914e = EnumC14211e.PING_SCHEDULED;
                if (this.f91916g == null) {
                    ScheduledExecutorService scheduledExecutorService = this.f91910a;
                    Runnable runnable = this.f91918i;
                    long j = this.f91919j;
                    d5g d5gVar = this.f91911b;
                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                    this.f91916g = scheduledExecutorService.schedule(runnable, j - d5gVar.elapsed(timeUnit), timeUnit);
                }
            } else if (enumC14211e == EnumC14211e.IDLE_AND_PING_SENT) {
                this.f91914e = EnumC14211e.PING_SENT;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void onTransportIdle() {
        try {
            if (this.f91913d) {
                return;
            }
            EnumC14211e enumC14211e = this.f91914e;
            if (enumC14211e == EnumC14211e.PING_SCHEDULED || enumC14211e == EnumC14211e.PING_DELAYED) {
                this.f91914e = EnumC14211e.IDLE;
            }
            if (this.f91914e == EnumC14211e.PING_SENT) {
                this.f91914e = EnumC14211e.IDLE_AND_PING_SENT;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void onTransportStarted() {
        if (this.f91913d) {
            onTransportActive();
        }
    }

    public synchronized void onTransportTermination() {
        try {
            EnumC14211e enumC14211e = this.f91914e;
            EnumC14211e enumC14211e2 = EnumC14211e.DISCONNECTED;
            if (enumC14211e != enumC14211e2) {
                this.f91914e = enumC14211e2;
                ScheduledFuture<?> scheduledFuture = this.f91915f;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                ScheduledFuture<?> scheduledFuture2 = this.f91916g;
                if (scheduledFuture2 != null) {
                    scheduledFuture2.cancel(false);
                    this.f91916g = null;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @gdi
    public vp8(InterfaceC14210d interfaceC14210d, ScheduledExecutorService scheduledExecutorService, d5g d5gVar, long j, long j2, boolean z) {
        this.f91914e = EnumC14211e.IDLE;
        this.f91917h = new fi9(new RunnableC14207a());
        this.f91918i = new fi9(new RunnableC14208b());
        this.f91912c = (InterfaceC14210d) v7d.checkNotNull(interfaceC14210d, "keepAlivePinger");
        this.f91910a = (ScheduledExecutorService) v7d.checkNotNull(scheduledExecutorService, "scheduler");
        this.f91911b = (d5g) v7d.checkNotNull(d5gVar, NotificationCompat.CATEGORY_STOPWATCH);
        this.f91919j = j;
        this.f91920k = j2;
        this.f91913d = z;
        d5gVar.reset().start();
    }
}
