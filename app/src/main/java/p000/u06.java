package p000;

import android.content.Context;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.firestore.AbstractC3595a;
import com.google.firebase.firestore.C3603f;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import p000.a08;
import p000.j65;
import p000.xj2;

/* JADX INFO: loaded from: classes5.dex */
public final class u06 {

    /* JADX INFO: renamed from: m */
    public static final String f86464m = "FirestoreClient";

    /* JADX INFO: renamed from: n */
    public static final int f86465n = 100;

    /* JADX INFO: renamed from: a */
    public final ri3 f86466a;

    /* JADX INFO: renamed from: b */
    public final t83<syh> f86467b;

    /* JADX INFO: renamed from: c */
    public final t83<String> f86468c;

    /* JADX INFO: renamed from: d */
    public final ga0 f86469d;

    /* JADX INFO: renamed from: e */
    public final eh1 f86470e;

    /* JADX INFO: renamed from: f */
    public jqc f86471f;

    /* JADX INFO: renamed from: g */
    public qe9 f86472g;

    /* JADX INFO: renamed from: h */
    public wyd f86473h;

    /* JADX INFO: renamed from: i */
    public shg f86474i;

    /* JADX INFO: renamed from: j */
    public j65 f86475j;

    /* JADX INFO: renamed from: k */
    @hib
    public uoe f86476k;

    /* JADX INFO: renamed from: l */
    @hib
    public uoe f86477l;

    public u06(final Context context, ri3 ri3Var, t83<syh> t83Var, t83<String> t83Var2, final ga0 ga0Var, @hib final nc7 nc7Var, final xj2 xj2Var) {
        this.f86466a = ri3Var;
        this.f86467b = t83Var;
        this.f86468c = t83Var2;
        this.f86469d = ga0Var;
        this.f86470e = new eh1(new nyd(ri3Var.getDatabaseId()));
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        ga0Var.enqueueAndForget(new Runnable() { // from class: f06
            @Override // java.lang.Runnable
            public final void run() {
                this.f34630a.lambda$new$0(taskCompletionSource, context, xj2Var, nc7Var);
            }
        });
        t83Var.setChangeListener(new pa9() { // from class: h06
            @Override // p000.pa9
            public final void onValue(Object obj) {
                this.f41923a.lambda$new$2(atomicBoolean, taskCompletionSource, ga0Var, (syh) obj);
            }
        });
        t83Var2.setChangeListener(new pa9() { // from class: i06
            @Override // p000.pa9
            public final void onValue(Object obj) {
                u06.lambda$new$3((String) obj);
            }
        });
    }

