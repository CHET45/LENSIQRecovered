package p000;

import p000.jbd;

/* JADX INFO: loaded from: classes7.dex */
@yjd
public final class ya1 implements lp8<Boolean> {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final ya1 f100910a = new ya1();

    /* JADX INFO: renamed from: b */
    @yfb
    public static final f0f f100911b = new nbd("kotlin.Boolean", jbd.C7844a.f50251a);

    private ya1() {
    }

    @Override // p000.lp8, p000.e1f, p000.t74
    @yfb
    public f0f getDescriptor() {
        return f100911b;
    }

    @Override // p000.e1f
    public /* bridge */ /* synthetic */ void serialize(m15 m15Var, Object obj) {
        serialize(m15Var, ((Boolean) obj).booleanValue());
    }

    @Override // p000.t74
    @yfb
    public Boolean deserialize(@yfb jl3 jl3Var) {
        md8.checkNotNullParameter(jl3Var, "decoder");
        return Boolean.valueOf(jl3Var.decodeBoolean());
    }

    public void serialize(@yfb m15 m15Var, boolean z) {
        md8.checkNotNullParameter(m15Var, "encoder");
        m15Var.encodeBoolean(z);
    }
}
