package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p000.v27;
import p000.w98;

/* JADX INFO: loaded from: classes5.dex */
public final class yn0 extends v27<yn0, C15734c> implements zn0 {
    public static final int ADDRESS_FIELD_NUMBER = 2;
    public static final int DEADLINE_FIELD_NUMBER = 3;
    private static final yn0 DEFAULT_INSTANCE;
    public static final int DISABLE_AUTH_FIELD_NUMBER = 8;
    public static final int JWT_AUDIENCE_FIELD_NUMBER = 7;
    public static final int MIN_DEADLINE_FIELD_NUMBER = 4;
    public static final int OPERATION_DEADLINE_FIELD_NUMBER = 5;
    private static volatile uhc<yn0> PARSER = null;
    public static final int PATH_TRANSLATION_FIELD_NUMBER = 6;
    public static final int PROTOCOL_FIELD_NUMBER = 9;
    public static final int SELECTOR_FIELD_NUMBER = 1;
    private Object authentication_;
    private double deadline_;
    private double minDeadline_;
    private double operationDeadline_;
    private int pathTranslation_;
    private int authenticationCase_ = 0;
    private String selector_ = "";
    private String address_ = "";
    private String protocol_ = "";

    /* JADX INFO: renamed from: yn0$a */
    public static /* synthetic */ class C15732a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f102309a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f102309a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f102309a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f102309a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f102309a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f102309a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f102309a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f102309a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: yn0$b */
    public enum EnumC15733b {
        JWT_AUDIENCE(7),
        DISABLE_AUTH(8),
        AUTHENTICATION_NOT_SET(0);


        /* JADX INFO: renamed from: a */
        public final int f102314a;

        EnumC15733b(int i) {
            this.f102314a = i;
        }

        public static EnumC15733b forNumber(int i) {
            if (i == 0) {
                return AUTHENTICATION_NOT_SET;
            }
            if (i == 7) {
                return JWT_AUDIENCE;
            }
            if (i != 8) {
                return null;
            }
            return DISABLE_AUTH;
        }

        public int getNumber() {
            return this.f102314a;
        }

        @Deprecated
        public static EnumC15733b valueOf(int i) {
            return forNumber(i);
        }
    }

    /* JADX INFO: renamed from: yn0$c */
    public static final class C15734c extends v27.AbstractC13823b<yn0, C15734c> implements zn0 {
        public /* synthetic */ C15734c(C15732a c15732a) {
            this();
        }

        public C15734c clearAddress() {
            m23743e();
            ((yn0) this.f89756b).clearAddress();
            return this;
        }

        public C15734c clearAuthentication() {
            m23743e();
            ((yn0) this.f89756b).clearAuthentication();
            return this;
        }

        public C15734c clearDeadline() {
            m23743e();
            ((yn0) this.f89756b).clearDeadline();
            return this;
        }

        public C15734c clearDisableAuth() {
            m23743e();
            ((yn0) this.f89756b).clearDisableAuth();
            return this;
        }

        public C15734c clearJwtAudience() {
            m23743e();
            ((yn0) this.f89756b).clearJwtAudience();
            return this;
        }

        public C15734c clearMinDeadline() {
            m23743e();
            ((yn0) this.f89756b).clearMinDeadline();
            return this;
        }

        public C15734c clearOperationDeadline() {
            m23743e();
            ((yn0) this.f89756b).clearOperationDeadline();
            return this;
        }

        public C15734c clearPathTranslation() {
            m23743e();
            ((yn0) this.f89756b).clearPathTranslation();
            return this;
        }

        public C15734c clearProtocol() {
            m23743e();
            ((yn0) this.f89756b).clearProtocol();
            return this;
        }

        public C15734c clearSelector() {
            m23743e();
            ((yn0) this.f89756b).clearSelector();
            return this;
        }

        @Override // p000.zn0
        public String getAddress() {
            return ((yn0) this.f89756b).getAddress();
        }

        @Override // p000.zn0
        public vj1 getAddressBytes() {
            return ((yn0) this.f89756b).getAddressBytes();
        }

        @Override // p000.zn0
        public EnumC15733b getAuthenticationCase() {
            return ((yn0) this.f89756b).getAuthenticationCase();
        }

        @Override // p000.zn0
        public double getDeadline() {
            return ((yn0) this.f89756b).getDeadline();
        }

