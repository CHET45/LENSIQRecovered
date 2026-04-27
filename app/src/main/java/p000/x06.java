package p000;

import java.util.Iterator;
import p000.AbstractC15982z4;
import p000.c3f;
import p000.rua;

/* JADX INFO: loaded from: classes5.dex */
@mc7
public final class x06 {

    /* JADX INFO: renamed from: A */
    public static final int f95894A = 11;

    /* JADX INFO: renamed from: B */
    public static final int f95895B = 12;

    /* JADX INFO: renamed from: C */
    public static final int f95896C = 13;

    /* JADX INFO: renamed from: D */
    public static volatile k4f f95897D = null;

    /* JADX INFO: renamed from: a */
    public static final String f95898a = "google.firestore.v1.Firestore";

    /* JADX INFO: renamed from: b */
    public static volatile rua<h47, nh4> f95899b = null;

    /* JADX INFO: renamed from: c */
    public static volatile rua<u89, w89> f95900c = null;

    /* JADX INFO: renamed from: d */
    public static volatile rua<iwh, nh4> f95901d = null;

    /* JADX INFO: renamed from: e */
    public static volatile rua<a54, qz4> f95902e = null;

    /* JADX INFO: renamed from: f */
    public static volatile rua<ow0, qw0> f95903f = null;

    /* JADX INFO: renamed from: g */
    public static volatile rua<k01, m01> f95904g = null;

    /* JADX INFO: renamed from: h */
    public static volatile rua<wb2, yb2> f95905h = null;

    /* JADX INFO: renamed from: i */
    public static volatile rua<lae, qz4> f95906i = null;

    /* JADX INFO: renamed from: j */
    public static volatile rua<dde, fde> f95907j = null;

    /* JADX INFO: renamed from: k */
    public static volatile rua<uce, wce> f95908k = null;

    /* JADX INFO: renamed from: l */
    public static volatile rua<gsi, isi> f95909l = null;

    /* JADX INFO: renamed from: m */
    public static volatile rua<da9, fa9> f95910m = null;

    /* JADX INFO: renamed from: n */
    public static volatile rua<o89, q89> f95911n = null;

    /* JADX INFO: renamed from: o */
    public static volatile rua<v53, nh4> f95912o = null;

    /* JADX INFO: renamed from: p */
    public static final int f95913p = 0;

    /* JADX INFO: renamed from: q */
    public static final int f95914q = 1;

    /* JADX INFO: renamed from: r */
    public static final int f95915r = 2;

    /* JADX INFO: renamed from: s */
    public static final int f95916s = 3;

    /* JADX INFO: renamed from: t */
    public static final int f95917t = 4;

    /* JADX INFO: renamed from: u */
    public static final int f95918u = 5;

    /* JADX INFO: renamed from: v */
    public static final int f95919v = 6;

    /* JADX INFO: renamed from: w */
    public static final int f95920w = 7;

    /* JADX INFO: renamed from: x */
    public static final int f95921x = 8;

    /* JADX INFO: renamed from: y */
    public static final int f95922y = 9;

    /* JADX INFO: renamed from: z */
    public static final int f95923z = 10;

    /* JADX INFO: renamed from: x06$a */
    public class C14855a implements AbstractC15982z4.a<C14862h> {
        @Override // p000.AbstractC15982z4.a
        public C14862h newStub(bu1 bu1Var, rn1 rn1Var) {
            return new C14862h(bu1Var, rn1Var, null);
        }
    }

    /* JADX INFO: renamed from: x06$b */
    public class C14856b implements AbstractC15982z4.a<C14859e> {
        @Override // p000.AbstractC15982z4.a
        public C14859e newStub(bu1 bu1Var, rn1 rn1Var) {
            return new C14859e(bu1Var, rn1Var, null);
        }
    }

    /* JADX INFO: renamed from: x06$c */
    public class C14857c implements AbstractC15982z4.a<C14860f> {
        @Override // p000.AbstractC15982z4.a
        public C14860f newStub(bu1 bu1Var, rn1 rn1Var) {
            return new C14860f(bu1Var, rn1Var, null);
        }
    }

    /* JADX INFO: renamed from: x06$d */
    public interface InterfaceC14858d {
        default void batchGetDocuments(ow0 ow0Var, c6g<qw0> c6gVar) {
            c3f.asyncUnimplementedUnaryCall(x06.getBatchGetDocumentsMethod(), c6gVar);
        }

        default void beginTransaction(k01 k01Var, c6g<m01> c6gVar) {
            c3f.asyncUnimplementedUnaryCall(x06.getBeginTransactionMethod(), c6gVar);
        }

