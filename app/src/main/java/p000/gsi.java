package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p000.hpi;
import p000.v27;
import p000.w98;
import p000.yri;

/* JADX INFO: loaded from: classes5.dex */
public final class gsi extends v27<gsi, C6489b> implements hsi {
    public static final int DATABASE_FIELD_NUMBER = 1;
    private static final gsi DEFAULT_INSTANCE;
    public static final int LABELS_FIELD_NUMBER = 5;
    private static volatile uhc<gsi> PARSER = null;
    public static final int STREAM_ID_FIELD_NUMBER = 2;
    public static final int STREAM_TOKEN_FIELD_NUMBER = 4;
    public static final int WRITES_FIELD_NUMBER = 3;
    private ss9<String, String> labels_ = ss9.emptyMapField();
    private String database_ = "";
    private String streamId_ = "";
    private w98.InterfaceC14504k<yri> writes_ = v27.m23722x();
    private vj1 streamToken_ = vj1.f91344e;

    /* JADX INFO: renamed from: gsi$a */
    public static /* synthetic */ class C6488a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f40954a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f40954a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f40954a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f40954a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f40954a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f40954a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f40954a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f40954a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: gsi$b */
    public static final class C6489b extends v27.AbstractC13823b<gsi, C6489b> implements hsi {
        public /* synthetic */ C6489b(C6488a c6488a) {
            this();
        }

        public C6489b addAllWrites(Iterable<? extends yri> iterable) {
            m23743e();
            ((gsi) this.f89756b).addAllWrites(iterable);
            return this;
        }

        public C6489b addWrites(yri yriVar) {
            m23743e();
            ((gsi) this.f89756b).addWrites(yriVar);
            return this;
        }

        public C6489b clearDatabase() {
            m23743e();
            ((gsi) this.f89756b).clearDatabase();
            return this;
        }

        public C6489b clearLabels() {
            m23743e();
            ((gsi) this.f89756b).getMutableLabelsMap().clear();
            return this;
        }

        public C6489b clearStreamId() {
            m23743e();
            ((gsi) this.f89756b).clearStreamId();
            return this;
        }

        public C6489b clearStreamToken() {
            m23743e();
            ((gsi) this.f89756b).clearStreamToken();
            return this;
        }

        public C6489b clearWrites() {
            m23743e();
            ((gsi) this.f89756b).clearWrites();
            return this;
        }

        @Override // p000.hsi
        public boolean containsLabels(String str) {
            str.getClass();
            return ((gsi) this.f89756b).getLabelsMap().containsKey(str);
        }

        @Override // p000.hsi
        public String getDatabase() {
            return ((gsi) this.f89756b).getDatabase();
        }

        @Override // p000.hsi
        public vj1 getDatabaseBytes() {
            return ((gsi) this.f89756b).getDatabaseBytes();
        }

        @Override // p000.hsi
        @Deprecated
        public Map<String, String> getLabels() {
            return getLabelsMap();
        }

        @Override // p000.hsi
        public int getLabelsCount() {
            return ((gsi) this.f89756b).getLabelsMap().size();
        }

        @Override // p000.hsi
        public Map<String, String> getLabelsMap() {
            return Collections.unmodifiableMap(((gsi) this.f89756b).getLabelsMap());
        }

        @Override // p000.hsi
        public String getLabelsOrDefault(String str, String str2) {
            str.getClass();
            Map<String, String> labelsMap = ((gsi) this.f89756b).getLabelsMap();
            return labelsMap.containsKey(str) ? labelsMap.get(str) : str2;
        }

        @Override // p000.hsi
        public String getLabelsOrThrow(String str) {
            str.getClass();
            Map<String, String> labelsMap = ((gsi) this.f89756b).getLabelsMap();
            if (labelsMap.containsKey(str)) {
                return labelsMap.get(str);
            }
            throw new IllegalArgumentException();
        }

        @Override // p000.hsi
        public String getStreamId() {
            return ((gsi) this.f89756b).getStreamId();
        }

        @Override // p000.hsi
        public vj1 getStreamIdBytes() {
            return ((gsi) this.f89756b).getStreamIdBytes();
        }

        @Override // p000.hsi
        public vj1 getStreamToken() {
            return ((gsi) this.f89756b).getStreamToken();
        }

        @Override // p000.hsi
        public yri getWrites(int i) {
            return ((gsi) this.f89756b).getWrites(i);
        }

