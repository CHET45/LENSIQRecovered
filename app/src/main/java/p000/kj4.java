package p000;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.provider.DocumentsContract;
import java.io.FileNotFoundException;

/* JADX INFO: loaded from: classes.dex */
public final class kj4 {

    /* JADX INFO: renamed from: a */
    public static final String f54256a = "tree";

    /* JADX INFO: renamed from: kj4$a */
    public static final class C8390a {

        /* JADX INFO: renamed from: a */
        public static final int f54257a = 512;

        private C8390a() {
        }
    }

    /* JADX INFO: renamed from: kj4$b */
    @c5e(21)
    public static class C8391b {
        private C8391b() {
        }

        @ih4
        /* JADX INFO: renamed from: a */
        public static Uri m14785a(String str, String str2) {
            return DocumentsContract.buildChildDocumentsUri(str, str2);
        }

        @ih4
        /* JADX INFO: renamed from: b */
        public static Uri m14786b(Uri uri, String str) {
            return DocumentsContract.buildChildDocumentsUriUsingTree(uri, str);
        }

        @ih4
        public static Uri buildTreeDocumentUri(String str, String str2) {
            return DocumentsContract.buildTreeDocumentUri(str, str2);
        }

        @ih4
        /* JADX INFO: renamed from: c */
        public static Uri m14787c(Uri uri, String str) {
            return DocumentsContract.buildDocumentUriUsingTree(uri, str);
        }

        @ih4
        /* JADX INFO: renamed from: d */
        public static Uri m14788d(ContentResolver contentResolver, Uri uri, String str, String str2) throws FileNotFoundException {
            return DocumentsContract.createDocument(contentResolver, uri, str, str2);
        }

        @ih4
        /* JADX INFO: renamed from: e */
        public static String m14789e(Uri uri) {
            return DocumentsContract.getTreeDocumentId(uri);
        }

        @ih4
        /* JADX INFO: renamed from: f */
        public static Uri m14790f(@efb ContentResolver contentResolver, @efb Uri uri, @efb String str) throws FileNotFoundException {
            return DocumentsContract.renameDocument(contentResolver, uri, str);
        }
    }

    /* JADX INFO: renamed from: kj4$c */
    @c5e(24)
    public static class C8392c {
        private C8392c() {
        }

        @ih4
        /* JADX INFO: renamed from: a */
        public static boolean m14791a(@efb Uri uri) {
            return DocumentsContract.isTreeUri(uri);
        }

        @ih4
        /* JADX INFO: renamed from: b */
        public static boolean m14792b(ContentResolver contentResolver, Uri uri, Uri uri2) throws FileNotFoundException {
            return DocumentsContract.removeDocument(contentResolver, uri, uri2);
        }
    }

    private kj4() {
    }

    @hib
    public static Uri buildChildDocumentsUri(@efb String str, @hib String str2) {
        return C8391b.m14785a(str, str2);
    }

    @hib
    public static Uri buildChildDocumentsUriUsingTree(@efb Uri uri, @efb String str) {
        return C8391b.m14786b(uri, str);
    }

    @hib
    public static Uri buildDocumentUri(@efb String str, @efb String str2) {
        return DocumentsContract.buildDocumentUri(str, str2);
    }

    @hib
    public static Uri buildDocumentUriUsingTree(@efb Uri uri, @efb String str) {
        return C8391b.m14787c(uri, str);
    }

    @hib
    public static Uri buildTreeDocumentUri(@efb String str, @efb String str2) {
        return C8391b.buildTreeDocumentUri(str, str2);
    }

    @hib
    public static Uri createDocument(@efb ContentResolver contentResolver, @efb Uri uri, @efb String str, @efb String str2) throws FileNotFoundException {
        return C8391b.m14788d(contentResolver, uri, str, str2);
    }

    @hib
    public static String getDocumentId(@efb Uri uri) {
        return DocumentsContract.getDocumentId(uri);
    }

    @hib
    public static String getTreeDocumentId(@efb Uri uri) {
        return C8391b.m14789e(uri);
    }

    public static boolean isDocumentUri(@efb Context context, @hib Uri uri) {
        return DocumentsContract.isDocumentUri(context, uri);
    }

    public static boolean isTreeUri(@efb Uri uri) {
        return C8392c.m14791a(uri);
    }

    public static boolean removeDocument(@efb ContentResolver contentResolver, @efb Uri uri, @efb Uri uri2) throws FileNotFoundException {
        return C8392c.m14792b(contentResolver, uri, uri2);
    }

    @hib
    public static Uri renameDocument(@efb ContentResolver contentResolver, @efb Uri uri, @efb String str) throws FileNotFoundException {
        return C8391b.m14790f(contentResolver, uri, str);
    }
}
