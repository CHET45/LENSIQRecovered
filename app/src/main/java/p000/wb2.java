package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import p000.v27;
import p000.w98;
import p000.yri;

/* JADX INFO: loaded from: classes5.dex */
public final class wb2 extends v27<wb2, C14542b> implements xb2 {
    public static final int DATABASE_FIELD_NUMBER = 1;
    private static final wb2 DEFAULT_INSTANCE;
    private static volatile uhc<wb2> PARSER = null;
    public static final int TRANSACTION_FIELD_NUMBER = 3;
    public static final int WRITES_FIELD_NUMBER = 2;
    private String database_ = "";
    private w98.InterfaceC14504k<yri> writes_ = v27.m23722x();
    private vj1 transaction_ = vj1.f91344e;

    /* JADX INFO: renamed from: wb2$a */
    public static /* synthetic */ class C14541a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f93870a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f93870a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f93870a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f93870a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f93870a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f93870a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f93870a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f93870a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: wb2$b */
    public static final class C14542b extends v27.AbstractC13823b<wb2, C14542b> implements xb2 {
        public /* synthetic */ C14542b(C14541a c14541a) {
            this();
        }

        public C14542b addAllWrites(Iterable<? extends yri> iterable) {
            m23743e();
            ((wb2) this.f89756b).addAllWrites(iterable);
            return this;
        }

        public C14542b addWrites(yri yriVar) {
            m23743e();
            ((wb2) this.f89756b).addWrites(yriVar);
            return this;
        }

        public C14542b clearDatabase() {
            m23743e();
            ((wb2) this.f89756b).clearDatabase();
            return this;
        }

        public C14542b clearTransaction() {
            m23743e();
            ((wb2) this.f89756b).clearTransaction();
            return this;
        }

        public C14542b clearWrites() {
            m23743e();
            ((wb2) this.f89756b).clearWrites();
            return this;
        }

        @Override // p000.xb2
        public String getDatabase() {
            return ((wb2) this.f89756b).getDatabase();
        }

        @Override // p000.xb2
        public vj1 getDatabaseBytes() {
            return ((wb2) this.f89756b).getDatabaseBytes();
        }

        @Override // p000.xb2
        public vj1 getTransaction() {
            return ((wb2) this.f89756b).getTransaction();
        }

        @Override // p000.xb2
        public yri getWrites(int i) {
            return ((wb2) this.f89756b).getWrites(i);
        }

        @Override // p000.xb2
        public int getWritesCount() {
            return ((wb2) this.f89756b).getWritesCount();
        }

        @Override // p000.xb2
        public List<yri> getWritesList() {
            return Collections.unmodifiableList(((wb2) this.f89756b).getWritesList());
        }

        public C14542b removeWrites(int i) {
            m23743e();
            ((wb2) this.f89756b).removeWrites(i);
            return this;
        }

        public C14542b setDatabase(String str) {
            m23743e();
            ((wb2) this.f89756b).setDatabase(str);
            return this;
        }

        public C14542b setDatabaseBytes(vj1 vj1Var) {
            m23743e();
            ((wb2) this.f89756b).setDatabaseBytes(vj1Var);
            return this;
        }

        public C14542b setTransaction(vj1 vj1Var) {
            m23743e();
            ((wb2) this.f89756b).setTransaction(vj1Var);
            return this;
        }

        public C14542b setWrites(int i, yri yriVar) {
            m23743e();
            ((wb2) this.f89756b).setWrites(i, yriVar);
            return this;
        }

        private C14542b() {
            super(wb2.DEFAULT_INSTANCE);
        }

        public C14542b addWrites(int i, yri yriVar) {
            m23743e();
            ((wb2) this.f89756b).addWrites(i, yriVar);
            return this;
        }

        public C14542b setWrites(int i, yri.C15790b c15790b) {
            m23743e();
            ((wb2) this.f89756b).setWrites(i, c15790b.build());
            return this;
        }

        public C14542b addWrites(yri.C15790b c15790b) {
            m23743e();
            ((wb2) this.f89756b).addWrites(c15790b.build());
            return this;
        }

