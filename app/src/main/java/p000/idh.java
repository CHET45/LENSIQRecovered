package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p000.f2h;
import p000.v27;

/* JADX INFO: loaded from: classes5.dex */
public final class idh extends v27<idh, C7241b> implements jdh {
    private static final idh DEFAULT_INSTANCE;
    private static volatile uhc<idh> PARSER = null;
    public static final int READ_ONLY_FIELD_NUMBER = 2;
    public static final int READ_WRITE_FIELD_NUMBER = 3;
    private int modeCase_ = 0;
    private Object mode_;

    /* JADX INFO: renamed from: idh$a */
    public static /* synthetic */ class C7240a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f46574a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f46574a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f46574a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f46574a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f46574a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f46574a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f46574a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f46574a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: idh$b */
    public static final class C7241b extends v27.AbstractC13823b<idh, C7241b> implements jdh {
        public /* synthetic */ C7241b(C7240a c7240a) {
            this();
        }

        public C7241b clearMode() {
            m23743e();
            ((idh) this.f89756b).clearMode();
            return this;
        }

        public C7241b clearReadOnly() {
            m23743e();
            ((idh) this.f89756b).clearReadOnly();
            return this;
        }

        public C7241b clearReadWrite() {
            m23743e();
            ((idh) this.f89756b).clearReadWrite();
            return this;
        }

        @Override // p000.jdh
        public EnumC7242c getModeCase() {
            return ((idh) this.f89756b).getModeCase();
        }

        @Override // p000.jdh
        public C7243d getReadOnly() {
            return ((idh) this.f89756b).getReadOnly();
        }

        @Override // p000.jdh
        public C7245f getReadWrite() {
            return ((idh) this.f89756b).getReadWrite();
        }

        @Override // p000.jdh
        public boolean hasReadOnly() {
            return ((idh) this.f89756b).hasReadOnly();
        }

        @Override // p000.jdh
        public boolean hasReadWrite() {
            return ((idh) this.f89756b).hasReadWrite();
        }

        public C7241b mergeReadOnly(C7243d c7243d) {
            m23743e();
            ((idh) this.f89756b).mergeReadOnly(c7243d);
            return this;
        }

        public C7241b mergeReadWrite(C7245f c7245f) {
            m23743e();
            ((idh) this.f89756b).mergeReadWrite(c7245f);
            return this;
        }

        public C7241b setReadOnly(C7243d c7243d) {
            m23743e();
            ((idh) this.f89756b).setReadOnly(c7243d);
            return this;
        }

        public C7241b setReadWrite(C7245f c7245f) {
            m23743e();
            ((idh) this.f89756b).setReadWrite(c7245f);
            return this;
        }

        private C7241b() {
            super(idh.DEFAULT_INSTANCE);
        }

        public C7241b setReadOnly(C7243d.a aVar) {
            m23743e();
            ((idh) this.f89756b).setReadOnly(aVar.build());
            return this;
        }

        public C7241b setReadWrite(C7245f.a aVar) {
            m23743e();
            ((idh) this.f89756b).setReadWrite(aVar.build());
            return this;
        }
    }

    /* JADX INFO: renamed from: idh$c */
    public enum EnumC7242c {
        READ_ONLY(2),
        READ_WRITE(3),
        MODE_NOT_SET(0);


        /* JADX INFO: renamed from: a */
        public final int f46579a;

        EnumC7242c(int i) {
            this.f46579a = i;
        }

        public static EnumC7242c forNumber(int i) {
            if (i == 0) {
                return MODE_NOT_SET;
            }
            if (i == 2) {
                return READ_ONLY;
            }
            if (i != 3) {
                return null;
            }
            return READ_WRITE;
        }

        public int getNumber() {
            return this.f46579a;
        }

        @Deprecated
        public static EnumC7242c valueOf(int i) {
            return forNumber(i);
        }
    }

    /* JADX INFO: renamed from: idh$d */
    public static final class C7243d extends v27<C7243d, a> implements InterfaceC7244e {
        private static final C7243d DEFAULT_INSTANCE;
        private static volatile uhc<C7243d> PARSER = null;
        public static final int READ_TIME_FIELD_NUMBER = 2;
        private int consistencySelectorCase_ = 0;
        private Object consistencySelector_;

        /* JADX INFO: renamed from: idh$d$a */
        public static final class a extends v27.AbstractC13823b<C7243d, a> implements InterfaceC7244e {
            public /* synthetic */ a(C7240a c7240a) {
                this();
            }

