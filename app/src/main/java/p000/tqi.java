package p000;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class tqi implements sqi {

    /* JADX INFO: renamed from: a */
    public final uae f85639a;

    /* JADX INFO: renamed from: b */
    public final l35<rqi> f85640b;

    /* JADX INFO: renamed from: tqi$a */
    public class C13170a extends l35<rqi> {
        public C13170a(uae database) {
            super(database);
        }

        @Override // p000.caf
        public String createQuery() {
            return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }

        @Override // p000.l35
        public void bind(bgg stmt, rqi value) {
            String str = value.f79060a;
            if (str == null) {
                stmt.bindNull(1);
            } else {
                stmt.bindString(1, str);
            }
            String str2 = value.f79061b;
            if (str2 == null) {
                stmt.bindNull(2);
            } else {
                stmt.bindString(2, str2);
            }
        }
    }

    public tqi(uae __db) {
        this.f85639a = __db;
        this.f85640b = new C13170a(__db);
    }

    @Override // p000.sqi
    public List<String> getTagsForWorkSpecId(final String id) {
        xae xaeVarAcquire = xae.acquire("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?", 1);
        if (id == null) {
            xaeVarAcquire.bindNull(1);
        } else {
            xaeVarAcquire.bindString(1, id);
        }
        this.f85639a.assertNotSuspendingTransaction();
        Cursor cursorQuery = pe3.query(this.f85639a, xaeVarAcquire, false, null);
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

    @Override // p000.sqi
    public List<String> getWorkSpecIdsWithTag(final String tag) {
        xae xaeVarAcquire = xae.acquire("SELECT work_spec_id FROM worktag WHERE tag=?", 1);
        if (tag == null) {
            xaeVarAcquire.bindNull(1);
        } else {
            xaeVarAcquire.bindString(1, tag);
        }
        this.f85639a.assertNotSuspendingTransaction();
        Cursor cursorQuery = pe3.query(this.f85639a, xaeVarAcquire, false, null);
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

    @Override // p000.sqi
    public void insert(final rqi workTag) {
        this.f85639a.assertNotSuspendingTransaction();
        this.f85639a.beginTransaction();
        try {
            this.f85640b.insert(workTag);
            this.f85639a.setTransactionSuccessful();
        } finally {
            this.f85639a.endTransaction();
        }
    }
}
