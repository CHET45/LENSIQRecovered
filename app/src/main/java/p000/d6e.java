package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import p000.v27;
import p000.w98;

/* JADX INFO: loaded from: classes5.dex */
public final class d6e extends v27<d6e, C4636b> implements e6e {
    private static final d6e DEFAULT_INSTANCE;
    public static final int HISTORY_FIELD_NUMBER = 4;
    public static final int NAME_FIELD_FIELD_NUMBER = 3;
    private static volatile uhc<d6e> PARSER = null;
    public static final int PATTERN_FIELD_NUMBER = 2;
    public static final int PLURAL_FIELD_NUMBER = 5;
    public static final int SINGULAR_FIELD_NUMBER = 6;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int history_;
    private String type_ = "";
    private w98.InterfaceC14504k<String> pattern_ = v27.m23722x();
    private String nameField_ = "";
    private String plural_ = "";
    private String singular_ = "";

    /* JADX INFO: renamed from: d6e$a */
    public static /* synthetic */ class C4635a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f28559a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f28559a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28559a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28559a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f28559a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f28559a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f28559a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f28559a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: d6e$b */
    public static final class C4636b extends v27.AbstractC13823b<d6e, C4636b> implements e6e {
        public /* synthetic */ C4636b(C4635a c4635a) {
            this();
        }

        public C4636b addAllPattern(Iterable<String> iterable) {
            m23743e();
            ((d6e) this.f89756b).addAllPattern(iterable);
            return this;
        }

        public C4636b addPattern(String str) {
            m23743e();
            ((d6e) this.f89756b).addPattern(str);
            return this;
        }

        public C4636b addPatternBytes(vj1 vj1Var) {
            m23743e();
            ((d6e) this.f89756b).addPatternBytes(vj1Var);
            return this;
        }

        public C4636b clearHistory() {
            m23743e();
            ((d6e) this.f89756b).clearHistory();
            return this;
        }

        public C4636b clearNameField() {
            m23743e();
            ((d6e) this.f89756b).clearNameField();
            return this;
        }

        public C4636b clearPattern() {
            m23743e();
            ((d6e) this.f89756b).clearPattern();
            return this;
        }

        public C4636b clearPlural() {
            m23743e();
            ((d6e) this.f89756b).clearPlural();
            return this;
        }

        public C4636b clearSingular() {
            m23743e();
            ((d6e) this.f89756b).clearSingular();
            return this;
        }

        public C4636b clearType() {
            m23743e();
            ((d6e) this.f89756b).clearType();
            return this;
        }

        @Override // p000.e6e
        public EnumC4637c getHistory() {
            return ((d6e) this.f89756b).getHistory();
        }

        @Override // p000.e6e
        public int getHistoryValue() {
            return ((d6e) this.f89756b).getHistoryValue();
        }

        @Override // p000.e6e
        public String getNameField() {
            return ((d6e) this.f89756b).getNameField();
        }

        @Override // p000.e6e
        public vj1 getNameFieldBytes() {
            return ((d6e) this.f89756b).getNameFieldBytes();
        }

        @Override // p000.e6e
        public String getPattern(int i) {
            return ((d6e) this.f89756b).getPattern(i);
        }

        @Override // p000.e6e
        public vj1 getPatternBytes(int i) {
            return ((d6e) this.f89756b).getPatternBytes(i);
        }

        @Override // p000.e6e
        public int getPatternCount() {
            return ((d6e) this.f89756b).getPatternCount();
        }

        @Override // p000.e6e
        public List<String> getPatternList() {
            return Collections.unmodifiableList(((d6e) this.f89756b).getPatternList());
        }

        @Override // p000.e6e
        public String getPlural() {
            return ((d6e) this.f89756b).getPlural();
        }

        @Override // p000.e6e
        public vj1 getPluralBytes() {
            return ((d6e) this.f89756b).getPluralBytes();
        }

        @Override // p000.e6e
        public String getSingular() {
            return ((d6e) this.f89756b).getSingular();
        }

        @Override // p000.e6e
        public vj1 getSingularBytes() {
            return ((d6e) this.f89756b).getSingularBytes();
        }

        @Override // p000.e6e
        public String getType() {
            return ((d6e) this.f89756b).getType();
        }

        @Override // p000.e6e
        public vj1 getTypeBytes() {
            return ((d6e) this.f89756b).getTypeBytes();
        }

        public C4636b setHistory(EnumC4637c enumC4637c) {
            m23743e();
            ((d6e) this.f89756b).setHistory(enumC4637c);
            return this;
        }

        public C4636b setHistoryValue(int i) {
            m23743e();
            ((d6e) this.f89756b).setHistoryValue(i);
            return this;
        }

