package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;
import p000.hpi;
import p000.pag;
import p000.v27;

/* JADX INFO: loaded from: classes5.dex */
public final class gya extends v27<gya, C6656b> implements hya {
    private static final gya DEFAULT_INSTANCE;
    private static volatile uhc<gya> PARSER = null;
    public static final int SYSTEM_LABELS_FIELD_NUMBER = 1;
    public static final int USER_LABELS_FIELD_NUMBER = 2;
    private int bitField0_;
    private pag systemLabels_;
    private ss9<String, String> userLabels_ = ss9.emptyMapField();

    /* JADX INFO: renamed from: gya$a */
    public static /* synthetic */ class C6655a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f41824a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f41824a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f41824a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f41824a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f41824a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f41824a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f41824a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f41824a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: gya$b */
    public static final class C6656b extends v27.AbstractC13823b<gya, C6656b> implements hya {
        public /* synthetic */ C6656b(C6655a c6655a) {
            this();
        }

        public C6656b clearSystemLabels() {
            m23743e();
            ((gya) this.f89756b).clearSystemLabels();
            return this;
        }

        public C6656b clearUserLabels() {
            m23743e();
            ((gya) this.f89756b).getMutableUserLabelsMap().clear();
            return this;
        }

        @Override // p000.hya
        public boolean containsUserLabels(String str) {
            str.getClass();
            return ((gya) this.f89756b).getUserLabelsMap().containsKey(str);
        }

        @Override // p000.hya
        public pag getSystemLabels() {
            return ((gya) this.f89756b).getSystemLabels();
        }

        @Override // p000.hya
        @Deprecated
        public Map<String, String> getUserLabels() {
            return getUserLabelsMap();
        }

        @Override // p000.hya
        public int getUserLabelsCount() {
            return ((gya) this.f89756b).getUserLabelsMap().size();
        }

        @Override // p000.hya
        public Map<String, String> getUserLabelsMap() {
            return Collections.unmodifiableMap(((gya) this.f89756b).getUserLabelsMap());
        }

        @Override // p000.hya
        public String getUserLabelsOrDefault(String str, String str2) {
            str.getClass();
            Map<String, String> userLabelsMap = ((gya) this.f89756b).getUserLabelsMap();
            return userLabelsMap.containsKey(str) ? userLabelsMap.get(str) : str2;
        }

        @Override // p000.hya
        public String getUserLabelsOrThrow(String str) {
            str.getClass();
            Map<String, String> userLabelsMap = ((gya) this.f89756b).getUserLabelsMap();
            if (userLabelsMap.containsKey(str)) {
                return userLabelsMap.get(str);
            }
            throw new IllegalArgumentException();
        }

        @Override // p000.hya
        public boolean hasSystemLabels() {
            return ((gya) this.f89756b).hasSystemLabels();
        }

        public C6656b mergeSystemLabels(pag pagVar) {
            m23743e();
            ((gya) this.f89756b).mergeSystemLabels(pagVar);
            return this;
        }

        public C6656b putAllUserLabels(Map<String, String> map) {
            m23743e();
            ((gya) this.f89756b).getMutableUserLabelsMap().putAll(map);
            return this;
        }

        public C6656b putUserLabels(String str, String str2) {
            str.getClass();
            str2.getClass();
            m23743e();
            ((gya) this.f89756b).getMutableUserLabelsMap().put(str, str2);
            return this;
        }

        public C6656b removeUserLabels(String str) {
            str.getClass();
            m23743e();
            ((gya) this.f89756b).getMutableUserLabelsMap().remove(str);
            return this;
        }

        public C6656b setSystemLabels(pag pagVar) {
            m23743e();
            ((gya) this.f89756b).setSystemLabels(pagVar);
            return this;
        }

        private C6656b() {
            super(gya.DEFAULT_INSTANCE);
        }

        public C6656b setSystemLabels(pag.C10875b c10875b) {
            m23743e();
            ((gya) this.f89756b).setSystemLabels(c10875b.build());
            return this;
        }
    }

    /* JADX INFO: renamed from: gya$c */
    public static final class C6657c {

        /* JADX INFO: renamed from: a */
        public static final os9<String, String> f41825a;

        static {
            hpi.EnumC6968b enumC6968b = hpi.EnumC6968b.f44485L;
            f41825a = os9.newDefaultInstance(enumC6968b, "", enumC6968b, "");
        }

