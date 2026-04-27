package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;
import p000.hpi;
import p000.v27;

/* JADX INFO: loaded from: classes4.dex */
public final class a55 extends v27<a55, C0062b> implements b55 {
    private static final a55 DEFAULT_INSTANCE;
    public static final int DOMAIN_FIELD_NUMBER = 2;
    public static final int METADATA_FIELD_NUMBER = 3;
    private static volatile uhc<a55> PARSER = null;
    public static final int REASON_FIELD_NUMBER = 1;
    private ss9<String, String> metadata_ = ss9.emptyMapField();
    private String reason_ = "";
    private String domain_ = "";

    /* JADX INFO: renamed from: a55$a */
    public static /* synthetic */ class C0061a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f422a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f422a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f422a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f422a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f422a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f422a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f422a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f422a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: a55$b */
    public static final class C0062b extends v27.AbstractC13823b<a55, C0062b> implements b55 {
        public /* synthetic */ C0062b(C0061a c0061a) {
            this();
        }

        public C0062b clearDomain() {
            m23743e();
            ((a55) this.f89756b).clearDomain();
            return this;
        }

        public C0062b clearMetadata() {
            m23743e();
            ((a55) this.f89756b).getMutableMetadataMap().clear();
            return this;
        }

        public C0062b clearReason() {
            m23743e();
            ((a55) this.f89756b).clearReason();
            return this;
        }

        @Override // p000.b55
        public boolean containsMetadata(String str) {
            str.getClass();
            return ((a55) this.f89756b).getMetadataMap().containsKey(str);
        }

        @Override // p000.b55
        public String getDomain() {
            return ((a55) this.f89756b).getDomain();
        }

        @Override // p000.b55
        public vj1 getDomainBytes() {
            return ((a55) this.f89756b).getDomainBytes();
        }

        @Override // p000.b55
        @Deprecated
        public Map<String, String> getMetadata() {
            return getMetadataMap();
        }

        @Override // p000.b55
        public int getMetadataCount() {
            return ((a55) this.f89756b).getMetadataMap().size();
        }

        @Override // p000.b55
        public Map<String, String> getMetadataMap() {
            return Collections.unmodifiableMap(((a55) this.f89756b).getMetadataMap());
        }

        @Override // p000.b55
        public String getMetadataOrDefault(String str, String str2) {
            str.getClass();
            Map<String, String> metadataMap = ((a55) this.f89756b).getMetadataMap();
            return metadataMap.containsKey(str) ? metadataMap.get(str) : str2;
        }

        @Override // p000.b55
        public String getMetadataOrThrow(String str) {
            str.getClass();
            Map<String, String> metadataMap = ((a55) this.f89756b).getMetadataMap();
            if (metadataMap.containsKey(str)) {
                return metadataMap.get(str);
            }
            throw new IllegalArgumentException();
        }

        @Override // p000.b55
        public String getReason() {
            return ((a55) this.f89756b).getReason();
        }

        @Override // p000.b55
        public vj1 getReasonBytes() {
            return ((a55) this.f89756b).getReasonBytes();
        }

        public C0062b putAllMetadata(Map<String, String> map) {
            m23743e();
            ((a55) this.f89756b).getMutableMetadataMap().putAll(map);
            return this;
        }

        public C0062b putMetadata(String str, String str2) {
            str.getClass();
            str2.getClass();
            m23743e();
            ((a55) this.f89756b).getMutableMetadataMap().put(str, str2);
            return this;
        }

        public C0062b removeMetadata(String str) {
            str.getClass();
            m23743e();
            ((a55) this.f89756b).getMutableMetadataMap().remove(str);
            return this;
        }

        public C0062b setDomain(String str) {
            m23743e();
            ((a55) this.f89756b).setDomain(str);
            return this;
        }

        public C0062b setDomainBytes(vj1 vj1Var) {
            m23743e();
            ((a55) this.f89756b).setDomainBytes(vj1Var);
            return this;
        }

        public C0062b setReason(String str) {
            m23743e();
            ((a55) this.f89756b).setReason(str);
            return this;
        }

        public C0062b setReasonBytes(vj1 vj1Var) {
            m23743e();
            ((a55) this.f89756b).setReasonBytes(vj1Var);
            return this;
        }

        private C0062b() {
            super(a55.DEFAULT_INSTANCE);
        }
    }

    /* JADX INFO: renamed from: a55$c */
    public static final class C0063c {

        /* JADX INFO: renamed from: a */
        public static final os9<String, String> f423a;

