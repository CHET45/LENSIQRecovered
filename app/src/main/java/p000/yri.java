package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import p000.di4;
import p000.m7d;
import p000.nh4;
import p000.v27;
import p000.w98;
import p000.zi4;

/* JADX INFO: loaded from: classes5.dex */
public final class yri extends v27<yri, C15790b> implements esi {
    public static final int CURRENT_DOCUMENT_FIELD_NUMBER = 4;
    private static final yri DEFAULT_INSTANCE;
    public static final int DELETE_FIELD_NUMBER = 2;
    private static volatile uhc<yri> PARSER = null;
    public static final int TRANSFORM_FIELD_NUMBER = 6;
    public static final int UPDATE_FIELD_NUMBER = 1;
    public static final int UPDATE_MASK_FIELD_NUMBER = 3;
    public static final int UPDATE_TRANSFORMS_FIELD_NUMBER = 7;
    public static final int VERIFY_FIELD_NUMBER = 5;
    private int bitField0_;
    private m7d currentDocument_;
    private Object operation_;
    private di4 updateMask_;
    private int operationCase_ = 0;
    private w98.InterfaceC14504k<zi4.C16149c> updateTransforms_ = v27.m23722x();

    /* JADX INFO: renamed from: yri$a */
    public static /* synthetic */ class C15789a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f102804a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f102804a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f102804a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f102804a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f102804a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f102804a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f102804a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f102804a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: yri$b */
    public static final class C15790b extends v27.AbstractC13823b<yri, C15790b> implements esi {
        public /* synthetic */ C15790b(C15789a c15789a) {
            this();
        }

        public C15790b addAllUpdateTransforms(Iterable<? extends zi4.C16149c> iterable) {
            m23743e();
            ((yri) this.f89756b).addAllUpdateTransforms(iterable);
            return this;
        }

        public C15790b addUpdateTransforms(zi4.C16149c c16149c) {
            m23743e();
            ((yri) this.f89756b).addUpdateTransforms(c16149c);
            return this;
        }

        public C15790b clearCurrentDocument() {
            m23743e();
            ((yri) this.f89756b).clearCurrentDocument();
            return this;
        }

        public C15790b clearDelete() {
            m23743e();
            ((yri) this.f89756b).clearDelete();
            return this;
        }

        public C15790b clearOperation() {
            m23743e();
            ((yri) this.f89756b).clearOperation();
            return this;
        }

        public C15790b clearTransform() {
            m23743e();
            ((yri) this.f89756b).clearTransform();
            return this;
        }

        public C15790b clearUpdate() {
            m23743e();
            ((yri) this.f89756b).clearUpdate();
            return this;
        }

        public C15790b clearUpdateMask() {
            m23743e();
            ((yri) this.f89756b).clearUpdateMask();
            return this;
        }

        public C15790b clearUpdateTransforms() {
            m23743e();
            ((yri) this.f89756b).clearUpdateTransforms();
            return this;
        }

        public C15790b clearVerify() {
            m23743e();
            ((yri) this.f89756b).clearVerify();
            return this;
        }

        @Override // p000.esi
        public m7d getCurrentDocument() {
            return ((yri) this.f89756b).getCurrentDocument();
        }

        @Override // p000.esi
        public String getDelete() {
            return ((yri) this.f89756b).getDelete();
        }

        @Override // p000.esi
        public vj1 getDeleteBytes() {
            return ((yri) this.f89756b).getDeleteBytes();
        }

        @Override // p000.esi
        public EnumC15791c getOperationCase() {
            return ((yri) this.f89756b).getOperationCase();
        }

        @Override // p000.esi
        public zi4 getTransform() {
            return ((yri) this.f89756b).getTransform();
        }

        @Override // p000.esi
        public nh4 getUpdate() {
            return ((yri) this.f89756b).getUpdate();
        }

        @Override // p000.esi
        public di4 getUpdateMask() {
            return ((yri) this.f89756b).getUpdateMask();
        }

