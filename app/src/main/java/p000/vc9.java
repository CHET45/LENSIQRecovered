package p000;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class vc9 implements xc9 {

    /* JADX INFO: renamed from: d */
    public static final String f90617d = "ExoPlayer:Loader:";

    /* JADX INFO: renamed from: e */
    public static final int f90618e = 0;

    /* JADX INFO: renamed from: f */
    public static final int f90619f = 1;

    /* JADX INFO: renamed from: g */
    public static final int f90620g = 2;

    /* JADX INFO: renamed from: h */
    public static final int f90621h = 3;

    /* JADX INFO: renamed from: i */
    public static final C13995c f90622i = createRetryAction(false, -9223372036854775807L);

    /* JADX INFO: renamed from: j */
    public static final C13995c f90623j = createRetryAction(true, -9223372036854775807L);

    /* JADX INFO: renamed from: k */
    public static final C13995c f90624k;

    /* JADX INFO: renamed from: l */
    public static final C13995c f90625l;

    /* JADX INFO: renamed from: a */
    public final ExecutorService f90626a;

    /* JADX INFO: renamed from: b */
    @hib
    public HandlerC13996d<? extends InterfaceC13997e> f90627b;

    /* JADX INFO: renamed from: c */
    @hib
    public IOException f90628c;

    /* JADX INFO: renamed from: vc9$b */
    public interface InterfaceC13994b<T extends InterfaceC13997e> {
        void onLoadCanceled(T t, long j, long j2, boolean z);

        void onLoadCompleted(T t, long j, long j2);

        C13995c onLoadError(T t, long j, long j2, IOException iOException, int i);
    }

    /* JADX INFO: renamed from: vc9$c */
    public static final class C13995c {

        /* JADX INFO: renamed from: a */
        public final int f90629a;

        /* JADX INFO: renamed from: b */
        public final long f90630b;

        public boolean isRetry() {
            int i = this.f90629a;
            return i == 0 || i == 1;
        }

        private C13995c(int i, long j) {
            this.f90629a = i;
            this.f90630b = j;
        }
    }

    /* JADX INFO: renamed from: vc9$d */
    @igg({"HandlerLeak"})
    public final class HandlerC13996d<T extends InterfaceC13997e> extends Handler implements Runnable {

        /* JADX INFO: renamed from: L */
        public static final String f90631L = "LoadTask";

        /* JADX INFO: renamed from: M */
        public static final int f90632M = 0;

        /* JADX INFO: renamed from: N */
        public static final int f90633N = 1;

        /* JADX INFO: renamed from: Q */
        public static final int f90634Q = 2;

        /* JADX INFO: renamed from: X */
        public static final int f90635X = 3;

        /* JADX INFO: renamed from: C */
        public boolean f90636C;

        /* JADX INFO: renamed from: F */
        public volatile boolean f90637F;

        /* JADX INFO: renamed from: a */
        public final int f90639a;

        /* JADX INFO: renamed from: b */
        public final T f90640b;

        /* JADX INFO: renamed from: c */
        public final long f90641c;

        /* JADX INFO: renamed from: d */
        @hib
        public InterfaceC13994b<T> f90642d;

        /* JADX INFO: renamed from: e */
        @hib
        public IOException f90643e;

        /* JADX INFO: renamed from: f */
        public int f90644f;

        /* JADX INFO: renamed from: m */
        @hib
        public Thread f90645m;

        public HandlerC13996d(Looper looper, T t, InterfaceC13994b<T> interfaceC13994b, int i, long j) {
            super(looper);
            this.f90640b = t;
            this.f90642d = interfaceC13994b;
            this.f90639a = i;
            this.f90641c = j;
        }

        private void execute() {
            this.f90643e = null;
            vc9.this.f90626a.execute((Runnable) u80.checkNotNull(vc9.this.f90627b));
        }

        private void finish() {
            vc9.this.f90627b = null;
        }

        private long getRetryDelayMillis() {
            return Math.min((this.f90644f - 1) * 1000, 5000);
        }

        public void cancel(boolean z) {
            this.f90637F = z;
            this.f90643e = null;
            if (hasMessages(0)) {
                this.f90636C = true;
                removeMessages(0);
                if (!z) {
                    sendEmptyMessage(1);
                }
            } else {
                synchronized (this) {
                    try {
                        this.f90636C = true;
                        this.f90640b.cancelLoad();
                        Thread thread = this.f90645m;
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
                ((InterfaceC13994b) u80.checkNotNull(this.f90642d)).onLoadCanceled(this.f90640b, jElapsedRealtime, jElapsedRealtime - this.f90641c, true);
                this.f90642d = null;
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (this.f90637F) {
                return;
            }
            int i = message.what;
            if (i == 0) {
                execute();
                return;
            }
            if (i == 3) {
                throw ((Error) message.obj);
            }
            finish();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j = jElapsedRealtime - this.f90641c;
            InterfaceC13994b interfaceC13994b = (InterfaceC13994b) u80.checkNotNull(this.f90642d);
            if (this.f90636C) {
                interfaceC13994b.onLoadCanceled(this.f90640b, jElapsedRealtime, j, false);
                return;
            }
            int i2 = message.what;
            if (i2 == 1) {
                try {
                    interfaceC13994b.onLoadCompleted(this.f90640b, jElapsedRealtime, j);
                    return;
                } catch (RuntimeException e) {
                    yh9.m25916e("LoadTask", "Unexpected exception handling load completed", e);
                    vc9.this.f90628c = new C14000h(e);
                    return;
                }
            }
            if (i2 != 2) {
                return;
            }
            IOException iOException = (IOException) message.obj;
            this.f90643e = iOException;
            int i3 = this.f90644f + 1;
            this.f90644f = i3;
            C13995c c13995cOnLoadError = interfaceC13994b.onLoadError(this.f90640b, jElapsedRealtime, j, iOException, i3);
            if (c13995cOnLoadError.f90629a == 3) {
                vc9.this.f90628c = this.f90643e;
            } else if (c13995cOnLoadError.f90629a != 2) {
                if (c13995cOnLoadError.f90629a == 1) {
                    this.f90644f = 1;
                }
                start(c13995cOnLoadError.f90630b != -9223372036854775807L ? c13995cOnLoadError.f90630b : getRetryDelayMillis());
            }
        }

        public void maybeThrowError(int i) throws IOException {
            IOException iOException = this.f90643e;
            if (iOException != null && this.f90644f > i) {
                throw iOException;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z;
            try {
                synchronized (this) {
                    z = this.f90636C;
                    this.f90645m = Thread.currentThread();
                }
                if (!z) {
                    w5h.beginSection("load:" + this.f90640b.getClass().getSimpleName());
                    try {
                        this.f90640b.load();
                        w5h.endSection();
                    } catch (Throwable th) {
                        w5h.endSection();
                        throw th;
                    }
                }
                synchronized (this) {
                    this.f90645m = null;
                    Thread.interrupted();
                }
                if (this.f90637F) {
                    return;
                }
                sendEmptyMessage(1);
            } catch (IOException e) {
                if (this.f90637F) {
                    return;
                }
                obtainMessage(2, e).sendToTarget();
            } catch (Exception e2) {
                if (this.f90637F) {
                    return;
                }
                yh9.m25916e("LoadTask", "Unexpected exception loading stream", e2);
                obtainMessage(2, new C14000h(e2)).sendToTarget();
            } catch (OutOfMemoryError e3) {
                if (this.f90637F) {
                    return;
                }
                yh9.m25916e("LoadTask", "OutOfMemory error loading stream", e3);
                obtainMessage(2, new C14000h(e3)).sendToTarget();
            } catch (Error e4) {
                if (!this.f90637F) {
                    yh9.m25916e("LoadTask", "Unexpected error loading stream", e4);
                    obtainMessage(3, e4).sendToTarget();
                }
                throw e4;
            }
        }

        public void start(long j) {
            u80.checkState(vc9.this.f90627b == null);
            vc9.this.f90627b = this;
            if (j > 0) {
                sendEmptyMessageDelayed(0, j);
            } else {
                execute();
            }
        }
    }

    /* JADX INFO: renamed from: vc9$e */
    public interface InterfaceC13997e {
        void cancelLoad();

        void load() throws IOException;
    }

    /* JADX INFO: renamed from: vc9$f */
    public interface InterfaceC13998f {
        void onLoaderReleased();
    }

    /* JADX INFO: renamed from: vc9$g */
    public static final class RunnableC13999g implements Runnable {

        /* JADX INFO: renamed from: a */
        public final InterfaceC13998f f90646a;

        public RunnableC13999g(InterfaceC13998f interfaceC13998f) {
            this.f90646a = interfaceC13998f;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f90646a.onLoaderReleased();
        }
    }

    /* JADX INFO: renamed from: vc9$h */
    public static final class C14000h extends IOException {
        public C14000h(Throwable th) {
            super("Unexpected " + th.getClass().getSimpleName() + ": " + th.getMessage(), th);
        }
    }

    static {
        long j = -9223372036854775807L;
        f90624k = new C13995c(2, j);
        f90625l = new C13995c(3, j);
    }

    public vc9(String str) {
        this.f90626a = x0i.newSingleThreadExecutor("ExoPlayer:Loader:" + str);
    }

    public static C13995c createRetryAction(boolean z, long j) {
        return new C13995c(z ? 1 : 0, j);
    }

    public void cancelLoading() {
        ((HandlerC13996d) u80.checkStateNotNull(this.f90627b)).cancel(false);
    }

    public void clearFatalError() {
        this.f90628c = null;
    }

    public boolean hasFatalError() {
        return this.f90628c != null;
    }

    public boolean isLoading() {
        return this.f90627b != null;
    }

    @Override // p000.xc9
    public void maybeThrowError() throws IOException {
        maybeThrowError(Integer.MIN_VALUE);
    }

    public void release() {
        release(null);
    }

    public <T extends InterfaceC13997e> long startLoading(T t, InterfaceC13994b<T> interfaceC13994b, int i) {
        Looper looper = (Looper) u80.checkStateNotNull(Looper.myLooper());
        this.f90628c = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        new HandlerC13996d(looper, t, interfaceC13994b, i, jElapsedRealtime).start(0L);
        return jElapsedRealtime;
    }

    @Override // p000.xc9
    public void maybeThrowError(int i) throws IOException {
        IOException iOException = this.f90628c;
        if (iOException != null) {
            throw iOException;
        }
        HandlerC13996d<? extends InterfaceC13997e> handlerC13996d = this.f90627b;
        if (handlerC13996d != null) {
            if (i == Integer.MIN_VALUE) {
                i = handlerC13996d.f90639a;
            }
            handlerC13996d.maybeThrowError(i);
        }
    }

    public void release(@hib InterfaceC13998f interfaceC13998f) {
        HandlerC13996d<? extends InterfaceC13997e> handlerC13996d = this.f90627b;
        if (handlerC13996d != null) {
            handlerC13996d.cancel(true);
        }
        if (interfaceC13998f != null) {
            this.f90626a.execute(new RunnableC13999g(interfaceC13998f));
        }
        this.f90626a.shutdown();
    }
}
