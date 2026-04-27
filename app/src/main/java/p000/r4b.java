package p000;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
@jd7
@tx4
@yg8
public final class r4b<B> extends qs6<Class<? extends B>, B> implements m12<B>, Serializable {

    /* JADX INFO: renamed from: a */
    public final Map<Class<? extends B>, B> f77020a;

    /* JADX INFO: renamed from: r4b$a */
    public class C11887a extends rs6<Class<? extends B>, B> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Map.Entry f77021a;

        public C11887a(final Map.Entry val$entry) {
            this.f77021a = val$entry;
        }

        @Override // p000.rs6, p000.zs6
        /* JADX INFO: renamed from: a */
        public Map.Entry<Class<? extends B>, B> mo8967m() {
            return this.f77021a;
        }

        @Override // p000.rs6, java.util.Map.Entry
        @dgc
        public B setValue(@dgc B b) {
            r4b.cast(getKey(), b);
            return (B) super.setValue(b);
        }
    }

    /* JADX INFO: renamed from: r4b$b */
    public class C11888b extends jt6<Map.Entry<Class<? extends B>, B>> {

        /* JADX INFO: renamed from: r4b$b$a */
        public class a extends geh<Map.Entry<Class<? extends B>, B>, Map.Entry<Class<? extends B>, B>> {
            public a(final C11888b this$1, Iterator backingIterator) {
                super(backingIterator);
            }

            @Override // p000.geh
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Map.Entry<Class<? extends B>, B> mo2935a(Map.Entry<Class<? extends B>, B> from) {
                return r4b.checkedEntry(from);
            }
        }

        public C11888b() {
        }

        @Override // p000.lr6, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<Class<? extends B>, B>> iterator() {
            return new a(this, mo8967m().iterator());
        }

        @Override // p000.jt6, p000.lr6, p000.zs6
        /* JADX INFO: renamed from: m */
        public Set<Map.Entry<Class<? extends B>, B>> mo8967m() {
            return r4b.this.mo8967m().entrySet();
        }

        @Override // p000.lr6, java.util.Collection
        public Object[] toArray() {
            return m16327j();
        }

        @Override // p000.lr6, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
            return (T[]) m16328k(tArr);
        }
    }

    /* JADX INFO: renamed from: r4b$c */
    public static final class C11889c<B> implements Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a */
        public final Map<Class<? extends B>, B> f77023a;

        public C11889c(Map<Class<? extends B>, B> backingMap) {
            this.f77023a = backingMap;
        }

        public Object readResolve() {
            return r4b.create(this.f77023a);
        }
    }

    private r4b(Map<Class<? extends B>, B> delegate) {
        this.f77020a = (Map) v7d.checkNotNull(delegate);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @op1
    @wx1
    public static <T> T cast(Class<T> cls, @wx1 Object obj) {
        return (T) tbd.wrap(cls).cast(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <B> Map.Entry<Class<? extends B>, B> checkedEntry(final Map.Entry<Class<? extends B>, B> entry) {
        return new C11887a(entry);
    }

    public static <B> r4b<B> create() {
        return new r4b<>(new HashMap());
    }

    private void readObject(ObjectInputStream stream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    private Object writeReplace() {
        return new C11889c(mo8967m());
    }

    @Override // p000.qs6, p000.zs6
    /* JADX INFO: renamed from: a */
    public Map<Class<? extends B>, B> mo8967m() {
        return this.f77020a;
    }

    @Override // p000.qs6, java.util.Map
    public Set<Map.Entry<Class<? extends B>, B>> entrySet() {
        return new C11888b();
    }

    @Override // p000.m12
    @wx1
    public <T extends B> T getInstance(Class<T> cls) {
        return (T) cast(cls, get(cls));
    }

    @Override // p000.qs6, java.util.Map, p000.k11
    public void putAll(Map<? extends Class<? extends B>, ? extends B> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            cast((Class) entry.getKey(), entry.getValue());
        }
        super.putAll(linkedHashMap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.m12
    @op1
    @wx1
    public <T extends B> T putInstance(Class<T> cls, @dgc T t) {
        return (T) cast(cls, put((Class<? extends T>) cls, t));
    }

    public static <B> r4b<B> create(Map<Class<? extends B>, B> backingMap) {
        return new r4b<>(backingMap);
    }

    @Override // p000.qs6, java.util.Map, p000.k11
    @op1
    @wx1
    public B put(Class<? extends B> cls, @dgc B b) {
        cast(cls, b);
        return (B) super.put(cls, b);
    }
}
