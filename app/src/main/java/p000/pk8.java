package p000;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nStreamingJsonDecoder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StreamingJsonDecoder.kt\nkotlinx/serialization/json/internal/JsonDecoderForUnsignedTypes\n+ 2 StreamingJsonDecoder.kt\nkotlinx/serialization/json/internal/StreamingJsonDecoderKt\n*L\n1#1,391:1\n384#2,5:392\n384#2,5:397\n384#2,5:402\n384#2,5:407\n*S KotlinDebug\n*F\n+ 1 StreamingJsonDecoder.kt\nkotlinx/serialization/json/internal/JsonDecoderForUnsignedTypes\n*L\n377#1:392,5\n378#1:397,5\n379#1:402,5\n380#1:407,5\n*E\n"})
public final class pk8 extends AbstractC14337w0 {

    /* JADX INFO: renamed from: d */
    @yfb
    public final AbstractC2163c2 f71168d;

    /* JADX INFO: renamed from: e */
    @yfb
    public final n2f f71169e;

    public pk8(@yfb AbstractC2163c2 abstractC2163c2, @yfb bk8 bk8Var) {
        md8.checkNotNullParameter(abstractC2163c2, "lexer");
        md8.checkNotNullParameter(bk8Var, "json");
        this.f71168d = abstractC2163c2;
        this.f71169e = bk8Var.getSerializersModule();
    }

    @Override // p000.AbstractC14337w0, p000.jl3
    public byte decodeByte() {
        AbstractC2163c2 abstractC2163c2 = this.f71168d;
        String strConsumeStringLenient = abstractC2163c2.consumeStringLenient();
        try {
            return pqh.toUByte(strConsumeStringLenient);
        } catch (IllegalArgumentException unused) {
            AbstractC2163c2.fail$default(abstractC2163c2, "Failed to parse type 'UByte' for input '" + strConsumeStringLenient + '\'', 0, null, 6, null);
            throw new us8();
        }
    }

    @Override // p000.lm2
    public int decodeElementIndex(@yfb f0f f0fVar) {
        md8.checkNotNullParameter(f0fVar, "descriptor");
        throw new IllegalStateException("unsupported");
    }

    @Override // p000.AbstractC14337w0, p000.jl3
    public int decodeInt() {
        AbstractC2163c2 abstractC2163c2 = this.f71168d;
        String strConsumeStringLenient = abstractC2163c2.consumeStringLenient();
        try {
            return pqh.toUInt(strConsumeStringLenient);
        } catch (IllegalArgumentException unused) {
            AbstractC2163c2.fail$default(abstractC2163c2, "Failed to parse type 'UInt' for input '" + strConsumeStringLenient + '\'', 0, null, 6, null);
            throw new us8();
        }
    }

    @Override // p000.AbstractC14337w0, p000.jl3
    public long decodeLong() {
        AbstractC2163c2 abstractC2163c2 = this.f71168d;
        String strConsumeStringLenient = abstractC2163c2.consumeStringLenient();
        try {
            return pqh.toULong(strConsumeStringLenient);
        } catch (IllegalArgumentException unused) {
            AbstractC2163c2.fail$default(abstractC2163c2, "Failed to parse type 'ULong' for input '" + strConsumeStringLenient + '\'', 0, null, 6, null);
            throw new us8();
        }
    }

    @Override // p000.AbstractC14337w0, p000.jl3
    public short decodeShort() {
        AbstractC2163c2 abstractC2163c2 = this.f71168d;
        String strConsumeStringLenient = abstractC2163c2.consumeStringLenient();
        try {
            return pqh.toUShort(strConsumeStringLenient);
        } catch (IllegalArgumentException unused) {
            AbstractC2163c2.fail$default(abstractC2163c2, "Failed to parse type 'UShort' for input '" + strConsumeStringLenient + '\'', 0, null, 6, null);
            throw new us8();
        }
    }

    @Override // p000.jl3, p000.lm2
    @yfb
    public n2f getSerializersModule() {
        return this.f71169e;
    }
}
