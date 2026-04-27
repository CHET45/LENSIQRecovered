package p000;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.media3.exoplayer.offline.C1247b;
import androidx.media3.exoplayer.offline.C1248c;
import androidx.media3.exoplayer.offline.DownloadRequest;
import androidx.media3.exoplayer.offline.InterfaceC1250e;
import java.io.IOException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import p000.e6d;
import p000.gh3;
import p000.ll1;
import p000.nt3;
import p000.una;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class e6d {

    /* JADX INFO: renamed from: i */
    @fdi
    public static final int f31908i = 5;

    /* JADX INFO: renamed from: a */
    public final nfa f31909a;

    /* JADX INFO: renamed from: b */
    @hib
    public final una.InterfaceC13611a f31910b;

    /* JADX INFO: renamed from: c */
    public final C1248c.d f31911c;

    /* JADX INFO: renamed from: d */
    public final gn4 f31912d;

    /* JADX INFO: renamed from: e */
    @hib
    public final InterfaceC5143d f31913e;

    /* JADX INFO: renamed from: f */
    public final Handler f31914f;

    /* JADX INFO: renamed from: g */
    public final Handler f31915g = t0i.createHandlerForCurrentOrMainLooper();

    /* JADX INFO: renamed from: h */
    @hib
    public C5141b f31916h;

    /* JADX INFO: renamed from: e6d$b */
    public final class C5141b implements C1248c.b {

        /* JADX INFO: renamed from: a */
        public final Object f31917a;

        /* JADX INFO: renamed from: b */
        public final long f31918b;

        /* JADX INFO: renamed from: c */
        public final long f31919c;

        /* JADX INFO: renamed from: d */
        @hib
        public final C5144e f31920d;

        /* JADX INFO: renamed from: e */
        public final C1248c f31921e;

        /* JADX INFO: renamed from: f */
        public boolean f31922f;

        /* JADX INFO: renamed from: g */
        @hib
        public DownloadRequest f31923g;

        /* JADX INFO: renamed from: h */
        @hib
        public InterfaceC1250e f31924h;

        /* JADX INFO: renamed from: i */
        @hib
        public C5146g f31925i;

        /* JADX INFO: renamed from: j */
        @xc7("lock")
        public boolean f31926j;

        public C5141b(long j, long j2) {
            v80.checkState(Looper.myLooper() == e6d.this.f31914f.getLooper());
            this.f31917a = new Object();
            this.f31918b = j;
            this.f31919c = j2;
            if (e6d.this.f31910b != null) {
                this.f31920d = null;
                this.f31921e = e6d.this.f31911c.create(e6d.this.f31910b.createMediaSource(e6d.this.f31909a));
            } else {
                C5144e c5144e = new C5144e(e6d.this.f31914f);
                this.f31920d = c5144e;
                e6d.this.f31911c.setLoadExecutor(c5144e);
                this.f31921e = e6d.this.f31911c.create(e6d.this.f31909a);
                c5144e.setDownloadCallback(this);
            }
            this.f31922f = true;
            this.f31921e.prepare(this);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$notifyListeners$6(qu2 qu2Var) {
            synchronized (this.f31917a) {
                try {
                    if (this.f31926j) {
                        return;
                    }
                    if (e6d.this.f31913e != null) {
                        qu2Var.accept(e6d.this.f31913e);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onDownloadProgress$4(C5146g c5146g, InterfaceC5143d interfaceC5143d) {
            interfaceC5143d.onPreCacheProgress(e6d.this.f31909a, c5146g.f31948m, c5146g.f31940C, c5146g.f31941F);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onDownloadProgress$5(final C5146g c5146g) {
            if (c5146g != this.f31925i) {
                return;
            }
            notifyListeners(new qu2() { // from class: k6d
                @Override // p000.qu2
                public final void accept(Object obj) {
                    this.f52687a.lambda$onDownloadProgress$4(c5146g, (e6d.InterfaceC5143d) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onDownloadStopped$2(IOException iOException, InterfaceC5143d interfaceC5143d) {
            interfaceC5143d.onDownloadError(e6d.this.f31909a, iOException);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onDownloadStopped$3(C5146g c5146g) {
            if (c5146g != this.f31925i) {
                return;
            }
            this.f31925i = null;
            final IOException iOException = c5146g.f31947f;
            if (c5146g.f31943b || iOException == null) {
                return;
            }
            notifyListeners(new qu2() { // from class: f6d
                @Override // p000.qu2
                public final void accept(Object obj) {
                    this.f35498a.lambda$onDownloadStopped$2(iOException, (e6d.InterfaceC5143d) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onPrepareError$1(IOException iOException, InterfaceC5143d interfaceC5143d) {
            interfaceC5143d.onPrepareError(e6d.this.f31909a, iOException);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onPrepared$0(nfa nfaVar, InterfaceC5143d interfaceC5143d) {
            interfaceC5143d.onPrepared(e6d.this.f31909a, nfaVar);
        }

        private void notifyListeners(final qu2<InterfaceC5143d> qu2Var) {
            e6d.this.f31915g.post(new Runnable() { // from class: h6d
                @Override // java.lang.Runnable
                public final void run() {
                    this.f42506a.lambda$notifyListeners$6(qu2Var);
                }
            });
        }

        public void cancel(boolean z) {
            v80.checkState(Looper.myLooper() == e6d.this.f31914f.getLooper());
            synchronized (this.f31917a) {
                this.f31926j = true;
            }
            this.f31923g = null;
            this.f31921e.release();
            C5146g c5146g = this.f31925i;
            if (c5146g == null || !c5146g.f31943b) {
                C5146g c5146g2 = this.f31925i;
                if (c5146g2 != null) {
                    c5146g2.cancel();
                }
                if (!z || this.f31924h == null) {
                    return;
                }
                C5146g c5146g3 = new C5146g(this.f31924h, true, 5, this);
                this.f31925i = c5146g3;
                c5146g3.start();
            }
        }

        public boolean isReusable(long j, long j2) {
            C5146g c5146g;
            boolean z = false;
            v80.checkState(Looper.myLooper() == e6d.this.f31914f.getLooper());
            synchronized (this.f31917a) {
                try {
                    if (!this.f31926j && j == this.f31918b && j2 == this.f31919c && (this.f31922f || ((c5146g = this.f31925i) != null && !c5146g.f31943b))) {
                        z = true;
                    }
                } finally {
                }
            }
            return z;
        }

        public void maybeSubmitPendingDownloadRequest() {
            v80.checkState(Looper.myLooper() == e6d.this.f31914f.getLooper());
            if (this.f31923g != null) {
                this.f31924h = e6d.this.f31912d.createDownloader(this.f31923g);
                C5146g c5146g = new C5146g(this.f31924h, false, 5, this);
                this.f31925i = c5146g;
                c5146g.start();
                this.f31923g = null;
            }
        }

        public void onDownloadProgress(final C5146g c5146g) {
            e6d.this.f31914f.post(new Runnable() { // from class: i6d
                @Override // java.lang.Runnable
                public final void run() {
                    this.f45855a.lambda$onDownloadProgress$5(c5146g);
                }
            });
        }

        public void onDownloadStopped(final C5146g c5146g) {
            e6d.this.f31914f.post(new Runnable() { // from class: l6d
                @Override // java.lang.Runnable
                public final void run() {
                    this.f56347a.lambda$onDownloadStopped$3(c5146g);
                }
            });
        }

        @Override // androidx.media3.exoplayer.offline.C1248c.b
        public void onPrepareError(C1248c c1248c, final IOException iOException) {
            v80.checkState(Looper.myLooper() == e6d.this.f31914f.getLooper());
            v80.checkState(c1248c == this.f31921e);
            this.f31922f = false;
            this.f31921e.release();
            notifyListeners(new qu2() { // from class: j6d
                @Override // p000.qu2
                public final void accept(Object obj) {
                    this.f49648a.lambda$onPrepareError$1(iOException, (e6d.InterfaceC5143d) obj);
                }
            });
        }

        @Override // androidx.media3.exoplayer.offline.C1248c.b
        public void onPrepared(C1248c c1248c, boolean z) {
            v80.checkState(Looper.myLooper() == e6d.this.f31914f.getLooper());
            v80.checkState(c1248c == this.f31921e);
            this.f31922f = false;
            DownloadRequest downloadRequest = c1248c.getDownloadRequest(null, this.f31918b, this.f31919c);
            this.f31921e.release();
            final nfa mediaItem = downloadRequest.toMediaItem(e6d.this.f31909a.buildUpon());
            notifyListeners(new qu2() { // from class: g6d
                @Override // p000.qu2
                public final void accept(Object obj) {
                    this.f38899a.lambda$onPrepared$0(mediaItem, (e6d.InterfaceC5143d) obj);
                }
            });
            this.f31923g = downloadRequest;
            C5144e c5144e = this.f31920d;
            if (c5144e == null || c5144e.wereExecutorsReleased()) {
                maybeSubmitPendingDownloadRequest();
            }
        }
    }

    /* JADX INFO: renamed from: e6d$d */
    public interface InterfaceC5143d {
        default void onDownloadError(nfa nfaVar, IOException iOException) {
        }

        default void onPreCacheProgress(nfa nfaVar, long j, long j2, float f) {
        }

        default void onPrepareError(nfa nfaVar, IOException iOException) {
        }

        default void onPrepared(nfa nfaVar, nfa nfaVar2) {
        }
    }

    /* JADX INFO: renamed from: e6d$e */
    public static final class C5144e implements lfg<yxd> {

        /* JADX INFO: renamed from: a */
        public final Handler f31935a;

        /* JADX INFO: renamed from: b */
        public C5141b f31936b;

        /* JADX INFO: renamed from: c */
        @xc7("this")
        public int f31937c;

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onExecutorReleased$0() {
            v80.checkState(wereExecutorsReleased());
            C5141b c5141b = this.f31936b;
            if (c5141b != null) {
                c5141b.maybeSubmitPendingDownloadRequest();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void onExecutorReleased() {
            synchronized (this) {
                try {
                    v80.checkState(this.f31937c > 0);
                    this.f31937c--;
                    if (wereExecutorsReleased()) {
                        this.f31935a.post(new Runnable() { // from class: m6d
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f60019a.lambda$onExecutorReleased$0();
                            }
                        });
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void setDownloadCallback(C5141b c5141b) {
            this.f31936b = c5141b;
        }

        public boolean wereExecutorsReleased() {
            boolean z;
            synchronized (this) {
                z = this.f31937c == 0;
            }
            return z;
        }

        private C5144e(Handler handler) {
            this.f31935a = handler;
        }

        @Override // p000.lfg
        public yxd get() {
            synchronized (this) {
                this.f31937c++;
            }
            return new C5145f(new Runnable() { // from class: n6d
                @Override // java.lang.Runnable
                public final void run() {
                    this.f63399a.onExecutorReleased();
                }
            });
        }
    }

    /* JADX INFO: renamed from: e6d$f */
    public static final class C5145f implements yxd {

        /* JADX INFO: renamed from: a */
        public final ExecutorService f31938a;

        /* JADX INFO: renamed from: b */
        public final Runnable f31939b;

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f31938a.execute(runnable);
        }

        @Override // p000.yxd
        public void release() {
            execute(this.f31939b);
            this.f31938a.shutdown();
        }

        private C5145f(Runnable runnable) {
            this.f31938a = t0i.newSingleThreadExecutor("PreCacheHelper:Loader");
            this.f31939b = runnable;
        }
    }

    /* JADX INFO: renamed from: e6d$g */
    public static class C5146g extends Thread implements InterfaceC1250e.a {

        /* JADX INFO: renamed from: C */
        public volatile long f31940C;

        /* JADX INFO: renamed from: F */
        public volatile float f31941F;

        /* JADX INFO: renamed from: a */
        public final InterfaceC1250e f31942a;

        /* JADX INFO: renamed from: b */
        public final boolean f31943b;

        /* JADX INFO: renamed from: c */
        public final int f31944c;

        /* JADX INFO: renamed from: d */
        @hib
        public C5141b f31945d;

        /* JADX INFO: renamed from: e */
        public volatile boolean f31946e;

        /* JADX INFO: renamed from: f */
        @hib
        public volatile IOException f31947f;

        /* JADX INFO: renamed from: m */
        public volatile long f31948m;

        private static int getRetryDelayMillis(int i) {
            return Math.min((i - 1) * 1000, 5000);
        }

        public void cancel() {
            this.f31945d = null;
            if (this.f31946e) {
                return;
            }
            this.f31946e = true;
            this.f31942a.cancel();
            interrupt();
        }

        @Override // androidx.media3.exoplayer.offline.InterfaceC1250e.a
        public void onProgress(long j, long j2, float f) {
            this.f31948m = j;
            this.f31940C = j2;
            this.f31941F = f;
            C5141b c5141b = this.f31945d;
            if (c5141b != null) {
                c5141b.onDownloadProgress(this);
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                try {
                    if (this.f31943b) {
                        this.f31942a.remove();
                    } else {
                        long j = -1;
                        int i = 0;
                        while (!this.f31946e) {
                            try {
                                this.f31942a.download(this);
                                break;
                            } catch (IOException e) {
                                if (!this.f31946e) {
                                    if (this.f31940C != j) {
                                        j = this.f31940C;
                                        i = 0;
                                    }
                                    i++;
                                    if (i > this.f31944c) {
                                        throw e;
                                    }
                                    Thread.sleep(getRetryDelayMillis(i));
                                }
                            }
                        }
                    }
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                } catch (CancellationException unused2) {
                }
            } catch (IOException e2) {
                this.f31947f = e2;
            }
            C5141b c5141b = this.f31945d;
            if (c5141b != null) {
                c5141b.onDownloadStopped(this);
            }
        }

        private C5146g(InterfaceC1250e interfaceC1250e, boolean z, int i, C5141b c5141b) {
            this.f31942a = interfaceC1250e;
            this.f31943b = z;
            this.f31944c = i;
            this.f31945d = c5141b;
            this.f31948m = -1L;
        }
    }

    public e6d(nfa nfaVar, @hib una.InterfaceC13611a interfaceC13611a, C1248c.d dVar, gn4 gn4Var, Looper looper, @hib InterfaceC5143d interfaceC5143d) {
        this.f31909a = nfaVar;
        this.f31910b = interfaceC13611a;
        this.f31911c = dVar;
        this.f31912d = gn4Var;
        this.f31913e = interfaceC5143d;
        this.f31914f = t0i.createHandler(looper, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$preCache$0(long j, long j2) {
        C5141b c5141b = this.f31916h;
        if (c5141b == null || !c5141b.isReusable(j, j2)) {
            C5141b c5141b2 = this.f31916h;
            if (c5141b2 != null) {
                c5141b2.cancel(false);
            }
            this.f31916h = new C5141b(j, j2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$release$2(boolean z) {
        C5141b c5141b = this.f31916h;
        if (c5141b != null) {
            c5141b.cancel(z);
            this.f31916h = null;
        }
        this.f31914f.removeCallbacksAndMessages(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$stop$1() {
        C5141b c5141b = this.f31916h;
        if (c5141b != null) {
            c5141b.cancel(false);
        }
    }

    public void preCache(final long j, final long j2) {
        this.f31914f.post(new Runnable() { // from class: c6d
            @Override // java.lang.Runnable
            public final void run() {
                this.f15852a.lambda$preCache$0(j, j2);
            }
        });
    }

    public void release(final boolean z) {
        this.f31914f.post(new Runnable() { // from class: d6d
            @Override // java.lang.Runnable
            public final void run() {
                this.f28557a.lambda$release$2(z);
            }
        });
    }

    public void stop() {
        this.f31914f.post(new Runnable() { // from class: b6d
            @Override // java.lang.Runnable
            public final void run() {
                this.f12803a.lambda$stop$1();
            }
        });
    }

    /* JADX INFO: renamed from: e6d$c */
    public static final class C5142c {

        /* JADX INFO: renamed from: a */
        public final cl1 f31928a;

        /* JADX INFO: renamed from: b */
        public final Looper f31929b;

        /* JADX INFO: renamed from: c */
        public final gh3.InterfaceC6313a f31930c;

        /* JADX INFO: renamed from: d */
        public final v1e f31931d;

        /* JADX INFO: renamed from: e */
        public h7h f31932e = h7h.f42758F;

        /* JADX INFO: renamed from: f */
        public Executor f31933f = new p63();

        /* JADX INFO: renamed from: g */
        @hib
        public InterfaceC5143d f31934g;

        public C5142c(Context context, cl1 cl1Var, Looper looper) {
            this.f31928a = cl1Var;
            this.f31929b = looper;
            this.f31930c = new nt3.C10051a(context);
            this.f31931d = new yy3(context);
        }

        public e6d create(nfa nfaVar) {
            ll1.C8878d cache = new ll1.C8878d().setUpstreamDataSourceFactory(this.f31930c).setCache(this.f31928a);
            return new e6d(nfaVar, null, new C1248c.d().setDataSourceFactory(cache).setRenderersFactory(this.f31931d).setTrackSelectionParameters(this.f31932e), new C1247b(cache, this.f31933f), this.f31929b, this.f31934g);
        }

        @op1
        public C5142c setDownloadExecutor(Executor executor) {
            this.f31933f = executor;
            return this;
        }

        @op1
        public C5142c setListener(@hib InterfaceC5143d interfaceC5143d) {
            this.f31934g = interfaceC5143d;
            return this;
        }

        @op1
        public C5142c setTrackSelectionParameters(h7h h7hVar) {
            this.f31932e = h7hVar;
            return this;
        }

        public C5142c(Context context, cl1 cl1Var, v1e v1eVar, Looper looper) {
            this.f31928a = cl1Var;
            this.f31929b = looper;
            this.f31930c = new nt3.C10051a(context);
            this.f31931d = v1eVar;
        }

        public C5142c(Context context, cl1 cl1Var, gh3.InterfaceC6313a interfaceC6313a, Looper looper) {
            this.f31928a = cl1Var;
            this.f31929b = looper;
            this.f31930c = interfaceC6313a;
            this.f31931d = new yy3(context);
        }

        public C5142c(cl1 cl1Var, gh3.InterfaceC6313a interfaceC6313a, v1e v1eVar, Looper looper) {
            this.f31928a = cl1Var;
            this.f31929b = looper;
            this.f31930c = interfaceC6313a;
            this.f31931d = v1eVar;
        }
    }
}
