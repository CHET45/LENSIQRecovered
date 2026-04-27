package p000;

import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p000.woe;

/* JADX INFO: loaded from: classes7.dex */
public final class ipg extends woe {

    /* JADX INFO: renamed from: c */
    public final Queue<C7561b> f47853c;

    /* JADX INFO: renamed from: d */
    public final boolean f47854d;

    /* JADX INFO: renamed from: e */
    public long f47855e;

    /* JADX INFO: renamed from: f */
    public volatile long f47856f;

    /* JADX INFO: renamed from: ipg$b */
    public static final class C7561b implements Comparable<C7561b> {

        /* JADX INFO: renamed from: a */
        public final long f47860a;

        /* JADX INFO: renamed from: b */
        public final Runnable f47861b;

        /* JADX INFO: renamed from: c */
        public final C7560a f47862c;

        /* JADX INFO: renamed from: d */
        public final long f47863d;

        public C7561b(C7560a scheduler, long time, Runnable run, long count) {
            this.f47860a = time;
            this.f47861b = run;
            this.f47862c = scheduler;
            this.f47863d = count;
        }

        public String toString() {
            return String.format("TimedRunnable(time = %d, run = %s)", Long.valueOf(this.f47860a), this.f47861b.toString());
        }

        @Override // java.lang.Comparable
        public int compareTo(C7561b o) {
            long j = this.f47860a;
            long j2 = o.f47860a;
            return j == j2 ? Long.compare(this.f47863d, o.f47863d) : Long.compare(j, j2);
        }
    }

    public ipg() {
        this(false);
    }

    public void advanceTimeBy(long delayTime, TimeUnit unit) {
        advanceTimeTo(this.f47856f + unit.toNanos(delayTime), TimeUnit.NANOSECONDS);
    }

    public void advanceTimeTo(long delayTime, TimeUnit unit) {
        triggerActions(unit.toNanos(delayTime));
    }

    @Override // p000.woe
    @cfb
    public woe.AbstractC14729c createWorker() {
        return new C7560a();
    }

    @Override // p000.woe
    public long now(@cfb TimeUnit unit) {
        return unit.convert(this.f47856f, TimeUnit.NANOSECONDS);
    }

    public void triggerActions() {
        triggerActions(this.f47856f);
    }

    public ipg(boolean useOnScheduleHook) {
        this.f47853c = new PriorityBlockingQueue(11);
        this.f47854d = useOnScheduleHook;
    }

    private void triggerActions(long targetTimeInNanoseconds) {
        while (true) {
            C7561b c7561bPeek = this.f47853c.peek();
            if (c7561bPeek == null) {
                break;
            }
            long j = c7561bPeek.f47860a;
            if (j > targetTimeInNanoseconds) {
                break;
            }
            if (j == 0) {
                j = this.f47856f;
            }
            this.f47856f = j;
            this.f47853c.remove(c7561bPeek);
            if (!c7561bPeek.f47862c.f47857a) {
                c7561bPeek.f47861b.run();
            }
        }
        this.f47856f = targetTimeInNanoseconds;
    }

    public ipg(long delayTime, TimeUnit unit) {
        this(delayTime, unit, false);
    }

    public ipg(long delayTime, TimeUnit unit, boolean useOnScheduleHook) {
        this.f47853c = new PriorityBlockingQueue(11);
        this.f47856f = unit.toNanos(delayTime);
        this.f47854d = useOnScheduleHook;
    }

    /* JADX INFO: renamed from: ipg$a */
    public final class C7560a extends woe.AbstractC14729c {

        /* JADX INFO: renamed from: a */
        public volatile boolean f47857a;

        /* JADX INFO: renamed from: ipg$a$a */
        public final class a extends AtomicReference<C7561b> implements lf4 {
            private static final long serialVersionUID = -7874968252110604360L;

            public a(C7561b timedAction) {
                lazySet(timedAction);
            }

            @Override // p000.lf4
            public void dispose() {
                C7561b andSet = getAndSet(null);
                if (andSet != null) {
                    ipg.this.f47853c.remove(andSet);
                }
            }

            @Override // p000.lf4
            public boolean isDisposed() {
                return get() == null;
            }
        }

        public C7560a() {
        }

        @Override // p000.lf4
        public void dispose() {
            this.f47857a = true;
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f47857a;
        }

        @Override // p000.woe.AbstractC14729c
        public long now(@cfb TimeUnit unit) {
            return ipg.this.now(unit);
        }

        @Override // p000.woe.AbstractC14729c
        @cfb
        public lf4 schedule(@cfb Runnable run, long delayTime, @cfb TimeUnit unit) {
            if (this.f47857a) {
                return b05.INSTANCE;
            }
            if (ipg.this.f47854d) {
                run = ofe.onSchedule(run);
            }
            long nanos = ipg.this.f47856f + unit.toNanos(delayTime);
            ipg ipgVar = ipg.this;
            long j = ipgVar.f47855e;
            ipgVar.f47855e = 1 + j;
            C7561b c7561b = new C7561b(this, nanos, run, j);
            ipg.this.f47853c.add(c7561b);
            return new a(c7561b);
        }

        @Override // p000.woe.AbstractC14729c
        @cfb
        public lf4 schedule(@cfb Runnable run) {
            if (this.f47857a) {
                return b05.INSTANCE;
            }
            if (ipg.this.f47854d) {
                run = ofe.onSchedule(run);
            }
            ipg ipgVar = ipg.this;
            long j = ipgVar.f47855e;
            ipgVar.f47855e = 1 + j;
            C7561b c7561b = new C7561b(this, 0L, run, j);
            ipg.this.f47853c.add(c7561b);
            return new a(c7561b);
        }
    }
}
