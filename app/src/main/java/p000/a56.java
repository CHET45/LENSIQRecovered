package p000;

import p000.jbd;

/* JADX INFO: loaded from: classes7.dex */
@yjd
public final class a56 implements lp8<Float> {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final a56 f424a = new a56();

    /* JADX INFO: renamed from: b */
    @yfb
    public static final f0f f425b = new nbd("kotlin.Float", jbd.C7848e.f50255a);

    private a56() {
    }

    @Override // p000.lp8, p000.e1f, p000.t74
    @yfb
    public f0f getDescriptor() {
        return f425b;
    }

    @Override // p000.e1f
    public /* bridge */ /* synthetic */ void serialize(m15 m15Var, Object obj) {
        serialize(m15Var, ((Number) obj).floatValue());
    }

    @Override // p000.t74
    @yfb
    public Float deserialize(@yfb jl3 jl3Var) {
        md8.checkNotNullParameter(jl3Var, "decoder");
        return Float.valueOf(jl3Var.decodeFloat());
    }

    public void serialize(@yfb m15 m15Var, float f) {
        md8.checkNotNullParameter(m15Var, "encoder");
        m15Var.encodeFloat(f);
    }
}
