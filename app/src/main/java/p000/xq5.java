package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import p000.v27;
import p000.w6c;
import p000.w98;

/* JADX INFO: loaded from: classes4.dex */
public final class xq5 extends v27<xq5, C15251b> implements ur5 {
    public static final int CARDINALITY_FIELD_NUMBER = 2;
    private static final xq5 DEFAULT_INSTANCE;
    public static final int DEFAULT_VALUE_FIELD_NUMBER = 11;
    public static final int JSON_NAME_FIELD_NUMBER = 10;
    public static final int KIND_FIELD_NUMBER = 1;
    public static final int NAME_FIELD_NUMBER = 4;
    public static final int NUMBER_FIELD_NUMBER = 3;
    public static final int ONEOF_INDEX_FIELD_NUMBER = 7;
    public static final int OPTIONS_FIELD_NUMBER = 9;
    public static final int PACKED_FIELD_NUMBER = 8;
    private static volatile uhc<xq5> PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 6;
    private int cardinality_;
    private int kind_;
    private int number_;
    private int oneofIndex_;
    private boolean packed_;
    private String name_ = "";
    private String typeUrl_ = "";
    private w98.InterfaceC14504k<w6c> options_ = v27.m23722x();
    private String jsonName_ = "";
    private String defaultValue_ = "";

    /* JADX INFO: renamed from: xq5$a */
    public static /* synthetic */ class C15250a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f98914a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f98914a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f98914a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f98914a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f98914a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f98914a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f98914a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f98914a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: xq5$b */
    public static final class C15251b extends v27.AbstractC13823b<xq5, C15251b> implements ur5 {
        public /* synthetic */ C15251b(C15250a c15250a) {
            this();
        }

        public C15251b addAllOptions(Iterable<? extends w6c> values) {
            m23743e();
            ((xq5) this.f89756b).addAllOptions(values);
            return this;
        }

        public C15251b addOptions(w6c value) {
            m23743e();
            ((xq5) this.f89756b).addOptions(value);
            return this;
        }

        public C15251b clearCardinality() {
            m23743e();
            ((xq5) this.f89756b).clearCardinality();
            return this;
        }

        public C15251b clearDefaultValue() {
            m23743e();
            ((xq5) this.f89756b).clearDefaultValue();
            return this;
        }

        public C15251b clearJsonName() {
            m23743e();
            ((xq5) this.f89756b).clearJsonName();
            return this;
        }

        public C15251b clearKind() {
            m23743e();
            ((xq5) this.f89756b).clearKind();
            return this;
        }

        public C15251b clearName() {
            m23743e();
            ((xq5) this.f89756b).clearName();
            return this;
        }

        public C15251b clearNumber() {
            m23743e();
            ((xq5) this.f89756b).clearNumber();
            return this;
        }

        public C15251b clearOneofIndex() {
            m23743e();
            ((xq5) this.f89756b).clearOneofIndex();
            return this;
        }

        public C15251b clearOptions() {
            m23743e();
            ((xq5) this.f89756b).clearOptions();
            return this;
        }

        public C15251b clearPacked() {
            m23743e();
            ((xq5) this.f89756b).clearPacked();
            return this;
        }

        public C15251b clearTypeUrl() {
            m23743e();
            ((xq5) this.f89756b).clearTypeUrl();
            return this;
        }

        @Override // p000.ur5
        public EnumC15252c getCardinality() {
            return ((xq5) this.f89756b).getCardinality();
        }

        @Override // p000.ur5
        public int getCardinalityValue() {
            return ((xq5) this.f89756b).getCardinalityValue();
        }

        @Override // p000.ur5
        public String getDefaultValue() {
            return ((xq5) this.f89756b).getDefaultValue();
        }

        @Override // p000.ur5
        public vj1 getDefaultValueBytes() {
            return ((xq5) this.f89756b).getDefaultValueBytes();
        }

        @Override // p000.ur5
        public String getJsonName() {
            return ((xq5) this.f89756b).getJsonName();
        }

        @Override // p000.ur5
        public vj1 getJsonNameBytes() {
            return ((xq5) this.f89756b).getJsonNameBytes();
        }

