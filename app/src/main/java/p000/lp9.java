package p000;

import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes3.dex */
public final class lp9 implements z60 {

    /* JADX INFO: renamed from: h */
    public static final int f58393h = 4194304;

    /* JADX INFO: renamed from: i */
    @fdi
    public static final int f58394i = 8;

    /* JADX INFO: renamed from: j */
    public static final int f58395j = 2;

    /* JADX INFO: renamed from: b */
    public final tb7<C8925a, Object> f58396b;

    /* JADX INFO: renamed from: c */
    public final C8926b f58397c;

    /* JADX INFO: renamed from: d */
    public final Map<Class<?>, NavigableMap<Integer, Integer>> f58398d;

    /* JADX INFO: renamed from: e */
    public final Map<Class<?>, k50<?>> f58399e;

    /* JADX INFO: renamed from: f */
    public final int f58400f;

    /* JADX INFO: renamed from: g */
    public int f58401g;

    /* JADX INFO: renamed from: lp9$a */
    public static final class C8925a implements k4d {

        /* JADX INFO: renamed from: a */
        public final C8926b f58402a;

        /* JADX INFO: renamed from: b */
        public int f58403b;

        /* JADX INFO: renamed from: c */
        public Class<?> f58404c;

        public C8925a(C8926b c8926b) {
            this.f58402a = c8926b;
        }

