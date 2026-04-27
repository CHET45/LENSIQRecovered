package p000;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class st3 implements ti3 {

    /* JADX INFO: renamed from: a */
    public final SQLiteOpenHelper f82811a;

    public st3(SQLiteOpenHelper sQLiteOpenHelper) {
        this.f82811a = sQLiteOpenHelper;
    }

    @Override // p000.ti3
    public SQLiteDatabase getReadableDatabase() {
        return this.f82811a.getReadableDatabase();
    }

    @Override // p000.ti3
    public SQLiteDatabase getWritableDatabase() {
        return this.f82811a.getWritableDatabase();
    }
}
