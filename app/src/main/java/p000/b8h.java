package p000;

import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import p000.woe;

/* JADX INFO: loaded from: classes7.dex */
public final class b8h extends woe {

    /* JADX INFO: renamed from: c */
    public static final b8h f12986c = new b8h();

    /* JADX INFO: renamed from: b8h$a */
    public static final class RunnableC1782a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final Runnable f12987a;

        /* JADX INFO: renamed from: b */
        public final C1784c f12988b;

        /* JADX INFO: renamed from: c */
        public final long f12989c;

        public RunnableC1782a(Runnable run, C1784c worker, long execTime) {
            this.f12987a = run;
            this.f12988b = worker;
            this.f12989c = execTime;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f12988b.f12997d) {
                return;
            }
            long jNow = this.f12988b.now(TimeUnit.MILLISECONDS);
            long j = this.f12989c;
            if (j > jNow) {
                try {
                    Thread.sleep(j - jNow);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    ofe.onError(e);
                    return;
                }
            }
            if (this.f12988b.f12997d) {
                return;
            }
            this.f12987a.run();
        }
    }

    /* JADX INFO: renamed from: b8h$b */
    public static final class C1783b implements Comparable<C1783b> {

        /* JADX INFO: renamed from: a */
        public final Runnable f12990a;

        /* JADX INFO: renamed from: b */
        public final long f12991b;

        /* JADX INFO: renamed from: c */
        public final int f12992c;

        /* JADX INFO: renamed from: d */
        public volatile boolean f12993d;

        public C1783b(Runnable run, Long execTime, int count) {
            this.f12990a = run;
            this.f12991b = execTime.longValue();
            this.f12992c = count;
        }

        @Override // java.lang.Comparable
        public int compareTo(C1783b that) {
            int iCompare = Long.compare(this.f12991b, that.f12991b);
            return iCompare == 0 ? Integer.compare(this.f12992c, that.f12992c) : iCompare;
        }
    }

    /* JADX INFO: renamed from: b8h$c */
    public static final class C1784c extends woe.AbstractC14729c implements lf4 {

        /* JADX INFO: renamed from: a */
        public final PriorityBlockingQueue<C1783b> f12994a = new PriorityBlockingQueue<>();

        /* JADX INFO: renamed from: b */
        public final AtomicInteger f12995b = new AtomicInteger();

        /* JADX INFO: renamed from: c */
        public final AtomicInteger f12996c = new AtomicInteger();

        /* JADX INFO: renamed from: d */
        public volatile boolean f12997d;

        /* JADX INFO: renamed from: b8h$c$a */
        public final class a implements Runnable {

            /* JADX INFO: renamed from: a */
            public final C1783b f12998a;

            public a(C1783b timedRunnable) {
                this.f12998a = timedRunnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f12998a.f12993d = true;
                C1784c.this.f12994a.remove(this.f12998a);
            }
        }

        /* JADX INFO: renamed from: a */
        public lf4 m2999a(Runnable action, long execTime) {
            if (this.f12997d) {
                return b05.INSTANCE;
            }
            C1783b c1783b = new C1783b(action, Long.valueOf(execTime), this.f12996c.incrementAndGet());
            this.f12994a.add(c1783b);
            if (this.f12995b.getAndIncrement() != 0) {
                return lf4.fromRunnable(new a(c1783b));
            }
            int iAddAndGet = 1;
            while (!this.f12997d) {
                C1783b c1783bPoll = this.f12994a.poll();
                if (c1783bPoll == null) {
                    iAddAndGet = this.f12995b.addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return b05.INSTANCE;
                    }
                } else if (!c1783bPoll.f12993d) {
                    c1783bPoll.f12990a.run();
                }
            }
            this.f12994a.clear();
            return b05.INSTANCE;
        }

        @Override // p000.lf4
        public void dispose() {
            this.f12997d = true;
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f12997d;
        }

        @Override // p000.woe.AbstractC14729c
        @cfb
        public lf4 schedule(@cfb Runnable action) {
            return m2999a(action, now(TimeUnit.MILLISECONDS));
        }

        @Override // p000.woe.AbstractC14729c
        @cfb
        public lf4 schedule(@cfb Runnable action, long delayTime, @cfb TimeUnit unit) {
            long jNow = now(TimeUnit.MILLISECONDS) + unit.toMillis(delayTime);
            return m2999a(new RunnableC1782a(action, this, jNow), jNow);
        }
    }

    public static b8h instance() {
        return f12986c;
    }

    @Override // p000.woe
    @cfb
    public woe.AbstractC14729c createWorker() {
        return new C1784c();
    }

    @Override // p000.woe
    @cfb
    public lf4 scheduleDirect(@cfb Runnable run) {
        ofe.onSchedule(run).run();
        return b05.INSTANCE;
    }

    @Override // p000.woe
    @cfb
    public lf4 scheduleDirect(@cfb Runnable run, long delay, TimeUnit unit) {
        try {
            unit.sleep(delay);
            ofe.onSchedule(run).run();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            ofe.onError(e);
        }
        return b05.INSTANCE;
    }
}
