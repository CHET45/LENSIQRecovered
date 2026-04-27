package p000;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import p000.ox7;
import p000.unh;

/* JADX INFO: loaded from: classes5.dex */
@px4
public final class imh {

    /* JADX INFO: renamed from: a */
    public final C7510c f47539a;

    /* JADX INFO: renamed from: imh$a */
    public class C7508a extends smh {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Map f47540b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Type f47541c;

        public C7508a(final Map val$mappings, final Type val$to) {
            this.f47540b = val$mappings;
            this.f47541c = val$to;
        }

        @Override // p000.smh
        /* JADX INFO: renamed from: a */
        public void mo13200a(Class<?> fromClass) {
            if (this.f47541c instanceof WildcardType) {
                return;
            }
            throw new IllegalArgumentException("No type mapping from " + fromClass + " to " + this.f47541c);
        }

        @Override // p000.smh
        /* JADX INFO: renamed from: b */
        public void mo13201b(GenericArrayType fromArrayType) {
            Type type = this.f47541c;
            if (type instanceof WildcardType) {
                return;
            }
            Type typeM23473g = unh.m23473g(type);
            v7d.checkArgument(typeM23473g != null, "%s is not an array type.", this.f47541c);
            imh.populateTypeMappings(this.f47540b, fromArrayType.getGenericComponentType(), typeM23473g);
        }

        @Override // p000.smh
        /* JADX INFO: renamed from: c */
        public void mo13202c(ParameterizedType fromParameterizedType) {
            Type type = this.f47541c;
            if (type instanceof WildcardType) {
                return;
            }
            ParameterizedType parameterizedType = (ParameterizedType) imh.expectArgument(ParameterizedType.class, type);
            if (fromParameterizedType.getOwnerType() != null && parameterizedType.getOwnerType() != null) {
                imh.populateTypeMappings(this.f47540b, fromParameterizedType.getOwnerType(), parameterizedType.getOwnerType());
            }
            v7d.checkArgument(fromParameterizedType.getRawType().equals(parameterizedType.getRawType()), "Inconsistent raw type: %s vs. %s", fromParameterizedType, this.f47541c);
            Type[] actualTypeArguments = fromParameterizedType.getActualTypeArguments();
            Type[] actualTypeArguments2 = parameterizedType.getActualTypeArguments();
            v7d.checkArgument(actualTypeArguments.length == actualTypeArguments2.length, "%s not compatible with %s", fromParameterizedType, parameterizedType);
            for (int i = 0; i < actualTypeArguments.length; i++) {
                imh.populateTypeMappings(this.f47540b, actualTypeArguments[i], actualTypeArguments2[i]);
            }
        }

        @Override // p000.smh
        /* JADX INFO: renamed from: d */
        public void mo13203d(TypeVariable<?> typeVariable) {
            this.f47540b.put(new C7511d(typeVariable), this.f47541c);
        }

        @Override // p000.smh
        /* JADX INFO: renamed from: e */
        public void mo13204e(WildcardType fromWildcardType) {
            Type type = this.f47541c;
            if (type instanceof WildcardType) {
                WildcardType wildcardType = (WildcardType) type;
                Type[] upperBounds = fromWildcardType.getUpperBounds();
                Type[] upperBounds2 = wildcardType.getUpperBounds();
                Type[] lowerBounds = fromWildcardType.getLowerBounds();
                Type[] lowerBounds2 = wildcardType.getLowerBounds();
                v7d.checkArgument(upperBounds.length == upperBounds2.length && lowerBounds.length == lowerBounds2.length, "Incompatible type: %s vs. %s", fromWildcardType, this.f47541c);
                for (int i = 0; i < upperBounds.length; i++) {
                    imh.populateTypeMappings(this.f47540b, upperBounds[i], upperBounds2[i]);
                }
                for (int i2 = 0; i2 < lowerBounds.length; i2++) {
                    imh.populateTypeMappings(this.f47540b, lowerBounds[i2], lowerBounds2[i2]);
                }
            }
        }
    }

