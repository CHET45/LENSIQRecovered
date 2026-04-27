package p000;

import p000.jvd;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nSnapFlingBehavior.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapFlingBehavior.kt\nandroidx/compose/foundation/gestures/snapping/SnapFlingBehaviorKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,507:1\n503#1,4:515\n503#1,4:519\n503#1,4:523\n77#2:508\n1223#3,6:509\n148#4:527\n*S KotlinDebug\n*F\n+ 1 SnapFlingBehavior.kt\nandroidx/compose/foundation/gestures/snapping/SnapFlingBehaviorKt\n*L\n351#1:515,4\n395#1:519,4\n477#1:523,4\n258#1:508\n260#1:509,6\n463#1:527\n*E\n"})
public final class ksf {

    /* JADX INFO: renamed from: a */
    public static final float f55243a = kn4.m30705constructorimpl(400);

    /* JADX INFO: renamed from: b */
    public static final float f55244b = 0.0f;

    /* JADX INFO: renamed from: c */
    public static final float f55245c = 0.0f;

    /* JADX INFO: renamed from: d */
    public static final boolean f55246d = false;

    /* JADX INFO: renamed from: ksf$a */
    @ck3(m4009c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt", m4010f = "SnapFlingBehavior.kt", m4011i = {0, 0, 0}, m4012l = {334}, m4013m = "animateDecay", m4014n = {"animationState", "previousValue", "targetOffset"}, m4015s = {"L$0", "L$1", "F$0"})
    public static final class C8513a extends cz2 {

        /* JADX INFO: renamed from: a */
        public float f55247a;

        /* JADX INFO: renamed from: b */
        public Object f55248b;

        /* JADX INFO: renamed from: c */
        public Object f55249c;

        /* JADX INFO: renamed from: d */
        public /* synthetic */ Object f55250d;

        /* JADX INFO: renamed from: e */
        public int f55251e;

        public C8513a(zy2<? super C8513a> zy2Var) {
            super(zy2Var);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f55250d = obj;
            this.f55251e |= Integer.MIN_VALUE;
            return ksf.animateDecay(null, 0.0f, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: ksf$b */
    public static final class C8514b extends tt8 implements qy6<C10714oy<Float, C14294vy>, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ float f55252a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ jvd.C8118e f55253b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ vre f55254c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ qy6<Float, bth> f55255d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C8514b(float f, jvd.C8118e c8118e, vre vreVar, qy6<? super Float, bth> qy6Var) {
            super(1);
            this.f55252a = f;
            this.f55253b = c8118e;
            this.f55254c = vreVar;
            this.f55255d = qy6Var;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(C10714oy<Float, C14294vy> c10714oy) {
            invoke2(c10714oy);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb C10714oy<Float, C14294vy> c10714oy) {
            if (Math.abs(c10714oy.getValue().floatValue()) < Math.abs(this.f55252a)) {
                ksf.animateDecay$consumeDelta(c10714oy, this.f55254c, this.f55255d, c10714oy.getValue().floatValue() - this.f55253b.f52107a);
                this.f55253b.f52107a = c10714oy.getValue().floatValue();
                return;
            }
            float fCoerceToTarget = ksf.coerceToTarget(c10714oy.getValue().floatValue(), this.f55252a);
            ksf.animateDecay$consumeDelta(c10714oy, this.f55254c, this.f55255d, fCoerceToTarget - this.f55253b.f52107a);
            c10714oy.cancelAnimation();
            this.f55253b.f52107a = fCoerceToTarget;
        }
    }

    /* JADX INFO: renamed from: ksf$c */
    @ck3(m4009c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt", m4010f = "SnapFlingBehavior.kt", m4011i = {0, 0, 0, 0}, m4012l = {379}, m4013m = "animateWithTarget", m4014n = {"animationState", "consumedUpToNow", "targetOffset", "initialVelocity"}, m4015s = {"L$0", "L$1", "F$0", "F$1"})
    public static final class C8515c extends cz2 {

        /* JADX INFO: renamed from: a */
        public float f55256a;

        /* JADX INFO: renamed from: b */
        public float f55257b;

        /* JADX INFO: renamed from: c */
        public Object f55258c;

        /* JADX INFO: renamed from: d */
        public Object f55259d;

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f55260e;

        /* JADX INFO: renamed from: f */
        public int f55261f;

        public C8515c(zy2<? super C8515c> zy2Var) {
            super(zy2Var);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f55260e = obj;
            this.f55261f |= Integer.MIN_VALUE;
            return ksf.animateWithTarget(null, 0.0f, 0.0f, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: ksf$d */
    public static final class C8516d extends tt8 implements qy6<C10714oy<Float, C14294vy>, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ float f55262a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ jvd.C8118e f55263b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ vre f55264c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ qy6<Float, bth> f55265d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C8516d(float f, jvd.C8118e c8118e, vre vreVar, qy6<? super Float, bth> qy6Var) {
            super(1);
            this.f55262a = f;
            this.f55263b = c8118e;
            this.f55264c = vreVar;
            this.f55265d = qy6Var;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(C10714oy<Float, C14294vy> c10714oy) {
            invoke2(c10714oy);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb C10714oy<Float, C14294vy> c10714oy) {
            float fCoerceToTarget = ksf.coerceToTarget(c10714oy.getValue().floatValue(), this.f55262a);
            float f = fCoerceToTarget - this.f55263b.f52107a;
            float fScrollBy = this.f55264c.scrollBy(f);
            this.f55265d.invoke(Float.valueOf(fScrollBy));
            if (Math.abs(f - fScrollBy) > 0.5f || fCoerceToTarget != c10714oy.getValue().floatValue()) {
                c10714oy.cancelAnimation();
            }
            this.f55263b.f52107a += fScrollBy;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object animateDecay(p000.vre r5, float r6, p000.C12364ry<java.lang.Float, p000.C14294vy> r7, p000.vk3<java.lang.Float> r8, p000.qy6<? super java.lang.Float, p000.bth> r9, p000.zy2<? super p000.C9609my<java.lang.Float, p000.C14294vy>> r10) {
        /*
            boolean r0 = r10 instanceof p000.ksf.C8513a
            if (r0 == 0) goto L13
            r0 = r10
            ksf$a r0 = (p000.ksf.C8513a) r0
            int r1 = r0.f55251e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f55251e = r1
            goto L18
        L13:
            ksf$a r0 = new ksf$a
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f55250d
            java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
            int r2 = r0.f55251e
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            float r6 = r0.f55247a
            java.lang.Object r5 = r0.f55249c
            jvd$e r5 = (p000.jvd.C8118e) r5
            java.lang.Object r7 = r0.f55248b
            ry r7 = (p000.C12364ry) r7
            p000.y7e.throwOnFailure(r10)
            goto L6b
        L33:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3b:
            p000.y7e.throwOnFailure(r10)
            jvd$e r10 = new jvd$e
            r10.<init>()
            java.lang.Object r2 = r7.getVelocity()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L54
            r2 = r3
            goto L55
        L54:
            r2 = 0
        L55:
            r2 = r2 ^ r3
            ksf$b r4 = new ksf$b
            r4.<init>(r6, r10, r5, r9)
            r0.f55248b = r7
            r0.f55249c = r10
            r0.f55247a = r6
            r0.f55251e = r3
            java.lang.Object r5 = p000.rgg.animateDecay(r7, r8, r2, r4, r0)
            if (r5 != r1) goto L6a
            return r1
        L6a:
            r5 = r10
        L6b:
            my r8 = new my
            float r5 = r5.f52107a
            float r6 = r6 - r5
            java.lang.Float r5 = p000.wc1.boxFloat(r6)
            r8.<init>(r5, r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ksf.animateDecay(vre, float, ry, vk3, qy6, zy2):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animateDecay$consumeDelta(C10714oy<Float, C14294vy> c10714oy, vre vreVar, qy6<? super Float, bth> qy6Var, float f) {
        float fScrollBy = vreVar.scrollBy(f);
        qy6Var.invoke(Float.valueOf(fScrollBy));
        if (Math.abs(f - fScrollBy) > 0.5f) {
            c10714oy.cancelAnimation();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object animateWithTarget(p000.vre r12, float r13, float r14, p000.C12364ry<java.lang.Float, p000.C14294vy> r15, p000.InterfaceC11178py<java.lang.Float> r16, p000.qy6<? super java.lang.Float, p000.bth> r17, p000.zy2<? super p000.C9609my<java.lang.Float, p000.C14294vy>> r18) {
        /*
            r0 = r18
            boolean r1 = r0 instanceof p000.ksf.C8515c
            if (r1 == 0) goto L16
            r1 = r0
            ksf$c r1 = (p000.ksf.C8515c) r1
            int r2 = r1.f55261f
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 - r3
            r1.f55261f = r2
        L14:
            r7 = r1
            goto L1c
        L16:
            ksf$c r1 = new ksf$c
            r1.<init>(r0)
            goto L14
        L1c:
            java.lang.Object r0 = r7.f55260e
            java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
            int r2 = r7.f55261f
            r3 = 1
            if (r2 == 0) goto L43
            if (r2 != r3) goto L3b
            float r1 = r7.f55257b
            float r2 = r7.f55256a
            java.lang.Object r3 = r7.f55259d
            jvd$e r3 = (p000.jvd.C8118e) r3
            java.lang.Object r4 = r7.f55258c
            ry r4 = (p000.C12364ry) r4
            p000.y7e.throwOnFailure(r0)
            r10 = r2
            r0 = r4
            goto L90
        L3b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L43:
            p000.y7e.throwOnFailure(r0)
            jvd$e r0 = new jvd$e
            r0.<init>()
            java.lang.Object r2 = r15.getVelocity()
            java.lang.Number r2 = (java.lang.Number) r2
            float r8 = r2.floatValue()
            java.lang.Float r4 = p000.wc1.boxFloat(r13)
            java.lang.Object r2 = r15.getVelocity()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            r5 = 0
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 != 0) goto L6a
            r2 = r3
            goto L6b
        L6a:
            r2 = 0
        L6b:
            r5 = r2 ^ 1
            ksf$d r6 = new ksf$d
            r2 = r12
            r9 = r14
            r10 = r17
            r6.<init>(r14, r0, r12, r10)
            r9 = r15
            r7.f55258c = r9
            r7.f55259d = r0
            r10 = r13
            r7.f55256a = r10
            r7.f55257b = r8
            r7.f55261f = r3
            r2 = r15
            r3 = r4
            r4 = r16
            java.lang.Object r2 = p000.rgg.animateTo(r2, r3, r4, r5, r6, r7)
            if (r2 != r1) goto L8d
            return r1
        L8d:
            r3 = r0
            r1 = r8
            r0 = r9
        L90:
            java.lang.Object r2 = r0.getVelocity()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            float r2 = coerceToTarget(r2, r1)
            my r11 = new my
            float r1 = r3.f52107a
            float r10 = r10 - r1
            java.lang.Float r10 = p000.wc1.boxFloat(r10)
            r8 = 29
            r9 = 0
            r1 = 0
            r3 = 0
            r5 = 0
            r7 = 0
            ry r0 = p000.C12827sy.copy$default(r0, r1, r2, r3, r5, r7, r8, r9)
            r11.<init>(r10, r0)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ksf.animateWithTarget(vre, float, float, ry, py, qy6, zy2):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object approach(vre vreVar, float f, float f2, r40<Float, C14294vy> r40Var, qy6<? super Float, bth> qy6Var, zy2<? super C9609my<Float, C14294vy>> zy2Var) {
        return r40Var.approachAnimation(vreVar, wc1.boxFloat(f), wc1.boxFloat(f2), qy6Var, zy2Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX INFO: renamed from: calculateFinalOffset-Fhqu1e0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final float m30748calculateFinalOffsetFhqu1e0(int r3, float r4, float r5) {
        /*
            rv5$a r0 = p000.rv5.f79730b
            int r1 = r0.m32218getClosestItembbeMdSM()
            boolean r1 = p000.rv5.m32214equalsimpl0(r3, r1)
            r2 = 0
            if (r1 == 0) goto L1a
            float r3 = java.lang.Math.abs(r5)
            float r0 = java.lang.Math.abs(r4)
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 > 0) goto L32
            goto L24
        L1a:
            int r1 = r0.m32219getNextItembbeMdSM()
            boolean r1 = p000.rv5.m32214equalsimpl0(r3, r1)
            if (r1 == 0) goto L26
        L24:
            r4 = r5
            goto L32
        L26:
            int r5 = r0.m32220getPreviousItembbeMdSM()
            boolean r3 = p000.rv5.m32214equalsimpl0(r3, r5)
            if (r3 == 0) goto L31
            goto L32
        L31:
            r4 = r2
        L32:
            boolean r3 = calculateFinalOffset_Fhqu1e0$isValidDistance(r4)
            if (r3 == 0) goto L39
            r2 = r4
        L39:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ksf.m30748calculateFinalOffsetFhqu1e0(int, float, float):float");
    }

    private static final boolean calculateFinalOffset_Fhqu1e0$isValidDistance(float f) {
        return (f == Float.POSITIVE_INFINITY || f == Float.NEGATIVE_INFINITY) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float coerceToTarget(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        return f2 > 0.0f ? kpd.coerceAtMost(f, f2) : kpd.coerceAtLeast(f, f2);
    }

    private static final <T extends Comparable<? super T>> T component1(z52<T> z52Var) {
        return z52Var.getStart();
    }

    private static final <T extends Comparable<? super T>> T component2(z52<T> z52Var) {
        return z52Var.getEndInclusive();
    }

    private static final void debugLog(ny6<String> ny6Var) {
    }

    public static final float getMinFlingVelocityDp() {
        return f55243a;
    }

    @yfb
    @hk2
    public static final kng rememberSnapFlingBehavior(@yfb lsf lsfVar, @gib zl2 zl2Var, int i) {
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(-1921733134, i, -1, "androidx.compose.foundation.gestures.snapping.rememberSnapFlingBehavior (SnapFlingBehavior.kt:256)");
        }
        Object obj = (c64) zl2Var.consume(sn2.getLocalDensity());
        vk3 vk3VarRememberSplineBasedDecay = vyf.rememberSplineBasedDecay(zl2Var, 0);
        boolean zChanged = zl2Var.changed(vk3VarRememberSplineBasedDecay) | ((((i & 14) ^ 6) > 4 && zl2Var.changed(lsfVar)) || (i & 6) == 4) | zl2Var.changed(obj);
        Object objRememberedValue = zl2Var.rememberedValue();
        if (zChanged || objRememberedValue == zl2.f105372a.getEmpty()) {
            objRememberedValue = snapFlingBehavior(lsfVar, vk3VarRememberSplineBasedDecay, C11760qy.spring$default(0.0f, 400.0f, null, 5, null));
            zl2Var.updateRememberedValue(objRememberedValue);
        }
        kng kngVar = (kng) objRememberedValue;
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
        return kngVar;
    }

    @yfb
    public static final kng snapFlingBehavior(@yfb lsf lsfVar, @yfb vk3<Float> vk3Var, @yfb InterfaceC11178py<Float> interfaceC11178py) {
        return new jsf(lsfVar, vk3Var, interfaceC11178py);
    }
}
