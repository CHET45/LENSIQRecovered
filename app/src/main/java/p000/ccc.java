package p000;

import java.util.List;
import p000.rv5;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nPagerSnapLayoutInfoProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagerSnapLayoutInfoProvider.kt\nandroidx/compose/foundation/gestures/snapping/PagerSnapLayoutInfoProviderKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,306:1\n218#1,4:307\n218#1,4:312\n218#1,4:316\n218#1,4:320\n218#1,4:324\n1#2:311\n*S KotlinDebug\n*F\n+ 1 PagerSnapLayoutInfoProvider.kt\nandroidx/compose/foundation/gestures/snapping/PagerSnapLayoutInfoProviderKt\n*L\n246#1:307,4\n269#1:312,4\n279#1:316,4\n287#1:320,4\n291#1:324,4\n*E\n"})
public final class ccc {

    /* JADX INFO: renamed from: ccc$a */
    @dwf({"SMAP\nPagerSnapLayoutInfoProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagerSnapLayoutInfoProvider.kt\nandroidx/compose/foundation/gestures/snapping/PagerSnapLayoutInfoProviderKt$SnapLayoutInfoProvider$1\n+ 2 PagerSnapLayoutInfoProvider.kt\nandroidx/compose/foundation/gestures/snapping/PagerSnapLayoutInfoProviderKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,306:1\n218#2,4:307\n218#2,4:311\n218#2,4:315\n218#2,4:319\n218#2,4:323\n218#2,4:327\n218#2,4:331\n218#2,4:335\n218#2,4:339\n33#3,6:343\n*S KotlinDebug\n*F\n+ 1 PagerSnapLayoutInfoProvider.kt\nandroidx/compose/foundation/gestures/snapping/PagerSnapLayoutInfoProviderKt$SnapLayoutInfoProvider$1\n*L\n64#1:307,4\n77#1:311,4\n92#1:315,4\n101#1:319,4\n107#1:323,4\n118#1:327,4\n124#1:331,4\n137#1:335,4\n142#1:339,4\n146#1:343,6\n*E\n"})
    public static final class C2266a implements lsf {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ dcc f16238a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ kz6<Float, Float, Float, Float> f16239b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ zbc f16240c;

        /* JADX WARN: Multi-variable type inference failed */
        public C2266a(dcc dccVar, kz6<? super Float, ? super Float, ? super Float, Float> kz6Var, zbc zbcVar) {
            this.f16238a = dccVar;
            this.f16239b = kz6Var;
            this.f16240c = zbcVar;
        }

        private final scc<Float, Float> searchForSnappingBounds(msf msfVar) {
            float f;
            List<bbc> visiblePagesInfo = getLayoutInfo().getVisiblePagesInfo();
            dcc dccVar = this.f16238a;
            int size = visiblePagesInfo.size();
            float f2 = Float.NEGATIVE_INFINITY;
            float f3 = Float.POSITIVE_INFINITY;
            int i = 0;
            while (true) {
                f = 0.0f;
                if (i >= size) {
                    break;
                }
                bbc bbcVar = visiblePagesInfo.get(i);
                float fCalculateDistanceToDesiredSnapPosition = nsf.calculateDistanceToDesiredSnapPosition(nbc.getMainAxisViewportSize(getLayoutInfo()), getLayoutInfo().getBeforeContentPadding(), getLayoutInfo().getAfterContentPadding(), getLayoutInfo().getPageSize(), bbcVar.getOffset(), bbcVar.getIndex(), msfVar, dccVar.getPageCount());
                if (fCalculateDistanceToDesiredSnapPosition <= 0.0f && fCalculateDistanceToDesiredSnapPosition > f2) {
                    f2 = fCalculateDistanceToDesiredSnapPosition;
                }
                if (fCalculateDistanceToDesiredSnapPosition >= 0.0f && fCalculateDistanceToDesiredSnapPosition < f3) {
                    f3 = fCalculateDistanceToDesiredSnapPosition;
                }
                i++;
            }
            if (f2 == Float.NEGATIVE_INFINITY) {
                f2 = f3;
            }
            if (f3 == Float.POSITIVE_INFINITY) {
                f3 = f2;
            }
            boolean z = ccc.dragGestureDelta(this.f16238a) == 0.0f;
            if (!this.f16238a.getCanScrollForward()) {
                if (z || !ccc.isScrollingForward(this.f16238a)) {
                    f3 = 0.0f;
                } else {
                    f2 = 0.0f;
                    f3 = 0.0f;
                }
            }
            if (this.f16238a.getCanScrollBackward()) {
                f = f2;
            } else if (!z && !ccc.isScrollingForward(this.f16238a)) {
                f3 = 0.0f;
            }
            return vkh.m24050to(Float.valueOf(f), Float.valueOf(f3));
        }

