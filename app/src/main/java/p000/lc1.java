package p000;

import androidx.compose.animation.InterfaceC0580m;
import p000.yeh;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nBoundsAnimation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BoundsAnimation.kt\nandroidx/compose/animation/BoundsAnimation\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,102:1\n81#2:103\n107#2,2:104\n81#2:106\n107#2,2:107\n81#2:109\n107#2,2:110\n*S KotlinDebug\n*F\n+ 1 BoundsAnimation.kt\nandroidx/compose/animation/BoundsAnimation\n*L\n39#1:103\n39#1:104,2\n54#1:106\n54#1:107,2\n69#1:109\n69#1:110,2\n*E\n"})
@e0g(parameters = 0)
@qh5
public final class lc1 {

    /* JADX INFO: renamed from: g */
    public static final int f57138g = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final InterfaceC0580m f57139a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final yeh<Boolean> f57140b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final z6b f57141c;

    /* JADX INFO: renamed from: d */
    @yfb
    public final z6b f57142d;

    /* JADX INFO: renamed from: e */
    @yfb
    public fw5<rud> f57143e = mc1.f60542a;

    /* JADX INFO: renamed from: f */
    @yfb
    public final z6b f57144f = xtf.mutableStateOf$default(null, null, 2, null);

    /* JADX INFO: renamed from: lc1$a */
    public static final class C8768a extends tt8 implements qy6<yeh.InterfaceC15636b<Boolean>, fw5<rud>> {
        public C8768a() {
            super(1);
        }

        @Override // p000.qy6
        @yfb
        public final fw5<rud> invoke(@yfb yeh.InterfaceC15636b<Boolean> interfaceC15636b) {
            return lc1.this.getAnimationSpec();
        }
    }

    /* JADX INFO: renamed from: lc1$b */
    public static final class C8769b extends tt8 implements qy6<Boolean, rud> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ rud f57147b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ rud f57148c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8769b(rud rudVar, rud rudVar2) {
            super(1);
            this.f57147b = rudVar;
            this.f57148c = rudVar2;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ rud invoke(Boolean bool) {
            return invoke(bool.booleanValue());
        }

        @yfb
        public final rud invoke(boolean z) {
            return z == lc1.this.getTransition().getTargetState().booleanValue() ? this.f57147b : this.f57148c;
        }
    }

    public lc1(@yfb InterfaceC0580m interfaceC0580m, @yfb yeh<Boolean> yehVar, @yfb yeh<Boolean>.C15635a<rud, C15879yy> c15635a, @yfb nc1 nc1Var) {
        this.f57139a = interfaceC0580m;
        this.f57140b = yehVar;
        this.f57141c = xtf.mutableStateOf$default(c15635a, null, 2, null);
        this.f57142d = xtf.mutableStateOf$default(nc1Var, null, 2, null);
    }

    private final nc1 getBoundsTransform() {
        return (nc1) this.f57142d.getValue();
    }

    private final void setAnimation(yeh<Boolean>.C15635a<rud, C15879yy> c15635a) {
        this.f57141c.setValue(c15635a);
    }

    private final void setBoundsTransform(nc1 nc1Var) {
        this.f57142d.setValue(nc1Var);
    }

    public final void animate(@yfb rud rudVar, @yfb rud rudVar2) {
        if (this.f57139a.isTransitionActive()) {
            if (getAnimationState() == null) {
                this.f57143e = getBoundsTransform().transform(rudVar, rudVar2);
            }
            setAnimationState(getAnimation().animate(new C8768a(), new C8769b(rudVar2, rudVar)));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @yfb
    public final yeh<Boolean>.C15635a<rud, C15879yy> getAnimation() {
        return (yeh.C15635a) this.f57141c.getValue();
    }

    @yfb
    public final fw5<rud> getAnimationSpec() {
        return this.f57143e;
    }

    @gib
    public final i2g<rud> getAnimationState() {
        return (i2g) this.f57144f.getValue();
    }

    public final boolean getTarget() {
        return this.f57140b.getTargetState().booleanValue();
    }

    @yfb
    public final yeh<Boolean> getTransition() {
        return this.f57140b;
    }

    @yfb
    public final InterfaceC0580m getTransitionScope() {
        return this.f57139a;
    }

    @gib
    public final rud getValue() {
        i2g<rud> animationState;
        if (!this.f57139a.isTransitionActive() || (animationState = getAnimationState()) == null) {
            return null;
        }
        return animationState.getValue();
    }

    public final boolean isRunning() {
        yeh parentTransition = this.f57140b;
        while (parentTransition.getParentTransition() != null) {
            parentTransition = parentTransition.getParentTransition();
            md8.checkNotNull(parentTransition);
        }
        return !md8.areEqual(parentTransition.getCurrentState(), parentTransition.getTargetState());
    }

    public final void setAnimationSpec(@yfb fw5<rud> fw5Var) {
        this.f57143e = fw5Var;
    }

    public final void setAnimationState(@gib i2g<rud> i2gVar) {
        this.f57144f.setValue(i2gVar);
    }

    public final void updateAnimation(@yfb yeh<Boolean>.C15635a<rud, C15879yy> c15635a, @yfb nc1 nc1Var) {
        if (!md8.areEqual(getAnimation(), c15635a)) {
            setAnimation(c15635a);
            setAnimationState(null);
            this.f57143e = mc1.f60542a;
        }
        setBoundsTransform(nc1Var);
    }
}
