package p000;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.google.firebase.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p000.yie;

/* JADX INFO: loaded from: classes5.dex */
public final class rie implements s7b {

    /* JADX INFO: renamed from: g */
    public static final int f78397g = 1000000;

    /* JADX INFO: renamed from: a */
    public final yie f78398a;

    /* JADX INFO: renamed from: b */
    public final ud9 f78399b;

    /* JADX INFO: renamed from: c */
    public final f08 f78400c;

    /* JADX INFO: renamed from: d */
    public final String f78401d;

    /* JADX INFO: renamed from: e */
    public int f78402e;

    /* JADX INFO: renamed from: f */
    public vj1 f78403f;

    /* JADX INFO: renamed from: rie$a */
    public static class C12107a implements su2<Cursor> {

        /* JADX INFO: renamed from: a */
        public final ArrayList<vj1> f78404a = new ArrayList<>();

        /* JADX INFO: renamed from: b */
        public boolean f78405b = true;

        public C12107a(byte[] bArr) {
            addChunk(bArr);
        }

        private void addChunk(byte[] bArr) {
            this.f78404a.add(vj1.copyFrom(bArr));
        }

        /* JADX INFO: renamed from: b */
        public int m21379b() {
            return this.f78404a.size();
        }

        /* JADX INFO: renamed from: c */
        public vj1 m21380c() {
            return vj1.copyFrom(this.f78404a);
        }

        @Override // p000.su2
        public void accept(Cursor cursor) {
            byte[] blob = cursor.getBlob(0);
            addChunk(blob);
            if (blob.length < 1000000) {
                this.f78405b = false;
            }
        }
    }

    public rie(yie yieVar, ud9 ud9Var, syh syhVar, f08 f08Var) {
        this.f78398a = yieVar;
        this.f78399b = ud9Var;
        this.f78401d = syhVar.isAuthenticated() ? syhVar.getUid() : "";
        this.f78403f = nsi.f65548w;
        this.f78400c = f08Var;
    }

