package p000;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class k2e implements aa3 {

    /* JADX INFO: renamed from: a */
    public final ArrayList<ba3> f52488a = new ArrayList<>();

    private int getIndexOfCuesStartingAfter(long j) {
        for (int i = 0; i < this.f52488a.size(); i++) {
            if (j < this.f52488a.get(i).f13112b) {
                return i;
            }
        }
        return this.f52488a.size();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0025  */
    @Override // p000.aa3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean addCues(p000.ba3 r10, long r11) {
        /*
            r9 = this;
            long r0 = r10.f13112b
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 0
            r4 = 1
            if (r0 == 0) goto Lf
            r0 = r4
            goto L10
        Lf:
            r0 = r1
        L10:
            p000.v80.checkArgument(r0)
            long r5 = r10.f13112b
            int r0 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r0 > 0) goto L25
            long r5 = r10.f13114d
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r0 == 0) goto L23
            int r0 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r0 >= 0) goto L25
        L23:
            r0 = r4
            goto L26
        L25:
            r0 = r1
        L26:
            java.util.ArrayList<ba3> r2 = r9.f52488a
            int r2 = r2.size()
            int r2 = r2 - r4
        L2d:
            if (r2 < 0) goto L58
            long r5 = r10.f13112b
            java.util.ArrayList<ba3> r3 = r9.f52488a
            java.lang.Object r3 = r3.get(r2)
            ba3 r3 = (p000.ba3) r3
            long r7 = r3.f13112b
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 < 0) goto L46
            java.util.ArrayList<ba3> r11 = r9.f52488a
            int r2 = r2 + r4
            r11.add(r2, r10)
            return r0
        L46:
            java.util.ArrayList<ba3> r3 = r9.f52488a
            java.lang.Object r3 = r3.get(r2)
            ba3 r3 = (p000.ba3) r3
            long r5 = r3.f13112b
            int r3 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r3 > 0) goto L55
            r0 = r1
        L55:
            int r2 = r2 + (-1)
            goto L2d
        L58:
            java.util.ArrayList<ba3> r11 = r9.f52488a
            r11.add(r1, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.k2e.addCues(ba3, long):boolean");
    }

    @Override // p000.aa3
    public void clear() {
        this.f52488a.clear();
    }

    @Override // p000.aa3
    public void discardCuesBeforeTimeUs(long j) {
        int indexOfCuesStartingAfter = getIndexOfCuesStartingAfter(j);
        if (indexOfCuesStartingAfter == 0) {
            return;
        }
        long j2 = this.f52488a.get(indexOfCuesStartingAfter - 1).f13114d;
        if (j2 == -9223372036854775807L || j2 >= j) {
            indexOfCuesStartingAfter--;
        }
        this.f52488a.subList(0, indexOfCuesStartingAfter).clear();
    }

    @Override // p000.aa3
    public kx7<n93> getCuesAtTimeUs(long j) {
        int indexOfCuesStartingAfter = getIndexOfCuesStartingAfter(j);
        if (indexOfCuesStartingAfter == 0) {
            return kx7.m15110of();
        }
        ba3 ba3Var = this.f52488a.get(indexOfCuesStartingAfter - 1);
        long j2 = ba3Var.f13114d;
        return (j2 == -9223372036854775807L || j < j2) ? ba3Var.f13111a : kx7.m15110of();
    }

    @Override // p000.aa3
    public long getNextCueChangeTimeUs(long j) {
        if (this.f52488a.isEmpty()) {
            return Long.MIN_VALUE;
        }
        if (j < this.f52488a.get(0).f13112b) {
            return this.f52488a.get(0).f13112b;
        }
        for (int i = 1; i < this.f52488a.size(); i++) {
            ba3 ba3Var = this.f52488a.get(i);
            if (j < ba3Var.f13112b) {
                long j2 = this.f52488a.get(i - 1).f13114d;
                return (j2 == -9223372036854775807L || j2 <= j || j2 >= ba3Var.f13112b) ? ba3Var.f13112b : j2;
            }
        }
        long j3 = ((ba3) vg8.getLast(this.f52488a)).f13114d;
        if (j3 == -9223372036854775807L || j >= j3) {
            return Long.MIN_VALUE;
        }
        return j3;
    }

    @Override // p000.aa3
    public long getPreviousCueChangeTimeUs(long j) {
        if (this.f52488a.isEmpty() || j < this.f52488a.get(0).f13112b) {
            return -9223372036854775807L;
        }
        for (int i = 1; i < this.f52488a.size(); i++) {
            long j2 = this.f52488a.get(i).f13112b;
            if (j == j2) {
                return j2;
            }
            if (j < j2) {
                ba3 ba3Var = this.f52488a.get(i - 1);
                long j3 = ba3Var.f13114d;
                return (j3 == -9223372036854775807L || j3 > j) ? ba3Var.f13112b : j3;
            }
        }
        ba3 ba3Var2 = (ba3) vg8.getLast(this.f52488a);
        long j4 = ba3Var2.f13114d;
        return (j4 == -9223372036854775807L || j < j4) ? ba3Var2.f13112b : j4;
    }
}
