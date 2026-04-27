package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import p000.f2h;
import p000.m4g;
import p000.v27;
import p000.w98;

/* JADX INFO: loaded from: classes5.dex */
public final class smg extends v27<smg, C12664b> implements umg {
    public static final int CAUSE_FIELD_NUMBER = 3;
    private static final smg DEFAULT_INSTANCE;
    private static volatile uhc<smg> PARSER = null;
    public static final int READ_TIME_FIELD_NUMBER = 6;
    public static final int RESUME_TOKEN_FIELD_NUMBER = 4;
    public static final int TARGET_CHANGE_TYPE_FIELD_NUMBER = 1;
    public static final int TARGET_IDS_FIELD_NUMBER = 2;
    private int bitField0_;
    private m4g cause_;
    private f2h readTime_;
    private int targetChangeType_;
    private int targetIdsMemoizedSerializedSize = -1;
    private w98.InterfaceC14501h targetIds_ = v27.m23720v();
    private vj1 resumeToken_ = vj1.f91344e;

    /* JADX INFO: renamed from: smg$a */
    public static /* synthetic */ class C12663a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f82253a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f82253a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f82253a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f82253a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f82253a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f82253a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f82253a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f82253a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: smg$b */
    public static final class C12664b extends v27.AbstractC13823b<smg, C12664b> implements umg {
        public /* synthetic */ C12664b(C12663a c12663a) {
            this();
        }

        public C12664b addAllTargetIds(Iterable<? extends Integer> iterable) {
            m23743e();
            ((smg) this.f89756b).addAllTargetIds(iterable);
            return this;
        }

        public C12664b addTargetIds(int i) {
            m23743e();
            ((smg) this.f89756b).addTargetIds(i);
            return this;
        }

        public C12664b clearCause() {
            m23743e();
            ((smg) this.f89756b).clearCause();
            return this;
        }

        public C12664b clearReadTime() {
            m23743e();
            ((smg) this.f89756b).clearReadTime();
            return this;
        }

        public C12664b clearResumeToken() {
            m23743e();
            ((smg) this.f89756b).clearResumeToken();
            return this;
        }

        public C12664b clearTargetChangeType() {
            m23743e();
            ((smg) this.f89756b).clearTargetChangeType();
            return this;
        }

        public C12664b clearTargetIds() {
            m23743e();
            ((smg) this.f89756b).clearTargetIds();
            return this;
        }

        @Override // p000.umg
        public m4g getCause() {
            return ((smg) this.f89756b).getCause();
        }

        @Override // p000.umg
        public f2h getReadTime() {
            return ((smg) this.f89756b).getReadTime();
        }

        @Override // p000.umg
        public vj1 getResumeToken() {
            return ((smg) this.f89756b).getResumeToken();
        }

        @Override // p000.umg
        public EnumC12665c getTargetChangeType() {
            return ((smg) this.f89756b).getTargetChangeType();
        }

        @Override // p000.umg
        public int getTargetChangeTypeValue() {
            return ((smg) this.f89756b).getTargetChangeTypeValue();
        }

        @Override // p000.umg
        public int getTargetIds(int i) {
            return ((smg) this.f89756b).getTargetIds(i);
        }

        @Override // p000.umg
        public int getTargetIdsCount() {
            return ((smg) this.f89756b).getTargetIdsCount();
        }

        @Override // p000.umg
        public List<Integer> getTargetIdsList() {
            return Collections.unmodifiableList(((smg) this.f89756b).getTargetIdsList());
        }

        @Override // p000.umg
        public boolean hasCause() {
            return ((smg) this.f89756b).hasCause();
        }

        @Override // p000.umg
        public boolean hasReadTime() {
            return ((smg) this.f89756b).hasReadTime();
        }

        public C12664b mergeCause(m4g m4gVar) {
            m23743e();
            ((smg) this.f89756b).mergeCause(m4gVar);
            return this;
        }

        public C12664b mergeReadTime(f2h f2hVar) {
            m23743e();
            ((smg) this.f89756b).mergeReadTime(f2hVar);
            return this;
        }

        public C12664b setCause(m4g m4gVar) {
            m23743e();
            ((smg) this.f89756b).setCause(m4gVar);
            return this;
        }

        public C12664b setReadTime(f2h f2hVar) {
            m23743e();
            ((smg) this.f89756b).setReadTime(f2hVar);
            return this;
        }