        public C4636b setNameField(String str) {
            m23743e();
            ((d6e) this.f89756b).setNameField(str);
            return this;
        }

        public C4636b setNameFieldBytes(vj1 vj1Var) {
            m23743e();
            ((d6e) this.f89756b).setNameFieldBytes(vj1Var);
            return this;
        }

        public C4636b setPattern(int i, String str) {
            m23743e();
            ((d6e) this.f89756b).setPattern(i, str);
            return this;
        }

        public C4636b setPlural(String str) {
            m23743e();
            ((d6e) this.f89756b).setPlural(str);
            return this;
        }

        public C4636b setPluralBytes(vj1 vj1Var) {
            m23743e();
            ((d6e) this.f89756b).setPluralBytes(vj1Var);
            return this;
        }

        public C4636b setSingular(String str) {
            m23743e();
            ((d6e) this.f89756b).setSingular(str);
            return this;
        }

        public C4636b setSingularBytes(vj1 vj1Var) {
            m23743e();
            ((d6e) this.f89756b).setSingularBytes(vj1Var);
            return this;
        }

        public C4636b setType(String str) {
            m23743e();
            ((d6e) this.f89756b).setType(str);
            return this;
        }

        public C4636b setTypeBytes(vj1 vj1Var) {
            m23743e();
            ((d6e) this.f89756b).setTypeBytes(vj1Var);
            return this;
        }

        private C4636b() {
            super(d6e.DEFAULT_INSTANCE);
        }
    }

    /* JADX INFO: renamed from: d6e$c */
    public enum EnumC4637c implements w98.InterfaceC14497d {
        HISTORY_UNSPECIFIED(0),
        ORIGINALLY_SINGLE_PATTERN(1),
        FUTURE_MULTI_PATTERN(2),
        UNRECOGNIZED(-1);


        /* JADX INFO: renamed from: C */
        public static final int f28560C = 2;

        /* JADX INFO: renamed from: F */
        public static final w98.InterfaceC14498e<EnumC4637c> f28561F = new a();

        /* JADX INFO: renamed from: f */
        public static final int f28567f = 0;

        /* JADX INFO: renamed from: m */
        public static final int f28568m = 1;

        /* JADX INFO: renamed from: a */
        public final int f28569a;

        /* JADX INFO: renamed from: d6e$c$a */
        public class a implements w98.InterfaceC14498e<EnumC4637c> {
            @Override // p000.w98.InterfaceC14498e
            public EnumC4637c findValueByNumber(int i) {
                return EnumC4637c.forNumber(i);
            }
        }

        /* JADX INFO: renamed from: d6e$c$b */
        public static final class b implements w98.InterfaceC14499f {

            /* JADX INFO: renamed from: a */
            public static final w98.InterfaceC14499f f28570a = new b();

            private b() {
            }

            @Override // p000.w98.InterfaceC14499f
            public boolean isInRange(int i) {
                return EnumC4637c.forNumber(i) != null;
            }
        }

        EnumC4637c(int i) {
            this.f28569a = i;
        }

        public static EnumC4637c forNumber(int i) {
            if (i == 0) {
                return HISTORY_UNSPECIFIED;
            }
            if (i == 1) {
                return ORIGINALLY_SINGLE_PATTERN;
            }
            if (i != 2) {
                return null;
            }
            return FUTURE_MULTI_PATTERN;
        }

        public static w98.InterfaceC14498e<EnumC4637c> internalGetValueMap() {
            return f28561F;
        }

        public static w98.InterfaceC14499f internalGetVerifier() {
            return b.f28570a;
        }

        @Override // p000.w98.InterfaceC14497d
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.f28569a;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static EnumC4637c valueOf(int i) {
            return forNumber(i);
        }
    }

    static {
        d6e d6eVar = new d6e();
        DEFAULT_INSTANCE = d6eVar;
        v27.m23715h0(d6e.class, d6eVar);
    }

