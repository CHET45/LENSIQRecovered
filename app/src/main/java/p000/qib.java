package p000;

/* JADX INFO: loaded from: classes7.dex */
@yjd
public final class qib<T> implements lp8<T> {

    /* JADX INFO: renamed from: a */
    @yfb
    public final lp8<T> f74535a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final f0f f74536b;

    public qib(@yfb lp8<T> lp8Var) {
        md8.checkNotNullParameter(lp8Var, "serializer");
        this.f74535a = lp8Var;
        this.f74536b = new g0f(lp8Var.getDescriptor());
    }

    @Override // p000.t74
    @gib
    public T deserialize(@yfb jl3 jl3Var) {
        md8.checkNotNullParameter(jl3Var, "decoder");
        return jl3Var.decodeNotNullMark() ? (T) jl3Var.decodeSerializableValue(this.f74535a) : (T) jl3Var.decodeNull();
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && qib.class == obj.getClass() && md8.areEqual(this.f74535a, ((qib) obj).f74535a);
    }

    @Override // p000.lp8, p000.e1f, p000.t74
    @yfb
    public f0f getDescriptor() {
        return this.f74536b;
    }

    public int hashCode() {
        return this.f74535a.hashCode();
    }

    @Override // p000.e1f
    public void serialize(@yfb m15 m15Var, @gib T t) {
        md8.checkNotNullParameter(m15Var, "encoder");
        if (t == null) {
            m15Var.encodeNull();
        } else {
            m15Var.encodeNotNullMark();
            m15Var.encodeSerializableValue(this.f74535a, t);
        }
    }
}