        default void commit(wb2 wb2Var, c6g<yb2> c6gVar) {
            c3f.asyncUnimplementedUnaryCall(x06.getCommitMethod(), c6gVar);
        }

        default void createDocument(v53 v53Var, c6g<nh4> c6gVar) {
            c3f.asyncUnimplementedUnaryCall(x06.getCreateDocumentMethod(), c6gVar);
        }

        default void deleteDocument(a54 a54Var, c6g<qz4> c6gVar) {
            c3f.asyncUnimplementedUnaryCall(x06.getDeleteDocumentMethod(), c6gVar);
        }

        default void getDocument(h47 h47Var, c6g<nh4> c6gVar) {
            c3f.asyncUnimplementedUnaryCall(x06.getGetDocumentMethod(), c6gVar);
        }

        default void listCollectionIds(o89 o89Var, c6g<q89> c6gVar) {
            c3f.asyncUnimplementedUnaryCall(x06.getListCollectionIdsMethod(), c6gVar);
        }

        default void listDocuments(u89 u89Var, c6g<w89> c6gVar) {
            c3f.asyncUnimplementedUnaryCall(x06.getListDocumentsMethod(), c6gVar);
        }

        default c6g<da9> listen(c6g<fa9> c6gVar) {
            return c3f.asyncUnimplementedStreamingCall(x06.getListenMethod(), c6gVar);
        }

        default void rollback(lae laeVar, c6g<qz4> c6gVar) {
            c3f.asyncUnimplementedUnaryCall(x06.getRollbackMethod(), c6gVar);
        }

        default void runAggregationQuery(uce uceVar, c6g<wce> c6gVar) {
            c3f.asyncUnimplementedUnaryCall(x06.getRunAggregationQueryMethod(), c6gVar);
        }

        default void runQuery(dde ddeVar, c6g<fde> c6gVar) {
            c3f.asyncUnimplementedUnaryCall(x06.getRunQueryMethod(), c6gVar);
        }

        default void updateDocument(iwh iwhVar, c6g<nh4> c6gVar) {
            c3f.asyncUnimplementedUnaryCall(x06.getUpdateDocumentMethod(), c6gVar);
        }

        default c6g<gsi> write(c6g<isi> c6gVar) {
            return c3f.asyncUnimplementedStreamingCall(x06.getWriteMethod(), c6gVar);
        }
    }

    /* JADX INFO: renamed from: x06$e */
    public static final class C14859e extends AbstractC6667h0<C14859e> {
        public /* synthetic */ C14859e(bu1 bu1Var, rn1 rn1Var, C14855a c14855a) {
            this(bu1Var, rn1Var);
        }

        @Override // p000.AbstractC15982z4
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C14859e mo24886a(bu1 bu1Var, rn1 rn1Var) {
            return new C14859e(bu1Var, rn1Var);
        }

        public Iterator<qw0> batchGetDocuments(ow0 ow0Var) {
            return z22.blockingServerStreamingCall(getChannel(), x06.getBatchGetDocumentsMethod(), getCallOptions(), ow0Var);
        }

        public m01 beginTransaction(k01 k01Var) {
            return (m01) z22.blockingUnaryCall(getChannel(), x06.getBeginTransactionMethod(), getCallOptions(), k01Var);
        }

        public yb2 commit(wb2 wb2Var) {
            return (yb2) z22.blockingUnaryCall(getChannel(), x06.getCommitMethod(), getCallOptions(), wb2Var);
        }

        public nh4 createDocument(v53 v53Var) {
            return (nh4) z22.blockingUnaryCall(getChannel(), x06.getCreateDocumentMethod(), getCallOptions(), v53Var);
        }

        public qz4 deleteDocument(a54 a54Var) {
            return (qz4) z22.blockingUnaryCall(getChannel(), x06.getDeleteDocumentMethod(), getCallOptions(), a54Var);
        }

        public nh4 getDocument(h47 h47Var) {
            return (nh4) z22.blockingUnaryCall(getChannel(), x06.getGetDocumentMethod(), getCallOptions(), h47Var);
        }

        public q89 listCollectionIds(o89 o89Var) {
            return (q89) z22.blockingUnaryCall(getChannel(), x06.getListCollectionIdsMethod(), getCallOptions(), o89Var);
        }

        public w89 listDocuments(u89 u89Var) {
            return (w89) z22.blockingUnaryCall(getChannel(), x06.getListDocumentsMethod(), getCallOptions(), u89Var);
        }

        public qz4 rollback(lae laeVar) {
            return (qz4) z22.blockingUnaryCall(getChannel(), x06.getRollbackMethod(), getCallOptions(), laeVar);
        }

