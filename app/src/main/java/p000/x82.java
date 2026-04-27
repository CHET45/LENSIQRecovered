package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p000.j56;
import p000.v27;

/* JADX INFO: loaded from: classes5.dex */
public final class x82 extends v27<x82, C14980b> implements p92 {
    public static final int ALPHA_FIELD_NUMBER = 4;
    public static final int BLUE_FIELD_NUMBER = 3;
    private static final x82 DEFAULT_INSTANCE;
    public static final int GREEN_FIELD_NUMBER = 2;
    private static volatile uhc<x82> PARSER = null;
    public static final int RED_FIELD_NUMBER = 1;
    private j56 alpha_;
    private int bitField0_;
    private float blue_;
    private float green_;
    private float red_;

    /* JADX INFO: renamed from: x82$a */
    public static /* synthetic */ class C14979a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f97152a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f97152a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f97152a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f97152a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f97152a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f97152a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f97152a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f97152a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: x82$b */
    public static final class C14980b extends v27.AbstractC13823b<x82, C14980b> implements p92 {
        public /* synthetic */ C14980b(C14979a c14979a) {
            this();
        }

        public C14980b clearAlpha() {
            m23743e();
            ((x82) this.f89756b).clearAlpha();
            return this;
        }

        public C14980b clearBlue() {
            m23743e();
            ((x82) this.f89756b).clearBlue();
            return this;
        }

        public C14980b clearGreen() {
            m23743e();
            ((x82) this.f89756b).clearGreen();
            return this;
        }

        public C14980b clearRed() {
            m23743e();
            ((x82) this.f89756b).clearRed();
            return this;
        }

        @Override // p000.p92
        public j56 getAlpha() {
            return ((x82) this.f89756b).getAlpha();
        }

        @Override // p000.p92
        public float getBlue() {
            return ((x82) this.f89756b).getBlue();
        }

        @Override // p000.p92
        public float getGreen() {
            return ((x82) this.f89756b).getGreen();
        }

        @Override // p000.p92
        public float getRed() {
            return ((x82) this.f89756b).getRed();
        }

        @Override // p000.p92
        public boolean hasAlpha() {
            return ((x82) this.f89756b).hasAlpha();
        }

        public C14980b mergeAlpha(j56 j56Var) {
            m23743e();
            ((x82) this.f89756b).mergeAlpha(j56Var);
            return this;
        }

        public C14980b setAlpha(j56 j56Var) {
            m23743e();
            ((x82) this.f89756b).setAlpha(j56Var);
            return this;
        }

        public C14980b setBlue(float f) {
            m23743e();
            ((x82) this.f89756b).setBlue(f);
            return this;
        }

        public C14980b setGreen(float f) {
            m23743e();
            ((x82) this.f89756b).setGreen(f);
            return this;
        }

        public C14980b setRed(float f) {
            m23743e();
            ((x82) this.f89756b).setRed(f);
            return this;
        }

        private C14980b() {
            super(x82.DEFAULT_INSTANCE);
        }

        public C14980b setAlpha(j56.C7739b c7739b) {
            m23743e();
            ((x82) this.f89756b).setAlpha(c7739b.build());
            return this;
        }
    }

    static {
        x82 x82Var = new x82();
        DEFAULT_INSTANCE = x82Var;
        v27.m23715h0(x82.class, x82Var);
    }

    private x82() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlpha() {
        this.alpha_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBlue() {
        this.blue_ = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGreen() {
        this.green_ = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRed() {
        this.red_ = 0.0f;
    }

    public static x82 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAlpha(j56 j56Var) {
        j56Var.getClass();
        j56 j56Var2 = this.alpha_;
        if (j56Var2 == null || j56Var2 == j56.getDefaultInstance()) {
            this.alpha_ = j56Var;
        } else {
            this.alpha_ = j56.newBuilder(this.alpha_).mergeFrom(j56Var).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static C14980b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    public static x82 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (x82) v27.m23700S(DEFAULT_INSTANCE, inputStream);
    }

    public static x82 parseFrom(ByteBuffer byteBuffer) throws ce8 {
        return (x82) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static uhc<x82> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlpha(j56 j56Var) {
        j56Var.getClass();
        this.alpha_ = j56Var;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBlue(float f) {
        this.blue_ = f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGreen(float f) {
        this.green_ = f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRed(float f) {
        this.red_ = f;
    }

    @Override // p000.p92
    public j56 getAlpha() {
        j56 j56Var = this.alpha_;
        return j56Var == null ? j56.getDefaultInstance() : j56Var;
    }

    @Override // p000.p92
    public float getBlue() {
        return this.blue_;
    }

    @Override // p000.p92
    public float getGreen() {
        return this.green_;
    }

    @Override // p000.p92
    public float getRed() {
        return this.red_;
    }

    @Override // p000.p92
    public boolean hasAlpha() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
        C14979a c14979a = null;
        switch (C14979a.f97152a[enumC13830i.ordinal()]) {
            case 1:
                return new x82();
            case 2:
                return new C14980b(c14979a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0001\u0002\u0001\u0003\u0001\u0004ဉ\u0000", new Object[]{"bitField0_", "red_", "green_", "blue_", "alpha_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<x82> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (x82.class) {
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

    public static C14980b newBuilder(x82 x82Var) {
        return DEFAULT_INSTANCE.m23739o(x82Var);
    }

    public static x82 parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (x82) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static x82 parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
        return (x82) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
    }

    public static x82 parseFrom(vj1 vj1Var) throws ce8 {
        return (x82) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
    }

    public static x82 parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
        return (x82) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
    }

    public static x82 parseFrom(byte[] bArr) throws ce8 {
        return (x82) v27.m23710c0(DEFAULT_INSTANCE, bArr);
    }

    public static x82 parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
        return (x82) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
    }

    public static x82 parseFrom(InputStream inputStream) throws IOException {
        return (x82) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
    }

    public static x82 parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (x82) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static x82 parseFrom(f72 f72Var) throws IOException {
        return (x82) v27.m23704W(DEFAULT_INSTANCE, f72Var);
    }

    public static x82 parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
        return (x82) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
    }
}
