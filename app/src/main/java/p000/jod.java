package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import p000.v27;
import p000.w98;

/* JADX INFO: loaded from: classes4.dex */
public final class jod extends v27<jod, C7997b> implements kod {
    private static final jod DEFAULT_INSTANCE;
    private static volatile uhc<jod> PARSER = null;
    public static final int VIOLATIONS_FIELD_NUMBER = 1;
    private w98.InterfaceC14504k<C7998c> violations_ = v27.m23722x();

    /* JADX INFO: renamed from: jod$a */
    public static /* synthetic */ class C7996a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f51364a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f51364a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f51364a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f51364a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f51364a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f51364a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f51364a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f51364a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: jod$b */
    public static final class C7997b extends v27.AbstractC13823b<jod, C7997b> implements kod {
        public /* synthetic */ C7997b(C7996a c7996a) {
            this();
        }

        public C7997b addAllViolations(Iterable<? extends C7998c> iterable) {
            m23743e();
            ((jod) this.f89756b).addAllViolations(iterable);
            return this;
        }

        public C7997b addViolations(C7998c c7998c) {
            m23743e();
            ((jod) this.f89756b).addViolations(c7998c);
            return this;
        }

        public C7997b clearViolations() {
            m23743e();
            ((jod) this.f89756b).clearViolations();
            return this;
        }

        @Override // p000.kod
        public C7998c getViolations(int i) {
            return ((jod) this.f89756b).getViolations(i);
        }

        @Override // p000.kod
        public int getViolationsCount() {
            return ((jod) this.f89756b).getViolationsCount();
        }

        @Override // p000.kod
        public List<C7998c> getViolationsList() {
            return Collections.unmodifiableList(((jod) this.f89756b).getViolationsList());
        }

        public C7997b removeViolations(int i) {
            m23743e();
            ((jod) this.f89756b).removeViolations(i);
            return this;
        }

        public C7997b setViolations(int i, C7998c c7998c) {
            m23743e();
            ((jod) this.f89756b).setViolations(i, c7998c);
            return this;
        }

        private C7997b() {
            super(jod.DEFAULT_INSTANCE);
        }

        public C7997b addViolations(int i, C7998c c7998c) {
            m23743e();
            ((jod) this.f89756b).addViolations(i, c7998c);
            return this;
        }

        public C7997b setViolations(int i, C7998c.a aVar) {
            m23743e();
            ((jod) this.f89756b).setViolations(i, aVar.build());
            return this;
        }

        public C7997b addViolations(C7998c.a aVar) {
            m23743e();
            ((jod) this.f89756b).addViolations(aVar.build());
            return this;
        }

        public C7997b addViolations(int i, C7998c.a aVar) {
            m23743e();
            ((jod) this.f89756b).addViolations(i, aVar.build());
            return this;
        }
    }

    /* JADX INFO: renamed from: jod$c */
    public static final class C7998c extends v27<C7998c, a> implements InterfaceC7999d {
        private static final C7998c DEFAULT_INSTANCE;
        public static final int DESCRIPTION_FIELD_NUMBER = 2;
        private static volatile uhc<C7998c> PARSER = null;
        public static final int SUBJECT_FIELD_NUMBER = 1;
        private String subject_ = "";
        private String description_ = "";

        /* JADX INFO: renamed from: jod$c$a */
        public static final class a extends v27.AbstractC13823b<C7998c, a> implements InterfaceC7999d {
            public /* synthetic */ a(C7996a c7996a) {
                this();
            }

            public a clearDescription() {
                m23743e();
                ((C7998c) this.f89756b).clearDescription();
                return this;
            }

            public a clearSubject() {
                m23743e();
                ((C7998c) this.f89756b).clearSubject();
                return this;
            }

            @Override // p000.jod.InterfaceC7999d
            public String getDescription() {
                return ((C7998c) this.f89756b).getDescription();
            }

            @Override // p000.jod.InterfaceC7999d
            public vj1 getDescriptionBytes() {
                return ((C7998c) this.f89756b).getDescriptionBytes();
            }

            @Override // p000.jod.InterfaceC7999d
            public String getSubject() {
                return ((C7998c) this.f89756b).getSubject();
            }

            @Override // p000.jod.InterfaceC7999d
            public vj1 getSubjectBytes() {
                return ((C7998c) this.f89756b).getSubjectBytes();
            }

            public a setDescription(String str) {
                m23743e();
                ((C7998c) this.f89756b).setDescription(str);
                return this;
            }

            public a setDescriptionBytes(vj1 vj1Var) {
                m23743e();
                ((C7998c) this.f89756b).setDescriptionBytes(vj1Var);
                return this;
            }

            public a setSubject(String str) {
                m23743e();
                ((C7998c) this.f89756b).setSubject(str);
                return this;
            }

            public a setSubjectBytes(vj1 vj1Var) {
                m23743e();
                ((C7998c) this.f89756b).setSubjectBytes(vj1Var);
                return this;
            }

            private a() {
                super(C7998c.DEFAULT_INSTANCE);
            }
        }

        static {
            C7998c c7998c = new C7998c();
            DEFAULT_INSTANCE = c7998c;
            v27.m23715h0(C7998c.class, c7998c);
        }

        private C7998c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDescription() {
            this.description_ = getDefaultInstance().getDescription();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSubject() {
            this.subject_ = getDefaultInstance().getSubject();
        }

        public static C7998c getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.m23738n();
        }

        public static C7998c parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (C7998c) v27.m23700S(DEFAULT_INSTANCE, inputStream);
        }

        public static C7998c parseFrom(ByteBuffer byteBuffer) throws ce8 {
            return (C7998c) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
        }

