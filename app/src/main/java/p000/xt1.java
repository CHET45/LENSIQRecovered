package p000;

/* JADX INFO: loaded from: classes.dex */
@vw7
public final class xt1 {

    /* JADX INFO: renamed from: e */
    public static final int f99166e = 0;

    /* JADX INFO: renamed from: a */
    @yfb
    public final InterfaceC9407mm f99167a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final qy6<r78, r78> f99168b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final fw5<r78> f99169c;

    /* JADX INFO: renamed from: d */
    public final boolean f99170d;

    /* JADX INFO: renamed from: xt1$a */
    public static final class C15271a extends tt8 implements qy6<r78, r78> {

        /* JADX INFO: renamed from: a */
        public static final C15271a f99171a = new C15271a();

        public C15271a() {
            super(1);
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ r78 invoke(r78 r78Var) {
            return r78.m32079boximpl(m33271invokemzRDjE0(r78Var.m32091unboximpl()));
        }

        /* JADX INFO: renamed from: invoke-mzRDjE0, reason: not valid java name */
        public final long m33271invokemzRDjE0(long j) {
            return s78.IntSize(0, 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public xt1(@yfb InterfaceC9407mm interfaceC9407mm, @yfb qy6<? super r78, r78> qy6Var, @yfb fw5<r78> fw5Var, boolean z) {
        this.f99167a = interfaceC9407mm;
        this.f99168b = qy6Var;
        this.f99169c = fw5Var;
        this.f99170d = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ xt1 copy$default(xt1 xt1Var, InterfaceC9407mm interfaceC9407mm, qy6 qy6Var, fw5 fw5Var, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            interfaceC9407mm = xt1Var.f99167a;
        }
        if ((i & 2) != 0) {
            qy6Var = xt1Var.f99168b;
        }
        if ((i & 4) != 0) {
            fw5Var = xt1Var.f99169c;
        }
        if ((i & 8) != 0) {
            z = xt1Var.f99170d;
        }
        return xt1Var.copy(interfaceC9407mm, qy6Var, fw5Var, z);
    }

    @yfb
    public final InterfaceC9407mm component1() {
        return this.f99167a;
    }

    @yfb
    public final qy6<r78, r78> component2() {
        return this.f99168b;
    }

    @yfb
    public final fw5<r78> component3() {
        return this.f99169c;
    }

    public final boolean component4() {
        return this.f99170d;
    }

    @yfb
    public final xt1 copy(@yfb InterfaceC9407mm interfaceC9407mm, @yfb qy6<? super r78, r78> qy6Var, @yfb fw5<r78> fw5Var, boolean z) {
        return new xt1(interfaceC9407mm, qy6Var, fw5Var, z);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xt1)) {
            return false;
        }
        xt1 xt1Var = (xt1) obj;
        return md8.areEqual(this.f99167a, xt1Var.f99167a) && md8.areEqual(this.f99168b, xt1Var.f99168b) && md8.areEqual(this.f99169c, xt1Var.f99169c) && this.f99170d == xt1Var.f99170d;
    }

    @yfb
    public final InterfaceC9407mm getAlignment() {
        return this.f99167a;
    }

    @yfb
    public final fw5<r78> getAnimationSpec() {
        return this.f99169c;
    }

    public final boolean getClip() {
        return this.f99170d;
    }

    @yfb
    public final qy6<r78, r78> getSize() {
        return this.f99168b;
    }

    public int hashCode() {
        return (((((this.f99167a.hashCode() * 31) + this.f99168b.hashCode()) * 31) + this.f99169c.hashCode()) * 31) + Boolean.hashCode(this.f99170d);
    }

    @yfb
    public String toString() {
        return "ChangeSize(alignment=" + this.f99167a + ", size=" + this.f99168b + ", animationSpec=" + this.f99169c + ", clip=" + this.f99170d + ')';
    }

    public /* synthetic */ xt1(InterfaceC9407mm interfaceC9407mm, qy6 qy6Var, fw5 fw5Var, boolean z, int i, jt3 jt3Var) {
        this(interfaceC9407mm, (i & 2) != 0 ? C15271a.f99171a : qy6Var, fw5Var, (i & 8) != 0 ? true : z);
    }
}
