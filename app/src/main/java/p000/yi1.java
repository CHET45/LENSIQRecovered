package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import com.bumptech.glide.ComponentCallbacks2C2485a;
import com.bumptech.glide.gifdecoder.GifDecoder;
import com.bumptech.glide.gifdecoder.GifHeader;
import com.bumptech.glide.gifdecoder.GifHeaderParser;
import com.bumptech.glide.gifdecoder.StandardGifDecoder;
import com.bumptech.glide.load.C2491a;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Queue;

/* JADX INFO: loaded from: classes3.dex */
public class yi1 implements b6e<ByteBuffer, GifDrawable> {

    /* JADX INFO: renamed from: f */
    public static final String f101676f = "BufferGifDecoder";

    /* JADX INFO: renamed from: g */
    public static final C15677a f101677g = new C15677a();

    /* JADX INFO: renamed from: h */
    public static final C15678b f101678h = new C15678b();

    /* JADX INFO: renamed from: a */
    public final Context f101679a;

    /* JADX INFO: renamed from: b */
    public final List<ImageHeaderParser> f101680b;

    /* JADX INFO: renamed from: c */
    public final C15678b f101681c;

    /* JADX INFO: renamed from: d */
    public final C15677a f101682d;

    /* JADX INFO: renamed from: e */
    public final e67 f101683e;

    /* JADX INFO: renamed from: yi1$a */
    @fdi
    public static class C15677a {
        /* JADX INFO: renamed from: a */
        public GifDecoder m26083a(GifDecoder.BitmapProvider bitmapProvider, GifHeader gifHeader, ByteBuffer byteBuffer, int i) {
            return new StandardGifDecoder(bitmapProvider, gifHeader, byteBuffer, i);
        }
    }

    /* JADX INFO: renamed from: yi1$b */
    @fdi
    public static class C15678b {

        /* JADX INFO: renamed from: a */
        public final Queue<GifHeaderParser> f101684a = v0i.createQueue(0);

        /* JADX INFO: renamed from: a */
        public synchronized GifHeaderParser m26084a(ByteBuffer byteBuffer) {
            GifHeaderParser gifHeaderParserPoll;
            try {
                gifHeaderParserPoll = this.f101684a.poll();
                if (gifHeaderParserPoll == null) {
                    gifHeaderParserPoll = new GifHeaderParser();
                }
            } catch (Throwable th) {
                throw th;
            }
            return gifHeaderParserPoll.setData(byteBuffer);
        }

        /* JADX INFO: renamed from: b */
        public synchronized void m26085b(GifHeaderParser gifHeaderParser) {
            gifHeaderParser.clear();
            this.f101684a.offer(gifHeaderParser);
        }
    }

    public yi1(Context context) {
        this(context, ComponentCallbacks2C2485a.get(context).getRegistry().getImageHeaderParsers(), ComponentCallbacks2C2485a.get(context).getBitmapPool(), ComponentCallbacks2C2485a.get(context).getArrayPool());
    }

    private static int getSampleSize(GifHeader gifHeader, int i, int i2) {
        int iMin = Math.min(gifHeader.getHeight() / i2, gifHeader.getWidth() / i);
        int iMax = Math.max(1, iMin == 0 ? 0 : Integer.highestOneBit(iMin));
        if (Log.isLoggable(f101676f, 2) && iMax > 1) {
            StringBuilder sb = new StringBuilder();
            sb.append("Downsampling GIF, sampleSize: ");
            sb.append(iMax);
            sb.append(", target dimens: [");
            sb.append(i);
            sb.append("x");
            sb.append(i2);
            sb.append("], actual dimens: [");
            sb.append(gifHeader.getWidth());
            sb.append("x");
            sb.append(gifHeader.getHeight());
            sb.append("]");
        }
        return iMax;
    }

    @Override // p000.b6e
    public i67 decode(@efb ByteBuffer byteBuffer, int i, int i2, @efb i7c i7cVar) {
        GifHeaderParser gifHeaderParserM26084a = this.f101681c.m26084a(byteBuffer);
        try {
            return decode(byteBuffer, i, i2, gifHeaderParserM26084a, i7cVar);
        } finally {
            this.f101681c.m26085b(gifHeaderParserM26084a);
        }
    }

    @Override // p000.b6e
    public boolean handles(@efb ByteBuffer byteBuffer, @efb i7c i7cVar) throws IOException {
        return !((Boolean) i7cVar.get(n67.f63384b)).booleanValue() && C2491a.getType(this.f101680b, byteBuffer) == ImageHeaderParser.ImageType.GIF;
    }

    public yi1(Context context, List<ImageHeaderParser> list, e41 e41Var, z60 z60Var) {
        this(context, list, e41Var, z60Var, f101678h, f101677g);
    }

    @hib
    private i67 decode(ByteBuffer byteBuffer, int i, int i2, GifHeaderParser gifHeaderParser, i7c i7cVar) {
        Bitmap.Config config;
        long logTime = si9.getLogTime();
        try {
            GifHeader header = gifHeaderParser.parseHeader();
            if (header.getNumFrames() > 0 && header.getStatus() == 0) {
                if (i7cVar.get(n67.f63383a) == bl3.PREFER_RGB_565) {
                    config = Bitmap.Config.RGB_565;
                } else {
                    config = Bitmap.Config.ARGB_8888;
                }
                GifDecoder gifDecoderM26083a = this.f101682d.m26083a(this.f101683e, header, byteBuffer, getSampleSize(header, i, i2));
                gifDecoderM26083a.setDefaultBitmapConfig(config);
                gifDecoderM26083a.advance();
                Bitmap nextFrame = gifDecoderM26083a.getNextFrame();
                if (nextFrame == null) {
                    if (Log.isLoggable(f101676f, 2)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Decoded GIF from stream in ");
                        sb.append(si9.getElapsedMillis(logTime));
                    }
                    return null;
                }
                i67 i67Var = new i67(new GifDrawable(this.f101679a, gifDecoderM26083a, hth.get(), i, i2, nextFrame));
                if (Log.isLoggable(f101676f, 2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Decoded GIF from stream in ");
                    sb2.append(si9.getElapsedMillis(logTime));
                }
                return i67Var;
            }
            return null;
        } finally {
            if (Log.isLoggable(f101676f, 2)) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Decoded GIF from stream in ");
                sb3.append(si9.getElapsedMillis(logTime));
            }
        }
    }

    @fdi
    public yi1(Context context, List<ImageHeaderParser> list, e41 e41Var, z60 z60Var, C15678b c15678b, C15677a c15677a) {
        this.f101679a = context.getApplicationContext();
        this.f101680b = list;
        this.f101682d = c15677a;
        this.f101683e = new e67(e41Var, z60Var);
        this.f101681c = c15678b;
    }
}
