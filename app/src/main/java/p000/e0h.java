package p000;

/* JADX INFO: loaded from: classes7.dex */
@ihi(markerClass = {uh5.class})
@jjf(version = "1.9")
public interface e0h {

    /* JADX INFO: renamed from: e0h$a */
    public static final class C5037a {
        public static boolean hasNotPassedNow(@yfb e0h e0hVar) {
            return bt4.m28085isNegativeimpl(e0hVar.mo27923elapsedNowUwyO8pc());
        }

        public static boolean hasPassedNow(@yfb e0h e0hVar) {
            return !bt4.m28085isNegativeimpl(e0hVar.mo27923elapsedNowUwyO8pc());
        }

        @yfb
        /* JADX INFO: renamed from: minus-LRDsOJo, reason: not valid java name */
        public static e0h m28719minusLRDsOJo(@yfb e0h e0hVar, long j) {
            return e0hVar.mo27926plusLRDsOJo(bt4.m28103unaryMinusUwyO8pc(j));
        }

        @yfb
        /* JADX INFO: renamed from: plus-LRDsOJo, reason: not valid java name */
        public static e0h m28720plusLRDsOJo(@yfb e0h e0hVar, long j) {
            return new C13023th(e0hVar, j, null);
        }
    }

    /* JADX INFO: renamed from: elapsedNow-UwyO8pc */
    long mo27923elapsedNowUwyO8pc();

    boolean hasNotPassedNow();

    boolean hasPassedNow();

    @yfb
    /* JADX INFO: renamed from: minus-LRDsOJo */
    e0h mo27924minusLRDsOJo(long j);

    @yfb
    /* JADX INFO: renamed from: plus-LRDsOJo */
    e0h mo27926plusLRDsOJo(long j);
}
