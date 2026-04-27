package p000;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.DocumentsContract;
import android.util.Log;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
@c5e(21)
public class yhh extends zh4 {

    /* JADX INFO: renamed from: c */
    public Context f101656c;

    /* JADX INFO: renamed from: d */
    public Uri f101657d;

    public yhh(@hib zh4 zh4Var, Context context, Uri uri) {
        super(zh4Var);
        this.f101656c = context;
        this.f101657d = uri;
    }

    private static void closeQuietly(@hib AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                autoCloseable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    @Override // p000.zh4
    public boolean canRead() {
        return jj4.canRead(this.f101656c, this.f101657d);
    }

    @Override // p000.zh4
    public boolean canWrite() {
        return jj4.canWrite(this.f101656c, this.f101657d);
    }

    @Override // p000.zh4
    @hib
    public zh4 createDirectory(String str) {
        Uri uriCreateFile = createFile(this.f101656c, this.f101657d, "vnd.android.document/directory", str);
        if (uriCreateFile != null) {
            return new yhh(this, this.f101656c, uriCreateFile);
        }
        return null;
    }

    @Override // p000.zh4
    @hib
    public zh4 createFile(String str, String str2) {
        Uri uriCreateFile = createFile(this.f101656c, this.f101657d, str, str2);
        if (uriCreateFile != null) {
            return new yhh(this, this.f101656c, uriCreateFile);
        }
        return null;
    }

    @Override // p000.zh4
    public boolean delete() {
        try {
            return DocumentsContract.deleteDocument(this.f101656c.getContentResolver(), this.f101657d);
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // p000.zh4
    public boolean exists() {
        return jj4.exists(this.f101656c, this.f101657d);
    }

    @Override // p000.zh4
    @hib
    public String getName() {
        return jj4.getName(this.f101656c, this.f101657d);
    }

    @Override // p000.zh4
    @hib
    public String getType() {
        return jj4.getType(this.f101656c, this.f101657d);
    }

    @Override // p000.zh4
    public Uri getUri() {
        return this.f101657d;
    }

    @Override // p000.zh4
    public boolean isDirectory() {
        return jj4.isDirectory(this.f101656c, this.f101657d);
    }

    @Override // p000.zh4
    public boolean isFile() {
        return jj4.isFile(this.f101656c, this.f101657d);
    }

    @Override // p000.zh4
    public boolean isVirtual() {
        return jj4.isVirtual(this.f101656c, this.f101657d);
    }

    @Override // p000.zh4
    public long lastModified() {
        return jj4.lastModified(this.f101656c, this.f101657d);
    }

    @Override // p000.zh4
    public long length() {
        return jj4.length(this.f101656c, this.f101657d);
    }

    @Override // p000.zh4
    public zh4[] listFiles() {
        ContentResolver contentResolver = this.f101656c.getContentResolver();
        Uri uri = this.f101657d;
        Uri uriBuildChildDocumentsUriUsingTree = DocumentsContract.buildChildDocumentsUriUsingTree(uri, DocumentsContract.getDocumentId(uri));
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = contentResolver.query(uriBuildChildDocumentsUriUsingTree, new String[]{"document_id"}, null, null, null);
                while (cursorQuery.moveToNext()) {
                    arrayList.add(DocumentsContract.buildDocumentUriUsingTree(this.f101657d, cursorQuery.getString(0)));
                }
            } catch (Exception e) {
                Log.w("DocumentFile", "Failed query: " + e);
            }
            Uri[] uriArr = (Uri[]) arrayList.toArray(new Uri[arrayList.size()]);
            zh4[] zh4VarArr = new zh4[uriArr.length];
            for (int i = 0; i < uriArr.length; i++) {
                zh4VarArr[i] = new yhh(this, this.f101656c, uriArr[i]);
            }
            return zh4VarArr;
        } finally {
            closeQuietly(cursorQuery);
        }
    }

    @Override // p000.zh4
    public boolean renameTo(String str) {
        try {
            Uri uriRenameDocument = DocumentsContract.renameDocument(this.f101656c.getContentResolver(), this.f101657d, str);
            if (uriRenameDocument != null) {
                this.f101657d = uriRenameDocument;
                return true;
            }
        } catch (Exception unused) {
        }
        return false;
    }

    @hib
    private static Uri createFile(Context context, Uri uri, String str, String str2) {
        try {
            return DocumentsContract.createDocument(context.getContentResolver(), uri, str, str2);
        } catch (Exception unused) {
            return null;
        }
    }
}
