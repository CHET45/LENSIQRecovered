package p000;

import java.lang.reflect.Field;
import p000.v98;

/* JADX INFO: loaded from: classes3.dex */
@ey1
public final class jr5 implements Comparable<jr5> {

    /* JADX INFO: renamed from: C */
    public final boolean f51562C;

    /* JADX INFO: renamed from: F */
    public final g5c f51563F;

    /* JADX INFO: renamed from: H */
    public final Field f51564H;

    /* JADX INFO: renamed from: L */
    public final Class<?> f51565L;

    /* JADX INFO: renamed from: M */
    public final Object f51566M;

    /* JADX INFO: renamed from: N */
    public final v98.InterfaceC13949e f51567N;

    /* JADX INFO: renamed from: a */
    public final Field f51568a;

    /* JADX INFO: renamed from: b */
    public final cs5 f51569b;

    /* JADX INFO: renamed from: c */
    public final Class<?> f51570c;

    /* JADX INFO: renamed from: d */
    public final int f51571d;

    /* JADX INFO: renamed from: e */
    public final Field f51572e;

    /* JADX INFO: renamed from: f */
    public final int f51573f;

    /* JADX INFO: renamed from: m */
    public final boolean f51574m;

    /* JADX INFO: renamed from: jr5$a */
    public static /* synthetic */ class C8039a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f51575a;

