package p000;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.CancellationSignal;
import android.util.Pair;
import java.io.Closeable;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public interface wfg extends Closeable {
    void beginTransaction();

    void beginTransactionNonExclusive();

    void beginTransactionWithListener(@yfb SQLiteTransactionListener sQLiteTransactionListener);

    void beginTransactionWithListenerNonExclusive(@yfb SQLiteTransactionListener sQLiteTransactionListener);

    @yfb
    bgg compileStatement(@yfb String str);

    int delete(@yfb String str, @gib String str2, @gib Object[] objArr);

    @c5e(api = 16)
    void disableWriteAheadLogging();

    boolean enableWriteAheadLogging();

    void endTransaction();

    default void execPerConnectionSQL(@yfb String str, @gib @igg({"ArrayReturn"}) Object[] objArr) {
        md8.checkNotNullParameter(str, "sql");
        throw new UnsupportedOperationException();
    }

    void execSQL(@yfb String str) throws SQLException;

    void execSQL(@yfb String str, @yfb Object[] objArr) throws SQLException;

    @gib
    List<Pair<String, String>> getAttachedDbs();

    long getMaximumSize();

    long getPageSize();

    @gib
    String getPath();

    int getVersion();

    boolean inTransaction();

    long insert(@yfb String str, int i, @yfb ContentValues contentValues) throws SQLException;

    boolean isDatabaseIntegrityOk();

    boolean isDbLockedByCurrentThread();

    default boolean isExecPerConnectionSQLSupported() {
        return false;
    }

    boolean isOpen();

    boolean isReadOnly();

    @c5e(api = 16)
    boolean isWriteAheadLoggingEnabled();

    boolean needUpgrade(int i);

    @yfb
    Cursor query(@yfb String str);

    @yfb
    Cursor query(@yfb String str, @yfb Object[] objArr);

    @yfb
    Cursor query(@yfb zfg zfgVar);

    @c5e(api = 16)
    @yfb
    Cursor query(@yfb zfg zfgVar, @gib CancellationSignal cancellationSignal);

    @c5e(api = 16)
    void setForeignKeyConstraintsEnabled(boolean z);

    void setLocale(@yfb Locale locale);

    void setMaxSqlCacheSize(int i);

    long setMaximumSize(long j);

    void setPageSize(long j);

    void setTransactionSuccessful();

    void setVersion(int i);

    int update(@yfb String str, int i, @yfb ContentValues contentValues, @gib String str2, @gib Object[] objArr);

    boolean yieldIfContendedSafely();

    boolean yieldIfContendedSafely(long j);
}
