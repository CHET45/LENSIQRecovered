package p000;

import androidx.compose.p002ui.InterfaceC0701e;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public final class dxa {

    /* JADX INFO: renamed from: d */
    public static final int f31248d = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final InterfaceC0701e f31249a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final mv8 f31250b;

    /* JADX INFO: renamed from: c */
    @gib
    public final Object f31251c;

    public dxa(@yfb InterfaceC0701e interfaceC0701e, @yfb mv8 mv8Var, @gib Object obj) {
        this.f31249a = interfaceC0701e;
        this.f31250b = mv8Var;
        this.f31251c = obj;
    }

    @yfb
    public final mv8 getCoordinates() {
        return this.f31250b;
    }

    @gib
    public final Object getExtra() {
        return this.f31251c;
    }

    @yfb
    public final InterfaceC0701e getModifier() {
        return this.f31249a;
    }

    @yfb
    public String toString() {
        return "ModifierInfo(" + this.f31249a + ", " + this.f31250b + ", " + this.f31251c + ')';
    }

    public /* synthetic */ dxa(InterfaceC0701e interfaceC0701e, mv8 mv8Var, Object obj, int i, jt3 jt3Var) {
        this(interfaceC0701e, mv8Var, (i & 4) != 0 ? null : obj);
    }
}
