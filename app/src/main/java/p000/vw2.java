package p000;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.OperationCanceledException;

/* JADX INFO: loaded from: classes.dex */
public final class vw2 {
    private vw2() {
    }

    @hib
    @Deprecated
    public static Cursor query(@efb ContentResolver contentResolver, @efb Uri uri, @hib String[] strArr, @hib String str, @hib String[] strArr2, @hib String str2, @hib pq1 pq1Var) {
        return query(contentResolver, uri, strArr, str, strArr2, str2, pq1Var != null ? (CancellationSignal) pq1Var.getCancellationSignalObject() : null);
    }

    @hib
    public static Cursor query(@efb ContentResolver contentResolver, @efb Uri uri, @hib String[] strArr, @hib String str, @hib String[] strArr2, @hib String str2, @hib CancellationSignal cancellationSignal) throws Exception {
        try {
            return contentResolver.query(uri, strArr, str, strArr2, str2, cancellationSignal);
        } catch (Exception e) {
            if (e instanceof OperationCanceledException) {
                throw new b6c();
            }
            throw e;
        }
    }
}