        @Override // p000.zn0
        public boolean getDisableAuth() {
            return ((yn0) this.f89756b).getDisableAuth();
        }

        @Override // p000.zn0
        public String getJwtAudience() {
            return ((yn0) this.f89756b).getJwtAudience();
        }

        @Override // p000.zn0
        public vj1 getJwtAudienceBytes() {
            return ((yn0) this.f89756b).getJwtAudienceBytes();
        }

        @Override // p000.zn0
        public double getMinDeadline() {
            return ((yn0) this.f89756b).getMinDeadline();
        }

        @Override // p000.zn0
        public double getOperationDeadline() {
            return ((yn0) this.f89756b).getOperationDeadline();
        }

        @Override // p000.zn0
        public EnumC15735d getPathTranslation() {
            return ((yn0) this.f89756b).getPathTranslation();
        }

        @Override // p000.zn0
        public int getPathTranslationValue() {
            return ((yn0) this.f89756b).getPathTranslationValue();
        }

        @Override // p000.zn0
        public String getProtocol() {
            return ((yn0) this.f89756b).getProtocol();
        }

        @Override // p000.zn0
        public vj1 getProtocolBytes() {
            return ((yn0) this.f89756b).getProtocolBytes();
        }

        @Override // p000.zn0
        public String getSelector() {
            return ((yn0) this.f89756b).getSelector();
        }

        @Override // p000.zn0
        public vj1 getSelectorBytes() {
            return ((yn0) this.f89756b).getSelectorBytes();
        }

        @Override // p000.zn0
        public boolean hasDisableAuth() {
            return ((yn0) this.f89756b).hasDisableAuth();
        }

        @Override // p000.zn0
        public boolean hasJwtAudience() {
            return ((yn0) this.f89756b).hasJwtAudience();
        }

        public C15734c setAddress(String str) {
            m23743e();
            ((yn0) this.f89756b).setAddress(str);
            return this;
        }

        public C15734c setAddressBytes(vj1 vj1Var) {
            m23743e();
            ((yn0) this.f89756b).setAddressBytes(vj1Var);
            return this;
        }

        public C15734c setDeadline(double d) {
            m23743e();
            ((yn0) this.f89756b).setDeadline(d);
            return this;
        }

        public C15734c setDisableAuth(boolean z) {
            m23743e();
            ((yn0) this.f89756b).setDisableAuth(z);
            return this;
        }

        public C15734c setJwtAudience(String str) {
            m23743e();
            ((yn0) this.f89756b).setJwtAudience(str);
            return this;
        }

        public C15734c setJwtAudienceBytes(vj1 vj1Var) {
            m23743e();
            ((yn0) this.f89756b).setJwtAudienceBytes(vj1Var);
            return this;
        }

        public C15734c setMinDeadline(double d) {
            m23743e();
            ((yn0) this.f89756b).setMinDeadline(d);
            return this;
        }

        public C15734c setOperationDeadline(double d) {
            m23743e();
            ((yn0) this.f89756b).setOperationDeadline(d);
            return this;
        }

        public C15734c setPathTranslation(EnumC15735d enumC15735d) {
            m23743e();
            ((yn0) this.f89756b).setPathTranslation(enumC15735d);
            return this;
        }

        public C15734c setPathTranslationValue(int i) {
            m23743e();
            ((yn0) this.f89756b).setPathTranslationValue(i);
            return this;
        }

        public C15734c setProtocol(String str) {
            m23743e();
            ((yn0) this.f89756b).setProtocol(str);
            return this;
        }

        public C15734c setProtocolBytes(vj1 vj1Var) {
            m23743e();
            ((yn0) this.f89756b).setProtocolBytes(vj1Var);
            return this;
        }

        public C15734c setSelector(String str) {
            m23743e();
            ((yn0) this.f89756b).setSelector(str);
            return this;
        }

        public C15734c setSelectorBytes(vj1 vj1Var) {
            m23743e();
            ((yn0) this.f89756b).setSelectorBytes(vj1Var);
            return this;
        }

        private C15734c() {
            super(yn0.DEFAULT_INSTANCE);
        }
    }

    /* JADX INFO: renamed from: yn0$d */
    public enum EnumC15735d implements w98.InterfaceC14497d {
        PATH_TRANSLATION_UNSPECIFIED(0),
        CONSTANT_ADDRESS(1),
        APPEND_PATH_TO_ADDRESS(2),
        UNRECOGNIZED(-1);


