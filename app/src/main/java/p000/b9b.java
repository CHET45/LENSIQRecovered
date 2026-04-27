package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p000.f2h;
import p000.sh1;
import p000.v27;

/* JADX INFO: loaded from: classes5.dex */
public final class b9b extends v27<b9b, C1792b> implements d9b {
    public static final int BUNDLED_QUERY_FIELD_NUMBER = 2;
    private static final b9b DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile uhc<b9b> PARSER = null;
    public static final int READ_TIME_FIELD_NUMBER = 3;
    private int bitField0_;
    private sh1 bundledQuery_;
    private String name_ = "";
    private f2h readTime_;

    /* JADX INFO: renamed from: b9b$a */
    public static /* synthetic */ class C1791a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f13073a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f13073a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13073a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13073a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f13073a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f13073a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f13073a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f13073a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: b9b$b */
    public static final class C1792b extends v27.AbstractC13823b<b9b, C1792b> implements d9b {
        public /* synthetic */ C1792b(C1791a c1791a) {
            this();
        }

        public C1792b clearBundledQuery() {
            m23743e();
            ((b9b) this.f89756b).clearBundledQuery();
            return this;
        }

        public C1792b clearName() {
            m23743e();
            ((b9b) this.f89756b).clearName();
            return this;
        }

        public C1792b clearReadTime() {
            m23743e();
            ((b9b) this.f89756b).clearReadTime();
            return this;
        }

        @Override // p000.d9b
        public sh1 getBundledQuery() {
            return ((b9b) this.f89756b).getBundledQuery();
        }

        @Override // p000.d9b
        public String getName() {
            return ((b9b) this.f89756b).getName();
        }

        @Override // p000.d9b
        public vj1 getNameBytes() {
            return ((b9b) this.f89756b).getNameBytes();
        }

        @Override // p000.d9b
        public f2h getReadTime() {
            return ((b9b) this.f89756b).getReadTime();
        }

        @Override // p000.d9b
        public boolean hasBundledQuery() {
            return ((b9b) this.f89756b).hasBundledQuery();
        }

        @Override // p000.d9b
        public boolean hasReadTime() {
            return ((b9b) this.f89756b).hasReadTime();
        }

        public C1792b mergeBundledQuery(sh1 sh1Var) {
            m23743e();
            ((b9b) this.f89756b).mergeBundledQuery(sh1Var);
            return this;
        }

        public C1792b mergeReadTime(f2h f2hVar) {
            m23743e();
            ((b9b) this.f89756b).mergeReadTime(f2hVar);
            return this;
        }

        public C1792b setBundledQuery(sh1 sh1Var) {
            m23743e();
            ((b9b) this.f89756b).setBundledQuery(sh1Var);
            return this;
        }

        public C1792b setName(String str) {
            m23743e();
            ((b9b) this.f89756b).setName(str);
            return this;
        }

        public C1792b setNameBytes(vj1 vj1Var) {
            m23743e();
            ((b9b) this.f89756b).setNameBytes(vj1Var);
            return this;
        }

        public C1792b setReadTime(f2h f2hVar) {
            m23743e();
            ((b9b) this.f89756b).setReadTime(f2hVar);
            return this;
        }

        private C1792b() {
            super(b9b.DEFAULT_INSTANCE);
        }

        public C1792b setBundledQuery(sh1.C12574b c12574b) {
            m23743e();
            ((b9b) this.f89756b).setBundledQuery(c12574b.build());
            return this;
        }

        public C1792b setReadTime(f2h.C5567b c5567b) {
            m23743e();
            ((b9b) this.f89756b).setReadTime(c5567b.build());
            return this;
        }
    }

    static {
        b9b b9bVar = new b9b();
        DEFAULT_INSTANCE = b9bVar;
        v27.m23715h0(b9b.class, b9bVar);
    }

    private b9b() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBundledQuery() {
        this.bundledQuery_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReadTime() {
        this.readTime_ = null;
        this.bitField0_ &= -3;
    }

    public static b9b getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBundledQuery(sh1 sh1Var) {
        sh1Var.getClass();
        sh1 sh1Var2 = this.bundledQuery_;
        if (sh1Var2 == null || sh1Var2 == sh1.getDefaultInstance()) {
            this.bundledQuery_ = sh1Var;
        } else {
            this.bundledQuery_ = sh1.newBuilder(this.bundledQuery_).mergeFrom(sh1Var).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeReadTime(f2h f2hVar) {
        f2hVar.getClass();
        f2h f2hVar2 = this.readTime_;
        if (f2hVar2 == null || f2hVar2 == f2h.getDefaultInstance()) {
            this.readTime_ = f2hVar;
        } else {
            this.readTime_ = f2h.newBuilder(this.readTime_).mergeFrom(f2hVar).buildPartial();
        }
        this.bitField0_ |= 2;
    }

    public static C1792b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    public static b9b parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (b9b) v27.m23700S(DEFAULT_INSTANCE, inputStream);
    }

    public static b9b parseFrom(ByteBuffer byteBuffer) throws ce8 {
        return (b9b) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static uhc<b9b> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBundledQuery(sh1 sh1Var) {
        sh1Var.getClass();
        this.bundledQuery_ = sh1Var;
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
        this.readTime_ = f2hVar;
        this.bitField0_ |= 2;
    }

    @Override // p000.d9b
    public sh1 getBundledQuery() {
        sh1 sh1Var = this.bundledQuery_;
        return sh1Var == null ? sh1.getDefaultInstance() : sh1Var;
    }

    @Override // p000.d9b
    public String getName() {
        return this.name_;
    }

    @Override // p000.d9b
    public vj1 getNameBytes() {
        return vj1.copyFromUtf8(this.name_);
    }

    @Override // p000.d9b
    public f2h getReadTime() {
        f2h f2hVar = this.readTime_;
        return f2hVar == null ? f2h.getDefaultInstance() : f2hVar;
    }

    @Override // p000.d9b
    public boolean hasBundledQuery() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // p000.d9b
    public boolean hasReadTime() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
        C1791a c1791a = null;
        switch (C1791a.f13073a[enumC13830i.ordinal()]) {
            case 1:
                return new b9b();
            case 2:
                return new C1792b(c1791a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"bitField0_", "name_", "bundledQuery_", "readTime_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<b9b> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (b9b.class) {
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

    public static C1792b newBuilder(b9b b9bVar) {
        return DEFAULT_INSTANCE.m23739o(b9bVar);
    }

    public static b9b parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (b9b) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static b9b parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
        return (b9b) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
    }

    public static b9b parseFrom(vj1 vj1Var) throws ce8 {
        return (b9b) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
    }

    public static b9b parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
        return (b9b) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
    }

    public static b9b parseFrom(byte[] bArr) throws ce8 {
        return (b9b) v27.m23710c0(DEFAULT_INSTANCE, bArr);
    }

    public static b9b parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
        return (b9b) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
    }

    public static b9b parseFrom(InputStream inputStream) throws IOException {
        return (b9b) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
    }

    public static b9b parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (b9b) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static b9b parseFrom(f72 f72Var) throws IOException {
        return (b9b) v27.m23704W(DEFAULT_INSTANCE, f72Var);
    }

    public static b9b parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
        return (b9b) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
    }
}
