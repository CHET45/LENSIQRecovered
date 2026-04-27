package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p000.f2h;
import p000.v27;

/* JADX INFO: loaded from: classes5.dex */
public final class nth extends v27<nth, C10059b> implements oth {
    private static final nth DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile uhc<nth> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 2;
    private int bitField0_;
    private String name_ = "";
    private f2h version_;

    /* JADX INFO: renamed from: nth$a */
    public static /* synthetic */ class C10058a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f65671a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f65671a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f65671a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f65671a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f65671a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f65671a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f65671a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f65671a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: nth$b */
    public static final class C10059b extends v27.AbstractC13823b<nth, C10059b> implements oth {
        public /* synthetic */ C10059b(C10058a c10058a) {
            this();
        }

        public C10059b clearName() {
            m23743e();
            ((nth) this.f89756b).clearName();
            return this;
        }

        public C10059b clearVersion() {
            m23743e();
            ((nth) this.f89756b).clearVersion();
            return this;
        }

        @Override // p000.oth
        public String getName() {
            return ((nth) this.f89756b).getName();
        }

        @Override // p000.oth
        public vj1 getNameBytes() {
            return ((nth) this.f89756b).getNameBytes();
        }

        @Override // p000.oth
        public f2h getVersion() {
            return ((nth) this.f89756b).getVersion();
        }

        @Override // p000.oth
        public boolean hasVersion() {
            return ((nth) this.f89756b).hasVersion();
        }

        public C10059b mergeVersion(f2h f2hVar) {
            m23743e();
            ((nth) this.f89756b).mergeVersion(f2hVar);
            return this;
        }

        public C10059b setName(String str) {
            m23743e();
            ((nth) this.f89756b).setName(str);
            return this;
        }

        public C10059b setNameBytes(vj1 vj1Var) {
            m23743e();
            ((nth) this.f89756b).setNameBytes(vj1Var);
            return this;
        }

        public C10059b setVersion(f2h f2hVar) {
            m23743e();
            ((nth) this.f89756b).setVersion(f2hVar);
            return this;
        }

        private C10059b() {
            super(nth.DEFAULT_INSTANCE);
        }

        public C10059b setVersion(f2h.C5567b c5567b) {
            m23743e();
            ((nth) this.f89756b).setVersion(c5567b.build());
            return this;
        }
    }

    static {
        nth nthVar = new nth();
        DEFAULT_INSTANCE = nthVar;
        v27.m23715h0(nth.class, nthVar);
    }

    private nth() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVersion() {
        this.version_ = null;
        this.bitField0_ &= -2;
    }

    public static nth getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeVersion(f2h f2hVar) {
        f2hVar.getClass();
        f2h f2hVar2 = this.version_;
        if (f2hVar2 == null || f2hVar2 == f2h.getDefaultInstance()) {
            this.version_ = f2hVar;
        } else {
            this.version_ = f2h.newBuilder(this.version_).mergeFrom(f2hVar).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static C10059b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    public static nth parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (nth) v27.m23700S(DEFAULT_INSTANCE, inputStream);
    }

    public static nth parseFrom(ByteBuffer byteBuffer) throws ce8 {
        return (nth) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static uhc<nth> parser() {
        return DEFAULT_INSTANCE.getParserForType();
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
    public void setVersion(f2h f2hVar) {
        f2hVar.getClass();
        this.version_ = f2hVar;
        this.bitField0_ |= 1;
    }

    @Override // p000.oth
    public String getName() {
        return this.name_;
    }

    @Override // p000.oth
    public vj1 getNameBytes() {
        return vj1.copyFromUtf8(this.name_);
    }

    @Override // p000.oth
    public f2h getVersion() {
        f2h f2hVar = this.version_;
        return f2hVar == null ? f2h.getDefaultInstance() : f2hVar;
    }

    @Override // p000.oth
    public boolean hasVersion() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
        C10058a c10058a = null;
        switch (C10058a.f65671a[enumC13830i.ordinal()]) {
            case 1:
                return new nth();
            case 2:
                return new C10059b(c10058a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"bitField0_", "name_", "version_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<nth> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (nth.class) {
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

    public static C10059b newBuilder(nth nthVar) {
        return DEFAULT_INSTANCE.m23739o(nthVar);
    }

    public static nth parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (nth) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static nth parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
        return (nth) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
    }

    public static nth parseFrom(vj1 vj1Var) throws ce8 {
        return (nth) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
    }

    public static nth parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
        return (nth) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
    }

    public static nth parseFrom(byte[] bArr) throws ce8 {
        return (nth) v27.m23710c0(DEFAULT_INSTANCE, bArr);
    }

    public static nth parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
        return (nth) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
    }

    public static nth parseFrom(InputStream inputStream) throws IOException {
        return (nth) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
    }

    public static nth parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (nth) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static nth parseFrom(f72 f72Var) throws IOException {
        return (nth) v27.m23704W(DEFAULT_INSTANCE, f72Var);
    }

    public static nth parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
        return (nth) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
    }
}
