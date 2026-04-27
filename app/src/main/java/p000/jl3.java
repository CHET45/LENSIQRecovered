package p000;

/* JADX INFO: loaded from: classes7.dex */
public interface jl3 {

    /* JADX INFO: renamed from: jl3$a */
    @dwf({"SMAP\nDecoding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Decoding.kt\nkotlinx/serialization/encoding/Decoder$DefaultImpls\n+ 2 Decoding.kt\nkotlinx/serialization/encoding/DecodingKt\n*L\n1#1,575:1\n270#2,2:576\n*S KotlinDebug\n*F\n+ 1 Decoding.kt\nkotlinx/serialization/encoding/Decoder$DefaultImpls\n*L\n263#1:576,2\n*E\n"})
    public static final class C7970a {
        @gib
        @ph5
        public static <T> T decodeNullableSerializableValue(@yfb jl3 jl3Var, @yfb t74<? extends T> t74Var) {
            md8.checkNotNullParameter(t74Var, "deserializer");
            return (t74Var.getDescriptor().isNullable() || jl3Var.decodeNotNullMark()) ? (T) jl3Var.decodeSerializableValue(t74Var) : (T) jl3Var.decodeNull();
        }

        public static <T> T decodeSerializableValue(@yfb jl3 jl3Var, @yfb t74<? extends T> t74Var) {
            md8.checkNotNullParameter(t74Var, "deserializer");
            return t74Var.deserialize(jl3Var);
        }
    }

    @yfb
    lm2 beginStructure(@yfb f0f f0fVar);

    boolean decodeBoolean();

    byte decodeByte();

    char decodeChar();

    double decodeDouble();

    int decodeEnum(@yfb f0f f0fVar);

    float decodeFloat();

    @yfb
    jl3 decodeInline(@yfb f0f f0fVar);

    int decodeInt();

    long decodeLong();

    @ph5
    boolean decodeNotNullMark();

    @gib
    @ph5
    Void decodeNull();

    @gib
    @ph5
    <T> T decodeNullableSerializableValue(@yfb t74<? extends T> t74Var);

    <T> T decodeSerializableValue(@yfb t74<? extends T> t74Var);

    short decodeShort();

    @yfb
    String decodeString();

    @yfb
    n2f getSerializersModule();
}
