package p000;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import com.bumptech.glide.Priority;
import java.io.FileNotFoundException;
import java.io.IOException;
import p000.bg3;

/* JADX INFO: loaded from: classes3.dex */
public abstract class se9<T> implements bg3<T> {

    /* JADX INFO: renamed from: d */
    public static final String f81519d = "LocalUriFetcher";

    /* JADX INFO: renamed from: a */
    public final Uri f81520a;

    /* JADX INFO: renamed from: b */
    public final ContentResolver f81521b;

    /* JADX INFO: renamed from: c */
    public T f81522c;

    public se9(ContentResolver contentResolver, Uri uri) {
        this.f81521b = contentResolver;
        this.f81520a = uri;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo21862a(T t) throws IOException;

    /* JADX INFO: renamed from: b */
    public abstract T mo21863b(Uri uri, ContentResolver contentResolver) throws FileNotFoundException;

    @Override // p000.bg3
    public void cancel() {
    }

    @Override // p000.bg3
    public void cleanup() {
        T t = this.f81522c;
        if (t != null) {
            try {
                mo21862a(t);
            } catch (IOException unused) {
            }
        }
    }

    @Override // p000.bg3
    @efb
    public hh3 getDataSource() {
        return hh3.LOCAL;
    }

    @Override // p000.bg3
    public final void loadData(@efb Priority priority, @efb bg3.InterfaceC1883a<? super T> interfaceC1883a) {
        try {
            T tMo21863b = mo21863b(this.f81520a, this.f81521b);
            this.f81522c = tMo21863b;
            interfaceC1883a.onDataReady(tMo21863b);
        } catch (FileNotFoundException e) {
            Log.isLoggable(f81519d, 3);
            interfaceC1883a.onLoadFailed(e);
        }
    }
}
