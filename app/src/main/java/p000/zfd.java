package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p000.v27;
import p000.w98;

/* JADX INFO: loaded from: classes5.dex */
public final class zfd extends v27<zfd, C16115b> implements jgd {
    private static final zfd DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 3;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile uhc<zfd> PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 2;
    private int type_;
    private String name_ = "";
    private String description_ = "";

    /* JADX INFO: renamed from: zfd$a */
    public static /* synthetic */ class C16114a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f105007a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f105007a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f105007a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f105007a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f105007a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f105007a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f105007a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f105007a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: zfd$b */
    public static final class C16115b extends v27.AbstractC13823b<zfd, C16115b> implements jgd {
        public /* synthetic */ C16115b(C16114a c16114a) {
            this();
        }

        public C16115b clearDescription() {
            m23743e();
            ((zfd) this.f89756b).clearDescription();
            return this;
        }

        public C16115b clearName() {
            m23743e();
            ((zfd) this.f89756b).clearName();
            return this;
        }

        public C16115b clearType() {
            m23743e();
            ((zfd) this.f89756b).clearType();
            return this;
        }

        @Override // p000.jgd
        public String getDescription() {
            return ((zfd) this.f89756b).getDescription();
        }

        @Override // p000.jgd
        public vj1 getDescriptionBytes() {
            return ((zfd) this.f89756b).getDescriptionBytes();
        }

        @Override // p000.jgd
        public String getName() {
            return ((zfd) this.f89756b).getName();
        }

        @Override // p000.jgd
        public vj1 getNameBytes() {
            return ((zfd) this.f89756b).getNameBytes();
        }

        @Override // p000.jgd
        public EnumC16116c getType() {
            return ((zfd) this.f89756b).getType();
        }

        @Override // p000.jgd
        public int getTypeValue() {
            return ((zfd) this.f89756b).getTypeValue();
        }

        public C16115b setDescription(String str) {
            m23743e();
            ((zfd) this.f89756b).setDescription(str);
            return this;
        }

        public C16115b setDescriptionBytes(vj1 vj1Var) {
            m23743e();
            ((zfd) this.f89756b).setDescriptionBytes(vj1Var);
            return this;
        }

        public C16115b setName(String str) {
            m23743e();
            ((zfd) this.f89756b).setName(str);
            return this;
        }

        public C16115b setNameBytes(vj1 vj1Var) {
            m23743e();
            ((zfd) this.f89756b).setNameBytes(vj1Var);
            return this;
        }

        public C16115b setType(EnumC16116c enumC16116c) {
            m23743e();
            ((zfd) this.f89756b).setType(enumC16116c);
            return this;
        }

        public C16115b setTypeValue(int i) {
            m23743e();
            ((zfd) this.f89756b).setTypeValue(i);
            return this;
        }

        private C16115b() {
            super(zfd.DEFAULT_INSTANCE);
        }
    }

    /* JADX INFO: renamed from: zfd$c */
    public enum EnumC16116c implements w98.InterfaceC14497d {
        UNSPECIFIED(0),
        INT64(1),
        BOOL(2),
        STRING(3),
        DOUBLE(4),
        UNRECOGNIZED(-1);


        /* JADX INFO: renamed from: C */
        public static final int f105008C = 0;

        /* JADX INFO: renamed from: F */
        public static final int f105009F = 1;

        /* JADX INFO: renamed from: H */
        public static final int f105010H = 2;

        /* JADX INFO: renamed from: L */
        public static final int f105011L = 3;

        /* JADX INFO: renamed from: M */
        public static final int f105012M = 4;

        /* JADX INFO: renamed from: N */
        public static final w98.InterfaceC14498e<EnumC16116c> f105013N = new a();

        /* JADX INFO: renamed from: a */
        public final int f105021a;

        /* JADX INFO: renamed from: zfd$c$a */
        public class a implements w98.InterfaceC14498e<EnumC16116c> {
            @Override // p000.w98.InterfaceC14498e
            public EnumC16116c findValueByNumber(int i) {
                return EnumC16116c.forNumber(i);
            }
        }

