package p000;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.C2491a;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: renamed from: fy */
/* JADX INFO: loaded from: classes3.dex */
@c5e(28)
public final class C6035fy {

    /* JADX INFO: renamed from: a */
    public final List<ImageHeaderParser> f38013a;

    /* JADX INFO: renamed from: b */
    public final z60 f38014b;

    /* JADX INFO: renamed from: fy$a */
    public static final class a implements t5e<Drawable> {

        /* JADX INFO: renamed from: b */
        public static final int f38015b = 2;

        /* JADX INFO: renamed from: a */
        public final AnimatedImageDrawable f38016a;

        public a(AnimatedImageDrawable animatedImageDrawable) {
            this.f38016a = animatedImageDrawable;
        }

        @Override // p000.t5e
        @efb
        public Class<Drawable> getResourceClass() {
            return Drawable.class;
        }

        @Override // p000.t5e
        public int getSize() {
            return this.f38016a.getIntrinsicWidth() * this.f38016a.getIntrinsicHeight() * v0i.getBytesPerPixel(Bitmap.Config.ARGB_8888) * 2;
        }

        @Override // p000.t5e
        public void recycle() {
            this.f38016a.stop();
            this.f38016a.clearAnimationCallbacks();
        }

        @Override // p000.t5e
        @efb
        public Drawable get() {
            return this.f38016a;
        }
    }

    /* JADX INFO: renamed from: fy$b */
    public static final class b implements b6e<ByteBuffer, Drawable> {

        /* JADX INFO: renamed from: a */
        public final C6035fy f38017a;

        public b(C6035fy c6035fy) {
            this.f38017a = c6035fy;
        }

        @Override // p000.b6e
        public t5e<Drawable> decode(@efb ByteBuffer byteBuffer, int i, int i2, @efb i7c i7cVar) throws IOException {
            return this.f38017a.m11229a(ImageDecoder.createSource(byteBuffer), i, i2, i7cVar);
        }

        @Override // p000.b6e
        public boolean handles(@efb ByteBuffer byteBuffer, @efb i7c i7cVar) throws IOException {
            return this.f38017a.m11231c(byteBuffer);
        }
    }

    /* JADX INFO: renamed from: fy$c */
    public static final class c implements b6e<InputStream, Drawable> {

        /* JADX INFO: renamed from: a */
        public final C6035fy f38018a;

        public c(C6035fy c6035fy) {
            this.f38018a = c6035fy;
        }

        @Override // p000.b6e
        public t5e<Drawable> decode(@efb InputStream inputStream, int i, int i2, @efb i7c i7cVar) throws IOException {
            return this.f38018a.m11229a(ImageDecoder.createSource(ej1.fromStream(inputStream)), i, i2, i7cVar);
        }

        @Override // p000.b6e
        public boolean handles(@efb InputStream inputStream, @efb i7c i7cVar) throws IOException {
            return this.f38018a.m11230b(inputStream);
        }
    }

    private C6035fy(List<ImageHeaderParser> list, z60 z60Var) {
        this.f38013a = list;
        this.f38014b = z60Var;
    }

    public static b6e<ByteBuffer, Drawable> byteBufferDecoder(List<ImageHeaderParser> list, z60 z60Var) {
        return new b(new C6035fy(list, z60Var));
    }

    private boolean isHandled(ImageHeaderParser.ImageType imageType) {
        return imageType == ImageHeaderParser.ImageType.ANIMATED_WEBP;
    }

    public static b6e<InputStream, Drawable> streamDecoder(List<ImageHeaderParser> list, z60 z60Var) {
        return new c(new C6035fy(list, z60Var));
    }

    /* JADX INFO: renamed from: a */
    public t5e<Drawable> m11229a(@efb ImageDecoder.Source source, int i, int i2, @efb i7c i7cVar) throws IOException {
        Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(source, new ux3(i, i2, i7cVar));
        if (C15865yx.m26383a(drawableDecodeDrawable)) {
            return new a(C16291zx.m27110a(drawableDecodeDrawable));
        }
        throw new IOException("Received unexpected drawable type for animated webp, failing: " + drawableDecodeDrawable);
    }

    /* JADX INFO: renamed from: b */
    public boolean m11230b(InputStream inputStream) throws IOException {
        return isHandled(C2491a.getType(this.f38013a, inputStream, this.f38014b));
    }

    /* JADX INFO: renamed from: c */
    public boolean m11231c(ByteBuffer byteBuffer) throws IOException {
        return isHandled(C2491a.getType(this.f38013a, byteBuffer));
    }
}
