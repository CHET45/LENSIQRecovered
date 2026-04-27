package p000;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p000.f08;
import p000.ir5;
import p000.nld;

/* JADX INFO: loaded from: classes5.dex */
public class qld {

    /* JADX INFO: renamed from: g */
    public static final String f74851g = "QueryEngine";

    /* JADX INFO: renamed from: h */
    public static final int f74852h = 100;

    /* JADX INFO: renamed from: i */
    public static final double f74853i = 2.0d;

    /* JADX INFO: renamed from: a */
    public ld9 f74854a;

    /* JADX INFO: renamed from: b */
    public f08 f74855b;

    /* JADX INFO: renamed from: c */
    public boolean f74856c;

    /* JADX INFO: renamed from: d */
    public boolean f74857d = false;

    /* JADX INFO: renamed from: e */
    public int f74858e = 100;

    /* JADX INFO: renamed from: f */
    public double f74859f = 2.0d;

    private ky7<ci4, ph4> appendRemainingResults(Iterable<ph4> iterable, nld nldVar, ir5.AbstractC7571a abstractC7571a) {
        ky7<ci4, ph4> ky7VarM16098d = this.f74854a.m16098d(nldVar, abstractC7571a);
        for (ph4 ph4Var : iterable) {
            ky7VarM16098d = ky7VarM16098d.insert(ph4Var.getKey(), ph4Var);
        }
        return ky7VarM16098d;
    }

    private qy7<ph4> applyQuery(nld nldVar, ky7<ci4, ph4> ky7Var) {
        qy7<ph4> qy7Var = new qy7<>(Collections.emptyList(), nldVar.comparator());
        Iterator<Map.Entry<ci4, ph4>> it = ky7Var.iterator();
        while (it.hasNext()) {
            ph4 value = it.next().getValue();
            if (nldVar.matches(value)) {
                qy7Var = qy7Var.insert(value);
            }
        }
        return qy7Var;
    }

    private void createCacheIndexes(nld nldVar, pld pldVar, int i) {
        if (pldVar.getDocumentReadCount() < this.f74858e) {
            fj9.debug(f74851g, "SDK will not create cache indexes for query: %s, since it only creates cache indexes for collection contains more than or equal to %s documents.", nldVar.toString(), Integer.valueOf(this.f74858e));
            return;
        }
        fj9.debug(f74851g, "Query: %s, scans %s local documents and returns %s documents as results.", nldVar.toString(), Integer.valueOf(pldVar.getDocumentReadCount()), Integer.valueOf(i));
        if (pldVar.getDocumentReadCount() > this.f74859f * ((double) i)) {
            this.f74855b.createTargetIndexes(nldVar.toTarget());
            fj9.debug(f74851g, "The SDK decides to create cache indexes for query: %s, as using cache indexes may help improve performance.", nldVar.toString());
        }
    }

    private ky7<ci4, ph4> executeFullCollectionScan(nld nldVar, pld pldVar) {
        if (fj9.isDebugEnabled()) {
            fj9.debug(f74851g, "Using full collection scan to execute query: %s", nldVar.toString());
        }
        return this.f74854a.m16099e(nldVar, ir5.AbstractC7571a.f48034a, pldVar);
    }

    private boolean needsRefill(nld nldVar, int i, qy7<ph4> qy7Var, euf eufVar) {
        if (!nldVar.hasLimit()) {
            return false;
        }
        if (i != qy7Var.size()) {
            return true;
        }
        ph4 maxEntry = nldVar.getLimitType() == nld.EnumC9924a.LIMIT_TO_FIRST ? qy7Var.getMaxEntry() : qy7Var.getMinEntry();
        if (maxEntry == null) {
            return false;
        }
        return maxEntry.hasPendingWrites() || maxEntry.getVersion().compareTo(eufVar) > 0;
    }

