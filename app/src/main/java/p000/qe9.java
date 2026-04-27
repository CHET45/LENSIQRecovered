package p000;

import android.util.SparseArray;
import com.google.firebase.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import p000.wp9;

/* JADX INFO: loaded from: classes5.dex */
public final class qe9 implements ng1 {

    /* JADX INFO: renamed from: o */
    public static final long f74228o = TimeUnit.MINUTES.toSeconds(5);

    /* JADX INFO: renamed from: a */
    public final jqc f74229a;

    /* JADX INFO: renamed from: b */
    public v77 f74230b;

    /* JADX INFO: renamed from: c */
    public f08 f74231c;

    /* JADX INFO: renamed from: d */
    public s7b f74232d;

    /* JADX INFO: renamed from: e */
    public gi4 f74233e;

    /* JADX INFO: renamed from: f */
    public final kyd f74234f;

    /* JADX INFO: renamed from: g */
    public ld9 f74235g;

    /* JADX INFO: renamed from: h */
    public final qld f74236h;

    /* JADX INFO: renamed from: i */
    public final rvd f74237i;

    /* JADX INFO: renamed from: j */
    public final rmg f74238j;

    /* JADX INFO: renamed from: k */
    public final mg1 f74239k;

    /* JADX INFO: renamed from: l */
    public final SparseArray<vmg> f74240l;

    /* JADX INFO: renamed from: m */
    public final Map<kmg, Integer> f74241m;

    /* JADX INFO: renamed from: n */
    public final zmg f74242n;

    /* JADX INFO: renamed from: qe9$b */
    public static class C11457b {

        /* JADX INFO: renamed from: a */
        public vmg f74243a;

        /* JADX INFO: renamed from: b */
        public int f74244b;

        private C11457b() {
        }
    }

    /* JADX INFO: renamed from: qe9$c */
    public static class C11458c {

        /* JADX INFO: renamed from: a */
        public final Map<ci4, t4b> f74245a;

        /* JADX INFO: renamed from: b */
        public final Set<ci4> f74246b;

        private C11458c(Map<ci4, t4b> map, Set<ci4> set) {
            this.f74245a = map;
            this.f74246b = set;
        }
    }

    public qe9(jqc jqcVar, qld qldVar, syh syhVar) {
        r80.hardAssert(jqcVar.isStarted(), "LocalStore was passed an unstarted persistence implementation", new Object[0]);
        this.f74229a = jqcVar;
        this.f74236h = qldVar;
        this.f74230b = jqcVar.mo14243c();
        rmg rmgVarMo14248h = jqcVar.mo14248h();
        this.f74238j = rmgVarMo14248h;
        this.f74239k = jqcVar.mo14241a();
        this.f74242n = zmg.forTargetCache(rmgVarMo14248h.getHighestTargetId());
        this.f74234f = jqcVar.mo14247g();
        rvd rvdVar = new rvd();
        this.f74237i = rvdVar;
        this.f74240l = new SparseArray<>();
        this.f74241m = new HashMap();
        jqcVar.getReferenceDelegate().setInMemoryPins(rvdVar);
        initializeUserComponents(syhVar);
    }

    private void applyWriteToRemoteDocuments(o7b o7bVar) {
        n7b batch = o7bVar.getBatch();
        for (ci4 ci4Var : batch.getKeys()) {
            t4b t4bVar = this.f74234f.get(ci4Var);
            euf eufVar = o7bVar.getDocVersions().get(ci4Var);
            r80.hardAssert(eufVar != null, "docVersions should contain every doc in the write.", new Object[0]);
            if (t4bVar.getVersion().compareTo(eufVar) < 0) {
                batch.applyToRemoteDocument(t4bVar, o7bVar);
                if (t4bVar.isValidDocument()) {
                    this.f74234f.add(t4bVar, o7bVar.getCommitVersion());
                }
            }
        }
        this.f74232d.removeMutationBatch(batch);
    }

    @efb
    private Set<ci4> getKeysWithTransformResults(o7b o7bVar) {
        HashSet hashSet = new HashSet();
        for (int i = 0; i < o7bVar.getMutationResults().size(); i++) {
            if (!o7bVar.getMutationResults().get(i).getTransformResults().isEmpty()) {
                hashSet.add(o7bVar.getBatch().getMutations().get(i).getKey());
            }
        }
        return hashSet;
    }

