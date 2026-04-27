package p000;

import p000.jbd;

/* JADX INFO: loaded from: classes7.dex */
@yjd
public final class wl9 implements lp8<Long> {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final wl9 f94628a = new wl9();

    /* JADX INFO: renamed from: b */
    @yfb
    public static final f0f f94629b = new nbd("kotlin.Long", jbd.C7850g.f50257a);

    private wl9() {
    }

    @Override // p000.lp8, p000.e1f, p000.t74
    @yfb
    public f0f getDescriptor() {
        return f94629b;
    }

    @Override // p000.e1f
    public /* bridge */ /* synthetic */ void serialize(m15 m15Var, Object obj) {
        serialize(m15Var, ((Number) obj).longValue());
    }

    @Override // p000.t74
    @yfb
    public Long deserialize(@yfb jl3 jl3Var) {
        md8.checkNotNullParameter(jl3Var, "decoder");
        return Long.valueOf(jl3Var.decodeLong());
    }

    public void serialize(@yfb m15 m15Var, long j) {
        md8.checkNotNullParameter(m15Var, "encoder");
        m15Var.encodeLong(j);
    }
}
