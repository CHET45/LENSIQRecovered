package p000;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nTreeJsonDecoder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TreeJsonDecoder.kt\nkotlinx/serialization/json/internal/JsonPrimitiveDecoder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,334:1\n1#2:335\n*E\n"})
public final class gm8 extends AbstractC5049e2 {

    /* JADX INFO: renamed from: j */
    @yfb
    public final sk8 f40188j;

    public /* synthetic */ gm8(bk8 bk8Var, sk8 sk8Var, String str, int i, jt3 jt3Var) {
        this(bk8Var, sk8Var, (i & 4) != 0 ? null : str);
    }

    @Override // p000.lm2
    public int decodeElementIndex(@yfb f0f f0fVar) {
        md8.checkNotNullParameter(f0fVar, "descriptor");
        return 0;
    }

    @Override // p000.AbstractC5049e2
    @yfb
    public sk8 getValue() {
        return this.f40188j;
    }

    @Override // p000.AbstractC5049e2
    @yfb
    /* JADX INFO: renamed from: o */
    public sk8 mo9628o(@yfb String str) {
        md8.checkNotNullParameter(str, "tag");
        if (str == cih.f16665a) {
            return getValue();
        }
        throw new IllegalArgumentException("This input can only handle primitives with 'primitive' tag");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gm8(@yfb bk8 bk8Var, @yfb sk8 sk8Var, @gib String str) {
        super(bk8Var, sk8Var, str, null);
        md8.checkNotNullParameter(bk8Var, "json");
        md8.checkNotNullParameter(sk8Var, "value");
        this.f40188j = sk8Var;
        m24662i(cih.f16665a);
    }
}
