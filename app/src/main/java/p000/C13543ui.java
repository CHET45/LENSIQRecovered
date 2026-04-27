package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p000.v27;

/* JADX INFO: renamed from: ui */
/* JADX INFO: loaded from: classes5.dex */
public final class C13543ui extends v27<C13543ui, b> implements InterfaceC14083vi {
    private static final C13543ui DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 2;
    private static volatile uhc<C13543ui> PARSER;
    private String description_ = "";

    /* JADX INFO: renamed from: ui$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f88032a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f88032a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f88032a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f88032a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f88032a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f88032a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f88032a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f88032a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: ui$b */
    public static final class b extends v27.AbstractC13823b<C13543ui, b> implements InterfaceC14083vi {
        public /* synthetic */ b(a aVar) {
            this();
        }

        public b clearDescription() {
            m23743e();
            ((C13543ui) this.f89756b).clearDescription();
            return this;
        }

        @Override // p000.InterfaceC14083vi
        public String getDescription() {
            return ((C13543ui) this.f89756b).getDescription();
        }

        @Override // p000.InterfaceC14083vi
        public vj1 getDescriptionBytes() {
            return ((C13543ui) this.f89756b).getDescriptionBytes();
        }

        public b setDescription(String str) {
            m23743e();
            ((C13543ui) this.f89756b).setDescription(str);
            return this;
        }

        public b setDescriptionBytes(vj1 vj1Var) {
            m23743e();
            ((C13543ui) this.f89756b).setDescriptionBytes(vj1Var);
            return this;
        }

        private b() {
            super(C13543ui.DEFAULT_INSTANCE);
        }
    }

    static {
        C13543ui c13543ui = new C13543ui();
        DEFAULT_INSTANCE = c13543ui;
        v27.m23715h0(C13543ui.class, c13543ui);
    }

    private C13543ui() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDescription() {
        this.description_ = getDefaultInstance().getDescription();
    }

    public static C13543ui getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    public static C13543ui parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (C13543ui) v27.m23700S(DEFAULT_INSTANCE, inputStream);
    }

    public static C13543ui parseFrom(ByteBuffer byteBuffer) throws ce8 {
        return (C13543ui) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static uhc<C13543ui> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDescription(String str) {
        str.getClass();
        this.description_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDescriptionBytes(vj1 vj1Var) {
        AbstractC1714b3.m2857c(vj1Var);
        this.description_ = vj1Var.toStringUtf8();
    }

    @Override // p000.InterfaceC14083vi
    public String getDescription() {
        return this.description_;
    }

    @Override // p000.InterfaceC14083vi
    public vj1 getDescriptionBytes() {
        return vj1.copyFromUtf8(this.description_);
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f88032a[enumC13830i.ordinal()]) {
            case 1:
                return new C13543ui();
            case 2:
                return new b(aVar);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002Ȉ", new Object[]{"description_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<C13543ui> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (C13543ui.class) {
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

    public static b newBuilder(C13543ui c13543ui) {
        return DEFAULT_INSTANCE.m23739o(c13543ui);
    }

    public static C13543ui parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (C13543ui) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static C13543ui parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
        return (C13543ui) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
    }

    public static C13543ui parseFrom(vj1 vj1Var) throws ce8 {
        return (C13543ui) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
    }

    public static C13543ui parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
        return (C13543ui) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
    }

    public static C13543ui parseFrom(byte[] bArr) throws ce8 {
        return (C13543ui) v27.m23710c0(DEFAULT_INSTANCE, bArr);
    }

    public static C13543ui parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
        return (C13543ui) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
    }

    public static C13543ui parseFrom(InputStream inputStream) throws IOException {
        return (C13543ui) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
    }

    public static C13543ui parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (C13543ui) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static C13543ui parseFrom(f72 f72Var) throws IOException {
        return (C13543ui) v27.m23704W(DEFAULT_INSTANCE, f72Var);
    }

    public static C13543ui parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
        return (C13543ui) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
    }
}
