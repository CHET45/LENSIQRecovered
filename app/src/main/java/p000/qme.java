package p000;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nScaleFactor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScaleFactor.kt\nandroidx/compose/ui/layout/ScaleFactorKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,199:1\n131#1:203\n63#2,3:200\n*S KotlinDebug\n*F\n+ 1 ScaleFactor.kt\nandroidx/compose/ui/layout/ScaleFactorKt\n*L\n145#1:203\n32#1:200,3\n*E\n"})
public final class qme {
    @f0g
    public static final long ScaleFactor(float f, float f2) {
        return pme.m31789constructorimpl((((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
    }

    @f0g
    /* JADX INFO: renamed from: div-UQTWf7w, reason: not valid java name */
    public static final long m31950divUQTWf7w(long j, long j2) {
        return eqf.Size(wpf.m33069getWidthimpl(j) / pme.m31795getScaleXimpl(j2), wpf.m33066getHeightimpl(j) / pme.m31796getScaleYimpl(j2));
    }

    /* JADX INFO: renamed from: isSpecified-FK8aYYs, reason: not valid java name */
    public static final boolean m31951isSpecifiedFK8aYYs(long j) {
        return j != pme.f71405b.m31802getUnspecified_hLwfpc();
    }

    @f0g
    /* JADX INFO: renamed from: isSpecified-FK8aYYs$annotations, reason: not valid java name */
    public static /* synthetic */ void m31952isSpecifiedFK8aYYs$annotations(long j) {
    }

    /* JADX INFO: renamed from: isUnspecified-FK8aYYs, reason: not valid java name */
    public static final boolean m31953isUnspecifiedFK8aYYs(long j) {
        return j == pme.f71405b.m31802getUnspecified_hLwfpc();
    }

    @f0g
    /* JADX INFO: renamed from: isUnspecified-FK8aYYs$annotations, reason: not valid java name */
    public static /* synthetic */ void m31954isUnspecifiedFK8aYYs$annotations(long j) {
    }

    @f0g
    /* JADX INFO: renamed from: lerp--bDIf60, reason: not valid java name */
    public static final long m31955lerpbDIf60(long j, long j2, float f) {
        return ScaleFactor(m3a.lerp(pme.m31795getScaleXimpl(j), pme.m31795getScaleXimpl(j2), f), m3a.lerp(pme.m31796getScaleYimpl(j), pme.m31796getScaleYimpl(j2), f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float roundToTenths(float f) {
        float f2 = 10;
        float f3 = f * f2;
        int i = (int) f3;
        if (f3 - i >= 0.5f) {
            i++;
        }
        return i / f2;
    }

    /* JADX INFO: renamed from: takeOrElse-oyDd2qo, reason: not valid java name */
    public static final long m31956takeOrElseoyDd2qo(long j, @yfb ny6<pme> ny6Var) {
        return j != pme.f71405b.m31802getUnspecified_hLwfpc() ? j : ny6Var.invoke().m31800unboximpl();
    }

    @f0g
    /* JADX INFO: renamed from: times-UQTWf7w, reason: not valid java name */
    public static final long m31957timesUQTWf7w(long j, long j2) {
        return eqf.Size(wpf.m33069getWidthimpl(j) * pme.m31795getScaleXimpl(j2), wpf.m33066getHeightimpl(j) * pme.m31796getScaleYimpl(j2));
    }

    @f0g
    /* JADX INFO: renamed from: times-m-w2e94, reason: not valid java name */
    public static final long m31958timesmw2e94(long j, long j2) {
        return m31957timesUQTWf7w(j2, j);
    }
}
