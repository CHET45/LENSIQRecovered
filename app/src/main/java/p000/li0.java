package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p000.v27;

/* JADX INFO: loaded from: classes5.dex */
public final class li0 extends v27<li0, C8822b> implements mi0 {
    private static final li0 DEFAULT_INSTANCE;
    public static final int GRANTED_FIELD_NUMBER = 3;
    private static volatile uhc<li0> PARSER = null;
    public static final int PERMISSION_FIELD_NUMBER = 2;
    public static final int RESOURCE_FIELD_NUMBER = 1;
    private boolean granted_;
    private String resource_ = "";
    private String permission_ = "";

    /* JADX INFO: renamed from: li0$a */
    public static /* synthetic */ class C8821a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f57655a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f57655a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f57655a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f57655a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f57655a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f57655a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f57655a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f57655a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: li0$b */
    public static final class C8822b extends v27.AbstractC13823b<li0, C8822b> implements mi0 {
        public /* synthetic */ C8822b(C8821a c8821a) {
            this();
        }

        public C8822b clearGranted() {
            m23743e();
            ((li0) this.f89756b).clearGranted();
            return this;
        }

        public C8822b clearPermission() {
            m23743e();
            ((li0) this.f89756b).clearPermission();
            return this;
        }

        public C8822b clearResource() {
            m23743e();
            ((li0) this.f89756b).clearResource();
            return this;
        }

        @Override // p000.mi0
        public boolean getGranted() {
            return ((li0) this.f89756b).getGranted();
        }

        @Override // p000.mi0
        public String getPermission() {
            return ((li0) this.f89756b).getPermission();
        }

        @Override // p000.mi0
        public vj1 getPermissionBytes() {
            return ((li0) this.f89756b).getPermissionBytes();
        }

        @Override // p000.mi0
        public String getResource() {
            return ((li0) this.f89756b).getResource();
        }

        @Override // p000.mi0
        public vj1 getResourceBytes() {
            return ((li0) this.f89756b).getResourceBytes();
        }

        public C8822b setGranted(boolean z) {
            m23743e();
            ((li0) this.f89756b).setGranted(z);
            return this;
        }

        public C8822b setPermission(String str) {
            m23743e();
            ((li0) this.f89756b).setPermission(str);
            return this;
        }

        public C8822b setPermissionBytes(vj1 vj1Var) {
            m23743e();
            ((li0) this.f89756b).setPermissionBytes(vj1Var);
            return this;
        }

        public C8822b setResource(String str) {
            m23743e();
            ((li0) this.f89756b).setResource(str);
            return this;
        }

        public C8822b setResourceBytes(vj1 vj1Var) {
            m23743e();
            ((li0) this.f89756b).setResourceBytes(vj1Var);
            return this;
        }

        private C8822b() {
            super(li0.DEFAULT_INSTANCE);
        }
    }

    static {
        li0 li0Var = new li0();
        DEFAULT_INSTANCE = li0Var;
        v27.m23715h0(li0.class, li0Var);
    }

    private li0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGranted() {
        this.granted_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPermission() {
        this.permission_ = getDefaultInstance().getPermission();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResource() {
        this.resource_ = getDefaultInstance().getResource();
    }

    public static li0 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C8822b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    public static li0 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (li0) v27.m23700S(DEFAULT_INSTANCE, inputStream);
    }

    public static li0 parseFrom(ByteBuffer byteBuffer) throws ce8 {
        return (li0) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static uhc<li0> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGranted(boolean z) {
        this.granted_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPermission(String str) {
        str.getClass();
        this.permission_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPermissionBytes(vj1 vj1Var) {
        AbstractC1714b3.m2857c(vj1Var);
        this.permission_ = vj1Var.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResource(String str) {
        str.getClass();
        this.resource_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResourceBytes(vj1 vj1Var) {
        AbstractC1714b3.m2857c(vj1Var);
        this.resource_ = vj1Var.toStringUtf8();
    }

    @Override // p000.mi0
    public boolean getGranted() {
        return this.granted_;
    }

    @Override // p000.mi0
    public String getPermission() {
        return this.permission_;
    }

    @Override // p000.mi0
    public vj1 getPermissionBytes() {
        return vj1.copyFromUtf8(this.permission_);
    }

    @Override // p000.mi0
    public String getResource() {
        return this.resource_;
    }

    @Override // p000.mi0
    public vj1 getResourceBytes() {
        return vj1.copyFromUtf8(this.resource_);
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
        C8821a c8821a = null;
        switch (C8821a.f57655a[enumC13830i.ordinal()]) {
            case 1:
                return new li0();
            case 2:
                return new C8822b(c8821a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0007", new Object[]{"resource_", "permission_", "granted_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<li0> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (li0.class) {
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

    public static C8822b newBuilder(li0 li0Var) {
        return DEFAULT_INSTANCE.m23739o(li0Var);
    }

    public static li0 parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (li0) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static li0 parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
        return (li0) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
    }

    public static li0 parseFrom(vj1 vj1Var) throws ce8 {
        return (li0) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
    }

    public static li0 parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
        return (li0) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
    }

    public static li0 parseFrom(byte[] bArr) throws ce8 {
        return (li0) v27.m23710c0(DEFAULT_INSTANCE, bArr);
    }

    public static li0 parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
        return (li0) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
    }

    public static li0 parseFrom(InputStream inputStream) throws IOException {
        return (li0) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
    }

    public static li0 parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (li0) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static li0 parseFrom(f72 f72Var) throws IOException {
        return (li0) v27.m23704W(DEFAULT_INSTANCE, f72Var);
    }

    public static li0 parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
        return (li0) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
    }
}
