package p000;

import androidx.compose.p002ui.InterfaceC0701e;

/* JADX INFO: loaded from: classes.dex */
public final class s22 extends InterfaceC0701e.d implements rxe {

    /* JADX INFO: renamed from: M1 */
    @yfb
    public ny6<bth> f80410M1;

    /* JADX INFO: renamed from: V1 */
    @gib
    public String f80411V1;

    /* JADX INFO: renamed from: X */
    public boolean f80412X;

    /* JADX INFO: renamed from: Y */
    @gib
    public String f80413Y;

    /* JADX INFO: renamed from: Z */
    @gib
    public jae f80414Z;

    /* JADX INFO: renamed from: Z1 */
    @gib
    public ny6<bth> f80415Z1;

    /* JADX INFO: renamed from: s22$a */
    public static final class C12403a extends tt8 implements ny6<Boolean> {
        public C12403a() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p000.ny6
        @yfb
        public final Boolean invoke() {
            s22.this.f80410M1.invoke();
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: renamed from: s22$b */
    public static final class C12404b extends tt8 implements ny6<Boolean> {
        public C12404b() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p000.ny6
        @yfb
        public final Boolean invoke() {
            ny6 ny6Var = s22.this.f80415Z1;
            if (ny6Var != null) {
                ny6Var.invoke();
            }
            return Boolean.TRUE;
        }
    }

    public /* synthetic */ s22(boolean z, String str, jae jaeVar, ny6 ny6Var, String str2, ny6 ny6Var2, jt3 jt3Var) {
        this(z, str, jaeVar, ny6Var, str2, ny6Var2);
    }

    @Override // p000.rxe
    public void applySemantics(@yfb eye eyeVar) {
        jae jaeVar = this.f80414Z;
        if (jaeVar != null) {
            md8.checkNotNull(jaeVar);
            bye.m28185setRolekuIjeqM(eyeVar, jaeVar.m30500unboximpl());
        }
        bye.onClick(eyeVar, this.f80413Y, new C12403a());
        if (this.f80415Z1 != null) {
            bye.onLongClick(eyeVar, this.f80411V1, new C12404b());
        }
        if (this.f80412X) {
            return;
        }
        bye.disabled(eyeVar);
    }

    @Override // p000.rxe
    public boolean getShouldMergeDescendantSemantics() {
        return true;
    }

    /* JADX INFO: renamed from: update-UMe6uN4, reason: not valid java name */
    public final void m32255updateUMe6uN4(boolean z, @gib String str, @gib jae jaeVar, @yfb ny6<bth> ny6Var, @gib String str2, @gib ny6<bth> ny6Var2) {
        this.f80412X = z;
        this.f80413Y = str;
        this.f80414Z = jaeVar;
        this.f80410M1 = ny6Var;
        this.f80411V1 = str2;
        this.f80415Z1 = ny6Var2;
    }

    private s22(boolean z, String str, jae jaeVar, ny6<bth> ny6Var, String str2, ny6<bth> ny6Var2) {
        this.f80412X = z;
        this.f80413Y = str;
        this.f80414Z = jaeVar;
        this.f80410M1 = ny6Var;
        this.f80411V1 = str2;
        this.f80415Z1 = ny6Var2;
    }
}
