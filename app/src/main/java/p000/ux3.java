package p000;

import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.graphics.ImageDecoder$OnPartialImageListener;
import android.os.Build;
import android.util.Log;
import android.util.Size;

/* JADX INFO: loaded from: classes3.dex */
@c5e(api = 28)
public final class ux3 implements ImageDecoder$OnHeaderDecodedListener {

    /* JADX INFO: renamed from: h */
    public static final String f89323h = "ImageDecoder";

    /* JADX INFO: renamed from: a */
    public final pg7 f89324a = pg7.getInstance();

    /* JADX INFO: renamed from: b */
    public final int f89325b;

    /* JADX INFO: renamed from: c */
    public final int f89326c;

    /* JADX INFO: renamed from: d */
    public final bl3 f89327d;

    /* JADX INFO: renamed from: e */
    public final hn4 f89328e;

    /* JADX INFO: renamed from: f */
    public final boolean f89329f;

    /* JADX INFO: renamed from: g */
    public final n9d f89330g;

    /* JADX INFO: renamed from: ux3$a */
    public class C13754a implements ImageDecoder$OnPartialImageListener {
        public C13754a() {
        }

        public boolean onPartialImage(@efb ImageDecoder.DecodeException decodeException) {
            return false;
        }
    }

    public ux3(int i, int i2, @efb i7c i7cVar) {
        this.f89325b = i;
        this.f89326c = i2;
        this.f89327d = (bl3) i7cVar.get(in4.f47580g);
        this.f89328e = (hn4) i7cVar.get(hn4.f44199h);
        v6c<Boolean> v6cVar = in4.f47584k;
        this.f89329f = i7cVar.get(v6cVar) != null && ((Boolean) i7cVar.get(v6cVar)).booleanValue();
        this.f89330g = (n9d) i7cVar.get(in4.f47581h);
    }

    public void onHeaderDecoded(@efb ImageDecoder imageDecoder, @efb ImageDecoder.ImageInfo imageInfo, @efb ImageDecoder.Source source) {
        if (this.f89324a.isHardwareConfigAllowed(this.f89325b, this.f89326c, this.f89329f, false)) {
            imageDecoder.setAllocator(3);
        } else {
            imageDecoder.setAllocator(1);
        }
        if (this.f89327d == bl3.PREFER_RGB_565) {
            imageDecoder.setMemorySizePolicy(0);
        }
        imageDecoder.setOnPartialImageListener(new C13754a());
        Size size = imageInfo.getSize();
        int width = this.f89325b;
        if (width == Integer.MIN_VALUE) {
            width = size.getWidth();
        }
        int height = this.f89326c;
        if (height == Integer.MIN_VALUE) {
            height = size.getHeight();
        }
        float scaleFactor = this.f89328e.getScaleFactor(size.getWidth(), size.getHeight(), width, height);
        int iRound = Math.round(size.getWidth() * scaleFactor);
        int iRound2 = Math.round(size.getHeight() * scaleFactor);
        if (Log.isLoggable(f89323h, 2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Resizing from [");
            sb.append(size.getWidth());
            sb.append("x");
            sb.append(size.getHeight());
            sb.append("] to [");
            sb.append(iRound);
            sb.append("x");
            sb.append(iRound2);
            sb.append("] scaleFactor: ");
            sb.append(scaleFactor);
        }
        imageDecoder.setTargetSize(iRound, iRound2);
        n9d n9dVar = this.f89330g;
        if (n9dVar != null) {
            if (Build.VERSION.SDK_INT >= 28) {
                imageDecoder.setTargetColorSpace(ColorSpace.get((n9dVar == n9d.DISPLAY_P3 && imageInfo.getColorSpace() != null && imageInfo.getColorSpace().isWideGamut()) ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB));
            } else {
                imageDecoder.setTargetColorSpace(ColorSpace.get(ColorSpace.Named.SRGB));
            }
        }
    }
}
