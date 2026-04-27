package p000;

import java.io.Serializable;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.security.AccessControlException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import okhttp3.HttpUrl;
import p000.kx7;
import p000.ox7;

/* JADX INFO: loaded from: classes5.dex */
@px4
public final class unh {

    /* JADX INFO: renamed from: a */
    public static final xj8 f88635a = xj8.m25235on(", ").useForNull("null");

    /* JADX INFO: renamed from: unh$a */
    public class C13622a extends smh {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ AtomicReference f88636b;

        public C13622a(final AtomicReference val$result) {
            this.f88636b = val$result;
        }

        @Override // p000.smh
        /* JADX INFO: renamed from: a */
        public void mo13200a(Class<?> t) {
            this.f88636b.set(t.getComponentType());
        }

        @Override // p000.smh
        /* JADX INFO: renamed from: b */
        public void mo13201b(GenericArrayType t) {
            this.f88636b.set(t.getGenericComponentType());
        }

        @Override // p000.smh
        /* JADX INFO: renamed from: d */
        public void mo13203d(TypeVariable<?> t) {
            this.f88636b.set(unh.subtypeOfComponentType(t.getBounds()));
        }

        @Override // p000.smh
        /* JADX INFO: renamed from: e */
        public void mo13204e(WildcardType t) {
            this.f88636b.set(unh.subtypeOfComponentType(t.getUpperBounds()));
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: unh$b */
    public static abstract class EnumC13623b {

        /* JADX INFO: renamed from: a */
        public static final EnumC13623b f88637a = new a("OWNED_BY_ENCLOSING_CLASS", 0);

        /* JADX INFO: renamed from: b */
        public static final EnumC13623b f88638b = new c("LOCAL_CLASS_HAS_NO_OWNER", 1);

        /* JADX INFO: renamed from: d */
        public static final /* synthetic */ EnumC13623b[] f88640d = $values();

        /* JADX INFO: renamed from: c */
        public static final EnumC13623b f88639c = detectJvmBehavior();

        /* JADX INFO: renamed from: unh$b$a */
        public enum a extends EnumC13623b {
            public a(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal, null);
            }

            @Override // p000.unh.EnumC13623b
            @wx1
            /* JADX INFO: renamed from: a */
            public Class<?> mo23481a(Class<?> rawType) {
                return rawType.getEnclosingClass();
            }
        }

        /* JADX INFO: renamed from: unh$b$b */
        public class b<T> {
        }

        /* JADX INFO: renamed from: unh$b$c */
        public enum c extends EnumC13623b {
            public c(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal, null);
            }

            @Override // p000.unh.EnumC13623b
            @wx1
            /* JADX INFO: renamed from: a */
            public Class<?> mo23481a(Class<?> rawType) {
                if (rawType.isLocalClass()) {
                    return null;
                }
                return rawType.getEnclosingClass();
            }
        }

        /* JADX INFO: renamed from: unh$b$d */
        public class d extends b<String> {
        }

        private static /* synthetic */ EnumC13623b[] $values() {
            return new EnumC13623b[]{f88637a, f88638b};
        }

        private EnumC13623b(String $enum$name, int $enum$ordinal) {
        }

        private static EnumC13623b detectJvmBehavior() {
            new d();
            ParameterizedType parameterizedType = (ParameterizedType) d.class.getGenericSuperclass();
            Objects.requireNonNull(parameterizedType);
            ParameterizedType parameterizedType2 = parameterizedType;
            for (EnumC13623b enumC13623b : values()) {
                if (enumC13623b.mo23481a(b.class) == parameterizedType2.getOwnerType()) {
                    return enumC13623b;
                }
            }
            throw new AssertionError();
        }

        public static EnumC13623b valueOf(String name) {
            return (EnumC13623b) Enum.valueOf(EnumC13623b.class, name);
        }

        public static EnumC13623b[] values() {
            return (EnumC13623b[]) f88640d.clone();
        }

        @wx1
        /* JADX INFO: renamed from: a */
        public abstract Class<?> mo23481a(Class<?> rawType);

        public /* synthetic */ EnumC13623b(String str, int i, C13622a c13622a) {
            this(str, i);
        }
    }

    /* JADX INFO: renamed from: unh$c */
    public static final class C13624c implements GenericArrayType, Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a */
        public final Type f88641a;

        public C13624c(Type componentType) {
            this.f88641a = EnumC13625d.f88646e.mo23486e(componentType);
        }

