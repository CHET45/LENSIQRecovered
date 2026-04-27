package p000;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class jjg implements ijg {

    /* JADX INFO: renamed from: a */
    public final uae f50727a;

    /* JADX INFO: renamed from: b */
    public final l35<hjg> f50728b;

    /* JADX INFO: renamed from: c */
    public final caf f50729c;

    /* JADX INFO: renamed from: jjg$a */
    public class C7919a extends l35<hjg> {
        public C7919a(uae database) {
            super(database);
        }

        @Override // p000.caf
        public String createQuery() {
            return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`system_id`) VALUES (?,?)";
        }

        @Override // p000.l35
        public void bind(bgg stmt, hjg value) {
            String str = value.f43826a;
            if (str == null) {
                stmt.bindNull(1);
            } else {
                stmt.bindString(1, str);
            }
            stmt.bindLong(2, value.f43827b);
        }
    }

    /* JADX INFO: renamed from: jjg$b */
    public class C7920b extends caf {
        public C7920b(uae database) {
            super(database);
        }

        @Override // p000.caf
        public String createQuery() {
            return "DELETE FROM SystemIdInfo where work_spec_id=?";
        }
    }

    public jjg(uae __db) {
        this.f50727a = __db;
        this.f50728b = new C7919a(__db);
        this.f50729c = new C7920b(__db);
    }

    @Override // p000.ijg
    public hjg getSystemIdInfo(final String workSpecId) {
        xae xaeVarAcquire = xae.acquire("SELECT `SystemIdInfo`.`work_spec_id` AS `work_spec_id`, `SystemIdInfo`.`system_id` AS `system_id` FROM SystemIdInfo WHERE work_spec_id=?", 1);
        if (workSpecId == null) {
            xaeVarAcquire.bindNull(1);
        } else {
            xaeVarAcquire.bindString(1, workSpecId);
        }
        this.f50727a.assertNotSuspendingTransaction();
        Cursor cursorQuery = pe3.query(this.f50727a, xaeVarAcquire, false, null);
        try {
            return cursorQuery.moveToFirst() ? new hjg(cursorQuery.getString(bb3.getColumnIndexOrThrow(cursorQuery, "work_spec_id")), cursorQuery.getInt(bb3.getColumnIndexOrThrow(cursorQuery, "system_id"))) : null;
        } finally {
            cursorQuery.close();
            xaeVarAcquire.release();
        }
    }

    @Override // p000.ijg
    public List<String> getWorkSpecIds() {
        xae xaeVarAcquire = xae.acquire("SELECT DISTINCT work_spec_id FROM SystemIdInfo", 0);
        this.f50727a.assertNotSuspendingTransaction();
        Cursor cursorQuery = pe3.query(this.f50727a, xaeVarAcquire, false, null);
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

    @Override // p000.ijg
    public void insertSystemIdInfo(final hjg systemIdInfo) {
        this.f50727a.assertNotSuspendingTransaction();
        this.f50727a.beginTransaction();
        try {
            this.f50728b.insert(systemIdInfo);
            this.f50727a.setTransactionSuccessful();
        } finally {
            this.f50727a.endTransaction();
        }
    }

    @Override // p000.ijg
    public void removeSystemIdInfo(final String workSpecId) {
        this.f50727a.assertNotSuspendingTransaction();
        bgg bggVarAcquire = this.f50729c.acquire();
        if (workSpecId == null) {
            bggVarAcquire.bindNull(1);
        } else {
            bggVarAcquire.bindString(1, workSpecId);
        }
        this.f50727a.beginTransaction();
        try {
            bggVarAcquire.executeUpdateDelete();
            this.f50727a.setTransactionSuccessful();
        } finally {
            this.f50727a.endTransaction();
            this.f50729c.release(bggVarAcquire);
        }
    }
}
