package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p000.o95;
import p000.sh4;
import p000.smg;
import p000.v27;
import p000.vi4;
import p000.xh4;

/* JADX INFO: loaded from: classes5.dex */
public final class fa9 extends v27<fa9, C5705b> implements ga9 {
    private static final fa9 DEFAULT_INSTANCE;
    public static final int DOCUMENT_CHANGE_FIELD_NUMBER = 3;
    public static final int DOCUMENT_DELETE_FIELD_NUMBER = 4;
    public static final int DOCUMENT_REMOVE_FIELD_NUMBER = 6;
    public static final int FILTER_FIELD_NUMBER = 5;
    private static volatile uhc<fa9> PARSER = null;
    public static final int TARGET_CHANGE_FIELD_NUMBER = 2;
    private int responseTypeCase_ = 0;
    private Object responseType_;

    /* JADX INFO: renamed from: fa9$a */
    public static /* synthetic */ class C5704a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f35923a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f35923a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f35923a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f35923a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f35923a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f35923a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f35923a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f35923a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: fa9$b */
    public static final class C5705b extends v27.AbstractC13823b<fa9, C5705b> implements ga9 {
        public /* synthetic */ C5705b(C5704a c5704a) {
            this();
        }

        public C5705b clearDocumentChange() {
            m23743e();
            ((fa9) this.f89756b).clearDocumentChange();
            return this;
        }

        public C5705b clearDocumentDelete() {
            m23743e();
            ((fa9) this.f89756b).clearDocumentDelete();
            return this;
        }

        public C5705b clearDocumentRemove() {
            m23743e();
            ((fa9) this.f89756b).clearDocumentRemove();
            return this;
        }

        public C5705b clearFilter() {
            m23743e();
            ((fa9) this.f89756b).clearFilter();
            return this;
        }

        public C5705b clearResponseType() {
            m23743e();
            ((fa9) this.f89756b).clearResponseType();
            return this;
        }

        public C5705b clearTargetChange() {
            m23743e();
            ((fa9) this.f89756b).clearTargetChange();
            return this;
        }

        @Override // p000.ga9
        public sh4 getDocumentChange() {
            return ((fa9) this.f89756b).getDocumentChange();
        }

        @Override // p000.ga9
        public xh4 getDocumentDelete() {
            return ((fa9) this.f89756b).getDocumentDelete();
        }

        @Override // p000.ga9
        public vi4 getDocumentRemove() {
            return ((fa9) this.f89756b).getDocumentRemove();
        }

        @Override // p000.ga9
        public o95 getFilter() {
            return ((fa9) this.f89756b).getFilter();
        }

        @Override // p000.ga9
        public EnumC5706c getResponseTypeCase() {
            return ((fa9) this.f89756b).getResponseTypeCase();
        }

        @Override // p000.ga9
        public smg getTargetChange() {
            return ((fa9) this.f89756b).getTargetChange();
        }

        @Override // p000.ga9
        public boolean hasDocumentChange() {
            return ((fa9) this.f89756b).hasDocumentChange();
        }

        @Override // p000.ga9
        public boolean hasDocumentDelete() {
            return ((fa9) this.f89756b).hasDocumentDelete();
        }

        @Override // p000.ga9
        public boolean hasDocumentRemove() {
            return ((fa9) this.f89756b).hasDocumentRemove();
        }

        @Override // p000.ga9
        public boolean hasFilter() {
            return ((fa9) this.f89756b).hasFilter();
        }

        @Override // p000.ga9
        public boolean hasTargetChange() {
            return ((fa9) this.f89756b).hasTargetChange();
        }

        public C5705b mergeDocumentChange(sh4 sh4Var) {
            m23743e();
            ((fa9) this.f89756b).mergeDocumentChange(sh4Var);
            return this;
        }

        public C5705b mergeDocumentDelete(xh4 xh4Var) {
            m23743e();
            ((fa9) this.f89756b).mergeDocumentDelete(xh4Var);
            return this;
        }

        public C5705b mergeDocumentRemove(vi4 vi4Var) {
            m23743e();
            ((fa9) this.f89756b).mergeDocumentRemove(vi4Var);
            return this;
        }

        public C5705b mergeFilter(o95 o95Var) {
            m23743e();
            ((fa9) this.f89756b).mergeFilter(o95Var);
            return this;
        }

        public C5705b mergeTargetChange(smg smgVar) {
            m23743e();
            ((fa9) this.f89756b).mergeTargetChange(smgVar);
            return this;
        }

        public C5705b setDocumentChange(sh4 sh4Var) {
            m23743e();
            ((fa9) this.f89756b).setDocumentChange(sh4Var);
            return this;
        }

        public C5705b setDocumentDelete(xh4 xh4Var) {
            m23743e();
            ((fa9) this.f89756b).setDocumentDelete(xh4Var);
            return this;
        }

