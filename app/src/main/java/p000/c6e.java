package p000;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class c6e {

    /* JADX INFO: renamed from: a */
    public final List<String> f15855a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public final Map<String, List<C2214a<?, ?>>> f15856b = new HashMap();

    /* JADX INFO: renamed from: c6e$a */
    public static class C2214a<T, R> {

        /* JADX INFO: renamed from: a */
        public final Class<T> f15857a;

        /* JADX INFO: renamed from: b */
        public final Class<R> f15858b;

        /* JADX INFO: renamed from: c */
        public final b6e<T, R> f15859c;

        public C2214a(@efb Class<T> cls, @efb Class<R> cls2, b6e<T, R> b6eVar) {
            this.f15857a = cls;
            this.f15858b = cls2;
            this.f15859c = b6eVar;
        }

        public boolean handles(@efb Class<?> cls, @efb Class<?> cls2) {
            return this.f15857a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f15858b);
        }
    }

    @efb
    private synchronized List<C2214a<?, ?>> getOrAddEntryList(@efb String str) {
        List<C2214a<?, ?>> arrayList;
        try {
            if (!this.f15855a.contains(str)) {
                this.f15855a.add(str);
            }
            arrayList = this.f15856b.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                this.f15856b.put(str, arrayList);
            }
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    public synchronized <T, R> void append(@efb String str, @efb b6e<T, R> b6eVar, @efb Class<T> cls, @efb Class<R> cls2) {
        getOrAddEntryList(str).add(new C2214a<>(cls, cls2, b6eVar));
    }

    @efb
    public synchronized <T, R> List<b6e<T, R>> getDecoders(@efb Class<T> cls, @efb Class<R> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator<String> it = this.f15855a.iterator();
        while (it.hasNext()) {
            List<C2214a<?, ?>> list = this.f15856b.get(it.next());
            if (list != null) {
                for (C2214a<?, ?> c2214a : list) {
                    if (c2214a.handles(cls, cls2)) {
                        arrayList.add(c2214a.f15859c);
                    }
                }
            }
        }
        return arrayList;
    }

    @efb
    public synchronized <T, R> List<Class<R>> getResourceClasses(@efb Class<T> cls, @efb Class<R> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator<String> it = this.f15855a.iterator();
        while (it.hasNext()) {
            List<C2214a<?, ?>> list = this.f15856b.get(it.next());
            if (list != null) {
                for (C2214a<?, ?> c2214a : list) {
                    if (c2214a.handles(cls, cls2) && !arrayList.contains(c2214a.f15858b)) {
                        arrayList.add(c2214a.f15858b);
                    }
                }
            }
        }
        return arrayList;
    }

    public synchronized <T, R> void prepend(@efb String str, @efb b6e<T, R> b6eVar, @efb Class<T> cls, @efb Class<R> cls2) {
        getOrAddEntryList(str).add(0, new C2214a<>(cls, cls2, b6eVar));
    }

    public synchronized void setBucketPriorityList(@efb List<String> list) {
        try {
            ArrayList<String> arrayList = new ArrayList(this.f15855a);
            this.f15855a.clear();
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                this.f15855a.add(it.next());
            }
            for (String str : arrayList) {
                if (!list.contains(str)) {
                    this.f15855a.add(str);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
