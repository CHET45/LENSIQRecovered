package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;
import p000.hpi;
import p000.v27;

/* JADX INFO: loaded from: classes5.dex */
public final class cva extends v27<cva, C4528b> implements fva {
    private static final cva DEFAULT_INSTANCE;
    public static final int LABELS_FIELD_NUMBER = 2;
    private static volatile uhc<cva> PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 3;
    private ss9<String, String> labels_ = ss9.emptyMapField();
    private String type_ = "";

    /* JADX INFO: renamed from: cva$a */
    public static /* synthetic */ class C4527a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f27829a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f27829a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f27829a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f27829a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f27829a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f27829a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f27829a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f27829a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: cva$b */
    public static final class C4528b extends v27.AbstractC13823b<cva, C4528b> implements fva {
        public /* synthetic */ C4528b(C4527a c4527a) {
            this();
        }

        public C4528b clearLabels() {
            m23743e();
            ((cva) this.f89756b).getMutableLabelsMap().clear();
            return this;
        }

        public C4528b clearType() {
            m23743e();
            ((cva) this.f89756b).clearType();
            return this;
        }

        @Override // p000.fva
        public boolean containsLabels(String str) {
            str.getClass();
            return ((cva) this.f89756b).getLabelsMap().containsKey(str);
        }

        @Override // p000.fva
        @Deprecated
        public Map<String, String> getLabels() {
            return getLabelsMap();
        }

        @Override // p000.fva
        public int getLabelsCount() {
            return ((cva) this.f89756b).getLabelsMap().size();
        }

        @Override // p000.fva
        public Map<String, String> getLabelsMap() {
            return Collections.unmodifiableMap(((cva) this.f89756b).getLabelsMap());
        }

        @Override // p000.fva
        public String getLabelsOrDefault(String str, String str2) {
            str.getClass();
            Map<String, String> labelsMap = ((cva) this.f89756b).getLabelsMap();
            return labelsMap.containsKey(str) ? labelsMap.get(str) : str2;
        }

        @Override // p000.fva
        public String getLabelsOrThrow(String str) {
            str.getClass();
            Map<String, String> labelsMap = ((cva) this.f89756b).getLabelsMap();
            if (labelsMap.containsKey(str)) {
                return labelsMap.get(str);
            }
            throw new IllegalArgumentException();
        }

        @Override // p000.fva
        public String getType() {
            return ((cva) this.f89756b).getType();
        }

        @Override // p000.fva
        public vj1 getTypeBytes() {
            return ((cva) this.f89756b).getTypeBytes();
        }

        public C4528b putAllLabels(Map<String, String> map) {
            m23743e();
            ((cva) this.f89756b).getMutableLabelsMap().putAll(map);
            return this;
        }

        public C4528b putLabels(String str, String str2) {
            str.getClass();
            str2.getClass();
            m23743e();
            ((cva) this.f89756b).getMutableLabelsMap().put(str, str2);
            return this;
        }

        public C4528b removeLabels(String str) {
            str.getClass();
            m23743e();
            ((cva) this.f89756b).getMutableLabelsMap().remove(str);
            return this;
        }

        public C4528b setType(String str) {
            m23743e();
            ((cva) this.f89756b).setType(str);
            return this;
        }

        public C4528b setTypeBytes(vj1 vj1Var) {
            m23743e();
            ((cva) this.f89756b).setTypeBytes(vj1Var);
            return this;
        }

        private C4528b() {
            super(cva.DEFAULT_INSTANCE);
        }
    }

    /* JADX INFO: renamed from: cva$c */
    public static final class C4529c {

        /* JADX INFO: renamed from: a */
        public static final os9<String, String> f27830a;

        static {
            hpi.EnumC6968b enumC6968b = hpi.EnumC6968b.f44485L;
            f27830a = os9.newDefaultInstance(enumC6968b, "", enumC6968b, "");
        }

        private C4529c() {
        }
    }

    static {
        cva cvaVar = new cva();
        DEFAULT_INSTANCE = cvaVar;
        v27.m23715h0(cva.class, cvaVar);
    }

    private cva() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = getDefaultInstance().getType();
    }

    public static cva getDefaultInstance() {
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

    public static C4528b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    public static cva parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (cva) v27.m23700S(DEFAULT_INSTANCE, inputStream);
    }

    public static cva parseFrom(ByteBuffer byteBuffer) throws ce8 {
        return (cva) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static uhc<cva> parser() {
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

    @Override // p000.fva
    public boolean containsLabels(String str) {
        str.getClass();
        return internalGetLabels().containsKey(str);
    }

    @Override // p000.fva
    @Deprecated
    public Map<String, String> getLabels() {
        return getLabelsMap();
    }

    @Override // p000.fva
    public int getLabelsCount() {
        return internalGetLabels().size();
    }

    @Override // p000.fva
    public Map<String, String> getLabelsMap() {
        return Collections.unmodifiableMap(internalGetLabels());
    }

    @Override // p000.fva
    public String getLabelsOrDefault(String str, String str2) {
        str.getClass();
        ss9<String, String> ss9VarInternalGetLabels = internalGetLabels();
        return ss9VarInternalGetLabels.containsKey(str) ? ss9VarInternalGetLabels.get(str) : str2;
    }

    @Override // p000.fva
    public String getLabelsOrThrow(String str) {
        str.getClass();
        ss9<String, String> ss9VarInternalGetLabels = internalGetLabels();
        if (ss9VarInternalGetLabels.containsKey(str)) {
            return ss9VarInternalGetLabels.get(str);
        }
        throw new IllegalArgumentException();
    }

    @Override // p000.fva
    public String getType() {
        return this.type_;
    }

    @Override // p000.fva
    public vj1 getTypeBytes() {
        return vj1.copyFromUtf8(this.type_);
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
        C4527a c4527a = null;
        switch (C4527a.f27829a[enumC13830i.ordinal()]) {
            case 1:
                return new cva();
            case 2:
                return new C4528b(c4527a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0001\u0000\u0000\u00022\u0003Ȉ", new Object[]{"labels_", C4529c.f27830a, "type_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<cva> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (cva.class) {
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

    public static C4528b newBuilder(cva cvaVar) {
        return DEFAULT_INSTANCE.m23739o(cvaVar);
    }

    public static cva parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (cva) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static cva parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
        return (cva) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
    }

    public static cva parseFrom(vj1 vj1Var) throws ce8 {
        return (cva) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
    }

    public static cva parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
        return (cva) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
    }

    public static cva parseFrom(byte[] bArr) throws ce8 {
        return (cva) v27.m23710c0(DEFAULT_INSTANCE, bArr);
    }

    public static cva parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
        return (cva) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
    }

    public static cva parseFrom(InputStream inputStream) throws IOException {
        return (cva) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
    }

    public static cva parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (cva) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static cva parseFrom(f72 f72Var) throws IOException {
        return (cva) v27.m23704W(DEFAULT_INSTANCE, f72Var);
    }

    public static cva parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
        return (cva) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
    }
}
