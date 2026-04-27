package p000;

/* JADX INFO: loaded from: classes.dex */
public interface hab {

    /* JADX INFO: renamed from: hab$a */
    public static final class C6765a {
        @gib
        @Deprecated
        /* JADX INFO: renamed from: onPostFling-RZ2iAVY, reason: not valid java name */
        public static Object m29973onPostFlingRZ2iAVY(@yfb hab habVar, long j, long j2, @yfb zy2<? super i4i> zy2Var) {
            return hab.super.mo29969onPostFlingRZ2iAVY(j, j2, zy2Var);
        }

        @Deprecated
        /* JADX INFO: renamed from: onPostScroll-DzOQY0M, reason: not valid java name */
        public static long m29974onPostScrollDzOQY0M(@yfb hab habVar, long j, long j2, int i) {
            return hab.super.mo29970onPostScrollDzOQY0M(j, j2, i);
        }

        @gib
        @Deprecated
        /* JADX INFO: renamed from: onPreFling-QWom1Mo, reason: not valid java name */
        public static Object m29975onPreFlingQWom1Mo(@yfb hab habVar, long j, @yfb zy2<? super i4i> zy2Var) {
            return hab.super.mo29971onPreFlingQWom1Mo(j, zy2Var);
        }

        @Deprecated
        /* JADX INFO: renamed from: onPreScroll-OzD1aCk, reason: not valid java name */
        public static long m29976onPreScrollOzD1aCk(@yfb hab habVar, long j, int i) {
            return hab.super.mo29972onPreScrollOzD1aCk(j, i);
        }
    }

    /* JADX INFO: renamed from: onPostFling-RZ2iAVY$suspendImpl, reason: not valid java name */
    static /* synthetic */ Object m29967onPostFlingRZ2iAVY$suspendImpl(hab habVar, long j, long j2, zy2<? super i4i> zy2Var) {
        return i4i.m30148boximpl(i4i.f45754b.m30168getZero9UxMQ8M());
    }

    /* JADX INFO: renamed from: onPreFling-QWom1Mo$suspendImpl, reason: not valid java name */
    static /* synthetic */ Object m29968onPreFlingQWom1Mo$suspendImpl(hab habVar, long j, zy2<? super i4i> zy2Var) {
        return i4i.m30148boximpl(i4i.f45754b.m30168getZero9UxMQ8M());
    }

    @gib
    /* JADX INFO: renamed from: onPostFling-RZ2iAVY, reason: not valid java name */
    default Object mo29969onPostFlingRZ2iAVY(long j, long j2, @yfb zy2<? super i4i> zy2Var) {
        return m29967onPostFlingRZ2iAVY$suspendImpl(this, j, j2, zy2Var);
    }

    /* JADX INFO: renamed from: onPostScroll-DzOQY0M, reason: not valid java name */
    default long mo29970onPostScrollDzOQY0M(long j, long j2, int i) {
        return izb.f49009b.m30445getZeroF1C5BW0();
    }

    @gib
    /* JADX INFO: renamed from: onPreFling-QWom1Mo, reason: not valid java name */
    default Object mo29971onPreFlingQWom1Mo(long j, @yfb zy2<? super i4i> zy2Var) {
        return m29968onPreFlingQWom1Mo$suspendImpl(this, j, zy2Var);
    }

    /* JADX INFO: renamed from: onPreScroll-OzD1aCk, reason: not valid java name */
    default long mo29972onPreScrollOzD1aCk(long j, int i) {
        return izb.f49009b.m30445getZeroF1C5BW0();
    }
}
