package p000;

import p000.jbd;

/* JADX INFO: loaded from: classes7.dex */
@yjd
public final class fk4 implements lp8<Double> {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final fk4 f36907a = new fk4();

    /* JADX INFO: renamed from: b */
    @yfb
    public static final f0f f36908b = new nbd("kotlin.Double", jbd.C7847d.f50254a);

    private fk4() {
    }

    @Override // p000.lp8, p000.e1f, p000.t74
    @yfb
    public f0f getDescriptor() {
        return f36908b;
    }

    @Override // p000.e1f
    public /* bridge */ /* synthetic */ void serialize(m15 m15Var, Object obj) {
        serialize(m15Var, ((Number) obj).doubleValue());
    }

    @Override // p000.t74
    @yfb
    public Double deserialize(@yfb jl3 jl3Var) {
        md8.checkNotNullParameter(jl3Var, "decoder");
        return Double.valueOf(jl3Var.decodeDouble());
    }

    public void serialize(@yfb m15 m15Var, double d) {
        md8.checkNotNullParameter(m15Var, "encoder");
        m15Var.encodeDouble(d);
    }
}
