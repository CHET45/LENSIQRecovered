package p000;

/* JADX INFO: loaded from: classes7.dex */
@yjd
public final class fth implements lp8<bth> {

    /* JADX INFO: renamed from: b */
    @yfb
    public static final fth f37729b = new fth();

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ kkb<bth> f37730a = new kkb<>("kotlin.Unit", bth.f14751a);

    private fth() {
    }

    /* JADX INFO: renamed from: deserialize, reason: collision with other method in class */
    public void m29663deserialize(@yfb jl3 jl3Var) {
        md8.checkNotNullParameter(jl3Var, "decoder");
        this.f37730a.deserialize(jl3Var);
    }

    @Override // p000.lp8, p000.e1f, p000.t74
    @yfb
    public f0f getDescriptor() {
        return this.f37730a.getDescriptor();
    }

    @Override // p000.e1f
    public void serialize(@yfb m15 m15Var, @yfb bth bthVar) {
        md8.checkNotNullParameter(m15Var, "encoder");
        md8.checkNotNullParameter(bthVar, "value");
        this.f37730a.serialize(m15Var, bthVar);
    }

    @Override // p000.t74
    public /* bridge */ /* synthetic */ Object deserialize(jl3 jl3Var) {
        m29663deserialize(jl3Var);
        return bth.f14751a;
    }
}
