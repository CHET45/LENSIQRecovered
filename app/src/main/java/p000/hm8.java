package p000;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nTreeJsonEncoder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TreeJsonEncoder.kt\nkotlinx/serialization/json/internal/JsonPrimitiveEncoder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,280:1\n1#2:281\n*E\n"})
public final class hm8 extends AbstractC6092g2 {

    /* JADX INFO: renamed from: g */
    @gib
    public sk8 f44109g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hm8(@yfb bk8 bk8Var, @yfb qy6<? super sk8, bth> qy6Var) {
        super(bk8Var, qy6Var, null);
        md8.checkNotNullParameter(bk8Var, "json");
        md8.checkNotNullParameter(qy6Var, "nodeConsumer");
        m25290f(cih.f16665a);
    }

    @Override // p000.AbstractC6092g2
    @yfb
    public sk8 getCurrent() {
        sk8 sk8Var = this.f44109g;
        if (sk8Var != null) {
            return sk8Var;
        }
        throw new IllegalArgumentException("Primitive element has not been recorded. Is call to .encodeXxx is missing in serializer?");
    }

    @Override // p000.AbstractC6092g2
    public void putElement(@yfb String str, @yfb sk8 sk8Var) {
        md8.checkNotNullParameter(str, "key");
        md8.checkNotNullParameter(sk8Var, "element");
        if (str != cih.f16665a) {
            throw new IllegalArgumentException("This output can only consume primitives with 'primitive' tag");
        }
        if (this.f44109g != null) {
            throw new IllegalArgumentException("Primitive element was already recorded. Does call to .encodeXxx happen more than once?");
        }
        this.f44109g = sk8Var;
        m11335y().invoke(sk8Var);
    }
}