        public C12664b setResumeToken(vj1 vj1Var) {
            m23743e();
            ((smg) this.f89756b).setResumeToken(vj1Var);
            return this;
        }

        public C12664b setTargetChangeType(EnumC12665c enumC12665c) {
            m23743e();
            ((smg) this.f89756b).setTargetChangeType(enumC12665c);
            return this;
        }

        public C12664b setTargetChangeTypeValue(int i) {
            m23743e();
            ((smg) this.f89756b).setTargetChangeTypeValue(i);
            return this;
        }

        public C12664b setTargetIds(int i, int i2) {
            m23743e();
            ((smg) this.f89756b).setTargetIds(i, i2);
            return this;
        }

        private C12664b() {
            super(smg.DEFAULT_INSTANCE);
        }

        public C12664b setCause(m4g.C9139b c9139b) {
            m23743e();
            ((smg) this.f89756b).setCause(c9139b.build());
            return this;
        }

        public C12664b setReadTime(f2h.C5567b c5567b) {
            m23743e();
            ((smg) this.f89756b).setReadTime(c5567b.build());
            return this;
        }
    }

    /* JADX INFO: renamed from: smg$c */
    public enum EnumC12665c implements w98.InterfaceC14497d {
        NO_CHANGE(0),
        ADD(1),
        REMOVE(2),
        CURRENT(3),
        RESET(4),
        UNRECOGNIZED(-1);


        /* JADX INFO: renamed from: C */
        public static final int f82254C = 0;

        /* JADX INFO: renamed from: F */
        public static final int f82255F = 1;

        /* JADX INFO: renamed from: H */
        public static final int f82256H = 2;

        /* JADX INFO: renamed from: L */
        public static final int f82257L = 3;

        /* JADX INFO: renamed from: M */
        public static final int f82258M = 4;

        /* JADX INFO: renamed from: N */
        public static final w98.InterfaceC14498e<EnumC12665c> f82259N = new a();

        /* JADX INFO: renamed from: a */
        public final int f82267a;

        /* JADX INFO: renamed from: smg$c$a */
        public class a implements w98.InterfaceC14498e<EnumC12665c> {
            @Override // p000.w98.InterfaceC14498e
            public EnumC12665c findValueByNumber(int i) {
                return EnumC12665c.forNumber(i);
            }
        }

        /* JADX INFO: renamed from: smg$c$b */
        public static final class b implements w98.InterfaceC14499f {

            /* JADX INFO: renamed from: a */
            public static final w98.InterfaceC14499f f82268a = new b();

            private b() {
            }

            @Override // p000.w98.InterfaceC14499f
            public boolean isInRange(int i) {
                return EnumC12665c.forNumber(i) != null;
            }
        }

        EnumC12665c(int i) {
            this.f82267a = i;
        }

        public static EnumC12665c forNumber(int i) {
            if (i == 0) {
                return NO_CHANGE;
            }
            if (i == 1) {
                return ADD;
            }
            if (i == 2) {
                return REMOVE;
            }
            if (i == 3) {
                return CURRENT;
            }
            if (i != 4) {
                return null;
            }
            return RESET;
        }

        public static w98.InterfaceC14498e<EnumC12665c> internalGetValueMap() {
            return f82259N;
        }

        public static w98.InterfaceC14499f internalGetVerifier() {
            return b.f82268a;
        }

        @Override // p000.w98.InterfaceC14497d
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.f82267a;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static EnumC12665c valueOf(int i) {
            return forNumber(i);
        }
    }

    static {
        smg smgVar = new smg();
        DEFAULT_INSTANCE = smgVar;
        v27.m23715h0(smg.class, smgVar);
    }

