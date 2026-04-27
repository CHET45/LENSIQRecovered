package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import p000.v27;
import p000.w98;

/* JADX INFO: loaded from: classes5.dex */
public final class vz7 extends v27<vz7, C14307b> implements g08 {
    private static final vz7 DEFAULT_INSTANCE;
    public static final int FIELDS_FIELD_NUMBER = 3;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile uhc<vz7> PARSER = null;
    public static final int QUERY_SCOPE_FIELD_NUMBER = 2;
    public static final int STATE_FIELD_NUMBER = 4;
    private int queryScope_;
    private int state_;
    private String name_ = "";
    private w98.InterfaceC14504k<C14308c> fields_ = v27.m23722x();

    /* JADX INFO: renamed from: vz7$a */
    public static /* synthetic */ class C14306a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f92866a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f92866a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f92866a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f92866a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f92866a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f92866a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f92866a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f92866a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: vz7$b */
    public static final class C14307b extends v27.AbstractC13823b<vz7, C14307b> implements g08 {
        public /* synthetic */ C14307b(C14306a c14306a) {
            this();
        }

        public C14307b addAllFields(Iterable<? extends C14308c> iterable) {
            m23743e();
            ((vz7) this.f89756b).addAllFields(iterable);
            return this;
        }

        public C14307b addFields(C14308c c14308c) {
            m23743e();
            ((vz7) this.f89756b).addFields(c14308c);
            return this;
        }

        public C14307b clearFields() {
            m23743e();
            ((vz7) this.f89756b).clearFields();
            return this;
        }

        public C14307b clearName() {
            m23743e();
            ((vz7) this.f89756b).clearName();
            return this;
        }

        public C14307b clearQueryScope() {
            m23743e();
            ((vz7) this.f89756b).clearQueryScope();
            return this;
        }

        public C14307b clearState() {
            m23743e();
            ((vz7) this.f89756b).clearState();
            return this;
        }

        @Override // p000.g08
        public C14308c getFields(int i) {
            return ((vz7) this.f89756b).getFields(i);
        }

        @Override // p000.g08
        public int getFieldsCount() {
            return ((vz7) this.f89756b).getFieldsCount();
        }

        @Override // p000.g08
        public List<C14308c> getFieldsList() {
            return Collections.unmodifiableList(((vz7) this.f89756b).getFieldsList());
        }

        @Override // p000.g08
        public String getName() {
            return ((vz7) this.f89756b).getName();
        }

        @Override // p000.g08
        public vj1 getNameBytes() {
            return ((vz7) this.f89756b).getNameBytes();
        }

        @Override // p000.g08
        public EnumC14310e getQueryScope() {
            return ((vz7) this.f89756b).getQueryScope();
        }

        @Override // p000.g08
        public int getQueryScopeValue() {
            return ((vz7) this.f89756b).getQueryScopeValue();
        }

        @Override // p000.g08
        public EnumC14311f getState() {
            return ((vz7) this.f89756b).getState();
        }

        @Override // p000.g08
        public int getStateValue() {
            return ((vz7) this.f89756b).getStateValue();
        }

        public C14307b removeFields(int i) {
            m23743e();
            ((vz7) this.f89756b).removeFields(i);
            return this;
        }

        public C14307b setFields(int i, C14308c c14308c) {
            m23743e();
            ((vz7) this.f89756b).setFields(i, c14308c);
            return this;
        }

        public C14307b setName(String str) {
            m23743e();
            ((vz7) this.f89756b).setName(str);
            return this;
        }

        public C14307b setNameBytes(vj1 vj1Var) {
            m23743e();
            ((vz7) this.f89756b).setNameBytes(vj1Var);
            return this;
        }

        public C14307b setQueryScope(EnumC14310e enumC14310e) {
            m23743e();
            ((vz7) this.f89756b).setQueryScope(enumC14310e);
            return this;
        }

        public C14307b setQueryScopeValue(int i) {
            m23743e();
            ((vz7) this.f89756b).setQueryScopeValue(i);
            return this;
        }