        @Override // p000.ur5
        public EnumC15253d getKind() {
            return ((xq5) this.f89756b).getKind();
        }

        @Override // p000.ur5
        public int getKindValue() {
            return ((xq5) this.f89756b).getKindValue();
        }

        @Override // p000.ur5
        public String getName() {
            return ((xq5) this.f89756b).getName();
        }

        @Override // p000.ur5
        public vj1 getNameBytes() {
            return ((xq5) this.f89756b).getNameBytes();
        }

        @Override // p000.ur5
        public int getNumber() {
            return ((xq5) this.f89756b).getNumber();
        }

        @Override // p000.ur5
        public int getOneofIndex() {
            return ((xq5) this.f89756b).getOneofIndex();
        }

        @Override // p000.ur5
        public w6c getOptions(int index) {
            return ((xq5) this.f89756b).getOptions(index);
        }

        @Override // p000.ur5
        public int getOptionsCount() {
            return ((xq5) this.f89756b).getOptionsCount();
        }

        @Override // p000.ur5
        public List<w6c> getOptionsList() {
            return Collections.unmodifiableList(((xq5) this.f89756b).getOptionsList());
        }

        @Override // p000.ur5
        public boolean getPacked() {
            return ((xq5) this.f89756b).getPacked();
        }

        @Override // p000.ur5
        public String getTypeUrl() {
            return ((xq5) this.f89756b).getTypeUrl();
        }

        @Override // p000.ur5
        public vj1 getTypeUrlBytes() {
            return ((xq5) this.f89756b).getTypeUrlBytes();
        }

        public C15251b removeOptions(int index) {
            m23743e();
            ((xq5) this.f89756b).removeOptions(index);
            return this;
        }

        public C15251b setCardinality(EnumC15252c value) {
            m23743e();
            ((xq5) this.f89756b).setCardinality(value);
            return this;
        }

        public C15251b setCardinalityValue(int value) {
            m23743e();
            ((xq5) this.f89756b).setCardinalityValue(value);
            return this;
        }

        public C15251b setDefaultValue(String value) {
            m23743e();
            ((xq5) this.f89756b).setDefaultValue(value);
            return this;
        }

        public C15251b setDefaultValueBytes(vj1 value) {
            m23743e();
            ((xq5) this.f89756b).setDefaultValueBytes(value);
            return this;
        }

        public C15251b setJsonName(String value) {
            m23743e();
            ((xq5) this.f89756b).setJsonName(value);
            return this;
        }

        public C15251b setJsonNameBytes(vj1 value) {
            m23743e();
            ((xq5) this.f89756b).setJsonNameBytes(value);
            return this;
        }

        public C15251b setKind(EnumC15253d value) {
            m23743e();
            ((xq5) this.f89756b).setKind(value);
            return this;
        }

        public C15251b setKindValue(int value) {
            m23743e();
            ((xq5) this.f89756b).setKindValue(value);
            return this;
        }

        public C15251b setName(String value) {
            m23743e();
            ((xq5) this.f89756b).setName(value);
            return this;
        }

        public C15251b setNameBytes(vj1 value) {
            m23743e();
            ((xq5) this.f89756b).setNameBytes(value);
            return this;
        }

        public C15251b setNumber(int value) {
            m23743e();
            ((xq5) this.f89756b).setNumber(value);
            return this;
        }

        public C15251b setOneofIndex(int value) {
            m23743e();
            ((xq5) this.f89756b).setOneofIndex(value);
            return this;
        }

        public C15251b setOptions(int index, w6c value) {
            m23743e();
            ((xq5) this.f89756b).setOptions(index, value);
            return this;
        }

        public C15251b setPacked(boolean value) {
            m23743e();
            ((xq5) this.f89756b).setPacked(value);
            return this;
        }

        public C15251b setTypeUrl(String value) {
            m23743e();
            ((xq5) this.f89756b).setTypeUrl(value);
            return this;
        }

        public C15251b setTypeUrlBytes(vj1 value) {
            m23743e();
            ((xq5) this.f89756b).setTypeUrlBytes(value);
            return this;
        }

