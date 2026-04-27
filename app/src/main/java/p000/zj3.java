package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import p000.v27;
import p000.w98;

/* JADX INFO: loaded from: classes4.dex */
public final class zj3 extends v27<zj3, C16159b> implements ak3 {
    private static final zj3 DEFAULT_INSTANCE;
    public static final int DETAIL_FIELD_NUMBER = 2;
    private static volatile uhc<zj3> PARSER = null;
    public static final int STACK_ENTRIES_FIELD_NUMBER = 1;
    private w98.InterfaceC14504k<String> stackEntries_ = v27.m23722x();
    private String detail_ = "";

    /* JADX INFO: renamed from: zj3$a */
    public static /* synthetic */ class C16158a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f105225a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f105225a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f105225a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f105225a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f105225a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f105225a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f105225a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f105225a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: zj3$b */
    public static final class C16159b extends v27.AbstractC13823b<zj3, C16159b> implements ak3 {
        public /* synthetic */ C16159b(C16158a c16158a) {
            this();
        }

        public C16159b addAllStackEntries(Iterable<String> iterable) {
            m23743e();
            ((zj3) this.f89756b).addAllStackEntries(iterable);
            return this;
        }

        public C16159b addStackEntries(String str) {
            m23743e();
            ((zj3) this.f89756b).addStackEntries(str);
            return this;
        }

        public C16159b addStackEntriesBytes(vj1 vj1Var) {
            m23743e();
            ((zj3) this.f89756b).addStackEntriesBytes(vj1Var);
            return this;
        }

        public C16159b clearDetail() {
            m23743e();
            ((zj3) this.f89756b).clearDetail();
            return this;
        }

        public C16159b clearStackEntries() {
            m23743e();
            ((zj3) this.f89756b).clearStackEntries();
            return this;
        }

        @Override // p000.ak3
        public String getDetail() {
            return ((zj3) this.f89756b).getDetail();
        }

        @Override // p000.ak3
        public vj1 getDetailBytes() {
            return ((zj3) this.f89756b).getDetailBytes();
        }

        @Override // p000.ak3
        public String getStackEntries(int i) {
            return ((zj3) this.f89756b).getStackEntries(i);
        }

        @Override // p000.ak3
        public vj1 getStackEntriesBytes(int i) {
            return ((zj3) this.f89756b).getStackEntriesBytes(i);
        }

        @Override // p000.ak3
        public int getStackEntriesCount() {
            return ((zj3) this.f89756b).getStackEntriesCount();
        }

        @Override // p000.ak3
        public List<String> getStackEntriesList() {
            return Collections.unmodifiableList(((zj3) this.f89756b).getStackEntriesList());
        }

        public C16159b setDetail(String str) {
            m23743e();
            ((zj3) this.f89756b).setDetail(str);
            return this;
        }

        public C16159b setDetailBytes(vj1 vj1Var) {
            m23743e();
            ((zj3) this.f89756b).setDetailBytes(vj1Var);
            return this;
        }

        public C16159b setStackEntries(int i, String str) {
            m23743e();
            ((zj3) this.f89756b).setStackEntries(i, str);
            return this;
        }

        private C16159b() {
            super(zj3.DEFAULT_INSTANCE);
        }
    }

    static {
        zj3 zj3Var = new zj3();
        DEFAULT_INSTANCE = zj3Var;
        v27.m23715h0(zj3.class, zj3Var);
    }

    private zj3() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllStackEntries(Iterable<String> iterable) {
        ensureStackEntriesIsMutable();
        AbstractC1714b3.m2856b(iterable, this.stackEntries_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addStackEntries(String str) {
        str.getClass();
        ensureStackEntriesIsMutable();
        this.stackEntries_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addStackEntriesBytes(vj1 vj1Var) {
        AbstractC1714b3.m2857c(vj1Var);
        ensureStackEntriesIsMutable();
        this.stackEntries_.add(vj1Var.toStringUtf8());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDetail() {
        this.detail_ = getDefaultInstance().getDetail();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStackEntries() {
        this.stackEntries_ = v27.m23722x();
    }

    private void ensureStackEntriesIsMutable() {
        w98.InterfaceC14504k<String> interfaceC14504k = this.stackEntries_;
        if (interfaceC14504k.isModifiable()) {
            return;
        }
        this.stackEntries_ = v27.m23698P(interfaceC14504k);
    }

    public static zj3 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C16159b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    public static zj3 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (zj3) v27.m23700S(DEFAULT_INSTANCE, inputStream);
    }

    public static zj3 parseFrom(ByteBuffer byteBuffer) throws ce8 {
        return (zj3) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static uhc<zj3> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDetail(String str) {
        str.getClass();
        this.detail_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDetailBytes(vj1 vj1Var) {
        AbstractC1714b3.m2857c(vj1Var);
        this.detail_ = vj1Var.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStackEntries(int i, String str) {
        str.getClass();
        ensureStackEntriesIsMutable();
        this.stackEntries_.set(i, str);
    }

    @Override // p000.ak3
    public String getDetail() {
        return this.detail_;
    }

    @Override // p000.ak3
    public vj1 getDetailBytes() {
        return vj1.copyFromUtf8(this.detail_);
    }

    @Override // p000.ak3
    public String getStackEntries(int i) {
        return this.stackEntries_.get(i);
    }

    @Override // p000.ak3
    public vj1 getStackEntriesBytes(int i) {
        return vj1.copyFromUtf8(this.stackEntries_.get(i));
    }

    @Override // p000.ak3
    public int getStackEntriesCount() {
        return this.stackEntries_.size();
    }

    @Override // p000.ak3
    public List<String> getStackEntriesList() {
        return this.stackEntries_;
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
        C16158a c16158a = null;
        switch (C16158a.f105225a[enumC13830i.ordinal()]) {
            case 1:
                return new zj3();
            case 2:
                return new C16159b(c16158a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ț\u0002Ȉ", new Object[]{"stackEntries_", "detail_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<zj3> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (zj3.class) {
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

    public static C16159b newBuilder(zj3 zj3Var) {
        return DEFAULT_INSTANCE.m23739o(zj3Var);
    }

    public static zj3 parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (zj3) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static zj3 parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
        return (zj3) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
    }

    public static zj3 parseFrom(vj1 vj1Var) throws ce8 {
        return (zj3) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
    }

    public static zj3 parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
        return (zj3) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
    }

    public static zj3 parseFrom(byte[] bArr) throws ce8 {
        return (zj3) v27.m23710c0(DEFAULT_INSTANCE, bArr);
    }

    public static zj3 parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
        return (zj3) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
    }

    public static zj3 parseFrom(InputStream inputStream) throws IOException {
        return (zj3) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
    }

    public static zj3 parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (zj3) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static zj3 parseFrom(f72 f72Var) throws IOException {
        return (zj3) v27.m23704W(DEFAULT_INSTANCE, f72Var);
    }

    public static zj3 parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
        return (zj3) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
    }
}