    private n7b decodeInlineMutationBatch(int i, byte[] bArr) {
        try {
            if (bArr.length < 1000000) {
                return this.f78399b.m23251b(asi.parseFrom(bArr));
            }
            C12107a c12107a = new C12107a(bArr);
            while (c12107a.f78405b) {
                this.f78398a.m26113t("SELECT SUBSTR(mutations, ?, ?) FROM mutations WHERE uid = ? AND batch_id = ?").m26119b(Integer.valueOf((c12107a.m21379b() * 1000000) + 1), 1000000, this.f78401d, Integer.valueOf(i)).m26120c(c12107a);
            }
            return this.f78399b.m23251b(asi.parseFrom(c12107a.m21380c()));
        } catch (ce8 e) {
            throw r80.fail("MutationBatch failed to parse: %s", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getAllMutationBatches$6(List list, Cursor cursor) {
        list.add(decodeInlineMutationBatch(cursor.getInt(0), cursor.getBlob(1)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getAllMutationBatchesAffectingDocumentKey$7(List list, Cursor cursor) {
        list.add(decodeInlineMutationBatch(cursor.getInt(0), cursor.getBlob(1)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getAllMutationBatchesAffectingDocumentKeys$8(Set set, List list, Cursor cursor) {
        int i = cursor.getInt(0);
        if (set.contains(Integer.valueOf(i))) {
            return;
        }
        set.add(Integer.valueOf(i));
        list.add(decodeInlineMutationBatch(i, cursor.getBlob(1)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$getAllMutationBatchesAffectingDocumentKeys$9(n7b n7bVar, n7b n7bVar2) {
        return Integer.compare(n7bVar.getBatchId(), n7bVar2.getBatchId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getAllMutationBatchesAffectingQuery$10(List list, int i, Cursor cursor) {
        int i2 = cursor.getInt(0);
        int size = list.size();
        if ((size <= 0 || i2 != ((n7b) list.get(size - 1)).getBatchId()) && j15.m13677b(cursor.getString(1)).length() == i) {
            list.add(decodeInlineMutationBatch(i2, cursor.getBlob(2)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer lambda$getHighestUnacknowledgedBatchId$5(Cursor cursor) {
        return Integer.valueOf(cursor.getInt(0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ n7b lambda$getNextMutationBatchAfterBatchId$4(Cursor cursor) {
        return decodeInlineMutationBatch(cursor.getInt(0), cursor.getBlob(1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$loadNextBatchIdAcrossAllUsers$1(List list, Cursor cursor) {
        list.add(cursor.getString(0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadNextBatchIdAcrossAllUsers$2(Cursor cursor) {
        this.f78402e = Math.max(this.f78402e, cursor.getInt(0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ n7b lambda$lookupMutationBatch$3(int i, Cursor cursor) {
        return decodeInlineMutationBatch(i, cursor.getBlob(0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$performConsistencyCheck$11(List list, Cursor cursor) {
        list.add(j15.m13677b(cursor.getString(0)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$start$0(Cursor cursor) {
        this.f78403f = vj1.copyFrom(cursor.getBlob(0));
    }

    private void loadNextBatchIdAcrossAllUsers() {
        final ArrayList arrayList = new ArrayList();
        this.f78398a.m26113t("SELECT uid FROM mutation_queues").m26122e(new su2() { // from class: nie
            @Override // p000.su2
            public final void accept(Object obj) {
                rie.lambda$loadNextBatchIdAcrossAllUsers$1(arrayList, (Cursor) obj);
            }
        });
        this.f78402e = 0;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.f78398a.m26113t("SELECT MAX(batch_id) FROM mutations WHERE uid = ?").m26119b((String) it.next()).m26122e(new su2() { // from class: oie
                @Override // p000.su2
                public final void accept(Object obj) {
                    this.f67753a.lambda$loadNextBatchIdAcrossAllUsers$2((Cursor) obj);
                }
            });
        }
        this.f78402e++;
    }

    private void writeMutationQueueMetadata() {
        this.f78398a.m26109p("INSERT OR REPLACE INTO mutation_queues (uid, last_acknowledged_batch_id, last_stream_token) VALUES (?, ?, ?)", this.f78401d, -1, this.f78403f.toByteArray());
    }

    @Override // p000.s7b
    public void acknowledgeBatch(n7b n7bVar, vj1 vj1Var) {
        this.f78403f = (vj1) x7d.checkNotNull(vj1Var);
        writeMutationQueueMetadata();
    }

    @Override // p000.s7b
    public n7b addMutationBatch(Timestamp timestamp, List<m7b> list, List<m7b> list2) {
        int i = this.f78402e;
        this.f78402e = i + 1;
        n7b n7bVar = new n7b(i, timestamp, list, list2);
        this.f78398a.m26109p("INSERT INTO mutations (uid, batch_id, mutations) VALUES (?, ?, ?)", this.f78401d, Integer.valueOf(i), this.f78399b.m23254e(n7bVar).toByteArray());
        HashSet hashSet = new HashSet();
        SQLiteStatement sQLiteStatementM26112s = this.f78398a.m26112s("INSERT INTO document_mutations (uid, path, batch_id) VALUES (?, ?, ?)");
        Iterator<m7b> it = list2.iterator();
        while (it.hasNext()) {
            ci4 key = it.next().getKey();
            if (hashSet.add(key)) {
                this.f78398a.m26108o(sQLiteStatementM26112s, this.f78401d, j15.m13678c(key.getPath()), Integer.valueOf(i));
                this.f78400c.addToCollectionParentIndex(key.getCollectionPath());
            }
        }
        return n7bVar;
    }

    @Override // p000.s7b
    public List<n7b> getAllMutationBatches() {
        final ArrayList arrayList = new ArrayList();
        this.f78398a.m26113t("SELECT batch_id, SUBSTR(mutations, 1, ?) FROM mutations WHERE uid = ? ORDER BY batch_id ASC").m26119b(1000000, this.f78401d).m26122e(new su2() { // from class: lie
            @Override // p000.su2
            public final void accept(Object obj) {
                this.f57712a.lambda$getAllMutationBatches$6(arrayList, (Cursor) obj);
            }
        });
        return arrayList;
    }

    @Override // p000.s7b
    public List<n7b> getAllMutationBatchesAffectingDocumentKey(ci4 ci4Var) {
        String strM13678c = j15.m13678c(ci4Var.getPath());
        final ArrayList arrayList = new ArrayList();
        this.f78398a.m26113t("SELECT m.batch_id, SUBSTR(m.mutations, 1, ?) FROM document_mutations dm, mutations m WHERE dm.uid = ? AND dm.path = ? AND dm.uid = m.uid AND dm.batch_id = m.batch_id ORDER BY dm.batch_id").m26119b(1000000, this.f78401d, strM13678c).m26122e(new su2() { // from class: fie
            @Override // p000.su2
            public final void accept(Object obj) {
                this.f36807a.lambda$getAllMutationBatchesAffectingDocumentKey$7(arrayList, (Cursor) obj);
            }
        });
        return arrayList;
    }

    @Override // p000.s7b
    public List<n7b> getAllMutationBatchesAffectingDocumentKeys(Iterable<ci4> iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator<ci4> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(j15.m13678c(it.next().getPath()));
        }
        yie.C15683b c15683b = new yie.C15683b(this.f78398a, "SELECT DISTINCT dm.batch_id, SUBSTR(m.mutations, 1, ?) FROM document_mutations dm, mutations m WHERE dm.uid = ? AND dm.path IN (", Arrays.asList(1000000, this.f78401d), arrayList, ") AND dm.uid = m.uid AND dm.batch_id = m.batch_id ORDER BY dm.batch_id");
        final ArrayList arrayList2 = new ArrayList();
        final HashSet hashSet = new HashSet();
        while (c15683b.m26116c()) {
            c15683b.m26117d().m26122e(new su2() { // from class: qie
                @Override // p000.su2
                public final void accept(Object obj) {
                    this.f74540a.lambda$getAllMutationBatchesAffectingDocumentKeys$8(hashSet, arrayList2, (Cursor) obj);
                }
            });
        }
        if (c15683b.m26115b() > 1) {
            Collections.sort(arrayList2, new Comparator() { // from class: gie
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return rie.lambda$getAllMutationBatchesAffectingDocumentKeys$9((n7b) obj, (n7b) obj2);
                }
            });
        }
        return arrayList2;
    }

    @Override // p000.s7b
    public List<n7b> getAllMutationBatchesAffectingQuery(nld nldVar) {
        r80.hardAssert(!nldVar.isCollectionGroupQuery(), "CollectionGroup queries should be handled in LocalDocumentsView", new Object[0]);
        s6e path = nldVar.getPath();
        final int length = path.length() + 1;
        String strM13678c = j15.m13678c(path);
        String strM13679d = j15.m13679d(strM13678c);
        final ArrayList arrayList = new ArrayList();
        this.f78398a.m26113t("SELECT dm.batch_id, dm.path, SUBSTR(m.mutations, 1, ?) FROM document_mutations dm, mutations m WHERE dm.uid = ? AND dm.path >= ? AND dm.path < ? AND dm.uid = m.uid AND dm.batch_id = m.batch_id ORDER BY dm.batch_id").m26119b(1000000, this.f78401d, strM13678c, strM13679d).m26122e(new su2() { // from class: iie
            @Override // p000.su2
            public final void accept(Object obj) {
                this.f47114a.lambda$getAllMutationBatchesAffectingQuery$10(arrayList, length, (Cursor) obj);
            }
        });
        return arrayList;
    }

    @Override // p000.s7b
    public int getHighestUnacknowledgedBatchId() {
        return ((Integer) this.f78398a.m26113t("SELECT IFNULL(MAX(batch_id), ?) FROM mutations WHERE uid = ?").m26119b(-1, this.f78401d).m26121d(new pz6() { // from class: jie
            @Override // p000.pz6
            public final Object apply(Object obj) {
                return rie.lambda$getHighestUnacknowledgedBatchId$5((Cursor) obj);
            }
        })).intValue();
    }

    @Override // p000.s7b
    public vj1 getLastStreamToken() {
        return this.f78403f;
    }

    @Override // p000.s7b
    @hib
    public n7b getNextMutationBatchAfterBatchId(int i) {
        return (n7b) this.f78398a.m26113t("SELECT batch_id, SUBSTR(mutations, 1, ?) FROM mutations WHERE uid = ? AND batch_id >= ? ORDER BY batch_id ASC LIMIT 1").m26119b(1000000, this.f78401d, Integer.valueOf(i + 1)).m26121d(new pz6() { // from class: pie
            @Override // p000.pz6
            public final Object apply(Object obj) {
                return this.f71025a.lambda$getNextMutationBatchAfterBatchId$4((Cursor) obj);
            }
        });
    }

    @Override // p000.s7b
    public boolean isEmpty() {
        return this.f78398a.m26113t("SELECT batch_id FROM mutations WHERE uid = ? LIMIT 1").m26119b(this.f78401d).m26123f();
    }

    @Override // p000.s7b
    @hib
    public n7b lookupMutationBatch(final int i) {
        return (n7b) this.f78398a.m26113t("SELECT SUBSTR(mutations, 1, ?) FROM mutations WHERE uid = ? AND batch_id = ?").m26119b(1000000, this.f78401d, Integer.valueOf(i)).m26121d(new pz6() { // from class: hie
            @Override // p000.pz6
            public final Object apply(Object obj) {
                return this.f43759a.lambda$lookupMutationBatch$3(i, (Cursor) obj);
            }
        });
    }

    @Override // p000.s7b
    public void performConsistencyCheck() {
        if (isEmpty()) {
            final ArrayList arrayList = new ArrayList();
            this.f78398a.m26113t("SELECT path FROM document_mutations WHERE uid = ?").m26119b(this.f78401d).m26122e(new su2() { // from class: mie
                @Override // p000.su2
                public final void accept(Object obj) {
                    rie.lambda$performConsistencyCheck$11(arrayList, (Cursor) obj);
                }
            });
            r80.hardAssert(arrayList.isEmpty(), "Document leak -- detected dangling mutation references when queue is empty. Dangling keys: %s", arrayList);
        }
    }

    @Override // p000.s7b
    public void removeMutationBatch(n7b n7bVar) {
        SQLiteStatement sQLiteStatementM26112s = this.f78398a.m26112s("DELETE FROM mutations WHERE uid = ? AND batch_id = ?");
        SQLiteStatement sQLiteStatementM26112s2 = this.f78398a.m26112s("DELETE FROM document_mutations WHERE uid = ? AND path = ? AND batch_id = ?");
        int batchId = n7bVar.getBatchId();
        r80.hardAssert(this.f78398a.m26108o(sQLiteStatementM26112s, this.f78401d, Integer.valueOf(batchId)) != 0, "Mutation batch (%s, %d) did not exist", this.f78401d, Integer.valueOf(n7bVar.getBatchId()));
        Iterator<m7b> it = n7bVar.getMutations().iterator();
        while (it.hasNext()) {
            ci4 key = it.next().getKey();
            this.f78398a.m26108o(sQLiteStatementM26112s2, this.f78401d, j15.m13678c(key.getPath()), Integer.valueOf(batchId));
            this.f78398a.getReferenceDelegate().removeMutationReference(key);
        }
    }

    @Override // p000.s7b
    public void setLastStreamToken(vj1 vj1Var) {
        this.f78403f = (vj1) x7d.checkNotNull(vj1Var);
        writeMutationQueueMetadata();
    }

    @Override // p000.s7b
    public void start() {
        loadNextBatchIdAcrossAllUsers();
        if (this.f78398a.m26113t("SELECT last_stream_token FROM mutation_queues WHERE uid = ?").m26119b(this.f78401d).m26120c(new su2() { // from class: kie
            @Override // p000.su2
            public final void accept(Object obj) {
                this.f54231a.lambda$start$0((Cursor) obj);
            }
        }) == 0) {
            writeMutationQueueMetadata();
        }
    }
}
