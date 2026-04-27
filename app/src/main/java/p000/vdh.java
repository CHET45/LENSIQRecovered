package p000;

import java.util.List;
import p000.izb;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nTransformGestureDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransformGestureDetector.kt\nandroidx/compose/foundation/gestures/TransformGestureDetectorKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,255:1\n132#2,3:256\n33#2,4:259\n135#2,2:263\n38#2:265\n137#2:266\n33#2,6:267\n33#2,6:273\n33#2,6:279\n*S KotlinDebug\n*F\n+ 1 TransformGestureDetector.kt\nandroidx/compose/foundation/gestures/TransformGestureDetectorKt\n*L\n116#1:256,3\n116#1:259,4\n116#1:263,2\n116#1:265\n116#1:266\n131#1:267,6\n216#1:273,6\n242#1:279,6\n*E\n"})
public final class vdh {

    /* JADX INFO: renamed from: vdh$a */
    @ck3(m4009c = "androidx.compose.foundation.gestures.TransformGestureDetectorKt$detectTransformGestures$2", m4010f = "TransformGestureDetector.kt", m4011i = {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1}, m4012l = {59, 61}, m4013m = "invokeSuspend", m4014n = {"$this$awaitEachGesture", dq8.f30369i, "zoom", "pan", "pastTouchSlop", "touchSlop", "lockedToPanZoom", "$this$awaitEachGesture", dq8.f30369i, "zoom", "pan", "pastTouchSlop", "touchSlop", "lockedToPanZoom"}, m4015s = {"L$0", "F$0", "F$1", "J$0", "I$0", "F$2", "I$1", "L$0", "F$0", "F$1", "J$0", "I$0", "F$2", "I$1"})
    @dwf({"SMAP\nTransformGestureDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransformGestureDetector.kt\nandroidx/compose/foundation/gestures/TransformGestureDetectorKt$detectTransformGestures$2\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,255:1\n101#2,2:256\n33#2,6:258\n103#2:264\n33#2,6:265\n101#2,2:271\n33#2,6:273\n103#2:279\n*S KotlinDebug\n*F\n+ 1 TransformGestureDetector.kt\nandroidx/compose/foundation/gestures/TransformGestureDetectorKt$detectTransformGestures$2\n*L\n62#1:256,2\n62#1:258,6\n62#1:264\n96#1:265,6\n103#1:271,2\n103#1:273,6\n103#1:279\n*E\n"})
    public static final class C14011a extends t7e implements gz6<gn0, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: C */
        public /* synthetic */ Object f90746C;

        /* JADX INFO: renamed from: F */
        public final /* synthetic */ boolean f90747F;

        /* JADX INFO: renamed from: H */
        public final /* synthetic */ oz6<izb, izb, Float, Float, bth> f90748H;

        /* JADX INFO: renamed from: a */
        public float f90749a;

        /* JADX INFO: renamed from: b */
        public float f90750b;

        /* JADX INFO: renamed from: c */
        public float f90751c;

        /* JADX INFO: renamed from: d */
        public long f90752d;

        /* JADX INFO: renamed from: e */
        public int f90753e;

        /* JADX INFO: renamed from: f */
        public int f90754f;

