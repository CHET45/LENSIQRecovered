package p000;

import android.net.Uri;
import android.os.Handler;
import androidx.media3.common.C1213a;
import androidx.media3.exoplayer.C1233k;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p000.gue;
import p000.hc9;
import p000.joa;
import p000.kle;
import p000.mja;
import p000.nr4;
import p000.sq7;
import p000.uc9;
import p000.xh3;

/* JADX INFO: loaded from: classes3.dex */
public final class efd implements mja, bk5, uc9.InterfaceC13490b<C5289b>, uc9.InterfaceC13494f, kle.InterfaceC8447d {

    /* JADX INFO: renamed from: x2 */
    public static final String f32851x2 = "ProgressiveMediaPeriod";

    /* JADX INFO: renamed from: y2 */
    public static final long f32852y2 = 10000;

    /* JADX INFO: renamed from: C */
    public final InterfaceC5892fn f32854C;

    /* JADX INFO: renamed from: F */
    @hib
    public final String f32855F;

    /* JADX INFO: renamed from: H */
    public final long f32856H;

    /* JADX INFO: renamed from: L */
    public final int f32857L;

    /* JADX INFO: renamed from: M */
    @hib
    public final C1213a f32858M;

    /* JADX INFO: renamed from: M1 */
    public final Runnable f32859M1;

    /* JADX INFO: renamed from: N */
    public final long f32860N;

    /* JADX INFO: renamed from: Q */
    public final uc9 f32861Q;

    /* JADX INFO: renamed from: V1 */
    public final Handler f32862V1;

    /* JADX INFO: renamed from: X */
    public final ued f32863X;

    /* JADX INFO: renamed from: Y */
    public final yp2 f32864Y;

    /* JADX INFO: renamed from: Z */
    public final Runnable f32865Z;

    /* JADX INFO: renamed from: Z1 */
    @hib
    public mja.InterfaceC9368a f32866Z1;

    /* JADX INFO: renamed from: a */
    public final Uri f32867a;

    /* JADX INFO: renamed from: a2 */
    @hib
    public wq7 f32868a2;

    /* JADX INFO: renamed from: b */
    public final gh3 f32869b;

    /* JADX INFO: renamed from: b2 */
    public kle[] f32870b2;

    /* JADX INFO: renamed from: c */
    public final or4 f32871c;

    /* JADX INFO: renamed from: c2 */
    public C5292e[] f32872c2;

    /* JADX INFO: renamed from: d */
    public final hc9 f32873d;

    /* JADX INFO: renamed from: d2 */
    public boolean f32874d2;

    /* JADX INFO: renamed from: e */
    public final joa.C7994a f32875e;

    /* JADX INFO: renamed from: e2 */
    public boolean f32876e2;

    /* JADX INFO: renamed from: f */
    public final nr4.C10020a f32877f;

    /* JADX INFO: renamed from: f2 */
    public boolean f32878f2;

    /* JADX INFO: renamed from: g2 */
    public boolean f32879g2;

    /* JADX INFO: renamed from: h2 */
    public C5293f f32880h2;

    /* JADX INFO: renamed from: i2 */
    public gue f32881i2;

    /* JADX INFO: renamed from: j2 */
    public long f32882j2;

    /* JADX INFO: renamed from: k2 */
    public boolean f32883k2;

    /* JADX INFO: renamed from: l2 */
    public int f32884l2;

    /* JADX INFO: renamed from: m */
    public final InterfaceC5290c f32885m;

    /* JADX INFO: renamed from: m2 */
    public boolean f32886m2;

    /* JADX INFO: renamed from: n2 */
    public boolean f32887n2;

    /* JADX INFO: renamed from: o2 */
    public boolean f32888o2;

    /* JADX INFO: renamed from: p2 */
    public int f32889p2;

    /* JADX INFO: renamed from: q2 */
    public boolean f32890q2;

    /* JADX INFO: renamed from: r2 */
    public long f32891r2;

    /* JADX INFO: renamed from: s2 */
    public long f32892s2;

    /* JADX INFO: renamed from: t2 */
    public boolean f32893t2;

    /* JADX INFO: renamed from: u2 */
    public int f32894u2;

    /* JADX INFO: renamed from: v2 */
    public boolean f32895v2;

    /* JADX INFO: renamed from: w2 */
    public boolean f32896w2;

    /* JADX INFO: renamed from: z2 */
    public static final Map<String, String> f32853z2 = createIcyMetadataHeaders();

    /* JADX INFO: renamed from: A2 */
    public static final C1213a f32850A2 = new C1213a.b().setId("icy").setSampleMimeType("application/x-icy").build();

    /* JADX INFO: renamed from: efd$a */
    public class C5288a extends ft6 {
        public C5288a(gue gueVar) {
            super(gueVar);
        }

        @Override // p000.ft6, p000.gue
        public long getDurationUs() {
            return efd.this.f32882j2;
        }
    }

