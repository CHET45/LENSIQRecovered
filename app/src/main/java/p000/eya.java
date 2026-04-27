package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import p000.ot8;
import p000.v27;
import p000.w98;

/* JADX INFO: loaded from: classes5.dex */
public final class eya extends v27<eya, C5518b> implements fya {
    private static final eya DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 3;
    public static final int DISPLAY_NAME_FIELD_NUMBER = 2;
    public static final int LABELS_FIELD_NUMBER = 4;
    public static final int LAUNCH_STAGE_FIELD_NUMBER = 7;
    public static final int NAME_FIELD_NUMBER = 5;
    private static volatile uhc<eya> PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int launchStage_;
    private String name_ = "";
    private String type_ = "";
    private String displayName_ = "";
    private String description_ = "";
    private w98.InterfaceC14504k<ot8> labels_ = v27.m23722x();

    /* JADX INFO: renamed from: eya$a */
    public static /* synthetic */ class C5517a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f34467a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f34467a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f34467a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f34467a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f34467a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f34467a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f34467a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f34467a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: eya$b */
    public static final class C5518b extends v27.AbstractC13823b<eya, C5518b> implements fya {
        public /* synthetic */ C5518b(C5517a c5517a) {
            this();
        }

        public C5518b addAllLabels(Iterable<? extends ot8> iterable) {
            m23743e();
            ((eya) this.f89756b).addAllLabels(iterable);
            return this;
        }

        public C5518b addLabels(ot8 ot8Var) {
            m23743e();
            ((eya) this.f89756b).addLabels(ot8Var);
            return this;
        }

        public C5518b clearDescription() {
            m23743e();
            ((eya) this.f89756b).clearDescription();
            return this;
        }

        public C5518b clearDisplayName() {
            m23743e();
            ((eya) this.f89756b).clearDisplayName();
            return this;
        }

        public C5518b clearLabels() {
            m23743e();
            ((eya) this.f89756b).clearLabels();
            return this;
        }

        public C5518b clearLaunchStage() {
            m23743e();
            ((eya) this.f89756b).clearLaunchStage();
            return this;
        }

        public C5518b clearName() {
            m23743e();
            ((eya) this.f89756b).clearName();
            return this;
        }

        public C5518b clearType() {
            m23743e();
            ((eya) this.f89756b).clearType();
            return this;
        }

        @Override // p000.fya
        public String getDescription() {
            return ((eya) this.f89756b).getDescription();
        }

        @Override // p000.fya
        public vj1 getDescriptionBytes() {
            return ((eya) this.f89756b).getDescriptionBytes();
        }

        @Override // p000.fya
        public String getDisplayName() {
            return ((eya) this.f89756b).getDisplayName();
        }

        @Override // p000.fya
        public vj1 getDisplayNameBytes() {
            return ((eya) this.f89756b).getDisplayNameBytes();
        }

        @Override // p000.fya
        public ot8 getLabels(int i) {
            return ((eya) this.f89756b).getLabels(i);
        }

        @Override // p000.fya
        public int getLabelsCount() {
            return ((eya) this.f89756b).getLabelsCount();
        }

        @Override // p000.fya
        public List<ot8> getLabelsList() {
            return Collections.unmodifiableList(((eya) this.f89756b).getLabelsList());
        }

        @Override // p000.fya
        public qu8 getLaunchStage() {
            return ((eya) this.f89756b).getLaunchStage();
        }

        @Override // p000.fya
        public int getLaunchStageValue() {
            return ((eya) this.f89756b).getLaunchStageValue();
        }

        @Override // p000.fya
        public String getName() {
            return ((eya) this.f89756b).getName();
        }

        @Override // p000.fya
        public vj1 getNameBytes() {
            return ((eya) this.f89756b).getNameBytes();
        }

        @Override // p000.fya
        public String getType() {
            return ((eya) this.f89756b).getType();
        }

        @Override // p000.fya
        public vj1 getTypeBytes() {
            return ((eya) this.f89756b).getTypeBytes();
        }

