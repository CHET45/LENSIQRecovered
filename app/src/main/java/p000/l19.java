package p000;

import java.util.Iterator;
import java.util.List;
import p000.msf;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nLazyListSnapLayoutInfoProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListSnapLayoutInfoProvider.kt\nandroidx/compose/foundation/gestures/snapping/LazyListSnapLayoutInfoProviderKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,146:1\n1223#2,6:147\n*S KotlinDebug\n*F\n+ 1 LazyListSnapLayoutInfoProvider.kt\nandroidx/compose/foundation/gestures/snapping/LazyListSnapLayoutInfoProviderKt\n*L\n118#1:147,6\n*E\n"})
public final class l19 {

    /* JADX INFO: renamed from: l19$a */
    @dwf({"SMAP\nLazyListSnapLayoutInfoProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListSnapLayoutInfoProvider.kt\nandroidx/compose/foundation/gestures/snapping/LazyListSnapLayoutInfoProviderKt$SnapLayoutInfoProvider$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,146:1\n33#2,6:147\n1#3:153\n*S KotlinDebug\n*F\n+ 1 LazyListSnapLayoutInfoProvider.kt\nandroidx/compose/foundation/gestures/snapping/LazyListSnapLayoutInfoProviderKt$SnapLayoutInfoProvider$1\n*L\n70#1:147,6\n*E\n"})
    public static final class C8574a implements lsf {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ m19 f55936a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ msf f55937b;

        public C8574a(m19 m19Var, msf msfVar) {
            this.f55936a = m19Var;
            this.f55937b = msfVar;
        }

        private final int getAverageItemSize() {
            y09 layoutInfo = getLayoutInfo();
            int size = 0;
            if (layoutInfo.getVisibleItemsInfo().isEmpty()) {
                return 0;
            }
            int size2 = layoutInfo.getVisibleItemsInfo().size();
            Iterator<T> it = layoutInfo.getVisibleItemsInfo().iterator();
            while (it.hasNext()) {
                size += ((t09) it.next()).getSize();
            }
            return size / size2;
        }

        private final y09 getLayoutInfo() {
            return this.f55936a.getLayoutInfo();
        }

        @Override // p000.lsf
        public float calculateApproachOffset(float f, float f2) {
            return kpd.coerceAtLeast(Math.abs(f2) - getAverageItemSize(), 0.0f) * Math.signum(f2);
        }

        @Override // p000.lsf
        public float calculateSnapOffset(float f) {
            List<t09> visibleItemsInfo = getLayoutInfo().getVisibleItemsInfo();
            msf msfVar = this.f55937b;
            int size = visibleItemsInfo.size();
            float f2 = Float.NEGATIVE_INFINITY;
            float f3 = Float.POSITIVE_INFINITY;
            for (int i = 0; i < size; i++) {
                t09 t09Var = visibleItemsInfo.get(i);
                float fCalculateDistanceToDesiredSnapPosition = nsf.calculateDistanceToDesiredSnapPosition(l19.getSingleAxisViewportSize(getLayoutInfo()), getLayoutInfo().getBeforeContentPadding(), getLayoutInfo().getAfterContentPadding(), t09Var.getSize(), t09Var.getOffset(), t09Var.getIndex(), msfVar, getLayoutInfo().getTotalItemsCount());
                if (fCalculateDistanceToDesiredSnapPosition <= 0.0f && fCalculateDistanceToDesiredSnapPosition > f2) {
                    f2 = fCalculateDistanceToDesiredSnapPosition;
                }
                if (fCalculateDistanceToDesiredSnapPosition >= 0.0f && fCalculateDistanceToDesiredSnapPosition < f3) {
                    f3 = fCalculateDistanceToDesiredSnapPosition;
                }
            }
            return ksf.m30748calculateFinalOffsetFhqu1e0(l19.calculateFinalSnappingItem(this.f55936a.getDensity$foundation_release(), f), f2, f3);
        }
    }

    @yfb
    public static final lsf SnapLayoutInfoProvider(@yfb m19 m19Var, @yfb msf msfVar) {
        return new C8574a(m19Var, msfVar);
    }

    public static /* synthetic */ lsf SnapLayoutInfoProvider$default(m19 m19Var, msf msfVar, int i, Object obj) {
        if ((i & 2) != 0) {
            msfVar = msf.C9499a.f61956a;
        }
        return SnapLayoutInfoProvider(m19Var, msfVar);
    }

    public static final int calculateFinalSnappingItem(@yfb c64 c64Var, float f) {
        return Math.abs(f) < c64Var.mo27173toPx0680j_4(ksf.getMinFlingVelocityDp()) ? rv5.f79730b.m32218getClosestItembbeMdSM() : f > 0.0f ? rv5.f79730b.m32219getNextItembbeMdSM() : rv5.f79730b.m32220getPreviousItembbeMdSM();
    }

    public static final int getSingleAxisViewportSize(@yfb y09 y09Var) {
        return y09Var.getOrientation() == t7c.Vertical ? r78.m32086getHeightimpl(y09Var.mo27179getViewportSizeYbymL2g()) : r78.m32087getWidthimpl(y09Var.mo27179getViewportSizeYbymL2g());
    }

    @yfb
    @hk2
    public static final s36 rememberSnapFlingBehavior(@yfb m19 m19Var, @gib msf msfVar, @gib zl2 zl2Var, int i, int i2) {
        if ((i2 & 2) != 0) {
            msfVar = msf.C9499a.f61956a;
        }
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(-338621290, i, -1, "androidx.compose.foundation.gestures.snapping.rememberSnapFlingBehavior (LazyListSnapLayoutInfoProvider.kt:115)");
        }
        boolean z = (((i & 14) ^ 6) > 4 && zl2Var.changed(m19Var)) || (i & 6) == 4;
        Object objRememberedValue = zl2Var.rememberedValue();
        if (z || objRememberedValue == zl2.f105372a.getEmpty()) {
            objRememberedValue = SnapLayoutInfoProvider(m19Var, msfVar);
            zl2Var.updateRememberedValue(objRememberedValue);
        }
        kng kngVarRememberSnapFlingBehavior = ksf.rememberSnapFlingBehavior((lsf) objRememberedValue, zl2Var, 0);
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
        return kngVarRememberSnapFlingBehavior;
    }
}