        public Iterator<wce> runAggregationQuery(uce uceVar) {
            return z22.blockingServerStreamingCall(getChannel(), x06.getRunAggregationQueryMethod(), getCallOptions(), uceVar);
        }

        public Iterator<fde> runQuery(dde ddeVar) {
            return z22.blockingServerStreamingCall(getChannel(), x06.getRunQueryMethod(), getCallOptions(), ddeVar);
        }

        public nh4 updateDocument(iwh iwhVar) {
            return (nh4) z22.blockingUnaryCall(getChannel(), x06.getUpdateDocumentMethod(), getCallOptions(), iwhVar);
        }

        private C14859e(bu1 bu1Var, rn1 rn1Var) {
            super(bu1Var, rn1Var);
        }
    }

    /* JADX INFO: renamed from: x06$f */
    public static final class C14860f extends AbstractC10131o1<C14860f> {
        public /* synthetic */ C14860f(bu1 bu1Var, rn1 rn1Var, C14855a c14855a) {
            this(bu1Var, rn1Var);
        }

        @Override // p000.AbstractC15982z4
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C14860f mo24886a(bu1 bu1Var, rn1 rn1Var) {
            return new C14860f(bu1Var, rn1Var);
        }

        public ja9<m01> beginTransaction(k01 k01Var) {
            return z22.futureUnaryCall(getChannel().newCall(x06.getBeginTransactionMethod(), getCallOptions()), k01Var);
        }

        public ja9<yb2> commit(wb2 wb2Var) {
            return z22.futureUnaryCall(getChannel().newCall(x06.getCommitMethod(), getCallOptions()), wb2Var);
        }

        public ja9<nh4> createDocument(v53 v53Var) {
            return z22.futureUnaryCall(getChannel().newCall(x06.getCreateDocumentMethod(), getCallOptions()), v53Var);
        }

        public ja9<qz4> deleteDocument(a54 a54Var) {
            return z22.futureUnaryCall(getChannel().newCall(x06.getDeleteDocumentMethod(), getCallOptions()), a54Var);
        }

        public ja9<nh4> getDocument(h47 h47Var) {
            return z22.futureUnaryCall(getChannel().newCall(x06.getGetDocumentMethod(), getCallOptions()), h47Var);
        }

        public ja9<q89> listCollectionIds(o89 o89Var) {
            return z22.futureUnaryCall(getChannel().newCall(x06.getListCollectionIdsMethod(), getCallOptions()), o89Var);
        }

        public ja9<w89> listDocuments(u89 u89Var) {
            return z22.futureUnaryCall(getChannel().newCall(x06.getListDocumentsMethod(), getCallOptions()), u89Var);
        }

        public ja9<qz4> rollback(lae laeVar) {
            return z22.futureUnaryCall(getChannel().newCall(x06.getRollbackMethod(), getCallOptions()), laeVar);
        }

        public ja9<nh4> updateDocument(iwh iwhVar) {
            return z22.futureUnaryCall(getChannel().newCall(x06.getUpdateDocumentMethod(), getCallOptions()), iwhVar);
        }

        private C14860f(bu1 bu1Var, rn1 rn1Var) {
            super(bu1Var, rn1Var);
        }
    }

    /* JADX INFO: renamed from: x06$g */
    public static abstract class AbstractC14861g implements o21, InterfaceC14858d {
        @Override // p000.o21
        public final p3f bindService() {
            return x06.bindService(this);
        }
    }

    /* JADX INFO: renamed from: x06$h */
    public static final class C14862h extends AbstractC15361y<C14862h> {
        public /* synthetic */ C14862h(bu1 bu1Var, rn1 rn1Var, C14855a c14855a) {
            this(bu1Var, rn1Var);
        }

        @Override // p000.AbstractC15982z4
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C14862h mo24886a(bu1 bu1Var, rn1 rn1Var) {
            return new C14862h(bu1Var, rn1Var);
        }

        public void batchGetDocuments(ow0 ow0Var, c6g<qw0> c6gVar) {
            z22.asyncServerStreamingCall(getChannel().newCall(x06.getBatchGetDocumentsMethod(), getCallOptions()), ow0Var, c6gVar);
        }

        public void beginTransaction(k01 k01Var, c6g<m01> c6gVar) {
            z22.asyncUnaryCall(getChannel().newCall(x06.getBeginTransactionMethod(), getCallOptions()), k01Var, c6gVar);
        }

