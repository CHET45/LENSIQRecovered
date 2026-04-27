package p000;

import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p000.dy7;
import p000.imh;
import p000.kx7;
import p000.ue8;
import p000.unh;

/* JADX INFO: loaded from: classes5.dex */
@px4
public abstract class nmh<T> extends llh<T> implements Serializable {
    private static final long serialVersionUID = 3637540370352322684L;

    /* JADX INFO: renamed from: a */
    public final Type f65035a;

    /* JADX INFO: renamed from: b */
    @wx1
    @ez8
    public transient imh f65036b;

    /* JADX INFO: renamed from: c */
    @wx1
    @ez8
    public transient imh f65037c;

    /* JADX INFO: renamed from: nmh$a */
    public class C9944a extends ue8.C13514b<T> {
        public C9944a(Method method) {
            super(method);
        }

        @Override // p000.ue8.C13514b, p000.ue8
        /* JADX INFO: renamed from: b */
        public Type[] mo18023b() {
            return nmh.this.getCovariantTypeResolver().m13198f(super.mo18023b());
        }

        @Override // p000.ue8.C13514b, p000.ue8
        /* JADX INFO: renamed from: c */
        public Type[] mo18024c() {
            return nmh.this.getInvariantTypeResolver().m13198f(super.mo18024c());
        }

        @Override // p000.ue8.C13514b, p000.ue8
        /* JADX INFO: renamed from: d */
        public Type mo18025d() {
            return nmh.this.getCovariantTypeResolver().resolveType(super.mo18025d());
        }

        @Override // p000.ue8
        public nmh<T> getOwnerType() {
            return nmh.this;
        }

        @Override // p000.ue8
        public String toString() {
            return getOwnerType() + "." + super.toString();
        }
    }

    /* JADX INFO: renamed from: nmh$b */
    public class C9945b extends ue8.C13513a<T> {
        public C9945b(Constructor constructor) {
            super(constructor);
        }

        @Override // p000.ue8.C13513a, p000.ue8
        /* JADX INFO: renamed from: b */
        public Type[] mo18023b() {
            return nmh.this.getCovariantTypeResolver().m13198f(super.mo18023b());
        }

        @Override // p000.ue8.C13513a, p000.ue8
        /* JADX INFO: renamed from: c */
        public Type[] mo18024c() {
            return nmh.this.getInvariantTypeResolver().m13198f(super.mo18024c());
        }

        @Override // p000.ue8.C13513a, p000.ue8
        /* JADX INFO: renamed from: d */
        public Type mo18025d() {
            return nmh.this.getCovariantTypeResolver().resolveType(super.mo18025d());
        }

        @Override // p000.ue8
        public nmh<T> getOwnerType() {
            return nmh.this;
        }

        @Override // p000.ue8
        public String toString() {
            return getOwnerType() + c0b.f15433c + xj8.m25235on(", ").join(mo18024c()) + c0b.f15434d;
        }
    }

    /* JADX INFO: renamed from: nmh$c */
    public class C9946c extends smh {
        public C9946c() {
        }

        @Override // p000.smh
        /* JADX INFO: renamed from: b */
        public void mo13201b(GenericArrayType type) {
            visit(type.getGenericComponentType());
        }

        @Override // p000.smh
        /* JADX INFO: renamed from: c */
        public void mo13202c(ParameterizedType type) {
            visit(type.getActualTypeArguments());
            visit(type.getOwnerType());
        }

        @Override // p000.smh
        /* JADX INFO: renamed from: d */
        public void mo13203d(TypeVariable<?> type) {
            throw new IllegalArgumentException(nmh.this.f65035a + "contains a type variable and is not safe for the operation");
        }

        @Override // p000.smh
        /* JADX INFO: renamed from: e */
        public void mo13204e(WildcardType type) {
            visit(type.getLowerBounds());
            visit(type.getUpperBounds());
        }
    }

    /* JADX INFO: renamed from: nmh$d */
    public class C9947d extends smh {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ dy7.C5007a f65041b;

        public C9947d(final nmh this$0, final dy7.C5007a val$builder) {
            this.f65041b = val$builder;
        }

        @Override // p000.smh
        /* JADX INFO: renamed from: a */
        public void mo13200a(Class<?> t) {
            this.f65041b.add(t);
        }

        @Override // p000.smh
        /* JADX INFO: renamed from: b */
        public void mo13201b(GenericArrayType t) {
            this.f65041b.add(unh.m23472f(nmh.m18019of(t.getGenericComponentType()).getRawType()));
        }

        @Override // p000.smh
        /* JADX INFO: renamed from: c */
        public void mo13202c(ParameterizedType t) {
            this.f65041b.add((Class) t.getRawType());
        }