        public C5705b setDocumentRemove(vi4 vi4Var) {
            m23743e();
            ((fa9) this.f89756b).setDocumentRemove(vi4Var);
            return this;
        }

        public C5705b setFilter(o95 o95Var) {
            m23743e();
            ((fa9) this.f89756b).setFilter(o95Var);
            return this;
        }

        public C5705b setTargetChange(smg smgVar) {
            m23743e();
            ((fa9) this.f89756b).setTargetChange(smgVar);
            return this;
        }

        private C5705b() {
            super(fa9.DEFAULT_INSTANCE);
        }

        public C5705b setDocumentChange(sh4.C12579b c12579b) {
            m23743e();
            ((fa9) this.f89756b).setDocumentChange(c12579b.build());
            return this;
        }

        public C5705b setDocumentDelete(xh4.C15071b c15071b) {
            m23743e();
            ((fa9) this.f89756b).setDocumentDelete(c15071b.build());
            return this;
        }

        public C5705b setDocumentRemove(vi4.C14088b c14088b) {
            m23743e();
            ((fa9) this.f89756b).setDocumentRemove(c14088b.build());
            return this;
        }

        public C5705b setFilter(o95.C10269b c10269b) {
            m23743e();
            ((fa9) this.f89756b).setFilter(c10269b.build());
            return this;
        }

        public C5705b setTargetChange(smg.C12664b c12664b) {
            m23743e();
            ((fa9) this.f89756b).setTargetChange(c12664b.build());
            return this;
        }
    }

    /* JADX INFO: renamed from: fa9$c */
    public enum EnumC5706c {
        TARGET_CHANGE(2),
        DOCUMENT_CHANGE(3),
        DOCUMENT_DELETE(4),
        DOCUMENT_REMOVE(6),
        FILTER(5),
        RESPONSETYPE_NOT_SET(0);


        /* JADX INFO: renamed from: a */
        public final int f35931a;

        EnumC5706c(int i) {
            this.f35931a = i;
        }

        public static EnumC5706c forNumber(int i) {
            if (i == 0) {
                return RESPONSETYPE_NOT_SET;
            }
            if (i == 2) {
                return TARGET_CHANGE;
            }
            if (i == 3) {
                return DOCUMENT_CHANGE;
            }
            if (i == 4) {
                return DOCUMENT_DELETE;
            }
            if (i == 5) {
                return FILTER;
            }
            if (i != 6) {
                return null;
            }
            return DOCUMENT_REMOVE;
        }

        public int getNumber() {
            return this.f35931a;
        }

        @Deprecated
        public static EnumC5706c valueOf(int i) {
            return forNumber(i);
        }
    }

    static {
        fa9 fa9Var = new fa9();
        DEFAULT_INSTANCE = fa9Var;
        v27.m23715h0(fa9.class, fa9Var);
    }

