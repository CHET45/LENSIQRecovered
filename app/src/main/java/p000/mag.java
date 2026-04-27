package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;
import p000.gpi;
import p000.u27;

/* JADX INFO: loaded from: classes3.dex */
public final class mag extends u27<mag, C9241b> implements rag {
    private static final mag DEFAULT_INSTANCE;
    public static final int FIELDS_FIELD_NUMBER = 1;
    private static volatile vhc<mag> PARSER;
    private ts9<String, a2i> fields_ = ts9.emptyMapField();

    /* JADX INFO: renamed from: mag$a */
    public static /* synthetic */ class C9240a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f60355a;

        static {
            int[] iArr = new int[u27.EnumC13331i.values().length];
            f60355a = iArr;
            try {
                iArr[u27.EnumC13331i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f60355a[u27.EnumC13331i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f60355a[u27.EnumC13331i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f60355a[u27.EnumC13331i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f60355a[u27.EnumC13331i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f60355a[u27.EnumC13331i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f60355a[u27.EnumC13331i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: mag$b */
    public static final class C9241b extends u27.AbstractC13324b<mag, C9241b> implements rag {
        public /* synthetic */ C9241b(C9240a c9240a) {
            this();
        }

        public C9241b clearFields() {
            m23058e();
            ((mag) this.f86607b).getMutableFieldsMap().clear();
            return this;
        }

        @Override // p000.rag
        public boolean containsFields(String key) {
            key.getClass();
            return ((mag) this.f86607b).getFieldsMap().containsKey(key);
        }

        @Override // p000.rag
        @Deprecated
        public Map<String, a2i> getFields() {
            return getFieldsMap();
        }

        @Override // p000.rag
        public int getFieldsCount() {
            return ((mag) this.f86607b).getFieldsMap().size();
        }

        @Override // p000.rag
        public Map<String, a2i> getFieldsMap() {
            return Collections.unmodifiableMap(((mag) this.f86607b).getFieldsMap());
        }

        @Override // p000.rag
        public a2i getFieldsOrDefault(String key, a2i defaultValue) {
            key.getClass();
            Map<String, a2i> fieldsMap = ((mag) this.f86607b).getFieldsMap();
            return fieldsMap.containsKey(key) ? fieldsMap.get(key) : defaultValue;
        }

        @Override // p000.rag
        public a2i getFieldsOrThrow(String key) {
            key.getClass();
            Map<String, a2i> fieldsMap = ((mag) this.f86607b).getFieldsMap();
            if (fieldsMap.containsKey(key)) {
                return fieldsMap.get(key);
            }
            throw new IllegalArgumentException();
        }

        public C9241b putAllFields(Map<String, a2i> values) {
            m23058e();
            ((mag) this.f86607b).getMutableFieldsMap().putAll(values);
            return this;
        }

        public C9241b putFields(String key, a2i value) {
            key.getClass();
            value.getClass();
            m23058e();
            ((mag) this.f86607b).getMutableFieldsMap().put(key, value);
            return this;
        }

        public C9241b removeFields(String key) {
            key.getClass();
            m23058e();
            ((mag) this.f86607b).getMutableFieldsMap().remove(key);
            return this;
        }

        private C9241b() {
            super(mag.DEFAULT_INSTANCE);
        }
    }

    /* JADX INFO: renamed from: mag$c */
    public static final class C9242c {

        /* JADX INFO: renamed from: a */
        public static final ns9<String, a2i> f60356a = ns9.newDefaultInstance(gpi.EnumC6460b.f40751L, "", gpi.EnumC6460b.f40754N, a2i.getDefaultInstance());

        private C9242c() {
        }
    }

    static {
        mag magVar = new mag();
        DEFAULT_INSTANCE = magVar;
        u27.m23029g0(mag.class, magVar);
    }

    private mag() {
    }

    public static mag getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, a2i> getMutableFieldsMap() {
        return internalGetMutableFields();
    }

    private ts9<String, a2i> internalGetFields() {
        return this.fields_;
    }

    private ts9<String, a2i> internalGetMutableFields() {
        if (!this.fields_.isMutable()) {
            this.fields_ = this.fields_.mutableCopy();
        }
        return this.fields_;
    }

    public static C9241b newBuilder() {
        return DEFAULT_INSTANCE.m23053m();
    }

    public static mag parseDelimitedFrom(InputStream input) throws IOException {
        return (mag) u27.m23014R(DEFAULT_INSTANCE, input);
    }

    public static mag parseFrom(ByteBuffer data) throws be8 {
        return (mag) u27.m23022Z(DEFAULT_INSTANCE, data);
    }

    public static vhc<mag> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // p000.rag
    public boolean containsFields(String key) {
        key.getClass();
        return internalGetFields().containsKey(key);
    }

    @Override // p000.rag
    @Deprecated
    public Map<String, a2i> getFields() {
        return getFieldsMap();
    }

    @Override // p000.rag
    public int getFieldsCount() {
        return internalGetFields().size();
    }

    @Override // p000.rag
    public Map<String, a2i> getFieldsMap() {
        return Collections.unmodifiableMap(internalGetFields());
    }

    @Override // p000.rag
    public a2i getFieldsOrDefault(String key, a2i defaultValue) {
        key.getClass();
        ts9<String, a2i> ts9VarInternalGetFields = internalGetFields();
        return ts9VarInternalGetFields.containsKey(key) ? ts9VarInternalGetFields.get(key) : defaultValue;
    }

    @Override // p000.rag
    public a2i getFieldsOrThrow(String key) {
        key.getClass();
        ts9<String, a2i> ts9VarInternalGetFields = internalGetFields();
        if (ts9VarInternalGetFields.containsKey(key)) {
            return ts9VarInternalGetFields.get(key);
        }
        throw new IllegalArgumentException();
    }

    @Override // p000.u27
    /* JADX INFO: renamed from: q */
    public final Object mo79q(u27.EnumC13331i method, Object arg0, Object arg1) {
        C9240a c9240a = null;
        switch (C9240a.f60355a[method.ordinal()]) {
            case 1:
                return new mag();
            case 2:
                return new C9241b(c9240a);
            case 3:
                return u27.m23013P(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"fields_", C9242c.f60356a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                vhc<mag> c13325c = PARSER;
                if (c13325c == null) {
                    synchronized (mag.class) {
                        try {
                            c13325c = PARSER;
                            if (c13325c == null) {
                                c13325c = new u27.C13325c<>(DEFAULT_INSTANCE);
                                PARSER = c13325c;
                            }
                        } finally {
                        }
                        break;
                    }
                }
                return c13325c;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public static C9241b newBuilder(mag prototype) {
        return DEFAULT_INSTANCE.m23054n(prototype);
    }

    public static mag parseDelimitedFrom(InputStream input, yi5 extensionRegistry) throws IOException {
        return (mag) u27.m23015S(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static mag parseFrom(ByteBuffer data, yi5 extensionRegistry) throws be8 {
        return (mag) u27.m23023a0(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static mag parseFrom(wj1 data) throws be8 {
        return (mag) u27.m23016T(DEFAULT_INSTANCE, data);
    }

    public static mag parseFrom(wj1 data, yi5 extensionRegistry) throws be8 {
        return (mag) u27.m23017U(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static mag parseFrom(byte[] data) throws be8 {
        return (mag) u27.m23024b0(DEFAULT_INSTANCE, data);
    }

    public static mag parseFrom(byte[] data, yi5 extensionRegistry) throws be8 {
        return (mag) u27.m23025c0(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static mag parseFrom(InputStream input) throws IOException {
        return (mag) u27.m23020X(DEFAULT_INSTANCE, input);
    }

    public static mag parseFrom(InputStream input, yi5 extensionRegistry) throws IOException {
        return (mag) u27.m23021Y(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static mag parseFrom(e72 input) throws IOException {
        return (mag) u27.m23018V(DEFAULT_INSTANCE, input);
    }

    public static mag parseFrom(e72 input, yi5 extensionRegistry) throws IOException {
        return (mag) u27.m23019W(DEFAULT_INSTANCE, input, extensionRegistry);
    }
}