        private C15251b() {
            super(xq5.DEFAULT_INSTANCE);
        }

        public C15251b addOptions(int index, w6c value) {
            m23743e();
            ((xq5) this.f89756b).addOptions(index, value);
            return this;
        }

        public C15251b setOptions(int index, w6c.C14445b builderForValue) {
            m23743e();
            ((xq5) this.f89756b).setOptions(index, builderForValue.build());
            return this;
        }

        public C15251b addOptions(w6c.C14445b builderForValue) {
            m23743e();
            ((xq5) this.f89756b).addOptions(builderForValue.build());
            return this;
        }

        public C15251b addOptions(int index, w6c.C14445b builderForValue) {
            m23743e();
            ((xq5) this.f89756b).addOptions(index, builderForValue.build());
            return this;
        }
    }

    /* JADX INFO: renamed from: xq5$c */
    public enum EnumC15252c implements w98.InterfaceC14497d {
        CARDINALITY_UNKNOWN(0),
        CARDINALITY_OPTIONAL(1),
        CARDINALITY_REQUIRED(2),
        CARDINALITY_REPEATED(3),
        UNRECOGNIZED(-1);


        /* JADX INFO: renamed from: C */
        public static final int f98915C = 1;

        /* JADX INFO: renamed from: F */
        public static final int f98916F = 2;

        /* JADX INFO: renamed from: H */
        public static final int f98917H = 3;

        /* JADX INFO: renamed from: L */
        public static final w98.InterfaceC14498e<EnumC15252c> f98918L = new a();

        /* JADX INFO: renamed from: m */
        public static final int f98925m = 0;

        /* JADX INFO: renamed from: a */
        public final int f98926a;

        /* JADX INFO: renamed from: xq5$c$a */
        public class a implements w98.InterfaceC14498e<EnumC15252c> {
            @Override // p000.w98.InterfaceC14498e
            public EnumC15252c findValueByNumber(int number) {
                return EnumC15252c.forNumber(number);
            }
        }

        /* JADX INFO: renamed from: xq5$c$b */
        public static final class b implements w98.InterfaceC14499f {

            /* JADX INFO: renamed from: a */
            public static final w98.InterfaceC14499f f98927a = new b();

            private b() {
            }

            @Override // p000.w98.InterfaceC14499f
            public boolean isInRange(int number) {
                return EnumC15252c.forNumber(number) != null;
            }
        }

        EnumC15252c(int value) {
            this.f98926a = value;
        }

        public static EnumC15252c forNumber(int value) {
            if (value == 0) {
                return CARDINALITY_UNKNOWN;
            }
            if (value == 1) {
                return CARDINALITY_OPTIONAL;
            }
            if (value == 2) {
                return CARDINALITY_REQUIRED;
            }
            if (value != 3) {
                return null;
            }
            return CARDINALITY_REPEATED;
        }

        public static w98.InterfaceC14498e<EnumC15252c> internalGetValueMap() {
            return f98918L;
        }

        public static w98.InterfaceC14499f internalGetVerifier() {
            return b.f98927a;
        }

        @Override // p000.w98.InterfaceC14497d
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.f98926a;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static EnumC15252c valueOf(int value) {
            return forNumber(value);
        }
    }

    /* JADX INFO: renamed from: xq5$d */
    public enum EnumC15253d implements w98.InterfaceC14497d {
        TYPE_UNKNOWN(0),
        TYPE_DOUBLE(1),
        TYPE_FLOAT(2),
        TYPE_INT64(3),
        TYPE_UINT64(4),
        TYPE_INT32(5),
        TYPE_FIXED64(6),
        TYPE_FIXED32(7),
        TYPE_BOOL(8),
        TYPE_STRING(9),
        TYPE_GROUP(10),
        TYPE_MESSAGE(11),
        TYPE_BYTES(12),
        TYPE_UINT32(13),
        TYPE_ENUM(14),
        TYPE_SFIXED32(15),
        TYPE_SFIXED64(16),
        TYPE_SINT32(17),
        TYPE_SINT64(18),
        UNRECOGNIZED(-1);


