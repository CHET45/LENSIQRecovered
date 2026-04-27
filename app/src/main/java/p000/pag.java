package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;
import p000.hpi;
import p000.v27;

/* JADX INFO: loaded from: classes4.dex */
public final class pag extends v27<pag, C10875b> implements qag {
    private static final pag DEFAULT_INSTANCE;
    public static final int FIELDS_FIELD_NUMBER = 1;
    private static volatile uhc<pag> PARSER;
    private ss9<String, c2i> fields_ = ss9.emptyMapField();

    /* JADX INFO: renamed from: pag$a */
    public static /* synthetic */ class C10874a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f70178a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f70178a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f70178a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f70178a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f70178a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f70178a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f70178a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f70178a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: pag$b */
    public static final class C10875b extends v27.AbstractC13823b<pag, C10875b> implements qag {
        public /* synthetic */ C10875b(C10874a c10874a) {
            this();
        }

        public C10875b clearFields() {
            m23743e();
            ((pag) this.f89756b).getMutableFieldsMap().clear();
            return this;
        }

        @Override // p000.qag
        public boolean containsFields(String key) {
            key.getClass();
            return ((pag) this.f89756b).getFieldsMap().containsKey(key);
        }

        @Override // p000.qag
        @Deprecated
        public Map<String, c2i> getFields() {
            return getFieldsMap();
        }

        @Override // p000.qag
        public int getFieldsCount() {
            return ((pag) this.f89756b).getFieldsMap().size();
        }

        @Override // p000.qag
        public Map<String, c2i> getFieldsMap() {
            return Collections.unmodifiableMap(((pag) this.f89756b).getFieldsMap());
        }

        @Override // p000.qag
        public c2i getFieldsOrDefault(String key, c2i defaultValue) {
            key.getClass();
            Map<String, c2i> fieldsMap = ((pag) this.f89756b).getFieldsMap();
            return fieldsMap.containsKey(key) ? fieldsMap.get(key) : defaultValue;
        }

        @Override // p000.qag
        public c2i getFieldsOrThrow(String key) {
            key.getClass();
            Map<String, c2i> fieldsMap = ((pag) this.f89756b).getFieldsMap();
            if (fieldsMap.containsKey(key)) {
                return fieldsMap.get(key);
            }
            throw new IllegalArgumentException();
        }

        public C10875b putAllFields(Map<String, c2i> values) {
            m23743e();
            ((pag) this.f89756b).getMutableFieldsMap().putAll(values);
            return this;
        }

        public C10875b putFields(String key, c2i value) {
            key.getClass();
            value.getClass();
            m23743e();
            ((pag) this.f89756b).getMutableFieldsMap().put(key, value);
            return this;
        }

        public C10875b removeFields(String key) {
            key.getClass();
            m23743e();
            ((pag) this.f89756b).getMutableFieldsMap().remove(key);
            return this;
        }

        private C10875b() {
            super(pag.DEFAULT_INSTANCE);
        }
    }

    /* JADX INFO: renamed from: pag$c */
    public static final class C10876c {

        /* JADX INFO: renamed from: a */
        public static final os9<String, c2i> f70179a = os9.newDefaultInstance(hpi.EnumC6968b.f44485L, "", hpi.EnumC6968b.f44488N, c2i.getDefaultInstance());

        private C10876c() {
        }
    }

    static {
        pag pagVar = new pag();
        DEFAULT_INSTANCE = pagVar;
        v27.m23715h0(pag.class, pagVar);
    }

    private pag() {
    }

    public static pag getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, c2i> getMutableFieldsMap() {
        return internalGetMutableFields();
    }

    private ss9<String, c2i> internalGetFields() {
        return this.fields_;
    }

    private ss9<String, c2i> internalGetMutableFields() {
        if (!this.fields_.isMutable()) {
            this.fields_ = this.fields_.mutableCopy();
        }
        return this.fields_;
    }

    public static C10875b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    public static pag parseDelimitedFrom(InputStream input) throws IOException {
        return (pag) v27.m23700S(DEFAULT_INSTANCE, input);
    }

    public static pag parseFrom(ByteBuffer data) throws ce8 {
        return (pag) v27.m23708a0(DEFAULT_INSTANCE, data);
    }

    public static uhc<pag> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // p000.qag
    public boolean containsFields(String key) {
        key.getClass();
        return internalGetFields().containsKey(key);
    }

    @Override // p000.qag
    @Deprecated
    public Map<String, c2i> getFields() {
        return getFieldsMap();
    }

    @Override // p000.qag
    public int getFieldsCount() {
        return internalGetFields().size();
    }

    @Override // p000.qag
    public Map<String, c2i> getFieldsMap() {
        return Collections.unmodifiableMap(internalGetFields());
    }

    @Override // p000.qag
    public c2i getFieldsOrDefault(String key, c2i defaultValue) {
        key.getClass();
        ss9<String, c2i> ss9VarInternalGetFields = internalGetFields();
        return ss9VarInternalGetFields.containsKey(key) ? ss9VarInternalGetFields.get(key) : defaultValue;
    }

    @Override // p000.qag
    public c2i getFieldsOrThrow(String key) {
        key.getClass();
        ss9<String, c2i> ss9VarInternalGetFields = internalGetFields();
        if (ss9VarInternalGetFields.containsKey(key)) {
            return ss9VarInternalGetFields.get(key);
        }
        throw new IllegalArgumentException();
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i method, Object arg0, Object arg1) {
        C10874a c10874a = null;
        switch (C10874a.f70178a[method.ordinal()]) {
            case 1:
                return new pag();
            case 2:
                return new C10875b(c10874a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"fields_", C10876c.f70179a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<pag> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (pag.class) {
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

    public static C10875b newBuilder(pag prototype) {
        return DEFAULT_INSTANCE.m23739o(prototype);
    }

    public static pag parseDelimitedFrom(InputStream input, zi5 extensionRegistry) throws IOException {
        return (pag) v27.m23701T(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static pag parseFrom(ByteBuffer data, zi5 extensionRegistry) throws ce8 {
        return (pag) v27.m23709b0(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static pag parseFrom(vj1 data) throws ce8 {
        return (pag) v27.m23702U(DEFAULT_INSTANCE, data);
    }

    public static pag parseFrom(vj1 data, zi5 extensionRegistry) throws ce8 {
        return (pag) v27.m23703V(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static pag parseFrom(byte[] data) throws ce8 {
        return (pag) v27.m23710c0(DEFAULT_INSTANCE, data);
    }

    public static pag parseFrom(byte[] data, zi5 extensionRegistry) throws ce8 {
        return (pag) v27.m23711d0(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static pag parseFrom(InputStream input) throws IOException {
        return (pag) v27.m23706Y(DEFAULT_INSTANCE, input);
    }

    public static pag parseFrom(InputStream input, zi5 extensionRegistry) throws IOException {
        return (pag) v27.m23707Z(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static pag parseFrom(f72 input) throws IOException {
        return (pag) v27.m23704W(DEFAULT_INSTANCE, input);
    }

    public static pag parseFrom(f72 input, zi5 extensionRegistry) throws IOException {
        return (pag) v27.m23705X(DEFAULT_INSTANCE, input, extensionRegistry);
    }
}
