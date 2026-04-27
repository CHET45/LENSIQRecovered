package p000;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.firestore.AbstractC3595a;
import com.google.firebase.firestore.C3603f;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import p000.g8i;
import p000.lbi;
import p000.n4g;
import p000.s59;
import p000.wyd;

/* JADX INFO: loaded from: classes5.dex */
public class shg implements wyd.InterfaceC14838c {

    /* JADX INFO: renamed from: o */
    public static final String f81850o = "shg";

    /* JADX INFO: renamed from: a */
    public final qe9 f81851a;

    /* JADX INFO: renamed from: b */
    public final wyd f81852b;

    /* JADX INFO: renamed from: e */
    public final int f81855e;

    /* JADX INFO: renamed from: m */
    public syh f81863m;

    /* JADX INFO: renamed from: n */
    public InterfaceC12596c f81864n;

    /* JADX INFO: renamed from: c */
    public final Map<nld, rmd> f81853c = new HashMap();

    /* JADX INFO: renamed from: d */
    public final Map<Integer, List<nld>> f81854d = new HashMap();

    /* JADX INFO: renamed from: f */
    public final LinkedHashSet<ci4> f81856f = new LinkedHashSet<>();

    /* JADX INFO: renamed from: g */
    public final Map<ci4, Integer> f81857g = new HashMap();

    /* JADX INFO: renamed from: h */
    public final Map<Integer, C12595b> f81858h = new HashMap();

    /* JADX INFO: renamed from: i */
    public final rvd f81859i = new rvd();

    /* JADX INFO: renamed from: j */
    public final Map<syh, Map<Integer, TaskCompletionSource<Void>>> f81860j = new HashMap();

    /* JADX INFO: renamed from: l */
    public final zmg f81862l = zmg.forSyncEngine();

    /* JADX INFO: renamed from: k */
    public final Map<Integer, List<TaskCompletionSource<Void>>> f81861k = new HashMap();

    /* JADX INFO: renamed from: shg$a */
    public static /* synthetic */ class C12594a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f81865a;