        static {
            int[] iArr = new int[cs5.values().length];
            f51575a = iArr;
            try {
                iArr[cs5.f27224X.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f51575a[cs5.f27230c2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f51575a[cs5.f27242m2.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f51575a[cs5.f27213I2.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: renamed from: jr5$b */
    public static final class C8040b {

        /* JADX INFO: renamed from: a */
        public Field f51576a;

        /* JADX INFO: renamed from: b */
        public cs5 f51577b;

        /* JADX INFO: renamed from: c */
        public int f51578c;

        /* JADX INFO: renamed from: d */
        public Field f51579d;

        /* JADX INFO: renamed from: e */
        public int f51580e;

        /* JADX INFO: renamed from: f */
        public boolean f51581f;

        /* JADX INFO: renamed from: g */
        public boolean f51582g;

        /* JADX INFO: renamed from: h */
        public g5c f51583h;

        /* JADX INFO: renamed from: i */
        public Class<?> f51584i;

        /* JADX INFO: renamed from: j */
        public Object f51585j;

        /* JADX INFO: renamed from: k */
        public v98.InterfaceC13949e f51586k;

        /* JADX INFO: renamed from: l */
        public Field f51587l;

        public /* synthetic */ C8040b(C8039a c8039a) {
            this();
        }

        public jr5 build() {
            g5c g5cVar = this.f51583h;
            if (g5cVar != null) {
                return jr5.forOneofMemberField(this.f51578c, this.f51577b, g5cVar, this.f51584i, this.f51582g, this.f51586k);
            }
            Object obj = this.f51585j;
            if (obj != null) {
                return jr5.forMapField(this.f51576a, this.f51578c, obj, this.f51586k);
            }
            Field field = this.f51579d;
            if (field != null) {
                return this.f51581f ? jr5.forLegacyRequiredField(this.f51576a, this.f51578c, this.f51577b, field, this.f51580e, this.f51582g, this.f51586k) : jr5.forExplicitPresenceField(this.f51576a, this.f51578c, this.f51577b, field, this.f51580e, this.f51582g, this.f51586k);
            }
            v98.InterfaceC13949e interfaceC13949e = this.f51586k;
            if (interfaceC13949e != null) {
                Field field2 = this.f51587l;
                return field2 == null ? jr5.forFieldWithEnumVerifier(this.f51576a, this.f51578c, this.f51577b, interfaceC13949e) : jr5.forPackedFieldWithEnumVerifier(this.f51576a, this.f51578c, this.f51577b, interfaceC13949e, field2);
            }
            Field field3 = this.f51587l;
            return field3 == null ? jr5.forField(this.f51576a, this.f51578c, this.f51577b, this.f51582g) : jr5.forPackedField(this.f51576a, this.f51578c, this.f51577b, field3);
        }

        public C8040b withCachedSizeField(Field cachedSizeField) {
            this.f51587l = cachedSizeField;
            return this;
        }

        public C8040b withEnforceUtf8(boolean enforceUtf8) {
            this.f51582g = enforceUtf8;
            return this;
        }

        public C8040b withEnumVerifier(v98.InterfaceC13949e enumVerifier) {
            this.f51586k = enumVerifier;
            return this;
        }

        public C8040b withField(Field field) {
            if (this.f51583h != null) {
                throw new IllegalStateException("Cannot set field when building a oneof.");
            }
            this.f51576a = field;
            return this;
        }

        public C8040b withFieldNumber(int fieldNumber) {
            this.f51578c = fieldNumber;
            return this;
        }

        public C8040b withMapDefaultEntry(Object mapDefaultEntry) {
            this.f51585j = mapDefaultEntry;
            return this;
        }

        public C8040b withOneof(g5c oneof, Class<?> oneofStoredType) {
            if (this.f51576a != null || this.f51579d != null) {
                throw new IllegalStateException("Cannot set oneof when field or presenceField have been provided");
            }
            this.f51583h = oneof;
            this.f51584i = oneofStoredType;
            return this;
        }

        public C8040b withPresence(Field presenceField, int presenceMask) {
            this.f51579d = (Field) v98.m23882b(presenceField, "presenceField");
            this.f51580e = presenceMask;
            return this;
        }

        public C8040b withRequired(boolean required) {
            this.f51581f = required;
            return this;
        }

        public C8040b withType(cs5 type) {
            this.f51577b = type;
            return this;
        }

        private C8040b() {
        }
    }

    private jr5(Field field, int fieldNumber, cs5 type, Class<?> messageClass, Field presenceField, int presenceMask, boolean required, boolean enforceUtf8, g5c oneof, Class<?> oneofStoredType, Object mapDefaultEntry, v98.InterfaceC13949e enumVerifier, Field cachedSizeField) {
        this.f51568a = field;
        this.f51569b = type;
        this.f51570c = messageClass;
        this.f51571d = fieldNumber;
        this.f51572e = presenceField;
        this.f51573f = presenceMask;
        this.f51574m = required;
        this.f51562C = enforceUtf8;
        this.f51563F = oneof;
        this.f51565L = oneofStoredType;
        this.f51566M = mapDefaultEntry;
        this.f51567N = enumVerifier;
        this.f51564H = cachedSizeField;
    }

    private static void checkFieldNumber(int fieldNumber) {
        if (fieldNumber > 0) {
            return;
        }
        throw new IllegalArgumentException("fieldNumber must be positive: " + fieldNumber);
    }

    public static jr5 forExplicitPresenceField(Field field, int fieldNumber, cs5 fieldType, Field presenceField, int presenceMask, boolean enforceUtf8, v98.InterfaceC13949e enumVerifier) {
        checkFieldNumber(fieldNumber);
        v98.m23882b(field, "field");
        v98.m23882b(fieldType, "fieldType");
        v98.m23882b(presenceField, "presenceField");
        if (presenceField == null || isExactlyOneBitSet(presenceMask)) {
            return new jr5(field, fieldNumber, fieldType, null, presenceField, presenceMask, false, enforceUtf8, null, null, null, enumVerifier, null);
        }
        throw new IllegalArgumentException("presenceMask must have exactly one bit set: " + presenceMask);
    }

    public static jr5 forField(Field field, int fieldNumber, cs5 fieldType, boolean enforceUtf8) {
        checkFieldNumber(fieldNumber);
        v98.m23882b(field, "field");
        v98.m23882b(fieldType, "fieldType");
        if (fieldType == cs5.f27242m2 || fieldType == cs5.f27213I2) {
            throw new IllegalStateException("Shouldn't be called for repeated message fields.");
        }
        return new jr5(field, fieldNumber, fieldType, null, null, 0, false, enforceUtf8, null, null, null, null, null);
    }

    public static jr5 forFieldWithEnumVerifier(Field field, int fieldNumber, cs5 fieldType, v98.InterfaceC13949e enumVerifier) {
        checkFieldNumber(fieldNumber);
        v98.m23882b(field, "field");
        return new jr5(field, fieldNumber, fieldType, null, null, 0, false, false, null, null, null, enumVerifier, null);
    }

    public static jr5 forLegacyRequiredField(Field field, int fieldNumber, cs5 fieldType, Field presenceField, int presenceMask, boolean enforceUtf8, v98.InterfaceC13949e enumVerifier) {
        checkFieldNumber(fieldNumber);
        v98.m23882b(field, "field");
        v98.m23882b(fieldType, "fieldType");
        v98.m23882b(presenceField, "presenceField");
        if (presenceField == null || isExactlyOneBitSet(presenceMask)) {
            return new jr5(field, fieldNumber, fieldType, null, presenceField, presenceMask, true, enforceUtf8, null, null, null, enumVerifier, null);
        }
        throw new IllegalArgumentException("presenceMask must have exactly one bit set: " + presenceMask);
    }

    public static jr5 forMapField(Field field, int fieldNumber, Object mapDefaultEntry, v98.InterfaceC13949e enumVerifier) {
        v98.m23882b(mapDefaultEntry, "mapDefaultEntry");
        checkFieldNumber(fieldNumber);
        v98.m23882b(field, "field");
        return new jr5(field, fieldNumber, cs5.f27214J2, null, null, 0, false, true, null, null, mapDefaultEntry, enumVerifier, null);
    }

    public static jr5 forOneofMemberField(int fieldNumber, cs5 fieldType, g5c oneof, Class<?> oneofStoredType, boolean enforceUtf8, v98.InterfaceC13949e enumVerifier) {
        checkFieldNumber(fieldNumber);
        v98.m23882b(fieldType, "fieldType");
        v98.m23882b(oneof, "oneof");
        v98.m23882b(oneofStoredType, "oneofStoredType");
        if (fieldType.isScalar()) {
            return new jr5(null, fieldNumber, fieldType, null, null, 0, false, enforceUtf8, oneof, oneofStoredType, null, enumVerifier, null);
        }
        throw new IllegalArgumentException("Oneof is only supported for scalar fields. Field " + fieldNumber + " is of type " + fieldType);
    }

    public static jr5 forPackedField(Field field, int fieldNumber, cs5 fieldType, Field cachedSizeField) {
        checkFieldNumber(fieldNumber);
        v98.m23882b(field, "field");
        v98.m23882b(fieldType, "fieldType");
        if (fieldType == cs5.f27242m2 || fieldType == cs5.f27213I2) {
            throw new IllegalStateException("Shouldn't be called for repeated message fields.");
        }
        return new jr5(field, fieldNumber, fieldType, null, null, 0, false, false, null, null, null, null, cachedSizeField);
    }

    public static jr5 forPackedFieldWithEnumVerifier(Field field, int fieldNumber, cs5 fieldType, v98.InterfaceC13949e enumVerifier, Field cachedSizeField) {
        checkFieldNumber(fieldNumber);
        v98.m23882b(field, "field");
        return new jr5(field, fieldNumber, fieldType, null, null, 0, false, false, null, null, null, enumVerifier, cachedSizeField);
    }

    public static jr5 forRepeatedMessageField(Field field, int fieldNumber, cs5 fieldType, Class<?> messageClass) {
        checkFieldNumber(fieldNumber);
        v98.m23882b(field, "field");
        v98.m23882b(fieldType, "fieldType");
        v98.m23882b(messageClass, "messageClass");
        return new jr5(field, fieldNumber, fieldType, messageClass, null, 0, false, false, null, null, null, null, null);
    }

    private static boolean isExactlyOneBitSet(int value) {
        return value != 0 && (value & (value + (-1))) == 0;
    }

    public static C8040b newBuilder() {
        return new C8040b(null);
    }

    public Field getCachedSizeField() {
        return this.f51564H;
    }

    public v98.InterfaceC13949e getEnumVerifier() {
        return this.f51567N;
    }

    public Field getField() {
        return this.f51568a;
    }

    public int getFieldNumber() {
        return this.f51571d;
    }

    public Class<?> getListElementType() {
        return this.f51570c;
    }

    public Object getMapDefaultEntry() {
        return this.f51566M;
    }

    public Class<?> getMessageFieldClass() {
        int i = C8039a.f51575a[this.f51569b.ordinal()];
        if (i == 1 || i == 2) {
            Field field = this.f51568a;
            return field != null ? field.getType() : this.f51565L;
        }
        if (i == 3 || i == 4) {
            return this.f51570c;
        }
        return null;
    }

    public g5c getOneof() {
        return this.f51563F;
    }

    public Class<?> getOneofStoredType() {
        return this.f51565L;
    }

    public Field getPresenceField() {
        return this.f51572e;
    }

    public int getPresenceMask() {
        return this.f51573f;
    }

    public cs5 getType() {
        return this.f51569b;
    }

    public boolean isEnforceUtf8() {
        return this.f51562C;
    }

    public boolean isRequired() {
        return this.f51574m;
    }

    @Override // java.lang.Comparable
    public int compareTo(jr5 o) {
        return this.f51571d - o.f51571d;
    }
}
