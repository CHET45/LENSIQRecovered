package p000;

import p000.wc2;

/* JADX INFO: loaded from: classes7.dex */
@ihi(markerClass = {uh5.class})
@jjf(version = "1.9")
public interface u0h {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final C13313a f86527a = C13313a.f86528a;

    /* JADX INFO: renamed from: u0h$a */
    public static final class C13313a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ C13313a f86528a = new C13313a();

        private C13313a() {
        }
    }

    /* JADX INFO: renamed from: u0h$b */
    public static final class C13314b implements InterfaceC13315c {

        /* JADX INFO: renamed from: b */
        @yfb
        public static final C13314b f86529b = new C13314b();

        /* JADX INFO: renamed from: u0h$b$a */
        @jjf(version = "1.9")
        @vn8
        @ihi(markerClass = {uh5.class})
        public static final class a implements wc2 {

            /* JADX INFO: renamed from: a */
            public final long f86530a;

            private /* synthetic */ a(long j) {
                this.f86530a = j;
            }

            /* JADX INFO: renamed from: box-impl, reason: not valid java name */
            public static final /* synthetic */ a m32504boximpl(long j) {
                return new a(j);
            }

            /* JADX INFO: renamed from: compareTo-6eNON_k, reason: not valid java name */
            public static final int m32505compareTo6eNON_k(long j, long j2) {
                return bt4.m28058compareToLRDsOJo(m32514minus6eNON_k(j, j2), bt4.f14711b.m28150getZEROUwyO8pc());
            }

            /* JADX INFO: renamed from: compareTo-impl, reason: not valid java name */
            public static int m32506compareToimpl(long j, @yfb wc2 wc2Var) {
                md8.checkNotNullParameter(wc2Var, "other");
                return m32504boximpl(j).compareTo(wc2Var);
            }

            /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
            public static long m32507constructorimpl(long j) {
                return j;
            }

            /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
            public static boolean m32509equalsimpl(long j, Object obj) {
                return (obj instanceof a) && j == ((a) obj).m32521unboximpl();
            }

            /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
            public static final boolean m32510equalsimpl0(long j, long j2) {
                return j == j2;
            }

            /* JADX INFO: renamed from: hasNotPassedNow-impl, reason: not valid java name */
            public static boolean m32511hasNotPassedNowimpl(long j) {
                return bt4.m28085isNegativeimpl(m32508elapsedNowUwyO8pc(j));
            }

            /* JADX INFO: renamed from: hasPassedNow-impl, reason: not valid java name */
            public static boolean m32512hasPassedNowimpl(long j) {
                return !bt4.m28085isNegativeimpl(m32508elapsedNowUwyO8pc(j));
            }

            /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
            public static int m32513hashCodeimpl(long j) {
                return Long.hashCode(j);
            }

            /* JADX INFO: renamed from: minus-6eNON_k, reason: not valid java name */
            public static final long m32514minus6eNON_k(long j, long j2) {
                return vya.f92664b.m32822differenceBetweenfRLX17w(j, j2);
            }

            /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
            public static String m32518toStringimpl(long j) {
                return "ValueTimeMark(reading=" + j + ')';
            }

            @Override // java.lang.Comparable
            public int compareTo(@yfb wc2 wc2Var) {
                return wc2.C14546a.compareTo(this, wc2Var);
            }

            @Override // p000.e0h
            /* JADX INFO: renamed from: elapsedNow-UwyO8pc */
            public long mo27923elapsedNowUwyO8pc() {
                return m32508elapsedNowUwyO8pc(this.f86530a);
            }

            @Override // p000.wc2
            public boolean equals(Object obj) {
                return m32509equalsimpl(this.f86530a, obj);
            }

            @Override // p000.e0h
            public boolean hasNotPassedNow() {
                return m32511hasNotPassedNowimpl(this.f86530a);
            }

            @Override // p000.e0h
            public boolean hasPassedNow() {
                return m32512hasPassedNowimpl(this.f86530a);
            }

            @Override // p000.wc2
            public int hashCode() {
                return m32513hashCodeimpl(this.f86530a);
            }

            @Override // p000.wc2, p000.e0h
            /* JADX INFO: renamed from: minus-LRDsOJo */
            public /* bridge */ /* synthetic */ wc2 mo27924minusLRDsOJo(long j) {
                return m32504boximpl(m32519minusLRDsOJo(j));
            }

            @Override // p000.wc2
            /* JADX INFO: renamed from: minus-UwyO8pc */
            public long mo27925minusUwyO8pc(@yfb wc2 wc2Var) {
                md8.checkNotNullParameter(wc2Var, "other");
                return m32516minusUwyO8pc(this.f86530a, wc2Var);
            }

            @Override // p000.wc2, p000.e0h
            /* JADX INFO: renamed from: plus-LRDsOJo */
            public /* bridge */ /* synthetic */ wc2 mo27926plusLRDsOJo(long j) {
                return m32504boximpl(m32520plusLRDsOJo(j));
            }

            public String toString() {
                return m32518toStringimpl(this.f86530a);
            }

            /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
            public final /* synthetic */ long m32521unboximpl() {
                return this.f86530a;
            }

            /* JADX INFO: renamed from: elapsedNow-UwyO8pc, reason: not valid java name */
            public static long m32508elapsedNowUwyO8pc(long j) {
                return vya.f92664b.m32823elapsedFrom6eNON_k(j);
            }

            /* JADX INFO: renamed from: minus-UwyO8pc, reason: not valid java name */
            public static long m32516minusUwyO8pc(long j, @yfb wc2 wc2Var) {
                md8.checkNotNullParameter(wc2Var, "other");
                if (wc2Var instanceof a) {
                    return m32514minus6eNON_k(j, ((a) wc2Var).m32521unboximpl());
                }
                throw new IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + ((Object) m32518toStringimpl(j)) + " and " + wc2Var);
            }

            @Override // p000.e0h
            /* JADX INFO: renamed from: minus-LRDsOJo */
            public /* bridge */ /* synthetic */ e0h mo27924minusLRDsOJo(long j) {
                return m32504boximpl(m32519minusLRDsOJo(j));
            }

            @Override // p000.e0h
            /* JADX INFO: renamed from: plus-LRDsOJo */
            public /* bridge */ /* synthetic */ e0h mo27926plusLRDsOJo(long j) {
                return m32504boximpl(m32520plusLRDsOJo(j));
            }

            /* JADX INFO: renamed from: minus-LRDsOJo, reason: not valid java name */
            public long m32519minusLRDsOJo(long j) {
                return m32515minusLRDsOJo(this.f86530a, j);
            }

            /* JADX INFO: renamed from: plus-LRDsOJo, reason: not valid java name */
            public long m32520plusLRDsOJo(long j) {
                return m32517plusLRDsOJo(this.f86530a, j);
            }

            /* JADX INFO: renamed from: minus-LRDsOJo, reason: not valid java name */
            public static long m32515minusLRDsOJo(long j, long j2) {
                return vya.f92664b.m32821adjustReading6QKq23U(j, bt4.m28103unaryMinusUwyO8pc(j2));
            }

            /* JADX INFO: renamed from: plus-LRDsOJo, reason: not valid java name */
            public static long m32517plusLRDsOJo(long j, long j2) {
                return vya.f92664b.m32821adjustReading6QKq23U(j, j2);
            }
        }

        private C13314b() {
        }

        @Override // p000.u0h.InterfaceC13315c, p000.u0h
        public /* bridge */ /* synthetic */ wc2 markNow() {
            return a.m32504boximpl(m32503markNowz9LOYto());
        }

        /* JADX INFO: renamed from: markNow-z9LOYto, reason: not valid java name */
        public long m32503markNowz9LOYto() {
            return vya.f92664b.m32824markNowz9LOYto();
        }

        @yfb
        public String toString() {
            return vya.f92664b.toString();
        }

        @Override // p000.u0h
        public /* bridge */ /* synthetic */ e0h markNow() {
            return a.m32504boximpl(m32503markNowz9LOYto());
        }
    }

    /* JADX INFO: renamed from: u0h$c */
    @ihi(markerClass = {uh5.class})
    @jjf(version = "1.9")
    public interface InterfaceC13315c extends u0h {
        @Override // p000.u0h
        @yfb
        wc2 markNow();
    }

    @yfb
    e0h markNow();
}
