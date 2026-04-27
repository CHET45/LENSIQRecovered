package p000;

import p000.jbd;

/* JADX INFO: loaded from: classes7.dex */
public final class vk9 implements lp8<Long> {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final vk9 f91523a = new vk9();

    /* JADX INFO: renamed from: b */
    @yfb
    public static final f0f f91524b = n0f.PrimitiveSerialDescriptor("kotlinx.serialization.LongAsStringSerializer", jbd.C7852i.f50259a);

    private vk9() {
    }

    @Override // p000.lp8, p000.e1f, p000.t74
    @yfb
    public f0f getDescriptor() {
        return f91524b;
    }

    @Override // p000.e1f
    public /* bridge */ /* synthetic */ void serialize(m15 m15Var, Object obj) {
        serialize(m15Var, ((Number) obj).longValue());
    }

    @Override // p000.t74
    @yfb
    public Long deserialize(@yfb jl3 jl3Var) {
        md8.checkNotNullParameter(jl3Var, "decoder");
        return Long.valueOf(Long.parseLong(jl3Var.decodeString()));
    }

    public void serialize(@yfb m15 m15Var, long j) {
        md8.checkNotNullParameter(m15Var, "encoder");
        m15Var.encodeString(String.valueOf(j));
    }
}
