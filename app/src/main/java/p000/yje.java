package p000;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import p000.qqa;
import p000.yie;

/* JADX INFO: loaded from: classes5.dex */
public class yje {

    /* JADX INFO: renamed from: c */
    public static final int f101803c = 18;

    /* JADX INFO: renamed from: d */
    @fdi
    public static final int f101804d = 100;

    /* JADX INFO: renamed from: a */
    public final SQLiteDatabase f101805a;

    /* JADX INFO: renamed from: b */
    public final ud9 f101806b;

    public yje(SQLiteDatabase sQLiteDatabase, ud9 ud9Var) {
        this.f101805a = sQLiteDatabase;
        this.f101806b = ud9Var;
    }

    private void addDocumentType() {
        if (tableContainsColumn("remote_documents", "document_type")) {
            return;
        }
        this.f101805a.execSQL("ALTER TABLE remote_documents ADD COLUMN document_type INTEGER");
    }

    private void addPathLength() {
        if (tableContainsColumn("remote_documents", "path_length")) {
            return;
        }
        this.f101805a.execSQL("ALTER TABLE remote_documents ADD COLUMN path_length INTEGER");
    }

    private void addPendingDataMigration(String str) {
        this.f101805a.execSQL("INSERT OR IGNORE INTO data_migrations (migration_name) VALUES (?)", new String[]{str});
    }

    private void addReadTime() {
        this.f101805a.execSQL("ALTER TABLE remote_documents ADD COLUMN read_time_seconds INTEGER");
        this.f101805a.execSQL("ALTER TABLE remote_documents ADD COLUMN read_time_nanos INTEGER");
    }

    private void addSequenceNumber() {
        if (tableContainsColumn("target_documents", "sequence_number")) {
            return;
        }
        this.f101805a.execSQL("ALTER TABLE target_documents ADD COLUMN sequence_number INTEGER");
    }

    private void addTargetCount() {
        if (!tableContainsColumn("target_globals", "target_count")) {
            this.f101805a.execSQL("ALTER TABLE target_globals ADD COLUMN target_count INTEGER");
        }
        long jQueryNumEntries = DatabaseUtils.queryNumEntries(this.f101805a, "targets");
        ContentValues contentValues = new ContentValues();
        contentValues.put("target_count", Long.valueOf(jQueryNumEntries));
        this.f101805a.update("target_globals", contentValues, null, null);
    }

    private void createBundleCache() {
        ifTablesDontExist(new String[]{"bundles", "named_queries"}, new Runnable() { // from class: hje
            @Override // java.lang.Runnable
            public final void run() {
                this.f43822a.lambda$createBundleCache$15();
            }
        });
    }

    private void createDataMigrationTable() {
        ifTablesDontExist(new String[]{"data_migrations"}, new Runnable() { // from class: tje
            @Override // java.lang.Runnable
            public final void run() {
                this.f85080a.lambda$createDataMigrationTable$17();
            }
        });
    }

    private void createFieldIndex() {
        ifTablesDontExist(new String[]{"index_configuration", "index_state", "index_entries"}, new Runnable() { // from class: nje
            @Override // java.lang.Runnable
            public final void run() {
                this.f64767a.lambda$createFieldIndex$5();
            }
        });
    }

    private void createGlobalsTable() {
        ifTablesDontExist(new String[]{"globals"}, new Runnable() { // from class: uje
            @Override // java.lang.Runnable
            public final void run() {
                this.f88172a.lambda$createGlobalsTable$18();
            }
        });
    }

    private void createOverlays() {
        ifTablesDontExist(new String[]{"document_overlays"}, new Runnable() { // from class: jje
            @Override // java.lang.Runnable
            public final void run() {
                this.f50726a.lambda$createOverlays$16();
            }
        });
    }