        public void commit(wb2 wb2Var, c6g<yb2> c6gVar) {
            z22.asyncUnaryCall(getChannel().newCall(x06.getCommitMethod(), getCallOptions()), wb2Var, c6gVar);
        }

        public void createDocument(v53 v53Var, c6g<nh4> c6gVar) {
            z22.asyncUnaryCall(getChannel().newCall(x06.getCreateDocumentMethod(), getCallOptions()), v53Var, c6gVar);
        }

        public void deleteDocument(a54 a54Var, c6g<qz4> c6gVar) {
            z22.asyncUnaryCall(getChannel().newCall(x06.getDeleteDocumentMethod(), getCallOptions()), a54Var, c6gVar);
        }

        public void getDocument(h47 h47Var, c6g<nh4> c6gVar) {
            z22.asyncUnaryCall(getChannel().newCall(x06.getGetDocumentMethod(), getCallOptions()), h47Var, c6gVar);
        }

        public void listCollectionIds(o89 o89Var, c6g<q89> c6gVar) {
            z22.asyncUnaryCall(getChannel().newCall(x06.getListCollectionIdsMethod(), getCallOptions()), o89Var, c6gVar);
        }

        public void listDocuments(u89 u89Var, c6g<w89> c6gVar) {
            z22.asyncUnaryCall(getChannel().newCall(x06.getListDocumentsMethod(), getCallOptions()), u89Var, c6gVar);
        }

        public c6g<da9> listen(c6g<fa9> c6gVar) {
            return z22.asyncBidiStreamingCall(getChannel().newCall(x06.getListenMethod(), getCallOptions()), c6gVar);
        }

        public void rollback(lae laeVar, c6g<qz4> c6gVar) {
            z22.asyncUnaryCall(getChannel().newCall(x06.getRollbackMethod(), getCallOptions()), laeVar, c6gVar);
        }

        public void runAggregationQuery(uce uceVar, c6g<wce> c6gVar) {
            z22.asyncServerStreamingCall(getChannel().newCall(x06.getRunAggregationQueryMethod(), getCallOptions()), uceVar, c6gVar);
        }

        public void runQuery(dde ddeVar, c6g<fde> c6gVar) {
            z22.asyncServerStreamingCall(getChannel().newCall(x06.getRunQueryMethod(), getCallOptions()), ddeVar, c6gVar);
        }

        public void updateDocument(iwh iwhVar, c6g<nh4> c6gVar) {
            z22.asyncUnaryCall(getChannel().newCall(x06.getUpdateDocumentMethod(), getCallOptions()), iwhVar, c6gVar);
        }

        public c6g<gsi> write(c6g<isi> c6gVar) {
            return z22.asyncBidiStreamingCall(getChannel().newCall(x06.getWriteMethod(), getCallOptions()), c6gVar);
        }

        private C14862h(bu1 bu1Var, rn1 rn1Var) {
            super(bu1Var, rn1Var);
        }
    }

    private x06() {
    }

    public static final p3f bindService(InterfaceC14858d interfaceC14858d) {
        return p3f.builder(getServiceDescriptor()).addMethod(getGetDocumentMethod(), c3f.asyncUnaryCall(new C14863i(interfaceC14858d, 0))).addMethod(getListDocumentsMethod(), c3f.asyncUnaryCall(new C14863i(interfaceC14858d, 1))).addMethod(getUpdateDocumentMethod(), c3f.asyncUnaryCall(new C14863i(interfaceC14858d, 2))).addMethod(getDeleteDocumentMethod(), c3f.asyncUnaryCall(new C14863i(interfaceC14858d, 3))).addMethod(getBatchGetDocumentsMethod(), c3f.asyncServerStreamingCall(new C14863i(interfaceC14858d, 4))).addMethod(getBeginTransactionMethod(), c3f.asyncUnaryCall(new C14863i(interfaceC14858d, 5))).addMethod(getCommitMethod(), c3f.asyncUnaryCall(new C14863i(interfaceC14858d, 6))).addMethod(getRollbackMethod(), c3f.asyncUnaryCall(new C14863i(interfaceC14858d, 7))).addMethod(getRunQueryMethod(), c3f.asyncServerStreamingCall(new C14863i(interfaceC14858d, 8))).addMethod(getRunAggregationQueryMethod(), c3f.asyncServerStreamingCall(new C14863i(interfaceC14858d, 9))).addMethod(getWriteMethod(), c3f.asyncBidiStreamingCall(new C14863i(interfaceC14858d, 12))).addMethod(getListenMethod(), c3f.asyncBidiStreamingCall(new C14863i(interfaceC14858d, 13))).addMethod(getListCollectionIdsMethod(), c3f.asyncUnaryCall(new C14863i(interfaceC14858d, 10))).addMethod(getCreateDocumentMethod(), c3f.asyncUnaryCall(new C14863i(interfaceC14858d, 11))).build();
    }

