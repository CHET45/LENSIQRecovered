package p000;

import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import androidx.media3.common.DrmInitData;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import p000.ar4;
import p000.hc9;
import p000.nr4;
import p000.y95;

/* JADX INFO: loaded from: classes3.dex */
public class iu3 implements ar4 {

    /* JADX INFO: renamed from: E */
    public static final String f48433E = "DefaultDrmSession";

    /* JADX INFO: renamed from: F */
    public static final int f48434F = 1;

    /* JADX INFO: renamed from: G */
    public static final int f48435G = 2;

    /* JADX INFO: renamed from: H */
    public static final int f48436H = 60;

    /* JADX INFO: renamed from: A */
    @hib
    public byte[] f48437A;

    /* JADX INFO: renamed from: B */
    public byte[] f48438B;

    /* JADX INFO: renamed from: C */
    @hib
    public y95.C15570b f48439C;

    /* JADX INFO: renamed from: D */
    @hib
    public y95.C15576h f48440D;

    /* JADX INFO: renamed from: f */
    @hib
    public final List<DrmInitData.SchemeData> f48441f;

    /* JADX INFO: renamed from: g */
    public final y95 f48442g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC7620a f48443h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC7621b f48444i;

    /* JADX INFO: renamed from: j */
    public final int f48445j;

    /* JADX INFO: renamed from: k */
    public final boolean f48446k;

    /* JADX INFO: renamed from: l */
    public final boolean f48447l;

    /* JADX INFO: renamed from: m */
    public final HashMap<String, String> f48448m;

    /* JADX INFO: renamed from: n */
    public final f03<nr4.C10020a> f48449n;

    /* JADX INFO: renamed from: o */
    public final hc9 f48450o;

    /* JADX INFO: renamed from: p */
    public final j0d f48451p;

    /* JADX INFO: renamed from: q */
    public final yea f48452q;

    /* JADX INFO: renamed from: r */
    public final UUID f48453r;

    /* JADX INFO: renamed from: s */
    public final Looper f48454s;

    /* JADX INFO: renamed from: t */
    public final HandlerC7624e f48455t;

    /* JADX INFO: renamed from: u */
    public int f48456u;

    /* JADX INFO: renamed from: v */
    public int f48457v;

    /* JADX INFO: renamed from: w */
    @hib
    public HandlerThread f48458w;

    /* JADX INFO: renamed from: x */
    @hib
    public HandlerC7622c f48459x;

    /* JADX INFO: renamed from: y */
    @hib
    public c93 f48460y;

    /* JADX INFO: renamed from: z */
    @hib
    public ar4.C1571a f48461z;

    /* JADX INFO: renamed from: iu3$a */
    public interface InterfaceC7620a {
        void onProvisionCompleted();

        void onProvisionError(Exception exc, boolean z);

        void provisionRequired(iu3 iu3Var);
    }

    /* JADX INFO: renamed from: iu3$b */
    public interface InterfaceC7621b {
        void onReferenceCountDecremented(iu3 iu3Var, int i);

        void onReferenceCountIncremented(iu3 iu3Var, int i);
    }

    /* JADX INFO: renamed from: iu3$c */
    @igg({"HandlerLeak"})
    public class HandlerC7622c extends Handler {

        /* JADX INFO: renamed from: a */
        @xc7("this")
        public boolean f48462a;

        public HandlerC7622c(Looper looper) {
            super(looper);
        }