    /* JADX INFO: renamed from: imh$b */
    public static final class C7509b extends smh {

        /* JADX INFO: renamed from: b */
        public final Map<C7511d, Type> f47542b = tt9.newHashMap();

        private C7509b() {
        }

        /* JADX INFO: renamed from: f */
        public static ox7<C7511d, Type> m13205f(Type contextType) {
            v7d.checkNotNull(contextType);
            C7509b c7509b = new C7509b();
            c7509b.visit(contextType);
            return ox7.copyOf((Map) c7509b.f47542b);
        }

        private void map(C7511d var, Type arg) {
            if (this.f47542b.containsKey(var)) {
                return;
            }
            Type type = arg;
            while (type != null) {
                if (var.m13209a(type)) {
                    while (arg != null) {
                        arg = this.f47542b.remove(C7511d.m13208b(arg));
                    }
                    return;
                }
                type = this.f47542b.get(C7511d.m13208b(type));
            }
            this.f47542b.put(var, arg);
        }

        @Override // p000.smh
        /* JADX INFO: renamed from: a */
        public void mo13200a(Class<?> clazz) {
            visit(clazz.getGenericSuperclass());
            visit(clazz.getGenericInterfaces());
        }

        @Override // p000.smh
        /* JADX INFO: renamed from: c */
        public void mo13202c(ParameterizedType parameterizedType) {
            Class cls = (Class) parameterizedType.getRawType();
            TypeVariable[] typeParameters = cls.getTypeParameters();
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            v7d.checkState(typeParameters.length == actualTypeArguments.length);
            for (int i = 0; i < typeParameters.length; i++) {
                map(new C7511d(typeParameters[i]), actualTypeArguments[i]);
            }
            visit(cls);
            visit(parameterizedType.getOwnerType());
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

    /* JADX INFO: renamed from: imh$d */
    public static final class C7511d {

        /* JADX INFO: renamed from: a */
        public final TypeVariable<?> f47546a;

        public C7511d(TypeVariable<?> var) {
            this.f47546a = (TypeVariable) v7d.checkNotNull(var);
        }

        @wx1
        /* JADX INFO: renamed from: b */
        public static C7511d m13208b(Type t) {
            if (t instanceof TypeVariable) {
                return new C7511d((TypeVariable) t);
            }
            return null;
        }

        private boolean equalsTypeVariable(TypeVariable<?> that) {
            return this.f47546a.getGenericDeclaration().equals(that.getGenericDeclaration()) && this.f47546a.getName().equals(that.getName());
        }

        /* JADX INFO: renamed from: a */
        public boolean m13209a(Type type) {
            if (type instanceof TypeVariable) {
                return equalsTypeVariable((TypeVariable) type);
            }
            return false;
        }

        public boolean equals(@wx1 Object obj) {
            if (obj instanceof C7511d) {
                return equalsTypeVariable(((C7511d) obj).f47546a);
            }
            return false;
        }

        public int hashCode() {
            return okb.hashCode(this.f47546a.getGenericDeclaration(), this.f47546a.getName());
        }

        public String toString() {
            return this.f47546a.toString();
        }
    }

    /* JADX INFO: renamed from: imh$e */
    public static class C7512e {

        /* JADX INFO: renamed from: b */
        public static final C7512e f47547b = new C7512e();

        /* JADX INFO: renamed from: a */
        public final AtomicInteger f47548a;

        /* JADX INFO: renamed from: imh$e$a */
        public class a extends C7512e {

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ TypeVariable f47549c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(final C7512e this$0, AtomicInteger id, final TypeVariable val$typeParam) {
                super(id, null);
                this.f47549c = val$typeParam;
            }

            @Override // p000.imh.C7512e
            /* JADX INFO: renamed from: b */
            public TypeVariable<?> mo13211b(Type[] upperBounds) {
                LinkedHashSet linkedHashSet = new LinkedHashSet(Arrays.asList(upperBounds));
                linkedHashSet.addAll(Arrays.asList(this.f47549c.getBounds()));
                if (linkedHashSet.size() > 1) {
                    linkedHashSet.remove(Object.class);
                }
                return super.mo13211b((Type[]) linkedHashSet.toArray(new Type[0]));
            }
        }

        public /* synthetic */ C7512e(AtomicInteger atomicInteger, C7508a c7508a) {
            this(atomicInteger);
        }

        @wx1
        private Type captureNullable(@wx1 Type type) {
            if (type == null) {
                return null;
            }
            return m13210a(type);
        }

        private C7512e forTypeVariable(TypeVariable<?> typeParam) {
            return new a(this, this.f47548a, typeParam);
        }

        private C7512e notForTypeVariable() {
            return new C7512e(this.f47548a);
        }

        /* JADX INFO: renamed from: a */
        public final Type m13210a(Type type) {
            v7d.checkNotNull(type);
            if ((type instanceof Class) || (type instanceof TypeVariable)) {
                return type;
            }
            if (type instanceof GenericArrayType) {
                return unh.m23474h(notForTypeVariable().m13210a(((GenericArrayType) type).getGenericComponentType()));
            }
            if (!(type instanceof ParameterizedType)) {
                if (!(type instanceof WildcardType)) {
                    throw new AssertionError("must have been one of the known types");
                }
                WildcardType wildcardType = (WildcardType) type;
                return wildcardType.getLowerBounds().length == 0 ? mo13211b(wildcardType.getUpperBounds()) : type;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Class cls = (Class) parameterizedType.getRawType();
            TypeVariable<?>[] typeParameters = cls.getTypeParameters();
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            for (int i = 0; i < actualTypeArguments.length; i++) {
                actualTypeArguments[i] = forTypeVariable(typeParameters[i]).m13210a(actualTypeArguments[i]);
            }
            return unh.m23477k(notForTypeVariable().captureNullable(parameterizedType.getOwnerType()), cls, actualTypeArguments);
        }

        /* JADX INFO: renamed from: b */
        public TypeVariable<?> mo13211b(Type[] upperBounds) {
            return unh.m23475i(C7512e.class, "capture#" + this.f47548a.incrementAndGet() + "-of ? extends " + xj8.m25234on('&').join(upperBounds), upperBounds);
        }

        private C7512e() {
            this(new AtomicInteger());
        }

        private C7512e(AtomicInteger id) {
            this.f47548a = id;
        }
    }

    public /* synthetic */ imh(C7510c c7510c, C7508a c7508a) {
        this(c7510c);
    }

    /* JADX INFO: renamed from: d */
    public static imh m13196d(Type contextType) {
        return new imh().m13199g(C7509b.m13205f(contextType));
    }

    /* JADX INFO: renamed from: e */
    public static imh m13197e(Type contextType) {
        return new imh().m13199g(C7509b.m13205f(C7512e.f47547b.m13210a(contextType)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T> T expectArgument(Class<T> type, Object arg) {
        try {
            return type.cast(arg);
        } catch (ClassCastException unused) {
            throw new IllegalArgumentException(arg + " is not a " + type.getSimpleName());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void populateTypeMappings(Map<C7511d, Type> mappings, Type from, Type to) {
        if (from.equals(to)) {
            return;
        }
        new C7508a(mappings, to).visit(from);
    }

    private Type resolveGenericArrayType(GenericArrayType type) {
        return unh.m23474h(resolveType(type.getGenericComponentType()));
    }

    private ParameterizedType resolveParameterizedType(ParameterizedType type) {
        Type ownerType = type.getOwnerType();
        return unh.m23477k(ownerType == null ? null : resolveType(ownerType), (Class) resolveType(type.getRawType()), resolveTypes(type.getActualTypeArguments()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Type[] resolveTypes(Type[] types) {
        Type[] typeArr = new Type[types.length];
        for (int i = 0; i < types.length; i++) {
            typeArr[i] = resolveType(types[i]);
        }
        return typeArr;
    }

    private WildcardType resolveWildcardType(WildcardType type) {
        return new unh.C13630i(resolveTypes(type.getLowerBounds()), resolveTypes(type.getUpperBounds()));
    }

    /* JADX INFO: renamed from: f */
    public Type[] m13198f(Type[] types) {
        for (int i = 0; i < types.length; i++) {
            types[i] = resolveType(types[i]);
        }
        return types;
    }

    /* JADX INFO: renamed from: g */
    public imh m13199g(Map<C7511d, ? extends Type> mappings) {
        return new imh(this.f47539a.m13207b(mappings));
    }

    public Type resolveType(Type type) {
        v7d.checkNotNull(type);
        return type instanceof TypeVariable ? this.f47539a.m13206a((TypeVariable) type) : type instanceof ParameterizedType ? resolveParameterizedType((ParameterizedType) type) : type instanceof GenericArrayType ? resolveGenericArrayType((GenericArrayType) type) : type instanceof WildcardType ? resolveWildcardType((WildcardType) type) : type;
    }

    public imh where(Type formal, Type actual) {
        HashMap mapNewHashMap = tt9.newHashMap();
        populateTypeMappings(mapNewHashMap, (Type) v7d.checkNotNull(formal), (Type) v7d.checkNotNull(actual));
        return m13199g(mapNewHashMap);
    }

    /* JADX INFO: renamed from: imh$c */
    public static class C7510c {

        /* JADX INFO: renamed from: a */
        public final ox7<C7511d, Type> f47543a;

        /* JADX INFO: renamed from: imh$c$a */
        public class a extends C7510c {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ TypeVariable f47544b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ C7510c f47545c;

            public a(final C7510c this$0, final TypeVariable val$var, final C7510c val$unguarded) {
                this.f47544b = val$var;
                this.f47545c = val$unguarded;
            }

            @Override // p000.imh.C7510c
            public Type resolveInternal(TypeVariable<?> intermediateVar, C7510c forDependent) {
                return intermediateVar.getGenericDeclaration().equals(this.f47544b.getGenericDeclaration()) ? intermediateVar : this.f47545c.resolveInternal(intermediateVar, forDependent);
            }
        }

        public C7510c() {
            this.f47543a = ox7.m19076of();
        }

        /* JADX INFO: renamed from: a */
        public final Type m13206a(TypeVariable<?> var) {
            return resolveInternal(var, new a(this, var, this));
        }

        /* JADX INFO: renamed from: b */
        public final C7510c m13207b(Map<C7511d, ? extends Type> mappings) {
            ox7.C10705d c10705dBuilder = ox7.builder();
            c10705dBuilder.putAll(this.f47543a);
            for (Map.Entry<C7511d, ? extends Type> entry : mappings.entrySet()) {
                C7511d key = entry.getKey();
                Type value = entry.getValue();
                v7d.checkArgument(!key.m13209a(value), "Type variable %s bound to itself", key);
                c10705dBuilder.put(key, value);
            }
            return new C7510c(c10705dBuilder.buildOrThrow());
        }

        public Type resolveInternal(TypeVariable<?> var, C7510c forDependants) {
            Type type = this.f47543a.get(new C7511d(var));
            C7508a c7508a = null;
            if (type != null) {
                return new imh(forDependants, c7508a).resolveType(type);
            }
            Type[] bounds = var.getBounds();
            if (bounds.length == 0) {
                return var;
            }
            Type[] typeArrResolveTypes = new imh(forDependants, c7508a).resolveTypes(bounds);
            return (unh.C13626e.f88648a && Arrays.equals(bounds, typeArrResolveTypes)) ? var : unh.m23475i(var.getGenericDeclaration(), var.getName(), typeArrResolveTypes);
        }

        private C7510c(ox7<C7511d, Type> map) {
            this.f47543a = map;
        }
    }

    public imh() {
        this.f47539a = new C7510c();
    }

    private imh(C7510c typeTable) {
        this.f47539a = typeTable;
    }
}
