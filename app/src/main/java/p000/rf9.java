package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p000.v27;

/* JADX INFO: loaded from: classes4.dex */
public final class rf9 extends v27<rf9, C12062b> implements sf9 {
    private static final rf9 DEFAULT_INSTANCE;
    public static final int LOCALE_FIELD_NUMBER = 1;
    public static final int MESSAGE_FIELD_NUMBER = 2;
    private static volatile uhc<rf9> PARSER;
    private String locale_ = "";
    private String message_ = "";

    /* JADX INFO: renamed from: rf9$a */
    public static /* synthetic */ class C12061a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f78158a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f78158a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f78158a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f78158a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f78158a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f78158a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f78158a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f78158a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: rf9$b */
    public static final class C12062b extends v27.AbstractC13823b<rf9, C12062b> implements sf9 {
        public /* synthetic */ C12062b(C12061a c12061a) {
            this();
        }

        public C12062b clearLocale() {
            m23743e();
            ((rf9) this.f89756b).clearLocale();
            return this;
        }

        public C12062b clearMessage() {
            m23743e();
            ((rf9) this.f89756b).clearMessage();
            return this;
        }

        @Override // p000.sf9
        public String getLocale() {
            return ((rf9) this.f89756b).getLocale();
        }

        @Override // p000.sf9
        public vj1 getLocaleBytes() {
            return ((rf9) this.f89756b).getLocaleBytes();
        }

        @Override // p000.sf9
        public String getMessage() {
            return ((rf9) this.f89756b).getMessage();
        }

        @Override // p000.sf9
        public vj1 getMessageBytes() {
            return ((rf9) this.f89756b).getMessageBytes();
        }

        public C12062b setLocale(String str) {
            m23743e();
            ((rf9) this.f89756b).setLocale(str);
            return this;
        }

        public C12062b setLocaleBytes(vj1 vj1Var) {
            m23743e();
            ((rf9) this.f89756b).setLocaleBytes(vj1Var);
            return this;
        }

        public C12062b setMessage(String str) {
            m23743e();
            ((rf9) this.f89756b).setMessage(str);
            return this;
        }

        public C12062b setMessageBytes(vj1 vj1Var) {
            m23743e();
            ((rf9) this.f89756b).setMessageBytes(vj1Var);
            return this;
        }

        private C12062b() {
            super(rf9.DEFAULT_INSTANCE);
        }
    }

    static {
        rf9 rf9Var = new rf9();
        DEFAULT_INSTANCE = rf9Var;
        v27.m23715h0(rf9.class, rf9Var);
    }

    private rf9() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLocale() {
        this.locale_ = getDefaultInstance().getLocale();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMessage() {
        this.message_ = getDefaultInstance().getMessage();
    }

    public static rf9 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C12062b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    public static rf9 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (rf9) v27.m23700S(DEFAULT_INSTANCE, inputStream);
    }

    public static rf9 parseFrom(ByteBuffer byteBuffer) throws ce8 {
        return (rf9) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static uhc<rf9> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLocale(String str) {
        str.getClass();
        this.locale_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLocaleBytes(vj1 vj1Var) {
        AbstractC1714b3.m2857c(vj1Var);
        this.locale_ = vj1Var.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMessage(String str) {
        str.getClass();
        this.message_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMessageBytes(vj1 vj1Var) {
        AbstractC1714b3.m2857c(vj1Var);
        this.message_ = vj1Var.toStringUtf8();
    }

    @Override // p000.sf9
    public String getLocale() {
        return this.locale_;
    }

    @Override // p000.sf9
    public vj1 getLocaleBytes() {
        return vj1.copyFromUtf8(this.locale_);
    }

    @Override // p000.sf9
    public String getMessage() {
        return this.message_;
    }

    @Override // p000.sf9
    public vj1 getMessageBytes() {
        return vj1.copyFromUtf8(this.message_);
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
        C12061a c12061a = null;
        switch (C12061a.f78158a[enumC13830i.ordinal()]) {
            case 1:
                return new rf9();
            case 2:
                return new C12062b(c12061a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"locale_", "message_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<rf9> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (rf9.class) {
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

    public static C12062b newBuilder(rf9 rf9Var) {
        return DEFAULT_INSTANCE.m23739o(rf9Var);
    }

    public static rf9 parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (rf9) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static rf9 parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
        return (rf9) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
    }

    public static rf9 parseFrom(vj1 vj1Var) throws ce8 {
        return (rf9) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
    }

    public static rf9 parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
        return (rf9) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
    }

    public static rf9 parseFrom(byte[] bArr) throws ce8 {
        return (rf9) v27.m23710c0(DEFAULT_INSTANCE, bArr);
    }

    public static rf9 parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
        return (rf9) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
    }

    public static rf9 parseFrom(InputStream inputStream) throws IOException {
        return (rf9) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
    }

    public static rf9 parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (rf9) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static rf9 parseFrom(f72 f72Var) throws IOException {
        return (rf9) v27.m23704W(DEFAULT_INSTANCE, f72Var);
    }

    public static rf9 parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
        return (rf9) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
    }
}
