package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p000.v27;

/* JADX INFO: loaded from: classes5.dex */
public final class eld extends v27<eld, C5369b> implements fld {
    private static final eld DEFAULT_INSTANCE;
    private static volatile uhc<eld> PARSER = null;
    public static final int W_FIELD_NUMBER = 4;
    public static final int X_FIELD_NUMBER = 1;
    public static final int Y_FIELD_NUMBER = 2;
    public static final int Z_FIELD_NUMBER = 3;

    /* JADX INFO: renamed from: w_ */
    private double f33352w_;

    /* JADX INFO: renamed from: x_ */
    private double f33353x_;

    /* JADX INFO: renamed from: y_ */
    private double f33354y_;

    /* JADX INFO: renamed from: z_ */
    private double f33355z_;

    /* JADX INFO: renamed from: eld$a */
    public static /* synthetic */ class C5368a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f33356a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f33356a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f33356a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f33356a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f33356a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f33356a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f33356a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f33356a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: eld$b */
    public static final class C5369b extends v27.AbstractC13823b<eld, C5369b> implements fld {
        public /* synthetic */ C5369b(C5368a c5368a) {
            this();
        }

        public C5369b clearW() {
            m23743e();
            ((eld) this.f89756b).clearW();
            return this;
        }

        public C5369b clearX() {
            m23743e();
            ((eld) this.f89756b).clearX();
            return this;
        }

        public C5369b clearY() {
            m23743e();
            ((eld) this.f89756b).clearY();
            return this;
        }

        public C5369b clearZ() {
            m23743e();
            ((eld) this.f89756b).clearZ();
            return this;
        }

        @Override // p000.fld
        public double getW() {
            return ((eld) this.f89756b).getW();
        }

        @Override // p000.fld
        public double getX() {
            return ((eld) this.f89756b).getX();
        }

        @Override // p000.fld
        public double getY() {
            return ((eld) this.f89756b).getY();
        }

        @Override // p000.fld
        public double getZ() {
            return ((eld) this.f89756b).getZ();
        }

        public C5369b setW(double d) {
            m23743e();
            ((eld) this.f89756b).setW(d);
            return this;
        }

        public C5369b setX(double d) {
            m23743e();
            ((eld) this.f89756b).setX(d);
            return this;
        }

        public C5369b setY(double d) {
            m23743e();
            ((eld) this.f89756b).setY(d);
            return this;
        }

        public C5369b setZ(double d) {
            m23743e();
            ((eld) this.f89756b).setZ(d);
            return this;
        }

        private C5369b() {
            super(eld.DEFAULT_INSTANCE);
        }
    }

    static {
        eld eldVar = new eld();
        DEFAULT_INSTANCE = eldVar;
        v27.m23715h0(eld.class, eldVar);
    }

    private eld() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearW() {
        this.f33352w_ = 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearX() {
        this.f33353x_ = 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearY() {
        this.f33354y_ = 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearZ() {
        this.f33355z_ = 0.0d;
    }

    public static eld getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C5369b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    public static eld parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (eld) v27.m23700S(DEFAULT_INSTANCE, inputStream);
    }

    public static eld parseFrom(ByteBuffer byteBuffer) throws ce8 {
        return (eld) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static uhc<eld> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setW(double d) {
        this.f33352w_ = d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setX(double d) {
        this.f33353x_ = d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setY(double d) {
        this.f33354y_ = d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setZ(double d) {
        this.f33355z_ = d;
    }

    @Override // p000.fld
    public double getW() {
        return this.f33352w_;
    }

    @Override // p000.fld
    public double getX() {
        return this.f33353x_;
    }

    @Override // p000.fld
    public double getY() {
        return this.f33354y_;
    }

    @Override // p000.fld
    public double getZ() {
        return this.f33355z_;
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
        C5368a c5368a = null;
        switch (C5368a.f33356a[enumC13830i.ordinal()]) {
            case 1:
                return new eld();
            case 2:
                return new C5369b(c5368a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0000\u0002\u0000\u0003\u0000\u0004\u0000", new Object[]{"x_", "y_", "z_", "w_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<eld> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (eld.class) {
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

    public static C5369b newBuilder(eld eldVar) {
        return DEFAULT_INSTANCE.m23739o(eldVar);
    }

    public static eld parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (eld) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static eld parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
        return (eld) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
    }

    public static eld parseFrom(vj1 vj1Var) throws ce8 {
        return (eld) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
    }

    public static eld parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
        return (eld) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
    }

    public static eld parseFrom(byte[] bArr) throws ce8 {
        return (eld) v27.m23710c0(DEFAULT_INSTANCE, bArr);
    }

    public static eld parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
        return (eld) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
    }

    public static eld parseFrom(InputStream inputStream) throws IOException {
        return (eld) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
    }

    public static eld parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (eld) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static eld parseFrom(f72 f72Var) throws IOException {
        return (eld) v27.m23704W(DEFAULT_INSTANCE, f72Var);
    }

    public static eld parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
        return (eld) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
    }
}
