package p000;

import android.app.ActivityManager;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import java.io.File;
import java.util.List;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
@p7e({p7e.EnumC10826a.f69935b})
public final class vfg {

    /* JADX INFO: renamed from: vfg$a */
    @c5e(16)
    @p7e({p7e.EnumC10826a.f69935b})
    public static final class C14039a {

        /* JADX INFO: renamed from: a */
        @yfb
        public static final C14039a f91013a = new C14039a();

        private C14039a() {
        }

        @do8
        @p7e({p7e.EnumC10826a.f69935b})
        public static final void cancel(@yfb CancellationSignal cancellationSignal) {
            md8.checkNotNullParameter(cancellationSignal, "cancellationSignal");
            cancellationSignal.cancel();
        }

        @do8
        @yfb
        @p7e({p7e.EnumC10826a.f69935b})
        public static final CancellationSignal createCancellationSignal() {
            return new CancellationSignal();
        }

        @do8
        @p7e({p7e.EnumC10826a.f69935b})
        public static final boolean deleteDatabase(@yfb File file) {
            md8.checkNotNullParameter(file, "file");
            return SQLiteDatabase.deleteDatabase(file);
        }

        @do8
        @p7e({p7e.EnumC10826a.f69935b})
        public static final void disableWriteAheadLogging(@yfb SQLiteDatabase sQLiteDatabase) {
            md8.checkNotNullParameter(sQLiteDatabase, "sQLiteDatabase");
            sQLiteDatabase.disableWriteAheadLogging();
        }

        @do8
        @p7e({p7e.EnumC10826a.f69935b})
        public static final boolean isWriteAheadLoggingEnabled(@yfb SQLiteDatabase sQLiteDatabase) {
            md8.checkNotNullParameter(sQLiteDatabase, "sQLiteDatabase");
            return sQLiteDatabase.isWriteAheadLoggingEnabled();
        }

        @do8
        @yfb
        @p7e({p7e.EnumC10826a.f69935b})
        public static final Cursor rawQueryWithFactory(@yfb SQLiteDatabase sQLiteDatabase, @yfb String str, @yfb String[] strArr, @gib String str2, @yfb CancellationSignal cancellationSignal, @yfb SQLiteDatabase.CursorFactory cursorFactory) {
            md8.checkNotNullParameter(sQLiteDatabase, "sQLiteDatabase");
            md8.checkNotNullParameter(str, "sql");
            md8.checkNotNullParameter(strArr, "selectionArgs");
            md8.checkNotNullParameter(cancellationSignal, "cancellationSignal");
            md8.checkNotNullParameter(cursorFactory, "cursorFactory");
            Cursor cursorRawQueryWithFactory = sQLiteDatabase.rawQueryWithFactory(cursorFactory, str, strArr, str2, cancellationSignal);
            md8.checkNotNullExpressionValue(cursorRawQueryWithFactory, "sQLiteDatabase.rawQueryW…ationSignal\n            )");
            return cursorRawQueryWithFactory;
        }

        @do8
        @p7e({p7e.EnumC10826a.f69935b})
        public static final void setForeignKeyConstraintsEnabled(@yfb SQLiteDatabase sQLiteDatabase, boolean z) {
            md8.checkNotNullParameter(sQLiteDatabase, "sQLiteDatabase");
            sQLiteDatabase.setForeignKeyConstraintsEnabled(z);
        }

        @do8
        @p7e({p7e.EnumC10826a.f69935b})
        public static final void setWriteAheadLoggingEnabled(@yfb SQLiteOpenHelper sQLiteOpenHelper, boolean z) {
            md8.checkNotNullParameter(sQLiteOpenHelper, "sQLiteOpenHelper");
            sQLiteOpenHelper.setWriteAheadLoggingEnabled(z);
        }
    }

    /* JADX INFO: renamed from: vfg$b */
    @c5e(19)
    @p7e({p7e.EnumC10826a.f69935b})
    public static final class C14040b {

        /* JADX INFO: renamed from: a */
        @yfb
        public static final C14040b f91014a = new C14040b();

        private C14040b() {
        }

        @do8
        @yfb
        @p7e({p7e.EnumC10826a.f69935b})
        public static final Uri getNotificationUri(@yfb Cursor cursor) {
            md8.checkNotNullParameter(cursor, "cursor");
            Uri notificationUri = cursor.getNotificationUri();
            md8.checkNotNullExpressionValue(notificationUri, "cursor.notificationUri");
            return notificationUri;
        }

        @do8
        @p7e({p7e.EnumC10826a.f69935b})
        public static final boolean isLowRamDevice(@yfb ActivityManager activityManager) {
            md8.checkNotNullParameter(activityManager, "activityManager");
            return activityManager.isLowRamDevice();
        }
    }

    /* JADX INFO: renamed from: vfg$c */
    @c5e(21)
    @p7e({p7e.EnumC10826a.f69935b})
    public static final class C14041c {

        /* JADX INFO: renamed from: a */
        @yfb
        public static final C14041c f91015a = new C14041c();

        private C14041c() {
        }

        @do8
        @yfb
        @p7e({p7e.EnumC10826a.f69935b})
        public static final File getNoBackupFilesDir(@yfb Context context) {
            md8.checkNotNullParameter(context, "context");
            File noBackupFilesDir = context.getNoBackupFilesDir();
            md8.checkNotNullExpressionValue(noBackupFilesDir, "context.noBackupFilesDir");
            return noBackupFilesDir;
        }
    }

    /* JADX INFO: renamed from: vfg$d */
    @c5e(23)
    @p7e({p7e.EnumC10826a.f69935b})
    public static final class C14042d {

        /* JADX INFO: renamed from: a */
        @yfb
        public static final C14042d f91016a = new C14042d();

        private C14042d() {
        }

        @do8
        @p7e({p7e.EnumC10826a.f69935b})
        public static final void setExtras(@yfb Cursor cursor, @yfb Bundle bundle) {
            md8.checkNotNullParameter(cursor, "cursor");
            md8.checkNotNullParameter(bundle, "extras");
            cursor.setExtras(bundle);
        }
    }

    /* JADX INFO: renamed from: vfg$e */
    @c5e(29)
    @p7e({p7e.EnumC10826a.f69935b})
    public static final class C14043e {

        /* JADX INFO: renamed from: a */
        @yfb
        public static final C14043e f91017a = new C14043e();

        private C14043e() {
        }

        @do8
        @yfb
        @p7e({p7e.EnumC10826a.f69935b})
        public static final List<Uri> getNotificationUris(@yfb Cursor cursor) {
            md8.checkNotNullParameter(cursor, "cursor");
            List<Uri> notificationUris = cursor.getNotificationUris();
            md8.checkNotNull(notificationUris);
            return notificationUris;
        }

        @do8
        @p7e({p7e.EnumC10826a.f69935b})
        public static final void setNotificationUris(@yfb Cursor cursor, @yfb ContentResolver contentResolver, @yfb List<? extends Uri> list) {
            md8.checkNotNullParameter(cursor, "cursor");
            md8.checkNotNullParameter(contentResolver, "cr");
            md8.checkNotNullParameter(list, "uris");
            cursor.setNotificationUris(contentResolver, list);
        }
    }

    private vfg() {
    }
}
