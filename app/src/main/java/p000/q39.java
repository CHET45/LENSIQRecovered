package p000;

import androidx.compose.p002ui.InterfaceC0701e;
import p000.t39;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nLegacyAdaptingPlatformTextInputModifierNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LegacyAdaptingPlatformTextInputModifierNode.kt\nandroidx/compose/foundation/text/input/internal/LegacyAdaptingPlatformTextInputModifierNode\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,139:1\n81#2:140\n107#2,2:141\n*S KotlinDebug\n*F\n+ 1 LegacyAdaptingPlatformTextInputModifierNode.kt\nandroidx/compose/foundation/text/input/internal/LegacyAdaptingPlatformTextInputModifierNode\n*L\n98#1:140\n98#1:141,2\n*E\n"})
@e0g(parameters = 0)
public final class q39 extends InterfaceC0701e.d implements uxc, mn2, o77, t39.InterfaceC12899a {

    /* JADX INFO: renamed from: V1 */
    public static final int f73117V1 = 8;

    /* JADX INFO: renamed from: M1 */
    @yfb
    public final z6b f73118M1 = xtf.mutableStateOf$default(null, null, 2, null);

    /* JADX INFO: renamed from: X */
    @yfb
    public t39 f73119X;

    /* JADX INFO: renamed from: Y */
    @yfb
    public z39 f73120Y;

    /* JADX INFO: renamed from: Z */
    @yfb
    public osg f73121Z;

    /* JADX INFO: renamed from: q39$a */
    @ck3(m4009c = "androidx.compose.foundation.text.input.internal.LegacyAdaptingPlatformTextInputModifierNode$launchTextInputSession$1", m4010f = "LegacyAdaptingPlatformTextInputModifierNode.kt", m4011i = {}, m4012l = {135}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C11286a extends ugg implements gz6<x13, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f73122a;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ gz6<xxc, zy2<?>, Object> f73124c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C11286a(gz6<? super xxc, ? super zy2<?>, ? extends Object> gz6Var, zy2<? super C11286a> zy2Var) {
            super(2, zy2Var);
            this.f73124c = gz6Var;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            return q39.this.new C11286a(this.f73124c, zy2Var);
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb x13 x13Var, @gib zy2<? super bth> zy2Var) {
            return ((C11286a) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f73122a;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                q39 q39Var = q39.this;
                gz6<xxc, zy2<?>, Object> gz6Var = this.f73124c;
                this.f73122a = 1;
                if (vxc.establishTextInputSession(q39Var, gz6Var, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                y7e.throwOnFailure(obj);
            }
            throw new us8();
        }
    }

    public q39(@yfb t39 t39Var, @yfb z39 z39Var, @yfb osg osgVar) {
        this.f73119X = t39Var;
        this.f73120Y = z39Var;
        this.f73121Z = osgVar;
    }

    private void setLayoutCoordinates(mv8 mv8Var) {
        this.f73118M1.setValue(mv8Var);
    }

    @Override // p000.t39.InterfaceC12899a
    @gib
    public mv8 getLayoutCoordinates() {
        return (mv8) this.f73118M1.getValue();
    }

    @Override // p000.t39.InterfaceC12899a
    @yfb
    public z39 getLegacyTextFieldState() {
        return this.f73120Y;
    }

    @Override // p000.t39.InterfaceC12899a
    @gib
    public suf getSoftwareKeyboardController() {
        return (suf) nn2.currentValueOf(this, sn2.getLocalSoftwareKeyboardController());
    }

    @Override // p000.t39.InterfaceC12899a
    @yfb
    public osg getTextFieldSelectionManager() {
        return this.f73121Z;
    }

    @Override // p000.t39.InterfaceC12899a
    @yfb
    public u8i getViewConfiguration() {
        return (u8i) nn2.currentValueOf(this, sn2.getLocalViewConfiguration());
    }

    @Override // p000.t39.InterfaceC12899a
    @gib
    public jj8 launchTextInputSession(@yfb gz6<? super xxc, ? super zy2<?>, ? extends Object> gz6Var) {
        if (isAttached()) {
            return fg1.launch$default(getCoroutineScope(), null, b23.f12444d, new C11286a(gz6Var, null), 1, null);
        }
        return null;
    }

    @Override // androidx.compose.p002ui.InterfaceC0701e.d
    public void onAttach() {
        this.f73119X.registerModifier(this);
    }

    @Override // androidx.compose.p002ui.InterfaceC0701e.d
    public void onDetach() {
        this.f73119X.unregisterModifier(this);
    }

    @Override // p000.o77
    public void onGloballyPositioned(@yfb mv8 mv8Var) {
        setLayoutCoordinates(mv8Var);
    }

    public void setLegacyTextFieldState(@yfb z39 z39Var) {
        this.f73120Y = z39Var;
    }

    public final void setServiceAdapter(@yfb t39 t39Var) {
        if (isAttached()) {
            this.f73119X.stopInput();
            this.f73119X.unregisterModifier(this);
        }
        this.f73119X = t39Var;
        if (isAttached()) {
            this.f73119X.registerModifier(this);
        }
    }

    public void setTextFieldSelectionManager(@yfb osg osgVar) {
        this.f73121Z = osgVar;
    }
}