        public static uhc<C7998c> parser() {
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
        public void setSubject(String str) {
            str.getClass();
            this.subject_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSubjectBytes(vj1 vj1Var) {
            AbstractC1714b3.m2857c(vj1Var);
            this.subject_ = vj1Var.toStringUtf8();
        }

        @Override // p000.jod.InterfaceC7999d
        public String getDescription() {
            return this.description_;
        }

        @Override // p000.jod.InterfaceC7999d
        public vj1 getDescriptionBytes() {
            return vj1.copyFromUtf8(this.description_);
        }

        @Override // p000.jod.InterfaceC7999d
        public String getSubject() {
            return this.subject_;
        }

        @Override // p000.jod.InterfaceC7999d
        public vj1 getSubjectBytes() {
            return vj1.copyFromUtf8(this.subject_);
        }

        @Override // p000.v27
        /* JADX INFO: renamed from: r */
        public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
            C7996a c7996a = null;
            switch (C7996a.f51364a[enumC13830i.ordinal()]) {
                case 1:
                    return new C7998c();
                case 2:
                    return new a(c7996a);
                case 3:
                    return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"subject_", "description_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    uhc<C7998c> c13824c = PARSER;
                    if (c13824c == null) {
                        synchronized (C7998c.class) {
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

        public static a newBuilder(C7998c c7998c) {
            return DEFAULT_INSTANCE.m23739o(c7998c);
        }

        public static C7998c parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
            return (C7998c) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
        }

        public static C7998c parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
            return (C7998c) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
        }

        public static C7998c parseFrom(vj1 vj1Var) throws ce8 {
            return (C7998c) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
        }

        public static C7998c parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
            return (C7998c) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
        }

        public static C7998c parseFrom(byte[] bArr) throws ce8 {
            return (C7998c) v27.m23710c0(DEFAULT_INSTANCE, bArr);
        }

        public static C7998c parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
            return (C7998c) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
        }

        public static C7998c parseFrom(InputStream inputStream) throws IOException {
            return (C7998c) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
        }

        public static C7998c parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
            return (C7998c) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
        }

        public static C7998c parseFrom(f72 f72Var) throws IOException {
            return (C7998c) v27.m23704W(DEFAULT_INSTANCE, f72Var);
        }

        public static C7998c parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
            return (C7998c) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
        }
    }

    /* JADX INFO: renamed from: jod$d */
    public interface InterfaceC7999d extends rsa {
        String getDescription();

        vj1 getDescriptionBytes();

        String getSubject();

        vj1 getSubjectBytes();
    }

    static {
        jod jodVar = new jod();
        DEFAULT_INSTANCE = jodVar;
        v27.m23715h0(jod.class, jodVar);
    }

    private jod() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllViolations(Iterable<? extends C7998c> iterable) {
        ensureViolationsIsMutable();
        AbstractC1714b3.m2856b(iterable, this.violations_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addViolations(C7998c c7998c) {
        c7998c.getClass();
        ensureViolationsIsMutable();
        this.violations_.add(c7998c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearViolations() {
        this.violations_ = v27.m23722x();
    }

    private void ensureViolationsIsMutable() {
        w98.InterfaceC14504k<C7998c> interfaceC14504k = this.violations_;
        if (interfaceC14504k.isModifiable()) {
            return;
        }
        this.violations_ = v27.m23698P(interfaceC14504k);
    }

    public static jod getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C7997b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    public static jod parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (jod) v27.m23700S(DEFAULT_INSTANCE, inputStream);
    }

    public static jod parseFrom(ByteBuffer byteBuffer) throws ce8 {
        return (jod) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static uhc<jod> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeViolations(int i) {
        ensureViolationsIsMutable();
        this.violations_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setViolations(int i, C7998c c7998c) {
        c7998c.getClass();
        ensureViolationsIsMutable();
        this.violations_.set(i, c7998c);
    }

    @Override // p000.kod
    public C7998c getViolations(int i) {
        return this.violations_.get(i);
    }

    @Override // p000.kod
    public int getViolationsCount() {
        return this.violations_.size();
    }

    @Override // p000.kod
    public List<C7998c> getViolationsList() {
        return this.violations_;
    }

    public InterfaceC7999d getViolationsOrBuilder(int i) {
        return this.violations_.get(i);
    }

    public List<? extends InterfaceC7999d> getViolationsOrBuilderList() {
        return this.violations_;
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
        C7996a c7996a = null;
        switch (C7996a.f51364a[enumC13830i.ordinal()]) {
            case 1:
                return new jod();
            case 2:
                return new C7997b(c7996a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"violations_", C7998c.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<jod> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (jod.class) {
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

    public static C7997b newBuilder(jod jodVar) {
        return DEFAULT_INSTANCE.m23739o(jodVar);
    }

    public static jod parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (jod) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static jod parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
        return (jod) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
    }

    public static jod parseFrom(vj1 vj1Var) throws ce8 {
        return (jod) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addViolations(int i, C7998c c7998c) {
        c7998c.getClass();
        ensureViolationsIsMutable();
        this.violations_.add(i, c7998c);
    }

    public static jod parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
        return (jod) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
    }

    public static jod parseFrom(byte[] bArr) throws ce8 {
        return (jod) v27.m23710c0(DEFAULT_INSTANCE, bArr);
    }

    public static jod parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
        return (jod) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
    }

    public static jod parseFrom(InputStream inputStream) throws IOException {
        return (jod) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
    }

    public static jod parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (jod) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static jod parseFrom(f72 f72Var) throws IOException {
        return (jod) v27.m23704W(DEFAULT_INSTANCE, f72Var);
    }

    public static jod parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
        return (jod) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
    }
}
