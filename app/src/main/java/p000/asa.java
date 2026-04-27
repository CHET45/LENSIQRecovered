package p000;

import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p000.aga;
import p000.t1h;
import p000.vna;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class asa extends vm2<Integer> {

    /* JADX INFO: renamed from: b2 */
    public static final int f11750b2 = -1;

    /* JADX INFO: renamed from: c2 */
    public static final aga f11751c2 = new aga.C0235c().setMediaId("MergingMediaSource").build();

    /* JADX INFO: renamed from: L */
    public final boolean f11752L;

    /* JADX INFO: renamed from: M */
    public final boolean f11753M;

    /* JADX INFO: renamed from: M1 */
    public final u3b<Object, d52> f11754M1;

    /* JADX INFO: renamed from: N */
    public final vna[] f11755N;

    /* JADX INFO: renamed from: Q */
    public final t1h[] f11756Q;

    /* JADX INFO: renamed from: V1 */
    public int f11757V1;

    /* JADX INFO: renamed from: X */
    public final ArrayList<vna> f11758X;

    /* JADX INFO: renamed from: Y */
    public final zm2 f11759Y;

    /* JADX INFO: renamed from: Z */
    public final Map<Object, Long> f11760Z;

    /* JADX INFO: renamed from: Z1 */
    public long[][] f11761Z1;

    /* JADX INFO: renamed from: a2 */
    @hib
    public C1589b f11762a2;

    /* JADX INFO: renamed from: asa$a */
    public static final class C1588a extends xt6 {

        /* JADX INFO: renamed from: C */
        public final long[] f11763C;

        /* JADX INFO: renamed from: m */
        public final long[] f11764m;

        public C1588a(t1h t1hVar, Map<Object, Long> map) {
            super(t1hVar);
            int windowCount = t1hVar.getWindowCount();
            this.f11763C = new long[t1hVar.getWindowCount()];
            t1h.C12851d c12851d = new t1h.C12851d();
            for (int i = 0; i < windowCount; i++) {
                this.f11763C[i] = t1hVar.getWindow(i, c12851d).f83430Q;
            }
            int periodCount = t1hVar.getPeriodCount();
            this.f11764m = new long[periodCount];
            t1h.C12849b c12849b = new t1h.C12849b();
            for (int i2 = 0; i2 < periodCount; i2++) {
                t1hVar.getPeriod(i2, c12849b, true);
                long jLongValue = ((Long) u80.checkNotNull(map.get(c12849b.f83397b))).longValue();
                long[] jArr = this.f11764m;
                jLongValue = jLongValue == Long.MIN_VALUE ? c12849b.f83399d : jLongValue;
                jArr[i2] = jLongValue;
                long j = c12849b.f83399d;
                if (j != -9223372036854775807L) {
                    long[] jArr2 = this.f11763C;
                    int i3 = c12849b.f83398c;
                    jArr2[i3] = jArr2[i3] - (j - jLongValue);
                }
            }
        }

        @Override // p000.xt6, p000.t1h
        public t1h.C12849b getPeriod(int i, t1h.C12849b c12849b, boolean z) {
            super.getPeriod(i, c12849b, z);
            c12849b.f83399d = this.f11764m[i];
            return c12849b;
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
        @Override // p000.xt6, p000.t1h
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public p000.t1h.C12851d getWindow(int r5, p000.t1h.C12851d r6, long r7) {
            /*
                r4 = this;
                super.getWindow(r5, r6, r7)
                long[] r7 = r4.f11763C
                r0 = r7[r5]
                r6.f83430Q = r0
                r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                int r5 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
                if (r5 == 0) goto L1e
                long r2 = r6.f83429N
                int r5 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
                if (r5 != 0) goto L19
                goto L1e
            L19:
                long r7 = java.lang.Math.min(r2, r0)
                goto L20
            L1e:
                long r7 = r6.f83429N
            L20:
                r6.f83429N = r7
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.asa.C1588a.getWindow(int, t1h$d, long):t1h$d");
        }
    }

    /* JADX INFO: renamed from: asa$b */
    public static final class C1589b extends IOException {

        /* JADX INFO: renamed from: b */
        public static final int f11765b = 0;

        /* JADX INFO: renamed from: a */
        public final int f11766a;

        /* JADX INFO: renamed from: asa$b$a */
        @Target({ElementType.TYPE_USE})
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface a {
        }

        public C1589b(int i) {
            this.f11766a = i;
        }
    }

    public asa(vna... vnaVarArr) {
        this(false, vnaVarArr);
    }

    private void computePeriodTimeOffsets() {
        t1h.C12849b c12849b = new t1h.C12849b();
        for (int i = 0; i < this.f11757V1; i++) {
            long j = -this.f11756Q[0].getPeriod(i, c12849b).getPositionInWindowUs();
            int i2 = 1;
            while (true) {
                t1h[] t1hVarArr = this.f11756Q;
                if (i2 < t1hVarArr.length) {
                    this.f11761Z1[i][i2] = j - (-t1hVarArr[i2].getPeriod(i, c12849b).getPositionInWindowUs());
                    i2++;
                }
            }
        }
    }

    private void updateClippedDuration() {
        t1h[] t1hVarArr;
        t1h.C12849b c12849b = new t1h.C12849b();
        for (int i = 0; i < this.f11757V1; i++) {
            int i2 = 0;
            long j = Long.MIN_VALUE;
            while (true) {
                t1hVarArr = this.f11756Q;
                if (i2 >= t1hVarArr.length) {
                    break;
                }
                long durationUs = t1hVarArr[i2].getPeriod(i, c12849b).getDurationUs();
                if (durationUs != -9223372036854775807L) {
                    long j2 = durationUs + this.f11761Z1[i][i2];
                    if (j == Long.MIN_VALUE || j2 < j) {
                        j = j2;
                    }
                }
                i2++;
            }
            Object uidOfPeriod = t1hVarArr[0].getUidOfPeriod(i);
            this.f11760Z.put(uidOfPeriod, Long.valueOf(j));
            Iterator<d52> it = this.f11754M1.get(uidOfPeriod).iterator();
            while (it.hasNext()) {
                it.next().updateClipping(0L, j);
            }
        }
    }

    @Override // p000.vna
    public nja createPeriod(vna.C14175b c14175b, InterfaceC6430gn interfaceC6430gn, long j) {
        int length = this.f11755N.length;
        nja[] njaVarArr = new nja[length];
        int indexOfPeriod = this.f11756Q[0].getIndexOfPeriod(c14175b.f71106a);
        for (int i = 0; i < length; i++) {
            njaVarArr[i] = this.f11755N[i].createPeriod(c14175b.copyWithPeriodUid(this.f11756Q[i].getUidOfPeriod(indexOfPeriod)), interfaceC6430gn, j - this.f11761Z1[indexOfPeriod][i]);
        }
        yra yraVar = new yra(this.f11759Y, this.f11761Z1[indexOfPeriod], njaVarArr);
        if (!this.f11753M) {
            return yraVar;
        }
        d52 d52Var = new d52(yraVar, true, 0L, ((Long) u80.checkNotNull(this.f11760Z.get(c14175b.f71106a))).longValue());
        this.f11754M1.put(c14175b.f71106a, d52Var);
        return d52Var;
    }

    @Override // p000.vna
    public aga getMediaItem() {
        vna[] vnaVarArr = this.f11755N;
        return vnaVarArr.length > 0 ? vnaVarArr[0].getMediaItem() : f11751c2;
    }

    @Override // p000.vm2, p000.es0
    /* JADX INFO: renamed from: k */
    public void mo2648k(@hib pdh pdhVar) {
        super.mo2648k(pdhVar);
        for (int i = 0; i < this.f11755N.length; i++) {
            m24067t(Integer.valueOf(i), this.f11755N[i]);
        }
    }

    @Override // p000.vm2, p000.vna
    public void maybeThrowSourceInfoRefreshError() throws IOException {
        C1589b c1589b = this.f11762a2;
        if (c1589b != null) {
            throw c1589b;
        }
        super.maybeThrowSourceInfoRefreshError();
    }

    @Override // p000.vna
    public void releasePeriod(nja njaVar) {
        if (this.f11753M) {
            d52 d52Var = (d52) njaVar;
            Iterator<Map.Entry<Object, d52>> it = this.f11754M1.entries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<Object, d52> next = it.next();
                if (next.getValue().equals(d52Var)) {
                    this.f11754M1.remove(next.getKey(), next.getValue());
                    break;
                }
            }
            njaVar = d52Var.f28448a;
        }
        yra yraVar = (yra) njaVar;
        int i = 0;
        while (true) {
            vna[] vnaVarArr = this.f11755N;
            if (i >= vnaVarArr.length) {
                return;
            }
            vnaVarArr[i].releasePeriod(yraVar.getChildPeriod(i));
            i++;
        }
    }

    @Override // p000.vm2, p000.es0
    public void releaseSourceInternal() {
        super.releaseSourceInternal();
        Arrays.fill(this.f11756Q, (Object) null);
        this.f11757V1 = -1;
        this.f11762a2 = null;
        this.f11758X.clear();
        Collections.addAll(this.f11758X, this.f11755N);
    }

    @Override // p000.vm2
    @hib
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public vna.C14175b mo2649p(Integer num, vna.C14175b c14175b) {
        if (num.intValue() == 0) {
            return c14175b;
        }
        return null;
    }

    @Override // p000.vm2
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public void lambda$prepareChildSource$0(Integer num, vna vnaVar, t1h t1hVar) {
        if (this.f11762a2 != null) {
            return;
        }
        if (this.f11757V1 == -1) {
            this.f11757V1 = t1hVar.getPeriodCount();
        } else if (t1hVar.getPeriodCount() != this.f11757V1) {
            this.f11762a2 = new C1589b(0);
            return;
        }
        if (this.f11761Z1.length == 0) {
            this.f11761Z1 = (long[][]) Array.newInstance((Class<?>) Long.TYPE, this.f11757V1, this.f11756Q.length);
        }
        this.f11758X.remove(vnaVar);
        this.f11756Q[num.intValue()] = t1hVar;
        if (this.f11758X.isEmpty()) {
            if (this.f11752L) {
                computePeriodTimeOffsets();
            }
            t1h c1588a = this.f11756Q[0];
            if (this.f11753M) {
                updateClippedDuration();
                c1588a = new C1588a(c1588a, this.f11760Z);
            }
            m10220l(c1588a);
        }
    }

    public asa(boolean z, vna... vnaVarArr) {
        this(z, false, vnaVarArr);
    }

    public asa(boolean z, boolean z2, vna... vnaVarArr) {
        this(z, z2, new ft3(), vnaVarArr);
    }

    public asa(boolean z, boolean z2, zm2 zm2Var, vna... vnaVarArr) {
        this.f11752L = z;
        this.f11753M = z2;
        this.f11755N = vnaVarArr;
        this.f11759Y = zm2Var;
        this.f11758X = new ArrayList<>(Arrays.asList(vnaVarArr));
        this.f11757V1 = -1;
        this.f11756Q = new t1h[vnaVarArr.length];
        this.f11761Z1 = new long[0][];
        this.f11760Z = new HashMap();
        this.f11754M1 = v3b.hashKeys().arrayListValues().build();
    }
}