    @jce(fullMethodName = "google.firestore.v1.Firestore/BatchGetDocuments", methodType = rua.EnumC12303d.SERVER_STREAMING, requestType = ow0.class, responseType = qw0.class)
    public static rua<ow0, qw0> getBatchGetDocumentsMethod() {
        rua<ow0, qw0> ruaVarBuild = f95903f;
        if (ruaVarBuild == null) {
            synchronized (x06.class) {
                try {
                    ruaVarBuild = f95903f;
                    if (ruaVarBuild == null) {
                        ruaVarBuild = rua.newBuilder().setType(rua.EnumC12303d.SERVER_STREAMING).setFullMethodName(rua.generateFullMethodName(f95898a, "BatchGetDocuments")).setSampledToLocalTracing(true).setRequestMarshaller(ghd.marshaller(ow0.getDefaultInstance())).setResponseMarshaller(ghd.marshaller(qw0.getDefaultInstance())).build();
                        f95903f = ruaVarBuild;
                    }
                } finally {
                }
            }
        }
        return ruaVarBuild;
    }

    @jce(fullMethodName = "google.firestore.v1.Firestore/BeginTransaction", methodType = rua.EnumC12303d.UNARY, requestType = k01.class, responseType = m01.class)
    public static rua<k01, m01> getBeginTransactionMethod() {
        rua<k01, m01> ruaVarBuild = f95904g;
        if (ruaVarBuild == null) {
            synchronized (x06.class) {
                try {
                    ruaVarBuild = f95904g;
                    if (ruaVarBuild == null) {
                        ruaVarBuild = rua.newBuilder().setType(rua.EnumC12303d.UNARY).setFullMethodName(rua.generateFullMethodName(f95898a, "BeginTransaction")).setSampledToLocalTracing(true).setRequestMarshaller(ghd.marshaller(k01.getDefaultInstance())).setResponseMarshaller(ghd.marshaller(m01.getDefaultInstance())).build();
                        f95904g = ruaVarBuild;
                    }
                } finally {
                }
            }
        }
        return ruaVarBuild;
    }

    @jce(fullMethodName = "google.firestore.v1.Firestore/Commit", methodType = rua.EnumC12303d.UNARY, requestType = wb2.class, responseType = yb2.class)
    public static rua<wb2, yb2> getCommitMethod() {
        rua<wb2, yb2> ruaVarBuild = f95905h;
        if (ruaVarBuild == null) {
            synchronized (x06.class) {
                try {
                    ruaVarBuild = f95905h;
                    if (ruaVarBuild == null) {
                        ruaVarBuild = rua.newBuilder().setType(rua.EnumC12303d.UNARY).setFullMethodName(rua.generateFullMethodName(f95898a, "Commit")).setSampledToLocalTracing(true).setRequestMarshaller(ghd.marshaller(wb2.getDefaultInstance())).setResponseMarshaller(ghd.marshaller(yb2.getDefaultInstance())).build();
                        f95905h = ruaVarBuild;
                    }
                } finally {
                }
            }
        }
        return ruaVarBuild;
    }

    @jce(fullMethodName = "google.firestore.v1.Firestore/CreateDocument", methodType = rua.EnumC12303d.UNARY, requestType = v53.class, responseType = nh4.class)
    public static rua<v53, nh4> getCreateDocumentMethod() {
        rua<v53, nh4> ruaVarBuild = f95912o;
        if (ruaVarBuild == null) {
            synchronized (x06.class) {
                try {
                    ruaVarBuild = f95912o;
                    if (ruaVarBuild == null) {
                        ruaVarBuild = rua.newBuilder().setType(rua.EnumC12303d.UNARY).setFullMethodName(rua.generateFullMethodName(f95898a, "CreateDocument")).setSampledToLocalTracing(true).setRequestMarshaller(ghd.marshaller(v53.getDefaultInstance())).setResponseMarshaller(ghd.marshaller(nh4.getDefaultInstance())).build();
                        f95912o = ruaVarBuild;
                    }
                } finally {
                }
            }
        }
        return ruaVarBuild;
    }