        public C5518b removeLabels(int i) {
            m23743e();
            ((eya) this.f89756b).removeLabels(i);
            return this;
        }

        public C5518b setDescription(String str) {
            m23743e();
            ((eya) this.f89756b).setDescription(str);
            return this;
        }

        public C5518b setDescriptionBytes(vj1 vj1Var) {
            m23743e();
            ((eya) this.f89756b).setDescriptionBytes(vj1Var);
            return this;
        }

        public C5518b setDisplayName(String str) {
            m23743e();
            ((eya) this.f89756b).setDisplayName(str);
            return this;
        }

        public C5518b setDisplayNameBytes(vj1 vj1Var) {
            m23743e();
            ((eya) this.f89756b).setDisplayNameBytes(vj1Var);
            return this;
        }

        public C5518b setLabels(int i, ot8 ot8Var) {
            m23743e();
            ((eya) this.f89756b).setLabels(i, ot8Var);
            return this;
        }

        public C5518b setLaunchStage(qu8 qu8Var) {
            m23743e();
            ((eya) this.f89756b).setLaunchStage(qu8Var);
            return this;
        }

        public C5518b setLaunchStageValue(int i) {
            m23743e();
            ((eya) this.f89756b).setLaunchStageValue(i);
            return this;
        }

        public C5518b setName(String str) {
            m23743e();
            ((eya) this.f89756b).setName(str);
            return this;
        }

        public C5518b setNameBytes(vj1 vj1Var) {
            m23743e();
            ((eya) this.f89756b).setNameBytes(vj1Var);
            return this;
        }

        public C5518b setType(String str) {
            m23743e();
            ((eya) this.f89756b).setType(str);
            return this;
        }

        public C5518b setTypeBytes(vj1 vj1Var) {
            m23743e();
            ((eya) this.f89756b).setTypeBytes(vj1Var);
            return this;
        }

        private C5518b() {
            super(eya.DEFAULT_INSTANCE);
        }

        public C5518b addLabels(int i, ot8 ot8Var) {
            m23743e();
            ((eya) this.f89756b).addLabels(i, ot8Var);
            return this;
        }

        public C5518b setLabels(int i, ot8.C10651b c10651b) {
            m23743e();
            ((eya) this.f89756b).setLabels(i, c10651b.build());
            return this;
        }

        public C5518b addLabels(ot8.C10651b c10651b) {
            m23743e();
            ((eya) this.f89756b).addLabels(c10651b.build());
            return this;
        }

        public C5518b addLabels(int i, ot8.C10651b c10651b) {
            m23743e();
            ((eya) this.f89756b).addLabels(i, c10651b.build());
            return this;
        }
    }

    static {
        eya eyaVar = new eya();
        DEFAULT_INSTANCE = eyaVar;
        v27.m23715h0(eya.class, eyaVar);
    }

