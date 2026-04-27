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
import p000.AbstractC1714b3;
import p000.as5;
import p000.d60;
import p000.hpi;
import p000.qsa;
import p000.v27;
import p000.v27.AbstractC13823b;
import p000.w98;

/* JADX INFO: loaded from: classes4.dex */
public abstract class v27<MessageType extends v27<MessageType, BuilderType>, BuilderType extends AbstractC13823b<MessageType, BuilderType>> extends AbstractC1714b3<MessageType, BuilderType> {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, v27<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize = -1;
    protected tth unknownFields = tth.getDefaultInstance();

    /* JADX INFO: renamed from: v27$a */
    public static /* synthetic */ class C13822a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f89754a;

        static {
            int[] iArr = new int[hpi.EnumC6969c.values().length];
            f89754a = iArr;
            try {
                iArr[hpi.EnumC6969c.MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f89754a[hpi.EnumC6969c.ENUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: v27$b */
    public static abstract class AbstractC13823b<MessageType extends v27<MessageType, BuilderType>, BuilderType extends AbstractC13823b<MessageType, BuilderType>> extends AbstractC1714b3.a<MessageType, BuilderType> {

        /* JADX INFO: renamed from: a */
        public final MessageType f89755a;

        /* JADX INFO: renamed from: b */
        public MessageType f89756b;

        public AbstractC13823b(MessageType messagetype) {
            this.f89755a = messagetype;
            if (messagetype.m23725E()) {
                throw new IllegalArgumentException("Default instance must be immutable.");
            }
            this.f89756b = (MessageType) newMutableInstance();
        }

        private static <MessageType> void mergeFromInstance(MessageType dest, MessageType src) {
            khd.getInstance().schemaFor(dest).mergeFrom(dest, src);
        }

        private MessageType newMutableInstance() {
            return (MessageType) this.f89755a.m23731R();
        }

        /* JADX INFO: renamed from: e */
        public final void m23743e() {
            if (this.f89756b.m23725E()) {
                return;
            }
            mo23744f();
        }

        /* JADX INFO: renamed from: f */
        public void mo23744f() {
            MessageType messagetype = (MessageType) newMutableInstance();
            mergeFromInstance(messagetype, this.f89756b);
            this.f89756b = messagetype;
        }

        @Override // p000.AbstractC1714b3.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public BuilderType mo2865c(MessageType messagetype) {
            return (BuilderType) mergeFrom((v27) messagetype);
        }

        @Override // p000.rsa
        public final boolean isInitialized() {
            return v27.m23692D(this.f89756b, false);
        }

        @Override // p000.qsa.InterfaceC11668a
        public final MessageType build() {
            MessageType messagetype = (MessageType) buildPartial();
            if (messagetype.isInitialized()) {
                return messagetype;
            }
            throw AbstractC1714b3.a.m2864d(messagetype);
        }

        @Override // p000.qsa.InterfaceC11668a
        public MessageType buildPartial() {
            if (!this.f89756b.m23725E()) {
                return this.f89756b;
            }
            this.f89756b.m23726F();
            return this.f89756b;
        }

        @Override // p000.qsa.InterfaceC11668a
        public final BuilderType clear() {
            if (this.f89755a.m23725E()) {
                throw new IllegalArgumentException("Default instance must be immutable.");
            }
            this.f89756b = (MessageType) newMutableInstance();
            return this;
        }

        @Override // p000.rsa
        public MessageType getDefaultInstanceForType() {
            return this.f89755a;
        }

        @Override // p000.AbstractC1714b3.a, p000.qsa.InterfaceC11668a
        /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
        public BuilderType mo27946clone() {
            BuilderType buildertype = (BuilderType) getDefaultInstanceForType().newBuilderForType();
            buildertype.f89756b = (MessageType) buildPartial();
            return buildertype;
        }

        public BuilderType mergeFrom(MessageType message) {
            if (getDefaultInstanceForType().equals(message)) {
                return this;
            }
            m23743e();
            mergeFromInstance(this.f89756b, message);
            return this;
        }

        @Override // p000.AbstractC1714b3.a, p000.qsa.InterfaceC11668a
        public BuilderType mergeFrom(byte[] input, int offset, int length, zi5 extensionRegistry) throws ce8 {
            m23743e();
            try {
                khd.getInstance().schemaFor(this.f89756b).mergeFrom(this.f89756b, input, offset, offset + length, new d60.C4625b(extensionRegistry));
                return this;
            } catch (ce8 e) {
                throw e;
            } catch (IOException e2) {
                throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
            } catch (IndexOutOfBoundsException unused) {
                throw ce8.m3928l();
            }
        }

        @Override // p000.AbstractC1714b3.a, p000.qsa.InterfaceC11668a
        public BuilderType mergeFrom(byte[] bArr, int i, int i2) throws ce8 {
            return (BuilderType) mergeFrom(bArr, i, i2, zi5.getEmptyRegistry());
        }

        @Override // p000.AbstractC1714b3.a, p000.qsa.InterfaceC11668a
        public BuilderType mergeFrom(f72 input, zi5 extensionRegistry) throws IOException {
            m23743e();
            try {
                khd.getInstance().schemaFor(this.f89756b).mergeFrom(this.f89756b, h72.forCodedInput(input), extensionRegistry);
                return this;
            } catch (RuntimeException e) {
                if (e.getCause() instanceof IOException) {
                    throw ((IOException) e.getCause());
                }
                throw e;
            }
        }
    }

    /* JADX INFO: renamed from: v27$d */
    public static abstract class AbstractC13825d<MessageType extends AbstractC13826e<MessageType, BuilderType>, BuilderType extends AbstractC13825d<MessageType, BuilderType>> extends AbstractC13823b<MessageType, BuilderType> implements InterfaceC13827f<MessageType, BuilderType> {
        public AbstractC13825d(MessageType defaultInstance) {
            super(defaultInstance);
        }

        private as5<C13828g> ensureExtensionsAreMutable() {
            as5<C13828g> as5Var = ((AbstractC13826e) this.f89756b).extensions;
            if (!as5Var.isImmutable()) {
                return as5Var;
            }
            as5 as5VarClone = as5Var.m27878clone();
            ((AbstractC13826e) this.f89756b).extensions = as5VarClone;
            return as5VarClone;
        }

        private void verifyExtensionContainingType(final C13829h<MessageType, ?> extension) {
            if (extension.getContainingTypeDefaultInstance() != getDefaultInstanceForType()) {
                throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
            }
        }

        public final <Type> BuilderType addExtension(final ui5<MessageType, List<Type>> extension, final Type value) {
            C13829h<MessageType, ?> c13829hCheckIsLite = v27.checkIsLite(extension);
            verifyExtensionContainingType(c13829hCheckIsLite);
            m23743e();
            ensureExtensionsAreMutable().addRepeatedField(c13829hCheckIsLite.f89770d, c13829hCheckIsLite.m23758d(value));
            return this;
        }

        public final BuilderType clearExtension(final ui5<MessageType, ?> extension) {
            C13829h<MessageType, ?> c13829hCheckIsLite = v27.checkIsLite(extension);
            verifyExtensionContainingType(c13829hCheckIsLite);
            m23743e();
            ensureExtensionsAreMutable().clearField(c13829hCheckIsLite.f89770d);
            return this;
        }

        @Override // p000.v27.AbstractC13823b
        /* JADX INFO: renamed from: f */
        public void mo23744f() {
            super.mo23744f();
            if (((AbstractC13826e) this.f89756b).extensions != as5.emptySet()) {
                MessageType messagetype = this.f89756b;
                ((AbstractC13826e) messagetype).extensions = ((AbstractC13826e) messagetype).extensions.m27878clone();
            }
        }

        @Override // p000.v27.InterfaceC13827f
        public final <Type> Type getExtension(ui5<MessageType, Type> ui5Var) {
            return (Type) ((AbstractC13826e) this.f89756b).getExtension(ui5Var);
        }

        @Override // p000.v27.InterfaceC13827f
        public final <Type> int getExtensionCount(final ui5<MessageType, List<Type>> extension) {
            return ((AbstractC13826e) this.f89756b).getExtensionCount(extension);
        }

        /* JADX INFO: renamed from: h */
        public void m23746h(as5<C13828g> extensions) {
            m23743e();
            ((AbstractC13826e) this.f89756b).extensions = extensions;
        }

        @Override // p000.v27.InterfaceC13827f
        public final <Type> boolean hasExtension(final ui5<MessageType, Type> extension) {
            return ((AbstractC13826e) this.f89756b).hasExtension(extension);
        }

        public final <Type> BuilderType setExtension(final ui5<MessageType, Type> extension, final Type value) {
            C13829h<MessageType, ?> c13829hCheckIsLite = v27.checkIsLite(extension);
            verifyExtensionContainingType(c13829hCheckIsLite);
            m23743e();
            ensureExtensionsAreMutable().setField(c13829hCheckIsLite.f89770d, c13829hCheckIsLite.m23759e(value));
            return this;
        }

        @Override // p000.v27.InterfaceC13827f
        public final <Type> Type getExtension(ui5<MessageType, List<Type>> ui5Var, int i) {
            return (Type) ((AbstractC13826e) this.f89756b).getExtension(ui5Var, i);
        }

        @Override // p000.v27.AbstractC13823b, p000.qsa.InterfaceC11668a
        public final MessageType buildPartial() {
            if (!((AbstractC13826e) this.f89756b).m23725E()) {
                return (MessageType) this.f89756b;
            }
            ((AbstractC13826e) this.f89756b).extensions.makeImmutable();
            return (MessageType) super.buildPartial();
        }

        public final <Type> BuilderType setExtension(final ui5<MessageType, List<Type>> extension, final int index, final Type value) {
            C13829h<MessageType, ?> c13829hCheckIsLite = v27.checkIsLite(extension);
            verifyExtensionContainingType(c13829hCheckIsLite);
            m23743e();
            ensureExtensionsAreMutable().setRepeatedField(c13829hCheckIsLite.f89770d, index, c13829hCheckIsLite.m23758d(value));
            return this;
        }
    }

    /* JADX INFO: renamed from: v27$f */
    public interface InterfaceC13827f<MessageType extends AbstractC13826e<MessageType, BuilderType>, BuilderType extends AbstractC13825d<MessageType, BuilderType>> extends rsa {
        <Type> Type getExtension(ui5<MessageType, Type> extension);

        <Type> Type getExtension(ui5<MessageType, List<Type>> extension, int index);

        <Type> int getExtensionCount(ui5<MessageType, List<Type>> extension);

        <Type> boolean hasExtension(ui5<MessageType, Type> extension);
    }

    /* JADX INFO: renamed from: v27$g */
    public static final class C13828g implements as5.InterfaceC1587c<C13828g> {

        /* JADX INFO: renamed from: a */
        public final w98.InterfaceC14498e<?> f89762a;

        /* JADX INFO: renamed from: b */
        public final int f89763b;

        /* JADX INFO: renamed from: c */
        public final hpi.EnumC6968b f89764c;

        /* JADX INFO: renamed from: d */
        public final boolean f89765d;

        /* JADX INFO: renamed from: e */
        public final boolean f89766e;

        public C13828g(final w98.InterfaceC14498e<?> enumTypeMap, final int number, final hpi.EnumC6968b type, final boolean isRepeated, final boolean isPacked) {
            this.f89762a = enumTypeMap;
            this.f89763b = number;
            this.f89764c = type;
            this.f89765d = isRepeated;
            this.f89766e = isPacked;
        }

        @Override // p000.as5.InterfaceC1587c
        public w98.InterfaceC14498e<?> getEnumType() {
            return this.f89762a;
        }

        @Override // p000.as5.InterfaceC1587c
        public hpi.EnumC6969c getLiteJavaType() {
            return this.f89764c.getJavaType();
        }

        @Override // p000.as5.InterfaceC1587c
        public hpi.EnumC6968b getLiteType() {
            return this.f89764c;
        }

        @Override // p000.as5.InterfaceC1587c
        public int getNumber() {
            return this.f89763b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.as5.InterfaceC1587c
        public qsa.InterfaceC11668a internalMergeFrom(qsa.InterfaceC11668a to, qsa from) {
            return ((AbstractC13823b) to).mergeFrom((v27) from);
        }

        @Override // p000.as5.InterfaceC1587c
        public boolean isPacked() {
            return this.f89766e;
        }

        @Override // p000.as5.InterfaceC1587c
        public boolean isRepeated() {
            return this.f89765d;
        }

        @Override // java.lang.Comparable
        public int compareTo(C13828g other) {
            return this.f89763b - other.f89763b;
        }
    }

    /* JADX INFO: renamed from: v27$h */
    public static class C13829h<ContainingType extends qsa, Type> extends ui5<ContainingType, Type> {

        /* JADX INFO: renamed from: a */
        public final ContainingType f89767a;

        /* JADX INFO: renamed from: b */
        public final Type f89768b;

        /* JADX INFO: renamed from: c */
        public final qsa f89769c;

        /* JADX INFO: renamed from: d */
        public final C13828g f89770d;

        public C13829h(final ContainingType containingTypeDefaultInstance, final Type defaultValue, final qsa messageDefaultInstance, final C13828g descriptor, final Class singularType) {
            if (containingTypeDefaultInstance == null) {
                throw new IllegalArgumentException("Null containingTypeDefaultInstance");
            }
            if (descriptor.getLiteType() == hpi.EnumC6968b.f44488N && messageDefaultInstance == null) {
                throw new IllegalArgumentException("Null messageDefaultInstance");
            }
            this.f89767a = containingTypeDefaultInstance;
            this.f89768b = defaultValue;
            this.f89769c = messageDefaultInstance;
            this.f89770d = descriptor;
        }

        /* JADX INFO: renamed from: b */
        public Object m23756b(Object value) {
            if (!this.f89770d.isRepeated()) {
                return m23757c(value);
            }
            if (this.f89770d.getLiteJavaType() != hpi.EnumC6969c.ENUM) {
                return value;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                arrayList.add(m23757c(it.next()));
            }
            return arrayList;
        }

        /* JADX INFO: renamed from: c */
        public Object m23757c(Object value) {
            return this.f89770d.getLiteJavaType() == hpi.EnumC6969c.ENUM ? this.f89770d.f89762a.findValueByNumber(((Integer) value).intValue()) : value;
        }

        /* JADX INFO: renamed from: d */
        public Object m23758d(Object value) {
            return this.f89770d.getLiteJavaType() == hpi.EnumC6969c.ENUM ? Integer.valueOf(((w98.InterfaceC14497d) value).getNumber()) : value;
        }

        /* JADX INFO: renamed from: e */
        public Object m23759e(Object value) {
            if (!this.f89770d.isRepeated()) {
                return m23758d(value);
            }
            if (this.f89770d.getLiteJavaType() != hpi.EnumC6969c.ENUM) {
                return value;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                arrayList.add(m23758d(it.next()));
            }
            return arrayList;
        }

        public ContainingType getContainingTypeDefaultInstance() {
            return this.f89767a;
        }

        @Override // p000.ui5
        public Type getDefaultValue() {
            return this.f89768b;
        }

        @Override // p000.ui5
        public hpi.EnumC6968b getLiteType() {
            return this.f89770d.getLiteType();
        }

        @Override // p000.ui5
        public qsa getMessageDefaultInstance() {
            return this.f89769c;
        }

        @Override // p000.ui5
        public int getNumber() {
            return this.f89770d.getNumber();
        }

        @Override // p000.ui5
        public boolean isRepeated() {
            return this.f89770d.f89765d;
        }
    }

    /* JADX INFO: renamed from: v27$i */
    public enum EnumC13830i {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    /* JADX INFO: renamed from: v27$j */
    public static final class C13831j implements Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a */
        public final Class<?> f89779a;

        /* JADX INFO: renamed from: b */
        public final String f89780b;

        /* JADX INFO: renamed from: c */
        public final byte[] f89781c;

        public C13831j(qsa regularForm) {
            this.f89779a = regularForm.getClass();
            this.f89780b = regularForm.getClass().getName();
            this.f89781c = regularForm.toByteArray();
        }

        /* JADX INFO: renamed from: of */
        public static C13831j m23760of(qsa message) {
            return new C13831j(message);
        }

        @Deprecated
        private Object readResolveFallback() throws ObjectStreamException {
            try {
                Field declaredField = resolveMessageClass().getDeclaredField("defaultInstance");
                declaredField.setAccessible(true);
                return ((qsa) declaredField.get(null)).newBuilderForType().mergeFrom(this.f89781c).buildPartial();
            } catch (ce8 e) {
                throw new RuntimeException("Unable to understand proto buffer", e);
            } catch (ClassNotFoundException e2) {
                throw new RuntimeException("Unable to find proto buffer class: " + this.f89780b, e2);
            } catch (IllegalAccessException e3) {
                throw new RuntimeException("Unable to call parsePartialFrom", e3);
            } catch (NoSuchFieldException e4) {
                throw new RuntimeException("Unable to find defaultInstance in " + this.f89780b, e4);
            } catch (SecurityException e5) {
                throw new RuntimeException("Unable to call defaultInstance in " + this.f89780b, e5);
            }
        }

        private Class<?> resolveMessageClass() throws ClassNotFoundException {
            Class<?> cls = this.f89779a;
            return cls != null ? cls : Class.forName(this.f89780b);
        }

        public Object readResolve() throws ObjectStreamException {
            try {
                Field declaredField = resolveMessageClass().getDeclaredField("DEFAULT_INSTANCE");
                declaredField.setAccessible(true);
                return ((qsa) declaredField.get(null)).newBuilderForType().mergeFrom(this.f89781c).buildPartial();
            } catch (ce8 e) {
                throw new RuntimeException("Unable to understand proto buffer", e);
            } catch (ClassNotFoundException e2) {
                throw new RuntimeException("Unable to find proto buffer class: " + this.f89780b, e2);
            } catch (IllegalAccessException e3) {
                throw new RuntimeException("Unable to call parsePartialFrom", e3);
            } catch (NoSuchFieldException unused) {
                return readResolveFallback();
            } catch (SecurityException e4) {
                throw new RuntimeException("Unable to call DEFAULT_INSTANCE in " + this.f89780b, e4);
            }
        }
    }

    /* JADX INFO: renamed from: A */
    public static Method m23690A(Class clazz, String name, Class... params) {
        try {
            return clazz.getMethod(name, params);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException("Generated message class \"" + clazz.getName() + "\" missing method \"" + name + "\".", e);
        }
    }

    /* JADX INFO: renamed from: C */
    public static Object m23691C(Method method, Object object, Object... params) {
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

    /* JADX INFO: renamed from: D */
    public static final <T extends v27<T, ?>> boolean m23692D(T message, boolean shouldMemoize) {
        byte bByteValue = ((Byte) message.m23740p(EnumC13830i.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zIsInitialized = khd.getInstance().schemaFor(message).isInitialized(message);
        if (shouldMemoize) {
            message.m23741q(EnumC13830i.SET_MEMOIZED_IS_INITIALIZED, zIsInitialized ? message : null);
        }
        return zIsInitialized;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [w98$b] */
    /* JADX INFO: renamed from: K */
    public static w98.InterfaceC14495b m23693K(w98.InterfaceC14495b list) {
        int size = list.size();
        return list.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [w98$c] */
    /* JADX INFO: renamed from: L */
    public static w98.InterfaceC14496c m23694L(w98.InterfaceC14496c list) {
        int size = list.size();
        return list.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [w98$g] */
    /* JADX INFO: renamed from: M */
    public static w98.InterfaceC14500g m23695M(w98.InterfaceC14500g list) {
        int size = list.size();
        return list.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [w98$h] */
    /* JADX INFO: renamed from: N */
    public static w98.InterfaceC14501h m23696N(w98.InterfaceC14501h list) {
        int size = list.size();
        return list.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [w98$j] */
    /* JADX INFO: renamed from: O */
    public static w98.InterfaceC14503j m23697O(w98.InterfaceC14503j list) {
        int size = list.size();
        return list.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
    }

    /* JADX INFO: renamed from: P */
    public static <E> w98.InterfaceC14504k<E> m23698P(w98.InterfaceC14504k<E> list) {
        int size = list.size();
        return list.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
    }

    /* JADX INFO: renamed from: Q */
    public static Object m23699Q(qsa defaultInstance, String info, Object[] objects) {
        return new spd(defaultInstance, info, objects);
    }

    /* JADX INFO: renamed from: S */
    public static <T extends v27<T, ?>> T m23700S(T t, InputStream inputStream) throws ce8 {
        return (T) checkMessageInitialized(parsePartialDelimitedFrom(t, inputStream, zi5.getEmptyRegistry()));
    }

    /* JADX INFO: renamed from: T */
    public static <T extends v27<T, ?>> T m23701T(T t, InputStream inputStream, zi5 zi5Var) throws ce8 {
        return (T) checkMessageInitialized(parsePartialDelimitedFrom(t, inputStream, zi5Var));
    }

    /* JADX INFO: renamed from: U */
    public static <T extends v27<T, ?>> T m23702U(T t, vj1 vj1Var) throws ce8 {
        return (T) checkMessageInitialized(m23703V(t, vj1Var, zi5.getEmptyRegistry()));
    }

    /* JADX INFO: renamed from: V */
    public static <T extends v27<T, ?>> T m23703V(T t, vj1 vj1Var, zi5 zi5Var) throws ce8 {
        return (T) checkMessageInitialized(parsePartialFrom(t, vj1Var, zi5Var));
    }

    /* JADX INFO: renamed from: W */
    public static <T extends v27<T, ?>> T m23704W(T t, f72 f72Var) throws ce8 {
        return (T) m23705X(t, f72Var, zi5.getEmptyRegistry());
    }

    /* JADX INFO: renamed from: X */
    public static <T extends v27<T, ?>> T m23705X(T t, f72 f72Var, zi5 zi5Var) throws ce8 {
        return (T) checkMessageInitialized(m23713f0(t, f72Var, zi5Var));
    }

    /* JADX INFO: renamed from: Y */
    public static <T extends v27<T, ?>> T m23706Y(T t, InputStream inputStream) throws ce8 {
        return (T) checkMessageInitialized(m23713f0(t, f72.newInstance(inputStream), zi5.getEmptyRegistry()));
    }

    /* JADX INFO: renamed from: Z */
    public static <T extends v27<T, ?>> T m23707Z(T t, InputStream inputStream, zi5 zi5Var) throws ce8 {
        return (T) checkMessageInitialized(m23713f0(t, f72.newInstance(inputStream), zi5Var));
    }

    /* JADX INFO: renamed from: a0 */
    public static <T extends v27<T, ?>> T m23708a0(T t, ByteBuffer byteBuffer) throws ce8 {
        return (T) m23709b0(t, byteBuffer, zi5.getEmptyRegistry());
    }

    /* JADX INFO: renamed from: b0 */
    public static <T extends v27<T, ?>> T m23709b0(T t, ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
        return (T) checkMessageInitialized(m23705X(t, f72.newInstance(byteBuffer), zi5Var));
    }

    /* JADX INFO: renamed from: c0 */
    public static <T extends v27<T, ?>> T m23710c0(T t, byte[] bArr) throws ce8 {
        return (T) checkMessageInitialized(parsePartialFrom(t, bArr, 0, bArr.length, zi5.getEmptyRegistry()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <MessageType extends AbstractC13826e<MessageType, BuilderType>, BuilderType extends AbstractC13825d<MessageType, BuilderType>, T> C13829h<MessageType, T> checkIsLite(ui5<MessageType, T> extension) {
        if (extension.m23369a()) {
            return (C13829h) extension;
        }
        throw new IllegalArgumentException("Expected a lite extension.");
    }

    private static <T extends v27<T, ?>> T checkMessageInitialized(T message) throws ce8 {
        if (message == null || message.isInitialized()) {
            return message;
        }
        throw message.m2860f().asInvalidProtocolBufferException().setUnfinishedMessage(message);
    }

    private int computeSerializedSize(tpe<?> nullableSchema) {
        return nullableSchema == null ? khd.getInstance().schemaFor(this).getSerializedSize(this) : nullableSchema.getSerializedSize(this);
    }

    /* JADX INFO: renamed from: d0 */
    public static <T extends v27<T, ?>> T m23711d0(T t, byte[] bArr, zi5 zi5Var) throws ce8 {
        return (T) checkMessageInitialized(parsePartialFrom(t, bArr, 0, bArr.length, zi5Var));
    }

    /* JADX INFO: renamed from: e0 */
    public static <T extends v27<T, ?>> T m23712e0(T t, f72 f72Var) throws ce8 {
        return (T) m23713f0(t, f72Var, zi5.getEmptyRegistry());
    }

    private void ensureUnknownFieldsInitialized() {
        if (this.unknownFields == tth.getDefaultInstance()) {
            this.unknownFields = tth.m22836g();
        }
    }

    /* JADX INFO: renamed from: f0 */
    public static <T extends v27<T, ?>> T m23713f0(T t, f72 f72Var, zi5 zi5Var) throws ce8 {
        T t2 = (T) t.m23731R();
        try {
            tpe tpeVarSchemaFor = khd.getInstance().schemaFor(t2);
            tpeVarSchemaFor.mergeFrom(t2, h72.forCodedInput(f72Var), zi5Var);
            tpeVarSchemaFor.makeImmutable(t2);
            return t2;
        } catch (ce8 e) {
            e = e;
            if (e.m3929a()) {
                e = new ce8((IOException) e);
            }
            throw e.setUnfinishedMessage(t2);
        } catch (IOException e2) {
            if (e2.getCause() instanceof ce8) {
                throw ((ce8) e2.getCause());
            }
            throw new ce8(e2).setUnfinishedMessage(t2);
        } catch (ssh e3) {
            throw e3.asInvalidProtocolBufferException().setUnfinishedMessage(t2);
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof ce8) {
                throw ((ce8) e4.getCause());
            }
            throw e4;
        }
    }

    /* JADX INFO: renamed from: h0 */
    public static <T extends v27<?, ?>> void m23715h0(Class<T> clazz, T defaultInstance) {
        defaultInstance.m23727G();
        defaultInstanceMap.put(clazz, defaultInstance);
    }

    public static <ContainingType extends qsa, Type> C13829h<ContainingType, Type> newRepeatedGeneratedExtension(final ContainingType containingTypeDefaultInstance, final qsa messageDefaultInstance, final w98.InterfaceC14498e<?> enumTypeMap, final int number, final hpi.EnumC6968b type, final boolean isPacked, final Class singularType) {
        return new C13829h<>(containingTypeDefaultInstance, Collections.emptyList(), messageDefaultInstance, new C13828g(enumTypeMap, number, type, true, isPacked), singularType);
    }

    public static <ContainingType extends qsa, Type> C13829h<ContainingType, Type> newSingularGeneratedExtension(final ContainingType containingTypeDefaultInstance, final Type defaultValue, final qsa messageDefaultInstance, final w98.InterfaceC14498e<?> enumTypeMap, final int number, final hpi.EnumC6968b type, final Class singularType) {
        return new C13829h<>(containingTypeDefaultInstance, defaultValue, messageDefaultInstance, new C13828g(enumTypeMap, number, type, false, false), singularType);
    }

    private static <T extends v27<T, ?>> T parsePartialDelimitedFrom(T t, InputStream inputStream, zi5 zi5Var) throws ce8 {
        try {
            int i = inputStream.read();
            if (i == -1) {
                return null;
            }
            f72 f72VarNewInstance = f72.newInstance(new AbstractC1714b3.a.C16409a(inputStream, f72.readRawVarint32(i, inputStream)));
            T t2 = (T) m23713f0(t, f72VarNewInstance, zi5Var);
            try {
                f72VarNewInstance.checkLastTagWas(0);
                return t2;
            } catch (ce8 e) {
                throw e.setUnfinishedMessage(t2);
            }
        } catch (ce8 e2) {
            if (e2.m3929a()) {
                throw new ce8((IOException) e2);
            }
            throw e2;
        } catch (IOException e3) {
            throw new ce8(e3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T extends v27<T, ?>> T parsePartialFrom(T t, byte[] bArr, int i, int i2, zi5 zi5Var) throws ce8 {
        T t2 = (T) t.m23731R();
        try {
            tpe tpeVarSchemaFor = khd.getInstance().schemaFor(t2);
            tpeVarSchemaFor.mergeFrom(t2, bArr, i, i + i2, new d60.C4625b(zi5Var));
            tpeVarSchemaFor.makeImmutable(t2);
            return t2;
        } catch (ce8 e) {
            e = e;
            if (e.m3929a()) {
                e = new ce8((IOException) e);
            }
            throw e.setUnfinishedMessage(t2);
        } catch (IOException e2) {
            if (e2.getCause() instanceof ce8) {
                throw ((ce8) e2.getCause());
            }
            throw new ce8(e2).setUnfinishedMessage(t2);
        } catch (IndexOutOfBoundsException unused) {
            throw ce8.m3928l().setUnfinishedMessage(t2);
        } catch (ssh e3) {
            throw e3.asInvalidProtocolBufferException().setUnfinishedMessage(t2);
        }
    }

    /* JADX INFO: renamed from: s */
    public static w98.InterfaceC14495b m23717s() {
        return ra1.emptyList();
    }

    /* JADX INFO: renamed from: t */
    public static w98.InterfaceC14496c m23718t() {
        return uj4.emptyList();
    }

    /* JADX INFO: renamed from: u */
    public static w98.InterfaceC14500g m23719u() {
        return a46.emptyList();
    }

    /* JADX INFO: renamed from: v */
    public static w98.InterfaceC14501h m23720v() {
        return b68.emptyList();
    }

    /* JADX INFO: renamed from: w */
    public static w98.InterfaceC14503j m23721w() {
        return rk9.emptyList();
    }

    /* JADX INFO: renamed from: x */
    public static <E> w98.InterfaceC14504k<E> m23722x() {
        return mhd.emptyList();
    }

    /* JADX INFO: renamed from: y */
    public static <T extends v27<?, ?>> T m23723y(Class<T> cls) {
        v27<?, ?> v27Var = defaultInstanceMap.get(cls);
        if (v27Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                v27Var = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (v27Var == null) {
            v27Var = (T) ((v27) dvh.m9480l(cls)).getDefaultInstanceForType();
            if (v27Var == null) {
                throw new IllegalStateException();
            }
            defaultInstanceMap.put(cls, v27Var);
        }
        return (T) v27Var;
    }

    /* JADX INFO: renamed from: B */
    public boolean m23724B() {
        return m23742z() == 0;
    }

    /* JADX INFO: renamed from: E */
    public boolean m23725E() {
        return (this.memoizedSerializedSize & Integer.MIN_VALUE) != 0;
    }

    /* JADX INFO: renamed from: F */
    public void m23726F() {
        khd.getInstance().schemaFor(this).makeImmutable(this);
        m23727G();
    }

    /* JADX INFO: renamed from: G */
    public void m23727G() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    /* JADX INFO: renamed from: H */
    public void m23728H(int fieldNumber, vj1 value) {
        ensureUnknownFieldsInitialized();
        this.unknownFields.m22840d(fieldNumber, value);
    }

    /* JADX INFO: renamed from: I */
    public final void m23729I(tth unknownFields) {
        this.unknownFields = tth.m22835f(this.unknownFields, unknownFields);
    }

    /* JADX INFO: renamed from: J */
    public void m23730J(int tag, int value) {
        ensureUnknownFieldsInitialized();
        this.unknownFields.m22841e(tag, value);
    }

    /* JADX INFO: renamed from: R */
    public MessageType m23731R() {
        return (MessageType) m23740p(EnumC13830i.NEW_MUTABLE_INSTANCE);
    }

    @Override // p000.AbstractC1714b3
    /* JADX INFO: renamed from: d */
    public int mo2858d() {
        return this.memoizedSerializedSize & Integer.MAX_VALUE;
    }

    @Override // p000.AbstractC1714b3
    /* JADX INFO: renamed from: e */
    public int mo2859e(tpe schema) {
        if (!m23725E()) {
            if (mo2858d() != Integer.MAX_VALUE) {
                return mo2858d();
            }
            int iComputeSerializedSize = computeSerializedSize(schema);
            mo2861g(iComputeSerializedSize);
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
            return khd.getInstance().schemaFor(this).equals(this, (v27) other);
        }
        return false;
    }

    @Override // p000.AbstractC1714b3
    /* JADX INFO: renamed from: g */
    public void mo2861g(int size) {
        if (size >= 0) {
            this.memoizedSerializedSize = (size & Integer.MAX_VALUE) | (this.memoizedSerializedSize & Integer.MIN_VALUE);
        } else {
            throw new IllegalStateException("serialized size must be non-negative, was " + size);
        }
    }

    /* JADX INFO: renamed from: g0 */
    public boolean m23732g0(int tag, f72 input) throws IOException {
        if (hpi.getTagWireType(tag) == 4) {
            return false;
        }
        ensureUnknownFieldsInitialized();
        return this.unknownFields.m22838b(tag, input);
    }

    @Override // p000.qsa
    public final uhc<MessageType> getParserForType() {
        return (uhc) m23740p(EnumC13830i.GET_PARSER);
    }

    @Override // p000.qsa
    public int getSerializedSize() {
        return mo2859e(null);
    }

    public int hashCode() {
        if (m23725E()) {
            return m23737m();
        }
        if (m23724B()) {
            m23733i0(m23737m());
        }
        return m23742z();
    }

    /* JADX INFO: renamed from: i0 */
    public void m23733i0(int value) {
        this.memoizedHashCode = value;
    }

    @Override // p000.rsa
    public final boolean isInitialized() {
        return m23692D(this, true);
    }

    /* JADX INFO: renamed from: j */
    public Object m23734j() throws Exception {
        return m23740p(EnumC13830i.BUILD_MESSAGE_INFO);
    }

    /* JADX INFO: renamed from: k */
    public void m23735k() {
        this.memoizedHashCode = 0;
    }

    /* JADX INFO: renamed from: l */
    public void m23736l() {
        mo2861g(Integer.MAX_VALUE);
    }

    /* JADX INFO: renamed from: m */
    public int m23737m() {
        return khd.getInstance().schemaFor(this).hashCode(this);
    }

    /* JADX INFO: renamed from: n */
    public final <MessageType extends v27<MessageType, BuilderType>, BuilderType extends AbstractC13823b<MessageType, BuilderType>> BuilderType m23738n() {
        return (BuilderType) m23740p(EnumC13830i.NEW_BUILDER);
    }

    /* JADX INFO: renamed from: o */
    public final <MessageType extends v27<MessageType, BuilderType>, BuilderType extends AbstractC13823b<MessageType, BuilderType>> BuilderType m23739o(MessageType messagetype) {
        return (BuilderType) m23738n().mergeFrom((v27) messagetype);
    }

    /* JADX INFO: renamed from: p */
    public Object m23740p(EnumC13830i method) {
        return mo149r(method, null, null);
    }

    @pp1
    /* JADX INFO: renamed from: q */
    public Object m23741q(EnumC13830i method, Object arg0) {
        return mo149r(method, arg0, null);
    }

    /* JADX INFO: renamed from: r */
    public abstract Object mo149r(EnumC13830i method, Object arg0, Object arg1);

    public String toString() {
        return tsa.m22765b(this, super.toString());
    }

    @Override // p000.qsa
    public void writeTo(j72 output) throws IOException {
        khd.getInstance().schemaFor(this).writeTo(this, l72.forCodedOutput(output));
    }

    /* JADX INFO: renamed from: z */
    public int m23742z() {
        return this.memoizedHashCode;
    }

    @Override // p000.rsa
    public final MessageType getDefaultInstanceForType() {
        return (MessageType) m23740p(EnumC13830i.GET_DEFAULT_INSTANCE);
    }

    @Override // p000.qsa
    public final BuilderType newBuilderForType() {
        return (BuilderType) m23740p(EnumC13830i.NEW_BUILDER);
    }

    @Override // p000.qsa
    public final BuilderType toBuilder() {
        return (BuilderType) ((AbstractC13823b) m23740p(EnumC13830i.NEW_BUILDER)).mergeFrom(this);
    }

    /* JADX INFO: renamed from: v27$c */
    public static class C13824c<T extends v27<T, ?>> extends AbstractC10776p3<T> {

        /* JADX INFO: renamed from: b */
        public final T f89757b;

        public C13824c(T defaultInstance) {
            this.f89757b = defaultInstance;
        }

        @Override // p000.uhc
        public T parsePartialFrom(f72 f72Var, zi5 zi5Var) throws ce8 {
            return (T) v27.m23713f0(this.f89757b, f72Var, zi5Var);
        }

        @Override // p000.AbstractC10776p3, p000.uhc
        public T parsePartialFrom(byte[] bArr, int i, int i2, zi5 zi5Var) throws ce8 {
            return (T) v27.parsePartialFrom(this.f89757b, bArr, i, i2, zi5Var);
        }
    }

    /* JADX INFO: renamed from: v27$e */
    public static abstract class AbstractC13826e<MessageType extends AbstractC13826e<MessageType, BuilderType>, BuilderType extends AbstractC13825d<MessageType, BuilderType>> extends v27<MessageType, BuilderType> implements InterfaceC13827f<MessageType, BuilderType> {
        protected as5<C13828g> extensions = as5.emptySet();

        /* JADX INFO: renamed from: v27$e$a */
        public class a {

            /* JADX INFO: renamed from: a */
            public final Iterator<Map.Entry<C13828g, Object>> f89758a;

            /* JADX INFO: renamed from: b */
            public Map.Entry<C13828g, Object> f89759b;

            /* JADX INFO: renamed from: c */
            public final boolean f89760c;

            public /* synthetic */ a(AbstractC13826e abstractC13826e, boolean z, C13822a c13822a) {
                this(z);
            }

            public void writeUntil(final int end, final j72 output) throws IOException {
                while (true) {
                    Map.Entry<C13828g, Object> entry = this.f89759b;
                    if (entry == null || entry.getKey().getNumber() >= end) {
                        return;
                    }
                    C13828g key = this.f89759b.getKey();
                    if (this.f89760c && key.getLiteJavaType() == hpi.EnumC6969c.MESSAGE && !key.isRepeated()) {
                        output.writeMessageSetExtension(key.getNumber(), (qsa) this.f89759b.getValue());
                    } else {
                        as5.writeField(key, this.f89759b.getValue(), output);
                    }
                    if (this.f89758a.hasNext()) {
                        this.f89759b = this.f89758a.next();
                    } else {
                        this.f89759b = null;
                    }
                }
            }

            private a(boolean messageSetWireFormat) {
                Iterator it = AbstractC13826e.this.extensions.iterator();
                this.f89758a = it;
                if (it.hasNext()) {
                    this.f89759b = (Map.Entry) it.next();
                }
                this.f89760c = messageSetWireFormat;
            }
        }

        private void eagerlyMergeMessageSetExtension(f72 input, C13829h<?, ?> extension, zi5 extensionRegistry, int typeId) throws IOException {
            parseExtension(input, extensionRegistry, extension, hpi.m12536a(typeId, 2), typeId);
        }

        private void mergeMessageSetExtensionFromBytes(vj1 rawBytes, zi5 extensionRegistry, C13829h<?, ?> extension) throws IOException {
            qsa qsaVar = (qsa) this.extensions.getField(extension.f89770d);
            qsa.InterfaceC11668a builder = qsaVar != null ? qsaVar.toBuilder() : null;
            if (builder == null) {
                builder = extension.getMessageDefaultInstance().newBuilderForType();
            }
            builder.mergeFrom(rawBytes, extensionRegistry);
            m23747j0().setField(extension.f89770d, extension.m23758d(builder.build()));
        }

        private <MessageType extends qsa> void mergeMessageSetExtensionFromCodedStream(MessageType defaultInstance, f72 input, zi5 extensionRegistry) throws IOException {
            int uInt32 = 0;
            vj1 bytes = null;
            C13829h<?, ?> c13829hFindLiteExtensionByNumber = null;
            while (true) {
                int tag = input.readTag();
                if (tag == 0) {
                    break;
                }
                if (tag == hpi.f44479s) {
                    uInt32 = input.readUInt32();
                    if (uInt32 != 0) {
                        c13829hFindLiteExtensionByNumber = extensionRegistry.findLiteExtensionByNumber(defaultInstance, uInt32);
                    }
                } else if (tag == hpi.f44480t) {
                    if (uInt32 == 0 || c13829hFindLiteExtensionByNumber == null) {
                        bytes = input.readBytes();
                    } else {
                        eagerlyMergeMessageSetExtension(input, c13829hFindLiteExtensionByNumber, extensionRegistry, uInt32);
                        bytes = null;
                    }
                } else if (!input.skipField(tag)) {
                    break;
                }
            }
            input.checkLastTagWas(hpi.f44478r);
            if (bytes == null || uInt32 == 0) {
                return;
            }
            if (c13829hFindLiteExtensionByNumber != null) {
                mergeMessageSetExtensionFromBytes(bytes, extensionRegistry, c13829hFindLiteExtensionByNumber);
            } else {
                m23728H(uInt32, bytes);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:4:0x0008  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private boolean parseExtension(p000.f72 r6, p000.zi5 r7, p000.v27.C13829h<?, ?> r8, int r9, int r10) throws java.io.IOException {
            /*
                Method dump skipped, instruction units count: 293
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.v27.AbstractC13826e.parseExtension(f72, zi5, v27$h, int, int):boolean");
        }

        private void verifyExtensionContainingType(final C13829h<MessageType, ?> extension) {
            if (extension.getContainingTypeDefaultInstance() != getDefaultInstanceForType()) {
                throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
            }
        }

        @Override // p000.v27, p000.rsa
        public /* bridge */ /* synthetic */ qsa getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // p000.v27.InterfaceC13827f
        public final <Type> Type getExtension(ui5<MessageType, Type> ui5Var) {
            C13829h<MessageType, ?> c13829hCheckIsLite = v27.checkIsLite(ui5Var);
            verifyExtensionContainingType(c13829hCheckIsLite);
            Object field = this.extensions.getField(c13829hCheckIsLite.f89770d);
            return field == null ? c13829hCheckIsLite.f89768b : (Type) c13829hCheckIsLite.m23756b(field);
        }

        @Override // p000.v27.InterfaceC13827f
        public final <Type> int getExtensionCount(final ui5<MessageType, List<Type>> extension) {
            C13829h<MessageType, ?> c13829hCheckIsLite = v27.checkIsLite(extension);
            verifyExtensionContainingType(c13829hCheckIsLite);
            return this.extensions.getRepeatedFieldCount(c13829hCheckIsLite.f89770d);
        }

        @Override // p000.v27.InterfaceC13827f
        public final <Type> boolean hasExtension(final ui5<MessageType, Type> extension) {
            C13829h<MessageType, ?> c13829hCheckIsLite = v27.checkIsLite(extension);
            verifyExtensionContainingType(c13829hCheckIsLite);
            return this.extensions.hasField(c13829hCheckIsLite.f89770d);
        }

        @pp1
        /* JADX INFO: renamed from: j0 */
        public as5<C13828g> m23747j0() {
            if (this.extensions.isImmutable()) {
                this.extensions = this.extensions.m27878clone();
            }
            return this.extensions;
        }

        /* JADX INFO: renamed from: k0 */
        public boolean m23748k0() {
            return this.extensions.isInitialized();
        }

        /* JADX INFO: renamed from: l0 */
        public int m23749l0() {
            return this.extensions.getSerializedSize();
        }

        /* JADX INFO: renamed from: m0 */
        public int m23750m0() {
            return this.extensions.getMessageSetSerializedSize();
        }

        /* JADX INFO: renamed from: n0 */
        public final void m23751n0(final MessageType other) {
            if (this.extensions.isImmutable()) {
                this.extensions = this.extensions.m27878clone();
            }
            this.extensions.mergeFrom(other.extensions);
        }

        @Override // p000.v27, p000.qsa
        public /* bridge */ /* synthetic */ qsa.InterfaceC11668a newBuilderForType() {
            return super.newBuilderForType();
        }

        /* JADX INFO: renamed from: o0 */
        public AbstractC13826e<MessageType, BuilderType>.a m23752o0() {
            return new a(this, false, null);
        }

        /* JADX INFO: renamed from: p0 */
        public AbstractC13826e<MessageType, BuilderType>.a m23753p0() {
            return new a(this, true, null);
        }

        /* JADX INFO: renamed from: q0 */
        public <MessageType extends qsa> boolean m23754q0(MessageType defaultInstance, f72 input, zi5 extensionRegistry, int tag) throws IOException {
            int tagFieldNumber = hpi.getTagFieldNumber(tag);
            return parseExtension(input, extensionRegistry, extensionRegistry.findLiteExtensionByNumber(defaultInstance, tagFieldNumber), tag, tagFieldNumber);
        }

        /* JADX INFO: renamed from: r0 */
        public <MessageType extends qsa> boolean m23755r0(MessageType defaultInstance, f72 input, zi5 extensionRegistry, int tag) throws IOException {
            if (tag != hpi.f44477q) {
                return hpi.getTagWireType(tag) == 2 ? m23754q0(defaultInstance, input, extensionRegistry, tag) : input.skipField(tag);
            }
            mergeMessageSetExtensionFromCodedStream(defaultInstance, input, extensionRegistry);
            return true;
        }

        @Override // p000.v27, p000.qsa
        public /* bridge */ /* synthetic */ qsa.InterfaceC11668a toBuilder() {
            return super.toBuilder();
        }

        @Override // p000.v27.InterfaceC13827f
        public final <Type> Type getExtension(ui5<MessageType, List<Type>> ui5Var, int i) {
            C13829h<MessageType, ?> c13829hCheckIsLite = v27.checkIsLite(ui5Var);
            verifyExtensionContainingType(c13829hCheckIsLite);
            return (Type) c13829hCheckIsLite.m23757c(this.extensions.getRepeatedField(c13829hCheckIsLite.f89770d, i));
        }
    }

    private static <T extends v27<T, ?>> T parsePartialFrom(T t, vj1 vj1Var, zi5 zi5Var) throws ce8 {
        f72 f72VarNewCodedInput = vj1Var.newCodedInput();
        T t2 = (T) m23713f0(t, f72VarNewCodedInput, zi5Var);
        try {
            f72VarNewCodedInput.checkLastTagWas(0);
            return t2;
        } catch (ce8 e) {
            throw e.setUnfinishedMessage(t2);
        }
    }
}
