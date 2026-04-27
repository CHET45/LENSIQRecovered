package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;
import p000.f2h;
import p000.hpi;
import p000.v27;

/* JADX INFO: loaded from: classes5.dex */
public final class nh4 extends v27<nh4, C9874b> implements fi4 {
    public static final int CREATE_TIME_FIELD_NUMBER = 3;
    private static final nh4 DEFAULT_INSTANCE;
    public static final int FIELDS_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile uhc<nh4> PARSER = null;
    public static final int UPDATE_TIME_FIELD_NUMBER = 4;
    private int bitField0_;
    private f2h createTime_;
    private ss9<String, b2i> fields_ = ss9.emptyMapField();
    private String name_ = "";
    private f2h updateTime_;

    /* JADX INFO: renamed from: nh4$a */
    public static /* synthetic */ class C9873a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f64510a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f64510a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f64510a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f64510a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f64510a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f64510a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f64510a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f64510a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: nh4$b */
    public static final class C9874b extends v27.AbstractC13823b<nh4, C9874b> implements fi4 {
        public /* synthetic */ C9874b(C9873a c9873a) {
            this();
        }

        public C9874b clearCreateTime() {
            m23743e();
            ((nh4) this.f89756b).clearCreateTime();
            return this;
        }

        public C9874b clearFields() {
            m23743e();
            ((nh4) this.f89756b).getMutableFieldsMap().clear();
            return this;
        }

        public C9874b clearName() {
            m23743e();
            ((nh4) this.f89756b).clearName();
            return this;
        }

        public C9874b clearUpdateTime() {
            m23743e();
            ((nh4) this.f89756b).clearUpdateTime();
            return this;
        }

        @Override // p000.fi4
        public boolean containsFields(String str) {
            str.getClass();
            return ((nh4) this.f89756b).getFieldsMap().containsKey(str);
        }

        @Override // p000.fi4
        public f2h getCreateTime() {
            return ((nh4) this.f89756b).getCreateTime();
        }

        @Override // p000.fi4
        @Deprecated
        public Map<String, b2i> getFields() {
            return getFieldsMap();
        }

        @Override // p000.fi4
        public int getFieldsCount() {
            return ((nh4) this.f89756b).getFieldsMap().size();
        }

        @Override // p000.fi4
        public Map<String, b2i> getFieldsMap() {
            return Collections.unmodifiableMap(((nh4) this.f89756b).getFieldsMap());
        }

        @Override // p000.fi4
        public b2i getFieldsOrDefault(String str, b2i b2iVar) {
            str.getClass();
            Map<String, b2i> fieldsMap = ((nh4) this.f89756b).getFieldsMap();
            return fieldsMap.containsKey(str) ? fieldsMap.get(str) : b2iVar;
        }

        @Override // p000.fi4
        public b2i getFieldsOrThrow(String str) {
            str.getClass();
            Map<String, b2i> fieldsMap = ((nh4) this.f89756b).getFieldsMap();
            if (fieldsMap.containsKey(str)) {
                return fieldsMap.get(str);
            }
            throw new IllegalArgumentException();
        }

        @Override // p000.fi4
        public String getName() {
            return ((nh4) this.f89756b).getName();
        }

        @Override // p000.fi4
        public vj1 getNameBytes() {
            return ((nh4) this.f89756b).getNameBytes();
        }

        @Override // p000.fi4
        public f2h getUpdateTime() {
            return ((nh4) this.f89756b).getUpdateTime();
        }

        @Override // p000.fi4
        public boolean hasCreateTime() {
            return ((nh4) this.f89756b).hasCreateTime();
        }

        @Override // p000.fi4
        public boolean hasUpdateTime() {
            return ((nh4) this.f89756b).hasUpdateTime();
        }

        public C9874b mergeCreateTime(f2h f2hVar) {
            m23743e();
            ((nh4) this.f89756b).mergeCreateTime(f2hVar);
            return this;
        }

        public C9874b mergeUpdateTime(f2h f2hVar) {
            m23743e();
            ((nh4) this.f89756b).mergeUpdateTime(f2hVar);
            return this;
        }

        public C9874b putAllFields(Map<String, b2i> map) {
            m23743e();
            ((nh4) this.f89756b).getMutableFieldsMap().putAll(map);
            return this;
        }

        public C9874b putFields(String str, b2i b2iVar) {
            str.getClass();
            b2iVar.getClass();
            m23743e();
            ((nh4) this.f89756b).getMutableFieldsMap().put(str, b2iVar);
            return this;
        }

        public C9874b removeFields(String str) {
            str.getClass();
            m23743e();
            ((nh4) this.f89756b).getMutableFieldsMap().remove(str);
            return this;
        }

        public C9874b setCreateTime(f2h f2hVar) {
            m23743e();
            ((nh4) this.f89756b).setCreateTime(f2hVar);
            return this;
        }

        public C9874b setName(String str) {
            m23743e();
            ((nh4) this.f89756b).setName(str);
            return this;
        }

        public C9874b setNameBytes(vj1 vj1Var) {
            m23743e();
            ((nh4) this.f89756b).setNameBytes(vj1Var);
            return this;
        }

        public C9874b setUpdateTime(f2h f2hVar) {
            m23743e();
            ((nh4) this.f89756b).setUpdateTime(f2hVar);
            return this;
        }

        private C9874b() {
            super(nh4.DEFAULT_INSTANCE);
        }

        public C9874b setCreateTime(f2h.C5567b c5567b) {
            m23743e();
            ((nh4) this.f89756b).setCreateTime(c5567b.build());
            return this;
        }

        public C9874b setUpdateTime(f2h.C5567b c5567b) {
            m23743e();
            ((nh4) this.f89756b).setUpdateTime(c5567b.build());
            return this;
        }
    }