    private void initializeUserComponents(syh syhVar) {
        f08 f08VarMo14244d = this.f74229a.mo14244d(syhVar);
        this.f74231c = f08VarMo14244d;
        this.f74232d = this.f74229a.mo14245e(syhVar, f08VarMo14244d);
        gi4 gi4VarMo14242b = this.f74229a.mo14242b(syhVar);
        this.f74233e = gi4VarMo14242b;
        this.f74235g = new ld9(this.f74234f, this.f74232d, gi4VarMo14242b, this.f74231c);
        this.f74234f.setIndexManager(this.f74231c);
        this.f74236h.initialize(this.f74235g, this.f74231c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ky7 lambda$acknowledgeBatch$3(o7b o7bVar) {
        n7b batch = o7bVar.getBatch();
        this.f74232d.acknowledgeBatch(batch, o7bVar.getStreamToken());
        applyWriteToRemoteDocuments(o7bVar);
        this.f74232d.performConsistencyCheck();
        this.f74233e.removeOverlaysForBatchId(o7bVar.getBatch().getBatchId());
        this.f74235g.m16105k(getKeysWithTransformResults(o7bVar));
        return this.f74235g.m16097c(batch.getKeys());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$allocateTarget$8(C11457b c11457b, kmg kmgVar) {
        int iNextId = this.f74242n.nextId();
        c11457b.f74244b = iNextId;
        vmg vmgVar = new vmg(kmgVar, iNextId, this.f74229a.getReferenceDelegate().getCurrentSequenceNumber(), pmd.LISTEN);
        c11457b.f74243a = vmgVar;
        this.f74238j.addTargetData(vmgVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ky7 lambda$applyBundledDocuments$11(ky7 ky7Var, vmg vmgVar) {
        qy7<ci4> qy7VarEmptyKeySet = ci4.emptyKeySet();
        HashMap map = new HashMap();
        Iterator it = ky7Var.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            ci4 ci4Var = (ci4) entry.getKey();
            t4b t4bVar = (t4b) entry.getValue();
            if (t4bVar.isFoundDocument()) {
                qy7VarEmptyKeySet = qy7VarEmptyKeySet.insert(ci4Var);
            }
            map.put(ci4Var, t4bVar);
        }
        this.f74238j.removeMatchingKeysForTargetId(vmgVar.getTargetId());
        this.f74238j.addMatchingKeys(qy7VarEmptyKeySet, vmgVar.getTargetId());
        C11458c c11458cPopulateDocumentChanges = populateDocumentChanges(map);
        return this.f74235g.m16100f(c11458cPopulateDocumentChanges.f74245a, c11458cPopulateDocumentChanges.f74246b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ky7 lambda$applyRemoteEvent$6(myd mydVar, euf eufVar) {
        Map<Integer, tmg> targetChanges = mydVar.getTargetChanges();
        long currentSequenceNumber = this.f74229a.getReferenceDelegate().getCurrentSequenceNumber();
        for (Map.Entry<Integer, tmg> entry : targetChanges.entrySet()) {
            Integer key = entry.getKey();
            int iIntValue = key.intValue();
            tmg value = entry.getValue();
            vmg vmgVar = this.f74240l.get(iIntValue);
            if (vmgVar != null) {
                this.f74238j.removeMatchingKeys(value.getRemovedDocuments(), iIntValue);
                this.f74238j.addMatchingKeys(value.getAddedDocuments(), iIntValue);
                vmg vmgVarWithSequenceNumber = vmgVar.withSequenceNumber(currentSequenceNumber);
                if (mydVar.getTargetMismatches().containsKey(key)) {
                    vj1 vj1Var = vj1.f91344e;
                    euf eufVar2 = euf.f34067b;
                    vmgVarWithSequenceNumber = vmgVarWithSequenceNumber.withResumeToken(vj1Var, eufVar2).withLastLimboFreeSnapshotVersion(eufVar2);
                } else if (!value.getResumeToken().isEmpty()) {
                    vmgVarWithSequenceNumber = vmgVarWithSequenceNumber.withResumeToken(value.getResumeToken(), mydVar.getSnapshotVersion());
                }
                this.f74240l.put(iIntValue, vmgVarWithSequenceNumber);
                if (shouldPersistTargetData(vmgVar, vmgVarWithSequenceNumber, value)) {
                    this.f74238j.updateTargetData(vmgVarWithSequenceNumber);
                }
            }
        }
        Map<ci4, t4b> documentUpdates = mydVar.getDocumentUpdates();
        Set<ci4> resolvedLimboDocuments = mydVar.getResolvedLimboDocuments();
        for (ci4 ci4Var : documentUpdates.keySet()) {
            if (resolvedLimboDocuments.contains(ci4Var)) {
                this.f74229a.getReferenceDelegate().updateLimboDocument(ci4Var);
            }
        }
        C11458c c11458cPopulateDocumentChanges = populateDocumentChanges(documentUpdates);
        Map<ci4, t4b> map = c11458cPopulateDocumentChanges.f74245a;
        euf lastRemoteSnapshotVersion = this.f74238j.getLastRemoteSnapshotVersion();
        if (!eufVar.equals(euf.f34067b)) {
            r80.hardAssert(eufVar.compareTo(lastRemoteSnapshotVersion) >= 0, "Watch stream reverted to previous snapshot?? (%s < %s)", eufVar, lastRemoteSnapshotVersion);
            this.f74238j.setLastRemoteSnapshotVersion(eufVar);
        }
        return this.f74235g.m16100f(map, c11458cPopulateDocumentChanges.f74246b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ wp9.C14737c lambda$collectGarbage$18(wp9 wp9Var) {
        return wp9Var.m24701f(this.f74240l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$configureFieldIndexes$15(List list) {
        Collection<ir5> fieldIndexes = this.f74231c.getFieldIndexes();
        Comparator<ir5> comparator = ir5.f48033e;
        final f08 f08Var = this.f74231c;
        Objects.requireNonNull(f08Var);
        su2 su2Var = new su2() { // from class: vd9
            @Override // p000.su2
            public final void accept(Object obj) {
                f08Var.addFieldIndex((ir5) obj);
            }
        };
        final f08 f08Var2 = this.f74231c;
        Objects.requireNonNull(f08Var2);
        r0i.diffCollections(fieldIndexes, list, comparator, su2Var, new su2() { // from class: ge9
            @Override // p000.su2
            public final void accept(Object obj) {
                f08Var2.deleteFieldIndex((ir5) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$deleteAllFieldIndexes$16() {
        this.f74231c.deleteAllFieldIndexes();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Collection lambda$getFieldIndexes$14() {
        return this.f74231c.getFieldIndexes();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ c9b lambda$getNamedQuery$13(String str) {
        return this.f74239k.getNamedQuery(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean lambda$hasNewerBundle$9(ah1 ah1Var) {
        ah1 bundleMetadata = this.f74239k.getBundleMetadata(ah1Var.getBundleId());
        return Boolean.valueOf(bundleMetadata != null && bundleMetadata.getCreateTime().compareTo(ah1Var.getCreateTime()) >= 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$notifyLocalViewChanges$7(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ve9 ve9Var = (ve9) it.next();
            int targetId = ve9Var.getTargetId();
            this.f74237i.addReferences(ve9Var.getAdded(), targetId);
            qy7<ci4> removed = ve9Var.getRemoved();
            Iterator<ci4> it2 = removed.iterator();
            while (it2.hasNext()) {
                this.f74229a.getReferenceDelegate().removeReference(it2.next());
            }
            this.f74237i.removeReferences(removed, targetId);
            if (!ve9Var.isFromCache()) {
                vmg vmgVar = this.f74240l.get(targetId);
                r80.hardAssert(vmgVar != null, "Can't set limbo-free snapshot version for unknown target: %s", Integer.valueOf(targetId));
                vmg vmgVarWithLastLimboFreeSnapshotVersion = vmgVar.withLastLimboFreeSnapshotVersion(vmgVar.getSnapshotVersion());
                this.f74240l.put(targetId, vmgVarWithLastLimboFreeSnapshotVersion);
                if (shouldPersistTargetData(vmgVar, vmgVarWithLastLimboFreeSnapshotVersion, null)) {
                    this.f74238j.updateTargetData(vmgVarWithLastLimboFreeSnapshotVersion);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ky7 lambda$rejectBatch$4(int i) {
        n7b n7bVarLookupMutationBatch = this.f74232d.lookupMutationBatch(i);
        r80.hardAssert(n7bVarLookupMutationBatch != null, "Attempt to reject nonexistent batch!", new Object[0]);
        this.f74232d.removeMutationBatch(n7bVarLookupMutationBatch);
        this.f74232d.performConsistencyCheck();
        this.f74233e.removeOverlaysForBatchId(i);
        this.f74235g.m16105k(n7bVarLookupMutationBatch.getKeys());
        return this.f74235g.m16097c(n7bVarLookupMutationBatch.getKeys());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$releaseTarget$17(int i) {
        vmg vmgVar = this.f74240l.get(i);
        r80.hardAssert(vmgVar != null, "Tried to release nonexistent target: %s", Integer.valueOf(i));
        Iterator<ci4> it = this.f74237i.removeReferencesForId(i).iterator();
        while (it.hasNext()) {
            this.f74229a.getReferenceDelegate().removeReference(it.next());
        }
        this.f74229a.getReferenceDelegate().removeTarget(vmgVar);
        this.f74240l.remove(i);
        this.f74241m.remove(vmgVar.getTarget());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$saveBundle$10(ah1 ah1Var) {
        this.f74239k.saveBundleMetadata(ah1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$saveNamedQuery$12(c9b c9bVar, vmg vmgVar, int i, qy7 qy7Var) {
        if (c9bVar.getReadTime().compareTo(vmgVar.getSnapshotVersion()) > 0) {
            vmg vmgVarWithResumeToken = vmgVar.withResumeToken(vj1.f91344e, c9bVar.getReadTime());
            this.f74240l.append(i, vmgVarWithResumeToken);
            this.f74238j.updateTargetData(vmgVarWithResumeToken);
            this.f74238j.removeMatchingKeysForTargetId(i);
            this.f74238j.addMatchingKeys(qy7Var, i);
        }
        this.f74239k.saveNamedQuery(c9bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setLastStreamToken$5(vj1 vj1Var) {
        this.f74232d.setLastStreamToken(vj1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startIndexManager$0() {
        this.f74231c.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startMutationQueue$1() {
        this.f74232d.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ kd9 lambda$writeLocally$2(Set set, List list, Timestamp timestamp) {
        Map<ci4, t4b> all = this.f74234f.getAll(set);
        HashSet hashSet = new HashSet();
        for (Map.Entry<ci4, t4b> entry : all.entrySet()) {
            if (!entry.getValue().isValidDocument()) {
                hashSet.add(entry.getKey());
            }
        }
        Map<ci4, q9c> mapM16103i = this.f74235g.m16103i(all);
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            m7b m7bVar = (m7b) it.next();
            nkb nkbVarExtractTransformBaseValue = m7bVar.extractTransformBaseValue(mapM16103i.get(m7bVar.getKey()).getDocument());
            if (nkbVarExtractTransformBaseValue != null) {
                arrayList.add(new uic(m7bVar.getKey(), nkbVarExtractTransformBaseValue, nkbVarExtractTransformBaseValue.getFieldMask(), n7d.exists(true)));
            }
        }
        n7b n7bVarAddMutationBatch = this.f74232d.addMutationBatch(timestamp, arrayList, list);
        this.f74233e.saveOverlays(n7bVarAddMutationBatch.getBatchId(), n7bVarAddMutationBatch.applyToLocalDocumentSet(mapM16103i, hashSet));
        return kd9.fromOverlayedDocuments(n7bVarAddMutationBatch.getBatchId(), mapM16103i);
    }

    private static kmg newUmbrellaTarget(String str) {
        return nld.atPath(s6e.fromString("__bundle__/docs/" + str)).toTarget();
    }

    private C11458c populateDocumentChanges(Map<ci4, t4b> map) {
        HashMap map2 = new HashMap();
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        Map<ci4, t4b> all = this.f74234f.getAll(map.keySet());
        for (Map.Entry<ci4, t4b> entry : map.entrySet()) {
            ci4 key = entry.getKey();
            t4b value = entry.getValue();
            t4b t4bVar = all.get(key);
            if (value.isFoundDocument() != t4bVar.isFoundDocument()) {
                hashSet.add(key);
            }
            if (value.isNoDocument() && value.getVersion().equals(euf.f34067b)) {
                arrayList.add(value.getKey());
                map2.put(key, value);
            } else if (!t4bVar.isValidDocument() || value.getVersion().compareTo(t4bVar.getVersion()) > 0 || (value.getVersion().compareTo(t4bVar.getVersion()) == 0 && t4bVar.hasPendingWrites())) {
                r80.hardAssert(!euf.f34067b.equals(value.getReadTime()), "Cannot add a document when the remote version is zero", new Object[0]);
                this.f74234f.add(value, value.getReadTime());
                map2.put(key, value);
            } else {
                fj9.debug("LocalStore", "Ignoring outdated watch update for %s.Current version: %s  Watch version: %s", key, t4bVar.getVersion(), value.getVersion());
            }
        }
        this.f74234f.removeAll(arrayList);
        return new C11458c(map2, hashSet);
    }

    private static boolean shouldPersistTargetData(vmg vmgVar, vmg vmgVar2, @hib tmg tmgVar) {
        if (vmgVar.getResumeToken().isEmpty()) {
            return true;
        }
        long seconds = vmgVar2.getSnapshotVersion().getTimestamp().getSeconds() - vmgVar.getSnapshotVersion().getTimestamp().getSeconds();
        long j = f74228o;
        if (seconds < j && vmgVar2.getLastLimboFreeSnapshotVersion().getTimestamp().getSeconds() - vmgVar.getLastLimboFreeSnapshotVersion().getTimestamp().getSeconds() < j) {
            return tmgVar != null && (tmgVar.getAddedDocuments().size() + tmgVar.getModifiedDocuments().size()) + tmgVar.getRemovedDocuments().size() > 0;
        }
        return true;
    }

    private void startIndexManager() {
        this.f74229a.mo14250j("Start IndexManager", new Runnable() { // from class: xd9
            @Override // java.lang.Runnable
            public final void run() {
                this.f97555a.lambda$startIndexManager$0();
            }
        });
    }

    private void startMutationQueue() {
        this.f74229a.mo14250j("Start MutationQueue", new Runnable() { // from class: be9
            @Override // java.lang.Runnable
            public final void run() {
                this.f13550a.lambda$startMutationQueue$1();
            }
        });
    }

    public ky7<ci4, ph4> acknowledgeBatch(final o7b o7bVar) {
        return (ky7) this.f74229a.mo14249i("Acknowledge batch", new mfg() { // from class: ae9
            @Override // p000.mfg
            public final Object get() {
                return this.f1256a.lambda$acknowledgeBatch$3(o7bVar);
            }
        });
    }

    public vmg allocateTarget(final kmg kmgVar) {
        int targetId;
        vmg targetData = this.f74238j.getTargetData(kmgVar);
        if (targetData != null) {
            targetId = targetData.getTargetId();
        } else {
            final C11457b c11457b = new C11457b();
            this.f74229a.mo14250j("Allocate target", new Runnable() { // from class: ce9
                @Override // java.lang.Runnable
                public final void run() {
                    this.f16380a.lambda$allocateTarget$8(c11457b, kmgVar);
                }
            });
            targetId = c11457b.f74244b;
            targetData = c11457b.f74243a;
        }
        if (this.f74240l.get(targetId) == null) {
            this.f74240l.put(targetId, targetData);
            this.f74241m.put(kmgVar, Integer.valueOf(targetId));
        }
        return targetData;
    }

    @Override // p000.ng1
    public ky7<ci4, ph4> applyBundledDocuments(final ky7<ci4, t4b> ky7Var, String str) {
        final vmg vmgVarAllocateTarget = allocateTarget(newUmbrellaTarget(str));
        return (ky7) this.f74229a.mo14249i("Apply bundle documents", new mfg() { // from class: ke9
            @Override // p000.mfg
            public final Object get() {
                return this.f53777a.lambda$applyBundledDocuments$11(ky7Var, vmgVarAllocateTarget);
            }
        });
    }

    public ky7<ci4, ph4> applyRemoteEvent(final myd mydVar) {
        final euf snapshotVersion = mydVar.getSnapshotVersion();
        return (ky7) this.f74229a.mo14249i("Apply remote event", new mfg() { // from class: je9
            @Override // p000.mfg
            public final Object get() {
                return this.f50389a.lambda$applyRemoteEvent$6(mydVar, snapshotVersion);
            }
        });
    }

    public wp9.C14737c collectGarbage(final wp9 wp9Var) {
        return (wp9.C14737c) this.f74229a.mo14249i("Collect garbage", new mfg() { // from class: ie9
            @Override // p000.mfg
            public final Object get() {
                return this.f46698a.lambda$collectGarbage$18(wp9Var);
            }
        });
    }

    public void configureFieldIndexes(final List<ir5> list) {
        this.f74229a.mo14250j("Configure indexes", new Runnable() { // from class: ne9
            @Override // java.lang.Runnable
            public final void run() {
                this.f64138a.lambda$configureFieldIndexes$15(list);
            }
        });
    }

    public void deleteAllFieldIndexes() {
        this.f74229a.mo14250j("Delete All Indexes", new Runnable() { // from class: le9
            @Override // java.lang.Runnable
            public final void run() {
                this.f57380a.lambda$deleteAllFieldIndexes$16();
            }
        });
    }

    public qmd executeQuery(nld nldVar, boolean z) {
        qy7<ci4> matchingKeysForTargetId;
        euf lastLimboFreeSnapshotVersion;
        vmg vmgVarM20311u = m20311u(nldVar.toTarget());
        euf eufVar = euf.f34067b;
        qy7<ci4> qy7VarEmptyKeySet = ci4.emptyKeySet();
        if (vmgVarM20311u != null) {
            lastLimboFreeSnapshotVersion = vmgVarM20311u.getLastLimboFreeSnapshotVersion();
            matchingKeysForTargetId = this.f74238j.getMatchingKeysForTargetId(vmgVarM20311u.getTargetId());
        } else {
            matchingKeysForTargetId = qy7VarEmptyKeySet;
            lastLimboFreeSnapshotVersion = eufVar;
        }
        qld qldVar = this.f74236h;
        if (z) {
            eufVar = lastLimboFreeSnapshotVersion;
        }
        return new qmd(qldVar.getDocumentsMatchingQuery(nldVar, eufVar, matchingKeysForTargetId), matchingKeysForTargetId);
    }

    public int getHighestUnacknowledgedBatchId() {
        return this.f74232d.getHighestUnacknowledgedBatchId();
    }

    public f08 getIndexManagerForCurrentUser() {
        return this.f74231c;
    }

    public euf getLastRemoteSnapshotVersion() {
        return this.f74238j.getLastRemoteSnapshotVersion();
    }

    public vj1 getLastStreamToken() {
        return this.f74232d.getLastStreamToken();
    }

    public ld9 getLocalDocumentsForCurrentUser() {
        return this.f74235g;
    }

    @hib
    public c9b getNamedQuery(final String str) {
        return (c9b) this.f74229a.mo14249i("Get named query", new mfg() { // from class: wd9
            @Override // p000.mfg
            public final Object get() {
                return this.f93983a.lambda$getNamedQuery$13(str);
            }
        });
    }

    @hib
    public n7b getNextMutationBatch(int i) {
        return this.f74232d.getNextMutationBatchAfterBatchId(i);
    }

    public qy7<ci4> getRemoteDocumentKeys(int i) {
        return this.f74238j.getMatchingKeysForTargetId(i);
    }

    public vj1 getSessionToken() {
        return this.f74230b.getSessionsToken();
    }

    public ky7<ci4, ph4> handleUserChange(syh syhVar) {
        List<n7b> allMutationBatches = this.f74232d.getAllMutationBatches();
        initializeUserComponents(syhVar);
        startIndexManager();
        startMutationQueue();
        List<n7b> allMutationBatches2 = this.f74232d.getAllMutationBatches();
        qy7<ci4> qy7VarEmptyKeySet = ci4.emptyKeySet();
        Iterator it = Arrays.asList(allMutationBatches, allMutationBatches2).iterator();
        while (it.hasNext()) {
            Iterator it2 = ((List) it.next()).iterator();
            while (it2.hasNext()) {
                Iterator<m7b> it3 = ((n7b) it2.next()).getMutations().iterator();
                while (it3.hasNext()) {
                    qy7VarEmptyKeySet = qy7VarEmptyKeySet.insert(it3.next().getKey());
                }
            }
        }
        return this.f74235g.m16097c(qy7VarEmptyKeySet);
    }

    public boolean hasNewerBundle(final ah1 ah1Var) {
        return ((Boolean) this.f74229a.mo14249i("Has newer bundle", new mfg() { // from class: me9
            @Override // p000.mfg
            public final Object get() {
                return this.f60764a.lambda$hasNewerBundle$9(ah1Var);
            }
        })).booleanValue();
    }

    public void notifyLocalViewChanges(final List<ve9> list) {
        this.f74229a.mo14250j("notifyLocalViewChanges", new Runnable() { // from class: fe9
            @Override // java.lang.Runnable
            public final void run() {
                this.f36288a.lambda$notifyLocalViewChanges$7(list);
            }
        });
    }

    public ph4 readDocument(ci4 ci4Var) {
        return this.f74235g.m16095a(ci4Var);
    }

    public ky7<ci4, ph4> rejectBatch(final int i) {
        return (ky7) this.f74229a.mo14249i("Reject batch", new mfg() { // from class: ee9
            @Override // p000.mfg
            public final Object get() {
                return this.f32746a.lambda$rejectBatch$4(i);
            }
        });
    }

    public void releaseTarget(final int i) {
        this.f74229a.mo14250j("Release target", new Runnable() { // from class: yd9
            @Override // java.lang.Runnable
            public final void run() {
                this.f101238a.lambda$releaseTarget$17(i);
            }
        });
    }

    @Override // p000.ng1
    public void saveBundle(final ah1 ah1Var) {
        this.f74229a.mo14250j("Save bundle", new Runnable() { // from class: de9
            @Override // java.lang.Runnable
            public final void run() {
                this.f29520a.lambda$saveBundle$10(ah1Var);
            }
        });
    }

    @Override // p000.ng1
    public void saveNamedQuery(final c9b c9bVar, final qy7<ci4> qy7Var) {
        final vmg vmgVarAllocateTarget = allocateTarget(c9bVar.getBundledQuery().getTarget());
        final int targetId = vmgVarAllocateTarget.getTargetId();
        this.f74229a.mo14250j("Saved named query", new Runnable() { // from class: zd9
            @Override // java.lang.Runnable
            public final void run() {
                this.f104845a.lambda$saveNamedQuery$12(c9bVar, vmgVarAllocateTarget, targetId, qy7Var);
            }
        });
    }

    public void setIndexAutoCreationEnabled(boolean z) {
        this.f74236h.setIndexAutoCreationEnabled(z);
    }

    public void setLastStreamToken(final vj1 vj1Var) {
        this.f74229a.mo14250j("Set stream token", new Runnable() { // from class: oe9
            @Override // java.lang.Runnable
            public final void run() {
                this.f67405a.lambda$setLastStreamToken$5(vj1Var);
            }
        });
    }

    public void setSessionsToken(vj1 vj1Var) {
        this.f74230b.setSessionToken(vj1Var);
    }

    public void start() {
        this.f74229a.mo14246f().run();
        startIndexManager();
        startMutationQueue();
    }

    @fdi
    /* JADX INFO: renamed from: t */
    public Collection<ir5> m20310t() {
        return (Collection) this.f74229a.mo14249i("Get indexes", new mfg() { // from class: pe9
            @Override // p000.mfg
            public final Object get() {
                return this.f70557a.lambda$getFieldIndexes$14();
            }
        });
    }

    @hib
    @fdi
    /* JADX INFO: renamed from: u */
    public vmg m20311u(kmg kmgVar) {
        Integer num = this.f74241m.get(kmgVar);
        return num != null ? this.f74240l.get(num.intValue()) : this.f74238j.getTargetData(kmgVar);
    }

    public kd9 writeLocally(final List<m7b> list) {
        final Timestamp timestampNow = Timestamp.now();
        final HashSet hashSet = new HashSet();
        Iterator<m7b> it = list.iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().getKey());
        }
        return (kd9) this.f74229a.mo14249i("Locally write mutations", new mfg() { // from class: he9
            @Override // p000.mfg
            public final Object get() {
                return this.f43252a.lambda$writeLocally$2(hashSet, list, timestampNow);
            }
        });
    }
}
