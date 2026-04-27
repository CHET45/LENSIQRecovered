package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p000.cj4;
import p000.jhi;
import p000.q81;
import p000.xpg;

/* JADX INFO: loaded from: classes5.dex */
public class khi {

    /* JADX INFO: renamed from: g */
    public static final String f54157g = "WatchChangeAggregator";

    /* JADX INFO: renamed from: a */
    public final InterfaceC8370c f54158a;

    /* JADX INFO: renamed from: b */
    public final Map<Integer, ing> f54159b = new HashMap();

    /* JADX INFO: renamed from: c */
    public Map<ci4, t4b> f54160c = new HashMap();

    /* JADX INFO: renamed from: d */
    public Map<ci4, Set<Integer>> f54161d = new HashMap();

    /* JADX INFO: renamed from: e */
    public Map<Integer, pmd> f54162e = new HashMap();

    /* JADX INFO: renamed from: f */
    public final qi3 f54163f;

    /* JADX INFO: renamed from: khi$a */
    public static /* synthetic */ class C8368a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f54164a;

        static {
            int[] iArr = new int[jhi.EnumC7908e.values().length];
            f54164a = iArr;
            try {
                iArr[jhi.EnumC7908e.NoChange.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f54164a[jhi.EnumC7908e.Added.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f54164a[jhi.EnumC7908e.Removed.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f54164a[jhi.EnumC7908e.Current.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f54164a[jhi.EnumC7908e.Reset.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: renamed from: khi$b */
    public enum EnumC8369b {
        SUCCESS,
        SKIPPED,
        FALSE_POSITIVE
    }

    /* JADX INFO: renamed from: khi$c */
    public interface InterfaceC8370c {
        qy7<ci4> getRemoteKeysForTarget(int i);

        @hib
        vmg getTargetDataForTarget(int i);
    }

    public khi(qi3 qi3Var, InterfaceC8370c interfaceC8370c) {
        this.f54163f = qi3Var;
        this.f54158a = interfaceC8370c;
    }

    private void addDocumentToTarget(int i, t4b t4bVar) {
        if (isActiveTarget(i)) {
            ensureTargetState(i).m13219a(t4bVar.getKey(), targetContainsDocument(i, t4bVar.getKey()) ? cj4.EnumC2330a.MODIFIED : cj4.EnumC2330a.ADDED);
            this.f54160c.put(t4bVar.getKey(), t4bVar);
            ensureDocumentTargetMapping(t4bVar.getKey()).add(Integer.valueOf(i));
        }
    }

    private EnumC8369b applyBloomFilter(q81 q81Var, jhi.C7906c c7906c, int i) {
        return c7906c.getExistenceFilter().getCount() == i - filterRemovedDocuments(q81Var, c7906c.getTargetId()) ? EnumC8369b.SUCCESS : EnumC8369b.FALSE_POSITIVE;
    }

    private Set<Integer> ensureDocumentTargetMapping(ci4 ci4Var) {
        Set<Integer> set = this.f54161d.get(ci4Var);
        if (set != null) {
            return set;
        }
        HashSet hashSet = new HashSet();
        this.f54161d.put(ci4Var, hashSet);
        return hashSet;
    }

    private ing ensureTargetState(int i) {
        ing ingVar = this.f54159b.get(Integer.valueOf(i));
        if (ingVar != null) {
            return ingVar;
        }
        ing ingVar2 = new ing();
        this.f54159b.put(Integer.valueOf(i), ingVar2);
        return ingVar2;
    }

    private int filterRemovedDocuments(q81 q81Var, int i) {
        qy7<ci4> remoteKeysForTarget = this.f54158a.getRemoteKeysForTarget(i);
        String str = "projects/" + this.f54163f.getProjectId() + "/databases/" + this.f54163f.getDatabaseId() + "/documents/";
        int i2 = 0;
        for (ci4 ci4Var : remoteKeysForTarget) {
            if (!q81Var.mightContain(str + ci4Var.getPath().canonicalString())) {
                removeDocumentFromTarget(i, ci4Var, null);
                i2++;
            }
        }
        return i2;
    }

    private int getCurrentDocumentCountForTarget(int i) {
        tmg tmgVarM13228j = ensureTargetState(i).m13228j();
        return (this.f54158a.getRemoteKeysForTarget(i).size() + tmgVarM13228j.getAddedDocuments().size()) - tmgVarM13228j.getRemovedDocuments().size();
    }

    private Collection<Integer> getTargetIds(jhi.C7907d c7907d) {
        List<Integer> targetIds = c7907d.getTargetIds();
        if (!targetIds.isEmpty()) {
            return targetIds;
        }
        ArrayList arrayList = new ArrayList();
        for (Integer num : this.f54159b.keySet()) {
            if (isActiveTarget(num.intValue())) {
                arrayList.add(num);
            }
        }
        return arrayList;
    }

    private boolean isActiveTarget(int i) {
        return queryDataForActiveTarget(i) != null;
    }

    @hib
    private q81 parseBloomFilter(jhi.C7906c c7906c) {
        r81 unchangedNames = c7906c.getExistenceFilter().getUnchangedNames();
        if (unchangedNames != null && unchangedNames.hasBits()) {
            try {
                q81 q81VarCreate = q81.create(unchangedNames.getBits().getBitmap(), unchangedNames.getBits().getPadding(), unchangedNames.getHashCount());
                if (q81VarCreate.m20114a() == 0) {
                    return null;
                }
                return q81VarCreate;
            } catch (q81.C11343a e) {
                fj9.warn(f54157g, "Applying bloom filter failed: (" + e.getMessage() + "); ignoring the bloom filter and falling back to full re-query.", new Object[0]);
            }
        }
        return null;
    }

    @hib
    private vmg queryDataForActiveTarget(int i) {
        ing ingVar = this.f54159b.get(Integer.valueOf(i));
        if (ingVar == null || !ingVar.m13223e()) {
            return this.f54158a.getTargetDataForTarget(i);
        }
        return null;
    }

    private void removeDocumentFromTarget(int i, ci4 ci4Var, @hib t4b t4bVar) {
        if (isActiveTarget(i)) {
            ing ingVarEnsureTargetState = ensureTargetState(i);
            if (targetContainsDocument(i, ci4Var)) {
                ingVarEnsureTargetState.m13219a(ci4Var, cj4.EnumC2330a.REMOVED);
            } else {
                ingVarEnsureTargetState.m13227i(ci4Var);
            }
            ensureDocumentTargetMapping(ci4Var).add(Integer.valueOf(i));
            if (t4bVar != null) {
                this.f54160c.put(ci4Var, t4bVar);
            }
        }
    }

    private void resetTarget(int i) {
        r80.hardAssert((this.f54159b.get(Integer.valueOf(i)) == null || this.f54159b.get(Integer.valueOf(i)).m13223e()) ? false : true, "Should only reset active targets", new Object[0]);
        this.f54159b.put(Integer.valueOf(i), new ing());
        Iterator<ci4> it = this.f54158a.getRemoteKeysForTarget(i).iterator();
        while (it.hasNext()) {
            removeDocumentFromTarget(i, it.next(), null);
        }
    }

    private boolean targetContainsDocument(int i, ci4 ci4Var) {
        return this.f54158a.getRemoteKeysForTarget(i).contains(ci4Var);
    }

    /* JADX INFO: renamed from: a */
    public void m14749a(int i) {
        ensureTargetState(i).m13225g();
    }

    /* JADX INFO: renamed from: b */
    public void m14750b(int i) {
        this.f54159b.remove(Integer.valueOf(i));
    }

    public myd createRemoteEvent(euf eufVar) {
        HashMap map = new HashMap();
        for (Map.Entry<Integer, ing> entry : this.f54159b.entrySet()) {
            Integer key = entry.getKey();
            int iIntValue = key.intValue();
            ing value = entry.getValue();
            vmg vmgVarQueryDataForActiveTarget = queryDataForActiveTarget(iIntValue);
            if (vmgVarQueryDataForActiveTarget != null) {
                if (value.m13222d() && vmgVarQueryDataForActiveTarget.getTarget().isDocumentQuery()) {
                    ci4 ci4VarFromPath = ci4.fromPath(vmgVarQueryDataForActiveTarget.getTarget().getPath());
                    if (this.f54160c.get(ci4VarFromPath) == null && !targetContainsDocument(iIntValue, ci4VarFromPath)) {
                        removeDocumentFromTarget(iIntValue, ci4VarFromPath, t4b.newNoDocument(ci4VarFromPath, eufVar));
                    }
                }
                if (value.m13221c()) {
                    map.put(key, value.m13228j());
                    value.m13220b();
                }
            }
        }
        HashSet hashSet = new HashSet();
        for (Map.Entry<ci4, Set<Integer>> entry2 : this.f54161d.entrySet()) {
            ci4 key2 = entry2.getKey();
            Iterator<Integer> it = entry2.getValue().iterator();
            while (true) {
                if (!it.hasNext()) {
                    hashSet.add(key2);
                    break;
                }
                vmg vmgVarQueryDataForActiveTarget2 = queryDataForActiveTarget(it.next().intValue());
                if (vmgVarQueryDataForActiveTarget2 == null || vmgVarQueryDataForActiveTarget2.getPurpose().equals(pmd.LIMBO_RESOLUTION)) {
                }
            }
        }
        Iterator<t4b> it2 = this.f54160c.values().iterator();
        while (it2.hasNext()) {
            it2.next().setReadTime(eufVar);
        }
        myd mydVar = new myd(eufVar, Collections.unmodifiableMap(map), Collections.unmodifiableMap(this.f54162e), Collections.unmodifiableMap(this.f54160c), Collections.unmodifiableSet(hashSet));
        this.f54160c = new HashMap();
        this.f54161d = new HashMap();
        this.f54162e = new HashMap();
        return mydVar;
    }

    public void handleDocumentChange(jhi.C7905b c7905b) {
        t4b newDocument = c7905b.getNewDocument();
        ci4 documentKey = c7905b.getDocumentKey();
        Iterator<Integer> it = c7905b.getUpdatedTargetIds().iterator();
        while (it.hasNext()) {
            int iIntValue = it.next().intValue();
            if (newDocument == null || !newDocument.isFoundDocument()) {
                removeDocumentFromTarget(iIntValue, documentKey, newDocument);
            } else {
                addDocumentToTarget(iIntValue, newDocument);
            }
        }
        Iterator<Integer> it2 = c7905b.getRemovedTargetIds().iterator();
        while (it2.hasNext()) {
            removeDocumentFromTarget(it2.next().intValue(), documentKey, c7905b.getNewDocument());
        }
    }

    public void handleExistenceFilter(jhi.C7906c c7906c) {
        int targetId = c7906c.getTargetId();
        int count = c7906c.getExistenceFilter().getCount();
        vmg vmgVarQueryDataForActiveTarget = queryDataForActiveTarget(targetId);
        if (vmgVarQueryDataForActiveTarget != null) {
            kmg target = vmgVarQueryDataForActiveTarget.getTarget();
            if (target.isDocumentQuery()) {
                if (count != 0) {
                    r80.hardAssert(count == 1, "Single document existence filter with count: %d", Integer.valueOf(count));
                    return;
                } else {
                    ci4 ci4VarFromPath = ci4.fromPath(target.getPath());
                    removeDocumentFromTarget(targetId, ci4VarFromPath, t4b.newNoDocument(ci4VarFromPath, euf.f34067b));
                    return;
                }
            }
            int currentDocumentCountForTarget = getCurrentDocumentCountForTarget(targetId);
            if (currentDocumentCountForTarget != count) {
                q81 bloomFilter = parseBloomFilter(c7906c);
                EnumC8369b enumC8369bApplyBloomFilter = bloomFilter != null ? applyBloomFilter(bloomFilter, c7906c, currentDocumentCountForTarget) : EnumC8369b.SKIPPED;
                if (enumC8369bApplyBloomFilter != EnumC8369b.SUCCESS) {
                    resetTarget(targetId);
                    this.f54162e.put(Integer.valueOf(targetId), enumC8369bApplyBloomFilter == EnumC8369b.FALSE_POSITIVE ? pmd.EXISTENCE_FILTER_MISMATCH_BLOOM : pmd.EXISTENCE_FILTER_MISMATCH);
                }
                xpg.m25378c().m25380d(xpg.AbstractC15246b.m25384e(currentDocumentCountForTarget, c7906c.getExistenceFilter(), this.f54163f, bloomFilter, enumC8369bApplyBloomFilter));
            }
        }
    }

    public void handleTargetChange(jhi.C7907d c7907d) {
        Iterator<Integer> it = getTargetIds(c7907d).iterator();
        while (it.hasNext()) {
            int iIntValue = it.next().intValue();
            ing ingVarEnsureTargetState = ensureTargetState(iIntValue);
            int i = C8368a.f54164a[c7907d.getChangeType().ordinal()];
            if (i != 1) {
                if (i == 2) {
                    ingVarEnsureTargetState.m13226h();
                    if (!ingVarEnsureTargetState.m13223e()) {
                        ingVarEnsureTargetState.m13220b();
                    }
                    ingVarEnsureTargetState.m13229k(c7907d.getResumeToken());
                } else if (i == 3) {
                    ingVarEnsureTargetState.m13226h();
                    if (!ingVarEnsureTargetState.m13223e()) {
                        m14750b(iIntValue);
                    }
                    r80.hardAssert(c7907d.getCause() == null, "WatchChangeAggregator does not handle errored targets", new Object[0]);
                } else if (i != 4) {
                    if (i != 5) {
                        throw r80.fail("Unknown target watch change state: %s", c7907d.getChangeType());
                    }
                    if (isActiveTarget(iIntValue)) {
                        resetTarget(iIntValue);
                        ingVarEnsureTargetState.m13229k(c7907d.getResumeToken());
                    }
                } else if (isActiveTarget(iIntValue)) {
                    ingVarEnsureTargetState.m13224f();
                    ingVarEnsureTargetState.m13229k(c7907d.getResumeToken());
                }
            } else if (isActiveTarget(iIntValue)) {
                ingVarEnsureTargetState.m13229k(c7907d.getResumeToken());
            }
        }
    }
}
