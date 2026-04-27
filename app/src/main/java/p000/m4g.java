package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import p000.C15896yz;
import p000.v27;
import p000.w98;

/* JADX INFO: loaded from: classes4.dex */
public final class m4g extends v27<m4g, C9139b> implements s4g {
    public static final int CODE_FIELD_NUMBER = 1;
    private static final m4g DEFAULT_INSTANCE;
    public static final int DETAILS_FIELD_NUMBER = 3;
    public static final int MESSAGE_FIELD_NUMBER = 2;
    private static volatile uhc<m4g> PARSER;
    private int code_;
    private String message_ = "";
    private w98.InterfaceC14504k<C15896yz> details_ = v27.m23722x();

    /* JADX INFO: renamed from: m4g$a */
    public static /* synthetic */ class C9138a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f59892a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f59892a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f59892a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f59892a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f59892a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f59892a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f59892a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f59892a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: m4g$b */
    public static final class C9139b extends v27.AbstractC13823b<m4g, C9139b> implements s4g {
        public /* synthetic */ C9139b(C9138a c9138a) {
            this();
        }

        public C9139b addAllDetails(Iterable<? extends C15896yz> iterable) {
            m23743e();
            ((m4g) this.f89756b).addAllDetails(iterable);
            return this;
        }

        public C9139b addDetails(C15896yz c15896yz) {
            m23743e();
            ((m4g) this.f89756b).addDetails(c15896yz);
            return this;
        }

        public C9139b clearCode() {
            m23743e();
            ((m4g) this.f89756b).clearCode();
            return this;
        }

        public C9139b clearDetails() {
            m23743e();
            ((m4g) this.f89756b).clearDetails();
            return this;
        }

        public C9139b clearMessage() {
            m23743e();
            ((m4g) this.f89756b).clearMessage();
            return this;
        }

        @Override // p000.s4g
        public int getCode() {
            return ((m4g) this.f89756b).getCode();
        }

        @Override // p000.s4g
        public C15896yz getDetails(int i) {
            return ((m4g) this.f89756b).getDetails(i);
        }

        @Override // p000.s4g
        public int getDetailsCount() {
            return ((m4g) this.f89756b).getDetailsCount();
        }

        @Override // p000.s4g
        public List<C15896yz> getDetailsList() {
            return Collections.unmodifiableList(((m4g) this.f89756b).getDetailsList());
        }

        @Override // p000.s4g
        public String getMessage() {
            return ((m4g) this.f89756b).getMessage();
        }

        @Override // p000.s4g
        public vj1 getMessageBytes() {
            return ((m4g) this.f89756b).getMessageBytes();
        }

        public C9139b removeDetails(int i) {
            m23743e();
            ((m4g) this.f89756b).removeDetails(i);
            return this;
        }

        public C9139b setCode(int i) {
            m23743e();
            ((m4g) this.f89756b).setCode(i);
            return this;
        }

        public C9139b setDetails(int i, C15896yz c15896yz) {
            m23743e();
            ((m4g) this.f89756b).setDetails(i, c15896yz);
            return this;
        }

        public C9139b setMessage(String str) {
            m23743e();
            ((m4g) this.f89756b).setMessage(str);
            return this;
        }

        public C9139b setMessageBytes(vj1 vj1Var) {
            m23743e();
            ((m4g) this.f89756b).setMessageBytes(vj1Var);
            return this;
        }

        private C9139b() {
            super(m4g.DEFAULT_INSTANCE);
        }

        public C9139b addDetails(int i, C15896yz c15896yz) {
            m23743e();
            ((m4g) this.f89756b).addDetails(i, c15896yz);
            return this;
        }

        public C9139b setDetails(int i, C15896yz.b bVar) {
            m23743e();
            ((m4g) this.f89756b).setDetails(i, bVar.build());
            return this;
        }

        public C9139b addDetails(C15896yz.b bVar) {
            m23743e();
            ((m4g) this.f89756b).addDetails(bVar.build());
            return this;
        }

