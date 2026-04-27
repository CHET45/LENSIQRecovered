package p000;

import androidx.emoji2.text.C1035c;

/* JADX INFO: loaded from: classes.dex */
public final class cw3 implements vy4 {

    /* JADX INFO: renamed from: a */
    @gib
    public i2g<Boolean> f27913a;

    /* JADX INFO: renamed from: cw3$a */
    public static final class C4539a extends C1035c.g {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ z6b<Boolean> f27914a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ cw3 f27915b;

        public C4539a(z6b<Boolean> z6bVar, cw3 cw3Var) {
            this.f27914a = z6bVar;
            this.f27915b = cw3Var;
        }

        @Override // androidx.emoji2.text.C1035c.g
        public void onFailed(@gib Throwable th) {
            this.f27915b.f27913a = wy4.f95698a;
        }

        @Override // androidx.emoji2.text.C1035c.g
        public void onInitialized() {
            this.f27914a.setValue(Boolean.TRUE);
            this.f27915b.f27913a = new yw7(true);
        }
    }

    public cw3() {
        this.f27913a = C1035c.isConfigured() ? getFontLoadState() : null;
    }

    private final i2g<Boolean> getFontLoadState() {
        C1035c c1035c = C1035c.get();
        if (c1035c.getLoadState() == 1) {
            return new yw7(true);
        }
        z6b z6bVarMutableStateOf$default = xtf.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        c1035c.registerInitCallback(new C4539a(z6bVarMutableStateOf$default, this));
        return z6bVarMutableStateOf$default;
    }

    @Override // p000.vy4
    @yfb
    public i2g<Boolean> getFontLoaded() {
        i2g<Boolean> i2gVar = this.f27913a;
        if (i2gVar != null) {
            md8.checkNotNull(i2gVar);
            return i2gVar;
        }
        if (!C1035c.isConfigured()) {
            return wy4.f95698a;
        }
        i2g<Boolean> fontLoadState = getFontLoadState();
        this.f27913a = fontLoadState;
        md8.checkNotNull(fontLoadState);
        return fontLoadState;
    }
}
