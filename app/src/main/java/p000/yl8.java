package p000;

import p000.u0f;

/* JADX INFO: loaded from: classes7.dex */
@yjd
public final class yl8 implements lp8<xl8> {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final yl8 f102014a = new yl8();

    /* JADX INFO: renamed from: b */
    @yfb
    public static final f0f f102015b = n0f.buildSerialDescriptor$default("kotlinx.serialization.json.JsonNull", u0f.C13312b.f86523a, new f0f[0], null, 8, null);

    private yl8() {
    }

    @Override // p000.lp8, p000.e1f, p000.t74
    @yfb
    public f0f getDescriptor() {
        return f102015b;
    }

    @Override // p000.t74
    @yfb
    public xl8 deserialize(@yfb jl3 jl3Var) {
        md8.checkNotNullParameter(jl3Var, "decoder");
        dl8.verify(jl3Var);
        if (jl3Var.decodeNotNullMark()) {
            throw new qk8("Expected 'null' literal");
        }
        jl3Var.decodeNull();
        return xl8.INSTANCE;
    }

    @Override // p000.e1f
    public void serialize(@yfb m15 m15Var, @yfb xl8 xl8Var) {
        md8.checkNotNullParameter(m15Var, "encoder");
        md8.checkNotNullParameter(xl8Var, "value");
        dl8.verify(m15Var);
        m15Var.encodeNull();
    }
}