        public C9139b addDetails(int i, C15896yz.b bVar) {
            m23743e();
            ((m4g) this.f89756b).addDetails(i, bVar.build());
            return this;
        }
    }

    static {
        m4g m4gVar = new m4g();
        DEFAULT_INSTANCE = m4gVar;
        v27.m23715h0(m4g.class, m4gVar);
    }

    private m4g() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllDetails(Iterable<? extends C15896yz> iterable) {
        ensureDetailsIsMutable();
        AbstractC1714b3.m2856b(iterable, this.details_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDetails(C15896yz c15896yz) {
        c15896yz.getClass();
        ensureDetailsIsMutable();
        this.details_.add(c15896yz);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCode() {
        this.code_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDetails() {
        this.details_ = v27.m23722x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMessage() {
        this.message_ = getDefaultInstance().getMessage();
    }

    private void ensureDetailsIsMutable() {
        w98.InterfaceC14504k<C15896yz> interfaceC14504k = this.details_;
        if (interfaceC14504k.isModifiable()) {
            return;
        }
        this.details_ = v27.m23698P(interfaceC14504k);
    }

    public static m4g getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C9139b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    public static m4g parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (m4g) v27.m23700S(DEFAULT_INSTANCE, inputStream);
    }

    public static m4g parseFrom(ByteBuffer byteBuffer) throws ce8 {
        return (m4g) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static uhc<m4g> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeDetails(int i) {
        ensureDetailsIsMutable();
        this.details_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCode(int i) {
        this.code_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDetails(int i, C15896yz c15896yz) {
        c15896yz.getClass();
        ensureDetailsIsMutable();
        this.details_.set(i, c15896yz);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMessage(String str) {
        str.getClass();
        this.message_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMessageBytes(vj1 vj1Var) {
        AbstractC1714b3.m2857c(vj1Var);
        this.message_ = vj1Var.toStringUtf8();
    }

    @Override // p000.s4g
    public int getCode() {
        return this.code_;
    }

    @Override // p000.s4g
    public C15896yz getDetails(int i) {
        return this.details_.get(i);
    }

    @Override // p000.s4g
    public int getDetailsCount() {
        return this.details_.size();
    }

    @Override // p000.s4g
    public List<C15896yz> getDetailsList() {
        return this.details_;
    }

    public a00 getDetailsOrBuilder(int i) {
        return this.details_.get(i);
    }

    public List<? extends a00> getDetailsOrBuilderList() {
        return this.details_;
    }

    @Override // p000.s4g
    public String getMessage() {
        return this.message_;
    }

    @Override // p000.s4g
    public vj1 getMessageBytes() {
        return vj1.copyFromUtf8(this.message_);
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
        C9138a c9138a = null;
        switch (C9138a.f59892a[enumC13830i.ordinal()]) {
            case 1:
                return new m4g();
            case 2:
                return new C9139b(c9138a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u0004\u0002Ȉ\u0003\u001b", new Object[]{"code_", "message_", "details_", C15896yz.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<m4g> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (m4g.class) {
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

    public static C9139b newBuilder(m4g m4gVar) {
        return DEFAULT_INSTANCE.m23739o(m4gVar);
    }

    public static m4g parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (m4g) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static m4g parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
        return (m4g) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
    }

    public static m4g parseFrom(vj1 vj1Var) throws ce8 {
        return (m4g) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDetails(int i, C15896yz c15896yz) {
        c15896yz.getClass();
        ensureDetailsIsMutable();
        this.details_.add(i, c15896yz);
    }

    public static m4g parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
        return (m4g) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
    }

    public static m4g parseFrom(byte[] bArr) throws ce8 {
        return (m4g) v27.m23710c0(DEFAULT_INSTANCE, bArr);
    }

    public static m4g parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
        return (m4g) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
    }

    public static m4g parseFrom(InputStream inputStream) throws IOException {
        return (m4g) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
    }

    public static m4g parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (m4g) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static m4g parseFrom(f72 f72Var) throws IOException {
        return (m4g) v27.m23704W(DEFAULT_INSTANCE, f72Var);
    }

    public static m4g parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
        return (m4g) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
    }
}
