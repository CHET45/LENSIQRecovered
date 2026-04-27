package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p000.abg;
import p000.v27;
import p000.w98;

/* JADX INFO: loaded from: classes5.dex */
public final class sh1 extends v27<sh1, C12574b> implements uh1 {
    private static final sh1 DEFAULT_INSTANCE;
    public static final int LIMIT_TYPE_FIELD_NUMBER = 3;
    public static final int PARENT_FIELD_NUMBER = 1;
    private static volatile uhc<sh1> PARSER = null;
    public static final int STRUCTURED_QUERY_FIELD_NUMBER = 2;
    private int limitType_;
    private Object queryType_;
    private int queryTypeCase_ = 0;
    private String parent_ = "";

    /* JADX INFO: renamed from: sh1$a */
    public static /* synthetic */ class C12573a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f81749a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f81749a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f81749a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f81749a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f81749a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f81749a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f81749a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f81749a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: sh1$b */
    public static final class C12574b extends v27.AbstractC13823b<sh1, C12574b> implements uh1 {
        public /* synthetic */ C12574b(C12573a c12573a) {
            this();
        }

        public C12574b clearLimitType() {
            m23743e();
            ((sh1) this.f89756b).clearLimitType();
            return this;
        }

        public C12574b clearParent() {
            m23743e();
            ((sh1) this.f89756b).clearParent();
            return this;
        }

        public C12574b clearQueryType() {
            m23743e();
            ((sh1) this.f89756b).clearQueryType();
            return this;
        }

        public C12574b clearStructuredQuery() {
            m23743e();
            ((sh1) this.f89756b).clearStructuredQuery();
            return this;
        }

        @Override // p000.uh1
        public EnumC12575c getLimitType() {
            return ((sh1) this.f89756b).getLimitType();
        }

        @Override // p000.uh1
        public int getLimitTypeValue() {
            return ((sh1) this.f89756b).getLimitTypeValue();
        }

        @Override // p000.uh1
        public String getParent() {
            return ((sh1) this.f89756b).getParent();
        }

        @Override // p000.uh1
        public vj1 getParentBytes() {
            return ((sh1) this.f89756b).getParentBytes();
        }

        @Override // p000.uh1
        public EnumC12576d getQueryTypeCase() {
            return ((sh1) this.f89756b).getQueryTypeCase();
        }

        @Override // p000.uh1
        public abg getStructuredQuery() {
            return ((sh1) this.f89756b).getStructuredQuery();
        }

        @Override // p000.uh1
        public boolean hasStructuredQuery() {
            return ((sh1) this.f89756b).hasStructuredQuery();
        }

        public C12574b mergeStructuredQuery(abg abgVar) {
            m23743e();
            ((sh1) this.f89756b).mergeStructuredQuery(abgVar);
            return this;
        }

        public C12574b setLimitType(EnumC12575c enumC12575c) {
            m23743e();
            ((sh1) this.f89756b).setLimitType(enumC12575c);
            return this;
        }

        public C12574b setLimitTypeValue(int i) {
            m23743e();
            ((sh1) this.f89756b).setLimitTypeValue(i);
            return this;
        }

        public C12574b setParent(String str) {
            m23743e();
            ((sh1) this.f89756b).setParent(str);
            return this;
        }

        public C12574b setParentBytes(vj1 vj1Var) {
            m23743e();
            ((sh1) this.f89756b).setParentBytes(vj1Var);
            return this;
        }

        public C12574b setStructuredQuery(abg abgVar) {
            m23743e();
            ((sh1) this.f89756b).setStructuredQuery(abgVar);
            return this;
        }

        private C12574b() {
            super(sh1.DEFAULT_INSTANCE);
        }

        public C12574b setStructuredQuery(abg.C0153b c0153b) {
            m23743e();
            ((sh1) this.f89756b).setStructuredQuery(c0153b.build());
            return this;
        }
    }

    /* JADX INFO: renamed from: sh1$c */
    public enum EnumC12575c implements w98.InterfaceC14497d {
        FIRST(0),
        LAST(1),
        UNRECOGNIZED(-1);


        /* JADX INFO: renamed from: e */
        public static final int f81754e = 0;

        /* JADX INFO: renamed from: f */
        public static final int f81755f = 1;

        /* JADX INFO: renamed from: m */
        public static final w98.InterfaceC14498e<EnumC12575c> f81756m = new a();

        /* JADX INFO: renamed from: a */
        public final int f81757a;

        /* JADX INFO: renamed from: sh1$c$a */
        public class a implements w98.InterfaceC14498e<EnumC12575c> {
            @Override // p000.w98.InterfaceC14498e
            public EnumC12575c findValueByNumber(int i) {
                return EnumC12575c.forNumber(i);
            }
        }

        /* JADX INFO: renamed from: sh1$c$b */
        public static final class b implements w98.InterfaceC14499f {

            /* JADX INFO: renamed from: a */
            public static final w98.InterfaceC14499f f81758a = new b();

            private b() {
            }

            @Override // p000.w98.InterfaceC14499f
            public boolean isInRange(int i) {
                return EnumC12575c.forNumber(i) != null;
            }
        }

        EnumC12575c(int i) {
            this.f81757a = i;
        }

        public static EnumC12575c forNumber(int i) {
            if (i == 0) {
                return FIRST;
            }
            if (i != 1) {
                return null;
            }
            return LAST;
        }

