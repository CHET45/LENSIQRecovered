package p000;

import android.os.SystemClock;
import android.util.Pair;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p000.InterfaceC5415eo;
import p000.lzc;
import p000.t1h;
import p000.tyc;
import p000.vna;
import p000.vyc;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class xyc implements InterfaceC5415eo, tyc.InterfaceC13289a {

    /* JADX INFO: renamed from: A0 */
    public z7i f99696A0;

    /* JADX INFO: renamed from: k0 */
    public final tyc f99697k0;

    /* JADX INFO: renamed from: l0 */
    public final Map<String, C15357b> f99698l0;

    /* JADX INFO: renamed from: m0 */
    public final Map<String, InterfaceC5415eo.b> f99699m0;

    /* JADX INFO: renamed from: n0 */
    @hib
    public final InterfaceC15356a f99700n0;

    /* JADX INFO: renamed from: o0 */
    public final boolean f99701o0;

    /* JADX INFO: renamed from: p0 */
    public final t1h.C12849b f99702p0;

    /* JADX INFO: renamed from: q0 */
    public vyc f99703q0;

    /* JADX INFO: renamed from: r0 */
    @hib
    public String f99704r0;

    /* JADX INFO: renamed from: s0 */
    public long f99705s0;

    /* JADX INFO: renamed from: t0 */
    public int f99706t0;

    /* JADX INFO: renamed from: u0 */
    public int f99707u0;

    /* JADX INFO: renamed from: v0 */
    @hib
    public Exception f99708v0;

    /* JADX INFO: renamed from: w0 */
    public long f99709w0;

    /* JADX INFO: renamed from: x0 */
    public long f99710x0;

    /* JADX INFO: renamed from: y0 */
    @hib
    public kq6 f99711y0;

    /* JADX INFO: renamed from: z0 */
    @hib
    public kq6 f99712z0;

    /* JADX INFO: renamed from: xyc$a */
    public interface InterfaceC15356a {
        void onPlaybackStatsReady(InterfaceC5415eo.b bVar, vyc vycVar);
    }

    /* JADX INFO: renamed from: xyc$b */
    public static final class C15357b {

        /* JADX INFO: renamed from: A */
        public long f99713A;

        /* JADX INFO: renamed from: B */
        public long f99714B;

        /* JADX INFO: renamed from: C */
        public long f99715C;

        /* JADX INFO: renamed from: D */
        public long f99716D;

        /* JADX INFO: renamed from: E */
        public long f99717E;

        /* JADX INFO: renamed from: F */
        public int f99718F;

        /* JADX INFO: renamed from: G */
        public int f99719G;

        /* JADX INFO: renamed from: H */
        public int f99720H;

        /* JADX INFO: renamed from: I */
        public long f99721I;

        /* JADX INFO: renamed from: J */
        public boolean f99722J;

        /* JADX INFO: renamed from: K */
        public boolean f99723K;

        /* JADX INFO: renamed from: L */
        public boolean f99724L;

        /* JADX INFO: renamed from: M */
        public boolean f99725M;

        /* JADX INFO: renamed from: N */
        public boolean f99726N;

        /* JADX INFO: renamed from: O */
        public long f99727O;

        /* JADX INFO: renamed from: P */
        @hib
        public kq6 f99728P;

        /* JADX INFO: renamed from: Q */
        @hib
        public kq6 f99729Q;

        /* JADX INFO: renamed from: R */
        public long f99730R;

        /* JADX INFO: renamed from: S */
        public long f99731S;

        /* JADX INFO: renamed from: T */
        public float f99732T;

        /* JADX INFO: renamed from: a */
        public final boolean f99733a;

        /* JADX INFO: renamed from: b */
        public final long[] f99734b = new long[16];

        /* JADX INFO: renamed from: c */
        public final List<vyc.C14304c> f99735c;

        /* JADX INFO: renamed from: d */
        public final List<long[]> f99736d;

        /* JADX INFO: renamed from: e */
        public final List<vyc.C14303b> f99737e;

        /* JADX INFO: renamed from: f */
        public final List<vyc.C14303b> f99738f;

        /* JADX INFO: renamed from: g */
        public final List<vyc.C14302a> f99739g;

        /* JADX INFO: renamed from: h */
        public final List<vyc.C14302a> f99740h;

        /* JADX INFO: renamed from: i */
        public final boolean f99741i;

        /* JADX INFO: renamed from: j */
        public long f99742j;

        /* JADX INFO: renamed from: k */
        public boolean f99743k;

        /* JADX INFO: renamed from: l */
        public boolean f99744l;

        /* JADX INFO: renamed from: m */
        public boolean f99745m;

        /* JADX INFO: renamed from: n */
        public int f99746n;

        /* JADX INFO: renamed from: o */
        public int f99747o;

        /* JADX INFO: renamed from: p */
        public int f99748p;

        /* JADX INFO: renamed from: q */
        public int f99749q;

        /* JADX INFO: renamed from: r */
        public long f99750r;

        /* JADX INFO: renamed from: s */
        public int f99751s;

        /* JADX INFO: renamed from: t */
        public long f99752t;

        /* JADX INFO: renamed from: u */
        public long f99753u;

        /* JADX INFO: renamed from: v */
        public long f99754v;

        /* JADX INFO: renamed from: w */
        public long f99755w;

        /* JADX INFO: renamed from: x */
        public long f99756x;

        /* JADX INFO: renamed from: y */
        public long f99757y;

        /* JADX INFO: renamed from: z */
        public long f99758z;

        public C15357b(boolean z, InterfaceC5415eo.b bVar) {
            this.f99733a = z;
            this.f99735c = z ? new ArrayList<>() : Collections.emptyList();
            this.f99736d = z ? new ArrayList<>() : Collections.emptyList();
            this.f99737e = z ? new ArrayList<>() : Collections.emptyList();
            this.f99738f = z ? new ArrayList<>() : Collections.emptyList();
            this.f99739g = z ? new ArrayList<>() : Collections.emptyList();
            this.f99740h = z ? new ArrayList<>() : Collections.emptyList();
            boolean z2 = false;
            this.f99720H = 0;
            this.f99721I = bVar.f33692a;
            this.f99742j = -9223372036854775807L;
            this.f99750r = -9223372036854775807L;
            vna.C14175b c14175b = bVar.f33695d;
            if (c14175b != null && c14175b.isAd()) {
                z2 = true;
            }
            this.f99741i = z2;
            this.f99753u = -1L;
            this.f99752t = -1L;
            this.f99751s = -1;
            this.f99732T = 1.0f;
        }

        private long[] guessMediaTimeBasedOnElapsedRealtime(long j) {
            List<long[]> list = this.f99736d;
            return new long[]{j, list.get(list.size() - 1)[1] + ((long) ((j - r0[0]) * this.f99732T))};
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
            kq6 kq6Var;
            int i;
            if (this.f99720H == 3 && (kq6Var = this.f99729Q) != null && (i = kq6Var.f54985C) != -1) {
                long j2 = (long) ((j - this.f99731S) * this.f99732T);
                this.f99758z += j2;
                this.f99713A += j2 * ((long) i);
            }
            this.f99731S = j;
        }

        private void maybeRecordVideoFormatTime(long j) {
            kq6 kq6Var;
            if (this.f99720H == 3 && (kq6Var = this.f99728P) != null) {
                long j2 = (long) ((j - this.f99730R) * this.f99732T);
                int i = kq6Var.f54990M1;
                if (i != -1) {
                    this.f99754v += j2;
                    this.f99755w += ((long) i) * j2;
                }
                int i2 = kq6Var.f54985C;
                if (i2 != -1) {
                    this.f99756x += j2;
                    this.f99757y += j2 * ((long) i2);
                }
            }
            this.f99730R = j;
        }

        private void maybeUpdateAudioFormat(InterfaceC5415eo.b bVar, @hib kq6 kq6Var) {
            int i;
            if (x0i.areEqual(this.f99729Q, kq6Var)) {
                return;
            }
            maybeRecordAudioFormatTime(bVar.f33692a);
            if (kq6Var != null && this.f99753u == -1 && (i = kq6Var.f54985C) != -1) {
                this.f99753u = i;
            }
            this.f99729Q = kq6Var;
            if (this.f99733a) {
                this.f99738f.add(new vyc.C14303b(bVar, kq6Var));
            }
        }

        private void maybeUpdateMaxRebufferTimeMs(long j) {
            if (isRebufferingState(this.f99720H)) {
                long j2 = j - this.f99727O;
                long j3 = this.f99750r;
                if (j3 == -9223372036854775807L || j2 > j3) {
                    this.f99750r = j2;
                }
            }
        }

        private void maybeUpdateMediaTimeHistory(long j, long j2) {
            if (this.f99733a) {
                if (this.f99720H != 3) {
                    if (j2 == -9223372036854775807L) {
                        return;
                    }
                    if (!this.f99736d.isEmpty()) {
                        List<long[]> list = this.f99736d;
                        long j3 = list.get(list.size() - 1)[1];
                        if (j3 != j2) {
                            this.f99736d.add(new long[]{j, j3});
                        }
                    }
                }
                if (j2 != -9223372036854775807L) {
                    this.f99736d.add(new long[]{j, j2});
                } else {
                    if (this.f99736d.isEmpty()) {
                        return;
                    }
                    this.f99736d.add(guessMediaTimeBasedOnElapsedRealtime(j));
                }
            }
        }

        private void maybeUpdateVideoFormat(InterfaceC5415eo.b bVar, @hib kq6 kq6Var) {
            int i;
            int i2;
            if (x0i.areEqual(this.f99728P, kq6Var)) {
                return;
            }
            maybeRecordVideoFormatTime(bVar.f33692a);
            if (kq6Var != null) {
                if (this.f99751s == -1 && (i2 = kq6Var.f54990M1) != -1) {
                    this.f99751s = i2;
                }
                if (this.f99752t == -1 && (i = kq6Var.f54985C) != -1) {
                    this.f99752t = i;
                }
            }
            this.f99728P = kq6Var;
            if (this.f99733a) {
                this.f99737e.add(new vyc.C14303b(bVar, kq6Var));
            }
        }

        private int resolveNewPlaybackState(lzc lzcVar) {
            int playbackState = lzcVar.getPlaybackState();
            if (this.f99722J && this.f99723K) {
                return 5;
            }
            if (this.f99725M) {
                return 13;
            }
            if (!this.f99723K) {
                return this.f99726N ? 1 : 0;
            }
            if (this.f99724L) {
                return 14;
            }
            if (playbackState == 4) {
                return 11;
            }
            if (playbackState != 2) {
                if (playbackState == 3) {
                    if (lzcVar.getPlayWhenReady()) {
                        return lzcVar.getPlaybackSuppressionReason() != 0 ? 9 : 3;
                    }
                    return 4;
                }
                if (playbackState != 1 || this.f99720H == 0) {
                    return this.f99720H;
                }
                return 12;
            }
            int i = this.f99720H;
            if (i == 0 || i == 1 || i == 2 || i == 14) {
                return 2;
            }
            if (lzcVar.getPlayWhenReady()) {
                return lzcVar.getPlaybackSuppressionReason() != 0 ? 10 : 6;
            }
            return 7;
        }

        private void updatePlaybackState(int i, InterfaceC5415eo.b bVar) {
            u80.checkArgument(bVar.f33692a >= this.f99721I);
            long j = bVar.f33692a;
            long j2 = j - this.f99721I;
            long[] jArr = this.f99734b;
            int i2 = this.f99720H;
            jArr[i2] = jArr[i2] + j2;
            if (this.f99742j == -9223372036854775807L) {
                this.f99742j = j;
            }
            this.f99745m |= isInvalidJoinTransition(i2, i);
            this.f99743k |= isReadyState(i);
            this.f99744l |= i == 11;
            if (!isPausedState(this.f99720H) && isPausedState(i)) {
                this.f99746n++;
            }
            if (i == 5) {
                this.f99748p++;
            }
            if (!isRebufferingState(this.f99720H) && isRebufferingState(i)) {
                this.f99749q++;
                this.f99727O = bVar.f33692a;
            }
            if (isRebufferingState(this.f99720H) && this.f99720H != 7 && i == 7) {
                this.f99747o++;
            }
            maybeUpdateMaxRebufferTimeMs(bVar.f33692a);
            this.f99720H = i;
            this.f99721I = bVar.f33692a;
            if (this.f99733a) {
                this.f99735c.add(new vyc.C14304c(bVar, i));
            }
        }

        public vyc build(boolean z) {
            long[] jArr;
            List<long[]> list;
            long j;
            int i;
            long[] jArr2 = this.f99734b;
            List<long[]> list2 = this.f99736d;
            if (z) {
                jArr = jArr2;
                list = list2;
            } else {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                long[] jArrCopyOf = Arrays.copyOf(this.f99734b, 16);
                long jMax = Math.max(0L, jElapsedRealtime - this.f99721I);
                int i2 = this.f99720H;
                jArrCopyOf[i2] = jArrCopyOf[i2] + jMax;
                maybeUpdateMaxRebufferTimeMs(jElapsedRealtime);
                maybeRecordVideoFormatTime(jElapsedRealtime);
                maybeRecordAudioFormatTime(jElapsedRealtime);
                ArrayList arrayList = new ArrayList(this.f99736d);
                if (this.f99733a && this.f99720H == 3) {
                    arrayList.add(guessMediaTimeBasedOnElapsedRealtime(jElapsedRealtime));
                }
                jArr = jArrCopyOf;
                list = arrayList;
            }
            int i3 = (this.f99745m || !this.f99743k) ? 1 : 0;
            long j2 = i3 != 0 ? -9223372036854775807L : jArr[2];
            int i4 = jArr[1] > 0 ? 1 : 0;
            List arrayList2 = z ? this.f99737e : new ArrayList(this.f99737e);
            List arrayList3 = z ? this.f99738f : new ArrayList(this.f99738f);
            List arrayList4 = z ? this.f99735c : new ArrayList(this.f99735c);
            long j3 = this.f99742j;
            boolean z2 = this.f99723K;
            int i5 = !this.f99743k ? 1 : 0;
            boolean z3 = this.f99744l;
            int i6 = i3 ^ 1;
            int i7 = this.f99746n;
            int i8 = this.f99747o;
            int i9 = this.f99748p;
            int i10 = this.f99749q;
            long j4 = this.f99750r;
            boolean z4 = this.f99741i;
            long[] jArr3 = jArr;
            long j5 = this.f99754v;
            long j6 = this.f99755w;
            long j7 = this.f99756x;
            long j8 = this.f99757y;
            long j9 = this.f99758z;
            long j10 = this.f99713A;
            int i11 = this.f99751s;
            int i12 = i11 == -1 ? 0 : 1;
            long j11 = this.f99752t;
            int i13 = j11 == -1 ? 0 : 1;
            long j12 = this.f99753u;
            if (j12 == -1) {
                j = j12;
                i = 0;
            } else {
                j = j12;
                i = 1;
            }
            long j13 = this.f99714B;
            long j14 = this.f99715C;
            long j15 = this.f99716D;
            long j16 = this.f99717E;
            int i14 = this.f99718F;
            return new vyc(1, jArr3, arrayList4, list, j3, z2 ? 1 : 0, i5, z3 ? 1 : 0, i4, j2, i6, i7, i8, i9, i10, j4, z4 ? 1 : 0, arrayList2, arrayList3, j5, j6, j7, j8, j9, j10, i12, i13, i11, j11, i, j, j13, j14, j15, j16, i14 > 0 ? 1 : 0, i14, this.f99719G, this.f99739g, this.f99740h);
        }

        public void onEvents(lzc lzcVar, InterfaceC5415eo.b bVar, boolean z, long j, boolean z2, int i, boolean z3, boolean z4, @hib lyc lycVar, @hib Exception exc, long j2, long j3, @hib kq6 kq6Var, @hib kq6 kq6Var2, @hib z7i z7iVar) {
            if (j != -9223372036854775807L) {
                maybeUpdateMediaTimeHistory(bVar.f33692a, j);
                this.f99722J = true;
            }
            if (lzcVar.getPlaybackState() != 2) {
                this.f99722J = false;
            }
            int playbackState = lzcVar.getPlaybackState();
            if (playbackState == 1 || playbackState == 4 || z2) {
                this.f99724L = false;
            }
            if (lycVar != null) {
                this.f99725M = true;
                this.f99718F++;
                if (this.f99733a) {
                    this.f99739g.add(new vyc.C14302a(bVar, lycVar));
                }
            } else if (lzcVar.getPlayerError() == null) {
                this.f99725M = false;
            }
            if (this.f99723K && !this.f99724L) {
                y7h currentTracks = lzcVar.getCurrentTracks();
                if (!currentTracks.isTypeSelected(2)) {
                    maybeUpdateVideoFormat(bVar, null);
                }
                if (!currentTracks.isTypeSelected(1)) {
                    maybeUpdateAudioFormat(bVar, null);
                }
            }
            if (kq6Var != null) {
                maybeUpdateVideoFormat(bVar, kq6Var);
            }
            if (kq6Var2 != null) {
                maybeUpdateAudioFormat(bVar, kq6Var2);
            }
            kq6 kq6Var3 = this.f99728P;
            if (kq6Var3 != null && kq6Var3.f54990M1 == -1 && z7iVar != null) {
                maybeUpdateVideoFormat(bVar, kq6Var3.buildUpon().setWidth(z7iVar.f104349a).setHeight(z7iVar.f104350b).build());
            }
            if (z4) {
                this.f99726N = true;
            }
            if (z3) {
                this.f99717E++;
            }
            this.f99716D += (long) i;
            this.f99714B += j2;
            this.f99715C += j3;
            if (exc != null) {
                this.f99719G++;
                if (this.f99733a) {
                    this.f99740h.add(new vyc.C14302a(bVar, exc));
                }
            }
            int iResolveNewPlaybackState = resolveNewPlaybackState(lzcVar);
            float f = lzcVar.getPlaybackParameters().f76315a;
            if (this.f99720H != iResolveNewPlaybackState || this.f99732T != f) {
                maybeUpdateMediaTimeHistory(bVar.f33692a, z ? bVar.f33696e : -9223372036854775807L);
                maybeRecordVideoFormatTime(bVar.f33692a);
                maybeRecordAudioFormatTime(bVar.f33692a);
            }
            this.f99732T = f;
            if (this.f99720H != iResolveNewPlaybackState) {
                updatePlaybackState(iResolveNewPlaybackState, bVar);
            }
        }

        public void onFinished(InterfaceC5415eo.b bVar, boolean z, long j) {
            int i = 11;
            if (this.f99720H != 11 && !z) {
                i = 15;
            }
            maybeUpdateMediaTimeHistory(bVar.f33692a, j);
            maybeRecordVideoFormatTime(bVar.f33692a);
            maybeRecordAudioFormatTime(bVar.f33692a);
            updatePlaybackState(i, bVar);
        }

        public void onForeground() {
            this.f99723K = true;
        }

        public void onInterruptedByAd() {
            this.f99724L = true;
            this.f99722J = false;
        }
    }

    public xyc(boolean z, @hib InterfaceC15356a interfaceC15356a) {
        this.f99700n0 = interfaceC15356a;
        this.f99701o0 = z;
        ay3 ay3Var = new ay3();
        this.f99697k0 = ay3Var;
        this.f99698l0 = new HashMap();
        this.f99699m0 = new HashMap();
        this.f99703q0 = vyc.f92698e0;
        this.f99702p0 = new t1h.C12849b();
        this.f99696A0 = z7i.f104340F;
        ay3Var.setListener(this);
    }

    private Pair<InterfaceC5415eo.b, Boolean> findBestEventTime(InterfaceC5415eo.c cVar, String str) {
        vna.C14175b c14175b;
        InterfaceC5415eo.b bVar = null;
        boolean zBelongsToSession = false;
        for (int i = 0; i < cVar.size(); i++) {
            InterfaceC5415eo.b eventTime = cVar.getEventTime(cVar.get(i));
            boolean zBelongsToSession2 = this.f99697k0.belongsToSession(eventTime, str);
            if (bVar == null || ((zBelongsToSession2 && !zBelongsToSession) || (zBelongsToSession2 == zBelongsToSession && eventTime.f33692a > bVar.f33692a))) {
                bVar = eventTime;
                zBelongsToSession = zBelongsToSession2;
            }
        }
        u80.checkNotNull(bVar);
        if (!zBelongsToSession && (c14175b = bVar.f33695d) != null && c14175b.isAd()) {
            long adGroupTimeUs = bVar.f33693b.getPeriodByUid(bVar.f33695d.f71106a, this.f99702p0).getAdGroupTimeUs(bVar.f33695d.f71107b);
            if (adGroupTimeUs == Long.MIN_VALUE) {
                adGroupTimeUs = this.f99702p0.f83399d;
            }
            long positionInWindowUs = adGroupTimeUs + this.f99702p0.getPositionInWindowUs();
            long j = bVar.f33692a;
            t1h t1hVar = bVar.f33693b;
            int i2 = bVar.f33694c;
            vna.C14175b c14175b2 = bVar.f33695d;
            InterfaceC5415eo.b bVar2 = new InterfaceC5415eo.b(j, t1hVar, i2, new vna.C14175b(c14175b2.f71106a, c14175b2.f71109d, c14175b2.f71107b), x0i.usToMs(positionInWindowUs), bVar.f33693b, bVar.f33698g, bVar.f33699h, bVar.f33700i, bVar.f33701j);
            zBelongsToSession = this.f99697k0.belongsToSession(bVar2, str);
            bVar = bVar2;
        }
        return Pair.create(bVar, Boolean.valueOf(zBelongsToSession));
    }

    private boolean hasEvent(InterfaceC5415eo.c cVar, String str, int i) {
        return cVar.contains(i) && this.f99697k0.belongsToSession(cVar.getEventTime(i), str);
    }

    private void maybeAddSessions(InterfaceC5415eo.c cVar) {
        for (int i = 0; i < cVar.size(); i++) {
            int i2 = cVar.get(i);
            InterfaceC5415eo.b eventTime = cVar.getEventTime(i2);
            if (i2 == 0) {
                this.f99697k0.updateSessionsWithTimelineChange(eventTime);
            } else if (i2 == 11) {
                this.f99697k0.updateSessionsWithDiscontinuity(eventTime, this.f99706t0);
            } else {
                this.f99697k0.updateSessions(eventTime);
            }
        }
    }

    public vyc getCombinedPlaybackStats() {
        int i = 1;
        vyc[] vycVarArr = new vyc[this.f99698l0.size() + 1];
        vycVarArr[0] = this.f99703q0;
        Iterator<C15357b> it = this.f99698l0.values().iterator();
        while (it.hasNext()) {
            vycVarArr[i] = it.next().build(false);
            i++;
        }
        return vyc.merge(vycVarArr);
    }

    @hib
    public vyc getPlaybackStats() {
        String activeSessionId = this.f99697k0.getActiveSessionId();
        C15357b c15357b = activeSessionId == null ? null : this.f99698l0.get(activeSessionId);
        if (c15357b == null) {
            return null;
        }
        return c15357b.build(false);
    }

    @Override // p000.tyc.InterfaceC13289a
    public void onAdPlaybackStarted(InterfaceC5415eo.b bVar, String str, String str2) {
        ((C15357b) u80.checkNotNull(this.f99698l0.get(str))).onInterruptedByAd();
    }

    @Override // p000.InterfaceC5415eo
    public void onBandwidthEstimate(InterfaceC5415eo.b bVar, int i, long j, long j2) {
        this.f99709w0 = i;
        this.f99710x0 = j;
    }

    @Override // p000.InterfaceC5415eo
    public void onDownstreamFormatChanged(InterfaceC5415eo.b bVar, ega egaVar) {
        int i = egaVar.f32943b;
        if (i == 2 || i == 0) {
            this.f99711y0 = egaVar.f32944c;
        } else if (i == 1) {
            this.f99712z0 = egaVar.f32944c;
        }
    }

    @Override // p000.InterfaceC5415eo
    public void onDrmSessionManagerError(InterfaceC5415eo.b bVar, Exception exc) {
        this.f99708v0 = exc;
    }

    @Override // p000.InterfaceC5415eo
    public void onDroppedVideoFrames(InterfaceC5415eo.b bVar, int i, long j) {
        this.f99707u0 = i;
    }

    @Override // p000.InterfaceC5415eo
    public void onEvents(lzc lzcVar, InterfaceC5415eo.c cVar) {
        if (cVar.size() == 0) {
            return;
        }
        maybeAddSessions(cVar);
        for (String str : this.f99698l0.keySet()) {
            Pair<InterfaceC5415eo.b, Boolean> pairFindBestEventTime = findBestEventTime(cVar, str);
            C15357b c15357b = this.f99698l0.get(str);
            boolean zHasEvent = hasEvent(cVar, str, 11);
            boolean zHasEvent2 = hasEvent(cVar, str, 1018);
            boolean zHasEvent3 = hasEvent(cVar, str, 1011);
            boolean zHasEvent4 = hasEvent(cVar, str, 1000);
            boolean zHasEvent5 = hasEvent(cVar, str, 10);
            boolean z = hasEvent(cVar, str, 1003) || hasEvent(cVar, str, 1024);
            boolean zHasEvent6 = hasEvent(cVar, str, 1006);
            boolean zHasEvent7 = hasEvent(cVar, str, 1004);
            c15357b.onEvents(lzcVar, (InterfaceC5415eo.b) pairFindBestEventTime.first, ((Boolean) pairFindBestEventTime.second).booleanValue(), str.equals(this.f99704r0) ? this.f99705s0 : -9223372036854775807L, zHasEvent, zHasEvent2 ? this.f99707u0 : 0, zHasEvent3, zHasEvent4, zHasEvent5 ? lzcVar.getPlayerError() : null, z ? this.f99708v0 : null, zHasEvent6 ? this.f99709w0 : 0L, zHasEvent6 ? this.f99710x0 : 0L, zHasEvent7 ? this.f99711y0 : null, zHasEvent7 ? this.f99712z0 : null, hasEvent(cVar, str, 25) ? this.f99696A0 : null);
        }
        this.f99711y0 = null;
        this.f99712z0 = null;
        this.f99704r0 = null;
        if (cVar.contains(1028)) {
            this.f99697k0.finishAllSessions(cVar.getEventTime(1028));
        }
    }

    @Override // p000.InterfaceC5415eo
    public void onLoadError(InterfaceC5415eo.b bVar, jc9 jc9Var, ega egaVar, IOException iOException, boolean z) {
        this.f99708v0 = iOException;
    }

    @Override // p000.InterfaceC5415eo
    public void onPositionDiscontinuity(InterfaceC5415eo.b bVar, lzc.C9053k c9053k, lzc.C9053k c9053k2, int i) {
        if (this.f99704r0 == null) {
            this.f99704r0 = this.f99697k0.getActiveSessionId();
            this.f99705s0 = c9053k.f59462m;
        }
        this.f99706t0 = i;
    }

    @Override // p000.tyc.InterfaceC13289a
    public void onSessionActive(InterfaceC5415eo.b bVar, String str) {
        ((C15357b) u80.checkNotNull(this.f99698l0.get(str))).onForeground();
    }

    @Override // p000.tyc.InterfaceC13289a
    public void onSessionCreated(InterfaceC5415eo.b bVar, String str) {
        this.f99698l0.put(str, new C15357b(this.f99701o0, bVar));
        this.f99699m0.put(str, bVar);
    }

    @Override // p000.tyc.InterfaceC13289a
    public void onSessionFinished(InterfaceC5415eo.b bVar, String str, boolean z) {
        C15357b c15357b = (C15357b) u80.checkNotNull(this.f99698l0.remove(str));
        InterfaceC5415eo.b bVar2 = (InterfaceC5415eo.b) u80.checkNotNull(this.f99699m0.remove(str));
        c15357b.onFinished(bVar, z, str.equals(this.f99704r0) ? this.f99705s0 : -9223372036854775807L);
        vyc vycVarBuild = c15357b.build(true);
        this.f99703q0 = vyc.merge(this.f99703q0, vycVarBuild);
        InterfaceC15356a interfaceC15356a = this.f99700n0;
        if (interfaceC15356a != null) {
            interfaceC15356a.onPlaybackStatsReady(bVar2, vycVarBuild);
        }
    }

    @Override // p000.InterfaceC5415eo
    public void onVideoSizeChanged(InterfaceC5415eo.b bVar, z7i z7iVar) {
        this.f99696A0 = z7iVar;
    }
}
