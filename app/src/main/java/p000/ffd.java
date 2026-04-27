package p000;

import android.net.Uri;
import android.os.Handler;
import com.google.android.exoplayer2.drm.InterfaceC3005e;
import com.google.android.exoplayer2.drm.InterfaceC3006f;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p000.hue;
import p000.ic9;
import p000.koa;
import p000.kq6;
import p000.lle;
import p000.nja;
import p000.tq7;
import p000.vc9;
import p000.yh3;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class ffd implements nja, ck5, vc9.InterfaceC13994b<C5768a>, vc9.InterfaceC13998f, lle.InterfaceC8890d {

    /* JADX INFO: renamed from: s2 */
    public static final long f36379s2 = 10000;

    /* JADX INFO: renamed from: t2 */
    public static final Map<String, String> f36380t2 = createIcyMetadataHeaders();

    /* JADX INFO: renamed from: u2 */
    public static final kq6 f36381u2 = new kq6.C8497b().setId("icy").setSampleMimeType("application/x-icy").build();

    /* JADX INFO: renamed from: C */
    public final InterfaceC6430gn f36382C;

    /* JADX INFO: renamed from: F */
    @hib
    public final String f36383F;

    /* JADX INFO: renamed from: H */
    public final long f36384H;

    /* JADX INFO: renamed from: M */
    public final ved f36386M;

    /* JADX INFO: renamed from: M1 */
    @hib
    public IcyHeaders f36387M1;

    /* JADX INFO: renamed from: Z */
    @hib
    public nja.InterfaceC9906a f36393Z;

    /* JADX INFO: renamed from: a */
    public final Uri f36395a;

    /* JADX INFO: renamed from: a2 */
    public boolean f36396a2;

    /* JADX INFO: renamed from: b */
    public final ih3 f36397b;

    /* JADX INFO: renamed from: b2 */
    public boolean f36398b2;

    /* JADX INFO: renamed from: c */
    public final InterfaceC3006f f36399c;

    /* JADX INFO: renamed from: c2 */
    public boolean f36400c2;

    /* JADX INFO: renamed from: d */
    public final ic9 f36401d;

    /* JADX INFO: renamed from: d2 */
    public C5772e f36402d2;

    /* JADX INFO: renamed from: e */
    public final koa.C8476a f36403e;

    /* JADX INFO: renamed from: e2 */
    public hue f36404e2;

    /* JADX INFO: renamed from: f */
    public final InterfaceC3005e.a f36405f;

    /* JADX INFO: renamed from: g2 */
    public boolean f36407g2;

    /* JADX INFO: renamed from: i2 */
    public boolean f36409i2;

    /* JADX INFO: renamed from: j2 */
    public boolean f36410j2;

    /* JADX INFO: renamed from: k2 */
    public int f36411k2;

    /* JADX INFO: renamed from: l2 */
    public boolean f36412l2;

    /* JADX INFO: renamed from: m */
    public final InterfaceC5769b f36413m;

    /* JADX INFO: renamed from: m2 */
    public long f36414m2;

    /* JADX INFO: renamed from: o2 */
    public boolean f36416o2;

    /* JADX INFO: renamed from: p2 */
    public int f36417p2;

    /* JADX INFO: renamed from: q2 */
    public boolean f36418q2;

    /* JADX INFO: renamed from: r2 */
    public boolean f36419r2;

    /* JADX INFO: renamed from: L */
    public final vc9 f36385L = new vc9(efd.f32851x2);

    /* JADX INFO: renamed from: N */
    public final wp2 f36388N = new wp2();

    /* JADX INFO: renamed from: Q */
    public final Runnable f36389Q = new Runnable() { // from class: wed
        @Override // java.lang.Runnable
        public final void run() {
            this.f94046a.maybeFinishPrepare();
        }
    };

    /* JADX INFO: renamed from: X */
    public final Runnable f36391X = new Runnable() { // from class: yed
        @Override // java.lang.Runnable
        public final void run() {
            this.f101313a.lambda$new$0();
        }
    };

    /* JADX INFO: renamed from: Y */
    public final Handler f36392Y = x0i.createHandlerForCurrentLooper();

    /* JADX INFO: renamed from: Z1 */
    public C5771d[] f36394Z1 = new C5771d[0];

    /* JADX INFO: renamed from: V1 */
    public lle[] f36390V1 = new lle[0];

    /* JADX INFO: renamed from: n2 */
    public long f36415n2 = -9223372036854775807L;

    /* JADX INFO: renamed from: f2 */
    public long f36406f2 = -9223372036854775807L;

    /* JADX INFO: renamed from: h2 */
    public int f36408h2 = 1;

    /* JADX INFO: renamed from: ffd$a */
    public final class C5768a implements vc9.InterfaceC13997e, tq7.InterfaceC13163a {

        /* JADX INFO: renamed from: b */
        public final Uri f36421b;

        /* JADX INFO: renamed from: c */
        public final i4g f36422c;

        /* JADX INFO: renamed from: d */
        public final ved f36423d;

        /* JADX INFO: renamed from: e */
        public final ck5 f36424e;

        /* JADX INFO: renamed from: f */
        public final wp2 f36425f;

        /* JADX INFO: renamed from: h */
        public volatile boolean f36427h;

        /* JADX INFO: renamed from: j */
        public long f36429j;

        /* JADX INFO: renamed from: l */
        @hib
        public r6h f36431l;

        /* JADX INFO: renamed from: m */
        public boolean f36432m;

        /* JADX INFO: renamed from: g */
        public final c5d f36426g = new c5d();

        /* JADX INFO: renamed from: i */
        public boolean f36428i = true;

        /* JADX INFO: renamed from: a */
        public final long f36420a = jc9.getNewId();

        /* JADX INFO: renamed from: k */
        public yh3 f36430k = buildDataSpec(0);

        public C5768a(Uri uri, ih3 ih3Var, ved vedVar, ck5 ck5Var, wp2 wp2Var) {
            this.f36421b = uri;
            this.f36422c = new i4g(ih3Var);
            this.f36423d = vedVar;
            this.f36424e = ck5Var;
            this.f36425f = wp2Var;
        }

        private yh3 buildDataSpec(long j) {
            return new yh3.C15662b().setUri(this.f36421b).setPosition(j).setKey(ffd.this.f36383F).setFlags(6).setHttpRequestHeaders(ffd.f36380t2).build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLoadPosition(long j, long j2) {
            this.f36426g.f15813a = j;
            this.f36429j = j2;
            this.f36428i = true;
            this.f36432m = false;
        }

        @Override // p000.vc9.InterfaceC13997e
        public void cancelLoad() {
            this.f36427h = true;
        }

        @Override // p000.vc9.InterfaceC13997e
        public void load() throws IOException {
            int i = 0;
            while (i == 0 && !this.f36427h) {
                try {
                    long j = this.f36426g.f15813a;
                    yh3 yh3VarBuildDataSpec = buildDataSpec(j);
                    this.f36430k = yh3VarBuildDataSpec;
                    long jOpen = this.f36422c.open(yh3VarBuildDataSpec);
                    if (jOpen != -1) {
                        jOpen += j;
                        ffd.this.onLengthKnown();
                    }
                    long j2 = jOpen;
                    ffd.this.f36387M1 = IcyHeaders.parse(this.f36422c.getResponseHeaders());
                    ah3 tq7Var = this.f36422c;
                    if (ffd.this.f36387M1 != null && ffd.this.f36387M1.f19608f != -1) {
                        tq7Var = new tq7(this.f36422c, ffd.this.f36387M1.f19608f, this);
                        r6h r6hVarM10888o = ffd.this.m10888o();
                        this.f36431l = r6hVarM10888o;
                        r6hVarM10888o.format(ffd.f36381u2);
                    }
                    long currentInputPosition = j;
                    this.f36423d.init(tq7Var, this.f36421b, this.f36422c.getResponseHeaders(), j, j2, this.f36424e);
                    if (ffd.this.f36387M1 != null) {
                        this.f36423d.disableSeekingOnMp3Streams();
                    }
                    if (this.f36428i) {
                        this.f36423d.seek(currentInputPosition, this.f36429j);
                        this.f36428i = false;
                    }
                    while (true) {
                        long j3 = currentInputPosition;
                        while (i == 0 && !this.f36427h) {
                            try {
                                this.f36425f.block();
                                i = this.f36423d.read(this.f36426g);
                                currentInputPosition = this.f36423d.getCurrentInputPosition();
                                if (currentInputPosition > ffd.this.f36384H + j3) {
                                    break;
                                }
                            } catch (InterruptedException unused) {
                                throw new InterruptedIOException();
                            }
                        }
                        this.f36425f.close();
                        ffd.this.f36392Y.post(ffd.this.f36391X);
                    }
                    if (i == 1) {
                        i = 0;
                    } else if (this.f36423d.getCurrentInputPosition() != -1) {
                        this.f36426g.f15813a = this.f36423d.getCurrentInputPosition();
                    }
                    vh3.closeQuietly(this.f36422c);
                } catch (Throwable th) {
                    if (i != 1 && this.f36423d.getCurrentInputPosition() != -1) {
                        this.f36426g.f15813a = this.f36423d.getCurrentInputPosition();
                    }
                    vh3.closeQuietly(this.f36422c);
                    throw th;
                }
            }
        }

        @Override // p000.tq7.InterfaceC13163a
        public void onIcyMetadata(ihc ihcVar) {
            long jMax = !this.f36432m ? this.f36429j : Math.max(ffd.this.getLargestQueuedTimestampUs(true), this.f36429j);
            int iBytesLeft = ihcVar.bytesLeft();
            r6h r6hVar = (r6h) u80.checkNotNull(this.f36431l);
            r6hVar.sampleData(ihcVar, iBytesLeft);
            r6hVar.sampleMetadata(jMax, 1, iBytesLeft, 0, null);
            this.f36432m = true;
        }
    }

    /* JADX INFO: renamed from: ffd$b */
    public interface InterfaceC5769b {
        void onSourceInfoRefreshed(long j, boolean z, boolean z2);
    }

    /* JADX INFO: renamed from: ffd$c */
    public final class C5770c implements nle {

        /* JADX INFO: renamed from: a */
        public final int f36434a;

        public C5770c(int i) {
            this.f36434a = i;
        }

        @Override // p000.nle
        public boolean isReady() {
            return ffd.this.m10889p(this.f36434a);
        }

        @Override // p000.nle
        public void maybeThrowError() throws IOException {
            ffd.this.m10891r(this.f36434a);
        }

        @Override // p000.nle
        public int readData(nq6 nq6Var, sl3 sl3Var, int i) {
            return ffd.this.m10892s(this.f36434a, nq6Var, sl3Var, i);
        }

        @Override // p000.nle
        public int skipData(long j) {
            return ffd.this.m10893t(this.f36434a, j);
        }
    }

    /* JADX INFO: renamed from: ffd$d */
    public static final class C5771d {

        /* JADX INFO: renamed from: a */
        public final int f36436a;

        /* JADX INFO: renamed from: b */
        public final boolean f36437b;

        public C5771d(int i, boolean z) {
            this.f36436a = i;
            this.f36437b = z;
        }

        public boolean equals(@hib Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C5771d.class != obj.getClass()) {
                return false;
            }
            C5771d c5771d = (C5771d) obj;
            return this.f36436a == c5771d.f36436a && this.f36437b == c5771d.f36437b;
        }

        public int hashCode() {
            return (this.f36436a * 31) + (this.f36437b ? 1 : 0);
        }
    }

    /* JADX INFO: renamed from: ffd$e */
    public static final class C5772e {

        /* JADX INFO: renamed from: a */
        public final m6h f36438a;

        /* JADX INFO: renamed from: b */
        public final boolean[] f36439b;

        /* JADX INFO: renamed from: c */
        public final boolean[] f36440c;

        /* JADX INFO: renamed from: d */
        public final boolean[] f36441d;

        public C5772e(m6h m6hVar, boolean[] zArr) {
            this.f36438a = m6hVar;
            this.f36439b = zArr;
            int i = m6hVar.f60034a;
            this.f36440c = new boolean[i];
            this.f36441d = new boolean[i];
        }
    }

    public ffd(Uri uri, ih3 ih3Var, ved vedVar, InterfaceC3006f interfaceC3006f, InterfaceC3005e.a aVar, ic9 ic9Var, koa.C8476a c8476a, InterfaceC5769b interfaceC5769b, InterfaceC6430gn interfaceC6430gn, @hib String str, int i) {
        this.f36395a = uri;
        this.f36397b = ih3Var;
        this.f36399c = interfaceC3006f;
        this.f36405f = aVar;
        this.f36401d = ic9Var;
        this.f36403e = c8476a;
        this.f36413m = interfaceC5769b;
        this.f36382C = interfaceC6430gn;
        this.f36383F = str;
        this.f36384H = i;
        this.f36386M = vedVar;
    }

    @z25({"trackState", "seekMap"})
    private void assertPrepared() {
        u80.checkState(this.f36398b2);
        u80.checkNotNull(this.f36402d2);
        u80.checkNotNull(this.f36404e2);
    }

    private boolean configureRetry(C5768a c5768a, int i) {
        hue hueVar;
        if (this.f36412l2 || !((hueVar = this.f36404e2) == null || hueVar.getDurationUs() == -9223372036854775807L)) {
            this.f36417p2 = i;
            return true;
        }
        if (this.f36398b2 && !suppressRead()) {
            this.f36416o2 = true;
            return false;
        }
        this.f36410j2 = this.f36398b2;
        this.f36414m2 = 0L;
        this.f36417p2 = 0;
        for (lle lleVar : this.f36390V1) {
            lleVar.reset();
        }
        c5768a.setLoadPosition(0L, 0L);
        return true;
    }

    private static Map<String, String> createIcyMetadataHeaders() {
        HashMap map = new HashMap();
        map.put("Icy-MetaData", "1");
        return Collections.unmodifiableMap(map);
    }

    private int getExtractedSamplesCount() {
        int writeIndex = 0;
        for (lle lleVar : this.f36390V1) {
            writeIndex += lleVar.getWriteIndex();
        }
        return writeIndex;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getLargestQueuedTimestampUs(boolean z) {
        long jMax = Long.MIN_VALUE;
        for (int i = 0; i < this.f36390V1.length; i++) {
            if (z || ((C5772e) u80.checkNotNull(this.f36402d2)).f36440c[i]) {
                jMax = Math.max(jMax, this.f36390V1[i].getLargestQueuedTimestampUs());
            }
        }
        return jMax;
    }

    private boolean isPendingReset() {
        return this.f36415n2 != -9223372036854775807L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0() {
        if (this.f36419r2) {
            return;
        }
        ((nja.InterfaceC9906a) u80.checkNotNull(this.f36393Z)).onContinueLoadingRequested(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onLengthKnown$2() {
        this.f36412l2 = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeFinishPrepare() {
        if (this.f36419r2 || this.f36398b2 || !this.f36396a2 || this.f36404e2 == null) {
            return;
        }
        for (lle lleVar : this.f36390V1) {
            if (lleVar.getUpstreamFormat() == null) {
                return;
            }
        }
        this.f36388N.close();
        int length = this.f36390V1.length;
        g6h[] g6hVarArr = new g6h[length];
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            kq6 kq6VarBuild = (kq6) u80.checkNotNull(this.f36390V1[i].getUpstreamFormat());
            String str = kq6VarBuild.f54989M;
            boolean zIsAudio = sva.isAudio(str);
            boolean z = zIsAudio || sva.isVideo(str);
            zArr[i] = z;
            this.f36400c2 = z | this.f36400c2;
            IcyHeaders icyHeaders = this.f36387M1;
            if (icyHeaders != null) {
                if (zIsAudio || this.f36394Z1[i].f36437b) {
                    Metadata metadata = kq6VarBuild.f54987H;
                    kq6VarBuild = kq6VarBuild.buildUpon().setMetadata(metadata == null ? new Metadata(icyHeaders) : metadata.copyWithAppendedEntries(icyHeaders)).build();
                }
                if (zIsAudio && kq6VarBuild.f55008f == -1 && kq6VarBuild.f55016m == -1 && icyHeaders.f19603a != -1) {
                    kq6VarBuild = kq6VarBuild.buildUpon().setAverageBitrate(icyHeaders.f19603a).build();
                }
            }
            g6hVarArr[i] = new g6h(Integer.toString(i), kq6VarBuild.copyWithCryptoType(this.f36399c.getCryptoType(kq6VarBuild)));
        }
        this.f36402d2 = new C5772e(new m6h(g6hVarArr), zArr);
        this.f36398b2 = true;
        ((nja.InterfaceC9906a) u80.checkNotNull(this.f36393Z)).onPrepared(this);
    }

    private void maybeNotifyDownstreamFormat(int i) {
        assertPrepared();
        C5772e c5772e = this.f36402d2;
        boolean[] zArr = c5772e.f36441d;
        if (zArr[i]) {
            return;
        }
        kq6 format = c5772e.f36438a.get(i).getFormat(0);
        this.f36403e.downstreamFormatChanged(sva.getTrackType(format.f54989M), format, 0, null, this.f36414m2);
        zArr[i] = true;
    }

    private void maybeStartDeferredRetry(int i) {
        assertPrepared();
        boolean[] zArr = this.f36402d2.f36439b;
        if (this.f36416o2 && zArr[i]) {
            if (this.f36390V1[i].isReady(false)) {
                return;
            }
            this.f36415n2 = 0L;
            this.f36416o2 = false;
            this.f36410j2 = true;
            this.f36414m2 = 0L;
            this.f36417p2 = 0;
            for (lle lleVar : this.f36390V1) {
                lleVar.reset();
            }
            ((nja.InterfaceC9906a) u80.checkNotNull(this.f36393Z)).onContinueLoadingRequested(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onLengthKnown() {
        this.f36392Y.post(new Runnable() { // from class: afd
            @Override // java.lang.Runnable
            public final void run() {
                this.f1354a.lambda$onLengthKnown$2();
            }
        });
    }

    private r6h prepareTrackOutput(C5771d c5771d) {
        int length = this.f36390V1.length;
        for (int i = 0; i < length; i++) {
            if (c5771d.equals(this.f36394Z1[i])) {
                return this.f36390V1[i];
            }
        }
        lle lleVarCreateWithDrm = lle.createWithDrm(this.f36382C, this.f36399c, this.f36405f);
        lleVarCreateWithDrm.setUpstreamFormatChangeListener(this);
        int i2 = length + 1;
        C5771d[] c5771dArr = (C5771d[]) Arrays.copyOf(this.f36394Z1, i2);
        c5771dArr[length] = c5771d;
        this.f36394Z1 = (C5771d[]) x0i.castNonNullTypeArray(c5771dArr);
        lle[] lleVarArr = (lle[]) Arrays.copyOf(this.f36390V1, i2);
        lleVarArr[length] = lleVarCreateWithDrm;
        this.f36390V1 = (lle[]) x0i.castNonNullTypeArray(lleVarArr);
        return lleVarCreateWithDrm;
    }

    private boolean seekInsideBufferUs(boolean[] zArr, long j) {
        int length = this.f36390V1.length;
        for (int i = 0; i < length; i++) {
            if (!this.f36390V1[i].seekTo(j, false) && (zArr[i] || !this.f36400c2)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: setSeekMap, reason: merged with bridge method [inline-methods] */
    public void lambda$seekMap$1(hue hueVar) {
        this.f36404e2 = this.f36387M1 == null ? hueVar : new hue.C7024b(-9223372036854775807L);
        this.f36406f2 = hueVar.getDurationUs();
        boolean z = !this.f36412l2 && hueVar.getDurationUs() == -9223372036854775807L;
        this.f36407g2 = z;
        this.f36408h2 = z ? 7 : 1;
        this.f36413m.onSourceInfoRefreshed(this.f36406f2, hueVar.isSeekable(), this.f36407g2);
        if (this.f36398b2) {
            return;
        }
        maybeFinishPrepare();
    }

    private void startLoading() {
        C5768a c5768a = new C5768a(this.f36395a, this.f36397b, this.f36386M, this, this.f36388N);
        if (this.f36398b2) {
            u80.checkState(isPendingReset());
            long j = this.f36406f2;
            if (j != -9223372036854775807L && this.f36415n2 > j) {
                this.f36418q2 = true;
                this.f36415n2 = -9223372036854775807L;
                return;
            }
            c5768a.setLoadPosition(((hue) u80.checkNotNull(this.f36404e2)).getSeekPoints(this.f36415n2).f44907a.f55385b, this.f36415n2);
            for (lle lleVar : this.f36390V1) {
                lleVar.setStartTimeUs(this.f36415n2);
            }
            this.f36415n2 = -9223372036854775807L;
        }
        this.f36417p2 = getExtractedSamplesCount();
        this.f36403e.loadStarted(new jc9(c5768a.f36420a, c5768a.f36430k, this.f36385L.startLoading(c5768a, this, this.f36401d.getMinimumLoadableRetryCount(this.f36408h2))), 1, -1, null, 0, null, c5768a.f36429j, this.f36406f2);
    }

    private boolean suppressRead() {
        return this.f36410j2 || isPendingReset();
    }

    @Override // p000.nja, p000.zye
    public boolean continueLoading(long j) {
        if (this.f36418q2 || this.f36385L.hasFatalError() || this.f36416o2) {
            return false;
        }
        if (this.f36398b2 && this.f36411k2 == 0) {
            return false;
        }
        boolean zOpen = this.f36388N.open();
        if (this.f36385L.isLoading()) {
            return zOpen;
        }
        startLoading();
        return true;
    }

    @Override // p000.nja
    public void discardBuffer(long j, boolean z) {
        assertPrepared();
        if (isPendingReset()) {
            return;
        }
        boolean[] zArr = this.f36402d2.f36440c;
        int length = this.f36390V1.length;
        for (int i = 0; i < length; i++) {
            this.f36390V1[i].discardTo(j, z, zArr[i]);
        }
    }

    @Override // p000.ck5
    public void endTracks() {
        this.f36396a2 = true;
        this.f36392Y.post(this.f36389Q);
    }

    @Override // p000.nja
    public long getAdjustedSeekPositionUs(long j, iue iueVar) {
        assertPrepared();
        if (!this.f36404e2.isSeekable()) {
            return 0L;
        }
        hue.C7023a seekPoints = this.f36404e2.getSeekPoints(j);
        return iueVar.resolveSeekPositionUs(j, seekPoints.f44907a.f55384a, seekPoints.f44908b.f55384a);
    }

    @Override // p000.nja, p000.zye
    public long getBufferedPositionUs() {
        long largestQueuedTimestampUs;
        assertPrepared();
        if (this.f36418q2 || this.f36411k2 == 0) {
            return Long.MIN_VALUE;
        }
        if (isPendingReset()) {
            return this.f36415n2;
        }
        if (this.f36400c2) {
            int length = this.f36390V1.length;
            largestQueuedTimestampUs = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                C5772e c5772e = this.f36402d2;
                if (c5772e.f36439b[i] && c5772e.f36440c[i] && !this.f36390V1[i].isLastSampleQueued()) {
                    largestQueuedTimestampUs = Math.min(largestQueuedTimestampUs, this.f36390V1[i].getLargestQueuedTimestampUs());
                }
            }
        } else {
            largestQueuedTimestampUs = Long.MAX_VALUE;
        }
        if (largestQueuedTimestampUs == Long.MAX_VALUE) {
            largestQueuedTimestampUs = getLargestQueuedTimestampUs(false);
        }
        return largestQueuedTimestampUs == Long.MIN_VALUE ? this.f36414m2 : largestQueuedTimestampUs;
    }

    @Override // p000.nja, p000.zye
    public long getNextLoadPositionUs() {
        return getBufferedPositionUs();
    }

    @Override // p000.nja
    public m6h getTrackGroups() {
        assertPrepared();
        return this.f36402d2.f36438a;
    }

    @Override // p000.nja, p000.zye
    public boolean isLoading() {
        return this.f36385L.isLoading() && this.f36388N.isOpen();
    }

    @Override // p000.nja
    public void maybeThrowPrepareError() throws IOException {
        m10890q();
        if (this.f36418q2 && !this.f36398b2) {
            throw xhc.createForMalformedContainer("Loading finished before preparation is complete.", null);
        }
    }

    /* JADX INFO: renamed from: o */
    public r6h m10888o() {
        return prepareTrackOutput(new C5771d(0, true));
    }

    @Override // p000.vc9.InterfaceC13998f
    public void onLoaderReleased() {
        for (lle lleVar : this.f36390V1) {
            lleVar.release();
        }
        this.f36386M.release();
    }

    @Override // p000.lle.InterfaceC8890d
    public void onUpstreamFormatChanged(kq6 kq6Var) {
        this.f36392Y.post(this.f36389Q);
    }

    /* JADX INFO: renamed from: p */
    public boolean m10889p(int i) {
        return !suppressRead() && this.f36390V1[i].isReady(this.f36418q2);
    }

    @Override // p000.nja
    public void prepare(nja.InterfaceC9906a interfaceC9906a, long j) {
        this.f36393Z = interfaceC9906a;
        this.f36388N.open();
        startLoading();
    }

    /* JADX INFO: renamed from: q */
    public void m10890q() throws IOException {
        this.f36385L.maybeThrowError(this.f36401d.getMinimumLoadableRetryCount(this.f36408h2));
    }

    /* JADX INFO: renamed from: r */
    public void m10891r(int i) throws IOException {
        this.f36390V1[i].maybeThrowError();
        m10890q();
    }

    @Override // p000.nja
    public long readDiscontinuity() {
        if (!this.f36410j2) {
            return -9223372036854775807L;
        }
        if (!this.f36418q2 && getExtractedSamplesCount() <= this.f36417p2) {
            return -9223372036854775807L;
        }
        this.f36410j2 = false;
        return this.f36414m2;
    }

    @Override // p000.nja, p000.zye
    public void reevaluateBuffer(long j) {
    }

    public void release() {
        if (this.f36398b2) {
            for (lle lleVar : this.f36390V1) {
                lleVar.preRelease();
            }
        }
        this.f36385L.release(this);
        this.f36392Y.removeCallbacksAndMessages(null);
        this.f36393Z = null;
        this.f36419r2 = true;
    }

    /* JADX INFO: renamed from: s */
    public int m10892s(int i, nq6 nq6Var, sl3 sl3Var, int i2) {
        if (suppressRead()) {
            return -3;
        }
        maybeNotifyDownstreamFormat(i);
        int i3 = this.f36390V1[i].read(nq6Var, sl3Var, i2, this.f36418q2);
        if (i3 == -3) {
            maybeStartDeferredRetry(i);
        }
        return i3;
    }

    @Override // p000.ck5
    public void seekMap(final hue hueVar) {
        this.f36392Y.post(new Runnable() { // from class: cfd
            @Override // java.lang.Runnable
            public final void run() {
                this.f16422a.lambda$seekMap$1(hueVar);
            }
        });
    }

    @Override // p000.nja
    public long seekToUs(long j) {
        assertPrepared();
        boolean[] zArr = this.f36402d2.f36439b;
        if (!this.f36404e2.isSeekable()) {
            j = 0;
        }
        int i = 0;
        this.f36410j2 = false;
        this.f36414m2 = j;
        if (isPendingReset()) {
            this.f36415n2 = j;
            return j;
        }
        if (this.f36408h2 != 7 && seekInsideBufferUs(zArr, j)) {
            return j;
        }
        this.f36416o2 = false;
        this.f36415n2 = j;
        this.f36418q2 = false;
        if (this.f36385L.isLoading()) {
            lle[] lleVarArr = this.f36390V1;
            int length = lleVarArr.length;
            while (i < length) {
                lleVarArr[i].discardToEnd();
                i++;
            }
            this.f36385L.cancelLoading();
        } else {
            this.f36385L.clearFatalError();
            lle[] lleVarArr2 = this.f36390V1;
            int length2 = lleVarArr2.length;
            while (i < length2) {
                lleVarArr2[i].reset();
                i++;
            }
        }
        return j;
    }

    @Override // p000.nja
    public long selectTracks(pf5[] pf5VarArr, boolean[] zArr, nle[] nleVarArr, boolean[] zArr2, long j) {
        pf5 pf5Var;
        assertPrepared();
        C5772e c5772e = this.f36402d2;
        m6h m6hVar = c5772e.f36438a;
        boolean[] zArr3 = c5772e.f36440c;
        int i = this.f36411k2;
        int i2 = 0;
        for (int i3 = 0; i3 < pf5VarArr.length; i3++) {
            nle nleVar = nleVarArr[i3];
            if (nleVar != null && (pf5VarArr[i3] == null || !zArr[i3])) {
                int i4 = ((C5770c) nleVar).f36434a;
                u80.checkState(zArr3[i4]);
                this.f36411k2--;
                zArr3[i4] = false;
                nleVarArr[i3] = null;
            }
        }
        boolean z = !this.f36409i2 ? j == 0 : i != 0;
        for (int i5 = 0; i5 < pf5VarArr.length; i5++) {
            if (nleVarArr[i5] == null && (pf5Var = pf5VarArr[i5]) != null) {
                u80.checkState(pf5Var.length() == 1);
                u80.checkState(pf5Var.getIndexInTrackGroup(0) == 0);
                int iIndexOf = m6hVar.indexOf(pf5Var.getTrackGroup());
                u80.checkState(!zArr3[iIndexOf]);
                this.f36411k2++;
                zArr3[iIndexOf] = true;
                nleVarArr[i5] = new C5770c(iIndexOf);
                zArr2[i5] = true;
                if (!z) {
                    lle lleVar = this.f36390V1[iIndexOf];
                    z = (lleVar.seekTo(j, true) || lleVar.getReadIndex() == 0) ? false : true;
                }
            }
        }
        if (this.f36411k2 == 0) {
            this.f36416o2 = false;
            this.f36410j2 = false;
            if (this.f36385L.isLoading()) {
                lle[] lleVarArr = this.f36390V1;
                int length = lleVarArr.length;
                while (i2 < length) {
                    lleVarArr[i2].discardToEnd();
                    i2++;
                }
                this.f36385L.cancelLoading();
            } else {
                lle[] lleVarArr2 = this.f36390V1;
                int length2 = lleVarArr2.length;
                while (i2 < length2) {
                    lleVarArr2[i2].reset();
                    i2++;
                }
            }
        } else if (z) {
            j = seekToUs(j);
            while (i2 < nleVarArr.length) {
                if (nleVarArr[i2] != null) {
                    zArr2[i2] = true;
                }
                i2++;
            }
        }
        this.f36409i2 = true;
        return j;
    }

    /* JADX INFO: renamed from: t */
    public int m10893t(int i, long j) {
        if (suppressRead()) {
            return 0;
        }
        maybeNotifyDownstreamFormat(i);
        lle lleVar = this.f36390V1[i];
        int skipCount = lleVar.getSkipCount(j, this.f36418q2);
        lleVar.skip(skipCount);
        if (skipCount == 0) {
            maybeStartDeferredRetry(i);
        }
        return skipCount;
    }

    @Override // p000.ck5
    public r6h track(int i, int i2) {
        return prepareTrackOutput(new C5771d(i, false));
    }

    @Override // p000.vc9.InterfaceC13994b
    public void onLoadCanceled(C5768a c5768a, long j, long j2, boolean z) {
        i4g i4gVar = c5768a.f36422c;
        jc9 jc9Var = new jc9(c5768a.f36420a, c5768a.f36430k, i4gVar.getLastOpenedUri(), i4gVar.getLastResponseHeaders(), j, j2, i4gVar.getBytesRead());
        this.f36401d.onLoadTaskConcluded(c5768a.f36420a);
        this.f36403e.loadCanceled(jc9Var, 1, -1, null, 0, null, c5768a.f36429j, this.f36406f2);
        if (z) {
            return;
        }
        for (lle lleVar : this.f36390V1) {
            lleVar.reset();
        }
        if (this.f36411k2 > 0) {
            ((nja.InterfaceC9906a) u80.checkNotNull(this.f36393Z)).onContinueLoadingRequested(this);
        }
    }

    @Override // p000.vc9.InterfaceC13994b
    public void onLoadCompleted(C5768a c5768a, long j, long j2) {
        hue hueVar;
        if (this.f36406f2 == -9223372036854775807L && (hueVar = this.f36404e2) != null) {
            boolean zIsSeekable = hueVar.isSeekable();
            long largestQueuedTimestampUs = getLargestQueuedTimestampUs(true);
            long j3 = largestQueuedTimestampUs == Long.MIN_VALUE ? 0L : largestQueuedTimestampUs + 10000;
            this.f36406f2 = j3;
            this.f36413m.onSourceInfoRefreshed(j3, zIsSeekable, this.f36407g2);
        }
        i4g i4gVar = c5768a.f36422c;
        jc9 jc9Var = new jc9(c5768a.f36420a, c5768a.f36430k, i4gVar.getLastOpenedUri(), i4gVar.getLastResponseHeaders(), j, j2, i4gVar.getBytesRead());
        this.f36401d.onLoadTaskConcluded(c5768a.f36420a);
        this.f36403e.loadCompleted(jc9Var, 1, -1, null, 0, null, c5768a.f36429j, this.f36406f2);
        this.f36418q2 = true;
        ((nja.InterfaceC9906a) u80.checkNotNull(this.f36393Z)).onContinueLoadingRequested(this);
    }

    @Override // p000.vc9.InterfaceC13994b
    public vc9.C13995c onLoadError(C5768a c5768a, long j, long j2, IOException iOException, int i) {
        vc9.C13995c c13995cCreateRetryAction;
        i4g i4gVar = c5768a.f36422c;
        jc9 jc9Var = new jc9(c5768a.f36420a, c5768a.f36430k, i4gVar.getLastOpenedUri(), i4gVar.getLastResponseHeaders(), j, j2, i4gVar.getBytesRead());
        long retryDelayMsFor = this.f36401d.getRetryDelayMsFor(new ic9.C7232d(jc9Var, new ega(1, -1, null, 0, null, x0i.usToMs(c5768a.f36429j), x0i.usToMs(this.f36406f2)), iOException, i));
        if (retryDelayMsFor == -9223372036854775807L) {
            c13995cCreateRetryAction = vc9.f90625l;
        } else {
            int extractedSamplesCount = getExtractedSamplesCount();
            c13995cCreateRetryAction = configureRetry(c5768a, extractedSamplesCount) ? vc9.createRetryAction(extractedSamplesCount > this.f36417p2, retryDelayMsFor) : vc9.f90624k;
        }
        boolean zIsRetry = c13995cCreateRetryAction.isRetry();
        this.f36403e.loadError(jc9Var, 1, -1, null, 0, null, c5768a.f36429j, this.f36406f2, iOException, !zIsRetry);
        if (!zIsRetry) {
            this.f36401d.onLoadTaskConcluded(c5768a.f36420a);
        }
        return c13995cCreateRetryAction;
    }
}
