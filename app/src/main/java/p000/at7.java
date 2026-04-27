package p000;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
@igg({"ClassVerificationFailure"})
public final class at7 {

    /* JADX INFO: renamed from: at7$a */
    @dwf({"SMAP\nImageDecoder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageDecoder.kt\nandroidx/core/graphics/ImageDecoderKt$decodeBitmap$1\n*L\n1#1,56:1\n*E\n"})
    public static final class C1604a implements ImageDecoder$OnHeaderDecodedListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ kz6<ImageDecoder, ImageDecoder.ImageInfo, ImageDecoder.Source, bth> f11834a;

        /* JADX WARN: Multi-variable type inference failed */
        public C1604a(kz6<? super ImageDecoder, ? super ImageDecoder.ImageInfo, ? super ImageDecoder.Source, bth> kz6Var) {
            this.f11834a = kz6Var;
        }

        public final void onHeaderDecoded(@yfb ImageDecoder imageDecoder, @yfb ImageDecoder.ImageInfo imageInfo, @yfb ImageDecoder.Source source) {
            this.f11834a.invoke(imageDecoder, imageInfo, source);
        }
    }

    /* JADX INFO: renamed from: at7$b */
    @dwf({"SMAP\nImageDecoder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageDecoder.kt\nandroidx/core/graphics/ImageDecoderKt$decodeDrawable$1\n*L\n1#1,56:1\n*E\n"})
    public static final class C1605b implements ImageDecoder$OnHeaderDecodedListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ kz6<ImageDecoder, ImageDecoder.ImageInfo, ImageDecoder.Source, bth> f11835a;

        /* JADX WARN: Multi-variable type inference failed */
        public C1605b(kz6<? super ImageDecoder, ? super ImageDecoder.ImageInfo, ? super ImageDecoder.Source, bth> kz6Var) {
            this.f11835a = kz6Var;
        }

        public final void onHeaderDecoded(@yfb ImageDecoder imageDecoder, @yfb ImageDecoder.ImageInfo imageInfo, @yfb ImageDecoder.Source source) {
            this.f11835a.invoke(imageDecoder, imageInfo, source);
        }
    }

    @c5e(28)
    @yfb
    public static final Bitmap decodeBitmap(@yfb ImageDecoder.Source source, @yfb kz6<? super ImageDecoder, ? super ImageDecoder.ImageInfo, ? super ImageDecoder.Source, bth> kz6Var) {
        return ImageDecoder.decodeBitmap(source, xs7.m25442a(new C1604a(kz6Var)));
    }

    @c5e(28)
    @yfb
    public static final Drawable decodeDrawable(@yfb ImageDecoder.Source source, @yfb kz6<? super ImageDecoder, ? super ImageDecoder.ImageInfo, ? super ImageDecoder.Source, bth> kz6Var) {
        return ImageDecoder.decodeDrawable(source, xs7.m25442a(new C1605b(kz6Var)));
    }
}
