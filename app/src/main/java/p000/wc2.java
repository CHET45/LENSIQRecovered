package p000;

import p000.e0h;

/* JADX INFO: loaded from: classes7.dex */
@ihi(markerClass = {uh5.class})
@jjf(version = "1.9")
public interface wc2 extends e0h, Comparable<wc2> {

    /* JADX INFO: renamed from: wc2$a */
    public static final class C14546a {
        public static int compareTo(@yfb wc2 wc2Var, @yfb wc2 wc2Var2) {
            md8.checkNotNullParameter(wc2Var2, "other");
            return bt4.m28058compareToLRDsOJo(wc2Var.mo27925minusUwyO8pc(wc2Var2), bt4.f14711b.m28150getZEROUwyO8pc());
        }

        public static boolean hasNotPassedNow(@yfb wc2 wc2Var) {
            return e0h.C5037a.hasNotPassedNow(wc2Var);
        }

        public static boolean hasPassedNow(@yfb wc2 wc2Var) {
            return e0h.C5037a.hasPassedNow(wc2Var);
        }

        @yfb
        /* JADX INFO: renamed from: minus-LRDsOJo, reason: not valid java name */
        public static wc2 m32992minusLRDsOJo(@yfb wc2 wc2Var, long j) {
            return wc2Var.mo27926plusLRDsOJo(bt4.m28103unaryMinusUwyO8pc(j));
        }
    }

    int compareTo(@yfb wc2 wc2Var);

    boolean equals(@gib Object obj);

    int hashCode();

    @Override // p000.e0h
    @yfb
    /* JADX INFO: renamed from: minus-LRDsOJo */
    wc2 mo27924minusLRDsOJo(long j);

    /* JADX INFO: renamed from: minus-UwyO8pc */
    long mo27925minusUwyO8pc(@yfb wc2 wc2Var);

    @Override // p000.e0h
    @yfb
    /* JADX INFO: renamed from: plus-LRDsOJo */
    wc2 mo27926plusLRDsOJo(long j);
}
