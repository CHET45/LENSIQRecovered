package p000;

import android.database.Cursor;
import androidx.lifecycle.AbstractC1158q;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class w8d implements v8d {

    /* JADX INFO: renamed from: a */
    public final uae f93615a;

    /* JADX INFO: renamed from: b */
    public final l35<u8d> f93616b;

    /* JADX INFO: renamed from: w8d$a */
    public class C14479a extends l35<u8d> {
        public C14479a(uae database) {
            super(database);
        }

        @Override // p000.caf
        public String createQuery() {
            return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
        }

        @Override // p000.l35
        public void bind(bgg stmt, u8d value) {
            String str = value.f87068a;
            if (str == null) {
                stmt.bindNull(1);
            } else {
                stmt.bindString(1, str);
            }
            Long l = value.f87069b;
            if (l == null) {
                stmt.bindNull(2);
            } else {
                stmt.bindLong(2, l.longValue());
            }
        }
    }

    /* JADX INFO: renamed from: w8d$b */
    public class CallableC14480b implements Callable<Long> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ xae f93618a;

        public CallableC14480b(final xae val$_statement) {
            this.f93618a = val$_statement;
        }

        public void finalize() {
            this.f93618a.release();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        public Long call() throws Exception {
            Long lValueOf = null;
            Cursor cursorQuery = pe3.query(w8d.this.f93615a, this.f93618a, false, null);
            try {
                if (cursorQuery.moveToFirst() && !cursorQuery.isNull(0)) {
                    lValueOf = Long.valueOf(cursorQuery.getLong(0));
                }
                return lValueOf;
            } finally {
                cursorQuery.close();
            }
        }
    }

    public w8d(uae __db) {
        this.f93615a = __db;
        this.f93616b = new C14479a(__db);
    }

    @Override // p000.v8d
    public Long getLongValue(final String key) {
        xae xaeVarAcquire = xae.acquire("SELECT long_value FROM Preference where `key`=?", 1);
        if (key == null) {
            xaeVarAcquire.bindNull(1);
        } else {
            xaeVarAcquire.bindString(1, key);
        }
        this.f93615a.assertNotSuspendingTransaction();
        Long lValueOf = null;
        Cursor cursorQuery = pe3.query(this.f93615a, xaeVarAcquire, false, null);
        try {
            if (cursorQuery.moveToFirst() && !cursorQuery.isNull(0)) {
                lValueOf = Long.valueOf(cursorQuery.getLong(0));
            }
            return lValueOf;
        } finally {
            cursorQuery.close();
            xaeVarAcquire.release();
        }
    }

    @Override // p000.v8d
    public AbstractC1158q<Long> getObservableLongValue(final String key) {
        xae xaeVarAcquire = xae.acquire("SELECT long_value FROM Preference where `key`=?", 1);
        if (key == null) {
            xaeVarAcquire.bindNull(1);
        } else {
            xaeVarAcquire.bindString(1, key);
        }
        return this.f93615a.getInvalidationTracker().createLiveData(new String[]{"Preference"}, false, new CallableC14480b(xaeVarAcquire));
    }

    @Override // p000.v8d
    public void insertPreference(final u8d preference) {
        this.f93615a.assertNotSuspendingTransaction();
        this.f93615a.beginTransaction();
        try {
            this.f93616b.insert(preference);
            this.f93615a.setTransactionSuccessful();
        } finally {
            this.f93615a.endTransaction();
        }
    }
}