        @Override // p000.esi
        public zi4.C16149c getUpdateTransforms(int i) {
            return ((yri) this.f89756b).getUpdateTransforms(i);
        }

        @Override // p000.esi
        public int getUpdateTransformsCount() {
            return ((yri) this.f89756b).getUpdateTransformsCount();
        }

        @Override // p000.esi
        public List<zi4.C16149c> getUpdateTransformsList() {
            return Collections.unmodifiableList(((yri) this.f89756b).getUpdateTransformsList());
        }

        @Override // p000.esi
        public String getVerify() {
            return ((yri) this.f89756b).getVerify();
        }

        @Override // p000.esi
        public vj1 getVerifyBytes() {
            return ((yri) this.f89756b).getVerifyBytes();
        }

        @Override // p000.esi
        public boolean hasCurrentDocument() {
            return ((yri) this.f89756b).hasCurrentDocument();
        }

        @Override // p000.esi
        public boolean hasDelete() {
            return ((yri) this.f89756b).hasDelete();
        }

        @Override // p000.esi
        public boolean hasTransform() {
            return ((yri) this.f89756b).hasTransform();
        }

        @Override // p000.esi
        public boolean hasUpdate() {
            return ((yri) this.f89756b).hasUpdate();
        }

        @Override // p000.esi
        public boolean hasUpdateMask() {
            return ((yri) this.f89756b).hasUpdateMask();
        }

        @Override // p000.esi
        public boolean hasVerify() {
            return ((yri) this.f89756b).hasVerify();
        }

        public C15790b mergeCurrentDocument(m7d m7dVar) {
            m23743e();
            ((yri) this.f89756b).mergeCurrentDocument(m7dVar);
            return this;
        }

        public C15790b mergeTransform(zi4 zi4Var) {
            m23743e();
            ((yri) this.f89756b).mergeTransform(zi4Var);
            return this;
        }

        public C15790b mergeUpdate(nh4 nh4Var) {
            m23743e();
            ((yri) this.f89756b).mergeUpdate(nh4Var);
            return this;
        }

        public C15790b mergeUpdateMask(di4 di4Var) {
            m23743e();
            ((yri) this.f89756b).mergeUpdateMask(di4Var);
            return this;
        }

        public C15790b removeUpdateTransforms(int i) {
            m23743e();
            ((yri) this.f89756b).removeUpdateTransforms(i);
            return this;
        }

        public C15790b setCurrentDocument(m7d m7dVar) {
            m23743e();
            ((yri) this.f89756b).setCurrentDocument(m7dVar);
            return this;
        }

        public C15790b setDelete(String str) {
            m23743e();
            ((yri) this.f89756b).setDelete(str);
            return this;
        }

        public C15790b setDeleteBytes(vj1 vj1Var) {
            m23743e();
            ((yri) this.f89756b).setDeleteBytes(vj1Var);
            return this;
        }

        public C15790b setTransform(zi4 zi4Var) {
            m23743e();
            ((yri) this.f89756b).setTransform(zi4Var);
            return this;
        }

        public C15790b setUpdate(nh4 nh4Var) {
            m23743e();
            ((yri) this.f89756b).setUpdate(nh4Var);
            return this;
        }

        public C15790b setUpdateMask(di4 di4Var) {
            m23743e();
            ((yri) this.f89756b).setUpdateMask(di4Var);
            return this;
        }

        public C15790b setUpdateTransforms(int i, zi4.C16149c c16149c) {
            m23743e();
            ((yri) this.f89756b).setUpdateTransforms(i, c16149c);
            return this;
        }

        public C15790b setVerify(String str) {
            m23743e();
            ((yri) this.f89756b).setVerify(str);
            return this;
        }

        public C15790b setVerifyBytes(vj1 vj1Var) {
            m23743e();
            ((yri) this.f89756b).setVerifyBytes(vj1Var);
            return this;
        }

