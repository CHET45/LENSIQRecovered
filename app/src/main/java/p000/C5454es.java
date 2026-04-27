package p000;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;
import androidx.compose.p002ui.InterfaceC0701e;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.videoio.Videoio;

/* JADX INFO: renamed from: es */
/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nAndroidOverscroll.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidOverscroll.android.kt\nandroidx/compose/foundation/AndroidEdgeEffectOverscrollEffect\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n+ 3 AndroidOverscroll.android.kt\nandroidx/compose/foundation/EdgeEffectWrapper\n*L\n1#1,875:1\n135#2:876\n135#2:877\n806#3,5:878\n806#3,5:883\n*S KotlinDebug\n*F\n+ 1 AndroidOverscroll.android.kt\nandroidx/compose/foundation/AndroidEdgeEffectOverscrollEffect\n*L\n664#1:876\n674#1:877\n585#1:878,5\n691#1:883,5\n*E\n"})
@e0g(parameters = 1)
public final class C5454es implements w9c {

    /* JADX INFO: renamed from: i */
    public static final int f33923i = 0;

    /* JADX INFO: renamed from: a */
    @gib
    public izb f33924a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final yv4 f33925b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final z6b<bth> f33926c;

    /* JADX INFO: renamed from: d */
    public boolean f33927d;

    /* JADX INFO: renamed from: e */
    public boolean f33928e;

    /* JADX INFO: renamed from: f */
    public long f33929f;

    /* JADX INFO: renamed from: g */
    @gib
    public f2d f33930g;

    /* JADX INFO: renamed from: h */
    @yfb
    public final InterfaceC0701e f33931h;

    /* JADX INFO: renamed from: es$a */
    @ck3(m4009c = "androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect", m4010f = "AndroidOverscroll.android.kt", m4011i = {1, 1}, m4012l = {Videoio.CAP_PROP_XI_SENSOR_CLOCK_FREQ_INDEX, Videoio.CAP_PROP_XI_HDR}, m4013m = "applyToFling-BMRW4eQ", m4014n = {"this", "remainingVelocity"}, m4015s = {"L$0", "J$0"})
    public static final class a extends cz2 {

        /* JADX INFO: renamed from: a */
        public Object f33932a;

        /* JADX INFO: renamed from: b */
        public long f33933b;

        /* JADX INFO: renamed from: c */
        public /* synthetic */ Object f33934c;

        /* JADX INFO: renamed from: e */
        public int f33936e;

        public a(zy2<? super a> zy2Var) {
            super(zy2Var);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f33934c = obj;
            this.f33936e |= Integer.MIN_VALUE;
            return C5454es.this.mo28851applyToFlingBMRW4eQ(0L, null, this);
        }
    }

    /* JADX INFO: renamed from: es$b */
    @ck3(m4009c = "androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$effectModifier$1", m4010f = "AndroidOverscroll.android.kt", m4011i = {}, m4012l = {638}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class b extends ugg implements gz6<s2d, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f33937a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f33938b;

        /* JADX INFO: renamed from: es$b$a */
        @ck3(m4009c = "androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$effectModifier$1$1", m4010f = "AndroidOverscroll.android.kt", m4011i = {0, 1}, m4012l = {639, Imgcodecs.IMWRITE_JPEGXL_DECODING_SPEED}, m4013m = "invokeSuspend", m4014n = {"$this$awaitEachGesture", "$this$awaitEachGesture"}, m4015s = {"L$0", "L$0"})
        @dwf({"SMAP\nAndroidOverscroll.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidOverscroll.android.kt\nandroidx/compose/foundation/AndroidEdgeEffectOverscrollEffect$effectModifier$1$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,875:1\n235#2,3:876\n33#2,4:879\n238#2,2:883\n38#2:885\n240#2:886\n116#2,2:887\n33#2,6:889\n118#2:895\n*S KotlinDebug\n*F\n+ 1 AndroidOverscroll.android.kt\nandroidx/compose/foundation/AndroidEdgeEffectOverscrollEffect$effectModifier$1$1\n*L\n643#1:876,3\n643#1:879,4\n643#1:883,2\n643#1:885\n643#1:886\n647#1:887,2\n647#1:889,6\n647#1:895\n*E\n"})
        public static final class a extends t7e implements gz6<gn0, zy2<? super bth>, Object> {

            /* JADX INFO: renamed from: a */
            public int f33940a;

            /* JADX INFO: renamed from: b */
            public /* synthetic */ Object f33941b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ C5454es f33942c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C5454es c5454es, zy2<? super a> zy2Var) {
                super(2, zy2Var);
                this.f33942c = c5454es;
            }

            @Override // p000.tq0
            @yfb
            public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
                a aVar = new a(this.f33942c, zy2Var);
                aVar.f33941b = obj;
                return aVar;
            }

