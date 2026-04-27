package p000;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import p000.d4b;

/* JADX INFO: loaded from: classes5.dex */
@jd7
@tx4
@yg8
public final class b1f {

    /* JADX INFO: renamed from: b1f$b */
    public static final class C1698b<T> {

        /* JADX INFO: renamed from: a */
        public final Field f12418a;

        /* JADX INFO: renamed from: a */
        public void m2801a(T instance, int value) {
            try {
                this.f12418a.set(instance, Integer.valueOf(value));
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            }
        }

        /* JADX INFO: renamed from: b */
        public void m2802b(T instance, Object value) {
            try {
                this.f12418a.set(instance, value);
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            }
        }

        private C1698b(Field field) {
            this.f12418a = field;
            field.setAccessible(true);
        }
    }

    private b1f() {
    }

    /* JADX INFO: renamed from: a */
    public static <T> C1698b<T> m2790a(Class<T> clazz, String fieldName) {
        try {
            return new C1698b<>(clazz.getDeclaredField(fieldName));
        } catch (NoSuchFieldException e) {
            throw new AssertionError(e);
        }
    }

    /* JADX INFO: renamed from: b */
    public static <K, V> void m2791b(Map<K, V> map, ObjectInputStream stream) throws IOException, ClassNotFoundException {
        m2792c(map, stream, stream.readInt());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public static <K, V> void m2792c(Map<K, V> map, ObjectInputStream stream, int size) throws IOException, ClassNotFoundException {
        for (int i = 0; i < size; i++) {
            map.put(stream.readObject(), stream.readObject());
        }
    }

    /* JADX INFO: renamed from: d */
    public static <K, V> void m2793d(u3b<K, V> multimap, ObjectInputStream stream) throws IOException, ClassNotFoundException {
        m2794e(multimap, stream, stream.readInt());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public static <K, V> void m2794e(u3b<K, V> multimap, ObjectInputStream stream, int distinctKeys) throws IOException, ClassNotFoundException {
        for (int i = 0; i < distinctKeys; i++) {
            Collection collection = multimap.get(stream.readObject());
            int i2 = stream.readInt();
            for (int i3 = 0; i3 < i2; i3++) {
                collection.add(stream.readObject());
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static <E> void m2795f(d4b<E> multiset, ObjectInputStream stream) throws IOException, ClassNotFoundException {
        m2796g(multiset, stream, stream.readInt());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g */
    public static <E> void m2796g(d4b<E> multiset, ObjectInputStream stream, int distinctElements) throws IOException, ClassNotFoundException {
        for (int i = 0; i < distinctElements; i++) {
            multiset.add(stream.readObject(), stream.readInt());
        }
    }

    /* JADX INFO: renamed from: h */
    public static int m2797h(ObjectInputStream stream) throws IOException {
        return stream.readInt();
    }

    /* JADX INFO: renamed from: i */
    public static <K, V> void m2798i(Map<K, V> map, ObjectOutputStream stream) throws IOException {
        stream.writeInt(map.size());
        for (Map.Entry<K, V> entry : map.entrySet()) {
            stream.writeObject(entry.getKey());
            stream.writeObject(entry.getValue());
        }
    }

    /* JADX INFO: renamed from: j */
    public static <K, V> void m2799j(u3b<K, V> multimap, ObjectOutputStream stream) throws IOException {
        stream.writeInt(multimap.asMap().size());
        for (Map.Entry<K, Collection<V>> entry : multimap.asMap().entrySet()) {
            stream.writeObject(entry.getKey());
            stream.writeInt(entry.getValue().size());
            Iterator<V> it = entry.getValue().iterator();
            while (it.hasNext()) {
                stream.writeObject(it.next());
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public static <E> void m2800k(d4b<E> multiset, ObjectOutputStream stream) throws IOException {
        stream.writeInt(multiset.entrySet().size());
        for (d4b.InterfaceC4612a<E> interfaceC4612a : multiset.entrySet()) {
            stream.writeObject(interfaceC4612a.getElement());
            stream.writeInt(interfaceC4612a.getCount());
        }
    }
}
