package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p000.v27;

/* JADX INFO: loaded from: classes5.dex */
public final class r7b extends v27<r7b, C11936b> implements t7b {
    private static final r7b DEFAULT_INSTANCE;
    public static final int LAST_ACKNOWLEDGED_BATCH_ID_FIELD_NUMBER = 1;
    public static final int LAST_STREAM_TOKEN_FIELD_NUMBER = 2;
    private static volatile uhc<r7b> PARSER;
    private int lastAcknowledgedBatchId_;
    private vj1 lastStreamToken_ = vj1.f91344e;

    /* JADX INFO: renamed from: r7b$a */
    public static /* synthetic */ class C11935a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f77333a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f77333a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f77333a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f77333a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f77333a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f77333a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f77333a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f77333a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: r7b$b */
    public static final class C11936b extends v27.AbstractC13823b<r7b, C11936b> implements t7b {
        public /* synthetic */ C11936b(C11935a c11935a) {
            this();
        }

        public C11936b clearLastAcknowledgedBatchId() {
            m23743e();
            ((r7b) this.f89756b).clearLastAcknowledgedBatchId();
            return this;
        }

        public C11936b clearLastStreamToken() {
            m23743e();
            ((r7b) this.f89756b).clearLastStreamToken();
            return this;
        }

        @Override // p000.t7b
        public int getLastAcknowledgedBatchId() {
            return ((r7b) this.f89756b).getLastAcknowledgedBatchId();
        }

        @Override // p000.t7b
        public vj1 getLastStreamToken() {
            return ((r7b) this.f89756b).getLastStreamToken();
        }

        public C11936b setLastAcknowledgedBatchId(int i) {
            m23743e();
            ((r7b) this.f89756b).setLastAcknowledgedBatchId(i);
            return this;
        }

        public C11936b setLastStreamToken(vj1 vj1Var) {
            m23743e();
            ((r7b) this.f89756b).setLastStreamToken(vj1Var);
            return this;
        }

        private C11936b() {
            super(r7b.DEFAULT_INSTANCE);
        }
    }

    static {
        r7b r7bVar = new r7b();
        DEFAULT_INSTANCE = r7bVar;
        v27.m23715h0(r7b.class, r7bVar);
    }

    private r7b() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLastAcknowledgedBatchId() {
        this.lastAcknowledgedBatchId_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLastStreamToken() {
        this.lastStreamToken_ = getDefaultInstance().getLastStreamToken();
    }

    public static r7b getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C11936b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    public static r7b parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (r7b) v27.m23700S(DEFAULT_INSTANCE, inputStream);
    }

    public static r7b parseFrom(ByteBuffer byteBuffer) throws ce8 {
        return (r7b) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static uhc<r7b> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLastAcknowledgedBatchId(int i) {
        this.lastAcknowledgedBatchId_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLastStreamToken(vj1 vj1Var) {
        vj1Var.getClass();
        this.lastStreamToken_ = vj1Var;
    }

    @Override // p000.t7b
    public int getLastAcknowledgedBatchId() {
        return this.lastAcknowledgedBatchId_;
    }

    @Override // p000.t7b
    public vj1 getLastStreamToken() {
        return this.lastStreamToken_;
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
        C11935a c11935a = null;
        switch (C11935a.f77333a[enumC13830i.ordinal()]) {
            case 1:
                return new r7b();
            case 2:
                return new C11936b(c11935a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002\n", new Object[]{"lastAcknowledgedBatchId_", "lastStreamToken_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<r7b> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (r7b.class) {
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

    public static C11936b newBuilder(r7b r7bVar) {
        return DEFAULT_INSTANCE.m23739o(r7bVar);
    }

    public static r7b parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (r7b) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static r7b parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
        return (r7b) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
    }

    public static r7b parseFrom(vj1 vj1Var) throws ce8 {
        return (r7b) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
    }

    public static r7b parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
        return (r7b) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
    }

    public static r7b parseFrom(byte[] bArr) throws ce8 {
        return (r7b) v27.m23710c0(DEFAULT_INSTANCE, bArr);
    }

    public static r7b parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
        return (r7b) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
    }

    public static r7b parseFrom(InputStream inputStream) throws IOException {
        return (r7b) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
    }

    public static r7b parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (r7b) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static r7b parseFrom(f72 f72Var) throws IOException {
        return (r7b) v27.m23704W(DEFAULT_INSTANCE, f72Var);
    }

    public static r7b parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
        return (r7b) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
    }
}
