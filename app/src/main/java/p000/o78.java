package p000;

import p000.jbd;

/* JADX INFO: loaded from: classes7.dex */
@yjd
public final class o78 implements lp8<Integer> {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final o78 f66598a = new o78();

    /* JADX INFO: renamed from: b */
    @yfb
    public static final f0f f66599b = new nbd("kotlin.Int", jbd.C7849f.f50256a);

    private o78() {
    }

    @Override // p000.lp8, p000.e1f, p000.t74
    @yfb
    public f0f getDescriptor() {
        return f66599b;
    }

    @Override // p000.e1f
    public /* bridge */ /* synthetic */ void serialize(m15 m15Var, Object obj) {
        serialize(m15Var, ((Number) obj).intValue());
    }

    @Override // p000.t74
    @yfb
    public Integer deserialize(@yfb jl3 jl3Var) {
        md8.checkNotNullParameter(jl3Var, "decoder");
        return Integer.valueOf(jl3Var.decodeInt());
    }

    public void serialize(@yfb m15 m15Var, int i) {
        md8.checkNotNullParameter(m15Var, "encoder");
        m15Var.encodeInt(i);
    }
}
