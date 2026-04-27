package p000;

/* JADX INFO: loaded from: classes7.dex */
@yjd
public final class moh implements lp8<goh> {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final moh f61636a = new moh();

    /* JADX INFO: renamed from: b */
    @yfb
    public static final f0f f61637b = e28.InlinePrimitiveDescriptor("kotlin.UByte", hg1.serializer(kj1.f54244a));

    private moh() {
    }

    @Override // p000.t74
    public /* bridge */ /* synthetic */ Object deserialize(jl3 jl3Var) {
        return goh.m29780boximpl(m31031deserializeWa3L5BU(jl3Var));
    }

    /* JADX INFO: renamed from: deserialize-Wa3L5BU, reason: not valid java name */
    public byte m31031deserializeWa3L5BU(@yfb jl3 jl3Var) {
        md8.checkNotNullParameter(jl3Var, "decoder");
        return goh.m29786constructorimpl(jl3Var.decodeInline(getDescriptor()).decodeByte());
    }

    @Override // p000.lp8, p000.e1f, p000.t74
    @yfb
    public f0f getDescriptor() {
        return f61637b;
    }

    @Override // p000.e1f
    public /* bridge */ /* synthetic */ void serialize(m15 m15Var, Object obj) {
        m31032serializeEK6454(m15Var, ((goh) obj).m29836unboximpl());
    }

    /* JADX INFO: renamed from: serialize-EK-6454, reason: not valid java name */
    public void m31032serializeEK6454(@yfb m15 m15Var, byte b) {
        md8.checkNotNullParameter(m15Var, "encoder");
        m15Var.encodeInline(getDescriptor()).encodeByte(b);
    }
}