        @Override // p000.smh
        /* JADX INFO: renamed from: d */
        public void mo13203d(TypeVariable<?> t) {
            visit(t.getBounds());
        }

        @Override // p000.smh
        /* JADX INFO: renamed from: e */
        public void mo13204e(WildcardType t) {
            visit(t.getUpperBounds());
        }
    }

    /* JADX INFO: renamed from: nmh$e */
    public static class C9948e {

        /* JADX INFO: renamed from: a */
        public final Type[] f65042a;

        /* JADX INFO: renamed from: b */
        public final boolean f65043b;

        public C9948e(Type[] bounds, boolean target) {
            this.f65042a = bounds;
            this.f65043b = target;
        }

        /* JADX INFO: renamed from: a */
        public boolean m18026a(Type supertype) {
            for (Type type : this.f65042a) {
                boolean zIsSubtypeOf = nmh.m18019of(type).isSubtypeOf(supertype);
                boolean z = this.f65043b;
                if (zIsSubtypeOf == z) {
                    return z;
                }
            }
            return !this.f65043b;
        }

        /* JADX INFO: renamed from: b */
        public boolean m18027b(Type subtype) {
            nmh<?> nmhVarM18019of = nmh.m18019of(subtype);
            for (Type type : this.f65042a) {
                boolean zIsSubtypeOf = nmhVarM18019of.isSubtypeOf(type);
                boolean z = this.f65043b;
                if (zIsSubtypeOf == z) {
                    return z;
                }
            }
            return !this.f65043b;
        }
    }

    /* JADX INFO: renamed from: nmh$f */
    public final class C9949f extends nmh<T>.C9954k {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: c */
        @wx1
        public transient dy7<nmh<? super T>> f65044c;

        private C9949f() {
            super();
        }

        private Object readResolve() {
            return nmh.this.getTypes().classes();
        }

        @Override // p000.nmh.C9954k
        public nmh<T>.C9954k classes() {
            return this;
        }

        @Override // p000.nmh.C9954k
        public nmh<T>.C9954k interfaces() {
            throw new UnsupportedOperationException("classes().interfaces() not supported.");
        }

        @Override // p000.nmh.C9954k, p000.jt6, p000.lr6, p000.zs6
        /* JADX INFO: renamed from: m */
        public Set<nmh<? super T>> mo8967m() {
            dy7<nmh<? super T>> dy7Var = this.f65044c;
            if (dy7Var != null) {
                return dy7Var;
            }
            dy7<nmh<? super T>> set = em6.from(AbstractC9952i.f65049a.m18028a().m18030c(nmh.this)).filter(EnumC9953j.f65054a).toSet();
            this.f65044c = set;
            return set;
        }

        @Override // p000.nmh.C9954k
        public Set<Class<? super T>> rawTypes() {
            return dy7.copyOf((Collection) AbstractC9952i.f65050b.m18028a().mo18029b(nmh.this.getRawTypes()));
        }

        public /* synthetic */ C9949f(nmh nmhVar, C9944a c9944a) {
            this();
        }
    }

    /* JADX INFO: renamed from: nmh$g */
    public final class C9950g extends nmh<T>.C9954k {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: c */
        public final transient nmh<T>.C9954k f65046c;

        /* JADX INFO: renamed from: d */
        @wx1
        public transient dy7<nmh<? super T>> f65047d;

        public C9950g(nmh<T>.C9954k allTypes) {
            super();
            this.f65046c = allTypes;
        }

        private Object readResolve() {
            return nmh.this.getTypes().interfaces();
        }

        @Override // p000.nmh.C9954k
        public nmh<T>.C9954k classes() {
            throw new UnsupportedOperationException("interfaces().classes() not supported.");
        }

        @Override // p000.nmh.C9954k
        public nmh<T>.C9954k interfaces() {
            return this;
        }

        @Override // p000.nmh.C9954k, p000.jt6, p000.lr6, p000.zs6
        /* JADX INFO: renamed from: m */
        public Set<nmh<? super T>> mo8967m() {
            dy7<nmh<? super T>> dy7Var = this.f65047d;
            if (dy7Var != null) {
                return dy7Var;
            }
            dy7<nmh<? super T>> set = em6.from(this.f65046c).filter(EnumC9953j.f65055b).toSet();
            this.f65047d = set;
            return set;
        }

        @Override // p000.nmh.C9954k
        public Set<Class<? super T>> rawTypes() {
            return em6.from(AbstractC9952i.f65050b.mo18029b(nmh.this.getRawTypes())).filter(new l8d() { // from class: omh
                @Override // p000.l8d
                public final boolean apply(Object obj) {
                    return ((Class) obj).isInterface();
                }
            }).toSet();
        }
    }

