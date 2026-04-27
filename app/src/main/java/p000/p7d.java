package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import p000.v27;
import p000.w98;

/* JADX INFO: loaded from: classes4.dex */
public final class p7d extends v27<p7d, C10823b> implements q7d {
    private static final p7d DEFAULT_INSTANCE;
    private static volatile uhc<p7d> PARSER = null;
    public static final int VIOLATIONS_FIELD_NUMBER = 1;
    private w98.InterfaceC14504k<C10824c> violations_ = v27.m23722x();

    /* JADX INFO: renamed from: p7d$a */
    public static /* synthetic */ class C10822a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f69932a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f69932a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f69932a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f69932a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f69932a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f69932a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f69932a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f69932a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: p7d$b */
    public static final class C10823b extends v27.AbstractC13823b<p7d, C10823b> implements q7d {
        public /* synthetic */ C10823b(C10822a c10822a) {
            this();
        }

        public C10823b addAllViolations(Iterable<? extends C10824c> iterable) {
            m23743e();
            ((p7d) this.f89756b).addAllViolations(iterable);
            return this;
        }

        public C10823b addViolations(C10824c c10824c) {
            m23743e();
            ((p7d) this.f89756b).addViolations(c10824c);
            return this;
        }

        public C10823b clearViolations() {
            m23743e();
            ((p7d) this.f89756b).clearViolations();
            return this;
        }

        @Override // p000.q7d
        public C10824c getViolations(int i) {
            return ((p7d) this.f89756b).getViolations(i);
        }

        @Override // p000.q7d
        public int getViolationsCount() {
            return ((p7d) this.f89756b).getViolationsCount();
        }

        @Override // p000.q7d
        public List<C10824c> getViolationsList() {
            return Collections.unmodifiableList(((p7d) this.f89756b).getViolationsList());
        }

        public C10823b removeViolations(int i) {
            m23743e();
            ((p7d) this.f89756b).removeViolations(i);
            return this;
        }

        public C10823b setViolations(int i, C10824c c10824c) {
            m23743e();
            ((p7d) this.f89756b).setViolations(i, c10824c);
            return this;
        }

        private C10823b() {
            super(p7d.DEFAULT_INSTANCE);
        }

        public C10823b addViolations(int i, C10824c c10824c) {
            m23743e();
            ((p7d) this.f89756b).addViolations(i, c10824c);
            return this;
        }

        public C10823b setViolations(int i, C10824c.a aVar) {
            m23743e();
            ((p7d) this.f89756b).setViolations(i, aVar.build());
            return this;
        }

        public C10823b addViolations(C10824c.a aVar) {
            m23743e();
            ((p7d) this.f89756b).addViolations(aVar.build());
            return this;
        }

        public C10823b addViolations(int i, C10824c.a aVar) {
            m23743e();
            ((p7d) this.f89756b).addViolations(i, aVar.build());
            return this;
        }
    }

    /* JADX INFO: renamed from: p7d$c */
    public static final class C10824c extends v27<C10824c, a> implements InterfaceC10825d {
        private static final C10824c DEFAULT_INSTANCE;
        public static final int DESCRIPTION_FIELD_NUMBER = 3;
        private static volatile uhc<C10824c> PARSER = null;
        public static final int SUBJECT_FIELD_NUMBER = 2;
        public static final int TYPE_FIELD_NUMBER = 1;
        private String type_ = "";
        private String subject_ = "";
        private String description_ = "";

        /* JADX INFO: renamed from: p7d$c$a */
        public static final class a extends v27.AbstractC13823b<C10824c, a> implements InterfaceC10825d {
            public /* synthetic */ a(C10822a c10822a) {
                this();
            }

            public a clearDescription() {
                m23743e();
                ((C10824c) this.f89756b).clearDescription();
                return this;
            }

            public a clearSubject() {
                m23743e();
                ((C10824c) this.f89756b).clearSubject();
                return this;
            }

            public a clearType() {
                m23743e();
                ((C10824c) this.f89756b).clearType();
                return this;
            }

            @Override // p000.p7d.InterfaceC10825d
            public String getDescription() {
                return ((C10824c) this.f89756b).getDescription();
            }

            @Override // p000.p7d.InterfaceC10825d
            public vj1 getDescriptionBytes() {
                return ((C10824c) this.f89756b).getDescriptionBytes();
            }

