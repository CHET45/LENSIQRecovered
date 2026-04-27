package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import p000.v27;
import p000.w98;
import p000.yn0;

/* JADX INFO: loaded from: classes5.dex */
public final class qn0 extends v27<qn0, C11564b> implements sn0 {
    private static final qn0 DEFAULT_INSTANCE;
    private static volatile uhc<qn0> PARSER = null;
    public static final int RULES_FIELD_NUMBER = 1;
    private w98.InterfaceC14504k<yn0> rules_ = v27.m23722x();

    /* JADX INFO: renamed from: qn0$a */
    public static /* synthetic */ class C11563a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f74976a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f74976a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f74976a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f74976a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f74976a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f74976a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f74976a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f74976a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: qn0$b */
    public static final class C11564b extends v27.AbstractC13823b<qn0, C11564b> implements sn0 {
        public /* synthetic */ C11564b(C11563a c11563a) {
            this();
        }

        public C11564b addAllRules(Iterable<? extends yn0> iterable) {
            m23743e();
            ((qn0) this.f89756b).addAllRules(iterable);
            return this;
        }

        public C11564b addRules(yn0 yn0Var) {
            m23743e();
            ((qn0) this.f89756b).addRules(yn0Var);
            return this;
        }

        public C11564b clearRules() {
            m23743e();
            ((qn0) this.f89756b).clearRules();
            return this;
        }

        @Override // p000.sn0
        public yn0 getRules(int i) {
            return ((qn0) this.f89756b).getRules(i);
        }

        @Override // p000.sn0
        public int getRulesCount() {
            return ((qn0) this.f89756b).getRulesCount();
        }

        @Override // p000.sn0
        public List<yn0> getRulesList() {
            return Collections.unmodifiableList(((qn0) this.f89756b).getRulesList());
        }

        public C11564b removeRules(int i) {
            m23743e();
            ((qn0) this.f89756b).removeRules(i);
            return this;
        }

        public C11564b setRules(int i, yn0 yn0Var) {
            m23743e();
            ((qn0) this.f89756b).setRules(i, yn0Var);
            return this;
        }

        private C11564b() {
            super(qn0.DEFAULT_INSTANCE);
        }

        public C11564b addRules(int i, yn0 yn0Var) {
            m23743e();
            ((qn0) this.f89756b).addRules(i, yn0Var);
            return this;
        }

        public C11564b setRules(int i, yn0.C15734c c15734c) {
            m23743e();
            ((qn0) this.f89756b).setRules(i, c15734c.build());
            return this;
        }

        public C11564b addRules(yn0.C15734c c15734c) {
            m23743e();
            ((qn0) this.f89756b).addRules(c15734c.build());
            return this;
        }

        public C11564b addRules(int i, yn0.C15734c c15734c) {
            m23743e();
            ((qn0) this.f89756b).addRules(i, c15734c.build());
            return this;
        }
    }

    static {
        qn0 qn0Var = new qn0();
        DEFAULT_INSTANCE = qn0Var;
        v27.m23715h0(qn0.class, qn0Var);
    }

    private qn0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllRules(Iterable<? extends yn0> iterable) {
        ensureRulesIsMutable();
        AbstractC1714b3.m2856b(iterable, this.rules_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRules(yn0 yn0Var) {
        yn0Var.getClass();
        ensureRulesIsMutable();
        this.rules_.add(yn0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRules() {
        this.rules_ = v27.m23722x();
    }

    private void ensureRulesIsMutable() {
        w98.InterfaceC14504k<yn0> interfaceC14504k = this.rules_;
        if (interfaceC14504k.isModifiable()) {
            return;
        }
        this.rules_ = v27.m23698P(interfaceC14504k);
    }

    public static qn0 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C11564b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    public static qn0 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (qn0) v27.m23700S(DEFAULT_INSTANCE, inputStream);
    }

    public static qn0 parseFrom(ByteBuffer byteBuffer) throws ce8 {
        return (qn0) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static uhc<qn0> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeRules(int i) {
        ensureRulesIsMutable();
        this.rules_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRules(int i, yn0 yn0Var) {
        yn0Var.getClass();
        ensureRulesIsMutable();
        this.rules_.set(i, yn0Var);
    }

    @Override // p000.sn0
    public yn0 getRules(int i) {
        return this.rules_.get(i);
    }

    @Override // p000.sn0
    public int getRulesCount() {
        return this.rules_.size();
    }

    @Override // p000.sn0
    public List<yn0> getRulesList() {
        return this.rules_;
    }

    public zn0 getRulesOrBuilder(int i) {
        return this.rules_.get(i);
    }

    public List<? extends zn0> getRulesOrBuilderList() {
        return this.rules_;
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
        C11563a c11563a = null;
        switch (C11563a.f74976a[enumC13830i.ordinal()]) {
            case 1:
                return new qn0();
            case 2:
                return new C11564b(c11563a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"rules_", yn0.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<qn0> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (qn0.class) {
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

    public static C11564b newBuilder(qn0 qn0Var) {
        return DEFAULT_INSTANCE.m23739o(qn0Var);
    }

    public static qn0 parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (qn0) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static qn0 parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
        return (qn0) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
    }

    public static qn0 parseFrom(vj1 vj1Var) throws ce8 {
        return (qn0) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRules(int i, yn0 yn0Var) {
        yn0Var.getClass();
        ensureRulesIsMutable();
        this.rules_.add(i, yn0Var);
    }

    public static qn0 parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
        return (qn0) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
    }

    public static qn0 parseFrom(byte[] bArr) throws ce8 {
        return (qn0) v27.m23710c0(DEFAULT_INSTANCE, bArr);
    }

    public static qn0 parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
        return (qn0) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
    }

    public static qn0 parseFrom(InputStream inputStream) throws IOException {
        return (qn0) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
    }

    public static qn0 parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (qn0) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static qn0 parseFrom(f72 f72Var) throws IOException {
        return (qn0) v27.m23704W(DEFAULT_INSTANCE, f72Var);
    }

    public static qn0 parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
        return (qn0) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
    }
}
