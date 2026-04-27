package p000;

import android.util.SparseArray;
import com.google.android.exoplayer2.offline.C3061e;
import com.google.android.exoplayer2.offline.DownloadRequest;
import com.google.android.exoplayer2.offline.InterfaceC3060d;
import java.lang.reflect.Constructor;
import java.util.concurrent.Executor;
import p000.aga;
import p000.ml1;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class vt3 implements fn4 {

    /* JADX INFO: renamed from: c */
    public static final SparseArray<Constructor<? extends InterfaceC3060d>> f92224c = createDownloaderConstructors();

    /* JADX INFO: renamed from: a */
    public final ml1.C9395d f92225a;

    /* JADX INFO: renamed from: b */
    public final Executor f92226b;

    @Deprecated
    public vt3(ml1.C9395d c9395d) {
        this(c9395d, new p63());
    }

    private static SparseArray<Constructor<? extends InterfaceC3060d>> createDownloaderConstructors() {
        SparseArray<Constructor<? extends InterfaceC3060d>> sparseArray = new SparseArray<>();
        try {
            sparseArray.put(0, getDownloaderConstructor(ze3.class));
        } catch (ClassNotFoundException unused) {
        }
        try {
            sparseArray.put(2, getDownloaderConstructor(Class.forName("com.google.android.exoplayer2.source.hls.offline.HlsDownloader")));
        } catch (ClassNotFoundException unused2) {
        }
        try {
            sparseArray.put(1, getDownloaderConstructor(Class.forName("com.google.android.exoplayer2.source.smoothstreaming.offline.SsDownloader")));
        } catch (ClassNotFoundException unused3) {
        }
        return sparseArray;
    }

    private static Constructor<? extends InterfaceC3060d> getDownloaderConstructor(Class<?> cls) {
        try {
            return cls.asSubclass(InterfaceC3060d.class).getConstructor(aga.class, ml1.C9395d.class, Executor.class);
        } catch (NoSuchMethodException e) {
            throw new IllegalStateException("Downloader constructor missing", e);
        }
    }

    @Override // p000.fn4
    public InterfaceC3060d createDownloader(DownloadRequest downloadRequest) {
        int iInferContentTypeForUriAndMimeType = x0i.inferContentTypeForUriAndMimeType(downloadRequest.f19715b, downloadRequest.f19716c);
        if (iInferContentTypeForUriAndMimeType == 0 || iInferContentTypeForUriAndMimeType == 1 || iInferContentTypeForUriAndMimeType == 2) {
            return createDownloader(downloadRequest, iInferContentTypeForUriAndMimeType);
        }
        if (iInferContentTypeForUriAndMimeType == 4) {
            return new C3061e(new aga.C0235c().setUri(downloadRequest.f19715b).setCustomCacheKey(downloadRequest.f19719f).build(), this.f92225a, this.f92226b);
        }
        throw new IllegalArgumentException("Unsupported type: " + iInferContentTypeForUriAndMimeType);
    }

    public vt3(ml1.C9395d c9395d, Executor executor) {
        this.f92225a = (ml1.C9395d) u80.checkNotNull(c9395d);
        this.f92226b = (Executor) u80.checkNotNull(executor);
    }

    private InterfaceC3060d createDownloader(DownloadRequest downloadRequest, int i) {
        Constructor<? extends InterfaceC3060d> constructor = f92224c.get(i);
        if (constructor != null) {
            try {
                return constructor.newInstance(new aga.C0235c().setUri(downloadRequest.f19715b).setStreamKeys(downloadRequest.f19717d).setCustomCacheKey(downloadRequest.f19719f).build(), this.f92225a, this.f92226b);
            } catch (Exception e) {
                throw new IllegalStateException("Failed to instantiate downloader for content type " + i, e);
            }
        }
        throw new IllegalStateException("Module missing for content type " + i);
    }
}
