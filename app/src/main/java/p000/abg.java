package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import p000.b2i;
import p000.ga3;
import p000.t58;
import p000.v27;
import p000.w98;

/* JADX INFO: loaded from: classes5.dex */
public final class abg extends v27<abg, C0153b> implements bbg {
    private static final abg DEFAULT_INSTANCE;
    public static final int END_AT_FIELD_NUMBER = 8;
    public static final int FROM_FIELD_NUMBER = 2;
    public static final int LIMIT_FIELD_NUMBER = 5;
    public static final int OFFSET_FIELD_NUMBER = 6;
    public static final int ORDER_BY_FIELD_NUMBER = 4;
    private static volatile uhc<abg> PARSER = null;
    public static final int SELECT_FIELD_NUMBER = 1;
    public static final int START_AT_FIELD_NUMBER = 7;
    public static final int WHERE_FIELD_NUMBER = 3;
    private int bitField0_;
    private ga3 endAt_;
    private t58 limit_;
    private int offset_;
    private C0167p select_;
    private ga3 startAt_;
    private C0163l where_;
    private w98.InterfaceC14504k<C0154c> from_ = v27.m23722x();
    private w98.InterfaceC14504k<C0165n> orderBy_ = v27.m23722x();

    /* JADX INFO: renamed from: abg$a */
    public static /* synthetic */ class C0152a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f975a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f975a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f975a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f975a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f975a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f975a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f975a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f975a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: abg$b */
    public static final class C0153b extends v27.AbstractC13823b<abg, C0153b> implements bbg {
        public /* synthetic */ C0153b(C0152a c0152a) {
            this();
        }

        public C0153b addAllFrom(Iterable<? extends C0154c> iterable) {
            m23743e();
            ((abg) this.f89756b).addAllFrom(iterable);
            return this;
        }

        public C0153b addAllOrderBy(Iterable<? extends C0165n> iterable) {
            m23743e();
            ((abg) this.f89756b).addAllOrderBy(iterable);
            return this;
        }

        public C0153b addFrom(C0154c c0154c) {
            m23743e();
            ((abg) this.f89756b).addFrom(c0154c);
            return this;
        }

        public C0153b addOrderBy(C0165n c0165n) {
            m23743e();
            ((abg) this.f89756b).addOrderBy(c0165n);
            return this;
        }

        public C0153b clearEndAt() {
            m23743e();
            ((abg) this.f89756b).clearEndAt();
            return this;
        }

        public C0153b clearFrom() {
            m23743e();
            ((abg) this.f89756b).clearFrom();
            return this;
        }

        public C0153b clearLimit() {
            m23743e();
            ((abg) this.f89756b).clearLimit();
            return this;
        }

        public C0153b clearOffset() {
            m23743e();
            ((abg) this.f89756b).clearOffset();
            return this;
        }

        public C0153b clearOrderBy() {
            m23743e();
            ((abg) this.f89756b).clearOrderBy();
            return this;
        }

        public C0153b clearSelect() {
            m23743e();
            ((abg) this.f89756b).clearSelect();
            return this;
        }

        public C0153b clearStartAt() {
            m23743e();
            ((abg) this.f89756b).clearStartAt();
            return this;
        }

        public C0153b clearWhere() {
            m23743e();
            ((abg) this.f89756b).clearWhere();
            return this;
        }

        @Override // p000.bbg
        public ga3 getEndAt() {
            return ((abg) this.f89756b).getEndAt();
        }

        @Override // p000.bbg
        public C0154c getFrom(int i) {
            return ((abg) this.f89756b).getFrom(i);
        }

        @Override // p000.bbg
        public int getFromCount() {
            return ((abg) this.f89756b).getFromCount();
        }

        @Override // p000.bbg
        public List<C0154c> getFromList() {
            return Collections.unmodifiableList(((abg) this.f89756b).getFromList());
        }

        @Override // p000.bbg
        public t58 getLimit() {
            return ((abg) this.f89756b).getLimit();
        }

        @Override // p000.bbg
        public int getOffset() {
            return ((abg) this.f89756b).getOffset();
        }

        @Override // p000.bbg
        public C0165n getOrderBy(int i) {
            return ((abg) this.f89756b).getOrderBy(i);
        }

        @Override // p000.bbg
        public int getOrderByCount() {
            return ((abg) this.f89756b).getOrderByCount();
        }

        @Override // p000.bbg
        public List<C0165n> getOrderByList() {
            return Collections.unmodifiableList(((abg) this.f89756b).getOrderByList());
        }

        @Override // p000.bbg
        public C0167p getSelect() {
            return ((abg) this.f89756b).getSelect();
        }

        @Override // p000.bbg
        public ga3 getStartAt() {
            return ((abg) this.f89756b).getStartAt();
        }

        @Override // p000.bbg
        public C0163l getWhere() {
            return ((abg) this.f89756b).getWhere();
        }

        @Override // p000.bbg
        public boolean hasEndAt() {
            return ((abg) this.f89756b).hasEndAt();
        }

        @Override // p000.bbg
        public boolean hasLimit() {
            return ((abg) this.f89756b).hasLimit();
        }

        @Override // p000.bbg
        public boolean hasSelect() {
            return ((abg) this.f89756b).hasSelect();
        }

        @Override // p000.bbg
        public boolean hasStartAt() {
            return ((abg) this.f89756b).hasStartAt();
        }

        @Override // p000.bbg
        public boolean hasWhere() {
            return ((abg) this.f89756b).hasWhere();
        }

        public C0153b mergeEndAt(ga3 ga3Var) {
            m23743e();
            ((abg) this.f89756b).mergeEndAt(ga3Var);
            return this;
        }

        public C0153b mergeLimit(t58 t58Var) {
            m23743e();
            ((abg) this.f89756b).mergeLimit(t58Var);
            return this;
        }

        public C0153b mergeSelect(C0167p c0167p) {
            m23743e();
            ((abg) this.f89756b).mergeSelect(c0167p);
            return this;
        }

        public C0153b mergeStartAt(ga3 ga3Var) {
            m23743e();
            ((abg) this.f89756b).mergeStartAt(ga3Var);
            return this;
        }

        public C0153b mergeWhere(C0163l c0163l) {
            m23743e();
            ((abg) this.f89756b).mergeWhere(c0163l);
            return this;
        }

        public C0153b removeFrom(int i) {
            m23743e();
            ((abg) this.f89756b).removeFrom(i);
            return this;
        }

        public C0153b removeOrderBy(int i) {
            m23743e();
            ((abg) this.f89756b).removeOrderBy(i);
            return this;
        }

        public C0153b setEndAt(ga3 ga3Var) {
            m23743e();
            ((abg) this.f89756b).setEndAt(ga3Var);
            return this;
        }

        public C0153b setFrom(int i, C0154c c0154c) {
            m23743e();
            ((abg) this.f89756b).setFrom(i, c0154c);
            return this;
        }

        public C0153b setLimit(t58 t58Var) {
            m23743e();
            ((abg) this.f89756b).setLimit(t58Var);
            return this;
        }

        public C0153b setOffset(int i) {
            m23743e();
            ((abg) this.f89756b).setOffset(i);
            return this;
        }

        public C0153b setOrderBy(int i, C0165n c0165n) {
            m23743e();
            ((abg) this.f89756b).setOrderBy(i, c0165n);
            return this;
        }

        public C0153b setSelect(C0167p c0167p) {
            m23743e();
            ((abg) this.f89756b).setSelect(c0167p);
            return this;
        }

        public C0153b setStartAt(ga3 ga3Var) {
            m23743e();
            ((abg) this.f89756b).setStartAt(ga3Var);
            return this;
        }

        public C0153b setWhere(C0163l c0163l) {
            m23743e();
            ((abg) this.f89756b).setWhere(c0163l);
            return this;
        }

        private C0153b() {
            super(abg.DEFAULT_INSTANCE);
        }

        public C0153b addFrom(int i, C0154c c0154c) {
            m23743e();
            ((abg) this.f89756b).addFrom(i, c0154c);
            return this;
        }

        public C0153b addOrderBy(int i, C0165n c0165n) {
            m23743e();
            ((abg) this.f89756b).addOrderBy(i, c0165n);
            return this;
        }

        public C0153b setEndAt(ga3.C6183b c6183b) {
            m23743e();
            ((abg) this.f89756b).setEndAt(c6183b.build());
            return this;
        }

        public C0153b setFrom(int i, C0154c.a aVar) {
            m23743e();
            ((abg) this.f89756b).setFrom(i, aVar.build());
            return this;
        }

        public C0153b setLimit(t58.C12915b c12915b) {
            m23743e();
            ((abg) this.f89756b).setLimit(c12915b.build());
            return this;
        }

        public C0153b setOrderBy(int i, C0165n.a aVar) {
            m23743e();
            ((abg) this.f89756b).setOrderBy(i, aVar.build());
            return this;
        }

        public C0153b setSelect(C0167p.a aVar) {
            m23743e();
            ((abg) this.f89756b).setSelect(aVar.build());
            return this;
        }

        public C0153b setStartAt(ga3.C6183b c6183b) {
            m23743e();
            ((abg) this.f89756b).setStartAt(c6183b.build());
            return this;
        }

        public C0153b setWhere(C0163l.a aVar) {
            m23743e();
            ((abg) this.f89756b).setWhere(aVar.build());
            return this;
        }

        public C0153b addFrom(C0154c.a aVar) {
            m23743e();
            ((abg) this.f89756b).addFrom(aVar.build());
            return this;
        }

        public C0153b addOrderBy(C0165n.a aVar) {
            m23743e();
            ((abg) this.f89756b).addOrderBy(aVar.build());
            return this;
        }

        public C0153b addFrom(int i, C0154c.a aVar) {
            m23743e();
            ((abg) this.f89756b).addFrom(i, aVar.build());
            return this;
        }

        public C0153b addOrderBy(int i, C0165n.a aVar) {
            m23743e();
            ((abg) this.f89756b).addOrderBy(i, aVar.build());
            return this;
        }
    }

    /* JADX INFO: renamed from: abg$c */
    public static final class C0154c extends v27<C0154c, a> implements InterfaceC0155d {
        public static final int ALL_DESCENDANTS_FIELD_NUMBER = 3;
        public static final int COLLECTION_ID_FIELD_NUMBER = 2;
        private static final C0154c DEFAULT_INSTANCE;
        private static volatile uhc<C0154c> PARSER;
        private boolean allDescendants_;
        private String collectionId_ = "";

