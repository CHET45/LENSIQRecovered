package p000;

import p000.jbd;

/* JADX INFO: loaded from: classes7.dex */
@yjd
public final class pj1 implements lp8<Byte> {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final pj1 f71062a = new pj1();

    /* JADX INFO: renamed from: b */
    @yfb
    public static final f0f f71063b = new nbd("kotlin.Byte", jbd.C7845b.f50252a);

    private pj1() {
    }

    @Override // p000.lp8, p000.e1f, p000.t74
    @yfb
    public f0f getDescriptor() {
        return f71063b;
    }

    @Override // p000.e1f
    public /* bridge */ /* synthetic */ void serialize(m15 m15Var, Object obj) {
        serialize(m15Var, ((Number) obj).byteValue());
    }

    @Override // p000.t74
    @yfb
    public Byte deserialize(@yfb jl3 jl3Var) {
        md8.checkNotNullParameter(jl3Var, "decoder");
        return Byte.valueOf(jl3Var.decodeByte());
    }

    public void serialize(@yfb m15 m15Var, byte b) {
        md8.checkNotNullParameter(m15Var, "encoder");
        m15Var.encodeByte(b);
    }
}
