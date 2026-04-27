package p000;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public class gh8 extends fh8 implements List<Object>, Cloneable, RandomAccess, Serializable {

    /* JADX INFO: renamed from: C */
    public final List<Object> f39825C;

    /* JADX INFO: renamed from: F */
    public transient Object f39826F;

    /* JADX INFO: renamed from: H */
    public transient Type f39827H;

    public gh8() {
        this.f39825C = new ArrayList(10);
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(Object obj) {
        return this.f39825C.add(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends Object> collection) {
        return this.f39825C.addAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        this.f39825C.clear();
    }

    public Object clone() {
        return new gh8(new ArrayList(this.f39825C));
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        return this.f39825C.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        return this.f39825C.containsAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public boolean equals(Object obj) {
        return this.f39825C.equals(obj);
    }

    @Override // java.util.List
    public Object get(int i) {
        return this.f39825C.get(i);
    }

    public BigDecimal getBigDecimal(int i) {
        return qmh.castToBigDecimal(get(i));
    }

    public BigInteger getBigInteger(int i) {
        return qmh.castToBigInteger(get(i));
    }

    public Boolean getBoolean(int i) {
        Object obj = get(i);
        if (obj == null) {
            return null;
        }
        return qmh.castToBoolean(obj);
    }

    public boolean getBooleanValue(int i) {
        Object obj = get(i);
        if (obj == null) {
            return false;
        }
        return qmh.castToBoolean(obj).booleanValue();
    }

    public Byte getByte(int i) {
        return qmh.castToByte(get(i));
    }

    public byte getByteValue(int i) {
        Object obj = get(i);
        if (obj == null) {
            return (byte) 0;
        }
        return qmh.castToByte(obj).byteValue();
    }

    public Type getComponentType() {
        return this.f39827H;
    }

    public Date getDate(int i) {
        return qmh.castToDate(get(i));
    }

    public Double getDouble(int i) {
        return qmh.castToDouble(get(i));
    }

    public double getDoubleValue(int i) {
        Object obj = get(i);
        if (obj == null) {
            return 0.0d;
        }
        return qmh.castToDouble(obj).doubleValue();
    }

    public Float getFloat(int i) {
        return qmh.castToFloat(get(i));
    }

    public float getFloatValue(int i) {
        Object obj = get(i);
        if (obj == null) {
            return 0.0f;
        }
        return qmh.castToFloat(obj).floatValue();
    }

    public int getIntValue(int i) {
        Object obj = get(i);
        if (obj == null) {
            return 0;
        }
        return qmh.castToInt(obj).intValue();
    }

    public Integer getInteger(int i) {
        return qmh.castToInt(get(i));
    }

    public gh8 getJSONArray(int i) {
        Object obj = this.f39825C.get(i);
        return obj instanceof gh8 ? (gh8) obj : (gh8) fh8.toJSON(obj);
    }

    public mh8 getJSONObject(int i) {
        Object obj = this.f39825C.get(i);
        return obj instanceof mh8 ? (mh8) obj : (mh8) fh8.toJSON(obj);
    }

    public Long getLong(int i) {
        return qmh.castToLong(get(i));
    }

    public long getLongValue(int i) {
        Object obj = get(i);
        if (obj == null) {
            return 0L;
        }
        return qmh.castToLong(obj).longValue();
    }

    public <T> T getObject(int i, Class<T> cls) {
        return (T) qmh.castToJavaBean(this.f39825C.get(i), cls);
    }

    public Object getRelatedArray() {
        return this.f39826F;
    }

    public Short getShort(int i) {
        return qmh.castToShort(get(i));
    }

    public short getShortValue(int i) {
        Object obj = get(i);
        if (obj == null) {
            return (short) 0;
        }
        return qmh.castToShort(obj).shortValue();
    }

    public String getString(int i) {
        return qmh.castToString(get(i));
    }

    @Override // java.util.List, java.util.Collection
    public int hashCode() {
        return this.f39825C.hashCode();
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        return this.f39825C.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.f39825C.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<Object> iterator() {
        return this.f39825C.iterator();
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        return this.f39825C.lastIndexOf(obj);
    }

    @Override // java.util.List
    public ListIterator<Object> listIterator() {
        return this.f39825C.listIterator();
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        return this.f39825C.remove(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        return this.f39825C.removeAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        return this.f39825C.retainAll(collection);
    }

    @Override // java.util.List
    public Object set(int i, Object obj) {
        return this.f39825C.set(i, obj);
    }

    public void setComponentType(Type type) {
        this.f39827H = type;
    }

    public void setRelatedArray(Object obj) {
        this.f39826F = obj;
    }

    @Override // java.util.List, java.util.Collection
    public int size() {
        return this.f39825C.size();
    }

    @Override // java.util.List
    public List<Object> subList(int i, int i2) {
        return this.f39825C.subList(i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return this.f39825C.toArray();
    }

    @Override // java.util.List
    public void add(int i, Object obj) {
        this.f39825C.add(i, obj);
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection<? extends Object> collection) {
        return this.f39825C.addAll(i, collection);
    }

    @Override // java.util.List
    public ListIterator<Object> listIterator(int i) {
        return this.f39825C.listIterator(i);
    }

    @Override // java.util.List
    public Object remove(int i) {
        return this.f39825C.remove(i);
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) this.f39825C.toArray(tArr);
    }

    public gh8(List<Object> list) {
        this.f39825C = list;
    }

    public gh8(int i) {
        this.f39825C = new ArrayList(i);
    }
}