    private void createV1MutationQueue() {
        ifTablesDontExist(new String[]{"mutation_queues", "mutations", "document_mutations"}, new Runnable() { // from class: kje
            @Override // java.lang.Runnable
            public final void run() {
                this.f54311a.lambda$createV1MutationQueue$0();
            }
        });
    }

    private void createV1RemoteDocumentCache() {
        ifTablesDontExist(new String[]{"remote_documents"}, new Runnable() { // from class: wje
            @Override // java.lang.Runnable
            public final void run() {
                this.f94437a.lambda$createV1RemoteDocumentCache$4();
            }
        });
    }

    private void createV1TargetCache() {
        ifTablesDontExist(new String[]{"targets", "target_globals", "target_documents"}, new Runnable() { // from class: oje
            @Override // java.lang.Runnable
            public final void run() {
                this.f67840a.lambda$createV1TargetCache$3();
            }
        });
    }

    private void createV8CollectionParentsIndex() {
        ifTablesDontExist(new String[]{"collection_parents"}, new Runnable() { // from class: fje
            @Override // java.lang.Runnable
            public final void run() {
                this.f36871a.lambda$createV8CollectionParentsIndex$9();
            }
        });
        final qqa.C11585a c11585a = new qqa.C11585a();
        final SQLiteStatement sQLiteStatementCompileStatement = this.f101805a.compileStatement("INSERT OR REPLACE INTO collection_parents (collection_id, parent) VALUES (?, ?)");
        final su2 su2Var = new su2() { // from class: pje
            @Override // p000.su2
            public final void accept(Object obj) {
                yje.lambda$createV8CollectionParentsIndex$10(c11585a, sQLiteStatementCompileStatement, (s6e) obj);
            }
        };
        new yie.C15685d(this.f101805a, "SELECT path FROM remote_documents").m26122e(new su2() { // from class: qje
            @Override // p000.su2
            public final void accept(Object obj) {
                yje.lambda$createV8CollectionParentsIndex$11(su2Var, (Cursor) obj);
            }
        });
        new yie.C15685d(this.f101805a, "SELECT path FROM document_mutations").m26122e(new su2() { // from class: rje
            @Override // p000.su2
            public final void accept(Object obj) {
                yje.lambda$createV8CollectionParentsIndex$12(su2Var, (Cursor) obj);
            }
        });
    }

    private void dropLastLimboFreeSnapshotVersion() {
        new yie.C15685d(this.f101805a, "SELECT target_id, target_proto FROM targets").m26122e(new su2() { // from class: vje
            @Override // p000.su2
            public final void accept(Object obj) {
                this.f91411a.lambda$dropLastLimboFreeSnapshotVersion$6((Cursor) obj);
            }
        });
    }

    private void dropV1TargetCache() {
        if (tableExists("targets")) {
            this.f101805a.execSQL("DROP TABLE targets");
        }
        if (tableExists("target_globals")) {
            this.f101805a.execSQL("DROP TABLE target_globals");
        }
        if (tableExists("target_documents")) {
            this.f101805a.execSQL("DROP TABLE target_documents");
        }
    }

    private void ensurePathLength() {
        final boolean[] zArr;
        yie.C15685d c15685dM26119b = new yie.C15685d(this.f101805a, "SELECT path FROM remote_documents WHERE path_length IS NULL LIMIT ?").m26119b(100);
        final SQLiteStatement sQLiteStatementCompileStatement = this.f101805a.compileStatement("UPDATE remote_documents SET path_length = ? WHERE path = ?");
        do {
            zArr = new boolean[]{false};
            c15685dM26119b.m26122e(new su2() { // from class: gje
                @Override // p000.su2
                public final void accept(Object obj) {
                    yje.lambda$ensurePathLength$14(zArr, sQLiteStatementCompileStatement, (Cursor) obj);
                }
            });
        } while (zArr[0]);
    }

    private void ensureReadTime() {
        this.f101805a.execSQL("UPDATE remote_documents SET read_time_seconds = 0, read_time_nanos = 0 WHERE read_time_seconds IS NULL");
    }