        /* JADX INFO: renamed from: abg$c$a */
        public static final class a extends v27.AbstractC13823b<C0154c, a> implements InterfaceC0155d {
            public /* synthetic */ a(C0152a c0152a) {
                this();
            }

            public a clearAllDescendants() {
                m23743e();
                ((C0154c) this.f89756b).clearAllDescendants();
                return this;
            }

            public a clearCollectionId() {
                m23743e();
                ((C0154c) this.f89756b).clearCollectionId();
                return this;
            }

            @Override // p000.abg.InterfaceC0155d
            public boolean getAllDescendants() {
                return ((C0154c) this.f89756b).getAllDescendants();
            }

            @Override // p000.abg.InterfaceC0155d
            public String getCollectionId() {
                return ((C0154c) this.f89756b).getCollectionId();
            }

            @Override // p000.abg.InterfaceC0155d
            public vj1 getCollectionIdBytes() {
                return ((C0154c) this.f89756b).getCollectionIdBytes();
            }

            public a setAllDescendants(boolean z) {
                m23743e();
                ((C0154c) this.f89756b).setAllDescendants(z);
                return this;
            }

            public a setCollectionId(String str) {
                m23743e();
                ((C0154c) this.f89756b).setCollectionId(str);
                return this;
            }

            public a setCollectionIdBytes(vj1 vj1Var) {
                m23743e();
                ((C0154c) this.f89756b).setCollectionIdBytes(vj1Var);
                return this;
            }

            private a() {
                super(C0154c.DEFAULT_INSTANCE);
            }
        }

        static {
            C0154c c0154c = new C0154c();
            DEFAULT_INSTANCE = c0154c;
            v27.m23715h0(C0154c.class, c0154c);
        }

        private C0154c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAllDescendants() {
            this.allDescendants_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCollectionId() {
            this.collectionId_ = getDefaultInstance().getCollectionId();
        }

        public static C0154c getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.m23738n();
        }

        public static C0154c parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (C0154c) v27.m23700S(DEFAULT_INSTANCE, inputStream);
        }

        public static C0154c parseFrom(ByteBuffer byteBuffer) throws ce8 {
            return (C0154c) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
        }

        public static uhc<C0154c> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAllDescendants(boolean z) {
            this.allDescendants_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCollectionId(String str) {
            str.getClass();
            this.collectionId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCollectionIdBytes(vj1 vj1Var) {
            AbstractC1714b3.m2857c(vj1Var);
            this.collectionId_ = vj1Var.toStringUtf8();
        }

        @Override // p000.abg.InterfaceC0155d
        public boolean getAllDescendants() {
            return this.allDescendants_;
        }

        @Override // p000.abg.InterfaceC0155d
        public String getCollectionId() {
            return this.collectionId_;
        }

        @Override // p000.abg.InterfaceC0155d
        public vj1 getCollectionIdBytes() {
            return vj1.copyFromUtf8(this.collectionId_);
        }

        @Override // p000.v27
        /* JADX INFO: renamed from: r */
        public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
            C0152a c0152a = null;
            switch (C0152a.f975a[enumC13830i.ordinal()]) {
                case 1:
                    return new C0154c();
                case 2:
                    return new a(c0152a);
                case 3:
                    return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002Ȉ\u0003\u0007", new Object[]{"collectionId_", "allDescendants_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    uhc<C0154c> c13824c = PARSER;
                    if (c13824c == null) {
                        synchronized (C0154c.class) {
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

        public static a newBuilder(C0154c c0154c) {
            return DEFAULT_INSTANCE.m23739o(c0154c);
        }

        public static C0154c parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
            return (C0154c) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
        }

        public static C0154c parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
            return (C0154c) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
        }

        public static C0154c parseFrom(vj1 vj1Var) throws ce8 {
            return (C0154c) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
        }

        public static C0154c parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
            return (C0154c) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
        }

        public static C0154c parseFrom(byte[] bArr) throws ce8 {
            return (C0154c) v27.m23710c0(DEFAULT_INSTANCE, bArr);
        }

        public static C0154c parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
            return (C0154c) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
        }

        public static C0154c parseFrom(InputStream inputStream) throws IOException {
            return (C0154c) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
        }

        public static C0154c parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
            return (C0154c) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
        }

        public static C0154c parseFrom(f72 f72Var) throws IOException {
            return (C0154c) v27.m23704W(DEFAULT_INSTANCE, f72Var);
        }

