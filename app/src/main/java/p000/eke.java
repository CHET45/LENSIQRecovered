package p000;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import android.util.SparseArray;
import com.google.firebase.Timestamp;

/* JADX INFO: loaded from: classes5.dex */
public final class eke implements rmg {

    /* JADX INFO: renamed from: a */
    public final yie f33270a;

    /* JADX INFO: renamed from: b */
    public final ud9 f33271b;

    /* JADX INFO: renamed from: c */
    public int f33272c;

    /* JADX INFO: renamed from: d */
    public long f33273d;

    /* JADX INFO: renamed from: e */
    public euf f33274e = euf.f34067b;

    /* JADX INFO: renamed from: f */
    public long f33275f;

    /* JADX INFO: renamed from: eke$b */
    public static class C5357b {

        /* JADX INFO: renamed from: a */
        public qy7<ci4> f33276a;

        private C5357b() {
            this.f33276a = ci4.emptyKeySet();
        }
    }

    /* JADX INFO: renamed from: eke$c */
    public static class C5358c {

        /* JADX INFO: renamed from: a */
        public vmg f33277a;

        private C5358c() {
        }
    }

    public eke(yie yieVar, ud9 ud9Var) {
        this.f33270a = yieVar;
        this.f33271b = ud9Var;
    }

