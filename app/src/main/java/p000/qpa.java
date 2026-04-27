package p000;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.Priority;
import java.io.File;
import java.io.FileNotFoundException;
import p000.bg3;
import p000.vwa;

/* JADX INFO: loaded from: classes3.dex */
public final class qpa implements vwa<Uri, File> {

    /* JADX INFO: renamed from: a */
    public final Context f75076a;

    /* JADX INFO: renamed from: qpa$a */
    public static final class C11579a implements wwa<Uri, File> {

        /* JADX INFO: renamed from: a */
        public final Context f75077a;

        public C11579a(Context context) {
            this.f75077a = context;
        }

        @Override // p000.wwa
        @efb
        public vwa<Uri, File> build(t2b t2bVar) {
            return new qpa(this.f75077a);
        }

        @Override // p000.wwa
        public void teardown() {
        }
    }

    /* JADX INFO: renamed from: qpa$b */
    public static class C11580b implements bg3<File> {

        /* JADX INFO: renamed from: c */
        public static final String[] f75078c = {"_data"};

        /* JADX INFO: renamed from: a */
        public final Context f75079a;

        /* JADX INFO: renamed from: b */
        public final Uri f75080b;

        public C11580b(Context context, Uri uri) {
            this.f75079a = context;
            this.f75080b = uri;
        }

        @Override // p000.bg3
        public void cancel() {
        }

        @Override // p000.bg3
        public void cleanup() {
        }

        @Override // p000.bg3
        @efb
        public Class<File> getDataClass() {
            return File.class;
        }

        @Override // p000.bg3
        @efb
        public hh3 getDataSource() {
            return hh3.LOCAL;
        }

        @Override // p000.bg3
        public void loadData(@efb Priority priority, @efb bg3.InterfaceC1883a<? super File> interfaceC1883a) {
            Cursor cursorQuery = this.f75079a.getContentResolver().query(this.f75080b, f75078c, null, null, null);
            if (cursorQuery != null) {
                try {
                    string = cursorQuery.moveToFirst() ? cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data")) : null;
                } finally {
                    cursorQuery.close();
                }
            }
            if (!TextUtils.isEmpty(string)) {
                interfaceC1883a.onDataReady(new File(string));
                return;
            }
            interfaceC1883a.onLoadFailed(new FileNotFoundException("Failed to find file path for: " + this.f75080b));
        }
    }

    public qpa(Context context) {
        this.f75076a = context;
    }

    @Override // p000.vwa
    public vwa.C14279a<File> buildLoadData(@efb Uri uri, int i, int i2, @efb i7c i7cVar) {
        return new vwa.C14279a<>(new bkb(uri), new C11580b(this.f75076a, uri));
    }

    @Override // p000.vwa
    public boolean handles(@efb Uri uri) {
        return tpa.isMediaStoreUri(uri);
    }
}
