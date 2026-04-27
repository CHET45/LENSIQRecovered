package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import p000.u27;
import p000.u6c;
import p000.v98;

/* JADX INFO: loaded from: classes3.dex */
public final class wq5 extends u27<wq5, C14745b> implements vr5 {
    public static final int CARDINALITY_FIELD_NUMBER = 2;
    private static final wq5 DEFAULT_INSTANCE;
    public static final int DEFAULT_VALUE_FIELD_NUMBER = 11;
    public static final int JSON_NAME_FIELD_NUMBER = 10;
    public static final int KIND_FIELD_NUMBER = 1;
    public static final int NAME_FIELD_NUMBER = 4;
    public static final int NUMBER_FIELD_NUMBER = 3;
    public static final int ONEOF_INDEX_FIELD_NUMBER = 7;
    public static final int OPTIONS_FIELD_NUMBER = 9;
    public static final int PACKED_FIELD_NUMBER = 8;
    private static volatile vhc<wq5> PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 6;
    private int cardinality_;
    private int kind_;
    private int number_;
    private int oneofIndex_;
    private boolean packed_;
    private String name_ = "";
    private String typeUrl_ = "";
    private v98.InterfaceC13956l<u6c> options_ = u27.m23036w();
    private String jsonName_ = "";
    private String defaultValue_ = "";

    /* JADX INFO: renamed from: wq5$a */
    public static /* synthetic */ class C14744a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f95069a;

