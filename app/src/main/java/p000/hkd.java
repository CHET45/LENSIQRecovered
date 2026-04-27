package p000;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.bumptech.glide.Priority;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import p000.bg3;
import p000.vwa;

/* JADX INFO: loaded from: classes3.dex */
@c5e(29)
public final class hkd<DataT> implements vwa<Uri, DataT> {

    /* JADX INFO: renamed from: a */
    public final Context f43911a;

    /* JADX INFO: renamed from: b */
    public final vwa<File, DataT> f43912b;

    /* JADX INFO: renamed from: c */
    public final vwa<Uri, DataT> f43913c;

    /* JADX INFO: renamed from: d */
    public final Class<DataT> f43914d;

    /* JADX INFO: renamed from: hkd$a */
    public static abstract class AbstractC6881a<DataT> implements wwa<Uri, DataT> {

        /* JADX INFO: renamed from: a */
        public final Context f43915a;

        /* JADX INFO: renamed from: b */
        public final Class<DataT> f43916b;

        public AbstractC6881a(Context context, Class<DataT> cls) {
            this.f43915a = context;
            this.f43916b = cls;
        }

        @Override // p000.wwa
        @efb
        public final vwa<Uri, DataT> build(@efb t2b t2bVar) {
            return new hkd(this.f43915a, t2bVar.build(File.class, this.f43916b), t2bVar.build(Uri.class, this.f43916b), this.f43916b);
        }

        @Override // p000.wwa
        public final void teardown() {
        }
    }

    /* JADX INFO: renamed from: hkd$b */
    @c5e(29)
    public static final class C6882b extends AbstractC6881a<ParcelFileDescriptor> {
        public C6882b(Context context) {
            super(context, ParcelFileDescriptor.class);
        }
    }

    /* JADX INFO: renamed from: hkd$c */
    @c5e(29)
    public static final class C6883c extends AbstractC6881a<InputStream> {
        public C6883c(Context context) {
            super(context, InputStream.class);
        }
    }

    /* JADX INFO: renamed from: hkd$d */
    public static final class C6884d<DataT> implements bg3<DataT> {

        /* JADX INFO: renamed from: L */
        public static final String[] f43917L = {"_data"};

        /* JADX INFO: renamed from: C */
        public final Class<DataT> f43918C;

        /* JADX INFO: renamed from: F */
        public volatile boolean f43919F;

        /* JADX INFO: renamed from: H */
        @hib
        public volatile bg3<DataT> f43920H;

        /* JADX INFO: renamed from: a */
        public final Context f43921a;

        /* JADX INFO: renamed from: b */
        public final vwa<File, DataT> f43922b;

        /* JADX INFO: renamed from: c */
        public final vwa<Uri, DataT> f43923c;

        /* JADX INFO: renamed from: d */
        public final Uri f43924d;

        /* JADX INFO: renamed from: e */
        public final int f43925e;

        /* JADX INFO: renamed from: f */
        public final int f43926f;

        /* JADX INFO: renamed from: m */
        public final i7c f43927m;

        public C6884d(Context context, vwa<File, DataT> vwaVar, vwa<Uri, DataT> vwaVar2, Uri uri, int i, int i2, i7c i7cVar, Class<DataT> cls) {
            this.f43921a = context.getApplicationContext();
            this.f43922b = vwaVar;
            this.f43923c = vwaVar2;
            this.f43924d = uri;
            this.f43925e = i;
            this.f43926f = i2;
            this.f43927m = i7cVar;
            this.f43918C = cls;
        }

        @hib
        private vwa.C14279a<DataT> buildDelegateData() throws FileNotFoundException {
            if (Environment.isExternalStorageLegacy()) {
                return this.f43922b.buildLoadData(queryForFilePath(this.f43924d), this.f43925e, this.f43926f, this.f43927m);
            }
            return this.f43923c.buildLoadData(isAccessMediaLocationGranted() ? MediaStore.setRequireOriginal(this.f43924d) : this.f43924d, this.f43925e, this.f43926f, this.f43927m);
        }

        @hib
        private bg3<DataT> buildDelegateFetcher() throws FileNotFoundException {
            vwa.C14279a<DataT> c14279aBuildDelegateData = buildDelegateData();
            if (c14279aBuildDelegateData != null) {
                return c14279aBuildDelegateData.f92422c;
            }
            return null;
        }

        private boolean isAccessMediaLocationGranted() {
            return this.f43921a.checkSelfPermission(xnc.f98629z) == 0;
        }

        @efb
        private File queryForFilePath(Uri uri) throws FileNotFoundException {
            Cursor cursor = null;
            try {
                Cursor cursorQuery = this.f43921a.getContentResolver().query(uri, f43917L, null, null, null);
                if (cursorQuery == null || !cursorQuery.moveToFirst()) {
                    throw new FileNotFoundException("Failed to media store entry for: " + uri);
                }
                String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                if (!TextUtils.isEmpty(string)) {
                    File file = new File(string);
                    cursorQuery.close();
                    return file;
                }
                throw new FileNotFoundException("File path was empty in media store for: " + uri);
            } catch (Throwable th) {
                if (0 != 0) {
                    cursor.close();
                }
                throw th;
            }
        }

        @Override // p000.bg3
        public void cancel() {
            this.f43919F = true;
            bg3<DataT> bg3Var = this.f43920H;
            if (bg3Var != null) {
                bg3Var.cancel();
            }
        }

        @Override // p000.bg3
        public void cleanup() {
            bg3<DataT> bg3Var = this.f43920H;
            if (bg3Var != null) {
                bg3Var.cleanup();
            }
        }

        @Override // p000.bg3
        @efb
        public Class<DataT> getDataClass() {
            return this.f43918C;
        }

        @Override // p000.bg3
        @efb
        public hh3 getDataSource() {
            return hh3.LOCAL;
        }

        @Override // p000.bg3
        public void loadData(@efb Priority priority, @efb bg3.InterfaceC1883a<? super DataT> interfaceC1883a) {
            try {
                bg3<DataT> bg3VarBuildDelegateFetcher = buildDelegateFetcher();
                if (bg3VarBuildDelegateFetcher == null) {
                    interfaceC1883a.onLoadFailed(new IllegalArgumentException("Failed to build fetcher for: " + this.f43924d));
                    return;
                }
                this.f43920H = bg3VarBuildDelegateFetcher;
                if (this.f43919F) {
                    cancel();
                } else {
                    bg3VarBuildDelegateFetcher.loadData(priority, interfaceC1883a);
                }
            } catch (FileNotFoundException e) {
                interfaceC1883a.onLoadFailed(e);
            }
        }
    }

    public hkd(Context context, vwa<File, DataT> vwaVar, vwa<Uri, DataT> vwaVar2, Class<DataT> cls) {
        this.f43911a = context.getApplicationContext();
        this.f43912b = vwaVar;
        this.f43913c = vwaVar2;
        this.f43914d = cls;
    }

    @Override // p000.vwa
    public vwa.C14279a<DataT> buildLoadData(@efb Uri uri, int i, int i2, @efb i7c i7cVar) {
        return new vwa.C14279a<>(new bkb(uri), new C6884d(this.f43911a, this.f43912b, this.f43913c, uri, i, i2, i7cVar, this.f43914d));
    }

    @Override // p000.vwa
    public boolean handles(@efb Uri uri) {
        return Build.VERSION.SDK_INT >= 29 && tpa.isMediaStoreUri(uri);
    }
}
