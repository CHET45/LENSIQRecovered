package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import p000.C13543ui;
import p000.v27;
import p000.w98;

/* JADX INFO: loaded from: classes5.dex */
public final class fq2 extends v27<fq2, C5926b> implements gq2 {
    public static final int ADVICES_FIELD_NUMBER = 5;
    public static final int CHANGE_TYPE_FIELD_NUMBER = 4;
    private static final fq2 DEFAULT_INSTANCE;
    public static final int ELEMENT_FIELD_NUMBER = 1;
    public static final int NEW_VALUE_FIELD_NUMBER = 3;
    public static final int OLD_VALUE_FIELD_NUMBER = 2;
    private static volatile uhc<fq2> PARSER;
    private int changeType_;
    private String element_ = "";
    private String oldValue_ = "";
    private String newValue_ = "";
    private w98.InterfaceC14504k<C13543ui> advices_ = v27.m23722x();

    /* JADX INFO: renamed from: fq2$a */
    public static /* synthetic */ class C5925a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f37409a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f37409a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f37409a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f37409a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f37409a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f37409a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f37409a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f37409a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: fq2$b */
    public static final class C5926b extends v27.AbstractC13823b<fq2, C5926b> implements gq2 {
        public /* synthetic */ C5926b(C5925a c5925a) {
            this();
        }

        public C5926b addAdvices(C13543ui c13543ui) {
            m23743e();
            ((fq2) this.f89756b).addAdvices(c13543ui);
            return this;
        }

        public C5926b addAllAdvices(Iterable<? extends C13543ui> iterable) {
            m23743e();
            ((fq2) this.f89756b).addAllAdvices(iterable);
            return this;
        }

        public C5926b clearAdvices() {
            m23743e();
            ((fq2) this.f89756b).clearAdvices();
            return this;
        }

        public C5926b clearChangeType() {
            m23743e();
            ((fq2) this.f89756b).clearChangeType();
            return this;
        }

        public C5926b clearElement() {
            m23743e();
            ((fq2) this.f89756b).clearElement();
            return this;
        }

        public C5926b clearNewValue() {
            m23743e();
            ((fq2) this.f89756b).clearNewValue();
            return this;
        }

        public C5926b clearOldValue() {
            m23743e();
            ((fq2) this.f89756b).clearOldValue();
            return this;
        }

        @Override // p000.gq2
        public C13543ui getAdvices(int i) {
            return ((fq2) this.f89756b).getAdvices(i);
        }

        @Override // p000.gq2
        public int getAdvicesCount() {
            return ((fq2) this.f89756b).getAdvicesCount();
        }

        @Override // p000.gq2
        public List<C13543ui> getAdvicesList() {
            return Collections.unmodifiableList(((fq2) this.f89756b).getAdvicesList());
        }

        @Override // p000.gq2
        public zt1 getChangeType() {
            return ((fq2) this.f89756b).getChangeType();
        }

        @Override // p000.gq2
        public int getChangeTypeValue() {
            return ((fq2) this.f89756b).getChangeTypeValue();
        }

        @Override // p000.gq2
        public String getElement() {
            return ((fq2) this.f89756b).getElement();
        }

        @Override // p000.gq2
        public vj1 getElementBytes() {
            return ((fq2) this.f89756b).getElementBytes();
        }

        @Override // p000.gq2
        public String getNewValue() {
            return ((fq2) this.f89756b).getNewValue();
        }

        @Override // p000.gq2
        public vj1 getNewValueBytes() {
            return ((fq2) this.f89756b).getNewValueBytes();
        }

        @Override // p000.gq2
        public String getOldValue() {
            return ((fq2) this.f89756b).getOldValue();
        }

        @Override // p000.gq2
        public vj1 getOldValueBytes() {
            return ((fq2) this.f89756b).getOldValueBytes();
        }

        public C5926b removeAdvices(int i) {
            m23743e();
            ((fq2) this.f89756b).removeAdvices(i);
            return this;
        }

