package p000;

import android.os.SystemClock;
import android.util.Pair;
import androidx.media3.common.C1213a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p000.InterfaceC2409co;
import p000.izc;
import p000.q1h;
import p000.syc;
import p000.una;
import p000.uyc;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class wyc implements InterfaceC2409co, syc.InterfaceC12829a {

    /* JADX INFO: renamed from: A0 */
    public long f95713A0;

    /* JADX INFO: renamed from: B0 */
    @hib
    public C1213a f95714B0;

    /* JADX INFO: renamed from: C0 */
    @hib
    public C1213a f95715C0;

    /* JADX INFO: renamed from: D0 */
    public a8i f95716D0;

    /* JADX INFO: renamed from: n0 */
    public final syc f95717n0;

    /* JADX INFO: renamed from: o0 */
    public final Map<String, C14835b> f95718o0;

    /* JADX INFO: renamed from: p0 */
    public final Map<String, InterfaceC2409co.b> f95719p0;

    /* JADX INFO: renamed from: q0 */
    @hib
    public final InterfaceC14834a f95720q0;

    /* JADX INFO: renamed from: r0 */
    public final boolean f95721r0;

    /* JADX INFO: renamed from: s0 */
    public final q1h.C11270b f95722s0;

    /* JADX INFO: renamed from: t0 */
    public uyc f95723t0;

    /* JADX INFO: renamed from: u0 */
    @hib
    public String f95724u0;

    /* JADX INFO: renamed from: v0 */
    public long f95725v0;

    /* JADX INFO: renamed from: w0 */
    public int f95726w0;

    /* JADX INFO: renamed from: x0 */
    public int f95727x0;

    /* JADX INFO: renamed from: y0 */
    @hib
    public Exception f95728y0;

    /* JADX INFO: renamed from: z0 */
    public long f95729z0;

    /* JADX INFO: renamed from: wyc$a */
    public interface InterfaceC14834a {
        void onPlaybackStatsReady(InterfaceC2409co.b bVar, uyc uycVar);
    }

    /* JADX INFO: renamed from: wyc$b */
    public static final class C14835b {

        /* JADX INFO: renamed from: A */
        public long f95730A;

        /* JADX INFO: renamed from: B */
        public long f95731B;

        /* JADX INFO: renamed from: C */
        public long f95732C;

        /* JADX INFO: renamed from: D */
        public long f95733D;

        /* JADX INFO: renamed from: E */
        public long f95734E;

        /* JADX INFO: renamed from: F */
        public int f95735F;

        /* JADX INFO: renamed from: G */
        public int f95736G;

        /* JADX INFO: renamed from: H */
        public int f95737H;

        /* JADX INFO: renamed from: I */
        public long f95738I;

        /* JADX INFO: renamed from: J */
        public boolean f95739J;

        /* JADX INFO: renamed from: K */
        public boolean f95740K;

        /* JADX INFO: renamed from: L */
        public boolean f95741L;

        /* JADX INFO: renamed from: M */
        public boolean f95742M;

        /* JADX INFO: renamed from: N */
        public boolean f95743N;

        /* JADX INFO: renamed from: O */
        public long f95744O;

        /* JADX INFO: renamed from: P */
        @hib
        public C1213a f95745P;

        /* JADX INFO: renamed from: Q */
        @hib
        public C1213a f95746Q;

        /* JADX INFO: renamed from: R */
        public long f95747R;

        /* JADX INFO: renamed from: S */
        public long f95748S;

        /* JADX INFO: renamed from: T */
        public float f95749T;

        /* JADX INFO: renamed from: a */
        public final boolean f95750a;

        /* JADX INFO: renamed from: b */
        public final long[] f95751b = new long[16];

        /* JADX INFO: renamed from: c */
        public final List<uyc.C13794c> f95752c;

        /* JADX INFO: renamed from: d */
        public final List<long[]> f95753d;

        /* JADX INFO: renamed from: e */
        public final List<uyc.C13793b> f95754e;

        /* JADX INFO: renamed from: f */
        public final List<uyc.C13793b> f95755f;

        /* JADX INFO: renamed from: g */
        public final List<uyc.C13792a> f95756g;

        /* JADX INFO: renamed from: h */
        public final List<uyc.C13792a> f95757h;

        /* JADX INFO: renamed from: i */
        public final boolean f95758i;

        /* JADX INFO: renamed from: j */
        public long f95759j;

        /* JADX INFO: renamed from: k */
        public boolean f95760k;

        /* JADX INFO: renamed from: l */
        public boolean f95761l;

        /* JADX INFO: renamed from: m */
        public boolean f95762m;

        /* JADX INFO: renamed from: n */
        public int f95763n;

        /* JADX INFO: renamed from: o */
        public int f95764o;

        /* JADX INFO: renamed from: p */
        public int f95765p;

        /* JADX INFO: renamed from: q */
        public int f95766q;

        /* JADX INFO: renamed from: r */
        public long f95767r;

        /* JADX INFO: renamed from: s */
        public int f95768s;

        /* JADX INFO: renamed from: t */
        public long f95769t;

        /* JADX INFO: renamed from: u */
        public long f95770u;

        /* JADX INFO: renamed from: v */
        public long f95771v;

        /* JADX INFO: renamed from: w */
        public long f95772w;

        /* JADX INFO: renamed from: x */
        public long f95773x;

        /* JADX INFO: renamed from: y */
        public long f95774y;

        /* JADX INFO: renamed from: z */
        public long f95775z;

        public C14835b(boolean z, InterfaceC2409co.b bVar) {
            this.f95750a = z;
            this.f95752c = z ? new ArrayList<>() : Collections.emptyList();
            this.f95753d = z ? new ArrayList<>() : Collections.emptyList();
            this.f95754e = z ? new ArrayList<>() : Collections.emptyList();
            this.f95755f = z ? new ArrayList<>() : Collections.emptyList();
            this.f95756g = z ? new ArrayList<>() : Collections.emptyList();
            this.f95757h = z ? new ArrayList<>() : Collections.emptyList();
            boolean z2 = false;
            this.f95737H = 0;
            this.f95738I = bVar.f17202a;
            this.f95759j = -9223372036854775807L;
            this.f95767r = -9223372036854775807L;
            una.C13612b c13612b = bVar.f17205d;
            if (c13612b != null && c13612b.isAd()) {
                z2 = true;
            }
            this.f95758i = z2;
            this.f95770u = -1L;
            this.f95769t = -1L;
            this.f95768s = -1;
            this.f95749T = 1.0f;
        }

        private long[] guessMediaTimeBasedOnElapsedRealtime(long j) {
            List<long[]> list = this.f95753d;
            return new long[]{j, list.get(list.size() - 1)[1] + ((long) ((j - r0[0]) * this.f95749T))};
        }

        private static boolean isInvalidJoinTransition(int i, int i2) {
            return ((i != 1 && i != 2 && i != 14) || i2 == 1 || i2 == 2 || i2 == 14 || i2 == 3 || i2 == 4 || i2 == 9 || i2 == 11) ? false : true;
        }

        private static boolean isPausedState(int i) {
            return i == 4 || i == 7;
        }

        private static boolean isReadyState(int i) {
            return i == 3 || i == 4 || i == 9;
        }

        private static boolean isRebufferingState(int i) {
            return i == 6 || i == 7 || i == 10;
        }

        private void maybeRecordAudioFormatTime(long j) {
            C1213a c1213a;
            int i;
            if (this.f95737H == 3 && (c1213a = this.f95746Q) != null && (i = c1213a.f8286j) != -1) {
                long j2 = (long) ((j - this.f95748S) * this.f95749T);
                this.f95775z += j2;
                this.f95730A += j2 * ((long) i);
            }
            this.f95748S = j;
        }

        private void maybeRecordVideoFormatTime(long j) {
            C1213a c1213a;
            if (this.f95737H == 3 && (c1213a = this.f95745P) != null) {
                long j2 = (long) ((j - this.f95747R) * this.f95749T);
                int i = c1213a.f8299w;
                if (i != -1) {
                    this.f95771v += j2;
                    this.f95772w += ((long) i) * j2;
                }
                int i2 = c1213a.f8286j;
                if (i2 != -1) {
                    this.f95773x += j2;
                    this.f95774y += j2 * ((long) i2);
                }
            }
            this.f95747R = j;
        }

        private void maybeUpdateAudioFormat(InterfaceC2409co.b bVar, @hib C1213a c1213a) {
            int i;
            if (Objects.equals(this.f95746Q, c1213a)) {
                return;
            }
            maybeRecordAudioFormatTime(bVar.f17202a);
            if (c1213a != null && this.f95770u == -1 && (i = c1213a.f8286j) != -1) {
                this.f95770u = i;
            }
            this.f95746Q = c1213a;
            if (this.f95750a) {
                this.f95755f.add(new uyc.C13793b(bVar, c1213a));
            }
        }

        private void maybeUpdateMaxRebufferTimeMs(long j) {
            if (isRebufferingState(this.f95737H)) {
                long j2 = j - this.f95744O;
                long j3 = this.f95767r;
                if (j3 == -9223372036854775807L || j2 > j3) {
                    this.f95767r = j2;
                }
            }
        }

        private void maybeUpdateMediaTimeHistory(long j, long j2) {
            if (this.f95750a) {
                if (this.f95737H != 3) {
                    if (j2 == -9223372036854775807L) {
                        return;
                    }
                    if (!this.f95753d.isEmpty()) {
                        List<long[]> list = this.f95753d;
                        long j3 = list.get(list.size() - 1)[1];
                        if (j3 != j2) {
                            this.f95753d.add(new long[]{j, j3});
                        }
                    }
                }
                if (j2 != -9223372036854775807L) {
                    this.f95753d.add(new long[]{j, j2});
                } else {
                    if (this.f95753d.isEmpty()) {
                        return;
                    }
                    this.f95753d.add(guessMediaTimeBasedOnElapsedRealtime(j));
                }
            }
        }

        private void maybeUpdateVideoFormat(InterfaceC2409co.b bVar, @hib C1213a c1213a) {
            int i;
            int i2;
            if (Objects.equals(this.f95745P, c1213a)) {
                return;
            }
            maybeRecordVideoFormatTime(bVar.f17202a);
            if (c1213a != null) {
                if (this.f95768s == -1 && (i2 = c1213a.f8299w) != -1) {
                    this.f95768s = i2;
                }
                if (this.f95769t == -1 && (i = c1213a.f8286j) != -1) {
                    this.f95769t = i;
                }
            }
            this.f95745P = c1213a;
            if (this.f95750a) {
                this.f95754e.add(new uyc.C13793b(bVar, c1213a));
            }
        }

        private int resolveNewPlaybackState(izc izcVar) {
            int playbackState = izcVar.getPlaybackState();
            if (this.f95739J && this.f95740K) {
                return 5;
            }
            if (this.f95742M) {
                return 13;
            }
            if (!this.f95740K) {
                return this.f95743N ? 1 : 0;
            }
            if (this.f95741L) {
                return 14;
            }
            if (playbackState == 4) {
                return 11;
            }
            if (playbackState != 2) {
                if (playbackState == 3) {
                    if (izcVar.getPlayWhenReady()) {
                        return izcVar.getPlaybackSuppressionReason() != 0 ? 9 : 3;
                    }
                    return 4;
                }
                if (playbackState != 1 || this.f95737H == 0) {
                    return this.f95737H;
                }
                return 12;
            }
            int i = this.f95737H;
            if (i == 0 || i == 1 || i == 2 || i == 14) {
                return 2;
            }
            if (izcVar.getPlayWhenReady()) {
                return izcVar.getPlaybackSuppressionReason() != 0 ? 10 : 6;
            }
            return 7;
        }

        private void updatePlaybackState(int i, InterfaceC2409co.b bVar) {
            v80.checkArgument(bVar.f17202a >= this.f95738I);
            long j = bVar.f17202a;
            long j2 = j - this.f95738I;
            long[] jArr = this.f95751b;
            int i2 = this.f95737H;
            jArr[i2] = jArr[i2] + j2;
            if (this.f95759j == -9223372036854775807L) {
                this.f95759j = j;
            }
            this.f95762m |= isInvalidJoinTransition(i2, i);
            this.f95760k |= isReadyState(i);
            this.f95761l |= i == 11;
            if (!isPausedState(this.f95737H) && isPausedState(i)) {
                this.f95763n++;
            }
            if (i == 5) {
                this.f95765p++;
            }
            if (!isRebufferingState(this.f95737H) && isRebufferingState(i)) {
                this.f95766q++;
                this.f95744O = bVar.f17202a;
            }
            if (isRebufferingState(this.f95737H) && this.f95737H != 7 && i == 7) {
                this.f95764o++;
            }
            maybeUpdateMaxRebufferTimeMs(bVar.f17202a);
            this.f95737H = i;
            this.f95738I = bVar.f17202a;
            if (this.f95750a) {
                this.f95752c.add(new uyc.C13794c(bVar, i));
            }
        }

        public uyc build(boolean z) {
            long[] jArr;
            List<long[]> list;
            long j;
            int i;
            long[] jArr2 = this.f95751b;
            List<long[]> list2 = this.f95753d;
            if (z) {
                jArr = jArr2;
                list = list2;
            } else {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                long[] jArrCopyOf = Arrays.copyOf(this.f95751b, 16);
                long jMax = Math.max(0L, jElapsedRealtime - this.f95738I);
                int i2 = this.f95737H;
                jArrCopyOf[i2] = jArrCopyOf[i2] + jMax;
                maybeUpdateMaxRebufferTimeMs(jElapsedRealtime);
                maybeRecordVideoFormatTime(jElapsedRealtime);
                maybeRecordAudioFormatTime(jElapsedRealtime);
                ArrayList arrayList = new ArrayList(this.f95753d);
                if (this.f95750a && this.f95737H == 3) {
                    arrayList.add(guessMediaTimeBasedOnElapsedRealtime(jElapsedRealtime));
                }
                jArr = jArrCopyOf;
                list = arrayList;
            }
            int i3 = (this.f95762m || !this.f95760k) ? 1 : 0;
            long j2 = i3 != 0 ? -9223372036854775807L : jArr[2];
            int i4 = jArr[1] > 0 ? 1 : 0;
            List arrayList2 = z ? this.f95754e : new ArrayList(this.f95754e);
            List arrayList3 = z ? this.f95755f : new ArrayList(this.f95755f);
            List arrayList4 = z ? this.f95752c : new ArrayList(this.f95752c);
            long j3 = this.f95759j;
            boolean z2 = this.f95740K;
            int i5 = !this.f95760k ? 1 : 0;
            boolean z3 = this.f95761l;
            int i6 = i3 ^ 1;
            int i7 = this.f95763n;
            int i8 = this.f95764o;
            int i9 = this.f95765p;
            int i10 = this.f95766q;
            long j4 = this.f95767r;
            boolean z4 = this.f95758i;
            long[] jArr3 = jArr;
            long j5 = this.f95771v;
            long j6 = this.f95772w;
            long j7 = this.f95773x;
            long j8 = this.f95774y;
            long j9 = this.f95775z;
            long j10 = this.f95730A;
            int i11 = this.f95768s;
            int i12 = i11 == -1 ? 0 : 1;
            long j11 = this.f95769t;
            int i13 = j11 == -1 ? 0 : 1;
            long j12 = this.f95770u;
            if (j12 == -1) {
                j = j12;
                i = 0;
            } else {
                j = j12;
                i = 1;
            }
            long j13 = this.f95731B;
            long j14 = this.f95732C;
            long j15 = this.f95733D;
            long j16 = this.f95734E;
            int i14 = this.f95735F;
            return new uyc(1, jArr3, arrayList4, list, j3, z2 ? 1 : 0, i5, z3 ? 1 : 0, i4, j2, i6, i7, i8, i9, i10, j4, z4 ? 1 : 0, arrayList2, arrayList3, j5, j6, j7, j8, j9, j10, i12, i13, i11, j11, i, j, j13, j14, j15, j16, i14 > 0 ? 1 : 0, i14, this.f95736G, this.f95756g, this.f95757h);
        }

        public void onEvents(izc izcVar, InterfaceC2409co.b bVar, boolean z, long j, boolean z2, int i, boolean z3, boolean z4, @hib kyc kycVar, @hib Exception exc, long j2, long j3, @hib C1213a c1213a, @hib C1213a c1213a2, @hib a8i a8iVar) {
            if (j != -9223372036854775807L) {
                maybeUpdateMediaTimeHistory(bVar.f17202a, j);
                this.f95739J = true;
            }
            if (izcVar.getPlaybackState() != 2) {
                this.f95739J = false;
            }
            int playbackState = izcVar.getPlaybackState();
            if (playbackState == 1 || playbackState == 4 || z2) {
                this.f95741L = false;
            }
            if (kycVar != null) {
                this.f95742M = true;
                this.f95735F++;
                if (this.f95750a) {
                    this.f95756g.add(new uyc.C13792a(bVar, kycVar));
                }
            } else if (izcVar.getPlayerError() == null) {
                this.f95742M = false;
            }
            if (this.f95740K && !this.f95741L) {
                x7h currentTracks = izcVar.getCurrentTracks();
                if (!currentTracks.isTypeSelected(2)) {
                    maybeUpdateVideoFormat(bVar, null);
                }
                if (!currentTracks.isTypeSelected(1)) {
                    maybeUpdateAudioFormat(bVar, null);
                }
            }
            if (c1213a != null) {
                maybeUpdateVideoFormat(bVar, c1213a);
            }
            if (c1213a2 != null) {
                maybeUpdateAudioFormat(bVar, c1213a2);
            }
            C1213a c1213a3 = this.f95745P;
            if (c1213a3 != null && c1213a3.f8299w == -1 && a8iVar != null) {
                maybeUpdateVideoFormat(bVar, c1213a3.buildUpon().setWidth(a8iVar.f647a).setHeight(a8iVar.f648b).build());
            }
            if (z4) {
                this.f95743N = true;
            }
            if (z3) {
                this.f95734E++;
            }
            this.f95733D += (long) i;
            this.f95731B += j2;
            this.f95732C += j3;
            if (exc != null) {
                this.f95736G++;
                if (this.f95750a) {
                    this.f95757h.add(new uyc.C13792a(bVar, exc));
                }
            }
            int iResolveNewPlaybackState = resolveNewPlaybackState(izcVar);
            float f = izcVar.getPlaybackParameters().f80107a;
            if (this.f95737H != iResolveNewPlaybackState || this.f95749T != f) {
                maybeUpdateMediaTimeHistory(bVar.f17202a, z ? bVar.f17206e : -9223372036854775807L);
                maybeRecordVideoFormatTime(bVar.f17202a);
                maybeRecordAudioFormatTime(bVar.f17202a);
            }
            this.f95749T = f;
            if (this.f95737H != iResolveNewPlaybackState) {
                updatePlaybackState(iResolveNewPlaybackState, bVar);
            }
        }

        public void onFinished(InterfaceC2409co.b bVar, boolean z, long j) {
            int i = 11;
            if (this.f95737H != 11 && !z) {
                i = 15;
            }
            maybeUpdateMediaTimeHistory(bVar.f17202a, j);
            maybeRecordVideoFormatTime(bVar.f17202a);
            maybeRecordAudioFormatTime(bVar.f17202a);
            updatePlaybackState(i, bVar);
        }

        public void onForeground() {
            this.f95740K = true;
        }

        public void onInterruptedByAd() {
            this.f95741L = true;
            this.f95739J = false;
        }
    }

    public wyc(boolean z, @hib InterfaceC14834a interfaceC14834a) {
        this.f95720q0 = interfaceC14834a;
        this.f95721r0 = z;
        zx3 zx3Var = new zx3();
        this.f95717n0 = zx3Var;
        this.f95718o0 = new HashMap();
        this.f95719p0 = new HashMap();
        this.f95723t0 = uyc.f89457e0;
        this.f95722s0 = new q1h.C11270b();
        this.f95716D0 = a8i.f643h;
        zx3Var.setListener(this);
    }

    private Pair<InterfaceC2409co.b, Boolean> findBestEventTime(InterfaceC2409co.c cVar, String str) {
        una.C13612b c13612b;
        InterfaceC2409co.b bVar = null;
        boolean zBelongsToSession = false;
        for (int i = 0; i < cVar.size(); i++) {
            InterfaceC2409co.b eventTime = cVar.getEventTime(cVar.get(i));
            boolean zBelongsToSession2 = this.f95717n0.belongsToSession(eventTime, str);
            if (bVar == null || ((zBelongsToSession2 && !zBelongsToSession) || (zBelongsToSession2 == zBelongsToSession && eventTime.f17202a > bVar.f17202a))) {
                bVar = eventTime;
                zBelongsToSession = zBelongsToSession2;
            }
        }
        v80.checkNotNull(bVar);
        if (!zBelongsToSession && (c13612b = bVar.f17205d) != null && c13612b.isAd()) {
            long adGroupTimeUs = bVar.f17203b.getPeriodByUid(bVar.f17205d.f88603a, this.f95722s0).getAdGroupTimeUs(bVar.f17205d.f88604b);
            if (adGroupTimeUs == Long.MIN_VALUE) {
                adGroupTimeUs = this.f95722s0.f72947d;
            }
            long positionInWindowUs = adGroupTimeUs + this.f95722s0.getPositionInWindowUs();
            long j = bVar.f17202a;
            q1h q1hVar = bVar.f17203b;
            int i2 = bVar.f17204c;
            una.C13612b c13612b2 = bVar.f17205d;
            InterfaceC2409co.b bVar2 = new InterfaceC2409co.b(j, q1hVar, i2, new una.C13612b(c13612b2.f88603a, c13612b2.f88606d, c13612b2.f88604b), t0i.usToMs(positionInWindowUs), bVar.f17203b, bVar.f17208g, bVar.f17209h, bVar.f17210i, bVar.f17211j);
            zBelongsToSession = this.f95717n0.belongsToSession(bVar2, str);
            bVar = bVar2;
        }
        return Pair.create(bVar, Boolean.valueOf(zBelongsToSession));
    }

    private boolean hasEvent(InterfaceC2409co.c cVar, String str, int i) {
        return cVar.contains(i) && this.f95717n0.belongsToSession(cVar.getEventTime(i), str);
    }

    private void maybeAddSessions(InterfaceC2409co.c cVar) {
        for (int i = 0; i < cVar.size(); i++) {
            int i2 = cVar.get(i);
            InterfaceC2409co.b eventTime = cVar.getEventTime(i2);
            if (i2 == 0) {
                this.f95717n0.updateSessionsWithTimelineChange(eventTime);
            } else if (i2 == 11) {
                this.f95717n0.updateSessionsWithDiscontinuity(eventTime, this.f95726w0);
            } else {
                this.f95717n0.updateSessions(eventTime);
            }
        }
    }

    public uyc getCombinedPlaybackStats() {
        int i = 1;
        uyc[] uycVarArr = new uyc[this.f95718o0.size() + 1];
        uycVarArr[0] = this.f95723t0;
        Iterator<C14835b> it = this.f95718o0.values().iterator();
        while (it.hasNext()) {
            uycVarArr[i] = it.next().build(false);
            i++;
        }
        return uyc.merge(uycVarArr);
    }

    @hib
    public uyc getPlaybackStats() {
        String activeSessionId = this.f95717n0.getActiveSessionId();
        C14835b c14835b = activeSessionId == null ? null : this.f95718o0.get(activeSessionId);
        if (c14835b == null) {
            return null;
        }
        return c14835b.build(false);
    }

    @Override // p000.syc.InterfaceC12829a
    public void onAdPlaybackStarted(InterfaceC2409co.b bVar, String str, String str2) {
        ((C14835b) v80.checkNotNull(this.f95718o0.get(str))).onInterruptedByAd();
    }

    @Override // p000.InterfaceC2409co
    public void onBandwidthEstimate(InterfaceC2409co.b bVar, int i, long j, long j2) {
        this.f95729z0 = i;
        this.f95713A0 = j;
    }

    @Override // p000.InterfaceC2409co
    public void onDownstreamFormatChanged(InterfaceC2409co.b bVar, fga fgaVar) {
        int i = fgaVar.f36527b;
        if (i == 2 || i == 0) {
            this.f95714B0 = fgaVar.f36528c;
        } else if (i == 1) {
            this.f95715C0 = fgaVar.f36528c;
        }
    }

    @Override // p000.InterfaceC2409co
    public void onDrmSessionManagerError(InterfaceC2409co.b bVar, Exception exc) {
        this.f95728y0 = exc;
    }

    @Override // p000.InterfaceC2409co
    public void onDroppedVideoFrames(InterfaceC2409co.b bVar, int i, long j) {
        this.f95727x0 = i;
    }

    @Override // p000.InterfaceC2409co
    public void onEvents(izc izcVar, InterfaceC2409co.c cVar) {
        if (cVar.size() == 0) {
            return;
        }
        maybeAddSessions(cVar);
        for (String str : this.f95718o0.keySet()) {
            Pair<InterfaceC2409co.b, Boolean> pairFindBestEventTime = findBestEventTime(cVar, str);
            C14835b c14835b = this.f95718o0.get(str);
            boolean zHasEvent = hasEvent(cVar, str, 11);
            boolean zHasEvent2 = hasEvent(cVar, str, 1018);
            boolean zHasEvent3 = hasEvent(cVar, str, 1011);
            boolean zHasEvent4 = hasEvent(cVar, str, 1000);
            boolean zHasEvent5 = hasEvent(cVar, str, 10);
            boolean z = hasEvent(cVar, str, 1003) || hasEvent(cVar, str, 1024);
            boolean zHasEvent6 = hasEvent(cVar, str, 1006);
            boolean zHasEvent7 = hasEvent(cVar, str, 1004);
            c14835b.onEvents(izcVar, (InterfaceC2409co.b) pairFindBestEventTime.first, ((Boolean) pairFindBestEventTime.second).booleanValue(), str.equals(this.f95724u0) ? this.f95725v0 : -9223372036854775807L, zHasEvent, zHasEvent2 ? this.f95727x0 : 0, zHasEvent3, zHasEvent4, zHasEvent5 ? izcVar.getPlayerError() : null, z ? this.f95728y0 : null, zHasEvent6 ? this.f95729z0 : 0L, zHasEvent6 ? this.f95713A0 : 0L, zHasEvent7 ? this.f95714B0 : null, zHasEvent7 ? this.f95715C0 : null, hasEvent(cVar, str, 25) ? this.f95716D0 : null);
        }
        this.f95714B0 = null;
        this.f95715C0 = null;
        this.f95724u0 = null;
        if (cVar.contains(1028)) {
            this.f95717n0.finishAllSessions(cVar.getEventTime(1028));
        }
    }

    @Override // p000.InterfaceC2409co
    public void onLoadError(InterfaceC2409co.b bVar, kc9 kc9Var, fga fgaVar, IOException iOException, boolean z) {
        this.f95728y0 = iOException;
    }

    @Override // p000.InterfaceC2409co
    public void onPositionDiscontinuity(InterfaceC2409co.b bVar, izc.C7684k c7684k, izc.C7684k c7684k2, int i) {
        if (this.f95724u0 == null) {
            this.f95724u0 = this.f95717n0.getActiveSessionId();
            this.f95725v0 = c7684k.f49137g;
        }
        this.f95726w0 = i;
    }

    @Override // p000.syc.InterfaceC12829a
    public void onSessionActive(InterfaceC2409co.b bVar, String str) {
        ((C14835b) v80.checkNotNull(this.f95718o0.get(str))).onForeground();
    }

    @Override // p000.syc.InterfaceC12829a
    public void onSessionCreated(InterfaceC2409co.b bVar, String str) {
        this.f95718o0.put(str, new C14835b(this.f95721r0, bVar));
        this.f95719p0.put(str, bVar);
    }

    @Override // p000.syc.InterfaceC12829a
    public void onSessionFinished(InterfaceC2409co.b bVar, String str, boolean z) {
        C14835b c14835b = (C14835b) v80.checkNotNull(this.f95718o0.remove(str));
        InterfaceC2409co.b bVar2 = (InterfaceC2409co.b) v80.checkNotNull(this.f95719p0.remove(str));
        c14835b.onFinished(bVar, z, str.equals(this.f95724u0) ? this.f95725v0 : -9223372036854775807L);
        uyc uycVarBuild = c14835b.build(true);
        this.f95723t0 = uyc.merge(this.f95723t0, uycVarBuild);
        InterfaceC14834a interfaceC14834a = this.f95720q0;
        if (interfaceC14834a != null) {
            interfaceC14834a.onPlaybackStatsReady(bVar2, uycVarBuild);
        }
    }

    @Override // p000.InterfaceC2409co
    public void onVideoSizeChanged(InterfaceC2409co.b bVar, a8i a8iVar) {
        this.f95716D0 = a8iVar;
    }
}
