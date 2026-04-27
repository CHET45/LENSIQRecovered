package p000;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public class vi1 implements n15<ByteBuffer> {

    /* JADX INFO: renamed from: a */
    public static final String f91233a = "ByteBufferEncoder";

    @Override // p000.n15
    public boolean encode(@efb ByteBuffer byteBuffer, @efb File file, @efb i7c i7cVar) throws Throwable {
        try {
            ej1.toFile(byteBuffer, file);
            return true;
        } catch (IOException unused) {
            Log.isLoggable(f91233a, 3);
            return false;
        }
    }
}
