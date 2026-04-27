package p000;

import android.net.Uri;
import com.blankj.utilcode.util.C2473f;
import com.google.firebase.Timestamp;
import com.google.firebase.firestore.C3597c;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes5.dex */
public class pc3 {

    /* JADX INFO: renamed from: a */
    public static final int f70284a = 500;

    /* JADX INFO: renamed from: b */
    public static final ConcurrentMap<Class<?>, C10893a<?>> f70285b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: pc3$b */
    public static class C10894b {

        /* JADX INFO: renamed from: a */
        public final C10895c f70296a;

        /* JADX INFO: renamed from: b */
        public final C3597c f70297b;

        public C10894b(C10895c c10895c, C3597c c3597c) {
            this.f70296a = c10895c;
            this.f70297b = c3597c;
        }

        /* JADX INFO: renamed from: a */
        public C10894b m19409a(C10895c c10895c) {
            return new C10894b(c10895c, this.f70297b);
        }
    }

    /* JADX INFO: renamed from: pc3$c */
    public static class C10895c {

        /* JADX INFO: renamed from: d */
        public static final C10895c f70298d = new C10895c(null, null, 0);

        /* JADX INFO: renamed from: a */
        public final int f70299a;

        /* JADX INFO: renamed from: b */
        public final C10895c f70300b;

        /* JADX INFO: renamed from: c */
        public final String f70301c;

        public C10895c(C10895c c10895c, String str, int i) {
            this.f70300b = c10895c;
            this.f70301c = str;
            this.f70299a = i;
        }

        /* JADX INFO: renamed from: a */
        public C10895c m19410a(String str) {
            return new C10895c(this, str, this.f70299a + 1);
        }

        /* JADX INFO: renamed from: b */
        public int m19411b() {
            return this.f70299a;
        }

        public String toString() {
            int i = this.f70299a;
            if (i == 0) {
                return "";
            }
            if (i == 1) {
                return this.f70301c;
            }
            return this.f70300b.toString() + "." + this.f70301c;
        }
    }

    private static <T> T convertBean(Object obj, Class<T> cls, C10894b c10894b) {
        C10893a c10893aLoadOrCreateBeanMapperForClass = loadOrCreateBeanMapperForClass(cls);
        if (obj instanceof Map) {
            return (T) c10893aLoadOrCreateBeanMapperForClass.m19406c(expectMap(obj, c10894b), c10894b);
        }
        throw deserializeError(c10894b.f70296a, "Can't convert object of type " + obj.getClass().getName() + " to type " + cls.getName());
    }

    private static a61 convertBlob(Object obj, C10894b c10894b) {
        if (obj instanceof a61) {
            return (a61) obj;
        }
        throw deserializeError(c10894b.f70296a, "Failed to convert value of type " + obj.getClass().getName() + " to Blob");
    }

    private static Boolean convertBoolean(Object obj, C10894b c10894b) {
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        throw deserializeError(c10894b.f70296a, "Failed to convert value of type " + obj.getClass().getName() + " to boolean");
    }

    private static Date convertDate(Object obj, C10894b c10894b) {
        if (obj instanceof Date) {
            return (Date) obj;
        }
        if (obj instanceof Timestamp) {
            return ((Timestamp) obj).toDate();
        }
        throw deserializeError(c10894b.f70296a, "Failed to convert value of type " + obj.getClass().getName() + " to Date");
    }

    private static C3597c convertDocumentReference(Object obj, C10894b c10894b) {
        if (obj instanceof C3597c) {
            return (C3597c) obj;
        }
        throw deserializeError(c10894b.f70296a, "Failed to convert value of type " + obj.getClass().getName() + " to DocumentReference");
    }

    private static Double convertDouble(Object obj, C10894b c10894b) {
        if (obj instanceof Integer) {
            return Double.valueOf(((Integer) obj).doubleValue());
        }
        if (!(obj instanceof Long)) {
            if (obj instanceof Double) {
                return (Double) obj;
            }
            throw deserializeError(c10894b.f70296a, "Failed to convert a value of type " + obj.getClass().getName() + " to double");
        }
        Long l = (Long) obj;
        Double dValueOf = Double.valueOf(l.doubleValue());
        if (dValueOf.longValue() == l.longValue()) {
            return dValueOf;
        }
        throw deserializeError(c10894b.f70296a, "Loss of precision while converting number to double: " + obj + ". Did you mean to use a 64-bit long instead?");
    }