    @jce(fullMethodName = "google.firestore.v1.Firestore/DeleteDocument", methodType = rua.EnumC12303d.UNARY, requestType = a54.class, responseType = qz4.class)
    public static rua<a54, qz4> getDeleteDocumentMethod() {
        rua<a54, qz4> ruaVarBuild = f95902e;
        if (ruaVarBuild == null) {
            synchronized (x06.class) {
                try {
                    ruaVarBuild = f95902e;
                    if (ruaVarBuild == null) {
                        ruaVarBuild = rua.newBuilder().setType(rua.EnumC12303d.UNARY).setFullMethodName(rua.generateFullMethodName(f95898a, "DeleteDocument")).setSampledToLocalTracing(true).setRequestMarshaller(ghd.marshaller(a54.getDefaultInstance())).setResponseMarshaller(ghd.marshaller(qz4.getDefaultInstance())).build();
                        f95902e = ruaVarBuild;
                    }
                } finally {
                }
            }
        }
        return ruaVarBuild;
    }

    @jce(fullMethodName = "google.firestore.v1.Firestore/GetDocument", methodType = rua.EnumC12303d.UNARY, requestType = h47.class, responseType = nh4.class)
    public static rua<h47, nh4> getGetDocumentMethod() {
        rua<h47, nh4> ruaVarBuild = f95899b;
        if (ruaVarBuild == null) {
            synchronized (x06.class) {
                try {
                    ruaVarBuild = f95899b;
                    if (ruaVarBuild == null) {
                        ruaVarBuild = rua.newBuilder().setType(rua.EnumC12303d.UNARY).setFullMethodName(rua.generateFullMethodName(f95898a, "GetDocument")).setSampledToLocalTracing(true).setRequestMarshaller(ghd.marshaller(h47.getDefaultInstance())).setResponseMarshaller(ghd.marshaller(nh4.getDefaultInstance())).build();
                        f95899b = ruaVarBuild;
                    }
                } finally {
                }
            }
        }
        return ruaVarBuild;
    }

    @jce(fullMethodName = "google.firestore.v1.Firestore/ListCollectionIds", methodType = rua.EnumC12303d.UNARY, requestType = o89.class, responseType = q89.class)
    public static rua<o89, q89> getListCollectionIdsMethod() {
        rua<o89, q89> ruaVarBuild = f95911n;
        if (ruaVarBuild == null) {
            synchronized (x06.class) {
                try {
                    ruaVarBuild = f95911n;
                    if (ruaVarBuild == null) {
                        ruaVarBuild = rua.newBuilder().setType(rua.EnumC12303d.UNARY).setFullMethodName(rua.generateFullMethodName(f95898a, "ListCollectionIds")).setSampledToLocalTracing(true).setRequestMarshaller(ghd.marshaller(o89.getDefaultInstance())).setResponseMarshaller(ghd.marshaller(q89.getDefaultInstance())).build();
                        f95911n = ruaVarBuild;
                    }
                } finally {
                }
            }
        }
        return ruaVarBuild;
    }

    @jce(fullMethodName = "google.firestore.v1.Firestore/ListDocuments", methodType = rua.EnumC12303d.UNARY, requestType = u89.class, responseType = w89.class)
    public static rua<u89, w89> getListDocumentsMethod() {
        rua<u89, w89> ruaVarBuild = f95900c;
        if (ruaVarBuild == null) {
            synchronized (x06.class) {
                try {
                    ruaVarBuild = f95900c;
                    if (ruaVarBuild == null) {
                        ruaVarBuild = rua.newBuilder().setType(rua.EnumC12303d.UNARY).setFullMethodName(rua.generateFullMethodName(f95898a, "ListDocuments")).setSampledToLocalTracing(true).setRequestMarshaller(ghd.marshaller(u89.getDefaultInstance())).setResponseMarshaller(ghd.marshaller(w89.getDefaultInstance())).build();
                        f95900c = ruaVarBuild;
                    }
                } finally {
                }
            }
        }
        return ruaVarBuild;
    }

    @jce(fullMethodName = "google.firestore.v1.Firestore/Listen", methodType = rua.EnumC12303d.BIDI_STREAMING, requestType = da9.class, responseType = fa9.class)
    public static rua<da9, fa9> getListenMethod() {
        rua<da9, fa9> ruaVarBuild = f95910m;
        if (ruaVarBuild == null) {
            synchronized (x06.class) {
                try {
                    ruaVarBuild = f95910m;
                    if (ruaVarBuild == null) {
                        ruaVarBuild = rua.newBuilder().setType(rua.EnumC12303d.BIDI_STREAMING).setFullMethodName(rua.generateFullMethodName(f95898a, "Listen")).setSampledToLocalTracing(true).setRequestMarshaller(ghd.marshaller(da9.getDefaultInstance())).setResponseMarshaller(ghd.marshaller(fa9.getDefaultInstance())).build();
                        f95910m = ruaVarBuild;
                    }
                } finally {
                }
            }
        }
        return ruaVarBuild;
    }

