package p000;

import java.lang.annotation.Annotation;
import p000.ymh;

/* JADX INFO: loaded from: classes7.dex */
@xn8(name = "JvmClassMappingKt")
public final class hn8 {
    @yfb
    public static final <T extends Annotation> oo8<? extends T> getAnnotationClass(@yfb T t) {
        md8.checkNotNullParameter(t, "<this>");
        Class<? extends Annotation> clsAnnotationType = t.annotationType();
        md8.checkNotNullExpressionValue(clsAnnotationType, "annotationType(...)");
        oo8<? extends T> kotlinClass = getKotlinClass(clsAnnotationType);
        md8.checkNotNull(kotlinClass, "null cannot be cast to non-null type kotlin.reflect.KClass<out T of kotlin.jvm.JvmClassMappingKt.<get-annotationClass>>");
        return kotlinClass;
    }

    private static final <E extends Enum<E>> Class<E> getDeclaringJavaClass(Enum<E> r1) {
        md8.checkNotNullParameter(r1, "<this>");
        Class<E> declaringClass = r1.getDeclaringClass();
        md8.checkNotNullExpressionValue(declaringClass, "getDeclaringClass(...)");
        return declaringClass;
    }

    @jjf(version = "1.7")
    @t28
    public static /* synthetic */ void getDeclaringJavaClass$annotations(Enum r0) {
    }

    @yfb
    @xn8(name = "getJavaClass")
    public static final <T> Class<T> getJavaClass(@yfb oo8<T> oo8Var) {
        md8.checkNotNullParameter(oo8Var, "<this>");
        Class<T> cls = (Class<T>) ((u02) oo8Var).getJClass();
        md8.checkNotNull(cls, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return cls;
    }

    public static /* synthetic */ void getJavaClass$annotations(oo8 oo8Var) {
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @yfb
    public static final <T> Class<T> getJavaObjectType(@yfb oo8<T> oo8Var) {
        md8.checkNotNullParameter(oo8Var, "<this>");
        Class<T> cls = (Class<T>) ((u02) oo8Var).getJClass();
        if (!cls.isPrimitive()) {
            md8.checkNotNull(cls, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
            return cls;
        }
        String name = cls.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals("double")) {
                    cls = (Class<T>) Double.class;
                }
                break;
            case 104431:
                if (name.equals("int")) {
                    cls = (Class<T>) Integer.class;
                }
                break;
            case 3039496:
                if (name.equals("byte")) {
                    cls = (Class<T>) Byte.class;
                }
                break;
            case 3052374:
                if (name.equals("char")) {
                    cls = (Class<T>) Character.class;
                }
                break;
            case 3327612:
                if (name.equals("long")) {
                    cls = (Class<T>) Long.class;
                }
                break;
            case 3625364:
                if (name.equals("void")) {
                    cls = (Class<T>) Void.class;
                }
                break;
            case 64711720:
                if (name.equals(ymh.InterfaceC15723b.f102128f)) {
                    cls = (Class<T>) Boolean.class;
                }
                break;
            case 97526364:
                if (name.equals(ymh.InterfaceC15723b.f102125c)) {
                    cls = (Class<T>) Float.class;
                }
                break;
            case 109413500:
                if (name.equals("short")) {
                    cls = (Class<T>) Short.class;
                }
                break;
        }
        md8.checkNotNull(cls, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
        return cls;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @gib
    public static final <T> Class<T> getJavaPrimitiveType(@yfb oo8<T> oo8Var) {
        md8.checkNotNullParameter(oo8Var, "<this>");
        Class<T> cls = (Class<T>) ((u02) oo8Var).getJClass();
        if (cls.isPrimitive()) {
            md8.checkNotNull(cls, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaPrimitiveType>>");
            return cls;
        }
        String name = cls.getName();
        switch (name.hashCode()) {
            case -2056817302:
                if (name.equals("java.lang.Integer")) {
                    return Integer.TYPE;
                }
                return null;
            case -527879800:
                if (name.equals("java.lang.Float")) {
                    return Float.TYPE;
                }
                return null;
            case -515992664:
                if (name.equals("java.lang.Short")) {
                    return Short.TYPE;
                }
                return null;
            case 155276373:
                if (name.equals("java.lang.Character")) {
                    return Character.TYPE;
                }
                return null;
            case 344809556:
                if (name.equals("java.lang.Boolean")) {
                    return Boolean.TYPE;
                }
                return null;
            case 398507100:
                if (name.equals("java.lang.Byte")) {
                    return Byte.TYPE;
                }
                return null;
            case 398795216:
                if (name.equals("java.lang.Long")) {
                    return Long.TYPE;
                }
                return null;
            case 399092968:
                if (name.equals("java.lang.Void")) {
                    return Void.TYPE;
                }
                return null;
            case 761287205:
                if (name.equals("java.lang.Double")) {
                    return Double.TYPE;
                }
                return null;
            default:
                return null;
        }
    }

    @yfb
    @xn8(name = "getKotlinClass")
    public static final <T> oo8<T> getKotlinClass(@yfb Class<T> cls) {
        md8.checkNotNullParameter(cls, "<this>");
        return vvd.getOrCreateKotlinClass(cls);
    }

    @yfb
    @xn8(name = "getRuntimeClassOfKClassInstance")
    public static final <T> Class<oo8<T>> getRuntimeClassOfKClassInstance(@yfb oo8<T> oo8Var) {
        md8.checkNotNullParameter(oo8Var, "<this>");
        Class<oo8<T>> cls = (Class<oo8<T>>) oo8Var.getClass();
        md8.checkNotNull(cls, "null cannot be cast to non-null type java.lang.Class<kotlin.reflect.KClass<T of kotlin.jvm.JvmClassMappingKt.<get-javaClass>>>");
        return cls;
    }

    @q64(level = u64.f86866b, message = "Use 'java' property to get Java class corresponding to this Kotlin class or cast this instance to Any if you really want to get the runtime Java class of this implementation of KClass.", replaceWith = @i2e(expression = "(this as Any).javaClass", imports = {}))
    public static /* synthetic */ void getRuntimeClassOfKClassInstance$annotations(oo8 oo8Var) {
    }

    public static final /* synthetic */ boolean isArrayOf(Object[] objArr) {
        md8.checkNotNullParameter(objArr, "<this>");
        md8.reifiedOperationMarker(4, "T");
        return Object.class.isAssignableFrom(objArr.getClass().getComponentType());
    }

    @yfb
    public static final <T> Class<T> getJavaClass(@yfb T t) {
        md8.checkNotNullParameter(t, "<this>");
        Class<T> cls = (Class<T>) t.getClass();
        md8.checkNotNull(cls, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaClass>>");
        return cls;
    }
}
