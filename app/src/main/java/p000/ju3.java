package p000;

import android.media.ResourceBusyException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import androidx.media3.common.C1213a;
import androidx.media3.common.DrmInitData;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import p000.ar4;
import p000.iu3;
import p000.nr4;
import p000.or4;
import p000.y95;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public class ju3 implements or4 {

    /* JADX INFO: renamed from: A */
    public static final int f51868A = 0;

    /* JADX INFO: renamed from: B */
    public static final int f51869B = 1;

    /* JADX INFO: renamed from: C */
    public static final int f51870C = 2;

    /* JADX INFO: renamed from: D */
    public static final int f51871D = 3;

    /* JADX INFO: renamed from: E */
    public static final int f51872E = 3;

    /* JADX INFO: renamed from: F */
    public static final long f51873F = 300000;

    /* JADX INFO: renamed from: G */
    public static final String f51874G = "DefaultDrmSessionMgr";

    /* JADX INFO: renamed from: z */
    public static final String f51875z = "PRCustomData";

    /* JADX INFO: renamed from: b */
    public final UUID f51876b;

    /* JADX INFO: renamed from: c */
    public final y95.InterfaceC15575g f51877c;

    /* JADX INFO: renamed from: d */
    public final yea f51878d;

    /* JADX INFO: renamed from: e */
    public final HashMap<String, String> f51879e;

    /* JADX INFO: renamed from: f */
    public final boolean f51880f;

    /* JADX INFO: renamed from: g */
    public final int[] f51881g;

    /* JADX INFO: renamed from: h */
    public final boolean f51882h;

    /* JADX INFO: renamed from: i */
    public final C8092h f51883i;

    /* JADX INFO: renamed from: j */
    public final hc9 f51884j;

    /* JADX INFO: renamed from: k */
    public final C8093i f51885k;

    /* JADX INFO: renamed from: l */
    public final long f51886l;

    /* JADX INFO: renamed from: m */
    public final List<iu3> f51887m;

    /* JADX INFO: renamed from: n */
    public final Set<C8091g> f51888n;

    /* JADX INFO: renamed from: o */
    public final Set<iu3> f51889o;

    /* JADX INFO: renamed from: p */
    public int f51890p;

    /* JADX INFO: renamed from: q */
    @hib
    public y95 f51891q;

    /* JADX INFO: renamed from: r */
    @hib
    public iu3 f51892r;

    /* JADX INFO: renamed from: s */
    @hib
    public iu3 f51893s;

    /* JADX INFO: renamed from: t */
    public Looper f51894t;

    /* JADX INFO: renamed from: u */
    public Handler f51895u;

    /* JADX INFO: renamed from: v */
    public int f51896v;

    /* JADX INFO: renamed from: w */
    @hib
    public byte[] f51897w;

    /* JADX INFO: renamed from: x */
    public j0d f51898x;

    /* JADX INFO: renamed from: y */
    @hib
    public volatile HandlerC8088d f51899y;

    /* JADX INFO: renamed from: ju3$b */
    public static final class C8086b {

        /* JADX INFO: renamed from: d */
        public boolean f51903d;

        /* JADX INFO: renamed from: a */
        public final HashMap<String, String> f51900a = new HashMap<>();

        /* JADX INFO: renamed from: b */
        public UUID f51901b = jk1.f50928n2;

        /* JADX INFO: renamed from: c */
        public y95.InterfaceC15575g f51902c = mw6.f62544k;

        /* JADX INFO: renamed from: e */
        public int[] f51904e = new int[0];

        /* JADX INFO: renamed from: f */
        public boolean f51905f = true;

        /* JADX INFO: renamed from: g */
        public hc9 f51906g = new ow3();

        /* JADX INFO: renamed from: h */
        public long f51907h = 300000;

        public ju3 build(yea yeaVar) {
            return new ju3(this.f51901b, this.f51902c, yeaVar, this.f51900a, this.f51903d, this.f51904e, this.f51905f, this.f51906g, this.f51907h);
        }

        @op1
        public C8086b setKeyRequestParameters(@hib Map<String, String> map) {
            this.f51900a.clear();
            if (map != null) {
                this.f51900a.putAll(map);
            }
            return this;
        }

        @op1
        public C8086b setLoadErrorHandlingPolicy(hc9 hc9Var) {
            this.f51906g = (hc9) v80.checkNotNull(hc9Var);
            return this;
        }

        @op1
        public C8086b setMultiSession(boolean z) {
            this.f51903d = z;
            return this;
        }

        @op1
        public C8086b setPlayClearSamplesWithoutKeys(boolean z) {
            this.f51905f = z;
            return this;
        }

        @op1
        public C8086b setSessionKeepaliveMs(long j) {
            v80.checkArgument(j > 0 || j == -9223372036854775807L);
            this.f51907h = j;
            return this;
        }

        @op1
        public C8086b setUseDrmSessionsForClearContent(int... iArr) {
            for (int i : iArr) {
                boolean z = true;
                if (i != 2 && i != 1) {
                    z = false;
                }
                v80.checkArgument(z);
            }
            this.f51904e = (int[]) iArr.clone();
            return this;
        }

        @op1
        public C8086b setUuidAndExoMediaDrmProvider(UUID uuid, y95.InterfaceC15575g interfaceC15575g) {
            this.f51901b = (UUID) v80.checkNotNull(uuid);
            this.f51902c = (y95.InterfaceC15575g) v80.checkNotNull(interfaceC15575g);
            return this;
        }
    }

    /* JADX INFO: renamed from: ju3$c */
    public class C8087c implements y95.InterfaceC15572d {
        private C8087c() {
        }

        @Override // p000.y95.InterfaceC15572d
        public void onEvent(y95 y95Var, @hib byte[] bArr, int i, int i2, @hib byte[] bArr2) {
            ((HandlerC8088d) v80.checkNotNull(ju3.this.f51899y)).obtainMessage(i, bArr).sendToTarget();
        }
    }

    /* JADX INFO: renamed from: ju3$d */
    @igg({"HandlerLeak"})
    public class HandlerC8088d extends Handler {
        public HandlerC8088d(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            byte[] bArr = (byte[]) message.obj;
            if (bArr == null) {
                return;
            }
            for (iu3 iu3Var : ju3.this.f51887m) {
                if (iu3Var.hasSessionId(bArr)) {
                    iu3Var.m13434i(message.what);
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ju3$e */
    public static final class C8089e extends Exception {
        private C8089e(UUID uuid) {
            super("Media does not support uuid: " + uuid);
        }
    }

    /* JADX INFO: renamed from: ju3$f */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC8090f {
    }

    /* JADX INFO: renamed from: ju3$g */
    public class C8091g implements or4.InterfaceC10511b {

        /* JADX INFO: renamed from: b */
        @hib
        public final nr4.C10020a f51910b;

        /* JADX INFO: renamed from: c */
        @hib
        public ar4 f51911c;

        /* JADX INFO: renamed from: d */
        public boolean f51912d;

        public C8091g(@hib nr4.C10020a c10020a) {
            this.f51910b = c10020a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$acquire$0(C1213a c1213a) {
            if (ju3.this.f51890p == 0 || this.f51912d) {
                return;
            }
            ju3 ju3Var = ju3.this;
            this.f51911c = ju3Var.acquireSession((Looper) v80.checkNotNull(ju3Var.f51894t), this.f51910b, c1213a, false);
            ju3.this.f51888n.add(this);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$release$1() {
            if (this.f51912d) {
                return;
            }
            ar4 ar4Var = this.f51911c;
            if (ar4Var != null) {
                ar4Var.release(this.f51910b);
            }
            ju3.this.f51888n.remove(this);
            this.f51912d = true;
        }

        public void acquire(final C1213a c1213a) {
            ((Handler) v80.checkNotNull(ju3.this.f51895u)).post(new Runnable() { // from class: lu3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f58761a.lambda$acquire$0(c1213a);
                }
            });
        }

        @Override // p000.or4.InterfaceC10511b
        public void release() {
            t0i.postOrRun((Handler) v80.checkNotNull(ju3.this.f51895u), new Runnable() { // from class: nu3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f65692a.lambda$release$1();
                }
            });
        }
    }

    /* JADX INFO: renamed from: ju3$h */
    public class C8092h implements iu3.InterfaceC7620a {

        /* JADX INFO: renamed from: a */
        public final Set<iu3> f51914a = new HashSet();

        /* JADX INFO: renamed from: b */
        @hib
        public iu3 f51915b;

        public C8092h() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.iu3.InterfaceC7620a
        public void onProvisionCompleted() {
            this.f51915b = null;
            kx7 kx7VarCopyOf = kx7.copyOf((Collection) this.f51914a);
            this.f51914a.clear();
            quh it = kx7VarCopyOf.iterator();
            while (it.hasNext()) {
                ((iu3) it.next()).m13435j();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.iu3.InterfaceC7620a
        public void onProvisionError(Exception exc, boolean z) {
            this.f51915b = null;
            kx7 kx7VarCopyOf = kx7.copyOf((Collection) this.f51914a);
            this.f51914a.clear();
            quh it = kx7VarCopyOf.iterator();
            while (it.hasNext()) {
                ((iu3) it.next()).m13436k(exc, z);
            }
        }

        public void onSessionFullyReleased(iu3 iu3Var) {
            this.f51914a.remove(iu3Var);
            if (this.f51915b == iu3Var) {
                this.f51915b = null;
                if (this.f51914a.isEmpty()) {
                    return;
                }
                iu3 next = this.f51914a.iterator().next();
                this.f51915b = next;
                next.m13437l();
            }
        }

        @Override // p000.iu3.InterfaceC7620a
        public void provisionRequired(iu3 iu3Var) {
            this.f51914a.add(iu3Var);
            if (this.f51915b != null) {
                return;
            }
            this.f51915b = iu3Var;
            iu3Var.m13437l();
        }
    }

    /* JADX INFO: renamed from: ju3$i */
    public class C8093i implements iu3.InterfaceC7621b {
        private C8093i() {
        }

        @Override // p000.iu3.InterfaceC7621b
        public void onReferenceCountDecremented(final iu3 iu3Var, int i) {
            if (i == 1 && ju3.this.f51890p > 0 && ju3.this.f51886l != -9223372036854775807L) {
                ju3.this.f51889o.add(iu3Var);
                ((Handler) v80.checkNotNull(ju3.this.f51895u)).postAtTime(new Runnable() { // from class: pu3
                    @Override // java.lang.Runnable
                    public final void run() {
                        iu3Var.release(null);
                    }
                }, iu3Var, SystemClock.uptimeMillis() + ju3.this.f51886l);
            } else if (i == 0) {
                ju3.this.f51887m.remove(iu3Var);
                if (ju3.this.f51892r == iu3Var) {
                    ju3.this.f51892r = null;
                }
                if (ju3.this.f51893s == iu3Var) {
                    ju3.this.f51893s = null;
                }
                ju3.this.f51883i.onSessionFullyReleased(iu3Var);
                if (ju3.this.f51886l != -9223372036854775807L) {
                    ((Handler) v80.checkNotNull(ju3.this.f51895u)).removeCallbacksAndMessages(iu3Var);
                    ju3.this.f51889o.remove(iu3Var);
                }
            }
            ju3.this.maybeReleaseMediaDrm();
        }

        @Override // p000.iu3.InterfaceC7621b
        public void onReferenceCountIncremented(iu3 iu3Var, int i) {
            if (ju3.this.f51886l != -9223372036854775807L) {
                ju3.this.f51889o.remove(iu3Var);
                ((Handler) v80.checkNotNull(ju3.this.f51895u)).removeCallbacksAndMessages(iu3Var);
            }
        }
    }

    private static boolean acquisitionFailedIndicatingResourceShortage(ar4 ar4Var) {
        if (ar4Var.getState() != 1) {
            return false;
        }
        Throwable cause = ((ar4.C1571a) v80.checkNotNull(ar4Var.getError())).getCause();
        return (cause instanceof ResourceBusyException) || tr4.isFailureToConstructResourceBusyException(cause);
    }

    private boolean canAcquireSession(DrmInitData drmInitData) {
        if (this.f51897w != null) {
            return true;
        }
        if (getSchemeDatas(drmInitData, this.f51876b, true).isEmpty()) {
            if (drmInitData.f8206d != 1 || !drmInitData.get(0).matches(jk1.f50918l2)) {
                return false;
            }
            xh9.m25148w("DefaultDrmSessionMgr", "DrmInitData only contains common PSSH SchemeData. Assuming support for: " + this.f51876b);
        }
        String str = drmInitData.f8205c;
        if (str == null || "cenc".equals(str) || "cbcs".equals(str)) {
            return true;
        }
        return ("cbc1".equals(str) || "cens".equals(str)) ? false : true;
    }

    private iu3 createAndAcquireSession(@hib List<DrmInitData.SchemeData> list, boolean z, @hib nr4.C10020a c10020a) {
        v80.checkNotNull(this.f51891q);
        iu3 iu3Var = new iu3(this.f51876b, this.f51891q, this.f51883i, this.f51885k, list, this.f51896v, this.f51882h | z, z, this.f51897w, this.f51879e, this.f51878d, (Looper) v80.checkNotNull(this.f51894t), this.f51884j, (j0d) v80.checkNotNull(this.f51898x));
        iu3Var.acquire(c10020a);
        if (this.f51886l != -9223372036854775807L) {
            iu3Var.acquire(null);
        }
        return iu3Var;
    }

    private iu3 createAndAcquireSessionWithRetry(@hib List<DrmInitData.SchemeData> list, boolean z, @hib nr4.C10020a c10020a, boolean z2) {
        iu3 iu3VarCreateAndAcquireSession = createAndAcquireSession(list, z, c10020a);
        if (acquisitionFailedIndicatingResourceShortage(iu3VarCreateAndAcquireSession) && !this.f51889o.isEmpty()) {
            releaseAllKeepaliveSessions();
            undoAcquisition(iu3VarCreateAndAcquireSession, c10020a);
            iu3VarCreateAndAcquireSession = createAndAcquireSession(list, z, c10020a);
        }
        if (!acquisitionFailedIndicatingResourceShortage(iu3VarCreateAndAcquireSession) || !z2 || this.f51888n.isEmpty()) {
            return iu3VarCreateAndAcquireSession;
        }
        releaseAllPreacquiredSessions();
        if (!this.f51889o.isEmpty()) {
            releaseAllKeepaliveSessions();
        }
        undoAcquisition(iu3VarCreateAndAcquireSession, c10020a);
        return createAndAcquireSession(list, z, c10020a);
    }

    private static List<DrmInitData.SchemeData> getSchemeDatas(DrmInitData drmInitData, UUID uuid, boolean z) {
        ArrayList arrayList = new ArrayList(drmInitData.f8206d);
        for (int i = 0; i < drmInitData.f8206d; i++) {
            DrmInitData.SchemeData schemeData = drmInitData.get(i);
            if ((schemeData.matches(uuid) || (jk1.f50923m2.equals(uuid) && schemeData.matches(jk1.f50918l2))) && (schemeData.f8211e != null || z)) {
                arrayList.add(schemeData);
            }
        }
        return arrayList;
    }

    @z25({"this.playbackLooper", "this.playbackHandler"})
    private synchronized void initPlaybackLooper(Looper looper) {
        try {
            Looper looper2 = this.f51894t;
            if (looper2 == null) {
                this.f51894t = looper;
                this.f51895u = new Handler(looper);
            } else {
                v80.checkState(looper2 == looper);
                v80.checkNotNull(this.f51895u);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @hib
    private ar4 maybeAcquirePlaceholderSession(int i, boolean z) {
        y95 y95Var = (y95) v80.checkNotNull(this.f51891q);
        if ((y95Var.getCryptoType() == 2 && sv6.f82948d) || t0i.linearSearch(this.f51881g, i) == -1 || y95Var.getCryptoType() == 1) {
            return null;
        }
        iu3 iu3Var = this.f51892r;
        if (iu3Var == null) {
            iu3 iu3VarCreateAndAcquireSessionWithRetry = createAndAcquireSessionWithRetry(kx7.m15110of(), true, null, z);
            this.f51887m.add(iu3VarCreateAndAcquireSessionWithRetry);
            this.f51892r = iu3VarCreateAndAcquireSessionWithRetry;
        } else {
            iu3Var.acquire(null);
        }
        return this.f51892r;
    }

    private void maybeCreateMediaDrmHandler(Looper looper) {
        if (this.f51899y == null) {
            this.f51899y = new HandlerC8088d(looper);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeReleaseMediaDrm() {
        if (this.f51891q != null && this.f51890p == 0 && this.f51887m.isEmpty() && this.f51888n.isEmpty()) {
            ((y95) v80.checkNotNull(this.f51891q)).release();
            this.f51891q = null;
        }
    }

    private void releaseAllKeepaliveSessions() {
        quh it = dy7.copyOf((Collection) this.f51889o).iterator();
        while (it.hasNext()) {
            ((ar4) it.next()).release(null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void releaseAllPreacquiredSessions() {
        quh it = dy7.copyOf((Collection) this.f51888n).iterator();
        while (it.hasNext()) {
            ((C8091g) it.next()).release();
        }
    }

    private void undoAcquisition(ar4 ar4Var, @hib nr4.C10020a c10020a) {
        ar4Var.release(c10020a);
        if (this.f51886l != -9223372036854775807L) {
            ar4Var.release(null);
        }
    }

    private void verifyPlaybackThread(boolean z) {
        if (z && this.f51894t == null) {
            xh9.m25149w("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed before setPlayer(), possibly on the wrong thread.", new IllegalStateException());
            return;
        }
        if (Thread.currentThread() != ((Looper) v80.checkNotNull(this.f51894t)).getThread()) {
            xh9.m25149w("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + this.f51894t.getThread().getName(), new IllegalStateException());
        }
    }

    @Override // p000.or4
    @hib
    public ar4 acquireSession(@hib nr4.C10020a c10020a, C1213a c1213a) {
        verifyPlaybackThread(false);
        v80.checkState(this.f51890p > 0);
        v80.checkStateNotNull(this.f51894t);
        return acquireSession(this.f51894t, c10020a, c1213a, true);
    }

    @Override // p000.or4
    public int getCryptoType(C1213a c1213a) {
        verifyPlaybackThread(false);
        int cryptoType = ((y95) v80.checkNotNull(this.f51891q)).getCryptoType();
        DrmInitData drmInitData = c1213a.f8295s;
        if (drmInitData != null) {
            if (canAcquireSession(drmInitData)) {
                return cryptoType;
            }
            return 1;
        }
        if (t0i.linearSearch(this.f51881g, rva.getTrackType(c1213a.f8291o)) != -1) {
            return cryptoType;
        }
        return 0;
    }

    @Override // p000.or4
    public or4.InterfaceC10511b preacquireSession(@hib nr4.C10020a c10020a, C1213a c1213a) {
        v80.checkState(this.f51890p > 0);
        v80.checkStateNotNull(this.f51894t);
        C8091g c8091g = new C8091g(c10020a);
        c8091g.acquire(c1213a);
        return c8091g;
    }

    @Override // p000.or4
    public final void prepare() {
        verifyPlaybackThread(true);
        int i = this.f51890p;
        this.f51890p = i + 1;
        if (i != 0) {
            return;
        }
        if (this.f51891q == null) {
            y95 y95VarAcquireExoMediaDrm = this.f51877c.acquireExoMediaDrm(this.f51876b);
            this.f51891q = y95VarAcquireExoMediaDrm;
            y95VarAcquireExoMediaDrm.setOnEventListener(new C8087c());
        } else if (this.f51886l != -9223372036854775807L) {
            for (int i2 = 0; i2 < this.f51887m.size(); i2++) {
                this.f51887m.get(i2).acquire(null);
            }
        }
    }

    @Override // p000.or4
    public final void release() {
        verifyPlaybackThread(true);
        int i = this.f51890p - 1;
        this.f51890p = i;
        if (i != 0) {
            return;
        }
        if (this.f51886l != -9223372036854775807L) {
            ArrayList arrayList = new ArrayList(this.f51887m);
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ((iu3) arrayList.get(i2)).release(null);
            }
        }
        releaseAllPreacquiredSessions();
        maybeReleaseMediaDrm();
    }

    public void setMode(int i, @hib byte[] bArr) {
        v80.checkState(this.f51887m.isEmpty());
        if (i == 1 || i == 3) {
            v80.checkNotNull(bArr);
        }
        this.f51896v = i;
        this.f51897w = bArr;
    }

    @Override // p000.or4
    public void setPlayer(Looper looper, j0d j0dVar) {
        initPlaybackLooper(looper);
        this.f51898x = j0dVar;
    }

    private ju3(UUID uuid, y95.InterfaceC15575g interfaceC15575g, yea yeaVar, HashMap<String, String> map, boolean z, int[] iArr, boolean z2, hc9 hc9Var, long j) {
        v80.checkNotNull(uuid);
        v80.checkArgument(!jk1.f50918l2.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f51876b = uuid;
        this.f51877c = interfaceC15575g;
        this.f51878d = yeaVar;
        this.f51879e = map;
        this.f51880f = z;
        this.f51881g = iArr;
        this.f51882h = z2;
        this.f51884j = hc9Var;
        this.f51883i = new C8092h();
        this.f51885k = new C8093i();
        this.f51896v = 0;
        this.f51887m = new ArrayList();
        this.f51888n = t6f.newIdentityHashSet();
        this.f51889o = t6f.newIdentityHashSet();
        this.f51886l = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @hib
    public ar4 acquireSession(Looper looper, @hib nr4.C10020a c10020a, C1213a c1213a, boolean z) {
        List<DrmInitData.SchemeData> schemeDatas;
        maybeCreateMediaDrmHandler(looper);
        DrmInitData drmInitData = c1213a.f8295s;
        if (drmInitData == null) {
            return maybeAcquirePlaceholderSession(rva.getTrackType(c1213a.f8291o), z);
        }
        iu3 iu3VarCreateAndAcquireSessionWithRetry = null;
        byte b = 0;
        if (this.f51897w == null) {
            schemeDatas = getSchemeDatas((DrmInitData) v80.checkNotNull(drmInitData), this.f51876b, false);
            if (schemeDatas.isEmpty()) {
                C8089e c8089e = new C8089e(this.f51876b);
                xh9.m25145e("DefaultDrmSessionMgr", "DRM error", c8089e);
                if (c10020a != null) {
                    c10020a.drmSessionManagerError(c8089e);
                }
                return new j55(new ar4.C1571a(c8089e, 6003));
            }
        } else {
            schemeDatas = null;
        }
        if (!this.f51880f) {
            iu3VarCreateAndAcquireSessionWithRetry = this.f51893s;
        } else {
            Iterator<iu3> it = this.f51887m.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                iu3 next = it.next();
                if (Objects.equals(next.f48441f, schemeDatas)) {
                    iu3VarCreateAndAcquireSessionWithRetry = next;
                    break;
                }
            }
        }
        if (iu3VarCreateAndAcquireSessionWithRetry == null) {
            iu3VarCreateAndAcquireSessionWithRetry = createAndAcquireSessionWithRetry(schemeDatas, false, c10020a, z);
            if (!this.f51880f) {
                this.f51893s = iu3VarCreateAndAcquireSessionWithRetry;
            }
            this.f51887m.add(iu3VarCreateAndAcquireSessionWithRetry);
        } else {
            iu3VarCreateAndAcquireSessionWithRetry.acquire(c10020a);
        }
        return iu3VarCreateAndAcquireSessionWithRetry;
    }
}
