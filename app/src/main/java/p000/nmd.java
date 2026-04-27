package p000;

import com.google.firebase.firestore.C3603f;
import p000.j65;

/* JADX INFO: loaded from: classes5.dex */
public class nmd {

    /* JADX INFO: renamed from: a */
    public final nld f65028a;

    /* JADX INFO: renamed from: b */
    public final j65.C7752b f65029b;

    /* JADX INFO: renamed from: c */
    public final b65<lbi> f65030c;

    /* JADX INFO: renamed from: d */
    public boolean f65031d = false;

    /* JADX INFO: renamed from: e */
    public h5c f65032e = h5c.UNKNOWN;

    /* JADX INFO: renamed from: f */
    @hib
    public lbi f65033f;

    public nmd(nld nldVar, j65.C7752b c7752b, b65<lbi> b65Var) {
        this.f65028a = nldVar;
        this.f65030c = b65Var;
        this.f65029b = c7752b;
    }

    private void raiseInitialEvent(lbi lbiVar) {
        r80.hardAssert(!this.f65031d, "Trying to raise initial event for second time", new Object[0]);
        lbi lbiVarFromInitialDocuments = lbi.fromInitialDocuments(lbiVar.getQuery(), lbiVar.getDocuments(), lbiVar.getMutatedKeys(), lbiVar.isFromCache(), lbiVar.excludesMetadataChanges(), lbiVar.hasCachedResults());
        this.f65031d = true;
        this.f65030c.onEvent(lbiVarFromInitialDocuments, null);
    }

    private boolean shouldRaiseEvent(lbi lbiVar) {
        if (!lbiVar.getChanges().isEmpty()) {
            return true;
        }
        lbi lbiVar2 = this.f65033f;
        boolean z = (lbiVar2 == null || lbiVar2.hasPendingWrites() == lbiVar.hasPendingWrites()) ? false : true;
        if (lbiVar.didSyncStateChange() || z) {
            return this.f65029b.f49608b;
        }
        return false;
    }

    private boolean shouldRaiseInitialEvent(lbi lbiVar, h5c h5cVar) {
        r80.hardAssert(!this.f65031d, "Determining whether to raise first event but already had first event.", new Object[0]);
        if (!lbiVar.isFromCache() || !listensToRemoteStore()) {
            return true;
        }
        h5c h5cVar2 = h5c.OFFLINE;
        boolean zEquals = h5cVar.equals(h5cVar2);
        if (!this.f65029b.f49609c || zEquals) {
            return !lbiVar.getDocuments().isEmpty() || lbiVar.hasCachedResults() || h5cVar.equals(h5cVar2);
        }
        r80.hardAssert(lbiVar.isFromCache(), "Waiting for sync, but snapshot is not from cache", new Object[0]);
        return false;
    }

    public nld getQuery() {
        return this.f65028a;
    }

    public boolean listensToRemoteStore() {
        if (this.f65029b != null) {
            return !r0.f49610d.equals(ia9.CACHE);
        }
        return true;
    }

    public void onError(C3603f c3603f) {
        this.f65030c.onEvent(null, c3603f);
    }

    public boolean onOnlineStateChanged(h5c h5cVar) {
        this.f65032e = h5cVar;
        lbi lbiVar = this.f65033f;
        if (lbiVar == null || this.f65031d || !shouldRaiseInitialEvent(lbiVar, h5cVar)) {
            return false;
        }
        raiseInitialEvent(this.f65033f);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onViewSnapshot(p000.lbi r14) {
        /*
            r13 = this;
            java.util.List r0 = r14.getChanges()
            boolean r0 = r0.isEmpty()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L15
            boolean r0 = r14.didSyncStateChange()
            if (r0 == 0) goto L13
            goto L15
        L13:
            r0 = r2
            goto L16
        L15:
            r0 = r1
        L16:
            java.lang.String r3 = "We got a new snapshot with no changes?"
            java.lang.Object[] r4 = new java.lang.Object[r2]
            p000.r80.hardAssert(r0, r3, r4)
            j65$b r0 = r13.f65029b
            boolean r0 = r0.f49607a
            if (r0 != 0) goto L6c
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.List r0 = r14.getChanges()
            java.util.Iterator r0 = r0.iterator()
        L30:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L48
            java.lang.Object r3 = r0.next()
            cj4 r3 = (p000.cj4) r3
            cj4$a r4 = r3.getType()
            cj4$a r5 = p000.cj4.EnumC2330a.METADATA
            if (r4 == r5) goto L30
            r7.add(r3)
            goto L30
        L48:
            lbi r0 = new lbi
            nld r4 = r14.getQuery()
            yi4 r5 = r14.getDocuments()
            yi4 r6 = r14.getOldDocuments()
            boolean r8 = r14.isFromCache()
            qy7 r9 = r14.getMutatedKeys()
            boolean r10 = r14.didSyncStateChange()
            r11 = 1
            boolean r12 = r14.hasCachedResults()
            r3 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r14 = r0
        L6c:
            boolean r0 = r13.f65031d
            if (r0 != 0) goto L7c
            h5c r0 = r13.f65032e
            boolean r0 = r13.shouldRaiseInitialEvent(r14, r0)
            if (r0 == 0) goto L89
            r13.raiseInitialEvent(r14)
            goto L8a
        L7c:
            boolean r0 = r13.shouldRaiseEvent(r14)
            if (r0 == 0) goto L89
            b65<lbi> r0 = r13.f65030c
            r2 = 0
            r0.onEvent(r14, r2)
            goto L8a
        L89:
            r1 = r2
        L8a:
            r13.f65033f = r14
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.nmd.onViewSnapshot(lbi):boolean");
    }
}
