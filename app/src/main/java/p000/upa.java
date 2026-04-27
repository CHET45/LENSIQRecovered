package p000;

import android.content.Context;
import android.net.Uri;
import java.io.InputStream;
import p000.vwa;

/* JADX INFO: loaded from: classes3.dex */
public class upa implements vwa<Uri, InputStream> {

    /* JADX INFO: renamed from: a */
    public final Context f88724a;

    /* JADX INFO: renamed from: upa$a */
    public static class C13642a implements wwa<Uri, InputStream> {

        /* JADX INFO: renamed from: a */
        public final Context f88725a;

        public C13642a(Context context) {
            this.f88725a = context;
        }

        @Override // p000.wwa
        @efb
        public vwa<Uri, InputStream> build(t2b t2bVar) {
            return new upa(this.f88725a);
        }

        @Override // p000.wwa
        public void teardown() {
        }
    }

    public upa(Context context) {
        this.f88724a = context.getApplicationContext();
    }

    private boolean isRequestingDefaultFrame(i7c i7cVar) {
        Long l = (Long) i7cVar.get(f6i.f35537g);
        return l != null && l.longValue() == -1;
    }

    @Override // p000.vwa
    @hib
    public vwa.C14279a<InputStream> buildLoadData(@efb Uri uri, int i, int i2, @efb i7c i7cVar) {
        if (tpa.isThumbnailSize(i, i2) && isRequestingDefaultFrame(i7cVar)) {
            return new vwa.C14279a<>(new bkb(uri), izg.buildVideoFetcher(this.f88724a, uri));
        }
        return null;
    }

    @Override // p000.vwa
    public boolean handles(@efb Uri uri) {
        return tpa.isMediaStoreVideoUri(uri);
    }
}