    private eya() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllLabels(Iterable<? extends ot8> iterable) {
        ensureLabelsIsMutable();
        AbstractC1714b3.m2856b(iterable, this.labels_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLabels(ot8 ot8Var) {
        ot8Var.getClass();
        ensureLabelsIsMutable();
        this.labels_.add(ot8Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDescription() {
        this.description_ = getDefaultInstance().getDescription();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDisplayName() {
        this.displayName_ = getDefaultInstance().getDisplayName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLabels() {
        this.labels_ = v27.m23722x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLaunchStage() {
        this.launchStage_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = getDefaultInstance().getType();
    }

    private void ensureLabelsIsMutable() {
        w98.InterfaceC14504k<ot8> interfaceC14504k = this.labels_;
        if (interfaceC14504k.isModifiable()) {
            return;
        }
        this.labels_ = v27.m23698P(interfaceC14504k);
    }

    public static eya getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C5518b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    public static eya parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (eya) v27.m23700S(DEFAULT_INSTANCE, inputStream);
    }

    public static eya parseFrom(ByteBuffer byteBuffer) throws ce8 {
        return (eya) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static uhc<eya> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeLabels(int i) {
        ensureLabelsIsMutable();
        this.labels_.remove(i);
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
    public void setDisplayName(String str) {
        str.getClass();
        this.displayName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisplayNameBytes(vj1 vj1Var) {
        AbstractC1714b3.m2857c(vj1Var);
        this.displayName_ = vj1Var.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLabels(int i, ot8 ot8Var) {
        ot8Var.getClass();
        ensureLabelsIsMutable();
        this.labels_.set(i, ot8Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLaunchStage(qu8 qu8Var) {
        this.launchStage_ = qu8Var.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLaunchStageValue(int i) {
        this.launchStage_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(vj1 vj1Var) {
        AbstractC1714b3.m2857c(vj1Var);
        this.name_ = vj1Var.toStringUtf8();
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

    @Override // p000.fya
    public String getDescription() {
        return this.description_;
    }

    @Override // p000.fya
    public vj1 getDescriptionBytes() {
        return vj1.copyFromUtf8(this.description_);
    }

    @Override // p000.fya
    public String getDisplayName() {
        return this.displayName_;
    }

    @Override // p000.fya
    public vj1 getDisplayNameBytes() {
        return vj1.copyFromUtf8(this.displayName_);
    }

    @Override // p000.fya
    public ot8 getLabels(int i) {
        return this.labels_.get(i);
    }

    @Override // p000.fya
    public int getLabelsCount() {
        return this.labels_.size();
    }

    @Override // p000.fya
    public List<ot8> getLabelsList() {
        return this.labels_;
    }

    public pt8 getLabelsOrBuilder(int i) {
        return this.labels_.get(i);
    }

    public List<? extends pt8> getLabelsOrBuilderList() {
        return this.labels_;
    }

    @Override // p000.fya
    public qu8 getLaunchStage() {
        qu8 qu8VarForNumber = qu8.forNumber(this.launchStage_);
        return qu8VarForNumber == null ? qu8.UNRECOGNIZED : qu8VarForNumber;
    }

    @Override // p000.fya
    public int getLaunchStageValue() {
        return this.launchStage_;
    }

    @Override // p000.fya
    public String getName() {
        return this.name_;
    }

    @Override // p000.fya
    public vj1 getNameBytes() {
        return vj1.copyFromUtf8(this.name_);
    }

    @Override // p000.fya
    public String getType() {
        return this.type_;
    }

    @Override // p000.fya
    public vj1 getTypeBytes() {
        return vj1.copyFromUtf8(this.type_);
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
        C5517a c5517a = null;
        switch (C5517a.f34467a[enumC13830i.ordinal()]) {
            case 1:
                return new eya();
            case 2:
                return new C5518b(c5517a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0007\u0006\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\u001b\u0005Ȉ\u0007\f", new Object[]{"type_", "displayName_", "description_", "labels_", ot8.class, "name_", "launchStage_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<eya> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (eya.class) {
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

    public static C5518b newBuilder(eya eyaVar) {
        return DEFAULT_INSTANCE.m23739o(eyaVar);
    }

    public static eya parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (eya) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static eya parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
        return (eya) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
    }

    public static eya parseFrom(vj1 vj1Var) throws ce8 {
        return (eya) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLabels(int i, ot8 ot8Var) {
        ot8Var.getClass();
        ensureLabelsIsMutable();
        this.labels_.add(i, ot8Var);
    }

    public static eya parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
        return (eya) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
    }

    public static eya parseFrom(byte[] bArr) throws ce8 {
        return (eya) v27.m23710c0(DEFAULT_INSTANCE, bArr);
    }

    public static eya parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
        return (eya) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
    }

    public static eya parseFrom(InputStream inputStream) throws IOException {
        return (eya) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
    }

    public static eya parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (eya) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static eya parseFrom(f72 f72Var) throws IOException {
        return (eya) v27.m23704W(DEFAULT_INSTANCE, f72Var);
    }

    public static eya parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
        return (eya) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
    }
}
