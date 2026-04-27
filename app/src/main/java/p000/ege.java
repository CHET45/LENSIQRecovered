package p000;

import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
public final class ege {
    public static final <T> T transaction(@yfb SQLiteDatabase sQLiteDatabase, boolean z, @yfb qy6<? super SQLiteDatabase, ? extends T> qy6Var) {
        if (z) {
            sQLiteDatabase.beginTransaction();
        } else {
            sQLiteDatabase.beginTransactionNonExclusive();
        }
        try {
            T tInvoke = qy6Var.invoke(sQLiteDatabase);
            sQLiteDatabase.setTransactionSuccessful();
            return tInvoke;
        } finally {
            o28.finallyStart(1);
            sQLiteDatabase.endTransaction();
            o28.finallyEnd(1);
        }
    }

    public static /* synthetic */ Object transaction$default(SQLiteDatabase sQLiteDatabase, boolean z, qy6 qy6Var, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if (z) {
            sQLiteDatabase.beginTransaction();
        } else {
            sQLiteDatabase.beginTransactionNonExclusive();
        }
        try {
            Object objInvoke = qy6Var.invoke(sQLiteDatabase);
            sQLiteDatabase.setTransactionSuccessful();
            return objInvoke;
        } finally {
            o28.finallyStart(1);
            sQLiteDatabase.endTransaction();
            o28.finallyEnd(1);
        }
    }
}
