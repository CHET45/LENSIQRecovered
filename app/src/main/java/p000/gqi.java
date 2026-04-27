package p000;

import android.database.Cursor;
import androidx.work.C1507b;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class gqi implements fqi {

    /* JADX INFO: renamed from: a */
    public final uae f40804a;

    /* JADX INFO: renamed from: b */
    public final l35<eqi> f40805b;

    /* JADX INFO: renamed from: c */
    public final caf f40806c;

    /* JADX INFO: renamed from: d */
    public final caf f40807d;

    /* JADX INFO: renamed from: gqi$a */
    public class C6467a extends l35<eqi> {
        public C6467a(uae database) {
            super(database);
        }

        @Override // p000.caf
        public String createQuery() {
            return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
        }

        @Override // p000.l35
        public void bind(bgg stmt, eqi value) throws Throwable {
            String str = value.f33872a;
            if (str == null) {
                stmt.bindNull(1);
            } else {
                stmt.bindString(1, str);
            }
            byte[] byteArrayInternal = C1507b.toByteArrayInternal(value.f33873b);
            if (byteArrayInternal == null) {
                stmt.bindNull(2);
            } else {
                stmt.bindBlob(2, byteArrayInternal);
            }
        }
    }

    /* JADX INFO: renamed from: gqi$b */
    public class C6468b extends caf {
        public C6468b(uae database) {
            super(database);
        }

        @Override // p000.caf
        public String createQuery() {
            return "DELETE from WorkProgress where work_spec_id=?";
        }
    }

    /* JADX INFO: renamed from: gqi$c */
    public class C6469c extends caf {
        public C6469c(uae database) {
            super(database);
        }

        @Override // p000.caf
        public String createQuery() {
            return "DELETE FROM WorkProgress";
        }
    }

    public gqi(uae __db) {
        this.f40804a = __db;
        this.f40805b = new C6467a(__db);
        this.f40806c = new C6468b(__db);
        this.f40807d = new C6469c(__db);
    }

    @Override // p000.fqi
    public void delete(final String workSpecId) {
        this.f40804a.assertNotSuspendingTransaction();
        bgg bggVarAcquire = this.f40806c.acquire();
        if (workSpecId == null) {
            bggVarAcquire.bindNull(1);
        } else {
            bggVarAcquire.bindString(1, workSpecId);
        }
        this.f40804a.beginTransaction();
        try {
            bggVarAcquire.executeUpdateDelete();
            this.f40804a.setTransactionSuccessful();
        } finally {
            this.f40804a.endTransaction();
            this.f40806c.release(bggVarAcquire);
        }
    }

    @Override // p000.fqi
    public void deleteAll() {
        this.f40804a.assertNotSuspendingTransaction();
        bgg bggVarAcquire = this.f40807d.acquire();
        this.f40804a.beginTransaction();
        try {
            bggVarAcquire.executeUpdateDelete();
            this.f40804a.setTransactionSuccessful();
        } finally {
            this.f40804a.endTransaction();
            this.f40807d.release(bggVarAcquire);
        }
    }

    @Override // p000.fqi
    public C1507b getProgressForWorkSpecId(final String workSpecId) {
        xae xaeVarAcquire = xae.acquire("SELECT progress FROM WorkProgress WHERE work_spec_id=?", 1);
        if (workSpecId == null) {
            xaeVarAcquire.bindNull(1);
        } else {
            xaeVarAcquire.bindString(1, workSpecId);
        }
        this.f40804a.assertNotSuspendingTransaction();
        Cursor cursorQuery = pe3.query(this.f40804a, xaeVarAcquire, false, null);
        try {
            return cursorQuery.moveToFirst() ? C1507b.fromByteArray(cursorQuery.getBlob(0)) : null;
        } finally {
            cursorQuery.close();
            xaeVarAcquire.release();
        }
    }

    @Override // p000.fqi
    public List<C1507b> getProgressForWorkSpecIds(final List<String> workSpecIds) {
        StringBuilder sbNewStringBuilder = k8g.newStringBuilder();
        sbNewStringBuilder.append("SELECT progress FROM WorkProgress WHERE work_spec_id IN (");
        int size = workSpecIds.size();
        k8g.appendPlaceholders(sbNewStringBuilder, size);
        sbNewStringBuilder.append(c0b.f15434d);
        xae xaeVarAcquire = xae.acquire(sbNewStringBuilder.toString(), size);
        int i = 1;
        for (String str : workSpecIds) {
            if (str == null) {
                xaeVarAcquire.bindNull(i);
            } else {
                xaeVarAcquire.bindString(i, str);
            }
            i++;
        }
        this.f40804a.assertNotSuspendingTransaction();
        Cursor cursorQuery = pe3.query(this.f40804a, xaeVarAcquire, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                arrayList.add(C1507b.fromByteArray(cursorQuery.getBlob(0)));
            }
            return arrayList;
        } finally {
            cursorQuery.close();
            xaeVarAcquire.release();
        }
    }

    @Override // p000.fqi
    public void insert(final eqi progress) {
        this.f40804a.assertNotSuspendingTransaction();
        this.f40804a.beginTransaction();
        try {
            this.f40805b.insert(progress);
            this.f40804a.setTransactionSuccessful();
        } finally {
            this.f40804a.endTransaction();
        }
    }
}
