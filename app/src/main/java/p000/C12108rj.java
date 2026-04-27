package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;
import p000.hpi;
import p000.v27;

/* JADX INFO: renamed from: rj */
/* JADX INFO: loaded from: classes5.dex */
public final class C12108rj extends v27<C12108rj, c> implements InterfaceC12607sj {
    public static final int AGGREGATE_FIELDS_FIELD_NUMBER = 2;
    private static final C12108rj DEFAULT_INSTANCE;
    private static volatile uhc<C12108rj> PARSER;
    private ss9<String, b2i> aggregateFields_ = ss9.emptyMapField();

    /* JADX INFO: renamed from: rj$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f78409a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f78409a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f78409a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f78409a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f78409a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f78409a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f78409a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f78409a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: rj$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public static final os9<String, b2i> f78410a = os9.newDefaultInstance(hpi.EnumC6968b.f44485L, "", hpi.EnumC6968b.f44488N, b2i.getDefaultInstance());

        private b() {
        }
    }

    /* JADX INFO: renamed from: rj$c */
    public static final class c extends v27.AbstractC13823b<C12108rj, c> implements InterfaceC12607sj {
        public /* synthetic */ c(a aVar) {
            this();
        }

        public c clearAggregateFields() {
            m23743e();
            ((C12108rj) this.f89756b).getMutableAggregateFieldsMap().clear();
            return this;
        }

        @Override // p000.InterfaceC12607sj
        public boolean containsAggregateFields(String str) {
            str.getClass();
            return ((C12108rj) this.f89756b).getAggregateFieldsMap().containsKey(str);
        }

        @Override // p000.InterfaceC12607sj
        @Deprecated
        public Map<String, b2i> getAggregateFields() {
            return getAggregateFieldsMap();
        }

        @Override // p000.InterfaceC12607sj
        public int getAggregateFieldsCount() {
            return ((C12108rj) this.f89756b).getAggregateFieldsMap().size();
        }

        @Override // p000.InterfaceC12607sj
        public Map<String, b2i> getAggregateFieldsMap() {
            return Collections.unmodifiableMap(((C12108rj) this.f89756b).getAggregateFieldsMap());
        }

        @Override // p000.InterfaceC12607sj
        public b2i getAggregateFieldsOrDefault(String str, b2i b2iVar) {
            str.getClass();
            Map<String, b2i> aggregateFieldsMap = ((C12108rj) this.f89756b).getAggregateFieldsMap();
            return aggregateFieldsMap.containsKey(str) ? aggregateFieldsMap.get(str) : b2iVar;
        }

        @Override // p000.InterfaceC12607sj
        public b2i getAggregateFieldsOrThrow(String str) {
            str.getClass();
            Map<String, b2i> aggregateFieldsMap = ((C12108rj) this.f89756b).getAggregateFieldsMap();
            if (aggregateFieldsMap.containsKey(str)) {
                return aggregateFieldsMap.get(str);
            }
            throw new IllegalArgumentException();
        }

        public c putAggregateFields(String str, b2i b2iVar) {
            str.getClass();
            b2iVar.getClass();
            m23743e();
            ((C12108rj) this.f89756b).getMutableAggregateFieldsMap().put(str, b2iVar);
            return this;
        }

        public c putAllAggregateFields(Map<String, b2i> map) {
            m23743e();
            ((C12108rj) this.f89756b).getMutableAggregateFieldsMap().putAll(map);
            return this;
        }

        public c removeAggregateFields(String str) {
            str.getClass();
            m23743e();
            ((C12108rj) this.f89756b).getMutableAggregateFieldsMap().remove(str);
            return this;
        }

        private c() {
            super(C12108rj.DEFAULT_INSTANCE);
        }
    }

    static {
        C12108rj c12108rj = new C12108rj();
        DEFAULT_INSTANCE = c12108rj;
        v27.m23715h0(C12108rj.class, c12108rj);
    }

    private C12108rj() {
    }

    public static C12108rj getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, b2i> getMutableAggregateFieldsMap() {
        return internalGetMutableAggregateFields();
    }

    private ss9<String, b2i> internalGetAggregateFields() {
        return this.aggregateFields_;
    }

    private ss9<String, b2i> internalGetMutableAggregateFields() {
        if (!this.aggregateFields_.isMutable()) {
            this.aggregateFields_ = this.aggregateFields_.mutableCopy();
        }
        return this.aggregateFields_;
    }

    public static c newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    public static C12108rj parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (C12108rj) v27.m23700S(DEFAULT_INSTANCE, inputStream);
    }

    public static C12108rj parseFrom(ByteBuffer byteBuffer) throws ce8 {
        return (C12108rj) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static uhc<C12108rj> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // p000.InterfaceC12607sj
    public boolean containsAggregateFields(String str) {
        str.getClass();
        return internalGetAggregateFields().containsKey(str);
    }

    @Override // p000.InterfaceC12607sj
    @Deprecated
    public Map<String, b2i> getAggregateFields() {
        return getAggregateFieldsMap();
    }

    @Override // p000.InterfaceC12607sj
    public int getAggregateFieldsCount() {
        return internalGetAggregateFields().size();
    }

    @Override // p000.InterfaceC12607sj
    public Map<String, b2i> getAggregateFieldsMap() {
        return Collections.unmodifiableMap(internalGetAggregateFields());
    }

    @Override // p000.InterfaceC12607sj
    public b2i getAggregateFieldsOrDefault(String str, b2i b2iVar) {
        str.getClass();
        ss9<String, b2i> ss9VarInternalGetAggregateFields = internalGetAggregateFields();
        return ss9VarInternalGetAggregateFields.containsKey(str) ? ss9VarInternalGetAggregateFields.get(str) : b2iVar;
    }

    @Override // p000.InterfaceC12607sj
    public b2i getAggregateFieldsOrThrow(String str) {
        str.getClass();
        ss9<String, b2i> ss9VarInternalGetAggregateFields = internalGetAggregateFields();
        if (ss9VarInternalGetAggregateFields.containsKey(str)) {
            return ss9VarInternalGetAggregateFields.get(str);
        }
        throw new IllegalArgumentException();
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f78409a[enumC13830i.ordinal()]) {
            case 1:
                return new C12108rj();
            case 2:
                return new c(aVar);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0001\u0000\u0000\u00022", new Object[]{"aggregateFields_", b.f78410a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<C12108rj> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (C12108rj.class) {
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

    public static c newBuilder(C12108rj c12108rj) {
        return DEFAULT_INSTANCE.m23739o(c12108rj);
    }

    public static C12108rj parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (C12108rj) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static C12108rj parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
        return (C12108rj) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
    }

    public static C12108rj parseFrom(vj1 vj1Var) throws ce8 {
        return (C12108rj) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
    }

    public static C12108rj parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
        return (C12108rj) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
    }

    public static C12108rj parseFrom(byte[] bArr) throws ce8 {
        return (C12108rj) v27.m23710c0(DEFAULT_INSTANCE, bArr);
    }

    public static C12108rj parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
        return (C12108rj) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
    }

    public static C12108rj parseFrom(InputStream inputStream) throws IOException {
        return (C12108rj) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
    }

    public static C12108rj parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (C12108rj) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static C12108rj parseFrom(f72 f72Var) throws IOException {
        return (C12108rj) v27.m23704W(DEFAULT_INSTANCE, f72Var);
    }

    public static C12108rj parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
        return (C12108rj) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
    }
}