        static {
            hpi.EnumC6968b enumC6968b = hpi.EnumC6968b.f44485L;
            f423a = os9.newDefaultInstance(enumC6968b, "", enumC6968b, "");
        }

        private C0063c() {
        }
    }

    static {
        a55 a55Var = new a55();
        DEFAULT_INSTANCE = a55Var;
        v27.m23715h0(a55.class, a55Var);
    }

    private a55() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDomain() {
        this.domain_ = getDefaultInstance().getDomain();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReason() {
        this.reason_ = getDefaultInstance().getReason();
    }

    public static a55 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> getMutableMetadataMap() {
        return internalGetMutableMetadata();
    }

    private ss9<String, String> internalGetMetadata() {
        return this.metadata_;
    }

    private ss9<String, String> internalGetMutableMetadata() {
        if (!this.metadata_.isMutable()) {
            this.metadata_ = this.metadata_.mutableCopy();
        }
        return this.metadata_;
    }

    public static C0062b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    public static a55 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (a55) v27.m23700S(DEFAULT_INSTANCE, inputStream);
    }

    public static a55 parseFrom(ByteBuffer byteBuffer) throws ce8 {
        return (a55) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static uhc<a55> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDomain(String str) {
        str.getClass();
        this.domain_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDomainBytes(vj1 vj1Var) {
        AbstractC1714b3.m2857c(vj1Var);
        this.domain_ = vj1Var.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReason(String str) {
        str.getClass();
        this.reason_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReasonBytes(vj1 vj1Var) {
        AbstractC1714b3.m2857c(vj1Var);
        this.reason_ = vj1Var.toStringUtf8();
    }

    @Override // p000.b55
    public boolean containsMetadata(String str) {
        str.getClass();
        return internalGetMetadata().containsKey(str);
    }

    @Override // p000.b55
    public String getDomain() {
        return this.domain_;
    }

    @Override // p000.b55
    public vj1 getDomainBytes() {
        return vj1.copyFromUtf8(this.domain_);
    }

    @Override // p000.b55
    @Deprecated
    public Map<String, String> getMetadata() {
        return getMetadataMap();
    }

    @Override // p000.b55
    public int getMetadataCount() {
        return internalGetMetadata().size();
    }

    @Override // p000.b55
    public Map<String, String> getMetadataMap() {
        return Collections.unmodifiableMap(internalGetMetadata());
    }

    @Override // p000.b55
    public String getMetadataOrDefault(String str, String str2) {
        str.getClass();
        ss9<String, String> ss9VarInternalGetMetadata = internalGetMetadata();
        return ss9VarInternalGetMetadata.containsKey(str) ? ss9VarInternalGetMetadata.get(str) : str2;
    }

    @Override // p000.b55
    public String getMetadataOrThrow(String str) {
        str.getClass();
        ss9<String, String> ss9VarInternalGetMetadata = internalGetMetadata();
        if (ss9VarInternalGetMetadata.containsKey(str)) {
            return ss9VarInternalGetMetadata.get(str);
        }
        throw new IllegalArgumentException();
    }

    @Override // p000.b55
    public String getReason() {
        return this.reason_;
    }

    @Override // p000.b55
    public vj1 getReasonBytes() {
        return vj1.copyFromUtf8(this.reason_);
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
        C0061a c0061a = null;
        switch (C0061a.f422a[enumC13830i.ordinal()]) {
            case 1:
                return new a55();
            case 2:
                return new C0062b(c0061a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0001Ȉ\u0002Ȉ\u00032", new Object[]{"reason_", "domain_", "metadata_", C0063c.f423a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<a55> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (a55.class) {
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

    public static C0062b newBuilder(a55 a55Var) {
        return DEFAULT_INSTANCE.m23739o(a55Var);
    }

    public static a55 parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (a55) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static a55 parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
        return (a55) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
    }

    public static a55 parseFrom(vj1 vj1Var) throws ce8 {
        return (a55) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
    }

    public static a55 parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
        return (a55) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
    }

    public static a55 parseFrom(byte[] bArr) throws ce8 {
        return (a55) v27.m23710c0(DEFAULT_INSTANCE, bArr);
    }

    public static a55 parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
        return (a55) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
    }

    public static a55 parseFrom(InputStream inputStream) throws IOException {
        return (a55) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
    }

    public static a55 parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (a55) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static a55 parseFrom(f72 f72Var) throws IOException {
        return (a55) v27.m23704W(DEFAULT_INSTANCE, f72Var);
    }

    public static a55 parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
        return (a55) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
    }
}
