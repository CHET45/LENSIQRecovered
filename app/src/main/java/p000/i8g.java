package p000;

import p000.jbd;

/* JADX INFO: loaded from: classes7.dex */
@yjd
public final class i8g implements lp8<String> {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final i8g f46073a = new i8g();

    /* JADX INFO: renamed from: b */
    @yfb
    public static final f0f f46074b = new nbd("kotlin.String", jbd.C7852i.f50259a);

    private i8g() {
    }

    @Override // p000.lp8, p000.e1f, p000.t74
    @yfb
    public f0f getDescriptor() {
        return f46074b;
    }

    @Override // p000.t74
    @yfb
    public String deserialize(@yfb jl3 jl3Var) {
        md8.checkNotNullParameter(jl3Var, "decoder");
        return jl3Var.decodeString();
    }

    @Override // p000.e1f
    public void serialize(@yfb m15 m15Var, @yfb String str) {
        md8.checkNotNullParameter(m15Var, "encoder");
        md8.checkNotNullParameter(str, "value");
        m15Var.encodeString(str);
    }
}
