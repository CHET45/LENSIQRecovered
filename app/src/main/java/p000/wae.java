package p000;

import android.database.Cursor;
import java.util.Iterator;
import java.util.List;
import p000.p7e;
import p000.xfg;

/* JADX INFO: loaded from: classes3.dex */
@p7e({p7e.EnumC10826a.f69936c})
public class wae extends xfg.AbstractC15046a {

    /* JADX INFO: renamed from: h */
    @yfb
    public static final C14528a f93821h = new C14528a(null);

    /* JADX INFO: renamed from: d */
    @gib
    public ni3 f93822d;

    /* JADX INFO: renamed from: e */
    @yfb
    public final AbstractC14529b f93823e;

    /* JADX INFO: renamed from: f */
    @yfb
    public final String f93824f;

    /* JADX INFO: renamed from: g */
    @yfb
    public final String f93825g;

    /* JADX INFO: renamed from: wae$a */
    public static final class C14528a {
        public /* synthetic */ C14528a(jt3 jt3Var) {
            this();
        }

        public final boolean hasEmptySchema$room_runtime_release(@yfb wfg wfgVar) {
            md8.checkNotNullParameter(wfgVar, "db");
            Cursor cursorQuery = wfgVar.query("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
            try {
                boolean z = false;
                if (cursorQuery.moveToFirst()) {
                    if (cursorQuery.getInt(0) == 0) {
                        z = true;
                    }
                }
                u52.closeFinally(cursorQuery, null);
                return z;
            } finally {
            }
        }

        public final boolean hasRoomMasterTable$room_runtime_release(@yfb wfg wfgVar) {
            md8.checkNotNullParameter(wfgVar, "db");
            Cursor cursorQuery = wfgVar.query("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
            try {
                boolean z = false;
                if (cursorQuery.moveToFirst()) {
                    if (cursorQuery.getInt(0) != 0) {
                        z = true;
                    }
                }
                u52.closeFinally(cursorQuery, null);
                return z;
            } finally {
            }
        }

        private C14528a() {
        }
    }

    /* JADX INFO: renamed from: wae$b */
    @p7e({p7e.EnumC10826a.f69936c})
    public static abstract class AbstractC14529b {

        @un8
        public final int version;

        public AbstractC14529b(int i) {
            this.version = i;
        }

        public abstract void createAllTables(@yfb wfg wfgVar);

        public abstract void dropAllTables(@yfb wfg wfgVar);

        public abstract void onCreate(@yfb wfg wfgVar);

        public abstract void onOpen(@yfb wfg wfgVar);

        public void onPostMigrate(@yfb wfg wfgVar) {
            md8.checkNotNullParameter(wfgVar, "database");
        }

        public void onPreMigrate(@yfb wfg wfgVar) {
            md8.checkNotNullParameter(wfgVar, "database");
        }

        @yfb
        public C14530c onValidateSchema(@yfb wfg wfgVar) {
            md8.checkNotNullParameter(wfgVar, "db");
            validateMigration(wfgVar);
            return new C14530c(true, null);
        }

        @q64(message = "Use [onValidateSchema(SupportSQLiteDatabase)]")
        public void validateMigration(@yfb wfg wfgVar) {
            md8.checkNotNullParameter(wfgVar, "db");
            throw new UnsupportedOperationException("validateMigration is deprecated");
        }
    }

    /* JADX INFO: renamed from: wae$c */
    @p7e({p7e.EnumC10826a.f69936c})
    public static class C14530c {

        /* JADX INFO: renamed from: a */
        @un8
        public final boolean f93826a;

        /* JADX INFO: renamed from: b */
        @gib
        @un8
        public final String f93827b;

        public C14530c(boolean z, @gib String str) {
            this.f93826a = z;
            this.f93827b = str;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wae(@yfb ni3 ni3Var, @yfb AbstractC14529b abstractC14529b, @yfb String str, @yfb String str2) {
        super(abstractC14529b.version);
        md8.checkNotNullParameter(ni3Var, "configuration");
        md8.checkNotNullParameter(abstractC14529b, "delegate");
        md8.checkNotNullParameter(str, "identityHash");
        md8.checkNotNullParameter(str2, "legacyHash");
        this.f93822d = ni3Var;
        this.f93823e = abstractC14529b;
        this.f93824f = str;
        this.f93825g = str2;
    }

    private final void checkIdentity(wfg wfgVar) {
        if (!f93821h.hasRoomMasterTable$room_runtime_release(wfgVar)) {
            C14530c c14530cOnValidateSchema = this.f93823e.onValidateSchema(wfgVar);
            if (c14530cOnValidateSchema.f93826a) {
                this.f93823e.onPostMigrate(wfgVar);
                updateIdentity(wfgVar);
                return;
            } else {
                throw new IllegalStateException("Pre-packaged database has an invalid schema: " + c14530cOnValidateSchema.f93827b);
            }
        }
        Cursor cursorQuery = wfgVar.query(new cjf(vae.f90483h));
        try {
            String string = cursorQuery.moveToFirst() ? cursorQuery.getString(0) : null;
            u52.closeFinally(cursorQuery, null);
            if (md8.areEqual(this.f93824f, string) || md8.areEqual(this.f93825g, string)) {
                return;
            }
            throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: " + this.f93824f + ", found: " + string);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                u52.closeFinally(cursorQuery, th);
                throw th2;
            }
        }
    }

    private final void createMasterTableIfNotExists(wfg wfgVar) {
        wfgVar.execSQL(vae.f90482g);
    }

    private final void updateIdentity(wfg wfgVar) {
        createMasterTableIfNotExists(wfgVar);
        wfgVar.execSQL(vae.createInsertQuery(this.f93824f));
    }

    @Override // p000.xfg.AbstractC15046a
    public void onConfigure(@yfb wfg wfgVar) {
        md8.checkNotNullParameter(wfgVar, "db");
        super.onConfigure(wfgVar);
    }

    @Override // p000.xfg.AbstractC15046a
    public void onCreate(@yfb wfg wfgVar) {
        md8.checkNotNullParameter(wfgVar, "db");
        boolean zHasEmptySchema$room_runtime_release = f93821h.hasEmptySchema$room_runtime_release(wfgVar);
        this.f93823e.createAllTables(wfgVar);
        if (!zHasEmptySchema$room_runtime_release) {
            C14530c c14530cOnValidateSchema = this.f93823e.onValidateSchema(wfgVar);
            if (!c14530cOnValidateSchema.f93826a) {
                throw new IllegalStateException("Pre-packaged database has an invalid schema: " + c14530cOnValidateSchema.f93827b);
            }
        }
        updateIdentity(wfgVar);
        this.f93823e.onCreate(wfgVar);
    }

    @Override // p000.xfg.AbstractC15046a
    public void onDowngrade(@yfb wfg wfgVar, int i, int i2) {
        md8.checkNotNullParameter(wfgVar, "db");
        onUpgrade(wfgVar, i, i2);
    }

    @Override // p000.xfg.AbstractC15046a
    public void onOpen(@yfb wfg wfgVar) {
        md8.checkNotNullParameter(wfgVar, "db");
        super.onOpen(wfgVar);
        checkIdentity(wfgVar);
        this.f93823e.onOpen(wfgVar);
        this.f93822d = null;
    }

    @Override // p000.xfg.AbstractC15046a
    public void onUpgrade(@yfb wfg wfgVar, int i, int i2) {
        List<ova> listFindMigrationPath;
        md8.checkNotNullParameter(wfgVar, "db");
        ni3 ni3Var = this.f93822d;
        if (ni3Var == null || (listFindMigrationPath = ni3Var.f64639d.findMigrationPath(i, i2)) == null) {
            ni3 ni3Var2 = this.f93822d;
            if (ni3Var2 != null && !ni3Var2.isMigrationRequired(i, i2)) {
                this.f93823e.dropAllTables(wfgVar);
                this.f93823e.createAllTables(wfgVar);
                return;
            }
            throw new IllegalStateException("A migration from " + i + " to " + i2 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
        }
        this.f93823e.onPreMigrate(wfgVar);
        Iterator<T> it = listFindMigrationPath.iterator();
        while (it.hasNext()) {
            ((ova) it.next()).migrate(wfgVar);
        }
        C14530c c14530cOnValidateSchema = this.f93823e.onValidateSchema(wfgVar);
        if (c14530cOnValidateSchema.f93826a) {
            this.f93823e.onPostMigrate(wfgVar);
            updateIdentity(wfgVar);
        } else {
            throw new IllegalStateException("Migration didn't properly handle: " + c14530cOnValidateSchema.f93827b);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public wae(@yfb ni3 ni3Var, @yfb AbstractC14529b abstractC14529b, @yfb String str) {
        this(ni3Var, abstractC14529b, "", str);
        md8.checkNotNullParameter(ni3Var, "configuration");
        md8.checkNotNullParameter(abstractC14529b, "delegate");
        md8.checkNotNullParameter(str, "legacyHash");
    }
}
