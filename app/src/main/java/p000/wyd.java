package p000;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.firestore.AbstractC3595a;
import com.google.firebase.firestore.C3603f;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p000.j5c;
import p000.jhi;
import p000.khi;
import p000.lhi;
import p000.nsi;
import p000.us2;

/* JADX INFO: loaded from: classes5.dex */
public final class wyd implements khi.InterfaceC8370c {

    /* JADX INFO: renamed from: m */
    public static final int f95776m = 10;

    /* JADX INFO: renamed from: n */
    public static final String f95777n = "RemoteStore";

    /* JADX INFO: renamed from: a */
    public final qi3 f95778a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC14838c f95779b;

    /* JADX INFO: renamed from: c */
    public final qe9 f95780c;

    /* JADX INFO: renamed from: d */
    public final zi3 f95781d;

    /* JADX INFO: renamed from: e */
    public final us2 f95782e;

    /* JADX INFO: renamed from: g */
    public final j5c f95784g;

    /* JADX INFO: renamed from: i */
    public final lhi f95786i;

    /* JADX INFO: renamed from: j */
    public final nsi f95787j;

    /* JADX INFO: renamed from: k */
    @hib
    public khi f95788k;

    /* JADX INFO: renamed from: h */
    public boolean f95785h = false;

    /* JADX INFO: renamed from: f */
    public final Map<Integer, vmg> f95783f = new HashMap();

    /* JADX INFO: renamed from: l */
    public final Deque<n7b> f95789l = new ArrayDeque();

    /* JADX INFO: renamed from: wyd$a */
    public class C14836a implements lhi.InterfaceC8819a {
        public C14836a() {
        }

        @Override // p000.m5g.InterfaceC9150b
        public void onClose(n4g n4gVar) {
            wyd.this.handleWatchStreamClose(n4gVar);
        }

        @Override // p000.m5g.InterfaceC9150b
        public void onOpen() {
            wyd.this.handleWatchStreamOpen();
        }

        @Override // p000.lhi.InterfaceC8819a
        public void onWatchChange(euf eufVar, jhi jhiVar) {
            wyd.this.handleWatchChange(eufVar, jhiVar);
        }
    }

    /* JADX INFO: renamed from: wyd$b */
    public class C14837b implements nsi.InterfaceC10049a {
        public C14837b() {
        }

        @Override // p000.m5g.InterfaceC9150b
        public void onClose(n4g n4gVar) {
            wyd.this.handleWriteStreamClose(n4gVar);
        }

        @Override // p000.nsi.InterfaceC10049a
        public void onHandshakeComplete() {
            wyd.this.handleWriteStreamHandshakeComplete();
        }

        @Override // p000.m5g.InterfaceC9150b
        public void onOpen() {
            wyd.this.f95787j.m18124n();
        }

        @Override // p000.nsi.InterfaceC10049a
        public void onWriteResponse(euf eufVar, List<u7b> list) {
            wyd.this.handleWriteStreamMutationResults(eufVar, list);
        }
    }

    /* JADX INFO: renamed from: wyd$c */
    public interface InterfaceC14838c {
        qy7<ci4> getRemoteKeysForTarget(int i);

        void handleOnlineStateChange(h5c h5cVar);

        void handleRejectedListen(int i, n4g n4gVar);

        void handleRejectedWrite(int i, n4g n4gVar);

        void handleRemoteEvent(myd mydVar);

        void handleSuccessfulWrite(o7b o7bVar);
    }

    public wyd(qi3 qi3Var, final InterfaceC14838c interfaceC14838c, qe9 qe9Var, zi3 zi3Var, final ga0 ga0Var, us2 us2Var) {
        this.f95778a = qi3Var;
        this.f95779b = interfaceC14838c;
        this.f95780c = qe9Var;
        this.f95781d = zi3Var;
        this.f95782e = us2Var;
        Objects.requireNonNull(interfaceC14838c);
        this.f95784g = new j5c(ga0Var, new j5c.InterfaceC7742a() { // from class: uyd
            @Override // p000.j5c.InterfaceC7742a
            public final void handleOnlineStateChange(h5c h5cVar) {
                interfaceC14838c.handleOnlineStateChange(h5cVar);
            }
        });
        this.f95786i = zi3Var.m26811d(new C14836a());
        this.f95787j = zi3Var.m26812e(new C14837b());
        us2Var.addCallback(new su2() { // from class: vyd
            @Override // p000.su2
            public final void accept(Object obj) {
                this.f92745a.lambda$new$1(ga0Var, (us2.EnumC13674a) obj);
            }
        });
    }

