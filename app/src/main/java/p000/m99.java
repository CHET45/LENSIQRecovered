package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import p000.v27;
import p000.w98;
import p000.y5c;

/* JADX INFO: loaded from: classes5.dex */
public final class m99 extends v27<m99, C9226b> implements n99 {
    private static final m99 DEFAULT_INSTANCE;
    public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
    public static final int OPERATIONS_FIELD_NUMBER = 1;
    private static volatile uhc<m99> PARSER;
    private w98.InterfaceC14504k<y5c> operations_ = v27.m23722x();
    private String nextPageToken_ = "";

    /* JADX INFO: renamed from: m99$a */
    public static /* synthetic */ class C9225a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f60285a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f60285a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f60285a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f60285a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f60285a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f60285a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f60285a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f60285a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: m99$b */
    public static final class C9226b extends v27.AbstractC13823b<m99, C9226b> implements n99 {
        public /* synthetic */ C9226b(C9225a c9225a) {
            this();
        }

        public C9226b addAllOperations(Iterable<? extends y5c> iterable) {
            m23743e();
            ((m99) this.f89756b).addAllOperations(iterable);
            return this;
        }

        public C9226b addOperations(y5c y5cVar) {
            m23743e();
            ((m99) this.f89756b).addOperations(y5cVar);
            return this;
        }

        public C9226b clearNextPageToken() {
            m23743e();
            ((m99) this.f89756b).clearNextPageToken();
            return this;
        }

        public C9226b clearOperations() {
            m23743e();
            ((m99) this.f89756b).clearOperations();
            return this;
        }

        @Override // p000.n99
        public String getNextPageToken() {
            return ((m99) this.f89756b).getNextPageToken();
        }

        @Override // p000.n99
        public vj1 getNextPageTokenBytes() {
            return ((m99) this.f89756b).getNextPageTokenBytes();
        }

        @Override // p000.n99
        public y5c getOperations(int i) {
            return ((m99) this.f89756b).getOperations(i);
        }

        @Override // p000.n99
        public int getOperationsCount() {
            return ((m99) this.f89756b).getOperationsCount();
        }

        @Override // p000.n99
        public List<y5c> getOperationsList() {
            return Collections.unmodifiableList(((m99) this.f89756b).getOperationsList());
        }

        public C9226b removeOperations(int i) {
            m23743e();
            ((m99) this.f89756b).removeOperations(i);
            return this;
        }

        public C9226b setNextPageToken(String str) {
            m23743e();
            ((m99) this.f89756b).setNextPageToken(str);
            return this;
        }

        public C9226b setNextPageTokenBytes(vj1 vj1Var) {
            m23743e();
            ((m99) this.f89756b).setNextPageTokenBytes(vj1Var);
            return this;
        }

        public C9226b setOperations(int i, y5c y5cVar) {
            m23743e();
            ((m99) this.f89756b).setOperations(i, y5cVar);
            return this;
        }

        private C9226b() {
            super(m99.DEFAULT_INSTANCE);
        }

        public C9226b addOperations(int i, y5c y5cVar) {
            m23743e();
            ((m99) this.f89756b).addOperations(i, y5cVar);
            return this;
        }

        public C9226b setOperations(int i, y5c.C15494b c15494b) {
            m23743e();
            ((m99) this.f89756b).setOperations(i, c15494b.build());
            return this;
        }

        public C9226b addOperations(y5c.C15494b c15494b) {
            m23743e();
            ((m99) this.f89756b).addOperations(c15494b.build());
            return this;
        }

        public C9226b addOperations(int i, y5c.C15494b c15494b) {
            m23743e();
            ((m99) this.f89756b).addOperations(i, c15494b.build());
            return this;
        }
    }

    static {
        m99 m99Var = new m99();
        DEFAULT_INSTANCE = m99Var;
        v27.m23715h0(m99.class, m99Var);
    }

    private m99() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllOperations(Iterable<? extends y5c> iterable) {
        ensureOperationsIsMutable();
        AbstractC1714b3.m2856b(iterable, this.operations_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOperations(y5c y5cVar) {
        y5cVar.getClass();
        ensureOperationsIsMutable();
        this.operations_.add(y5cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNextPageToken() {
        this.nextPageToken_ = getDefaultInstance().getNextPageToken();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOperations() {
        this.operations_ = v27.m23722x();
    }

    private void ensureOperationsIsMutable() {
        w98.InterfaceC14504k<y5c> interfaceC14504k = this.operations_;
        if (interfaceC14504k.isModifiable()) {
            return;
        }
        this.operations_ = v27.m23698P(interfaceC14504k);
    }

    public static m99 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C9226b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    public static m99 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (m99) v27.m23700S(DEFAULT_INSTANCE, inputStream);
    }

    public static m99 parseFrom(ByteBuffer byteBuffer) throws ce8 {
        return (m99) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static uhc<m99> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeOperations(int i) {
        ensureOperationsIsMutable();
        this.operations_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNextPageToken(String str) {
        str.getClass();
        this.nextPageToken_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNextPageTokenBytes(vj1 vj1Var) {
        AbstractC1714b3.m2857c(vj1Var);
        this.nextPageToken_ = vj1Var.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOperations(int i, y5c y5cVar) {
        y5cVar.getClass();
        ensureOperationsIsMutable();
        this.operations_.set(i, y5cVar);
    }

    @Override // p000.n99
    public String getNextPageToken() {
        return this.nextPageToken_;
    }

    @Override // p000.n99
    public vj1 getNextPageTokenBytes() {
        return vj1.copyFromUtf8(this.nextPageToken_);
    }

    @Override // p000.n99
    public y5c getOperations(int i) {
        return this.operations_.get(i);
    }

    @Override // p000.n99
    public int getOperationsCount() {
        return this.operations_.size();
    }

    @Override // p000.n99
    public List<y5c> getOperationsList() {
        return this.operations_;
    }

    public h6c getOperationsOrBuilder(int i) {
        return this.operations_.get(i);
    }

    public List<? extends h6c> getOperationsOrBuilderList() {
        return this.operations_;
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
        C9225a c9225a = null;
        switch (C9225a.f60285a[enumC13830i.ordinal()]) {
            case 1:
                return new m99();
            case 2:
                return new C9226b(c9225a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002Ȉ", new Object[]{"operations_", y5c.class, "nextPageToken_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<m99> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (m99.class) {
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

    public static C9226b newBuilder(m99 m99Var) {
        return DEFAULT_INSTANCE.m23739o(m99Var);
    }

    public static m99 parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (m99) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static m99 parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
        return (m99) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
    }

    public static m99 parseFrom(vj1 vj1Var) throws ce8 {
        return (m99) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOperations(int i, y5c y5cVar) {
        y5cVar.getClass();
        ensureOperationsIsMutable();
        this.operations_.add(i, y5cVar);
    }

    public static m99 parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
        return (m99) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
    }

    public static m99 parseFrom(byte[] bArr) throws ce8 {
        return (m99) v27.m23710c0(DEFAULT_INSTANCE, bArr);
    }

    public static m99 parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
        return (m99) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
    }

    public static m99 parseFrom(InputStream inputStream) throws IOException {
        return (m99) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
    }

    public static m99 parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (m99) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static m99 parseFrom(f72 f72Var) throws IOException {
        return (m99) v27.m23704W(DEFAULT_INSTANCE, f72Var);
    }

    public static m99 parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
        return (m99) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
    }
}
