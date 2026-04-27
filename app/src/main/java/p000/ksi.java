package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import p000.b2i;
import p000.f2h;
import p000.v27;
import p000.w98;

/* JADX INFO: loaded from: classes5.dex */
public final class ksi extends v27<ksi, C8518b> implements lsi {
    private static final ksi DEFAULT_INSTANCE;
    private static volatile uhc<ksi> PARSER = null;
    public static final int TRANSFORM_RESULTS_FIELD_NUMBER = 2;
    public static final int UPDATE_TIME_FIELD_NUMBER = 1;
    private int bitField0_;
    private w98.InterfaceC14504k<b2i> transformResults_ = v27.m23722x();
    private f2h updateTime_;

    /* JADX INFO: renamed from: ksi$a */
    public static /* synthetic */ class C8517a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f55268a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f55268a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f55268a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f55268a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f55268a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f55268a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f55268a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f55268a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: ksi$b */
    public static final class C8518b extends v27.AbstractC13823b<ksi, C8518b> implements lsi {
        public /* synthetic */ C8518b(C8517a c8517a) {
            this();
        }

        public C8518b addAllTransformResults(Iterable<? extends b2i> iterable) {
            m23743e();
            ((ksi) this.f89756b).addAllTransformResults(iterable);
            return this;
        }

        public C8518b addTransformResults(b2i b2iVar) {
            m23743e();
            ((ksi) this.f89756b).addTransformResults(b2iVar);
            return this;
        }

        public C8518b clearTransformResults() {
            m23743e();
            ((ksi) this.f89756b).clearTransformResults();
            return this;
        }

        public C8518b clearUpdateTime() {
            m23743e();
            ((ksi) this.f89756b).clearUpdateTime();
            return this;
        }

        @Override // p000.lsi
        public b2i getTransformResults(int i) {
            return ((ksi) this.f89756b).getTransformResults(i);
        }

        @Override // p000.lsi
        public int getTransformResultsCount() {
            return ((ksi) this.f89756b).getTransformResultsCount();
        }

        @Override // p000.lsi
        public List<b2i> getTransformResultsList() {
            return Collections.unmodifiableList(((ksi) this.f89756b).getTransformResultsList());
        }

        @Override // p000.lsi
        public f2h getUpdateTime() {
            return ((ksi) this.f89756b).getUpdateTime();
        }

        @Override // p000.lsi
        public boolean hasUpdateTime() {
            return ((ksi) this.f89756b).hasUpdateTime();
        }

        public C8518b mergeUpdateTime(f2h f2hVar) {
            m23743e();
            ((ksi) this.f89756b).mergeUpdateTime(f2hVar);
            return this;
        }

        public C8518b removeTransformResults(int i) {
            m23743e();
            ((ksi) this.f89756b).removeTransformResults(i);
            return this;
        }

        public C8518b setTransformResults(int i, b2i b2iVar) {
            m23743e();
            ((ksi) this.f89756b).setTransformResults(i, b2iVar);
            return this;
        }

        public C8518b setUpdateTime(f2h f2hVar) {
            m23743e();
            ((ksi) this.f89756b).setUpdateTime(f2hVar);
            return this;
        }

        private C8518b() {
            super(ksi.DEFAULT_INSTANCE);
        }

        public C8518b addTransformResults(int i, b2i b2iVar) {
            m23743e();
            ((ksi) this.f89756b).addTransformResults(i, b2iVar);
            return this;
        }

        public C8518b setTransformResults(int i, b2i.C1712b c1712b) {
            m23743e();
            ((ksi) this.f89756b).setTransformResults(i, c1712b.build());
            return this;
        }

        public C8518b setUpdateTime(f2h.C5567b c5567b) {
            m23743e();
            ((ksi) this.f89756b).setUpdateTime(c5567b.build());
            return this;
        }

        public C8518b addTransformResults(b2i.C1712b c1712b) {
            m23743e();
            ((ksi) this.f89756b).addTransformResults(c1712b.build());
            return this;
        }

        public C8518b addTransformResults(int i, b2i.C1712b c1712b) {
            m23743e();
            ((ksi) this.f89756b).addTransformResults(i, c1712b.build());
            return this;
        }
    }

