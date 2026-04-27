package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p000.C15896yz;
import p000.m4g;
import p000.v27;

/* JADX INFO: loaded from: classes5.dex */
public final class y5c extends v27<y5c, C15494b> implements h6c {
    private static final y5c DEFAULT_INSTANCE;
    public static final int DONE_FIELD_NUMBER = 3;
    public static final int ERROR_FIELD_NUMBER = 4;
    public static final int METADATA_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile uhc<y5c> PARSER = null;
    public static final int RESPONSE_FIELD_NUMBER = 5;
    private int bitField0_;
    private boolean done_;
    private C15896yz metadata_;
    private Object result_;
    private int resultCase_ = 0;
    private String name_ = "";

    /* JADX INFO: renamed from: y5c$a */
    public static /* synthetic */ class C15493a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f100426a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f100426a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f100426a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f100426a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f100426a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f100426a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f100426a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f100426a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: y5c$b */
    public static final class C15494b extends v27.AbstractC13823b<y5c, C15494b> implements h6c {
        public /* synthetic */ C15494b(C15493a c15493a) {
            this();
        }

        public C15494b clearDone() {
            m23743e();
            ((y5c) this.f89756b).clearDone();
            return this;
        }

        public C15494b clearError() {
            m23743e();
            ((y5c) this.f89756b).clearError();
            return this;
        }

        public C15494b clearMetadata() {
            m23743e();
            ((y5c) this.f89756b).clearMetadata();
            return this;
        }

        public C15494b clearName() {
            m23743e();
            ((y5c) this.f89756b).clearName();
            return this;
        }

        public C15494b clearResponse() {
            m23743e();
            ((y5c) this.f89756b).clearResponse();
            return this;
        }

        public C15494b clearResult() {
            m23743e();
            ((y5c) this.f89756b).clearResult();
            return this;
        }

        @Override // p000.h6c
        public boolean getDone() {
            return ((y5c) this.f89756b).getDone();
        }

        @Override // p000.h6c
        public m4g getError() {
            return ((y5c) this.f89756b).getError();
        }

        @Override // p000.h6c
        public C15896yz getMetadata() {
            return ((y5c) this.f89756b).getMetadata();
        }

        @Override // p000.h6c
        public String getName() {
            return ((y5c) this.f89756b).getName();
        }

        @Override // p000.h6c
        public vj1 getNameBytes() {
            return ((y5c) this.f89756b).getNameBytes();
        }

        @Override // p000.h6c
        public C15896yz getResponse() {
            return ((y5c) this.f89756b).getResponse();
        }

        @Override // p000.h6c
        public EnumC15495c getResultCase() {
            return ((y5c) this.f89756b).getResultCase();
        }

        @Override // p000.h6c
        public boolean hasError() {
            return ((y5c) this.f89756b).hasError();
        }

        @Override // p000.h6c
        public boolean hasMetadata() {
            return ((y5c) this.f89756b).hasMetadata();
        }

        @Override // p000.h6c
        public boolean hasResponse() {
            return ((y5c) this.f89756b).hasResponse();
        }

        public C15494b mergeError(m4g m4gVar) {
            m23743e();
            ((y5c) this.f89756b).mergeError(m4gVar);
            return this;
        }

        public C15494b mergeMetadata(C15896yz c15896yz) {
            m23743e();
            ((y5c) this.f89756b).mergeMetadata(c15896yz);
            return this;
        }

        public C15494b mergeResponse(C15896yz c15896yz) {
            m23743e();
            ((y5c) this.f89756b).mergeResponse(c15896yz);
            return this;
        }

        public C15494b setDone(boolean z) {
            m23743e();
            ((y5c) this.f89756b).setDone(z);
            return this;
        }

        public C15494b setError(m4g m4gVar) {
            m23743e();
            ((y5c) this.f89756b).setError(m4gVar);
            return this;
        }

        public C15494b setMetadata(C15896yz c15896yz) {
            m23743e();
            ((y5c) this.f89756b).setMetadata(c15896yz);
            return this;
        }

        public C15494b setName(String str) {
            m23743e();
            ((y5c) this.f89756b).setName(str);
            return this;
        }

        public C15494b setNameBytes(vj1 vj1Var) {
            m23743e();
            ((y5c) this.f89756b).setNameBytes(vj1Var);
            return this;
        }

        public C15494b setResponse(C15896yz c15896yz) {
            m23743e();
            ((y5c) this.f89756b).setResponse(c15896yz);
            return this;
        }

        private C15494b() {
            super(y5c.DEFAULT_INSTANCE);
        }

        public C15494b setError(m4g.C9139b c9139b) {
            m23743e();
            ((y5c) this.f89756b).setError(c9139b.build());
            return this;
        }

        public C15494b setMetadata(C15896yz.b bVar) {
            m23743e();
            ((y5c) this.f89756b).setMetadata(bVar.build());
            return this;
        }

        public C15494b setResponse(C15896yz.b bVar) {
            m23743e();
            ((y5c) this.f89756b).setResponse(bVar.build());
            return this;
        }
    }

    /* JADX INFO: renamed from: y5c$c */
    public enum EnumC15495c {
        ERROR(4),
        RESPONSE(5),
        RESULT_NOT_SET(0);


        /* JADX INFO: renamed from: a */
        public final int f100431a;

        EnumC15495c(int i) {
            this.f100431a = i;
        }

