package p000;

import android.content.res.AssetManager;
import android.util.Log;
import com.bumptech.glide.Priority;
import java.io.IOException;
import p000.bg3;

/* JADX INFO: loaded from: classes3.dex */
public abstract class z80<T> implements bg3<T> {

    /* JADX INFO: renamed from: d */
    public static final String f104360d = "AssetPathFetcher";

    /* JADX INFO: renamed from: a */
    public final String f104361a;

    /* JADX INFO: renamed from: b */
    public final AssetManager f104362b;

    /* JADX INFO: renamed from: c */
    public T f104363c;

    public z80(AssetManager assetManager, String str) {
        this.f104362b = assetManager;
        this.f104361a = str;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo18362a(T t) throws IOException;

    /* JADX INFO: renamed from: b */
    public abstract T mo18363b(AssetManager assetManager, String str) throws IOException;

    @Override // p000.bg3
    public void cancel() {
    }

    @Override // p000.bg3
    public void cleanup() {
        T t = this.f104363c;
        if (t == null) {
            return;
        }
        try {
            mo18362a(t);
        } catch (IOException unused) {
        }
    }

    @Override // p000.bg3
    @efb
    public hh3 getDataSource() {
        return hh3.LOCAL;
    }

    @Override // p000.bg3
    public void loadData(@efb Priority priority, @efb bg3.InterfaceC1883a<? super T> interfaceC1883a) {
        try {
            T tMo18363b = mo18363b(this.f104362b, this.f104361a);
            this.f104363c = tMo18363b;
            interfaceC1883a.onDataReady(tMo18363b);
        } catch (IOException e) {
            Log.isLoggable(f104360d, 3);
            interfaceC1883a.onLoadFailed(e);
        }
    }
}
