package p000;

import android.content.Context;
import android.net.Uri;
import android.provider.DocumentsContract;
import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zh4 {

    /* JADX INFO: renamed from: b */
    public static final String f105083b = "DocumentFile";

    /* JADX INFO: renamed from: a */
    @hib
    public final zh4 f105084a;

    public zh4(@hib zh4 zh4Var) {
        this.f105084a = zh4Var;
    }

    @efb
    public static zh4 fromFile(@efb File file) {
        return new rpd(null, file);
    }

    @hib
    public static zh4 fromSingleUri(@efb Context context, @efb Uri uri) {
        return new glf(null, context, uri);
    }

    @hib
    public static zh4 fromTreeUri(@efb Context context, @efb Uri uri) {
        return new yhh(null, context, DocumentsContract.buildDocumentUriUsingTree(uri, DocumentsContract.getTreeDocumentId(uri)));
    }

    public static boolean isDocumentUri(@efb Context context, @hib Uri uri) {
        return DocumentsContract.isDocumentUri(context, uri);
    }

    public abstract boolean canRead();

    public abstract boolean canWrite();

    @hib
    public abstract zh4 createDirectory(@efb String str);

    @hib
    public abstract zh4 createFile(@efb String str, @efb String str2);

    public abstract boolean delete();

    public abstract boolean exists();

    @hib
    public zh4 findFile(@efb String str) {
        for (zh4 zh4Var : listFiles()) {
            if (str.equals(zh4Var.getName())) {
                return zh4Var;
            }
        }
        return null;
    }

    @hib
    public abstract String getName();

    @hib
    public zh4 getParentFile() {
        return this.f105084a;
    }

    @hib
    public abstract String getType();

    @efb
    public abstract Uri getUri();

    public abstract boolean isDirectory();

    public abstract boolean isFile();

    public abstract boolean isVirtual();

    public abstract long lastModified();

    public abstract long length();

    @efb
    public abstract zh4[] listFiles();

    public abstract boolean renameTo(@efb String str);
}
