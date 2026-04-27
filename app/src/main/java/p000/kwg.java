package p000;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nTextUnit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextUnit.kt\nandroidx/compose/ui/unit/TextUnitKt\n*L\n1#1,389:1\n251#1:390\n*S KotlinDebug\n*F\n+ 1 TextUnit.kt\nandroidx/compose/ui/unit/TextUnitKt\n*L\n265#1:390\n*E\n"})
public final class kwg {

    /* JADX INFO: renamed from: a */
    public static final long f55525a = 1095216660480L;

    /* JADX INFO: renamed from: b */
    public static final long f55526b = 0;

    /* JADX INFO: renamed from: c */
    public static final long f55527c = 4294967296L;

    /* JADX INFO: renamed from: d */
    public static final long f55528d = 8589934592L;

    /* JADX INFO: renamed from: TextUnit-anM5pPY, reason: not valid java name */
    public static final long m30784TextUnitanM5pPY(float f, long j) {
        return pack(j, f);
    }

    @yjd
    /* JADX INFO: renamed from: checkArithmetic--R2X_6o, reason: not valid java name */
    public static final void m30785checkArithmeticR2X_6o(long j) {
        if (m30790isUnspecifiedR2X_6o(j)) {
            throw new IllegalArgumentException("Cannot perform operation for Unspecified type.");
        }
    }

    @yjd
    /* JADX INFO: renamed from: checkArithmetic-NB67dxo, reason: not valid java name */
    public static final void m30786checkArithmeticNB67dxo(long j, long j2) {
        if (m30790isUnspecifiedR2X_6o(j) || m30790isUnspecifiedR2X_6o(j2)) {
            throw new IllegalArgumentException("Cannot perform operation for Unspecified type.");
        }
        if (lwg.m30918equalsimpl0(jwg.m30612getTypeUIouoOA(j), jwg.m30612getTypeUIouoOA(j2))) {
            return;
        }
        throw new IllegalArgumentException(("Cannot perform operation for " + ((Object) lwg.m30920toStringimpl(jwg.m30612getTypeUIouoOA(j))) + " and " + ((Object) lwg.m30920toStringimpl(jwg.m30612getTypeUIouoOA(j2)))).toString());
    }

    @yjd
    /* JADX INFO: renamed from: checkArithmetic-vU-0ePk, reason: not valid java name */
    public static final void m30787checkArithmeticvU0ePk(long j, long j2, long j3) {
        if (m30790isUnspecifiedR2X_6o(j) || m30790isUnspecifiedR2X_6o(j2) || m30790isUnspecifiedR2X_6o(j3)) {
            throw new IllegalArgumentException("Cannot perform operation for Unspecified type.");
        }
        if (lwg.m30918equalsimpl0(jwg.m30612getTypeUIouoOA(j), jwg.m30612getTypeUIouoOA(j2)) && lwg.m30918equalsimpl0(jwg.m30612getTypeUIouoOA(j2), jwg.m30612getTypeUIouoOA(j3))) {
            return;
        }
        throw new IllegalArgumentException(("Cannot perform operation for " + ((Object) lwg.m30920toStringimpl(jwg.m30612getTypeUIouoOA(j))) + " and " + ((Object) lwg.m30920toStringimpl(jwg.m30612getTypeUIouoOA(j2)))).toString());
    }

    public static final long getEm(float f) {
        return pack(8589934592L, f);
    }

    @f0g
    public static /* synthetic */ void getEm$annotations(double d) {
    }

    public static final long getSp(float f) {
        return pack(4294967296L, f);
    }

    @f0g
    public static /* synthetic */ void getSp$annotations(double d) {
    }

    /* JADX INFO: renamed from: isSpecified--R2X_6o, reason: not valid java name */
    public static final boolean m30788isSpecifiedR2X_6o(long j) {
        return !m30790isUnspecifiedR2X_6o(j);
    }

    @f0g
    /* JADX INFO: renamed from: isSpecified--R2X_6o$annotations, reason: not valid java name */
    public static /* synthetic */ void m30789isSpecifiedR2X_6o$annotations(long j) {
    }

    /* JADX INFO: renamed from: isUnspecified--R2X_6o, reason: not valid java name */
    public static final boolean m30790isUnspecifiedR2X_6o(long j) {
        return jwg.m30611getRawTypeimpl(j) == 0;
    }

    @f0g
    /* JADX INFO: renamed from: isUnspecified--R2X_6o$annotations, reason: not valid java name */
    public static /* synthetic */ void m30791isUnspecifiedR2X_6o$annotations(long j) {
    }

    @f0g
    /* JADX INFO: renamed from: lerp-C3pnCVY, reason: not valid java name */
    public static final long m30792lerpC3pnCVY(long j, long j2, float f) {
        m30786checkArithmeticNB67dxo(j, j2);
        return pack(jwg.m30611getRawTypeimpl(j), m3a.lerp(jwg.m30613getValueimpl(j), jwg.m30613getValueimpl(j2), f));
    }

    @yjd
    public static final long pack(long j, float f) {
        return jwg.m30605constructorimpl(j | (((long) Float.floatToIntBits(f)) & 4294967295L));
    }

    /* JADX INFO: renamed from: takeOrElse-eAf_CNQ, reason: not valid java name */
    public static final long m30793takeOrElseeAf_CNQ(long j, @yfb ny6<jwg> ny6Var) {
        return !m30790isUnspecifiedR2X_6o(j) ? j : ny6Var.invoke().m30622unboximpl();
    }

    @f0g
    /* JADX INFO: renamed from: times-mpE4wyQ, reason: not valid java name */
    public static final long m30795timesmpE4wyQ(float f, long j) {
        m30785checkArithmeticR2X_6o(j);
        return pack(jwg.m30611getRawTypeimpl(j), f * jwg.m30613getValueimpl(j));
    }

    public static final long getEm(double d) {
        return pack(8589934592L, (float) d);
    }

    @f0g
    public static /* synthetic */ void getEm$annotations(float f) {
    }

    public static final long getSp(double d) {
        return pack(4294967296L, (float) d);
    }

    @f0g
    public static /* synthetic */ void getSp$annotations(float f) {
    }

    public static final long getEm(int i) {
        return pack(8589934592L, i);
    }

    @f0g
    public static /* synthetic */ void getEm$annotations(int i) {
    }

    public static final long getSp(int i) {
        return pack(4294967296L, i);
    }

    @f0g
    public static /* synthetic */ void getSp$annotations(int i) {
    }

    @f0g
    /* JADX INFO: renamed from: times-mpE4wyQ, reason: not valid java name */
    public static final long m30794timesmpE4wyQ(double d, long j) {
        m30785checkArithmeticR2X_6o(j);
        return pack(jwg.m30611getRawTypeimpl(j), ((float) d) * jwg.m30613getValueimpl(j));
    }

    @f0g
    /* JADX INFO: renamed from: times-mpE4wyQ, reason: not valid java name */
    public static final long m30796timesmpE4wyQ(int i, long j) {
        m30785checkArithmeticR2X_6o(j);
        return pack(jwg.m30611getRawTypeimpl(j), i * jwg.m30613getValueimpl(j));
    }
}
