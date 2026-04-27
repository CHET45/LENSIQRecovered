package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;
import p000.hpi;
import p000.mmg;
import p000.v27;

/* JADX INFO: loaded from: classes5.dex */
public final class da9 extends v27<da9, C4700b> implements ea9 {
    public static final int ADD_TARGET_FIELD_NUMBER = 2;
    public static final int DATABASE_FIELD_NUMBER = 1;
    private static final da9 DEFAULT_INSTANCE;
    public static final int LABELS_FIELD_NUMBER = 4;
    private static volatile uhc<da9> PARSER = null;
    public static final int REMOVE_TARGET_FIELD_NUMBER = 3;
    private Object targetChange_;
    private int targetChangeCase_ = 0;
    private ss9<String, String> labels_ = ss9.emptyMapField();
    private String database_ = "";

    /* JADX INFO: renamed from: da9$a */
    public static /* synthetic */ class C4699a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f29066a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f29066a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29066a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f29066a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f29066a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f29066a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f29066a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f29066a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: da9$b */
    public static final class C4700b extends v27.AbstractC13823b<da9, C4700b> implements ea9 {
        public /* synthetic */ C4700b(C4699a c4699a) {
            this();
        }

        public C4700b clearAddTarget() {
            m23743e();
            ((da9) this.f89756b).clearAddTarget();
            return this;
        }

        public C4700b clearDatabase() {
            m23743e();
            ((da9) this.f89756b).clearDatabase();
            return this;
        }

        public C4700b clearLabels() {
            m23743e();
            ((da9) this.f89756b).getMutableLabelsMap().clear();
            return this;
        }

        public C4700b clearRemoveTarget() {
            m23743e();
            ((da9) this.f89756b).clearRemoveTarget();
            return this;
        }

        public C4700b clearTargetChange() {
            m23743e();
            ((da9) this.f89756b).clearTargetChange();
            return this;
        }

        @Override // p000.ea9
        public boolean containsLabels(String str) {
            str.getClass();
            return ((da9) this.f89756b).getLabelsMap().containsKey(str);
        }

        @Override // p000.ea9
        public mmg getAddTarget() {
            return ((da9) this.f89756b).getAddTarget();
        }

        @Override // p000.ea9
        public String getDatabase() {
            return ((da9) this.f89756b).getDatabase();
        }

        @Override // p000.ea9
        public vj1 getDatabaseBytes() {
            return ((da9) this.f89756b).getDatabaseBytes();
        }

        @Override // p000.ea9
        @Deprecated
        public Map<String, String> getLabels() {
            return getLabelsMap();
        }

        @Override // p000.ea9
        public int getLabelsCount() {
            return ((da9) this.f89756b).getLabelsMap().size();
        }

        @Override // p000.ea9
        public Map<String, String> getLabelsMap() {
            return Collections.unmodifiableMap(((da9) this.f89756b).getLabelsMap());
        }

        @Override // p000.ea9
        public String getLabelsOrDefault(String str, String str2) {
            str.getClass();
            Map<String, String> labelsMap = ((da9) this.f89756b).getLabelsMap();
            return labelsMap.containsKey(str) ? labelsMap.get(str) : str2;
        }

        @Override // p000.ea9
        public String getLabelsOrThrow(String str) {
            str.getClass();
            Map<String, String> labelsMap = ((da9) this.f89756b).getLabelsMap();
            if (labelsMap.containsKey(str)) {
                return labelsMap.get(str);
            }
            throw new IllegalArgumentException();
        }

        @Override // p000.ea9
        public int getRemoveTarget() {
            return ((da9) this.f89756b).getRemoveTarget();
        }

        @Override // p000.ea9
        public EnumC4702d getTargetChangeCase() {
            return ((da9) this.f89756b).getTargetChangeCase();
        }

        @Override // p000.ea9
        public boolean hasAddTarget() {
            return ((da9) this.f89756b).hasAddTarget();
        }

        @Override // p000.ea9
        public boolean hasRemoveTarget() {
            return ((da9) this.f89756b).hasRemoveTarget();
        }

        public C4700b mergeAddTarget(mmg mmgVar) {
            m23743e();
            ((da9) this.f89756b).mergeAddTarget(mmgVar);
            return this;
        }

