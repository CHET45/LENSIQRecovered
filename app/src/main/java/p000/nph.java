package p000;

/* JADX INFO: loaded from: classes7.dex */
@yjd
public final class nph implements lp8<woh> {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final nph f65234a = new nph();

    /* JADX INFO: renamed from: b */
    @yfb
    public static final f0f f65235b = e28.InlinePrimitiveDescriptor("kotlin.UInt", hg1.serializer(f68.f35480a));

    private nph() {
    }

    @Override // p000.t74
    public /* bridge */ /* synthetic */ Object deserialize(jl3 jl3Var) {
        return woh.m32998boximpl(m31177deserializeOGnWXxg(jl3Var));
    }

    /* JADX INFO: renamed from: deserialize-OGnWXxg, reason: not valid java name */
    public int m31177deserializeOGnWXxg(@yfb jl3 jl3Var) {
        md8.checkNotNullParameter(jl3Var, "decoder");
        return woh.m33004constructorimpl(jl3Var.decodeInline(getDescriptor()).decodeInt());
    }

    @Override // p000.lp8, p000.e1f, p000.t74
    @yfb
    public f0f getDescriptor() {
        return f65235b;
    }

    @Override // p000.e1f
    public /* bridge */ /* synthetic */ void serialize(m15 m15Var, Object obj) {
        m31178serializeQn1smSk(m15Var, ((woh) obj).m33056unboximpl());
    }

    /* JADX INFO: renamed from: serialize-Qn1smSk, reason: not valid java name */
    public void m31178serializeQn1smSk(@yfb m15 m15Var, int i) {
        md8.checkNotNullParameter(m15Var, "encoder");
        m15Var.encodeInline(getDescriptor()).encodeInt(i);
    }
}