        public C14307b setState(EnumC14311f enumC14311f) {
            m23743e();
            ((vz7) this.f89756b).setState(enumC14311f);
            return this;
        }

        public C14307b setStateValue(int i) {
            m23743e();
            ((vz7) this.f89756b).setStateValue(i);
            return this;
        }

        private C14307b() {
            super(vz7.DEFAULT_INSTANCE);
        }

        public C14307b addFields(int i, C14308c c14308c) {
            m23743e();
            ((vz7) this.f89756b).addFields(i, c14308c);
            return this;
        }

        public C14307b setFields(int i, C14308c.b bVar) {
            m23743e();
            ((vz7) this.f89756b).setFields(i, bVar.build());
            return this;
        }

        public C14307b addFields(C14308c.b bVar) {
            m23743e();
            ((vz7) this.f89756b).addFields(bVar.build());
            return this;
        }

        public C14307b addFields(int i, C14308c.b bVar) {
            m23743e();
            ((vz7) this.f89756b).addFields(i, bVar.build());
            return this;
        }
    }

    /* JADX INFO: renamed from: vz7$c */
    public static final class C14308c extends v27<C14308c, b> implements InterfaceC14309d {
        public static final int ARRAY_CONFIG_FIELD_NUMBER = 3;
        private static final C14308c DEFAULT_INSTANCE;
        public static final int FIELD_PATH_FIELD_NUMBER = 1;
        public static final int ORDER_FIELD_NUMBER = 2;
        private static volatile uhc<C14308c> PARSER;
        private Object valueMode_;
        private int valueModeCase_ = 0;
        private String fieldPath_ = "";

        /* JADX INFO: renamed from: vz7$c$a */
        public enum a implements w98.InterfaceC14497d {
            ARRAY_CONFIG_UNSPECIFIED(0),
            CONTAINS(1),
            UNRECOGNIZED(-1);


            /* JADX INFO: renamed from: e */
            public static final int f92871e = 0;

            /* JADX INFO: renamed from: f */
            public static final int f92872f = 1;

            /* JADX INFO: renamed from: m */
            public static final w98.InterfaceC14498e<a> f92873m = new C16549a();

            /* JADX INFO: renamed from: a */
            public final int f92874a;

            /* JADX INFO: renamed from: vz7$c$a$a, reason: collision with other inner class name */
            public class C16549a implements w98.InterfaceC14498e<a> {
                @Override // p000.w98.InterfaceC14498e
                public a findValueByNumber(int i) {
                    return a.forNumber(i);
                }
            }

            /* JADX INFO: renamed from: vz7$c$a$b */
            public static final class b implements w98.InterfaceC14499f {

                /* JADX INFO: renamed from: a */
                public static final w98.InterfaceC14499f f92875a = new b();

                private b() {
                }

                @Override // p000.w98.InterfaceC14499f
                public boolean isInRange(int i) {
                    return a.forNumber(i) != null;
                }
            }

            a(int i) {
                this.f92874a = i;
            }

            public static a forNumber(int i) {
                if (i == 0) {
                    return ARRAY_CONFIG_UNSPECIFIED;
                }
                if (i != 1) {
                    return null;
                }
                return CONTAINS;
            }

            public static w98.InterfaceC14498e<a> internalGetValueMap() {
                return f92873m;
            }

            public static w98.InterfaceC14499f internalGetVerifier() {
                return b.f92875a;
            }

            @Override // p000.w98.InterfaceC14497d
            public final int getNumber() {
                if (this != UNRECOGNIZED) {
                    return this.f92874a;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }

            @Deprecated
            public static a valueOf(int i) {
                return forNumber(i);
            }
        }

        /* JADX INFO: renamed from: vz7$c$b */
        public static final class b extends v27.AbstractC13823b<C14308c, b> implements InterfaceC14309d {
            public /* synthetic */ b(C14306a c14306a) {
                this();
            }

            public b clearArrayConfig() {
                m23743e();
                ((C14308c) this.f89756b).clearArrayConfig();
                return this;
            }

            public b clearFieldPath() {
                m23743e();
                ((C14308c) this.f89756b).clearFieldPath();
                return this;
            }