    private vmg decodeTargetData(byte[] bArr) {
        try {
            return this.f33271b.m23252c(lmg.parseFrom(bArr));
        } catch (ce8 e) {
            throw r80.fail("TargetData failed to parse: %s", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$forEachTarget$1(su2 su2Var, Cursor cursor) {
        su2Var.accept(decodeTargetData(cursor.getBlob(0)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$getMatchingKeysForTargetId$4(C5357b c5357b, Cursor cursor) {
        c5357b.f33276a = c5357b.f33276a.insert(ci4.fromPath(j15.m13677b(cursor.getString(0))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getTargetData$3(kmg kmgVar, C5358c c5358c, Cursor cursor) {
        vmg vmgVarDecodeTargetData = decodeTargetData(cursor.getBlob(0));
        if (kmgVar.equals(vmgVarDecodeTargetData.getTarget())) {
            c5358c.f33277a = vmgVarDecodeTargetData;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$removeQueries$2(SparseArray sparseArray, int[] iArr, Cursor cursor) {
        int i = cursor.getInt(0);
        if (sparseArray.get(i) == null) {
            removeTarget(i);
            iArr[0] = iArr[0] + 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$start$0(Cursor cursor) {
        this.f33272c = cursor.getInt(0);
        this.f33273d = cursor.getInt(1);
        this.f33274e = new euf(new Timestamp(cursor.getLong(2), cursor.getInt(3)));
        this.f33275f = cursor.getLong(4);
    }

    private void removeTarget(int i) {
        removeMatchingKeysForTargetId(i);
        this.f33270a.m26109p("DELETE FROM targets WHERE target_id = ?", Integer.valueOf(i));
        this.f33275f--;
    }

    private void saveTargetData(vmg vmgVar) {
        int targetId = vmgVar.getTargetId();
        String canonicalId = vmgVar.getTarget().getCanonicalId();
        Timestamp timestamp = vmgVar.getSnapshotVersion().getTimestamp();
        this.f33270a.m26109p("INSERT OR REPLACE INTO targets (target_id, canonical_id, snapshot_version_seconds, snapshot_version_nanos, resume_token, last_listen_sequence_number, target_proto) VALUES (?, ?, ?, ?, ?, ?, ?)", Integer.valueOf(targetId), canonicalId, Long.valueOf(timestamp.getSeconds()), Integer.valueOf(timestamp.getNanoseconds()), vmgVar.getResumeToken().toByteArray(), Long.valueOf(vmgVar.getSequenceNumber()), this.f33271b.m23255f(vmgVar).toByteArray());
    }

    private boolean updateMetadata(vmg vmgVar) {
        boolean z;
        if (vmgVar.getTargetId() > this.f33272c) {
            this.f33272c = vmgVar.getTargetId();
            z = true;
        } else {
            z = false;
        }
        if (vmgVar.getSequenceNumber() <= this.f33273d) {
            return z;
        }
        this.f33273d = vmgVar.getSequenceNumber();
        return true;
    }

    private void writeMetadata() {
        this.f33270a.m26109p("UPDATE target_globals SET highest_target_id = ?, highest_listen_sequence_number = ?, last_remote_snapshot_version_seconds = ?, last_remote_snapshot_version_nanos = ?, target_count = ?", Integer.valueOf(this.f33272c), Long.valueOf(this.f33273d), Long.valueOf(this.f33274e.getTimestamp().getSeconds()), Integer.valueOf(this.f33274e.getTimestamp().getNanoseconds()), Long.valueOf(this.f33275f));
    }

    @Override // p000.rmg
    public void addMatchingKeys(qy7<ci4> qy7Var, int i) {
        SQLiteStatement sQLiteStatementM26112s = this.f33270a.m26112s("INSERT OR IGNORE INTO target_documents (target_id, path) VALUES (?, ?)");
        eie referenceDelegate = this.f33270a.getReferenceDelegate();
        for (ci4 ci4Var : qy7Var) {
            this.f33270a.m26108o(sQLiteStatementM26112s, Integer.valueOf(i), j15.m13678c(ci4Var.getPath()));
            referenceDelegate.addReference(ci4Var);
        }
    }

    @Override // p000.rmg
    public void addTargetData(vmg vmgVar) {
        saveTargetData(vmgVar);
        updateMetadata(vmgVar);
        this.f33275f++;
        writeMetadata();
    }

    @Override // p000.rmg
    public boolean containsKey(ci4 ci4Var) {
        return !this.f33270a.m26113t("SELECT target_id FROM target_documents WHERE path = ? AND target_id != 0 LIMIT 1").m26119b(j15.m13678c(ci4Var.getPath())).m26123f();
    }

    /* JADX INFO: renamed from: f */
    public int m10098f(long j, final SparseArray<?> sparseArray) {
        final int[] iArr = new int[1];
        this.f33270a.m26113t("SELECT target_id FROM targets WHERE last_listen_sequence_number <= ?").m26119b(Long.valueOf(j)).m26122e(new su2() { // from class: zje
            @Override // p000.su2
            public final void accept(Object obj) {
                this.f105309a.lambda$removeQueries$2(sparseArray, iArr, (Cursor) obj);
            }
        });
        writeMetadata();
        return iArr[0];
    }

    @Override // p000.rmg
    public void forEachTarget(final su2<vmg> su2Var) {
        this.f33270a.m26113t("SELECT target_proto FROM targets").m26122e(new su2() { // from class: ake
            @Override // p000.su2
            public final void accept(Object obj) {
                this.f1835a.lambda$forEachTarget$1(su2Var, (Cursor) obj);
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public void m10099g() {
        r80.hardAssert(this.f33270a.m26113t("SELECT highest_target_id, highest_listen_sequence_number, last_remote_snapshot_version_seconds, last_remote_snapshot_version_nanos, target_count FROM target_globals LIMIT 1").m26120c(new su2() { // from class: cke
            @Override // p000.su2
            public final void accept(Object obj) {
                this.f16830a.lambda$start$0((Cursor) obj);
            }
        }) == 1, "Missing target_globals entry", new Object[0]);
    }

    @Override // p000.rmg
    public long getHighestListenSequenceNumber() {
        return this.f33273d;
    }

    @Override // p000.rmg
    public int getHighestTargetId() {
        return this.f33272c;
    }

    @Override // p000.rmg
    public euf getLastRemoteSnapshotVersion() {
        return this.f33274e;
    }

    @Override // p000.rmg
    public qy7<ci4> getMatchingKeysForTargetId(int i) {
        final C5357b c5357b = new C5357b();
        this.f33270a.m26113t("SELECT path FROM target_documents WHERE target_id = ?").m26119b(Integer.valueOf(i)).m26122e(new su2() { // from class: bke
            @Override // p000.su2
            public final void accept(Object obj) {
                eke.lambda$getMatchingKeysForTargetId$4(c5357b, (Cursor) obj);
            }
        });
        return c5357b.f33276a;
    }

    @Override // p000.rmg
    public long getTargetCount() {
        return this.f33275f;
    }

    @Override // p000.rmg
    @hib
    public vmg getTargetData(final kmg kmgVar) {
        String canonicalId = kmgVar.getCanonicalId();
        final C5358c c5358c = new C5358c();
        this.f33270a.m26113t("SELECT target_proto FROM targets WHERE canonical_id = ?").m26119b(canonicalId).m26122e(new su2() { // from class: dke
            @Override // p000.su2
            public final void accept(Object obj) {
                this.f29885a.lambda$getTargetData$3(kmgVar, c5358c, (Cursor) obj);
            }
        });
        return c5358c.f33277a;
    }

    @Override // p000.rmg
    public void removeMatchingKeys(qy7<ci4> qy7Var, int i) {
        SQLiteStatement sQLiteStatementM26112s = this.f33270a.m26112s("DELETE FROM target_documents WHERE target_id = ? AND path = ?");
        eie referenceDelegate = this.f33270a.getReferenceDelegate();
        for (ci4 ci4Var : qy7Var) {
            this.f33270a.m26108o(sQLiteStatementM26112s, Integer.valueOf(i), j15.m13678c(ci4Var.getPath()));
            referenceDelegate.removeReference(ci4Var);
        }
    }

    @Override // p000.rmg
    public void removeMatchingKeysForTargetId(int i) {
        this.f33270a.m26109p("DELETE FROM target_documents WHERE target_id = ?", Integer.valueOf(i));
    }

    @Override // p000.rmg
    public void removeTargetData(vmg vmgVar) {
        removeTarget(vmgVar.getTargetId());
        writeMetadata();
    }

    @Override // p000.rmg
    public void setLastRemoteSnapshotVersion(euf eufVar) {
        this.f33274e = eufVar;
        writeMetadata();
    }

    @Override // p000.rmg
    public void updateTargetData(vmg vmgVar) {
        saveTargetData(vmgVar);
        if (updateMetadata(vmgVar)) {
            writeMetadata();
        }
    }
}
