package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p000.u27;
import p000.v98;

/* JADX INFO: loaded from: classes3.dex */
public final class l74 {

    /* JADX INFO: renamed from: l74$a */
    public static /* synthetic */ class C8652a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f56391a;

        static {
            int[] iArr = new int[u27.EnumC13331i.values().length];
            f56391a = iArr;
            try {
                iArr[u27.EnumC13331i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f56391a[u27.EnumC13331i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f56391a[u27.EnumC13331i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f56391a[u27.EnumC13331i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f56391a[u27.EnumC13331i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f56391a[u27.EnumC13331i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f56391a[u27.EnumC13331i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: l74$a0 */
    public static final class C8653a0 extends u27.AbstractC13327e<C8653a0, a> implements InterfaceC8655b0 {
        public static final int CC_ENABLE_ARENAS_FIELD_NUMBER = 31;
        public static final int CC_GENERIC_SERVICES_FIELD_NUMBER = 16;
        public static final int CSHARP_NAMESPACE_FIELD_NUMBER = 37;
        private static final C8653a0 DEFAULT_INSTANCE;
        public static final int DEPRECATED_FIELD_NUMBER = 23;
        public static final int FEATURES_FIELD_NUMBER = 50;
        public static final int GO_PACKAGE_FIELD_NUMBER = 11;
        public static final int JAVA_GENERATE_EQUALS_AND_HASH_FIELD_NUMBER = 20;
        public static final int JAVA_GENERIC_SERVICES_FIELD_NUMBER = 17;
        public static final int JAVA_MULTIPLE_FILES_FIELD_NUMBER = 10;
        public static final int JAVA_OUTER_CLASSNAME_FIELD_NUMBER = 8;
        public static final int JAVA_PACKAGE_FIELD_NUMBER = 1;
        public static final int JAVA_STRING_CHECK_UTF8_FIELD_NUMBER = 27;
        public static final int OBJC_CLASS_PREFIX_FIELD_NUMBER = 36;
        public static final int OPTIMIZE_FOR_FIELD_NUMBER = 9;
        private static volatile vhc<C8653a0> PARSER = null;
        public static final int PHP_CLASS_PREFIX_FIELD_NUMBER = 40;
        public static final int PHP_METADATA_NAMESPACE_FIELD_NUMBER = 44;
        public static final int PHP_NAMESPACE_FIELD_NUMBER = 41;
        public static final int PY_GENERIC_SERVICES_FIELD_NUMBER = 18;
        public static final int RUBY_PACKAGE_FIELD_NUMBER = 45;
        public static final int SWIFT_PREFIX_FIELD_NUMBER = 39;
        public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
        private int bitField0_;
        private boolean ccGenericServices_;
        private boolean deprecated_;
        private C8680o features_;
        private boolean javaGenerateEqualsAndHash_;
        private boolean javaGenericServices_;
        private boolean javaMultipleFiles_;
        private boolean javaStringCheckUtf8_;
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
        private v98.InterfaceC13956l<C8693u0> uninterpretedOption_ = u27.m23036w();

        /* JADX INFO: renamed from: l74$a0$a */
        public static final class a extends u27.AbstractC13326d<C8653a0, a> implements InterfaceC8655b0 {
            public /* synthetic */ a(C8652a c8652a) {
                this();
            }

            public a addAllUninterpretedOption(Iterable<? extends C8693u0> values) {
                m23058e();
                ((C8653a0) this.f86607b).addAllUninterpretedOption(values);
                return this;
            }

            public a addUninterpretedOption(C8693u0 value) {
                m23058e();
                ((C8653a0) this.f86607b).addUninterpretedOption(value);
                return this;
            }

            public a clearCcEnableArenas() {
                m23058e();
                ((C8653a0) this.f86607b).clearCcEnableArenas();
                return this;
            }

            public a clearCcGenericServices() {
                m23058e();
                ((C8653a0) this.f86607b).clearCcGenericServices();
                return this;
            }

            public a clearCsharpNamespace() {
                m23058e();
                ((C8653a0) this.f86607b).clearCsharpNamespace();
                return this;
            }

            public a clearDeprecated() {
                m23058e();
                ((C8653a0) this.f86607b).clearDeprecated();
                return this;
            }

            public a clearFeatures() {
                m23058e();
                ((C8653a0) this.f86607b).clearFeatures();
                return this;
            }

            public a clearGoPackage() {
                m23058e();
                ((C8653a0) this.f86607b).clearGoPackage();
                return this;
            }

            @Deprecated
            public a clearJavaGenerateEqualsAndHash() {
                m23058e();
                ((C8653a0) this.f86607b).clearJavaGenerateEqualsAndHash();
                return this;
            }

            public a clearJavaGenericServices() {
                m23058e();
                ((C8653a0) this.f86607b).clearJavaGenericServices();
                return this;
            }

            public a clearJavaMultipleFiles() {
                m23058e();
                ((C8653a0) this.f86607b).clearJavaMultipleFiles();
                return this;
            }

            public a clearJavaOuterClassname() {
                m23058e();
                ((C8653a0) this.f86607b).clearJavaOuterClassname();
                return this;
            }

            public a clearJavaPackage() {
                m23058e();
                ((C8653a0) this.f86607b).clearJavaPackage();
                return this;
            }

            public a clearJavaStringCheckUtf8() {
                m23058e();
                ((C8653a0) this.f86607b).clearJavaStringCheckUtf8();
                return this;
            }

            public a clearObjcClassPrefix() {
                m23058e();
                ((C8653a0) this.f86607b).clearObjcClassPrefix();
                return this;
            }

            public a clearOptimizeFor() {
                m23058e();
                ((C8653a0) this.f86607b).clearOptimizeFor();
                return this;
            }

            public a clearPhpClassPrefix() {
                m23058e();
                ((C8653a0) this.f86607b).clearPhpClassPrefix();
                return this;
            }

            public a clearPhpMetadataNamespace() {
                m23058e();
                ((C8653a0) this.f86607b).clearPhpMetadataNamespace();
                return this;
            }

            public a clearPhpNamespace() {
                m23058e();
                ((C8653a0) this.f86607b).clearPhpNamespace();
                return this;
            }

            public a clearPyGenericServices() {
                m23058e();
                ((C8653a0) this.f86607b).clearPyGenericServices();
                return this;
            }

            public a clearRubyPackage() {
                m23058e();
                ((C8653a0) this.f86607b).clearRubyPackage();
                return this;
            }

            public a clearSwiftPrefix() {
                m23058e();
                ((C8653a0) this.f86607b).clearSwiftPrefix();
                return this;
            }

            public a clearUninterpretedOption() {
                m23058e();
                ((C8653a0) this.f86607b).clearUninterpretedOption();
                return this;
            }

            @Override // p000.l74.InterfaceC8655b0
            public boolean getCcEnableArenas() {
                return ((C8653a0) this.f86607b).getCcEnableArenas();
            }

            @Override // p000.l74.InterfaceC8655b0
            public boolean getCcGenericServices() {
                return ((C8653a0) this.f86607b).getCcGenericServices();
            }

            @Override // p000.l74.InterfaceC8655b0
            public String getCsharpNamespace() {
                return ((C8653a0) this.f86607b).getCsharpNamespace();
            }

            @Override // p000.l74.InterfaceC8655b0
            public wj1 getCsharpNamespaceBytes() {
                return ((C8653a0) this.f86607b).getCsharpNamespaceBytes();
            }

            @Override // p000.l74.InterfaceC8655b0
            public boolean getDeprecated() {
                return ((C8653a0) this.f86607b).getDeprecated();
            }

            @Override // p000.l74.InterfaceC8655b0
            public C8680o getFeatures() {
                return ((C8653a0) this.f86607b).getFeatures();
            }

            @Override // p000.l74.InterfaceC8655b0
            public String getGoPackage() {
                return ((C8653a0) this.f86607b).getGoPackage();
            }

            @Override // p000.l74.InterfaceC8655b0
            public wj1 getGoPackageBytes() {
                return ((C8653a0) this.f86607b).getGoPackageBytes();
            }

            @Override // p000.l74.InterfaceC8655b0
            @Deprecated
            public boolean getJavaGenerateEqualsAndHash() {
                return ((C8653a0) this.f86607b).getJavaGenerateEqualsAndHash();
            }

            @Override // p000.l74.InterfaceC8655b0
            public boolean getJavaGenericServices() {
                return ((C8653a0) this.f86607b).getJavaGenericServices();
            }

            @Override // p000.l74.InterfaceC8655b0
            public boolean getJavaMultipleFiles() {
                return ((C8653a0) this.f86607b).getJavaMultipleFiles();
            }

            @Override // p000.l74.InterfaceC8655b0
            public String getJavaOuterClassname() {
                return ((C8653a0) this.f86607b).getJavaOuterClassname();
            }

            @Override // p000.l74.InterfaceC8655b0
            public wj1 getJavaOuterClassnameBytes() {
                return ((C8653a0) this.f86607b).getJavaOuterClassnameBytes();
            }

            @Override // p000.l74.InterfaceC8655b0
            public String getJavaPackage() {
                return ((C8653a0) this.f86607b).getJavaPackage();
            }

            @Override // p000.l74.InterfaceC8655b0
            public wj1 getJavaPackageBytes() {
                return ((C8653a0) this.f86607b).getJavaPackageBytes();
            }

            @Override // p000.l74.InterfaceC8655b0
            public boolean getJavaStringCheckUtf8() {
                return ((C8653a0) this.f86607b).getJavaStringCheckUtf8();
            }

            @Override // p000.l74.InterfaceC8655b0
            public String getObjcClassPrefix() {
                return ((C8653a0) this.f86607b).getObjcClassPrefix();
            }

            @Override // p000.l74.InterfaceC8655b0
            public wj1 getObjcClassPrefixBytes() {
                return ((C8653a0) this.f86607b).getObjcClassPrefixBytes();
            }

            @Override // p000.l74.InterfaceC8655b0
            public b getOptimizeFor() {
                return ((C8653a0) this.f86607b).getOptimizeFor();
            }

            @Override // p000.l74.InterfaceC8655b0
            public String getPhpClassPrefix() {
                return ((C8653a0) this.f86607b).getPhpClassPrefix();
            }

            @Override // p000.l74.InterfaceC8655b0
            public wj1 getPhpClassPrefixBytes() {
                return ((C8653a0) this.f86607b).getPhpClassPrefixBytes();
            }

            @Override // p000.l74.InterfaceC8655b0
            public String getPhpMetadataNamespace() {
                return ((C8653a0) this.f86607b).getPhpMetadataNamespace();
            }

            @Override // p000.l74.InterfaceC8655b0
            public wj1 getPhpMetadataNamespaceBytes() {
                return ((C8653a0) this.f86607b).getPhpMetadataNamespaceBytes();
            }

            @Override // p000.l74.InterfaceC8655b0
            public String getPhpNamespace() {
                return ((C8653a0) this.f86607b).getPhpNamespace();
            }

            @Override // p000.l74.InterfaceC8655b0
            public wj1 getPhpNamespaceBytes() {
                return ((C8653a0) this.f86607b).getPhpNamespaceBytes();
            }

            @Override // p000.l74.InterfaceC8655b0
            public boolean getPyGenericServices() {
                return ((C8653a0) this.f86607b).getPyGenericServices();
            }

            @Override // p000.l74.InterfaceC8655b0
            public String getRubyPackage() {
                return ((C8653a0) this.f86607b).getRubyPackage();
            }

            @Override // p000.l74.InterfaceC8655b0
            public wj1 getRubyPackageBytes() {
                return ((C8653a0) this.f86607b).getRubyPackageBytes();
            }

            @Override // p000.l74.InterfaceC8655b0
            public String getSwiftPrefix() {
                return ((C8653a0) this.f86607b).getSwiftPrefix();
            }

            @Override // p000.l74.InterfaceC8655b0
            public wj1 getSwiftPrefixBytes() {
                return ((C8653a0) this.f86607b).getSwiftPrefixBytes();
            }

            @Override // p000.l74.InterfaceC8655b0
            public C8693u0 getUninterpretedOption(int index) {
                return ((C8653a0) this.f86607b).getUninterpretedOption(index);
            }

            @Override // p000.l74.InterfaceC8655b0
            public int getUninterpretedOptionCount() {
                return ((C8653a0) this.f86607b).getUninterpretedOptionCount();
            }

            @Override // p000.l74.InterfaceC8655b0
            public List<C8693u0> getUninterpretedOptionList() {
                return Collections.unmodifiableList(((C8653a0) this.f86607b).getUninterpretedOptionList());
            }

            @Override // p000.l74.InterfaceC8655b0
            public boolean hasCcEnableArenas() {
                return ((C8653a0) this.f86607b).hasCcEnableArenas();
            }

            @Override // p000.l74.InterfaceC8655b0
            public boolean hasCcGenericServices() {
                return ((C8653a0) this.f86607b).hasCcGenericServices();
            }

            @Override // p000.l74.InterfaceC8655b0
            public boolean hasCsharpNamespace() {
                return ((C8653a0) this.f86607b).hasCsharpNamespace();
            }

            @Override // p000.l74.InterfaceC8655b0
            public boolean hasDeprecated() {
                return ((C8653a0) this.f86607b).hasDeprecated();
            }

            @Override // p000.l74.InterfaceC8655b0
            public boolean hasFeatures() {
                return ((C8653a0) this.f86607b).hasFeatures();
            }

            @Override // p000.l74.InterfaceC8655b0
            public boolean hasGoPackage() {
                return ((C8653a0) this.f86607b).hasGoPackage();
            }

            @Override // p000.l74.InterfaceC8655b0
            @Deprecated
            public boolean hasJavaGenerateEqualsAndHash() {
                return ((C8653a0) this.f86607b).hasJavaGenerateEqualsAndHash();
            }

            @Override // p000.l74.InterfaceC8655b0
            public boolean hasJavaGenericServices() {
                return ((C8653a0) this.f86607b).hasJavaGenericServices();
            }

            @Override // p000.l74.InterfaceC8655b0
            public boolean hasJavaMultipleFiles() {
                return ((C8653a0) this.f86607b).hasJavaMultipleFiles();
            }

            @Override // p000.l74.InterfaceC8655b0
            public boolean hasJavaOuterClassname() {
                return ((C8653a0) this.f86607b).hasJavaOuterClassname();
            }

            @Override // p000.l74.InterfaceC8655b0
            public boolean hasJavaPackage() {
                return ((C8653a0) this.f86607b).hasJavaPackage();
            }

            @Override // p000.l74.InterfaceC8655b0
            public boolean hasJavaStringCheckUtf8() {
                return ((C8653a0) this.f86607b).hasJavaStringCheckUtf8();
            }

            @Override // p000.l74.InterfaceC8655b0
            public boolean hasObjcClassPrefix() {
                return ((C8653a0) this.f86607b).hasObjcClassPrefix();
            }

            @Override // p000.l74.InterfaceC8655b0
            public boolean hasOptimizeFor() {
                return ((C8653a0) this.f86607b).hasOptimizeFor();
            }

            @Override // p000.l74.InterfaceC8655b0
            public boolean hasPhpClassPrefix() {
                return ((C8653a0) this.f86607b).hasPhpClassPrefix();
            }

            @Override // p000.l74.InterfaceC8655b0
            public boolean hasPhpMetadataNamespace() {
                return ((C8653a0) this.f86607b).hasPhpMetadataNamespace();
            }

            @Override // p000.l74.InterfaceC8655b0
            public boolean hasPhpNamespace() {
                return ((C8653a0) this.f86607b).hasPhpNamespace();
            }

            @Override // p000.l74.InterfaceC8655b0
            public boolean hasPyGenericServices() {
                return ((C8653a0) this.f86607b).hasPyGenericServices();
            }

            @Override // p000.l74.InterfaceC8655b0
            public boolean hasRubyPackage() {
                return ((C8653a0) this.f86607b).hasRubyPackage();
            }

            @Override // p000.l74.InterfaceC8655b0
            public boolean hasSwiftPrefix() {
                return ((C8653a0) this.f86607b).hasSwiftPrefix();
            }

            public a mergeFeatures(C8680o value) {
                m23058e();
                ((C8653a0) this.f86607b).mergeFeatures(value);
                return this;
            }

            public a removeUninterpretedOption(int index) {
                m23058e();
                ((C8653a0) this.f86607b).removeUninterpretedOption(index);
                return this;
            }

            public a setCcEnableArenas(boolean value) {
                m23058e();
                ((C8653a0) this.f86607b).setCcEnableArenas(value);
                return this;
            }

            public a setCcGenericServices(boolean value) {
                m23058e();
                ((C8653a0) this.f86607b).setCcGenericServices(value);
                return this;
            }

            public a setCsharpNamespace(String value) {
                m23058e();
                ((C8653a0) this.f86607b).setCsharpNamespace(value);
                return this;
            }

            public a setCsharpNamespaceBytes(wj1 value) {
                m23058e();
                ((C8653a0) this.f86607b).setCsharpNamespaceBytes(value);
                return this;
            }

            public a setDeprecated(boolean value) {
                m23058e();
                ((C8653a0) this.f86607b).setDeprecated(value);
                return this;
            }

            public a setFeatures(C8680o value) {
                m23058e();
                ((C8653a0) this.f86607b).setFeatures(value);
                return this;
            }

            public a setGoPackage(String value) {
                m23058e();
                ((C8653a0) this.f86607b).setGoPackage(value);
                return this;
            }

            public a setGoPackageBytes(wj1 value) {
                m23058e();
                ((C8653a0) this.f86607b).setGoPackageBytes(value);
                return this;
            }

            @Deprecated
            public a setJavaGenerateEqualsAndHash(boolean value) {
                m23058e();
                ((C8653a0) this.f86607b).setJavaGenerateEqualsAndHash(value);
                return this;
            }

            public a setJavaGenericServices(boolean value) {
                m23058e();
                ((C8653a0) this.f86607b).setJavaGenericServices(value);
                return this;
            }

            public a setJavaMultipleFiles(boolean value) {
                m23058e();
                ((C8653a0) this.f86607b).setJavaMultipleFiles(value);
                return this;
            }

            public a setJavaOuterClassname(String value) {
                m23058e();
                ((C8653a0) this.f86607b).setJavaOuterClassname(value);
                return this;
            }

            public a setJavaOuterClassnameBytes(wj1 value) {
                m23058e();
                ((C8653a0) this.f86607b).setJavaOuterClassnameBytes(value);
                return this;
            }

            public a setJavaPackage(String value) {
                m23058e();
                ((C8653a0) this.f86607b).setJavaPackage(value);
                return this;
            }

            public a setJavaPackageBytes(wj1 value) {
                m23058e();
                ((C8653a0) this.f86607b).setJavaPackageBytes(value);
                return this;
            }

            public a setJavaStringCheckUtf8(boolean value) {
                m23058e();
                ((C8653a0) this.f86607b).setJavaStringCheckUtf8(value);
                return this;
            }

            public a setObjcClassPrefix(String value) {
                m23058e();
                ((C8653a0) this.f86607b).setObjcClassPrefix(value);
                return this;
            }

            public a setObjcClassPrefixBytes(wj1 value) {
                m23058e();
                ((C8653a0) this.f86607b).setObjcClassPrefixBytes(value);
                return this;
            }

            public a setOptimizeFor(b value) {
                m23058e();
                ((C8653a0) this.f86607b).setOptimizeFor(value);
                return this;
            }

            public a setPhpClassPrefix(String value) {
                m23058e();
                ((C8653a0) this.f86607b).setPhpClassPrefix(value);
                return this;
            }

            public a setPhpClassPrefixBytes(wj1 value) {
                m23058e();
                ((C8653a0) this.f86607b).setPhpClassPrefixBytes(value);
                return this;
            }

            public a setPhpMetadataNamespace(String value) {
                m23058e();
                ((C8653a0) this.f86607b).setPhpMetadataNamespace(value);
                return this;
            }

            public a setPhpMetadataNamespaceBytes(wj1 value) {
                m23058e();
                ((C8653a0) this.f86607b).setPhpMetadataNamespaceBytes(value);
                return this;
            }

            public a setPhpNamespace(String value) {
                m23058e();
                ((C8653a0) this.f86607b).setPhpNamespace(value);
                return this;
            }

            public a setPhpNamespaceBytes(wj1 value) {
                m23058e();
                ((C8653a0) this.f86607b).setPhpNamespaceBytes(value);
                return this;
            }

            public a setPyGenericServices(boolean value) {
                m23058e();
                ((C8653a0) this.f86607b).setPyGenericServices(value);
                return this;
            }

            public a setRubyPackage(String value) {
                m23058e();
                ((C8653a0) this.f86607b).setRubyPackage(value);
                return this;
            }

            public a setRubyPackageBytes(wj1 value) {
                m23058e();
                ((C8653a0) this.f86607b).setRubyPackageBytes(value);
                return this;
            }

            public a setSwiftPrefix(String value) {
                m23058e();
                ((C8653a0) this.f86607b).setSwiftPrefix(value);
                return this;
            }

            public a setSwiftPrefixBytes(wj1 value) {
                m23058e();
                ((C8653a0) this.f86607b).setSwiftPrefixBytes(value);
                return this;
            }

            public a setUninterpretedOption(int index, C8693u0 value) {
                m23058e();
                ((C8653a0) this.f86607b).setUninterpretedOption(index, value);
                return this;
            }

            private a() {
                super(C8653a0.DEFAULT_INSTANCE);
            }

            public a addUninterpretedOption(int index, C8693u0 value) {
                m23058e();
                ((C8653a0) this.f86607b).addUninterpretedOption(index, value);
                return this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public a setFeatures(C8680o.a builderForValue) {
                m23058e();
                ((C8653a0) this.f86607b).setFeatures((C8680o) builderForValue.build());
                return this;
            }

            public a setUninterpretedOption(int index, C8693u0.a builderForValue) {
                m23058e();
                ((C8653a0) this.f86607b).setUninterpretedOption(index, builderForValue.build());
                return this;
            }

            public a addUninterpretedOption(C8693u0.a builderForValue) {
                m23058e();
                ((C8653a0) this.f86607b).addUninterpretedOption(builderForValue.build());
                return this;
            }

            public a addUninterpretedOption(int index, C8693u0.a builderForValue) {
                m23058e();
                ((C8653a0) this.f86607b).addUninterpretedOption(index, builderForValue.build());
                return this;
            }
        }

        /* JADX INFO: renamed from: l74$a0$b */
        public enum b implements v98.InterfaceC13947c {
            SPEED(1),
            CODE_SIZE(2),
            LITE_RUNTIME(3);


            /* JADX INFO: renamed from: C */
            public static final v98.InterfaceC13948d<b> f56392C = new a();

            /* JADX INFO: renamed from: e */
            public static final int f56397e = 1;

            /* JADX INFO: renamed from: f */
            public static final int f56398f = 2;

            /* JADX INFO: renamed from: m */
            public static final int f56399m = 3;

            /* JADX INFO: renamed from: a */
            public final int f56400a;

            /* JADX INFO: renamed from: l74$a0$b$a */
            public class a implements v98.InterfaceC13948d<b> {
                @Override // p000.v98.InterfaceC13948d
                public b findValueByNumber(int number) {
                    return b.forNumber(number);
                }
            }

            /* JADX INFO: renamed from: l74$a0$b$b, reason: collision with other inner class name */
            public static final class C16464b implements v98.InterfaceC13949e {

                /* JADX INFO: renamed from: a */
                public static final v98.InterfaceC13949e f56401a = new C16464b();

                private C16464b() {
                }

                @Override // p000.v98.InterfaceC13949e
                public boolean isInRange(int number) {
                    return b.forNumber(number) != null;
                }
            }

            b(int value) {
                this.f56400a = value;
            }

            public static b forNumber(int value) {
                if (value == 1) {
                    return SPEED;
                }
                if (value == 2) {
                    return CODE_SIZE;
                }
                if (value != 3) {
                    return null;
                }
                return LITE_RUNTIME;
            }

            public static v98.InterfaceC13948d<b> internalGetValueMap() {
                return f56392C;
            }

            public static v98.InterfaceC13949e internalGetVerifier() {
                return C16464b.f56401a;
            }

            @Override // p000.v98.InterfaceC13947c
            public final int getNumber() {
                return this.f56400a;
            }

            @Deprecated
            public static b valueOf(int value) {
                return forNumber(value);
            }
        }

        static {
            C8653a0 c8653a0 = new C8653a0();
            DEFAULT_INSTANCE = c8653a0;
            u27.m23029g0(C8653a0.class, c8653a0);
        }

        private C8653a0() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllUninterpretedOption(Iterable<? extends C8693u0> values) {
            ensureUninterpretedOptionIsMutable();
            AbstractC0027a3.m80a(values, this.uninterpretedOption_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addUninterpretedOption(C8693u0 value) {
            value.getClass();
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.add(value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCcEnableArenas() {
            this.bitField0_ &= -2049;
            this.ccEnableArenas_ = true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCcGenericServices() {
            this.bitField0_ &= -129;
            this.ccGenericServices_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCsharpNamespace() {
            this.bitField0_ &= -8193;
            this.csharpNamespace_ = getDefaultInstance().getCsharpNamespace();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDeprecated() {
            this.bitField0_ &= -1025;
            this.deprecated_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFeatures() {
            this.features_ = null;
            this.bitField0_ &= -524289;
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
            this.bitField0_ &= -4097;
            this.objcClassPrefix_ = getDefaultInstance().getObjcClassPrefix();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOptimizeFor() {
            this.bitField0_ &= -33;
            this.optimizeFor_ = 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPhpClassPrefix() {
            this.bitField0_ &= -32769;
            this.phpClassPrefix_ = getDefaultInstance().getPhpClassPrefix();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPhpMetadataNamespace() {
            this.bitField0_ &= -131073;
            this.phpMetadataNamespace_ = getDefaultInstance().getPhpMetadataNamespace();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPhpNamespace() {
            this.bitField0_ &= -65537;
            this.phpNamespace_ = getDefaultInstance().getPhpNamespace();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPyGenericServices() {
            this.bitField0_ &= -513;
            this.pyGenericServices_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRubyPackage() {
            this.bitField0_ &= -262145;
            this.rubyPackage_ = getDefaultInstance().getRubyPackage();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSwiftPrefix() {
            this.bitField0_ &= -16385;
            this.swiftPrefix_ = getDefaultInstance().getSwiftPrefix();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUninterpretedOption() {
            this.uninterpretedOption_ = u27.m23036w();
        }

        private void ensureUninterpretedOptionIsMutable() {
            v98.InterfaceC13956l<C8693u0> interfaceC13956l = this.uninterpretedOption_;
            if (interfaceC13956l.isModifiable()) {
                return;
            }
            this.uninterpretedOption_ = u27.m23012O(interfaceC13956l);
        }

        public static C8653a0 getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public void mergeFeatures(C8680o value) {
            value.getClass();
            C8680o c8680o = this.features_;
            if (c8680o == null || c8680o == C8680o.getDefaultInstance()) {
                this.features_ = value;
            } else {
                this.features_ = ((C8680o.a) C8680o.newBuilder(this.features_).mergeFrom(value)).buildPartial();
            }
            this.bitField0_ |= 524288;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static a newBuilder() {
            return (a) DEFAULT_INSTANCE.m23053m();
        }

        public static C8653a0 parseDelimitedFrom(InputStream input) throws IOException {
            return (C8653a0) u27.m23014R(DEFAULT_INSTANCE, input);
        }

        public static C8653a0 parseFrom(ByteBuffer data) throws be8 {
            return (C8653a0) u27.m23022Z(DEFAULT_INSTANCE, data);
        }

        public static vhc<C8653a0> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeUninterpretedOption(int index) {
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.remove(index);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCcEnableArenas(boolean value) {
            this.bitField0_ |= 2048;
            this.ccEnableArenas_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCcGenericServices(boolean value) {
            this.bitField0_ |= 128;
            this.ccGenericServices_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCsharpNamespace(String value) {
            value.getClass();
            this.bitField0_ |= 8192;
            this.csharpNamespace_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCsharpNamespaceBytes(wj1 value) {
            this.csharpNamespace_ = value.toStringUtf8();
            this.bitField0_ |= 8192;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDeprecated(boolean value) {
            this.bitField0_ |= 1024;
            this.deprecated_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFeatures(C8680o value) {
            value.getClass();
            this.features_ = value;
            this.bitField0_ |= 524288;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGoPackage(String value) {
            value.getClass();
            this.bitField0_ |= 64;
            this.goPackage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGoPackageBytes(wj1 value) {
            this.goPackage_ = value.toStringUtf8();
            this.bitField0_ |= 64;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setJavaGenerateEqualsAndHash(boolean value) {
            this.bitField0_ |= 8;
            this.javaGenerateEqualsAndHash_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setJavaGenericServices(boolean value) {
            this.bitField0_ |= 256;
            this.javaGenericServices_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setJavaMultipleFiles(boolean value) {
            this.bitField0_ |= 4;
            this.javaMultipleFiles_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setJavaOuterClassname(String value) {
            value.getClass();
            this.bitField0_ |= 2;
            this.javaOuterClassname_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setJavaOuterClassnameBytes(wj1 value) {
            this.javaOuterClassname_ = value.toStringUtf8();
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setJavaPackage(String value) {
            value.getClass();
            this.bitField0_ |= 1;
            this.javaPackage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setJavaPackageBytes(wj1 value) {
            this.javaPackage_ = value.toStringUtf8();
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setJavaStringCheckUtf8(boolean value) {
            this.bitField0_ |= 16;
            this.javaStringCheckUtf8_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setObjcClassPrefix(String value) {
            value.getClass();
            this.bitField0_ |= 4096;
            this.objcClassPrefix_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setObjcClassPrefixBytes(wj1 value) {
            this.objcClassPrefix_ = value.toStringUtf8();
            this.bitField0_ |= 4096;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOptimizeFor(b value) {
            this.optimizeFor_ = value.getNumber();
            this.bitField0_ |= 32;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPhpClassPrefix(String value) {
            value.getClass();
            this.bitField0_ |= 32768;
            this.phpClassPrefix_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPhpClassPrefixBytes(wj1 value) {
            this.phpClassPrefix_ = value.toStringUtf8();
            this.bitField0_ |= 32768;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPhpMetadataNamespace(String value) {
            value.getClass();
            this.bitField0_ |= 131072;
            this.phpMetadataNamespace_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPhpMetadataNamespaceBytes(wj1 value) {
            this.phpMetadataNamespace_ = value.toStringUtf8();
            this.bitField0_ |= 131072;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPhpNamespace(String value) {
            value.getClass();
            this.bitField0_ |= 65536;
            this.phpNamespace_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPhpNamespaceBytes(wj1 value) {
            this.phpNamespace_ = value.toStringUtf8();
            this.bitField0_ |= 65536;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPyGenericServices(boolean value) {
            this.bitField0_ |= 512;
            this.pyGenericServices_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRubyPackage(String value) {
            value.getClass();
            this.bitField0_ |= 262144;
            this.rubyPackage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRubyPackageBytes(wj1 value) {
            this.rubyPackage_ = value.toStringUtf8();
            this.bitField0_ |= 262144;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSwiftPrefix(String value) {
            value.getClass();
            this.bitField0_ |= 16384;
            this.swiftPrefix_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSwiftPrefixBytes(wj1 value) {
            this.swiftPrefix_ = value.toStringUtf8();
            this.bitField0_ |= 16384;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUninterpretedOption(int index, C8693u0 value) {
            value.getClass();
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.set(index, value);
        }

        @Override // p000.l74.InterfaceC8655b0
        public boolean getCcEnableArenas() {
            return this.ccEnableArenas_;
        }

        @Override // p000.l74.InterfaceC8655b0
        public boolean getCcGenericServices() {
            return this.ccGenericServices_;
        }

        @Override // p000.l74.InterfaceC8655b0
        public String getCsharpNamespace() {
            return this.csharpNamespace_;
        }

        @Override // p000.l74.InterfaceC8655b0
        public wj1 getCsharpNamespaceBytes() {
            return wj1.copyFromUtf8(this.csharpNamespace_);
        }

        @Override // p000.l74.InterfaceC8655b0
        public boolean getDeprecated() {
            return this.deprecated_;
        }

        @Override // p000.l74.InterfaceC8655b0
        public C8680o getFeatures() {
            C8680o c8680o = this.features_;
            return c8680o == null ? C8680o.getDefaultInstance() : c8680o;
        }

        @Override // p000.l74.InterfaceC8655b0
        public String getGoPackage() {
            return this.goPackage_;
        }

        @Override // p000.l74.InterfaceC8655b0
        public wj1 getGoPackageBytes() {
            return wj1.copyFromUtf8(this.goPackage_);
        }

        @Override // p000.l74.InterfaceC8655b0
        @Deprecated
        public boolean getJavaGenerateEqualsAndHash() {
            return this.javaGenerateEqualsAndHash_;
        }

        @Override // p000.l74.InterfaceC8655b0
        public boolean getJavaGenericServices() {
            return this.javaGenericServices_;
        }

        @Override // p000.l74.InterfaceC8655b0
        public boolean getJavaMultipleFiles() {
            return this.javaMultipleFiles_;
        }

        @Override // p000.l74.InterfaceC8655b0
        public String getJavaOuterClassname() {
            return this.javaOuterClassname_;
        }

        @Override // p000.l74.InterfaceC8655b0
        public wj1 getJavaOuterClassnameBytes() {
            return wj1.copyFromUtf8(this.javaOuterClassname_);
        }

        @Override // p000.l74.InterfaceC8655b0
        public String getJavaPackage() {
            return this.javaPackage_;
        }

        @Override // p000.l74.InterfaceC8655b0
        public wj1 getJavaPackageBytes() {
            return wj1.copyFromUtf8(this.javaPackage_);
        }

        @Override // p000.l74.InterfaceC8655b0
        public boolean getJavaStringCheckUtf8() {
            return this.javaStringCheckUtf8_;
        }

        @Override // p000.l74.InterfaceC8655b0
        public String getObjcClassPrefix() {
            return this.objcClassPrefix_;
        }

        @Override // p000.l74.InterfaceC8655b0
        public wj1 getObjcClassPrefixBytes() {
            return wj1.copyFromUtf8(this.objcClassPrefix_);
        }

        @Override // p000.l74.InterfaceC8655b0
        public b getOptimizeFor() {
            b bVarForNumber = b.forNumber(this.optimizeFor_);
            return bVarForNumber == null ? b.SPEED : bVarForNumber;
        }

        @Override // p000.l74.InterfaceC8655b0
        public String getPhpClassPrefix() {
            return this.phpClassPrefix_;
        }

        @Override // p000.l74.InterfaceC8655b0
        public wj1 getPhpClassPrefixBytes() {
            return wj1.copyFromUtf8(this.phpClassPrefix_);
        }

        @Override // p000.l74.InterfaceC8655b0
        public String getPhpMetadataNamespace() {
            return this.phpMetadataNamespace_;
        }

        @Override // p000.l74.InterfaceC8655b0
        public wj1 getPhpMetadataNamespaceBytes() {
            return wj1.copyFromUtf8(this.phpMetadataNamespace_);
        }

        @Override // p000.l74.InterfaceC8655b0
        public String getPhpNamespace() {
            return this.phpNamespace_;
        }

        @Override // p000.l74.InterfaceC8655b0
        public wj1 getPhpNamespaceBytes() {
            return wj1.copyFromUtf8(this.phpNamespace_);
        }

        @Override // p000.l74.InterfaceC8655b0
        public boolean getPyGenericServices() {
            return this.pyGenericServices_;
        }

        @Override // p000.l74.InterfaceC8655b0
        public String getRubyPackage() {
            return this.rubyPackage_;
        }

        @Override // p000.l74.InterfaceC8655b0
        public wj1 getRubyPackageBytes() {
            return wj1.copyFromUtf8(this.rubyPackage_);
        }

        @Override // p000.l74.InterfaceC8655b0
        public String getSwiftPrefix() {
            return this.swiftPrefix_;
        }

        @Override // p000.l74.InterfaceC8655b0
        public wj1 getSwiftPrefixBytes() {
            return wj1.copyFromUtf8(this.swiftPrefix_);
        }

        @Override // p000.l74.InterfaceC8655b0
        public C8693u0 getUninterpretedOption(int index) {
            return this.uninterpretedOption_.get(index);
        }

        @Override // p000.l74.InterfaceC8655b0
        public int getUninterpretedOptionCount() {
            return this.uninterpretedOption_.size();
        }

        @Override // p000.l74.InterfaceC8655b0
        public List<C8693u0> getUninterpretedOptionList() {
            return this.uninterpretedOption_;
        }

        public InterfaceC8695v0 getUninterpretedOptionOrBuilder(int index) {
            return this.uninterpretedOption_.get(index);
        }

        public List<? extends InterfaceC8695v0> getUninterpretedOptionOrBuilderList() {
            return this.uninterpretedOption_;
        }

        @Override // p000.l74.InterfaceC8655b0
        public boolean hasCcEnableArenas() {
            return (this.bitField0_ & 2048) != 0;
        }

        @Override // p000.l74.InterfaceC8655b0
        public boolean hasCcGenericServices() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // p000.l74.InterfaceC8655b0
        public boolean hasCsharpNamespace() {
            return (this.bitField0_ & 8192) != 0;
        }

        @Override // p000.l74.InterfaceC8655b0
        public boolean hasDeprecated() {
            return (this.bitField0_ & 1024) != 0;
        }

        @Override // p000.l74.InterfaceC8655b0
        public boolean hasFeatures() {
            return (this.bitField0_ & 524288) != 0;
        }

        @Override // p000.l74.InterfaceC8655b0
        public boolean hasGoPackage() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // p000.l74.InterfaceC8655b0
        @Deprecated
        public boolean hasJavaGenerateEqualsAndHash() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // p000.l74.InterfaceC8655b0
        public boolean hasJavaGenericServices() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // p000.l74.InterfaceC8655b0
        public boolean hasJavaMultipleFiles() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // p000.l74.InterfaceC8655b0
        public boolean hasJavaOuterClassname() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // p000.l74.InterfaceC8655b0
        public boolean hasJavaPackage() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // p000.l74.InterfaceC8655b0
        public boolean hasJavaStringCheckUtf8() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // p000.l74.InterfaceC8655b0
        public boolean hasObjcClassPrefix() {
            return (this.bitField0_ & 4096) != 0;
        }

        @Override // p000.l74.InterfaceC8655b0
        public boolean hasOptimizeFor() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // p000.l74.InterfaceC8655b0
        public boolean hasPhpClassPrefix() {
            return (this.bitField0_ & 32768) != 0;
        }

        @Override // p000.l74.InterfaceC8655b0
        public boolean hasPhpMetadataNamespace() {
            return (this.bitField0_ & 131072) != 0;
        }

        @Override // p000.l74.InterfaceC8655b0
        public boolean hasPhpNamespace() {
            return (this.bitField0_ & 65536) != 0;
        }

        @Override // p000.l74.InterfaceC8655b0
        public boolean hasPyGenericServices() {
            return (this.bitField0_ & 512) != 0;
        }

        @Override // p000.l74.InterfaceC8655b0
        public boolean hasRubyPackage() {
            return (this.bitField0_ & 262144) != 0;
        }

        @Override // p000.l74.InterfaceC8655b0
        public boolean hasSwiftPrefix() {
            return (this.bitField0_ & 16384) != 0;
        }

        @Override // p000.u27
        /* JADX INFO: renamed from: q */
        public final Object mo79q(u27.EnumC13331i method, Object arg0, Object arg1) {
            C8652a c8652a = null;
            switch (C8652a.f56391a[method.ordinal()]) {
                case 1:
                    return new C8653a0();
                case 2:
                    return new a(c8652a);
                case 3:
                    return u27.m23013P(DEFAULT_INSTANCE, "\u0001\u0015\u0000\u0001\u0001ϧ\u0015\u0000\u0001\u0002\u0001ဈ\u0000\bဈ\u0001\t᠌\u0005\nဇ\u0002\u000bဈ\u0006\u0010ဇ\u0007\u0011ဇ\b\u0012ဇ\t\u0014ဇ\u0003\u0017ဇ\n\u001bဇ\u0004\u001fဇ\u000b$ဈ\f%ဈ\r'ဈ\u000e(ဈ\u000f)ဈ\u0010,ဈ\u0011-ဈ\u00122ᐉ\u0013ϧЛ", new Object[]{"bitField0_", "javaPackage_", "javaOuterClassname_", "optimizeFor_", b.internalGetVerifier(), "javaMultipleFiles_", "goPackage_", "ccGenericServices_", "javaGenericServices_", "pyGenericServices_", "javaGenerateEqualsAndHash_", "deprecated_", "javaStringCheckUtf8_", "ccEnableArenas_", "objcClassPrefix_", "csharpNamespace_", "swiftPrefix_", "phpClassPrefix_", "phpNamespace_", "phpMetadataNamespace_", "rubyPackage_", "features_", "uninterpretedOption_", C8693u0.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    vhc<C8653a0> c13325c = PARSER;
                    if (c13325c == null) {
                        synchronized (C8653a0.class) {
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
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    this.memoizedIsInitialized = (byte) (arg0 == null ? 0 : 1);
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static a newBuilder(C8653a0 prototype) {
            return (a) DEFAULT_INSTANCE.m23054n(prototype);
        }

        public static C8653a0 parseDelimitedFrom(InputStream input, yi5 extensionRegistry) throws IOException {
            return (C8653a0) u27.m23015S(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static C8653a0 parseFrom(ByteBuffer data, yi5 extensionRegistry) throws be8 {
            return (C8653a0) u27.m23023a0(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static C8653a0 parseFrom(wj1 data) throws be8 {
            return (C8653a0) u27.m23016T(DEFAULT_INSTANCE, data);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addUninterpretedOption(int index, C8693u0 value) {
            value.getClass();
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.add(index, value);
        }

        public static C8653a0 parseFrom(wj1 data, yi5 extensionRegistry) throws be8 {
            return (C8653a0) u27.m23017U(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static C8653a0 parseFrom(byte[] data) throws be8 {
            return (C8653a0) u27.m23024b0(DEFAULT_INSTANCE, data);
        }

        public static C8653a0 parseFrom(byte[] data, yi5 extensionRegistry) throws be8 {
            return (C8653a0) u27.m23025c0(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static C8653a0 parseFrom(InputStream input) throws IOException {
            return (C8653a0) u27.m23020X(DEFAULT_INSTANCE, input);
        }

        public static C8653a0 parseFrom(InputStream input, yi5 extensionRegistry) throws IOException {
            return (C8653a0) u27.m23021Y(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static C8653a0 parseFrom(e72 input) throws IOException {
            return (C8653a0) u27.m23018V(DEFAULT_INSTANCE, input);
        }

        public static C8653a0 parseFrom(e72 input, yi5 extensionRegistry) throws IOException {
            return (C8653a0) u27.m23019W(DEFAULT_INSTANCE, input, extensionRegistry);
        }
    }

    /* JADX INFO: renamed from: l74$b */
    public static final class C8654b extends u27<C8654b, a> implements InterfaceC8656c {
        private static final C8654b DEFAULT_INSTANCE;
        public static final int ENUM_TYPE_FIELD_NUMBER = 4;
        public static final int EXTENSION_FIELD_NUMBER = 6;
        public static final int EXTENSION_RANGE_FIELD_NUMBER = 5;
        public static final int FIELD_FIELD_NUMBER = 2;
        public static final int NAME_FIELD_NUMBER = 1;
        public static final int NESTED_TYPE_FIELD_NUMBER = 3;
        public static final int ONEOF_DECL_FIELD_NUMBER = 8;
        public static final int OPTIONS_FIELD_NUMBER = 7;
        private static volatile vhc<C8654b> PARSER = null;
        public static final int RESERVED_NAME_FIELD_NUMBER = 10;
        public static final int RESERVED_RANGE_FIELD_NUMBER = 9;
        private int bitField0_;
        private C8661e0 options_;
        private byte memoizedIsInitialized = 2;
        private String name_ = "";
        private v98.InterfaceC13956l<C8688s> field_ = u27.m23036w();
        private v98.InterfaceC13956l<C8688s> extension_ = u27.m23036w();
        private v98.InterfaceC13956l<C8654b> nestedType_ = u27.m23036w();
        private v98.InterfaceC13956l<C8660e> enumType_ = u27.m23036w();
        private v98.InterfaceC13956l<b> extensionRange_ = u27.m23036w();
        private v98.InterfaceC13956l<C8673k0> oneofDecl_ = u27.m23036w();
        private v98.InterfaceC13956l<d> reservedRange_ = u27.m23036w();
        private v98.InterfaceC13956l<String> reservedName_ = u27.m23036w();

        /* JADX INFO: renamed from: l74$b$a */
        public static final class a extends u27.AbstractC13324b<C8654b, a> implements InterfaceC8656c {
            public /* synthetic */ a(C8652a c8652a) {
                this();
            }

            public a addAllEnumType(Iterable<? extends C8660e> values) {
                m23058e();
                ((C8654b) this.f86607b).addAllEnumType(values);
                return this;
            }

            public a addAllExtension(Iterable<? extends C8688s> values) {
                m23058e();
                ((C8654b) this.f86607b).addAllExtension(values);
                return this;
            }

            public a addAllExtensionRange(Iterable<? extends b> values) {
                m23058e();
                ((C8654b) this.f86607b).addAllExtensionRange(values);
                return this;
            }

            public a addAllField(Iterable<? extends C8688s> values) {
                m23058e();
                ((C8654b) this.f86607b).addAllField(values);
                return this;
            }

            public a addAllNestedType(Iterable<? extends C8654b> values) {
                m23058e();
                ((C8654b) this.f86607b).addAllNestedType(values);
                return this;
            }

            public a addAllOneofDecl(Iterable<? extends C8673k0> values) {
                m23058e();
                ((C8654b) this.f86607b).addAllOneofDecl(values);
                return this;
            }

            public a addAllReservedName(Iterable<String> values) {
                m23058e();
                ((C8654b) this.f86607b).addAllReservedName(values);
                return this;
            }

            public a addAllReservedRange(Iterable<? extends d> values) {
                m23058e();
                ((C8654b) this.f86607b).addAllReservedRange(values);
                return this;
            }

            public a addEnumType(C8660e value) {
                m23058e();
                ((C8654b) this.f86607b).addEnumType(value);
                return this;
            }

            public a addExtension(C8688s value) {
                m23058e();
                ((C8654b) this.f86607b).addExtension(value);
                return this;
            }

            public a addExtensionRange(b value) {
                m23058e();
                ((C8654b) this.f86607b).addExtensionRange(value);
                return this;
            }

            public a addField(C8688s value) {
                m23058e();
                ((C8654b) this.f86607b).addField(value);
                return this;
            }

            public a addNestedType(C8654b value) {
                m23058e();
                ((C8654b) this.f86607b).addNestedType(value);
                return this;
            }

            public a addOneofDecl(C8673k0 value) {
                m23058e();
                ((C8654b) this.f86607b).addOneofDecl(value);
                return this;
            }

            public a addReservedName(String value) {
                m23058e();
                ((C8654b) this.f86607b).addReservedName(value);
                return this;
            }

            public a addReservedNameBytes(wj1 value) {
                m23058e();
                ((C8654b) this.f86607b).addReservedNameBytes(value);
                return this;
            }

            public a addReservedRange(d value) {
                m23058e();
                ((C8654b) this.f86607b).addReservedRange(value);
                return this;
            }

            public a clearEnumType() {
                m23058e();
                ((C8654b) this.f86607b).clearEnumType();
                return this;
            }

            public a clearExtension() {
                m23058e();
                ((C8654b) this.f86607b).clearExtension();
                return this;
            }

            public a clearExtensionRange() {
                m23058e();
                ((C8654b) this.f86607b).clearExtensionRange();
                return this;
            }

            public a clearField() {
                m23058e();
                ((C8654b) this.f86607b).clearField();
                return this;
            }

            public a clearName() {
                m23058e();
                ((C8654b) this.f86607b).clearName();
                return this;
            }

            public a clearNestedType() {
                m23058e();
                ((C8654b) this.f86607b).clearNestedType();
                return this;
            }

            public a clearOneofDecl() {
                m23058e();
                ((C8654b) this.f86607b).clearOneofDecl();
                return this;
            }

            public a clearOptions() {
                m23058e();
                ((C8654b) this.f86607b).clearOptions();
                return this;
            }

            public a clearReservedName() {
                m23058e();
                ((C8654b) this.f86607b).clearReservedName();
                return this;
            }

            public a clearReservedRange() {
                m23058e();
                ((C8654b) this.f86607b).clearReservedRange();
                return this;
            }

            @Override // p000.l74.InterfaceC8656c
            public C8660e getEnumType(int index) {
                return ((C8654b) this.f86607b).getEnumType(index);
            }

            @Override // p000.l74.InterfaceC8656c
            public int getEnumTypeCount() {
                return ((C8654b) this.f86607b).getEnumTypeCount();
            }

            @Override // p000.l74.InterfaceC8656c
            public List<C8660e> getEnumTypeList() {
                return Collections.unmodifiableList(((C8654b) this.f86607b).getEnumTypeList());
            }

            @Override // p000.l74.InterfaceC8656c
            public C8688s getExtension(int index) {
                return ((C8654b) this.f86607b).getExtension(index);
            }

            @Override // p000.l74.InterfaceC8656c
            public int getExtensionCount() {
                return ((C8654b) this.f86607b).getExtensionCount();
            }

            @Override // p000.l74.InterfaceC8656c
            public List<C8688s> getExtensionList() {
                return Collections.unmodifiableList(((C8654b) this.f86607b).getExtensionList());
            }

            @Override // p000.l74.InterfaceC8656c
            public b getExtensionRange(int index) {
                return ((C8654b) this.f86607b).getExtensionRange(index);
            }

            @Override // p000.l74.InterfaceC8656c
            public int getExtensionRangeCount() {
                return ((C8654b) this.f86607b).getExtensionRangeCount();
            }

            @Override // p000.l74.InterfaceC8656c
            public List<b> getExtensionRangeList() {
                return Collections.unmodifiableList(((C8654b) this.f86607b).getExtensionRangeList());
            }

            @Override // p000.l74.InterfaceC8656c
            public C8688s getField(int index) {
                return ((C8654b) this.f86607b).getField(index);
            }

            @Override // p000.l74.InterfaceC8656c
            public int getFieldCount() {
                return ((C8654b) this.f86607b).getFieldCount();
            }

            @Override // p000.l74.InterfaceC8656c
            public List<C8688s> getFieldList() {
                return Collections.unmodifiableList(((C8654b) this.f86607b).getFieldList());
            }

            @Override // p000.l74.InterfaceC8656c
            public String getName() {
                return ((C8654b) this.f86607b).getName();
            }

            @Override // p000.l74.InterfaceC8656c
            public wj1 getNameBytes() {
                return ((C8654b) this.f86607b).getNameBytes();
            }

            @Override // p000.l74.InterfaceC8656c
            public C8654b getNestedType(int index) {
                return ((C8654b) this.f86607b).getNestedType(index);
            }

            @Override // p000.l74.InterfaceC8656c
            public int getNestedTypeCount() {
                return ((C8654b) this.f86607b).getNestedTypeCount();
            }

            @Override // p000.l74.InterfaceC8656c
            public List<C8654b> getNestedTypeList() {
                return Collections.unmodifiableList(((C8654b) this.f86607b).getNestedTypeList());
            }

            @Override // p000.l74.InterfaceC8656c
            public C8673k0 getOneofDecl(int index) {
                return ((C8654b) this.f86607b).getOneofDecl(index);
            }

            @Override // p000.l74.InterfaceC8656c
            public int getOneofDeclCount() {
                return ((C8654b) this.f86607b).getOneofDeclCount();
            }

            @Override // p000.l74.InterfaceC8656c
            public List<C8673k0> getOneofDeclList() {
                return Collections.unmodifiableList(((C8654b) this.f86607b).getOneofDeclList());
            }

            @Override // p000.l74.InterfaceC8656c
            public C8661e0 getOptions() {
                return ((C8654b) this.f86607b).getOptions();
            }

            @Override // p000.l74.InterfaceC8656c
            public String getReservedName(int index) {
                return ((C8654b) this.f86607b).getReservedName(index);
            }

            @Override // p000.l74.InterfaceC8656c
            public wj1 getReservedNameBytes(int index) {
                return ((C8654b) this.f86607b).getReservedNameBytes(index);
            }

            @Override // p000.l74.InterfaceC8656c
            public int getReservedNameCount() {
                return ((C8654b) this.f86607b).getReservedNameCount();
            }

            @Override // p000.l74.InterfaceC8656c
            public List<String> getReservedNameList() {
                return Collections.unmodifiableList(((C8654b) this.f86607b).getReservedNameList());
            }

            @Override // p000.l74.InterfaceC8656c
            public d getReservedRange(int index) {
                return ((C8654b) this.f86607b).getReservedRange(index);
            }

            @Override // p000.l74.InterfaceC8656c
            public int getReservedRangeCount() {
                return ((C8654b) this.f86607b).getReservedRangeCount();
            }

            @Override // p000.l74.InterfaceC8656c
            public List<d> getReservedRangeList() {
                return Collections.unmodifiableList(((C8654b) this.f86607b).getReservedRangeList());
            }

            @Override // p000.l74.InterfaceC8656c
            public boolean hasName() {
                return ((C8654b) this.f86607b).hasName();
            }

            @Override // p000.l74.InterfaceC8656c
            public boolean hasOptions() {
                return ((C8654b) this.f86607b).hasOptions();
            }

            public a mergeOptions(C8661e0 value) {
                m23058e();
                ((C8654b) this.f86607b).mergeOptions(value);
                return this;
            }

            public a removeEnumType(int index) {
                m23058e();
                ((C8654b) this.f86607b).removeEnumType(index);
                return this;
            }

            public a removeExtension(int index) {
                m23058e();
                ((C8654b) this.f86607b).removeExtension(index);
                return this;
            }

            public a removeExtensionRange(int index) {
                m23058e();
                ((C8654b) this.f86607b).removeExtensionRange(index);
                return this;
            }

            public a removeField(int index) {
                m23058e();
                ((C8654b) this.f86607b).removeField(index);
                return this;
            }

            public a removeNestedType(int index) {
                m23058e();
                ((C8654b) this.f86607b).removeNestedType(index);
                return this;
            }

            public a removeOneofDecl(int index) {
                m23058e();
                ((C8654b) this.f86607b).removeOneofDecl(index);
                return this;
            }

            public a removeReservedRange(int index) {
                m23058e();
                ((C8654b) this.f86607b).removeReservedRange(index);
                return this;
            }

            public a setEnumType(int index, C8660e value) {
                m23058e();
                ((C8654b) this.f86607b).setEnumType(index, value);
                return this;
            }

            public a setExtension(int index, C8688s value) {
                m23058e();
                ((C8654b) this.f86607b).setExtension(index, value);
                return this;
            }

            public a setExtensionRange(int index, b value) {
                m23058e();
                ((C8654b) this.f86607b).setExtensionRange(index, value);
                return this;
            }

            public a setField(int index, C8688s value) {
                m23058e();
                ((C8654b) this.f86607b).setField(index, value);
                return this;
            }

            public a setName(String value) {
                m23058e();
                ((C8654b) this.f86607b).setName(value);
                return this;
            }

            public a setNameBytes(wj1 value) {
                m23058e();
                ((C8654b) this.f86607b).setNameBytes(value);
                return this;
            }

            public a setNestedType(int index, C8654b value) {
                m23058e();
                ((C8654b) this.f86607b).setNestedType(index, value);
                return this;
            }

            public a setOneofDecl(int index, C8673k0 value) {
                m23058e();
                ((C8654b) this.f86607b).setOneofDecl(index, value);
                return this;
            }

            public a setOptions(C8661e0 value) {
                m23058e();
                ((C8654b) this.f86607b).setOptions(value);
                return this;
            }

            public a setReservedName(int index, String value) {
                m23058e();
                ((C8654b) this.f86607b).setReservedName(index, value);
                return this;
            }

            public a setReservedRange(int index, d value) {
                m23058e();
                ((C8654b) this.f86607b).setReservedRange(index, value);
                return this;
            }

            private a() {
                super(C8654b.DEFAULT_INSTANCE);
            }

            public a addEnumType(int index, C8660e value) {
                m23058e();
                ((C8654b) this.f86607b).addEnumType(index, value);
                return this;
            }

            public a addExtension(int index, C8688s value) {
                m23058e();
                ((C8654b) this.f86607b).addExtension(index, value);
                return this;
            }

            public a addExtensionRange(int index, b value) {
                m23058e();
                ((C8654b) this.f86607b).addExtensionRange(index, value);
                return this;
            }

            public a addField(int index, C8688s value) {
                m23058e();
                ((C8654b) this.f86607b).addField(index, value);
                return this;
            }

            public a addNestedType(int index, C8654b value) {
                m23058e();
                ((C8654b) this.f86607b).addNestedType(index, value);
                return this;
            }

            public a addOneofDecl(int index, C8673k0 value) {
                m23058e();
                ((C8654b) this.f86607b).addOneofDecl(index, value);
                return this;
            }

            public a addReservedRange(int index, d value) {
                m23058e();
                ((C8654b) this.f86607b).addReservedRange(index, value);
                return this;
            }

            public a setEnumType(int index, C8660e.a builderForValue) {
                m23058e();
                ((C8654b) this.f86607b).setEnumType(index, builderForValue.build());
                return this;
            }

            public a setExtension(int index, C8688s.a builderForValue) {
                m23058e();
                ((C8654b) this.f86607b).setExtension(index, builderForValue.build());
                return this;
            }

            public a setExtensionRange(int index, b.a builderForValue) {
                m23058e();
                ((C8654b) this.f86607b).setExtensionRange(index, builderForValue.build());
                return this;
            }

            public a setField(int index, C8688s.a builderForValue) {
                m23058e();
                ((C8654b) this.f86607b).setField(index, builderForValue.build());
                return this;
            }

            public a setNestedType(int index, a builderForValue) {
                m23058e();
                ((C8654b) this.f86607b).setNestedType(index, builderForValue.build());
                return this;
            }

            public a setOneofDecl(int index, C8673k0.a builderForValue) {
                m23058e();
                ((C8654b) this.f86607b).setOneofDecl(index, builderForValue.build());
                return this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public a setOptions(C8661e0.a builderForValue) {
                m23058e();
                ((C8654b) this.f86607b).setOptions((C8661e0) builderForValue.build());
                return this;
            }

            public a setReservedRange(int index, d.a builderForValue) {
                m23058e();
                ((C8654b) this.f86607b).setReservedRange(index, builderForValue.build());
                return this;
            }

            public a addEnumType(C8660e.a builderForValue) {
                m23058e();
                ((C8654b) this.f86607b).addEnumType(builderForValue.build());
                return this;
            }

            public a addExtension(C8688s.a builderForValue) {
                m23058e();
                ((C8654b) this.f86607b).addExtension(builderForValue.build());
                return this;
            }

            public a addExtensionRange(b.a builderForValue) {
                m23058e();
                ((C8654b) this.f86607b).addExtensionRange(builderForValue.build());
                return this;
            }

            public a addField(C8688s.a builderForValue) {
                m23058e();
                ((C8654b) this.f86607b).addField(builderForValue.build());
                return this;
            }

            public a addNestedType(a builderForValue) {
                m23058e();
                ((C8654b) this.f86607b).addNestedType(builderForValue.build());
                return this;
            }

            public a addOneofDecl(C8673k0.a builderForValue) {
                m23058e();
                ((C8654b) this.f86607b).addOneofDecl(builderForValue.build());
                return this;
            }

            public a addReservedRange(d.a builderForValue) {
                m23058e();
                ((C8654b) this.f86607b).addReservedRange(builderForValue.build());
                return this;
            }

            public a addEnumType(int index, C8660e.a builderForValue) {
                m23058e();
                ((C8654b) this.f86607b).addEnumType(index, builderForValue.build());
                return this;
            }

            public a addExtension(int index, C8688s.a builderForValue) {
                m23058e();
                ((C8654b) this.f86607b).addExtension(index, builderForValue.build());
                return this;
            }

            public a addExtensionRange(int index, b.a builderForValue) {
                m23058e();
                ((C8654b) this.f86607b).addExtensionRange(index, builderForValue.build());
                return this;
            }

            public a addField(int index, C8688s.a builderForValue) {
                m23058e();
                ((C8654b) this.f86607b).addField(index, builderForValue.build());
                return this;
            }

            public a addNestedType(int index, a builderForValue) {
                m23058e();
                ((C8654b) this.f86607b).addNestedType(index, builderForValue.build());
                return this;
            }

            public a addOneofDecl(int index, C8673k0.a builderForValue) {
                m23058e();
                ((C8654b) this.f86607b).addOneofDecl(index, builderForValue.build());
                return this;
            }

            public a addReservedRange(int index, d.a builderForValue) {
                m23058e();
                ((C8654b) this.f86607b).addReservedRange(index, builderForValue.build());
                return this;
            }
        }

        /* JADX INFO: renamed from: l74$b$b */
        public static final class b extends u27<b, a> implements c {
            private static final b DEFAULT_INSTANCE;
            public static final int END_FIELD_NUMBER = 2;
            public static final int OPTIONS_FIELD_NUMBER = 3;
            private static volatile vhc<b> PARSER = null;
            public static final int START_FIELD_NUMBER = 1;
            private int bitField0_;
            private int end_;
            private byte memoizedIsInitialized = 2;
            private C8676m options_;
            private int start_;

            /* JADX INFO: renamed from: l74$b$b$a */
            public static final class a extends u27.AbstractC13324b<b, a> implements c {
                public /* synthetic */ a(C8652a c8652a) {
                    this();
                }

                public a clearEnd() {
                    m23058e();
                    ((b) this.f86607b).clearEnd();
                    return this;
                }

                public a clearOptions() {
                    m23058e();
                    ((b) this.f86607b).clearOptions();
                    return this;
                }

                public a clearStart() {
                    m23058e();
                    ((b) this.f86607b).clearStart();
                    return this;
                }

                @Override // p000.l74.C8654b.c
                public int getEnd() {
                    return ((b) this.f86607b).getEnd();
                }

                @Override // p000.l74.C8654b.c
                public C8676m getOptions() {
                    return ((b) this.f86607b).getOptions();
                }

                @Override // p000.l74.C8654b.c
                public int getStart() {
                    return ((b) this.f86607b).getStart();
                }

                @Override // p000.l74.C8654b.c
                public boolean hasEnd() {
                    return ((b) this.f86607b).hasEnd();
                }

                @Override // p000.l74.C8654b.c
                public boolean hasOptions() {
                    return ((b) this.f86607b).hasOptions();
                }

                @Override // p000.l74.C8654b.c
                public boolean hasStart() {
                    return ((b) this.f86607b).hasStart();
                }

                public a mergeOptions(C8676m value) {
                    m23058e();
                    ((b) this.f86607b).mergeOptions(value);
                    return this;
                }

                public a setEnd(int value) {
                    m23058e();
                    ((b) this.f86607b).setEnd(value);
                    return this;
                }

                public a setOptions(C8676m value) {
                    m23058e();
                    ((b) this.f86607b).setOptions(value);
                    return this;
                }

                public a setStart(int value) {
                    m23058e();
                    ((b) this.f86607b).setStart(value);
                    return this;
                }

                private a() {
                    super(b.DEFAULT_INSTANCE);
                }

                /* JADX WARN: Multi-variable type inference failed */
                public a setOptions(C8676m.a builderForValue) {
                    m23058e();
                    ((b) this.f86607b).setOptions((C8676m) builderForValue.build());
                    return this;
                }
            }

            static {
                b bVar = new b();
                DEFAULT_INSTANCE = bVar;
                u27.m23029g0(b.class, bVar);
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
            public void mergeOptions(C8676m value) {
                value.getClass();
                C8676m c8676m = this.options_;
                if (c8676m == null || c8676m == C8676m.getDefaultInstance()) {
                    this.options_ = value;
                } else {
                    this.options_ = ((C8676m.a) C8676m.newBuilder(this.options_).mergeFrom(value)).buildPartial();
                }
                this.bitField0_ |= 4;
            }

            public static a newBuilder() {
                return DEFAULT_INSTANCE.m23053m();
            }

            public static b parseDelimitedFrom(InputStream input) throws IOException {
                return (b) u27.m23014R(DEFAULT_INSTANCE, input);
            }

            public static b parseFrom(ByteBuffer data) throws be8 {
                return (b) u27.m23022Z(DEFAULT_INSTANCE, data);
            }

            public static vhc<b> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setEnd(int value) {
                this.bitField0_ |= 2;
                this.end_ = value;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setOptions(C8676m value) {
                value.getClass();
                this.options_ = value;
                this.bitField0_ |= 4;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setStart(int value) {
                this.bitField0_ |= 1;
                this.start_ = value;
            }

            @Override // p000.l74.C8654b.c
            public int getEnd() {
                return this.end_;
            }

            @Override // p000.l74.C8654b.c
            public C8676m getOptions() {
                C8676m c8676m = this.options_;
                return c8676m == null ? C8676m.getDefaultInstance() : c8676m;
            }

            @Override // p000.l74.C8654b.c
            public int getStart() {
                return this.start_;
            }

            @Override // p000.l74.C8654b.c
            public boolean hasEnd() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // p000.l74.C8654b.c
            public boolean hasOptions() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // p000.l74.C8654b.c
            public boolean hasStart() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // p000.u27
            /* JADX INFO: renamed from: q */
            public final Object mo79q(u27.EnumC13331i method, Object arg0, Object arg1) {
                C8652a c8652a = null;
                switch (C8652a.f56391a[method.ordinal()]) {
                    case 1:
                        return new b();
                    case 2:
                        return new a(c8652a);
                    case 3:
                        return u27.m23013P(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001င\u0000\u0002င\u0001\u0003ᐉ\u0002", new Object[]{"bitField0_", "start_", "end_", "options_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        vhc<b> c13325c = PARSER;
                        if (c13325c == null) {
                            synchronized (b.class) {
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
                        return Byte.valueOf(this.memoizedIsInitialized);
                    case 7:
                        this.memoizedIsInitialized = (byte) (arg0 == null ? 0 : 1);
                        return null;
                    default:
                        throw new UnsupportedOperationException();
                }
            }

            public static a newBuilder(b prototype) {
                return DEFAULT_INSTANCE.m23054n(prototype);
            }

            public static b parseDelimitedFrom(InputStream input, yi5 extensionRegistry) throws IOException {
                return (b) u27.m23015S(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static b parseFrom(ByteBuffer data, yi5 extensionRegistry) throws be8 {
                return (b) u27.m23023a0(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static b parseFrom(wj1 data) throws be8 {
                return (b) u27.m23016T(DEFAULT_INSTANCE, data);
            }

            public static b parseFrom(wj1 data, yi5 extensionRegistry) throws be8 {
                return (b) u27.m23017U(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static b parseFrom(byte[] data) throws be8 {
                return (b) u27.m23024b0(DEFAULT_INSTANCE, data);
            }

            public static b parseFrom(byte[] data, yi5 extensionRegistry) throws be8 {
                return (b) u27.m23025c0(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static b parseFrom(InputStream input) throws IOException {
                return (b) u27.m23020X(DEFAULT_INSTANCE, input);
            }

            public static b parseFrom(InputStream input, yi5 extensionRegistry) throws IOException {
                return (b) u27.m23021Y(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static b parseFrom(e72 input) throws IOException {
                return (b) u27.m23018V(DEFAULT_INSTANCE, input);
            }

            public static b parseFrom(e72 input, yi5 extensionRegistry) throws IOException {
                return (b) u27.m23019W(DEFAULT_INSTANCE, input, extensionRegistry);
            }
        }

        /* JADX INFO: renamed from: l74$b$c */
        public interface c extends ssa {
            int getEnd();

            C8676m getOptions();

            int getStart();

            boolean hasEnd();

            boolean hasOptions();

            boolean hasStart();
        }

        /* JADX INFO: renamed from: l74$b$d */
        public static final class d extends u27<d, a> implements e {
            private static final d DEFAULT_INSTANCE;
            public static final int END_FIELD_NUMBER = 2;
            private static volatile vhc<d> PARSER = null;
            public static final int START_FIELD_NUMBER = 1;
            private int bitField0_;
            private int end_;
            private int start_;

            /* JADX INFO: renamed from: l74$b$d$a */
            public static final class a extends u27.AbstractC13324b<d, a> implements e {
                public /* synthetic */ a(C8652a c8652a) {
                    this();
                }

                public a clearEnd() {
                    m23058e();
                    ((d) this.f86607b).clearEnd();
                    return this;
                }

                public a clearStart() {
                    m23058e();
                    ((d) this.f86607b).clearStart();
                    return this;
                }

                @Override // p000.l74.C8654b.e
                public int getEnd() {
                    return ((d) this.f86607b).getEnd();
                }

                @Override // p000.l74.C8654b.e
                public int getStart() {
                    return ((d) this.f86607b).getStart();
                }

                @Override // p000.l74.C8654b.e
                public boolean hasEnd() {
                    return ((d) this.f86607b).hasEnd();
                }

                @Override // p000.l74.C8654b.e
                public boolean hasStart() {
                    return ((d) this.f86607b).hasStart();
                }

                public a setEnd(int value) {
                    m23058e();
                    ((d) this.f86607b).setEnd(value);
                    return this;
                }

                public a setStart(int value) {
                    m23058e();
                    ((d) this.f86607b).setStart(value);
                    return this;
                }

                private a() {
                    super(d.DEFAULT_INSTANCE);
                }
            }

            static {
                d dVar = new d();
                DEFAULT_INSTANCE = dVar;
                u27.m23029g0(d.class, dVar);
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
                return DEFAULT_INSTANCE.m23053m();
            }

            public static d parseDelimitedFrom(InputStream input) throws IOException {
                return (d) u27.m23014R(DEFAULT_INSTANCE, input);
            }

            public static d parseFrom(ByteBuffer data) throws be8 {
                return (d) u27.m23022Z(DEFAULT_INSTANCE, data);
            }

            public static vhc<d> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setEnd(int value) {
                this.bitField0_ |= 2;
                this.end_ = value;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setStart(int value) {
                this.bitField0_ |= 1;
                this.start_ = value;
            }

            @Override // p000.l74.C8654b.e
            public int getEnd() {
                return this.end_;
            }

            @Override // p000.l74.C8654b.e
            public int getStart() {
                return this.start_;
            }

            @Override // p000.l74.C8654b.e
            public boolean hasEnd() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // p000.l74.C8654b.e
            public boolean hasStart() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // p000.u27
            /* JADX INFO: renamed from: q */
            public final Object mo79q(u27.EnumC13331i method, Object arg0, Object arg1) {
                C8652a c8652a = null;
                switch (C8652a.f56391a[method.ordinal()]) {
                    case 1:
                        return new d();
                    case 2:
                        return new a(c8652a);
                    case 3:
                        return u27.m23013P(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"bitField0_", "start_", "end_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        vhc<d> c13325c = PARSER;
                        if (c13325c == null) {
                            synchronized (d.class) {
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

            public static a newBuilder(d prototype) {
                return DEFAULT_INSTANCE.m23054n(prototype);
            }

            public static d parseDelimitedFrom(InputStream input, yi5 extensionRegistry) throws IOException {
                return (d) u27.m23015S(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static d parseFrom(ByteBuffer data, yi5 extensionRegistry) throws be8 {
                return (d) u27.m23023a0(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static d parseFrom(wj1 data) throws be8 {
                return (d) u27.m23016T(DEFAULT_INSTANCE, data);
            }

            public static d parseFrom(wj1 data, yi5 extensionRegistry) throws be8 {
                return (d) u27.m23017U(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static d parseFrom(byte[] data) throws be8 {
                return (d) u27.m23024b0(DEFAULT_INSTANCE, data);
            }

            public static d parseFrom(byte[] data, yi5 extensionRegistry) throws be8 {
                return (d) u27.m23025c0(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static d parseFrom(InputStream input) throws IOException {
                return (d) u27.m23020X(DEFAULT_INSTANCE, input);
            }

            public static d parseFrom(InputStream input, yi5 extensionRegistry) throws IOException {
                return (d) u27.m23021Y(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static d parseFrom(e72 input) throws IOException {
                return (d) u27.m23018V(DEFAULT_INSTANCE, input);
            }

            public static d parseFrom(e72 input, yi5 extensionRegistry) throws IOException {
                return (d) u27.m23019W(DEFAULT_INSTANCE, input, extensionRegistry);
            }
        }

        /* JADX INFO: renamed from: l74$b$e */
        public interface e extends ssa {
            int getEnd();

            int getStart();

            boolean hasEnd();

            boolean hasStart();
        }

        static {
            C8654b c8654b = new C8654b();
            DEFAULT_INSTANCE = c8654b;
            u27.m23029g0(C8654b.class, c8654b);
        }

        private C8654b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllEnumType(Iterable<? extends C8660e> values) {
            ensureEnumTypeIsMutable();
            AbstractC0027a3.m80a(values, this.enumType_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllExtension(Iterable<? extends C8688s> values) {
            ensureExtensionIsMutable();
            AbstractC0027a3.m80a(values, this.extension_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllExtensionRange(Iterable<? extends b> values) {
            ensureExtensionRangeIsMutable();
            AbstractC0027a3.m80a(values, this.extensionRange_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllField(Iterable<? extends C8688s> values) {
            ensureFieldIsMutable();
            AbstractC0027a3.m80a(values, this.field_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllNestedType(Iterable<? extends C8654b> values) {
            ensureNestedTypeIsMutable();
            AbstractC0027a3.m80a(values, this.nestedType_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllOneofDecl(Iterable<? extends C8673k0> values) {
            ensureOneofDeclIsMutable();
            AbstractC0027a3.m80a(values, this.oneofDecl_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllReservedName(Iterable<String> values) {
            ensureReservedNameIsMutable();
            AbstractC0027a3.m80a(values, this.reservedName_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllReservedRange(Iterable<? extends d> values) {
            ensureReservedRangeIsMutable();
            AbstractC0027a3.m80a(values, this.reservedRange_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addEnumType(C8660e value) {
            value.getClass();
            ensureEnumTypeIsMutable();
            this.enumType_.add(value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addExtension(C8688s value) {
            value.getClass();
            ensureExtensionIsMutable();
            this.extension_.add(value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addExtensionRange(b value) {
            value.getClass();
            ensureExtensionRangeIsMutable();
            this.extensionRange_.add(value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addField(C8688s value) {
            value.getClass();
            ensureFieldIsMutable();
            this.field_.add(value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addNestedType(C8654b value) {
            value.getClass();
            ensureNestedTypeIsMutable();
            this.nestedType_.add(value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addOneofDecl(C8673k0 value) {
            value.getClass();
            ensureOneofDeclIsMutable();
            this.oneofDecl_.add(value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addReservedName(String value) {
            value.getClass();
            ensureReservedNameIsMutable();
            this.reservedName_.add(value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addReservedNameBytes(wj1 value) {
            ensureReservedNameIsMutable();
            this.reservedName_.add(value.toStringUtf8());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addReservedRange(d value) {
            value.getClass();
            ensureReservedRangeIsMutable();
            this.reservedRange_.add(value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEnumType() {
            this.enumType_ = u27.m23036w();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearExtension() {
            this.extension_ = u27.m23036w();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearExtensionRange() {
            this.extensionRange_ = u27.m23036w();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearField() {
            this.field_ = u27.m23036w();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearName() {
            this.bitField0_ &= -2;
            this.name_ = getDefaultInstance().getName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNestedType() {
            this.nestedType_ = u27.m23036w();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOneofDecl() {
            this.oneofDecl_ = u27.m23036w();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOptions() {
            this.options_ = null;
            this.bitField0_ &= -3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearReservedName() {
            this.reservedName_ = u27.m23036w();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearReservedRange() {
            this.reservedRange_ = u27.m23036w();
        }

        private void ensureEnumTypeIsMutable() {
            v98.InterfaceC13956l<C8660e> interfaceC13956l = this.enumType_;
            if (interfaceC13956l.isModifiable()) {
                return;
            }
            this.enumType_ = u27.m23012O(interfaceC13956l);
        }

        private void ensureExtensionIsMutable() {
            v98.InterfaceC13956l<C8688s> interfaceC13956l = this.extension_;
            if (interfaceC13956l.isModifiable()) {
                return;
            }
            this.extension_ = u27.m23012O(interfaceC13956l);
        }

        private void ensureExtensionRangeIsMutable() {
            v98.InterfaceC13956l<b> interfaceC13956l = this.extensionRange_;
            if (interfaceC13956l.isModifiable()) {
                return;
            }
            this.extensionRange_ = u27.m23012O(interfaceC13956l);
        }

        private void ensureFieldIsMutable() {
            v98.InterfaceC13956l<C8688s> interfaceC13956l = this.field_;
            if (interfaceC13956l.isModifiable()) {
                return;
            }
            this.field_ = u27.m23012O(interfaceC13956l);
        }

        private void ensureNestedTypeIsMutable() {
            v98.InterfaceC13956l<C8654b> interfaceC13956l = this.nestedType_;
            if (interfaceC13956l.isModifiable()) {
                return;
            }
            this.nestedType_ = u27.m23012O(interfaceC13956l);
        }

        private void ensureOneofDeclIsMutable() {
            v98.InterfaceC13956l<C8673k0> interfaceC13956l = this.oneofDecl_;
            if (interfaceC13956l.isModifiable()) {
                return;
            }
            this.oneofDecl_ = u27.m23012O(interfaceC13956l);
        }

        private void ensureReservedNameIsMutable() {
            v98.InterfaceC13956l<String> interfaceC13956l = this.reservedName_;
            if (interfaceC13956l.isModifiable()) {
                return;
            }
            this.reservedName_ = u27.m23012O(interfaceC13956l);
        }

        private void ensureReservedRangeIsMutable() {
            v98.InterfaceC13956l<d> interfaceC13956l = this.reservedRange_;
            if (interfaceC13956l.isModifiable()) {
                return;
            }
            this.reservedRange_ = u27.m23012O(interfaceC13956l);
        }

        public static C8654b getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public void mergeOptions(C8661e0 value) {
            value.getClass();
            C8661e0 c8661e0 = this.options_;
            if (c8661e0 == null || c8661e0 == C8661e0.getDefaultInstance()) {
                this.options_ = value;
            } else {
                this.options_ = ((C8661e0.a) C8661e0.newBuilder(this.options_).mergeFrom(value)).buildPartial();
            }
            this.bitField0_ |= 2;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.m23053m();
        }

        public static C8654b parseDelimitedFrom(InputStream input) throws IOException {
            return (C8654b) u27.m23014R(DEFAULT_INSTANCE, input);
        }

        public static C8654b parseFrom(ByteBuffer data) throws be8 {
            return (C8654b) u27.m23022Z(DEFAULT_INSTANCE, data);
        }

        public static vhc<C8654b> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeEnumType(int index) {
            ensureEnumTypeIsMutable();
            this.enumType_.remove(index);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeExtension(int index) {
            ensureExtensionIsMutable();
            this.extension_.remove(index);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeExtensionRange(int index) {
            ensureExtensionRangeIsMutable();
            this.extensionRange_.remove(index);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeField(int index) {
            ensureFieldIsMutable();
            this.field_.remove(index);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeNestedType(int index) {
            ensureNestedTypeIsMutable();
            this.nestedType_.remove(index);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeOneofDecl(int index) {
            ensureOneofDeclIsMutable();
            this.oneofDecl_.remove(index);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeReservedRange(int index) {
            ensureReservedRangeIsMutable();
            this.reservedRange_.remove(index);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEnumType(int index, C8660e value) {
            value.getClass();
            ensureEnumTypeIsMutable();
            this.enumType_.set(index, value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setExtension(int index, C8688s value) {
            value.getClass();
            ensureExtensionIsMutable();
            this.extension_.set(index, value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setExtensionRange(int index, b value) {
            value.getClass();
            ensureExtensionRangeIsMutable();
            this.extensionRange_.set(index, value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setField(int index, C8688s value) {
            value.getClass();
            ensureFieldIsMutable();
            this.field_.set(index, value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setName(String value) {
            value.getClass();
            this.bitField0_ |= 1;
            this.name_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNameBytes(wj1 value) {
            this.name_ = value.toStringUtf8();
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNestedType(int index, C8654b value) {
            value.getClass();
            ensureNestedTypeIsMutable();
            this.nestedType_.set(index, value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOneofDecl(int index, C8673k0 value) {
            value.getClass();
            ensureOneofDeclIsMutable();
            this.oneofDecl_.set(index, value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOptions(C8661e0 value) {
            value.getClass();
            this.options_ = value;
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setReservedName(int index, String value) {
            value.getClass();
            ensureReservedNameIsMutable();
            this.reservedName_.set(index, value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setReservedRange(int index, d value) {
            value.getClass();
            ensureReservedRangeIsMutable();
            this.reservedRange_.set(index, value);
        }

        @Override // p000.l74.InterfaceC8656c
        public C8660e getEnumType(int index) {
            return this.enumType_.get(index);
        }

        @Override // p000.l74.InterfaceC8656c
        public int getEnumTypeCount() {
            return this.enumType_.size();
        }

        @Override // p000.l74.InterfaceC8656c
        public List<C8660e> getEnumTypeList() {
            return this.enumType_;
        }

        public InterfaceC8662f getEnumTypeOrBuilder(int index) {
            return this.enumType_.get(index);
        }

        public List<? extends InterfaceC8662f> getEnumTypeOrBuilderList() {
            return this.enumType_;
        }

        @Override // p000.l74.InterfaceC8656c
        public C8688s getExtension(int index) {
            return this.extension_.get(index);
        }

        @Override // p000.l74.InterfaceC8656c
        public int getExtensionCount() {
            return this.extension_.size();
        }

        @Override // p000.l74.InterfaceC8656c
        public List<C8688s> getExtensionList() {
            return this.extension_;
        }

        public InterfaceC8690t getExtensionOrBuilder(int index) {
            return this.extension_.get(index);
        }

        public List<? extends InterfaceC8690t> getExtensionOrBuilderList() {
            return this.extension_;
        }

        @Override // p000.l74.InterfaceC8656c
        public b getExtensionRange(int index) {
            return this.extensionRange_.get(index);
        }

        @Override // p000.l74.InterfaceC8656c
        public int getExtensionRangeCount() {
            return this.extensionRange_.size();
        }

        @Override // p000.l74.InterfaceC8656c
        public List<b> getExtensionRangeList() {
            return this.extensionRange_;
        }

        public c getExtensionRangeOrBuilder(int index) {
            return this.extensionRange_.get(index);
        }

        public List<? extends c> getExtensionRangeOrBuilderList() {
            return this.extensionRange_;
        }

        @Override // p000.l74.InterfaceC8656c
        public C8688s getField(int index) {
            return this.field_.get(index);
        }

        @Override // p000.l74.InterfaceC8656c
        public int getFieldCount() {
            return this.field_.size();
        }

        @Override // p000.l74.InterfaceC8656c
        public List<C8688s> getFieldList() {
            return this.field_;
        }

        public InterfaceC8690t getFieldOrBuilder(int index) {
            return this.field_.get(index);
        }

        public List<? extends InterfaceC8690t> getFieldOrBuilderList() {
            return this.field_;
        }

        @Override // p000.l74.InterfaceC8656c
        public String getName() {
            return this.name_;
        }

        @Override // p000.l74.InterfaceC8656c
        public wj1 getNameBytes() {
            return wj1.copyFromUtf8(this.name_);
        }

        @Override // p000.l74.InterfaceC8656c
        public C8654b getNestedType(int index) {
            return this.nestedType_.get(index);
        }

        @Override // p000.l74.InterfaceC8656c
        public int getNestedTypeCount() {
            return this.nestedType_.size();
        }

        @Override // p000.l74.InterfaceC8656c
        public List<C8654b> getNestedTypeList() {
            return this.nestedType_;
        }

        public InterfaceC8656c getNestedTypeOrBuilder(int index) {
            return this.nestedType_.get(index);
        }

        public List<? extends InterfaceC8656c> getNestedTypeOrBuilderList() {
            return this.nestedType_;
        }

        @Override // p000.l74.InterfaceC8656c
        public C8673k0 getOneofDecl(int index) {
            return this.oneofDecl_.get(index);
        }

        @Override // p000.l74.InterfaceC8656c
        public int getOneofDeclCount() {
            return this.oneofDecl_.size();
        }

        @Override // p000.l74.InterfaceC8656c
        public List<C8673k0> getOneofDeclList() {
            return this.oneofDecl_;
        }

        public InterfaceC8675l0 getOneofDeclOrBuilder(int index) {
            return this.oneofDecl_.get(index);
        }

        public List<? extends InterfaceC8675l0> getOneofDeclOrBuilderList() {
            return this.oneofDecl_;
        }

        @Override // p000.l74.InterfaceC8656c
        public C8661e0 getOptions() {
            C8661e0 c8661e0 = this.options_;
            return c8661e0 == null ? C8661e0.getDefaultInstance() : c8661e0;
        }

        @Override // p000.l74.InterfaceC8656c
        public String getReservedName(int index) {
            return this.reservedName_.get(index);
        }

        @Override // p000.l74.InterfaceC8656c
        public wj1 getReservedNameBytes(int index) {
            return wj1.copyFromUtf8(this.reservedName_.get(index));
        }

        @Override // p000.l74.InterfaceC8656c
        public int getReservedNameCount() {
            return this.reservedName_.size();
        }

        @Override // p000.l74.InterfaceC8656c
        public List<String> getReservedNameList() {
            return this.reservedName_;
        }

        @Override // p000.l74.InterfaceC8656c
        public d getReservedRange(int index) {
            return this.reservedRange_.get(index);
        }

        @Override // p000.l74.InterfaceC8656c
        public int getReservedRangeCount() {
            return this.reservedRange_.size();
        }

        @Override // p000.l74.InterfaceC8656c
        public List<d> getReservedRangeList() {
            return this.reservedRange_;
        }

        public e getReservedRangeOrBuilder(int index) {
            return this.reservedRange_.get(index);
        }

        public List<? extends e> getReservedRangeOrBuilderList() {
            return this.reservedRange_;
        }

        @Override // p000.l74.InterfaceC8656c
        public boolean hasName() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // p000.l74.InterfaceC8656c
        public boolean hasOptions() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // p000.u27
        /* JADX INFO: renamed from: q */
        public final Object mo79q(u27.EnumC13331i method, Object arg0, Object arg1) {
            C8652a c8652a = null;
            switch (C8652a.f56391a[method.ordinal()]) {
                case 1:
                    return new C8654b();
                case 2:
                    return new a(c8652a);
                case 3:
                    return u27.m23013P(DEFAULT_INSTANCE, "\u0001\n\u0000\u0001\u0001\n\n\u0000\b\u0007\u0001ဈ\u0000\u0002Л\u0003Л\u0004Л\u0005Л\u0006Л\u0007ᐉ\u0001\bЛ\t\u001b\n\u001a", new Object[]{"bitField0_", "name_", "field_", C8688s.class, "nestedType_", C8654b.class, "enumType_", C8660e.class, "extensionRange_", b.class, "extension_", C8688s.class, "options_", "oneofDecl_", C8673k0.class, "reservedRange_", d.class, "reservedName_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    vhc<C8654b> c13325c = PARSER;
                    if (c13325c == null) {
                        synchronized (C8654b.class) {
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
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    this.memoizedIsInitialized = (byte) (arg0 == null ? 0 : 1);
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public static a newBuilder(C8654b prototype) {
            return DEFAULT_INSTANCE.m23054n(prototype);
        }

        public static C8654b parseDelimitedFrom(InputStream input, yi5 extensionRegistry) throws IOException {
            return (C8654b) u27.m23015S(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static C8654b parseFrom(ByteBuffer data, yi5 extensionRegistry) throws be8 {
            return (C8654b) u27.m23023a0(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static C8654b parseFrom(wj1 data) throws be8 {
            return (C8654b) u27.m23016T(DEFAULT_INSTANCE, data);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addEnumType(int index, C8660e value) {
            value.getClass();
            ensureEnumTypeIsMutable();
            this.enumType_.add(index, value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addExtension(int index, C8688s value) {
            value.getClass();
            ensureExtensionIsMutable();
            this.extension_.add(index, value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addExtensionRange(int index, b value) {
            value.getClass();
            ensureExtensionRangeIsMutable();
            this.extensionRange_.add(index, value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addField(int index, C8688s value) {
            value.getClass();
            ensureFieldIsMutable();
            this.field_.add(index, value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addNestedType(int index, C8654b value) {
            value.getClass();
            ensureNestedTypeIsMutable();
            this.nestedType_.add(index, value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addOneofDecl(int index, C8673k0 value) {
            value.getClass();
            ensureOneofDeclIsMutable();
            this.oneofDecl_.add(index, value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addReservedRange(int index, d value) {
            value.getClass();
            ensureReservedRangeIsMutable();
            this.reservedRange_.add(index, value);
        }

        public static C8654b parseFrom(wj1 data, yi5 extensionRegistry) throws be8 {
            return (C8654b) u27.m23017U(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static C8654b parseFrom(byte[] data) throws be8 {
            return (C8654b) u27.m23024b0(DEFAULT_INSTANCE, data);
        }

        public static C8654b parseFrom(byte[] data, yi5 extensionRegistry) throws be8 {
            return (C8654b) u27.m23025c0(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static C8654b parseFrom(InputStream input) throws IOException {
            return (C8654b) u27.m23020X(DEFAULT_INSTANCE, input);
        }

        public static C8654b parseFrom(InputStream input, yi5 extensionRegistry) throws IOException {
            return (C8654b) u27.m23021Y(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static C8654b parseFrom(e72 input) throws IOException {
            return (C8654b) u27.m23018V(DEFAULT_INSTANCE, input);
        }

        public static C8654b parseFrom(e72 input, yi5 extensionRegistry) throws IOException {
            return (C8654b) u27.m23019W(DEFAULT_INSTANCE, input, extensionRegistry);
        }
    }

    /* JADX INFO: renamed from: l74$b0 */
    public interface InterfaceC8655b0 extends u27.InterfaceC13328f<C8653a0, C8653a0.a> {
        boolean getCcEnableArenas();

        boolean getCcGenericServices();

        String getCsharpNamespace();

        wj1 getCsharpNamespaceBytes();

        boolean getDeprecated();

        C8680o getFeatures();

        String getGoPackage();

        wj1 getGoPackageBytes();

        @Deprecated
        boolean getJavaGenerateEqualsAndHash();

        boolean getJavaGenericServices();

        boolean getJavaMultipleFiles();

        String getJavaOuterClassname();

        wj1 getJavaOuterClassnameBytes();

        String getJavaPackage();

        wj1 getJavaPackageBytes();

        boolean getJavaStringCheckUtf8();

        String getObjcClassPrefix();

        wj1 getObjcClassPrefixBytes();

        C8653a0.b getOptimizeFor();

        String getPhpClassPrefix();

        wj1 getPhpClassPrefixBytes();

        String getPhpMetadataNamespace();

        wj1 getPhpMetadataNamespaceBytes();

        String getPhpNamespace();

        wj1 getPhpNamespaceBytes();

        boolean getPyGenericServices();

        String getRubyPackage();

        wj1 getRubyPackageBytes();

        String getSwiftPrefix();

        wj1 getSwiftPrefixBytes();

        C8693u0 getUninterpretedOption(int index);

        int getUninterpretedOptionCount();

        List<C8693u0> getUninterpretedOptionList();

        boolean hasCcEnableArenas();

        boolean hasCcGenericServices();

        boolean hasCsharpNamespace();

        boolean hasDeprecated();

        boolean hasFeatures();

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

        boolean hasPhpMetadataNamespace();

        boolean hasPhpNamespace();

        boolean hasPyGenericServices();

        boolean hasRubyPackage();

        boolean hasSwiftPrefix();
    }

    /* JADX INFO: renamed from: l74$c */
    public interface InterfaceC8656c extends ssa {
        C8660e getEnumType(int index);

        int getEnumTypeCount();

        List<C8660e> getEnumTypeList();

        C8688s getExtension(int index);

        int getExtensionCount();

        List<C8688s> getExtensionList();

        C8654b.b getExtensionRange(int index);

        int getExtensionRangeCount();

        List<C8654b.b> getExtensionRangeList();

        C8688s getField(int index);

        int getFieldCount();

        List<C8688s> getFieldList();

        String getName();

        wj1 getNameBytes();

        C8654b getNestedType(int index);

        int getNestedTypeCount();

        List<C8654b> getNestedTypeList();

        C8673k0 getOneofDecl(int index);

        int getOneofDeclCount();

        List<C8673k0> getOneofDeclList();

        C8661e0 getOptions();

        String getReservedName(int index);

        wj1 getReservedNameBytes(int index);

        int getReservedNameCount();

        List<String> getReservedNameList();

        C8654b.d getReservedRange(int index);

        int getReservedRangeCount();

        List<C8654b.d> getReservedRangeList();

        boolean hasName();

        boolean hasOptions();
    }

    /* JADX INFO: renamed from: l74$c0 */
    public static final class C8657c0 extends u27<C8657c0, c> implements InterfaceC8659d0 {
        public static final int ANNOTATION_FIELD_NUMBER = 1;
        private static final C8657c0 DEFAULT_INSTANCE;
        private static volatile vhc<C8657c0> PARSER;
        private v98.InterfaceC13956l<a> annotation_ = u27.m23036w();

        /* JADX INFO: renamed from: l74$c0$a */
        public static final class a extends u27<a, C16465a> implements b {
            public static final int BEGIN_FIELD_NUMBER = 3;
            private static final a DEFAULT_INSTANCE;
            public static final int END_FIELD_NUMBER = 4;
            private static volatile vhc<a> PARSER = null;
            public static final int PATH_FIELD_NUMBER = 1;
            public static final int SEMANTIC_FIELD_NUMBER = 5;
            public static final int SOURCE_FILE_FIELD_NUMBER = 2;
            private int begin_;
            private int bitField0_;
            private int end_;
            private int semantic_;
            private int pathMemoizedSerializedSize = -1;
            private v98.InterfaceC13951g path_ = u27.m23034u();
            private String sourceFile_ = "";

            /* JADX INFO: renamed from: l74$c0$a$a, reason: collision with other inner class name */
            public static final class C16465a extends u27.AbstractC13324b<a, C16465a> implements b {
                public /* synthetic */ C16465a(C8652a c8652a) {
                    this();
                }

                public C16465a addAllPath(Iterable<? extends Integer> values) {
                    m23058e();
                    ((a) this.f86607b).addAllPath(values);
                    return this;
                }

                public C16465a addPath(int value) {
                    m23058e();
                    ((a) this.f86607b).addPath(value);
                    return this;
                }

                public C16465a clearBegin() {
                    m23058e();
                    ((a) this.f86607b).clearBegin();
                    return this;
                }

                public C16465a clearEnd() {
                    m23058e();
                    ((a) this.f86607b).clearEnd();
                    return this;
                }

                public C16465a clearPath() {
                    m23058e();
                    ((a) this.f86607b).clearPath();
                    return this;
                }

                public C16465a clearSemantic() {
                    m23058e();
                    ((a) this.f86607b).clearSemantic();
                    return this;
                }

                public C16465a clearSourceFile() {
                    m23058e();
                    ((a) this.f86607b).clearSourceFile();
                    return this;
                }

                @Override // p000.l74.C8657c0.b
                public int getBegin() {
                    return ((a) this.f86607b).getBegin();
                }

                @Override // p000.l74.C8657c0.b
                public int getEnd() {
                    return ((a) this.f86607b).getEnd();
                }

                @Override // p000.l74.C8657c0.b
                public int getPath(int index) {
                    return ((a) this.f86607b).getPath(index);
                }

                @Override // p000.l74.C8657c0.b
                public int getPathCount() {
                    return ((a) this.f86607b).getPathCount();
                }

                @Override // p000.l74.C8657c0.b
                public List<Integer> getPathList() {
                    return Collections.unmodifiableList(((a) this.f86607b).getPathList());
                }

                @Override // p000.l74.C8657c0.b
                public b getSemantic() {
                    return ((a) this.f86607b).getSemantic();
                }

                @Override // p000.l74.C8657c0.b
                public String getSourceFile() {
                    return ((a) this.f86607b).getSourceFile();
                }

                @Override // p000.l74.C8657c0.b
                public wj1 getSourceFileBytes() {
                    return ((a) this.f86607b).getSourceFileBytes();
                }

                @Override // p000.l74.C8657c0.b
                public boolean hasBegin() {
                    return ((a) this.f86607b).hasBegin();
                }

                @Override // p000.l74.C8657c0.b
                public boolean hasEnd() {
                    return ((a) this.f86607b).hasEnd();
                }

                @Override // p000.l74.C8657c0.b
                public boolean hasSemantic() {
                    return ((a) this.f86607b).hasSemantic();
                }

                @Override // p000.l74.C8657c0.b
                public boolean hasSourceFile() {
                    return ((a) this.f86607b).hasSourceFile();
                }

                public C16465a setBegin(int value) {
                    m23058e();
                    ((a) this.f86607b).setBegin(value);
                    return this;
                }

                public C16465a setEnd(int value) {
                    m23058e();
                    ((a) this.f86607b).setEnd(value);
                    return this;
                }

                public C16465a setPath(int index, int value) {
                    m23058e();
                    ((a) this.f86607b).setPath(index, value);
                    return this;
                }

                public C16465a setSemantic(b value) {
                    m23058e();
                    ((a) this.f86607b).setSemantic(value);
                    return this;
                }

                public C16465a setSourceFile(String value) {
                    m23058e();
                    ((a) this.f86607b).setSourceFile(value);
                    return this;
                }

                public C16465a setSourceFileBytes(wj1 value) {
                    m23058e();
                    ((a) this.f86607b).setSourceFileBytes(value);
                    return this;
                }

                private C16465a() {
                    super(a.DEFAULT_INSTANCE);
                }
            }

            /* JADX INFO: renamed from: l74$c0$a$b */
            public enum b implements v98.InterfaceC13947c {
                NONE(0),
                SET(1),
                ALIAS(2);


                /* JADX INFO: renamed from: C */
                public static final v98.InterfaceC13948d<b> f56402C = new C16466a();

                /* JADX INFO: renamed from: e */
                public static final int f56407e = 0;

                /* JADX INFO: renamed from: f */
                public static final int f56408f = 1;

                /* JADX INFO: renamed from: m */
                public static final int f56409m = 2;

                /* JADX INFO: renamed from: a */
                public final int f56410a;

                /* JADX INFO: renamed from: l74$c0$a$b$a, reason: collision with other inner class name */
                public class C16466a implements v98.InterfaceC13948d<b> {
                    @Override // p000.v98.InterfaceC13948d
                    public b findValueByNumber(int number) {
                        return b.forNumber(number);
                    }
                }

                /* JADX INFO: renamed from: l74$c0$a$b$b, reason: collision with other inner class name */
                public static final class C16467b implements v98.InterfaceC13949e {

                    /* JADX INFO: renamed from: a */
                    public static final v98.InterfaceC13949e f56411a = new C16467b();

                    private C16467b() {
                    }

                    @Override // p000.v98.InterfaceC13949e
                    public boolean isInRange(int number) {
                        return b.forNumber(number) != null;
                    }
                }

                b(int value) {
                    this.f56410a = value;
                }

                public static b forNumber(int value) {
                    if (value == 0) {
                        return NONE;
                    }
                    if (value == 1) {
                        return SET;
                    }
                    if (value != 2) {
                        return null;
                    }
                    return ALIAS;
                }

                public static v98.InterfaceC13948d<b> internalGetValueMap() {
                    return f56402C;
                }

                public static v98.InterfaceC13949e internalGetVerifier() {
                    return C16467b.f56411a;
                }

                @Override // p000.v98.InterfaceC13947c
                public final int getNumber() {
                    return this.f56410a;
                }

                @Deprecated
                public static b valueOf(int value) {
                    return forNumber(value);
                }
            }

            static {
                a aVar = new a();
                DEFAULT_INSTANCE = aVar;
                u27.m23029g0(a.class, aVar);
            }

            private a() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addAllPath(Iterable<? extends Integer> values) {
                ensurePathIsMutable();
                AbstractC0027a3.m80a(values, this.path_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addPath(int value) {
                ensurePathIsMutable();
                this.path_.addInt(value);
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
                this.path_ = u27.m23034u();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearSemantic() {
                this.bitField0_ &= -9;
                this.semantic_ = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearSourceFile() {
                this.bitField0_ &= -2;
                this.sourceFile_ = getDefaultInstance().getSourceFile();
            }

            private void ensurePathIsMutable() {
                v98.InterfaceC13951g interfaceC13951g = this.path_;
                if (interfaceC13951g.isModifiable()) {
                    return;
                }
                this.path_ = u27.m23010M(interfaceC13951g);
            }

            public static a getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static C16465a newBuilder() {
                return DEFAULT_INSTANCE.m23053m();
            }

            public static a parseDelimitedFrom(InputStream input) throws IOException {
                return (a) u27.m23014R(DEFAULT_INSTANCE, input);
            }

            public static a parseFrom(ByteBuffer data) throws be8 {
                return (a) u27.m23022Z(DEFAULT_INSTANCE, data);
            }

            public static vhc<a> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setBegin(int value) {
                this.bitField0_ |= 2;
                this.begin_ = value;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setEnd(int value) {
                this.bitField0_ |= 4;
                this.end_ = value;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setPath(int index, int value) {
                ensurePathIsMutable();
                this.path_.setInt(index, value);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setSemantic(b value) {
                this.semantic_ = value.getNumber();
                this.bitField0_ |= 8;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setSourceFile(String value) {
                value.getClass();
                this.bitField0_ |= 1;
                this.sourceFile_ = value;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setSourceFileBytes(wj1 value) {
                this.sourceFile_ = value.toStringUtf8();
                this.bitField0_ |= 1;
            }

            @Override // p000.l74.C8657c0.b
            public int getBegin() {
                return this.begin_;
            }

            @Override // p000.l74.C8657c0.b
            public int getEnd() {
                return this.end_;
            }

            @Override // p000.l74.C8657c0.b
            public int getPath(int index) {
                return this.path_.getInt(index);
            }

            @Override // p000.l74.C8657c0.b
            public int getPathCount() {
                return this.path_.size();
            }

            @Override // p000.l74.C8657c0.b
            public List<Integer> getPathList() {
                return this.path_;
            }

            @Override // p000.l74.C8657c0.b
            public b getSemantic() {
                b bVarForNumber = b.forNumber(this.semantic_);
                return bVarForNumber == null ? b.NONE : bVarForNumber;
            }

            @Override // p000.l74.C8657c0.b
            public String getSourceFile() {
                return this.sourceFile_;
            }

            @Override // p000.l74.C8657c0.b
            public wj1 getSourceFileBytes() {
                return wj1.copyFromUtf8(this.sourceFile_);
            }

            @Override // p000.l74.C8657c0.b
            public boolean hasBegin() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // p000.l74.C8657c0.b
            public boolean hasEnd() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // p000.l74.C8657c0.b
            public boolean hasSemantic() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // p000.l74.C8657c0.b
            public boolean hasSourceFile() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // p000.u27
            /* JADX INFO: renamed from: q */
            public final Object mo79q(u27.EnumC13331i method, Object arg0, Object arg1) {
                C8652a c8652a = null;
                switch (C8652a.f56391a[method.ordinal()]) {
                    case 1:
                        return new a();
                    case 2:
                        return new C16465a(c8652a);
                    case 3:
                        return u27.m23013P(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001'\u0002ဈ\u0000\u0003င\u0001\u0004င\u0002\u0005᠌\u0003", new Object[]{"bitField0_", "path_", "sourceFile_", "begin_", "end_", "semantic_", b.internalGetVerifier()});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        vhc<a> c13325c = PARSER;
                        if (c13325c == null) {
                            synchronized (a.class) {
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

            public static C16465a newBuilder(a prototype) {
                return DEFAULT_INSTANCE.m23054n(prototype);
            }

            public static a parseDelimitedFrom(InputStream input, yi5 extensionRegistry) throws IOException {
                return (a) u27.m23015S(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static a parseFrom(ByteBuffer data, yi5 extensionRegistry) throws be8 {
                return (a) u27.m23023a0(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static a parseFrom(wj1 data) throws be8 {
                return (a) u27.m23016T(DEFAULT_INSTANCE, data);
            }

            public static a parseFrom(wj1 data, yi5 extensionRegistry) throws be8 {
                return (a) u27.m23017U(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static a parseFrom(byte[] data) throws be8 {
                return (a) u27.m23024b0(DEFAULT_INSTANCE, data);
            }

            public static a parseFrom(byte[] data, yi5 extensionRegistry) throws be8 {
                return (a) u27.m23025c0(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static a parseFrom(InputStream input) throws IOException {
                return (a) u27.m23020X(DEFAULT_INSTANCE, input);
            }

            public static a parseFrom(InputStream input, yi5 extensionRegistry) throws IOException {
                return (a) u27.m23021Y(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static a parseFrom(e72 input) throws IOException {
                return (a) u27.m23018V(DEFAULT_INSTANCE, input);
            }

            public static a parseFrom(e72 input, yi5 extensionRegistry) throws IOException {
                return (a) u27.m23019W(DEFAULT_INSTANCE, input, extensionRegistry);
            }
        }

        /* JADX INFO: renamed from: l74$c0$b */
        public interface b extends ssa {
            int getBegin();

            int getEnd();

            int getPath(int index);

            int getPathCount();

            List<Integer> getPathList();

            a.b getSemantic();

            String getSourceFile();

            wj1 getSourceFileBytes();

            boolean hasBegin();

            boolean hasEnd();

            boolean hasSemantic();

            boolean hasSourceFile();
        }

        /* JADX INFO: renamed from: l74$c0$c */
        public static final class c extends u27.AbstractC13324b<C8657c0, c> implements InterfaceC8659d0 {
            public /* synthetic */ c(C8652a c8652a) {
                this();
            }

            public c addAllAnnotation(Iterable<? extends a> values) {
                m23058e();
                ((C8657c0) this.f86607b).addAllAnnotation(values);
                return this;
            }

            public c addAnnotation(a value) {
                m23058e();
                ((C8657c0) this.f86607b).addAnnotation(value);
                return this;
            }

            public c clearAnnotation() {
                m23058e();
                ((C8657c0) this.f86607b).clearAnnotation();
                return this;
            }

            @Override // p000.l74.InterfaceC8659d0
            public a getAnnotation(int index) {
                return ((C8657c0) this.f86607b).getAnnotation(index);
            }

            @Override // p000.l74.InterfaceC8659d0
            public int getAnnotationCount() {
                return ((C8657c0) this.f86607b).getAnnotationCount();
            }

            @Override // p000.l74.InterfaceC8659d0
            public List<a> getAnnotationList() {
                return Collections.unmodifiableList(((C8657c0) this.f86607b).getAnnotationList());
            }

            public c removeAnnotation(int index) {
                m23058e();
                ((C8657c0) this.f86607b).removeAnnotation(index);
                return this;
            }

            public c setAnnotation(int index, a value) {
                m23058e();
                ((C8657c0) this.f86607b).setAnnotation(index, value);
                return this;
            }

            private c() {
                super(C8657c0.DEFAULT_INSTANCE);
            }

            public c addAnnotation(int index, a value) {
                m23058e();
                ((C8657c0) this.f86607b).addAnnotation(index, value);
                return this;
            }

            public c setAnnotation(int index, a.C16465a builderForValue) {
                m23058e();
                ((C8657c0) this.f86607b).setAnnotation(index, builderForValue.build());
                return this;
            }

            public c addAnnotation(a.C16465a builderForValue) {
                m23058e();
                ((C8657c0) this.f86607b).addAnnotation(builderForValue.build());
                return this;
            }

            public c addAnnotation(int index, a.C16465a builderForValue) {
                m23058e();
                ((C8657c0) this.f86607b).addAnnotation(index, builderForValue.build());
                return this;
            }
        }

        static {
            C8657c0 c8657c0 = new C8657c0();
            DEFAULT_INSTANCE = c8657c0;
            u27.m23029g0(C8657c0.class, c8657c0);
        }

        private C8657c0() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllAnnotation(Iterable<? extends a> values) {
            ensureAnnotationIsMutable();
            AbstractC0027a3.m80a(values, this.annotation_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAnnotation(a value) {
            value.getClass();
            ensureAnnotationIsMutable();
            this.annotation_.add(value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAnnotation() {
            this.annotation_ = u27.m23036w();
        }

        private void ensureAnnotationIsMutable() {
            v98.InterfaceC13956l<a> interfaceC13956l = this.annotation_;
            if (interfaceC13956l.isModifiable()) {
                return;
            }
            this.annotation_ = u27.m23012O(interfaceC13956l);
        }

        public static C8657c0 getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static c newBuilder() {
            return DEFAULT_INSTANCE.m23053m();
        }

        public static C8657c0 parseDelimitedFrom(InputStream input) throws IOException {
            return (C8657c0) u27.m23014R(DEFAULT_INSTANCE, input);
        }

        public static C8657c0 parseFrom(ByteBuffer data) throws be8 {
            return (C8657c0) u27.m23022Z(DEFAULT_INSTANCE, data);
        }

        public static vhc<C8657c0> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeAnnotation(int index) {
            ensureAnnotationIsMutable();
            this.annotation_.remove(index);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAnnotation(int index, a value) {
            value.getClass();
            ensureAnnotationIsMutable();
            this.annotation_.set(index, value);
        }

        @Override // p000.l74.InterfaceC8659d0
        public a getAnnotation(int index) {
            return this.annotation_.get(index);
        }

        @Override // p000.l74.InterfaceC8659d0
        public int getAnnotationCount() {
            return this.annotation_.size();
        }

        @Override // p000.l74.InterfaceC8659d0
        public List<a> getAnnotationList() {
            return this.annotation_;
        }

        public b getAnnotationOrBuilder(int index) {
            return this.annotation_.get(index);
        }

        public List<? extends b> getAnnotationOrBuilderList() {
            return this.annotation_;
        }

        @Override // p000.u27
        /* JADX INFO: renamed from: q */
        public final Object mo79q(u27.EnumC13331i method, Object arg0, Object arg1) {
            C8652a c8652a = null;
            switch (C8652a.f56391a[method.ordinal()]) {
                case 1:
                    return new C8657c0();
                case 2:
                    return new c(c8652a);
                case 3:
                    return u27.m23013P(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"annotation_", a.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    vhc<C8657c0> c13325c = PARSER;
                    if (c13325c == null) {
                        synchronized (C8657c0.class) {
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

        public static c newBuilder(C8657c0 prototype) {
            return DEFAULT_INSTANCE.m23054n(prototype);
        }

        public static C8657c0 parseDelimitedFrom(InputStream input, yi5 extensionRegistry) throws IOException {
            return (C8657c0) u27.m23015S(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static C8657c0 parseFrom(ByteBuffer data, yi5 extensionRegistry) throws be8 {
            return (C8657c0) u27.m23023a0(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static C8657c0 parseFrom(wj1 data) throws be8 {
            return (C8657c0) u27.m23016T(DEFAULT_INSTANCE, data);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAnnotation(int index, a value) {
            value.getClass();
            ensureAnnotationIsMutable();
            this.annotation_.add(index, value);
        }

        public static C8657c0 parseFrom(wj1 data, yi5 extensionRegistry) throws be8 {
            return (C8657c0) u27.m23017U(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static C8657c0 parseFrom(byte[] data) throws be8 {
            return (C8657c0) u27.m23024b0(DEFAULT_INSTANCE, data);
        }

        public static C8657c0 parseFrom(byte[] data, yi5 extensionRegistry) throws be8 {
            return (C8657c0) u27.m23025c0(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static C8657c0 parseFrom(InputStream input) throws IOException {
            return (C8657c0) u27.m23020X(DEFAULT_INSTANCE, input);
        }

        public static C8657c0 parseFrom(InputStream input, yi5 extensionRegistry) throws IOException {
            return (C8657c0) u27.m23021Y(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static C8657c0 parseFrom(e72 input) throws IOException {
            return (C8657c0) u27.m23018V(DEFAULT_INSTANCE, input);
        }

        public static C8657c0 parseFrom(e72 input, yi5 extensionRegistry) throws IOException {
            return (C8657c0) u27.m23019W(DEFAULT_INSTANCE, input, extensionRegistry);
        }
    }

    /* JADX INFO: renamed from: l74$d */
    public enum EnumC8658d implements v98.InterfaceC13947c {
        EDITION_UNKNOWN(0),
        EDITION_LEGACY(900),
        EDITION_PROTO2(f56422Y),
        EDITION_PROTO3(999),
        EDITION_2023(1000),
        EDITION_2024(1001),
        EDITION_1_TEST_ONLY(1),
        EDITION_2_TEST_ONLY(2),
        EDITION_99997_TEST_ONLY(f56427b2),
        EDITION_99998_TEST_ONLY(f56429c2),
        EDITION_99999_TEST_ONLY(f56431d2),
        EDITION_MAX(Integer.MAX_VALUE);


        /* JADX INFO: renamed from: M1 */
        public static final int f56417M1 = 1000;

        /* JADX INFO: renamed from: Q */
        public static final int f56419Q = 0;

        /* JADX INFO: renamed from: V1 */
        public static final int f56420V1 = 1001;

        /* JADX INFO: renamed from: X */
        public static final int f56421X = 900;

        /* JADX INFO: renamed from: Y */
        public static final int f56422Y = 998;

        /* JADX INFO: renamed from: Z */
        public static final int f56423Z = 999;

        /* JADX INFO: renamed from: Z1 */
        public static final int f56424Z1 = 1;

        /* JADX INFO: renamed from: a2 */
        public static final int f56425a2 = 2;

        /* JADX INFO: renamed from: b2 */
        public static final int f56427b2 = 99997;

        /* JADX INFO: renamed from: c2 */
        public static final int f56429c2 = 99998;

        /* JADX INFO: renamed from: d2 */
        public static final int f56431d2 = 99999;

        /* JADX INFO: renamed from: e2 */
        public static final int f56433e2 = Integer.MAX_VALUE;

        /* JADX INFO: renamed from: f2 */
        public static final v98.InterfaceC13948d<EnumC8658d> f56435f2 = new a();

        /* JADX INFO: renamed from: a */
        public final int f56438a;

        /* JADX INFO: renamed from: l74$d$a */
        public class a implements v98.InterfaceC13948d<EnumC8658d> {
            @Override // p000.v98.InterfaceC13948d
            public EnumC8658d findValueByNumber(int number) {
                return EnumC8658d.forNumber(number);
            }
        }

        /* JADX INFO: renamed from: l74$d$b */
        public static final class b implements v98.InterfaceC13949e {

            /* JADX INFO: renamed from: a */
            public static final v98.InterfaceC13949e f56439a = new b();

            private b() {
            }

            @Override // p000.v98.InterfaceC13949e
            public boolean isInRange(int number) {
                return EnumC8658d.forNumber(number) != null;
            }
        }

        EnumC8658d(int value) {
            this.f56438a = value;
        }

        public static EnumC8658d forNumber(int value) {
            if (value == 0) {
                return EDITION_UNKNOWN;
            }
            if (value == 1) {
                return EDITION_1_TEST_ONLY;
            }
            if (value == 2) {
                return EDITION_2_TEST_ONLY;
            }
            if (value == 900) {
                return EDITION_LEGACY;
            }
            if (value == Integer.MAX_VALUE) {
                return EDITION_MAX;
            }
            switch (value) {
                case f56422Y:
                    return EDITION_PROTO2;
                case 999:
                    return EDITION_PROTO3;
                case 1000:
                    return EDITION_2023;
                case 1001:
                    return EDITION_2024;
                default:
                    switch (value) {
                        case f56427b2:
                            return EDITION_99997_TEST_ONLY;
                        case f56429c2:
                            return EDITION_99998_TEST_ONLY;
                        case f56431d2:
                            return EDITION_99999_TEST_ONLY;
                        default:
                            return null;
                    }
            }
        }

        public static v98.InterfaceC13948d<EnumC8658d> internalGetValueMap() {
            return f56435f2;
        }

        public static v98.InterfaceC13949e internalGetVerifier() {
            return b.f56439a;
        }

        @Override // p000.v98.InterfaceC13947c
        public final int getNumber() {
            return this.f56438a;
        }

        @Deprecated
        public static EnumC8658d valueOf(int value) {
            return forNumber(value);
        }
    }

    /* JADX INFO: renamed from: l74$d0 */
    public interface InterfaceC8659d0 extends ssa {
        C8657c0.a getAnnotation(int index);

        int getAnnotationCount();

        List<C8657c0.a> getAnnotationList();
    }

    /* JADX INFO: renamed from: l74$e */
    public static final class C8660e extends u27<C8660e, a> implements InterfaceC8662f {
        private static final C8660e DEFAULT_INSTANCE;
        public static final int NAME_FIELD_NUMBER = 1;
        public static final int OPTIONS_FIELD_NUMBER = 3;
        private static volatile vhc<C8660e> PARSER = null;
        public static final int RESERVED_NAME_FIELD_NUMBER = 5;
        public static final int RESERVED_RANGE_FIELD_NUMBER = 4;
        public static final int VALUE_FIELD_NUMBER = 2;
        private int bitField0_;
        private C8664g options_;
        private byte memoizedIsInitialized = 2;
        private String name_ = "";
        private v98.InterfaceC13956l<C8668i> value_ = u27.m23036w();
        private v98.InterfaceC13956l<b> reservedRange_ = u27.m23036w();
        private v98.InterfaceC13956l<String> reservedName_ = u27.m23036w();

        /* JADX INFO: renamed from: l74$e$a */
        public static final class a extends u27.AbstractC13324b<C8660e, a> implements InterfaceC8662f {
            public /* synthetic */ a(C8652a c8652a) {
                this();
            }

            public a addAllReservedName(Iterable<String> values) {
                m23058e();
                ((C8660e) this.f86607b).addAllReservedName(values);
                return this;
            }

            public a addAllReservedRange(Iterable<? extends b> values) {
                m23058e();
                ((C8660e) this.f86607b).addAllReservedRange(values);
                return this;
            }

            public a addAllValue(Iterable<? extends C8668i> values) {
                m23058e();
                ((C8660e) this.f86607b).addAllValue(values);
                return this;
            }

            public a addReservedName(String value) {
                m23058e();
                ((C8660e) this.f86607b).addReservedName(value);
                return this;
            }

            public a addReservedNameBytes(wj1 value) {
                m23058e();
                ((C8660e) this.f86607b).addReservedNameBytes(value);
                return this;
            }

            public a addReservedRange(b value) {
                m23058e();
                ((C8660e) this.f86607b).addReservedRange(value);
                return this;
            }

            public a addValue(C8668i value) {
                m23058e();
                ((C8660e) this.f86607b).addValue(value);
                return this;
            }

            public a clearName() {
                m23058e();
                ((C8660e) this.f86607b).clearName();
                return this;
            }

            public a clearOptions() {
                m23058e();
                ((C8660e) this.f86607b).clearOptions();
                return this;
            }

            public a clearReservedName() {
                m23058e();
                ((C8660e) this.f86607b).clearReservedName();
                return this;
            }

            public a clearReservedRange() {
                m23058e();
                ((C8660e) this.f86607b).clearReservedRange();
                return this;
            }

            public a clearValue() {
                m23058e();
                ((C8660e) this.f86607b).clearValue();
                return this;
            }

            @Override // p000.l74.InterfaceC8662f
            public String getName() {
                return ((C8660e) this.f86607b).getName();
            }

            @Override // p000.l74.InterfaceC8662f
            public wj1 getNameBytes() {
                return ((C8660e) this.f86607b).getNameBytes();
            }

            @Override // p000.l74.InterfaceC8662f
            public C8664g getOptions() {
                return ((C8660e) this.f86607b).getOptions();
            }

            @Override // p000.l74.InterfaceC8662f
            public String getReservedName(int index) {
                return ((C8660e) this.f86607b).getReservedName(index);
            }

            @Override // p000.l74.InterfaceC8662f
            public wj1 getReservedNameBytes(int index) {
                return ((C8660e) this.f86607b).getReservedNameBytes(index);
            }

            @Override // p000.l74.InterfaceC8662f
            public int getReservedNameCount() {
                return ((C8660e) this.f86607b).getReservedNameCount();
            }

            @Override // p000.l74.InterfaceC8662f
            public List<String> getReservedNameList() {
                return Collections.unmodifiableList(((C8660e) this.f86607b).getReservedNameList());
            }

            @Override // p000.l74.InterfaceC8662f
            public b getReservedRange(int index) {
                return ((C8660e) this.f86607b).getReservedRange(index);
            }

            @Override // p000.l74.InterfaceC8662f
            public int getReservedRangeCount() {
                return ((C8660e) this.f86607b).getReservedRangeCount();
            }

            @Override // p000.l74.InterfaceC8662f
            public List<b> getReservedRangeList() {
                return Collections.unmodifiableList(((C8660e) this.f86607b).getReservedRangeList());
            }

            @Override // p000.l74.InterfaceC8662f
            public C8668i getValue(int index) {
                return ((C8660e) this.f86607b).getValue(index);
            }

            @Override // p000.l74.InterfaceC8662f
            public int getValueCount() {
                return ((C8660e) this.f86607b).getValueCount();
            }

            @Override // p000.l74.InterfaceC8662f
            public List<C8668i> getValueList() {
                return Collections.unmodifiableList(((C8660e) this.f86607b).getValueList());
            }

            @Override // p000.l74.InterfaceC8662f
            public boolean hasName() {
                return ((C8660e) this.f86607b).hasName();
            }

            @Override // p000.l74.InterfaceC8662f
            public boolean hasOptions() {
                return ((C8660e) this.f86607b).hasOptions();
            }

            public a mergeOptions(C8664g value) {
                m23058e();
                ((C8660e) this.f86607b).mergeOptions(value);
                return this;
            }

            public a removeReservedRange(int index) {
                m23058e();
                ((C8660e) this.f86607b).removeReservedRange(index);
                return this;
            }

            public a removeValue(int index) {
                m23058e();
                ((C8660e) this.f86607b).removeValue(index);
                return this;
            }

            public a setName(String value) {
                m23058e();
                ((C8660e) this.f86607b).setName(value);
                return this;
            }

            public a setNameBytes(wj1 value) {
                m23058e();
                ((C8660e) this.f86607b).setNameBytes(value);
                return this;
            }

            public a setOptions(C8664g value) {
                m23058e();
                ((C8660e) this.f86607b).setOptions(value);
                return this;
            }

            public a setReservedName(int index, String value) {
                m23058e();
                ((C8660e) this.f86607b).setReservedName(index, value);
                return this;
            }

            public a setReservedRange(int index, b value) {
                m23058e();
                ((C8660e) this.f86607b).setReservedRange(index, value);
                return this;
            }

            public a setValue(int index, C8668i value) {
                m23058e();
                ((C8660e) this.f86607b).setValue(index, value);
                return this;
            }

            private a() {
                super(C8660e.DEFAULT_INSTANCE);
            }

            public a addReservedRange(int index, b value) {
                m23058e();
                ((C8660e) this.f86607b).addReservedRange(index, value);
                return this;
            }

            public a addValue(int index, C8668i value) {
                m23058e();
                ((C8660e) this.f86607b).addValue(index, value);
                return this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public a setOptions(C8664g.a builderForValue) {
                m23058e();
                ((C8660e) this.f86607b).setOptions((C8664g) builderForValue.build());
                return this;
            }

            public a setReservedRange(int index, b.a builderForValue) {
                m23058e();
                ((C8660e) this.f86607b).setReservedRange(index, builderForValue.build());
                return this;
            }

            public a setValue(int index, C8668i.a builderForValue) {
                m23058e();
                ((C8660e) this.f86607b).setValue(index, builderForValue.build());
                return this;
            }

            public a addReservedRange(b.a builderForValue) {
                m23058e();
                ((C8660e) this.f86607b).addReservedRange(builderForValue.build());
                return this;
            }

            public a addValue(C8668i.a builderForValue) {
                m23058e();
                ((C8660e) this.f86607b).addValue(builderForValue.build());
                return this;
            }

            public a addReservedRange(int index, b.a builderForValue) {
                m23058e();
                ((C8660e) this.f86607b).addReservedRange(index, builderForValue.build());
                return this;
            }

            public a addValue(int index, C8668i.a builderForValue) {
                m23058e();
                ((C8660e) this.f86607b).addValue(index, builderForValue.build());
                return this;
            }
        }

        /* JADX INFO: renamed from: l74$e$b */
        public static final class b extends u27<b, a> implements c {
            private static final b DEFAULT_INSTANCE;
            public static final int END_FIELD_NUMBER = 2;
            private static volatile vhc<b> PARSER = null;
            public static final int START_FIELD_NUMBER = 1;
            private int bitField0_;
            private int end_;
            private int start_;

            /* JADX INFO: renamed from: l74$e$b$a */
            public static final class a extends u27.AbstractC13324b<b, a> implements c {
                public /* synthetic */ a(C8652a c8652a) {
                    this();
                }

                public a clearEnd() {
                    m23058e();
                    ((b) this.f86607b).clearEnd();
                    return this;
                }

                public a clearStart() {
                    m23058e();
                    ((b) this.f86607b).clearStart();
                    return this;
                }

                @Override // p000.l74.C8660e.c
                public int getEnd() {
                    return ((b) this.f86607b).getEnd();
                }

                @Override // p000.l74.C8660e.c
                public int getStart() {
                    return ((b) this.f86607b).getStart();
                }

                @Override // p000.l74.C8660e.c
                public boolean hasEnd() {
                    return ((b) this.f86607b).hasEnd();
                }

                @Override // p000.l74.C8660e.c
                public boolean hasStart() {
                    return ((b) this.f86607b).hasStart();
                }

                public a setEnd(int value) {
                    m23058e();
                    ((b) this.f86607b).setEnd(value);
                    return this;
                }

                public a setStart(int value) {
                    m23058e();
                    ((b) this.f86607b).setStart(value);
                    return this;
                }

                private a() {
                    super(b.DEFAULT_INSTANCE);
                }
            }

            static {
                b bVar = new b();
                DEFAULT_INSTANCE = bVar;
                u27.m23029g0(b.class, bVar);
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
                return DEFAULT_INSTANCE.m23053m();
            }

            public static b parseDelimitedFrom(InputStream input) throws IOException {
                return (b) u27.m23014R(DEFAULT_INSTANCE, input);
            }

            public static b parseFrom(ByteBuffer data) throws be8 {
                return (b) u27.m23022Z(DEFAULT_INSTANCE, data);
            }

            public static vhc<b> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setEnd(int value) {
                this.bitField0_ |= 2;
                this.end_ = value;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setStart(int value) {
                this.bitField0_ |= 1;
                this.start_ = value;
            }

            @Override // p000.l74.C8660e.c
            public int getEnd() {
                return this.end_;
            }

            @Override // p000.l74.C8660e.c
            public int getStart() {
                return this.start_;
            }

            @Override // p000.l74.C8660e.c
            public boolean hasEnd() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // p000.l74.C8660e.c
            public boolean hasStart() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // p000.u27
            /* JADX INFO: renamed from: q */
            public final Object mo79q(u27.EnumC13331i method, Object arg0, Object arg1) {
                C8652a c8652a = null;
                switch (C8652a.f56391a[method.ordinal()]) {
                    case 1:
                        return new b();
                    case 2:
                        return new a(c8652a);
                    case 3:
                        return u27.m23013P(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"bitField0_", "start_", "end_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        vhc<b> c13325c = PARSER;
                        if (c13325c == null) {
                            synchronized (b.class) {
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

            public static a newBuilder(b prototype) {
                return DEFAULT_INSTANCE.m23054n(prototype);
            }

            public static b parseDelimitedFrom(InputStream input, yi5 extensionRegistry) throws IOException {
                return (b) u27.m23015S(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static b parseFrom(ByteBuffer data, yi5 extensionRegistry) throws be8 {
                return (b) u27.m23023a0(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static b parseFrom(wj1 data) throws be8 {
                return (b) u27.m23016T(DEFAULT_INSTANCE, data);
            }

            public static b parseFrom(wj1 data, yi5 extensionRegistry) throws be8 {
                return (b) u27.m23017U(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static b parseFrom(byte[] data) throws be8 {
                return (b) u27.m23024b0(DEFAULT_INSTANCE, data);
            }

            public static b parseFrom(byte[] data, yi5 extensionRegistry) throws be8 {
                return (b) u27.m23025c0(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static b parseFrom(InputStream input) throws IOException {
                return (b) u27.m23020X(DEFAULT_INSTANCE, input);
            }

            public static b parseFrom(InputStream input, yi5 extensionRegistry) throws IOException {
                return (b) u27.m23021Y(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static b parseFrom(e72 input) throws IOException {
                return (b) u27.m23018V(DEFAULT_INSTANCE, input);
            }

            public static b parseFrom(e72 input, yi5 extensionRegistry) throws IOException {
                return (b) u27.m23019W(DEFAULT_INSTANCE, input, extensionRegistry);
            }
        }

        /* JADX INFO: renamed from: l74$e$c */
        public interface c extends ssa {
            int getEnd();

            int getStart();

            boolean hasEnd();

            boolean hasStart();
        }

        static {
            C8660e c8660e = new C8660e();
            DEFAULT_INSTANCE = c8660e;
            u27.m23029g0(C8660e.class, c8660e);
        }

        private C8660e() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllReservedName(Iterable<String> values) {
            ensureReservedNameIsMutable();
            AbstractC0027a3.m80a(values, this.reservedName_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllReservedRange(Iterable<? extends b> values) {
            ensureReservedRangeIsMutable();
            AbstractC0027a3.m80a(values, this.reservedRange_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllValue(Iterable<? extends C8668i> values) {
            ensureValueIsMutable();
            AbstractC0027a3.m80a(values, this.value_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addReservedName(String value) {
            value.getClass();
            ensureReservedNameIsMutable();
            this.reservedName_.add(value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addReservedNameBytes(wj1 value) {
            ensureReservedNameIsMutable();
            this.reservedName_.add(value.toStringUtf8());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addReservedRange(b value) {
            value.getClass();
            ensureReservedRangeIsMutable();
            this.reservedRange_.add(value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addValue(C8668i value) {
            value.getClass();
            ensureValueIsMutable();
            this.value_.add(value);
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
            this.reservedName_ = u27.m23036w();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearReservedRange() {
            this.reservedRange_ = u27.m23036w();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearValue() {
            this.value_ = u27.m23036w();
        }

        private void ensureReservedNameIsMutable() {
            v98.InterfaceC13956l<String> interfaceC13956l = this.reservedName_;
            if (interfaceC13956l.isModifiable()) {
                return;
            }
            this.reservedName_ = u27.m23012O(interfaceC13956l);
        }

        private void ensureReservedRangeIsMutable() {
            v98.InterfaceC13956l<b> interfaceC13956l = this.reservedRange_;
            if (interfaceC13956l.isModifiable()) {
                return;
            }
            this.reservedRange_ = u27.m23012O(interfaceC13956l);
        }

        private void ensureValueIsMutable() {
            v98.InterfaceC13956l<C8668i> interfaceC13956l = this.value_;
            if (interfaceC13956l.isModifiable()) {
                return;
            }
            this.value_ = u27.m23012O(interfaceC13956l);
        }

        public static C8660e getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public void mergeOptions(C8664g value) {
            value.getClass();
            C8664g c8664g = this.options_;
            if (c8664g == null || c8664g == C8664g.getDefaultInstance()) {
                this.options_ = value;
            } else {
                this.options_ = ((C8664g.a) C8664g.newBuilder(this.options_).mergeFrom(value)).buildPartial();
            }
            this.bitField0_ |= 2;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.m23053m();
        }

        public static C8660e parseDelimitedFrom(InputStream input) throws IOException {
            return (C8660e) u27.m23014R(DEFAULT_INSTANCE, input);
        }

        public static C8660e parseFrom(ByteBuffer data) throws be8 {
            return (C8660e) u27.m23022Z(DEFAULT_INSTANCE, data);
        }

        public static vhc<C8660e> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeReservedRange(int index) {
            ensureReservedRangeIsMutable();
            this.reservedRange_.remove(index);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeValue(int index) {
            ensureValueIsMutable();
            this.value_.remove(index);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setName(String value) {
            value.getClass();
            this.bitField0_ |= 1;
            this.name_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNameBytes(wj1 value) {
            this.name_ = value.toStringUtf8();
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOptions(C8664g value) {
            value.getClass();
            this.options_ = value;
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setReservedName(int index, String value) {
            value.getClass();
            ensureReservedNameIsMutable();
            this.reservedName_.set(index, value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setReservedRange(int index, b value) {
            value.getClass();
            ensureReservedRangeIsMutable();
            this.reservedRange_.set(index, value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setValue(int index, C8668i value) {
            value.getClass();
            ensureValueIsMutable();
            this.value_.set(index, value);
        }

        @Override // p000.l74.InterfaceC8662f
        public String getName() {
            return this.name_;
        }

        @Override // p000.l74.InterfaceC8662f
        public wj1 getNameBytes() {
            return wj1.copyFromUtf8(this.name_);
        }

        @Override // p000.l74.InterfaceC8662f
        public C8664g getOptions() {
            C8664g c8664g = this.options_;
            return c8664g == null ? C8664g.getDefaultInstance() : c8664g;
        }

        @Override // p000.l74.InterfaceC8662f
        public String getReservedName(int index) {
            return this.reservedName_.get(index);
        }

        @Override // p000.l74.InterfaceC8662f
        public wj1 getReservedNameBytes(int index) {
            return wj1.copyFromUtf8(this.reservedName_.get(index));
        }

        @Override // p000.l74.InterfaceC8662f
        public int getReservedNameCount() {
            return this.reservedName_.size();
        }

        @Override // p000.l74.InterfaceC8662f
        public List<String> getReservedNameList() {
            return this.reservedName_;
        }

        @Override // p000.l74.InterfaceC8662f
        public b getReservedRange(int index) {
            return this.reservedRange_.get(index);
        }

        @Override // p000.l74.InterfaceC8662f
        public int getReservedRangeCount() {
            return this.reservedRange_.size();
        }

        @Override // p000.l74.InterfaceC8662f
        public List<b> getReservedRangeList() {
            return this.reservedRange_;
        }

        public c getReservedRangeOrBuilder(int index) {
            return this.reservedRange_.get(index);
        }

        public List<? extends c> getReservedRangeOrBuilderList() {
            return this.reservedRange_;
        }

        @Override // p000.l74.InterfaceC8662f
        public C8668i getValue(int index) {
            return this.value_.get(index);
        }

        @Override // p000.l74.InterfaceC8662f
        public int getValueCount() {
            return this.value_.size();
        }

        @Override // p000.l74.InterfaceC8662f
        public List<C8668i> getValueList() {
            return this.value_;
        }

        public InterfaceC8670j getValueOrBuilder(int index) {
            return this.value_.get(index);
        }

        public List<? extends InterfaceC8670j> getValueOrBuilderList() {
            return this.value_;
        }

        @Override // p000.l74.InterfaceC8662f
        public boolean hasName() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // p000.l74.InterfaceC8662f
        public boolean hasOptions() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // p000.u27
        /* JADX INFO: renamed from: q */
        public final Object mo79q(u27.EnumC13331i method, Object arg0, Object arg1) {
            C8652a c8652a = null;
            switch (C8652a.f56391a[method.ordinal()]) {
                case 1:
                    return new C8660e();
                case 2:
                    return new a(c8652a);
                case 3:
                    return u27.m23013P(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0003\u0002\u0001ဈ\u0000\u0002Л\u0003ᐉ\u0001\u0004\u001b\u0005\u001a", new Object[]{"bitField0_", "name_", "value_", C8668i.class, "options_", "reservedRange_", b.class, "reservedName_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    vhc<C8660e> c13325c = PARSER;
                    if (c13325c == null) {
                        synchronized (C8660e.class) {
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
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    this.memoizedIsInitialized = (byte) (arg0 == null ? 0 : 1);
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public static a newBuilder(C8660e prototype) {
            return DEFAULT_INSTANCE.m23054n(prototype);
        }

        public static C8660e parseDelimitedFrom(InputStream input, yi5 extensionRegistry) throws IOException {
            return (C8660e) u27.m23015S(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static C8660e parseFrom(ByteBuffer data, yi5 extensionRegistry) throws be8 {
            return (C8660e) u27.m23023a0(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static C8660e parseFrom(wj1 data) throws be8 {
            return (C8660e) u27.m23016T(DEFAULT_INSTANCE, data);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addReservedRange(int index, b value) {
            value.getClass();
            ensureReservedRangeIsMutable();
            this.reservedRange_.add(index, value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addValue(int index, C8668i value) {
            value.getClass();
            ensureValueIsMutable();
            this.value_.add(index, value);
        }

        public static C8660e parseFrom(wj1 data, yi5 extensionRegistry) throws be8 {
            return (C8660e) u27.m23017U(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static C8660e parseFrom(byte[] data) throws be8 {
            return (C8660e) u27.m23024b0(DEFAULT_INSTANCE, data);
        }

        public static C8660e parseFrom(byte[] data, yi5 extensionRegistry) throws be8 {
            return (C8660e) u27.m23025c0(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static C8660e parseFrom(InputStream input) throws IOException {
            return (C8660e) u27.m23020X(DEFAULT_INSTANCE, input);
        }

        public static C8660e parseFrom(InputStream input, yi5 extensionRegistry) throws IOException {
            return (C8660e) u27.m23021Y(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static C8660e parseFrom(e72 input) throws IOException {
            return (C8660e) u27.m23018V(DEFAULT_INSTANCE, input);
        }

        public static C8660e parseFrom(e72 input, yi5 extensionRegistry) throws IOException {
            return (C8660e) u27.m23019W(DEFAULT_INSTANCE, input, extensionRegistry);
        }
    }

    /* JADX INFO: renamed from: l74$e0 */
    public static final class C8661e0 extends u27.AbstractC13327e<C8661e0, a> implements InterfaceC8663f0 {
        private static final C8661e0 DEFAULT_INSTANCE;
        public static final int DEPRECATED_FIELD_NUMBER = 3;
        public static final int DEPRECATED_LEGACY_JSON_FIELD_CONFLICTS_FIELD_NUMBER = 11;
        public static final int FEATURES_FIELD_NUMBER = 12;
        public static final int MAP_ENTRY_FIELD_NUMBER = 7;
        public static final int MESSAGE_SET_WIRE_FORMAT_FIELD_NUMBER = 1;
        public static final int NO_STANDARD_DESCRIPTOR_ACCESSOR_FIELD_NUMBER = 2;
        private static volatile vhc<C8661e0> PARSER = null;
        public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
        private int bitField0_;
        private boolean deprecatedLegacyJsonFieldConflicts_;
        private boolean deprecated_;
        private C8680o features_;
        private boolean mapEntry_;
        private boolean messageSetWireFormat_;
        private boolean noStandardDescriptorAccessor_;
        private byte memoizedIsInitialized = 2;
        private v98.InterfaceC13956l<C8693u0> uninterpretedOption_ = u27.m23036w();

        /* JADX INFO: renamed from: l74$e0$a */
        public static final class a extends u27.AbstractC13326d<C8661e0, a> implements InterfaceC8663f0 {
            public /* synthetic */ a(C8652a c8652a) {
                this();
            }

            public a addAllUninterpretedOption(Iterable<? extends C8693u0> values) {
                m23058e();
                ((C8661e0) this.f86607b).addAllUninterpretedOption(values);
                return this;
            }

            public a addUninterpretedOption(C8693u0 value) {
                m23058e();
                ((C8661e0) this.f86607b).addUninterpretedOption(value);
                return this;
            }

            public a clearDeprecated() {
                m23058e();
                ((C8661e0) this.f86607b).clearDeprecated();
                return this;
            }

            @Deprecated
            public a clearDeprecatedLegacyJsonFieldConflicts() {
                m23058e();
                ((C8661e0) this.f86607b).clearDeprecatedLegacyJsonFieldConflicts();
                return this;
            }

            public a clearFeatures() {
                m23058e();
                ((C8661e0) this.f86607b).clearFeatures();
                return this;
            }

            public a clearMapEntry() {
                m23058e();
                ((C8661e0) this.f86607b).clearMapEntry();
                return this;
            }

            public a clearMessageSetWireFormat() {
                m23058e();
                ((C8661e0) this.f86607b).clearMessageSetWireFormat();
                return this;
            }

            public a clearNoStandardDescriptorAccessor() {
                m23058e();
                ((C8661e0) this.f86607b).clearNoStandardDescriptorAccessor();
                return this;
            }

            public a clearUninterpretedOption() {
                m23058e();
                ((C8661e0) this.f86607b).clearUninterpretedOption();
                return this;
            }

            @Override // p000.l74.InterfaceC8663f0
            public boolean getDeprecated() {
                return ((C8661e0) this.f86607b).getDeprecated();
            }

            @Override // p000.l74.InterfaceC8663f0
            @Deprecated
            public boolean getDeprecatedLegacyJsonFieldConflicts() {
                return ((C8661e0) this.f86607b).getDeprecatedLegacyJsonFieldConflicts();
            }

            @Override // p000.l74.InterfaceC8663f0
            public C8680o getFeatures() {
                return ((C8661e0) this.f86607b).getFeatures();
            }

            @Override // p000.l74.InterfaceC8663f0
            public boolean getMapEntry() {
                return ((C8661e0) this.f86607b).getMapEntry();
            }

            @Override // p000.l74.InterfaceC8663f0
            public boolean getMessageSetWireFormat() {
                return ((C8661e0) this.f86607b).getMessageSetWireFormat();
            }

            @Override // p000.l74.InterfaceC8663f0
            public boolean getNoStandardDescriptorAccessor() {
                return ((C8661e0) this.f86607b).getNoStandardDescriptorAccessor();
            }

            @Override // p000.l74.InterfaceC8663f0
            public C8693u0 getUninterpretedOption(int index) {
                return ((C8661e0) this.f86607b).getUninterpretedOption(index);
            }

            @Override // p000.l74.InterfaceC8663f0
            public int getUninterpretedOptionCount() {
                return ((C8661e0) this.f86607b).getUninterpretedOptionCount();
            }

            @Override // p000.l74.InterfaceC8663f0
            public List<C8693u0> getUninterpretedOptionList() {
                return Collections.unmodifiableList(((C8661e0) this.f86607b).getUninterpretedOptionList());
            }

            @Override // p000.l74.InterfaceC8663f0
            public boolean hasDeprecated() {
                return ((C8661e0) this.f86607b).hasDeprecated();
            }

            @Override // p000.l74.InterfaceC8663f0
            @Deprecated
            public boolean hasDeprecatedLegacyJsonFieldConflicts() {
                return ((C8661e0) this.f86607b).hasDeprecatedLegacyJsonFieldConflicts();
            }

            @Override // p000.l74.InterfaceC8663f0
            public boolean hasFeatures() {
                return ((C8661e0) this.f86607b).hasFeatures();
            }

            @Override // p000.l74.InterfaceC8663f0
            public boolean hasMapEntry() {
                return ((C8661e0) this.f86607b).hasMapEntry();
            }

            @Override // p000.l74.InterfaceC8663f0
            public boolean hasMessageSetWireFormat() {
                return ((C8661e0) this.f86607b).hasMessageSetWireFormat();
            }

            @Override // p000.l74.InterfaceC8663f0
            public boolean hasNoStandardDescriptorAccessor() {
                return ((C8661e0) this.f86607b).hasNoStandardDescriptorAccessor();
            }

            public a mergeFeatures(C8680o value) {
                m23058e();
                ((C8661e0) this.f86607b).mergeFeatures(value);
                return this;
            }

            public a removeUninterpretedOption(int index) {
                m23058e();
                ((C8661e0) this.f86607b).removeUninterpretedOption(index);
                return this;
            }

            public a setDeprecated(boolean value) {
                m23058e();
                ((C8661e0) this.f86607b).setDeprecated(value);
                return this;
            }

            @Deprecated
            public a setDeprecatedLegacyJsonFieldConflicts(boolean value) {
                m23058e();
                ((C8661e0) this.f86607b).setDeprecatedLegacyJsonFieldConflicts(value);
                return this;
            }

            public a setFeatures(C8680o value) {
                m23058e();
                ((C8661e0) this.f86607b).setFeatures(value);
                return this;
            }

            public a setMapEntry(boolean value) {
                m23058e();
                ((C8661e0) this.f86607b).setMapEntry(value);
                return this;
            }

            public a setMessageSetWireFormat(boolean value) {
                m23058e();
                ((C8661e0) this.f86607b).setMessageSetWireFormat(value);
                return this;
            }

            public a setNoStandardDescriptorAccessor(boolean value) {
                m23058e();
                ((C8661e0) this.f86607b).setNoStandardDescriptorAccessor(value);
                return this;
            }

            public a setUninterpretedOption(int index, C8693u0 value) {
                m23058e();
                ((C8661e0) this.f86607b).setUninterpretedOption(index, value);
                return this;
            }

            private a() {
                super(C8661e0.DEFAULT_INSTANCE);
            }

            public a addUninterpretedOption(int index, C8693u0 value) {
                m23058e();
                ((C8661e0) this.f86607b).addUninterpretedOption(index, value);
                return this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public a setFeatures(C8680o.a builderForValue) {
                m23058e();
                ((C8661e0) this.f86607b).setFeatures((C8680o) builderForValue.build());
                return this;
            }

            public a setUninterpretedOption(int index, C8693u0.a builderForValue) {
                m23058e();
                ((C8661e0) this.f86607b).setUninterpretedOption(index, builderForValue.build());
                return this;
            }

            public a addUninterpretedOption(C8693u0.a builderForValue) {
                m23058e();
                ((C8661e0) this.f86607b).addUninterpretedOption(builderForValue.build());
                return this;
            }

            public a addUninterpretedOption(int index, C8693u0.a builderForValue) {
                m23058e();
                ((C8661e0) this.f86607b).addUninterpretedOption(index, builderForValue.build());
                return this;
            }
        }

        static {
            C8661e0 c8661e0 = new C8661e0();
            DEFAULT_INSTANCE = c8661e0;
            u27.m23029g0(C8661e0.class, c8661e0);
        }

        private C8661e0() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllUninterpretedOption(Iterable<? extends C8693u0> values) {
            ensureUninterpretedOptionIsMutable();
            AbstractC0027a3.m80a(values, this.uninterpretedOption_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addUninterpretedOption(C8693u0 value) {
            value.getClass();
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.add(value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDeprecated() {
            this.bitField0_ &= -5;
            this.deprecated_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDeprecatedLegacyJsonFieldConflicts() {
            this.bitField0_ &= -17;
            this.deprecatedLegacyJsonFieldConflicts_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFeatures() {
            this.features_ = null;
            this.bitField0_ &= -33;
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
            this.uninterpretedOption_ = u27.m23036w();
        }

        private void ensureUninterpretedOptionIsMutable() {
            v98.InterfaceC13956l<C8693u0> interfaceC13956l = this.uninterpretedOption_;
            if (interfaceC13956l.isModifiable()) {
                return;
            }
            this.uninterpretedOption_ = u27.m23012O(interfaceC13956l);
        }

        public static C8661e0 getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public void mergeFeatures(C8680o value) {
            value.getClass();
            C8680o c8680o = this.features_;
            if (c8680o == null || c8680o == C8680o.getDefaultInstance()) {
                this.features_ = value;
            } else {
                this.features_ = ((C8680o.a) C8680o.newBuilder(this.features_).mergeFrom(value)).buildPartial();
            }
            this.bitField0_ |= 32;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static a newBuilder() {
            return (a) DEFAULT_INSTANCE.m23053m();
        }

        public static C8661e0 parseDelimitedFrom(InputStream input) throws IOException {
            return (C8661e0) u27.m23014R(DEFAULT_INSTANCE, input);
        }

        public static C8661e0 parseFrom(ByteBuffer data) throws be8 {
            return (C8661e0) u27.m23022Z(DEFAULT_INSTANCE, data);
        }

        public static vhc<C8661e0> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeUninterpretedOption(int index) {
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.remove(index);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDeprecated(boolean value) {
            this.bitField0_ |= 4;
            this.deprecated_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDeprecatedLegacyJsonFieldConflicts(boolean value) {
            this.bitField0_ |= 16;
            this.deprecatedLegacyJsonFieldConflicts_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFeatures(C8680o value) {
            value.getClass();
            this.features_ = value;
            this.bitField0_ |= 32;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMapEntry(boolean value) {
            this.bitField0_ |= 8;
            this.mapEntry_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMessageSetWireFormat(boolean value) {
            this.bitField0_ |= 1;
            this.messageSetWireFormat_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNoStandardDescriptorAccessor(boolean value) {
            this.bitField0_ |= 2;
            this.noStandardDescriptorAccessor_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUninterpretedOption(int index, C8693u0 value) {
            value.getClass();
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.set(index, value);
        }

        @Override // p000.l74.InterfaceC8663f0
        public boolean getDeprecated() {
            return this.deprecated_;
        }

        @Override // p000.l74.InterfaceC8663f0
        @Deprecated
        public boolean getDeprecatedLegacyJsonFieldConflicts() {
            return this.deprecatedLegacyJsonFieldConflicts_;
        }

        @Override // p000.l74.InterfaceC8663f0
        public C8680o getFeatures() {
            C8680o c8680o = this.features_;
            return c8680o == null ? C8680o.getDefaultInstance() : c8680o;
        }

        @Override // p000.l74.InterfaceC8663f0
        public boolean getMapEntry() {
            return this.mapEntry_;
        }

        @Override // p000.l74.InterfaceC8663f0
        public boolean getMessageSetWireFormat() {
            return this.messageSetWireFormat_;
        }

        @Override // p000.l74.InterfaceC8663f0
        public boolean getNoStandardDescriptorAccessor() {
            return this.noStandardDescriptorAccessor_;
        }

        @Override // p000.l74.InterfaceC8663f0
        public C8693u0 getUninterpretedOption(int index) {
            return this.uninterpretedOption_.get(index);
        }

        @Override // p000.l74.InterfaceC8663f0
        public int getUninterpretedOptionCount() {
            return this.uninterpretedOption_.size();
        }

        @Override // p000.l74.InterfaceC8663f0
        public List<C8693u0> getUninterpretedOptionList() {
            return this.uninterpretedOption_;
        }

        public InterfaceC8695v0 getUninterpretedOptionOrBuilder(int index) {
            return this.uninterpretedOption_.get(index);
        }

        public List<? extends InterfaceC8695v0> getUninterpretedOptionOrBuilderList() {
            return this.uninterpretedOption_;
        }

        @Override // p000.l74.InterfaceC8663f0
        public boolean hasDeprecated() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // p000.l74.InterfaceC8663f0
        @Deprecated
        public boolean hasDeprecatedLegacyJsonFieldConflicts() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // p000.l74.InterfaceC8663f0
        public boolean hasFeatures() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // p000.l74.InterfaceC8663f0
        public boolean hasMapEntry() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // p000.l74.InterfaceC8663f0
        public boolean hasMessageSetWireFormat() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // p000.l74.InterfaceC8663f0
        public boolean hasNoStandardDescriptorAccessor() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // p000.u27
        /* JADX INFO: renamed from: q */
        public final Object mo79q(u27.EnumC13331i method, Object arg0, Object arg1) {
            C8652a c8652a = null;
            switch (C8652a.f56391a[method.ordinal()]) {
                case 1:
                    return new C8661e0();
                case 2:
                    return new a(c8652a);
                case 3:
                    return u27.m23013P(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0001ϧ\u0007\u0000\u0001\u0002\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0007ဇ\u0003\u000bဇ\u0004\fᐉ\u0005ϧЛ", new Object[]{"bitField0_", "messageSetWireFormat_", "noStandardDescriptorAccessor_", "deprecated_", "mapEntry_", "deprecatedLegacyJsonFieldConflicts_", "features_", "uninterpretedOption_", C8693u0.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    vhc<C8661e0> c13325c = PARSER;
                    if (c13325c == null) {
                        synchronized (C8661e0.class) {
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
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    this.memoizedIsInitialized = (byte) (arg0 == null ? 0 : 1);
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static a newBuilder(C8661e0 prototype) {
            return (a) DEFAULT_INSTANCE.m23054n(prototype);
        }

        public static C8661e0 parseDelimitedFrom(InputStream input, yi5 extensionRegistry) throws IOException {
            return (C8661e0) u27.m23015S(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static C8661e0 parseFrom(ByteBuffer data, yi5 extensionRegistry) throws be8 {
            return (C8661e0) u27.m23023a0(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static C8661e0 parseFrom(wj1 data) throws be8 {
            return (C8661e0) u27.m23016T(DEFAULT_INSTANCE, data);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addUninterpretedOption(int index, C8693u0 value) {
            value.getClass();
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.add(index, value);
        }

        public static C8661e0 parseFrom(wj1 data, yi5 extensionRegistry) throws be8 {
            return (C8661e0) u27.m23017U(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static C8661e0 parseFrom(byte[] data) throws be8 {
            return (C8661e0) u27.m23024b0(DEFAULT_INSTANCE, data);
        }

        public static C8661e0 parseFrom(byte[] data, yi5 extensionRegistry) throws be8 {
            return (C8661e0) u27.m23025c0(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static C8661e0 parseFrom(InputStream input) throws IOException {
            return (C8661e0) u27.m23020X(DEFAULT_INSTANCE, input);
        }

        public static C8661e0 parseFrom(InputStream input, yi5 extensionRegistry) throws IOException {
            return (C8661e0) u27.m23021Y(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static C8661e0 parseFrom(e72 input) throws IOException {
            return (C8661e0) u27.m23018V(DEFAULT_INSTANCE, input);
        }

        public static C8661e0 parseFrom(e72 input, yi5 extensionRegistry) throws IOException {
            return (C8661e0) u27.m23019W(DEFAULT_INSTANCE, input, extensionRegistry);
        }
    }

    /* JADX INFO: renamed from: l74$f */
    public interface InterfaceC8662f extends ssa {
        String getName();

        wj1 getNameBytes();

        C8664g getOptions();

        String getReservedName(int index);

        wj1 getReservedNameBytes(int index);

        int getReservedNameCount();

        List<String> getReservedNameList();

        C8660e.b getReservedRange(int index);

        int getReservedRangeCount();

        List<C8660e.b> getReservedRangeList();

        C8668i getValue(int index);

        int getValueCount();

        List<C8668i> getValueList();

        boolean hasName();

        boolean hasOptions();
    }

    /* JADX INFO: renamed from: l74$f0 */
    public interface InterfaceC8663f0 extends u27.InterfaceC13328f<C8661e0, C8661e0.a> {
        boolean getDeprecated();

        @Deprecated
        boolean getDeprecatedLegacyJsonFieldConflicts();

        C8680o getFeatures();

        boolean getMapEntry();

        boolean getMessageSetWireFormat();

        boolean getNoStandardDescriptorAccessor();

        C8693u0 getUninterpretedOption(int index);

        int getUninterpretedOptionCount();

        List<C8693u0> getUninterpretedOptionList();

        boolean hasDeprecated();

        @Deprecated
        boolean hasDeprecatedLegacyJsonFieldConflicts();

        boolean hasFeatures();

        boolean hasMapEntry();

        boolean hasMessageSetWireFormat();

        boolean hasNoStandardDescriptorAccessor();
    }

    /* JADX INFO: renamed from: l74$g */
    public static final class C8664g extends u27.AbstractC13327e<C8664g, a> implements InterfaceC8666h {
        public static final int ALLOW_ALIAS_FIELD_NUMBER = 2;
        private static final C8664g DEFAULT_INSTANCE;
        public static final int DEPRECATED_FIELD_NUMBER = 3;
        public static final int DEPRECATED_LEGACY_JSON_FIELD_CONFLICTS_FIELD_NUMBER = 6;
        public static final int FEATURES_FIELD_NUMBER = 7;
        private static volatile vhc<C8664g> PARSER = null;
        public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
        private boolean allowAlias_;
        private int bitField0_;
        private boolean deprecatedLegacyJsonFieldConflicts_;
        private boolean deprecated_;
        private C8680o features_;
        private byte memoizedIsInitialized = 2;
        private v98.InterfaceC13956l<C8693u0> uninterpretedOption_ = u27.m23036w();

        /* JADX INFO: renamed from: l74$g$a */
        public static final class a extends u27.AbstractC13326d<C8664g, a> implements InterfaceC8666h {
            public /* synthetic */ a(C8652a c8652a) {
                this();
            }

            public a addAllUninterpretedOption(Iterable<? extends C8693u0> values) {
                m23058e();
                ((C8664g) this.f86607b).addAllUninterpretedOption(values);
                return this;
            }

            public a addUninterpretedOption(C8693u0 value) {
                m23058e();
                ((C8664g) this.f86607b).addUninterpretedOption(value);
                return this;
            }

            public a clearAllowAlias() {
                m23058e();
                ((C8664g) this.f86607b).clearAllowAlias();
                return this;
            }

            public a clearDeprecated() {
                m23058e();
                ((C8664g) this.f86607b).clearDeprecated();
                return this;
            }

            @Deprecated
            public a clearDeprecatedLegacyJsonFieldConflicts() {
                m23058e();
                ((C8664g) this.f86607b).clearDeprecatedLegacyJsonFieldConflicts();
                return this;
            }

            public a clearFeatures() {
                m23058e();
                ((C8664g) this.f86607b).clearFeatures();
                return this;
            }

            public a clearUninterpretedOption() {
                m23058e();
                ((C8664g) this.f86607b).clearUninterpretedOption();
                return this;
            }

            @Override // p000.l74.InterfaceC8666h
            public boolean getAllowAlias() {
                return ((C8664g) this.f86607b).getAllowAlias();
            }

            @Override // p000.l74.InterfaceC8666h
            public boolean getDeprecated() {
                return ((C8664g) this.f86607b).getDeprecated();
            }

            @Override // p000.l74.InterfaceC8666h
            @Deprecated
            public boolean getDeprecatedLegacyJsonFieldConflicts() {
                return ((C8664g) this.f86607b).getDeprecatedLegacyJsonFieldConflicts();
            }

            @Override // p000.l74.InterfaceC8666h
            public C8680o getFeatures() {
                return ((C8664g) this.f86607b).getFeatures();
            }

            @Override // p000.l74.InterfaceC8666h
            public C8693u0 getUninterpretedOption(int index) {
                return ((C8664g) this.f86607b).getUninterpretedOption(index);
            }

            @Override // p000.l74.InterfaceC8666h
            public int getUninterpretedOptionCount() {
                return ((C8664g) this.f86607b).getUninterpretedOptionCount();
            }

            @Override // p000.l74.InterfaceC8666h
            public List<C8693u0> getUninterpretedOptionList() {
                return Collections.unmodifiableList(((C8664g) this.f86607b).getUninterpretedOptionList());
            }

            @Override // p000.l74.InterfaceC8666h
            public boolean hasAllowAlias() {
                return ((C8664g) this.f86607b).hasAllowAlias();
            }

            @Override // p000.l74.InterfaceC8666h
            public boolean hasDeprecated() {
                return ((C8664g) this.f86607b).hasDeprecated();
            }

            @Override // p000.l74.InterfaceC8666h
            @Deprecated
            public boolean hasDeprecatedLegacyJsonFieldConflicts() {
                return ((C8664g) this.f86607b).hasDeprecatedLegacyJsonFieldConflicts();
            }

            @Override // p000.l74.InterfaceC8666h
            public boolean hasFeatures() {
                return ((C8664g) this.f86607b).hasFeatures();
            }

            public a mergeFeatures(C8680o value) {
                m23058e();
                ((C8664g) this.f86607b).mergeFeatures(value);
                return this;
            }

            public a removeUninterpretedOption(int index) {
                m23058e();
                ((C8664g) this.f86607b).removeUninterpretedOption(index);
                return this;
            }

            public a setAllowAlias(boolean value) {
                m23058e();
                ((C8664g) this.f86607b).setAllowAlias(value);
                return this;
            }

            public a setDeprecated(boolean value) {
                m23058e();
                ((C8664g) this.f86607b).setDeprecated(value);
                return this;
            }

            @Deprecated
            public a setDeprecatedLegacyJsonFieldConflicts(boolean value) {
                m23058e();
                ((C8664g) this.f86607b).setDeprecatedLegacyJsonFieldConflicts(value);
                return this;
            }

            public a setFeatures(C8680o value) {
                m23058e();
                ((C8664g) this.f86607b).setFeatures(value);
                return this;
            }

            public a setUninterpretedOption(int index, C8693u0 value) {
                m23058e();
                ((C8664g) this.f86607b).setUninterpretedOption(index, value);
                return this;
            }

            private a() {
                super(C8664g.DEFAULT_INSTANCE);
            }

            public a addUninterpretedOption(int index, C8693u0 value) {
                m23058e();
                ((C8664g) this.f86607b).addUninterpretedOption(index, value);
                return this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public a setFeatures(C8680o.a builderForValue) {
                m23058e();
                ((C8664g) this.f86607b).setFeatures((C8680o) builderForValue.build());
                return this;
            }

            public a setUninterpretedOption(int index, C8693u0.a builderForValue) {
                m23058e();
                ((C8664g) this.f86607b).setUninterpretedOption(index, builderForValue.build());
                return this;
            }

            public a addUninterpretedOption(C8693u0.a builderForValue) {
                m23058e();
                ((C8664g) this.f86607b).addUninterpretedOption(builderForValue.build());
                return this;
            }

            public a addUninterpretedOption(int index, C8693u0.a builderForValue) {
                m23058e();
                ((C8664g) this.f86607b).addUninterpretedOption(index, builderForValue.build());
                return this;
            }
        }

        static {
            C8664g c8664g = new C8664g();
            DEFAULT_INSTANCE = c8664g;
            u27.m23029g0(C8664g.class, c8664g);
        }

        private C8664g() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllUninterpretedOption(Iterable<? extends C8693u0> values) {
            ensureUninterpretedOptionIsMutable();
            AbstractC0027a3.m80a(values, this.uninterpretedOption_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addUninterpretedOption(C8693u0 value) {
            value.getClass();
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.add(value);
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
        public void clearDeprecatedLegacyJsonFieldConflicts() {
            this.bitField0_ &= -5;
            this.deprecatedLegacyJsonFieldConflicts_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFeatures() {
            this.features_ = null;
            this.bitField0_ &= -9;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUninterpretedOption() {
            this.uninterpretedOption_ = u27.m23036w();
        }

        private void ensureUninterpretedOptionIsMutable() {
            v98.InterfaceC13956l<C8693u0> interfaceC13956l = this.uninterpretedOption_;
            if (interfaceC13956l.isModifiable()) {
                return;
            }
            this.uninterpretedOption_ = u27.m23012O(interfaceC13956l);
        }

        public static C8664g getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public void mergeFeatures(C8680o value) {
            value.getClass();
            C8680o c8680o = this.features_;
            if (c8680o == null || c8680o == C8680o.getDefaultInstance()) {
                this.features_ = value;
            } else {
                this.features_ = ((C8680o.a) C8680o.newBuilder(this.features_).mergeFrom(value)).buildPartial();
            }
            this.bitField0_ |= 8;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static a newBuilder() {
            return (a) DEFAULT_INSTANCE.m23053m();
        }

        public static C8664g parseDelimitedFrom(InputStream input) throws IOException {
            return (C8664g) u27.m23014R(DEFAULT_INSTANCE, input);
        }

        public static C8664g parseFrom(ByteBuffer data) throws be8 {
            return (C8664g) u27.m23022Z(DEFAULT_INSTANCE, data);
        }

        public static vhc<C8664g> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeUninterpretedOption(int index) {
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.remove(index);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAllowAlias(boolean value) {
            this.bitField0_ |= 1;
            this.allowAlias_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDeprecated(boolean value) {
            this.bitField0_ |= 2;
            this.deprecated_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDeprecatedLegacyJsonFieldConflicts(boolean value) {
            this.bitField0_ |= 4;
            this.deprecatedLegacyJsonFieldConflicts_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFeatures(C8680o value) {
            value.getClass();
            this.features_ = value;
            this.bitField0_ |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUninterpretedOption(int index, C8693u0 value) {
            value.getClass();
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.set(index, value);
        }

        @Override // p000.l74.InterfaceC8666h
        public boolean getAllowAlias() {
            return this.allowAlias_;
        }

        @Override // p000.l74.InterfaceC8666h
        public boolean getDeprecated() {
            return this.deprecated_;
        }

        @Override // p000.l74.InterfaceC8666h
        @Deprecated
        public boolean getDeprecatedLegacyJsonFieldConflicts() {
            return this.deprecatedLegacyJsonFieldConflicts_;
        }

        @Override // p000.l74.InterfaceC8666h
        public C8680o getFeatures() {
            C8680o c8680o = this.features_;
            return c8680o == null ? C8680o.getDefaultInstance() : c8680o;
        }

        @Override // p000.l74.InterfaceC8666h
        public C8693u0 getUninterpretedOption(int index) {
            return this.uninterpretedOption_.get(index);
        }

        @Override // p000.l74.InterfaceC8666h
        public int getUninterpretedOptionCount() {
            return this.uninterpretedOption_.size();
        }

        @Override // p000.l74.InterfaceC8666h
        public List<C8693u0> getUninterpretedOptionList() {
            return this.uninterpretedOption_;
        }

        public InterfaceC8695v0 getUninterpretedOptionOrBuilder(int index) {
            return this.uninterpretedOption_.get(index);
        }

        public List<? extends InterfaceC8695v0> getUninterpretedOptionOrBuilderList() {
            return this.uninterpretedOption_;
        }

        @Override // p000.l74.InterfaceC8666h
        public boolean hasAllowAlias() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // p000.l74.InterfaceC8666h
        public boolean hasDeprecated() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // p000.l74.InterfaceC8666h
        @Deprecated
        public boolean hasDeprecatedLegacyJsonFieldConflicts() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // p000.l74.InterfaceC8666h
        public boolean hasFeatures() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // p000.u27
        /* JADX INFO: renamed from: q */
        public final Object mo79q(u27.EnumC13331i method, Object arg0, Object arg1) {
            C8652a c8652a = null;
            switch (C8652a.f56391a[method.ordinal()]) {
                case 1:
                    return new C8664g();
                case 2:
                    return new a(c8652a);
                case 3:
                    return u27.m23013P(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0002ϧ\u0005\u0000\u0001\u0002\u0002ဇ\u0000\u0003ဇ\u0001\u0006ဇ\u0002\u0007ᐉ\u0003ϧЛ", new Object[]{"bitField0_", "allowAlias_", "deprecated_", "deprecatedLegacyJsonFieldConflicts_", "features_", "uninterpretedOption_", C8693u0.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    vhc<C8664g> c13325c = PARSER;
                    if (c13325c == null) {
                        synchronized (C8664g.class) {
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
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    this.memoizedIsInitialized = (byte) (arg0 == null ? 0 : 1);
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static a newBuilder(C8664g prototype) {
            return (a) DEFAULT_INSTANCE.m23054n(prototype);
        }

        public static C8664g parseDelimitedFrom(InputStream input, yi5 extensionRegistry) throws IOException {
            return (C8664g) u27.m23015S(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static C8664g parseFrom(ByteBuffer data, yi5 extensionRegistry) throws be8 {
            return (C8664g) u27.m23023a0(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static C8664g parseFrom(wj1 data) throws be8 {
            return (C8664g) u27.m23016T(DEFAULT_INSTANCE, data);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addUninterpretedOption(int index, C8693u0 value) {
            value.getClass();
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.add(index, value);
        }

        public static C8664g parseFrom(wj1 data, yi5 extensionRegistry) throws be8 {
            return (C8664g) u27.m23017U(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static C8664g parseFrom(byte[] data) throws be8 {
            return (C8664g) u27.m23024b0(DEFAULT_INSTANCE, data);
        }

        public static C8664g parseFrom(byte[] data, yi5 extensionRegistry) throws be8 {
            return (C8664g) u27.m23025c0(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static C8664g parseFrom(InputStream input) throws IOException {
            return (C8664g) u27.m23020X(DEFAULT_INSTANCE, input);
        }

        public static C8664g parseFrom(InputStream input, yi5 extensionRegistry) throws IOException {
            return (C8664g) u27.m23021Y(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static C8664g parseFrom(e72 input) throws IOException {
            return (C8664g) u27.m23018V(DEFAULT_INSTANCE, input);
        }

        public static C8664g parseFrom(e72 input, yi5 extensionRegistry) throws IOException {
            return (C8664g) u27.m23019W(DEFAULT_INSTANCE, input, extensionRegistry);
        }
    }

    /* JADX INFO: renamed from: l74$g0 */
    public static final class C8665g0 extends u27<C8665g0, a> implements InterfaceC8667h0 {
        public static final int CLIENT_STREAMING_FIELD_NUMBER = 5;
        private static final C8665g0 DEFAULT_INSTANCE;
        public static final int INPUT_TYPE_FIELD_NUMBER = 2;
        public static final int NAME_FIELD_NUMBER = 1;
        public static final int OPTIONS_FIELD_NUMBER = 4;
        public static final int OUTPUT_TYPE_FIELD_NUMBER = 3;
        private static volatile vhc<C8665g0> PARSER = null;
        public static final int SERVER_STREAMING_FIELD_NUMBER = 6;
        private int bitField0_;
        private boolean clientStreaming_;
        private C8669i0 options_;
        private boolean serverStreaming_;
        private byte memoizedIsInitialized = 2;
        private String name_ = "";
        private String inputType_ = "";
        private String outputType_ = "";

        /* JADX INFO: renamed from: l74$g0$a */
        public static final class a extends u27.AbstractC13324b<C8665g0, a> implements InterfaceC8667h0 {
            public /* synthetic */ a(C8652a c8652a) {
                this();
            }

            public a clearClientStreaming() {
                m23058e();
                ((C8665g0) this.f86607b).clearClientStreaming();
                return this;
            }

            public a clearInputType() {
                m23058e();
                ((C8665g0) this.f86607b).clearInputType();
                return this;
            }

            public a clearName() {
                m23058e();
                ((C8665g0) this.f86607b).clearName();
                return this;
            }

            public a clearOptions() {
                m23058e();
                ((C8665g0) this.f86607b).clearOptions();
                return this;
            }

            public a clearOutputType() {
                m23058e();
                ((C8665g0) this.f86607b).clearOutputType();
                return this;
            }

            public a clearServerStreaming() {
                m23058e();
                ((C8665g0) this.f86607b).clearServerStreaming();
                return this;
            }

            @Override // p000.l74.InterfaceC8667h0
            public boolean getClientStreaming() {
                return ((C8665g0) this.f86607b).getClientStreaming();
            }

            @Override // p000.l74.InterfaceC8667h0
            public String getInputType() {
                return ((C8665g0) this.f86607b).getInputType();
            }

            @Override // p000.l74.InterfaceC8667h0
            public wj1 getInputTypeBytes() {
                return ((C8665g0) this.f86607b).getInputTypeBytes();
            }

            @Override // p000.l74.InterfaceC8667h0
            public String getName() {
                return ((C8665g0) this.f86607b).getName();
            }

            @Override // p000.l74.InterfaceC8667h0
            public wj1 getNameBytes() {
                return ((C8665g0) this.f86607b).getNameBytes();
            }

            @Override // p000.l74.InterfaceC8667h0
            public C8669i0 getOptions() {
                return ((C8665g0) this.f86607b).getOptions();
            }

            @Override // p000.l74.InterfaceC8667h0
            public String getOutputType() {
                return ((C8665g0) this.f86607b).getOutputType();
            }

            @Override // p000.l74.InterfaceC8667h0
            public wj1 getOutputTypeBytes() {
                return ((C8665g0) this.f86607b).getOutputTypeBytes();
            }

            @Override // p000.l74.InterfaceC8667h0
            public boolean getServerStreaming() {
                return ((C8665g0) this.f86607b).getServerStreaming();
            }

            @Override // p000.l74.InterfaceC8667h0
            public boolean hasClientStreaming() {
                return ((C8665g0) this.f86607b).hasClientStreaming();
            }

            @Override // p000.l74.InterfaceC8667h0
            public boolean hasInputType() {
                return ((C8665g0) this.f86607b).hasInputType();
            }

            @Override // p000.l74.InterfaceC8667h0
            public boolean hasName() {
                return ((C8665g0) this.f86607b).hasName();
            }

            @Override // p000.l74.InterfaceC8667h0
            public boolean hasOptions() {
                return ((C8665g0) this.f86607b).hasOptions();
            }

            @Override // p000.l74.InterfaceC8667h0
            public boolean hasOutputType() {
                return ((C8665g0) this.f86607b).hasOutputType();
            }

            @Override // p000.l74.InterfaceC8667h0
            public boolean hasServerStreaming() {
                return ((C8665g0) this.f86607b).hasServerStreaming();
            }

            public a mergeOptions(C8669i0 value) {
                m23058e();
                ((C8665g0) this.f86607b).mergeOptions(value);
                return this;
            }

            public a setClientStreaming(boolean value) {
                m23058e();
                ((C8665g0) this.f86607b).setClientStreaming(value);
                return this;
            }

            public a setInputType(String value) {
                m23058e();
                ((C8665g0) this.f86607b).setInputType(value);
                return this;
            }

            public a setInputTypeBytes(wj1 value) {
                m23058e();
                ((C8665g0) this.f86607b).setInputTypeBytes(value);
                return this;
            }

            public a setName(String value) {
                m23058e();
                ((C8665g0) this.f86607b).setName(value);
                return this;
            }

            public a setNameBytes(wj1 value) {
                m23058e();
                ((C8665g0) this.f86607b).setNameBytes(value);
                return this;
            }

            public a setOptions(C8669i0 value) {
                m23058e();
                ((C8665g0) this.f86607b).setOptions(value);
                return this;
            }

            public a setOutputType(String value) {
                m23058e();
                ((C8665g0) this.f86607b).setOutputType(value);
                return this;
            }

            public a setOutputTypeBytes(wj1 value) {
                m23058e();
                ((C8665g0) this.f86607b).setOutputTypeBytes(value);
                return this;
            }

            public a setServerStreaming(boolean value) {
                m23058e();
                ((C8665g0) this.f86607b).setServerStreaming(value);
                return this;
            }

            private a() {
                super(C8665g0.DEFAULT_INSTANCE);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public a setOptions(C8669i0.a builderForValue) {
                m23058e();
                ((C8665g0) this.f86607b).setOptions((C8669i0) builderForValue.build());
                return this;
            }
        }

        static {
            C8665g0 c8665g0 = new C8665g0();
            DEFAULT_INSTANCE = c8665g0;
            u27.m23029g0(C8665g0.class, c8665g0);
        }

        private C8665g0() {
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

        public static C8665g0 getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public void mergeOptions(C8669i0 value) {
            value.getClass();
            C8669i0 c8669i0 = this.options_;
            if (c8669i0 == null || c8669i0 == C8669i0.getDefaultInstance()) {
                this.options_ = value;
            } else {
                this.options_ = ((C8669i0.a) C8669i0.newBuilder(this.options_).mergeFrom(value)).buildPartial();
            }
            this.bitField0_ |= 8;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.m23053m();
        }

        public static C8665g0 parseDelimitedFrom(InputStream input) throws IOException {
            return (C8665g0) u27.m23014R(DEFAULT_INSTANCE, input);
        }

        public static C8665g0 parseFrom(ByteBuffer data) throws be8 {
            return (C8665g0) u27.m23022Z(DEFAULT_INSTANCE, data);
        }

        public static vhc<C8665g0> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setClientStreaming(boolean value) {
            this.bitField0_ |= 16;
            this.clientStreaming_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setInputType(String value) {
            value.getClass();
            this.bitField0_ |= 2;
            this.inputType_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setInputTypeBytes(wj1 value) {
            this.inputType_ = value.toStringUtf8();
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setName(String value) {
            value.getClass();
            this.bitField0_ |= 1;
            this.name_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNameBytes(wj1 value) {
            this.name_ = value.toStringUtf8();
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOptions(C8669i0 value) {
            value.getClass();
            this.options_ = value;
            this.bitField0_ |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOutputType(String value) {
            value.getClass();
            this.bitField0_ |= 4;
            this.outputType_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOutputTypeBytes(wj1 value) {
            this.outputType_ = value.toStringUtf8();
            this.bitField0_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setServerStreaming(boolean value) {
            this.bitField0_ |= 32;
            this.serverStreaming_ = value;
        }

        @Override // p000.l74.InterfaceC8667h0
        public boolean getClientStreaming() {
            return this.clientStreaming_;
        }

        @Override // p000.l74.InterfaceC8667h0
        public String getInputType() {
            return this.inputType_;
        }

        @Override // p000.l74.InterfaceC8667h0
        public wj1 getInputTypeBytes() {
            return wj1.copyFromUtf8(this.inputType_);
        }

        @Override // p000.l74.InterfaceC8667h0
        public String getName() {
            return this.name_;
        }

        @Override // p000.l74.InterfaceC8667h0
        public wj1 getNameBytes() {
            return wj1.copyFromUtf8(this.name_);
        }

        @Override // p000.l74.InterfaceC8667h0
        public C8669i0 getOptions() {
            C8669i0 c8669i0 = this.options_;
            return c8669i0 == null ? C8669i0.getDefaultInstance() : c8669i0;
        }

        @Override // p000.l74.InterfaceC8667h0
        public String getOutputType() {
            return this.outputType_;
        }

        @Override // p000.l74.InterfaceC8667h0
        public wj1 getOutputTypeBytes() {
            return wj1.copyFromUtf8(this.outputType_);
        }

        @Override // p000.l74.InterfaceC8667h0
        public boolean getServerStreaming() {
            return this.serverStreaming_;
        }

        @Override // p000.l74.InterfaceC8667h0
        public boolean hasClientStreaming() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // p000.l74.InterfaceC8667h0
        public boolean hasInputType() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // p000.l74.InterfaceC8667h0
        public boolean hasName() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // p000.l74.InterfaceC8667h0
        public boolean hasOptions() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // p000.l74.InterfaceC8667h0
        public boolean hasOutputType() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // p000.l74.InterfaceC8667h0
        public boolean hasServerStreaming() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // p000.u27
        /* JADX INFO: renamed from: q */
        public final Object mo79q(u27.EnumC13331i method, Object arg0, Object arg1) {
            C8652a c8652a = null;
            switch (C8652a.f56391a[method.ordinal()]) {
                case 1:
                    return new C8665g0();
                case 2:
                    return new a(c8652a);
                case 3:
                    return u27.m23013P(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0001\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ᐉ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"bitField0_", "name_", "inputType_", "outputType_", "options_", "clientStreaming_", "serverStreaming_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    vhc<C8665g0> c13325c = PARSER;
                    if (c13325c == null) {
                        synchronized (C8665g0.class) {
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
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    this.memoizedIsInitialized = (byte) (arg0 == null ? 0 : 1);
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public static a newBuilder(C8665g0 prototype) {
            return DEFAULT_INSTANCE.m23054n(prototype);
        }

        public static C8665g0 parseDelimitedFrom(InputStream input, yi5 extensionRegistry) throws IOException {
            return (C8665g0) u27.m23015S(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static C8665g0 parseFrom(ByteBuffer data, yi5 extensionRegistry) throws be8 {
            return (C8665g0) u27.m23023a0(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static C8665g0 parseFrom(wj1 data) throws be8 {
            return (C8665g0) u27.m23016T(DEFAULT_INSTANCE, data);
        }

        public static C8665g0 parseFrom(wj1 data, yi5 extensionRegistry) throws be8 {
            return (C8665g0) u27.m23017U(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static C8665g0 parseFrom(byte[] data) throws be8 {
            return (C8665g0) u27.m23024b0(DEFAULT_INSTANCE, data);
        }

        public static C8665g0 parseFrom(byte[] data, yi5 extensionRegistry) throws be8 {
            return (C8665g0) u27.m23025c0(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static C8665g0 parseFrom(InputStream input) throws IOException {
            return (C8665g0) u27.m23020X(DEFAULT_INSTANCE, input);
        }

        public static C8665g0 parseFrom(InputStream input, yi5 extensionRegistry) throws IOException {
            return (C8665g0) u27.m23021Y(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static C8665g0 parseFrom(e72 input) throws IOException {
            return (C8665g0) u27.m23018V(DEFAULT_INSTANCE, input);
        }

        public static C8665g0 parseFrom(e72 input, yi5 extensionRegistry) throws IOException {
            return (C8665g0) u27.m23019W(DEFAULT_INSTANCE, input, extensionRegistry);
        }
    }

    /* JADX INFO: renamed from: l74$h */
    public interface InterfaceC8666h extends u27.InterfaceC13328f<C8664g, C8664g.a> {
        boolean getAllowAlias();

        boolean getDeprecated();

        @Deprecated
        boolean getDeprecatedLegacyJsonFieldConflicts();

        C8680o getFeatures();

        C8693u0 getUninterpretedOption(int index);

        int getUninterpretedOptionCount();

        List<C8693u0> getUninterpretedOptionList();

        boolean hasAllowAlias();

        boolean hasDeprecated();

        @Deprecated
        boolean hasDeprecatedLegacyJsonFieldConflicts();

        boolean hasFeatures();
    }

    /* JADX INFO: renamed from: l74$h0 */
    public interface InterfaceC8667h0 extends ssa {
        boolean getClientStreaming();

        String getInputType();

        wj1 getInputTypeBytes();

        String getName();

        wj1 getNameBytes();

        C8669i0 getOptions();

        String getOutputType();

        wj1 getOutputTypeBytes();

        boolean getServerStreaming();

        boolean hasClientStreaming();

        boolean hasInputType();

        boolean hasName();

        boolean hasOptions();

        boolean hasOutputType();

        boolean hasServerStreaming();
    }

    /* JADX INFO: renamed from: l74$i */
    public static final class C8668i extends u27<C8668i, a> implements InterfaceC8670j {
        private static final C8668i DEFAULT_INSTANCE;
        public static final int NAME_FIELD_NUMBER = 1;
        public static final int NUMBER_FIELD_NUMBER = 2;
        public static final int OPTIONS_FIELD_NUMBER = 3;
        private static volatile vhc<C8668i> PARSER;
        private int bitField0_;
        private byte memoizedIsInitialized = 2;
        private String name_ = "";
        private int number_;
        private C8672k options_;

        /* JADX INFO: renamed from: l74$i$a */
        public static final class a extends u27.AbstractC13324b<C8668i, a> implements InterfaceC8670j {
            public /* synthetic */ a(C8652a c8652a) {
                this();
            }

            public a clearName() {
                m23058e();
                ((C8668i) this.f86607b).clearName();
                return this;
            }

            public a clearNumber() {
                m23058e();
                ((C8668i) this.f86607b).clearNumber();
                return this;
            }

            public a clearOptions() {
                m23058e();
                ((C8668i) this.f86607b).clearOptions();
                return this;
            }

            @Override // p000.l74.InterfaceC8670j
            public String getName() {
                return ((C8668i) this.f86607b).getName();
            }

            @Override // p000.l74.InterfaceC8670j
            public wj1 getNameBytes() {
                return ((C8668i) this.f86607b).getNameBytes();
            }

            @Override // p000.l74.InterfaceC8670j
            public int getNumber() {
                return ((C8668i) this.f86607b).getNumber();
            }

            @Override // p000.l74.InterfaceC8670j
            public C8672k getOptions() {
                return ((C8668i) this.f86607b).getOptions();
            }

            @Override // p000.l74.InterfaceC8670j
            public boolean hasName() {
                return ((C8668i) this.f86607b).hasName();
            }

            @Override // p000.l74.InterfaceC8670j
            public boolean hasNumber() {
                return ((C8668i) this.f86607b).hasNumber();
            }

            @Override // p000.l74.InterfaceC8670j
            public boolean hasOptions() {
                return ((C8668i) this.f86607b).hasOptions();
            }

            public a mergeOptions(C8672k value) {
                m23058e();
                ((C8668i) this.f86607b).mergeOptions(value);
                return this;
            }

            public a setName(String value) {
                m23058e();
                ((C8668i) this.f86607b).setName(value);
                return this;
            }

            public a setNameBytes(wj1 value) {
                m23058e();
                ((C8668i) this.f86607b).setNameBytes(value);
                return this;
            }

            public a setNumber(int value) {
                m23058e();
                ((C8668i) this.f86607b).setNumber(value);
                return this;
            }

            public a setOptions(C8672k value) {
                m23058e();
                ((C8668i) this.f86607b).setOptions(value);
                return this;
            }

            private a() {
                super(C8668i.DEFAULT_INSTANCE);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public a setOptions(C8672k.a builderForValue) {
                m23058e();
                ((C8668i) this.f86607b).setOptions((C8672k) builderForValue.build());
                return this;
            }
        }

        static {
            C8668i c8668i = new C8668i();
            DEFAULT_INSTANCE = c8668i;
            u27.m23029g0(C8668i.class, c8668i);
        }

        private C8668i() {
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

        public static C8668i getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public void mergeOptions(C8672k value) {
            value.getClass();
            C8672k c8672k = this.options_;
            if (c8672k == null || c8672k == C8672k.getDefaultInstance()) {
                this.options_ = value;
            } else {
                this.options_ = ((C8672k.a) C8672k.newBuilder(this.options_).mergeFrom(value)).buildPartial();
            }
            this.bitField0_ |= 4;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.m23053m();
        }

        public static C8668i parseDelimitedFrom(InputStream input) throws IOException {
            return (C8668i) u27.m23014R(DEFAULT_INSTANCE, input);
        }

        public static C8668i parseFrom(ByteBuffer data) throws be8 {
            return (C8668i) u27.m23022Z(DEFAULT_INSTANCE, data);
        }

        public static vhc<C8668i> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setName(String value) {
            value.getClass();
            this.bitField0_ |= 1;
            this.name_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNameBytes(wj1 value) {
            this.name_ = value.toStringUtf8();
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNumber(int value) {
            this.bitField0_ |= 2;
            this.number_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOptions(C8672k value) {
            value.getClass();
            this.options_ = value;
            this.bitField0_ |= 4;
        }

        @Override // p000.l74.InterfaceC8670j
        public String getName() {
            return this.name_;
        }

        @Override // p000.l74.InterfaceC8670j
        public wj1 getNameBytes() {
            return wj1.copyFromUtf8(this.name_);
        }

        @Override // p000.l74.InterfaceC8670j
        public int getNumber() {
            return this.number_;
        }

        @Override // p000.l74.InterfaceC8670j
        public C8672k getOptions() {
            C8672k c8672k = this.options_;
            return c8672k == null ? C8672k.getDefaultInstance() : c8672k;
        }

        @Override // p000.l74.InterfaceC8670j
        public boolean hasName() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // p000.l74.InterfaceC8670j
        public boolean hasNumber() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // p000.l74.InterfaceC8670j
        public boolean hasOptions() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // p000.u27
        /* JADX INFO: renamed from: q */
        public final Object mo79q(u27.EnumC13331i method, Object arg0, Object arg1) {
            C8652a c8652a = null;
            switch (C8652a.f56391a[method.ordinal()]) {
                case 1:
                    return new C8668i();
                case 2:
                    return new a(c8652a);
                case 3:
                    return u27.m23013P(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ဈ\u0000\u0002င\u0001\u0003ᐉ\u0002", new Object[]{"bitField0_", "name_", "number_", "options_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    vhc<C8668i> c13325c = PARSER;
                    if (c13325c == null) {
                        synchronized (C8668i.class) {
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
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    this.memoizedIsInitialized = (byte) (arg0 == null ? 0 : 1);
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public static a newBuilder(C8668i prototype) {
            return DEFAULT_INSTANCE.m23054n(prototype);
        }

        public static C8668i parseDelimitedFrom(InputStream input, yi5 extensionRegistry) throws IOException {
            return (C8668i) u27.m23015S(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static C8668i parseFrom(ByteBuffer data, yi5 extensionRegistry) throws be8 {
            return (C8668i) u27.m23023a0(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static C8668i parseFrom(wj1 data) throws be8 {
            return (C8668i) u27.m23016T(DEFAULT_INSTANCE, data);
        }

        public static C8668i parseFrom(wj1 data, yi5 extensionRegistry) throws be8 {
            return (C8668i) u27.m23017U(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static C8668i parseFrom(byte[] data) throws be8 {
            return (C8668i) u27.m23024b0(DEFAULT_INSTANCE, data);
        }

        public static C8668i parseFrom(byte[] data, yi5 extensionRegistry) throws be8 {
            return (C8668i) u27.m23025c0(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static C8668i parseFrom(InputStream input) throws IOException {
            return (C8668i) u27.m23020X(DEFAULT_INSTANCE, input);
        }

        public static C8668i parseFrom(InputStream input, yi5 extensionRegistry) throws IOException {
            return (C8668i) u27.m23021Y(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static C8668i parseFrom(e72 input) throws IOException {
            return (C8668i) u27.m23018V(DEFAULT_INSTANCE, input);
        }

        public static C8668i parseFrom(e72 input, yi5 extensionRegistry) throws IOException {
            return (C8668i) u27.m23019W(DEFAULT_INSTANCE, input, extensionRegistry);
        }
    }

    /* JADX INFO: renamed from: l74$i0 */
    public static final class C8669i0 extends u27.AbstractC13327e<C8669i0, a> implements InterfaceC8671j0 {
        private static final C8669i0 DEFAULT_INSTANCE;
        public static final int DEPRECATED_FIELD_NUMBER = 33;
        public static final int FEATURES_FIELD_NUMBER = 35;
        public static final int IDEMPOTENCY_LEVEL_FIELD_NUMBER = 34;
        private static volatile vhc<C8669i0> PARSER = null;
        public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
        private int bitField0_;
        private boolean deprecated_;
        private C8680o features_;
        private int idempotencyLevel_;
        private byte memoizedIsInitialized = 2;
        private v98.InterfaceC13956l<C8693u0> uninterpretedOption_ = u27.m23036w();

        /* JADX INFO: renamed from: l74$i0$a */
        public static final class a extends u27.AbstractC13326d<C8669i0, a> implements InterfaceC8671j0 {
            public /* synthetic */ a(C8652a c8652a) {
                this();
            }

            public a addAllUninterpretedOption(Iterable<? extends C8693u0> values) {
                m23058e();
                ((C8669i0) this.f86607b).addAllUninterpretedOption(values);
                return this;
            }

            public a addUninterpretedOption(C8693u0 value) {
                m23058e();
                ((C8669i0) this.f86607b).addUninterpretedOption(value);
                return this;
            }

            public a clearDeprecated() {
                m23058e();
                ((C8669i0) this.f86607b).clearDeprecated();
                return this;
            }

            public a clearFeatures() {
                m23058e();
                ((C8669i0) this.f86607b).clearFeatures();
                return this;
            }

            public a clearIdempotencyLevel() {
                m23058e();
                ((C8669i0) this.f86607b).clearIdempotencyLevel();
                return this;
            }

            public a clearUninterpretedOption() {
                m23058e();
                ((C8669i0) this.f86607b).clearUninterpretedOption();
                return this;
            }

            @Override // p000.l74.InterfaceC8671j0
            public boolean getDeprecated() {
                return ((C8669i0) this.f86607b).getDeprecated();
            }

            @Override // p000.l74.InterfaceC8671j0
            public C8680o getFeatures() {
                return ((C8669i0) this.f86607b).getFeatures();
            }

            @Override // p000.l74.InterfaceC8671j0
            public b getIdempotencyLevel() {
                return ((C8669i0) this.f86607b).getIdempotencyLevel();
            }

            @Override // p000.l74.InterfaceC8671j0
            public C8693u0 getUninterpretedOption(int index) {
                return ((C8669i0) this.f86607b).getUninterpretedOption(index);
            }

            @Override // p000.l74.InterfaceC8671j0
            public int getUninterpretedOptionCount() {
                return ((C8669i0) this.f86607b).getUninterpretedOptionCount();
            }

            @Override // p000.l74.InterfaceC8671j0
            public List<C8693u0> getUninterpretedOptionList() {
                return Collections.unmodifiableList(((C8669i0) this.f86607b).getUninterpretedOptionList());
            }

            @Override // p000.l74.InterfaceC8671j0
            public boolean hasDeprecated() {
                return ((C8669i0) this.f86607b).hasDeprecated();
            }

            @Override // p000.l74.InterfaceC8671j0
            public boolean hasFeatures() {
                return ((C8669i0) this.f86607b).hasFeatures();
            }

            @Override // p000.l74.InterfaceC8671j0
            public boolean hasIdempotencyLevel() {
                return ((C8669i0) this.f86607b).hasIdempotencyLevel();
            }

            public a mergeFeatures(C8680o value) {
                m23058e();
                ((C8669i0) this.f86607b).mergeFeatures(value);
                return this;
            }

            public a removeUninterpretedOption(int index) {
                m23058e();
                ((C8669i0) this.f86607b).removeUninterpretedOption(index);
                return this;
            }

            public a setDeprecated(boolean value) {
                m23058e();
                ((C8669i0) this.f86607b).setDeprecated(value);
                return this;
            }

            public a setFeatures(C8680o value) {
                m23058e();
                ((C8669i0) this.f86607b).setFeatures(value);
                return this;
            }

            public a setIdempotencyLevel(b value) {
                m23058e();
                ((C8669i0) this.f86607b).setIdempotencyLevel(value);
                return this;
            }

            public a setUninterpretedOption(int index, C8693u0 value) {
                m23058e();
                ((C8669i0) this.f86607b).setUninterpretedOption(index, value);
                return this;
            }

            private a() {
                super(C8669i0.DEFAULT_INSTANCE);
            }

            public a addUninterpretedOption(int index, C8693u0 value) {
                m23058e();
                ((C8669i0) this.f86607b).addUninterpretedOption(index, value);
                return this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public a setFeatures(C8680o.a builderForValue) {
                m23058e();
                ((C8669i0) this.f86607b).setFeatures((C8680o) builderForValue.build());
                return this;
            }

            public a setUninterpretedOption(int index, C8693u0.a builderForValue) {
                m23058e();
                ((C8669i0) this.f86607b).setUninterpretedOption(index, builderForValue.build());
                return this;
            }

            public a addUninterpretedOption(C8693u0.a builderForValue) {
                m23058e();
                ((C8669i0) this.f86607b).addUninterpretedOption(builderForValue.build());
                return this;
            }

            public a addUninterpretedOption(int index, C8693u0.a builderForValue) {
                m23058e();
                ((C8669i0) this.f86607b).addUninterpretedOption(index, builderForValue.build());
                return this;
            }
        }

        /* JADX INFO: renamed from: l74$i0$b */
        public enum b implements v98.InterfaceC13947c {
            IDEMPOTENCY_UNKNOWN(0),
            NO_SIDE_EFFECTS(1),
            IDEMPOTENT(2);


            /* JADX INFO: renamed from: C */
            public static final v98.InterfaceC13948d<b> f56440C = new a();

            /* JADX INFO: renamed from: e */
            public static final int f56445e = 0;

            /* JADX INFO: renamed from: f */
            public static final int f56446f = 1;

            /* JADX INFO: renamed from: m */
            public static final int f56447m = 2;

            /* JADX INFO: renamed from: a */
            public final int f56448a;

            /* JADX INFO: renamed from: l74$i0$b$a */
            public class a implements v98.InterfaceC13948d<b> {
                @Override // p000.v98.InterfaceC13948d
                public b findValueByNumber(int number) {
                    return b.forNumber(number);
                }
            }

            /* JADX INFO: renamed from: l74$i0$b$b, reason: collision with other inner class name */
            public static final class C16468b implements v98.InterfaceC13949e {

                /* JADX INFO: renamed from: a */
                public static final v98.InterfaceC13949e f56449a = new C16468b();

                private C16468b() {
                }

                @Override // p000.v98.InterfaceC13949e
                public boolean isInRange(int number) {
                    return b.forNumber(number) != null;
                }
            }

            b(int value) {
                this.f56448a = value;
            }

            public static b forNumber(int value) {
                if (value == 0) {
                    return IDEMPOTENCY_UNKNOWN;
                }
                if (value == 1) {
                    return NO_SIDE_EFFECTS;
                }
                if (value != 2) {
                    return null;
                }
                return IDEMPOTENT;
            }

            public static v98.InterfaceC13948d<b> internalGetValueMap() {
                return f56440C;
            }

            public static v98.InterfaceC13949e internalGetVerifier() {
                return C16468b.f56449a;
            }

            @Override // p000.v98.InterfaceC13947c
            public final int getNumber() {
                return this.f56448a;
            }

            @Deprecated
            public static b valueOf(int value) {
                return forNumber(value);
            }
        }

        static {
            C8669i0 c8669i0 = new C8669i0();
            DEFAULT_INSTANCE = c8669i0;
            u27.m23029g0(C8669i0.class, c8669i0);
        }

        private C8669i0() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllUninterpretedOption(Iterable<? extends C8693u0> values) {
            ensureUninterpretedOptionIsMutable();
            AbstractC0027a3.m80a(values, this.uninterpretedOption_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addUninterpretedOption(C8693u0 value) {
            value.getClass();
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.add(value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDeprecated() {
            this.bitField0_ &= -2;
            this.deprecated_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFeatures() {
            this.features_ = null;
            this.bitField0_ &= -5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIdempotencyLevel() {
            this.bitField0_ &= -3;
            this.idempotencyLevel_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUninterpretedOption() {
            this.uninterpretedOption_ = u27.m23036w();
        }

        private void ensureUninterpretedOptionIsMutable() {
            v98.InterfaceC13956l<C8693u0> interfaceC13956l = this.uninterpretedOption_;
            if (interfaceC13956l.isModifiable()) {
                return;
            }
            this.uninterpretedOption_ = u27.m23012O(interfaceC13956l);
        }

        public static C8669i0 getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public void mergeFeatures(C8680o value) {
            value.getClass();
            C8680o c8680o = this.features_;
            if (c8680o == null || c8680o == C8680o.getDefaultInstance()) {
                this.features_ = value;
            } else {
                this.features_ = ((C8680o.a) C8680o.newBuilder(this.features_).mergeFrom(value)).buildPartial();
            }
            this.bitField0_ |= 4;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static a newBuilder() {
            return (a) DEFAULT_INSTANCE.m23053m();
        }

        public static C8669i0 parseDelimitedFrom(InputStream input) throws IOException {
            return (C8669i0) u27.m23014R(DEFAULT_INSTANCE, input);
        }

        public static C8669i0 parseFrom(ByteBuffer data) throws be8 {
            return (C8669i0) u27.m23022Z(DEFAULT_INSTANCE, data);
        }

        public static vhc<C8669i0> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeUninterpretedOption(int index) {
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.remove(index);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDeprecated(boolean value) {
            this.bitField0_ |= 1;
            this.deprecated_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFeatures(C8680o value) {
            value.getClass();
            this.features_ = value;
            this.bitField0_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIdempotencyLevel(b value) {
            this.idempotencyLevel_ = value.getNumber();
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUninterpretedOption(int index, C8693u0 value) {
            value.getClass();
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.set(index, value);
        }

        @Override // p000.l74.InterfaceC8671j0
        public boolean getDeprecated() {
            return this.deprecated_;
        }

        @Override // p000.l74.InterfaceC8671j0
        public C8680o getFeatures() {
            C8680o c8680o = this.features_;
            return c8680o == null ? C8680o.getDefaultInstance() : c8680o;
        }

        @Override // p000.l74.InterfaceC8671j0
        public b getIdempotencyLevel() {
            b bVarForNumber = b.forNumber(this.idempotencyLevel_);
            return bVarForNumber == null ? b.IDEMPOTENCY_UNKNOWN : bVarForNumber;
        }

        @Override // p000.l74.InterfaceC8671j0
        public C8693u0 getUninterpretedOption(int index) {
            return this.uninterpretedOption_.get(index);
        }

        @Override // p000.l74.InterfaceC8671j0
        public int getUninterpretedOptionCount() {
            return this.uninterpretedOption_.size();
        }

        @Override // p000.l74.InterfaceC8671j0
        public List<C8693u0> getUninterpretedOptionList() {
            return this.uninterpretedOption_;
        }

        public InterfaceC8695v0 getUninterpretedOptionOrBuilder(int index) {
            return this.uninterpretedOption_.get(index);
        }

        public List<? extends InterfaceC8695v0> getUninterpretedOptionOrBuilderList() {
            return this.uninterpretedOption_;
        }

        @Override // p000.l74.InterfaceC8671j0
        public boolean hasDeprecated() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // p000.l74.InterfaceC8671j0
        public boolean hasFeatures() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // p000.l74.InterfaceC8671j0
        public boolean hasIdempotencyLevel() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // p000.u27
        /* JADX INFO: renamed from: q */
        public final Object mo79q(u27.EnumC13331i method, Object arg0, Object arg1) {
            C8652a c8652a = null;
            switch (C8652a.f56391a[method.ordinal()]) {
                case 1:
                    return new C8669i0();
                case 2:
                    return new a(c8652a);
                case 3:
                    return u27.m23013P(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001!ϧ\u0004\u0000\u0001\u0002!ဇ\u0000\"᠌\u0001#ᐉ\u0002ϧЛ", new Object[]{"bitField0_", "deprecated_", "idempotencyLevel_", b.internalGetVerifier(), "features_", "uninterpretedOption_", C8693u0.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    vhc<C8669i0> c13325c = PARSER;
                    if (c13325c == null) {
                        synchronized (C8669i0.class) {
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
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    this.memoizedIsInitialized = (byte) (arg0 == null ? 0 : 1);
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static a newBuilder(C8669i0 prototype) {
            return (a) DEFAULT_INSTANCE.m23054n(prototype);
        }

        public static C8669i0 parseDelimitedFrom(InputStream input, yi5 extensionRegistry) throws IOException {
            return (C8669i0) u27.m23015S(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static C8669i0 parseFrom(ByteBuffer data, yi5 extensionRegistry) throws be8 {
            return (C8669i0) u27.m23023a0(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static C8669i0 parseFrom(wj1 data) throws be8 {
            return (C8669i0) u27.m23016T(DEFAULT_INSTANCE, data);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addUninterpretedOption(int index, C8693u0 value) {
            value.getClass();
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.add(index, value);
        }

        public static C8669i0 parseFrom(wj1 data, yi5 extensionRegistry) throws be8 {
            return (C8669i0) u27.m23017U(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static C8669i0 parseFrom(byte[] data) throws be8 {
            return (C8669i0) u27.m23024b0(DEFAULT_INSTANCE, data);
        }

        public static C8669i0 parseFrom(byte[] data, yi5 extensionRegistry) throws be8 {
            return (C8669i0) u27.m23025c0(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static C8669i0 parseFrom(InputStream input) throws IOException {
            return (C8669i0) u27.m23020X(DEFAULT_INSTANCE, input);
        }

        public static C8669i0 parseFrom(InputStream input, yi5 extensionRegistry) throws IOException {
            return (C8669i0) u27.m23021Y(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static C8669i0 parseFrom(e72 input) throws IOException {
            return (C8669i0) u27.m23018V(DEFAULT_INSTANCE, input);
        }

        public static C8669i0 parseFrom(e72 input, yi5 extensionRegistry) throws IOException {
            return (C8669i0) u27.m23019W(DEFAULT_INSTANCE, input, extensionRegistry);
        }
    }

    /* JADX INFO: renamed from: l74$j */
    public interface InterfaceC8670j extends ssa {
        String getName();

        wj1 getNameBytes();

        int getNumber();

        C8672k getOptions();

        boolean hasName();

        boolean hasNumber();

        boolean hasOptions();
    }

    /* JADX INFO: renamed from: l74$j0 */
    public interface InterfaceC8671j0 extends u27.InterfaceC13328f<C8669i0, C8669i0.a> {
        boolean getDeprecated();

        C8680o getFeatures();

        C8669i0.b getIdempotencyLevel();

        C8693u0 getUninterpretedOption(int index);

        int getUninterpretedOptionCount();

        List<C8693u0> getUninterpretedOptionList();

        boolean hasDeprecated();

        boolean hasFeatures();

        boolean hasIdempotencyLevel();
    }

    /* JADX INFO: renamed from: l74$k */
    public static final class C8672k extends u27.AbstractC13327e<C8672k, a> implements InterfaceC8674l {
        public static final int DEBUG_REDACT_FIELD_NUMBER = 3;
        private static final C8672k DEFAULT_INSTANCE;
        public static final int DEPRECATED_FIELD_NUMBER = 1;
        public static final int FEATURES_FIELD_NUMBER = 2;
        public static final int FEATURE_SUPPORT_FIELD_NUMBER = 4;
        private static volatile vhc<C8672k> PARSER = null;
        public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
        private int bitField0_;
        private boolean debugRedact_;
        private boolean deprecated_;
        private C8692u.f featureSupport_;
        private C8680o features_;
        private byte memoizedIsInitialized = 2;
        private v98.InterfaceC13956l<C8693u0> uninterpretedOption_ = u27.m23036w();

        /* JADX INFO: renamed from: l74$k$a */
        public static final class a extends u27.AbstractC13326d<C8672k, a> implements InterfaceC8674l {
            public /* synthetic */ a(C8652a c8652a) {
                this();
            }

            public a addAllUninterpretedOption(Iterable<? extends C8693u0> values) {
                m23058e();
                ((C8672k) this.f86607b).addAllUninterpretedOption(values);
                return this;
            }

            public a addUninterpretedOption(C8693u0 value) {
                m23058e();
                ((C8672k) this.f86607b).addUninterpretedOption(value);
                return this;
            }

            public a clearDebugRedact() {
                m23058e();
                ((C8672k) this.f86607b).clearDebugRedact();
                return this;
            }

            public a clearDeprecated() {
                m23058e();
                ((C8672k) this.f86607b).clearDeprecated();
                return this;
            }

            public a clearFeatureSupport() {
                m23058e();
                ((C8672k) this.f86607b).clearFeatureSupport();
                return this;
            }

            public a clearFeatures() {
                m23058e();
                ((C8672k) this.f86607b).clearFeatures();
                return this;
            }

            public a clearUninterpretedOption() {
                m23058e();
                ((C8672k) this.f86607b).clearUninterpretedOption();
                return this;
            }

            @Override // p000.l74.InterfaceC8674l
            public boolean getDebugRedact() {
                return ((C8672k) this.f86607b).getDebugRedact();
            }

            @Override // p000.l74.InterfaceC8674l
            public boolean getDeprecated() {
                return ((C8672k) this.f86607b).getDeprecated();
            }

            @Override // p000.l74.InterfaceC8674l
            public C8692u.f getFeatureSupport() {
                return ((C8672k) this.f86607b).getFeatureSupport();
            }

            @Override // p000.l74.InterfaceC8674l
            public C8680o getFeatures() {
                return ((C8672k) this.f86607b).getFeatures();
            }

            @Override // p000.l74.InterfaceC8674l
            public C8693u0 getUninterpretedOption(int index) {
                return ((C8672k) this.f86607b).getUninterpretedOption(index);
            }

            @Override // p000.l74.InterfaceC8674l
            public int getUninterpretedOptionCount() {
                return ((C8672k) this.f86607b).getUninterpretedOptionCount();
            }

            @Override // p000.l74.InterfaceC8674l
            public List<C8693u0> getUninterpretedOptionList() {
                return Collections.unmodifiableList(((C8672k) this.f86607b).getUninterpretedOptionList());
            }

            @Override // p000.l74.InterfaceC8674l
            public boolean hasDebugRedact() {
                return ((C8672k) this.f86607b).hasDebugRedact();
            }

            @Override // p000.l74.InterfaceC8674l
            public boolean hasDeprecated() {
                return ((C8672k) this.f86607b).hasDeprecated();
            }

            @Override // p000.l74.InterfaceC8674l
            public boolean hasFeatureSupport() {
                return ((C8672k) this.f86607b).hasFeatureSupport();
            }

            @Override // p000.l74.InterfaceC8674l
            public boolean hasFeatures() {
                return ((C8672k) this.f86607b).hasFeatures();
            }

            public a mergeFeatureSupport(C8692u.f value) {
                m23058e();
                ((C8672k) this.f86607b).mergeFeatureSupport(value);
                return this;
            }

            public a mergeFeatures(C8680o value) {
                m23058e();
                ((C8672k) this.f86607b).mergeFeatures(value);
                return this;
            }

            public a removeUninterpretedOption(int index) {
                m23058e();
                ((C8672k) this.f86607b).removeUninterpretedOption(index);
                return this;
            }

            public a setDebugRedact(boolean value) {
                m23058e();
                ((C8672k) this.f86607b).setDebugRedact(value);
                return this;
            }

            public a setDeprecated(boolean value) {
                m23058e();
                ((C8672k) this.f86607b).setDeprecated(value);
                return this;
            }

            public a setFeatureSupport(C8692u.f value) {
                m23058e();
                ((C8672k) this.f86607b).setFeatureSupport(value);
                return this;
            }

            public a setFeatures(C8680o value) {
                m23058e();
                ((C8672k) this.f86607b).setFeatures(value);
                return this;
            }

            public a setUninterpretedOption(int index, C8693u0 value) {
                m23058e();
                ((C8672k) this.f86607b).setUninterpretedOption(index, value);
                return this;
            }

            private a() {
                super(C8672k.DEFAULT_INSTANCE);
            }

            public a addUninterpretedOption(int index, C8693u0 value) {
                m23058e();
                ((C8672k) this.f86607b).addUninterpretedOption(index, value);
                return this;
            }

            public a setFeatureSupport(C8692u.f.a builderForValue) {
                m23058e();
                ((C8672k) this.f86607b).setFeatureSupport(builderForValue.build());
                return this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public a setFeatures(C8680o.a builderForValue) {
                m23058e();
                ((C8672k) this.f86607b).setFeatures((C8680o) builderForValue.build());
                return this;
            }

            public a setUninterpretedOption(int index, C8693u0.a builderForValue) {
                m23058e();
                ((C8672k) this.f86607b).setUninterpretedOption(index, builderForValue.build());
                return this;
            }

            public a addUninterpretedOption(C8693u0.a builderForValue) {
                m23058e();
                ((C8672k) this.f86607b).addUninterpretedOption(builderForValue.build());
                return this;
            }

            public a addUninterpretedOption(int index, C8693u0.a builderForValue) {
                m23058e();
                ((C8672k) this.f86607b).addUninterpretedOption(index, builderForValue.build());
                return this;
            }
        }

        static {
            C8672k c8672k = new C8672k();
            DEFAULT_INSTANCE = c8672k;
            u27.m23029g0(C8672k.class, c8672k);
        }

        private C8672k() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllUninterpretedOption(Iterable<? extends C8693u0> values) {
            ensureUninterpretedOptionIsMutable();
            AbstractC0027a3.m80a(values, this.uninterpretedOption_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addUninterpretedOption(C8693u0 value) {
            value.getClass();
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.add(value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDebugRedact() {
            this.bitField0_ &= -5;
            this.debugRedact_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDeprecated() {
            this.bitField0_ &= -2;
            this.deprecated_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFeatureSupport() {
            this.featureSupport_ = null;
            this.bitField0_ &= -9;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFeatures() {
            this.features_ = null;
            this.bitField0_ &= -3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUninterpretedOption() {
            this.uninterpretedOption_ = u27.m23036w();
        }

        private void ensureUninterpretedOptionIsMutable() {
            v98.InterfaceC13956l<C8693u0> interfaceC13956l = this.uninterpretedOption_;
            if (interfaceC13956l.isModifiable()) {
                return;
            }
            this.uninterpretedOption_ = u27.m23012O(interfaceC13956l);
        }

        public static C8672k getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeFeatureSupport(C8692u.f value) {
            value.getClass();
            C8692u.f fVar = this.featureSupport_;
            if (fVar == null || fVar == C8692u.f.getDefaultInstance()) {
                this.featureSupport_ = value;
            } else {
                this.featureSupport_ = C8692u.f.newBuilder(this.featureSupport_).mergeFrom(value).buildPartial();
            }
            this.bitField0_ |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public void mergeFeatures(C8680o value) {
            value.getClass();
            C8680o c8680o = this.features_;
            if (c8680o == null || c8680o == C8680o.getDefaultInstance()) {
                this.features_ = value;
            } else {
                this.features_ = ((C8680o.a) C8680o.newBuilder(this.features_).mergeFrom(value)).buildPartial();
            }
            this.bitField0_ |= 2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static a newBuilder() {
            return (a) DEFAULT_INSTANCE.m23053m();
        }

        public static C8672k parseDelimitedFrom(InputStream input) throws IOException {
            return (C8672k) u27.m23014R(DEFAULT_INSTANCE, input);
        }

        public static C8672k parseFrom(ByteBuffer data) throws be8 {
            return (C8672k) u27.m23022Z(DEFAULT_INSTANCE, data);
        }

        public static vhc<C8672k> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeUninterpretedOption(int index) {
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.remove(index);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDebugRedact(boolean value) {
            this.bitField0_ |= 4;
            this.debugRedact_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDeprecated(boolean value) {
            this.bitField0_ |= 1;
            this.deprecated_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFeatureSupport(C8692u.f value) {
            value.getClass();
            this.featureSupport_ = value;
            this.bitField0_ |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFeatures(C8680o value) {
            value.getClass();
            this.features_ = value;
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUninterpretedOption(int index, C8693u0 value) {
            value.getClass();
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.set(index, value);
        }

        @Override // p000.l74.InterfaceC8674l
        public boolean getDebugRedact() {
            return this.debugRedact_;
        }

        @Override // p000.l74.InterfaceC8674l
        public boolean getDeprecated() {
            return this.deprecated_;
        }

        @Override // p000.l74.InterfaceC8674l
        public C8692u.f getFeatureSupport() {
            C8692u.f fVar = this.featureSupport_;
            return fVar == null ? C8692u.f.getDefaultInstance() : fVar;
        }

        @Override // p000.l74.InterfaceC8674l
        public C8680o getFeatures() {
            C8680o c8680o = this.features_;
            return c8680o == null ? C8680o.getDefaultInstance() : c8680o;
        }

        @Override // p000.l74.InterfaceC8674l
        public C8693u0 getUninterpretedOption(int index) {
            return this.uninterpretedOption_.get(index);
        }

        @Override // p000.l74.InterfaceC8674l
        public int getUninterpretedOptionCount() {
            return this.uninterpretedOption_.size();
        }

        @Override // p000.l74.InterfaceC8674l
        public List<C8693u0> getUninterpretedOptionList() {
            return this.uninterpretedOption_;
        }

        public InterfaceC8695v0 getUninterpretedOptionOrBuilder(int index) {
            return this.uninterpretedOption_.get(index);
        }

        public List<? extends InterfaceC8695v0> getUninterpretedOptionOrBuilderList() {
            return this.uninterpretedOption_;
        }

        @Override // p000.l74.InterfaceC8674l
        public boolean hasDebugRedact() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // p000.l74.InterfaceC8674l
        public boolean hasDeprecated() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // p000.l74.InterfaceC8674l
        public boolean hasFeatureSupport() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // p000.l74.InterfaceC8674l
        public boolean hasFeatures() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // p000.u27
        /* JADX INFO: renamed from: q */
        public final Object mo79q(u27.EnumC13331i method, Object arg0, Object arg1) {
            C8652a c8652a = null;
            switch (C8652a.f56391a[method.ordinal()]) {
                case 1:
                    return new C8672k();
                case 2:
                    return new a(c8652a);
                case 3:
                    return u27.m23013P(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001ϧ\u0005\u0000\u0001\u0002\u0001ဇ\u0000\u0002ᐉ\u0001\u0003ဇ\u0002\u0004ဉ\u0003ϧЛ", new Object[]{"bitField0_", "deprecated_", "features_", "debugRedact_", "featureSupport_", "uninterpretedOption_", C8693u0.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    vhc<C8672k> c13325c = PARSER;
                    if (c13325c == null) {
                        synchronized (C8672k.class) {
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
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    this.memoizedIsInitialized = (byte) (arg0 == null ? 0 : 1);
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static a newBuilder(C8672k prototype) {
            return (a) DEFAULT_INSTANCE.m23054n(prototype);
        }

        public static C8672k parseDelimitedFrom(InputStream input, yi5 extensionRegistry) throws IOException {
            return (C8672k) u27.m23015S(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static C8672k parseFrom(ByteBuffer data, yi5 extensionRegistry) throws be8 {
            return (C8672k) u27.m23023a0(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static C8672k parseFrom(wj1 data) throws be8 {
            return (C8672k) u27.m23016T(DEFAULT_INSTANCE, data);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addUninterpretedOption(int index, C8693u0 value) {
            value.getClass();
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.add(index, value);
        }

        public static C8672k parseFrom(wj1 data, yi5 extensionRegistry) throws be8 {
            return (C8672k) u27.m23017U(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static C8672k parseFrom(byte[] data) throws be8 {
            return (C8672k) u27.m23024b0(DEFAULT_INSTANCE, data);
        }

        public static C8672k parseFrom(byte[] data, yi5 extensionRegistry) throws be8 {
            return (C8672k) u27.m23025c0(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static C8672k parseFrom(InputStream input) throws IOException {
            return (C8672k) u27.m23020X(DEFAULT_INSTANCE, input);
        }

        public static C8672k parseFrom(InputStream input, yi5 extensionRegistry) throws IOException {
            return (C8672k) u27.m23021Y(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static C8672k parseFrom(e72 input) throws IOException {
            return (C8672k) u27.m23018V(DEFAULT_INSTANCE, input);
        }

        public static C8672k parseFrom(e72 input, yi5 extensionRegistry) throws IOException {
            return (C8672k) u27.m23019W(DEFAULT_INSTANCE, input, extensionRegistry);
        }
    }

    /* JADX INFO: renamed from: l74$k0 */
    public static final class C8673k0 extends u27<C8673k0, a> implements InterfaceC8675l0 {
        private static final C8673k0 DEFAULT_INSTANCE;
        public static final int NAME_FIELD_NUMBER = 1;
        public static final int OPTIONS_FIELD_NUMBER = 2;
        private static volatile vhc<C8673k0> PARSER;
        private int bitField0_;
        private byte memoizedIsInitialized = 2;
        private String name_ = "";
        private C8677m0 options_;

        /* JADX INFO: renamed from: l74$k0$a */
        public static final class a extends u27.AbstractC13324b<C8673k0, a> implements InterfaceC8675l0 {
            public /* synthetic */ a(C8652a c8652a) {
                this();
            }

            public a clearName() {
                m23058e();
                ((C8673k0) this.f86607b).clearName();
                return this;
            }

            public a clearOptions() {
                m23058e();
                ((C8673k0) this.f86607b).clearOptions();
                return this;
            }

            @Override // p000.l74.InterfaceC8675l0
            public String getName() {
                return ((C8673k0) this.f86607b).getName();
            }

            @Override // p000.l74.InterfaceC8675l0
            public wj1 getNameBytes() {
                return ((C8673k0) this.f86607b).getNameBytes();
            }

            @Override // p000.l74.InterfaceC8675l0
            public C8677m0 getOptions() {
                return ((C8673k0) this.f86607b).getOptions();
            }

            @Override // p000.l74.InterfaceC8675l0
            public boolean hasName() {
                return ((C8673k0) this.f86607b).hasName();
            }

            @Override // p000.l74.InterfaceC8675l0
            public boolean hasOptions() {
                return ((C8673k0) this.f86607b).hasOptions();
            }

            public a mergeOptions(C8677m0 value) {
                m23058e();
                ((C8673k0) this.f86607b).mergeOptions(value);
                return this;
            }

            public a setName(String value) {
                m23058e();
                ((C8673k0) this.f86607b).setName(value);
                return this;
            }

            public a setNameBytes(wj1 value) {
                m23058e();
                ((C8673k0) this.f86607b).setNameBytes(value);
                return this;
            }

            public a setOptions(C8677m0 value) {
                m23058e();
                ((C8673k0) this.f86607b).setOptions(value);
                return this;
            }

            private a() {
                super(C8673k0.DEFAULT_INSTANCE);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public a setOptions(C8677m0.a builderForValue) {
                m23058e();
                ((C8673k0) this.f86607b).setOptions((C8677m0) builderForValue.build());
                return this;
            }
        }

        static {
            C8673k0 c8673k0 = new C8673k0();
            DEFAULT_INSTANCE = c8673k0;
            u27.m23029g0(C8673k0.class, c8673k0);
        }

        private C8673k0() {
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

        public static C8673k0 getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public void mergeOptions(C8677m0 value) {
            value.getClass();
            C8677m0 c8677m0 = this.options_;
            if (c8677m0 == null || c8677m0 == C8677m0.getDefaultInstance()) {
                this.options_ = value;
            } else {
                this.options_ = ((C8677m0.a) C8677m0.newBuilder(this.options_).mergeFrom(value)).buildPartial();
            }
            this.bitField0_ |= 2;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.m23053m();
        }

        public static C8673k0 parseDelimitedFrom(InputStream input) throws IOException {
            return (C8673k0) u27.m23014R(DEFAULT_INSTANCE, input);
        }

        public static C8673k0 parseFrom(ByteBuffer data) throws be8 {
            return (C8673k0) u27.m23022Z(DEFAULT_INSTANCE, data);
        }

        public static vhc<C8673k0> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setName(String value) {
            value.getClass();
            this.bitField0_ |= 1;
            this.name_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNameBytes(wj1 value) {
            this.name_ = value.toStringUtf8();
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOptions(C8677m0 value) {
            value.getClass();
            this.options_ = value;
            this.bitField0_ |= 2;
        }

        @Override // p000.l74.InterfaceC8675l0
        public String getName() {
            return this.name_;
        }

        @Override // p000.l74.InterfaceC8675l0
        public wj1 getNameBytes() {
            return wj1.copyFromUtf8(this.name_);
        }

        @Override // p000.l74.InterfaceC8675l0
        public C8677m0 getOptions() {
            C8677m0 c8677m0 = this.options_;
            return c8677m0 == null ? C8677m0.getDefaultInstance() : c8677m0;
        }

        @Override // p000.l74.InterfaceC8675l0
        public boolean hasName() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // p000.l74.InterfaceC8675l0
        public boolean hasOptions() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // p000.u27
        /* JADX INFO: renamed from: q */
        public final Object mo79q(u27.EnumC13331i method, Object arg0, Object arg1) {
            C8652a c8652a = null;
            switch (C8652a.f56391a[method.ordinal()]) {
                case 1:
                    return new C8673k0();
                case 2:
                    return new a(c8652a);
                case 3:
                    return u27.m23013P(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဈ\u0000\u0002ᐉ\u0001", new Object[]{"bitField0_", "name_", "options_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    vhc<C8673k0> c13325c = PARSER;
                    if (c13325c == null) {
                        synchronized (C8673k0.class) {
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
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    this.memoizedIsInitialized = (byte) (arg0 == null ? 0 : 1);
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public static a newBuilder(C8673k0 prototype) {
            return DEFAULT_INSTANCE.m23054n(prototype);
        }

        public static C8673k0 parseDelimitedFrom(InputStream input, yi5 extensionRegistry) throws IOException {
            return (C8673k0) u27.m23015S(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static C8673k0 parseFrom(ByteBuffer data, yi5 extensionRegistry) throws be8 {
            return (C8673k0) u27.m23023a0(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static C8673k0 parseFrom(wj1 data) throws be8 {
            return (C8673k0) u27.m23016T(DEFAULT_INSTANCE, data);
        }

        public static C8673k0 parseFrom(wj1 data, yi5 extensionRegistry) throws be8 {
            return (C8673k0) u27.m23017U(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static C8673k0 parseFrom(byte[] data) throws be8 {
            return (C8673k0) u27.m23024b0(DEFAULT_INSTANCE, data);
        }

        public static C8673k0 parseFrom(byte[] data, yi5 extensionRegistry) throws be8 {
            return (C8673k0) u27.m23025c0(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static C8673k0 parseFrom(InputStream input) throws IOException {
            return (C8673k0) u27.m23020X(DEFAULT_INSTANCE, input);
        }

        public static C8673k0 parseFrom(InputStream input, yi5 extensionRegistry) throws IOException {
            return (C8673k0) u27.m23021Y(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static C8673k0 parseFrom(e72 input) throws IOException {
            return (C8673k0) u27.m23018V(DEFAULT_INSTANCE, input);
        }

        public static C8673k0 parseFrom(e72 input, yi5 extensionRegistry) throws IOException {
            return (C8673k0) u27.m23019W(DEFAULT_INSTANCE, input, extensionRegistry);
        }
    }

    /* JADX INFO: renamed from: l74$l */
    public interface InterfaceC8674l extends u27.InterfaceC13328f<C8672k, C8672k.a> {
        boolean getDebugRedact();

        boolean getDeprecated();

        C8692u.f getFeatureSupport();

        C8680o getFeatures();

        C8693u0 getUninterpretedOption(int index);

        int getUninterpretedOptionCount();

        List<C8693u0> getUninterpretedOptionList();

        boolean hasDebugRedact();

        boolean hasDeprecated();

        boolean hasFeatureSupport();

        boolean hasFeatures();
    }

    /* JADX INFO: renamed from: l74$l0 */
    public interface InterfaceC8675l0 extends ssa {
        String getName();

        wj1 getNameBytes();

        C8677m0 getOptions();

        boolean hasName();

        boolean hasOptions();
    }

    /* JADX INFO: renamed from: l74$m */
    public static final class C8676m extends u27.AbstractC13327e<C8676m, a> implements InterfaceC8678n {
        public static final int DECLARATION_FIELD_NUMBER = 2;
        private static final C8676m DEFAULT_INSTANCE;
        public static final int FEATURES_FIELD_NUMBER = 50;
        private static volatile vhc<C8676m> PARSER = null;
        public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
        public static final int VERIFICATION_FIELD_NUMBER = 3;
        private int bitField0_;
        private C8680o features_;
        private byte memoizedIsInitialized = 2;
        private v98.InterfaceC13956l<C8693u0> uninterpretedOption_ = u27.m23036w();
        private v98.InterfaceC13956l<b> declaration_ = u27.m23036w();
        private int verification_ = 1;

        /* JADX INFO: renamed from: l74$m$a */
        public static final class a extends u27.AbstractC13326d<C8676m, a> implements InterfaceC8678n {
            public /* synthetic */ a(C8652a c8652a) {
                this();
            }

            public a addAllDeclaration(Iterable<? extends b> values) {
                m23058e();
                ((C8676m) this.f86607b).addAllDeclaration(values);
                return this;
            }

            public a addAllUninterpretedOption(Iterable<? extends C8693u0> values) {
                m23058e();
                ((C8676m) this.f86607b).addAllUninterpretedOption(values);
                return this;
            }

            public a addDeclaration(b value) {
                m23058e();
                ((C8676m) this.f86607b).addDeclaration(value);
                return this;
            }

            public a addUninterpretedOption(C8693u0 value) {
                m23058e();
                ((C8676m) this.f86607b).addUninterpretedOption(value);
                return this;
            }

            public a clearDeclaration() {
                m23058e();
                ((C8676m) this.f86607b).clearDeclaration();
                return this;
            }

            public a clearFeatures() {
                m23058e();
                ((C8676m) this.f86607b).clearFeatures();
                return this;
            }

            public a clearUninterpretedOption() {
                m23058e();
                ((C8676m) this.f86607b).clearUninterpretedOption();
                return this;
            }

            public a clearVerification() {
                m23058e();
                ((C8676m) this.f86607b).clearVerification();
                return this;
            }

            @Override // p000.l74.InterfaceC8678n
            public b getDeclaration(int index) {
                return ((C8676m) this.f86607b).getDeclaration(index);
            }

            @Override // p000.l74.InterfaceC8678n
            public int getDeclarationCount() {
                return ((C8676m) this.f86607b).getDeclarationCount();
            }

            @Override // p000.l74.InterfaceC8678n
            public List<b> getDeclarationList() {
                return Collections.unmodifiableList(((C8676m) this.f86607b).getDeclarationList());
            }

            @Override // p000.l74.InterfaceC8678n
            public C8680o getFeatures() {
                return ((C8676m) this.f86607b).getFeatures();
            }

            @Override // p000.l74.InterfaceC8678n
            public C8693u0 getUninterpretedOption(int index) {
                return ((C8676m) this.f86607b).getUninterpretedOption(index);
            }

            @Override // p000.l74.InterfaceC8678n
            public int getUninterpretedOptionCount() {
                return ((C8676m) this.f86607b).getUninterpretedOptionCount();
            }

            @Override // p000.l74.InterfaceC8678n
            public List<C8693u0> getUninterpretedOptionList() {
                return Collections.unmodifiableList(((C8676m) this.f86607b).getUninterpretedOptionList());
            }

            @Override // p000.l74.InterfaceC8678n
            public d getVerification() {
                return ((C8676m) this.f86607b).getVerification();
            }

            @Override // p000.l74.InterfaceC8678n
            public boolean hasFeatures() {
                return ((C8676m) this.f86607b).hasFeatures();
            }

            @Override // p000.l74.InterfaceC8678n
            public boolean hasVerification() {
                return ((C8676m) this.f86607b).hasVerification();
            }

            public a mergeFeatures(C8680o value) {
                m23058e();
                ((C8676m) this.f86607b).mergeFeatures(value);
                return this;
            }

            public a removeDeclaration(int index) {
                m23058e();
                ((C8676m) this.f86607b).removeDeclaration(index);
                return this;
            }

            public a removeUninterpretedOption(int index) {
                m23058e();
                ((C8676m) this.f86607b).removeUninterpretedOption(index);
                return this;
            }

            public a setDeclaration(int index, b value) {
                m23058e();
                ((C8676m) this.f86607b).setDeclaration(index, value);
                return this;
            }

            public a setFeatures(C8680o value) {
                m23058e();
                ((C8676m) this.f86607b).setFeatures(value);
                return this;
            }

            public a setUninterpretedOption(int index, C8693u0 value) {
                m23058e();
                ((C8676m) this.f86607b).setUninterpretedOption(index, value);
                return this;
            }

            public a setVerification(d value) {
                m23058e();
                ((C8676m) this.f86607b).setVerification(value);
                return this;
            }

            private a() {
                super(C8676m.DEFAULT_INSTANCE);
            }

            public a addDeclaration(int index, b value) {
                m23058e();
                ((C8676m) this.f86607b).addDeclaration(index, value);
                return this;
            }

            public a addUninterpretedOption(int index, C8693u0 value) {
                m23058e();
                ((C8676m) this.f86607b).addUninterpretedOption(index, value);
                return this;
            }

            public a setDeclaration(int index, b.a builderForValue) {
                m23058e();
                ((C8676m) this.f86607b).setDeclaration(index, builderForValue.build());
                return this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public a setFeatures(C8680o.a builderForValue) {
                m23058e();
                ((C8676m) this.f86607b).setFeatures((C8680o) builderForValue.build());
                return this;
            }

            public a setUninterpretedOption(int index, C8693u0.a builderForValue) {
                m23058e();
                ((C8676m) this.f86607b).setUninterpretedOption(index, builderForValue.build());
                return this;
            }

            public a addDeclaration(b.a builderForValue) {
                m23058e();
                ((C8676m) this.f86607b).addDeclaration(builderForValue.build());
                return this;
            }

            public a addUninterpretedOption(C8693u0.a builderForValue) {
                m23058e();
                ((C8676m) this.f86607b).addUninterpretedOption(builderForValue.build());
                return this;
            }

            public a addDeclaration(int index, b.a builderForValue) {
                m23058e();
                ((C8676m) this.f86607b).addDeclaration(index, builderForValue.build());
                return this;
            }

            public a addUninterpretedOption(int index, C8693u0.a builderForValue) {
                m23058e();
                ((C8676m) this.f86607b).addUninterpretedOption(index, builderForValue.build());
                return this;
            }
        }

        /* JADX INFO: renamed from: l74$m$b */
        public static final class b extends u27<b, a> implements c {
            private static final b DEFAULT_INSTANCE;
            public static final int FULL_NAME_FIELD_NUMBER = 2;
            public static final int NUMBER_FIELD_NUMBER = 1;
            private static volatile vhc<b> PARSER = null;
            public static final int REPEATED_FIELD_NUMBER = 6;
            public static final int RESERVED_FIELD_NUMBER = 5;
            public static final int TYPE_FIELD_NUMBER = 3;
            private int bitField0_;
            private int number_;
            private boolean repeated_;
            private boolean reserved_;
            private String fullName_ = "";
            private String type_ = "";

            /* JADX INFO: renamed from: l74$m$b$a */
            public static final class a extends u27.AbstractC13324b<b, a> implements c {
                public /* synthetic */ a(C8652a c8652a) {
                    this();
                }

                public a clearFullName() {
                    m23058e();
                    ((b) this.f86607b).clearFullName();
                    return this;
                }

                public a clearNumber() {
                    m23058e();
                    ((b) this.f86607b).clearNumber();
                    return this;
                }

                public a clearRepeated() {
                    m23058e();
                    ((b) this.f86607b).clearRepeated();
                    return this;
                }

                public a clearReserved() {
                    m23058e();
                    ((b) this.f86607b).clearReserved();
                    return this;
                }

                public a clearType() {
                    m23058e();
                    ((b) this.f86607b).clearType();
                    return this;
                }

                @Override // p000.l74.C8676m.c
                public String getFullName() {
                    return ((b) this.f86607b).getFullName();
                }

                @Override // p000.l74.C8676m.c
                public wj1 getFullNameBytes() {
                    return ((b) this.f86607b).getFullNameBytes();
                }

                @Override // p000.l74.C8676m.c
                public int getNumber() {
                    return ((b) this.f86607b).getNumber();
                }

                @Override // p000.l74.C8676m.c
                public boolean getRepeated() {
                    return ((b) this.f86607b).getRepeated();
                }

                @Override // p000.l74.C8676m.c
                public boolean getReserved() {
                    return ((b) this.f86607b).getReserved();
                }

                @Override // p000.l74.C8676m.c
                public String getType() {
                    return ((b) this.f86607b).getType();
                }

                @Override // p000.l74.C8676m.c
                public wj1 getTypeBytes() {
                    return ((b) this.f86607b).getTypeBytes();
                }

                @Override // p000.l74.C8676m.c
                public boolean hasFullName() {
                    return ((b) this.f86607b).hasFullName();
                }

                @Override // p000.l74.C8676m.c
                public boolean hasNumber() {
                    return ((b) this.f86607b).hasNumber();
                }

                @Override // p000.l74.C8676m.c
                public boolean hasRepeated() {
                    return ((b) this.f86607b).hasRepeated();
                }

                @Override // p000.l74.C8676m.c
                public boolean hasReserved() {
                    return ((b) this.f86607b).hasReserved();
                }

                @Override // p000.l74.C8676m.c
                public boolean hasType() {
                    return ((b) this.f86607b).hasType();
                }

                public a setFullName(String value) {
                    m23058e();
                    ((b) this.f86607b).setFullName(value);
                    return this;
                }

                public a setFullNameBytes(wj1 value) {
                    m23058e();
                    ((b) this.f86607b).setFullNameBytes(value);
                    return this;
                }

                public a setNumber(int value) {
                    m23058e();
                    ((b) this.f86607b).setNumber(value);
                    return this;
                }

                public a setRepeated(boolean value) {
                    m23058e();
                    ((b) this.f86607b).setRepeated(value);
                    return this;
                }

                public a setReserved(boolean value) {
                    m23058e();
                    ((b) this.f86607b).setReserved(value);
                    return this;
                }

                public a setType(String value) {
                    m23058e();
                    ((b) this.f86607b).setType(value);
                    return this;
                }

                public a setTypeBytes(wj1 value) {
                    m23058e();
                    ((b) this.f86607b).setTypeBytes(value);
                    return this;
                }

                private a() {
                    super(b.DEFAULT_INSTANCE);
                }
            }

            static {
                b bVar = new b();
                DEFAULT_INSTANCE = bVar;
                u27.m23029g0(b.class, bVar);
            }

            private b() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearFullName() {
                this.bitField0_ &= -3;
                this.fullName_ = getDefaultInstance().getFullName();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearNumber() {
                this.bitField0_ &= -2;
                this.number_ = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearRepeated() {
                this.bitField0_ &= -17;
                this.repeated_ = false;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearReserved() {
                this.bitField0_ &= -9;
                this.reserved_ = false;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearType() {
                this.bitField0_ &= -5;
                this.type_ = getDefaultInstance().getType();
            }

            public static b getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static a newBuilder() {
                return DEFAULT_INSTANCE.m23053m();
            }

            public static b parseDelimitedFrom(InputStream input) throws IOException {
                return (b) u27.m23014R(DEFAULT_INSTANCE, input);
            }

            public static b parseFrom(ByteBuffer data) throws be8 {
                return (b) u27.m23022Z(DEFAULT_INSTANCE, data);
            }

            public static vhc<b> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setFullName(String value) {
                value.getClass();
                this.bitField0_ |= 2;
                this.fullName_ = value;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setFullNameBytes(wj1 value) {
                this.fullName_ = value.toStringUtf8();
                this.bitField0_ |= 2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setNumber(int value) {
                this.bitField0_ |= 1;
                this.number_ = value;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setRepeated(boolean value) {
                this.bitField0_ |= 16;
                this.repeated_ = value;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setReserved(boolean value) {
                this.bitField0_ |= 8;
                this.reserved_ = value;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setType(String value) {
                value.getClass();
                this.bitField0_ |= 4;
                this.type_ = value;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setTypeBytes(wj1 value) {
                this.type_ = value.toStringUtf8();
                this.bitField0_ |= 4;
            }

            @Override // p000.l74.C8676m.c
            public String getFullName() {
                return this.fullName_;
            }

            @Override // p000.l74.C8676m.c
            public wj1 getFullNameBytes() {
                return wj1.copyFromUtf8(this.fullName_);
            }

            @Override // p000.l74.C8676m.c
            public int getNumber() {
                return this.number_;
            }

            @Override // p000.l74.C8676m.c
            public boolean getRepeated() {
                return this.repeated_;
            }

            @Override // p000.l74.C8676m.c
            public boolean getReserved() {
                return this.reserved_;
            }

            @Override // p000.l74.C8676m.c
            public String getType() {
                return this.type_;
            }

            @Override // p000.l74.C8676m.c
            public wj1 getTypeBytes() {
                return wj1.copyFromUtf8(this.type_);
            }

            @Override // p000.l74.C8676m.c
            public boolean hasFullName() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // p000.l74.C8676m.c
            public boolean hasNumber() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // p000.l74.C8676m.c
            public boolean hasRepeated() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // p000.l74.C8676m.c
            public boolean hasReserved() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // p000.l74.C8676m.c
            public boolean hasType() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // p000.u27
            /* JADX INFO: renamed from: q */
            public final Object mo79q(u27.EnumC13331i method, Object arg0, Object arg1) {
                C8652a c8652a = null;
                switch (C8652a.f56391a[method.ordinal()]) {
                    case 1:
                        return new b();
                    case 2:
                        return new a(c8652a);
                    case 3:
                        return u27.m23013P(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0005ဇ\u0003\u0006ဇ\u0004", new Object[]{"bitField0_", "number_", "fullName_", "type_", "reserved_", "repeated_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        vhc<b> c13325c = PARSER;
                        if (c13325c == null) {
                            synchronized (b.class) {
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

            public static a newBuilder(b prototype) {
                return DEFAULT_INSTANCE.m23054n(prototype);
            }

            public static b parseDelimitedFrom(InputStream input, yi5 extensionRegistry) throws IOException {
                return (b) u27.m23015S(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static b parseFrom(ByteBuffer data, yi5 extensionRegistry) throws be8 {
                return (b) u27.m23023a0(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static b parseFrom(wj1 data) throws be8 {
                return (b) u27.m23016T(DEFAULT_INSTANCE, data);
            }

            public static b parseFrom(wj1 data, yi5 extensionRegistry) throws be8 {
                return (b) u27.m23017U(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static b parseFrom(byte[] data) throws be8 {
                return (b) u27.m23024b0(DEFAULT_INSTANCE, data);
            }

            public static b parseFrom(byte[] data, yi5 extensionRegistry) throws be8 {
                return (b) u27.m23025c0(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static b parseFrom(InputStream input) throws IOException {
                return (b) u27.m23020X(DEFAULT_INSTANCE, input);
            }

            public static b parseFrom(InputStream input, yi5 extensionRegistry) throws IOException {
                return (b) u27.m23021Y(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static b parseFrom(e72 input) throws IOException {
                return (b) u27.m23018V(DEFAULT_INSTANCE, input);
            }

            public static b parseFrom(e72 input, yi5 extensionRegistry) throws IOException {
                return (b) u27.m23019W(DEFAULT_INSTANCE, input, extensionRegistry);
            }
        }

        /* JADX INFO: renamed from: l74$m$c */
        public interface c extends ssa {
            String getFullName();

            wj1 getFullNameBytes();

            int getNumber();

            boolean getRepeated();

            boolean getReserved();

            String getType();

            wj1 getTypeBytes();

            boolean hasFullName();

            boolean hasNumber();

            boolean hasRepeated();

            boolean hasReserved();

            boolean hasType();
        }

        /* JADX INFO: renamed from: l74$m$d */
        public enum d implements v98.InterfaceC13947c {
            DECLARATION(0),
            UNVERIFIED(1);


            /* JADX INFO: renamed from: d */
            public static final int f56452d = 0;

            /* JADX INFO: renamed from: e */
            public static final int f56453e = 1;

            /* JADX INFO: renamed from: f */
            public static final v98.InterfaceC13948d<d> f56454f = new a();

            /* JADX INFO: renamed from: a */
            public final int f56456a;

            /* JADX INFO: renamed from: l74$m$d$a */
            public class a implements v98.InterfaceC13948d<d> {
                @Override // p000.v98.InterfaceC13948d
                public d findValueByNumber(int number) {
                    return d.forNumber(number);
                }
            }

            /* JADX INFO: renamed from: l74$m$d$b */
            public static final class b implements v98.InterfaceC13949e {

                /* JADX INFO: renamed from: a */
                public static final v98.InterfaceC13949e f56457a = new b();

                private b() {
                }

                @Override // p000.v98.InterfaceC13949e
                public boolean isInRange(int number) {
                    return d.forNumber(number) != null;
                }
            }

            d(int value) {
                this.f56456a = value;
            }

            public static d forNumber(int value) {
                if (value == 0) {
                    return DECLARATION;
                }
                if (value != 1) {
                    return null;
                }
                return UNVERIFIED;
            }

            public static v98.InterfaceC13948d<d> internalGetValueMap() {
                return f56454f;
            }

            public static v98.InterfaceC13949e internalGetVerifier() {
                return b.f56457a;
            }

            @Override // p000.v98.InterfaceC13947c
            public final int getNumber() {
                return this.f56456a;
            }

            @Deprecated
            public static d valueOf(int value) {
                return forNumber(value);
            }
        }

        static {
            C8676m c8676m = new C8676m();
            DEFAULT_INSTANCE = c8676m;
            u27.m23029g0(C8676m.class, c8676m);
        }

        private C8676m() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllDeclaration(Iterable<? extends b> values) {
            ensureDeclarationIsMutable();
            AbstractC0027a3.m80a(values, this.declaration_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllUninterpretedOption(Iterable<? extends C8693u0> values) {
            ensureUninterpretedOptionIsMutable();
            AbstractC0027a3.m80a(values, this.uninterpretedOption_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addDeclaration(b value) {
            value.getClass();
            ensureDeclarationIsMutable();
            this.declaration_.add(value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addUninterpretedOption(C8693u0 value) {
            value.getClass();
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.add(value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDeclaration() {
            this.declaration_ = u27.m23036w();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFeatures() {
            this.features_ = null;
            this.bitField0_ &= -2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUninterpretedOption() {
            this.uninterpretedOption_ = u27.m23036w();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVerification() {
            this.bitField0_ &= -3;
            this.verification_ = 1;
        }

        private void ensureDeclarationIsMutable() {
            v98.InterfaceC13956l<b> interfaceC13956l = this.declaration_;
            if (interfaceC13956l.isModifiable()) {
                return;
            }
            this.declaration_ = u27.m23012O(interfaceC13956l);
        }

        private void ensureUninterpretedOptionIsMutable() {
            v98.InterfaceC13956l<C8693u0> interfaceC13956l = this.uninterpretedOption_;
            if (interfaceC13956l.isModifiable()) {
                return;
            }
            this.uninterpretedOption_ = u27.m23012O(interfaceC13956l);
        }

        public static C8676m getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public void mergeFeatures(C8680o value) {
            value.getClass();
            C8680o c8680o = this.features_;
            if (c8680o == null || c8680o == C8680o.getDefaultInstance()) {
                this.features_ = value;
            } else {
                this.features_ = ((C8680o.a) C8680o.newBuilder(this.features_).mergeFrom(value)).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static a newBuilder() {
            return (a) DEFAULT_INSTANCE.m23053m();
        }

        public static C8676m parseDelimitedFrom(InputStream input) throws IOException {
            return (C8676m) u27.m23014R(DEFAULT_INSTANCE, input);
        }

        public static C8676m parseFrom(ByteBuffer data) throws be8 {
            return (C8676m) u27.m23022Z(DEFAULT_INSTANCE, data);
        }

        public static vhc<C8676m> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeDeclaration(int index) {
            ensureDeclarationIsMutable();
            this.declaration_.remove(index);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeUninterpretedOption(int index) {
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.remove(index);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDeclaration(int index, b value) {
            value.getClass();
            ensureDeclarationIsMutable();
            this.declaration_.set(index, value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFeatures(C8680o value) {
            value.getClass();
            this.features_ = value;
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUninterpretedOption(int index, C8693u0 value) {
            value.getClass();
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.set(index, value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVerification(d value) {
            this.verification_ = value.getNumber();
            this.bitField0_ |= 2;
        }

        @Override // p000.l74.InterfaceC8678n
        public b getDeclaration(int index) {
            return this.declaration_.get(index);
        }

        @Override // p000.l74.InterfaceC8678n
        public int getDeclarationCount() {
            return this.declaration_.size();
        }

        @Override // p000.l74.InterfaceC8678n
        public List<b> getDeclarationList() {
            return this.declaration_;
        }

        public c getDeclarationOrBuilder(int index) {
            return this.declaration_.get(index);
        }

        public List<? extends c> getDeclarationOrBuilderList() {
            return this.declaration_;
        }

        @Override // p000.l74.InterfaceC8678n
        public C8680o getFeatures() {
            C8680o c8680o = this.features_;
            return c8680o == null ? C8680o.getDefaultInstance() : c8680o;
        }

        @Override // p000.l74.InterfaceC8678n
        public C8693u0 getUninterpretedOption(int index) {
            return this.uninterpretedOption_.get(index);
        }

        @Override // p000.l74.InterfaceC8678n
        public int getUninterpretedOptionCount() {
            return this.uninterpretedOption_.size();
        }

        @Override // p000.l74.InterfaceC8678n
        public List<C8693u0> getUninterpretedOptionList() {
            return this.uninterpretedOption_;
        }

        public InterfaceC8695v0 getUninterpretedOptionOrBuilder(int index) {
            return this.uninterpretedOption_.get(index);
        }

        public List<? extends InterfaceC8695v0> getUninterpretedOptionOrBuilderList() {
            return this.uninterpretedOption_;
        }

        @Override // p000.l74.InterfaceC8678n
        public d getVerification() {
            d dVarForNumber = d.forNumber(this.verification_);
            return dVarForNumber == null ? d.UNVERIFIED : dVarForNumber;
        }

        @Override // p000.l74.InterfaceC8678n
        public boolean hasFeatures() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // p000.l74.InterfaceC8678n
        public boolean hasVerification() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // p000.u27
        /* JADX INFO: renamed from: q */
        public final Object mo79q(u27.EnumC13331i method, Object arg0, Object arg1) {
            C8652a c8652a = null;
            switch (C8652a.f56391a[method.ordinal()]) {
                case 1:
                    return new C8676m();
                case 2:
                    return new a(c8652a);
                case 3:
                    return u27.m23013P(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0002ϧ\u0004\u0000\u0002\u0002\u0002\u001b\u0003᠌\u00012ᐉ\u0000ϧЛ", new Object[]{"bitField0_", "declaration_", b.class, "verification_", d.internalGetVerifier(), "features_", "uninterpretedOption_", C8693u0.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    vhc<C8676m> c13325c = PARSER;
                    if (c13325c == null) {
                        synchronized (C8676m.class) {
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
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    this.memoizedIsInitialized = (byte) (arg0 == null ? 0 : 1);
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static a newBuilder(C8676m prototype) {
            return (a) DEFAULT_INSTANCE.m23054n(prototype);
        }

        public static C8676m parseDelimitedFrom(InputStream input, yi5 extensionRegistry) throws IOException {
            return (C8676m) u27.m23015S(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static C8676m parseFrom(ByteBuffer data, yi5 extensionRegistry) throws be8 {
            return (C8676m) u27.m23023a0(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static C8676m parseFrom(wj1 data) throws be8 {
            return (C8676m) u27.m23016T(DEFAULT_INSTANCE, data);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addDeclaration(int index, b value) {
            value.getClass();
            ensureDeclarationIsMutable();
            this.declaration_.add(index, value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addUninterpretedOption(int index, C8693u0 value) {
            value.getClass();
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.add(index, value);
        }

        public static C8676m parseFrom(wj1 data, yi5 extensionRegistry) throws be8 {
            return (C8676m) u27.m23017U(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static C8676m parseFrom(byte[] data) throws be8 {
            return (C8676m) u27.m23024b0(DEFAULT_INSTANCE, data);
        }

        public static C8676m parseFrom(byte[] data, yi5 extensionRegistry) throws be8 {
            return (C8676m) u27.m23025c0(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static C8676m parseFrom(InputStream input) throws IOException {
            return (C8676m) u27.m23020X(DEFAULT_INSTANCE, input);
        }

        public static C8676m parseFrom(InputStream input, yi5 extensionRegistry) throws IOException {
            return (C8676m) u27.m23021Y(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static C8676m parseFrom(e72 input) throws IOException {
            return (C8676m) u27.m23018V(DEFAULT_INSTANCE, input);
        }

        public static C8676m parseFrom(e72 input, yi5 extensionRegistry) throws IOException {
            return (C8676m) u27.m23019W(DEFAULT_INSTANCE, input, extensionRegistry);
        }
    }

    /* JADX INFO: renamed from: l74$m0 */
    public static final class C8677m0 extends u27.AbstractC13327e<C8677m0, a> implements InterfaceC8679n0 {
        private static final C8677m0 DEFAULT_INSTANCE;
        public static final int FEATURES_FIELD_NUMBER = 1;
        private static volatile vhc<C8677m0> PARSER = null;
        public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
        private int bitField0_;
        private C8680o features_;
        private byte memoizedIsInitialized = 2;
        private v98.InterfaceC13956l<C8693u0> uninterpretedOption_ = u27.m23036w();

        /* JADX INFO: renamed from: l74$m0$a */
        public static final class a extends u27.AbstractC13326d<C8677m0, a> implements InterfaceC8679n0 {
            public /* synthetic */ a(C8652a c8652a) {
                this();
            }

            public a addAllUninterpretedOption(Iterable<? extends C8693u0> values) {
                m23058e();
                ((C8677m0) this.f86607b).addAllUninterpretedOption(values);
                return this;
            }

            public a addUninterpretedOption(C8693u0 value) {
                m23058e();
                ((C8677m0) this.f86607b).addUninterpretedOption(value);
                return this;
            }

            public a clearFeatures() {
                m23058e();
                ((C8677m0) this.f86607b).clearFeatures();
                return this;
            }

            public a clearUninterpretedOption() {
                m23058e();
                ((C8677m0) this.f86607b).clearUninterpretedOption();
                return this;
            }

            @Override // p000.l74.InterfaceC8679n0
            public C8680o getFeatures() {
                return ((C8677m0) this.f86607b).getFeatures();
            }

            @Override // p000.l74.InterfaceC8679n0
            public C8693u0 getUninterpretedOption(int index) {
                return ((C8677m0) this.f86607b).getUninterpretedOption(index);
            }

            @Override // p000.l74.InterfaceC8679n0
            public int getUninterpretedOptionCount() {
                return ((C8677m0) this.f86607b).getUninterpretedOptionCount();
            }

            @Override // p000.l74.InterfaceC8679n0
            public List<C8693u0> getUninterpretedOptionList() {
                return Collections.unmodifiableList(((C8677m0) this.f86607b).getUninterpretedOptionList());
            }

            @Override // p000.l74.InterfaceC8679n0
            public boolean hasFeatures() {
                return ((C8677m0) this.f86607b).hasFeatures();
            }

            public a mergeFeatures(C8680o value) {
                m23058e();
                ((C8677m0) this.f86607b).mergeFeatures(value);
                return this;
            }

            public a removeUninterpretedOption(int index) {
                m23058e();
                ((C8677m0) this.f86607b).removeUninterpretedOption(index);
                return this;
            }

            public a setFeatures(C8680o value) {
                m23058e();
                ((C8677m0) this.f86607b).setFeatures(value);
                return this;
            }

            public a setUninterpretedOption(int index, C8693u0 value) {
                m23058e();
                ((C8677m0) this.f86607b).setUninterpretedOption(index, value);
                return this;
            }

            private a() {
                super(C8677m0.DEFAULT_INSTANCE);
            }

            public a addUninterpretedOption(int index, C8693u0 value) {
                m23058e();
                ((C8677m0) this.f86607b).addUninterpretedOption(index, value);
                return this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public a setFeatures(C8680o.a builderForValue) {
                m23058e();
                ((C8677m0) this.f86607b).setFeatures((C8680o) builderForValue.build());
                return this;
            }

            public a setUninterpretedOption(int index, C8693u0.a builderForValue) {
                m23058e();
                ((C8677m0) this.f86607b).setUninterpretedOption(index, builderForValue.build());
                return this;
            }

            public a addUninterpretedOption(C8693u0.a builderForValue) {
                m23058e();
                ((C8677m0) this.f86607b).addUninterpretedOption(builderForValue.build());
                return this;
            }

            public a addUninterpretedOption(int index, C8693u0.a builderForValue) {
                m23058e();
                ((C8677m0) this.f86607b).addUninterpretedOption(index, builderForValue.build());
                return this;
            }
        }

        static {
            C8677m0 c8677m0 = new C8677m0();
            DEFAULT_INSTANCE = c8677m0;
            u27.m23029g0(C8677m0.class, c8677m0);
        }

        private C8677m0() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllUninterpretedOption(Iterable<? extends C8693u0> values) {
            ensureUninterpretedOptionIsMutable();
            AbstractC0027a3.m80a(values, this.uninterpretedOption_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addUninterpretedOption(C8693u0 value) {
            value.getClass();
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.add(value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFeatures() {
            this.features_ = null;
            this.bitField0_ &= -2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUninterpretedOption() {
            this.uninterpretedOption_ = u27.m23036w();
        }

        private void ensureUninterpretedOptionIsMutable() {
            v98.InterfaceC13956l<C8693u0> interfaceC13956l = this.uninterpretedOption_;
            if (interfaceC13956l.isModifiable()) {
                return;
            }
            this.uninterpretedOption_ = u27.m23012O(interfaceC13956l);
        }

        public static C8677m0 getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public void mergeFeatures(C8680o value) {
            value.getClass();
            C8680o c8680o = this.features_;
            if (c8680o == null || c8680o == C8680o.getDefaultInstance()) {
                this.features_ = value;
            } else {
                this.features_ = ((C8680o.a) C8680o.newBuilder(this.features_).mergeFrom(value)).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static a newBuilder() {
            return (a) DEFAULT_INSTANCE.m23053m();
        }

        public static C8677m0 parseDelimitedFrom(InputStream input) throws IOException {
            return (C8677m0) u27.m23014R(DEFAULT_INSTANCE, input);
        }

        public static C8677m0 parseFrom(ByteBuffer data) throws be8 {
            return (C8677m0) u27.m23022Z(DEFAULT_INSTANCE, data);
        }

        public static vhc<C8677m0> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeUninterpretedOption(int index) {
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.remove(index);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFeatures(C8680o value) {
            value.getClass();
            this.features_ = value;
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUninterpretedOption(int index, C8693u0 value) {
            value.getClass();
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.set(index, value);
        }

        @Override // p000.l74.InterfaceC8679n0
        public C8680o getFeatures() {
            C8680o c8680o = this.features_;
            return c8680o == null ? C8680o.getDefaultInstance() : c8680o;
        }

        @Override // p000.l74.InterfaceC8679n0
        public C8693u0 getUninterpretedOption(int index) {
            return this.uninterpretedOption_.get(index);
        }

        @Override // p000.l74.InterfaceC8679n0
        public int getUninterpretedOptionCount() {
            return this.uninterpretedOption_.size();
        }

        @Override // p000.l74.InterfaceC8679n0
        public List<C8693u0> getUninterpretedOptionList() {
            return this.uninterpretedOption_;
        }

        public InterfaceC8695v0 getUninterpretedOptionOrBuilder(int index) {
            return this.uninterpretedOption_.get(index);
        }

        public List<? extends InterfaceC8695v0> getUninterpretedOptionOrBuilderList() {
            return this.uninterpretedOption_;
        }

        @Override // p000.l74.InterfaceC8679n0
        public boolean hasFeatures() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // p000.u27
        /* JADX INFO: renamed from: q */
        public final Object mo79q(u27.EnumC13331i method, Object arg0, Object arg1) {
            C8652a c8652a = null;
            switch (C8652a.f56391a[method.ordinal()]) {
                case 1:
                    return new C8677m0();
                case 2:
                    return new a(c8652a);
                case 3:
                    return u27.m23013P(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001ϧ\u0002\u0000\u0001\u0002\u0001ᐉ\u0000ϧЛ", new Object[]{"bitField0_", "features_", "uninterpretedOption_", C8693u0.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    vhc<C8677m0> c13325c = PARSER;
                    if (c13325c == null) {
                        synchronized (C8677m0.class) {
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
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    this.memoizedIsInitialized = (byte) (arg0 == null ? 0 : 1);
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static a newBuilder(C8677m0 prototype) {
            return (a) DEFAULT_INSTANCE.m23054n(prototype);
        }

        public static C8677m0 parseDelimitedFrom(InputStream input, yi5 extensionRegistry) throws IOException {
            return (C8677m0) u27.m23015S(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static C8677m0 parseFrom(ByteBuffer data, yi5 extensionRegistry) throws be8 {
            return (C8677m0) u27.m23023a0(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static C8677m0 parseFrom(wj1 data) throws be8 {
            return (C8677m0) u27.m23016T(DEFAULT_INSTANCE, data);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addUninterpretedOption(int index, C8693u0 value) {
            value.getClass();
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.add(index, value);
        }

        public static C8677m0 parseFrom(wj1 data, yi5 extensionRegistry) throws be8 {
            return (C8677m0) u27.m23017U(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static C8677m0 parseFrom(byte[] data) throws be8 {
            return (C8677m0) u27.m23024b0(DEFAULT_INSTANCE, data);
        }

        public static C8677m0 parseFrom(byte[] data, yi5 extensionRegistry) throws be8 {
            return (C8677m0) u27.m23025c0(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static C8677m0 parseFrom(InputStream input) throws IOException {
            return (C8677m0) u27.m23020X(DEFAULT_INSTANCE, input);
        }

        public static C8677m0 parseFrom(InputStream input, yi5 extensionRegistry) throws IOException {
            return (C8677m0) u27.m23021Y(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static C8677m0 parseFrom(e72 input) throws IOException {
            return (C8677m0) u27.m23018V(DEFAULT_INSTANCE, input);
        }

        public static C8677m0 parseFrom(e72 input, yi5 extensionRegistry) throws IOException {
            return (C8677m0) u27.m23019W(DEFAULT_INSTANCE, input, extensionRegistry);
        }
    }

    /* JADX INFO: renamed from: l74$n */
    public interface InterfaceC8678n extends u27.InterfaceC13328f<C8676m, C8676m.a> {
        C8676m.b getDeclaration(int index);

        int getDeclarationCount();

        List<C8676m.b> getDeclarationList();

        C8680o getFeatures();

        C8693u0 getUninterpretedOption(int index);

        int getUninterpretedOptionCount();

        List<C8693u0> getUninterpretedOptionList();

        C8676m.d getVerification();

        boolean hasFeatures();

        boolean hasVerification();
    }

    /* JADX INFO: renamed from: l74$n0 */
    public interface InterfaceC8679n0 extends u27.InterfaceC13328f<C8677m0, C8677m0.a> {
        C8680o getFeatures();

        C8693u0 getUninterpretedOption(int index);

        int getUninterpretedOptionCount();

        List<C8693u0> getUninterpretedOptionList();

        boolean hasFeatures();
    }

    /* JADX INFO: renamed from: l74$o */
    public static final class C8680o extends u27.AbstractC13327e<C8680o, a> implements InterfaceC8686r {
        private static final C8680o DEFAULT_INSTANCE;
        public static final int ENUM_TYPE_FIELD_NUMBER = 2;
        public static final int FIELD_PRESENCE_FIELD_NUMBER = 1;
        public static final int JSON_FORMAT_FIELD_NUMBER = 6;
        public static final int MESSAGE_ENCODING_FIELD_NUMBER = 5;
        private static volatile vhc<C8680o> PARSER = null;
        public static final int REPEATED_FIELD_ENCODING_FIELD_NUMBER = 3;
        public static final int UTF8_VALIDATION_FIELD_NUMBER = 4;
        private int bitField0_;
        private int enumType_;
        private int fieldPresence_;
        private int jsonFormat_;
        private byte memoizedIsInitialized = 2;
        private int messageEncoding_;
        private int repeatedFieldEncoding_;
        private int utf8Validation_;

        /* JADX INFO: renamed from: l74$o$a */
        public static final class a extends u27.AbstractC13326d<C8680o, a> implements InterfaceC8686r {
            public /* synthetic */ a(C8652a c8652a) {
                this();
            }

            public a clearEnumType() {
                m23058e();
                ((C8680o) this.f86607b).clearEnumType();
                return this;
            }

            public a clearFieldPresence() {
                m23058e();
                ((C8680o) this.f86607b).clearFieldPresence();
                return this;
            }

            public a clearJsonFormat() {
                m23058e();
                ((C8680o) this.f86607b).clearJsonFormat();
                return this;
            }

            public a clearMessageEncoding() {
                m23058e();
                ((C8680o) this.f86607b).clearMessageEncoding();
                return this;
            }

            public a clearRepeatedFieldEncoding() {
                m23058e();
                ((C8680o) this.f86607b).clearRepeatedFieldEncoding();
                return this;
            }

            public a clearUtf8Validation() {
                m23058e();
                ((C8680o) this.f86607b).clearUtf8Validation();
                return this;
            }

            @Override // p000.l74.InterfaceC8686r
            public b getEnumType() {
                return ((C8680o) this.f86607b).getEnumType();
            }

            @Override // p000.l74.InterfaceC8686r
            public c getFieldPresence() {
                return ((C8680o) this.f86607b).getFieldPresence();
            }

            @Override // p000.l74.InterfaceC8686r
            public d getJsonFormat() {
                return ((C8680o) this.f86607b).getJsonFormat();
            }

            @Override // p000.l74.InterfaceC8686r
            public e getMessageEncoding() {
                return ((C8680o) this.f86607b).getMessageEncoding();
            }

            @Override // p000.l74.InterfaceC8686r
            public f getRepeatedFieldEncoding() {
                return ((C8680o) this.f86607b).getRepeatedFieldEncoding();
            }

            @Override // p000.l74.InterfaceC8686r
            public g getUtf8Validation() {
                return ((C8680o) this.f86607b).getUtf8Validation();
            }

            @Override // p000.l74.InterfaceC8686r
            public boolean hasEnumType() {
                return ((C8680o) this.f86607b).hasEnumType();
            }

            @Override // p000.l74.InterfaceC8686r
            public boolean hasFieldPresence() {
                return ((C8680o) this.f86607b).hasFieldPresence();
            }

            @Override // p000.l74.InterfaceC8686r
            public boolean hasJsonFormat() {
                return ((C8680o) this.f86607b).hasJsonFormat();
            }

            @Override // p000.l74.InterfaceC8686r
            public boolean hasMessageEncoding() {
                return ((C8680o) this.f86607b).hasMessageEncoding();
            }

            @Override // p000.l74.InterfaceC8686r
            public boolean hasRepeatedFieldEncoding() {
                return ((C8680o) this.f86607b).hasRepeatedFieldEncoding();
            }

            @Override // p000.l74.InterfaceC8686r
            public boolean hasUtf8Validation() {
                return ((C8680o) this.f86607b).hasUtf8Validation();
            }

            public a setEnumType(b value) {
                m23058e();
                ((C8680o) this.f86607b).setEnumType(value);
                return this;
            }

            public a setFieldPresence(c value) {
                m23058e();
                ((C8680o) this.f86607b).setFieldPresence(value);
                return this;
            }

            public a setJsonFormat(d value) {
                m23058e();
                ((C8680o) this.f86607b).setJsonFormat(value);
                return this;
            }

            public a setMessageEncoding(e value) {
                m23058e();
                ((C8680o) this.f86607b).setMessageEncoding(value);
                return this;
            }

            public a setRepeatedFieldEncoding(f value) {
                m23058e();
                ((C8680o) this.f86607b).setRepeatedFieldEncoding(value);
                return this;
            }

            public a setUtf8Validation(g value) {
                m23058e();
                ((C8680o) this.f86607b).setUtf8Validation(value);
                return this;
            }

            private a() {
                super(C8680o.DEFAULT_INSTANCE);
            }
        }

        /* JADX INFO: renamed from: l74$o$b */
        public enum b implements v98.InterfaceC13947c {
            ENUM_TYPE_UNKNOWN(0),
            OPEN(1),
            CLOSED(2);


            /* JADX INFO: renamed from: C */
            public static final v98.InterfaceC13948d<b> f56458C = new a();

            /* JADX INFO: renamed from: e */
            public static final int f56463e = 0;

            /* JADX INFO: renamed from: f */
            public static final int f56464f = 1;

            /* JADX INFO: renamed from: m */
            public static final int f56465m = 2;

            /* JADX INFO: renamed from: a */
            public final int f56466a;

            /* JADX INFO: renamed from: l74$o$b$a */
            public class a implements v98.InterfaceC13948d<b> {
                @Override // p000.v98.InterfaceC13948d
                public b findValueByNumber(int number) {
                    return b.forNumber(number);
                }
            }

            /* JADX INFO: renamed from: l74$o$b$b, reason: collision with other inner class name */
            public static final class C16469b implements v98.InterfaceC13949e {

                /* JADX INFO: renamed from: a */
                public static final v98.InterfaceC13949e f56467a = new C16469b();

                private C16469b() {
                }

                @Override // p000.v98.InterfaceC13949e
                public boolean isInRange(int number) {
                    return b.forNumber(number) != null;
                }
            }

            b(int value) {
                this.f56466a = value;
            }

            public static b forNumber(int value) {
                if (value == 0) {
                    return ENUM_TYPE_UNKNOWN;
                }
                if (value == 1) {
                    return OPEN;
                }
                if (value != 2) {
                    return null;
                }
                return CLOSED;
            }

            public static v98.InterfaceC13948d<b> internalGetValueMap() {
                return f56458C;
            }

            public static v98.InterfaceC13949e internalGetVerifier() {
                return C16469b.f56467a;
            }

            @Override // p000.v98.InterfaceC13947c
            public final int getNumber() {
                return this.f56466a;
            }

            @Deprecated
            public static b valueOf(int value) {
                return forNumber(value);
            }
        }

        /* JADX INFO: renamed from: l74$o$c */
        public enum c implements v98.InterfaceC13947c {
            FIELD_PRESENCE_UNKNOWN(0),
            EXPLICIT(1),
            IMPLICIT(2),
            LEGACY_REQUIRED(3);


            /* JADX INFO: renamed from: C */
            public static final int f56468C = 2;

            /* JADX INFO: renamed from: F */
            public static final int f56469F = 3;

            /* JADX INFO: renamed from: H */
            public static final v98.InterfaceC13948d<c> f56470H = new a();

            /* JADX INFO: renamed from: f */
            public static final int f56476f = 0;

            /* JADX INFO: renamed from: m */
            public static final int f56477m = 1;

            /* JADX INFO: renamed from: a */
            public final int f56478a;

            /* JADX INFO: renamed from: l74$o$c$a */
            public class a implements v98.InterfaceC13948d<c> {
                @Override // p000.v98.InterfaceC13948d
                public c findValueByNumber(int number) {
                    return c.forNumber(number);
                }
            }

            /* JADX INFO: renamed from: l74$o$c$b */
            public static final class b implements v98.InterfaceC13949e {

                /* JADX INFO: renamed from: a */
                public static final v98.InterfaceC13949e f56479a = new b();

                private b() {
                }

                @Override // p000.v98.InterfaceC13949e
                public boolean isInRange(int number) {
                    return c.forNumber(number) != null;
                }
            }

            c(int value) {
                this.f56478a = value;
            }

            public static c forNumber(int value) {
                if (value == 0) {
                    return FIELD_PRESENCE_UNKNOWN;
                }
                if (value == 1) {
                    return EXPLICIT;
                }
                if (value == 2) {
                    return IMPLICIT;
                }
                if (value != 3) {
                    return null;
                }
                return LEGACY_REQUIRED;
            }

            public static v98.InterfaceC13948d<c> internalGetValueMap() {
                return f56470H;
            }

            public static v98.InterfaceC13949e internalGetVerifier() {
                return b.f56479a;
            }

            @Override // p000.v98.InterfaceC13947c
            public final int getNumber() {
                return this.f56478a;
            }

            @Deprecated
            public static c valueOf(int value) {
                return forNumber(value);
            }
        }

        /* JADX INFO: renamed from: l74$o$d */
        public enum d implements v98.InterfaceC13947c {
            JSON_FORMAT_UNKNOWN(0),
            ALLOW(1),
            LEGACY_BEST_EFFORT(2);


            /* JADX INFO: renamed from: C */
            public static final v98.InterfaceC13948d<d> f56480C = new a();

            /* JADX INFO: renamed from: e */
            public static final int f56485e = 0;

            /* JADX INFO: renamed from: f */
            public static final int f56486f = 1;

            /* JADX INFO: renamed from: m */
            public static final int f56487m = 2;

            /* JADX INFO: renamed from: a */
            public final int f56488a;

            /* JADX INFO: renamed from: l74$o$d$a */
            public class a implements v98.InterfaceC13948d<d> {
                @Override // p000.v98.InterfaceC13948d
                public d findValueByNumber(int number) {
                    return d.forNumber(number);
                }
            }

            /* JADX INFO: renamed from: l74$o$d$b */
            public static final class b implements v98.InterfaceC13949e {

                /* JADX INFO: renamed from: a */
                public static final v98.InterfaceC13949e f56489a = new b();

                private b() {
                }

                @Override // p000.v98.InterfaceC13949e
                public boolean isInRange(int number) {
                    return d.forNumber(number) != null;
                }
            }

            d(int value) {
                this.f56488a = value;
            }

            public static d forNumber(int value) {
                if (value == 0) {
                    return JSON_FORMAT_UNKNOWN;
                }
                if (value == 1) {
                    return ALLOW;
                }
                if (value != 2) {
                    return null;
                }
                return LEGACY_BEST_EFFORT;
            }

            public static v98.InterfaceC13948d<d> internalGetValueMap() {
                return f56480C;
            }

            public static v98.InterfaceC13949e internalGetVerifier() {
                return b.f56489a;
            }

            @Override // p000.v98.InterfaceC13947c
            public final int getNumber() {
                return this.f56488a;
            }

            @Deprecated
            public static d valueOf(int value) {
                return forNumber(value);
            }
        }

        /* JADX INFO: renamed from: l74$o$e */
        public enum e implements v98.InterfaceC13947c {
            MESSAGE_ENCODING_UNKNOWN(0),
            LENGTH_PREFIXED(1),
            DELIMITED(2);


            /* JADX INFO: renamed from: C */
            public static final v98.InterfaceC13948d<e> f56490C = new a();

            /* JADX INFO: renamed from: e */
            public static final int f56495e = 0;

            /* JADX INFO: renamed from: f */
            public static final int f56496f = 1;

            /* JADX INFO: renamed from: m */
            public static final int f56497m = 2;

            /* JADX INFO: renamed from: a */
            public final int f56498a;

            /* JADX INFO: renamed from: l74$o$e$a */
            public class a implements v98.InterfaceC13948d<e> {
                @Override // p000.v98.InterfaceC13948d
                public e findValueByNumber(int number) {
                    return e.forNumber(number);
                }
            }

            /* JADX INFO: renamed from: l74$o$e$b */
            public static final class b implements v98.InterfaceC13949e {

                /* JADX INFO: renamed from: a */
                public static final v98.InterfaceC13949e f56499a = new b();

                private b() {
                }

                @Override // p000.v98.InterfaceC13949e
                public boolean isInRange(int number) {
                    return e.forNumber(number) != null;
                }
            }

            e(int value) {
                this.f56498a = value;
            }

            public static e forNumber(int value) {
                if (value == 0) {
                    return MESSAGE_ENCODING_UNKNOWN;
                }
                if (value == 1) {
                    return LENGTH_PREFIXED;
                }
                if (value != 2) {
                    return null;
                }
                return DELIMITED;
            }

            public static v98.InterfaceC13948d<e> internalGetValueMap() {
                return f56490C;
            }

            public static v98.InterfaceC13949e internalGetVerifier() {
                return b.f56499a;
            }

            @Override // p000.v98.InterfaceC13947c
            public final int getNumber() {
                return this.f56498a;
            }

            @Deprecated
            public static e valueOf(int value) {
                return forNumber(value);
            }
        }

        /* JADX INFO: renamed from: l74$o$f */
        public enum f implements v98.InterfaceC13947c {
            REPEATED_FIELD_ENCODING_UNKNOWN(0),
            PACKED(1),
            EXPANDED(2);


            /* JADX INFO: renamed from: C */
            public static final v98.InterfaceC13948d<f> f56500C = new a();

            /* JADX INFO: renamed from: e */
            public static final int f56505e = 0;

            /* JADX INFO: renamed from: f */
            public static final int f56506f = 1;

            /* JADX INFO: renamed from: m */
            public static final int f56507m = 2;

            /* JADX INFO: renamed from: a */
            public final int f56508a;

            /* JADX INFO: renamed from: l74$o$f$a */
            public class a implements v98.InterfaceC13948d<f> {
                @Override // p000.v98.InterfaceC13948d
                public f findValueByNumber(int number) {
                    return f.forNumber(number);
                }
            }

            /* JADX INFO: renamed from: l74$o$f$b */
            public static final class b implements v98.InterfaceC13949e {

                /* JADX INFO: renamed from: a */
                public static final v98.InterfaceC13949e f56509a = new b();

                private b() {
                }

                @Override // p000.v98.InterfaceC13949e
                public boolean isInRange(int number) {
                    return f.forNumber(number) != null;
                }
            }

            f(int value) {
                this.f56508a = value;
            }

            public static f forNumber(int value) {
                if (value == 0) {
                    return REPEATED_FIELD_ENCODING_UNKNOWN;
                }
                if (value == 1) {
                    return PACKED;
                }
                if (value != 2) {
                    return null;
                }
                return EXPANDED;
            }

            public static v98.InterfaceC13948d<f> internalGetValueMap() {
                return f56500C;
            }

            public static v98.InterfaceC13949e internalGetVerifier() {
                return b.f56509a;
            }

            @Override // p000.v98.InterfaceC13947c
            public final int getNumber() {
                return this.f56508a;
            }

            @Deprecated
            public static f valueOf(int value) {
                return forNumber(value);
            }
        }

        /* JADX INFO: renamed from: l74$o$g */
        public enum g implements v98.InterfaceC13947c {
            UTF8_VALIDATION_UNKNOWN(0),
            VERIFY(2),
            NONE(3);


            /* JADX INFO: renamed from: C */
            public static final v98.InterfaceC13948d<g> f56510C = new a();

            /* JADX INFO: renamed from: e */
            public static final int f56515e = 0;

            /* JADX INFO: renamed from: f */
            public static final int f56516f = 2;

            /* JADX INFO: renamed from: m */
            public static final int f56517m = 3;

            /* JADX INFO: renamed from: a */
            public final int f56518a;

            /* JADX INFO: renamed from: l74$o$g$a */
            public class a implements v98.InterfaceC13948d<g> {
                @Override // p000.v98.InterfaceC13948d
                public g findValueByNumber(int number) {
                    return g.forNumber(number);
                }
            }

            /* JADX INFO: renamed from: l74$o$g$b */
            public static final class b implements v98.InterfaceC13949e {

                /* JADX INFO: renamed from: a */
                public static final v98.InterfaceC13949e f56519a = new b();

                private b() {
                }

                @Override // p000.v98.InterfaceC13949e
                public boolean isInRange(int number) {
                    return g.forNumber(number) != null;
                }
            }

            g(int value) {
                this.f56518a = value;
            }

            public static g forNumber(int value) {
                if (value == 0) {
                    return UTF8_VALIDATION_UNKNOWN;
                }
                if (value == 2) {
                    return VERIFY;
                }
                if (value != 3) {
                    return null;
                }
                return NONE;
            }

            public static v98.InterfaceC13948d<g> internalGetValueMap() {
                return f56510C;
            }

            public static v98.InterfaceC13949e internalGetVerifier() {
                return b.f56519a;
            }

            @Override // p000.v98.InterfaceC13947c
            public final int getNumber() {
                return this.f56518a;
            }

            @Deprecated
            public static g valueOf(int value) {
                return forNumber(value);
            }
        }

        static {
            C8680o c8680o = new C8680o();
            DEFAULT_INSTANCE = c8680o;
            u27.m23029g0(C8680o.class, c8680o);
        }

        private C8680o() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEnumType() {
            this.bitField0_ &= -3;
            this.enumType_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFieldPresence() {
            this.bitField0_ &= -2;
            this.fieldPresence_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearJsonFormat() {
            this.bitField0_ &= -33;
            this.jsonFormat_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMessageEncoding() {
            this.bitField0_ &= -17;
            this.messageEncoding_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRepeatedFieldEncoding() {
            this.bitField0_ &= -5;
            this.repeatedFieldEncoding_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUtf8Validation() {
            this.bitField0_ &= -9;
            this.utf8Validation_ = 0;
        }

        public static C8680o getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static a newBuilder() {
            return (a) DEFAULT_INSTANCE.m23053m();
        }

        public static C8680o parseDelimitedFrom(InputStream input) throws IOException {
            return (C8680o) u27.m23014R(DEFAULT_INSTANCE, input);
        }

        public static C8680o parseFrom(ByteBuffer data) throws be8 {
            return (C8680o) u27.m23022Z(DEFAULT_INSTANCE, data);
        }

        public static vhc<C8680o> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEnumType(b value) {
            this.enumType_ = value.getNumber();
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFieldPresence(c value) {
            this.fieldPresence_ = value.getNumber();
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setJsonFormat(d value) {
            this.jsonFormat_ = value.getNumber();
            this.bitField0_ |= 32;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMessageEncoding(e value) {
            this.messageEncoding_ = value.getNumber();
            this.bitField0_ |= 16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRepeatedFieldEncoding(f value) {
            this.repeatedFieldEncoding_ = value.getNumber();
            this.bitField0_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUtf8Validation(g value) {
            this.utf8Validation_ = value.getNumber();
            this.bitField0_ |= 8;
        }

        @Override // p000.l74.InterfaceC8686r
        public b getEnumType() {
            b bVarForNumber = b.forNumber(this.enumType_);
            return bVarForNumber == null ? b.ENUM_TYPE_UNKNOWN : bVarForNumber;
        }

        @Override // p000.l74.InterfaceC8686r
        public c getFieldPresence() {
            c cVarForNumber = c.forNumber(this.fieldPresence_);
            return cVarForNumber == null ? c.FIELD_PRESENCE_UNKNOWN : cVarForNumber;
        }

        @Override // p000.l74.InterfaceC8686r
        public d getJsonFormat() {
            d dVarForNumber = d.forNumber(this.jsonFormat_);
            return dVarForNumber == null ? d.JSON_FORMAT_UNKNOWN : dVarForNumber;
        }

        @Override // p000.l74.InterfaceC8686r
        public e getMessageEncoding() {
            e eVarForNumber = e.forNumber(this.messageEncoding_);
            return eVarForNumber == null ? e.MESSAGE_ENCODING_UNKNOWN : eVarForNumber;
        }

        @Override // p000.l74.InterfaceC8686r
        public f getRepeatedFieldEncoding() {
            f fVarForNumber = f.forNumber(this.repeatedFieldEncoding_);
            return fVarForNumber == null ? f.REPEATED_FIELD_ENCODING_UNKNOWN : fVarForNumber;
        }

        @Override // p000.l74.InterfaceC8686r
        public g getUtf8Validation() {
            g gVarForNumber = g.forNumber(this.utf8Validation_);
            return gVarForNumber == null ? g.UTF8_VALIDATION_UNKNOWN : gVarForNumber;
        }

        @Override // p000.l74.InterfaceC8686r
        public boolean hasEnumType() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // p000.l74.InterfaceC8686r
        public boolean hasFieldPresence() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // p000.l74.InterfaceC8686r
        public boolean hasJsonFormat() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // p000.l74.InterfaceC8686r
        public boolean hasMessageEncoding() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // p000.l74.InterfaceC8686r
        public boolean hasRepeatedFieldEncoding() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // p000.l74.InterfaceC8686r
        public boolean hasUtf8Validation() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // p000.u27
        /* JADX INFO: renamed from: q */
        public final Object mo79q(u27.EnumC13331i method, Object arg0, Object arg1) {
            C8652a c8652a = null;
            switch (C8652a.f56391a[method.ordinal()]) {
                case 1:
                    return new C8680o();
                case 2:
                    return new a(c8652a);
                case 3:
                    return u27.m23013P(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004᠌\u0003\u0005᠌\u0004\u0006᠌\u0005", new Object[]{"bitField0_", "fieldPresence_", c.internalGetVerifier(), "enumType_", b.internalGetVerifier(), "repeatedFieldEncoding_", f.internalGetVerifier(), "utf8Validation_", g.internalGetVerifier(), "messageEncoding_", e.internalGetVerifier(), "jsonFormat_", d.internalGetVerifier()});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    vhc<C8680o> c13325c = PARSER;
                    if (c13325c == null) {
                        synchronized (C8680o.class) {
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
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    this.memoizedIsInitialized = (byte) (arg0 == null ? 0 : 1);
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static a newBuilder(C8680o prototype) {
            return (a) DEFAULT_INSTANCE.m23054n(prototype);
        }

        public static C8680o parseDelimitedFrom(InputStream input, yi5 extensionRegistry) throws IOException {
            return (C8680o) u27.m23015S(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static C8680o parseFrom(ByteBuffer data, yi5 extensionRegistry) throws be8 {
            return (C8680o) u27.m23023a0(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static C8680o parseFrom(wj1 data) throws be8 {
            return (C8680o) u27.m23016T(DEFAULT_INSTANCE, data);
        }

        public static C8680o parseFrom(wj1 data, yi5 extensionRegistry) throws be8 {
            return (C8680o) u27.m23017U(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static C8680o parseFrom(byte[] data) throws be8 {
            return (C8680o) u27.m23024b0(DEFAULT_INSTANCE, data);
        }

        public static C8680o parseFrom(byte[] data, yi5 extensionRegistry) throws be8 {
            return (C8680o) u27.m23025c0(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static C8680o parseFrom(InputStream input) throws IOException {
            return (C8680o) u27.m23020X(DEFAULT_INSTANCE, input);
        }

        public static C8680o parseFrom(InputStream input, yi5 extensionRegistry) throws IOException {
            return (C8680o) u27.m23021Y(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static C8680o parseFrom(e72 input) throws IOException {
            return (C8680o) u27.m23018V(DEFAULT_INSTANCE, input);
        }

        public static C8680o parseFrom(e72 input, yi5 extensionRegistry) throws IOException {
            return (C8680o) u27.m23019W(DEFAULT_INSTANCE, input, extensionRegistry);
        }
    }

    /* JADX INFO: renamed from: l74$o0 */
    public static final class C8681o0 extends u27<C8681o0, a> implements InterfaceC8683p0 {
        private static final C8681o0 DEFAULT_INSTANCE;
        public static final int METHOD_FIELD_NUMBER = 2;
        public static final int NAME_FIELD_NUMBER = 1;
        public static final int OPTIONS_FIELD_NUMBER = 3;
        private static volatile vhc<C8681o0> PARSER;
        private int bitField0_;
        private C8685q0 options_;
        private byte memoizedIsInitialized = 2;
        private String name_ = "";
        private v98.InterfaceC13956l<C8665g0> method_ = u27.m23036w();

        /* JADX INFO: renamed from: l74$o0$a */
        public static final class a extends u27.AbstractC13324b<C8681o0, a> implements InterfaceC8683p0 {
            public /* synthetic */ a(C8652a c8652a) {
                this();
            }

            public a addAllMethod(Iterable<? extends C8665g0> values) {
                m23058e();
                ((C8681o0) this.f86607b).addAllMethod(values);
                return this;
            }

            public a addMethod(C8665g0 value) {
                m23058e();
                ((C8681o0) this.f86607b).addMethod(value);
                return this;
            }

            public a clearMethod() {
                m23058e();
                ((C8681o0) this.f86607b).clearMethod();
                return this;
            }

            public a clearName() {
                m23058e();
                ((C8681o0) this.f86607b).clearName();
                return this;
            }

            public a clearOptions() {
                m23058e();
                ((C8681o0) this.f86607b).clearOptions();
                return this;
            }

            @Override // p000.l74.InterfaceC8683p0
            public C8665g0 getMethod(int index) {
                return ((C8681o0) this.f86607b).getMethod(index);
            }

            @Override // p000.l74.InterfaceC8683p0
            public int getMethodCount() {
                return ((C8681o0) this.f86607b).getMethodCount();
            }

            @Override // p000.l74.InterfaceC8683p0
            public List<C8665g0> getMethodList() {
                return Collections.unmodifiableList(((C8681o0) this.f86607b).getMethodList());
            }

            @Override // p000.l74.InterfaceC8683p0
            public String getName() {
                return ((C8681o0) this.f86607b).getName();
            }

            @Override // p000.l74.InterfaceC8683p0
            public wj1 getNameBytes() {
                return ((C8681o0) this.f86607b).getNameBytes();
            }

            @Override // p000.l74.InterfaceC8683p0
            public C8685q0 getOptions() {
                return ((C8681o0) this.f86607b).getOptions();
            }

            @Override // p000.l74.InterfaceC8683p0
            public boolean hasName() {
                return ((C8681o0) this.f86607b).hasName();
            }

            @Override // p000.l74.InterfaceC8683p0
            public boolean hasOptions() {
                return ((C8681o0) this.f86607b).hasOptions();
            }

            public a mergeOptions(C8685q0 value) {
                m23058e();
                ((C8681o0) this.f86607b).mergeOptions(value);
                return this;
            }

            public a removeMethod(int index) {
                m23058e();
                ((C8681o0) this.f86607b).removeMethod(index);
                return this;
            }

            public a setMethod(int index, C8665g0 value) {
                m23058e();
                ((C8681o0) this.f86607b).setMethod(index, value);
                return this;
            }

            public a setName(String value) {
                m23058e();
                ((C8681o0) this.f86607b).setName(value);
                return this;
            }

            public a setNameBytes(wj1 value) {
                m23058e();
                ((C8681o0) this.f86607b).setNameBytes(value);
                return this;
            }

            public a setOptions(C8685q0 value) {
                m23058e();
                ((C8681o0) this.f86607b).setOptions(value);
                return this;
            }

            private a() {
                super(C8681o0.DEFAULT_INSTANCE);
            }

            public a addMethod(int index, C8665g0 value) {
                m23058e();
                ((C8681o0) this.f86607b).addMethod(index, value);
                return this;
            }

            public a setMethod(int index, C8665g0.a builderForValue) {
                m23058e();
                ((C8681o0) this.f86607b).setMethod(index, builderForValue.build());
                return this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public a setOptions(C8685q0.a builderForValue) {
                m23058e();
                ((C8681o0) this.f86607b).setOptions((C8685q0) builderForValue.build());
                return this;
            }

            public a addMethod(C8665g0.a builderForValue) {
                m23058e();
                ((C8681o0) this.f86607b).addMethod(builderForValue.build());
                return this;
            }

            public a addMethod(int index, C8665g0.a builderForValue) {
                m23058e();
                ((C8681o0) this.f86607b).addMethod(index, builderForValue.build());
                return this;
            }
        }

        static {
            C8681o0 c8681o0 = new C8681o0();
            DEFAULT_INSTANCE = c8681o0;
            u27.m23029g0(C8681o0.class, c8681o0);
        }

        private C8681o0() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllMethod(Iterable<? extends C8665g0> values) {
            ensureMethodIsMutable();
            AbstractC0027a3.m80a(values, this.method_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addMethod(C8665g0 value) {
            value.getClass();
            ensureMethodIsMutable();
            this.method_.add(value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMethod() {
            this.method_ = u27.m23036w();
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
            v98.InterfaceC13956l<C8665g0> interfaceC13956l = this.method_;
            if (interfaceC13956l.isModifiable()) {
                return;
            }
            this.method_ = u27.m23012O(interfaceC13956l);
        }

        public static C8681o0 getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public void mergeOptions(C8685q0 value) {
            value.getClass();
            C8685q0 c8685q0 = this.options_;
            if (c8685q0 == null || c8685q0 == C8685q0.getDefaultInstance()) {
                this.options_ = value;
            } else {
                this.options_ = ((C8685q0.a) C8685q0.newBuilder(this.options_).mergeFrom(value)).buildPartial();
            }
            this.bitField0_ |= 2;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.m23053m();
        }

        public static C8681o0 parseDelimitedFrom(InputStream input) throws IOException {
            return (C8681o0) u27.m23014R(DEFAULT_INSTANCE, input);
        }

        public static C8681o0 parseFrom(ByteBuffer data) throws be8 {
            return (C8681o0) u27.m23022Z(DEFAULT_INSTANCE, data);
        }

        public static vhc<C8681o0> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeMethod(int index) {
            ensureMethodIsMutable();
            this.method_.remove(index);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMethod(int index, C8665g0 value) {
            value.getClass();
            ensureMethodIsMutable();
            this.method_.set(index, value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setName(String value) {
            value.getClass();
            this.bitField0_ |= 1;
            this.name_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNameBytes(wj1 value) {
            this.name_ = value.toStringUtf8();
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOptions(C8685q0 value) {
            value.getClass();
            this.options_ = value;
            this.bitField0_ |= 2;
        }

        @Override // p000.l74.InterfaceC8683p0
        public C8665g0 getMethod(int index) {
            return this.method_.get(index);
        }

        @Override // p000.l74.InterfaceC8683p0
        public int getMethodCount() {
            return this.method_.size();
        }

        @Override // p000.l74.InterfaceC8683p0
        public List<C8665g0> getMethodList() {
            return this.method_;
        }

        public InterfaceC8667h0 getMethodOrBuilder(int index) {
            return this.method_.get(index);
        }

        public List<? extends InterfaceC8667h0> getMethodOrBuilderList() {
            return this.method_;
        }

        @Override // p000.l74.InterfaceC8683p0
        public String getName() {
            return this.name_;
        }

        @Override // p000.l74.InterfaceC8683p0
        public wj1 getNameBytes() {
            return wj1.copyFromUtf8(this.name_);
        }

        @Override // p000.l74.InterfaceC8683p0
        public C8685q0 getOptions() {
            C8685q0 c8685q0 = this.options_;
            return c8685q0 == null ? C8685q0.getDefaultInstance() : c8685q0;
        }

        @Override // p000.l74.InterfaceC8683p0
        public boolean hasName() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // p000.l74.InterfaceC8683p0
        public boolean hasOptions() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // p000.u27
        /* JADX INFO: renamed from: q */
        public final Object mo79q(u27.EnumC13331i method, Object arg0, Object arg1) {
            C8652a c8652a = null;
            switch (C8652a.f56391a[method.ordinal()]) {
                case 1:
                    return new C8681o0();
                case 2:
                    return new a(c8652a);
                case 3:
                    return u27.m23013P(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0002\u0001ဈ\u0000\u0002Л\u0003ᐉ\u0001", new Object[]{"bitField0_", "name_", "method_", C8665g0.class, "options_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    vhc<C8681o0> c13325c = PARSER;
                    if (c13325c == null) {
                        synchronized (C8681o0.class) {
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
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    this.memoizedIsInitialized = (byte) (arg0 == null ? 0 : 1);
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public static a newBuilder(C8681o0 prototype) {
            return DEFAULT_INSTANCE.m23054n(prototype);
        }

        public static C8681o0 parseDelimitedFrom(InputStream input, yi5 extensionRegistry) throws IOException {
            return (C8681o0) u27.m23015S(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static C8681o0 parseFrom(ByteBuffer data, yi5 extensionRegistry) throws be8 {
            return (C8681o0) u27.m23023a0(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static C8681o0 parseFrom(wj1 data) throws be8 {
            return (C8681o0) u27.m23016T(DEFAULT_INSTANCE, data);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addMethod(int index, C8665g0 value) {
            value.getClass();
            ensureMethodIsMutable();
            this.method_.add(index, value);
        }

        public static C8681o0 parseFrom(wj1 data, yi5 extensionRegistry) throws be8 {
            return (C8681o0) u27.m23017U(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static C8681o0 parseFrom(byte[] data) throws be8 {
            return (C8681o0) u27.m23024b0(DEFAULT_INSTANCE, data);
        }

        public static C8681o0 parseFrom(byte[] data, yi5 extensionRegistry) throws be8 {
            return (C8681o0) u27.m23025c0(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static C8681o0 parseFrom(InputStream input) throws IOException {
            return (C8681o0) u27.m23020X(DEFAULT_INSTANCE, input);
        }

        public static C8681o0 parseFrom(InputStream input, yi5 extensionRegistry) throws IOException {
            return (C8681o0) u27.m23021Y(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static C8681o0 parseFrom(e72 input) throws IOException {
            return (C8681o0) u27.m23018V(DEFAULT_INSTANCE, input);
        }

        public static C8681o0 parseFrom(e72 input, yi5 extensionRegistry) throws IOException {
            return (C8681o0) u27.m23019W(DEFAULT_INSTANCE, input, extensionRegistry);
        }
    }

    /* JADX INFO: renamed from: l74$p */
    public static final class C8682p extends u27<C8682p, a> implements InterfaceC8684q {
        public static final int DEFAULTS_FIELD_NUMBER = 1;
        private static final C8682p DEFAULT_INSTANCE;
        public static final int MAXIMUM_EDITION_FIELD_NUMBER = 5;
        public static final int MINIMUM_EDITION_FIELD_NUMBER = 4;
        private static volatile vhc<C8682p> PARSER;
        private int bitField0_;
        private int maximumEdition_;
        private int minimumEdition_;
        private byte memoizedIsInitialized = 2;
        private v98.InterfaceC13956l<b> defaults_ = u27.m23036w();

        /* JADX INFO: renamed from: l74$p$a */
        public static final class a extends u27.AbstractC13324b<C8682p, a> implements InterfaceC8684q {
            public /* synthetic */ a(C8652a c8652a) {
                this();
            }

            public a addAllDefaults(Iterable<? extends b> values) {
                m23058e();
                ((C8682p) this.f86607b).addAllDefaults(values);
                return this;
            }

            public a addDefaults(b value) {
                m23058e();
                ((C8682p) this.f86607b).addDefaults(value);
                return this;
            }

            public a clearDefaults() {
                m23058e();
                ((C8682p) this.f86607b).clearDefaults();
                return this;
            }

            public a clearMaximumEdition() {
                m23058e();
                ((C8682p) this.f86607b).clearMaximumEdition();
                return this;
            }

            public a clearMinimumEdition() {
                m23058e();
                ((C8682p) this.f86607b).clearMinimumEdition();
                return this;
            }

            @Override // p000.l74.InterfaceC8684q
            public b getDefaults(int index) {
                return ((C8682p) this.f86607b).getDefaults(index);
            }

            @Override // p000.l74.InterfaceC8684q
            public int getDefaultsCount() {
                return ((C8682p) this.f86607b).getDefaultsCount();
            }

            @Override // p000.l74.InterfaceC8684q
            public List<b> getDefaultsList() {
                return Collections.unmodifiableList(((C8682p) this.f86607b).getDefaultsList());
            }

            @Override // p000.l74.InterfaceC8684q
            public EnumC8658d getMaximumEdition() {
                return ((C8682p) this.f86607b).getMaximumEdition();
            }

            @Override // p000.l74.InterfaceC8684q
            public EnumC8658d getMinimumEdition() {
                return ((C8682p) this.f86607b).getMinimumEdition();
            }

            @Override // p000.l74.InterfaceC8684q
            public boolean hasMaximumEdition() {
                return ((C8682p) this.f86607b).hasMaximumEdition();
            }

            @Override // p000.l74.InterfaceC8684q
            public boolean hasMinimumEdition() {
                return ((C8682p) this.f86607b).hasMinimumEdition();
            }

            public a removeDefaults(int index) {
                m23058e();
                ((C8682p) this.f86607b).removeDefaults(index);
                return this;
            }

            public a setDefaults(int index, b value) {
                m23058e();
                ((C8682p) this.f86607b).setDefaults(index, value);
                return this;
            }

            public a setMaximumEdition(EnumC8658d value) {
                m23058e();
                ((C8682p) this.f86607b).setMaximumEdition(value);
                return this;
            }

            public a setMinimumEdition(EnumC8658d value) {
                m23058e();
                ((C8682p) this.f86607b).setMinimumEdition(value);
                return this;
            }

            private a() {
                super(C8682p.DEFAULT_INSTANCE);
            }

            public a addDefaults(int index, b value) {
                m23058e();
                ((C8682p) this.f86607b).addDefaults(index, value);
                return this;
            }

            public a setDefaults(int index, b.a builderForValue) {
                m23058e();
                ((C8682p) this.f86607b).setDefaults(index, builderForValue.build());
                return this;
            }

            public a addDefaults(b.a builderForValue) {
                m23058e();
                ((C8682p) this.f86607b).addDefaults(builderForValue.build());
                return this;
            }

            public a addDefaults(int index, b.a builderForValue) {
                m23058e();
                ((C8682p) this.f86607b).addDefaults(index, builderForValue.build());
                return this;
            }
        }

        /* JADX INFO: renamed from: l74$p$b */
        public static final class b extends u27<b, a> implements c {
            private static final b DEFAULT_INSTANCE;
            public static final int EDITION_FIELD_NUMBER = 3;
            public static final int FIXED_FEATURES_FIELD_NUMBER = 5;
            public static final int OVERRIDABLE_FEATURES_FIELD_NUMBER = 4;
            private static volatile vhc<b> PARSER;
            private int bitField0_;
            private int edition_;
            private C8680o fixedFeatures_;
            private byte memoizedIsInitialized = 2;
            private C8680o overridableFeatures_;

            /* JADX INFO: renamed from: l74$p$b$a */
            public static final class a extends u27.AbstractC13324b<b, a> implements c {
                public /* synthetic */ a(C8652a c8652a) {
                    this();
                }

                public a clearEdition() {
                    m23058e();
                    ((b) this.f86607b).clearEdition();
                    return this;
                }

                public a clearFixedFeatures() {
                    m23058e();
                    ((b) this.f86607b).clearFixedFeatures();
                    return this;
                }

                public a clearOverridableFeatures() {
                    m23058e();
                    ((b) this.f86607b).clearOverridableFeatures();
                    return this;
                }

                @Override // p000.l74.C8682p.c
                public EnumC8658d getEdition() {
                    return ((b) this.f86607b).getEdition();
                }

                @Override // p000.l74.C8682p.c
                public C8680o getFixedFeatures() {
                    return ((b) this.f86607b).getFixedFeatures();
                }

                @Override // p000.l74.C8682p.c
                public C8680o getOverridableFeatures() {
                    return ((b) this.f86607b).getOverridableFeatures();
                }

                @Override // p000.l74.C8682p.c
                public boolean hasEdition() {
                    return ((b) this.f86607b).hasEdition();
                }

                @Override // p000.l74.C8682p.c
                public boolean hasFixedFeatures() {
                    return ((b) this.f86607b).hasFixedFeatures();
                }

                @Override // p000.l74.C8682p.c
                public boolean hasOverridableFeatures() {
                    return ((b) this.f86607b).hasOverridableFeatures();
                }

                public a mergeFixedFeatures(C8680o value) {
                    m23058e();
                    ((b) this.f86607b).mergeFixedFeatures(value);
                    return this;
                }

                public a mergeOverridableFeatures(C8680o value) {
                    m23058e();
                    ((b) this.f86607b).mergeOverridableFeatures(value);
                    return this;
                }

                public a setEdition(EnumC8658d value) {
                    m23058e();
                    ((b) this.f86607b).setEdition(value);
                    return this;
                }

                public a setFixedFeatures(C8680o value) {
                    m23058e();
                    ((b) this.f86607b).setFixedFeatures(value);
                    return this;
                }

                public a setOverridableFeatures(C8680o value) {
                    m23058e();
                    ((b) this.f86607b).setOverridableFeatures(value);
                    return this;
                }

                private a() {
                    super(b.DEFAULT_INSTANCE);
                }

                /* JADX WARN: Multi-variable type inference failed */
                public a setFixedFeatures(C8680o.a builderForValue) {
                    m23058e();
                    ((b) this.f86607b).setFixedFeatures((C8680o) builderForValue.build());
                    return this;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public a setOverridableFeatures(C8680o.a builderForValue) {
                    m23058e();
                    ((b) this.f86607b).setOverridableFeatures((C8680o) builderForValue.build());
                    return this;
                }
            }

            static {
                b bVar = new b();
                DEFAULT_INSTANCE = bVar;
                u27.m23029g0(b.class, bVar);
            }

            private b() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearEdition() {
                this.bitField0_ &= -2;
                this.edition_ = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearFixedFeatures() {
                this.fixedFeatures_ = null;
                this.bitField0_ &= -5;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearOverridableFeatures() {
                this.overridableFeatures_ = null;
                this.bitField0_ &= -3;
            }

            public static b getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX WARN: Multi-variable type inference failed */
            public void mergeFixedFeatures(C8680o value) {
                value.getClass();
                C8680o c8680o = this.fixedFeatures_;
                if (c8680o == null || c8680o == C8680o.getDefaultInstance()) {
                    this.fixedFeatures_ = value;
                } else {
                    this.fixedFeatures_ = ((C8680o.a) C8680o.newBuilder(this.fixedFeatures_).mergeFrom(value)).buildPartial();
                }
                this.bitField0_ |= 4;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX WARN: Multi-variable type inference failed */
            public void mergeOverridableFeatures(C8680o value) {
                value.getClass();
                C8680o c8680o = this.overridableFeatures_;
                if (c8680o == null || c8680o == C8680o.getDefaultInstance()) {
                    this.overridableFeatures_ = value;
                } else {
                    this.overridableFeatures_ = ((C8680o.a) C8680o.newBuilder(this.overridableFeatures_).mergeFrom(value)).buildPartial();
                }
                this.bitField0_ |= 2;
            }

            public static a newBuilder() {
                return DEFAULT_INSTANCE.m23053m();
            }

            public static b parseDelimitedFrom(InputStream input) throws IOException {
                return (b) u27.m23014R(DEFAULT_INSTANCE, input);
            }

            public static b parseFrom(ByteBuffer data) throws be8 {
                return (b) u27.m23022Z(DEFAULT_INSTANCE, data);
            }

            public static vhc<b> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setEdition(EnumC8658d value) {
                this.edition_ = value.getNumber();
                this.bitField0_ |= 1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setFixedFeatures(C8680o value) {
                value.getClass();
                this.fixedFeatures_ = value;
                this.bitField0_ |= 4;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setOverridableFeatures(C8680o value) {
                value.getClass();
                this.overridableFeatures_ = value;
                this.bitField0_ |= 2;
            }

            @Override // p000.l74.C8682p.c
            public EnumC8658d getEdition() {
                EnumC8658d enumC8658dForNumber = EnumC8658d.forNumber(this.edition_);
                return enumC8658dForNumber == null ? EnumC8658d.EDITION_UNKNOWN : enumC8658dForNumber;
            }

            @Override // p000.l74.C8682p.c
            public C8680o getFixedFeatures() {
                C8680o c8680o = this.fixedFeatures_;
                return c8680o == null ? C8680o.getDefaultInstance() : c8680o;
            }

            @Override // p000.l74.C8682p.c
            public C8680o getOverridableFeatures() {
                C8680o c8680o = this.overridableFeatures_;
                return c8680o == null ? C8680o.getDefaultInstance() : c8680o;
            }

            @Override // p000.l74.C8682p.c
            public boolean hasEdition() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // p000.l74.C8682p.c
            public boolean hasFixedFeatures() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // p000.l74.C8682p.c
            public boolean hasOverridableFeatures() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // p000.u27
            /* JADX INFO: renamed from: q */
            public final Object mo79q(u27.EnumC13331i method, Object arg0, Object arg1) {
                C8652a c8652a = null;
                switch (C8652a.f56391a[method.ordinal()]) {
                    case 1:
                        return new b();
                    case 2:
                        return new a(c8652a);
                    case 3:
                        return u27.m23013P(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0003\u0005\u0003\u0000\u0000\u0002\u0003᠌\u0000\u0004ᐉ\u0001\u0005ᐉ\u0002", new Object[]{"bitField0_", "edition_", EnumC8658d.internalGetVerifier(), "overridableFeatures_", "fixedFeatures_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        vhc<b> c13325c = PARSER;
                        if (c13325c == null) {
                            synchronized (b.class) {
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
                        return Byte.valueOf(this.memoizedIsInitialized);
                    case 7:
                        this.memoizedIsInitialized = (byte) (arg0 == null ? 0 : 1);
                        return null;
                    default:
                        throw new UnsupportedOperationException();
                }
            }

            public static a newBuilder(b prototype) {
                return DEFAULT_INSTANCE.m23054n(prototype);
            }

            public static b parseDelimitedFrom(InputStream input, yi5 extensionRegistry) throws IOException {
                return (b) u27.m23015S(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static b parseFrom(ByteBuffer data, yi5 extensionRegistry) throws be8 {
                return (b) u27.m23023a0(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static b parseFrom(wj1 data) throws be8 {
                return (b) u27.m23016T(DEFAULT_INSTANCE, data);
            }

            public static b parseFrom(wj1 data, yi5 extensionRegistry) throws be8 {
                return (b) u27.m23017U(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static b parseFrom(byte[] data) throws be8 {
                return (b) u27.m23024b0(DEFAULT_INSTANCE, data);
            }

            public static b parseFrom(byte[] data, yi5 extensionRegistry) throws be8 {
                return (b) u27.m23025c0(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static b parseFrom(InputStream input) throws IOException {
                return (b) u27.m23020X(DEFAULT_INSTANCE, input);
            }

            public static b parseFrom(InputStream input, yi5 extensionRegistry) throws IOException {
                return (b) u27.m23021Y(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static b parseFrom(e72 input) throws IOException {
                return (b) u27.m23018V(DEFAULT_INSTANCE, input);
            }

            public static b parseFrom(e72 input, yi5 extensionRegistry) throws IOException {
                return (b) u27.m23019W(DEFAULT_INSTANCE, input, extensionRegistry);
            }
        }

        /* JADX INFO: renamed from: l74$p$c */
        public interface c extends ssa {
            EnumC8658d getEdition();

            C8680o getFixedFeatures();

            C8680o getOverridableFeatures();

            boolean hasEdition();

            boolean hasFixedFeatures();

            boolean hasOverridableFeatures();
        }

        static {
            C8682p c8682p = new C8682p();
            DEFAULT_INSTANCE = c8682p;
            u27.m23029g0(C8682p.class, c8682p);
        }

        private C8682p() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllDefaults(Iterable<? extends b> values) {
            ensureDefaultsIsMutable();
            AbstractC0027a3.m80a(values, this.defaults_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addDefaults(b value) {
            value.getClass();
            ensureDefaultsIsMutable();
            this.defaults_.add(value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDefaults() {
            this.defaults_ = u27.m23036w();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMaximumEdition() {
            this.bitField0_ &= -3;
            this.maximumEdition_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMinimumEdition() {
            this.bitField0_ &= -2;
            this.minimumEdition_ = 0;
        }

        private void ensureDefaultsIsMutable() {
            v98.InterfaceC13956l<b> interfaceC13956l = this.defaults_;
            if (interfaceC13956l.isModifiable()) {
                return;
            }
            this.defaults_ = u27.m23012O(interfaceC13956l);
        }

        public static C8682p getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.m23053m();
        }

        public static C8682p parseDelimitedFrom(InputStream input) throws IOException {
            return (C8682p) u27.m23014R(DEFAULT_INSTANCE, input);
        }

        public static C8682p parseFrom(ByteBuffer data) throws be8 {
            return (C8682p) u27.m23022Z(DEFAULT_INSTANCE, data);
        }

        public static vhc<C8682p> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeDefaults(int index) {
            ensureDefaultsIsMutable();
            this.defaults_.remove(index);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDefaults(int index, b value) {
            value.getClass();
            ensureDefaultsIsMutable();
            this.defaults_.set(index, value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMaximumEdition(EnumC8658d value) {
            this.maximumEdition_ = value.getNumber();
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMinimumEdition(EnumC8658d value) {
            this.minimumEdition_ = value.getNumber();
            this.bitField0_ |= 1;
        }

        @Override // p000.l74.InterfaceC8684q
        public b getDefaults(int index) {
            return this.defaults_.get(index);
        }

        @Override // p000.l74.InterfaceC8684q
        public int getDefaultsCount() {
            return this.defaults_.size();
        }

        @Override // p000.l74.InterfaceC8684q
        public List<b> getDefaultsList() {
            return this.defaults_;
        }

        public c getDefaultsOrBuilder(int index) {
            return this.defaults_.get(index);
        }

        public List<? extends c> getDefaultsOrBuilderList() {
            return this.defaults_;
        }

        @Override // p000.l74.InterfaceC8684q
        public EnumC8658d getMaximumEdition() {
            EnumC8658d enumC8658dForNumber = EnumC8658d.forNumber(this.maximumEdition_);
            return enumC8658dForNumber == null ? EnumC8658d.EDITION_UNKNOWN : enumC8658dForNumber;
        }

        @Override // p000.l74.InterfaceC8684q
        public EnumC8658d getMinimumEdition() {
            EnumC8658d enumC8658dForNumber = EnumC8658d.forNumber(this.minimumEdition_);
            return enumC8658dForNumber == null ? EnumC8658d.EDITION_UNKNOWN : enumC8658dForNumber;
        }

        @Override // p000.l74.InterfaceC8684q
        public boolean hasMaximumEdition() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // p000.l74.InterfaceC8684q
        public boolean hasMinimumEdition() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // p000.u27
        /* JADX INFO: renamed from: q */
        public final Object mo79q(u27.EnumC13331i method, Object arg0, Object arg1) {
            C8652a c8652a = null;
            switch (C8652a.f56391a[method.ordinal()]) {
                case 1:
                    return new C8682p();
                case 2:
                    return new a(c8652a);
                case 3:
                    return u27.m23013P(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0001\u0001\u0001Л\u0004᠌\u0000\u0005᠌\u0001", new Object[]{"bitField0_", "defaults_", b.class, "minimumEdition_", EnumC8658d.internalGetVerifier(), "maximumEdition_", EnumC8658d.internalGetVerifier()});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    vhc<C8682p> c13325c = PARSER;
                    if (c13325c == null) {
                        synchronized (C8682p.class) {
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
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    this.memoizedIsInitialized = (byte) (arg0 == null ? 0 : 1);
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public static a newBuilder(C8682p prototype) {
            return DEFAULT_INSTANCE.m23054n(prototype);
        }

        public static C8682p parseDelimitedFrom(InputStream input, yi5 extensionRegistry) throws IOException {
            return (C8682p) u27.m23015S(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static C8682p parseFrom(ByteBuffer data, yi5 extensionRegistry) throws be8 {
            return (C8682p) u27.m23023a0(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static C8682p parseFrom(wj1 data) throws be8 {
            return (C8682p) u27.m23016T(DEFAULT_INSTANCE, data);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addDefaults(int index, b value) {
            value.getClass();
            ensureDefaultsIsMutable();
            this.defaults_.add(index, value);
        }

        public static C8682p parseFrom(wj1 data, yi5 extensionRegistry) throws be8 {
            return (C8682p) u27.m23017U(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static C8682p parseFrom(byte[] data) throws be8 {
            return (C8682p) u27.m23024b0(DEFAULT_INSTANCE, data);
        }

        public static C8682p parseFrom(byte[] data, yi5 extensionRegistry) throws be8 {
            return (C8682p) u27.m23025c0(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static C8682p parseFrom(InputStream input) throws IOException {
            return (C8682p) u27.m23020X(DEFAULT_INSTANCE, input);
        }

        public static C8682p parseFrom(InputStream input, yi5 extensionRegistry) throws IOException {
            return (C8682p) u27.m23021Y(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static C8682p parseFrom(e72 input) throws IOException {
            return (C8682p) u27.m23018V(DEFAULT_INSTANCE, input);
        }

        public static C8682p parseFrom(e72 input, yi5 extensionRegistry) throws IOException {
            return (C8682p) u27.m23019W(DEFAULT_INSTANCE, input, extensionRegistry);
        }
    }

    /* JADX INFO: renamed from: l74$p0 */
    public interface InterfaceC8683p0 extends ssa {
        C8665g0 getMethod(int index);

        int getMethodCount();

        List<C8665g0> getMethodList();

        String getName();

        wj1 getNameBytes();

        C8685q0 getOptions();

        boolean hasName();

        boolean hasOptions();
    }

    /* JADX INFO: renamed from: l74$q */
    public interface InterfaceC8684q extends ssa {
        C8682p.b getDefaults(int index);

        int getDefaultsCount();

        List<C8682p.b> getDefaultsList();

        EnumC8658d getMaximumEdition();

        EnumC8658d getMinimumEdition();

        boolean hasMaximumEdition();

        boolean hasMinimumEdition();
    }

    /* JADX INFO: renamed from: l74$q0 */
    public static final class C8685q0 extends u27.AbstractC13327e<C8685q0, a> implements InterfaceC8687r0 {
        private static final C8685q0 DEFAULT_INSTANCE;
        public static final int DEPRECATED_FIELD_NUMBER = 33;
        public static final int FEATURES_FIELD_NUMBER = 34;
        private static volatile vhc<C8685q0> PARSER = null;
        public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
        private int bitField0_;
        private boolean deprecated_;
        private C8680o features_;
        private byte memoizedIsInitialized = 2;
        private v98.InterfaceC13956l<C8693u0> uninterpretedOption_ = u27.m23036w();

        /* JADX INFO: renamed from: l74$q0$a */
        public static final class a extends u27.AbstractC13326d<C8685q0, a> implements InterfaceC8687r0 {
            public /* synthetic */ a(C8652a c8652a) {
                this();
            }

            public a addAllUninterpretedOption(Iterable<? extends C8693u0> values) {
                m23058e();
                ((C8685q0) this.f86607b).addAllUninterpretedOption(values);
                return this;
            }

            public a addUninterpretedOption(C8693u0 value) {
                m23058e();
                ((C8685q0) this.f86607b).addUninterpretedOption(value);
                return this;
            }

            public a clearDeprecated() {
                m23058e();
                ((C8685q0) this.f86607b).clearDeprecated();
                return this;
            }

            public a clearFeatures() {
                m23058e();
                ((C8685q0) this.f86607b).clearFeatures();
                return this;
            }

            public a clearUninterpretedOption() {
                m23058e();
                ((C8685q0) this.f86607b).clearUninterpretedOption();
                return this;
            }

            @Override // p000.l74.InterfaceC8687r0
            public boolean getDeprecated() {
                return ((C8685q0) this.f86607b).getDeprecated();
            }

            @Override // p000.l74.InterfaceC8687r0
            public C8680o getFeatures() {
                return ((C8685q0) this.f86607b).getFeatures();
            }

            @Override // p000.l74.InterfaceC8687r0
            public C8693u0 getUninterpretedOption(int index) {
                return ((C8685q0) this.f86607b).getUninterpretedOption(index);
            }

            @Override // p000.l74.InterfaceC8687r0
            public int getUninterpretedOptionCount() {
                return ((C8685q0) this.f86607b).getUninterpretedOptionCount();
            }

            @Override // p000.l74.InterfaceC8687r0
            public List<C8693u0> getUninterpretedOptionList() {
                return Collections.unmodifiableList(((C8685q0) this.f86607b).getUninterpretedOptionList());
            }

            @Override // p000.l74.InterfaceC8687r0
            public boolean hasDeprecated() {
                return ((C8685q0) this.f86607b).hasDeprecated();
            }

            @Override // p000.l74.InterfaceC8687r0
            public boolean hasFeatures() {
                return ((C8685q0) this.f86607b).hasFeatures();
            }

            public a mergeFeatures(C8680o value) {
                m23058e();
                ((C8685q0) this.f86607b).mergeFeatures(value);
                return this;
            }

            public a removeUninterpretedOption(int index) {
                m23058e();
                ((C8685q0) this.f86607b).removeUninterpretedOption(index);
                return this;
            }

            public a setDeprecated(boolean value) {
                m23058e();
                ((C8685q0) this.f86607b).setDeprecated(value);
                return this;
            }

            public a setFeatures(C8680o value) {
                m23058e();
                ((C8685q0) this.f86607b).setFeatures(value);
                return this;
            }

            public a setUninterpretedOption(int index, C8693u0 value) {
                m23058e();
                ((C8685q0) this.f86607b).setUninterpretedOption(index, value);
                return this;
            }

            private a() {
                super(C8685q0.DEFAULT_INSTANCE);
            }

            public a addUninterpretedOption(int index, C8693u0 value) {
                m23058e();
                ((C8685q0) this.f86607b).addUninterpretedOption(index, value);
                return this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public a setFeatures(C8680o.a builderForValue) {
                m23058e();
                ((C8685q0) this.f86607b).setFeatures((C8680o) builderForValue.build());
                return this;
            }

            public a setUninterpretedOption(int index, C8693u0.a builderForValue) {
                m23058e();
                ((C8685q0) this.f86607b).setUninterpretedOption(index, builderForValue.build());
                return this;
            }

            public a addUninterpretedOption(C8693u0.a builderForValue) {
                m23058e();
                ((C8685q0) this.f86607b).addUninterpretedOption(builderForValue.build());
                return this;
            }

            public a addUninterpretedOption(int index, C8693u0.a builderForValue) {
                m23058e();
                ((C8685q0) this.f86607b).addUninterpretedOption(index, builderForValue.build());
                return this;
            }
        }

        static {
            C8685q0 c8685q0 = new C8685q0();
            DEFAULT_INSTANCE = c8685q0;
            u27.m23029g0(C8685q0.class, c8685q0);
        }

        private C8685q0() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllUninterpretedOption(Iterable<? extends C8693u0> values) {
            ensureUninterpretedOptionIsMutable();
            AbstractC0027a3.m80a(values, this.uninterpretedOption_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addUninterpretedOption(C8693u0 value) {
            value.getClass();
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.add(value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDeprecated() {
            this.bitField0_ &= -3;
            this.deprecated_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFeatures() {
            this.features_ = null;
            this.bitField0_ &= -2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUninterpretedOption() {
            this.uninterpretedOption_ = u27.m23036w();
        }

        private void ensureUninterpretedOptionIsMutable() {
            v98.InterfaceC13956l<C8693u0> interfaceC13956l = this.uninterpretedOption_;
            if (interfaceC13956l.isModifiable()) {
                return;
            }
            this.uninterpretedOption_ = u27.m23012O(interfaceC13956l);
        }

        public static C8685q0 getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public void mergeFeatures(C8680o value) {
            value.getClass();
            C8680o c8680o = this.features_;
            if (c8680o == null || c8680o == C8680o.getDefaultInstance()) {
                this.features_ = value;
            } else {
                this.features_ = ((C8680o.a) C8680o.newBuilder(this.features_).mergeFrom(value)).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static a newBuilder() {
            return (a) DEFAULT_INSTANCE.m23053m();
        }

        public static C8685q0 parseDelimitedFrom(InputStream input) throws IOException {
            return (C8685q0) u27.m23014R(DEFAULT_INSTANCE, input);
        }

        public static C8685q0 parseFrom(ByteBuffer data) throws be8 {
            return (C8685q0) u27.m23022Z(DEFAULT_INSTANCE, data);
        }

        public static vhc<C8685q0> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeUninterpretedOption(int index) {
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.remove(index);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDeprecated(boolean value) {
            this.bitField0_ |= 2;
            this.deprecated_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFeatures(C8680o value) {
            value.getClass();
            this.features_ = value;
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUninterpretedOption(int index, C8693u0 value) {
            value.getClass();
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.set(index, value);
        }

        @Override // p000.l74.InterfaceC8687r0
        public boolean getDeprecated() {
            return this.deprecated_;
        }

        @Override // p000.l74.InterfaceC8687r0
        public C8680o getFeatures() {
            C8680o c8680o = this.features_;
            return c8680o == null ? C8680o.getDefaultInstance() : c8680o;
        }

        @Override // p000.l74.InterfaceC8687r0
        public C8693u0 getUninterpretedOption(int index) {
            return this.uninterpretedOption_.get(index);
        }

        @Override // p000.l74.InterfaceC8687r0
        public int getUninterpretedOptionCount() {
            return this.uninterpretedOption_.size();
        }

        @Override // p000.l74.InterfaceC8687r0
        public List<C8693u0> getUninterpretedOptionList() {
            return this.uninterpretedOption_;
        }

        public InterfaceC8695v0 getUninterpretedOptionOrBuilder(int index) {
            return this.uninterpretedOption_.get(index);
        }

        public List<? extends InterfaceC8695v0> getUninterpretedOptionOrBuilderList() {
            return this.uninterpretedOption_;
        }

        @Override // p000.l74.InterfaceC8687r0
        public boolean hasDeprecated() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // p000.l74.InterfaceC8687r0
        public boolean hasFeatures() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // p000.u27
        /* JADX INFO: renamed from: q */
        public final Object mo79q(u27.EnumC13331i method, Object arg0, Object arg1) {
            C8652a c8652a = null;
            switch (C8652a.f56391a[method.ordinal()]) {
                case 1:
                    return new C8685q0();
                case 2:
                    return new a(c8652a);
                case 3:
                    return u27.m23013P(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001!ϧ\u0003\u0000\u0001\u0002!ဇ\u0001\"ᐉ\u0000ϧЛ", new Object[]{"bitField0_", "deprecated_", "features_", "uninterpretedOption_", C8693u0.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    vhc<C8685q0> c13325c = PARSER;
                    if (c13325c == null) {
                        synchronized (C8685q0.class) {
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
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    this.memoizedIsInitialized = (byte) (arg0 == null ? 0 : 1);
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static a newBuilder(C8685q0 prototype) {
            return (a) DEFAULT_INSTANCE.m23054n(prototype);
        }

        public static C8685q0 parseDelimitedFrom(InputStream input, yi5 extensionRegistry) throws IOException {
            return (C8685q0) u27.m23015S(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static C8685q0 parseFrom(ByteBuffer data, yi5 extensionRegistry) throws be8 {
            return (C8685q0) u27.m23023a0(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static C8685q0 parseFrom(wj1 data) throws be8 {
            return (C8685q0) u27.m23016T(DEFAULT_INSTANCE, data);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addUninterpretedOption(int index, C8693u0 value) {
            value.getClass();
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.add(index, value);
        }

        public static C8685q0 parseFrom(wj1 data, yi5 extensionRegistry) throws be8 {
            return (C8685q0) u27.m23017U(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static C8685q0 parseFrom(byte[] data) throws be8 {
            return (C8685q0) u27.m23024b0(DEFAULT_INSTANCE, data);
        }

        public static C8685q0 parseFrom(byte[] data, yi5 extensionRegistry) throws be8 {
            return (C8685q0) u27.m23025c0(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static C8685q0 parseFrom(InputStream input) throws IOException {
            return (C8685q0) u27.m23020X(DEFAULT_INSTANCE, input);
        }

        public static C8685q0 parseFrom(InputStream input, yi5 extensionRegistry) throws IOException {
            return (C8685q0) u27.m23021Y(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static C8685q0 parseFrom(e72 input) throws IOException {
            return (C8685q0) u27.m23018V(DEFAULT_INSTANCE, input);
        }

        public static C8685q0 parseFrom(e72 input, yi5 extensionRegistry) throws IOException {
            return (C8685q0) u27.m23019W(DEFAULT_INSTANCE, input, extensionRegistry);
        }
    }

    /* JADX INFO: renamed from: l74$r */
    public interface InterfaceC8686r extends u27.InterfaceC13328f<C8680o, C8680o.a> {
        C8680o.b getEnumType();

        C8680o.c getFieldPresence();

        C8680o.d getJsonFormat();

        C8680o.e getMessageEncoding();

        C8680o.f getRepeatedFieldEncoding();

        C8680o.g getUtf8Validation();

        boolean hasEnumType();

        boolean hasFieldPresence();

        boolean hasJsonFormat();

        boolean hasMessageEncoding();

        boolean hasRepeatedFieldEncoding();

        boolean hasUtf8Validation();
    }

    /* JADX INFO: renamed from: l74$r0 */
    public interface InterfaceC8687r0 extends u27.InterfaceC13328f<C8685q0, C8685q0.a> {
        boolean getDeprecated();

        C8680o getFeatures();

        C8693u0 getUninterpretedOption(int index);

        int getUninterpretedOptionCount();

        List<C8693u0> getUninterpretedOptionList();

        boolean hasDeprecated();

        boolean hasFeatures();
    }

    /* JADX INFO: renamed from: l74$s */
    public static final class C8688s extends u27<C8688s, a> implements InterfaceC8690t {
        private static final C8688s DEFAULT_INSTANCE;
        public static final int DEFAULT_VALUE_FIELD_NUMBER = 7;
        public static final int EXTENDEE_FIELD_NUMBER = 2;
        public static final int JSON_NAME_FIELD_NUMBER = 10;
        public static final int LABEL_FIELD_NUMBER = 4;
        public static final int NAME_FIELD_NUMBER = 1;
        public static final int NUMBER_FIELD_NUMBER = 3;
        public static final int ONEOF_INDEX_FIELD_NUMBER = 9;
        public static final int OPTIONS_FIELD_NUMBER = 8;
        private static volatile vhc<C8688s> PARSER = null;
        public static final int PROTO3_OPTIONAL_FIELD_NUMBER = 17;
        public static final int TYPE_FIELD_NUMBER = 5;
        public static final int TYPE_NAME_FIELD_NUMBER = 6;
        private int bitField0_;
        private int number_;
        private int oneofIndex_;
        private C8692u options_;
        private boolean proto3Optional_;
        private byte memoizedIsInitialized = 2;
        private String name_ = "";
        private int label_ = 1;
        private int type_ = 1;
        private String typeName_ = "";
        private String extendee_ = "";
        private String defaultValue_ = "";
        private String jsonName_ = "";

        /* JADX INFO: renamed from: l74$s$a */
        public static final class a extends u27.AbstractC13324b<C8688s, a> implements InterfaceC8690t {
            public /* synthetic */ a(C8652a c8652a) {
                this();
            }

            public a clearDefaultValue() {
                m23058e();
                ((C8688s) this.f86607b).clearDefaultValue();
                return this;
            }

            public a clearExtendee() {
                m23058e();
                ((C8688s) this.f86607b).clearExtendee();
                return this;
            }

            public a clearJsonName() {
                m23058e();
                ((C8688s) this.f86607b).clearJsonName();
                return this;
            }

            public a clearLabel() {
                m23058e();
                ((C8688s) this.f86607b).clearLabel();
                return this;
            }

            public a clearName() {
                m23058e();
                ((C8688s) this.f86607b).clearName();
                return this;
            }

            public a clearNumber() {
                m23058e();
                ((C8688s) this.f86607b).clearNumber();
                return this;
            }

            public a clearOneofIndex() {
                m23058e();
                ((C8688s) this.f86607b).clearOneofIndex();
                return this;
            }

            public a clearOptions() {
                m23058e();
                ((C8688s) this.f86607b).clearOptions();
                return this;
            }

            public a clearProto3Optional() {
                m23058e();
                ((C8688s) this.f86607b).clearProto3Optional();
                return this;
            }

            public a clearType() {
                m23058e();
                ((C8688s) this.f86607b).clearType();
                return this;
            }

            public a clearTypeName() {
                m23058e();
                ((C8688s) this.f86607b).clearTypeName();
                return this;
            }

            @Override // p000.l74.InterfaceC8690t
            public String getDefaultValue() {
                return ((C8688s) this.f86607b).getDefaultValue();
            }

            @Override // p000.l74.InterfaceC8690t
            public wj1 getDefaultValueBytes() {
                return ((C8688s) this.f86607b).getDefaultValueBytes();
            }

            @Override // p000.l74.InterfaceC8690t
            public String getExtendee() {
                return ((C8688s) this.f86607b).getExtendee();
            }

            @Override // p000.l74.InterfaceC8690t
            public wj1 getExtendeeBytes() {
                return ((C8688s) this.f86607b).getExtendeeBytes();
            }

            @Override // p000.l74.InterfaceC8690t
            public String getJsonName() {
                return ((C8688s) this.f86607b).getJsonName();
            }

            @Override // p000.l74.InterfaceC8690t
            public wj1 getJsonNameBytes() {
                return ((C8688s) this.f86607b).getJsonNameBytes();
            }

            @Override // p000.l74.InterfaceC8690t
            public b getLabel() {
                return ((C8688s) this.f86607b).getLabel();
            }

            @Override // p000.l74.InterfaceC8690t
            public String getName() {
                return ((C8688s) this.f86607b).getName();
            }

            @Override // p000.l74.InterfaceC8690t
            public wj1 getNameBytes() {
                return ((C8688s) this.f86607b).getNameBytes();
            }

            @Override // p000.l74.InterfaceC8690t
            public int getNumber() {
                return ((C8688s) this.f86607b).getNumber();
            }

            @Override // p000.l74.InterfaceC8690t
            public int getOneofIndex() {
                return ((C8688s) this.f86607b).getOneofIndex();
            }

            @Override // p000.l74.InterfaceC8690t
            public C8692u getOptions() {
                return ((C8688s) this.f86607b).getOptions();
            }

            @Override // p000.l74.InterfaceC8690t
            public boolean getProto3Optional() {
                return ((C8688s) this.f86607b).getProto3Optional();
            }

            @Override // p000.l74.InterfaceC8690t
            public c getType() {
                return ((C8688s) this.f86607b).getType();
            }

            @Override // p000.l74.InterfaceC8690t
            public String getTypeName() {
                return ((C8688s) this.f86607b).getTypeName();
            }

            @Override // p000.l74.InterfaceC8690t
            public wj1 getTypeNameBytes() {
                return ((C8688s) this.f86607b).getTypeNameBytes();
            }

            @Override // p000.l74.InterfaceC8690t
            public boolean hasDefaultValue() {
                return ((C8688s) this.f86607b).hasDefaultValue();
            }

            @Override // p000.l74.InterfaceC8690t
            public boolean hasExtendee() {
                return ((C8688s) this.f86607b).hasExtendee();
            }

            @Override // p000.l74.InterfaceC8690t
            public boolean hasJsonName() {
                return ((C8688s) this.f86607b).hasJsonName();
            }

            @Override // p000.l74.InterfaceC8690t
            public boolean hasLabel() {
                return ((C8688s) this.f86607b).hasLabel();
            }

            @Override // p000.l74.InterfaceC8690t
            public boolean hasName() {
                return ((C8688s) this.f86607b).hasName();
            }

            @Override // p000.l74.InterfaceC8690t
            public boolean hasNumber() {
                return ((C8688s) this.f86607b).hasNumber();
            }

            @Override // p000.l74.InterfaceC8690t
            public boolean hasOneofIndex() {
                return ((C8688s) this.f86607b).hasOneofIndex();
            }

            @Override // p000.l74.InterfaceC8690t
            public boolean hasOptions() {
                return ((C8688s) this.f86607b).hasOptions();
            }

            @Override // p000.l74.InterfaceC8690t
            public boolean hasProto3Optional() {
                return ((C8688s) this.f86607b).hasProto3Optional();
            }

            @Override // p000.l74.InterfaceC8690t
            public boolean hasType() {
                return ((C8688s) this.f86607b).hasType();
            }

            @Override // p000.l74.InterfaceC8690t
            public boolean hasTypeName() {
                return ((C8688s) this.f86607b).hasTypeName();
            }

            public a mergeOptions(C8692u value) {
                m23058e();
                ((C8688s) this.f86607b).mergeOptions(value);
                return this;
            }

            public a setDefaultValue(String value) {
                m23058e();
                ((C8688s) this.f86607b).setDefaultValue(value);
                return this;
            }

            public a setDefaultValueBytes(wj1 value) {
                m23058e();
                ((C8688s) this.f86607b).setDefaultValueBytes(value);
                return this;
            }

            public a setExtendee(String value) {
                m23058e();
                ((C8688s) this.f86607b).setExtendee(value);
                return this;
            }

            public a setExtendeeBytes(wj1 value) {
                m23058e();
                ((C8688s) this.f86607b).setExtendeeBytes(value);
                return this;
            }

            public a setJsonName(String value) {
                m23058e();
                ((C8688s) this.f86607b).setJsonName(value);
                return this;
            }

            public a setJsonNameBytes(wj1 value) {
                m23058e();
                ((C8688s) this.f86607b).setJsonNameBytes(value);
                return this;
            }

            public a setLabel(b value) {
                m23058e();
                ((C8688s) this.f86607b).setLabel(value);
                return this;
            }

            public a setName(String value) {
                m23058e();
                ((C8688s) this.f86607b).setName(value);
                return this;
            }

            public a setNameBytes(wj1 value) {
                m23058e();
                ((C8688s) this.f86607b).setNameBytes(value);
                return this;
            }

            public a setNumber(int value) {
                m23058e();
                ((C8688s) this.f86607b).setNumber(value);
                return this;
            }

            public a setOneofIndex(int value) {
                m23058e();
                ((C8688s) this.f86607b).setOneofIndex(value);
                return this;
            }

            public a setOptions(C8692u value) {
                m23058e();
                ((C8688s) this.f86607b).setOptions(value);
                return this;
            }

            public a setProto3Optional(boolean value) {
                m23058e();
                ((C8688s) this.f86607b).setProto3Optional(value);
                return this;
            }

            public a setType(c value) {
                m23058e();
                ((C8688s) this.f86607b).setType(value);
                return this;
            }

            public a setTypeName(String value) {
                m23058e();
                ((C8688s) this.f86607b).setTypeName(value);
                return this;
            }

            public a setTypeNameBytes(wj1 value) {
                m23058e();
                ((C8688s) this.f86607b).setTypeNameBytes(value);
                return this;
            }

            private a() {
                super(C8688s.DEFAULT_INSTANCE);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public a setOptions(C8692u.b builderForValue) {
                m23058e();
                ((C8688s) this.f86607b).setOptions((C8692u) builderForValue.build());
                return this;
            }
        }

        /* JADX INFO: renamed from: l74$s$b */
        public enum b implements v98.InterfaceC13947c {
            LABEL_OPTIONAL(1),
            LABEL_REPEATED(3),
            LABEL_REQUIRED(2);


            /* JADX INFO: renamed from: C */
            public static final v98.InterfaceC13948d<b> f56520C = new a();

            /* JADX INFO: renamed from: e */
            public static final int f56525e = 1;

            /* JADX INFO: renamed from: f */
            public static final int f56526f = 3;

            /* JADX INFO: renamed from: m */
            public static final int f56527m = 2;

            /* JADX INFO: renamed from: a */
            public final int f56528a;

            /* JADX INFO: renamed from: l74$s$b$a */
            public class a implements v98.InterfaceC13948d<b> {
                @Override // p000.v98.InterfaceC13948d
                public b findValueByNumber(int number) {
                    return b.forNumber(number);
                }
            }

            /* JADX INFO: renamed from: l74$s$b$b, reason: collision with other inner class name */
            public static final class C16470b implements v98.InterfaceC13949e {

                /* JADX INFO: renamed from: a */
                public static final v98.InterfaceC13949e f56529a = new C16470b();

                private C16470b() {
                }

                @Override // p000.v98.InterfaceC13949e
                public boolean isInRange(int number) {
                    return b.forNumber(number) != null;
                }
            }

            b(int value) {
                this.f56528a = value;
            }

            public static b forNumber(int value) {
                if (value == 1) {
                    return LABEL_OPTIONAL;
                }
                if (value == 2) {
                    return LABEL_REQUIRED;
                }
                if (value != 3) {
                    return null;
                }
                return LABEL_REPEATED;
            }

            public static v98.InterfaceC13948d<b> internalGetValueMap() {
                return f56520C;
            }

            public static v98.InterfaceC13949e internalGetVerifier() {
                return C16470b.f56529a;
            }

            @Override // p000.v98.InterfaceC13947c
            public final int getNumber() {
                return this.f56528a;
            }

            @Deprecated
            public static b valueOf(int value) {
                return forNumber(value);
            }
        }

        /* JADX INFO: renamed from: l74$s$c */
        public enum c implements v98.InterfaceC13947c {
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
            public static final int f56542Z1 = 1;

            /* JADX INFO: renamed from: a2 */
            public static final int f56543a2 = 2;

            /* JADX INFO: renamed from: b2 */
            public static final int f56545b2 = 3;

            /* JADX INFO: renamed from: c2 */
            public static final int f56547c2 = 4;

            /* JADX INFO: renamed from: d2 */
            public static final int f56549d2 = 5;

            /* JADX INFO: renamed from: e2 */
            public static final int f56551e2 = 6;

            /* JADX INFO: renamed from: f2 */
            public static final int f56553f2 = 7;

            /* JADX INFO: renamed from: g2 */
            public static final int f56554g2 = 8;

            /* JADX INFO: renamed from: h2 */
            public static final int f56555h2 = 9;

            /* JADX INFO: renamed from: i2 */
            public static final int f56556i2 = 10;

            /* JADX INFO: renamed from: j2 */
            public static final int f56557j2 = 11;

            /* JADX INFO: renamed from: k2 */
            public static final int f56558k2 = 12;

            /* JADX INFO: renamed from: l2 */
            public static final int f56559l2 = 13;

            /* JADX INFO: renamed from: m2 */
            public static final int f56561m2 = 14;

            /* JADX INFO: renamed from: n2 */
            public static final int f56562n2 = 15;

            /* JADX INFO: renamed from: o2 */
            public static final int f56563o2 = 16;

            /* JADX INFO: renamed from: p2 */
            public static final int f56564p2 = 17;

            /* JADX INFO: renamed from: q2 */
            public static final int f56565q2 = 18;

            /* JADX INFO: renamed from: r2 */
            public static final v98.InterfaceC13948d<c> f56566r2 = new a();

            /* JADX INFO: renamed from: a */
            public final int f56568a;

            /* JADX INFO: renamed from: l74$s$c$a */
            public class a implements v98.InterfaceC13948d<c> {
                @Override // p000.v98.InterfaceC13948d
                public c findValueByNumber(int number) {
                    return c.forNumber(number);
                }
            }

            /* JADX INFO: renamed from: l74$s$c$b */
            public static final class b implements v98.InterfaceC13949e {

                /* JADX INFO: renamed from: a */
                public static final v98.InterfaceC13949e f56569a = new b();

                private b() {
                }

                @Override // p000.v98.InterfaceC13949e
                public boolean isInRange(int number) {
                    return c.forNumber(number) != null;
                }
            }

            c(int value) {
                this.f56568a = value;
            }

            public static c forNumber(int value) {
                switch (value) {
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

            public static v98.InterfaceC13948d<c> internalGetValueMap() {
                return f56566r2;
            }

            public static v98.InterfaceC13949e internalGetVerifier() {
                return b.f56569a;
            }

            @Override // p000.v98.InterfaceC13947c
            public final int getNumber() {
                return this.f56568a;
            }

            @Deprecated
            public static c valueOf(int value) {
                return forNumber(value);
            }
        }

        static {
            C8688s c8688s = new C8688s();
            DEFAULT_INSTANCE = c8688s;
            u27.m23029g0(C8688s.class, c8688s);
        }

        private C8688s() {
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

        public static C8688s getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public void mergeOptions(C8692u value) {
            value.getClass();
            C8692u c8692u = this.options_;
            if (c8692u == null || c8692u == C8692u.getDefaultInstance()) {
                this.options_ = value;
            } else {
                this.options_ = ((C8692u.b) C8692u.newBuilder(this.options_).mergeFrom(value)).buildPartial();
            }
            this.bitField0_ |= 512;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.m23053m();
        }

        public static C8688s parseDelimitedFrom(InputStream input) throws IOException {
            return (C8688s) u27.m23014R(DEFAULT_INSTANCE, input);
        }

        public static C8688s parseFrom(ByteBuffer data) throws be8 {
            return (C8688s) u27.m23022Z(DEFAULT_INSTANCE, data);
        }

        public static vhc<C8688s> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDefaultValue(String value) {
            value.getClass();
            this.bitField0_ |= 64;
            this.defaultValue_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDefaultValueBytes(wj1 value) {
            this.defaultValue_ = value.toStringUtf8();
            this.bitField0_ |= 64;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setExtendee(String value) {
            value.getClass();
            this.bitField0_ |= 32;
            this.extendee_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setExtendeeBytes(wj1 value) {
            this.extendee_ = value.toStringUtf8();
            this.bitField0_ |= 32;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setJsonName(String value) {
            value.getClass();
            this.bitField0_ |= 256;
            this.jsonName_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setJsonNameBytes(wj1 value) {
            this.jsonName_ = value.toStringUtf8();
            this.bitField0_ |= 256;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLabel(b value) {
            this.label_ = value.getNumber();
            this.bitField0_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setName(String value) {
            value.getClass();
            this.bitField0_ |= 1;
            this.name_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNameBytes(wj1 value) {
            this.name_ = value.toStringUtf8();
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNumber(int value) {
            this.bitField0_ |= 2;
            this.number_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOneofIndex(int value) {
            this.bitField0_ |= 128;
            this.oneofIndex_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOptions(C8692u value) {
            value.getClass();
            this.options_ = value;
            this.bitField0_ |= 512;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setProto3Optional(boolean value) {
            this.bitField0_ |= 1024;
            this.proto3Optional_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setType(c value) {
            this.type_ = value.getNumber();
            this.bitField0_ |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTypeName(String value) {
            value.getClass();
            this.bitField0_ |= 16;
            this.typeName_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTypeNameBytes(wj1 value) {
            this.typeName_ = value.toStringUtf8();
            this.bitField0_ |= 16;
        }

        @Override // p000.l74.InterfaceC8690t
        public String getDefaultValue() {
            return this.defaultValue_;
        }

        @Override // p000.l74.InterfaceC8690t
        public wj1 getDefaultValueBytes() {
            return wj1.copyFromUtf8(this.defaultValue_);
        }

        @Override // p000.l74.InterfaceC8690t
        public String getExtendee() {
            return this.extendee_;
        }

        @Override // p000.l74.InterfaceC8690t
        public wj1 getExtendeeBytes() {
            return wj1.copyFromUtf8(this.extendee_);
        }

        @Override // p000.l74.InterfaceC8690t
        public String getJsonName() {
            return this.jsonName_;
        }

        @Override // p000.l74.InterfaceC8690t
        public wj1 getJsonNameBytes() {
            return wj1.copyFromUtf8(this.jsonName_);
        }

        @Override // p000.l74.InterfaceC8690t
        public b getLabel() {
            b bVarForNumber = b.forNumber(this.label_);
            return bVarForNumber == null ? b.LABEL_OPTIONAL : bVarForNumber;
        }

        @Override // p000.l74.InterfaceC8690t
        public String getName() {
            return this.name_;
        }

        @Override // p000.l74.InterfaceC8690t
        public wj1 getNameBytes() {
            return wj1.copyFromUtf8(this.name_);
        }

        @Override // p000.l74.InterfaceC8690t
        public int getNumber() {
            return this.number_;
        }

        @Override // p000.l74.InterfaceC8690t
        public int getOneofIndex() {
            return this.oneofIndex_;
        }

        @Override // p000.l74.InterfaceC8690t
        public C8692u getOptions() {
            C8692u c8692u = this.options_;
            return c8692u == null ? C8692u.getDefaultInstance() : c8692u;
        }

        @Override // p000.l74.InterfaceC8690t
        public boolean getProto3Optional() {
            return this.proto3Optional_;
        }

        @Override // p000.l74.InterfaceC8690t
        public c getType() {
            c cVarForNumber = c.forNumber(this.type_);
            return cVarForNumber == null ? c.TYPE_DOUBLE : cVarForNumber;
        }

        @Override // p000.l74.InterfaceC8690t
        public String getTypeName() {
            return this.typeName_;
        }

        @Override // p000.l74.InterfaceC8690t
        public wj1 getTypeNameBytes() {
            return wj1.copyFromUtf8(this.typeName_);
        }

        @Override // p000.l74.InterfaceC8690t
        public boolean hasDefaultValue() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // p000.l74.InterfaceC8690t
        public boolean hasExtendee() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // p000.l74.InterfaceC8690t
        public boolean hasJsonName() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // p000.l74.InterfaceC8690t
        public boolean hasLabel() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // p000.l74.InterfaceC8690t
        public boolean hasName() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // p000.l74.InterfaceC8690t
        public boolean hasNumber() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // p000.l74.InterfaceC8690t
        public boolean hasOneofIndex() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // p000.l74.InterfaceC8690t
        public boolean hasOptions() {
            return (this.bitField0_ & 512) != 0;
        }

        @Override // p000.l74.InterfaceC8690t
        public boolean hasProto3Optional() {
            return (this.bitField0_ & 1024) != 0;
        }

        @Override // p000.l74.InterfaceC8690t
        public boolean hasType() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // p000.l74.InterfaceC8690t
        public boolean hasTypeName() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // p000.u27
        /* JADX INFO: renamed from: q */
        public final Object mo79q(u27.EnumC13331i method, Object arg0, Object arg1) {
            C8652a c8652a = null;
            switch (C8652a.f56391a[method.ordinal()]) {
                case 1:
                    return new C8688s();
                case 2:
                    return new a(c8652a);
                case 3:
                    return u27.m23013P(DEFAULT_INSTANCE, "\u0001\u000b\u0000\u0001\u0001\u0011\u000b\u0000\u0000\u0001\u0001ဈ\u0000\u0002ဈ\u0005\u0003င\u0001\u0004᠌\u0002\u0005᠌\u0003\u0006ဈ\u0004\u0007ဈ\u0006\bᐉ\t\tင\u0007\nဈ\b\u0011ဇ\n", new Object[]{"bitField0_", "name_", "extendee_", "number_", "label_", b.internalGetVerifier(), "type_", c.internalGetVerifier(), "typeName_", "defaultValue_", "options_", "oneofIndex_", "jsonName_", "proto3Optional_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    vhc<C8688s> c13325c = PARSER;
                    if (c13325c == null) {
                        synchronized (C8688s.class) {
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
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    this.memoizedIsInitialized = (byte) (arg0 == null ? 0 : 1);
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public static a newBuilder(C8688s prototype) {
            return DEFAULT_INSTANCE.m23054n(prototype);
        }

        public static C8688s parseDelimitedFrom(InputStream input, yi5 extensionRegistry) throws IOException {
            return (C8688s) u27.m23015S(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static C8688s parseFrom(ByteBuffer data, yi5 extensionRegistry) throws be8 {
            return (C8688s) u27.m23023a0(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static C8688s parseFrom(wj1 data) throws be8 {
            return (C8688s) u27.m23016T(DEFAULT_INSTANCE, data);
        }

        public static C8688s parseFrom(wj1 data, yi5 extensionRegistry) throws be8 {
            return (C8688s) u27.m23017U(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static C8688s parseFrom(byte[] data) throws be8 {
            return (C8688s) u27.m23024b0(DEFAULT_INSTANCE, data);
        }

        public static C8688s parseFrom(byte[] data, yi5 extensionRegistry) throws be8 {
            return (C8688s) u27.m23025c0(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static C8688s parseFrom(InputStream input) throws IOException {
            return (C8688s) u27.m23020X(DEFAULT_INSTANCE, input);
        }

        public static C8688s parseFrom(InputStream input, yi5 extensionRegistry) throws IOException {
            return (C8688s) u27.m23021Y(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static C8688s parseFrom(e72 input) throws IOException {
            return (C8688s) u27.m23018V(DEFAULT_INSTANCE, input);
        }

        public static C8688s parseFrom(e72 input, yi5 extensionRegistry) throws IOException {
            return (C8688s) u27.m23019W(DEFAULT_INSTANCE, input, extensionRegistry);
        }
    }

    /* JADX INFO: renamed from: l74$s0 */
    public static final class C8689s0 extends u27<C8689s0, a> implements InterfaceC8691t0 {
        private static final C8689s0 DEFAULT_INSTANCE;
        public static final int LOCATION_FIELD_NUMBER = 1;
        private static volatile vhc<C8689s0> PARSER;
        private v98.InterfaceC13956l<b> location_ = u27.m23036w();

        /* JADX INFO: renamed from: l74$s0$a */
        public static final class a extends u27.AbstractC13324b<C8689s0, a> implements InterfaceC8691t0 {
            public /* synthetic */ a(C8652a c8652a) {
                this();
            }

            public a addAllLocation(Iterable<? extends b> values) {
                m23058e();
                ((C8689s0) this.f86607b).addAllLocation(values);
                return this;
            }

            public a addLocation(b value) {
                m23058e();
                ((C8689s0) this.f86607b).addLocation(value);
                return this;
            }

            public a clearLocation() {
                m23058e();
                ((C8689s0) this.f86607b).clearLocation();
                return this;
            }

            @Override // p000.l74.InterfaceC8691t0
            public b getLocation(int index) {
                return ((C8689s0) this.f86607b).getLocation(index);
            }

            @Override // p000.l74.InterfaceC8691t0
            public int getLocationCount() {
                return ((C8689s0) this.f86607b).getLocationCount();
            }

            @Override // p000.l74.InterfaceC8691t0
            public List<b> getLocationList() {
                return Collections.unmodifiableList(((C8689s0) this.f86607b).getLocationList());
            }

            public a removeLocation(int index) {
                m23058e();
                ((C8689s0) this.f86607b).removeLocation(index);
                return this;
            }

            public a setLocation(int index, b value) {
                m23058e();
                ((C8689s0) this.f86607b).setLocation(index, value);
                return this;
            }

            private a() {
                super(C8689s0.DEFAULT_INSTANCE);
            }

            public a addLocation(int index, b value) {
                m23058e();
                ((C8689s0) this.f86607b).addLocation(index, value);
                return this;
            }

            public a setLocation(int index, b.a builderForValue) {
                m23058e();
                ((C8689s0) this.f86607b).setLocation(index, builderForValue.build());
                return this;
            }

            public a addLocation(b.a builderForValue) {
                m23058e();
                ((C8689s0) this.f86607b).addLocation(builderForValue.build());
                return this;
            }

            public a addLocation(int index, b.a builderForValue) {
                m23058e();
                ((C8689s0) this.f86607b).addLocation(index, builderForValue.build());
                return this;
            }
        }

        /* JADX INFO: renamed from: l74$s0$b */
        public static final class b extends u27<b, a> implements c {
            private static final b DEFAULT_INSTANCE;
            public static final int LEADING_COMMENTS_FIELD_NUMBER = 3;
            public static final int LEADING_DETACHED_COMMENTS_FIELD_NUMBER = 6;
            private static volatile vhc<b> PARSER = null;
            public static final int PATH_FIELD_NUMBER = 1;
            public static final int SPAN_FIELD_NUMBER = 2;
            public static final int TRAILING_COMMENTS_FIELD_NUMBER = 4;
            private int bitField0_;
            private int pathMemoizedSerializedSize = -1;
            private int spanMemoizedSerializedSize = -1;
            private v98.InterfaceC13951g path_ = u27.m23034u();
            private v98.InterfaceC13951g span_ = u27.m23034u();
            private String leadingComments_ = "";
            private String trailingComments_ = "";
            private v98.InterfaceC13956l<String> leadingDetachedComments_ = u27.m23036w();

            /* JADX INFO: renamed from: l74$s0$b$a */
            public static final class a extends u27.AbstractC13324b<b, a> implements c {
                public /* synthetic */ a(C8652a c8652a) {
                    this();
                }

                public a addAllLeadingDetachedComments(Iterable<String> values) {
                    m23058e();
                    ((b) this.f86607b).addAllLeadingDetachedComments(values);
                    return this;
                }

                public a addAllPath(Iterable<? extends Integer> values) {
                    m23058e();
                    ((b) this.f86607b).addAllPath(values);
                    return this;
                }

                public a addAllSpan(Iterable<? extends Integer> values) {
                    m23058e();
                    ((b) this.f86607b).addAllSpan(values);
                    return this;
                }

                public a addLeadingDetachedComments(String value) {
                    m23058e();
                    ((b) this.f86607b).addLeadingDetachedComments(value);
                    return this;
                }

                public a addLeadingDetachedCommentsBytes(wj1 value) {
                    m23058e();
                    ((b) this.f86607b).addLeadingDetachedCommentsBytes(value);
                    return this;
                }

                public a addPath(int value) {
                    m23058e();
                    ((b) this.f86607b).addPath(value);
                    return this;
                }

                public a addSpan(int value) {
                    m23058e();
                    ((b) this.f86607b).addSpan(value);
                    return this;
                }

                public a clearLeadingComments() {
                    m23058e();
                    ((b) this.f86607b).clearLeadingComments();
                    return this;
                }

                public a clearLeadingDetachedComments() {
                    m23058e();
                    ((b) this.f86607b).clearLeadingDetachedComments();
                    return this;
                }

                public a clearPath() {
                    m23058e();
                    ((b) this.f86607b).clearPath();
                    return this;
                }

                public a clearSpan() {
                    m23058e();
                    ((b) this.f86607b).clearSpan();
                    return this;
                }

                public a clearTrailingComments() {
                    m23058e();
                    ((b) this.f86607b).clearTrailingComments();
                    return this;
                }

                @Override // p000.l74.C8689s0.c
                public String getLeadingComments() {
                    return ((b) this.f86607b).getLeadingComments();
                }

                @Override // p000.l74.C8689s0.c
                public wj1 getLeadingCommentsBytes() {
                    return ((b) this.f86607b).getLeadingCommentsBytes();
                }

                @Override // p000.l74.C8689s0.c
                public String getLeadingDetachedComments(int index) {
                    return ((b) this.f86607b).getLeadingDetachedComments(index);
                }

                @Override // p000.l74.C8689s0.c
                public wj1 getLeadingDetachedCommentsBytes(int index) {
                    return ((b) this.f86607b).getLeadingDetachedCommentsBytes(index);
                }

                @Override // p000.l74.C8689s0.c
                public int getLeadingDetachedCommentsCount() {
                    return ((b) this.f86607b).getLeadingDetachedCommentsCount();
                }

                @Override // p000.l74.C8689s0.c
                public List<String> getLeadingDetachedCommentsList() {
                    return Collections.unmodifiableList(((b) this.f86607b).getLeadingDetachedCommentsList());
                }

                @Override // p000.l74.C8689s0.c
                public int getPath(int index) {
                    return ((b) this.f86607b).getPath(index);
                }

                @Override // p000.l74.C8689s0.c
                public int getPathCount() {
                    return ((b) this.f86607b).getPathCount();
                }

                @Override // p000.l74.C8689s0.c
                public List<Integer> getPathList() {
                    return Collections.unmodifiableList(((b) this.f86607b).getPathList());
                }

                @Override // p000.l74.C8689s0.c
                public int getSpan(int index) {
                    return ((b) this.f86607b).getSpan(index);
                }

                @Override // p000.l74.C8689s0.c
                public int getSpanCount() {
                    return ((b) this.f86607b).getSpanCount();
                }

                @Override // p000.l74.C8689s0.c
                public List<Integer> getSpanList() {
                    return Collections.unmodifiableList(((b) this.f86607b).getSpanList());
                }

                @Override // p000.l74.C8689s0.c
                public String getTrailingComments() {
                    return ((b) this.f86607b).getTrailingComments();
                }

                @Override // p000.l74.C8689s0.c
                public wj1 getTrailingCommentsBytes() {
                    return ((b) this.f86607b).getTrailingCommentsBytes();
                }

                @Override // p000.l74.C8689s0.c
                public boolean hasLeadingComments() {
                    return ((b) this.f86607b).hasLeadingComments();
                }

                @Override // p000.l74.C8689s0.c
                public boolean hasTrailingComments() {
                    return ((b) this.f86607b).hasTrailingComments();
                }

                public a setLeadingComments(String value) {
                    m23058e();
                    ((b) this.f86607b).setLeadingComments(value);
                    return this;
                }

                public a setLeadingCommentsBytes(wj1 value) {
                    m23058e();
                    ((b) this.f86607b).setLeadingCommentsBytes(value);
                    return this;
                }

                public a setLeadingDetachedComments(int index, String value) {
                    m23058e();
                    ((b) this.f86607b).setLeadingDetachedComments(index, value);
                    return this;
                }

                public a setPath(int index, int value) {
                    m23058e();
                    ((b) this.f86607b).setPath(index, value);
                    return this;
                }

                public a setSpan(int index, int value) {
                    m23058e();
                    ((b) this.f86607b).setSpan(index, value);
                    return this;
                }

                public a setTrailingComments(String value) {
                    m23058e();
                    ((b) this.f86607b).setTrailingComments(value);
                    return this;
                }

                public a setTrailingCommentsBytes(wj1 value) {
                    m23058e();
                    ((b) this.f86607b).setTrailingCommentsBytes(value);
                    return this;
                }

                private a() {
                    super(b.DEFAULT_INSTANCE);
                }
            }

            static {
                b bVar = new b();
                DEFAULT_INSTANCE = bVar;
                u27.m23029g0(b.class, bVar);
            }

            private b() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addAllLeadingDetachedComments(Iterable<String> values) {
                ensureLeadingDetachedCommentsIsMutable();
                AbstractC0027a3.m80a(values, this.leadingDetachedComments_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addAllPath(Iterable<? extends Integer> values) {
                ensurePathIsMutable();
                AbstractC0027a3.m80a(values, this.path_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addAllSpan(Iterable<? extends Integer> values) {
                ensureSpanIsMutable();
                AbstractC0027a3.m80a(values, this.span_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addLeadingDetachedComments(String value) {
                value.getClass();
                ensureLeadingDetachedCommentsIsMutable();
                this.leadingDetachedComments_.add(value);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addLeadingDetachedCommentsBytes(wj1 value) {
                ensureLeadingDetachedCommentsIsMutable();
                this.leadingDetachedComments_.add(value.toStringUtf8());
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addPath(int value) {
                ensurePathIsMutable();
                this.path_.addInt(value);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addSpan(int value) {
                ensureSpanIsMutable();
                this.span_.addInt(value);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearLeadingComments() {
                this.bitField0_ &= -2;
                this.leadingComments_ = getDefaultInstance().getLeadingComments();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearLeadingDetachedComments() {
                this.leadingDetachedComments_ = u27.m23036w();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearPath() {
                this.path_ = u27.m23034u();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearSpan() {
                this.span_ = u27.m23034u();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearTrailingComments() {
                this.bitField0_ &= -3;
                this.trailingComments_ = getDefaultInstance().getTrailingComments();
            }

            private void ensureLeadingDetachedCommentsIsMutable() {
                v98.InterfaceC13956l<String> interfaceC13956l = this.leadingDetachedComments_;
                if (interfaceC13956l.isModifiable()) {
                    return;
                }
                this.leadingDetachedComments_ = u27.m23012O(interfaceC13956l);
            }

            private void ensurePathIsMutable() {
                v98.InterfaceC13951g interfaceC13951g = this.path_;
                if (interfaceC13951g.isModifiable()) {
                    return;
                }
                this.path_ = u27.m23010M(interfaceC13951g);
            }

            private void ensureSpanIsMutable() {
                v98.InterfaceC13951g interfaceC13951g = this.span_;
                if (interfaceC13951g.isModifiable()) {
                    return;
                }
                this.span_ = u27.m23010M(interfaceC13951g);
            }

            public static b getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static a newBuilder() {
                return DEFAULT_INSTANCE.m23053m();
            }

            public static b parseDelimitedFrom(InputStream input) throws IOException {
                return (b) u27.m23014R(DEFAULT_INSTANCE, input);
            }

            public static b parseFrom(ByteBuffer data) throws be8 {
                return (b) u27.m23022Z(DEFAULT_INSTANCE, data);
            }

            public static vhc<b> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setLeadingComments(String value) {
                value.getClass();
                this.bitField0_ |= 1;
                this.leadingComments_ = value;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setLeadingCommentsBytes(wj1 value) {
                this.leadingComments_ = value.toStringUtf8();
                this.bitField0_ |= 1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setLeadingDetachedComments(int index, String value) {
                value.getClass();
                ensureLeadingDetachedCommentsIsMutable();
                this.leadingDetachedComments_.set(index, value);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setPath(int index, int value) {
                ensurePathIsMutable();
                this.path_.setInt(index, value);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setSpan(int index, int value) {
                ensureSpanIsMutable();
                this.span_.setInt(index, value);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setTrailingComments(String value) {
                value.getClass();
                this.bitField0_ |= 2;
                this.trailingComments_ = value;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setTrailingCommentsBytes(wj1 value) {
                this.trailingComments_ = value.toStringUtf8();
                this.bitField0_ |= 2;
            }

            @Override // p000.l74.C8689s0.c
            public String getLeadingComments() {
                return this.leadingComments_;
            }

            @Override // p000.l74.C8689s0.c
            public wj1 getLeadingCommentsBytes() {
                return wj1.copyFromUtf8(this.leadingComments_);
            }

            @Override // p000.l74.C8689s0.c
            public String getLeadingDetachedComments(int index) {
                return this.leadingDetachedComments_.get(index);
            }

            @Override // p000.l74.C8689s0.c
            public wj1 getLeadingDetachedCommentsBytes(int index) {
                return wj1.copyFromUtf8(this.leadingDetachedComments_.get(index));
            }

            @Override // p000.l74.C8689s0.c
            public int getLeadingDetachedCommentsCount() {
                return this.leadingDetachedComments_.size();
            }

            @Override // p000.l74.C8689s0.c
            public List<String> getLeadingDetachedCommentsList() {
                return this.leadingDetachedComments_;
            }

            @Override // p000.l74.C8689s0.c
            public int getPath(int index) {
                return this.path_.getInt(index);
            }

            @Override // p000.l74.C8689s0.c
            public int getPathCount() {
                return this.path_.size();
            }

            @Override // p000.l74.C8689s0.c
            public List<Integer> getPathList() {
                return this.path_;
            }

            @Override // p000.l74.C8689s0.c
            public int getSpan(int index) {
                return this.span_.getInt(index);
            }

            @Override // p000.l74.C8689s0.c
            public int getSpanCount() {
                return this.span_.size();
            }

            @Override // p000.l74.C8689s0.c
            public List<Integer> getSpanList() {
                return this.span_;
            }

            @Override // p000.l74.C8689s0.c
            public String getTrailingComments() {
                return this.trailingComments_;
            }

            @Override // p000.l74.C8689s0.c
            public wj1 getTrailingCommentsBytes() {
                return wj1.copyFromUtf8(this.trailingComments_);
            }

            @Override // p000.l74.C8689s0.c
            public boolean hasLeadingComments() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // p000.l74.C8689s0.c
            public boolean hasTrailingComments() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // p000.u27
            /* JADX INFO: renamed from: q */
            public final Object mo79q(u27.EnumC13331i method, Object arg0, Object arg1) {
                C8652a c8652a = null;
                switch (C8652a.f56391a[method.ordinal()]) {
                    case 1:
                        return new b();
                    case 2:
                        return new a(c8652a);
                    case 3:
                        return u27.m23013P(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0003\u0000\u0001'\u0002'\u0003ဈ\u0000\u0004ဈ\u0001\u0006\u001a", new Object[]{"bitField0_", "path_", "span_", "leadingComments_", "trailingComments_", "leadingDetachedComments_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        vhc<b> c13325c = PARSER;
                        if (c13325c == null) {
                            synchronized (b.class) {
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

            public static a newBuilder(b prototype) {
                return DEFAULT_INSTANCE.m23054n(prototype);
            }

            public static b parseDelimitedFrom(InputStream input, yi5 extensionRegistry) throws IOException {
                return (b) u27.m23015S(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static b parseFrom(ByteBuffer data, yi5 extensionRegistry) throws be8 {
                return (b) u27.m23023a0(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static b parseFrom(wj1 data) throws be8 {
                return (b) u27.m23016T(DEFAULT_INSTANCE, data);
            }

            public static b parseFrom(wj1 data, yi5 extensionRegistry) throws be8 {
                return (b) u27.m23017U(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static b parseFrom(byte[] data) throws be8 {
                return (b) u27.m23024b0(DEFAULT_INSTANCE, data);
            }

            public static b parseFrom(byte[] data, yi5 extensionRegistry) throws be8 {
                return (b) u27.m23025c0(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static b parseFrom(InputStream input) throws IOException {
                return (b) u27.m23020X(DEFAULT_INSTANCE, input);
            }

            public static b parseFrom(InputStream input, yi5 extensionRegistry) throws IOException {
                return (b) u27.m23021Y(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static b parseFrom(e72 input) throws IOException {
                return (b) u27.m23018V(DEFAULT_INSTANCE, input);
            }

            public static b parseFrom(e72 input, yi5 extensionRegistry) throws IOException {
                return (b) u27.m23019W(DEFAULT_INSTANCE, input, extensionRegistry);
            }
        }

        /* JADX INFO: renamed from: l74$s0$c */
        public interface c extends ssa {
            String getLeadingComments();

            wj1 getLeadingCommentsBytes();

            String getLeadingDetachedComments(int index);

            wj1 getLeadingDetachedCommentsBytes(int index);

            int getLeadingDetachedCommentsCount();

            List<String> getLeadingDetachedCommentsList();

            int getPath(int index);

            int getPathCount();

            List<Integer> getPathList();

            int getSpan(int index);

            int getSpanCount();

            List<Integer> getSpanList();

            String getTrailingComments();

            wj1 getTrailingCommentsBytes();

            boolean hasLeadingComments();

            boolean hasTrailingComments();
        }

        static {
            C8689s0 c8689s0 = new C8689s0();
            DEFAULT_INSTANCE = c8689s0;
            u27.m23029g0(C8689s0.class, c8689s0);
        }

        private C8689s0() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllLocation(Iterable<? extends b> values) {
            ensureLocationIsMutable();
            AbstractC0027a3.m80a(values, this.location_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addLocation(b value) {
            value.getClass();
            ensureLocationIsMutable();
            this.location_.add(value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLocation() {
            this.location_ = u27.m23036w();
        }

        private void ensureLocationIsMutable() {
            v98.InterfaceC13956l<b> interfaceC13956l = this.location_;
            if (interfaceC13956l.isModifiable()) {
                return;
            }
            this.location_ = u27.m23012O(interfaceC13956l);
        }

        public static C8689s0 getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.m23053m();
        }

        public static C8689s0 parseDelimitedFrom(InputStream input) throws IOException {
            return (C8689s0) u27.m23014R(DEFAULT_INSTANCE, input);
        }

        public static C8689s0 parseFrom(ByteBuffer data) throws be8 {
            return (C8689s0) u27.m23022Z(DEFAULT_INSTANCE, data);
        }

        public static vhc<C8689s0> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeLocation(int index) {
            ensureLocationIsMutable();
            this.location_.remove(index);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLocation(int index, b value) {
            value.getClass();
            ensureLocationIsMutable();
            this.location_.set(index, value);
        }

        @Override // p000.l74.InterfaceC8691t0
        public b getLocation(int index) {
            return this.location_.get(index);
        }

        @Override // p000.l74.InterfaceC8691t0
        public int getLocationCount() {
            return this.location_.size();
        }

        @Override // p000.l74.InterfaceC8691t0
        public List<b> getLocationList() {
            return this.location_;
        }

        public c getLocationOrBuilder(int index) {
            return this.location_.get(index);
        }

        public List<? extends c> getLocationOrBuilderList() {
            return this.location_;
        }

        @Override // p000.u27
        /* JADX INFO: renamed from: q */
        public final Object mo79q(u27.EnumC13331i method, Object arg0, Object arg1) {
            C8652a c8652a = null;
            switch (C8652a.f56391a[method.ordinal()]) {
                case 1:
                    return new C8689s0();
                case 2:
                    return new a(c8652a);
                case 3:
                    return u27.m23013P(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"location_", b.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    vhc<C8689s0> c13325c = PARSER;
                    if (c13325c == null) {
                        synchronized (C8689s0.class) {
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

        public static a newBuilder(C8689s0 prototype) {
            return DEFAULT_INSTANCE.m23054n(prototype);
        }

        public static C8689s0 parseDelimitedFrom(InputStream input, yi5 extensionRegistry) throws IOException {
            return (C8689s0) u27.m23015S(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static C8689s0 parseFrom(ByteBuffer data, yi5 extensionRegistry) throws be8 {
            return (C8689s0) u27.m23023a0(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static C8689s0 parseFrom(wj1 data) throws be8 {
            return (C8689s0) u27.m23016T(DEFAULT_INSTANCE, data);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addLocation(int index, b value) {
            value.getClass();
            ensureLocationIsMutable();
            this.location_.add(index, value);
        }

        public static C8689s0 parseFrom(wj1 data, yi5 extensionRegistry) throws be8 {
            return (C8689s0) u27.m23017U(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static C8689s0 parseFrom(byte[] data) throws be8 {
            return (C8689s0) u27.m23024b0(DEFAULT_INSTANCE, data);
        }

        public static C8689s0 parseFrom(byte[] data, yi5 extensionRegistry) throws be8 {
            return (C8689s0) u27.m23025c0(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static C8689s0 parseFrom(InputStream input) throws IOException {
            return (C8689s0) u27.m23020X(DEFAULT_INSTANCE, input);
        }

        public static C8689s0 parseFrom(InputStream input, yi5 extensionRegistry) throws IOException {
            return (C8689s0) u27.m23021Y(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static C8689s0 parseFrom(e72 input) throws IOException {
            return (C8689s0) u27.m23018V(DEFAULT_INSTANCE, input);
        }

        public static C8689s0 parseFrom(e72 input, yi5 extensionRegistry) throws IOException {
            return (C8689s0) u27.m23019W(DEFAULT_INSTANCE, input, extensionRegistry);
        }
    }

    /* JADX INFO: renamed from: l74$t */
    public interface InterfaceC8690t extends ssa {
        String getDefaultValue();

        wj1 getDefaultValueBytes();

        String getExtendee();

        wj1 getExtendeeBytes();

        String getJsonName();

        wj1 getJsonNameBytes();

        C8688s.b getLabel();

        String getName();

        wj1 getNameBytes();

        int getNumber();

        int getOneofIndex();

        C8692u getOptions();

        boolean getProto3Optional();

        C8688s.c getType();

        String getTypeName();

        wj1 getTypeNameBytes();

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

    /* JADX INFO: renamed from: l74$t0 */
    public interface InterfaceC8691t0 extends ssa {
        C8689s0.b getLocation(int index);

        int getLocationCount();

        List<C8689s0.b> getLocationList();
    }

    /* JADX INFO: renamed from: l74$u */
    public static final class C8692u extends u27.AbstractC13327e<C8692u, b> implements InterfaceC8694v {
        public static final int CTYPE_FIELD_NUMBER = 1;
        public static final int DEBUG_REDACT_FIELD_NUMBER = 16;
        private static final C8692u DEFAULT_INSTANCE;
        public static final int DEPRECATED_FIELD_NUMBER = 3;
        public static final int EDITION_DEFAULTS_FIELD_NUMBER = 20;
        public static final int FEATURES_FIELD_NUMBER = 21;
        public static final int FEATURE_SUPPORT_FIELD_NUMBER = 22;
        public static final int JSTYPE_FIELD_NUMBER = 6;
        public static final int LAZY_FIELD_NUMBER = 5;
        public static final int PACKED_FIELD_NUMBER = 2;
        private static volatile vhc<C8692u> PARSER = null;
        public static final int RETENTION_FIELD_NUMBER = 17;
        public static final int TARGETS_FIELD_NUMBER = 19;
        public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
        public static final int UNVERIFIED_LAZY_FIELD_NUMBER = 15;
        public static final int WEAK_FIELD_NUMBER = 10;
        private static final v98.C13952h.a<j> targets_converter_ = new a();
        private int bitField0_;
        private int ctype_;
        private boolean debugRedact_;
        private boolean deprecated_;
        private f featureSupport_;
        private C8680o features_;
        private int jstype_;
        private boolean lazy_;
        private boolean packed_;
        private int retention_;
        private boolean unverifiedLazy_;
        private boolean weak_;
        private byte memoizedIsInitialized = 2;
        private v98.InterfaceC13951g targets_ = u27.m23034u();
        private v98.InterfaceC13956l<d> editionDefaults_ = u27.m23036w();
        private v98.InterfaceC13956l<C8693u0> uninterpretedOption_ = u27.m23036w();

        /* JADX INFO: renamed from: l74$u$a */
        public class a implements v98.C13952h.a<j> {
            @Override // p000.v98.C13952h.a
            public j convert(int from) {
                j jVarForNumber = j.forNumber(from);
                return jVarForNumber == null ? j.TARGET_TYPE_UNKNOWN : jVarForNumber;
            }
        }

        /* JADX INFO: renamed from: l74$u$b */
        public static final class b extends u27.AbstractC13326d<C8692u, b> implements InterfaceC8694v {
            public /* synthetic */ b(C8652a c8652a) {
                this();
            }

            public b addAllEditionDefaults(Iterable<? extends d> values) {
                m23058e();
                ((C8692u) this.f86607b).addAllEditionDefaults(values);
                return this;
            }

            public b addAllTargets(Iterable<? extends j> values) {
                m23058e();
                ((C8692u) this.f86607b).addAllTargets(values);
                return this;
            }

            public b addAllUninterpretedOption(Iterable<? extends C8693u0> values) {
                m23058e();
                ((C8692u) this.f86607b).addAllUninterpretedOption(values);
                return this;
            }

            public b addEditionDefaults(d value) {
                m23058e();
                ((C8692u) this.f86607b).addEditionDefaults(value);
                return this;
            }

            public b addTargets(j value) {
                m23058e();
                ((C8692u) this.f86607b).addTargets(value);
                return this;
            }

            public b addUninterpretedOption(C8693u0 value) {
                m23058e();
                ((C8692u) this.f86607b).addUninterpretedOption(value);
                return this;
            }

            public b clearCtype() {
                m23058e();
                ((C8692u) this.f86607b).clearCtype();
                return this;
            }

            public b clearDebugRedact() {
                m23058e();
                ((C8692u) this.f86607b).clearDebugRedact();
                return this;
            }

            public b clearDeprecated() {
                m23058e();
                ((C8692u) this.f86607b).clearDeprecated();
                return this;
            }

            public b clearEditionDefaults() {
                m23058e();
                ((C8692u) this.f86607b).clearEditionDefaults();
                return this;
            }

            public b clearFeatureSupport() {
                m23058e();
                ((C8692u) this.f86607b).clearFeatureSupport();
                return this;
            }

            public b clearFeatures() {
                m23058e();
                ((C8692u) this.f86607b).clearFeatures();
                return this;
            }

            public b clearJstype() {
                m23058e();
                ((C8692u) this.f86607b).clearJstype();
                return this;
            }

            public b clearLazy() {
                m23058e();
                ((C8692u) this.f86607b).clearLazy();
                return this;
            }

            public b clearPacked() {
                m23058e();
                ((C8692u) this.f86607b).clearPacked();
                return this;
            }

            public b clearRetention() {
                m23058e();
                ((C8692u) this.f86607b).clearRetention();
                return this;
            }

            public b clearTargets() {
                m23058e();
                ((C8692u) this.f86607b).clearTargets();
                return this;
            }

            public b clearUninterpretedOption() {
                m23058e();
                ((C8692u) this.f86607b).clearUninterpretedOption();
                return this;
            }

            public b clearUnverifiedLazy() {
                m23058e();
                ((C8692u) this.f86607b).clearUnverifiedLazy();
                return this;
            }

            public b clearWeak() {
                m23058e();
                ((C8692u) this.f86607b).clearWeak();
                return this;
            }

            @Override // p000.l74.InterfaceC8694v
            public c getCtype() {
                return ((C8692u) this.f86607b).getCtype();
            }

            @Override // p000.l74.InterfaceC8694v
            public boolean getDebugRedact() {
                return ((C8692u) this.f86607b).getDebugRedact();
            }

            @Override // p000.l74.InterfaceC8694v
            public boolean getDeprecated() {
                return ((C8692u) this.f86607b).getDeprecated();
            }

            @Override // p000.l74.InterfaceC8694v
            public d getEditionDefaults(int index) {
                return ((C8692u) this.f86607b).getEditionDefaults(index);
            }

            @Override // p000.l74.InterfaceC8694v
            public int getEditionDefaultsCount() {
                return ((C8692u) this.f86607b).getEditionDefaultsCount();
            }

            @Override // p000.l74.InterfaceC8694v
            public List<d> getEditionDefaultsList() {
                return Collections.unmodifiableList(((C8692u) this.f86607b).getEditionDefaultsList());
            }

            @Override // p000.l74.InterfaceC8694v
            public f getFeatureSupport() {
                return ((C8692u) this.f86607b).getFeatureSupport();
            }

            @Override // p000.l74.InterfaceC8694v
            public C8680o getFeatures() {
                return ((C8692u) this.f86607b).getFeatures();
            }

            @Override // p000.l74.InterfaceC8694v
            public h getJstype() {
                return ((C8692u) this.f86607b).getJstype();
            }

            @Override // p000.l74.InterfaceC8694v
            public boolean getLazy() {
                return ((C8692u) this.f86607b).getLazy();
            }

            @Override // p000.l74.InterfaceC8694v
            public boolean getPacked() {
                return ((C8692u) this.f86607b).getPacked();
            }

            @Override // p000.l74.InterfaceC8694v
            public i getRetention() {
                return ((C8692u) this.f86607b).getRetention();
            }

            @Override // p000.l74.InterfaceC8694v
            public j getTargets(int index) {
                return ((C8692u) this.f86607b).getTargets(index);
            }

            @Override // p000.l74.InterfaceC8694v
            public int getTargetsCount() {
                return ((C8692u) this.f86607b).getTargetsCount();
            }

            @Override // p000.l74.InterfaceC8694v
            public List<j> getTargetsList() {
                return ((C8692u) this.f86607b).getTargetsList();
            }

            @Override // p000.l74.InterfaceC8694v
            public C8693u0 getUninterpretedOption(int index) {
                return ((C8692u) this.f86607b).getUninterpretedOption(index);
            }

            @Override // p000.l74.InterfaceC8694v
            public int getUninterpretedOptionCount() {
                return ((C8692u) this.f86607b).getUninterpretedOptionCount();
            }

            @Override // p000.l74.InterfaceC8694v
            public List<C8693u0> getUninterpretedOptionList() {
                return Collections.unmodifiableList(((C8692u) this.f86607b).getUninterpretedOptionList());
            }

            @Override // p000.l74.InterfaceC8694v
            public boolean getUnverifiedLazy() {
                return ((C8692u) this.f86607b).getUnverifiedLazy();
            }

            @Override // p000.l74.InterfaceC8694v
            public boolean getWeak() {
                return ((C8692u) this.f86607b).getWeak();
            }

            @Override // p000.l74.InterfaceC8694v
            public boolean hasCtype() {
                return ((C8692u) this.f86607b).hasCtype();
            }

            @Override // p000.l74.InterfaceC8694v
            public boolean hasDebugRedact() {
                return ((C8692u) this.f86607b).hasDebugRedact();
            }

            @Override // p000.l74.InterfaceC8694v
            public boolean hasDeprecated() {
                return ((C8692u) this.f86607b).hasDeprecated();
            }

            @Override // p000.l74.InterfaceC8694v
            public boolean hasFeatureSupport() {
                return ((C8692u) this.f86607b).hasFeatureSupport();
            }

            @Override // p000.l74.InterfaceC8694v
            public boolean hasFeatures() {
                return ((C8692u) this.f86607b).hasFeatures();
            }

            @Override // p000.l74.InterfaceC8694v
            public boolean hasJstype() {
                return ((C8692u) this.f86607b).hasJstype();
            }

            @Override // p000.l74.InterfaceC8694v
            public boolean hasLazy() {
                return ((C8692u) this.f86607b).hasLazy();
            }

            @Override // p000.l74.InterfaceC8694v
            public boolean hasPacked() {
                return ((C8692u) this.f86607b).hasPacked();
            }

            @Override // p000.l74.InterfaceC8694v
            public boolean hasRetention() {
                return ((C8692u) this.f86607b).hasRetention();
            }

            @Override // p000.l74.InterfaceC8694v
            public boolean hasUnverifiedLazy() {
                return ((C8692u) this.f86607b).hasUnverifiedLazy();
            }

            @Override // p000.l74.InterfaceC8694v
            public boolean hasWeak() {
                return ((C8692u) this.f86607b).hasWeak();
            }

            public b mergeFeatureSupport(f value) {
                m23058e();
                ((C8692u) this.f86607b).mergeFeatureSupport(value);
                return this;
            }

            public b mergeFeatures(C8680o value) {
                m23058e();
                ((C8692u) this.f86607b).mergeFeatures(value);
                return this;
            }

            public b removeEditionDefaults(int index) {
                m23058e();
                ((C8692u) this.f86607b).removeEditionDefaults(index);
                return this;
            }

            public b removeUninterpretedOption(int index) {
                m23058e();
                ((C8692u) this.f86607b).removeUninterpretedOption(index);
                return this;
            }

            public b setCtype(c value) {
                m23058e();
                ((C8692u) this.f86607b).setCtype(value);
                return this;
            }

            public b setDebugRedact(boolean value) {
                m23058e();
                ((C8692u) this.f86607b).setDebugRedact(value);
                return this;
            }

            public b setDeprecated(boolean value) {
                m23058e();
                ((C8692u) this.f86607b).setDeprecated(value);
                return this;
            }

            public b setEditionDefaults(int index, d value) {
                m23058e();
                ((C8692u) this.f86607b).setEditionDefaults(index, value);
                return this;
            }

            public b setFeatureSupport(f value) {
                m23058e();
                ((C8692u) this.f86607b).setFeatureSupport(value);
                return this;
            }

            public b setFeatures(C8680o value) {
                m23058e();
                ((C8692u) this.f86607b).setFeatures(value);
                return this;
            }

            public b setJstype(h value) {
                m23058e();
                ((C8692u) this.f86607b).setJstype(value);
                return this;
            }

            public b setLazy(boolean value) {
                m23058e();
                ((C8692u) this.f86607b).setLazy(value);
                return this;
            }

            public b setPacked(boolean value) {
                m23058e();
                ((C8692u) this.f86607b).setPacked(value);
                return this;
            }

            public b setRetention(i value) {
                m23058e();
                ((C8692u) this.f86607b).setRetention(value);
                return this;
            }

            public b setTargets(int index, j value) {
                m23058e();
                ((C8692u) this.f86607b).setTargets(index, value);
                return this;
            }

            public b setUninterpretedOption(int index, C8693u0 value) {
                m23058e();
                ((C8692u) this.f86607b).setUninterpretedOption(index, value);
                return this;
            }

            public b setUnverifiedLazy(boolean value) {
                m23058e();
                ((C8692u) this.f86607b).setUnverifiedLazy(value);
                return this;
            }

            public b setWeak(boolean value) {
                m23058e();
                ((C8692u) this.f86607b).setWeak(value);
                return this;
            }

            private b() {
                super(C8692u.DEFAULT_INSTANCE);
            }

            public b addEditionDefaults(int index, d value) {
                m23058e();
                ((C8692u) this.f86607b).addEditionDefaults(index, value);
                return this;
            }

            public b addUninterpretedOption(int index, C8693u0 value) {
                m23058e();
                ((C8692u) this.f86607b).addUninterpretedOption(index, value);
                return this;
            }

            public b setEditionDefaults(int index, d.a builderForValue) {
                m23058e();
                ((C8692u) this.f86607b).setEditionDefaults(index, builderForValue.build());
                return this;
            }

            public b setFeatureSupport(f.a builderForValue) {
                m23058e();
                ((C8692u) this.f86607b).setFeatureSupport(builderForValue.build());
                return this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public b setFeatures(C8680o.a builderForValue) {
                m23058e();
                ((C8692u) this.f86607b).setFeatures((C8680o) builderForValue.build());
                return this;
            }

            public b setUninterpretedOption(int index, C8693u0.a builderForValue) {
                m23058e();
                ((C8692u) this.f86607b).setUninterpretedOption(index, builderForValue.build());
                return this;
            }

            public b addEditionDefaults(d.a builderForValue) {
                m23058e();
                ((C8692u) this.f86607b).addEditionDefaults(builderForValue.build());
                return this;
            }

            public b addUninterpretedOption(C8693u0.a builderForValue) {
                m23058e();
                ((C8692u) this.f86607b).addUninterpretedOption(builderForValue.build());
                return this;
            }

            public b addEditionDefaults(int index, d.a builderForValue) {
                m23058e();
                ((C8692u) this.f86607b).addEditionDefaults(index, builderForValue.build());
                return this;
            }

            public b addUninterpretedOption(int index, C8693u0.a builderForValue) {
                m23058e();
                ((C8692u) this.f86607b).addUninterpretedOption(index, builderForValue.build());
                return this;
            }
        }

        /* JADX INFO: renamed from: l74$u$c */
        public enum c implements v98.InterfaceC13947c {
            STRING(0),
            CORD(1),
            STRING_PIECE(2);


            /* JADX INFO: renamed from: C */
            public static final v98.InterfaceC13948d<c> f56570C = new a();

            /* JADX INFO: renamed from: e */
            public static final int f56575e = 0;

            /* JADX INFO: renamed from: f */
            public static final int f56576f = 1;

            /* JADX INFO: renamed from: m */
            public static final int f56577m = 2;

            /* JADX INFO: renamed from: a */
            public final int f56578a;

            /* JADX INFO: renamed from: l74$u$c$a */
            public class a implements v98.InterfaceC13948d<c> {
                @Override // p000.v98.InterfaceC13948d
                public c findValueByNumber(int number) {
                    return c.forNumber(number);
                }
            }

            /* JADX INFO: renamed from: l74$u$c$b */
            public static final class b implements v98.InterfaceC13949e {

                /* JADX INFO: renamed from: a */
                public static final v98.InterfaceC13949e f56579a = new b();

                private b() {
                }

                @Override // p000.v98.InterfaceC13949e
                public boolean isInRange(int number) {
                    return c.forNumber(number) != null;
                }
            }

            c(int value) {
                this.f56578a = value;
            }

            public static c forNumber(int value) {
                if (value == 0) {
                    return STRING;
                }
                if (value == 1) {
                    return CORD;
                }
                if (value != 2) {
                    return null;
                }
                return STRING_PIECE;
            }

            public static v98.InterfaceC13948d<c> internalGetValueMap() {
                return f56570C;
            }

            public static v98.InterfaceC13949e internalGetVerifier() {
                return b.f56579a;
            }

            @Override // p000.v98.InterfaceC13947c
            public final int getNumber() {
                return this.f56578a;
            }

            @Deprecated
            public static c valueOf(int value) {
                return forNumber(value);
            }
        }

        /* JADX INFO: renamed from: l74$u$d */
        public static final class d extends u27<d, a> implements e {
            private static final d DEFAULT_INSTANCE;
            public static final int EDITION_FIELD_NUMBER = 3;
            private static volatile vhc<d> PARSER = null;
            public static final int VALUE_FIELD_NUMBER = 2;
            private int bitField0_;
            private int edition_;
            private String value_ = "";

            /* JADX INFO: renamed from: l74$u$d$a */
            public static final class a extends u27.AbstractC13324b<d, a> implements e {
                public /* synthetic */ a(C8652a c8652a) {
                    this();
                }

                public a clearEdition() {
                    m23058e();
                    ((d) this.f86607b).clearEdition();
                    return this;
                }

                public a clearValue() {
                    m23058e();
                    ((d) this.f86607b).clearValue();
                    return this;
                }

                @Override // p000.l74.C8692u.e
                public EnumC8658d getEdition() {
                    return ((d) this.f86607b).getEdition();
                }

                @Override // p000.l74.C8692u.e
                public String getValue() {
                    return ((d) this.f86607b).getValue();
                }

                @Override // p000.l74.C8692u.e
                public wj1 getValueBytes() {
                    return ((d) this.f86607b).getValueBytes();
                }

                @Override // p000.l74.C8692u.e
                public boolean hasEdition() {
                    return ((d) this.f86607b).hasEdition();
                }

                @Override // p000.l74.C8692u.e
                public boolean hasValue() {
                    return ((d) this.f86607b).hasValue();
                }

                public a setEdition(EnumC8658d value) {
                    m23058e();
                    ((d) this.f86607b).setEdition(value);
                    return this;
                }

                public a setValue(String value) {
                    m23058e();
                    ((d) this.f86607b).setValue(value);
                    return this;
                }

                public a setValueBytes(wj1 value) {
                    m23058e();
                    ((d) this.f86607b).setValueBytes(value);
                    return this;
                }

                private a() {
                    super(d.DEFAULT_INSTANCE);
                }
            }

            static {
                d dVar = new d();
                DEFAULT_INSTANCE = dVar;
                u27.m23029g0(d.class, dVar);
            }

            private d() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearEdition() {
                this.bitField0_ &= -2;
                this.edition_ = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearValue() {
                this.bitField0_ &= -3;
                this.value_ = getDefaultInstance().getValue();
            }

            public static d getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static a newBuilder() {
                return DEFAULT_INSTANCE.m23053m();
            }

            public static d parseDelimitedFrom(InputStream input) throws IOException {
                return (d) u27.m23014R(DEFAULT_INSTANCE, input);
            }

            public static d parseFrom(ByteBuffer data) throws be8 {
                return (d) u27.m23022Z(DEFAULT_INSTANCE, data);
            }

            public static vhc<d> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setEdition(EnumC8658d value) {
                this.edition_ = value.getNumber();
                this.bitField0_ |= 1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setValue(String value) {
                value.getClass();
                this.bitField0_ |= 2;
                this.value_ = value;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setValueBytes(wj1 value) {
                this.value_ = value.toStringUtf8();
                this.bitField0_ |= 2;
            }

            @Override // p000.l74.C8692u.e
            public EnumC8658d getEdition() {
                EnumC8658d enumC8658dForNumber = EnumC8658d.forNumber(this.edition_);
                return enumC8658dForNumber == null ? EnumC8658d.EDITION_UNKNOWN : enumC8658dForNumber;
            }

            @Override // p000.l74.C8692u.e
            public String getValue() {
                return this.value_;
            }

            @Override // p000.l74.C8692u.e
            public wj1 getValueBytes() {
                return wj1.copyFromUtf8(this.value_);
            }

            @Override // p000.l74.C8692u.e
            public boolean hasEdition() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // p000.l74.C8692u.e
            public boolean hasValue() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // p000.u27
            /* JADX INFO: renamed from: q */
            public final Object mo79q(u27.EnumC13331i method, Object arg0, Object arg1) {
                C8652a c8652a = null;
                switch (C8652a.f56391a[method.ordinal()]) {
                    case 1:
                        return new d();
                    case 2:
                        return new a(c8652a);
                    case 3:
                        return u27.m23013P(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဈ\u0001\u0003᠌\u0000", new Object[]{"bitField0_", "value_", "edition_", EnumC8658d.internalGetVerifier()});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        vhc<d> c13325c = PARSER;
                        if (c13325c == null) {
                            synchronized (d.class) {
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

            public static a newBuilder(d prototype) {
                return DEFAULT_INSTANCE.m23054n(prototype);
            }

            public static d parseDelimitedFrom(InputStream input, yi5 extensionRegistry) throws IOException {
                return (d) u27.m23015S(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static d parseFrom(ByteBuffer data, yi5 extensionRegistry) throws be8 {
                return (d) u27.m23023a0(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static d parseFrom(wj1 data) throws be8 {
                return (d) u27.m23016T(DEFAULT_INSTANCE, data);
            }

            public static d parseFrom(wj1 data, yi5 extensionRegistry) throws be8 {
                return (d) u27.m23017U(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static d parseFrom(byte[] data) throws be8 {
                return (d) u27.m23024b0(DEFAULT_INSTANCE, data);
            }

            public static d parseFrom(byte[] data, yi5 extensionRegistry) throws be8 {
                return (d) u27.m23025c0(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static d parseFrom(InputStream input) throws IOException {
                return (d) u27.m23020X(DEFAULT_INSTANCE, input);
            }

            public static d parseFrom(InputStream input, yi5 extensionRegistry) throws IOException {
                return (d) u27.m23021Y(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static d parseFrom(e72 input) throws IOException {
                return (d) u27.m23018V(DEFAULT_INSTANCE, input);
            }

            public static d parseFrom(e72 input, yi5 extensionRegistry) throws IOException {
                return (d) u27.m23019W(DEFAULT_INSTANCE, input, extensionRegistry);
            }
        }

        /* JADX INFO: renamed from: l74$u$e */
        public interface e extends ssa {
            EnumC8658d getEdition();

            String getValue();

            wj1 getValueBytes();

            boolean hasEdition();

            boolean hasValue();
        }

        /* JADX INFO: renamed from: l74$u$f */
        public static final class f extends u27<f, a> implements g {
            private static final f DEFAULT_INSTANCE;
            public static final int DEPRECATION_WARNING_FIELD_NUMBER = 3;
            public static final int EDITION_DEPRECATED_FIELD_NUMBER = 2;
            public static final int EDITION_INTRODUCED_FIELD_NUMBER = 1;
            public static final int EDITION_REMOVED_FIELD_NUMBER = 4;
            private static volatile vhc<f> PARSER;
            private int bitField0_;
            private String deprecationWarning_ = "";
            private int editionDeprecated_;
            private int editionIntroduced_;
            private int editionRemoved_;

            /* JADX INFO: renamed from: l74$u$f$a */
            public static final class a extends u27.AbstractC13324b<f, a> implements g {
                public /* synthetic */ a(C8652a c8652a) {
                    this();
                }

                public a clearDeprecationWarning() {
                    m23058e();
                    ((f) this.f86607b).clearDeprecationWarning();
                    return this;
                }

                public a clearEditionDeprecated() {
                    m23058e();
                    ((f) this.f86607b).clearEditionDeprecated();
                    return this;
                }

                public a clearEditionIntroduced() {
                    m23058e();
                    ((f) this.f86607b).clearEditionIntroduced();
                    return this;
                }

                public a clearEditionRemoved() {
                    m23058e();
                    ((f) this.f86607b).clearEditionRemoved();
                    return this;
                }

                @Override // p000.l74.C8692u.g
                public String getDeprecationWarning() {
                    return ((f) this.f86607b).getDeprecationWarning();
                }

                @Override // p000.l74.C8692u.g
                public wj1 getDeprecationWarningBytes() {
                    return ((f) this.f86607b).getDeprecationWarningBytes();
                }

                @Override // p000.l74.C8692u.g
                public EnumC8658d getEditionDeprecated() {
                    return ((f) this.f86607b).getEditionDeprecated();
                }

                @Override // p000.l74.C8692u.g
                public EnumC8658d getEditionIntroduced() {
                    return ((f) this.f86607b).getEditionIntroduced();
                }

                @Override // p000.l74.C8692u.g
                public EnumC8658d getEditionRemoved() {
                    return ((f) this.f86607b).getEditionRemoved();
                }

                @Override // p000.l74.C8692u.g
                public boolean hasDeprecationWarning() {
                    return ((f) this.f86607b).hasDeprecationWarning();
                }

                @Override // p000.l74.C8692u.g
                public boolean hasEditionDeprecated() {
                    return ((f) this.f86607b).hasEditionDeprecated();
                }

                @Override // p000.l74.C8692u.g
                public boolean hasEditionIntroduced() {
                    return ((f) this.f86607b).hasEditionIntroduced();
                }

                @Override // p000.l74.C8692u.g
                public boolean hasEditionRemoved() {
                    return ((f) this.f86607b).hasEditionRemoved();
                }

                public a setDeprecationWarning(String value) {
                    m23058e();
                    ((f) this.f86607b).setDeprecationWarning(value);
                    return this;
                }

                public a setDeprecationWarningBytes(wj1 value) {
                    m23058e();
                    ((f) this.f86607b).setDeprecationWarningBytes(value);
                    return this;
                }

                public a setEditionDeprecated(EnumC8658d value) {
                    m23058e();
                    ((f) this.f86607b).setEditionDeprecated(value);
                    return this;
                }

                public a setEditionIntroduced(EnumC8658d value) {
                    m23058e();
                    ((f) this.f86607b).setEditionIntroduced(value);
                    return this;
                }

                public a setEditionRemoved(EnumC8658d value) {
                    m23058e();
                    ((f) this.f86607b).setEditionRemoved(value);
                    return this;
                }

                private a() {
                    super(f.DEFAULT_INSTANCE);
                }
            }

            static {
                f fVar = new f();
                DEFAULT_INSTANCE = fVar;
                u27.m23029g0(f.class, fVar);
            }

            private f() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearDeprecationWarning() {
                this.bitField0_ &= -5;
                this.deprecationWarning_ = getDefaultInstance().getDeprecationWarning();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearEditionDeprecated() {
                this.bitField0_ &= -3;
                this.editionDeprecated_ = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearEditionIntroduced() {
                this.bitField0_ &= -2;
                this.editionIntroduced_ = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearEditionRemoved() {
                this.bitField0_ &= -9;
                this.editionRemoved_ = 0;
            }

            public static f getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static a newBuilder() {
                return DEFAULT_INSTANCE.m23053m();
            }

            public static f parseDelimitedFrom(InputStream input) throws IOException {
                return (f) u27.m23014R(DEFAULT_INSTANCE, input);
            }

            public static f parseFrom(ByteBuffer data) throws be8 {
                return (f) u27.m23022Z(DEFAULT_INSTANCE, data);
            }

            public static vhc<f> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setDeprecationWarning(String value) {
                value.getClass();
                this.bitField0_ |= 4;
                this.deprecationWarning_ = value;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setDeprecationWarningBytes(wj1 value) {
                this.deprecationWarning_ = value.toStringUtf8();
                this.bitField0_ |= 4;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setEditionDeprecated(EnumC8658d value) {
                this.editionDeprecated_ = value.getNumber();
                this.bitField0_ |= 2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setEditionIntroduced(EnumC8658d value) {
                this.editionIntroduced_ = value.getNumber();
                this.bitField0_ |= 1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setEditionRemoved(EnumC8658d value) {
                this.editionRemoved_ = value.getNumber();
                this.bitField0_ |= 8;
            }

            @Override // p000.l74.C8692u.g
            public String getDeprecationWarning() {
                return this.deprecationWarning_;
            }

            @Override // p000.l74.C8692u.g
            public wj1 getDeprecationWarningBytes() {
                return wj1.copyFromUtf8(this.deprecationWarning_);
            }

            @Override // p000.l74.C8692u.g
            public EnumC8658d getEditionDeprecated() {
                EnumC8658d enumC8658dForNumber = EnumC8658d.forNumber(this.editionDeprecated_);
                return enumC8658dForNumber == null ? EnumC8658d.EDITION_UNKNOWN : enumC8658dForNumber;
            }

            @Override // p000.l74.C8692u.g
            public EnumC8658d getEditionIntroduced() {
                EnumC8658d enumC8658dForNumber = EnumC8658d.forNumber(this.editionIntroduced_);
                return enumC8658dForNumber == null ? EnumC8658d.EDITION_UNKNOWN : enumC8658dForNumber;
            }

            @Override // p000.l74.C8692u.g
            public EnumC8658d getEditionRemoved() {
                EnumC8658d enumC8658dForNumber = EnumC8658d.forNumber(this.editionRemoved_);
                return enumC8658dForNumber == null ? EnumC8658d.EDITION_UNKNOWN : enumC8658dForNumber;
            }

            @Override // p000.l74.C8692u.g
            public boolean hasDeprecationWarning() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // p000.l74.C8692u.g
            public boolean hasEditionDeprecated() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // p000.l74.C8692u.g
            public boolean hasEditionIntroduced() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // p000.l74.C8692u.g
            public boolean hasEditionRemoved() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // p000.u27
            /* JADX INFO: renamed from: q */
            public final Object mo79q(u27.EnumC13331i method, Object arg0, Object arg1) {
                C8652a c8652a = null;
                switch (C8652a.f56391a[method.ordinal()]) {
                    case 1:
                        return new f();
                    case 2:
                        return new a(c8652a);
                    case 3:
                        return u27.m23013P(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003ဈ\u0002\u0004᠌\u0003", new Object[]{"bitField0_", "editionIntroduced_", EnumC8658d.internalGetVerifier(), "editionDeprecated_", EnumC8658d.internalGetVerifier(), "deprecationWarning_", "editionRemoved_", EnumC8658d.internalGetVerifier()});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        vhc<f> c13325c = PARSER;
                        if (c13325c == null) {
                            synchronized (f.class) {
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

            public static a newBuilder(f prototype) {
                return DEFAULT_INSTANCE.m23054n(prototype);
            }

            public static f parseDelimitedFrom(InputStream input, yi5 extensionRegistry) throws IOException {
                return (f) u27.m23015S(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static f parseFrom(ByteBuffer data, yi5 extensionRegistry) throws be8 {
                return (f) u27.m23023a0(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static f parseFrom(wj1 data) throws be8 {
                return (f) u27.m23016T(DEFAULT_INSTANCE, data);
            }

            public static f parseFrom(wj1 data, yi5 extensionRegistry) throws be8 {
                return (f) u27.m23017U(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static f parseFrom(byte[] data) throws be8 {
                return (f) u27.m23024b0(DEFAULT_INSTANCE, data);
            }

            public static f parseFrom(byte[] data, yi5 extensionRegistry) throws be8 {
                return (f) u27.m23025c0(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static f parseFrom(InputStream input) throws IOException {
                return (f) u27.m23020X(DEFAULT_INSTANCE, input);
            }

            public static f parseFrom(InputStream input, yi5 extensionRegistry) throws IOException {
                return (f) u27.m23021Y(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static f parseFrom(e72 input) throws IOException {
                return (f) u27.m23018V(DEFAULT_INSTANCE, input);
            }

            public static f parseFrom(e72 input, yi5 extensionRegistry) throws IOException {
                return (f) u27.m23019W(DEFAULT_INSTANCE, input, extensionRegistry);
            }
        }

        /* JADX INFO: renamed from: l74$u$g */
        public interface g extends ssa {
            String getDeprecationWarning();

            wj1 getDeprecationWarningBytes();

            EnumC8658d getEditionDeprecated();

            EnumC8658d getEditionIntroduced();

            EnumC8658d getEditionRemoved();

            boolean hasDeprecationWarning();

            boolean hasEditionDeprecated();

            boolean hasEditionIntroduced();

            boolean hasEditionRemoved();
        }

        /* JADX INFO: renamed from: l74$u$h */
        public enum h implements v98.InterfaceC13947c {
            JS_NORMAL(0),
            JS_STRING(1),
            JS_NUMBER(2);


            /* JADX INFO: renamed from: C */
            public static final v98.InterfaceC13948d<h> f56580C = new a();

            /* JADX INFO: renamed from: e */
            public static final int f56585e = 0;

            /* JADX INFO: renamed from: f */
            public static final int f56586f = 1;

            /* JADX INFO: renamed from: m */
            public static final int f56587m = 2;

            /* JADX INFO: renamed from: a */
            public final int f56588a;

            /* JADX INFO: renamed from: l74$u$h$a */
            public class a implements v98.InterfaceC13948d<h> {
                @Override // p000.v98.InterfaceC13948d
                public h findValueByNumber(int number) {
                    return h.forNumber(number);
                }
            }

            /* JADX INFO: renamed from: l74$u$h$b */
            public static final class b implements v98.InterfaceC13949e {

                /* JADX INFO: renamed from: a */
                public static final v98.InterfaceC13949e f56589a = new b();

                private b() {
                }

                @Override // p000.v98.InterfaceC13949e
                public boolean isInRange(int number) {
                    return h.forNumber(number) != null;
                }
            }

            h(int value) {
                this.f56588a = value;
            }

            public static h forNumber(int value) {
                if (value == 0) {
                    return JS_NORMAL;
                }
                if (value == 1) {
                    return JS_STRING;
                }
                if (value != 2) {
                    return null;
                }
                return JS_NUMBER;
            }

            public static v98.InterfaceC13948d<h> internalGetValueMap() {
                return f56580C;
            }

            public static v98.InterfaceC13949e internalGetVerifier() {
                return b.f56589a;
            }

            @Override // p000.v98.InterfaceC13947c
            public final int getNumber() {
                return this.f56588a;
            }

            @Deprecated
            public static h valueOf(int value) {
                return forNumber(value);
            }
        }

        /* JADX INFO: renamed from: l74$u$i */
        public enum i implements v98.InterfaceC13947c {
            RETENTION_UNKNOWN(0),
            RETENTION_RUNTIME(1),
            RETENTION_SOURCE(2);


            /* JADX INFO: renamed from: C */
            public static final v98.InterfaceC13948d<i> f56590C = new a();

            /* JADX INFO: renamed from: e */
            public static final int f56595e = 0;

            /* JADX INFO: renamed from: f */
            public static final int f56596f = 1;

            /* JADX INFO: renamed from: m */
            public static final int f56597m = 2;

            /* JADX INFO: renamed from: a */
            public final int f56598a;

            /* JADX INFO: renamed from: l74$u$i$a */
            public class a implements v98.InterfaceC13948d<i> {
                @Override // p000.v98.InterfaceC13948d
                public i findValueByNumber(int number) {
                    return i.forNumber(number);
                }
            }

            /* JADX INFO: renamed from: l74$u$i$b */
            public static final class b implements v98.InterfaceC13949e {

                /* JADX INFO: renamed from: a */
                public static final v98.InterfaceC13949e f56599a = new b();

                private b() {
                }

                @Override // p000.v98.InterfaceC13949e
                public boolean isInRange(int number) {
                    return i.forNumber(number) != null;
                }
            }

            i(int value) {
                this.f56598a = value;
            }

            public static i forNumber(int value) {
                if (value == 0) {
                    return RETENTION_UNKNOWN;
                }
                if (value == 1) {
                    return RETENTION_RUNTIME;
                }
                if (value != 2) {
                    return null;
                }
                return RETENTION_SOURCE;
            }

            public static v98.InterfaceC13948d<i> internalGetValueMap() {
                return f56590C;
            }

            public static v98.InterfaceC13949e internalGetVerifier() {
                return b.f56599a;
            }

            @Override // p000.v98.InterfaceC13947c
            public final int getNumber() {
                return this.f56598a;
            }

            @Deprecated
            public static i valueOf(int value) {
                return forNumber(value);
            }
        }

        /* JADX INFO: renamed from: l74$u$j */
        public enum j implements v98.InterfaceC13947c {
            TARGET_TYPE_UNKNOWN(0),
            TARGET_TYPE_FILE(1),
            TARGET_TYPE_EXTENSION_RANGE(2),
            TARGET_TYPE_MESSAGE(3),
            TARGET_TYPE_FIELD(4),
            TARGET_TYPE_ONEOF(5),
            TARGET_TYPE_ENUM(6),
            TARGET_TYPE_ENUM_ENTRY(7),
            TARGET_TYPE_SERVICE(8),
            TARGET_TYPE_METHOD(9);


            /* JADX INFO: renamed from: M */
            public static final int f56604M = 0;

            /* JADX INFO: renamed from: M1 */
            public static final int f56605M1 = 6;

            /* JADX INFO: renamed from: N */
            public static final int f56606N = 1;

            /* JADX INFO: renamed from: Q */
            public static final int f56607Q = 2;

            /* JADX INFO: renamed from: V1 */
            public static final int f56608V1 = 7;

            /* JADX INFO: renamed from: X */
            public static final int f56609X = 3;

            /* JADX INFO: renamed from: Y */
            public static final int f56610Y = 4;

            /* JADX INFO: renamed from: Z */
            public static final int f56611Z = 5;

            /* JADX INFO: renamed from: Z1 */
            public static final int f56612Z1 = 8;

            /* JADX INFO: renamed from: a2 */
            public static final int f56613a2 = 9;

            /* JADX INFO: renamed from: b2 */
            public static final v98.InterfaceC13948d<j> f56615b2 = new a();

            /* JADX INFO: renamed from: a */
            public final int f56622a;

            /* JADX INFO: renamed from: l74$u$j$a */
            public class a implements v98.InterfaceC13948d<j> {
                @Override // p000.v98.InterfaceC13948d
                public j findValueByNumber(int number) {
                    return j.forNumber(number);
                }
            }

            /* JADX INFO: renamed from: l74$u$j$b */
            public static final class b implements v98.InterfaceC13949e {

                /* JADX INFO: renamed from: a */
                public static final v98.InterfaceC13949e f56623a = new b();

                private b() {
                }

                @Override // p000.v98.InterfaceC13949e
                public boolean isInRange(int number) {
                    return j.forNumber(number) != null;
                }
            }

            j(int value) {
                this.f56622a = value;
            }

            public static j forNumber(int value) {
                switch (value) {
                    case 0:
                        return TARGET_TYPE_UNKNOWN;
                    case 1:
                        return TARGET_TYPE_FILE;
                    case 2:
                        return TARGET_TYPE_EXTENSION_RANGE;
                    case 3:
                        return TARGET_TYPE_MESSAGE;
                    case 4:
                        return TARGET_TYPE_FIELD;
                    case 5:
                        return TARGET_TYPE_ONEOF;
                    case 6:
                        return TARGET_TYPE_ENUM;
                    case 7:
                        return TARGET_TYPE_ENUM_ENTRY;
                    case 8:
                        return TARGET_TYPE_SERVICE;
                    case 9:
                        return TARGET_TYPE_METHOD;
                    default:
                        return null;
                }
            }

            public static v98.InterfaceC13948d<j> internalGetValueMap() {
                return f56615b2;
            }

            public static v98.InterfaceC13949e internalGetVerifier() {
                return b.f56623a;
            }

            @Override // p000.v98.InterfaceC13947c
            public final int getNumber() {
                return this.f56622a;
            }

            @Deprecated
            public static j valueOf(int value) {
                return forNumber(value);
            }
        }

        static {
            C8692u c8692u = new C8692u();
            DEFAULT_INSTANCE = c8692u;
            u27.m23029g0(C8692u.class, c8692u);
        }

        private C8692u() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllEditionDefaults(Iterable<? extends d> values) {
            ensureEditionDefaultsIsMutable();
            AbstractC0027a3.m80a(values, this.editionDefaults_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllTargets(Iterable<? extends j> values) {
            ensureTargetsIsMutable();
            Iterator<? extends j> it = values.iterator();
            while (it.hasNext()) {
                this.targets_.addInt(it.next().getNumber());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllUninterpretedOption(Iterable<? extends C8693u0> values) {
            ensureUninterpretedOptionIsMutable();
            AbstractC0027a3.m80a(values, this.uninterpretedOption_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addEditionDefaults(d value) {
            value.getClass();
            ensureEditionDefaultsIsMutable();
            this.editionDefaults_.add(value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addTargets(j value) {
            value.getClass();
            ensureTargetsIsMutable();
            this.targets_.addInt(value.getNumber());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addUninterpretedOption(C8693u0 value) {
            value.getClass();
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.add(value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCtype() {
            this.bitField0_ &= -2;
            this.ctype_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDebugRedact() {
            this.bitField0_ &= -129;
            this.debugRedact_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDeprecated() {
            this.bitField0_ &= -33;
            this.deprecated_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEditionDefaults() {
            this.editionDefaults_ = u27.m23036w();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFeatureSupport() {
            this.featureSupport_ = null;
            this.bitField0_ &= -1025;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFeatures() {
            this.features_ = null;
            this.bitField0_ &= -513;
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
        public void clearRetention() {
            this.bitField0_ &= -257;
            this.retention_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTargets() {
            this.targets_ = u27.m23034u();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUninterpretedOption() {
            this.uninterpretedOption_ = u27.m23036w();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUnverifiedLazy() {
            this.bitField0_ &= -17;
            this.unverifiedLazy_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearWeak() {
            this.bitField0_ &= -65;
            this.weak_ = false;
        }

        private void ensureEditionDefaultsIsMutable() {
            v98.InterfaceC13956l<d> interfaceC13956l = this.editionDefaults_;
            if (interfaceC13956l.isModifiable()) {
                return;
            }
            this.editionDefaults_ = u27.m23012O(interfaceC13956l);
        }

        private void ensureTargetsIsMutable() {
            v98.InterfaceC13951g interfaceC13951g = this.targets_;
            if (interfaceC13951g.isModifiable()) {
                return;
            }
            this.targets_ = u27.m23010M(interfaceC13951g);
        }

        private void ensureUninterpretedOptionIsMutable() {
            v98.InterfaceC13956l<C8693u0> interfaceC13956l = this.uninterpretedOption_;
            if (interfaceC13956l.isModifiable()) {
                return;
            }
            this.uninterpretedOption_ = u27.m23012O(interfaceC13956l);
        }

        public static C8692u getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeFeatureSupport(f value) {
            value.getClass();
            f fVar = this.featureSupport_;
            if (fVar == null || fVar == f.getDefaultInstance()) {
                this.featureSupport_ = value;
            } else {
                this.featureSupport_ = f.newBuilder(this.featureSupport_).mergeFrom(value).buildPartial();
            }
            this.bitField0_ |= 1024;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public void mergeFeatures(C8680o value) {
            value.getClass();
            C8680o c8680o = this.features_;
            if (c8680o == null || c8680o == C8680o.getDefaultInstance()) {
                this.features_ = value;
            } else {
                this.features_ = ((C8680o.a) C8680o.newBuilder(this.features_).mergeFrom(value)).buildPartial();
            }
            this.bitField0_ |= 512;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static b newBuilder() {
            return (b) DEFAULT_INSTANCE.m23053m();
        }

        public static C8692u parseDelimitedFrom(InputStream input) throws IOException {
            return (C8692u) u27.m23014R(DEFAULT_INSTANCE, input);
        }

        public static C8692u parseFrom(ByteBuffer data) throws be8 {
            return (C8692u) u27.m23022Z(DEFAULT_INSTANCE, data);
        }

        public static vhc<C8692u> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeEditionDefaults(int index) {
            ensureEditionDefaultsIsMutable();
            this.editionDefaults_.remove(index);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeUninterpretedOption(int index) {
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.remove(index);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCtype(c value) {
            this.ctype_ = value.getNumber();
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDebugRedact(boolean value) {
            this.bitField0_ |= 128;
            this.debugRedact_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDeprecated(boolean value) {
            this.bitField0_ |= 32;
            this.deprecated_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEditionDefaults(int index, d value) {
            value.getClass();
            ensureEditionDefaultsIsMutable();
            this.editionDefaults_.set(index, value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFeatureSupport(f value) {
            value.getClass();
            this.featureSupport_ = value;
            this.bitField0_ |= 1024;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFeatures(C8680o value) {
            value.getClass();
            this.features_ = value;
            this.bitField0_ |= 512;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setJstype(h value) {
            this.jstype_ = value.getNumber();
            this.bitField0_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLazy(boolean value) {
            this.bitField0_ |= 8;
            this.lazy_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPacked(boolean value) {
            this.bitField0_ |= 2;
            this.packed_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRetention(i value) {
            this.retention_ = value.getNumber();
            this.bitField0_ |= 256;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTargets(int index, j value) {
            value.getClass();
            ensureTargetsIsMutable();
            this.targets_.setInt(index, value.getNumber());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUninterpretedOption(int index, C8693u0 value) {
            value.getClass();
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.set(index, value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUnverifiedLazy(boolean value) {
            this.bitField0_ |= 16;
            this.unverifiedLazy_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWeak(boolean value) {
            this.bitField0_ |= 64;
            this.weak_ = value;
        }

        @Override // p000.l74.InterfaceC8694v
        public c getCtype() {
            c cVarForNumber = c.forNumber(this.ctype_);
            return cVarForNumber == null ? c.STRING : cVarForNumber;
        }

        @Override // p000.l74.InterfaceC8694v
        public boolean getDebugRedact() {
            return this.debugRedact_;
        }

        @Override // p000.l74.InterfaceC8694v
        public boolean getDeprecated() {
            return this.deprecated_;
        }

        @Override // p000.l74.InterfaceC8694v
        public d getEditionDefaults(int index) {
            return this.editionDefaults_.get(index);
        }

        @Override // p000.l74.InterfaceC8694v
        public int getEditionDefaultsCount() {
            return this.editionDefaults_.size();
        }

        @Override // p000.l74.InterfaceC8694v
        public List<d> getEditionDefaultsList() {
            return this.editionDefaults_;
        }

        public e getEditionDefaultsOrBuilder(int index) {
            return this.editionDefaults_.get(index);
        }

        public List<? extends e> getEditionDefaultsOrBuilderList() {
            return this.editionDefaults_;
        }

        @Override // p000.l74.InterfaceC8694v
        public f getFeatureSupport() {
            f fVar = this.featureSupport_;
            return fVar == null ? f.getDefaultInstance() : fVar;
        }

        @Override // p000.l74.InterfaceC8694v
        public C8680o getFeatures() {
            C8680o c8680o = this.features_;
            return c8680o == null ? C8680o.getDefaultInstance() : c8680o;
        }

        @Override // p000.l74.InterfaceC8694v
        public h getJstype() {
            h hVarForNumber = h.forNumber(this.jstype_);
            return hVarForNumber == null ? h.JS_NORMAL : hVarForNumber;
        }

        @Override // p000.l74.InterfaceC8694v
        public boolean getLazy() {
            return this.lazy_;
        }

        @Override // p000.l74.InterfaceC8694v
        public boolean getPacked() {
            return this.packed_;
        }

        @Override // p000.l74.InterfaceC8694v
        public i getRetention() {
            i iVarForNumber = i.forNumber(this.retention_);
            return iVarForNumber == null ? i.RETENTION_UNKNOWN : iVarForNumber;
        }

        @Override // p000.l74.InterfaceC8694v
        public j getTargets(int index) {
            j jVarForNumber = j.forNumber(this.targets_.getInt(index));
            return jVarForNumber == null ? j.TARGET_TYPE_UNKNOWN : jVarForNumber;
        }

        @Override // p000.l74.InterfaceC8694v
        public int getTargetsCount() {
            return this.targets_.size();
        }

        @Override // p000.l74.InterfaceC8694v
        public List<j> getTargetsList() {
            return new v98.C13952h(this.targets_, targets_converter_);
        }

        @Override // p000.l74.InterfaceC8694v
        public C8693u0 getUninterpretedOption(int index) {
            return this.uninterpretedOption_.get(index);
        }

        @Override // p000.l74.InterfaceC8694v
        public int getUninterpretedOptionCount() {
            return this.uninterpretedOption_.size();
        }

        @Override // p000.l74.InterfaceC8694v
        public List<C8693u0> getUninterpretedOptionList() {
            return this.uninterpretedOption_;
        }

        public InterfaceC8695v0 getUninterpretedOptionOrBuilder(int index) {
            return this.uninterpretedOption_.get(index);
        }

        public List<? extends InterfaceC8695v0> getUninterpretedOptionOrBuilderList() {
            return this.uninterpretedOption_;
        }

        @Override // p000.l74.InterfaceC8694v
        public boolean getUnverifiedLazy() {
            return this.unverifiedLazy_;
        }

        @Override // p000.l74.InterfaceC8694v
        public boolean getWeak() {
            return this.weak_;
        }

        @Override // p000.l74.InterfaceC8694v
        public boolean hasCtype() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // p000.l74.InterfaceC8694v
        public boolean hasDebugRedact() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // p000.l74.InterfaceC8694v
        public boolean hasDeprecated() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // p000.l74.InterfaceC8694v
        public boolean hasFeatureSupport() {
            return (this.bitField0_ & 1024) != 0;
        }

        @Override // p000.l74.InterfaceC8694v
        public boolean hasFeatures() {
            return (this.bitField0_ & 512) != 0;
        }

        @Override // p000.l74.InterfaceC8694v
        public boolean hasJstype() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // p000.l74.InterfaceC8694v
        public boolean hasLazy() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // p000.l74.InterfaceC8694v
        public boolean hasPacked() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // p000.l74.InterfaceC8694v
        public boolean hasRetention() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // p000.l74.InterfaceC8694v
        public boolean hasUnverifiedLazy() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // p000.l74.InterfaceC8694v
        public boolean hasWeak() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // p000.u27
        /* JADX INFO: renamed from: q */
        public final Object mo79q(u27.EnumC13331i method, Object arg0, Object arg1) {
            C8652a c8652a = null;
            switch (C8652a.f56391a[method.ordinal()]) {
                case 1:
                    return new C8692u();
                case 2:
                    return new b(c8652a);
                case 3:
                    return u27.m23013P(DEFAULT_INSTANCE, "\u0001\u000e\u0000\u0001\u0001ϧ\u000e\u0000\u0003\u0002\u0001᠌\u0000\u0002ဇ\u0001\u0003ဇ\u0005\u0005ဇ\u0003\u0006᠌\u0002\nဇ\u0006\u000fဇ\u0004\u0010ဇ\u0007\u0011᠌\b\u0013ࠞ\u0014\u001b\u0015ᐉ\t\u0016ဉ\nϧЛ", new Object[]{"bitField0_", "ctype_", c.internalGetVerifier(), "packed_", "deprecated_", "lazy_", "jstype_", h.internalGetVerifier(), "weak_", "unverifiedLazy_", "debugRedact_", "retention_", i.internalGetVerifier(), "targets_", j.internalGetVerifier(), "editionDefaults_", d.class, "features_", "featureSupport_", "uninterpretedOption_", C8693u0.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    vhc<C8692u> c13325c = PARSER;
                    if (c13325c == null) {
                        synchronized (C8692u.class) {
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
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    this.memoizedIsInitialized = (byte) (arg0 == null ? 0 : 1);
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static b newBuilder(C8692u prototype) {
            return (b) DEFAULT_INSTANCE.m23054n(prototype);
        }

        public static C8692u parseDelimitedFrom(InputStream input, yi5 extensionRegistry) throws IOException {
            return (C8692u) u27.m23015S(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static C8692u parseFrom(ByteBuffer data, yi5 extensionRegistry) throws be8 {
            return (C8692u) u27.m23023a0(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static C8692u parseFrom(wj1 data) throws be8 {
            return (C8692u) u27.m23016T(DEFAULT_INSTANCE, data);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addEditionDefaults(int index, d value) {
            value.getClass();
            ensureEditionDefaultsIsMutable();
            this.editionDefaults_.add(index, value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addUninterpretedOption(int index, C8693u0 value) {
            value.getClass();
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.add(index, value);
        }

        public static C8692u parseFrom(wj1 data, yi5 extensionRegistry) throws be8 {
            return (C8692u) u27.m23017U(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static C8692u parseFrom(byte[] data) throws be8 {
            return (C8692u) u27.m23024b0(DEFAULT_INSTANCE, data);
        }

        public static C8692u parseFrom(byte[] data, yi5 extensionRegistry) throws be8 {
            return (C8692u) u27.m23025c0(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static C8692u parseFrom(InputStream input) throws IOException {
            return (C8692u) u27.m23020X(DEFAULT_INSTANCE, input);
        }

        public static C8692u parseFrom(InputStream input, yi5 extensionRegistry) throws IOException {
            return (C8692u) u27.m23021Y(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static C8692u parseFrom(e72 input) throws IOException {
            return (C8692u) u27.m23018V(DEFAULT_INSTANCE, input);
        }

        public static C8692u parseFrom(e72 input, yi5 extensionRegistry) throws IOException {
            return (C8692u) u27.m23019W(DEFAULT_INSTANCE, input, extensionRegistry);
        }
    }

    /* JADX INFO: renamed from: l74$u0 */
    public static final class C8693u0 extends u27<C8693u0, a> implements InterfaceC8695v0 {
        public static final int AGGREGATE_VALUE_FIELD_NUMBER = 8;
        private static final C8693u0 DEFAULT_INSTANCE;
        public static final int DOUBLE_VALUE_FIELD_NUMBER = 6;
        public static final int IDENTIFIER_VALUE_FIELD_NUMBER = 3;
        public static final int NAME_FIELD_NUMBER = 2;
        public static final int NEGATIVE_INT_VALUE_FIELD_NUMBER = 5;
        private static volatile vhc<C8693u0> PARSER = null;
        public static final int POSITIVE_INT_VALUE_FIELD_NUMBER = 4;
        public static final int STRING_VALUE_FIELD_NUMBER = 7;
        private int bitField0_;
        private double doubleValue_;
        private long negativeIntValue_;
        private long positiveIntValue_;
        private byte memoizedIsInitialized = 2;
        private v98.InterfaceC13956l<b> name_ = u27.m23036w();
        private String identifierValue_ = "";
        private wj1 stringValue_ = wj1.f94379e;
        private String aggregateValue_ = "";

        /* JADX INFO: renamed from: l74$u0$a */
        public static final class a extends u27.AbstractC13324b<C8693u0, a> implements InterfaceC8695v0 {
            public /* synthetic */ a(C8652a c8652a) {
                this();
            }

            public a addAllName(Iterable<? extends b> values) {
                m23058e();
                ((C8693u0) this.f86607b).addAllName(values);
                return this;
            }

            public a addName(b value) {
                m23058e();
                ((C8693u0) this.f86607b).addName(value);
                return this;
            }

            public a clearAggregateValue() {
                m23058e();
                ((C8693u0) this.f86607b).clearAggregateValue();
                return this;
            }

            public a clearDoubleValue() {
                m23058e();
                ((C8693u0) this.f86607b).clearDoubleValue();
                return this;
            }

            public a clearIdentifierValue() {
                m23058e();
                ((C8693u0) this.f86607b).clearIdentifierValue();
                return this;
            }

            public a clearName() {
                m23058e();
                ((C8693u0) this.f86607b).clearName();
                return this;
            }

            public a clearNegativeIntValue() {
                m23058e();
                ((C8693u0) this.f86607b).clearNegativeIntValue();
                return this;
            }

            public a clearPositiveIntValue() {
                m23058e();
                ((C8693u0) this.f86607b).clearPositiveIntValue();
                return this;
            }

            public a clearStringValue() {
                m23058e();
                ((C8693u0) this.f86607b).clearStringValue();
                return this;
            }

            @Override // p000.l74.InterfaceC8695v0
            public String getAggregateValue() {
                return ((C8693u0) this.f86607b).getAggregateValue();
            }

            @Override // p000.l74.InterfaceC8695v0
            public wj1 getAggregateValueBytes() {
                return ((C8693u0) this.f86607b).getAggregateValueBytes();
            }

            @Override // p000.l74.InterfaceC8695v0
            public double getDoubleValue() {
                return ((C8693u0) this.f86607b).getDoubleValue();
            }

            @Override // p000.l74.InterfaceC8695v0
            public String getIdentifierValue() {
                return ((C8693u0) this.f86607b).getIdentifierValue();
            }

            @Override // p000.l74.InterfaceC8695v0
            public wj1 getIdentifierValueBytes() {
                return ((C8693u0) this.f86607b).getIdentifierValueBytes();
            }

            @Override // p000.l74.InterfaceC8695v0
            public b getName(int index) {
                return ((C8693u0) this.f86607b).getName(index);
            }

            @Override // p000.l74.InterfaceC8695v0
            public int getNameCount() {
                return ((C8693u0) this.f86607b).getNameCount();
            }

            @Override // p000.l74.InterfaceC8695v0
            public List<b> getNameList() {
                return Collections.unmodifiableList(((C8693u0) this.f86607b).getNameList());
            }

            @Override // p000.l74.InterfaceC8695v0
            public long getNegativeIntValue() {
                return ((C8693u0) this.f86607b).getNegativeIntValue();
            }

            @Override // p000.l74.InterfaceC8695v0
            public long getPositiveIntValue() {
                return ((C8693u0) this.f86607b).getPositiveIntValue();
            }

            @Override // p000.l74.InterfaceC8695v0
            public wj1 getStringValue() {
                return ((C8693u0) this.f86607b).getStringValue();
            }

            @Override // p000.l74.InterfaceC8695v0
            public boolean hasAggregateValue() {
                return ((C8693u0) this.f86607b).hasAggregateValue();
            }

            @Override // p000.l74.InterfaceC8695v0
            public boolean hasDoubleValue() {
                return ((C8693u0) this.f86607b).hasDoubleValue();
            }

            @Override // p000.l74.InterfaceC8695v0
            public boolean hasIdentifierValue() {
                return ((C8693u0) this.f86607b).hasIdentifierValue();
            }

            @Override // p000.l74.InterfaceC8695v0
            public boolean hasNegativeIntValue() {
                return ((C8693u0) this.f86607b).hasNegativeIntValue();
            }

            @Override // p000.l74.InterfaceC8695v0
            public boolean hasPositiveIntValue() {
                return ((C8693u0) this.f86607b).hasPositiveIntValue();
            }

            @Override // p000.l74.InterfaceC8695v0
            public boolean hasStringValue() {
                return ((C8693u0) this.f86607b).hasStringValue();
            }

            public a removeName(int index) {
                m23058e();
                ((C8693u0) this.f86607b).removeName(index);
                return this;
            }

            public a setAggregateValue(String value) {
                m23058e();
                ((C8693u0) this.f86607b).setAggregateValue(value);
                return this;
            }

            public a setAggregateValueBytes(wj1 value) {
                m23058e();
                ((C8693u0) this.f86607b).setAggregateValueBytes(value);
                return this;
            }

            public a setDoubleValue(double value) {
                m23058e();
                ((C8693u0) this.f86607b).setDoubleValue(value);
                return this;
            }

            public a setIdentifierValue(String value) {
                m23058e();
                ((C8693u0) this.f86607b).setIdentifierValue(value);
                return this;
            }

            public a setIdentifierValueBytes(wj1 value) {
                m23058e();
                ((C8693u0) this.f86607b).setIdentifierValueBytes(value);
                return this;
            }

            public a setName(int index, b value) {
                m23058e();
                ((C8693u0) this.f86607b).setName(index, value);
                return this;
            }

            public a setNegativeIntValue(long value) {
                m23058e();
                ((C8693u0) this.f86607b).setNegativeIntValue(value);
                return this;
            }

            public a setPositiveIntValue(long value) {
                m23058e();
                ((C8693u0) this.f86607b).setPositiveIntValue(value);
                return this;
            }

            public a setStringValue(wj1 value) {
                m23058e();
                ((C8693u0) this.f86607b).setStringValue(value);
                return this;
            }

            private a() {
                super(C8693u0.DEFAULT_INSTANCE);
            }

            public a addName(int index, b value) {
                m23058e();
                ((C8693u0) this.f86607b).addName(index, value);
                return this;
            }

            public a setName(int index, b.a builderForValue) {
                m23058e();
                ((C8693u0) this.f86607b).setName(index, builderForValue.build());
                return this;
            }

            public a addName(b.a builderForValue) {
                m23058e();
                ((C8693u0) this.f86607b).addName(builderForValue.build());
                return this;
            }

            public a addName(int index, b.a builderForValue) {
                m23058e();
                ((C8693u0) this.f86607b).addName(index, builderForValue.build());
                return this;
            }
        }

        /* JADX INFO: renamed from: l74$u0$b */
        public static final class b extends u27<b, a> implements c {
            private static final b DEFAULT_INSTANCE;
            public static final int IS_EXTENSION_FIELD_NUMBER = 2;
            public static final int NAME_PART_FIELD_NUMBER = 1;
            private static volatile vhc<b> PARSER;
            private int bitField0_;
            private boolean isExtension_;
            private byte memoizedIsInitialized = 2;
            private String namePart_ = "";

            /* JADX INFO: renamed from: l74$u0$b$a */
            public static final class a extends u27.AbstractC13324b<b, a> implements c {
                public /* synthetic */ a(C8652a c8652a) {
                    this();
                }

                public a clearIsExtension() {
                    m23058e();
                    ((b) this.f86607b).clearIsExtension();
                    return this;
                }

                public a clearNamePart() {
                    m23058e();
                    ((b) this.f86607b).clearNamePart();
                    return this;
                }

                @Override // p000.l74.C8693u0.c
                public boolean getIsExtension() {
                    return ((b) this.f86607b).getIsExtension();
                }

                @Override // p000.l74.C8693u0.c
                public String getNamePart() {
                    return ((b) this.f86607b).getNamePart();
                }

                @Override // p000.l74.C8693u0.c
                public wj1 getNamePartBytes() {
                    return ((b) this.f86607b).getNamePartBytes();
                }

                @Override // p000.l74.C8693u0.c
                public boolean hasIsExtension() {
                    return ((b) this.f86607b).hasIsExtension();
                }

                @Override // p000.l74.C8693u0.c
                public boolean hasNamePart() {
                    return ((b) this.f86607b).hasNamePart();
                }

                public a setIsExtension(boolean value) {
                    m23058e();
                    ((b) this.f86607b).setIsExtension(value);
                    return this;
                }

                public a setNamePart(String value) {
                    m23058e();
                    ((b) this.f86607b).setNamePart(value);
                    return this;
                }

                public a setNamePartBytes(wj1 value) {
                    m23058e();
                    ((b) this.f86607b).setNamePartBytes(value);
                    return this;
                }

                private a() {
                    super(b.DEFAULT_INSTANCE);
                }
            }

            static {
                b bVar = new b();
                DEFAULT_INSTANCE = bVar;
                u27.m23029g0(b.class, bVar);
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
                return DEFAULT_INSTANCE.m23053m();
            }

            public static b parseDelimitedFrom(InputStream input) throws IOException {
                return (b) u27.m23014R(DEFAULT_INSTANCE, input);
            }

            public static b parseFrom(ByteBuffer data) throws be8 {
                return (b) u27.m23022Z(DEFAULT_INSTANCE, data);
            }

            public static vhc<b> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setIsExtension(boolean value) {
                this.bitField0_ |= 2;
                this.isExtension_ = value;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setNamePart(String value) {
                value.getClass();
                this.bitField0_ |= 1;
                this.namePart_ = value;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setNamePartBytes(wj1 value) {
                this.namePart_ = value.toStringUtf8();
                this.bitField0_ |= 1;
            }

            @Override // p000.l74.C8693u0.c
            public boolean getIsExtension() {
                return this.isExtension_;
            }

            @Override // p000.l74.C8693u0.c
            public String getNamePart() {
                return this.namePart_;
            }

            @Override // p000.l74.C8693u0.c
            public wj1 getNamePartBytes() {
                return wj1.copyFromUtf8(this.namePart_);
            }

            @Override // p000.l74.C8693u0.c
            public boolean hasIsExtension() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // p000.l74.C8693u0.c
            public boolean hasNamePart() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // p000.u27
            /* JADX INFO: renamed from: q */
            public final Object mo79q(u27.EnumC13331i method, Object arg0, Object arg1) {
                C8652a c8652a = null;
                switch (C8652a.f56391a[method.ordinal()]) {
                    case 1:
                        return new b();
                    case 2:
                        return new a(c8652a);
                    case 3:
                        return u27.m23013P(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔈ\u0000\u0002ᔇ\u0001", new Object[]{"bitField0_", "namePart_", "isExtension_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        vhc<b> c13325c = PARSER;
                        if (c13325c == null) {
                            synchronized (b.class) {
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
                        return Byte.valueOf(this.memoizedIsInitialized);
                    case 7:
                        this.memoizedIsInitialized = (byte) (arg0 == null ? 0 : 1);
                        return null;
                    default:
                        throw new UnsupportedOperationException();
                }
            }

            public static a newBuilder(b prototype) {
                return DEFAULT_INSTANCE.m23054n(prototype);
            }

            public static b parseDelimitedFrom(InputStream input, yi5 extensionRegistry) throws IOException {
                return (b) u27.m23015S(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static b parseFrom(ByteBuffer data, yi5 extensionRegistry) throws be8 {
                return (b) u27.m23023a0(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static b parseFrom(wj1 data) throws be8 {
                return (b) u27.m23016T(DEFAULT_INSTANCE, data);
            }

            public static b parseFrom(wj1 data, yi5 extensionRegistry) throws be8 {
                return (b) u27.m23017U(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static b parseFrom(byte[] data) throws be8 {
                return (b) u27.m23024b0(DEFAULT_INSTANCE, data);
            }

            public static b parseFrom(byte[] data, yi5 extensionRegistry) throws be8 {
                return (b) u27.m23025c0(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static b parseFrom(InputStream input) throws IOException {
                return (b) u27.m23020X(DEFAULT_INSTANCE, input);
            }

            public static b parseFrom(InputStream input, yi5 extensionRegistry) throws IOException {
                return (b) u27.m23021Y(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static b parseFrom(e72 input) throws IOException {
                return (b) u27.m23018V(DEFAULT_INSTANCE, input);
            }

            public static b parseFrom(e72 input, yi5 extensionRegistry) throws IOException {
                return (b) u27.m23019W(DEFAULT_INSTANCE, input, extensionRegistry);
            }
        }

        /* JADX INFO: renamed from: l74$u0$c */
        public interface c extends ssa {
            boolean getIsExtension();

            String getNamePart();

            wj1 getNamePartBytes();

            boolean hasIsExtension();

            boolean hasNamePart();
        }

        static {
            C8693u0 c8693u0 = new C8693u0();
            DEFAULT_INSTANCE = c8693u0;
            u27.m23029g0(C8693u0.class, c8693u0);
        }

        private C8693u0() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllName(Iterable<? extends b> values) {
            ensureNameIsMutable();
            AbstractC0027a3.m80a(values, this.name_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addName(b value) {
            value.getClass();
            ensureNameIsMutable();
            this.name_.add(value);
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
            this.name_ = u27.m23036w();
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
            v98.InterfaceC13956l<b> interfaceC13956l = this.name_;
            if (interfaceC13956l.isModifiable()) {
                return;
            }
            this.name_ = u27.m23012O(interfaceC13956l);
        }

        public static C8693u0 getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.m23053m();
        }

        public static C8693u0 parseDelimitedFrom(InputStream input) throws IOException {
            return (C8693u0) u27.m23014R(DEFAULT_INSTANCE, input);
        }

        public static C8693u0 parseFrom(ByteBuffer data) throws be8 {
            return (C8693u0) u27.m23022Z(DEFAULT_INSTANCE, data);
        }

        public static vhc<C8693u0> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeName(int index) {
            ensureNameIsMutable();
            this.name_.remove(index);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAggregateValue(String value) {
            value.getClass();
            this.bitField0_ |= 32;
            this.aggregateValue_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAggregateValueBytes(wj1 value) {
            this.aggregateValue_ = value.toStringUtf8();
            this.bitField0_ |= 32;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDoubleValue(double value) {
            this.bitField0_ |= 8;
            this.doubleValue_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIdentifierValue(String value) {
            value.getClass();
            this.bitField0_ |= 1;
            this.identifierValue_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIdentifierValueBytes(wj1 value) {
            this.identifierValue_ = value.toStringUtf8();
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setName(int index, b value) {
            value.getClass();
            ensureNameIsMutable();
            this.name_.set(index, value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNegativeIntValue(long value) {
            this.bitField0_ |= 4;
            this.negativeIntValue_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPositiveIntValue(long value) {
            this.bitField0_ |= 2;
            this.positiveIntValue_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStringValue(wj1 value) {
            value.getClass();
            this.bitField0_ |= 16;
            this.stringValue_ = value;
        }

        @Override // p000.l74.InterfaceC8695v0
        public String getAggregateValue() {
            return this.aggregateValue_;
        }

        @Override // p000.l74.InterfaceC8695v0
        public wj1 getAggregateValueBytes() {
            return wj1.copyFromUtf8(this.aggregateValue_);
        }

        @Override // p000.l74.InterfaceC8695v0
        public double getDoubleValue() {
            return this.doubleValue_;
        }

        @Override // p000.l74.InterfaceC8695v0
        public String getIdentifierValue() {
            return this.identifierValue_;
        }

        @Override // p000.l74.InterfaceC8695v0
        public wj1 getIdentifierValueBytes() {
            return wj1.copyFromUtf8(this.identifierValue_);
        }

        @Override // p000.l74.InterfaceC8695v0
        public b getName(int index) {
            return this.name_.get(index);
        }

        @Override // p000.l74.InterfaceC8695v0
        public int getNameCount() {
            return this.name_.size();
        }

        @Override // p000.l74.InterfaceC8695v0
        public List<b> getNameList() {
            return this.name_;
        }

        public c getNameOrBuilder(int index) {
            return this.name_.get(index);
        }

        public List<? extends c> getNameOrBuilderList() {
            return this.name_;
        }

        @Override // p000.l74.InterfaceC8695v0
        public long getNegativeIntValue() {
            return this.negativeIntValue_;
        }

        @Override // p000.l74.InterfaceC8695v0
        public long getPositiveIntValue() {
            return this.positiveIntValue_;
        }

        @Override // p000.l74.InterfaceC8695v0
        public wj1 getStringValue() {
            return this.stringValue_;
        }

        @Override // p000.l74.InterfaceC8695v0
        public boolean hasAggregateValue() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // p000.l74.InterfaceC8695v0
        public boolean hasDoubleValue() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // p000.l74.InterfaceC8695v0
        public boolean hasIdentifierValue() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // p000.l74.InterfaceC8695v0
        public boolean hasNegativeIntValue() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // p000.l74.InterfaceC8695v0
        public boolean hasPositiveIntValue() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // p000.l74.InterfaceC8695v0
        public boolean hasStringValue() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // p000.u27
        /* JADX INFO: renamed from: q */
        public final Object mo79q(u27.EnumC13331i method, Object arg0, Object arg1) {
            C8652a c8652a = null;
            switch (C8652a.f56391a[method.ordinal()]) {
                case 1:
                    return new C8693u0();
                case 2:
                    return new a(c8652a);
                case 3:
                    return u27.m23013P(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0002\b\u0007\u0000\u0001\u0001\u0002Л\u0003ဈ\u0000\u0004ဃ\u0001\u0005ဂ\u0002\u0006က\u0003\u0007ည\u0004\bဈ\u0005", new Object[]{"bitField0_", "name_", b.class, "identifierValue_", "positiveIntValue_", "negativeIntValue_", "doubleValue_", "stringValue_", "aggregateValue_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    vhc<C8693u0> c13325c = PARSER;
                    if (c13325c == null) {
                        synchronized (C8693u0.class) {
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
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    this.memoizedIsInitialized = (byte) (arg0 == null ? 0 : 1);
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public static a newBuilder(C8693u0 prototype) {
            return DEFAULT_INSTANCE.m23054n(prototype);
        }

        public static C8693u0 parseDelimitedFrom(InputStream input, yi5 extensionRegistry) throws IOException {
            return (C8693u0) u27.m23015S(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static C8693u0 parseFrom(ByteBuffer data, yi5 extensionRegistry) throws be8 {
            return (C8693u0) u27.m23023a0(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static C8693u0 parseFrom(wj1 data) throws be8 {
            return (C8693u0) u27.m23016T(DEFAULT_INSTANCE, data);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addName(int index, b value) {
            value.getClass();
            ensureNameIsMutable();
            this.name_.add(index, value);
        }

        public static C8693u0 parseFrom(wj1 data, yi5 extensionRegistry) throws be8 {
            return (C8693u0) u27.m23017U(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static C8693u0 parseFrom(byte[] data) throws be8 {
            return (C8693u0) u27.m23024b0(DEFAULT_INSTANCE, data);
        }

        public static C8693u0 parseFrom(byte[] data, yi5 extensionRegistry) throws be8 {
            return (C8693u0) u27.m23025c0(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static C8693u0 parseFrom(InputStream input) throws IOException {
            return (C8693u0) u27.m23020X(DEFAULT_INSTANCE, input);
        }

        public static C8693u0 parseFrom(InputStream input, yi5 extensionRegistry) throws IOException {
            return (C8693u0) u27.m23021Y(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static C8693u0 parseFrom(e72 input) throws IOException {
            return (C8693u0) u27.m23018V(DEFAULT_INSTANCE, input);
        }

        public static C8693u0 parseFrom(e72 input, yi5 extensionRegistry) throws IOException {
            return (C8693u0) u27.m23019W(DEFAULT_INSTANCE, input, extensionRegistry);
        }
    }

    /* JADX INFO: renamed from: l74$v */
    public interface InterfaceC8694v extends u27.InterfaceC13328f<C8692u, C8692u.b> {
        C8692u.c getCtype();

        boolean getDebugRedact();

        boolean getDeprecated();

        C8692u.d getEditionDefaults(int index);

        int getEditionDefaultsCount();

        List<C8692u.d> getEditionDefaultsList();

        C8692u.f getFeatureSupport();

        C8680o getFeatures();

        C8692u.h getJstype();

        boolean getLazy();

        boolean getPacked();

        C8692u.i getRetention();

        C8692u.j getTargets(int index);

        int getTargetsCount();

        List<C8692u.j> getTargetsList();

        C8693u0 getUninterpretedOption(int index);

        int getUninterpretedOptionCount();

        List<C8693u0> getUninterpretedOptionList();

        boolean getUnverifiedLazy();

        boolean getWeak();

        boolean hasCtype();

        boolean hasDebugRedact();

        boolean hasDeprecated();

        boolean hasFeatureSupport();

        boolean hasFeatures();

        boolean hasJstype();

        boolean hasLazy();

        boolean hasPacked();

        boolean hasRetention();

        boolean hasUnverifiedLazy();

        boolean hasWeak();
    }

    /* JADX INFO: renamed from: l74$v0 */
    public interface InterfaceC8695v0 extends ssa {
        String getAggregateValue();

        wj1 getAggregateValueBytes();

        double getDoubleValue();

        String getIdentifierValue();

        wj1 getIdentifierValueBytes();

        C8693u0.b getName(int index);

        int getNameCount();

        List<C8693u0.b> getNameList();

        long getNegativeIntValue();

        long getPositiveIntValue();

        wj1 getStringValue();

        boolean hasAggregateValue();

        boolean hasDoubleValue();

        boolean hasIdentifierValue();

        boolean hasNegativeIntValue();

        boolean hasPositiveIntValue();

        boolean hasStringValue();
    }

    /* JADX INFO: renamed from: l74$w */
    public static final class C8696w extends u27<C8696w, a> implements InterfaceC8697x {
        private static final C8696w DEFAULT_INSTANCE;
        public static final int DEPENDENCY_FIELD_NUMBER = 3;
        public static final int EDITION_FIELD_NUMBER = 14;
        public static final int ENUM_TYPE_FIELD_NUMBER = 5;
        public static final int EXTENSION_FIELD_NUMBER = 7;
        public static final int MESSAGE_TYPE_FIELD_NUMBER = 4;
        public static final int NAME_FIELD_NUMBER = 1;
        public static final int OPTIONS_FIELD_NUMBER = 8;
        public static final int PACKAGE_FIELD_NUMBER = 2;
        private static volatile vhc<C8696w> PARSER = null;
        public static final int PUBLIC_DEPENDENCY_FIELD_NUMBER = 10;
        public static final int SERVICE_FIELD_NUMBER = 6;
        public static final int SOURCE_CODE_INFO_FIELD_NUMBER = 9;
        public static final int SYNTAX_FIELD_NUMBER = 12;
        public static final int WEAK_DEPENDENCY_FIELD_NUMBER = 11;
        private int bitField0_;
        private int edition_;
        private C8653a0 options_;
        private C8689s0 sourceCodeInfo_;
        private byte memoizedIsInitialized = 2;
        private String name_ = "";
        private String package_ = "";
        private v98.InterfaceC13956l<String> dependency_ = u27.m23036w();
        private v98.InterfaceC13951g publicDependency_ = u27.m23034u();
        private v98.InterfaceC13951g weakDependency_ = u27.m23034u();
        private v98.InterfaceC13956l<C8654b> messageType_ = u27.m23036w();
        private v98.InterfaceC13956l<C8660e> enumType_ = u27.m23036w();
        private v98.InterfaceC13956l<C8681o0> service_ = u27.m23036w();
        private v98.InterfaceC13956l<C8688s> extension_ = u27.m23036w();
        private String syntax_ = "";

        /* JADX INFO: renamed from: l74$w$a */
        public static final class a extends u27.AbstractC13324b<C8696w, a> implements InterfaceC8697x {
            public /* synthetic */ a(C8652a c8652a) {
                this();
            }

            public a addAllDependency(Iterable<String> values) {
                m23058e();
                ((C8696w) this.f86607b).addAllDependency(values);
                return this;
            }

            public a addAllEnumType(Iterable<? extends C8660e> values) {
                m23058e();
                ((C8696w) this.f86607b).addAllEnumType(values);
                return this;
            }

            public a addAllExtension(Iterable<? extends C8688s> values) {
                m23058e();
                ((C8696w) this.f86607b).addAllExtension(values);
                return this;
            }

            public a addAllMessageType(Iterable<? extends C8654b> values) {
                m23058e();
                ((C8696w) this.f86607b).addAllMessageType(values);
                return this;
            }

            public a addAllPublicDependency(Iterable<? extends Integer> values) {
                m23058e();
                ((C8696w) this.f86607b).addAllPublicDependency(values);
                return this;
            }

            public a addAllService(Iterable<? extends C8681o0> values) {
                m23058e();
                ((C8696w) this.f86607b).addAllService(values);
                return this;
            }

            public a addAllWeakDependency(Iterable<? extends Integer> values) {
                m23058e();
                ((C8696w) this.f86607b).addAllWeakDependency(values);
                return this;
            }

            public a addDependency(String value) {
                m23058e();
                ((C8696w) this.f86607b).addDependency(value);
                return this;
            }

            public a addDependencyBytes(wj1 value) {
                m23058e();
                ((C8696w) this.f86607b).addDependencyBytes(value);
                return this;
            }

            public a addEnumType(C8660e value) {
                m23058e();
                ((C8696w) this.f86607b).addEnumType(value);
                return this;
            }

            public a addExtension(C8688s value) {
                m23058e();
                ((C8696w) this.f86607b).addExtension(value);
                return this;
            }

            public a addMessageType(C8654b value) {
                m23058e();
                ((C8696w) this.f86607b).addMessageType(value);
                return this;
            }

            public a addPublicDependency(int value) {
                m23058e();
                ((C8696w) this.f86607b).addPublicDependency(value);
                return this;
            }

            public a addService(C8681o0 value) {
                m23058e();
                ((C8696w) this.f86607b).addService(value);
                return this;
            }

            public a addWeakDependency(int value) {
                m23058e();
                ((C8696w) this.f86607b).addWeakDependency(value);
                return this;
            }

            public a clearDependency() {
                m23058e();
                ((C8696w) this.f86607b).clearDependency();
                return this;
            }

            public a clearEdition() {
                m23058e();
                ((C8696w) this.f86607b).clearEdition();
                return this;
            }

            public a clearEnumType() {
                m23058e();
                ((C8696w) this.f86607b).clearEnumType();
                return this;
            }

            public a clearExtension() {
                m23058e();
                ((C8696w) this.f86607b).clearExtension();
                return this;
            }

            public a clearMessageType() {
                m23058e();
                ((C8696w) this.f86607b).clearMessageType();
                return this;
            }

            public a clearName() {
                m23058e();
                ((C8696w) this.f86607b).clearName();
                return this;
            }

            public a clearOptions() {
                m23058e();
                ((C8696w) this.f86607b).clearOptions();
                return this;
            }

            public a clearPackage() {
                m23058e();
                ((C8696w) this.f86607b).clearPackage();
                return this;
            }

            public a clearPublicDependency() {
                m23058e();
                ((C8696w) this.f86607b).clearPublicDependency();
                return this;
            }

            public a clearService() {
                m23058e();
                ((C8696w) this.f86607b).clearService();
                return this;
            }

            public a clearSourceCodeInfo() {
                m23058e();
                ((C8696w) this.f86607b).clearSourceCodeInfo();
                return this;
            }

            public a clearSyntax() {
                m23058e();
                ((C8696w) this.f86607b).clearSyntax();
                return this;
            }

            public a clearWeakDependency() {
                m23058e();
                ((C8696w) this.f86607b).clearWeakDependency();
                return this;
            }

            @Override // p000.l74.InterfaceC8697x
            public String getDependency(int index) {
                return ((C8696w) this.f86607b).getDependency(index);
            }

            @Override // p000.l74.InterfaceC8697x
            public wj1 getDependencyBytes(int index) {
                return ((C8696w) this.f86607b).getDependencyBytes(index);
            }

            @Override // p000.l74.InterfaceC8697x
            public int getDependencyCount() {
                return ((C8696w) this.f86607b).getDependencyCount();
            }

            @Override // p000.l74.InterfaceC8697x
            public List<String> getDependencyList() {
                return Collections.unmodifiableList(((C8696w) this.f86607b).getDependencyList());
            }

            @Override // p000.l74.InterfaceC8697x
            public EnumC8658d getEdition() {
                return ((C8696w) this.f86607b).getEdition();
            }

            @Override // p000.l74.InterfaceC8697x
            public C8660e getEnumType(int index) {
                return ((C8696w) this.f86607b).getEnumType(index);
            }

            @Override // p000.l74.InterfaceC8697x
            public int getEnumTypeCount() {
                return ((C8696w) this.f86607b).getEnumTypeCount();
            }

            @Override // p000.l74.InterfaceC8697x
            public List<C8660e> getEnumTypeList() {
                return Collections.unmodifiableList(((C8696w) this.f86607b).getEnumTypeList());
            }

            @Override // p000.l74.InterfaceC8697x
            public C8688s getExtension(int index) {
                return ((C8696w) this.f86607b).getExtension(index);
            }

            @Override // p000.l74.InterfaceC8697x
            public int getExtensionCount() {
                return ((C8696w) this.f86607b).getExtensionCount();
            }

            @Override // p000.l74.InterfaceC8697x
            public List<C8688s> getExtensionList() {
                return Collections.unmodifiableList(((C8696w) this.f86607b).getExtensionList());
            }

            @Override // p000.l74.InterfaceC8697x
            public C8654b getMessageType(int index) {
                return ((C8696w) this.f86607b).getMessageType(index);
            }

            @Override // p000.l74.InterfaceC8697x
            public int getMessageTypeCount() {
                return ((C8696w) this.f86607b).getMessageTypeCount();
            }

            @Override // p000.l74.InterfaceC8697x
            public List<C8654b> getMessageTypeList() {
                return Collections.unmodifiableList(((C8696w) this.f86607b).getMessageTypeList());
            }

            @Override // p000.l74.InterfaceC8697x
            public String getName() {
                return ((C8696w) this.f86607b).getName();
            }

            @Override // p000.l74.InterfaceC8697x
            public wj1 getNameBytes() {
                return ((C8696w) this.f86607b).getNameBytes();
            }

            @Override // p000.l74.InterfaceC8697x
            public C8653a0 getOptions() {
                return ((C8696w) this.f86607b).getOptions();
            }

            @Override // p000.l74.InterfaceC8697x
            public String getPackage() {
                return ((C8696w) this.f86607b).getPackage();
            }

            @Override // p000.l74.InterfaceC8697x
            public wj1 getPackageBytes() {
                return ((C8696w) this.f86607b).getPackageBytes();
            }

            @Override // p000.l74.InterfaceC8697x
            public int getPublicDependency(int index) {
                return ((C8696w) this.f86607b).getPublicDependency(index);
            }

            @Override // p000.l74.InterfaceC8697x
            public int getPublicDependencyCount() {
                return ((C8696w) this.f86607b).getPublicDependencyCount();
            }

            @Override // p000.l74.InterfaceC8697x
            public List<Integer> getPublicDependencyList() {
                return Collections.unmodifiableList(((C8696w) this.f86607b).getPublicDependencyList());
            }

            @Override // p000.l74.InterfaceC8697x
            public C8681o0 getService(int index) {
                return ((C8696w) this.f86607b).getService(index);
            }

            @Override // p000.l74.InterfaceC8697x
            public int getServiceCount() {
                return ((C8696w) this.f86607b).getServiceCount();
            }

            @Override // p000.l74.InterfaceC8697x
            public List<C8681o0> getServiceList() {
                return Collections.unmodifiableList(((C8696w) this.f86607b).getServiceList());
            }

            @Override // p000.l74.InterfaceC8697x
            public C8689s0 getSourceCodeInfo() {
                return ((C8696w) this.f86607b).getSourceCodeInfo();
            }

            @Override // p000.l74.InterfaceC8697x
            public String getSyntax() {
                return ((C8696w) this.f86607b).getSyntax();
            }

            @Override // p000.l74.InterfaceC8697x
            public wj1 getSyntaxBytes() {
                return ((C8696w) this.f86607b).getSyntaxBytes();
            }

            @Override // p000.l74.InterfaceC8697x
            public int getWeakDependency(int index) {
                return ((C8696w) this.f86607b).getWeakDependency(index);
            }

            @Override // p000.l74.InterfaceC8697x
            public int getWeakDependencyCount() {
                return ((C8696w) this.f86607b).getWeakDependencyCount();
            }

            @Override // p000.l74.InterfaceC8697x
            public List<Integer> getWeakDependencyList() {
                return Collections.unmodifiableList(((C8696w) this.f86607b).getWeakDependencyList());
            }

            @Override // p000.l74.InterfaceC8697x
            public boolean hasEdition() {
                return ((C8696w) this.f86607b).hasEdition();
            }

            @Override // p000.l74.InterfaceC8697x
            public boolean hasName() {
                return ((C8696w) this.f86607b).hasName();
            }

            @Override // p000.l74.InterfaceC8697x
            public boolean hasOptions() {
                return ((C8696w) this.f86607b).hasOptions();
            }

            @Override // p000.l74.InterfaceC8697x
            public boolean hasPackage() {
                return ((C8696w) this.f86607b).hasPackage();
            }

            @Override // p000.l74.InterfaceC8697x
            public boolean hasSourceCodeInfo() {
                return ((C8696w) this.f86607b).hasSourceCodeInfo();
            }

            @Override // p000.l74.InterfaceC8697x
            public boolean hasSyntax() {
                return ((C8696w) this.f86607b).hasSyntax();
            }

            public a mergeOptions(C8653a0 value) {
                m23058e();
                ((C8696w) this.f86607b).mergeOptions(value);
                return this;
            }

            public a mergeSourceCodeInfo(C8689s0 value) {
                m23058e();
                ((C8696w) this.f86607b).mergeSourceCodeInfo(value);
                return this;
            }

            public a removeEnumType(int index) {
                m23058e();
                ((C8696w) this.f86607b).removeEnumType(index);
                return this;
            }

            public a removeExtension(int index) {
                m23058e();
                ((C8696w) this.f86607b).removeExtension(index);
                return this;
            }

            public a removeMessageType(int index) {
                m23058e();
                ((C8696w) this.f86607b).removeMessageType(index);
                return this;
            }

            public a removeService(int index) {
                m23058e();
                ((C8696w) this.f86607b).removeService(index);
                return this;
            }

            public a setDependency(int index, String value) {
                m23058e();
                ((C8696w) this.f86607b).setDependency(index, value);
                return this;
            }

            public a setEdition(EnumC8658d value) {
                m23058e();
                ((C8696w) this.f86607b).setEdition(value);
                return this;
            }

            public a setEnumType(int index, C8660e value) {
                m23058e();
                ((C8696w) this.f86607b).setEnumType(index, value);
                return this;
            }

            public a setExtension(int index, C8688s value) {
                m23058e();
                ((C8696w) this.f86607b).setExtension(index, value);
                return this;
            }

            public a setMessageType(int index, C8654b value) {
                m23058e();
                ((C8696w) this.f86607b).setMessageType(index, value);
                return this;
            }

            public a setName(String value) {
                m23058e();
                ((C8696w) this.f86607b).setName(value);
                return this;
            }

            public a setNameBytes(wj1 value) {
                m23058e();
                ((C8696w) this.f86607b).setNameBytes(value);
                return this;
            }

            public a setOptions(C8653a0 value) {
                m23058e();
                ((C8696w) this.f86607b).setOptions(value);
                return this;
            }

            public a setPackage(String value) {
                m23058e();
                ((C8696w) this.f86607b).setPackage(value);
                return this;
            }

            public a setPackageBytes(wj1 value) {
                m23058e();
                ((C8696w) this.f86607b).setPackageBytes(value);
                return this;
            }

            public a setPublicDependency(int index, int value) {
                m23058e();
                ((C8696w) this.f86607b).setPublicDependency(index, value);
                return this;
            }

            public a setService(int index, C8681o0 value) {
                m23058e();
                ((C8696w) this.f86607b).setService(index, value);
                return this;
            }

            public a setSourceCodeInfo(C8689s0 value) {
                m23058e();
                ((C8696w) this.f86607b).setSourceCodeInfo(value);
                return this;
            }

            public a setSyntax(String value) {
                m23058e();
                ((C8696w) this.f86607b).setSyntax(value);
                return this;
            }

            public a setSyntaxBytes(wj1 value) {
                m23058e();
                ((C8696w) this.f86607b).setSyntaxBytes(value);
                return this;
            }

            public a setWeakDependency(int index, int value) {
                m23058e();
                ((C8696w) this.f86607b).setWeakDependency(index, value);
                return this;
            }

            private a() {
                super(C8696w.DEFAULT_INSTANCE);
            }

            public a addEnumType(int index, C8660e value) {
                m23058e();
                ((C8696w) this.f86607b).addEnumType(index, value);
                return this;
            }

            public a addExtension(int index, C8688s value) {
                m23058e();
                ((C8696w) this.f86607b).addExtension(index, value);
                return this;
            }

            public a addMessageType(int index, C8654b value) {
                m23058e();
                ((C8696w) this.f86607b).addMessageType(index, value);
                return this;
            }

            public a addService(int index, C8681o0 value) {
                m23058e();
                ((C8696w) this.f86607b).addService(index, value);
                return this;
            }

            public a setEnumType(int index, C8660e.a builderForValue) {
                m23058e();
                ((C8696w) this.f86607b).setEnumType(index, builderForValue.build());
                return this;
            }

            public a setExtension(int index, C8688s.a builderForValue) {
                m23058e();
                ((C8696w) this.f86607b).setExtension(index, builderForValue.build());
                return this;
            }

            public a setMessageType(int index, C8654b.a builderForValue) {
                m23058e();
                ((C8696w) this.f86607b).setMessageType(index, builderForValue.build());
                return this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public a setOptions(C8653a0.a builderForValue) {
                m23058e();
                ((C8696w) this.f86607b).setOptions((C8653a0) builderForValue.build());
                return this;
            }

            public a setService(int index, C8681o0.a builderForValue) {
                m23058e();
                ((C8696w) this.f86607b).setService(index, builderForValue.build());
                return this;
            }

            public a setSourceCodeInfo(C8689s0.a builderForValue) {
                m23058e();
                ((C8696w) this.f86607b).setSourceCodeInfo(builderForValue.build());
                return this;
            }

            public a addEnumType(C8660e.a builderForValue) {
                m23058e();
                ((C8696w) this.f86607b).addEnumType(builderForValue.build());
                return this;
            }

            public a addExtension(C8688s.a builderForValue) {
                m23058e();
                ((C8696w) this.f86607b).addExtension(builderForValue.build());
                return this;
            }

            public a addMessageType(C8654b.a builderForValue) {
                m23058e();
                ((C8696w) this.f86607b).addMessageType(builderForValue.build());
                return this;
            }

            public a addService(C8681o0.a builderForValue) {
                m23058e();
                ((C8696w) this.f86607b).addService(builderForValue.build());
                return this;
            }

            public a addEnumType(int index, C8660e.a builderForValue) {
                m23058e();
                ((C8696w) this.f86607b).addEnumType(index, builderForValue.build());
                return this;
            }

            public a addExtension(int index, C8688s.a builderForValue) {
                m23058e();
                ((C8696w) this.f86607b).addExtension(index, builderForValue.build());
                return this;
            }

            public a addMessageType(int index, C8654b.a builderForValue) {
                m23058e();
                ((C8696w) this.f86607b).addMessageType(index, builderForValue.build());
                return this;
            }

            public a addService(int index, C8681o0.a builderForValue) {
                m23058e();
                ((C8696w) this.f86607b).addService(index, builderForValue.build());
                return this;
            }
        }

        static {
            C8696w c8696w = new C8696w();
            DEFAULT_INSTANCE = c8696w;
            u27.m23029g0(C8696w.class, c8696w);
        }

        private C8696w() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllDependency(Iterable<String> values) {
            ensureDependencyIsMutable();
            AbstractC0027a3.m80a(values, this.dependency_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllEnumType(Iterable<? extends C8660e> values) {
            ensureEnumTypeIsMutable();
            AbstractC0027a3.m80a(values, this.enumType_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllExtension(Iterable<? extends C8688s> values) {
            ensureExtensionIsMutable();
            AbstractC0027a3.m80a(values, this.extension_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllMessageType(Iterable<? extends C8654b> values) {
            ensureMessageTypeIsMutable();
            AbstractC0027a3.m80a(values, this.messageType_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllPublicDependency(Iterable<? extends Integer> values) {
            ensurePublicDependencyIsMutable();
            AbstractC0027a3.m80a(values, this.publicDependency_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllService(Iterable<? extends C8681o0> values) {
            ensureServiceIsMutable();
            AbstractC0027a3.m80a(values, this.service_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllWeakDependency(Iterable<? extends Integer> values) {
            ensureWeakDependencyIsMutable();
            AbstractC0027a3.m80a(values, this.weakDependency_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addDependency(String value) {
            value.getClass();
            ensureDependencyIsMutable();
            this.dependency_.add(value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addDependencyBytes(wj1 value) {
            ensureDependencyIsMutable();
            this.dependency_.add(value.toStringUtf8());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addEnumType(C8660e value) {
            value.getClass();
            ensureEnumTypeIsMutable();
            this.enumType_.add(value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addExtension(C8688s value) {
            value.getClass();
            ensureExtensionIsMutable();
            this.extension_.add(value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addMessageType(C8654b value) {
            value.getClass();
            ensureMessageTypeIsMutable();
            this.messageType_.add(value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addPublicDependency(int value) {
            ensurePublicDependencyIsMutable();
            this.publicDependency_.addInt(value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addService(C8681o0 value) {
            value.getClass();
            ensureServiceIsMutable();
            this.service_.add(value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addWeakDependency(int value) {
            ensureWeakDependencyIsMutable();
            this.weakDependency_.addInt(value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDependency() {
            this.dependency_ = u27.m23036w();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEdition() {
            this.bitField0_ &= -33;
            this.edition_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEnumType() {
            this.enumType_ = u27.m23036w();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearExtension() {
            this.extension_ = u27.m23036w();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMessageType() {
            this.messageType_ = u27.m23036w();
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
            this.publicDependency_ = u27.m23034u();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearService() {
            this.service_ = u27.m23036w();
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
            this.weakDependency_ = u27.m23034u();
        }

        private void ensureDependencyIsMutable() {
            v98.InterfaceC13956l<String> interfaceC13956l = this.dependency_;
            if (interfaceC13956l.isModifiable()) {
                return;
            }
            this.dependency_ = u27.m23012O(interfaceC13956l);
        }

        private void ensureEnumTypeIsMutable() {
            v98.InterfaceC13956l<C8660e> interfaceC13956l = this.enumType_;
            if (interfaceC13956l.isModifiable()) {
                return;
            }
            this.enumType_ = u27.m23012O(interfaceC13956l);
        }

        private void ensureExtensionIsMutable() {
            v98.InterfaceC13956l<C8688s> interfaceC13956l = this.extension_;
            if (interfaceC13956l.isModifiable()) {
                return;
            }
            this.extension_ = u27.m23012O(interfaceC13956l);
        }

        private void ensureMessageTypeIsMutable() {
            v98.InterfaceC13956l<C8654b> interfaceC13956l = this.messageType_;
            if (interfaceC13956l.isModifiable()) {
                return;
            }
            this.messageType_ = u27.m23012O(interfaceC13956l);
        }

        private void ensurePublicDependencyIsMutable() {
            v98.InterfaceC13951g interfaceC13951g = this.publicDependency_;
            if (interfaceC13951g.isModifiable()) {
                return;
            }
            this.publicDependency_ = u27.m23010M(interfaceC13951g);
        }

        private void ensureServiceIsMutable() {
            v98.InterfaceC13956l<C8681o0> interfaceC13956l = this.service_;
            if (interfaceC13956l.isModifiable()) {
                return;
            }
            this.service_ = u27.m23012O(interfaceC13956l);
        }

        private void ensureWeakDependencyIsMutable() {
            v98.InterfaceC13951g interfaceC13951g = this.weakDependency_;
            if (interfaceC13951g.isModifiable()) {
                return;
            }
            this.weakDependency_ = u27.m23010M(interfaceC13951g);
        }

        public static C8696w getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public void mergeOptions(C8653a0 value) {
            value.getClass();
            C8653a0 c8653a0 = this.options_;
            if (c8653a0 == null || c8653a0 == C8653a0.getDefaultInstance()) {
                this.options_ = value;
            } else {
                this.options_ = ((C8653a0.a) C8653a0.newBuilder(this.options_).mergeFrom(value)).buildPartial();
            }
            this.bitField0_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeSourceCodeInfo(C8689s0 value) {
            value.getClass();
            C8689s0 c8689s0 = this.sourceCodeInfo_;
            if (c8689s0 == null || c8689s0 == C8689s0.getDefaultInstance()) {
                this.sourceCodeInfo_ = value;
            } else {
                this.sourceCodeInfo_ = C8689s0.newBuilder(this.sourceCodeInfo_).mergeFrom(value).buildPartial();
            }
            this.bitField0_ |= 8;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.m23053m();
        }

        public static C8696w parseDelimitedFrom(InputStream input) throws IOException {
            return (C8696w) u27.m23014R(DEFAULT_INSTANCE, input);
        }

        public static C8696w parseFrom(ByteBuffer data) throws be8 {
            return (C8696w) u27.m23022Z(DEFAULT_INSTANCE, data);
        }

        public static vhc<C8696w> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeEnumType(int index) {
            ensureEnumTypeIsMutable();
            this.enumType_.remove(index);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeExtension(int index) {
            ensureExtensionIsMutable();
            this.extension_.remove(index);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeMessageType(int index) {
            ensureMessageTypeIsMutable();
            this.messageType_.remove(index);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeService(int index) {
            ensureServiceIsMutable();
            this.service_.remove(index);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDependency(int index, String value) {
            value.getClass();
            ensureDependencyIsMutable();
            this.dependency_.set(index, value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEdition(EnumC8658d value) {
            this.edition_ = value.getNumber();
            this.bitField0_ |= 32;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEnumType(int index, C8660e value) {
            value.getClass();
            ensureEnumTypeIsMutable();
            this.enumType_.set(index, value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setExtension(int index, C8688s value) {
            value.getClass();
            ensureExtensionIsMutable();
            this.extension_.set(index, value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMessageType(int index, C8654b value) {
            value.getClass();
            ensureMessageTypeIsMutable();
            this.messageType_.set(index, value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setName(String value) {
            value.getClass();
            this.bitField0_ |= 1;
            this.name_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNameBytes(wj1 value) {
            this.name_ = value.toStringUtf8();
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOptions(C8653a0 value) {
            value.getClass();
            this.options_ = value;
            this.bitField0_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPackage(String value) {
            value.getClass();
            this.bitField0_ |= 2;
            this.package_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPackageBytes(wj1 value) {
            this.package_ = value.toStringUtf8();
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPublicDependency(int index, int value) {
            ensurePublicDependencyIsMutable();
            this.publicDependency_.setInt(index, value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setService(int index, C8681o0 value) {
            value.getClass();
            ensureServiceIsMutable();
            this.service_.set(index, value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSourceCodeInfo(C8689s0 value) {
            value.getClass();
            this.sourceCodeInfo_ = value;
            this.bitField0_ |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSyntax(String value) {
            value.getClass();
            this.bitField0_ |= 16;
            this.syntax_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSyntaxBytes(wj1 value) {
            this.syntax_ = value.toStringUtf8();
            this.bitField0_ |= 16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWeakDependency(int index, int value) {
            ensureWeakDependencyIsMutable();
            this.weakDependency_.setInt(index, value);
        }

        @Override // p000.l74.InterfaceC8697x
        public String getDependency(int index) {
            return this.dependency_.get(index);
        }

        @Override // p000.l74.InterfaceC8697x
        public wj1 getDependencyBytes(int index) {
            return wj1.copyFromUtf8(this.dependency_.get(index));
        }

        @Override // p000.l74.InterfaceC8697x
        public int getDependencyCount() {
            return this.dependency_.size();
        }

        @Override // p000.l74.InterfaceC8697x
        public List<String> getDependencyList() {
            return this.dependency_;
        }

        @Override // p000.l74.InterfaceC8697x
        public EnumC8658d getEdition() {
            EnumC8658d enumC8658dForNumber = EnumC8658d.forNumber(this.edition_);
            return enumC8658dForNumber == null ? EnumC8658d.EDITION_UNKNOWN : enumC8658dForNumber;
        }

        @Override // p000.l74.InterfaceC8697x
        public C8660e getEnumType(int index) {
            return this.enumType_.get(index);
        }

        @Override // p000.l74.InterfaceC8697x
        public int getEnumTypeCount() {
            return this.enumType_.size();
        }

        @Override // p000.l74.InterfaceC8697x
        public List<C8660e> getEnumTypeList() {
            return this.enumType_;
        }

        public InterfaceC8662f getEnumTypeOrBuilder(int index) {
            return this.enumType_.get(index);
        }

        public List<? extends InterfaceC8662f> getEnumTypeOrBuilderList() {
            return this.enumType_;
        }

        @Override // p000.l74.InterfaceC8697x
        public C8688s getExtension(int index) {
            return this.extension_.get(index);
        }

        @Override // p000.l74.InterfaceC8697x
        public int getExtensionCount() {
            return this.extension_.size();
        }

        @Override // p000.l74.InterfaceC8697x
        public List<C8688s> getExtensionList() {
            return this.extension_;
        }

        public InterfaceC8690t getExtensionOrBuilder(int index) {
            return this.extension_.get(index);
        }

        public List<? extends InterfaceC8690t> getExtensionOrBuilderList() {
            return this.extension_;
        }

        @Override // p000.l74.InterfaceC8697x
        public C8654b getMessageType(int index) {
            return this.messageType_.get(index);
        }

        @Override // p000.l74.InterfaceC8697x
        public int getMessageTypeCount() {
            return this.messageType_.size();
        }

        @Override // p000.l74.InterfaceC8697x
        public List<C8654b> getMessageTypeList() {
            return this.messageType_;
        }

        public InterfaceC8656c getMessageTypeOrBuilder(int index) {
            return this.messageType_.get(index);
        }

        public List<? extends InterfaceC8656c> getMessageTypeOrBuilderList() {
            return this.messageType_;
        }

        @Override // p000.l74.InterfaceC8697x
        public String getName() {
            return this.name_;
        }

        @Override // p000.l74.InterfaceC8697x
        public wj1 getNameBytes() {
            return wj1.copyFromUtf8(this.name_);
        }

        @Override // p000.l74.InterfaceC8697x
        public C8653a0 getOptions() {
            C8653a0 c8653a0 = this.options_;
            return c8653a0 == null ? C8653a0.getDefaultInstance() : c8653a0;
        }

        @Override // p000.l74.InterfaceC8697x
        public String getPackage() {
            return this.package_;
        }

        @Override // p000.l74.InterfaceC8697x
        public wj1 getPackageBytes() {
            return wj1.copyFromUtf8(this.package_);
        }

        @Override // p000.l74.InterfaceC8697x
        public int getPublicDependency(int index) {
            return this.publicDependency_.getInt(index);
        }

        @Override // p000.l74.InterfaceC8697x
        public int getPublicDependencyCount() {
            return this.publicDependency_.size();
        }

        @Override // p000.l74.InterfaceC8697x
        public List<Integer> getPublicDependencyList() {
            return this.publicDependency_;
        }

        @Override // p000.l74.InterfaceC8697x
        public C8681o0 getService(int index) {
            return this.service_.get(index);
        }

        @Override // p000.l74.InterfaceC8697x
        public int getServiceCount() {
            return this.service_.size();
        }

        @Override // p000.l74.InterfaceC8697x
        public List<C8681o0> getServiceList() {
            return this.service_;
        }

        public InterfaceC8683p0 getServiceOrBuilder(int index) {
            return this.service_.get(index);
        }

        public List<? extends InterfaceC8683p0> getServiceOrBuilderList() {
            return this.service_;
        }

        @Override // p000.l74.InterfaceC8697x
        public C8689s0 getSourceCodeInfo() {
            C8689s0 c8689s0 = this.sourceCodeInfo_;
            return c8689s0 == null ? C8689s0.getDefaultInstance() : c8689s0;
        }

        @Override // p000.l74.InterfaceC8697x
        public String getSyntax() {
            return this.syntax_;
        }

        @Override // p000.l74.InterfaceC8697x
        public wj1 getSyntaxBytes() {
            return wj1.copyFromUtf8(this.syntax_);
        }

        @Override // p000.l74.InterfaceC8697x
        public int getWeakDependency(int index) {
            return this.weakDependency_.getInt(index);
        }

        @Override // p000.l74.InterfaceC8697x
        public int getWeakDependencyCount() {
            return this.weakDependency_.size();
        }

        @Override // p000.l74.InterfaceC8697x
        public List<Integer> getWeakDependencyList() {
            return this.weakDependency_;
        }

        @Override // p000.l74.InterfaceC8697x
        public boolean hasEdition() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // p000.l74.InterfaceC8697x
        public boolean hasName() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // p000.l74.InterfaceC8697x
        public boolean hasOptions() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // p000.l74.InterfaceC8697x
        public boolean hasPackage() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // p000.l74.InterfaceC8697x
        public boolean hasSourceCodeInfo() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // p000.l74.InterfaceC8697x
        public boolean hasSyntax() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // p000.u27
        /* JADX INFO: renamed from: q */
        public final Object mo79q(u27.EnumC13331i method, Object arg0, Object arg1) {
            C8652a c8652a = null;
            switch (C8652a.f56391a[method.ordinal()]) {
                case 1:
                    return new C8696w();
                case 2:
                    return new a(c8652a);
                case 3:
                    return u27.m23013P(DEFAULT_INSTANCE, "\u0001\r\u0000\u0001\u0001\u000e\r\u0000\u0007\u0005\u0001ဈ\u0000\u0002ဈ\u0001\u0003\u001a\u0004Л\u0005Л\u0006Л\u0007Л\bᐉ\u0002\tဉ\u0003\n\u0016\u000b\u0016\fဈ\u0004\u000e᠌\u0005", new Object[]{"bitField0_", "name_", "package_", "dependency_", "messageType_", C8654b.class, "enumType_", C8660e.class, "service_", C8681o0.class, "extension_", C8688s.class, "options_", "sourceCodeInfo_", "publicDependency_", "weakDependency_", "syntax_", "edition_", EnumC8658d.internalGetVerifier()});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    vhc<C8696w> c13325c = PARSER;
                    if (c13325c == null) {
                        synchronized (C8696w.class) {
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
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    this.memoizedIsInitialized = (byte) (arg0 == null ? 0 : 1);
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public static a newBuilder(C8696w prototype) {
            return DEFAULT_INSTANCE.m23054n(prototype);
        }

        public static C8696w parseDelimitedFrom(InputStream input, yi5 extensionRegistry) throws IOException {
            return (C8696w) u27.m23015S(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static C8696w parseFrom(ByteBuffer data, yi5 extensionRegistry) throws be8 {
            return (C8696w) u27.m23023a0(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static C8696w parseFrom(wj1 data) throws be8 {
            return (C8696w) u27.m23016T(DEFAULT_INSTANCE, data);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addEnumType(int index, C8660e value) {
            value.getClass();
            ensureEnumTypeIsMutable();
            this.enumType_.add(index, value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addExtension(int index, C8688s value) {
            value.getClass();
            ensureExtensionIsMutable();
            this.extension_.add(index, value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addMessageType(int index, C8654b value) {
            value.getClass();
            ensureMessageTypeIsMutable();
            this.messageType_.add(index, value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addService(int index, C8681o0 value) {
            value.getClass();
            ensureServiceIsMutable();
            this.service_.add(index, value);
        }

        public static C8696w parseFrom(wj1 data, yi5 extensionRegistry) throws be8 {
            return (C8696w) u27.m23017U(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static C8696w parseFrom(byte[] data) throws be8 {
            return (C8696w) u27.m23024b0(DEFAULT_INSTANCE, data);
        }

        public static C8696w parseFrom(byte[] data, yi5 extensionRegistry) throws be8 {
            return (C8696w) u27.m23025c0(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static C8696w parseFrom(InputStream input) throws IOException {
            return (C8696w) u27.m23020X(DEFAULT_INSTANCE, input);
        }

        public static C8696w parseFrom(InputStream input, yi5 extensionRegistry) throws IOException {
            return (C8696w) u27.m23021Y(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static C8696w parseFrom(e72 input) throws IOException {
            return (C8696w) u27.m23018V(DEFAULT_INSTANCE, input);
        }

        public static C8696w parseFrom(e72 input, yi5 extensionRegistry) throws IOException {
            return (C8696w) u27.m23019W(DEFAULT_INSTANCE, input, extensionRegistry);
        }
    }

    /* JADX INFO: renamed from: l74$x */
    public interface InterfaceC8697x extends ssa {
        String getDependency(int index);

        wj1 getDependencyBytes(int index);

        int getDependencyCount();

        List<String> getDependencyList();

        EnumC8658d getEdition();

        C8660e getEnumType(int index);

        int getEnumTypeCount();

        List<C8660e> getEnumTypeList();

        C8688s getExtension(int index);

        int getExtensionCount();

        List<C8688s> getExtensionList();

        C8654b getMessageType(int index);

        int getMessageTypeCount();

        List<C8654b> getMessageTypeList();

        String getName();

        wj1 getNameBytes();

        C8653a0 getOptions();

        String getPackage();

        wj1 getPackageBytes();

        int getPublicDependency(int index);

        int getPublicDependencyCount();

        List<Integer> getPublicDependencyList();

        C8681o0 getService(int index);

        int getServiceCount();

        List<C8681o0> getServiceList();

        C8689s0 getSourceCodeInfo();

        String getSyntax();

        wj1 getSyntaxBytes();

        int getWeakDependency(int index);

        int getWeakDependencyCount();

        List<Integer> getWeakDependencyList();

        boolean hasEdition();

        boolean hasName();

        boolean hasOptions();

        boolean hasPackage();

        boolean hasSourceCodeInfo();

        boolean hasSyntax();
    }

    /* JADX INFO: renamed from: l74$y */
    public static final class C8698y extends u27<C8698y, a> implements InterfaceC8699z {
        private static final C8698y DEFAULT_INSTANCE;
        public static final int FILE_FIELD_NUMBER = 1;
        private static volatile vhc<C8698y> PARSER;
        private byte memoizedIsInitialized = 2;
        private v98.InterfaceC13956l<C8696w> file_ = u27.m23036w();

        /* JADX INFO: renamed from: l74$y$a */
        public static final class a extends u27.AbstractC13324b<C8698y, a> implements InterfaceC8699z {
            public /* synthetic */ a(C8652a c8652a) {
                this();
            }

            public a addAllFile(Iterable<? extends C8696w> values) {
                m23058e();
                ((C8698y) this.f86607b).addAllFile(values);
                return this;
            }

            public a addFile(C8696w value) {
                m23058e();
                ((C8698y) this.f86607b).addFile(value);
                return this;
            }

            public a clearFile() {
                m23058e();
                ((C8698y) this.f86607b).clearFile();
                return this;
            }

            @Override // p000.l74.InterfaceC8699z
            public C8696w getFile(int index) {
                return ((C8698y) this.f86607b).getFile(index);
            }

            @Override // p000.l74.InterfaceC8699z
            public int getFileCount() {
                return ((C8698y) this.f86607b).getFileCount();
            }

            @Override // p000.l74.InterfaceC8699z
            public List<C8696w> getFileList() {
                return Collections.unmodifiableList(((C8698y) this.f86607b).getFileList());
            }

            public a removeFile(int index) {
                m23058e();
                ((C8698y) this.f86607b).removeFile(index);
                return this;
            }

            public a setFile(int index, C8696w value) {
                m23058e();
                ((C8698y) this.f86607b).setFile(index, value);
                return this;
            }

            private a() {
                super(C8698y.DEFAULT_INSTANCE);
            }

            public a addFile(int index, C8696w value) {
                m23058e();
                ((C8698y) this.f86607b).addFile(index, value);
                return this;
            }

            public a setFile(int index, C8696w.a builderForValue) {
                m23058e();
                ((C8698y) this.f86607b).setFile(index, builderForValue.build());
                return this;
            }

            public a addFile(C8696w.a builderForValue) {
                m23058e();
                ((C8698y) this.f86607b).addFile(builderForValue.build());
                return this;
            }

            public a addFile(int index, C8696w.a builderForValue) {
                m23058e();
                ((C8698y) this.f86607b).addFile(index, builderForValue.build());
                return this;
            }
        }

        static {
            C8698y c8698y = new C8698y();
            DEFAULT_INSTANCE = c8698y;
            u27.m23029g0(C8698y.class, c8698y);
        }

        private C8698y() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllFile(Iterable<? extends C8696w> values) {
            ensureFileIsMutable();
            AbstractC0027a3.m80a(values, this.file_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addFile(C8696w value) {
            value.getClass();
            ensureFileIsMutable();
            this.file_.add(value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFile() {
            this.file_ = u27.m23036w();
        }

        private void ensureFileIsMutable() {
            v98.InterfaceC13956l<C8696w> interfaceC13956l = this.file_;
            if (interfaceC13956l.isModifiable()) {
                return;
            }
            this.file_ = u27.m23012O(interfaceC13956l);
        }

        public static C8698y getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.m23053m();
        }

        public static C8698y parseDelimitedFrom(InputStream input) throws IOException {
            return (C8698y) u27.m23014R(DEFAULT_INSTANCE, input);
        }

        public static C8698y parseFrom(ByteBuffer data) throws be8 {
            return (C8698y) u27.m23022Z(DEFAULT_INSTANCE, data);
        }

        public static vhc<C8698y> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeFile(int index) {
            ensureFileIsMutable();
            this.file_.remove(index);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFile(int index, C8696w value) {
            value.getClass();
            ensureFileIsMutable();
            this.file_.set(index, value);
        }

        @Override // p000.l74.InterfaceC8699z
        public C8696w getFile(int index) {
            return this.file_.get(index);
        }

        @Override // p000.l74.InterfaceC8699z
        public int getFileCount() {
            return this.file_.size();
        }

        @Override // p000.l74.InterfaceC8699z
        public List<C8696w> getFileList() {
            return this.file_;
        }

        public InterfaceC8697x getFileOrBuilder(int index) {
            return this.file_.get(index);
        }

        public List<? extends InterfaceC8697x> getFileOrBuilderList() {
            return this.file_;
        }

        @Override // p000.u27
        /* JADX INFO: renamed from: q */
        public final Object mo79q(u27.EnumC13331i method, Object arg0, Object arg1) {
            C8652a c8652a = null;
            switch (C8652a.f56391a[method.ordinal()]) {
                case 1:
                    return new C8698y();
                case 2:
                    return new a(c8652a);
                case 3:
                    return u27.m23013P(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"file_", C8696w.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    vhc<C8698y> c13325c = PARSER;
                    if (c13325c == null) {
                        synchronized (C8698y.class) {
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
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    this.memoizedIsInitialized = (byte) (arg0 == null ? 0 : 1);
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public static a newBuilder(C8698y prototype) {
            return DEFAULT_INSTANCE.m23054n(prototype);
        }

        public static C8698y parseDelimitedFrom(InputStream input, yi5 extensionRegistry) throws IOException {
            return (C8698y) u27.m23015S(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static C8698y parseFrom(ByteBuffer data, yi5 extensionRegistry) throws be8 {
            return (C8698y) u27.m23023a0(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static C8698y parseFrom(wj1 data) throws be8 {
            return (C8698y) u27.m23016T(DEFAULT_INSTANCE, data);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addFile(int index, C8696w value) {
            value.getClass();
            ensureFileIsMutable();
            this.file_.add(index, value);
        }

        public static C8698y parseFrom(wj1 data, yi5 extensionRegistry) throws be8 {
            return (C8698y) u27.m23017U(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static C8698y parseFrom(byte[] data) throws be8 {
            return (C8698y) u27.m23024b0(DEFAULT_INSTANCE, data);
        }

        public static C8698y parseFrom(byte[] data, yi5 extensionRegistry) throws be8 {
            return (C8698y) u27.m23025c0(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static C8698y parseFrom(InputStream input) throws IOException {
            return (C8698y) u27.m23020X(DEFAULT_INSTANCE, input);
        }

        public static C8698y parseFrom(InputStream input, yi5 extensionRegistry) throws IOException {
            return (C8698y) u27.m23021Y(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static C8698y parseFrom(e72 input) throws IOException {
            return (C8698y) u27.m23018V(DEFAULT_INSTANCE, input);
        }

        public static C8698y parseFrom(e72 input, yi5 extensionRegistry) throws IOException {
            return (C8698y) u27.m23019W(DEFAULT_INSTANCE, input, extensionRegistry);
        }
    }

    /* JADX INFO: renamed from: l74$z */
    public interface InterfaceC8699z extends ssa {
        C8696w getFile(int index);

        int getFileCount();

        List<C8696w> getFileList();
    }

    private l74() {
    }

    public static void registerAllExtensions(yi5 registry) {
    }
}
