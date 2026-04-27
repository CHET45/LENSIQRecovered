package p000;

import androidx.media3.common.C1213a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import p000.kx7;
import p000.of5;
import p000.una;

/* JADX INFO: renamed from: ph */
/* JADX INFO: loaded from: classes3.dex */
@ovh
public class C10958ph extends pu0 {

    /* JADX INFO: renamed from: A */
    public static final String f70738A = "AdaptiveTrackSelection";

    /* JADX INFO: renamed from: B */
    public static final int f70739B = 10000;

    /* JADX INFO: renamed from: C */
    public static final int f70740C = 25000;

    /* JADX INFO: renamed from: D */
    public static final int f70741D = 25000;

    /* JADX INFO: renamed from: E */
    public static final int f70742E = 1279;

    /* JADX INFO: renamed from: F */
    public static final int f70743F = 719;

    /* JADX INFO: renamed from: G */
    public static final float f70744G = 0.7f;

    /* JADX INFO: renamed from: H */
    public static final float f70745H = 0.75f;

    /* JADX INFO: renamed from: I */
    public static final long f70746I = 1000;

    /* JADX INFO: renamed from: k */
    public final up0 f70747k;

    /* JADX INFO: renamed from: l */
    public final long f70748l;

    /* JADX INFO: renamed from: m */
    public final long f70749m;

    /* JADX INFO: renamed from: n */
    public final long f70750n;

    /* JADX INFO: renamed from: o */
    public final int f70751o;

    /* JADX INFO: renamed from: p */
    public final int f70752p;

    /* JADX INFO: renamed from: q */
    public final float f70753q;

    /* JADX INFO: renamed from: r */
    public final float f70754r;

    /* JADX INFO: renamed from: s */
    public final kx7<a> f70755s;

    /* JADX INFO: renamed from: t */
    public final j52 f70756t;

    /* JADX INFO: renamed from: u */
    public float f70757u;

    /* JADX INFO: renamed from: v */
    public int f70758v;

    /* JADX INFO: renamed from: w */
    public int f70759w;

    /* JADX INFO: renamed from: x */
    public long f70760x;

    /* JADX INFO: renamed from: y */
    @hib
    public yca f70761y;

    /* JADX INFO: renamed from: z */
    public long f70762z;

    /* JADX INFO: renamed from: ph$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final long f70763a;

        /* JADX INFO: renamed from: b */
        public final long f70764b;

        public a(long j, long j2) {
            this.f70763a = j;
            this.f70764b = j2;
        }

        public boolean equals(@hib Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f70763a == aVar.f70763a && this.f70764b == aVar.f70764b;
        }

