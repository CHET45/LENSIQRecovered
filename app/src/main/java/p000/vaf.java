package p000;

import p000.jbd;

/* JADX INFO: loaded from: classes7.dex */
@yjd
public final class vaf implements lp8<Short> {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final vaf f90484a = new vaf();

    /* JADX INFO: renamed from: b */
    @yfb
    public static final f0f f90485b = new nbd("kotlin.Short", jbd.C7851h.f50258a);

    private vaf() {
    }

    @Override // p000.lp8, p000.e1f, p000.t74
    @yfb
    public f0f getDescriptor() {
        return f90485b;
    }

    @Override // p000.e1f
    public /* bridge */ /* synthetic */ void serialize(m15 m15Var, Object obj) {
        serialize(m15Var, ((Number) obj).shortValue());
    }

    @Override // p000.t74
    @yfb
    public Short deserialize(@yfb jl3 jl3Var) {
        md8.checkNotNullParameter(jl3Var, "decoder");
        return Short.valueOf(jl3Var.decodeShort());
    }

    public void serialize(@yfb m15 m15Var, short s) {
        md8.checkNotNullParameter(m15Var, "encoder");
        m15Var.encodeShort(s);
    }
}
