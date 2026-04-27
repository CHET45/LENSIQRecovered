package p000;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 1)
public final class yw2 extends cfh {

    /* JADX INFO: renamed from: d */
    @yfb
    public static final C15855a f103180d = new C15855a(null);

    /* JADX INFO: renamed from: e */
    public static final int f103181e = 0;

    /* JADX INFO: renamed from: b */
    @yfb
    public final ww2 f103182b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final InterfaceC9407mm f103183c;

    /* JADX INFO: renamed from: yw2$a */
    public static final class C15855a implements dfh<yw2> {
        public /* synthetic */ C15855a(jt3 jt3Var) {
            this();
        }

        private C15855a() {
        }
    }

    public yw2(@yfb ww2 ww2Var, @yfb InterfaceC9407mm interfaceC9407mm) {
        super(null);
        this.f103182b = ww2Var;
        this.f103183c = interfaceC9407mm;
    }

    public static /* synthetic */ yw2 copy$default(yw2 yw2Var, ww2 ww2Var, InterfaceC9407mm interfaceC9407mm, int i, Object obj) {
        if ((i & 1) != 0) {
            ww2Var = yw2Var.f103182b;
        }
        if ((i & 2) != 0) {
            interfaceC9407mm = yw2Var.f103183c;
        }
        return yw2Var.copy(ww2Var, interfaceC9407mm);
    }

    @yfb
    public final ww2 component1() {
        return this.f103182b;
    }

    @yfb
    public final InterfaceC9407mm component2() {
        return this.f103183c;
    }

    @yfb
    public final yw2 copy(@yfb ww2 ww2Var, @yfb InterfaceC9407mm interfaceC9407mm) {
        return new yw2(ww2Var, interfaceC9407mm);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yw2)) {
            return false;
        }
        yw2 yw2Var = (yw2) obj;
        return md8.areEqual(this.f103182b, yw2Var.f103182b) && md8.areEqual(this.f103183c, yw2Var.f103183c);
    }

    @yfb
    public final InterfaceC9407mm getAlignment() {
        return this.f103183c;
    }

    @yfb
    public final ww2 getContentScale() {
        return this.f103182b;
    }

    @Override // p000.cfh
    @yfb
    public dfh<?> getKey$animation_release() {
        return f103180d;
    }

    public int hashCode() {
        return (this.f103182b.hashCode() * 31) + this.f103183c.hashCode();
    }

    @yfb
    public String toString() {
        return "ContentScaleTransitionEffect(contentScale=" + this.f103182b + ", alignment=" + this.f103183c + ')';
    }
}
