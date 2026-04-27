package p000;

import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class h6f<E> extends AbstractC6688h3<E> implements Set<E>, Serializable, fp8 {

    /* JADX INFO: renamed from: b */
    @yfb
    public static final C6729a f42511b = new C6729a(null);

    /* JADX INFO: renamed from: c */
    @yfb
    public static final h6f f42512c = new h6f(cs9.f27272Q.getEmpty$kotlin_stdlib());

    /* JADX INFO: renamed from: a */
    @yfb
    public final cs9<E, ?> f42513a;

    /* JADX INFO: renamed from: h6f$a */
    public static final class C6729a {
        public /* synthetic */ C6729a(jt3 jt3Var) {
            this();
        }

        private C6729a() {
        }
    }

    public h6f(@yfb cs9<E, ?> cs9Var) {
        md8.checkNotNullParameter(cs9Var, "backing");
        this.f42513a = cs9Var;
    }

    private final Object writeReplace() throws NotSerializableException {
        if (this.f42513a.isReadOnly$kotlin_stdlib()) {
            return new j1f(this, 1);
        }
        throw new NotSerializableException("The set cannot be serialized while it is being built.");
    }

    @Override // p000.AbstractC6688h3, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(E e) {
        return this.f42513a.addKey$kotlin_stdlib(e) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(@yfb Collection<? extends E> collection) {
        md8.checkNotNullParameter(collection, "elements");
        this.f42513a.checkIsMutable$kotlin_stdlib();
        return super.addAll(collection);
    }

    @yfb
    public final Set<E> build() {
        this.f42513a.build();
        return size() > 0 ? this : f42512c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f42513a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f42513a.containsKey(obj);
    }

    @Override // p000.AbstractC6688h3
    public int getSize() {
        return this.f42513a.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f42513a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    @yfb
    public Iterator<E> iterator() {
        return this.f42513a.keysIterator$kotlin_stdlib();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        return this.f42513a.removeKey$kotlin_stdlib(obj);
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(@yfb Collection<? extends Object> collection) {
        md8.checkNotNullParameter(collection, "elements");
        this.f42513a.checkIsMutable$kotlin_stdlib();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(@yfb Collection<? extends Object> collection) {
        md8.checkNotNullParameter(collection, "elements");
        this.f42513a.checkIsMutable$kotlin_stdlib();
        return super.retainAll(collection);
    }

    public h6f() {
        this(new cs9());
    }

    public h6f(int i) {
        this(new cs9(i));
    }
}
