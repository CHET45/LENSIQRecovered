package p000;

import com.google.firebase.Timestamp;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import p000.ir5;

/* JADX INFO: loaded from: classes5.dex */
public class ld9 {

    /* JADX INFO: renamed from: a */
    public final kyd f57246a;

    /* JADX INFO: renamed from: b */
    public final s7b f57247b;

    /* JADX INFO: renamed from: c */
    public final gi4 f57248c;

    /* JADX INFO: renamed from: d */
    public final f08 f57249d;

    public ld9(kyd kydVar, s7b s7bVar, gi4 gi4Var, f08 f08Var) {
        this.f57246a = kydVar;
        this.f57247b = s7bVar;
        this.f57248c = gi4Var;
        this.f57249d = f08Var;
    }

    private Map<ci4, q9c> computeViews(Map<ci4, t4b> map, Map<ci4, n9c> map2, Set<ci4> set) {
        HashMap map3 = new HashMap();
        HashMap map4 = new HashMap();
        for (t4b t4bVar : map.values()) {
            n9c n9cVar = map2.get(t4bVar.getKey());
            if (set.contains(t4bVar.getKey()) && (n9cVar == null || (n9cVar.getMutation() instanceof uic))) {
                map3.put(t4bVar.getKey(), t4bVar);
            } else if (n9cVar != null) {
                map4.put(t4bVar.getKey(), n9cVar.getMutation().getFieldMask());
                n9cVar.getMutation().applyToLocalView(t4bVar, n9cVar.getMutation().getFieldMask(), Timestamp.now());
            } else {
                map4.put(t4bVar.getKey(), or5.f68369b);
            }
        }
        map4.putAll(recalculateAndSaveOverlays(map3));
        HashMap map5 = new HashMap();
        for (Map.Entry<ci4, t4b> entry : map.entrySet()) {
            map5.put(entry.getKey(), new q9c(entry.getValue(), (or5) map4.get(entry.getKey())));
        }
        return map5;
    }

    private t4b getBaseDocument(ci4 ci4Var, @hib n9c n9cVar) {
        return (n9cVar == null || (n9cVar.getMutation() instanceof uic)) ? this.f57246a.get(ci4Var) : t4b.newInvalidDocument(ci4Var);
    }

    private ky7<ci4, ph4> getDocumentsMatchingCollectionGroupQuery(nld nldVar, ir5.AbstractC7571a abstractC7571a, @hib pld pldVar) {
        r80.hardAssert(nldVar.getPath().isEmpty(), "Currently we only support collection group queries at the root.", new Object[0]);
        String collectionGroup = nldVar.getCollectionGroup();
        ky7<ci4, ph4> ky7VarEmptyDocumentMap = uh4.emptyDocumentMap();
        Iterator<s6e> it = this.f57249d.getCollectionParents(collectionGroup).iterator();
        while (it.hasNext()) {
            for (Map.Entry<ci4, ph4> entry : getDocumentsMatchingCollectionQuery(nldVar.asCollectionQueryAtPath(it.next().append(collectionGroup)), abstractC7571a, pldVar)) {
                ky7VarEmptyDocumentMap = ky7VarEmptyDocumentMap.insert(entry.getKey(), entry.getValue());
            }
        }
        return ky7VarEmptyDocumentMap;
    }

    private ky7<ci4, ph4> getDocumentsMatchingCollectionQuery(nld nldVar, ir5.AbstractC7571a abstractC7571a, @hib pld pldVar) {
        Map<ci4, n9c> overlays = this.f57248c.getOverlays(nldVar.getPath(), abstractC7571a.getLargestBatchId());
        Map<ci4, t4b> documentsMatchingQuery = this.f57246a.getDocumentsMatchingQuery(nldVar, abstractC7571a, overlays.keySet(), pldVar);
        for (Map.Entry<ci4, n9c> entry : overlays.entrySet()) {
            if (!documentsMatchingQuery.containsKey(entry.getKey())) {
                documentsMatchingQuery.put(entry.getKey(), t4b.newInvalidDocument(entry.getKey()));
            }
        }
        ky7<ci4, ph4> ky7VarEmptyDocumentMap = uh4.emptyDocumentMap();
        for (Map.Entry<ci4, t4b> entry2 : documentsMatchingQuery.entrySet()) {
            n9c n9cVar = overlays.get(entry2.getKey());
            if (n9cVar != null) {
                n9cVar.getMutation().applyToLocalView(entry2.getValue(), or5.f68369b, Timestamp.now());
            }
            if (nldVar.matches(entry2.getValue())) {
                ky7VarEmptyDocumentMap = ky7VarEmptyDocumentMap.insert(entry2.getKey(), entry2.getValue());
            }
        }
        return ky7VarEmptyDocumentMap;
    }

    private ky7<ci4, ph4> getDocumentsMatchingDocumentQuery(s6e s6eVar) {
        ky7<ci4, ph4> ky7VarEmptyDocumentMap = uh4.emptyDocumentMap();
        ph4 ph4VarM16095a = m16095a(ci4.fromPath(s6eVar));
        return ph4VarM16095a.isFoundDocument() ? ky7VarEmptyDocumentMap.insert(ph4VarM16095a.getKey(), ph4VarM16095a) : ky7VarEmptyDocumentMap;
    }

    private void populateOverlays(Map<ci4, n9c> map, Set<ci4> set) {
        TreeSet treeSet = new TreeSet();
        for (ci4 ci4Var : set) {
            if (!map.containsKey(ci4Var)) {
                treeSet.add(ci4Var);
            }
        }
        map.putAll(this.f57248c.getOverlays(treeSet));
    }