        static {
            int[] iArr = new int[s59.EnumC12450a.values().length];
            f81865a = iArr;
            try {
                iArr[s59.EnumC12450a.ADDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f81865a[s59.EnumC12450a.REMOVED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: shg$b */
    public static class C12595b {

        /* JADX INFO: renamed from: a */
        public final ci4 f81866a;

        /* JADX INFO: renamed from: b */
        public boolean f81867b;

        public C12595b(ci4 ci4Var) {
            this.f81866a = ci4Var;
        }
    }

    /* JADX INFO: renamed from: shg$c */
    public interface InterfaceC12596c {
        void handleOnlineStateChange(h5c h5cVar);

        void onError(nld nldVar, n4g n4gVar);

        void onViewSnapshots(List<lbi> list);
    }

    public shg(qe9 qe9Var, wyd wydVar, syh syhVar, int i) {
        this.f81851a = qe9Var;
        this.f81852b = wydVar;
        this.f81855e = i;
        this.f81863m = syhVar;
    }

    private void addUserCallback(int i, TaskCompletionSource<Void> taskCompletionSource) {
        Map<Integer, TaskCompletionSource<Void>> map = this.f81860j.get(this.f81863m);
        if (map == null) {
            map = new HashMap<>();
            this.f81860j.put(this.f81863m, map);
        }
        map.put(Integer.valueOf(i), taskCompletionSource);
    }

    private void assertCallback(String str) {
        r80.hardAssert(this.f81864n != null, "Trying to call %s before setting callback", str);
    }

    private void emitNewSnapsAndNotifyLocalStore(ky7<ci4, ph4> ky7Var, @hib myd mydVar) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator<Map.Entry<nld, rmd>> it = this.f81853c.entrySet().iterator();
        while (it.hasNext()) {
            rmd value = it.next().getValue();
            g8i view = value.getView();
            g8i.C6168b c6168bComputeDocChanges = view.computeDocChanges(ky7Var);
            boolean z = false;
            if (c6168bComputeDocChanges.needsRefill()) {
                c6168bComputeDocChanges = view.computeDocChanges(this.f81851a.executeQuery(value.getQuery(), false).getDocuments(), c6168bComputeDocChanges);
            }
            tmg tmgVar = mydVar == null ? null : mydVar.getTargetChanges().get(Integer.valueOf(value.getTargetId()));
            if (mydVar != null && mydVar.getTargetMismatches().get(Integer.valueOf(value.getTargetId())) != null) {
                z = true;
            }
            m8i m8iVarApplyChanges = value.getView().applyChanges(c6168bComputeDocChanges, tmgVar, z);
            updateTrackedLimboDocuments(m8iVarApplyChanges.getLimboChanges(), value.getTargetId());
            if (m8iVarApplyChanges.getSnapshot() != null) {
                arrayList.add(m8iVarApplyChanges.getSnapshot());
                arrayList2.add(ve9.fromViewSnapshot(value.getTargetId(), m8iVarApplyChanges.getSnapshot()));
            }
        }
        this.f81864n.onViewSnapshots(arrayList);
        this.f81851a.notifyLocalViewChanges(arrayList2);
    }

    private boolean errorIsInteresting(n4g n4gVar) {
        n4g.EnumC9694b code = n4gVar.getCode();
        return (code == n4g.EnumC9694b.FAILED_PRECONDITION && (n4gVar.getDescription() != null ? n4gVar.getDescription() : "").contains("requires an index")) || code == n4g.EnumC9694b.PERMISSION_DENIED;
    }

    private void failOutstandingPendingWritesAwaitingTasks() {
        Iterator<Map.Entry<Integer, List<TaskCompletionSource<Void>>>> it = this.f81861k.entrySet().iterator();
        while (it.hasNext()) {
            Iterator<TaskCompletionSource<Void>> it2 = it.next().getValue().iterator();
            while (it2.hasNext()) {
                it2.next().setException(new C3603f("'waitForPendingWrites' task is cancelled due to User change.", C3603f.a.CANCELLED));
            }
        }
        this.f81861k.clear();
    }

    private lbi initializeViewAndComputeSnapshot(nld nldVar, int i, vj1 vj1Var) {
        qmd qmdVarExecuteQuery = this.f81851a.executeQuery(nldVar, true);
        lbi.EnumC8766a syncState = lbi.EnumC8766a.NONE;
        if (this.f81854d.get(Integer.valueOf(i)) != null) {
            syncState = this.f81853c.get(this.f81854d.get(Integer.valueOf(i)).get(0)).getView().getSyncState();
        }
        tmg tmgVarCreateSynthesizedTargetChangeForCurrentChange = tmg.createSynthesizedTargetChangeForCurrentChange(syncState == lbi.EnumC8766a.SYNCED, vj1Var);
        g8i g8iVar = new g8i(nldVar, qmdVarExecuteQuery.getRemoteKeys());
        m8i m8iVarApplyChanges = g8iVar.applyChanges(g8iVar.computeDocChanges(qmdVarExecuteQuery.getDocuments()), tmgVarCreateSynthesizedTargetChangeForCurrentChange);
        updateTrackedLimboDocuments(m8iVarApplyChanges.getLimboChanges(), i);
        this.f81853c.put(nldVar, new rmd(nldVar, i, g8iVar));
        if (!this.f81854d.containsKey(Integer.valueOf(i))) {
            this.f81854d.put(Integer.valueOf(i), new ArrayList(1));
        }
        this.f81854d.get(Integer.valueOf(i)).add(nldVar);
        return m8iVarApplyChanges.getSnapshot();
    }

    private void logErrorIfInteresting(n4g n4gVar, String str, Object... objArr) {
        if (errorIsInteresting(n4gVar)) {
            fj9.warn("Firestore", "%s: %s", String.format(str, objArr), n4gVar);
        }
    }

    private void notifyUser(int i, @hib n4g n4gVar) {
        Integer numValueOf;
        TaskCompletionSource<Void> taskCompletionSource;
        Map<Integer, TaskCompletionSource<Void>> map = this.f81860j.get(this.f81863m);
        if (map == null || (taskCompletionSource = map.get((numValueOf = Integer.valueOf(i)))) == null) {
            return;
        }
        if (n4gVar != null) {
            taskCompletionSource.setException(r0i.exceptionFromStatus(n4gVar));
        } else {
            taskCompletionSource.setResult(null);
        }
        map.remove(numValueOf);
    }

    private void pumpEnqueuedLimboResolutions() {
        while (!this.f81856f.isEmpty() && this.f81857g.size() < this.f81855e) {
            Iterator<ci4> it = this.f81856f.iterator();
            ci4 next = it.next();
            it.remove();
            int iNextId = this.f81862l.nextId();
            this.f81858h.put(Integer.valueOf(iNextId), new C12595b(next));
            this.f81857g.put(next, Integer.valueOf(iNextId));
            this.f81852b.listen(new vmg(nld.atPath(next.getPath()).toTarget(), iNextId, -1L, pmd.LIMBO_RESOLUTION));
        }
    }

    private void removeAndCleanupTarget(int i, n4g n4gVar) {
        for (nld nldVar : this.f81854d.get(Integer.valueOf(i))) {
            this.f81853c.remove(nldVar);
            if (!n4gVar.isOk()) {
                this.f81864n.onError(nldVar, n4gVar);
                logErrorIfInteresting(n4gVar, "Listen for %s failed", nldVar);
            }
        }
        this.f81854d.remove(Integer.valueOf(i));
        qy7<ci4> qy7VarReferencesForId = this.f81859i.referencesForId(i);
        this.f81859i.removeReferencesForId(i);
        for (ci4 ci4Var : qy7VarReferencesForId) {
            if (!this.f81859i.containsKey(ci4Var)) {
                removeLimboTarget(ci4Var);
            }
        }
    }

    private void removeLimboTarget(ci4 ci4Var) {
        this.f81856f.remove(ci4Var);
        Integer num = this.f81857g.get(ci4Var);
        if (num != null) {
            this.f81852b.stopListening(num.intValue());
            this.f81857g.remove(ci4Var);
            this.f81858h.remove(num);
            pumpEnqueuedLimboResolutions();
        }
    }

    private void resolvePendingWriteTasks(int i) {
        if (this.f81861k.containsKey(Integer.valueOf(i))) {
            Iterator<TaskCompletionSource<Void>> it = this.f81861k.get(Integer.valueOf(i)).iterator();
            while (it.hasNext()) {
                it.next().setResult(null);
            }
            this.f81861k.remove(Integer.valueOf(i));
        }
    }

    private void trackLimboChange(s59 s59Var) {
        ci4 key = s59Var.getKey();
        if (this.f81857g.containsKey(key) || this.f81856f.contains(key)) {
            return;
        }
        fj9.debug(f81850o, "New document in limbo: %s", key);
        this.f81856f.add(key);
        pumpEnqueuedLimboResolutions();
    }

    private void updateTrackedLimboDocuments(List<s59> list, int i) {
        for (s59 s59Var : list) {
            int i2 = C12594a.f81865a[s59Var.getType().ordinal()];
            if (i2 == 1) {
                this.f81859i.addReference(s59Var.getKey(), i);
                trackLimboChange(s59Var);
            } else {
                if (i2 != 2) {
                    throw r80.fail("Unknown limbo change type: %s", s59Var.getType());
                }
                fj9.debug(f81850o, "Document no longer in limbo: %s", s59Var.getKey());
                ci4 key = s59Var.getKey();
                this.f81859i.removeReference(key, i);
                if (!this.f81859i.containsKey(key)) {
                    removeLimboTarget(key);
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m22005a(nld nldVar, boolean z) {
        assertCallback("stopListening");
        rmd rmdVar = this.f81853c.get(nldVar);
        r80.hardAssert(rmdVar != null, "Trying to stop listening to a query not found", new Object[0]);
        this.f81853c.remove(nldVar);
        int targetId = rmdVar.getTargetId();
        List<nld> list = this.f81854d.get(Integer.valueOf(targetId));
        list.remove(nldVar);
        if (list.isEmpty()) {
            this.f81851a.releaseTarget(targetId);
            if (z) {
                this.f81852b.stopListening(targetId);
            }
            removeAndCleanupTarget(targetId, n4g.f63258e);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m22006b(nld nldVar) {
        assertCallback("stopListeningToRemoteStore");
        rmd rmdVar = this.f81853c.get(nldVar);
        r80.hardAssert(rmdVar != null, "Trying to stop listening to a query not found", new Object[0]);
        int targetId = rmdVar.getTargetId();
        List<nld> list = this.f81854d.get(Integer.valueOf(targetId));
        list.remove(nldVar);
        if (list.isEmpty()) {
            this.f81852b.stopListening(targetId);
        }
    }

    @fdi
    public Map<ci4, Integer> getActiveLimboDocumentResolutions() {
        return new HashMap(this.f81857g);
    }

    @fdi
    public List<ci4> getEnqueuedLimboDocumentResolutions() {
        return new ArrayList(this.f81856f);
    }

    @Override // p000.wyd.InterfaceC14838c
    public qy7<ci4> getRemoteKeysForTarget(int i) {
        C12595b c12595b = this.f81858h.get(Integer.valueOf(i));
        if (c12595b != null && c12595b.f81867b) {
            return ci4.emptyKeySet().insert(c12595b.f81866a);
        }
        qy7<ci4> qy7VarEmptyKeySet = ci4.emptyKeySet();
        if (this.f81854d.containsKey(Integer.valueOf(i))) {
            for (nld nldVar : this.f81854d.get(Integer.valueOf(i))) {
                if (this.f81853c.containsKey(nldVar)) {
                    qy7VarEmptyKeySet = qy7VarEmptyKeySet.unionWith(this.f81853c.get(nldVar).getView().m11439c());
                }
            }
        }
        return qy7VarEmptyKeySet;
    }

    public void handleCredentialChange(syh syhVar) {
        boolean zEquals = this.f81863m.equals(syhVar);
        this.f81863m = syhVar;
        if (!zEquals) {
            failOutstandingPendingWritesAwaitingTasks();
            emitNewSnapsAndNotifyLocalStore(this.f81851a.handleUserChange(syhVar), null);
        }
        this.f81852b.handleCredentialChange();
    }

    @Override // p000.wyd.InterfaceC14838c
    public void handleOnlineStateChange(h5c h5cVar) {
        assertCallback("handleOnlineStateChange");
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<nld, rmd>> it = this.f81853c.entrySet().iterator();
        while (it.hasNext()) {
            m8i m8iVarApplyOnlineStateChange = it.next().getValue().getView().applyOnlineStateChange(h5cVar);
            r80.hardAssert(m8iVarApplyOnlineStateChange.getLimboChanges().isEmpty(), "OnlineState should not affect limbo documents.", new Object[0]);
            if (m8iVarApplyOnlineStateChange.getSnapshot() != null) {
                arrayList.add(m8iVarApplyOnlineStateChange.getSnapshot());
            }
        }
        this.f81864n.onViewSnapshots(arrayList);
        this.f81864n.handleOnlineStateChange(h5cVar);
    }

    @Override // p000.wyd.InterfaceC14838c
    public void handleRejectedListen(int i, n4g n4gVar) {
        assertCallback("handleRejectedListen");
        C12595b c12595b = this.f81858h.get(Integer.valueOf(i));
        ci4 ci4Var = c12595b != null ? c12595b.f81866a : null;
        if (ci4Var == null) {
            this.f81851a.releaseTarget(i);
            removeAndCleanupTarget(i, n4gVar);
            return;
        }
        this.f81857g.remove(ci4Var);
        this.f81858h.remove(Integer.valueOf(i));
        pumpEnqueuedLimboResolutions();
        euf eufVar = euf.f34067b;
        handleRemoteEvent(new myd(eufVar, Collections.emptyMap(), Collections.emptyMap(), Collections.singletonMap(ci4Var, t4b.newNoDocument(ci4Var, eufVar)), Collections.singleton(ci4Var)));
    }

    @Override // p000.wyd.InterfaceC14838c
    public void handleRejectedWrite(int i, n4g n4gVar) {
        assertCallback("handleRejectedWrite");
        ky7<ci4, ph4> ky7VarRejectBatch = this.f81851a.rejectBatch(i);
        if (!ky7VarRejectBatch.isEmpty()) {
            logErrorIfInteresting(n4gVar, "Write failed at %s", ky7VarRejectBatch.getMinKey().getPath());
        }
        notifyUser(i, n4gVar);
        resolvePendingWriteTasks(i);
        emitNewSnapsAndNotifyLocalStore(ky7VarRejectBatch, null);
    }

    @Override // p000.wyd.InterfaceC14838c
    public void handleRemoteEvent(myd mydVar) {
        assertCallback("handleRemoteEvent");
        for (Map.Entry<Integer, tmg> entry : mydVar.getTargetChanges().entrySet()) {
            Integer key = entry.getKey();
            tmg value = entry.getValue();
            C12595b c12595b = this.f81858h.get(key);
            if (c12595b != null) {
                r80.hardAssert((value.getAddedDocuments().size() + value.getModifiedDocuments().size()) + value.getRemovedDocuments().size() <= 1, "Limbo resolution for single document contains multiple changes.", new Object[0]);
                if (value.getAddedDocuments().size() > 0) {
                    c12595b.f81867b = true;
                } else if (value.getModifiedDocuments().size() > 0) {
                    r80.hardAssert(c12595b.f81867b, "Received change for limbo target document without add.", new Object[0]);
                } else if (value.getRemovedDocuments().size() > 0) {
                    r80.hardAssert(c12595b.f81867b, "Received remove for limbo target document without add.", new Object[0]);
                    c12595b.f81867b = false;
                }
            }
        }
        emitNewSnapsAndNotifyLocalStore(this.f81851a.applyRemoteEvent(mydVar), mydVar);
    }

    @Override // p000.wyd.InterfaceC14838c
    public void handleSuccessfulWrite(o7b o7bVar) {
        assertCallback("handleSuccessfulWrite");
        notifyUser(o7bVar.getBatch().getBatchId(), null);
        resolvePendingWriteTasks(o7bVar.getBatch().getBatchId());
        emitNewSnapsAndNotifyLocalStore(this.f81851a.acknowledgeBatch(o7bVar), null);
    }

    public int listen(nld nldVar, boolean z) {
        assertCallback("listen");
        r80.hardAssert(!this.f81853c.containsKey(nldVar), "We already listen to query: %s", nldVar);
        vmg vmgVarAllocateTarget = this.f81851a.allocateTarget(nldVar.toTarget());
        this.f81864n.onViewSnapshots(Collections.singletonList(initializeViewAndComputeSnapshot(nldVar, vmgVarAllocateTarget.getTargetId(), vmgVarAllocateTarget.getResumeToken())));
        if (z) {
            this.f81852b.listen(vmgVarAllocateTarget);
        }
        return vmgVarAllocateTarget.getTargetId();
    }

    public void listenToRemoteStore(nld nldVar) {
        assertCallback("listenToRemoteStore");
        r80.hardAssert(this.f81853c.containsKey(nldVar), "This is the first listen to query: %s", nldVar);
        this.f81852b.listen(this.f81851a.allocateTarget(nldVar.toTarget()));
    }

    public void loadBundle(dh1 dh1Var, ec9 ec9Var) {
        try {
            try {
                ah1 bundleMetadata = dh1Var.getBundleMetadata();
                if (this.f81851a.hasNewerBundle(bundleMetadata)) {
                    ec9Var.setResult(fc9.forSuccess(bundleMetadata));
                    try {
                        dh1Var.close();
                        return;
                    } catch (IOException e) {
                        fj9.warn("SyncEngine", "Exception while closing bundle", e);
                        return;
                    }
                }
                ec9Var.updateProgress(fc9.forInitial(bundleMetadata));
                yg1 yg1Var = new yg1(this.f81851a, bundleMetadata);
                long j = 0;
                while (true) {
                    sg1 nextElement = dh1Var.getNextElement();
                    if (nextElement == null) {
                        emitNewSnapsAndNotifyLocalStore(yg1Var.applyChanges(), null);
                        this.f81851a.saveBundle(bundleMetadata);
                        ec9Var.setResult(fc9.forSuccess(bundleMetadata));
                        try {
                            dh1Var.close();
                            return;
                        } catch (IOException e2) {
                            fj9.warn("SyncEngine", "Exception while closing bundle", e2);
                            return;
                        }
                    }
                    long bytesRead = dh1Var.getBytesRead();
                    fc9 fc9VarAddElement = yg1Var.addElement(nextElement, bytesRead - j);
                    if (fc9VarAddElement != null) {
                        ec9Var.updateProgress(fc9VarAddElement);
                    }
                    j = bytesRead;
                }
            } catch (Exception e3) {
                fj9.warn("Firestore", "Loading bundle failed : %s", e3);
                ec9Var.setException(new C3603f("Bundle failed to load", C3603f.a.INVALID_ARGUMENT, e3));
                try {
                    dh1Var.close();
                } catch (IOException e4) {
                    fj9.warn("SyncEngine", "Exception while closing bundle", e4);
                }
            }
        } catch (Throwable th) {
            try {
                dh1Var.close();
            } catch (IOException e5) {
                fj9.warn("SyncEngine", "Exception while closing bundle", e5);
            }
            throw th;
        }
    }

    public void registerPendingWritesTask(TaskCompletionSource<Void> taskCompletionSource) {
        if (!this.f81852b.canUseNetwork()) {
            fj9.debug(f81850o, "The network is disabled. The task returned by 'awaitPendingWrites()' will not complete until the network is enabled.", new Object[0]);
        }
        int highestUnacknowledgedBatchId = this.f81851a.getHighestUnacknowledgedBatchId();
        if (highestUnacknowledgedBatchId == -1) {
            taskCompletionSource.setResult(null);
            return;
        }
        if (!this.f81861k.containsKey(Integer.valueOf(highestUnacknowledgedBatchId))) {
            this.f81861k.put(Integer.valueOf(highestUnacknowledgedBatchId), new ArrayList());
        }
        this.f81861k.get(Integer.valueOf(highestUnacknowledgedBatchId)).add(taskCompletionSource);
    }

    public Task<Map<String, b2i>> runAggregateQuery(nld nldVar, List<AbstractC3595a> list) {
        return this.f81852b.runAggregateQuery(nldVar, list);
    }

    public void setCallback(InterfaceC12596c interfaceC12596c) {
        this.f81864n = interfaceC12596c;
    }

    public <TResult> Task<TResult> transaction(ga0 ga0Var, hdh hdhVar, pz6<cdh, Task<TResult>> pz6Var) {
        return new ndh(ga0Var, this.f81852b, hdhVar, pz6Var).run();
    }

    public void writeMutations(List<m7b> list, TaskCompletionSource<Void> taskCompletionSource) {
        assertCallback("writeMutations");
        kd9 kd9VarWriteLocally = this.f81851a.writeLocally(list);
        addUserCallback(kd9VarWriteLocally.getBatchId(), taskCompletionSource);
        emitNewSnapsAndNotifyLocalStore(kd9VarWriteLocally.getDocuments(), null);
        this.f81852b.fillWritePipeline();
    }
}
