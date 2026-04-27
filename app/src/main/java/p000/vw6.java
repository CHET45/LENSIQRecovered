package p000;

import android.database.sqlite.SQLiteProgram;

/* JADX INFO: loaded from: classes3.dex */
public class vw6 implements yfg {

    /* JADX INFO: renamed from: a */
    @yfb
    public final SQLiteProgram f92419a;

    public vw6(@yfb SQLiteProgram sQLiteProgram) {
        md8.checkNotNullParameter(sQLiteProgram, "delegate");
        this.f92419a = sQLiteProgram;
    }

    @Override // p000.yfg
    public void bindBlob(int i, @yfb byte[] bArr) {
        md8.checkNotNullParameter(bArr, "value");
        this.f92419a.bindBlob(i, bArr);
    }

    @Override // p000.yfg
    public void bindDouble(int i, double d) {
        this.f92419a.bindDouble(i, d);
    }

    @Override // p000.yfg
    public void bindLong(int i, long j) {
        this.f92419a.bindLong(i, j);
    }

    @Override // p000.yfg
    public void bindNull(int i) {
        this.f92419a.bindNull(i);
    }

    @Override // p000.yfg
    public void bindString(int i, @yfb String str) {
        md8.checkNotNullParameter(str, "value");
        this.f92419a.bindString(i, str);
    }

    @Override // p000.yfg
    public void clearBindings() {
        this.f92419a.clearBindings();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f92419a.close();
    }
}
