package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p000.gpi;
import p000.l74;
import p000.u27;
import p000.v98;

/* JADX INFO: loaded from: classes3.dex */
public final class wi8 {

    /* JADX INFO: renamed from: a */
    public static final int f94307a = 1001;

    /* JADX INFO: renamed from: b */
    public static final u27.C13330h<l74.C8680o, C14617b> f94308b = u27.newSingularGeneratedExtension(l74.C8680o.getDefaultInstance(), C14617b.getDefaultInstance(), C14617b.getDefaultInstance(), null, 1001, gpi.EnumC6460b.f40754N, C14617b.class);

    /* JADX INFO: renamed from: wi8$a */
    public static /* synthetic */ class C14616a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f94309a;

        static {
            int[] iArr = new int[u27.EnumC13331i.values().length];
            f94309a = iArr;
            try {
                iArr[u27.EnumC13331i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f94309a[u27.EnumC13331i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f94309a[u27.EnumC13331i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f94309a[u27.EnumC13331i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f94309a[u27.EnumC13331i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f94309a[u27.EnumC13331i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f94309a[u27.EnumC13331i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: wi8$b */
    public static final class C14617b extends u27<C14617b, a> implements InterfaceC14618c {
        private static final C14617b DEFAULT_INSTANCE;
        public static final int LEGACY_CLOSED_ENUM_FIELD_NUMBER = 1;
        private static volatile vhc<C14617b> PARSER = null;
        public static final int UTF8_VALIDATION_FIELD_NUMBER = 2;
        private int bitField0_;
        private boolean legacyClosedEnum_;
        private int utf8Validation_;

        /* JADX INFO: renamed from: wi8$b$a */
        public static final class a extends u27.AbstractC13324b<C14617b, a> implements InterfaceC14618c {
            public /* synthetic */ a(C14616a c14616a) {
                this();
            }

            public a clearLegacyClosedEnum() {
                m23058e();
                ((C14617b) this.f86607b).clearLegacyClosedEnum();
                return this;
            }

            public a clearUtf8Validation() {
                m23058e();
                ((C14617b) this.f86607b).clearUtf8Validation();
                return this;
            }

            @Override // p000.wi8.InterfaceC14618c
            public boolean getLegacyClosedEnum() {
                return ((C14617b) this.f86607b).getLegacyClosedEnum();
            }

            @Override // p000.wi8.InterfaceC14618c
            public b getUtf8Validation() {
                return ((C14617b) this.f86607b).getUtf8Validation();
            }

            @Override // p000.wi8.InterfaceC14618c
            public boolean hasLegacyClosedEnum() {
                return ((C14617b) this.f86607b).hasLegacyClosedEnum();
            }

            @Override // p000.wi8.InterfaceC14618c
            public boolean hasUtf8Validation() {
                return ((C14617b) this.f86607b).hasUtf8Validation();
            }

            public a setLegacyClosedEnum(boolean value) {
                m23058e();
                ((C14617b) this.f86607b).setLegacyClosedEnum(value);
                return this;
            }

            public a setUtf8Validation(b value) {
                m23058e();
                ((C14617b) this.f86607b).setUtf8Validation(value);
                return this;
            }

            private a() {
                super(C14617b.DEFAULT_INSTANCE);
            }
        }

        /* JADX INFO: renamed from: wi8$b$b */
        public enum b implements v98.InterfaceC13947c {
            UTF8_VALIDATION_UNKNOWN(0),
            DEFAULT(1),
            VERIFY(2);


            /* JADX INFO: renamed from: C */
            public static final v98.InterfaceC13948d<b> f94310C = new a();

            /* JADX INFO: renamed from: e */
            public static final int f94315e = 0;

            /* JADX INFO: renamed from: f */
            public static final int f94316f = 1;

            /* JADX INFO: renamed from: m */
            public static final int f94317m = 2;

            /* JADX INFO: renamed from: a */
            public final int f94318a;

            /* JADX INFO: renamed from: wi8$b$b$a */
            public class a implements v98.InterfaceC13948d<b> {
                @Override // p000.v98.InterfaceC13948d
                public b findValueByNumber(int number) {
                    return b.forNumber(number);
                }
            }

            /* JADX INFO: renamed from: wi8$b$b$b, reason: collision with other inner class name */
            public static final class C16550b implements v98.InterfaceC13949e {

                /* JADX INFO: renamed from: a */
                public static final v98.InterfaceC13949e f94319a = new C16550b();

                private C16550b() {
                }

                @Override // p000.v98.InterfaceC13949e
                public boolean isInRange(int number) {
                    return b.forNumber(number) != null;
                }
            }

            b(int value) {
                this.f94318a = value;
            }

            public static b forNumber(int value) {
                if (value == 0) {
                    return UTF8_VALIDATION_UNKNOWN;
                }
                if (value == 1) {
                    return DEFAULT;
                }
                if (value != 2) {
                    return null;
                }
                return VERIFY;
            }

            public static v98.InterfaceC13948d<b> internalGetValueMap() {
                return f94310C;
            }

            public static v98.InterfaceC13949e internalGetVerifier() {
                return C16550b.f94319a;
            }

            @Override // p000.v98.InterfaceC13947c
            public final int getNumber() {
                return this.f94318a;
            }

            @Deprecated
            public static b valueOf(int value) {
                return forNumber(value);
            }
        }

        static {
            C14617b c14617b = new C14617b();
            DEFAULT_INSTANCE = c14617b;
            u27.m23029g0(C14617b.class, c14617b);
        }

        private C14617b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLegacyClosedEnum() {
            this.bitField0_ &= -2;
            this.legacyClosedEnum_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUtf8Validation() {
            this.bitField0_ &= -3;
            this.utf8Validation_ = 0;
        }

        public static C14617b getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.m23053m();
        }

        public static C14617b parseDelimitedFrom(InputStream input) throws IOException {
            return (C14617b) u27.m23014R(DEFAULT_INSTANCE, input);
        }

        public static C14617b parseFrom(ByteBuffer data) throws be8 {
            return (C14617b) u27.m23022Z(DEFAULT_INSTANCE, data);
        }

        public static vhc<C14617b> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLegacyClosedEnum(boolean value) {
            this.bitField0_ |= 1;
            this.legacyClosedEnum_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUtf8Validation(b value) {
            this.utf8Validation_ = value.getNumber();
            this.bitField0_ |= 2;
        }

        @Override // p000.wi8.InterfaceC14618c
        public boolean getLegacyClosedEnum() {
            return this.legacyClosedEnum_;
        }

        @Override // p000.wi8.InterfaceC14618c
        public b getUtf8Validation() {
            b bVarForNumber = b.forNumber(this.utf8Validation_);
            return bVarForNumber == null ? b.UTF8_VALIDATION_UNKNOWN : bVarForNumber;
        }

        @Override // p000.wi8.InterfaceC14618c
        public boolean hasLegacyClosedEnum() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // p000.wi8.InterfaceC14618c
        public boolean hasUtf8Validation() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // p000.u27
        /* JADX INFO: renamed from: q */
        public final Object mo79q(u27.EnumC13331i method, Object arg0, Object arg1) {
            C14616a c14616a = null;
            switch (C14616a.f94309a[method.ordinal()]) {
                case 1:
                    return new C14617b();
                case 2:
                    return new a(c14616a);
                case 3:
                    return u27.m23013P(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002᠌\u0001", new Object[]{"bitField0_", "legacyClosedEnum_", "utf8Validation_", b.internalGetVerifier()});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    vhc<C14617b> c13325c = PARSER;
                    if (c13325c == null) {
                        synchronized (C14617b.class) {
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

        public static a newBuilder(C14617b prototype) {
            return DEFAULT_INSTANCE.m23054n(prototype);
        }

        public static C14617b parseDelimitedFrom(InputStream input, yi5 extensionRegistry) throws IOException {
            return (C14617b) u27.m23015S(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static C14617b parseFrom(ByteBuffer data, yi5 extensionRegistry) throws be8 {
            return (C14617b) u27.m23023a0(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static C14617b parseFrom(wj1 data) throws be8 {
            return (C14617b) u27.m23016T(DEFAULT_INSTANCE, data);
        }

        public static C14617b parseFrom(wj1 data, yi5 extensionRegistry) throws be8 {
            return (C14617b) u27.m23017U(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static C14617b parseFrom(byte[] data) throws be8 {
            return (C14617b) u27.m23024b0(DEFAULT_INSTANCE, data);
        }

        public static C14617b parseFrom(byte[] data, yi5 extensionRegistry) throws be8 {
            return (C14617b) u27.m23025c0(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static C14617b parseFrom(InputStream input) throws IOException {
            return (C14617b) u27.m23020X(DEFAULT_INSTANCE, input);
        }

        public static C14617b parseFrom(InputStream input, yi5 extensionRegistry) throws IOException {
            return (C14617b) u27.m23021Y(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static C14617b parseFrom(e72 input) throws IOException {
            return (C14617b) u27.m23018V(DEFAULT_INSTANCE, input);
        }

        public static C14617b parseFrom(e72 input, yi5 extensionRegistry) throws IOException {
            return (C14617b) u27.m23019W(DEFAULT_INSTANCE, input, extensionRegistry);
        }
    }

    /* JADX INFO: renamed from: wi8$c */
    public interface InterfaceC14618c extends ssa {
        boolean getLegacyClosedEnum();

        C14617b.b getUtf8Validation();

        boolean hasLegacyClosedEnum();

        boolean hasUtf8Validation();
    }

    private wi8() {
    }

    public static void registerAllExtensions(yi5 registry) {
        registry.add((u27.C13330h<?, ?>) f94308b);
    }
}
