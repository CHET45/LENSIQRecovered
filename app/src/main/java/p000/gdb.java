package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p000.f2h;
import p000.v27;

/* JADX INFO: loaded from: classes5.dex */
public final class gdb extends v27<gdb, C6261b> implements hdb {
    private static final gdb DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile uhc<gdb> PARSER = null;
    public static final int READ_TIME_FIELD_NUMBER = 2;
    private int bitField0_;
    private String name_ = "";
    private f2h readTime_;

    /* JADX INFO: renamed from: gdb$a */
    public static /* synthetic */ class C6260a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f39545a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f39545a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f39545a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f39545a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f39545a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f39545a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f39545a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f39545a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: gdb$b */
    public static final class C6261b extends v27.AbstractC13823b<gdb, C6261b> implements hdb {
        public /* synthetic */ C6261b(C6260a c6260a) {
            this();
        }

        public C6261b clearName() {
            m23743e();
            ((gdb) this.f89756b).clearName();
            return this;
        }

        public C6261b clearReadTime() {
            m23743e();
            ((gdb) this.f89756b).clearReadTime();
            return this;
        }

        @Override // p000.hdb
        public String getName() {
            return ((gdb) this.f89756b).getName();
        }

        @Override // p000.hdb
        public vj1 getNameBytes() {
            return ((gdb) this.f89756b).getNameBytes();
        }

        @Override // p000.hdb
        public f2h getReadTime() {
            return ((gdb) this.f89756b).getReadTime();
        }

        @Override // p000.hdb
        public boolean hasReadTime() {
            return ((gdb) this.f89756b).hasReadTime();
        }

        public C6261b mergeReadTime(f2h f2hVar) {
            m23743e();
            ((gdb) this.f89756b).mergeReadTime(f2hVar);
            return this;
        }

        public C6261b setName(String str) {
            m23743e();
            ((gdb) this.f89756b).setName(str);
            return this;
        }

        public C6261b setNameBytes(vj1 vj1Var) {
            m23743e();
            ((gdb) this.f89756b).setNameBytes(vj1Var);
            return this;
        }

        public C6261b setReadTime(f2h f2hVar) {
            m23743e();
            ((gdb) this.f89756b).setReadTime(f2hVar);
            return this;
        }

        private C6261b() {
            super(gdb.DEFAULT_INSTANCE);
        }

        public C6261b setReadTime(f2h.C5567b c5567b) {
            m23743e();
            ((gdb) this.f89756b).setReadTime(c5567b.build());
            return this;
        }
    }

    static {
        gdb gdbVar = new gdb();
        DEFAULT_INSTANCE = gdbVar;
        v27.m23715h0(gdb.class, gdbVar);
    }

    private gdb() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReadTime() {
        this.readTime_ = null;
        this.bitField0_ &= -2;
    }

    public static gdb getDefaultInstance() {
        return DEFAULT_INSTANCE;
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
        this.bitField0_ |= 1;
    }

    public static C6261b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    public static gdb parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (gdb) v27.m23700S(DEFAULT_INSTANCE, inputStream);
    }

    public static gdb parseFrom(ByteBuffer byteBuffer) throws ce8 {
        return (gdb) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static uhc<gdb> parser() {
        return DEFAULT_INSTANCE.getParserForType();
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
        this.bitField0_ |= 1;
    }

    @Override // p000.hdb
    public String getName() {
        return this.name_;
    }

    @Override // p000.hdb
    public vj1 getNameBytes() {
        return vj1.copyFromUtf8(this.name_);
    }

    @Override // p000.hdb
    public f2h getReadTime() {
        f2h f2hVar = this.readTime_;
        return f2hVar == null ? f2h.getDefaultInstance() : f2hVar;
    }

    @Override // p000.hdb
    public boolean hasReadTime() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
        C6260a c6260a = null;
        switch (C6260a.f39545a[enumC13830i.ordinal()]) {
            case 1:
                return new gdb();
            case 2:
                return new C6261b(c6260a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"bitField0_", "name_", "readTime_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<gdb> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (gdb.class) {
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

    public static C6261b newBuilder(gdb gdbVar) {
        return DEFAULT_INSTANCE.m23739o(gdbVar);
    }

    public static gdb parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (gdb) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static gdb parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
        return (gdb) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
    }

    public static gdb parseFrom(vj1 vj1Var) throws ce8 {
        return (gdb) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
    }

    public static gdb parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
        return (gdb) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
    }

    public static gdb parseFrom(byte[] bArr) throws ce8 {
        return (gdb) v27.m23710c0(DEFAULT_INSTANCE, bArr);
    }

    public static gdb parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
        return (gdb) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
    }

    public static gdb parseFrom(InputStream inputStream) throws IOException {
        return (gdb) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
    }

    public static gdb parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (gdb) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static gdb parseFrom(f72 f72Var) throws IOException {
        return (gdb) v27.m23704W(DEFAULT_INSTANCE, f72Var);
    }

    public static gdb parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
        return (gdb) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
    }
}
