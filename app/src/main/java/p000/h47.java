package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p000.di4;
import p000.f2h;
import p000.v27;

/* JADX INFO: loaded from: classes5.dex */
public final class h47 extends v27<h47, C6703b> implements i47 {
    private static final h47 DEFAULT_INSTANCE;
    public static final int MASK_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile uhc<h47> PARSER = null;
    public static final int READ_TIME_FIELD_NUMBER = 5;
    public static final int TRANSACTION_FIELD_NUMBER = 3;
    private int bitField0_;
    private Object consistencySelector_;
    private di4 mask_;
    private int consistencySelectorCase_ = 0;
    private String name_ = "";

    /* JADX INFO: renamed from: h47$a */
    public static /* synthetic */ class C6702a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f42311a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f42311a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f42311a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f42311a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f42311a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f42311a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f42311a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f42311a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: h47$b */
    public static final class C6703b extends v27.AbstractC13823b<h47, C6703b> implements i47 {
        public /* synthetic */ C6703b(C6702a c6702a) {
            this();
        }

        public C6703b clearConsistencySelector() {
            m23743e();
            ((h47) this.f89756b).clearConsistencySelector();
            return this;
        }

        public C6703b clearMask() {
            m23743e();
            ((h47) this.f89756b).clearMask();
            return this;
        }

        public C6703b clearName() {
            m23743e();
            ((h47) this.f89756b).clearName();
            return this;
        }

        public C6703b clearReadTime() {
            m23743e();
            ((h47) this.f89756b).clearReadTime();
            return this;
        }

        public C6703b clearTransaction() {
            m23743e();
            ((h47) this.f89756b).clearTransaction();
            return this;
        }

        @Override // p000.i47
        public EnumC6704c getConsistencySelectorCase() {
            return ((h47) this.f89756b).getConsistencySelectorCase();
        }

        @Override // p000.i47
        public di4 getMask() {
            return ((h47) this.f89756b).getMask();
        }

        @Override // p000.i47
        public String getName() {
            return ((h47) this.f89756b).getName();
        }

        @Override // p000.i47
        public vj1 getNameBytes() {
            return ((h47) this.f89756b).getNameBytes();
        }

        @Override // p000.i47
        public f2h getReadTime() {
            return ((h47) this.f89756b).getReadTime();
        }

        @Override // p000.i47
        public vj1 getTransaction() {
            return ((h47) this.f89756b).getTransaction();
        }

        @Override // p000.i47
        public boolean hasMask() {
            return ((h47) this.f89756b).hasMask();
        }

        @Override // p000.i47
        public boolean hasReadTime() {
            return ((h47) this.f89756b).hasReadTime();
        }

        @Override // p000.i47
        public boolean hasTransaction() {
            return ((h47) this.f89756b).hasTransaction();
        }

        public C6703b mergeMask(di4 di4Var) {
            m23743e();
            ((h47) this.f89756b).mergeMask(di4Var);
            return this;
        }

        public C6703b mergeReadTime(f2h f2hVar) {
            m23743e();
            ((h47) this.f89756b).mergeReadTime(f2hVar);
            return this;
        }

        public C6703b setMask(di4 di4Var) {
            m23743e();
            ((h47) this.f89756b).setMask(di4Var);
            return this;
        }

        public C6703b setName(String str) {
            m23743e();
            ((h47) this.f89756b).setName(str);
            return this;
        }

        public C6703b setNameBytes(vj1 vj1Var) {
            m23743e();
            ((h47) this.f89756b).setNameBytes(vj1Var);
            return this;
        }

        public C6703b setReadTime(f2h f2hVar) {
            m23743e();
            ((h47) this.f89756b).setReadTime(f2hVar);
            return this;
        }

        public C6703b setTransaction(vj1 vj1Var) {
            m23743e();
            ((h47) this.f89756b).setTransaction(vj1Var);
            return this;
        }

        private C6703b() {
            super(h47.DEFAULT_INSTANCE);
        }

        public C6703b setMask(di4.C4792b c4792b) {
            m23743e();
            ((h47) this.f89756b).setMask(c4792b.build());
            return this;
        }

        public C6703b setReadTime(f2h.C5567b c5567b) {
            m23743e();
            ((h47) this.f89756b).setReadTime(c5567b.build());
            return this;
        }
    }

    /* JADX INFO: renamed from: h47$c */
    public enum EnumC6704c {
        TRANSACTION(3),
        READ_TIME(5),
        CONSISTENCYSELECTOR_NOT_SET(0);


        /* JADX INFO: renamed from: a */
        public final int f42316a;

        EnumC6704c(int i) {
            this.f42316a = i;
        }

        public static EnumC6704c forNumber(int i) {
            if (i == 0) {
                return CONSISTENCYSELECTOR_NOT_SET;
            }
            if (i == 3) {
                return TRANSACTION;
            }
            if (i != 5) {
                return null;
            }
            return READ_TIME;
        }