        public int hashCode() {
            return (((int) this.f70763a) * 31) + ((int) this.f70764b);
        }
    }

    /* JADX INFO: renamed from: ph$b */
    public static class b implements of5.InterfaceC10356b {

        /* JADX INFO: renamed from: a */
        public final int f70765a;

        /* JADX INFO: renamed from: b */
        public final int f70766b;

        /* JADX INFO: renamed from: c */
        public final int f70767c;

        /* JADX INFO: renamed from: d */
        public final int f70768d;

        /* JADX INFO: renamed from: e */
        public final int f70769e;

        /* JADX INFO: renamed from: f */
        public final float f70770f;

        /* JADX INFO: renamed from: g */
        public final float f70771g;

        /* JADX INFO: renamed from: h */
        public final j52 f70772h;

        public b() {
            this(10000, 25000, 25000, 0.7f);
        }

        /* JADX INFO: renamed from: a */
        public C10958ph m19487a(h6h h6hVar, int[] iArr, int i, up0 up0Var, kx7<a> kx7Var) {
            return new C10958ph(h6hVar, iArr, i, up0Var, this.f70765a, this.f70766b, this.f70767c, this.f70768d, this.f70769e, this.f70770f, this.f70771g, kx7Var, this.f70772h);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.of5.InterfaceC10356b
        public final of5[] createTrackSelections(of5.C10355a[] c10355aArr, up0 up0Var, una.C13612b c13612b, q1h q1hVar) {
            kx7 adaptationCheckpoints = C10958ph.getAdaptationCheckpoints(c10355aArr);
            of5[] of5VarArr = new of5[c10355aArr.length];
            for (int i = 0; i < c10355aArr.length; i++) {
                of5.C10355a c10355a = c10355aArr[i];
                if (c10355a != null) {
                    int[] iArr = c10355a.f67490b;
                    if (iArr.length != 0) {
                        of5VarArr[i] = iArr.length == 1 ? new k26(c10355a.f67489a, iArr[0], c10355a.f67491c) : m19487a(c10355a.f67489a, iArr, c10355a.f67491c, up0Var, (kx7) adaptationCheckpoints.get(i));
                    }
                }
            }
            return of5VarArr;
        }

        public b(int i, int i2, int i3, float f) {
            this(i, i2, i3, 1279, 719, f, 0.75f, j52.f49539a);
        }

        public b(int i, int i2, int i3, int i4, int i5, float f) {
            this(i, i2, i3, i4, i5, f, 0.75f, j52.f49539a);
        }

        public b(int i, int i2, int i3, float f, float f2, j52 j52Var) {
            this(i, i2, i3, 1279, 719, f, f2, j52Var);
        }

        public b(int i, int i2, int i3, int i4, int i5, float f, float f2, j52 j52Var) {
            this.f70765a = i;
            this.f70766b = i2;
            this.f70767c = i3;
            this.f70768d = i4;
            this.f70769e = i5;
            this.f70770f = f;
            this.f70771g = f2;
            this.f70772h = j52Var;
        }
    }

    public C10958ph(h6h h6hVar, int[] iArr, up0 up0Var) {
        this(h6hVar, iArr, 0, up0Var, 10000L, 25000L, 25000L, 1279, 719, 0.7f, 0.75f, kx7.m15110of(), j52.f49539a);
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
        for (int i2 = 0; i2 < this.f72063d; i2++) {
            if (j == Long.MIN_VALUE || !isTrackExcluded(i2, j)) {
                C1213a format = getFormat(i2);
                if (m19484d(format, format.f8286j, allocatedBandwidth)) {
                    return i2;
                }
                i = i2;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static kx7<kx7<a>> getAdaptationCheckpoints(of5.C10355a[] c10355aArr) {
        ArrayList arrayList = new ArrayList();
        for (of5.C10355a c10355a : c10355aArr) {
            if (c10355a == null || c10355a.f67490b.length <= 1) {
                arrayList.add(null);
            } else {
                kx7.C8541a c8541aBuilder = kx7.builder();
                c8541aBuilder.add(new a(0L, 0L));
                arrayList.add(c8541aBuilder);
            }
        }
        long[][] sortedTrackBitrates = getSortedTrackBitrates(c10355aArr);
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
        for (int i4 = 0; i4 < c10355aArr.length; i4++) {
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
        if (this.f70755s.isEmpty()) {
            return totalAllocatableBandwidth;
        }
        int i = 1;
        while (i < this.f70755s.size() - 1 && this.f70755s.get(i).f70763a < totalAllocatableBandwidth) {
            i++;
        }
        a aVar = this.f70755s.get(i - 1);
        a aVar2 = this.f70755s.get(i);
        long j2 = aVar.f70763a;
        float f = (totalAllocatableBandwidth - j2) / (aVar2.f70763a - j2);
        return aVar.f70764b + ((long) (f * (aVar2.f70764b - r2)));
    }

    private long getLastChunkDurationUs(List<? extends yca> list) {
        if (list.isEmpty()) {
            return -9223372036854775807L;
        }
        yca ycaVar = (yca) vg8.getLast(list);
        long j = ycaVar.f41848g;
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j2 = ycaVar.f41849h;
        if (j2 != -9223372036854775807L) {
            return j2 - j;
        }
        return -9223372036854775807L;
    }

    private long getNextChunkDurationUs(zca[] zcaVarArr, List<? extends yca> list) {
        int i = this.f70758v;
        if (i < zcaVarArr.length && zcaVarArr[i].next()) {
            zca zcaVar = zcaVarArr[this.f70758v];
            return zcaVar.getChunkEndTimeUs() - zcaVar.getChunkStartTimeUs();
        }
        for (zca zcaVar2 : zcaVarArr) {
            if (zcaVar2.next()) {
                return zcaVar2.getChunkEndTimeUs() - zcaVar2.getChunkStartTimeUs();
            }
        }
        return getLastChunkDurationUs(list);
    }

    private static long[][] getSortedTrackBitrates(of5.C10355a[] c10355aArr) {
        long[][] jArr = new long[c10355aArr.length][];
        for (int i = 0; i < c10355aArr.length; i++) {
            of5.C10355a c10355a = c10355aArr[i];
            if (c10355a == null) {
                jArr[i] = new long[0];
            } else {
                jArr[i] = new long[c10355a.f67490b.length];
                int i2 = 0;
                while (true) {
                    int[] iArr = c10355a.f67490b;
                    if (i2 >= iArr.length) {
                        break;
                    }
                    long j = c10355a.f67489a.getFormat(iArr[i2]).f8286j;
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
        long bitrateEstimate = this.f70747k.getBitrateEstimate();
        this.f70762z = bitrateEstimate;
        long j2 = (long) (bitrateEstimate * this.f70753q);
        long timeToFirstByteEstimateUs = this.f70747k.getTimeToFirstByteEstimateUs();
        if (timeToFirstByteEstimateUs == -9223372036854775807L || j == -9223372036854775807L) {
            return (long) (j2 / this.f70757u);
        }
        float f = j;
        return (long) ((j2 * Math.max((f / this.f70757u) - timeToFirstByteEstimateUs, 0.0f)) / f);
    }

    private long minDurationForQualityIncreaseUs(long j, long j2) {
        if (j == -9223372036854775807L) {
            return this.f70748l;
        }
        if (j2 != -9223372036854775807L) {
            j -= j2;
        }
        return Math.min((long) (j * this.f70754r), this.f70748l);
    }

    /* JADX INFO: renamed from: d */
    public boolean m19484d(C1213a c1213a, int i, long j) {
        return ((long) i) <= j;
    }

    @Override // p000.pu0, p000.of5
    @un1
    public void disable() {
        this.f70761y = null;
    }

    /* JADX INFO: renamed from: e */
    public long m19485e() {
        return this.f70750n;
    }

    @Override // p000.pu0, p000.of5
    @un1
    public void enable() {
        this.f70760x = -9223372036854775807L;
        this.f70761y = null;
    }

    @Override // p000.pu0, p000.of5
    public int evaluateQueueSize(long j, List<? extends yca> list) {
        int i;
        int i2;
        long jElapsedRealtime = this.f70756t.elapsedRealtime();
        if (!m19486f(jElapsedRealtime, list)) {
            return list.size();
        }
        this.f70760x = jElapsedRealtime;
        this.f70761y = list.isEmpty() ? null : (yca) vg8.getLast(list);
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long playoutDurationForMediaDuration = t0i.getPlayoutDurationForMediaDuration(list.get(size - 1).f41848g - j, this.f70757u);
        long jM19485e = m19485e();
        if (playoutDurationForMediaDuration < jM19485e) {
            return size;
        }
        C1213a format = getFormat(determineIdealSelectedIndex(jElapsedRealtime, getLastChunkDurationUs(list)));
        for (int i3 = 0; i3 < size; i3++) {
            yca ycaVar = list.get(i3);
            C1213a c1213a = ycaVar.f41845d;
            if (t0i.getPlayoutDurationForMediaDuration(ycaVar.f41848g - j, this.f70757u) >= jM19485e && c1213a.f8286j < format.f8286j && (i = c1213a.f8299w) != -1 && i <= this.f70752p && (i2 = c1213a.f8298v) != -1 && i2 <= this.f70751o && i < format.f8299w) {
                return i3;
            }
        }
        return size;
    }

    /* JADX INFO: renamed from: f */
    public boolean m19486f(long j, List<? extends yca> list) {
        long j2 = this.f70760x;
        return j2 == -9223372036854775807L || j - j2 >= 1000 || !(list.isEmpty() || ((yca) vg8.getLast(list)).equals(this.f70761y));
    }

    @Override // p000.of5
    public long getLatestBitrateEstimate() {
        return this.f70762z;
    }

    @Override // p000.of5
    public int getSelectedIndex() {
        return this.f70758v;
    }

    @Override // p000.of5
    @hib
    public Object getSelectionData() {
        return null;
    }

    @Override // p000.of5
    public int getSelectionReason() {
        return this.f70759w;
    }

    @Override // p000.pu0, p000.of5
    public void onPlaybackSpeed(float f) {
        this.f70757u = f;
    }

    @Override // p000.of5
    public void updateSelectedTrack(long j, long j2, long j3, List<? extends yca> list, zca[] zcaVarArr) {
        long jElapsedRealtime = this.f70756t.elapsedRealtime();
        long nextChunkDurationUs = getNextChunkDurationUs(zcaVarArr, list);
        int i = this.f70759w;
        if (i == 0) {
            this.f70759w = 1;
            this.f70758v = determineIdealSelectedIndex(jElapsedRealtime, nextChunkDurationUs);
            return;
        }
        int i2 = this.f70758v;
        int iIndexOf = list.isEmpty() ? -1 : indexOf(((yca) vg8.getLast(list)).f41845d);
        if (iIndexOf != -1) {
            i = ((yca) vg8.getLast(list)).f41846e;
            i2 = iIndexOf;
        }
        int iDetermineIdealSelectedIndex = determineIdealSelectedIndex(jElapsedRealtime, nextChunkDurationUs);
        if (iDetermineIdealSelectedIndex != i2 && !isTrackExcluded(i2, jElapsedRealtime)) {
            C1213a format = getFormat(i2);
            C1213a format2 = getFormat(iDetermineIdealSelectedIndex);
            long jMinDurationForQualityIncreaseUs = minDurationForQualityIncreaseUs(j3, nextChunkDurationUs);
            int i3 = format2.f8286j;
            int i4 = format.f8286j;
            if ((i3 > i4 && j2 < jMinDurationForQualityIncreaseUs) || (i3 < i4 && j2 >= this.f70749m)) {
                iDetermineIdealSelectedIndex = i2;
            }
        }
        if (iDetermineIdealSelectedIndex != i2) {
            i = 3;
        }
        this.f70759w = i;
        this.f70758v = iDetermineIdealSelectedIndex;
    }

    public C10958ph(h6h h6hVar, int[] iArr, int i, up0 up0Var, long j, long j2, long j3, int i2, int i3, float f, float f2, List<a> list, j52 j52Var) {
        up0 up0Var2;
        long j4;
        super(h6hVar, iArr, i);
        if (j3 < j) {
            xh9.m25148w("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            up0Var2 = up0Var;
            j4 = j;
        } else {
            up0Var2 = up0Var;
            j4 = j3;
        }
        this.f70747k = up0Var2;
        this.f70748l = j * 1000;
        this.f70749m = j2 * 1000;
        this.f70750n = j4 * 1000;
        this.f70751o = i2;
        this.f70752p = i3;
        this.f70753q = f;
        this.f70754r = f2;
        this.f70755s = kx7.copyOf((Collection) list);
        this.f70756t = j52Var;
        this.f70757u = 1.0f;
        this.f70759w = 0;
        this.f70760x = -9223372036854775807L;
        this.f70762z = -2147483647L;
    }
}
