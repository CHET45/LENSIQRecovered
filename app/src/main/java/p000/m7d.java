package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p000.f2h;
import p000.v27;

/* JADX INFO: loaded from: classes5.dex */
public final class m7d extends v27<m7d, C9214b> implements r7d {
    private static final m7d DEFAULT_INSTANCE;
    public static final int EXISTS_FIELD_NUMBER = 1;
    private static volatile uhc<m7d> PARSER = null;
    public static final int UPDATE_TIME_FIELD_NUMBER = 2;
    private int conditionTypeCase_ = 0;
    private Object conditionType_;

    /* JADX INFO: renamed from: m7d$a */
    public static /* synthetic */ class C9213a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f60158a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f60158a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f60158a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f60158a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f60158a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f60158a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f60158a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f60158a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: m7d$b */
    public static final class C9214b extends v27.AbstractC13823b<m7d, C9214b> implements r7d {
        public /* synthetic */ C9214b(C9213a c9213a) {
            this();
        }

        public C9214b clearConditionType() {
            m23743e();
            ((m7d) this.f89756b).clearConditionType();
            return this;
        }

        public C9214b clearExists() {
            m23743e();
            ((m7d) this.f89756b).clearExists();
            return this;
        }

        public C9214b clearUpdateTime() {
            m23743e();
            ((m7d) this.f89756b).clearUpdateTime();
            return this;
        }

        @Override // p000.r7d
        public EnumC9215c getConditionTypeCase() {
            return ((m7d) this.f89756b).getConditionTypeCase();
        }

        @Override // p000.r7d
        public boolean getExists() {
            return ((m7d) this.f89756b).getExists();
        }

        @Override // p000.r7d
        public f2h getUpdateTime() {
            return ((m7d) this.f89756b).getUpdateTime();
        }

        @Override // p000.r7d
        public boolean hasExists() {
            return ((m7d) this.f89756b).hasExists();
        }

        @Override // p000.r7d
        public boolean hasUpdateTime() {
            return ((m7d) this.f89756b).hasUpdateTime();
        }

        public C9214b mergeUpdateTime(f2h f2hVar) {
            m23743e();
            ((m7d) this.f89756b).mergeUpdateTime(f2hVar);
            return this;
        }

        public C9214b setExists(boolean z) {
            m23743e();
            ((m7d) this.f89756b).setExists(z);
            return this;
        }

        public C9214b setUpdateTime(f2h f2hVar) {
            m23743e();
            ((m7d) this.f89756b).setUpdateTime(f2hVar);
            return this;
        }

        private C9214b() {
            super(m7d.DEFAULT_INSTANCE);
        }

        public C9214b setUpdateTime(f2h.C5567b c5567b) {
            m23743e();
            ((m7d) this.f89756b).setUpdateTime(c5567b.build());
            return this;
        }
    }

    /* JADX INFO: renamed from: m7d$c */
    public enum EnumC9215c {
        EXISTS(1),
        UPDATE_TIME(2),
        CONDITIONTYPE_NOT_SET(0);


        /* JADX INFO: renamed from: a */
        public final int f60163a;

        EnumC9215c(int i) {
            this.f60163a = i;
        }

        public static EnumC9215c forNumber(int i) {
            if (i == 0) {
                return CONDITIONTYPE_NOT_SET;
            }
            if (i == 1) {
                return EXISTS;
            }
            if (i != 2) {
                return null;
            }
            return UPDATE_TIME;
        }

        public int getNumber() {
            return this.f60163a;
        }

        @Deprecated
        public static EnumC9215c valueOf(int i) {
            return forNumber(i);
        }
    }

    static {
        m7d m7dVar = new m7d();
        DEFAULT_INSTANCE = m7dVar;
        v27.m23715h0(m7d.class, m7dVar);
    }

    private m7d() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConditionType() {
        this.conditionTypeCase_ = 0;
        this.conditionType_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExists() {
        if (this.conditionTypeCase_ == 1) {
            this.conditionTypeCase_ = 0;
            this.conditionType_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUpdateTime() {
        if (this.conditionTypeCase_ == 2) {
            this.conditionTypeCase_ = 0;
            this.conditionType_ = null;
        }
    }

    public static m7d getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUpdateTime(f2h f2hVar) {
        f2hVar.getClass();
        if (this.conditionTypeCase_ != 2 || this.conditionType_ == f2h.getDefaultInstance()) {
            this.conditionType_ = f2hVar;
        } else {
            this.conditionType_ = f2h.newBuilder((f2h) this.conditionType_).mergeFrom(f2hVar).buildPartial();
        }
        this.conditionTypeCase_ = 2;
    }

    public static C9214b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    public static m7d parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (m7d) v27.m23700S(DEFAULT_INSTANCE, inputStream);
    }

    public static m7d parseFrom(ByteBuffer byteBuffer) throws ce8 {
        return (m7d) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static uhc<m7d> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExists(boolean z) {
        this.conditionTypeCase_ = 1;
        this.conditionType_ = Boolean.valueOf(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUpdateTime(f2h f2hVar) {
        f2hVar.getClass();
        this.conditionType_ = f2hVar;
        this.conditionTypeCase_ = 2;
    }

    @Override // p000.r7d
    public EnumC9215c getConditionTypeCase() {
        return EnumC9215c.forNumber(this.conditionTypeCase_);
    }

    @Override // p000.r7d
    public boolean getExists() {
        if (this.conditionTypeCase_ == 1) {
            return ((Boolean) this.conditionType_).booleanValue();
        }
        return false;
    }

    @Override // p000.r7d
    public f2h getUpdateTime() {
        return this.conditionTypeCase_ == 2 ? (f2h) this.conditionType_ : f2h.getDefaultInstance();
    }

    @Override // p000.r7d
    public boolean hasExists() {
        return this.conditionTypeCase_ == 1;
    }

    @Override // p000.r7d
    public boolean hasUpdateTime() {
        return this.conditionTypeCase_ == 2;
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
        C9213a c9213a = null;
        switch (C9213a.f60158a[enumC13830i.ordinal()]) {
            case 1:
                return new m7d();
            case 2:
                return new C9214b(c9213a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001:\u0000\u0002<\u0000", new Object[]{"conditionType_", "conditionTypeCase_", f2h.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<m7d> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (m7d.class) {
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

    public static C9214b newBuilder(m7d m7dVar) {
        return DEFAULT_INSTANCE.m23739o(m7dVar);
    }

    public static m7d parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (m7d) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static m7d parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
        return (m7d) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
    }

    public static m7d parseFrom(vj1 vj1Var) throws ce8 {
        return (m7d) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
    }

    public static m7d parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
        return (m7d) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
    }

    public static m7d parseFrom(byte[] bArr) throws ce8 {
        return (m7d) v27.m23710c0(DEFAULT_INSTANCE, bArr);
    }

    public static m7d parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
        return (m7d) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
    }

    public static m7d parseFrom(InputStream inputStream) throws IOException {
        return (m7d) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
    }

    public static m7d parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (m7d) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static m7d parseFrom(f72 f72Var) throws IOException {
        return (m7d) v27.m23704W(DEFAULT_INSTANCE, f72Var);
    }

    public static m7d parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
        return (m7d) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
    }
}