        private C6657c() {
        }
    }

    static {
        gya gyaVar = new gya();
        DEFAULT_INSTANCE = gyaVar;
        v27.m23715h0(gya.class, gyaVar);
    }

    private gya() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSystemLabels() {
        this.systemLabels_ = null;
        this.bitField0_ &= -2;
    }

    public static gya getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> getMutableUserLabelsMap() {
        return internalGetMutableUserLabels();
    }

    private ss9<String, String> internalGetMutableUserLabels() {
        if (!this.userLabels_.isMutable()) {
            this.userLabels_ = this.userLabels_.mutableCopy();
        }
        return this.userLabels_;
    }

    private ss9<String, String> internalGetUserLabels() {
        return this.userLabels_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSystemLabels(pag pagVar) {
        pagVar.getClass();
        pag pagVar2 = this.systemLabels_;
        if (pagVar2 == null || pagVar2 == pag.getDefaultInstance()) {
            this.systemLabels_ = pagVar;
        } else {
            this.systemLabels_ = pag.newBuilder(this.systemLabels_).mergeFrom(pagVar).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static C6656b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    public static gya parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (gya) v27.m23700S(DEFAULT_INSTANCE, inputStream);
    }

    public static gya parseFrom(ByteBuffer byteBuffer) throws ce8 {
        return (gya) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static uhc<gya> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSystemLabels(pag pagVar) {
        pagVar.getClass();
        this.systemLabels_ = pagVar;
        this.bitField0_ |= 1;
    }

    @Override // p000.hya
    public boolean containsUserLabels(String str) {
        str.getClass();
        return internalGetUserLabels().containsKey(str);
    }

    @Override // p000.hya
    public pag getSystemLabels() {
        pag pagVar = this.systemLabels_;
        return pagVar == null ? pag.getDefaultInstance() : pagVar;
    }

    @Override // p000.hya
    @Deprecated
    public Map<String, String> getUserLabels() {
        return getUserLabelsMap();
    }

    @Override // p000.hya
    public int getUserLabelsCount() {
        return internalGetUserLabels().size();
    }

    @Override // p000.hya
    public Map<String, String> getUserLabelsMap() {
        return Collections.unmodifiableMap(internalGetUserLabels());
    }

    @Override // p000.hya
    public String getUserLabelsOrDefault(String str, String str2) {
        str.getClass();
        ss9<String, String> ss9VarInternalGetUserLabels = internalGetUserLabels();
        return ss9VarInternalGetUserLabels.containsKey(str) ? ss9VarInternalGetUserLabels.get(str) : str2;
    }

    @Override // p000.hya
    public String getUserLabelsOrThrow(String str) {
        str.getClass();
        ss9<String, String> ss9VarInternalGetUserLabels = internalGetUserLabels();
        if (ss9VarInternalGetUserLabels.containsKey(str)) {
            return ss9VarInternalGetUserLabels.get(str);
        }
        throw new IllegalArgumentException();
    }

    @Override // p000.hya
    public boolean hasSystemLabels() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
        C6655a c6655a = null;
        switch (C6655a.f41824a[enumC13830i.ordinal()]) {
            case 1:
                return new gya();
            case 2:
                return new C6656b(c6655a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0001\u0000\u0000\u0001ဉ\u0000\u00022", new Object[]{"bitField0_", "systemLabels_", "userLabels_", C6657c.f41825a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<gya> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (gya.class) {
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

    public static C6656b newBuilder(gya gyaVar) {
        return DEFAULT_INSTANCE.m23739o(gyaVar);
    }

    public static gya parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (gya) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static gya parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
        return (gya) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
    }

    public static gya parseFrom(vj1 vj1Var) throws ce8 {
        return (gya) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
    }

    public static gya parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
        return (gya) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
    }

    public static gya parseFrom(byte[] bArr) throws ce8 {
        return (gya) v27.m23710c0(DEFAULT_INSTANCE, bArr);
    }

    public static gya parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
        return (gya) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
    }

    public static gya parseFrom(InputStream inputStream) throws IOException {
        return (gya) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
    }

    public static gya parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (gya) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static gya parseFrom(f72 f72Var) throws IOException {
        return (gya) v27.m23704W(DEFAULT_INSTANCE, f72Var);
    }

    public static gya parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
        return (gya) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
    }
}