    /* JADX INFO: renamed from: nh4$c */
    public static final class C9875c {

        /* JADX INFO: renamed from: a */
        public static final os9<String, b2i> f64511a = os9.newDefaultInstance(hpi.EnumC6968b.f44485L, "", hpi.EnumC6968b.f44488N, b2i.getDefaultInstance());

        private C9875c() {
        }
    }

    static {
        nh4 nh4Var = new nh4();
        DEFAULT_INSTANCE = nh4Var;
        v27.m23715h0(nh4.class, nh4Var);
    }

    private nh4() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCreateTime() {
        this.createTime_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUpdateTime() {
        this.updateTime_ = null;
        this.bitField0_ &= -3;
    }

    public static nh4 getDefaultInstance() {
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

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCreateTime(f2h f2hVar) {
        f2hVar.getClass();
        f2h f2hVar2 = this.createTime_;
        if (f2hVar2 == null || f2hVar2 == f2h.getDefaultInstance()) {
            this.createTime_ = f2hVar;
        } else {
            this.createTime_ = f2h.newBuilder(this.createTime_).mergeFrom(f2hVar).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUpdateTime(f2h f2hVar) {
        f2hVar.getClass();
        f2h f2hVar2 = this.updateTime_;
        if (f2hVar2 == null || f2hVar2 == f2h.getDefaultInstance()) {
            this.updateTime_ = f2hVar;
        } else {
            this.updateTime_ = f2h.newBuilder(this.updateTime_).mergeFrom(f2hVar).buildPartial();
        }
        this.bitField0_ |= 2;
    }

    public static C9874b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    public static nh4 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (nh4) v27.m23700S(DEFAULT_INSTANCE, inputStream);
    }

    public static nh4 parseFrom(ByteBuffer byteBuffer) throws ce8 {
        return (nh4) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static uhc<nh4> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCreateTime(f2h f2hVar) {
        f2hVar.getClass();
        this.createTime_ = f2hVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(vj1 vj1Var) {
        AbstractC1714b3.m2857c(vj1Var);
        this.name_ = vj1Var.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUpdateTime(f2h f2hVar) {
        f2hVar.getClass();
        this.updateTime_ = f2hVar;
        this.bitField0_ |= 2;
    }

    @Override // p000.fi4
    public boolean containsFields(String str) {
        str.getClass();
        return internalGetFields().containsKey(str);
    }

    @Override // p000.fi4
    public f2h getCreateTime() {
        f2h f2hVar = this.createTime_;
        return f2hVar == null ? f2h.getDefaultInstance() : f2hVar;
    }

    @Override // p000.fi4
    @Deprecated
    public Map<String, b2i> getFields() {
        return getFieldsMap();
    }

    @Override // p000.fi4
    public int getFieldsCount() {
        return internalGetFields().size();
    }

    @Override // p000.fi4
    public Map<String, b2i> getFieldsMap() {
        return Collections.unmodifiableMap(internalGetFields());
    }

    @Override // p000.fi4
    public b2i getFieldsOrDefault(String str, b2i b2iVar) {
        str.getClass();
        ss9<String, b2i> ss9VarInternalGetFields = internalGetFields();
        return ss9VarInternalGetFields.containsKey(str) ? ss9VarInternalGetFields.get(str) : b2iVar;
    }

    @Override // p000.fi4
    public b2i getFieldsOrThrow(String str) {
        str.getClass();
        ss9<String, b2i> ss9VarInternalGetFields = internalGetFields();
        if (ss9VarInternalGetFields.containsKey(str)) {
            return ss9VarInternalGetFields.get(str);
        }
        throw new IllegalArgumentException();
    }

    @Override // p000.fi4
    public String getName() {
        return this.name_;
    }

    @Override // p000.fi4
    public vj1 getNameBytes() {
        return vj1.copyFromUtf8(this.name_);
    }

    @Override // p000.fi4
    public f2h getUpdateTime() {
        f2h f2hVar = this.updateTime_;
        return f2hVar == null ? f2h.getDefaultInstance() : f2hVar;
    }

    @Override // p000.fi4
    public boolean hasCreateTime() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // p000.fi4
    public boolean hasUpdateTime() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
        C9873a c9873a = null;
        switch (C9873a.f64510a[enumC13830i.ordinal()]) {
            case 1:
                return new nh4();
            case 2:
                return new C9874b(c9873a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0001\u0000\u0000\u0001Ȉ\u00022\u0003ဉ\u0000\u0004ဉ\u0001", new Object[]{"bitField0_", "name_", "fields_", C9875c.f64511a, "createTime_", "updateTime_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<nh4> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (nh4.class) {
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

    public static C9874b newBuilder(nh4 nh4Var) {
        return DEFAULT_INSTANCE.m23739o(nh4Var);
    }

    public static nh4 parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (nh4) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static nh4 parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
        return (nh4) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
    }

    public static nh4 parseFrom(vj1 vj1Var) throws ce8 {
        return (nh4) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
    }

    public static nh4 parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
        return (nh4) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
    }

    public static nh4 parseFrom(byte[] bArr) throws ce8 {
        return (nh4) v27.m23710c0(DEFAULT_INSTANCE, bArr);
    }

    public static nh4 parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
        return (nh4) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
    }

    public static nh4 parseFrom(InputStream inputStream) throws IOException {
        return (nh4) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
    }

    public static nh4 parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (nh4) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static nh4 parseFrom(f72 f72Var) throws IOException {
        return (nh4) v27.m23704W(DEFAULT_INSTANCE, f72Var);
    }

    public static nh4 parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
        return (nh4) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
    }
}