    private void ensureSequenceNumbers() {
        final boolean[] zArr;
        Long l = (Long) new yie.C15685d(this.f101805a, "SELECT highest_listen_sequence_number FROM target_globals LIMIT 1").m26121d(new pz6() { // from class: lje
            @Override // p000.pz6
            public final Object apply(Object obj) {
                return yje.lambda$ensureSequenceNumbers$7((Cursor) obj);
            }
        });
        r80.hardAssert(l != null, "Missing highest sequence number", new Object[0]);
        final long jLongValue = l.longValue();
        final SQLiteStatement sQLiteStatementCompileStatement = this.f101805a.compileStatement("INSERT INTO target_documents (target_id, path, sequence_number) VALUES (0, ?, ?)");
        yie.C15685d c15685dM26119b = new yie.C15685d(this.f101805a, "SELECT RD.path FROM remote_documents AS RD WHERE NOT EXISTS (SELECT TD.path FROM target_documents AS TD WHERE RD.path = TD.path AND TD.target_id = 0) LIMIT ?").m26119b(100);
        do {
            zArr = new boolean[]{false};
            c15685dM26119b.m26122e(new su2() { // from class: mje
                @Override // p000.su2
                public final void accept(Object obj) {
                    yje.lambda$ensureSequenceNumbers$8(zArr, sQLiteStatementCompileStatement, jLongValue, (Cursor) obj);
                }
            });
        } while (zArr[0]);
    }

    private void ensureTargetGlobal() {
        if (DatabaseUtils.queryNumEntries(this.f101805a, "target_globals") == 1) {
            return;
        }
        this.f101805a.execSQL("INSERT INTO target_globals (highest_target_id, highest_listen_sequence_number, last_remote_snapshot_version_seconds, last_remote_snapshot_version_nanos) VALUES (?, ?, ?, ?)", new String[]{a43.f347l, a43.f347l, a43.f347l, a43.f347l});
    }

    private boolean hasReadTime() {
        boolean zTableContainsColumn = tableContainsColumn("remote_documents", "read_time_seconds");
        boolean zTableContainsColumn2 = tableContainsColumn("remote_documents", "read_time_nanos");
        r80.hardAssert(zTableContainsColumn == zTableContainsColumn2, "Table contained just one of read_time_seconds or read_time_nanos", new Object[0]);
        return zTableContainsColumn && zTableContainsColumn2;
    }

