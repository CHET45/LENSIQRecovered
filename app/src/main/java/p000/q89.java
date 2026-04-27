package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import p000.v27;
import p000.w98;

/* JADX INFO: loaded from: classes5.dex */
public final class q89 extends v27<q89, C11369b> implements r89 {
    public static final int COLLECTION_IDS_FIELD_NUMBER = 1;
    private static final q89 DEFAULT_INSTANCE;
    public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
    private static volatile uhc<q89> PARSER;
    private w98.InterfaceC14504k<String> collectionIds_ = v27.m23722x();
    private String nextPageToken_ = "";

    /* JADX INFO: renamed from: q89$a */
    public static /* synthetic */ class C11368a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f73579a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f73579a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f73579a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f73579a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f73579a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f73579a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f73579a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f73579a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: q89$b */
    public static final class C11369b extends v27.AbstractC13823b<q89, C11369b> implements r89 {
        public /* synthetic */ C11369b(C11368a c11368a) {
            this();
        }

        public C11369b addAllCollectionIds(Iterable<String> iterable) {
            m23743e();
            ((q89) this.f89756b).addAllCollectionIds(iterable);
            return this;
        }

        public C11369b addCollectionIds(String str) {
            m23743e();
            ((q89) this.f89756b).addCollectionIds(str);
            return this;
        }

        public C11369b addCollectionIdsBytes(vj1 vj1Var) {
            m23743e();
            ((q89) this.f89756b).addCollectionIdsBytes(vj1Var);
            return this;
        }

        public C11369b clearCollectionIds() {
            m23743e();
            ((q89) this.f89756b).clearCollectionIds();
            return this;
        }

        public C11369b clearNextPageToken() {
            m23743e();
            ((q89) this.f89756b).clearNextPageToken();
            return this;
        }

        @Override // p000.r89
        public String getCollectionIds(int i) {
            return ((q89) this.f89756b).getCollectionIds(i);
        }

        @Override // p000.r89
        public vj1 getCollectionIdsBytes(int i) {
            return ((q89) this.f89756b).getCollectionIdsBytes(i);
        }

        @Override // p000.r89
        public int getCollectionIdsCount() {
            return ((q89) this.f89756b).getCollectionIdsCount();
        }

        @Override // p000.r89
        public List<String> getCollectionIdsList() {
            return Collections.unmodifiableList(((q89) this.f89756b).getCollectionIdsList());
        }

        @Override // p000.r89
        public String getNextPageToken() {
            return ((q89) this.f89756b).getNextPageToken();
        }

        @Override // p000.r89
        public vj1 getNextPageTokenBytes() {
            return ((q89) this.f89756b).getNextPageTokenBytes();
        }

        public C11369b setCollectionIds(int i, String str) {
            m23743e();
            ((q89) this.f89756b).setCollectionIds(i, str);
            return this;
        }

        public C11369b setNextPageToken(String str) {
            m23743e();
            ((q89) this.f89756b).setNextPageToken(str);
            return this;
        }

        public C11369b setNextPageTokenBytes(vj1 vj1Var) {
            m23743e();
            ((q89) this.f89756b).setNextPageTokenBytes(vj1Var);
            return this;
        }

        private C11369b() {
            super(q89.DEFAULT_INSTANCE);
        }
    }

    static {
        q89 q89Var = new q89();
        DEFAULT_INSTANCE = q89Var;
        v27.m23715h0(q89.class, q89Var);
    }

    private q89() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllCollectionIds(Iterable<String> iterable) {
        ensureCollectionIdsIsMutable();
        AbstractC1714b3.m2856b(iterable, this.collectionIds_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCollectionIds(String str) {
        str.getClass();
        ensureCollectionIdsIsMutable();
        this.collectionIds_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCollectionIdsBytes(vj1 vj1Var) {
        AbstractC1714b3.m2857c(vj1Var);
        ensureCollectionIdsIsMutable();
        this.collectionIds_.add(vj1Var.toStringUtf8());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCollectionIds() {
        this.collectionIds_ = v27.m23722x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNextPageToken() {
        this.nextPageToken_ = getDefaultInstance().getNextPageToken();
    }

    private void ensureCollectionIdsIsMutable() {
        w98.InterfaceC14504k<String> interfaceC14504k = this.collectionIds_;
        if (interfaceC14504k.isModifiable()) {
            return;
        }
        this.collectionIds_ = v27.m23698P(interfaceC14504k);
    }

    public static q89 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C11369b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    public static q89 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (q89) v27.m23700S(DEFAULT_INSTANCE, inputStream);
    }

    public static q89 parseFrom(ByteBuffer byteBuffer) throws ce8 {
        return (q89) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static uhc<q89> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCollectionIds(int i, String str) {
        str.getClass();
        ensureCollectionIdsIsMutable();
        this.collectionIds_.set(i, str);
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

    @Override // p000.r89
    public String getCollectionIds(int i) {
        return this.collectionIds_.get(i);
    }

    @Override // p000.r89
    public vj1 getCollectionIdsBytes(int i) {
        return vj1.copyFromUtf8(this.collectionIds_.get(i));
    }

    @Override // p000.r89
    public int getCollectionIdsCount() {
        return this.collectionIds_.size();
    }

    @Override // p000.r89
    public List<String> getCollectionIdsList() {
        return this.collectionIds_;
    }

    @Override // p000.r89
    public String getNextPageToken() {
        return this.nextPageToken_;
    }

    @Override // p000.r89
    public vj1 getNextPageTokenBytes() {
        return vj1.copyFromUtf8(this.nextPageToken_);
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
        C11368a c11368a = null;
        switch (C11368a.f73579a[enumC13830i.ordinal()]) {
            case 1:
                return new q89();
            case 2:
                return new C11369b(c11368a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ț\u0002Ȉ", new Object[]{"collectionIds_", "nextPageToken_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<q89> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (q89.class) {
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

    public static C11369b newBuilder(q89 q89Var) {
        return DEFAULT_INSTANCE.m23739o(q89Var);
    }

    public static q89 parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (q89) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static q89 parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
        return (q89) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
    }

    public static q89 parseFrom(vj1 vj1Var) throws ce8 {
        return (q89) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
    }

    public static q89 parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
        return (q89) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
    }

    public static q89 parseFrom(byte[] bArr) throws ce8 {
        return (q89) v27.m23710c0(DEFAULT_INSTANCE, bArr);
    }

    public static q89 parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
        return (q89) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
    }

    public static q89 parseFrom(InputStream inputStream) throws IOException {
        return (q89) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
    }

    public static q89 parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (q89) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static q89 parseFrom(f72 f72Var) throws IOException {
        return (q89) v27.m23704W(DEFAULT_INSTANCE, f72Var);
    }

    public static q89 parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
        return (q89) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
    }
}
