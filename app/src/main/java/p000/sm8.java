package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class sm8 extends AbstractC5049e2 {

    /* JADX INFO: renamed from: j */
    @yfb
    public final ck8 f82235j;

    /* JADX INFO: renamed from: k */
    public final int f82236k;

    /* JADX INFO: renamed from: l */
    public int f82237l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sm8(@yfb bk8 bk8Var, @yfb ck8 ck8Var) {
        super(bk8Var, ck8Var, null, 4, null);
        md8.checkNotNullParameter(bk8Var, "json");
        md8.checkNotNullParameter(ck8Var, "value");
        this.f82235j = ck8Var;
        this.f82236k = getValue().size();
        this.f82237l = -1;
    }

    @Override // p000.lm2
    public int decodeElementIndex(@yfb f0f f0fVar) {
        md8.checkNotNullParameter(f0fVar, "descriptor");
        int i = this.f82237l;
        if (i >= this.f82236k - 1) {
            return -1;
        }
        int i2 = i + 1;
        this.f82237l = i2;
        return i2;
    }

    @Override // p000.AbstractC5049e2
    @yfb
    public ck8 getValue() {
        return this.f82235j;
    }

    @Override // p000.g9b
    @yfb
    /* JADX INFO: renamed from: k */
    public String mo11444k(@yfb f0f f0fVar, int i) {
        md8.checkNotNullParameter(f0fVar, "descriptor");
        return String.valueOf(i);
    }

    @Override // p000.AbstractC5049e2
    @yfb
    /* JADX INFO: renamed from: o */
    public sk8 mo9628o(@yfb String str) {
        md8.checkNotNullParameter(str, "tag");
        return getValue().get(Integer.parseInt(str));
    }
}
