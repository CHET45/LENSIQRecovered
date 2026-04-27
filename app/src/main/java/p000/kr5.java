package p000;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* JADX INFO: loaded from: classes3.dex */
public class kr5 implements Comparable<kr5> {

    /* JADX INFO: renamed from: C */
    public final Type f55096C;

    /* JADX INFO: renamed from: F */
    public final Class<?> f55097F;

    /* JADX INFO: renamed from: H */
    public final boolean f55098H;

    /* JADX INFO: renamed from: L */
    public final kh8 f55099L;

    /* JADX INFO: renamed from: M */
    public final kh8 f55100M;

    /* JADX INFO: renamed from: N */
    public final char[] f55101N;

    /* JADX INFO: renamed from: Q */
    public final boolean f55102Q;

    /* JADX INFO: renamed from: X */
    public final String f55103X;

    /* JADX INFO: renamed from: a */
    public final String f55104a;

    /* JADX INFO: renamed from: b */
    public final Method f55105b;

    /* JADX INFO: renamed from: c */
    public final Field f55106c;

    /* JADX INFO: renamed from: d */
    public final boolean f55107d;

    /* JADX INFO: renamed from: e */
    public final boolean f55108e;

    /* JADX INFO: renamed from: f */
    public int f55109f;

    /* JADX INFO: renamed from: m */
    public final Class<?> f55110m;

    public kr5(String str, Class<?> cls, Class<?> cls2, Type type, Field field, int i, int i2) {
        this.f55104a = str;
        this.f55097F = cls;
        this.f55110m = cls2;
        this.f55096C = type;
        this.f55105b = null;
        this.f55106c = field;
        this.f55109f = i;
        this.f55102Q = cls2.isEnum();
        this.f55099L = null;
        this.f55100M = null;
        if (field != null) {
            int modifiers = field.getModifiers();
            this.f55107d = true;
            this.f55108e = Modifier.isTransient(modifiers);
        } else {
            this.f55107d = false;
            this.f55108e = false;
        }
        this.f55098H = false;
        int length = str.length();
        char[] cArr = new char[length + 3];
        this.f55101N = cArr;
        str.getChars(0, str.length(), cArr, 1);
        cArr[0] = '\"';
        cArr[length + 1] = '\"';
        cArr[length + 2] = ':';
        this.f55103X = null;
    }

    public static Type getFieldType(Class<?> cls, Type type, Type type2) {
        TypeVariable<Class<? super Object>>[] typeParameters;
        ParameterizedType parameterizedType;
        if (cls != null && type != null) {
            if (type2 instanceof GenericArrayType) {
                Type genericComponentType = ((GenericArrayType) type2).getGenericComponentType();
                Type fieldType = getFieldType(cls, type, genericComponentType);
                return genericComponentType != fieldType ? Array.newInstance(qmh.getClass(fieldType), 0).getClass() : type2;
            }
            if (!qmh.isGenericParamType(type)) {
                return type2;
            }
            if (type2 instanceof TypeVariable) {
                ParameterizedType parameterizedType2 = (ParameterizedType) qmh.getGenericParamType(type);
                Class<?> cls2 = qmh.getClass(parameterizedType2);
                TypeVariable typeVariable = (TypeVariable) type2;
                for (int i = 0; i < cls2.getTypeParameters().length; i++) {
                    if (cls2.getTypeParameters()[i].getName().equals(typeVariable.getName())) {
                        return parameterizedType2.getActualTypeArguments()[i];
                    }
                }
            }
            if (type2 instanceof ParameterizedType) {
                ParameterizedType parameterizedType3 = (ParameterizedType) type2;
                Type[] actualTypeArguments = parameterizedType3.getActualTypeArguments();
                Type[] actualTypeArguments2 = null;
                if (type instanceof ParameterizedType) {
                    parameterizedType = (ParameterizedType) type;
                    typeParameters = cls.getTypeParameters();
                } else if (cls.getGenericSuperclass() instanceof ParameterizedType) {
                    parameterizedType = (ParameterizedType) cls.getGenericSuperclass();
                    typeParameters = cls.getSuperclass().getTypeParameters();
                } else {
                    typeParameters = null;
                    parameterizedType = null;
                }
                boolean z = false;
                for (int i2 = 0; i2 < actualTypeArguments.length && parameterizedType != null; i2++) {
                    Type type3 = actualTypeArguments[i2];
                    if (type3 instanceof TypeVariable) {
                        TypeVariable typeVariable2 = (TypeVariable) type3;
                        for (int i3 = 0; i3 < typeParameters.length; i3++) {
                            if (typeParameters[i3].getName().equals(typeVariable2.getName())) {
                                if (actualTypeArguments2 == null) {
                                    actualTypeArguments2 = parameterizedType.getActualTypeArguments();
                                }
                                actualTypeArguments[i2] = actualTypeArguments2[i3];
                                z = true;
                            }
                        }
                    }
                }
                if (z) {
                    return new rfc(actualTypeArguments, parameterizedType3.getOwnerType(), parameterizedType3.getRawType());
                }
            }
        }
        return type2;
    }

