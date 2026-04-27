package p000;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.InputStream;
import p000.vwa;

/* JADX INFO: loaded from: classes3.dex */
public class m6e<Data> implements vwa<Integer, Data> {

    /* JADX INFO: renamed from: c */
    public static final String f60020c = "ResourceLoader";

    /* JADX INFO: renamed from: a */
    public final vwa<Uri, Data> f60021a;

    /* JADX INFO: renamed from: b */
    public final Resources f60022b;

    /* JADX INFO: renamed from: m6e$a */
    public static final class C9161a implements wwa<Integer, AssetFileDescriptor> {

        /* JADX INFO: renamed from: a */
        public final Resources f60023a;

        public C9161a(Resources resources) {
            this.f60023a = resources;
        }

        @Override // p000.wwa
        public vwa<Integer, AssetFileDescriptor> build(t2b t2bVar) {
            return new m6e(this.f60023a, t2bVar.build(Uri.class, AssetFileDescriptor.class));
        }

        @Override // p000.wwa
        public void teardown() {
        }
    }

    /* JADX INFO: renamed from: m6e$b */
    public static class C9162b implements wwa<Integer, ParcelFileDescriptor> {

        /* JADX INFO: renamed from: a */
        public final Resources f60024a;

        public C9162b(Resources resources) {
            this.f60024a = resources;
        }

        @Override // p000.wwa
        @efb
        public vwa<Integer, ParcelFileDescriptor> build(t2b t2bVar) {
            return new m6e(this.f60024a, t2bVar.build(Uri.class, ParcelFileDescriptor.class));
        }

        @Override // p000.wwa
        public void teardown() {
        }
    }

    /* JADX INFO: renamed from: m6e$c */
    public static class C9163c implements wwa<Integer, InputStream> {

        /* JADX INFO: renamed from: a */
        public final Resources f60025a;

        public C9163c(Resources resources) {
            this.f60025a = resources;
        }

        @Override // p000.wwa
        @efb
        public vwa<Integer, InputStream> build(t2b t2bVar) {
            return new m6e(this.f60025a, t2bVar.build(Uri.class, InputStream.class));
        }

        @Override // p000.wwa
        public void teardown() {
        }
    }

    /* JADX INFO: renamed from: m6e$d */
    public static class C9164d implements wwa<Integer, Uri> {

        /* JADX INFO: renamed from: a */
        public final Resources f60026a;

        public C9164d(Resources resources) {
            this.f60026a = resources;
        }

        @Override // p000.wwa
        @efb
        public vwa<Integer, Uri> build(t2b t2bVar) {
            return new m6e(this.f60026a, eth.getInstance());
        }

        @Override // p000.wwa
        public void teardown() {
        }
    }

    public m6e(Resources resources, vwa<Uri, Data> vwaVar) {
        this.f60022b = resources;
        this.f60021a = vwaVar;
    }

    @hib
    private Uri getResourceUri(Integer num) {
        try {
            return Uri.parse("android.resource://" + this.f60022b.getResourcePackageName(num.intValue()) + '/' + this.f60022b.getResourceTypeName(num.intValue()) + '/' + this.f60022b.getResourceEntryName(num.intValue()));
        } catch (Resources.NotFoundException e) {
            if (!Log.isLoggable(f60020c, 5)) {
                return null;
            }
            Log.w(f60020c, "Received invalid resource id: " + num, e);
            return null;
        }
    }

    @Override // p000.vwa
    public vwa.C14279a<Data> buildLoadData(@efb Integer num, int i, int i2, @efb i7c i7cVar) {
        Uri resourceUri = getResourceUri(num);
        if (resourceUri == null) {
            return null;
        }
        return this.f60021a.buildLoadData(resourceUri, i, i2, i7cVar);
    }

    @Override // p000.vwa
    public boolean handles(@efb Integer num) {
        return true;
    }
}
