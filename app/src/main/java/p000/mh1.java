package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import p000.f2h;
import p000.v27;
import p000.w98;

/* JADX INFO: loaded from: classes5.dex */
public final class mh1 extends v27<mh1, C9352b> implements oh1 {
    private static final mh1 DEFAULT_INSTANCE;
    public static final int EXISTS_FIELD_NUMBER = 3;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile uhc<mh1> PARSER = null;
    public static final int QUERIES_FIELD_NUMBER = 4;
    public static final int READ_TIME_FIELD_NUMBER = 2;
    private int bitField0_;
    private boolean exists_;
    private String name_ = "";
    private w98.InterfaceC14504k<String> queries_ = v27.m23722x();
    private f2h readTime_;

    /* JADX INFO: renamed from: mh1$a */
    public static /* synthetic */ class C9351a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f60993a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f60993a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f60993a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f60993a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f60993a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f60993a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f60993a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f60993a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: mh1$b */
    public static final class C9352b extends v27.AbstractC13823b<mh1, C9352b> implements oh1 {
        public /* synthetic */ C9352b(C9351a c9351a) {
            this();
        }

        public C9352b addAllQueries(Iterable<String> iterable) {
            m23743e();
            ((mh1) this.f89756b).addAllQueries(iterable);
            return this;
        }

        public C9352b addQueries(String str) {
            m23743e();
            ((mh1) this.f89756b).addQueries(str);
            return this;
        }

        public C9352b addQueriesBytes(vj1 vj1Var) {
            m23743e();
            ((mh1) this.f89756b).addQueriesBytes(vj1Var);
            return this;
        }

        public C9352b clearExists() {
            m23743e();
            ((mh1) this.f89756b).clearExists();
            return this;
        }

        public C9352b clearName() {
            m23743e();
            ((mh1) this.f89756b).clearName();
            return this;
        }

        public C9352b clearQueries() {
            m23743e();
            ((mh1) this.f89756b).clearQueries();
            return this;
        }

        public C9352b clearReadTime() {
            m23743e();
            ((mh1) this.f89756b).clearReadTime();
            return this;
        }

        @Override // p000.oh1
        public boolean getExists() {
            return ((mh1) this.f89756b).getExists();
        }

        @Override // p000.oh1
        public String getName() {
            return ((mh1) this.f89756b).getName();
        }

        @Override // p000.oh1
        public vj1 getNameBytes() {
            return ((mh1) this.f89756b).getNameBytes();
        }

        @Override // p000.oh1
        public String getQueries(int i) {
            return ((mh1) this.f89756b).getQueries(i);
        }

        @Override // p000.oh1
        public vj1 getQueriesBytes(int i) {
            return ((mh1) this.f89756b).getQueriesBytes(i);
        }

        @Override // p000.oh1
        public int getQueriesCount() {
            return ((mh1) this.f89756b).getQueriesCount();
        }

        @Override // p000.oh1
        public List<String> getQueriesList() {
            return Collections.unmodifiableList(((mh1) this.f89756b).getQueriesList());
        }

        @Override // p000.oh1
        public f2h getReadTime() {
            return ((mh1) this.f89756b).getReadTime();
        }

        @Override // p000.oh1
        public boolean hasReadTime() {
            return ((mh1) this.f89756b).hasReadTime();
        }

        public C9352b mergeReadTime(f2h f2hVar) {
            m23743e();
            ((mh1) this.f89756b).mergeReadTime(f2hVar);
            return this;
        }

        public C9352b setExists(boolean z) {
            m23743e();
            ((mh1) this.f89756b).setExists(z);
            return this;
        }

        public C9352b setName(String str) {
            m23743e();
            ((mh1) this.f89756b).setName(str);
            return this;
        }

        public C9352b setNameBytes(vj1 vj1Var) {
            m23743e();
            ((mh1) this.f89756b).setNameBytes(vj1Var);
            return this;
        }

        public C9352b setQueries(int i, String str) {
            m23743e();
            ((mh1) this.f89756b).setQueries(i, str);
            return this;
        }

        public C9352b setReadTime(f2h f2hVar) {
            m23743e();
            ((mh1) this.f89756b).setReadTime(f2hVar);
            return this;
        }

        private C9352b() {
            super(mh1.DEFAULT_INSTANCE);
        }

