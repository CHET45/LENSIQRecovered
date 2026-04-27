package p000;

import p000.jbd;

/* JADX INFO: loaded from: classes7.dex */
@yjd
public final class kt4 implements lp8<bt4> {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final kt4 f55286a = new kt4();

    /* JADX INFO: renamed from: b */
    @yfb
    public static final f0f f55287b = new nbd("kotlin.time.Duration", jbd.C7852i.f50259a);

    private kt4() {
    }

    @Override // p000.t74
    public /* bridge */ /* synthetic */ Object deserialize(jl3 jl3Var) {
        return bt4.m28057boximpl(m30749deserialize5sfh64U(jl3Var));
    }

    /* JADX INFO: renamed from: deserialize-5sfh64U, reason: not valid java name */
    public long m30749deserialize5sfh64U(@yfb jl3 jl3Var) {
        md8.checkNotNullParameter(jl3Var, "decoder");
        return bt4.f14711b.m28152parseIsoStringUwyO8pc(jl3Var.decodeString());
    }

    @Override // p000.lp8, p000.e1f, p000.t74
    @yfb
    public f0f getDescriptor() {
        return f55287b;
    }

    @Override // p000.e1f
    public /* bridge */ /* synthetic */ void serialize(m15 m15Var, Object obj) {
        m30750serializeHG0u8IE(m15Var, ((bt4) obj).m28105unboximpl());
    }

    /* JADX INFO: renamed from: serialize-HG0u8IE, reason: not valid java name */
    public void m30750serializeHG0u8IE(@yfb m15 m15Var, long j) {
        md8.checkNotNullParameter(m15Var, "encoder");
        m15Var.encodeString(bt4.m28097toIsoStringimpl(j));
    }
}
