package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import p000.c2i;
import p000.v27;
import p000.w98;

/* JADX INFO: loaded from: classes4.dex */
public final class y99 extends v27<y99, C15579b> implements z99 {
    private static final y99 DEFAULT_INSTANCE;
    private static volatile uhc<y99> PARSER = null;
    public static final int VALUES_FIELD_NUMBER = 1;
    private w98.InterfaceC14504k<c2i> values_ = v27.m23722x();

    /* JADX INFO: renamed from: y99$a */
    public static /* synthetic */ class C15578a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f100878a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f100878a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f100878a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f100878a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f100878a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f100878a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f100878a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f100878a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: y99$b */
    public static final class C15579b extends v27.AbstractC13823b<y99, C15579b> implements z99 {
        public /* synthetic */ C15579b(C15578a c15578a) {
            this();
        }

        public C15579b addAllValues(Iterable<? extends c2i> values) {
            m23743e();
            ((y99) this.f89756b).addAllValues(values);
            return this;
        }

        public C15579b addValues(c2i value) {
            m23743e();
            ((y99) this.f89756b).addValues(value);
            return this;
        }

        public C15579b clearValues() {
            m23743e();
            ((y99) this.f89756b).clearValues();
            return this;
        }

        @Override // p000.z99
        public c2i getValues(int index) {
            return ((y99) this.f89756b).getValues(index);
        }

        @Override // p000.z99
        public int getValuesCount() {
            return ((y99) this.f89756b).getValuesCount();
        }

        @Override // p000.z99
        public List<c2i> getValuesList() {
            return Collections.unmodifiableList(((y99) this.f89756b).getValuesList());
        }

        public C15579b removeValues(int index) {
            m23743e();
            ((y99) this.f89756b).removeValues(index);
            return this;
        }

        public C15579b setValues(int index, c2i value) {
            m23743e();
            ((y99) this.f89756b).setValues(index, value);
            return this;
        }

        private C15579b() {
            super(y99.DEFAULT_INSTANCE);
        }

        public C15579b addValues(int index, c2i value) {
            m23743e();
            ((y99) this.f89756b).addValues(index, value);
            return this;
        }

        public C15579b setValues(int index, c2i.C2171b builderForValue) {
            m23743e();
            ((y99) this.f89756b).setValues(index, builderForValue.build());
            return this;
        }

        public C15579b addValues(c2i.C2171b builderForValue) {
            m23743e();
            ((y99) this.f89756b).addValues(builderForValue.build());
            return this;
        }

        public C15579b addValues(int index, c2i.C2171b builderForValue) {
            m23743e();
            ((y99) this.f89756b).addValues(index, builderForValue.build());
            return this;
        }
    }

    static {
        y99 y99Var = new y99();
        DEFAULT_INSTANCE = y99Var;
        v27.m23715h0(y99.class, y99Var);
    }

    private y99() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllValues(Iterable<? extends c2i> values) {
        ensureValuesIsMutable();
        AbstractC1714b3.m2856b(values, this.values_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addValues(c2i value) {
        value.getClass();
        ensureValuesIsMutable();
        this.values_.add(value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValues() {
        this.values_ = v27.m23722x();
    }

    private void ensureValuesIsMutable() {
        w98.InterfaceC14504k<c2i> interfaceC14504k = this.values_;
        if (interfaceC14504k.isModifiable()) {
            return;
        }
        this.values_ = v27.m23698P(interfaceC14504k);
    }

    public static y99 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C15579b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    public static y99 parseDelimitedFrom(InputStream input) throws IOException {
        return (y99) v27.m23700S(DEFAULT_INSTANCE, input);
    }

    public static y99 parseFrom(ByteBuffer data) throws ce8 {
        return (y99) v27.m23708a0(DEFAULT_INSTANCE, data);
    }

    public static uhc<y99> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeValues(int index) {
        ensureValuesIsMutable();
        this.values_.remove(index);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValues(int index, c2i value) {
        value.getClass();
        ensureValuesIsMutable();
        this.values_.set(index, value);
    }

    @Override // p000.z99
    public c2i getValues(int index) {
        return this.values_.get(index);
    }

    @Override // p000.z99
    public int getValuesCount() {
        return this.values_.size();
    }

    @Override // p000.z99
    public List<c2i> getValuesList() {
        return this.values_;
    }

    public p2i getValuesOrBuilder(int index) {
        return this.values_.get(index);
    }

    public List<? extends p2i> getValuesOrBuilderList() {
        return this.values_;
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i method, Object arg0, Object arg1) {
        C15578a c15578a = null;
        switch (C15578a.f100878a[method.ordinal()]) {
            case 1:
                return new y99();
            case 2:
                return new C15579b(c15578a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"values_", c2i.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<y99> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (y99.class) {
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

    public static C15579b newBuilder(y99 prototype) {
        return DEFAULT_INSTANCE.m23739o(prototype);
    }

    public static y99 parseDelimitedFrom(InputStream input, zi5 extensionRegistry) throws IOException {
        return (y99) v27.m23701T(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static y99 parseFrom(ByteBuffer data, zi5 extensionRegistry) throws ce8 {
        return (y99) v27.m23709b0(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static y99 parseFrom(vj1 data) throws ce8 {
        return (y99) v27.m23702U(DEFAULT_INSTANCE, data);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addValues(int index, c2i value) {
        value.getClass();
        ensureValuesIsMutable();
        this.values_.add(index, value);
    }

    public static y99 parseFrom(vj1 data, zi5 extensionRegistry) throws ce8 {
        return (y99) v27.m23703V(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static y99 parseFrom(byte[] data) throws ce8 {
        return (y99) v27.m23710c0(DEFAULT_INSTANCE, data);
    }

    public static y99 parseFrom(byte[] data, zi5 extensionRegistry) throws ce8 {
        return (y99) v27.m23711d0(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static y99 parseFrom(InputStream input) throws IOException {
        return (y99) v27.m23706Y(DEFAULT_INSTANCE, input);
    }

    public static y99 parseFrom(InputStream input, zi5 extensionRegistry) throws IOException {
        return (y99) v27.m23707Z(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static y99 parseFrom(f72 input) throws IOException {
        return (y99) v27.m23704W(DEFAULT_INSTANCE, input);
    }

    public static y99 parseFrom(f72 input, zi5 extensionRegistry) throws IOException {
        return (y99) v27.m23705X(DEFAULT_INSTANCE, input, extensionRegistry);
    }
}