        /* JADX INFO: renamed from: m */
        public int f90755m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C14011a(boolean z, oz6<? super izb, ? super izb, ? super Float, ? super Float, bth> oz6Var, zy2<? super C14011a> zy2Var) {
            super(2, zy2Var);
            this.f90747F = z;
            this.f90748H = oz6Var;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            C14011a c14011a = new C14011a(this.f90747F, this.f90748H, zy2Var);
            c14011a.f90746C = obj;
            return c14011a;
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb gn0 gn0Var, @gib zy2<? super bth> zy2Var) {
            return ((C14011a) create(gn0Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x00ad  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x00c1  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x0120  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x016a  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x017c  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x0186  */
        /* JADX WARN: Removed duplicated region for block: B:67:0x0192  */
        /* JADX WARN: Removed duplicated region for block: B:75:0x00be A[SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x009d -> B:17:0x00a0). Please report as a decompilation issue!!! */
        @Override // p000.tq0
        @p000.gib
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(@p000.yfb java.lang.Object r26) {
            /*
                Method dump skipped, instruction units count: 442
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.vdh.C14011a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: angle-k-4lQ0M, reason: not valid java name */
    private static final float m32763anglek4lQ0M(long j) {
        if (izb.m30429getXimpl(j) == 0.0f && izb.m30430getYimpl(j) == 0.0f) {
            return 0.0f;
        }
        return ((-((float) Math.atan2(izb.m30429getXimpl(j), izb.m30430getYimpl(j)))) * 180.0f) / 3.1415927f;
    }

    public static final long calculateCentroid(@yfb t1d t1dVar, boolean z) {
        long jM30445getZeroF1C5BW0 = izb.f49009b.m30445getZeroF1C5BW0();
        List<h2d> changes = t1dVar.getChanges();
        int size = changes.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            h2d h2dVar = changes.get(i2);
            if (h2dVar.getPressed() && h2dVar.getPreviousPressed()) {
                jM30445getZeroF1C5BW0 = izb.m30434plusMKHz9U(jM30445getZeroF1C5BW0, z ? h2dVar.m29911getPositionF1C5BW0() : h2dVar.m29912getPreviousPositionF1C5BW0());
                i++;
            }
        }
        return i == 0 ? izb.f49009b.m30444getUnspecifiedF1C5BW0() : izb.m30424divtuRUvjQ(jM30445getZeroF1C5BW0, i);
    }

    public static /* synthetic */ long calculateCentroid$default(t1d t1dVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return calculateCentroid(t1dVar, z);
    }

    public static final float calculateCentroidSize(@yfb t1d t1dVar, boolean z) {
        long jCalculateCentroid = calculateCentroid(t1dVar, z);
        float fM30427getDistanceimpl = 0.0f;
        if (izb.m30426equalsimpl0(jCalculateCentroid, izb.f49009b.m30444getUnspecifiedF1C5BW0())) {
            return 0.0f;
        }
        List<h2d> changes = t1dVar.getChanges();
        int size = changes.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            h2d h2dVar = changes.get(i2);
            if (h2dVar.getPressed() && h2dVar.getPreviousPressed()) {
                fM30427getDistanceimpl += izb.m30427getDistanceimpl(izb.m30433minusMKHz9U(z ? h2dVar.m29911getPositionF1C5BW0() : h2dVar.m29912getPreviousPositionF1C5BW0(), jCalculateCentroid));
                i++;
            }
        }
        return fM30427getDistanceimpl / i;
    }

    public static /* synthetic */ float calculateCentroidSize$default(t1d t1dVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return calculateCentroidSize(t1dVar, z);
    }

    public static final long calculatePan(@yfb t1d t1dVar) {
        long jCalculateCentroid = calculateCentroid(t1dVar, true);
        izb.C7673a c7673a = izb.f49009b;
        return izb.m30426equalsimpl0(jCalculateCentroid, c7673a.m30444getUnspecifiedF1C5BW0()) ? c7673a.m30445getZeroF1C5BW0() : izb.m30433minusMKHz9U(jCalculateCentroid, calculateCentroid(t1dVar, false));
    }

    public static final float calculateRotation(@yfb t1d t1dVar) {
        List<h2d> changes = t1dVar.getChanges();
        int size = changes.size();
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = 1;
            if (i >= size) {
                break;
            }
            h2d h2dVar = changes.get(i);
            if (!h2dVar.getPreviousPressed() || !h2dVar.getPressed()) {
                i3 = 0;
            }
            i2 += i3;
            i++;
        }
        if (i2 < 2) {
            return 0.0f;
        }
        long jCalculateCentroid = calculateCentroid(t1dVar, true);
        long jCalculateCentroid2 = calculateCentroid(t1dVar, false);
        List<h2d> changes2 = t1dVar.getChanges();
        int size2 = changes2.size();
        float f = 0.0f;
        float f2 = 0.0f;
        for (int i4 = 0; i4 < size2; i4++) {
            h2d h2dVar2 = changes2.get(i4);
            if (h2dVar2.getPressed() && h2dVar2.getPreviousPressed()) {
                long jM29911getPositionF1C5BW0 = h2dVar2.m29911getPositionF1C5BW0();
                long jM30433minusMKHz9U = izb.m30433minusMKHz9U(h2dVar2.m29912getPreviousPositionF1C5BW0(), jCalculateCentroid2);
                long jM30433minusMKHz9U2 = izb.m30433minusMKHz9U(jM29911getPositionF1C5BW0, jCalculateCentroid);
                float fM32763anglek4lQ0M = m32763anglek4lQ0M(jM30433minusMKHz9U2) - m32763anglek4lQ0M(jM30433minusMKHz9U);
                float fM30427getDistanceimpl = izb.m30427getDistanceimpl(izb.m30434plusMKHz9U(jM30433minusMKHz9U2, jM30433minusMKHz9U)) / 2.0f;
                if (fM32763anglek4lQ0M > 180.0f) {
                    fM32763anglek4lQ0M -= 360.0f;
                } else if (fM32763anglek4lQ0M < -180.0f) {
                    fM32763anglek4lQ0M += 360.0f;
                }
                f2 += fM32763anglek4lQ0M * fM30427getDistanceimpl;
                f += fM30427getDistanceimpl;
            }
        }
        if (f == 0.0f) {
            return 0.0f;
        }
        return f2 / f;
    }

    public static final float calculateZoom(@yfb t1d t1dVar) {
        float fCalculateCentroidSize = calculateCentroidSize(t1dVar, true);
        float fCalculateCentroidSize2 = calculateCentroidSize(t1dVar, false);
        if (fCalculateCentroidSize == 0.0f || fCalculateCentroidSize2 == 0.0f) {
            return 1.0f;
        }
        return fCalculateCentroidSize / fCalculateCentroidSize2;
    }

    @gib
    public static final Object detectTransformGestures(@yfb s2d s2dVar, boolean z, @yfb oz6<? super izb, ? super izb, ? super Float, ? super Float, bth> oz6Var, @yfb zy2<? super bth> zy2Var) {
        Object objAwaitEachGesture = op6.awaitEachGesture(s2dVar, new C14011a(z, oz6Var, null), zy2Var);
        return objAwaitEachGesture == pd8.getCOROUTINE_SUSPENDED() ? objAwaitEachGesture : bth.f14751a;
    }

    public static /* synthetic */ Object detectTransformGestures$default(s2d s2dVar, boolean z, oz6 oz6Var, zy2 zy2Var, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return detectTransformGestures(s2dVar, z, oz6Var, zy2Var);
    }
}
