package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p000.r81;
import p000.v27;

/* JADX INFO: loaded from: classes5.dex */
public final class o95 extends v27<o95, C10269b> implements q95 {
    public static final int COUNT_FIELD_NUMBER = 2;
    private static final o95 DEFAULT_INSTANCE;
    private static volatile uhc<o95> PARSER = null;
    public static final int TARGET_ID_FIELD_NUMBER = 1;
    public static final int UNCHANGED_NAMES_FIELD_NUMBER = 3;
    private int bitField0_;
    private int count_;
    private int targetId_;
    private r81 unchangedNames_;

    /* JADX INFO: renamed from: o95$a */
    public static /* synthetic */ class C10268a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f66907a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f66907a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f66907a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f66907a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f66907a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f66907a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f66907a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f66907a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: o95$b */
    public static final class C10269b extends v27.AbstractC13823b<o95, C10269b> implements q95 {
        public /* synthetic */ C10269b(C10268a c10268a) {
            this();
        }

        public C10269b clearCount() {
            m23743e();
            ((o95) this.f89756b).clearCount();
            return this;
        }

        public C10269b clearTargetId() {
            m23743e();
            ((o95) this.f89756b).clearTargetId();
            return this;
        }

        public C10269b clearUnchangedNames() {
            m23743e();
            ((o95) this.f89756b).clearUnchangedNames();
            return this;
        }

        @Override // p000.q95
        public int getCount() {
            return ((o95) this.f89756b).getCount();
        }

        @Override // p000.q95
        public int getTargetId() {
            return ((o95) this.f89756b).getTargetId();
        }

        @Override // p000.q95
        public r81 getUnchangedNames() {
            return ((o95) this.f89756b).getUnchangedNames();
        }

        @Override // p000.q95
        public boolean hasUnchangedNames() {
            return ((o95) this.f89756b).hasUnchangedNames();
        }

        public C10269b mergeUnchangedNames(r81 r81Var) {
            m23743e();
            ((o95) this.f89756b).mergeUnchangedNames(r81Var);
            return this;
        }

        public C10269b setCount(int i) {
            m23743e();
            ((o95) this.f89756b).setCount(i);
            return this;
        }

        public C10269b setTargetId(int i) {
            m23743e();
            ((o95) this.f89756b).setTargetId(i);
            return this;
        }

        public C10269b setUnchangedNames(r81 r81Var) {
            m23743e();
            ((o95) this.f89756b).setUnchangedNames(r81Var);
            return this;
        }

        private C10269b() {
            super(o95.DEFAULT_INSTANCE);
        }

        public C10269b setUnchangedNames(r81.C11940b c11940b) {
            m23743e();
            ((o95) this.f89756b).setUnchangedNames(c11940b.build());
            return this;
        }
    }

    static {
        o95 o95Var = new o95();
        DEFAULT_INSTANCE = o95Var;
        v27.m23715h0(o95.class, o95Var);
    }

    private o95() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCount() {
        this.count_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTargetId() {
        this.targetId_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUnchangedNames() {
        this.unchangedNames_ = null;
        this.bitField0_ &= -2;
    }

    public static o95 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUnchangedNames(r81 r81Var) {
        r81Var.getClass();
        r81 r81Var2 = this.unchangedNames_;
        if (r81Var2 == null || r81Var2 == r81.getDefaultInstance()) {
            this.unchangedNames_ = r81Var;
        } else {
            this.unchangedNames_ = r81.newBuilder(this.unchangedNames_).mergeFrom(r81Var).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static C10269b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    public static o95 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (o95) v27.m23700S(DEFAULT_INSTANCE, inputStream);
    }

    public static o95 parseFrom(ByteBuffer byteBuffer) throws ce8 {
        return (o95) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static uhc<o95> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCount(int i) {
        this.count_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTargetId(int i) {
        this.targetId_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUnchangedNames(r81 r81Var) {
        r81Var.getClass();
        this.unchangedNames_ = r81Var;
        this.bitField0_ |= 1;
    }

    @Override // p000.q95
    public int getCount() {
        return this.count_;
    }

    @Override // p000.q95
    public int getTargetId() {
        return this.targetId_;
    }

    @Override // p000.q95
    public r81 getUnchangedNames() {
        r81 r81Var = this.unchangedNames_;
        return r81Var == null ? r81.getDefaultInstance() : r81Var;
    }

    @Override // p000.q95
    public boolean hasUnchangedNames() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
        C10268a c10268a = null;
        switch (C10268a.f66907a[enumC13830i.ordinal()]) {
            case 1:
                return new o95();
            case 2:
                return new C10269b(c10268a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003ဉ\u0000", new Object[]{"bitField0_", "targetId_", "count_", "unchangedNames_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<o95> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (o95.class) {
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

    public static C10269b newBuilder(o95 o95Var) {
        return DEFAULT_INSTANCE.m23739o(o95Var);
    }

    public static o95 parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (o95) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static o95 parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
        return (o95) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
    }

    public static o95 parseFrom(vj1 vj1Var) throws ce8 {
        return (o95) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
    }

    public static o95 parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
        return (o95) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
    }

    public static o95 parseFrom(byte[] bArr) throws ce8 {
        return (o95) v27.m23710c0(DEFAULT_INSTANCE, bArr);
    }

    public static o95 parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
        return (o95) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
    }

    public static o95 parseFrom(InputStream inputStream) throws IOException {
        return (o95) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
    }

    public static o95 parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (o95) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static o95 parseFrom(f72 f72Var) throws IOException {
        return (o95) v27.m23704W(DEFAULT_INSTANCE, f72Var);
    }

    public static o95 parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
        return (o95) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
    }
}
