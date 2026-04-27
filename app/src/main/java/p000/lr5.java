package p000;

import java.lang.reflect.Field;
import p000.w98;

/* JADX INFO: loaded from: classes4.dex */
@ay1
public final class lr5 implements Comparable<lr5> {

    /* JADX INFO: renamed from: C */
    public final boolean f58513C;

    /* JADX INFO: renamed from: F */
    public final f5c f58514F;

    /* JADX INFO: renamed from: H */
    public final Field f58515H;

    /* JADX INFO: renamed from: L */
    public final Class<?> f58516L;

    /* JADX INFO: renamed from: M */
    public final Object f58517M;

    /* JADX INFO: renamed from: N */
    public final w98.InterfaceC14499f f58518N;

    /* JADX INFO: renamed from: a */
    public final Field f58519a;

    /* JADX INFO: renamed from: b */
    public final ds5 f58520b;

    /* JADX INFO: renamed from: c */
    public final Class<?> f58521c;

    /* JADX INFO: renamed from: d */
    public final int f58522d;

    /* JADX INFO: renamed from: e */
    public final Field f58523e;

    /* JADX INFO: renamed from: f */
    public final int f58524f;

    /* JADX INFO: renamed from: m */
    public final boolean f58525m;

    /* JADX INFO: renamed from: lr5$a */
    public static /* synthetic */ class C8944a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f58526a;

