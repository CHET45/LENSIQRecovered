package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import p000.po7;
import p000.v27;
import p000.w98;

/* JADX INFO: loaded from: classes5.dex */
public final class tm7 extends v27<tm7, C13105b> implements io7 {
    private static final tm7 DEFAULT_INSTANCE;
    public static final int FULLY_DECODE_RESERVED_EXPANSION_FIELD_NUMBER = 2;
    private static volatile uhc<tm7> PARSER = null;
    public static final int RULES_FIELD_NUMBER = 1;
    private boolean fullyDecodeReservedExpansion_;
    private w98.InterfaceC14504k<po7> rules_ = v27.m23722x();

    /* JADX INFO: renamed from: tm7$a */
    public static /* synthetic */ class C13104a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f85317a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f85317a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f85317a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f85317a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f85317a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f85317a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f85317a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f85317a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: tm7$b */
    public static final class C13105b extends v27.AbstractC13823b<tm7, C13105b> implements io7 {
        public /* synthetic */ C13105b(C13104a c13104a) {
            this();
        }

        public C13105b addAllRules(Iterable<? extends po7> iterable) {
            m23743e();
            ((tm7) this.f89756b).addAllRules(iterable);
            return this;
        }

        public C13105b addRules(po7 po7Var) {
            m23743e();
            ((tm7) this.f89756b).addRules(po7Var);
            return this;
        }

        public C13105b clearFullyDecodeReservedExpansion() {
            m23743e();
            ((tm7) this.f89756b).clearFullyDecodeReservedExpansion();
            return this;
        }

        public C13105b clearRules() {
            m23743e();
            ((tm7) this.f89756b).clearRules();
            return this;
        }

        @Override // p000.io7
        public boolean getFullyDecodeReservedExpansion() {
            return ((tm7) this.f89756b).getFullyDecodeReservedExpansion();
        }

        @Override // p000.io7
        public po7 getRules(int i) {
            return ((tm7) this.f89756b).getRules(i);
        }

        @Override // p000.io7
        public int getRulesCount() {
            return ((tm7) this.f89756b).getRulesCount();
        }

        @Override // p000.io7
        public List<po7> getRulesList() {
            return Collections.unmodifiableList(((tm7) this.f89756b).getRulesList());
        }

        public C13105b removeRules(int i) {
            m23743e();
            ((tm7) this.f89756b).removeRules(i);
            return this;
        }

        public C13105b setFullyDecodeReservedExpansion(boolean z) {
            m23743e();
            ((tm7) this.f89756b).setFullyDecodeReservedExpansion(z);
            return this;
        }

        public C13105b setRules(int i, po7 po7Var) {
            m23743e();
            ((tm7) this.f89756b).setRules(i, po7Var);
            return this;
        }

        private C13105b() {
            super(tm7.DEFAULT_INSTANCE);
        }

        public C13105b addRules(int i, po7 po7Var) {
            m23743e();
            ((tm7) this.f89756b).addRules(i, po7Var);
            return this;
        }

        public C13105b setRules(int i, po7.C11054b c11054b) {
            m23743e();
            ((tm7) this.f89756b).setRules(i, c11054b.build());
            return this;
        }

        public C13105b addRules(po7.C11054b c11054b) {
            m23743e();
            ((tm7) this.f89756b).addRules(c11054b.build());
            return this;
        }

        public C13105b addRules(int i, po7.C11054b c11054b) {
            m23743e();
            ((tm7) this.f89756b).addRules(i, c11054b.build());
            return this;
        }
    }

    static {
        tm7 tm7Var = new tm7();
        DEFAULT_INSTANCE = tm7Var;
        v27.m23715h0(tm7.class, tm7Var);
    }

    private tm7() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllRules(Iterable<? extends po7> iterable) {
        ensureRulesIsMutable();
        AbstractC1714b3.m2856b(iterable, this.rules_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRules(po7 po7Var) {
        po7Var.getClass();
        ensureRulesIsMutable();
        this.rules_.add(po7Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFullyDecodeReservedExpansion() {
        this.fullyDecodeReservedExpansion_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRules() {
        this.rules_ = v27.m23722x();
    }

    private void ensureRulesIsMutable() {
        w98.InterfaceC14504k<po7> interfaceC14504k = this.rules_;
        if (interfaceC14504k.isModifiable()) {
            return;
        }
        this.rules_ = v27.m23698P(interfaceC14504k);
    }

    public static tm7 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C13105b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    public static tm7 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (tm7) v27.m23700S(DEFAULT_INSTANCE, inputStream);
    }

    public static tm7 parseFrom(ByteBuffer byteBuffer) throws ce8 {
        return (tm7) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static uhc<tm7> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeRules(int i) {
        ensureRulesIsMutable();
        this.rules_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFullyDecodeReservedExpansion(boolean z) {
        this.fullyDecodeReservedExpansion_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRules(int i, po7 po7Var) {
        po7Var.getClass();
        ensureRulesIsMutable();
        this.rules_.set(i, po7Var);
    }

    @Override // p000.io7
    public boolean getFullyDecodeReservedExpansion() {
        return this.fullyDecodeReservedExpansion_;
    }

    @Override // p000.io7
    public po7 getRules(int i) {
        return this.rules_.get(i);
    }

    @Override // p000.io7
    public int getRulesCount() {
        return this.rules_.size();
    }

    @Override // p000.io7
    public List<po7> getRulesList() {
        return this.rules_;
    }

    public qo7 getRulesOrBuilder(int i) {
        return this.rules_.get(i);
    }

    public List<? extends qo7> getRulesOrBuilderList() {
        return this.rules_;
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
        C13104a c13104a = null;
        switch (C13104a.f85317a[enumC13830i.ordinal()]) {
            case 1:
                return new tm7();
            case 2:
                return new C13105b(c13104a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u0007", new Object[]{"rules_", po7.class, "fullyDecodeReservedExpansion_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<tm7> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (tm7.class) {
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

    public static C13105b newBuilder(tm7 tm7Var) {
        return DEFAULT_INSTANCE.m23739o(tm7Var);
    }

    public static tm7 parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (tm7) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static tm7 parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
        return (tm7) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
    }

    public static tm7 parseFrom(vj1 vj1Var) throws ce8 {
        return (tm7) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRules(int i, po7 po7Var) {
        po7Var.getClass();
        ensureRulesIsMutable();
        this.rules_.add(i, po7Var);
    }

    public static tm7 parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
        return (tm7) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
    }

    public static tm7 parseFrom(byte[] bArr) throws ce8 {
        return (tm7) v27.m23710c0(DEFAULT_INSTANCE, bArr);
    }

    public static tm7 parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
        return (tm7) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
    }

    public static tm7 parseFrom(InputStream inputStream) throws IOException {
        return (tm7) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
    }

    public static tm7 parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (tm7) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static tm7 parseFrom(f72 f72Var) throws IOException {
        return (tm7) v27.m23704W(DEFAULT_INSTANCE, f72Var);
    }

    public static tm7 parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
        return (tm7) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
    }
}