    @eib
    private ky7<ci4, ph4> performQueryUsingIndex(nld nldVar) {
        if (nldVar.matchesAllDocuments()) {
            return null;
        }
        kmg target = nldVar.toTarget();
        f08.EnumC5538a indexType = this.f74855b.getIndexType(target);
        if (indexType.equals(f08.EnumC5538a.NONE)) {
            return null;
        }
        if (nldVar.hasLimit() && indexType.equals(f08.EnumC5538a.PARTIAL)) {
            return performQueryUsingIndex(nldVar.limitToFirst(-1L));
        }
        List<ci4> documentsMatchingTarget = this.f74855b.getDocumentsMatchingTarget(target);
        r80.hardAssert(documentsMatchingTarget != null, "index manager must return results for partial and full indexes.", new Object[0]);
        ky7<ci4, ph4> ky7VarM16097c = this.f74854a.m16097c(documentsMatchingTarget);
        ir5.AbstractC7571a minOffset = this.f74855b.getMinOffset(target);
        qy7<ph4> qy7VarApplyQuery = applyQuery(nldVar, ky7VarM16097c);
        return needsRefill(nldVar, documentsMatchingTarget.size(), qy7VarApplyQuery, minOffset.getReadTime()) ? performQueryUsingIndex(nldVar.limitToFirst(-1L)) : appendRemainingResults(qy7VarApplyQuery, nldVar, minOffset);
    }

    @eib
    private ky7<ci4, ph4> performQueryUsingRemoteKeys(nld nldVar, qy7<ci4> qy7Var, euf eufVar) {
        if (nldVar.matchesAllDocuments() || eufVar.equals(euf.f34067b)) {
            return null;
        }
        qy7<ph4> qy7VarApplyQuery = applyQuery(nldVar, this.f74854a.m16097c(qy7Var));
        if (needsRefill(nldVar, qy7Var.size(), qy7VarApplyQuery, eufVar)) {
            return null;
        }
        if (fj9.isDebugEnabled()) {
            fj9.debug(f74851g, "Re-using previous result from %s to execute query: %s", eufVar.toString(), nldVar.toString());
        }
        return appendRemainingResults(qy7VarApplyQuery, nldVar, ir5.AbstractC7571a.createSuccessor(eufVar, -1));
    }

    @fdi
    /* JADX INFO: renamed from: a */
    public void m20433a(int i) {
        this.f74858e = i;
    }

    @fdi
    /* JADX INFO: renamed from: b */
    public void m20434b(double d) {
        this.f74859f = d;
    }

    public ky7<ci4, ph4> getDocumentsMatchingQuery(nld nldVar, euf eufVar, qy7<ci4> qy7Var) {
        r80.hardAssert(this.f74856c, "initialize() not called", new Object[0]);
        ky7<ci4, ph4> ky7VarPerformQueryUsingIndex = performQueryUsingIndex(nldVar);
        if (ky7VarPerformQueryUsingIndex != null) {
            return ky7VarPerformQueryUsingIndex;
        }
        ky7<ci4, ph4> ky7VarPerformQueryUsingRemoteKeys = performQueryUsingRemoteKeys(nldVar, qy7Var, eufVar);
        if (ky7VarPerformQueryUsingRemoteKeys != null) {
            return ky7VarPerformQueryUsingRemoteKeys;
        }
        pld pldVar = new pld();
        ky7<ci4, ph4> ky7VarExecuteFullCollectionScan = executeFullCollectionScan(nldVar, pldVar);
        if (ky7VarExecuteFullCollectionScan != null && this.f74857d) {
            createCacheIndexes(nldVar, pldVar, ky7VarExecuteFullCollectionScan.size());
        }
        return ky7VarExecuteFullCollectionScan;
    }

    public void initialize(ld9 ld9Var, f08 f08Var) {
        this.f74854a = ld9Var;
        this.f74855b = f08Var;
        this.f74856c = true;
    }

    public void setIndexAutoCreationEnabled(boolean z) {
        this.f74857d = z;
    }
}
