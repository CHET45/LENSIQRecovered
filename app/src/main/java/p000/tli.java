package p000;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 1)
public final class tli implements sli {

    /* JADX INFO: renamed from: c */
    public static final int f85290c = 0;

    /* JADX INFO: renamed from: a */
    @yfb
    public final z6b<Boolean> f85292a = xtf.mutableStateOf$default(Boolean.FALSE, null, 2, null);

    /* JADX INFO: renamed from: b */
    @yfb
    public static final C13100a f85289b = new C13100a(null);

    /* JADX INFO: renamed from: d */
    @yfb
    public static final z6b<x2d> f85291d = xtf.mutableStateOf$default(x2d.m33174boximpl(y1d.EmptyPointerKeyboardModifiers()), null, 2, null);

    /* JADX INFO: renamed from: tli$a */
    public static final class C13100a {
        public /* synthetic */ C13100a(jt3 jt3Var) {
            this();
        }

        @yfb
        public final z6b<x2d> getGlobalKeyboardModifiers$ui_release() {
            return tli.f85291d;
        }

        private C13100a() {
        }
    }

    /* JADX INFO: renamed from: getKeyboardModifiers-k7X9c1A$annotations, reason: not valid java name */
    public static /* synthetic */ void m32416getKeyboardModifiersk7X9c1A$annotations() {
    }

    @Override // p000.sli
    @ug5
    /* JADX INFO: renamed from: getKeyboardModifiers-k7X9c1A */
    public int mo32311getKeyboardModifiersk7X9c1A() {
        return f85291d.getValue().m33180unboximpl();
    }

    @Override // p000.sli
    public boolean isWindowFocused() {
        return this.f85292a.getValue().booleanValue();
    }

    /* JADX INFO: renamed from: setKeyboardModifiers-5xRPYO0, reason: not valid java name */
    public void m32417setKeyboardModifiers5xRPYO0(int i) {
        f85291d.setValue(x2d.m33174boximpl(i));
    }

    public void setWindowFocused(boolean z) {
        this.f85292a.setValue(Boolean.valueOf(z));
    }
}