    private Map<ci4, or5> recalculateAndSaveOverlays(Map<ci4, t4b> map) {
        List<n7b> allMutationBatchesAffectingDocumentKeys = this.f57247b.getAllMutationBatchesAffectingDocumentKeys(map.keySet());
        HashMap map2 = new HashMap();
        TreeMap treeMap = new TreeMap();
        for (n7b n7bVar : allMutationBatchesAffectingDocumentKeys) {
            for (ci4 ci4Var : n7bVar.getKeys()) {
                t4b t4bVar = map.get(ci4Var);
                if (t4bVar != null) {
                    map2.put(ci4Var, n7bVar.applyToLocalView(t4bVar, map2.containsKey(ci4Var) ? (or5) map2.get(ci4Var) : or5.f68369b));
                    int batchId = n7bVar.getBatchId();
                    if (!treeMap.containsKey(Integer.valueOf(batchId))) {
                        treeMap.put(Integer.valueOf(batchId), new HashSet());
                    }
                    ((Set) treeMap.get(Integer.valueOf(batchId))).add(ci4Var);
                }
            }
        }
        HashSet hashSet = new HashSet();
        for (Map.Entry entry : treeMap.descendingMap().entrySet()) {
            HashMap map3 = new HashMap();
            for (ci4 ci4Var2 : (Set) entry.getValue()) {
                if (!hashSet.contains(ci4Var2)) {
                    m7b m7bVarCalculateOverlayMutation = m7b.calculateOverlayMutation(map.get(ci4Var2), (or5) map2.get(ci4Var2));
                    if (m7bVarCalculateOverlayMutation != null) {
                        map3.put(ci4Var2, m7bVarCalculateOverlayMutation);
                    }
                    hashSet.add(ci4Var2);
                }
            }
            this.f57248c.saveOverlays(((Integer) entry.getKey()).intValue(), map3);
        }
        return map2;
    }

    /* JADX INFO: renamed from: a */
    public ph4 m16095a(ci4 ci4Var) {
        n9c overlay = this.f57248c.getOverlay(ci4Var);
        t4b baseDocument = getBaseDocument(ci4Var, overlay);
        if (overlay != null) {
            overlay.getMutation().applyToLocalView(baseDocument, or5.f68369b, Timestamp.now());
        }
        return baseDocument;
    }

    @fdi
    /* JADX INFO: renamed from: b */
    public gi4 m16096b() {
        return this.f57248c;
    }

    /* JADX INFO: renamed from: c */
    public ky7<ci4, ph4> m16097c(Iterable<ci4> iterable) {
        return m16100f(this.f57246a.getAll(iterable), new HashSet());
    }

    /* JADX INFO: renamed from: d */
    public ky7<ci4, ph4> m16098d(nld nldVar, ir5.AbstractC7571a abstractC7571a) {
        return m16099e(nldVar, abstractC7571a, null);
    }

    /* JADX INFO: renamed from: e */
    public ky7<ci4, ph4> m16099e(nld nldVar, ir5.AbstractC7571a abstractC7571a, @hib pld pldVar) {
        return nldVar.isDocumentQuery() ? getDocumentsMatchingDocumentQuery(nldVar.getPath()) : nldVar.isCollectionGroupQuery() ? getDocumentsMatchingCollectionGroupQuery(nldVar, abstractC7571a, pldVar) : getDocumentsMatchingCollectionQuery(nldVar, abstractC7571a, pldVar);
    }

    /* JADX INFO: renamed from: f */
    public ky7<ci4, ph4> m16100f(Map<ci4, t4b> map, Set<ci4> set) {
        HashMap map2 = new HashMap();
        populateOverlays(map2, map.keySet());
        ky7<ci4, ph4> ky7VarEmptyDocumentMap = uh4.emptyDocumentMap();
        for (Map.Entry<ci4, q9c> entry : computeViews(map, map2, set).entrySet()) {
            ky7VarEmptyDocumentMap = ky7VarEmptyDocumentMap.insert(entry.getKey(), entry.getValue().getDocument());
        }
        return ky7VarEmptyDocumentMap;
    }

    @fdi
    /* JADX INFO: renamed from: g */
    public s7b m16101g() {
        return this.f57247b;
    }

    /* JADX INFO: renamed from: h */
    public kd9 m16102h(String str, ir5.AbstractC7571a abstractC7571a, int i) {
        Map<ci4, t4b> all = this.f57246a.getAll(str, abstractC7571a, i);
        Map<ci4, n9c> overlays = i - all.size() > 0 ? this.f57248c.getOverlays(str, abstractC7571a.getLargestBatchId(), i - all.size()) : new HashMap<>();
        int iMax = -1;
        for (n9c n9cVar : overlays.values()) {
            if (!all.containsKey(n9cVar.getKey())) {
                all.put(n9cVar.getKey(), getBaseDocument(n9cVar.getKey(), n9cVar));
            }
            iMax = Math.max(iMax, n9cVar.getLargestBatchId());
        }
        populateOverlays(overlays, all.keySet());
        return kd9.fromOverlayedDocuments(iMax, computeViews(all, overlays, Collections.emptySet()));
    }

    /* JADX INFO: renamed from: i */
    public Map<ci4, q9c> m16103i(Map<ci4, t4b> map) {
        HashMap map2 = new HashMap();
        populateOverlays(map2, map.keySet());
        return computeViews(map, map2, new HashSet());
    }

    @fdi
    /* JADX INFO: renamed from: j */
    public kyd m16104j() {
        return this.f57246a;
    }

    /* JADX INFO: renamed from: k */
    public void m16105k(Set<ci4> set) {
        recalculateAndSaveOverlays(this.f57246a.getAll(set));
    }
}
