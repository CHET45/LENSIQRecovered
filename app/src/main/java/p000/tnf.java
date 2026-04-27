package p000;

import android.net.Uri;
import p000.nfa;
import p000.q1h;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class tnf extends q1h {

    /* JADX INFO: renamed from: r */
    public static final Object f85405r = new Object();

    /* JADX INFO: renamed from: s */
    public static final nfa f85406s = new nfa.C9851c().setMediaId("SinglePeriodTimeline").setUri(Uri.EMPTY).build();

    /* JADX INFO: renamed from: e */
    public final long f85407e;

    /* JADX INFO: renamed from: f */
    public final long f85408f;

    /* JADX INFO: renamed from: g */
    public final long f85409g;

    /* JADX INFO: renamed from: h */
    public final long f85410h;

    /* JADX INFO: renamed from: i */
    public final long f85411i;

    /* JADX INFO: renamed from: j */
    public final long f85412j;

    /* JADX INFO: renamed from: k */
    public final long f85413k;

    /* JADX INFO: renamed from: l */
    public final boolean f85414l;

    /* JADX INFO: renamed from: m */
    public final boolean f85415m;

    /* JADX INFO: renamed from: n */
    public final boolean f85416n;

    /* JADX INFO: renamed from: o */
    @hib
    public final Object f85417o;

    /* JADX INFO: renamed from: p */
    @hib
    public final nfa f85418p;

    /* JADX INFO: renamed from: q */
    @hib
    public final nfa.C9855g f85419q;

    @Deprecated
    public tnf(long j, boolean z, boolean z2, boolean z3, @hib Object obj, @hib Object obj2) {
        this(j, j, 0L, 0L, z, z2, z3, obj, obj2);
    }

    @Override // p000.q1h
    public int getIndexOfPeriod(Object obj) {
        return f85405r.equals(obj) ? 0 : -1;
    }

    @Override // p000.q1h
    public q1h.C11270b getPeriod(int i, q1h.C11270b c11270b, boolean z) {
        v80.checkIndex(i, 0, 1);
        return c11270b.set(null, z ? f85405r : null, 0, this.f85410h, -this.f85412j);
    }

    @Override // p000.q1h
    public int getPeriodCount() {
        return 1;
    }

    @Override // p000.q1h
    public Object getUidOfPeriod(int i) {
        v80.checkIndex(i, 0, 1);
        return f85405r;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002e A[PHI: r1
  0x002e: PHI (r1v2 long) = (r1v1 long), (r1v1 long), (r1v1 long), (r1v6 long) binds: [B:3:0x000d, B:5:0x0011, B:7:0x0017, B:12:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p000.q1h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p000.q1h.C11272d getWindow(int r25, p000.q1h.C11272d r26, long r27) {
        /*
            r24 = this;
            r0 = r24
            r1 = 0
            r2 = 1
            r3 = r25
            p000.v80.checkIndex(r3, r1, r2)
            long r1 = r0.f85413k
            boolean r14 = r0.f85415m
            if (r14 == 0) goto L2e
            boolean r3 = r0.f85416n
            if (r3 != 0) goto L2e
            r3 = 0
            int r3 = (r27 > r3 ? 1 : (r27 == r3 ? 0 : -1))
            if (r3 == 0) goto L2e
            long r3 = r0.f85411i
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L27
        L24:
            r16 = r5
            goto L30
        L27:
            long r1 = r1 + r27
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 <= 0) goto L2e
            goto L24
        L2e:
            r16 = r1
        L30:
            java.lang.Object r4 = p000.q1h.C11272d.f72961q
            nfa r5 = r0.f85418p
            java.lang.Object r6 = r0.f85417o
            long r7 = r0.f85407e
            long r9 = r0.f85408f
            long r11 = r0.f85409g
            boolean r13 = r0.f85414l
            nfa$g r15 = r0.f85419q
            long r1 = r0.f85411i
            r18 = r1
            r21 = 0
            long r1 = r0.f85412j
            r22 = r1
            r20 = 0
            r3 = r26
            q1h$d r1 = r3.set(r4, r5, r6, r7, r9, r11, r13, r14, r15, r16, r18, r20, r21, r22)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.tnf.getWindow(int, q1h$d, long):q1h$d");
    }

    @Override // p000.q1h
    public int getWindowCount() {
        return 1;
    }

    public tnf(long j, boolean z, boolean z2, boolean z3, @hib Object obj, nfa nfaVar) {
        this(j, j, 0L, 0L, z, z2, z3, obj, nfaVar);
    }

    @Deprecated
    public tnf(long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, @hib Object obj, @hib Object obj2) {
        this(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, j, j2, j3, j4, z, z2, z3, obj, obj2);
    }

    public tnf(long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, @hib Object obj, nfa nfaVar) {
        this(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, j, j2, j3, j4, z, z2, false, obj, nfaVar, z3 ? nfaVar.f64307d : null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @Deprecated
    public tnf(long j, long j2, long j3, long j4, long j5, long j6, long j7, boolean z, boolean z2, boolean z3, @hib Object obj, @hib Object obj2) {
        nfa nfaVar = f85406s;
        this(j, j2, j3, j4, j5, j6, j7, z, z2, false, obj, nfaVar.buildUpon().setTag(obj2).build(), z3 ? nfaVar.f64307d : null);
    }

    @Deprecated
    public tnf(long j, long j2, long j3, long j4, long j5, long j6, long j7, boolean z, boolean z2, @hib Object obj, nfa nfaVar, @hib nfa.C9855g c9855g) {
        this(j, j2, j3, j4, j5, j6, j7, z, z2, false, obj, nfaVar, c9855g);
    }

    public tnf(long j, long j2, long j3, long j4, long j5, long j6, long j7, boolean z, boolean z2, boolean z3, @hib Object obj, nfa nfaVar, @hib nfa.C9855g c9855g) {
        this.f85407e = j;
        this.f85408f = j2;
        this.f85409g = j3;
        this.f85410h = j4;
        this.f85411i = j5;
        this.f85412j = j6;
        this.f85413k = j7;
        this.f85414l = z;
        this.f85415m = z2;
        this.f85416n = z3;
        this.f85417o = obj;
        this.f85418p = (nfa) v80.checkNotNull(nfaVar);
        this.f85419q = c9855g;
    }
}
