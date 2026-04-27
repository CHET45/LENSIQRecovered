package p000;

import androidx.compose.animation.C0572e;
import androidx.compose.p002ui.layout.AbstractC0767t;
import androidx.compose.p002ui.layout.InterfaceC0761n;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nAnimationModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimationModifier.kt\nandroidx/compose/animation/SizeAnimationModifierNode\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n*L\n1#1,289:1\n81#2:290\n107#2,2:291\n56#3,4:293\n*S KotlinDebug\n*F\n+ 1 AnimationModifier.kt\nandroidx/compose/animation/SizeAnimationModifierNode\n*L\n170#1:290\n170#1:291,2\n198#1:293,4\n*E\n"})
public final class aqf extends iw8 {

    /* JADX INFO: renamed from: M1 */
    @gib
    public gz6<? super r78, ? super r78, bth> f11596M1;

    /* JADX INFO: renamed from: V1 */
    public long f11597V1;

    /* JADX INFO: renamed from: Y */
    @yfb
    public InterfaceC11178py<r78> f11598Y;

    /* JADX INFO: renamed from: Z */
    @yfb
    public InterfaceC9407mm f11599Z;

    /* JADX INFO: renamed from: Z1 */
    public long f11600Z1;

    /* JADX INFO: renamed from: a2 */
    public boolean f11601a2;

    /* JADX INFO: renamed from: b2 */
    @yfb
    public final z6b f11602b2;

    /* JADX INFO: renamed from: aqf$a */
    @e0g(parameters = 0)
    public static final class C1563a {

        /* JADX INFO: renamed from: c */
        public static final int f11603c = 8;

        /* JADX INFO: renamed from: a */
        @yfb
        public final C13257tw<r78, C14830wy> f11604a;

        /* JADX INFO: renamed from: b */
        public long f11605b;

        public /* synthetic */ C1563a(C13257tw c13257tw, long j, jt3 jt3Var) {
            this(c13257tw, j);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: copy-O0kMr_c$default, reason: not valid java name */
        public static /* synthetic */ C1563a m27842copyO0kMr_c$default(C1563a c1563a, C13257tw c13257tw, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                c13257tw = c1563a.f11604a;
            }
            if ((i & 2) != 0) {
                j = c1563a.f11605b;
            }
            return c1563a.m27844copyO0kMr_c(c13257tw, j);
        }

        @yfb
        public final C13257tw<r78, C14830wy> component1() {
            return this.f11604a;
        }

        /* JADX INFO: renamed from: component2-YbymL2g, reason: not valid java name */
        public final long m27843component2YbymL2g() {
            return this.f11605b;
        }

        @yfb
        /* JADX INFO: renamed from: copy-O0kMr_c, reason: not valid java name */
        public final C1563a m27844copyO0kMr_c(@yfb C13257tw<r78, C14830wy> c13257tw, long j) {
            return new C1563a(c13257tw, j, null);
        }

