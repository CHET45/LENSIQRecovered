package p000;

import androidx.compose.p002ui.InterfaceC0701e;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public final class xre extends InterfaceC0701e.d implements shh {

    /* JADX INFO: renamed from: X */
    @yfb
    public final Object f99069X = f99068Z;

    /* JADX INFO: renamed from: Y */
    public boolean f99070Y;

    /* JADX INFO: renamed from: Z */
    @yfb
    public static final C15263a f99068Z = new C15263a(null);

    /* JADX INFO: renamed from: M1 */
    public static final int f99067M1 = 8;

    /* JADX INFO: renamed from: xre$a */
    public static final class C15263a {
        public /* synthetic */ C15263a(jt3 jt3Var) {
            this();
        }

        private C15263a() {
        }
    }

    public xre(boolean z) {
        this.f99070Y = z;
    }

    public final boolean getEnabled() {
        return this.f99070Y;
    }

    @Override // p000.shh
    @yfb
    public Object getTraverseKey() {
        return this.f99069X;
    }

    public final void update(boolean z) {
        this.f99070Y = z;
    }
}