    private smg() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllTargetIds(Iterable<? extends Integer> iterable) {
        ensureTargetIdsIsMutable();
        AbstractC1714b3.m2856b(iterable, this.targetIds_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTargetIds(int i) {
        ensureTargetIdsIsMutable();
        this.targetIds_.addInt(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCause() {
        this.cause_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReadTime() {
        this.readTime_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResumeToken() {
        this.resumeToken_ = getDefaultInstance().getResumeToken();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTargetChangeType() {
        this.targetChangeType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTargetIds() {
        this.targetIds_ = v27.m23720v();
    }

    private void ensureTargetIdsIsMutable() {
        w98.InterfaceC14501h interfaceC14501h = this.targetIds_;
        if (interfaceC14501h.isModifiable()) {
            return;
        }
        this.targetIds_ = v27.m23696N(interfaceC14501h);
    }

    public static smg getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCause(m4g m4gVar) {
        m4gVar.getClass();
        m4g m4gVar2 = this.cause_;
        if (m4gVar2 == null || m4gVar2 == m4g.getDefaultInstance()) {
            this.cause_ = m4gVar;
        } else {
            this.cause_ = m4g.newBuilder(this.cause_).mergeFrom(m4gVar).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeReadTime(f2h f2hVar) {
        f2hVar.getClass();
        f2h f2hVar2 = this.readTime_;
        if (f2hVar2 == null || f2hVar2 == f2h.getDefaultInstance()) {
            this.readTime_ = f2hVar;
        } else {
            this.readTime_ = f2h.newBuilder(this.readTime_).mergeFrom(f2hVar).buildPartial();
        }
        this.bitField0_ |= 2;
    }

    public static C12664b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    public static smg parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (smg) v27.m23700S(DEFAULT_INSTANCE, inputStream);
    }

    public static smg parseFrom(ByteBuffer byteBuffer) throws ce8 {
        return (smg) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static uhc<smg> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCause(m4g m4gVar) {
        m4gVar.getClass();
        this.cause_ = m4gVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReadTime(f2h f2hVar) {
        f2hVar.getClass();
        this.readTime_ = f2hVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResumeToken(vj1 vj1Var) {
        vj1Var.getClass();
        this.resumeToken_ = vj1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTargetChangeType(EnumC12665c enumC12665c) {
        this.targetChangeType_ = enumC12665c.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTargetChangeTypeValue(int i) {
        this.targetChangeType_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTargetIds(int i, int i2) {
        ensureTargetIdsIsMutable();
        this.targetIds_.setInt(i, i2);
    }

    @Override // p000.umg
    public m4g getCause() {
        m4g m4gVar = this.cause_;
        return m4gVar == null ? m4g.getDefaultInstance() : m4gVar;
    }

    @Override // p000.umg
    public f2h getReadTime() {
        f2h f2hVar = this.readTime_;
        return f2hVar == null ? f2h.getDefaultInstance() : f2hVar;
    }

    @Override // p000.umg
    public vj1 getResumeToken() {
        return this.resumeToken_;
    }

    @Override // p000.umg
    public EnumC12665c getTargetChangeType() {
        EnumC12665c enumC12665cForNumber = EnumC12665c.forNumber(this.targetChangeType_);
        return enumC12665cForNumber == null ? EnumC12665c.UNRECOGNIZED : enumC12665cForNumber;
    }

    @Override // p000.umg
    public int getTargetChangeTypeValue() {
        return this.targetChangeType_;
    }

    @Override // p000.umg
    public int getTargetIds(int i) {
        return this.targetIds_.getInt(i);
    }

    @Override // p000.umg
    public int getTargetIdsCount() {
        return this.targetIds_.size();
    }

    @Override // p000.umg
    public List<Integer> getTargetIdsList() {
        return this.targetIds_;
    }

    @Override // p000.umg
    public boolean hasCause() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // p000.umg
    public boolean hasReadTime() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
        C12663a c12663a = null;
        switch (C12663a.f82253a[enumC13830i.ordinal()]) {
            case 1:
                return new smg();
            case 2:
                return new C12664b(c12663a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0001\u0000\u0001\f\u0002'\u0003ဉ\u0000\u0004\n\u0006ဉ\u0001", new Object[]{"bitField0_", "targetChangeType_", "targetIds_", "cause_", "resumeToken_", "readTime_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<smg> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (smg.class) {
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

    public static C12664b newBuilder(smg smgVar) {
        return DEFAULT_INSTANCE.m23739o(smgVar);
    }

    public static smg parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (smg) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static smg parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
        return (smg) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
    }

    public static smg parseFrom(vj1 vj1Var) throws ce8 {
        return (smg) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
    }

    public static smg parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
        return (smg) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
    }

    public static smg parseFrom(byte[] bArr) throws ce8 {
        return (smg) v27.m23710c0(DEFAULT_INSTANCE, bArr);
    }

    public static smg parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
        return (smg) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
    }

    public static smg parseFrom(InputStream inputStream) throws IOException {
        return (smg) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
    }

    public static smg parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (smg) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static smg parseFrom(f72 f72Var) throws IOException {
        return (smg) v27.m23704W(DEFAULT_INSTANCE, f72Var);
    }

    public static smg parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
        return (smg) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
    }
}