            @Override // p000.p7d.InterfaceC10825d
            public String getSubject() {
                return ((C10824c) this.f89756b).getSubject();
            }

            @Override // p000.p7d.InterfaceC10825d
            public vj1 getSubjectBytes() {
                return ((C10824c) this.f89756b).getSubjectBytes();
            }

            @Override // p000.p7d.InterfaceC10825d
            public String getType() {
                return ((C10824c) this.f89756b).getType();
            }

            @Override // p000.p7d.InterfaceC10825d
            public vj1 getTypeBytes() {
                return ((C10824c) this.f89756b).getTypeBytes();
            }

            public a setDescription(String str) {
                m23743e();
                ((C10824c) this.f89756b).setDescription(str);
                return this;
            }

            public a setDescriptionBytes(vj1 vj1Var) {
                m23743e();
                ((C10824c) this.f89756b).setDescriptionBytes(vj1Var);
                return this;
            }

            public a setSubject(String str) {
                m23743e();
                ((C10824c) this.f89756b).setSubject(str);
                return this;
            }

            public a setSubjectBytes(vj1 vj1Var) {
                m23743e();
                ((C10824c) this.f89756b).setSubjectBytes(vj1Var);
                return this;
            }

            public a setType(String str) {
                m23743e();
                ((C10824c) this.f89756b).setType(str);
                return this;
            }

            public a setTypeBytes(vj1 vj1Var) {
                m23743e();
                ((C10824c) this.f89756b).setTypeBytes(vj1Var);
                return this;
            }

            private a() {
                super(C10824c.DEFAULT_INSTANCE);
            }
        }

        static {
            C10824c c10824c = new C10824c();
            DEFAULT_INSTANCE = c10824c;
            v27.m23715h0(C10824c.class, c10824c);
        }

        private C10824c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDescription() {
            this.description_ = getDefaultInstance().getDescription();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSubject() {
            this.subject_ = getDefaultInstance().getSubject();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearType() {
            this.type_ = getDefaultInstance().getType();
        }

        public static C10824c getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.m23738n();
        }

        public static C10824c parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (C10824c) v27.m23700S(DEFAULT_INSTANCE, inputStream);
        }

        public static C10824c parseFrom(ByteBuffer byteBuffer) throws ce8 {
            return (C10824c) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
        }

        public static uhc<C10824c> parser() {
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

        /* JADX INFO: Access modifiers changed from: private */
        public void setType(String str) {
            str.getClass();
            this.type_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTypeBytes(vj1 vj1Var) {
            AbstractC1714b3.m2857c(vj1Var);
            this.type_ = vj1Var.toStringUtf8();
        }

        @Override // p000.p7d.InterfaceC10825d
        public String getDescription() {
            return this.description_;
        }

        @Override // p000.p7d.InterfaceC10825d
        public vj1 getDescriptionBytes() {
            return vj1.copyFromUtf8(this.description_);
        }

        @Override // p000.p7d.InterfaceC10825d
        public String getSubject() {
            return this.subject_;
        }

        @Override // p000.p7d.InterfaceC10825d
        public vj1 getSubjectBytes() {
            return vj1.copyFromUtf8(this.subject_);
        }

        @Override // p000.p7d.InterfaceC10825d
        public String getType() {
            return this.type_;
        }

        @Override // p000.p7d.InterfaceC10825d
        public vj1 getTypeBytes() {
            return vj1.copyFromUtf8(this.type_);
        }

        @Override // p000.v27
        /* JADX INFO: renamed from: r */
        public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
            C10822a c10822a = null;
            switch (C10822a.f69932a[enumC13830i.ordinal()]) {
                case 1:
                    return new C10824c();
                case 2:
                    return new a(c10822a);
                case 3:
                    return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"type_", "subject_", "description_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    uhc<C10824c> c13824c = PARSER;
                    if (c13824c == null) {
                        synchronized (C10824c.class) {
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

        public static a newBuilder(C10824c c10824c) {
            return DEFAULT_INSTANCE.m23739o(c10824c);
        }

        public static C10824c parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
            return (C10824c) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
        }

        public static C10824c parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
            return (C10824c) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
        }

        public static C10824c parseFrom(vj1 vj1Var) throws ce8 {
            return (C10824c) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
        }

        public static C10824c parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
            return (C10824c) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
        }

        public static C10824c parseFrom(byte[] bArr) throws ce8 {
            return (C10824c) v27.m23710c0(DEFAULT_INSTANCE, bArr);
        }

        public static C10824c parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
            return (C10824c) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
        }

        public static C10824c parseFrom(InputStream inputStream) throws IOException {
            return (C10824c) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
        }

        public static C10824c parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
            return (C10824c) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
        }