            public b clearOrder() {
                m23743e();
                ((C14308c) this.f89756b).clearOrder();
                return this;
            }

            public b clearValueMode() {
                m23743e();
                ((C14308c) this.f89756b).clearValueMode();
                return this;
            }

            @Override // p000.vz7.InterfaceC14309d
            public a getArrayConfig() {
                return ((C14308c) this.f89756b).getArrayConfig();
            }

            @Override // p000.vz7.InterfaceC14309d
            public int getArrayConfigValue() {
                return ((C14308c) this.f89756b).getArrayConfigValue();
            }

            @Override // p000.vz7.InterfaceC14309d
            public String getFieldPath() {
                return ((C14308c) this.f89756b).getFieldPath();
            }

            @Override // p000.vz7.InterfaceC14309d
            public vj1 getFieldPathBytes() {
                return ((C14308c) this.f89756b).getFieldPathBytes();
            }

            @Override // p000.vz7.InterfaceC14309d
            public c getOrder() {
                return ((C14308c) this.f89756b).getOrder();
            }

            @Override // p000.vz7.InterfaceC14309d
            public int getOrderValue() {
                return ((C14308c) this.f89756b).getOrderValue();
            }

            @Override // p000.vz7.InterfaceC14309d
            public d getValueModeCase() {
                return ((C14308c) this.f89756b).getValueModeCase();
            }

            @Override // p000.vz7.InterfaceC14309d
            public boolean hasArrayConfig() {
                return ((C14308c) this.f89756b).hasArrayConfig();
            }

            @Override // p000.vz7.InterfaceC14309d
            public boolean hasOrder() {
                return ((C14308c) this.f89756b).hasOrder();
            }

            public b setArrayConfig(a aVar) {
                m23743e();
                ((C14308c) this.f89756b).setArrayConfig(aVar);
                return this;
            }

            public b setArrayConfigValue(int i) {
                m23743e();
                ((C14308c) this.f89756b).setArrayConfigValue(i);
                return this;
            }

            public b setFieldPath(String str) {
                m23743e();
                ((C14308c) this.f89756b).setFieldPath(str);
                return this;
            }

            public b setFieldPathBytes(vj1 vj1Var) {
                m23743e();
                ((C14308c) this.f89756b).setFieldPathBytes(vj1Var);
                return this;
            }

            public b setOrder(c cVar) {
                m23743e();
                ((C14308c) this.f89756b).setOrder(cVar);
                return this;
            }

            public b setOrderValue(int i) {
                m23743e();
                ((C14308c) this.f89756b).setOrderValue(i);
                return this;
            }

            private b() {
                super(C14308c.DEFAULT_INSTANCE);
            }
        }

        /* JADX INFO: renamed from: vz7$c$c */
        public enum c implements w98.InterfaceC14497d {
            ORDER_UNSPECIFIED(0),
            ASCENDING(1),
            DESCENDING(2),
            UNRECOGNIZED(-1);


            /* JADX INFO: renamed from: C */
            public static final int f92876C = 2;

            /* JADX INFO: renamed from: F */
            public static final w98.InterfaceC14498e<c> f92877F = new a();

            /* JADX INFO: renamed from: f */
            public static final int f92883f = 0;

            /* JADX INFO: renamed from: m */
            public static final int f92884m = 1;

            /* JADX INFO: renamed from: a */
            public final int f92885a;

            /* JADX INFO: renamed from: vz7$c$c$a */
            public class a implements w98.InterfaceC14498e<c> {
                @Override // p000.w98.InterfaceC14498e
                public c findValueByNumber(int i) {
                    return c.forNumber(i);
                }
            }

            /* JADX INFO: renamed from: vz7$c$c$b */
            public static final class b implements w98.InterfaceC14499f {

                /* JADX INFO: renamed from: a */
                public static final w98.InterfaceC14499f f92886a = new b();

                private b() {
                }

                @Override // p000.w98.InterfaceC14499f
                public boolean isInRange(int i) {
                    return c.forNumber(i) != null;
                }
            }

            c(int i) {
                this.f92885a = i;
            }