    private fa9() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDocumentChange() {
        if (this.responseTypeCase_ == 3) {
            this.responseTypeCase_ = 0;
            this.responseType_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDocumentDelete() {
        if (this.responseTypeCase_ == 4) {
            this.responseTypeCase_ = 0;
            this.responseType_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDocumentRemove() {
        if (this.responseTypeCase_ == 6) {
            this.responseTypeCase_ = 0;
            this.responseType_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFilter() {
        if (this.responseTypeCase_ == 5) {
            this.responseTypeCase_ = 0;
            this.responseType_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResponseType() {
        this.responseTypeCase_ = 0;
        this.responseType_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTargetChange() {
        if (this.responseTypeCase_ == 2) {
            this.responseTypeCase_ = 0;
            this.responseType_ = null;
        }
    }

    public static fa9 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDocumentChange(sh4 sh4Var) {
        sh4Var.getClass();
        if (this.responseTypeCase_ != 3 || this.responseType_ == sh4.getDefaultInstance()) {
            this.responseType_ = sh4Var;
        } else {
            this.responseType_ = sh4.newBuilder((sh4) this.responseType_).mergeFrom(sh4Var).buildPartial();
        }
        this.responseTypeCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDocumentDelete(xh4 xh4Var) {
        xh4Var.getClass();
        if (this.responseTypeCase_ != 4 || this.responseType_ == xh4.getDefaultInstance()) {
            this.responseType_ = xh4Var;
        } else {
            this.responseType_ = xh4.newBuilder((xh4) this.responseType_).mergeFrom(xh4Var).buildPartial();
        }
        this.responseTypeCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDocumentRemove(vi4 vi4Var) {
        vi4Var.getClass();
        if (this.responseTypeCase_ != 6 || this.responseType_ == vi4.getDefaultInstance()) {
            this.responseType_ = vi4Var;
        } else {
            this.responseType_ = vi4.newBuilder((vi4) this.responseType_).mergeFrom(vi4Var).buildPartial();
        }
        this.responseTypeCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeFilter(o95 o95Var) {
        o95Var.getClass();
        if (this.responseTypeCase_ != 5 || this.responseType_ == o95.getDefaultInstance()) {
            this.responseType_ = o95Var;
        } else {
            this.responseType_ = o95.newBuilder((o95) this.responseType_).mergeFrom(o95Var).buildPartial();
        }
        this.responseTypeCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTargetChange(smg smgVar) {
        smgVar.getClass();
        if (this.responseTypeCase_ != 2 || this.responseType_ == smg.getDefaultInstance()) {
            this.responseType_ = smgVar;
        } else {
            this.responseType_ = smg.newBuilder((smg) this.responseType_).mergeFrom(smgVar).buildPartial();
        }
        this.responseTypeCase_ = 2;
    }

    public static C5705b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    public static fa9 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (fa9) v27.m23700S(DEFAULT_INSTANCE, inputStream);
    }

    public static fa9 parseFrom(ByteBuffer byteBuffer) throws ce8 {
        return (fa9) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static uhc<fa9> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDocumentChange(sh4 sh4Var) {
        sh4Var.getClass();
        this.responseType_ = sh4Var;
        this.responseTypeCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDocumentDelete(xh4 xh4Var) {
        xh4Var.getClass();
        this.responseType_ = xh4Var;
        this.responseTypeCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDocumentRemove(vi4 vi4Var) {
        vi4Var.getClass();
        this.responseType_ = vi4Var;
        this.responseTypeCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFilter(o95 o95Var) {
        o95Var.getClass();
        this.responseType_ = o95Var;
        this.responseTypeCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTargetChange(smg smgVar) {
        smgVar.getClass();
        this.responseType_ = smgVar;
        this.responseTypeCase_ = 2;
    }

    @Override // p000.ga9
    public sh4 getDocumentChange() {
        return this.responseTypeCase_ == 3 ? (sh4) this.responseType_ : sh4.getDefaultInstance();
    }

    @Override // p000.ga9
    public xh4 getDocumentDelete() {
        return this.responseTypeCase_ == 4 ? (xh4) this.responseType_ : xh4.getDefaultInstance();
    }

    @Override // p000.ga9
    public vi4 getDocumentRemove() {
        return this.responseTypeCase_ == 6 ? (vi4) this.responseType_ : vi4.getDefaultInstance();
    }

    @Override // p000.ga9
    public o95 getFilter() {
        return this.responseTypeCase_ == 5 ? (o95) this.responseType_ : o95.getDefaultInstance();
    }

    @Override // p000.ga9
    public EnumC5706c getResponseTypeCase() {
        return EnumC5706c.forNumber(this.responseTypeCase_);
    }

    @Override // p000.ga9
    public smg getTargetChange() {
        return this.responseTypeCase_ == 2 ? (smg) this.responseType_ : smg.getDefaultInstance();
    }

    @Override // p000.ga9
    public boolean hasDocumentChange() {
        return this.responseTypeCase_ == 3;
    }

    @Override // p000.ga9
    public boolean hasDocumentDelete() {
        return this.responseTypeCase_ == 4;
    }

    @Override // p000.ga9
    public boolean hasDocumentRemove() {
        return this.responseTypeCase_ == 6;
    }

    @Override // p000.ga9
    public boolean hasFilter() {
        return this.responseTypeCase_ == 5;
    }

    @Override // p000.ga9
    public boolean hasTargetChange() {
        return this.responseTypeCase_ == 2;
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
        C5704a c5704a = null;
        switch (C5704a.f35923a[enumC13830i.ordinal()]) {
            case 1:
                return new fa9();
            case 2:
                return new C5705b(c5704a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0005\u0001\u0000\u0002\u0006\u0005\u0000\u0000\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"responseType_", "responseTypeCase_", smg.class, sh4.class, xh4.class, o95.class, vi4.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<fa9> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (fa9.class) {
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

    public static C5705b newBuilder(fa9 fa9Var) {
        return DEFAULT_INSTANCE.m23739o(fa9Var);
    }

    public static fa9 parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (fa9) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static fa9 parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
        return (fa9) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
    }

    public static fa9 parseFrom(vj1 vj1Var) throws ce8 {
        return (fa9) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
    }

    public static fa9 parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
        return (fa9) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
    }

    public static fa9 parseFrom(byte[] bArr) throws ce8 {
        return (fa9) v27.m23710c0(DEFAULT_INSTANCE, bArr);
    }

    public static fa9 parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
        return (fa9) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
    }

    public static fa9 parseFrom(InputStream inputStream) throws IOException {
        return (fa9) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
    }

    public static fa9 parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (fa9) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static fa9 parseFrom(f72 f72Var) throws IOException {
        return (fa9) v27.m23704W(DEFAULT_INSTANCE, f72Var);
    }

    public static fa9 parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
        return (fa9) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
    }
}
