package p000;

import android.net.Uri;
import android.util.Log;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class rpd extends zh4 {

    /* JADX INFO: renamed from: c */
    public File f78998c;

    public rpd(@hib zh4 zh4Var, File file) {
        super(zh4Var);
        this.f78998c = file;
    }

    private static boolean deleteContents(File file) {
        File[] fileArrListFiles = file.listFiles();
        boolean zDeleteContents = true;
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                if (file2.isDirectory()) {
                    zDeleteContents &= deleteContents(file2);
                }
                if (!file2.delete()) {
                    Log.w("DocumentFile", "Failed to delete " + file2);
                    zDeleteContents = false;
                }
            }
        }
        return zDeleteContents;
    }

    private static String getTypeForName(String str) {
        int iLastIndexOf = str.lastIndexOf(46);
        if (iLastIndexOf < 0) {
            return "application/octet-stream";
        }
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(str.substring(iLastIndexOf + 1).toLowerCase());
        return mimeTypeFromExtension != null ? mimeTypeFromExtension : "application/octet-stream";
    }

    @Override // p000.zh4
    public boolean canRead() {
        return this.f78998c.canRead();
    }

    @Override // p000.zh4
    public boolean canWrite() {
        return this.f78998c.canWrite();
    }

    @Override // p000.zh4
    @hib
    public zh4 createDirectory(String str) {
        File file = new File(this.f78998c, str);
        if (file.isDirectory() || file.mkdir()) {
            return new rpd(this, file);
        }
        return null;
    }

    @Override // p000.zh4
    @hib
    public zh4 createFile(String str, String str2) {
        String extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(str);
        if (extensionFromMimeType != null) {
            str2 = str2 + "." + extensionFromMimeType;
        }
        File file = new File(this.f78998c, str2);
        try {
            file.createNewFile();
            return new rpd(this, file);
        } catch (IOException e) {
            Log.w("DocumentFile", "Failed to createFile: " + e);
            return null;
        }
    }

    @Override // p000.zh4
    public boolean delete() {
        deleteContents(this.f78998c);
        return this.f78998c.delete();
    }

    @Override // p000.zh4
    public boolean exists() {
        return this.f78998c.exists();
    }

    @Override // p000.zh4
    public String getName() {
        return this.f78998c.getName();
    }

    @Override // p000.zh4
    @hib
    public String getType() {
        if (this.f78998c.isDirectory()) {
            return null;
        }
        return getTypeForName(this.f78998c.getName());
    }

    @Override // p000.zh4
    public Uri getUri() {
        return Uri.fromFile(this.f78998c);
    }

    @Override // p000.zh4
    public boolean isDirectory() {
        return this.f78998c.isDirectory();
    }

    @Override // p000.zh4
    public boolean isFile() {
        return this.f78998c.isFile();
    }

    @Override // p000.zh4
    public boolean isVirtual() {
        return false;
    }

    @Override // p000.zh4
    public long lastModified() {
        return this.f78998c.lastModified();
    }

    @Override // p000.zh4
    public long length() {
        return this.f78998c.length();
    }

    @Override // p000.zh4
    public zh4[] listFiles() {
        ArrayList arrayList = new ArrayList();
        File[] fileArrListFiles = this.f78998c.listFiles();
        if (fileArrListFiles != null) {
            for (File file : fileArrListFiles) {
                arrayList.add(new rpd(this, file));
            }
        }
        return (zh4[]) arrayList.toArray(new zh4[arrayList.size()]);
    }

    @Override // p000.zh4
    public boolean renameTo(String str) {
        File file = new File(this.f78998c.getParentFile(), str);
        if (!this.f78998c.renameTo(file)) {
            return false;
        }
        this.f78998c = file;
        return true;
    }
}