    private static d37 convertGeoPoint(Object obj, C10894b c10894b) {
        if (obj instanceof d37) {
            return (d37) obj;
        }
        throw deserializeError(c10894b.f70296a, "Failed to convert value of type " + obj.getClass().getName() + " to GeoPoint");
    }

    private static Integer convertInteger(Object obj, C10894b c10894b) {
        if (obj instanceof Integer) {
            return (Integer) obj;
        }
        if (!(obj instanceof Long) && !(obj instanceof Double)) {
            throw deserializeError(c10894b.f70296a, "Failed to convert a value of type " + obj.getClass().getName() + " to int");
        }
        Number number = (Number) obj;
        double dDoubleValue = number.doubleValue();
        if (dDoubleValue >= -2.147483648E9d && dDoubleValue <= 2.147483647E9d) {
            return Integer.valueOf(number.intValue());
        }
        throw deserializeError(c10894b.f70296a, "Numeric value out of 32-bit integer range: " + dDoubleValue + ". Did you mean to use a long or double instead of an int?");
    }

    private static Long convertLong(Object obj, C10894b c10894b) {
        if (obj instanceof Integer) {
            return Long.valueOf(((Integer) obj).longValue());
        }
        if (obj instanceof Long) {
            return (Long) obj;
        }
        if (!(obj instanceof Double)) {
            throw deserializeError(c10894b.f70296a, "Failed to convert a value of type " + obj.getClass().getName() + " to long");
        }
        Double d = (Double) obj;
        if (d.doubleValue() >= -9.223372036854776E18d && d.doubleValue() <= 9.223372036854776E18d) {
            return Long.valueOf(d.longValue());
        }
        throw deserializeError(c10894b.f70296a, "Numeric value out of 64-bit long range: " + d + ". Did you mean to use a double instead of a long?");
    }

    private static String convertString(Object obj, C10894b c10894b) {
        if (obj instanceof String) {
            return (String) obj;
        }
        throw deserializeError(c10894b.f70296a, "Failed to convert value of type " + obj.getClass().getName() + " to String");
    }

    private static Timestamp convertTimestamp(Object obj, C10894b c10894b) {
        if (obj instanceof Timestamp) {
            return (Timestamp) obj;
        }
        if (obj instanceof Date) {
            return new Timestamp((Date) obj);
        }
        throw deserializeError(c10894b.f70296a, "Failed to convert value of type " + obj.getClass().getName() + " to Timestamp");
    }

    public static <T> T convertToCustomClass(Object obj, Class<T> cls, C3597c c3597c) {
        return (T) deserializeToClass(obj, cls, new C10894b(C10895c.f70298d, c3597c));
    }

    public static Object convertToPlainJavaTypes(Object obj) {
        return serialize(obj);
    }