        private C15790b() {
            super(yri.DEFAULT_INSTANCE);
        }

        public C15790b addUpdateTransforms(int i, zi4.C16149c c16149c) {
            m23743e();
            ((yri) this.f89756b).addUpdateTransforms(i, c16149c);
            return this;
        }

        public C15790b setCurrentDocument(m7d.C9214b c9214b) {
            m23743e();
            ((yri) this.f89756b).setCurrentDocument(c9214b.build());
            return this;
        }

        public C15790b setTransform(zi4.C16148b c16148b) {
            m23743e();
            ((yri) this.f89756b).setTransform(c16148b.build());
            return this;
        }

        public C15790b setUpdate(nh4.C9874b c9874b) {
            m23743e();
            ((yri) this.f89756b).setUpdate(c9874b.build());
            return this;
        }

        public C15790b setUpdateMask(di4.C4792b c4792b) {
            m23743e();
            ((yri) this.f89756b).setUpdateMask(c4792b.build());
            return this;
        }

        public C15790b setUpdateTransforms(int i, zi4.C16149c.a aVar) {
            m23743e();
            ((yri) this.f89756b).setUpdateTransforms(i, aVar.build());
            return this;
        }

        public C15790b addUpdateTransforms(zi4.C16149c.a aVar) {
            m23743e();
            ((yri) this.f89756b).addUpdateTransforms(aVar.build());
            return this;
        }

        public C15790b addUpdateTransforms(int i, zi4.C16149c.a aVar) {
            m23743e();
            ((yri) this.f89756b).addUpdateTransforms(i, aVar.build());
            return this;
        }
    }

    /* JADX INFO: renamed from: yri$c */
    public enum EnumC15791c {
        UPDATE(1),
        DELETE(2),
        VERIFY(5),
        TRANSFORM(6),
        OPERATION_NOT_SET(0);


        /* JADX INFO: renamed from: a */
        public final int f102811a;

        EnumC15791c(int i) {
            this.f102811a = i;
        }

        public static EnumC15791c forNumber(int i) {
            if (i == 0) {
                return OPERATION_NOT_SET;
            }
            if (i == 1) {
                return UPDATE;
            }
            if (i == 2) {
                return DELETE;
            }
            if (i == 5) {
                return VERIFY;
            }
            if (i != 6) {
                return null;
            }
            return TRANSFORM;
        }

        public int getNumber() {
            return this.f102811a;
        }

        @Deprecated
        public static EnumC15791c valueOf(int i) {
            return forNumber(i);
        }
    }

    static {
        yri yriVar = new yri();
        DEFAULT_INSTANCE = yriVar;
        v27.m23715h0(yri.class, yriVar);
    }

