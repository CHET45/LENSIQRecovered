package p000;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class fqe extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: C */
    public static final String f37495C = "CREATE UNIQUE INDEX contexts_backend_priority on transport_contexts(backend_name, priority)";

    /* JADX INFO: renamed from: F */
    public static final String f37496F = "DROP TABLE events";

    /* JADX INFO: renamed from: H */
    public static final String f37497H = "DROP TABLE event_metadata";

    /* JADX INFO: renamed from: L */
    public static final String f37498L = "DROP TABLE transport_contexts";

    /* JADX INFO: renamed from: M */
    public static final String f37499M = "CREATE TABLE event_payloads (sequence_num INTEGER NOT NULL, event_id INTEGER NOT NULL, bytes BLOB NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE,PRIMARY KEY (sequence_num, event_id))";

    /* JADX INFO: renamed from: M1 */
    public static final String f37500M1 = "DROP TABLE IF EXISTS global_log_event_state";

    /* JADX INFO: renamed from: N */
    public static final String f37501N = "DROP TABLE IF EXISTS event_payloads";

    /* JADX INFO: renamed from: Q */
    public static final String f37502Q = "CREATE TABLE log_event_dropped (log_source VARCHAR(45) NOT NULL,reason INTEGER NOT NULL,events_dropped_count BIGINT NOT NULL,PRIMARY KEY(log_source, reason))";

    /* JADX INFO: renamed from: X */
    public static final String f37504X = "CREATE TABLE global_log_event_state (last_metrics_upload_ms BIGINT PRIMARY KEY)";

    /* JADX INFO: renamed from: Z */
    public static final String f37506Z = "DROP TABLE IF EXISTS log_event_dropped";

    /* JADX INFO: renamed from: Z1 */
    public static final InterfaceC5934a f37507Z1;

    /* JADX INFO: renamed from: a2 */
    public static final InterfaceC5934a f37508a2;

    /* JADX INFO: renamed from: b2 */
    public static final InterfaceC5934a f37509b2;

    /* JADX INFO: renamed from: c */
    public static final String f37510c = "com.google.android.datatransport.events";

    /* JADX INFO: renamed from: c2 */
    public static final InterfaceC5934a f37511c2;

    /* JADX INFO: renamed from: d */
    public static final String f37512d = "CREATE TABLE events (_id INTEGER PRIMARY KEY, context_id INTEGER NOT NULL, transport_name TEXT NOT NULL, timestamp_ms INTEGER NOT NULL, uptime_ms INTEGER NOT NULL, payload BLOB NOT NULL, code INTEGER, num_attempts INTEGER NOT NULL,FOREIGN KEY (context_id) REFERENCES transport_contexts(_id) ON DELETE CASCADE)";

    /* JADX INFO: renamed from: d2 */
    public static final InterfaceC5934a f37513d2;

    /* JADX INFO: renamed from: e */
    public static final String f37514e = "CREATE TABLE event_metadata (_id INTEGER PRIMARY KEY, event_id INTEGER NOT NULL, name TEXT NOT NULL, value TEXT NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE)";

    /* JADX INFO: renamed from: e2 */
    public static final InterfaceC5934a f37515e2;

    /* JADX INFO: renamed from: f */
    public static final String f37516f = "CREATE TABLE transport_contexts (_id INTEGER PRIMARY KEY, backend_name TEXT NOT NULL, priority INTEGER NOT NULL, next_request_ms INTEGER NOT NULL)";

    /* JADX INFO: renamed from: f2 */
    public static final InterfaceC5934a f37517f2;

    /* JADX INFO: renamed from: g2 */
    public static final List<InterfaceC5934a> f37518g2;

    /* JADX INFO: renamed from: m */
    public static final String f37519m = "CREATE INDEX events_backend_id on events(context_id)";

    /* JADX INFO: renamed from: a */
    public final int f37520a;

    /* JADX INFO: renamed from: b */
    public boolean f37521b;

    /* JADX INFO: renamed from: Y */
    public static final String f37505Y = "INSERT INTO global_log_event_state VALUES (" + System.currentTimeMillis() + c0b.f15434d;

    /* JADX INFO: renamed from: V1 */
    public static int f37503V1 = 7;

    /* JADX INFO: renamed from: fqe$a */
    public interface InterfaceC5934a {
        void upgrade(SQLiteDatabase sQLiteDatabase);
    }

    static {
        InterfaceC5934a interfaceC5934a = new InterfaceC5934a() { // from class: ype
            @Override // p000.fqe.InterfaceC5934a
            public final void upgrade(SQLiteDatabase sQLiteDatabase) {
                fqe.lambda$static$0(sQLiteDatabase);
            }
        };
        f37507Z1 = interfaceC5934a;
        InterfaceC5934a interfaceC5934a2 = new InterfaceC5934a() { // from class: zpe
            @Override // p000.fqe.InterfaceC5934a
            public final void upgrade(SQLiteDatabase sQLiteDatabase) {
                fqe.lambda$static$1(sQLiteDatabase);
            }
        };
        f37508a2 = interfaceC5934a2;
        InterfaceC5934a interfaceC5934a3 = new InterfaceC5934a() { // from class: aqe
            @Override // p000.fqe.InterfaceC5934a
            public final void upgrade(SQLiteDatabase sQLiteDatabase) {
                sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
            }
        };
        f37509b2 = interfaceC5934a3;
        InterfaceC5934a interfaceC5934a4 = new InterfaceC5934a() { // from class: bqe
            @Override // p000.fqe.InterfaceC5934a
            public final void upgrade(SQLiteDatabase sQLiteDatabase) {
                fqe.lambda$static$3(sQLiteDatabase);
            }
        };
        f37511c2 = interfaceC5934a4;
        InterfaceC5934a interfaceC5934a5 = new InterfaceC5934a() { // from class: cqe
            @Override // p000.fqe.InterfaceC5934a
            public final void upgrade(SQLiteDatabase sQLiteDatabase) {
                fqe.lambda$static$4(sQLiteDatabase);
            }
        };
        f37513d2 = interfaceC5934a5;
        InterfaceC5934a interfaceC5934a6 = new InterfaceC5934a() { // from class: dqe
            @Override // p000.fqe.InterfaceC5934a
            public final void upgrade(SQLiteDatabase sQLiteDatabase) {
                sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN product_id INTEGER");
            }
        };
        f37515e2 = interfaceC5934a6;
        InterfaceC5934a interfaceC5934a7 = new InterfaceC5934a() { // from class: eqe
            @Override // p000.fqe.InterfaceC5934a
            public final void upgrade(SQLiteDatabase sQLiteDatabase) {
                fqe.lambda$static$6(sQLiteDatabase);
            }
        };
        f37517f2 = interfaceC5934a7;
        f37518g2 = Arrays.asList(interfaceC5934a, interfaceC5934a2, interfaceC5934a3, interfaceC5934a4, interfaceC5934a5, interfaceC5934a6, interfaceC5934a7);
    }

    @a28
    public fqe(Context context, @v8b("SQLITE_DB_NAME") String str, @v8b("SCHEMA_VERSION") int i) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i);
        this.f37521b = false;
        this.f37520a = i;
    }

    private void ensureConfigured(SQLiteDatabase sQLiteDatabase) {
        if (this.f37521b) {
            return;
        }
        onConfigure(sQLiteDatabase);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$static$0(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(f37512d);
        sQLiteDatabase.execSQL(f37514e);
        sQLiteDatabase.execSQL(f37516f);
        sQLiteDatabase.execSQL(f37519m);
        sQLiteDatabase.execSQL(f37495C);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$static$1(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE transport_contexts ADD COLUMN extras BLOB");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority_extras on transport_contexts(backend_name, priority, extras)");
        sQLiteDatabase.execSQL("DROP INDEX contexts_backend_priority");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$static$3(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN inline BOOLEAN NOT NULL DEFAULT 1");
        sQLiteDatabase.execSQL(f37501N);
        sQLiteDatabase.execSQL(f37499M);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$static$4(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(f37506Z);
        sQLiteDatabase.execSQL(f37500M1);
        sQLiteDatabase.execSQL(f37502Q);
        sQLiteDatabase.execSQL(f37504X);
        sQLiteDatabase.execSQL(f37505Y);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$static$6(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN pseudonymous_id TEXT");
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN experiment_ids_clear_blob BLOB");
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN experiment_ids_encrypted_blob BLOB");
    }

    private void upgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        List<InterfaceC5934a> list = f37518g2;
        if (i2 <= list.size()) {
            while (i < i2) {
                f37518g2.get(i).upgrade(sQLiteDatabase);
                i++;
            }
            return;
        }
        throw new IllegalArgumentException("Migration from " + i + " to " + i2 + " was requested, but cannot be performed. Only " + list.size() + " migrations are provided");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.f37521b = true;
        sQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        onCreate(sQLiteDatabase, this.f37520a);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL(f37496F);
        sQLiteDatabase.execSQL(f37497H);
        sQLiteDatabase.execSQL(f37498L);
        sQLiteDatabase.execSQL(f37501N);
        sQLiteDatabase.execSQL(f37506Z);
        sQLiteDatabase.execSQL(f37500M1);
        onCreate(sQLiteDatabase, i2);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        ensureConfigured(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        ensureConfigured(sQLiteDatabase);
        upgrade(sQLiteDatabase, i, i2);
    }

    private void onCreate(SQLiteDatabase sQLiteDatabase, int i) {
        ensureConfigured(sQLiteDatabase);
        upgrade(sQLiteDatabase, 0, i);
    }
}