        public C5926b setAdvices(int i, C13543ui c13543ui) {
            m23743e();
            ((fq2) this.f89756b).setAdvices(i, c13543ui);
            return this;
        }

        public C5926b setChangeType(zt1 zt1Var) {
            m23743e();
            ((fq2) this.f89756b).setChangeType(zt1Var);
            return this;
        }

        public C5926b setChangeTypeValue(int i) {
            m23743e();
            ((fq2) this.f89756b).setChangeTypeValue(i);
            return this;
        }

        public C5926b setElement(String str) {
            m23743e();
            ((fq2) this.f89756b).setElement(str);
            return this;
        }

        public C5926b setElementBytes(vj1 vj1Var) {
            m23743e();
            ((fq2) this.f89756b).setElementBytes(vj1Var);
            return this;
        }

        public C5926b setNewValue(String str) {
            m23743e();
            ((fq2) this.f89756b).setNewValue(str);
            return this;
        }

        public C5926b setNewValueBytes(vj1 vj1Var) {
            m23743e();
            ((fq2) this.f89756b).setNewValueBytes(vj1Var);
            return this;
        }

        public C5926b setOldValue(String str) {
            m23743e();
            ((fq2) this.f89756b).setOldValue(str);
            return this;
        }

        public C5926b setOldValueBytes(vj1 vj1Var) {
            m23743e();
            ((fq2) this.f89756b).setOldValueBytes(vj1Var);
            return this;
        }

        private C5926b() {
            super(fq2.DEFAULT_INSTANCE);
        }

        public C5926b addAdvices(int i, C13543ui c13543ui) {
            m23743e();
            ((fq2) this.f89756b).addAdvices(i, c13543ui);
            return this;
        }

        public C5926b setAdvices(int i, C13543ui.b bVar) {
            m23743e();
            ((fq2) this.f89756b).setAdvices(i, bVar.build());
            return this;
        }

        public C5926b addAdvices(C13543ui.b bVar) {
            m23743e();
            ((fq2) this.f89756b).addAdvices(bVar.build());
            return this;
        }

        public C5926b addAdvices(int i, C13543ui.b bVar) {
            m23743e();
            ((fq2) this.f89756b).addAdvices(i, bVar.build());
            return this;
        }
    }

    static {
        fq2 fq2Var = new fq2();
        DEFAULT_INSTANCE = fq2Var;
        v27.m23715h0(fq2.class, fq2Var);
    }

