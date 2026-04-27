package p000;

/* JADX INFO: loaded from: classes7.dex */
@yjd
public final class oqh implements lp8<iqh> {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final oqh f68332a = new oqh();

    /* JADX INFO: renamed from: b */
    @yfb
    public static final f0f f68333b = e28.InlinePrimitiveDescriptor("kotlin.UShort", hg1.serializer(taf.f84093a));

    private oqh() {
    }

    @Override // p000.t74
    public /* bridge */ /* synthetic */ Object deserialize(jl3 jl3Var) {
        return iqh.m30318boximpl(m31595deserializeBwKQO78(jl3Var));
    }

    /* JADX INFO: renamed from: deserialize-BwKQO78, reason: not valid java name */
    public short m31595deserializeBwKQO78(@yfb jl3 jl3Var) {
        md8.checkNotNullParameter(jl3Var, "decoder");
        return iqh.m30324constructorimpl(jl3Var.decodeInline(getDescriptor()).decodeShort());
    }

    @Override // p000.lp8, p000.e1f, p000.t74
    @yfb
    public f0f getDescriptor() {
        return f68333b;
    }

    @Override // p000.e1f
    public /* bridge */ /* synthetic */ void serialize(m15 m15Var, Object obj) {
        m31596serializei8woANY(m15Var, ((iqh) obj).m30374unboximpl());
    }

    /* JADX INFO: renamed from: serialize-i8woANY, reason: not valid java name */
    public void m31596serializei8woANY(@yfb m15 m15Var, short s) {
        md8.checkNotNullParameter(m15Var, "encoder");
        m15Var.encodeInline(getDescriptor()).encodeShort(s);
    }
}