        /* JADX INFO: renamed from: C */
        public static final int f102315C = 2;

        /* JADX INFO: renamed from: F */
        public static final w98.InterfaceC14498e<EnumC15735d> f102316F = new a();

        /* JADX INFO: renamed from: f */
        public static final int f102322f = 0;

        /* JADX INFO: renamed from: m */
        public static final int f102323m = 1;

        /* JADX INFO: renamed from: a */
        public final int f102324a;

        /* JADX INFO: renamed from: yn0$d$a */
        public class a implements w98.InterfaceC14498e<EnumC15735d> {
            @Override // p000.w98.InterfaceC14498e
            public EnumC15735d findValueByNumber(int i) {
                return EnumC15735d.forNumber(i);
            }
        }

        /* JADX INFO: renamed from: yn0$d$b */
        public static final class b implements w98.InterfaceC14499f {

            /* JADX INFO: renamed from: a */
            public static final w98.InterfaceC14499f f102325a = new b();

            private b() {
            }

            @Override // p000.w98.InterfaceC14499f
            public boolean isInRange(int i) {
                return EnumC15735d.forNumber(i) != null;
            }
        }

        EnumC15735d(int i) {
            this.f102324a = i;
        }

        public static EnumC15735d forNumber(int i) {
            if (i == 0) {
                return PATH_TRANSLATION_UNSPECIFIED;
            }
            if (i == 1) {
                return CONSTANT_ADDRESS;
            }
            if (i != 2) {
                return null;
            }
            return APPEND_PATH_TO_ADDRESS;
        }

        public static w98.InterfaceC14498e<EnumC15735d> internalGetValueMap() {
            return f102316F;
        }

        public static w98.InterfaceC14499f internalGetVerifier() {
            return b.f102325a;
        }

        @Override // p000.w98.InterfaceC14497d
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.f102324a;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static EnumC15735d valueOf(int i) {
            return forNumber(i);
        }
    }

    static {
        yn0 yn0Var = new yn0();
        DEFAULT_INSTANCE = yn0Var;
        v27.m23715h0(yn0.class, yn0Var);
    }

