package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import p000.v27;
import p000.w98;

/* JADX INFO: loaded from: classes4.dex */
public final class m74 {

    /* JADX INFO: renamed from: m74$a */
    public static /* synthetic */ class C9169a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f60048a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f60048a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f60048a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f60048a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f60048a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f60048a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f60048a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f60048a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: m74$a0 */
    public interface InterfaceC9170a0 extends v27.InterfaceC13827f<C9211z, C9211z.a> {
        boolean getDeprecated();

        boolean getMapEntry();

        boolean getMessageSetWireFormat();

        boolean getNoStandardDescriptorAccessor();

        C9200p0 getUninterpretedOption(int i);

        int getUninterpretedOptionCount();

        List<C9200p0> getUninterpretedOptionList();

        boolean hasDeprecated();

        boolean hasMapEntry();

        boolean hasMessageSetWireFormat();

        boolean hasNoStandardDescriptorAccessor();
    }

    /* JADX INFO: renamed from: m74$b */
    public static final class C9171b extends v27<C9171b, a> implements InterfaceC9173c {
        private static final C9171b DEFAULT_INSTANCE;
        public static final int ENUM_TYPE_FIELD_NUMBER = 4;
        public static final int EXTENSION_FIELD_NUMBER = 6;
        public static final int EXTENSION_RANGE_FIELD_NUMBER = 5;
        public static final int FIELD_FIELD_NUMBER = 2;
        public static final int NAME_FIELD_NUMBER = 1;
        public static final int NESTED_TYPE_FIELD_NUMBER = 3;
        public static final int ONEOF_DECL_FIELD_NUMBER = 8;
        public static final int OPTIONS_FIELD_NUMBER = 7;
        private static volatile uhc<C9171b> PARSER = null;
        public static final int RESERVED_NAME_FIELD_NUMBER = 10;
        public static final int RESERVED_RANGE_FIELD_NUMBER = 9;
        private int bitField0_;
        private C9211z options_;
        private byte memoizedIsInitialized = 2;
        private String name_ = "";
        private w98.InterfaceC14504k<C9195n> field_ = v27.m23722x();
        private w98.InterfaceC14504k<C9195n> extension_ = v27.m23722x();
        private w98.InterfaceC14504k<C9171b> nestedType_ = v27.m23722x();
        private w98.InterfaceC14504k<C9175d> enumType_ = v27.m23722x();
        private w98.InterfaceC14504k<b> extensionRange_ = v27.m23722x();
        private w98.InterfaceC14504k<C9180f0> oneofDecl_ = v27.m23722x();
        private w98.InterfaceC14504k<d> reservedRange_ = v27.m23722x();
        private w98.InterfaceC14504k<String> reservedName_ = v27.m23722x();

        /* JADX INFO: renamed from: m74$b$a */
        public static final class a extends v27.AbstractC13823b<C9171b, a> implements InterfaceC9173c {
            public /* synthetic */ a(C9169a c9169a) {
                this();
            }

            public a addAllEnumType(Iterable<? extends C9175d> iterable) {
                m23743e();
                ((C9171b) this.f89756b).addAllEnumType(iterable);
                return this;
            }

            public a addAllExtension(Iterable<? extends C9195n> iterable) {
                m23743e();
                ((C9171b) this.f89756b).addAllExtension(iterable);
                return this;
            }

            public a addAllExtensionRange(Iterable<? extends b> iterable) {
                m23743e();
                ((C9171b) this.f89756b).addAllExtensionRange(iterable);
                return this;
            }

            public a addAllField(Iterable<? extends C9195n> iterable) {
                m23743e();
                ((C9171b) this.f89756b).addAllField(iterable);
                return this;
            }

            public a addAllNestedType(Iterable<? extends C9171b> iterable) {
                m23743e();
                ((C9171b) this.f89756b).addAllNestedType(iterable);
                return this;
            }

            public a addAllOneofDecl(Iterable<? extends C9180f0> iterable) {
                m23743e();
                ((C9171b) this.f89756b).addAllOneofDecl(iterable);
                return this;
            }

            public a addAllReservedName(Iterable<String> iterable) {
                m23743e();
                ((C9171b) this.f89756b).addAllReservedName(iterable);
                return this;
            }

            public a addAllReservedRange(Iterable<? extends d> iterable) {
                m23743e();
                ((C9171b) this.f89756b).addAllReservedRange(iterable);
                return this;
            }

            public a addEnumType(C9175d c9175d) {
                m23743e();
                ((C9171b) this.f89756b).addEnumType(c9175d);
                return this;
            }

            public a addExtension(C9195n c9195n) {
                m23743e();
                ((C9171b) this.f89756b).addExtension(c9195n);
                return this;
            }

            public a addExtensionRange(b bVar) {
                m23743e();
                ((C9171b) this.f89756b).addExtensionRange(bVar);
                return this;
            }

            public a addField(C9195n c9195n) {
                m23743e();
                ((C9171b) this.f89756b).addField(c9195n);
                return this;
            }

            public a addNestedType(C9171b c9171b) {
                m23743e();
                ((C9171b) this.f89756b).addNestedType(c9171b);
                return this;
            }

            public a addOneofDecl(C9180f0 c9180f0) {
                m23743e();
                ((C9171b) this.f89756b).addOneofDecl(c9180f0);
                return this;
            }

            public a addReservedName(String str) {
                m23743e();
                ((C9171b) this.f89756b).addReservedName(str);
                return this;
            }

            public a addReservedNameBytes(vj1 vj1Var) {
                m23743e();
                ((C9171b) this.f89756b).addReservedNameBytes(vj1Var);
                return this;
            }

            public a addReservedRange(d dVar) {
                m23743e();
                ((C9171b) this.f89756b).addReservedRange(dVar);
                return this;
            }

            public a clearEnumType() {
                m23743e();
                ((C9171b) this.f89756b).clearEnumType();
                return this;
            }

            public a clearExtension() {
                m23743e();
                ((C9171b) this.f89756b).clearExtension();
                return this;
            }

            public a clearExtensionRange() {
                m23743e();
                ((C9171b) this.f89756b).clearExtensionRange();
                return this;
            }

            public a clearField() {
                m23743e();
                ((C9171b) this.f89756b).clearField();
                return this;
            }

            public a clearName() {
                m23743e();
                ((C9171b) this.f89756b).clearName();
                return this;
            }

            public a clearNestedType() {
                m23743e();
                ((C9171b) this.f89756b).clearNestedType();
                return this;
            }

            public a clearOneofDecl() {
                m23743e();
                ((C9171b) this.f89756b).clearOneofDecl();
                return this;
            }

            public a clearOptions() {
                m23743e();
                ((C9171b) this.f89756b).clearOptions();
                return this;
            }

            public a clearReservedName() {
                m23743e();
                ((C9171b) this.f89756b).clearReservedName();
                return this;
            }

            public a clearReservedRange() {
                m23743e();
                ((C9171b) this.f89756b).clearReservedRange();
                return this;
            }

            @Override // p000.m74.InterfaceC9173c
            public C9175d getEnumType(int i) {
                return ((C9171b) this.f89756b).getEnumType(i);
            }

            @Override // p000.m74.InterfaceC9173c
            public int getEnumTypeCount() {
                return ((C9171b) this.f89756b).getEnumTypeCount();
            }

            @Override // p000.m74.InterfaceC9173c
            public List<C9175d> getEnumTypeList() {
                return Collections.unmodifiableList(((C9171b) this.f89756b).getEnumTypeList());
            }

            @Override // p000.m74.InterfaceC9173c
            public C9195n getExtension(int i) {
                return ((C9171b) this.f89756b).getExtension(i);
            }

            @Override // p000.m74.InterfaceC9173c
            public int getExtensionCount() {
                return ((C9171b) this.f89756b).getExtensionCount();
            }

            @Override // p000.m74.InterfaceC9173c
            public List<C9195n> getExtensionList() {
                return Collections.unmodifiableList(((C9171b) this.f89756b).getExtensionList());
            }

            @Override // p000.m74.InterfaceC9173c
            public b getExtensionRange(int i) {
                return ((C9171b) this.f89756b).getExtensionRange(i);
            }

            @Override // p000.m74.InterfaceC9173c
            public int getExtensionRangeCount() {
                return ((C9171b) this.f89756b).getExtensionRangeCount();
            }

            @Override // p000.m74.InterfaceC9173c
            public List<b> getExtensionRangeList() {
                return Collections.unmodifiableList(((C9171b) this.f89756b).getExtensionRangeList());
            }

            @Override // p000.m74.InterfaceC9173c
            public C9195n getField(int i) {
                return ((C9171b) this.f89756b).getField(i);
            }

            @Override // p000.m74.InterfaceC9173c
            public int getFieldCount() {
                return ((C9171b) this.f89756b).getFieldCount();
            }

            @Override // p000.m74.InterfaceC9173c
            public List<C9195n> getFieldList() {
                return Collections.unmodifiableList(((C9171b) this.f89756b).getFieldList());
            }

            @Override // p000.m74.InterfaceC9173c
            public String getName() {
                return ((C9171b) this.f89756b).getName();
            }

            @Override // p000.m74.InterfaceC9173c
            public vj1 getNameBytes() {
                return ((C9171b) this.f89756b).getNameBytes();
            }

            @Override // p000.m74.InterfaceC9173c
            public C9171b getNestedType(int i) {
                return ((C9171b) this.f89756b).getNestedType(i);
            }

            @Override // p000.m74.InterfaceC9173c
            public int getNestedTypeCount() {
                return ((C9171b) this.f89756b).getNestedTypeCount();
            }

            @Override // p000.m74.InterfaceC9173c
            public List<C9171b> getNestedTypeList() {
                return Collections.unmodifiableList(((C9171b) this.f89756b).getNestedTypeList());
            }

            @Override // p000.m74.InterfaceC9173c
            public C9180f0 getOneofDecl(int i) {
                return ((C9171b) this.f89756b).getOneofDecl(i);
            }

            @Override // p000.m74.InterfaceC9173c
            public int getOneofDeclCount() {
                return ((C9171b) this.f89756b).getOneofDeclCount();
            }

            @Override // p000.m74.InterfaceC9173c
            public List<C9180f0> getOneofDeclList() {
                return Collections.unmodifiableList(((C9171b) this.f89756b).getOneofDeclList());
            }

            @Override // p000.m74.InterfaceC9173c
            public C9211z getOptions() {
                return ((C9171b) this.f89756b).getOptions();
            }

            @Override // p000.m74.InterfaceC9173c
            public String getReservedName(int i) {
                return ((C9171b) this.f89756b).getReservedName(i);
            }

            @Override // p000.m74.InterfaceC9173c
            public vj1 getReservedNameBytes(int i) {
                return ((C9171b) this.f89756b).getReservedNameBytes(i);
            }

            @Override // p000.m74.InterfaceC9173c
            public int getReservedNameCount() {
                return ((C9171b) this.f89756b).getReservedNameCount();
            }

            @Override // p000.m74.InterfaceC9173c
            public List<String> getReservedNameList() {
                return Collections.unmodifiableList(((C9171b) this.f89756b).getReservedNameList());
            }

            @Override // p000.m74.InterfaceC9173c
            public d getReservedRange(int i) {
                return ((C9171b) this.f89756b).getReservedRange(i);
            }

            @Override // p000.m74.InterfaceC9173c
            public int getReservedRangeCount() {
                return ((C9171b) this.f89756b).getReservedRangeCount();
            }

            @Override // p000.m74.InterfaceC9173c
            public List<d> getReservedRangeList() {
                return Collections.unmodifiableList(((C9171b) this.f89756b).getReservedRangeList());
            }

            @Override // p000.m74.InterfaceC9173c
            public boolean hasName() {
                return ((C9171b) this.f89756b).hasName();
            }

            @Override // p000.m74.InterfaceC9173c
            public boolean hasOptions() {
                return ((C9171b) this.f89756b).hasOptions();
            }

            public a mergeOptions(C9211z c9211z) {
                m23743e();
                ((C9171b) this.f89756b).mergeOptions(c9211z);
                return this;
            }

            public a removeEnumType(int i) {
                m23743e();
                ((C9171b) this.f89756b).removeEnumType(i);
                return this;
            }

            public a removeExtension(int i) {
                m23743e();
                ((C9171b) this.f89756b).removeExtension(i);
                return this;
            }

            public a removeExtensionRange(int i) {
                m23743e();
                ((C9171b) this.f89756b).removeExtensionRange(i);
                return this;
            }

            public a removeField(int i) {
                m23743e();
                ((C9171b) this.f89756b).removeField(i);
                return this;
            }

            public a removeNestedType(int i) {
                m23743e();
                ((C9171b) this.f89756b).removeNestedType(i);
                return this;
            }

            public a removeOneofDecl(int i) {
                m23743e();
                ((C9171b) this.f89756b).removeOneofDecl(i);
                return this;
            }

            public a removeReservedRange(int i) {
                m23743e();
                ((C9171b) this.f89756b).removeReservedRange(i);
                return this;
            }

            public a setEnumType(int i, C9175d c9175d) {
                m23743e();
                ((C9171b) this.f89756b).setEnumType(i, c9175d);
                return this;
            }

            public a setExtension(int i, C9195n c9195n) {
                m23743e();
                ((C9171b) this.f89756b).setExtension(i, c9195n);
                return this;
            }

            public a setExtensionRange(int i, b bVar) {
                m23743e();
                ((C9171b) this.f89756b).setExtensionRange(i, bVar);
                return this;
            }

            public a setField(int i, C9195n c9195n) {
                m23743e();
                ((C9171b) this.f89756b).setField(i, c9195n);
                return this;
            }

            public a setName(String str) {
                m23743e();
                ((C9171b) this.f89756b).setName(str);
                return this;
            }

            public a setNameBytes(vj1 vj1Var) {
                m23743e();
                ((C9171b) this.f89756b).setNameBytes(vj1Var);
                return this;
            }

            public a setNestedType(int i, C9171b c9171b) {
                m23743e();
                ((C9171b) this.f89756b).setNestedType(i, c9171b);
                return this;
            }

            public a setOneofDecl(int i, C9180f0 c9180f0) {
                m23743e();
                ((C9171b) this.f89756b).setOneofDecl(i, c9180f0);
                return this;
            }

            public a setOptions(C9211z c9211z) {
                m23743e();
                ((C9171b) this.f89756b).setOptions(c9211z);
                return this;
            }

            public a setReservedName(int i, String str) {
                m23743e();
                ((C9171b) this.f89756b).setReservedName(i, str);
                return this;
            }

            public a setReservedRange(int i, d dVar) {
                m23743e();
                ((C9171b) this.f89756b).setReservedRange(i, dVar);
                return this;
            }

            private a() {
                super(C9171b.DEFAULT_INSTANCE);
            }

            public a addEnumType(int i, C9175d c9175d) {
                m23743e();
                ((C9171b) this.f89756b).addEnumType(i, c9175d);
                return this;
            }

            public a addExtension(int i, C9195n c9195n) {
                m23743e();
                ((C9171b) this.f89756b).addExtension(i, c9195n);
                return this;
            }

            public a addExtensionRange(int i, b bVar) {
                m23743e();
                ((C9171b) this.f89756b).addExtensionRange(i, bVar);
                return this;
            }

            public a addField(int i, C9195n c9195n) {
                m23743e();
                ((C9171b) this.f89756b).addField(i, c9195n);
                return this;
            }

            public a addNestedType(int i, C9171b c9171b) {
                m23743e();
                ((C9171b) this.f89756b).addNestedType(i, c9171b);
                return this;
            }

            public a addOneofDecl(int i, C9180f0 c9180f0) {
                m23743e();
                ((C9171b) this.f89756b).addOneofDecl(i, c9180f0);
                return this;
            }

            public a addReservedRange(int i, d dVar) {
                m23743e();
                ((C9171b) this.f89756b).addReservedRange(i, dVar);
                return this;
            }

            public a setEnumType(int i, C9175d.a aVar) {
                m23743e();
                ((C9171b) this.f89756b).setEnumType(i, aVar.build());
                return this;
            }

            public a setExtension(int i, C9195n.a aVar) {
                m23743e();
                ((C9171b) this.f89756b).setExtension(i, aVar.build());
                return this;
            }

            public a setExtensionRange(int i, b.a aVar) {
                m23743e();
                ((C9171b) this.f89756b).setExtensionRange(i, aVar.build());
                return this;
            }

            public a setField(int i, C9195n.a aVar) {
                m23743e();
                ((C9171b) this.f89756b).setField(i, aVar.build());
                return this;
            }

            public a setNestedType(int i, a aVar) {
                m23743e();
                ((C9171b) this.f89756b).setNestedType(i, aVar.build());
                return this;
            }

            public a setOneofDecl(int i, C9180f0.a aVar) {
                m23743e();
                ((C9171b) this.f89756b).setOneofDecl(i, aVar.build());
                return this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public a setOptions(C9211z.a aVar) {
                m23743e();
                ((C9171b) this.f89756b).setOptions((C9211z) aVar.build());
                return this;
            }

            public a setReservedRange(int i, d.a aVar) {
                m23743e();
                ((C9171b) this.f89756b).setReservedRange(i, aVar.build());
                return this;
            }

            public a addEnumType(C9175d.a aVar) {
                m23743e();
                ((C9171b) this.f89756b).addEnumType(aVar.build());
                return this;
            }

            public a addExtension(C9195n.a aVar) {
                m23743e();
                ((C9171b) this.f89756b).addExtension(aVar.build());
                return this;
            }

            public a addExtensionRange(b.a aVar) {
                m23743e();
                ((C9171b) this.f89756b).addExtensionRange(aVar.build());
                return this;
            }

            public a addField(C9195n.a aVar) {
                m23743e();
                ((C9171b) this.f89756b).addField(aVar.build());
                return this;
            }

            public a addNestedType(a aVar) {
                m23743e();
                ((C9171b) this.f89756b).addNestedType(aVar.build());
                return this;
            }

            public a addOneofDecl(C9180f0.a aVar) {
                m23743e();
                ((C9171b) this.f89756b).addOneofDecl(aVar.build());
                return this;
            }

            public a addReservedRange(d.a aVar) {
                m23743e();
                ((C9171b) this.f89756b).addReservedRange(aVar.build());
                return this;
            }

            public a addEnumType(int i, C9175d.a aVar) {
                m23743e();
                ((C9171b) this.f89756b).addEnumType(i, aVar.build());
                return this;
            }

            public a addExtension(int i, C9195n.a aVar) {
                m23743e();
                ((C9171b) this.f89756b).addExtension(i, aVar.build());
                return this;
            }

            public a addExtensionRange(int i, b.a aVar) {
                m23743e();
                ((C9171b) this.f89756b).addExtensionRange(i, aVar.build());
                return this;
            }

            public a addField(int i, C9195n.a aVar) {
                m23743e();
                ((C9171b) this.f89756b).addField(i, aVar.build());
                return this;
            }

            public a addNestedType(int i, a aVar) {
                m23743e();
                ((C9171b) this.f89756b).addNestedType(i, aVar.build());
                return this;
            }

            public a addOneofDecl(int i, C9180f0.a aVar) {
                m23743e();
                ((C9171b) this.f89756b).addOneofDecl(i, aVar.build());
                return this;
            }

            public a addReservedRange(int i, d.a aVar) {
                m23743e();
                ((C9171b) this.f89756b).addReservedRange(i, aVar.build());
                return this;
            }
        }

        /* JADX INFO: renamed from: m74$b$b */
        public static final class b extends v27<b, a> implements c {
            private static final b DEFAULT_INSTANCE;
            public static final int END_FIELD_NUMBER = 2;
            public static final int OPTIONS_FIELD_NUMBER = 3;
            private static volatile uhc<b> PARSER = null;
            public static final int START_FIELD_NUMBER = 1;
            private int bitField0_;
            private int end_;
            private byte memoizedIsInitialized = 2;
            private C9191l options_;
            private int start_;

            /* JADX INFO: renamed from: m74$b$b$a */
            public static final class a extends v27.AbstractC13823b<b, a> implements c {
                public /* synthetic */ a(C9169a c9169a) {
                    this();
                }

                public a clearEnd() {
                    m23743e();
                    ((b) this.f89756b).clearEnd();
                    return this;
                }

                public a clearOptions() {
                    m23743e();
                    ((b) this.f89756b).clearOptions();
                    return this;
                }

                public a clearStart() {
                    m23743e();
                    ((b) this.f89756b).clearStart();
                    return this;
                }

                @Override // p000.m74.C9171b.c
                public int getEnd() {
                    return ((b) this.f89756b).getEnd();
                }

                @Override // p000.m74.C9171b.c
                public C9191l getOptions() {
                    return ((b) this.f89756b).getOptions();
                }

                @Override // p000.m74.C9171b.c
                public int getStart() {
                    return ((b) this.f89756b).getStart();
                }

                @Override // p000.m74.C9171b.c
                public boolean hasEnd() {
                    return ((b) this.f89756b).hasEnd();
                }

                @Override // p000.m74.C9171b.c
                public boolean hasOptions() {
                    return ((b) this.f89756b).hasOptions();
                }

                @Override // p000.m74.C9171b.c
                public boolean hasStart() {
                    return ((b) this.f89756b).hasStart();
                }

                public a mergeOptions(C9191l c9191l) {
                    m23743e();
                    ((b) this.f89756b).mergeOptions(c9191l);
                    return this;
                }

                public a setEnd(int i) {
                    m23743e();
                    ((b) this.f89756b).setEnd(i);
                    return this;
                }

                public a setOptions(C9191l c9191l) {
                    m23743e();
                    ((b) this.f89756b).setOptions(c9191l);
                    return this;
                }

                public a setStart(int i) {
                    m23743e();
                    ((b) this.f89756b).setStart(i);
                    return this;
                }

                private a() {
                    super(b.DEFAULT_INSTANCE);
                }

                /* JADX WARN: Multi-variable type inference failed */
                public a setOptions(C9191l.a aVar) {
                    m23743e();
                    ((b) this.f89756b).setOptions((C9191l) aVar.build());
                    return this;
                }
            }

            static {
                b bVar = new b();
                DEFAULT_INSTANCE = bVar;
                v27.m23715h0(b.class, bVar);
            }

            private b() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearEnd() {
                this.bitField0_ &= -3;
                this.end_ = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearOptions() {
                this.options_ = null;
                this.bitField0_ &= -5;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearStart() {
                this.bitField0_ &= -2;
                this.start_ = 0;
            }

            public static b getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX WARN: Multi-variable type inference failed */
            public void mergeOptions(C9191l c9191l) {
                c9191l.getClass();
                C9191l c9191l2 = this.options_;
                if (c9191l2 == null || c9191l2 == C9191l.getDefaultInstance()) {
                    this.options_ = c9191l;
                } else {
                    this.options_ = ((C9191l.a) C9191l.newBuilder(this.options_).mergeFrom(c9191l)).buildPartial();
                }
                this.bitField0_ |= 4;
            }

            public static a newBuilder() {
                return DEFAULT_INSTANCE.m23738n();
            }

            public static b parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (b) v27.m23700S(DEFAULT_INSTANCE, inputStream);
            }

            public static b parseFrom(ByteBuffer byteBuffer) throws ce8 {
                return (b) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
            }

            public static uhc<b> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setEnd(int i) {
                this.bitField0_ |= 2;
                this.end_ = i;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setOptions(C9191l c9191l) {
                c9191l.getClass();
                this.options_ = c9191l;
                this.bitField0_ |= 4;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setStart(int i) {
                this.bitField0_ |= 1;
                this.start_ = i;
            }

            @Override // p000.m74.C9171b.c
            public int getEnd() {
                return this.end_;
            }

            @Override // p000.m74.C9171b.c
            public C9191l getOptions() {
                C9191l c9191l = this.options_;
                return c9191l == null ? C9191l.getDefaultInstance() : c9191l;
            }

            @Override // p000.m74.C9171b.c
            public int getStart() {
                return this.start_;
            }

            @Override // p000.m74.C9171b.c
            public boolean hasEnd() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // p000.m74.C9171b.c
            public boolean hasOptions() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // p000.m74.C9171b.c
            public boolean hasStart() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // p000.v27
            /* JADX INFO: renamed from: r */
            public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
                C9169a c9169a = null;
                switch (C9169a.f60048a[enumC13830i.ordinal()]) {
                    case 1:
                        return new b();
                    case 2:
                        return new a(c9169a);
                    case 3:
                        return v27.m23699Q(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001င\u0000\u0002င\u0001\u0003ᐉ\u0002", new Object[]{"bitField0_", "start_", "end_", "options_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        uhc<b> c13824c = PARSER;
                        if (c13824c == null) {
                            synchronized (b.class) {
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
                        return Byte.valueOf(this.memoizedIsInitialized);
                    case 7:
                        this.memoizedIsInitialized = (byte) (obj == null ? 0 : 1);
                        return null;
                    default:
                        throw new UnsupportedOperationException();
                }
            }

            public static a newBuilder(b bVar) {
                return DEFAULT_INSTANCE.m23739o(bVar);
            }

            public static b parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
                return (b) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
            }

            public static b parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
                return (b) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
            }

            public static b parseFrom(vj1 vj1Var) throws ce8 {
                return (b) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
            }

            public static b parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
                return (b) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
            }

            public static b parseFrom(byte[] bArr) throws ce8 {
                return (b) v27.m23710c0(DEFAULT_INSTANCE, bArr);
            }

            public static b parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
                return (b) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
            }

            public static b parseFrom(InputStream inputStream) throws IOException {
                return (b) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
            }

            public static b parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
                return (b) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
            }

            public static b parseFrom(f72 f72Var) throws IOException {
                return (b) v27.m23704W(DEFAULT_INSTANCE, f72Var);
            }

            public static b parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
                return (b) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
            }
        }

        /* JADX INFO: renamed from: m74$b$c */
        public interface c extends rsa {
            int getEnd();

            C9191l getOptions();

            int getStart();

            boolean hasEnd();

            boolean hasOptions();

            boolean hasStart();
        }

        /* JADX INFO: renamed from: m74$b$d */
        public static final class d extends v27<d, a> implements e {
            private static final d DEFAULT_INSTANCE;
            public static final int END_FIELD_NUMBER = 2;
            private static volatile uhc<d> PARSER = null;
            public static final int START_FIELD_NUMBER = 1;
            private int bitField0_;
            private int end_;
            private int start_;

            /* JADX INFO: renamed from: m74$b$d$a */
            public static final class a extends v27.AbstractC13823b<d, a> implements e {
                public /* synthetic */ a(C9169a c9169a) {
                    this();
                }

                public a clearEnd() {
                    m23743e();
                    ((d) this.f89756b).clearEnd();
                    return this;
                }

                public a clearStart() {
                    m23743e();
                    ((d) this.f89756b).clearStart();
                    return this;
                }

                @Override // p000.m74.C9171b.e
                public int getEnd() {
                    return ((d) this.f89756b).getEnd();
                }

                @Override // p000.m74.C9171b.e
                public int getStart() {
                    return ((d) this.f89756b).getStart();
                }

                @Override // p000.m74.C9171b.e
                public boolean hasEnd() {
                    return ((d) this.f89756b).hasEnd();
                }

                @Override // p000.m74.C9171b.e
                public boolean hasStart() {
                    return ((d) this.f89756b).hasStart();
                }

                public a setEnd(int i) {
                    m23743e();
                    ((d) this.f89756b).setEnd(i);
                    return this;
                }

                public a setStart(int i) {
                    m23743e();
                    ((d) this.f89756b).setStart(i);
                    return this;
                }

                private a() {
                    super(d.DEFAULT_INSTANCE);
                }
            }

            static {
                d dVar = new d();
                DEFAULT_INSTANCE = dVar;
                v27.m23715h0(d.class, dVar);
            }

            private d() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearEnd() {
                this.bitField0_ &= -3;
                this.end_ = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearStart() {
                this.bitField0_ &= -2;
                this.start_ = 0;
            }

            public static d getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static a newBuilder() {
                return DEFAULT_INSTANCE.m23738n();
            }

            public static d parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (d) v27.m23700S(DEFAULT_INSTANCE, inputStream);
            }

            public static d parseFrom(ByteBuffer byteBuffer) throws ce8 {
                return (d) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
            }

            public static uhc<d> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setEnd(int i) {
                this.bitField0_ |= 2;
                this.end_ = i;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setStart(int i) {
                this.bitField0_ |= 1;
                this.start_ = i;
            }

            @Override // p000.m74.C9171b.e
            public int getEnd() {
                return this.end_;
            }

            @Override // p000.m74.C9171b.e
            public int getStart() {
                return this.start_;
            }

            @Override // p000.m74.C9171b.e
            public boolean hasEnd() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // p000.m74.C9171b.e
            public boolean hasStart() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // p000.v27
            /* JADX INFO: renamed from: r */
            public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
                C9169a c9169a = null;
                switch (C9169a.f60048a[enumC13830i.ordinal()]) {
                    case 1:
                        return new d();
                    case 2:
                        return new a(c9169a);
                    case 3:
                        return v27.m23699Q(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"bitField0_", "start_", "end_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        uhc<d> c13824c = PARSER;
                        if (c13824c == null) {
                            synchronized (d.class) {
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

            public static a newBuilder(d dVar) {
                return DEFAULT_INSTANCE.m23739o(dVar);
            }

            public static d parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
                return (d) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
            }

            public static d parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
                return (d) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
            }

            public static d parseFrom(vj1 vj1Var) throws ce8 {
                return (d) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
            }

            public static d parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
                return (d) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
            }

            public static d parseFrom(byte[] bArr) throws ce8 {
                return (d) v27.m23710c0(DEFAULT_INSTANCE, bArr);
            }

            public static d parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
                return (d) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
            }

            public static d parseFrom(InputStream inputStream) throws IOException {
                return (d) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
            }

            public static d parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
                return (d) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
            }

            public static d parseFrom(f72 f72Var) throws IOException {
                return (d) v27.m23704W(DEFAULT_INSTANCE, f72Var);
            }

            public static d parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
                return (d) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
            }
        }

        /* JADX INFO: renamed from: m74$b$e */
        public interface e extends rsa {
            int getEnd();

            int getStart();

            boolean hasEnd();

            boolean hasStart();
        }

        static {
            C9171b c9171b = new C9171b();
            DEFAULT_INSTANCE = c9171b;
            v27.m23715h0(C9171b.class, c9171b);
        }

        private C9171b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllEnumType(Iterable<? extends C9175d> iterable) {
            ensureEnumTypeIsMutable();
            AbstractC1714b3.m2856b(iterable, this.enumType_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllExtension(Iterable<? extends C9195n> iterable) {
            ensureExtensionIsMutable();
            AbstractC1714b3.m2856b(iterable, this.extension_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllExtensionRange(Iterable<? extends b> iterable) {
            ensureExtensionRangeIsMutable();
            AbstractC1714b3.m2856b(iterable, this.extensionRange_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllField(Iterable<? extends C9195n> iterable) {
            ensureFieldIsMutable();
            AbstractC1714b3.m2856b(iterable, this.field_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllNestedType(Iterable<? extends C9171b> iterable) {
            ensureNestedTypeIsMutable();
            AbstractC1714b3.m2856b(iterable, this.nestedType_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllOneofDecl(Iterable<? extends C9180f0> iterable) {
            ensureOneofDeclIsMutable();
            AbstractC1714b3.m2856b(iterable, this.oneofDecl_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllReservedName(Iterable<String> iterable) {
            ensureReservedNameIsMutable();
            AbstractC1714b3.m2856b(iterable, this.reservedName_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllReservedRange(Iterable<? extends d> iterable) {
            ensureReservedRangeIsMutable();
            AbstractC1714b3.m2856b(iterable, this.reservedRange_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addEnumType(C9175d c9175d) {
            c9175d.getClass();
            ensureEnumTypeIsMutable();
            this.enumType_.add(c9175d);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addExtension(C9195n c9195n) {
            c9195n.getClass();
            ensureExtensionIsMutable();
            this.extension_.add(c9195n);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addExtensionRange(b bVar) {
            bVar.getClass();
            ensureExtensionRangeIsMutable();
            this.extensionRange_.add(bVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addField(C9195n c9195n) {
            c9195n.getClass();
            ensureFieldIsMutable();
            this.field_.add(c9195n);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addNestedType(C9171b c9171b) {
            c9171b.getClass();
            ensureNestedTypeIsMutable();
            this.nestedType_.add(c9171b);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addOneofDecl(C9180f0 c9180f0) {
            c9180f0.getClass();
            ensureOneofDeclIsMutable();
            this.oneofDecl_.add(c9180f0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addReservedName(String str) {
            str.getClass();
            ensureReservedNameIsMutable();
            this.reservedName_.add(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addReservedNameBytes(vj1 vj1Var) {
            ensureReservedNameIsMutable();
            this.reservedName_.add(vj1Var.toStringUtf8());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addReservedRange(d dVar) {
            dVar.getClass();
            ensureReservedRangeIsMutable();
            this.reservedRange_.add(dVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEnumType() {
            this.enumType_ = v27.m23722x();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearExtension() {
            this.extension_ = v27.m23722x();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearExtensionRange() {
            this.extensionRange_ = v27.m23722x();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearField() {
            this.field_ = v27.m23722x();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearName() {
            this.bitField0_ &= -2;
            this.name_ = getDefaultInstance().getName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNestedType() {
            this.nestedType_ = v27.m23722x();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOneofDecl() {
            this.oneofDecl_ = v27.m23722x();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOptions() {
            this.options_ = null;
            this.bitField0_ &= -3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearReservedName() {
            this.reservedName_ = v27.m23722x();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearReservedRange() {
            this.reservedRange_ = v27.m23722x();
        }

        private void ensureEnumTypeIsMutable() {
            w98.InterfaceC14504k<C9175d> interfaceC14504k = this.enumType_;
            if (interfaceC14504k.isModifiable()) {
                return;
            }
            this.enumType_ = v27.m23698P(interfaceC14504k);
        }

        private void ensureExtensionIsMutable() {
            w98.InterfaceC14504k<C9195n> interfaceC14504k = this.extension_;
            if (interfaceC14504k.isModifiable()) {
                return;
            }
            this.extension_ = v27.m23698P(interfaceC14504k);
        }

        private void ensureExtensionRangeIsMutable() {
            w98.InterfaceC14504k<b> interfaceC14504k = this.extensionRange_;
            if (interfaceC14504k.isModifiable()) {
                return;
            }
            this.extensionRange_ = v27.m23698P(interfaceC14504k);
        }

        private void ensureFieldIsMutable() {
            w98.InterfaceC14504k<C9195n> interfaceC14504k = this.field_;
            if (interfaceC14504k.isModifiable()) {
                return;
            }
            this.field_ = v27.m23698P(interfaceC14504k);
        }

        private void ensureNestedTypeIsMutable() {
            w98.InterfaceC14504k<C9171b> interfaceC14504k = this.nestedType_;
            if (interfaceC14504k.isModifiable()) {
                return;
            }
            this.nestedType_ = v27.m23698P(interfaceC14504k);
        }

        private void ensureOneofDeclIsMutable() {
            w98.InterfaceC14504k<C9180f0> interfaceC14504k = this.oneofDecl_;
            if (interfaceC14504k.isModifiable()) {
                return;
            }
            this.oneofDecl_ = v27.m23698P(interfaceC14504k);
        }

        private void ensureReservedNameIsMutable() {
            w98.InterfaceC14504k<String> interfaceC14504k = this.reservedName_;
            if (interfaceC14504k.isModifiable()) {
                return;
            }
            this.reservedName_ = v27.m23698P(interfaceC14504k);
        }

        private void ensureReservedRangeIsMutable() {
            w98.InterfaceC14504k<d> interfaceC14504k = this.reservedRange_;
            if (interfaceC14504k.isModifiable()) {
                return;
            }
            this.reservedRange_ = v27.m23698P(interfaceC14504k);
        }

        public static C9171b getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public void mergeOptions(C9211z c9211z) {
            c9211z.getClass();
            C9211z c9211z2 = this.options_;
            if (c9211z2 == null || c9211z2 == C9211z.getDefaultInstance()) {
                this.options_ = c9211z;
            } else {
                this.options_ = ((C9211z.a) C9211z.newBuilder(this.options_).mergeFrom(c9211z)).buildPartial();
            }
            this.bitField0_ |= 2;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.m23738n();
        }

        public static C9171b parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (C9171b) v27.m23700S(DEFAULT_INSTANCE, inputStream);
        }

        public static C9171b parseFrom(ByteBuffer byteBuffer) throws ce8 {
            return (C9171b) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
        }

        public static uhc<C9171b> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeEnumType(int i) {
            ensureEnumTypeIsMutable();
            this.enumType_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeExtension(int i) {
            ensureExtensionIsMutable();
            this.extension_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeExtensionRange(int i) {
            ensureExtensionRangeIsMutable();
            this.extensionRange_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeField(int i) {
            ensureFieldIsMutable();
            this.field_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeNestedType(int i) {
            ensureNestedTypeIsMutable();
            this.nestedType_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeOneofDecl(int i) {
            ensureOneofDeclIsMutable();
            this.oneofDecl_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeReservedRange(int i) {
            ensureReservedRangeIsMutable();
            this.reservedRange_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEnumType(int i, C9175d c9175d) {
            c9175d.getClass();
            ensureEnumTypeIsMutable();
            this.enumType_.set(i, c9175d);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setExtension(int i, C9195n c9195n) {
            c9195n.getClass();
            ensureExtensionIsMutable();
            this.extension_.set(i, c9195n);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setExtensionRange(int i, b bVar) {
            bVar.getClass();
            ensureExtensionRangeIsMutable();
            this.extensionRange_.set(i, bVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setField(int i, C9195n c9195n) {
            c9195n.getClass();
            ensureFieldIsMutable();
            this.field_.set(i, c9195n);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setName(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.name_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNameBytes(vj1 vj1Var) {
            this.name_ = vj1Var.toStringUtf8();
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNestedType(int i, C9171b c9171b) {
            c9171b.getClass();
            ensureNestedTypeIsMutable();
            this.nestedType_.set(i, c9171b);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOneofDecl(int i, C9180f0 c9180f0) {
            c9180f0.getClass();
            ensureOneofDeclIsMutable();
            this.oneofDecl_.set(i, c9180f0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOptions(C9211z c9211z) {
            c9211z.getClass();
            this.options_ = c9211z;
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setReservedName(int i, String str) {
            str.getClass();
            ensureReservedNameIsMutable();
            this.reservedName_.set(i, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setReservedRange(int i, d dVar) {
            dVar.getClass();
            ensureReservedRangeIsMutable();
            this.reservedRange_.set(i, dVar);
        }

        @Override // p000.m74.InterfaceC9173c
        public C9175d getEnumType(int i) {
            return this.enumType_.get(i);
        }

        @Override // p000.m74.InterfaceC9173c
        public int getEnumTypeCount() {
            return this.enumType_.size();
        }

        @Override // p000.m74.InterfaceC9173c
        public List<C9175d> getEnumTypeList() {
            return this.enumType_;
        }

        public InterfaceC9177e getEnumTypeOrBuilder(int i) {
            return this.enumType_.get(i);
        }

        public List<? extends InterfaceC9177e> getEnumTypeOrBuilderList() {
            return this.enumType_;
        }

        @Override // p000.m74.InterfaceC9173c
        public C9195n getExtension(int i) {
            return this.extension_.get(i);
        }

        @Override // p000.m74.InterfaceC9173c
        public int getExtensionCount() {
            return this.extension_.size();
        }

        @Override // p000.m74.InterfaceC9173c
        public List<C9195n> getExtensionList() {
            return this.extension_;
        }

        public InterfaceC9197o getExtensionOrBuilder(int i) {
            return this.extension_.get(i);
        }

        public List<? extends InterfaceC9197o> getExtensionOrBuilderList() {
            return this.extension_;
        }

        @Override // p000.m74.InterfaceC9173c
        public b getExtensionRange(int i) {
            return this.extensionRange_.get(i);
        }

        @Override // p000.m74.InterfaceC9173c
        public int getExtensionRangeCount() {
            return this.extensionRange_.size();
        }

        @Override // p000.m74.InterfaceC9173c
        public List<b> getExtensionRangeList() {
            return this.extensionRange_;
        }

        public c getExtensionRangeOrBuilder(int i) {
            return this.extensionRange_.get(i);
        }

        public List<? extends c> getExtensionRangeOrBuilderList() {
            return this.extensionRange_;
        }

        @Override // p000.m74.InterfaceC9173c
        public C9195n getField(int i) {
            return this.field_.get(i);
        }

        @Override // p000.m74.InterfaceC9173c
        public int getFieldCount() {
            return this.field_.size();
        }

        @Override // p000.m74.InterfaceC9173c
        public List<C9195n> getFieldList() {
            return this.field_;
        }

        public InterfaceC9197o getFieldOrBuilder(int i) {
            return this.field_.get(i);
        }

        public List<? extends InterfaceC9197o> getFieldOrBuilderList() {
            return this.field_;
        }

        @Override // p000.m74.InterfaceC9173c
        public String getName() {
            return this.name_;
        }

        @Override // p000.m74.InterfaceC9173c
        public vj1 getNameBytes() {
            return vj1.copyFromUtf8(this.name_);
        }

        @Override // p000.m74.InterfaceC9173c
        public C9171b getNestedType(int i) {
            return this.nestedType_.get(i);
        }

        @Override // p000.m74.InterfaceC9173c
        public int getNestedTypeCount() {
            return this.nestedType_.size();
        }

        @Override // p000.m74.InterfaceC9173c
        public List<C9171b> getNestedTypeList() {
            return this.nestedType_;
        }

        public InterfaceC9173c getNestedTypeOrBuilder(int i) {
            return this.nestedType_.get(i);
        }

        public List<? extends InterfaceC9173c> getNestedTypeOrBuilderList() {
            return this.nestedType_;
        }

        @Override // p000.m74.InterfaceC9173c
        public C9180f0 getOneofDecl(int i) {
            return this.oneofDecl_.get(i);
        }

        @Override // p000.m74.InterfaceC9173c
        public int getOneofDeclCount() {
            return this.oneofDecl_.size();
        }

        @Override // p000.m74.InterfaceC9173c
        public List<C9180f0> getOneofDeclList() {
            return this.oneofDecl_;
        }

        public InterfaceC9182g0 getOneofDeclOrBuilder(int i) {
            return this.oneofDecl_.get(i);
        }

        public List<? extends InterfaceC9182g0> getOneofDeclOrBuilderList() {
            return this.oneofDecl_;
        }

        @Override // p000.m74.InterfaceC9173c
        public C9211z getOptions() {
            C9211z c9211z = this.options_;
            return c9211z == null ? C9211z.getDefaultInstance() : c9211z;
        }

        @Override // p000.m74.InterfaceC9173c
        public String getReservedName(int i) {
            return this.reservedName_.get(i);
        }

        @Override // p000.m74.InterfaceC9173c
        public vj1 getReservedNameBytes(int i) {
            return vj1.copyFromUtf8(this.reservedName_.get(i));
        }

        @Override // p000.m74.InterfaceC9173c
        public int getReservedNameCount() {
            return this.reservedName_.size();
        }

        @Override // p000.m74.InterfaceC9173c
        public List<String> getReservedNameList() {
            return this.reservedName_;
        }

        @Override // p000.m74.InterfaceC9173c
        public d getReservedRange(int i) {
            return this.reservedRange_.get(i);
        }

        @Override // p000.m74.InterfaceC9173c
        public int getReservedRangeCount() {
            return this.reservedRange_.size();
        }

        @Override // p000.m74.InterfaceC9173c
        public List<d> getReservedRangeList() {
            return this.reservedRange_;
        }

        public e getReservedRangeOrBuilder(int i) {
            return this.reservedRange_.get(i);
        }

        public List<? extends e> getReservedRangeOrBuilderList() {
            return this.reservedRange_;
        }

        @Override // p000.m74.InterfaceC9173c
        public boolean hasName() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // p000.m74.InterfaceC9173c
        public boolean hasOptions() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // p000.v27
        /* JADX INFO: renamed from: r */
        public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
            C9169a c9169a = null;
            switch (C9169a.f60048a[enumC13830i.ordinal()]) {
                case 1:
                    return new C9171b();
                case 2:
                    return new a(c9169a);
                case 3:
                    return v27.m23699Q(DEFAULT_INSTANCE, "\u0001\n\u0000\u0001\u0001\n\n\u0000\b\u0007\u0001ဈ\u0000\u0002Л\u0003Л\u0004Л\u0005Л\u0006Л\u0007ᐉ\u0001\bЛ\t\u001b\n\u001a", new Object[]{"bitField0_", "name_", "field_", C9195n.class, "nestedType_", C9171b.class, "enumType_", C9175d.class, "extensionRange_", b.class, "extension_", C9195n.class, "options_", "oneofDecl_", C9180f0.class, "reservedRange_", d.class, "reservedName_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    uhc<C9171b> c13824c = PARSER;
                    if (c13824c == null) {
                        synchronized (C9171b.class) {
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
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    this.memoizedIsInitialized = (byte) (obj == null ? 0 : 1);
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public static a newBuilder(C9171b c9171b) {
            return DEFAULT_INSTANCE.m23739o(c9171b);
        }

        public static C9171b parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
            return (C9171b) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
        }

        public static C9171b parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
            return (C9171b) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
        }

        public static C9171b parseFrom(vj1 vj1Var) throws ce8 {
            return (C9171b) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addEnumType(int i, C9175d c9175d) {
            c9175d.getClass();
            ensureEnumTypeIsMutable();
            this.enumType_.add(i, c9175d);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addExtension(int i, C9195n c9195n) {
            c9195n.getClass();
            ensureExtensionIsMutable();
            this.extension_.add(i, c9195n);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addExtensionRange(int i, b bVar) {
            bVar.getClass();
            ensureExtensionRangeIsMutable();
            this.extensionRange_.add(i, bVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addField(int i, C9195n c9195n) {
            c9195n.getClass();
            ensureFieldIsMutable();
            this.field_.add(i, c9195n);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addNestedType(int i, C9171b c9171b) {
            c9171b.getClass();
            ensureNestedTypeIsMutable();
            this.nestedType_.add(i, c9171b);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addOneofDecl(int i, C9180f0 c9180f0) {
            c9180f0.getClass();
            ensureOneofDeclIsMutable();
            this.oneofDecl_.add(i, c9180f0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addReservedRange(int i, d dVar) {
            dVar.getClass();
            ensureReservedRangeIsMutable();
            this.reservedRange_.add(i, dVar);
        }

        public static C9171b parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
            return (C9171b) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
        }

        public static C9171b parseFrom(byte[] bArr) throws ce8 {
            return (C9171b) v27.m23710c0(DEFAULT_INSTANCE, bArr);
        }

        public static C9171b parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
            return (C9171b) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
        }

        public static C9171b parseFrom(InputStream inputStream) throws IOException {
            return (C9171b) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
        }

        public static C9171b parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
            return (C9171b) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
        }

        public static C9171b parseFrom(f72 f72Var) throws IOException {
            return (C9171b) v27.m23704W(DEFAULT_INSTANCE, f72Var);
        }

        public static C9171b parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
            return (C9171b) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
        }
    }

    /* JADX INFO: renamed from: m74$b0 */
    public static final class C9172b0 extends v27<C9172b0, a> implements InterfaceC9174c0 {
        public static final int CLIENT_STREAMING_FIELD_NUMBER = 5;
        private static final C9172b0 DEFAULT_INSTANCE;
        public static final int INPUT_TYPE_FIELD_NUMBER = 2;
        public static final int NAME_FIELD_NUMBER = 1;
        public static final int OPTIONS_FIELD_NUMBER = 4;
        public static final int OUTPUT_TYPE_FIELD_NUMBER = 3;
        private static volatile uhc<C9172b0> PARSER = null;
        public static final int SERVER_STREAMING_FIELD_NUMBER = 6;
        private int bitField0_;
        private boolean clientStreaming_;
        private C9176d0 options_;
        private boolean serverStreaming_;
        private byte memoizedIsInitialized = 2;
        private String name_ = "";
        private String inputType_ = "";
        private String outputType_ = "";

        /* JADX INFO: renamed from: m74$b0$a */
        public static final class a extends v27.AbstractC13823b<C9172b0, a> implements InterfaceC9174c0 {
            public /* synthetic */ a(C9169a c9169a) {
                this();
            }

            public a clearClientStreaming() {
                m23743e();
                ((C9172b0) this.f89756b).clearClientStreaming();
                return this;
            }

            public a clearInputType() {
                m23743e();
                ((C9172b0) this.f89756b).clearInputType();
                return this;
            }

            public a clearName() {
                m23743e();
                ((C9172b0) this.f89756b).clearName();
                return this;
            }

            public a clearOptions() {
                m23743e();
                ((C9172b0) this.f89756b).clearOptions();
                return this;
            }

            public a clearOutputType() {
                m23743e();
                ((C9172b0) this.f89756b).clearOutputType();
                return this;
            }

            public a clearServerStreaming() {
                m23743e();
                ((C9172b0) this.f89756b).clearServerStreaming();
                return this;
            }

            @Override // p000.m74.InterfaceC9174c0
            public boolean getClientStreaming() {
                return ((C9172b0) this.f89756b).getClientStreaming();
            }

            @Override // p000.m74.InterfaceC9174c0
            public String getInputType() {
                return ((C9172b0) this.f89756b).getInputType();
            }

            @Override // p000.m74.InterfaceC9174c0
            public vj1 getInputTypeBytes() {
                return ((C9172b0) this.f89756b).getInputTypeBytes();
            }

            @Override // p000.m74.InterfaceC9174c0
            public String getName() {
                return ((C9172b0) this.f89756b).getName();
            }

            @Override // p000.m74.InterfaceC9174c0
            public vj1 getNameBytes() {
                return ((C9172b0) this.f89756b).getNameBytes();
            }

            @Override // p000.m74.InterfaceC9174c0
            public C9176d0 getOptions() {
                return ((C9172b0) this.f89756b).getOptions();
            }

            @Override // p000.m74.InterfaceC9174c0
            public String getOutputType() {
                return ((C9172b0) this.f89756b).getOutputType();
            }

            @Override // p000.m74.InterfaceC9174c0
            public vj1 getOutputTypeBytes() {
                return ((C9172b0) this.f89756b).getOutputTypeBytes();
            }

            @Override // p000.m74.InterfaceC9174c0
            public boolean getServerStreaming() {
                return ((C9172b0) this.f89756b).getServerStreaming();
            }

            @Override // p000.m74.InterfaceC9174c0
            public boolean hasClientStreaming() {
                return ((C9172b0) this.f89756b).hasClientStreaming();
            }

            @Override // p000.m74.InterfaceC9174c0
            public boolean hasInputType() {
                return ((C9172b0) this.f89756b).hasInputType();
            }

            @Override // p000.m74.InterfaceC9174c0
            public boolean hasName() {
                return ((C9172b0) this.f89756b).hasName();
            }

            @Override // p000.m74.InterfaceC9174c0
            public boolean hasOptions() {
                return ((C9172b0) this.f89756b).hasOptions();
            }

            @Override // p000.m74.InterfaceC9174c0
            public boolean hasOutputType() {
                return ((C9172b0) this.f89756b).hasOutputType();
            }

            @Override // p000.m74.InterfaceC9174c0
            public boolean hasServerStreaming() {
                return ((C9172b0) this.f89756b).hasServerStreaming();
            }

            public a mergeOptions(C9176d0 c9176d0) {
                m23743e();
                ((C9172b0) this.f89756b).mergeOptions(c9176d0);
                return this;
            }

            public a setClientStreaming(boolean z) {
                m23743e();
                ((C9172b0) this.f89756b).setClientStreaming(z);
                return this;
            }

            public a setInputType(String str) {
                m23743e();
                ((C9172b0) this.f89756b).setInputType(str);
                return this;
            }

            public a setInputTypeBytes(vj1 vj1Var) {
                m23743e();
                ((C9172b0) this.f89756b).setInputTypeBytes(vj1Var);
                return this;
            }

            public a setName(String str) {
                m23743e();
                ((C9172b0) this.f89756b).setName(str);
                return this;
            }

            public a setNameBytes(vj1 vj1Var) {
                m23743e();
                ((C9172b0) this.f89756b).setNameBytes(vj1Var);
                return this;
            }

            public a setOptions(C9176d0 c9176d0) {
                m23743e();
                ((C9172b0) this.f89756b).setOptions(c9176d0);
                return this;
            }

            public a setOutputType(String str) {
                m23743e();
                ((C9172b0) this.f89756b).setOutputType(str);
                return this;
            }

            public a setOutputTypeBytes(vj1 vj1Var) {
                m23743e();
                ((C9172b0) this.f89756b).setOutputTypeBytes(vj1Var);
                return this;
            }

            public a setServerStreaming(boolean z) {
                m23743e();
                ((C9172b0) this.f89756b).setServerStreaming(z);
                return this;
            }

            private a() {
                super(C9172b0.DEFAULT_INSTANCE);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public a setOptions(C9176d0.a aVar) {
                m23743e();
                ((C9172b0) this.f89756b).setOptions((C9176d0) aVar.build());
                return this;
            }
        }

        static {
            C9172b0 c9172b0 = new C9172b0();
            DEFAULT_INSTANCE = c9172b0;
            v27.m23715h0(C9172b0.class, c9172b0);
        }

        private C9172b0() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearClientStreaming() {
            this.bitField0_ &= -17;
            this.clientStreaming_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearInputType() {
            this.bitField0_ &= -3;
            this.inputType_ = getDefaultInstance().getInputType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearName() {
            this.bitField0_ &= -2;
            this.name_ = getDefaultInstance().getName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOptions() {
            this.options_ = null;
            this.bitField0_ &= -9;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOutputType() {
            this.bitField0_ &= -5;
            this.outputType_ = getDefaultInstance().getOutputType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearServerStreaming() {
            this.bitField0_ &= -33;
            this.serverStreaming_ = false;
        }

        public static C9172b0 getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public void mergeOptions(C9176d0 c9176d0) {
            c9176d0.getClass();
            C9176d0 c9176d02 = this.options_;
            if (c9176d02 == null || c9176d02 == C9176d0.getDefaultInstance()) {
                this.options_ = c9176d0;
            } else {
                this.options_ = ((C9176d0.a) C9176d0.newBuilder(this.options_).mergeFrom(c9176d0)).buildPartial();
            }
            this.bitField0_ |= 8;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.m23738n();
        }

        public static C9172b0 parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (C9172b0) v27.m23700S(DEFAULT_INSTANCE, inputStream);
        }

        public static C9172b0 parseFrom(ByteBuffer byteBuffer) throws ce8 {
            return (C9172b0) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
        }

        public static uhc<C9172b0> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setClientStreaming(boolean z) {
            this.bitField0_ |= 16;
            this.clientStreaming_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setInputType(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.inputType_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setInputTypeBytes(vj1 vj1Var) {
            this.inputType_ = vj1Var.toStringUtf8();
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setName(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.name_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNameBytes(vj1 vj1Var) {
            this.name_ = vj1Var.toStringUtf8();
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOptions(C9176d0 c9176d0) {
            c9176d0.getClass();
            this.options_ = c9176d0;
            this.bitField0_ |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOutputType(String str) {
            str.getClass();
            this.bitField0_ |= 4;
            this.outputType_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOutputTypeBytes(vj1 vj1Var) {
            this.outputType_ = vj1Var.toStringUtf8();
            this.bitField0_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setServerStreaming(boolean z) {
            this.bitField0_ |= 32;
            this.serverStreaming_ = z;
        }

        @Override // p000.m74.InterfaceC9174c0
        public boolean getClientStreaming() {
            return this.clientStreaming_;
        }

        @Override // p000.m74.InterfaceC9174c0
        public String getInputType() {
            return this.inputType_;
        }

        @Override // p000.m74.InterfaceC9174c0
        public vj1 getInputTypeBytes() {
            return vj1.copyFromUtf8(this.inputType_);
        }

        @Override // p000.m74.InterfaceC9174c0
        public String getName() {
            return this.name_;
        }

        @Override // p000.m74.InterfaceC9174c0
        public vj1 getNameBytes() {
            return vj1.copyFromUtf8(this.name_);
        }

        @Override // p000.m74.InterfaceC9174c0
        public C9176d0 getOptions() {
            C9176d0 c9176d0 = this.options_;
            return c9176d0 == null ? C9176d0.getDefaultInstance() : c9176d0;
        }

        @Override // p000.m74.InterfaceC9174c0
        public String getOutputType() {
            return this.outputType_;
        }

        @Override // p000.m74.InterfaceC9174c0
        public vj1 getOutputTypeBytes() {
            return vj1.copyFromUtf8(this.outputType_);
        }

        @Override // p000.m74.InterfaceC9174c0
        public boolean getServerStreaming() {
            return this.serverStreaming_;
        }

        @Override // p000.m74.InterfaceC9174c0
        public boolean hasClientStreaming() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // p000.m74.InterfaceC9174c0
        public boolean hasInputType() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // p000.m74.InterfaceC9174c0
        public boolean hasName() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // p000.m74.InterfaceC9174c0
        public boolean hasOptions() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // p000.m74.InterfaceC9174c0
        public boolean hasOutputType() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // p000.m74.InterfaceC9174c0
        public boolean hasServerStreaming() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // p000.v27
        /* JADX INFO: renamed from: r */
        public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
            C9169a c9169a = null;
            switch (C9169a.f60048a[enumC13830i.ordinal()]) {
                case 1:
                    return new C9172b0();
                case 2:
                    return new a(c9169a);
                case 3:
                    return v27.m23699Q(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0001\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ᐉ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"bitField0_", "name_", "inputType_", "outputType_", "options_", "clientStreaming_", "serverStreaming_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    uhc<C9172b0> c13824c = PARSER;
                    if (c13824c == null) {
                        synchronized (C9172b0.class) {
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
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    this.memoizedIsInitialized = (byte) (obj == null ? 0 : 1);
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public static a newBuilder(C9172b0 c9172b0) {
            return DEFAULT_INSTANCE.m23739o(c9172b0);
        }

        public static C9172b0 parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
            return (C9172b0) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
        }

        public static C9172b0 parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
            return (C9172b0) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
        }

        public static C9172b0 parseFrom(vj1 vj1Var) throws ce8 {
            return (C9172b0) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
        }

        public static C9172b0 parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
            return (C9172b0) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
        }

        public static C9172b0 parseFrom(byte[] bArr) throws ce8 {
            return (C9172b0) v27.m23710c0(DEFAULT_INSTANCE, bArr);
        }

        public static C9172b0 parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
            return (C9172b0) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
        }

        public static C9172b0 parseFrom(InputStream inputStream) throws IOException {
            return (C9172b0) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
        }

        public static C9172b0 parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
            return (C9172b0) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
        }

        public static C9172b0 parseFrom(f72 f72Var) throws IOException {
            return (C9172b0) v27.m23704W(DEFAULT_INSTANCE, f72Var);
        }

        public static C9172b0 parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
            return (C9172b0) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
        }
    }

    /* JADX INFO: renamed from: m74$c */
    public interface InterfaceC9173c extends rsa {
        C9175d getEnumType(int i);

        int getEnumTypeCount();

        List<C9175d> getEnumTypeList();

        C9195n getExtension(int i);

        int getExtensionCount();

        List<C9195n> getExtensionList();

        C9171b.b getExtensionRange(int i);

        int getExtensionRangeCount();

        List<C9171b.b> getExtensionRangeList();

        C9195n getField(int i);

        int getFieldCount();

        List<C9195n> getFieldList();

        String getName();

        vj1 getNameBytes();

        C9171b getNestedType(int i);

        int getNestedTypeCount();

        List<C9171b> getNestedTypeList();

        C9180f0 getOneofDecl(int i);

        int getOneofDeclCount();

        List<C9180f0> getOneofDeclList();

        C9211z getOptions();

        String getReservedName(int i);

        vj1 getReservedNameBytes(int i);

        int getReservedNameCount();

        List<String> getReservedNameList();

        C9171b.d getReservedRange(int i);

        int getReservedRangeCount();

        List<C9171b.d> getReservedRangeList();

        boolean hasName();

        boolean hasOptions();
    }

    /* JADX INFO: renamed from: m74$c0 */
    public interface InterfaceC9174c0 extends rsa {
        boolean getClientStreaming();

        String getInputType();

        vj1 getInputTypeBytes();

        String getName();

        vj1 getNameBytes();

        C9176d0 getOptions();

        String getOutputType();

        vj1 getOutputTypeBytes();

        boolean getServerStreaming();

        boolean hasClientStreaming();

        boolean hasInputType();

        boolean hasName();

        boolean hasOptions();

        boolean hasOutputType();

        boolean hasServerStreaming();
    }

    /* JADX INFO: renamed from: m74$d */
    public static final class C9175d extends v27<C9175d, a> implements InterfaceC9177e {
        private static final C9175d DEFAULT_INSTANCE;
        public static final int NAME_FIELD_NUMBER = 1;
        public static final int OPTIONS_FIELD_NUMBER = 3;
        private static volatile uhc<C9175d> PARSER = null;
        public static final int RESERVED_NAME_FIELD_NUMBER = 5;
        public static final int RESERVED_RANGE_FIELD_NUMBER = 4;
        public static final int VALUE_FIELD_NUMBER = 2;
        private int bitField0_;
        private C9179f options_;
        private byte memoizedIsInitialized = 2;
        private String name_ = "";
        private w98.InterfaceC14504k<C9183h> value_ = v27.m23722x();
        private w98.InterfaceC14504k<b> reservedRange_ = v27.m23722x();
        private w98.InterfaceC14504k<String> reservedName_ = v27.m23722x();

        /* JADX INFO: renamed from: m74$d$a */
        public static final class a extends v27.AbstractC13823b<C9175d, a> implements InterfaceC9177e {
            public /* synthetic */ a(C9169a c9169a) {
                this();
            }

            public a addAllReservedName(Iterable<String> iterable) {
                m23743e();
                ((C9175d) this.f89756b).addAllReservedName(iterable);
                return this;
            }

            public a addAllReservedRange(Iterable<? extends b> iterable) {
                m23743e();
                ((C9175d) this.f89756b).addAllReservedRange(iterable);
                return this;
            }

            public a addAllValue(Iterable<? extends C9183h> iterable) {
                m23743e();
                ((C9175d) this.f89756b).addAllValue(iterable);
                return this;
            }

            public a addReservedName(String str) {
                m23743e();
                ((C9175d) this.f89756b).addReservedName(str);
                return this;
            }

            public a addReservedNameBytes(vj1 vj1Var) {
                m23743e();
                ((C9175d) this.f89756b).addReservedNameBytes(vj1Var);
                return this;
            }

            public a addReservedRange(b bVar) {
                m23743e();
                ((C9175d) this.f89756b).addReservedRange(bVar);
                return this;
            }

            public a addValue(C9183h c9183h) {
                m23743e();
                ((C9175d) this.f89756b).addValue(c9183h);
                return this;
            }

            public a clearName() {
                m23743e();
                ((C9175d) this.f89756b).clearName();
                return this;
            }

            public a clearOptions() {
                m23743e();
                ((C9175d) this.f89756b).clearOptions();
                return this;
            }

            public a clearReservedName() {
                m23743e();
                ((C9175d) this.f89756b).clearReservedName();
                return this;
            }

            public a clearReservedRange() {
                m23743e();
                ((C9175d) this.f89756b).clearReservedRange();
                return this;
            }

            public a clearValue() {
                m23743e();
                ((C9175d) this.f89756b).clearValue();
                return this;
            }

            @Override // p000.m74.InterfaceC9177e
            public String getName() {
                return ((C9175d) this.f89756b).getName();
            }

            @Override // p000.m74.InterfaceC9177e
            public vj1 getNameBytes() {
                return ((C9175d) this.f89756b).getNameBytes();
            }

            @Override // p000.m74.InterfaceC9177e
            public C9179f getOptions() {
                return ((C9175d) this.f89756b).getOptions();
            }

            @Override // p000.m74.InterfaceC9177e
            public String getReservedName(int i) {
                return ((C9175d) this.f89756b).getReservedName(i);
            }

            @Override // p000.m74.InterfaceC9177e
            public vj1 getReservedNameBytes(int i) {
                return ((C9175d) this.f89756b).getReservedNameBytes(i);
            }

            @Override // p000.m74.InterfaceC9177e
            public int getReservedNameCount() {
                return ((C9175d) this.f89756b).getReservedNameCount();
            }

            @Override // p000.m74.InterfaceC9177e
            public List<String> getReservedNameList() {
                return Collections.unmodifiableList(((C9175d) this.f89756b).getReservedNameList());
            }

            @Override // p000.m74.InterfaceC9177e
            public b getReservedRange(int i) {
                return ((C9175d) this.f89756b).getReservedRange(i);
            }

            @Override // p000.m74.InterfaceC9177e
            public int getReservedRangeCount() {
                return ((C9175d) this.f89756b).getReservedRangeCount();
            }

            @Override // p000.m74.InterfaceC9177e
            public List<b> getReservedRangeList() {
                return Collections.unmodifiableList(((C9175d) this.f89756b).getReservedRangeList());
            }

            @Override // p000.m74.InterfaceC9177e
            public C9183h getValue(int i) {
                return ((C9175d) this.f89756b).getValue(i);
            }

            @Override // p000.m74.InterfaceC9177e
            public int getValueCount() {
                return ((C9175d) this.f89756b).getValueCount();
            }

            @Override // p000.m74.InterfaceC9177e
            public List<C9183h> getValueList() {
                return Collections.unmodifiableList(((C9175d) this.f89756b).getValueList());
            }

            @Override // p000.m74.InterfaceC9177e
            public boolean hasName() {
                return ((C9175d) this.f89756b).hasName();
            }

            @Override // p000.m74.InterfaceC9177e
            public boolean hasOptions() {
                return ((C9175d) this.f89756b).hasOptions();
            }

            public a mergeOptions(C9179f c9179f) {
                m23743e();
                ((C9175d) this.f89756b).mergeOptions(c9179f);
                return this;
            }

            public a removeReservedRange(int i) {
                m23743e();
                ((C9175d) this.f89756b).removeReservedRange(i);
                return this;
            }

            public a removeValue(int i) {
                m23743e();
                ((C9175d) this.f89756b).removeValue(i);
                return this;
            }

            public a setName(String str) {
                m23743e();
                ((C9175d) this.f89756b).setName(str);
                return this;
            }

            public a setNameBytes(vj1 vj1Var) {
                m23743e();
                ((C9175d) this.f89756b).setNameBytes(vj1Var);
                return this;
            }

            public a setOptions(C9179f c9179f) {
                m23743e();
                ((C9175d) this.f89756b).setOptions(c9179f);
                return this;
            }

            public a setReservedName(int i, String str) {
                m23743e();
                ((C9175d) this.f89756b).setReservedName(i, str);
                return this;
            }

            public a setReservedRange(int i, b bVar) {
                m23743e();
                ((C9175d) this.f89756b).setReservedRange(i, bVar);
                return this;
            }

            public a setValue(int i, C9183h c9183h) {
                m23743e();
                ((C9175d) this.f89756b).setValue(i, c9183h);
                return this;
            }

            private a() {
                super(C9175d.DEFAULT_INSTANCE);
            }

            public a addReservedRange(int i, b bVar) {
                m23743e();
                ((C9175d) this.f89756b).addReservedRange(i, bVar);
                return this;
            }

            public a addValue(int i, C9183h c9183h) {
                m23743e();
                ((C9175d) this.f89756b).addValue(i, c9183h);
                return this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public a setOptions(C9179f.a aVar) {
                m23743e();
                ((C9175d) this.f89756b).setOptions((C9179f) aVar.build());
                return this;
            }

            public a setReservedRange(int i, b.a aVar) {
                m23743e();
                ((C9175d) this.f89756b).setReservedRange(i, aVar.build());
                return this;
            }

            public a setValue(int i, C9183h.a aVar) {
                m23743e();
                ((C9175d) this.f89756b).setValue(i, aVar.build());
                return this;
            }

            public a addReservedRange(b.a aVar) {
                m23743e();
                ((C9175d) this.f89756b).addReservedRange(aVar.build());
                return this;
            }

            public a addValue(C9183h.a aVar) {
                m23743e();
                ((C9175d) this.f89756b).addValue(aVar.build());
                return this;
            }

            public a addReservedRange(int i, b.a aVar) {
                m23743e();
                ((C9175d) this.f89756b).addReservedRange(i, aVar.build());
                return this;
            }

            public a addValue(int i, C9183h.a aVar) {
                m23743e();
                ((C9175d) this.f89756b).addValue(i, aVar.build());
                return this;
            }
        }

        /* JADX INFO: renamed from: m74$d$b */
        public static final class b extends v27<b, a> implements c {
            private static final b DEFAULT_INSTANCE;
            public static final int END_FIELD_NUMBER = 2;
            private static volatile uhc<b> PARSER = null;
            public static final int START_FIELD_NUMBER = 1;
            private int bitField0_;
            private int end_;
            private int start_;

            /* JADX INFO: renamed from: m74$d$b$a */
            public static final class a extends v27.AbstractC13823b<b, a> implements c {
                public /* synthetic */ a(C9169a c9169a) {
                    this();
                }

                public a clearEnd() {
                    m23743e();
                    ((b) this.f89756b).clearEnd();
                    return this;
                }

                public a clearStart() {
                    m23743e();
                    ((b) this.f89756b).clearStart();
                    return this;
                }

                @Override // p000.m74.C9175d.c
                public int getEnd() {
                    return ((b) this.f89756b).getEnd();
                }

                @Override // p000.m74.C9175d.c
                public int getStart() {
                    return ((b) this.f89756b).getStart();
                }

                @Override // p000.m74.C9175d.c
                public boolean hasEnd() {
                    return ((b) this.f89756b).hasEnd();
                }

                @Override // p000.m74.C9175d.c
                public boolean hasStart() {
                    return ((b) this.f89756b).hasStart();
                }

                public a setEnd(int i) {
                    m23743e();
                    ((b) this.f89756b).setEnd(i);
                    return this;
                }

                public a setStart(int i) {
                    m23743e();
                    ((b) this.f89756b).setStart(i);
                    return this;
                }

                private a() {
                    super(b.DEFAULT_INSTANCE);
                }
            }

            static {
                b bVar = new b();
                DEFAULT_INSTANCE = bVar;
                v27.m23715h0(b.class, bVar);
            }

            private b() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearEnd() {
                this.bitField0_ &= -3;
                this.end_ = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearStart() {
                this.bitField0_ &= -2;
                this.start_ = 0;
            }

            public static b getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static a newBuilder() {
                return DEFAULT_INSTANCE.m23738n();
            }

            public static b parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (b) v27.m23700S(DEFAULT_INSTANCE, inputStream);
            }

            public static b parseFrom(ByteBuffer byteBuffer) throws ce8 {
                return (b) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
            }

            public static uhc<b> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setEnd(int i) {
                this.bitField0_ |= 2;
                this.end_ = i;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setStart(int i) {
                this.bitField0_ |= 1;
                this.start_ = i;
            }

            @Override // p000.m74.C9175d.c
            public int getEnd() {
                return this.end_;
            }

            @Override // p000.m74.C9175d.c
            public int getStart() {
                return this.start_;
            }

            @Override // p000.m74.C9175d.c
            public boolean hasEnd() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // p000.m74.C9175d.c
            public boolean hasStart() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // p000.v27
            /* JADX INFO: renamed from: r */
            public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
                C9169a c9169a = null;
                switch (C9169a.f60048a[enumC13830i.ordinal()]) {
                    case 1:
                        return new b();
                    case 2:
                        return new a(c9169a);
                    case 3:
                        return v27.m23699Q(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"bitField0_", "start_", "end_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        uhc<b> c13824c = PARSER;
                        if (c13824c == null) {
                            synchronized (b.class) {
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

            public static a newBuilder(b bVar) {
                return DEFAULT_INSTANCE.m23739o(bVar);
            }

            public static b parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
                return (b) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
            }

            public static b parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
                return (b) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
            }

            public static b parseFrom(vj1 vj1Var) throws ce8 {
                return (b) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
            }

            public static b parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
                return (b) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
            }

            public static b parseFrom(byte[] bArr) throws ce8 {
                return (b) v27.m23710c0(DEFAULT_INSTANCE, bArr);
            }

            public static b parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
                return (b) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
            }

            public static b parseFrom(InputStream inputStream) throws IOException {
                return (b) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
            }

            public static b parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
                return (b) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
            }

            public static b parseFrom(f72 f72Var) throws IOException {
                return (b) v27.m23704W(DEFAULT_INSTANCE, f72Var);
            }

            public static b parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
                return (b) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
            }
        }

        /* JADX INFO: renamed from: m74$d$c */
        public interface c extends rsa {
            int getEnd();

            int getStart();

            boolean hasEnd();

            boolean hasStart();
        }

        static {
            C9175d c9175d = new C9175d();
            DEFAULT_INSTANCE = c9175d;
            v27.m23715h0(C9175d.class, c9175d);
        }

        private C9175d() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllReservedName(Iterable<String> iterable) {
            ensureReservedNameIsMutable();
            AbstractC1714b3.m2856b(iterable, this.reservedName_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllReservedRange(Iterable<? extends b> iterable) {
            ensureReservedRangeIsMutable();
            AbstractC1714b3.m2856b(iterable, this.reservedRange_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllValue(Iterable<? extends C9183h> iterable) {
            ensureValueIsMutable();
            AbstractC1714b3.m2856b(iterable, this.value_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addReservedName(String str) {
            str.getClass();
            ensureReservedNameIsMutable();
            this.reservedName_.add(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addReservedNameBytes(vj1 vj1Var) {
            ensureReservedNameIsMutable();
            this.reservedName_.add(vj1Var.toStringUtf8());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addReservedRange(b bVar) {
            bVar.getClass();
            ensureReservedRangeIsMutable();
            this.reservedRange_.add(bVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addValue(C9183h c9183h) {
            c9183h.getClass();
            ensureValueIsMutable();
            this.value_.add(c9183h);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearName() {
            this.bitField0_ &= -2;
            this.name_ = getDefaultInstance().getName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOptions() {
            this.options_ = null;
            this.bitField0_ &= -3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearReservedName() {
            this.reservedName_ = v27.m23722x();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearReservedRange() {
            this.reservedRange_ = v27.m23722x();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearValue() {
            this.value_ = v27.m23722x();
        }

        private void ensureReservedNameIsMutable() {
            w98.InterfaceC14504k<String> interfaceC14504k = this.reservedName_;
            if (interfaceC14504k.isModifiable()) {
                return;
            }
            this.reservedName_ = v27.m23698P(interfaceC14504k);
        }

        private void ensureReservedRangeIsMutable() {
            w98.InterfaceC14504k<b> interfaceC14504k = this.reservedRange_;
            if (interfaceC14504k.isModifiable()) {
                return;
            }
            this.reservedRange_ = v27.m23698P(interfaceC14504k);
        }

        private void ensureValueIsMutable() {
            w98.InterfaceC14504k<C9183h> interfaceC14504k = this.value_;
            if (interfaceC14504k.isModifiable()) {
                return;
            }
            this.value_ = v27.m23698P(interfaceC14504k);
        }

        public static C9175d getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public void mergeOptions(C9179f c9179f) {
            c9179f.getClass();
            C9179f c9179f2 = this.options_;
            if (c9179f2 == null || c9179f2 == C9179f.getDefaultInstance()) {
                this.options_ = c9179f;
            } else {
                this.options_ = ((C9179f.a) C9179f.newBuilder(this.options_).mergeFrom(c9179f)).buildPartial();
            }
            this.bitField0_ |= 2;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.m23738n();
        }

        public static C9175d parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (C9175d) v27.m23700S(DEFAULT_INSTANCE, inputStream);
        }

        public static C9175d parseFrom(ByteBuffer byteBuffer) throws ce8 {
            return (C9175d) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
        }

        public static uhc<C9175d> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeReservedRange(int i) {
            ensureReservedRangeIsMutable();
            this.reservedRange_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeValue(int i) {
            ensureValueIsMutable();
            this.value_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setName(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.name_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNameBytes(vj1 vj1Var) {
            this.name_ = vj1Var.toStringUtf8();
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOptions(C9179f c9179f) {
            c9179f.getClass();
            this.options_ = c9179f;
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setReservedName(int i, String str) {
            str.getClass();
            ensureReservedNameIsMutable();
            this.reservedName_.set(i, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setReservedRange(int i, b bVar) {
            bVar.getClass();
            ensureReservedRangeIsMutable();
            this.reservedRange_.set(i, bVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setValue(int i, C9183h c9183h) {
            c9183h.getClass();
            ensureValueIsMutable();
            this.value_.set(i, c9183h);
        }

        @Override // p000.m74.InterfaceC9177e
        public String getName() {
            return this.name_;
        }

        @Override // p000.m74.InterfaceC9177e
        public vj1 getNameBytes() {
            return vj1.copyFromUtf8(this.name_);
        }

        @Override // p000.m74.InterfaceC9177e
        public C9179f getOptions() {
            C9179f c9179f = this.options_;
            return c9179f == null ? C9179f.getDefaultInstance() : c9179f;
        }

        @Override // p000.m74.InterfaceC9177e
        public String getReservedName(int i) {
            return this.reservedName_.get(i);
        }

        @Override // p000.m74.InterfaceC9177e
        public vj1 getReservedNameBytes(int i) {
            return vj1.copyFromUtf8(this.reservedName_.get(i));
        }

        @Override // p000.m74.InterfaceC9177e
        public int getReservedNameCount() {
            return this.reservedName_.size();
        }

        @Override // p000.m74.InterfaceC9177e
        public List<String> getReservedNameList() {
            return this.reservedName_;
        }

        @Override // p000.m74.InterfaceC9177e
        public b getReservedRange(int i) {
            return this.reservedRange_.get(i);
        }

        @Override // p000.m74.InterfaceC9177e
        public int getReservedRangeCount() {
            return this.reservedRange_.size();
        }

        @Override // p000.m74.InterfaceC9177e
        public List<b> getReservedRangeList() {
            return this.reservedRange_;
        }

        public c getReservedRangeOrBuilder(int i) {
            return this.reservedRange_.get(i);
        }

        public List<? extends c> getReservedRangeOrBuilderList() {
            return this.reservedRange_;
        }

        @Override // p000.m74.InterfaceC9177e
        public C9183h getValue(int i) {
            return this.value_.get(i);
        }

        @Override // p000.m74.InterfaceC9177e
        public int getValueCount() {
            return this.value_.size();
        }

        @Override // p000.m74.InterfaceC9177e
        public List<C9183h> getValueList() {
            return this.value_;
        }

        public InterfaceC9185i getValueOrBuilder(int i) {
            return this.value_.get(i);
        }

        public List<? extends InterfaceC9185i> getValueOrBuilderList() {
            return this.value_;
        }

        @Override // p000.m74.InterfaceC9177e
        public boolean hasName() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // p000.m74.InterfaceC9177e
        public boolean hasOptions() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // p000.v27
        /* JADX INFO: renamed from: r */
        public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
            C9169a c9169a = null;
            switch (C9169a.f60048a[enumC13830i.ordinal()]) {
                case 1:
                    return new C9175d();
                case 2:
                    return new a(c9169a);
                case 3:
                    return v27.m23699Q(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0003\u0002\u0001ဈ\u0000\u0002Л\u0003ᐉ\u0001\u0004\u001b\u0005\u001a", new Object[]{"bitField0_", "name_", "value_", C9183h.class, "options_", "reservedRange_", b.class, "reservedName_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    uhc<C9175d> c13824c = PARSER;
                    if (c13824c == null) {
                        synchronized (C9175d.class) {
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
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    this.memoizedIsInitialized = (byte) (obj == null ? 0 : 1);
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public static a newBuilder(C9175d c9175d) {
            return DEFAULT_INSTANCE.m23739o(c9175d);
        }

        public static C9175d parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
            return (C9175d) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
        }

        public static C9175d parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
            return (C9175d) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
        }

        public static C9175d parseFrom(vj1 vj1Var) throws ce8 {
            return (C9175d) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addReservedRange(int i, b bVar) {
            bVar.getClass();
            ensureReservedRangeIsMutable();
            this.reservedRange_.add(i, bVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addValue(int i, C9183h c9183h) {
            c9183h.getClass();
            ensureValueIsMutable();
            this.value_.add(i, c9183h);
        }

        public static C9175d parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
            return (C9175d) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
        }

        public static C9175d parseFrom(byte[] bArr) throws ce8 {
            return (C9175d) v27.m23710c0(DEFAULT_INSTANCE, bArr);
        }

        public static C9175d parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
            return (C9175d) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
        }

        public static C9175d parseFrom(InputStream inputStream) throws IOException {
            return (C9175d) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
        }

        public static C9175d parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
            return (C9175d) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
        }

        public static C9175d parseFrom(f72 f72Var) throws IOException {
            return (C9175d) v27.m23704W(DEFAULT_INSTANCE, f72Var);
        }

        public static C9175d parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
            return (C9175d) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
        }
    }

    /* JADX INFO: renamed from: m74$d0 */
    public static final class C9176d0 extends v27.AbstractC13826e<C9176d0, a> implements InterfaceC9178e0 {
        private static final C9176d0 DEFAULT_INSTANCE;
        public static final int DEPRECATED_FIELD_NUMBER = 33;
        public static final int IDEMPOTENCY_LEVEL_FIELD_NUMBER = 34;
        private static volatile uhc<C9176d0> PARSER = null;
        public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
        private int bitField0_;
        private boolean deprecated_;
        private int idempotencyLevel_;
        private byte memoizedIsInitialized = 2;
        private w98.InterfaceC14504k<C9200p0> uninterpretedOption_ = v27.m23722x();

        /* JADX INFO: renamed from: m74$d0$a */
        public static final class a extends v27.AbstractC13825d<C9176d0, a> implements InterfaceC9178e0 {
            public /* synthetic */ a(C9169a c9169a) {
                this();
            }

            public a addAllUninterpretedOption(Iterable<? extends C9200p0> iterable) {
                m23743e();
                ((C9176d0) this.f89756b).addAllUninterpretedOption(iterable);
                return this;
            }

            public a addUninterpretedOption(C9200p0 c9200p0) {
                m23743e();
                ((C9176d0) this.f89756b).addUninterpretedOption(c9200p0);
                return this;
            }

            public a clearDeprecated() {
                m23743e();
                ((C9176d0) this.f89756b).clearDeprecated();
                return this;
            }

            public a clearIdempotencyLevel() {
                m23743e();
                ((C9176d0) this.f89756b).clearIdempotencyLevel();
                return this;
            }

            public a clearUninterpretedOption() {
                m23743e();
                ((C9176d0) this.f89756b).clearUninterpretedOption();
                return this;
            }

            @Override // p000.m74.InterfaceC9178e0
            public boolean getDeprecated() {
                return ((C9176d0) this.f89756b).getDeprecated();
            }

            @Override // p000.m74.InterfaceC9178e0
            public b getIdempotencyLevel() {
                return ((C9176d0) this.f89756b).getIdempotencyLevel();
            }

            @Override // p000.m74.InterfaceC9178e0
            public C9200p0 getUninterpretedOption(int i) {
                return ((C9176d0) this.f89756b).getUninterpretedOption(i);
            }

            @Override // p000.m74.InterfaceC9178e0
            public int getUninterpretedOptionCount() {
                return ((C9176d0) this.f89756b).getUninterpretedOptionCount();
            }

            @Override // p000.m74.InterfaceC9178e0
            public List<C9200p0> getUninterpretedOptionList() {
                return Collections.unmodifiableList(((C9176d0) this.f89756b).getUninterpretedOptionList());
            }

            @Override // p000.m74.InterfaceC9178e0
            public boolean hasDeprecated() {
                return ((C9176d0) this.f89756b).hasDeprecated();
            }

            @Override // p000.m74.InterfaceC9178e0
            public boolean hasIdempotencyLevel() {
                return ((C9176d0) this.f89756b).hasIdempotencyLevel();
            }

            public a removeUninterpretedOption(int i) {
                m23743e();
                ((C9176d0) this.f89756b).removeUninterpretedOption(i);
                return this;
            }

            public a setDeprecated(boolean z) {
                m23743e();
                ((C9176d0) this.f89756b).setDeprecated(z);
                return this;
            }

            public a setIdempotencyLevel(b bVar) {
                m23743e();
                ((C9176d0) this.f89756b).setIdempotencyLevel(bVar);
                return this;
            }

            public a setUninterpretedOption(int i, C9200p0 c9200p0) {
                m23743e();
                ((C9176d0) this.f89756b).setUninterpretedOption(i, c9200p0);
                return this;
            }

            private a() {
                super(C9176d0.DEFAULT_INSTANCE);
            }

            public a addUninterpretedOption(int i, C9200p0 c9200p0) {
                m23743e();
                ((C9176d0) this.f89756b).addUninterpretedOption(i, c9200p0);
                return this;
            }

            public a setUninterpretedOption(int i, C9200p0.a aVar) {
                m23743e();
                ((C9176d0) this.f89756b).setUninterpretedOption(i, aVar.build());
                return this;
            }

            public a addUninterpretedOption(C9200p0.a aVar) {
                m23743e();
                ((C9176d0) this.f89756b).addUninterpretedOption(aVar.build());
                return this;
            }

            public a addUninterpretedOption(int i, C9200p0.a aVar) {
                m23743e();
                ((C9176d0) this.f89756b).addUninterpretedOption(i, aVar.build());
                return this;
            }
        }

        /* JADX INFO: renamed from: m74$d0$b */
        public enum b implements w98.InterfaceC14497d {
            IDEMPOTENCY_UNKNOWN(0),
            NO_SIDE_EFFECTS(1),
            IDEMPOTENT(2);


            /* JADX INFO: renamed from: C */
            public static final w98.InterfaceC14498e<b> f60049C = new a();

            /* JADX INFO: renamed from: e */
            public static final int f60054e = 0;

            /* JADX INFO: renamed from: f */
            public static final int f60055f = 1;

            /* JADX INFO: renamed from: m */
            public static final int f60056m = 2;

            /* JADX INFO: renamed from: a */
            public final int f60057a;

            /* JADX INFO: renamed from: m74$d0$b$a */
            public class a implements w98.InterfaceC14498e<b> {
                @Override // p000.w98.InterfaceC14498e
                public b findValueByNumber(int i) {
                    return b.forNumber(i);
                }
            }

            /* JADX INFO: renamed from: m74$d0$b$b, reason: collision with other inner class name */
            public static final class C16480b implements w98.InterfaceC14499f {

                /* JADX INFO: renamed from: a */
                public static final w98.InterfaceC14499f f60058a = new C16480b();

                private C16480b() {
                }

                @Override // p000.w98.InterfaceC14499f
                public boolean isInRange(int i) {
                    return b.forNumber(i) != null;
                }
            }

            b(int i) {
                this.f60057a = i;
            }

            public static b forNumber(int i) {
                if (i == 0) {
                    return IDEMPOTENCY_UNKNOWN;
                }
                if (i == 1) {
                    return NO_SIDE_EFFECTS;
                }
                if (i != 2) {
                    return null;
                }
                return IDEMPOTENT;
            }

            public static w98.InterfaceC14498e<b> internalGetValueMap() {
                return f60049C;
            }

            public static w98.InterfaceC14499f internalGetVerifier() {
                return C16480b.f60058a;
            }

            @Override // p000.w98.InterfaceC14497d
            public final int getNumber() {
                return this.f60057a;
            }

            @Deprecated
            public static b valueOf(int i) {
                return forNumber(i);
            }
        }

        static {
            C9176d0 c9176d0 = new C9176d0();
            DEFAULT_INSTANCE = c9176d0;
            v27.m23715h0(C9176d0.class, c9176d0);
        }

        private C9176d0() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllUninterpretedOption(Iterable<? extends C9200p0> iterable) {
            ensureUninterpretedOptionIsMutable();
            AbstractC1714b3.m2856b(iterable, this.uninterpretedOption_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addUninterpretedOption(C9200p0 c9200p0) {
            c9200p0.getClass();
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.add(c9200p0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDeprecated() {
            this.bitField0_ &= -2;
            this.deprecated_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIdempotencyLevel() {
            this.bitField0_ &= -3;
            this.idempotencyLevel_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUninterpretedOption() {
            this.uninterpretedOption_ = v27.m23722x();
        }

        private void ensureUninterpretedOptionIsMutable() {
            w98.InterfaceC14504k<C9200p0> interfaceC14504k = this.uninterpretedOption_;
            if (interfaceC14504k.isModifiable()) {
                return;
            }
            this.uninterpretedOption_ = v27.m23698P(interfaceC14504k);
        }

        public static C9176d0 getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static a newBuilder() {
            return (a) DEFAULT_INSTANCE.m23738n();
        }

        public static C9176d0 parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (C9176d0) v27.m23700S(DEFAULT_INSTANCE, inputStream);
        }

        public static C9176d0 parseFrom(ByteBuffer byteBuffer) throws ce8 {
            return (C9176d0) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
        }

        public static uhc<C9176d0> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeUninterpretedOption(int i) {
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDeprecated(boolean z) {
            this.bitField0_ |= 1;
            this.deprecated_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIdempotencyLevel(b bVar) {
            this.idempotencyLevel_ = bVar.getNumber();
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUninterpretedOption(int i, C9200p0 c9200p0) {
            c9200p0.getClass();
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.set(i, c9200p0);
        }

        @Override // p000.m74.InterfaceC9178e0
        public boolean getDeprecated() {
            return this.deprecated_;
        }

        @Override // p000.m74.InterfaceC9178e0
        public b getIdempotencyLevel() {
            b bVarForNumber = b.forNumber(this.idempotencyLevel_);
            return bVarForNumber == null ? b.IDEMPOTENCY_UNKNOWN : bVarForNumber;
        }

        @Override // p000.m74.InterfaceC9178e0
        public C9200p0 getUninterpretedOption(int i) {
            return this.uninterpretedOption_.get(i);
        }

        @Override // p000.m74.InterfaceC9178e0
        public int getUninterpretedOptionCount() {
            return this.uninterpretedOption_.size();
        }

        @Override // p000.m74.InterfaceC9178e0
        public List<C9200p0> getUninterpretedOptionList() {
            return this.uninterpretedOption_;
        }

        public InterfaceC9202q0 getUninterpretedOptionOrBuilder(int i) {
            return this.uninterpretedOption_.get(i);
        }

        public List<? extends InterfaceC9202q0> getUninterpretedOptionOrBuilderList() {
            return this.uninterpretedOption_;
        }

        @Override // p000.m74.InterfaceC9178e0
        public boolean hasDeprecated() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // p000.m74.InterfaceC9178e0
        public boolean hasIdempotencyLevel() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // p000.v27
        /* JADX INFO: renamed from: r */
        public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
            C9169a c9169a = null;
            switch (C9169a.f60048a[enumC13830i.ordinal()]) {
                case 1:
                    return new C9176d0();
                case 2:
                    return new a(c9169a);
                case 3:
                    return v27.m23699Q(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001!ϧ\u0003\u0000\u0001\u0001!ဇ\u0000\"᠌\u0001ϧЛ", new Object[]{"bitField0_", "deprecated_", "idempotencyLevel_", b.internalGetVerifier(), "uninterpretedOption_", C9200p0.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    uhc<C9176d0> c13824c = PARSER;
                    if (c13824c == null) {
                        synchronized (C9176d0.class) {
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
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    this.memoizedIsInitialized = (byte) (obj == null ? 0 : 1);
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static a newBuilder(C9176d0 c9176d0) {
            return (a) DEFAULT_INSTANCE.m23739o(c9176d0);
        }

        public static C9176d0 parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
            return (C9176d0) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
        }

        public static C9176d0 parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
            return (C9176d0) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
        }

        public static C9176d0 parseFrom(vj1 vj1Var) throws ce8 {
            return (C9176d0) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addUninterpretedOption(int i, C9200p0 c9200p0) {
            c9200p0.getClass();
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.add(i, c9200p0);
        }

        public static C9176d0 parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
            return (C9176d0) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
        }

        public static C9176d0 parseFrom(byte[] bArr) throws ce8 {
            return (C9176d0) v27.m23710c0(DEFAULT_INSTANCE, bArr);
        }

        public static C9176d0 parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
            return (C9176d0) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
        }

        public static C9176d0 parseFrom(InputStream inputStream) throws IOException {
            return (C9176d0) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
        }

        public static C9176d0 parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
            return (C9176d0) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
        }

        public static C9176d0 parseFrom(f72 f72Var) throws IOException {
            return (C9176d0) v27.m23704W(DEFAULT_INSTANCE, f72Var);
        }

        public static C9176d0 parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
            return (C9176d0) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
        }
    }

    /* JADX INFO: renamed from: m74$e */
    public interface InterfaceC9177e extends rsa {
        String getName();

        vj1 getNameBytes();

        C9179f getOptions();

        String getReservedName(int i);

        vj1 getReservedNameBytes(int i);

        int getReservedNameCount();

        List<String> getReservedNameList();

        C9175d.b getReservedRange(int i);

        int getReservedRangeCount();

        List<C9175d.b> getReservedRangeList();

        C9183h getValue(int i);

        int getValueCount();

        List<C9183h> getValueList();

        boolean hasName();

        boolean hasOptions();
    }

    /* JADX INFO: renamed from: m74$e0 */
    public interface InterfaceC9178e0 extends v27.InterfaceC13827f<C9176d0, C9176d0.a> {
        boolean getDeprecated();

        C9176d0.b getIdempotencyLevel();

        C9200p0 getUninterpretedOption(int i);

        int getUninterpretedOptionCount();

        List<C9200p0> getUninterpretedOptionList();

        boolean hasDeprecated();

        boolean hasIdempotencyLevel();
    }

    /* JADX INFO: renamed from: m74$f */
    public static final class C9179f extends v27.AbstractC13826e<C9179f, a> implements InterfaceC9181g {
        public static final int ALLOW_ALIAS_FIELD_NUMBER = 2;
        private static final C9179f DEFAULT_INSTANCE;
        public static final int DEPRECATED_FIELD_NUMBER = 3;
        private static volatile uhc<C9179f> PARSER = null;
        public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
        private boolean allowAlias_;
        private int bitField0_;
        private boolean deprecated_;
        private byte memoizedIsInitialized = 2;
        private w98.InterfaceC14504k<C9200p0> uninterpretedOption_ = v27.m23722x();

        /* JADX INFO: renamed from: m74$f$a */
        public static final class a extends v27.AbstractC13825d<C9179f, a> implements InterfaceC9181g {
            public /* synthetic */ a(C9169a c9169a) {
                this();
            }

            public a addAllUninterpretedOption(Iterable<? extends C9200p0> iterable) {
                m23743e();
                ((C9179f) this.f89756b).addAllUninterpretedOption(iterable);
                return this;
            }

            public a addUninterpretedOption(C9200p0 c9200p0) {
                m23743e();
                ((C9179f) this.f89756b).addUninterpretedOption(c9200p0);
                return this;
            }

            public a clearAllowAlias() {
                m23743e();
                ((C9179f) this.f89756b).clearAllowAlias();
                return this;
            }

            public a clearDeprecated() {
                m23743e();
                ((C9179f) this.f89756b).clearDeprecated();
                return this;
            }

            public a clearUninterpretedOption() {
                m23743e();
                ((C9179f) this.f89756b).clearUninterpretedOption();
                return this;
            }

            @Override // p000.m74.InterfaceC9181g
            public boolean getAllowAlias() {
                return ((C9179f) this.f89756b).getAllowAlias();
            }

            @Override // p000.m74.InterfaceC9181g
            public boolean getDeprecated() {
                return ((C9179f) this.f89756b).getDeprecated();
            }

            @Override // p000.m74.InterfaceC9181g
            public C9200p0 getUninterpretedOption(int i) {
                return ((C9179f) this.f89756b).getUninterpretedOption(i);
            }

            @Override // p000.m74.InterfaceC9181g
            public int getUninterpretedOptionCount() {
                return ((C9179f) this.f89756b).getUninterpretedOptionCount();
            }

            @Override // p000.m74.InterfaceC9181g
            public List<C9200p0> getUninterpretedOptionList() {
                return Collections.unmodifiableList(((C9179f) this.f89756b).getUninterpretedOptionList());
            }

            @Override // p000.m74.InterfaceC9181g
            public boolean hasAllowAlias() {
                return ((C9179f) this.f89756b).hasAllowAlias();
            }

            @Override // p000.m74.InterfaceC9181g
            public boolean hasDeprecated() {
                return ((C9179f) this.f89756b).hasDeprecated();
            }

            public a removeUninterpretedOption(int i) {
                m23743e();
                ((C9179f) this.f89756b).removeUninterpretedOption(i);
                return this;
            }

            public a setAllowAlias(boolean z) {
                m23743e();
                ((C9179f) this.f89756b).setAllowAlias(z);
                return this;
            }

            public a setDeprecated(boolean z) {
                m23743e();
                ((C9179f) this.f89756b).setDeprecated(z);
                return this;
            }

            public a setUninterpretedOption(int i, C9200p0 c9200p0) {
                m23743e();
                ((C9179f) this.f89756b).setUninterpretedOption(i, c9200p0);
                return this;
            }

            private a() {
                super(C9179f.DEFAULT_INSTANCE);
            }

            public a addUninterpretedOption(int i, C9200p0 c9200p0) {
                m23743e();
                ((C9179f) this.f89756b).addUninterpretedOption(i, c9200p0);
                return this;
            }

            public a setUninterpretedOption(int i, C9200p0.a aVar) {
                m23743e();
                ((C9179f) this.f89756b).setUninterpretedOption(i, aVar.build());
                return this;
            }

            public a addUninterpretedOption(C9200p0.a aVar) {
                m23743e();
                ((C9179f) this.f89756b).addUninterpretedOption(aVar.build());
                return this;
            }

            public a addUninterpretedOption(int i, C9200p0.a aVar) {
                m23743e();
                ((C9179f) this.f89756b).addUninterpretedOption(i, aVar.build());
                return this;
            }
        }

        static {
            C9179f c9179f = new C9179f();
            DEFAULT_INSTANCE = c9179f;
            v27.m23715h0(C9179f.class, c9179f);
        }

        private C9179f() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllUninterpretedOption(Iterable<? extends C9200p0> iterable) {
            ensureUninterpretedOptionIsMutable();
            AbstractC1714b3.m2856b(iterable, this.uninterpretedOption_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addUninterpretedOption(C9200p0 c9200p0) {
            c9200p0.getClass();
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.add(c9200p0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAllowAlias() {
            this.bitField0_ &= -2;
            this.allowAlias_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDeprecated() {
            this.bitField0_ &= -3;
            this.deprecated_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUninterpretedOption() {
            this.uninterpretedOption_ = v27.m23722x();
        }

        private void ensureUninterpretedOptionIsMutable() {
            w98.InterfaceC14504k<C9200p0> interfaceC14504k = this.uninterpretedOption_;
            if (interfaceC14504k.isModifiable()) {
                return;
            }
            this.uninterpretedOption_ = v27.m23698P(interfaceC14504k);
        }

        public static C9179f getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static a newBuilder() {
            return (a) DEFAULT_INSTANCE.m23738n();
        }

        public static C9179f parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (C9179f) v27.m23700S(DEFAULT_INSTANCE, inputStream);
        }

        public static C9179f parseFrom(ByteBuffer byteBuffer) throws ce8 {
            return (C9179f) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
        }

        public static uhc<C9179f> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeUninterpretedOption(int i) {
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAllowAlias(boolean z) {
            this.bitField0_ |= 1;
            this.allowAlias_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDeprecated(boolean z) {
            this.bitField0_ |= 2;
            this.deprecated_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUninterpretedOption(int i, C9200p0 c9200p0) {
            c9200p0.getClass();
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.set(i, c9200p0);
        }

        @Override // p000.m74.InterfaceC9181g
        public boolean getAllowAlias() {
            return this.allowAlias_;
        }

        @Override // p000.m74.InterfaceC9181g
        public boolean getDeprecated() {
            return this.deprecated_;
        }

        @Override // p000.m74.InterfaceC9181g
        public C9200p0 getUninterpretedOption(int i) {
            return this.uninterpretedOption_.get(i);
        }

        @Override // p000.m74.InterfaceC9181g
        public int getUninterpretedOptionCount() {
            return this.uninterpretedOption_.size();
        }

        @Override // p000.m74.InterfaceC9181g
        public List<C9200p0> getUninterpretedOptionList() {
            return this.uninterpretedOption_;
        }

        public InterfaceC9202q0 getUninterpretedOptionOrBuilder(int i) {
            return this.uninterpretedOption_.get(i);
        }

        public List<? extends InterfaceC9202q0> getUninterpretedOptionOrBuilderList() {
            return this.uninterpretedOption_;
        }

        @Override // p000.m74.InterfaceC9181g
        public boolean hasAllowAlias() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // p000.m74.InterfaceC9181g
        public boolean hasDeprecated() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // p000.v27
        /* JADX INFO: renamed from: r */
        public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
            C9169a c9169a = null;
            switch (C9169a.f60048a[enumC13830i.ordinal()]) {
                case 1:
                    return new C9179f();
                case 2:
                    return new a(c9169a);
                case 3:
                    return v27.m23699Q(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0002ϧ\u0003\u0000\u0001\u0001\u0002ဇ\u0000\u0003ဇ\u0001ϧЛ", new Object[]{"bitField0_", "allowAlias_", "deprecated_", "uninterpretedOption_", C9200p0.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    uhc<C9179f> c13824c = PARSER;
                    if (c13824c == null) {
                        synchronized (C9179f.class) {
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
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    this.memoizedIsInitialized = (byte) (obj == null ? 0 : 1);
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static a newBuilder(C9179f c9179f) {
            return (a) DEFAULT_INSTANCE.m23739o(c9179f);
        }

        public static C9179f parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
            return (C9179f) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
        }

        public static C9179f parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
            return (C9179f) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
        }

        public static C9179f parseFrom(vj1 vj1Var) throws ce8 {
            return (C9179f) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addUninterpretedOption(int i, C9200p0 c9200p0) {
            c9200p0.getClass();
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.add(i, c9200p0);
        }

        public static C9179f parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
            return (C9179f) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
        }

        public static C9179f parseFrom(byte[] bArr) throws ce8 {
            return (C9179f) v27.m23710c0(DEFAULT_INSTANCE, bArr);
        }

        public static C9179f parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
            return (C9179f) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
        }

        public static C9179f parseFrom(InputStream inputStream) throws IOException {
            return (C9179f) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
        }

        public static C9179f parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
            return (C9179f) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
        }

        public static C9179f parseFrom(f72 f72Var) throws IOException {
            return (C9179f) v27.m23704W(DEFAULT_INSTANCE, f72Var);
        }

        public static C9179f parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
            return (C9179f) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
        }
    }

    /* JADX INFO: renamed from: m74$f0 */
    public static final class C9180f0 extends v27<C9180f0, a> implements InterfaceC9182g0 {
        private static final C9180f0 DEFAULT_INSTANCE;
        public static final int NAME_FIELD_NUMBER = 1;
        public static final int OPTIONS_FIELD_NUMBER = 2;
        private static volatile uhc<C9180f0> PARSER;
        private int bitField0_;
        private byte memoizedIsInitialized = 2;
        private String name_ = "";
        private C9184h0 options_;

        /* JADX INFO: renamed from: m74$f0$a */
        public static final class a extends v27.AbstractC13823b<C9180f0, a> implements InterfaceC9182g0 {
            public /* synthetic */ a(C9169a c9169a) {
                this();
            }

            public a clearName() {
                m23743e();
                ((C9180f0) this.f89756b).clearName();
                return this;
            }

            public a clearOptions() {
                m23743e();
                ((C9180f0) this.f89756b).clearOptions();
                return this;
            }

            @Override // p000.m74.InterfaceC9182g0
            public String getName() {
                return ((C9180f0) this.f89756b).getName();
            }

            @Override // p000.m74.InterfaceC9182g0
            public vj1 getNameBytes() {
                return ((C9180f0) this.f89756b).getNameBytes();
            }

            @Override // p000.m74.InterfaceC9182g0
            public C9184h0 getOptions() {
                return ((C9180f0) this.f89756b).getOptions();
            }

            @Override // p000.m74.InterfaceC9182g0
            public boolean hasName() {
                return ((C9180f0) this.f89756b).hasName();
            }

            @Override // p000.m74.InterfaceC9182g0
            public boolean hasOptions() {
                return ((C9180f0) this.f89756b).hasOptions();
            }

            public a mergeOptions(C9184h0 c9184h0) {
                m23743e();
                ((C9180f0) this.f89756b).mergeOptions(c9184h0);
                return this;
            }

            public a setName(String str) {
                m23743e();
                ((C9180f0) this.f89756b).setName(str);
                return this;
            }

            public a setNameBytes(vj1 vj1Var) {
                m23743e();
                ((C9180f0) this.f89756b).setNameBytes(vj1Var);
                return this;
            }

            public a setOptions(C9184h0 c9184h0) {
                m23743e();
                ((C9180f0) this.f89756b).setOptions(c9184h0);
                return this;
            }

            private a() {
                super(C9180f0.DEFAULT_INSTANCE);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public a setOptions(C9184h0.a aVar) {
                m23743e();
                ((C9180f0) this.f89756b).setOptions((C9184h0) aVar.build());
                return this;
            }
        }

        static {
            C9180f0 c9180f0 = new C9180f0();
            DEFAULT_INSTANCE = c9180f0;
            v27.m23715h0(C9180f0.class, c9180f0);
        }

        private C9180f0() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearName() {
            this.bitField0_ &= -2;
            this.name_ = getDefaultInstance().getName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOptions() {
            this.options_ = null;
            this.bitField0_ &= -3;
        }

        public static C9180f0 getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public void mergeOptions(C9184h0 c9184h0) {
            c9184h0.getClass();
            C9184h0 c9184h02 = this.options_;
            if (c9184h02 == null || c9184h02 == C9184h0.getDefaultInstance()) {
                this.options_ = c9184h0;
            } else {
                this.options_ = ((C9184h0.a) C9184h0.newBuilder(this.options_).mergeFrom(c9184h0)).buildPartial();
            }
            this.bitField0_ |= 2;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.m23738n();
        }

        public static C9180f0 parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (C9180f0) v27.m23700S(DEFAULT_INSTANCE, inputStream);
        }

        public static C9180f0 parseFrom(ByteBuffer byteBuffer) throws ce8 {
            return (C9180f0) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
        }

        public static uhc<C9180f0> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setName(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.name_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNameBytes(vj1 vj1Var) {
            this.name_ = vj1Var.toStringUtf8();
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOptions(C9184h0 c9184h0) {
            c9184h0.getClass();
            this.options_ = c9184h0;
            this.bitField0_ |= 2;
        }

        @Override // p000.m74.InterfaceC9182g0
        public String getName() {
            return this.name_;
        }

        @Override // p000.m74.InterfaceC9182g0
        public vj1 getNameBytes() {
            return vj1.copyFromUtf8(this.name_);
        }

        @Override // p000.m74.InterfaceC9182g0
        public C9184h0 getOptions() {
            C9184h0 c9184h0 = this.options_;
            return c9184h0 == null ? C9184h0.getDefaultInstance() : c9184h0;
        }

        @Override // p000.m74.InterfaceC9182g0
        public boolean hasName() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // p000.m74.InterfaceC9182g0
        public boolean hasOptions() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // p000.v27
        /* JADX INFO: renamed from: r */
        public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
            C9169a c9169a = null;
            switch (C9169a.f60048a[enumC13830i.ordinal()]) {
                case 1:
                    return new C9180f0();
                case 2:
                    return new a(c9169a);
                case 3:
                    return v27.m23699Q(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဈ\u0000\u0002ᐉ\u0001", new Object[]{"bitField0_", "name_", "options_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    uhc<C9180f0> c13824c = PARSER;
                    if (c13824c == null) {
                        synchronized (C9180f0.class) {
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
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    this.memoizedIsInitialized = (byte) (obj == null ? 0 : 1);
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public static a newBuilder(C9180f0 c9180f0) {
            return DEFAULT_INSTANCE.m23739o(c9180f0);
        }

        public static C9180f0 parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
            return (C9180f0) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
        }

        public static C9180f0 parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
            return (C9180f0) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
        }

        public static C9180f0 parseFrom(vj1 vj1Var) throws ce8 {
            return (C9180f0) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
        }

        public static C9180f0 parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
            return (C9180f0) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
        }

        public static C9180f0 parseFrom(byte[] bArr) throws ce8 {
            return (C9180f0) v27.m23710c0(DEFAULT_INSTANCE, bArr);
        }

        public static C9180f0 parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
            return (C9180f0) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
        }

        public static C9180f0 parseFrom(InputStream inputStream) throws IOException {
            return (C9180f0) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
        }

        public static C9180f0 parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
            return (C9180f0) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
        }

        public static C9180f0 parseFrom(f72 f72Var) throws IOException {
            return (C9180f0) v27.m23704W(DEFAULT_INSTANCE, f72Var);
        }

        public static C9180f0 parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
            return (C9180f0) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
        }
    }

    /* JADX INFO: renamed from: m74$g */
    public interface InterfaceC9181g extends v27.InterfaceC13827f<C9179f, C9179f.a> {
        boolean getAllowAlias();

        boolean getDeprecated();

        C9200p0 getUninterpretedOption(int i);

        int getUninterpretedOptionCount();

        List<C9200p0> getUninterpretedOptionList();

        boolean hasAllowAlias();

        boolean hasDeprecated();
    }

    /* JADX INFO: renamed from: m74$g0 */
    public interface InterfaceC9182g0 extends rsa {
        String getName();

        vj1 getNameBytes();

        C9184h0 getOptions();

        boolean hasName();

        boolean hasOptions();
    }

    /* JADX INFO: renamed from: m74$h */
    public static final class C9183h extends v27<C9183h, a> implements InterfaceC9185i {
        private static final C9183h DEFAULT_INSTANCE;
        public static final int NAME_FIELD_NUMBER = 1;
        public static final int NUMBER_FIELD_NUMBER = 2;
        public static final int OPTIONS_FIELD_NUMBER = 3;
        private static volatile uhc<C9183h> PARSER;
        private int bitField0_;
        private byte memoizedIsInitialized = 2;
        private String name_ = "";
        private int number_;
        private C9187j options_;

        /* JADX INFO: renamed from: m74$h$a */
        public static final class a extends v27.AbstractC13823b<C9183h, a> implements InterfaceC9185i {
            public /* synthetic */ a(C9169a c9169a) {
                this();
            }

            public a clearName() {
                m23743e();
                ((C9183h) this.f89756b).clearName();
                return this;
            }

            public a clearNumber() {
                m23743e();
                ((C9183h) this.f89756b).clearNumber();
                return this;
            }

            public a clearOptions() {
                m23743e();
                ((C9183h) this.f89756b).clearOptions();
                return this;
            }

            @Override // p000.m74.InterfaceC9185i
            public String getName() {
                return ((C9183h) this.f89756b).getName();
            }

            @Override // p000.m74.InterfaceC9185i
            public vj1 getNameBytes() {
                return ((C9183h) this.f89756b).getNameBytes();
            }

            @Override // p000.m74.InterfaceC9185i
            public int getNumber() {
                return ((C9183h) this.f89756b).getNumber();
            }

            @Override // p000.m74.InterfaceC9185i
            public C9187j getOptions() {
                return ((C9183h) this.f89756b).getOptions();
            }

            @Override // p000.m74.InterfaceC9185i
            public boolean hasName() {
                return ((C9183h) this.f89756b).hasName();
            }

            @Override // p000.m74.InterfaceC9185i
            public boolean hasNumber() {
                return ((C9183h) this.f89756b).hasNumber();
            }

            @Override // p000.m74.InterfaceC9185i
            public boolean hasOptions() {
                return ((C9183h) this.f89756b).hasOptions();
            }

            public a mergeOptions(C9187j c9187j) {
                m23743e();
                ((C9183h) this.f89756b).mergeOptions(c9187j);
                return this;
            }

            public a setName(String str) {
                m23743e();
                ((C9183h) this.f89756b).setName(str);
                return this;
            }

            public a setNameBytes(vj1 vj1Var) {
                m23743e();
                ((C9183h) this.f89756b).setNameBytes(vj1Var);
                return this;
            }

            public a setNumber(int i) {
                m23743e();
                ((C9183h) this.f89756b).setNumber(i);
                return this;
            }

            public a setOptions(C9187j c9187j) {
                m23743e();
                ((C9183h) this.f89756b).setOptions(c9187j);
                return this;
            }

            private a() {
                super(C9183h.DEFAULT_INSTANCE);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public a setOptions(C9187j.a aVar) {
                m23743e();
                ((C9183h) this.f89756b).setOptions((C9187j) aVar.build());
                return this;
            }
        }

        static {
            C9183h c9183h = new C9183h();
            DEFAULT_INSTANCE = c9183h;
            v27.m23715h0(C9183h.class, c9183h);
        }

        private C9183h() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearName() {
            this.bitField0_ &= -2;
            this.name_ = getDefaultInstance().getName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNumber() {
            this.bitField0_ &= -3;
            this.number_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOptions() {
            this.options_ = null;
            this.bitField0_ &= -5;
        }

        public static C9183h getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public void mergeOptions(C9187j c9187j) {
            c9187j.getClass();
            C9187j c9187j2 = this.options_;
            if (c9187j2 == null || c9187j2 == C9187j.getDefaultInstance()) {
                this.options_ = c9187j;
            } else {
                this.options_ = ((C9187j.a) C9187j.newBuilder(this.options_).mergeFrom(c9187j)).buildPartial();
            }
            this.bitField0_ |= 4;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.m23738n();
        }

        public static C9183h parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (C9183h) v27.m23700S(DEFAULT_INSTANCE, inputStream);
        }

        public static C9183h parseFrom(ByteBuffer byteBuffer) throws ce8 {
            return (C9183h) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
        }

        public static uhc<C9183h> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setName(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.name_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNameBytes(vj1 vj1Var) {
            this.name_ = vj1Var.toStringUtf8();
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNumber(int i) {
            this.bitField0_ |= 2;
            this.number_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOptions(C9187j c9187j) {
            c9187j.getClass();
            this.options_ = c9187j;
            this.bitField0_ |= 4;
        }

        @Override // p000.m74.InterfaceC9185i
        public String getName() {
            return this.name_;
        }

        @Override // p000.m74.InterfaceC9185i
        public vj1 getNameBytes() {
            return vj1.copyFromUtf8(this.name_);
        }

        @Override // p000.m74.InterfaceC9185i
        public int getNumber() {
            return this.number_;
        }

        @Override // p000.m74.InterfaceC9185i
        public C9187j getOptions() {
            C9187j c9187j = this.options_;
            return c9187j == null ? C9187j.getDefaultInstance() : c9187j;
        }

        @Override // p000.m74.InterfaceC9185i
        public boolean hasName() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // p000.m74.InterfaceC9185i
        public boolean hasNumber() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // p000.m74.InterfaceC9185i
        public boolean hasOptions() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // p000.v27
        /* JADX INFO: renamed from: r */
        public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
            C9169a c9169a = null;
            switch (C9169a.f60048a[enumC13830i.ordinal()]) {
                case 1:
                    return new C9183h();
                case 2:
                    return new a(c9169a);
                case 3:
                    return v27.m23699Q(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ဈ\u0000\u0002င\u0001\u0003ᐉ\u0002", new Object[]{"bitField0_", "name_", "number_", "options_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    uhc<C9183h> c13824c = PARSER;
                    if (c13824c == null) {
                        synchronized (C9183h.class) {
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
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    this.memoizedIsInitialized = (byte) (obj == null ? 0 : 1);
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public static a newBuilder(C9183h c9183h) {
            return DEFAULT_INSTANCE.m23739o(c9183h);
        }

        public static C9183h parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
            return (C9183h) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
        }

        public static C9183h parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
            return (C9183h) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
        }

        public static C9183h parseFrom(vj1 vj1Var) throws ce8 {
            return (C9183h) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
        }

        public static C9183h parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
            return (C9183h) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
        }

        public static C9183h parseFrom(byte[] bArr) throws ce8 {
            return (C9183h) v27.m23710c0(DEFAULT_INSTANCE, bArr);
        }

        public static C9183h parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
            return (C9183h) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
        }

        public static C9183h parseFrom(InputStream inputStream) throws IOException {
            return (C9183h) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
        }

        public static C9183h parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
            return (C9183h) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
        }

        public static C9183h parseFrom(f72 f72Var) throws IOException {
            return (C9183h) v27.m23704W(DEFAULT_INSTANCE, f72Var);
        }

        public static C9183h parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
            return (C9183h) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
        }
    }

    /* JADX INFO: renamed from: m74$h0 */
    public static final class C9184h0 extends v27.AbstractC13826e<C9184h0, a> implements InterfaceC9186i0 {
        private static final C9184h0 DEFAULT_INSTANCE;
        private static volatile uhc<C9184h0> PARSER = null;
        public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
        private byte memoizedIsInitialized = 2;
        private w98.InterfaceC14504k<C9200p0> uninterpretedOption_ = v27.m23722x();

        /* JADX INFO: renamed from: m74$h0$a */
        public static final class a extends v27.AbstractC13825d<C9184h0, a> implements InterfaceC9186i0 {
            public /* synthetic */ a(C9169a c9169a) {
                this();
            }

            public a addAllUninterpretedOption(Iterable<? extends C9200p0> iterable) {
                m23743e();
                ((C9184h0) this.f89756b).addAllUninterpretedOption(iterable);
                return this;
            }

            public a addUninterpretedOption(C9200p0 c9200p0) {
                m23743e();
                ((C9184h0) this.f89756b).addUninterpretedOption(c9200p0);
                return this;
            }

            public a clearUninterpretedOption() {
                m23743e();
                ((C9184h0) this.f89756b).clearUninterpretedOption();
                return this;
            }

            @Override // p000.m74.InterfaceC9186i0
            public C9200p0 getUninterpretedOption(int i) {
                return ((C9184h0) this.f89756b).getUninterpretedOption(i);
            }

            @Override // p000.m74.InterfaceC9186i0
            public int getUninterpretedOptionCount() {
                return ((C9184h0) this.f89756b).getUninterpretedOptionCount();
            }

            @Override // p000.m74.InterfaceC9186i0
            public List<C9200p0> getUninterpretedOptionList() {
                return Collections.unmodifiableList(((C9184h0) this.f89756b).getUninterpretedOptionList());
            }

            public a removeUninterpretedOption(int i) {
                m23743e();
                ((C9184h0) this.f89756b).removeUninterpretedOption(i);
                return this;
            }

            public a setUninterpretedOption(int i, C9200p0 c9200p0) {
                m23743e();
                ((C9184h0) this.f89756b).setUninterpretedOption(i, c9200p0);
                return this;
            }

            private a() {
                super(C9184h0.DEFAULT_INSTANCE);
            }

            public a addUninterpretedOption(int i, C9200p0 c9200p0) {
                m23743e();
                ((C9184h0) this.f89756b).addUninterpretedOption(i, c9200p0);
                return this;
            }

            public a setUninterpretedOption(int i, C9200p0.a aVar) {
                m23743e();
                ((C9184h0) this.f89756b).setUninterpretedOption(i, aVar.build());
                return this;
            }

            public a addUninterpretedOption(C9200p0.a aVar) {
                m23743e();
                ((C9184h0) this.f89756b).addUninterpretedOption(aVar.build());
                return this;
            }

            public a addUninterpretedOption(int i, C9200p0.a aVar) {
                m23743e();
                ((C9184h0) this.f89756b).addUninterpretedOption(i, aVar.build());
                return this;
            }
        }

        static {
            C9184h0 c9184h0 = new C9184h0();
            DEFAULT_INSTANCE = c9184h0;
            v27.m23715h0(C9184h0.class, c9184h0);
        }

        private C9184h0() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllUninterpretedOption(Iterable<? extends C9200p0> iterable) {
            ensureUninterpretedOptionIsMutable();
            AbstractC1714b3.m2856b(iterable, this.uninterpretedOption_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addUninterpretedOption(C9200p0 c9200p0) {
            c9200p0.getClass();
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.add(c9200p0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUninterpretedOption() {
            this.uninterpretedOption_ = v27.m23722x();
        }

        private void ensureUninterpretedOptionIsMutable() {
            w98.InterfaceC14504k<C9200p0> interfaceC14504k = this.uninterpretedOption_;
            if (interfaceC14504k.isModifiable()) {
                return;
            }
            this.uninterpretedOption_ = v27.m23698P(interfaceC14504k);
        }

        public static C9184h0 getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static a newBuilder() {
            return (a) DEFAULT_INSTANCE.m23738n();
        }

        public static C9184h0 parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (C9184h0) v27.m23700S(DEFAULT_INSTANCE, inputStream);
        }

        public static C9184h0 parseFrom(ByteBuffer byteBuffer) throws ce8 {
            return (C9184h0) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
        }

        public static uhc<C9184h0> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeUninterpretedOption(int i) {
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUninterpretedOption(int i, C9200p0 c9200p0) {
            c9200p0.getClass();
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.set(i, c9200p0);
        }

        @Override // p000.m74.InterfaceC9186i0
        public C9200p0 getUninterpretedOption(int i) {
            return this.uninterpretedOption_.get(i);
        }

        @Override // p000.m74.InterfaceC9186i0
        public int getUninterpretedOptionCount() {
            return this.uninterpretedOption_.size();
        }

        @Override // p000.m74.InterfaceC9186i0
        public List<C9200p0> getUninterpretedOptionList() {
            return this.uninterpretedOption_;
        }

        public InterfaceC9202q0 getUninterpretedOptionOrBuilder(int i) {
            return this.uninterpretedOption_.get(i);
        }

        public List<? extends InterfaceC9202q0> getUninterpretedOptionOrBuilderList() {
            return this.uninterpretedOption_;
        }

        @Override // p000.v27
        /* JADX INFO: renamed from: r */
        public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
            C9169a c9169a = null;
            switch (C9169a.f60048a[enumC13830i.ordinal()]) {
                case 1:
                    return new C9184h0();
                case 2:
                    return new a(c9169a);
                case 3:
                    return v27.m23699Q(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000ϧϧ\u0001\u0000\u0001\u0001ϧЛ", new Object[]{"uninterpretedOption_", C9200p0.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    uhc<C9184h0> c13824c = PARSER;
                    if (c13824c == null) {
                        synchronized (C9184h0.class) {
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
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    this.memoizedIsInitialized = (byte) (obj == null ? 0 : 1);
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static a newBuilder(C9184h0 c9184h0) {
            return (a) DEFAULT_INSTANCE.m23739o(c9184h0);
        }

        public static C9184h0 parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
            return (C9184h0) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
        }

        public static C9184h0 parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
            return (C9184h0) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
        }

        public static C9184h0 parseFrom(vj1 vj1Var) throws ce8 {
            return (C9184h0) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addUninterpretedOption(int i, C9200p0 c9200p0) {
            c9200p0.getClass();
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.add(i, c9200p0);
        }

        public static C9184h0 parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
            return (C9184h0) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
        }

        public static C9184h0 parseFrom(byte[] bArr) throws ce8 {
            return (C9184h0) v27.m23710c0(DEFAULT_INSTANCE, bArr);
        }

        public static C9184h0 parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
            return (C9184h0) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
        }

        public static C9184h0 parseFrom(InputStream inputStream) throws IOException {
            return (C9184h0) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
        }

        public static C9184h0 parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
            return (C9184h0) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
        }

        public static C9184h0 parseFrom(f72 f72Var) throws IOException {
            return (C9184h0) v27.m23704W(DEFAULT_INSTANCE, f72Var);
        }

        public static C9184h0 parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
            return (C9184h0) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
        }
    }

    /* JADX INFO: renamed from: m74$i */
    public interface InterfaceC9185i extends rsa {
        String getName();

        vj1 getNameBytes();

        int getNumber();

        C9187j getOptions();

        boolean hasName();

        boolean hasNumber();

        boolean hasOptions();
    }

    /* JADX INFO: renamed from: m74$i0 */
    public interface InterfaceC9186i0 extends v27.InterfaceC13827f<C9184h0, C9184h0.a> {
        C9200p0 getUninterpretedOption(int i);

        int getUninterpretedOptionCount();

        List<C9200p0> getUninterpretedOptionList();
    }

    /* JADX INFO: renamed from: m74$j */
    public static final class C9187j extends v27.AbstractC13826e<C9187j, a> implements InterfaceC9189k {
        private static final C9187j DEFAULT_INSTANCE;
        public static final int DEPRECATED_FIELD_NUMBER = 1;
        private static volatile uhc<C9187j> PARSER = null;
        public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
        private int bitField0_;
        private boolean deprecated_;
        private byte memoizedIsInitialized = 2;
        private w98.InterfaceC14504k<C9200p0> uninterpretedOption_ = v27.m23722x();

        /* JADX INFO: renamed from: m74$j$a */
        public static final class a extends v27.AbstractC13825d<C9187j, a> implements InterfaceC9189k {
            public /* synthetic */ a(C9169a c9169a) {
                this();
            }

            public a addAllUninterpretedOption(Iterable<? extends C9200p0> iterable) {
                m23743e();
                ((C9187j) this.f89756b).addAllUninterpretedOption(iterable);
                return this;
            }

            public a addUninterpretedOption(C9200p0 c9200p0) {
                m23743e();
                ((C9187j) this.f89756b).addUninterpretedOption(c9200p0);
                return this;
            }

            public a clearDeprecated() {
                m23743e();
                ((C9187j) this.f89756b).clearDeprecated();
                return this;
            }

            public a clearUninterpretedOption() {
                m23743e();
                ((C9187j) this.f89756b).clearUninterpretedOption();
                return this;
            }

            @Override // p000.m74.InterfaceC9189k
            public boolean getDeprecated() {
                return ((C9187j) this.f89756b).getDeprecated();
            }

            @Override // p000.m74.InterfaceC9189k
            public C9200p0 getUninterpretedOption(int i) {
                return ((C9187j) this.f89756b).getUninterpretedOption(i);
            }

            @Override // p000.m74.InterfaceC9189k
            public int getUninterpretedOptionCount() {
                return ((C9187j) this.f89756b).getUninterpretedOptionCount();
            }

            @Override // p000.m74.InterfaceC9189k
            public List<C9200p0> getUninterpretedOptionList() {
                return Collections.unmodifiableList(((C9187j) this.f89756b).getUninterpretedOptionList());
            }

            @Override // p000.m74.InterfaceC9189k
            public boolean hasDeprecated() {
                return ((C9187j) this.f89756b).hasDeprecated();
            }

            public a removeUninterpretedOption(int i) {
                m23743e();
                ((C9187j) this.f89756b).removeUninterpretedOption(i);
                return this;
            }

            public a setDeprecated(boolean z) {
                m23743e();
                ((C9187j) this.f89756b).setDeprecated(z);
                return this;
            }

            public a setUninterpretedOption(int i, C9200p0 c9200p0) {
                m23743e();
                ((C9187j) this.f89756b).setUninterpretedOption(i, c9200p0);
                return this;
            }

            private a() {
                super(C9187j.DEFAULT_INSTANCE);
            }

            public a addUninterpretedOption(int i, C9200p0 c9200p0) {
                m23743e();
                ((C9187j) this.f89756b).addUninterpretedOption(i, c9200p0);
                return this;
            }

            public a setUninterpretedOption(int i, C9200p0.a aVar) {
                m23743e();
                ((C9187j) this.f89756b).setUninterpretedOption(i, aVar.build());
                return this;
            }

            public a addUninterpretedOption(C9200p0.a aVar) {
                m23743e();
                ((C9187j) this.f89756b).addUninterpretedOption(aVar.build());
                return this;
            }

            public a addUninterpretedOption(int i, C9200p0.a aVar) {
                m23743e();
                ((C9187j) this.f89756b).addUninterpretedOption(i, aVar.build());
                return this;
            }
        }

        static {
            C9187j c9187j = new C9187j();
            DEFAULT_INSTANCE = c9187j;
            v27.m23715h0(C9187j.class, c9187j);
        }

        private C9187j() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllUninterpretedOption(Iterable<? extends C9200p0> iterable) {
            ensureUninterpretedOptionIsMutable();
            AbstractC1714b3.m2856b(iterable, this.uninterpretedOption_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addUninterpretedOption(C9200p0 c9200p0) {
            c9200p0.getClass();
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.add(c9200p0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDeprecated() {
            this.bitField0_ &= -2;
            this.deprecated_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUninterpretedOption() {
            this.uninterpretedOption_ = v27.m23722x();
        }

        private void ensureUninterpretedOptionIsMutable() {
            w98.InterfaceC14504k<C9200p0> interfaceC14504k = this.uninterpretedOption_;
            if (interfaceC14504k.isModifiable()) {
                return;
            }
            this.uninterpretedOption_ = v27.m23698P(interfaceC14504k);
        }

        public static C9187j getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static a newBuilder() {
            return (a) DEFAULT_INSTANCE.m23738n();
        }

        public static C9187j parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (C9187j) v27.m23700S(DEFAULT_INSTANCE, inputStream);
        }

        public static C9187j parseFrom(ByteBuffer byteBuffer) throws ce8 {
            return (C9187j) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
        }

        public static uhc<C9187j> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeUninterpretedOption(int i) {
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDeprecated(boolean z) {
            this.bitField0_ |= 1;
            this.deprecated_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUninterpretedOption(int i, C9200p0 c9200p0) {
            c9200p0.getClass();
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.set(i, c9200p0);
        }

        @Override // p000.m74.InterfaceC9189k
        public boolean getDeprecated() {
            return this.deprecated_;
        }

        @Override // p000.m74.InterfaceC9189k
        public C9200p0 getUninterpretedOption(int i) {
            return this.uninterpretedOption_.get(i);
        }

        @Override // p000.m74.InterfaceC9189k
        public int getUninterpretedOptionCount() {
            return this.uninterpretedOption_.size();
        }

        @Override // p000.m74.InterfaceC9189k
        public List<C9200p0> getUninterpretedOptionList() {
            return this.uninterpretedOption_;
        }

        public InterfaceC9202q0 getUninterpretedOptionOrBuilder(int i) {
            return this.uninterpretedOption_.get(i);
        }

        public List<? extends InterfaceC9202q0> getUninterpretedOptionOrBuilderList() {
            return this.uninterpretedOption_;
        }

        @Override // p000.m74.InterfaceC9189k
        public boolean hasDeprecated() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // p000.v27
        /* JADX INFO: renamed from: r */
        public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
            C9169a c9169a = null;
            switch (C9169a.f60048a[enumC13830i.ordinal()]) {
                case 1:
                    return new C9187j();
                case 2:
                    return new a(c9169a);
                case 3:
                    return v27.m23699Q(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001ϧ\u0002\u0000\u0001\u0001\u0001ဇ\u0000ϧЛ", new Object[]{"bitField0_", "deprecated_", "uninterpretedOption_", C9200p0.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    uhc<C9187j> c13824c = PARSER;
                    if (c13824c == null) {
                        synchronized (C9187j.class) {
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
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    this.memoizedIsInitialized = (byte) (obj == null ? 0 : 1);
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static a newBuilder(C9187j c9187j) {
            return (a) DEFAULT_INSTANCE.m23739o(c9187j);
        }

        public static C9187j parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
            return (C9187j) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
        }

        public static C9187j parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
            return (C9187j) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
        }

        public static C9187j parseFrom(vj1 vj1Var) throws ce8 {
            return (C9187j) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addUninterpretedOption(int i, C9200p0 c9200p0) {
            c9200p0.getClass();
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.add(i, c9200p0);
        }

        public static C9187j parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
            return (C9187j) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
        }

        public static C9187j parseFrom(byte[] bArr) throws ce8 {
            return (C9187j) v27.m23710c0(DEFAULT_INSTANCE, bArr);
        }

        public static C9187j parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
            return (C9187j) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
        }

        public static C9187j parseFrom(InputStream inputStream) throws IOException {
            return (C9187j) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
        }

        public static C9187j parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
            return (C9187j) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
        }

        public static C9187j parseFrom(f72 f72Var) throws IOException {
            return (C9187j) v27.m23704W(DEFAULT_INSTANCE, f72Var);
        }

        public static C9187j parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
            return (C9187j) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
        }
    }

    /* JADX INFO: renamed from: m74$j0 */
    public static final class C9188j0 extends v27<C9188j0, a> implements InterfaceC9190k0 {
        private static final C9188j0 DEFAULT_INSTANCE;
        public static final int METHOD_FIELD_NUMBER = 2;
        public static final int NAME_FIELD_NUMBER = 1;
        public static final int OPTIONS_FIELD_NUMBER = 3;
        private static volatile uhc<C9188j0> PARSER;
        private int bitField0_;
        private C9192l0 options_;
        private byte memoizedIsInitialized = 2;
        private String name_ = "";
        private w98.InterfaceC14504k<C9172b0> method_ = v27.m23722x();

        /* JADX INFO: renamed from: m74$j0$a */
        public static final class a extends v27.AbstractC13823b<C9188j0, a> implements InterfaceC9190k0 {
            public /* synthetic */ a(C9169a c9169a) {
                this();
            }

            public a addAllMethod(Iterable<? extends C9172b0> iterable) {
                m23743e();
                ((C9188j0) this.f89756b).addAllMethod(iterable);
                return this;
            }

            public a addMethod(C9172b0 c9172b0) {
                m23743e();
                ((C9188j0) this.f89756b).addMethod(c9172b0);
                return this;
            }

            public a clearMethod() {
                m23743e();
                ((C9188j0) this.f89756b).clearMethod();
                return this;
            }

            public a clearName() {
                m23743e();
                ((C9188j0) this.f89756b).clearName();
                return this;
            }

            public a clearOptions() {
                m23743e();
                ((C9188j0) this.f89756b).clearOptions();
                return this;
            }

            @Override // p000.m74.InterfaceC9190k0
            public C9172b0 getMethod(int i) {
                return ((C9188j0) this.f89756b).getMethod(i);
            }

            @Override // p000.m74.InterfaceC9190k0
            public int getMethodCount() {
                return ((C9188j0) this.f89756b).getMethodCount();
            }

            @Override // p000.m74.InterfaceC9190k0
            public List<C9172b0> getMethodList() {
                return Collections.unmodifiableList(((C9188j0) this.f89756b).getMethodList());
            }

            @Override // p000.m74.InterfaceC9190k0
            public String getName() {
                return ((C9188j0) this.f89756b).getName();
            }

            @Override // p000.m74.InterfaceC9190k0
            public vj1 getNameBytes() {
                return ((C9188j0) this.f89756b).getNameBytes();
            }

            @Override // p000.m74.InterfaceC9190k0
            public C9192l0 getOptions() {
                return ((C9188j0) this.f89756b).getOptions();
            }

            @Override // p000.m74.InterfaceC9190k0
            public boolean hasName() {
                return ((C9188j0) this.f89756b).hasName();
            }

            @Override // p000.m74.InterfaceC9190k0
            public boolean hasOptions() {
                return ((C9188j0) this.f89756b).hasOptions();
            }

            public a mergeOptions(C9192l0 c9192l0) {
                m23743e();
                ((C9188j0) this.f89756b).mergeOptions(c9192l0);
                return this;
            }

            public a removeMethod(int i) {
                m23743e();
                ((C9188j0) this.f89756b).removeMethod(i);
                return this;
            }

            public a setMethod(int i, C9172b0 c9172b0) {
                m23743e();
                ((C9188j0) this.f89756b).setMethod(i, c9172b0);
                return this;
            }

            public a setName(String str) {
                m23743e();
                ((C9188j0) this.f89756b).setName(str);
                return this;
            }

            public a setNameBytes(vj1 vj1Var) {
                m23743e();
                ((C9188j0) this.f89756b).setNameBytes(vj1Var);
                return this;
            }

            public a setOptions(C9192l0 c9192l0) {
                m23743e();
                ((C9188j0) this.f89756b).setOptions(c9192l0);
                return this;
            }

            private a() {
                super(C9188j0.DEFAULT_INSTANCE);
            }

            public a addMethod(int i, C9172b0 c9172b0) {
                m23743e();
                ((C9188j0) this.f89756b).addMethod(i, c9172b0);
                return this;
            }

            public a setMethod(int i, C9172b0.a aVar) {
                m23743e();
                ((C9188j0) this.f89756b).setMethod(i, aVar.build());
                return this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public a setOptions(C9192l0.a aVar) {
                m23743e();
                ((C9188j0) this.f89756b).setOptions((C9192l0) aVar.build());
                return this;
            }

            public a addMethod(C9172b0.a aVar) {
                m23743e();
                ((C9188j0) this.f89756b).addMethod(aVar.build());
                return this;
            }

            public a addMethod(int i, C9172b0.a aVar) {
                m23743e();
                ((C9188j0) this.f89756b).addMethod(i, aVar.build());
                return this;
            }
        }

        static {
            C9188j0 c9188j0 = new C9188j0();
            DEFAULT_INSTANCE = c9188j0;
            v27.m23715h0(C9188j0.class, c9188j0);
        }

        private C9188j0() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllMethod(Iterable<? extends C9172b0> iterable) {
            ensureMethodIsMutable();
            AbstractC1714b3.m2856b(iterable, this.method_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addMethod(C9172b0 c9172b0) {
            c9172b0.getClass();
            ensureMethodIsMutable();
            this.method_.add(c9172b0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMethod() {
            this.method_ = v27.m23722x();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearName() {
            this.bitField0_ &= -2;
            this.name_ = getDefaultInstance().getName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOptions() {
            this.options_ = null;
            this.bitField0_ &= -3;
        }

        private void ensureMethodIsMutable() {
            w98.InterfaceC14504k<C9172b0> interfaceC14504k = this.method_;
            if (interfaceC14504k.isModifiable()) {
                return;
            }
            this.method_ = v27.m23698P(interfaceC14504k);
        }

        public static C9188j0 getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public void mergeOptions(C9192l0 c9192l0) {
            c9192l0.getClass();
            C9192l0 c9192l02 = this.options_;
            if (c9192l02 == null || c9192l02 == C9192l0.getDefaultInstance()) {
                this.options_ = c9192l0;
            } else {
                this.options_ = ((C9192l0.a) C9192l0.newBuilder(this.options_).mergeFrom(c9192l0)).buildPartial();
            }
            this.bitField0_ |= 2;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.m23738n();
        }

        public static C9188j0 parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (C9188j0) v27.m23700S(DEFAULT_INSTANCE, inputStream);
        }

        public static C9188j0 parseFrom(ByteBuffer byteBuffer) throws ce8 {
            return (C9188j0) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
        }

        public static uhc<C9188j0> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeMethod(int i) {
            ensureMethodIsMutable();
            this.method_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMethod(int i, C9172b0 c9172b0) {
            c9172b0.getClass();
            ensureMethodIsMutable();
            this.method_.set(i, c9172b0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setName(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.name_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNameBytes(vj1 vj1Var) {
            this.name_ = vj1Var.toStringUtf8();
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOptions(C9192l0 c9192l0) {
            c9192l0.getClass();
            this.options_ = c9192l0;
            this.bitField0_ |= 2;
        }

        @Override // p000.m74.InterfaceC9190k0
        public C9172b0 getMethod(int i) {
            return this.method_.get(i);
        }

        @Override // p000.m74.InterfaceC9190k0
        public int getMethodCount() {
            return this.method_.size();
        }

        @Override // p000.m74.InterfaceC9190k0
        public List<C9172b0> getMethodList() {
            return this.method_;
        }

        public InterfaceC9174c0 getMethodOrBuilder(int i) {
            return this.method_.get(i);
        }

        public List<? extends InterfaceC9174c0> getMethodOrBuilderList() {
            return this.method_;
        }

        @Override // p000.m74.InterfaceC9190k0
        public String getName() {
            return this.name_;
        }

        @Override // p000.m74.InterfaceC9190k0
        public vj1 getNameBytes() {
            return vj1.copyFromUtf8(this.name_);
        }

        @Override // p000.m74.InterfaceC9190k0
        public C9192l0 getOptions() {
            C9192l0 c9192l0 = this.options_;
            return c9192l0 == null ? C9192l0.getDefaultInstance() : c9192l0;
        }

        @Override // p000.m74.InterfaceC9190k0
        public boolean hasName() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // p000.m74.InterfaceC9190k0
        public boolean hasOptions() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // p000.v27
        /* JADX INFO: renamed from: r */
        public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
            C9169a c9169a = null;
            switch (C9169a.f60048a[enumC13830i.ordinal()]) {
                case 1:
                    return new C9188j0();
                case 2:
                    return new a(c9169a);
                case 3:
                    return v27.m23699Q(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0002\u0001ဈ\u0000\u0002Л\u0003ᐉ\u0001", new Object[]{"bitField0_", "name_", "method_", C9172b0.class, "options_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    uhc<C9188j0> c13824c = PARSER;
                    if (c13824c == null) {
                        synchronized (C9188j0.class) {
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
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    this.memoizedIsInitialized = (byte) (obj == null ? 0 : 1);
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public static a newBuilder(C9188j0 c9188j0) {
            return DEFAULT_INSTANCE.m23739o(c9188j0);
        }

        public static C9188j0 parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
            return (C9188j0) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
        }

        public static C9188j0 parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
            return (C9188j0) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
        }

        public static C9188j0 parseFrom(vj1 vj1Var) throws ce8 {
            return (C9188j0) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addMethod(int i, C9172b0 c9172b0) {
            c9172b0.getClass();
            ensureMethodIsMutable();
            this.method_.add(i, c9172b0);
        }

        public static C9188j0 parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
            return (C9188j0) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
        }

        public static C9188j0 parseFrom(byte[] bArr) throws ce8 {
            return (C9188j0) v27.m23710c0(DEFAULT_INSTANCE, bArr);
        }

        public static C9188j0 parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
            return (C9188j0) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
        }

        public static C9188j0 parseFrom(InputStream inputStream) throws IOException {
            return (C9188j0) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
        }

        public static C9188j0 parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
            return (C9188j0) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
        }

        public static C9188j0 parseFrom(f72 f72Var) throws IOException {
            return (C9188j0) v27.m23704W(DEFAULT_INSTANCE, f72Var);
        }

        public static C9188j0 parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
            return (C9188j0) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
        }
    }

    /* JADX INFO: renamed from: m74$k */
    public interface InterfaceC9189k extends v27.InterfaceC13827f<C9187j, C9187j.a> {
        boolean getDeprecated();

        C9200p0 getUninterpretedOption(int i);

        int getUninterpretedOptionCount();

        List<C9200p0> getUninterpretedOptionList();

        boolean hasDeprecated();
    }

    /* JADX INFO: renamed from: m74$k0 */
    public interface InterfaceC9190k0 extends rsa {
        C9172b0 getMethod(int i);

        int getMethodCount();

        List<C9172b0> getMethodList();

        String getName();

        vj1 getNameBytes();

        C9192l0 getOptions();

        boolean hasName();

        boolean hasOptions();
    }

    /* JADX INFO: renamed from: m74$l */
    public static final class C9191l extends v27.AbstractC13826e<C9191l, a> implements InterfaceC9193m {
        private static final C9191l DEFAULT_INSTANCE;
        private static volatile uhc<C9191l> PARSER = null;
        public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
        private byte memoizedIsInitialized = 2;
        private w98.InterfaceC14504k<C9200p0> uninterpretedOption_ = v27.m23722x();

        /* JADX INFO: renamed from: m74$l$a */
        public static final class a extends v27.AbstractC13825d<C9191l, a> implements InterfaceC9193m {
            public /* synthetic */ a(C9169a c9169a) {
                this();
            }

            public a addAllUninterpretedOption(Iterable<? extends C9200p0> iterable) {
                m23743e();
                ((C9191l) this.f89756b).addAllUninterpretedOption(iterable);
                return this;
            }

            public a addUninterpretedOption(C9200p0 c9200p0) {
                m23743e();
                ((C9191l) this.f89756b).addUninterpretedOption(c9200p0);
                return this;
            }

            public a clearUninterpretedOption() {
                m23743e();
                ((C9191l) this.f89756b).clearUninterpretedOption();
                return this;
            }

            @Override // p000.m74.InterfaceC9193m
            public C9200p0 getUninterpretedOption(int i) {
                return ((C9191l) this.f89756b).getUninterpretedOption(i);
            }

            @Override // p000.m74.InterfaceC9193m
            public int getUninterpretedOptionCount() {
                return ((C9191l) this.f89756b).getUninterpretedOptionCount();
            }

            @Override // p000.m74.InterfaceC9193m
            public List<C9200p0> getUninterpretedOptionList() {
                return Collections.unmodifiableList(((C9191l) this.f89756b).getUninterpretedOptionList());
            }

            public a removeUninterpretedOption(int i) {
                m23743e();
                ((C9191l) this.f89756b).removeUninterpretedOption(i);
                return this;
            }

            public a setUninterpretedOption(int i, C9200p0 c9200p0) {
                m23743e();
                ((C9191l) this.f89756b).setUninterpretedOption(i, c9200p0);
                return this;
            }

            private a() {
                super(C9191l.DEFAULT_INSTANCE);
            }

            public a addUninterpretedOption(int i, C9200p0 c9200p0) {
                m23743e();
                ((C9191l) this.f89756b).addUninterpretedOption(i, c9200p0);
                return this;
            }

            public a setUninterpretedOption(int i, C9200p0.a aVar) {
                m23743e();
                ((C9191l) this.f89756b).setUninterpretedOption(i, aVar.build());
                return this;
            }

            public a addUninterpretedOption(C9200p0.a aVar) {
                m23743e();
                ((C9191l) this.f89756b).addUninterpretedOption(aVar.build());
                return this;
            }

            public a addUninterpretedOption(int i, C9200p0.a aVar) {
                m23743e();
                ((C9191l) this.f89756b).addUninterpretedOption(i, aVar.build());
                return this;
            }
        }

        static {
            C9191l c9191l = new C9191l();
            DEFAULT_INSTANCE = c9191l;
            v27.m23715h0(C9191l.class, c9191l);
        }

        private C9191l() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllUninterpretedOption(Iterable<? extends C9200p0> iterable) {
            ensureUninterpretedOptionIsMutable();
            AbstractC1714b3.m2856b(iterable, this.uninterpretedOption_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addUninterpretedOption(C9200p0 c9200p0) {
            c9200p0.getClass();
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.add(c9200p0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUninterpretedOption() {
            this.uninterpretedOption_ = v27.m23722x();
        }

        private void ensureUninterpretedOptionIsMutable() {
            w98.InterfaceC14504k<C9200p0> interfaceC14504k = this.uninterpretedOption_;
            if (interfaceC14504k.isModifiable()) {
                return;
            }
            this.uninterpretedOption_ = v27.m23698P(interfaceC14504k);
        }

        public static C9191l getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static a newBuilder() {
            return (a) DEFAULT_INSTANCE.m23738n();
        }

        public static C9191l parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (C9191l) v27.m23700S(DEFAULT_INSTANCE, inputStream);
        }

        public static C9191l parseFrom(ByteBuffer byteBuffer) throws ce8 {
            return (C9191l) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
        }

        public static uhc<C9191l> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeUninterpretedOption(int i) {
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUninterpretedOption(int i, C9200p0 c9200p0) {
            c9200p0.getClass();
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.set(i, c9200p0);
        }

        @Override // p000.m74.InterfaceC9193m
        public C9200p0 getUninterpretedOption(int i) {
            return this.uninterpretedOption_.get(i);
        }

        @Override // p000.m74.InterfaceC9193m
        public int getUninterpretedOptionCount() {
            return this.uninterpretedOption_.size();
        }

        @Override // p000.m74.InterfaceC9193m
        public List<C9200p0> getUninterpretedOptionList() {
            return this.uninterpretedOption_;
        }

        public InterfaceC9202q0 getUninterpretedOptionOrBuilder(int i) {
            return this.uninterpretedOption_.get(i);
        }

        public List<? extends InterfaceC9202q0> getUninterpretedOptionOrBuilderList() {
            return this.uninterpretedOption_;
        }

        @Override // p000.v27
        /* JADX INFO: renamed from: r */
        public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
            C9169a c9169a = null;
            switch (C9169a.f60048a[enumC13830i.ordinal()]) {
                case 1:
                    return new C9191l();
                case 2:
                    return new a(c9169a);
                case 3:
                    return v27.m23699Q(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000ϧϧ\u0001\u0000\u0001\u0001ϧЛ", new Object[]{"uninterpretedOption_", C9200p0.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    uhc<C9191l> c13824c = PARSER;
                    if (c13824c == null) {
                        synchronized (C9191l.class) {
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
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    this.memoizedIsInitialized = (byte) (obj == null ? 0 : 1);
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static a newBuilder(C9191l c9191l) {
            return (a) DEFAULT_INSTANCE.m23739o(c9191l);
        }

        public static C9191l parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
            return (C9191l) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
        }

        public static C9191l parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
            return (C9191l) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
        }

        public static C9191l parseFrom(vj1 vj1Var) throws ce8 {
            return (C9191l) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addUninterpretedOption(int i, C9200p0 c9200p0) {
            c9200p0.getClass();
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.add(i, c9200p0);
        }

        public static C9191l parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
            return (C9191l) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
        }

        public static C9191l parseFrom(byte[] bArr) throws ce8 {
            return (C9191l) v27.m23710c0(DEFAULT_INSTANCE, bArr);
        }

        public static C9191l parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
            return (C9191l) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
        }

        public static C9191l parseFrom(InputStream inputStream) throws IOException {
            return (C9191l) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
        }

        public static C9191l parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
            return (C9191l) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
        }

        public static C9191l parseFrom(f72 f72Var) throws IOException {
            return (C9191l) v27.m23704W(DEFAULT_INSTANCE, f72Var);
        }

        public static C9191l parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
            return (C9191l) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
        }
    }

    /* JADX INFO: renamed from: m74$l0 */
    public static final class C9192l0 extends v27.AbstractC13826e<C9192l0, a> implements InterfaceC9194m0 {
        private static final C9192l0 DEFAULT_INSTANCE;
        public static final int DEPRECATED_FIELD_NUMBER = 33;
        private static volatile uhc<C9192l0> PARSER = null;
        public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
        private int bitField0_;
        private boolean deprecated_;
        private byte memoizedIsInitialized = 2;
        private w98.InterfaceC14504k<C9200p0> uninterpretedOption_ = v27.m23722x();

        /* JADX INFO: renamed from: m74$l0$a */
        public static final class a extends v27.AbstractC13825d<C9192l0, a> implements InterfaceC9194m0 {
            public /* synthetic */ a(C9169a c9169a) {
                this();
            }

            public a addAllUninterpretedOption(Iterable<? extends C9200p0> iterable) {
                m23743e();
                ((C9192l0) this.f89756b).addAllUninterpretedOption(iterable);
                return this;
            }

            public a addUninterpretedOption(C9200p0 c9200p0) {
                m23743e();
                ((C9192l0) this.f89756b).addUninterpretedOption(c9200p0);
                return this;
            }

            public a clearDeprecated() {
                m23743e();
                ((C9192l0) this.f89756b).clearDeprecated();
                return this;
            }

            public a clearUninterpretedOption() {
                m23743e();
                ((C9192l0) this.f89756b).clearUninterpretedOption();
                return this;
            }

            @Override // p000.m74.InterfaceC9194m0
            public boolean getDeprecated() {
                return ((C9192l0) this.f89756b).getDeprecated();
            }

            @Override // p000.m74.InterfaceC9194m0
            public C9200p0 getUninterpretedOption(int i) {
                return ((C9192l0) this.f89756b).getUninterpretedOption(i);
            }

            @Override // p000.m74.InterfaceC9194m0
            public int getUninterpretedOptionCount() {
                return ((C9192l0) this.f89756b).getUninterpretedOptionCount();
            }

            @Override // p000.m74.InterfaceC9194m0
            public List<C9200p0> getUninterpretedOptionList() {
                return Collections.unmodifiableList(((C9192l0) this.f89756b).getUninterpretedOptionList());
            }

            @Override // p000.m74.InterfaceC9194m0
            public boolean hasDeprecated() {
                return ((C9192l0) this.f89756b).hasDeprecated();
            }

            public a removeUninterpretedOption(int i) {
                m23743e();
                ((C9192l0) this.f89756b).removeUninterpretedOption(i);
                return this;
            }

            public a setDeprecated(boolean z) {
                m23743e();
                ((C9192l0) this.f89756b).setDeprecated(z);
                return this;
            }

            public a setUninterpretedOption(int i, C9200p0 c9200p0) {
                m23743e();
                ((C9192l0) this.f89756b).setUninterpretedOption(i, c9200p0);
                return this;
            }

            private a() {
                super(C9192l0.DEFAULT_INSTANCE);
            }

            public a addUninterpretedOption(int i, C9200p0 c9200p0) {
                m23743e();
                ((C9192l0) this.f89756b).addUninterpretedOption(i, c9200p0);
                return this;
            }

            public a setUninterpretedOption(int i, C9200p0.a aVar) {
                m23743e();
                ((C9192l0) this.f89756b).setUninterpretedOption(i, aVar.build());
                return this;
            }

            public a addUninterpretedOption(C9200p0.a aVar) {
                m23743e();
                ((C9192l0) this.f89756b).addUninterpretedOption(aVar.build());
                return this;
            }

            public a addUninterpretedOption(int i, C9200p0.a aVar) {
                m23743e();
                ((C9192l0) this.f89756b).addUninterpretedOption(i, aVar.build());
                return this;
            }
        }

        static {
            C9192l0 c9192l0 = new C9192l0();
            DEFAULT_INSTANCE = c9192l0;
            v27.m23715h0(C9192l0.class, c9192l0);
        }

        private C9192l0() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllUninterpretedOption(Iterable<? extends C9200p0> iterable) {
            ensureUninterpretedOptionIsMutable();
            AbstractC1714b3.m2856b(iterable, this.uninterpretedOption_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addUninterpretedOption(C9200p0 c9200p0) {
            c9200p0.getClass();
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.add(c9200p0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDeprecated() {
            this.bitField0_ &= -2;
            this.deprecated_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUninterpretedOption() {
            this.uninterpretedOption_ = v27.m23722x();
        }

        private void ensureUninterpretedOptionIsMutable() {
            w98.InterfaceC14504k<C9200p0> interfaceC14504k = this.uninterpretedOption_;
            if (interfaceC14504k.isModifiable()) {
                return;
            }
            this.uninterpretedOption_ = v27.m23698P(interfaceC14504k);
        }

        public static C9192l0 getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static a newBuilder() {
            return (a) DEFAULT_INSTANCE.m23738n();
        }

        public static C9192l0 parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (C9192l0) v27.m23700S(DEFAULT_INSTANCE, inputStream);
        }

        public static C9192l0 parseFrom(ByteBuffer byteBuffer) throws ce8 {
            return (C9192l0) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
        }

        public static uhc<C9192l0> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeUninterpretedOption(int i) {
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDeprecated(boolean z) {
            this.bitField0_ |= 1;
            this.deprecated_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUninterpretedOption(int i, C9200p0 c9200p0) {
            c9200p0.getClass();
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.set(i, c9200p0);
        }

        @Override // p000.m74.InterfaceC9194m0
        public boolean getDeprecated() {
            return this.deprecated_;
        }

        @Override // p000.m74.InterfaceC9194m0
        public C9200p0 getUninterpretedOption(int i) {
            return this.uninterpretedOption_.get(i);
        }

        @Override // p000.m74.InterfaceC9194m0
        public int getUninterpretedOptionCount() {
            return this.uninterpretedOption_.size();
        }

        @Override // p000.m74.InterfaceC9194m0
        public List<C9200p0> getUninterpretedOptionList() {
            return this.uninterpretedOption_;
        }

        public InterfaceC9202q0 getUninterpretedOptionOrBuilder(int i) {
            return this.uninterpretedOption_.get(i);
        }

        public List<? extends InterfaceC9202q0> getUninterpretedOptionOrBuilderList() {
            return this.uninterpretedOption_;
        }

        @Override // p000.m74.InterfaceC9194m0
        public boolean hasDeprecated() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // p000.v27
        /* JADX INFO: renamed from: r */
        public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
            C9169a c9169a = null;
            switch (C9169a.f60048a[enumC13830i.ordinal()]) {
                case 1:
                    return new C9192l0();
                case 2:
                    return new a(c9169a);
                case 3:
                    return v27.m23699Q(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001!ϧ\u0002\u0000\u0001\u0001!ဇ\u0000ϧЛ", new Object[]{"bitField0_", "deprecated_", "uninterpretedOption_", C9200p0.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    uhc<C9192l0> c13824c = PARSER;
                    if (c13824c == null) {
                        synchronized (C9192l0.class) {
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
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    this.memoizedIsInitialized = (byte) (obj == null ? 0 : 1);
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static a newBuilder(C9192l0 c9192l0) {
            return (a) DEFAULT_INSTANCE.m23739o(c9192l0);
        }

        public static C9192l0 parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
            return (C9192l0) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
        }

        public static C9192l0 parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
            return (C9192l0) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
        }

        public static C9192l0 parseFrom(vj1 vj1Var) throws ce8 {
            return (C9192l0) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addUninterpretedOption(int i, C9200p0 c9200p0) {
            c9200p0.getClass();
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.add(i, c9200p0);
        }

        public static C9192l0 parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
            return (C9192l0) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
        }

        public static C9192l0 parseFrom(byte[] bArr) throws ce8 {
            return (C9192l0) v27.m23710c0(DEFAULT_INSTANCE, bArr);
        }

        public static C9192l0 parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
            return (C9192l0) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
        }

        public static C9192l0 parseFrom(InputStream inputStream) throws IOException {
            return (C9192l0) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
        }

        public static C9192l0 parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
            return (C9192l0) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
        }

        public static C9192l0 parseFrom(f72 f72Var) throws IOException {
            return (C9192l0) v27.m23704W(DEFAULT_INSTANCE, f72Var);
        }

        public static C9192l0 parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
            return (C9192l0) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
        }
    }

    /* JADX INFO: renamed from: m74$m */
    public interface InterfaceC9193m extends v27.InterfaceC13827f<C9191l, C9191l.a> {
        C9200p0 getUninterpretedOption(int i);

        int getUninterpretedOptionCount();

        List<C9200p0> getUninterpretedOptionList();
    }

    /* JADX INFO: renamed from: m74$m0 */
    public interface InterfaceC9194m0 extends v27.InterfaceC13827f<C9192l0, C9192l0.a> {
        boolean getDeprecated();

        C9200p0 getUninterpretedOption(int i);

        int getUninterpretedOptionCount();

        List<C9200p0> getUninterpretedOptionList();

        boolean hasDeprecated();
    }

    /* JADX INFO: renamed from: m74$n */
    public static final class C9195n extends v27<C9195n, a> implements InterfaceC9197o {
        private static final C9195n DEFAULT_INSTANCE;
        public static final int DEFAULT_VALUE_FIELD_NUMBER = 7;
        public static final int EXTENDEE_FIELD_NUMBER = 2;
        public static final int JSON_NAME_FIELD_NUMBER = 10;
        public static final int LABEL_FIELD_NUMBER = 4;
        public static final int NAME_FIELD_NUMBER = 1;
        public static final int NUMBER_FIELD_NUMBER = 3;
        public static final int ONEOF_INDEX_FIELD_NUMBER = 9;
        public static final int OPTIONS_FIELD_NUMBER = 8;
        private static volatile uhc<C9195n> PARSER = null;
        public static final int PROTO3_OPTIONAL_FIELD_NUMBER = 17;
        public static final int TYPE_FIELD_NUMBER = 5;
        public static final int TYPE_NAME_FIELD_NUMBER = 6;
        private int bitField0_;
        private int number_;
        private int oneofIndex_;
        private C9199p options_;
        private boolean proto3Optional_;
        private byte memoizedIsInitialized = 2;
        private String name_ = "";
        private int label_ = 1;
        private int type_ = 1;
        private String typeName_ = "";
        private String extendee_ = "";
        private String defaultValue_ = "";
        private String jsonName_ = "";

        /* JADX INFO: renamed from: m74$n$a */
        public static final class a extends v27.AbstractC13823b<C9195n, a> implements InterfaceC9197o {
            public /* synthetic */ a(C9169a c9169a) {
                this();
            }

            public a clearDefaultValue() {
                m23743e();
                ((C9195n) this.f89756b).clearDefaultValue();
                return this;
            }

            public a clearExtendee() {
                m23743e();
                ((C9195n) this.f89756b).clearExtendee();
                return this;
            }

            public a clearJsonName() {
                m23743e();
                ((C9195n) this.f89756b).clearJsonName();
                return this;
            }

            public a clearLabel() {
                m23743e();
                ((C9195n) this.f89756b).clearLabel();
                return this;
            }

            public a clearName() {
                m23743e();
                ((C9195n) this.f89756b).clearName();
                return this;
            }

            public a clearNumber() {
                m23743e();
                ((C9195n) this.f89756b).clearNumber();
                return this;
            }

            public a clearOneofIndex() {
                m23743e();
                ((C9195n) this.f89756b).clearOneofIndex();
                return this;
            }

            public a clearOptions() {
                m23743e();
                ((C9195n) this.f89756b).clearOptions();
                return this;
            }

            public a clearProto3Optional() {
                m23743e();
                ((C9195n) this.f89756b).clearProto3Optional();
                return this;
            }

            public a clearType() {
                m23743e();
                ((C9195n) this.f89756b).clearType();
                return this;
            }

            public a clearTypeName() {
                m23743e();
                ((C9195n) this.f89756b).clearTypeName();
                return this;
            }

            @Override // p000.m74.InterfaceC9197o
            public String getDefaultValue() {
                return ((C9195n) this.f89756b).getDefaultValue();
            }

            @Override // p000.m74.InterfaceC9197o
            public vj1 getDefaultValueBytes() {
                return ((C9195n) this.f89756b).getDefaultValueBytes();
            }

            @Override // p000.m74.InterfaceC9197o
            public String getExtendee() {
                return ((C9195n) this.f89756b).getExtendee();
            }

            @Override // p000.m74.InterfaceC9197o
            public vj1 getExtendeeBytes() {
                return ((C9195n) this.f89756b).getExtendeeBytes();
            }

            @Override // p000.m74.InterfaceC9197o
            public String getJsonName() {
                return ((C9195n) this.f89756b).getJsonName();
            }

            @Override // p000.m74.InterfaceC9197o
            public vj1 getJsonNameBytes() {
                return ((C9195n) this.f89756b).getJsonNameBytes();
            }

            @Override // p000.m74.InterfaceC9197o
            public b getLabel() {
                return ((C9195n) this.f89756b).getLabel();
            }

            @Override // p000.m74.InterfaceC9197o
            public String getName() {
                return ((C9195n) this.f89756b).getName();
            }

            @Override // p000.m74.InterfaceC9197o
            public vj1 getNameBytes() {
                return ((C9195n) this.f89756b).getNameBytes();
            }

            @Override // p000.m74.InterfaceC9197o
            public int getNumber() {
                return ((C9195n) this.f89756b).getNumber();
            }

            @Override // p000.m74.InterfaceC9197o
            public int getOneofIndex() {
                return ((C9195n) this.f89756b).getOneofIndex();
            }

            @Override // p000.m74.InterfaceC9197o
            public C9199p getOptions() {
                return ((C9195n) this.f89756b).getOptions();
            }

            @Override // p000.m74.InterfaceC9197o
            public boolean getProto3Optional() {
                return ((C9195n) this.f89756b).getProto3Optional();
            }

            @Override // p000.m74.InterfaceC9197o
            public c getType() {
                return ((C9195n) this.f89756b).getType();
            }

            @Override // p000.m74.InterfaceC9197o
            public String getTypeName() {
                return ((C9195n) this.f89756b).getTypeName();
            }

            @Override // p000.m74.InterfaceC9197o
            public vj1 getTypeNameBytes() {
                return ((C9195n) this.f89756b).getTypeNameBytes();
            }

            @Override // p000.m74.InterfaceC9197o
            public boolean hasDefaultValue() {
                return ((C9195n) this.f89756b).hasDefaultValue();
            }

            @Override // p000.m74.InterfaceC9197o
            public boolean hasExtendee() {
                return ((C9195n) this.f89756b).hasExtendee();
            }

            @Override // p000.m74.InterfaceC9197o
            public boolean hasJsonName() {
                return ((C9195n) this.f89756b).hasJsonName();
            }

            @Override // p000.m74.InterfaceC9197o
            public boolean hasLabel() {
                return ((C9195n) this.f89756b).hasLabel();
            }

            @Override // p000.m74.InterfaceC9197o
            public boolean hasName() {
                return ((C9195n) this.f89756b).hasName();
            }

            @Override // p000.m74.InterfaceC9197o
            public boolean hasNumber() {
                return ((C9195n) this.f89756b).hasNumber();
            }

            @Override // p000.m74.InterfaceC9197o
            public boolean hasOneofIndex() {
                return ((C9195n) this.f89756b).hasOneofIndex();
            }

            @Override // p000.m74.InterfaceC9197o
            public boolean hasOptions() {
                return ((C9195n) this.f89756b).hasOptions();
            }

            @Override // p000.m74.InterfaceC9197o
            public boolean hasProto3Optional() {
                return ((C9195n) this.f89756b).hasProto3Optional();
            }

            @Override // p000.m74.InterfaceC9197o
            public boolean hasType() {
                return ((C9195n) this.f89756b).hasType();
            }

            @Override // p000.m74.InterfaceC9197o
            public boolean hasTypeName() {
                return ((C9195n) this.f89756b).hasTypeName();
            }

            public a mergeOptions(C9199p c9199p) {
                m23743e();
                ((C9195n) this.f89756b).mergeOptions(c9199p);
                return this;
            }

            public a setDefaultValue(String str) {
                m23743e();
                ((C9195n) this.f89756b).setDefaultValue(str);
                return this;
            }

            public a setDefaultValueBytes(vj1 vj1Var) {
                m23743e();
                ((C9195n) this.f89756b).setDefaultValueBytes(vj1Var);
                return this;
            }

            public a setExtendee(String str) {
                m23743e();
                ((C9195n) this.f89756b).setExtendee(str);
                return this;
            }

            public a setExtendeeBytes(vj1 vj1Var) {
                m23743e();
                ((C9195n) this.f89756b).setExtendeeBytes(vj1Var);
                return this;
            }

            public a setJsonName(String str) {
                m23743e();
                ((C9195n) this.f89756b).setJsonName(str);
                return this;
            }

            public a setJsonNameBytes(vj1 vj1Var) {
                m23743e();
                ((C9195n) this.f89756b).setJsonNameBytes(vj1Var);
                return this;
            }

            public a setLabel(b bVar) {
                m23743e();
                ((C9195n) this.f89756b).setLabel(bVar);
                return this;
            }

            public a setName(String str) {
                m23743e();
                ((C9195n) this.f89756b).setName(str);
                return this;
            }

            public a setNameBytes(vj1 vj1Var) {
                m23743e();
                ((C9195n) this.f89756b).setNameBytes(vj1Var);
                return this;
            }

            public a setNumber(int i) {
                m23743e();
                ((C9195n) this.f89756b).setNumber(i);
                return this;
            }

            public a setOneofIndex(int i) {
                m23743e();
                ((C9195n) this.f89756b).setOneofIndex(i);
                return this;
            }

            public a setOptions(C9199p c9199p) {
                m23743e();
                ((C9195n) this.f89756b).setOptions(c9199p);
                return this;
            }

            public a setProto3Optional(boolean z) {
                m23743e();
                ((C9195n) this.f89756b).setProto3Optional(z);
                return this;
            }

            public a setType(c cVar) {
                m23743e();
                ((C9195n) this.f89756b).setType(cVar);
                return this;
            }

            public a setTypeName(String str) {
                m23743e();
                ((C9195n) this.f89756b).setTypeName(str);
                return this;
            }

            public a setTypeNameBytes(vj1 vj1Var) {
                m23743e();
                ((C9195n) this.f89756b).setTypeNameBytes(vj1Var);
                return this;
            }

            private a() {
                super(C9195n.DEFAULT_INSTANCE);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public a setOptions(C9199p.a aVar) {
                m23743e();
                ((C9195n) this.f89756b).setOptions((C9199p) aVar.build());
                return this;
            }
        }

        /* JADX INFO: renamed from: m74$n$b */
        public enum b implements w98.InterfaceC14497d {
            LABEL_OPTIONAL(1),
            LABEL_REQUIRED(2),
            LABEL_REPEATED(3);


            /* JADX INFO: renamed from: C */
            public static final w98.InterfaceC14498e<b> f60059C = new a();

            /* JADX INFO: renamed from: e */
            public static final int f60064e = 1;

            /* JADX INFO: renamed from: f */
            public static final int f60065f = 2;

            /* JADX INFO: renamed from: m */
            public static final int f60066m = 3;

            /* JADX INFO: renamed from: a */
            public final int f60067a;

            /* JADX INFO: renamed from: m74$n$b$a */
            public class a implements w98.InterfaceC14498e<b> {
                @Override // p000.w98.InterfaceC14498e
                public b findValueByNumber(int i) {
                    return b.forNumber(i);
                }
            }

            /* JADX INFO: renamed from: m74$n$b$b, reason: collision with other inner class name */
            public static final class C16481b implements w98.InterfaceC14499f {

                /* JADX INFO: renamed from: a */
                public static final w98.InterfaceC14499f f60068a = new C16481b();

                private C16481b() {
                }

                @Override // p000.w98.InterfaceC14499f
                public boolean isInRange(int i) {
                    return b.forNumber(i) != null;
                }
            }

            b(int i) {
                this.f60067a = i;
            }

            public static b forNumber(int i) {
                if (i == 1) {
                    return LABEL_OPTIONAL;
                }
                if (i == 2) {
                    return LABEL_REQUIRED;
                }
                if (i != 3) {
                    return null;
                }
                return LABEL_REPEATED;
            }

            public static w98.InterfaceC14498e<b> internalGetValueMap() {
                return f60059C;
            }

            public static w98.InterfaceC14499f internalGetVerifier() {
                return C16481b.f60068a;
            }

            @Override // p000.w98.InterfaceC14497d
            public final int getNumber() {
                return this.f60067a;
            }

            @Deprecated
            public static b valueOf(int i) {
                return forNumber(i);
            }
        }

        /* JADX INFO: renamed from: m74$n$c */
        public enum c implements w98.InterfaceC14497d {
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
            TYPE_SINT64(18);


            /* JADX INFO: renamed from: Z1 */
            public static final int f60081Z1 = 1;

            /* JADX INFO: renamed from: a2 */
            public static final int f60082a2 = 2;

            /* JADX INFO: renamed from: b2 */
            public static final int f60084b2 = 3;

            /* JADX INFO: renamed from: c2 */
            public static final int f60086c2 = 4;

            /* JADX INFO: renamed from: d2 */
            public static final int f60088d2 = 5;

            /* JADX INFO: renamed from: e2 */
            public static final int f60090e2 = 6;

            /* JADX INFO: renamed from: f2 */
            public static final int f60092f2 = 7;

            /* JADX INFO: renamed from: g2 */
            public static final int f60093g2 = 8;

            /* JADX INFO: renamed from: h2 */
            public static final int f60094h2 = 9;

            /* JADX INFO: renamed from: i2 */
            public static final int f60095i2 = 10;

            /* JADX INFO: renamed from: j2 */
            public static final int f60096j2 = 11;

            /* JADX INFO: renamed from: k2 */
            public static final int f60097k2 = 12;

            /* JADX INFO: renamed from: l2 */
            public static final int f60098l2 = 13;

            /* JADX INFO: renamed from: m2 */
            public static final int f60100m2 = 14;

            /* JADX INFO: renamed from: n2 */
            public static final int f60101n2 = 15;

            /* JADX INFO: renamed from: o2 */
            public static final int f60102o2 = 16;

            /* JADX INFO: renamed from: p2 */
            public static final int f60103p2 = 17;

            /* JADX INFO: renamed from: q2 */
            public static final int f60104q2 = 18;

            /* JADX INFO: renamed from: r2 */
            public static final w98.InterfaceC14498e<c> f60105r2 = new a();

            /* JADX INFO: renamed from: a */
            public final int f60107a;

            /* JADX INFO: renamed from: m74$n$c$a */
            public class a implements w98.InterfaceC14498e<c> {
                @Override // p000.w98.InterfaceC14498e
                public c findValueByNumber(int i) {
                    return c.forNumber(i);
                }
            }

            /* JADX INFO: renamed from: m74$n$c$b */
            public static final class b implements w98.InterfaceC14499f {

                /* JADX INFO: renamed from: a */
                public static final w98.InterfaceC14499f f60108a = new b();

                private b() {
                }

                @Override // p000.w98.InterfaceC14499f
                public boolean isInRange(int i) {
                    return c.forNumber(i) != null;
                }
            }

            c(int i) {
                this.f60107a = i;
            }

            public static c forNumber(int i) {
                switch (i) {
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

            public static w98.InterfaceC14498e<c> internalGetValueMap() {
                return f60105r2;
            }

            public static w98.InterfaceC14499f internalGetVerifier() {
                return b.f60108a;
            }

            @Override // p000.w98.InterfaceC14497d
            public final int getNumber() {
                return this.f60107a;
            }

            @Deprecated
            public static c valueOf(int i) {
                return forNumber(i);
            }
        }

        static {
            C9195n c9195n = new C9195n();
            DEFAULT_INSTANCE = c9195n;
            v27.m23715h0(C9195n.class, c9195n);
        }

        private C9195n() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDefaultValue() {
            this.bitField0_ &= -65;
            this.defaultValue_ = getDefaultInstance().getDefaultValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearExtendee() {
            this.bitField0_ &= -33;
            this.extendee_ = getDefaultInstance().getExtendee();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearJsonName() {
            this.bitField0_ &= -257;
            this.jsonName_ = getDefaultInstance().getJsonName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLabel() {
            this.bitField0_ &= -5;
            this.label_ = 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearName() {
            this.bitField0_ &= -2;
            this.name_ = getDefaultInstance().getName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNumber() {
            this.bitField0_ &= -3;
            this.number_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOneofIndex() {
            this.bitField0_ &= -129;
            this.oneofIndex_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOptions() {
            this.options_ = null;
            this.bitField0_ &= -513;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearProto3Optional() {
            this.bitField0_ &= -1025;
            this.proto3Optional_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearType() {
            this.bitField0_ &= -9;
            this.type_ = 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTypeName() {
            this.bitField0_ &= -17;
            this.typeName_ = getDefaultInstance().getTypeName();
        }

        public static C9195n getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public void mergeOptions(C9199p c9199p) {
            c9199p.getClass();
            C9199p c9199p2 = this.options_;
            if (c9199p2 == null || c9199p2 == C9199p.getDefaultInstance()) {
                this.options_ = c9199p;
            } else {
                this.options_ = ((C9199p.a) C9199p.newBuilder(this.options_).mergeFrom(c9199p)).buildPartial();
            }
            this.bitField0_ |= 512;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.m23738n();
        }

        public static C9195n parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (C9195n) v27.m23700S(DEFAULT_INSTANCE, inputStream);
        }

        public static C9195n parseFrom(ByteBuffer byteBuffer) throws ce8 {
            return (C9195n) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
        }

        public static uhc<C9195n> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDefaultValue(String str) {
            str.getClass();
            this.bitField0_ |= 64;
            this.defaultValue_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDefaultValueBytes(vj1 vj1Var) {
            this.defaultValue_ = vj1Var.toStringUtf8();
            this.bitField0_ |= 64;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setExtendee(String str) {
            str.getClass();
            this.bitField0_ |= 32;
            this.extendee_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setExtendeeBytes(vj1 vj1Var) {
            this.extendee_ = vj1Var.toStringUtf8();
            this.bitField0_ |= 32;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setJsonName(String str) {
            str.getClass();
            this.bitField0_ |= 256;
            this.jsonName_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setJsonNameBytes(vj1 vj1Var) {
            this.jsonName_ = vj1Var.toStringUtf8();
            this.bitField0_ |= 256;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLabel(b bVar) {
            this.label_ = bVar.getNumber();
            this.bitField0_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setName(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.name_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNameBytes(vj1 vj1Var) {
            this.name_ = vj1Var.toStringUtf8();
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNumber(int i) {
            this.bitField0_ |= 2;
            this.number_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOneofIndex(int i) {
            this.bitField0_ |= 128;
            this.oneofIndex_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOptions(C9199p c9199p) {
            c9199p.getClass();
            this.options_ = c9199p;
            this.bitField0_ |= 512;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setProto3Optional(boolean z) {
            this.bitField0_ |= 1024;
            this.proto3Optional_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setType(c cVar) {
            this.type_ = cVar.getNumber();
            this.bitField0_ |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTypeName(String str) {
            str.getClass();
            this.bitField0_ |= 16;
            this.typeName_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTypeNameBytes(vj1 vj1Var) {
            this.typeName_ = vj1Var.toStringUtf8();
            this.bitField0_ |= 16;
        }

        @Override // p000.m74.InterfaceC9197o
        public String getDefaultValue() {
            return this.defaultValue_;
        }

        @Override // p000.m74.InterfaceC9197o
        public vj1 getDefaultValueBytes() {
            return vj1.copyFromUtf8(this.defaultValue_);
        }

        @Override // p000.m74.InterfaceC9197o
        public String getExtendee() {
            return this.extendee_;
        }

        @Override // p000.m74.InterfaceC9197o
        public vj1 getExtendeeBytes() {
            return vj1.copyFromUtf8(this.extendee_);
        }

        @Override // p000.m74.InterfaceC9197o
        public String getJsonName() {
            return this.jsonName_;
        }

        @Override // p000.m74.InterfaceC9197o
        public vj1 getJsonNameBytes() {
            return vj1.copyFromUtf8(this.jsonName_);
        }

        @Override // p000.m74.InterfaceC9197o
        public b getLabel() {
            b bVarForNumber = b.forNumber(this.label_);
            return bVarForNumber == null ? b.LABEL_OPTIONAL : bVarForNumber;
        }

        @Override // p000.m74.InterfaceC9197o
        public String getName() {
            return this.name_;
        }

        @Override // p000.m74.InterfaceC9197o
        public vj1 getNameBytes() {
            return vj1.copyFromUtf8(this.name_);
        }

        @Override // p000.m74.InterfaceC9197o
        public int getNumber() {
            return this.number_;
        }

        @Override // p000.m74.InterfaceC9197o
        public int getOneofIndex() {
            return this.oneofIndex_;
        }

        @Override // p000.m74.InterfaceC9197o
        public C9199p getOptions() {
            C9199p c9199p = this.options_;
            return c9199p == null ? C9199p.getDefaultInstance() : c9199p;
        }

        @Override // p000.m74.InterfaceC9197o
        public boolean getProto3Optional() {
            return this.proto3Optional_;
        }

        @Override // p000.m74.InterfaceC9197o
        public c getType() {
            c cVarForNumber = c.forNumber(this.type_);
            return cVarForNumber == null ? c.TYPE_DOUBLE : cVarForNumber;
        }

        @Override // p000.m74.InterfaceC9197o
        public String getTypeName() {
            return this.typeName_;
        }

        @Override // p000.m74.InterfaceC9197o
        public vj1 getTypeNameBytes() {
            return vj1.copyFromUtf8(this.typeName_);
        }

        @Override // p000.m74.InterfaceC9197o
        public boolean hasDefaultValue() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // p000.m74.InterfaceC9197o
        public boolean hasExtendee() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // p000.m74.InterfaceC9197o
        public boolean hasJsonName() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // p000.m74.InterfaceC9197o
        public boolean hasLabel() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // p000.m74.InterfaceC9197o
        public boolean hasName() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // p000.m74.InterfaceC9197o
        public boolean hasNumber() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // p000.m74.InterfaceC9197o
        public boolean hasOneofIndex() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // p000.m74.InterfaceC9197o
        public boolean hasOptions() {
            return (this.bitField0_ & 512) != 0;
        }

        @Override // p000.m74.InterfaceC9197o
        public boolean hasProto3Optional() {
            return (this.bitField0_ & 1024) != 0;
        }

        @Override // p000.m74.InterfaceC9197o
        public boolean hasType() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // p000.m74.InterfaceC9197o
        public boolean hasTypeName() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // p000.v27
        /* JADX INFO: renamed from: r */
        public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
            C9169a c9169a = null;
            switch (C9169a.f60048a[enumC13830i.ordinal()]) {
                case 1:
                    return new C9195n();
                case 2:
                    return new a(c9169a);
                case 3:
                    return v27.m23699Q(DEFAULT_INSTANCE, "\u0001\u000b\u0000\u0001\u0001\u0011\u000b\u0000\u0000\u0001\u0001ဈ\u0000\u0002ဈ\u0005\u0003င\u0001\u0004᠌\u0002\u0005᠌\u0003\u0006ဈ\u0004\u0007ဈ\u0006\bᐉ\t\tင\u0007\nဈ\b\u0011ဇ\n", new Object[]{"bitField0_", "name_", "extendee_", "number_", "label_", b.internalGetVerifier(), "type_", c.internalGetVerifier(), "typeName_", "defaultValue_", "options_", "oneofIndex_", "jsonName_", "proto3Optional_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    uhc<C9195n> c13824c = PARSER;
                    if (c13824c == null) {
                        synchronized (C9195n.class) {
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
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    this.memoizedIsInitialized = (byte) (obj == null ? 0 : 1);
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public static a newBuilder(C9195n c9195n) {
            return DEFAULT_INSTANCE.m23739o(c9195n);
        }

        public static C9195n parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
            return (C9195n) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
        }

        public static C9195n parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
            return (C9195n) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
        }

        public static C9195n parseFrom(vj1 vj1Var) throws ce8 {
            return (C9195n) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
        }

        public static C9195n parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
            return (C9195n) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
        }

        public static C9195n parseFrom(byte[] bArr) throws ce8 {
            return (C9195n) v27.m23710c0(DEFAULT_INSTANCE, bArr);
        }

        public static C9195n parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
            return (C9195n) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
        }

        public static C9195n parseFrom(InputStream inputStream) throws IOException {
            return (C9195n) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
        }

        public static C9195n parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
            return (C9195n) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
        }

        public static C9195n parseFrom(f72 f72Var) throws IOException {
            return (C9195n) v27.m23704W(DEFAULT_INSTANCE, f72Var);
        }

        public static C9195n parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
            return (C9195n) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
        }
    }

    /* JADX INFO: renamed from: m74$n0 */
    public static final class C9196n0 extends v27<C9196n0, a> implements InterfaceC9198o0 {
        private static final C9196n0 DEFAULT_INSTANCE;
        public static final int LOCATION_FIELD_NUMBER = 1;
        private static volatile uhc<C9196n0> PARSER;
        private w98.InterfaceC14504k<b> location_ = v27.m23722x();

        /* JADX INFO: renamed from: m74$n0$a */
        public static final class a extends v27.AbstractC13823b<C9196n0, a> implements InterfaceC9198o0 {
            public /* synthetic */ a(C9169a c9169a) {
                this();
            }

            public a addAllLocation(Iterable<? extends b> iterable) {
                m23743e();
                ((C9196n0) this.f89756b).addAllLocation(iterable);
                return this;
            }

            public a addLocation(b bVar) {
                m23743e();
                ((C9196n0) this.f89756b).addLocation(bVar);
                return this;
            }

            public a clearLocation() {
                m23743e();
                ((C9196n0) this.f89756b).clearLocation();
                return this;
            }

            @Override // p000.m74.InterfaceC9198o0
            public b getLocation(int i) {
                return ((C9196n0) this.f89756b).getLocation(i);
            }

            @Override // p000.m74.InterfaceC9198o0
            public int getLocationCount() {
                return ((C9196n0) this.f89756b).getLocationCount();
            }

            @Override // p000.m74.InterfaceC9198o0
            public List<b> getLocationList() {
                return Collections.unmodifiableList(((C9196n0) this.f89756b).getLocationList());
            }

            public a removeLocation(int i) {
                m23743e();
                ((C9196n0) this.f89756b).removeLocation(i);
                return this;
            }

            public a setLocation(int i, b bVar) {
                m23743e();
                ((C9196n0) this.f89756b).setLocation(i, bVar);
                return this;
            }

            private a() {
                super(C9196n0.DEFAULT_INSTANCE);
            }

            public a addLocation(int i, b bVar) {
                m23743e();
                ((C9196n0) this.f89756b).addLocation(i, bVar);
                return this;
            }

            public a setLocation(int i, b.a aVar) {
                m23743e();
                ((C9196n0) this.f89756b).setLocation(i, aVar.build());
                return this;
            }

            public a addLocation(b.a aVar) {
                m23743e();
                ((C9196n0) this.f89756b).addLocation(aVar.build());
                return this;
            }

            public a addLocation(int i, b.a aVar) {
                m23743e();
                ((C9196n0) this.f89756b).addLocation(i, aVar.build());
                return this;
            }
        }

        /* JADX INFO: renamed from: m74$n0$b */
        public static final class b extends v27<b, a> implements c {
            private static final b DEFAULT_INSTANCE;
            public static final int LEADING_COMMENTS_FIELD_NUMBER = 3;
            public static final int LEADING_DETACHED_COMMENTS_FIELD_NUMBER = 6;
            private static volatile uhc<b> PARSER = null;
            public static final int PATH_FIELD_NUMBER = 1;
            public static final int SPAN_FIELD_NUMBER = 2;
            public static final int TRAILING_COMMENTS_FIELD_NUMBER = 4;
            private int bitField0_;
            private int pathMemoizedSerializedSize = -1;
            private int spanMemoizedSerializedSize = -1;
            private w98.InterfaceC14501h path_ = v27.m23720v();
            private w98.InterfaceC14501h span_ = v27.m23720v();
            private String leadingComments_ = "";
            private String trailingComments_ = "";
            private w98.InterfaceC14504k<String> leadingDetachedComments_ = v27.m23722x();

            /* JADX INFO: renamed from: m74$n0$b$a */
            public static final class a extends v27.AbstractC13823b<b, a> implements c {
                public /* synthetic */ a(C9169a c9169a) {
                    this();
                }

                public a addAllLeadingDetachedComments(Iterable<String> iterable) {
                    m23743e();
                    ((b) this.f89756b).addAllLeadingDetachedComments(iterable);
                    return this;
                }

                public a addAllPath(Iterable<? extends Integer> iterable) {
                    m23743e();
                    ((b) this.f89756b).addAllPath(iterable);
                    return this;
                }

                public a addAllSpan(Iterable<? extends Integer> iterable) {
                    m23743e();
                    ((b) this.f89756b).addAllSpan(iterable);
                    return this;
                }

                public a addLeadingDetachedComments(String str) {
                    m23743e();
                    ((b) this.f89756b).addLeadingDetachedComments(str);
                    return this;
                }

                public a addLeadingDetachedCommentsBytes(vj1 vj1Var) {
                    m23743e();
                    ((b) this.f89756b).addLeadingDetachedCommentsBytes(vj1Var);
                    return this;
                }

                public a addPath(int i) {
                    m23743e();
                    ((b) this.f89756b).addPath(i);
                    return this;
                }

                public a addSpan(int i) {
                    m23743e();
                    ((b) this.f89756b).addSpan(i);
                    return this;
                }

                public a clearLeadingComments() {
                    m23743e();
                    ((b) this.f89756b).clearLeadingComments();
                    return this;
                }

                public a clearLeadingDetachedComments() {
                    m23743e();
                    ((b) this.f89756b).clearLeadingDetachedComments();
                    return this;
                }

                public a clearPath() {
                    m23743e();
                    ((b) this.f89756b).clearPath();
                    return this;
                }

                public a clearSpan() {
                    m23743e();
                    ((b) this.f89756b).clearSpan();
                    return this;
                }

                public a clearTrailingComments() {
                    m23743e();
                    ((b) this.f89756b).clearTrailingComments();
                    return this;
                }

                @Override // p000.m74.C9196n0.c
                public String getLeadingComments() {
                    return ((b) this.f89756b).getLeadingComments();
                }

                @Override // p000.m74.C9196n0.c
                public vj1 getLeadingCommentsBytes() {
                    return ((b) this.f89756b).getLeadingCommentsBytes();
                }

                @Override // p000.m74.C9196n0.c
                public String getLeadingDetachedComments(int i) {
                    return ((b) this.f89756b).getLeadingDetachedComments(i);
                }

                @Override // p000.m74.C9196n0.c
                public vj1 getLeadingDetachedCommentsBytes(int i) {
                    return ((b) this.f89756b).getLeadingDetachedCommentsBytes(i);
                }

                @Override // p000.m74.C9196n0.c
                public int getLeadingDetachedCommentsCount() {
                    return ((b) this.f89756b).getLeadingDetachedCommentsCount();
                }

                @Override // p000.m74.C9196n0.c
                public List<String> getLeadingDetachedCommentsList() {
                    return Collections.unmodifiableList(((b) this.f89756b).getLeadingDetachedCommentsList());
                }

                @Override // p000.m74.C9196n0.c
                public int getPath(int i) {
                    return ((b) this.f89756b).getPath(i);
                }

                @Override // p000.m74.C9196n0.c
                public int getPathCount() {
                    return ((b) this.f89756b).getPathCount();
                }

                @Override // p000.m74.C9196n0.c
                public List<Integer> getPathList() {
                    return Collections.unmodifiableList(((b) this.f89756b).getPathList());
                }

                @Override // p000.m74.C9196n0.c
                public int getSpan(int i) {
                    return ((b) this.f89756b).getSpan(i);
                }

                @Override // p000.m74.C9196n0.c
                public int getSpanCount() {
                    return ((b) this.f89756b).getSpanCount();
                }

                @Override // p000.m74.C9196n0.c
                public List<Integer> getSpanList() {
                    return Collections.unmodifiableList(((b) this.f89756b).getSpanList());
                }

                @Override // p000.m74.C9196n0.c
                public String getTrailingComments() {
                    return ((b) this.f89756b).getTrailingComments();
                }

                @Override // p000.m74.C9196n0.c
                public vj1 getTrailingCommentsBytes() {
                    return ((b) this.f89756b).getTrailingCommentsBytes();
                }

                @Override // p000.m74.C9196n0.c
                public boolean hasLeadingComments() {
                    return ((b) this.f89756b).hasLeadingComments();
                }

                @Override // p000.m74.C9196n0.c
                public boolean hasTrailingComments() {
                    return ((b) this.f89756b).hasTrailingComments();
                }

                public a setLeadingComments(String str) {
                    m23743e();
                    ((b) this.f89756b).setLeadingComments(str);
                    return this;
                }

                public a setLeadingCommentsBytes(vj1 vj1Var) {
                    m23743e();
                    ((b) this.f89756b).setLeadingCommentsBytes(vj1Var);
                    return this;
                }

                public a setLeadingDetachedComments(int i, String str) {
                    m23743e();
                    ((b) this.f89756b).setLeadingDetachedComments(i, str);
                    return this;
                }

                public a setPath(int i, int i2) {
                    m23743e();
                    ((b) this.f89756b).setPath(i, i2);
                    return this;
                }

                public a setSpan(int i, int i2) {
                    m23743e();
                    ((b) this.f89756b).setSpan(i, i2);
                    return this;
                }

                public a setTrailingComments(String str) {
                    m23743e();
                    ((b) this.f89756b).setTrailingComments(str);
                    return this;
                }

                public a setTrailingCommentsBytes(vj1 vj1Var) {
                    m23743e();
                    ((b) this.f89756b).setTrailingCommentsBytes(vj1Var);
                    return this;
                }

                private a() {
                    super(b.DEFAULT_INSTANCE);
                }
            }

            static {
                b bVar = new b();
                DEFAULT_INSTANCE = bVar;
                v27.m23715h0(b.class, bVar);
            }

            private b() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addAllLeadingDetachedComments(Iterable<String> iterable) {
                ensureLeadingDetachedCommentsIsMutable();
                AbstractC1714b3.m2856b(iterable, this.leadingDetachedComments_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addAllPath(Iterable<? extends Integer> iterable) {
                ensurePathIsMutable();
                AbstractC1714b3.m2856b(iterable, this.path_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addAllSpan(Iterable<? extends Integer> iterable) {
                ensureSpanIsMutable();
                AbstractC1714b3.m2856b(iterable, this.span_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addLeadingDetachedComments(String str) {
                str.getClass();
                ensureLeadingDetachedCommentsIsMutable();
                this.leadingDetachedComments_.add(str);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addLeadingDetachedCommentsBytes(vj1 vj1Var) {
                ensureLeadingDetachedCommentsIsMutable();
                this.leadingDetachedComments_.add(vj1Var.toStringUtf8());
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addPath(int i) {
                ensurePathIsMutable();
                this.path_.addInt(i);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addSpan(int i) {
                ensureSpanIsMutable();
                this.span_.addInt(i);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearLeadingComments() {
                this.bitField0_ &= -2;
                this.leadingComments_ = getDefaultInstance().getLeadingComments();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearLeadingDetachedComments() {
                this.leadingDetachedComments_ = v27.m23722x();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearPath() {
                this.path_ = v27.m23720v();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearSpan() {
                this.span_ = v27.m23720v();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearTrailingComments() {
                this.bitField0_ &= -3;
                this.trailingComments_ = getDefaultInstance().getTrailingComments();
            }

            private void ensureLeadingDetachedCommentsIsMutable() {
                w98.InterfaceC14504k<String> interfaceC14504k = this.leadingDetachedComments_;
                if (interfaceC14504k.isModifiable()) {
                    return;
                }
                this.leadingDetachedComments_ = v27.m23698P(interfaceC14504k);
            }

            private void ensurePathIsMutable() {
                w98.InterfaceC14501h interfaceC14501h = this.path_;
                if (interfaceC14501h.isModifiable()) {
                    return;
                }
                this.path_ = v27.m23696N(interfaceC14501h);
            }

            private void ensureSpanIsMutable() {
                w98.InterfaceC14501h interfaceC14501h = this.span_;
                if (interfaceC14501h.isModifiable()) {
                    return;
                }
                this.span_ = v27.m23696N(interfaceC14501h);
            }

            public static b getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static a newBuilder() {
                return DEFAULT_INSTANCE.m23738n();
            }

            public static b parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (b) v27.m23700S(DEFAULT_INSTANCE, inputStream);
            }

            public static b parseFrom(ByteBuffer byteBuffer) throws ce8 {
                return (b) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
            }

            public static uhc<b> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setLeadingComments(String str) {
                str.getClass();
                this.bitField0_ |= 1;
                this.leadingComments_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setLeadingCommentsBytes(vj1 vj1Var) {
                this.leadingComments_ = vj1Var.toStringUtf8();
                this.bitField0_ |= 1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setLeadingDetachedComments(int i, String str) {
                str.getClass();
                ensureLeadingDetachedCommentsIsMutable();
                this.leadingDetachedComments_.set(i, str);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setPath(int i, int i2) {
                ensurePathIsMutable();
                this.path_.setInt(i, i2);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setSpan(int i, int i2) {
                ensureSpanIsMutable();
                this.span_.setInt(i, i2);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setTrailingComments(String str) {
                str.getClass();
                this.bitField0_ |= 2;
                this.trailingComments_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setTrailingCommentsBytes(vj1 vj1Var) {
                this.trailingComments_ = vj1Var.toStringUtf8();
                this.bitField0_ |= 2;
            }

            @Override // p000.m74.C9196n0.c
            public String getLeadingComments() {
                return this.leadingComments_;
            }

            @Override // p000.m74.C9196n0.c
            public vj1 getLeadingCommentsBytes() {
                return vj1.copyFromUtf8(this.leadingComments_);
            }

            @Override // p000.m74.C9196n0.c
            public String getLeadingDetachedComments(int i) {
                return this.leadingDetachedComments_.get(i);
            }

            @Override // p000.m74.C9196n0.c
            public vj1 getLeadingDetachedCommentsBytes(int i) {
                return vj1.copyFromUtf8(this.leadingDetachedComments_.get(i));
            }

            @Override // p000.m74.C9196n0.c
            public int getLeadingDetachedCommentsCount() {
                return this.leadingDetachedComments_.size();
            }

            @Override // p000.m74.C9196n0.c
            public List<String> getLeadingDetachedCommentsList() {
                return this.leadingDetachedComments_;
            }

            @Override // p000.m74.C9196n0.c
            public int getPath(int i) {
                return this.path_.getInt(i);
            }

            @Override // p000.m74.C9196n0.c
            public int getPathCount() {
                return this.path_.size();
            }

            @Override // p000.m74.C9196n0.c
            public List<Integer> getPathList() {
                return this.path_;
            }

            @Override // p000.m74.C9196n0.c
            public int getSpan(int i) {
                return this.span_.getInt(i);
            }

            @Override // p000.m74.C9196n0.c
            public int getSpanCount() {
                return this.span_.size();
            }

            @Override // p000.m74.C9196n0.c
            public List<Integer> getSpanList() {
                return this.span_;
            }

            @Override // p000.m74.C9196n0.c
            public String getTrailingComments() {
                return this.trailingComments_;
            }

            @Override // p000.m74.C9196n0.c
            public vj1 getTrailingCommentsBytes() {
                return vj1.copyFromUtf8(this.trailingComments_);
            }

            @Override // p000.m74.C9196n0.c
            public boolean hasLeadingComments() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // p000.m74.C9196n0.c
            public boolean hasTrailingComments() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // p000.v27
            /* JADX INFO: renamed from: r */
            public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
                C9169a c9169a = null;
                switch (C9169a.f60048a[enumC13830i.ordinal()]) {
                    case 1:
                        return new b();
                    case 2:
                        return new a(c9169a);
                    case 3:
                        return v27.m23699Q(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0003\u0000\u0001'\u0002'\u0003ဈ\u0000\u0004ဈ\u0001\u0006\u001a", new Object[]{"bitField0_", "path_", "span_", "leadingComments_", "trailingComments_", "leadingDetachedComments_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        uhc<b> c13824c = PARSER;
                        if (c13824c == null) {
                            synchronized (b.class) {
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

            public static a newBuilder(b bVar) {
                return DEFAULT_INSTANCE.m23739o(bVar);
            }

            public static b parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
                return (b) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
            }

            public static b parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
                return (b) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
            }

            public static b parseFrom(vj1 vj1Var) throws ce8 {
                return (b) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
            }

            public static b parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
                return (b) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
            }

            public static b parseFrom(byte[] bArr) throws ce8 {
                return (b) v27.m23710c0(DEFAULT_INSTANCE, bArr);
            }

            public static b parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
                return (b) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
            }

            public static b parseFrom(InputStream inputStream) throws IOException {
                return (b) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
            }

            public static b parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
                return (b) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
            }

            public static b parseFrom(f72 f72Var) throws IOException {
                return (b) v27.m23704W(DEFAULT_INSTANCE, f72Var);
            }

            public static b parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
                return (b) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
            }
        }

        /* JADX INFO: renamed from: m74$n0$c */
        public interface c extends rsa {
            String getLeadingComments();

            vj1 getLeadingCommentsBytes();

            String getLeadingDetachedComments(int i);

            vj1 getLeadingDetachedCommentsBytes(int i);

            int getLeadingDetachedCommentsCount();

            List<String> getLeadingDetachedCommentsList();

            int getPath(int i);

            int getPathCount();

            List<Integer> getPathList();

            int getSpan(int i);

            int getSpanCount();

            List<Integer> getSpanList();

            String getTrailingComments();

            vj1 getTrailingCommentsBytes();

            boolean hasLeadingComments();

            boolean hasTrailingComments();
        }

        static {
            C9196n0 c9196n0 = new C9196n0();
            DEFAULT_INSTANCE = c9196n0;
            v27.m23715h0(C9196n0.class, c9196n0);
        }

        private C9196n0() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllLocation(Iterable<? extends b> iterable) {
            ensureLocationIsMutable();
            AbstractC1714b3.m2856b(iterable, this.location_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addLocation(b bVar) {
            bVar.getClass();
            ensureLocationIsMutable();
            this.location_.add(bVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLocation() {
            this.location_ = v27.m23722x();
        }

        private void ensureLocationIsMutable() {
            w98.InterfaceC14504k<b> interfaceC14504k = this.location_;
            if (interfaceC14504k.isModifiable()) {
                return;
            }
            this.location_ = v27.m23698P(interfaceC14504k);
        }

        public static C9196n0 getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.m23738n();
        }

        public static C9196n0 parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (C9196n0) v27.m23700S(DEFAULT_INSTANCE, inputStream);
        }

        public static C9196n0 parseFrom(ByteBuffer byteBuffer) throws ce8 {
            return (C9196n0) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
        }

        public static uhc<C9196n0> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeLocation(int i) {
            ensureLocationIsMutable();
            this.location_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLocation(int i, b bVar) {
            bVar.getClass();
            ensureLocationIsMutable();
            this.location_.set(i, bVar);
        }

        @Override // p000.m74.InterfaceC9198o0
        public b getLocation(int i) {
            return this.location_.get(i);
        }

        @Override // p000.m74.InterfaceC9198o0
        public int getLocationCount() {
            return this.location_.size();
        }

        @Override // p000.m74.InterfaceC9198o0
        public List<b> getLocationList() {
            return this.location_;
        }

        public c getLocationOrBuilder(int i) {
            return this.location_.get(i);
        }

        public List<? extends c> getLocationOrBuilderList() {
            return this.location_;
        }

        @Override // p000.v27
        /* JADX INFO: renamed from: r */
        public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
            C9169a c9169a = null;
            switch (C9169a.f60048a[enumC13830i.ordinal()]) {
                case 1:
                    return new C9196n0();
                case 2:
                    return new a(c9169a);
                case 3:
                    return v27.m23699Q(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"location_", b.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    uhc<C9196n0> c13824c = PARSER;
                    if (c13824c == null) {
                        synchronized (C9196n0.class) {
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

        public static a newBuilder(C9196n0 c9196n0) {
            return DEFAULT_INSTANCE.m23739o(c9196n0);
        }

        public static C9196n0 parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
            return (C9196n0) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
        }

        public static C9196n0 parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
            return (C9196n0) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
        }

        public static C9196n0 parseFrom(vj1 vj1Var) throws ce8 {
            return (C9196n0) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addLocation(int i, b bVar) {
            bVar.getClass();
            ensureLocationIsMutable();
            this.location_.add(i, bVar);
        }

        public static C9196n0 parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
            return (C9196n0) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
        }

        public static C9196n0 parseFrom(byte[] bArr) throws ce8 {
            return (C9196n0) v27.m23710c0(DEFAULT_INSTANCE, bArr);
        }

        public static C9196n0 parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
            return (C9196n0) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
        }

        public static C9196n0 parseFrom(InputStream inputStream) throws IOException {
            return (C9196n0) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
        }

        public static C9196n0 parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
            return (C9196n0) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
        }

        public static C9196n0 parseFrom(f72 f72Var) throws IOException {
            return (C9196n0) v27.m23704W(DEFAULT_INSTANCE, f72Var);
        }

        public static C9196n0 parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
            return (C9196n0) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
        }
    }

    /* JADX INFO: renamed from: m74$o */
    public interface InterfaceC9197o extends rsa {
        String getDefaultValue();

        vj1 getDefaultValueBytes();

        String getExtendee();

        vj1 getExtendeeBytes();

        String getJsonName();

        vj1 getJsonNameBytes();

        C9195n.b getLabel();

        String getName();

        vj1 getNameBytes();

        int getNumber();

        int getOneofIndex();

        C9199p getOptions();

        boolean getProto3Optional();

        C9195n.c getType();

        String getTypeName();

        vj1 getTypeNameBytes();

        boolean hasDefaultValue();

        boolean hasExtendee();

        boolean hasJsonName();

        boolean hasLabel();

        boolean hasName();

        boolean hasNumber();

        boolean hasOneofIndex();

        boolean hasOptions();

        boolean hasProto3Optional();

        boolean hasType();

        boolean hasTypeName();
    }

    /* JADX INFO: renamed from: m74$o0 */
    public interface InterfaceC9198o0 extends rsa {
        C9196n0.b getLocation(int i);

        int getLocationCount();

        List<C9196n0.b> getLocationList();
    }

    /* JADX INFO: renamed from: m74$p */
    public static final class C9199p extends v27.AbstractC13826e<C9199p, a> implements InterfaceC9201q {
        public static final int CTYPE_FIELD_NUMBER = 1;
        private static final C9199p DEFAULT_INSTANCE;
        public static final int DEPRECATED_FIELD_NUMBER = 3;
        public static final int JSTYPE_FIELD_NUMBER = 6;
        public static final int LAZY_FIELD_NUMBER = 5;
        public static final int PACKED_FIELD_NUMBER = 2;
        private static volatile uhc<C9199p> PARSER = null;
        public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
        public static final int WEAK_FIELD_NUMBER = 10;
        private int bitField0_;
        private int ctype_;
        private boolean deprecated_;
        private int jstype_;
        private boolean lazy_;
        private boolean packed_;
        private boolean weak_;
        private byte memoizedIsInitialized = 2;
        private w98.InterfaceC14504k<C9200p0> uninterpretedOption_ = v27.m23722x();

        /* JADX INFO: renamed from: m74$p$a */
        public static final class a extends v27.AbstractC13825d<C9199p, a> implements InterfaceC9201q {
            public /* synthetic */ a(C9169a c9169a) {
                this();
            }

            public a addAllUninterpretedOption(Iterable<? extends C9200p0> iterable) {
                m23743e();
                ((C9199p) this.f89756b).addAllUninterpretedOption(iterable);
                return this;
            }

            public a addUninterpretedOption(C9200p0 c9200p0) {
                m23743e();
                ((C9199p) this.f89756b).addUninterpretedOption(c9200p0);
                return this;
            }

            public a clearCtype() {
                m23743e();
                ((C9199p) this.f89756b).clearCtype();
                return this;
            }

            public a clearDeprecated() {
                m23743e();
                ((C9199p) this.f89756b).clearDeprecated();
                return this;
            }

            public a clearJstype() {
                m23743e();
                ((C9199p) this.f89756b).clearJstype();
                return this;
            }

            public a clearLazy() {
                m23743e();
                ((C9199p) this.f89756b).clearLazy();
                return this;
            }

            public a clearPacked() {
                m23743e();
                ((C9199p) this.f89756b).clearPacked();
                return this;
            }

            public a clearUninterpretedOption() {
                m23743e();
                ((C9199p) this.f89756b).clearUninterpretedOption();
                return this;
            }

            public a clearWeak() {
                m23743e();
                ((C9199p) this.f89756b).clearWeak();
                return this;
            }

            @Override // p000.m74.InterfaceC9201q
            public b getCtype() {
                return ((C9199p) this.f89756b).getCtype();
            }

            @Override // p000.m74.InterfaceC9201q
            public boolean getDeprecated() {
                return ((C9199p) this.f89756b).getDeprecated();
            }

            @Override // p000.m74.InterfaceC9201q
            public c getJstype() {
                return ((C9199p) this.f89756b).getJstype();
            }

            @Override // p000.m74.InterfaceC9201q
            public boolean getLazy() {
                return ((C9199p) this.f89756b).getLazy();
            }

            @Override // p000.m74.InterfaceC9201q
            public boolean getPacked() {
                return ((C9199p) this.f89756b).getPacked();
            }

            @Override // p000.m74.InterfaceC9201q
            public C9200p0 getUninterpretedOption(int i) {
                return ((C9199p) this.f89756b).getUninterpretedOption(i);
            }

            @Override // p000.m74.InterfaceC9201q
            public int getUninterpretedOptionCount() {
                return ((C9199p) this.f89756b).getUninterpretedOptionCount();
            }

            @Override // p000.m74.InterfaceC9201q
            public List<C9200p0> getUninterpretedOptionList() {
                return Collections.unmodifiableList(((C9199p) this.f89756b).getUninterpretedOptionList());
            }

            @Override // p000.m74.InterfaceC9201q
            public boolean getWeak() {
                return ((C9199p) this.f89756b).getWeak();
            }

            @Override // p000.m74.InterfaceC9201q
            public boolean hasCtype() {
                return ((C9199p) this.f89756b).hasCtype();
            }

            @Override // p000.m74.InterfaceC9201q
            public boolean hasDeprecated() {
                return ((C9199p) this.f89756b).hasDeprecated();
            }

            @Override // p000.m74.InterfaceC9201q
            public boolean hasJstype() {
                return ((C9199p) this.f89756b).hasJstype();
            }

            @Override // p000.m74.InterfaceC9201q
            public boolean hasLazy() {
                return ((C9199p) this.f89756b).hasLazy();
            }

            @Override // p000.m74.InterfaceC9201q
            public boolean hasPacked() {
                return ((C9199p) this.f89756b).hasPacked();
            }

            @Override // p000.m74.InterfaceC9201q
            public boolean hasWeak() {
                return ((C9199p) this.f89756b).hasWeak();
            }

            public a removeUninterpretedOption(int i) {
                m23743e();
                ((C9199p) this.f89756b).removeUninterpretedOption(i);
                return this;
            }

            public a setCtype(b bVar) {
                m23743e();
                ((C9199p) this.f89756b).setCtype(bVar);
                return this;
            }

            public a setDeprecated(boolean z) {
                m23743e();
                ((C9199p) this.f89756b).setDeprecated(z);
                return this;
            }

            public a setJstype(c cVar) {
                m23743e();
                ((C9199p) this.f89756b).setJstype(cVar);
                return this;
            }

            public a setLazy(boolean z) {
                m23743e();
                ((C9199p) this.f89756b).setLazy(z);
                return this;
            }

            public a setPacked(boolean z) {
                m23743e();
                ((C9199p) this.f89756b).setPacked(z);
                return this;
            }

            public a setUninterpretedOption(int i, C9200p0 c9200p0) {
                m23743e();
                ((C9199p) this.f89756b).setUninterpretedOption(i, c9200p0);
                return this;
            }

            public a setWeak(boolean z) {
                m23743e();
                ((C9199p) this.f89756b).setWeak(z);
                return this;
            }

            private a() {
                super(C9199p.DEFAULT_INSTANCE);
            }

            public a addUninterpretedOption(int i, C9200p0 c9200p0) {
                m23743e();
                ((C9199p) this.f89756b).addUninterpretedOption(i, c9200p0);
                return this;
            }

            public a setUninterpretedOption(int i, C9200p0.a aVar) {
                m23743e();
                ((C9199p) this.f89756b).setUninterpretedOption(i, aVar.build());
                return this;
            }

            public a addUninterpretedOption(C9200p0.a aVar) {
                m23743e();
                ((C9199p) this.f89756b).addUninterpretedOption(aVar.build());
                return this;
            }

            public a addUninterpretedOption(int i, C9200p0.a aVar) {
                m23743e();
                ((C9199p) this.f89756b).addUninterpretedOption(i, aVar.build());
                return this;
            }
        }

        /* JADX INFO: renamed from: m74$p$b */
        public enum b implements w98.InterfaceC14497d {
            STRING(0),
            CORD(1),
            STRING_PIECE(2);


            /* JADX INFO: renamed from: C */
            public static final w98.InterfaceC14498e<b> f60109C = new a();

            /* JADX INFO: renamed from: e */
            public static final int f60114e = 0;

            /* JADX INFO: renamed from: f */
            public static final int f60115f = 1;

            /* JADX INFO: renamed from: m */
            public static final int f60116m = 2;

            /* JADX INFO: renamed from: a */
            public final int f60117a;

            /* JADX INFO: renamed from: m74$p$b$a */
            public class a implements w98.InterfaceC14498e<b> {
                @Override // p000.w98.InterfaceC14498e
                public b findValueByNumber(int i) {
                    return b.forNumber(i);
                }
            }

            /* JADX INFO: renamed from: m74$p$b$b, reason: collision with other inner class name */
            public static final class C16482b implements w98.InterfaceC14499f {

                /* JADX INFO: renamed from: a */
                public static final w98.InterfaceC14499f f60118a = new C16482b();

                private C16482b() {
                }

                @Override // p000.w98.InterfaceC14499f
                public boolean isInRange(int i) {
                    return b.forNumber(i) != null;
                }
            }

            b(int i) {
                this.f60117a = i;
            }

            public static b forNumber(int i) {
                if (i == 0) {
                    return STRING;
                }
                if (i == 1) {
                    return CORD;
                }
                if (i != 2) {
                    return null;
                }
                return STRING_PIECE;
            }

            public static w98.InterfaceC14498e<b> internalGetValueMap() {
                return f60109C;
            }

            public static w98.InterfaceC14499f internalGetVerifier() {
                return C16482b.f60118a;
            }

            @Override // p000.w98.InterfaceC14497d
            public final int getNumber() {
                return this.f60117a;
            }

            @Deprecated
            public static b valueOf(int i) {
                return forNumber(i);
            }
        }

        /* JADX INFO: renamed from: m74$p$c */
        public enum c implements w98.InterfaceC14497d {
            JS_NORMAL(0),
            JS_STRING(1),
            JS_NUMBER(2);


            /* JADX INFO: renamed from: C */
            public static final w98.InterfaceC14498e<c> f60119C = new a();

            /* JADX INFO: renamed from: e */
            public static final int f60124e = 0;

            /* JADX INFO: renamed from: f */
            public static final int f60125f = 1;

            /* JADX INFO: renamed from: m */
            public static final int f60126m = 2;

            /* JADX INFO: renamed from: a */
            public final int f60127a;

            /* JADX INFO: renamed from: m74$p$c$a */
            public class a implements w98.InterfaceC14498e<c> {
                @Override // p000.w98.InterfaceC14498e
                public c findValueByNumber(int i) {
                    return c.forNumber(i);
                }
            }

            /* JADX INFO: renamed from: m74$p$c$b */
            public static final class b implements w98.InterfaceC14499f {

                /* JADX INFO: renamed from: a */
                public static final w98.InterfaceC14499f f60128a = new b();

                private b() {
                }

                @Override // p000.w98.InterfaceC14499f
                public boolean isInRange(int i) {
                    return c.forNumber(i) != null;
                }
            }

            c(int i) {
                this.f60127a = i;
            }

            public static c forNumber(int i) {
                if (i == 0) {
                    return JS_NORMAL;
                }
                if (i == 1) {
                    return JS_STRING;
                }
                if (i != 2) {
                    return null;
                }
                return JS_NUMBER;
            }

            public static w98.InterfaceC14498e<c> internalGetValueMap() {
                return f60119C;
            }

            public static w98.InterfaceC14499f internalGetVerifier() {
                return b.f60128a;
            }

            @Override // p000.w98.InterfaceC14497d
            public final int getNumber() {
                return this.f60127a;
            }

            @Deprecated
            public static c valueOf(int i) {
                return forNumber(i);
            }
        }

        static {
            C9199p c9199p = new C9199p();
            DEFAULT_INSTANCE = c9199p;
            v27.m23715h0(C9199p.class, c9199p);
        }

        private C9199p() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllUninterpretedOption(Iterable<? extends C9200p0> iterable) {
            ensureUninterpretedOptionIsMutable();
            AbstractC1714b3.m2856b(iterable, this.uninterpretedOption_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addUninterpretedOption(C9200p0 c9200p0) {
            c9200p0.getClass();
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.add(c9200p0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCtype() {
            this.bitField0_ &= -2;
            this.ctype_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDeprecated() {
            this.bitField0_ &= -17;
            this.deprecated_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearJstype() {
            this.bitField0_ &= -5;
            this.jstype_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLazy() {
            this.bitField0_ &= -9;
            this.lazy_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPacked() {
            this.bitField0_ &= -3;
            this.packed_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUninterpretedOption() {
            this.uninterpretedOption_ = v27.m23722x();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearWeak() {
            this.bitField0_ &= -33;
            this.weak_ = false;
        }

        private void ensureUninterpretedOptionIsMutable() {
            w98.InterfaceC14504k<C9200p0> interfaceC14504k = this.uninterpretedOption_;
            if (interfaceC14504k.isModifiable()) {
                return;
            }
            this.uninterpretedOption_ = v27.m23698P(interfaceC14504k);
        }

        public static C9199p getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static a newBuilder() {
            return (a) DEFAULT_INSTANCE.m23738n();
        }

        public static C9199p parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (C9199p) v27.m23700S(DEFAULT_INSTANCE, inputStream);
        }

        public static C9199p parseFrom(ByteBuffer byteBuffer) throws ce8 {
            return (C9199p) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
        }

        public static uhc<C9199p> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeUninterpretedOption(int i) {
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCtype(b bVar) {
            this.ctype_ = bVar.getNumber();
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDeprecated(boolean z) {
            this.bitField0_ |= 16;
            this.deprecated_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setJstype(c cVar) {
            this.jstype_ = cVar.getNumber();
            this.bitField0_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLazy(boolean z) {
            this.bitField0_ |= 8;
            this.lazy_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPacked(boolean z) {
            this.bitField0_ |= 2;
            this.packed_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUninterpretedOption(int i, C9200p0 c9200p0) {
            c9200p0.getClass();
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.set(i, c9200p0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWeak(boolean z) {
            this.bitField0_ |= 32;
            this.weak_ = z;
        }

        @Override // p000.m74.InterfaceC9201q
        public b getCtype() {
            b bVarForNumber = b.forNumber(this.ctype_);
            return bVarForNumber == null ? b.STRING : bVarForNumber;
        }

        @Override // p000.m74.InterfaceC9201q
        public boolean getDeprecated() {
            return this.deprecated_;
        }

        @Override // p000.m74.InterfaceC9201q
        public c getJstype() {
            c cVarForNumber = c.forNumber(this.jstype_);
            return cVarForNumber == null ? c.JS_NORMAL : cVarForNumber;
        }

        @Override // p000.m74.InterfaceC9201q
        public boolean getLazy() {
            return this.lazy_;
        }

        @Override // p000.m74.InterfaceC9201q
        public boolean getPacked() {
            return this.packed_;
        }

        @Override // p000.m74.InterfaceC9201q
        public C9200p0 getUninterpretedOption(int i) {
            return this.uninterpretedOption_.get(i);
        }

        @Override // p000.m74.InterfaceC9201q
        public int getUninterpretedOptionCount() {
            return this.uninterpretedOption_.size();
        }

        @Override // p000.m74.InterfaceC9201q
        public List<C9200p0> getUninterpretedOptionList() {
            return this.uninterpretedOption_;
        }

        public InterfaceC9202q0 getUninterpretedOptionOrBuilder(int i) {
            return this.uninterpretedOption_.get(i);
        }

        public List<? extends InterfaceC9202q0> getUninterpretedOptionOrBuilderList() {
            return this.uninterpretedOption_;
        }

        @Override // p000.m74.InterfaceC9201q
        public boolean getWeak() {
            return this.weak_;
        }

        @Override // p000.m74.InterfaceC9201q
        public boolean hasCtype() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // p000.m74.InterfaceC9201q
        public boolean hasDeprecated() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // p000.m74.InterfaceC9201q
        public boolean hasJstype() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // p000.m74.InterfaceC9201q
        public boolean hasLazy() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // p000.m74.InterfaceC9201q
        public boolean hasPacked() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // p000.m74.InterfaceC9201q
        public boolean hasWeak() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // p000.v27
        /* JADX INFO: renamed from: r */
        public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
            C9169a c9169a = null;
            switch (C9169a.f60048a[enumC13830i.ordinal()]) {
                case 1:
                    return new C9199p();
                case 2:
                    return new a(c9169a);
                case 3:
                    return v27.m23699Q(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0001ϧ\u0007\u0000\u0001\u0001\u0001᠌\u0000\u0002ဇ\u0001\u0003ဇ\u0004\u0005ဇ\u0003\u0006᠌\u0002\nဇ\u0005ϧЛ", new Object[]{"bitField0_", "ctype_", b.internalGetVerifier(), "packed_", "deprecated_", "lazy_", "jstype_", c.internalGetVerifier(), "weak_", "uninterpretedOption_", C9200p0.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    uhc<C9199p> c13824c = PARSER;
                    if (c13824c == null) {
                        synchronized (C9199p.class) {
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
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    this.memoizedIsInitialized = (byte) (obj == null ? 0 : 1);
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static a newBuilder(C9199p c9199p) {
            return (a) DEFAULT_INSTANCE.m23739o(c9199p);
        }

        public static C9199p parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
            return (C9199p) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
        }

        public static C9199p parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
            return (C9199p) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
        }

        public static C9199p parseFrom(vj1 vj1Var) throws ce8 {
            return (C9199p) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addUninterpretedOption(int i, C9200p0 c9200p0) {
            c9200p0.getClass();
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.add(i, c9200p0);
        }

        public static C9199p parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
            return (C9199p) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
        }

        public static C9199p parseFrom(byte[] bArr) throws ce8 {
            return (C9199p) v27.m23710c0(DEFAULT_INSTANCE, bArr);
        }

        public static C9199p parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
            return (C9199p) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
        }

        public static C9199p parseFrom(InputStream inputStream) throws IOException {
            return (C9199p) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
        }

        public static C9199p parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
            return (C9199p) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
        }

        public static C9199p parseFrom(f72 f72Var) throws IOException {
            return (C9199p) v27.m23704W(DEFAULT_INSTANCE, f72Var);
        }

        public static C9199p parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
            return (C9199p) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
        }
    }

    /* JADX INFO: renamed from: m74$p0 */
    public static final class C9200p0 extends v27<C9200p0, a> implements InterfaceC9202q0 {
        public static final int AGGREGATE_VALUE_FIELD_NUMBER = 8;
        private static final C9200p0 DEFAULT_INSTANCE;
        public static final int DOUBLE_VALUE_FIELD_NUMBER = 6;
        public static final int IDENTIFIER_VALUE_FIELD_NUMBER = 3;
        public static final int NAME_FIELD_NUMBER = 2;
        public static final int NEGATIVE_INT_VALUE_FIELD_NUMBER = 5;
        private static volatile uhc<C9200p0> PARSER = null;
        public static final int POSITIVE_INT_VALUE_FIELD_NUMBER = 4;
        public static final int STRING_VALUE_FIELD_NUMBER = 7;
        private int bitField0_;
        private double doubleValue_;
        private long negativeIntValue_;
        private long positiveIntValue_;
        private byte memoizedIsInitialized = 2;
        private w98.InterfaceC14504k<b> name_ = v27.m23722x();
        private String identifierValue_ = "";
        private vj1 stringValue_ = vj1.f91344e;
        private String aggregateValue_ = "";

        /* JADX INFO: renamed from: m74$p0$a */
        public static final class a extends v27.AbstractC13823b<C9200p0, a> implements InterfaceC9202q0 {
            public /* synthetic */ a(C9169a c9169a) {
                this();
            }

            public a addAllName(Iterable<? extends b> iterable) {
                m23743e();
                ((C9200p0) this.f89756b).addAllName(iterable);
                return this;
            }

            public a addName(b bVar) {
                m23743e();
                ((C9200p0) this.f89756b).addName(bVar);
                return this;
            }

            public a clearAggregateValue() {
                m23743e();
                ((C9200p0) this.f89756b).clearAggregateValue();
                return this;
            }

            public a clearDoubleValue() {
                m23743e();
                ((C9200p0) this.f89756b).clearDoubleValue();
                return this;
            }

            public a clearIdentifierValue() {
                m23743e();
                ((C9200p0) this.f89756b).clearIdentifierValue();
                return this;
            }

            public a clearName() {
                m23743e();
                ((C9200p0) this.f89756b).clearName();
                return this;
            }

            public a clearNegativeIntValue() {
                m23743e();
                ((C9200p0) this.f89756b).clearNegativeIntValue();
                return this;
            }

            public a clearPositiveIntValue() {
                m23743e();
                ((C9200p0) this.f89756b).clearPositiveIntValue();
                return this;
            }

            public a clearStringValue() {
                m23743e();
                ((C9200p0) this.f89756b).clearStringValue();
                return this;
            }

            @Override // p000.m74.InterfaceC9202q0
            public String getAggregateValue() {
                return ((C9200p0) this.f89756b).getAggregateValue();
            }

            @Override // p000.m74.InterfaceC9202q0
            public vj1 getAggregateValueBytes() {
                return ((C9200p0) this.f89756b).getAggregateValueBytes();
            }

            @Override // p000.m74.InterfaceC9202q0
            public double getDoubleValue() {
                return ((C9200p0) this.f89756b).getDoubleValue();
            }

            @Override // p000.m74.InterfaceC9202q0
            public String getIdentifierValue() {
                return ((C9200p0) this.f89756b).getIdentifierValue();
            }

            @Override // p000.m74.InterfaceC9202q0
            public vj1 getIdentifierValueBytes() {
                return ((C9200p0) this.f89756b).getIdentifierValueBytes();
            }

            @Override // p000.m74.InterfaceC9202q0
            public b getName(int i) {
                return ((C9200p0) this.f89756b).getName(i);
            }

            @Override // p000.m74.InterfaceC9202q0
            public int getNameCount() {
                return ((C9200p0) this.f89756b).getNameCount();
            }

            @Override // p000.m74.InterfaceC9202q0
            public List<b> getNameList() {
                return Collections.unmodifiableList(((C9200p0) this.f89756b).getNameList());
            }

            @Override // p000.m74.InterfaceC9202q0
            public long getNegativeIntValue() {
                return ((C9200p0) this.f89756b).getNegativeIntValue();
            }

            @Override // p000.m74.InterfaceC9202q0
            public long getPositiveIntValue() {
                return ((C9200p0) this.f89756b).getPositiveIntValue();
            }

            @Override // p000.m74.InterfaceC9202q0
            public vj1 getStringValue() {
                return ((C9200p0) this.f89756b).getStringValue();
            }

            @Override // p000.m74.InterfaceC9202q0
            public boolean hasAggregateValue() {
                return ((C9200p0) this.f89756b).hasAggregateValue();
            }

            @Override // p000.m74.InterfaceC9202q0
            public boolean hasDoubleValue() {
                return ((C9200p0) this.f89756b).hasDoubleValue();
            }

            @Override // p000.m74.InterfaceC9202q0
            public boolean hasIdentifierValue() {
                return ((C9200p0) this.f89756b).hasIdentifierValue();
            }

            @Override // p000.m74.InterfaceC9202q0
            public boolean hasNegativeIntValue() {
                return ((C9200p0) this.f89756b).hasNegativeIntValue();
            }

            @Override // p000.m74.InterfaceC9202q0
            public boolean hasPositiveIntValue() {
                return ((C9200p0) this.f89756b).hasPositiveIntValue();
            }

            @Override // p000.m74.InterfaceC9202q0
            public boolean hasStringValue() {
                return ((C9200p0) this.f89756b).hasStringValue();
            }

            public a removeName(int i) {
                m23743e();
                ((C9200p0) this.f89756b).removeName(i);
                return this;
            }

            public a setAggregateValue(String str) {
                m23743e();
                ((C9200p0) this.f89756b).setAggregateValue(str);
                return this;
            }

            public a setAggregateValueBytes(vj1 vj1Var) {
                m23743e();
                ((C9200p0) this.f89756b).setAggregateValueBytes(vj1Var);
                return this;
            }

            public a setDoubleValue(double d) {
                m23743e();
                ((C9200p0) this.f89756b).setDoubleValue(d);
                return this;
            }

            public a setIdentifierValue(String str) {
                m23743e();
                ((C9200p0) this.f89756b).setIdentifierValue(str);
                return this;
            }

            public a setIdentifierValueBytes(vj1 vj1Var) {
                m23743e();
                ((C9200p0) this.f89756b).setIdentifierValueBytes(vj1Var);
                return this;
            }

            public a setName(int i, b bVar) {
                m23743e();
                ((C9200p0) this.f89756b).setName(i, bVar);
                return this;
            }

            public a setNegativeIntValue(long j) {
                m23743e();
                ((C9200p0) this.f89756b).setNegativeIntValue(j);
                return this;
            }

            public a setPositiveIntValue(long j) {
                m23743e();
                ((C9200p0) this.f89756b).setPositiveIntValue(j);
                return this;
            }

            public a setStringValue(vj1 vj1Var) {
                m23743e();
                ((C9200p0) this.f89756b).setStringValue(vj1Var);
                return this;
            }

            private a() {
                super(C9200p0.DEFAULT_INSTANCE);
            }

            public a addName(int i, b bVar) {
                m23743e();
                ((C9200p0) this.f89756b).addName(i, bVar);
                return this;
            }

            public a setName(int i, b.a aVar) {
                m23743e();
                ((C9200p0) this.f89756b).setName(i, aVar.build());
                return this;
            }

            public a addName(b.a aVar) {
                m23743e();
                ((C9200p0) this.f89756b).addName(aVar.build());
                return this;
            }

            public a addName(int i, b.a aVar) {
                m23743e();
                ((C9200p0) this.f89756b).addName(i, aVar.build());
                return this;
            }
        }

        /* JADX INFO: renamed from: m74$p0$b */
        public static final class b extends v27<b, a> implements c {
            private static final b DEFAULT_INSTANCE;
            public static final int IS_EXTENSION_FIELD_NUMBER = 2;
            public static final int NAME_PART_FIELD_NUMBER = 1;
            private static volatile uhc<b> PARSER;
            private int bitField0_;
            private boolean isExtension_;
            private byte memoizedIsInitialized = 2;
            private String namePart_ = "";

            /* JADX INFO: renamed from: m74$p0$b$a */
            public static final class a extends v27.AbstractC13823b<b, a> implements c {
                public /* synthetic */ a(C9169a c9169a) {
                    this();
                }

                public a clearIsExtension() {
                    m23743e();
                    ((b) this.f89756b).clearIsExtension();
                    return this;
                }

                public a clearNamePart() {
                    m23743e();
                    ((b) this.f89756b).clearNamePart();
                    return this;
                }

                @Override // p000.m74.C9200p0.c
                public boolean getIsExtension() {
                    return ((b) this.f89756b).getIsExtension();
                }

                @Override // p000.m74.C9200p0.c
                public String getNamePart() {
                    return ((b) this.f89756b).getNamePart();
                }

                @Override // p000.m74.C9200p0.c
                public vj1 getNamePartBytes() {
                    return ((b) this.f89756b).getNamePartBytes();
                }

                @Override // p000.m74.C9200p0.c
                public boolean hasIsExtension() {
                    return ((b) this.f89756b).hasIsExtension();
                }

                @Override // p000.m74.C9200p0.c
                public boolean hasNamePart() {
                    return ((b) this.f89756b).hasNamePart();
                }

                public a setIsExtension(boolean z) {
                    m23743e();
                    ((b) this.f89756b).setIsExtension(z);
                    return this;
                }

                public a setNamePart(String str) {
                    m23743e();
                    ((b) this.f89756b).setNamePart(str);
                    return this;
                }

                public a setNamePartBytes(vj1 vj1Var) {
                    m23743e();
                    ((b) this.f89756b).setNamePartBytes(vj1Var);
                    return this;
                }

                private a() {
                    super(b.DEFAULT_INSTANCE);
                }
            }

            static {
                b bVar = new b();
                DEFAULT_INSTANCE = bVar;
                v27.m23715h0(b.class, bVar);
            }

            private b() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearIsExtension() {
                this.bitField0_ &= -3;
                this.isExtension_ = false;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearNamePart() {
                this.bitField0_ &= -2;
                this.namePart_ = getDefaultInstance().getNamePart();
            }

            public static b getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static a newBuilder() {
                return DEFAULT_INSTANCE.m23738n();
            }

            public static b parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (b) v27.m23700S(DEFAULT_INSTANCE, inputStream);
            }

            public static b parseFrom(ByteBuffer byteBuffer) throws ce8 {
                return (b) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
            }

            public static uhc<b> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setIsExtension(boolean z) {
                this.bitField0_ |= 2;
                this.isExtension_ = z;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setNamePart(String str) {
                str.getClass();
                this.bitField0_ |= 1;
                this.namePart_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setNamePartBytes(vj1 vj1Var) {
                this.namePart_ = vj1Var.toStringUtf8();
                this.bitField0_ |= 1;
            }

            @Override // p000.m74.C9200p0.c
            public boolean getIsExtension() {
                return this.isExtension_;
            }

            @Override // p000.m74.C9200p0.c
            public String getNamePart() {
                return this.namePart_;
            }

            @Override // p000.m74.C9200p0.c
            public vj1 getNamePartBytes() {
                return vj1.copyFromUtf8(this.namePart_);
            }

            @Override // p000.m74.C9200p0.c
            public boolean hasIsExtension() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // p000.m74.C9200p0.c
            public boolean hasNamePart() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // p000.v27
            /* JADX INFO: renamed from: r */
            public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
                C9169a c9169a = null;
                switch (C9169a.f60048a[enumC13830i.ordinal()]) {
                    case 1:
                        return new b();
                    case 2:
                        return new a(c9169a);
                    case 3:
                        return v27.m23699Q(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔈ\u0000\u0002ᔇ\u0001", new Object[]{"bitField0_", "namePart_", "isExtension_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        uhc<b> c13824c = PARSER;
                        if (c13824c == null) {
                            synchronized (b.class) {
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
                        return Byte.valueOf(this.memoizedIsInitialized);
                    case 7:
                        this.memoizedIsInitialized = (byte) (obj == null ? 0 : 1);
                        return null;
                    default:
                        throw new UnsupportedOperationException();
                }
            }

            public static a newBuilder(b bVar) {
                return DEFAULT_INSTANCE.m23739o(bVar);
            }

            public static b parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
                return (b) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
            }

            public static b parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
                return (b) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
            }

            public static b parseFrom(vj1 vj1Var) throws ce8 {
                return (b) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
            }

            public static b parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
                return (b) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
            }

            public static b parseFrom(byte[] bArr) throws ce8 {
                return (b) v27.m23710c0(DEFAULT_INSTANCE, bArr);
            }

            public static b parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
                return (b) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
            }

            public static b parseFrom(InputStream inputStream) throws IOException {
                return (b) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
            }

            public static b parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
                return (b) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
            }

            public static b parseFrom(f72 f72Var) throws IOException {
                return (b) v27.m23704W(DEFAULT_INSTANCE, f72Var);
            }

            public static b parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
                return (b) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
            }
        }

        /* JADX INFO: renamed from: m74$p0$c */
        public interface c extends rsa {
            boolean getIsExtension();

            String getNamePart();

            vj1 getNamePartBytes();

            boolean hasIsExtension();

            boolean hasNamePart();
        }

        static {
            C9200p0 c9200p0 = new C9200p0();
            DEFAULT_INSTANCE = c9200p0;
            v27.m23715h0(C9200p0.class, c9200p0);
        }

        private C9200p0() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllName(Iterable<? extends b> iterable) {
            ensureNameIsMutable();
            AbstractC1714b3.m2856b(iterable, this.name_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addName(b bVar) {
            bVar.getClass();
            ensureNameIsMutable();
            this.name_.add(bVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAggregateValue() {
            this.bitField0_ &= -33;
            this.aggregateValue_ = getDefaultInstance().getAggregateValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDoubleValue() {
            this.bitField0_ &= -9;
            this.doubleValue_ = 0.0d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIdentifierValue() {
            this.bitField0_ &= -2;
            this.identifierValue_ = getDefaultInstance().getIdentifierValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearName() {
            this.name_ = v27.m23722x();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNegativeIntValue() {
            this.bitField0_ &= -5;
            this.negativeIntValue_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPositiveIntValue() {
            this.bitField0_ &= -3;
            this.positiveIntValue_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStringValue() {
            this.bitField0_ &= -17;
            this.stringValue_ = getDefaultInstance().getStringValue();
        }

        private void ensureNameIsMutable() {
            w98.InterfaceC14504k<b> interfaceC14504k = this.name_;
            if (interfaceC14504k.isModifiable()) {
                return;
            }
            this.name_ = v27.m23698P(interfaceC14504k);
        }

        public static C9200p0 getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.m23738n();
        }

        public static C9200p0 parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (C9200p0) v27.m23700S(DEFAULT_INSTANCE, inputStream);
        }

        public static C9200p0 parseFrom(ByteBuffer byteBuffer) throws ce8 {
            return (C9200p0) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
        }

        public static uhc<C9200p0> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeName(int i) {
            ensureNameIsMutable();
            this.name_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAggregateValue(String str) {
            str.getClass();
            this.bitField0_ |= 32;
            this.aggregateValue_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAggregateValueBytes(vj1 vj1Var) {
            this.aggregateValue_ = vj1Var.toStringUtf8();
            this.bitField0_ |= 32;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDoubleValue(double d) {
            this.bitField0_ |= 8;
            this.doubleValue_ = d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIdentifierValue(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.identifierValue_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIdentifierValueBytes(vj1 vj1Var) {
            this.identifierValue_ = vj1Var.toStringUtf8();
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setName(int i, b bVar) {
            bVar.getClass();
            ensureNameIsMutable();
            this.name_.set(i, bVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNegativeIntValue(long j) {
            this.bitField0_ |= 4;
            this.negativeIntValue_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPositiveIntValue(long j) {
            this.bitField0_ |= 2;
            this.positiveIntValue_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStringValue(vj1 vj1Var) {
            vj1Var.getClass();
            this.bitField0_ |= 16;
            this.stringValue_ = vj1Var;
        }

        @Override // p000.m74.InterfaceC9202q0
        public String getAggregateValue() {
            return this.aggregateValue_;
        }

        @Override // p000.m74.InterfaceC9202q0
        public vj1 getAggregateValueBytes() {
            return vj1.copyFromUtf8(this.aggregateValue_);
        }

        @Override // p000.m74.InterfaceC9202q0
        public double getDoubleValue() {
            return this.doubleValue_;
        }

        @Override // p000.m74.InterfaceC9202q0
        public String getIdentifierValue() {
            return this.identifierValue_;
        }

        @Override // p000.m74.InterfaceC9202q0
        public vj1 getIdentifierValueBytes() {
            return vj1.copyFromUtf8(this.identifierValue_);
        }

        @Override // p000.m74.InterfaceC9202q0
        public b getName(int i) {
            return this.name_.get(i);
        }

        @Override // p000.m74.InterfaceC9202q0
        public int getNameCount() {
            return this.name_.size();
        }

        @Override // p000.m74.InterfaceC9202q0
        public List<b> getNameList() {
            return this.name_;
        }

        public c getNameOrBuilder(int i) {
            return this.name_.get(i);
        }

        public List<? extends c> getNameOrBuilderList() {
            return this.name_;
        }

        @Override // p000.m74.InterfaceC9202q0
        public long getNegativeIntValue() {
            return this.negativeIntValue_;
        }

        @Override // p000.m74.InterfaceC9202q0
        public long getPositiveIntValue() {
            return this.positiveIntValue_;
        }

        @Override // p000.m74.InterfaceC9202q0
        public vj1 getStringValue() {
            return this.stringValue_;
        }

        @Override // p000.m74.InterfaceC9202q0
        public boolean hasAggregateValue() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // p000.m74.InterfaceC9202q0
        public boolean hasDoubleValue() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // p000.m74.InterfaceC9202q0
        public boolean hasIdentifierValue() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // p000.m74.InterfaceC9202q0
        public boolean hasNegativeIntValue() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // p000.m74.InterfaceC9202q0
        public boolean hasPositiveIntValue() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // p000.m74.InterfaceC9202q0
        public boolean hasStringValue() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // p000.v27
        /* JADX INFO: renamed from: r */
        public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
            C9169a c9169a = null;
            switch (C9169a.f60048a[enumC13830i.ordinal()]) {
                case 1:
                    return new C9200p0();
                case 2:
                    return new a(c9169a);
                case 3:
                    return v27.m23699Q(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0002\b\u0007\u0000\u0001\u0001\u0002Л\u0003ဈ\u0000\u0004ဃ\u0001\u0005ဂ\u0002\u0006က\u0003\u0007ည\u0004\bဈ\u0005", new Object[]{"bitField0_", "name_", b.class, "identifierValue_", "positiveIntValue_", "negativeIntValue_", "doubleValue_", "stringValue_", "aggregateValue_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    uhc<C9200p0> c13824c = PARSER;
                    if (c13824c == null) {
                        synchronized (C9200p0.class) {
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
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    this.memoizedIsInitialized = (byte) (obj == null ? 0 : 1);
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public static a newBuilder(C9200p0 c9200p0) {
            return DEFAULT_INSTANCE.m23739o(c9200p0);
        }

        public static C9200p0 parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
            return (C9200p0) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
        }

        public static C9200p0 parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
            return (C9200p0) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
        }

        public static C9200p0 parseFrom(vj1 vj1Var) throws ce8 {
            return (C9200p0) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addName(int i, b bVar) {
            bVar.getClass();
            ensureNameIsMutable();
            this.name_.add(i, bVar);
        }

        public static C9200p0 parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
            return (C9200p0) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
        }

        public static C9200p0 parseFrom(byte[] bArr) throws ce8 {
            return (C9200p0) v27.m23710c0(DEFAULT_INSTANCE, bArr);
        }

        public static C9200p0 parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
            return (C9200p0) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
        }

        public static C9200p0 parseFrom(InputStream inputStream) throws IOException {
            return (C9200p0) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
        }

        public static C9200p0 parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
            return (C9200p0) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
        }

        public static C9200p0 parseFrom(f72 f72Var) throws IOException {
            return (C9200p0) v27.m23704W(DEFAULT_INSTANCE, f72Var);
        }

        public static C9200p0 parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
            return (C9200p0) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
        }
    }

    /* JADX INFO: renamed from: m74$q */
    public interface InterfaceC9201q extends v27.InterfaceC13827f<C9199p, C9199p.a> {
        C9199p.b getCtype();

        boolean getDeprecated();

        C9199p.c getJstype();

        boolean getLazy();

        boolean getPacked();

        C9200p0 getUninterpretedOption(int i);

        int getUninterpretedOptionCount();

        List<C9200p0> getUninterpretedOptionList();

        boolean getWeak();

        boolean hasCtype();

        boolean hasDeprecated();

        boolean hasJstype();

        boolean hasLazy();

        boolean hasPacked();

        boolean hasWeak();
    }

    /* JADX INFO: renamed from: m74$q0 */
    public interface InterfaceC9202q0 extends rsa {
        String getAggregateValue();

        vj1 getAggregateValueBytes();

        double getDoubleValue();

        String getIdentifierValue();

        vj1 getIdentifierValueBytes();

        C9200p0.b getName(int i);

        int getNameCount();

        List<C9200p0.b> getNameList();

        long getNegativeIntValue();

        long getPositiveIntValue();

        vj1 getStringValue();

        boolean hasAggregateValue();

        boolean hasDoubleValue();

        boolean hasIdentifierValue();

        boolean hasNegativeIntValue();

        boolean hasPositiveIntValue();

        boolean hasStringValue();
    }

    /* JADX INFO: renamed from: m74$r */
    public static final class C9203r extends v27<C9203r, a> implements InterfaceC9204s {
        private static final C9203r DEFAULT_INSTANCE;
        public static final int DEPENDENCY_FIELD_NUMBER = 3;
        public static final int ENUM_TYPE_FIELD_NUMBER = 5;
        public static final int EXTENSION_FIELD_NUMBER = 7;
        public static final int MESSAGE_TYPE_FIELD_NUMBER = 4;
        public static final int NAME_FIELD_NUMBER = 1;
        public static final int OPTIONS_FIELD_NUMBER = 8;
        public static final int PACKAGE_FIELD_NUMBER = 2;
        private static volatile uhc<C9203r> PARSER = null;
        public static final int PUBLIC_DEPENDENCY_FIELD_NUMBER = 10;
        public static final int SERVICE_FIELD_NUMBER = 6;
        public static final int SOURCE_CODE_INFO_FIELD_NUMBER = 9;
        public static final int SYNTAX_FIELD_NUMBER = 12;
        public static final int WEAK_DEPENDENCY_FIELD_NUMBER = 11;
        private int bitField0_;
        private C9207v options_;
        private C9196n0 sourceCodeInfo_;
        private byte memoizedIsInitialized = 2;
        private String name_ = "";
        private String package_ = "";
        private w98.InterfaceC14504k<String> dependency_ = v27.m23722x();
        private w98.InterfaceC14501h publicDependency_ = v27.m23720v();
        private w98.InterfaceC14501h weakDependency_ = v27.m23720v();
        private w98.InterfaceC14504k<C9171b> messageType_ = v27.m23722x();
        private w98.InterfaceC14504k<C9175d> enumType_ = v27.m23722x();
        private w98.InterfaceC14504k<C9188j0> service_ = v27.m23722x();
        private w98.InterfaceC14504k<C9195n> extension_ = v27.m23722x();
        private String syntax_ = "";

        /* JADX INFO: renamed from: m74$r$a */
        public static final class a extends v27.AbstractC13823b<C9203r, a> implements InterfaceC9204s {
            public /* synthetic */ a(C9169a c9169a) {
                this();
            }

            public a addAllDependency(Iterable<String> iterable) {
                m23743e();
                ((C9203r) this.f89756b).addAllDependency(iterable);
                return this;
            }

            public a addAllEnumType(Iterable<? extends C9175d> iterable) {
                m23743e();
                ((C9203r) this.f89756b).addAllEnumType(iterable);
                return this;
            }

            public a addAllExtension(Iterable<? extends C9195n> iterable) {
                m23743e();
                ((C9203r) this.f89756b).addAllExtension(iterable);
                return this;
            }

            public a addAllMessageType(Iterable<? extends C9171b> iterable) {
                m23743e();
                ((C9203r) this.f89756b).addAllMessageType(iterable);
                return this;
            }

            public a addAllPublicDependency(Iterable<? extends Integer> iterable) {
                m23743e();
                ((C9203r) this.f89756b).addAllPublicDependency(iterable);
                return this;
            }

            public a addAllService(Iterable<? extends C9188j0> iterable) {
                m23743e();
                ((C9203r) this.f89756b).addAllService(iterable);
                return this;
            }

            public a addAllWeakDependency(Iterable<? extends Integer> iterable) {
                m23743e();
                ((C9203r) this.f89756b).addAllWeakDependency(iterable);
                return this;
            }

            public a addDependency(String str) {
                m23743e();
                ((C9203r) this.f89756b).addDependency(str);
                return this;
            }

            public a addDependencyBytes(vj1 vj1Var) {
                m23743e();
                ((C9203r) this.f89756b).addDependencyBytes(vj1Var);
                return this;
            }

            public a addEnumType(C9175d c9175d) {
                m23743e();
                ((C9203r) this.f89756b).addEnumType(c9175d);
                return this;
            }

            public a addExtension(C9195n c9195n) {
                m23743e();
                ((C9203r) this.f89756b).addExtension(c9195n);
                return this;
            }

            public a addMessageType(C9171b c9171b) {
                m23743e();
                ((C9203r) this.f89756b).addMessageType(c9171b);
                return this;
            }

            public a addPublicDependency(int i) {
                m23743e();
                ((C9203r) this.f89756b).addPublicDependency(i);
                return this;
            }

            public a addService(C9188j0 c9188j0) {
                m23743e();
                ((C9203r) this.f89756b).addService(c9188j0);
                return this;
            }

            public a addWeakDependency(int i) {
                m23743e();
                ((C9203r) this.f89756b).addWeakDependency(i);
                return this;
            }

            public a clearDependency() {
                m23743e();
                ((C9203r) this.f89756b).clearDependency();
                return this;
            }

            public a clearEnumType() {
                m23743e();
                ((C9203r) this.f89756b).clearEnumType();
                return this;
            }

            public a clearExtension() {
                m23743e();
                ((C9203r) this.f89756b).clearExtension();
                return this;
            }

            public a clearMessageType() {
                m23743e();
                ((C9203r) this.f89756b).clearMessageType();
                return this;
            }

            public a clearName() {
                m23743e();
                ((C9203r) this.f89756b).clearName();
                return this;
            }

            public a clearOptions() {
                m23743e();
                ((C9203r) this.f89756b).clearOptions();
                return this;
            }

            public a clearPackage() {
                m23743e();
                ((C9203r) this.f89756b).clearPackage();
                return this;
            }

            public a clearPublicDependency() {
                m23743e();
                ((C9203r) this.f89756b).clearPublicDependency();
                return this;
            }

            public a clearService() {
                m23743e();
                ((C9203r) this.f89756b).clearService();
                return this;
            }

            public a clearSourceCodeInfo() {
                m23743e();
                ((C9203r) this.f89756b).clearSourceCodeInfo();
                return this;
            }

            public a clearSyntax() {
                m23743e();
                ((C9203r) this.f89756b).clearSyntax();
                return this;
            }

            public a clearWeakDependency() {
                m23743e();
                ((C9203r) this.f89756b).clearWeakDependency();
                return this;
            }

            @Override // p000.m74.InterfaceC9204s
            public String getDependency(int i) {
                return ((C9203r) this.f89756b).getDependency(i);
            }

            @Override // p000.m74.InterfaceC9204s
            public vj1 getDependencyBytes(int i) {
                return ((C9203r) this.f89756b).getDependencyBytes(i);
            }

            @Override // p000.m74.InterfaceC9204s
            public int getDependencyCount() {
                return ((C9203r) this.f89756b).getDependencyCount();
            }

            @Override // p000.m74.InterfaceC9204s
            public List<String> getDependencyList() {
                return Collections.unmodifiableList(((C9203r) this.f89756b).getDependencyList());
            }

            @Override // p000.m74.InterfaceC9204s
            public C9175d getEnumType(int i) {
                return ((C9203r) this.f89756b).getEnumType(i);
            }

            @Override // p000.m74.InterfaceC9204s
            public int getEnumTypeCount() {
                return ((C9203r) this.f89756b).getEnumTypeCount();
            }

            @Override // p000.m74.InterfaceC9204s
            public List<C9175d> getEnumTypeList() {
                return Collections.unmodifiableList(((C9203r) this.f89756b).getEnumTypeList());
            }

            @Override // p000.m74.InterfaceC9204s
            public C9195n getExtension(int i) {
                return ((C9203r) this.f89756b).getExtension(i);
            }

            @Override // p000.m74.InterfaceC9204s
            public int getExtensionCount() {
                return ((C9203r) this.f89756b).getExtensionCount();
            }

            @Override // p000.m74.InterfaceC9204s
            public List<C9195n> getExtensionList() {
                return Collections.unmodifiableList(((C9203r) this.f89756b).getExtensionList());
            }

            @Override // p000.m74.InterfaceC9204s
            public C9171b getMessageType(int i) {
                return ((C9203r) this.f89756b).getMessageType(i);
            }

            @Override // p000.m74.InterfaceC9204s
            public int getMessageTypeCount() {
                return ((C9203r) this.f89756b).getMessageTypeCount();
            }

            @Override // p000.m74.InterfaceC9204s
            public List<C9171b> getMessageTypeList() {
                return Collections.unmodifiableList(((C9203r) this.f89756b).getMessageTypeList());
            }

            @Override // p000.m74.InterfaceC9204s
            public String getName() {
                return ((C9203r) this.f89756b).getName();
            }

            @Override // p000.m74.InterfaceC9204s
            public vj1 getNameBytes() {
                return ((C9203r) this.f89756b).getNameBytes();
            }

            @Override // p000.m74.InterfaceC9204s
            public C9207v getOptions() {
                return ((C9203r) this.f89756b).getOptions();
            }

            @Override // p000.m74.InterfaceC9204s
            public String getPackage() {
                return ((C9203r) this.f89756b).getPackage();
            }

            @Override // p000.m74.InterfaceC9204s
            public vj1 getPackageBytes() {
                return ((C9203r) this.f89756b).getPackageBytes();
            }

            @Override // p000.m74.InterfaceC9204s
            public int getPublicDependency(int i) {
                return ((C9203r) this.f89756b).getPublicDependency(i);
            }

            @Override // p000.m74.InterfaceC9204s
            public int getPublicDependencyCount() {
                return ((C9203r) this.f89756b).getPublicDependencyCount();
            }

            @Override // p000.m74.InterfaceC9204s
            public List<Integer> getPublicDependencyList() {
                return Collections.unmodifiableList(((C9203r) this.f89756b).getPublicDependencyList());
            }

            @Override // p000.m74.InterfaceC9204s
            public C9188j0 getService(int i) {
                return ((C9203r) this.f89756b).getService(i);
            }

            @Override // p000.m74.InterfaceC9204s
            public int getServiceCount() {
                return ((C9203r) this.f89756b).getServiceCount();
            }

            @Override // p000.m74.InterfaceC9204s
            public List<C9188j0> getServiceList() {
                return Collections.unmodifiableList(((C9203r) this.f89756b).getServiceList());
            }

            @Override // p000.m74.InterfaceC9204s
            public C9196n0 getSourceCodeInfo() {
                return ((C9203r) this.f89756b).getSourceCodeInfo();
            }

            @Override // p000.m74.InterfaceC9204s
            public String getSyntax() {
                return ((C9203r) this.f89756b).getSyntax();
            }

            @Override // p000.m74.InterfaceC9204s
            public vj1 getSyntaxBytes() {
                return ((C9203r) this.f89756b).getSyntaxBytes();
            }

            @Override // p000.m74.InterfaceC9204s
            public int getWeakDependency(int i) {
                return ((C9203r) this.f89756b).getWeakDependency(i);
            }

            @Override // p000.m74.InterfaceC9204s
            public int getWeakDependencyCount() {
                return ((C9203r) this.f89756b).getWeakDependencyCount();
            }

            @Override // p000.m74.InterfaceC9204s
            public List<Integer> getWeakDependencyList() {
                return Collections.unmodifiableList(((C9203r) this.f89756b).getWeakDependencyList());
            }

            @Override // p000.m74.InterfaceC9204s
            public boolean hasName() {
                return ((C9203r) this.f89756b).hasName();
            }

            @Override // p000.m74.InterfaceC9204s
            public boolean hasOptions() {
                return ((C9203r) this.f89756b).hasOptions();
            }

            @Override // p000.m74.InterfaceC9204s
            public boolean hasPackage() {
                return ((C9203r) this.f89756b).hasPackage();
            }

            @Override // p000.m74.InterfaceC9204s
            public boolean hasSourceCodeInfo() {
                return ((C9203r) this.f89756b).hasSourceCodeInfo();
            }

            @Override // p000.m74.InterfaceC9204s
            public boolean hasSyntax() {
                return ((C9203r) this.f89756b).hasSyntax();
            }

            public a mergeOptions(C9207v c9207v) {
                m23743e();
                ((C9203r) this.f89756b).mergeOptions(c9207v);
                return this;
            }

            public a mergeSourceCodeInfo(C9196n0 c9196n0) {
                m23743e();
                ((C9203r) this.f89756b).mergeSourceCodeInfo(c9196n0);
                return this;
            }

            public a removeEnumType(int i) {
                m23743e();
                ((C9203r) this.f89756b).removeEnumType(i);
                return this;
            }

            public a removeExtension(int i) {
                m23743e();
                ((C9203r) this.f89756b).removeExtension(i);
                return this;
            }

            public a removeMessageType(int i) {
                m23743e();
                ((C9203r) this.f89756b).removeMessageType(i);
                return this;
            }

            public a removeService(int i) {
                m23743e();
                ((C9203r) this.f89756b).removeService(i);
                return this;
            }

            public a setDependency(int i, String str) {
                m23743e();
                ((C9203r) this.f89756b).setDependency(i, str);
                return this;
            }

            public a setEnumType(int i, C9175d c9175d) {
                m23743e();
                ((C9203r) this.f89756b).setEnumType(i, c9175d);
                return this;
            }

            public a setExtension(int i, C9195n c9195n) {
                m23743e();
                ((C9203r) this.f89756b).setExtension(i, c9195n);
                return this;
            }

            public a setMessageType(int i, C9171b c9171b) {
                m23743e();
                ((C9203r) this.f89756b).setMessageType(i, c9171b);
                return this;
            }

            public a setName(String str) {
                m23743e();
                ((C9203r) this.f89756b).setName(str);
                return this;
            }

            public a setNameBytes(vj1 vj1Var) {
                m23743e();
                ((C9203r) this.f89756b).setNameBytes(vj1Var);
                return this;
            }

            public a setOptions(C9207v c9207v) {
                m23743e();
                ((C9203r) this.f89756b).setOptions(c9207v);
                return this;
            }

            public a setPackage(String str) {
                m23743e();
                ((C9203r) this.f89756b).setPackage(str);
                return this;
            }

            public a setPackageBytes(vj1 vj1Var) {
                m23743e();
                ((C9203r) this.f89756b).setPackageBytes(vj1Var);
                return this;
            }

            public a setPublicDependency(int i, int i2) {
                m23743e();
                ((C9203r) this.f89756b).setPublicDependency(i, i2);
                return this;
            }

            public a setService(int i, C9188j0 c9188j0) {
                m23743e();
                ((C9203r) this.f89756b).setService(i, c9188j0);
                return this;
            }

            public a setSourceCodeInfo(C9196n0 c9196n0) {
                m23743e();
                ((C9203r) this.f89756b).setSourceCodeInfo(c9196n0);
                return this;
            }

            public a setSyntax(String str) {
                m23743e();
                ((C9203r) this.f89756b).setSyntax(str);
                return this;
            }

            public a setSyntaxBytes(vj1 vj1Var) {
                m23743e();
                ((C9203r) this.f89756b).setSyntaxBytes(vj1Var);
                return this;
            }

            public a setWeakDependency(int i, int i2) {
                m23743e();
                ((C9203r) this.f89756b).setWeakDependency(i, i2);
                return this;
            }

            private a() {
                super(C9203r.DEFAULT_INSTANCE);
            }

            public a addEnumType(int i, C9175d c9175d) {
                m23743e();
                ((C9203r) this.f89756b).addEnumType(i, c9175d);
                return this;
            }

            public a addExtension(int i, C9195n c9195n) {
                m23743e();
                ((C9203r) this.f89756b).addExtension(i, c9195n);
                return this;
            }

            public a addMessageType(int i, C9171b c9171b) {
                m23743e();
                ((C9203r) this.f89756b).addMessageType(i, c9171b);
                return this;
            }

            public a addService(int i, C9188j0 c9188j0) {
                m23743e();
                ((C9203r) this.f89756b).addService(i, c9188j0);
                return this;
            }

            public a setEnumType(int i, C9175d.a aVar) {
                m23743e();
                ((C9203r) this.f89756b).setEnumType(i, aVar.build());
                return this;
            }

            public a setExtension(int i, C9195n.a aVar) {
                m23743e();
                ((C9203r) this.f89756b).setExtension(i, aVar.build());
                return this;
            }

            public a setMessageType(int i, C9171b.a aVar) {
                m23743e();
                ((C9203r) this.f89756b).setMessageType(i, aVar.build());
                return this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public a setOptions(C9207v.a aVar) {
                m23743e();
                ((C9203r) this.f89756b).setOptions((C9207v) aVar.build());
                return this;
            }

            public a setService(int i, C9188j0.a aVar) {
                m23743e();
                ((C9203r) this.f89756b).setService(i, aVar.build());
                return this;
            }

            public a setSourceCodeInfo(C9196n0.a aVar) {
                m23743e();
                ((C9203r) this.f89756b).setSourceCodeInfo(aVar.build());
                return this;
            }

            public a addEnumType(C9175d.a aVar) {
                m23743e();
                ((C9203r) this.f89756b).addEnumType(aVar.build());
                return this;
            }

            public a addExtension(C9195n.a aVar) {
                m23743e();
                ((C9203r) this.f89756b).addExtension(aVar.build());
                return this;
            }

            public a addMessageType(C9171b.a aVar) {
                m23743e();
                ((C9203r) this.f89756b).addMessageType(aVar.build());
                return this;
            }

            public a addService(C9188j0.a aVar) {
                m23743e();
                ((C9203r) this.f89756b).addService(aVar.build());
                return this;
            }

            public a addEnumType(int i, C9175d.a aVar) {
                m23743e();
                ((C9203r) this.f89756b).addEnumType(i, aVar.build());
                return this;
            }

            public a addExtension(int i, C9195n.a aVar) {
                m23743e();
                ((C9203r) this.f89756b).addExtension(i, aVar.build());
                return this;
            }

            public a addMessageType(int i, C9171b.a aVar) {
                m23743e();
                ((C9203r) this.f89756b).addMessageType(i, aVar.build());
                return this;
            }

            public a addService(int i, C9188j0.a aVar) {
                m23743e();
                ((C9203r) this.f89756b).addService(i, aVar.build());
                return this;
            }
        }

        static {
            C9203r c9203r = new C9203r();
            DEFAULT_INSTANCE = c9203r;
            v27.m23715h0(C9203r.class, c9203r);
        }

        private C9203r() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllDependency(Iterable<String> iterable) {
            ensureDependencyIsMutable();
            AbstractC1714b3.m2856b(iterable, this.dependency_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllEnumType(Iterable<? extends C9175d> iterable) {
            ensureEnumTypeIsMutable();
            AbstractC1714b3.m2856b(iterable, this.enumType_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllExtension(Iterable<? extends C9195n> iterable) {
            ensureExtensionIsMutable();
            AbstractC1714b3.m2856b(iterable, this.extension_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllMessageType(Iterable<? extends C9171b> iterable) {
            ensureMessageTypeIsMutable();
            AbstractC1714b3.m2856b(iterable, this.messageType_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllPublicDependency(Iterable<? extends Integer> iterable) {
            ensurePublicDependencyIsMutable();
            AbstractC1714b3.m2856b(iterable, this.publicDependency_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllService(Iterable<? extends C9188j0> iterable) {
            ensureServiceIsMutable();
            AbstractC1714b3.m2856b(iterable, this.service_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllWeakDependency(Iterable<? extends Integer> iterable) {
            ensureWeakDependencyIsMutable();
            AbstractC1714b3.m2856b(iterable, this.weakDependency_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addDependency(String str) {
            str.getClass();
            ensureDependencyIsMutable();
            this.dependency_.add(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addDependencyBytes(vj1 vj1Var) {
            ensureDependencyIsMutable();
            this.dependency_.add(vj1Var.toStringUtf8());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addEnumType(C9175d c9175d) {
            c9175d.getClass();
            ensureEnumTypeIsMutable();
            this.enumType_.add(c9175d);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addExtension(C9195n c9195n) {
            c9195n.getClass();
            ensureExtensionIsMutable();
            this.extension_.add(c9195n);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addMessageType(C9171b c9171b) {
            c9171b.getClass();
            ensureMessageTypeIsMutable();
            this.messageType_.add(c9171b);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addPublicDependency(int i) {
            ensurePublicDependencyIsMutable();
            this.publicDependency_.addInt(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addService(C9188j0 c9188j0) {
            c9188j0.getClass();
            ensureServiceIsMutable();
            this.service_.add(c9188j0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addWeakDependency(int i) {
            ensureWeakDependencyIsMutable();
            this.weakDependency_.addInt(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDependency() {
            this.dependency_ = v27.m23722x();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEnumType() {
            this.enumType_ = v27.m23722x();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearExtension() {
            this.extension_ = v27.m23722x();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMessageType() {
            this.messageType_ = v27.m23722x();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearName() {
            this.bitField0_ &= -2;
            this.name_ = getDefaultInstance().getName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOptions() {
            this.options_ = null;
            this.bitField0_ &= -5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPackage() {
            this.bitField0_ &= -3;
            this.package_ = getDefaultInstance().getPackage();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPublicDependency() {
            this.publicDependency_ = v27.m23720v();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearService() {
            this.service_ = v27.m23722x();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSourceCodeInfo() {
            this.sourceCodeInfo_ = null;
            this.bitField0_ &= -9;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSyntax() {
            this.bitField0_ &= -17;
            this.syntax_ = getDefaultInstance().getSyntax();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearWeakDependency() {
            this.weakDependency_ = v27.m23720v();
        }

        private void ensureDependencyIsMutable() {
            w98.InterfaceC14504k<String> interfaceC14504k = this.dependency_;
            if (interfaceC14504k.isModifiable()) {
                return;
            }
            this.dependency_ = v27.m23698P(interfaceC14504k);
        }

        private void ensureEnumTypeIsMutable() {
            w98.InterfaceC14504k<C9175d> interfaceC14504k = this.enumType_;
            if (interfaceC14504k.isModifiable()) {
                return;
            }
            this.enumType_ = v27.m23698P(interfaceC14504k);
        }

        private void ensureExtensionIsMutable() {
            w98.InterfaceC14504k<C9195n> interfaceC14504k = this.extension_;
            if (interfaceC14504k.isModifiable()) {
                return;
            }
            this.extension_ = v27.m23698P(interfaceC14504k);
        }

        private void ensureMessageTypeIsMutable() {
            w98.InterfaceC14504k<C9171b> interfaceC14504k = this.messageType_;
            if (interfaceC14504k.isModifiable()) {
                return;
            }
            this.messageType_ = v27.m23698P(interfaceC14504k);
        }

        private void ensurePublicDependencyIsMutable() {
            w98.InterfaceC14501h interfaceC14501h = this.publicDependency_;
            if (interfaceC14501h.isModifiable()) {
                return;
            }
            this.publicDependency_ = v27.m23696N(interfaceC14501h);
        }

        private void ensureServiceIsMutable() {
            w98.InterfaceC14504k<C9188j0> interfaceC14504k = this.service_;
            if (interfaceC14504k.isModifiable()) {
                return;
            }
            this.service_ = v27.m23698P(interfaceC14504k);
        }

        private void ensureWeakDependencyIsMutable() {
            w98.InterfaceC14501h interfaceC14501h = this.weakDependency_;
            if (interfaceC14501h.isModifiable()) {
                return;
            }
            this.weakDependency_ = v27.m23696N(interfaceC14501h);
        }

        public static C9203r getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public void mergeOptions(C9207v c9207v) {
            c9207v.getClass();
            C9207v c9207v2 = this.options_;
            if (c9207v2 == null || c9207v2 == C9207v.getDefaultInstance()) {
                this.options_ = c9207v;
            } else {
                this.options_ = ((C9207v.a) C9207v.newBuilder(this.options_).mergeFrom(c9207v)).buildPartial();
            }
            this.bitField0_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeSourceCodeInfo(C9196n0 c9196n0) {
            c9196n0.getClass();
            C9196n0 c9196n02 = this.sourceCodeInfo_;
            if (c9196n02 == null || c9196n02 == C9196n0.getDefaultInstance()) {
                this.sourceCodeInfo_ = c9196n0;
            } else {
                this.sourceCodeInfo_ = C9196n0.newBuilder(this.sourceCodeInfo_).mergeFrom(c9196n0).buildPartial();
            }
            this.bitField0_ |= 8;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.m23738n();
        }

        public static C9203r parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (C9203r) v27.m23700S(DEFAULT_INSTANCE, inputStream);
        }

        public static C9203r parseFrom(ByteBuffer byteBuffer) throws ce8 {
            return (C9203r) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
        }

        public static uhc<C9203r> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeEnumType(int i) {
            ensureEnumTypeIsMutable();
            this.enumType_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeExtension(int i) {
            ensureExtensionIsMutable();
            this.extension_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeMessageType(int i) {
            ensureMessageTypeIsMutable();
            this.messageType_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeService(int i) {
            ensureServiceIsMutable();
            this.service_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDependency(int i, String str) {
            str.getClass();
            ensureDependencyIsMutable();
            this.dependency_.set(i, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEnumType(int i, C9175d c9175d) {
            c9175d.getClass();
            ensureEnumTypeIsMutable();
            this.enumType_.set(i, c9175d);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setExtension(int i, C9195n c9195n) {
            c9195n.getClass();
            ensureExtensionIsMutable();
            this.extension_.set(i, c9195n);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMessageType(int i, C9171b c9171b) {
            c9171b.getClass();
            ensureMessageTypeIsMutable();
            this.messageType_.set(i, c9171b);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setName(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.name_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNameBytes(vj1 vj1Var) {
            this.name_ = vj1Var.toStringUtf8();
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOptions(C9207v c9207v) {
            c9207v.getClass();
            this.options_ = c9207v;
            this.bitField0_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPackage(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.package_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPackageBytes(vj1 vj1Var) {
            this.package_ = vj1Var.toStringUtf8();
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPublicDependency(int i, int i2) {
            ensurePublicDependencyIsMutable();
            this.publicDependency_.setInt(i, i2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setService(int i, C9188j0 c9188j0) {
            c9188j0.getClass();
            ensureServiceIsMutable();
            this.service_.set(i, c9188j0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSourceCodeInfo(C9196n0 c9196n0) {
            c9196n0.getClass();
            this.sourceCodeInfo_ = c9196n0;
            this.bitField0_ |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSyntax(String str) {
            str.getClass();
            this.bitField0_ |= 16;
            this.syntax_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSyntaxBytes(vj1 vj1Var) {
            this.syntax_ = vj1Var.toStringUtf8();
            this.bitField0_ |= 16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWeakDependency(int i, int i2) {
            ensureWeakDependencyIsMutable();
            this.weakDependency_.setInt(i, i2);
        }

        @Override // p000.m74.InterfaceC9204s
        public String getDependency(int i) {
            return this.dependency_.get(i);
        }

        @Override // p000.m74.InterfaceC9204s
        public vj1 getDependencyBytes(int i) {
            return vj1.copyFromUtf8(this.dependency_.get(i));
        }

        @Override // p000.m74.InterfaceC9204s
        public int getDependencyCount() {
            return this.dependency_.size();
        }

        @Override // p000.m74.InterfaceC9204s
        public List<String> getDependencyList() {
            return this.dependency_;
        }

        @Override // p000.m74.InterfaceC9204s
        public C9175d getEnumType(int i) {
            return this.enumType_.get(i);
        }

        @Override // p000.m74.InterfaceC9204s
        public int getEnumTypeCount() {
            return this.enumType_.size();
        }

        @Override // p000.m74.InterfaceC9204s
        public List<C9175d> getEnumTypeList() {
            return this.enumType_;
        }

        public InterfaceC9177e getEnumTypeOrBuilder(int i) {
            return this.enumType_.get(i);
        }

        public List<? extends InterfaceC9177e> getEnumTypeOrBuilderList() {
            return this.enumType_;
        }

        @Override // p000.m74.InterfaceC9204s
        public C9195n getExtension(int i) {
            return this.extension_.get(i);
        }

        @Override // p000.m74.InterfaceC9204s
        public int getExtensionCount() {
            return this.extension_.size();
        }

        @Override // p000.m74.InterfaceC9204s
        public List<C9195n> getExtensionList() {
            return this.extension_;
        }

        public InterfaceC9197o getExtensionOrBuilder(int i) {
            return this.extension_.get(i);
        }

        public List<? extends InterfaceC9197o> getExtensionOrBuilderList() {
            return this.extension_;
        }

        @Override // p000.m74.InterfaceC9204s
        public C9171b getMessageType(int i) {
            return this.messageType_.get(i);
        }

        @Override // p000.m74.InterfaceC9204s
        public int getMessageTypeCount() {
            return this.messageType_.size();
        }

        @Override // p000.m74.InterfaceC9204s
        public List<C9171b> getMessageTypeList() {
            return this.messageType_;
        }

        public InterfaceC9173c getMessageTypeOrBuilder(int i) {
            return this.messageType_.get(i);
        }

        public List<? extends InterfaceC9173c> getMessageTypeOrBuilderList() {
            return this.messageType_;
        }

        @Override // p000.m74.InterfaceC9204s
        public String getName() {
            return this.name_;
        }

        @Override // p000.m74.InterfaceC9204s
        public vj1 getNameBytes() {
            return vj1.copyFromUtf8(this.name_);
        }

        @Override // p000.m74.InterfaceC9204s
        public C9207v getOptions() {
            C9207v c9207v = this.options_;
            return c9207v == null ? C9207v.getDefaultInstance() : c9207v;
        }

        @Override // p000.m74.InterfaceC9204s
        public String getPackage() {
            return this.package_;
        }

        @Override // p000.m74.InterfaceC9204s
        public vj1 getPackageBytes() {
            return vj1.copyFromUtf8(this.package_);
        }

        @Override // p000.m74.InterfaceC9204s
        public int getPublicDependency(int i) {
            return this.publicDependency_.getInt(i);
        }

        @Override // p000.m74.InterfaceC9204s
        public int getPublicDependencyCount() {
            return this.publicDependency_.size();
        }

        @Override // p000.m74.InterfaceC9204s
        public List<Integer> getPublicDependencyList() {
            return this.publicDependency_;
        }

        @Override // p000.m74.InterfaceC9204s
        public C9188j0 getService(int i) {
            return this.service_.get(i);
        }

        @Override // p000.m74.InterfaceC9204s
        public int getServiceCount() {
            return this.service_.size();
        }

        @Override // p000.m74.InterfaceC9204s
        public List<C9188j0> getServiceList() {
            return this.service_;
        }

        public InterfaceC9190k0 getServiceOrBuilder(int i) {
            return this.service_.get(i);
        }

        public List<? extends InterfaceC9190k0> getServiceOrBuilderList() {
            return this.service_;
        }

        @Override // p000.m74.InterfaceC9204s
        public C9196n0 getSourceCodeInfo() {
            C9196n0 c9196n0 = this.sourceCodeInfo_;
            return c9196n0 == null ? C9196n0.getDefaultInstance() : c9196n0;
        }

        @Override // p000.m74.InterfaceC9204s
        public String getSyntax() {
            return this.syntax_;
        }

        @Override // p000.m74.InterfaceC9204s
        public vj1 getSyntaxBytes() {
            return vj1.copyFromUtf8(this.syntax_);
        }

        @Override // p000.m74.InterfaceC9204s
        public int getWeakDependency(int i) {
            return this.weakDependency_.getInt(i);
        }

        @Override // p000.m74.InterfaceC9204s
        public int getWeakDependencyCount() {
            return this.weakDependency_.size();
        }

        @Override // p000.m74.InterfaceC9204s
        public List<Integer> getWeakDependencyList() {
            return this.weakDependency_;
        }

        @Override // p000.m74.InterfaceC9204s
        public boolean hasName() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // p000.m74.InterfaceC9204s
        public boolean hasOptions() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // p000.m74.InterfaceC9204s
        public boolean hasPackage() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // p000.m74.InterfaceC9204s
        public boolean hasSourceCodeInfo() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // p000.m74.InterfaceC9204s
        public boolean hasSyntax() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // p000.v27
        /* JADX INFO: renamed from: r */
        public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
            C9169a c9169a = null;
            switch (C9169a.f60048a[enumC13830i.ordinal()]) {
                case 1:
                    return new C9203r();
                case 2:
                    return new a(c9169a);
                case 3:
                    return v27.m23699Q(DEFAULT_INSTANCE, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0007\u0005\u0001ဈ\u0000\u0002ဈ\u0001\u0003\u001a\u0004Л\u0005Л\u0006Л\u0007Л\bᐉ\u0002\tဉ\u0003\n\u0016\u000b\u0016\fဈ\u0004", new Object[]{"bitField0_", "name_", "package_", "dependency_", "messageType_", C9171b.class, "enumType_", C9175d.class, "service_", C9188j0.class, "extension_", C9195n.class, "options_", "sourceCodeInfo_", "publicDependency_", "weakDependency_", "syntax_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    uhc<C9203r> c13824c = PARSER;
                    if (c13824c == null) {
                        synchronized (C9203r.class) {
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
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    this.memoizedIsInitialized = (byte) (obj == null ? 0 : 1);
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public static a newBuilder(C9203r c9203r) {
            return DEFAULT_INSTANCE.m23739o(c9203r);
        }

        public static C9203r parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
            return (C9203r) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
        }

        public static C9203r parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
            return (C9203r) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
        }

        public static C9203r parseFrom(vj1 vj1Var) throws ce8 {
            return (C9203r) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addEnumType(int i, C9175d c9175d) {
            c9175d.getClass();
            ensureEnumTypeIsMutable();
            this.enumType_.add(i, c9175d);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addExtension(int i, C9195n c9195n) {
            c9195n.getClass();
            ensureExtensionIsMutable();
            this.extension_.add(i, c9195n);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addMessageType(int i, C9171b c9171b) {
            c9171b.getClass();
            ensureMessageTypeIsMutable();
            this.messageType_.add(i, c9171b);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addService(int i, C9188j0 c9188j0) {
            c9188j0.getClass();
            ensureServiceIsMutable();
            this.service_.add(i, c9188j0);
        }

        public static C9203r parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
            return (C9203r) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
        }

        public static C9203r parseFrom(byte[] bArr) throws ce8 {
            return (C9203r) v27.m23710c0(DEFAULT_INSTANCE, bArr);
        }

        public static C9203r parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
            return (C9203r) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
        }

        public static C9203r parseFrom(InputStream inputStream) throws IOException {
            return (C9203r) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
        }

        public static C9203r parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
            return (C9203r) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
        }

        public static C9203r parseFrom(f72 f72Var) throws IOException {
            return (C9203r) v27.m23704W(DEFAULT_INSTANCE, f72Var);
        }

        public static C9203r parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
            return (C9203r) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
        }
    }

    /* JADX INFO: renamed from: m74$s */
    public interface InterfaceC9204s extends rsa {
        String getDependency(int i);

        vj1 getDependencyBytes(int i);

        int getDependencyCount();

        List<String> getDependencyList();

        C9175d getEnumType(int i);

        int getEnumTypeCount();

        List<C9175d> getEnumTypeList();

        C9195n getExtension(int i);

        int getExtensionCount();

        List<C9195n> getExtensionList();

        C9171b getMessageType(int i);

        int getMessageTypeCount();

        List<C9171b> getMessageTypeList();

        String getName();

        vj1 getNameBytes();

        C9207v getOptions();

        String getPackage();

        vj1 getPackageBytes();

        int getPublicDependency(int i);

        int getPublicDependencyCount();

        List<Integer> getPublicDependencyList();

        C9188j0 getService(int i);

        int getServiceCount();

        List<C9188j0> getServiceList();

        C9196n0 getSourceCodeInfo();

        String getSyntax();

        vj1 getSyntaxBytes();

        int getWeakDependency(int i);

        int getWeakDependencyCount();

        List<Integer> getWeakDependencyList();

        boolean hasName();

        boolean hasOptions();

        boolean hasPackage();

        boolean hasSourceCodeInfo();

        boolean hasSyntax();
    }

    /* JADX INFO: renamed from: m74$t */
    public static final class C9205t extends v27<C9205t, a> implements InterfaceC9206u {
        private static final C9205t DEFAULT_INSTANCE;
        public static final int FILE_FIELD_NUMBER = 1;
        private static volatile uhc<C9205t> PARSER;
        private byte memoizedIsInitialized = 2;
        private w98.InterfaceC14504k<C9203r> file_ = v27.m23722x();

        /* JADX INFO: renamed from: m74$t$a */
        public static final class a extends v27.AbstractC13823b<C9205t, a> implements InterfaceC9206u {
            public /* synthetic */ a(C9169a c9169a) {
                this();
            }

            public a addAllFile(Iterable<? extends C9203r> iterable) {
                m23743e();
                ((C9205t) this.f89756b).addAllFile(iterable);
                return this;
            }

            public a addFile(C9203r c9203r) {
                m23743e();
                ((C9205t) this.f89756b).addFile(c9203r);
                return this;
            }

            public a clearFile() {
                m23743e();
                ((C9205t) this.f89756b).clearFile();
                return this;
            }

            @Override // p000.m74.InterfaceC9206u
            public C9203r getFile(int i) {
                return ((C9205t) this.f89756b).getFile(i);
            }

            @Override // p000.m74.InterfaceC9206u
            public int getFileCount() {
                return ((C9205t) this.f89756b).getFileCount();
            }

            @Override // p000.m74.InterfaceC9206u
            public List<C9203r> getFileList() {
                return Collections.unmodifiableList(((C9205t) this.f89756b).getFileList());
            }

            public a removeFile(int i) {
                m23743e();
                ((C9205t) this.f89756b).removeFile(i);
                return this;
            }

            public a setFile(int i, C9203r c9203r) {
                m23743e();
                ((C9205t) this.f89756b).setFile(i, c9203r);
                return this;
            }

            private a() {
                super(C9205t.DEFAULT_INSTANCE);
            }

            public a addFile(int i, C9203r c9203r) {
                m23743e();
                ((C9205t) this.f89756b).addFile(i, c9203r);
                return this;
            }

            public a setFile(int i, C9203r.a aVar) {
                m23743e();
                ((C9205t) this.f89756b).setFile(i, aVar.build());
                return this;
            }

            public a addFile(C9203r.a aVar) {
                m23743e();
                ((C9205t) this.f89756b).addFile(aVar.build());
                return this;
            }

            public a addFile(int i, C9203r.a aVar) {
                m23743e();
                ((C9205t) this.f89756b).addFile(i, aVar.build());
                return this;
            }
        }

        static {
            C9205t c9205t = new C9205t();
            DEFAULT_INSTANCE = c9205t;
            v27.m23715h0(C9205t.class, c9205t);
        }

        private C9205t() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllFile(Iterable<? extends C9203r> iterable) {
            ensureFileIsMutable();
            AbstractC1714b3.m2856b(iterable, this.file_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addFile(C9203r c9203r) {
            c9203r.getClass();
            ensureFileIsMutable();
            this.file_.add(c9203r);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFile() {
            this.file_ = v27.m23722x();
        }

        private void ensureFileIsMutable() {
            w98.InterfaceC14504k<C9203r> interfaceC14504k = this.file_;
            if (interfaceC14504k.isModifiable()) {
                return;
            }
            this.file_ = v27.m23698P(interfaceC14504k);
        }

        public static C9205t getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.m23738n();
        }

        public static C9205t parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (C9205t) v27.m23700S(DEFAULT_INSTANCE, inputStream);
        }

        public static C9205t parseFrom(ByteBuffer byteBuffer) throws ce8 {
            return (C9205t) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
        }

        public static uhc<C9205t> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeFile(int i) {
            ensureFileIsMutable();
            this.file_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFile(int i, C9203r c9203r) {
            c9203r.getClass();
            ensureFileIsMutable();
            this.file_.set(i, c9203r);
        }

        @Override // p000.m74.InterfaceC9206u
        public C9203r getFile(int i) {
            return this.file_.get(i);
        }

        @Override // p000.m74.InterfaceC9206u
        public int getFileCount() {
            return this.file_.size();
        }

        @Override // p000.m74.InterfaceC9206u
        public List<C9203r> getFileList() {
            return this.file_;
        }

        public InterfaceC9204s getFileOrBuilder(int i) {
            return this.file_.get(i);
        }

        public List<? extends InterfaceC9204s> getFileOrBuilderList() {
            return this.file_;
        }

        @Override // p000.v27
        /* JADX INFO: renamed from: r */
        public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
            C9169a c9169a = null;
            switch (C9169a.f60048a[enumC13830i.ordinal()]) {
                case 1:
                    return new C9205t();
                case 2:
                    return new a(c9169a);
                case 3:
                    return v27.m23699Q(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"file_", C9203r.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    uhc<C9205t> c13824c = PARSER;
                    if (c13824c == null) {
                        synchronized (C9205t.class) {
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
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    this.memoizedIsInitialized = (byte) (obj == null ? 0 : 1);
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public static a newBuilder(C9205t c9205t) {
            return DEFAULT_INSTANCE.m23739o(c9205t);
        }

        public static C9205t parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
            return (C9205t) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
        }

        public static C9205t parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
            return (C9205t) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
        }

        public static C9205t parseFrom(vj1 vj1Var) throws ce8 {
            return (C9205t) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addFile(int i, C9203r c9203r) {
            c9203r.getClass();
            ensureFileIsMutable();
            this.file_.add(i, c9203r);
        }

        public static C9205t parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
            return (C9205t) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
        }

        public static C9205t parseFrom(byte[] bArr) throws ce8 {
            return (C9205t) v27.m23710c0(DEFAULT_INSTANCE, bArr);
        }

        public static C9205t parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
            return (C9205t) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
        }

        public static C9205t parseFrom(InputStream inputStream) throws IOException {
            return (C9205t) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
        }

        public static C9205t parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
            return (C9205t) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
        }

        public static C9205t parseFrom(f72 f72Var) throws IOException {
            return (C9205t) v27.m23704W(DEFAULT_INSTANCE, f72Var);
        }

        public static C9205t parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
            return (C9205t) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
        }
    }

    /* JADX INFO: renamed from: m74$u */
    public interface InterfaceC9206u extends rsa {
        C9203r getFile(int i);

        int getFileCount();

        List<C9203r> getFileList();
    }

    /* JADX INFO: renamed from: m74$v */
    public static final class C9207v extends v27.AbstractC13826e<C9207v, a> implements InterfaceC9208w {
        public static final int CC_ENABLE_ARENAS_FIELD_NUMBER = 31;
        public static final int CC_GENERIC_SERVICES_FIELD_NUMBER = 16;
        public static final int CSHARP_NAMESPACE_FIELD_NUMBER = 37;
        private static final C9207v DEFAULT_INSTANCE;
        public static final int DEPRECATED_FIELD_NUMBER = 23;
        public static final int GO_PACKAGE_FIELD_NUMBER = 11;
        public static final int JAVA_GENERATE_EQUALS_AND_HASH_FIELD_NUMBER = 20;
        public static final int JAVA_GENERIC_SERVICES_FIELD_NUMBER = 17;
        public static final int JAVA_MULTIPLE_FILES_FIELD_NUMBER = 10;
        public static final int JAVA_OUTER_CLASSNAME_FIELD_NUMBER = 8;
        public static final int JAVA_PACKAGE_FIELD_NUMBER = 1;
        public static final int JAVA_STRING_CHECK_UTF8_FIELD_NUMBER = 27;
        public static final int OBJC_CLASS_PREFIX_FIELD_NUMBER = 36;
        public static final int OPTIMIZE_FOR_FIELD_NUMBER = 9;
        private static volatile uhc<C9207v> PARSER = null;
        public static final int PHP_CLASS_PREFIX_FIELD_NUMBER = 40;
        public static final int PHP_GENERIC_SERVICES_FIELD_NUMBER = 42;
        public static final int PHP_METADATA_NAMESPACE_FIELD_NUMBER = 44;
        public static final int PHP_NAMESPACE_FIELD_NUMBER = 41;
        public static final int PY_GENERIC_SERVICES_FIELD_NUMBER = 18;
        public static final int RUBY_PACKAGE_FIELD_NUMBER = 45;
        public static final int SWIFT_PREFIX_FIELD_NUMBER = 39;
        public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
        private int bitField0_;
        private boolean ccGenericServices_;
        private boolean deprecated_;
        private boolean javaGenerateEqualsAndHash_;
        private boolean javaGenericServices_;
        private boolean javaMultipleFiles_;
        private boolean javaStringCheckUtf8_;
        private boolean phpGenericServices_;
        private boolean pyGenericServices_;
        private byte memoizedIsInitialized = 2;
        private String javaPackage_ = "";
        private String javaOuterClassname_ = "";
        private int optimizeFor_ = 1;
        private String goPackage_ = "";
        private boolean ccEnableArenas_ = true;
        private String objcClassPrefix_ = "";
        private String csharpNamespace_ = "";
        private String swiftPrefix_ = "";
        private String phpClassPrefix_ = "";
        private String phpNamespace_ = "";
        private String phpMetadataNamespace_ = "";
        private String rubyPackage_ = "";
        private w98.InterfaceC14504k<C9200p0> uninterpretedOption_ = v27.m23722x();

        /* JADX INFO: renamed from: m74$v$a */
        public static final class a extends v27.AbstractC13825d<C9207v, a> implements InterfaceC9208w {
            public /* synthetic */ a(C9169a c9169a) {
                this();
            }

            public a addAllUninterpretedOption(Iterable<? extends C9200p0> iterable) {
                m23743e();
                ((C9207v) this.f89756b).addAllUninterpretedOption(iterable);
                return this;
            }

            public a addUninterpretedOption(C9200p0 c9200p0) {
                m23743e();
                ((C9207v) this.f89756b).addUninterpretedOption(c9200p0);
                return this;
            }

            public a clearCcEnableArenas() {
                m23743e();
                ((C9207v) this.f89756b).clearCcEnableArenas();
                return this;
            }

            public a clearCcGenericServices() {
                m23743e();
                ((C9207v) this.f89756b).clearCcGenericServices();
                return this;
            }

            public a clearCsharpNamespace() {
                m23743e();
                ((C9207v) this.f89756b).clearCsharpNamespace();
                return this;
            }

            public a clearDeprecated() {
                m23743e();
                ((C9207v) this.f89756b).clearDeprecated();
                return this;
            }

            public a clearGoPackage() {
                m23743e();
                ((C9207v) this.f89756b).clearGoPackage();
                return this;
            }

            @Deprecated
            public a clearJavaGenerateEqualsAndHash() {
                m23743e();
                ((C9207v) this.f89756b).clearJavaGenerateEqualsAndHash();
                return this;
            }

            public a clearJavaGenericServices() {
                m23743e();
                ((C9207v) this.f89756b).clearJavaGenericServices();
                return this;
            }

            public a clearJavaMultipleFiles() {
                m23743e();
                ((C9207v) this.f89756b).clearJavaMultipleFiles();
                return this;
            }

            public a clearJavaOuterClassname() {
                m23743e();
                ((C9207v) this.f89756b).clearJavaOuterClassname();
                return this;
            }

            public a clearJavaPackage() {
                m23743e();
                ((C9207v) this.f89756b).clearJavaPackage();
                return this;
            }

            public a clearJavaStringCheckUtf8() {
                m23743e();
                ((C9207v) this.f89756b).clearJavaStringCheckUtf8();
                return this;
            }

            public a clearObjcClassPrefix() {
                m23743e();
                ((C9207v) this.f89756b).clearObjcClassPrefix();
                return this;
            }

            public a clearOptimizeFor() {
                m23743e();
                ((C9207v) this.f89756b).clearOptimizeFor();
                return this;
            }

            public a clearPhpClassPrefix() {
                m23743e();
                ((C9207v) this.f89756b).clearPhpClassPrefix();
                return this;
            }

            public a clearPhpGenericServices() {
                m23743e();
                ((C9207v) this.f89756b).clearPhpGenericServices();
                return this;
            }

            public a clearPhpMetadataNamespace() {
                m23743e();
                ((C9207v) this.f89756b).clearPhpMetadataNamespace();
                return this;
            }

            public a clearPhpNamespace() {
                m23743e();
                ((C9207v) this.f89756b).clearPhpNamespace();
                return this;
            }

            public a clearPyGenericServices() {
                m23743e();
                ((C9207v) this.f89756b).clearPyGenericServices();
                return this;
            }

            public a clearRubyPackage() {
                m23743e();
                ((C9207v) this.f89756b).clearRubyPackage();
                return this;
            }

            public a clearSwiftPrefix() {
                m23743e();
                ((C9207v) this.f89756b).clearSwiftPrefix();
                return this;
            }

            public a clearUninterpretedOption() {
                m23743e();
                ((C9207v) this.f89756b).clearUninterpretedOption();
                return this;
            }

            @Override // p000.m74.InterfaceC9208w
            public boolean getCcEnableArenas() {
                return ((C9207v) this.f89756b).getCcEnableArenas();
            }

            @Override // p000.m74.InterfaceC9208w
            public boolean getCcGenericServices() {
                return ((C9207v) this.f89756b).getCcGenericServices();
            }

            @Override // p000.m74.InterfaceC9208w
            public String getCsharpNamespace() {
                return ((C9207v) this.f89756b).getCsharpNamespace();
            }

            @Override // p000.m74.InterfaceC9208w
            public vj1 getCsharpNamespaceBytes() {
                return ((C9207v) this.f89756b).getCsharpNamespaceBytes();
            }

            @Override // p000.m74.InterfaceC9208w
            public boolean getDeprecated() {
                return ((C9207v) this.f89756b).getDeprecated();
            }

            @Override // p000.m74.InterfaceC9208w
            public String getGoPackage() {
                return ((C9207v) this.f89756b).getGoPackage();
            }

            @Override // p000.m74.InterfaceC9208w
            public vj1 getGoPackageBytes() {
                return ((C9207v) this.f89756b).getGoPackageBytes();
            }

            @Override // p000.m74.InterfaceC9208w
            @Deprecated
            public boolean getJavaGenerateEqualsAndHash() {
                return ((C9207v) this.f89756b).getJavaGenerateEqualsAndHash();
            }

            @Override // p000.m74.InterfaceC9208w
            public boolean getJavaGenericServices() {
                return ((C9207v) this.f89756b).getJavaGenericServices();
            }

            @Override // p000.m74.InterfaceC9208w
            public boolean getJavaMultipleFiles() {
                return ((C9207v) this.f89756b).getJavaMultipleFiles();
            }

            @Override // p000.m74.InterfaceC9208w
            public String getJavaOuterClassname() {
                return ((C9207v) this.f89756b).getJavaOuterClassname();
            }

            @Override // p000.m74.InterfaceC9208w
            public vj1 getJavaOuterClassnameBytes() {
                return ((C9207v) this.f89756b).getJavaOuterClassnameBytes();
            }

            @Override // p000.m74.InterfaceC9208w
            public String getJavaPackage() {
                return ((C9207v) this.f89756b).getJavaPackage();
            }

            @Override // p000.m74.InterfaceC9208w
            public vj1 getJavaPackageBytes() {
                return ((C9207v) this.f89756b).getJavaPackageBytes();
            }

            @Override // p000.m74.InterfaceC9208w
            public boolean getJavaStringCheckUtf8() {
                return ((C9207v) this.f89756b).getJavaStringCheckUtf8();
            }

            @Override // p000.m74.InterfaceC9208w
            public String getObjcClassPrefix() {
                return ((C9207v) this.f89756b).getObjcClassPrefix();
            }

            @Override // p000.m74.InterfaceC9208w
            public vj1 getObjcClassPrefixBytes() {
                return ((C9207v) this.f89756b).getObjcClassPrefixBytes();
            }

            @Override // p000.m74.InterfaceC9208w
            public b getOptimizeFor() {
                return ((C9207v) this.f89756b).getOptimizeFor();
            }

            @Override // p000.m74.InterfaceC9208w
            public String getPhpClassPrefix() {
                return ((C9207v) this.f89756b).getPhpClassPrefix();
            }

            @Override // p000.m74.InterfaceC9208w
            public vj1 getPhpClassPrefixBytes() {
                return ((C9207v) this.f89756b).getPhpClassPrefixBytes();
            }

            @Override // p000.m74.InterfaceC9208w
            public boolean getPhpGenericServices() {
                return ((C9207v) this.f89756b).getPhpGenericServices();
            }

            @Override // p000.m74.InterfaceC9208w
            public String getPhpMetadataNamespace() {
                return ((C9207v) this.f89756b).getPhpMetadataNamespace();
            }

            @Override // p000.m74.InterfaceC9208w
            public vj1 getPhpMetadataNamespaceBytes() {
                return ((C9207v) this.f89756b).getPhpMetadataNamespaceBytes();
            }

            @Override // p000.m74.InterfaceC9208w
            public String getPhpNamespace() {
                return ((C9207v) this.f89756b).getPhpNamespace();
            }

            @Override // p000.m74.InterfaceC9208w
            public vj1 getPhpNamespaceBytes() {
                return ((C9207v) this.f89756b).getPhpNamespaceBytes();
            }

            @Override // p000.m74.InterfaceC9208w
            public boolean getPyGenericServices() {
                return ((C9207v) this.f89756b).getPyGenericServices();
            }

            @Override // p000.m74.InterfaceC9208w
            public String getRubyPackage() {
                return ((C9207v) this.f89756b).getRubyPackage();
            }

            @Override // p000.m74.InterfaceC9208w
            public vj1 getRubyPackageBytes() {
                return ((C9207v) this.f89756b).getRubyPackageBytes();
            }

            @Override // p000.m74.InterfaceC9208w
            public String getSwiftPrefix() {
                return ((C9207v) this.f89756b).getSwiftPrefix();
            }

            @Override // p000.m74.InterfaceC9208w
            public vj1 getSwiftPrefixBytes() {
                return ((C9207v) this.f89756b).getSwiftPrefixBytes();
            }

            @Override // p000.m74.InterfaceC9208w
            public C9200p0 getUninterpretedOption(int i) {
                return ((C9207v) this.f89756b).getUninterpretedOption(i);
            }

            @Override // p000.m74.InterfaceC9208w
            public int getUninterpretedOptionCount() {
                return ((C9207v) this.f89756b).getUninterpretedOptionCount();
            }

            @Override // p000.m74.InterfaceC9208w
            public List<C9200p0> getUninterpretedOptionList() {
                return Collections.unmodifiableList(((C9207v) this.f89756b).getUninterpretedOptionList());
            }

            @Override // p000.m74.InterfaceC9208w
            public boolean hasCcEnableArenas() {
                return ((C9207v) this.f89756b).hasCcEnableArenas();
            }

            @Override // p000.m74.InterfaceC9208w
            public boolean hasCcGenericServices() {
                return ((C9207v) this.f89756b).hasCcGenericServices();
            }

            @Override // p000.m74.InterfaceC9208w
            public boolean hasCsharpNamespace() {
                return ((C9207v) this.f89756b).hasCsharpNamespace();
            }

            @Override // p000.m74.InterfaceC9208w
            public boolean hasDeprecated() {
                return ((C9207v) this.f89756b).hasDeprecated();
            }

            @Override // p000.m74.InterfaceC9208w
            public boolean hasGoPackage() {
                return ((C9207v) this.f89756b).hasGoPackage();
            }

            @Override // p000.m74.InterfaceC9208w
            @Deprecated
            public boolean hasJavaGenerateEqualsAndHash() {
                return ((C9207v) this.f89756b).hasJavaGenerateEqualsAndHash();
            }

            @Override // p000.m74.InterfaceC9208w
            public boolean hasJavaGenericServices() {
                return ((C9207v) this.f89756b).hasJavaGenericServices();
            }

            @Override // p000.m74.InterfaceC9208w
            public boolean hasJavaMultipleFiles() {
                return ((C9207v) this.f89756b).hasJavaMultipleFiles();
            }

            @Override // p000.m74.InterfaceC9208w
            public boolean hasJavaOuterClassname() {
                return ((C9207v) this.f89756b).hasJavaOuterClassname();
            }

            @Override // p000.m74.InterfaceC9208w
            public boolean hasJavaPackage() {
                return ((C9207v) this.f89756b).hasJavaPackage();
            }

            @Override // p000.m74.InterfaceC9208w
            public boolean hasJavaStringCheckUtf8() {
                return ((C9207v) this.f89756b).hasJavaStringCheckUtf8();
            }

            @Override // p000.m74.InterfaceC9208w
            public boolean hasObjcClassPrefix() {
                return ((C9207v) this.f89756b).hasObjcClassPrefix();
            }

            @Override // p000.m74.InterfaceC9208w
            public boolean hasOptimizeFor() {
                return ((C9207v) this.f89756b).hasOptimizeFor();
            }

            @Override // p000.m74.InterfaceC9208w
            public boolean hasPhpClassPrefix() {
                return ((C9207v) this.f89756b).hasPhpClassPrefix();
            }

            @Override // p000.m74.InterfaceC9208w
            public boolean hasPhpGenericServices() {
                return ((C9207v) this.f89756b).hasPhpGenericServices();
            }

            @Override // p000.m74.InterfaceC9208w
            public boolean hasPhpMetadataNamespace() {
                return ((C9207v) this.f89756b).hasPhpMetadataNamespace();
            }

            @Override // p000.m74.InterfaceC9208w
            public boolean hasPhpNamespace() {
                return ((C9207v) this.f89756b).hasPhpNamespace();
            }

            @Override // p000.m74.InterfaceC9208w
            public boolean hasPyGenericServices() {
                return ((C9207v) this.f89756b).hasPyGenericServices();
            }

            @Override // p000.m74.InterfaceC9208w
            public boolean hasRubyPackage() {
                return ((C9207v) this.f89756b).hasRubyPackage();
            }

            @Override // p000.m74.InterfaceC9208w
            public boolean hasSwiftPrefix() {
                return ((C9207v) this.f89756b).hasSwiftPrefix();
            }

            public a removeUninterpretedOption(int i) {
                m23743e();
                ((C9207v) this.f89756b).removeUninterpretedOption(i);
                return this;
            }

            public a setCcEnableArenas(boolean z) {
                m23743e();
                ((C9207v) this.f89756b).setCcEnableArenas(z);
                return this;
            }

            public a setCcGenericServices(boolean z) {
                m23743e();
                ((C9207v) this.f89756b).setCcGenericServices(z);
                return this;
            }

            public a setCsharpNamespace(String str) {
                m23743e();
                ((C9207v) this.f89756b).setCsharpNamespace(str);
                return this;
            }

            public a setCsharpNamespaceBytes(vj1 vj1Var) {
                m23743e();
                ((C9207v) this.f89756b).setCsharpNamespaceBytes(vj1Var);
                return this;
            }

            public a setDeprecated(boolean z) {
                m23743e();
                ((C9207v) this.f89756b).setDeprecated(z);
                return this;
            }

            public a setGoPackage(String str) {
                m23743e();
                ((C9207v) this.f89756b).setGoPackage(str);
                return this;
            }

            public a setGoPackageBytes(vj1 vj1Var) {
                m23743e();
                ((C9207v) this.f89756b).setGoPackageBytes(vj1Var);
                return this;
            }

            @Deprecated
            public a setJavaGenerateEqualsAndHash(boolean z) {
                m23743e();
                ((C9207v) this.f89756b).setJavaGenerateEqualsAndHash(z);
                return this;
            }

            public a setJavaGenericServices(boolean z) {
                m23743e();
                ((C9207v) this.f89756b).setJavaGenericServices(z);
                return this;
            }

            public a setJavaMultipleFiles(boolean z) {
                m23743e();
                ((C9207v) this.f89756b).setJavaMultipleFiles(z);
                return this;
            }

            public a setJavaOuterClassname(String str) {
                m23743e();
                ((C9207v) this.f89756b).setJavaOuterClassname(str);
                return this;
            }

            public a setJavaOuterClassnameBytes(vj1 vj1Var) {
                m23743e();
                ((C9207v) this.f89756b).setJavaOuterClassnameBytes(vj1Var);
                return this;
            }

            public a setJavaPackage(String str) {
                m23743e();
                ((C9207v) this.f89756b).setJavaPackage(str);
                return this;
            }

            public a setJavaPackageBytes(vj1 vj1Var) {
                m23743e();
                ((C9207v) this.f89756b).setJavaPackageBytes(vj1Var);
                return this;
            }

            public a setJavaStringCheckUtf8(boolean z) {
                m23743e();
                ((C9207v) this.f89756b).setJavaStringCheckUtf8(z);
                return this;
            }

            public a setObjcClassPrefix(String str) {
                m23743e();
                ((C9207v) this.f89756b).setObjcClassPrefix(str);
                return this;
            }

            public a setObjcClassPrefixBytes(vj1 vj1Var) {
                m23743e();
                ((C9207v) this.f89756b).setObjcClassPrefixBytes(vj1Var);
                return this;
            }

            public a setOptimizeFor(b bVar) {
                m23743e();
                ((C9207v) this.f89756b).setOptimizeFor(bVar);
                return this;
            }

            public a setPhpClassPrefix(String str) {
                m23743e();
                ((C9207v) this.f89756b).setPhpClassPrefix(str);
                return this;
            }

            public a setPhpClassPrefixBytes(vj1 vj1Var) {
                m23743e();
                ((C9207v) this.f89756b).setPhpClassPrefixBytes(vj1Var);
                return this;
            }

            public a setPhpGenericServices(boolean z) {
                m23743e();
                ((C9207v) this.f89756b).setPhpGenericServices(z);
                return this;
            }

            public a setPhpMetadataNamespace(String str) {
                m23743e();
                ((C9207v) this.f89756b).setPhpMetadataNamespace(str);
                return this;
            }

            public a setPhpMetadataNamespaceBytes(vj1 vj1Var) {
                m23743e();
                ((C9207v) this.f89756b).setPhpMetadataNamespaceBytes(vj1Var);
                return this;
            }

            public a setPhpNamespace(String str) {
                m23743e();
                ((C9207v) this.f89756b).setPhpNamespace(str);
                return this;
            }

            public a setPhpNamespaceBytes(vj1 vj1Var) {
                m23743e();
                ((C9207v) this.f89756b).setPhpNamespaceBytes(vj1Var);
                return this;
            }

            public a setPyGenericServices(boolean z) {
                m23743e();
                ((C9207v) this.f89756b).setPyGenericServices(z);
                return this;
            }

            public a setRubyPackage(String str) {
                m23743e();
                ((C9207v) this.f89756b).setRubyPackage(str);
                return this;
            }

            public a setRubyPackageBytes(vj1 vj1Var) {
                m23743e();
                ((C9207v) this.f89756b).setRubyPackageBytes(vj1Var);
                return this;
            }

            public a setSwiftPrefix(String str) {
                m23743e();
                ((C9207v) this.f89756b).setSwiftPrefix(str);
                return this;
            }

            public a setSwiftPrefixBytes(vj1 vj1Var) {
                m23743e();
                ((C9207v) this.f89756b).setSwiftPrefixBytes(vj1Var);
                return this;
            }

            public a setUninterpretedOption(int i, C9200p0 c9200p0) {
                m23743e();
                ((C9207v) this.f89756b).setUninterpretedOption(i, c9200p0);
                return this;
            }

            private a() {
                super(C9207v.DEFAULT_INSTANCE);
            }

            public a addUninterpretedOption(int i, C9200p0 c9200p0) {
                m23743e();
                ((C9207v) this.f89756b).addUninterpretedOption(i, c9200p0);
                return this;
            }

            public a setUninterpretedOption(int i, C9200p0.a aVar) {
                m23743e();
                ((C9207v) this.f89756b).setUninterpretedOption(i, aVar.build());
                return this;
            }

            public a addUninterpretedOption(C9200p0.a aVar) {
                m23743e();
                ((C9207v) this.f89756b).addUninterpretedOption(aVar.build());
                return this;
            }

            public a addUninterpretedOption(int i, C9200p0.a aVar) {
                m23743e();
                ((C9207v) this.f89756b).addUninterpretedOption(i, aVar.build());
                return this;
            }
        }

        /* JADX INFO: renamed from: m74$v$b */
        public enum b implements w98.InterfaceC14497d {
            SPEED(1),
            CODE_SIZE(2),
            LITE_RUNTIME(3);


            /* JADX INFO: renamed from: C */
            public static final w98.InterfaceC14498e<b> f60129C = new a();

            /* JADX INFO: renamed from: e */
            public static final int f60134e = 1;

            /* JADX INFO: renamed from: f */
            public static final int f60135f = 2;

            /* JADX INFO: renamed from: m */
            public static final int f60136m = 3;

            /* JADX INFO: renamed from: a */
            public final int f60137a;

            /* JADX INFO: renamed from: m74$v$b$a */
            public class a implements w98.InterfaceC14498e<b> {
                @Override // p000.w98.InterfaceC14498e
                public b findValueByNumber(int i) {
                    return b.forNumber(i);
                }
            }

            /* JADX INFO: renamed from: m74$v$b$b, reason: collision with other inner class name */
            public static final class C16483b implements w98.InterfaceC14499f {

                /* JADX INFO: renamed from: a */
                public static final w98.InterfaceC14499f f60138a = new C16483b();

                private C16483b() {
                }

                @Override // p000.w98.InterfaceC14499f
                public boolean isInRange(int i) {
                    return b.forNumber(i) != null;
                }
            }

            b(int i) {
                this.f60137a = i;
            }

            public static b forNumber(int i) {
                if (i == 1) {
                    return SPEED;
                }
                if (i == 2) {
                    return CODE_SIZE;
                }
                if (i != 3) {
                    return null;
                }
                return LITE_RUNTIME;
            }

            public static w98.InterfaceC14498e<b> internalGetValueMap() {
                return f60129C;
            }

            public static w98.InterfaceC14499f internalGetVerifier() {
                return C16483b.f60138a;
            }

            @Override // p000.w98.InterfaceC14497d
            public final int getNumber() {
                return this.f60137a;
            }

            @Deprecated
            public static b valueOf(int i) {
                return forNumber(i);
            }
        }

        static {
            C9207v c9207v = new C9207v();
            DEFAULT_INSTANCE = c9207v;
            v27.m23715h0(C9207v.class, c9207v);
        }

        private C9207v() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllUninterpretedOption(Iterable<? extends C9200p0> iterable) {
            ensureUninterpretedOptionIsMutable();
            AbstractC1714b3.m2856b(iterable, this.uninterpretedOption_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addUninterpretedOption(C9200p0 c9200p0) {
            c9200p0.getClass();
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.add(c9200p0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCcEnableArenas() {
            this.bitField0_ &= -4097;
            this.ccEnableArenas_ = true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCcGenericServices() {
            this.bitField0_ &= -129;
            this.ccGenericServices_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCsharpNamespace() {
            this.bitField0_ &= -16385;
            this.csharpNamespace_ = getDefaultInstance().getCsharpNamespace();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDeprecated() {
            this.bitField0_ &= -2049;
            this.deprecated_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGoPackage() {
            this.bitField0_ &= -65;
            this.goPackage_ = getDefaultInstance().getGoPackage();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearJavaGenerateEqualsAndHash() {
            this.bitField0_ &= -9;
            this.javaGenerateEqualsAndHash_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearJavaGenericServices() {
            this.bitField0_ &= -257;
            this.javaGenericServices_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearJavaMultipleFiles() {
            this.bitField0_ &= -5;
            this.javaMultipleFiles_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearJavaOuterClassname() {
            this.bitField0_ &= -3;
            this.javaOuterClassname_ = getDefaultInstance().getJavaOuterClassname();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearJavaPackage() {
            this.bitField0_ &= -2;
            this.javaPackage_ = getDefaultInstance().getJavaPackage();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearJavaStringCheckUtf8() {
            this.bitField0_ &= -17;
            this.javaStringCheckUtf8_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearObjcClassPrefix() {
            this.bitField0_ &= -8193;
            this.objcClassPrefix_ = getDefaultInstance().getObjcClassPrefix();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOptimizeFor() {
            this.bitField0_ &= -33;
            this.optimizeFor_ = 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPhpClassPrefix() {
            this.bitField0_ &= -65537;
            this.phpClassPrefix_ = getDefaultInstance().getPhpClassPrefix();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPhpGenericServices() {
            this.bitField0_ &= -1025;
            this.phpGenericServices_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPhpMetadataNamespace() {
            this.bitField0_ &= -262145;
            this.phpMetadataNamespace_ = getDefaultInstance().getPhpMetadataNamespace();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPhpNamespace() {
            this.bitField0_ &= -131073;
            this.phpNamespace_ = getDefaultInstance().getPhpNamespace();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPyGenericServices() {
            this.bitField0_ &= -513;
            this.pyGenericServices_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRubyPackage() {
            this.bitField0_ &= -524289;
            this.rubyPackage_ = getDefaultInstance().getRubyPackage();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSwiftPrefix() {
            this.bitField0_ &= -32769;
            this.swiftPrefix_ = getDefaultInstance().getSwiftPrefix();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUninterpretedOption() {
            this.uninterpretedOption_ = v27.m23722x();
        }

        private void ensureUninterpretedOptionIsMutable() {
            w98.InterfaceC14504k<C9200p0> interfaceC14504k = this.uninterpretedOption_;
            if (interfaceC14504k.isModifiable()) {
                return;
            }
            this.uninterpretedOption_ = v27.m23698P(interfaceC14504k);
        }

        public static C9207v getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static a newBuilder() {
            return (a) DEFAULT_INSTANCE.m23738n();
        }

        public static C9207v parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (C9207v) v27.m23700S(DEFAULT_INSTANCE, inputStream);
        }

        public static C9207v parseFrom(ByteBuffer byteBuffer) throws ce8 {
            return (C9207v) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
        }

        public static uhc<C9207v> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeUninterpretedOption(int i) {
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCcEnableArenas(boolean z) {
            this.bitField0_ |= 4096;
            this.ccEnableArenas_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCcGenericServices(boolean z) {
            this.bitField0_ |= 128;
            this.ccGenericServices_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCsharpNamespace(String str) {
            str.getClass();
            this.bitField0_ |= 16384;
            this.csharpNamespace_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCsharpNamespaceBytes(vj1 vj1Var) {
            this.csharpNamespace_ = vj1Var.toStringUtf8();
            this.bitField0_ |= 16384;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDeprecated(boolean z) {
            this.bitField0_ |= 2048;
            this.deprecated_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGoPackage(String str) {
            str.getClass();
            this.bitField0_ |= 64;
            this.goPackage_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGoPackageBytes(vj1 vj1Var) {
            this.goPackage_ = vj1Var.toStringUtf8();
            this.bitField0_ |= 64;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setJavaGenerateEqualsAndHash(boolean z) {
            this.bitField0_ |= 8;
            this.javaGenerateEqualsAndHash_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setJavaGenericServices(boolean z) {
            this.bitField0_ |= 256;
            this.javaGenericServices_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setJavaMultipleFiles(boolean z) {
            this.bitField0_ |= 4;
            this.javaMultipleFiles_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setJavaOuterClassname(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.javaOuterClassname_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setJavaOuterClassnameBytes(vj1 vj1Var) {
            this.javaOuterClassname_ = vj1Var.toStringUtf8();
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setJavaPackage(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.javaPackage_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setJavaPackageBytes(vj1 vj1Var) {
            this.javaPackage_ = vj1Var.toStringUtf8();
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setJavaStringCheckUtf8(boolean z) {
            this.bitField0_ |= 16;
            this.javaStringCheckUtf8_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setObjcClassPrefix(String str) {
            str.getClass();
            this.bitField0_ |= 8192;
            this.objcClassPrefix_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setObjcClassPrefixBytes(vj1 vj1Var) {
            this.objcClassPrefix_ = vj1Var.toStringUtf8();
            this.bitField0_ |= 8192;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOptimizeFor(b bVar) {
            this.optimizeFor_ = bVar.getNumber();
            this.bitField0_ |= 32;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPhpClassPrefix(String str) {
            str.getClass();
            this.bitField0_ |= 65536;
            this.phpClassPrefix_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPhpClassPrefixBytes(vj1 vj1Var) {
            this.phpClassPrefix_ = vj1Var.toStringUtf8();
            this.bitField0_ |= 65536;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPhpGenericServices(boolean z) {
            this.bitField0_ |= 1024;
            this.phpGenericServices_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPhpMetadataNamespace(String str) {
            str.getClass();
            this.bitField0_ |= 262144;
            this.phpMetadataNamespace_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPhpMetadataNamespaceBytes(vj1 vj1Var) {
            this.phpMetadataNamespace_ = vj1Var.toStringUtf8();
            this.bitField0_ |= 262144;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPhpNamespace(String str) {
            str.getClass();
            this.bitField0_ |= 131072;
            this.phpNamespace_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPhpNamespaceBytes(vj1 vj1Var) {
            this.phpNamespace_ = vj1Var.toStringUtf8();
            this.bitField0_ |= 131072;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPyGenericServices(boolean z) {
            this.bitField0_ |= 512;
            this.pyGenericServices_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRubyPackage(String str) {
            str.getClass();
            this.bitField0_ |= 524288;
            this.rubyPackage_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRubyPackageBytes(vj1 vj1Var) {
            this.rubyPackage_ = vj1Var.toStringUtf8();
            this.bitField0_ |= 524288;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSwiftPrefix(String str) {
            str.getClass();
            this.bitField0_ |= 32768;
            this.swiftPrefix_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSwiftPrefixBytes(vj1 vj1Var) {
            this.swiftPrefix_ = vj1Var.toStringUtf8();
            this.bitField0_ |= 32768;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUninterpretedOption(int i, C9200p0 c9200p0) {
            c9200p0.getClass();
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.set(i, c9200p0);
        }

        @Override // p000.m74.InterfaceC9208w
        public boolean getCcEnableArenas() {
            return this.ccEnableArenas_;
        }

        @Override // p000.m74.InterfaceC9208w
        public boolean getCcGenericServices() {
            return this.ccGenericServices_;
        }

        @Override // p000.m74.InterfaceC9208w
        public String getCsharpNamespace() {
            return this.csharpNamespace_;
        }

        @Override // p000.m74.InterfaceC9208w
        public vj1 getCsharpNamespaceBytes() {
            return vj1.copyFromUtf8(this.csharpNamespace_);
        }

        @Override // p000.m74.InterfaceC9208w
        public boolean getDeprecated() {
            return this.deprecated_;
        }

        @Override // p000.m74.InterfaceC9208w
        public String getGoPackage() {
            return this.goPackage_;
        }

        @Override // p000.m74.InterfaceC9208w
        public vj1 getGoPackageBytes() {
            return vj1.copyFromUtf8(this.goPackage_);
        }

        @Override // p000.m74.InterfaceC9208w
        @Deprecated
        public boolean getJavaGenerateEqualsAndHash() {
            return this.javaGenerateEqualsAndHash_;
        }

        @Override // p000.m74.InterfaceC9208w
        public boolean getJavaGenericServices() {
            return this.javaGenericServices_;
        }

        @Override // p000.m74.InterfaceC9208w
        public boolean getJavaMultipleFiles() {
            return this.javaMultipleFiles_;
        }

        @Override // p000.m74.InterfaceC9208w
        public String getJavaOuterClassname() {
            return this.javaOuterClassname_;
        }

        @Override // p000.m74.InterfaceC9208w
        public vj1 getJavaOuterClassnameBytes() {
            return vj1.copyFromUtf8(this.javaOuterClassname_);
        }

        @Override // p000.m74.InterfaceC9208w
        public String getJavaPackage() {
            return this.javaPackage_;
        }

        @Override // p000.m74.InterfaceC9208w
        public vj1 getJavaPackageBytes() {
            return vj1.copyFromUtf8(this.javaPackage_);
        }

        @Override // p000.m74.InterfaceC9208w
        public boolean getJavaStringCheckUtf8() {
            return this.javaStringCheckUtf8_;
        }

        @Override // p000.m74.InterfaceC9208w
        public String getObjcClassPrefix() {
            return this.objcClassPrefix_;
        }

        @Override // p000.m74.InterfaceC9208w
        public vj1 getObjcClassPrefixBytes() {
            return vj1.copyFromUtf8(this.objcClassPrefix_);
        }

        @Override // p000.m74.InterfaceC9208w
        public b getOptimizeFor() {
            b bVarForNumber = b.forNumber(this.optimizeFor_);
            return bVarForNumber == null ? b.SPEED : bVarForNumber;
        }

        @Override // p000.m74.InterfaceC9208w
        public String getPhpClassPrefix() {
            return this.phpClassPrefix_;
        }

        @Override // p000.m74.InterfaceC9208w
        public vj1 getPhpClassPrefixBytes() {
            return vj1.copyFromUtf8(this.phpClassPrefix_);
        }

        @Override // p000.m74.InterfaceC9208w
        public boolean getPhpGenericServices() {
            return this.phpGenericServices_;
        }

        @Override // p000.m74.InterfaceC9208w
        public String getPhpMetadataNamespace() {
            return this.phpMetadataNamespace_;
        }

        @Override // p000.m74.InterfaceC9208w
        public vj1 getPhpMetadataNamespaceBytes() {
            return vj1.copyFromUtf8(this.phpMetadataNamespace_);
        }

        @Override // p000.m74.InterfaceC9208w
        public String getPhpNamespace() {
            return this.phpNamespace_;
        }

        @Override // p000.m74.InterfaceC9208w
        public vj1 getPhpNamespaceBytes() {
            return vj1.copyFromUtf8(this.phpNamespace_);
        }

        @Override // p000.m74.InterfaceC9208w
        public boolean getPyGenericServices() {
            return this.pyGenericServices_;
        }

        @Override // p000.m74.InterfaceC9208w
        public String getRubyPackage() {
            return this.rubyPackage_;
        }

        @Override // p000.m74.InterfaceC9208w
        public vj1 getRubyPackageBytes() {
            return vj1.copyFromUtf8(this.rubyPackage_);
        }

        @Override // p000.m74.InterfaceC9208w
        public String getSwiftPrefix() {
            return this.swiftPrefix_;
        }

        @Override // p000.m74.InterfaceC9208w
        public vj1 getSwiftPrefixBytes() {
            return vj1.copyFromUtf8(this.swiftPrefix_);
        }

        @Override // p000.m74.InterfaceC9208w
        public C9200p0 getUninterpretedOption(int i) {
            return this.uninterpretedOption_.get(i);
        }

        @Override // p000.m74.InterfaceC9208w
        public int getUninterpretedOptionCount() {
            return this.uninterpretedOption_.size();
        }

        @Override // p000.m74.InterfaceC9208w
        public List<C9200p0> getUninterpretedOptionList() {
            return this.uninterpretedOption_;
        }

        public InterfaceC9202q0 getUninterpretedOptionOrBuilder(int i) {
            return this.uninterpretedOption_.get(i);
        }

        public List<? extends InterfaceC9202q0> getUninterpretedOptionOrBuilderList() {
            return this.uninterpretedOption_;
        }

        @Override // p000.m74.InterfaceC9208w
        public boolean hasCcEnableArenas() {
            return (this.bitField0_ & 4096) != 0;
        }

        @Override // p000.m74.InterfaceC9208w
        public boolean hasCcGenericServices() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // p000.m74.InterfaceC9208w
        public boolean hasCsharpNamespace() {
            return (this.bitField0_ & 16384) != 0;
        }

        @Override // p000.m74.InterfaceC9208w
        public boolean hasDeprecated() {
            return (this.bitField0_ & 2048) != 0;
        }

        @Override // p000.m74.InterfaceC9208w
        public boolean hasGoPackage() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // p000.m74.InterfaceC9208w
        @Deprecated
        public boolean hasJavaGenerateEqualsAndHash() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // p000.m74.InterfaceC9208w
        public boolean hasJavaGenericServices() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // p000.m74.InterfaceC9208w
        public boolean hasJavaMultipleFiles() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // p000.m74.InterfaceC9208w
        public boolean hasJavaOuterClassname() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // p000.m74.InterfaceC9208w
        public boolean hasJavaPackage() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // p000.m74.InterfaceC9208w
        public boolean hasJavaStringCheckUtf8() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // p000.m74.InterfaceC9208w
        public boolean hasObjcClassPrefix() {
            return (this.bitField0_ & 8192) != 0;
        }

        @Override // p000.m74.InterfaceC9208w
        public boolean hasOptimizeFor() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // p000.m74.InterfaceC9208w
        public boolean hasPhpClassPrefix() {
            return (this.bitField0_ & 65536) != 0;
        }

        @Override // p000.m74.InterfaceC9208w
        public boolean hasPhpGenericServices() {
            return (this.bitField0_ & 1024) != 0;
        }

        @Override // p000.m74.InterfaceC9208w
        public boolean hasPhpMetadataNamespace() {
            return (this.bitField0_ & 262144) != 0;
        }

        @Override // p000.m74.InterfaceC9208w
        public boolean hasPhpNamespace() {
            return (this.bitField0_ & 131072) != 0;
        }

        @Override // p000.m74.InterfaceC9208w
        public boolean hasPyGenericServices() {
            return (this.bitField0_ & 512) != 0;
        }

        @Override // p000.m74.InterfaceC9208w
        public boolean hasRubyPackage() {
            return (this.bitField0_ & 524288) != 0;
        }

        @Override // p000.m74.InterfaceC9208w
        public boolean hasSwiftPrefix() {
            return (this.bitField0_ & 32768) != 0;
        }

        @Override // p000.v27
        /* JADX INFO: renamed from: r */
        public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
            C9169a c9169a = null;
            switch (C9169a.f60048a[enumC13830i.ordinal()]) {
                case 1:
                    return new C9207v();
                case 2:
                    return new a(c9169a);
                case 3:
                    return v27.m23699Q(DEFAULT_INSTANCE, "\u0001\u0015\u0000\u0001\u0001ϧ\u0015\u0000\u0001\u0001\u0001ဈ\u0000\bဈ\u0001\t᠌\u0005\nဇ\u0002\u000bဈ\u0006\u0010ဇ\u0007\u0011ဇ\b\u0012ဇ\t\u0014ဇ\u0003\u0017ဇ\u000b\u001bဇ\u0004\u001fဇ\f$ဈ\r%ဈ\u000e'ဈ\u000f(ဈ\u0010)ဈ\u0011*ဇ\n,ဈ\u0012-ဈ\u0013ϧЛ", new Object[]{"bitField0_", "javaPackage_", "javaOuterClassname_", "optimizeFor_", b.internalGetVerifier(), "javaMultipleFiles_", "goPackage_", "ccGenericServices_", "javaGenericServices_", "pyGenericServices_", "javaGenerateEqualsAndHash_", "deprecated_", "javaStringCheckUtf8_", "ccEnableArenas_", "objcClassPrefix_", "csharpNamespace_", "swiftPrefix_", "phpClassPrefix_", "phpNamespace_", "phpGenericServices_", "phpMetadataNamespace_", "rubyPackage_", "uninterpretedOption_", C9200p0.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    uhc<C9207v> c13824c = PARSER;
                    if (c13824c == null) {
                        synchronized (C9207v.class) {
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
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    this.memoizedIsInitialized = (byte) (obj == null ? 0 : 1);
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static a newBuilder(C9207v c9207v) {
            return (a) DEFAULT_INSTANCE.m23739o(c9207v);
        }

        public static C9207v parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
            return (C9207v) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
        }

        public static C9207v parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
            return (C9207v) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
        }

        public static C9207v parseFrom(vj1 vj1Var) throws ce8 {
            return (C9207v) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addUninterpretedOption(int i, C9200p0 c9200p0) {
            c9200p0.getClass();
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.add(i, c9200p0);
        }

        public static C9207v parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
            return (C9207v) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
        }

        public static C9207v parseFrom(byte[] bArr) throws ce8 {
            return (C9207v) v27.m23710c0(DEFAULT_INSTANCE, bArr);
        }

        public static C9207v parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
            return (C9207v) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
        }

        public static C9207v parseFrom(InputStream inputStream) throws IOException {
            return (C9207v) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
        }

        public static C9207v parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
            return (C9207v) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
        }

        public static C9207v parseFrom(f72 f72Var) throws IOException {
            return (C9207v) v27.m23704W(DEFAULT_INSTANCE, f72Var);
        }

        public static C9207v parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
            return (C9207v) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
        }
    }

    /* JADX INFO: renamed from: m74$w */
    public interface InterfaceC9208w extends v27.InterfaceC13827f<C9207v, C9207v.a> {
        boolean getCcEnableArenas();

        boolean getCcGenericServices();

        String getCsharpNamespace();

        vj1 getCsharpNamespaceBytes();

        boolean getDeprecated();

        String getGoPackage();

        vj1 getGoPackageBytes();

        @Deprecated
        boolean getJavaGenerateEqualsAndHash();

        boolean getJavaGenericServices();

        boolean getJavaMultipleFiles();

        String getJavaOuterClassname();

        vj1 getJavaOuterClassnameBytes();

        String getJavaPackage();

        vj1 getJavaPackageBytes();

        boolean getJavaStringCheckUtf8();

        String getObjcClassPrefix();

        vj1 getObjcClassPrefixBytes();

        C9207v.b getOptimizeFor();

        String getPhpClassPrefix();

        vj1 getPhpClassPrefixBytes();

        boolean getPhpGenericServices();

        String getPhpMetadataNamespace();

        vj1 getPhpMetadataNamespaceBytes();

        String getPhpNamespace();

        vj1 getPhpNamespaceBytes();

        boolean getPyGenericServices();

        String getRubyPackage();

        vj1 getRubyPackageBytes();

        String getSwiftPrefix();

        vj1 getSwiftPrefixBytes();

        C9200p0 getUninterpretedOption(int i);

        int getUninterpretedOptionCount();

        List<C9200p0> getUninterpretedOptionList();

        boolean hasCcEnableArenas();

        boolean hasCcGenericServices();

        boolean hasCsharpNamespace();

        boolean hasDeprecated();

        boolean hasGoPackage();

        @Deprecated
        boolean hasJavaGenerateEqualsAndHash();

        boolean hasJavaGenericServices();

        boolean hasJavaMultipleFiles();

        boolean hasJavaOuterClassname();

        boolean hasJavaPackage();

        boolean hasJavaStringCheckUtf8();

        boolean hasObjcClassPrefix();

        boolean hasOptimizeFor();

        boolean hasPhpClassPrefix();

        boolean hasPhpGenericServices();

        boolean hasPhpMetadataNamespace();

        boolean hasPhpNamespace();

        boolean hasPyGenericServices();

        boolean hasRubyPackage();

        boolean hasSwiftPrefix();
    }

    /* JADX INFO: renamed from: m74$x */
    public static final class C9209x extends v27<C9209x, c> implements InterfaceC9210y {
        public static final int ANNOTATION_FIELD_NUMBER = 1;
        private static final C9209x DEFAULT_INSTANCE;
        private static volatile uhc<C9209x> PARSER;
        private w98.InterfaceC14504k<a> annotation_ = v27.m23722x();

        /* JADX INFO: renamed from: m74$x$a */
        public static final class a extends v27<a, C16484a> implements b {
            public static final int BEGIN_FIELD_NUMBER = 3;
            private static final a DEFAULT_INSTANCE;
            public static final int END_FIELD_NUMBER = 4;
            private static volatile uhc<a> PARSER = null;
            public static final int PATH_FIELD_NUMBER = 1;
            public static final int SOURCE_FILE_FIELD_NUMBER = 2;
            private int begin_;
            private int bitField0_;
            private int end_;
            private int pathMemoizedSerializedSize = -1;
            private w98.InterfaceC14501h path_ = v27.m23720v();
            private String sourceFile_ = "";

            /* JADX INFO: renamed from: m74$x$a$a, reason: collision with other inner class name */
            public static final class C16484a extends v27.AbstractC13823b<a, C16484a> implements b {
                public /* synthetic */ C16484a(C9169a c9169a) {
                    this();
                }

                public C16484a addAllPath(Iterable<? extends Integer> iterable) {
                    m23743e();
                    ((a) this.f89756b).addAllPath(iterable);
                    return this;
                }

                public C16484a addPath(int i) {
                    m23743e();
                    ((a) this.f89756b).addPath(i);
                    return this;
                }

                public C16484a clearBegin() {
                    m23743e();
                    ((a) this.f89756b).clearBegin();
                    return this;
                }

                public C16484a clearEnd() {
                    m23743e();
                    ((a) this.f89756b).clearEnd();
                    return this;
                }

                public C16484a clearPath() {
                    m23743e();
                    ((a) this.f89756b).clearPath();
                    return this;
                }

                public C16484a clearSourceFile() {
                    m23743e();
                    ((a) this.f89756b).clearSourceFile();
                    return this;
                }

                @Override // p000.m74.C9209x.b
                public int getBegin() {
                    return ((a) this.f89756b).getBegin();
                }

                @Override // p000.m74.C9209x.b
                public int getEnd() {
                    return ((a) this.f89756b).getEnd();
                }

                @Override // p000.m74.C9209x.b
                public int getPath(int i) {
                    return ((a) this.f89756b).getPath(i);
                }

                @Override // p000.m74.C9209x.b
                public int getPathCount() {
                    return ((a) this.f89756b).getPathCount();
                }

                @Override // p000.m74.C9209x.b
                public List<Integer> getPathList() {
                    return Collections.unmodifiableList(((a) this.f89756b).getPathList());
                }

                @Override // p000.m74.C9209x.b
                public String getSourceFile() {
                    return ((a) this.f89756b).getSourceFile();
                }

                @Override // p000.m74.C9209x.b
                public vj1 getSourceFileBytes() {
                    return ((a) this.f89756b).getSourceFileBytes();
                }

                @Override // p000.m74.C9209x.b
                public boolean hasBegin() {
                    return ((a) this.f89756b).hasBegin();
                }

                @Override // p000.m74.C9209x.b
                public boolean hasEnd() {
                    return ((a) this.f89756b).hasEnd();
                }

                @Override // p000.m74.C9209x.b
                public boolean hasSourceFile() {
                    return ((a) this.f89756b).hasSourceFile();
                }

                public C16484a setBegin(int i) {
                    m23743e();
                    ((a) this.f89756b).setBegin(i);
                    return this;
                }

                public C16484a setEnd(int i) {
                    m23743e();
                    ((a) this.f89756b).setEnd(i);
                    return this;
                }

                public C16484a setPath(int i, int i2) {
                    m23743e();
                    ((a) this.f89756b).setPath(i, i2);
                    return this;
                }

                public C16484a setSourceFile(String str) {
                    m23743e();
                    ((a) this.f89756b).setSourceFile(str);
                    return this;
                }

                public C16484a setSourceFileBytes(vj1 vj1Var) {
                    m23743e();
                    ((a) this.f89756b).setSourceFileBytes(vj1Var);
                    return this;
                }

                private C16484a() {
                    super(a.DEFAULT_INSTANCE);
                }
            }

            static {
                a aVar = new a();
                DEFAULT_INSTANCE = aVar;
                v27.m23715h0(a.class, aVar);
            }

            private a() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addAllPath(Iterable<? extends Integer> iterable) {
                ensurePathIsMutable();
                AbstractC1714b3.m2856b(iterable, this.path_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addPath(int i) {
                ensurePathIsMutable();
                this.path_.addInt(i);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearBegin() {
                this.bitField0_ &= -3;
                this.begin_ = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearEnd() {
                this.bitField0_ &= -5;
                this.end_ = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearPath() {
                this.path_ = v27.m23720v();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearSourceFile() {
                this.bitField0_ &= -2;
                this.sourceFile_ = getDefaultInstance().getSourceFile();
            }

            private void ensurePathIsMutable() {
                w98.InterfaceC14501h interfaceC14501h = this.path_;
                if (interfaceC14501h.isModifiable()) {
                    return;
                }
                this.path_ = v27.m23696N(interfaceC14501h);
            }

            public static a getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static C16484a newBuilder() {
                return DEFAULT_INSTANCE.m23738n();
            }

            public static a parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (a) v27.m23700S(DEFAULT_INSTANCE, inputStream);
            }

            public static a parseFrom(ByteBuffer byteBuffer) throws ce8 {
                return (a) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
            }

            public static uhc<a> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setBegin(int i) {
                this.bitField0_ |= 2;
                this.begin_ = i;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setEnd(int i) {
                this.bitField0_ |= 4;
                this.end_ = i;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setPath(int i, int i2) {
                ensurePathIsMutable();
                this.path_.setInt(i, i2);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setSourceFile(String str) {
                str.getClass();
                this.bitField0_ |= 1;
                this.sourceFile_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setSourceFileBytes(vj1 vj1Var) {
                this.sourceFile_ = vj1Var.toStringUtf8();
                this.bitField0_ |= 1;
            }

            @Override // p000.m74.C9209x.b
            public int getBegin() {
                return this.begin_;
            }

            @Override // p000.m74.C9209x.b
            public int getEnd() {
                return this.end_;
            }

            @Override // p000.m74.C9209x.b
            public int getPath(int i) {
                return this.path_.getInt(i);
            }

            @Override // p000.m74.C9209x.b
            public int getPathCount() {
                return this.path_.size();
            }

            @Override // p000.m74.C9209x.b
            public List<Integer> getPathList() {
                return this.path_;
            }

            @Override // p000.m74.C9209x.b
            public String getSourceFile() {
                return this.sourceFile_;
            }

            @Override // p000.m74.C9209x.b
            public vj1 getSourceFileBytes() {
                return vj1.copyFromUtf8(this.sourceFile_);
            }

            @Override // p000.m74.C9209x.b
            public boolean hasBegin() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // p000.m74.C9209x.b
            public boolean hasEnd() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // p000.m74.C9209x.b
            public boolean hasSourceFile() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // p000.v27
            /* JADX INFO: renamed from: r */
            public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
                C9169a c9169a = null;
                switch (C9169a.f60048a[enumC13830i.ordinal()]) {
                    case 1:
                        return new a();
                    case 2:
                        return new C16484a(c9169a);
                    case 3:
                        return v27.m23699Q(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001'\u0002ဈ\u0000\u0003င\u0001\u0004င\u0002", new Object[]{"bitField0_", "path_", "sourceFile_", "begin_", "end_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        uhc<a> c13824c = PARSER;
                        if (c13824c == null) {
                            synchronized (a.class) {
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

            public static C16484a newBuilder(a aVar) {
                return DEFAULT_INSTANCE.m23739o(aVar);
            }

            public static a parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
                return (a) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
            }

            public static a parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
                return (a) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
            }

            public static a parseFrom(vj1 vj1Var) throws ce8 {
                return (a) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
            }

            public static a parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
                return (a) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
            }

            public static a parseFrom(byte[] bArr) throws ce8 {
                return (a) v27.m23710c0(DEFAULT_INSTANCE, bArr);
            }

            public static a parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
                return (a) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
            }

            public static a parseFrom(InputStream inputStream) throws IOException {
                return (a) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
            }

            public static a parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
                return (a) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
            }

            public static a parseFrom(f72 f72Var) throws IOException {
                return (a) v27.m23704W(DEFAULT_INSTANCE, f72Var);
            }

            public static a parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
                return (a) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
            }
        }

        /* JADX INFO: renamed from: m74$x$b */
        public interface b extends rsa {
            int getBegin();

            int getEnd();

            int getPath(int i);

            int getPathCount();

            List<Integer> getPathList();

            String getSourceFile();

            vj1 getSourceFileBytes();

            boolean hasBegin();

            boolean hasEnd();

            boolean hasSourceFile();
        }

        /* JADX INFO: renamed from: m74$x$c */
        public static final class c extends v27.AbstractC13823b<C9209x, c> implements InterfaceC9210y {
            public /* synthetic */ c(C9169a c9169a) {
                this();
            }

            public c addAllAnnotation(Iterable<? extends a> iterable) {
                m23743e();
                ((C9209x) this.f89756b).addAllAnnotation(iterable);
                return this;
            }

            public c addAnnotation(a aVar) {
                m23743e();
                ((C9209x) this.f89756b).addAnnotation(aVar);
                return this;
            }

            public c clearAnnotation() {
                m23743e();
                ((C9209x) this.f89756b).clearAnnotation();
                return this;
            }

            @Override // p000.m74.InterfaceC9210y
            public a getAnnotation(int i) {
                return ((C9209x) this.f89756b).getAnnotation(i);
            }

            @Override // p000.m74.InterfaceC9210y
            public int getAnnotationCount() {
                return ((C9209x) this.f89756b).getAnnotationCount();
            }

            @Override // p000.m74.InterfaceC9210y
            public List<a> getAnnotationList() {
                return Collections.unmodifiableList(((C9209x) this.f89756b).getAnnotationList());
            }

            public c removeAnnotation(int i) {
                m23743e();
                ((C9209x) this.f89756b).removeAnnotation(i);
                return this;
            }

            public c setAnnotation(int i, a aVar) {
                m23743e();
                ((C9209x) this.f89756b).setAnnotation(i, aVar);
                return this;
            }

            private c() {
                super(C9209x.DEFAULT_INSTANCE);
            }

            public c addAnnotation(int i, a aVar) {
                m23743e();
                ((C9209x) this.f89756b).addAnnotation(i, aVar);
                return this;
            }

            public c setAnnotation(int i, a.C16484a c16484a) {
                m23743e();
                ((C9209x) this.f89756b).setAnnotation(i, c16484a.build());
                return this;
            }

            public c addAnnotation(a.C16484a c16484a) {
                m23743e();
                ((C9209x) this.f89756b).addAnnotation(c16484a.build());
                return this;
            }

            public c addAnnotation(int i, a.C16484a c16484a) {
                m23743e();
                ((C9209x) this.f89756b).addAnnotation(i, c16484a.build());
                return this;
            }
        }

        static {
            C9209x c9209x = new C9209x();
            DEFAULT_INSTANCE = c9209x;
            v27.m23715h0(C9209x.class, c9209x);
        }

        private C9209x() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllAnnotation(Iterable<? extends a> iterable) {
            ensureAnnotationIsMutable();
            AbstractC1714b3.m2856b(iterable, this.annotation_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAnnotation(a aVar) {
            aVar.getClass();
            ensureAnnotationIsMutable();
            this.annotation_.add(aVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAnnotation() {
            this.annotation_ = v27.m23722x();
        }

        private void ensureAnnotationIsMutable() {
            w98.InterfaceC14504k<a> interfaceC14504k = this.annotation_;
            if (interfaceC14504k.isModifiable()) {
                return;
            }
            this.annotation_ = v27.m23698P(interfaceC14504k);
        }

        public static C9209x getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static c newBuilder() {
            return DEFAULT_INSTANCE.m23738n();
        }

        public static C9209x parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (C9209x) v27.m23700S(DEFAULT_INSTANCE, inputStream);
        }

        public static C9209x parseFrom(ByteBuffer byteBuffer) throws ce8 {
            return (C9209x) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
        }

        public static uhc<C9209x> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeAnnotation(int i) {
            ensureAnnotationIsMutable();
            this.annotation_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAnnotation(int i, a aVar) {
            aVar.getClass();
            ensureAnnotationIsMutable();
            this.annotation_.set(i, aVar);
        }

        @Override // p000.m74.InterfaceC9210y
        public a getAnnotation(int i) {
            return this.annotation_.get(i);
        }

        @Override // p000.m74.InterfaceC9210y
        public int getAnnotationCount() {
            return this.annotation_.size();
        }

        @Override // p000.m74.InterfaceC9210y
        public List<a> getAnnotationList() {
            return this.annotation_;
        }

        public b getAnnotationOrBuilder(int i) {
            return this.annotation_.get(i);
        }

        public List<? extends b> getAnnotationOrBuilderList() {
            return this.annotation_;
        }

        @Override // p000.v27
        /* JADX INFO: renamed from: r */
        public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
            C9169a c9169a = null;
            switch (C9169a.f60048a[enumC13830i.ordinal()]) {
                case 1:
                    return new C9209x();
                case 2:
                    return new c(c9169a);
                case 3:
                    return v27.m23699Q(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"annotation_", a.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    uhc<C9209x> c13824c = PARSER;
                    if (c13824c == null) {
                        synchronized (C9209x.class) {
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

        public static c newBuilder(C9209x c9209x) {
            return DEFAULT_INSTANCE.m23739o(c9209x);
        }

        public static C9209x parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
            return (C9209x) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
        }

        public static C9209x parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
            return (C9209x) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
        }

        public static C9209x parseFrom(vj1 vj1Var) throws ce8 {
            return (C9209x) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAnnotation(int i, a aVar) {
            aVar.getClass();
            ensureAnnotationIsMutable();
            this.annotation_.add(i, aVar);
        }

        public static C9209x parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
            return (C9209x) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
        }

        public static C9209x parseFrom(byte[] bArr) throws ce8 {
            return (C9209x) v27.m23710c0(DEFAULT_INSTANCE, bArr);
        }

        public static C9209x parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
            return (C9209x) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
        }

        public static C9209x parseFrom(InputStream inputStream) throws IOException {
            return (C9209x) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
        }

        public static C9209x parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
            return (C9209x) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
        }

        public static C9209x parseFrom(f72 f72Var) throws IOException {
            return (C9209x) v27.m23704W(DEFAULT_INSTANCE, f72Var);
        }

        public static C9209x parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
            return (C9209x) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
        }
    }

    /* JADX INFO: renamed from: m74$y */
    public interface InterfaceC9210y extends rsa {
        C9209x.a getAnnotation(int i);

        int getAnnotationCount();

        List<C9209x.a> getAnnotationList();
    }

    /* JADX INFO: renamed from: m74$z */
    public static final class C9211z extends v27.AbstractC13826e<C9211z, a> implements InterfaceC9170a0 {
        private static final C9211z DEFAULT_INSTANCE;
        public static final int DEPRECATED_FIELD_NUMBER = 3;
        public static final int MAP_ENTRY_FIELD_NUMBER = 7;
        public static final int MESSAGE_SET_WIRE_FORMAT_FIELD_NUMBER = 1;
        public static final int NO_STANDARD_DESCRIPTOR_ACCESSOR_FIELD_NUMBER = 2;
        private static volatile uhc<C9211z> PARSER = null;
        public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
        private int bitField0_;
        private boolean deprecated_;
        private boolean mapEntry_;
        private boolean messageSetWireFormat_;
        private boolean noStandardDescriptorAccessor_;
        private byte memoizedIsInitialized = 2;
        private w98.InterfaceC14504k<C9200p0> uninterpretedOption_ = v27.m23722x();

        /* JADX INFO: renamed from: m74$z$a */
        public static final class a extends v27.AbstractC13825d<C9211z, a> implements InterfaceC9170a0 {
            public /* synthetic */ a(C9169a c9169a) {
                this();
            }

            public a addAllUninterpretedOption(Iterable<? extends C9200p0> iterable) {
                m23743e();
                ((C9211z) this.f89756b).addAllUninterpretedOption(iterable);
                return this;
            }

            public a addUninterpretedOption(C9200p0 c9200p0) {
                m23743e();
                ((C9211z) this.f89756b).addUninterpretedOption(c9200p0);
                return this;
            }

            public a clearDeprecated() {
                m23743e();
                ((C9211z) this.f89756b).clearDeprecated();
                return this;
            }

            public a clearMapEntry() {
                m23743e();
                ((C9211z) this.f89756b).clearMapEntry();
                return this;
            }

            public a clearMessageSetWireFormat() {
                m23743e();
                ((C9211z) this.f89756b).clearMessageSetWireFormat();
                return this;
            }

            public a clearNoStandardDescriptorAccessor() {
                m23743e();
                ((C9211z) this.f89756b).clearNoStandardDescriptorAccessor();
                return this;
            }

            public a clearUninterpretedOption() {
                m23743e();
                ((C9211z) this.f89756b).clearUninterpretedOption();
                return this;
            }

            @Override // p000.m74.InterfaceC9170a0
            public boolean getDeprecated() {
                return ((C9211z) this.f89756b).getDeprecated();
            }

            @Override // p000.m74.InterfaceC9170a0
            public boolean getMapEntry() {
                return ((C9211z) this.f89756b).getMapEntry();
            }

            @Override // p000.m74.InterfaceC9170a0
            public boolean getMessageSetWireFormat() {
                return ((C9211z) this.f89756b).getMessageSetWireFormat();
            }

            @Override // p000.m74.InterfaceC9170a0
            public boolean getNoStandardDescriptorAccessor() {
                return ((C9211z) this.f89756b).getNoStandardDescriptorAccessor();
            }

            @Override // p000.m74.InterfaceC9170a0
            public C9200p0 getUninterpretedOption(int i) {
                return ((C9211z) this.f89756b).getUninterpretedOption(i);
            }

            @Override // p000.m74.InterfaceC9170a0
            public int getUninterpretedOptionCount() {
                return ((C9211z) this.f89756b).getUninterpretedOptionCount();
            }

            @Override // p000.m74.InterfaceC9170a0
            public List<C9200p0> getUninterpretedOptionList() {
                return Collections.unmodifiableList(((C9211z) this.f89756b).getUninterpretedOptionList());
            }

            @Override // p000.m74.InterfaceC9170a0
            public boolean hasDeprecated() {
                return ((C9211z) this.f89756b).hasDeprecated();
            }

            @Override // p000.m74.InterfaceC9170a0
            public boolean hasMapEntry() {
                return ((C9211z) this.f89756b).hasMapEntry();
            }

            @Override // p000.m74.InterfaceC9170a0
            public boolean hasMessageSetWireFormat() {
                return ((C9211z) this.f89756b).hasMessageSetWireFormat();
            }

            @Override // p000.m74.InterfaceC9170a0
            public boolean hasNoStandardDescriptorAccessor() {
                return ((C9211z) this.f89756b).hasNoStandardDescriptorAccessor();
            }

            public a removeUninterpretedOption(int i) {
                m23743e();
                ((C9211z) this.f89756b).removeUninterpretedOption(i);
                return this;
            }

            public a setDeprecated(boolean z) {
                m23743e();
                ((C9211z) this.f89756b).setDeprecated(z);
                return this;
            }

            public a setMapEntry(boolean z) {
                m23743e();
                ((C9211z) this.f89756b).setMapEntry(z);
                return this;
            }

            public a setMessageSetWireFormat(boolean z) {
                m23743e();
                ((C9211z) this.f89756b).setMessageSetWireFormat(z);
                return this;
            }

            public a setNoStandardDescriptorAccessor(boolean z) {
                m23743e();
                ((C9211z) this.f89756b).setNoStandardDescriptorAccessor(z);
                return this;
            }

            public a setUninterpretedOption(int i, C9200p0 c9200p0) {
                m23743e();
                ((C9211z) this.f89756b).setUninterpretedOption(i, c9200p0);
                return this;
            }

            private a() {
                super(C9211z.DEFAULT_INSTANCE);
            }

            public a addUninterpretedOption(int i, C9200p0 c9200p0) {
                m23743e();
                ((C9211z) this.f89756b).addUninterpretedOption(i, c9200p0);
                return this;
            }

            public a setUninterpretedOption(int i, C9200p0.a aVar) {
                m23743e();
                ((C9211z) this.f89756b).setUninterpretedOption(i, aVar.build());
                return this;
            }

            public a addUninterpretedOption(C9200p0.a aVar) {
                m23743e();
                ((C9211z) this.f89756b).addUninterpretedOption(aVar.build());
                return this;
            }

            public a addUninterpretedOption(int i, C9200p0.a aVar) {
                m23743e();
                ((C9211z) this.f89756b).addUninterpretedOption(i, aVar.build());
                return this;
            }
        }

        static {
            C9211z c9211z = new C9211z();
            DEFAULT_INSTANCE = c9211z;
            v27.m23715h0(C9211z.class, c9211z);
        }

        private C9211z() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllUninterpretedOption(Iterable<? extends C9200p0> iterable) {
            ensureUninterpretedOptionIsMutable();
            AbstractC1714b3.m2856b(iterable, this.uninterpretedOption_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addUninterpretedOption(C9200p0 c9200p0) {
            c9200p0.getClass();
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.add(c9200p0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDeprecated() {
            this.bitField0_ &= -5;
            this.deprecated_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMapEntry() {
            this.bitField0_ &= -9;
            this.mapEntry_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMessageSetWireFormat() {
            this.bitField0_ &= -2;
            this.messageSetWireFormat_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNoStandardDescriptorAccessor() {
            this.bitField0_ &= -3;
            this.noStandardDescriptorAccessor_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUninterpretedOption() {
            this.uninterpretedOption_ = v27.m23722x();
        }

        private void ensureUninterpretedOptionIsMutable() {
            w98.InterfaceC14504k<C9200p0> interfaceC14504k = this.uninterpretedOption_;
            if (interfaceC14504k.isModifiable()) {
                return;
            }
            this.uninterpretedOption_ = v27.m23698P(interfaceC14504k);
        }

        public static C9211z getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static a newBuilder() {
            return (a) DEFAULT_INSTANCE.m23738n();
        }

        public static C9211z parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (C9211z) v27.m23700S(DEFAULT_INSTANCE, inputStream);
        }

        public static C9211z parseFrom(ByteBuffer byteBuffer) throws ce8 {
            return (C9211z) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
        }

        public static uhc<C9211z> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeUninterpretedOption(int i) {
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDeprecated(boolean z) {
            this.bitField0_ |= 4;
            this.deprecated_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMapEntry(boolean z) {
            this.bitField0_ |= 8;
            this.mapEntry_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMessageSetWireFormat(boolean z) {
            this.bitField0_ |= 1;
            this.messageSetWireFormat_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNoStandardDescriptorAccessor(boolean z) {
            this.bitField0_ |= 2;
            this.noStandardDescriptorAccessor_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUninterpretedOption(int i, C9200p0 c9200p0) {
            c9200p0.getClass();
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.set(i, c9200p0);
        }

        @Override // p000.m74.InterfaceC9170a0
        public boolean getDeprecated() {
            return this.deprecated_;
        }

        @Override // p000.m74.InterfaceC9170a0
        public boolean getMapEntry() {
            return this.mapEntry_;
        }

        @Override // p000.m74.InterfaceC9170a0
        public boolean getMessageSetWireFormat() {
            return this.messageSetWireFormat_;
        }

        @Override // p000.m74.InterfaceC9170a0
        public boolean getNoStandardDescriptorAccessor() {
            return this.noStandardDescriptorAccessor_;
        }

        @Override // p000.m74.InterfaceC9170a0
        public C9200p0 getUninterpretedOption(int i) {
            return this.uninterpretedOption_.get(i);
        }

        @Override // p000.m74.InterfaceC9170a0
        public int getUninterpretedOptionCount() {
            return this.uninterpretedOption_.size();
        }

        @Override // p000.m74.InterfaceC9170a0
        public List<C9200p0> getUninterpretedOptionList() {
            return this.uninterpretedOption_;
        }

        public InterfaceC9202q0 getUninterpretedOptionOrBuilder(int i) {
            return this.uninterpretedOption_.get(i);
        }

        public List<? extends InterfaceC9202q0> getUninterpretedOptionOrBuilderList() {
            return this.uninterpretedOption_;
        }

        @Override // p000.m74.InterfaceC9170a0
        public boolean hasDeprecated() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // p000.m74.InterfaceC9170a0
        public boolean hasMapEntry() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // p000.m74.InterfaceC9170a0
        public boolean hasMessageSetWireFormat() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // p000.m74.InterfaceC9170a0
        public boolean hasNoStandardDescriptorAccessor() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // p000.v27
        /* JADX INFO: renamed from: r */
        public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
            C9169a c9169a = null;
            switch (C9169a.f60048a[enumC13830i.ordinal()]) {
                case 1:
                    return new C9211z();
                case 2:
                    return new a(c9169a);
                case 3:
                    return v27.m23699Q(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001ϧ\u0005\u0000\u0001\u0001\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0007ဇ\u0003ϧЛ", new Object[]{"bitField0_", "messageSetWireFormat_", "noStandardDescriptorAccessor_", "deprecated_", "mapEntry_", "uninterpretedOption_", C9200p0.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    uhc<C9211z> c13824c = PARSER;
                    if (c13824c == null) {
                        synchronized (C9211z.class) {
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
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    this.memoizedIsInitialized = (byte) (obj == null ? 0 : 1);
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static a newBuilder(C9211z c9211z) {
            return (a) DEFAULT_INSTANCE.m23739o(c9211z);
        }

        public static C9211z parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
            return (C9211z) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
        }

        public static C9211z parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
            return (C9211z) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
        }

        public static C9211z parseFrom(vj1 vj1Var) throws ce8 {
            return (C9211z) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addUninterpretedOption(int i, C9200p0 c9200p0) {
            c9200p0.getClass();
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.add(i, c9200p0);
        }

        public static C9211z parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
            return (C9211z) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
        }

        public static C9211z parseFrom(byte[] bArr) throws ce8 {
            return (C9211z) v27.m23710c0(DEFAULT_INSTANCE, bArr);
        }

        public static C9211z parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
            return (C9211z) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
        }

        public static C9211z parseFrom(InputStream inputStream) throws IOException {
            return (C9211z) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
        }

        public static C9211z parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
            return (C9211z) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
        }

        public static C9211z parseFrom(f72 f72Var) throws IOException {
            return (C9211z) v27.m23704W(DEFAULT_INSTANCE, f72Var);
        }

        public static C9211z parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
            return (C9211z) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
        }
    }

    private m74() {
    }

    public static void registerAllExtensions(zi5 zi5Var) {
    }
}
