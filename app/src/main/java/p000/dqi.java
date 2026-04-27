package p000;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class dqi implements cqi {

    /* JADX INFO: renamed from: a */
    public final uae f30423a;

    /* JADX INFO: renamed from: b */
    public final l35<bqi> f30424b;

    /* JADX INFO: renamed from: dqi$a */
    public class C4910a extends l35<bqi> {
        public C4910a(uae database) {
            super(database);
        }

        @Override // p000.caf
        public String createQuery() {
            return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
        }

        @Override // p000.l35
        public void bind(bgg stmt, bqi value) {
            String str = value.f14522a;
            if (str == null) {
                stmt.bindNull(1);
            } else {
                stmt.bindString(1, str);
            }
            String str2 = value.f14523b;
            if (str2 == null) {
                stmt.bindNull(2);
            } else {
                stmt.bindString(2, str2);
            }
        }
    }

    public dqi(uae __db) {
        this.f30423a = __db;
        this.f30424b = new C4910a(__db);
    }

    @Override // p000.cqi
    public List<String> getNamesForWorkSpecId(final String workSpecId) {
        xae xaeVarAcquire = xae.acquire("SELECT name FROM workname WHERE work_spec_id=?", 1);
        if (workSpecId == null) {
            xaeVarAcquire.bindNull(1);
        } else {
            xaeVarAcquire.bindString(1, workSpecId);
        }
        this.f30423a.assertNotSuspendingTransaction();
        Cursor cursorQuery = pe3.query(this.f30423a, xaeVarAcquire, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                arrayList.add(cursorQuery.getString(0));
            }
            return arrayList;
        } finally {
            cursorQuery.close();
            xaeVarAcquire.release();
        }
    }

    @Override // p000.cqi
    public List<String> getWorkSpecIdsWithName(final String name) {
        xae xaeVarAcquire = xae.acquire("SELECT work_spec_id FROM workname WHERE name=?", 1);
        if (name == null) {
            xaeVarAcquire.bindNull(1);
        } else {
            xaeVarAcquire.bindString(1, name);
        }
        this.f30423a.assertNotSuspendingTransaction();
        Cursor cursorQuery = pe3.query(this.f30423a, xaeVarAcquire, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                arrayList.add(cursorQuery.getString(0));
            }
            return arrayList;
        } finally {
            cursorQuery.close();
            xaeVarAcquire.release();
        }
    }

    @Override // p000.cqi
    public void insert(final bqi workName) {
        this.f30423a.assertNotSuspendingTransaction();
        this.f30423a.beginTransaction();
        try {
            this.f30424b.insert(workName);
            this.f30423a.setTransactionSuccessful();
        } finally {
            this.f30423a.endTransaction();
        }
    }
}
