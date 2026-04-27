package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p000.m7d;
import p000.v27;

/* JADX INFO: loaded from: classes5.dex */
public final class a54 extends v27<a54, C0060b> implements b54 {
    public static final int CURRENT_DOCUMENT_FIELD_NUMBER = 2;
    private static final a54 DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile uhc<a54> PARSER;
    private int bitField0_;
    private m7d currentDocument_;
    private String name_ = "";

    /* JADX INFO: renamed from: a54$a */
    public static /* synthetic */ class C0059a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f421a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f421a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f421a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f421a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f421a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f421a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f421a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f421a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: a54$b */
    public static final class C0060b extends v27.AbstractC13823b<a54, C0060b> implements b54 {
        public /* synthetic */ C0060b(C0059a c0059a) {
            this();
        }

        public C0060b clearCurrentDocument() {
            m23743e();
            ((a54) this.f89756b).clearCurrentDocument();
            return this;
        }

        public C0060b clearName() {
            m23743e();
            ((a54) this.f89756b).clearName();
            return this;
        }

        @Override // p000.b54
        public m7d getCurrentDocument() {
            return ((a54) this.f89756b).getCurrentDocument();
        }

        @Override // p000.b54
        public String getName() {
            return ((a54) this.f89756b).getName();
        }

        @Override // p000.b54
        public vj1 getNameBytes() {
            return ((a54) this.f89756b).getNameBytes();
        }

        @Override // p000.b54
        public boolean hasCurrentDocument() {
            return ((a54) this.f89756b).hasCurrentDocument();
        }

        public C0060b mergeCurrentDocument(m7d m7dVar) {
            m23743e();
            ((a54) this.f89756b).mergeCurrentDocument(m7dVar);
            return this;
        }

        public C0060b setCurrentDocument(m7d m7dVar) {
            m23743e();
            ((a54) this.f89756b).setCurrentDocument(m7dVar);
            return this;
        }

        public C0060b setName(String str) {
            m23743e();
            ((a54) this.f89756b).setName(str);
            return this;
        }

        public C0060b setNameBytes(vj1 vj1Var) {
            m23743e();
            ((a54) this.f89756b).setNameBytes(vj1Var);
            return this;
        }

        private C0060b() {
            super(a54.DEFAULT_INSTANCE);
        }

        public C0060b setCurrentDocument(m7d.C9214b c9214b) {
            m23743e();
            ((a54) this.f89756b).setCurrentDocument(c9214b.build());
            return this;
        }
    }

    static {
        a54 a54Var = new a54();
        DEFAULT_INSTANCE = a54Var;
        v27.m23715h0(a54.class, a54Var);
    }

    private a54() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCurrentDocument() {
        this.currentDocument_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    public static a54 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCurrentDocument(m7d m7dVar) {
        m7dVar.getClass();
        m7d m7dVar2 = this.currentDocument_;
        if (m7dVar2 == null || m7dVar2 == m7d.getDefaultInstance()) {
            this.currentDocument_ = m7dVar;
        } else {
            this.currentDocument_ = m7d.newBuilder(this.currentDocument_).mergeFrom(m7dVar).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static C0060b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    public static a54 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (a54) v27.m23700S(DEFAULT_INSTANCE, inputStream);
    }

    public static a54 parseFrom(ByteBuffer byteBuffer) throws ce8 {
        return (a54) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static uhc<a54> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurrentDocument(m7d m7dVar) {
        m7dVar.getClass();
        this.currentDocument_ = m7dVar;
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

    @Override // p000.b54
    public m7d getCurrentDocument() {
        m7d m7dVar = this.currentDocument_;
        return m7dVar == null ? m7d.getDefaultInstance() : m7dVar;
    }

    @Override // p000.b54
    public String getName() {
        return this.name_;
    }

    @Override // p000.b54
    public vj1 getNameBytes() {
        return vj1.copyFromUtf8(this.name_);
    }

    @Override // p000.b54
    public boolean hasCurrentDocument() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
        C0059a c0059a = null;
        switch (C0059a.f421a[enumC13830i.ordinal()]) {
            case 1:
                return new a54();
            case 2:
                return new C0060b(c0059a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"bitField0_", "name_", "currentDocument_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<a54> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (a54.class) {
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

    public static C0060b newBuilder(a54 a54Var) {
        return DEFAULT_INSTANCE.m23739o(a54Var);
    }

    public static a54 parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (a54) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static a54 parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
        return (a54) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
    }

    public static a54 parseFrom(vj1 vj1Var) throws ce8 {
        return (a54) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
    }

    public static a54 parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
        return (a54) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
    }

    public static a54 parseFrom(byte[] bArr) throws ce8 {
        return (a54) v27.m23710c0(DEFAULT_INSTANCE, bArr);
    }

    public static a54 parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
        return (a54) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
    }

    public static a54 parseFrom(InputStream inputStream) throws IOException {
        return (a54) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
    }

    public static a54 parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (a54) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static a54 parseFrom(f72 f72Var) throws IOException {
        return (a54) v27.m23704W(DEFAULT_INSTANCE, f72Var);
    }

    public static a54 parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
        return (a54) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
    }
}
