package p000;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import p000.no0;
import p000.thg;

/* JADX INFO: loaded from: classes7.dex */
public final class qo0 implements v8e {

    /* JADX INFO: renamed from: f */
    public static final Logger f75027f = Logger.getLogger(qo0.class.getName());

    /* JADX INFO: renamed from: a */
    public final ScheduledExecutorService f75028a;

    /* JADX INFO: renamed from: b */
    public final thg f75029b;

    /* JADX INFO: renamed from: c */
    public final no0.InterfaceC9959a f75030c;

    /* JADX INFO: renamed from: d */
    public no0 f75031d;

    /* JADX INFO: renamed from: e */
    public thg.C13053d f75032e;

    public qo0(no0.InterfaceC9959a interfaceC9959a, ScheduledExecutorService scheduledExecutorService, thg thgVar) {
        this.f75030c = interfaceC9959a;
        this.f75028a = scheduledExecutorService;
        this.f75029b = thgVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$reset$0() {
        thg.C13053d c13053d = this.f75032e;
        if (c13053d != null && c13053d.isPending()) {
            this.f75032e.cancel();
        }
        this.f75031d = null;
    }

    @Override // p000.v8e
    public void reset() {
        this.f75029b.throwIfNotInThisSynchronizationContext();
        this.f75029b.execute(new Runnable() { // from class: po0
            @Override // java.lang.Runnable
            public final void run() {
                this.f71514a.lambda$reset$0();
            }
        });
    }

    @Override // p000.v8e
    public void schedule(Runnable runnable) {
        this.f75029b.throwIfNotInThisSynchronizationContext();
        if (this.f75031d == null) {
            this.f75031d = this.f75030c.get();
        }
        thg.C13053d c13053d = this.f75032e;
        if (c13053d == null || !c13053d.isPending()) {
            long jNextBackoffNanos = this.f75031d.nextBackoffNanos();
            this.f75032e = this.f75029b.schedule(runnable, jNextBackoffNanos, TimeUnit.NANOSECONDS, this.f75028a);
            f75027f.log(Level.FINE, "Scheduling DNS resolution backoff for {0}ns", Long.valueOf(jNextBackoffNanos));
        }
    }
}