        public static EnumC15495c forNumber(int i) {
            if (i == 0) {
                return RESULT_NOT_SET;
            }
            if (i == 4) {
                return ERROR;
            }
            if (i != 5) {
                return null;
            }
            return RESPONSE;
        }

        public int getNumber() {
            return this.f100431a;
        }

        @Deprecated
        public static EnumC15495c valueOf(int i) {
            return forNumber(i);
        }
    }

    static {
        y5c y5cVar = new y5c();
        DEFAULT_INSTANCE = y5cVar;
        v27.m23715h0(y5c.class, y5cVar);
    }

    private y5c() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDone() {
        this.done_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearError() {
        if (this.resultCase_ == 4) {
            this.resultCase_ = 0;
            this.result_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMetadata() {
        this.metadata_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResponse() {
        if (this.resultCase_ == 5) {
            this.resultCase_ = 0;
            this.result_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResult() {
        this.resultCase_ = 0;
        this.result_ = null;
    }

    public static y5c getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeError(m4g m4gVar) {
        m4gVar.getClass();
        if (this.resultCase_ != 4 || this.result_ == m4g.getDefaultInstance()) {
            this.result_ = m4gVar;
        } else {
            this.result_ = m4g.newBuilder((m4g) this.result_).mergeFrom(m4gVar).buildPartial();
        }
        this.resultCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMetadata(C15896yz c15896yz) {
        c15896yz.getClass();
        C15896yz c15896yz2 = this.metadata_;
        if (c15896yz2 == null || c15896yz2 == C15896yz.getDefaultInstance()) {
            this.metadata_ = c15896yz;
        } else {
            this.metadata_ = C15896yz.newBuilder(this.metadata_).mergeFrom(c15896yz).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeResponse(C15896yz c15896yz) {
        c15896yz.getClass();
        if (this.resultCase_ != 5 || this.result_ == C15896yz.getDefaultInstance()) {
            this.result_ = c15896yz;
        } else {
            this.result_ = C15896yz.newBuilder((C15896yz) this.result_).mergeFrom(c15896yz).buildPartial();
        }
        this.resultCase_ = 5;
    }

    public static C15494b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    public static y5c parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (y5c) v27.m23700S(DEFAULT_INSTANCE, inputStream);
    }

    public static y5c parseFrom(ByteBuffer byteBuffer) throws ce8 {
        return (y5c) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static uhc<y5c> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDone(boolean z) {
        this.done_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setError(m4g m4gVar) {
        m4gVar.getClass();
        this.result_ = m4gVar;
        this.resultCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMetadata(C15896yz c15896yz) {
        c15896yz.getClass();
        this.metadata_ = c15896yz;
        this.bitField0_ |= 1;
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
    public void setResponse(C15896yz c15896yz) {
        c15896yz.getClass();
        this.result_ = c15896yz;
        this.resultCase_ = 5;
    }

    @Override // p000.h6c
    public boolean getDone() {
        return this.done_;
    }

    @Override // p000.h6c
    public m4g getError() {
        return this.resultCase_ == 4 ? (m4g) this.result_ : m4g.getDefaultInstance();
    }

    @Override // p000.h6c
    public C15896yz getMetadata() {
        C15896yz c15896yz = this.metadata_;
        return c15896yz == null ? C15896yz.getDefaultInstance() : c15896yz;
    }

    @Override // p000.h6c
    public String getName() {
        return this.name_;
    }

    @Override // p000.h6c
    public vj1 getNameBytes() {
        return vj1.copyFromUtf8(this.name_);
    }

    @Override // p000.h6c
    public C15896yz getResponse() {
        return this.resultCase_ == 5 ? (C15896yz) this.result_ : C15896yz.getDefaultInstance();
    }

    @Override // p000.h6c
    public EnumC15495c getResultCase() {
        return EnumC15495c.forNumber(this.resultCase_);
    }

    @Override // p000.h6c
    public boolean hasError() {
        return this.resultCase_ == 4;
    }

    @Override // p000.h6c
    public boolean hasMetadata() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // p000.h6c
    public boolean hasResponse() {
        return this.resultCase_ == 5;
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
        C15493a c15493a = null;
        switch (C15493a.f100426a[enumC13830i.ordinal()]) {
            case 1:
                return new y5c();
            case 2:
                return new C15494b(c15493a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003\u0007\u0004<\u0000\u0005<\u0000", new Object[]{"result_", "resultCase_", "bitField0_", "name_", "metadata_", "done_", m4g.class, C15896yz.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<y5c> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (y5c.class) {
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

    public static C15494b newBuilder(y5c y5cVar) {
        return DEFAULT_INSTANCE.m23739o(y5cVar);
    }

    public static y5c parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (y5c) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static y5c parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
        return (y5c) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
    }

    public static y5c parseFrom(vj1 vj1Var) throws ce8 {
        return (y5c) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
    }

    public static y5c parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
        return (y5c) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
    }

    public static y5c parseFrom(byte[] bArr) throws ce8 {
        return (y5c) v27.m23710c0(DEFAULT_INSTANCE, bArr);
    }

    public static y5c parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
        return (y5c) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
    }

    public static y5c parseFrom(InputStream inputStream) throws IOException {
        return (y5c) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
    }

    public static y5c parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (y5c) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static y5c parseFrom(f72 f72Var) throws IOException {
        return (y5c) v27.m23704W(DEFAULT_INSTANCE, f72Var);
    }

    public static y5c parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
        return (y5c) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
    }
}
