package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import p000.u27;
import p000.v98;

/* JADX INFO: loaded from: classes3.dex */
public final class nr5 extends u27<nr5, C10022b> implements rr5 {
    private static final nr5 DEFAULT_INSTANCE;
    private static volatile vhc<nr5> PARSER = null;
    public static final int PATHS_FIELD_NUMBER = 1;
    private v98.InterfaceC13956l<String> paths_ = u27.m23036w();

    /* JADX INFO: renamed from: nr5$a */
    public static /* synthetic */ class C10021a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f65365a;

        static {
            int[] iArr = new int[u27.EnumC13331i.values().length];
            f65365a = iArr;
            try {
                iArr[u27.EnumC13331i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f65365a[u27.EnumC13331i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f65365a[u27.EnumC13331i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f65365a[u27.EnumC13331i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f65365a[u27.EnumC13331i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f65365a[u27.EnumC13331i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f65365a[u27.EnumC13331i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: nr5$b */
    public static final class C10022b extends u27.AbstractC13324b<nr5, C10022b> implements rr5 {
        public /* synthetic */ C10022b(C10021a c10021a) {
            this();
        }

        public C10022b addAllPaths(Iterable<String> values) {
            m23058e();
            ((nr5) this.f86607b).addAllPaths(values);
            return this;
        }

        public C10022b addPaths(String value) {
            m23058e();
            ((nr5) this.f86607b).addPaths(value);
            return this;
        }

        public C10022b addPathsBytes(wj1 value) {
            m23058e();
            ((nr5) this.f86607b).addPathsBytes(value);
            return this;
        }

        public C10022b clearPaths() {
            m23058e();
            ((nr5) this.f86607b).clearPaths();
            return this;
        }

        @Override // p000.rr5
        public String getPaths(int index) {
            return ((nr5) this.f86607b).getPaths(index);
        }

        @Override // p000.rr5
        public wj1 getPathsBytes(int index) {
            return ((nr5) this.f86607b).getPathsBytes(index);
        }

        @Override // p000.rr5
        public int getPathsCount() {
            return ((nr5) this.f86607b).getPathsCount();
        }

        @Override // p000.rr5
        public List<String> getPathsList() {
            return Collections.unmodifiableList(((nr5) this.f86607b).getPathsList());
        }

        public C10022b setPaths(int index, String value) {
            m23058e();
            ((nr5) this.f86607b).setPaths(index, value);
            return this;
        }

        private C10022b() {
            super(nr5.DEFAULT_INSTANCE);
        }
    }

    static {
        nr5 nr5Var = new nr5();
        DEFAULT_INSTANCE = nr5Var;
        u27.m23029g0(nr5.class, nr5Var);
    }

    private nr5() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllPaths(Iterable<String> values) {
        ensurePathsIsMutable();
        AbstractC0027a3.m80a(values, this.paths_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPaths(String value) {
        value.getClass();
        ensurePathsIsMutable();
        this.paths_.add(value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPathsBytes(wj1 value) {
        AbstractC0027a3.m81b(value);
        ensurePathsIsMutable();
        this.paths_.add(value.toStringUtf8());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPaths() {
        this.paths_ = u27.m23036w();
    }

    private void ensurePathsIsMutable() {
        v98.InterfaceC13956l<String> interfaceC13956l = this.paths_;
        if (interfaceC13956l.isModifiable()) {
            return;
        }
        this.paths_ = u27.m23012O(interfaceC13956l);
    }

    public static nr5 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C10022b newBuilder() {
        return DEFAULT_INSTANCE.m23053m();
    }

    public static nr5 parseDelimitedFrom(InputStream input) throws IOException {
        return (nr5) u27.m23014R(DEFAULT_INSTANCE, input);
    }

    public static nr5 parseFrom(ByteBuffer data) throws be8 {
        return (nr5) u27.m23022Z(DEFAULT_INSTANCE, data);
    }

    public static vhc<nr5> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPaths(int index, String value) {
        value.getClass();
        ensurePathsIsMutable();
        this.paths_.set(index, value);
    }

    @Override // p000.rr5
    public String getPaths(int index) {
        return this.paths_.get(index);
    }

    @Override // p000.rr5
    public wj1 getPathsBytes(int index) {
        return wj1.copyFromUtf8(this.paths_.get(index));
    }

    @Override // p000.rr5
    public int getPathsCount() {
        return this.paths_.size();
    }

    @Override // p000.rr5
    public List<String> getPathsList() {
        return this.paths_;
    }

    @Override // p000.u27
    /* JADX INFO: renamed from: q */
    public final Object mo79q(u27.EnumC13331i method, Object arg0, Object arg1) {
        C10021a c10021a = null;
        switch (C10021a.f65365a[method.ordinal()]) {
            case 1:
                return new nr5();
            case 2:
                return new C10022b(c10021a);
            case 3:
                return u27.m23013P(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001Ț", new Object[]{"paths_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                vhc<nr5> c13325c = PARSER;
                if (c13325c == null) {
                    synchronized (nr5.class) {
                        try {
                            c13325c = PARSER;
                            if (c13325c == null) {
                                c13325c = new u27.C13325c<>(DEFAULT_INSTANCE);
                                PARSER = c13325c;
                            }
                        } finally {
                        }
                        break;
                    }
                }
                return c13325c;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public static C10022b newBuilder(nr5 prototype) {
        return DEFAULT_INSTANCE.m23054n(prototype);
    }

    public static nr5 parseDelimitedFrom(InputStream input, yi5 extensionRegistry) throws IOException {
        return (nr5) u27.m23015S(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static nr5 parseFrom(ByteBuffer data, yi5 extensionRegistry) throws be8 {
        return (nr5) u27.m23023a0(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static nr5 parseFrom(wj1 data) throws be8 {
        return (nr5) u27.m23016T(DEFAULT_INSTANCE, data);
    }

    public static nr5 parseFrom(wj1 data, yi5 extensionRegistry) throws be8 {
        return (nr5) u27.m23017U(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static nr5 parseFrom(byte[] data) throws be8 {
        return (nr5) u27.m23024b0(DEFAULT_INSTANCE, data);
    }

    public static nr5 parseFrom(byte[] data, yi5 extensionRegistry) throws be8 {
        return (nr5) u27.m23025c0(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static nr5 parseFrom(InputStream input) throws IOException {
        return (nr5) u27.m23020X(DEFAULT_INSTANCE, input);
    }

    public static nr5 parseFrom(InputStream input, yi5 extensionRegistry) throws IOException {
        return (nr5) u27.m23021Y(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static nr5 parseFrom(e72 input) throws IOException {
        return (nr5) u27.m23018V(DEFAULT_INSTANCE, input);
    }

    public static nr5 parseFrom(e72 input, yi5 extensionRegistry) throws IOException {
        return (nr5) u27.m23019W(DEFAULT_INSTANCE, input, extensionRegistry);
    }
}