        /* JADX INFO: renamed from: zfd$c$b */
        public static final class b implements w98.InterfaceC14499f {

            /* JADX INFO: renamed from: a */
            public static final w98.InterfaceC14499f f105022a = new b();

            private b() {
            }

            @Override // p000.w98.InterfaceC14499f
            public boolean isInRange(int i) {
                return EnumC16116c.forNumber(i) != null;
            }
        }

        EnumC16116c(int i) {
            this.f105021a = i;
        }

        public static EnumC16116c forNumber(int i) {
            if (i == 0) {
                return UNSPECIFIED;
            }
            if (i == 1) {
                return INT64;
            }
            if (i == 2) {
                return BOOL;
            }
            if (i == 3) {
                return STRING;
            }
            if (i != 4) {
                return null;
            }
            return DOUBLE;
        }

        public static w98.InterfaceC14498e<EnumC16116c> internalGetValueMap() {
            return f105013N;
        }

        public static w98.InterfaceC14499f internalGetVerifier() {
            return b.f105022a;
        }

        @Override // p000.w98.InterfaceC14497d
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.f105021a;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static EnumC16116c valueOf(int i) {
            return forNumber(i);
        }
    }

    static {
        zfd zfdVar = new zfd();
        DEFAULT_INSTANCE = zfdVar;
        v27.m23715h0(zfd.class, zfdVar);
    }

    private zfd() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDescription() {
        this.description_ = getDefaultInstance().getDescription();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = 0;
    }

    public static zfd getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C16115b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    public static zfd parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (zfd) v27.m23700S(DEFAULT_INSTANCE, inputStream);
    }

    public static zfd parseFrom(ByteBuffer byteBuffer) throws ce8 {
        return (zfd) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static uhc<zfd> parser() {
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
    public void setType(EnumC16116c enumC16116c) {
        this.type_ = enumC16116c.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeValue(int i) {
        this.type_ = i;
    }

    @Override // p000.jgd
    public String getDescription() {
        return this.description_;
    }

    @Override // p000.jgd
    public vj1 getDescriptionBytes() {
        return vj1.copyFromUtf8(this.description_);
    }

    @Override // p000.jgd
    public String getName() {
        return this.name_;
    }

    @Override // p000.jgd
    public vj1 getNameBytes() {
        return vj1.copyFromUtf8(this.name_);
    }

    @Override // p000.jgd
    public EnumC16116c getType() {
        EnumC16116c enumC16116cForNumber = EnumC16116c.forNumber(this.type_);
        return enumC16116cForNumber == null ? EnumC16116c.UNRECOGNIZED : enumC16116cForNumber;
    }

    @Override // p000.jgd
    public int getTypeValue() {
        return this.type_;
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
        C16114a c16114a = null;
        switch (C16114a.f105007a[enumC13830i.ordinal()]) {
            case 1:
                return new zfd();
            case 2:
                return new C16115b(c16114a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003Ȉ", new Object[]{"name_", "type_", "description_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<zfd> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (zfd.class) {
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

    public static C16115b newBuilder(zfd zfdVar) {
        return DEFAULT_INSTANCE.m23739o(zfdVar);
    }

    public static zfd parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (zfd) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static zfd parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
        return (zfd) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
    }

    public static zfd parseFrom(vj1 vj1Var) throws ce8 {
        return (zfd) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
    }

    public static zfd parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
        return (zfd) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
    }

    public static zfd parseFrom(byte[] bArr) throws ce8 {
        return (zfd) v27.m23710c0(DEFAULT_INSTANCE, bArr);
    }

    public static zfd parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
        return (zfd) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
    }

    public static zfd parseFrom(InputStream inputStream) throws IOException {
        return (zfd) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
    }

    public static zfd parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (zfd) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static zfd parseFrom(f72 f72Var) throws IOException {
        return (zfd) v27.m23704W(DEFAULT_INSTANCE, f72Var);
    }

    public static zfd parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
        return (zfd) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
    }
}
