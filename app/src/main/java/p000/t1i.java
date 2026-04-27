package p000;

import p000.jbd;

/* JADX INFO: loaded from: classes7.dex */
@yjd
@zh5
public final class t1i implements lp8<m1i> {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final t1i f83441a = new t1i();

    /* JADX INFO: renamed from: b */
    @yfb
    public static final f0f f83442b = new nbd("kotlin.uuid.Uuid", jbd.C7852i.f50259a);

    private t1i() {
    }

    @Override // p000.lp8, p000.e1f, p000.t74
    @yfb
    public f0f getDescriptor() {
        return f83442b;
    }

    @Override // p000.t74
    @yfb
    public m1i deserialize(@yfb jl3 jl3Var) {
        md8.checkNotNullParameter(jl3Var, "decoder");
        return m1i.f59664c.parse(jl3Var.decodeString());
    }

    @Override // p000.e1f
    public void serialize(@yfb m15 m15Var, @yfb m1i m1iVar) {
        md8.checkNotNullParameter(m15Var, "encoder");
        md8.checkNotNullParameter(m1iVar, "value");
        m15Var.encodeString(m1iVar.toString());
    }
}
