package p000;

import android.util.Log;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class h67 implements g6e<GifDrawable> {

    /* JADX INFO: renamed from: a */
    public static final String f42473a = "GifEncoder";

    @Override // p000.g6e
    @efb
    public g15 getEncodeStrategy(@efb i7c i7cVar) {
        return g15.SOURCE;
    }

    @Override // p000.n15
    public boolean encode(@efb t5e<GifDrawable> t5eVar, @efb File file, @efb i7c i7cVar) throws Throwable {
        try {
            ej1.toFile(t5eVar.get().getBuffer(), file);
            return true;
        } catch (IOException e) {
            if (Log.isLoggable(f42473a, 5)) {
                Log.w(f42473a, "Failed to encode GIF drawable data", e);
            }
            return false;
        }
    }
}