            public a clearConsistencySelector() {
                m23743e();
                ((C7243d) this.f89756b).clearConsistencySelector();
                return this;
            }

            public a clearReadTime() {
                m23743e();
                ((C7243d) this.f89756b).clearReadTime();
                return this;
            }

            @Override // p000.idh.InterfaceC7244e
            public b getConsistencySelectorCase() {
                return ((C7243d) this.f89756b).getConsistencySelectorCase();
            }

            @Override // p000.idh.InterfaceC7244e
            public f2h getReadTime() {
                return ((C7243d) this.f89756b).getReadTime();
            }

            @Override // p000.idh.InterfaceC7244e
            public boolean hasReadTime() {
                return ((C7243d) this.f89756b).hasReadTime();
            }

            public a mergeReadTime(f2h f2hVar) {
                m23743e();
                ((C7243d) this.f89756b).mergeReadTime(f2hVar);
                return this;
            }

            public a setReadTime(f2h f2hVar) {
                m23743e();
                ((C7243d) this.f89756b).setReadTime(f2hVar);
                return this;
            }

            private a() {
                super(C7243d.DEFAULT_INSTANCE);
            }

            public a setReadTime(f2h.C5567b c5567b) {
                m23743e();
                ((C7243d) this.f89756b).setReadTime(c5567b.build());
                return this;
            }
        }

        /* JADX INFO: renamed from: idh$d$b */
        public enum b {
            READ_TIME(2),
            CONSISTENCYSELECTOR_NOT_SET(0);


            /* JADX INFO: renamed from: a */
            public final int f46583a;

            b(int i) {
                this.f46583a = i;
            }

            public static b forNumber(int i) {
                if (i == 0) {
                    return CONSISTENCYSELECTOR_NOT_SET;
                }
                if (i != 2) {
                    return null;
                }
                return READ_TIME;
            }

            public int getNumber() {
                return this.f46583a;
            }

            @Deprecated
            public static b valueOf(int i) {
                return forNumber(i);
            }
        }

        static {
            C7243d c7243d = new C7243d();
            DEFAULT_INSTANCE = c7243d;
            v27.m23715h0(C7243d.class, c7243d);
        }

        private C7243d() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearConsistencySelector() {
            this.consistencySelectorCase_ = 0;
            this.consistencySelector_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearReadTime() {
            if (this.consistencySelectorCase_ == 2) {
                this.consistencySelectorCase_ = 0;
                this.consistencySelector_ = null;
            }
        }

        public static C7243d getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeReadTime(f2h f2hVar) {
            f2hVar.getClass();
            if (this.consistencySelectorCase_ != 2 || this.consistencySelector_ == f2h.getDefaultInstance()) {
                this.consistencySelector_ = f2hVar;
            } else {
                this.consistencySelector_ = f2h.newBuilder((f2h) this.consistencySelector_).mergeFrom(f2hVar).buildPartial();
            }
            this.consistencySelectorCase_ = 2;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.m23738n();
        }

        public static C7243d parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (C7243d) v27.m23700S(DEFAULT_INSTANCE, inputStream);
        }

        public static C7243d parseFrom(ByteBuffer byteBuffer) throws ce8 {
            return (C7243d) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
        }

        public static uhc<C7243d> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setReadTime(f2h f2hVar) {
            f2hVar.getClass();
            this.consistencySelector_ = f2hVar;
            this.consistencySelectorCase_ = 2;
        }

        @Override // p000.idh.InterfaceC7244e
        public b getConsistencySelectorCase() {
            return b.forNumber(this.consistencySelectorCase_);
        }

        @Override // p000.idh.InterfaceC7244e
        public f2h getReadTime() {
            return this.consistencySelectorCase_ == 2 ? (f2h) this.consistencySelector_ : f2h.getDefaultInstance();
        }

        @Override // p000.idh.InterfaceC7244e
        public boolean hasReadTime() {
            return this.consistencySelectorCase_ == 2;
        }

