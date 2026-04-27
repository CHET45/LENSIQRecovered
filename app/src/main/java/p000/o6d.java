package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class o6d {

    /* JADX INFO: renamed from: a */
    public final Map<p6d, Integer> f66559a;

    /* JADX INFO: renamed from: b */
    public final List<p6d> f66560b;

    /* JADX INFO: renamed from: c */
    public int f66561c;

    /* JADX INFO: renamed from: d */
    public int f66562d;

    public o6d(Map<p6d, Integer> map) {
        this.f66559a = map;
        this.f66560b = new ArrayList(map.keySet());
        Iterator<Integer> it = map.values().iterator();
        while (it.hasNext()) {
            this.f66561c += it.next().intValue();
        }
    }

    public int getSize() {
        return this.f66561c;
    }

    public boolean isEmpty() {
        return this.f66561c == 0;
    }

    public p6d remove() {
        p6d p6dVar = this.f66560b.get(this.f66562d);
        Integer num = this.f66559a.get(p6dVar);
        if (num.intValue() == 1) {
            this.f66559a.remove(p6dVar);
            this.f66560b.remove(this.f66562d);
        } else {
            this.f66559a.put(p6dVar, Integer.valueOf(num.intValue() - 1));
        }
        this.f66561c--;
        this.f66562d = this.f66560b.isEmpty() ? 0 : (this.f66562d + 1) % this.f66560b.size();
        return p6dVar;
    }
}
