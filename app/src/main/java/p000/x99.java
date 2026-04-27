package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import p000.a2i;
import p000.u27;
import p000.v98;

/* JADX INFO: loaded from: classes3.dex */
public final class x99 extends u27<x99, C15005b> implements aa9 {
    private static final x99 DEFAULT_INSTANCE;
    private static volatile vhc<x99> PARSER = null;
    public static final int VALUES_FIELD_NUMBER = 1;
    private v98.InterfaceC13956l<a2i> values_ = u27.m23036w();

    /* JADX INFO: renamed from: x99$a */
    public static /* synthetic */ class C15004a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f97290a;

        static {
            int[] iArr = new int[u27.EnumC13331i.values().length];
            f97290a = iArr;
            try {
                iArr[u27.EnumC13331i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f97290a[u27.EnumC13331i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f97290a[u27.EnumC13331i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f97290a[u27.EnumC13331i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f97290a[u27.EnumC13331i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f97290a[u27.EnumC13331i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f97290a[u27.EnumC13331i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: x99$b */
    public static final class C15005b extends u27.AbstractC13324b<x99, C15005b> implements aa9 {
        public /* synthetic */ C15005b(C15004a c15004a) {
            this();
        }

        public C15005b addAllValues(Iterable<? extends a2i> values) {
            m23058e();
            ((x99) this.f86607b).addAllValues(values);
            return this;
        }

        public C15005b addValues(a2i value) {
            m23058e();
            ((x99) this.f86607b).addValues(value);
            return this;
        }

        public C15005b clearValues() {
            m23058e();
            ((x99) this.f86607b).clearValues();
            return this;
        }

        @Override // p000.aa9
        public a2i getValues(int index) {
            return ((x99) this.f86607b).getValues(index);
        }

        @Override // p000.aa9
        public int getValuesCount() {
            return ((x99) this.f86607b).getValuesCount();
        }

        @Override // p000.aa9
        public List<a2i> getValuesList() {
            return Collections.unmodifiableList(((x99) this.f86607b).getValuesList());
        }

        public C15005b removeValues(int index) {
            m23058e();
            ((x99) this.f86607b).removeValues(index);
            return this;
        }

        public C15005b setValues(int index, a2i value) {
            m23058e();
            ((x99) this.f86607b).setValues(index, value);
            return this;
        }

        private C15005b() {
            super(x99.DEFAULT_INSTANCE);
        }

        public C15005b addValues(int index, a2i value) {
            m23058e();
            ((x99) this.f86607b).addValues(index, value);
            return this;
        }

        public C15005b setValues(int index, a2i.C0025b builderForValue) {
            m23058e();
            ((x99) this.f86607b).setValues(index, builderForValue.build());
            return this;
        }

        public C15005b addValues(a2i.C0025b builderForValue) {
            m23058e();
            ((x99) this.f86607b).addValues(builderForValue.build());
            return this;
        }

        public C15005b addValues(int index, a2i.C0025b builderForValue) {
            m23058e();
            ((x99) this.f86607b).addValues(index, builderForValue.build());
            return this;
        }
    }

    static {
        x99 x99Var = new x99();
        DEFAULT_INSTANCE = x99Var;
        u27.m23029g0(x99.class, x99Var);
    }

    private x99() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllValues(Iterable<? extends a2i> values) {
        ensureValuesIsMutable();
        AbstractC0027a3.m80a(values, this.values_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addValues(a2i value) {
        value.getClass();
        ensureValuesIsMutable();
        this.values_.add(value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValues() {
        this.values_ = u27.m23036w();
    }

    private void ensureValuesIsMutable() {
        v98.InterfaceC13956l<a2i> interfaceC13956l = this.values_;
        if (interfaceC13956l.isModifiable()) {
            return;
        }
        this.values_ = u27.m23012O(interfaceC13956l);
    }

    public static x99 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C15005b newBuilder() {
        return DEFAULT_INSTANCE.m23053m();
    }

    public static x99 parseDelimitedFrom(InputStream input) throws IOException {
        return (x99) u27.m23014R(DEFAULT_INSTANCE, input);
    }

    public static x99 parseFrom(ByteBuffer data) throws be8 {
        return (x99) u27.m23022Z(DEFAULT_INSTANCE, data);
    }

    public static vhc<x99> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeValues(int index) {
        ensureValuesIsMutable();
        this.values_.remove(index);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValues(int index, a2i value) {
        value.getClass();
        ensureValuesIsMutable();
        this.values_.set(index, value);
    }

    @Override // p000.aa9
    public a2i getValues(int index) {
        return this.values_.get(index);
    }

    @Override // p000.aa9
    public int getValuesCount() {
        return this.values_.size();
    }

    @Override // p000.aa9
    public List<a2i> getValuesList() {
        return this.values_;
    }

    public q2i getValuesOrBuilder(int index) {
        return this.values_.get(index);
    }

    public List<? extends q2i> getValuesOrBuilderList() {
        return this.values_;
    }

    @Override // p000.u27
    /* JADX INFO: renamed from: q */
    public final Object mo79q(u27.EnumC13331i method, Object arg0, Object arg1) {
        C15004a c15004a = null;
        switch (C15004a.f97290a[method.ordinal()]) {
            case 1:
                return new x99();
            case 2:
                return new C15005b(c15004a);
            case 3:
                return u27.m23013P(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"values_", a2i.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                vhc<x99> c13325c = PARSER;
                if (c13325c == null) {
                    synchronized (x99.class) {
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

    public static C15005b newBuilder(x99 prototype) {
        return DEFAULT_INSTANCE.m23054n(prototype);
    }

    public static x99 parseDelimitedFrom(InputStream input, yi5 extensionRegistry) throws IOException {
        return (x99) u27.m23015S(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static x99 parseFrom(ByteBuffer data, yi5 extensionRegistry) throws be8 {
        return (x99) u27.m23023a0(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static x99 parseFrom(wj1 data) throws be8 {
        return (x99) u27.m23016T(DEFAULT_INSTANCE, data);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addValues(int index, a2i value) {
        value.getClass();
        ensureValuesIsMutable();
        this.values_.add(index, value);
    }

    public static x99 parseFrom(wj1 data, yi5 extensionRegistry) throws be8 {
        return (x99) u27.m23017U(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static x99 parseFrom(byte[] data) throws be8 {
        return (x99) u27.m23024b0(DEFAULT_INSTANCE, data);
    }

    public static x99 parseFrom(byte[] data, yi5 extensionRegistry) throws be8 {
        return (x99) u27.m23025c0(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static x99 parseFrom(InputStream input) throws IOException {
        return (x99) u27.m23020X(DEFAULT_INSTANCE, input);
    }

    public static x99 parseFrom(InputStream input, yi5 extensionRegistry) throws IOException {
        return (x99) u27.m23021Y(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static x99 parseFrom(e72 input) throws IOException {
        return (x99) u27.m23018V(DEFAULT_INSTANCE, input);
    }

    public static x99 parseFrom(e72 input, yi5 extensionRegistry) throws IOException {
        return (x99) u27.m23019W(DEFAULT_INSTANCE, input, extensionRegistry);
    }
}
