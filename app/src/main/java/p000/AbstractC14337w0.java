package p000;

import p000.jl3;
import p000.lm2;

/* JADX INFO: renamed from: w0 */
/* JADX INFO: loaded from: classes7.dex */
@ph5
@dwf({"SMAP\nAbstractDecoder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractDecoder.kt\nkotlinx/serialization/encoding/AbstractDecoder\n+ 2 Decoding.kt\nkotlinx/serialization/encoding/DecodingKt\n*L\n1#1,81:1\n270#2,2:82\n*S KotlinDebug\n*F\n+ 1 AbstractDecoder.kt\nkotlinx/serialization/encoding/AbstractDecoder\n*L\n77#1:82,2\n*E\n"})
public abstract class AbstractC14337w0 implements jl3, lm2 {
    public static /* synthetic */ Object decodeSerializableValue$default(AbstractC14337w0 abstractC14337w0, t74 t74Var, Object obj, int i, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decodeSerializableValue");
        }
        if ((i & 2) != 0) {
            obj = null;
        }
        return abstractC14337w0.decodeSerializableValue(t74Var, obj);
    }

    @Override // p000.jl3
    @yfb
    public lm2 beginStructure(@yfb f0f f0fVar) {
        md8.checkNotNullParameter(f0fVar, "descriptor");
        return this;
    }

    @Override // p000.jl3
    public boolean decodeBoolean() {
        Object objDecodeValue = decodeValue();
        md8.checkNotNull(objDecodeValue, "null cannot be cast to non-null type kotlin.Boolean");
        return ((Boolean) objDecodeValue).booleanValue();
    }

    @Override // p000.lm2
    public final boolean decodeBooleanElement(@yfb f0f f0fVar, int i) {
        md8.checkNotNullParameter(f0fVar, "descriptor");
        return decodeBoolean();
    }

    @Override // p000.jl3
    public byte decodeByte() {
        Object objDecodeValue = decodeValue();
        md8.checkNotNull(objDecodeValue, "null cannot be cast to non-null type kotlin.Byte");
        return ((Byte) objDecodeValue).byteValue();
    }

    @Override // p000.lm2
    public final byte decodeByteElement(@yfb f0f f0fVar, int i) {
        md8.checkNotNullParameter(f0fVar, "descriptor");
        return decodeByte();
    }

    @Override // p000.jl3
    public char decodeChar() {
        Object objDecodeValue = decodeValue();
        md8.checkNotNull(objDecodeValue, "null cannot be cast to non-null type kotlin.Char");
        return ((Character) objDecodeValue).charValue();
    }

    @Override // p000.lm2
    public final char decodeCharElement(@yfb f0f f0fVar, int i) {
        md8.checkNotNullParameter(f0fVar, "descriptor");
        return decodeChar();
    }

    @Override // p000.lm2
    public int decodeCollectionSize(@yfb f0f f0fVar) {
        return lm2.C8896b.decodeCollectionSize(this, f0fVar);
    }

    @Override // p000.jl3
    public double decodeDouble() {
        Object objDecodeValue = decodeValue();
        md8.checkNotNull(objDecodeValue, "null cannot be cast to non-null type kotlin.Double");
        return ((Double) objDecodeValue).doubleValue();
    }

    @Override // p000.lm2
    public final double decodeDoubleElement(@yfb f0f f0fVar, int i) {
        md8.checkNotNullParameter(f0fVar, "descriptor");
        return decodeDouble();
    }

    @Override // p000.jl3
    public int decodeEnum(@yfb f0f f0fVar) {
        md8.checkNotNullParameter(f0fVar, "enumDescriptor");
        Object objDecodeValue = decodeValue();
        md8.checkNotNull(objDecodeValue, "null cannot be cast to non-null type kotlin.Int");
        return ((Integer) objDecodeValue).intValue();
    }

    @Override // p000.jl3
    public float decodeFloat() {
        Object objDecodeValue = decodeValue();
        md8.checkNotNull(objDecodeValue, "null cannot be cast to non-null type kotlin.Float");
        return ((Float) objDecodeValue).floatValue();
    }

    @Override // p000.lm2
    public final float decodeFloatElement(@yfb f0f f0fVar, int i) {
        md8.checkNotNullParameter(f0fVar, "descriptor");
        return decodeFloat();
    }

    @Override // p000.jl3
    @yfb
    public jl3 decodeInline(@yfb f0f f0fVar) {
        md8.checkNotNullParameter(f0fVar, "descriptor");
        return this;
    }

    @Override // p000.lm2
    @yfb
    public jl3 decodeInlineElement(@yfb f0f f0fVar, int i) {
        md8.checkNotNullParameter(f0fVar, "descriptor");
        return decodeInline(f0fVar.getElementDescriptor(i));
    }

    @Override // p000.jl3
    public int decodeInt() {
        Object objDecodeValue = decodeValue();
        md8.checkNotNull(objDecodeValue, "null cannot be cast to non-null type kotlin.Int");
        return ((Integer) objDecodeValue).intValue();
    }

    @Override // p000.lm2
    public final int decodeIntElement(@yfb f0f f0fVar, int i) {
        md8.checkNotNullParameter(f0fVar, "descriptor");
        return decodeInt();
    }

    @Override // p000.jl3
    public long decodeLong() {
        Object objDecodeValue = decodeValue();
        md8.checkNotNull(objDecodeValue, "null cannot be cast to non-null type kotlin.Long");
        return ((Long) objDecodeValue).longValue();
    }

    @Override // p000.lm2
    public final long decodeLongElement(@yfb f0f f0fVar, int i) {
        md8.checkNotNullParameter(f0fVar, "descriptor");
        return decodeLong();
    }

    @Override // p000.jl3
    public boolean decodeNotNullMark() {
        return true;
    }

    @Override // p000.jl3
    @gib
    public Void decodeNull() {
        return null;
    }

    @Override // p000.lm2
    @gib
    public final <T> T decodeNullableSerializableElement(@yfb f0f f0fVar, int i, @yfb t74<? extends T> t74Var, @gib T t) {
        md8.checkNotNullParameter(f0fVar, "descriptor");
        md8.checkNotNullParameter(t74Var, "deserializer");
        return (t74Var.getDescriptor().isNullable() || decodeNotNullMark()) ? (T) decodeSerializableValue(t74Var, t) : (T) decodeNull();
    }

    @Override // p000.jl3
    @gib
    @ph5
    public <T> T decodeNullableSerializableValue(@yfb t74<? extends T> t74Var) {
        return (T) jl3.C7970a.decodeNullableSerializableValue(this, t74Var);
    }

    @Override // p000.lm2
    @ph5
    public boolean decodeSequentially() {
        return lm2.C8896b.decodeSequentially(this);
    }

    @Override // p000.lm2
    public <T> T decodeSerializableElement(@yfb f0f f0fVar, int i, @yfb t74<? extends T> t74Var, @gib T t) {
        md8.checkNotNullParameter(f0fVar, "descriptor");
        md8.checkNotNullParameter(t74Var, "deserializer");
        return (T) decodeSerializableValue(t74Var, t);
    }

    @Override // p000.jl3
    public <T> T decodeSerializableValue(@yfb t74<? extends T> t74Var) {
        return (T) jl3.C7970a.decodeSerializableValue(this, t74Var);
    }

    @Override // p000.jl3
    public short decodeShort() {
        Object objDecodeValue = decodeValue();
        md8.checkNotNull(objDecodeValue, "null cannot be cast to non-null type kotlin.Short");
        return ((Short) objDecodeValue).shortValue();
    }

    @Override // p000.lm2
    public final short decodeShortElement(@yfb f0f f0fVar, int i) {
        md8.checkNotNullParameter(f0fVar, "descriptor");
        return decodeShort();
    }

    @Override // p000.jl3
    @yfb
    public String decodeString() {
        Object objDecodeValue = decodeValue();
        md8.checkNotNull(objDecodeValue, "null cannot be cast to non-null type kotlin.String");
        return (String) objDecodeValue;
    }

    @Override // p000.lm2
    @yfb
    public final String decodeStringElement(@yfb f0f f0fVar, int i) {
        md8.checkNotNullParameter(f0fVar, "descriptor");
        return decodeString();
    }

    @yfb
    public Object decodeValue() {
        throw new d1f(vvd.getOrCreateKotlinClass(getClass()) + " can't retrieve untyped values");
    }

    @Override // p000.lm2
    public void endStructure(@yfb f0f f0fVar) {
        md8.checkNotNullParameter(f0fVar, "descriptor");
    }

    public <T> T decodeSerializableValue(@yfb t74<? extends T> t74Var, @gib T t) {
        md8.checkNotNullParameter(t74Var, "deserializer");
        return (T) decodeSerializableValue(t74Var);
    }
}
