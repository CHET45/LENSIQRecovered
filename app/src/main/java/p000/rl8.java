package p000;

import p000.jbd;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nJsonElementSerializers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JsonElementSerializers.kt\nkotlinx/serialization/json/JsonLiteralSerializer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,236:1\n1#2:237\n*E\n"})
public final class rl8 implements lp8<ql8> {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final rl8 f78636a = new rl8();

    /* JADX INFO: renamed from: b */
    @yfb
    public static final f0f f78637b = n0f.PrimitiveSerialDescriptor("kotlinx.serialization.json.JsonLiteral", jbd.C7852i.f50259a);

    private rl8() {
    }

    @Override // p000.lp8, p000.e1f, p000.t74
    @yfb
    public f0f getDescriptor() {
        return f78637b;
    }

    @Override // p000.t74
    @yfb
    public ql8 deserialize(@yfb jl3 jl3Var) {
        md8.checkNotNullParameter(jl3Var, "decoder");
        sk8 sk8VarDecodeJsonElement = dl8.asJsonDecoder(jl3Var).decodeJsonElement();
        if (sk8VarDecodeJsonElement instanceof ql8) {
            return (ql8) sk8VarDecodeJsonElement;
        }
        throw il8.JsonDecodingException(-1, "Unexpected JSON element, expected JsonLiteral, had " + vvd.getOrCreateKotlinClass(sk8VarDecodeJsonElement.getClass()), sk8VarDecodeJsonElement.toString());
    }

    @Override // p000.e1f
    public void serialize(@yfb m15 m15Var, @yfb ql8 ql8Var) {
        md8.checkNotNullParameter(m15Var, "encoder");
        md8.checkNotNullParameter(ql8Var, "value");
        dl8.verify(m15Var);
        if (ql8Var.isString()) {
            m15Var.encodeString(ql8Var.getContent());
            return;
        }
        if (ql8Var.getCoerceToInlineType$kotlinx_serialization_json() != null) {
            m15Var.encodeInline(ql8Var.getCoerceToInlineType$kotlinx_serialization_json()).encodeString(ql8Var.getContent());
            return;
        }
        Long longOrNull = g9g.toLongOrNull(ql8Var.getContent());
        if (longOrNull != null) {
            m15Var.encodeLong(longOrNull.longValue());
            return;
        }
        oph uLongOrNull = pqh.toULongOrNull(ql8Var.getContent());
        if (uLongOrNull != null) {
            m15Var.encodeInline(hg1.serializer(oph.f68284b).getDescriptor()).encodeLong(uLongOrNull.m31585unboximpl());
            return;
        }
        Double doubleOrNull = f9g.toDoubleOrNull(ql8Var.getContent());
        if (doubleOrNull != null) {
            m15Var.encodeDouble(doubleOrNull.doubleValue());
            return;
        }
        Boolean booleanStrictOrNull = m9g.toBooleanStrictOrNull(ql8Var.getContent());
        if (booleanStrictOrNull != null) {
            m15Var.encodeBoolean(booleanStrictOrNull.booleanValue());
        } else {
            m15Var.encodeString(ql8Var.getContent());
        }
    }
}