    /* JADX INFO: renamed from: efd$b */
    public final class C5289b implements uc9.InterfaceC13493e, sq7.InterfaceC12746a {

        /* JADX INFO: renamed from: b */
        public final Uri f32899b;

        /* JADX INFO: renamed from: c */
        public final j4g f32900c;

        /* JADX INFO: renamed from: d */
        public final ued f32901d;

        /* JADX INFO: renamed from: e */
        public final bk5 f32902e;

        /* JADX INFO: renamed from: f */
        public final yp2 f32903f;

        /* JADX INFO: renamed from: h */
        public volatile boolean f32905h;

        /* JADX INFO: renamed from: j */
        public long f32907j;

        /* JADX INFO: renamed from: l */
        @hib
        public q6h f32909l;

        /* JADX INFO: renamed from: m */
        public boolean f32910m;

        /* JADX INFO: renamed from: g */
        public final d5d f32904g = new d5d();

        /* JADX INFO: renamed from: i */
        public boolean f32906i = true;

        /* JADX INFO: renamed from: a */
        public final long f32898a = kc9.getNewId();

        /* JADX INFO: renamed from: k */
        public xh3 f32908k = buildDataSpec(0);

        public C5289b(Uri uri, gh3 gh3Var, ued uedVar, bk5 bk5Var, yp2 yp2Var) {
            this.f32899b = uri;
            this.f32900c = new j4g(gh3Var);
            this.f32901d = uedVar;
            this.f32902e = bk5Var;
            this.f32903f = yp2Var;
        }

        private xh3 buildDataSpec(long j) {
            return new xh3.C15067b().setUri(this.f32899b).setPosition(j).setKey(efd.this.f32855F).setFlags(6).setHttpRequestHeaders(efd.f32853z2).build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLoadPosition(long j, long j2) {
            this.f32904g.f28476a = j;
            this.f32907j = j2;
            this.f32906i = true;
            this.f32910m = false;
        }

        @Override // p000.uc9.InterfaceC13493e
        public void cancelLoad() {
            this.f32905h = true;
        }

        @Override // p000.uc9.InterfaceC13493e
        public void load() throws IOException {
            int i = 0;
            while (i == 0 && !this.f32905h) {
                try {
                    long j = this.f32904g.f28476a;
                    xh3 xh3VarBuildDataSpec = buildDataSpec(j);
                    this.f32908k = xh3VarBuildDataSpec;
                    long jOpen = this.f32900c.open(xh3VarBuildDataSpec);
                    if (this.f32905h) {
                        if (i != 1 && this.f32901d.getCurrentInputPosition() != -1) {
                            this.f32904g.f28476a = this.f32901d.getCurrentInputPosition();
                        }
                        wh3.closeQuietly(this.f32900c);
                        return;
                    }
                    if (jOpen != -1) {
                        jOpen += j;
                        efd.this.onLengthKnown();
                    }
                    long j2 = jOpen;
                    efd.this.f32868a2 = wq7.parse(this.f32900c.getResponseHeaders());
                    bh3 sq7Var = this.f32900c;
                    if (efd.this.f32868a2 != null && efd.this.f32868a2.f95140f != -1) {
                        sq7Var = new sq7(this.f32900c, efd.this.f32868a2.f95140f, this);
                        q6h q6hVarM9936p = efd.this.m9936p();
                        this.f32909l = q6hVarM9936p;
                        q6hVarM9936p.format(efd.f32850A2);
                    }
                    long currentInputPosition = j;
                    this.f32901d.init(sq7Var, this.f32899b, this.f32900c.getResponseHeaders(), j, j2, this.f32902e);
                    if (efd.this.f32868a2 != null) {
                        this.f32901d.disableSeekingOnMp3Streams();
                    }
                    if (this.f32906i) {
                        this.f32901d.seek(currentInputPosition, this.f32907j);
                        this.f32906i = false;
                    }
                    while (true) {
                        long j3 = currentInputPosition;
                        while (i == 0 && !this.f32905h) {
                            try {
                                this.f32903f.block();
                                i = this.f32901d.read(this.f32904g);
                                currentInputPosition = this.f32901d.getCurrentInputPosition();
                                if (currentInputPosition > efd.this.f32856H + j3) {
                                    break;
                                }
                            } catch (InterruptedException unused) {
                                throw new InterruptedIOException();
                            }
                        }
                        this.f32903f.close();
                        efd.this.f32862V1.post(efd.this.f32859M1);
                    }
                    if (i == 1) {
                        i = 0;
                    } else if (this.f32901d.getCurrentInputPosition() != -1) {
                        this.f32904g.f28476a = this.f32901d.getCurrentInputPosition();
                    }
                    wh3.closeQuietly(this.f32900c);
                } catch (Throwable th) {
                    if (i != 1 && this.f32901d.getCurrentInputPosition() != -1) {
                        this.f32904g.f28476a = this.f32901d.getCurrentInputPosition();
                    }
                    wh3.closeQuietly(this.f32900c);
                    throw th;
                }
            }
        }

        @Override // p000.sq7.InterfaceC12746a
        public void onIcyMetadata(jhc jhcVar) {
            long jMax = !this.f32910m ? this.f32907j : Math.max(efd.this.getLargestQueuedTimestampUs(true), this.f32907j);
            int iBytesLeft = jhcVar.bytesLeft();
            q6h q6hVar = (q6h) v80.checkNotNull(this.f32909l);
            q6hVar.sampleData(jhcVar, iBytesLeft);
            q6hVar.sampleMetadata(jMax, 1, iBytesLeft, 0, null);
            this.f32910m = true;
        }
    }

