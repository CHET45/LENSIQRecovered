package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p000.v27;

/* JADX INFO: loaded from: classes5.dex */
public final class e6c extends v27<e6c, C5139b> implements f6c {
    private static final e6c DEFAULT_INSTANCE;
    public static final int METADATA_TYPE_FIELD_NUMBER = 2;
    private static volatile uhc<e6c> PARSER = null;
    public static final int RESPONSE_TYPE_FIELD_NUMBER = 1;
    private String responseType_ = "";
    private String metadataType_ = "";

    /* JADX INFO: renamed from: e6c$a */
    public static /* synthetic */ class C5138a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f31907a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f31907a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31907a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f31907a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f31907a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f31907a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f31907a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f31907a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: e6c$b */
    public static final class C5139b extends v27.AbstractC13823b<e6c, C5139b> implements f6c {
        public /* synthetic */ C5139b(C5138a c5138a) {
            this();
        }

        public C5139b clearMetadataType() {
            m23743e();
            ((e6c) this.f89756b).clearMetadataType();
            return this;
        }

        public C5139b clearResponseType() {
            m23743e();
            ((e6c) this.f89756b).clearResponseType();
            return this;
        }

        @Override // p000.f6c
        public String getMetadataType() {
            return ((e6c) this.f89756b).getMetadataType();
        }

        @Override // p000.f6c
        public vj1 getMetadataTypeBytes() {
            return ((e6c) this.f89756b).getMetadataTypeBytes();
        }

        @Override // p000.f6c
        public String getResponseType() {
            return ((e6c) this.f89756b).getResponseType();
        }

        @Override // p000.f6c
        public vj1 getResponseTypeBytes() {
            return ((e6c) this.f89756b).getResponseTypeBytes();
        }

        public C5139b setMetadataType(String str) {
            m23743e();
            ((e6c) this.f89756b).setMetadataType(str);
            return this;
        }

        public C5139b setMetadataTypeBytes(vj1 vj1Var) {
            m23743e();
            ((e6c) this.f89756b).setMetadataTypeBytes(vj1Var);
            return this;
        }

        public C5139b setResponseType(String str) {
            m23743e();
            ((e6c) this.f89756b).setResponseType(str);
            return this;
        }

        public C5139b setResponseTypeBytes(vj1 vj1Var) {
            m23743e();
            ((e6c) this.f89756b).setResponseTypeBytes(vj1Var);
            return this;
        }

        private C5139b() {
            super(e6c.DEFAULT_INSTANCE);
        }
    }

    static {
        e6c e6cVar = new e6c();
        DEFAULT_INSTANCE = e6cVar;
        v27.m23715h0(e6c.class, e6cVar);
    }

    private e6c() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMetadataType() {
        this.metadataType_ = getDefaultInstance().getMetadataType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResponseType() {
        this.responseType_ = getDefaultInstance().getResponseType();
    }

    public static e6c getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C5139b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    public static e6c parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (e6c) v27.m23700S(DEFAULT_INSTANCE, inputStream);
    }

    public static e6c parseFrom(ByteBuffer byteBuffer) throws ce8 {
        return (e6c) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static uhc<e6c> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMetadataType(String str) {
        str.getClass();
        this.metadataType_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMetadataTypeBytes(vj1 vj1Var) {
        AbstractC1714b3.m2857c(vj1Var);
        this.metadataType_ = vj1Var.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResponseType(String str) {
        str.getClass();
        this.responseType_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResponseTypeBytes(vj1 vj1Var) {
        AbstractC1714b3.m2857c(vj1Var);
        this.responseType_ = vj1Var.toStringUtf8();
    }

    @Override // p000.f6c
    public String getMetadataType() {
        return this.metadataType_;
    }

    @Override // p000.f6c
    public vj1 getMetadataTypeBytes() {
        return vj1.copyFromUtf8(this.metadataType_);
    }

    @Override // p000.f6c
    public String getResponseType() {
        return this.responseType_;
    }

    @Override // p000.f6c
    public vj1 getResponseTypeBytes() {
        return vj1.copyFromUtf8(this.responseType_);
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
        C5138a c5138a = null;
        switch (C5138a.f31907a[enumC13830i.ordinal()]) {
            case 1:
                return new e6c();
            case 2:
                return new C5139b(c5138a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"responseType_", "metadataType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<e6c> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (e6c.class) {
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

    public static C5139b newBuilder(e6c e6cVar) {
        return DEFAULT_INSTANCE.m23739o(e6cVar);
    }

    public static e6c parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (e6c) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static e6c parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
        return (e6c) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
    }

    public static e6c parseFrom(vj1 vj1Var) throws ce8 {
        return (e6c) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
    }

    public static e6c parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
        return (e6c) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
    }

    public static e6c parseFrom(byte[] bArr) throws ce8 {
        return (e6c) v27.m23710c0(DEFAULT_INSTANCE, bArr);
    }

    public static e6c parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
        return (e6c) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
    }

    public static e6c parseFrom(InputStream inputStream) throws IOException {
        return (e6c) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
    }

    public static e6c parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (e6c) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static e6c parseFrom(f72 f72Var) throws IOException {
        return (e6c) v27.m23704W(DEFAULT_INSTANCE, f72Var);
    }

    public static e6c parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
        return (e6c) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
    }
}