        @Override // p000.hsi
        public int getWritesCount() {
            return ((gsi) this.f89756b).getWritesCount();
        }

        @Override // p000.hsi
        public List<yri> getWritesList() {
            return Collections.unmodifiableList(((gsi) this.f89756b).getWritesList());
        }

        public C6489b putAllLabels(Map<String, String> map) {
            m23743e();
            ((gsi) this.f89756b).getMutableLabelsMap().putAll(map);
            return this;
        }

        public C6489b putLabels(String str, String str2) {
            str.getClass();
            str2.getClass();
            m23743e();
            ((gsi) this.f89756b).getMutableLabelsMap().put(str, str2);
            return this;
        }

        public C6489b removeLabels(String str) {
            str.getClass();
            m23743e();
            ((gsi) this.f89756b).getMutableLabelsMap().remove(str);
            return this;
        }

        public C6489b removeWrites(int i) {
            m23743e();
            ((gsi) this.f89756b).removeWrites(i);
            return this;
        }

        public C6489b setDatabase(String str) {
            m23743e();
            ((gsi) this.f89756b).setDatabase(str);
            return this;
        }

        public C6489b setDatabaseBytes(vj1 vj1Var) {
            m23743e();
            ((gsi) this.f89756b).setDatabaseBytes(vj1Var);
            return this;
        }

        public C6489b setStreamId(String str) {
            m23743e();
            ((gsi) this.f89756b).setStreamId(str);
            return this;
        }

        public C6489b setStreamIdBytes(vj1 vj1Var) {
            m23743e();
            ((gsi) this.f89756b).setStreamIdBytes(vj1Var);
            return this;
        }

        public C6489b setStreamToken(vj1 vj1Var) {
            m23743e();
            ((gsi) this.f89756b).setStreamToken(vj1Var);
            return this;
        }

        public C6489b setWrites(int i, yri yriVar) {
            m23743e();
            ((gsi) this.f89756b).setWrites(i, yriVar);
            return this;
        }

        private C6489b() {
            super(gsi.DEFAULT_INSTANCE);
        }

        public C6489b addWrites(int i, yri yriVar) {
            m23743e();
            ((gsi) this.f89756b).addWrites(i, yriVar);
            return this;
        }

        public C6489b setWrites(int i, yri.C15790b c15790b) {
            m23743e();
            ((gsi) this.f89756b).setWrites(i, c15790b.build());
            return this;
        }

        public C6489b addWrites(yri.C15790b c15790b) {
            m23743e();
            ((gsi) this.f89756b).addWrites(c15790b.build());
            return this;
        }

        public C6489b addWrites(int i, yri.C15790b c15790b) {
            m23743e();
            ((gsi) this.f89756b).addWrites(i, c15790b.build());
            return this;
        }
    }

    /* JADX INFO: renamed from: gsi$c */
    public static final class C6490c {

        /* JADX INFO: renamed from: a */
        public static final os9<String, String> f40955a;

        static {
            hpi.EnumC6968b enumC6968b = hpi.EnumC6968b.f44485L;
            f40955a = os9.newDefaultInstance(enumC6968b, "", enumC6968b, "");
        }

        private C6490c() {
        }
    }

    static {
        gsi gsiVar = new gsi();
        DEFAULT_INSTANCE = gsiVar;
        v27.m23715h0(gsi.class, gsiVar);
    }

