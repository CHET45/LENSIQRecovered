package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class e03<E> implements Iterable<E> {

    /* JADX INFO: renamed from: a */
    public final Object f31414a = new Object();

    /* JADX INFO: renamed from: b */
    @xc7("lock")
    public final Map<E, Integer> f31415b = new HashMap();

    /* JADX INFO: renamed from: c */
    @xc7("lock")
    public Set<E> f31416c = Collections.emptySet();

    /* JADX INFO: renamed from: d */
    @xc7("lock")
    public List<E> f31417d = Collections.emptyList();

    public void add(E e) {
        synchronized (this.f31414a) {
            try {
                ArrayList arrayList = new ArrayList(this.f31417d);
                arrayList.add(e);
                this.f31417d = Collections.unmodifiableList(arrayList);
                Integer num = this.f31415b.get(e);
                if (num == null) {
                    HashSet hashSet = new HashSet(this.f31416c);
                    hashSet.add(e);
                    this.f31416c = Collections.unmodifiableSet(hashSet);
                }
                this.f31415b.put(e, Integer.valueOf(num != null ? 1 + num.intValue() : 1));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public int count(E e) {
        int iIntValue;
        synchronized (this.f31414a) {
            try {
                iIntValue = this.f31415b.containsKey(e) ? this.f31415b.get(e).intValue() : 0;
            } catch (Throwable th) {
                throw th;
            }
        }
        return iIntValue;
    }

    public Set<E> elementSet() {
        Set<E> set;
        synchronized (this.f31414a) {
            set = this.f31416c;
        }
        return set;
    }

    @Override // java.lang.Iterable
    public Iterator<E> iterator() {
        Iterator<E> it;
        synchronized (this.f31414a) {
            it = this.f31417d.iterator();
        }
        return it;
    }

    public void remove(E e) {
        synchronized (this.f31414a) {
            try {
                Integer num = this.f31415b.get(e);
                if (num == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList(this.f31417d);
                arrayList.remove(e);
                this.f31417d = Collections.unmodifiableList(arrayList);
                if (num.intValue() == 1) {
                    this.f31415b.remove(e);
                    HashSet hashSet = new HashSet(this.f31416c);
                    hashSet.remove(e);
                    this.f31416c = Collections.unmodifiableSet(hashSet);
                } else {
                    this.f31415b.put(e, Integer.valueOf(num.intValue() - 1));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
