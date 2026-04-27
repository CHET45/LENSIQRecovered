package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class o6f<T> implements jo5<Set<T>> {

    /* JADX INFO: renamed from: c */
    public static final jo5<Set<Object>> f66565c = p58.create(Collections.emptySet());

    /* JADX INFO: renamed from: a */
    public final List<hid<T>> f66566a;

    /* JADX INFO: renamed from: b */
    public final List<hid<Collection<T>>> f66567b;

    /* JADX INFO: renamed from: o6f$b */
    public static final class C10208b<T> {

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ boolean f66568c = false;

        /* JADX INFO: renamed from: a */
        public final List<hid<T>> f66569a;

        /* JADX INFO: renamed from: b */
        public final List<hid<Collection<T>>> f66570b;

        public C10208b<T> addCollectionProvider(hid<? extends Collection<? extends T>> hidVar) {
            this.f66570b.add(hidVar);
            return this;
        }

        public C10208b<T> addProvider(hid<? extends T> hidVar) {
            this.f66569a.add(hidVar);
            return this;
        }

        public o6f<T> build() {
            return new o6f<>(this.f66569a, this.f66570b);
        }

        private C10208b(int i, int i2) {
            this.f66569a = re3.presizedList(i);
            this.f66570b = re3.presizedList(i2);
        }
    }

    public static <T> C10208b<T> builder(int i, int i2) {
        return new C10208b<>(i, i2);
    }

    public static <T> jo5<Set<T>> empty() {
        return (jo5<Set<T>>) f66565c;
    }

    private o6f(List<hid<T>> list, List<hid<Collection<T>>> list2) {
        this.f66566a = list;
        this.f66567b = list2;
    }

    @Override // p000.hid
    public Set<T> get() {
        int size = this.f66566a.size();
        ArrayList arrayList = new ArrayList(this.f66567b.size());
        int size2 = this.f66567b.size();
        for (int i = 0; i < size2; i++) {
            Collection<T> collection = this.f66567b.get(i).get();
            size += collection.size();
            arrayList.add(collection);
        }
        HashSet hashSetM21183a = re3.m21183a(size);
        int size3 = this.f66566a.size();
        for (int i2 = 0; i2 < size3; i2++) {
            hashSetM21183a.add(s7d.checkNotNull(this.f66566a.get(i2).get()));
        }
        int size4 = arrayList.size();
        for (int i3 = 0; i3 < size4; i3++) {
            Iterator it = ((Collection) arrayList.get(i3)).iterator();
            while (it.hasNext()) {
                hashSetM21183a.add(s7d.checkNotNull(it.next()));
            }
        }
        return Collections.unmodifiableSet(hashSetM21183a);
    }
}
