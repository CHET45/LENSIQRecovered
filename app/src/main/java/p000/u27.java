package p000;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p000.AbstractC0027a3;
import p000.c60;
import p000.gpi;
import p000.psa;
import p000.u27;
import p000.u27.AbstractC13324b;
import p000.v98;
import p000.zr5;

/* JADX INFO: loaded from: classes3.dex */
public abstract class u27<MessageType extends u27<MessageType, BuilderType>, BuilderType extends AbstractC13324b<MessageType, BuilderType>> extends AbstractC0027a3<MessageType, BuilderType> {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, u27<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize = -1;
    protected uth unknownFields = uth.getDefaultInstance();

    /* JADX INFO: renamed from: u27$a */
    public static /* synthetic */ class C13323a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f86605a;

        static {
            int[] iArr = new int[gpi.EnumC6461c.values().length];
            f86605a = iArr;
            try {
                iArr[gpi.EnumC6461c.MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f86605a[gpi.EnumC6461c.ENUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: u27$b */
    public static abstract class AbstractC13324b<MessageType extends u27<MessageType, BuilderType>, BuilderType extends AbstractC13324b<MessageType, BuilderType>> extends AbstractC0027a3.a<MessageType, BuilderType> {

        /* JADX INFO: renamed from: a */
        public final MessageType f86606a;

        /* JADX INFO: renamed from: b */
        public MessageType f86607b;

        public AbstractC13324b(MessageType messagetype) {
            this.f86606a = messagetype;
            if (messagetype.m23040D()) {
                throw new IllegalArgumentException("Default instance must be immutable.");
            }
            this.f86607b = (MessageType) newMutableInstance();
        }

        private static <MessageType> void mergeFromInstance(MessageType dest, MessageType src) {
            lhd.getInstance().schemaFor(dest).mergeFrom(dest, src);
        }

        private MessageType newMutableInstance() {
            return (MessageType) this.f86606a.m23046Q();
        }

        /* JADX INFO: renamed from: e */
        public final void m23058e() {
            if (this.f86607b.m23040D()) {
                return;
            }
            mo23059f();
        }

        /* JADX INFO: renamed from: f */
        public void mo23059f() {
            MessageType messagetype = (MessageType) newMutableInstance();
            mergeFromInstance(messagetype, this.f86607b);
            this.f86607b = messagetype;
        }

        @Override // p000.AbstractC0027a3.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public BuilderType mo89c(MessageType messagetype) {
            return (BuilderType) mergeFrom((u27) messagetype);
        }

        @Override // p000.ssa
        public final boolean isInitialized() {
            return u27.m23006C(this.f86607b, false);
        }

        @Override // p000.psa.InterfaceC11106a
        public final MessageType build() {
            MessageType messagetype = (MessageType) buildPartial();
            if (messagetype.isInitialized()) {
                return messagetype;
            }
            throw AbstractC0027a3.a.m88d(messagetype);
        }

        @Override // p000.psa.InterfaceC11106a
        public MessageType buildPartial() {
            if (!this.f86607b.m23040D()) {
                return this.f86607b;
            }
            this.f86607b.m23041E();
            return this.f86607b;
        }

        @Override // p000.psa.InterfaceC11106a
        public final BuilderType clear() {
            if (this.f86606a.m23040D()) {
                throw new IllegalArgumentException("Default instance must be immutable.");
            }
            this.f86607b = (MessageType) newMutableInstance();
            return this;
        }

        @Override // p000.ssa
        public MessageType getDefaultInstanceForType() {
            return this.f86606a;
        }

        @Override // p000.AbstractC0027a3.a, p000.psa.InterfaceC11106a
        /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
        public BuilderType mo27182clone() {
            BuilderType buildertype = (BuilderType) getDefaultInstanceForType().newBuilderForType();
            buildertype.f86607b = (MessageType) buildPartial();
            return buildertype;
        }

        public BuilderType mergeFrom(MessageType message) {
            if (getDefaultInstanceForType().equals(message)) {
                return this;
            }
            m23058e();
            mergeFromInstance(this.f86607b, message);
            return this;
        }

        @Override // p000.AbstractC0027a3.a, p000.psa.InterfaceC11106a
        public BuilderType mergeFrom(byte[] input, int offset, int length, yi5 extensionRegistry) throws be8 {
            m23058e();
            try {
                lhd.getInstance().schemaFor(this.f86607b).mergeFrom(this.f86607b, input, offset, offset + length, new c60.C2209b(extensionRegistry));
                return this;
            } catch (be8 e) {
                throw e;
            } catch (IOException e2) {
                throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
            } catch (IndexOutOfBoundsException unused) {
                throw be8.m3084l();
            }
        }

        @Override // p000.AbstractC0027a3.a, p000.psa.InterfaceC11106a
        public BuilderType mergeFrom(byte[] bArr, int i, int i2) throws be8 {
            return (BuilderType) mergeFrom(bArr, i, i2, yi5.getEmptyRegistry());
        }

        @Override // p000.AbstractC0027a3.a, p000.psa.InterfaceC11106a
        public BuilderType mergeFrom(e72 input, yi5 extensionRegistry) throws IOException {
            m23058e();
            try {
                lhd.getInstance().schemaFor(this.f86607b).mergeFrom(this.f86607b, g72.forCodedInput(input), extensionRegistry);
                return this;
            } catch (RuntimeException e) {
                if (e.getCause() instanceof IOException) {
                    throw ((IOException) e.getCause());
                }
                throw e;
            }
        }
    }

    /* JADX INFO: renamed from: u27$d */
    public static abstract class AbstractC13326d<MessageType extends AbstractC13327e<MessageType, BuilderType>, BuilderType extends AbstractC13326d<MessageType, BuilderType>> extends AbstractC13324b<MessageType, BuilderType> implements InterfaceC13328f<MessageType, BuilderType> {
        public AbstractC13326d(MessageType defaultInstance) {
            super(defaultInstance);
        }

        private zr5<C13329g> ensureExtensionsAreMutable() {
            zr5<C13329g> zr5Var = ((AbstractC13327e) this.f86607b).extensions;
            if (!zr5Var.isImmutable()) {
                return zr5Var;
            }
            zr5 zr5VarM33512clone = zr5Var.clone();
            ((AbstractC13327e) this.f86607b).extensions = zr5VarM33512clone;
            return zr5VarM33512clone;
        }

        private void verifyExtensionContainingType(final C13330h<MessageType, ?> extension) {
            if (extension.getContainingTypeDefaultInstance() != getDefaultInstanceForType()) {
                throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
            }
        }

        public final <Type> BuilderType addExtension(final vi5<MessageType, List<Type>> extension, final Type value) {
            C13330h<MessageType, ?> c13330hCheckIsLite = u27.checkIsLite(extension);
            verifyExtensionContainingType(c13330hCheckIsLite);
            m23058e();
            ensureExtensionsAreMutable().addRepeatedField(c13330hCheckIsLite.f86621d, c13330hCheckIsLite.m23073d(value));
            return this;
        }

        public final BuilderType clearExtension(final vi5<MessageType, ?> extension) {
            C13330h<MessageType, ?> c13330hCheckIsLite = u27.checkIsLite(extension);
            verifyExtensionContainingType(c13330hCheckIsLite);
            m23058e();
            ensureExtensionsAreMutable().clearField(c13330hCheckIsLite.f86621d);
            return this;
        }

        @Override // p000.u27.AbstractC13324b
        /* JADX INFO: renamed from: f */
        public void mo23059f() {
            super.mo23059f();
            if (((AbstractC13327e) this.f86607b).extensions != zr5.emptySet()) {
                MessageType messagetype = this.f86607b;
                ((AbstractC13327e) messagetype).extensions = ((AbstractC13327e) messagetype).extensions.clone();
            }
        }

        @Override // p000.u27.InterfaceC13328f
        public final <Type> Type getExtension(vi5<MessageType, Type> vi5Var) {
            return (Type) ((AbstractC13327e) this.f86607b).getExtension(vi5Var);
        }

        @Override // p000.u27.InterfaceC13328f
        public final <Type> int getExtensionCount(final vi5<MessageType, List<Type>> extension) {
            return ((AbstractC13327e) this.f86607b).getExtensionCount(extension);
        }

        /* JADX INFO: renamed from: h */
        public void m23061h(zr5<C13329g> extensions) {
            m23058e();
            ((AbstractC13327e) this.f86607b).extensions = extensions;
        }

        @Override // p000.u27.InterfaceC13328f
        public final <Type> boolean hasExtension(final vi5<MessageType, Type> extension) {
            return ((AbstractC13327e) this.f86607b).hasExtension(extension);
        }

        public final <Type> BuilderType setExtension(final vi5<MessageType, Type> extension, final Type value) {
            C13330h<MessageType, ?> c13330hCheckIsLite = u27.checkIsLite(extension);
            verifyExtensionContainingType(c13330hCheckIsLite);
            m23058e();
            ensureExtensionsAreMutable().setField(c13330hCheckIsLite.f86621d, c13330hCheckIsLite.m23074e(value));
            return this;
        }

        @Override // p000.u27.InterfaceC13328f
        public final <Type> Type getExtension(vi5<MessageType, List<Type>> vi5Var, int i) {
            return (Type) ((AbstractC13327e) this.f86607b).getExtension(vi5Var, i);
        }

        @Override // p000.u27.AbstractC13324b, p000.psa.InterfaceC11106a
        public final MessageType buildPartial() {
            if (!((AbstractC13327e) this.f86607b).m23040D()) {
                return (MessageType) this.f86607b;
            }
            ((AbstractC13327e) this.f86607b).extensions.makeImmutable();
            return (MessageType) super.buildPartial();
        }

        public final <Type> BuilderType setExtension(final vi5<MessageType, List<Type>> extension, final int index, final Type value) {
            C13330h<MessageType, ?> c13330hCheckIsLite = u27.checkIsLite(extension);
            verifyExtensionContainingType(c13330hCheckIsLite);
            m23058e();
            ensureExtensionsAreMutable().setRepeatedField(c13330hCheckIsLite.f86621d, index, c13330hCheckIsLite.m23073d(value));
            return this;
        }
    }

    /* JADX INFO: renamed from: u27$f */
    public interface InterfaceC13328f<MessageType extends AbstractC13327e<MessageType, BuilderType>, BuilderType extends AbstractC13326d<MessageType, BuilderType>> extends ssa {
        <Type> Type getExtension(vi5<MessageType, Type> extension);

        <Type> Type getExtension(vi5<MessageType, List<Type>> extension, int index);

        <Type> int getExtensionCount(vi5<MessageType, List<Type>> extension);

        <Type> boolean hasExtension(vi5<MessageType, Type> extension);
    }

    /* JADX INFO: renamed from: u27$g */
    public static final class C13329g implements zr5.InterfaceC16225c<C13329g> {

        /* JADX INFO: renamed from: a */
        public final v98.InterfaceC13948d<?> f86613a;

        /* JADX INFO: renamed from: b */
        public final int f86614b;

        /* JADX INFO: renamed from: c */
        public final gpi.EnumC6460b f86615c;

        /* JADX INFO: renamed from: d */
        public final boolean f86616d;

        /* JADX INFO: renamed from: e */
        public final boolean f86617e;

        public C13329g(final v98.InterfaceC13948d<?> enumTypeMap, final int number, final gpi.EnumC6460b type, final boolean isRepeated, final boolean isPacked) {
            this.f86613a = enumTypeMap;
            this.f86614b = number;
            this.f86615c = type;
            this.f86616d = isRepeated;
            this.f86617e = isPacked;
        }

        @Override // p000.zr5.InterfaceC16225c
        public v98.InterfaceC13948d<?> getEnumType() {
            return this.f86613a;
        }

        @Override // p000.zr5.InterfaceC16225c
        public gpi.EnumC6461c getLiteJavaType() {
            return this.f86615c.getJavaType();
        }

        @Override // p000.zr5.InterfaceC16225c
        public gpi.EnumC6460b getLiteType() {
            return this.f86615c;
        }

        @Override // p000.zr5.InterfaceC16225c
        public int getNumber() {
            return this.f86614b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.zr5.InterfaceC16225c
        public psa.InterfaceC11106a internalMergeFrom(psa.InterfaceC11106a to, psa from) {
            return ((AbstractC13324b) to).mergeFrom((u27) from);
        }

        @Override // p000.zr5.InterfaceC16225c
        public boolean isPacked() {
            return this.f86617e;
        }

        @Override // p000.zr5.InterfaceC16225c
        public boolean isRepeated() {
            return this.f86616d;
        }

        @Override // java.lang.Comparable
        public int compareTo(C13329g other) {
            return this.f86614b - other.f86614b;
        }
    }

    /* JADX INFO: renamed from: u27$h */
    public static class C13330h<ContainingType extends psa, Type> extends vi5<ContainingType, Type> {

        /* JADX INFO: renamed from: a */
        public final ContainingType f86618a;

        /* JADX INFO: renamed from: b */
        public final Type f86619b;

        /* JADX INFO: renamed from: c */
        public final psa f86620c;

        /* JADX INFO: renamed from: d */
        public final C13329g f86621d;

        public C13330h(final ContainingType containingTypeDefaultInstance, final Type defaultValue, final psa messageDefaultInstance, final C13329g descriptor, final Class singularType) {
            if (containingTypeDefaultInstance == null) {
                throw new IllegalArgumentException("Null containingTypeDefaultInstance");
            }
            if (descriptor.getLiteType() == gpi.EnumC6460b.f40754N && messageDefaultInstance == null) {
                throw new IllegalArgumentException("Null messageDefaultInstance");
            }
            this.f86618a = containingTypeDefaultInstance;
            this.f86619b = defaultValue;
            this.f86620c = messageDefaultInstance;
            this.f86621d = descriptor;
        }

        /* JADX INFO: renamed from: b */
        public Object m23071b(Object value) {
            if (!this.f86621d.isRepeated()) {
                return m23072c(value);
            }
            if (this.f86621d.getLiteJavaType() != gpi.EnumC6461c.ENUM) {
                return value;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                arrayList.add(m23072c(it.next()));
            }
            return arrayList;
        }

        /* JADX INFO: renamed from: c */
        public Object m23072c(Object value) {
            return this.f86621d.getLiteJavaType() == gpi.EnumC6461c.ENUM ? this.f86621d.f86613a.findValueByNumber(((Integer) value).intValue()) : value;
        }

        /* JADX INFO: renamed from: d */
        public Object m23073d(Object value) {
            return this.f86621d.getLiteJavaType() == gpi.EnumC6461c.ENUM ? Integer.valueOf(((v98.InterfaceC13947c) value).getNumber()) : value;
        }

        /* JADX INFO: renamed from: e */
        public Object m23074e(Object value) {
            if (!this.f86621d.isRepeated()) {
                return m23073d(value);
            }
            if (this.f86621d.getLiteJavaType() != gpi.EnumC6461c.ENUM) {
                return value;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                arrayList.add(m23073d(it.next()));
            }
            return arrayList;
        }

        public ContainingType getContainingTypeDefaultInstance() {
            return this.f86618a;
        }

        @Override // p000.vi5
        public Type getDefaultValue() {
            return this.f86619b;
        }

        @Override // p000.vi5
        public gpi.EnumC6460b getLiteType() {
            return this.f86621d.getLiteType();
        }

        @Override // p000.vi5
        public psa getMessageDefaultInstance() {
            return this.f86620c;
        }

        @Override // p000.vi5
        public int getNumber() {
            return this.f86621d.getNumber();
        }

        @Override // p000.vi5
        public boolean isRepeated() {
            return this.f86621d.f86616d;
        }
    }

    /* JADX INFO: renamed from: u27$i */
    public enum EnumC13331i {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    /* JADX INFO: renamed from: u27$j */
    public static final class C13332j implements Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a */
        public final Class<?> f86630a;

        /* JADX INFO: renamed from: b */
        public final String f86631b;

        /* JADX INFO: renamed from: c */
        public final byte[] f86632c;

        public C13332j(psa regularForm) {
            this.f86630a = regularForm.getClass();
            this.f86631b = regularForm.getClass().getName();
            this.f86632c = regularForm.toByteArray();
        }

        /* JADX INFO: renamed from: of */
        public static C13332j m23075of(psa message) {
            return new C13332j(message);
        }

        private Class<?> resolveMessageClass() throws ClassNotFoundException {
            Class<?> cls = this.f86630a;
            return cls != null ? cls : Class.forName(this.f86631b);
        }

        public Object readResolve() throws ObjectStreamException {
            try {
                Field declaredField = resolveMessageClass().getDeclaredField("DEFAULT_INSTANCE");
                declaredField.setAccessible(true);
                return ((psa) declaredField.get(null)).newBuilderForType().mergeFrom(this.f86632c).buildPartial();
            } catch (be8 e) {
                throw new RuntimeException("Unable to understand proto buffer", e);
            } catch (ClassNotFoundException e2) {
                throw new RuntimeException("Unable to find proto buffer class: " + this.f86631b, e2);
            } catch (IllegalAccessException e3) {
                throw new RuntimeException("Unable to call parsePartialFrom", e3);
            } catch (NoSuchFieldException e4) {
                throw new RuntimeException("Unable to find DEFAULT_INSTANCE in " + this.f86631b, e4);
            } catch (SecurityException e5) {
                throw new RuntimeException("Unable to call DEFAULT_INSTANCE in " + this.f86631b, e5);
            }
        }
    }

    /* JADX INFO: renamed from: B */
    public static Object m23005B(Method method, Object object, Object... params) {
        try {
            return method.invoke(object, params);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    /* JADX INFO: renamed from: C */
    public static final <T extends u27<T, ?>> boolean m23006C(T message, boolean shouldMemoize) {
        byte bByteValue = ((Byte) message.m23055o(EnumC13331i.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zIsInitialized = lhd.getInstance().schemaFor(message).isInitialized(message);
        if (shouldMemoize) {
            message.m23056p(EnumC13331i.SET_MEMOIZED_IS_INITIALIZED, zIsInitialized ? message : null);
        }
        return zIsInitialized;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [v98$a] */
    /* JADX INFO: renamed from: J */
    public static v98.InterfaceC13945a m23007J(v98.InterfaceC13945a list) {
        int size = list.size();
        return list.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [v98$b] */
    /* JADX INFO: renamed from: K */
    public static v98.InterfaceC13946b m23008K(v98.InterfaceC13946b list) {
        int size = list.size();
        return list.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [v98$f] */
    /* JADX INFO: renamed from: L */
    public static v98.InterfaceC13950f m23009L(v98.InterfaceC13950f list) {
        int size = list.size();
        return list.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [v98$g] */
    /* JADX INFO: renamed from: M */
    public static v98.InterfaceC13951g m23010M(v98.InterfaceC13951g list) {
        int size = list.size();
        return list.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [v98$j] */
    /* JADX INFO: renamed from: N */
    public static v98.InterfaceC13954j m23011N(v98.InterfaceC13954j list) {
        int size = list.size();
        return list.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
    }

    /* JADX INFO: renamed from: O */
    public static <E> v98.InterfaceC13956l<E> m23012O(v98.InterfaceC13956l<E> list) {
        int size = list.size();
        return list.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
    }

    /* JADX INFO: renamed from: P */
    public static Object m23013P(psa defaultInstance, String info, Object[] objects) {
        return new tpd(defaultInstance, info, objects);
    }

    /* JADX INFO: renamed from: R */
    public static <T extends u27<T, ?>> T m23014R(T t, InputStream inputStream) throws be8 {
        return (T) checkMessageInitialized(parsePartialDelimitedFrom(t, inputStream, yi5.getEmptyRegistry()));
    }

    /* JADX INFO: renamed from: S */
    public static <T extends u27<T, ?>> T m23015S(T t, InputStream inputStream, yi5 yi5Var) throws be8 {
        return (T) checkMessageInitialized(parsePartialDelimitedFrom(t, inputStream, yi5Var));
    }

    /* JADX INFO: renamed from: T */
    public static <T extends u27<T, ?>> T m23016T(T t, wj1 wj1Var) throws be8 {
        return (T) checkMessageInitialized(m23017U(t, wj1Var, yi5.getEmptyRegistry()));
    }

    /* JADX INFO: renamed from: U */
    public static <T extends u27<T, ?>> T m23017U(T t, wj1 wj1Var, yi5 yi5Var) throws be8 {
        return (T) checkMessageInitialized(parsePartialFrom(t, wj1Var, yi5Var));
    }

    /* JADX INFO: renamed from: V */
    public static <T extends u27<T, ?>> T m23018V(T t, e72 e72Var) throws be8 {
        return (T) m23019W(t, e72Var, yi5.getEmptyRegistry());
    }

    /* JADX INFO: renamed from: W */
    public static <T extends u27<T, ?>> T m23019W(T t, e72 e72Var, yi5 yi5Var) throws be8 {
        return (T) checkMessageInitialized(m23027e0(t, e72Var, yi5Var));
    }

    /* JADX INFO: renamed from: X */
    public static <T extends u27<T, ?>> T m23020X(T t, InputStream inputStream) throws be8 {
        return (T) checkMessageInitialized(m23027e0(t, e72.newInstance(inputStream), yi5.getEmptyRegistry()));
    }

    /* JADX INFO: renamed from: Y */
    public static <T extends u27<T, ?>> T m23021Y(T t, InputStream inputStream, yi5 yi5Var) throws be8 {
        return (T) checkMessageInitialized(m23027e0(t, e72.newInstance(inputStream), yi5Var));
    }

    /* JADX INFO: renamed from: Z */
    public static <T extends u27<T, ?>> T m23022Z(T t, ByteBuffer byteBuffer) throws be8 {
        return (T) m23023a0(t, byteBuffer, yi5.getEmptyRegistry());
    }

    /* JADX INFO: renamed from: a0 */
    public static <T extends u27<T, ?>> T m23023a0(T t, ByteBuffer byteBuffer, yi5 yi5Var) throws be8 {
        return (T) checkMessageInitialized(m23019W(t, e72.newInstance(byteBuffer), yi5Var));
    }

    /* JADX INFO: renamed from: b0 */
    public static <T extends u27<T, ?>> T m23024b0(T t, byte[] bArr) throws be8 {
        return (T) checkMessageInitialized(parsePartialFrom(t, bArr, 0, bArr.length, yi5.getEmptyRegistry()));
    }

    /* JADX INFO: renamed from: c0 */
    public static <T extends u27<T, ?>> T m23025c0(T t, byte[] bArr, yi5 yi5Var) throws be8 {
        return (T) checkMessageInitialized(parsePartialFrom(t, bArr, 0, bArr.length, yi5Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <MessageType extends AbstractC13327e<MessageType, BuilderType>, BuilderType extends AbstractC13326d<MessageType, BuilderType>, T> C13330h<MessageType, T> checkIsLite(vi5<MessageType, T> extension) {
        if (extension.m23985a()) {
            return (C13330h) extension;
        }
        throw new IllegalArgumentException("Expected a lite extension.");
    }

    private static <T extends u27<T, ?>> T checkMessageInitialized(T message) throws be8 {
        if (message == null || message.isInitialized()) {
            return message;
        }
        throw message.m84e().asInvalidProtocolBufferException().setUnfinishedMessage(message);
    }

    private int computeSerializedSize(upe<?> nullableSchema) {
        return nullableSchema == null ? lhd.getInstance().schemaFor(this).getSerializedSize(this) : nullableSchema.getSerializedSize(this);
    }

    /* JADX INFO: renamed from: d0 */
    public static <T extends u27<T, ?>> T m23026d0(T t, e72 e72Var) throws be8 {
        return (T) m23027e0(t, e72Var, yi5.getEmptyRegistry());
    }

    /* JADX INFO: renamed from: e0 */
    public static <T extends u27<T, ?>> T m23027e0(T t, e72 e72Var, yi5 yi5Var) throws be8 {
        T t2 = (T) t.m23046Q();
        try {
            upe upeVarSchemaFor = lhd.getInstance().schemaFor(t2);
            upeVarSchemaFor.mergeFrom(t2, g72.forCodedInput(e72Var), yi5Var);
            upeVarSchemaFor.makeImmutable(t2);
            return t2;
        } catch (be8 e) {
            e = e;
            if (e.m3085a()) {
                e = new be8((IOException) e);
            }
            throw e.setUnfinishedMessage(t2);
        } catch (IOException e2) {
            if (e2.getCause() instanceof be8) {
                throw ((be8) e2.getCause());
            }
            throw new be8(e2).setUnfinishedMessage(t2);
        } catch (tsh e3) {
            throw e3.asInvalidProtocolBufferException().setUnfinishedMessage(t2);
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof be8) {
                throw ((be8) e4.getCause());
            }
            throw e4;
        }
    }

    private void ensureUnknownFieldsInitialized() {
        if (this.unknownFields == uth.getDefaultInstance()) {
            this.unknownFields = uth.m23570g();
        }
    }

    /* JADX INFO: renamed from: g0 */
    public static <T extends u27<?, ?>> void m23029g0(Class<T> clazz, T defaultInstance) {
        defaultInstance.m23042F();
        defaultInstanceMap.put(clazz, defaultInstance);
    }

    public static <ContainingType extends psa, Type> C13330h<ContainingType, Type> newRepeatedGeneratedExtension(final ContainingType containingTypeDefaultInstance, final psa messageDefaultInstance, final v98.InterfaceC13948d<?> enumTypeMap, final int number, final gpi.EnumC6460b type, final boolean isPacked, final Class singularType) {
        return new C13330h<>(containingTypeDefaultInstance, Collections.emptyList(), messageDefaultInstance, new C13329g(enumTypeMap, number, type, true, isPacked), singularType);
    }

    public static <ContainingType extends psa, Type> C13330h<ContainingType, Type> newSingularGeneratedExtension(final ContainingType containingTypeDefaultInstance, final Type defaultValue, final psa messageDefaultInstance, final v98.InterfaceC13948d<?> enumTypeMap, final int number, final gpi.EnumC6460b type, final Class singularType) {
        return new C13330h<>(containingTypeDefaultInstance, defaultValue, messageDefaultInstance, new C13329g(enumTypeMap, number, type, false, false), singularType);
    }

    private static <T extends u27<T, ?>> T parsePartialDelimitedFrom(T t, InputStream inputStream, yi5 yi5Var) throws be8 {
        try {
            int i = inputStream.read();
            if (i == -1) {
                return null;
            }
            e72 e72VarNewInstance = e72.newInstance(new AbstractC0027a3.a.C16336a(inputStream, e72.readRawVarint32(i, inputStream)));
            T t2 = (T) m23027e0(t, e72VarNewInstance, yi5Var);
            try {
                e72VarNewInstance.checkLastTagWas(0);
                return t2;
            } catch (be8 e) {
                throw e.setUnfinishedMessage(t2);
            }
        } catch (be8 e2) {
            if (e2.m3085a()) {
                throw new be8((IOException) e2);
            }
            throw e2;
        } catch (IOException e3) {
            throw new be8(e3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T extends u27<T, ?>> T parsePartialFrom(T t, byte[] bArr, int i, int i2, yi5 yi5Var) throws be8 {
        if (i2 == 0) {
            return t;
        }
        T t2 = (T) t.m23046Q();
        try {
            upe upeVarSchemaFor = lhd.getInstance().schemaFor(t2);
            upeVarSchemaFor.mergeFrom(t2, bArr, i, i + i2, new c60.C2209b(yi5Var));
            upeVarSchemaFor.makeImmutable(t2);
            return t2;
        } catch (be8 e) {
            e = e;
            if (e.m3085a()) {
                e = new be8((IOException) e);
            }
            throw e.setUnfinishedMessage(t2);
        } catch (IOException e2) {
            if (e2.getCause() instanceof be8) {
                throw ((be8) e2.getCause());
            }
            throw new be8(e2).setUnfinishedMessage(t2);
        } catch (IndexOutOfBoundsException unused) {
            throw be8.m3084l().setUnfinishedMessage(t2);
        } catch (tsh e3) {
            throw e3.asInvalidProtocolBufferException().setUnfinishedMessage(t2);
        }
    }

    /* JADX INFO: renamed from: r */
    public static v98.InterfaceC13945a m23031r() {
        return sa1.emptyList();
    }

    /* JADX INFO: renamed from: s */
    public static v98.InterfaceC13946b m23032s() {
        return vj4.emptyList();
    }

    /* JADX INFO: renamed from: t */
    public static v98.InterfaceC13950f m23033t() {
        return b46.emptyList();
    }

    /* JADX INFO: renamed from: u */
    public static v98.InterfaceC13951g m23034u() {
        return c68.emptyList();
    }

    /* JADX INFO: renamed from: v */
    public static v98.InterfaceC13954j m23035v() {
        return sk9.emptyList();
    }

    /* JADX INFO: renamed from: w */
    public static <E> v98.InterfaceC13956l<E> m23036w() {
        return nhd.emptyList();
    }

    /* JADX INFO: renamed from: x */
    public static <T extends u27<?, ?>> T m23037x(Class<T> cls) {
        u27<?, ?> u27Var = defaultInstanceMap.get(cls);
        if (u27Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                u27Var = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (u27Var == null) {
            u27Var = (T) ((u27) evh.m10289l(cls)).getDefaultInstanceForType();
            if (u27Var == null) {
                throw new IllegalStateException();
            }
            defaultInstanceMap.put(cls, u27Var);
        }
        return (T) u27Var;
    }

    /* JADX INFO: renamed from: z */
    public static Method m23038z(Class clazz, String name, Class... params) {
        try {
            return clazz.getMethod(name, params);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException("Generated message class \"" + clazz.getName() + "\" missing method \"" + name + "\".", e);
        }
    }

    /* JADX INFO: renamed from: A */
    public boolean m23039A() {
        return m23057y() == 0;
    }

    /* JADX INFO: renamed from: D */
    public boolean m23040D() {
        return (this.memoizedSerializedSize & Integer.MIN_VALUE) != 0;
    }

    /* JADX INFO: renamed from: E */
    public void m23041E() {
        lhd.getInstance().schemaFor(this).makeImmutable(this);
        m23042F();
    }

    /* JADX INFO: renamed from: F */
    public void m23042F() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    /* JADX INFO: renamed from: G */
    public void m23043G(int fieldNumber, wj1 value) {
        ensureUnknownFieldsInitialized();
        this.unknownFields.m23574d(fieldNumber, value);
    }

    /* JADX INFO: renamed from: H */
    public final void m23044H(uth unknownFields) {
        this.unknownFields = uth.m23569f(this.unknownFields, unknownFields);
    }

    /* JADX INFO: renamed from: I */
    public void m23045I(int tag, int value) {
        ensureUnknownFieldsInitialized();
        this.unknownFields.m23575e(tag, value);
    }

    /* JADX INFO: renamed from: Q */
    public MessageType m23046Q() {
        return (MessageType) m23055o(EnumC13331i.NEW_MUTABLE_INSTANCE);
    }

    @Override // p000.AbstractC0027a3
    /* JADX INFO: renamed from: c */
    public int mo82c() {
        return this.memoizedSerializedSize & Integer.MAX_VALUE;
    }

    @Override // p000.AbstractC0027a3
    /* JADX INFO: renamed from: d */
    public int mo83d(upe schema) {
        if (!m23040D()) {
            if (mo82c() != Integer.MAX_VALUE) {
                return mo82c();
            }
            int iComputeSerializedSize = computeSerializedSize(schema);
            mo85f(iComputeSerializedSize);
            return iComputeSerializedSize;
        }
        int iComputeSerializedSize2 = computeSerializedSize(schema);
        if (iComputeSerializedSize2 >= 0) {
            return iComputeSerializedSize2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + iComputeSerializedSize2);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other != null && getClass() == other.getClass()) {
            return lhd.getInstance().schemaFor(this).equals(this, (u27) other);
        }
        return false;
    }

    @Override // p000.AbstractC0027a3
    /* JADX INFO: renamed from: f */
    public void mo85f(int size) {
        if (size >= 0) {
            this.memoizedSerializedSize = (size & Integer.MAX_VALUE) | (this.memoizedSerializedSize & Integer.MIN_VALUE);
        } else {
            throw new IllegalStateException("serialized size must be non-negative, was " + size);
        }
    }

    /* JADX INFO: renamed from: f0 */
    public boolean m23047f0(int tag, e72 input) throws IOException {
        if (gpi.getTagWireType(tag) == 4) {
            return false;
        }
        ensureUnknownFieldsInitialized();
        return this.unknownFields.m23572b(tag, input);
    }

    @Override // p000.psa
    public final vhc<MessageType> getParserForType() {
        return (vhc) m23055o(EnumC13331i.GET_PARSER);
    }

    @Override // p000.psa
    public int getSerializedSize() {
        return mo83d(null);
    }

    /* JADX INFO: renamed from: h0 */
    public void m23048h0(int value) {
        this.memoizedHashCode = value;
    }

    public int hashCode() {
        if (m23040D()) {
            return m23052l();
        }
        if (m23039A()) {
            m23048h0(m23052l());
        }
        return m23057y();
    }

    /* JADX INFO: renamed from: i */
    public Object m23049i() throws Exception {
        return m23055o(EnumC13331i.BUILD_MESSAGE_INFO);
    }

    @Override // p000.ssa
    public final boolean isInitialized() {
        return m23006C(this, true);
    }

    /* JADX INFO: renamed from: j */
    public void m23050j() {
        this.memoizedHashCode = 0;
    }

    /* JADX INFO: renamed from: k */
    public void m23051k() {
        mo85f(Integer.MAX_VALUE);
    }

    /* JADX INFO: renamed from: l */
    public int m23052l() {
        return lhd.getInstance().schemaFor(this).hashCode(this);
    }

    /* JADX INFO: renamed from: m */
    public final <MessageType extends u27<MessageType, BuilderType>, BuilderType extends AbstractC13324b<MessageType, BuilderType>> BuilderType m23053m() {
        return (BuilderType) m23055o(EnumC13331i.NEW_BUILDER);
    }

    /* JADX INFO: renamed from: n */
    public final <MessageType extends u27<MessageType, BuilderType>, BuilderType extends AbstractC13324b<MessageType, BuilderType>> BuilderType m23054n(MessageType messagetype) {
        return (BuilderType) m23053m().mergeFrom((u27) messagetype);
    }

    /* JADX INFO: renamed from: o */
    public Object m23055o(EnumC13331i method) {
        return mo79q(method, null, null);
    }

    @qp1
    /* JADX INFO: renamed from: p */
    public Object m23056p(EnumC13331i method, Object arg0) {
        return mo79q(method, arg0, null);
    }

    /* JADX INFO: renamed from: q */
    public abstract Object mo79q(EnumC13331i method, Object arg0, Object arg1);

    public String toString() {
        return usa.m23566b(this, super.toString());
    }

    @Override // p000.psa
    public void writeTo(i72 output) throws IOException {
        lhd.getInstance().schemaFor(this).writeTo(this, k72.forCodedOutput(output));
    }

    /* JADX INFO: renamed from: y */
    public int m23057y() {
        return this.memoizedHashCode;
    }

    @Override // p000.ssa
    public final MessageType getDefaultInstanceForType() {
        return (MessageType) m23055o(EnumC13331i.GET_DEFAULT_INSTANCE);
    }

    @Override // p000.psa
    public final BuilderType newBuilderForType() {
        return (BuilderType) m23055o(EnumC13331i.NEW_BUILDER);
    }

    @Override // p000.psa
    public final BuilderType toBuilder() {
        return (BuilderType) ((AbstractC13324b) m23055o(EnumC13331i.NEW_BUILDER)).mergeFrom(this);
    }

    /* JADX INFO: renamed from: u27$c */
    public static class C13325c<T extends u27<T, ?>> extends AbstractC11282q3<T> {

        /* JADX INFO: renamed from: b */
        public final T f86608b;

        public C13325c(T defaultInstance) {
            this.f86608b = defaultInstance;
        }

        @Override // p000.vhc
        public T parsePartialFrom(e72 e72Var, yi5 yi5Var) throws be8 {
            return (T) u27.m23027e0(this.f86608b, e72Var, yi5Var);
        }

        @Override // p000.AbstractC11282q3, p000.vhc
        public T parsePartialFrom(byte[] bArr, int i, int i2, yi5 yi5Var) throws be8 {
            return (T) u27.parsePartialFrom(this.f86608b, bArr, i, i2, yi5Var);
        }
    }

    /* JADX INFO: renamed from: u27$e */
    public static abstract class AbstractC13327e<MessageType extends AbstractC13327e<MessageType, BuilderType>, BuilderType extends AbstractC13326d<MessageType, BuilderType>> extends u27<MessageType, BuilderType> implements InterfaceC13328f<MessageType, BuilderType> {
        protected zr5<C13329g> extensions = zr5.emptySet();

        /* JADX INFO: renamed from: u27$e$a */
        public class a {

            /* JADX INFO: renamed from: a */
            public final Iterator<Map.Entry<C13329g, Object>> f86609a;

            /* JADX INFO: renamed from: b */
            public Map.Entry<C13329g, Object> f86610b;

            /* JADX INFO: renamed from: c */
            public final boolean f86611c;

            public /* synthetic */ a(AbstractC13327e abstractC13327e, boolean z, C13323a c13323a) {
                this(z);
            }

            public void writeUntil(final int end, final i72 output) throws IOException {
                while (true) {
                    Map.Entry<C13329g, Object> entry = this.f86610b;
                    if (entry == null || entry.getKey().getNumber() >= end) {
                        return;
                    }
                    C13329g key = this.f86610b.getKey();
                    if (this.f86611c && key.getLiteJavaType() == gpi.EnumC6461c.MESSAGE && !key.isRepeated()) {
                        output.writeMessageSetExtension(key.getNumber(), (psa) this.f86610b.getValue());
                    } else {
                        zr5.writeField(key, this.f86610b.getValue(), output);
                    }
                    if (this.f86609a.hasNext()) {
                        this.f86610b = this.f86609a.next();
                    } else {
                        this.f86610b = null;
                    }
                }
            }

            private a(boolean messageSetWireFormat) {
                Iterator it = AbstractC13327e.this.extensions.iterator();
                this.f86609a = it;
                if (it.hasNext()) {
                    this.f86610b = (Map.Entry) it.next();
                }
                this.f86611c = messageSetWireFormat;
            }
        }

        private void eagerlyMergeMessageSetExtension(e72 input, C13330h<?, ?> extension, yi5 extensionRegistry, int typeId) throws IOException {
            parseExtension(input, extensionRegistry, extension, gpi.m11819a(typeId, 2), typeId);
        }

        private void mergeMessageSetExtensionFromBytes(wj1 rawBytes, yi5 extensionRegistry, C13330h<?, ?> extension) throws IOException {
            psa psaVar = (psa) this.extensions.getField(extension.f86621d);
            psa.InterfaceC11106a builder = psaVar != null ? psaVar.toBuilder() : null;
            if (builder == null) {
                builder = extension.getMessageDefaultInstance().newBuilderForType();
            }
            builder.mergeFrom(rawBytes, extensionRegistry);
            m23062i0().setField(extension.f86621d, extension.m23073d(builder.build()));
        }

        private <MessageType extends psa> void mergeMessageSetExtensionFromCodedStream(MessageType defaultInstance, e72 input, yi5 extensionRegistry) throws IOException {
            int uInt32 = 0;
            wj1 bytes = null;
            C13330h<?, ?> c13330hFindLiteExtensionByNumber = null;
            while (true) {
                int tag = input.readTag();
                if (tag == 0) {
                    break;
                }
                if (tag == gpi.f40745s) {
                    uInt32 = input.readUInt32();
                    if (uInt32 != 0) {
                        c13330hFindLiteExtensionByNumber = extensionRegistry.findLiteExtensionByNumber(defaultInstance, uInt32);
                    }
                } else if (tag == gpi.f40746t) {
                    if (uInt32 == 0 || c13330hFindLiteExtensionByNumber == null) {
                        bytes = input.readBytes();
                    } else {
                        eagerlyMergeMessageSetExtension(input, c13330hFindLiteExtensionByNumber, extensionRegistry, uInt32);
                        bytes = null;
                    }
                } else if (!input.skipField(tag)) {
                    break;
                }
            }
            input.checkLastTagWas(gpi.f40744r);
            if (bytes == null || uInt32 == 0) {
                return;
            }
            if (c13330hFindLiteExtensionByNumber != null) {
                mergeMessageSetExtensionFromBytes(bytes, extensionRegistry, c13330hFindLiteExtensionByNumber);
            } else {
                m23043G(uInt32, bytes);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:4:0x0008  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private boolean parseExtension(p000.e72 r6, p000.yi5 r7, p000.u27.C13330h<?, ?> r8, int r9, int r10) throws java.io.IOException {
            /*
                Method dump skipped, instruction units count: 293
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.u27.AbstractC13327e.parseExtension(e72, yi5, u27$h, int, int):boolean");
        }

        private void verifyExtensionContainingType(final C13330h<MessageType, ?> extension) {
            if (extension.getContainingTypeDefaultInstance() != getDefaultInstanceForType()) {
                throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
            }
        }

        @Override // p000.u27, p000.ssa
        public /* bridge */ /* synthetic */ psa getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // p000.u27.InterfaceC13328f
        public final <Type> Type getExtension(vi5<MessageType, Type> vi5Var) {
            C13330h<MessageType, ?> c13330hCheckIsLite = u27.checkIsLite(vi5Var);
            verifyExtensionContainingType(c13330hCheckIsLite);
            Object field = this.extensions.getField(c13330hCheckIsLite.f86621d);
            return field == null ? c13330hCheckIsLite.f86619b : (Type) c13330hCheckIsLite.m23071b(field);
        }

        @Override // p000.u27.InterfaceC13328f
        public final <Type> int getExtensionCount(final vi5<MessageType, List<Type>> extension) {
            C13330h<MessageType, ?> c13330hCheckIsLite = u27.checkIsLite(extension);
            verifyExtensionContainingType(c13330hCheckIsLite);
            return this.extensions.getRepeatedFieldCount(c13330hCheckIsLite.f86621d);
        }

        @Override // p000.u27.InterfaceC13328f
        public final <Type> boolean hasExtension(final vi5<MessageType, Type> extension) {
            C13330h<MessageType, ?> c13330hCheckIsLite = u27.checkIsLite(extension);
            verifyExtensionContainingType(c13330hCheckIsLite);
            return this.extensions.hasField(c13330hCheckIsLite.f86621d);
        }

        @qp1
        /* JADX INFO: renamed from: i0 */
        public zr5<C13329g> m23062i0() {
            if (this.extensions.isImmutable()) {
                this.extensions = this.extensions.clone();
            }
            return this.extensions;
        }

        /* JADX INFO: renamed from: j0 */
        public boolean m23063j0() {
            return this.extensions.isInitialized();
        }

        /* JADX INFO: renamed from: k0 */
        public int m23064k0() {
            return this.extensions.getSerializedSize();
        }

        /* JADX INFO: renamed from: l0 */
        public int m23065l0() {
            return this.extensions.getMessageSetSerializedSize();
        }

        /* JADX INFO: renamed from: m0 */
        public final void m23066m0(final MessageType other) {
            if (this.extensions.isImmutable()) {
                this.extensions = this.extensions.clone();
            }
            this.extensions.mergeFrom(other.extensions);
        }

        /* JADX INFO: renamed from: n0 */
        public AbstractC13327e<MessageType, BuilderType>.a m23067n0() {
            return new a(this, false, null);
        }

        @Override // p000.u27, p000.psa
        public /* bridge */ /* synthetic */ psa.InterfaceC11106a newBuilderForType() {
            return super.newBuilderForType();
        }

        /* JADX INFO: renamed from: o0 */
        public AbstractC13327e<MessageType, BuilderType>.a m23068o0() {
            return new a(this, true, null);
        }

        /* JADX INFO: renamed from: p0 */
        public <MessageType extends psa> boolean m23069p0(MessageType defaultInstance, e72 input, yi5 extensionRegistry, int tag) throws IOException {
            int tagFieldNumber = gpi.getTagFieldNumber(tag);
            return parseExtension(input, extensionRegistry, extensionRegistry.findLiteExtensionByNumber(defaultInstance, tagFieldNumber), tag, tagFieldNumber);
        }

        /* JADX INFO: renamed from: q0 */
        public <MessageType extends psa> boolean m23070q0(MessageType defaultInstance, e72 input, yi5 extensionRegistry, int tag) throws IOException {
            if (tag != gpi.f40743q) {
                return gpi.getTagWireType(tag) == 2 ? m23069p0(defaultInstance, input, extensionRegistry, tag) : input.skipField(tag);
            }
            mergeMessageSetExtensionFromCodedStream(defaultInstance, input, extensionRegistry);
            return true;
        }

        @Override // p000.u27, p000.psa
        public /* bridge */ /* synthetic */ psa.InterfaceC11106a toBuilder() {
            return super.toBuilder();
        }

        @Override // p000.u27.InterfaceC13328f
        public final <Type> Type getExtension(vi5<MessageType, List<Type>> vi5Var, int i) {
            C13330h<MessageType, ?> c13330hCheckIsLite = u27.checkIsLite(vi5Var);
            verifyExtensionContainingType(c13330hCheckIsLite);
            return (Type) c13330hCheckIsLite.m23072c(this.extensions.getRepeatedField(c13330hCheckIsLite.f86621d, i));
        }
    }

    private static <T extends u27<T, ?>> T parsePartialFrom(T t, wj1 wj1Var, yi5 yi5Var) throws be8 {
        e72 e72VarNewCodedInput = wj1Var.newCodedInput();
        T t2 = (T) m23027e0(t, e72VarNewCodedInput, yi5Var);
        try {
            e72VarNewCodedInput.checkLastTagWas(0);
            return t2;
        } catch (be8 e) {
            throw e.setUnfinishedMessage(t2);
        }
    }
}