    /* JADX INFO: renamed from: efd$c */
    public interface InterfaceC5290c {
        void onSourceInfoRefreshed(long j, gue gueVar, boolean z);
    }

    /* JADX INFO: renamed from: efd$d */
    public final class C5291d implements mle {

        /* JADX INFO: renamed from: a */
        public final int f32912a;

        public C5291d(int i) {
            this.f32912a = i;
        }

        @Override // p000.mle
        public boolean isReady() {
            return efd.this.m9937q(this.f32912a);
        }

        @Override // p000.mle
        public void maybeThrowError() throws IOException {
            efd.this.m9939s(this.f32912a);
        }

        @Override // p000.mle
        public int readData(oq6 oq6Var, rl3 rl3Var, int i) {
            return efd.this.m9940t(this.f32912a, oq6Var, rl3Var, i);
        }

        @Override // p000.mle
        public int skipData(long j) {
            return efd.this.m9941u(this.f32912a, j);
        }
    }

    /* JADX INFO: renamed from: efd$e */
    public static final class C5292e {

        /* JADX INFO: renamed from: a */
        public final int f32914a;

        /* JADX INFO: renamed from: b */
        public final boolean f32915b;

        public C5292e(int i, boolean z) {
            this.f32914a = i;
            this.f32915b = z;
        }

        public boolean equals(@hib Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C5292e.class != obj.getClass()) {
                return false;
            }
            C5292e c5292e = (C5292e) obj;
            return this.f32914a == c5292e.f32914a && this.f32915b == c5292e.f32915b;
        }

        public int hashCode() {
            return (this.f32914a * 31) + (this.f32915b ? 1 : 0);
        }
    }

    /* JADX INFO: renamed from: efd$f */
    public static final class C5293f {

        /* JADX INFO: renamed from: a */
        public final n6h f32916a;

        /* JADX INFO: renamed from: b */
        public final boolean[] f32917b;

        /* JADX INFO: renamed from: c */
        public final boolean[] f32918c;

        /* JADX INFO: renamed from: d */
        public final boolean[] f32919d;

        public C5293f(n6h n6hVar, boolean[] zArr) {
            this.f32916a = n6hVar;
            this.f32917b = zArr;
            int i = n6hVar.f63418a;
            this.f32918c = new boolean[i];
            this.f32919d = new boolean[i];
        }
    }

    public efd(Uri uri, gh3 gh3Var, ued uedVar, or4 or4Var, nr4.C10020a c10020a, hc9 hc9Var, joa.C7994a c7994a, InterfaceC5290c interfaceC5290c, InterfaceC5892fn interfaceC5892fn, @hib String str, int i, int i2, @hib C1213a c1213a, long j, @hib yxd yxdVar) {
        this.f32867a = uri;
        this.f32869b = gh3Var;
        this.f32871c = or4Var;
        this.f32877f = c10020a;
        this.f32873d = hc9Var;
        this.f32875e = c7994a;
        this.f32885m = interfaceC5290c;
        this.f32854C = interfaceC5892fn;
        this.f32855F = str;
        this.f32856H = i;
        this.f32857L = i2;
        this.f32858M = c1213a;
        this.f32861Q = yxdVar != null ? new uc9(yxdVar) : new uc9(f32851x2);
        this.f32863X = uedVar;
        this.f32860N = j;
        this.f32864Y = new yp2();
        this.f32865Z = new Runnable() { // from class: zed
            @Override // java.lang.Runnable
            public final void run() {
                this.f104944a.maybeFinishPrepare();
            }
        };
        this.f32859M1 = new Runnable() { // from class: bfd
            @Override // java.lang.Runnable
            public final void run() {
                this.f13647a.lambda$new$0();
            }
        };
        this.f32862V1 = t0i.createHandlerForCurrentLooper();
        this.f32872c2 = new C5292e[0];
        this.f32870b2 = new kle[0];
        this.f32892s2 = -9223372036854775807L;
        this.f32884l2 = 1;
    }

    @z25({"trackState", "seekMap"})
    private void assertPrepared() {
        v80.checkState(this.f32876e2);
        v80.checkNotNull(this.f32880h2);
        v80.checkNotNull(this.f32881i2);
    }