        public C4700b putAllLabels(Map<String, String> map) {
            m23743e();
            ((da9) this.f89756b).getMutableLabelsMap().putAll(map);
            return this;
        }

        public C4700b putLabels(String str, String str2) {
            str.getClass();
            str2.getClass();
            m23743e();
            ((da9) this.f89756b).getMutableLabelsMap().put(str, str2);
            return this;
        }

        public C4700b removeLabels(String str) {
            str.getClass();
            m23743e();
            ((da9) this.f89756b).getMutableLabelsMap().remove(str);
            return this;
        }

        public C4700b setAddTarget(mmg mmgVar) {
            m23743e();
            ((da9) this.f89756b).setAddTarget(mmgVar);
            return this;
        }

        public C4700b setDatabase(String str) {
            m23743e();
            ((da9) this.f89756b).setDatabase(str);
            return this;
        }

        public C4700b setDatabaseBytes(vj1 vj1Var) {
            m23743e();
            ((da9) this.f89756b).setDatabaseBytes(vj1Var);
            return this;
        }

        public C4700b setRemoveTarget(int i) {
            m23743e();
            ((da9) this.f89756b).setRemoveTarget(i);
            return this;
        }

        private C4700b() {
            super(da9.DEFAULT_INSTANCE);
        }

        public C4700b setAddTarget(mmg.C9416b c9416b) {
            m23743e();
            ((da9) this.f89756b).setAddTarget(c9416b.build());
            return this;
        }
    }

    /* JADX INFO: renamed from: da9$c */
    public static final class C4701c {

        /* JADX INFO: renamed from: a */
        public static final os9<String, String> f29067a;

        static {
            hpi.EnumC6968b enumC6968b = hpi.EnumC6968b.f44485L;
            f29067a = os9.newDefaultInstance(enumC6968b, "", enumC6968b, "");
        }

        private C4701c() {
        }
    }

    /* JADX INFO: renamed from: da9$d */
    public enum EnumC4702d {
        ADD_TARGET(2),
        REMOVE_TARGET(3),
        TARGETCHANGE_NOT_SET(0);


        /* JADX INFO: renamed from: a */
        public final int f29072a;

        EnumC4702d(int i) {
            this.f29072a = i;
        }

        public static EnumC4702d forNumber(int i) {
            if (i == 0) {
                return TARGETCHANGE_NOT_SET;
            }
            if (i == 2) {
                return ADD_TARGET;
            }
            if (i != 3) {
                return null;
            }
            return REMOVE_TARGET;
        }

        public int getNumber() {
            return this.f29072a;
        }

        @Deprecated
        public static EnumC4702d valueOf(int i) {
            return forNumber(i);
        }
    }

    static {
        da9 da9Var = new da9();
        DEFAULT_INSTANCE = da9Var;
        v27.m23715h0(da9.class, da9Var);
    }

