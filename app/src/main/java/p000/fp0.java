package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import p000.v27;
import p000.w98;

/* JADX INFO: loaded from: classes4.dex */
public final class fp0 extends v27<fp0, C5913b> implements gp0 {
    private static final fp0 DEFAULT_INSTANCE;
    public static final int FIELD_VIOLATIONS_FIELD_NUMBER = 1;
    private static volatile uhc<fp0> PARSER;
    private w98.InterfaceC14504k<C5914c> fieldViolations_ = v27.m23722x();

    /* JADX INFO: renamed from: fp0$a */
    public static /* synthetic */ class C5912a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f37326a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f37326a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f37326a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f37326a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f37326a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f37326a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f37326a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f37326a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: fp0$b */
    public static final class C5913b extends v27.AbstractC13823b<fp0, C5913b> implements gp0 {
        public /* synthetic */ C5913b(C5912a c5912a) {
            this();
        }

        public C5913b addAllFieldViolations(Iterable<? extends C5914c> iterable) {
            m23743e();
            ((fp0) this.f89756b).addAllFieldViolations(iterable);
            return this;
        }

        public C5913b addFieldViolations(C5914c c5914c) {
            m23743e();
            ((fp0) this.f89756b).addFieldViolations(c5914c);
            return this;
        }

        public C5913b clearFieldViolations() {
            m23743e();
            ((fp0) this.f89756b).clearFieldViolations();
            return this;
        }

        @Override // p000.gp0
        public C5914c getFieldViolations(int i) {
            return ((fp0) this.f89756b).getFieldViolations(i);
        }

        @Override // p000.gp0
        public int getFieldViolationsCount() {
            return ((fp0) this.f89756b).getFieldViolationsCount();
        }

        @Override // p000.gp0
        public List<C5914c> getFieldViolationsList() {
            return Collections.unmodifiableList(((fp0) this.f89756b).getFieldViolationsList());
        }

        public C5913b removeFieldViolations(int i) {
            m23743e();
            ((fp0) this.f89756b).removeFieldViolations(i);
            return this;
        }

        public C5913b setFieldViolations(int i, C5914c c5914c) {
            m23743e();
            ((fp0) this.f89756b).setFieldViolations(i, c5914c);
            return this;
        }

        private C5913b() {
            super(fp0.DEFAULT_INSTANCE);
        }

        public C5913b addFieldViolations(int i, C5914c c5914c) {
            m23743e();
            ((fp0) this.f89756b).addFieldViolations(i, c5914c);
            return this;
        }

        public C5913b setFieldViolations(int i, C5914c.a aVar) {
            m23743e();
            ((fp0) this.f89756b).setFieldViolations(i, aVar.build());
            return this;
        }

        public C5913b addFieldViolations(C5914c.a aVar) {
            m23743e();
            ((fp0) this.f89756b).addFieldViolations(aVar.build());
            return this;
        }

        public C5913b addFieldViolations(int i, C5914c.a aVar) {
            m23743e();
            ((fp0) this.f89756b).addFieldViolations(i, aVar.build());
            return this;
        }
    }

    /* JADX INFO: renamed from: fp0$c */
    public static final class C5914c extends v27<C5914c, a> implements InterfaceC5915d {
        private static final C5914c DEFAULT_INSTANCE;
        public static final int DESCRIPTION_FIELD_NUMBER = 2;
        public static final int FIELD_FIELD_NUMBER = 1;
        private static volatile uhc<C5914c> PARSER;
        private String field_ = "";
        private String description_ = "";

        /* JADX INFO: renamed from: fp0$c$a */
        public static final class a extends v27.AbstractC13823b<C5914c, a> implements InterfaceC5915d {
            public /* synthetic */ a(C5912a c5912a) {
                this();
            }

            public a clearDescription() {
                m23743e();
                ((C5914c) this.f89756b).clearDescription();
                return this;
            }

            public a clearField() {
                m23743e();
                ((C5914c) this.f89756b).clearField();
                return this;
            }