        public boolean equals(@wx1 Object obj) {
            if (obj instanceof GenericArrayType) {
                return okb.equal(getGenericComponentType(), ((GenericArrayType) obj).getGenericComponentType());
            }
            return false;
        }

        @Override // java.lang.reflect.GenericArrayType
        public Type getGenericComponentType() {
            return this.f88641a;
        }

        public int hashCode() {
            return this.f88641a.hashCode();
        }

        public String toString() {
            return unh.m23480n(this.f88641a) + HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: unh$d */
    public static abstract class EnumC13625d {

        /* JADX INFO: renamed from: a */
        public static final EnumC13625d f88642a;

        /* JADX INFO: renamed from: b */
        public static final EnumC13625d f88643b;

        /* JADX INFO: renamed from: c */
        public static final EnumC13625d f88644c;

        /* JADX INFO: renamed from: d */
        public static final EnumC13625d f88645d;

        /* JADX INFO: renamed from: e */
        public static final EnumC13625d f88646e;

        /* JADX INFO: renamed from: f */
        public static final /* synthetic */ EnumC13625d[] f88647f;

        /* JADX INFO: renamed from: unh$d$a */
        public enum a extends EnumC13625d {
            public a(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal, null);
            }

            @Override // p000.unh.EnumC13625d
            /* JADX INFO: renamed from: e */
            public Type mo23486e(Type type) {
                v7d.checkNotNull(type);
                if (!(type instanceof Class)) {
                    return type;
                }
                Class cls = (Class) type;
                return cls.isArray() ? new C13624c(cls.getComponentType()) : type;
            }

            @Override // p000.unh.EnumC13625d
            /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
            public GenericArrayType mo23483b(Type componentType) {
                return new C13624c(componentType);
            }
        }

        /* JADX INFO: renamed from: unh$d$b */
        public enum b extends EnumC13625d {
            public b(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal, null);
            }

            @Override // p000.unh.EnumC13625d
            /* JADX INFO: renamed from: b */
            public Type mo23483b(Type componentType) {
                return componentType instanceof Class ? unh.m23472f((Class) componentType) : new C13624c(componentType);
            }

            @Override // p000.unh.EnumC13625d
            /* JADX INFO: renamed from: e */
            public Type mo23486e(Type type) {
                return (Type) v7d.checkNotNull(type);
            }
        }

        /* JADX INFO: renamed from: unh$d$c */
        public enum c extends EnumC13625d {
            public c(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal, null);
            }

            @Override // p000.unh.EnumC13625d
            /* JADX INFO: renamed from: b */
            public Type mo23483b(Type componentType) {
                return EnumC13625d.f88643b.mo23483b(componentType);
            }

            @Override // p000.unh.EnumC13625d
            /* JADX INFO: renamed from: c */
            public String mo23484c(Type type) {
                try {
                    return (String) Type.class.getMethod("getTypeName", null).invoke(type, null);
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                } catch (NoSuchMethodException unused) {
                    throw new AssertionError("Type.getTypeName should be available in Java 8");
                } catch (InvocationTargetException e2) {
                    throw new RuntimeException(e2);
                }
            }

