package p000;

/* JADX INFO: loaded from: classes7.dex */
public abstract class pm8<T> implements lp8<T> {

    /* JADX INFO: renamed from: a */
    @yfb
    public final lp8<T> f71384a;

    public pm8(@yfb lp8<T> lp8Var) {
        md8.checkNotNullParameter(lp8Var, "tSerializer");
        this.f71384a = lp8Var;
    }

    @yfb
    /* JADX INFO: renamed from: a */
    public sk8 m19615a(@yfb sk8 sk8Var) {
        md8.checkNotNullParameter(sk8Var, "element");
        return sk8Var;
    }

    @yfb
    /* JADX INFO: renamed from: b */
    public sk8 m19616b(@yfb sk8 sk8Var) {
        md8.checkNotNullParameter(sk8Var, "element");
        return sk8Var;
    }

    @Override // p000.t74
    @yfb
    public final T deserialize(@yfb jl3 jl3Var) {
        md8.checkNotNullParameter(jl3Var, "decoder");
        ok8 ok8VarAsJsonDecoder = dl8.asJsonDecoder(jl3Var);
        return (T) ok8VarAsJsonDecoder.getJson().decodeFromJsonElement(this.f71384a, m19615a(ok8VarAsJsonDecoder.decodeJsonElement()));
    }

    @Override // p000.lp8, p000.e1f, p000.t74
    @yfb
    public f0f getDescriptor() {
        return this.f71384a.getDescriptor();
    }

    @Override // p000.e1f
    public final void serialize(@yfb m15 m15Var, @yfb T t) {
        md8.checkNotNullParameter(m15Var, "encoder");
        md8.checkNotNullParameter(t, "value");
        el8 el8VarAsJsonEncoder = dl8.asJsonEncoder(m15Var);
        el8VarAsJsonEncoder.encodeJsonElement(m19616b(cih.writeJson(el8VarAsJsonEncoder.getJson(), t, this.f71384a)));
    }
}