        static {
            int[] iArr = new int[ds5.values().length];
            f58526a = iArr;
            try {
                iArr[ds5.f30551X.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f58526a[ds5.f30557c2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f58526a[ds5.f30569m2.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f58526a[ds5.f30540I2.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: renamed from: lr5$b */
    public static final class C8945b {

        /* JADX INFO: renamed from: a */
        public Field f58527a;

        /* JADX INFO: renamed from: b */
        public ds5 f58528b;

        /* JADX INFO: renamed from: c */
        public int f58529c;

        /* JADX INFO: renamed from: d */
        public Field f58530d;

        /* JADX INFO: renamed from: e */
        public int f58531e;

        /* JADX INFO: renamed from: f */
        public boolean f58532f;

        /* JADX INFO: renamed from: g */
        public boolean f58533g;

        /* JADX INFO: renamed from: h */
        public f5c f58534h;

        /* JADX INFO: renamed from: i */
        public Class<?> f58535i;

        /* JADX INFO: renamed from: j */
        public Object f58536j;

        /* JADX INFO: renamed from: k */
        public w98.InterfaceC14499f f58537k;

        /* JADX INFO: renamed from: l */
        public Field f58538l;

        public /* synthetic */ C8945b(C8944a c8944a) {
            this();
        }

        public lr5 build() {
            f5c f5cVar = this.f58534h;
            if (f5cVar != null) {
                return lr5.forOneofMemberField(this.f58529c, this.f58528b, f5cVar, this.f58535i, this.f58533g, this.f58537k);
            }
            Object obj = this.f58536j;
            if (obj != null) {
                return lr5.forMapField(this.f58527a, this.f58529c, obj, this.f58537k);
            }
            Field field = this.f58530d;
            if (field != null) {
                return this.f58532f ? lr5.forLegacyRequiredField(this.f58527a, this.f58529c, this.f58528b, field, this.f58531e, this.f58533g, this.f58537k) : lr5.forExplicitPresenceField(this.f58527a, this.f58529c, this.f58528b, field, this.f58531e, this.f58533g, this.f58537k);
            }
            w98.InterfaceC14499f interfaceC14499f = this.f58537k;
            if (interfaceC14499f != null) {
                Field field2 = this.f58538l;
                return field2 == null ? lr5.forFieldWithEnumVerifier(this.f58527a, this.f58529c, this.f58528b, interfaceC14499f) : lr5.forPackedFieldWithEnumVerifier(this.f58527a, this.f58529c, this.f58528b, interfaceC14499f, field2);
            }
            Field field3 = this.f58538l;
            return field3 == null ? lr5.forField(this.f58527a, this.f58529c, this.f58528b, this.f58533g) : lr5.forPackedField(this.f58527a, this.f58529c, this.f58528b, field3);
        }

        public C8945b withCachedSizeField(Field cachedSizeField) {
            this.f58538l = cachedSizeField;
            return this;
        }

        public C8945b withEnforceUtf8(boolean enforceUtf8) {
            this.f58533g = enforceUtf8;
            return this;
        }

        public C8945b withEnumVerifier(w98.InterfaceC14499f enumVerifier) {
            this.f58537k = enumVerifier;
            return this;
        }

        public C8945b withField(Field field) {
            if (this.f58534h != null) {
                throw new IllegalStateException("Cannot set field when building a oneof.");
            }
            this.f58527a = field;
            return this;
        }

        public C8945b withFieldNumber(int fieldNumber) {
            this.f58529c = fieldNumber;
            return this;
        }

        public C8945b withMapDefaultEntry(Object mapDefaultEntry) {
            this.f58536j = mapDefaultEntry;
            return this;
        }

        public C8945b withOneof(f5c oneof, Class<?> oneofStoredType) {
            if (this.f58527a != null || this.f58530d != null) {
                throw new IllegalStateException("Cannot set oneof when field or presenceField have been provided");
            }
            this.f58534h = oneof;
            this.f58535i = oneofStoredType;
            return this;
        }

        public C8945b withPresence(Field presenceField, int presenceMask) {
            this.f58530d = (Field) w98.m24433b(presenceField, "presenceField");
            this.f58531e = presenceMask;
            return this;
        }

        public C8945b withRequired(boolean required) {
            this.f58532f = required;
            return this;
        }

        public C8945b withType(ds5 type) {
            this.f58528b = type;
            return this;
        }

        private C8945b() {
        }
    }

    private lr5(Field field, int fieldNumber, ds5 type, Class<?> messageClass, Field presenceField, int presenceMask, boolean required, boolean enforceUtf8, f5c oneof, Class<?> oneofStoredType, Object mapDefaultEntry, w98.InterfaceC14499f enumVerifier, Field cachedSizeField) {
        this.f58519a = field;
        this.f58520b = type;
        this.f58521c = messageClass;
        this.f58522d = fieldNumber;
        this.f58523e = presenceField;
        this.f58524f = presenceMask;
        this.f58525m = required;
        this.f58513C = enforceUtf8;
        this.f58514F = oneof;
        this.f58516L = oneofStoredType;
        this.f58517M = mapDefaultEntry;
        this.f58518N = enumVerifier;
        this.f58515H = cachedSizeField;
    }

    private static void checkFieldNumber(int fieldNumber) {
        if (fieldNumber > 0) {
            return;
        }
        throw new IllegalArgumentException("fieldNumber must be positive: " + fieldNumber);
    }

    public static lr5 forExplicitPresenceField(Field field, int fieldNumber, ds5 fieldType, Field presenceField, int presenceMask, boolean enforceUtf8, w98.InterfaceC14499f enumVerifier) {
        checkFieldNumber(fieldNumber);
        w98.m24433b(field, "field");
        w98.m24433b(fieldType, "fieldType");
        w98.m24433b(presenceField, "presenceField");
        if (presenceField == null || isExactlyOneBitSet(presenceMask)) {
            return new lr5(field, fieldNumber, fieldType, null, presenceField, presenceMask, false, enforceUtf8, null, null, null, enumVerifier, null);
        }
        throw new IllegalArgumentException("presenceMask must have exactly one bit set: " + presenceMask);
    }

    public static lr5 forField(Field field, int fieldNumber, ds5 fieldType, boolean enforceUtf8) {
        checkFieldNumber(fieldNumber);
        w98.m24433b(field, "field");
        w98.m24433b(fieldType, "fieldType");
        if (fieldType == ds5.f30569m2 || fieldType == ds5.f30540I2) {
            throw new IllegalStateException("Shouldn't be called for repeated message fields.");
        }
        return new lr5(field, fieldNumber, fieldType, null, null, 0, false, enforceUtf8, null, null, null, null, null);
    }

    public static lr5 forFieldWithEnumVerifier(Field field, int fieldNumber, ds5 fieldType, w98.InterfaceC14499f enumVerifier) {
        checkFieldNumber(fieldNumber);
        w98.m24433b(field, "field");
        return new lr5(field, fieldNumber, fieldType, null, null, 0, false, false, null, null, null, enumVerifier, null);
    }

    public static lr5 forLegacyRequiredField(Field field, int fieldNumber, ds5 fieldType, Field presenceField, int presenceMask, boolean enforceUtf8, w98.InterfaceC14499f enumVerifier) {
        checkFieldNumber(fieldNumber);
        w98.m24433b(field, "field");
        w98.m24433b(fieldType, "fieldType");
        w98.m24433b(presenceField, "presenceField");
        if (presenceField == null || isExactlyOneBitSet(presenceMask)) {
            return new lr5(field, fieldNumber, fieldType, null, presenceField, presenceMask, true, enforceUtf8, null, null, null, enumVerifier, null);
        }
        throw new IllegalArgumentException("presenceMask must have exactly one bit set: " + presenceMask);
    }

    public static lr5 forMapField(Field field, int fieldNumber, Object mapDefaultEntry, w98.InterfaceC14499f enumVerifier) {
        w98.m24433b(mapDefaultEntry, "mapDefaultEntry");
        checkFieldNumber(fieldNumber);
        w98.m24433b(field, "field");
        return new lr5(field, fieldNumber, ds5.f30541J2, null, null, 0, false, true, null, null, mapDefaultEntry, enumVerifier, null);
    }

    public static lr5 forOneofMemberField(int fieldNumber, ds5 fieldType, f5c oneof, Class<?> oneofStoredType, boolean enforceUtf8, w98.InterfaceC14499f enumVerifier) {
        checkFieldNumber(fieldNumber);
        w98.m24433b(fieldType, "fieldType");
        w98.m24433b(oneof, "oneof");
        w98.m24433b(oneofStoredType, "oneofStoredType");
        if (fieldType.isScalar()) {
            return new lr5(null, fieldNumber, fieldType, null, null, 0, false, enforceUtf8, oneof, oneofStoredType, null, enumVerifier, null);
        }
        throw new IllegalArgumentException("Oneof is only supported for scalar fields. Field " + fieldNumber + " is of type " + fieldType);
    }

    public static lr5 forPackedField(Field field, int fieldNumber, ds5 fieldType, Field cachedSizeField) {
        checkFieldNumber(fieldNumber);
        w98.m24433b(field, "field");
        w98.m24433b(fieldType, "fieldType");
        if (fieldType == ds5.f30569m2 || fieldType == ds5.f30540I2) {
            throw new IllegalStateException("Shouldn't be called for repeated message fields.");
        }
        return new lr5(field, fieldNumber, fieldType, null, null, 0, false, false, null, null, null, null, cachedSizeField);
    }

    public static lr5 forPackedFieldWithEnumVerifier(Field field, int fieldNumber, ds5 fieldType, w98.InterfaceC14499f enumVerifier, Field cachedSizeField) {
        checkFieldNumber(fieldNumber);
        w98.m24433b(field, "field");
        return new lr5(field, fieldNumber, fieldType, null, null, 0, false, false, null, null, null, enumVerifier, cachedSizeField);
    }

    public static lr5 forRepeatedMessageField(Field field, int fieldNumber, ds5 fieldType, Class<?> messageClass) {
        checkFieldNumber(fieldNumber);
        w98.m24433b(field, "field");
        w98.m24433b(fieldType, "fieldType");
        w98.m24433b(messageClass, "messageClass");
        return new lr5(field, fieldNumber, fieldType, messageClass, null, 0, false, false, null, null, null, null, null);
    }

    private static boolean isExactlyOneBitSet(int value) {
        return value != 0 && (value & (value + (-1))) == 0;
    }

    public static C8945b newBuilder() {
        return new C8945b(null);
    }

    public Field getCachedSizeField() {
        return this.f58515H;
    }

    public w98.InterfaceC14499f getEnumVerifier() {
        return this.f58518N;
    }

    public Field getField() {
        return this.f58519a;
    }

    public int getFieldNumber() {
        return this.f58522d;
    }

    public Class<?> getListElementType() {
        return this.f58521c;
    }

    public Object getMapDefaultEntry() {
        return this.f58517M;
    }

    public Class<?> getMessageFieldClass() {
        int i = C8944a.f58526a[this.f58520b.ordinal()];
        if (i == 1 || i == 2) {
            Field field = this.f58519a;
            return field != null ? field.getType() : this.f58516L;
        }
        if (i == 3 || i == 4) {
            return this.f58521c;
        }
        return null;
    }

    public f5c getOneof() {
        return this.f58514F;
    }

    public Class<?> getOneofStoredType() {
        return this.f58516L;
    }

    public Field getPresenceField() {
        return this.f58523e;
    }

    public int getPresenceMask() {
        return this.f58524f;
    }

    public ds5 getType() {
        return this.f58520b;
    }

    public boolean isEnforceUtf8() {
        return this.f58513C;
    }

    public boolean isRequired() {
        return this.f58525m;
    }

    @Override // java.lang.Comparable
    public int compareTo(lr5 o) {
        return this.f58522d - o.f58522d;
    }
}
