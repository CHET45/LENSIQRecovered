package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p000.v27;

/* JADX INFO: loaded from: classes5.dex */
public final class nyh extends v27<nyh, C10121b> implements oyh {
    public static final int ALLOW_UNREGISTERED_CALLS_FIELD_NUMBER = 2;
    private static final nyh DEFAULT_INSTANCE;
    private static volatile uhc<nyh> PARSER = null;
    public static final int SELECTOR_FIELD_NUMBER = 1;
    public static final int SKIP_SERVICE_CONTROL_FIELD_NUMBER = 3;
    private boolean allowUnregisteredCalls_;
    private String selector_ = "";
    private boolean skipServiceControl_;

    /* JADX INFO: renamed from: nyh$a */
    public static /* synthetic */ class C10120a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f66100a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f66100a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f66100a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f66100a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f66100a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f66100a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f66100a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f66100a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: nyh$b */
    public static final class C10121b extends v27.AbstractC13823b<nyh, C10121b> implements oyh {
        public /* synthetic */ C10121b(C10120a c10120a) {
            this();
        }

        public C10121b clearAllowUnregisteredCalls() {
            m23743e();
            ((nyh) this.f89756b).clearAllowUnregisteredCalls();
            return this;
        }

        public C10121b clearSelector() {
            m23743e();
            ((nyh) this.f89756b).clearSelector();
            return this;
        }

        public C10121b clearSkipServiceControl() {
            m23743e();
            ((nyh) this.f89756b).clearSkipServiceControl();
            return this;
        }

        @Override // p000.oyh
        public boolean getAllowUnregisteredCalls() {
            return ((nyh) this.f89756b).getAllowUnregisteredCalls();
        }

        @Override // p000.oyh
        public String getSelector() {
            return ((nyh) this.f89756b).getSelector();
        }

        @Override // p000.oyh
        public vj1 getSelectorBytes() {
            return ((nyh) this.f89756b).getSelectorBytes();
        }

        @Override // p000.oyh
        public boolean getSkipServiceControl() {
            return ((nyh) this.f89756b).getSkipServiceControl();
        }

        public C10121b setAllowUnregisteredCalls(boolean z) {
            m23743e();
            ((nyh) this.f89756b).setAllowUnregisteredCalls(z);
            return this;
        }

        public C10121b setSelector(String str) {
            m23743e();
            ((nyh) this.f89756b).setSelector(str);
            return this;
        }

        public C10121b setSelectorBytes(vj1 vj1Var) {
            m23743e();
            ((nyh) this.f89756b).setSelectorBytes(vj1Var);
            return this;
        }

        public C10121b setSkipServiceControl(boolean z) {
            m23743e();
            ((nyh) this.f89756b).setSkipServiceControl(z);
            return this;
        }

        private C10121b() {
            super(nyh.DEFAULT_INSTANCE);
        }
    }

    static {
        nyh nyhVar = new nyh();
        DEFAULT_INSTANCE = nyhVar;
        v27.m23715h0(nyh.class, nyhVar);
    }

    private nyh() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAllowUnregisteredCalls() {
        this.allowUnregisteredCalls_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSelector() {
        this.selector_ = getDefaultInstance().getSelector();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSkipServiceControl() {
        this.skipServiceControl_ = false;
    }

    public static nyh getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C10121b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    public static nyh parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (nyh) v27.m23700S(DEFAULT_INSTANCE, inputStream);
    }

    public static nyh parseFrom(ByteBuffer byteBuffer) throws ce8 {
        return (nyh) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static uhc<nyh> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAllowUnregisteredCalls(boolean z) {
        this.allowUnregisteredCalls_ = z;
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

    /* JADX INFO: Access modifiers changed from: private */
    public void setSkipServiceControl(boolean z) {
        this.skipServiceControl_ = z;
    }

    @Override // p000.oyh
    public boolean getAllowUnregisteredCalls() {
        return this.allowUnregisteredCalls_;
    }

    @Override // p000.oyh
    public String getSelector() {
        return this.selector_;
    }

    @Override // p000.oyh
    public vj1 getSelectorBytes() {
        return vj1.copyFromUtf8(this.selector_);
    }

    @Override // p000.oyh
    public boolean getSkipServiceControl() {
        return this.skipServiceControl_;
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
        C10120a c10120a = null;
        switch (C10120a.f66100a[enumC13830i.ordinal()]) {
            case 1:
                return new nyh();
            case 2:
                return new C10121b(c10120a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\u0007\u0003\u0007", new Object[]{"selector_", "allowUnregisteredCalls_", "skipServiceControl_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<nyh> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (nyh.class) {
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

    public static C10121b newBuilder(nyh nyhVar) {
        return DEFAULT_INSTANCE.m23739o(nyhVar);
    }

    public static nyh parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (nyh) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static nyh parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
        return (nyh) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
    }

    public static nyh parseFrom(vj1 vj1Var) throws ce8 {
        return (nyh) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
    }

    public static nyh parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
        return (nyh) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
    }

    public static nyh parseFrom(byte[] bArr) throws ce8 {
        return (nyh) v27.m23710c0(DEFAULT_INSTANCE, bArr);
    }

    public static nyh parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
        return (nyh) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
    }

    public static nyh parseFrom(InputStream inputStream) throws IOException {
        return (nyh) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
    }

    public static nyh parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (nyh) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static nyh parseFrom(f72 f72Var) throws IOException {
        return (nyh) v27.m23704W(DEFAULT_INSTANCE, f72Var);
    }

    public static nyh parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
        return (nyh) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
    }
}