            @Override // p000.fp0.InterfaceC5915d
            public String getDescription() {
                return ((C5914c) this.f89756b).getDescription();
            }

            @Override // p000.fp0.InterfaceC5915d
            public vj1 getDescriptionBytes() {
                return ((C5914c) this.f89756b).getDescriptionBytes();
            }

            @Override // p000.fp0.InterfaceC5915d
            public String getField() {
                return ((C5914c) this.f89756b).getField();
            }

            @Override // p000.fp0.InterfaceC5915d
            public vj1 getFieldBytes() {
                return ((C5914c) this.f89756b).getFieldBytes();
            }

            public a setDescription(String str) {
                m23743e();
                ((C5914c) this.f89756b).setDescription(str);
                return this;
            }

            public a setDescriptionBytes(vj1 vj1Var) {
                m23743e();
                ((C5914c) this.f89756b).setDescriptionBytes(vj1Var);
                return this;
            }

            public a setField(String str) {
                m23743e();
                ((C5914c) this.f89756b).setField(str);
                return this;
            }

            public a setFieldBytes(vj1 vj1Var) {
                m23743e();
                ((C5914c) this.f89756b).setFieldBytes(vj1Var);
                return this;
            }

            private a() {
                super(C5914c.DEFAULT_INSTANCE);
            }
        }

        static {
            C5914c c5914c = new C5914c();
            DEFAULT_INSTANCE = c5914c;
            v27.m23715h0(C5914c.class, c5914c);
        }

        private C5914c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDescription() {
            this.description_ = getDefaultInstance().getDescription();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearField() {
            this.field_ = getDefaultInstance().getField();
        }

        public static C5914c getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.m23738n();
        }

        public static C5914c parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (C5914c) v27.m23700S(DEFAULT_INSTANCE, inputStream);
        }

        public static C5914c parseFrom(ByteBuffer byteBuffer) throws ce8 {
            return (C5914c) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
        }

        public static uhc<C5914c> parser() {
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

        /* JADX INFO: Access modifiers changed from: private */
        public void setField(String str) {
            str.getClass();
            this.field_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFieldBytes(vj1 vj1Var) {
            AbstractC1714b3.m2857c(vj1Var);
            this.field_ = vj1Var.toStringUtf8();
        }

        @Override // p000.fp0.InterfaceC5915d
        public String getDescription() {
            return this.description_;
        }

        @Override // p000.fp0.InterfaceC5915d
        public vj1 getDescriptionBytes() {
            return vj1.copyFromUtf8(this.description_);
        }

        @Override // p000.fp0.InterfaceC5915d
        public String getField() {
            return this.field_;
        }

        @Override // p000.fp0.InterfaceC5915d
        public vj1 getFieldBytes() {
            return vj1.copyFromUtf8(this.field_);
        }

        @Override // p000.v27
        /* JADX INFO: renamed from: r */
        public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
            C5912a c5912a = null;
            switch (C5912a.f37326a[enumC13830i.ordinal()]) {
                case 1:
                    return new C5914c();
                case 2:
                    return new a(c5912a);
                case 3:
                    return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"field_", "description_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    uhc<C5914c> c13824c = PARSER;
                    if (c13824c == null) {
                        synchronized (C5914c.class) {
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

        public static a newBuilder(C5914c c5914c) {
            return DEFAULT_INSTANCE.m23739o(c5914c);
        }

        public static C5914c parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
            return (C5914c) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
        }

        public static C5914c parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
            return (C5914c) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
        }

        public static C5914c parseFrom(vj1 vj1Var) throws ce8 {
            return (C5914c) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
        }

        public static C5914c parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
            return (C5914c) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
        }

        public static C5914c parseFrom(byte[] bArr) throws ce8 {
            return (C5914c) v27.m23710c0(DEFAULT_INSTANCE, bArr);
        }

        public static C5914c parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
            return (C5914c) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
        }

        public static C5914c parseFrom(InputStream inputStream) throws IOException {
            return (C5914c) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
        }

        public static C5914c parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
            return (C5914c) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
        }