    private fq2() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAdvices(C13543ui c13543ui) {
        c13543ui.getClass();
        ensureAdvicesIsMutable();
        this.advices_.add(c13543ui);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAdvices(Iterable<? extends C13543ui> iterable) {
        ensureAdvicesIsMutable();
        AbstractC1714b3.m2856b(iterable, this.advices_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAdvices() {
        this.advices_ = v27.m23722x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearChangeType() {
        this.changeType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearElement() {
        this.element_ = getDefaultInstance().getElement();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNewValue() {
        this.newValue_ = getDefaultInstance().getNewValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOldValue() {
        this.oldValue_ = getDefaultInstance().getOldValue();
    }

    private void ensureAdvicesIsMutable() {
        w98.InterfaceC14504k<C13543ui> interfaceC14504k = this.advices_;
        if (interfaceC14504k.isModifiable()) {
            return;
        }
        this.advices_ = v27.m23698P(interfaceC14504k);
    }

    public static fq2 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C5926b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    public static fq2 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (fq2) v27.m23700S(DEFAULT_INSTANCE, inputStream);
    }

    public static fq2 parseFrom(ByteBuffer byteBuffer) throws ce8 {
        return (fq2) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static uhc<fq2> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeAdvices(int i) {
        ensureAdvicesIsMutable();
        this.advices_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdvices(int i, C13543ui c13543ui) {
        c13543ui.getClass();
        ensureAdvicesIsMutable();
        this.advices_.set(i, c13543ui);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChangeType(zt1 zt1Var) {
        this.changeType_ = zt1Var.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChangeTypeValue(int i) {
        this.changeType_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setElement(String str) {
        str.getClass();
        this.element_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setElementBytes(vj1 vj1Var) {
        AbstractC1714b3.m2857c(vj1Var);
        this.element_ = vj1Var.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNewValue(String str) {
        str.getClass();
        this.newValue_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNewValueBytes(vj1 vj1Var) {
        AbstractC1714b3.m2857c(vj1Var);
        this.newValue_ = vj1Var.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOldValue(String str) {
        str.getClass();
        this.oldValue_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOldValueBytes(vj1 vj1Var) {
        AbstractC1714b3.m2857c(vj1Var);
        this.oldValue_ = vj1Var.toStringUtf8();
    }

    @Override // p000.gq2
    public C13543ui getAdvices(int i) {
        return this.advices_.get(i);
    }

    @Override // p000.gq2
    public int getAdvicesCount() {
        return this.advices_.size();
    }

    @Override // p000.gq2
    public List<C13543ui> getAdvicesList() {
        return this.advices_;
    }

    public InterfaceC14083vi getAdvicesOrBuilder(int i) {
        return this.advices_.get(i);
    }

    public List<? extends InterfaceC14083vi> getAdvicesOrBuilderList() {
        return this.advices_;
    }

    @Override // p000.gq2
    public zt1 getChangeType() {
        zt1 zt1VarForNumber = zt1.forNumber(this.changeType_);
        return zt1VarForNumber == null ? zt1.UNRECOGNIZED : zt1VarForNumber;
    }

    @Override // p000.gq2
    public int getChangeTypeValue() {
        return this.changeType_;
    }

    @Override // p000.gq2
    public String getElement() {
        return this.element_;
    }

    @Override // p000.gq2
    public vj1 getElementBytes() {
        return vj1.copyFromUtf8(this.element_);
    }

    @Override // p000.gq2
    public String getNewValue() {
        return this.newValue_;
    }

    @Override // p000.gq2
    public vj1 getNewValueBytes() {
        return vj1.copyFromUtf8(this.newValue_);
    }

    @Override // p000.gq2
    public String getOldValue() {
        return this.oldValue_;
    }

    @Override // p000.gq2
    public vj1 getOldValueBytes() {
        return vj1.copyFromUtf8(this.oldValue_);
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
        C5925a c5925a = null;
        switch (C5925a.f37409a[enumC13830i.ordinal()]) {
            case 1:
                return new fq2();
            case 2:
                return new C5926b(c5925a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\f\u0005\u001b", new Object[]{"element_", "oldValue_", "newValue_", "changeType_", "advices_", C13543ui.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<fq2> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (fq2.class) {
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

    public static C5926b newBuilder(fq2 fq2Var) {
        return DEFAULT_INSTANCE.m23739o(fq2Var);
    }

    public static fq2 parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (fq2) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static fq2 parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
        return (fq2) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
    }

    public static fq2 parseFrom(vj1 vj1Var) throws ce8 {
        return (fq2) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAdvices(int i, C13543ui c13543ui) {
        c13543ui.getClass();
        ensureAdvicesIsMutable();
        this.advices_.add(i, c13543ui);
    }

    public static fq2 parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
        return (fq2) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
    }

    public static fq2 parseFrom(byte[] bArr) throws ce8 {
        return (fq2) v27.m23710c0(DEFAULT_INSTANCE, bArr);
    }

    public static fq2 parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
        return (fq2) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
    }

    public static fq2 parseFrom(InputStream inputStream) throws IOException {
        return (fq2) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
    }

    public static fq2 parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (fq2) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static fq2 parseFrom(f72 f72Var) throws IOException {
        return (fq2) v27.m23704W(DEFAULT_INSTANCE, f72Var);
    }

    public static fq2 parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
        return (fq2) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
    }
}