    private da9() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAddTarget() {
        if (this.targetChangeCase_ == 2) {
            this.targetChangeCase_ = 0;
            this.targetChange_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDatabase() {
        this.database_ = getDefaultInstance().getDatabase();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRemoveTarget() {
        if (this.targetChangeCase_ == 3) {
            this.targetChangeCase_ = 0;
            this.targetChange_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTargetChange() {
        this.targetChangeCase_ = 0;
        this.targetChange_ = null;
    }

    public static da9 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> getMutableLabelsMap() {
        return internalGetMutableLabels();
    }

    private ss9<String, String> internalGetLabels() {
        return this.labels_;
    }

    private ss9<String, String> internalGetMutableLabels() {
        if (!this.labels_.isMutable()) {
            this.labels_ = this.labels_.mutableCopy();
        }
        return this.labels_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAddTarget(mmg mmgVar) {
        mmgVar.getClass();
        if (this.targetChangeCase_ != 2 || this.targetChange_ == mmg.getDefaultInstance()) {
            this.targetChange_ = mmgVar;
        } else {
            this.targetChange_ = mmg.newBuilder((mmg) this.targetChange_).mergeFrom(mmgVar).buildPartial();
        }
        this.targetChangeCase_ = 2;
    }

    public static C4700b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    public static da9 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (da9) v27.m23700S(DEFAULT_INSTANCE, inputStream);
    }

    public static da9 parseFrom(ByteBuffer byteBuffer) throws ce8 {
        return (da9) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static uhc<da9> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAddTarget(mmg mmgVar) {
        mmgVar.getClass();
        this.targetChange_ = mmgVar;
        this.targetChangeCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDatabase(String str) {
        str.getClass();
        this.database_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDatabaseBytes(vj1 vj1Var) {
        AbstractC1714b3.m2857c(vj1Var);
        this.database_ = vj1Var.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRemoveTarget(int i) {
        this.targetChangeCase_ = 3;
        this.targetChange_ = Integer.valueOf(i);
    }

    @Override // p000.ea9
    public boolean containsLabels(String str) {
        str.getClass();
        return internalGetLabels().containsKey(str);
    }

    @Override // p000.ea9
    public mmg getAddTarget() {
        return this.targetChangeCase_ == 2 ? (mmg) this.targetChange_ : mmg.getDefaultInstance();
    }

    @Override // p000.ea9
    public String getDatabase() {
        return this.database_;
    }

    @Override // p000.ea9
    public vj1 getDatabaseBytes() {
        return vj1.copyFromUtf8(this.database_);
    }

    @Override // p000.ea9
    @Deprecated
    public Map<String, String> getLabels() {
        return getLabelsMap();
    }

    @Override // p000.ea9
    public int getLabelsCount() {
        return internalGetLabels().size();
    }

    @Override // p000.ea9
    public Map<String, String> getLabelsMap() {
        return Collections.unmodifiableMap(internalGetLabels());
    }

    @Override // p000.ea9
    public String getLabelsOrDefault(String str, String str2) {
        str.getClass();
        ss9<String, String> ss9VarInternalGetLabels = internalGetLabels();
        return ss9VarInternalGetLabels.containsKey(str) ? ss9VarInternalGetLabels.get(str) : str2;
    }

    @Override // p000.ea9
    public String getLabelsOrThrow(String str) {
        str.getClass();
        ss9<String, String> ss9VarInternalGetLabels = internalGetLabels();
        if (ss9VarInternalGetLabels.containsKey(str)) {
            return ss9VarInternalGetLabels.get(str);
        }
        throw new IllegalArgumentException();
    }

    @Override // p000.ea9
    public int getRemoveTarget() {
        if (this.targetChangeCase_ == 3) {
            return ((Integer) this.targetChange_).intValue();
        }
        return 0;
    }

    @Override // p000.ea9
    public EnumC4702d getTargetChangeCase() {
        return EnumC4702d.forNumber(this.targetChangeCase_);
    }

    @Override // p000.ea9
    public boolean hasAddTarget() {
        return this.targetChangeCase_ == 2;
    }

    @Override // p000.ea9
    public boolean hasRemoveTarget() {
        return this.targetChangeCase_ == 3;
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
        C4699a c4699a = null;
        switch (C4699a.f29066a[enumC13830i.ordinal()]) {
            case 1:
                return new da9();
            case 2:
                return new C4700b(c4699a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0001Ȉ\u0002<\u0000\u00037\u0000\u00042", new Object[]{"targetChange_", "targetChangeCase_", "database_", mmg.class, "labels_", C4701c.f29067a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<da9> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (da9.class) {
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

    public static C4700b newBuilder(da9 da9Var) {
        return DEFAULT_INSTANCE.m23739o(da9Var);
    }

    public static da9 parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (da9) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static da9 parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
        return (da9) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
    }

    public static da9 parseFrom(vj1 vj1Var) throws ce8 {
        return (da9) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
    }

    public static da9 parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
        return (da9) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
    }

    public static da9 parseFrom(byte[] bArr) throws ce8 {
        return (da9) v27.m23710c0(DEFAULT_INSTANCE, bArr);
    }

    public static da9 parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
        return (da9) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
    }

    public static da9 parseFrom(InputStream inputStream) throws IOException {
        return (da9) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
    }

    public static da9 parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (da9) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static da9 parseFrom(f72 f72Var) throws IOException {
        return (da9) v27.m23704W(DEFAULT_INSTANCE, f72Var);
    }

    public static da9 parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
        return (da9) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
    }
}