    public static Type getInheritGenericType(Class<?> cls, TypeVariable<?> typeVariable) {
        GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
        while (true) {
            Type genericSuperclass = cls.getGenericSuperclass();
            if (genericSuperclass == null) {
                return null;
            }
            if (genericSuperclass instanceof ParameterizedType) {
                ParameterizedType parameterizedType = (ParameterizedType) genericSuperclass;
                if (parameterizedType.getRawType() == genericDeclaration) {
                    TypeVariable<?>[] typeParameters = genericDeclaration.getTypeParameters();
                    Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                    for (int i = 0; i < typeParameters.length; i++) {
                        if (typeParameters[i] == typeVariable) {
                            return actualTypeArguments[i];
                        }
                    }
                    return null;
                }
            }
            cls = qmh.getClass(genericSuperclass);
        }
    }

    public boolean equals(kr5 kr5Var) {
        return kr5Var == this || compareTo(kr5Var) == 0;
    }

    public Object get(Object obj) throws IllegalAccessException, InvocationTargetException {
        return this.f55107d ? this.f55106c.get(obj) : this.f55105b.invoke(obj, null);
    }

    public kh8 getAnnotation() {
        kh8 kh8Var = this.f55099L;
        return kh8Var != null ? kh8Var : this.f55100M;
    }

    public void set(Object obj, Object obj2) throws IllegalAccessException, InvocationTargetException {
        Method method = this.f55105b;
        if (method != null) {
            method.invoke(obj, obj2);
        } else {
            this.f55106c.set(obj, obj2);
        }
    }

    public String toString() {
        return this.f55104a;
    }

    @Override // java.lang.Comparable
    public int compareTo(kr5 kr5Var) {
        int i = this.f55109f;
        int i2 = kr5Var.f55109f;
        if (i < i2) {
            return -1;
        }
        if (i > i2) {
            return 1;
        }
        return this.f55104a.compareTo(kr5Var.f55104a);
    }

    public kr5(String str, Method method, Field field, Class<?> cls, Type type, int i, int i2, kh8 kh8Var, kh8 kh8Var2, boolean z) {
        Type genericType;
        Class<?> returnType;
        Type inheritGenericType;
        this.f55104a = str;
        this.f55105b = method;
        this.f55106c = field;
        this.f55109f = i;
        this.f55100M = kh8Var;
        this.f55099L = kh8Var2;
        kh8 annotation = getAnnotation();
        String str2 = null;
        if (annotation != null) {
            String str3 = annotation.format();
            if (str3.trim().length() != 0) {
                str2 = str3;
            }
        }
        this.f55103X = str2;
        if (field != null) {
            int modifiers = field.getModifiers();
            this.f55107d = method == null || ((modifiers & 1) != 0 && method.getReturnType() == field.getType());
            this.f55108e = (modifiers & 128) != 0;
        } else {
            this.f55107d = false;
            this.f55108e = false;
        }
        int length = str.length();
        char[] cArr = new char[length + 3];
        this.f55101N = cArr;
        str.getChars(0, str.length(), cArr, 1);
        cArr[0] = '\"';
        cArr[length + 1] = '\"';
        cArr[length + 2] = ':';
        if (method != null) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            if (parameterTypes.length == 1) {
                returnType = parameterTypes[0];
                genericType = (returnType == Class.class || returnType == String.class || returnType.isPrimitive() || !z) ? returnType : method.getGenericParameterTypes()[0];
                this.f55098H = false;
            } else {
                returnType = method.getReturnType();
                genericType = (returnType != Class.class && z) ? method.getGenericReturnType() : returnType;
                this.f55098H = true;
            }
            this.f55097F = method.getDeclaringClass();
        } else {
            Class<?> type2 = field.getType();
            genericType = (type2.isPrimitive() || type2 == String.class || type2.isEnum() || !z) ? type2 : field.getGenericType();
            this.f55097F = field.getDeclaringClass();
            this.f55098H = Modifier.isFinal(field.getModifiers());
            returnType = type2;
        }
        if (cls != null && returnType == Object.class && (genericType instanceof TypeVariable) && (inheritGenericType = getInheritGenericType(cls, (TypeVariable) genericType)) != null) {
            this.f55110m = qmh.getClass(inheritGenericType);
            this.f55096C = inheritGenericType;
            this.f55102Q = returnType.isEnum();
            return;
        }
        if (!(genericType instanceof Class)) {
            Type fieldType = getFieldType(cls, type == null ? cls : type, genericType);
            if (fieldType != genericType && ((fieldType instanceof ParameterizedType) || (fieldType instanceof Class))) {
                returnType = qmh.getClass(fieldType);
            }
            genericType = fieldType;
        }
        this.f55096C = genericType;
        this.f55110m = returnType;
        this.f55102Q = !returnType.isArray() && returnType.isEnum();
    }
}
