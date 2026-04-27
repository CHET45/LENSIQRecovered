package p000;

import android.os.Handler;
import android.os.Message;
import java.util.concurrent.TimeUnit;
import p000.woe;

/* JADX INFO: loaded from: classes7.dex */
public final class ne7 extends woe {

    /* JADX INFO: renamed from: c */
    public final Handler f64130c;

    /* JADX INFO: renamed from: d */
    public final boolean f64131d;

    /* JADX INFO: renamed from: ne7$a */
    public static final class C9817a extends woe.AbstractC14729c {

        /* JADX INFO: renamed from: a */
        public final Handler f64132a;

        /* JADX INFO: renamed from: b */
        public final boolean f64133b;

        /* JADX INFO: renamed from: c */
        public volatile boolean f64134c;

        public C9817a(Handler handler, boolean async) {
            this.f64132a = handler;
            this.f64133b = async;
        }

        @Override // p000.lf4
        public void dispose() {
            this.f64134c = true;
            this.f64132a.removeCallbacksAndMessages(this);
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f64134c;
        }

        @Override // p000.woe.AbstractC14729c
        @igg({"NewApi"})
        public lf4 schedule(Runnable run, long delay, TimeUnit unit) {
            if (run == null) {
                throw new NullPointerException("run == null");
            }
            if (unit == null) {
                throw new NullPointerException("unit == null");
            }
            if (this.f64134c) {
                return lf4.disposed();
            }
            RunnableC9818b runnableC9818b = new RunnableC9818b(this.f64132a, ofe.onSchedule(run));
            Message messageObtain = Message.obtain(this.f64132a, runnableC9818b);
            messageObtain.obj = this;
            if (this.f64133b) {
                messageObtain.setAsynchronous(true);
            }
            this.f64132a.sendMessageDelayed(messageObtain, unit.toMillis(delay));
            if (!this.f64134c) {
                return runnableC9818b;
            }
            this.f64132a.removeCallbacks(runnableC9818b);
            return lf4.disposed();
        }
    }

    /* JADX INFO: renamed from: ne7$b */
    public static final class RunnableC9818b implements Runnable, lf4 {

        /* JADX INFO: renamed from: a */
        public final Handler f64135a;

        /* JADX INFO: renamed from: b */
        public final Runnable f64136b;

        /* JADX INFO: renamed from: c */
        public volatile boolean f64137c;

        public RunnableC9818b(Handler handler, Runnable delegate) {
            this.f64135a = handler;
            this.f64136b = delegate;
        }

        @Override // p000.lf4
        public void dispose() {
            this.f64135a.removeCallbacks(this);
            this.f64137c = true;
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f64137c;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f64136b.run();
            } catch (Throwable th) {
                ofe.onError(th);
            }
        }
    }

    public ne7(Handler handler, boolean async) {
        this.f64130c = handler;
        this.f64131d = async;
    }

    @Override // p000.woe
    public woe.AbstractC14729c createWorker() {
        return new C9817a(this.f64130c, this.f64131d);
    }

    @Override // p000.woe
    @igg({"NewApi"})
    public lf4 scheduleDirect(Runnable run, long delay, TimeUnit unit) {
        if (run == null) {
            throw new NullPointerException("run == null");
        }
        if (unit == null) {
            throw new NullPointerException("unit == null");
        }
        RunnableC9818b runnableC9818b = new RunnableC9818b(this.f64130c, ofe.onSchedule(run));
        Message messageObtain = Message.obtain(this.f64130c, runnableC9818b);
        if (this.f64131d) {
            messageObtain.setAsynchronous(true);
        }
        this.f64130c.sendMessageDelayed(messageObtain, unit.toMillis(delay));
        return runnableC9818b;
    }
}
