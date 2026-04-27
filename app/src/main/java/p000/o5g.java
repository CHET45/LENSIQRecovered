package p000;

import android.content.res.AssetManager;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public class o5g extends z80<InputStream> {
    public o5g(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    @Override // p000.z80
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo18362a(InputStream inputStream) throws IOException {
        inputStream.close();
    }

    @Override // p000.z80
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public InputStream mo18363b(AssetManager assetManager, String str) throws IOException {
        return assetManager.open(str);
    }

    @Override // p000.bg3
    @efb
    public Class<InputStream> getDataClass() {
        return InputStream.class;
    }
}
