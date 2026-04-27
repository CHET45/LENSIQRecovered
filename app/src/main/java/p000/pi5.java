package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p000.v27;

/* JADX INFO: loaded from: classes5.dex */
public final class pi5 extends v27<pi5, C10967b> implements qi5 {
    private static final pi5 DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 3;
    public static final int EXPRESSION_FIELD_NUMBER = 1;
    public static final int LOCATION_FIELD_NUMBER = 4;
    private static volatile uhc<pi5> PARSER = null;
    public static final int TITLE_FIELD_NUMBER = 2;
    private String expression_ = "";
    private String title_ = "";
    private String description_ = "";
    private String location_ = "";

    /* JADX INFO: renamed from: pi5$a */
    public static /* synthetic */ class C10966a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f70927a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f70927a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f70927a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f70927a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f70927a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f70927a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f70927a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f70927a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: pi5$b */
    public static final class C10967b extends v27.AbstractC13823b<pi5, C10967b> implements qi5 {
        public /* synthetic */ C10967b(C10966a c10966a) {
            this();
        }

        public C10967b clearDescription() {
            m23743e();
            ((pi5) this.f89756b).clearDescription();
            return this;
        }

        public C10967b clearExpression() {
            m23743e();
            ((pi5) this.f89756b).clearExpression();
            return this;
        }

        public C10967b clearLocation() {
            m23743e();
            ((pi5) this.f89756b).clearLocation();
            return this;
        }

        public C10967b clearTitle() {
            m23743e();
            ((pi5) this.f89756b).clearTitle();
            return this;
        }

        @Override // p000.qi5
        public String getDescription() {
            return ((pi5) this.f89756b).getDescription();
        }

        @Override // p000.qi5
        public vj1 getDescriptionBytes() {
            return ((pi5) this.f89756b).getDescriptionBytes();
        }

        @Override // p000.qi5
        public String getExpression() {
            return ((pi5) this.f89756b).getExpression();
        }

        @Override // p000.qi5
        public vj1 getExpressionBytes() {
            return ((pi5) this.f89756b).getExpressionBytes();
        }

        @Override // p000.qi5
        public String getLocation() {
            return ((pi5) this.f89756b).getLocation();
        }

        @Override // p000.qi5
        public vj1 getLocationBytes() {
            return ((pi5) this.f89756b).getLocationBytes();
        }

        @Override // p000.qi5
        public String getTitle() {
            return ((pi5) this.f89756b).getTitle();
        }

        @Override // p000.qi5
        public vj1 getTitleBytes() {
            return ((pi5) this.f89756b).getTitleBytes();
        }

        public C10967b setDescription(String str) {
            m23743e();
            ((pi5) this.f89756b).setDescription(str);
            return this;
        }

        public C10967b setDescriptionBytes(vj1 vj1Var) {
            m23743e();
            ((pi5) this.f89756b).setDescriptionBytes(vj1Var);
            return this;
        }

        public C10967b setExpression(String str) {
            m23743e();
            ((pi5) this.f89756b).setExpression(str);
            return this;
        }

        public C10967b setExpressionBytes(vj1 vj1Var) {
            m23743e();
            ((pi5) this.f89756b).setExpressionBytes(vj1Var);
            return this;
        }

        public C10967b setLocation(String str) {
            m23743e();
            ((pi5) this.f89756b).setLocation(str);
            return this;
        }

        public C10967b setLocationBytes(vj1 vj1Var) {
            m23743e();
            ((pi5) this.f89756b).setLocationBytes(vj1Var);
            return this;
        }

        public C10967b setTitle(String str) {
            m23743e();
            ((pi5) this.f89756b).setTitle(str);
            return this;
        }

        public C10967b setTitleBytes(vj1 vj1Var) {
            m23743e();
            ((pi5) this.f89756b).setTitleBytes(vj1Var);
            return this;
        }

        private C10967b() {
            super(pi5.DEFAULT_INSTANCE);
        }
    }

    static {
        pi5 pi5Var = new pi5();
        DEFAULT_INSTANCE = pi5Var;
        v27.m23715h0(pi5.class, pi5Var);
    }

    private pi5() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDescription() {
        this.description_ = getDefaultInstance().getDescription();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExpression() {
        this.expression_ = getDefaultInstance().getExpression();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLocation() {
        this.location_ = getDefaultInstance().getLocation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTitle() {
        this.title_ = getDefaultInstance().getTitle();
    }

    public static pi5 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C10967b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    public static pi5 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (pi5) v27.m23700S(DEFAULT_INSTANCE, inputStream);
    }

    public static pi5 parseFrom(ByteBuffer byteBuffer) throws ce8 {
        return (pi5) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static uhc<pi5> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDescription(String str) {
        str.getClass();
        this.description_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDescriptionBytes(vj1 vj1Var) {
        AbstractC1714b3.m2857c(vj1Var);
        this.description_ = vj1Var.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExpression(String str) {
        str.getClass();
        this.expression_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExpressionBytes(vj1 vj1Var) {
        AbstractC1714b3.m2857c(vj1Var);
        this.expression_ = vj1Var.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLocation(String str) {
        str.getClass();
        this.location_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLocationBytes(vj1 vj1Var) {
        AbstractC1714b3.m2857c(vj1Var);
        this.location_ = vj1Var.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTitle(String str) {
        str.getClass();
        this.title_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTitleBytes(vj1 vj1Var) {
        AbstractC1714b3.m2857c(vj1Var);
        this.title_ = vj1Var.toStringUtf8();
    }

    @Override // p000.qi5
    public String getDescription() {
        return this.description_;
    }

    @Override // p000.qi5
    public vj1 getDescriptionBytes() {
        return vj1.copyFromUtf8(this.description_);
    }

    @Override // p000.qi5
    public String getExpression() {
        return this.expression_;
    }

    @Override // p000.qi5
    public vj1 getExpressionBytes() {
        return vj1.copyFromUtf8(this.expression_);
    }

    @Override // p000.qi5
    public String getLocation() {
        return this.location_;
    }

    @Override // p000.qi5
    public vj1 getLocationBytes() {
        return vj1.copyFromUtf8(this.location_);
    }

    @Override // p000.qi5
    public String getTitle() {
        return this.title_;
    }

    @Override // p000.qi5
    public vj1 getTitleBytes() {
        return vj1.copyFromUtf8(this.title_);
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
        C10966a c10966a = null;
        switch (C10966a.f70927a[enumC13830i.ordinal()]) {
            case 1:
                return new pi5();
            case 2:
                return new C10967b(c10966a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ", new Object[]{"expression_", "title_", "description_", "location_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<pi5> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (pi5.class) {
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

    public static C10967b newBuilder(pi5 pi5Var) {
        return DEFAULT_INSTANCE.m23739o(pi5Var);
    }

    public static pi5 parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (pi5) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static pi5 parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
        return (pi5) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
    }

    public static pi5 parseFrom(vj1 vj1Var) throws ce8 {
        return (pi5) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
    }

    public static pi5 parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
        return (pi5) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
    }

    public static pi5 parseFrom(byte[] bArr) throws ce8 {
        return (pi5) v27.m23710c0(DEFAULT_INSTANCE, bArr);
    }

    public static pi5 parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
        return (pi5) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
    }

    public static pi5 parseFrom(InputStream inputStream) throws IOException {
        return (pi5) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
    }

    public static pi5 parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (pi5) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static pi5 parseFrom(f72 f72Var) throws IOException {
        return (pi5) v27.m23704W(DEFAULT_INSTANCE, f72Var);
    }

    public static pi5 parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
        return (pi5) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
    }
}