            public static c forNumber(int i) {
                if (i == 0) {
                    return ORDER_UNSPECIFIED;
                }
                if (i == 1) {
                    return ASCENDING;
                }
                if (i != 2) {
                    return null;
                }
                return DESCENDING;
            }

            public static w98.InterfaceC14498e<c> internalGetValueMap() {
                return f92877F;
            }

            public static w98.InterfaceC14499f internalGetVerifier() {
                return b.f92886a;
            }

            @Override // p000.w98.InterfaceC14497d
            public final int getNumber() {
                if (this != UNRECOGNIZED) {
                    return this.f92885a;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }

            @Deprecated
            public static c valueOf(int i) {
                return forNumber(i);
            }
        }

        /* JADX INFO: renamed from: vz7$c$d */
        public enum d {
            ORDER(2),
            ARRAY_CONFIG(3),
            VALUEMODE_NOT_SET(0);


            /* JADX INFO: renamed from: a */
            public final int f92891a;

            d(int i) {
                this.f92891a = i;
            }

            public static d forNumber(int i) {
                if (i == 0) {
                    return VALUEMODE_NOT_SET;
                }
                if (i == 2) {
                    return ORDER;
                }
                if (i != 3) {
                    return null;
                }
                return ARRAY_CONFIG;
            }

            public int getNumber() {
                return this.f92891a;
            }

            @Deprecated
            public static d valueOf(int i) {
                return forNumber(i);
            }
        }

        static {
            C14308c c14308c = new C14308c();
            DEFAULT_INSTANCE = c14308c;
            v27.m23715h0(C14308c.class, c14308c);
        }

