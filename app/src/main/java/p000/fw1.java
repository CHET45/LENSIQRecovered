package p000;

import p000.jbd;

/* JADX INFO: loaded from: classes7.dex */
@yjd
public final class fw1 implements lp8<Character> {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final fw1 f37857a = new fw1();

    /* JADX INFO: renamed from: b */
    @yfb
    public static final f0f f37858b = new nbd("kotlin.Char", jbd.C7846c.f50253a);

    private fw1() {
    }

    @Override // p000.lp8, p000.e1f, p000.t74
    @yfb
    public f0f getDescriptor() {
        return f37858b;
    }

    @Override // p000.e1f
    public /* bridge */ /* synthetic */ void serialize(m15 m15Var, Object obj) {
        serialize(m15Var, ((Character) obj).charValue());
    }

    @Override // p000.t74
    @yfb
    public Character deserialize(@yfb jl3 jl3Var) {
        md8.checkNotNullParameter(jl3Var, "decoder");
        return Character.valueOf(jl3Var.decodeChar());
    }

    public void serialize(@yfb m15 m15Var, char c) {
        md8.checkNotNullParameter(m15Var, "encoder");
        m15Var.encodeChar(c);
    }
}