    private yri() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllUpdateTransforms(Iterable<? extends zi4.C16149c> iterable) {
        ensureUpdateTransformsIsMutable();
        AbstractC1714b3.m2856b(iterable, this.updateTransforms_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addUpdateTransforms(zi4.C16149c c16149c) {
        c16149c.getClass();
        ensureUpdateTransformsIsMutable();
        this.updateTransforms_.add(c16149c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCurrentDocument() {
        this.currentDocument_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDelete() {
        if (this.operationCase_ == 2) {
            this.operationCase_ = 0;
            this.operation_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOperation() {
        this.operationCase_ = 0;
        this.operation_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTransform() {
        if (this.operationCase_ == 6) {
            this.operationCase_ = 0;
            this.operation_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUpdate() {
        if (this.operationCase_ == 1) {
            this.operationCase_ = 0;
            this.operation_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUpdateMask() {
        this.updateMask_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUpdateTransforms() {
        this.updateTransforms_ = v27.m23722x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVerify() {
        if (this.operationCase_ == 5) {
            this.operationCase_ = 0;
            this.operation_ = null;
        }
    }

    private void ensureUpdateTransformsIsMutable() {
        w98.InterfaceC14504k<zi4.C16149c> interfaceC14504k = this.updateTransforms_;
        if (interfaceC14504k.isModifiable()) {
            return;
        }
        this.updateTransforms_ = v27.m23698P(interfaceC14504k);
    }

    public static yri getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCurrentDocument(m7d m7dVar) {
        m7dVar.getClass();
        m7d m7dVar2 = this.currentDocument_;
        if (m7dVar2 == null || m7dVar2 == m7d.getDefaultInstance()) {
            this.currentDocument_ = m7dVar;
        } else {
            this.currentDocument_ = m7d.newBuilder(this.currentDocument_).mergeFrom(m7dVar).buildPartial();
        }
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTransform(zi4 zi4Var) {
        zi4Var.getClass();
        if (this.operationCase_ != 6 || this.operation_ == zi4.getDefaultInstance()) {
            this.operation_ = zi4Var;
        } else {
            this.operation_ = zi4.newBuilder((zi4) this.operation_).mergeFrom(zi4Var).buildPartial();
        }
        this.operationCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUpdate(nh4 nh4Var) {
        nh4Var.getClass();
        if (this.operationCase_ != 1 || this.operation_ == nh4.getDefaultInstance()) {
            this.operation_ = nh4Var;
        } else {
            this.operation_ = nh4.newBuilder((nh4) this.operation_).mergeFrom(nh4Var).buildPartial();
        }
        this.operationCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUpdateMask(di4 di4Var) {
        di4Var.getClass();
        di4 di4Var2 = this.updateMask_;
        if (di4Var2 == null || di4Var2 == di4.getDefaultInstance()) {
            this.updateMask_ = di4Var;
        } else {
            this.updateMask_ = di4.newBuilder(this.updateMask_).mergeFrom(di4Var).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static C15790b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    public static yri parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (yri) v27.m23700S(DEFAULT_INSTANCE, inputStream);
    }

    public static yri parseFrom(ByteBuffer byteBuffer) throws ce8 {
        return (yri) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static uhc<yri> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeUpdateTransforms(int i) {
        ensureUpdateTransformsIsMutable();
        this.updateTransforms_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurrentDocument(m7d m7dVar) {
        m7dVar.getClass();
        this.currentDocument_ = m7dVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDelete(String str) {
        str.getClass();
        this.operationCase_ = 2;
        this.operation_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeleteBytes(vj1 vj1Var) {
        AbstractC1714b3.m2857c(vj1Var);
        this.operation_ = vj1Var.toStringUtf8();
        this.operationCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTransform(zi4 zi4Var) {
        zi4Var.getClass();
        this.operation_ = zi4Var;
        this.operationCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUpdate(nh4 nh4Var) {
        nh4Var.getClass();
        this.operation_ = nh4Var;
        this.operationCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUpdateMask(di4 di4Var) {
        di4Var.getClass();
        this.updateMask_ = di4Var;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUpdateTransforms(int i, zi4.C16149c c16149c) {
        c16149c.getClass();
        ensureUpdateTransformsIsMutable();
        this.updateTransforms_.set(i, c16149c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVerify(String str) {
        str.getClass();
        this.operationCase_ = 5;
        this.operation_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVerifyBytes(vj1 vj1Var) {
        AbstractC1714b3.m2857c(vj1Var);
        this.operation_ = vj1Var.toStringUtf8();
        this.operationCase_ = 5;
    }

    @Override // p000.esi
    public m7d getCurrentDocument() {
        m7d m7dVar = this.currentDocument_;
        return m7dVar == null ? m7d.getDefaultInstance() : m7dVar;
    }

    @Override // p000.esi
    public String getDelete() {
        return this.operationCase_ == 2 ? (String) this.operation_ : "";
    }

    @Override // p000.esi
    public vj1 getDeleteBytes() {
        return vj1.copyFromUtf8(this.operationCase_ == 2 ? (String) this.operation_ : "");
    }

    @Override // p000.esi
    public EnumC15791c getOperationCase() {
        return EnumC15791c.forNumber(this.operationCase_);
    }

    @Override // p000.esi
    public zi4 getTransform() {
        return this.operationCase_ == 6 ? (zi4) this.operation_ : zi4.getDefaultInstance();
    }

    @Override // p000.esi
    public nh4 getUpdate() {
        return this.operationCase_ == 1 ? (nh4) this.operation_ : nh4.getDefaultInstance();
    }

    @Override // p000.esi
    public di4 getUpdateMask() {
        di4 di4Var = this.updateMask_;
        return di4Var == null ? di4.getDefaultInstance() : di4Var;
    }

    @Override // p000.esi
    public zi4.C16149c getUpdateTransforms(int i) {
        return this.updateTransforms_.get(i);
    }

    @Override // p000.esi
    public int getUpdateTransformsCount() {
        return this.updateTransforms_.size();
    }

    @Override // p000.esi
    public List<zi4.C16149c> getUpdateTransformsList() {
        return this.updateTransforms_;
    }

    public zi4.InterfaceC16150d getUpdateTransformsOrBuilder(int i) {
        return this.updateTransforms_.get(i);
    }

    public List<? extends zi4.InterfaceC16150d> getUpdateTransformsOrBuilderList() {
        return this.updateTransforms_;
    }

    @Override // p000.esi
    public String getVerify() {
        return this.operationCase_ == 5 ? (String) this.operation_ : "";
    }

    @Override // p000.esi
    public vj1 getVerifyBytes() {
        return vj1.copyFromUtf8(this.operationCase_ == 5 ? (String) this.operation_ : "");
    }

    @Override // p000.esi
    public boolean hasCurrentDocument() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // p000.esi
    public boolean hasDelete() {
        return this.operationCase_ == 2;
    }

    @Override // p000.esi
    public boolean hasTransform() {
        return this.operationCase_ == 6;
    }

    @Override // p000.esi
    public boolean hasUpdate() {
        return this.operationCase_ == 1;
    }

    @Override // p000.esi
    public boolean hasUpdateMask() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // p000.esi
    public boolean hasVerify() {
        return this.operationCase_ == 5;
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
        C15789a c15789a = null;
        switch (C15789a.f102804a[enumC13830i.ordinal()]) {
            case 1:
                return new yri();
            case 2:
                return new C15790b(c15789a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001<\u0000\u0002Ȼ\u0000\u0003ဉ\u0000\u0004ဉ\u0001\u0005Ȼ\u0000\u0006<\u0000\u0007\u001b", new Object[]{"operation_", "operationCase_", "bitField0_", nh4.class, "updateMask_", "currentDocument_", zi4.class, "updateTransforms_", zi4.C16149c.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<yri> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (yri.class) {
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

    public static C15790b newBuilder(yri yriVar) {
        return DEFAULT_INSTANCE.m23739o(yriVar);
    }

    public static yri parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (yri) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static yri parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
        return (yri) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
    }

    public static yri parseFrom(vj1 vj1Var) throws ce8 {
        return (yri) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addUpdateTransforms(int i, zi4.C16149c c16149c) {
        c16149c.getClass();
        ensureUpdateTransformsIsMutable();
        this.updateTransforms_.add(i, c16149c);
    }

    public static yri parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
        return (yri) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
    }

    public static yri parseFrom(byte[] bArr) throws ce8 {
        return (yri) v27.m23710c0(DEFAULT_INSTANCE, bArr);
    }

    public static yri parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
        return (yri) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
    }

    public static yri parseFrom(InputStream inputStream) throws IOException {
        return (yri) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
    }

    public static yri parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (yri) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static yri parseFrom(f72 f72Var) throws IOException {
        return (yri) v27.m23704W(DEFAULT_INSTANCE, f72Var);
    }

    public static yri parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
        return (yri) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
    }
}
