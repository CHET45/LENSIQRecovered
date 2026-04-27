package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;
import p000.hpi;
import p000.v27;

/* JADX INFO: loaded from: classes5.dex */
public final class dya extends v27<dya, C5010b> implements iya {
    private static final dya DEFAULT_INSTANCE;
    public static final int LABELS_FIELD_NUMBER = 2;
    private static volatile uhc<dya> PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    private ss9<String, String> labels_ = ss9.emptyMapField();
    private String type_ = "";

    /* JADX INFO: renamed from: dya$a */
    public static /* synthetic */ class C5009a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f31301a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f31301a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31301a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f31301a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f31301a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f31301a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f31301a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f31301a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: dya$b */
    public static final class C5010b extends v27.AbstractC13823b<dya, C5010b> implements iya {
        public /* synthetic */ C5010b(C5009a c5009a) {
            this();
        }

        public C5010b clearLabels() {
            m23743e();
            ((dya) this.f89756b).getMutableLabelsMap().clear();
            return this;
        }

        public C5010b clearType() {
            m23743e();
            ((dya) this.f89756b).clearType();
            return this;
        }

        @Override // p000.iya
        public boolean containsLabels(String str) {
            str.getClass();
            return ((dya) this.f89756b).getLabelsMap().containsKey(str);
        }

        @Override // p000.iya
        @Deprecated
        public Map<String, String> getLabels() {
            return getLabelsMap();
        }

        @Override // p000.iya
        public int getLabelsCount() {
            return ((dya) this.f89756b).getLabelsMap().size();
        }

        @Override // p000.iya
        public Map<String, String> getLabelsMap() {
            return Collections.unmodifiableMap(((dya) this.f89756b).getLabelsMap());
        }

        @Override // p000.iya
        public String getLabelsOrDefault(String str, String str2) {
            str.getClass();
            Map<String, String> labelsMap = ((dya) this.f89756b).getLabelsMap();
            return labelsMap.containsKey(str) ? labelsMap.get(str) : str2;
        }

        @Override // p000.iya
        public String getLabelsOrThrow(String str) {
            str.getClass();
            Map<String, String> labelsMap = ((dya) this.f89756b).getLabelsMap();
            if (labelsMap.containsKey(str)) {
                return labelsMap.get(str);
            }
            throw new IllegalArgumentException();
        }

        @Override // p000.iya
        public String getType() {
            return ((dya) this.f89756b).getType();
        }

        @Override // p000.iya
        public vj1 getTypeBytes() {
            return ((dya) this.f89756b).getTypeBytes();
        }

        public C5010b putAllLabels(Map<String, String> map) {
            m23743e();
            ((dya) this.f89756b).getMutableLabelsMap().putAll(map);
            return this;
        }

        public C5010b putLabels(String str, String str2) {
            str.getClass();
            str2.getClass();
            m23743e();
            ((dya) this.f89756b).getMutableLabelsMap().put(str, str2);
            return this;
        }

        public C5010b removeLabels(String str) {
            str.getClass();
            m23743e();
            ((dya) this.f89756b).getMutableLabelsMap().remove(str);
            return this;
        }

        public C5010b setType(String str) {
            m23743e();
            ((dya) this.f89756b).setType(str);
            return this;
        }

        public C5010b setTypeBytes(vj1 vj1Var) {
            m23743e();
            ((dya) this.f89756b).setTypeBytes(vj1Var);
            return this;
        }

        private C5010b() {
            super(dya.DEFAULT_INSTANCE);
        }
    }

    /* JADX INFO: renamed from: dya$c */
    public static final class C5011c {

        /* JADX INFO: renamed from: a */
        public static final os9<String, String> f31302a;

        static {
            hpi.EnumC6968b enumC6968b = hpi.EnumC6968b.f44485L;
            f31302a = os9.newDefaultInstance(enumC6968b, "", enumC6968b, "");
        }

        private C5011c() {
        }
    }

    static {
        dya dyaVar = new dya();
        DEFAULT_INSTANCE = dyaVar;
        v27.m23715h0(dya.class, dyaVar);
    }

    private dya() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = getDefaultInstance().getType();
    }

    public static dya getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> getMutableLabelsMap() {
        return internalGetMutableLabels();
    }

    private ss9<String, String> internalGetLabels() {
        return this.labels_;
    }

    private ss9<String, String> internalGetMutableLabels() {
        if (!this.labels_.isMutable()) {
            this.labels_ = this.labels_.mutableCopy();
        }
        return this.labels_;
    }

    public static C5010b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    public static dya parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (dya) v27.m23700S(DEFAULT_INSTANCE, inputStream);
    }

    public static dya parseFrom(ByteBuffer byteBuffer) throws ce8 {
        return (dya) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static uhc<dya> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(String str) {
        str.getClass();
        this.type_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeBytes(vj1 vj1Var) {
        AbstractC1714b3.m2857c(vj1Var);
        this.type_ = vj1Var.toStringUtf8();
    }

    @Override // p000.iya
    public boolean containsLabels(String str) {
        str.getClass();
        return internalGetLabels().containsKey(str);
    }

    @Override // p000.iya
    @Deprecated
    public Map<String, String> getLabels() {
        return getLabelsMap();
    }

    @Override // p000.iya
    public int getLabelsCount() {
        return internalGetLabels().size();
    }

    @Override // p000.iya
    public Map<String, String> getLabelsMap() {
        return Collections.unmodifiableMap(internalGetLabels());
    }

    @Override // p000.iya
    public String getLabelsOrDefault(String str, String str2) {
        str.getClass();
        ss9<String, String> ss9VarInternalGetLabels = internalGetLabels();
        return ss9VarInternalGetLabels.containsKey(str) ? ss9VarInternalGetLabels.get(str) : str2;
    }

    @Override // p000.iya
    public String getLabelsOrThrow(String str) {
        str.getClass();
        ss9<String, String> ss9VarInternalGetLabels = internalGetLabels();
        if (ss9VarInternalGetLabels.containsKey(str)) {
            return ss9VarInternalGetLabels.get(str);
        }
        throw new IllegalArgumentException();
    }

    @Override // p000.iya
    public String getType() {
        return this.type_;
    }

    @Override // p000.iya
    public vj1 getTypeBytes() {
        return vj1.copyFromUtf8(this.type_);
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
        C5009a c5009a = null;
        switch (C5009a.f31301a[enumC13830i.ordinal()]) {
            case 1:
                return new dya();
            case 2:
                return new C5010b(c5009a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001Ȉ\u00022", new Object[]{"type_", "labels_", C5011c.f31302a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<dya> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (dya.class) {
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

    public static C5010b newBuilder(dya dyaVar) {
        return DEFAULT_INSTANCE.m23739o(dyaVar);
    }

    public static dya parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (dya) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static dya parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
        return (dya) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
    }

    public static dya parseFrom(vj1 vj1Var) throws ce8 {
        return (dya) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
    }

    public static dya parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
        return (dya) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
    }

    public static dya parseFrom(byte[] bArr) throws ce8 {
        return (dya) v27.m23710c0(DEFAULT_INSTANCE, bArr);
    }

    public static dya parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
        return (dya) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
    }

    public static dya parseFrom(InputStream inputStream) throws IOException {
        return (dya) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
    }

    public static dya parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (dya) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static dya parseFrom(f72 f72Var) throws IOException {
        return (dya) v27.m23704W(DEFAULT_INSTANCE, f72Var);
    }

    public static dya parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
        return (dya) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
    }
}
