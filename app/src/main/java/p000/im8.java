package p000;

import p000.jbd;

/* JADX INFO: loaded from: classes7.dex */
@yjd
public final class im8 implements lp8<fm8> {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final im8 f47436a = new im8();

    /* JADX INFO: renamed from: b */
    @yfb
    public static final f0f f47437b = n0f.buildSerialDescriptor$default("kotlinx.serialization.json.JsonPrimitive", jbd.C7852i.f50259a, new f0f[0], null, 8, null);

    private im8() {
    }

    @Override // p000.lp8, p000.e1f, p000.t74
    @yfb
    public f0f getDescriptor() {
        return f47437b;
    }

    @Override // p000.t74
    @yfb
    public fm8 deserialize(@yfb jl3 jl3Var) {
        md8.checkNotNullParameter(jl3Var, "decoder");
        sk8 sk8VarDecodeJsonElement = dl8.asJsonDecoder(jl3Var).decodeJsonElement();
        if (sk8VarDecodeJsonElement instanceof fm8) {
            return (fm8) sk8VarDecodeJsonElement;
        }
        throw il8.JsonDecodingException(-1, "Unexpected JSON element, expected JsonPrimitive, had " + vvd.getOrCreateKotlinClass(sk8VarDecodeJsonElement.getClass()), sk8VarDecodeJsonElement.toString());
    }

    @Override // p000.e1f
    public void serialize(@yfb m15 m15Var, @yfb fm8 fm8Var) {
        md8.checkNotNullParameter(m15Var, "encoder");
        md8.checkNotNullParameter(fm8Var, "value");
        dl8.verify(m15Var);
        if (fm8Var instanceof xl8) {
            m15Var.encodeSerializableValue(yl8.f102014a, xl8.INSTANCE);
        } else {
            m15Var.encodeSerializableValue(rl8.f78636a, (ql8) fm8Var);
        }
    }
}