        @Override // p000.v27
        /* JADX INFO: renamed from: r */
        public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
            C7240a c7240a = null;
            switch (C7240a.f46574a[enumC13830i.ordinal()]) {
                case 1:
                    return new C7243d();
                case 2:
                    return new a(c7240a);
                case 3:
                    return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0001\u0001\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002<\u0000", new Object[]{"consistencySelector_", "consistencySelectorCase_", f2h.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    uhc<C7243d> c13824c = PARSER;
                    if (c13824c == null) {
                        synchronized (C7243d.class) {
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

        public static a newBuilder(C7243d c7243d) {
            return DEFAULT_INSTANCE.m23739o(c7243d);
        }

        public static C7243d parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
            return (C7243d) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
        }

        public static C7243d parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
            return (C7243d) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
        }

        public static C7243d parseFrom(vj1 vj1Var) throws ce8 {
            return (C7243d) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
        }

        public static C7243d parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
            return (C7243d) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
        }

        public static C7243d parseFrom(byte[] bArr) throws ce8 {
            return (C7243d) v27.m23710c0(DEFAULT_INSTANCE, bArr);
        }

        public static C7243d parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
            return (C7243d) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
        }

        public static C7243d parseFrom(InputStream inputStream) throws IOException {
            return (C7243d) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
        }

