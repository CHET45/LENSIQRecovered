package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import p000.v27;
import p000.w98;

/* JADX INFO: loaded from: classes5.dex */
public final class di4 extends v27<di4, C4792b> implements ei4 {
    private static final di4 DEFAULT_INSTANCE;
    public static final int FIELD_PATHS_FIELD_NUMBER = 1;
    private static volatile uhc<di4> PARSER;
    private w98.InterfaceC14504k<String> fieldPaths_ = v27.m23722x();

    /* JADX INFO: renamed from: di4$a */
    public static /* synthetic */ class C4791a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f29692a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f29692a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29692a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f29692a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f29692a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f29692a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f29692a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f29692a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: di4$b */
    public static final class C4792b extends v27.AbstractC13823b<di4, C4792b> implements ei4 {
        public /* synthetic */ C4792b(C4791a c4791a) {
            this();
        }

        public C4792b addAllFieldPaths(Iterable<String> iterable) {
            m23743e();
            ((di4) this.f89756b).addAllFieldPaths(iterable);
            return this;
        }

        public C4792b addFieldPaths(String str) {
            m23743e();
            ((di4) this.f89756b).addFieldPaths(str);
            return this;
        }

        public C4792b addFieldPathsBytes(vj1 vj1Var) {
            m23743e();
            ((di4) this.f89756b).addFieldPathsBytes(vj1Var);
            return this;
        }

        public C4792b clearFieldPaths() {
            m23743e();
            ((di4) this.f89756b).clearFieldPaths();
            return this;
        }

        @Override // p000.ei4
        public String getFieldPaths(int i) {
            return ((di4) this.f89756b).getFieldPaths(i);
        }

        @Override // p000.ei4
        public vj1 getFieldPathsBytes(int i) {
            return ((di4) this.f89756b).getFieldPathsBytes(i);
        }

        @Override // p000.ei4
        public int getFieldPathsCount() {
            return ((di4) this.f89756b).getFieldPathsCount();
        }

        @Override // p000.ei4
        public List<String> getFieldPathsList() {
            return Collections.unmodifiableList(((di4) this.f89756b).getFieldPathsList());
        }

        public C4792b setFieldPaths(int i, String str) {
            m23743e();
            ((di4) this.f89756b).setFieldPaths(i, str);
            return this;
        }

        private C4792b() {
            super(di4.DEFAULT_INSTANCE);
        }
    }

    static {
        di4 di4Var = new di4();
        DEFAULT_INSTANCE = di4Var;
        v27.m23715h0(di4.class, di4Var);
    }

    private di4() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllFieldPaths(Iterable<String> iterable) {
        ensureFieldPathsIsMutable();
        AbstractC1714b3.m2856b(iterable, this.fieldPaths_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addFieldPaths(String str) {
        str.getClass();
        ensureFieldPathsIsMutable();
        this.fieldPaths_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addFieldPathsBytes(vj1 vj1Var) {
        AbstractC1714b3.m2857c(vj1Var);
        ensureFieldPathsIsMutable();
        this.fieldPaths_.add(vj1Var.toStringUtf8());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFieldPaths() {
        this.fieldPaths_ = v27.m23722x();
    }

    private void ensureFieldPathsIsMutable() {
        w98.InterfaceC14504k<String> interfaceC14504k = this.fieldPaths_;
        if (interfaceC14504k.isModifiable()) {
            return;
        }
        this.fieldPaths_ = v27.m23698P(interfaceC14504k);
    }

    public static di4 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C4792b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    public static di4 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (di4) v27.m23700S(DEFAULT_INSTANCE, inputStream);
    }

    public static di4 parseFrom(ByteBuffer byteBuffer) throws ce8 {
        return (di4) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static uhc<di4> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFieldPaths(int i, String str) {
        str.getClass();
        ensureFieldPathsIsMutable();
        this.fieldPaths_.set(i, str);
    }

    @Override // p000.ei4
    public String getFieldPaths(int i) {
        return this.fieldPaths_.get(i);
    }

    @Override // p000.ei4
    public vj1 getFieldPathsBytes(int i) {
        return vj1.copyFromUtf8(this.fieldPaths_.get(i));
    }

    @Override // p000.ei4
    public int getFieldPathsCount() {
        return this.fieldPaths_.size();
    }

    @Override // p000.ei4
    public List<String> getFieldPathsList() {
        return this.fieldPaths_;
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
        C4791a c4791a = null;
        switch (C4791a.f29692a[enumC13830i.ordinal()]) {
            case 1:
                return new di4();
            case 2:
                return new C4792b(c4791a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001Ț", new Object[]{"fieldPaths_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<di4> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (di4.class) {
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

    public static C4792b newBuilder(di4 di4Var) {
        return DEFAULT_INSTANCE.m23739o(di4Var);
    }

    public static di4 parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (di4) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static di4 parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
        return (di4) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
    }

    public static di4 parseFrom(vj1 vj1Var) throws ce8 {
        return (di4) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
    }

    public static di4 parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
        return (di4) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
    }

    public static di4 parseFrom(byte[] bArr) throws ce8 {
        return (di4) v27.m23710c0(DEFAULT_INSTANCE, bArr);
    }

    public static di4 parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
        return (di4) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
    }

    public static di4 parseFrom(InputStream inputStream) throws IOException {
        return (di4) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
    }

    public static di4 parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (di4) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static di4 parseFrom(f72 f72Var) throws IOException {
        return (di4) v27.m23704W(DEFAULT_INSTANCE, f72Var);
    }

    public static di4 parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
        return (di4) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
    }
}
