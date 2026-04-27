package p000;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import java.io.File;
import java.io.InputStream;
import p000.vwa;

/* JADX INFO: loaded from: classes3.dex */
public class c8g<Data> implements vwa<String, Data> {

    /* JADX INFO: renamed from: a */
    public final vwa<Uri, Data> f15980a;

    /* JADX INFO: renamed from: c8g$a */
    public static final class C2237a implements wwa<String, AssetFileDescriptor> {
        @Override // p000.wwa
        public vwa<String, AssetFileDescriptor> build(@efb t2b t2bVar) {
            return new c8g(t2bVar.build(Uri.class, AssetFileDescriptor.class));
        }

        @Override // p000.wwa
        public void teardown() {
        }
    }

    /* JADX INFO: renamed from: c8g$b */
    public static class C2238b implements wwa<String, ParcelFileDescriptor> {
        @Override // p000.wwa
        @efb
        public vwa<String, ParcelFileDescriptor> build(@efb t2b t2bVar) {
            return new c8g(t2bVar.build(Uri.class, ParcelFileDescriptor.class));
        }

        @Override // p000.wwa
        public void teardown() {
        }
    }

    /* JADX INFO: renamed from: c8g$c */
    public static class C2239c implements wwa<String, InputStream> {
        @Override // p000.wwa
        @efb
        public vwa<String, InputStream> build(@efb t2b t2bVar) {
            return new c8g(t2bVar.build(Uri.class, InputStream.class));
        }

        @Override // p000.wwa
        public void teardown() {
        }
    }

    public c8g(vwa<Uri, Data> vwaVar) {
        this.f15980a = vwaVar;
    }

    @hib
    private static Uri parseUri(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.charAt(0) == '/') {
            return toFileUri(str);
        }
        Uri uri = Uri.parse(str);
        return uri.getScheme() == null ? toFileUri(str) : uri;
    }

    private static Uri toFileUri(String str) {
        return Uri.fromFile(new File(str));
    }

    @Override // p000.vwa
    public vwa.C14279a<Data> buildLoadData(@efb String str, int i, int i2, @efb i7c i7cVar) {
        Uri uri = parseUri(str);
        if (uri == null || !this.f15980a.handles(uri)) {
            return null;
        }
        return this.f15980a.buildLoadData(uri, i, i2, i7cVar);
    }

    @Override // p000.vwa
    public boolean handles(@efb String str) {
        return true;
    }
}
