package p000;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public class q0f implements Executor {

    /* JADX INFO: renamed from: b */
    public final Executor f72703b;

    /* JADX INFO: renamed from: d */
    public volatile Runnable f72705d;

    /* JADX INFO: renamed from: a */
    public final ArrayDeque<RunnableC11241a> f72702a = new ArrayDeque<>();

    /* JADX INFO: renamed from: c */
    public final Object f72704c = new Object();

    /* JADX INFO: renamed from: q0f$a */
    public static class RunnableC11241a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final q0f f72706a;

        /* JADX INFO: renamed from: b */
        public final Runnable f72707b;

        public RunnableC11241a(@efb q0f serialExecutor, @efb Runnable runnable) {
            this.f72706a = serialExecutor;
            this.f72707b = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f72707b.run();
            } finally {
                this.f72706a.m19912a();
            }
        }
    }

    public q0f(@efb Executor executor) {
        this.f72703b = executor;
    }

    /* JADX INFO: renamed from: a */
    public void m19912a() {
        synchronized (this.f72704c) {
            try {
                RunnableC11241a runnableC11241aPoll = this.f72702a.poll();
                this.f72705d = runnableC11241aPoll;
                if (runnableC11241aPoll != null) {
                    this.f72703b.execute(this.f72705d);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(@efb Runnable command) {
        synchronized (this.f72704c) {
            try {
                this.f72702a.add(new RunnableC11241a(this, command));
                if (this.f72705d == null) {
                    m19912a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @efb
    @fdi
    public Executor getDelegatedExecutor() {
        return this.f72703b;
    }

    public boolean hasPendingTasks() {
        boolean z;
        synchronized (this.f72704c) {
            z = !this.f72702a.isEmpty();
        }
        return z;
    }
}
