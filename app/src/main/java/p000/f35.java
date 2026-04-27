package p000;

import androidx.compose.animation.AbstractC0574g;
import androidx.compose.animation.AbstractC0575h;
import androidx.compose.animation.C0572e;
import androidx.compose.animation.C0573f;
import androidx.compose.p002ui.graphics.InterfaceC0736c;
import androidx.compose.p002ui.layout.AbstractC0767t;
import androidx.compose.p002ui.layout.InterfaceC0761n;
import p000.yeh;

/* JADX INFO: loaded from: classes.dex */
public final class f35 extends iw8 {

    /* JADX INFO: renamed from: M1 */
    @gib
    public yeh<d35>.C15635a<a78, C14830wy> f34948M1;

    /* JADX INFO: renamed from: V1 */
    @gib
    public yeh<d35>.C15635a<a78, C14830wy> f34949V1;

    /* JADX INFO: renamed from: Y */
    @yfb
    public yeh<d35> f34950Y;

    /* JADX INFO: renamed from: Z */
    @gib
    public yeh<d35>.C15635a<r78, C14830wy> f34951Z;

    /* JADX INFO: renamed from: Z1 */
    @yfb
    public AbstractC0574g f34952Z1;

    /* JADX INFO: renamed from: a2 */
    @yfb
    public AbstractC0575h f34953a2;

    /* JADX INFO: renamed from: b2 */
    @yfb
    public ny6<Boolean> f34954b2;

    /* JADX INFO: renamed from: c2 */
    @yfb
    public v97 f34955c2;

    /* JADX INFO: renamed from: d2 */
    public boolean f34956d2;

    /* JADX INFO: renamed from: g2 */
    @gib
    public InterfaceC9407mm f34959g2;

    /* JADX INFO: renamed from: e2 */
    public long f34957e2 = C0572e.getInvalidSize();

    /* JADX INFO: renamed from: f2 */
    public long f34958f2 = nu2.Constraints$default(0, 0, 0, 0, 15, null);

    /* JADX INFO: renamed from: h2 */
    @yfb
    public final qy6<yeh.InterfaceC15636b<d35>, fw5<r78>> f34960h2 = new C5579i();

    /* JADX INFO: renamed from: i2 */
    @yfb
    public final qy6<yeh.InterfaceC15636b<d35>, fw5<a78>> f34961i2 = new C5580j();

    /* JADX INFO: renamed from: f35$a */
    public /* synthetic */ class C5571a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f34962a;

