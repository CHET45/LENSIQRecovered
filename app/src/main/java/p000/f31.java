package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p000.v27;

/* JADX INFO: loaded from: classes5.dex */
public final class f31 extends v27<f31, C5570b> implements g31 {
    public static final int BITMAP_FIELD_NUMBER = 1;
    private static final f31 DEFAULT_INSTANCE;
    public static final int PADDING_FIELD_NUMBER = 2;
    private static volatile uhc<f31> PARSER;
    private vj1 bitmap_ = vj1.f91344e;
    private int padding_;

    /* JADX INFO: renamed from: f31$a */
    public static /* synthetic */ class C5569a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f34943a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f34943a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f34943a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f34943a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f34943a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f34943a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f34943a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f34943a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: f31$b */
    public static final class C5570b extends v27.AbstractC13823b<f31, C5570b> implements g31 {
        public /* synthetic */ C5570b(C5569a c5569a) {
            this();
        }

        public C5570b clearBitmap() {
            m23743e();
            ((f31) this.f89756b).clearBitmap();
            return this;
        }

        public C5570b clearPadding() {
            m23743e();
            ((f31) this.f89756b).clearPadding();
            return this;
        }

        @Override // p000.g31
        public vj1 getBitmap() {
            return ((f31) this.f89756b).getBitmap();
        }

        @Override // p000.g31
        public int getPadding() {
            return ((f31) this.f89756b).getPadding();
        }

        public C5570b setBitmap(vj1 vj1Var) {
            m23743e();
            ((f31) this.f89756b).setBitmap(vj1Var);
            return this;
        }

        public C5570b setPadding(int i) {
            m23743e();
            ((f31) this.f89756b).setPadding(i);
            return this;
        }

        private C5570b() {
            super(f31.DEFAULT_INSTANCE);
        }
    }

    static {
        f31 f31Var = new f31();
        DEFAULT_INSTANCE = f31Var;
        v27.m23715h0(f31.class, f31Var);
    }

    private f31() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBitmap() {
        this.bitmap_ = getDefaultInstance().getBitmap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPadding() {
        this.padding_ = 0;
    }

    public static f31 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C5570b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    public static f31 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (f31) v27.m23700S(DEFAULT_INSTANCE, inputStream);
    }

    public static f31 parseFrom(ByteBuffer byteBuffer) throws ce8 {
        return (f31) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static uhc<f31> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBitmap(vj1 vj1Var) {
        vj1Var.getClass();
        this.bitmap_ = vj1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPadding(int i) {
        this.padding_ = i;
    }

    @Override // p000.g31
    public vj1 getBitmap() {
        return this.bitmap_;
    }

    @Override // p000.g31
    public int getPadding() {
        return this.padding_;
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
        C5569a c5569a = null;
        switch (C5569a.f34943a[enumC13830i.ordinal()]) {
            case 1:
                return new f31();
            case 2:
                return new C5570b(c5569a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\n\u0002\u0004", new Object[]{"bitmap_", "padding_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<f31> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (f31.class) {
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

    public static C5570b newBuilder(f31 f31Var) {
        return DEFAULT_INSTANCE.m23739o(f31Var);
    }

    public static f31 parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (f31) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static f31 parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
        return (f31) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
    }

    public static f31 parseFrom(vj1 vj1Var) throws ce8 {
        return (f31) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
    }

    public static f31 parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
        return (f31) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
    }

    public static f31 parseFrom(byte[] bArr) throws ce8 {
        return (f31) v27.m23710c0(DEFAULT_INSTANCE, bArr);
    }

    public static f31 parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
        return (f31) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
    }

    public static f31 parseFrom(InputStream inputStream) throws IOException {
        return (f31) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
    }

    public static f31 parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (f31) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static f31 parseFrom(f72 f72Var) throws IOException {
        return (f31) v27.m23704W(DEFAULT_INSTANCE, f72Var);
    }

    public static f31 parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
        return (f31) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
    }
}