    private yn0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAddress() {
        this.address_ = getDefaultInstance().getAddress();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAuthentication() {
        this.authenticationCase_ = 0;
        this.authentication_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeadline() {
        this.deadline_ = 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDisableAuth() {
        if (this.authenticationCase_ == 8) {
            this.authenticationCase_ = 0;
            this.authentication_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearJwtAudience() {
        if (this.authenticationCase_ == 7) {
            this.authenticationCase_ = 0;
            this.authentication_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMinDeadline() {
        this.minDeadline_ = 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOperationDeadline() {
        this.operationDeadline_ = 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPathTranslation() {
        this.pathTranslation_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProtocol() {
        this.protocol_ = getDefaultInstance().getProtocol();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSelector() {
        this.selector_ = getDefaultInstance().getSelector();
    }

    public static yn0 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C15734c newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    public static yn0 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (yn0) v27.m23700S(DEFAULT_INSTANCE, inputStream);
    }

    public static yn0 parseFrom(ByteBuffer byteBuffer) throws ce8 {
        return (yn0) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static uhc<yn0> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAddress(String str) {
        str.getClass();
        this.address_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAddressBytes(vj1 vj1Var) {
        AbstractC1714b3.m2857c(vj1Var);
        this.address_ = vj1Var.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeadline(double d) {
        this.deadline_ = d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisableAuth(boolean z) {
        this.authenticationCase_ = 8;
        this.authentication_ = Boolean.valueOf(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJwtAudience(String str) {
        str.getClass();
        this.authenticationCase_ = 7;
        this.authentication_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJwtAudienceBytes(vj1 vj1Var) {
        AbstractC1714b3.m2857c(vj1Var);
        this.authentication_ = vj1Var.toStringUtf8();
        this.authenticationCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMinDeadline(double d) {
        this.minDeadline_ = d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOperationDeadline(double d) {
        this.operationDeadline_ = d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPathTranslation(EnumC15735d enumC15735d) {
        this.pathTranslation_ = enumC15735d.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPathTranslationValue(int i) {
        this.pathTranslation_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProtocol(String str) {
        str.getClass();
        this.protocol_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProtocolBytes(vj1 vj1Var) {
        AbstractC1714b3.m2857c(vj1Var);
        this.protocol_ = vj1Var.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSelector(String str) {
        str.getClass();
        this.selector_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSelectorBytes(vj1 vj1Var) {
        AbstractC1714b3.m2857c(vj1Var);
        this.selector_ = vj1Var.toStringUtf8();
    }

    @Override // p000.zn0
    public String getAddress() {
        return this.address_;
    }

    @Override // p000.zn0
    public vj1 getAddressBytes() {
        return vj1.copyFromUtf8(this.address_);
    }

    @Override // p000.zn0
    public EnumC15733b getAuthenticationCase() {
        return EnumC15733b.forNumber(this.authenticationCase_);
    }

    @Override // p000.zn0
    public double getDeadline() {
        return this.deadline_;
    }

    @Override // p000.zn0
    public boolean getDisableAuth() {
        if (this.authenticationCase_ == 8) {
            return ((Boolean) this.authentication_).booleanValue();
        }
        return false;
    }

    @Override // p000.zn0
    public String getJwtAudience() {
        return this.authenticationCase_ == 7 ? (String) this.authentication_ : "";
    }

    @Override // p000.zn0
    public vj1 getJwtAudienceBytes() {
        return vj1.copyFromUtf8(this.authenticationCase_ == 7 ? (String) this.authentication_ : "");
    }

    @Override // p000.zn0
    public double getMinDeadline() {
        return this.minDeadline_;
    }

    @Override // p000.zn0
    public double getOperationDeadline() {
        return this.operationDeadline_;
    }

    @Override // p000.zn0
    public EnumC15735d getPathTranslation() {
        EnumC15735d enumC15735dForNumber = EnumC15735d.forNumber(this.pathTranslation_);
        return enumC15735dForNumber == null ? EnumC15735d.UNRECOGNIZED : enumC15735dForNumber;
    }

    @Override // p000.zn0
    public int getPathTranslationValue() {
        return this.pathTranslation_;
    }

    @Override // p000.zn0
    public String getProtocol() {
        return this.protocol_;
    }

    @Override // p000.zn0
    public vj1 getProtocolBytes() {
        return vj1.copyFromUtf8(this.protocol_);
    }

    @Override // p000.zn0
    public String getSelector() {
        return this.selector_;
    }

    @Override // p000.zn0
    public vj1 getSelectorBytes() {
        return vj1.copyFromUtf8(this.selector_);
    }

    @Override // p000.zn0
    public boolean hasDisableAuth() {
        return this.authenticationCase_ == 8;
    }

    @Override // p000.zn0
    public boolean hasJwtAudience() {
        return this.authenticationCase_ == 7;
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
        C15732a c15732a = null;
        switch (C15732a.f102309a[enumC13830i.ordinal()]) {
            case 1:
                return new yn0();
            case 2:
                return new C15734c(c15732a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\t\u0001\u0000\u0001\t\t\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0000\u0004\u0000\u0005\u0000\u0006\f\u0007Ȼ\u0000\b:\u0000\tȈ", new Object[]{"authentication_", "authenticationCase_", "selector_", "address_", "deadline_", "minDeadline_", "operationDeadline_", "pathTranslation_", "protocol_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<yn0> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (yn0.class) {
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

    public static C15734c newBuilder(yn0 yn0Var) {
        return DEFAULT_INSTANCE.m23739o(yn0Var);
    }

    public static yn0 parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (yn0) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static yn0 parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
        return (yn0) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
    }

    public static yn0 parseFrom(vj1 vj1Var) throws ce8 {
        return (yn0) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
    }

    public static yn0 parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
        return (yn0) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
    }

    public static yn0 parseFrom(byte[] bArr) throws ce8 {
        return (yn0) v27.m23710c0(DEFAULT_INSTANCE, bArr);
    }

    public static yn0 parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
        return (yn0) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
    }

    public static yn0 parseFrom(InputStream inputStream) throws IOException {
        return (yn0) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
    }

    public static yn0 parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (yn0) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static yn0 parseFrom(f72 f72Var) throws IOException {
        return (yn0) v27.m23704W(DEFAULT_INSTANCE, f72Var);
    }

    public static yn0 parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
        return (yn0) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
    }
}