        public int getNumber() {
            return this.f42316a;
        }

        @Deprecated
        public static EnumC6704c valueOf(int i) {
            return forNumber(i);
        }
    }

    static {
        h47 h47Var = new h47();
        DEFAULT_INSTANCE = h47Var;
        v27.m23715h0(h47.class, h47Var);
    }

    private h47() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConsistencySelector() {
        this.consistencySelectorCase_ = 0;
        this.consistencySelector_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMask() {
        this.mask_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReadTime() {
        if (this.consistencySelectorCase_ == 5) {
            this.consistencySelectorCase_ = 0;
            this.consistencySelector_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTransaction() {
        if (this.consistencySelectorCase_ == 3) {
            this.consistencySelectorCase_ = 0;
            this.consistencySelector_ = null;
        }
    }

    public static h47 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMask(di4 di4Var) {
        di4Var.getClass();
        di4 di4Var2 = this.mask_;
        if (di4Var2 == null || di4Var2 == di4.getDefaultInstance()) {
            this.mask_ = di4Var;
        } else {
            this.mask_ = di4.newBuilder(this.mask_).mergeFrom(di4Var).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeReadTime(f2h f2hVar) {
        f2hVar.getClass();
        if (this.consistencySelectorCase_ != 5 || this.consistencySelector_ == f2h.getDefaultInstance()) {
            this.consistencySelector_ = f2hVar;
        } else {
            this.consistencySelector_ = f2h.newBuilder((f2h) this.consistencySelector_).mergeFrom(f2hVar).buildPartial();
        }
        this.consistencySelectorCase_ = 5;
    }

    public static C6703b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    public static h47 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (h47) v27.m23700S(DEFAULT_INSTANCE, inputStream);
    }

    public static h47 parseFrom(ByteBuffer byteBuffer) throws ce8 {
        return (h47) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static uhc<h47> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMask(di4 di4Var) {
        di4Var.getClass();
        this.mask_ = di4Var;
        this.bitField0_ |= 1;
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
    public void setReadTime(f2h f2hVar) {
        f2hVar.getClass();
        this.consistencySelector_ = f2hVar;
        this.consistencySelectorCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTransaction(vj1 vj1Var) {
        vj1Var.getClass();
        this.consistencySelectorCase_ = 3;
        this.consistencySelector_ = vj1Var;
    }

    @Override // p000.i47
    public EnumC6704c getConsistencySelectorCase() {
        return EnumC6704c.forNumber(this.consistencySelectorCase_);
    }

    @Override // p000.i47
    public di4 getMask() {
        di4 di4Var = this.mask_;
        return di4Var == null ? di4.getDefaultInstance() : di4Var;
    }

    @Override // p000.i47
    public String getName() {
        return this.name_;
    }

    @Override // p000.i47
    public vj1 getNameBytes() {
        return vj1.copyFromUtf8(this.name_);
    }

    @Override // p000.i47
    public f2h getReadTime() {
        return this.consistencySelectorCase_ == 5 ? (f2h) this.consistencySelector_ : f2h.getDefaultInstance();
    }

    @Override // p000.i47
    public vj1 getTransaction() {
        return this.consistencySelectorCase_ == 3 ? (vj1) this.consistencySelector_ : vj1.f91344e;
    }

    @Override // p000.i47
    public boolean hasMask() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // p000.i47
    public boolean hasReadTime() {
        return this.consistencySelectorCase_ == 5;
    }

    @Override // p000.i47
    public boolean hasTransaction() {
        return this.consistencySelectorCase_ == 3;
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
        C6702a c6702a = null;
        switch (C6702a.f42311a[enumC13830i.ordinal()]) {
            case 1:
                return new h47();
            case 2:
                return new C6703b(c6702a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003=\u0000\u0005<\u0000", new Object[]{"consistencySelector_", "consistencySelectorCase_", "bitField0_", "name_", "mask_", f2h.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<h47> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (h47.class) {
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

    public static C6703b newBuilder(h47 h47Var) {
        return DEFAULT_INSTANCE.m23739o(h47Var);
    }

    public static h47 parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (h47) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static h47 parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
        return (h47) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
    }

    public static h47 parseFrom(vj1 vj1Var) throws ce8 {
        return (h47) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
    }

    public static h47 parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
        return (h47) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
    }

    public static h47 parseFrom(byte[] bArr) throws ce8 {
        return (h47) v27.m23710c0(DEFAULT_INSTANCE, bArr);
    }

    public static h47 parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
        return (h47) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
    }

    public static h47 parseFrom(InputStream inputStream) throws IOException {
        return (h47) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
    }

    public static h47 parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (h47) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static h47 parseFrom(f72 f72Var) throws IOException {
        return (h47) v27.m23704W(DEFAULT_INSTANCE, f72Var);
    }

    public static h47 parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
        return (h47) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
    }
}
