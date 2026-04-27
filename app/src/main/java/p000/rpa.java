package p000;

import android.content.Context;
import android.net.Uri;
import java.io.InputStream;
import p000.vwa;

/* JADX INFO: loaded from: classes3.dex */
public class rpa implements vwa<Uri, InputStream> {

    /* JADX INFO: renamed from: a */
    public final Context f78989a;

    /* JADX INFO: renamed from: rpa$a */
    public static class C12196a implements wwa<Uri, InputStream> {

        /* JADX INFO: renamed from: a */
        public final Context f78990a;

        public C12196a(Context context) {
            this.f78990a = context;
        }

        @Override // p000.wwa
        @efb
        public vwa<Uri, InputStream> build(t2b t2bVar) {
            return new rpa(this.f78990a);
        }

        @Override // p000.wwa
        public void teardown() {
        }
    }

    public rpa(Context context) {
        this.f78989a = context.getApplicationContext();
    }

    @Override // p000.vwa
    public vwa.C14279a<InputStream> buildLoadData(@efb Uri uri, int i, int i2, @efb i7c i7cVar) {
        if (tpa.isThumbnailSize(i, i2)) {
            return new vwa.C14279a<>(new bkb(uri), izg.buildImageFetcher(this.f78989a, uri));
        }
        return null;
    }

    @Override // p000.vwa
    public boolean handles(@efb Uri uri) {
        return tpa.isMediaStoreImageUri(uri);
    }
}