    static {
        ksi ksiVar = new ksi();
        DEFAULT_INSTANCE = ksiVar;
        v27.m23715h0(ksi.class, ksiVar);
    }

    private ksi() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllTransformResults(Iterable<? extends b2i> iterable) {
        ensureTransformResultsIsMutable();
        AbstractC1714b3.m2856b(iterable, this.transformResults_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTransformResults(b2i b2iVar) {
        b2iVar.getClass();
        ensureTransformResultsIsMutable();
        this.transformResults_.add(b2iVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTransformResults() {
        this.transformResults_ = v27.m23722x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUpdateTime() {
        this.updateTime_ = null;
        this.bitField0_ &= -2;
    }

    private void ensureTransformResultsIsMutable() {
        w98.InterfaceC14504k<b2i> interfaceC14504k = this.transformResults_;
        if (interfaceC14504k.isModifiable()) {
            return;
        }
        this.transformResults_ = v27.m23698P(interfaceC14504k);
    }

    public static ksi getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUpdateTime(f2h f2hVar) {
        f2hVar.getClass();
        f2h f2hVar2 = this.updateTime_;
        if (f2hVar2 == null || f2hVar2 == f2h.getDefaultInstance()) {
            this.updateTime_ = f2hVar;
        } else {
            this.updateTime_ = f2h.newBuilder(this.updateTime_).mergeFrom(f2hVar).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static C8518b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    public static ksi parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ksi) v27.m23700S(DEFAULT_INSTANCE, inputStream);
    }

    public static ksi parseFrom(ByteBuffer byteBuffer) throws ce8 {
        return (ksi) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static uhc<ksi> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeTransformResults(int i) {
        ensureTransformResultsIsMutable();
        this.transformResults_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTransformResults(int i, b2i b2iVar) {
        b2iVar.getClass();
        ensureTransformResultsIsMutable();
        this.transformResults_.set(i, b2iVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUpdateTime(f2h f2hVar) {
        f2hVar.getClass();
        this.updateTime_ = f2hVar;
        this.bitField0_ |= 1;
    }

    @Override // p000.lsi
    public b2i getTransformResults(int i) {
        return this.transformResults_.get(i);
    }

    @Override // p000.lsi
    public int getTransformResultsCount() {
        return this.transformResults_.size();
    }

    @Override // p000.lsi
    public List<b2i> getTransformResultsList() {
        return this.transformResults_;
    }

    public o2i getTransformResultsOrBuilder(int i) {
        return this.transformResults_.get(i);
    }

    public List<? extends o2i> getTransformResultsOrBuilderList() {
        return this.transformResults_;
    }

    @Override // p000.lsi
    public f2h getUpdateTime() {
        f2h f2hVar = this.updateTime_;
        return f2hVar == null ? f2h.getDefaultInstance() : f2hVar;
    }

    @Override // p000.lsi
    public boolean hasUpdateTime() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
        C8517a c8517a = null;
        switch (C8517a.f55268a[enumC13830i.ordinal()]) {
            case 1:
                return new ksi();
            case 2:
                return new C8518b(c8517a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"bitField0_", "updateTime_", "transformResults_", b2i.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<ksi> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (ksi.class) {
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

    public static C8518b newBuilder(ksi ksiVar) {
        return DEFAULT_INSTANCE.m23739o(ksiVar);
    }

    public static ksi parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (ksi) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static ksi parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
        return (ksi) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
    }

    public static ksi parseFrom(vj1 vj1Var) throws ce8 {
        return (ksi) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTransformResults(int i, b2i b2iVar) {
        b2iVar.getClass();
        ensureTransformResultsIsMutable();
        this.transformResults_.add(i, b2iVar);
    }

    public static ksi parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
        return (ksi) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
    }

    public static ksi parseFrom(byte[] bArr) throws ce8 {
        return (ksi) v27.m23710c0(DEFAULT_INSTANCE, bArr);
    }

    public static ksi parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
        return (ksi) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
    }

    public static ksi parseFrom(InputStream inputStream) throws IOException {
        return (ksi) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
    }

    public static ksi parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (ksi) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static ksi parseFrom(f72 f72Var) throws IOException {
        return (ksi) v27.m23704W(DEFAULT_INSTANCE, f72Var);
    }

    public static ksi parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
        return (ksi) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
    }
}
