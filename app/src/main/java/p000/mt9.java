package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;
import p000.hpi;
import p000.v27;

/* JADX INFO: loaded from: classes5.dex */
public final class mt9 extends v27<mt9, C9519b> implements nt9 {
    private static final mt9 DEFAULT_INSTANCE;
    public static final int FIELDS_FIELD_NUMBER = 1;
    private static volatile uhc<mt9> PARSER;
    private ss9<String, b2i> fields_ = ss9.emptyMapField();

    /* JADX INFO: renamed from: mt9$a */
    public static /* synthetic */ class C9518a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f62094a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f62094a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f62094a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f62094a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f62094a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f62094a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f62094a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f62094a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: mt9$b */
    public static final class C9519b extends v27.AbstractC13823b<mt9, C9519b> implements nt9 {
        public /* synthetic */ C9519b(C9518a c9518a) {
            this();
        }

        public C9519b clearFields() {
            m23743e();
            ((mt9) this.f89756b).getMutableFieldsMap().clear();
            return this;
        }

        @Override // p000.nt9
        public boolean containsFields(String str) {
            str.getClass();
            return ((mt9) this.f89756b).getFieldsMap().containsKey(str);
        }

        @Override // p000.nt9
        @Deprecated
        public Map<String, b2i> getFields() {
            return getFieldsMap();
        }

        @Override // p000.nt9
        public int getFieldsCount() {
            return ((mt9) this.f89756b).getFieldsMap().size();
        }

        @Override // p000.nt9
        public Map<String, b2i> getFieldsMap() {
            return Collections.unmodifiableMap(((mt9) this.f89756b).getFieldsMap());
        }

        @Override // p000.nt9
        public b2i getFieldsOrDefault(String str, b2i b2iVar) {
            str.getClass();
            Map<String, b2i> fieldsMap = ((mt9) this.f89756b).getFieldsMap();
            return fieldsMap.containsKey(str) ? fieldsMap.get(str) : b2iVar;
        }

        @Override // p000.nt9
        public b2i getFieldsOrThrow(String str) {
            str.getClass();
            Map<String, b2i> fieldsMap = ((mt9) this.f89756b).getFieldsMap();
            if (fieldsMap.containsKey(str)) {
                return fieldsMap.get(str);
            }
            throw new IllegalArgumentException();
        }

        public C9519b putAllFields(Map<String, b2i> map) {
            m23743e();
            ((mt9) this.f89756b).getMutableFieldsMap().putAll(map);
            return this;
        }

        public C9519b putFields(String str, b2i b2iVar) {
            str.getClass();
            b2iVar.getClass();
            m23743e();
            ((mt9) this.f89756b).getMutableFieldsMap().put(str, b2iVar);
            return this;
        }

        public C9519b removeFields(String str) {
            str.getClass();
            m23743e();
            ((mt9) this.f89756b).getMutableFieldsMap().remove(str);
            return this;
        }

        private C9519b() {
            super(mt9.DEFAULT_INSTANCE);
        }
    }

    /* JADX INFO: renamed from: mt9$c */
    public static final class C9520c {

        /* JADX INFO: renamed from: a */
        public static final os9<String, b2i> f62095a = os9.newDefaultInstance(hpi.EnumC6968b.f44485L, "", hpi.EnumC6968b.f44488N, b2i.getDefaultInstance());

        private C9520c() {
        }
    }

    static {
        mt9 mt9Var = new mt9();
        DEFAULT_INSTANCE = mt9Var;
        v27.m23715h0(mt9.class, mt9Var);
    }

    private mt9() {
    }

    public static mt9 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, b2i> getMutableFieldsMap() {
        return internalGetMutableFields();
    }

    private ss9<String, b2i> internalGetFields() {
        return this.fields_;
    }

    private ss9<String, b2i> internalGetMutableFields() {
        if (!this.fields_.isMutable()) {
            this.fields_ = this.fields_.mutableCopy();
        }
        return this.fields_;
    }

    public static C9519b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    public static mt9 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (mt9) v27.m23700S(DEFAULT_INSTANCE, inputStream);
    }

    public static mt9 parseFrom(ByteBuffer byteBuffer) throws ce8 {
        return (mt9) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static uhc<mt9> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // p000.nt9
    public boolean containsFields(String str) {
        str.getClass();
        return internalGetFields().containsKey(str);
    }

    @Override // p000.nt9
    @Deprecated
    public Map<String, b2i> getFields() {
        return getFieldsMap();
    }

    @Override // p000.nt9
    public int getFieldsCount() {
        return internalGetFields().size();
    }

    @Override // p000.nt9
    public Map<String, b2i> getFieldsMap() {
        return Collections.unmodifiableMap(internalGetFields());
    }

    @Override // p000.nt9
    public b2i getFieldsOrDefault(String str, b2i b2iVar) {
        str.getClass();
        ss9<String, b2i> ss9VarInternalGetFields = internalGetFields();
        return ss9VarInternalGetFields.containsKey(str) ? ss9VarInternalGetFields.get(str) : b2iVar;
    }

    @Override // p000.nt9
    public b2i getFieldsOrThrow(String str) {
        str.getClass();
        ss9<String, b2i> ss9VarInternalGetFields = internalGetFields();
        if (ss9VarInternalGetFields.containsKey(str)) {
            return ss9VarInternalGetFields.get(str);
        }
        throw new IllegalArgumentException();
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
        C9518a c9518a = null;
        switch (C9518a.f62094a[enumC13830i.ordinal()]) {
            case 1:
                return new mt9();
            case 2:
                return new C9519b(c9518a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"fields_", C9520c.f62095a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<mt9> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (mt9.class) {
                        try {
                            c13824c = PARSER;
                            if (c13824c == null) {
                                c13824c = new v27.C13824c<>(DEFAULT_INSTANCE);
                                PARSER = c13824c;
                            }
                        } finally {
                        }
                        break;
                    }
                }
                return c13824c;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public static C9519b newBuilder(mt9 mt9Var) {
        return DEFAULT_INSTANCE.m23739o(mt9Var);
    }

    public static mt9 parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (mt9) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static mt9 parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
        return (mt9) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
    }

    public static mt9 parseFrom(vj1 vj1Var) throws ce8 {
        return (mt9) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
    }

    public static mt9 parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
        return (mt9) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
    }

    public static mt9 parseFrom(byte[] bArr) throws ce8 {
        return (mt9) v27.m23710c0(DEFAULT_INSTANCE, bArr);
    }

    public static mt9 parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
        return (mt9) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
    }

    public static mt9 parseFrom(InputStream inputStream) throws IOException {
        return (mt9) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
    }

    public static mt9 parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (mt9) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static mt9 parseFrom(f72 f72Var) throws IOException {
        return (mt9) v27.m23704W(DEFAULT_INSTANCE, f72Var);
    }

    public static mt9 parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
        return (mt9) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
    }
}