        public C9352b setReadTime(f2h.C5567b c5567b) {
            m23743e();
            ((mh1) this.f89756b).setReadTime(c5567b.build());
            return this;
        }
    }

    static {
        mh1 mh1Var = new mh1();
        DEFAULT_INSTANCE = mh1Var;
        v27.m23715h0(mh1.class, mh1Var);
    }

    private mh1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllQueries(Iterable<String> iterable) {
        ensureQueriesIsMutable();
        AbstractC1714b3.m2856b(iterable, this.queries_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addQueries(String str) {
        str.getClass();
        ensureQueriesIsMutable();
        this.queries_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addQueriesBytes(vj1 vj1Var) {
        AbstractC1714b3.m2857c(vj1Var);
        ensureQueriesIsMutable();
        this.queries_.add(vj1Var.toStringUtf8());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExists() {
        this.exists_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearQueries() {
        this.queries_ = v27.m23722x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReadTime() {
        this.readTime_ = null;
        this.bitField0_ &= -2;
    }

    private void ensureQueriesIsMutable() {
        w98.InterfaceC14504k<String> interfaceC14504k = this.queries_;
        if (interfaceC14504k.isModifiable()) {
            return;
        }
        this.queries_ = v27.m23698P(interfaceC14504k);
    }

    public static mh1 getDefaultInstance() {
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

    public static C9352b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    public static mh1 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (mh1) v27.m23700S(DEFAULT_INSTANCE, inputStream);
    }

    public static mh1 parseFrom(ByteBuffer byteBuffer) throws ce8 {
        return (mh1) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static uhc<mh1> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExists(boolean z) {
        this.exists_ = z;
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
    public void setQueries(int i, String str) {
        str.getClass();
        ensureQueriesIsMutable();
        this.queries_.set(i, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReadTime(f2h f2hVar) {
        f2hVar.getClass();
        this.readTime_ = f2hVar;
        this.bitField0_ |= 1;
    }

    @Override // p000.oh1
    public boolean getExists() {
        return this.exists_;
    }

    @Override // p000.oh1
    public String getName() {
        return this.name_;
    }

    @Override // p000.oh1
    public vj1 getNameBytes() {
        return vj1.copyFromUtf8(this.name_);
    }

    @Override // p000.oh1
    public String getQueries(int i) {
        return this.queries_.get(i);
    }

    @Override // p000.oh1
    public vj1 getQueriesBytes(int i) {
        return vj1.copyFromUtf8(this.queries_.get(i));
    }

    @Override // p000.oh1
    public int getQueriesCount() {
        return this.queries_.size();
    }

    @Override // p000.oh1
    public List<String> getQueriesList() {
        return this.queries_;
    }

    @Override // p000.oh1
    public f2h getReadTime() {
        f2h f2hVar = this.readTime_;
        return f2hVar == null ? f2h.getDefaultInstance() : f2hVar;
    }

    @Override // p000.oh1
    public boolean hasReadTime() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
        C9351a c9351a = null;
        switch (C9351a.f60993a[enumC13830i.ordinal()]) {
            case 1:
                return new mh1();
            case 2:
                return new C9352b(c9351a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002ဉ\u0000\u0003\u0007\u0004Ț", new Object[]{"bitField0_", "name_", "readTime_", "exists_", "queries_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<mh1> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (mh1.class) {
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

    public static C9352b newBuilder(mh1 mh1Var) {
        return DEFAULT_INSTANCE.m23739o(mh1Var);
    }

    public static mh1 parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (mh1) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static mh1 parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
        return (mh1) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
    }

    public static mh1 parseFrom(vj1 vj1Var) throws ce8 {
        return (mh1) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
    }

    public static mh1 parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
        return (mh1) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
    }

    public static mh1 parseFrom(byte[] bArr) throws ce8 {
        return (mh1) v27.m23710c0(DEFAULT_INSTANCE, bArr);
    }

    public static mh1 parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
        return (mh1) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
    }

    public static mh1 parseFrom(InputStream inputStream) throws IOException {
        return (mh1) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
    }

    public static mh1 parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (mh1) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static mh1 parseFrom(f72 f72Var) throws IOException {
        return (mh1) v27.m23704W(DEFAULT_INSTANCE, f72Var);
    }

    public static mh1 parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
        return (mh1) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
    }
}
