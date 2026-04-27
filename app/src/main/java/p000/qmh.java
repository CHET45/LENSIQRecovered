package p000;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.security.AccessControlException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Currency;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import p000.ymh;

/* JADX INFO: loaded from: classes3.dex */
public class qmh {

    /* JADX INFO: renamed from: a */
    public static boolean f74946a = false;

    /* JADX INFO: renamed from: b */
    public static boolean f74947b = true;

    /* JADX INFO: renamed from: c */
    public static ConcurrentMap<String, Class<?>> f74948c;

    static {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        f74948c = concurrentHashMap;
        concurrentHashMap.put("byte", Byte.TYPE);
        f74948c.put("short", Short.TYPE);
        f74948c.put("int", Integer.TYPE);
        f74948c.put("long", Long.TYPE);
        f74948c.put(ymh.InterfaceC15723b.f102125c, Float.TYPE);
        f74948c.put("double", Double.TYPE);
        f74948c.put(ymh.InterfaceC15723b.f102128f, Boolean.TYPE);
        f74948c.put("char", Character.TYPE);
        f74948c.put("[byte", byte[].class);
        f74948c.put("[short", short[].class);
        f74948c.put("[int", int[].class);
        f74948c.put("[long", long[].class);
        f74948c.put("[float", float[].class);
        f74948c.put("[double", double[].class);
        f74948c.put("[boolean", boolean[].class);
        f74948c.put("[char", char[].class);
        f74948c.put(HashMap.class.getName(), HashMap.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> T cast(Object obj, Class<T> cls, whc whcVar) {
        Object obj2;
        if (obj == 0) {
            return null;
        }
        if (cls == null) {
            throw new IllegalArgumentException("clazz is null");
        }
        if (cls == obj.getClass()) {
            return obj;
        }
        if (obj instanceof Map) {
            if (cls == Map.class) {
                return obj;
            }
            Map map = (Map) obj;
            return (cls != Object.class || map.containsKey(fh8.f36584c)) ? (T) castToJavaBean(map, cls, whcVar) : obj;
        }
        if (cls.isArray()) {
            if (obj instanceof Collection) {
                Collection collection = (Collection) obj;
                T t = (T) Array.newInstance(cls.getComponentType(), collection.size());
                Iterator it = collection.iterator();
                int i = 0;
                while (it.hasNext()) {
                    Array.set(t, i, cast(it.next(), (Class) cls.getComponentType(), whcVar));
                    i++;
                }
                return t;
            }
            if (cls == byte[].class) {
                return (T) castToBytes(obj);
            }
        }
        if (cls.isAssignableFrom(obj.getClass())) {
            return obj;
        }
        if (cls == Boolean.TYPE || cls == Boolean.class) {
            return (T) castToBoolean(obj);
        }
        if (cls == Byte.TYPE || cls == Byte.class) {
            return (T) castToByte(obj);
        }
        if (cls == Short.TYPE || cls == Short.class) {
            return (T) castToShort(obj);
        }
        if (cls == Integer.TYPE || cls == Integer.class) {
            return (T) castToInt(obj);
        }
        if (cls == Long.TYPE || cls == Long.class) {
            return (T) castToLong(obj);
        }
        if (cls == Float.TYPE || cls == Float.class) {
            return (T) castToFloat(obj);
        }
        if (cls == Double.TYPE || cls == Double.class) {
            return (T) castToDouble(obj);
        }
        if (cls == String.class) {
            return (T) castToString(obj);
        }
        if (cls == BigDecimal.class) {
            return (T) castToBigDecimal(obj);
        }
        if (cls == BigInteger.class) {
            return (T) castToBigInteger(obj);
        }
        if (cls == Date.class) {
            return (T) castToDate(obj);
        }
        if (cls.isEnum()) {
            return (T) castToEnum(obj, cls, whcVar);
        }
        if (Calendar.class.isAssignableFrom(cls)) {
            Date dateCastToDate = castToDate(obj);
            if (cls == Calendar.class) {
                obj2 = (T) Calendar.getInstance(fh8.f36582a, fh8.f36583b);
            } else {
                try {
                    obj2 = (T) ((Calendar) cls.newInstance());
                } catch (Exception e) {
                    throw new jh8("can not cast to : " + cls.getName(), e);
                }
            }
            ((Calendar) obj2).setTime(dateCastToDate);
            return (T) obj2;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (str.length() == 0 || "null".equals(str)) {
                return null;
            }
            if (cls == Currency.class) {
                return (T) Currency.getInstance(str);
            }
        }
        throw new jh8("can not cast to : " + cls.getName());
    }

    public static final BigDecimal castToBigDecimal(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof BigDecimal) {
            return (BigDecimal) obj;
        }
        if (obj instanceof BigInteger) {
            return new BigDecimal((BigInteger) obj);
        }
        String string = obj.toString();
        if (string.length() == 0 || "null".equals(string)) {
            return null;
        }
        return new BigDecimal(string);
    }

    public static final BigInteger castToBigInteger(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof BigInteger) {
            return (BigInteger) obj;
        }
        if ((obj instanceof Float) || (obj instanceof Double)) {
            return BigInteger.valueOf(((Number) obj).longValue());
        }
        String string = obj.toString();
        if (string.length() == 0 || "null".equals(string)) {
            return null;
        }
        return new BigInteger(string);
    }

