package p000;

/* JADX INFO: loaded from: classes7.dex */
@yjd
public final class hgb implements lp8 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final hgb f43598a = new hgb();

    /* JADX INFO: renamed from: b */
    @yfb
    public static final f0f f43599b = ggb.f39773a;

    private hgb() {
    }

    @Override // p000.lp8, p000.e1f, p000.t74
    @yfb
    public f0f getDescriptor() {
        return f43599b;
    }

    @Override // p000.t74
    @yfb
    public Void deserialize(@yfb jl3 jl3Var) {
        md8.checkNotNullParameter(jl3Var, "decoder");
        throw new d1f("'kotlin.Nothing' does not have instances");
    }

    @Override // p000.e1f
    public void serialize(@yfb m15 m15Var, @yfb Void r3) {
        md8.checkNotNullParameter(m15Var, "encoder");
        md8.checkNotNullParameter(r3, "value");
        throw new d1f("'kotlin.Nothing' cannot be serialized");
    }
}
