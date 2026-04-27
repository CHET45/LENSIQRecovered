package p000;

import java.lang.annotation.Annotation;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.AnnotatedType;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.Arrays;
import p000.kx7;

/* JADX INFO: loaded from: classes5.dex */
@px4
public abstract class ue8<T, R> implements AnnotatedElement, Member {

    /* JADX INFO: renamed from: c */
    public static final boolean f87780c = initAnnotatedTypeExists();

    /* JADX INFO: renamed from: a */
    public final AccessibleObject f87781a;

    /* JADX INFO: renamed from: b */
    public final Member f87782b;

    /* JADX INFO: renamed from: ue8$a */
    public static class C13513a<T> extends ue8<T, T> {

        /* JADX INFO: renamed from: d */
        public final Constructor<?> f87783d;

        public C13513a(Constructor<?> constructor) {
            super(constructor);
            this.f87783d = constructor;
        }

        private boolean mayNeedHiddenThis() {
            Class<?> declaringClass = this.f87783d.getDeclaringClass();
            if (declaringClass.getEnclosingConstructor() != null) {
                return true;
            }
            return declaringClass.getEnclosingMethod() != null ? !Modifier.isStatic(r1.getModifiers()) : (declaringClass.getEnclosingClass() == null || Modifier.isStatic(declaringClass.getModifiers())) ? false : true;
        }

        @Override // p000.ue8
        @xr7
        /* JADX INFO: renamed from: a */
        public AnnotatedType[] mo23280a() {
            return this.f87783d.getAnnotatedParameterTypes();
        }

        @Override // p000.ue8
        /* JADX INFO: renamed from: b */
        public Type[] mo18023b() {
            return this.f87783d.getGenericExceptionTypes();
        }

        @Override // p000.ue8
        /* JADX INFO: renamed from: c */
        public Type[] mo18024c() {
            Type[] genericParameterTypes = this.f87783d.getGenericParameterTypes();
            if (genericParameterTypes.length <= 0 || !mayNeedHiddenThis()) {
                return genericParameterTypes;
            }
            Class<?>[] parameterTypes = this.f87783d.getParameterTypes();
            return (genericParameterTypes.length == parameterTypes.length && parameterTypes[0] == getDeclaringClass().getEnclosingClass()) ? (Type[]) Arrays.copyOfRange(genericParameterTypes, 1, genericParameterTypes.length) : genericParameterTypes;
        }

        @Override // p000.ue8
        /* JADX INFO: renamed from: d */
        public Type mo18025d() {
            Class<? super T> declaringClass = getDeclaringClass();
            TypeVariable<Class<? super T>>[] typeParameters = declaringClass.getTypeParameters();
            return typeParameters.length > 0 ? unh.m23476j(declaringClass, typeParameters) : declaringClass;
        }

        @Override // p000.ue8
        /* JADX INFO: renamed from: e */
        public final Annotation[][] mo23281e() {
            return this.f87783d.getParameterAnnotations();
        }

        @Override // p000.ue8
        /* JADX INFO: renamed from: f */
        public final Object mo23282f(@wx1 Object receiver, Object[] args) throws IllegalAccessException, InvocationTargetException {
            try {
                return this.f87783d.newInstance(args);
            } catch (InstantiationException e) {
                throw new RuntimeException(this.f87783d + " failed.", e);
            }
        }

        @Override // p000.ue8
        @hh4
        @xr7
        public AnnotatedType getAnnotatedReturnType() {
            return this.f87783d.getAnnotatedReturnType();
        }

        @Override // p000.ue8
        public final TypeVariable<?>[] getTypeParameters() {
            TypeVariable<Class<? super T>>[] typeParameters = getDeclaringClass().getTypeParameters();
            TypeVariable<Constructor<?>>[] typeParameters2 = this.f87783d.getTypeParameters();
            TypeVariable<?>[] typeVariableArr = new TypeVariable[typeParameters.length + typeParameters2.length];
            System.arraycopy(typeParameters, 0, typeVariableArr, 0, typeParameters.length);
            System.arraycopy(typeParameters2, 0, typeVariableArr, typeParameters.length, typeParameters2.length);
            return typeVariableArr;
        }

        @Override // p000.ue8
        public final boolean isOverridable() {
            return false;
        }

        @Override // p000.ue8
        public final boolean isVarArgs() {
            return this.f87783d.isVarArgs();
        }
    }

