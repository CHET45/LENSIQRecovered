package p000;

import android.net.Uri;
import p000.aga;
import p000.t1h;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class snf extends t1h {

    /* JADX INFO: renamed from: V1 */
    public static final Object f82390V1 = new Object();

    /* JADX INFO: renamed from: Z1 */
    public static final aga f82391Z1 = new aga.C0235c().setMediaId("SinglePeriodTimeline").setUri(Uri.EMPTY).build();

    /* JADX INFO: renamed from: C */
    public final long f82392C;

    /* JADX INFO: renamed from: F */
    public final long f82393F;

    /* JADX INFO: renamed from: H */
    public final long f82394H;

    /* JADX INFO: renamed from: L */
    public final long f82395L;

    /* JADX INFO: renamed from: M */
    public final long f82396M;

    /* JADX INFO: renamed from: M1 */
    @hib
    public final aga.C0239g f82397M1;

    /* JADX INFO: renamed from: N */
    public final boolean f82398N;

    /* JADX INFO: renamed from: Q */
    public final boolean f82399Q;

    /* JADX INFO: renamed from: X */
    public final boolean f82400X;

    /* JADX INFO: renamed from: Y */
    @hib
    public final Object f82401Y;

    /* JADX INFO: renamed from: Z */
    @hib
    public final aga f82402Z;

    /* JADX INFO: renamed from: f */
    public final long f82403f;

    /* JADX INFO: renamed from: m */
    public final long f82404m;

    @Deprecated
    public snf(long j, boolean z, boolean z2, boolean z3, @hib Object obj, @hib Object obj2) {
        this(j, j, 0L, 0L, z, z2, z3, obj, obj2);
    }

    @Override // p000.t1h
    public int getIndexOfPeriod(Object obj) {
        return f82390V1.equals(obj) ? 0 : -1;
    }

    @Override // p000.t1h
    public t1h.C12849b getPeriod(int i, t1h.C12849b c12849b, boolean z) {
        u80.checkIndex(i, 0, 1);
        return c12849b.set(null, z ? f82390V1 : null, 0, this.f82393F, -this.f82395L);
    }

    @Override // p000.t1h
    public int getPeriodCount() {
        return 1;
    }

    @Override // p000.t1h
    public Object getUidOfPeriod(int i) {
        u80.checkIndex(i, 0, 1);
        return f82390V1;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002e A[PHI: r1
  0x002e: PHI (r1v2 long) = (r1v1 long), (r1v1 long), (r1v1 long), (r1v6 long) binds: [B:3:0x000d, B:5:0x0011, B:7:0x0017, B:12:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p000.t1h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p000.t1h.C12851d getWindow(int r25, p000.t1h.C12851d r26, long r27) {
        /*
            r24 = this;
            r0 = r24
            r1 = 0
            r2 = 1
            r3 = r25
            p000.u80.checkIndex(r3, r1, r2)
            long r1 = r0.f82396M
            boolean r14 = r0.f82399Q
            if (r14 == 0) goto L2e
            boolean r3 = r0.f82400X
            if (r3 != 0) goto L2e
            r3 = 0
            int r3 = (r27 > r3 ? 1 : (r27 == r3 ? 0 : -1))
            if (r3 == 0) goto L2e
            long r3 = r0.f82394H
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
            java.lang.Object r4 = p000.t1h.C12851d.f83407M1
            aga r5 = r0.f82402Z
            java.lang.Object r6 = r0.f82401Y
            long r7 = r0.f82403f
            long r9 = r0.f82404m
            long r11 = r0.f82392C
            boolean r13 = r0.f82398N
            aga$g r15 = r0.f82397M1
            long r1 = r0.f82394H
            r18 = r1
            r21 = 0
            long r1 = r0.f82395L
            r22 = r1
            r20 = 0
            r3 = r26
            t1h$d r1 = r3.set(r4, r5, r6, r7, r9, r11, r13, r14, r15, r16, r18, r20, r21, r22)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.snf.getWindow(int, t1h$d, long):t1h$d");
    }

    @Override // p000.t1h
    public int getWindowCount() {
        return 1;
    }

    public snf(long j, boolean z, boolean z2, boolean z3, @hib Object obj, aga agaVar) {
        this(j, j, 0L, 0L, z, z2, z3, obj, agaVar);
    }

    @Deprecated
    public snf(long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, @hib Object obj, @hib Object obj2) {
        this(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, j, j2, j3, j4, z, z2, z3, obj, obj2);
    }

    public snf(long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, @hib Object obj, aga agaVar) {
        this(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, j, j2, j3, j4, z, z2, false, obj, agaVar, z3 ? agaVar.f1448d : null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @Deprecated
    public snf(long j, long j2, long j3, long j4, long j5, long j6, long j7, boolean z, boolean z2, boolean z3, @hib Object obj, @hib Object obj2) {
        aga agaVar = f82391Z1;
        this(j, j2, j3, j4, j5, j6, j7, z, z2, false, obj, agaVar.buildUpon().setTag(obj2).build(), z3 ? agaVar.f1448d : null);
    }

    @Deprecated
    public snf(long j, long j2, long j3, long j4, long j5, long j6, long j7, boolean z, boolean z2, @hib Object obj, aga agaVar, @hib aga.C0239g c0239g) {
        this(j, j2, j3, j4, j5, j6, j7, z, z2, false, obj, agaVar, c0239g);
    }

    public snf(long j, long j2, long j3, long j4, long j5, long j6, long j7, boolean z, boolean z2, boolean z3, @hib Object obj, aga agaVar, @hib aga.C0239g c0239g) {
        this.f82403f = j;
        this.f82404m = j2;
        this.f82392C = j3;
        this.f82393F = j4;
        this.f82394H = j5;
        this.f82395L = j6;
        this.f82396M = j7;
        this.f82398N = z;
        this.f82399Q = z2;
        this.f82400X = z3;
        this.f82401Y = obj;
        this.f82402Z = (aga) u80.checkNotNull(agaVar);
        this.f82397M1 = c0239g;
    }
}