    @jce(fullMethodName = "google.firestore.v1.Firestore/Rollback", methodType = rua.EnumC12303d.UNARY, requestType = lae.class, responseType = qz4.class)
    public static rua<lae, qz4> getRollbackMethod() {
        rua<lae, qz4> ruaVarBuild = f95906i;
        if (ruaVarBuild == null) {
            synchronized (x06.class) {
                try {
                    ruaVarBuild = f95906i;
                    if (ruaVarBuild == null) {
                        ruaVarBuild = rua.newBuilder().setType(rua.EnumC12303d.UNARY).setFullMethodName(rua.generateFullMethodName(f95898a, "Rollback")).setSampledToLocalTracing(true).setRequestMarshaller(ghd.marshaller(lae.getDefaultInstance())).setResponseMarshaller(ghd.marshaller(qz4.getDefaultInstance())).build();
                        f95906i = ruaVarBuild;
                    }
                } finally {
                }
            }
        }
        return ruaVarBuild;
    }

    @jce(fullMethodName = "google.firestore.v1.Firestore/RunAggregationQuery", methodType = rua.EnumC12303d.SERVER_STREAMING, requestType = uce.class, responseType = wce.class)
    public static rua<uce, wce> getRunAggregationQueryMethod() {
        rua<uce, wce> ruaVarBuild = f95908k;
        if (ruaVarBuild == null) {
            synchronized (x06.class) {
                try {
                    ruaVarBuild = f95908k;
                    if (ruaVarBuild == null) {
                        ruaVarBuild = rua.newBuilder().setType(rua.EnumC12303d.SERVER_STREAMING).setFullMethodName(rua.generateFullMethodName(f95898a, "RunAggregationQuery")).setSampledToLocalTracing(true).setRequestMarshaller(ghd.marshaller(uce.getDefaultInstance())).setResponseMarshaller(ghd.marshaller(wce.getDefaultInstance())).build();
                        f95908k = ruaVarBuild;
                    }
                } finally {
                }
            }
        }
        return ruaVarBuild;
    }

    @jce(fullMethodName = "google.firestore.v1.Firestore/RunQuery", methodType = rua.EnumC12303d.SERVER_STREAMING, requestType = dde.class, responseType = fde.class)
    public static rua<dde, fde> getRunQueryMethod() {
        rua<dde, fde> ruaVarBuild = f95907j;
        if (ruaVarBuild == null) {
            synchronized (x06.class) {
                try {
                    ruaVarBuild = f95907j;
                    if (ruaVarBuild == null) {
                        ruaVarBuild = rua.newBuilder().setType(rua.EnumC12303d.SERVER_STREAMING).setFullMethodName(rua.generateFullMethodName(f95898a, "RunQuery")).setSampledToLocalTracing(true).setRequestMarshaller(ghd.marshaller(dde.getDefaultInstance())).setResponseMarshaller(ghd.marshaller(fde.getDefaultInstance())).build();
                        f95907j = ruaVarBuild;
                    }
                } finally {
                }
            }
        }
        return ruaVarBuild;
    }

    public static k4f getServiceDescriptor() {
        k4f k4fVarBuild = f95897D;
        if (k4fVarBuild == null) {
            synchronized (x06.class) {
                try {
                    k4fVarBuild = f95897D;
                    if (k4fVarBuild == null) {
                        k4fVarBuild = k4f.newBuilder(f95898a).addMethod(getGetDocumentMethod()).addMethod(getListDocumentsMethod()).addMethod(getUpdateDocumentMethod()).addMethod(getDeleteDocumentMethod()).addMethod(getBatchGetDocumentsMethod()).addMethod(getBeginTransactionMethod()).addMethod(getCommitMethod()).addMethod(getRollbackMethod()).addMethod(getRunQueryMethod()).addMethod(getRunAggregationQueryMethod()).addMethod(getWriteMethod()).addMethod(getListenMethod()).addMethod(getListCollectionIdsMethod()).addMethod(getCreateDocumentMethod()).build();
                        f95897D = k4fVarBuild;
                    }
                } finally {
                }
            }
        }
        return k4fVarBuild;
    }

