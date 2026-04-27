package p000;

import java.io.Serializable;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class mh8 extends fh8 implements Map<String, Object>, Cloneable, Serializable, InvocationHandler {

    /* JADX INFO: renamed from: C */
    public final Map<String, Object> f61012C;

    public mh8() {
        this(16, false);
    }

    @Override // java.util.Map
    public void clear() {
        this.f61012C.clear();
    }

    public Object clone() {
        return new mh8(new LinkedHashMap(this.f61012C));
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.f61012C.containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return this.f61012C.containsValue(obj);
    }

    @Override // java.util.Map
    public Set<Map.Entry<String, Object>> entrySet() {
        return this.f61012C.entrySet();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return this.f61012C.equals(obj);
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        return this.f61012C.get(obj);
    }

    public BigDecimal getBigDecimal(String str) {
        return qmh.castToBigDecimal(get(str));
    }

    public BigInteger getBigInteger(String str) {
        return qmh.castToBigInteger(get(str));
    }

    public Boolean getBoolean(String str) {
        Object obj = get(str);
        if (obj == null) {
            return null;
        }
        return qmh.castToBoolean(obj);
    }

    public boolean getBooleanValue(String str) {
        Object obj = get(str);
        if (obj == null) {
            return false;
        }
        return qmh.castToBoolean(obj).booleanValue();
    }

    public Byte getByte(String str) {
        return qmh.castToByte(get(str));
    }

    public byte getByteValue(String str) {
        Object obj = get(str);
        if (obj == null) {
            return (byte) 0;
        }
        return qmh.castToByte(obj).byteValue();
    }

    public byte[] getBytes(String str) {
        Object obj = get(str);
        if (obj == null) {
            return null;
        }
        return qmh.castToBytes(obj);
    }

    public Date getDate(String str) {
        return qmh.castToDate(get(str));
    }

    public Double getDouble(String str) {
        return qmh.castToDouble(get(str));
    }

    public double getDoubleValue(String str) {
        Object obj = get(str);
        if (obj == null) {
            return 0.0d;
        }
        return qmh.castToDouble(obj).doubleValue();
    }

    public Float getFloat(String str) {
        return qmh.castToFloat(get(str));
    }

    public float getFloatValue(String str) {
        Object obj = get(str);
        if (obj == null) {
            return 0.0f;
        }
        return qmh.castToFloat(obj).floatValue();
    }

    public Map<String, Object> getInnerMap() {
        return this.f61012C;
    }

    public int getIntValue(String str) {
        Object obj = get(str);
        if (obj == null) {
            return 0;
        }
        return qmh.castToInt(obj).intValue();
    }

    public Integer getInteger(String str) {
        return qmh.castToInt(get(str));
    }

    public gh8 getJSONArray(String str) {
        Object obj = this.f61012C.get(str);
        return obj instanceof gh8 ? (gh8) obj : obj instanceof String ? (gh8) fh8.parse((String) obj) : (gh8) fh8.toJSON(obj);
    }

    public mh8 getJSONObject(String str) {
        Object obj = this.f61012C.get(str);
        return obj instanceof mh8 ? (mh8) obj : obj instanceof String ? fh8.parseObject((String) obj) : (mh8) fh8.toJSON(obj);
    }

    public Long getLong(String str) {
        return qmh.castToLong(get(str));
    }

    public long getLongValue(String str) {
        Object obj = get(str);
        if (obj == null) {
            return 0L;
        }
        return qmh.castToLong(obj).longValue();
    }

    public <T> T getObject(String str, Class<T> cls) {
        return (T) qmh.castToJavaBean(this.f61012C.get(str), cls);
    }

    public Short getShort(String str) {
        return qmh.castToShort(get(str));
    }

    public short getShortValue(String str) {
        Object obj = get(str);
        if (obj == null) {
            return (short) 0;
        }
        return qmh.castToShort(obj).shortValue();
    }

    public String getString(String str) {
        Object obj = get(str);
        if (obj == null) {
            return null;
        }
        return obj.toString();
    }

    @Override // java.util.Map
    public int hashCode() {
        return this.f61012C.hashCode();
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        Class<?>[] parameterTypes = method.getParameterTypes();
        String strName = null;
        if (parameterTypes.length == 1) {
            if (method.getName().equals("equals")) {
                return Boolean.valueOf(equals(objArr[0]));
            }
            if (method.getReturnType() != Void.TYPE) {
                throw new jh8("illegal setter");
            }
            kh8 kh8Var = (kh8) method.getAnnotation(kh8.class);
            String strName2 = (kh8Var == null || kh8Var.name().length() == 0) ? null : kh8Var.name();
            if (strName2 == null) {
                String name = method.getName();
                if (!name.startsWith("set")) {
                    throw new jh8("illegal setter");
                }
                String strSubstring = name.substring(3);
                if (strSubstring.length() == 0) {
                    throw new jh8("illegal setter");
                }
                strName2 = Character.toLowerCase(strSubstring.charAt(0)) + strSubstring.substring(1);
            }
            this.f61012C.put(strName2, objArr[0]);
            return null;
        }
        if (parameterTypes.length != 0) {
            throw new UnsupportedOperationException(method.toGenericString());
        }
        if (method.getReturnType() == Void.TYPE) {
            throw new jh8("illegal getter");
        }
        kh8 kh8Var2 = (kh8) method.getAnnotation(kh8.class);
        if (kh8Var2 != null && kh8Var2.name().length() != 0) {
            strName = kh8Var2.name();
        }
        if (strName == null) {
            String name2 = method.getName();
            if (name2.startsWith("get")) {
                String strSubstring2 = name2.substring(3);
                if (strSubstring2.length() == 0) {
                    throw new jh8("illegal getter");
                }
                strName = Character.toLowerCase(strSubstring2.charAt(0)) + strSubstring2.substring(1);
            } else {
                if (!name2.startsWith("is")) {
                    if (name2.startsWith("hashCode")) {
                        return Integer.valueOf(hashCode());
                    }
                    if (name2.startsWith("toString")) {
                        return toString();
                    }
                    throw new jh8("illegal getter");
                }
                String strSubstring3 = name2.substring(2);
                if (strSubstring3.length() == 0) {
                    throw new jh8("illegal getter");
                }
                strName = Character.toLowerCase(strSubstring3.charAt(0)) + strSubstring3.substring(1);
            }
        }
        return qmh.cast(this.f61012C.get(strName), method.getGenericReturnType(), whc.f94265e);
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.f61012C.isEmpty();
    }

    @Override // java.util.Map
    public Set<String> keySet() {
        return this.f61012C.keySet();
    }

    @Override // java.util.Map
    public void putAll(Map<? extends String, ? extends Object> map) {
        this.f61012C.putAll(map);
    }

    @Override // java.util.Map
    public Object remove(Object obj) {
        return this.f61012C.remove(obj);
    }

    @Override // java.util.Map
    public int size() {
        return this.f61012C.size();
    }

    @Override // java.util.Map
    public Collection<Object> values() {
        return this.f61012C.values();
    }

    public mh8(Map<String, Object> map) {
        this.f61012C = map;
    }

    @Override // java.util.Map
    public Object put(String str, Object obj) {
        return this.f61012C.put(str, obj);
    }

    public mh8(boolean z) {
        this(16, z);
    }

    public mh8(int i) {
        this(i, false);
    }

    public mh8(int i, boolean z) {
        if (z) {
            this.f61012C = new LinkedHashMap(i);
        } else {
            this.f61012C = new HashMap(i);
        }
    }
}
