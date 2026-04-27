package p000;

import android.util.Log;
import com.bumptech.glide.load.C2491a;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class w5g implements b6e<InputStream, GifDrawable> {

    /* JADX INFO: renamed from: d */
    public static final String f93379d = "StreamGifDecoder";

    /* JADX INFO: renamed from: a */
    public final List<ImageHeaderParser> f93380a;

    /* JADX INFO: renamed from: b */
    public final b6e<ByteBuffer, GifDrawable> f93381b;

    /* JADX INFO: renamed from: c */
    public final z60 f93382c;

    public w5g(List<ImageHeaderParser> list, b6e<ByteBuffer, GifDrawable> b6eVar, z60 z60Var) {
        this.f93380a = list;
        this.f93381b = b6eVar;
        this.f93382c = z60Var;
    }

    private static byte[] inputStreamToBytes(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr = new byte[16384];
            while (true) {
                int i = inputStream.read(bArr);
                if (i == -1) {
                    byteArrayOutputStream.flush();
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, i);
            }
        } catch (IOException e) {
            if (!Log.isLoggable(f93379d, 5)) {
                return null;
            }
            Log.w(f93379d, "Error reading data from stream", e);
            return null;
        }
    }

    @Override // p000.b6e
    public t5e<GifDrawable> decode(@efb InputStream inputStream, int i, int i2, @efb i7c i7cVar) throws IOException {
        byte[] bArrInputStreamToBytes = inputStreamToBytes(inputStream);
        if (bArrInputStreamToBytes == null) {
            return null;
        }
        return this.f93381b.decode(ByteBuffer.wrap(bArrInputStreamToBytes), i, i2, i7cVar);
    }

    @Override // p000.b6e
    public boolean handles(@efb InputStream inputStream, @efb i7c i7cVar) throws IOException {
        return !((Boolean) i7cVar.get(n67.f63384b)).booleanValue() && C2491a.getType(this.f93380a, inputStream, this.f93382c) == ImageHeaderParser.ImageType.GIF;
    }
}
