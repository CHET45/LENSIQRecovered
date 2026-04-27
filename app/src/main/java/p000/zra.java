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
import java.util.List;
import java.util.Map;
import p000.nfa;
import p000.q1h;
import p000.una;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class zra extends um2<Integer> {

    /* JADX INFO: renamed from: c2 */
    public static final int f105831c2 = -1;

    /* JADX INFO: renamed from: d2 */
    public static final nfa f105832d2 = new nfa.C9851c().setMediaId("MergingMediaSource").build();

    /* JADX INFO: renamed from: L */
    public final boolean f105833L;

    /* JADX INFO: renamed from: M */
    public final boolean f105834M;

    /* JADX INFO: renamed from: M1 */
    public final Map<Object, Long> f105835M1;

    /* JADX INFO: renamed from: N */
    public final una[] f105836N;

    /* JADX INFO: renamed from: Q */
    public final List<List<C16232d>> f105837Q;

    /* JADX INFO: renamed from: V1 */
    public final u3b<Object, c52> f105838V1;

    /* JADX INFO: renamed from: X */
    public final q1h[] f105839X;

    /* JADX INFO: renamed from: Y */
    public final ArrayList<una> f105840Y;

    /* JADX INFO: renamed from: Z */
    public final an2 f105841Z;

    /* JADX INFO: renamed from: Z1 */
    public int f105842Z1;

    /* JADX INFO: renamed from: a2 */
    public long[][] f105843a2;

    /* JADX INFO: renamed from: b2 */
    @hib
    public C16231c f105844b2;

    /* JADX INFO: renamed from: zra$b */
    public static final class C16230b extends yt6 {

        /* JADX INFO: renamed from: f */
        public final long[] f105845f;

        /* JADX INFO: renamed from: g */
        public final long[] f105846g;

        public C16230b(q1h q1hVar, Map<Object, Long> map) {
            super(q1hVar);
            int windowCount = q1hVar.getWindowCount();
            this.f105846g = new long[q1hVar.getWindowCount()];
            q1h.C11272d c11272d = new q1h.C11272d();
            for (int i = 0; i < windowCount; i++) {
                this.f105846g[i] = q1hVar.getWindow(i, c11272d).f72983m;
            }
            int periodCount = q1hVar.getPeriodCount();
            this.f105845f = new long[periodCount];
            q1h.C11270b c11270b = new q1h.C11270b();
            for (int i2 = 0; i2 < periodCount; i2++) {
                q1hVar.getPeriod(i2, c11270b, true);
                long jLongValue = ((Long) v80.checkNotNull(map.get(c11270b.f72945b))).longValue();
                long[] jArr = this.f105845f;
                jLongValue = jLongValue == Long.MIN_VALUE ? c11270b.f72947d : jLongValue;
                jArr[i2] = jLongValue;
                long j = c11270b.f72947d;
                if (j != -9223372036854775807L) {
                    long[] jArr2 = this.f105846g;
                    int i3 = c11270b.f72946c;
                    jArr2[i3] = jArr2[i3] - (j - jLongValue);
                }
            }
        }

        @Override // p000.yt6, p000.q1h
        public q1h.C11270b getPeriod(int i, q1h.C11270b c11270b, boolean z) {
            super.getPeriod(i, c11270b, z);
            c11270b.f72947d = this.f105845f[i];
            return c11270b;
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
        @Override // p000.yt6, p000.q1h
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public p000.q1h.C11272d getWindow(int r5, p000.q1h.C11272d r6, long r7) {
            /*
                r4 = this;
                super.getWindow(r5, r6, r7)
                long[] r7 = r4.f105846g
                r0 = r7[r5]
                r6.f72983m = r0
                r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                int r5 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
                if (r5 == 0) goto L1e
                long r2 = r6.f72982l
                int r5 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
                if (r5 != 0) goto L19
                goto L1e
            L19:
                long r7 = java.lang.Math.min(r2, r0)
                goto L20
            L1e:
                long r7 = r6.f72982l
            L20:
                r6.f72982l = r7
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.zra.C16230b.getWindow(int, q1h$d, long):q1h$d");
        }
    }

    /* JADX INFO: renamed from: zra$c */
    public static final class C16231c extends IOException {

        /* JADX INFO: renamed from: b */
        public static final int f105847b = 0;

        /* JADX INFO: renamed from: a */
        public final int f105848a;

        /* JADX INFO: renamed from: zra$c$a */
        @Target({ElementType.TYPE_USE})
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface a {
        }

        public C16231c(int i) {
            this.f105848a = i;
        }
    }

    /* JADX INFO: renamed from: zra$d */
    public static final class C16232d {

        /* JADX INFO: renamed from: a */
        public final una.C13612b f105849a;

        /* JADX INFO: renamed from: b */
        public final mja f105850b;

        private C16232d(una.C13612b c13612b, mja mjaVar) {
            this.f105849a = c13612b;
            this.f105850b = mjaVar;
        }
    }

    public zra(una... unaVarArr) {
        this(false, unaVarArr);
    }

    private void computePeriodTimeOffsets() {
        q1h.C11270b c11270b = new q1h.C11270b();
        for (int i = 0; i < this.f105842Z1; i++) {
            long j = -this.f105839X[0].getPeriod(i, c11270b).getPositionInWindowUs();
            int i2 = 1;
            while (true) {
                q1h[] q1hVarArr = this.f105839X;
                if (i2 < q1hVarArr.length) {
                    this.f105843a2[i][i2] = j - (-q1hVarArr[i2].getPeriod(i, c11270b).getPositionInWindowUs());
                    i2++;
                }
            }
        }
    }

    private void updateClippedDuration() {
        q1h[] q1hVarArr;
        q1h.C11270b c11270b = new q1h.C11270b();
        for (int i = 0; i < this.f105842Z1; i++) {
            int i2 = 0;
            long j = Long.MIN_VALUE;
            while (true) {
                q1hVarArr = this.f105839X;
                if (i2 >= q1hVarArr.length) {
                    break;
                }
                long durationUs = q1hVarArr[i2].getPeriod(i, c11270b).getDurationUs();
                if (durationUs != -9223372036854775807L) {
                    long j2 = durationUs + this.f105843a2[i][i2];
                    if (j == Long.MIN_VALUE || j2 < j) {
                        j = j2;
                    }
                }
                i2++;
            }
            Object uidOfPeriod = q1hVarArr[0].getUidOfPeriod(i);
            this.f105835M1.put(uidOfPeriod, Long.valueOf(j));
            Iterator<c52> it = this.f105838V1.get(uidOfPeriod).iterator();
            while (it.hasNext()) {
                it.next().updateClipping(0L, j);
            }
        }
    }

    @Override // p000.una
    public boolean canUpdateMediaItem(nfa nfaVar) {
        una[] unaVarArr = this.f105836N;
        return unaVarArr.length > 0 && unaVarArr[0].canUpdateMediaItem(nfaVar);
    }

    @Override // p000.una
    public mja createPeriod(una.C13612b c13612b, InterfaceC5892fn interfaceC5892fn, long j) {
        int length = this.f105836N.length;
        mja[] mjaVarArr = new mja[length];
        int indexOfPeriod = this.f105839X[0].getIndexOfPeriod(c13612b.f88603a);
        for (int i = 0; i < length; i++) {
            una.C13612b c13612bCopyWithPeriodUid = c13612b.copyWithPeriodUid(this.f105839X[i].getUidOfPeriod(indexOfPeriod));
            mjaVarArr[i] = this.f105836N[i].createPeriod(c13612bCopyWithPeriodUid, interfaceC5892fn, j - this.f105843a2[indexOfPeriod][i]);
            this.f105837Q.get(i).add(new C16232d(c13612bCopyWithPeriodUid, mjaVarArr[i]));
        }
        xra xraVar = new xra(this.f105841Z, this.f105843a2[indexOfPeriod], mjaVarArr);
        if (!this.f105834M) {
            return xraVar;
        }
        c52 c52Var = new c52(xraVar, false, 0L, ((Long) v80.checkNotNull(this.f105835M1.get(c13612b.f88603a))).longValue());
        this.f105838V1.put(c13612b.f88603a, c52Var);
        return c52Var;
    }

    @Override // p000.una
    public nfa getMediaItem() {
        una[] unaVarArr = this.f105836N;
        return unaVarArr.length > 0 ? unaVarArr[0].getMediaItem() : f105832d2;
    }

    @Override // p000.um2, p000.fs0
    /* JADX INFO: renamed from: l */
    public void mo2508l(@hib qdh qdhVar) {
        super.mo2508l(qdhVar);
        for (int i = 0; i < this.f105836N.length; i++) {
            m23429v(Integer.valueOf(i), this.f105836N[i]);
        }
    }

    @Override // p000.um2, p000.una
    public void maybeThrowSourceInfoRefreshError() throws IOException {
        C16231c c16231c = this.f105844b2;
        if (c16231c != null) {
            throw c16231c;
        }
        super.maybeThrowSourceInfoRefreshError();
    }

    @Override // p000.una
    public void releasePeriod(mja mjaVar) {
        if (this.f105834M) {
            c52 c52Var = (c52) mjaVar;
            Iterator<Map.Entry<Object, c52>> it = this.f105838V1.entries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<Object, c52> next = it.next();
                if (next.getValue().equals(c52Var)) {
                    this.f105838V1.remove(next.getKey(), next.getValue());
                    break;
                }
            }
            mjaVar = c52Var.f15785a;
        }
        xra xraVar = (xra) mjaVar;
        for (int i = 0; i < this.f105836N.length; i++) {
            List<C16232d> list = this.f105837Q.get(i);
            mja childPeriod = xraVar.getChildPeriod(i);
            int i2 = 0;
            while (true) {
                if (i2 >= list.size()) {
                    break;
                }
                if (list.get(i2).f105850b.equals(childPeriod)) {
                    list.remove(i2);
                    break;
                }
                i2++;
            }
            this.f105836N[i].releasePeriod(xraVar.getChildPeriod(i));
        }
    }

    @Override // p000.um2, p000.fs0
    public void releaseSourceInternal() {
        super.releaseSourceInternal();
        Arrays.fill(this.f105839X, (Object) null);
        this.f105842Z1 = -1;
        this.f105844b2 = null;
        this.f105840Y.clear();
        Collections.addAll(this.f105840Y, this.f105836N);
    }

    @Override // p000.una
    public void updateMediaItem(nfa nfaVar) {
        this.f105836N[0].updateMediaItem(nfaVar);
    }

    @Override // p000.um2
    @hib
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public una.C13612b mo2509r(Integer num, una.C13612b c13612b) {
        List<C16232d> list = this.f105837Q.get(num.intValue());
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).f105849a.equals(c13612b)) {
                return this.f105837Q.get(0).get(i).f105849a;
            }
        }
        return null;
    }

    @Override // p000.um2
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public void lambda$prepareChildSource$0(Integer num, una unaVar, q1h q1hVar) {
        if (this.f105844b2 != null) {
            return;
        }
        if (this.f105842Z1 == -1) {
            this.f105842Z1 = q1hVar.getPeriodCount();
        } else if (q1hVar.getPeriodCount() != this.f105842Z1) {
            this.f105844b2 = new C16231c(0);
            return;
        }
        if (this.f105843a2.length == 0) {
            this.f105843a2 = (long[][]) Array.newInstance((Class<?>) Long.TYPE, this.f105842Z1, this.f105839X.length);
        }
        this.f105840Y.remove(unaVar);
        this.f105839X[num.intValue()] = q1hVar;
        if (this.f105840Y.isEmpty()) {
            if (this.f105833L) {
                computePeriodTimeOffsets();
            }
            q1h c16230b = this.f105839X[0];
            if (this.f105834M) {
                updateClippedDuration();
                c16230b = new C16230b(c16230b, this.f105835M1);
            }
            m11123m(c16230b);
        }
    }

    public zra(boolean z, una... unaVarArr) {
        this(z, false, unaVarArr);
    }

    public zra(boolean z, boolean z2, una... unaVarArr) {
        this(z, z2, new gt3(), unaVarArr);
    }

    public zra(boolean z, boolean z2, an2 an2Var, una... unaVarArr) {
        this.f105833L = z;
        this.f105834M = z2;
        this.f105836N = unaVarArr;
        this.f105841Z = an2Var;
        this.f105840Y = new ArrayList<>(Arrays.asList(unaVarArr));
        this.f105842Z1 = -1;
        this.f105837Q = new ArrayList(unaVarArr.length);
        for (int i = 0; i < unaVarArr.length; i++) {
            this.f105837Q.add(new ArrayList());
        }
        this.f105839X = new q1h[unaVarArr.length];
        this.f105843a2 = new long[0][];
        this.f105835M1 = new HashMap();
        this.f105838V1 = v3b.hashKeys().arrayListValues().build();
    }
}