        public static C5914c parseFrom(f72 f72Var) throws IOException {
            return (C5914c) v27.m23704W(DEFAULT_INSTANCE, f72Var);
        }

        public static C5914c parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
            return (C5914c) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
        }
    }

    /* JADX INFO: renamed from: fp0$d */
    public interface InterfaceC5915d extends rsa {
        String getDescription();

        vj1 getDescriptionBytes();

        String getField();

        vj1 getFieldBytes();
    }

    static {
        fp0 fp0Var = new fp0();
        DEFAULT_INSTANCE = fp0Var;
        v27.m23715h0(fp0.class, fp0Var);
    }

    private fp0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllFieldViolations(Iterable<? extends C5914c> iterable) {
        ensureFieldViolationsIsMutable();
        AbstractC1714b3.m2856b(iterable, this.fieldViolations_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addFieldViolations(C5914c c5914c) {
        c5914c.getClass();
        ensureFieldViolationsIsMutable();
        this.fieldViolations_.add(c5914c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFieldViolations() {
        this.fieldViolations_ = v27.m23722x();
    }

    private void ensureFieldViolationsIsMutable() {
        w98.InterfaceC14504k<C5914c> interfaceC14504k = this.fieldViolations_;
        if (interfaceC14504k.isModifiable()) {
            return;
        }
        this.fieldViolations_ = v27.m23698P(interfaceC14504k);
    }

    public static fp0 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C5913b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    public static fp0 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (fp0) v27.m23700S(DEFAULT_INSTANCE, inputStream);
    }

    public static fp0 parseFrom(ByteBuffer byteBuffer) throws ce8 {
        return (fp0) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static uhc<fp0> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeFieldViolations(int i) {
        ensureFieldViolationsIsMutable();
        this.fieldViolations_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFieldViolations(int i, C5914c c5914c) {
        c5914c.getClass();
        ensureFieldViolationsIsMutable();
        this.fieldViolations_.set(i, c5914c);
    }

    @Override // p000.gp0
    public C5914c getFieldViolations(int i) {
        return this.fieldViolations_.get(i);
    }

    @Override // p000.gp0
    public int getFieldViolationsCount() {
        return this.fieldViolations_.size();
    }

    @Override // p000.gp0
    public List<C5914c> getFieldViolationsList() {
        return this.fieldViolations_;
    }

    public InterfaceC5915d getFieldViolationsOrBuilder(int i) {
        return this.fieldViolations_.get(i);
    }

    public List<? extends InterfaceC5915d> getFieldViolationsOrBuilderList() {
        return this.fieldViolations_;
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
        C5912a c5912a = null;
        switch (C5912a.f37326a[enumC13830i.ordinal()]) {
            case 1:
                return new fp0();
            case 2:
                return new C5913b(c5912a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"fieldViolations_", C5914c.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<fp0> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (fp0.class) {
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

    public static C5913b newBuilder(fp0 fp0Var) {
        return DEFAULT_INSTANCE.m23739o(fp0Var);
    }

    public static fp0 parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (fp0) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static fp0 parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
        return (fp0) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
    }

    public static fp0 parseFrom(vj1 vj1Var) throws ce8 {
        return (fp0) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addFieldViolations(int i, C5914c c5914c) {
        c5914c.getClass();
        ensureFieldViolationsIsMutable();
        this.fieldViolations_.add(i, c5914c);
    }

    public static fp0 parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
        return (fp0) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
    }

    public static fp0 parseFrom(byte[] bArr) throws ce8 {
        return (fp0) v27.m23710c0(DEFAULT_INSTANCE, bArr);
    }

    public static fp0 parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
        return (fp0) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
    }

    public static fp0 parseFrom(InputStream inputStream) throws IOException {
        return (fp0) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
    }

    public static fp0 parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (fp0) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static fp0 parseFrom(f72 f72Var) throws IOException {
        return (fp0) v27.m23704W(DEFAULT_INSTANCE, f72Var);
    }

    public static fp0 parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
        return (fp0) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
    }
}
