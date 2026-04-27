package p000;

import android.os.Handler;
import android.util.Pair;
import com.google.android.exoplayer2.drm.InterfaceC3005e;
import com.google.android.exoplayer2.offline.StreamKey;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p000.C10354of;
import p000.koa;
import p000.nja;
import p000.t1h;
import p000.vna;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class t3f extends es0 implements vna.InterfaceC14176c, koa, InterfaceC3005e {

    /* JADX INFO: renamed from: C */
    public final vna f83635C;

    /* JADX INFO: renamed from: M */
    @hib
    public final InterfaceC12901a f83639M;

    /* JADX INFO: renamed from: N */
    @xc7("this")
    @hib
    public Handler f83640N;

    /* JADX INFO: renamed from: Q */
    @hib
    public C12905e f83641Q;

    /* JADX INFO: renamed from: F */
    public final j99<Pair<Long, Object>, C12905e> f83636F = r60.create();

    /* JADX INFO: renamed from: X */
    public ox7<Object, C10354of> f83642X = ox7.m19076of();

    /* JADX INFO: renamed from: H */
    public final koa.C8476a f83637H = m10216e(null);

    /* JADX INFO: renamed from: L */
    public final InterfaceC3005e.a f83638L = m10213b(null);

    /* JADX INFO: renamed from: t3f$a */
    public interface InterfaceC12901a {
        boolean onAdPlaybackStateUpdateRequested(t1h t1hVar);
    }

    /* JADX INFO: renamed from: t3f$b */
    public static final class C12902b implements nja {

        /* JADX INFO: renamed from: C */
        public boolean f83643C;

        /* JADX INFO: renamed from: a */
        public final C12905e f83644a;

        /* JADX INFO: renamed from: b */
        public final vna.C14175b f83645b;

        /* JADX INFO: renamed from: c */
        public final koa.C8476a f83646c;

        /* JADX INFO: renamed from: d */
        public final InterfaceC3005e.a f83647d;

        /* JADX INFO: renamed from: e */
        public nja.InterfaceC9906a f83648e;

        /* JADX INFO: renamed from: f */
        public long f83649f;

        /* JADX INFO: renamed from: m */
        public boolean[] f83650m = new boolean[0];

        public C12902b(C12905e c12905e, vna.C14175b c14175b, koa.C8476a c8476a, InterfaceC3005e.a aVar) {
            this.f83644a = c12905e;
            this.f83645b = c14175b;
            this.f83646c = c8476a;
            this.f83647d = aVar;
        }

        @Override // p000.nja, p000.zye
        public boolean continueLoading(long j) {
            return this.f83644a.continueLoading(this, j);
        }

        @Override // p000.nja
        public void discardBuffer(long j, boolean z) {
            this.f83644a.discardBuffer(this, j, z);
        }

        @Override // p000.nja
        public long getAdjustedSeekPositionUs(long j, iue iueVar) {
            return this.f83644a.getAdjustedSeekPositionUs(this, j, iueVar);
        }

        @Override // p000.nja, p000.zye
        public long getBufferedPositionUs() {
            return this.f83644a.getBufferedPositionUs(this);
        }

        @Override // p000.nja, p000.zye
        public long getNextLoadPositionUs() {
            return this.f83644a.getNextLoadPositionUs(this);
        }

        @Override // p000.nja
        public List<StreamKey> getStreamKeys(List<pf5> list) {
            return this.f83644a.getStreamKeys(list);
        }

        @Override // p000.nja
        public m6h getTrackGroups() {
            return this.f83644a.getTrackGroups();
        }

        @Override // p000.nja, p000.zye
        public boolean isLoading() {
            return this.f83644a.isLoading(this);
        }

        @Override // p000.nja
        public void maybeThrowPrepareError() throws IOException {
            this.f83644a.maybeThrowPrepareError();
        }

        public void onPrepared() {
            nja.InterfaceC9906a interfaceC9906a = this.f83648e;
            if (interfaceC9906a != null) {
                interfaceC9906a.onPrepared(this);
            }
            this.f83643C = true;
        }

        @Override // p000.nja
        public void prepare(nja.InterfaceC9906a interfaceC9906a, long j) {
            this.f83648e = interfaceC9906a;
            this.f83644a.prepare(this, j);
        }

        @Override // p000.nja
        public long readDiscontinuity() {
            return this.f83644a.readDiscontinuity(this);
        }

        @Override // p000.nja, p000.zye
        public void reevaluateBuffer(long j) {
            this.f83644a.reevaluateBuffer(this, j);
        }

        @Override // p000.nja
        public long seekToUs(long j) {
            return this.f83644a.seekToUs(this, j);
        }

        @Override // p000.nja
        public long selectTracks(pf5[] pf5VarArr, boolean[] zArr, nle[] nleVarArr, boolean[] zArr2, long j) {
            if (this.f83650m.length == 0) {
                this.f83650m = new boolean[nleVarArr.length];
            }
            return this.f83644a.selectTracks(this, pf5VarArr, zArr, nleVarArr, zArr2, j);
        }
    }

    /* JADX INFO: renamed from: t3f$c */
    public static final class C12903c implements nle {

        /* JADX INFO: renamed from: a */
        public final C12902b f83651a;

        /* JADX INFO: renamed from: b */
        public final int f83652b;

        public C12903c(C12902b c12902b, int i) {
            this.f83651a = c12902b;
            this.f83652b = i;
        }

        @Override // p000.nle
        public boolean isReady() {
            return this.f83651a.f83644a.isReady(this.f83652b);
        }

        @Override // p000.nle
        public void maybeThrowError() throws IOException {
            this.f83651a.f83644a.maybeThrowError(this.f83652b);
        }

        @Override // p000.nle
        public int readData(nq6 nq6Var, sl3 sl3Var, int i) {
            C12902b c12902b = this.f83651a;
            return c12902b.f83644a.readData(c12902b, this.f83652b, nq6Var, sl3Var, i);
        }

        @Override // p000.nle
        public int skipData(long j) {
            C12902b c12902b = this.f83651a;
            return c12902b.f83644a.skipData(c12902b, this.f83652b, j);
        }
    }

    /* JADX INFO: renamed from: t3f$d */
    public static final class C12904d extends xt6 {

        /* JADX INFO: renamed from: m */
        public final ox7<Object, C10354of> f83653m;

        public C12904d(t1h t1hVar, ox7<Object, C10354of> ox7Var) {
            super(t1hVar);
            u80.checkState(t1hVar.getWindowCount() == 1);
            t1h.C12849b c12849b = new t1h.C12849b();
            for (int i = 0; i < t1hVar.getPeriodCount(); i++) {
                t1hVar.getPeriod(i, c12849b, true);
                u80.checkState(ox7Var.containsKey(u80.checkNotNull(c12849b.f83397b)));
            }
            this.f83653m = ox7Var;
        }

        @Override // p000.xt6, p000.t1h
        public t1h.C12849b getPeriod(int i, t1h.C12849b c12849b, boolean z) {
            super.getPeriod(i, c12849b, true);
            C10354of c10354of = (C10354of) u80.checkNotNull(this.f83653m.get(c12849b.f83397b));
            long j = c12849b.f83399d;
            long mediaPeriodPositionUsForContent = j == -9223372036854775807L ? c10354of.f67461d : u3f.getMediaPeriodPositionUsForContent(j, -1, c10354of);
            t1h.C12849b c12849b2 = new t1h.C12849b();
            long mediaPeriodPositionUsForContent2 = 0;
            for (int i2 = 0; i2 < i + 1; i2++) {
                this.f99225f.getPeriod(i2, c12849b2, true);
                C10354of c10354of2 = (C10354of) u80.checkNotNull(this.f83653m.get(c12849b2.f83397b));
                if (i2 == 0) {
                    mediaPeriodPositionUsForContent2 = -u3f.getMediaPeriodPositionUsForContent(-c12849b2.getPositionInWindowUs(), -1, c10354of2);
                }
                if (i2 != i) {
                    mediaPeriodPositionUsForContent2 += u3f.getMediaPeriodPositionUsForContent(c12849b2.f83399d, -1, c10354of2);
                }
            }
            c12849b.set(c12849b.f83396a, c12849b.f83397b, c12849b.f83398c, mediaPeriodPositionUsForContent, mediaPeriodPositionUsForContent2, c10354of, c12849b.f83401f);
            return c12849b;
        }

        @Override // p000.xt6, p000.t1h
        public t1h.C12851d getWindow(int i, t1h.C12851d c12851d, long j) {
            super.getWindow(i, c12851d, j);
            t1h.C12849b c12849b = new t1h.C12849b();
            C10354of c10354of = (C10354of) u80.checkNotNull(this.f83653m.get(u80.checkNotNull(getPeriod(c12851d.f83431X, c12849b, true).f83397b)));
            long mediaPeriodPositionUsForContent = u3f.getMediaPeriodPositionUsForContent(c12851d.f83433Z, -1, c10354of);
            if (c12851d.f83430Q == -9223372036854775807L) {
                long j2 = c10354of.f67461d;
                if (j2 != -9223372036854775807L) {
                    c12851d.f83430Q = j2 - mediaPeriodPositionUsForContent;
                }
            } else {
                t1h.C12849b period = super.getPeriod(c12851d.f83432Y, c12849b, true);
                long j3 = period.f83400e;
                C10354of c10354of2 = (C10354of) u80.checkNotNull(this.f83653m.get(period.f83397b));
                t1h.C12849b period2 = getPeriod(c12851d.f83432Y, c12849b);
                c12851d.f83430Q = period2.f83400e + u3f.getMediaPeriodPositionUsForContent(c12851d.f83430Q - j3, -1, c10354of2);
            }
            c12851d.f83433Z = mediaPeriodPositionUsForContent;
            return c12851d;
        }
    }

    /* JADX INFO: renamed from: t3f$e */
    public static final class C12905e implements nja.InterfaceC9906a {

        /* JADX INFO: renamed from: C */
        public boolean f83654C;

        /* JADX INFO: renamed from: a */
        public final nja f83658a;

        /* JADX INFO: renamed from: d */
        public final Object f83661d;

        /* JADX INFO: renamed from: e */
        public C10354of f83662e;

        /* JADX INFO: renamed from: f */
        @hib
        public C12902b f83663f;

        /* JADX INFO: renamed from: m */
        public boolean f83664m;

        /* JADX INFO: renamed from: b */
        public final List<C12902b> f83659b = new ArrayList();

        /* JADX INFO: renamed from: c */
        public final Map<Long, Pair<jc9, ega>> f83660c = new HashMap();

        /* JADX INFO: renamed from: F */
        public pf5[] f83655F = new pf5[0];

        /* JADX INFO: renamed from: H */
        public nle[] f83656H = new nle[0];

        /* JADX INFO: renamed from: L */
        public ega[] f83657L = new ega[0];

        public C12905e(nja njaVar, Object obj, C10354of c10354of) {
            this.f83658a = njaVar;
            this.f83661d = obj;
            this.f83662e = c10354of;
        }

        private int findMatchingStreamIndex(ega egaVar) {
            String str;
            if (egaVar.f32944c == null) {
                return -1;
            }
            int i = 0;
            loop0: while (true) {
                pf5[] pf5VarArr = this.f83655F;
                if (i >= pf5VarArr.length) {
                    return -1;
                }
                pf5 pf5Var = pf5VarArr[i];
                if (pf5Var != null) {
                    g6h trackGroup = pf5Var.getTrackGroup();
                    boolean z = egaVar.f32943b == 0 && trackGroup.equals(getTrackGroups().get(0));
                    for (int i2 = 0; i2 < trackGroup.f38907a; i2++) {
                        kq6 format = trackGroup.getFormat(i2);
                        if (format.equals(egaVar.f32944c) || (z && (str = format.f54998a) != null && str.equals(egaVar.f32944c.f54998a))) {
                            break loop0;
                        }
                    }
                }
                i++;
            }
            return i;
        }

        private long getMediaPeriodPositionUsWithEndOfSourceHandling(C12902b c12902b, long j) {
            if (j == Long.MIN_VALUE) {
                return Long.MIN_VALUE;
            }
            long mediaPeriodPositionUs = u3f.getMediaPeriodPositionUs(j, c12902b.f83645b, this.f83662e);
            if (mediaPeriodPositionUs >= t3f.getMediaPeriodEndPositionUs(c12902b, this.f83662e)) {
                return Long.MIN_VALUE;
            }
            return mediaPeriodPositionUs;
        }

        private long getStreamPositionUsWithNotYetStartedHandling(C12902b c12902b, long j) {
            long j2 = c12902b.f83649f;
            return j < j2 ? u3f.getStreamPositionUs(j2, c12902b.f83645b, this.f83662e) - (c12902b.f83649f - j) : u3f.getStreamPositionUs(j, c12902b.f83645b, this.f83662e);
        }

        private void maybeNotifyDownstreamFormatChanged(C12902b c12902b, int i) {
            ega egaVar;
            boolean[] zArr = c12902b.f83650m;
            if (zArr[i] || (egaVar = this.f83657L[i]) == null) {
                return;
            }
            zArr[i] = true;
            c12902b.f83646c.downstreamFormatChanged(t3f.correctMediaLoadData(c12902b, egaVar, this.f83662e));
        }

        public void add(C12902b c12902b) {
            this.f83659b.add(c12902b);
        }

        public boolean canReuseMediaPeriod(vna.C14175b c14175b, long j) {
            C12902b c12902b = (C12902b) vg8.getLast(this.f83659b);
            return u3f.getStreamPositionUs(j, c14175b, this.f83662e) == u3f.getStreamPositionUs(t3f.getMediaPeriodEndPositionUs(c12902b, this.f83662e), c12902b.f83645b, this.f83662e);
        }

        public boolean continueLoading(C12902b c12902b, long j) {
            C12902b c12902b2 = this.f83663f;
            if (c12902b2 != null && !c12902b.equals(c12902b2)) {
                for (Pair<jc9, ega> pair : this.f83660c.values()) {
                    c12902b2.f83646c.loadCompleted((jc9) pair.first, t3f.correctMediaLoadData(c12902b2, (ega) pair.second, this.f83662e));
                    c12902b.f83646c.loadStarted((jc9) pair.first, t3f.correctMediaLoadData(c12902b, (ega) pair.second, this.f83662e));
                }
            }
            this.f83663f = c12902b;
            return this.f83658a.continueLoading(getStreamPositionUsWithNotYetStartedHandling(c12902b, j));
        }

        public void discardBuffer(C12902b c12902b, long j, boolean z) {
            this.f83658a.discardBuffer(u3f.getStreamPositionUs(j, c12902b.f83645b, this.f83662e), z);
        }

        public long getAdjustedSeekPositionUs(C12902b c12902b, long j, iue iueVar) {
            return u3f.getMediaPeriodPositionUs(this.f83658a.getAdjustedSeekPositionUs(u3f.getStreamPositionUs(j, c12902b.f83645b, this.f83662e), iueVar), c12902b.f83645b, this.f83662e);
        }

        public long getBufferedPositionUs(C12902b c12902b) {
            return getMediaPeriodPositionUsWithEndOfSourceHandling(c12902b, this.f83658a.getBufferedPositionUs());
        }

        @hib
        public C12902b getMediaPeriodForEvent(@hib ega egaVar) {
            if (egaVar == null || egaVar.f32947f == -9223372036854775807L) {
                return null;
            }
            for (int i = 0; i < this.f83659b.size(); i++) {
                C12902b c12902b = this.f83659b.get(i);
                if (c12902b.f83643C) {
                    long mediaPeriodPositionUs = u3f.getMediaPeriodPositionUs(x0i.msToUs(egaVar.f32947f), c12902b.f83645b, this.f83662e);
                    long mediaPeriodEndPositionUs = t3f.getMediaPeriodEndPositionUs(c12902b, this.f83662e);
                    if (mediaPeriodPositionUs >= 0 && mediaPeriodPositionUs < mediaPeriodEndPositionUs) {
                        return c12902b;
                    }
                }
            }
            return null;
        }

        public long getNextLoadPositionUs(C12902b c12902b) {
            return getMediaPeriodPositionUsWithEndOfSourceHandling(c12902b, this.f83658a.getNextLoadPositionUs());
        }

        public List<StreamKey> getStreamKeys(List<pf5> list) {
            return this.f83658a.getStreamKeys(list);
        }

        public m6h getTrackGroups() {
            return this.f83658a.getTrackGroups();
        }

        public boolean isLoading(C12902b c12902b) {
            return c12902b.equals(this.f83663f) && this.f83658a.isLoading();
        }

        public boolean isReady(int i) {
            return ((nle) x0i.castNonNull(this.f83656H[i])).isReady();
        }

        public boolean isUnused() {
            return this.f83659b.isEmpty();
        }

        public void maybeThrowError(int i) throws IOException {
            ((nle) x0i.castNonNull(this.f83656H[i])).maybeThrowError();
        }

        public void maybeThrowPrepareError() throws IOException {
            this.f83658a.maybeThrowPrepareError();
        }

        public void onDownstreamFormatChanged(C12902b c12902b, ega egaVar) {
            int iFindMatchingStreamIndex = findMatchingStreamIndex(egaVar);
            if (iFindMatchingStreamIndex != -1) {
                this.f83657L[iFindMatchingStreamIndex] = egaVar;
                c12902b.f83650m[iFindMatchingStreamIndex] = true;
            }
        }

        public void onLoadFinished(jc9 jc9Var) {
            this.f83660c.remove(Long.valueOf(jc9Var.f50294a));
        }

        public void onLoadStarted(jc9 jc9Var, ega egaVar) {
            this.f83660c.put(Long.valueOf(jc9Var.f50294a), Pair.create(jc9Var, egaVar));
        }

        @Override // p000.nja.InterfaceC9906a
        public void onPrepared(nja njaVar) {
            this.f83654C = true;
            for (int i = 0; i < this.f83659b.size(); i++) {
                this.f83659b.get(i).onPrepared();
            }
        }

        public void prepare(C12902b c12902b, long j) {
            c12902b.f83649f = j;
            if (this.f83664m) {
                if (this.f83654C) {
                    c12902b.onPrepared();
                }
            } else {
                this.f83664m = true;
                this.f83658a.prepare(this, u3f.getStreamPositionUs(j, c12902b.f83645b, this.f83662e));
            }
        }

        public int readData(C12902b c12902b, int i, nq6 nq6Var, sl3 sl3Var, int i2) {
            long bufferedPositionUs = getBufferedPositionUs(c12902b);
            int data = ((nle) x0i.castNonNull(this.f83656H[i])).readData(nq6Var, sl3Var, i2 | 5);
            long mediaPeriodPositionUsWithEndOfSourceHandling = getMediaPeriodPositionUsWithEndOfSourceHandling(c12902b, sl3Var.f82164f);
            if ((data == -4 && mediaPeriodPositionUsWithEndOfSourceHandling == Long.MIN_VALUE) || (data == -3 && bufferedPositionUs == Long.MIN_VALUE && !sl3Var.f82163e)) {
                maybeNotifyDownstreamFormatChanged(c12902b, i);
                sl3Var.clear();
                sl3Var.addFlag(4);
                return -4;
            }
            if (data == -4) {
                maybeNotifyDownstreamFormatChanged(c12902b, i);
                ((nle) x0i.castNonNull(this.f83656H[i])).readData(nq6Var, sl3Var, i2);
                sl3Var.f82164f = mediaPeriodPositionUsWithEndOfSourceHandling;
            }
            return data;
        }

        public long readDiscontinuity(C12902b c12902b) {
            if (!c12902b.equals(this.f83659b.get(0))) {
                return -9223372036854775807L;
            }
            long discontinuity = this.f83658a.readDiscontinuity();
            if (discontinuity == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            return u3f.getMediaPeriodPositionUs(discontinuity, c12902b.f83645b, this.f83662e);
        }

        public void reevaluateBuffer(C12902b c12902b, long j) {
            this.f83658a.reevaluateBuffer(getStreamPositionUsWithNotYetStartedHandling(c12902b, j));
        }

        public void release(vna vnaVar) {
            vnaVar.releasePeriod(this.f83658a);
        }

        public void remove(C12902b c12902b) {
            if (c12902b.equals(this.f83663f)) {
                this.f83663f = null;
                this.f83660c.clear();
            }
            this.f83659b.remove(c12902b);
        }

        public long seekToUs(C12902b c12902b, long j) {
            return u3f.getMediaPeriodPositionUs(this.f83658a.seekToUs(u3f.getStreamPositionUs(j, c12902b.f83645b, this.f83662e)), c12902b.f83645b, this.f83662e);
        }

        public long selectTracks(C12902b c12902b, pf5[] pf5VarArr, boolean[] zArr, nle[] nleVarArr, boolean[] zArr2, long j) {
            c12902b.f83649f = j;
            if (!c12902b.equals(this.f83659b.get(0))) {
                for (int i = 0; i < pf5VarArr.length; i++) {
                    pf5 pf5Var = pf5VarArr[i];
                    boolean z = true;
                    if (pf5Var != null) {
                        if (zArr[i] && nleVarArr[i] != null) {
                            z = false;
                        }
                        zArr2[i] = z;
                        if (z) {
                            nleVarArr[i] = x0i.areEqual(this.f83655F[i], pf5Var) ? new C12903c(c12902b, i) : new q05();
                        }
                    } else {
                        nleVarArr[i] = null;
                        zArr2[i] = true;
                    }
                }
                return j;
            }
            this.f83655F = (pf5[]) Arrays.copyOf(pf5VarArr, pf5VarArr.length);
            long streamPositionUs = u3f.getStreamPositionUs(j, c12902b.f83645b, this.f83662e);
            nle[] nleVarArr2 = this.f83656H;
            nle[] nleVarArr3 = nleVarArr2.length == 0 ? new nle[pf5VarArr.length] : (nle[]) Arrays.copyOf(nleVarArr2, nleVarArr2.length);
            long jSelectTracks = this.f83658a.selectTracks(pf5VarArr, zArr, nleVarArr3, zArr2, streamPositionUs);
            this.f83656H = (nle[]) Arrays.copyOf(nleVarArr3, nleVarArr3.length);
            this.f83657L = (ega[]) Arrays.copyOf(this.f83657L, nleVarArr3.length);
            for (int i2 = 0; i2 < nleVarArr3.length; i2++) {
                if (nleVarArr3[i2] == null) {
                    nleVarArr[i2] = null;
                    this.f83657L[i2] = null;
                } else if (nleVarArr[i2] == null || zArr2[i2]) {
                    nleVarArr[i2] = new C12903c(c12902b, i2);
                    this.f83657L[i2] = null;
                }
            }
            return u3f.getMediaPeriodPositionUs(jSelectTracks, c12902b.f83645b, this.f83662e);
        }

        public int skipData(C12902b c12902b, int i, long j) {
            return ((nle) x0i.castNonNull(this.f83656H[i])).skipData(u3f.getStreamPositionUs(j, c12902b.f83645b, this.f83662e));
        }

        public void updateAdPlaybackState(C10354of c10354of) {
            this.f83662e = c10354of;
        }

        @Override // p000.zye.InterfaceC16321a
        public void onContinueLoadingRequested(nja njaVar) {
            C12902b c12902b = this.f83663f;
            if (c12902b == null) {
                return;
            }
            ((nja.InterfaceC9906a) u80.checkNotNull(c12902b.f83648e)).onContinueLoadingRequested(this.f83663f);
        }
    }

    public t3f(vna vnaVar, @hib InterfaceC12901a interfaceC12901a) {
        this.f83635C = vnaVar;
        this.f83639M = interfaceC12901a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ega correctMediaLoadData(C12902b c12902b, ega egaVar, C10354of c10354of) {
        return new ega(egaVar.f32942a, egaVar.f32943b, egaVar.f32944c, egaVar.f32945d, egaVar.f32946e, correctMediaLoadDataPositionMs(egaVar.f32947f, c12902b, c10354of), correctMediaLoadDataPositionMs(egaVar.f32948g, c12902b, c10354of));
    }

    private static long correctMediaLoadDataPositionMs(long j, C12902b c12902b, C10354of c10354of) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long jMsToUs = x0i.msToUs(j);
        vna.C14175b c14175b = c12902b.f83645b;
        return x0i.usToMs(c14175b.isAd() ? u3f.getMediaPeriodPositionUsForAd(jMsToUs, c14175b.f71107b, c14175b.f71108c, c10354of) : u3f.getMediaPeriodPositionUsForContent(jMsToUs, -1, c10354of));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long getMediaPeriodEndPositionUs(C12902b c12902b, C10354of c10354of) {
        vna.C14175b c14175b = c12902b.f83645b;
        if (c14175b.isAd()) {
            C10354of.b adGroup = c10354of.getAdGroup(c14175b.f71107b);
            if (adGroup.f67475b == -1) {
                return 0L;
            }
            return adGroup.f67479f[c14175b.f71108c];
        }
        int i = c14175b.f71110e;
        if (i == -1) {
            return Long.MAX_VALUE;
        }
        long j = c10354of.getAdGroup(i).f67474a;
        if (j == Long.MIN_VALUE) {
            return Long.MAX_VALUE;
        }
        return j;
    }

    @hib
    private C12902b getMediaPeriodForEvent(@hib vna.C14175b c14175b, @hib ega egaVar, boolean z) {
        if (c14175b == null) {
            return null;
        }
        List<C12905e> list = this.f83636F.get(new Pair<>(Long.valueOf(c14175b.f71109d), c14175b.f71106a));
        if (list.isEmpty()) {
            return null;
        }
        if (z) {
            C12905e c12905e = (C12905e) vg8.getLast(list);
            return c12905e.f83663f != null ? c12905e.f83663f : (C12902b) vg8.getLast(c12905e.f83659b);
        }
        for (int i = 0; i < list.size(); i++) {
            C12902b mediaPeriodForEvent = list.get(i).getMediaPeriodForEvent(egaVar);
            if (mediaPeriodForEvent != null) {
                return mediaPeriodForEvent;
            }
        }
        return (C12902b) list.get(0).f83659b.get(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setAdPlaybackStates$0(ox7 ox7Var, t1h t1hVar) {
        C10354of c10354of;
        for (C12905e c12905e : this.f83636F.values()) {
            C10354of c10354of2 = (C10354of) ox7Var.get(c12905e.f83661d);
            if (c10354of2 != null) {
                c12905e.updateAdPlaybackState(c10354of2);
            }
        }
        C12905e c12905e2 = this.f83641Q;
        if (c12905e2 != null && (c10354of = (C10354of) ox7Var.get(c12905e2.f83661d)) != null) {
            this.f83641Q.updateAdPlaybackState(c10354of);
        }
        this.f83642X = ox7Var;
        m10220l(new C12904d(t1hVar, ox7Var));
    }

    private void releaseLastUsedMediaPeriod() {
        C12905e c12905e = this.f83641Q;
        if (c12905e != null) {
            c12905e.release(this.f83635C);
            this.f83641Q = null;
        }
    }

    @Override // p000.vna
    public nja createPeriod(vna.C14175b c14175b, InterfaceC6430gn interfaceC6430gn, long j) {
        C12905e c12905e;
        Pair<Long, Object> pair = new Pair<>(Long.valueOf(c14175b.f71109d), c14175b.f71106a);
        C12905e c12905e2 = this.f83641Q;
        boolean z = false;
        if (c12905e2 != null) {
            if (c12905e2.f83661d.equals(c14175b.f71106a)) {
                c12905e = this.f83641Q;
                this.f83636F.put(pair, c12905e);
                z = true;
            } else {
                this.f83641Q.release(this.f83635C);
                c12905e = null;
            }
            this.f83641Q = null;
        } else {
            c12905e = null;
        }
        if (c12905e == null && ((c12905e = (C12905e) vg8.getLast(this.f83636F.get(pair), null)) == null || !c12905e.canReuseMediaPeriod(c14175b, j))) {
            C10354of c10354of = (C10354of) u80.checkNotNull(this.f83642X.get(c14175b.f71106a));
            C12905e c12905e3 = new C12905e(this.f83635C.createPeriod(new vna.C14175b(c14175b.f71106a, c14175b.f71109d), interfaceC6430gn, u3f.getStreamPositionUs(j, c14175b, c10354of)), c14175b.f71106a, c10354of);
            this.f83636F.put(pair, c12905e3);
            c12905e = c12905e3;
        }
        C12902b c12902b = new C12902b(c12905e, c14175b, m10216e(c14175b), m10213b(c14175b));
        c12905e.add(c12902b);
        if (z && c12905e.f83655F.length > 0) {
            c12902b.seekToUs(j);
        }
        return c12902b;
    }

    @Override // p000.es0
    /* JADX INFO: renamed from: g */
    public void mo3296g() {
        releaseLastUsedMediaPeriod();
        this.f83635C.disable(this);
    }

    @Override // p000.vna
    public aga getMediaItem() {
        return this.f83635C.getMediaItem();
    }

    @Override // p000.es0
    /* JADX INFO: renamed from: h */
    public void mo3297h() {
        this.f83635C.enable(this);
    }

    @Override // p000.es0
    /* JADX INFO: renamed from: k */
    public void mo2648k(@hib pdh pdhVar) {
        Handler handlerCreateHandlerForCurrentLooper = x0i.createHandlerForCurrentLooper();
        synchronized (this) {
            this.f83640N = handlerCreateHandlerForCurrentLooper;
        }
        this.f83635C.addEventListener(handlerCreateHandlerForCurrentLooper, this);
        this.f83635C.addDrmEventListener(handlerCreateHandlerForCurrentLooper, this);
        this.f83635C.prepareSource(this, pdhVar, m10218i());
    }

    @Override // p000.vna
    public void maybeThrowSourceInfoRefreshError() throws IOException {
        this.f83635C.maybeThrowSourceInfoRefreshError();
    }

    @Override // p000.koa
    public void onDownstreamFormatChanged(int i, @hib vna.C14175b c14175b, ega egaVar) {
        C12902b mediaPeriodForEvent = getMediaPeriodForEvent(c14175b, egaVar, false);
        if (mediaPeriodForEvent == null) {
            this.f83637H.downstreamFormatChanged(egaVar);
        } else {
            mediaPeriodForEvent.f83644a.onDownstreamFormatChanged(mediaPeriodForEvent, egaVar);
            mediaPeriodForEvent.f83646c.downstreamFormatChanged(correctMediaLoadData(mediaPeriodForEvent, egaVar, (C10354of) u80.checkNotNull(this.f83642X.get(mediaPeriodForEvent.f83645b.f71106a))));
        }
    }

    @Override // com.google.android.exoplayer2.drm.InterfaceC3005e
    public void onDrmKeysLoaded(int i, @hib vna.C14175b c14175b) {
        C12902b mediaPeriodForEvent = getMediaPeriodForEvent(c14175b, null, false);
        if (mediaPeriodForEvent == null) {
            this.f83638L.drmKeysLoaded();
        } else {
            mediaPeriodForEvent.f83647d.drmKeysLoaded();
        }
    }

    @Override // com.google.android.exoplayer2.drm.InterfaceC3005e
    public void onDrmKeysRemoved(int i, @hib vna.C14175b c14175b) {
        C12902b mediaPeriodForEvent = getMediaPeriodForEvent(c14175b, null, false);
        if (mediaPeriodForEvent == null) {
            this.f83638L.drmKeysRemoved();
        } else {
            mediaPeriodForEvent.f83647d.drmKeysRemoved();
        }
    }

    @Override // com.google.android.exoplayer2.drm.InterfaceC3005e
    public void onDrmKeysRestored(int i, @hib vna.C14175b c14175b) {
        C12902b mediaPeriodForEvent = getMediaPeriodForEvent(c14175b, null, false);
        if (mediaPeriodForEvent == null) {
            this.f83638L.drmKeysRestored();
        } else {
            mediaPeriodForEvent.f83647d.drmKeysRestored();
        }
    }

    @Override // com.google.android.exoplayer2.drm.InterfaceC3005e
    public void onDrmSessionAcquired(int i, @hib vna.C14175b c14175b, int i2) {
        C12902b mediaPeriodForEvent = getMediaPeriodForEvent(c14175b, null, true);
        if (mediaPeriodForEvent == null) {
            this.f83638L.drmSessionAcquired(i2);
        } else {
            mediaPeriodForEvent.f83647d.drmSessionAcquired(i2);
        }
    }

    @Override // com.google.android.exoplayer2.drm.InterfaceC3005e
    public void onDrmSessionManagerError(int i, @hib vna.C14175b c14175b, Exception exc) {
        C12902b mediaPeriodForEvent = getMediaPeriodForEvent(c14175b, null, false);
        if (mediaPeriodForEvent == null) {
            this.f83638L.drmSessionManagerError(exc);
        } else {
            mediaPeriodForEvent.f83647d.drmSessionManagerError(exc);
        }
    }

    @Override // com.google.android.exoplayer2.drm.InterfaceC3005e
    public void onDrmSessionReleased(int i, @hib vna.C14175b c14175b) {
        C12902b mediaPeriodForEvent = getMediaPeriodForEvent(c14175b, null, false);
        if (mediaPeriodForEvent == null) {
            this.f83638L.drmSessionReleased();
        } else {
            mediaPeriodForEvent.f83647d.drmSessionReleased();
        }
    }

    @Override // p000.koa
    public void onLoadCanceled(int i, @hib vna.C14175b c14175b, jc9 jc9Var, ega egaVar) {
        C12902b mediaPeriodForEvent = getMediaPeriodForEvent(c14175b, egaVar, true);
        if (mediaPeriodForEvent == null) {
            this.f83637H.loadCanceled(jc9Var, egaVar);
        } else {
            mediaPeriodForEvent.f83644a.onLoadFinished(jc9Var);
            mediaPeriodForEvent.f83646c.loadCanceled(jc9Var, correctMediaLoadData(mediaPeriodForEvent, egaVar, (C10354of) u80.checkNotNull(this.f83642X.get(mediaPeriodForEvent.f83645b.f71106a))));
        }
    }

    @Override // p000.koa
    public void onLoadCompleted(int i, @hib vna.C14175b c14175b, jc9 jc9Var, ega egaVar) {
        C12902b mediaPeriodForEvent = getMediaPeriodForEvent(c14175b, egaVar, true);
        if (mediaPeriodForEvent == null) {
            this.f83637H.loadCompleted(jc9Var, egaVar);
        } else {
            mediaPeriodForEvent.f83644a.onLoadFinished(jc9Var);
            mediaPeriodForEvent.f83646c.loadCompleted(jc9Var, correctMediaLoadData(mediaPeriodForEvent, egaVar, (C10354of) u80.checkNotNull(this.f83642X.get(mediaPeriodForEvent.f83645b.f71106a))));
        }
    }

    @Override // p000.koa
    public void onLoadError(int i, @hib vna.C14175b c14175b, jc9 jc9Var, ega egaVar, IOException iOException, boolean z) {
        C12902b mediaPeriodForEvent = getMediaPeriodForEvent(c14175b, egaVar, true);
        if (mediaPeriodForEvent == null) {
            this.f83637H.loadError(jc9Var, egaVar, iOException, z);
            return;
        }
        if (z) {
            mediaPeriodForEvent.f83644a.onLoadFinished(jc9Var);
        }
        mediaPeriodForEvent.f83646c.loadError(jc9Var, correctMediaLoadData(mediaPeriodForEvent, egaVar, (C10354of) u80.checkNotNull(this.f83642X.get(mediaPeriodForEvent.f83645b.f71106a))), iOException, z);
    }

    @Override // p000.koa
    public void onLoadStarted(int i, @hib vna.C14175b c14175b, jc9 jc9Var, ega egaVar) {
        C12902b mediaPeriodForEvent = getMediaPeriodForEvent(c14175b, egaVar, true);
        if (mediaPeriodForEvent == null) {
            this.f83637H.loadStarted(jc9Var, egaVar);
        } else {
            mediaPeriodForEvent.f83644a.onLoadStarted(jc9Var, egaVar);
            mediaPeriodForEvent.f83646c.loadStarted(jc9Var, correctMediaLoadData(mediaPeriodForEvent, egaVar, (C10354of) u80.checkNotNull(this.f83642X.get(mediaPeriodForEvent.f83645b.f71106a))));
        }
    }

    @Override // p000.vna.InterfaceC14176c
    public void onSourceInfoRefreshed(vna vnaVar, t1h t1hVar) {
        InterfaceC12901a interfaceC12901a = this.f83639M;
        if ((interfaceC12901a == null || !interfaceC12901a.onAdPlaybackStateUpdateRequested(t1hVar)) && !this.f83642X.isEmpty()) {
            m10220l(new C12904d(t1hVar, this.f83642X));
        }
    }

    @Override // p000.koa
    public void onUpstreamDiscarded(int i, vna.C14175b c14175b, ega egaVar) {
        C12902b mediaPeriodForEvent = getMediaPeriodForEvent(c14175b, egaVar, false);
        if (mediaPeriodForEvent == null) {
            this.f83637H.upstreamDiscarded(egaVar);
        } else {
            mediaPeriodForEvent.f83646c.upstreamDiscarded(correctMediaLoadData(mediaPeriodForEvent, egaVar, (C10354of) u80.checkNotNull(this.f83642X.get(mediaPeriodForEvent.f83645b.f71106a))));
        }
    }

    @Override // p000.vna
    public void releasePeriod(nja njaVar) {
        C12902b c12902b = (C12902b) njaVar;
        c12902b.f83644a.remove(c12902b);
        if (c12902b.f83644a.isUnused()) {
            this.f83636F.remove(new Pair(Long.valueOf(c12902b.f83645b.f71109d), c12902b.f83645b.f71106a), c12902b.f83644a);
            if (this.f83636F.isEmpty()) {
                this.f83641Q = c12902b.f83644a;
            } else {
                c12902b.f83644a.release(this.f83635C);
            }
        }
    }

    @Override // p000.es0
    public void releaseSourceInternal() {
        releaseLastUsedMediaPeriod();
        synchronized (this) {
            this.f83640N = null;
        }
        this.f83635C.releaseSource(this);
        this.f83635C.removeEventListener(this);
        this.f83635C.removeDrmEventListener(this);
    }

    public void setAdPlaybackStates(final ox7<Object, C10354of> ox7Var, final t1h t1hVar) {
        u80.checkArgument(!ox7Var.isEmpty());
        Object objCheckNotNull = u80.checkNotNull(ox7Var.values().asList().get(0).f67458a);
        quh<Map.Entry<Object, C10354of>> it = ox7Var.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Object, C10354of> next = it.next();
            Object key = next.getKey();
            C10354of value = next.getValue();
            u80.checkArgument(x0i.areEqual(objCheckNotNull, value.f67458a));
            C10354of c10354of = this.f83642X.get(key);
            if (c10354of != null) {
                for (int i = value.f67462e; i < value.f67459b; i++) {
                    C10354of.b adGroup = value.getAdGroup(i);
                    u80.checkArgument(adGroup.f67473C);
                    if (i < c10354of.f67459b && u3f.getAdCountInGroup(value, i) < u3f.getAdCountInGroup(c10354of, i)) {
                        C10354of.b adGroup2 = value.getAdGroup(i + 1);
                        u80.checkArgument(adGroup.f67480m + adGroup2.f67480m == c10354of.getAdGroup(i).f67480m);
                        u80.checkArgument(adGroup.f67474a + adGroup.f67480m == adGroup2.f67474a);
                    }
                    if (adGroup.f67474a == Long.MIN_VALUE) {
                        u80.checkArgument(u3f.getAdCountInGroup(value, i) == 0);
                    }
                }
            }
        }
        synchronized (this) {
            try {
                Handler handler = this.f83640N;
                if (handler == null) {
                    this.f83642X = ox7Var;
                } else {
                    handler.post(new Runnable() { // from class: q3f
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f73137a.lambda$setAdPlaybackStates$0(ox7Var, t1hVar);
                        }
                    });
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
