package p000;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes5.dex */
public class mqa implements gi4 {

    /* JADX INFO: renamed from: a */
    public final TreeMap<ci4, n9c> f61741a = new TreeMap<>();

    /* JADX INFO: renamed from: b */
    public final Map<Integer, Set<ci4>> f61742b = new HashMap();

    private void saveOverlay(int i, m7b m7bVar) {
        n9c n9cVar = this.f61741a.get(m7bVar.getKey());
        if (n9cVar != null) {
            this.f61742b.get(Integer.valueOf(n9cVar.getLargestBatchId())).remove(m7bVar.getKey());
        }
        this.f61741a.put(m7bVar.getKey(), n9c.create(i, m7bVar));
        if (this.f61742b.get(Integer.valueOf(i)) == null) {
            this.f61742b.put(Integer.valueOf(i), new HashSet());
        }
        this.f61742b.get(Integer.valueOf(i)).add(m7bVar.getKey());
    }

    @Override // p000.gi4
    @hib
    public n9c getOverlay(ci4 ci4Var) {
        return this.f61741a.get(ci4Var);
    }

    @Override // p000.gi4
    public Map<ci4, n9c> getOverlays(SortedSet<ci4> sortedSet) {
        HashMap map = new HashMap();
        for (ci4 ci4Var : sortedSet) {
            n9c n9cVar = this.f61741a.get(ci4Var);
            if (n9cVar != null) {
                map.put(ci4Var, n9cVar);
            }
        }
        return map;
    }

    @Override // p000.gi4
    public void removeOverlaysForBatchId(int i) {
        if (this.f61742b.containsKey(Integer.valueOf(i))) {
            Set<ci4> set = this.f61742b.get(Integer.valueOf(i));
            this.f61742b.remove(Integer.valueOf(i));
            Iterator<ci4> it = set.iterator();
            while (it.hasNext()) {
                this.f61741a.remove(it.next());
            }
        }
    }

    @Override // p000.gi4
    public void saveOverlays(int i, Map<ci4, m7b> map) {
        for (Map.Entry<ci4, m7b> entry : map.entrySet()) {
            saveOverlay(i, (m7b) x7d.checkNotNull(entry.getValue(), "null value for key: %s", entry.getKey()));
        }
    }

    @Override // p000.gi4
    public Map<ci4, n9c> getOverlays(s6e s6eVar, int i) {
        HashMap map = new HashMap();
        int length = s6eVar.length() + 1;
        for (n9c n9cVar : this.f61741a.tailMap(ci4.fromPath(s6eVar.append(""))).values()) {
            ci4 key = n9cVar.getKey();
            if (!s6eVar.isPrefixOf(key.getPath())) {
                break;
            }
            if (key.getPath().length() == length && n9cVar.getLargestBatchId() > i) {
                map.put(n9cVar.getKey(), n9cVar);
            }
        }
        return map;
    }

    @Override // p000.gi4
    public Map<ci4, n9c> getOverlays(String str, int i, int i2) {
        TreeMap treeMap = new TreeMap();
        for (n9c n9cVar : this.f61741a.values()) {
            if (n9cVar.getKey().getCollectionGroup().equals(str) && n9cVar.getLargestBatchId() > i) {
                Map map = (Map) treeMap.get(Integer.valueOf(n9cVar.getLargestBatchId()));
                if (map == null) {
                    map = new HashMap();
                    treeMap.put(Integer.valueOf(n9cVar.getLargestBatchId()), map);
                }
                map.put(n9cVar.getKey(), n9cVar);
            }
        }
        HashMap map2 = new HashMap();
        Iterator it = treeMap.values().iterator();
        while (it.hasNext()) {
            map2.putAll((Map) it.next());
            if (map2.size() >= i2) {
                break;
            }
        }
        return map2;
    }
}
