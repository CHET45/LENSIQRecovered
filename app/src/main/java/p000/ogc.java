package p000;

import android.os.BadParcelableException;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ogc {

    /* JADX INFO: renamed from: ogc$a */
    @c5e(29)
    public static class C10369a {
        private C10369a() {
        }

        @ih4
        /* JADX INFO: renamed from: a */
        public static <T extends Parcelable> List<T> m18659a(@efb Parcel parcel, @efb List<T> list, @hib ClassLoader classLoader) {
            return parcel.readParcelableList(list, classLoader);
        }
    }

    /* JADX INFO: renamed from: ogc$b */
    @c5e(30)
    public static class C10370b {
        private C10370b() {
        }

        @ih4
        /* JADX INFO: renamed from: a */
        public static Parcelable.Creator<?> m18660a(@efb Parcel parcel, @hib ClassLoader classLoader) {
            return parcel.readParcelableCreator(classLoader);
        }
    }

    /* JADX INFO: renamed from: ogc$c */
    @c5e(33)
    public static class C10371c {
        private C10371c() {
        }

        @ih4
        /* JADX INFO: renamed from: a */
        public static <T> T[] m18661a(Parcel parcel, ClassLoader classLoader, Class<T> cls) {
            return (T[]) parcel.readArray(classLoader, cls);
        }

        @ih4
        /* JADX INFO: renamed from: b */
        public static <T> ArrayList<T> m18662b(Parcel parcel, ClassLoader classLoader, Class<? extends T> cls) {
            return parcel.readArrayList(classLoader, cls);
        }

        @ih4
        /* JADX INFO: renamed from: c */
        public static <V, K> HashMap<K, V> m18663c(Parcel parcel, ClassLoader classLoader, Class<? extends K> cls, Class<? extends V> cls2) {
            return parcel.readHashMap(classLoader, cls, cls2);
        }

        @ih4
        /* JADX INFO: renamed from: d */
        public static <T> void m18664d(@efb Parcel parcel, @efb List<? super T> list, @hib ClassLoader classLoader, @efb Class<T> cls) {
            parcel.readList(list, classLoader, cls);
        }

        @ih4
        /* JADX INFO: renamed from: e */
        public static <K, V> void m18665e(Parcel parcel, Map<? super K, ? super V> map, ClassLoader classLoader, Class<K> cls, Class<V> cls2) {
            parcel.readMap(map, classLoader, cls, cls2);
        }

        @ih4
        /* JADX INFO: renamed from: f */
        public static <T extends Parcelable> T m18666f(@efb Parcel parcel, @hib ClassLoader classLoader, @efb Class<T> cls) {
            return (T) parcel.readParcelable(classLoader, cls);
        }

        @ih4
        /* JADX INFO: renamed from: g */
        public static <T> T[] m18667g(@efb Parcel parcel, @hib ClassLoader classLoader, @efb Class<T> cls) {
            return (T[]) parcel.readParcelableArray(classLoader, cls);
        }

        @ih4
        /* JADX INFO: renamed from: h */
        public static <T> Parcelable.Creator<T> m18668h(Parcel parcel, ClassLoader classLoader, Class<T> cls) {
            return parcel.readParcelableCreator(classLoader, cls);
        }

        @ih4
        /* JADX INFO: renamed from: i */
        public static <T> List<T> m18669i(@efb Parcel parcel, @efb List<T> list, @hib ClassLoader classLoader, @efb Class<T> cls) {
            return parcel.readParcelableList(list, classLoader, cls);
        }

        @ih4
        /* JADX INFO: renamed from: j */
        public static <T extends Serializable> T m18670j(@efb Parcel parcel, @hib ClassLoader classLoader, @efb Class<T> cls) {
            return (T) parcel.readSerializable(classLoader, cls);
        }

        @ih4
        /* JADX INFO: renamed from: k */
        public static <T> SparseArray<T> m18671k(Parcel parcel, ClassLoader classLoader, Class<? extends T> cls) {
            return parcel.readSparseArray(classLoader, cls);
        }
    }

    private ogc() {
    }

    @hib
    @igg({"ArrayReturn", "NullableCollection"})
    public static <T> Object[] readArray(@efb Parcel parcel, @hib ClassLoader classLoader, @efb Class<T> cls) {
        return Build.VERSION.SDK_INT >= 34 ? C10371c.m18661a(parcel, classLoader, cls) : parcel.readArray(classLoader);
    }

    @hib
    @igg({"ConcreteCollection", "NullableCollection"})
    public static <T> ArrayList<T> readArrayList(@efb Parcel parcel, @hib ClassLoader classLoader, @efb Class<? extends T> cls) {
        return Build.VERSION.SDK_INT >= 34 ? C10371c.m18662b(parcel, classLoader, cls) : parcel.readArrayList(classLoader);
    }

    public static boolean readBoolean(@efb Parcel parcel) {
        return parcel.readInt() != 0;
    }

    @hib
    @igg({"ConcreteCollection", "NullableCollection"})
    public static <K, V> HashMap<K, V> readHashMap(@efb Parcel parcel, @hib ClassLoader classLoader, @efb Class<? extends K> cls, @efb Class<? extends V> cls2) {
        return Build.VERSION.SDK_INT >= 34 ? C10371c.m18663c(parcel, classLoader, cls, cls2) : parcel.readHashMap(classLoader);
    }

    public static <T> void readList(@efb Parcel parcel, @efb List<? super T> list, @hib ClassLoader classLoader, @efb Class<T> cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            C10371c.m18664d(parcel, list, classLoader, cls);
        } else {
            parcel.readList(list, classLoader);
        }
    }

    public static <K, V> void readMap(@efb Parcel parcel, @efb Map<? super K, ? super V> map, @hib ClassLoader classLoader, @efb Class<K> cls, @efb Class<V> cls2) {
        if (Build.VERSION.SDK_INT >= 34) {
            C10371c.m18665e(parcel, map, classLoader, cls, cls2);
        } else {
            parcel.readMap(map, classLoader);
        }
    }

    @hib
    public static <T extends Parcelable> T readParcelable(@efb Parcel parcel, @hib ClassLoader classLoader, @efb Class<T> cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return (T) C10371c.m18666f(parcel, classLoader, cls);
        }
        T t = (T) parcel.readParcelable(classLoader);
        if (t == null || cls.isInstance(t)) {
            return t;
        }
        throw new BadParcelableException("Parcelable " + t.getClass() + " is not a subclass of required class " + cls.getName() + " provided in the parameter");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @hib
    @igg({"ArrayReturn", "NullableCollection"})
    @Deprecated
    public static <T> T[] readParcelableArray(@efb Parcel parcel, @hib ClassLoader classLoader, @efb Class<T> cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return (T[]) C10371c.m18667g(parcel, classLoader, cls);
        }
        T[] tArr = (T[]) parcel.readParcelableArray(classLoader);
        if (cls.isAssignableFrom(Parcelable.class)) {
            return tArr;
        }
        T[] tArr2 = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, tArr.length));
        for (int i = 0; i < tArr.length; i++) {
            try {
                tArr2[i] = cls.cast(tArr[i]);
            } catch (ClassCastException unused) {
                throw new BadParcelableException("Parcelable at index " + i + " is not a subclass of required class " + cls.getName() + " provided in the parameter");
            }
        }
        return tArr2;
    }

    @hib
    @igg({"ArrayReturn", "NullableCollection"})
    public static <T> Parcelable[] readParcelableArrayTyped(@efb Parcel parcel, @hib ClassLoader classLoader, @efb Class<T> cls) {
        return Build.VERSION.SDK_INT >= 34 ? (Parcelable[]) C10371c.m18667g(parcel, classLoader, cls) : parcel.readParcelableArray(classLoader);
    }

    @c5e(30)
    @hib
    public static <T> Parcelable.Creator<T> readParcelableCreator(@efb Parcel parcel, @hib ClassLoader classLoader, @efb Class<T> cls) {
        return Build.VERSION.SDK_INT >= 34 ? C10371c.m18668h(parcel, classLoader, cls) : (Parcelable.Creator<T>) C10370b.m18660a(parcel, classLoader);
    }

    @c5e(api = 29)
    @efb
    public static <T> List<T> readParcelableList(@efb Parcel parcel, @efb List<T> list, @hib ClassLoader classLoader, @efb Class<T> cls) {
        return Build.VERSION.SDK_INT >= 34 ? C10371c.m18669i(parcel, list, classLoader, cls) : C10369a.m18659a(parcel, list, classLoader);
    }

    @hib
    public static <T extends Serializable> T readSerializable(@efb Parcel parcel, @hib ClassLoader classLoader, @efb Class<T> cls) {
        return Build.VERSION.SDK_INT >= 33 ? (T) C10371c.m18670j(parcel, classLoader, cls) : (T) parcel.readSerializable();
    }

    @hib
    public static <T> SparseArray<T> readSparseArray(@efb Parcel parcel, @hib ClassLoader classLoader, @efb Class<? extends T> cls) {
        return Build.VERSION.SDK_INT >= 34 ? C10371c.m18671k(parcel, classLoader, cls) : parcel.readSparseArray(classLoader);
    }

    public static void writeBoolean(@efb Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }
}