        /* JADX INFO: renamed from: b2 */
        public static final int f98943b2 = 0;

        /* JADX INFO: renamed from: c2 */
        public static final int f98945c2 = 1;

        /* JADX INFO: renamed from: d2 */
        public static final int f98947d2 = 2;

        /* JADX INFO: renamed from: e2 */
        public static final int f98949e2 = 3;

        /* JADX INFO: renamed from: f2 */
        public static final int f98951f2 = 4;

        /* JADX INFO: renamed from: g2 */
        public static final int f98952g2 = 5;

        /* JADX INFO: renamed from: h2 */
        public static final int f98953h2 = 6;

        /* JADX INFO: renamed from: i2 */
        public static final int f98954i2 = 7;

        /* JADX INFO: renamed from: j2 */
        public static final int f98955j2 = 8;

        /* JADX INFO: renamed from: k2 */
        public static final int f98956k2 = 9;

        /* JADX INFO: renamed from: l2 */
        public static final int f98957l2 = 10;

        /* JADX INFO: renamed from: m2 */
        public static final int f98959m2 = 11;

        /* JADX INFO: renamed from: n2 */
        public static final int f98960n2 = 12;

        /* JADX INFO: renamed from: o2 */
        public static final int f98961o2 = 13;

        /* JADX INFO: renamed from: p2 */
        public static final int f98962p2 = 14;

        /* JADX INFO: renamed from: q2 */
        public static final int f98963q2 = 15;

        /* JADX INFO: renamed from: r2 */
        public static final int f98964r2 = 16;

        /* JADX INFO: renamed from: s2 */
        public static final int f98965s2 = 17;

        /* JADX INFO: renamed from: t2 */
        public static final int f98966t2 = 18;

        /* JADX INFO: renamed from: u2 */
        public static final w98.InterfaceC14498e<EnumC15253d> f98967u2 = new a();

        /* JADX INFO: renamed from: a */
        public final int f98969a;

        /* JADX INFO: renamed from: xq5$d$a */
        public class a implements w98.InterfaceC14498e<EnumC15253d> {
            @Override // p000.w98.InterfaceC14498e
            public EnumC15253d findValueByNumber(int number) {
                return EnumC15253d.forNumber(number);
            }
        }

        /* JADX INFO: renamed from: xq5$d$b */
        public static final class b implements w98.InterfaceC14499f {

            /* JADX INFO: renamed from: a */
            public static final w98.InterfaceC14499f f98970a = new b();

            private b() {
            }

            @Override // p000.w98.InterfaceC14499f
            public boolean isInRange(int number) {
                return EnumC15253d.forNumber(number) != null;
            }
        }

        EnumC15253d(int value) {
            this.f98969a = value;
        }

        public static EnumC15253d forNumber(int value) {
            switch (value) {
                case 0:
                    return TYPE_UNKNOWN;
                case 1:
                    return TYPE_DOUBLE;
                case 2:
                    return TYPE_FLOAT;
                case 3:
                    return TYPE_INT64;
                case 4:
                    return TYPE_UINT64;
                case 5:
                    return TYPE_INT32;
                case 6:
                    return TYPE_FIXED64;
                case 7:
                    return TYPE_FIXED32;
                case 8:
                    return TYPE_BOOL;
                case 9:
                    return TYPE_STRING;
                case 10:
                    return TYPE_GROUP;
                case 11:
                    return TYPE_MESSAGE;
                case 12:
                    return TYPE_BYTES;
                case 13:
                    return TYPE_UINT32;
                case 14:
                    return TYPE_ENUM;
                case 15:
                    return TYPE_SFIXED32;
                case 16:
                    return TYPE_SFIXED64;
                case 17:
                    return TYPE_SINT32;
                case 18:
                    return TYPE_SINT64;
                default:
                    return null;
            }
        }

        public static w98.InterfaceC14498e<EnumC15253d> internalGetValueMap() {
            return f98967u2;
        }

        public static w98.InterfaceC14499f internalGetVerifier() {
            return b.f98970a;
        }