    /* JADX INFO: renamed from: ue8$b */
    public static class C13514b<T> extends ue8<T, Object> {

        /* JADX INFO: renamed from: d */
        public final Method f87784d;

        public C13514b(Method method) {
            super(method);
            this.f87784d = method;
        }

        @Override // p000.ue8
        @xr7
        /* JADX INFO: renamed from: a */
        public AnnotatedType[] mo23280a() {
            return this.f87784d.getAnnotatedParameterTypes();
        }

        @Override // p000.ue8
        /* JADX INFO: renamed from: b */
        public Type[] mo18023b() {
            return this.f87784d.getGenericExceptionTypes();
        }

        @Override // p000.ue8
        /* JADX INFO: renamed from: c */
        public Type[] mo18024c() {
            return this.f87784d.getGenericParameterTypes();
        }

        @Override // p000.ue8
        /* JADX INFO: renamed from: d */
        public Type mo18025d() {
            return this.f87784d.getGenericReturnType();
        }

        @Override // p000.ue8
        /* JADX INFO: renamed from: e */
        public final Annotation[][] mo23281e() {
            return this.f87784d.getParameterAnnotations();
        }

        @Override // p000.ue8
        @wx1
        /* JADX INFO: renamed from: f */
        public final Object mo23282f(@wx1 Object receiver, Object[] args) throws IllegalAccessException, InvocationTargetException {
            return this.f87784d.invoke(receiver, args);
        }

        @Override // p000.ue8
        @hh4
        @xr7
        public AnnotatedType getAnnotatedReturnType() {
            return this.f87784d.getAnnotatedReturnType();
        }

        @Override // p000.ue8
        public final TypeVariable<?>[] getTypeParameters() {
            return this.f87784d.getTypeParameters();
        }

        @Override // p000.ue8
        public final boolean isOverridable() {
            return (isFinal() || isPrivate() || isStatic() || Modifier.isFinal(getDeclaringClass().getModifiers())) ? false : true;
        }

        @Override // p000.ue8
        public final boolean isVarArgs() {
            return this.f87784d.isVarArgs();
        }
    }

    public <M extends AccessibleObject & Member> ue8(M member) {
        v7d.checkNotNull(member);
        this.f87781a = member;
        this.f87782b = member;
    }

    public static ue8<?, Object> from(Method method) {
        return new C13514b(method);
    }