    private static s3i convertVectorValue(Object obj, C10894b c10894b) {
        if (obj instanceof s3i) {
            return (s3i) obj;
        }
        throw deserializeError(c10894b.f70296a, "Failed to convert value of type " + obj.getClass().getName() + " to VectorValue");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static RuntimeException deserializeError(C10895c c10895c, String str) {
        String str2 = "Could not deserialize object. " + str;
        if (c10895c.m19411b() > 0) {
            str2 = str2 + " (found in field '" + c10895c.toString() + "')";
        }
        return new RuntimeException(str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <T> T deserializeToClass(Object obj, Class<T> cls, C10894b c10894b) {
        if (obj == 0) {
            return null;
        }
        if (cls.isPrimitive() || Number.class.isAssignableFrom(cls) || Boolean.class.isAssignableFrom(cls) || Character.class.isAssignableFrom(cls)) {
            return (T) deserializeToPrimitive(obj, cls, c10894b);
        }
        if (String.class.isAssignableFrom(cls)) {
            return (T) convertString(obj, c10894b);
        }
        if (Date.class.isAssignableFrom(cls)) {
            return (T) convertDate(obj, c10894b);
        }
        if (Timestamp.class.isAssignableFrom(cls)) {
            return (T) convertTimestamp(obj, c10894b);
        }
        if (a61.class.isAssignableFrom(cls)) {
            return (T) convertBlob(obj, c10894b);
        }
        if (d37.class.isAssignableFrom(cls)) {
            return (T) convertGeoPoint(obj, c10894b);
        }
        if (C3597c.class.isAssignableFrom(cls)) {
            return (T) convertDocumentReference(obj, c10894b);
        }
        if (s3i.class.isAssignableFrom(cls)) {
            return (T) convertVectorValue(obj, c10894b);
        }
        if (cls.isArray()) {
            throw deserializeError(c10894b.f70296a, "Converting to Arrays is not supported, please use Lists instead");
        }
        if (cls.getTypeParameters().length <= 0) {
            return cls.equals(Object.class) ? obj : cls.isEnum() ? (T) deserializeToEnum(obj, cls, c10894b) : (T) convertBean(obj, cls, c10894b);
        }
        throw deserializeError(c10894b.f70296a, "Class " + cls.getName() + " has generic type parameters");
    }

    private static <T> T deserializeToEnum(Object obj, Class<T> cls, C10894b c10894b) {
        if (!(obj instanceof String)) {
            throw deserializeError(c10894b.f70296a, "Expected a String while deserializing to enum " + cls + " but got a " + obj.getClass());
        }
        String name = (String) obj;
        Field[] fields = cls.getFields();
        int length = fields.length;
        int i = 0;
        while (true) {
            if (i < length) {
                Field field = fields[i];
                if (field.isEnumConstant() && name.equals(C10893a.propertyName(field))) {
                    name = field.getName();
                    break;
                }
                i++;
            }
        }
        try {
            return (T) Enum.valueOf(cls, name);
        } catch (IllegalArgumentException unused) {
            throw deserializeError(c10894b.f70296a, "Could not find enum value of " + cls.getName() + " for value \"" + name + "\"");
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [T, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r0v8, types: [T, java.util.ArrayList, java.util.List] */
    private static <T> T deserializeToParameterizedType(Object obj, ParameterizedType parameterizedType, C10894b c10894b) {
        Class cls = (Class) parameterizedType.getRawType();
        int i = 0;
        if (List.class.isAssignableFrom(cls)) {
            Type type = parameterizedType.getActualTypeArguments()[0];
            if (!(obj instanceof List)) {
                throw deserializeError(c10894b.f70296a, "Expected a List, but got a " + obj.getClass());
            }
            List list = (List) obj;
            ?? r0 = (T) new ArrayList(list.size());
            while (i < list.size()) {
                r0.add(deserializeToType(list.get(i), type, c10894b.m19409a(c10894b.f70296a.m19410a("[" + i + "]"))));
                i++;
            }
            return r0;
        }
        if (!Map.class.isAssignableFrom(cls)) {
            if (Collection.class.isAssignableFrom(cls)) {
                throw deserializeError(c10894b.f70296a, "Collections are not supported, please use Lists instead");
            }
            Map<String, Object> mapExpectMap = expectMap(obj, c10894b);
            C10893a c10893aLoadOrCreateBeanMapperForClass = loadOrCreateBeanMapperForClass(cls);
            HashMap map = new HashMap();
            TypeVariable<Class<T>>[] typeParameters = c10893aLoadOrCreateBeanMapperForClass.f70286a.getTypeParameters();
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            if (actualTypeArguments.length != typeParameters.length) {
                throw new IllegalStateException("Mismatched lengths for type variables and actual types");
            }
            while (i < typeParameters.length) {
                map.put(typeParameters[i], actualTypeArguments[i]);
                i++;
            }
            return (T) c10893aLoadOrCreateBeanMapperForClass.m19407d(mapExpectMap, map, c10894b);
        }
        Type type2 = parameterizedType.getActualTypeArguments()[0];
        Type type3 = parameterizedType.getActualTypeArguments()[1];
        if (!type2.equals(String.class)) {
            throw deserializeError(c10894b.f70296a, "Only Maps with string keys are supported, but found Map with key type " + type2);
        }
        Map<String, Object> mapExpectMap2 = expectMap(obj, c10894b);
        ?? r02 = (T) new HashMap();
        for (Map.Entry<String, Object> entry : mapExpectMap2.entrySet()) {
            r02.put(entry.getKey(), deserializeToType(entry.getValue(), type3, c10894b.m19409a(c10894b.f70296a.m19410a(entry.getKey()))));
        }
        return r02;
    }

    private static <T> T deserializeToPrimitive(Object obj, Class<T> cls, C10894b c10894b) {
        if (Integer.class.isAssignableFrom(cls) || Integer.TYPE.isAssignableFrom(cls)) {
            return (T) convertInteger(obj, c10894b);
        }
        if (Boolean.class.isAssignableFrom(cls) || Boolean.TYPE.isAssignableFrom(cls)) {
            return (T) convertBoolean(obj, c10894b);
        }
        if (Double.class.isAssignableFrom(cls) || Double.TYPE.isAssignableFrom(cls)) {
            return (T) convertDouble(obj, c10894b);
        }
        if (Long.class.isAssignableFrom(cls) || Long.TYPE.isAssignableFrom(cls)) {
            return (T) convertLong(obj, c10894b);
        }
        if (Float.class.isAssignableFrom(cls) || Float.TYPE.isAssignableFrom(cls)) {
            return (T) Float.valueOf(convertDouble(obj, c10894b).floatValue());
        }
        throw deserializeError(c10894b.f70296a, String.format("Deserializing values to %s is not supported", cls.getSimpleName()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T> T deserializeToType(Object obj, Type type, C10894b c10894b) {
        if (obj == null) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            return (T) deserializeToParameterizedType(obj, (ParameterizedType) type, c10894b);
        }
        if (type instanceof Class) {
            return (T) deserializeToClass(obj, (Class) type, c10894b);
        }
        if (type instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) type;
            if (wildcardType.getLowerBounds().length > 0) {
                throw deserializeError(c10894b.f70296a, "Generic lower-bounded wildcard types are not supported");
            }
            Type[] upperBounds = wildcardType.getUpperBounds();
            hardAssert(upperBounds.length > 0, "Unexpected type bounds on wildcard " + type);
            return (T) deserializeToType(obj, upperBounds[0], c10894b);
        }
        if (type instanceof TypeVariable) {
            Type[] bounds = ((TypeVariable) type).getBounds();
            hardAssert(bounds.length > 0, "Unexpected type bounds on type variable " + type);
            return (T) deserializeToType(obj, bounds[0], c10894b);
        }
        if (type instanceof GenericArrayType) {
            throw deserializeError(c10894b.f70296a, "Generic Arrays are not supported, please use Lists instead");
        }
        throw deserializeError(c10894b.f70296a, "Unknown type encountered: " + type);
    }

    private static Map<String, Object> expectMap(Object obj, C10894b c10894b) {
        if (obj instanceof Map) {
            return (Map) obj;
        }
        throw deserializeError(c10894b.f70296a, "Expected a Map while deserializing, but got a " + obj.getClass());
    }

    private static void hardAssert(boolean z) {
        hardAssert(z, "Internal inconsistency");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <T> C10893a<T> loadOrCreateBeanMapperForClass(Class<T> cls) {
        ConcurrentMap<Class<?>, C10893a<?>> concurrentMap = f70285b;
        C10893a<T> c10893a = (C10893a) concurrentMap.get(cls);
        if (c10893a != null) {
            return c10893a;
        }
        C10893a<T> c10893a2 = (C10893a<T>) new C10893a(cls);
        concurrentMap.put((Class<?>) cls, (C10893a<?>) c10893a2);
        return c10893a2;
    }

    private static <T> Object serialize(T t) {
        return serialize(t, C10895c.f70298d);
    }

    private static IllegalArgumentException serializeError(C10895c c10895c, String str) {
        String str2 = "Could not serialize object. " + str;
        if (c10895c.m19411b() > 0) {
            str2 = str2 + " (found in field '" + c10895c.toString() + "')";
        }
        return new IllegalArgumentException(str2);
    }

    /* JADX INFO: renamed from: pc3$a */
    public static class C10893a<T> {

        /* JADX INFO: renamed from: a */
        public final Class<T> f70286a;

        /* JADX INFO: renamed from: b */
        public final Constructor<T> f70287b;

        /* JADX INFO: renamed from: c */
        public final boolean f70288c;

        /* JADX INFO: renamed from: d */
        public final boolean f70289d;

        /* JADX INFO: renamed from: e */
        public final Map<String, String> f70290e = new HashMap();

        /* JADX INFO: renamed from: g */
        public final Map<String, Method> f70292g = new HashMap();

        /* JADX INFO: renamed from: f */
        public final Map<String, Method> f70291f = new HashMap();

        /* JADX INFO: renamed from: h */
        public final Map<String, Field> f70293h = new HashMap();

        /* JADX INFO: renamed from: i */
        public final HashSet<String> f70294i = new HashSet<>();

        /* JADX INFO: renamed from: j */
        public final HashSet<String> f70295j = new HashSet<>();

        public C10893a(Class<T> cls) {
            this.f70286a = cls;
            this.f70288c = cls.isAnnotationPresent(wyg.class);
            this.f70289d = !cls.isAnnotationPresent(tr7.class);
            Constructor<T> constructor = null;
            try {
                Constructor<T> declaredConstructor = cls.getDeclaredConstructor(null);
                declaredConstructor.setAccessible(true);
                constructor = declaredConstructor;
            } catch (NoSuchMethodException unused) {
            }
            this.f70287b = constructor;
            for (Method method : cls.getMethods()) {
                if (shouldIncludeGetter(method)) {
                    String strPropertyName = propertyName(method);
                    addProperty(strPropertyName);
                    method.setAccessible(true);
                    if (this.f70291f.containsKey(strPropertyName)) {
                        throw new RuntimeException("Found conflicting getters for name " + method.getName() + " on class " + cls.getName());
                    }
                    this.f70291f.put(strPropertyName, method);
                    applyGetterAnnotations(method);
                }
            }
            for (Field field : cls.getFields()) {
                if (shouldIncludeField(field)) {
                    addProperty(propertyName(field));
                    applyFieldAnnotations(field);
                }
            }
            HashMap map = new HashMap();
            Class<T> superclass = cls;
            do {
                for (Method method2 : superclass.getDeclaredMethods()) {
                    if (shouldIncludeSetter(method2)) {
                        String strPropertyName2 = propertyName(method2);
                        String str = this.f70290e.get(strPropertyName2.toLowerCase(Locale.US));
                        if (str == null) {
                            continue;
                        } else {
                            if (!str.equals(strPropertyName2)) {
                                throw new RuntimeException("Found setter on " + superclass.getName() + " with invalid case-sensitive name: " + method2.getName());
                            }
                            if (method2.isBridge()) {
                                map.put(strPropertyName2, method2);
                            } else {
                                Method method3 = this.f70292g.get(strPropertyName2);
                                Method method4 = (Method) map.get(strPropertyName2);
                                if (method3 == null) {
                                    method2.setAccessible(true);
                                    this.f70292g.put(strPropertyName2, method2);
                                    applySetterAnnotations(method2);
                                } else if (!isSetterOverride(method2, method3) && (method4 == null || !isSetterOverride(method2, method4))) {
                                    if (superclass == cls) {
                                        throw new RuntimeException("Class " + cls.getName() + " has multiple setter overloads with name " + method2.getName());
                                    }
                                    throw new RuntimeException("Found conflicting setters with name: " + method2.getName() + " (conflicts with " + method3.getName() + " defined on " + method3.getDeclaringClass().getName() + c0b.f15434d);
                                }
                            }
                        }
                    }
                }
                for (Field field2 : superclass.getDeclaredFields()) {
                    String strPropertyName3 = propertyName(field2);
                    if (this.f70290e.containsKey(strPropertyName3.toLowerCase(Locale.US)) && !this.f70293h.containsKey(strPropertyName3)) {
                        field2.setAccessible(true);
                        this.f70293h.put(strPropertyName3, field2);
                        applyFieldAnnotations(field2);
                    }
                }
                superclass = superclass.getSuperclass();
                if (superclass == null) {
                    break;
                }
            } while (!superclass.equals(Object.class));
            if (this.f70290e.isEmpty()) {
                throw new RuntimeException("No properties to serialize found on class " + cls.getName());
            }
            for (String str2 : this.f70295j) {
                if (!this.f70292g.containsKey(str2) && !this.f70293h.containsKey(str2)) {
                    throw new RuntimeException("@DocumentId is annotated on property " + str2 + " of class " + cls.getName() + " but no field or public setter was found");
                }
            }
        }

        private void addProperty(String str) {
            Map<String, String> map = this.f70290e;
            Locale locale = Locale.US;
            String strPut = map.put(str.toLowerCase(locale), str);
            if (strPut == null || str.equals(strPut)) {
                return;
            }
            throw new RuntimeException("Found two getters or fields with conflicting case sensitivity for property: " + str.toLowerCase(locale));
        }

        private static String annotatedName(AccessibleObject accessibleObject) {
            if (accessibleObject.isAnnotationPresent(hgd.class)) {
                return ((hgd) accessibleObject.getAnnotation(hgd.class)).value();
            }
            return null;
        }

        private void applyFieldAnnotations(Field field) {
            if (field.isAnnotationPresent(z3f.class)) {
                Class<?> type = field.getType();
                if (type != Date.class && type != Timestamp.class) {
                    throw new IllegalArgumentException("Field " + field.getName() + " is annotated with @ServerTimestamp but is " + type + " instead of Date or Timestamp.");
                }
                this.f70294i.add(propertyName(field));
            }
            if (field.isAnnotationPresent(ai4.class)) {
                ensureValidDocumentIdType("Field", "is", field.getType());
                this.f70295j.add(propertyName(field));
            }
        }

        private void applyGetterAnnotations(Method method) {
            if (method.isAnnotationPresent(z3f.class)) {
                Class<?> returnType = method.getReturnType();
                if (returnType != Date.class && returnType != Timestamp.class) {
                    throw new IllegalArgumentException("Method " + method.getName() + " is annotated with @ServerTimestamp but returns " + returnType + " instead of Date or Timestamp.");
                }
                this.f70294i.add(propertyName(method));
            }
            if (method.isAnnotationPresent(ai4.class)) {
                ensureValidDocumentIdType("Method", "returns", method.getReturnType());
                this.f70295j.add(propertyName(method));
            }
        }

        private void applySetterAnnotations(Method method) {
            if (method.isAnnotationPresent(z3f.class)) {
                throw new IllegalArgumentException("Method " + method.getName() + " is annotated with @ServerTimestamp but should not be. @ServerTimestamp can only be applied to fields and getters, not setters.");
            }
            if (method.isAnnotationPresent(ai4.class)) {
                ensureValidDocumentIdType("Method", "accepts", method.getParameterTypes()[0]);
                this.f70295j.add(propertyName(method));
            }
        }

        private void ensureValidDocumentIdType(String str, String str2, Type type) {
            if (type == String.class || type == C3597c.class) {
                return;
            }
            throw new IllegalArgumentException(str + " is annotated with @DocumentId but " + str2 + C2473f.f17566z + type + " instead of String or DocumentReference.");
        }

        private static boolean isSetterOverride(Method method, Method method2) {
            pc3.hardAssert(method.getDeclaringClass().isAssignableFrom(method2.getDeclaringClass()), "Expected override from a base class");
            Class<?> returnType = method.getReturnType();
            Class cls = Void.TYPE;
            pc3.hardAssert(returnType.equals(cls), "Expected void return type");
            pc3.hardAssert(method2.getReturnType().equals(cls), "Expected void return type");
            Class<?>[] parameterTypes = method.getParameterTypes();
            Class<?>[] parameterTypes2 = method2.getParameterTypes();
            pc3.hardAssert(parameterTypes.length == 1, "Expected exactly one parameter");
            pc3.hardAssert(parameterTypes2.length == 1, "Expected exactly one parameter");
            return method.getName().equals(method2.getName()) && parameterTypes[0].equals(parameterTypes2[0]);
        }

        private void populateDocumentIdProperties(Map<TypeVariable<Class<T>>, Type> map, C10894b c10894b, T t, HashSet<String> hashSet) {
            for (String str : this.f70295j) {
                if (hashSet.contains(str)) {
                    throw new RuntimeException("'" + str + "' was found from document " + c10894b.f70297b.getPath() + ", cannot apply @DocumentId on this property for class " + this.f70286a.getName());
                }
                C10895c c10895cM19410a = c10894b.f70296a.m19410a(str);
                if (this.f70292g.containsKey(str)) {
                    Method method = this.f70292g.get(str);
                    Type[] genericParameterTypes = method.getGenericParameterTypes();
                    if (genericParameterTypes.length != 1) {
                        throw pc3.deserializeError(c10895cM19410a, "Setter does not have exactly one parameter");
                    }
                    if (resolveType(genericParameterTypes[0], map) == String.class) {
                        n10.m17718a(method, t, c10894b.f70297b.getId());
                    } else {
                        n10.m17718a(method, t, c10894b.f70297b);
                    }
                } else {
                    Field field = this.f70293h.get(str);
                    try {
                        if (field.getType() == String.class) {
                            field.set(t, c10894b.f70297b.getId());
                        } else {
                            field.set(t, c10894b.f70297b);
                        }
                    } catch (IllegalAccessException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static String propertyName(Field field) {
            String strAnnotatedName = annotatedName(field);
            return strAnnotatedName != null ? strAnnotatedName : field.getName();
        }

        private Type resolveType(Type type, Map<TypeVariable<Class<T>>, Type> map) {
            if (!(type instanceof TypeVariable)) {
                return type;
            }
            Type type2 = map.get(type);
            if (type2 != null) {
                return type2;
            }
            throw new IllegalStateException("Could not resolve type " + type);
        }

        private static String serializedName(String str) {
            String[] strArr = {"get", "set", "is"};
            String str2 = null;
            for (int i = 0; i < 3; i++) {
                String str3 = strArr[i];
                if (str.startsWith(str3)) {
                    str2 = str3;
                }
            }
            if (str2 == null) {
                throw new IllegalArgumentException("Unknown Bean prefix for method: " + str);
            }
            char[] charArray = str.substring(str2.length()).toCharArray();
            for (int i2 = 0; i2 < charArray.length && Character.isUpperCase(charArray[i2]); i2++) {
                charArray[i2] = Character.toLowerCase(charArray[i2]);
            }
            return new String(charArray);
        }

        private static boolean shouldIncludeField(Field field) {
            return (field.getDeclaringClass().equals(Object.class) || !Modifier.isPublic(field.getModifiers()) || Modifier.isStatic(field.getModifiers()) || Modifier.isTransient(field.getModifiers()) || field.isAnnotationPresent(b85.class)) ? false : true;
        }

        private static boolean shouldIncludeGetter(Method method) {
            return ((!method.getName().startsWith("get") && !method.getName().startsWith("is")) || method.getDeclaringClass().equals(Object.class) || !Modifier.isPublic(method.getModifiers()) || Modifier.isStatic(method.getModifiers()) || method.getReturnType().equals(Void.TYPE) || method.getParameterTypes().length != 0 || method.isBridge() || method.isAnnotationPresent(b85.class)) ? false : true;
        }

        private static boolean shouldIncludeSetter(Method method) {
            return method.getName().startsWith("set") && !method.getDeclaringClass().equals(Object.class) && !Modifier.isStatic(method.getModifiers()) && method.getReturnType().equals(Void.TYPE) && method.getParameterTypes().length == 1 && !method.isAnnotationPresent(b85.class);
        }

        /* JADX INFO: renamed from: c */
        public T m19406c(Map<String, Object> map, C10894b c10894b) {
            return m19407d(map, Collections.emptyMap(), c10894b);
        }

        /* JADX INFO: renamed from: d */
        public T m19407d(Map<String, Object> map, Map<TypeVariable<Class<T>>, Type> map2, C10894b c10894b) {
            Constructor<T> constructor = this.f70287b;
            if (constructor == null) {
                throw pc3.deserializeError(c10894b.f70296a, "Class " + this.f70286a.getName() + " does not define a no-argument constructor. If you are using ProGuard, make sure these constructors are not stripped");
            }
            T t = (T) n10.m17719b(constructor);
            HashSet<String> hashSet = new HashSet<>();
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                String key = entry.getKey();
                C10895c c10895cM19410a = c10894b.f70296a.m19410a(key);
                if (this.f70292g.containsKey(key)) {
                    Method method = this.f70292g.get(key);
                    Type[] genericParameterTypes = method.getGenericParameterTypes();
                    if (genericParameterTypes.length != 1) {
                        throw pc3.deserializeError(c10895cM19410a, "Setter does not have exactly one parameter");
                    }
                    n10.m17718a(method, t, pc3.deserializeToType(entry.getValue(), resolveType(genericParameterTypes[0], map2), c10894b.m19409a(c10895cM19410a)));
                    hashSet.add(key);
                } else if (this.f70293h.containsKey(key)) {
                    Field field = this.f70293h.get(key);
                    try {
                        field.set(t, pc3.deserializeToType(entry.getValue(), resolveType(field.getGenericType(), map2), c10894b.m19409a(c10895cM19410a)));
                        hashSet.add(key);
                    } catch (IllegalAccessException e) {
                        throw new RuntimeException(e);
                    }
                } else {
                    String str = "No setter/field for " + key + " found on class " + this.f70286a.getName();
                    if (this.f70290e.containsKey(key.toLowerCase(Locale.US))) {
                        str = str + " (fields/setters are case sensitive!)";
                    }
                    if (this.f70288c) {
                        throw new RuntimeException(str);
                    }
                    if (this.f70289d) {
                        fj9.warn(pc3.class.getSimpleName(), "%s", str);
                    }
                }
            }
            populateDocumentIdProperties(map2, c10894b, t, hashSet);
            return t;
        }

        /* JADX INFO: renamed from: e */
        public Map<String, Object> m19408e(T t, C10895c c10895c) {
            Object objM17718a;
            if (!this.f70286a.isAssignableFrom(t.getClass())) {
                throw new IllegalArgumentException("Can't serialize object of class " + t.getClass() + " with BeanMapper for class " + this.f70286a);
            }
            HashMap map = new HashMap();
            for (String str : this.f70290e.values()) {
                if (!this.f70295j.contains(str)) {
                    if (this.f70291f.containsKey(str)) {
                        objM17718a = n10.m17718a(this.f70291f.get(str), t, new Object[0]);
                    } else {
                        Field field = this.f70293h.get(str);
                        if (field == null) {
                            throw new IllegalStateException("Bean property without field or getter: " + str);
                        }
                        try {
                            objM17718a = field.get(t);
                        } catch (IllegalAccessException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    map.put(str, (this.f70294i.contains(str) && objM17718a == null) ? fs5.serverTimestamp() : pc3.serialize(objM17718a, c10895c.m19410a(str)));
                }
            }
            return map;
        }

        private static String propertyName(Method method) {
            String strAnnotatedName = annotatedName(method);
            return strAnnotatedName != null ? strAnnotatedName : serializedName(method.getName());
        }
    }

    public static Map<String, Object> convertToPlainJavaTypes(Map<?, Object> map) {
        Object objSerialize = serialize(map);
        hardAssert(objSerialize instanceof Map);
        return (Map) objSerialize;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void hardAssert(boolean z, String str) {
        if (z) {
            return;
        }
        throw new RuntimeException("Hard assert failed: " + str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static <T> Object serialize(T t, C10895c c10895c) {
        if (c10895c.m19411b() > 500) {
            throw serializeError(c10895c, "Exceeded maximum depth of 500, which likely indicates there's an object cycle");
        }
        if (t == 0) {
            return null;
        }
        if (t instanceof Number) {
            if ((t instanceof Long) || (t instanceof Integer) || (t instanceof Double) || (t instanceof Float)) {
                return t;
            }
            throw serializeError(c10895c, String.format("Numbers of type %s are not supported, please use an int, long, float or double", t.getClass().getSimpleName()));
        }
        if ((t instanceof String) || (t instanceof Boolean)) {
            return t;
        }
        if (t instanceof Character) {
            throw serializeError(c10895c, "Characters are not supported, please use Strings");
        }
        if (t instanceof Map) {
            HashMap map = new HashMap();
            for (Map.Entry entry : ((Map) t).entrySet()) {
                Object key = entry.getKey();
                if (!(key instanceof String)) {
                    throw serializeError(c10895c, "Maps with non-string keys are not supported");
                }
                String str = (String) key;
                map.put(str, serialize(entry.getValue(), c10895c.m19410a(str)));
            }
            return map;
        }
        if (!(t instanceof Collection)) {
            if (t.getClass().isArray()) {
                throw serializeError(c10895c, "Serializing Arrays is not supported, please use Lists instead");
            }
            if (!(t instanceof Enum)) {
                return ((t instanceof Date) || (t instanceof Timestamp) || (t instanceof d37) || (t instanceof a61) || (t instanceof C3597c) || (t instanceof fs5) || (t instanceof s3i)) ? t : ((t instanceof Uri) || (t instanceof URI) || (t instanceof URL)) ? t.toString() : loadOrCreateBeanMapperForClass(t.getClass()).m19408e(t, c10895c);
            }
            String strName = ((Enum) t).name();
            try {
                return C10893a.propertyName(t.getClass().getField(strName));
            } catch (NoSuchFieldException unused) {
                return strName;
            }
        }
        if (!(t instanceof List)) {
            throw serializeError(c10895c, "Serializing Collections is not supported, please use Lists instead");
        }
        List list = (List) t;
        ArrayList arrayList = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(serialize(list.get(i), c10895c.m19410a("[" + i + "]")));
        }
        return arrayList;
    }
}
