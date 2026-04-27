package p000;

import p000.w3d;

/* JADX INFO: loaded from: classes7.dex */
public abstract class ik8<T> implements lp8<T> {

    /* JADX INFO: renamed from: a */
    @yfb
    public final oo8<T> f47237a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final f0f f47238b;

    public ik8(@yfb oo8<T> oo8Var) {
        md8.checkNotNullParameter(oo8Var, "baseClass");
        this.f47237a = oo8Var;
        this.f47238b = n0f.buildSerialDescriptor$default("JsonContentPolymorphicSerializer<" + oo8Var.getSimpleName() + '>', w3d.C14372b.f93180a, new f0f[0], null, 8, null);
    }

    private final Void throwSubtypeNotRegistered(oo8<?> oo8Var, oo8<?> oo8Var2) {
        String simpleName = oo8Var.getSimpleName();
        if (simpleName == null) {
            simpleName = String.valueOf(oo8Var);
        }
        throw new d1f("Class '" + simpleName + "' is not registered for polymorphic serialization " + ("in the scope of '" + oo8Var2.getSimpleName() + '\'') + ".\nMark the base class as 'sealed' or register the serializer explicitly.");
    }

    @yfb
    /* JADX INFO: renamed from: a */
    public abstract t74<T> m13157a(@yfb sk8 sk8Var);

    @Override // p000.t74
    @yfb
    public final T deserialize(@yfb jl3 jl3Var) {
        md8.checkNotNullParameter(jl3Var, "decoder");
        ok8 ok8VarAsJsonDecoder = dl8.asJsonDecoder(jl3Var);
        sk8 sk8VarDecodeJsonElement = ok8VarAsJsonDecoder.decodeJsonElement();
        t74<T> t74VarM13157a = m13157a(sk8VarDecodeJsonElement);
        md8.checkNotNull(t74VarM13157a, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.json.JsonContentPolymorphicSerializer>");
        return (T) ok8VarAsJsonDecoder.getJson().decodeFromJsonElement((lp8) t74VarM13157a, sk8VarDecodeJsonElement);
    }

    @Override // p000.lp8, p000.e1f, p000.t74
    @yfb
    public f0f getDescriptor() {
        return this.f47238b;
    }

    @Override // p000.e1f
    public final void serialize(@yfb m15 m15Var, @yfb T t) {
        md8.checkNotNullParameter(m15Var, "encoder");
        md8.checkNotNullParameter(t, "value");
        e1f<T> polymorphic = m15Var.getSerializersModule().getPolymorphic(this.f47237a, t);
        if (polymorphic == null && (polymorphic = i2f.serializerOrNull(vvd.getOrCreateKotlinClass(t.getClass()))) == null) {
            throwSubtypeNotRegistered(vvd.getOrCreateKotlinClass(t.getClass()), this.f47237a);
            throw new us8();
        }
        ((lp8) polymorphic).serialize(m15Var, t);
    }
}