            @Override // p000.gz6
            @gib
            public final Object invoke(@yfb gn0 gn0Var, @gib zy2<? super bth> zy2Var) {
                return ((a) create(gn0Var, zy2Var)).invokeSuspend(bth.f14751a);
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0066 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:19:0x007e  */
            /* JADX WARN: Removed duplicated region for block: B:25:0x0099  */
            /* JADX WARN: Removed duplicated region for block: B:32:0x00b7  */
            /* JADX WARN: Removed duplicated region for block: B:34:0x00c0  */
            /* JADX WARN: Removed duplicated region for block: B:37:0x00e0  */
            /* JADX WARN: Removed duplicated region for block: B:42:0x00b2 A[SYNTHETIC] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0064 -> B:17:0x0067). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            @Override // p000.tq0
            @p000.gib
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(@p000.yfb java.lang.Object r13) {
                /*
                    Method dump skipped, instruction units count: 232
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: p000.C5454es.b.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public b(zy2<? super b> zy2Var) {
            super(2, zy2Var);
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            b bVar = C5454es.this.new b(zy2Var);
            bVar.f33938b = obj;
            return bVar;
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb s2d s2dVar, @gib zy2<? super bth> zy2Var) {
            return ((b) create(s2dVar, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f33937a;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                s2d s2dVar = (s2d) this.f33938b;
                a aVar = new a(C5454es.this, null);
                this.f33937a = 1;
                if (op6.awaitEachGesture(s2dVar, aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                y7e.throwOnFailure(obj);
            }
            return bth.f14751a;
        }
    }

    /* JADX INFO: renamed from: es$c */
    @dwf({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 AndroidOverscroll.android.kt\nandroidx/compose/foundation/AndroidEdgeEffectOverscrollEffect\n*L\n1#1,178:1\n665#2,3:179\n*E\n"})
    public static final class c extends tt8 implements qy6<f58, bth> {
        public c() {
            super(1);
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(f58 f58Var) {
            invoke2(f58Var);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb f58 f58Var) {
            f58Var.setName("overscroll");
            f58Var.setValue(C5454es.this);
        }
    }

    /* JADX INFO: renamed from: es$d */
    @dwf({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 AndroidOverscroll.android.kt\nandroidx/compose/foundation/AndroidEdgeEffectOverscrollEffect\n*L\n1#1,178:1\n675#2,3:179\n*E\n"})
    public static final class d extends tt8 implements qy6<f58, bth> {
        public d() {
            super(1);
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(f58 f58Var) {
            invoke2(f58Var);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb f58 f58Var) {
            f58Var.setName("overscroll");
            f58Var.setValue(C5454es.this);
        }
    }

    public C5454es(@yfb Context context, @yfb u9c u9cVar) {
        InterfaceC0701e dp4Var;
        yv4 yv4Var = new yv4(context, j92.m30490toArgb8_81llA(u9cVar.m32582getGlowColor0d7_KjU()));
        this.f33925b = yv4Var;
        bth bthVar = bth.f14751a;
        this.f33926c = stf.mutableStateOf(bthVar, stf.neverEqualPolicy());
        this.f33927d = true;
        this.f33929f = wpf.f95046b.m33078getZeroNHjbRc();
        InterfaceC0701e interfaceC0701ePointerInput = vgg.pointerInput(InterfaceC0701e.f5158d1, bthVar, new b(null));
        if (Build.VERSION.SDK_INT >= 31) {
            dp4Var = new qp4(this, yv4Var, c58.isDebugInspectorInfoEnabled() ? new c() : c58.getNoInspectorInfo());
        } else {
            dp4Var = new dp4(this, yv4Var, u9cVar, c58.isDebugInspectorInfoEnabled() ? new d() : c58.getNoInspectorInfo());
        }
        this.f33931h = interfaceC0701ePointerInput.then(dp4Var);
    }

    private final void animateToRelease() {
        boolean zIsFinished;
        yv4 yv4Var = this.f33925b;
        EdgeEffect edgeEffect = yv4Var.f103100d;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = edgeEffect.isFinished();
        } else {
            zIsFinished = false;
        }
        EdgeEffect edgeEffect2 = yv4Var.f103101e;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished = edgeEffect2.isFinished() || zIsFinished;
        }
        EdgeEffect edgeEffect3 = yv4Var.f103102f;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished = edgeEffect3.isFinished() || zIsFinished;
        }
        EdgeEffect edgeEffect4 = yv4Var.f103103g;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished = edgeEffect4.isFinished() || zIsFinished;
        }
        if (zIsFinished) {
            invalidateOverscroll$foundation_release();
        }
    }

    @fdi
    public static /* synthetic */ void getInvalidationEnabled$foundation_release$annotations() {
    }

    /* JADX INFO: renamed from: pullBottom-k-4lQ0M, reason: not valid java name */
    private final float m28846pullBottomk4lQ0M(long j) {
        float fM30429getXimpl = izb.m30429getXimpl(m28853displacementF1C5BW0$foundation_release());
        float fM30430getYimpl = izb.m30430getYimpl(j) / wpf.m33066getHeightimpl(this.f33929f);
        EdgeEffect orCreateBottomEffect = this.f33925b.getOrCreateBottomEffect();
        xv4 xv4Var = xv4.f99437a;
        return xv4Var.getDistanceCompat(orCreateBottomEffect) == 0.0f ? (-xv4Var.onPullDistanceCompat(orCreateBottomEffect, -fM30430getYimpl, 1 - fM30429getXimpl)) * wpf.m33066getHeightimpl(this.f33929f) : izb.m30430getYimpl(j);
    }

    /* JADX INFO: renamed from: pullLeft-k-4lQ0M, reason: not valid java name */
    private final float m28847pullLeftk4lQ0M(long j) {
        float fM30430getYimpl = izb.m30430getYimpl(m28853displacementF1C5BW0$foundation_release());
        float fM30429getXimpl = izb.m30429getXimpl(j) / wpf.m33069getWidthimpl(this.f33929f);
        EdgeEffect orCreateLeftEffect = this.f33925b.getOrCreateLeftEffect();
        xv4 xv4Var = xv4.f99437a;
        return xv4Var.getDistanceCompat(orCreateLeftEffect) == 0.0f ? xv4Var.onPullDistanceCompat(orCreateLeftEffect, fM30429getXimpl, 1 - fM30430getYimpl) * wpf.m33069getWidthimpl(this.f33929f) : izb.m30429getXimpl(j);
    }

    /* JADX INFO: renamed from: pullRight-k-4lQ0M, reason: not valid java name */
    private final float m28848pullRightk4lQ0M(long j) {
        float fM30430getYimpl = izb.m30430getYimpl(m28853displacementF1C5BW0$foundation_release());
        float fM30429getXimpl = izb.m30429getXimpl(j) / wpf.m33069getWidthimpl(this.f33929f);
        EdgeEffect orCreateRightEffect = this.f33925b.getOrCreateRightEffect();
        xv4 xv4Var = xv4.f99437a;
        return xv4Var.getDistanceCompat(orCreateRightEffect) == 0.0f ? (-xv4Var.onPullDistanceCompat(orCreateRightEffect, -fM30429getXimpl, fM30430getYimpl)) * wpf.m33069getWidthimpl(this.f33929f) : izb.m30429getXimpl(j);
    }

    /* JADX INFO: renamed from: pullTop-k-4lQ0M, reason: not valid java name */
    private final float m28849pullTopk4lQ0M(long j) {
        float fM30429getXimpl = izb.m30429getXimpl(m28853displacementF1C5BW0$foundation_release());
        float fM30430getYimpl = izb.m30430getYimpl(j) / wpf.m33066getHeightimpl(this.f33929f);
        EdgeEffect orCreateTopEffect = this.f33925b.getOrCreateTopEffect();
        xv4 xv4Var = xv4.f99437a;
        return xv4Var.getDistanceCompat(orCreateTopEffect) == 0.0f ? xv4Var.onPullDistanceCompat(orCreateTopEffect, fM30430getYimpl, fM30429getXimpl) * wpf.m33066getHeightimpl(this.f33929f) : izb.m30430getYimpl(j);
    }

    /* JADX INFO: renamed from: releaseOppositeOverscroll-k-4lQ0M, reason: not valid java name */
    private final boolean m28850releaseOppositeOverscrollk4lQ0M(long j) {
        boolean z;
        boolean z2 = true;
        if (!this.f33925b.isLeftAnimating() || izb.m30429getXimpl(j) >= 0.0f) {
            z = false;
        } else {
            xv4.f99437a.onReleaseWithOppositeDelta(this.f33925b.getOrCreateLeftEffect(), izb.m30429getXimpl(j));
            z = !this.f33925b.isLeftAnimating();
        }
        if (this.f33925b.isRightAnimating() && izb.m30429getXimpl(j) > 0.0f) {
            xv4.f99437a.onReleaseWithOppositeDelta(this.f33925b.getOrCreateRightEffect(), izb.m30429getXimpl(j));
            z = z || !this.f33925b.isRightAnimating();
        }
        if (this.f33925b.isTopAnimating() && izb.m30430getYimpl(j) < 0.0f) {
            xv4.f99437a.onReleaseWithOppositeDelta(this.f33925b.getOrCreateTopEffect(), izb.m30430getYimpl(j));
            z = z || !this.f33925b.isTopAnimating();
        }
        if (!this.f33925b.isBottomAnimating() || izb.m30430getYimpl(j) <= 0.0f) {
            return z;
        }
        xv4.f99437a.onReleaseWithOppositeDelta(this.f33925b.getOrCreateBottomEffect(), izb.m30430getYimpl(j));
        if (!z && this.f33925b.isBottomAnimating()) {
            z2 = false;
        }
        return z2;
    }

    private final boolean stopOverscrollAnimation() {
        boolean z;
        if (this.f33925b.isLeftStretched()) {
            m28847pullLeftk4lQ0M(izb.f49009b.m30445getZeroF1C5BW0());
            z = true;
        } else {
            z = false;
        }
        if (this.f33925b.isRightStretched()) {
            m28848pullRightk4lQ0M(izb.f49009b.m30445getZeroF1C5BW0());
            z = true;
        }
        if (this.f33925b.isTopStretched()) {
            m28849pullTopk4lQ0M(izb.f49009b.m30445getZeroF1C5BW0());
            z = true;
        }
        if (!this.f33925b.isBottomStretched()) {
            return z;
        }
        m28846pullBottomk4lQ0M(izb.f49009b.m30445getZeroF1C5BW0());
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // p000.w9c
    @p000.gib
    /* JADX INFO: renamed from: applyToFling-BMRW4eQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object mo28851applyToFlingBMRW4eQ(long r11, @p000.yfb p000.gz6<? super p000.i4i, ? super p000.zy2<? super p000.i4i>, ? extends java.lang.Object> r13, @p000.yfb p000.zy2<? super p000.bth> r14) {
        /*
            Method dump skipped, instruction units count: 442
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C5454es.mo28851applyToFlingBMRW4eQ(long, gz6, zy2):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x011b A[ADDED_TO_REGION] */
    @Override // p000.w9c
    /* JADX INFO: renamed from: applyToScroll-Rhakbz0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long mo28852applyToScrollRhakbz0(long r11, int r13, @p000.yfb p000.qy6<? super p000.izb, p000.izb> r14) {
        /*
            Method dump skipped, instruction units count: 304
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C5454es.mo28852applyToScrollRhakbz0(long, int, qy6):long");
    }

    /* JADX INFO: renamed from: displacement-F1C5BW0$foundation_release, reason: not valid java name */
    public final long m28853displacementF1C5BW0$foundation_release() {
        izb izbVar = this.f33924a;
        long jM30439unboximpl = izbVar != null ? izbVar.m30439unboximpl() : eqf.m28834getCenteruvyYCjk(this.f33929f);
        return mzb.Offset(izb.m30429getXimpl(jM30439unboximpl) / wpf.m33069getWidthimpl(this.f33929f), izb.m30430getYimpl(jM30439unboximpl) / wpf.m33066getHeightimpl(this.f33929f));
    }

    @Override // p000.w9c
    @yfb
    public InterfaceC0701e getEffectModifier() {
        return this.f33931h;
    }

    public final boolean getInvalidationEnabled$foundation_release() {
        return this.f33927d;
    }

    @yfb
    public final z6b<bth> getRedrawSignal$foundation_release() {
        return this.f33926c;
    }

    public final void invalidateOverscroll$foundation_release() {
        if (this.f33927d) {
            this.f33926c.setValue(bth.f14751a);
        }
    }

    @Override // p000.w9c
    public boolean isInProgress() {
        yv4 yv4Var = this.f33925b;
        EdgeEffect edgeEffect = yv4Var.f103100d;
        if (edgeEffect != null && xv4.f99437a.getDistanceCompat(edgeEffect) != 0.0f) {
            return true;
        }
        EdgeEffect edgeEffect2 = yv4Var.f103101e;
        if (edgeEffect2 != null && xv4.f99437a.getDistanceCompat(edgeEffect2) != 0.0f) {
            return true;
        }
        EdgeEffect edgeEffect3 = yv4Var.f103102f;
        if (edgeEffect3 != null && xv4.f99437a.getDistanceCompat(edgeEffect3) != 0.0f) {
            return true;
        }
        EdgeEffect edgeEffect4 = yv4Var.f103103g;
        return (edgeEffect4 == null || xv4.f99437a.getDistanceCompat(edgeEffect4) == 0.0f) ? false : true;
    }

    public final void setInvalidationEnabled$foundation_release(boolean z) {
        this.f33927d = z;
    }

    /* JADX INFO: renamed from: updateSize-uvyYCjk$foundation_release, reason: not valid java name */
    public final void m28854updateSizeuvyYCjk$foundation_release(long j) {
        boolean zM33065equalsimpl0 = wpf.m33065equalsimpl0(this.f33929f, wpf.f95046b.m33078getZeroNHjbRc());
        boolean zM33065equalsimpl02 = wpf.m33065equalsimpl0(j, this.f33929f);
        this.f33929f = j;
        if (!zM33065equalsimpl02) {
            this.f33925b.m33414setSizeozmzZPI(s78.IntSize(p3a.roundToInt(wpf.m33069getWidthimpl(j)), p3a.roundToInt(wpf.m33066getHeightimpl(j))));
        }
        if (zM33065equalsimpl0 || zM33065equalsimpl02) {
            return;
        }
        invalidateOverscroll$foundation_release();
        animateToRelease();
    }
}
