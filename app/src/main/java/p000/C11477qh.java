package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import p000.kx7;
import p000.pf5;
import p000.vna;

/* JADX INFO: renamed from: qh */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class C11477qh extends ou0 {

    /* JADX INFO: renamed from: A */
    public static final int f74401A = 10000;

    /* JADX INFO: renamed from: B */
    public static final int f74402B = 25000;

    /* JADX INFO: renamed from: C */
    public static final int f74403C = 25000;

    /* JADX INFO: renamed from: D */
    public static final int f74404D = 1279;

    /* JADX INFO: renamed from: E */
    public static final int f74405E = 719;

    /* JADX INFO: renamed from: F */
    public static final float f74406F = 0.7f;

    /* JADX INFO: renamed from: G */
    public static final float f74407G = 0.75f;

    /* JADX INFO: renamed from: H */
    public static final long f74408H = 1000;

    /* JADX INFO: renamed from: z */
    public static final String f74409z = "AdaptiveTrackSelection";

    /* JADX INFO: renamed from: j */
    public final vp0 f74410j;

    /* JADX INFO: renamed from: k */
    public final long f74411k;

    /* JADX INFO: renamed from: l */
    public final long f74412l;

    /* JADX INFO: renamed from: m */
    public final long f74413m;

    /* JADX INFO: renamed from: n */
    public final int f74414n;

    /* JADX INFO: renamed from: o */
    public final int f74415o;

    /* JADX INFO: renamed from: p */
    public final float f74416p;

    /* JADX INFO: renamed from: q */
    public final float f74417q;

    /* JADX INFO: renamed from: r */
    public final kx7<a> f74418r;

    /* JADX INFO: renamed from: s */
    public final h52 f74419s;

    /* JADX INFO: renamed from: t */
    public float f74420t;

    /* JADX INFO: renamed from: u */
    public int f74421u;

    /* JADX INFO: renamed from: v */
    public int f74422v;

    /* JADX INFO: renamed from: w */
    public long f74423w;

    /* JADX INFO: renamed from: x */
    @hib
    public xca f74424x;

    /* JADX INFO: renamed from: y */
    public long f74425y;

    /* JADX INFO: renamed from: qh$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final long f74426a;

        /* JADX INFO: renamed from: b */
        public final long f74427b;

        public a(long j, long j2) {
            this.f74426a = j;
            this.f74427b = j2;
        }

        public boolean equals(@hib Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f74426a == aVar.f74426a && this.f74427b == aVar.f74427b;
        }

        public int hashCode() {
            return (((int) this.f74426a) * 31) + ((int) this.f74427b);
        }
    }

    /* JADX INFO: renamed from: qh$b */
    public static class b implements pf5.InterfaceC10941b {

        /* JADX INFO: renamed from: a */
        public final int f74428a;

        /* JADX INFO: renamed from: b */
        public final int f74429b;

        /* JADX INFO: renamed from: c */
        public final int f74430c;

        /* JADX INFO: renamed from: d */
        public final int f74431d;

        /* JADX INFO: renamed from: e */
        public final int f74432e;

        /* JADX INFO: renamed from: f */
        public final float f74433f;

        /* JADX INFO: renamed from: g */
        public final float f74434g;

        /* JADX INFO: renamed from: h */
        public final h52 f74435h;

        public b() {
            this(10000, 25000, 25000, 0.7f);
        }

        /* JADX INFO: renamed from: a */
        public C11477qh m20361a(g6h g6hVar, int[] iArr, int i, vp0 vp0Var, kx7<a> kx7Var) {
            return new C11477qh(g6hVar, iArr, i, vp0Var, this.f74428a, this.f74429b, this.f74430c, this.f74431d, this.f74432e, this.f74433f, this.f74434g, kx7Var, this.f74435h);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.pf5.InterfaceC10941b
        public final pf5[] createTrackSelections(pf5.C10940a[] c10940aArr, vp0 vp0Var, vna.C14175b c14175b, t1h t1hVar) {
            kx7 adaptationCheckpoints = C11477qh.getAdaptationCheckpoints(c10940aArr);
            pf5[] pf5VarArr = new pf5[c10940aArr.length];
            for (int i = 0; i < c10940aArr.length; i++) {
                pf5.C10940a c10940a = c10940aArr[i];
                if (c10940a != null) {
                    int[] iArr = c10940a.f70595b;
                    if (iArr.length != 0) {
                        pf5VarArr[i] = iArr.length == 1 ? new j26(c10940a.f70594a, iArr[0], c10940a.f70596c) : m20361a(c10940a.f70594a, iArr, c10940a.f70596c, vp0Var, (kx7) adaptationCheckpoints.get(i));
                    }
                }
            }
            return pf5VarArr;
        }

        public b(int i, int i2, int i3, float f) {
            this(i, i2, i3, 1279, 719, f, 0.75f, h52.f42390a);
        }

        public b(int i, int i2, int i3, int i4, int i5, float f) {
            this(i, i2, i3, i4, i5, f, 0.75f, h52.f42390a);
        }

        public b(int i, int i2, int i3, float f, float f2, h52 h52Var) {
            this(i, i2, i3, 1279, 719, f, f2, h52Var);
        }

        public b(int i, int i2, int i3, int i4, int i5, float f, float f2, h52 h52Var) {
            this.f74428a = i;
            this.f74429b = i2;
            this.f74430c = i3;
            this.f74431d = i4;
            this.f74432e = i5;
            this.f74433f = f;
            this.f74434g = f2;
            this.f74435h = h52Var;
        }
    }

    public C11477qh(g6h g6hVar, int[] iArr, vp0 vp0Var) {
        this(g6hVar, iArr, 0, vp0Var, 10000L, 25000L, 25000L, 1279, 719, 0.7f, 0.75f, kx7.m15110of(), h52.f42390a);
    }

    private static void addCheckpoint(List<kx7.C8541a<a>> list, long[] jArr) {
        long j = 0;
        for (long j2 : jArr) {
            j += j2;
        }
        for (int i = 0; i < list.size(); i++) {
            kx7.C8541a<a> c8541a = list.get(i);
            if (c8541a != null) {
                c8541a.add(new a(j, jArr[i]));
            }
        }
    }

    private int determineIdealSelectedIndex(long j, long j2) {
        long allocatedBandwidth = getAllocatedBandwidth(j2);
        int i = 0;
        for (int i2 = 0; i2 < this.f68742d; i2++) {
            if (j == Long.MIN_VALUE || !isTrackExcluded(i2, j)) {
                kq6 format = getFormat(i2);
                if (m20358c(format, format.f54985C, allocatedBandwidth)) {
                    return i2;
                }
                i = i2;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static kx7<kx7<a>> getAdaptationCheckpoints(pf5.C10940a[] c10940aArr) {
        ArrayList arrayList = new ArrayList();
        for (pf5.C10940a c10940a : c10940aArr) {
            if (c10940a == null || c10940a.f70595b.length <= 1) {
                arrayList.add(null);
            } else {
                kx7.C8541a c8541aBuilder = kx7.builder();
                c8541aBuilder.add(new a(0L, 0L));
                arrayList.add(c8541aBuilder);
            }
        }
        long[][] sortedTrackBitrates = getSortedTrackBitrates(c10940aArr);
        int[] iArr = new int[sortedTrackBitrates.length];
        long[] jArr = new long[sortedTrackBitrates.length];
        for (int i = 0; i < sortedTrackBitrates.length; i++) {
            long[] jArr2 = sortedTrackBitrates[i];
            jArr[i] = jArr2.length == 0 ? 0L : jArr2[0];
        }
        addCheckpoint(arrayList, jArr);
        kx7<Integer> switchOrder = getSwitchOrder(sortedTrackBitrates);
        for (int i2 = 0; i2 < switchOrder.size(); i2++) {
            int iIntValue = switchOrder.get(i2).intValue();
            int i3 = iArr[iIntValue] + 1;
            iArr[iIntValue] = i3;
            jArr[iIntValue] = sortedTrackBitrates[iIntValue][i3];
            addCheckpoint(arrayList, jArr);
        }
        for (int i4 = 0; i4 < c10940aArr.length; i4++) {
            if (arrayList.get(i4) != null) {
                jArr[i4] = jArr[i4] * 2;
            }
        }
        addCheckpoint(arrayList, jArr);
        kx7.C8541a c8541aBuilder2 = kx7.builder();
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            kx7.C8541a c8541a = (kx7.C8541a) arrayList.get(i5);
            c8541aBuilder2.add(c8541a == null ? kx7.m15110of() : c8541a.build());
        }
        return c8541aBuilder2.build();
    }

    private long getAllocatedBandwidth(long j) {
        long totalAllocatableBandwidth = getTotalAllocatableBandwidth(j);
        if (this.f74418r.isEmpty()) {
            return totalAllocatableBandwidth;
        }
        int i = 1;
        while (i < this.f74418r.size() - 1 && this.f74418r.get(i).f74426a < totalAllocatableBandwidth) {
            i++;
        }
        a aVar = this.f74418r.get(i - 1);
        a aVar2 = this.f74418r.get(i);
        long j2 = aVar.f74426a;
        float f = (totalAllocatableBandwidth - j2) / (aVar2.f74426a - j2);
        return aVar.f74427b + ((long) (f * (aVar2.f74427b - r2)));
    }

    private long getLastChunkDurationUs(List<? extends xca> list) {
        if (list.isEmpty()) {
            return -9223372036854775807L;
        }
        xca xcaVar = (xca) vg8.getLast(list);
        long j = xcaVar.f38049g;
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j2 = xcaVar.f38050h;
        if (j2 != -9223372036854775807L) {
            return j2 - j;
        }
        return -9223372036854775807L;
    }

    private long getNextChunkDurationUs(ada[] adaVarArr, List<? extends xca> list) {
        int i = this.f74421u;
        if (i < adaVarArr.length && adaVarArr[i].next()) {
            ada adaVar = adaVarArr[this.f74421u];
            return adaVar.getChunkEndTimeUs() - adaVar.getChunkStartTimeUs();
        }
        for (ada adaVar2 : adaVarArr) {
            if (adaVar2.next()) {
                return adaVar2.getChunkEndTimeUs() - adaVar2.getChunkStartTimeUs();
            }
        }
        return getLastChunkDurationUs(list);
    }

    private static long[][] getSortedTrackBitrates(pf5.C10940a[] c10940aArr) {
        long[][] jArr = new long[c10940aArr.length][];
        for (int i = 0; i < c10940aArr.length; i++) {
            pf5.C10940a c10940a = c10940aArr[i];
            if (c10940a == null) {
                jArr[i] = new long[0];
            } else {
                jArr[i] = new long[c10940a.f70595b.length];
                int i2 = 0;
                while (true) {
                    int[] iArr = c10940a.f70595b;
                    if (i2 >= iArr.length) {
                        break;
                    }
                    long j = c10940a.f70594a.getFormat(iArr[i2]).f54985C;
                    long[] jArr2 = jArr[i];
                    if (j == -1) {
                        j = 0;
                    }
                    jArr2[i2] = j;
                    i2++;
                }
                Arrays.sort(jArr[i]);
            }
        }
        return jArr;
    }

    private static kx7<Integer> getSwitchOrder(long[][] jArr) {
        u3b u3bVarBuild = v3b.treeKeys().arrayListValues().build();
        for (int i = 0; i < jArr.length; i++) {
            long[] jArr2 = jArr[i];
            if (jArr2.length > 1) {
                int length = jArr2.length;
                double[] dArr = new double[length];
                int i2 = 0;
                while (true) {
                    long[] jArr3 = jArr[i];
                    double dLog = 0.0d;
                    if (i2 >= jArr3.length) {
                        break;
                    }
                    long j = jArr3[i2];
                    if (j != -1) {
                        dLog = Math.log(j);
                    }
                    dArr[i2] = dLog;
                    i2++;
                }
                int i3 = length - 1;
                double d = dArr[i3] - dArr[0];
                int i4 = 0;
                while (i4 < i3) {
                    double d2 = dArr[i4];
                    i4++;
                    u3bVarBuild.put(Double.valueOf(d == 0.0d ? 1.0d : (((d2 + dArr[i4]) * 0.5d) - dArr[0]) / d), Integer.valueOf(i));
                }
            }
        }
        return kx7.copyOf(u3bVarBuild.values());
    }

    private long getTotalAllocatableBandwidth(long j) {
        long bitrateEstimate = this.f74410j.getBitrateEstimate();
        this.f74425y = bitrateEstimate;
        long j2 = (long) (bitrateEstimate * this.f74416p);
        long timeToFirstByteEstimateUs = this.f74410j.getTimeToFirstByteEstimateUs();
        if (timeToFirstByteEstimateUs == -9223372036854775807L || j == -9223372036854775807L) {
            return (long) (j2 / this.f74420t);
        }
        float f = j;
        return (long) ((j2 * Math.max((f / this.f74420t) - timeToFirstByteEstimateUs, 0.0f)) / f);
    }

    private long minDurationForQualityIncreaseUs(long j, long j2) {
        if (j == -9223372036854775807L) {
            return this.f74411k;
        }
        if (j2 != -9223372036854775807L) {
            j -= j2;
        }
        return Math.min((long) (j * this.f74417q), this.f74411k);
    }

    /* JADX INFO: renamed from: c */
    public boolean m20358c(kq6 kq6Var, int i, long j) {
        return ((long) i) <= j;
    }

    /* JADX INFO: renamed from: d */
    public long m20359d() {
        return this.f74413m;
    }

    @Override // p000.ou0, p000.pf5
    @un1
    public void disable() {
        this.f74424x = null;
    }

    /* JADX INFO: renamed from: e */
    public boolean m20360e(long j, List<? extends xca> list) {
        long j2 = this.f74423w;
        return j2 == -9223372036854775807L || j - j2 >= 1000 || !(list.isEmpty() || ((xca) vg8.getLast(list)).equals(this.f74424x));
    }

    @Override // p000.ou0, p000.pf5
    @un1
    public void enable() {
        this.f74423w = -9223372036854775807L;
        this.f74424x = null;
    }

    @Override // p000.ou0, p000.pf5
    public int evaluateQueueSize(long j, List<? extends xca> list) {
        int i;
        int i2;
        long jElapsedRealtime = this.f74419s.elapsedRealtime();
        if (!m20360e(jElapsedRealtime, list)) {
            return list.size();
        }
        this.f74423w = jElapsedRealtime;
        this.f74424x = list.isEmpty() ? null : (xca) vg8.getLast(list);
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long playoutDurationForMediaDuration = x0i.getPlayoutDurationForMediaDuration(list.get(size - 1).f38049g - j, this.f74420t);
        long jM20359d = m20359d();
        if (playoutDurationForMediaDuration < jM20359d) {
            return size;
        }
        kq6 format = getFormat(determineIdealSelectedIndex(jElapsedRealtime, getLastChunkDurationUs(list)));
        for (int i3 = 0; i3 < size; i3++) {
            xca xcaVar = list.get(i3);
            kq6 kq6Var = xcaVar.f38046d;
            if (x0i.getPlayoutDurationForMediaDuration(xcaVar.f38049g - j, this.f74420t) >= jM20359d && kq6Var.f54985C < format.f54985C && (i = kq6Var.f54990M1) != -1 && i <= this.f74415o && (i2 = kq6Var.f54996Z) != -1 && i2 <= this.f74414n && i < format.f54990M1) {
                return i3;
            }
        }
        return size;
    }

    @Override // p000.pf5
    public long getLatestBitrateEstimate() {
        return this.f74425y;
    }

    @Override // p000.pf5
    public int getSelectedIndex() {
        return this.f74421u;
    }

    @Override // p000.pf5
    @hib
    public Object getSelectionData() {
        return null;
    }

    @Override // p000.pf5
    public int getSelectionReason() {
        return this.f74422v;
    }

    @Override // p000.ou0, p000.pf5
    public void onPlaybackSpeed(float f) {
        this.f74420t = f;
    }

    @Override // p000.pf5
    public void updateSelectedTrack(long j, long j2, long j3, List<? extends xca> list, ada[] adaVarArr) {
        long jElapsedRealtime = this.f74419s.elapsedRealtime();
        long nextChunkDurationUs = getNextChunkDurationUs(adaVarArr, list);
        int i = this.f74422v;
        if (i == 0) {
            this.f74422v = 1;
            this.f74421u = determineIdealSelectedIndex(jElapsedRealtime, nextChunkDurationUs);
            return;
        }
        int i2 = this.f74421u;
        int iIndexOf = list.isEmpty() ? -1 : indexOf(((xca) vg8.getLast(list)).f38046d);
        if (iIndexOf != -1) {
            i = ((xca) vg8.getLast(list)).f38047e;
            i2 = iIndexOf;
        }
        int iDetermineIdealSelectedIndex = determineIdealSelectedIndex(jElapsedRealtime, nextChunkDurationUs);
        if (iDetermineIdealSelectedIndex != i2 && !isTrackExcluded(i2, jElapsedRealtime)) {
            kq6 format = getFormat(i2);
            kq6 format2 = getFormat(iDetermineIdealSelectedIndex);
            long jMinDurationForQualityIncreaseUs = minDurationForQualityIncreaseUs(j3, nextChunkDurationUs);
            int i3 = format2.f54985C;
            int i4 = format.f54985C;
            if ((i3 > i4 && j2 < jMinDurationForQualityIncreaseUs) || (i3 < i4 && j2 >= this.f74412l)) {
                iDetermineIdealSelectedIndex = i2;
            }
        }
        if (iDetermineIdealSelectedIndex != i2) {
            i = 3;
        }
        this.f74422v = i;
        this.f74421u = iDetermineIdealSelectedIndex;
    }

    public C11477qh(g6h g6hVar, int[] iArr, int i, vp0 vp0Var, long j, long j2, long j3, int i2, int i3, float f, float f2, List<a> list, h52 h52Var) {
        vp0 vp0Var2;
        long j4;
        super(g6hVar, iArr, i);
        if (j3 < j) {
            yh9.m25919w("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            vp0Var2 = vp0Var;
            j4 = j;
        } else {
            vp0Var2 = vp0Var;
            j4 = j3;
        }
        this.f74410j = vp0Var2;
        this.f74411k = j * 1000;
        this.f74412l = j2 * 1000;
        this.f74413m = j4 * 1000;
        this.f74414n = i2;
        this.f74415o = i3;
        this.f74416p = f;
        this.f74417q = f2;
        this.f74418r = kx7.copyOf((Collection) list);
        this.f74419s = h52Var;
        this.f74420t = 1.0f;
        this.f74422v = 0;
        this.f74423w = -9223372036854775807L;
        this.f74425y = Long.MIN_VALUE;
    }
}
