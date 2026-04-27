package p000;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class m64 implements l64 {

    /* JADX INFO: renamed from: a */
    public final uae f60004a;

    /* JADX INFO: renamed from: b */
    public final l35<h64> f60005b;

    /* JADX INFO: renamed from: m64$a */
    public class C9160a extends l35<h64> {
        public C9160a(uae database) {
            super(database);
        }

        @Override // p000.caf
        public String createQuery() {
            return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
        }

        @Override // p000.l35
        public void bind(bgg stmt, h64 value) {
            String str = value.f42471a;
            if (str == null) {
                stmt.bindNull(1);
            } else {
                stmt.bindString(1, str);
            }
            String str2 = value.f42472b;
            if (str2 == null) {
                stmt.bindNull(2);
            } else {
                stmt.bindString(2, str2);
            }
        }
    }

    public m64(uae __db) {
        this.f60004a = __db;
        this.f60005b = new C9160a(__db);
    }

    @Override // p000.l64
    public List<String> getDependentWorkIds(final String id) {
        xae xaeVarAcquire = xae.acquire("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?", 1);
        if (id == null) {
            xaeVarAcquire.bindNull(1);
        } else {
            xaeVarAcquire.bindString(1, id);
        }
        this.f60004a.assertNotSuspendingTransaction();
        Cursor cursorQuery = pe3.query(this.f60004a, xaeVarAcquire, false, null);
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

    @Override // p000.l64
    public List<String> getPrerequisites(final String id) {
        xae xaeVarAcquire = xae.acquire("SELECT prerequisite_id FROM dependency WHERE work_spec_id=?", 1);
        if (id == null) {
            xaeVarAcquire.bindNull(1);
        } else {
            xaeVarAcquire.bindString(1, id);
        }
        this.f60004a.assertNotSuspendingTransaction();
        Cursor cursorQuery = pe3.query(this.f60004a, xaeVarAcquire, false, null);
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

    @Override // p000.l64
    public boolean hasCompletedAllPrerequisites(final String id) {
        xae xaeVarAcquire = xae.acquire("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)", 1);
        if (id == null) {
            xaeVarAcquire.bindNull(1);
        } else {
            xaeVarAcquire.bindString(1, id);
        }
        this.f60004a.assertNotSuspendingTransaction();
        boolean z = false;
        Cursor cursorQuery = pe3.query(this.f60004a, xaeVarAcquire, false, null);
        try {
            if (cursorQuery.moveToFirst()) {
                z = cursorQuery.getInt(0) != 0;
            }
            return z;
        } finally {
            cursorQuery.close();
            xaeVarAcquire.release();
        }
    }

    @Override // p000.l64
    public boolean hasDependents(final String id) {
        xae xaeVarAcquire = xae.acquire("SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?", 1);
        if (id == null) {
            xaeVarAcquire.bindNull(1);
        } else {
            xaeVarAcquire.bindString(1, id);
        }
        this.f60004a.assertNotSuspendingTransaction();
        boolean z = false;
        Cursor cursorQuery = pe3.query(this.f60004a, xaeVarAcquire, false, null);
        try {
            if (cursorQuery.moveToFirst()) {
                z = cursorQuery.getInt(0) != 0;
            }
            return z;
        } finally {
            cursorQuery.close();
            xaeVarAcquire.release();
        }
    }

    @Override // p000.l64
    public void insertDependency(final h64 dependency) {
        this.f60004a.assertNotSuspendingTransaction();
        this.f60004a.beginTransaction();
        try {
            this.f60005b.insert(dependency);
            this.f60004a.setTransactionSuccessful();
        } finally {
            this.f60004a.endTransaction();
        }
    }
}
