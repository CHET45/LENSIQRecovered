package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import p000.b2i;
import p000.v27;
import p000.w98;

/* JADX INFO: loaded from: classes5.dex */
public final class o70 extends v27<o70, C10211b> implements p70 {
    private static final o70 DEFAULT_INSTANCE;
    private static volatile uhc<o70> PARSER = null;
    public static final int VALUES_FIELD_NUMBER = 1;
    private w98.InterfaceC14504k<b2i> values_ = v27.m23722x();

    /* JADX INFO: renamed from: o70$a */
    public static /* synthetic */ class C10210a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f66586a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f66586a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f66586a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f66586a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f66586a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f66586a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f66586a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f66586a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: o70$b */
    public static final class C10211b extends v27.AbstractC13823b<o70, C10211b> implements p70 {
        public /* synthetic */ C10211b(C10210a c10210a) {
            this();
        }

        public C10211b addAllValues(Iterable<? extends b2i> iterable) {
            m23743e();
            ((o70) this.f89756b).addAllValues(iterable);
            return this;
        }

        public C10211b addValues(b2i b2iVar) {
            m23743e();
            ((o70) this.f89756b).addValues(b2iVar);
            return this;
        }

        public C10211b clearValues() {
            m23743e();
            ((o70) this.f89756b).clearValues();
            return this;
        }

        @Override // p000.p70
        public b2i getValues(int i) {
            return ((o70) this.f89756b).getValues(i);
        }

        @Override // p000.p70
        public int getValuesCount() {
            return ((o70) this.f89756b).getValuesCount();
        }

        @Override // p000.p70
        public List<b2i> getValuesList() {
            return Collections.unmodifiableList(((o70) this.f89756b).getValuesList());
        }

        public C10211b removeValues(int i) {
            m23743e();
            ((o70) this.f89756b).removeValues(i);
            return this;
        }

        public C10211b setValues(int i, b2i b2iVar) {
            m23743e();
            ((o70) this.f89756b).setValues(i, b2iVar);
            return this;
        }

        private C10211b() {
            super(o70.DEFAULT_INSTANCE);
        }

        public C10211b addValues(int i, b2i b2iVar) {
            m23743e();
            ((o70) this.f89756b).addValues(i, b2iVar);
            return this;
        }

        public C10211b setValues(int i, b2i.C1712b c1712b) {
            m23743e();
            ((o70) this.f89756b).setValues(i, c1712b.build());
            return this;
        }

        public C10211b addValues(b2i.C1712b c1712b) {
            m23743e();
            ((o70) this.f89756b).addValues(c1712b.build());
            return this;
        }

        public C10211b addValues(int i, b2i.C1712b c1712b) {
            m23743e();
            ((o70) this.f89756b).addValues(i, c1712b.build());
            return this;
        }
    }

    static {
        o70 o70Var = new o70();
        DEFAULT_INSTANCE = o70Var;
        v27.m23715h0(o70.class, o70Var);
    }

    private o70() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllValues(Iterable<? extends b2i> iterable) {
        ensureValuesIsMutable();
        AbstractC1714b3.m2856b(iterable, this.values_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addValues(b2i b2iVar) {
        b2iVar.getClass();
        ensureValuesIsMutable();
        this.values_.add(b2iVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValues() {
        this.values_ = v27.m23722x();
    }

    private void ensureValuesIsMutable() {
        w98.InterfaceC14504k<b2i> interfaceC14504k = this.values_;
        if (interfaceC14504k.isModifiable()) {
            return;
        }
        this.values_ = v27.m23698P(interfaceC14504k);
    }

    public static o70 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C10211b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    public static o70 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (o70) v27.m23700S(DEFAULT_INSTANCE, inputStream);
    }

    public static o70 parseFrom(ByteBuffer byteBuffer) throws ce8 {
        return (o70) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static uhc<o70> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeValues(int i) {
        ensureValuesIsMutable();
        this.values_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValues(int i, b2i b2iVar) {
        b2iVar.getClass();
        ensureValuesIsMutable();
        this.values_.set(i, b2iVar);
    }

    @Override // p000.p70
    public b2i getValues(int i) {
        return this.values_.get(i);
    }

    @Override // p000.p70
    public int getValuesCount() {
        return this.values_.size();
    }

    @Override // p000.p70
    public List<b2i> getValuesList() {
        return this.values_;
    }

    public o2i getValuesOrBuilder(int i) {
        return this.values_.get(i);
    }

    public List<? extends o2i> getValuesOrBuilderList() {
        return this.values_;
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
        C10210a c10210a = null;
        switch (C10210a.f66586a[enumC13830i.ordinal()]) {
            case 1:
                return new o70();
            case 2:
                return new C10211b(c10210a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"values_", b2i.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<o70> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (o70.class) {
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

    public static C10211b newBuilder(o70 o70Var) {
        return DEFAULT_INSTANCE.m23739o(o70Var);
    }

    public static o70 parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (o70) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static o70 parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
        return (o70) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
    }

    public static o70 parseFrom(vj1 vj1Var) throws ce8 {
        return (o70) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addValues(int i, b2i b2iVar) {
        b2iVar.getClass();
        ensureValuesIsMutable();
        this.values_.add(i, b2iVar);
    }

    public static o70 parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
        return (o70) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
    }

    public static o70 parseFrom(byte[] bArr) throws ce8 {
        return (o70) v27.m23710c0(DEFAULT_INSTANCE, bArr);
    }

    public static o70 parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
        return (o70) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
    }

    public static o70 parseFrom(InputStream inputStream) throws IOException {
        return (o70) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
    }

    public static o70 parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (o70) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static o70 parseFrom(f72 f72Var) throws IOException {
        return (o70) v27.m23704W(DEFAULT_INSTANCE, f72Var);
    }

    public static o70 parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
        return (o70) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
    }
}
