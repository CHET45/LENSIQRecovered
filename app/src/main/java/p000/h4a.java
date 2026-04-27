package p000;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
public final class h4a {

    /* JADX INFO: renamed from: i */
    public static final InterfaceC6707c f42318i = new C6705a();

    /* JADX INFO: renamed from: a */
    public final long f42319a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC6707c f42320b;

    /* JADX INFO: renamed from: c */
    @wx1
    public ScheduledFuture<?> f42321c;

    /* JADX INFO: renamed from: d */
    public Runnable f42322d;

    /* JADX INFO: renamed from: e */
    public ScheduledExecutorService f42323e;

    /* JADX INFO: renamed from: f */
    public long f42324f;

    /* JADX INFO: renamed from: g */
    public boolean f42325g;

    /* JADX INFO: renamed from: h */
    public boolean f42326h;

    /* JADX INFO: renamed from: h4a$a */
    public class C6705a implements InterfaceC6707c {
        @Override // p000.h4a.InterfaceC6707c
        public long nanoTime() {
            return System.nanoTime();
        }
    }

    /* JADX INFO: renamed from: h4a$b */
    public class RunnableC6706b implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ScheduledExecutorService f42327a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Runnable f42328b;

        public RunnableC6706b(ScheduledExecutorService scheduledExecutorService, Runnable runnable) {
            this.f42327a = scheduledExecutorService;
            this.f42328b = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!h4a.this.f42325g) {
                this.f42328b.run();
                h4a.this.f42321c = null;
            } else {
                if (h4a.this.f42326h) {
                    return;
                }
                h4a h4aVar = h4a.this;
                h4aVar.f42321c = this.f42327a.schedule(h4aVar.f42322d, h4a.this.f42324f - h4a.this.f42320b.nanoTime(), TimeUnit.NANOSECONDS);
                h4a.this.f42325g = false;
            }
        }
    }

    /* JADX INFO: renamed from: h4a$c */
    @gdi
    public interface InterfaceC6707c {
        long nanoTime();
    }

    public h4a(long j) {
        this(j, f42318i);
    }

    public void onTransportActive() {
        this.f42326h = true;
        this.f42325g = true;
    }

    public void onTransportIdle() {
        this.f42326h = false;
        ScheduledFuture<?> scheduledFuture = this.f42321c;
        if (scheduledFuture == null) {
            return;
        }
        if (!scheduledFuture.isDone()) {
            this.f42324f = this.f42320b.nanoTime() + this.f42319a;
        } else {
            this.f42325g = false;
            this.f42321c = this.f42323e.schedule(this.f42322d, this.f42319a, TimeUnit.NANOSECONDS);
        }
    }

    public void onTransportTermination() {
        ScheduledFuture<?> scheduledFuture = this.f42321c;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            this.f42321c = null;
        }
    }

    public void start(Runnable runnable, ScheduledExecutorService scheduledExecutorService) {
        this.f42323e = scheduledExecutorService;
        this.f42324f = this.f42320b.nanoTime() + this.f42319a;
        fi9 fi9Var = new fi9(new RunnableC6706b(scheduledExecutorService, runnable));
        this.f42322d = fi9Var;
        this.f42321c = scheduledExecutorService.schedule(fi9Var, this.f42319a, TimeUnit.NANOSECONDS);
    }

    @gdi
    public h4a(long j, InterfaceC6707c interfaceC6707c) {
        this.f42319a = j;
        this.f42320b = interfaceC6707c;
    }
}
