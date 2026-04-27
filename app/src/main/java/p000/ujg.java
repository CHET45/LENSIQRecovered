package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import p000.rjg;
import p000.v27;
import p000.w98;

/* JADX INFO: loaded from: classes5.dex */
public final class ujg extends v27<ujg, C13558b> implements vjg {
    private static final ujg DEFAULT_INSTANCE;
    public static final int PARAMETERS_FIELD_NUMBER = 2;
    private static volatile uhc<ujg> PARSER = null;
    public static final int SELECTOR_FIELD_NUMBER = 1;
    private String selector_ = "";
    private w98.InterfaceC14504k<rjg> parameters_ = v27.m23722x();

    /* JADX INFO: renamed from: ujg$a */
    public static /* synthetic */ class C13557a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f88173a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f88173a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f88173a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f88173a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f88173a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f88173a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f88173a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f88173a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: ujg$b */
    public static final class C13558b extends v27.AbstractC13823b<ujg, C13558b> implements vjg {
        public /* synthetic */ C13558b(C13557a c13557a) {
            this();
        }

        public C13558b addAllParameters(Iterable<? extends rjg> iterable) {
            m23743e();
            ((ujg) this.f89756b).addAllParameters(iterable);
            return this;
        }

        public C13558b addParameters(rjg rjgVar) {
            m23743e();
            ((ujg) this.f89756b).addParameters(rjgVar);
            return this;
        }

        public C13558b clearParameters() {
            m23743e();
            ((ujg) this.f89756b).clearParameters();
            return this;
        }

        public C13558b clearSelector() {
            m23743e();
            ((ujg) this.f89756b).clearSelector();
            return this;
        }

        @Override // p000.vjg
        public rjg getParameters(int i) {
            return ((ujg) this.f89756b).getParameters(i);
        }

        @Override // p000.vjg
        public int getParametersCount() {
            return ((ujg) this.f89756b).getParametersCount();
        }

        @Override // p000.vjg
        public List<rjg> getParametersList() {
            return Collections.unmodifiableList(((ujg) this.f89756b).getParametersList());
        }

        @Override // p000.vjg
        public String getSelector() {
            return ((ujg) this.f89756b).getSelector();
        }

        @Override // p000.vjg
        public vj1 getSelectorBytes() {
            return ((ujg) this.f89756b).getSelectorBytes();
        }

        public C13558b removeParameters(int i) {
            m23743e();
            ((ujg) this.f89756b).removeParameters(i);
            return this;
        }

        public C13558b setParameters(int i, rjg rjgVar) {
            m23743e();
            ((ujg) this.f89756b).setParameters(i, rjgVar);
            return this;
        }

        public C13558b setSelector(String str) {
            m23743e();
            ((ujg) this.f89756b).setSelector(str);
            return this;
        }

        public C13558b setSelectorBytes(vj1 vj1Var) {
            m23743e();
            ((ujg) this.f89756b).setSelectorBytes(vj1Var);
            return this;
        }

        private C13558b() {
            super(ujg.DEFAULT_INSTANCE);
        }

        public C13558b addParameters(int i, rjg rjgVar) {
            m23743e();
            ((ujg) this.f89756b).addParameters(i, rjgVar);
            return this;
        }

        public C13558b setParameters(int i, rjg.C12121b c12121b) {
            m23743e();
            ((ujg) this.f89756b).setParameters(i, c12121b.build());
            return this;
        }

        public C13558b addParameters(rjg.C12121b c12121b) {
            m23743e();
            ((ujg) this.f89756b).addParameters(c12121b.build());
            return this;
        }

        public C13558b addParameters(int i, rjg.C12121b c12121b) {
            m23743e();
            ((ujg) this.f89756b).addParameters(i, c12121b.build());
            return this;
        }
    }

    static {
        ujg ujgVar = new ujg();
        DEFAULT_INSTANCE = ujgVar;
        v27.m23715h0(ujg.class, ujgVar);
    }

    private ujg() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllParameters(Iterable<? extends rjg> iterable) {
        ensureParametersIsMutable();
        AbstractC1714b3.m2856b(iterable, this.parameters_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addParameters(rjg rjgVar) {
        rjgVar.getClass();
        ensureParametersIsMutable();
        this.parameters_.add(rjgVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParameters() {
        this.parameters_ = v27.m23722x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSelector() {
        this.selector_ = getDefaultInstance().getSelector();
    }

    private void ensureParametersIsMutable() {
        w98.InterfaceC14504k<rjg> interfaceC14504k = this.parameters_;
        if (interfaceC14504k.isModifiable()) {
            return;
        }
        this.parameters_ = v27.m23698P(interfaceC14504k);
    }

    public static ujg getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C13558b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    public static ujg parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ujg) v27.m23700S(DEFAULT_INSTANCE, inputStream);
    }

    public static ujg parseFrom(ByteBuffer byteBuffer) throws ce8 {
        return (ujg) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static uhc<ujg> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeParameters(int i) {
        ensureParametersIsMutable();
        this.parameters_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParameters(int i, rjg rjgVar) {
        rjgVar.getClass();
        ensureParametersIsMutable();
        this.parameters_.set(i, rjgVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSelector(String str) {
        str.getClass();
        this.selector_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSelectorBytes(vj1 vj1Var) {
        AbstractC1714b3.m2857c(vj1Var);
        this.selector_ = vj1Var.toStringUtf8();
    }

    @Override // p000.vjg
    public rjg getParameters(int i) {
        return this.parameters_.get(i);
    }

    @Override // p000.vjg
    public int getParametersCount() {
        return this.parameters_.size();
    }

    @Override // p000.vjg
    public List<rjg> getParametersList() {
        return this.parameters_;
    }

    public sjg getParametersOrBuilder(int i) {
        return this.parameters_.get(i);
    }

    public List<? extends sjg> getParametersOrBuilderList() {
        return this.parameters_;
    }

    @Override // p000.vjg
    public String getSelector() {
        return this.selector_;
    }

    @Override // p000.vjg
    public vj1 getSelectorBytes() {
        return vj1.copyFromUtf8(this.selector_);
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
        C13557a c13557a = null;
        switch (C13557a.f88173a[enumC13830i.ordinal()]) {
            case 1:
                return new ujg();
            case 2:
                return new C13558b(c13557a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"selector_", "parameters_", rjg.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<ujg> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (ujg.class) {
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

    public static C13558b newBuilder(ujg ujgVar) {
        return DEFAULT_INSTANCE.m23739o(ujgVar);
    }

    public static ujg parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (ujg) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static ujg parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
        return (ujg) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
    }

    public static ujg parseFrom(vj1 vj1Var) throws ce8 {
        return (ujg) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addParameters(int i, rjg rjgVar) {
        rjgVar.getClass();
        ensureParametersIsMutable();
        this.parameters_.add(i, rjgVar);
    }

    public static ujg parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
        return (ujg) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
    }

    public static ujg parseFrom(byte[] bArr) throws ce8 {
        return (ujg) v27.m23710c0(DEFAULT_INSTANCE, bArr);
    }

    public static ujg parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
        return (ujg) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
    }

    public static ujg parseFrom(InputStream inputStream) throws IOException {
        return (ujg) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
    }

    public static ujg parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (ujg) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static ujg parseFrom(f72 f72Var) throws IOException {
        return (ujg) v27.m23704W(DEFAULT_INSTANCE, f72Var);
    }

    public static ujg parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
        return (ujg) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
    }
}
