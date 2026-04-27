package p000;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import com.google.android.exoplayer2.drm.InterfaceC3004d;
import com.google.android.exoplayer2.metadata.C3018a;
import com.google.android.exoplayer2.metadata.Metadata;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import p000.aga;
import p000.kx7;
import p000.l0d;
import p000.n1e;
import p000.nja;
import p000.p1e;
import p000.p7h;
import p000.ppa;
import p000.sw3;
import p000.t1h;
import p000.vna;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class kf5 implements Handler.Callback, nja.InterfaceC9906a, p7h.InterfaceC10828a, ppa.InterfaceC11066d, sw3.InterfaceC12811a, l0d.InterfaceC8570a {

    /* JADX INFO: renamed from: A2 */
    public static final int f53865A2 = 2;

    /* JADX INFO: renamed from: B2 */
    public static final int f53866B2 = 3;

    /* JADX INFO: renamed from: C2 */
    public static final int f53867C2 = 4;

    /* JADX INFO: renamed from: D2 */
    public static final int f53868D2 = 5;

    /* JADX INFO: renamed from: E2 */
    public static final int f53869E2 = 6;

    /* JADX INFO: renamed from: F2 */
    public static final int f53870F2 = 7;

    /* JADX INFO: renamed from: G2 */
    public static final int f53871G2 = 8;

    /* JADX INFO: renamed from: H2 */
    public static final int f53872H2 = 9;

    /* JADX INFO: renamed from: I2 */
    public static final int f53873I2 = 10;

    /* JADX INFO: renamed from: J2 */
    public static final int f53874J2 = 11;

    /* JADX INFO: renamed from: K2 */
    public static final int f53875K2 = 12;

    /* JADX INFO: renamed from: L2 */
    public static final int f53876L2 = 13;

    /* JADX INFO: renamed from: M2 */
    public static final int f53877M2 = 14;

    /* JADX INFO: renamed from: N2 */
    public static final int f53878N2 = 15;

    /* JADX INFO: renamed from: O2 */
    public static final int f53879O2 = 16;

    /* JADX INFO: renamed from: P2 */
    public static final int f53880P2 = 17;

    /* JADX INFO: renamed from: Q2 */
    public static final int f53881Q2 = 18;

    /* JADX INFO: renamed from: R2 */
    public static final int f53882R2 = 19;

    /* JADX INFO: renamed from: S2 */
    public static final int f53883S2 = 20;

    /* JADX INFO: renamed from: T2 */
    public static final int f53884T2 = 21;

    /* JADX INFO: renamed from: U2 */
    public static final int f53885U2 = 22;

    /* JADX INFO: renamed from: V2 */
    public static final int f53886V2 = 23;

    /* JADX INFO: renamed from: W2 */
    public static final int f53887W2 = 24;

    /* JADX INFO: renamed from: X2 */
    public static final int f53888X2 = 25;

    /* JADX INFO: renamed from: Y2 */
    public static final int f53889Y2 = 26;

    /* JADX INFO: renamed from: Z2 */
    public static final int f53890Z2 = 10;

    /* JADX INFO: renamed from: a3 */
    public static final int f53891a3 = 1000;

    /* JADX INFO: renamed from: b3 */
    public static final long f53892b3 = 4000;

    /* JADX INFO: renamed from: c3 */
    public static final long f53893c3 = 500000;

    /* JADX INFO: renamed from: x2 */
    public static final String f53894x2 = "ExoPlayerImplInternal";

    /* JADX INFO: renamed from: y2 */
    public static final int f53895y2 = 0;

    /* JADX INFO: renamed from: z2 */
    public static final int f53896z2 = 1;

    /* JADX INFO: renamed from: C */
    public final pe7 f53897C;

    /* JADX INFO: renamed from: F */
    @hib
    public final HandlerThread f53898F;

    /* JADX INFO: renamed from: H */
    public final Looper f53899H;

    /* JADX INFO: renamed from: L */
    public final t1h.C12851d f53900L;

    /* JADX INFO: renamed from: M */
    public final t1h.C12849b f53901M;

    /* JADX INFO: renamed from: M1 */
    public final InterfaceC8345f f53902M1;

    /* JADX INFO: renamed from: N */
    public final long f53903N;

    /* JADX INFO: renamed from: Q */
    public final boolean f53904Q;

    /* JADX INFO: renamed from: V1 */
    public final uja f53905V1;

    /* JADX INFO: renamed from: X */
    public final sw3 f53906X;

    /* JADX INFO: renamed from: Y */
    public final ArrayList<C8343d> f53907Y;

    /* JADX INFO: renamed from: Z */
    public final h52 f53908Z;

    /* JADX INFO: renamed from: Z1 */
    public final ppa f53909Z1;

    /* JADX INFO: renamed from: a */
    public final n1e[] f53910a;

    /* JADX INFO: renamed from: a2 */
    public final vb9 f53911a2;

    /* JADX INFO: renamed from: b */
    public final Set<n1e> f53912b;

    /* JADX INFO: renamed from: b2 */
    public final long f53913b2;

    /* JADX INFO: renamed from: c */
    public final p1e[] f53914c;

    /* JADX INFO: renamed from: c2 */
    public iue f53915c2;

    /* JADX INFO: renamed from: d */
    public final p7h f53916d;

    /* JADX INFO: renamed from: d2 */
    public myc f53917d2;

    /* JADX INFO: renamed from: e */
    public final q7h f53918e;

    /* JADX INFO: renamed from: e2 */
    public C8344e f53919e2;

    /* JADX INFO: renamed from: f */
    public final gc9 f53920f;

    /* JADX INFO: renamed from: f2 */
    public boolean f53921f2;

    /* JADX INFO: renamed from: g2 */
    public boolean f53922g2;

    /* JADX INFO: renamed from: h2 */
    public boolean f53923h2;

    /* JADX INFO: renamed from: i2 */
    public boolean f53924i2;

    /* JADX INFO: renamed from: j2 */
    public boolean f53925j2;

    /* JADX INFO: renamed from: k2 */
    public int f53926k2;

    /* JADX INFO: renamed from: l2 */
    public boolean f53927l2;

    /* JADX INFO: renamed from: m */
    public final vp0 f53928m;

    /* JADX INFO: renamed from: m2 */
    public boolean f53929m2;

    /* JADX INFO: renamed from: n2 */
    public boolean f53930n2;

    /* JADX INFO: renamed from: o2 */
    public boolean f53931o2;

    /* JADX INFO: renamed from: p2 */
    public int f53932p2;

    /* JADX INFO: renamed from: q2 */
    @hib
    public C8347h f53933q2;

    /* JADX INFO: renamed from: r2 */
    public long f53934r2;

    /* JADX INFO: renamed from: s2 */
    public int f53935s2;

    /* JADX INFO: renamed from: t2 */
    public boolean f53936t2;

    /* JADX INFO: renamed from: u2 */
    @hib
    public ba5 f53937u2;

    /* JADX INFO: renamed from: v2 */
    public long f53938v2;

    /* JADX INFO: renamed from: w2 */
    public long f53939w2 = -9223372036854775807L;

    /* JADX INFO: renamed from: kf5$a */
    public class C8340a implements n1e.InterfaceC9653c {
        public C8340a() {
        }

        @Override // p000.n1e.InterfaceC9653c
        public void onSleep() {
            kf5.this.f53930n2 = true;
        }

        @Override // p000.n1e.InterfaceC9653c
        public void onWakeup() {
            kf5.this.f53897C.sendEmptyMessage(2);
        }
    }

    /* JADX INFO: renamed from: kf5$b */
    public static final class C8341b {

        /* JADX INFO: renamed from: a */
        public final List<ppa.C11065c> f53941a;

        /* JADX INFO: renamed from: b */
        public final sbf f53942b;

        /* JADX INFO: renamed from: c */
        public final int f53943c;

        /* JADX INFO: renamed from: d */
        public final long f53944d;

        public /* synthetic */ C8341b(List list, sbf sbfVar, int i, long j, C8340a c8340a) {
            this(list, sbfVar, i, j);
        }

        private C8341b(List<ppa.C11065c> list, sbf sbfVar, int i, long j) {
            this.f53941a = list;
            this.f53942b = sbfVar;
            this.f53943c = i;
            this.f53944d = j;
        }
    }

    /* JADX INFO: renamed from: kf5$c */
    public static class C8342c {

        /* JADX INFO: renamed from: a */
        public final int f53945a;

        /* JADX INFO: renamed from: b */
        public final int f53946b;

        /* JADX INFO: renamed from: c */
        public final int f53947c;

        /* JADX INFO: renamed from: d */
        public final sbf f53948d;

        public C8342c(int i, int i2, int i3, sbf sbfVar) {
            this.f53945a = i;
            this.f53946b = i2;
            this.f53947c = i3;
            this.f53948d = sbfVar;
        }
    }

    /* JADX INFO: renamed from: kf5$d */
    public static final class C8343d implements Comparable<C8343d> {

        /* JADX INFO: renamed from: a */
        public final l0d f53949a;

        /* JADX INFO: renamed from: b */
        public int f53950b;

        /* JADX INFO: renamed from: c */
        public long f53951c;

        /* JADX INFO: renamed from: d */
        @hib
        public Object f53952d;

        public C8343d(l0d l0dVar) {
            this.f53949a = l0dVar;
        }

        public void setResolvedPosition(int i, long j, Object obj) {
            this.f53950b = i;
            this.f53951c = j;
            this.f53952d = obj;
        }

        @Override // java.lang.Comparable
        public int compareTo(C8343d c8343d) {
            Object obj = this.f53952d;
            if ((obj == null) != (c8343d.f53952d == null)) {
                return obj != null ? -1 : 1;
            }
            if (obj == null) {
                return 0;
            }
            int i = this.f53950b - c8343d.f53950b;
            return i != 0 ? i : x0i.compareLong(this.f53951c, c8343d.f53951c);
        }
    }

    /* JADX INFO: renamed from: kf5$e */
    public static final class C8344e {

        /* JADX INFO: renamed from: a */
        public boolean f53953a;

        /* JADX INFO: renamed from: b */
        public myc f53954b;

        /* JADX INFO: renamed from: c */
        public int f53955c;

        /* JADX INFO: renamed from: d */
        public boolean f53956d;

        /* JADX INFO: renamed from: e */
        public int f53957e;

        /* JADX INFO: renamed from: f */
        public boolean f53958f;

        /* JADX INFO: renamed from: g */
        public int f53959g;

        public C8344e(myc mycVar) {
            this.f53954b = mycVar;
        }

        public void incrementPendingOperationAcks(int i) {
            this.f53953a |= i > 0;
            this.f53955c += i;
        }

        public void setPlayWhenReadyChangeReason(int i) {
            this.f53953a = true;
            this.f53958f = true;
            this.f53959g = i;
        }

        public void setPlaybackInfo(myc mycVar) {
            this.f53953a |= this.f53954b != mycVar;
            this.f53954b = mycVar;
        }

        public void setPositionDiscontinuity(int i) {
            if (this.f53956d && this.f53957e != 5) {
                u80.checkArgument(i == 5);
                return;
            }
            this.f53953a = true;
            this.f53956d = true;
            this.f53957e = i;
        }
    }

    /* JADX INFO: renamed from: kf5$f */
    public interface InterfaceC8345f {
        void onPlaybackInfoUpdate(C8344e c8344e);
    }

    /* JADX INFO: renamed from: kf5$g */
    public static final class C8346g {

        /* JADX INFO: renamed from: a */
        public final vna.C14175b f53960a;

        /* JADX INFO: renamed from: b */
        public final long f53961b;

        /* JADX INFO: renamed from: c */
        public final long f53962c;

        /* JADX INFO: renamed from: d */
        public final boolean f53963d;

        /* JADX INFO: renamed from: e */
        public final boolean f53964e;

        /* JADX INFO: renamed from: f */
        public final boolean f53965f;

        public C8346g(vna.C14175b c14175b, long j, long j2, boolean z, boolean z2, boolean z3) {
            this.f53960a = c14175b;
            this.f53961b = j;
            this.f53962c = j2;
            this.f53963d = z;
            this.f53964e = z2;
            this.f53965f = z3;
        }
    }

    /* JADX INFO: renamed from: kf5$h */
    public static final class C8347h {

        /* JADX INFO: renamed from: a */
        public final t1h f53966a;

        /* JADX INFO: renamed from: b */
        public final int f53967b;

        /* JADX INFO: renamed from: c */
        public final long f53968c;

        public C8347h(t1h t1hVar, int i, long j) {
            this.f53966a = t1hVar;
            this.f53967b = i;
            this.f53968c = j;
        }
    }

    public kf5(n1e[] n1eVarArr, p7h p7hVar, q7h q7hVar, gc9 gc9Var, vp0 vp0Var, int i, boolean z, InterfaceC12162rn interfaceC12162rn, iue iueVar, vb9 vb9Var, long j, boolean z2, Looper looper, h52 h52Var, InterfaceC8345f interfaceC8345f, k0d k0dVar, Looper looper2) {
        this.f53902M1 = interfaceC8345f;
        this.f53910a = n1eVarArr;
        this.f53916d = p7hVar;
        this.f53918e = q7hVar;
        this.f53920f = gc9Var;
        this.f53928m = vp0Var;
        this.f53926k2 = i;
        this.f53927l2 = z;
        this.f53915c2 = iueVar;
        this.f53911a2 = vb9Var;
        this.f53913b2 = j;
        this.f53938v2 = j;
        this.f53922g2 = z2;
        this.f53908Z = h52Var;
        this.f53903N = gc9Var.getBackBufferDurationUs();
        this.f53904Q = gc9Var.retainBackBufferFromKeyframe();
        myc mycVarCreateDummy = myc.createDummy(q7hVar);
        this.f53917d2 = mycVarCreateDummy;
        this.f53919e2 = new C8344e(mycVarCreateDummy);
        this.f53914c = new p1e[n1eVarArr.length];
        p1e.InterfaceC10758f rendererCapabilitiesListener = p7hVar.getRendererCapabilitiesListener();
        for (int i2 = 0; i2 < n1eVarArr.length; i2++) {
            n1eVarArr[i2].init(i2, k0dVar);
            this.f53914c[i2] = n1eVarArr[i2].getCapabilities();
            if (rendererCapabilitiesListener != null) {
                this.f53914c[i2].setListener(rendererCapabilitiesListener);
            }
        }
        this.f53906X = new sw3(this, h52Var);
        this.f53907Y = new ArrayList<>();
        this.f53912b = t6f.newIdentityHashSet();
        this.f53900L = new t1h.C12851d();
        this.f53901M = new t1h.C12849b();
        p7hVar.init(this, vp0Var);
        this.f53936t2 = true;
        pe7 pe7VarCreateHandler = h52Var.createHandler(looper, null);
        this.f53905V1 = new uja(interfaceC12162rn, pe7VarCreateHandler);
        this.f53909Z1 = new ppa(this, interfaceC12162rn, pe7VarCreateHandler, k0dVar);
        if (looper2 != null) {
            this.f53898F = null;
            this.f53899H = looper2;
        } else {
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
            this.f53898F = handlerThread;
            handlerThread.start();
            this.f53899H = handlerThread.getLooper();
        }
        this.f53897C = h52Var.createHandler(this.f53899H, this);
    }

    private void addMediaItemsInternal(C8341b c8341b, int i) throws Throwable {
        this.f53919e2.incrementPendingOperationAcks(1);
        ppa ppaVar = this.f53909Z1;
        if (i == -1) {
            i = ppaVar.getSize();
        }
        handleMediaSourceListInfoRefreshed(ppaVar.addMediaSources(i, c8341b.f53941a, c8341b.f53942b), false);
    }

    private void attemptRendererErrorRecovery() throws ba5 {
        reselectTracksInternalAndSeek();
    }

    private void deliverMessage(l0d l0dVar) throws ba5 {
        if (l0dVar.isCanceled()) {
            return;
        }
        try {
            l0dVar.getTarget().handleMessage(l0dVar.getType(), l0dVar.getPayload());
        } finally {
            l0dVar.markAsProcessed(true);
        }
    }

    private void disableRenderer(n1e n1eVar) throws ba5 {
        if (isRendererEnabled(n1eVar)) {
            this.f53906X.onRendererDisabled(n1eVar);
            ensureStopped(n1eVar);
            n1eVar.disable();
            this.f53932p2--;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x01a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void doSomeWork() throws p000.ba5, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 498
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.kf5.doSomeWork():void");
    }

    @hib
    /* JADX INFO: renamed from: e */
    public static Object m14712e(t1h.C12851d c12851d, t1h.C12849b c12849b, int i, boolean z, Object obj, t1h t1hVar, t1h t1hVar2) {
        int indexOfPeriod = t1hVar.getIndexOfPeriod(obj);
        int periodCount = t1hVar.getPeriodCount();
        int nextPeriodIndex = indexOfPeriod;
        int indexOfPeriod2 = -1;
        for (int i2 = 0; i2 < periodCount && indexOfPeriod2 == -1; i2++) {
            nextPeriodIndex = t1hVar.getNextPeriodIndex(nextPeriodIndex, c12849b, c12851d, i, z);
            if (nextPeriodIndex == -1) {
                break;
            }
            indexOfPeriod2 = t1hVar2.getIndexOfPeriod(t1hVar.getUidOfPeriod(nextPeriodIndex));
        }
        if (indexOfPeriod2 == -1) {
            return null;
        }
        return t1hVar2.getUidOfPeriod(indexOfPeriod2);
    }

    private void enableRenderer(int i, boolean z) throws ba5 {
        n1e n1eVar = this.f53910a[i];
        if (isRendererEnabled(n1eVar)) {
            return;
        }
        oja readingPeriod = this.f53905V1.getReadingPeriod();
        boolean z2 = readingPeriod == this.f53905V1.getPlayingPeriod();
        q7h trackSelectorResult = readingPeriod.getTrackSelectorResult();
        r1e r1eVar = trackSelectorResult.f73447b[i];
        kq6[] formats = getFormats(trackSelectorResult.f73448c[i]);
        boolean z3 = shouldPlayWhenReady() && this.f53917d2.f62802e == 3;
        boolean z4 = !z && z3;
        this.f53932p2++;
        this.f53912b.add(n1eVar);
        n1eVar.enable(r1eVar, formats, readingPeriod.f67822c[i], this.f53934r2, z4, z2, readingPeriod.getStartPositionRendererTime(), readingPeriod.getRendererOffset());
        n1eVar.handleMessage(11, new C8340a());
        this.f53906X.onRendererEnabled(n1eVar);
        if (z3) {
            n1eVar.start();
        }
    }

    private void enableRenderers() throws ba5 {
        enableRenderers(new boolean[this.f53910a.length]);
    }

    private void ensureStopped(n1e n1eVar) {
        if (n1eVar.getState() == 2) {
            n1eVar.stop();
        }
    }

    private kx7<Metadata> extractMetadataFromTrackSelectionArray(pf5[] pf5VarArr) {
        kx7.C8541a c8541a = new kx7.C8541a();
        boolean z = false;
        for (pf5 pf5Var : pf5VarArr) {
            if (pf5Var != null) {
                Metadata metadata = pf5Var.getFormat(0).f54987H;
                if (metadata == null) {
                    c8541a.add(new Metadata(new Metadata.Entry[0]));
                } else {
                    c8541a.add(metadata);
                    z = true;
                }
            }
        }
        return z ? c8541a.build() : kx7.m15110of();
    }

    private long getCurrentLiveOffsetUs() {
        myc mycVar = this.f53917d2;
        return getLiveOffsetUs(mycVar.f62798a, mycVar.f62799b.f71106a, mycVar.f62815r);
    }

    private static kq6[] getFormats(pf5 pf5Var) {
        int length = pf5Var != null ? pf5Var.length() : 0;
        kq6[] kq6VarArr = new kq6[length];
        for (int i = 0; i < length; i++) {
            kq6VarArr[i] = pf5Var.getFormat(i);
        }
        return kq6VarArr;
    }

    private long getLiveOffsetUs(t1h t1hVar, Object obj, long j) {
        t1hVar.getWindow(t1hVar.getPeriodByUid(obj, this.f53901M).f83398c, this.f53900L);
        t1h.C12851d c12851d = this.f53900L;
        if (c12851d.f83439f != -9223372036854775807L && c12851d.isLive()) {
            t1h.C12851d c12851d2 = this.f53900L;
            if (c12851d2.f83425F) {
                return x0i.msToUs(c12851d2.getCurrentUnixTimeMs() - this.f53900L.f83439f) - (j + this.f53901M.getPositionInWindowUs());
            }
        }
        return -9223372036854775807L;
    }

    private long getMaxRendererReadPositionUs() {
        oja readingPeriod = this.f53905V1.getReadingPeriod();
        if (readingPeriod == null) {
            return 0L;
        }
        long rendererOffset = readingPeriod.getRendererOffset();
        if (!readingPeriod.f67823d) {
            return rendererOffset;
        }
        int i = 0;
        while (true) {
            n1e[] n1eVarArr = this.f53910a;
            if (i >= n1eVarArr.length) {
                return rendererOffset;
            }
            if (isRendererEnabled(n1eVarArr[i]) && this.f53910a[i].getStream() == readingPeriod.f67822c[i]) {
                long readingPositionUs = this.f53910a[i].getReadingPositionUs();
                if (readingPositionUs == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                rendererOffset = Math.max(readingPositionUs, rendererOffset);
            }
            i++;
        }
    }

    private Pair<vna.C14175b, Long> getPlaceholderFirstMediaPeriodPositionUs(t1h t1hVar) {
        if (t1hVar.isEmpty()) {
            return Pair.create(myc.getDummyPeriodForEmptyTimeline(), 0L);
        }
        Pair<Object, Long> periodPositionUs = t1hVar.getPeriodPositionUs(this.f53900L, this.f53901M, t1hVar.getFirstWindowIndex(this.f53927l2), -9223372036854775807L);
        vna.C14175b c14175bResolveMediaPeriodIdForAdsAfterPeriodPositionChange = this.f53905V1.resolveMediaPeriodIdForAdsAfterPeriodPositionChange(t1hVar, periodPositionUs.first, 0L);
        long jLongValue = ((Long) periodPositionUs.second).longValue();
        if (c14175bResolveMediaPeriodIdForAdsAfterPeriodPositionChange.isAd()) {
            t1hVar.getPeriodByUid(c14175bResolveMediaPeriodIdForAdsAfterPeriodPositionChange.f71106a, this.f53901M);
            jLongValue = c14175bResolveMediaPeriodIdForAdsAfterPeriodPositionChange.f71108c == this.f53901M.getFirstAdIndexToPlay(c14175bResolveMediaPeriodIdForAdsAfterPeriodPositionChange.f71107b) ? this.f53901M.getAdResumePositionUs() : 0L;
        }
        return Pair.create(c14175bResolveMediaPeriodIdForAdsAfterPeriodPositionChange, Long.valueOf(jLongValue));
    }

    private long getTotalBufferedDurationUs() {
        return getTotalBufferedDurationUs(this.f53917d2.f62813p);
    }

    private void handleContinueLoadingRequested(nja njaVar) {
        if (this.f53905V1.isLoading(njaVar)) {
            this.f53905V1.reevaluateBuffer(this.f53934r2);
            maybeContinueLoading();
        }
    }

    private void handleIoException(IOException iOException, int i) {
        ba5 ba5VarCreateForSource = ba5.createForSource(iOException, i);
        oja playingPeriod = this.f53905V1.getPlayingPeriod();
        if (playingPeriod != null) {
            ba5VarCreateForSource = ba5VarCreateForSource.m3017b(playingPeriod.f67825f.f74599a);
        }
        yh9.m25916e("ExoPlayerImplInternal", "Playback error", ba5VarCreateForSource);
        stopInternal(false, false);
        this.f53917d2 = this.f53917d2.copyWithPlaybackError(ba5VarCreateForSource);
    }

    private void handleLoadingMediaPeriodChanged(boolean z) {
        oja loadingPeriod = this.f53905V1.getLoadingPeriod();
        vna.C14175b c14175b = loadingPeriod == null ? this.f53917d2.f62799b : loadingPeriod.f67825f.f74599a;
        boolean zEquals = this.f53917d2.f62808k.equals(c14175b);
        if (!zEquals) {
            this.f53917d2 = this.f53917d2.copyWithLoadingMediaPeriodId(c14175b);
        }
        myc mycVar = this.f53917d2;
        mycVar.f62813p = loadingPeriod == null ? mycVar.f62815r : loadingPeriod.getBufferedPositionUs();
        this.f53917d2.f62814q = getTotalBufferedDurationUs();
        if ((!zEquals || z) && loadingPeriod != null && loadingPeriod.f67823d) {
            updateLoadControlTrackSelection(loadingPeriod.f67825f.f74599a, loadingPeriod.getTrackGroups(), loadingPeriod.getTrackSelectorResult());
        }
    }

    /* JADX WARN: Not initialized variable reg: 25, insn: 0x007c: MOVE (r5 I:??[long, double]) = (r25 I:??[long, double]), block:B:27:0x007b */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void handleMediaSourceListInfoRefreshed(p000.t1h r28, boolean r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 469
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.kf5.handleMediaSourceListInfoRefreshed(t1h, boolean):void");
    }

    private void handlePeriodPrepared(nja njaVar) throws ba5 {
        if (this.f53905V1.isLoading(njaVar)) {
            oja loadingPeriod = this.f53905V1.getLoadingPeriod();
            loadingPeriod.handlePrepared(this.f53906X.getPlaybackParameters().f76315a, this.f53917d2.f62798a);
            updateLoadControlTrackSelection(loadingPeriod.f67825f.f74599a, loadingPeriod.getTrackGroups(), loadingPeriod.getTrackSelectorResult());
            if (loadingPeriod == this.f53905V1.getPlayingPeriod()) {
                resetRendererPosition(loadingPeriod.f67825f.f74600b);
                enableRenderers();
                myc mycVar = this.f53917d2;
                vna.C14175b c14175b = mycVar.f62799b;
                long j = loadingPeriod.f67825f.f74600b;
                this.f53917d2 = handlePositionDiscontinuity(c14175b, j, mycVar.f62800c, j, false, 5);
            }
            maybeContinueLoading();
        }
    }

    private void handlePlaybackParameters(qyc qycVar, boolean z) throws ba5 {
        handlePlaybackParameters(qycVar, qycVar.f76315a, true, z);
    }

    @yx1
    private myc handlePositionDiscontinuity(vna.C14175b c14175b, long j, long j2, long j3, boolean z, int i) {
        List<Metadata> listM15110of;
        m6h m6hVar;
        q7h q7hVar;
        this.f53936t2 = (!this.f53936t2 && j == this.f53917d2.f62815r && c14175b.equals(this.f53917d2.f62799b)) ? false : true;
        resetPendingPauseAtEndOfPeriod();
        myc mycVar = this.f53917d2;
        m6h m6hVar2 = mycVar.f62805h;
        q7h q7hVar2 = mycVar.f62806i;
        List<Metadata> list = mycVar.f62807j;
        if (this.f53909Z1.isPrepared()) {
            oja playingPeriod = this.f53905V1.getPlayingPeriod();
            m6h trackGroups = playingPeriod == null ? m6h.f60031e : playingPeriod.getTrackGroups();
            q7h trackSelectorResult = playingPeriod == null ? this.f53918e : playingPeriod.getTrackSelectorResult();
            kx7<Metadata> kx7VarExtractMetadataFromTrackSelectionArray = extractMetadataFromTrackSelectionArray(trackSelectorResult.f73448c);
            if (playingPeriod != null) {
                qja qjaVar = playingPeriod.f67825f;
                if (qjaVar.f74601c != j2) {
                    playingPeriod.f67825f = qjaVar.copyWithRequestedContentPositionUs(j2);
                }
            }
            m6hVar = trackGroups;
            q7hVar = trackSelectorResult;
            listM15110of = kx7VarExtractMetadataFromTrackSelectionArray;
        } else if (c14175b.equals(this.f53917d2.f62799b)) {
            listM15110of = list;
            m6hVar = m6hVar2;
            q7hVar = q7hVar2;
        } else {
            m6hVar = m6h.f60031e;
            q7hVar = this.f53918e;
            listM15110of = kx7.m15110of();
        }
        if (z) {
            this.f53919e2.setPositionDiscontinuity(i);
        }
        return this.f53917d2.copyWithNewPosition(c14175b, j, j2, j3, getTotalBufferedDurationUs(), m6hVar, q7hVar, listM15110of);
    }

    private boolean hasReachedServerSideInsertedAdsTransition(n1e n1eVar, oja ojaVar) {
        oja next = ojaVar.getNext();
        return ojaVar.f67825f.f74604f && next.f67823d && ((n1eVar instanceof pvg) || (n1eVar instanceof C3018a) || n1eVar.getReadingPositionUs() >= next.getStartPositionRendererTime());
    }

    private boolean hasReadingPeriodFinishedReading() {
        oja readingPeriod = this.f53905V1.getReadingPeriod();
        if (!readingPeriod.f67823d) {
            return false;
        }
        int i = 0;
        while (true) {
            n1e[] n1eVarArr = this.f53910a;
            if (i >= n1eVarArr.length) {
                return true;
            }
            n1e n1eVar = n1eVarArr[i];
            nle nleVar = readingPeriod.f67822c[i];
            if (n1eVar.getStream() != nleVar || (nleVar != null && !n1eVar.hasReadStreamToEnd() && !hasReachedServerSideInsertedAdsTransition(n1eVar, readingPeriod))) {
                break;
            }
            i++;
        }
        return false;
    }

    private static boolean isIgnorableServerSideAdInsertionPeriodChange(boolean z, vna.C14175b c14175b, long j, vna.C14175b c14175b2, t1h.C12849b c12849b, long j2) {
        if (!z && j == j2 && c14175b.f71106a.equals(c14175b2.f71106a)) {
            return (c14175b.isAd() && c12849b.isServerSideInsertedAdGroup(c14175b.f71107b)) ? (c12849b.getAdState(c14175b.f71107b, c14175b.f71108c) == 4 || c12849b.getAdState(c14175b.f71107b, c14175b.f71108c) == 2) ? false : true : c14175b2.isAd() && c12849b.isServerSideInsertedAdGroup(c14175b2.f71107b);
        }
        return false;
    }

    private boolean isLoadingPossible() {
        oja loadingPeriod = this.f53905V1.getLoadingPeriod();
        return (loadingPeriod == null || loadingPeriod.getNextLoadPositionUs() == Long.MIN_VALUE) ? false : true;
    }

    private static boolean isRendererEnabled(n1e n1eVar) {
        return n1eVar.getState() != 0;
    }

    private boolean isTimelineReady() {
        oja playingPeriod = this.f53905V1.getPlayingPeriod();
        long j = playingPeriod.f67825f.f74603e;
        return playingPeriod.f67823d && (j == -9223372036854775807L || this.f53917d2.f62815r < j || !shouldPlayWhenReady());
    }

    private static boolean isUsingPlaceholderPeriod(myc mycVar, t1h.C12849b c12849b) {
        vna.C14175b c14175b = mycVar.f62799b;
        t1h t1hVar = mycVar.f62798a;
        return t1hVar.isEmpty() || t1hVar.getPeriodByUid(c14175b.f71106a, c12849b).f83401f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean lambda$release$0() {
        return Boolean.valueOf(this.f53921f2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendMessageToTargetThread$1(l0d l0dVar) {
        try {
            deliverMessage(l0dVar);
        } catch (ba5 e) {
            yh9.m25916e("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e);
            throw new RuntimeException(e);
        }
    }

    private void maybeContinueLoading() {
        boolean zShouldContinueLoading = shouldContinueLoading();
        this.f53925j2 = zShouldContinueLoading;
        if (zShouldContinueLoading) {
            this.f53905V1.getLoadingPeriod().continueLoading(this.f53934r2);
        }
        updateIsLoading();
    }

    private void maybeNotifyPlaybackInfoChanged() {
        this.f53919e2.setPlaybackInfo(this.f53917d2);
        if (this.f53919e2.f53953a) {
            this.f53902M1.onPlaybackInfoUpdate(this.f53919e2);
            this.f53919e2 = new C8344e(this.f53917d2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x0079, code lost:
    
        r3 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void maybeTriggerPendingMessages(long r9, long r11) throws p000.ba5 {
        /*
            Method dump skipped, instruction units count: 253
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.kf5.maybeTriggerPendingMessages(long, long):void");
    }

    private void maybeUpdateLoadingPeriod() throws ba5 {
        qja nextMediaPeriodInfo;
        this.f53905V1.reevaluateBuffer(this.f53934r2);
        if (this.f53905V1.shouldLoadNextMediaPeriod() && (nextMediaPeriodInfo = this.f53905V1.getNextMediaPeriodInfo(this.f53934r2, this.f53917d2)) != null) {
            oja ojaVarEnqueueNextMediaPeriodHolder = this.f53905V1.enqueueNextMediaPeriodHolder(this.f53914c, this.f53916d, this.f53920f.getAllocator(), this.f53909Z1, nextMediaPeriodInfo, this.f53918e);
            ojaVarEnqueueNextMediaPeriodHolder.f67820a.prepare(this, nextMediaPeriodInfo.f74600b);
            if (this.f53905V1.getPlayingPeriod() == ojaVarEnqueueNextMediaPeriodHolder) {
                resetRendererPosition(nextMediaPeriodInfo.f74600b);
            }
            handleLoadingMediaPeriodChanged(false);
        }
        if (!this.f53925j2) {
            maybeContinueLoading();
        } else {
            this.f53925j2 = isLoadingPossible();
            updateIsLoading();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void maybeUpdatePlayingPeriod() throws p000.ba5 {
        /*
            r14 = this;
            r0 = 0
            r1 = r0
        L2:
            boolean r2 = r14.shouldAdvancePlayingPeriod()
            if (r2 == 0) goto L61
            if (r1 == 0) goto Ld
            r14.maybeNotifyPlaybackInfoChanged()
        Ld:
            uja r1 = r14.f53905V1
            oja r1 = r1.advancePlayingPeriod()
            java.lang.Object r1 = p000.u80.checkNotNull(r1)
            oja r1 = (p000.oja) r1
            myc r2 = r14.f53917d2
            vna$b r2 = r2.f62799b
            java.lang.Object r2 = r2.f71106a
            qja r3 = r1.f67825f
            vna$b r3 = r3.f74599a
            java.lang.Object r3 = r3.f71106a
            boolean r2 = r2.equals(r3)
            r3 = 1
            if (r2 == 0) goto L45
            myc r2 = r14.f53917d2
            vna$b r2 = r2.f62799b
            int r4 = r2.f71107b
            r5 = -1
            if (r4 != r5) goto L45
            qja r4 = r1.f67825f
            vna$b r4 = r4.f74599a
            int r6 = r4.f71107b
            if (r6 != r5) goto L45
            int r2 = r2.f71110e
            int r4 = r4.f71110e
            if (r2 == r4) goto L45
            r2 = r3
            goto L46
        L45:
            r2 = r0
        L46:
            qja r1 = r1.f67825f
            vna$b r5 = r1.f74599a
            long r10 = r1.f74600b
            long r8 = r1.f74601c
            r12 = r2 ^ 1
            r13 = 0
            r4 = r14
            r6 = r10
            myc r1 = r4.handlePositionDiscontinuity(r5, r6, r8, r10, r12, r13)
            r14.f53917d2 = r1
            r14.resetPendingPauseAtEndOfPeriod()
            r14.updatePlaybackPositions()
            r1 = r3
            goto L2
        L61:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.kf5.maybeUpdatePlayingPeriod():void");
    }

    private void maybeUpdateReadingPeriod() throws ba5 {
        oja readingPeriod = this.f53905V1.getReadingPeriod();
        if (readingPeriod == null) {
            return;
        }
        int i = 0;
        if (readingPeriod.getNext() != null && !this.f53923h2) {
            if (hasReadingPeriodFinishedReading()) {
                if (readingPeriod.getNext().f67823d || this.f53934r2 >= readingPeriod.getNext().getStartPositionRendererTime()) {
                    q7h trackSelectorResult = readingPeriod.getTrackSelectorResult();
                    oja ojaVarAdvanceReadingPeriod = this.f53905V1.advanceReadingPeriod();
                    q7h trackSelectorResult2 = ojaVarAdvanceReadingPeriod.getTrackSelectorResult();
                    t1h t1hVar = this.f53917d2.f62798a;
                    updatePlaybackSpeedSettingsForNewPeriod(t1hVar, ojaVarAdvanceReadingPeriod.f67825f.f74599a, t1hVar, readingPeriod.f67825f.f74599a, -9223372036854775807L, false);
                    if (ojaVarAdvanceReadingPeriod.f67823d && ojaVarAdvanceReadingPeriod.f67820a.readDiscontinuity() != -9223372036854775807L) {
                        setAllRendererStreamsFinal(ojaVarAdvanceReadingPeriod.getStartPositionRendererTime());
                        return;
                    }
                    for (int i2 = 0; i2 < this.f53910a.length; i2++) {
                        boolean zIsRendererEnabled = trackSelectorResult.isRendererEnabled(i2);
                        boolean zIsRendererEnabled2 = trackSelectorResult2.isRendererEnabled(i2);
                        if (zIsRendererEnabled && !this.f53910a[i2].isCurrentStreamFinal()) {
                            boolean z = this.f53914c[i2].getTrackType() == -2;
                            r1e r1eVar = trackSelectorResult.f73447b[i2];
                            r1e r1eVar2 = trackSelectorResult2.f73447b[i2];
                            if (!zIsRendererEnabled2 || !r1eVar2.equals(r1eVar) || z) {
                                setCurrentStreamFinal(this.f53910a[i2], ojaVarAdvanceReadingPeriod.getStartPositionRendererTime());
                            }
                        }
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (!readingPeriod.f67825f.f74607i && !this.f53923h2) {
            return;
        }
        while (true) {
            n1e[] n1eVarArr = this.f53910a;
            if (i >= n1eVarArr.length) {
                return;
            }
            n1e n1eVar = n1eVarArr[i];
            nle nleVar = readingPeriod.f67822c[i];
            if (nleVar != null && n1eVar.getStream() == nleVar && n1eVar.hasReadStreamToEnd()) {
                long j = readingPeriod.f67825f.f74603e;
                setCurrentStreamFinal(n1eVar, (j == -9223372036854775807L || j == Long.MIN_VALUE) ? -9223372036854775807L : readingPeriod.getRendererOffset() + readingPeriod.f67825f.f74603e);
            }
            i++;
        }
    }

    private void maybeUpdateReadingRenderers() throws ba5 {
        oja readingPeriod = this.f53905V1.getReadingPeriod();
        if (readingPeriod == null || this.f53905V1.getPlayingPeriod() == readingPeriod || readingPeriod.f67826g || !replaceStreamsOrDisableRendererForTransition()) {
            return;
        }
        enableRenderers();
    }

    private void mediaSourceListUpdateRequestedInternal() throws Throwable {
        handleMediaSourceListInfoRefreshed(this.f53909Z1.createTimeline(), true);
    }

    private void moveMediaItemsInternal(C8342c c8342c) throws Throwable {
        this.f53919e2.incrementPendingOperationAcks(1);
        handleMediaSourceListInfoRefreshed(this.f53909Z1.moveMediaSourceRange(c8342c.f53945a, c8342c.f53946b, c8342c.f53947c, c8342c.f53948d), false);
    }

    private void notifyTrackSelectionDiscontinuity() {
        for (oja playingPeriod = this.f53905V1.getPlayingPeriod(); playingPeriod != null; playingPeriod = playingPeriod.getNext()) {
            for (pf5 pf5Var : playingPeriod.getTrackSelectorResult().f73448c) {
                if (pf5Var != null) {
                    pf5Var.onDiscontinuity();
                }
            }
        }
    }

    private void notifyTrackSelectionPlayWhenReadyChanged(boolean z) {
        for (oja playingPeriod = this.f53905V1.getPlayingPeriod(); playingPeriod != null; playingPeriod = playingPeriod.getNext()) {
            for (pf5 pf5Var : playingPeriod.getTrackSelectorResult().f73448c) {
                if (pf5Var != null) {
                    pf5Var.onPlayWhenReadyChanged(z);
                }
            }
        }
    }

    private void notifyTrackSelectionRebuffer() {
        for (oja playingPeriod = this.f53905V1.getPlayingPeriod(); playingPeriod != null; playingPeriod = playingPeriod.getNext()) {
            for (pf5 pf5Var : playingPeriod.getTrackSelectorResult().f73448c) {
                if (pf5Var != null) {
                    pf5Var.onRebuffer();
                }
            }
        }
    }

    private void prepareInternal() {
        this.f53919e2.incrementPendingOperationAcks(1);
        resetInternal(false, false, false, true);
        this.f53920f.onPrepared();
        setState(this.f53917d2.f62798a.isEmpty() ? 4 : 2);
        this.f53909Z1.prepare(this.f53928m.getTransferListener());
        this.f53897C.sendEmptyMessage(2);
    }

    private void releaseInternal() {
        resetInternal(true, false, true, false);
        releaseRenderers();
        this.f53920f.onReleased();
        setState(1);
        HandlerThread handlerThread = this.f53898F;
        if (handlerThread != null) {
            handlerThread.quit();
        }
        synchronized (this) {
            this.f53921f2 = true;
            notifyAll();
        }
    }

    private void releaseRenderers() {
        for (int i = 0; i < this.f53910a.length; i++) {
            this.f53914c[i].clearListener();
            this.f53910a[i].release();
        }
    }

    private void removeMediaItemsInternal(int i, int i2, sbf sbfVar) throws Throwable {
        this.f53919e2.incrementPendingOperationAcks(1);
        handleMediaSourceListInfoRefreshed(this.f53909Z1.removeMediaSourceRange(i, i2, sbfVar), false);
    }

    private boolean replaceStreamsOrDisableRendererForTransition() throws ba5 {
        oja readingPeriod = this.f53905V1.getReadingPeriod();
        q7h trackSelectorResult = readingPeriod.getTrackSelectorResult();
        int i = 0;
        boolean z = false;
        while (true) {
            n1e[] n1eVarArr = this.f53910a;
            if (i >= n1eVarArr.length) {
                return !z;
            }
            n1e n1eVar = n1eVarArr[i];
            if (isRendererEnabled(n1eVar)) {
                boolean z2 = n1eVar.getStream() != readingPeriod.f67822c[i];
                if (!trackSelectorResult.isRendererEnabled(i) || z2) {
                    if (!n1eVar.isCurrentStreamFinal()) {
                        n1eVar.replaceStream(getFormats(trackSelectorResult.f73448c[i]), readingPeriod.f67822c[i], readingPeriod.getStartPositionRendererTime(), readingPeriod.getRendererOffset());
                    } else if (n1eVar.isEnded()) {
                        disableRenderer(n1eVar);
                    } else {
                        z = true;
                    }
                }
            }
            i++;
        }
    }

    private void reselectTracksInternal() throws ba5 {
        float f = this.f53906X.getPlaybackParameters().f76315a;
        oja readingPeriod = this.f53905V1.getReadingPeriod();
        boolean z = true;
        for (oja playingPeriod = this.f53905V1.getPlayingPeriod(); playingPeriod != null && playingPeriod.f67823d; playingPeriod = playingPeriod.getNext()) {
            q7h q7hVarSelectTracks = playingPeriod.selectTracks(f, this.f53917d2.f62798a);
            if (!q7hVarSelectTracks.isEquivalent(playingPeriod.getTrackSelectorResult())) {
                if (z) {
                    oja playingPeriod2 = this.f53905V1.getPlayingPeriod();
                    boolean zRemoveAfter = this.f53905V1.removeAfter(playingPeriod2);
                    boolean[] zArr = new boolean[this.f53910a.length];
                    long jApplyTrackSelection = playingPeriod2.applyTrackSelection(q7hVarSelectTracks, this.f53917d2.f62815r, zRemoveAfter, zArr);
                    myc mycVar = this.f53917d2;
                    boolean z2 = (mycVar.f62802e == 4 || jApplyTrackSelection == mycVar.f62815r) ? false : true;
                    myc mycVar2 = this.f53917d2;
                    this.f53917d2 = handlePositionDiscontinuity(mycVar2.f62799b, jApplyTrackSelection, mycVar2.f62800c, mycVar2.f62801d, z2, 5);
                    if (z2) {
                        resetRendererPosition(jApplyTrackSelection);
                    }
                    boolean[] zArr2 = new boolean[this.f53910a.length];
                    int i = 0;
                    while (true) {
                        n1e[] n1eVarArr = this.f53910a;
                        if (i >= n1eVarArr.length) {
                            break;
                        }
                        n1e n1eVar = n1eVarArr[i];
                        boolean zIsRendererEnabled = isRendererEnabled(n1eVar);
                        zArr2[i] = zIsRendererEnabled;
                        nle nleVar = playingPeriod2.f67822c[i];
                        if (zIsRendererEnabled) {
                            if (nleVar != n1eVar.getStream()) {
                                disableRenderer(n1eVar);
                            } else if (zArr[i]) {
                                n1eVar.resetPosition(this.f53934r2);
                            }
                        }
                        i++;
                    }
                    enableRenderers(zArr2);
                } else {
                    this.f53905V1.removeAfter(playingPeriod);
                    if (playingPeriod.f67823d) {
                        playingPeriod.applyTrackSelection(q7hVarSelectTracks, Math.max(playingPeriod.f67825f.f74600b, playingPeriod.toPeriodTime(this.f53934r2)), false);
                    }
                }
                handleLoadingMediaPeriodChanged(true);
                if (this.f53917d2.f62802e != 4) {
                    maybeContinueLoading();
                    updatePlaybackPositions();
                    this.f53897C.sendEmptyMessage(2);
                    return;
                }
                return;
            }
            if (playingPeriod == readingPeriod) {
                z = false;
            }
        }
    }

    private void reselectTracksInternalAndSeek() throws ba5 {
        reselectTracksInternal();
        seekToCurrentPosition(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00a5 A[PHI: r4 r5 r7
  0x00a5: PHI (r4v3 vna$b) = (r4v2 vna$b), (r4v7 vna$b) binds: [B:30:0x0079, B:32:0x009e] A[DONT_GENERATE, DONT_INLINE]
  0x00a5: PHI (r5v2 long) = (r5v1 long), (r5v16 long) binds: [B:30:0x0079, B:32:0x009e] A[DONT_GENERATE, DONT_INLINE]
  0x00a5: PHI (r7v3 long) = (r7v2 long), (r7v6 long) binds: [B:30:0x0079, B:32:0x009e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ed A[PHI: r3
  0x00ed: PHI (r3v3 t1h) = (r3v2 t1h), (r3v2 t1h), (r3v6 t1h), (r3v6 t1h) binds: [B:37:0x00b2, B:39:0x00b6, B:41:0x00c7, B:43:0x00de] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void resetInternal(boolean r32, boolean r33, boolean r34, boolean r35) {
        /*
            Method dump skipped, instruction units count: 325
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.kf5.resetInternal(boolean, boolean, boolean, boolean):void");
    }

    private void resetPendingPauseAtEndOfPeriod() {
        oja playingPeriod = this.f53905V1.getPlayingPeriod();
        this.f53923h2 = playingPeriod != null && playingPeriod.f67825f.f74606h && this.f53922g2;
    }

    private void resetRendererPosition(long j) throws ba5 {
        oja playingPeriod = this.f53905V1.getPlayingPeriod();
        long rendererTime = playingPeriod == null ? j + 1000000000000L : playingPeriod.toRendererTime(j);
        this.f53934r2 = rendererTime;
        this.f53906X.resetPosition(rendererTime);
        for (n1e n1eVar : this.f53910a) {
            if (isRendererEnabled(n1eVar)) {
                n1eVar.resetPosition(this.f53934r2);
            }
        }
        notifyTrackSelectionDiscontinuity();
    }

    private static void resolvePendingMessageEndOfStreamPosition(t1h t1hVar, C8343d c8343d, t1h.C12851d c12851d, t1h.C12849b c12849b) {
        int i = t1hVar.getWindow(t1hVar.getPeriodByUid(c8343d.f53952d, c12849b).f83398c, c12851d).f83432Y;
        Object obj = t1hVar.getPeriod(i, c12849b, true).f83397b;
        long j = c12849b.f83399d;
        c8343d.setResolvedPosition(i, j != -9223372036854775807L ? j - 1 : Long.MAX_VALUE, obj);
    }

    private static boolean resolvePendingMessagePosition(C8343d c8343d, t1h t1hVar, t1h t1hVar2, int i, boolean z, t1h.C12851d c12851d, t1h.C12849b c12849b) {
        Object obj = c8343d.f53952d;
        if (obj == null) {
            Pair<Object, Long> pairResolveSeekPositionUs = resolveSeekPositionUs(t1hVar, new C8347h(c8343d.f53949a.getTimeline(), c8343d.f53949a.getMediaItemIndex(), c8343d.f53949a.getPositionMs() == Long.MIN_VALUE ? -9223372036854775807L : x0i.msToUs(c8343d.f53949a.getPositionMs())), false, i, z, c12851d, c12849b);
            if (pairResolveSeekPositionUs == null) {
                return false;
            }
            c8343d.setResolvedPosition(t1hVar.getIndexOfPeriod(pairResolveSeekPositionUs.first), ((Long) pairResolveSeekPositionUs.second).longValue(), pairResolveSeekPositionUs.first);
            if (c8343d.f53949a.getPositionMs() == Long.MIN_VALUE) {
                resolvePendingMessageEndOfStreamPosition(t1hVar, c8343d, c12851d, c12849b);
            }
            return true;
        }
        int indexOfPeriod = t1hVar.getIndexOfPeriod(obj);
        if (indexOfPeriod == -1) {
            return false;
        }
        if (c8343d.f53949a.getPositionMs() == Long.MIN_VALUE) {
            resolvePendingMessageEndOfStreamPosition(t1hVar, c8343d, c12851d, c12849b);
            return true;
        }
        c8343d.f53950b = indexOfPeriod;
        t1hVar2.getPeriodByUid(c8343d.f53952d, c12849b);
        if (c12849b.f83401f && t1hVar2.getWindow(c12849b.f83398c, c12851d).f83431X == t1hVar2.getIndexOfPeriod(c8343d.f53952d)) {
            Pair<Object, Long> periodPositionUs = t1hVar.getPeriodPositionUs(c12851d, c12849b, t1hVar.getPeriodByUid(c8343d.f53952d, c12849b).f83398c, c8343d.f53951c + c12849b.getPositionInWindowUs());
            c8343d.setResolvedPosition(t1hVar.getIndexOfPeriod(periodPositionUs.first), ((Long) periodPositionUs.second).longValue(), periodPositionUs.first);
        }
        return true;
    }

    private void resolvePendingMessagePositions(t1h t1hVar, t1h t1hVar2) {
        if (t1hVar.isEmpty() && t1hVar2.isEmpty()) {
            return;
        }
        for (int size = this.f53907Y.size() - 1; size >= 0; size--) {
            if (!resolvePendingMessagePosition(this.f53907Y.get(size), t1hVar, t1hVar2, this.f53926k2, this.f53927l2, this.f53900L, this.f53901M)) {
                this.f53907Y.get(size).f53949a.markAsProcessed(false);
                this.f53907Y.remove(size);
            }
        }
        Collections.sort(this.f53907Y);
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static p000.kf5.C8346g resolvePositionForPlaylistChange(p000.t1h r30, p000.myc r31, @p000.hib p000.kf5.C8347h r32, p000.uja r33, int r34, boolean r35, p000.t1h.C12851d r36, p000.t1h.C12849b r37) {
        /*
            Method dump skipped, instruction units count: 492
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.kf5.resolvePositionForPlaylistChange(t1h, myc, kf5$h, uja, int, boolean, t1h$d, t1h$b):kf5$g");
    }

    @hib
    private static Pair<Object, Long> resolveSeekPositionUs(t1h t1hVar, C8347h c8347h, boolean z, int i, boolean z2, t1h.C12851d c12851d, t1h.C12849b c12849b) {
        Pair<Object, Long> periodPositionUs;
        Object objM14712e;
        t1h t1hVar2 = c8347h.f53966a;
        if (t1hVar.isEmpty()) {
            return null;
        }
        t1h t1hVar3 = t1hVar2.isEmpty() ? t1hVar : t1hVar2;
        try {
            periodPositionUs = t1hVar3.getPeriodPositionUs(c12851d, c12849b, c8347h.f53967b, c8347h.f53968c);
        } catch (IndexOutOfBoundsException unused) {
        }
        if (t1hVar.equals(t1hVar3)) {
            return periodPositionUs;
        }
        if (t1hVar.getIndexOfPeriod(periodPositionUs.first) != -1) {
            return (t1hVar3.getPeriodByUid(periodPositionUs.first, c12849b).f83401f && t1hVar3.getWindow(c12849b.f83398c, c12851d).f83431X == t1hVar3.getIndexOfPeriod(periodPositionUs.first)) ? t1hVar.getPeriodPositionUs(c12851d, c12849b, t1hVar.getPeriodByUid(periodPositionUs.first, c12849b).f83398c, c8347h.f53968c) : periodPositionUs;
        }
        if (z && (objM14712e = m14712e(c12851d, c12849b, i, z2, periodPositionUs.first, t1hVar3, t1hVar)) != null) {
            return t1hVar.getPeriodPositionUs(c12851d, c12849b, t1hVar.getPeriodByUid(objM14712e, c12849b).f83398c, -9223372036854775807L);
        }
        return null;
    }

    private void scheduleNextWork(long j, long j2) {
        this.f53897C.sendEmptyMessageAtTime(2, j + j2);
    }

    private void seekToCurrentPosition(boolean z) throws ba5 {
        vna.C14175b c14175b = this.f53905V1.getPlayingPeriod().f67825f.f74599a;
        long jSeekToPeriodPosition = seekToPeriodPosition(c14175b, this.f53917d2.f62815r, true, false);
        if (jSeekToPeriodPosition != this.f53917d2.f62815r) {
            myc mycVar = this.f53917d2;
            this.f53917d2 = handlePositionDiscontinuity(c14175b, jSeekToPeriodPosition, mycVar.f62800c, mycVar.f62801d, z, 5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00ac A[Catch: all -> 0x00af, TryCatch #1 {all -> 0x00af, blocks: (B:22:0x00a2, B:24:0x00ac, B:29:0x00b6, B:31:0x00bc, B:32:0x00bf, B:34:0x00c5, B:36:0x00cf, B:38:0x00d7, B:42:0x00df, B:44:0x00e9, B:46:0x00f9, B:50:0x0103, B:54:0x0115, B:58:0x011e), top: B:74:0x00a2 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void seekToInternal(p000.kf5.C8347h r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 345
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.kf5.seekToInternal(kf5$h):void");
    }

    private long seekToPeriodPosition(vna.C14175b c14175b, long j, boolean z) throws ba5 {
        return seekToPeriodPosition(c14175b, j, this.f53905V1.getPlayingPeriod() != this.f53905V1.getReadingPeriod(), z);
    }

    private void sendMessageInternal(l0d l0dVar) throws ba5 {
        if (l0dVar.getPositionMs() == -9223372036854775807L) {
            sendMessageToTarget(l0dVar);
            return;
        }
        if (this.f53917d2.f62798a.isEmpty()) {
            this.f53907Y.add(new C8343d(l0dVar));
            return;
        }
        C8343d c8343d = new C8343d(l0dVar);
        t1h t1hVar = this.f53917d2.f62798a;
        if (!resolvePendingMessagePosition(c8343d, t1hVar, t1hVar, this.f53926k2, this.f53927l2, this.f53900L, this.f53901M)) {
            l0dVar.markAsProcessed(false);
        } else {
            this.f53907Y.add(c8343d);
            Collections.sort(this.f53907Y);
        }
    }

    private void sendMessageToTarget(l0d l0dVar) throws ba5 {
        if (l0dVar.getLooper() != this.f53899H) {
            this.f53897C.obtainMessage(15, l0dVar).sendToTarget();
            return;
        }
        deliverMessage(l0dVar);
        int i = this.f53917d2.f62802e;
        if (i == 3 || i == 2) {
            this.f53897C.sendEmptyMessage(2);
        }
    }

    private void sendMessageToTargetThread(final l0d l0dVar) {
        Looper looper = l0dVar.getLooper();
        if (looper.getThread().isAlive()) {
            this.f53908Z.createHandler(looper, null).post(new Runnable() { // from class: hf5
                @Override // java.lang.Runnable
                public final void run() {
                    this.f43364a.lambda$sendMessageToTargetThread$1(l0dVar);
                }
            });
        } else {
            yh9.m25919w("TAG", "Trying to send message on a dead thread.");
            l0dVar.markAsProcessed(false);
        }
    }

    private void setAllRendererStreamsFinal(long j) {
        for (n1e n1eVar : this.f53910a) {
            if (n1eVar.getStream() != null) {
                setCurrentStreamFinal(n1eVar, j);
            }
        }
    }

    private void setCurrentStreamFinal(n1e n1eVar, long j) {
        n1eVar.setCurrentStreamFinal();
        if (n1eVar instanceof pvg) {
            ((pvg) n1eVar).setFinalStreamEndPositionUs(j);
        }
    }

    private void setForegroundModeInternal(boolean z, @hib AtomicBoolean atomicBoolean) {
        if (this.f53929m2 != z) {
            this.f53929m2 = z;
            if (!z) {
                for (n1e n1eVar : this.f53910a) {
                    if (!isRendererEnabled(n1eVar) && this.f53912b.remove(n1eVar)) {
                        n1eVar.reset();
                    }
                }
            }
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    private void setMediaClockPlaybackParameters(qyc qycVar) {
        this.f53897C.removeMessages(16);
        this.f53906X.setPlaybackParameters(qycVar);
    }

    private void setMediaItemsInternal(C8341b c8341b) throws Throwable {
        this.f53919e2.incrementPendingOperationAcks(1);
        if (c8341b.f53943c != -1) {
            this.f53933q2 = new C8347h(new a1d(c8341b.f53941a, c8341b.f53942b), c8341b.f53943c, c8341b.f53944d);
        }
        handleMediaSourceListInfoRefreshed(this.f53909Z1.setMediaSources(c8341b.f53941a, c8341b.f53942b), false);
    }

    private void setOffloadSchedulingEnabledInternal(boolean z) {
        if (z == this.f53931o2) {
            return;
        }
        this.f53931o2 = z;
        if (z || !this.f53917d2.f62812o) {
            return;
        }
        this.f53897C.sendEmptyMessage(2);
    }

    private void setPauseAtEndOfWindowInternal(boolean z) throws ba5 {
        this.f53922g2 = z;
        resetPendingPauseAtEndOfPeriod();
        if (!this.f53923h2 || this.f53905V1.getReadingPeriod() == this.f53905V1.getPlayingPeriod()) {
            return;
        }
        seekToCurrentPosition(true);
        handleLoadingMediaPeriodChanged(false);
    }

    private void setPlayWhenReadyInternal(boolean z, int i, boolean z2, int i2) throws ba5 {
        this.f53919e2.incrementPendingOperationAcks(z2 ? 1 : 0);
        this.f53919e2.setPlayWhenReadyChangeReason(i2);
        this.f53917d2 = this.f53917d2.copyWithPlayWhenReady(z, i);
        this.f53924i2 = false;
        notifyTrackSelectionPlayWhenReadyChanged(z);
        if (!shouldPlayWhenReady()) {
            stopRenderers();
            updatePlaybackPositions();
            return;
        }
        int i3 = this.f53917d2.f62802e;
        if (i3 == 3) {
            startRenderers();
            this.f53897C.sendEmptyMessage(2);
        } else if (i3 == 2) {
            this.f53897C.sendEmptyMessage(2);
        }
    }

    private void setPlaybackParametersInternal(qyc qycVar) throws ba5 {
        setMediaClockPlaybackParameters(qycVar);
        handlePlaybackParameters(this.f53906X.getPlaybackParameters(), true);
    }

    private void setRepeatModeInternal(int i) throws ba5 {
        this.f53926k2 = i;
        if (!this.f53905V1.updateRepeatMode(this.f53917d2.f62798a, i)) {
            seekToCurrentPosition(true);
        }
        handleLoadingMediaPeriodChanged(false);
    }

    private void setSeekParametersInternal(iue iueVar) {
        this.f53915c2 = iueVar;
    }

    private void setShuffleModeEnabledInternal(boolean z) throws ba5 {
        this.f53927l2 = z;
        if (!this.f53905V1.updateShuffleModeEnabled(this.f53917d2.f62798a, z)) {
            seekToCurrentPosition(true);
        }
        handleLoadingMediaPeriodChanged(false);
    }

    private void setShuffleOrderInternal(sbf sbfVar) throws Throwable {
        this.f53919e2.incrementPendingOperationAcks(1);
        handleMediaSourceListInfoRefreshed(this.f53909Z1.setShuffleOrder(sbfVar), false);
    }

    private void setState(int i) {
        myc mycVar = this.f53917d2;
        if (mycVar.f62802e != i) {
            if (i != 2) {
                this.f53939w2 = -9223372036854775807L;
            }
            this.f53917d2 = mycVar.copyWithPlaybackState(i);
        }
    }

    private boolean shouldAdvancePlayingPeriod() {
        oja playingPeriod;
        oja next;
        return shouldPlayWhenReady() && !this.f53923h2 && (playingPeriod = this.f53905V1.getPlayingPeriod()) != null && (next = playingPeriod.getNext()) != null && this.f53934r2 >= next.getStartPositionRendererTime() && next.f67826g;
    }

    private boolean shouldContinueLoading() {
        if (!isLoadingPossible()) {
            return false;
        }
        oja loadingPeriod = this.f53905V1.getLoadingPeriod();
        long totalBufferedDurationUs = getTotalBufferedDurationUs(loadingPeriod.getNextLoadPositionUs());
        long periodTime = loadingPeriod == this.f53905V1.getPlayingPeriod() ? loadingPeriod.toPeriodTime(this.f53934r2) : loadingPeriod.toPeriodTime(this.f53934r2) - loadingPeriod.f67825f.f74600b;
        boolean zShouldContinueLoading = this.f53920f.shouldContinueLoading(periodTime, totalBufferedDurationUs, this.f53906X.getPlaybackParameters().f76315a);
        if (zShouldContinueLoading || totalBufferedDurationUs >= 500000) {
            return zShouldContinueLoading;
        }
        if (this.f53903N <= 0 && !this.f53904Q) {
            return zShouldContinueLoading;
        }
        this.f53905V1.getPlayingPeriod().f67820a.discardBuffer(this.f53917d2.f62815r, false);
        return this.f53920f.shouldContinueLoading(periodTime, totalBufferedDurationUs, this.f53906X.getPlaybackParameters().f76315a);
    }

    private boolean shouldPlayWhenReady() {
        myc mycVar = this.f53917d2;
        return mycVar.f62809l && mycVar.f62810m == 0;
    }

    private boolean shouldTransitionToReadyState(boolean z) {
        if (this.f53932p2 == 0) {
            return isTimelineReady();
        }
        if (!z) {
            return false;
        }
        if (!this.f53917d2.f62804g) {
            return true;
        }
        oja playingPeriod = this.f53905V1.getPlayingPeriod();
        long targetLiveOffsetUs = shouldUseLivePlaybackSpeedControl(this.f53917d2.f62798a, playingPeriod.f67825f.f74599a) ? this.f53911a2.getTargetLiveOffsetUs() : -9223372036854775807L;
        oja loadingPeriod = this.f53905V1.getLoadingPeriod();
        return (loadingPeriod.isFullyBuffered() && loadingPeriod.f67825f.f74607i) || (loadingPeriod.f67825f.f74599a.isAd() && !loadingPeriod.f67823d) || this.f53920f.shouldStartPlayback(this.f53917d2.f62798a, playingPeriod.f67825f.f74599a, getTotalBufferedDurationUs(), this.f53906X.getPlaybackParameters().f76315a, this.f53924i2, targetLiveOffsetUs);
    }

    private boolean shouldUseLivePlaybackSpeedControl(t1h t1hVar, vna.C14175b c14175b) {
        if (c14175b.isAd() || t1hVar.isEmpty()) {
            return false;
        }
        t1hVar.getWindow(t1hVar.getPeriodByUid(c14175b.f71106a, this.f53901M).f83398c, this.f53900L);
        if (!this.f53900L.isLive()) {
            return false;
        }
        t1h.C12851d c12851d = this.f53900L;
        return c12851d.f83425F && c12851d.f83439f != -9223372036854775807L;
    }

    private void startRenderers() throws ba5 {
        this.f53924i2 = false;
        this.f53906X.start();
        for (n1e n1eVar : this.f53910a) {
            if (isRendererEnabled(n1eVar)) {
                n1eVar.start();
            }
        }
    }

    private void stopInternal(boolean z, boolean z2) {
        resetInternal(z || !this.f53929m2, false, true, false);
        this.f53919e2.incrementPendingOperationAcks(z2 ? 1 : 0);
        this.f53920f.onStopped();
        setState(1);
    }

    private void stopRenderers() throws ba5 {
        this.f53906X.stop();
        for (n1e n1eVar : this.f53910a) {
            if (isRendererEnabled(n1eVar)) {
                ensureStopped(n1eVar);
            }
        }
    }

    private void updateIsLoading() {
        oja loadingPeriod = this.f53905V1.getLoadingPeriod();
        boolean z = this.f53925j2 || (loadingPeriod != null && loadingPeriod.f67820a.isLoading());
        myc mycVar = this.f53917d2;
        if (z != mycVar.f62804g) {
            this.f53917d2 = mycVar.copyWithIsLoading(z);
        }
    }

    private void updateLoadControlTrackSelection(vna.C14175b c14175b, m6h m6hVar, q7h q7hVar) {
        this.f53920f.onTracksSelected(this.f53917d2.f62798a, c14175b, this.f53910a, m6hVar, q7hVar.f73448c);
    }

    private void updatePeriods() throws ba5 {
        if (this.f53917d2.f62798a.isEmpty() || !this.f53909Z1.isPrepared()) {
            return;
        }
        maybeUpdateLoadingPeriod();
        maybeUpdateReadingPeriod();
        maybeUpdateReadingRenderers();
        maybeUpdatePlayingPeriod();
    }

    private void updatePlaybackPositions() throws ba5 {
        oja playingPeriod = this.f53905V1.getPlayingPeriod();
        if (playingPeriod == null) {
            return;
        }
        long discontinuity = playingPeriod.f67823d ? playingPeriod.f67820a.readDiscontinuity() : -9223372036854775807L;
        if (discontinuity != -9223372036854775807L) {
            resetRendererPosition(discontinuity);
            if (discontinuity != this.f53917d2.f62815r) {
                myc mycVar = this.f53917d2;
                this.f53917d2 = handlePositionDiscontinuity(mycVar.f62799b, discontinuity, mycVar.f62800c, discontinuity, true, 5);
            }
        } else {
            long jSyncAndGetPositionUs = this.f53906X.syncAndGetPositionUs(playingPeriod != this.f53905V1.getReadingPeriod());
            this.f53934r2 = jSyncAndGetPositionUs;
            long periodTime = playingPeriod.toPeriodTime(jSyncAndGetPositionUs);
            maybeTriggerPendingMessages(this.f53917d2.f62815r, periodTime);
            this.f53917d2.updatePositionUs(periodTime);
        }
        this.f53917d2.f62813p = this.f53905V1.getLoadingPeriod().getBufferedPositionUs();
        this.f53917d2.f62814q = getTotalBufferedDurationUs();
        myc mycVar2 = this.f53917d2;
        if (mycVar2.f62809l && mycVar2.f62802e == 3 && shouldUseLivePlaybackSpeedControl(mycVar2.f62798a, mycVar2.f62799b) && this.f53917d2.f62811n.f76315a == 1.0f) {
            float adjustedPlaybackSpeed = this.f53911a2.getAdjustedPlaybackSpeed(getCurrentLiveOffsetUs(), getTotalBufferedDurationUs());
            if (this.f53906X.getPlaybackParameters().f76315a != adjustedPlaybackSpeed) {
                setMediaClockPlaybackParameters(this.f53917d2.f62811n.withSpeed(adjustedPlaybackSpeed));
                handlePlaybackParameters(this.f53917d2.f62811n, this.f53906X.getPlaybackParameters().f76315a, false, false);
            }
        }
    }

    private void updatePlaybackSpeedSettingsForNewPeriod(t1h t1hVar, vna.C14175b c14175b, t1h t1hVar2, vna.C14175b c14175b2, long j, boolean z) throws ba5 {
        if (!shouldUseLivePlaybackSpeedControl(t1hVar, c14175b)) {
            qyc qycVar = c14175b.isAd() ? qyc.f76311d : this.f53917d2.f62811n;
            if (this.f53906X.getPlaybackParameters().equals(qycVar)) {
                return;
            }
            setMediaClockPlaybackParameters(qycVar);
            handlePlaybackParameters(this.f53917d2.f62811n, qycVar.f76315a, false, false);
            return;
        }
        t1hVar.getWindow(t1hVar.getPeriodByUid(c14175b.f71106a, this.f53901M).f83398c, this.f53900L);
        this.f53911a2.setLiveConfiguration((aga.C0239g) x0i.castNonNull(this.f53900L.f83427L));
        if (j != -9223372036854775807L) {
            this.f53911a2.setTargetLiveOffsetOverrideUs(getLiveOffsetUs(t1hVar, c14175b.f71106a, j));
            return;
        }
        if (!x0i.areEqual(!t1hVar2.isEmpty() ? t1hVar2.getWindow(t1hVar2.getPeriodByUid(c14175b2.f71106a, this.f53901M).f83398c, this.f53900L).f83434a : null, this.f53900L.f83434a) || z) {
            this.f53911a2.setTargetLiveOffsetOverrideUs(-9223372036854775807L);
        }
    }

    private void updateTrackSelectionPlaybackSpeed(float f) {
        for (oja playingPeriod = this.f53905V1.getPlayingPeriod(); playingPeriod != null; playingPeriod = playingPeriod.getNext()) {
            for (pf5 pf5Var : playingPeriod.getTrackSelectorResult().f73448c) {
                if (pf5Var != null) {
                    pf5Var.onPlaybackSpeed(f);
                }
            }
        }
    }

    private synchronized void waitUninterruptibly(lfg<Boolean> lfgVar, long j) {
        long jElapsedRealtime = this.f53908Z.elapsedRealtime() + j;
        boolean z = false;
        while (!lfgVar.get().booleanValue() && j > 0) {
            try {
                this.f53908Z.onThreadBlocked();
                wait(j);
            } catch (InterruptedException unused) {
                z = true;
            }
            j = jElapsedRealtime - this.f53908Z.elapsedRealtime();
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public void addMediaSources(int i, List<ppa.C11065c> list, sbf sbfVar) {
        this.f53897C.obtainMessage(18, i, 0, new C8341b(list, sbfVar, -1, -9223372036854775807L, null)).sendToTarget();
    }

    public void experimentalSetForegroundModeTimeoutMs(long j) {
        this.f53938v2 = j;
    }

    public void experimentalSetOffloadSchedulingEnabled(boolean z) {
        this.f53897C.obtainMessage(24, z ? 1 : 0, 0).sendToTarget();
    }

    public Looper getPlaybackLooper() {
        return this.f53899H;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) throws Throwable {
        int i;
        oja readingPeriod;
        try {
            switch (message.what) {
                case 0:
                    prepareInternal();
                    break;
                case 1:
                    setPlayWhenReadyInternal(message.arg1 != 0, message.arg2, true, 1);
                    break;
                case 2:
                    doSomeWork();
                    break;
                case 3:
                    seekToInternal((C8347h) message.obj);
                    break;
                case 4:
                    setPlaybackParametersInternal((qyc) message.obj);
                    break;
                case 5:
                    setSeekParametersInternal((iue) message.obj);
                    break;
                case 6:
                    stopInternal(false, true);
                    break;
                case 7:
                    releaseInternal();
                    return true;
                case 8:
                    handlePeriodPrepared((nja) message.obj);
                    break;
                case 9:
                    handleContinueLoadingRequested((nja) message.obj);
                    break;
                case 10:
                    reselectTracksInternal();
                    break;
                case 11:
                    setRepeatModeInternal(message.arg1);
                    break;
                case 12:
                    setShuffleModeEnabledInternal(message.arg1 != 0);
                    break;
                case 13:
                    setForegroundModeInternal(message.arg1 != 0, (AtomicBoolean) message.obj);
                    break;
                case 14:
                    sendMessageInternal((l0d) message.obj);
                    break;
                case 15:
                    sendMessageToTargetThread((l0d) message.obj);
                    break;
                case 16:
                    handlePlaybackParameters((qyc) message.obj, false);
                    break;
                case 17:
                    setMediaItemsInternal((C8341b) message.obj);
                    break;
                case 18:
                    addMediaItemsInternal((C8341b) message.obj, message.arg1);
                    break;
                case 19:
                    moveMediaItemsInternal((C8342c) message.obj);
                    break;
                case 20:
                    removeMediaItemsInternal(message.arg1, message.arg2, (sbf) message.obj);
                    break;
                case 21:
                    setShuffleOrderInternal((sbf) message.obj);
                    break;
                case 22:
                    mediaSourceListUpdateRequestedInternal();
                    break;
                case 23:
                    setPauseAtEndOfWindowInternal(message.arg1 != 0);
                    break;
                case 24:
                    setOffloadSchedulingEnabledInternal(message.arg1 == 1);
                    break;
                case 25:
                    attemptRendererErrorRecovery();
                    break;
                case 26:
                    reselectTracksInternalAndSeek();
                    break;
                default:
                    return false;
            }
        } catch (ba5 e) {
            e = e;
            if (e.f13134A2 == 1 && (readingPeriod = this.f53905V1.getReadingPeriod()) != null) {
                e = e.m3017b(readingPeriod.f67825f.f74599a);
            }
            if (e.f13140G2 && this.f53937u2 == null) {
                yh9.m25920w("ExoPlayerImplInternal", "Recoverable renderer error", e);
                this.f53937u2 = e;
                pe7 pe7Var = this.f53897C;
                pe7Var.sendMessageAtFrontOfQueue(pe7Var.obtainMessage(25, e));
            } else {
                ba5 ba5Var = this.f53937u2;
                if (ba5Var != null) {
                    ba5Var.addSuppressed(e);
                    e = this.f53937u2;
                }
                yh9.m25916e("ExoPlayerImplInternal", "Playback error", e);
                if (e.f13134A2 == 1 && this.f53905V1.getPlayingPeriod() != this.f53905V1.getReadingPeriod()) {
                    while (this.f53905V1.getPlayingPeriod() != this.f53905V1.getReadingPeriod()) {
                        this.f53905V1.advancePlayingPeriod();
                    }
                    qja qjaVar = ((oja) u80.checkNotNull(this.f53905V1.getPlayingPeriod())).f67825f;
                    vna.C14175b c14175b = qjaVar.f74599a;
                    long j = qjaVar.f74600b;
                    this.f53917d2 = handlePositionDiscontinuity(c14175b, j, qjaVar.f74601c, j, true, 0);
                }
                stopInternal(true, false);
                this.f53917d2 = this.f53917d2.copyWithPlaybackError(e);
            }
        } catch (InterfaceC3004d.a e2) {
            handleIoException(e2, e2.f19499a);
        } catch (rh3 e3) {
            handleIoException(e3, e3.f78292a);
        } catch (t01 e4) {
            handleIoException(e4, 1002);
        } catch (xhc e5) {
            int i2 = e5.f97852b;
            if (i2 == 1) {
                i = e5.f97851a ? 3001 : 3003;
            } else {
                if (i2 == 4) {
                    i = e5.f97851a ? 3002 : 3004;
                }
                handleIoException(e5, i);
            }
            i = i;
            handleIoException(e5, i);
        } catch (IOException e6) {
            handleIoException(e6, 2000);
        } catch (RuntimeException e7) {
            ba5 ba5VarCreateForUnexpected = ba5.createForUnexpected(e7, ((e7 instanceof IllegalStateException) || (e7 instanceof IllegalArgumentException)) ? 1004 : 1000);
            yh9.m25916e("ExoPlayerImplInternal", "Playback error", ba5VarCreateForUnexpected);
            stopInternal(true, false);
            this.f53917d2 = this.f53917d2.copyWithPlaybackError(ba5VarCreateForUnexpected);
        }
        maybeNotifyPlaybackInfoChanged();
        return true;
    }

    public void moveMediaSources(int i, int i2, int i3, sbf sbfVar) {
        this.f53897C.obtainMessage(19, new C8342c(i, i2, i3, sbfVar)).sendToTarget();
    }

    @Override // p000.sw3.InterfaceC12811a
    public void onPlaybackParametersChanged(qyc qycVar) {
        this.f53897C.obtainMessage(16, qycVar).sendToTarget();
    }

    @Override // p000.ppa.InterfaceC11066d
    public void onPlaylistUpdateRequested() {
        this.f53897C.sendEmptyMessage(22);
    }

    @Override // p000.nja.InterfaceC9906a
    public void onPrepared(nja njaVar) {
        this.f53897C.obtainMessage(8, njaVar).sendToTarget();
    }

    @Override // p000.p7h.InterfaceC10828a
    public void onRendererCapabilitiesChanged(n1e n1eVar) {
        this.f53897C.sendEmptyMessage(26);
    }

    @Override // p000.p7h.InterfaceC10828a
    public void onTrackSelectionsInvalidated() {
        this.f53897C.sendEmptyMessage(10);
    }

    public void prepare() {
        this.f53897C.obtainMessage(0).sendToTarget();
    }

    public synchronized boolean release() {
        if (!this.f53921f2 && this.f53899H.getThread().isAlive()) {
            this.f53897C.sendEmptyMessage(7);
            waitUninterruptibly(new lfg() { // from class: ff5
                @Override // p000.lfg
                public final Object get() {
                    return this.f36357a.lambda$release$0();
                }
            }, this.f53913b2);
            return this.f53921f2;
        }
        return true;
    }

    public void removeMediaSources(int i, int i2, sbf sbfVar) {
        this.f53897C.obtainMessage(20, i, i2, sbfVar).sendToTarget();
    }

    public void seekTo(t1h t1hVar, int i, long j) {
        this.f53897C.obtainMessage(3, new C8347h(t1hVar, i, j)).sendToTarget();
    }

    @Override // p000.l0d.InterfaceC8570a
    public synchronized void sendMessage(l0d l0dVar) {
        if (!this.f53921f2 && this.f53899H.getThread().isAlive()) {
            this.f53897C.obtainMessage(14, l0dVar).sendToTarget();
            return;
        }
        yh9.m25919w("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        l0dVar.markAsProcessed(false);
    }

    public synchronized boolean setForegroundMode(boolean z) {
        if (!this.f53921f2 && this.f53899H.getThread().isAlive()) {
            if (z) {
                this.f53897C.obtainMessage(13, 1, 0).sendToTarget();
                return true;
            }
            final AtomicBoolean atomicBoolean = new AtomicBoolean();
            this.f53897C.obtainMessage(13, 0, 0, atomicBoolean).sendToTarget();
            waitUninterruptibly(new lfg() { // from class: df5
                @Override // p000.lfg
                public final Object get() {
                    return Boolean.valueOf(atomicBoolean.get());
                }
            }, this.f53938v2);
            return atomicBoolean.get();
        }
        return true;
    }

    public void setMediaSources(List<ppa.C11065c> list, int i, long j, sbf sbfVar) {
        this.f53897C.obtainMessage(17, new C8341b(list, sbfVar, i, j, null)).sendToTarget();
    }

    public void setPauseAtEndOfWindow(boolean z) {
        this.f53897C.obtainMessage(23, z ? 1 : 0, 0).sendToTarget();
    }

    public void setPlayWhenReady(boolean z, int i) {
        this.f53897C.obtainMessage(1, z ? 1 : 0, i).sendToTarget();
    }

    public void setPlaybackParameters(qyc qycVar) {
        this.f53897C.obtainMessage(4, qycVar).sendToTarget();
    }

    public void setRepeatMode(int i) {
        this.f53897C.obtainMessage(11, i, 0).sendToTarget();
    }

    public void setSeekParameters(iue iueVar) {
        this.f53897C.obtainMessage(5, iueVar).sendToTarget();
    }

    public void setShuffleModeEnabled(boolean z) {
        this.f53897C.obtainMessage(12, z ? 1 : 0, 0).sendToTarget();
    }

    public void setShuffleOrder(sbf sbfVar) {
        this.f53897C.obtainMessage(21, sbfVar).sendToTarget();
    }

    public void stop() {
        this.f53897C.obtainMessage(6).sendToTarget();
    }

    private void enableRenderers(boolean[] zArr) throws ba5 {
        oja readingPeriod = this.f53905V1.getReadingPeriod();
        q7h trackSelectorResult = readingPeriod.getTrackSelectorResult();
        for (int i = 0; i < this.f53910a.length; i++) {
            if (!trackSelectorResult.isRendererEnabled(i) && this.f53912b.remove(this.f53910a[i])) {
                this.f53910a[i].reset();
            }
        }
        for (int i2 = 0; i2 < this.f53910a.length; i2++) {
            if (trackSelectorResult.isRendererEnabled(i2)) {
                enableRenderer(i2, zArr[i2]);
            }
        }
        readingPeriod.f67826g = true;
    }

    private long getTotalBufferedDurationUs(long j) {
        oja loadingPeriod = this.f53905V1.getLoadingPeriod();
        if (loadingPeriod == null) {
            return 0L;
        }
        return Math.max(0L, j - loadingPeriod.toPeriodTime(this.f53934r2));
    }

    private void handlePlaybackParameters(qyc qycVar, float f, boolean z, boolean z2) throws ba5 {
        if (z) {
            if (z2) {
                this.f53919e2.incrementPendingOperationAcks(1);
            }
            this.f53917d2 = this.f53917d2.copyWithPlaybackParameters(qycVar);
        }
        updateTrackSelectionPlaybackSpeed(qycVar.f76315a);
        for (n1e n1eVar : this.f53910a) {
            if (n1eVar != null) {
                n1eVar.setPlaybackSpeed(f, qycVar.f76315a);
            }
        }
    }

    @Override // p000.zye.InterfaceC16321a
    public void onContinueLoadingRequested(nja njaVar) {
        this.f53897C.obtainMessage(9, njaVar).sendToTarget();
    }

    private long seekToPeriodPosition(vna.C14175b c14175b, long j, boolean z, boolean z2) throws ba5 {
        stopRenderers();
        this.f53924i2 = false;
        if (z2 || this.f53917d2.f62802e == 3) {
            setState(2);
        }
        oja playingPeriod = this.f53905V1.getPlayingPeriod();
        oja next = playingPeriod;
        while (next != null && !c14175b.equals(next.f67825f.f74599a)) {
            next = next.getNext();
        }
        if (z || playingPeriod != next || (next != null && next.toRendererTime(j) < 0)) {
            for (n1e n1eVar : this.f53910a) {
                disableRenderer(n1eVar);
            }
            if (next != null) {
                while (this.f53905V1.getPlayingPeriod() != next) {
                    this.f53905V1.advancePlayingPeriod();
                }
                this.f53905V1.removeAfter(next);
                next.setRendererOffset(1000000000000L);
                enableRenderers();
            }
        }
        if (next != null) {
            this.f53905V1.removeAfter(next);
            if (!next.f67823d) {
                next.f67825f = next.f67825f.copyWithStartPositionUs(j);
            } else if (next.f67824e) {
                j = next.f67820a.seekToUs(j);
                next.f67820a.discardBuffer(j - this.f53903N, this.f53904Q);
            }
            resetRendererPosition(j);
            maybeContinueLoading();
        } else {
            this.f53905V1.clear();
            resetRendererPosition(j);
        }
        handleLoadingMediaPeriodChanged(false);
        this.f53897C.sendEmptyMessage(2);
        return j;
    }
}
