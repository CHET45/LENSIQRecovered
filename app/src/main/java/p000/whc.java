package p000;

import java.io.Closeable;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.URI;
import java.net.URL;
import java.nio.charset.Charset;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Currency;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.TreeMap;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public class whc {

    /* JADX INFO: renamed from: e */
    public static whc f94265e = new whc();

    /* JADX INFO: renamed from: a */
    public final qr7<sjb> f94266a;

    /* JADX INFO: renamed from: b */
    public final rhg f94267b;

    /* JADX INFO: renamed from: c */
    public ClassLoader f94268c;

    /* JADX INFO: renamed from: d */
    public igd f94269d;

    public whc() {
        qr7<sjb> qr7Var = new qr7<>(1024);
        this.f94266a = qr7Var;
        this.f94267b = new rhg(16384);
        zva zvaVar = zva.f106146a;
        qr7Var.put(SimpleDateFormat.class, zvaVar);
        cj3 cj3Var = cj3.f16683a;
        qr7Var.put(Date.class, cj3Var);
        qr7Var.put(Calendar.class, cj3Var);
        qr7Var.put(Map.class, is9.f48123a);
        qr7Var.put(HashMap.class, is9.f48123a);
        qr7Var.put(LinkedHashMap.class, is9.f48123a);
        qr7Var.put(TreeMap.class, is9.f48123a);
        qr7Var.put(ConcurrentMap.class, is9.f48123a);
        qr7Var.put(ConcurrentHashMap.class, is9.f48123a);
        t72 t72Var = t72.f83919a;
        qr7Var.put(Collection.class, t72Var);
        qr7Var.put(List.class, t72Var);
        qr7Var.put(ArrayList.class, t72Var);
        xi8 xi8Var = xi8.f98075a;
        qr7Var.put(Object.class, xi8Var);
        qr7Var.put(String.class, k7g.f52747a);
        qr7Var.put(Character.TYPE, zvaVar);
        qr7Var.put(Character.class, zvaVar);
        Class cls = Byte.TYPE;
        xib xibVar = xib.f98087b;
        qr7Var.put(cls, xibVar);
        qr7Var.put(Byte.class, xibVar);
        qr7Var.put(Short.TYPE, xibVar);
        qr7Var.put(Short.class, xibVar);
        qr7Var.put(Integer.TYPE, b88.f12963a);
        qr7Var.put(Integer.class, b88.f12963a);
        qr7Var.put(Long.TYPE, b88.f12963a);
        qr7Var.put(Long.class, b88.f12963a);
        q11 q11Var = q11.f72739a;
        qr7Var.put(BigInteger.class, q11Var);
        qr7Var.put(BigDecimal.class, q11Var);
        qr7Var.put(Float.TYPE, xibVar);
        qr7Var.put(Float.class, xibVar);
        qr7Var.put(Double.TYPE, xibVar);
        qr7Var.put(Double.class, xibVar);
        Class cls2 = Boolean.TYPE;
        ua1 ua1Var = ua1.f87249a;
        qr7Var.put(cls2, ua1Var);
        qr7Var.put(Boolean.class, ua1Var);
        qr7Var.put(Class.class, zvaVar);
        u50 u50Var = u50.f86828a;
        qr7Var.put(char[].class, u50Var);
        qr7Var.put(Object[].class, u50Var);
        qr7Var.put(UUID.class, zvaVar);
        qr7Var.put(TimeZone.class, zvaVar);
        qr7Var.put(Locale.class, zvaVar);
        qr7Var.put(Currency.class, zvaVar);
        qr7Var.put(URI.class, zvaVar);
        qr7Var.put(URL.class, zvaVar);
        qr7Var.put(Pattern.class, zvaVar);
        qr7Var.put(Charset.class, zvaVar);
        qr7Var.put(Number.class, xibVar);
        qr7Var.put(StackTraceElement.class, zvaVar);
        qr7Var.put(Serializable.class, xi8Var);
        qr7Var.put(Cloneable.class, xi8Var);
        qr7Var.put(Comparable.class, xi8Var);
        qr7Var.put(Closeable.class, xi8Var);
    }

    public static whc getGlobalInstance() {
        return f94265e;
    }

    public static boolean isPrimitive(Class<?> cls) {
        return cls.isPrimitive() || cls == Boolean.class || cls == Character.class || cls == Byte.class || cls == Short.class || cls == Integer.class || cls == Long.class || cls == Float.class || cls == Double.class || cls == BigInteger.class || cls == BigDecimal.class || cls == String.class || cls == Date.class || cls == java.sql.Date.class || cls == Time.class || cls == Timestamp.class;
    }

    public er5 createFieldDeserializer(whc whcVar, Class<?> cls, kr5 kr5Var) {
        Class<?> cls2 = kr5Var.f55110m;
        return (cls2 == List.class || cls2 == ArrayList.class || (cls2.isArray() && !cls2.getComponentType().isPrimitive())) ? new t99(whcVar, cls, kr5Var) : new ev3(whcVar, cls, kr5Var);
    }

    public sjb getDeserializer(Type type) {
        sjb sjbVar = this.f94266a.get(type);
        if (sjbVar != null) {
            return sjbVar;
        }
        if (type instanceof Class) {
            return getDeserializer((Class) type, type);
        }
        if (!(type instanceof ParameterizedType)) {
            return xi8.f98075a;
        }
        Type rawType = ((ParameterizedType) type).getRawType();
        return rawType instanceof Class ? getDeserializer((Class) rawType, type) : getDeserializer(rawType);
    }

    public void putDeserializer(Type type, sjb sjbVar) {
        this.f94266a.put(type, sjbVar);
    }

    public sjb registerIfNotExists(Class<?> cls) {
        return registerIfNotExists(cls, cls.getModifiers(), false, true, true, true);
    }

    public sjb registerIfNotExists(Class<?> cls, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        sjb sjbVar = this.f94266a.get(cls);
        if (sjbVar != null) {
            return sjbVar;
        }
        ni8 ni8Var = new ni8(this, cls, cls, oi8.build(cls, i, cls, z, z2, z3, z4, this.f94269d));
        putDeserializer(cls, ni8Var);
        return ni8Var;
    }

    public sjb getDeserializer(Class<?> cls, Type type) {
        sjb ni8Var;
        th8 th8Var;
        Class<?> clsMappingTo;
        sjb sjbVar = this.f94266a.get(type);
        if (sjbVar != null) {
            return sjbVar;
        }
        if (type == null) {
            type = cls;
        }
        sjb sjbVar2 = this.f94266a.get(type);
        if (sjbVar2 != null) {
            return sjbVar2;
        }
        if (!isPrimitive(cls) && (th8Var = (th8) cls.getAnnotation(th8.class)) != null && (clsMappingTo = th8Var.mappingTo()) != Void.class) {
            return getDeserializer(clsMappingTo, clsMappingTo);
        }
        if ((type instanceof WildcardType) || (type instanceof TypeVariable) || (type instanceof ParameterizedType)) {
            sjbVar2 = this.f94266a.get(cls);
        }
        if (sjbVar2 != null) {
            return sjbVar2;
        }
        sjb sjbVar3 = this.f94266a.get(type);
        if (sjbVar3 != null) {
            return sjbVar3;
        }
        if (cls.isEnum()) {
            ni8Var = new u35(cls);
        } else if (cls.isArray()) {
            ni8Var = u50.f86828a;
        } else if (cls == Set.class || cls == HashSet.class || cls == Collection.class || cls == List.class || cls == ArrayList.class || Collection.class.isAssignableFrom(cls)) {
            ni8Var = t72.f83919a;
        } else if (Map.class.isAssignableFrom(cls)) {
            ni8Var = is9.f48123a;
        } else if (Throwable.class.isAssignableFrom(cls)) {
            ni8Var = new yyg(this, cls);
        } else {
            ni8Var = new ni8(this, cls, type);
        }
        putDeserializer(type, ni8Var);
        return ni8Var;
    }
}
