package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import p000.C15896yz;
import p000.v27;
import p000.w98;

/* JADX INFO: loaded from: classes5.dex */
public final class fwf extends v27<fwf, C6009b> implements gwf {
    private static final fwf DEFAULT_INSTANCE;
    private static volatile uhc<fwf> PARSER = null;
    public static final int SOURCE_FILES_FIELD_NUMBER = 1;
    private w98.InterfaceC14504k<C15896yz> sourceFiles_ = v27.m23722x();

    /* JADX INFO: renamed from: fwf$a */
    public static /* synthetic */ class C6008a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f37892a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f37892a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f37892a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f37892a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f37892a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f37892a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f37892a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f37892a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: fwf$b */
    public static final class C6009b extends v27.AbstractC13823b<fwf, C6009b> implements gwf {
        public /* synthetic */ C6009b(C6008a c6008a) {
            this();
        }

        public C6009b addAllSourceFiles(Iterable<? extends C15896yz> iterable) {
            m23743e();
            ((fwf) this.f89756b).addAllSourceFiles(iterable);
            return this;
        }

        public C6009b addSourceFiles(C15896yz c15896yz) {
            m23743e();
            ((fwf) this.f89756b).addSourceFiles(c15896yz);
            return this;
        }

        public C6009b clearSourceFiles() {
            m23743e();
            ((fwf) this.f89756b).clearSourceFiles();
            return this;
        }

        @Override // p000.gwf
        public C15896yz getSourceFiles(int i) {
            return ((fwf) this.f89756b).getSourceFiles(i);
        }

        @Override // p000.gwf
        public int getSourceFilesCount() {
            return ((fwf) this.f89756b).getSourceFilesCount();
        }

        @Override // p000.gwf
        public List<C15896yz> getSourceFilesList() {
            return Collections.unmodifiableList(((fwf) this.f89756b).getSourceFilesList());
        }

        public C6009b removeSourceFiles(int i) {
            m23743e();
            ((fwf) this.f89756b).removeSourceFiles(i);
            return this;
        }

        public C6009b setSourceFiles(int i, C15896yz c15896yz) {
            m23743e();
            ((fwf) this.f89756b).setSourceFiles(i, c15896yz);
            return this;
        }

        private C6009b() {
            super(fwf.DEFAULT_INSTANCE);
        }

        public C6009b addSourceFiles(int i, C15896yz c15896yz) {
            m23743e();
            ((fwf) this.f89756b).addSourceFiles(i, c15896yz);
            return this;
        }

        public C6009b setSourceFiles(int i, C15896yz.b bVar) {
            m23743e();
            ((fwf) this.f89756b).setSourceFiles(i, bVar.build());
            return this;
        }

        public C6009b addSourceFiles(C15896yz.b bVar) {
            m23743e();
            ((fwf) this.f89756b).addSourceFiles(bVar.build());
            return this;
        }

        public C6009b addSourceFiles(int i, C15896yz.b bVar) {
            m23743e();
            ((fwf) this.f89756b).addSourceFiles(i, bVar.build());
            return this;
        }
    }

    static {
        fwf fwfVar = new fwf();
        DEFAULT_INSTANCE = fwfVar;
        v27.m23715h0(fwf.class, fwfVar);
    }

    private fwf() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllSourceFiles(Iterable<? extends C15896yz> iterable) {
        ensureSourceFilesIsMutable();
        AbstractC1714b3.m2856b(iterable, this.sourceFiles_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSourceFiles(C15896yz c15896yz) {
        c15896yz.getClass();
        ensureSourceFilesIsMutable();
        this.sourceFiles_.add(c15896yz);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSourceFiles() {
        this.sourceFiles_ = v27.m23722x();
    }

    private void ensureSourceFilesIsMutable() {
        w98.InterfaceC14504k<C15896yz> interfaceC14504k = this.sourceFiles_;
        if (interfaceC14504k.isModifiable()) {
            return;
        }
        this.sourceFiles_ = v27.m23698P(interfaceC14504k);
    }

    public static fwf getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C6009b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    public static fwf parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (fwf) v27.m23700S(DEFAULT_INSTANCE, inputStream);
    }

    public static fwf parseFrom(ByteBuffer byteBuffer) throws ce8 {
        return (fwf) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static uhc<fwf> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeSourceFiles(int i) {
        ensureSourceFilesIsMutable();
        this.sourceFiles_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSourceFiles(int i, C15896yz c15896yz) {
        c15896yz.getClass();
        ensureSourceFilesIsMutable();
        this.sourceFiles_.set(i, c15896yz);
    }

    @Override // p000.gwf
    public C15896yz getSourceFiles(int i) {
        return this.sourceFiles_.get(i);
    }

    @Override // p000.gwf
    public int getSourceFilesCount() {
        return this.sourceFiles_.size();
    }

    @Override // p000.gwf
    public List<C15896yz> getSourceFilesList() {
        return this.sourceFiles_;
    }

    public a00 getSourceFilesOrBuilder(int i) {
        return this.sourceFiles_.get(i);
    }

    public List<? extends a00> getSourceFilesOrBuilderList() {
        return this.sourceFiles_;
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
        C6008a c6008a = null;
        switch (C6008a.f37892a[enumC13830i.ordinal()]) {
            case 1:
                return new fwf();
            case 2:
                return new C6009b(c6008a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"sourceFiles_", C15896yz.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<fwf> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (fwf.class) {
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

    public static C6009b newBuilder(fwf fwfVar) {
        return DEFAULT_INSTANCE.m23739o(fwfVar);
    }

    public static fwf parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (fwf) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static fwf parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
        return (fwf) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
    }

    public static fwf parseFrom(vj1 vj1Var) throws ce8 {
        return (fwf) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSourceFiles(int i, C15896yz c15896yz) {
        c15896yz.getClass();
        ensureSourceFilesIsMutable();
        this.sourceFiles_.add(i, c15896yz);
    }

    public static fwf parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
        return (fwf) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
    }

    public static fwf parseFrom(byte[] bArr) throws ce8 {
        return (fwf) v27.m23710c0(DEFAULT_INSTANCE, bArr);
    }

    public static fwf parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
        return (fwf) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
    }

    public static fwf parseFrom(InputStream inputStream) throws IOException {
        return (fwf) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
    }

    public static fwf parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (fwf) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static fwf parseFrom(f72 f72Var) throws IOException {
        return (fwf) v27.m23704W(DEFAULT_INSTANCE, f72Var);
    }

    public static fwf parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
        return (fwf) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
    }
}
