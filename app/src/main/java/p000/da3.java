package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class da3 implements ydg {

    /* JADX INFO: renamed from: c */
    public static final String f28900c = "CuesWithTimingSubtitle";

    /* JADX INFO: renamed from: d */
    public static final s7c<ba3> f28901d = s7c.natural().onResultOf(new lz6() { // from class: ca3
        @Override // p000.lz6
        public final Object apply(Object obj) {
            return da3.lambda$static$0((ba3) obj);
        }
    });

    /* JADX INFO: renamed from: a */
    public final kx7<kx7<n93>> f28902a;

    /* JADX INFO: renamed from: b */
    public final long[] f28903b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public da3(java.util.List<p000.ba3> r18) {
        /*
            Method dump skipped, instruction units count: 221
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.da3.<init>(java.util.List):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Comparable lambda$static$0(ba3 ba3Var) {
        return Long.valueOf(normalizeUnsetStartTimeToZero(ba3Var.f13112b));
    }

    private static long normalizeUnsetStartTimeToZero(long j) {
        if (j == -9223372036854775807L) {
            return 0L;
        }
        return j;
    }

    @Override // p000.ydg
    public long getEventTime(int i) {
        v80.checkArgument(i < this.f28902a.size());
        return this.f28903b[i];
    }

    @Override // p000.ydg
    public int getEventTimeCount() {
        return this.f28902a.size();
    }

    @Override // p000.ydg
    public int getNextEventTimeIndex(long j) {
        int iBinarySearchCeil = t0i.binarySearchCeil(this.f28903b, j, false, false);
        if (iBinarySearchCeil < this.f28902a.size()) {
            return iBinarySearchCeil;
        }
        return -1;
    }

    @Override // p000.ydg
    public kx7<n93> getCues(long j) {
        int iBinarySearchFloor = t0i.binarySearchFloor(this.f28903b, j, true, false);
        return iBinarySearchFloor == -1 ? kx7.m15110of() : this.f28902a.get(iBinarySearchFloor);
    }
}