        /* JADX INFO: renamed from: a */
        public void m16300a(int i, Class<?> cls) {
            this.f58403b = i;
            this.f58404c = cls;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C8925a)) {
                return false;
            }
            C8925a c8925a = (C8925a) obj;
            return this.f58403b == c8925a.f58403b && this.f58404c == c8925a.f58404c;
        }

        public int hashCode() {
            int i = this.f58403b * 31;
            Class<?> cls = this.f58404c;
            return i + (cls != null ? cls.hashCode() : 0);
        }

        @Override // p000.k4d
        public void offer() {
            this.f58402a.offer(this);
        }

        public String toString() {
            return "Key{size=" + this.f58403b + "array=" + this.f58404c + '}';
        }
    }

    /* JADX INFO: renamed from: lp9$b */
    public static final class C8926b extends mr0<C8925a> {
        @Override // p000.mr0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public C8925a mo3348a() {
            return new C8925a(this);
        }

        /* JADX INFO: renamed from: d */
        public C8925a m16302d(int i, Class<?> cls) {
            C8925a c8925aM17523b = m17523b();
            c8925aM17523b.m16300a(i, cls);
            return c8925aM17523b;
        }
    }

    @fdi
    public lp9() {
        this.f58396b = new tb7<>();
        this.f58397c = new C8926b();
        this.f58398d = new HashMap();
        this.f58399e = new HashMap();
        this.f58400f = 4194304;
    }

    private void decrementArrayOfSize(int i, Class<?> cls) {
        NavigableMap<Integer, Integer> sizesForAdapter = getSizesForAdapter(cls);
        Integer num = sizesForAdapter.get(Integer.valueOf(i));
        if (num != null) {
            if (num.intValue() == 1) {
                sizesForAdapter.remove(Integer.valueOf(i));
                return;
            } else {
                sizesForAdapter.put(Integer.valueOf(i), Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + i + ", this: " + this);
    }

    private void evict() {
        evictToSize(this.f58400f);
    }

    private void evictToSize(int i) {
        while (this.f58401g > i) {
            Object objRemoveLast = this.f58396b.removeLast();
            t7d.checkNotNull(objRemoveLast);
            k50 adapterFromObject = getAdapterFromObject(objRemoveLast);
            this.f58401g -= adapterFromObject.getArrayLength(objRemoveLast) * adapterFromObject.getElementSizeInBytes();
            decrementArrayOfSize(adapterFromObject.getArrayLength(objRemoveLast), objRemoveLast.getClass());
            if (Log.isLoggable(adapterFromObject.getTag(), 2)) {
                adapterFromObject.getTag();
                StringBuilder sb = new StringBuilder();
                sb.append("evicted: ");
                sb.append(adapterFromObject.getArrayLength(objRemoveLast));
            }
        }
    }

    private <T> k50<T> getAdapterFromObject(T t) {
        return getAdapterFromType(t.getClass());
    }

    private <T> k50<T> getAdapterFromType(Class<T> cls) {
        k50<T> yh1Var = (k50) this.f58399e.get(cls);
        if (yh1Var == null) {
            if (cls.equals(int[].class)) {
                yh1Var = new a88();
            } else {
                if (!cls.equals(byte[].class)) {
                    throw new IllegalArgumentException("No array pool found for: " + cls.getSimpleName());
                }
                yh1Var = new yh1();
            }
            this.f58399e.put(cls, yh1Var);
        }
        return yh1Var;
    }

    @hib
    private <T> T getArrayForKey(C8925a c8925a) {
        return (T) this.f58396b.get(c8925a);
    }

    private <T> T getForKey(C8925a c8925a, Class<T> cls) {
        k50<T> adapterFromType = getAdapterFromType(cls);
        T t = (T) getArrayForKey(c8925a);
        if (t != null) {
            this.f58401g -= adapterFromType.getArrayLength(t) * adapterFromType.getElementSizeInBytes();
            decrementArrayOfSize(adapterFromType.getArrayLength(t), cls);
        }
        if (t != null) {
            return t;
        }
        if (Log.isLoggable(adapterFromType.getTag(), 2)) {
            adapterFromType.getTag();
            StringBuilder sb = new StringBuilder();
            sb.append("Allocated ");
            sb.append(c8925a.f58403b);
            sb.append(" bytes");
        }
        return adapterFromType.newArray(c8925a.f58403b);
    }

    private NavigableMap<Integer, Integer> getSizesForAdapter(Class<?> cls) {
        NavigableMap<Integer, Integer> navigableMap = this.f58398d.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f58398d.put(cls, treeMap);
        return treeMap;
    }

    private boolean isNoMoreThanHalfFull() {
        int i = this.f58401g;
        return i == 0 || this.f58400f / i >= 2;
    }

    private boolean isSmallEnoughForReuse(int i) {
        return i <= this.f58400f / 2;
    }

    private boolean mayFillRequest(int i, Integer num) {
        return num != null && (isNoMoreThanHalfFull() || num.intValue() <= i * 8);
    }

    /* JADX INFO: renamed from: a */
    public int m16299a() {
        int iIntValue = 0;
        for (Class<?> cls : this.f58398d.keySet()) {
            for (Integer num : this.f58398d.get(cls).keySet()) {
                iIntValue += num.intValue() * this.f58398d.get(cls).get(num).intValue() * getAdapterFromType(cls).getElementSizeInBytes();
            }
        }
        return iIntValue;
    }

    @Override // p000.z60
    public synchronized void clearMemory() {
        evictToSize(0);
    }

    @Override // p000.z60
    public synchronized <T> T get(int i, Class<T> cls) {
        Integer numCeilingKey;
        try {
            numCeilingKey = getSizesForAdapter(cls).ceilingKey(Integer.valueOf(i));
        } catch (Throwable th) {
            throw th;
        }
        return (T) getForKey(mayFillRequest(i, numCeilingKey) ? this.f58397c.m16302d(numCeilingKey.intValue(), cls) : this.f58397c.m16302d(i, cls), cls);
    }

    @Override // p000.z60
    public synchronized <T> T getExact(int i, Class<T> cls) {
        return (T) getForKey(this.f58397c.m16302d(i, cls), cls);
    }

    @Override // p000.z60
    @Deprecated
    public <T> void put(T t, Class<T> cls) {
        put(t);
    }

    @Override // p000.z60
    public synchronized void trimMemory(int i) {
        try {
            if (i >= 40) {
                clearMemory();
            } else if (i >= 20 || i == 15) {
                evictToSize(this.f58400f / 2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p000.z60
    public synchronized <T> void put(T t) {
        Class<?> cls = t.getClass();
        k50<T> adapterFromType = getAdapterFromType(cls);
        int arrayLength = adapterFromType.getArrayLength(t);
        int elementSizeInBytes = adapterFromType.getElementSizeInBytes() * arrayLength;
        if (isSmallEnoughForReuse(elementSizeInBytes)) {
            C8925a c8925aM16302d = this.f58397c.m16302d(arrayLength, cls);
            this.f58396b.put(c8925aM16302d, t);
            NavigableMap<Integer, Integer> sizesForAdapter = getSizesForAdapter(cls);
            Integer num = sizesForAdapter.get(Integer.valueOf(c8925aM16302d.f58403b));
            Integer numValueOf = Integer.valueOf(c8925aM16302d.f58403b);
            int iIntValue = 1;
            if (num != null) {
                iIntValue = 1 + num.intValue();
            }
            sizesForAdapter.put(numValueOf, Integer.valueOf(iIntValue));
            this.f58401g += elementSizeInBytes;
            evict();
        }
    }

    public lp9(int i) {
        this.f58396b = new tb7<>();
        this.f58397c = new C8926b();
        this.f58398d = new HashMap();
        this.f58399e = new HashMap();
        this.f58400f = i;
    }
}
