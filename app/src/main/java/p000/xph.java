package p000;

/* JADX INFO: loaded from: classes7.dex */
@yjd
public final class xph implements lp8<oph> {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final xph f98886a = new xph();

    /* JADX INFO: renamed from: b */
    @yfb
    public static final f0f f98887b = e28.InlinePrimitiveDescriptor("kotlin.ULong", hg1.serializer(wk9.f94509a));

    private xph() {
    }

    @Override // p000.t74
    public /* bridge */ /* synthetic */ Object deserialize(jl3 jl3Var) {
        return oph.m31527boximpl(m33236deserializeI7RO_PI(jl3Var));
    }

    /* JADX INFO: renamed from: deserialize-I7RO_PI, reason: not valid java name */
    public long m33236deserializeI7RO_PI(@yfb jl3 jl3Var) {
        md8.checkNotNullParameter(jl3Var, "decoder");
        return oph.m31533constructorimpl(jl3Var.decodeInline(getDescriptor()).decodeLong());
    }

    @Override // p000.lp8, p000.e1f, p000.t74
    @yfb
    public f0f getDescriptor() {
        return f98887b;
    }

    @Override // p000.e1f
    public /* bridge */ /* synthetic */ void serialize(m15 m15Var, Object obj) {
        m33237serialize2TYgG_w(m15Var, ((oph) obj).m31585unboximpl());
    }

    /* JADX INFO: renamed from: serialize-2TYgG_w, reason: not valid java name */
    public void m33237serialize2TYgG_w(@yfb m15 m15Var, long j) {
        md8.checkNotNullParameter(m15Var, "encoder");
        m15Var.encodeInline(getDescriptor()).encodeLong(j);
    }
}
