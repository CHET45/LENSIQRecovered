package p000;

import java.util.Iterator;
import java.util.List;
import p000.msf;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nLazyGridSnapLayoutInfoProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridSnapLayoutInfoProvider.kt\nandroidx/compose/foundation/gestures/snapping/LazyGridSnapLayoutInfoProviderKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,145:1\n1223#2,6:146\n*S KotlinDebug\n*F\n+ 1 LazyGridSnapLayoutInfoProvider.kt\nandroidx/compose/foundation/gestures/snapping/LazyGridSnapLayoutInfoProviderKt\n*L\n119#1:146,6\n*E\n"})
public final class wy8 {

    /* JADX INFO: renamed from: wy8$a */
    @dwf({"SMAP\nLazyGridSnapLayoutInfoProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridSnapLayoutInfoProvider.kt\nandroidx/compose/foundation/gestures/snapping/LazyGridSnapLayoutInfoProviderKt$SnapLayoutInfoProvider$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,145:1\n33#2,6:146\n1#3:152\n*S KotlinDebug\n*F\n+ 1 LazyGridSnapLayoutInfoProvider.kt\nandroidx/compose/foundation/gestures/snapping/LazyGridSnapLayoutInfoProviderKt$SnapLayoutInfoProvider$1\n*L\n71#1:146,6\n*E\n"})
    public static final class C14833a implements lsf {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ az8 f95700a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ msf f95701b;

        public C14833a(az8 az8Var, msf msfVar) {
            this.f95700a = az8Var;
            this.f95701b = msfVar;
        }

        private final int getAverageItemSize() {
            fy8 layoutInfo = getLayoutInfo();
            int iSizeOnMainAxis = 0;
            if (layoutInfo.getVisibleItemsInfo().isEmpty()) {
                return 0;
            }
            int size = layoutInfo.getVisibleItemsInfo().size();
            Iterator<T> it = layoutInfo.getVisibleItemsInfo().iterator();
            while (it.hasNext()) {
                iSizeOnMainAxis += wy8.sizeOnMainAxis((xx8) it.next(), layoutInfo.getOrientation());
            }
            return iSizeOnMainAxis / size;
        }

        private final fy8 getLayoutInfo() {
            return this.f95700a.getLayoutInfo();
        }

        @Override // p000.lsf
        public float calculateApproachOffset(float f, float f2) {
            return kpd.coerceAtLeast(Math.abs(f2) - getAverageItemSize(), 0.0f) * Math.signum(f2);
        }

        @Override // p000.lsf
        public float calculateSnapOffset(float f) {
            List<xx8> visibleItemsInfo = getLayoutInfo().getVisibleItemsInfo();
            msf msfVar = this.f95701b;
            int size = visibleItemsInfo.size();
            float f2 = Float.NEGATIVE_INFINITY;
            float f3 = Float.POSITIVE_INFINITY;
            for (int i = 0; i < size; i++) {
                xx8 xx8Var = visibleItemsInfo.get(i);
                float fCalculateDistanceToDesiredSnapPosition = nsf.calculateDistanceToDesiredSnapPosition(wy8.getSingleAxisViewportSize(getLayoutInfo()), getLayoutInfo().getBeforeContentPadding(), getLayoutInfo().getAfterContentPadding(), wy8.sizeOnMainAxis(xx8Var, getLayoutInfo().getOrientation()), wy8.offsetOnMainAxis(xx8Var, getLayoutInfo().getOrientation()), xx8Var.getIndex(), msfVar, getLayoutInfo().getTotalItemsCount());
                if (fCalculateDistanceToDesiredSnapPosition <= 0.0f && fCalculateDistanceToDesiredSnapPosition > f2) {
                    f2 = fCalculateDistanceToDesiredSnapPosition;
                }
                if (fCalculateDistanceToDesiredSnapPosition >= 0.0f && fCalculateDistanceToDesiredSnapPosition < f3) {
                    f3 = fCalculateDistanceToDesiredSnapPosition;
                }
            }
            return ksf.m30748calculateFinalOffsetFhqu1e0(l19.calculateFinalSnappingItem(this.f95700a.getDensity$foundation_release(), f), f2, f3);
        }
    }

    @yfb
    public static final lsf SnapLayoutInfoProvider(@yfb az8 az8Var, @yfb msf msfVar) {
        return new C14833a(az8Var, msfVar);
    }

    public static /* synthetic */ lsf SnapLayoutInfoProvider$default(az8 az8Var, msf msfVar, int i, Object obj) {
        if ((i & 2) != 0) {
            msfVar = msf.C9499a.f61956a;
        }
        return SnapLayoutInfoProvider(az8Var, msfVar);
    }

    public static final int getSingleAxisViewportSize(@yfb fy8 fy8Var) {
        return fy8Var.getOrientation() == t7c.Vertical ? r78.m32086getHeightimpl(fy8Var.mo29680getViewportSizeYbymL2g()) : r78.m32087getWidthimpl(fy8Var.mo29680getViewportSizeYbymL2g());
    }

    public static final int offsetOnMainAxis(@yfb xx8 xx8Var, @yfb t7c t7cVar) {
        return t7cVar == t7c.Vertical ? a78.m27202getYimpl(xx8Var.mo30416getOffsetnOccac()) : a78.m27201getXimpl(xx8Var.mo30416getOffsetnOccac());
    }

    @yfb
    @hk2
    public static final s36 rememberSnapFlingBehavior(@yfb az8 az8Var, @gib msf msfVar, @gib zl2 zl2Var, int i, int i2) {
        if ((i2 & 2) != 0) {
            msfVar = msf.C9499a.f61956a;
        }
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(-234434234, i, -1, "androidx.compose.foundation.gestures.snapping.rememberSnapFlingBehavior (LazyGridSnapLayoutInfoProvider.kt:116)");
        }
        boolean z = (((i & 14) ^ 6) > 4 && zl2Var.changed(az8Var)) || (i & 6) == 4;
        Object objRememberedValue = zl2Var.rememberedValue();
        if (z || objRememberedValue == zl2.f105372a.getEmpty()) {
            objRememberedValue = SnapLayoutInfoProvider(az8Var, msfVar);
            zl2Var.updateRememberedValue(objRememberedValue);
        }
        kng kngVarRememberSnapFlingBehavior = ksf.rememberSnapFlingBehavior((lsf) objRememberedValue, zl2Var, 0);
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
        return kngVarRememberSnapFlingBehavior;
    }

    public static final int sizeOnMainAxis(@yfb xx8 xx8Var, @yfb t7c t7cVar) {
        return t7cVar == t7c.Vertical ? r78.m32086getHeightimpl(xx8Var.mo30417getSizeYbymL2g()) : r78.m32087getWidthimpl(xx8Var.mo30417getSizeYbymL2g());
    }
}