    public static final Boolean castToBoolean(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof Number) {
            return Boolean.valueOf(((Number) obj).intValue() == 1);
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (str.length() == 0 || "null".equals(str)) {
                return null;
            }
            if ("true".equalsIgnoreCase(str) || "1".equals(str)) {
                return Boolean.TRUE;
            }
            if ("false".equalsIgnoreCase(str) || a43.f347l.equals(str)) {
                return Boolean.FALSE;
            }
        }
        throw new jh8("can not cast to int, value : " + obj);
    }

    public static final Byte castToByte(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Number) {
            return Byte.valueOf(((Number) obj).byteValue());
        }
        if (!(obj instanceof String)) {
            throw new jh8("can not cast to byte, value : " + obj);
        }
        String str = (String) obj;
        if (str.length() == 0 || "null".equals(str)) {
            return null;
        }
        return Byte.valueOf(Byte.parseByte(str));
    }

    public static final byte[] castToBytes(Object obj) {
        if (obj instanceof byte[]) {
            return (byte[]) obj;
        }
        if (obj instanceof String) {
            return lh8.decodeFast((String) obj);
        }
        throw new jh8("can not cast to int, value : " + obj);
    }

    public static final Character castToChar(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Character) {
            return (Character) obj;
        }
        if (!(obj instanceof String)) {
            throw new jh8("can not cast to byte, value : " + obj);
        }
        String str = (String) obj;
        if (str.length() == 0) {
            return null;
        }
        if (str.length() == 1) {
            return Character.valueOf(str.charAt(0));
        }
        throw new jh8("can not cast to byte, value : " + obj);
    }

    public static final Date castToDate(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Calendar) {
            return ((Calendar) obj).getTime();
        }
        if (obj instanceof Date) {
            return (Date) obj;
        }
        long jLongValue = obj instanceof Number ? ((Number) obj).longValue() : -1L;
        if (obj instanceof String) {
            String str = (String) obj;
            if (str.indexOf(45) != -1) {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str.length() == fh8.f36586e.length() ? fh8.f36586e : str.length() == 10 ? "yyyy-MM-dd" : str.length() == 19 ? "yyyy-MM-dd HH:mm:ss" : "yyyy-MM-dd HH:mm:ss.SSS", fh8.f36583b);
                simpleDateFormat.setTimeZone(fh8.f36582a);
                try {
                    return simpleDateFormat.parse(str);
                } catch (ParseException unused) {
                    throw new jh8("can not cast to Date, value : " + str);
                }
            }
            if (str.length() == 0 || "null".equals(str)) {
                return null;
            }
            jLongValue = Long.parseLong(str);
        }
        if (jLongValue >= 0) {
            return new Date(jLongValue);
        }
        throw new jh8("can not cast to Date, value : " + obj);
    }

    public static final Double castToDouble(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Number) {
            return Double.valueOf(((Number) obj).doubleValue());
        }
        if (!(obj instanceof String)) {
            throw new jh8("can not cast to double, value : " + obj);
        }
        String string = obj.toString();
        if (string.length() == 0 || "null".equals(string)) {
            return null;
        }
        return Double.valueOf(Double.parseDouble(string));
    }

    public static final <T> T castToEnum(Object obj, Class<T> cls, whc whcVar) {
        try {
            if (obj instanceof String) {
                String str = (String) obj;
                if (str.length() == 0) {
                    return null;
                }
                return (T) Enum.valueOf(cls, str);
            }
            if (obj instanceof Number) {
                int iIntValue = ((Number) obj).intValue();
                T[] enumConstants = cls.getEnumConstants();
                if (iIntValue < enumConstants.length) {
                    return enumConstants[iIntValue];
                }
            }
            throw new jh8("can not cast to : " + cls.getName());
        } catch (Exception e) {
            throw new jh8("can not cast to : " + cls.getName(), e);
        }
    }

    public static final Float castToFloat(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Number) {
            return Float.valueOf(((Number) obj).floatValue());
        }
        if (!(obj instanceof String)) {
            throw new jh8("can not cast to float, value : " + obj);
        }
        String string = obj.toString();
        if (string.length() == 0 || "null".equals(string)) {
            return null;
        }
        return Float.valueOf(Float.parseFloat(string));
    }

    public static final Integer castToInt(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Integer) {
            return (Integer) obj;
        }
        if (obj instanceof Number) {
            return Integer.valueOf(((Number) obj).intValue());
        }
        if (!(obj instanceof String)) {
            throw new jh8("can not cast to int, value : " + obj);
        }
        String str = (String) obj;
        if (str.length() == 0 || "null".equals(str)) {
            return null;
        }
        return Integer.valueOf(Integer.parseInt(str));
    }

    public static final <T> T castToJavaBean(Object obj, Class<T> cls) {
        return (T) cast(obj, (Class) cls, whc.f94265e);
    }

    public static final Long castToLong(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Number) {
            return Long.valueOf(((Number) obj).longValue());
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (str.length() == 0 || "null".equals(str)) {
                return null;
            }
            try {
                return Long.valueOf(Long.parseLong(str));
            } catch (NumberFormatException unused) {
                lh8 lh8Var = new lh8(str);
                Calendar calendar = lh8Var.scanISO8601DateIfMatch(false) ? lh8Var.getCalendar() : null;
                lh8Var.close();
                if (calendar != null) {
                    return Long.valueOf(calendar.getTimeInMillis());
                }
            }
        }
        throw new jh8("can not cast to long, value : " + obj);
    }

    public static final Short castToShort(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Number) {
            return Short.valueOf(((Number) obj).shortValue());
        }
        if (!(obj instanceof String)) {
            throw new jh8("can not cast to short, value : " + obj);
        }
        String str = (String) obj;
        if (str.length() == 0 || "null".equals(str)) {
            return null;
        }
        return Short.valueOf(Short.parseShort(str));
    }

    public static final String castToString(Object obj) {
        if (obj == null) {
            return null;
        }
        return obj.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:130:0x02eb, code lost:
    
        if (r0 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01e3, code lost:
    
        if (r0 == null) goto L77;
     */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x046f  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0482  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00fb A[PHI: r12 r24 r25 r28 r29 r30 r31
  0x00fb: PHI (r12v14 java.util.LinkedHashMap) = 
  (r12v9 java.util.LinkedHashMap)
  (r12v9 java.util.LinkedHashMap)
  (r12v9 java.util.LinkedHashMap)
  (r12v9 java.util.LinkedHashMap)
  (r12v9 java.util.LinkedHashMap)
  (r12v17 java.util.LinkedHashMap)
 binds: [B:47:0x0133, B:49:0x013b, B:62:0x0184, B:64:0x018e, B:67:0x019c, B:40:0x00bf] A[DONT_GENERATE, DONT_INLINE]
  0x00fb: PHI (r24v5 int) = (r24v4 int), (r24v4 int), (r24v4 int), (r24v4 int), (r24v4 int), (r24v8 int) binds: [B:47:0x0133, B:49:0x013b, B:62:0x0184, B:64:0x018e, B:67:0x019c, B:40:0x00bf] A[DONT_GENERATE, DONT_INLINE]
  0x00fb: PHI (r25v5 java.lang.reflect.Method[]) = 
  (r25v4 java.lang.reflect.Method[])
  (r25v4 java.lang.reflect.Method[])
  (r25v4 java.lang.reflect.Method[])
  (r25v4 java.lang.reflect.Method[])
  (r25v4 java.lang.reflect.Method[])
  (r25v8 java.lang.reflect.Method[])
 binds: [B:47:0x0133, B:49:0x013b, B:62:0x0184, B:64:0x018e, B:67:0x019c, B:40:0x00bf] A[DONT_GENERATE, DONT_INLINE]
  0x00fb: PHI (r28v5 int) = (r28v4 int), (r28v4 int), (r28v4 int), (r28v4 int), (r28v4 int), (r28v7 int) binds: [B:47:0x0133, B:49:0x013b, B:62:0x0184, B:64:0x018e, B:67:0x019c, B:40:0x00bf] A[DONT_GENERATE, DONT_INLINE]
  0x00fb: PHI (r29v2 java.lang.Class<kh8>) = 
  (r29v1 java.lang.Class<kh8>)
  (r29v1 java.lang.Class<kh8>)
  (r29v1 java.lang.Class<kh8>)
  (r29v1 java.lang.Class<kh8>)
  (r29v1 java.lang.Class<kh8>)
  (r29v4 java.lang.Class<kh8>)
 binds: [B:47:0x0133, B:49:0x013b, B:62:0x0184, B:64:0x018e, B:67:0x019c, B:40:0x00bf] A[DONT_GENERATE, DONT_INLINE]
  0x00fb: PHI (r30v8 java.lang.Class<? super ?>) = 
  (r30v7 java.lang.Class<? super ?>)
  (r30v7 java.lang.Class<? super ?>)
  (r30v7 java.lang.Class<? super ?>)
  (r30v7 java.lang.Class<? super ?>)
  (r30v7 java.lang.Class<? super ?>)
  (r30v10 java.lang.Class<? super ?>)
 binds: [B:47:0x0133, B:49:0x013b, B:62:0x0184, B:64:0x018e, B:67:0x019c, B:40:0x00bf] A[DONT_GENERATE, DONT_INLINE]
  0x00fb: PHI (r31v2 java.lang.reflect.Field[]) = 
  (r31v1 java.lang.reflect.Field[])
  (r31v1 java.lang.reflect.Field[])
  (r31v1 java.lang.reflect.Field[])
  (r31v1 java.lang.reflect.Field[])
  (r31v1 java.lang.reflect.Field[])
  (r31v4 java.lang.reflect.Field[])
 binds: [B:47:0x0133, B:49:0x013b, B:62:0x0184, B:64:0x018e, B:67:0x019c, B:40:0x00bf] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.List<p000.kr5> computeGetters(java.lang.Class<?> r39, int r40, boolean r41, p000.th8 r42, java.util.Map<java.lang.String, java.lang.String> r43, boolean r44, boolean r45, boolean r46, p000.igd r47) {
        /*
            Method dump skipped, instruction units count: 1184
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.qmh.computeGetters(java.lang.Class, int, boolean, th8, java.util.Map, boolean, boolean, boolean, igd):java.util.List");
    }

    public static String decapitalize(String str) {
        if (str == null || str.length() == 0 || (str.length() > 1 && Character.isUpperCase(str.charAt(1)) && Character.isUpperCase(str.charAt(0)))) {
            return str;
        }
        char[] charArray = str.toCharArray();
        charArray[0] = Character.toLowerCase(charArray[0]);
        return new String(charArray);
    }

    public static Class<?> getClass(Type type) {
        return type.getClass() == Class.class ? (Class) type : type instanceof ParameterizedType ? getClass(((ParameterizedType) type).getRawType()) : type instanceof TypeVariable ? (Class) ((TypeVariable) type).getBounds()[0] : Object.class;
    }

    public static Field getField(Class<?> cls, String str, Field[] fieldArr) {
        Field field0 = getField0(cls, str, fieldArr);
        if (field0 == null) {
            field0 = getField0(cls, p43.f69617m + str, fieldArr);
        }
        if (field0 == null) {
            field0 = getField0(cls, "m_" + str, fieldArr);
        }
        if (field0 != null) {
            return field0;
        }
        return getField0(cls, "m" + str.substring(0, 1).toUpperCase() + str.substring(1), fieldArr);
    }

    private static Field getField0(Class<?> cls, String str, Field[] fieldArr) {
        for (Field field : fieldArr) {
            if (str.equals(field.getName())) {
                return field;
            }
        }
        Class<? super Object> superclass = cls.getSuperclass();
        if (superclass == null || superclass == Object.class) {
            return null;
        }
        return getField(superclass, str, superclass.getDeclaredFields());
    }

    public static Type getGenericParamType(Type type) {
        return type instanceof Class ? getGenericParamType(((Class) type).getGenericSuperclass()) : type;
    }

    public static kh8 getSupperMethodAnnotation(Class<?> cls, Method method) {
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Method method2 : cls2.getMethods()) {
                if (method2.getName().equals(method.getName())) {
                    Class<?>[] parameterTypes = method2.getParameterTypes();
                    Class<?>[] parameterTypes2 = method.getParameterTypes();
                    if (parameterTypes.length != parameterTypes2.length) {
                        continue;
                    } else {
                        int i = 0;
                        while (true) {
                            if (i >= parameterTypes.length) {
                                kh8 kh8Var = (kh8) method2.getAnnotation(kh8.class);
                                if (kh8Var != null) {
                                    return kh8Var;
                                }
                            } else {
                                if (!parameterTypes[i].equals(parameterTypes2[i])) {
                                    break;
                                }
                                i++;
                            }
                        }
                    }
                }
            }
        }
        Class<? super Object> superclass = cls.getSuperclass();
        if (superclass != null && Modifier.isAbstract(superclass.getModifiers())) {
            Class<?>[] parameterTypes3 = method.getParameterTypes();
            for (Method method3 : superclass.getMethods()) {
                Class<?>[] parameterTypes4 = method3.getParameterTypes();
                if (parameterTypes4.length == parameterTypes3.length && method3.getName().equals(method.getName())) {
                    int i2 = 0;
                    while (true) {
                        if (i2 >= parameterTypes3.length) {
                            kh8 kh8Var2 = (kh8) method3.getAnnotation(kh8.class);
                            if (kh8Var2 != null) {
                                return kh8Var2;
                            }
                        } else {
                            if (!parameterTypes4[i2].equals(parameterTypes3[i2])) {
                                break;
                            }
                            i2++;
                        }
                    }
                }
            }
        }
        return null;
    }

    public static boolean isGenericParamType(Type type) {
        if (type instanceof ParameterizedType) {
            return true;
        }
        if (!(type instanceof Class)) {
            return false;
        }
        Type genericSuperclass = ((Class) type).getGenericSuperclass();
        return genericSuperclass != Object.class && isGenericParamType(genericSuperclass);
    }

    private static boolean isJSONTypeIgnore(Class<?> cls, th8 th8Var, String str) {
        if (th8Var != null && th8Var.ignores() != null) {
            for (String str2 : th8Var.ignores()) {
                if (str.equalsIgnoreCase(str2)) {
                    return true;
                }
            }
        }
        Class<? super Object> superclass = cls.getSuperclass();
        return (superclass == Object.class || superclass == null || !isJSONTypeIgnore(superclass, (th8) superclass.getAnnotation(th8.class), str)) ? false : true;
    }

    public static Class<?> loadClass(String str, ClassLoader classLoader) {
        if (str == null || str.length() == 0) {
            return null;
        }
        Class<?> cls = f74948c.get(str);
        if (cls != null) {
            return cls;
        }
        if (str.charAt(0) == '[') {
            return Array.newInstance(loadClass(str.substring(1), classLoader), 0).getClass();
        }
        if (str.startsWith("L") && str.endsWith(";")) {
            return loadClass(str.substring(1, str.length() - 1), classLoader);
        }
        if (classLoader != null) {
            try {
                cls = classLoader.loadClass(str);
                f74948c.put(str, cls);
                return cls;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        try {
            ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
            if (contextClassLoader != null) {
                cls = contextClassLoader.loadClass(str);
                f74948c.put(str, cls);
                return cls;
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        try {
            cls = Class.forName(str);
            f74948c.put(str, cls);
            return cls;
        } catch (Exception e3) {
            e3.printStackTrace();
            return cls;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean setAccessible(Class<?> cls, Member member, int i) {
        if (member != 0 && f74947b) {
            Class<? super Object> superclass = cls.getSuperclass();
            if ((superclass == null || superclass == Object.class) && (member.getModifiers() & 1) != 0 && (i & 1) != 0) {
                return false;
            }
            try {
                ((AccessibleObject) member).setAccessible(true);
                return true;
            } catch (AccessControlException unused) {
                f74947b = false;
            }
        }
        return false;
    }

    public static final <T> T castToJavaBean(Map<String, Object> map, Class<T> cls, whc whcVar) {
        try {
            if (cls == StackTraceElement.class) {
                String str = (String) map.get("className");
                String str2 = (String) map.get("methodName");
                String str3 = (String) map.get("fileName");
                Number number = (Number) map.get("lineNumber");
                return (T) new StackTraceElement(str, str2, str3, number == null ? 0 : number.intValue());
            }
            Object obj = map.get(fh8.f36584c);
            if (obj instanceof String) {
                String str4 = (String) obj;
                Class<?> clsLoadClass = loadClass(str4, null);
                if (clsLoadClass == null) {
                    throw new ClassNotFoundException(str4 + " not found");
                }
                if (!clsLoadClass.equals(cls)) {
                    return (T) castToJavaBean(map, clsLoadClass, whcVar);
                }
            }
            if (cls.isInterface()) {
                return (T) Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), new Class[]{cls}, map instanceof mh8 ? (mh8) map : new mh8(map));
            }
            if (whcVar == null) {
                whcVar = whc.f94265e;
            }
            sjb deserializer = whcVar.getDeserializer(cls);
            ni8 ni8Var = deserializer instanceof ni8 ? (ni8) deserializer : null;
            if (ni8Var != null) {
                return (T) ni8Var.createInstance(map, whcVar);
            }
            throw new jh8("can not get javaBeanDeserializer");
        } catch (Exception e) {
            throw new jh8(e.getMessage(), e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> T cast(Object obj, Type type, whc whcVar) {
        if (obj == 0) {
            return null;
        }
        if (type instanceof Class) {
            return (T) cast(obj, (Class) type, whcVar);
        }
        if (type instanceof ParameterizedType) {
            return (T) cast(obj, (ParameterizedType) type, whcVar);
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (str.length() == 0 || "null".equals(str)) {
                return null;
            }
        }
        if (type instanceof TypeVariable) {
            return obj;
        }
        throw new jh8("can not cast to : " + type);
    }

    /* JADX WARN: Type inference failed for: r8v5, types: [T, java.util.HashMap, java.util.Map] */
    public static final <T> T cast(Object obj, ParameterizedType parameterizedType, whc whcVar) {
        T t;
        Type rawType = parameterizedType.getRawType();
        if (rawType == Set.class || rawType == HashSet.class || rawType == TreeSet.class || rawType == List.class || rawType == ArrayList.class) {
            Type type = parameterizedType.getActualTypeArguments()[0];
            if (obj instanceof Iterable) {
                if (rawType != Set.class && rawType != HashSet.class) {
                    if (rawType == TreeSet.class) {
                        t = (T) new TreeSet();
                    } else {
                        t = (T) new ArrayList();
                    }
                } else {
                    t = (T) new HashSet();
                }
                Iterator<T> it = ((Iterable) obj).iterator();
                while (it.hasNext()) {
                    ((Collection) t).add(cast(it.next(), type, whcVar));
                }
                return t;
            }
        }
        if (rawType == Map.class || rawType == HashMap.class) {
            Type type2 = parameterizedType.getActualTypeArguments()[0];
            Type type3 = parameterizedType.getActualTypeArguments()[1];
            if (obj instanceof Map) {
                ?? r8 = (T) new HashMap();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    r8.put(cast(entry.getKey(), type2, whcVar), cast(entry.getValue(), type3, whcVar));
                }
                return r8;
            }
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (str.length() == 0 || "null".equals(str)) {
                return null;
            }
        }
        if (parameterizedType.getActualTypeArguments().length == 1 && (parameterizedType.getActualTypeArguments()[0] instanceof WildcardType)) {
            return (T) cast(obj, rawType, whcVar);
        }
        throw new jh8("can not cast to : " + parameterizedType);
    }
}