        public static w98.InterfaceC14498e<EnumC12575c> internalGetValueMap() {
            return f81756m;
        }

        public static w98.InterfaceC14499f internalGetVerifier() {
            return b.f81758a;
        }

        @Override // p000.w98.InterfaceC14497d
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.f81757a;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static EnumC12575c valueOf(int i) {
            return forNumber(i);
        }
    }

    /* JADX INFO: renamed from: sh1$d */
    public enum EnumC12576d {
        STRUCTURED_QUERY(2),
        QUERYTYPE_NOT_SET(0);


        /* JADX INFO: renamed from: a */
        public final int f81762a;

        EnumC12576d(int i) {
            this.f81762a = i;
        }

        public static EnumC12576d forNumber(int i) {
            if (i == 0) {
                return QUERYTYPE_NOT_SET;
            }
            if (i != 2) {
                return null;
            }
            return STRUCTURED_QUERY;
        }

        public int getNumber() {
            return this.f81762a;
        }

        @Deprecated
        public static EnumC12576d valueOf(int i) {
            return forNumber(i);
        }
    }

    static {
        sh1 sh1Var = new sh1();
        DEFAULT_INSTANCE = sh1Var;
        v27.m23715h0(sh1.class, sh1Var);
    }

    private sh1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLimitType() {
        this.limitType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParent() {
        this.parent_ = getDefaultInstance().getParent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearQueryType() {
        this.queryTypeCase_ = 0;
        this.queryType_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStructuredQuery() {
        if (this.queryTypeCase_ == 2) {
            this.queryTypeCase_ = 0;
            this.queryType_ = null;
        }
    }

    public static sh1 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeStructuredQuery(abg abgVar) {
        abgVar.getClass();
        if (this.queryTypeCase_ != 2 || this.queryType_ == abg.getDefaultInstance()) {
            this.queryType_ = abgVar;
        } else {
            this.queryType_ = abg.newBuilder((abg) this.queryType_).mergeFrom(abgVar).buildPartial();
        }
        this.queryTypeCase_ = 2;
    }

    public static C12574b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    public static sh1 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (sh1) v27.m23700S(DEFAULT_INSTANCE, inputStream);
    }

    public static sh1 parseFrom(ByteBuffer byteBuffer) throws ce8 {
        return (sh1) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static uhc<sh1> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLimitType(EnumC12575c enumC12575c) {
        this.limitType_ = enumC12575c.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLimitTypeValue(int i) {
        this.limitType_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParent(String str) {
        str.getClass();
        this.parent_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParentBytes(vj1 vj1Var) {
        AbstractC1714b3.m2857c(vj1Var);
        this.parent_ = vj1Var.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStructuredQuery(abg abgVar) {
        abgVar.getClass();
        this.queryType_ = abgVar;
        this.queryTypeCase_ = 2;
    }

    @Override // p000.uh1
    public EnumC12575c getLimitType() {
        EnumC12575c enumC12575cForNumber = EnumC12575c.forNumber(this.limitType_);
        return enumC12575cForNumber == null ? EnumC12575c.UNRECOGNIZED : enumC12575cForNumber;
    }

    @Override // p000.uh1
    public int getLimitTypeValue() {
        return this.limitType_;
    }

    @Override // p000.uh1
    public String getParent() {
        return this.parent_;
    }

    @Override // p000.uh1
    public vj1 getParentBytes() {
        return vj1.copyFromUtf8(this.parent_);
    }

    @Override // p000.uh1
    public EnumC12576d getQueryTypeCase() {
        return EnumC12576d.forNumber(this.queryTypeCase_);
    }

    @Override // p000.uh1
    public abg getStructuredQuery() {
        return this.queryTypeCase_ == 2 ? (abg) this.queryType_ : abg.getDefaultInstance();
    }

    @Override // p000.uh1
    public boolean hasStructuredQuery() {
        return this.queryTypeCase_ == 2;
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
        C12573a c12573a = null;
        switch (C12573a.f81749a[enumC13830i.ordinal()]) {
            case 1:
                return new sh1();
            case 2:
                return new C12574b(c12573a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002<\u0000\u0003\f", new Object[]{"queryType_", "queryTypeCase_", "parent_", abg.class, "limitType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<sh1> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (sh1.class) {
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

    public static C12574b newBuilder(sh1 sh1Var) {
        return DEFAULT_INSTANCE.m23739o(sh1Var);
    }

    public static sh1 parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (sh1) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static sh1 parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
        return (sh1) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
    }

    public static sh1 parseFrom(vj1 vj1Var) throws ce8 {
        return (sh1) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
    }

    public static sh1 parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
        return (sh1) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
    }

    public static sh1 parseFrom(byte[] bArr) throws ce8 {
        return (sh1) v27.m23710c0(DEFAULT_INSTANCE, bArr);
    }

    public static sh1 parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
        return (sh1) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
    }

    public static sh1 parseFrom(InputStream inputStream) throws IOException {
        return (sh1) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
    }

    public static sh1 parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (sh1) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static sh1 parseFrom(f72 f72Var) throws IOException {
        return (sh1) v27.m23704W(DEFAULT_INSTANCE, f72Var);
    }

    public static sh1 parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
        return (sh1) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
    }
}