    private d6e() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllPattern(Iterable<String> iterable) {
        ensurePatternIsMutable();
        AbstractC1714b3.m2856b(iterable, this.pattern_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPattern(String str) {
        str.getClass();
        ensurePatternIsMutable();
        this.pattern_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPatternBytes(vj1 vj1Var) {
        AbstractC1714b3.m2857c(vj1Var);
        ensurePatternIsMutable();
        this.pattern_.add(vj1Var.toStringUtf8());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHistory() {
        this.history_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNameField() {
        this.nameField_ = getDefaultInstance().getNameField();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPattern() {
        this.pattern_ = v27.m23722x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlural() {
        this.plural_ = getDefaultInstance().getPlural();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSingular() {
        this.singular_ = getDefaultInstance().getSingular();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = getDefaultInstance().getType();
    }

    private void ensurePatternIsMutable() {
        w98.InterfaceC14504k<String> interfaceC14504k = this.pattern_;
        if (interfaceC14504k.isModifiable()) {
            return;
        }
        this.pattern_ = v27.m23698P(interfaceC14504k);
    }

    public static d6e getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C4636b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    public static d6e parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (d6e) v27.m23700S(DEFAULT_INSTANCE, inputStream);
    }

    public static d6e parseFrom(ByteBuffer byteBuffer) throws ce8 {
        return (d6e) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static uhc<d6e> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHistory(EnumC4637c enumC4637c) {
        this.history_ = enumC4637c.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHistoryValue(int i) {
        this.history_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameField(String str) {
        str.getClass();
        this.nameField_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameFieldBytes(vj1 vj1Var) {
        AbstractC1714b3.m2857c(vj1Var);
        this.nameField_ = vj1Var.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPattern(int i, String str) {
        str.getClass();
        ensurePatternIsMutable();
        this.pattern_.set(i, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlural(String str) {
        str.getClass();
        this.plural_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPluralBytes(vj1 vj1Var) {
        AbstractC1714b3.m2857c(vj1Var);
        this.plural_ = vj1Var.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSingular(String str) {
        str.getClass();
        this.singular_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSingularBytes(vj1 vj1Var) {
        AbstractC1714b3.m2857c(vj1Var);
        this.singular_ = vj1Var.toStringUtf8();
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

    @Override // p000.e6e
    public EnumC4637c getHistory() {
        EnumC4637c enumC4637cForNumber = EnumC4637c.forNumber(this.history_);
        return enumC4637cForNumber == null ? EnumC4637c.UNRECOGNIZED : enumC4637cForNumber;
    }

    @Override // p000.e6e
    public int getHistoryValue() {
        return this.history_;
    }

    @Override // p000.e6e
    public String getNameField() {
        return this.nameField_;
    }

    @Override // p000.e6e
    public vj1 getNameFieldBytes() {
        return vj1.copyFromUtf8(this.nameField_);
    }

    @Override // p000.e6e
    public String getPattern(int i) {
        return this.pattern_.get(i);
    }

    @Override // p000.e6e
    public vj1 getPatternBytes(int i) {
        return vj1.copyFromUtf8(this.pattern_.get(i));
    }

    @Override // p000.e6e
    public int getPatternCount() {
        return this.pattern_.size();
    }

    @Override // p000.e6e
    public List<String> getPatternList() {
        return this.pattern_;
    }

    @Override // p000.e6e
    public String getPlural() {
        return this.plural_;
    }

    @Override // p000.e6e
    public vj1 getPluralBytes() {
        return vj1.copyFromUtf8(this.plural_);
    }

    @Override // p000.e6e
    public String getSingular() {
        return this.singular_;
    }

    @Override // p000.e6e
    public vj1 getSingularBytes() {
        return vj1.copyFromUtf8(this.singular_);
    }

    @Override // p000.e6e
    public String getType() {
        return this.type_;
    }

    @Override // p000.e6e
    public vj1 getTypeBytes() {
        return vj1.copyFromUtf8(this.type_);
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
        C4635a c4635a = null;
        switch (C4635a.f28559a[enumC13830i.ordinal()]) {
            case 1:
                return new d6e();
            case 2:
                return new C4636b(c4635a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0001\u0000\u0001Ȉ\u0002Ț\u0003Ȉ\u0004\f\u0005Ȉ\u0006Ȉ", new Object[]{"type_", "pattern_", "nameField_", "history_", "plural_", "singular_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<d6e> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (d6e.class) {
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

    public static C4636b newBuilder(d6e d6eVar) {
        return DEFAULT_INSTANCE.m23739o(d6eVar);
    }

    public static d6e parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (d6e) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static d6e parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
        return (d6e) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
    }

    public static d6e parseFrom(vj1 vj1Var) throws ce8 {
        return (d6e) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
    }

    public static d6e parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
        return (d6e) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
    }

    public static d6e parseFrom(byte[] bArr) throws ce8 {
        return (d6e) v27.m23710c0(DEFAULT_INSTANCE, bArr);
    }

    public static d6e parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
        return (d6e) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
    }

    public static d6e parseFrom(InputStream inputStream) throws IOException {
        return (d6e) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
    }

    public static d6e parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (d6e) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static d6e parseFrom(f72 f72Var) throws IOException {
        return (d6e) v27.m23704W(DEFAULT_INSTANCE, f72Var);
    }

    public static d6e parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
        return (d6e) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
    }
}
