package p000;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nLegacyPlatformTextInputServiceAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LegacyPlatformTextInputServiceAdapter.kt\nandroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,80:1\n1#2:81\n*E\n"})
@e0g(parameters = 0)
public abstract class t39 implements wxc {

    /* JADX INFO: renamed from: b */
    public static final int f83615b = 8;

    /* JADX INFO: renamed from: a */
    @gib
    public InterfaceC12899a f83616a;

    /* JADX INFO: renamed from: t39$a */
    public interface InterfaceC12899a {
        @gib
        mv8 getLayoutCoordinates();

        @gib
        z39 getLegacyTextFieldState();

        @gib
        suf getSoftwareKeyboardController();

        @gib
        osg getTextFieldSelectionManager();

        @yfb
        u8i getViewConfiguration();

        @gib
        jj8 launchTextInputSession(@yfb gz6<? super xxc, ? super zy2<?>, ? extends Object> gz6Var);
    }

    @gib
    /* JADX INFO: renamed from: a */
    public final InterfaceC12899a m22351a() {
        return this.f83616a;
    }

    @Override // p000.wxc
    public final void hideSoftwareKeyboard() {
        suf softwareKeyboardController;
        InterfaceC12899a interfaceC12899a = this.f83616a;
        if (interfaceC12899a == null || (softwareKeyboardController = interfaceC12899a.getSoftwareKeyboardController()) == null) {
            return;
        }
        softwareKeyboardController.hide();
    }

    public final void registerModifier(@yfb InterfaceC12899a interfaceC12899a) {
        if (this.f83616a != null) {
            throw new IllegalStateException("Expected textInputModifierNode to be null");
        }
        this.f83616a = interfaceC12899a;
    }

    @Override // p000.wxc
    public final void showSoftwareKeyboard() {
        suf softwareKeyboardController;
        InterfaceC12899a interfaceC12899a = this.f83616a;
        if (interfaceC12899a == null || (softwareKeyboardController = interfaceC12899a.getSoftwareKeyboardController()) == null) {
            return;
        }
        softwareKeyboardController.show();
    }

    public abstract void startStylusHandwriting();

    public final void unregisterModifier(@yfb InterfaceC12899a interfaceC12899a) {
        if (this.f83616a == interfaceC12899a) {
            this.f83616a = null;
            return;
        }
        throw new IllegalStateException(("Expected textInputModifierNode to be " + interfaceC12899a + " but was " + this.f83616a).toString());
    }
}
