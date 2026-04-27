package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class f03<E> implements Iterable<E> {

    /* JADX INFO: renamed from: a */
    public final Object f34625a = new Object();

    /* JADX INFO: renamed from: b */
    @xc7("lock")
    public final Map<E, Integer> f34626b = new HashMap();

    /* JADX INFO: renamed from: c */
    @xc7("lock")
    public Set<E> f34627c = Collections.emptySet();

    /* JADX INFO: renamed from: d */
    @xc7("lock")
    public List<E> f34628d = Collections.emptyList();

    public void add(E e) {
        synchronized (this.f34625a) {
            try {
                ArrayList arrayList = new ArrayList(this.f34628d);
                arrayList.add(e);
                this.f34628d = Collections.unmodifiableList(arrayList);
                Integer num = this.f34626b.get(e);
                if (num == null) {
                    HashSet hashSet = new HashSet(this.f34627c);
                    hashSet.add(e);
                    this.f34627c = Collections.unmodifiableSet(hashSet);
                }
                this.f34626b.put(e, Integer.valueOf(num != null ? 1 + num.intValue() : 1));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public int count(E e) {
        int iIntValue;
        synchronized (this.f34625a) {
            try {
                iIntValue = this.f34626b.containsKey(e) ? this.f34626b.get(e).intValue() : 0;
            } catch (Throwable th) {
                throw th;
            }
        }
        return iIntValue;
    }

    public Set<E> elementSet() {
        Set<E> set;
        synchronized (this.f34625a) {
            set = this.f34627c;
        }
        return set;
    }

    @Override // java.lang.Iterable
    public Iterator<E> iterator() {
        Iterator<E> it;
        synchronized (this.f34625a) {
            it = this.f34628d.iterator();
        }
        return it;
    }

    public void remove(E e) {
        synchronized (this.f34625a) {
            try {
                Integer num = this.f34626b.get(e);
                if (num == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList(this.f34628d);
                arrayList.remove(e);
                this.f34628d = Collections.unmodifiableList(arrayList);
                if (num.intValue() == 1) {
                    this.f34626b.remove(e);
                    HashSet hashSet = new HashSet(this.f34627c);
                    hashSet.remove(e);
                    this.f34627c = Collections.unmodifiableSet(hashSet);
                } else {
                    this.f34626b.put(e, Integer.valueOf(num.intValue() - 1));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
