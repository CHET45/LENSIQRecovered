package p000;

import android.os.Handler;
import android.os.Message;
import java.util.concurrent.TimeUnit;
import p000.voe;

/* JADX INFO: loaded from: classes7.dex */
public final class me7 extends voe {

    /* JADX INFO: renamed from: c */
    public final Handler f60756c;

    /* JADX INFO: renamed from: d */
    public final boolean f60757d;

    /* JADX INFO: renamed from: me7$a */
    public static final class C9333a extends voe.AbstractC14185c {

        /* JADX INFO: renamed from: a */
        public final Handler f60758a;

        /* JADX INFO: renamed from: b */
        public final boolean f60759b;

        /* JADX INFO: renamed from: c */
        public volatile boolean f60760c;

        public C9333a(Handler handler, boolean z) {
            this.f60758a = handler;
            this.f60759b = z;
        }

        @Override // p000.mf4
        public void dispose() {
            this.f60760c = true;
            this.f60758a.removeCallbacksAndMessages(this);
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f60760c;
        }

        @Override // p000.voe.AbstractC14185c
        @igg({"NewApi"})
        public mf4 schedule(Runnable runnable, long j, TimeUnit timeUnit) {
            if (runnable == null) {
                throw new NullPointerException("run == null");
            }
            if (timeUnit == null) {
                throw new NullPointerException("unit == null");
            }
            if (this.f60760c) {
                return pg4.disposed();
            }
            RunnableC9334b runnableC9334b = new RunnableC9334b(this.f60758a, pfe.onSchedule(runnable));
            Message messageObtain = Message.obtain(this.f60758a, runnableC9334b);
            messageObtain.obj = this;
            if (this.f60759b) {
                messageObtain.setAsynchronous(true);
            }
            this.f60758a.sendMessageDelayed(messageObtain, timeUnit.toMillis(j));
            if (!this.f60760c) {
                return runnableC9334b;
            }
            this.f60758a.removeCallbacks(runnableC9334b);
            return pg4.disposed();
        }
    }

    /* JADX INFO: renamed from: me7$b */
    public static final class RunnableC9334b implements Runnable, mf4 {

        /* JADX INFO: renamed from: a */
        public final Handler f60761a;

        /* JADX INFO: renamed from: b */
        public final Runnable f60762b;

        /* JADX INFO: renamed from: c */
        public volatile boolean f60763c;

        public RunnableC9334b(Handler handler, Runnable runnable) {
            this.f60761a = handler;
            this.f60762b = runnable;
        }

        @Override // p000.mf4
        public void dispose() {
            this.f60761a.removeCallbacks(this);
            this.f60763c = true;
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f60763c;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f60762b.run();
            } catch (Throwable th) {
                pfe.onError(th);
            }
        }
    }

    public me7(Handler handler, boolean z) {
        this.f60756c = handler;
        this.f60757d = z;
    }

    @Override // p000.voe
    public voe.AbstractC14185c createWorker() {
        return new C9333a(this.f60756c, this.f60757d);
    }

    @Override // p000.voe
    @igg({"NewApi"})
    public mf4 scheduleDirect(Runnable runnable, long j, TimeUnit timeUnit) {
        if (runnable == null) {
            throw new NullPointerException("run == null");
        }
        if (timeUnit == null) {
            throw new NullPointerException("unit == null");
        }
        RunnableC9334b runnableC9334b = new RunnableC9334b(this.f60756c, pfe.onSchedule(runnable));
        Message messageObtain = Message.obtain(this.f60756c, runnableC9334b);
        if (this.f60757d) {
            messageObtain.setAsynchronous(true);
        }
        this.f60756c.sendMessageDelayed(messageObtain, timeUnit.toMillis(j));
        return runnableC9334b;
    }
}
