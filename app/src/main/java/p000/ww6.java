package p000;

import android.database.sqlite.SQLiteStatement;

/* JADX INFO: loaded from: classes3.dex */
public final class ww6 extends vw6 implements bgg {

    /* JADX INFO: renamed from: b */
    @yfb
    public final SQLiteStatement f95595b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ww6(@yfb SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        md8.checkNotNullParameter(sQLiteStatement, "delegate");
        this.f95595b = sQLiteStatement;
    }

    @Override // p000.bgg
    public void execute() {
        this.f95595b.execute();
    }

    @Override // p000.bgg
    public long executeInsert() {
        return this.f95595b.executeInsert();
    }

    @Override // p000.bgg
    public int executeUpdateDelete() {
        return this.f95595b.executeUpdateDelete();
    }

    @Override // p000.bgg
    public long simpleQueryForLong() {
        return this.f95595b.simpleQueryForLong();
    }

    @Override // p000.bgg
    @gib
    public String simpleQueryForString() {
        return this.f95595b.simpleQueryForString();
    }
}