        private C14308c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearArrayConfig() {
            if (this.valueModeCase_ == 3) {
                this.valueModeCase_ = 0;
                this.valueMode_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFieldPath() {
            this.fieldPath_ = getDefaultInstance().getFieldPath();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOrder() {
            if (this.valueModeCase_ == 2) {
                this.valueModeCase_ = 0;
                this.valueMode_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearValueMode() {
            this.valueModeCase_ = 0;
            this.valueMode_ = null;
        }

        public static C14308c getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static b newBuilder() {
            return DEFAULT_INSTANCE.m23738n();
        }

        public static C14308c parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (C14308c) v27.m23700S(DEFAULT_INSTANCE, inputStream);
        }

        public static C14308c parseFrom(ByteBuffer byteBuffer) throws ce8 {
            return (C14308c) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
        }

        public static uhc<C14308c> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setArrayConfig(a aVar) {
            this.valueMode_ = Integer.valueOf(aVar.getNumber());
            this.valueModeCase_ = 3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setArrayConfigValue(int i) {
            this.valueModeCase_ = 3;
            this.valueMode_ = Integer.valueOf(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFieldPath(String str) {
            str.getClass();
            this.fieldPath_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFieldPathBytes(vj1 vj1Var) {
            AbstractC1714b3.m2857c(vj1Var);
            this.fieldPath_ = vj1Var.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOrder(c cVar) {
            this.valueMode_ = Integer.valueOf(cVar.getNumber());
            this.valueModeCase_ = 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOrderValue(int i) {
            this.valueModeCase_ = 2;
            this.valueMode_ = Integer.valueOf(i);
        }

        @Override // p000.vz7.InterfaceC14309d
        public a getArrayConfig() {
            if (this.valueModeCase_ != 3) {
                return a.ARRAY_CONFIG_UNSPECIFIED;
            }
            a aVarForNumber = a.forNumber(((Integer) this.valueMode_).intValue());
            return aVarForNumber == null ? a.UNRECOGNIZED : aVarForNumber;
        }

        @Override // p000.vz7.InterfaceC14309d
        public int getArrayConfigValue() {
            if (this.valueModeCase_ == 3) {
                return ((Integer) this.valueMode_).intValue();
            }
            return 0;
        }

        @Override // p000.vz7.InterfaceC14309d
        public String getFieldPath() {
            return this.fieldPath_;
        }

        @Override // p000.vz7.InterfaceC14309d
        public vj1 getFieldPathBytes() {
            return vj1.copyFromUtf8(this.fieldPath_);
        }

        @Override // p000.vz7.InterfaceC14309d
        public c getOrder() {
            if (this.valueModeCase_ != 2) {
                return c.ORDER_UNSPECIFIED;
            }
            c cVarForNumber = c.forNumber(((Integer) this.valueMode_).intValue());
            return cVarForNumber == null ? c.UNRECOGNIZED : cVarForNumber;
        }

        @Override // p000.vz7.InterfaceC14309d
        public int getOrderValue() {
            if (this.valueModeCase_ == 2) {
                return ((Integer) this.valueMode_).intValue();
            }
            return 0;
        }

        @Override // p000.vz7.InterfaceC14309d
        public d getValueModeCase() {
            return d.forNumber(this.valueModeCase_);
        }

        @Override // p000.vz7.InterfaceC14309d
        public boolean hasArrayConfig() {
            return this.valueModeCase_ == 3;
        }

        @Override // p000.vz7.InterfaceC14309d
        public boolean hasOrder() {
            return this.valueModeCase_ == 2;
        }

        @Override // p000.v27
        /* JADX INFO: renamed from: r */
        public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
            C14306a c14306a = null;
            switch (C14306a.f92866a[enumC13830i.ordinal()]) {
                case 1:
                    return new C14308c();
                case 2:
                    return new b(c14306a);
                case 3:
                    return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002?\u0000\u0003?\u0000", new Object[]{"valueMode_", "valueModeCase_", "fieldPath_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    uhc<C14308c> c13824c = PARSER;
                    if (c13824c == null) {
                        synchronized (C14308c.class) {
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

        public static b newBuilder(C14308c c14308c) {
            return DEFAULT_INSTANCE.m23739o(c14308c);
        }

        public static C14308c parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
            return (C14308c) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
        }

        public static C14308c parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
            return (C14308c) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
        }

        public static C14308c parseFrom(vj1 vj1Var) throws ce8 {
            return (C14308c) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
        }

        public static C14308c parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
            return (C14308c) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
        }

        public static C14308c parseFrom(byte[] bArr) throws ce8 {
            return (C14308c) v27.m23710c0(DEFAULT_INSTANCE, bArr);
        }

        public static C14308c parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
            return (C14308c) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
        }

        public static C14308c parseFrom(InputStream inputStream) throws IOException {
            return (C14308c) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
        }

        public static C14308c parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
            return (C14308c) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
        }

        public static C14308c parseFrom(f72 f72Var) throws IOException {
            return (C14308c) v27.m23704W(DEFAULT_INSTANCE, f72Var);
        }

        public static C14308c parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
            return (C14308c) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
        }
    }

    /* JADX INFO: renamed from: vz7$d */
    public interface InterfaceC14309d extends rsa {
        C14308c.a getArrayConfig();

        int getArrayConfigValue();

        String getFieldPath();

        vj1 getFieldPathBytes();

        C14308c.c getOrder();

        int getOrderValue();

        C14308c.d getValueModeCase();

        boolean hasArrayConfig();

        boolean hasOrder();
    }

    /* JADX INFO: renamed from: vz7$e */
    public enum EnumC14310e implements w98.InterfaceC14497d {
        QUERY_SCOPE_UNSPECIFIED(0),
        COLLECTION(1),
        COLLECTION_GROUP(2),
        UNRECOGNIZED(-1);


        /* JADX INFO: renamed from: C */
        public static final int f92892C = 2;

        /* JADX INFO: renamed from: F */
        public static final w98.InterfaceC14498e<EnumC14310e> f92893F = new a();

        /* JADX INFO: renamed from: f */
        public static final int f92899f = 0;

        /* JADX INFO: renamed from: m */
        public static final int f92900m = 1;

        /* JADX INFO: renamed from: a */
        public final int f92901a;

        /* JADX INFO: renamed from: vz7$e$a */
        public class a implements w98.InterfaceC14498e<EnumC14310e> {
            @Override // p000.w98.InterfaceC14498e
            public EnumC14310e findValueByNumber(int i) {
                return EnumC14310e.forNumber(i);
            }
        }

        /* JADX INFO: renamed from: vz7$e$b */
        public static final class b implements w98.InterfaceC14499f {

            /* JADX INFO: renamed from: a */
            public static final w98.InterfaceC14499f f92902a = new b();

            private b() {
            }

            @Override // p000.w98.InterfaceC14499f
            public boolean isInRange(int i) {
                return EnumC14310e.forNumber(i) != null;
            }
        }

        EnumC14310e(int i) {
            this.f92901a = i;
        }

        public static EnumC14310e forNumber(int i) {
            if (i == 0) {
                return QUERY_SCOPE_UNSPECIFIED;
            }
            if (i == 1) {
                return COLLECTION;
            }
            if (i != 2) {
                return null;
            }
            return COLLECTION_GROUP;
        }

        public static w98.InterfaceC14498e<EnumC14310e> internalGetValueMap() {
            return f92893F;
        }

        public static w98.InterfaceC14499f internalGetVerifier() {
            return b.f92902a;
        }

        @Override // p000.w98.InterfaceC14497d
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.f92901a;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static EnumC14310e valueOf(int i) {
            return forNumber(i);
        }
    }

    /* JADX INFO: renamed from: vz7$f */
    public enum EnumC14311f implements w98.InterfaceC14497d {
        STATE_UNSPECIFIED(0),
        CREATING(1),
        READY(2),
        NEEDS_REPAIR(3),
        UNRECOGNIZED(-1);


        /* JADX INFO: renamed from: C */
        public static final int f92903C = 1;

        /* JADX INFO: renamed from: F */
        public static final int f92904F = 2;

        /* JADX INFO: renamed from: H */
        public static final int f92905H = 3;

        /* JADX INFO: renamed from: L */
        public static final w98.InterfaceC14498e<EnumC14311f> f92906L = new a();

        /* JADX INFO: renamed from: m */
        public static final int f92913m = 0;

        /* JADX INFO: renamed from: a */
        public final int f92914a;

        /* JADX INFO: renamed from: vz7$f$a */
        public class a implements w98.InterfaceC14498e<EnumC14311f> {
            @Override // p000.w98.InterfaceC14498e
            public EnumC14311f findValueByNumber(int i) {
                return EnumC14311f.forNumber(i);
            }
        }

        /* JADX INFO: renamed from: vz7$f$b */
        public static final class b implements w98.InterfaceC14499f {

            /* JADX INFO: renamed from: a */
            public static final w98.InterfaceC14499f f92915a = new b();

            private b() {
            }

            @Override // p000.w98.InterfaceC14499f
            public boolean isInRange(int i) {
                return EnumC14311f.forNumber(i) != null;
            }
        }

        EnumC14311f(int i) {
            this.f92914a = i;
        }

        public static EnumC14311f forNumber(int i) {
            if (i == 0) {
                return STATE_UNSPECIFIED;
            }
            if (i == 1) {
                return CREATING;
            }
            if (i == 2) {
                return READY;
            }
            if (i != 3) {
                return null;
            }
            return NEEDS_REPAIR;
        }

        public static w98.InterfaceC14498e<EnumC14311f> internalGetValueMap() {
            return f92906L;
        }

        public static w98.InterfaceC14499f internalGetVerifier() {
            return b.f92915a;
        }

        @Override // p000.w98.InterfaceC14497d
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.f92914a;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static EnumC14311f valueOf(int i) {
            return forNumber(i);
        }
    }

    static {
        vz7 vz7Var = new vz7();
        DEFAULT_INSTANCE = vz7Var;
        v27.m23715h0(vz7.class, vz7Var);
    }

    private vz7() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllFields(Iterable<? extends C14308c> iterable) {
        ensureFieldsIsMutable();
        AbstractC1714b3.m2856b(iterable, this.fields_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addFields(C14308c c14308c) {
        c14308c.getClass();
        ensureFieldsIsMutable();
        this.fields_.add(c14308c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFields() {
        this.fields_ = v27.m23722x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearQueryScope() {
        this.queryScope_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearState() {
        this.state_ = 0;
    }

    private void ensureFieldsIsMutable() {
        w98.InterfaceC14504k<C14308c> interfaceC14504k = this.fields_;
        if (interfaceC14504k.isModifiable()) {
            return;
        }
        this.fields_ = v27.m23698P(interfaceC14504k);
    }

    public static vz7 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C14307b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    public static vz7 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (vz7) v27.m23700S(DEFAULT_INSTANCE, inputStream);
    }

    public static vz7 parseFrom(ByteBuffer byteBuffer) throws ce8 {
        return (vz7) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static uhc<vz7> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeFields(int i) {
        ensureFieldsIsMutable();
        this.fields_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFields(int i, C14308c c14308c) {
        c14308c.getClass();
        ensureFieldsIsMutable();
        this.fields_.set(i, c14308c);
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
    public void setQueryScope(EnumC14310e enumC14310e) {
        this.queryScope_ = enumC14310e.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setQueryScopeValue(int i) {
        this.queryScope_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setState(EnumC14311f enumC14311f) {
        this.state_ = enumC14311f.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStateValue(int i) {
        this.state_ = i;
    }

    @Override // p000.g08
    public C14308c getFields(int i) {
        return this.fields_.get(i);
    }

    @Override // p000.g08
    public int getFieldsCount() {
        return this.fields_.size();
    }

    @Override // p000.g08
    public List<C14308c> getFieldsList() {
        return this.fields_;
    }

    public InterfaceC14309d getFieldsOrBuilder(int i) {
        return this.fields_.get(i);
    }

    public List<? extends InterfaceC14309d> getFieldsOrBuilderList() {
        return this.fields_;
    }

    @Override // p000.g08
    public String getName() {
        return this.name_;
    }

    @Override // p000.g08
    public vj1 getNameBytes() {
        return vj1.copyFromUtf8(this.name_);
    }

    @Override // p000.g08
    public EnumC14310e getQueryScope() {
        EnumC14310e enumC14310eForNumber = EnumC14310e.forNumber(this.queryScope_);
        return enumC14310eForNumber == null ? EnumC14310e.UNRECOGNIZED : enumC14310eForNumber;
    }

    @Override // p000.g08
    public int getQueryScopeValue() {
        return this.queryScope_;
    }

    @Override // p000.g08
    public EnumC14311f getState() {
        EnumC14311f enumC14311fForNumber = EnumC14311f.forNumber(this.state_);
        return enumC14311fForNumber == null ? EnumC14311f.UNRECOGNIZED : enumC14311fForNumber;
    }

    @Override // p000.g08
    public int getStateValue() {
        return this.state_;
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
        C14306a c14306a = null;
        switch (C14306a.f92866a[enumC13830i.ordinal()]) {
            case 1:
                return new vz7();
            case 2:
                return new C14307b(c14306a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002\f\u0003\u001b\u0004\f", new Object[]{"name_", "queryScope_", "fields_", C14308c.class, "state_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<vz7> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (vz7.class) {
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

    public static C14307b newBuilder(vz7 vz7Var) {
        return DEFAULT_INSTANCE.m23739o(vz7Var);
    }

    public static vz7 parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (vz7) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static vz7 parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
        return (vz7) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
    }

    public static vz7 parseFrom(vj1 vj1Var) throws ce8 {
        return (vz7) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addFields(int i, C14308c c14308c) {
        c14308c.getClass();
        ensureFieldsIsMutable();
        this.fields_.add(i, c14308c);
    }

    public static vz7 parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
        return (vz7) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
    }

    public static vz7 parseFrom(byte[] bArr) throws ce8 {
        return (vz7) v27.m23710c0(DEFAULT_INSTANCE, bArr);
    }

    public static vz7 parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
        return (vz7) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
    }

    public static vz7 parseFrom(InputStream inputStream) throws IOException {
        return (vz7) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
    }

    public static vz7 parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (vz7) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static vz7 parseFrom(f72 f72Var) throws IOException {
        return (vz7) v27.m23704W(DEFAULT_INSTANCE, f72Var);
    }

    public static vz7 parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
        return (vz7) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
    }
}
