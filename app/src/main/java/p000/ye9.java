package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nLocaleList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocaleList.kt\nandroidx/compose/ui/text/intl/LocaleList\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,90:1\n151#2,3:91\n33#2,4:94\n154#2,2:98\n38#2:100\n156#2:101\n33#2,4:102\n154#2,2:106\n38#2:108\n156#2:109\n*S KotlinDebug\n*F\n+ 1 LocaleList.kt\nandroidx/compose/ui/text/intl/LocaleList\n*L\n54#1:91,3\n54#1:94,4\n54#1:98,2\n54#1:100\n54#1:101\n54#1:102,4\n54#1:106,2\n54#1:108\n54#1:109\n*E\n"})
@vw7
public final class ye9 implements Collection<we9>, uo8 {

    /* JADX INFO: renamed from: d */
    public static final int f101295d = 0;

    /* JADX INFO: renamed from: a */
    @yfb
    public final List<we9> f101297a;

    /* JADX INFO: renamed from: b */
    public final int f101298b;

    /* JADX INFO: renamed from: c */
    @yfb
    public static final C15631a f101294c = new C15631a(null);

    /* JADX INFO: renamed from: e */
    @yfb
    public static final ye9 f101296e = new ye9((List<we9>) l82.emptyList());

    /* JADX INFO: renamed from: ye9$a */
    public static final class C15631a {
        public /* synthetic */ C15631a(jt3 jt3Var) {
            this();
        }

        @yfb
        public final ye9 getCurrent() {
            return gxc.getPlatformLocaleDelegate().getCurrent();
        }

        @yfb
        public final ye9 getEmpty() {
            return ye9.f101296e;
        }

        private C15631a() {
        }
    }

    public ye9(@yfb List<we9> list) {
        this.f101297a = list;
        this.f101298b = list.size();
    }

    /* JADX INFO: renamed from: add, reason: avoid collision after fix types in other method */
    public boolean add2(we9 we9Var) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends we9> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof we9) {
            return contains((we9) obj);
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(@yfb Collection<? extends Object> collection) {
        return this.f101297a.containsAll(collection);
    }

    @Override // java.util.Collection
    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ye9) && md8.areEqual(this.f101297a, ((ye9) obj).f101297a);
    }

    @yfb
    public final we9 get(int i) {
        return this.f101297a.get(i);
    }

    @yfb
    public final List<we9> getLocaleList() {
        return this.f101297a;
    }

    public int getSize() {
        return this.f101298b;
    }

    @Override // java.util.Collection
    public int hashCode() {
        return this.f101297a.hashCode();
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.f101297a.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    @yfb
    public Iterator<we9> iterator() {
        return this.f101297a.iterator();
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeIf(Predicate<? super we9> predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return f82.toArray(this);
    }

    @yfb
    public String toString() {
        return "LocaleList(localeList=" + this.f101297a + ')';
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(we9 we9Var) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean contains(@yfb we9 we9Var) {
        return this.f101297a.contains(we9Var);
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) f82.toArray(this, tArr);
    }

    public ye9(@yfb String str) {
        List listSplit$default = m9g.split$default((CharSequence) str, new String[]{","}, false, 0, 6, (Object) null);
        ArrayList arrayList = new ArrayList(listSplit$default.size());
        int size = listSplit$default.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(m9g.trim((CharSequence) listSplit$default.get(i)).toString());
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i2 = 0; i2 < size2; i2++) {
            arrayList2.add(new we9((String) arrayList.get(i2)));
        }
        this(arrayList2);
    }

    public ye9(@yfb we9... we9VarArr) {
        this((List<we9>) e80.toList(we9VarArr));
    }
}
