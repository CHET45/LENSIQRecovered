package p000;

/* JADX INFO: loaded from: classes7.dex */
public interface m15 {

    /* JADX INFO: renamed from: m15$a */
    public static final class C9082a {
        @yfb
        public static om2 beginCollection(@yfb m15 m15Var, @yfb f0f f0fVar, int i) {
            md8.checkNotNullParameter(f0fVar, "descriptor");
            return m15Var.beginStructure(f0fVar);
        }

        @ph5
        public static void encodeNotNullMark(@yfb m15 m15Var) {
        }

        @ph5
        public static <T> void encodeNullableSerializableValue(@yfb m15 m15Var, @yfb e1f<? super T> e1fVar, @gib T t) {
            md8.checkNotNullParameter(e1fVar, "serializer");
            if (e1fVar.getDescriptor().isNullable()) {
                m15Var.encodeSerializableValue(e1fVar, t);
            } else if (t == null) {
                m15Var.encodeNull();
            } else {
                m15Var.encodeNotNullMark();
                m15Var.encodeSerializableValue(e1fVar, t);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static <T> void encodeSerializableValue(@yfb m15 m15Var, @yfb e1f<? super T> e1fVar, T t) {
            md8.checkNotNullParameter(e1fVar, "serializer");
            e1fVar.serialize(m15Var, t);
        }
    }

    @yfb
    om2 beginCollection(@yfb f0f f0fVar, int i);

    @yfb
    om2 beginStructure(@yfb f0f f0fVar);

    void encodeBoolean(boolean z);

    void encodeByte(byte b);

    void encodeChar(char c);

    void encodeDouble(double d);

    void encodeEnum(@yfb f0f f0fVar, int i);

    void encodeFloat(float f);

    @yfb
    m15 encodeInline(@yfb f0f f0fVar);

    void encodeInt(int i);

    void encodeLong(long j);

    @ph5
    void encodeNotNullMark();

    @ph5
    void encodeNull();

    @ph5
    <T> void encodeNullableSerializableValue(@yfb e1f<? super T> e1fVar, @gib T t);

    <T> void encodeSerializableValue(@yfb e1f<? super T> e1fVar, T t);

    void encodeShort(short s);

    void encodeString(@yfb String str);

    @yfb
    n2f getSerializersModule();
}
