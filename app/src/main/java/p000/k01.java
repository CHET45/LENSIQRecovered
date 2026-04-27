package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p000.idh;
import p000.v27;

/* JADX INFO: loaded from: classes5.dex */
public final class k01 extends v27<k01, C8152b> implements l01 {
    public static final int DATABASE_FIELD_NUMBER = 1;
    private static final k01 DEFAULT_INSTANCE;
    public static final int OPTIONS_FIELD_NUMBER = 2;
    private static volatile uhc<k01> PARSER;
    private int bitField0_;
    private String database_ = "";
    private idh options_;

    /* JADX INFO: renamed from: k01$a */
    public static /* synthetic */ class C8151a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f52313a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f52313a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f52313a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f52313a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f52313a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f52313a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f52313a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f52313a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: k01$b */
    public static final class C8152b extends v27.AbstractC13823b<k01, C8152b> implements l01 {
        public /* synthetic */ C8152b(C8151a c8151a) {
            this();
        }

        public C8152b clearDatabase() {
            m23743e();
            ((k01) this.f89756b).clearDatabase();
            return this;
        }

        public C8152b clearOptions() {
            m23743e();
            ((k01) this.f89756b).clearOptions();
            return this;
        }

        @Override // p000.l01
        public String getDatabase() {
            return ((k01) this.f89756b).getDatabase();
        }

        @Override // p000.l01
        public vj1 getDatabaseBytes() {
            return ((k01) this.f89756b).getDatabaseBytes();
        }

        @Override // p000.l01
        public idh getOptions() {
            return ((k01) this.f89756b).getOptions();
        }

        @Override // p000.l01
        public boolean hasOptions() {
            return ((k01) this.f89756b).hasOptions();
        }

        public C8152b mergeOptions(idh idhVar) {
            m23743e();
            ((k01) this.f89756b).mergeOptions(idhVar);
            return this;
        }

        public C8152b setDatabase(String str) {
            m23743e();
            ((k01) this.f89756b).setDatabase(str);
            return this;
        }

        public C8152b setDatabaseBytes(vj1 vj1Var) {
            m23743e();
            ((k01) this.f89756b).setDatabaseBytes(vj1Var);
            return this;
        }

        public C8152b setOptions(idh idhVar) {
            m23743e();
            ((k01) this.f89756b).setOptions(idhVar);
            return this;
        }

        private C8152b() {
            super(k01.DEFAULT_INSTANCE);
        }

        public C8152b setOptions(idh.C7241b c7241b) {
            m23743e();
            ((k01) this.f89756b).setOptions(c7241b.build());
            return this;
        }
    }

    static {
        k01 k01Var = new k01();
        DEFAULT_INSTANCE = k01Var;
        v27.m23715h0(k01.class, k01Var);
    }

    private k01() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDatabase() {
        this.database_ = getDefaultInstance().getDatabase();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOptions() {
        this.options_ = null;
        this.bitField0_ &= -2;
    }

    public static k01 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeOptions(idh idhVar) {
        idhVar.getClass();
        idh idhVar2 = this.options_;
        if (idhVar2 == null || idhVar2 == idh.getDefaultInstance()) {
            this.options_ = idhVar;
        } else {
            this.options_ = idh.newBuilder(this.options_).mergeFrom(idhVar).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static C8152b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    public static k01 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (k01) v27.m23700S(DEFAULT_INSTANCE, inputStream);
    }

    public static k01 parseFrom(ByteBuffer byteBuffer) throws ce8 {
        return (k01) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static uhc<k01> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDatabase(String str) {
        str.getClass();
        this.database_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDatabaseBytes(vj1 vj1Var) {
        AbstractC1714b3.m2857c(vj1Var);
        this.database_ = vj1Var.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOptions(idh idhVar) {
        idhVar.getClass();
        this.options_ = idhVar;
        this.bitField0_ |= 1;
    }

    @Override // p000.l01
    public String getDatabase() {
        return this.database_;
    }

    @Override // p000.l01
    public vj1 getDatabaseBytes() {
        return vj1.copyFromUtf8(this.database_);
    }

    @Override // p000.l01
    public idh getOptions() {
        idh idhVar = this.options_;
        return idhVar == null ? idh.getDefaultInstance() : idhVar;
    }

    @Override // p000.l01
    public boolean hasOptions() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
        C8151a c8151a = null;
        switch (C8151a.f52313a[enumC13830i.ordinal()]) {
            case 1:
                return new k01();
            case 2:
                return new C8152b(c8151a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"bitField0_", "database_", "options_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<k01> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (k01.class) {
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

    public static C8152b newBuilder(k01 k01Var) {
        return DEFAULT_INSTANCE.m23739o(k01Var);
    }

    public static k01 parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (k01) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static k01 parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
        return (k01) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
    }

    public static k01 parseFrom(vj1 vj1Var) throws ce8 {
        return (k01) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
    }

    public static k01 parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
        return (k01) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
    }

    public static k01 parseFrom(byte[] bArr) throws ce8 {
        return (k01) v27.m23710c0(DEFAULT_INSTANCE, bArr);
    }

    public static k01 parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
        return (k01) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
    }

    public static k01 parseFrom(InputStream inputStream) throws IOException {
        return (k01) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
    }

    public static k01 parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (k01) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static k01 parseFrom(f72 f72Var) throws IOException {
        return (k01) v27.m23704W(DEFAULT_INSTANCE, f72Var);
    }

    public static k01 parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
        return (k01) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
    }
}