        static {
            int[] iArr = new int[d35.values().length];
            try {
                iArr[d35.Visible.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d35.PreEnter.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[d35.PostExit.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f34962a = iArr;
        }
    }

    /* JADX INFO: renamed from: f35$b */
    public static final class C5572b extends tt8 implements qy6<AbstractC0767t.a, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AbstractC0767t f34963a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5572b(AbstractC0767t abstractC0767t) {
            super(1);
            this.f34963a = abstractC0767t;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(AbstractC0767t.a aVar) {
            invoke2(aVar);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb AbstractC0767t.a aVar) {
            AbstractC0767t.a.place$default(aVar, this.f34963a, 0, 0, 0.0f, 4, null);
        }
    }

    /* JADX INFO: renamed from: f35$c */
    public static final class C5573c extends tt8 implements qy6<AbstractC0767t.a, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AbstractC0767t f34964a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ long f34965b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ long f34966c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ qy6<InterfaceC0736c, bth> f34967d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C5573c(AbstractC0767t abstractC0767t, long j, long j2, qy6<? super InterfaceC0736c, bth> qy6Var) {
            super(1);
            this.f34964a = abstractC0767t;
            this.f34965b = j;
            this.f34966c = j2;
            this.f34967d = qy6Var;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(AbstractC0767t.a aVar) {
            invoke2(aVar);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb AbstractC0767t.a aVar) {
            aVar.placeWithLayer(this.f34964a, a78.m27201getXimpl(this.f34966c) + a78.m27201getXimpl(this.f34965b), a78.m27202getYimpl(this.f34966c) + a78.m27202getYimpl(this.f34965b), 0.0f, this.f34967d);
        }
    }

    /* JADX INFO: renamed from: f35$d */
    public static final class C5574d extends tt8 implements qy6<AbstractC0767t.a, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AbstractC0767t f34968a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5574d(AbstractC0767t abstractC0767t) {
            super(1);
            this.f34968a = abstractC0767t;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(AbstractC0767t.a aVar) {
            invoke2(aVar);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb AbstractC0767t.a aVar) {
            AbstractC0767t.a.place$default(aVar, this.f34968a, 0, 0, 0.0f, 4, null);
        }
    }

    /* JADX INFO: renamed from: f35$e */
    public static final class C5575e extends tt8 implements qy6<d35, r78> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ long f34970b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5575e(long j) {
            super(1);
            this.f34970b = j;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ r78 invoke(d35 d35Var) {
            return r78.m32079boximpl(m28891invokeYEO4UFw(d35Var));
        }

        /* JADX INFO: renamed from: invoke-YEO4UFw, reason: not valid java name */
        public final long m28891invokeYEO4UFw(@yfb d35 d35Var) {
            return f35.this.m28888sizeByStateUzc_VyU(d35Var, this.f34970b);
        }
    }

    /* JADX INFO: renamed from: f35$f */
    public static final class C5576f extends tt8 implements qy6<yeh.InterfaceC15636b<d35>, fw5<a78>> {

        /* JADX INFO: renamed from: a */
        public static final C5576f f34971a = new C5576f();

        public C5576f() {
            super(1);
        }

        @Override // p000.qy6
        @yfb
        public final fw5<a78> invoke(@yfb yeh.InterfaceC15636b<d35> interfaceC15636b) {
            return C0573f.f3618c;
        }
    }

    /* JADX INFO: renamed from: f35$g */
    public static final class C5577g extends tt8 implements qy6<d35, a78> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ long f34973b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5577g(long j) {
            super(1);
            this.f34973b = j;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ a78 invoke(d35 d35Var) {
            return a78.m27192boximpl(m28892invokeBjo55l4(d35Var));
        }

        /* JADX INFO: renamed from: invoke-Bjo55l4, reason: not valid java name */
        public final long m28892invokeBjo55l4(@yfb d35 d35Var) {
            return f35.this.m28890targetOffsetByStateoFUgxo0(d35Var, this.f34973b);
        }
    }

    /* JADX INFO: renamed from: f35$h */
    public static final class C5578h extends tt8 implements qy6<d35, a78> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ long f34975b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5578h(long j) {
            super(1);
            this.f34975b = j;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ a78 invoke(d35 d35Var) {
            return a78.m27192boximpl(m28893invokeBjo55l4(d35Var));
        }

        /* JADX INFO: renamed from: invoke-Bjo55l4, reason: not valid java name */
        public final long m28893invokeBjo55l4(@yfb d35 d35Var) {
            return f35.this.m28889slideTargetValueByStateoFUgxo0(d35Var, this.f34975b);
        }
    }

    /* JADX INFO: renamed from: f35$i */
    public static final class C5579i extends tt8 implements qy6<yeh.InterfaceC15636b<d35>, fw5<r78>> {
        public C5579i() {
            super(1);
        }

        @Override // p000.qy6
        @yfb
        public final fw5<r78> invoke(@yfb yeh.InterfaceC15636b<d35> interfaceC15636b) {
            d35 d35Var = d35.PreEnter;
            d35 d35Var2 = d35.Visible;
            fw5<r78> animationSpec = null;
            if (interfaceC15636b.isTransitioningTo(d35Var, d35Var2)) {
                xt1 changeSize = f35.this.getEnter().getData$animation_release().getChangeSize();
                if (changeSize != null) {
                    animationSpec = changeSize.getAnimationSpec();
                }
            } else if (interfaceC15636b.isTransitioningTo(d35Var2, d35.PostExit)) {
                xt1 changeSize2 = f35.this.getExit().getData$animation_release().getChangeSize();
                if (changeSize2 != null) {
                    animationSpec = changeSize2.getAnimationSpec();
                }
            } else {
                animationSpec = C0573f.f3619d;
            }
            return animationSpec == null ? C0573f.f3619d : animationSpec;
        }
    }

    /* JADX INFO: renamed from: f35$j */
    public static final class C5580j extends tt8 implements qy6<yeh.InterfaceC15636b<d35>, fw5<a78>> {
        public C5580j() {
            super(1);
        }

        @Override // p000.qy6
        @yfb
        public final fw5<a78> invoke(@yfb yeh.InterfaceC15636b<d35> interfaceC15636b) {
            fw5<a78> animationSpec;
            fw5<a78> animationSpec2;
            d35 d35Var = d35.PreEnter;
            d35 d35Var2 = d35.Visible;
            if (interfaceC15636b.isTransitioningTo(d35Var, d35Var2)) {
                qqf slide = f35.this.getEnter().getData$animation_release().getSlide();
                return (slide == null || (animationSpec2 = slide.getAnimationSpec()) == null) ? C0573f.f3618c : animationSpec2;
            }
            if (!interfaceC15636b.isTransitioningTo(d35Var2, d35.PostExit)) {
                return C0573f.f3618c;
            }
            qqf slide2 = f35.this.getExit().getData$animation_release().getSlide();
            return (slide2 == null || (animationSpec = slide2.getAnimationSpec()) == null) ? C0573f.f3618c : animationSpec;
        }
    }

    public f35(@yfb yeh<d35> yehVar, @gib yeh<d35>.C15635a<r78, C14830wy> c15635a, @gib yeh<d35>.C15635a<a78, C14830wy> c15635a2, @gib yeh<d35>.C15635a<a78, C14830wy> c15635a3, @yfb AbstractC0574g abstractC0574g, @yfb AbstractC0575h abstractC0575h, @yfb ny6<Boolean> ny6Var, @yfb v97 v97Var) {
        this.f34950Y = yehVar;
        this.f34951Z = c15635a;
        this.f34948M1 = c15635a2;
        this.f34949V1 = c15635a3;
        this.f34952Z1 = abstractC0574g;
        this.f34953a2 = abstractC0575h;
        this.f34954b2 = ny6Var;
        this.f34955c2 = v97Var;
    }

    /* JADX INFO: renamed from: setLookaheadConstraints-BRTryo0, reason: not valid java name */
    private final void m28887setLookaheadConstraintsBRTryo0(long j) {
        this.f34956d2 = true;
        this.f34958f2 = j;
    }

    @gib
    public final InterfaceC9407mm getAlignment() {
        InterfaceC9407mm alignment;
        if (this.f34950Y.getSegment().isTransitioningTo(d35.PreEnter, d35.Visible)) {
            xt1 changeSize = this.f34952Z1.getData$animation_release().getChangeSize();
            if (changeSize == null || (alignment = changeSize.getAlignment()) == null) {
                xt1 changeSize2 = this.f34953a2.getData$animation_release().getChangeSize();
                if (changeSize2 != null) {
                    return changeSize2.getAlignment();
                }
                return null;
            }
        } else {
            xt1 changeSize3 = this.f34953a2.getData$animation_release().getChangeSize();
            if (changeSize3 == null || (alignment = changeSize3.getAlignment()) == null) {
                xt1 changeSize4 = this.f34952Z1.getData$animation_release().getChangeSize();
                if (changeSize4 != null) {
                    return changeSize4.getAlignment();
                }
                return null;
            }
        }
        return alignment;
    }

    @gib
    public final InterfaceC9407mm getCurrentAlignment() {
        return this.f34959g2;
    }

    @yfb
    public final AbstractC0574g getEnter() {
        return this.f34952Z1;
    }

    @yfb
    public final AbstractC0575h getExit() {
        return this.f34953a2;
    }

    @yfb
    public final v97 getGraphicsLayerBlock() {
        return this.f34955c2;
    }

    @gib
    public final yeh<d35>.C15635a<a78, C14830wy> getOffsetAnimation() {
        return this.f34948M1;
    }

    @gib
    public final yeh<d35>.C15635a<r78, C14830wy> getSizeAnimation() {
        return this.f34951Z;
    }

    @yfb
    public final qy6<yeh.InterfaceC15636b<d35>, fw5<r78>> getSizeTransitionSpec() {
        return this.f34960h2;
    }

    @gib
    public final yeh<d35>.C15635a<a78, C14830wy> getSlideAnimation() {
        return this.f34949V1;
    }

    @yfb
    public final qy6<yeh.InterfaceC15636b<d35>, fw5<a78>> getSlideSpec() {
        return this.f34961i2;
    }

    @yfb
    public final yeh<d35> getTransition() {
        return this.f34950Y;
    }

    @yfb
    public final ny6<Boolean> isEnabled() {
        return this.f34954b2;
    }

    @Override // p000.ew8
    @yfb
    /* JADX INFO: renamed from: measure-3p2s80s */
    public vba mo27276measure3p2s80s(@yfb InterfaceC0761n interfaceC0761n, @yfb rba rbaVar, long j) {
        i2g<a78> i2gVarAnimate;
        i2g<a78> i2gVarAnimate2;
        if (this.f34950Y.getCurrentState() == this.f34950Y.getTargetState()) {
            this.f34959g2 = null;
        } else if (this.f34959g2 == null) {
            InterfaceC9407mm alignment = getAlignment();
            if (alignment == null) {
                alignment = InterfaceC9407mm.f61437a.getTopStart();
            }
            this.f34959g2 = alignment;
        }
        if (interfaceC0761n.isLookingAhead()) {
            AbstractC0767t abstractC0767tMo27949measureBRTryo0 = rbaVar.mo27949measureBRTryo0(j);
            long jIntSize = s78.IntSize(abstractC0767tMo27949measureBRTryo0.getWidth(), abstractC0767tMo27949measureBRTryo0.getHeight());
            this.f34957e2 = jIntSize;
            m28887setLookaheadConstraintsBRTryo0(j);
            return InterfaceC0761n.layout$default(interfaceC0761n, r78.m32087getWidthimpl(jIntSize), r78.m32086getHeightimpl(jIntSize), null, new C5572b(abstractC0767tMo27949measureBRTryo0), 4, null);
        }
        if (!this.f34954b2.invoke().booleanValue()) {
            AbstractC0767t abstractC0767tMo27949measureBRTryo02 = rbaVar.mo27949measureBRTryo0(j);
            return InterfaceC0761n.layout$default(interfaceC0761n, abstractC0767tMo27949measureBRTryo02.getWidth(), abstractC0767tMo27949measureBRTryo02.getHeight(), null, new C5574d(abstractC0767tMo27949measureBRTryo02), 4, null);
        }
        qy6<InterfaceC0736c, bth> qy6VarInit = this.f34955c2.init();
        AbstractC0767t abstractC0767tMo27949measureBRTryo03 = rbaVar.mo27949measureBRTryo0(j);
        long jIntSize2 = s78.IntSize(abstractC0767tMo27949measureBRTryo03.getWidth(), abstractC0767tMo27949measureBRTryo03.getHeight());
        long j2 = C0572e.m27256isValidozmzZPI(this.f34957e2) ? this.f34957e2 : jIntSize2;
        yeh<d35>.C15635a<r78, C14830wy> c15635a = this.f34951Z;
        i2g<r78> i2gVarAnimate3 = c15635a != null ? c15635a.animate(this.f34960h2, new C5575e(j2)) : null;
        if (i2gVarAnimate3 != null) {
            jIntSize2 = i2gVarAnimate3.getValue().m32091unboximpl();
        }
        long jM31224constrain4WqzIAM = nu2.m31224constrain4WqzIAM(j, jIntSize2);
        yeh<d35>.C15635a<a78, C14830wy> c15635a2 = this.f34948M1;
        long jM27211getZeronOccac = (c15635a2 == null || (i2gVarAnimate2 = c15635a2.animate(C5576f.f34971a, new C5577g(j2))) == null) ? a78.f545b.m27211getZeronOccac() : i2gVarAnimate2.getValue().m27210unboximpl();
        yeh<d35>.C15635a<a78, C14830wy> c15635a3 = this.f34949V1;
        long jM27211getZeronOccac2 = (c15635a3 == null || (i2gVarAnimate = c15635a3.animate(this.f34961i2, new C5578h(j2))) == null) ? a78.f545b.m27211getZeronOccac() : i2gVarAnimate.getValue().m27210unboximpl();
        InterfaceC9407mm interfaceC9407mm = this.f34959g2;
        return InterfaceC0761n.layout$default(interfaceC0761n, r78.m32087getWidthimpl(jM31224constrain4WqzIAM), r78.m32086getHeightimpl(jM31224constrain4WqzIAM), null, new C5573c(abstractC0767tMo27949measureBRTryo03, a78.m27205plusqkQi6aY(interfaceC9407mm != null ? interfaceC9407mm.mo30996alignKFBX0sM(j2, jM31224constrain4WqzIAM, ov8.Ltr) : a78.f545b.m27211getZeronOccac(), jM27211getZeronOccac2), jM27211getZeronOccac, qy6VarInit), 4, null);
    }

    @Override // androidx.compose.p002ui.InterfaceC0701e.d
    public void onAttach() {
        super.onAttach();
        this.f34956d2 = false;
        this.f34957e2 = C0572e.getInvalidSize();
    }

    public final void setCurrentAlignment(@gib InterfaceC9407mm interfaceC9407mm) {
        this.f34959g2 = interfaceC9407mm;
    }

    public final void setEnabled(@yfb ny6<Boolean> ny6Var) {
        this.f34954b2 = ny6Var;
    }

    public final void setEnter(@yfb AbstractC0574g abstractC0574g) {
        this.f34952Z1 = abstractC0574g;
    }

    public final void setExit(@yfb AbstractC0575h abstractC0575h) {
        this.f34953a2 = abstractC0575h;
    }

    public final void setGraphicsLayerBlock(@yfb v97 v97Var) {
        this.f34955c2 = v97Var;
    }

    public final void setOffsetAnimation(@gib yeh<d35>.C15635a<a78, C14830wy> c15635a) {
        this.f34948M1 = c15635a;
    }

    public final void setSizeAnimation(@gib yeh<d35>.C15635a<r78, C14830wy> c15635a) {
        this.f34951Z = c15635a;
    }

    public final void setSlideAnimation(@gib yeh<d35>.C15635a<a78, C14830wy> c15635a) {
        this.f34949V1 = c15635a;
    }

    public final void setTransition(@yfb yeh<d35> yehVar) {
        this.f34950Y = yehVar;
    }

    /* JADX INFO: renamed from: sizeByState-Uzc_VyU, reason: not valid java name */
    public final long m28888sizeByStateUzc_VyU(@yfb d35 d35Var, long j) {
        qy6<r78, r78> size;
        qy6<r78, r78> size2;
        int i = C5571a.f34962a[d35Var.ordinal()];
        if (i == 1) {
            return j;
        }
        if (i == 2) {
            xt1 changeSize = this.f34952Z1.getData$animation_release().getChangeSize();
            return (changeSize == null || (size = changeSize.getSize()) == null) ? j : size.invoke(r78.m32079boximpl(j)).m32091unboximpl();
        }
        if (i != 3) {
            throw new ceb();
        }
        xt1 changeSize2 = this.f34953a2.getData$animation_release().getChangeSize();
        return (changeSize2 == null || (size2 = changeSize2.getSize()) == null) ? j : size2.invoke(r78.m32079boximpl(j)).m32091unboximpl();
    }

    /* JADX INFO: renamed from: slideTargetValueByState-oFUgxo0, reason: not valid java name */
    public final long m28889slideTargetValueByStateoFUgxo0(@yfb d35 d35Var, long j) {
        qy6<r78, a78> slideOffset;
        qy6<r78, a78> slideOffset2;
        qqf slide = this.f34952Z1.getData$animation_release().getSlide();
        long jM27211getZeronOccac = (slide == null || (slideOffset2 = slide.getSlideOffset()) == null) ? a78.f545b.m27211getZeronOccac() : slideOffset2.invoke(r78.m32079boximpl(j)).m27210unboximpl();
        qqf slide2 = this.f34953a2.getData$animation_release().getSlide();
        long jM27211getZeronOccac2 = (slide2 == null || (slideOffset = slide2.getSlideOffset()) == null) ? a78.f545b.m27211getZeronOccac() : slideOffset.invoke(r78.m32079boximpl(j)).m27210unboximpl();
        int i = C5571a.f34962a[d35Var.ordinal()];
        if (i == 1) {
            return a78.f545b.m27211getZeronOccac();
        }
        if (i == 2) {
            return jM27211getZeronOccac;
        }
        if (i == 3) {
            return jM27211getZeronOccac2;
        }
        throw new ceb();
    }

    /* JADX INFO: renamed from: targetOffsetByState-oFUgxo0, reason: not valid java name */
    public final long m28890targetOffsetByStateoFUgxo0(@yfb d35 d35Var, long j) {
        int i;
        if (this.f34959g2 != null && getAlignment() != null && !md8.areEqual(this.f34959g2, getAlignment()) && (i = C5571a.f34962a[d35Var.ordinal()]) != 1 && i != 2) {
            if (i != 3) {
                throw new ceb();
            }
            xt1 changeSize = this.f34953a2.getData$animation_release().getChangeSize();
            if (changeSize == null) {
                return a78.f545b.m27211getZeronOccac();
            }
            long jM32091unboximpl = changeSize.getSize().invoke(r78.m32079boximpl(j)).m32091unboximpl();
            InterfaceC9407mm alignment = getAlignment();
            md8.checkNotNull(alignment);
            ov8 ov8Var = ov8.Ltr;
            long jMo30996alignKFBX0sM = alignment.mo30996alignKFBX0sM(j, jM32091unboximpl, ov8Var);
            InterfaceC9407mm interfaceC9407mm = this.f34959g2;
            md8.checkNotNull(interfaceC9407mm);
            return a78.m27204minusqkQi6aY(jMo30996alignKFBX0sM, interfaceC9407mm.mo30996alignKFBX0sM(j, jM32091unboximpl, ov8Var));
        }
        return a78.f545b.m27211getZeronOccac();
    }
}
