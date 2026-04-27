package p000;

import android.content.ContentResolver;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.load.C2491a;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class pzg {

    /* JADX INFO: renamed from: f */
    public static final String f72601f = "ThumbStreamOpener";

    /* JADX INFO: renamed from: g */
    public static final gt5 f72602g = new gt5();

    /* JADX INFO: renamed from: a */
    public final gt5 f72603a;

    /* JADX INFO: renamed from: b */
    public final nzg f72604b;

    /* JADX INFO: renamed from: c */
    public final z60 f72605c;

    /* JADX INFO: renamed from: d */
    public final ContentResolver f72606d;

    /* JADX INFO: renamed from: e */
    public final List<ImageHeaderParser> f72607e;

    public pzg(List<ImageHeaderParser> list, nzg nzgVar, z60 z60Var, ContentResolver contentResolver) {
        this(list, f72602g, nzgVar, z60Var, contentResolver);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0042  */
    @p000.hib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String getPath(@p000.efb android.net.Uri r5) throws java.lang.Throwable {
        /*
            r4 = this;
            r0 = 0
            nzg r1 = r4.f72604b     // Catch: java.lang.Throwable -> L21 java.lang.SecurityException -> L23
            android.database.Cursor r1 = r1.query(r5)     // Catch: java.lang.Throwable -> L21 java.lang.SecurityException -> L23
            if (r1 == 0) goto L1b
            boolean r2 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L18 java.lang.SecurityException -> L24
            if (r2 == 0) goto L1b
            r2 = 0
            java.lang.String r5 = r1.getString(r2)     // Catch: java.lang.Throwable -> L18 java.lang.SecurityException -> L24
            r1.close()
            return r5
        L18:
            r5 = move-exception
            r0 = r1
            goto L40
        L1b:
            if (r1 == 0) goto L20
            r1.close()
        L20:
            return r0
        L21:
            r5 = move-exception
            goto L40
        L23:
            r1 = r0
        L24:
            java.lang.String r2 = "ThumbStreamOpener"
            r3 = 3
            boolean r2 = android.util.Log.isLoggable(r2, r3)     // Catch: java.lang.Throwable -> L18
            if (r2 == 0) goto L3a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L18
            r2.<init>()     // Catch: java.lang.Throwable -> L18
            java.lang.String r3 = "Failed to query for thumbnail for Uri: "
            r2.append(r3)     // Catch: java.lang.Throwable -> L18
            r2.append(r5)     // Catch: java.lang.Throwable -> L18
        L3a:
            if (r1 == 0) goto L3f
            r1.close()
        L3f:
            return r0
        L40:
            if (r0 == 0) goto L45
            r0.close()
        L45:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.pzg.getPath(android.net.Uri):java.lang.String");
    }

    private boolean isValid(File file) {
        return this.f72603a.exists(file) && 0 < this.f72603a.length(file);
    }

    /* JADX INFO: renamed from: a */
    public int m19860a(Uri uri) {
        InputStream inputStreamOpenInputStream = null;
        try {
            try {
                inputStreamOpenInputStream = this.f72606d.openInputStream(uri);
                int orientation = C2491a.getOrientation(this.f72607e, inputStreamOpenInputStream, this.f72605c);
                if (inputStreamOpenInputStream != null) {
                    try {
                        inputStreamOpenInputStream.close();
                    } catch (IOException unused) {
                    }
                }
                return orientation;
            } catch (IOException | NullPointerException unused2) {
                if (Log.isLoggable(f72601f, 3)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Failed to open uri: ");
                    sb.append(uri);
                }
                if (inputStreamOpenInputStream == null) {
                    return -1;
                }
                try {
                    inputStreamOpenInputStream.close();
                    return -1;
                } catch (IOException unused3) {
                    return -1;
                }
            }
        } catch (Throwable th) {
            if (inputStreamOpenInputStream != null) {
                try {
                    inputStreamOpenInputStream.close();
                } catch (IOException unused4) {
                }
            }
            throw th;
        }
    }

    public InputStream open(Uri uri) throws Throwable {
        String path = getPath(uri);
        if (TextUtils.isEmpty(path)) {
            return null;
        }
        File file = this.f72603a.get(path);
        if (!isValid(file)) {
            return null;
        }
        Uri uriFromFile = Uri.fromFile(file);
        try {
            return this.f72606d.openInputStream(uriFromFile);
        } catch (NullPointerException e) {
            throw ((FileNotFoundException) new FileNotFoundException("NPE opening uri: " + uri + " -> " + uriFromFile).initCause(e));
        }
    }

    public pzg(List<ImageHeaderParser> list, gt5 gt5Var, nzg nzgVar, z60 z60Var, ContentResolver contentResolver) {
        this.f72603a = gt5Var;
        this.f72604b = nzgVar;
        this.f72605c = z60Var;
        this.f72606d = contentResolver;
        this.f72607e = list;
    }
}
