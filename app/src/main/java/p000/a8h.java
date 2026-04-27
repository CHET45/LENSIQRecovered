package p000;

import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import p000.voe;

/* JADX INFO: loaded from: classes7.dex */
public final class a8h extends voe {

    /* JADX INFO: renamed from: c */
    public static final a8h f626c = new a8h();

    /* JADX INFO: renamed from: a8h$a */
    public static final class RunnableC0090a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final Runnable f627a;

        /* JADX INFO: renamed from: b */
        public final C0092c f628b;

        /* JADX INFO: renamed from: c */
        public final long f629c;

        public RunnableC0090a(Runnable runnable, C0092c c0092c, long j) {
            this.f627a = runnable;
            this.f628b = c0092c;
            this.f629c = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f628b.f637d) {
                return;
            }
            long jNow = this.f628b.now(TimeUnit.MILLISECONDS);
            long j = this.f629c;
            if (j > jNow) {
                try {
                    Thread.sleep(j - jNow);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    pfe.onError(e);
                    return;
                }
            }
            if (this.f628b.f637d) {
                return;
            }
            this.f627a.run();
        }
    }

    /* JADX INFO: renamed from: a8h$b */
    public static final class C0091b implements Comparable<C0091b> {

        /* JADX INFO: renamed from: a */
        public final Runnable f630a;

        /* JADX INFO: renamed from: b */
        public final long f631b;

        /* JADX INFO: renamed from: c */
        public final int f632c;

        /* JADX INFO: renamed from: d */
        public volatile boolean f633d;

        public C0091b(Runnable runnable, Long l, int i) {
            this.f630a = runnable;
            this.f631b = l.longValue();
            this.f632c = i;
        }

        @Override // java.lang.Comparable
        public int compareTo(C0091b c0091b) {
            int iCompare = xjb.compare(this.f631b, c0091b.f631b);
            return iCompare == 0 ? xjb.compare(this.f632c, c0091b.f632c) : iCompare;
        }
    }

    /* JADX INFO: renamed from: a8h$c */
    public static final class C0092c extends voe.AbstractC14185c implements mf4 {

        /* JADX INFO: renamed from: a */
        public final PriorityBlockingQueue<C0091b> f634a = new PriorityBlockingQueue<>();

        /* JADX INFO: renamed from: b */
        public final AtomicInteger f635b = new AtomicInteger();

        /* JADX INFO: renamed from: c */
        public final AtomicInteger f636c = new AtomicInteger();

        /* JADX INFO: renamed from: d */
        public volatile boolean f637d;

        /* JADX INFO: renamed from: a8h$c$a */
        public final class a implements Runnable {

            /* JADX INFO: renamed from: a */
            public final C0091b f638a;

            public a(C0091b c0091b) {
                this.f638a = c0091b;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f638a.f633d = true;
                C0092c.this.f634a.remove(this.f638a);
            }
        }

        /* JADX INFO: renamed from: a */
        public mf4 m191a(Runnable runnable, long j) {
            if (this.f637d) {
                return c05.INSTANCE;
            }
            C0091b c0091b = new C0091b(runnable, Long.valueOf(j), this.f636c.incrementAndGet());
            this.f634a.add(c0091b);
            if (this.f635b.getAndIncrement() != 0) {
                return pg4.fromRunnable(new a(c0091b));
            }
            int iAddAndGet = 1;
            while (!this.f637d) {
                C0091b c0091bPoll = this.f634a.poll();
                if (c0091bPoll == null) {
                    iAddAndGet = this.f635b.addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return c05.INSTANCE;
                    }
                } else if (!c0091bPoll.f633d) {
                    c0091bPoll.f630a.run();
                }
            }
            this.f634a.clear();
            return c05.INSTANCE;
        }

        @Override // p000.mf4
        public void dispose() {
            this.f637d = true;
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f637d;
        }

        @Override // p000.voe.AbstractC14185c
        @bfb
        public mf4 schedule(@bfb Runnable runnable) {
            return m191a(runnable, now(TimeUnit.MILLISECONDS));
        }

        @Override // p000.voe.AbstractC14185c
        @bfb
        public mf4 schedule(@bfb Runnable runnable, long j, @bfb TimeUnit timeUnit) {
            long jNow = now(TimeUnit.MILLISECONDS) + timeUnit.toMillis(j);
            return m191a(new RunnableC0090a(runnable, this, jNow), jNow);
        }
    }

    public static a8h instance() {
        return f626c;
    }

    @Override // p000.voe
    @bfb
    public voe.AbstractC14185c createWorker() {
        return new C0092c();
    }

    @Override // p000.voe
    @bfb
    public mf4 scheduleDirect(@bfb Runnable runnable) {
        pfe.onSchedule(runnable).run();
        return c05.INSTANCE;
    }

    @Override // p000.voe
    @bfb
    public mf4 scheduleDirect(@bfb Runnable runnable, long j, TimeUnit timeUnit) {
        try {
            timeUnit.sleep(j);
            pfe.onSchedule(runnable).run();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            pfe.onError(e);
        }
        return c05.INSTANCE;
    }
}
