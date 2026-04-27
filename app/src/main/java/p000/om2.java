package p000;

/* JADX INFO: loaded from: classes7.dex */
public interface om2 {

    /* JADX INFO: renamed from: om2$a */
    public static final class C10464a {
        @ph5
        public static boolean shouldEncodeElementDefault(@yfb om2 om2Var, @yfb f0f f0fVar, int i) {
            md8.checkNotNullParameter(f0fVar, "descriptor");
            return true;
        }
    }

    void encodeBooleanElement(@yfb f0f f0fVar, int i, boolean z);

    void encodeByteElement(@yfb f0f f0fVar, int i, byte b);

    void encodeCharElement(@yfb f0f f0fVar, int i, char c);

    void encodeDoubleElement(@yfb f0f f0fVar, int i, double d);

    void encodeFloatElement(@yfb f0f f0fVar, int i, float f);

    @yfb
    m15 encodeInlineElement(@yfb f0f f0fVar, int i);

    void encodeIntElement(@yfb f0f f0fVar, int i, int i2);

    void encodeLongElement(@yfb f0f f0fVar, int i, long j);

    @ph5
    <T> void encodeNullableSerializableElement(@yfb f0f f0fVar, int i, @yfb e1f<? super T> e1fVar, @gib T t);

    <T> void encodeSerializableElement(@yfb f0f f0fVar, int i, @yfb e1f<? super T> e1fVar, T t);

    void encodeShortElement(@yfb f0f f0fVar, int i, short s);

    void encodeStringElement(@yfb f0f f0fVar, int i, @yfb String str);

    void endStructure(@yfb f0f f0fVar);

    @yfb
    n2f getSerializersModule();

    @ph5
    boolean shouldEncodeElementDefault(@yfb f0f f0fVar, int i);
}
