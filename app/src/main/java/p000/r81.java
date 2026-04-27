package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p000.f31;
import p000.v27;

/* JADX INFO: loaded from: classes5.dex */
public final class r81 extends v27<r81, C11940b> implements s81 {
    public static final int BITS_FIELD_NUMBER = 1;
    private static final r81 DEFAULT_INSTANCE;
    public static final int HASH_COUNT_FIELD_NUMBER = 2;
    private static volatile uhc<r81> PARSER;
    private int bitField0_;
    private f31 bits_;
    private int hashCount_;

    /* JADX INFO: renamed from: r81$a */
    public static /* synthetic */ class C11939a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f77378a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f77378a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f77378a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f77378a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f77378a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f77378a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f77378a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f77378a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: r81$b */
    public static final class C11940b extends v27.AbstractC13823b<r81, C11940b> implements s81 {
        public /* synthetic */ C11940b(C11939a c11939a) {
            this();
        }

        public C11940b clearBits() {
            m23743e();
            ((r81) this.f89756b).clearBits();
            return this;
        }

        public C11940b clearHashCount() {
            m23743e();
            ((r81) this.f89756b).clearHashCount();
            return this;
        }

        @Override // p000.s81
        public f31 getBits() {
            return ((r81) this.f89756b).getBits();
        }

        @Override // p000.s81
        public int getHashCount() {
            return ((r81) this.f89756b).getHashCount();
        }

        @Override // p000.s81
        public boolean hasBits() {
            return ((r81) this.f89756b).hasBits();
        }

        public C11940b mergeBits(f31 f31Var) {
            m23743e();
            ((r81) this.f89756b).mergeBits(f31Var);
            return this;
        }

        public C11940b setBits(f31 f31Var) {
            m23743e();
            ((r81) this.f89756b).setBits(f31Var);
            return this;
        }

        public C11940b setHashCount(int i) {
            m23743e();
            ((r81) this.f89756b).setHashCount(i);
            return this;
        }

        private C11940b() {
            super(r81.DEFAULT_INSTANCE);
        }

        public C11940b setBits(f31.C5570b c5570b) {
            m23743e();
            ((r81) this.f89756b).setBits(c5570b.build());
            return this;
        }
    }

    static {
        r81 r81Var = new r81();
        DEFAULT_INSTANCE = r81Var;
        v27.m23715h0(r81.class, r81Var);
    }

    private r81() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBits() {
        this.bits_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHashCount() {
        this.hashCount_ = 0;
    }

    public static r81 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBits(f31 f31Var) {
        f31Var.getClass();
        f31 f31Var2 = this.bits_;
        if (f31Var2 == null || f31Var2 == f31.getDefaultInstance()) {
            this.bits_ = f31Var;
        } else {
            this.bits_ = f31.newBuilder(this.bits_).mergeFrom(f31Var).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static C11940b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    public static r81 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (r81) v27.m23700S(DEFAULT_INSTANCE, inputStream);
    }

    public static r81 parseFrom(ByteBuffer byteBuffer) throws ce8 {
        return (r81) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static uhc<r81> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBits(f31 f31Var) {
        f31Var.getClass();
        this.bits_ = f31Var;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHashCount(int i) {
        this.hashCount_ = i;
    }

    @Override // p000.s81
    public f31 getBits() {
        f31 f31Var = this.bits_;
        return f31Var == null ? f31.getDefaultInstance() : f31Var;
    }

    @Override // p000.s81
    public int getHashCount() {
        return this.hashCount_;
    }

    @Override // p000.s81
    public boolean hasBits() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
        C11939a c11939a = null;
        switch (C11939a.f77378a[enumC13830i.ordinal()]) {
            case 1:
                return new r81();
            case 2:
                return new C11940b(c11939a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0004", new Object[]{"bitField0_", "bits_", "hashCount_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<r81> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (r81.class) {
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

    public static C11940b newBuilder(r81 r81Var) {
        return DEFAULT_INSTANCE.m23739o(r81Var);
    }

    public static r81 parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (r81) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static r81 parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
        return (r81) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
    }

    public static r81 parseFrom(vj1 vj1Var) throws ce8 {
        return (r81) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
    }

    public static r81 parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
        return (r81) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
    }

    public static r81 parseFrom(byte[] bArr) throws ce8 {
        return (r81) v27.m23710c0(DEFAULT_INSTANCE, bArr);
    }

    public static r81 parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
        return (r81) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
    }

    public static r81 parseFrom(InputStream inputStream) throws IOException {
        return (r81) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
    }

    public static r81 parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (r81) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static r81 parseFrom(f72 f72Var) throws IOException {
        return (r81) v27.m23704W(DEFAULT_INSTANCE, f72Var);
    }

    public static r81 parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
        return (r81) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
    }
}