        @Override // p000.w98.InterfaceC14497d
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.f98969a;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static EnumC15253d valueOf(int value) {
            return forNumber(value);
        }
    }

    static {
        xq5 xq5Var = new xq5();
        DEFAULT_INSTANCE = xq5Var;
        v27.m23715h0(xq5.class, xq5Var);
    }

    private xq5() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllOptions(Iterable<? extends w6c> values) {
        ensureOptionsIsMutable();
        AbstractC1714b3.m2856b(values, this.options_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOptions(w6c value) {
        value.getClass();
        ensureOptionsIsMutable();
        this.options_.add(value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCardinality() {
        this.cardinality_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDefaultValue() {
        this.defaultValue_ = getDefaultInstance().getDefaultValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearJsonName() {
        this.jsonName_ = getDefaultInstance().getJsonName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearKind() {
        this.kind_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNumber() {
        this.number_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOneofIndex() {
        this.oneofIndex_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOptions() {
        this.options_ = v27.m23722x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPacked() {
        this.packed_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTypeUrl() {
        this.typeUrl_ = getDefaultInstance().getTypeUrl();
    }

    private void ensureOptionsIsMutable() {
        w98.InterfaceC14504k<w6c> interfaceC14504k = this.options_;
        if (interfaceC14504k.isModifiable()) {
            return;
        }
        this.options_ = v27.m23698P(interfaceC14504k);
    }

    public static xq5 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C15251b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    public static xq5 parseDelimitedFrom(InputStream input) throws IOException {
        return (xq5) v27.m23700S(DEFAULT_INSTANCE, input);
    }

    public static xq5 parseFrom(ByteBuffer data) throws ce8 {
        return (xq5) v27.m23708a0(DEFAULT_INSTANCE, data);
    }

    public static uhc<xq5> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeOptions(int index) {
        ensureOptionsIsMutable();
        this.options_.remove(index);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCardinality(EnumC15252c value) {
        this.cardinality_ = value.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCardinalityValue(int value) {
        this.cardinality_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDefaultValue(String value) {
        value.getClass();
        this.defaultValue_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDefaultValueBytes(vj1 value) {
        AbstractC1714b3.m2857c(value);
        this.defaultValue_ = value.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJsonName(String value) {
        value.getClass();
        this.jsonName_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJsonNameBytes(vj1 value) {
        AbstractC1714b3.m2857c(value);
        this.jsonName_ = value.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKind(EnumC15253d value) {
        this.kind_ = value.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKindValue(int value) {
        this.kind_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String value) {
        value.getClass();
        this.name_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(vj1 value) {
        AbstractC1714b3.m2857c(value);
        this.name_ = value.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNumber(int value) {
        this.number_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOneofIndex(int value) {
        this.oneofIndex_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOptions(int index, w6c value) {
        value.getClass();
        ensureOptionsIsMutable();
        this.options_.set(index, value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPacked(boolean value) {
        this.packed_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeUrl(String value) {
        value.getClass();
        this.typeUrl_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeUrlBytes(vj1 value) {
        AbstractC1714b3.m2857c(value);
        this.typeUrl_ = value.toStringUtf8();
    }

    @Override // p000.ur5
    public EnumC15252c getCardinality() {
        EnumC15252c enumC15252cForNumber = EnumC15252c.forNumber(this.cardinality_);
        return enumC15252cForNumber == null ? EnumC15252c.UNRECOGNIZED : enumC15252cForNumber;
    }

    @Override // p000.ur5
    public int getCardinalityValue() {
        return this.cardinality_;
    }

    @Override // p000.ur5
    public String getDefaultValue() {
        return this.defaultValue_;
    }

    @Override // p000.ur5
    public vj1 getDefaultValueBytes() {
        return vj1.copyFromUtf8(this.defaultValue_);
    }

    @Override // p000.ur5
    public String getJsonName() {
        return this.jsonName_;
    }

    @Override // p000.ur5
    public vj1 getJsonNameBytes() {
        return vj1.copyFromUtf8(this.jsonName_);
    }

    @Override // p000.ur5
    public EnumC15253d getKind() {
        EnumC15253d enumC15253dForNumber = EnumC15253d.forNumber(this.kind_);
        return enumC15253dForNumber == null ? EnumC15253d.UNRECOGNIZED : enumC15253dForNumber;
    }

    @Override // p000.ur5
    public int getKindValue() {
        return this.kind_;
    }

    @Override // p000.ur5
    public String getName() {
        return this.name_;
    }

    @Override // p000.ur5
    public vj1 getNameBytes() {
        return vj1.copyFromUtf8(this.name_);
    }

    @Override // p000.ur5
    public int getNumber() {
        return this.number_;
    }

    @Override // p000.ur5
    public int getOneofIndex() {
        return this.oneofIndex_;
    }

    @Override // p000.ur5
    public w6c getOptions(int index) {
        return this.options_.get(index);
    }

    @Override // p000.ur5
    public int getOptionsCount() {
        return this.options_.size();
    }

    @Override // p000.ur5
    public List<w6c> getOptionsList() {
        return this.options_;
    }

    public x6c getOptionsOrBuilder(int index) {
        return this.options_.get(index);
    }

    public List<? extends x6c> getOptionsOrBuilderList() {
        return this.options_;
    }

    @Override // p000.ur5
    public boolean getPacked() {
        return this.packed_;
    }

    @Override // p000.ur5
    public String getTypeUrl() {
        return this.typeUrl_;
    }

    @Override // p000.ur5
    public vj1 getTypeUrlBytes() {
        return vj1.copyFromUtf8(this.typeUrl_);
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i method, Object arg0, Object arg1) {
        C15250a c15250a = null;
        switch (C15250a.f98914a[method.ordinal()]) {
            case 1:
                return new xq5();
            case 2:
                return new C15251b(c15250a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\n\u0000\u0000\u0001\u000b\n\u0000\u0001\u0000\u0001\f\u0002\f\u0003\u0004\u0004Ȉ\u0006Ȉ\u0007\u0004\b\u0007\t\u001b\nȈ\u000bȈ", new Object[]{"kind_", "cardinality_", "number_", "name_", "typeUrl_", "oneofIndex_", "packed_", "options_", w6c.class, "jsonName_", "defaultValue_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<xq5> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (xq5.class) {
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

    public static C15251b newBuilder(xq5 prototype) {
        return DEFAULT_INSTANCE.m23739o(prototype);
    }

    public static xq5 parseDelimitedFrom(InputStream input, zi5 extensionRegistry) throws IOException {
        return (xq5) v27.m23701T(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static xq5 parseFrom(ByteBuffer data, zi5 extensionRegistry) throws ce8 {
        return (xq5) v27.m23709b0(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static xq5 parseFrom(vj1 data) throws ce8 {
        return (xq5) v27.m23702U(DEFAULT_INSTANCE, data);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOptions(int index, w6c value) {
        value.getClass();
        ensureOptionsIsMutable();
        this.options_.add(index, value);
    }

    public static xq5 parseFrom(vj1 data, zi5 extensionRegistry) throws ce8 {
        return (xq5) v27.m23703V(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static xq5 parseFrom(byte[] data) throws ce8 {
        return (xq5) v27.m23710c0(DEFAULT_INSTANCE, data);
    }

    public static xq5 parseFrom(byte[] data, zi5 extensionRegistry) throws ce8 {
        return (xq5) v27.m23711d0(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static xq5 parseFrom(InputStream input) throws IOException {
        return (xq5) v27.m23706Y(DEFAULT_INSTANCE, input);
    }

    public static xq5 parseFrom(InputStream input, zi5 extensionRegistry) throws IOException {
        return (xq5) v27.m23707Z(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static xq5 parseFrom(f72 input) throws IOException {
        return (xq5) v27.m23704W(DEFAULT_INSTANCE, input);
    }

    public static xq5 parseFrom(f72 input, zi5 extensionRegistry) throws IOException {
        return (xq5) v27.m23705X(DEFAULT_INSTANCE, input, extensionRegistry);
    }
}