    private static boolean initAnnotatedTypeExists() {
        try {
            Class.forName("java.lang.reflect.AnnotatedType");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    @xr7
    /* JADX INFO: renamed from: a */
    public abstract AnnotatedType[] mo23280a();

    /* JADX INFO: renamed from: b */
    public abstract Type[] mo18023b();

    /* JADX INFO: renamed from: c */
    public abstract Type[] mo18024c();

    /* JADX INFO: renamed from: d */
    public abstract Type mo18025d();

    /* JADX INFO: renamed from: e */
    public abstract Annotation[][] mo23281e();

    public boolean equals(@wx1 Object obj) {
        if (!(obj instanceof ue8)) {
            return false;
        }
        ue8 ue8Var = (ue8) obj;
        return getOwnerType().equals(ue8Var.getOwnerType()) && this.f87782b.equals(ue8Var.f87782b);
    }

    @wx1
    /* JADX INFO: renamed from: f */
    public abstract Object mo23282f(@wx1 Object receiver, Object[] args) throws IllegalAccessException, InvocationTargetException;

    /* JADX INFO: renamed from: g */
    public final boolean m23283g() {
        return Modifier.isTransient(getModifiers());
    }

    @w01
    @Deprecated
    @hh4("fails under Android VMs; do not use from guava-android")
    @xr7
    public abstract AnnotatedType getAnnotatedReturnType();

    @Override // java.lang.reflect.AnnotatedElement
    @wx1
    public final <A extends Annotation> A getAnnotation(Class<A> cls) {
        return (A) this.f87781a.getAnnotation(cls);
    }

    @Override // java.lang.reflect.AnnotatedElement
    public final Annotation[] getAnnotations() {
        return this.f87781a.getAnnotations();
    }

    @Override // java.lang.reflect.AnnotatedElement
    public final Annotation[] getDeclaredAnnotations() {
        return this.f87781a.getDeclaredAnnotations();
    }

    @Override // java.lang.reflect.Member
    public final Class<? super T> getDeclaringClass() {
        return (Class<? super T>) this.f87782b.getDeclaringClass();
    }

    public final kx7<nmh<? extends Throwable>> getExceptionTypes() {
        kx7.C8541a c8541aBuilder = kx7.builder();
        for (Type type : mo18023b()) {
            c8541aBuilder.add(nmh.m18019of(type));
        }
        return c8541aBuilder.build();
    }

    @Override // java.lang.reflect.Member
    public final int getModifiers() {
        return this.f87782b.getModifiers();
    }

    @Override // java.lang.reflect.Member
    public final String getName() {
        return this.f87782b.getName();
    }

    public nmh<T> getOwnerType() {
        return nmh.m18018of((Class) getDeclaringClass());
    }

    @xr7
    public final kx7<kfc> getParameters() {
        Type[] typeArrMo18024c = mo18024c();
        Annotation[][] annotationArrMo23281e = mo23281e();
        Object[] objArrMo23280a = f87780c ? mo23280a() : new Object[typeArrMo18024c.length];
        kx7.C8541a c8541aBuilder = kx7.builder();
        for (int i = 0; i < typeArrMo18024c.length; i++) {
            c8541aBuilder.add(new kfc(this, i, nmh.m18019of(typeArrMo18024c[i]), annotationArrMo23281e[i], objArrMo23280a[i]));
        }
        return c8541aBuilder.build();
    }

    public final nmh<? extends R> getReturnType() {
        return (nmh<? extends R>) nmh.m18019of(mo18025d());
    }

    public abstract TypeVariable<?>[] getTypeParameters();

    /* JADX INFO: renamed from: h */
    public final boolean m23284h() {
        return Modifier.isVolatile(getModifiers());
    }

    public int hashCode() {
        return this.f87782b.hashCode();
    }

    @wx1
    @op1
    public final R invoke(@wx1 T t, Object... objArr) throws IllegalAccessException, InvocationTargetException {
        return (R) mo23282f(t, (Object[]) v7d.checkNotNull(objArr));
    }

    public final boolean isAbstract() {
        return Modifier.isAbstract(getModifiers());
    }

    public final boolean isAccessible() {
        return this.f87781a.isAccessible();
    }

    @Override // java.lang.reflect.AnnotatedElement
    public final boolean isAnnotationPresent(Class<? extends Annotation> annotationClass) {
        return this.f87781a.isAnnotationPresent(annotationClass);
    }

    public final boolean isFinal() {
        return Modifier.isFinal(getModifiers());
    }

    public final boolean isNative() {
        return Modifier.isNative(getModifiers());
    }

    public abstract boolean isOverridable();

    public final boolean isPackagePrivate() {
        return (isPrivate() || isPublic() || isProtected()) ? false : true;
    }

    public final boolean isPrivate() {
        return Modifier.isPrivate(getModifiers());
    }

    public final boolean isProtected() {
        return Modifier.isProtected(getModifiers());
    }

    public final boolean isPublic() {
        return Modifier.isPublic(getModifiers());
    }

    public final boolean isStatic() {
        return Modifier.isStatic(getModifiers());
    }

    public final boolean isSynchronized() {
        return Modifier.isSynchronized(getModifiers());
    }

    @Override // java.lang.reflect.Member
    public final boolean isSynthetic() {
        return this.f87782b.isSynthetic();
    }

    public abstract boolean isVarArgs();

    public final <R1 extends R> ue8<T, R1> returning(Class<R1> returnType) {
        return returning(nmh.m18018of((Class) returnType));
    }

    public final void setAccessible(boolean flag) {
        this.f87781a.setAccessible(flag);
    }

    public String toString() {
        return this.f87782b.toString();
    }

    public final boolean trySetAccessible() {
        try {
            this.f87781a.setAccessible(true);
            return true;
        } catch (RuntimeException unused) {
            return false;
        }
    }

    public static <T> ue8<T, T> from(Constructor<T> constructor) {
        return new C13513a(constructor);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R1 extends R> ue8<T, R1> returning(nmh<R1> returnType) {
        if (returnType.isSupertypeOf(getReturnType())) {
            return this;
        }
        throw new IllegalArgumentException("Invokable is known to return " + getReturnType() + ", not " + returnType);
    }
}