    /* JADX INFO: renamed from: nmh$h */
    public static final class C9951h<T> extends nmh<T> {
        private static final long serialVersionUID = 0;

        public C9951h(Type type) {
            super(type, null);
        }
    }

    /* JADX INFO: renamed from: nmh$i */
    public static abstract class AbstractC9952i<K> {

        /* JADX INFO: renamed from: a */
        public static final AbstractC9952i<nmh<?>> f65049a = new a();

        /* JADX INFO: renamed from: b */
        public static final AbstractC9952i<Class<?>> f65050b = new b();

        /* JADX INFO: renamed from: nmh$i$a */
        public class a extends AbstractC9952i<nmh<?>> {
            public a() {
                super(null);
            }

            @Override // p000.nmh.AbstractC9952i
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public Iterable<? extends nmh<?>> mo18031d(nmh<?> type) {
                return type.m18020f();
            }

            @Override // p000.nmh.AbstractC9952i
            /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
            public Class<?> mo18032e(nmh<?> type) {
                return type.getRawType();
            }

            @Override // p000.nmh.AbstractC9952i
            @wx1
            /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
            public nmh<?> mo18033f(nmh<?> type) {
                return type.m18021g();
            }
        }

        /* JADX INFO: renamed from: nmh$i$b */
        public class b extends AbstractC9952i<Class<?>> {
            public b() {
                super(null);
            }

            @Override // p000.nmh.AbstractC9952i
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public Iterable<? extends Class<?>> mo18031d(Class<?> type) {
                return Arrays.asList(type.getInterfaces());
            }

            @Override // p000.nmh.AbstractC9952i
            /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
            public Class<?> mo18032e(Class<?> type) {
                return type;
            }

            @Override // p000.nmh.AbstractC9952i
            @wx1
            /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
            public Class<?> mo18033f(Class<?> type) {
                return type.getSuperclass();
            }
        }

        /* JADX INFO: renamed from: nmh$i$c */
        public class c extends e<K> {
            public c(final AbstractC9952i this$0, AbstractC9952i delegate) {
                super(delegate);
            }

            @Override // p000.nmh.AbstractC9952i
            /* JADX INFO: renamed from: b */
            public kx7<K> mo18029b(Iterable<? extends K> types) {
                kx7.C8541a c8541aBuilder = kx7.builder();
                for (K k : types) {
                    if (!mo18032e(k).isInterface()) {
                        c8541aBuilder.add(k);
                    }
                }
                return super.mo18029b(c8541aBuilder.build());
            }

            @Override // p000.nmh.AbstractC9952i.e, p000.nmh.AbstractC9952i
            /* JADX INFO: renamed from: d */
            public Iterable<? extends K> mo18031d(K type) {
                return dy7.m9575of();
            }
        }

        /* JADX INFO: renamed from: nmh$i$d */
        public class d extends s7c<K> {

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ Comparator f65051c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ Map f65052d;

            public d(final Comparator val$valueComparator, final Map val$map) {
                this.f65051c = val$valueComparator;
                this.f65052d = val$map;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // p000.s7c, java.util.Comparator
            public int compare(K left, K right) {
                Comparator comparator = this.f65051c;
                Object obj = this.f65052d.get(left);
                Objects.requireNonNull(obj);
                Object obj2 = this.f65052d.get(right);
                Objects.requireNonNull(obj2);
                return comparator.compare(obj, obj2);
            }
        }

        /* JADX INFO: renamed from: nmh$i$e */
        public static class e<K> extends AbstractC9952i<K> {

            /* JADX INFO: renamed from: c */
            public final AbstractC9952i<K> f65053c;

            public e(AbstractC9952i<K> delegate) {
                super(null);
                this.f65053c = delegate;
            }

            @Override // p000.nmh.AbstractC9952i
            /* JADX INFO: renamed from: d */
            public Iterable<? extends K> mo18031d(K type) {
                return this.f65053c.mo18031d(type);
            }

            @Override // p000.nmh.AbstractC9952i
            /* JADX INFO: renamed from: e */
            public Class<?> mo18032e(K type) {
                return this.f65053c.mo18032e(type);
            }

            @Override // p000.nmh.AbstractC9952i
            @wx1
            /* JADX INFO: renamed from: f */
            public K mo18033f(K type) {
                return this.f65053c.mo18033f(type);
            }
        }

