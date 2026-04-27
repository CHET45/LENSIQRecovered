package p000;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nTextLayoutResultProxy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextLayoutResultProxy.kt\nandroidx/compose/foundation/text/TextLayoutResultProxy\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,131:1\n1#2:132\n*E\n"})
@e0g(parameters = 0)
public final class iug {

    /* JADX INFO: renamed from: d */
    public static final int f48531d = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final hug f48532a;

    /* JADX INFO: renamed from: b */
    @gib
    public mv8 f48533b;

    /* JADX INFO: renamed from: c */
    @gib
    public mv8 f48534c;

    public iug(@yfb hug hugVar, @gib mv8 mv8Var, @gib mv8 mv8Var2) {
        this.f48532a = hugVar;
        this.f48533b = mv8Var;
        this.f48534c = mv8Var2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /* JADX INFO: renamed from: coercedInVisibleBoundsOfInputText-MK-Hz9U, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final long m30404coercedInVisibleBoundsOfInputTextMKHz9U(long r6) {
        /*
            r5 = this;
            mv8 r0 = r5.f48533b
            if (r0 == 0) goto L1e
            boolean r1 = r0.isAttached()
            if (r1 == 0) goto L16
            mv8 r1 = r5.f48534c
            r2 = 0
            if (r1 == 0) goto L1c
            r3 = 0
            r4 = 2
            rud r2 = p000.mv8.localBoundingBoxOf$default(r1, r0, r3, r4, r2)
            goto L1c
        L16:
            rud$a r0 = p000.rud.f79687e
            rud r2 = r0.getZero()
        L1c:
            if (r2 != 0) goto L24
        L1e:
            rud$a r0 = p000.rud.f79687e
            rud r2 = r0.getZero()
        L24:
            long r6 = p000.jug.m30579access$coerceIn3MmeM6k(r6, r2)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.iug.m30404coercedInVisibleBoundsOfInputTextMKHz9U(long):long");
    }

    public static /* synthetic */ int getLineEnd$default(iug iugVar, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return iugVar.getLineEnd(i, z);
    }

    /* JADX INFO: renamed from: getOffsetForPosition-3MmeM6k$default, reason: not valid java name */
    public static /* synthetic */ int m30405getOffsetForPosition3MmeM6k$default(iug iugVar, long j, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return iugVar.m30406getOffsetForPosition3MmeM6k(j, z);
    }

    @gib
    public final mv8 getDecorationBoxCoordinates() {
        return this.f48534c;
    }

    @gib
    public final mv8 getInnerTextFieldCoordinates() {
        return this.f48533b;
    }

    public final int getLineEnd(int i, boolean z) {
        return this.f48532a.getLineEnd(i, z);
    }

    public final int getLineForVerticalPosition(float f) {
        return this.f48532a.getLineForVerticalPosition(izb.m30430getYimpl(m30408translateDecorationToInnerCoordinatesMKHz9U$foundation_release(m30404coercedInVisibleBoundsOfInputTextMKHz9U(mzb.Offset(0.0f, f)))));
    }

    /* JADX INFO: renamed from: getOffsetForPosition-3MmeM6k, reason: not valid java name */
    public final int m30406getOffsetForPosition3MmeM6k(long j, boolean z) {
        if (z) {
            j = m30404coercedInVisibleBoundsOfInputTextMKHz9U(j);
        }
        return this.f48532a.m30129getOffsetForPositionk4lQ0M(m30408translateDecorationToInnerCoordinatesMKHz9U$foundation_release(j));
    }

    @yfb
    public final hug getValue() {
        return this.f48532a;
    }

    /* JADX INFO: renamed from: isPositionOnText-k-4lQ0M, reason: not valid java name */
    public final boolean m30407isPositionOnTextk4lQ0M(long j) {
        long jM30408translateDecorationToInnerCoordinatesMKHz9U$foundation_release = m30408translateDecorationToInnerCoordinatesMKHz9U$foundation_release(m30404coercedInVisibleBoundsOfInputTextMKHz9U(j));
        int lineForVerticalPosition = this.f48532a.getLineForVerticalPosition(izb.m30430getYimpl(jM30408translateDecorationToInnerCoordinatesMKHz9U$foundation_release));
        return izb.m30429getXimpl(jM30408translateDecorationToInnerCoordinatesMKHz9U$foundation_release) >= this.f48532a.getLineLeft(lineForVerticalPosition) && izb.m30429getXimpl(jM30408translateDecorationToInnerCoordinatesMKHz9U$foundation_release) <= this.f48532a.getLineRight(lineForVerticalPosition);
    }

    public final void setDecorationBoxCoordinates(@gib mv8 mv8Var) {
        this.f48534c = mv8Var;
    }

    public final void setInnerTextFieldCoordinates(@gib mv8 mv8Var) {
        this.f48533b = mv8Var;
    }

    /* JADX INFO: renamed from: translateDecorationToInnerCoordinates-MK-Hz9U$foundation_release, reason: not valid java name */
    public final long m30408translateDecorationToInnerCoordinatesMKHz9U$foundation_release(long j) {
        mv8 mv8Var;
        mv8 mv8Var2 = this.f48533b;
        if (mv8Var2 == null) {
            return j;
        }
        if (!mv8Var2.isAttached()) {
            mv8Var2 = null;
        }
        if (mv8Var2 == null || (mv8Var = this.f48534c) == null) {
            return j;
        }
        mv8 mv8Var3 = mv8Var.isAttached() ? mv8Var : null;
        return mv8Var3 == null ? j : mv8Var2.mo30034localPositionOfR5De75A(mv8Var3, j);
    }

    /* JADX INFO: renamed from: translateInnerToDecorationCoordinates-MK-Hz9U$foundation_release, reason: not valid java name */
    public final long m30409translateInnerToDecorationCoordinatesMKHz9U$foundation_release(long j) {
        mv8 mv8Var;
        mv8 mv8Var2 = this.f48533b;
        if (mv8Var2 == null) {
            return j;
        }
        if (!mv8Var2.isAttached()) {
            mv8Var2 = null;
        }
        if (mv8Var2 == null || (mv8Var = this.f48534c) == null) {
            return j;
        }
        mv8 mv8Var3 = mv8Var.isAttached() ? mv8Var : null;
        return mv8Var3 == null ? j : mv8Var3.mo30034localPositionOfR5De75A(mv8Var2, j);
    }

    public /* synthetic */ iug(hug hugVar, mv8 mv8Var, mv8 mv8Var2, int i, jt3 jt3Var) {
        this(hugVar, (i & 2) != 0 ? null : mv8Var, (i & 4) != 0 ? null : mv8Var2);
    }
}
