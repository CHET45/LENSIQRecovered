package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p000.gpi;
import p000.u27;
import p000.v98;

/* JADX INFO: loaded from: classes3.dex */
public final class l9d {

    /* JADX INFO: renamed from: l9d$a */
    public static /* synthetic */ class C8728a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f56905a;

        static {
            int[] iArr = new int[u27.EnumC13331i.values().length];
            f56905a = iArr;
            try {
                iArr[u27.EnumC13331i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f56905a[u27.EnumC13331i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f56905a[u27.EnumC13331i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f56905a[u27.EnumC13331i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f56905a[u27.EnumC13331i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f56905a[u27.EnumC13331i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f56905a[u27.EnumC13331i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: l9d$b */
    public static final class C8729b extends u27<C8729b, a> implements InterfaceC8730c {
        private static final C8729b DEFAULT_INSTANCE;
        private static volatile vhc<C8729b> PARSER = null;
        public static final int PREFERENCES_FIELD_NUMBER = 1;
        private ts9<String, C8733f> preferences_ = ts9.emptyMapField();

        /* JADX INFO: renamed from: l9d$b$a */
        public static final class a extends u27.AbstractC13324b<C8729b, a> implements InterfaceC8730c {
            public /* synthetic */ a(C8728a c8728a) {
                this();
            }

            public a clearPreferences() {
                m23058e();
                ((C8729b) this.f86607b).getMutablePreferencesMap().clear();
                return this;
            }

            @Override // p000.l9d.InterfaceC8730c
            public boolean containsPreferences(String str) {
                str.getClass();
                return ((C8729b) this.f86607b).getPreferencesMap().containsKey(str);
            }

            @Override // p000.l9d.InterfaceC8730c
            @Deprecated
            public Map<String, C8733f> getPreferences() {
                return getPreferencesMap();
            }

            @Override // p000.l9d.InterfaceC8730c
            public int getPreferencesCount() {
                return ((C8729b) this.f86607b).getPreferencesMap().size();
            }

            @Override // p000.l9d.InterfaceC8730c
            public Map<String, C8733f> getPreferencesMap() {
                return Collections.unmodifiableMap(((C8729b) this.f86607b).getPreferencesMap());
            }

            @Override // p000.l9d.InterfaceC8730c
            public C8733f getPreferencesOrDefault(String str, C8733f c8733f) {
                str.getClass();
                Map<String, C8733f> preferencesMap = ((C8729b) this.f86607b).getPreferencesMap();
                return preferencesMap.containsKey(str) ? preferencesMap.get(str) : c8733f;
            }

            @Override // p000.l9d.InterfaceC8730c
            public C8733f getPreferencesOrThrow(String str) {
                str.getClass();
                Map<String, C8733f> preferencesMap = ((C8729b) this.f86607b).getPreferencesMap();
                if (preferencesMap.containsKey(str)) {
                    return preferencesMap.get(str);
                }
                throw new IllegalArgumentException();
            }

            public a putAllPreferences(Map<String, C8733f> map) {
                m23058e();
                ((C8729b) this.f86607b).getMutablePreferencesMap().putAll(map);
                return this;
            }

            public a putPreferences(String str, C8733f c8733f) {
                str.getClass();
                c8733f.getClass();
                m23058e();
                ((C8729b) this.f86607b).getMutablePreferencesMap().put(str, c8733f);
                return this;
            }

            public a removePreferences(String str) {
                str.getClass();
                m23058e();
                ((C8729b) this.f86607b).getMutablePreferencesMap().remove(str);
                return this;
            }

            private a() {
                super(C8729b.DEFAULT_INSTANCE);
            }
        }

        /* JADX INFO: renamed from: l9d$b$b */
        public static final class b {

            /* JADX INFO: renamed from: a */
            public static final ns9<String, C8733f> f56906a = ns9.newDefaultInstance(gpi.EnumC6460b.f40751L, "", gpi.EnumC6460b.f40754N, C8733f.getDefaultInstance());

            private b() {
            }
        }

        static {
            C8729b c8729b = new C8729b();
            DEFAULT_INSTANCE = c8729b;
            u27.m23029g0(C8729b.class, c8729b);
        }

        private C8729b() {
        }

        public static C8729b getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Map<String, C8733f> getMutablePreferencesMap() {
            return internalGetMutablePreferences();
        }

        private ts9<String, C8733f> internalGetMutablePreferences() {
            if (!this.preferences_.isMutable()) {
                this.preferences_ = this.preferences_.mutableCopy();
            }
            return this.preferences_;
        }

        private ts9<String, C8733f> internalGetPreferences() {
            return this.preferences_;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.m23053m();
        }

        public static C8729b parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (C8729b) u27.m23014R(DEFAULT_INSTANCE, inputStream);
        }

        public static C8729b parseFrom(ByteBuffer byteBuffer) throws be8 {
            return (C8729b) u27.m23022Z(DEFAULT_INSTANCE, byteBuffer);
        }

        public static vhc<C8729b> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // p000.l9d.InterfaceC8730c
        public boolean containsPreferences(String str) {
            str.getClass();
            return internalGetPreferences().containsKey(str);
        }

        @Override // p000.l9d.InterfaceC8730c
        @Deprecated
        public Map<String, C8733f> getPreferences() {
            return getPreferencesMap();
        }

        @Override // p000.l9d.InterfaceC8730c
        public int getPreferencesCount() {
            return internalGetPreferences().size();
        }

        @Override // p000.l9d.InterfaceC8730c
        public Map<String, C8733f> getPreferencesMap() {
            return Collections.unmodifiableMap(internalGetPreferences());
        }

        @Override // p000.l9d.InterfaceC8730c
        public C8733f getPreferencesOrDefault(String str, C8733f c8733f) {
            str.getClass();
            ts9<String, C8733f> ts9VarInternalGetPreferences = internalGetPreferences();
            return ts9VarInternalGetPreferences.containsKey(str) ? ts9VarInternalGetPreferences.get(str) : c8733f;
        }

        @Override // p000.l9d.InterfaceC8730c
        public C8733f getPreferencesOrThrow(String str) {
            str.getClass();
            ts9<String, C8733f> ts9VarInternalGetPreferences = internalGetPreferences();
            if (ts9VarInternalGetPreferences.containsKey(str)) {
                return ts9VarInternalGetPreferences.get(str);
            }
            throw new IllegalArgumentException();
        }

        @Override // p000.u27
        /* JADX INFO: renamed from: q */
        public final Object mo79q(u27.EnumC13331i enumC13331i, Object obj, Object obj2) {
            C8728a c8728a = null;
            switch (C8728a.f56905a[enumC13331i.ordinal()]) {
                case 1:
                    return new C8729b();
                case 2:
                    return new a(c8728a);
                case 3:
                    return u27.m23013P(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", b.f56906a});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    vhc<C8729b> c13325c = PARSER;
                    if (c13325c == null) {
                        synchronized (C8729b.class) {
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

        public static a newBuilder(C8729b c8729b) {
            return DEFAULT_INSTANCE.m23054n(c8729b);
        }

        public static C8729b parseDelimitedFrom(InputStream inputStream, yi5 yi5Var) throws IOException {
            return (C8729b) u27.m23015S(DEFAULT_INSTANCE, inputStream, yi5Var);
        }

        public static C8729b parseFrom(ByteBuffer byteBuffer, yi5 yi5Var) throws be8 {
            return (C8729b) u27.m23023a0(DEFAULT_INSTANCE, byteBuffer, yi5Var);
        }

        public static C8729b parseFrom(wj1 wj1Var) throws be8 {
            return (C8729b) u27.m23016T(DEFAULT_INSTANCE, wj1Var);
        }

        public static C8729b parseFrom(wj1 wj1Var, yi5 yi5Var) throws be8 {
            return (C8729b) u27.m23017U(DEFAULT_INSTANCE, wj1Var, yi5Var);
        }

        public static C8729b parseFrom(byte[] bArr) throws be8 {
            return (C8729b) u27.m23024b0(DEFAULT_INSTANCE, bArr);
        }

        public static C8729b parseFrom(byte[] bArr, yi5 yi5Var) throws be8 {
            return (C8729b) u27.m23025c0(DEFAULT_INSTANCE, bArr, yi5Var);
        }

        public static C8729b parseFrom(InputStream inputStream) throws IOException {
            return (C8729b) u27.m23020X(DEFAULT_INSTANCE, inputStream);
        }

        public static C8729b parseFrom(InputStream inputStream, yi5 yi5Var) throws IOException {
            return (C8729b) u27.m23021Y(DEFAULT_INSTANCE, inputStream, yi5Var);
        }

        public static C8729b parseFrom(e72 e72Var) throws IOException {
            return (C8729b) u27.m23018V(DEFAULT_INSTANCE, e72Var);
        }

        public static C8729b parseFrom(e72 e72Var, yi5 yi5Var) throws IOException {
            return (C8729b) u27.m23019W(DEFAULT_INSTANCE, e72Var, yi5Var);
        }
    }

    /* JADX INFO: renamed from: l9d$c */
    public interface InterfaceC8730c extends ssa {
        boolean containsPreferences(String str);

        @Deprecated
        Map<String, C8733f> getPreferences();

        int getPreferencesCount();

        Map<String, C8733f> getPreferencesMap();

        C8733f getPreferencesOrDefault(String str, C8733f c8733f);

        C8733f getPreferencesOrThrow(String str);
    }

    /* JADX INFO: renamed from: l9d$d */
    public static final class C8731d extends u27<C8731d, a> implements InterfaceC8732e {
        private static final C8731d DEFAULT_INSTANCE;
        private static volatile vhc<C8731d> PARSER = null;
        public static final int STRINGS_FIELD_NUMBER = 1;
        private v98.InterfaceC13956l<String> strings_ = u27.m23036w();

        /* JADX INFO: renamed from: l9d$d$a */
        public static final class a extends u27.AbstractC13324b<C8731d, a> implements InterfaceC8732e {
            public /* synthetic */ a(C8728a c8728a) {
                this();
            }

            public a addAllStrings(Iterable<String> iterable) {
                m23058e();
                ((C8731d) this.f86607b).addAllStrings(iterable);
                return this;
            }

            public a addStrings(String str) {
                m23058e();
                ((C8731d) this.f86607b).addStrings(str);
                return this;
            }

            public a addStringsBytes(wj1 wj1Var) {
                m23058e();
                ((C8731d) this.f86607b).addStringsBytes(wj1Var);
                return this;
            }

            public a clearStrings() {
                m23058e();
                ((C8731d) this.f86607b).clearStrings();
                return this;
            }

            @Override // p000.l9d.InterfaceC8732e
            public String getStrings(int i) {
                return ((C8731d) this.f86607b).getStrings(i);
            }

            @Override // p000.l9d.InterfaceC8732e
            public wj1 getStringsBytes(int i) {
                return ((C8731d) this.f86607b).getStringsBytes(i);
            }

            @Override // p000.l9d.InterfaceC8732e
            public int getStringsCount() {
                return ((C8731d) this.f86607b).getStringsCount();
            }

            @Override // p000.l9d.InterfaceC8732e
            public List<String> getStringsList() {
                return Collections.unmodifiableList(((C8731d) this.f86607b).getStringsList());
            }

            public a setStrings(int i, String str) {
                m23058e();
                ((C8731d) this.f86607b).setStrings(i, str);
                return this;
            }

            private a() {
                super(C8731d.DEFAULT_INSTANCE);
            }
        }

        static {
            C8731d c8731d = new C8731d();
            DEFAULT_INSTANCE = c8731d;
            u27.m23029g0(C8731d.class, c8731d);
        }

        private C8731d() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllStrings(Iterable<String> iterable) {
            ensureStringsIsMutable();
            AbstractC0027a3.m80a(iterable, this.strings_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addStrings(String str) {
            str.getClass();
            ensureStringsIsMutable();
            this.strings_.add(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addStringsBytes(wj1 wj1Var) {
            ensureStringsIsMutable();
            this.strings_.add(wj1Var.toStringUtf8());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStrings() {
            this.strings_ = u27.m23036w();
        }

        private void ensureStringsIsMutable() {
            v98.InterfaceC13956l<String> interfaceC13956l = this.strings_;
            if (interfaceC13956l.isModifiable()) {
                return;
            }
            this.strings_ = u27.m23012O(interfaceC13956l);
        }

        public static C8731d getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.m23053m();
        }

        public static C8731d parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (C8731d) u27.m23014R(DEFAULT_INSTANCE, inputStream);
        }

        public static C8731d parseFrom(ByteBuffer byteBuffer) throws be8 {
            return (C8731d) u27.m23022Z(DEFAULT_INSTANCE, byteBuffer);
        }

        public static vhc<C8731d> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStrings(int i, String str) {
            str.getClass();
            ensureStringsIsMutable();
            this.strings_.set(i, str);
        }

        @Override // p000.l9d.InterfaceC8732e
        public String getStrings(int i) {
            return this.strings_.get(i);
        }

        @Override // p000.l9d.InterfaceC8732e
        public wj1 getStringsBytes(int i) {
            return wj1.copyFromUtf8(this.strings_.get(i));
        }

        @Override // p000.l9d.InterfaceC8732e
        public int getStringsCount() {
            return this.strings_.size();
        }

        @Override // p000.l9d.InterfaceC8732e
        public List<String> getStringsList() {
            return this.strings_;
        }

        @Override // p000.u27
        /* JADX INFO: renamed from: q */
        public final Object mo79q(u27.EnumC13331i enumC13331i, Object obj, Object obj2) {
            C8728a c8728a = null;
            switch (C8728a.f56905a[enumC13331i.ordinal()]) {
                case 1:
                    return new C8731d();
                case 2:
                    return new a(c8728a);
                case 3:
                    return u27.m23013P(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    vhc<C8731d> c13325c = PARSER;
                    if (c13325c == null) {
                        synchronized (C8731d.class) {
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

        public static a newBuilder(C8731d c8731d) {
            return DEFAULT_INSTANCE.m23054n(c8731d);
        }

        public static C8731d parseDelimitedFrom(InputStream inputStream, yi5 yi5Var) throws IOException {
            return (C8731d) u27.m23015S(DEFAULT_INSTANCE, inputStream, yi5Var);
        }

        public static C8731d parseFrom(ByteBuffer byteBuffer, yi5 yi5Var) throws be8 {
            return (C8731d) u27.m23023a0(DEFAULT_INSTANCE, byteBuffer, yi5Var);
        }

        public static C8731d parseFrom(wj1 wj1Var) throws be8 {
            return (C8731d) u27.m23016T(DEFAULT_INSTANCE, wj1Var);
        }

        public static C8731d parseFrom(wj1 wj1Var, yi5 yi5Var) throws be8 {
            return (C8731d) u27.m23017U(DEFAULT_INSTANCE, wj1Var, yi5Var);
        }

        public static C8731d parseFrom(byte[] bArr) throws be8 {
            return (C8731d) u27.m23024b0(DEFAULT_INSTANCE, bArr);
        }

        public static C8731d parseFrom(byte[] bArr, yi5 yi5Var) throws be8 {
            return (C8731d) u27.m23025c0(DEFAULT_INSTANCE, bArr, yi5Var);
        }

        public static C8731d parseFrom(InputStream inputStream) throws IOException {
            return (C8731d) u27.m23020X(DEFAULT_INSTANCE, inputStream);
        }

        public static C8731d parseFrom(InputStream inputStream, yi5 yi5Var) throws IOException {
            return (C8731d) u27.m23021Y(DEFAULT_INSTANCE, inputStream, yi5Var);
        }

        public static C8731d parseFrom(e72 e72Var) throws IOException {
            return (C8731d) u27.m23018V(DEFAULT_INSTANCE, e72Var);
        }

        public static C8731d parseFrom(e72 e72Var, yi5 yi5Var) throws IOException {
            return (C8731d) u27.m23019W(DEFAULT_INSTANCE, e72Var, yi5Var);
        }
    }

    /* JADX INFO: renamed from: l9d$e */
    public interface InterfaceC8732e extends ssa {
        String getStrings(int i);

        wj1 getStringsBytes(int i);

        int getStringsCount();

        List<String> getStringsList();
    }

    /* JADX INFO: renamed from: l9d$f */
    public static final class C8733f extends u27<C8733f, a> implements InterfaceC8734g {
        public static final int BOOLEAN_FIELD_NUMBER = 1;
        public static final int BYTES_FIELD_NUMBER = 8;
        private static final C8733f DEFAULT_INSTANCE;
        public static final int DOUBLE_FIELD_NUMBER = 7;
        public static final int FLOAT_FIELD_NUMBER = 2;
        public static final int INTEGER_FIELD_NUMBER = 3;
        public static final int LONG_FIELD_NUMBER = 4;
        private static volatile vhc<C8733f> PARSER = null;
        public static final int STRING_FIELD_NUMBER = 5;
        public static final int STRING_SET_FIELD_NUMBER = 6;
        private int valueCase_ = 0;
        private Object value_;

        /* JADX INFO: renamed from: l9d$f$a */
        public static final class a extends u27.AbstractC13324b<C8733f, a> implements InterfaceC8734g {
            public /* synthetic */ a(C8728a c8728a) {
                this();
            }

            public a clearBoolean() {
                m23058e();
                ((C8733f) this.f86607b).clearBoolean();
                return this;
            }

            public a clearBytes() {
                m23058e();
                ((C8733f) this.f86607b).clearBytes();
                return this;
            }

            public a clearDouble() {
                m23058e();
                ((C8733f) this.f86607b).clearDouble();
                return this;
            }

            public a clearFloat() {
                m23058e();
                ((C8733f) this.f86607b).clearFloat();
                return this;
            }

            public a clearInteger() {
                m23058e();
                ((C8733f) this.f86607b).clearInteger();
                return this;
            }

            public a clearLong() {
                m23058e();
                ((C8733f) this.f86607b).clearLong();
                return this;
            }

            public a clearString() {
                m23058e();
                ((C8733f) this.f86607b).clearString();
                return this;
            }

            public a clearStringSet() {
                m23058e();
                ((C8733f) this.f86607b).clearStringSet();
                return this;
            }

            public a clearValue() {
                m23058e();
                ((C8733f) this.f86607b).clearValue();
                return this;
            }

            @Override // p000.l9d.InterfaceC8734g
            public boolean getBoolean() {
                return ((C8733f) this.f86607b).getBoolean();
            }

            @Override // p000.l9d.InterfaceC8734g
            public wj1 getBytes() {
                return ((C8733f) this.f86607b).getBytes();
            }

            @Override // p000.l9d.InterfaceC8734g
            public double getDouble() {
                return ((C8733f) this.f86607b).getDouble();
            }

            @Override // p000.l9d.InterfaceC8734g
            public float getFloat() {
                return ((C8733f) this.f86607b).getFloat();
            }

            @Override // p000.l9d.InterfaceC8734g
            public int getInteger() {
                return ((C8733f) this.f86607b).getInteger();
            }

            @Override // p000.l9d.InterfaceC8734g
            public long getLong() {
                return ((C8733f) this.f86607b).getLong();
            }

            @Override // p000.l9d.InterfaceC8734g
            public String getString() {
                return ((C8733f) this.f86607b).getString();
            }

            @Override // p000.l9d.InterfaceC8734g
            public wj1 getStringBytes() {
                return ((C8733f) this.f86607b).getStringBytes();
            }

            @Override // p000.l9d.InterfaceC8734g
            public C8731d getStringSet() {
                return ((C8733f) this.f86607b).getStringSet();
            }

            @Override // p000.l9d.InterfaceC8734g
            public b getValueCase() {
                return ((C8733f) this.f86607b).getValueCase();
            }

            @Override // p000.l9d.InterfaceC8734g
            public boolean hasBoolean() {
                return ((C8733f) this.f86607b).hasBoolean();
            }

            @Override // p000.l9d.InterfaceC8734g
            public boolean hasBytes() {
                return ((C8733f) this.f86607b).hasBytes();
            }

            @Override // p000.l9d.InterfaceC8734g
            public boolean hasDouble() {
                return ((C8733f) this.f86607b).hasDouble();
            }

            @Override // p000.l9d.InterfaceC8734g
            public boolean hasFloat() {
                return ((C8733f) this.f86607b).hasFloat();
            }

            @Override // p000.l9d.InterfaceC8734g
            public boolean hasInteger() {
                return ((C8733f) this.f86607b).hasInteger();
            }

            @Override // p000.l9d.InterfaceC8734g
            public boolean hasLong() {
                return ((C8733f) this.f86607b).hasLong();
            }

            @Override // p000.l9d.InterfaceC8734g
            public boolean hasString() {
                return ((C8733f) this.f86607b).hasString();
            }

            @Override // p000.l9d.InterfaceC8734g
            public boolean hasStringSet() {
                return ((C8733f) this.f86607b).hasStringSet();
            }

            public a mergeStringSet(C8731d c8731d) {
                m23058e();
                ((C8733f) this.f86607b).mergeStringSet(c8731d);
                return this;
            }

            public a setBoolean(boolean z) {
                m23058e();
                ((C8733f) this.f86607b).setBoolean(z);
                return this;
            }

            public a setBytes(wj1 wj1Var) {
                m23058e();
                ((C8733f) this.f86607b).setBytes(wj1Var);
                return this;
            }

            public a setDouble(double d) {
                m23058e();
                ((C8733f) this.f86607b).setDouble(d);
                return this;
            }

            public a setFloat(float f) {
                m23058e();
                ((C8733f) this.f86607b).setFloat(f);
                return this;
            }

            public a setInteger(int i) {
                m23058e();
                ((C8733f) this.f86607b).setInteger(i);
                return this;
            }

            public a setLong(long j) {
                m23058e();
                ((C8733f) this.f86607b).setLong(j);
                return this;
            }

            public a setString(String str) {
                m23058e();
                ((C8733f) this.f86607b).setString(str);
                return this;
            }

            public a setStringBytes(wj1 wj1Var) {
                m23058e();
                ((C8733f) this.f86607b).setStringBytes(wj1Var);
                return this;
            }

            public a setStringSet(C8731d c8731d) {
                m23058e();
                ((C8733f) this.f86607b).setStringSet(c8731d);
                return this;
            }

            private a() {
                super(C8733f.DEFAULT_INSTANCE);
            }

            public a setStringSet(C8731d.a aVar) {
                m23058e();
                ((C8733f) this.f86607b).setStringSet(aVar.build());
                return this;
            }
        }

        /* JADX INFO: renamed from: l9d$f$b */
        public enum b {
            BOOLEAN(1),
            FLOAT(2),
            INTEGER(3),
            LONG(4),
            STRING(5),
            STRING_SET(6),
            DOUBLE(7),
            BYTES(8),
            VALUE_NOT_SET(0);


            /* JADX INFO: renamed from: a */
            public final int f56917a;

            b(int i) {
                this.f56917a = i;
            }

            public static b forNumber(int i) {
                switch (i) {
                    case 0:
                        return VALUE_NOT_SET;
                    case 1:
                        return BOOLEAN;
                    case 2:
                        return FLOAT;
                    case 3:
                        return INTEGER;
                    case 4:
                        return LONG;
                    case 5:
                        return STRING;
                    case 6:
                        return STRING_SET;
                    case 7:
                        return DOUBLE;
                    case 8:
                        return BYTES;
                    default:
                        return null;
                }
            }

            public int getNumber() {
                return this.f56917a;
            }

            @Deprecated
            public static b valueOf(int i) {
                return forNumber(i);
            }
        }

        static {
            C8733f c8733f = new C8733f();
            DEFAULT_INSTANCE = c8733f;
            u27.m23029g0(C8733f.class, c8733f);
        }

        private C8733f() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBoolean() {
            if (this.valueCase_ == 1) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBytes() {
            if (this.valueCase_ == 8) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDouble() {
            if (this.valueCase_ == 7) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFloat() {
            if (this.valueCase_ == 2) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearInteger() {
            if (this.valueCase_ == 3) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLong() {
            if (this.valueCase_ == 4) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearString() {
            if (this.valueCase_ == 5) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStringSet() {
            if (this.valueCase_ == 6) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearValue() {
            this.valueCase_ = 0;
            this.value_ = null;
        }

        public static C8733f getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeStringSet(C8731d c8731d) {
            c8731d.getClass();
            if (this.valueCase_ != 6 || this.value_ == C8731d.getDefaultInstance()) {
                this.value_ = c8731d;
            } else {
                this.value_ = C8731d.newBuilder((C8731d) this.value_).mergeFrom(c8731d).buildPartial();
            }
            this.valueCase_ = 6;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.m23053m();
        }

        public static C8733f parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (C8733f) u27.m23014R(DEFAULT_INSTANCE, inputStream);
        }

        public static C8733f parseFrom(ByteBuffer byteBuffer) throws be8 {
            return (C8733f) u27.m23022Z(DEFAULT_INSTANCE, byteBuffer);
        }

        public static vhc<C8733f> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBoolean(boolean z) {
            this.valueCase_ = 1;
            this.value_ = Boolean.valueOf(z);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBytes(wj1 wj1Var) {
            wj1Var.getClass();
            this.valueCase_ = 8;
            this.value_ = wj1Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDouble(double d) {
            this.valueCase_ = 7;
            this.value_ = Double.valueOf(d);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFloat(float f) {
            this.valueCase_ = 2;
            this.value_ = Float.valueOf(f);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setInteger(int i) {
            this.valueCase_ = 3;
            this.value_ = Integer.valueOf(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLong(long j) {
            this.valueCase_ = 4;
            this.value_ = Long.valueOf(j);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setString(String str) {
            str.getClass();
            this.valueCase_ = 5;
            this.value_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStringBytes(wj1 wj1Var) {
            this.value_ = wj1Var.toStringUtf8();
            this.valueCase_ = 5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStringSet(C8731d c8731d) {
            c8731d.getClass();
            this.value_ = c8731d;
            this.valueCase_ = 6;
        }

        @Override // p000.l9d.InterfaceC8734g
        public boolean getBoolean() {
            if (this.valueCase_ == 1) {
                return ((Boolean) this.value_).booleanValue();
            }
            return false;
        }

        @Override // p000.l9d.InterfaceC8734g
        public wj1 getBytes() {
            return this.valueCase_ == 8 ? (wj1) this.value_ : wj1.f94379e;
        }

        @Override // p000.l9d.InterfaceC8734g
        public double getDouble() {
            if (this.valueCase_ == 7) {
                return ((Double) this.value_).doubleValue();
            }
            return 0.0d;
        }

        @Override // p000.l9d.InterfaceC8734g
        public float getFloat() {
            if (this.valueCase_ == 2) {
                return ((Float) this.value_).floatValue();
            }
            return 0.0f;
        }

        @Override // p000.l9d.InterfaceC8734g
        public int getInteger() {
            if (this.valueCase_ == 3) {
                return ((Integer) this.value_).intValue();
            }
            return 0;
        }

        @Override // p000.l9d.InterfaceC8734g
        public long getLong() {
            if (this.valueCase_ == 4) {
                return ((Long) this.value_).longValue();
            }
            return 0L;
        }

        @Override // p000.l9d.InterfaceC8734g
        public String getString() {
            return this.valueCase_ == 5 ? (String) this.value_ : "";
        }

        @Override // p000.l9d.InterfaceC8734g
        public wj1 getStringBytes() {
            return wj1.copyFromUtf8(this.valueCase_ == 5 ? (String) this.value_ : "");
        }

        @Override // p000.l9d.InterfaceC8734g
        public C8731d getStringSet() {
            return this.valueCase_ == 6 ? (C8731d) this.value_ : C8731d.getDefaultInstance();
        }

        @Override // p000.l9d.InterfaceC8734g
        public b getValueCase() {
            return b.forNumber(this.valueCase_);
        }

        @Override // p000.l9d.InterfaceC8734g
        public boolean hasBoolean() {
            return this.valueCase_ == 1;
        }

        @Override // p000.l9d.InterfaceC8734g
        public boolean hasBytes() {
            return this.valueCase_ == 8;
        }

        @Override // p000.l9d.InterfaceC8734g
        public boolean hasDouble() {
            return this.valueCase_ == 7;
        }

        @Override // p000.l9d.InterfaceC8734g
        public boolean hasFloat() {
            return this.valueCase_ == 2;
        }

        @Override // p000.l9d.InterfaceC8734g
        public boolean hasInteger() {
            return this.valueCase_ == 3;
        }

        @Override // p000.l9d.InterfaceC8734g
        public boolean hasLong() {
            return this.valueCase_ == 4;
        }

        @Override // p000.l9d.InterfaceC8734g
        public boolean hasString() {
            return this.valueCase_ == 5;
        }

        @Override // p000.l9d.InterfaceC8734g
        public boolean hasStringSet() {
            return this.valueCase_ == 6;
        }

        @Override // p000.u27
        /* JADX INFO: renamed from: q */
        public final Object mo79q(u27.EnumC13331i enumC13331i, Object obj, Object obj2) {
            C8728a c8728a = null;
            switch (C8728a.f56905a[enumC13331i.ordinal()]) {
                case 1:
                    return new C8733f();
                case 2:
                    return new a(c8728a);
                case 3:
                    return u27.m23013P(DEFAULT_INSTANCE, "\u0001\b\u0001\u0000\u0001\b\b\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000\b=\u0000", new Object[]{"value_", "valueCase_", C8731d.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    vhc<C8733f> c13325c = PARSER;
                    if (c13325c == null) {
                        synchronized (C8733f.class) {
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

        public static a newBuilder(C8733f c8733f) {
            return DEFAULT_INSTANCE.m23054n(c8733f);
        }

        public static C8733f parseDelimitedFrom(InputStream inputStream, yi5 yi5Var) throws IOException {
            return (C8733f) u27.m23015S(DEFAULT_INSTANCE, inputStream, yi5Var);
        }

        public static C8733f parseFrom(ByteBuffer byteBuffer, yi5 yi5Var) throws be8 {
            return (C8733f) u27.m23023a0(DEFAULT_INSTANCE, byteBuffer, yi5Var);
        }

        public static C8733f parseFrom(wj1 wj1Var) throws be8 {
            return (C8733f) u27.m23016T(DEFAULT_INSTANCE, wj1Var);
        }

        public static C8733f parseFrom(wj1 wj1Var, yi5 yi5Var) throws be8 {
            return (C8733f) u27.m23017U(DEFAULT_INSTANCE, wj1Var, yi5Var);
        }

        public static C8733f parseFrom(byte[] bArr) throws be8 {
            return (C8733f) u27.m23024b0(DEFAULT_INSTANCE, bArr);
        }

        public static C8733f parseFrom(byte[] bArr, yi5 yi5Var) throws be8 {
            return (C8733f) u27.m23025c0(DEFAULT_INSTANCE, bArr, yi5Var);
        }

        public static C8733f parseFrom(InputStream inputStream) throws IOException {
            return (C8733f) u27.m23020X(DEFAULT_INSTANCE, inputStream);
        }

        public static C8733f parseFrom(InputStream inputStream, yi5 yi5Var) throws IOException {
            return (C8733f) u27.m23021Y(DEFAULT_INSTANCE, inputStream, yi5Var);
        }

        public static C8733f parseFrom(e72 e72Var) throws IOException {
            return (C8733f) u27.m23018V(DEFAULT_INSTANCE, e72Var);
        }

        public static C8733f parseFrom(e72 e72Var, yi5 yi5Var) throws IOException {
            return (C8733f) u27.m23019W(DEFAULT_INSTANCE, e72Var, yi5Var);
        }
    }

    /* JADX INFO: renamed from: l9d$g */
    public interface InterfaceC8734g extends ssa {
        boolean getBoolean();

        wj1 getBytes();

        double getDouble();

        float getFloat();

        int getInteger();

        long getLong();

        String getString();

        wj1 getStringBytes();

        C8731d getStringSet();

        C8733f.b getValueCase();

        boolean hasBoolean();

        boolean hasBytes();

        boolean hasDouble();

        boolean hasFloat();

        boolean hasInteger();

        boolean hasLong();

        boolean hasString();

        boolean hasStringSet();
    }

    private l9d() {
    }

    public static void registerAllExtensions(yi5 yi5Var) {
    }
}
