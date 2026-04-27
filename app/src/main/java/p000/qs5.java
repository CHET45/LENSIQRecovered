package p000;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class qs5 extends z80<AssetFileDescriptor> {
    public qs5(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    @Override // p000.z80
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo18362a(AssetFileDescriptor assetFileDescriptor) throws IOException {
        assetFileDescriptor.close();
    }

    @Override // p000.z80
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public AssetFileDescriptor mo18363b(AssetManager assetManager, String str) throws IOException {
        return assetManager.openFd(str);
    }

    @Override // p000.bg3
    @efb
    public Class<AssetFileDescriptor> getDataClass() {
        return AssetFileDescriptor.class;
    }
}