        private AbstractC9952i() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @op1
        private int collectTypes(K k, Map<? super K, Integer> map) {
            Integer num = map.get(k);
            if (num != null) {
                return num.intValue();
            }
            boolean zIsInterface = mo18032e(k).isInterface();
            Iterator<? extends K> it = mo18031d(k).iterator();
            int iMax = zIsInterface;
            while (it.hasNext()) {
                iMax = Math.max(iMax, collectTypes(it.next(), map));
            }
            K kMo18033f = mo18033f(k);
            int iMax2 = iMax;
            if (kMo18033f != null) {
                iMax2 = Math.max(iMax, collectTypes(kMo18033f, map));
            }
            int i = iMax2 + 1;
            map.put(k, Integer.valueOf(i));
            return i;
        }

        private static <K, V> kx7<K> sortKeysByValue(Map<K, V> map, Comparator<? super V> comparator) {
            return (kx7<K>) new d(comparator, map).immutableSortedCopy(map.keySet());
        }

        /* JADX INFO: renamed from: a */
        public final AbstractC9952i<K> m18028a() {
            return new c(this, this);
        }

        /* JADX INFO: renamed from: b */
        public kx7<K> mo18029b(Iterable<? extends K> types) {
            HashMap mapNewHashMap = tt9.newHashMap();
            Iterator<? extends K> it = types.iterator();
            while (it.hasNext()) {
                collectTypes(it.next(), mapNewHashMap);
            }
            return sortKeysByValue(mapNewHashMap, s7c.natural().reverse());
        }

        /* JADX INFO: renamed from: c */
        public final kx7<K> m18030c(K type) {
            return mo18029b(kx7.m15111of(type));
        }

        /* JADX INFO: renamed from: d */
        public abstract Iterable<? extends K> mo18031d(K type);

        /* JADX INFO: renamed from: e */
        public abstract Class<?> mo18032e(K type);

        @wx1
        /* JADX INFO: renamed from: f */
        public abstract K mo18033f(K type);

        public /* synthetic */ AbstractC9952i(C9944a c9944a) {
            this();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: nmh$j */
    public static abstract class EnumC9953j implements l8d<nmh<?>> {

        /* JADX INFO: renamed from: a */
        public static final EnumC9953j f65054a = new a("IGNORE_TYPE_VARIABLE_OR_WILDCARD", 0);

        /* JADX INFO: renamed from: b */
        public static final EnumC9953j f65055b = new b("INTERFACE_ONLY", 1);

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ EnumC9953j[] f65056c = $values();

        /* JADX INFO: renamed from: nmh$j$a */
        public enum a extends EnumC9953j {
            public a(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal, null);
            }

            @Override // p000.l8d
            public boolean apply(nmh<?> type) {
                return ((type.f65035a instanceof TypeVariable) || (type.f65035a instanceof WildcardType)) ? false : true;
            }
        }

        /* JADX INFO: renamed from: nmh$j$b */
        public enum b extends EnumC9953j {
            public b(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal, null);
            }

            @Override // p000.l8d
            public boolean apply(nmh<?> type) {
                return type.getRawType().isInterface();
            }
        }

        private static /* synthetic */ EnumC9953j[] $values() {
            return new EnumC9953j[]{f65054a, f65055b};
        }

        private EnumC9953j(String $enum$name, int $enum$ordinal) {
        }

        public static EnumC9953j valueOf(String name) {
            return (EnumC9953j) Enum.valueOf(EnumC9953j.class, name);
        }

        public static EnumC9953j[] values() {
            return (EnumC9953j[]) f65056c.clone();
        }

        public /* synthetic */ EnumC9953j(String str, int i, C9944a c9944a) {
            this(str, i);
        }
    }

    /* JADX INFO: renamed from: nmh$k */
    public class C9954k extends jt6<nmh<? super T>> implements Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a */
        @wx1
        public transient dy7<nmh<? super T>> f65057a;

        public C9954k() {
        }

        public nmh<T>.C9954k classes() {
            return new C9949f(nmh.this, null);
        }

        public nmh<T>.C9954k interfaces() {
            return new C9950g(this);
        }

        @Override // p000.jt6, p000.lr6, p000.zs6
        /* JADX INFO: renamed from: m */
        public Set<nmh<? super T>> mo8967m() {
            dy7<nmh<? super T>> dy7Var = this.f65057a;
            if (dy7Var != null) {
                return dy7Var;
            }
            dy7<nmh<? super T>> set = em6.from(AbstractC9952i.f65049a.m18030c(nmh.this)).filter(EnumC9953j.f65054a).toSet();
            this.f65057a = set;
            return set;
        }

        public Set<Class<? super T>> rawTypes() {
            return dy7.copyOf((Collection) AbstractC9952i.f65050b.mo18029b(nmh.this.getRawTypes()));
        }
    }

