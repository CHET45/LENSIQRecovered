package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p000.v27;

/* JADX INFO: loaded from: classes5.dex */
public final class ju8 extends v27<ju8, C8095b> implements ku8 {
    private static final ju8 DEFAULT_INSTANCE;
    public static final int LATITUDE_FIELD_NUMBER = 1;
    public static final int LONGITUDE_FIELD_NUMBER = 2;
    private static volatile uhc<ju8> PARSER;
    private double latitude_;
    private double longitude_;

    /* JADX INFO: renamed from: ju8$a */
    public static /* synthetic */ class C8094a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f51936a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f51936a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f51936a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f51936a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f51936a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f51936a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f51936a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f51936a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: ju8$b */
    public static final class C8095b extends v27.AbstractC13823b<ju8, C8095b> implements ku8 {
        public /* synthetic */ C8095b(C8094a c8094a) {
            this();
        }

        public C8095b clearLatitude() {
            m23743e();
            ((ju8) this.f89756b).clearLatitude();
            return this;
        }

        public C8095b clearLongitude() {
            m23743e();
            ((ju8) this.f89756b).clearLongitude();
            return this;
        }

        @Override // p000.ku8
        public double getLatitude() {
            return ((ju8) this.f89756b).getLatitude();
        }

        @Override // p000.ku8
        public double getLongitude() {
            return ((ju8) this.f89756b).getLongitude();
        }

        public C8095b setLatitude(double d) {
            m23743e();
            ((ju8) this.f89756b).setLatitude(d);
            return this;
        }

        public C8095b setLongitude(double d) {
            m23743e();
            ((ju8) this.f89756b).setLongitude(d);
            return this;
        }

        private C8095b() {
            super(ju8.DEFAULT_INSTANCE);
        }
    }

    static {
        ju8 ju8Var = new ju8();
        DEFAULT_INSTANCE = ju8Var;
        v27.m23715h0(ju8.class, ju8Var);
    }

    private ju8() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLatitude() {
        this.latitude_ = 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLongitude() {
        this.longitude_ = 0.0d;
    }

    public static ju8 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C8095b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    public static ju8 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ju8) v27.m23700S(DEFAULT_INSTANCE, inputStream);
    }

    public static ju8 parseFrom(ByteBuffer byteBuffer) throws ce8 {
        return (ju8) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static uhc<ju8> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLatitude(double d) {
        this.latitude_ = d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLongitude(double d) {
        this.longitude_ = d;
    }

    @Override // p000.ku8
    public double getLatitude() {
        return this.latitude_;
    }

    @Override // p000.ku8
    public double getLongitude() {
        return this.longitude_;
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
        C8094a c8094a = null;
        switch (C8094a.f51936a[enumC13830i.ordinal()]) {
            case 1:
                return new ju8();
            case 2:
                return new C8095b(c8094a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0000\u0002\u0000", new Object[]{"latitude_", "longitude_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<ju8> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (ju8.class) {
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

    public static C8095b newBuilder(ju8 ju8Var) {
        return DEFAULT_INSTANCE.m23739o(ju8Var);
    }

    public static ju8 parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (ju8) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static ju8 parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
        return (ju8) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
    }

    public static ju8 parseFrom(vj1 vj1Var) throws ce8 {
        return (ju8) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
    }

    public static ju8 parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
        return (ju8) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
    }

    public static ju8 parseFrom(byte[] bArr) throws ce8 {
        return (ju8) v27.m23710c0(DEFAULT_INSTANCE, bArr);
    }

    public static ju8 parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
        return (ju8) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
    }

    public static ju8 parseFrom(InputStream inputStream) throws IOException {
        return (ju8) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
    }

    public static ju8 parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (ju8) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static ju8 parseFrom(f72 f72Var) throws IOException {
        return (ju8) v27.m23704W(DEFAULT_INSTANCE, f72Var);
    }

    public static ju8 parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
        return (ju8) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
    }
}