    private void addToWritePipeline(n7b n7bVar) {
        r80.hardAssert(canAddToWritePipeline(), "addToWritePipeline called when pipeline is full", new Object[0]);
        this.f95789l.add(n7bVar);
        if (this.f95787j.isOpen() && this.f95787j.m18122l()) {
            this.f95787j.m18125o(n7bVar.getMutations());
        }
    }

    private boolean canAddToWritePipeline() {
        return canUseNetwork() && this.f95789l.size() < 10;
    }

    private void cleanUpWatchStreamState() {
        this.f95788k = null;
    }

    private void disableNetworkInternal() {
        this.f95786i.stop();
        this.f95787j.stop();
        if (!this.f95789l.isEmpty()) {
            fj9.debug(f95777n, "Stopping write stream with %d pending writes", Integer.valueOf(this.f95789l.size()));
            this.f95789l.clear();
        }
        cleanUpWatchStreamState();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleWatchChange(euf eufVar, jhi jhiVar) {
        this.f95784g.m13740e(h5c.ONLINE);
        r80.hardAssert((this.f95786i == null || this.f95788k == null) ? false : true, "WatchStream and WatchStreamAggregator should both be non-null", new Object[0]);
        boolean z = jhiVar instanceof jhi.C7907d;
        jhi.C7907d c7907d = z ? (jhi.C7907d) jhiVar : null;
        if (c7907d != null && c7907d.getChangeType().equals(jhi.EnumC7908e.Removed) && c7907d.getCause() != null) {
            processTargetError(c7907d);
            return;
        }
        if (jhiVar instanceof jhi.C7905b) {
            this.f95788k.handleDocumentChange((jhi.C7905b) jhiVar);
        } else if (jhiVar instanceof jhi.C7906c) {
            this.f95788k.handleExistenceFilter((jhi.C7906c) jhiVar);
        } else {
            r80.hardAssert(z, "Expected watchChange to be an instance of WatchTargetChange", new Object[0]);
            this.f95788k.handleTargetChange((jhi.C7907d) jhiVar);
        }
        if (eufVar.equals(euf.f34067b) || eufVar.compareTo(this.f95780c.getLastRemoteSnapshotVersion()) < 0) {
            return;
        }
        raiseWatchSnapshot(eufVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleWatchStreamClose(n4g n4gVar) {
        if (n4gVar.isOk()) {
            r80.hardAssert(!shouldStartWatchStream(), "Watch stream was stopped gracefully while still needed.", new Object[0]);
        }
        cleanUpWatchStreamState();
        if (!shouldStartWatchStream()) {
            this.f95784g.m13740e(h5c.UNKNOWN);
        } else {
            this.f95784g.m13738c(n4gVar);
            startWatchStream();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleWatchStreamOpen() {
        Iterator<vmg> it = this.f95783f.values().iterator();
        while (it.hasNext()) {
            sendWatchRequest(it.next());
        }
    }

    private void handleWriteError(n4g n4gVar) {
        r80.hardAssert(!n4gVar.isOk(), "Handling write error with status OK.", new Object[0]);
        if (zi3.isPermanentWriteError(n4gVar)) {
            n7b n7bVarPoll = this.f95789l.poll();
            this.f95787j.inhibitBackoff();
            this.f95779b.handleRejectedWrite(n7bVarPoll.getBatchId(), n4gVar);
            fillWritePipeline();
        }
    }

    private void handleWriteHandshakeError(n4g n4gVar) {
        r80.hardAssert(!n4gVar.isOk(), "Handling write error with status OK.", new Object[0]);
        if (zi3.isPermanentError(n4gVar)) {
            fj9.debug(f95777n, "RemoteStore error before completed handshake; resetting stream token %s: %s", r0i.toDebugString(this.f95787j.m18121k()), n4gVar);
            nsi nsiVar = this.f95787j;
            vj1 vj1Var = nsi.f65548w;
            nsiVar.m18123m(vj1Var);
            this.f95780c.setLastStreamToken(vj1Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleWriteStreamClose(n4g n4gVar) {
        if (n4gVar.isOk()) {
            r80.hardAssert(!shouldStartWriteStream(), "Write stream was stopped gracefully while still needed.", new Object[0]);
        }
        if (!n4gVar.isOk() && !this.f95789l.isEmpty()) {
            if (this.f95787j.m18122l()) {
                handleWriteError(n4gVar);
            } else {
                handleWriteHandshakeError(n4gVar);
            }
        }
        if (shouldStartWriteStream()) {
            startWriteStream();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleWriteStreamHandshakeComplete() {
        this.f95780c.setLastStreamToken(this.f95787j.m18121k());
        Iterator<n7b> it = this.f95789l.iterator();
        while (it.hasNext()) {
            this.f95787j.m18125o(it.next().getMutations());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleWriteStreamMutationResults(euf eufVar, List<u7b> list) {
        this.f95779b.handleSuccessfulWrite(o7b.create(this.f95789l.poll(), eufVar, list, this.f95787j.m18121k()));
        fillWritePipeline();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(us2.EnumC13674a enumC13674a) {
        if (enumC13674a.equals(us2.EnumC13674a.REACHABLE) && this.f95784g.m13737b().equals(h5c.ONLINE)) {
            return;
        }
        if (!(enumC13674a.equals(us2.EnumC13674a.UNREACHABLE) && this.f95784g.m13737b().equals(h5c.OFFLINE)) && canUseNetwork()) {
            fj9.debug(f95777n, "Restarting streams for network reachability change.", new Object[0]);
            restartNetwork();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$1(ga0 ga0Var, final us2.EnumC13674a enumC13674a) {
        ga0Var.enqueueAndForget(new Runnable() { // from class: tyd
            @Override // java.lang.Runnable
            public final void run() {
                this.f86347a.lambda$new$0(enumC13674a);
            }
        });
    }

    private void processTargetError(jhi.C7907d c7907d) {
        r80.hardAssert(c7907d.getCause() != null, "Processing target error without a cause", new Object[0]);
        for (Integer num : c7907d.getTargetIds()) {
            if (this.f95783f.containsKey(num)) {
                this.f95783f.remove(num);
                this.f95788k.m14750b(num.intValue());
                this.f95779b.handleRejectedListen(num.intValue(), c7907d.getCause());
            }
        }
    }

    private void raiseWatchSnapshot(euf eufVar) {
        r80.hardAssert(!eufVar.equals(euf.f34067b), "Can't raise event for unknown SnapshotVersion", new Object[0]);
        myd mydVarCreateRemoteEvent = this.f95788k.createRemoteEvent(eufVar);
        for (Map.Entry<Integer, tmg> entry : mydVarCreateRemoteEvent.getTargetChanges().entrySet()) {
            tmg value = entry.getValue();
            if (!value.getResumeToken().isEmpty()) {
                Integer key = entry.getKey();
                key.intValue();
                vmg vmgVar = this.f95783f.get(key);
                if (vmgVar != null) {
                    this.f95783f.put(key, vmgVar.withResumeToken(value.getResumeToken(), eufVar));
                }
            }
        }
        for (Map.Entry<Integer, pmd> entry2 : mydVarCreateRemoteEvent.getTargetMismatches().entrySet()) {
            Integer key2 = entry2.getKey();
            int iIntValue = key2.intValue();
            vmg vmgVar2 = this.f95783f.get(key2);
            if (vmgVar2 != null) {
                this.f95783f.put(key2, vmgVar2.withResumeToken(vj1.f91344e, vmgVar2.getSnapshotVersion()));
                sendUnwatchRequest(iIntValue);
                sendWatchRequest(new vmg(vmgVar2.getTarget(), iIntValue, vmgVar2.getSequenceNumber(), entry2.getValue()));
            }
        }
        this.f95779b.handleRemoteEvent(mydVarCreateRemoteEvent);
    }

    private void restartNetwork() {
        this.f95785h = false;
        disableNetworkInternal();
        this.f95784g.m13740e(h5c.UNKNOWN);
        this.f95787j.inhibitBackoff();
        this.f95786i.inhibitBackoff();
        enableNetwork();
    }

    private void sendUnwatchRequest(int i) {
        this.f95788k.m14749a(i);
        this.f95786i.unwatchTarget(i);
    }

    private void sendWatchRequest(vmg vmgVar) {
        this.f95788k.m14749a(vmgVar.getTargetId());
        if (!vmgVar.getResumeToken().isEmpty() || vmgVar.getSnapshotVersion().compareTo(euf.f34067b) > 0) {
            vmgVar = vmgVar.withExpectedCount(Integer.valueOf(getRemoteKeysForTarget(vmgVar.getTargetId()).size()));
        }
        this.f95786i.watchQuery(vmgVar);
    }

    private boolean shouldStartWatchStream() {
        return (!canUseNetwork() || this.f95786i.isStarted() || this.f95783f.isEmpty()) ? false : true;
    }

    private boolean shouldStartWriteStream() {
        return (!canUseNetwork() || this.f95787j.isStarted() || this.f95789l.isEmpty()) ? false : true;
    }

    private void startWatchStream() {
        r80.hardAssert(shouldStartWatchStream(), "startWatchStream() called when shouldStartWatchStream() is false.", new Object[0]);
        this.f95788k = new khi(this.f95778a, this);
        this.f95786i.start();
        this.f95784g.m13739d();
    }

    private void startWriteStream() {
        r80.hardAssert(shouldStartWriteStream(), "startWriteStream() called when shouldStartWriteStream() is false.", new Object[0]);
        this.f95787j.start();
    }

    public boolean canUseNetwork() {
        return this.f95785h;
    }

    public cdh createTransaction() {
        return new cdh(this.f95781d);
    }

    public void disableNetwork() {
        this.f95785h = false;
        disableNetworkInternal();
        this.f95784g.m13740e(h5c.OFFLINE);
    }

    public void enableNetwork() {
        this.f95785h = true;
        if (canUseNetwork()) {
            this.f95787j.m18123m(this.f95780c.getLastStreamToken());
            if (shouldStartWatchStream()) {
                startWatchStream();
            } else {
                this.f95784g.m13740e(h5c.UNKNOWN);
            }
            fillWritePipeline();
        }
    }

    public void fillWritePipeline() {
        int batchId = this.f95789l.isEmpty() ? -1 : this.f95789l.getLast().getBatchId();
        while (true) {
            if (!canAddToWritePipeline()) {
                break;
            }
            n7b nextMutationBatch = this.f95780c.getNextMutationBatch(batchId);
            if (nextMutationBatch != null) {
                addToWritePipeline(nextMutationBatch);
                batchId = nextMutationBatch.getBatchId();
            } else if (this.f95789l.size() == 0) {
                this.f95787j.m21705h();
            }
        }
        if (shouldStartWriteStream()) {
            startWriteStream();
        }
    }

    @Override // p000.khi.InterfaceC8370c
    public qy7<ci4> getRemoteKeysForTarget(int i) {
        return this.f95779b.getRemoteKeysForTarget(i);
    }

    @Override // p000.khi.InterfaceC8370c
    @hib
    public vmg getTargetDataForTarget(int i) {
        return this.f95783f.get(Integer.valueOf(i));
    }

    public void handleCredentialChange() {
        if (canUseNetwork()) {
            fj9.debug(f95777n, "Restarting streams for new credential.", new Object[0]);
            restartNetwork();
        }
    }

    @fdi
    /* JADX INFO: renamed from: j */
    public void m24871j() {
        enableNetwork();
        this.f95784g.m13740e(h5c.ONLINE);
    }

    public void listen(vmg vmgVar) {
        Integer numValueOf = Integer.valueOf(vmgVar.getTargetId());
        if (this.f95783f.containsKey(numValueOf)) {
            return;
        }
        this.f95783f.put(numValueOf, vmgVar);
        if (shouldStartWatchStream()) {
            startWatchStream();
        } else if (this.f95786i.isOpen()) {
            sendWatchRequest(vmgVar);
        }
    }

    public Task<Map<String, b2i>> runAggregateQuery(nld nldVar, List<AbstractC3595a> list) {
        return canUseNetwork() ? this.f95781d.runAggregateQuery(nldVar, list) : Tasks.forException(new C3603f("Failed to get result from server.", C3603f.a.UNAVAILABLE));
    }

    public void shutdown() {
        fj9.debug(f95777n, "Shutting down", new Object[0]);
        this.f95782e.shutdown();
        this.f95785h = false;
        disableNetworkInternal();
        this.f95781d.m26814g();
        this.f95784g.m13740e(h5c.UNKNOWN);
    }

    public void start() {
        enableNetwork();
    }

    public void stopListening(int i) {
        r80.hardAssert(this.f95783f.remove(Integer.valueOf(i)) != null, "stopListening called on target no currently watched: %d", Integer.valueOf(i));
        if (this.f95786i.isOpen()) {
            sendUnwatchRequest(i);
        }
        if (this.f95783f.isEmpty()) {
            if (this.f95786i.isOpen()) {
                this.f95786i.m21705h();
            } else if (canUseNetwork()) {
                this.f95784g.m13740e(h5c.UNKNOWN);
            }
        }
    }
}