        public static C0154c parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
            return (C0154c) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
        }
    }

    /* JADX INFO: renamed from: abg$d */
    public interface InterfaceC0155d extends rsa {
        boolean getAllDescendants();

        String getCollectionId();

        vj1 getCollectionIdBytes();
    }

    /* JADX INFO: renamed from: abg$e */
    public static final class C0156e extends v27<C0156e, a> implements InterfaceC0157f {
        private static final C0156e DEFAULT_INSTANCE;
        public static final int FILTERS_FIELD_NUMBER = 2;
        public static final int OP_FIELD_NUMBER = 1;
        private static volatile uhc<C0156e> PARSER;
        private w98.InterfaceC14504k<C0163l> filters_ = v27.m23722x();
        private int op_;

        /* JADX INFO: renamed from: abg$e$a */
        public static final class a extends v27.AbstractC13823b<C0156e, a> implements InterfaceC0157f {
            public /* synthetic */ a(C0152a c0152a) {
                this();
            }

            public a addAllFilters(Iterable<? extends C0163l> iterable) {
                m23743e();
                ((C0156e) this.f89756b).addAllFilters(iterable);
                return this;
            }

            public a addFilters(C0163l c0163l) {
                m23743e();
                ((C0156e) this.f89756b).addFilters(c0163l);
                return this;
            }

            public a clearFilters() {
                m23743e();
                ((C0156e) this.f89756b).clearFilters();
                return this;
            }

            public a clearOp() {
                m23743e();
                ((C0156e) this.f89756b).clearOp();
                return this;
            }

            @Override // p000.abg.InterfaceC0157f
            public C0163l getFilters(int i) {
                return ((C0156e) this.f89756b).getFilters(i);
            }

            @Override // p000.abg.InterfaceC0157f
            public int getFiltersCount() {
                return ((C0156e) this.f89756b).getFiltersCount();
            }

            @Override // p000.abg.InterfaceC0157f
            public List<C0163l> getFiltersList() {
                return Collections.unmodifiableList(((C0156e) this.f89756b).getFiltersList());
            }

            @Override // p000.abg.InterfaceC0157f
            public b getOp() {
                return ((C0156e) this.f89756b).getOp();
            }

            @Override // p000.abg.InterfaceC0157f
            public int getOpValue() {
                return ((C0156e) this.f89756b).getOpValue();
            }

            public a removeFilters(int i) {
                m23743e();
                ((C0156e) this.f89756b).removeFilters(i);
                return this;
            }

            public a setFilters(int i, C0163l c0163l) {
                m23743e();
                ((C0156e) this.f89756b).setFilters(i, c0163l);
                return this;
            }

            public a setOp(b bVar) {
                m23743e();
                ((C0156e) this.f89756b).setOp(bVar);
                return this;
            }

            public a setOpValue(int i) {
                m23743e();
                ((C0156e) this.f89756b).setOpValue(i);
                return this;
            }

            private a() {
                super(C0156e.DEFAULT_INSTANCE);
            }

            public a addFilters(int i, C0163l c0163l) {
                m23743e();
                ((C0156e) this.f89756b).addFilters(i, c0163l);
                return this;
            }

            public a setFilters(int i, C0163l.a aVar) {
                m23743e();
                ((C0156e) this.f89756b).setFilters(i, aVar.build());
                return this;
            }

            public a addFilters(C0163l.a aVar) {
                m23743e();
                ((C0156e) this.f89756b).addFilters(aVar.build());
                return this;
            }

            public a addFilters(int i, C0163l.a aVar) {
                m23743e();
                ((C0156e) this.f89756b).addFilters(i, aVar.build());
                return this;
            }
        }

        /* JADX INFO: renamed from: abg$e$b */
        public enum b implements w98.InterfaceC14497d {
            OPERATOR_UNSPECIFIED(0),
            AND(1),
            OR(2),
            UNRECOGNIZED(-1);


            /* JADX INFO: renamed from: C */
            public static final int f976C = 2;

            /* JADX INFO: renamed from: F */
            public static final w98.InterfaceC14498e<b> f977F = new a();

            /* JADX INFO: renamed from: f */
            public static final int f983f = 0;

            /* JADX INFO: renamed from: m */
            public static final int f984m = 1;

            /* JADX INFO: renamed from: a */
            public final int f985a;

            /* JADX INFO: renamed from: abg$e$b$a */
            public class a implements w98.InterfaceC14498e<b> {
                @Override // p000.w98.InterfaceC14498e
                public b findValueByNumber(int i) {
                    return b.forNumber(i);
                }
            }

            /* JADX INFO: renamed from: abg$e$b$b, reason: collision with other inner class name */
            public static final class C16338b implements w98.InterfaceC14499f {

                /* JADX INFO: renamed from: a */
                public static final w98.InterfaceC14499f f986a = new C16338b();

                private C16338b() {
                }

                @Override // p000.w98.InterfaceC14499f
                public boolean isInRange(int i) {
                    return b.forNumber(i) != null;
                }
            }

            b(int i) {
                this.f985a = i;
            }

            public static b forNumber(int i) {
                if (i == 0) {
                    return OPERATOR_UNSPECIFIED;
                }
                if (i == 1) {
                    return AND;
                }
                if (i != 2) {
                    return null;
                }
                return OR;
            }

            public static w98.InterfaceC14498e<b> internalGetValueMap() {
                return f977F;
            }

            public static w98.InterfaceC14499f internalGetVerifier() {
                return C16338b.f986a;
            }

            @Override // p000.w98.InterfaceC14497d
            public final int getNumber() {
                if (this != UNRECOGNIZED) {
                    return this.f985a;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }

            @Deprecated
            public static b valueOf(int i) {
                return forNumber(i);
            }
        }

        static {
            C0156e c0156e = new C0156e();
            DEFAULT_INSTANCE = c0156e;
            v27.m23715h0(C0156e.class, c0156e);
        }

        private C0156e() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllFilters(Iterable<? extends C0163l> iterable) {
            ensureFiltersIsMutable();
            AbstractC1714b3.m2856b(iterable, this.filters_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addFilters(C0163l c0163l) {
            c0163l.getClass();
            ensureFiltersIsMutable();
            this.filters_.add(c0163l);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFilters() {
            this.filters_ = v27.m23722x();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOp() {
            this.op_ = 0;
        }

        private void ensureFiltersIsMutable() {
            w98.InterfaceC14504k<C0163l> interfaceC14504k = this.filters_;
            if (interfaceC14504k.isModifiable()) {
                return;
            }
            this.filters_ = v27.m23698P(interfaceC14504k);
        }

        public static C0156e getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.m23738n();
        }

        public static C0156e parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (C0156e) v27.m23700S(DEFAULT_INSTANCE, inputStream);
        }

        public static C0156e parseFrom(ByteBuffer byteBuffer) throws ce8 {
            return (C0156e) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
        }

        public static uhc<C0156e> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeFilters(int i) {
            ensureFiltersIsMutable();
            this.filters_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFilters(int i, C0163l c0163l) {
            c0163l.getClass();
            ensureFiltersIsMutable();
            this.filters_.set(i, c0163l);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOp(b bVar) {
            this.op_ = bVar.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOpValue(int i) {
            this.op_ = i;
        }

        @Override // p000.abg.InterfaceC0157f
        public C0163l getFilters(int i) {
            return this.filters_.get(i);
        }

        @Override // p000.abg.InterfaceC0157f
        public int getFiltersCount() {
            return this.filters_.size();
        }

        @Override // p000.abg.InterfaceC0157f
        public List<C0163l> getFiltersList() {
            return this.filters_;
        }

        public InterfaceC0164m getFiltersOrBuilder(int i) {
            return this.filters_.get(i);
        }

        public List<? extends InterfaceC0164m> getFiltersOrBuilderList() {
            return this.filters_;
        }

        @Override // p000.abg.InterfaceC0157f
        public b getOp() {
            b bVarForNumber = b.forNumber(this.op_);
            return bVarForNumber == null ? b.UNRECOGNIZED : bVarForNumber;
        }

        @Override // p000.abg.InterfaceC0157f
        public int getOpValue() {
            return this.op_;
        }

        @Override // p000.v27
        /* JADX INFO: renamed from: r */
        public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
            C0152a c0152a = null;
            switch (C0152a.f975a[enumC13830i.ordinal()]) {
                case 1:
                    return new C0156e();
                case 2:
                    return new a(c0152a);
                case 3:
                    return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\f\u0002\u001b", new Object[]{"op_", "filters_", C0163l.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    uhc<C0156e> c13824c = PARSER;
                    if (c13824c == null) {
                        synchronized (C0156e.class) {
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

        public static a newBuilder(C0156e c0156e) {
            return DEFAULT_INSTANCE.m23739o(c0156e);
        }

        public static C0156e parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
            return (C0156e) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
        }

        public static C0156e parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
            return (C0156e) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
        }

        public static C0156e parseFrom(vj1 vj1Var) throws ce8 {
            return (C0156e) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addFilters(int i, C0163l c0163l) {
            c0163l.getClass();
            ensureFiltersIsMutable();
            this.filters_.add(i, c0163l);
        }

        public static C0156e parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
            return (C0156e) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
        }

        public static C0156e parseFrom(byte[] bArr) throws ce8 {
            return (C0156e) v27.m23710c0(DEFAULT_INSTANCE, bArr);
        }

        public static C0156e parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
            return (C0156e) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
        }

        public static C0156e parseFrom(InputStream inputStream) throws IOException {
            return (C0156e) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
        }

        public static C0156e parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
            return (C0156e) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
        }

        public static C0156e parseFrom(f72 f72Var) throws IOException {
            return (C0156e) v27.m23704W(DEFAULT_INSTANCE, f72Var);
        }

        public static C0156e parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
            return (C0156e) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
        }
    }

    /* JADX INFO: renamed from: abg$f */
    public interface InterfaceC0157f extends rsa {
        C0163l getFilters(int i);

        int getFiltersCount();

        List<C0163l> getFiltersList();

        C0156e.b getOp();

        int getOpValue();
    }

    /* JADX INFO: renamed from: abg$g */
    public enum EnumC0158g implements w98.InterfaceC14497d {
        DIRECTION_UNSPECIFIED(0),
        ASCENDING(1),
        DESCENDING(2),
        UNRECOGNIZED(-1);


        /* JADX INFO: renamed from: C */
        public static final int f987C = 2;

        /* JADX INFO: renamed from: F */
        public static final w98.InterfaceC14498e<EnumC0158g> f988F = new a();

        /* JADX INFO: renamed from: f */
        public static final int f994f = 0;

        /* JADX INFO: renamed from: m */
        public static final int f995m = 1;

        /* JADX INFO: renamed from: a */
        public final int f996a;

        /* JADX INFO: renamed from: abg$g$a */
        public class a implements w98.InterfaceC14498e<EnumC0158g> {
            @Override // p000.w98.InterfaceC14498e
            public EnumC0158g findValueByNumber(int i) {
                return EnumC0158g.forNumber(i);
            }
        }

        /* JADX INFO: renamed from: abg$g$b */
        public static final class b implements w98.InterfaceC14499f {

            /* JADX INFO: renamed from: a */
            public static final w98.InterfaceC14499f f997a = new b();

            private b() {
            }

            @Override // p000.w98.InterfaceC14499f
            public boolean isInRange(int i) {
                return EnumC0158g.forNumber(i) != null;
            }
        }

        EnumC0158g(int i) {
            this.f996a = i;
        }

        public static EnumC0158g forNumber(int i) {
            if (i == 0) {
                return DIRECTION_UNSPECIFIED;
            }
            if (i == 1) {
                return ASCENDING;
            }
            if (i != 2) {
                return null;
            }
            return DESCENDING;
        }

        public static w98.InterfaceC14498e<EnumC0158g> internalGetValueMap() {
            return f988F;
        }

        public static w98.InterfaceC14499f internalGetVerifier() {
            return b.f997a;
        }

        @Override // p000.w98.InterfaceC14497d
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.f996a;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static EnumC0158g valueOf(int i) {
            return forNumber(i);
        }
    }

    /* JADX INFO: renamed from: abg$h */
    public static final class C0159h extends v27<C0159h, a> implements InterfaceC0160i {
        private static final C0159h DEFAULT_INSTANCE;
        public static final int FIELD_FIELD_NUMBER = 1;
        public static final int OP_FIELD_NUMBER = 2;
        private static volatile uhc<C0159h> PARSER = null;
        public static final int VALUE_FIELD_NUMBER = 3;
        private int bitField0_;
        private C0161j field_;
        private int op_;
        private b2i value_;

        /* JADX INFO: renamed from: abg$h$a */
        public static final class a extends v27.AbstractC13823b<C0159h, a> implements InterfaceC0160i {
            public /* synthetic */ a(C0152a c0152a) {
                this();
            }

            public a clearField() {
                m23743e();
                ((C0159h) this.f89756b).clearField();
                return this;
            }

            public a clearOp() {
                m23743e();
                ((C0159h) this.f89756b).clearOp();
                return this;
            }

            public a clearValue() {
                m23743e();
                ((C0159h) this.f89756b).clearValue();
                return this;
            }

            @Override // p000.abg.InterfaceC0160i
            public C0161j getField() {
                return ((C0159h) this.f89756b).getField();
            }

            @Override // p000.abg.InterfaceC0160i
            public b getOp() {
                return ((C0159h) this.f89756b).getOp();
            }

            @Override // p000.abg.InterfaceC0160i
            public int getOpValue() {
                return ((C0159h) this.f89756b).getOpValue();
            }

            @Override // p000.abg.InterfaceC0160i
            public b2i getValue() {
                return ((C0159h) this.f89756b).getValue();
            }

            @Override // p000.abg.InterfaceC0160i
            public boolean hasField() {
                return ((C0159h) this.f89756b).hasField();
            }

            @Override // p000.abg.InterfaceC0160i
            public boolean hasValue() {
                return ((C0159h) this.f89756b).hasValue();
            }

            public a mergeField(C0161j c0161j) {
                m23743e();
                ((C0159h) this.f89756b).mergeField(c0161j);
                return this;
            }

            public a mergeValue(b2i b2iVar) {
                m23743e();
                ((C0159h) this.f89756b).mergeValue(b2iVar);
                return this;
            }

            public a setField(C0161j c0161j) {
                m23743e();
                ((C0159h) this.f89756b).setField(c0161j);
                return this;
            }

            public a setOp(b bVar) {
                m23743e();
                ((C0159h) this.f89756b).setOp(bVar);
                return this;
            }

            public a setOpValue(int i) {
                m23743e();
                ((C0159h) this.f89756b).setOpValue(i);
                return this;
            }

            public a setValue(b2i b2iVar) {
                m23743e();
                ((C0159h) this.f89756b).setValue(b2iVar);
                return this;
            }

            private a() {
                super(C0159h.DEFAULT_INSTANCE);
            }

            public a setField(C0161j.a aVar) {
                m23743e();
                ((C0159h) this.f89756b).setField(aVar.build());
                return this;
            }

            public a setValue(b2i.C1712b c1712b) {
                m23743e();
                ((C0159h) this.f89756b).setValue(c1712b.build());
                return this;
            }
        }

        /* JADX INFO: renamed from: abg$h$b */
        public enum b implements w98.InterfaceC14497d {
            OPERATOR_UNSPECIFIED(0),
            LESS_THAN(1),
            LESS_THAN_OR_EQUAL(2),
            GREATER_THAN(3),
            GREATER_THAN_OR_EQUAL(4),
            EQUAL(5),
            NOT_EQUAL(6),
            ARRAY_CONTAINS(7),
            IN(8),
            ARRAY_CONTAINS_ANY(9),
            NOT_IN(10),
            UNRECOGNIZED(-1);


            /* JADX INFO: renamed from: M1 */
            public static final int f1003M1 = 4;

            /* JADX INFO: renamed from: Q */
            public static final int f1005Q = 0;

            /* JADX INFO: renamed from: V1 */
            public static final int f1006V1 = 5;

            /* JADX INFO: renamed from: X */
            public static final int f1007X = 1;

            /* JADX INFO: renamed from: Y */
            public static final int f1008Y = 2;

            /* JADX INFO: renamed from: Z */
            public static final int f1009Z = 3;

            /* JADX INFO: renamed from: Z1 */
            public static final int f1010Z1 = 6;

            /* JADX INFO: renamed from: a2 */
            public static final int f1011a2 = 7;

            /* JADX INFO: renamed from: b2 */
            public static final int f1013b2 = 8;

            /* JADX INFO: renamed from: c2 */
            public static final int f1015c2 = 9;

            /* JADX INFO: renamed from: d2 */
            public static final int f1017d2 = 10;

            /* JADX INFO: renamed from: e2 */
            public static final w98.InterfaceC14498e<b> f1019e2 = new a();

            /* JADX INFO: renamed from: a */
            public final int f1023a;

            /* JADX INFO: renamed from: abg$h$b$a */
            public class a implements w98.InterfaceC14498e<b> {
                @Override // p000.w98.InterfaceC14498e
                public b findValueByNumber(int i) {
                    return b.forNumber(i);
                }
            }

            /* JADX INFO: renamed from: abg$h$b$b, reason: collision with other inner class name */
            public static final class C16339b implements w98.InterfaceC14499f {

                /* JADX INFO: renamed from: a */
                public static final w98.InterfaceC14499f f1024a = new C16339b();

                private C16339b() {
                }

                @Override // p000.w98.InterfaceC14499f
                public boolean isInRange(int i) {
                    return b.forNumber(i) != null;
                }
            }

            b(int i) {
                this.f1023a = i;
            }

            public static b forNumber(int i) {
                switch (i) {
                    case 0:
                        return OPERATOR_UNSPECIFIED;
                    case 1:
                        return LESS_THAN;
                    case 2:
                        return LESS_THAN_OR_EQUAL;
                    case 3:
                        return GREATER_THAN;
                    case 4:
                        return GREATER_THAN_OR_EQUAL;
                    case 5:
                        return EQUAL;
                    case 6:
                        return NOT_EQUAL;
                    case 7:
                        return ARRAY_CONTAINS;
                    case 8:
                        return IN;
                    case 9:
                        return ARRAY_CONTAINS_ANY;
                    case 10:
                        return NOT_IN;
                    default:
                        return null;
                }
            }

            public static w98.InterfaceC14498e<b> internalGetValueMap() {
                return f1019e2;
            }

            public static w98.InterfaceC14499f internalGetVerifier() {
                return C16339b.f1024a;
            }

            @Override // p000.w98.InterfaceC14497d
            public final int getNumber() {
                if (this != UNRECOGNIZED) {
                    return this.f1023a;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }

            @Deprecated
            public static b valueOf(int i) {
                return forNumber(i);
            }
        }

        static {
            C0159h c0159h = new C0159h();
            DEFAULT_INSTANCE = c0159h;
            v27.m23715h0(C0159h.class, c0159h);
        }

        private C0159h() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearField() {
            this.field_ = null;
            this.bitField0_ &= -2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOp() {
            this.op_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearValue() {
            this.value_ = null;
            this.bitField0_ &= -3;
        }

        public static C0159h getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeField(C0161j c0161j) {
            c0161j.getClass();
            C0161j c0161j2 = this.field_;
            if (c0161j2 == null || c0161j2 == C0161j.getDefaultInstance()) {
                this.field_ = c0161j;
            } else {
                this.field_ = C0161j.newBuilder(this.field_).mergeFrom(c0161j).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeValue(b2i b2iVar) {
            b2iVar.getClass();
            b2i b2iVar2 = this.value_;
            if (b2iVar2 == null || b2iVar2 == b2i.getDefaultInstance()) {
                this.value_ = b2iVar;
            } else {
                this.value_ = b2i.newBuilder(this.value_).mergeFrom(b2iVar).buildPartial();
            }
            this.bitField0_ |= 2;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.m23738n();
        }

        public static C0159h parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (C0159h) v27.m23700S(DEFAULT_INSTANCE, inputStream);
        }

        public static C0159h parseFrom(ByteBuffer byteBuffer) throws ce8 {
            return (C0159h) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
        }

        public static uhc<C0159h> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setField(C0161j c0161j) {
            c0161j.getClass();
            this.field_ = c0161j;
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOp(b bVar) {
            this.op_ = bVar.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOpValue(int i) {
            this.op_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setValue(b2i b2iVar) {
            b2iVar.getClass();
            this.value_ = b2iVar;
            this.bitField0_ |= 2;
        }

        @Override // p000.abg.InterfaceC0160i
        public C0161j getField() {
            C0161j c0161j = this.field_;
            return c0161j == null ? C0161j.getDefaultInstance() : c0161j;
        }

        @Override // p000.abg.InterfaceC0160i
        public b getOp() {
            b bVarForNumber = b.forNumber(this.op_);
            return bVarForNumber == null ? b.UNRECOGNIZED : bVarForNumber;
        }

        @Override // p000.abg.InterfaceC0160i
        public int getOpValue() {
            return this.op_;
        }

        @Override // p000.abg.InterfaceC0160i
        public b2i getValue() {
            b2i b2iVar = this.value_;
            return b2iVar == null ? b2i.getDefaultInstance() : b2iVar;
        }

        @Override // p000.abg.InterfaceC0160i
        public boolean hasField() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // p000.abg.InterfaceC0160i
        public boolean hasValue() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // p000.v27
        /* JADX INFO: renamed from: r */
        public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
            C0152a c0152a = null;
            switch (C0152a.f975a[enumC13830i.ordinal()]) {
                case 1:
                    return new C0159h();
                case 2:
                    return new a(c0152a);
                case 3:
                    return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003ဉ\u0001", new Object[]{"bitField0_", "field_", "op_", "value_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    uhc<C0159h> c13824c = PARSER;
                    if (c13824c == null) {
                        synchronized (C0159h.class) {
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

        public static a newBuilder(C0159h c0159h) {
            return DEFAULT_INSTANCE.m23739o(c0159h);
        }

        public static C0159h parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
            return (C0159h) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
        }

        public static C0159h parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
            return (C0159h) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
        }

        public static C0159h parseFrom(vj1 vj1Var) throws ce8 {
            return (C0159h) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
        }

        public static C0159h parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
            return (C0159h) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
        }

        public static C0159h parseFrom(byte[] bArr) throws ce8 {
            return (C0159h) v27.m23710c0(DEFAULT_INSTANCE, bArr);
        }

        public static C0159h parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
            return (C0159h) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
        }

        public static C0159h parseFrom(InputStream inputStream) throws IOException {
            return (C0159h) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
        }

        public static C0159h parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
            return (C0159h) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
        }

        public static C0159h parseFrom(f72 f72Var) throws IOException {
            return (C0159h) v27.m23704W(DEFAULT_INSTANCE, f72Var);
        }

        public static C0159h parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
            return (C0159h) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
        }
    }

    /* JADX INFO: renamed from: abg$i */
    public interface InterfaceC0160i extends rsa {
        C0161j getField();

        C0159h.b getOp();

        int getOpValue();

        b2i getValue();

        boolean hasField();

        boolean hasValue();
    }

    /* JADX INFO: renamed from: abg$j */
    public static final class C0161j extends v27<C0161j, a> implements InterfaceC0162k {
        private static final C0161j DEFAULT_INSTANCE;
        public static final int FIELD_PATH_FIELD_NUMBER = 2;
        private static volatile uhc<C0161j> PARSER;
        private String fieldPath_ = "";

        /* JADX INFO: renamed from: abg$j$a */
        public static final class a extends v27.AbstractC13823b<C0161j, a> implements InterfaceC0162k {
            public /* synthetic */ a(C0152a c0152a) {
                this();
            }

            public a clearFieldPath() {
                m23743e();
                ((C0161j) this.f89756b).clearFieldPath();
                return this;
            }

            @Override // p000.abg.InterfaceC0162k
            public String getFieldPath() {
                return ((C0161j) this.f89756b).getFieldPath();
            }

            @Override // p000.abg.InterfaceC0162k
            public vj1 getFieldPathBytes() {
                return ((C0161j) this.f89756b).getFieldPathBytes();
            }

            public a setFieldPath(String str) {
                m23743e();
                ((C0161j) this.f89756b).setFieldPath(str);
                return this;
            }

            public a setFieldPathBytes(vj1 vj1Var) {
                m23743e();
                ((C0161j) this.f89756b).setFieldPathBytes(vj1Var);
                return this;
            }

            private a() {
                super(C0161j.DEFAULT_INSTANCE);
            }
        }

        static {
            C0161j c0161j = new C0161j();
            DEFAULT_INSTANCE = c0161j;
            v27.m23715h0(C0161j.class, c0161j);
        }

        private C0161j() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFieldPath() {
            this.fieldPath_ = getDefaultInstance().getFieldPath();
        }

        public static C0161j getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.m23738n();
        }

        public static C0161j parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (C0161j) v27.m23700S(DEFAULT_INSTANCE, inputStream);
        }

        public static C0161j parseFrom(ByteBuffer byteBuffer) throws ce8 {
            return (C0161j) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
        }

        public static uhc<C0161j> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFieldPath(String str) {
            str.getClass();
            this.fieldPath_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFieldPathBytes(vj1 vj1Var) {
            AbstractC1714b3.m2857c(vj1Var);
            this.fieldPath_ = vj1Var.toStringUtf8();
        }

        @Override // p000.abg.InterfaceC0162k
        public String getFieldPath() {
            return this.fieldPath_;
        }

        @Override // p000.abg.InterfaceC0162k
        public vj1 getFieldPathBytes() {
            return vj1.copyFromUtf8(this.fieldPath_);
        }

        @Override // p000.v27
        /* JADX INFO: renamed from: r */
        public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
            C0152a c0152a = null;
            switch (C0152a.f975a[enumC13830i.ordinal()]) {
                case 1:
                    return new C0161j();
                case 2:
                    return new a(c0152a);
                case 3:
                    return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002Ȉ", new Object[]{"fieldPath_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    uhc<C0161j> c13824c = PARSER;
                    if (c13824c == null) {
                        synchronized (C0161j.class) {
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

        public static a newBuilder(C0161j c0161j) {
            return DEFAULT_INSTANCE.m23739o(c0161j);
        }

        public static C0161j parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
            return (C0161j) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
        }

        public static C0161j parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
            return (C0161j) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
        }

        public static C0161j parseFrom(vj1 vj1Var) throws ce8 {
            return (C0161j) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
        }

        public static C0161j parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
            return (C0161j) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
        }

        public static C0161j parseFrom(byte[] bArr) throws ce8 {
            return (C0161j) v27.m23710c0(DEFAULT_INSTANCE, bArr);
        }

        public static C0161j parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
            return (C0161j) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
        }

        public static C0161j parseFrom(InputStream inputStream) throws IOException {
            return (C0161j) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
        }

        public static C0161j parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
            return (C0161j) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
        }

        public static C0161j parseFrom(f72 f72Var) throws IOException {
            return (C0161j) v27.m23704W(DEFAULT_INSTANCE, f72Var);
        }

        public static C0161j parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
            return (C0161j) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
        }
    }

    /* JADX INFO: renamed from: abg$k */
    public interface InterfaceC0162k extends rsa {
        String getFieldPath();

        vj1 getFieldPathBytes();
    }

    /* JADX INFO: renamed from: abg$l */
    public static final class C0163l extends v27<C0163l, a> implements InterfaceC0164m {
        public static final int COMPOSITE_FILTER_FIELD_NUMBER = 1;
        private static final C0163l DEFAULT_INSTANCE;
        public static final int FIELD_FILTER_FIELD_NUMBER = 2;
        private static volatile uhc<C0163l> PARSER = null;
        public static final int UNARY_FILTER_FIELD_NUMBER = 3;
        private int filterTypeCase_ = 0;
        private Object filterType_;

        /* JADX INFO: renamed from: abg$l$a */
        public static final class a extends v27.AbstractC13823b<C0163l, a> implements InterfaceC0164m {
            public /* synthetic */ a(C0152a c0152a) {
                this();
            }

            public a clearCompositeFilter() {
                m23743e();
                ((C0163l) this.f89756b).clearCompositeFilter();
                return this;
            }

            public a clearFieldFilter() {
                m23743e();
                ((C0163l) this.f89756b).clearFieldFilter();
                return this;
            }

            public a clearFilterType() {
                m23743e();
                ((C0163l) this.f89756b).clearFilterType();
                return this;
            }

            public a clearUnaryFilter() {
                m23743e();
                ((C0163l) this.f89756b).clearUnaryFilter();
                return this;
            }

            @Override // p000.abg.InterfaceC0164m
            public C0156e getCompositeFilter() {
                return ((C0163l) this.f89756b).getCompositeFilter();
            }

            @Override // p000.abg.InterfaceC0164m
            public C0159h getFieldFilter() {
                return ((C0163l) this.f89756b).getFieldFilter();
            }

            @Override // p000.abg.InterfaceC0164m
            public b getFilterTypeCase() {
                return ((C0163l) this.f89756b).getFilterTypeCase();
            }

            @Override // p000.abg.InterfaceC0164m
            public C0169r getUnaryFilter() {
                return ((C0163l) this.f89756b).getUnaryFilter();
            }

            @Override // p000.abg.InterfaceC0164m
            public boolean hasCompositeFilter() {
                return ((C0163l) this.f89756b).hasCompositeFilter();
            }

            @Override // p000.abg.InterfaceC0164m
            public boolean hasFieldFilter() {
                return ((C0163l) this.f89756b).hasFieldFilter();
            }

            @Override // p000.abg.InterfaceC0164m
            public boolean hasUnaryFilter() {
                return ((C0163l) this.f89756b).hasUnaryFilter();
            }

            public a mergeCompositeFilter(C0156e c0156e) {
                m23743e();
                ((C0163l) this.f89756b).mergeCompositeFilter(c0156e);
                return this;
            }

            public a mergeFieldFilter(C0159h c0159h) {
                m23743e();
                ((C0163l) this.f89756b).mergeFieldFilter(c0159h);
                return this;
            }

            public a mergeUnaryFilter(C0169r c0169r) {
                m23743e();
                ((C0163l) this.f89756b).mergeUnaryFilter(c0169r);
                return this;
            }

            public a setCompositeFilter(C0156e c0156e) {
                m23743e();
                ((C0163l) this.f89756b).setCompositeFilter(c0156e);
                return this;
            }

            public a setFieldFilter(C0159h c0159h) {
                m23743e();
                ((C0163l) this.f89756b).setFieldFilter(c0159h);
                return this;
            }

            public a setUnaryFilter(C0169r c0169r) {
                m23743e();
                ((C0163l) this.f89756b).setUnaryFilter(c0169r);
                return this;
            }

            private a() {
                super(C0163l.DEFAULT_INSTANCE);
            }

            public a setCompositeFilter(C0156e.a aVar) {
                m23743e();
                ((C0163l) this.f89756b).setCompositeFilter(aVar.build());
                return this;
            }

            public a setFieldFilter(C0159h.a aVar) {
                m23743e();
                ((C0163l) this.f89756b).setFieldFilter(aVar.build());
                return this;
            }

            public a setUnaryFilter(C0169r.a aVar) {
                m23743e();
                ((C0163l) this.f89756b).setUnaryFilter(aVar.build());
                return this;
            }
        }

        /* JADX INFO: renamed from: abg$l$b */
        public enum b {
            COMPOSITE_FILTER(1),
            FIELD_FILTER(2),
            UNARY_FILTER(3),
            FILTERTYPE_NOT_SET(0);


            /* JADX INFO: renamed from: a */
            public final int f1030a;

            b(int i) {
                this.f1030a = i;
            }

            public static b forNumber(int i) {
                if (i == 0) {
                    return FILTERTYPE_NOT_SET;
                }
                if (i == 1) {
                    return COMPOSITE_FILTER;
                }
                if (i == 2) {
                    return FIELD_FILTER;
                }
                if (i != 3) {
                    return null;
                }
                return UNARY_FILTER;
            }

            public int getNumber() {
                return this.f1030a;
            }

            @Deprecated
            public static b valueOf(int i) {
                return forNumber(i);
            }
        }

        static {
            C0163l c0163l = new C0163l();
            DEFAULT_INSTANCE = c0163l;
            v27.m23715h0(C0163l.class, c0163l);
        }

        private C0163l() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCompositeFilter() {
            if (this.filterTypeCase_ == 1) {
                this.filterTypeCase_ = 0;
                this.filterType_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFieldFilter() {
            if (this.filterTypeCase_ == 2) {
                this.filterTypeCase_ = 0;
                this.filterType_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFilterType() {
            this.filterTypeCase_ = 0;
            this.filterType_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUnaryFilter() {
            if (this.filterTypeCase_ == 3) {
                this.filterTypeCase_ = 0;
                this.filterType_ = null;
            }
        }

        public static C0163l getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeCompositeFilter(C0156e c0156e) {
            c0156e.getClass();
            if (this.filterTypeCase_ != 1 || this.filterType_ == C0156e.getDefaultInstance()) {
                this.filterType_ = c0156e;
            } else {
                this.filterType_ = C0156e.newBuilder((C0156e) this.filterType_).mergeFrom(c0156e).buildPartial();
            }
            this.filterTypeCase_ = 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeFieldFilter(C0159h c0159h) {
            c0159h.getClass();
            if (this.filterTypeCase_ != 2 || this.filterType_ == C0159h.getDefaultInstance()) {
                this.filterType_ = c0159h;
            } else {
                this.filterType_ = C0159h.newBuilder((C0159h) this.filterType_).mergeFrom(c0159h).buildPartial();
            }
            this.filterTypeCase_ = 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeUnaryFilter(C0169r c0169r) {
            c0169r.getClass();
            if (this.filterTypeCase_ != 3 || this.filterType_ == C0169r.getDefaultInstance()) {
                this.filterType_ = c0169r;
            } else {
                this.filterType_ = C0169r.newBuilder((C0169r) this.filterType_).mergeFrom(c0169r).buildPartial();
            }
            this.filterTypeCase_ = 3;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.m23738n();
        }

        public static C0163l parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (C0163l) v27.m23700S(DEFAULT_INSTANCE, inputStream);
        }

        public static C0163l parseFrom(ByteBuffer byteBuffer) throws ce8 {
            return (C0163l) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
        }

        public static uhc<C0163l> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCompositeFilter(C0156e c0156e) {
            c0156e.getClass();
            this.filterType_ = c0156e;
            this.filterTypeCase_ = 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFieldFilter(C0159h c0159h) {
            c0159h.getClass();
            this.filterType_ = c0159h;
            this.filterTypeCase_ = 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUnaryFilter(C0169r c0169r) {
            c0169r.getClass();
            this.filterType_ = c0169r;
            this.filterTypeCase_ = 3;
        }

        @Override // p000.abg.InterfaceC0164m
        public C0156e getCompositeFilter() {
            return this.filterTypeCase_ == 1 ? (C0156e) this.filterType_ : C0156e.getDefaultInstance();
        }

        @Override // p000.abg.InterfaceC0164m
        public C0159h getFieldFilter() {
            return this.filterTypeCase_ == 2 ? (C0159h) this.filterType_ : C0159h.getDefaultInstance();
        }

        @Override // p000.abg.InterfaceC0164m
        public b getFilterTypeCase() {
            return b.forNumber(this.filterTypeCase_);
        }

        @Override // p000.abg.InterfaceC0164m
        public C0169r getUnaryFilter() {
            return this.filterTypeCase_ == 3 ? (C0169r) this.filterType_ : C0169r.getDefaultInstance();
        }

        @Override // p000.abg.InterfaceC0164m
        public boolean hasCompositeFilter() {
            return this.filterTypeCase_ == 1;
        }

        @Override // p000.abg.InterfaceC0164m
        public boolean hasFieldFilter() {
            return this.filterTypeCase_ == 2;
        }

        @Override // p000.abg.InterfaceC0164m
        public boolean hasUnaryFilter() {
            return this.filterTypeCase_ == 3;
        }

        @Override // p000.v27
        /* JADX INFO: renamed from: r */
        public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
            C0152a c0152a = null;
            switch (C0152a.f975a[enumC13830i.ordinal()]) {
                case 1:
                    return new C0163l();
                case 2:
                    return new a(c0152a);
                case 3:
                    return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"filterType_", "filterTypeCase_", C0156e.class, C0159h.class, C0169r.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    uhc<C0163l> c13824c = PARSER;
                    if (c13824c == null) {
                        synchronized (C0163l.class) {
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

        public static a newBuilder(C0163l c0163l) {
            return DEFAULT_INSTANCE.m23739o(c0163l);
        }

        public static C0163l parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
            return (C0163l) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
        }

        public static C0163l parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
            return (C0163l) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
        }

        public static C0163l parseFrom(vj1 vj1Var) throws ce8 {
            return (C0163l) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
        }

        public static C0163l parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
            return (C0163l) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
        }

        public static C0163l parseFrom(byte[] bArr) throws ce8 {
            return (C0163l) v27.m23710c0(DEFAULT_INSTANCE, bArr);
        }

        public static C0163l parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
            return (C0163l) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
        }

        public static C0163l parseFrom(InputStream inputStream) throws IOException {
            return (C0163l) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
        }

        public static C0163l parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
            return (C0163l) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
        }

        public static C0163l parseFrom(f72 f72Var) throws IOException {
            return (C0163l) v27.m23704W(DEFAULT_INSTANCE, f72Var);
        }

        public static C0163l parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
            return (C0163l) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
        }
    }

    /* JADX INFO: renamed from: abg$m */
    public interface InterfaceC0164m extends rsa {
        C0156e getCompositeFilter();

        C0159h getFieldFilter();

        C0163l.b getFilterTypeCase();

        C0169r getUnaryFilter();

        boolean hasCompositeFilter();

        boolean hasFieldFilter();

        boolean hasUnaryFilter();
    }

    /* JADX INFO: renamed from: abg$n */
    public static final class C0165n extends v27<C0165n, a> implements InterfaceC0166o {
        private static final C0165n DEFAULT_INSTANCE;
        public static final int DIRECTION_FIELD_NUMBER = 2;
        public static final int FIELD_FIELD_NUMBER = 1;
        private static volatile uhc<C0165n> PARSER;
        private int bitField0_;
        private int direction_;
        private C0161j field_;

        /* JADX INFO: renamed from: abg$n$a */
        public static final class a extends v27.AbstractC13823b<C0165n, a> implements InterfaceC0166o {
            public /* synthetic */ a(C0152a c0152a) {
                this();
            }

            public a clearDirection() {
                m23743e();
                ((C0165n) this.f89756b).clearDirection();
                return this;
            }

            public a clearField() {
                m23743e();
                ((C0165n) this.f89756b).clearField();
                return this;
            }

            @Override // p000.abg.InterfaceC0166o
            public EnumC0158g getDirection() {
                return ((C0165n) this.f89756b).getDirection();
            }

            @Override // p000.abg.InterfaceC0166o
            public int getDirectionValue() {
                return ((C0165n) this.f89756b).getDirectionValue();
            }

            @Override // p000.abg.InterfaceC0166o
            public C0161j getField() {
                return ((C0165n) this.f89756b).getField();
            }

            @Override // p000.abg.InterfaceC0166o
            public boolean hasField() {
                return ((C0165n) this.f89756b).hasField();
            }

            public a mergeField(C0161j c0161j) {
                m23743e();
                ((C0165n) this.f89756b).mergeField(c0161j);
                return this;
            }

            public a setDirection(EnumC0158g enumC0158g) {
                m23743e();
                ((C0165n) this.f89756b).setDirection(enumC0158g);
                return this;
            }

            public a setDirectionValue(int i) {
                m23743e();
                ((C0165n) this.f89756b).setDirectionValue(i);
                return this;
            }

            public a setField(C0161j c0161j) {
                m23743e();
                ((C0165n) this.f89756b).setField(c0161j);
                return this;
            }

            private a() {
                super(C0165n.DEFAULT_INSTANCE);
            }

            public a setField(C0161j.a aVar) {
                m23743e();
                ((C0165n) this.f89756b).setField(aVar.build());
                return this;
            }
        }

        static {
            C0165n c0165n = new C0165n();
            DEFAULT_INSTANCE = c0165n;
            v27.m23715h0(C0165n.class, c0165n);
        }

        private C0165n() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDirection() {
            this.direction_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearField() {
            this.field_ = null;
            this.bitField0_ &= -2;
        }

        public static C0165n getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeField(C0161j c0161j) {
            c0161j.getClass();
            C0161j c0161j2 = this.field_;
            if (c0161j2 == null || c0161j2 == C0161j.getDefaultInstance()) {
                this.field_ = c0161j;
            } else {
                this.field_ = C0161j.newBuilder(this.field_).mergeFrom(c0161j).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.m23738n();
        }

        public static C0165n parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (C0165n) v27.m23700S(DEFAULT_INSTANCE, inputStream);
        }

        public static C0165n parseFrom(ByteBuffer byteBuffer) throws ce8 {
            return (C0165n) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
        }

        public static uhc<C0165n> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDirection(EnumC0158g enumC0158g) {
            this.direction_ = enumC0158g.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDirectionValue(int i) {
            this.direction_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setField(C0161j c0161j) {
            c0161j.getClass();
            this.field_ = c0161j;
            this.bitField0_ |= 1;
        }

        @Override // p000.abg.InterfaceC0166o
        public EnumC0158g getDirection() {
            EnumC0158g enumC0158gForNumber = EnumC0158g.forNumber(this.direction_);
            return enumC0158gForNumber == null ? EnumC0158g.UNRECOGNIZED : enumC0158gForNumber;
        }

        @Override // p000.abg.InterfaceC0166o
        public int getDirectionValue() {
            return this.direction_;
        }

        @Override // p000.abg.InterfaceC0166o
        public C0161j getField() {
            C0161j c0161j = this.field_;
            return c0161j == null ? C0161j.getDefaultInstance() : c0161j;
        }

        @Override // p000.abg.InterfaceC0166o
        public boolean hasField() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // p000.v27
        /* JADX INFO: renamed from: r */
        public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
            C0152a c0152a = null;
            switch (C0152a.f975a[enumC13830i.ordinal()]) {
                case 1:
                    return new C0165n();
                case 2:
                    return new a(c0152a);
                case 3:
                    return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f", new Object[]{"bitField0_", "field_", "direction_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    uhc<C0165n> c13824c = PARSER;
                    if (c13824c == null) {
                        synchronized (C0165n.class) {
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

        public static a newBuilder(C0165n c0165n) {
            return DEFAULT_INSTANCE.m23739o(c0165n);
        }

        public static C0165n parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
            return (C0165n) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
        }

        public static C0165n parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
            return (C0165n) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
        }

        public static C0165n parseFrom(vj1 vj1Var) throws ce8 {
            return (C0165n) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
        }

        public static C0165n parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
            return (C0165n) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
        }

        public static C0165n parseFrom(byte[] bArr) throws ce8 {
            return (C0165n) v27.m23710c0(DEFAULT_INSTANCE, bArr);
        }

        public static C0165n parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
            return (C0165n) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
        }

        public static C0165n parseFrom(InputStream inputStream) throws IOException {
            return (C0165n) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
        }

        public static C0165n parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
            return (C0165n) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
        }

        public static C0165n parseFrom(f72 f72Var) throws IOException {
            return (C0165n) v27.m23704W(DEFAULT_INSTANCE, f72Var);
        }

        public static C0165n parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
            return (C0165n) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
        }
    }

    /* JADX INFO: renamed from: abg$o */
    public interface InterfaceC0166o extends rsa {
        EnumC0158g getDirection();

        int getDirectionValue();

        C0161j getField();

        boolean hasField();
    }

    /* JADX INFO: renamed from: abg$p */
    public static final class C0167p extends v27<C0167p, a> implements InterfaceC0168q {
        private static final C0167p DEFAULT_INSTANCE;
        public static final int FIELDS_FIELD_NUMBER = 2;
        private static volatile uhc<C0167p> PARSER;
        private w98.InterfaceC14504k<C0161j> fields_ = v27.m23722x();

        /* JADX INFO: renamed from: abg$p$a */
        public static final class a extends v27.AbstractC13823b<C0167p, a> implements InterfaceC0168q {
            public /* synthetic */ a(C0152a c0152a) {
                this();
            }

            public a addAllFields(Iterable<? extends C0161j> iterable) {
                m23743e();
                ((C0167p) this.f89756b).addAllFields(iterable);
                return this;
            }

            public a addFields(C0161j c0161j) {
                m23743e();
                ((C0167p) this.f89756b).addFields(c0161j);
                return this;
            }

            public a clearFields() {
                m23743e();
                ((C0167p) this.f89756b).clearFields();
                return this;
            }

            @Override // p000.abg.InterfaceC0168q
            public C0161j getFields(int i) {
                return ((C0167p) this.f89756b).getFields(i);
            }

            @Override // p000.abg.InterfaceC0168q
            public int getFieldsCount() {
                return ((C0167p) this.f89756b).getFieldsCount();
            }

            @Override // p000.abg.InterfaceC0168q
            public List<C0161j> getFieldsList() {
                return Collections.unmodifiableList(((C0167p) this.f89756b).getFieldsList());
            }

            public a removeFields(int i) {
                m23743e();
                ((C0167p) this.f89756b).removeFields(i);
                return this;
            }

            public a setFields(int i, C0161j c0161j) {
                m23743e();
                ((C0167p) this.f89756b).setFields(i, c0161j);
                return this;
            }

            private a() {
                super(C0167p.DEFAULT_INSTANCE);
            }

            public a addFields(int i, C0161j c0161j) {
                m23743e();
                ((C0167p) this.f89756b).addFields(i, c0161j);
                return this;
            }

            public a setFields(int i, C0161j.a aVar) {
                m23743e();
                ((C0167p) this.f89756b).setFields(i, aVar.build());
                return this;
            }

            public a addFields(C0161j.a aVar) {
                m23743e();
                ((C0167p) this.f89756b).addFields(aVar.build());
                return this;
            }

            public a addFields(int i, C0161j.a aVar) {
                m23743e();
                ((C0167p) this.f89756b).addFields(i, aVar.build());
                return this;
            }
        }

        static {
            C0167p c0167p = new C0167p();
            DEFAULT_INSTANCE = c0167p;
            v27.m23715h0(C0167p.class, c0167p);
        }

        private C0167p() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllFields(Iterable<? extends C0161j> iterable) {
            ensureFieldsIsMutable();
            AbstractC1714b3.m2856b(iterable, this.fields_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addFields(C0161j c0161j) {
            c0161j.getClass();
            ensureFieldsIsMutable();
            this.fields_.add(c0161j);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFields() {
            this.fields_ = v27.m23722x();
        }

        private void ensureFieldsIsMutable() {
            w98.InterfaceC14504k<C0161j> interfaceC14504k = this.fields_;
            if (interfaceC14504k.isModifiable()) {
                return;
            }
            this.fields_ = v27.m23698P(interfaceC14504k);
        }

        public static C0167p getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.m23738n();
        }

        public static C0167p parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (C0167p) v27.m23700S(DEFAULT_INSTANCE, inputStream);
        }

        public static C0167p parseFrom(ByteBuffer byteBuffer) throws ce8 {
            return (C0167p) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
        }

        public static uhc<C0167p> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeFields(int i) {
            ensureFieldsIsMutable();
            this.fields_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFields(int i, C0161j c0161j) {
            c0161j.getClass();
            ensureFieldsIsMutable();
            this.fields_.set(i, c0161j);
        }

        @Override // p000.abg.InterfaceC0168q
        public C0161j getFields(int i) {
            return this.fields_.get(i);
        }

        @Override // p000.abg.InterfaceC0168q
        public int getFieldsCount() {
            return this.fields_.size();
        }

        @Override // p000.abg.InterfaceC0168q
        public List<C0161j> getFieldsList() {
            return this.fields_;
        }

        public InterfaceC0162k getFieldsOrBuilder(int i) {
            return this.fields_.get(i);
        }

        public List<? extends InterfaceC0162k> getFieldsOrBuilderList() {
            return this.fields_;
        }

        @Override // p000.v27
        /* JADX INFO: renamed from: r */
        public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
            C0152a c0152a = null;
            switch (C0152a.f975a[enumC13830i.ordinal()]) {
                case 1:
                    return new C0167p();
                case 2:
                    return new a(c0152a);
                case 3:
                    return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new Object[]{"fields_", C0161j.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    uhc<C0167p> c13824c = PARSER;
                    if (c13824c == null) {
                        synchronized (C0167p.class) {
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

        public static a newBuilder(C0167p c0167p) {
            return DEFAULT_INSTANCE.m23739o(c0167p);
        }

        public static C0167p parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
            return (C0167p) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
        }

        public static C0167p parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
            return (C0167p) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
        }

        public static C0167p parseFrom(vj1 vj1Var) throws ce8 {
            return (C0167p) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addFields(int i, C0161j c0161j) {
            c0161j.getClass();
            ensureFieldsIsMutable();
            this.fields_.add(i, c0161j);
        }

        public static C0167p parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
            return (C0167p) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
        }

        public static C0167p parseFrom(byte[] bArr) throws ce8 {
            return (C0167p) v27.m23710c0(DEFAULT_INSTANCE, bArr);
        }

        public static C0167p parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
            return (C0167p) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
        }

        public static C0167p parseFrom(InputStream inputStream) throws IOException {
            return (C0167p) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
        }

        public static C0167p parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
            return (C0167p) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
        }

        public static C0167p parseFrom(f72 f72Var) throws IOException {
            return (C0167p) v27.m23704W(DEFAULT_INSTANCE, f72Var);
        }

        public static C0167p parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
            return (C0167p) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
        }
    }

    /* JADX INFO: renamed from: abg$q */
    public interface InterfaceC0168q extends rsa {
        C0161j getFields(int i);

        int getFieldsCount();

        List<C0161j> getFieldsList();
    }

    /* JADX INFO: renamed from: abg$r */
    public static final class C0169r extends v27<C0169r, a> implements InterfaceC0170s {
        private static final C0169r DEFAULT_INSTANCE;
        public static final int FIELD_FIELD_NUMBER = 2;
        public static final int OP_FIELD_NUMBER = 1;
        private static volatile uhc<C0169r> PARSER;
        private int op_;
        private int operandTypeCase_ = 0;
        private Object operandType_;

        /* JADX INFO: renamed from: abg$r$a */
        public static final class a extends v27.AbstractC13823b<C0169r, a> implements InterfaceC0170s {
            public /* synthetic */ a(C0152a c0152a) {
                this();
            }

            public a clearField() {
                m23743e();
                ((C0169r) this.f89756b).clearField();
                return this;
            }

            public a clearOp() {
                m23743e();
                ((C0169r) this.f89756b).clearOp();
                return this;
            }

            public a clearOperandType() {
                m23743e();
                ((C0169r) this.f89756b).clearOperandType();
                return this;
            }

            @Override // p000.abg.InterfaceC0170s
            public C0161j getField() {
                return ((C0169r) this.f89756b).getField();
            }

            @Override // p000.abg.InterfaceC0170s
            public c getOp() {
                return ((C0169r) this.f89756b).getOp();
            }

            @Override // p000.abg.InterfaceC0170s
            public int getOpValue() {
                return ((C0169r) this.f89756b).getOpValue();
            }

            @Override // p000.abg.InterfaceC0170s
            public b getOperandTypeCase() {
                return ((C0169r) this.f89756b).getOperandTypeCase();
            }

            @Override // p000.abg.InterfaceC0170s
            public boolean hasField() {
                return ((C0169r) this.f89756b).hasField();
            }

            public a mergeField(C0161j c0161j) {
                m23743e();
                ((C0169r) this.f89756b).mergeField(c0161j);
                return this;
            }

            public a setField(C0161j c0161j) {
                m23743e();
                ((C0169r) this.f89756b).setField(c0161j);
                return this;
            }

            public a setOp(c cVar) {
                m23743e();
                ((C0169r) this.f89756b).setOp(cVar);
                return this;
            }

            public a setOpValue(int i) {
                m23743e();
                ((C0169r) this.f89756b).setOpValue(i);
                return this;
            }

            private a() {
                super(C0169r.DEFAULT_INSTANCE);
            }

            public a setField(C0161j.a aVar) {
                m23743e();
                ((C0169r) this.f89756b).setField(aVar.build());
                return this;
            }
        }

        /* JADX INFO: renamed from: abg$r$b */
        public enum b {
            FIELD(2),
            OPERANDTYPE_NOT_SET(0);


            /* JADX INFO: renamed from: a */
            public final int f1034a;

            b(int i) {
                this.f1034a = i;
            }

            public static b forNumber(int i) {
                if (i == 0) {
                    return OPERANDTYPE_NOT_SET;
                }
                if (i != 2) {
                    return null;
                }
                return FIELD;
            }

            public int getNumber() {
                return this.f1034a;
            }

            @Deprecated
            public static b valueOf(int i) {
                return forNumber(i);
            }
        }

        /* JADX INFO: renamed from: abg$r$c */
        public enum c implements w98.InterfaceC14497d {
            OPERATOR_UNSPECIFIED(0),
            IS_NAN(2),
            IS_NULL(3),
            IS_NOT_NAN(4),
            IS_NOT_NULL(5),
            UNRECOGNIZED(-1);


            /* JADX INFO: renamed from: C */
            public static final int f1035C = 0;

            /* JADX INFO: renamed from: F */
            public static final int f1036F = 2;

            /* JADX INFO: renamed from: H */
            public static final int f1037H = 3;

            /* JADX INFO: renamed from: L */
            public static final int f1038L = 4;

            /* JADX INFO: renamed from: M */
            public static final int f1039M = 5;

            /* JADX INFO: renamed from: N */
            public static final w98.InterfaceC14498e<c> f1040N = new a();

            /* JADX INFO: renamed from: a */
            public final int f1048a;

            /* JADX INFO: renamed from: abg$r$c$a */
            public class a implements w98.InterfaceC14498e<c> {
                @Override // p000.w98.InterfaceC14498e
                public c findValueByNumber(int i) {
                    return c.forNumber(i);
                }
            }

            /* JADX INFO: renamed from: abg$r$c$b */
            public static final class b implements w98.InterfaceC14499f {

                /* JADX INFO: renamed from: a */
                public static final w98.InterfaceC14499f f1049a = new b();

                private b() {
                }

                @Override // p000.w98.InterfaceC14499f
                public boolean isInRange(int i) {
                    return c.forNumber(i) != null;
                }
            }

            c(int i) {
                this.f1048a = i;
            }

            public static c forNumber(int i) {
                if (i == 0) {
                    return OPERATOR_UNSPECIFIED;
                }
                if (i == 2) {
                    return IS_NAN;
                }
                if (i == 3) {
                    return IS_NULL;
                }
                if (i == 4) {
                    return IS_NOT_NAN;
                }
                if (i != 5) {
                    return null;
                }
                return IS_NOT_NULL;
            }

            public static w98.InterfaceC14498e<c> internalGetValueMap() {
                return f1040N;
            }

            public static w98.InterfaceC14499f internalGetVerifier() {
                return b.f1049a;
            }

            @Override // p000.w98.InterfaceC14497d
            public final int getNumber() {
                if (this != UNRECOGNIZED) {
                    return this.f1048a;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }

            @Deprecated
            public static c valueOf(int i) {
                return forNumber(i);
            }
        }

        static {
            C0169r c0169r = new C0169r();
            DEFAULT_INSTANCE = c0169r;
            v27.m23715h0(C0169r.class, c0169r);
        }

        private C0169r() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearField() {
            if (this.operandTypeCase_ == 2) {
                this.operandTypeCase_ = 0;
                this.operandType_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOp() {
            this.op_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOperandType() {
            this.operandTypeCase_ = 0;
            this.operandType_ = null;
        }

        public static C0169r getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeField(C0161j c0161j) {
            c0161j.getClass();
            if (this.operandTypeCase_ != 2 || this.operandType_ == C0161j.getDefaultInstance()) {
                this.operandType_ = c0161j;
            } else {
                this.operandType_ = C0161j.newBuilder((C0161j) this.operandType_).mergeFrom(c0161j).buildPartial();
            }
            this.operandTypeCase_ = 2;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.m23738n();
        }

        public static C0169r parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (C0169r) v27.m23700S(DEFAULT_INSTANCE, inputStream);
        }

        public static C0169r parseFrom(ByteBuffer byteBuffer) throws ce8 {
            return (C0169r) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
        }

        public static uhc<C0169r> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setField(C0161j c0161j) {
            c0161j.getClass();
            this.operandType_ = c0161j;
            this.operandTypeCase_ = 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOp(c cVar) {
            this.op_ = cVar.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOpValue(int i) {
            this.op_ = i;
        }

        @Override // p000.abg.InterfaceC0170s
        public C0161j getField() {
            return this.operandTypeCase_ == 2 ? (C0161j) this.operandType_ : C0161j.getDefaultInstance();
        }

        @Override // p000.abg.InterfaceC0170s
        public c getOp() {
            c cVarForNumber = c.forNumber(this.op_);
            return cVarForNumber == null ? c.UNRECOGNIZED : cVarForNumber;
        }

        @Override // p000.abg.InterfaceC0170s
        public int getOpValue() {
            return this.op_;
        }

        @Override // p000.abg.InterfaceC0170s
        public b getOperandTypeCase() {
            return b.forNumber(this.operandTypeCase_);
        }

        @Override // p000.abg.InterfaceC0170s
        public boolean hasField() {
            return this.operandTypeCase_ == 2;
        }

        @Override // p000.v27
        /* JADX INFO: renamed from: r */
        public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
            C0152a c0152a = null;
            switch (C0152a.f975a[enumC13830i.ordinal()]) {
                case 1:
                    return new C0169r();
                case 2:
                    return new a(c0152a);
                case 3:
                    return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002<\u0000", new Object[]{"operandType_", "operandTypeCase_", "op_", C0161j.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    uhc<C0169r> c13824c = PARSER;
                    if (c13824c == null) {
                        synchronized (C0169r.class) {
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

        public static a newBuilder(C0169r c0169r) {
            return DEFAULT_INSTANCE.m23739o(c0169r);
        }

        public static C0169r parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
            return (C0169r) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
        }

        public static C0169r parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
            return (C0169r) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
        }

        public static C0169r parseFrom(vj1 vj1Var) throws ce8 {
            return (C0169r) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
        }

        public static C0169r parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
            return (C0169r) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
        }

        public static C0169r parseFrom(byte[] bArr) throws ce8 {
            return (C0169r) v27.m23710c0(DEFAULT_INSTANCE, bArr);
        }

        public static C0169r parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
            return (C0169r) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
        }

        public static C0169r parseFrom(InputStream inputStream) throws IOException {
            return (C0169r) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
        }

        public static C0169r parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
            return (C0169r) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
        }

        public static C0169r parseFrom(f72 f72Var) throws IOException {
            return (C0169r) v27.m23704W(DEFAULT_INSTANCE, f72Var);
        }

        public static C0169r parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
            return (C0169r) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
        }
    }

    /* JADX INFO: renamed from: abg$s */
    public interface InterfaceC0170s extends rsa {
        C0161j getField();

        C0169r.c getOp();

        int getOpValue();

        C0169r.b getOperandTypeCase();

        boolean hasField();
    }

    static {
        abg abgVar = new abg();
        DEFAULT_INSTANCE = abgVar;
        v27.m23715h0(abg.class, abgVar);
    }

    private abg() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllFrom(Iterable<? extends C0154c> iterable) {
        ensureFromIsMutable();
        AbstractC1714b3.m2856b(iterable, this.from_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllOrderBy(Iterable<? extends C0165n> iterable) {
        ensureOrderByIsMutable();
        AbstractC1714b3.m2856b(iterable, this.orderBy_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addFrom(C0154c c0154c) {
        c0154c.getClass();
        ensureFromIsMutable();
        this.from_.add(c0154c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOrderBy(C0165n c0165n) {
        c0165n.getClass();
        ensureOrderByIsMutable();
        this.orderBy_.add(c0165n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEndAt() {
        this.endAt_ = null;
        this.bitField0_ &= -9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFrom() {
        this.from_ = v27.m23722x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLimit() {
        this.limit_ = null;
        this.bitField0_ &= -17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOffset() {
        this.offset_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOrderBy() {
        this.orderBy_ = v27.m23722x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSelect() {
        this.select_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStartAt() {
        this.startAt_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWhere() {
        this.where_ = null;
        this.bitField0_ &= -3;
    }

    private void ensureFromIsMutable() {
        w98.InterfaceC14504k<C0154c> interfaceC14504k = this.from_;
        if (interfaceC14504k.isModifiable()) {
            return;
        }
        this.from_ = v27.m23698P(interfaceC14504k);
    }

    private void ensureOrderByIsMutable() {
        w98.InterfaceC14504k<C0165n> interfaceC14504k = this.orderBy_;
        if (interfaceC14504k.isModifiable()) {
            return;
        }
        this.orderBy_ = v27.m23698P(interfaceC14504k);
    }

    public static abg getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeEndAt(ga3 ga3Var) {
        ga3Var.getClass();
        ga3 ga3Var2 = this.endAt_;
        if (ga3Var2 == null || ga3Var2 == ga3.getDefaultInstance()) {
            this.endAt_ = ga3Var;
        } else {
            this.endAt_ = ga3.newBuilder(this.endAt_).mergeFrom(ga3Var).buildPartial();
        }
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLimit(t58 t58Var) {
        t58Var.getClass();
        t58 t58Var2 = this.limit_;
        if (t58Var2 == null || t58Var2 == t58.getDefaultInstance()) {
            this.limit_ = t58Var;
        } else {
            this.limit_ = t58.newBuilder(this.limit_).mergeFrom(t58Var).buildPartial();
        }
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSelect(C0167p c0167p) {
        c0167p.getClass();
        C0167p c0167p2 = this.select_;
        if (c0167p2 == null || c0167p2 == C0167p.getDefaultInstance()) {
            this.select_ = c0167p;
        } else {
            this.select_ = C0167p.newBuilder(this.select_).mergeFrom(c0167p).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeStartAt(ga3 ga3Var) {
        ga3Var.getClass();
        ga3 ga3Var2 = this.startAt_;
        if (ga3Var2 == null || ga3Var2 == ga3.getDefaultInstance()) {
            this.startAt_ = ga3Var;
        } else {
            this.startAt_ = ga3.newBuilder(this.startAt_).mergeFrom(ga3Var).buildPartial();
        }
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeWhere(C0163l c0163l) {
        c0163l.getClass();
        C0163l c0163l2 = this.where_;
        if (c0163l2 == null || c0163l2 == C0163l.getDefaultInstance()) {
            this.where_ = c0163l;
        } else {
            this.where_ = C0163l.newBuilder(this.where_).mergeFrom(c0163l).buildPartial();
        }
        this.bitField0_ |= 2;
    }

    public static C0153b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    public static abg parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (abg) v27.m23700S(DEFAULT_INSTANCE, inputStream);
    }

    public static abg parseFrom(ByteBuffer byteBuffer) throws ce8 {
        return (abg) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static uhc<abg> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeFrom(int i) {
        ensureFromIsMutable();
        this.from_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeOrderBy(int i) {
        ensureOrderByIsMutable();
        this.orderBy_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEndAt(ga3 ga3Var) {
        ga3Var.getClass();
        this.endAt_ = ga3Var;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFrom(int i, C0154c c0154c) {
        c0154c.getClass();
        ensureFromIsMutable();
        this.from_.set(i, c0154c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLimit(t58 t58Var) {
        t58Var.getClass();
        this.limit_ = t58Var;
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOffset(int i) {
        this.offset_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOrderBy(int i, C0165n c0165n) {
        c0165n.getClass();
        ensureOrderByIsMutable();
        this.orderBy_.set(i, c0165n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSelect(C0167p c0167p) {
        c0167p.getClass();
        this.select_ = c0167p;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStartAt(ga3 ga3Var) {
        ga3Var.getClass();
        this.startAt_ = ga3Var;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWhere(C0163l c0163l) {
        c0163l.getClass();
        this.where_ = c0163l;
        this.bitField0_ |= 2;
    }

    @Override // p000.bbg
    public ga3 getEndAt() {
        ga3 ga3Var = this.endAt_;
        return ga3Var == null ? ga3.getDefaultInstance() : ga3Var;
    }

    @Override // p000.bbg
    public C0154c getFrom(int i) {
        return this.from_.get(i);
    }

    @Override // p000.bbg
    public int getFromCount() {
        return this.from_.size();
    }

    @Override // p000.bbg
    public List<C0154c> getFromList() {
        return this.from_;
    }

    public InterfaceC0155d getFromOrBuilder(int i) {
        return this.from_.get(i);
    }

    public List<? extends InterfaceC0155d> getFromOrBuilderList() {
        return this.from_;
    }

    @Override // p000.bbg
    public t58 getLimit() {
        t58 t58Var = this.limit_;
        return t58Var == null ? t58.getDefaultInstance() : t58Var;
    }

    @Override // p000.bbg
    public int getOffset() {
        return this.offset_;
    }

    @Override // p000.bbg
    public C0165n getOrderBy(int i) {
        return this.orderBy_.get(i);
    }

    @Override // p000.bbg
    public int getOrderByCount() {
        return this.orderBy_.size();
    }

    @Override // p000.bbg
    public List<C0165n> getOrderByList() {
        return this.orderBy_;
    }

    public InterfaceC0166o getOrderByOrBuilder(int i) {
        return this.orderBy_.get(i);
    }

    public List<? extends InterfaceC0166o> getOrderByOrBuilderList() {
        return this.orderBy_;
    }

    @Override // p000.bbg
    public C0167p getSelect() {
        C0167p c0167p = this.select_;
        return c0167p == null ? C0167p.getDefaultInstance() : c0167p;
    }

    @Override // p000.bbg
    public ga3 getStartAt() {
        ga3 ga3Var = this.startAt_;
        return ga3Var == null ? ga3.getDefaultInstance() : ga3Var;
    }

    @Override // p000.bbg
    public C0163l getWhere() {
        C0163l c0163l = this.where_;
        return c0163l == null ? C0163l.getDefaultInstance() : c0163l;
    }

    @Override // p000.bbg
    public boolean hasEndAt() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // p000.bbg
    public boolean hasLimit() {
        return (this.bitField0_ & 16) != 0;
    }

    @Override // p000.bbg
    public boolean hasSelect() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // p000.bbg
    public boolean hasStartAt() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // p000.bbg
    public boolean hasWhere() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
        C0152a c0152a = null;
        switch (C0152a.f975a[enumC13830i.ordinal()]) {
            case 1:
                return new abg();
            case 2:
                return new C0153b(c0152a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0002\u0000\u0001ဉ\u0000\u0002\u001b\u0003ဉ\u0001\u0004\u001b\u0005ဉ\u0004\u0006\u0004\u0007ဉ\u0002\bဉ\u0003", new Object[]{"bitField0_", "select_", "from_", C0154c.class, "where_", "orderBy_", C0165n.class, "limit_", "offset_", "startAt_", "endAt_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<abg> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (abg.class) {
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

    public static C0153b newBuilder(abg abgVar) {
        return DEFAULT_INSTANCE.m23739o(abgVar);
    }

    public static abg parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (abg) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static abg parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
        return (abg) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
    }

    public static abg parseFrom(vj1 vj1Var) throws ce8 {
        return (abg) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addFrom(int i, C0154c c0154c) {
        c0154c.getClass();
        ensureFromIsMutable();
        this.from_.add(i, c0154c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOrderBy(int i, C0165n c0165n) {
        c0165n.getClass();
        ensureOrderByIsMutable();
        this.orderBy_.add(i, c0165n);
    }

    public static abg parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
        return (abg) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
    }

    public static abg parseFrom(byte[] bArr) throws ce8 {
        return (abg) v27.m23710c0(DEFAULT_INSTANCE, bArr);
    }

    public static abg parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
        return (abg) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
    }

    public static abg parseFrom(InputStream inputStream) throws IOException {
        return (abg) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
    }

    public static abg parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (abg) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static abg parseFrom(f72 f72Var) throws IOException {
        return (abg) v27.m23704W(DEFAULT_INSTANCE, f72Var);
    }

    public static abg parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
        return (abg) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
    }
}
