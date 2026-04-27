package p000;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.Log;
import com.bumptech.glide.ComponentCallbacks2C2485a;
import com.bumptech.glide.Priority;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import p000.bg3;

/* JADX INFO: loaded from: classes3.dex */
public class izg implements bg3<InputStream> {

    /* JADX INFO: renamed from: d */
    public static final String f49160d = "MediaStoreThumbFetcher";

    /* JADX INFO: renamed from: a */
    public final Uri f49161a;

    /* JADX INFO: renamed from: b */
    public final pzg f49162b;

    /* JADX INFO: renamed from: c */
    public InputStream f49163c;

    /* JADX INFO: renamed from: izg$a */
    public static class C7694a implements nzg {

        /* JADX INFO: renamed from: b */
        public static final String[] f49164b = {"_data"};

        /* JADX INFO: renamed from: c */
        public static final String f49165c = "kind = 1 AND image_id = ?";

        /* JADX INFO: renamed from: a */
        public final ContentResolver f49166a;

        public C7694a(ContentResolver contentResolver) {
            this.f49166a = contentResolver;
        }

        @Override // p000.nzg
        public Cursor query(Uri uri) {
            return this.f49166a.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, f49164b, f49165c, new String[]{uri.getLastPathSegment()}, null);
        }
    }

    /* JADX INFO: renamed from: izg$b */
    public static class C7695b implements nzg {

        /* JADX INFO: renamed from: b */
        public static final String[] f49167b = {"_data"};

        /* JADX INFO: renamed from: c */
        public static final String f49168c = "kind = 1 AND video_id = ?";

        /* JADX INFO: renamed from: a */
        public final ContentResolver f49169a;

        public C7695b(ContentResolver contentResolver) {
            this.f49169a = contentResolver;
        }

        @Override // p000.nzg
        public Cursor query(Uri uri) {
            return this.f49169a.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, f49167b, f49168c, new String[]{uri.getLastPathSegment()}, null);
        }
    }

    @fdi
    public izg(Uri uri, pzg pzgVar) {
        this.f49161a = uri;
        this.f49162b = pzgVar;
    }

    private static izg build(Context context, Uri uri, nzg nzgVar) {
        return new izg(uri, new pzg(ComponentCallbacks2C2485a.get(context).getRegistry().getImageHeaderParsers(), nzgVar, ComponentCallbacks2C2485a.get(context).getArrayPool(), context.getContentResolver()));
    }

    public static izg buildImageFetcher(Context context, Uri uri) {
        return build(context, uri, new C7694a(context.getContentResolver()));
    }

    public static izg buildVideoFetcher(Context context, Uri uri) {
        return build(context, uri, new C7695b(context.getContentResolver()));
    }

    private InputStream openThumbInputStream() throws Throwable {
        InputStream inputStreamOpen = this.f49162b.open(this.f49161a);
        int iM19860a = inputStreamOpen != null ? this.f49162b.m19860a(this.f49161a) : -1;
        return iM19860a != -1 ? new n95(inputStreamOpen, iM19860a) : inputStreamOpen;
    }

    @Override // p000.bg3
    public void cancel() {
    }

    @Override // p000.bg3
    public void cleanup() {
        InputStream inputStream = this.f49163c;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    @Override // p000.bg3
    @efb
    public Class<InputStream> getDataClass() {
        return InputStream.class;
    }

    @Override // p000.bg3
    @efb
    public hh3 getDataSource() {
        return hh3.LOCAL;
    }

    @Override // p000.bg3
    public void loadData(@efb Priority priority, @efb bg3.InterfaceC1883a<? super InputStream> interfaceC1883a) throws Throwable {
        try {
            InputStream inputStreamOpenThumbInputStream = openThumbInputStream();
            this.f49163c = inputStreamOpenThumbInputStream;
            interfaceC1883a.onDataReady(inputStreamOpenThumbInputStream);
        } catch (FileNotFoundException e) {
            Log.isLoggable(f49160d, 3);
            interfaceC1883a.onLoadFailed(e);
        }
    }
}
