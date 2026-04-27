package p000;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.InputStream;
import p000.vwa;

/* JADX INFO: loaded from: classes3.dex */
public class a90<Data> implements vwa<Uri, Data> {

    /* JADX INFO: renamed from: c */
    public static final String f665c = "android_asset";

    /* JADX INFO: renamed from: d */
    public static final String f666d = "file:///android_asset/";

    /* JADX INFO: renamed from: e */
    public static final int f667e = 22;

    /* JADX INFO: renamed from: a */
    public final AssetManager f668a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC0094a<Data> f669b;

    /* JADX INFO: renamed from: a90$a */
    public interface InterfaceC0094a<Data> {
        bg3<Data> buildFetcher(AssetManager assetManager, String str);
    }

    /* JADX INFO: renamed from: a90$b */
    public static class C0095b implements wwa<Uri, AssetFileDescriptor>, InterfaceC0094a<AssetFileDescriptor> {

        /* JADX INFO: renamed from: a */
        public final AssetManager f670a;

        public C0095b(AssetManager assetManager) {
            this.f670a = assetManager;
        }

        @Override // p000.wwa
        @efb
        public vwa<Uri, AssetFileDescriptor> build(t2b t2bVar) {
            return new a90(this.f670a, this);
        }

        @Override // p000.a90.InterfaceC0094a
        public bg3<AssetFileDescriptor> buildFetcher(AssetManager assetManager, String str) {
            return new qs5(assetManager, str);
        }

        @Override // p000.wwa
        public void teardown() {
        }
    }

    /* JADX INFO: renamed from: a90$c */
    public static class C0096c implements wwa<Uri, InputStream>, InterfaceC0094a<InputStream> {

        /* JADX INFO: renamed from: a */
        public final AssetManager f671a;

        public C0096c(AssetManager assetManager) {
            this.f671a = assetManager;
        }

        @Override // p000.wwa
        @efb
        public vwa<Uri, InputStream> build(t2b t2bVar) {
            return new a90(this.f671a, this);
        }

        @Override // p000.a90.InterfaceC0094a
        public bg3<InputStream> buildFetcher(AssetManager assetManager, String str) {
            return new o5g(assetManager, str);
        }

        @Override // p000.wwa
        public void teardown() {
        }
    }

    public a90(AssetManager assetManager, InterfaceC0094a<Data> interfaceC0094a) {
        this.f668a = assetManager;
        this.f669b = interfaceC0094a;
    }

    @Override // p000.vwa
    public vwa.C14279a<Data> buildLoadData(@efb Uri uri, int i, int i2, @efb i7c i7cVar) {
        return new vwa.C14279a<>(new bkb(uri), this.f669b.buildFetcher(this.f668a, uri.toString().substring(f667e)));
    }

    @Override // p000.vwa
    public boolean handles(@efb Uri uri) {
        return "file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && f665c.equals(uri.getPathSegments().get(0));
    }
}