    private void ifTablesDontExist(String[] strArr, Runnable runnable) {
        String str = "[" + TextUtils.join(", ", strArr) + "]";
        boolean z = false;
        for (int i = 0; i < strArr.length; i++) {
            String str2 = strArr[i];
            boolean zTableExists = tableExists(str2);
            if (i == 0) {
                z = zTableExists;
            } else if (zTableExists != z) {
                String str3 = "Expected all of " + str + " to either exist or not, but ";
                throw new IllegalStateException(z ? str3 + strArr[0] + " exists and " + str2 + " does not" : str3 + strArr[0] + " does not exist and " + str2 + " does");
            }
        }
        if (!z) {
            runnable.run();
            return;
        }
        fj9.debug("SQLiteSchema", "Skipping migration because all of " + str + " already exist", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createBundleCache$15() {
        this.f101805a.execSQL("CREATE TABLE bundles (bundle_id TEXT PRIMARY KEY, create_time_seconds INTEGER, create_time_nanos INTEGER, schema_version INTEGER, total_documents INTEGER, total_bytes INTEGER)");
        this.f101805a.execSQL("CREATE TABLE named_queries (name TEXT PRIMARY KEY, read_time_seconds INTEGER, read_time_nanos INTEGER, bundled_query_proto BLOB)");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createDataMigrationTable$17() {
        this.f101805a.execSQL("CREATE TABLE data_migrations (migration_name TEXT, PRIMARY KEY (migration_name))");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createFieldIndex$5() {
        this.f101805a.execSQL("CREATE TABLE index_configuration (index_id INTEGER, collection_group TEXT, index_proto BLOB, PRIMARY KEY (index_id))");
        this.f101805a.execSQL("CREATE TABLE index_state (index_id INTEGER, uid TEXT, sequence_number INTEGER, read_time_seconds INTEGER, read_time_nanos INTEGER, document_key TEXT, largest_batch_id INTEGER, PRIMARY KEY (index_id, uid))");
        this.f101805a.execSQL("CREATE TABLE index_entries (index_id INTEGER, uid TEXT, array_value BLOB, directional_value BLOB, document_key TEXT, PRIMARY KEY (index_id, uid, array_value, directional_value, document_key))");
        this.f101805a.execSQL("CREATE INDEX read_time ON remote_documents(read_time_seconds, read_time_nanos)");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createGlobalsTable$18() {
        this.f101805a.execSQL("CREATE TABLE globals (name TEXT PRIMARY KEY, value BLOB)");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createOverlays$16() {
        this.f101805a.execSQL("CREATE TABLE document_overlays (uid TEXT, collection_path TEXT, document_id TEXT, collection_group TEXT, largest_batch_id INTEGER, overlay_mutation BLOB, PRIMARY KEY (uid, collection_path, document_id))");
        this.f101805a.execSQL("CREATE INDEX batch_id_overlay ON document_overlays (uid, largest_batch_id)");
        this.f101805a.execSQL("CREATE INDEX collection_group_overlay ON document_overlays (uid, collection_group)");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createV1MutationQueue$0() {
        this.f101805a.execSQL("CREATE TABLE mutation_queues (uid TEXT PRIMARY KEY, last_acknowledged_batch_id INTEGER, last_stream_token BLOB)");
        this.f101805a.execSQL("CREATE TABLE mutations (uid TEXT, batch_id INTEGER, mutations BLOB, PRIMARY KEY (uid, batch_id))");
        this.f101805a.execSQL("CREATE TABLE document_mutations (uid TEXT, path TEXT, batch_id INTEGER, PRIMARY KEY (uid, path, batch_id))");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createV1RemoteDocumentCache$4() {
        this.f101805a.execSQL("CREATE TABLE remote_documents (path TEXT PRIMARY KEY, contents BLOB)");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createV1TargetCache$3() {
        this.f101805a.execSQL("CREATE TABLE targets (target_id INTEGER PRIMARY KEY, canonical_id TEXT, snapshot_version_seconds INTEGER, snapshot_version_nanos INTEGER, resume_token BLOB, last_listen_sequence_number INTEGER,target_proto BLOB)");
        this.f101805a.execSQL("CREATE INDEX query_targets ON targets (canonical_id, target_id)");
        this.f101805a.execSQL("CREATE TABLE target_globals (highest_target_id INTEGER, highest_listen_sequence_number INTEGER, last_remote_snapshot_version_seconds INTEGER, last_remote_snapshot_version_nanos INTEGER)");
        this.f101805a.execSQL("CREATE TABLE target_documents (target_id INTEGER, path TEXT, PRIMARY KEY (target_id, path))");
        this.f101805a.execSQL("CREATE INDEX document_targets ON target_documents (path, target_id)");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$createV8CollectionParentsIndex$10(qqa.C11585a c11585a, SQLiteStatement sQLiteStatement, s6e s6eVar) {
        if (c11585a.m20511a(s6eVar)) {
            String lastSegment = s6eVar.getLastSegment();
            s6e s6eVarPopLast = s6eVar.popLast();
            sQLiteStatement.clearBindings();
            sQLiteStatement.bindString(1, lastSegment);
            sQLiteStatement.bindString(2, j15.m13678c(s6eVarPopLast));
            sQLiteStatement.execute();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$createV8CollectionParentsIndex$11(su2 su2Var, Cursor cursor) {
        su2Var.accept(j15.m13677b(cursor.getString(0)).popLast());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$createV8CollectionParentsIndex$12(su2 su2Var, Cursor cursor) {
        su2Var.accept(j15.m13677b(cursor.getString(0)).popLast());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createV8CollectionParentsIndex$9() {
        this.f101805a.execSQL("CREATE TABLE collection_parents (collection_id TEXT, parent TEXT, PRIMARY KEY(collection_id, parent))");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$dropLastLimboFreeSnapshotVersion$6(Cursor cursor) {
        int i = cursor.getInt(0);
        try {
            this.f101805a.execSQL("UPDATE targets SET target_proto = ? WHERE target_id = ?", new Object[]{lmg.parseFrom(cursor.getBlob(1)).toBuilder().clearLastLimboFreeSnapshotVersion().build().toByteArray(), Integer.valueOf(i)});
        } catch (ce8 unused) {
            throw r80.fail("Failed to decode Query data for target %s", Integer.valueOf(i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$ensurePathLength$14(boolean[] zArr, SQLiteStatement sQLiteStatement, Cursor cursor) {
        zArr[0] = true;
        String string = cursor.getString(0);
        s6e s6eVarM13677b = j15.m13677b(string);
        sQLiteStatement.clearBindings();
        sQLiteStatement.bindLong(1, s6eVarM13677b.length());
        sQLiteStatement.bindString(2, string);
        r80.hardAssert(sQLiteStatement.executeUpdateDelete() != -1, "Failed to update document path", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Long lambda$ensureSequenceNumbers$7(Cursor cursor) {
        return Long.valueOf(cursor.getLong(0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$ensureSequenceNumbers$8(boolean[] zArr, SQLiteStatement sQLiteStatement, long j, Cursor cursor) {
        zArr[0] = true;
        sQLiteStatement.clearBindings();
        sQLiteStatement.bindString(1, cursor.getString(0));
        sQLiteStatement.bindLong(2, j);
        r80.hardAssert(sQLiteStatement.executeInsert() != -1, "Failed to insert a sentinel row", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$removeAcknowledgedMutations$1(String str, Cursor cursor) {
        removeMutationBatch(str, cursor.getInt(0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$removeAcknowledgedMutations$2(Cursor cursor) {
        final String string = cursor.getString(0);
        new yie.C15685d(this.f101805a, "SELECT batch_id FROM mutations WHERE uid = ? AND batch_id <= ?").m26119b(string, Long.valueOf(cursor.getLong(1))).m26122e(new su2() { // from class: sje
            @Override // p000.su2
            public final void accept(Object obj) {
                this.f82042a.lambda$removeAcknowledgedMutations$1(string, (Cursor) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$rewriteCanonicalIds$13(Cursor cursor) {
        int i = cursor.getInt(0);
        try {
            this.f101805a.execSQL("UPDATE targets SET canonical_id  = ? WHERE target_id = ?", new Object[]{this.f101806b.m23252c(lmg.parseFrom(cursor.getBlob(1))).getTarget().getCanonicalId(), Integer.valueOf(i)});
        } catch (ce8 unused) {
            throw r80.fail("Failed to decode Query data for target %s", Integer.valueOf(i));
        }
    }

    private void removeAcknowledgedMutations() {
        new yie.C15685d(this.f101805a, "SELECT uid, last_acknowledged_batch_id FROM mutation_queues").m26122e(new su2() { // from class: ije
            @Override // p000.su2
            public final void accept(Object obj) {
                this.f47209a.lambda$removeAcknowledgedMutations$2((Cursor) obj);
            }
        });
    }

    private void removeMutationBatch(String str, int i) {
        SQLiteStatement sQLiteStatementCompileStatement = this.f101805a.compileStatement("DELETE FROM mutations WHERE uid = ? AND batch_id = ?");
        sQLiteStatementCompileStatement.bindString(1, str);
        sQLiteStatementCompileStatement.bindLong(2, i);
        r80.hardAssert(sQLiteStatementCompileStatement.executeUpdateDelete() != 0, "Mutation batch (%s, %d) did not exist", str, Integer.valueOf(i));
        this.f101805a.execSQL("DELETE FROM document_mutations WHERE uid = ? AND batch_id = ?", new Object[]{str, Integer.valueOf(i)});
    }

    private void rewriteCanonicalIds() {
        new yie.C15685d(this.f101805a, "SELECT target_id, target_proto FROM targets").m26122e(new su2() { // from class: xje
            @Override // p000.su2
            public final void accept(Object obj) {
                this.f98243a.lambda$rewriteCanonicalIds$13((Cursor) obj);
            }
        });
    }

    private boolean tableContainsColumn(String str, String str2) {
        return m26146t(str).indexOf(str2) != -1;
    }

    private boolean tableExists(String str) {
        return !new yie.C15685d(this.f101805a, "SELECT 1=1 FROM sqlite_master WHERE tbl_name = ?").m26119b(str).m26123f();
    }

    @fdi
    /* JADX INFO: renamed from: t */
    public List<String> m26146t(String str) {
        ArrayList arrayList = new ArrayList();
        Cursor cursorRawQuery = null;
        try {
            cursorRawQuery = this.f101805a.rawQuery("PRAGMA table_info(" + str + c0b.f15434d, null);
            int columnIndex = cursorRawQuery.getColumnIndex("name");
            while (cursorRawQuery.moveToNext()) {
                arrayList.add(cursorRawQuery.getString(columnIndex));
            }
            cursorRawQuery.close();
            return arrayList;
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: u */
    public void m26147u() {
        m26148v(0);
    }

    /* JADX INFO: renamed from: v */
    public void m26148v(int i) {
        m26149w(i, 18);
    }

    /* JADX INFO: renamed from: w */
    public void m26149w(int i, int i2) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (i < 1 && i2 >= 1) {
            createV1MutationQueue();
            createV1TargetCache();
            createV1RemoteDocumentCache();
        }
        if (i < 3 && i2 >= 3 && i != 0) {
            dropV1TargetCache();
            createV1TargetCache();
        }
        if (i < 4 && i2 >= 4) {
            ensureTargetGlobal();
            addTargetCount();
        }
        if (i < 5 && i2 >= 5) {
            addSequenceNumber();
        }
        if (i < 6 && i2 >= 6) {
            removeAcknowledgedMutations();
        }
        if (i < 7 && i2 >= 7) {
            ensureSequenceNumbers();
        }
        if (i < 8 && i2 >= 8) {
            createV8CollectionParentsIndex();
        }
        if (i < 9 && i2 >= 9) {
            if (hasReadTime()) {
                dropLastLimboFreeSnapshotVersion();
            } else {
                addReadTime();
            }
        }
        if (i == 9 && i2 >= 10) {
            dropLastLimboFreeSnapshotVersion();
        }
        if (i < 11 && i2 >= 11) {
            rewriteCanonicalIds();
        }
        if (i < 12 && i2 >= 12) {
            createBundleCache();
        }
        if (i < 13 && i2 >= 13) {
            addPathLength();
            ensurePathLength();
        }
        if (i < 14 && i2 >= 14) {
            createOverlays();
            createDataMigrationTable();
            addPendingDataMigration(jqc.f51485b);
        }
        if (i < 15 && i2 >= 15) {
            ensureReadTime();
        }
        if (i < 16 && i2 >= 16) {
            createFieldIndex();
        }
        if (i < 17 && i2 >= 17) {
            createGlobalsTable();
        }
        if (i < 18 && i2 >= 18) {
            addDocumentType();
        }
        fj9.debug("SQLiteSchema", "Migration from version %s to %s took %s milliseconds", Integer.valueOf(i), Integer.valueOf(i2), Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
    }
}
