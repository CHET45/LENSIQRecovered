package p000;

/* JADX INFO: loaded from: classes.dex */
public final class ksd {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final aid<isd> f55239a = jxa.modifierLocalOf(C8512a.f55240a);

    /* JADX INFO: renamed from: ksd$a */
    public static final class C8512a extends tt8 implements ny6<isd> {

        /* JADX INFO: renamed from: a */
        public static final C8512a f55240a = new C8512a();

        public C8512a() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p000.ny6
        @gib
        public final isd invoke() {
            return null;
        }
    }

    @yfb
    public static final aid<isd> getModifierLocalReceiveContent() {
        return f55239a;
    }

    @gib
    public static final isd getReceiveContentConfiguration(@yfb mxa mxaVar) {
        if (mxaVar.getNode().isAttached()) {
            return (isd) mxaVar.getCurrent(f55239a);
        }
        return null;
    }
}