    private boolean configureRetry(C5289b c5289b, int i) {
        gue gueVar;
        if (this.f32890q2 || !((gueVar = this.f32881i2) == null || gueVar.getDurationUs() == -9223372036854775807L)) {
            this.f32894u2 = i;
            return true;
        }
        if (this.f32876e2 && !suppressRead()) {
            this.f32893t2 = true;
            return false;
        }
        this.f32887n2 = this.f32876e2;
        this.f32891r2 = 0L;
        this.f32894u2 = 0;
        for (kle kleVar : this.f32870b2) {
            kleVar.reset();
        }
        c5289b.setLoadPosition(0L, 0L);
        return true;
    }

    private static Map<String, String> createIcyMetadataHeaders() {
        HashMap map = new HashMap();
        map.put("Icy-MetaData", "1");
        return Collections.unmodifiableMap(map);
    }

    private int getExtractedSamplesCount() {
        int writeIndex = 0;
        for (kle kleVar : this.f32870b2) {
            writeIndex += kleVar.getWriteIndex();
        }
        return writeIndex;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getLargestQueuedTimestampUs(boolean z) {
        long jMax = Long.MIN_VALUE;
        for (int i = 0; i < this.f32870b2.length; i++) {
            if (z || ((C5293f) v80.checkNotNull(this.f32880h2)).f32918c[i]) {
                jMax = Math.max(jMax, this.f32870b2[i].getLargestQueuedTimestampUs());
            }
        }
        return jMax;
    }

    private boolean isPendingReset() {
        return this.f32892s2 != -9223372036854775807L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0() {
        if (this.f32896w2) {
            return;
        }
        ((mja.InterfaceC9368a) v80.checkNotNull(this.f32866Z1)).onContinueLoadingRequested(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onLengthKnown$2() {
        this.f32890q2 = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeFinishPrepare() {
        if (this.f32896w2 || this.f32876e2 || !this.f32874d2 || this.f32881i2 == null) {
            return;
        }
        for (kle kleVar : this.f32870b2) {
            if (kleVar.getUpstreamFormat() == null) {
                return;
            }
        }
        this.f32864Y.close();
        int length = this.f32870b2.length;
        h6h[] h6hVarArr = new h6h[length];
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            C1213a c1213aBuild = (C1213a) v80.checkNotNull(this.f32870b2[i].getUpstreamFormat());
            String str = c1213aBuild.f8291o;
            boolean zIsAudio = rva.isAudio(str);
            boolean z = zIsAudio || rva.isVideo(str);
            zArr[i] = z;
            this.f32878f2 = z | this.f32878f2;
            this.f32879g2 = this.f32860N != -9223372036854775807L && length == 1 && rva.isImage(str);
            wq7 wq7Var = this.f32868a2;
            if (wq7Var != null) {
                if (zIsAudio || this.f32872c2[i].f32915b) {
                    eta etaVar = c1213aBuild.f8288l;
                    c1213aBuild = c1213aBuild.buildUpon().setMetadata(etaVar == null ? new eta(wq7Var) : etaVar.copyWithAppendedEntries(wq7Var)).build();
                }
                if (zIsAudio && c1213aBuild.f8284h == -1 && c1213aBuild.f8285i == -1 && wq7Var.f95135a != -1) {
                    c1213aBuild = c1213aBuild.buildUpon().setAverageBitrate(wq7Var.f95135a).build();
                }
            }
            C1213a c1213aCopyWithCryptoType = c1213aBuild.copyWithCryptoType(this.f32871c.getCryptoType(c1213aBuild));
            h6hVarArr[i] = new h6h(Integer.toString(i), c1213aCopyWithCryptoType);
            this.f32888o2 = c1213aCopyWithCryptoType.f8297u | this.f32888o2;
        }
        this.f32880h2 = new C5293f(new n6h(h6hVarArr), zArr);
        if (this.f32879g2 && this.f32882j2 == -9223372036854775807L) {
            this.f32882j2 = this.f32860N;
            this.f32881i2 = new C5288a(this.f32881i2);
        }
        this.f32885m.onSourceInfoRefreshed(this.f32882j2, this.f32881i2, this.f32883k2);
        this.f32876e2 = true;
        ((mja.InterfaceC9368a) v80.checkNotNull(this.f32866Z1)).onPrepared(this);
    }

    private void maybeNotifyDownstreamFormat(int i) {
        assertPrepared();
        C5293f c5293f = this.f32880h2;
        boolean[] zArr = c5293f.f32919d;
        if (zArr[i]) {
            return;
        }
        C1213a format = c5293f.f32916a.get(i).getFormat(0);
        this.f32875e.downstreamFormatChanged(rva.getTrackType(format.f8291o), format, 0, null, this.f32891r2);
        zArr[i] = true;
    }

    private void maybeStartDeferredRetry(int i) {
        assertPrepared();
        if (this.f32893t2) {
            if (!this.f32878f2 || this.f32880h2.f32917b[i]) {
                if (this.f32870b2[i].isReady(false)) {
                    return;
                }
                this.f32892s2 = 0L;
                this.f32893t2 = false;
                this.f32887n2 = true;
                this.f32891r2 = 0L;
                this.f32894u2 = 0;
                for (kle kleVar : this.f32870b2) {
                    kleVar.reset();
                }
                ((mja.InterfaceC9368a) v80.checkNotNull(this.f32866Z1)).onContinueLoadingRequested(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onLengthKnown() {
        this.f32862V1.post(new Runnable() { // from class: xed
            @Override // java.lang.Runnable
            public final void run() {
                this.f97605a.lambda$onLengthKnown$2();
            }
        });
    }

    private q6h prepareTrackOutput(C5292e c5292e) {
        int length = this.f32870b2.length;
        for (int i = 0; i < length; i++) {
            if (c5292e.equals(this.f32872c2[i])) {
                return this.f32870b2[i];
            }
        }
        if (this.f32874d2) {
            xh9.m25148w(f32851x2, "Extractor added new track (id=" + c5292e.f32914a + ") after finishing tracks.");
            return new yd4();
        }
        kle kleVarCreateWithDrm = kle.createWithDrm(this.f32854C, this.f32871c, this.f32877f);
        kleVarCreateWithDrm.setUpstreamFormatChangeListener(this);
        int i2 = length + 1;
        C5292e[] c5292eArr = (C5292e[]) Arrays.copyOf(this.f32872c2, i2);
        c5292eArr[length] = c5292e;
        this.f32872c2 = (C5292e[]) t0i.castNonNullTypeArray(c5292eArr);
        kle[] kleVarArr = (kle[]) Arrays.copyOf(this.f32870b2, i2);
        kleVarArr[length] = kleVarCreateWithDrm;
        this.f32870b2 = (kle[]) t0i.castNonNullTypeArray(kleVarArr);
        return kleVarCreateWithDrm;
    }

    private boolean seekInsideBufferUs(boolean[] zArr, long j, boolean z) {
        int length = this.f32870b2.length;
        for (int i = 0; i < length; i++) {
            kle kleVar = this.f32870b2[i];
            if (kleVar.getReadIndex() != 0 || !z) {
                if (!(this.f32879g2 ? kleVar.seekTo(kleVar.getFirstIndex()) : kleVar.seekTo(j, this.f32895v2)) && (zArr[i] || !this.f32878f2)) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: setSeekMap, reason: merged with bridge method [inline-methods] */
    public void lambda$seekMap$1(gue gueVar) {
        this.f32881i2 = this.f32868a2 == null ? gueVar : new gue.C6549b(-9223372036854775807L);
        this.f32882j2 = gueVar.getDurationUs();
        boolean z = !this.f32890q2 && gueVar.getDurationUs() == -9223372036854775807L;
        this.f32883k2 = z;
        this.f32884l2 = z ? 7 : 1;
        if (this.f32876e2) {
            this.f32885m.onSourceInfoRefreshed(this.f32882j2, gueVar, z);
        } else {
            maybeFinishPrepare();
        }
    }

    private void startLoading() {
        C5289b c5289b = new C5289b(this.f32867a, this.f32869b, this.f32863X, this, this.f32864Y);
        if (this.f32876e2) {
            v80.checkState(isPendingReset());
            long j = this.f32882j2;
            if (j != -9223372036854775807L && this.f32892s2 > j) {
                this.f32895v2 = true;
                this.f32892s2 = -9223372036854775807L;
                return;
            }
            c5289b.setLoadPosition(((gue) v80.checkNotNull(this.f32881i2)).getSeekPoints(this.f32892s2).f41218a.f58834b, this.f32892s2);
            for (kle kleVar : this.f32870b2) {
                kleVar.setStartTimeUs(this.f32892s2);
            }
            this.f32892s2 = -9223372036854775807L;
        }
        this.f32894u2 = getExtractedSamplesCount();
        this.f32861Q.startLoading(c5289b, this, this.f32873d.getMinimumLoadableRetryCount(this.f32884l2));
    }

    private boolean suppressRead() {
        return this.f32887n2 || isPendingReset();
    }

    @Override // p000.mja, p000.yye
    public boolean continueLoading(C1233k c1233k) {
        if (this.f32895v2 || this.f32861Q.hasFatalError() || this.f32893t2) {
            return false;
        }
        if ((this.f32876e2 || this.f32858M != null) && this.f32889p2 == 0) {
            return false;
        }
        boolean zOpen = this.f32864Y.open();
        if (this.f32861Q.isLoading()) {
            return zOpen;
        }
        startLoading();
        return true;
    }

    @Override // p000.mja
    public void discardBuffer(long j, boolean z) {
        if (this.f32879g2) {
            return;
        }
        assertPrepared();
        if (isPendingReset()) {
            return;
        }
        boolean[] zArr = this.f32880h2.f32918c;
        int length = this.f32870b2.length;
        for (int i = 0; i < length; i++) {
            this.f32870b2[i].discardTo(j, z, zArr[i]);
        }
    }

    @Override // p000.bk5
    public void endTracks() {
        this.f32874d2 = true;
        this.f32862V1.post(this.f32865Z);
    }

    @Override // p000.mja
    public long getAdjustedSeekPositionUs(long j, jue jueVar) {
        assertPrepared();
        if (!this.f32881i2.isSeekable()) {
            return 0L;
        }
        gue.C6548a seekPoints = this.f32881i2.getSeekPoints(j);
        return jueVar.resolveSeekPositionUs(j, seekPoints.f41218a.f58833a, seekPoints.f41219b.f58833a);
    }

    @Override // p000.mja, p000.yye
    public long getBufferedPositionUs() {
        long largestQueuedTimestampUs;
        assertPrepared();
        if (this.f32895v2 || this.f32889p2 == 0) {
            return Long.MIN_VALUE;
        }
        if (isPendingReset()) {
            return this.f32892s2;
        }
        if (this.f32878f2) {
            int length = this.f32870b2.length;
            largestQueuedTimestampUs = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                C5293f c5293f = this.f32880h2;
                if (c5293f.f32917b[i] && c5293f.f32918c[i] && !this.f32870b2[i].isLastSampleQueued()) {
                    largestQueuedTimestampUs = Math.min(largestQueuedTimestampUs, this.f32870b2[i].getLargestQueuedTimestampUs());
                }
            }
        } else {
            largestQueuedTimestampUs = Long.MAX_VALUE;
        }
        if (largestQueuedTimestampUs == Long.MAX_VALUE) {
            largestQueuedTimestampUs = getLargestQueuedTimestampUs(false);
        }
        return largestQueuedTimestampUs == Long.MIN_VALUE ? this.f32891r2 : largestQueuedTimestampUs;
    }

    @Override // p000.mja, p000.yye
    public long getNextLoadPositionUs() {
        return getBufferedPositionUs();
    }

    @Override // p000.mja
    public n6h getTrackGroups() {
        assertPrepared();
        return this.f32880h2.f32916a;
    }

    @Override // p000.mja, p000.yye
    public boolean isLoading() {
        return this.f32861Q.isLoading() && this.f32864Y.isOpen();
    }

    @Override // p000.mja
    public void maybeThrowPrepareError() throws IOException {
        m9938r();
        if (this.f32895v2 && !this.f32876e2) {
            throw yhc.createForMalformedContainer("Loading finished before preparation is complete.", null);
        }
    }

    @Override // p000.uc9.InterfaceC13494f
    public void onLoaderReleased() {
        for (kle kleVar : this.f32870b2) {
            kleVar.release();
        }
        this.f32863X.release();
    }

    @Override // p000.kle.InterfaceC8447d
    public void onUpstreamFormatChanged(C1213a c1213a) {
        this.f32862V1.post(this.f32865Z);
    }

    /* JADX INFO: renamed from: p */
    public q6h m9936p() {
        return prepareTrackOutput(new C5292e(0, true));
    }

    @Override // p000.mja
    public void prepare(mja.InterfaceC9368a interfaceC9368a, long j) {
        this.f32866Z1 = interfaceC9368a;
        if (this.f32858M == null) {
            this.f32864Y.open();
            startLoading();
        } else {
            track(this.f32857L, 3).format(this.f32858M);
            lambda$seekMap$1(new l08(new long[]{0}, new long[]{0}, -9223372036854775807L));
            endTracks();
            this.f32892s2 = j;
        }
    }

    /* JADX INFO: renamed from: q */
    public boolean m9937q(int i) {
        return !suppressRead() && this.f32870b2[i].isReady(this.f32895v2);
    }

    /* JADX INFO: renamed from: r */
    public void m9938r() throws IOException {
        this.f32861Q.maybeThrowError(this.f32873d.getMinimumLoadableRetryCount(this.f32884l2));
    }

    @Override // p000.mja
    public long readDiscontinuity() {
        if (this.f32888o2) {
            this.f32888o2 = false;
            return this.f32891r2;
        }
        if (!this.f32887n2) {
            return -9223372036854775807L;
        }
        if (!this.f32895v2 && getExtractedSamplesCount() <= this.f32894u2) {
            return -9223372036854775807L;
        }
        this.f32887n2 = false;
        return this.f32891r2;
    }

    @Override // p000.mja, p000.yye
    public void reevaluateBuffer(long j) {
    }

    public void release() {
        if (this.f32876e2) {
            for (kle kleVar : this.f32870b2) {
                kleVar.preRelease();
            }
        }
        this.f32861Q.release(this);
        this.f32862V1.removeCallbacksAndMessages(null);
        this.f32866Z1 = null;
        this.f32896w2 = true;
    }

    /* JADX INFO: renamed from: s */
    public void m9939s(int i) throws IOException {
        this.f32870b2[i].maybeThrowError();
        m9938r();
    }

    @Override // p000.bk5
    public void seekMap(final gue gueVar) {
        this.f32862V1.post(new Runnable() { // from class: dfd
            @Override // java.lang.Runnable
            public final void run() {
                this.f29569a.lambda$seekMap$1(gueVar);
            }
        });
    }

    @Override // p000.mja
    public long seekToUs(long j) {
        assertPrepared();
        boolean[] zArr = this.f32880h2.f32917b;
        if (!this.f32881i2.isSeekable()) {
            j = 0;
        }
        int i = 0;
        this.f32887n2 = false;
        boolean z = this.f32891r2 == j;
        this.f32891r2 = j;
        if (isPendingReset()) {
            this.f32892s2 = j;
            return j;
        }
        if (this.f32884l2 != 7 && ((this.f32895v2 || this.f32861Q.isLoading()) && seekInsideBufferUs(zArr, j, z))) {
            return j;
        }
        this.f32893t2 = false;
        this.f32892s2 = j;
        this.f32895v2 = false;
        this.f32888o2 = false;
        if (this.f32861Q.isLoading()) {
            kle[] kleVarArr = this.f32870b2;
            int length = kleVarArr.length;
            while (i < length) {
                kleVarArr[i].discardToEnd();
                i++;
            }
            this.f32861Q.cancelLoading();
        } else {
            this.f32861Q.clearFatalError();
            kle[] kleVarArr2 = this.f32870b2;
            int length2 = kleVarArr2.length;
            while (i < length2) {
                kleVarArr2[i].reset();
                i++;
            }
        }
        return j;
    }

    @Override // p000.mja
    public long selectTracks(of5[] of5VarArr, boolean[] zArr, mle[] mleVarArr, boolean[] zArr2, long j) {
        of5 of5Var;
        assertPrepared();
        C5293f c5293f = this.f32880h2;
        n6h n6hVar = c5293f.f32916a;
        boolean[] zArr3 = c5293f.f32918c;
        int i = this.f32889p2;
        int i2 = 0;
        for (int i3 = 0; i3 < of5VarArr.length; i3++) {
            mle mleVar = mleVarArr[i3];
            if (mleVar != null && (of5VarArr[i3] == null || !zArr[i3])) {
                int i4 = ((C5291d) mleVar).f32912a;
                v80.checkState(zArr3[i4]);
                this.f32889p2--;
                zArr3[i4] = false;
                mleVarArr[i3] = null;
            }
        }
        boolean z = !this.f32886m2 ? j == 0 || this.f32879g2 : i != 0;
        for (int i5 = 0; i5 < of5VarArr.length; i5++) {
            if (mleVarArr[i5] == null && (of5Var = of5VarArr[i5]) != null) {
                v80.checkState(of5Var.length() == 1);
                v80.checkState(of5Var.getIndexInTrackGroup(0) == 0);
                int iIndexOf = n6hVar.indexOf(of5Var.getTrackGroup());
                v80.checkState(!zArr3[iIndexOf]);
                this.f32889p2++;
                zArr3[iIndexOf] = true;
                this.f32888o2 = of5Var.getSelectedFormat().f8297u | this.f32888o2;
                mleVarArr[i5] = new C5291d(iIndexOf);
                zArr2[i5] = true;
                if (!z) {
                    kle kleVar = this.f32870b2[iIndexOf];
                    z = (kleVar.getReadIndex() == 0 || kleVar.seekTo(j, true)) ? false : true;
                }
            }
        }
        if (this.f32889p2 == 0) {
            this.f32893t2 = false;
            this.f32887n2 = false;
            this.f32888o2 = false;
            if (this.f32861Q.isLoading()) {
                kle[] kleVarArr = this.f32870b2;
                int length = kleVarArr.length;
                while (i2 < length) {
                    kleVarArr[i2].discardToEnd();
                    i2++;
                }
                this.f32861Q.cancelLoading();
            } else {
                this.f32895v2 = false;
                kle[] kleVarArr2 = this.f32870b2;
                int length2 = kleVarArr2.length;
                while (i2 < length2) {
                    kleVarArr2[i2].reset();
                    i2++;
                }
            }
        } else if (z) {
            j = seekToUs(j);
            while (i2 < mleVarArr.length) {
                if (mleVarArr[i2] != null) {
                    zArr2[i2] = true;
                }
                i2++;
            }
        }
        this.f32886m2 = true;
        return j;
    }

    /* JADX INFO: renamed from: t */
    public int m9940t(int i, oq6 oq6Var, rl3 rl3Var, int i2) {
        if (suppressRead()) {
            return -3;
        }
        maybeNotifyDownstreamFormat(i);
        int i3 = this.f32870b2[i].read(oq6Var, rl3Var, i2, this.f32895v2);
        if (i3 == -3) {
            maybeStartDeferredRetry(i);
        }
        return i3;
    }

    @Override // p000.bk5
    public q6h track(int i, int i2) {
        return prepareTrackOutput(new C5292e(i, false));
    }

    /* JADX INFO: renamed from: u */
    public int m9941u(int i, long j) {
        if (suppressRead()) {
            return 0;
        }
        maybeNotifyDownstreamFormat(i);
        kle kleVar = this.f32870b2[i];
        int skipCount = kleVar.getSkipCount(j, this.f32895v2);
        kleVar.skip(skipCount);
        if (skipCount == 0) {
            maybeStartDeferredRetry(i);
        }
        return skipCount;
    }

    @Override // p000.uc9.InterfaceC13490b
    public void onLoadCanceled(C5289b c5289b, long j, long j2, boolean z) {
        j4g j4gVar = c5289b.f32900c;
        kc9 kc9Var = new kc9(c5289b.f32898a, c5289b.f32908k, j4gVar.getLastOpenedUri(), j4gVar.getLastResponseHeaders(), j, j2, j4gVar.getBytesRead());
        this.f32873d.onLoadTaskConcluded(c5289b.f32898a);
        this.f32875e.loadCanceled(kc9Var, 1, -1, null, 0, null, c5289b.f32907j, this.f32882j2);
        if (z) {
            return;
        }
        for (kle kleVar : this.f32870b2) {
            kleVar.reset();
        }
        if (this.f32889p2 > 0) {
            ((mja.InterfaceC9368a) v80.checkNotNull(this.f32866Z1)).onContinueLoadingRequested(this);
        }
    }

    @Override // p000.uc9.InterfaceC13490b
    public void onLoadCompleted(C5289b c5289b, long j, long j2) {
        if (this.f32882j2 == -9223372036854775807L && this.f32881i2 != null) {
            long largestQueuedTimestampUs = getLargestQueuedTimestampUs(true);
            long j3 = largestQueuedTimestampUs == Long.MIN_VALUE ? 0L : largestQueuedTimestampUs + 10000;
            this.f32882j2 = j3;
            this.f32885m.onSourceInfoRefreshed(j3, this.f32881i2, this.f32883k2);
        }
        j4g j4gVar = c5289b.f32900c;
        kc9 kc9Var = new kc9(c5289b.f32898a, c5289b.f32908k, j4gVar.getLastOpenedUri(), j4gVar.getLastResponseHeaders(), j, j2, j4gVar.getBytesRead());
        this.f32873d.onLoadTaskConcluded(c5289b.f32898a);
        this.f32875e.loadCompleted(kc9Var, 1, -1, null, 0, null, c5289b.f32907j, this.f32882j2);
        this.f32895v2 = true;
        ((mja.InterfaceC9368a) v80.checkNotNull(this.f32866Z1)).onContinueLoadingRequested(this);
    }

    @Override // p000.uc9.InterfaceC13490b
    public uc9.C13491c onLoadError(C5289b c5289b, long j, long j2, IOException iOException, int i) {
        uc9.C13491c c13491cCreateRetryAction;
        j4g j4gVar = c5289b.f32900c;
        kc9 kc9Var = new kc9(c5289b.f32898a, c5289b.f32908k, j4gVar.getLastOpenedUri(), j4gVar.getLastResponseHeaders(), j, j2, j4gVar.getBytesRead());
        long retryDelayMsFor = this.f32873d.getRetryDelayMsFor(new hc9.C6795d(kc9Var, new fga(1, -1, null, 0, null, t0i.usToMs(c5289b.f32907j), t0i.usToMs(this.f32882j2)), iOException, i));
        if (retryDelayMsFor == -9223372036854775807L) {
            c13491cCreateRetryAction = uc9.f87554l;
        } else {
            int extractedSamplesCount = getExtractedSamplesCount();
            c13491cCreateRetryAction = configureRetry(c5289b, extractedSamplesCount) ? uc9.createRetryAction(extractedSamplesCount > this.f32894u2, retryDelayMsFor) : uc9.f87553k;
        }
        boolean zIsRetry = c13491cCreateRetryAction.isRetry();
        this.f32875e.loadError(kc9Var, 1, -1, null, 0, null, c5289b.f32907j, this.f32882j2, iOException, !zIsRetry);
        if (!zIsRetry) {
            this.f32873d.onLoadTaskConcluded(c5289b.f32898a);
        }
        return c13491cCreateRetryAction;
    }

    @Override // p000.uc9.InterfaceC13490b
    public void onLoadStarted(C5289b c5289b, long j, long j2, int i) {
        j4g j4gVar = c5289b.f32900c;
        this.f32875e.loadStarted(i == 0 ? new kc9(c5289b.f32898a, c5289b.f32908k, j) : new kc9(c5289b.f32898a, c5289b.f32908k, j4gVar.getLastOpenedUri(), j4gVar.getLastResponseHeaders(), j, j2, j4gVar.getBytesRead()), 1, -1, null, 0, null, c5289b.f32907j, this.f32882j2, i);
    }
}