        @Override // p000.lsf
        public float calculateApproachOffset(float f, float f2) {
            int pageSize$foundation_release = this.f16238a.getPageSize$foundation_release() + this.f16238a.getPageSpacing$foundation_release();
            if (pageSize$foundation_release == 0) {
                return 0.0f;
            }
            int firstVisiblePage$foundation_release = f < 0.0f ? this.f16238a.getFirstVisiblePage$foundation_release() + 1 : this.f16238a.getFirstVisiblePage$foundation_release();
            int iCoerceAtLeast = kpd.coerceAtLeast(Math.abs((kpd.coerceIn(this.f16240c.calculateTargetPage(firstVisiblePage$foundation_release, kpd.coerceIn(((int) (f2 / pageSize$foundation_release)) + firstVisiblePage$foundation_release, 0, this.f16238a.getPageCount()), f, this.f16238a.getPageSize$foundation_release(), this.f16238a.getPageSpacing$foundation_release()), 0, this.f16238a.getPageCount()) - firstVisiblePage$foundation_release) * pageSize$foundation_release) - pageSize$foundation_release, 0);
            if (iCoerceAtLeast == 0) {
                return iCoerceAtLeast;
            }
            return Math.signum(f) * iCoerceAtLeast;
        }

        @Override // p000.lsf
        public float calculateSnapOffset(float f) {
            scc<Float, Float> sccVarSearchForSnappingBounds = searchForSnappingBounds(this.f16238a.getLayoutInfo().getSnapPosition());
            float fFloatValue = sccVarSearchForSnappingBounds.component1().floatValue();
            float fFloatValue2 = sccVarSearchForSnappingBounds.component2().floatValue();
            float fFloatValue3 = this.f16239b.invoke(Float.valueOf(f), Float.valueOf(fFloatValue), Float.valueOf(fFloatValue2)).floatValue();
            if (fFloatValue3 == fFloatValue || fFloatValue3 == fFloatValue2 || fFloatValue3 == 0.0f) {
                if (isValidDistance(fFloatValue3)) {
                    return fFloatValue3;
                }
                return 0.0f;
            }
            throw new IllegalStateException(("Final Snapping Offset Should Be one of " + fFloatValue + ", " + fFloatValue2 + " or 0.0").toString());
        }

        @yfb
        public final mbc getLayoutInfo() {
            return this.f16238a.getLayoutInfo();
        }

        public final boolean isValidDistance(float f) {
            return (f == Float.POSITIVE_INFINITY || f == Float.NEGATIVE_INFINITY) ? false : true;
        }
    }

    @yfb
    public static final lsf SnapLayoutInfoProvider(@yfb dcc dccVar, @yfb zbc zbcVar, @yfb kz6<? super Float, ? super Float, ? super Float, Float> kz6Var) {
        return new C2266a(dccVar, kz6Var, zbcVar);
    }

    public static final float calculateFinalSnappingBound(@yfb dcc dccVar, @yfb ov8 ov8Var, float f, float f2, float f3, float f4) {
        boolean zIsScrollingForward = (dccVar.getLayoutInfo().getOrientation() == t7c.Vertical || ov8Var == ov8.Ltr) ? isScrollingForward(dccVar) : !isScrollingForward(dccVar);
        int pageSize = dccVar.getLayoutInfo().getPageSize();
        float fDragGestureDelta = pageSize == 0 ? 0.0f : dragGestureDelta(dccVar) / pageSize;
        float f5 = fDragGestureDelta - ((int) fDragGestureDelta);
        int iCalculateFinalSnappingItem = l19.calculateFinalSnappingItem(dccVar.getDensity$foundation_release(), f2);
        rv5.C12314a c12314a = rv5.f79730b;
        if (rv5.m32214equalsimpl0(iCalculateFinalSnappingItem, c12314a.m32218getClosestItembbeMdSM())) {
            if (Math.abs(f5) > f) {
                if (!zIsScrollingForward) {
                    return f3;
                }
            } else if (Math.abs(fDragGestureDelta) >= Math.abs(dccVar.getPositionThresholdFraction$foundation_release())) {
                if (zIsScrollingForward) {
                    return f3;
                }
            } else if (Math.abs(f3) < Math.abs(f4)) {
                return f3;
            }
        } else if (!rv5.m32214equalsimpl0(iCalculateFinalSnappingItem, c12314a.m32219getNextItembbeMdSM())) {
            if (rv5.m32214equalsimpl0(iCalculateFinalSnappingItem, c12314a.m32220getPreviousItembbeMdSM())) {
                return f3;
            }
            return 0.0f;
        }
        return f4;
    }

    private static final void debugLog(ny6<String> ny6Var) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float dragGestureDelta(dcc dccVar) {
        return dccVar.getLayoutInfo().getOrientation() == t7c.Horizontal ? izb.m30429getXimpl(dccVar.m28638getUpDownDifferenceF1C5BW0$foundation_release()) : izb.m30430getYimpl(dccVar.m28638getUpDownDifferenceF1C5BW0$foundation_release());
    }

    private static final boolean isLtrDragging(dcc dccVar) {
        return dragGestureDelta(dccVar) > 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isScrollingForward(dcc dccVar) {
        boolean reverseLayout = dccVar.getLayoutInfo().getReverseLayout();
        return (isLtrDragging(dccVar) && reverseLayout) || !(isLtrDragging(dccVar) || reverseLayout);
    }
}
