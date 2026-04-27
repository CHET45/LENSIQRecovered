package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import p000.dy2;
import p000.v27;
import p000.w98;

/* JADX INFO: loaded from: classes5.dex */
public final class gx2 extends v27<gx2, C6636b> implements by2 {
    private static final gx2 DEFAULT_INSTANCE;
    private static volatile uhc<gx2> PARSER = null;
    public static final int RULES_FIELD_NUMBER = 1;
    private w98.InterfaceC14504k<dy2> rules_ = v27.m23722x();

    /* JADX INFO: renamed from: gx2$a */
    public static /* synthetic */ class C6635a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f41755a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f41755a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f41755a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f41755a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f41755a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f41755a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f41755a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f41755a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: gx2$b */
    public static final class C6636b extends v27.AbstractC13823b<gx2, C6636b> implements by2 {
        public /* synthetic */ C6636b(C6635a c6635a) {
            this();
        }

        public C6636b addAllRules(Iterable<? extends dy2> iterable) {
            m23743e();
            ((gx2) this.f89756b).addAllRules(iterable);
            return this;
        }

        public C6636b addRules(dy2 dy2Var) {
            m23743e();
            ((gx2) this.f89756b).addRules(dy2Var);
            return this;
        }

        public C6636b clearRules() {
            m23743e();
            ((gx2) this.f89756b).clearRules();
            return this;
        }

        @Override // p000.by2
        public dy2 getRules(int i) {
            return ((gx2) this.f89756b).getRules(i);
        }

        @Override // p000.by2
        public int getRulesCount() {
            return ((gx2) this.f89756b).getRulesCount();
        }

        @Override // p000.by2
        public List<dy2> getRulesList() {
            return Collections.unmodifiableList(((gx2) this.f89756b).getRulesList());
        }

        public C6636b removeRules(int i) {
            m23743e();
            ((gx2) this.f89756b).removeRules(i);
            return this;
        }

        public C6636b setRules(int i, dy2 dy2Var) {
            m23743e();
            ((gx2) this.f89756b).setRules(i, dy2Var);
            return this;
        }

        private C6636b() {
            super(gx2.DEFAULT_INSTANCE);
        }

        public C6636b addRules(int i, dy2 dy2Var) {
            m23743e();
            ((gx2) this.f89756b).addRules(i, dy2Var);
            return this;
        }

        public C6636b setRules(int i, dy2.C5001b c5001b) {
            m23743e();
            ((gx2) this.f89756b).setRules(i, c5001b.build());
            return this;
        }

        public C6636b addRules(dy2.C5001b c5001b) {
            m23743e();
            ((gx2) this.f89756b).addRules(c5001b.build());
            return this;
        }

        public C6636b addRules(int i, dy2.C5001b c5001b) {
            m23743e();
            ((gx2) this.f89756b).addRules(i, c5001b.build());
            return this;
        }
    }

    static {
        gx2 gx2Var = new gx2();
        DEFAULT_INSTANCE = gx2Var;
        v27.m23715h0(gx2.class, gx2Var);
    }

    private gx2() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllRules(Iterable<? extends dy2> iterable) {
        ensureRulesIsMutable();
        AbstractC1714b3.m2856b(iterable, this.rules_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRules(dy2 dy2Var) {
        dy2Var.getClass();
        ensureRulesIsMutable();
        this.rules_.add(dy2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRules() {
        this.rules_ = v27.m23722x();
    }

    private void ensureRulesIsMutable() {
        w98.InterfaceC14504k<dy2> interfaceC14504k = this.rules_;
        if (interfaceC14504k.isModifiable()) {
            return;
        }
        this.rules_ = v27.m23698P(interfaceC14504k);
    }

    public static gx2 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C6636b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    public static gx2 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (gx2) v27.m23700S(DEFAULT_INSTANCE, inputStream);
    }

    public static gx2 parseFrom(ByteBuffer byteBuffer) throws ce8 {
        return (gx2) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static uhc<gx2> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeRules(int i) {
        ensureRulesIsMutable();
        this.rules_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRules(int i, dy2 dy2Var) {
        dy2Var.getClass();
        ensureRulesIsMutable();
        this.rules_.set(i, dy2Var);
    }

    @Override // p000.by2
    public dy2 getRules(int i) {
        return this.rules_.get(i);
    }

    @Override // p000.by2
    public int getRulesCount() {
        return this.rules_.size();
    }

    @Override // p000.by2
    public List<dy2> getRulesList() {
        return this.rules_;
    }

    public ey2 getRulesOrBuilder(int i) {
        return this.rules_.get(i);
    }

    public List<? extends ey2> getRulesOrBuilderList() {
        return this.rules_;
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
        C6635a c6635a = null;
        switch (C6635a.f41755a[enumC13830i.ordinal()]) {
            case 1:
                return new gx2();
            case 2:
                return new C6636b(c6635a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"rules_", dy2.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<gx2> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (gx2.class) {
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

    public static C6636b newBuilder(gx2 gx2Var) {
        return DEFAULT_INSTANCE.m23739o(gx2Var);
    }

    public static gx2 parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (gx2) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static gx2 parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
        return (gx2) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
    }

    public static gx2 parseFrom(vj1 vj1Var) throws ce8 {
        return (gx2) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRules(int i, dy2 dy2Var) {
        dy2Var.getClass();
        ensureRulesIsMutable();
        this.rules_.add(i, dy2Var);
    }

    public static gx2 parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
        return (gx2) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
    }

    public static gx2 parseFrom(byte[] bArr) throws ce8 {
        return (gx2) v27.m23710c0(DEFAULT_INSTANCE, bArr);
    }

    public static gx2 parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
        return (gx2) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
    }

    public static gx2 parseFrom(InputStream inputStream) throws IOException {
        return (gx2) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
    }

    public static gx2 parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (gx2) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static gx2 parseFrom(f72 f72Var) throws IOException {
        return (gx2) v27.m23704W(DEFAULT_INSTANCE, f72Var);
    }

    public static gx2 parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
        return (gx2) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
    }
}