        public static C7243d parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
            return (C7243d) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
        }

        public static C7243d parseFrom(f72 f72Var) throws IOException {
            return (C7243d) v27.m23704W(DEFAULT_INSTANCE, f72Var);
        }

        public static C7243d parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
            return (C7243d) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
        }
    }

    /* JADX INFO: renamed from: idh$e */
    public interface InterfaceC7244e extends rsa {
        C7243d.b getConsistencySelectorCase();

        f2h getReadTime();

        boolean hasReadTime();
    }

    /* JADX INFO: renamed from: idh$f */
    public static final class C7245f extends v27<C7245f, a> implements InterfaceC7246g {
        private static final C7245f DEFAULT_INSTANCE;
        private static volatile uhc<C7245f> PARSER = null;
        public static final int RETRY_TRANSACTION_FIELD_NUMBER = 1;
        private vj1 retryTransaction_ = vj1.f91344e;

        /* JADX INFO: renamed from: idh$f$a */
        public static final class a extends v27.AbstractC13823b<C7245f, a> implements InterfaceC7246g {
            public /* synthetic */ a(C7240a c7240a) {
                this();
            }

            public a clearRetryTransaction() {
                m23743e();
                ((C7245f) this.f89756b).clearRetryTransaction();
                return this;
            }

            @Override // p000.idh.InterfaceC7246g
            public vj1 getRetryTransaction() {
                return ((C7245f) this.f89756b).getRetryTransaction();
            }

            public a setRetryTransaction(vj1 vj1Var) {
                m23743e();
                ((C7245f) this.f89756b).setRetryTransaction(vj1Var);
                return this;
            }

            private a() {
                super(C7245f.DEFAULT_INSTANCE);
            }
        }

        static {
            C7245f c7245f = new C7245f();
            DEFAULT_INSTANCE = c7245f;
            v27.m23715h0(C7245f.class, c7245f);
        }

        private C7245f() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRetryTransaction() {
            this.retryTransaction_ = getDefaultInstance().getRetryTransaction();
        }

        public static C7245f getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.m23738n();
        }

        public static C7245f parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (C7245f) v27.m23700S(DEFAULT_INSTANCE, inputStream);
        }

        public static C7245f parseFrom(ByteBuffer byteBuffer) throws ce8 {
            return (C7245f) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
        }

        public static uhc<C7245f> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRetryTransaction(vj1 vj1Var) {
            vj1Var.getClass();
            this.retryTransaction_ = vj1Var;
        }

        @Override // p000.idh.InterfaceC7246g
        public vj1 getRetryTransaction() {
            return this.retryTransaction_;
        }

        @Override // p000.v27
        /* JADX INFO: renamed from: r */
        public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
            C7240a c7240a = null;
            switch (C7240a.f46574a[enumC13830i.ordinal()]) {
                case 1:
                    return new C7245f();
                case 2:
                    return new a(c7240a);
                case 3:
                    return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n", new Object[]{"retryTransaction_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    uhc<C7245f> c13824c = PARSER;
                    if (c13824c == null) {
                        synchronized (C7245f.class) {
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

        public static a newBuilder(C7245f c7245f) {
            return DEFAULT_INSTANCE.m23739o(c7245f);
        }

        public static C7245f parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
            return (C7245f) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
        }

        public static C7245f parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
            return (C7245f) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
        }

        public static C7245f parseFrom(vj1 vj1Var) throws ce8 {
            return (C7245f) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
        }

        public static C7245f parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
            return (C7245f) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
        }

        public static C7245f parseFrom(byte[] bArr) throws ce8 {
            return (C7245f) v27.m23710c0(DEFAULT_INSTANCE, bArr);
        }

        public static C7245f parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
            return (C7245f) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
        }

        public static C7245f parseFrom(InputStream inputStream) throws IOException {
            return (C7245f) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
        }

        public static C7245f parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
            return (C7245f) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
        }

        public static C7245f parseFrom(f72 f72Var) throws IOException {
            return (C7245f) v27.m23704W(DEFAULT_INSTANCE, f72Var);
        }

        public static C7245f parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
            return (C7245f) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
        }
    }

    /* JADX INFO: renamed from: idh$g */
    public interface InterfaceC7246g extends rsa {
        vj1 getRetryTransaction();
    }

    static {
        idh idhVar = new idh();
        DEFAULT_INSTANCE = idhVar;
        v27.m23715h0(idh.class, idhVar);
    }

    private idh() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMode() {
        this.modeCase_ = 0;
        this.mode_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReadOnly() {
        if (this.modeCase_ == 2) {
            this.modeCase_ = 0;
            this.mode_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReadWrite() {
        if (this.modeCase_ == 3) {
            this.modeCase_ = 0;
            this.mode_ = null;
        }
    }

    public static idh getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeReadOnly(C7243d c7243d) {
        c7243d.getClass();
        if (this.modeCase_ != 2 || this.mode_ == C7243d.getDefaultInstance()) {
            this.mode_ = c7243d;
        } else {
            this.mode_ = C7243d.newBuilder((C7243d) this.mode_).mergeFrom(c7243d).buildPartial();
        }
        this.modeCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeReadWrite(C7245f c7245f) {
        c7245f.getClass();
        if (this.modeCase_ != 3 || this.mode_ == C7245f.getDefaultInstance()) {
            this.mode_ = c7245f;
        } else {
            this.mode_ = C7245f.newBuilder((C7245f) this.mode_).mergeFrom(c7245f).buildPartial();
        }
        this.modeCase_ = 3;
    }

    public static C7241b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    public static idh parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (idh) v27.m23700S(DEFAULT_INSTANCE, inputStream);
    }

    public static idh parseFrom(ByteBuffer byteBuffer) throws ce8 {
        return (idh) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static uhc<idh> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReadOnly(C7243d c7243d) {
        c7243d.getClass();
        this.mode_ = c7243d;
        this.modeCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReadWrite(C7245f c7245f) {
        c7245f.getClass();
        this.mode_ = c7245f;
        this.modeCase_ = 3;
    }

    @Override // p000.jdh
    public EnumC7242c getModeCase() {
        return EnumC7242c.forNumber(this.modeCase_);
    }

    @Override // p000.jdh
    public C7243d getReadOnly() {
        return this.modeCase_ == 2 ? (C7243d) this.mode_ : C7243d.getDefaultInstance();
    }

    @Override // p000.jdh
    public C7245f getReadWrite() {
        return this.modeCase_ == 3 ? (C7245f) this.mode_ : C7245f.getDefaultInstance();
    }

    @Override // p000.jdh
    public boolean hasReadOnly() {
        return this.modeCase_ == 2;
    }

    @Override // p000.jdh
    public boolean hasReadWrite() {
        return this.modeCase_ == 3;
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
        C7240a c7240a = null;
        switch (C7240a.f46574a[enumC13830i.ordinal()]) {
            case 1:
                return new idh();
            case 2:
                return new C7241b(c7240a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"mode_", "modeCase_", C7243d.class, C7245f.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<idh> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (idh.class) {
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

    public static C7241b newBuilder(idh idhVar) {
        return DEFAULT_INSTANCE.m23739o(idhVar);
    }

    public static idh parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (idh) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static idh parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
        return (idh) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
    }

    public static idh parseFrom(vj1 vj1Var) throws ce8 {
        return (idh) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
    }

    public static idh parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
        return (idh) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
    }

    public static idh parseFrom(byte[] bArr) throws ce8 {
        return (idh) v27.m23710c0(DEFAULT_INSTANCE, bArr);
    }

    public static idh parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
        return (idh) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
    }

    public static idh parseFrom(InputStream inputStream) throws IOException {
        return (idh) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
    }

    public static idh parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (idh) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static idh parseFrom(f72 f72Var) throws IOException {
        return (idh) v27.m23704W(DEFAULT_INSTANCE, f72Var);
    }

    public static idh parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
        return (idh) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
    }
}
