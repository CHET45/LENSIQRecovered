package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import p000.v27;
import p000.w98;

/* JADX INFO: loaded from: classes4.dex */
public final class pr5 extends v27<pr5, C11078b> implements qr5 {
    private static final pr5 DEFAULT_INSTANCE;
    private static volatile uhc<pr5> PARSER = null;
    public static final int PATHS_FIELD_NUMBER = 1;
    private w98.InterfaceC14504k<String> paths_ = v27.m23722x();

    /* JADX INFO: renamed from: pr5$a */
    public static /* synthetic */ class C11077a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f71729a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f71729a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f71729a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f71729a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f71729a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f71729a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f71729a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f71729a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: pr5$b */
    public static final class C11078b extends v27.AbstractC13823b<pr5, C11078b> implements qr5 {
        public /* synthetic */ C11078b(C11077a c11077a) {
            this();
        }

        public C11078b addAllPaths(Iterable<String> values) {
            m23743e();
            ((pr5) this.f89756b).addAllPaths(values);
            return this;
        }

        public C11078b addPaths(String value) {
            m23743e();
            ((pr5) this.f89756b).addPaths(value);
            return this;
        }

        public C11078b addPathsBytes(vj1 value) {
            m23743e();
            ((pr5) this.f89756b).addPathsBytes(value);
            return this;
        }

        public C11078b clearPaths() {
            m23743e();
            ((pr5) this.f89756b).clearPaths();
            return this;
        }

        @Override // p000.qr5
        public String getPaths(int index) {
            return ((pr5) this.f89756b).getPaths(index);
        }

        @Override // p000.qr5
        public vj1 getPathsBytes(int index) {
            return ((pr5) this.f89756b).getPathsBytes(index);
        }

        @Override // p000.qr5
        public int getPathsCount() {
            return ((pr5) this.f89756b).getPathsCount();
        }

        @Override // p000.qr5
        public List<String> getPathsList() {
            return Collections.unmodifiableList(((pr5) this.f89756b).getPathsList());
        }

        public C11078b setPaths(int index, String value) {
            m23743e();
            ((pr5) this.f89756b).setPaths(index, value);
            return this;
        }

        private C11078b() {
            super(pr5.DEFAULT_INSTANCE);
        }
    }

    static {
        pr5 pr5Var = new pr5();
        DEFAULT_INSTANCE = pr5Var;
        v27.m23715h0(pr5.class, pr5Var);
    }

    private pr5() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllPaths(Iterable<String> values) {
        ensurePathsIsMutable();
        AbstractC1714b3.m2856b(values, this.paths_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPaths(String value) {
        value.getClass();
        ensurePathsIsMutable();
        this.paths_.add(value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPathsBytes(vj1 value) {
        AbstractC1714b3.m2857c(value);
        ensurePathsIsMutable();
        this.paths_.add(value.toStringUtf8());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPaths() {
        this.paths_ = v27.m23722x();
    }

    private void ensurePathsIsMutable() {
        w98.InterfaceC14504k<String> interfaceC14504k = this.paths_;
        if (interfaceC14504k.isModifiable()) {
            return;
        }
        this.paths_ = v27.m23698P(interfaceC14504k);
    }

    public static pr5 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C11078b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    public static pr5 parseDelimitedFrom(InputStream input) throws IOException {
        return (pr5) v27.m23700S(DEFAULT_INSTANCE, input);
    }

    public static pr5 parseFrom(ByteBuffer data) throws ce8 {
        return (pr5) v27.m23708a0(DEFAULT_INSTANCE, data);
    }

    public static uhc<pr5> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPaths(int index, String value) {
        value.getClass();
        ensurePathsIsMutable();
        this.paths_.set(index, value);
    }

    @Override // p000.qr5
    public String getPaths(int index) {
        return this.paths_.get(index);
    }

    @Override // p000.qr5
    public vj1 getPathsBytes(int index) {
        return vj1.copyFromUtf8(this.paths_.get(index));
    }

    @Override // p000.qr5
    public int getPathsCount() {
        return this.paths_.size();
    }

    @Override // p000.qr5
    public List<String> getPathsList() {
        return this.paths_;
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i method, Object arg0, Object arg1) {
        C11077a c11077a = null;
        switch (C11077a.f71729a[method.ordinal()]) {
            case 1:
                return new pr5();
            case 2:
                return new C11078b(c11077a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001Ț", new Object[]{"paths_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<pr5> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (pr5.class) {
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

    public static C11078b newBuilder(pr5 prototype) {
        return DEFAULT_INSTANCE.m23739o(prototype);
    }

    public static pr5 parseDelimitedFrom(InputStream input, zi5 extensionRegistry) throws IOException {
        return (pr5) v27.m23701T(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static pr5 parseFrom(ByteBuffer data, zi5 extensionRegistry) throws ce8 {
        return (pr5) v27.m23709b0(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static pr5 parseFrom(vj1 data) throws ce8 {
        return (pr5) v27.m23702U(DEFAULT_INSTANCE, data);
    }

    public static pr5 parseFrom(vj1 data, zi5 extensionRegistry) throws ce8 {
        return (pr5) v27.m23703V(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static pr5 parseFrom(byte[] data) throws ce8 {
        return (pr5) v27.m23710c0(DEFAULT_INSTANCE, data);
    }

    public static pr5 parseFrom(byte[] data, zi5 extensionRegistry) throws ce8 {
        return (pr5) v27.m23711d0(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static pr5 parseFrom(InputStream input) throws IOException {
        return (pr5) v27.m23706Y(DEFAULT_INSTANCE, input);
    }

    public static pr5 parseFrom(InputStream input, zi5 extensionRegistry) throws IOException {
        return (pr5) v27.m23707Z(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static pr5 parseFrom(f72 input) throws IOException {
        return (pr5) v27.m23704W(DEFAULT_INSTANCE, input);
    }

    public static pr5 parseFrom(f72 input, zi5 extensionRegistry) throws IOException {
        return (pr5) v27.m23705X(DEFAULT_INSTANCE, input, extensionRegistry);
    }
}
