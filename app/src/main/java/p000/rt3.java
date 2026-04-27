package p000;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class rt3 implements si3 {

    /* JADX INFO: renamed from: a */
    public final SQLiteOpenHelper f79455a;

    public rt3(SQLiteOpenHelper sQLiteOpenHelper) {
        this.f79455a = sQLiteOpenHelper;
    }

    @Override // p000.si3
    public SQLiteDatabase getReadableDatabase() {
        return this.f79455a.getReadableDatabase();
    }

    @Override // p000.si3
    public SQLiteDatabase getWritableDatabase() {
        return this.f79455a.getWritableDatabase();
    }
}