    public /* synthetic */ nmh(Type type, C9944a c9944a) {
        this(type);
    }

    private static C9948e any(Type[] bounds) {
        return new C9948e(bounds, true);
    }

    @wx1
    private nmh<? super T> boundAsSuperclass(Type type) {
        nmh<? super T> nmhVar = (nmh<? super T>) m18019of(type);
        if (nmhVar.getRawType().isInterface()) {
            return null;
        }
        return nmhVar;
    }

    private kx7<nmh<? super T>> boundsAsInterfaces(Type[] bounds) {
        kx7.C8541a c8541aBuilder = kx7.builder();
        for (Type type : bounds) {
            nmh<?> nmhVarM18019of = m18019of(type);
            if (nmhVarM18019of.getRawType().isInterface()) {
                c8541aBuilder.add(nmhVarM18019of);
            }
        }
        return c8541aBuilder.build();
    }

    private static Type canonicalizeTypeArg(TypeVariable<?> declaration, Type typeArg) {
        return typeArg instanceof WildcardType ? canonicalizeWildcardType(declaration, (WildcardType) typeArg) : canonicalizeWildcardsInType(typeArg);
    }

    private static WildcardType canonicalizeWildcardType(TypeVariable<?> declaration, WildcardType type) {
        Type[] bounds = declaration.getBounds();
        ArrayList arrayList = new ArrayList();
        for (Type type2 : type.getUpperBounds()) {
            if (!any(bounds).m18026a(type2)) {
                arrayList.add(canonicalizeWildcardsInType(type2));
            }
        }
        return new unh.C13630i(type.getLowerBounds(), (Type[]) arrayList.toArray(new Type[0]));
    }

    private static ParameterizedType canonicalizeWildcardsInParameterizedType(ParameterizedType type) {
        Class cls = (Class) type.getRawType();
        TypeVariable<Class<T>>[] typeParameters = cls.getTypeParameters();
        Type[] actualTypeArguments = type.getActualTypeArguments();
        for (int i = 0; i < actualTypeArguments.length; i++) {
            actualTypeArguments[i] = canonicalizeTypeArg(typeParameters[i], actualTypeArguments[i]);
        }
        return unh.m23477k(type.getOwnerType(), cls, actualTypeArguments);
    }

    private static Type canonicalizeWildcardsInType(Type type) {
        return type instanceof ParameterizedType ? canonicalizeWildcardsInParameterizedType((ParameterizedType) type) : type instanceof GenericArrayType ? unh.m23474h(canonicalizeWildcardsInType(((GenericArrayType) type).getGenericComponentType())) : type;
    }

    private static C9948e every(Type[] bounds) {
        return new C9948e(bounds, false);
    }