            @Override // p000.unh.EnumC13625d
            /* JADX INFO: renamed from: e */
            public Type mo23486e(Type type) {
                return EnumC13625d.f88643b.mo23486e(type);
            }
        }

        /* JADX INFO: renamed from: unh$d$d */
        public enum d extends EnumC13625d {
            public d(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal, null);
            }

            @Override // p000.unh.EnumC13625d
            /* JADX INFO: renamed from: a */
            public boolean mo23482a() {
                return false;
            }

            @Override // p000.unh.EnumC13625d
            /* JADX INFO: renamed from: b */
            public Type mo23483b(Type componentType) {
                return EnumC13625d.f88644c.mo23483b(componentType);
            }

            @Override // p000.unh.EnumC13625d
            /* JADX INFO: renamed from: c */
            public String mo23484c(Type type) {
                return EnumC13625d.f88644c.mo23484c(type);
            }

            @Override // p000.unh.EnumC13625d
            /* JADX INFO: renamed from: e */
            public Type mo23486e(Type type) {
                return EnumC13625d.f88644c.mo23486e(type);
            }
        }

        /* JADX INFO: renamed from: unh$d$e */
        public class e extends llh<Map.Entry<String, int[][]>> {
        }

        /* JADX INFO: renamed from: unh$d$f */
        public class f extends llh<int[]> {
        }

        private static /* synthetic */ EnumC13625d[] $values() {
            return new EnumC13625d[]{f88642a, f88643b, f88644c, f88645d};
        }

        static {
            a aVar = new a("JAVA6", 0);
            f88642a = aVar;
            b bVar = new b("JAVA7", 1);
            f88643b = bVar;
            c cVar = new c("JAVA8", 2);
            f88644c = cVar;
            d dVar = new d("JAVA9", 3);
            f88645d = dVar;
            f88647f = $values();
            if (AnnotatedElement.class.isAssignableFrom(TypeVariable.class)) {
                if (new e().m16227a().toString().contains("java.util.Map.java.util.Map")) {
                    f88646e = cVar;
                    return;
                } else {
                    f88646e = dVar;
                    return;
                }
            }
            if (new f().m16227a() instanceof Class) {
                f88646e = bVar;
            } else {
                f88646e = aVar;
            }
        }

        private EnumC13625d(String $enum$name, int $enum$ordinal) {
        }

        public static EnumC13625d valueOf(String name) {
            return (EnumC13625d) Enum.valueOf(EnumC13625d.class, name);
        }

        public static EnumC13625d[] values() {
            return (EnumC13625d[]) f88647f.clone();
        }

        /* JADX INFO: renamed from: a */
        public boolean mo23482a() {
            return true;
        }

        /* JADX INFO: renamed from: b */
        public abstract Type mo23483b(Type componentType);

        /* JADX INFO: renamed from: c */
        public String mo23484c(Type type) {
            return unh.m23480n(type);
        }

        /* JADX INFO: renamed from: d */
        public final kx7<Type> m23485d(Type[] types) {
            kx7.C8541a c8541aBuilder = kx7.builder();
            for (Type type : types) {
                c8541aBuilder.add(mo23486e(type));
            }
            return c8541aBuilder.build();
        }

        /* JADX INFO: renamed from: e */
        public abstract Type mo23486e(Type type);

        public /* synthetic */ EnumC13625d(String str, int i, C13622a c13622a) {
            this(str, i);
        }
    }

    /* JADX INFO: renamed from: unh$e */
    public static final class C13626e<X> {

        /* JADX INFO: renamed from: a */
        public static final boolean f88648a = !C13626e.class.getTypeParameters()[0].equals(unh.m23475i(C13626e.class, "X", new Type[0]));
    }

    /* JADX INFO: renamed from: unh$f */
    public static final class C13627f implements ParameterizedType, Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a */
        @wx1
        public final Type f88649a;

        /* JADX INFO: renamed from: b */
        public final kx7<Type> f88650b;

        /* JADX INFO: renamed from: c */
        public final Class<?> f88651c;

        public C13627f(@wx1 Type ownerType, Class<?> rawType, Type[] typeArguments) {
            v7d.checkNotNull(rawType);
            v7d.checkArgument(typeArguments.length == rawType.getTypeParameters().length);
            unh.disallowPrimitiveType(typeArguments, "type parameter");
            this.f88649a = ownerType;
            this.f88651c = rawType;
            this.f88650b = EnumC13625d.f88646e.m23485d(typeArguments);
        }

        public boolean equals(@wx1 Object other) {
            if (!(other instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) other;
            return getRawType().equals(parameterizedType.getRawType()) && okb.equal(getOwnerType(), parameterizedType.getOwnerType()) && Arrays.equals(getActualTypeArguments(), parameterizedType.getActualTypeArguments());
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type[] getActualTypeArguments() {
            return unh.toArray(this.f88650b);
        }

        @Override // java.lang.reflect.ParameterizedType
        @wx1
        public Type getOwnerType() {
            return this.f88649a;
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getRawType() {
            return this.f88651c;
        }

        public int hashCode() {
            Type type = this.f88649a;
            return ((type == null ? 0 : type.hashCode()) ^ this.f88650b.hashCode()) ^ this.f88651c.hashCode();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            if (this.f88649a != null) {
                EnumC13625d enumC13625d = EnumC13625d.f88646e;
                if (enumC13625d.mo23482a()) {
                    sb.append(enumC13625d.mo23484c(this.f88649a));
                    sb.append(a18.f100c);
                }
            }
            sb.append(this.f88651c.getName());
            sb.append('<');
            xj8 xj8Var = unh.f88635a;
            kx7<Type> kx7Var = this.f88650b;
            final EnumC13625d enumC13625d2 = EnumC13625d.f88646e;
            Objects.requireNonNull(enumC13625d2);
            sb.append(xj8Var.join(vg8.transform(kx7Var, new lz6() { // from class: vnh
                @Override // p000.lz6
                public final Object apply(Object obj) {
                    return enumC13625d2.mo23484c((Type) obj);
                }
            })));
            sb.append('>');
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: unh$g */
    public static final class C13628g<D extends GenericDeclaration> {

        /* JADX INFO: renamed from: a */
        public final D f88652a;

        /* JADX INFO: renamed from: b */
        public final String f88653b;

        /* JADX INFO: renamed from: c */
        public final kx7<Type> f88654c;

        public C13628g(D genericDeclaration, String name, Type[] bounds) {
            unh.disallowPrimitiveType(bounds, "bound for type variable");
            this.f88652a = (D) v7d.checkNotNull(genericDeclaration);
            this.f88653b = (String) v7d.checkNotNull(name);
            this.f88654c = kx7.copyOf(bounds);
        }

        public boolean equals(@wx1 Object obj) {
            if (!C13626e.f88648a) {
                if (!(obj instanceof TypeVariable)) {
                    return false;
                }
                TypeVariable typeVariable = (TypeVariable) obj;
                return this.f88653b.equals(typeVariable.getName()) && this.f88652a.equals(typeVariable.getGenericDeclaration());
            }
            if (obj == null || !Proxy.isProxyClass(obj.getClass()) || !(Proxy.getInvocationHandler(obj) instanceof C13629h)) {
                return false;
            }
            C13628g c13628g = ((C13629h) Proxy.getInvocationHandler(obj)).f88656a;
            return this.f88653b.equals(c13628g.getName()) && this.f88652a.equals(c13628g.getGenericDeclaration()) && this.f88654c.equals(c13628g.f88654c);
        }

        public Type[] getBounds() {
            return unh.toArray(this.f88654c);
        }

        public D getGenericDeclaration() {
            return this.f88652a;
        }

        public String getName() {
            return this.f88653b;
        }

        public String getTypeName() {
            return this.f88653b;
        }

        public int hashCode() {
            return this.f88652a.hashCode() ^ this.f88653b.hashCode();
        }

        public String toString() {
            return this.f88653b;
        }
    }

    /* JADX INFO: renamed from: unh$h */
    public static final class C13629h implements InvocationHandler {

        /* JADX INFO: renamed from: b */
        public static final ox7<String, Method> f88655b;

        /* JADX INFO: renamed from: a */
        public final C13628g<?> f88656a;

        static {
            ox7.C10705d c10705dBuilder = ox7.builder();
            for (Method method : C13628g.class.getMethods()) {
                if (method.getDeclaringClass().equals(C13628g.class)) {
                    try {
                        method.setAccessible(true);
                    } catch (AccessControlException unused) {
                    }
                    c10705dBuilder.put(method.getName(), method);
                }
            }
            f88655b = c10705dBuilder.buildKeepingLast();
        }

        public C13629h(C13628g<?> typeVariableImpl) {
            this.f88656a = typeVariableImpl;
        }

        @Override // java.lang.reflect.InvocationHandler
        @wx1
        public Object invoke(Object proxy, Method method, @wx1 Object[] args) throws Throwable {
            String name = method.getName();
            Method method2 = f88655b.get(name);
            if (method2 == null) {
                throw new UnsupportedOperationException(name);
            }
            try {
                return method2.invoke(this.f88656a, args);
            } catch (InvocationTargetException e) {
                throw e.getCause();
            }
        }
    }

    /* JADX INFO: renamed from: unh$i */
    public static final class C13630i implements WildcardType, Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a */
        public final kx7<Type> f88657a;

        /* JADX INFO: renamed from: b */
        public final kx7<Type> f88658b;

        public C13630i(Type[] lowerBounds, Type[] upperBounds) {
            unh.disallowPrimitiveType(lowerBounds, "lower bound for wildcard");
            unh.disallowPrimitiveType(upperBounds, "upper bound for wildcard");
            EnumC13625d enumC13625d = EnumC13625d.f88646e;
            this.f88657a = enumC13625d.m23485d(lowerBounds);
            this.f88658b = enumC13625d.m23485d(upperBounds);
        }

        public boolean equals(@wx1 Object obj) {
            if (!(obj instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) obj;
            return this.f88657a.equals(Arrays.asList(wildcardType.getLowerBounds())) && this.f88658b.equals(Arrays.asList(wildcardType.getUpperBounds()));
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getLowerBounds() {
            return unh.toArray(this.f88657a);
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getUpperBounds() {
            return unh.toArray(this.f88658b);
        }

        public int hashCode() {
            return this.f88657a.hashCode() ^ this.f88658b.hashCode();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("?");
            quh<Type> it = this.f88657a.iterator();
            while (it.hasNext()) {
                Type next = it.next();
                sb.append(" super ");
                sb.append(EnumC13625d.f88646e.mo23484c(next));
            }
            for (Type type : unh.filterUpperBounds(this.f88658b)) {
                sb.append(" extends ");
                sb.append(EnumC13625d.f88646e.mo23484c(type));
            }
            return sb.toString();
        }
    }

    private unh() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void disallowPrimitiveType(Type[] types, String usedAs) {
        for (Type type : types) {
            if (type instanceof Class) {
                v7d.checkArgument(!r2.isPrimitive(), "Primitive type '%s' used as %s", (Class) type, usedAs);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static Class<?> m23472f(Class<?> componentType) {
        return Array.newInstance(componentType, 0).getClass();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Iterable<Type> filterUpperBounds(Iterable<Type> bounds) {
        return vg8.filter(bounds, p8d.not(p8d.equalTo(Object.class)));
    }

    @wx1
    /* JADX INFO: renamed from: g */
    public static Type m23473g(Type type) {
        v7d.checkNotNull(type);
        AtomicReference atomicReference = new AtomicReference();
        new C13622a(atomicReference).visit(type);
        return (Type) atomicReference.get();
    }

    /* JADX INFO: renamed from: h */
    public static Type m23474h(Type componentType) {
        if (!(componentType instanceof WildcardType)) {
            return EnumC13625d.f88646e.mo23483b(componentType);
        }
        WildcardType wildcardType = (WildcardType) componentType;
        Type[] lowerBounds = wildcardType.getLowerBounds();
        v7d.checkArgument(lowerBounds.length <= 1, "Wildcard cannot have more than one lower bounds.");
        if (lowerBounds.length == 1) {
            return m23479m(m23474h(lowerBounds[0]));
        }
        Type[] upperBounds = wildcardType.getUpperBounds();
        v7d.checkArgument(upperBounds.length == 1, "Wildcard should have only one upper bound.");
        return m23478l(m23474h(upperBounds[0]));
    }

    /* JADX INFO: renamed from: i */
    public static <D extends GenericDeclaration> TypeVariable<D> m23475i(D declaration, String name, Type... bounds) {
        if (bounds.length == 0) {
            bounds = new Type[]{Object.class};
        }
        return newTypeVariableImpl(declaration, name, bounds);
    }

    /* JADX INFO: renamed from: j */
    public static ParameterizedType m23476j(Class<?> rawType, Type... arguments) {
        return new C13627f(EnumC13623b.f88639c.mo23481a(rawType), rawType, arguments);
    }

    /* JADX INFO: renamed from: k */
    public static ParameterizedType m23477k(@wx1 Type ownerType, Class<?> rawType, Type... arguments) {
        if (ownerType == null) {
            return m23476j(rawType, arguments);
        }
        v7d.checkNotNull(arguments);
        v7d.checkArgument(rawType.getEnclosingClass() != null, "Owner type for unenclosed %s", rawType);
        return new C13627f(ownerType, rawType, arguments);
    }

    @gdi
    /* JADX INFO: renamed from: l */
    public static WildcardType m23478l(Type upperBound) {
        return new C13630i(new Type[0], new Type[]{upperBound});
    }

    @gdi
    /* JADX INFO: renamed from: m */
    public static WildcardType m23479m(Type lowerBound) {
        return new C13630i(new Type[]{lowerBound}, new Type[]{Object.class});
    }

    /* JADX INFO: renamed from: n */
    public static String m23480n(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    private static <D extends GenericDeclaration> TypeVariable<D> newTypeVariableImpl(D genericDeclaration, String name, Type[] bounds) {
        return (TypeVariable) wvd.newProxy(TypeVariable.class, new C13629h(new C13628g(genericDeclaration, name, bounds)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @wx1
    public static Type subtypeOfComponentType(Type[] bounds) {
        for (Type type : bounds) {
            Type typeM23473g = m23473g(type);
            if (typeM23473g != null) {
                if (typeM23473g instanceof Class) {
                    Class cls = (Class) typeM23473g;
                    if (cls.isPrimitive()) {
                        return cls;
                    }
                }
                return m23478l(typeM23473g);
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Type[] toArray(Collection<Type> types) {
        return (Type[]) types.toArray(new Type[0]);
    }
}
