package p000;

/* JADX INFO: loaded from: classes7.dex */
public interface lm2 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final C8895a f58209a = C8895a.f58212a;

    /* JADX INFO: renamed from: b */
    public static final int f58210b = -1;

    /* JADX INFO: renamed from: c */
    public static final int f58211c = -3;

    /* JADX INFO: renamed from: lm2$a */
    public static final class C8895a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ C8895a f58212a = new C8895a();

        /* JADX INFO: renamed from: b */
        public static final int f58213b = -1;

        /* JADX INFO: renamed from: c */
        public static final int f58214c = -3;

        private C8895a() {
        }
    }

    /* JADX INFO: renamed from: lm2$b */
    public static final class C8896b {
        public static int decodeCollectionSize(@yfb lm2 lm2Var, @yfb f0f f0fVar) {
            md8.checkNotNullParameter(f0fVar, "descriptor");
            return -1;
        }

        public static /* synthetic */ Object decodeNullableSerializableElement$default(lm2 lm2Var, f0f f0fVar, int i, t74 t74Var, Object obj, int i2, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decodeNullableSerializableElement");
            }
            if ((i2 & 8) != 0) {
                obj = null;
            }
            return lm2Var.decodeNullableSerializableElement(f0fVar, i, t74Var, obj);
        }

        @ph5
        public static boolean decodeSequentially(@yfb lm2 lm2Var) {
            return false;
        }

        public static /* synthetic */ Object decodeSerializableElement$default(lm2 lm2Var, f0f f0fVar, int i, t74 t74Var, Object obj, int i2, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decodeSerializableElement");
            }
            if ((i2 & 8) != 0) {
                obj = null;
            }
            return lm2Var.decodeSerializableElement(f0fVar, i, t74Var, obj);
        }
    }

    boolean decodeBooleanElement(@yfb f0f f0fVar, int i);

    byte decodeByteElement(@yfb f0f f0fVar, int i);

    char decodeCharElement(@yfb f0f f0fVar, int i);

    int decodeCollectionSize(@yfb f0f f0fVar);

    double decodeDoubleElement(@yfb f0f f0fVar, int i);

    int decodeElementIndex(@yfb f0f f0fVar);

    float decodeFloatElement(@yfb f0f f0fVar, int i);

    @yfb
    jl3 decodeInlineElement(@yfb f0f f0fVar, int i);

    int decodeIntElement(@yfb f0f f0fVar, int i);

    long decodeLongElement(@yfb f0f f0fVar, int i);

    @gib
    @ph5
    <T> T decodeNullableSerializableElement(@yfb f0f f0fVar, int i, @yfb t74<? extends T> t74Var, @gib T t);

    @ph5
    boolean decodeSequentially();

    <T> T decodeSerializableElement(@yfb f0f f0fVar, int i, @yfb t74<? extends T> t74Var, @gib T t);

    short decodeShortElement(@yfb f0f f0fVar, int i);

    @yfb
    String decodeStringElement(@yfb f0f f0fVar, int i);

    void endStructure(@yfb f0f f0fVar);

    @yfb
    n2f getSerializersModule();
}