    private nmh<? extends T> getArraySubtype(Class<?> cls) {
        Class<?> componentType = cls.getComponentType();
        if (componentType != null) {
            nmh<?> componentType2 = getComponentType();
            Objects.requireNonNull(componentType2);
            return (nmh<? extends T>) m18019of(newArrayClassOrGenericArrayType(componentType2.getSubtype(componentType).f65035a));
        }
        throw new IllegalArgumentException(cls + " does not appear to be a subtype of " + this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private nmh<? super T> getArraySupertype(Class<? super T> cls) {
        nmh<?> componentType = getComponentType();
        if (componentType != 0) {
            Class<?> componentType2 = cls.getComponentType();
            Objects.requireNonNull(componentType2);
            return (nmh<? super T>) m18019of(newArrayClassOrGenericArrayType(componentType.getSupertype(componentType2).f65035a));
        }
        throw new IllegalArgumentException(cls + " isn't a super type of " + this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public imh getCovariantTypeResolver() {
        imh imhVar = this.f65037c;
        if (imhVar != null) {
            return imhVar;
        }
        imh imhVarM13196d = imh.m13196d(this.f65035a);
        this.f65037c = imhVarM13196d;
        return imhVarM13196d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public imh getInvariantTypeResolver() {
        imh imhVar = this.f65036b;
        if (imhVar != null) {
            return imhVar;
        }
        imh imhVarM13197e = imh.m13197e(this.f65035a);
        this.f65036b = imhVarM13197e;
        return imhVarM13197e;
    }

    @wx1
    private Type getOwnerTypeIfPresent() {
        Type type = this.f65035a;
        if (type instanceof ParameterizedType) {
            return ((ParameterizedType) type).getOwnerType();
        }
        if (type instanceof Class) {
            return ((Class) type).getEnclosingClass();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public dy7<Class<? super T>> getRawTypes() {
        dy7.C5007a c5007aBuilder = dy7.builder();
        new C9947d(this, c5007aBuilder).visit(this.f65035a);
        return c5007aBuilder.build();
    }

    private nmh<? extends T> getSubtypeFromLowerBounds(Class<?> cls, Type[] typeArr) {
        if (typeArr.length > 0) {
            return (nmh<? extends T>) m18019of(typeArr[0]).getSubtype(cls);
        }
        throw new IllegalArgumentException(cls + " isn't a subclass of " + this);
    }

    private nmh<? super T> getSupertypeFromUpperBounds(Class<? super T> cls, Type[] typeArr) {
        for (Type type : typeArr) {
            nmh<?> nmhVarM18019of = m18019of(type);
            if (nmhVarM18019of.isSubtypeOf(cls)) {
                return (nmh<? super T>) nmhVarM18019of.getSupertype(cls);
            }
        }
        throw new IllegalArgumentException(cls + " isn't a super type of " + this);
    }

    @gdi
    /* JADX INFO: renamed from: i */
    public static <T> nmh<? extends T> m18016i(Class<T> cls) {
        if (cls.isArray()) {
            return (nmh<? extends T>) m18019of(unh.m23474h(m18016i(cls.getComponentType()).f65035a));
        }
        TypeVariable<Class<T>>[] typeParameters = cls.getTypeParameters();
        Type type = (!cls.isMemberClass() || Modifier.isStatic(cls.getModifiers())) ? null : m18016i(cls.getEnclosingClass()).f65035a;
        return (typeParameters.length > 0 || !(type == null || type == cls.getEnclosingClass())) ? (nmh<? extends T>) m18019of(unh.m23477k(type, cls, typeParameters)) : m18018of((Class) cls);
    }

    /* JADX INFO: renamed from: is */
    private boolean m18017is(Type formalType, TypeVariable<?> declaration) {
        if (this.f65035a.equals(formalType)) {
            return true;
        }
        if (!(formalType instanceof WildcardType)) {
            return canonicalizeWildcardsInType(this.f65035a).equals(canonicalizeWildcardsInType(formalType));
        }
        WildcardType wildcardTypeCanonicalizeWildcardType = canonicalizeWildcardType(declaration, (WildcardType) formalType);
        return every(wildcardTypeCanonicalizeWildcardType.getUpperBounds()).m18027b(this.f65035a) && every(wildcardTypeCanonicalizeWildcardType.getLowerBounds()).m18026a(this.f65035a);
    }

    private boolean isOwnedBySubtypeOf(Type supertype) {
        Iterator<nmh<? super T>> it = getTypes().iterator();
        while (it.hasNext()) {
            Type ownerTypeIfPresent = it.next().getOwnerTypeIfPresent();
            if (ownerTypeIfPresent != null && m18019of(ownerTypeIfPresent).isSubtypeOf(supertype)) {
                return true;
            }
        }
        return false;
    }

    private boolean isSubtypeOfArrayType(GenericArrayType supertype) {
        Type type = this.f65035a;
        if (!(type instanceof Class)) {
            if (type instanceof GenericArrayType) {
                return m18019of(((GenericArrayType) type).getGenericComponentType()).isSubtypeOf(supertype.getGenericComponentType());
            }
            return false;
        }
        Class cls = (Class) type;
        if (cls.isArray()) {
            return m18018of((Class) cls.getComponentType()).isSubtypeOf(supertype.getGenericComponentType());
        }
        return false;
    }

    private boolean isSubtypeOfParameterizedType(ParameterizedType supertype) {
        Class<? super Object> rawType = m18019of(supertype).getRawType();
        if (!someRawTypeIsSubclassOf(rawType)) {
            return false;
        }
        TypeVariable<Class<? super Object>>[] typeParameters = rawType.getTypeParameters();
        Type[] actualTypeArguments = supertype.getActualTypeArguments();
        for (int i = 0; i < typeParameters.length; i++) {
            if (!m18019of(getCovariantTypeResolver().resolveType(typeParameters[i])).m18017is(actualTypeArguments[i], typeParameters[i])) {
                return false;
            }
        }
        return Modifier.isStatic(((Class) supertype.getRawType()).getModifiers()) || supertype.getOwnerType() == null || isOwnedBySubtypeOf(supertype.getOwnerType());
    }

    private boolean isSupertypeOfArray(GenericArrayType subtype) {
        Type type = this.f65035a;
        if (type instanceof Class) {
            Class cls = (Class) type;
            return !cls.isArray() ? cls.isAssignableFrom(Object[].class) : m18019of(subtype.getGenericComponentType()).isSubtypeOf(cls.getComponentType());
        }
        if (type instanceof GenericArrayType) {
            return m18019of(subtype.getGenericComponentType()).isSubtypeOf(((GenericArrayType) this.f65035a).getGenericComponentType());
        }
        return false;
    }

    private boolean isWrapper() {
        return tbd.allWrapperTypes().contains(this.f65035a);
    }

    private static Type newArrayClassOrGenericArrayType(Type componentType) {
        return unh.EnumC13625d.f88643b.mo23483b(componentType);
    }

    /* JADX INFO: renamed from: of */
    public static <T> nmh<T> m18018of(Class<T> type) {
        return new C9951h(type);
    }

    private nmh<?> resolveSupertype(Type type) {
        nmh<?> nmhVarM18019of = m18019of(getCovariantTypeResolver().resolveType(type));
        nmhVarM18019of.f65037c = this.f65037c;
        nmhVarM18019of.f65036b = this.f65036b;
        return nmhVarM18019of;
    }

    private Type resolveTypeArgsForSubclass(Class<?> subclass) {
        if ((this.f65035a instanceof Class) && (subclass.getTypeParameters().length == 0 || getRawType().getTypeParameters().length != 0)) {
            return subclass;
        }
        nmh nmhVarM18016i = m18016i(subclass);
        return new imh().where(nmhVarM18016i.getSupertype(getRawType()).f65035a, this.f65035a).resolveType(nmhVarM18016i.f65035a);
    }

    private boolean someRawTypeIsSubclassOf(Class<?> superclass) {
        quh<Class<? super T>> it = getRawTypes().iterator();
        while (it.hasNext()) {
            if (superclass.isAssignableFrom(it.next())) {
                return true;
            }
        }
        return false;
    }

    public final ue8<T, T> constructor(Constructor<?> constructor) {
        v7d.checkArgument(constructor.getDeclaringClass() == getRawType(), "%s not declared by %s", constructor, getRawType());
        return new C9945b(constructor);
    }

    public boolean equals(@wx1 Object o) {
        if (o instanceof nmh) {
            return this.f65035a.equals(((nmh) o).f65035a);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final kx7<nmh<? super T>> m18020f() {
        Type type = this.f65035a;
        if (type instanceof TypeVariable) {
            return boundsAsInterfaces(((TypeVariable) type).getBounds());
        }
        if (type instanceof WildcardType) {
            return boundsAsInterfaces(((WildcardType) type).getUpperBounds());
        }
        kx7.C8541a c8541aBuilder = kx7.builder();
        for (Type type2 : getRawType().getGenericInterfaces()) {
            c8541aBuilder.add(resolveSupertype(type2));
        }
        return c8541aBuilder.build();
    }

    @wx1
    /* JADX INFO: renamed from: g */
    public final nmh<? super T> m18021g() {
        Type type = this.f65035a;
        if (type instanceof TypeVariable) {
            return boundAsSuperclass(((TypeVariable) type).getBounds()[0]);
        }
        if (type instanceof WildcardType) {
            return boundAsSuperclass(((WildcardType) type).getUpperBounds()[0]);
        }
        Type genericSuperclass = getRawType().getGenericSuperclass();
        if (genericSuperclass == null) {
            return null;
        }
        return (nmh<? super T>) resolveSupertype(genericSuperclass);
    }

    @wx1
    public final nmh<?> getComponentType() {
        Type typeM23473g = unh.m23473g(this.f65035a);
        if (typeM23473g == null) {
            return null;
        }
        return m18019of(typeM23473g);
    }

    public final Class<? super T> getRawType() {
        return getRawTypes().iterator().next();
    }

    public final nmh<? extends T> getSubtype(Class<?> cls) {
        v7d.checkArgument(!(this.f65035a instanceof TypeVariable), "Cannot get subtype of type variable <%s>", this);
        Type type = this.f65035a;
        if (type instanceof WildcardType) {
            return getSubtypeFromLowerBounds(cls, ((WildcardType) type).getLowerBounds());
        }
        if (isArray()) {
            return getArraySubtype(cls);
        }
        v7d.checkArgument(getRawType().isAssignableFrom(cls), "%s isn't a subclass of %s", cls, this);
        nmh<? extends T> nmhVar = (nmh<? extends T>) m18019of(resolveTypeArgsForSubclass(cls));
        v7d.checkArgument(nmhVar.isSubtypeOf((nmh<?>) this), "%s does not appear to be a subtype of %s", nmhVar, this);
        return nmhVar;
    }

    public final nmh<? super T> getSupertype(Class<? super T> cls) {
        v7d.checkArgument(someRawTypeIsSubclassOf(cls), "%s is not a super class of %s", cls, this);
        Type type = this.f65035a;
        return type instanceof TypeVariable ? getSupertypeFromUpperBounds(cls, ((TypeVariable) type).getBounds()) : type instanceof WildcardType ? getSupertypeFromUpperBounds(cls, ((WildcardType) type).getUpperBounds()) : cls.isArray() ? getArraySupertype(cls) : (nmh<? super T>) resolveSupertype(m18016i(cls).f65035a);
    }

    public final Type getType() {
        return this.f65035a;
    }

    public final nmh<T>.C9954k getTypes() {
        return new C9954k();
    }

    @op1
    /* JADX INFO: renamed from: h */
    public final nmh<T> m18022h() {
        new C9946c().visit(this.f65035a);
        return this;
    }

    public int hashCode() {
        return this.f65035a.hashCode();
    }

    public final boolean isArray() {
        return getComponentType() != null;
    }

    public final boolean isPrimitive() {
        Type type = this.f65035a;
        return (type instanceof Class) && ((Class) type).isPrimitive();
    }

    public final boolean isSubtypeOf(nmh<?> type) {
        return isSubtypeOf(type.getType());
    }

    public final boolean isSupertypeOf(nmh<?> type) {
        return type.isSubtypeOf(getType());
    }

    public final ue8<T, Object> method(Method method) {
        v7d.checkArgument(someRawTypeIsSubclassOf(method.getDeclaringClass()), "%s not declared by %s", method, this);
        return new C9944a(method);
    }

    public final nmh<?> resolveType(Type type) {
        v7d.checkNotNull(type);
        return m18019of(getInvariantTypeResolver().resolveType(type));
    }

    public String toString() {
        return unh.m23480n(this.f65035a);
    }

    public final nmh<T> unwrap() {
        return isWrapper() ? m18018of(tbd.unwrap((Class) this.f65035a)) : this;
    }

    public final <X> nmh<T> where(vlh<X> typeParam, nmh<X> typeArg) {
        return new C9951h(new imh().m13199g(ox7.m19077of(new imh.C7511d(typeParam.f91628a), typeArg.f65035a)).resolveType(this.f65035a));
    }

    public final nmh<T> wrap() {
        return isPrimitive() ? m18018of(tbd.wrap((Class) this.f65035a)) : this;
    }

    public Object writeReplace() {
        return m18019of(new imh().resolveType(this.f65035a));
    }

    public nmh() {
        Type typeM16227a = m16227a();
        this.f65035a = typeM16227a;
        v7d.checkState(!(typeM16227a instanceof TypeVariable), "Cannot construct a TypeToken for a type variable.\nYou probably meant to call new TypeToken<%s>(getClass()) that can resolve the type variable for you.\nIf you do need to create a TypeToken of a type variable, please use TypeToken.of() instead.", typeM16227a);
    }

    /* JADX INFO: renamed from: of */
    public static nmh<?> m18019of(Type type) {
        return new C9951h(type);
    }

    public final boolean isSubtypeOf(Type supertype) {
        v7d.checkNotNull(supertype);
        if (supertype instanceof WildcardType) {
            return any(((WildcardType) supertype).getLowerBounds()).m18027b(this.f65035a);
        }
        Type type = this.f65035a;
        if (type instanceof WildcardType) {
            return any(((WildcardType) type).getUpperBounds()).m18026a(supertype);
        }
        if (type instanceof TypeVariable) {
            return type.equals(supertype) || any(((TypeVariable) this.f65035a).getBounds()).m18026a(supertype);
        }
        if (type instanceof GenericArrayType) {
            return m18019of(supertype).isSupertypeOfArray((GenericArrayType) this.f65035a);
        }
        if (supertype instanceof Class) {
            return someRawTypeIsSubclassOf((Class) supertype);
        }
        if (supertype instanceof ParameterizedType) {
            return isSubtypeOfParameterizedType((ParameterizedType) supertype);
        }
        if (supertype instanceof GenericArrayType) {
            return isSubtypeOfArrayType((GenericArrayType) supertype);
        }
        return false;
    }

    public final boolean isSupertypeOf(Type type) {
        return m18019of(type).isSubtypeOf(getType());
    }

    public nmh(Class<?> declaringClass) {
        Type typeM16227a = super.m16227a();
        if (typeM16227a instanceof Class) {
            this.f65035a = typeM16227a;
        } else {
            this.f65035a = imh.m13196d(declaringClass).resolveType(typeM16227a);
        }
    }

    public final <X> nmh<T> where(vlh<X> typeParam, Class<X> typeArg) {
        return where(typeParam, m18018of((Class) typeArg));
    }

    private nmh(Type type) {
        this.f65035a = (Type) v7d.checkNotNull(type);
    }
}