    @jce(fullMethodName = "google.firestore.v1.Firestore/UpdateDocument", methodType = rua.EnumC12303d.UNARY, requestType = iwh.class, responseType = nh4.class)
    public static rua<iwh, nh4> getUpdateDocumentMethod() {
        rua<iwh, nh4> ruaVarBuild = f95901d;
        if (ruaVarBuild == null) {
            synchronized (x06.class) {
                try {
                    ruaVarBuild = f95901d;
                    if (ruaVarBuild == null) {
                        ruaVarBuild = rua.newBuilder().setType(rua.EnumC12303d.UNARY).setFullMethodName(rua.generateFullMethodName(f95898a, "UpdateDocument")).setSampledToLocalTracing(true).setRequestMarshaller(ghd.marshaller(iwh.getDefaultInstance())).setResponseMarshaller(ghd.marshaller(nh4.getDefaultInstance())).build();
                        f95901d = ruaVarBuild;
                    }
                } finally {
                }
            }
        }
        return ruaVarBuild;
    }

    @jce(fullMethodName = "google.firestore.v1.Firestore/Write", methodType = rua.EnumC12303d.BIDI_STREAMING, requestType = gsi.class, responseType = isi.class)
    public static rua<gsi, isi> getWriteMethod() {
        rua<gsi, isi> ruaVarBuild = f95909l;
        if (ruaVarBuild == null) {
            synchronized (x06.class) {
                try {
                    ruaVarBuild = f95909l;
                    if (ruaVarBuild == null) {
                        ruaVarBuild = rua.newBuilder().setType(rua.EnumC12303d.BIDI_STREAMING).setFullMethodName(rua.generateFullMethodName(f95898a, "Write")).setSampledToLocalTracing(true).setRequestMarshaller(ghd.marshaller(gsi.getDefaultInstance())).setResponseMarshaller(ghd.marshaller(isi.getDefaultInstance())).build();
                        f95909l = ruaVarBuild;
                    }
                } finally {
                }
            }
        }
        return ruaVarBuild;
    }

    public static C14859e newBlockingStub(bu1 bu1Var) {
        return (C14859e) AbstractC6667h0.newStub(new C14856b(), bu1Var);
    }

    public static C14860f newFutureStub(bu1 bu1Var) {
        return (C14860f) AbstractC10131o1.newStub(new C14857c(), bu1Var);
    }

    public static C14862h newStub(bu1 bu1Var) {
        return (C14862h) AbstractC15361y.newStub(new C14855a(), bu1Var);
    }

    /* JADX INFO: renamed from: x06$i */
    public static final class C14863i<Req, Resp> implements c3f.InterfaceC2192h<Req, Resp>, c3f.InterfaceC2189e<Req, Resp>, c3f.InterfaceC2186b<Req, Resp>, c3f.InterfaceC2185a<Req, Resp> {

        /* JADX INFO: renamed from: a */
        public final InterfaceC14858d f95924a;

        /* JADX INFO: renamed from: b */
        public final int f95925b;

        public C14863i(InterfaceC14858d interfaceC14858d, int i) {
            this.f95924a = interfaceC14858d;
            this.f95925b = i;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.c3f.InterfaceC2192h, p000.c3f.InterfaceC2193i
        public void invoke(Req req, c6g<Resp> c6gVar) {
            switch (this.f95925b) {
                case 0:
                    this.f95924a.getDocument((h47) req, c6gVar);
                    return;
                case 1:
                    this.f95924a.listDocuments((u89) req, c6gVar);
                    return;
                case 2:
                    this.f95924a.updateDocument((iwh) req, c6gVar);
                    return;
                case 3:
                    this.f95924a.deleteDocument((a54) req, c6gVar);
                    return;
                case 4:
                    this.f95924a.batchGetDocuments((ow0) req, c6gVar);
                    return;
                case 5:
                    this.f95924a.beginTransaction((k01) req, c6gVar);
                    return;
                case 6:
                    this.f95924a.commit((wb2) req, c6gVar);
                    return;
                case 7:
                    this.f95924a.rollback((lae) req, c6gVar);
                    return;
                case 8:
                    this.f95924a.runQuery((dde) req, c6gVar);
                    return;
                case 9:
                    this.f95924a.runAggregationQuery((uce) req, c6gVar);
                    return;
                case 10:
                    this.f95924a.listCollectionIds((o89) req, c6gVar);
                    return;
                case 11:
                    this.f95924a.createDocument((v53) req, c6gVar);
                    return;
                default:
                    throw new AssertionError();
            }
        }

        @Override // p000.c3f.InterfaceC2186b, p000.c3f.InterfaceC2190f
        public c6g<Req> invoke(c6g<Resp> c6gVar) {
            int i = this.f95925b;
            if (i == 12) {
                return (c6g<Req>) this.f95924a.write(c6gVar);
            }
            if (i == 13) {
                return (c6g<Req>) this.f95924a.listen(c6gVar);
            }
            throw new AssertionError();
        }
    }
}