        public C14542b addWrites(int i, yri.C15790b c15790b) {
            m23743e();
            ((wb2) this.f89756b).addWrites(i, c15790b.build());
            return this;
        }
    }

    static {
        wb2 wb2Var = new wb2();
        DEFAULT_INSTANCE = wb2Var;
        v27.m23715h0(wb2.class, wb2Var);
    }

    private wb2() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllWrites(Iterable<? extends yri> iterable) {
        ensureWritesIsMutable();
        AbstractC1714b3.m2856b(iterable, this.writes_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addWrites(yri yriVar) {
        yriVar.getClass();
        ensureWritesIsMutable();
        this.writes_.add(yriVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDatabase() {
        this.database_ = getDefaultInstance().getDatabase();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTransaction() {
        this.transaction_ = getDefaultInstance().getTransaction();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWrites() {
        this.writes_ = v27.m23722x();
    }

    private void ensureWritesIsMutable() {
        w98.InterfaceC14504k<yri> interfaceC14504k = this.writes_;
        if (interfaceC14504k.isModifiable()) {
            return;
        }
        this.writes_ = v27.m23698P(interfaceC14504k);
    }

    public static wb2 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C14542b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    public static wb2 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (wb2) v27.m23700S(DEFAULT_INSTANCE, inputStream);
    }

    public static wb2 parseFrom(ByteBuffer byteBuffer) throws ce8 {
        return (wb2) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static uhc<wb2> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeWrites(int i) {
        ensureWritesIsMutable();
        this.writes_.remove(i);
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
    public void setTransaction(vj1 vj1Var) {
        vj1Var.getClass();
        this.transaction_ = vj1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWrites(int i, yri yriVar) {
        yriVar.getClass();
        ensureWritesIsMutable();
        this.writes_.set(i, yriVar);
    }

    @Override // p000.xb2
    public String getDatabase() {
        return this.database_;
    }

    @Override // p000.xb2
    public vj1 getDatabaseBytes() {
        return vj1.copyFromUtf8(this.database_);
    }

    @Override // p000.xb2
    public vj1 getTransaction() {
        return this.transaction_;
    }

    @Override // p000.xb2
    public yri getWrites(int i) {
        return this.writes_.get(i);
    }

    @Override // p000.xb2
    public int getWritesCount() {
        return this.writes_.size();
    }

    @Override // p000.xb2
    public List<yri> getWritesList() {
        return this.writes_;
    }

    public esi getWritesOrBuilder(int i) {
        return this.writes_.get(i);
    }

    public List<? extends esi> getWritesOrBuilderList() {
        return this.writes_;
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
        C14541a c14541a = null;
        switch (C14541a.f93870a[enumC13830i.ordinal()]) {
            case 1:
                return new wb2();
            case 2:
                return new C14542b(c14541a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002\u001b\u0003\n", new Object[]{"database_", "writes_", yri.class, "transaction_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<wb2> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (wb2.class) {
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

    public static C14542b newBuilder(wb2 wb2Var) {
        return DEFAULT_INSTANCE.m23739o(wb2Var);
    }

    public static wb2 parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (wb2) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static wb2 parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
        return (wb2) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
    }

    public static wb2 parseFrom(vj1 vj1Var) throws ce8 {
        return (wb2) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addWrites(int i, yri yriVar) {
        yriVar.getClass();
        ensureWritesIsMutable();
        this.writes_.add(i, yriVar);
    }

    public static wb2 parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
        return (wb2) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
    }

    public static wb2 parseFrom(byte[] bArr) throws ce8 {
        return (wb2) v27.m23710c0(DEFAULT_INSTANCE, bArr);
    }

    public static wb2 parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
        return (wb2) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
    }

    public static wb2 parseFrom(InputStream inputStream) throws IOException {
        return (wb2) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
    }

    public static wb2 parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (wb2) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static wb2 parseFrom(f72 f72Var) throws IOException {
        return (wb2) v27.m23704W(DEFAULT_INSTANCE, f72Var);
    }

    public static wb2 parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
        return (wb2) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
    }
}