    private gsi() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllWrites(Iterable<? extends yri> iterable) {
        ensureWritesIsMutable();
        AbstractC1714b3.m2856b(iterable, this.writes_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addWrites(yri yriVar) {
        yriVar.getClass();
        ensureWritesIsMutable();
        this.writes_.add(yriVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDatabase() {
        this.database_ = getDefaultInstance().getDatabase();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStreamId() {
        this.streamId_ = getDefaultInstance().getStreamId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStreamToken() {
        this.streamToken_ = getDefaultInstance().getStreamToken();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWrites() {
        this.writes_ = v27.m23722x();
    }

    private void ensureWritesIsMutable() {
        w98.InterfaceC14504k<yri> interfaceC14504k = this.writes_;
        if (interfaceC14504k.isModifiable()) {
            return;
        }
        this.writes_ = v27.m23698P(interfaceC14504k);
    }

    public static gsi getDefaultInstance() {
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

    public static C6489b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    public static gsi parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (gsi) v27.m23700S(DEFAULT_INSTANCE, inputStream);
    }

    public static gsi parseFrom(ByteBuffer byteBuffer) throws ce8 {
        return (gsi) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static uhc<gsi> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeWrites(int i) {
        ensureWritesIsMutable();
        this.writes_.remove(i);
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
    public void setStreamId(String str) {
        str.getClass();
        this.streamId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStreamIdBytes(vj1 vj1Var) {
        AbstractC1714b3.m2857c(vj1Var);
        this.streamId_ = vj1Var.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStreamToken(vj1 vj1Var) {
        vj1Var.getClass();
        this.streamToken_ = vj1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWrites(int i, yri yriVar) {
        yriVar.getClass();
        ensureWritesIsMutable();
        this.writes_.set(i, yriVar);
    }

    @Override // p000.hsi
    public boolean containsLabels(String str) {
        str.getClass();
        return internalGetLabels().containsKey(str);
    }

    @Override // p000.hsi
    public String getDatabase() {
        return this.database_;
    }

    @Override // p000.hsi
    public vj1 getDatabaseBytes() {
        return vj1.copyFromUtf8(this.database_);
    }

    @Override // p000.hsi
    @Deprecated
    public Map<String, String> getLabels() {
        return getLabelsMap();
    }

    @Override // p000.hsi
    public int getLabelsCount() {
        return internalGetLabels().size();
    }

    @Override // p000.hsi
    public Map<String, String> getLabelsMap() {
        return Collections.unmodifiableMap(internalGetLabels());
    }

    @Override // p000.hsi
    public String getLabelsOrDefault(String str, String str2) {
        str.getClass();
        ss9<String, String> ss9VarInternalGetLabels = internalGetLabels();
        return ss9VarInternalGetLabels.containsKey(str) ? ss9VarInternalGetLabels.get(str) : str2;
    }

    @Override // p000.hsi
    public String getLabelsOrThrow(String str) {
        str.getClass();
        ss9<String, String> ss9VarInternalGetLabels = internalGetLabels();
        if (ss9VarInternalGetLabels.containsKey(str)) {
            return ss9VarInternalGetLabels.get(str);
        }
        throw new IllegalArgumentException();
    }

    @Override // p000.hsi
    public String getStreamId() {
        return this.streamId_;
    }

    @Override // p000.hsi
    public vj1 getStreamIdBytes() {
        return vj1.copyFromUtf8(this.streamId_);
    }

    @Override // p000.hsi
    public vj1 getStreamToken() {
        return this.streamToken_;
    }

    @Override // p000.hsi
    public yri getWrites(int i) {
        return this.writes_.get(i);
    }

    @Override // p000.hsi
    public int getWritesCount() {
        return this.writes_.size();
    }

    @Override // p000.hsi
    public List<yri> getWritesList() {
        return this.writes_;
    }

    public esi getWritesOrBuilder(int i) {
        return this.writes_.get(i);
    }

    public List<? extends esi> getWritesOrBuilderList() {
        return this.writes_;
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
        C6488a c6488a = null;
        switch (C6488a.f40954a[enumC13830i.ordinal()]) {
            case 1:
                return new gsi();
            case 2:
                return new C6489b(c6488a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0001\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\u001b\u0004\n\u00052", new Object[]{"database_", "streamId_", "writes_", yri.class, "streamToken_", "labels_", C6490c.f40955a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<gsi> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (gsi.class) {
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

    public static C6489b newBuilder(gsi gsiVar) {
        return DEFAULT_INSTANCE.m23739o(gsiVar);
    }

    public static gsi parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (gsi) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static gsi parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
        return (gsi) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
    }

    public static gsi parseFrom(vj1 vj1Var) throws ce8 {
        return (gsi) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addWrites(int i, yri yriVar) {
        yriVar.getClass();
        ensureWritesIsMutable();
        this.writes_.add(i, yriVar);
    }

    public static gsi parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
        return (gsi) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
    }

    public static gsi parseFrom(byte[] bArr) throws ce8 {
        return (gsi) v27.m23710c0(DEFAULT_INSTANCE, bArr);
    }

    public static gsi parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
        return (gsi) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
    }

    public static gsi parseFrom(InputStream inputStream) throws IOException {
        return (gsi) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
    }

    public static gsi parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (gsi) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static gsi parseFrom(f72 f72Var) throws IOException {
        return (gsi) v27.m23704W(DEFAULT_INSTANCE, f72Var);
    }

    public static gsi parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
        return (gsi) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
    }
}