        public static C10824c parseFrom(f72 f72Var) throws IOException {
            return (C10824c) v27.m23704W(DEFAULT_INSTANCE, f72Var);
        }

        public static C10824c parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
            return (C10824c) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
        }
    }

    /* JADX INFO: renamed from: p7d$d */
    public interface InterfaceC10825d extends rsa {
        String getDescription();

        vj1 getDescriptionBytes();

        String getSubject();

        vj1 getSubjectBytes();

        String getType();

        vj1 getTypeBytes();
    }

    static {
        p7d p7dVar = new p7d();
        DEFAULT_INSTANCE = p7dVar;
        v27.m23715h0(p7d.class, p7dVar);
    }

    private p7d() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllViolations(Iterable<? extends C10824c> iterable) {
        ensureViolationsIsMutable();
        AbstractC1714b3.m2856b(iterable, this.violations_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addViolations(C10824c c10824c) {
        c10824c.getClass();
        ensureViolationsIsMutable();
        this.violations_.add(c10824c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearViolations() {
        this.violations_ = v27.m23722x();
    }

    private void ensureViolationsIsMutable() {
        w98.InterfaceC14504k<C10824c> interfaceC14504k = this.violations_;
        if (interfaceC14504k.isModifiable()) {
            return;
        }
        this.violations_ = v27.m23698P(interfaceC14504k);
    }

    public static p7d getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C10823b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    public static p7d parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (p7d) v27.m23700S(DEFAULT_INSTANCE, inputStream);
    }

    public static p7d parseFrom(ByteBuffer byteBuffer) throws ce8 {
        return (p7d) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static uhc<p7d> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeViolations(int i) {
        ensureViolationsIsMutable();
        this.violations_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setViolations(int i, C10824c c10824c) {
        c10824c.getClass();
        ensureViolationsIsMutable();
        this.violations_.set(i, c10824c);
    }

    @Override // p000.q7d
    public C10824c getViolations(int i) {
        return this.violations_.get(i);
    }

    @Override // p000.q7d
    public int getViolationsCount() {
        return this.violations_.size();
    }

    @Override // p000.q7d
    public List<C10824c> getViolationsList() {
        return this.violations_;
    }

    public InterfaceC10825d getViolationsOrBuilder(int i) {
        return this.violations_.get(i);
    }

    public List<? extends InterfaceC10825d> getViolationsOrBuilderList() {
        return this.violations_;
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
        C10822a c10822a = null;
        switch (C10822a.f69932a[enumC13830i.ordinal()]) {
            case 1:
                return new p7d();
            case 2:
                return new C10823b(c10822a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"violations_", C10824c.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<p7d> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (p7d.class) {
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

    public static C10823b newBuilder(p7d p7dVar) {
        return DEFAULT_INSTANCE.m23739o(p7dVar);
    }

    public static p7d parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (p7d) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static p7d parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
        return (p7d) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
    }

    public static p7d parseFrom(vj1 vj1Var) throws ce8 {
        return (p7d) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addViolations(int i, C10824c c10824c) {
        c10824c.getClass();
        ensureViolationsIsMutable();
        this.violations_.add(i, c10824c);
    }

    public static p7d parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
        return (p7d) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
    }

    public static p7d parseFrom(byte[] bArr) throws ce8 {
        return (p7d) v27.m23710c0(DEFAULT_INSTANCE, bArr);
    }

    public static p7d parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
        return (p7d) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
    }

    public static p7d parseFrom(InputStream inputStream) throws IOException {
        return (p7d) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
    }

    public static p7d parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (p7d) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static p7d parseFrom(f72 f72Var) throws IOException {
        return (p7d) v27.m23704W(DEFAULT_INSTANCE, f72Var);
    }

    public static p7d parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
        return (p7d) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
    }
}
