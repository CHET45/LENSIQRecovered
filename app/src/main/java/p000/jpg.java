package p000;

import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import p000.voe;

/* JADX INFO: loaded from: classes7.dex */
public final class jpg extends voe {

    /* JADX INFO: renamed from: c */
    public final Queue<C8009b> f51429c = new PriorityBlockingQueue(11);

    /* JADX INFO: renamed from: d */
    public long f51430d;

    /* JADX INFO: renamed from: e */
    public volatile long f51431e;

    /* JADX INFO: renamed from: jpg$b */
    public static final class C8009b implements Comparable<C8009b> {

        /* JADX INFO: renamed from: a */
        public final long f51436a;

        /* JADX INFO: renamed from: b */
        public final Runnable f51437b;

        /* JADX INFO: renamed from: c */
        public final C8008a f51438c;

        /* JADX INFO: renamed from: d */
        public final long f51439d;

        public C8009b(C8008a c8008a, long j, Runnable runnable, long j2) {
            this.f51436a = j;
            this.f51437b = runnable;
            this.f51438c = c8008a;
            this.f51439d = j2;
        }

        public String toString() {
            return String.format("TimedRunnable(time = %d, run = %s)", Long.valueOf(this.f51436a), this.f51437b.toString());
        }

        @Override // java.lang.Comparable
        public int compareTo(C8009b c8009b) {
            long j = this.f51436a;
            long j2 = c8009b.f51436a;
            return j == j2 ? xjb.compare(this.f51439d, c8009b.f51439d) : xjb.compare(j, j2);
        }
    }

    public jpg() {
    }

    public void advanceTimeBy(long j, TimeUnit timeUnit) {
        advanceTimeTo(this.f51431e + timeUnit.toNanos(j), TimeUnit.NANOSECONDS);
    }

    public void advanceTimeTo(long j, TimeUnit timeUnit) {
        triggerActions(timeUnit.toNanos(j));
    }

    @Override // p000.voe
    @bfb
    public voe.AbstractC14185c createWorker() {
        return new C8008a();
    }

    @Override // p000.voe
    public long now(@bfb TimeUnit timeUnit) {
        return timeUnit.convert(this.f51431e, TimeUnit.NANOSECONDS);
    }

    public void triggerActions() {
        triggerActions(this.f51431e);
    }

    private void triggerActions(long j) {
        while (true) {
            C8009b c8009bPeek = this.f51429c.peek();
            if (c8009bPeek == null) {
                break;
            }
            long j2 = c8009bPeek.f51436a;
            if (j2 > j) {
                break;
            }
            if (j2 == 0) {
                j2 = this.f51431e;
            }
            this.f51431e = j2;
            this.f51429c.remove(c8009bPeek);
            if (!c8009bPeek.f51438c.f51432a) {
                c8009bPeek.f51437b.run();
            }
        }
        this.f51431e = j;
    }

    public jpg(long j, TimeUnit timeUnit) {
        this.f51431e = timeUnit.toNanos(j);
    }

    /* JADX INFO: renamed from: jpg$a */
    public final class C8008a extends voe.AbstractC14185c {

        /* JADX INFO: renamed from: a */
        public volatile boolean f51432a;

        /* JADX INFO: renamed from: jpg$a$a */
        public final class a implements Runnable {

            /* JADX INFO: renamed from: a */
            public final C8009b f51434a;

            public a(C8009b c8009b) {
                this.f51434a = c8009b;
            }

            @Override // java.lang.Runnable
            public void run() {
                jpg.this.f51429c.remove(this.f51434a);
            }
        }

        public C8008a() {
        }

        @Override // p000.mf4
        public void dispose() {
            this.f51432a = true;
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f51432a;
        }

        @Override // p000.voe.AbstractC14185c
        public long now(@bfb TimeUnit timeUnit) {
            return jpg.this.now(timeUnit);
        }

        @Override // p000.voe.AbstractC14185c
        @bfb
        public mf4 schedule(@bfb Runnable runnable, long j, @bfb TimeUnit timeUnit) {
            if (this.f51432a) {
                return c05.INSTANCE;
            }
            long nanos = jpg.this.f51431e + timeUnit.toNanos(j);
            jpg jpgVar = jpg.this;
            long j2 = jpgVar.f51430d;
            jpgVar.f51430d = 1 + j2;
            C8009b c8009b = new C8009b(this, nanos, runnable, j2);
            jpg.this.f51429c.add(c8009b);
            return pg4.fromRunnable(new a(c8009b));
        }

        @Override // p000.voe.AbstractC14185c
        @bfb
        public mf4 schedule(@bfb Runnable runnable) {
            if (this.f51432a) {
                return c05.INSTANCE;
            }
            jpg jpgVar = jpg.this;
            long j = jpgVar.f51430d;
            jpgVar.f51430d = 1 + j;
            C8009b c8009b = new C8009b(this, 0L, runnable, j);
            jpg.this.f51429c.add(c8009b);
            return pg4.fromRunnable(new a(c8009b));
        }
    }
}
