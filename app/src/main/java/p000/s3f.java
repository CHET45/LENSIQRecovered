package p000;

import android.os.Handler;
import android.util.Pair;
import androidx.media3.common.C1213a;
import androidx.media3.common.StreamKey;
import androidx.media3.exoplayer.C1233k;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p000.C9343mf;
import p000.joa;
import p000.mja;
import p000.nr4;
import p000.q1h;
import p000.una;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class s3f extends fs0 implements una.InterfaceC13613c, joa, nr4 {

    /* JADX INFO: renamed from: C */
    public final una f80555C;

    /* JADX INFO: renamed from: M */
    @hib
    public final InterfaceC12422a f80559M;

    /* JADX INFO: renamed from: N */
    @xc7("this")
    @hib
    public Handler f80560N;

    /* JADX INFO: renamed from: Q */
    @hib
    public C12426e f80561Q;

    /* JADX INFO: renamed from: F */
    public final j99<Pair<Long, Object>, C12426e> f80556F = r60.create();

    /* JADX INFO: renamed from: X */
    public ox7<Object, C9343mf> f80562X = ox7.m19076of();

    /* JADX INFO: renamed from: H */
    public final joa.C7994a f80557H = m11118e(null);

    /* JADX INFO: renamed from: L */
    public final nr4.C10020a f80558L = m11115b(null);

    /* JADX INFO: renamed from: s3f$a */
    public interface InterfaceC12422a {
        boolean onAdPlaybackStateUpdateRequested(q1h q1hVar);
    }

    /* JADX INFO: renamed from: s3f$b */
    public static final class C12423b implements mja {

        /* JADX INFO: renamed from: C */
        public boolean f80563C;

        /* JADX INFO: renamed from: a */
        public final C12426e f80564a;

        /* JADX INFO: renamed from: b */
        public final una.C13612b f80565b;

        /* JADX INFO: renamed from: c */
        public final joa.C7994a f80566c;

        /* JADX INFO: renamed from: d */
        public final nr4.C10020a f80567d;

        /* JADX INFO: renamed from: e */
        public mja.InterfaceC9368a f80568e;

        /* JADX INFO: renamed from: f */
        public long f80569f;

        /* JADX INFO: renamed from: m */
        public boolean[] f80570m = new boolean[0];

        public C12423b(C12426e c12426e, una.C13612b c13612b, joa.C7994a c7994a, nr4.C10020a c10020a) {
            this.f80564a = c12426e;
            this.f80565b = c13612b;
            this.f80566c = c7994a;
            this.f80567d = c10020a;
        }

        @Override // p000.mja, p000.yye
        public boolean continueLoading(C1233k c1233k) {
            return this.f80564a.continueLoading(this, c1233k);
        }

        @Override // p000.mja
        public void discardBuffer(long j, boolean z) {
            this.f80564a.discardBuffer(this, j, z);
        }

        @Override // p000.mja
        public long getAdjustedSeekPositionUs(long j, jue jueVar) {
            return this.f80564a.getAdjustedSeekPositionUs(this, j, jueVar);
        }

        @Override // p000.mja, p000.yye
        public long getBufferedPositionUs() {
            return this.f80564a.getBufferedPositionUs(this);
        }

        @Override // p000.mja, p000.yye
        public long getNextLoadPositionUs() {
            return this.f80564a.getNextLoadPositionUs(this);
        }

        @Override // p000.mja
        public List<StreamKey> getStreamKeys(List<of5> list) {
            return this.f80564a.getStreamKeys(list);
        }

        @Override // p000.mja
        public n6h getTrackGroups() {
            return this.f80564a.getTrackGroups();
        }

        @Override // p000.mja, p000.yye
        public boolean isLoading() {
            return this.f80564a.isLoading(this);
        }

        @Override // p000.mja
        public void maybeThrowPrepareError() throws IOException {
            this.f80564a.maybeThrowPrepareError();
        }

        public void onPrepared() {
            mja.InterfaceC9368a interfaceC9368a = this.f80568e;
            if (interfaceC9368a != null) {
                interfaceC9368a.onPrepared(this);
            }
            this.f80563C = true;
        }

        @Override // p000.mja
        public void prepare(mja.InterfaceC9368a interfaceC9368a, long j) {
            this.f80568e = interfaceC9368a;
            this.f80564a.prepare(this, j);
        }

        @Override // p000.mja
        public long readDiscontinuity() {
            return this.f80564a.readDiscontinuity(this);
        }

        @Override // p000.mja, p000.yye
        public void reevaluateBuffer(long j) {
            this.f80564a.reevaluateBuffer(this, j);
        }

        @Override // p000.mja
        public long seekToUs(long j) {
            return this.f80564a.seekToUs(this, j);
        }

        @Override // p000.mja
        public long selectTracks(of5[] of5VarArr, boolean[] zArr, mle[] mleVarArr, boolean[] zArr2, long j) {
            if (this.f80570m.length == 0) {
                this.f80570m = new boolean[mleVarArr.length];
            }
            return this.f80564a.selectTracks(this, of5VarArr, zArr, mleVarArr, zArr2, j);
        }
    }

    /* JADX INFO: renamed from: s3f$c */
    public static final class C12424c implements mle {

        /* JADX INFO: renamed from: a */
        public final C12423b f80571a;

        /* JADX INFO: renamed from: b */
        public final int f80572b;

        public C12424c(C12423b c12423b, int i) {
            this.f80571a = c12423b;
            this.f80572b = i;
        }

        @Override // p000.mle
        public boolean isReady() {
            return this.f80571a.f80564a.isReady(this.f80572b);
        }

        @Override // p000.mle
        public void maybeThrowError() throws IOException {
            this.f80571a.f80564a.maybeThrowError(this.f80572b);
        }

        @Override // p000.mle
        public int readData(oq6 oq6Var, rl3 rl3Var, int i) {
            C12423b c12423b = this.f80571a;
            return c12423b.f80564a.readData(c12423b, this.f80572b, oq6Var, rl3Var, i);
        }

        @Override // p000.mle
        public int skipData(long j) {
            C12423b c12423b = this.f80571a;
            return c12423b.f80564a.skipData(c12423b, this.f80572b, j);
        }
    }

    /* JADX INFO: renamed from: s3f$d */
    public static final class C12425d extends yt6 {

        /* JADX INFO: renamed from: f */
        public final ox7<Object, C9343mf> f80573f;

        public C12425d(q1h q1hVar, ox7<Object, C9343mf> ox7Var) {
            super(q1hVar);
            v80.checkState(q1hVar.getWindowCount() == 1);
            q1h.C11270b c11270b = new q1h.C11270b();
            for (int i = 0; i < q1hVar.getPeriodCount(); i++) {
                q1hVar.getPeriod(i, c11270b, true);
                v80.checkState(ox7Var.containsKey(v80.checkNotNull(c11270b.f72945b)));
            }
            this.f80573f = ox7Var;
        }

        @Override // p000.yt6, p000.q1h
        public q1h.C11270b getPeriod(int i, q1h.C11270b c11270b, boolean z) {
            super.getPeriod(i, c11270b, true);
            C9343mf c9343mf = (C9343mf) v80.checkNotNull(this.f80573f.get(c11270b.f72945b));
            long j = c11270b.f72947d;
            long mediaPeriodPositionUsForContent = j == -9223372036854775807L ? c9343mf.f60845d : v3f.getMediaPeriodPositionUsForContent(j, -1, c9343mf);
            q1h.C11270b c11270b2 = new q1h.C11270b();
            long mediaPeriodPositionUsForContent2 = 0;
            for (int i2 = 0; i2 < i + 1; i2++) {
                this.f102944e.getPeriod(i2, c11270b2, true);
                C9343mf c9343mf2 = (C9343mf) v80.checkNotNull(this.f80573f.get(c11270b2.f72945b));
                if (i2 == 0) {
                    mediaPeriodPositionUsForContent2 = -v3f.getMediaPeriodPositionUsForContent(-c11270b2.getPositionInWindowUs(), -1, c9343mf2);
                }
                if (i2 != i) {
                    mediaPeriodPositionUsForContent2 += v3f.getMediaPeriodPositionUsForContent(c11270b2.f72947d, -1, c9343mf2);
                }
            }
            c11270b.set(c11270b.f72944a, c11270b.f72945b, c11270b.f72946c, mediaPeriodPositionUsForContent, mediaPeriodPositionUsForContent2, c9343mf, c11270b.f72949f);
            return c11270b;
        }

        @Override // p000.yt6, p000.q1h
        public q1h.C11272d getWindow(int i, q1h.C11272d c11272d, long j) {
            super.getWindow(i, c11272d, j);
            q1h.C11270b c11270b = new q1h.C11270b();
            C9343mf c9343mf = (C9343mf) v80.checkNotNull(this.f80573f.get(v80.checkNotNull(getPeriod(c11272d.f72984n, c11270b, true).f72945b)));
            long mediaPeriodPositionUsForContent = v3f.getMediaPeriodPositionUsForContent(c11272d.f72986p, -1, c9343mf);
            if (c11272d.f72983m == -9223372036854775807L) {
                long j2 = c9343mf.f60845d;
                if (j2 != -9223372036854775807L) {
                    c11272d.f72983m = j2 - mediaPeriodPositionUsForContent;
                }
            } else {
                q1h.C11270b period = super.getPeriod(c11272d.f72985o, c11270b, true);
                long j3 = period.f72948e;
                C9343mf c9343mf2 = (C9343mf) v80.checkNotNull(this.f80573f.get(period.f72945b));
                q1h.C11270b period2 = getPeriod(c11272d.f72985o, c11270b);
                c11272d.f72983m = period2.f72948e + v3f.getMediaPeriodPositionUsForContent(c11272d.f72983m - j3, -1, c9343mf2);
            }
            c11272d.f72986p = mediaPeriodPositionUsForContent;
            return c11272d;
        }
    }

    /* JADX INFO: renamed from: s3f$e */
    public static final class C12426e implements mja.InterfaceC9368a {

        /* JADX INFO: renamed from: C */
        public boolean f80574C;

        /* JADX INFO: renamed from: a */
        public final mja f80578a;

        /* JADX INFO: renamed from: d */
        public final Object f80581d;

        /* JADX INFO: renamed from: e */
        public C9343mf f80582e;

        /* JADX INFO: renamed from: f */
        @hib
        public C12423b f80583f;

        /* JADX INFO: renamed from: m */
        public boolean f80584m;

        /* JADX INFO: renamed from: b */
        public final List<C12423b> f80579b = new ArrayList();

        /* JADX INFO: renamed from: c */
        public final Map<Long, Pair<kc9, fga>> f80580c = new HashMap();

        /* JADX INFO: renamed from: F */
        public of5[] f80575F = new of5[0];

        /* JADX INFO: renamed from: H */
        public mle[] f80576H = new mle[0];

        /* JADX INFO: renamed from: L */
        public fga[] f80577L = new fga[0];

        public C12426e(mja mjaVar, Object obj, C9343mf c9343mf) {
            this.f80578a = mjaVar;
            this.f80581d = obj;
            this.f80582e = c9343mf;
        }

        private int findMatchingStreamIndex(fga fgaVar) {
            String str;
            if (fgaVar.f36528c == null) {
                return -1;
            }
            int i = 0;
            loop0: while (true) {
                of5[] of5VarArr = this.f80575F;
                if (i >= of5VarArr.length) {
                    return -1;
                }
                of5 of5Var = of5VarArr[i];
                if (of5Var != null) {
                    h6h trackGroup = of5Var.getTrackGroup();
                    boolean z = fgaVar.f36527b == 0 && trackGroup.equals(getTrackGroups().get(0));
                    for (int i2 = 0; i2 < trackGroup.f42518a; i2++) {
                        C1213a format = trackGroup.getFormat(i2);
                        if (format.equals(fgaVar.f36528c) || (z && (str = format.f8277a) != null && str.equals(fgaVar.f36528c.f8277a))) {
                            break loop0;
                        }
                    }
                }
                i++;
            }
            return i;
        }

        private long getMediaPeriodPositionUsWithEndOfSourceHandling(C12423b c12423b, long j) {
            if (j == Long.MIN_VALUE) {
                return Long.MIN_VALUE;
            }
            long mediaPeriodPositionUs = v3f.getMediaPeriodPositionUs(j, c12423b.f80565b, this.f80582e);
            if (mediaPeriodPositionUs >= s3f.getMediaPeriodEndPositionUs(c12423b, this.f80582e)) {
                return Long.MIN_VALUE;
            }
            return mediaPeriodPositionUs;
        }

        private long getStreamPositionUsWithNotYetStartedHandling(C12423b c12423b, long j) {
            long j2 = c12423b.f80569f;
            return j < j2 ? v3f.getStreamPositionUs(j2, c12423b.f80565b, this.f80582e) - (c12423b.f80569f - j) : v3f.getStreamPositionUs(j, c12423b.f80565b, this.f80582e);
        }

        private void maybeNotifyDownstreamFormatChanged(C12423b c12423b, int i) {
            fga fgaVar;
            boolean[] zArr = c12423b.f80570m;
            if (zArr[i] || (fgaVar = this.f80577L[i]) == null) {
                return;
            }
            zArr[i] = true;
            c12423b.f80566c.downstreamFormatChanged(s3f.correctMediaLoadData(c12423b, fgaVar, this.f80582e));
        }

        public void add(C12423b c12423b) {
            this.f80579b.add(c12423b);
        }

        public boolean canReuseMediaPeriod(una.C13612b c13612b, long j) {
            C12423b c12423b = (C12423b) vg8.getLast(this.f80579b);
            return v3f.getStreamPositionUs(j, c13612b, this.f80582e) == v3f.getStreamPositionUs(s3f.getMediaPeriodEndPositionUs(c12423b, this.f80582e), c12423b.f80565b, this.f80582e);
        }

        public boolean continueLoading(C12423b c12423b, C1233k c1233k) {
            C12423b c12423b2 = this.f80583f;
            if (c12423b2 != null && !c12423b.equals(c12423b2)) {
                for (Pair<kc9, fga> pair : this.f80580c.values()) {
                    c12423b2.f80566c.loadCompleted((kc9) pair.first, s3f.correctMediaLoadData(c12423b2, (fga) pair.second, this.f80582e));
                    c12423b.f80566c.loadStarted((kc9) pair.first, s3f.correctMediaLoadData(c12423b, (fga) pair.second, this.f80582e), 0);
                }
            }
            this.f80583f = c12423b;
            return this.f80578a.continueLoading(c1233k.buildUpon().setPlaybackPositionUs(getStreamPositionUsWithNotYetStartedHandling(c12423b, c1233k.f8755a)).build());
        }

        public void discardBuffer(C12423b c12423b, long j, boolean z) {
            this.f80578a.discardBuffer(v3f.getStreamPositionUs(j, c12423b.f80565b, this.f80582e), z);
        }

        public long getAdjustedSeekPositionUs(C12423b c12423b, long j, jue jueVar) {
            return v3f.getMediaPeriodPositionUs(this.f80578a.getAdjustedSeekPositionUs(v3f.getStreamPositionUs(j, c12423b.f80565b, this.f80582e), jueVar), c12423b.f80565b, this.f80582e);
        }

        public long getBufferedPositionUs(C12423b c12423b) {
            return getMediaPeriodPositionUsWithEndOfSourceHandling(c12423b, this.f80578a.getBufferedPositionUs());
        }

        @hib
        public C12423b getMediaPeriodForEvent(@hib fga fgaVar) {
            if (fgaVar == null || fgaVar.f36531f == -9223372036854775807L) {
                return null;
            }
            for (int i = 0; i < this.f80579b.size(); i++) {
                C12423b c12423b = this.f80579b.get(i);
                if (c12423b.f80563C) {
                    long mediaPeriodPositionUs = v3f.getMediaPeriodPositionUs(t0i.msToUs(fgaVar.f36531f), c12423b.f80565b, this.f80582e);
                    long mediaPeriodEndPositionUs = s3f.getMediaPeriodEndPositionUs(c12423b, this.f80582e);
                    if (mediaPeriodPositionUs >= 0 && mediaPeriodPositionUs < mediaPeriodEndPositionUs) {
                        return c12423b;
                    }
                }
            }
            return null;
        }

        public long getNextLoadPositionUs(C12423b c12423b) {
            return getMediaPeriodPositionUsWithEndOfSourceHandling(c12423b, this.f80578a.getNextLoadPositionUs());
        }

        public List<StreamKey> getStreamKeys(List<of5> list) {
            return this.f80578a.getStreamKeys(list);
        }

        public n6h getTrackGroups() {
            return this.f80578a.getTrackGroups();
        }

        public boolean isLoading(C12423b c12423b) {
            return c12423b.equals(this.f80583f) && this.f80578a.isLoading();
        }

        public boolean isReady(int i) {
            return ((mle) t0i.castNonNull(this.f80576H[i])).isReady();
        }

        public boolean isUnused() {
            return this.f80579b.isEmpty();
        }

        public void maybeThrowError(int i) throws IOException {
            ((mle) t0i.castNonNull(this.f80576H[i])).maybeThrowError();
        }

        public void maybeThrowPrepareError() throws IOException {
            this.f80578a.maybeThrowPrepareError();
        }

        public void onDownstreamFormatChanged(C12423b c12423b, fga fgaVar) {
            int iFindMatchingStreamIndex = findMatchingStreamIndex(fgaVar);
            if (iFindMatchingStreamIndex != -1) {
                this.f80577L[iFindMatchingStreamIndex] = fgaVar;
                c12423b.f80570m[iFindMatchingStreamIndex] = true;
            }
        }

        public void onLoadFinished(kc9 kc9Var) {
            this.f80580c.remove(Long.valueOf(kc9Var.f53591a));
        }

        public void onLoadStarted(kc9 kc9Var, fga fgaVar) {
            this.f80580c.put(Long.valueOf(kc9Var.f53591a), Pair.create(kc9Var, fgaVar));
        }

        @Override // p000.mja.InterfaceC9368a
        public void onPrepared(mja mjaVar) {
            this.f80574C = true;
            for (int i = 0; i < this.f80579b.size(); i++) {
                this.f80579b.get(i).onPrepared();
            }
        }

        public void prepare(C12423b c12423b, long j) {
            c12423b.f80569f = j;
            if (this.f80584m) {
                if (this.f80574C) {
                    c12423b.onPrepared();
                }
            } else {
                this.f80584m = true;
                this.f80578a.prepare(this, v3f.getStreamPositionUs(j, c12423b.f80565b, this.f80582e));
            }
        }

        public int readData(C12423b c12423b, int i, oq6 oq6Var, rl3 rl3Var, int i2) {
            long bufferedPositionUs = getBufferedPositionUs(c12423b);
            int data = ((mle) t0i.castNonNull(this.f80576H[i])).readData(oq6Var, rl3Var, i2 | 5);
            long mediaPeriodPositionUsWithEndOfSourceHandling = getMediaPeriodPositionUsWithEndOfSourceHandling(c12423b, rl3Var.f78610f);
            if ((data == -4 && mediaPeriodPositionUsWithEndOfSourceHandling == Long.MIN_VALUE) || (data == -3 && bufferedPositionUs == Long.MIN_VALUE && !rl3Var.f78609e)) {
                maybeNotifyDownstreamFormatChanged(c12423b, i);
                rl3Var.clear();
                rl3Var.addFlag(4);
                return -4;
            }
            if (data == -4) {
                maybeNotifyDownstreamFormatChanged(c12423b, i);
                ((mle) t0i.castNonNull(this.f80576H[i])).readData(oq6Var, rl3Var, i2);
                rl3Var.f78610f = mediaPeriodPositionUsWithEndOfSourceHandling;
            }
            return data;
        }

        public long readDiscontinuity(C12423b c12423b) {
            if (!c12423b.equals(this.f80579b.get(0))) {
                return -9223372036854775807L;
            }
            long discontinuity = this.f80578a.readDiscontinuity();
            if (discontinuity == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            return v3f.getMediaPeriodPositionUs(discontinuity, c12423b.f80565b, this.f80582e);
        }

        public void reevaluateBuffer(C12423b c12423b, long j) {
            this.f80578a.reevaluateBuffer(getStreamPositionUsWithNotYetStartedHandling(c12423b, j));
        }

        public void release(una unaVar) {
            unaVar.releasePeriod(this.f80578a);
        }

        public void remove(C12423b c12423b) {
            if (c12423b.equals(this.f80583f)) {
                this.f80583f = null;
                this.f80580c.clear();
            }
            this.f80579b.remove(c12423b);
        }

        public long seekToUs(C12423b c12423b, long j) {
            return v3f.getMediaPeriodPositionUs(this.f80578a.seekToUs(v3f.getStreamPositionUs(j, c12423b.f80565b, this.f80582e)), c12423b.f80565b, this.f80582e);
        }

        public long selectTracks(C12423b c12423b, of5[] of5VarArr, boolean[] zArr, mle[] mleVarArr, boolean[] zArr2, long j) {
            c12423b.f80569f = j;
            if (!c12423b.equals(this.f80579b.get(0))) {
                for (int i = 0; i < of5VarArr.length; i++) {
                    of5 of5Var = of5VarArr[i];
                    boolean z = true;
                    if (of5Var != null) {
                        if (zArr[i] && mleVarArr[i] != null) {
                            z = false;
                        }
                        zArr2[i] = z;
                        if (z) {
                            mleVarArr[i] = Objects.equals(this.f80575F[i], of5Var) ? new C12424c(c12423b, i) : new r05();
                        }
                    } else {
                        mleVarArr[i] = null;
                        zArr2[i] = true;
                    }
                }
                return j;
            }
            this.f80575F = (of5[]) Arrays.copyOf(of5VarArr, of5VarArr.length);
            long streamPositionUs = v3f.getStreamPositionUs(j, c12423b.f80565b, this.f80582e);
            mle[] mleVarArr2 = this.f80576H;
            mle[] mleVarArr3 = mleVarArr2.length == 0 ? new mle[of5VarArr.length] : (mle[]) Arrays.copyOf(mleVarArr2, mleVarArr2.length);
            long jSelectTracks = this.f80578a.selectTracks(of5VarArr, zArr, mleVarArr3, zArr2, streamPositionUs);
            this.f80576H = (mle[]) Arrays.copyOf(mleVarArr3, mleVarArr3.length);
            this.f80577L = (fga[]) Arrays.copyOf(this.f80577L, mleVarArr3.length);
            for (int i2 = 0; i2 < mleVarArr3.length; i2++) {
                if (mleVarArr3[i2] == null) {
                    mleVarArr[i2] = null;
                    this.f80577L[i2] = null;
                } else if (mleVarArr[i2] == null || zArr2[i2]) {
                    mleVarArr[i2] = new C12424c(c12423b, i2);
                    this.f80577L[i2] = null;
                }
            }
            return v3f.getMediaPeriodPositionUs(jSelectTracks, c12423b.f80565b, this.f80582e);
        }

        public int skipData(C12423b c12423b, int i, long j) {
            return ((mle) t0i.castNonNull(this.f80576H[i])).skipData(v3f.getStreamPositionUs(j, c12423b.f80565b, this.f80582e));
        }

        public void updateAdPlaybackState(C9343mf c9343mf) {
            this.f80582e = c9343mf;
        }

        @Override // p000.yye.InterfaceC15893a
        public void onContinueLoadingRequested(mja mjaVar) {
            C12423b c12423b = this.f80583f;
            if (c12423b == null) {
                return;
            }
            ((mja.InterfaceC9368a) v80.checkNotNull(c12423b.f80568e)).onContinueLoadingRequested(this.f80583f);
        }
    }

    public s3f(una unaVar, @hib InterfaceC12422a interfaceC12422a) {
        this.f80555C = unaVar;
        this.f80559M = interfaceC12422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static fga correctMediaLoadData(C12423b c12423b, fga fgaVar, C9343mf c9343mf) {
        return new fga(fgaVar.f36526a, fgaVar.f36527b, fgaVar.f36528c, fgaVar.f36529d, fgaVar.f36530e, correctMediaLoadDataPositionMs(fgaVar.f36531f, c12423b, c9343mf), correctMediaLoadDataPositionMs(fgaVar.f36532g, c12423b, c9343mf));
    }

    private static long correctMediaLoadDataPositionMs(long j, C12423b c12423b, C9343mf c9343mf) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long jMsToUs = t0i.msToUs(j);
        una.C13612b c13612b = c12423b.f80565b;
        return t0i.usToMs(c13612b.isAd() ? v3f.getMediaPeriodPositionUsForAd(jMsToUs, c13612b.f88604b, c13612b.f88605c, c9343mf) : v3f.getMediaPeriodPositionUsForContent(jMsToUs, -1, c9343mf));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long getMediaPeriodEndPositionUs(C12423b c12423b, C9343mf c9343mf) {
        una.C13612b c13612b = c12423b.f80565b;
        if (c13612b.isAd()) {
            C9343mf.b adGroup = c9343mf.getAdGroup(c13612b.f88604b);
            if (adGroup.f60860b == -1) {
                return 0L;
            }
            return adGroup.f60865g[c13612b.f88605c];
        }
        int i = c13612b.f88607e;
        if (i == -1) {
            return Long.MAX_VALUE;
        }
        long j = c9343mf.getAdGroup(i).f60859a;
        if (j == Long.MIN_VALUE) {
            return Long.MAX_VALUE;
        }
        return j;
    }

    @hib
    private C12423b getMediaPeriodForEvent(@hib una.C13612b c13612b, @hib fga fgaVar, boolean z) {
        if (c13612b == null) {
            return null;
        }
        List<C12426e> list = this.f80556F.get(new Pair<>(Long.valueOf(c13612b.f88606d), c13612b.f88603a));
        if (list.isEmpty()) {
            return null;
        }
        if (z) {
            C12426e c12426e = (C12426e) vg8.getLast(list);
            return c12426e.f80583f != null ? c12426e.f80583f : (C12423b) vg8.getLast(c12426e.f80579b);
        }
        for (int i = 0; i < list.size(); i++) {
            C12423b mediaPeriodForEvent = list.get(i).getMediaPeriodForEvent(fgaVar);
            if (mediaPeriodForEvent != null) {
                return mediaPeriodForEvent;
            }
        }
        return (C12423b) list.get(0).f80579b.get(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setAdPlaybackStates$0(ox7 ox7Var, q1h q1hVar) {
        C9343mf c9343mf;
        for (C12426e c12426e : this.f80556F.values()) {
            C9343mf c9343mf2 = (C9343mf) ox7Var.get(c12426e.f80581d);
            if (c9343mf2 != null) {
                c12426e.updateAdPlaybackState(c9343mf2);
            }
        }
        C12426e c12426e2 = this.f80561Q;
        if (c12426e2 != null && (c9343mf = (C9343mf) ox7Var.get(c12426e2.f80581d)) != null) {
            this.f80561Q.updateAdPlaybackState(c9343mf);
        }
        this.f80562X = ox7Var;
        m11123m(new C12425d(q1hVar, ox7Var));
    }

    private void releaseLastUsedMediaPeriod() {
        C12426e c12426e = this.f80561Q;
        if (c12426e != null) {
            c12426e.release(this.f80555C);
            this.f80561Q = null;
        }
    }

    @Override // p000.una
    public boolean canUpdateMediaItem(nfa nfaVar) {
        return this.f80555C.canUpdateMediaItem(nfaVar);
    }

    @Override // p000.una
    public mja createPeriod(una.C13612b c13612b, InterfaceC5892fn interfaceC5892fn, long j) {
        C12426e c12426e;
        Pair<Long, Object> pair = new Pair<>(Long.valueOf(c13612b.f88606d), c13612b.f88603a);
        C12426e c12426e2 = this.f80561Q;
        boolean z = false;
        if (c12426e2 != null) {
            if (c12426e2.f80581d.equals(c13612b.f88603a)) {
                c12426e = this.f80561Q;
                this.f80556F.put(pair, c12426e);
                z = true;
            } else {
                this.f80561Q.release(this.f80555C);
                c12426e = null;
            }
            this.f80561Q = null;
        } else {
            c12426e = null;
        }
        if (c12426e == null && ((c12426e = (C12426e) vg8.getLast(this.f80556F.get(pair), null)) == null || !c12426e.canReuseMediaPeriod(c13612b, j))) {
            C9343mf c9343mf = (C9343mf) v80.checkNotNull(this.f80562X.get(c13612b.f88603a));
            C12426e c12426e3 = new C12426e(this.f80555C.createPeriod(new una.C13612b(c13612b.f88603a, c13612b.f88606d), interfaceC5892fn, v3f.getStreamPositionUs(j, c13612b, c9343mf)), c13612b.f88603a, c9343mf);
            this.f80556F.put(pair, c12426e3);
            c12426e = c12426e3;
        }
        C12423b c12423b = new C12423b(c12426e, c13612b, m11118e(c13612b), m11115b(c13612b));
        c12426e.add(c12423b);
        if (z && c12426e.f80575F.length > 0) {
            c12423b.seekToUs(j);
        }
        return c12423b;
    }

    @Override // p000.fs0
    /* JADX INFO: renamed from: g */
    public void mo2506g() {
        releaseLastUsedMediaPeriod();
        this.f80555C.disable(this);
    }

    @Override // p000.una
    public nfa getMediaItem() {
        return this.f80555C.getMediaItem();
    }

    @Override // p000.fs0
    /* JADX INFO: renamed from: h */
    public void mo2507h() {
        this.f80555C.enable(this);
    }

    @Override // p000.fs0
    /* JADX INFO: renamed from: l */
    public void mo2508l(@hib qdh qdhVar) {
        Handler handlerCreateHandlerForCurrentLooper = t0i.createHandlerForCurrentLooper();
        synchronized (this) {
            this.f80560N = handlerCreateHandlerForCurrentLooper;
        }
        this.f80555C.addEventListener(handlerCreateHandlerForCurrentLooper, this);
        this.f80555C.addDrmEventListener(handlerCreateHandlerForCurrentLooper, this);
        this.f80555C.prepareSource(this, qdhVar, m11120i());
    }

    @Override // p000.una
    public void maybeThrowSourceInfoRefreshError() throws IOException {
        this.f80555C.maybeThrowSourceInfoRefreshError();
    }

    @Override // p000.joa
    public void onDownstreamFormatChanged(int i, @hib una.C13612b c13612b, fga fgaVar) {
        C12423b mediaPeriodForEvent = getMediaPeriodForEvent(c13612b, fgaVar, false);
        if (mediaPeriodForEvent == null) {
            this.f80557H.downstreamFormatChanged(fgaVar);
        } else {
            mediaPeriodForEvent.f80564a.onDownstreamFormatChanged(mediaPeriodForEvent, fgaVar);
            mediaPeriodForEvent.f80566c.downstreamFormatChanged(correctMediaLoadData(mediaPeriodForEvent, fgaVar, (C9343mf) v80.checkNotNull(this.f80562X.get(mediaPeriodForEvent.f80565b.f88603a))));
        }
    }

    @Override // p000.nr4
    public void onDrmKeysLoaded(int i, @hib una.C13612b c13612b) {
        C12423b mediaPeriodForEvent = getMediaPeriodForEvent(c13612b, null, false);
        if (mediaPeriodForEvent == null) {
            this.f80558L.drmKeysLoaded();
        } else {
            mediaPeriodForEvent.f80567d.drmKeysLoaded();
        }
    }

    @Override // p000.nr4
    public void onDrmKeysRemoved(int i, @hib una.C13612b c13612b) {
        C12423b mediaPeriodForEvent = getMediaPeriodForEvent(c13612b, null, false);
        if (mediaPeriodForEvent == null) {
            this.f80558L.drmKeysRemoved();
        } else {
            mediaPeriodForEvent.f80567d.drmKeysRemoved();
        }
    }

    @Override // p000.nr4
    public void onDrmKeysRestored(int i, @hib una.C13612b c13612b) {
        C12423b mediaPeriodForEvent = getMediaPeriodForEvent(c13612b, null, false);
        if (mediaPeriodForEvent == null) {
            this.f80558L.drmKeysRestored();
        } else {
            mediaPeriodForEvent.f80567d.drmKeysRestored();
        }
    }

    @Override // p000.nr4
    public void onDrmSessionAcquired(int i, @hib una.C13612b c13612b, int i2) {
        C12423b mediaPeriodForEvent = getMediaPeriodForEvent(c13612b, null, true);
        if (mediaPeriodForEvent == null) {
            this.f80558L.drmSessionAcquired(i2);
        } else {
            mediaPeriodForEvent.f80567d.drmSessionAcquired(i2);
        }
    }

    @Override // p000.nr4
    public void onDrmSessionManagerError(int i, @hib una.C13612b c13612b, Exception exc) {
        C12423b mediaPeriodForEvent = getMediaPeriodForEvent(c13612b, null, false);
        if (mediaPeriodForEvent == null) {
            this.f80558L.drmSessionManagerError(exc);
        } else {
            mediaPeriodForEvent.f80567d.drmSessionManagerError(exc);
        }
    }

    @Override // p000.nr4
    public void onDrmSessionReleased(int i, @hib una.C13612b c13612b) {
        C12423b mediaPeriodForEvent = getMediaPeriodForEvent(c13612b, null, false);
        if (mediaPeriodForEvent == null) {
            this.f80558L.drmSessionReleased();
        } else {
            mediaPeriodForEvent.f80567d.drmSessionReleased();
        }
    }

    @Override // p000.joa
    public void onLoadCanceled(int i, @hib una.C13612b c13612b, kc9 kc9Var, fga fgaVar) {
        C12423b mediaPeriodForEvent = getMediaPeriodForEvent(c13612b, fgaVar, true);
        if (mediaPeriodForEvent == null) {
            this.f80557H.loadCanceled(kc9Var, fgaVar);
        } else {
            mediaPeriodForEvent.f80564a.onLoadFinished(kc9Var);
            mediaPeriodForEvent.f80566c.loadCanceled(kc9Var, correctMediaLoadData(mediaPeriodForEvent, fgaVar, (C9343mf) v80.checkNotNull(this.f80562X.get(mediaPeriodForEvent.f80565b.f88603a))));
        }
    }

    @Override // p000.joa
    public void onLoadCompleted(int i, @hib una.C13612b c13612b, kc9 kc9Var, fga fgaVar) {
        C12423b mediaPeriodForEvent = getMediaPeriodForEvent(c13612b, fgaVar, true);
        if (mediaPeriodForEvent == null) {
            this.f80557H.loadCompleted(kc9Var, fgaVar);
        } else {
            mediaPeriodForEvent.f80564a.onLoadFinished(kc9Var);
            mediaPeriodForEvent.f80566c.loadCompleted(kc9Var, correctMediaLoadData(mediaPeriodForEvent, fgaVar, (C9343mf) v80.checkNotNull(this.f80562X.get(mediaPeriodForEvent.f80565b.f88603a))));
        }
    }

    @Override // p000.joa
    public void onLoadError(int i, @hib una.C13612b c13612b, kc9 kc9Var, fga fgaVar, IOException iOException, boolean z) {
        C12423b mediaPeriodForEvent = getMediaPeriodForEvent(c13612b, fgaVar, true);
        if (mediaPeriodForEvent == null) {
            this.f80557H.loadError(kc9Var, fgaVar, iOException, z);
            return;
        }
        if (z) {
            mediaPeriodForEvent.f80564a.onLoadFinished(kc9Var);
        }
        mediaPeriodForEvent.f80566c.loadError(kc9Var, correctMediaLoadData(mediaPeriodForEvent, fgaVar, (C9343mf) v80.checkNotNull(this.f80562X.get(mediaPeriodForEvent.f80565b.f88603a))), iOException, z);
    }

    @Override // p000.joa
    public void onLoadStarted(int i, @hib una.C13612b c13612b, kc9 kc9Var, fga fgaVar, int i2) {
        if (i2 == 0) {
            C12423b mediaPeriodForEvent = getMediaPeriodForEvent(c13612b, fgaVar, true);
            if (mediaPeriodForEvent == null) {
                this.f80557H.loadStarted(kc9Var, fgaVar, 0);
            } else {
                mediaPeriodForEvent.f80564a.onLoadStarted(kc9Var, fgaVar);
                mediaPeriodForEvent.f80566c.loadStarted(kc9Var, correctMediaLoadData(mediaPeriodForEvent, fgaVar, (C9343mf) v80.checkNotNull(this.f80562X.get(mediaPeriodForEvent.f80565b.f88603a))), 0);
            }
        }
    }

    @Override // p000.una.InterfaceC13613c
    public void onSourceInfoRefreshed(una unaVar, q1h q1hVar) {
        InterfaceC12422a interfaceC12422a = this.f80559M;
        if ((interfaceC12422a == null || !interfaceC12422a.onAdPlaybackStateUpdateRequested(q1hVar)) && !this.f80562X.isEmpty()) {
            m11123m(new C12425d(q1hVar, this.f80562X));
        }
    }

    @Override // p000.joa
    public void onUpstreamDiscarded(int i, una.C13612b c13612b, fga fgaVar) {
        C12423b mediaPeriodForEvent = getMediaPeriodForEvent(c13612b, fgaVar, false);
        if (mediaPeriodForEvent == null) {
            this.f80557H.upstreamDiscarded(fgaVar);
        } else {
            mediaPeriodForEvent.f80566c.upstreamDiscarded(correctMediaLoadData(mediaPeriodForEvent, fgaVar, (C9343mf) v80.checkNotNull(this.f80562X.get(mediaPeriodForEvent.f80565b.f88603a))));
        }
    }

    @Override // p000.una
    public void releasePeriod(mja mjaVar) {
        C12423b c12423b = (C12423b) mjaVar;
        c12423b.f80564a.remove(c12423b);
        if (c12423b.f80564a.isUnused()) {
            this.f80556F.remove(new Pair(Long.valueOf(c12423b.f80565b.f88606d), c12423b.f80565b.f88603a), c12423b.f80564a);
            if (this.f80556F.isEmpty()) {
                this.f80561Q = c12423b.f80564a;
            } else {
                c12423b.f80564a.release(this.f80555C);
            }
        }
    }

    @Override // p000.fs0
    public void releaseSourceInternal() {
        releaseLastUsedMediaPeriod();
        synchronized (this) {
            this.f80560N = null;
        }
        this.f80555C.releaseSource(this);
        this.f80555C.removeEventListener(this);
        this.f80555C.removeDrmEventListener(this);
    }

    public void setAdPlaybackStates(final ox7<Object, C9343mf> ox7Var, final q1h q1hVar) {
        v80.checkArgument(!ox7Var.isEmpty());
        Object objCheckNotNull = v80.checkNotNull(ox7Var.values().asList().get(0).f60842a);
        quh<Map.Entry<Object, C9343mf>> it = ox7Var.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Object, C9343mf> next = it.next();
            Object key = next.getKey();
            C9343mf value = next.getValue();
            v80.checkArgument(Objects.equals(objCheckNotNull, value.f60842a));
            C9343mf c9343mf = this.f80562X.get(key);
            if (c9343mf != null) {
                for (int i = value.f60846e; i < value.f60843b; i++) {
                    C9343mf.b adGroup = value.getAdGroup(i);
                    v80.checkArgument(adGroup.f60868j);
                    if (i < c9343mf.f60843b && v3f.getAdCountInGroup(value, i) < v3f.getAdCountInGroup(c9343mf, i)) {
                        C9343mf.b adGroup2 = value.getAdGroup(i + 1);
                        v80.checkArgument(adGroup.f60867i + adGroup2.f60867i == c9343mf.getAdGroup(i).f60867i);
                        v80.checkArgument(adGroup.f60859a + adGroup.f60867i == adGroup2.f60859a);
                    }
                    if (adGroup.f60859a == Long.MIN_VALUE) {
                        v80.checkArgument(v3f.getAdCountInGroup(value, i) == 0);
                    }
                }
            }
        }
        synchronized (this) {
            try {
                Handler handler = this.f80560N;
                if (handler == null) {
                    this.f80562X = ox7Var;
                } else {
                    handler.post(new Runnable() { // from class: r3f
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f76970a.lambda$setAdPlaybackStates$0(ox7Var, q1hVar);
                        }
                    });
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.una
    public void updateMediaItem(nfa nfaVar) {
        this.f80555C.updateMediaItem(nfaVar);
    }
}