    private void initialize(Context context, syh syhVar, xj2 xj2Var, nc7 nc7Var) {
        fj9.debug(f86464m, "Initializing. user=%s", syhVar.getUid());
        xj2Var.initialize(new xj2.C15148a(context, this.f86469d, this.f86466a, syhVar, 100, this.f86467b, this.f86468c, nc7Var));
        this.f86471f = xj2Var.getPersistence();
        this.f86477l = xj2Var.getGarbageCollectionScheduler();
        this.f86472g = xj2Var.getLocalStore();
        this.f86473h = xj2Var.getRemoteStore();
        this.f86474i = xj2Var.getSyncEngine();
        this.f86475j = xj2Var.getEventManager();
        a08 indexBackfiller = xj2Var.getIndexBackfiller();
        uoe uoeVar = this.f86477l;
        if (uoeVar != null) {
            uoeVar.start();
        }
        if (indexBackfiller != null) {
            a08.C0002a scheduler = indexBackfiller.getScheduler();
            this.f86476k = scheduler;
            scheduler.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$addSnapshotsInSyncListener$18(b65 b65Var) {
        this.f86475j.addSnapshotsInSyncListener(b65Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$configureFieldIndexes$21(List list) {
        this.f86472g.configureFieldIndexes(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$deleteAllFieldIndexes$23() {
        this.f86472g.deleteAllFieldIndexes();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$disableNetwork$4() {
        this.f86473h.disableNetwork();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$enableNetwork$5() {
        this.f86473h.enableNetwork();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ph4 lambda$getDocumentFromLocalCache$10(Task task) throws Exception {
        ph4 ph4Var = (ph4) task.getResult();
        if (ph4Var.isFoundDocument()) {
            return ph4Var;
        }
        if (ph4Var.isNoDocument()) {
            return null;
        }
        throw new C3603f("Failed to get document from cache. (However, this document may exist on the server. Run again without setting source to CACHE to attempt to retrieve the document from the server.)", C3603f.a.UNAVAILABLE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ph4 lambda$getDocumentFromLocalCache$9(ci4 ci4Var) throws Exception {
        return this.f86472g.readDocument(ci4Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ lbi lambda$getDocumentsFromLocalCache$11(nld nldVar) throws Exception {
        qmd qmdVarExecuteQuery = this.f86472g.executeQuery(nldVar, true);
        g8i g8iVar = new g8i(nldVar, qmdVarExecuteQuery.getRemoteKeys());
        return g8iVar.applyChanges(g8iVar.computeDocChanges(qmdVarExecuteQuery.getDocuments())).getSnapshot();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getNamedQuery$20(String str, TaskCompletionSource taskCompletionSource) {
        c9b namedQuery = this.f86472g.getNamedQuery(str);
        if (namedQuery == null) {
            taskCompletionSource.setResult(null);
        } else {
            kmg target = namedQuery.getBundledQuery().getTarget();
            taskCompletionSource.setResult(new nld(target.getPath(), target.getCollectionGroup(), target.getFilters(), target.getOrderBy(), target.getLimit(), namedQuery.getBundledQuery().getLimitType(), target.getStartAt(), target.getEndAt()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$listen$7(nmd nmdVar) {
        this.f86475j.addQueryListener(nmdVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadBundle$19(dh1 dh1Var, ec9 ec9Var) {
        this.f86474i.loadBundle(dh1Var, ec9Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(TaskCompletionSource taskCompletionSource, Context context, xj2 xj2Var, nc7 nc7Var) {
        try {
            initialize(context, (syh) Tasks.await(taskCompletionSource.getTask()), xj2Var, nc7Var);
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$1(syh syhVar) {
        r80.hardAssert(this.f86474i != null, "SyncEngine not yet initialized", new Object[0]);
        fj9.debug(f86464m, "Credential changed. Current user: %s", syhVar.getUid());
        this.f86474i.handleCredentialChange(syhVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$2(AtomicBoolean atomicBoolean, TaskCompletionSource taskCompletionSource, ga0 ga0Var, final syh syhVar) {
        if (!atomicBoolean.compareAndSet(false, true)) {
            ga0Var.enqueueAndForget(new Runnable() { // from class: b06
                @Override // java.lang.Runnable
                public final void run() {
                    this.f12321a.lambda$new$1(syhVar);
                }
            });
        } else {
            r80.hardAssert(!taskCompletionSource.getTask().isComplete(), "Already fulfilled first user task", new Object[0]);
            taskCompletionSource.setResult(syhVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$new$3(String str) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$removeSnapshotsInSyncListener$24(b65 b65Var) {
        this.f86475j.removeSnapshotsInSyncListener(b65Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$runAggregateQuery$16(nld nldVar, List list, final TaskCompletionSource taskCompletionSource) {
        this.f86474i.runAggregateQuery(nldVar, list).addOnSuccessListener(new OnSuccessListener() { // from class: p06
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                taskCompletionSource.setResult((Map) obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: q06
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                taskCompletionSource.setException(exc);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setIndexAutoCreationEnabled$22(boolean z) {
        this.f86472g.setIndexAutoCreationEnabled(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$stopListening$8(nmd nmdVar) {
        this.f86475j.removeQueryListener(nmdVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$terminate$6() {
        this.f86473h.shutdown();
        this.f86471f.shutdown();
        uoe uoeVar = this.f86477l;
        if (uoeVar != null) {
            uoeVar.stop();
        }
        uoe uoeVar2 = this.f86476k;
        if (uoeVar2 != null) {
            uoeVar2.stop();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task lambda$transaction$13(hdh hdhVar, pz6 pz6Var) throws Exception {
        return this.f86474i.transaction(this.f86469d, hdhVar, pz6Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$waitForPendingWrites$17(TaskCompletionSource taskCompletionSource) {
        this.f86474i.registerPendingWritesTask(taskCompletionSource);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$write$12(List list, TaskCompletionSource taskCompletionSource) {
        this.f86474i.writeMutations(list, taskCompletionSource);
    }

    private void verifyNotTerminated() {
        if (isTerminated()) {
            throw new IllegalStateException("The client has already been terminated");
        }
    }

    public void addSnapshotsInSyncListener(final b65<Void> b65Var) {
        verifyNotTerminated();
        this.f86469d.enqueueAndForget(new Runnable() { // from class: zz5
            @Override // java.lang.Runnable
            public final void run() {
                this.f106572a.lambda$addSnapshotsInSyncListener$18(b65Var);
            }
        });
    }

    public Task<Void> configureFieldIndexes(final List<ir5> list) {
        verifyNotTerminated();
        return this.f86469d.enqueue(new Runnable() { // from class: c06
            @Override // java.lang.Runnable
            public final void run() {
                this.f15424a.lambda$configureFieldIndexes$21(list);
            }
        });
    }

    public void deleteAllFieldIndexes() {
        verifyNotTerminated();
        this.f86469d.enqueueAndForget(new Runnable() { // from class: t06
            @Override // java.lang.Runnable
            public final void run() {
                this.f83298a.lambda$deleteAllFieldIndexes$23();
            }
        });
    }

    public Task<Void> disableNetwork() {
        verifyNotTerminated();
        return this.f86469d.enqueue(new Runnable() { // from class: j06
            @Override // java.lang.Runnable
            public final void run() {
                this.f49235a.lambda$disableNetwork$4();
            }
        });
    }

    public Task<Void> enableNetwork() {
        verifyNotTerminated();
        return this.f86469d.enqueue(new Runnable() { // from class: d06
            @Override // java.lang.Runnable
            public final void run() {
                this.f28133a.lambda$enableNetwork$5();
            }
        });
    }

    @igg({"TaskMainThread"})
    public Task<ph4> getDocumentFromLocalCache(final ci4 ci4Var) {
        verifyNotTerminated();
        return this.f86469d.enqueue(new Callable() { // from class: xz5
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f99774a.lambda$getDocumentFromLocalCache$9(ci4Var);
            }
        }).continueWith(new Continuation() { // from class: yz5
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return u06.lambda$getDocumentFromLocalCache$10(task);
            }
        });
    }

    public Task<lbi> getDocumentsFromLocalCache(final nld nldVar) {
        verifyNotTerminated();
        return this.f86469d.enqueue(new Callable() { // from class: vz5
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f92864a.lambda$getDocumentsFromLocalCache$11(nldVar);
            }
        });
    }

    public Task<nld> getNamedQuery(final String str) {
        verifyNotTerminated();
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f86469d.enqueueAndForget(new Runnable() { // from class: n06
            @Override // java.lang.Runnable
            public final void run() {
                this.f62886a.lambda$getNamedQuery$20(str, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    public boolean isTerminated() {
        return this.f86469d.isShuttingDown();
    }

    public nmd listen(nld nldVar, j65.C7752b c7752b, b65<lbi> b65Var) {
        verifyNotTerminated();
        final nmd nmdVar = new nmd(nldVar, c7752b, b65Var);
        this.f86469d.enqueueAndForget(new Runnable() { // from class: k06
            @Override // java.lang.Runnable
            public final void run() {
                this.f52322a.lambda$listen$7(nmdVar);
            }
        });
        return nmdVar;
    }

    public void loadBundle(InputStream inputStream, final ec9 ec9Var) {
        verifyNotTerminated();
        final dh1 dh1Var = new dh1(this.f86470e, inputStream);
        this.f86469d.enqueueAndForget(new Runnable() { // from class: wz5
            @Override // java.lang.Runnable
            public final void run() {
                this.f95843a.lambda$loadBundle$19(dh1Var, ec9Var);
            }
        });
    }

    public void removeSnapshotsInSyncListener(final b65<Void> b65Var) {
        this.f86469d.enqueueAndForget(new Runnable() { // from class: m06
            @Override // java.lang.Runnable
            public final void run() {
                this.f59526a.lambda$removeSnapshotsInSyncListener$24(b65Var);
            }
        });
    }

    @igg({"TaskMainThread"})
    public Task<Map<String, b2i>> runAggregateQuery(final nld nldVar, final List<AbstractC3595a> list) {
        verifyNotTerminated();
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f86469d.enqueueAndForget(new Runnable() { // from class: l06
            @Override // java.lang.Runnable
            public final void run() {
                this.f55845a.lambda$runAggregateQuery$16(nldVar, list, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    public void setIndexAutoCreationEnabled(final boolean z) {
        verifyNotTerminated();
        this.f86469d.enqueueAndForget(new Runnable() { // from class: r06
            @Override // java.lang.Runnable
            public final void run() {
                this.f76635a.lambda$setIndexAutoCreationEnabled$22(z);
            }
        });
    }

    public void stopListening(final nmd nmdVar) {
        this.f86469d.enqueueAndForget(new Runnable() { // from class: o06
            @Override // java.lang.Runnable
            public final void run() {
                this.f66165a.lambda$stopListening$8(nmdVar);
            }
        });
    }

    public Task<Void> terminate() {
        this.f86467b.removeChangeListener();
        this.f86468c.removeChangeListener();
        return this.f86469d.enqueueAndInitiateShutdown(new Runnable() { // from class: e06
            @Override // java.lang.Runnable
            public final void run() {
                this.f31419a.lambda$terminate$6();
            }
        });
    }

    public <TResult> Task<TResult> transaction(final hdh hdhVar, final pz6<cdh, Task<TResult>> pz6Var) {
        verifyNotTerminated();
        return ga0.callTask(this.f86469d.getExecutor(), new Callable() { // from class: s06
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f80268a.lambda$transaction$13(hdhVar, pz6Var);
            }
        });
    }

    public Task<Void> waitForPendingWrites() {
        verifyNotTerminated();
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f86469d.enqueueAndForget(new Runnable() { // from class: a06
            @Override // java.lang.Runnable
            public final void run() {
                this.f3a.lambda$waitForPendingWrites$17(taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    public Task<Void> write(final List<m7b> list) {
        verifyNotTerminated();
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f86469d.enqueueAndForget(new Runnable() { // from class: g06
            @Override // java.lang.Runnable
            public final void run() {
                this.f38106a.lambda$write$12(list, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }
}