        private boolean maybeRetryRequest(Message message, afa afaVar) {
            C7623d c7623d = (C7623d) message.obj;
            if (!c7623d.f48465b) {
                return false;
            }
            int i = c7623d.f48468e + 1;
            c7623d.f48468e = i;
            if (i > iu3.this.f48450o.getMinimumLoadableRetryCount(3)) {
                return false;
            }
            long retryDelayMsFor = iu3.this.f48450o.getRetryDelayMsFor(new hc9.C6795d(new kc9(c7623d.f48464a, afaVar.f1332a, afaVar.f1333b, afaVar.f1334c, SystemClock.elapsedRealtime(), SystemClock.elapsedRealtime() - c7623d.f48466c, afaVar.f1335d), new fga(3), afaVar.getCause() instanceof IOException ? (IOException) afaVar.getCause() : new C7625f(afaVar.getCause()), c7623d.f48468e));
            if (retryDelayMsFor == -9223372036854775807L) {
                return false;
            }
            synchronized (this) {
                try {
                    if (this.f48462a) {
                        return false;
                    }
                    sendMessageDelayed(Message.obtain(message), retryDelayMsFor);
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: a */
        public void m13438a(int i, Object obj, boolean z) {
            obtainMessage(i, new C7623d(kc9.getNewId(), z, SystemClock.elapsedRealtime(), obj)).sendToTarget();
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Object objExecuteProvisionRequest;
            C7623d c7623d = (C7623d) message.obj;
            try {
                int i = message.what;
                if (i == 1) {
                    objExecuteProvisionRequest = iu3.this.f48452q.executeProvisionRequest(iu3.this.f48453r, (y95.C15576h) c7623d.f48467d);
                } else {
                    if (i != 2) {
                        throw new RuntimeException();
                    }
                    objExecuteProvisionRequest = iu3.this.f48452q.executeKeyRequest(iu3.this.f48453r, (y95.C15570b) c7623d.f48467d);
                }
            } catch (afa e) {
                boolean zMaybeRetryRequest = maybeRetryRequest(message, e);
                objExecuteProvisionRequest = e;
                if (zMaybeRetryRequest) {
                    return;
                }
            } catch (Exception e2) {
                xh9.m25149w("DefaultDrmSession", "Key/provisioning request produced an unexpected exception. Not retrying.", e2);
                objExecuteProvisionRequest = e2;
            }
            iu3.this.f48450o.onLoadTaskConcluded(c7623d.f48464a);
            synchronized (this) {
                try {
                    if (!this.f48462a) {
                        iu3.this.f48455t.obtainMessage(message.what, Pair.create(c7623d.f48467d, objExecuteProvisionRequest)).sendToTarget();
                    }
                } finally {
                }
            }
        }

        public synchronized void release() {
            removeCallbacksAndMessages(null);
            this.f48462a = true;
        }
    }

    /* JADX INFO: renamed from: iu3$d */
    public static final class C7623d {

        /* JADX INFO: renamed from: a */
        public final long f48464a;

        /* JADX INFO: renamed from: b */
        public final boolean f48465b;

        /* JADX INFO: renamed from: c */
        public final long f48466c;

        /* JADX INFO: renamed from: d */
        public final Object f48467d;

        /* JADX INFO: renamed from: e */
        public int f48468e;

        public C7623d(long j, boolean z, long j2, Object obj) {
            this.f48464a = j;
            this.f48465b = z;
            this.f48466c = j2;
            this.f48467d = obj;
        }
    }

    /* JADX INFO: renamed from: iu3$e */
    @igg({"HandlerLeak"})
    public class HandlerC7624e extends Handler {
        public HandlerC7624e(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Pair pair = (Pair) message.obj;
            Object obj = pair.first;
            Object obj2 = pair.second;
            int i = message.what;
            if (i == 1) {
                iu3.this.onProvisionResponse(obj, obj2);
            } else {
                if (i != 2) {
                    return;
                }
                iu3.this.onKeyResponse(obj, obj2);
            }
        }
    }

    /* JADX INFO: renamed from: iu3$f */
    public static final class C7625f extends IOException {
        public C7625f(@hib Throwable th) {
            super(th);
        }
    }

    public iu3(UUID uuid, y95 y95Var, InterfaceC7620a interfaceC7620a, InterfaceC7621b interfaceC7621b, @hib List<DrmInitData.SchemeData> list, int i, boolean z, boolean z2, @hib byte[] bArr, HashMap<String, String> map, yea yeaVar, Looper looper, hc9 hc9Var, j0d j0dVar) {
        if (i == 1 || i == 3) {
            v80.checkNotNull(bArr);
        }
        this.f48453r = uuid;
        this.f48443h = interfaceC7620a;
        this.f48444i = interfaceC7621b;
        this.f48442g = y95Var;
        this.f48445j = i;
        this.f48446k = z;
        this.f48447l = z2;
        if (bArr != null) {
            this.f48438B = bArr;
            this.f48441f = null;
        } else {
            this.f48441f = Collections.unmodifiableList((List) v80.checkNotNull(list));
        }
        this.f48448m = map;
        this.f48452q = yeaVar;
        this.f48449n = new f03<>();
        this.f48450o = hc9Var;
        this.f48451p = j0dVar;
        this.f48456u = 2;
        this.f48454s = looper;
        this.f48455t = new HandlerC7624e(looper);
    }

    private void dispatchEvent(qu2<nr4.C10020a> qu2Var) {
        Iterator<nr4.C10020a> it = this.f48449n.elementSet().iterator();
        while (it.hasNext()) {
            qu2Var.accept(it.next());
        }
    }

    @g5e({"sessionId"})
    private void doLicense(boolean z) {
        if (this.f48447l) {
            return;
        }
        byte[] bArr = (byte[]) t0i.castNonNull(this.f48437A);
        int i = this.f48445j;
        if (i != 0 && i != 1) {
            if (i == 2) {
                if (this.f48438B == null || restoreKeys()) {
                    postKeyRequest(bArr, 2, z);
                    return;
                }
                return;
            }
            if (i != 3) {
                return;
            }
            v80.checkNotNull(this.f48438B);
            v80.checkNotNull(this.f48437A);
            postKeyRequest(this.f48438B, 3, z);
            return;
        }
        if (this.f48438B == null) {
            postKeyRequest(bArr, 1, z);
            return;
        }
        if (this.f48456u == 4 || restoreKeys()) {
            long licenseDurationRemainingSec = getLicenseDurationRemainingSec();
            if (this.f48445j != 0 || licenseDurationRemainingSec > 60) {
                if (licenseDurationRemainingSec <= 0) {
                    onError(new qs8(), 2);
                    return;
                } else {
                    this.f48456u = 4;
                    dispatchEvent(new qu2() { // from class: hu3
                        @Override // p000.qu2
                        public final void accept(Object obj) {
                            ((nr4.C10020a) obj).drmKeysRestored();
                        }
                    });
                    return;
                }
            }
            xh9.m25142d("DefaultDrmSession", "Offline license has expired or will expire soon. Remaining seconds: " + licenseDurationRemainingSec);
            postKeyRequest(bArr, 2, z);
        }
    }

    private long getLicenseDurationRemainingSec() {
        if (!jk1.f50928n2.equals(this.f48453r)) {
            return Long.MAX_VALUE;
        }
        Pair pair = (Pair) v80.checkNotNull(ski.getLicenseDurationRemainingSec(this));
        return Math.min(((Long) pair.first).longValue(), ((Long) pair.second).longValue());
    }

    @a35(expression = {"sessionId"}, result = true)
    private boolean isOpen() {
        int i = this.f48456u;
        return i == 3 || i == 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onError$1(Throwable th, nr4.C10020a c10020a) {
        c10020a.drmSessionManagerError((Exception) th);
    }

    private void onError(final Throwable th, int i) {
        this.f48461z = new ar4.C1571a(th, tr4.getErrorCodeForMediaDrmException(th, i));
        xh9.m25145e("DefaultDrmSession", "DRM session error", th);
        if (th instanceof Exception) {
            dispatchEvent(new qu2() { // from class: fu3
                @Override // p000.qu2
                public final void accept(Object obj) {
                    iu3.lambda$onError$1(th, (nr4.C10020a) obj);
                }
            });
        } else {
            if (!(th instanceof Error)) {
                throw new IllegalStateException("Unexpected Throwable subclass", th);
            }
            if (!tr4.isFailureToConstructResourceBusyException(th) && !tr4.isFailureToConstructNotProvisionedException(th)) {
                throw ((Error) th);
            }
        }
        if (this.f48456u != 4) {
            this.f48456u = 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onKeyResponse(Object obj, Object obj2) {
        if (obj == this.f48439C && isOpen()) {
            this.f48439C = null;
            if ((obj2 instanceof Exception) || (obj2 instanceof NoSuchMethodError)) {
                onKeysError((Throwable) obj2, false);
                return;
            }
            try {
                byte[] bArr = (byte[]) obj2;
                if (this.f48445j == 3) {
                    this.f48442g.provideKeyResponse((byte[]) t0i.castNonNull(this.f48438B), bArr);
                    dispatchEvent(new qu2() { // from class: bu3
                        @Override // p000.qu2
                        public final void accept(Object obj3) {
                            ((nr4.C10020a) obj3).drmKeysRemoved();
                        }
                    });
                    return;
                }
                byte[] bArrProvideKeyResponse = this.f48442g.provideKeyResponse(this.f48437A, bArr);
                int i = this.f48445j;
                if ((i == 2 || (i == 0 && this.f48438B != null)) && bArrProvideKeyResponse != null && bArrProvideKeyResponse.length != 0) {
                    this.f48438B = bArrProvideKeyResponse;
                }
                this.f48456u = 4;
                dispatchEvent(new qu2() { // from class: du3
                    @Override // p000.qu2
                    public final void accept(Object obj3) {
                        ((nr4.C10020a) obj3).drmKeysLoaded();
                    }
                });
            } catch (Exception e) {
                e = e;
                onKeysError(e, true);
            } catch (NoSuchMethodError e2) {
                e = e2;
                onKeysError(e, true);
            }
        }
    }

    private void onKeysError(Throwable th, boolean z) {
        if ((th instanceof NotProvisionedException) || tr4.isFailureToConstructNotProvisionedException(th)) {
            this.f48443h.provisionRequired(this);
        } else {
            onError(th, z ? 1 : 2);
        }
    }

    private void onKeysRequired() {
        if (this.f48445j == 0 && this.f48456u == 4) {
            t0i.castNonNull(this.f48437A);
            doLicense(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onProvisionResponse(Object obj, Object obj2) {
        if (obj == this.f48440D) {
            if (this.f48456u == 2 || isOpen()) {
                this.f48440D = null;
                if (obj2 instanceof Exception) {
                    this.f48443h.onProvisionError((Exception) obj2, false);
                    return;
                }
                try {
                    this.f48442g.provideProvisionResponse((byte[]) obj2);
                    this.f48443h.onProvisionCompleted();
                } catch (Exception e) {
                    this.f48443h.onProvisionError(e, true);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    @p000.a35(expression = {"sessionId"}, result = true)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean openInternal() {
        /*
            r4 = this;
            boolean r0 = r4.isOpen()
            r1 = 1
            if (r0 == 0) goto L8
            return r1
        L8:
            y95 r0 = r4.f48442g     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            byte[] r0 = r0.openSession()     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            r4.f48437A = r0     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            y95 r2 = r4.f48442g     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            j0d r3 = r4.f48451p     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            r2.setPlayerIdForSession(r0, r3)     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            y95 r0 = r4.f48442g     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            byte[] r2 = r4.f48437A     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            c93 r0 = r0.createCryptoConfig(r2)     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            r4.f48460y = r0     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            r0 = 3
            r4.f48456u = r0     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            zt3 r2 = new zt3     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            r2.<init>()     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            r4.dispatchEvent(r2)     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            byte[] r0 = r4.f48437A     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            p000.v80.checkNotNull(r0)     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            return r1
        L32:
            r0 = move-exception
            goto L35
        L34:
            r0 = move-exception
        L35:
            boolean r2 = p000.tr4.isFailureToConstructNotProvisionedException(r0)
            if (r2 == 0) goto L41
            iu3$a r0 = r4.f48443h
            r0.provisionRequired(r4)
            goto L4a
        L41:
            r4.onError(r0, r1)
            goto L4a
        L45:
            iu3$a r0 = r4.f48443h
            r0.provisionRequired(r4)
        L4a:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.iu3.openInternal():boolean");
    }

    private void postKeyRequest(byte[] bArr, int i, boolean z) {
        try {
            this.f48439C = this.f48442g.getKeyRequest(bArr, this.f48441f, i, this.f48448m);
            ((HandlerC7622c) t0i.castNonNull(this.f48459x)).m13438a(2, v80.checkNotNull(this.f48439C), z);
        } catch (Exception | NoSuchMethodError e) {
            onKeysError(e, true);
        }
    }

    @g5e({"sessionId", "offlineLicenseKeySetId"})
    private boolean restoreKeys() {
        try {
            this.f48442g.restoreKeys(this.f48437A, this.f48438B);
            return true;
        } catch (Exception | NoSuchMethodError e) {
            onError(e, 1);
            return false;
        }
    }

    private void verifyPlaybackThread() {
        if (Thread.currentThread() != this.f48454s.getThread()) {
            xh9.m25149w("DefaultDrmSession", "DefaultDrmSession accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + this.f48454s.getThread().getName(), new IllegalStateException());
        }
    }

    @Override // p000.ar4
    public void acquire(@hib nr4.C10020a c10020a) {
        verifyPlaybackThread();
        if (this.f48457v < 0) {
            xh9.m25144e("DefaultDrmSession", "Session reference count less than zero: " + this.f48457v);
            this.f48457v = 0;
        }
        if (c10020a != null) {
            this.f48449n.add(c10020a);
        }
        int i = this.f48457v + 1;
        this.f48457v = i;
        if (i == 1) {
            v80.checkState(this.f48456u == 2);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.f48458w = handlerThread;
            handlerThread.start();
            this.f48459x = new HandlerC7622c(this.f48458w.getLooper());
            if (openInternal()) {
                doLicense(true);
            }
        } else if (c10020a != null && isOpen() && this.f48449n.count(c10020a) == 1) {
            c10020a.drmSessionAcquired(this.f48456u);
        }
        this.f48444i.onReferenceCountIncremented(this, this.f48457v);
    }

    @Override // p000.ar4
    @hib
    public final c93 getCryptoConfig() {
        verifyPlaybackThread();
        return this.f48460y;
    }

    @Override // p000.ar4
    @hib
    public final ar4.C1571a getError() {
        verifyPlaybackThread();
        if (this.f48456u == 1) {
            return this.f48461z;
        }
        return null;
    }

    @Override // p000.ar4
    @hib
    public byte[] getOfflineLicenseKeySetId() {
        verifyPlaybackThread();
        return this.f48438B;
    }

    @Override // p000.ar4
    public final UUID getSchemeUuid() {
        verifyPlaybackThread();
        return this.f48453r;
    }

    @Override // p000.ar4
    public final int getState() {
        verifyPlaybackThread();
        return this.f48456u;
    }

    public boolean hasSessionId(byte[] bArr) {
        verifyPlaybackThread();
        return Arrays.equals(this.f48437A, bArr);
    }

    /* JADX INFO: renamed from: i */
    public void m13434i(int i) {
        if (i != 2) {
            return;
        }
        onKeysRequired();
    }

    /* JADX INFO: renamed from: j */
    public void m13435j() {
        if (openInternal()) {
            doLicense(true);
        }
    }

    /* JADX INFO: renamed from: k */
    public void m13436k(Exception exc, boolean z) {
        onError(exc, z ? 1 : 3);
    }

    /* JADX INFO: renamed from: l */
    public void m13437l() {
        this.f48440D = this.f48442g.getProvisionRequest();
        ((HandlerC7622c) t0i.castNonNull(this.f48459x)).m13438a(1, v80.checkNotNull(this.f48440D), true);
    }

    @Override // p000.ar4
    public boolean playClearSamplesWithoutKeys() {
        verifyPlaybackThread();
        return this.f48446k;
    }

    @Override // p000.ar4
    @hib
    public Map<String, String> queryKeyStatus() {
        verifyPlaybackThread();
        byte[] bArr = this.f48437A;
        if (bArr == null) {
            return null;
        }
        return this.f48442g.queryKeyStatus(bArr);
    }

    @Override // p000.ar4
    public void release(@hib nr4.C10020a c10020a) {
        verifyPlaybackThread();
        int i = this.f48457v;
        if (i <= 0) {
            xh9.m25144e("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        int i2 = i - 1;
        this.f48457v = i2;
        if (i2 == 0) {
            this.f48456u = 0;
            ((HandlerC7624e) t0i.castNonNull(this.f48455t)).removeCallbacksAndMessages(null);
            ((HandlerC7622c) t0i.castNonNull(this.f48459x)).release();
            this.f48459x = null;
            ((HandlerThread) t0i.castNonNull(this.f48458w)).quit();
            this.f48458w = null;
            this.f48460y = null;
            this.f48461z = null;
            this.f48439C = null;
            this.f48440D = null;
            byte[] bArr = this.f48437A;
            if (bArr != null) {
                this.f48442g.closeSession(bArr);
                this.f48437A = null;
            }
        }
        if (c10020a != null) {
            this.f48449n.remove(c10020a);
            if (this.f48449n.count(c10020a) == 0) {
                c10020a.drmSessionReleased();
            }
        }
        this.f48444i.onReferenceCountDecremented(this, this.f48457v);
    }

    @Override // p000.ar4
    public boolean requiresSecureDecoder(String str) {
        verifyPlaybackThread();
        return this.f48442g.requiresSecureDecoder((byte[]) v80.checkStateNotNull(this.f48437A), str);
    }
}
