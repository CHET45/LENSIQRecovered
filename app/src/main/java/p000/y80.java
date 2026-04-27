package p000;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class y80 extends se9<AssetFileDescriptor> {
    public y80(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    @Override // p000.se9
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo21862a(AssetFileDescriptor assetFileDescriptor) throws IOException {
        assetFileDescriptor.close();
    }

    @Override // p000.se9
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public AssetFileDescriptor mo21863b(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
        if (assetFileDescriptorOpenAssetFileDescriptor != null) {
            return assetFileDescriptorOpenAssetFileDescriptor;
        }
        throw new FileNotFoundException("FileDescriptor is null for: " + uri);
    }

    @Override // p000.bg3
    @efb
    public Class<AssetFileDescriptor> getDataClass() {
        return AssetFileDescriptor.class;
    }
}
