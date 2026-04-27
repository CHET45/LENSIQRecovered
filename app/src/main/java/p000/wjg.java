package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import p000.ujg;
import p000.v27;
import p000.w98;

/* JADX INFO: loaded from: classes5.dex */
public final class wjg extends v27<wjg, C14650b> implements xjg {
    private static final wjg DEFAULT_INSTANCE;
    private static volatile uhc<wjg> PARSER = null;
    public static final int RULES_FIELD_NUMBER = 1;
    private w98.InterfaceC14504k<ujg> rules_ = v27.m23722x();

    /* JADX INFO: renamed from: wjg$a */
    public static /* synthetic */ class C14649a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f94440a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f94440a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f94440a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f94440a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f94440a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f94440a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f94440a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f94440a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: wjg$b */
    public static final class C14650b extends v27.AbstractC13823b<wjg, C14650b> implements xjg {
        public /* synthetic */ C14650b(C14649a c14649a) {
            this();
        }

        public C14650b addAllRules(Iterable<? extends ujg> iterable) {
            m23743e();
            ((wjg) this.f89756b).addAllRules(iterable);
            return this;
        }

        public C14650b addRules(ujg ujgVar) {
            m23743e();
            ((wjg) this.f89756b).addRules(ujgVar);
            return this;
        }

        public C14650b clearRules() {
            m23743e();
            ((wjg) this.f89756b).clearRules();
            return this;
        }

        @Override // p000.xjg
        public ujg getRules(int i) {
            return ((wjg) this.f89756b).getRules(i);
        }

        @Override // p000.xjg
        public int getRulesCount() {
            return ((wjg) this.f89756b).getRulesCount();
        }

        @Override // p000.xjg
        public List<ujg> getRulesList() {
            return Collections.unmodifiableList(((wjg) this.f89756b).getRulesList());
        }

        public C14650b removeRules(int i) {
            m23743e();
            ((wjg) this.f89756b).removeRules(i);
            return this;
        }

        public C14650b setRules(int i, ujg ujgVar) {
            m23743e();
            ((wjg) this.f89756b).setRules(i, ujgVar);
            return this;
        }

        private C14650b() {
            super(wjg.DEFAULT_INSTANCE);
        }

        public C14650b addRules(int i, ujg ujgVar) {
            m23743e();
            ((wjg) this.f89756b).addRules(i, ujgVar);
            return this;
        }

        public C14650b setRules(int i, ujg.C13558b c13558b) {
            m23743e();
            ((wjg) this.f89756b).setRules(i, c13558b.build());
            return this;
        }

        public C14650b addRules(ujg.C13558b c13558b) {
            m23743e();
            ((wjg) this.f89756b).addRules(c13558b.build());
            return this;
        }

        public C14650b addRules(int i, ujg.C13558b c13558b) {
            m23743e();
            ((wjg) this.f89756b).addRules(i, c13558b.build());
            return this;
        }
    }

    static {
        wjg wjgVar = new wjg();
        DEFAULT_INSTANCE = wjgVar;
        v27.m23715h0(wjg.class, wjgVar);
    }

    private wjg() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllRules(Iterable<? extends ujg> iterable) {
        ensureRulesIsMutable();
        AbstractC1714b3.m2856b(iterable, this.rules_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRules(ujg ujgVar) {
        ujgVar.getClass();
        ensureRulesIsMutable();
        this.rules_.add(ujgVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRules() {
        this.rules_ = v27.m23722x();
    }

    private void ensureRulesIsMutable() {
        w98.InterfaceC14504k<ujg> interfaceC14504k = this.rules_;
        if (interfaceC14504k.isModifiable()) {
            return;
        }
        this.rules_ = v27.m23698P(interfaceC14504k);
    }

    public static wjg getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C14650b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    public static wjg parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (wjg) v27.m23700S(DEFAULT_INSTANCE, inputStream);
    }

    public static wjg parseFrom(ByteBuffer byteBuffer) throws ce8 {
        return (wjg) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static uhc<wjg> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeRules(int i) {
        ensureRulesIsMutable();
        this.rules_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRules(int i, ujg ujgVar) {
        ujgVar.getClass();
        ensureRulesIsMutable();
        this.rules_.set(i, ujgVar);
    }

    @Override // p000.xjg
    public ujg getRules(int i) {
        return this.rules_.get(i);
    }

    @Override // p000.xjg
    public int getRulesCount() {
        return this.rules_.size();
    }

    @Override // p000.xjg
    public List<ujg> getRulesList() {
        return this.rules_;
    }

    public vjg getRulesOrBuilder(int i) {
        return this.rules_.get(i);
    }

    public List<? extends vjg> getRulesOrBuilderList() {
        return this.rules_;
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
        C14649a c14649a = null;
        switch (C14649a.f94440a[enumC13830i.ordinal()]) {
            case 1:
                return new wjg();
            case 2:
                return new C14650b(c14649a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"rules_", ujg.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<wjg> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (wjg.class) {
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

    public static C14650b newBuilder(wjg wjgVar) {
        return DEFAULT_INSTANCE.m23739o(wjgVar);
    }

    public static wjg parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (wjg) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static wjg parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
        return (wjg) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
    }

    public static wjg parseFrom(vj1 vj1Var) throws ce8 {
        return (wjg) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRules(int i, ujg ujgVar) {
        ujgVar.getClass();
        ensureRulesIsMutable();
        this.rules_.add(i, ujgVar);
    }

    public static wjg parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
        return (wjg) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
    }

    public static wjg parseFrom(byte[] bArr) throws ce8 {
        return (wjg) v27.m23710c0(DEFAULT_INSTANCE, bArr);
    }

    public static wjg parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
        return (wjg) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
    }

    public static wjg parseFrom(InputStream inputStream) throws IOException {
        return (wjg) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
    }

    public static wjg parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (wjg) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static wjg parseFrom(f72 f72Var) throws IOException {
        return (wjg) v27.m23704W(DEFAULT_INSTANCE, f72Var);
    }

    public static wjg parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
        return (wjg) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
    }
}