        static {
            int[] iArr = new int[u27.EnumC13331i.values().length];
            f95069a = iArr;
            try {
                iArr[u27.EnumC13331i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f95069a[u27.EnumC13331i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f95069a[u27.EnumC13331i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f95069a[u27.EnumC13331i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f95069a[u27.EnumC13331i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f95069a[u27.EnumC13331i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f95069a[u27.EnumC13331i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: wq5$b */
    public static final class C14745b extends u27.AbstractC13324b<wq5, C14745b> implements vr5 {
        public /* synthetic */ C14745b(C14744a c14744a) {
            this();
        }

        public C14745b addAllOptions(Iterable<? extends u6c> values) {
            m23058e();
            ((wq5) this.f86607b).addAllOptions(values);
            return this;
        }

        public C14745b addOptions(u6c value) {
            m23058e();
            ((wq5) this.f86607b).addOptions(value);
            return this;
        }

        public C14745b clearCardinality() {
            m23058e();
            ((wq5) this.f86607b).clearCardinality();
            return this;
        }

        public C14745b clearDefaultValue() {
            m23058e();
            ((wq5) this.f86607b).clearDefaultValue();
            return this;
        }

        public C14745b clearJsonName() {
            m23058e();
            ((wq5) this.f86607b).clearJsonName();
            return this;
        }

        public C14745b clearKind() {
            m23058e();
            ((wq5) this.f86607b).clearKind();
            return this;
        }

        public C14745b clearName() {
            m23058e();
            ((wq5) this.f86607b).clearName();
            return this;
        }

        public C14745b clearNumber() {
            m23058e();
            ((wq5) this.f86607b).clearNumber();
            return this;
        }

        public C14745b clearOneofIndex() {
            m23058e();
            ((wq5) this.f86607b).clearOneofIndex();
            return this;
        }

        public C14745b clearOptions() {
            m23058e();
            ((wq5) this.f86607b).clearOptions();
            return this;
        }

        public C14745b clearPacked() {
            m23058e();
            ((wq5) this.f86607b).clearPacked();
            return this;
        }

        public C14745b clearTypeUrl() {
            m23058e();
            ((wq5) this.f86607b).clearTypeUrl();
            return this;
        }

        @Override // p000.vr5
        public EnumC14746c getCardinality() {
            return ((wq5) this.f86607b).getCardinality();
        }

        @Override // p000.vr5
        public int getCardinalityValue() {
            return ((wq5) this.f86607b).getCardinalityValue();
        }

        @Override // p000.vr5
        public String getDefaultValue() {
            return ((wq5) this.f86607b).getDefaultValue();
        }

        @Override // p000.vr5
        public wj1 getDefaultValueBytes() {
            return ((wq5) this.f86607b).getDefaultValueBytes();
        }

        @Override // p000.vr5
        public String getJsonName() {
            return ((wq5) this.f86607b).getJsonName();
        }

        @Override // p000.vr5
        public wj1 getJsonNameBytes() {
            return ((wq5) this.f86607b).getJsonNameBytes();
        }

        @Override // p000.vr5
        public EnumC14747d getKind() {
            return ((wq5) this.f86607b).getKind();
        }

        @Override // p000.vr5
        public int getKindValue() {
            return ((wq5) this.f86607b).getKindValue();
        }

        @Override // p000.vr5
        public String getName() {
            return ((wq5) this.f86607b).getName();
        }

        @Override // p000.vr5
        public wj1 getNameBytes() {
            return ((wq5) this.f86607b).getNameBytes();
        }

        @Override // p000.vr5
        public int getNumber() {
            return ((wq5) this.f86607b).getNumber();
        }

        @Override // p000.vr5
        public int getOneofIndex() {
            return ((wq5) this.f86607b).getOneofIndex();
        }

        @Override // p000.vr5
        public u6c getOptions(int index) {
            return ((wq5) this.f86607b).getOptions(index);
        }

        @Override // p000.vr5
        public int getOptionsCount() {
            return ((wq5) this.f86607b).getOptionsCount();
        }

        @Override // p000.vr5
        public List<u6c> getOptionsList() {
            return Collections.unmodifiableList(((wq5) this.f86607b).getOptionsList());
        }

        @Override // p000.vr5
        public boolean getPacked() {
            return ((wq5) this.f86607b).getPacked();
        }

        @Override // p000.vr5
        public String getTypeUrl() {
            return ((wq5) this.f86607b).getTypeUrl();
        }

        @Override // p000.vr5
        public wj1 getTypeUrlBytes() {
            return ((wq5) this.f86607b).getTypeUrlBytes();
        }

        public C14745b removeOptions(int index) {
            m23058e();
            ((wq5) this.f86607b).removeOptions(index);
            return this;
        }

        public C14745b setCardinality(EnumC14746c value) {
            m23058e();
            ((wq5) this.f86607b).setCardinality(value);
            return this;
        }

        public C14745b setCardinalityValue(int value) {
            m23058e();
            ((wq5) this.f86607b).setCardinalityValue(value);
            return this;
        }

        public C14745b setDefaultValue(String value) {
            m23058e();
            ((wq5) this.f86607b).setDefaultValue(value);
            return this;
        }

        public C14745b setDefaultValueBytes(wj1 value) {
            m23058e();
            ((wq5) this.f86607b).setDefaultValueBytes(value);
            return this;
        }

        public C14745b setJsonName(String value) {
            m23058e();
            ((wq5) this.f86607b).setJsonName(value);
            return this;
        }

        public C14745b setJsonNameBytes(wj1 value) {
            m23058e();
            ((wq5) this.f86607b).setJsonNameBytes(value);
            return this;
        }

        public C14745b setKind(EnumC14747d value) {
            m23058e();
            ((wq5) this.f86607b).setKind(value);
            return this;
        }

        public C14745b setKindValue(int value) {
            m23058e();
            ((wq5) this.f86607b).setKindValue(value);
            return this;
        }

        public C14745b setName(String value) {
            m23058e();
            ((wq5) this.f86607b).setName(value);
            return this;
        }

        public C14745b setNameBytes(wj1 value) {
            m23058e();
            ((wq5) this.f86607b).setNameBytes(value);
            return this;
        }

        public C14745b setNumber(int value) {
            m23058e();
            ((wq5) this.f86607b).setNumber(value);
            return this;
        }

        public C14745b setOneofIndex(int value) {
            m23058e();
            ((wq5) this.f86607b).setOneofIndex(value);
            return this;
        }

        public C14745b setOptions(int index, u6c value) {
            m23058e();
            ((wq5) this.f86607b).setOptions(index, value);
            return this;
        }

        public C14745b setPacked(boolean value) {
            m23058e();
            ((wq5) this.f86607b).setPacked(value);
            return this;
        }

        public C14745b setTypeUrl(String value) {
            m23058e();
            ((wq5) this.f86607b).setTypeUrl(value);
            return this;
        }

        public C14745b setTypeUrlBytes(wj1 value) {
            m23058e();
            ((wq5) this.f86607b).setTypeUrlBytes(value);
            return this;
        }

        private C14745b() {
            super(wq5.DEFAULT_INSTANCE);
        }

        public C14745b addOptions(int index, u6c value) {
            m23058e();
            ((wq5) this.f86607b).addOptions(index, value);
            return this;
        }

        public C14745b setOptions(int index, u6c.C13378b builderForValue) {
            m23058e();
            ((wq5) this.f86607b).setOptions(index, builderForValue.build());
            return this;
        }

        public C14745b addOptions(u6c.C13378b builderForValue) {
            m23058e();
            ((wq5) this.f86607b).addOptions(builderForValue.build());
            return this;
        }

        public C14745b addOptions(int index, u6c.C13378b builderForValue) {
            m23058e();
            ((wq5) this.f86607b).addOptions(index, builderForValue.build());
            return this;
        }
    }

    /* JADX INFO: renamed from: wq5$c */
    public enum EnumC14746c implements v98.InterfaceC13947c {
        CARDINALITY_UNKNOWN(0),
        CARDINALITY_OPTIONAL(1),
        CARDINALITY_REQUIRED(2),
        CARDINALITY_REPEATED(3),
        UNRECOGNIZED(-1);


        /* JADX INFO: renamed from: C */
        public static final int f95070C = 1;

        /* JADX INFO: renamed from: F */
        public static final int f95071F = 2;

        /* JADX INFO: renamed from: H */
        public static final int f95072H = 3;

        /* JADX INFO: renamed from: L */
        public static final v98.InterfaceC13948d<EnumC14746c> f95073L = new a();

        /* JADX INFO: renamed from: m */
        public static final int f95080m = 0;

        /* JADX INFO: renamed from: a */
        public final int f95081a;

        /* JADX INFO: renamed from: wq5$c$a */
        public class a implements v98.InterfaceC13948d<EnumC14746c> {
            @Override // p000.v98.InterfaceC13948d
            public EnumC14746c findValueByNumber(int number) {
                return EnumC14746c.forNumber(number);
            }
        }

        /* JADX INFO: renamed from: wq5$c$b */
        public static final class b implements v98.InterfaceC13949e {

            /* JADX INFO: renamed from: a */
            public static final v98.InterfaceC13949e f95082a = new b();

            private b() {
            }

            @Override // p000.v98.InterfaceC13949e
            public boolean isInRange(int number) {
                return EnumC14746c.forNumber(number) != null;
            }
        }

        EnumC14746c(int value) {
            this.f95081a = value;
        }

        public static EnumC14746c forNumber(int value) {
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

        public static v98.InterfaceC13948d<EnumC14746c> internalGetValueMap() {
            return f95073L;
        }

        public static v98.InterfaceC13949e internalGetVerifier() {
            return b.f95082a;
        }

        @Override // p000.v98.InterfaceC13947c
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.f95081a;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static EnumC14746c valueOf(int value) {
            return forNumber(value);
        }
    }

    /* JADX INFO: renamed from: wq5$d */
    public enum EnumC14747d implements v98.InterfaceC13947c {
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
        public static final int f95098b2 = 0;

        /* JADX INFO: renamed from: c2 */
        public static final int f95100c2 = 1;

        /* JADX INFO: renamed from: d2 */
        public static final int f95102d2 = 2;

        /* JADX INFO: renamed from: e2 */
        public static final int f95104e2 = 3;

        /* JADX INFO: renamed from: f2 */
        public static final int f95106f2 = 4;

        /* JADX INFO: renamed from: g2 */
        public static final int f95107g2 = 5;

        /* JADX INFO: renamed from: h2 */
        public static final int f95108h2 = 6;

        /* JADX INFO: renamed from: i2 */
        public static final int f95109i2 = 7;

        /* JADX INFO: renamed from: j2 */
        public static final int f95110j2 = 8;

        /* JADX INFO: renamed from: k2 */
        public static final int f95111k2 = 9;

        /* JADX INFO: renamed from: l2 */
        public static final int f95112l2 = 10;

        /* JADX INFO: renamed from: m2 */
        public static final int f95114m2 = 11;

        /* JADX INFO: renamed from: n2 */
        public static final int f95115n2 = 12;

        /* JADX INFO: renamed from: o2 */
        public static final int f95116o2 = 13;

        /* JADX INFO: renamed from: p2 */
        public static final int f95117p2 = 14;

        /* JADX INFO: renamed from: q2 */
        public static final int f95118q2 = 15;

        /* JADX INFO: renamed from: r2 */
        public static final int f95119r2 = 16;

        /* JADX INFO: renamed from: s2 */
        public static final int f95120s2 = 17;

        /* JADX INFO: renamed from: t2 */
        public static final int f95121t2 = 18;

        /* JADX INFO: renamed from: u2 */
        public static final v98.InterfaceC13948d<EnumC14747d> f95122u2 = new a();

        /* JADX INFO: renamed from: a */
        public final int f95124a;

        /* JADX INFO: renamed from: wq5$d$a */
        public class a implements v98.InterfaceC13948d<EnumC14747d> {
            @Override // p000.v98.InterfaceC13948d
            public EnumC14747d findValueByNumber(int number) {
                return EnumC14747d.forNumber(number);
            }
        }

        /* JADX INFO: renamed from: wq5$d$b */
        public static final class b implements v98.InterfaceC13949e {

            /* JADX INFO: renamed from: a */
            public static final v98.InterfaceC13949e f95125a = new b();

            private b() {
            }

            @Override // p000.v98.InterfaceC13949e
            public boolean isInRange(int number) {
                return EnumC14747d.forNumber(number) != null;
            }
        }

        EnumC14747d(int value) {
            this.f95124a = value;
        }

        public static EnumC14747d forNumber(int value) {
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

        public static v98.InterfaceC13948d<EnumC14747d> internalGetValueMap() {
            return f95122u2;
        }

        public static v98.InterfaceC13949e internalGetVerifier() {
            return b.f95125a;
        }

        @Override // p000.v98.InterfaceC13947c
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.f95124a;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static EnumC14747d valueOf(int value) {
            return forNumber(value);
        }
    }

    static {
        wq5 wq5Var = new wq5();
        DEFAULT_INSTANCE = wq5Var;
        u27.m23029g0(wq5.class, wq5Var);
    }

    private wq5() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllOptions(Iterable<? extends u6c> values) {
        ensureOptionsIsMutable();
        AbstractC0027a3.m80a(values, this.options_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOptions(u6c value) {
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
        this.options_ = u27.m23036w();
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
        v98.InterfaceC13956l<u6c> interfaceC13956l = this.options_;
        if (interfaceC13956l.isModifiable()) {
            return;
        }
        this.options_ = u27.m23012O(interfaceC13956l);
    }

    public static wq5 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C14745b newBuilder() {
        return DEFAULT_INSTANCE.m23053m();
    }

    public static wq5 parseDelimitedFrom(InputStream input) throws IOException {
        return (wq5) u27.m23014R(DEFAULT_INSTANCE, input);
    }

    public static wq5 parseFrom(ByteBuffer data) throws be8 {
        return (wq5) u27.m23022Z(DEFAULT_INSTANCE, data);
    }

    public static vhc<wq5> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeOptions(int index) {
        ensureOptionsIsMutable();
        this.options_.remove(index);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCardinality(EnumC14746c value) {
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
    public void setDefaultValueBytes(wj1 value) {
        AbstractC0027a3.m81b(value);
        this.defaultValue_ = value.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJsonName(String value) {
        value.getClass();
        this.jsonName_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJsonNameBytes(wj1 value) {
        AbstractC0027a3.m81b(value);
        this.jsonName_ = value.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKind(EnumC14747d value) {
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
    public void setNameBytes(wj1 value) {
        AbstractC0027a3.m81b(value);
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
    public void setOptions(int index, u6c value) {
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
    public void setTypeUrlBytes(wj1 value) {
        AbstractC0027a3.m81b(value);
        this.typeUrl_ = value.toStringUtf8();
    }

    @Override // p000.vr5
    public EnumC14746c getCardinality() {
        EnumC14746c enumC14746cForNumber = EnumC14746c.forNumber(this.cardinality_);
        return enumC14746cForNumber == null ? EnumC14746c.UNRECOGNIZED : enumC14746cForNumber;
    }

    @Override // p000.vr5
    public int getCardinalityValue() {
        return this.cardinality_;
    }

    @Override // p000.vr5
    public String getDefaultValue() {
        return this.defaultValue_;
    }

    @Override // p000.vr5
    public wj1 getDefaultValueBytes() {
        return wj1.copyFromUtf8(this.defaultValue_);
    }

    @Override // p000.vr5
    public String getJsonName() {
        return this.jsonName_;
    }

    @Override // p000.vr5
    public wj1 getJsonNameBytes() {
        return wj1.copyFromUtf8(this.jsonName_);
    }

    @Override // p000.vr5
    public EnumC14747d getKind() {
        EnumC14747d enumC14747dForNumber = EnumC14747d.forNumber(this.kind_);
        return enumC14747dForNumber == null ? EnumC14747d.UNRECOGNIZED : enumC14747dForNumber;
    }

    @Override // p000.vr5
    public int getKindValue() {
        return this.kind_;
    }

    @Override // p000.vr5
    public String getName() {
        return this.name_;
    }

    @Override // p000.vr5
    public wj1 getNameBytes() {
        return wj1.copyFromUtf8(this.name_);
    }

    @Override // p000.vr5
    public int getNumber() {
        return this.number_;
    }

    @Override // p000.vr5
    public int getOneofIndex() {
        return this.oneofIndex_;
    }

    @Override // p000.vr5
    public u6c getOptions(int index) {
        return this.options_.get(index);
    }

    @Override // p000.vr5
    public int getOptionsCount() {
        return this.options_.size();
    }

    @Override // p000.vr5
    public List<u6c> getOptionsList() {
        return this.options_;
    }

    public y6c getOptionsOrBuilder(int index) {
        return this.options_.get(index);
    }

    public List<? extends y6c> getOptionsOrBuilderList() {
        return this.options_;
    }

    @Override // p000.vr5
    public boolean getPacked() {
        return this.packed_;
    }

    @Override // p000.vr5
    public String getTypeUrl() {
        return this.typeUrl_;
    }

    @Override // p000.vr5
    public wj1 getTypeUrlBytes() {
        return wj1.copyFromUtf8(this.typeUrl_);
    }

    @Override // p000.u27
    /* JADX INFO: renamed from: q */
    public final Object mo79q(u27.EnumC13331i method, Object arg0, Object arg1) {
        C14744a c14744a = null;
        switch (C14744a.f95069a[method.ordinal()]) {
            case 1:
                return new wq5();
            case 2:
                return new C14745b(c14744a);
            case 3:
                return u27.m23013P(DEFAULT_INSTANCE, "\u0000\n\u0000\u0000\u0001\u000b\n\u0000\u0001\u0000\u0001\f\u0002\f\u0003\u0004\u0004Ȉ\u0006Ȉ\u0007\u0004\b\u0007\t\u001b\nȈ\u000bȈ", new Object[]{"kind_", "cardinality_", "number_", "name_", "typeUrl_", "oneofIndex_", "packed_", "options_", u6c.class, "jsonName_", "defaultValue_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                vhc<wq5> c13325c = PARSER;
                if (c13325c == null) {
                    synchronized (wq5.class) {
                        try {
                            c13325c = PARSER;
                            if (c13325c == null) {
                                c13325c = new u27.C13325c<>(DEFAULT_INSTANCE);
                                PARSER = c13325c;
                            }
                        } finally {
                        }
                        break;
                    }
                }
                return c13325c;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public static C14745b newBuilder(wq5 prototype) {
        return DEFAULT_INSTANCE.m23054n(prototype);
    }

    public static wq5 parseDelimitedFrom(InputStream input, yi5 extensionRegistry) throws IOException {
        return (wq5) u27.m23015S(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static wq5 parseFrom(ByteBuffer data, yi5 extensionRegistry) throws be8 {
        return (wq5) u27.m23023a0(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static wq5 parseFrom(wj1 data) throws be8 {
        return (wq5) u27.m23016T(DEFAULT_INSTANCE, data);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOptions(int index, u6c value) {
        value.getClass();
        ensureOptionsIsMutable();
        this.options_.add(index, value);
    }

    public static wq5 parseFrom(wj1 data, yi5 extensionRegistry) throws be8 {
        return (wq5) u27.m23017U(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static wq5 parseFrom(byte[] data) throws be8 {
        return (wq5) u27.m23024b0(DEFAULT_INSTANCE, data);
    }

    public static wq5 parseFrom(byte[] data, yi5 extensionRegistry) throws be8 {
        return (wq5) u27.m23025c0(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static wq5 parseFrom(InputStream input) throws IOException {
        return (wq5) u27.m23020X(DEFAULT_INSTANCE, input);
    }

    public static wq5 parseFrom(InputStream input, yi5 extensionRegistry) throws IOException {
        return (wq5) u27.m23021Y(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static wq5 parseFrom(e72 input) throws IOException {
        return (wq5) u27.m23018V(DEFAULT_INSTANCE, input);
    }

    public static wq5 parseFrom(e72 input, yi5 extensionRegistry) throws IOException {
        return (wq5) u27.m23019W(DEFAULT_INSTANCE, input, extensionRegistry);
    }
}
