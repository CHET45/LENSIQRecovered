package p000;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class uc9 implements wc9 {

    /* JADX INFO: renamed from: d */
    public static final String f87546d = "ExoPlayer:Loader:";

    /* JADX INFO: renamed from: e */
    public static final int f87547e = 0;

    /* JADX INFO: renamed from: f */
    public static final int f87548f = 1;

    /* JADX INFO: renamed from: g */
    public static final int f87549g = 2;

    /* JADX INFO: renamed from: h */
    public static final int f87550h = 3;

    /* JADX INFO: renamed from: i */
    public static final C13491c f87551i = createRetryAction(false, -9223372036854775807L);

    /* JADX INFO: renamed from: j */
    public static final C13491c f87552j = createRetryAction(true, -9223372036854775807L);

    /* JADX INFO: renamed from: k */
    public static final C13491c f87553k;

    /* JADX INFO: renamed from: l */
    public static final C13491c f87554l;

    /* JADX INFO: renamed from: a */
    public final yxd f87555a;

    /* JADX INFO: renamed from: b */
    @hib
    public HandlerC13492d<? extends InterfaceC13493e> f87556b;

    /* JADX INFO: renamed from: c */
    @hib
    public IOException f87557c;

    /* JADX INFO: renamed from: uc9$b */
    public interface InterfaceC13490b<T extends InterfaceC13493e> {
        void onLoadCanceled(T t, long j, long j2, boolean z);

        void onLoadCompleted(T t, long j, long j2);

        C13491c onLoadError(T t, long j, long j2, IOException iOException, int i);

        default void onLoadStarted(T t, long j, long j2, int i) {
        }
    }

    /* JADX INFO: renamed from: uc9$c */
    public static final class C13491c {

        /* JADX INFO: renamed from: a */
        public final int f87558a;

        /* JADX INFO: renamed from: b */
        public final long f87559b;

        public boolean isRetry() {
            int i = this.f87558a;
            return i == 0 || i == 1;
        }

        private C13491c(int i, long j) {
            this.f87558a = i;
            this.f87559b = j;
        }
    }

    /* JADX INFO: renamed from: uc9$d */
    @igg({"HandlerLeak"})
    public final class HandlerC13492d<T extends InterfaceC13493e> extends Handler implements Runnable {

        /* JADX INFO: renamed from: L */
        public static final String f87560L = "LoadTask";

        /* JADX INFO: renamed from: M */
        public static final int f87561M = 1;

        /* JADX INFO: renamed from: N */
        public static final int f87562N = 2;

        /* JADX INFO: renamed from: Q */
        public static final int f87563Q = 3;

        /* JADX INFO: renamed from: X */
        public static final int f87564X = 4;

        /* JADX INFO: renamed from: C */
        public boolean f87565C;

        /* JADX INFO: renamed from: F */
        public volatile boolean f87566F;

        /* JADX INFO: renamed from: a */
        public final int f87568a;

        /* JADX INFO: renamed from: b */
        public final T f87569b;

        /* JADX INFO: renamed from: c */
        public final long f87570c;

        /* JADX INFO: renamed from: d */
        @hib
        public InterfaceC13490b<T> f87571d;

        /* JADX INFO: renamed from: e */
        @hib
        public IOException f87572e;

        /* JADX INFO: renamed from: f */
        public int f87573f;

        /* JADX INFO: renamed from: m */
        @hib
        public Thread f87574m;

        public HandlerC13492d(Looper looper, T t, InterfaceC13490b<T> interfaceC13490b, int i, long j) {
            super(looper);
            this.f87569b = t;
            this.f87571d = interfaceC13490b;
            this.f87568a = i;
            this.f87570c = j;
        }

        private void execute() {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            ((InterfaceC13490b) v80.checkNotNull(this.f87571d)).onLoadStarted(this.f87569b, jElapsedRealtime, jElapsedRealtime - this.f87570c, this.f87573f);
            this.f87572e = null;
            uc9.this.f87555a.execute((Runnable) v80.checkNotNull(uc9.this.f87556b));
        }

        private void finish() {
            uc9.this.f87556b = null;
        }

        private long getRetryDelayMillis() {
            return Math.min((this.f87573f - 1) * 1000, 5000);
        }

        public void cancel(boolean z) {
            this.f87566F = z;
            this.f87572e = null;
            if (hasMessages(1)) {
                this.f87565C = true;
                removeMessages(1);
                if (!z) {
                    sendEmptyMessage(2);
                }
            } else {
                synchronized (this) {
                    try {
                        this.f87565C = true;
                        this.f87569b.cancelLoad();
                        Thread thread = this.f87574m;
                        if (thread != null) {
                            thread.interrupt();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            if (z) {
                finish();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                ((InterfaceC13490b) v80.checkNotNull(this.f87571d)).onLoadCanceled(this.f87569b, jElapsedRealtime, jElapsedRealtime - this.f87570c, true);
                this.f87571d = null;
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (this.f87566F) {
                return;
            }
            int i = message.what;
            if (i == 1) {
                execute();
                return;
            }
            if (i == 4) {
                throw ((Error) message.obj);
            }
            finish();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j = jElapsedRealtime - this.f87570c;
            InterfaceC13490b interfaceC13490b = (InterfaceC13490b) v80.checkNotNull(this.f87571d);
            if (this.f87565C) {
                interfaceC13490b.onLoadCanceled(this.f87569b, jElapsedRealtime, j, false);
                return;
            }
            int i2 = message.what;
            if (i2 == 2) {
                try {
                    interfaceC13490b.onLoadCompleted(this.f87569b, jElapsedRealtime, j);
                    return;
                } catch (RuntimeException e) {
                    xh9.m25145e("LoadTask", "Unexpected exception handling load completed", e);
                    uc9.this.f87557c = new C13496h(e);
                    return;
                }
            }
            if (i2 != 3) {
                return;
            }
            IOException iOException = (IOException) message.obj;
            this.f87572e = iOException;
            int i3 = this.f87573f + 1;
            this.f87573f = i3;
            C13491c c13491cOnLoadError = interfaceC13490b.onLoadError(this.f87569b, jElapsedRealtime, j, iOException, i3);
            if (c13491cOnLoadError.f87558a == 3) {
                uc9.this.f87557c = this.f87572e;
            } else if (c13491cOnLoadError.f87558a != 2) {
                if (c13491cOnLoadError.f87558a == 1) {
                    this.f87573f = 1;
                }
                start(c13491cOnLoadError.f87559b != -9223372036854775807L ? c13491cOnLoadError.f87559b : getRetryDelayMillis());
            }
        }

        public void maybeThrowError(int i) throws IOException {
            IOException iOException = this.f87572e;
            if (iOException != null && this.f87573f > i) {
                throw iOException;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z;
            try {
                synchronized (this) {
                    z = this.f87565C;
                    this.f87574m = Thread.currentThread();
                }
                if (!z) {
                    x5h.beginSection("load:" + this.f87569b.getClass().getSimpleName());
                    try {
                        this.f87569b.load();
                        x5h.endSection();
                    } catch (Throwable th) {
                        x5h.endSection();
                        throw th;
                    }
                }
                synchronized (this) {
                    this.f87574m = null;
                    Thread.interrupted();
                }
                if (this.f87566F) {
                    return;
                }
                sendEmptyMessage(2);
            } catch (IOException e) {
                if (this.f87566F) {
                    return;
                }
                obtainMessage(3, e).sendToTarget();
            } catch (Exception e2) {
                if (this.f87566F) {
                    return;
                }
                xh9.m25145e("LoadTask", "Unexpected exception loading stream", e2);
                obtainMessage(3, new C13496h(e2)).sendToTarget();
            } catch (OutOfMemoryError e3) {
                if (this.f87566F) {
                    return;
                }
                xh9.m25145e("LoadTask", "OutOfMemory error loading stream", e3);
                obtainMessage(3, new C13496h(e3)).sendToTarget();
            } catch (Error e4) {
                if (!this.f87566F) {
                    xh9.m25145e("LoadTask", "Unexpected error loading stream", e4);
                    obtainMessage(4, e4).sendToTarget();
                }
                throw e4;
            }
        }

        public void start(long j) {
            v80.checkState(uc9.this.f87556b == null);
            uc9.this.f87556b = this;
            if (j > 0) {
                sendEmptyMessageDelayed(1, j);
            } else {
                execute();
            }
        }
    }

    /* JADX INFO: renamed from: uc9$e */
    public interface InterfaceC13493e {
        void cancelLoad();

        void load() throws IOException;
    }

    /* JADX INFO: renamed from: uc9$f */
    public interface InterfaceC13494f {
        void onLoaderReleased();
    }

    /* JADX INFO: renamed from: uc9$g */
    public static final class RunnableC13495g implements Runnable {

        /* JADX INFO: renamed from: a */
        public final InterfaceC13494f f87575a;

        public RunnableC13495g(InterfaceC13494f interfaceC13494f) {
            this.f87575a = interfaceC13494f;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f87575a.onLoaderReleased();
        }
    }

    /* JADX INFO: renamed from: uc9$h */
    public static final class C13496h extends IOException {
        public C13496h(Throwable th) {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append("Unexpected ");
            sb.append(th.getClass().getSimpleName());
            if (th.getMessage() != null) {
                str = ": " + th.getMessage();
            } else {
                str = "";
            }
            sb.append(str);
            super(sb.toString(), th);
        }
    }

    static {
        long j = -9223372036854775807L;
        f87553k = new C13491c(2, j);
        f87554l = new C13491c(3, j);
    }

    public uc9(String str) {
        this(yxd.from(t0i.newSingleThreadExecutor("ExoPlayer:Loader:" + str), new qu2() { // from class: sc9
            @Override // p000.qu2
            public final void accept(Object obj) {
                ((ExecutorService) obj).shutdown();
            }
        }));
    }

    public static C13491c createRetryAction(boolean z, long j) {
        return new C13491c(z ? 1 : 0, j);
    }

    public void cancelLoading() {
        ((HandlerC13492d) v80.checkStateNotNull(this.f87556b)).cancel(false);
    }

    public void clearFatalError() {
        this.f87557c = null;
    }

    public boolean hasFatalError() {
        return this.f87557c != null;
    }

    public boolean isLoading() {
        return this.f87556b != null;
    }

    @Override // p000.wc9
    public void maybeThrowError() throws IOException {
        maybeThrowError(Integer.MIN_VALUE);
    }

    public void release() {
        release(null);
    }

    public <T extends InterfaceC13493e> long startLoading(T t, InterfaceC13490b<T> interfaceC13490b, int i) {
        Looper looper = (Looper) v80.checkStateNotNull(Looper.myLooper());
        this.f87557c = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        new HandlerC13492d(looper, t, interfaceC13490b, i, jElapsedRealtime).start(0L);
        return jElapsedRealtime;
    }

    @Override // p000.wc9
    public void maybeThrowError(int i) throws IOException {
        IOException iOException = this.f87557c;
        if (iOException != null) {
            throw iOException;
        }
        HandlerC13492d<? extends InterfaceC13493e> handlerC13492d = this.f87556b;
        if (handlerC13492d != null) {
            if (i == Integer.MIN_VALUE) {
                i = handlerC13492d.f87568a;
            }
            handlerC13492d.maybeThrowError(i);
        }
    }

    public void release(@hib InterfaceC13494f interfaceC13494f) {
        HandlerC13492d<? extends InterfaceC13493e> handlerC13492d = this.f87556b;
        if (handlerC13492d != null) {
            handlerC13492d.cancel(true);
        }
        if (interfaceC13494f != null) {
            this.f87555a.execute(new RunnableC13495g(interfaceC13494f));
        }
        this.f87555a.release();
    }

    public uc9(yxd yxdVar) {
        this.f87555a = yxdVar;
    }
}