        public boolean equals(@gib Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1563a)) {
                return false;
            }
            C1563a c1563a = (C1563a) obj;
            return md8.areEqual(this.f11604a, c1563a.f11604a) && r78.m32085equalsimpl0(this.f11605b, c1563a.f11605b);
        }

        @yfb
        public final C13257tw<r78, C14830wy> getAnim() {
            return this.f11604a;
        }

        /* JADX INFO: renamed from: getStartSize-YbymL2g, reason: not valid java name */
        public final long m27845getStartSizeYbymL2g() {
            return this.f11605b;
        }

        public int hashCode() {
            return (this.f11604a.hashCode() * 31) + r78.m32088hashCodeimpl(this.f11605b);
        }

        /* JADX INFO: renamed from: setStartSize-ozmzZPI, reason: not valid java name */
        public final void m27846setStartSizeozmzZPI(long j) {
            this.f11605b = j;
        }

        @yfb
        public String toString() {
            return "AnimData(anim=" + this.f11604a + ", startSize=" + ((Object) r78.m32090toStringimpl(this.f11605b)) + ')';
        }

        private C1563a(C13257tw<r78, C14830wy> c13257tw, long j) {
            this.f11604a = c13257tw;
            this.f11605b = j;
        }
    }

    /* JADX INFO: renamed from: aqf$b */
    @ck3(m4009c = "androidx.compose.animation.SizeAnimationModifierNode$animateTo$data$1$1", m4010f = "AnimationModifier.kt", m4011i = {}, m4012l = {nb2.f63861i}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C1564b extends ugg implements gz6<x13, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f11606a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C1563a f11607b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ long f11608c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ aqf f11609d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1564b(C1563a c1563a, long j, aqf aqfVar, zy2<? super C1564b> zy2Var) {
            super(2, zy2Var);
            this.f11607b = c1563a;
            this.f11608c = j;
            this.f11609d = aqfVar;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            return new C1564b(this.f11607b, this.f11608c, this.f11609d, zy2Var);
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb x13 x13Var, @gib zy2<? super bth> zy2Var) {
            return ((C1564b) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            gz6<r78, r78, bth> listener;
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f11606a;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                C13257tw<r78, C14830wy> anim = this.f11607b.getAnim();
                r78 r78VarM32079boximpl = r78.m32079boximpl(this.f11608c);
                InterfaceC11178py<r78> animationSpec = this.f11609d.getAnimationSpec();
                this.f11606a = 1;
                obj = C13257tw.animateTo$default(anim, r78VarM32079boximpl, animationSpec, null, null, this, 12, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                y7e.throwOnFailure(obj);
            }
            C10113ny c10113ny = (C10113ny) obj;
            if (c10113ny.getEndReason() == EnumC7662iy.Finished && (listener = this.f11609d.getListener()) != 0) {
                listener.invoke(r78.m32079boximpl(this.f11607b.m27845getStartSizeYbymL2g()), c10113ny.getEndState().getValue());
            }
            return bth.f14751a;
        }
    }

    /* JADX INFO: renamed from: aqf$c */
    public static final class C1565c extends tt8 implements qy6<AbstractC0767t.a, bth> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ long f11611b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f11612c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ int f11613d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ InterfaceC0761n f11614e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ AbstractC0767t f11615f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1565c(long j, int i, int i2, InterfaceC0761n interfaceC0761n, AbstractC0767t abstractC0767t) {
            super(1);
            this.f11611b = j;
            this.f11612c = i;
            this.f11613d = i2;
            this.f11614e = interfaceC0761n;
            this.f11615f = abstractC0767t;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(AbstractC0767t.a aVar) {
            invoke2(aVar);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb AbstractC0767t.a aVar) {
            AbstractC0767t.a.m27712placeRelative70tqf50$default(aVar, this.f11615f, aqf.this.getAlignment().mo30996alignKFBX0sM(this.f11611b, s78.IntSize(this.f11612c, this.f11613d), this.f11614e.getLayoutDirection()), 0.0f, 2, null);
        }
    }

    public /* synthetic */ aqf(InterfaceC11178py interfaceC11178py, InterfaceC9407mm interfaceC9407mm, gz6 gz6Var, int i, jt3 jt3Var) {
        this(interfaceC11178py, (i & 2) != 0 ? InterfaceC9407mm.f61437a.getTopStart() : interfaceC9407mm, (i & 4) != 0 ? null : gz6Var);
    }

    /* JADX INFO: renamed from: setLookaheadConstraints-BRTryo0, reason: not valid java name */
    private final void m27839setLookaheadConstraintsBRTryo0(long j) {
        this.f11600Z1 = j;
        this.f11601a2 = true;
    }

    /* JADX INFO: renamed from: targetConstraints-ZezNO4M, reason: not valid java name */
    private final long m27840targetConstraintsZezNO4M(long j) {
        return this.f11601a2 ? this.f11600Z1 : j;
    }

    /* JADX INFO: renamed from: animateTo-mzRDjE0, reason: not valid java name */
    public final long m27841animateTomzRDjE0(long j) {
        C1563a animData = getAnimData();
        if (animData != null) {
            boolean z = (r78.m32085equalsimpl0(j, animData.getAnim().getValue().m32091unboximpl()) || animData.getAnim().isRunning()) ? false : true;
            if (!r78.m32085equalsimpl0(j, animData.getAnim().getTargetValue().m32091unboximpl()) || z) {
                animData.m27846setStartSizeozmzZPI(animData.getAnim().getValue().m32091unboximpl());
                fg1.launch$default(getCoroutineScope(), null, null, new C1564b(animData, j, this, null), 3, null);
            }
        } else {
            animData = new C1563a(new C13257tw(r78.m32079boximpl(j), g3i.getVectorConverter(r78.f77324b), r78.m32079boximpl(s78.IntSize(1, 1)), null, 8, null), j, null);
        }
        setAnimData(animData);
        return animData.getAnim().getValue().m32091unboximpl();
    }

    @yfb
    public final InterfaceC9407mm getAlignment() {
        return this.f11599Z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @gib
    public final C1563a getAnimData() {
        return (C1563a) this.f11602b2.getValue();
    }

    @yfb
    public final InterfaceC11178py<r78> getAnimationSpec() {
        return this.f11598Y;
    }

    @gib
    public final gz6<r78, r78, bth> getListener() {
        return this.f11596M1;
    }

    @Override // p000.ew8
    @yfb
    /* JADX INFO: renamed from: measure-3p2s80s */
    public vba mo27276measure3p2s80s(@yfb InterfaceC0761n interfaceC0761n, @yfb rba rbaVar, long j) {
        AbstractC0767t abstractC0767tMo27949measureBRTryo0;
        long jM31224constrain4WqzIAM;
        if (interfaceC0761n.isLookingAhead()) {
            m27839setLookaheadConstraintsBRTryo0(j);
            abstractC0767tMo27949measureBRTryo0 = rbaVar.mo27949measureBRTryo0(j);
        } else {
            abstractC0767tMo27949measureBRTryo0 = rbaVar.mo27949measureBRTryo0(m27840targetConstraintsZezNO4M(j));
        }
        AbstractC0767t abstractC0767t = abstractC0767tMo27949measureBRTryo0;
        long jIntSize = s78.IntSize(abstractC0767t.getWidth(), abstractC0767t.getHeight());
        if (interfaceC0761n.isLookingAhead()) {
            this.f11597V1 = jIntSize;
            jM31224constrain4WqzIAM = jIntSize;
        } else {
            jM31224constrain4WqzIAM = nu2.m31224constrain4WqzIAM(j, m27841animateTomzRDjE0(C0572e.m27256isValidozmzZPI(this.f11597V1) ? this.f11597V1 : jIntSize));
        }
        int iM32087getWidthimpl = r78.m32087getWidthimpl(jM31224constrain4WqzIAM);
        int iM32086getHeightimpl = r78.m32086getHeightimpl(jM31224constrain4WqzIAM);
        return InterfaceC0761n.layout$default(interfaceC0761n, iM32087getWidthimpl, iM32086getHeightimpl, null, new C1565c(jIntSize, iM32087getWidthimpl, iM32086getHeightimpl, interfaceC0761n, abstractC0767t), 4, null);
    }

    @Override // androidx.compose.p002ui.InterfaceC0701e.d
    public void onAttach() {
        super.onAttach();
        this.f11597V1 = C0572e.getInvalidSize();
        this.f11601a2 = false;
    }

    @Override // androidx.compose.p002ui.InterfaceC0701e.d
    public void onReset() {
        super.onReset();
        setAnimData(null);
    }

    public final void setAlignment(@yfb InterfaceC9407mm interfaceC9407mm) {
        this.f11599Z = interfaceC9407mm;
    }

    public final void setAnimData(@gib C1563a c1563a) {
        this.f11602b2.setValue(c1563a);
    }

    public final void setAnimationSpec(@yfb InterfaceC11178py<r78> interfaceC11178py) {
        this.f11598Y = interfaceC11178py;
    }

    public final void setListener(@gib gz6<? super r78, ? super r78, bth> gz6Var) {
        this.f11596M1 = gz6Var;
    }

    public aqf(@yfb InterfaceC11178py<r78> interfaceC11178py, @yfb InterfaceC9407mm interfaceC9407mm, @gib gz6<? super r78, ? super r78, bth> gz6Var) {
        this.f11598Y = interfaceC11178py;
        this.f11599Z = interfaceC9407mm;
        this.f11596M1 = gz6Var;
        this.f11597V1 = C0572e.getInvalidSize();
        this.f11600Z1 = nu2.Constraints$default(0, 0, 0, 0, 15, null);
        this.f11602b2 = xtf.mutableStateOf$default(null, null, 2, null);
    }
}
