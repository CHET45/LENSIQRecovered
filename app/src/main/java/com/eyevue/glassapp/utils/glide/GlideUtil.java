package com.eyevue.glassapp.utils.glide;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import com.bumptech.glide.ComponentCallbacks2C2485a;
import com.bumptech.glide.request.RequestOptions;
import com.eyevue.common.C2531R;
import p000.aa1;
import p000.bwc;
import p000.ceh;
import p000.cu0;
import p000.eb7;
import p000.gq4;
import p000.id1;
import p000.in4;
import p000.lqf;
import p000.ne4;
import p000.uye;
import p000.w83;
import p000.x83;

/* JADX INFO: loaded from: classes4.dex */
public class GlideUtil {

    @gq4
    private static final int ERROR_IMAGE;

    @gq4
    private static final int PLACEHOLDER_IMAGE;
    private static final RequestOptions mRequestOptions;

    static {
        int i = C2531R.drawable.placeholder;
        ERROR_IMAGE = i;
        PLACEHOLDER_IMAGE = i;
        mRequestOptions = new RequestOptions().set(in4.f47584k, Boolean.TRUE);
    }

    private static void applyFilterTransformation(Context context, String url, ImageView imageView, ceh<Bitmap> transformation) {
        ComponentCallbacks2C2485a.with(context).load(url).apply((cu0<?>) getDefaultRequestOptions().transform(transformation)).into(imageView);
    }

    public static void clearDiskCache(Context context) {
        ComponentCallbacks2C2485a.get(context).clearDiskCache();
    }

    public static void clearMemory(Context context) {
        ComponentCallbacks2C2485a.get(context).clearMemory();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static float dpToPx(Context context, float dp) {
        return dp * context.getResources().getDisplayMetrics().density;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static RequestOptions getDefaultRequestOptions() {
        RequestOptions requestOptions = new RequestOptions();
        int i = ERROR_IMAGE;
        return requestOptions.error(i).placeholder(PLACEHOLDER_IMAGE).fallback(i).diskCacheStrategy(ne4.f64117a);
    }

    public static void loadBrightnessFilterTransformationImage(Context context, String url, ImageView imageView) {
        applyFilterTransformation(context, url, imageView, new id1(0.5f));
    }

    public static void loadCircleImage(Context context, String url, ImageView imageView) {
        ComponentCallbacks2C2485a.with(context).load(url).apply((cu0<?>) getDefaultRequestOptions().circleCrop()).into(imageView);
    }

    public static void loadCropTransformationImage(Context context, String url, ImageView imageView, int width, int height, x83.EnumC14982b cropType) {
        ComponentCallbacks2C2485a.with(context).load(url).apply((cu0<?>) getDefaultRequestOptions().transform(new x83(width, height, cropType))).skipMemoryCache(true).into(imageView);
    }

    public static void loadFileImage(Context context, Uri url, ImageView imageView, int radius) {
        ComponentCallbacks2C2485a.with(context).load(url).apply((cu0<?>) getDefaultRequestOptions().transform(new MultiRadiusRoundTransform(dpToPx(context, radius), CornerType.ALL, imageView.getWidth(), imageView.getHeight()))).override(imageView.getWidth(), imageView.getHeight()).into(imageView);
    }

    public static void loadGifImage(Context context, String url, ImageView imageView) {
        ComponentCallbacks2C2485a.with(context).asGif().load(url).apply((cu0<?>) getDefaultRequestOptions()).into(imageView);
    }

    public static void loadGrayscaleImage(Context context, String url, ImageView imageView) {
        ComponentCallbacks2C2485a.with(context).load(url).apply((cu0<?>) getDefaultRequestOptions().transform(new eb7())).into(imageView);
    }

    public static void loadImage(Object obj, ImageView imageView) {
        loadImageWithContext(imageView.getContext(), obj, imageView);
    }

    private static void loadImageWithContext(Context context, Object obj, ImageView imageView) {
        ComponentCallbacks2C2485a.with(context).load(obj).apply((cu0<?>) getDefaultRequestOptions()).into(imageView);
    }

    public static void loadPixelationFilterTransformationImage(Context context, String url, ImageView imageView) {
        applyFilterTransformation(context, url, imageView, new bwc(20.0f));
    }

    public static void loadRoundedImage(Context context, String url, ImageView imageView, int radius) {
        loadRoundedImage(context, url, imageView, radius, CornerType.ALL);
    }

    public static void loadSepiaFilterTransformationImage(Context context, String url, ImageView imageView) {
        applyFilterTransformation(context, url, imageView, new uye(1.0f));
    }

    public static void loadSketchFilterTransformationImage(Context context, String url, ImageView imageView) {
        applyFilterTransformation(context, url, imageView, new lqf());
    }

    public static void loadSquareImage(Context context, String url, ImageView imageView) {
        ComponentCallbacks2C2485a.with(context).load(url).apply((cu0<?>) getDefaultRequestOptions().transform(new w83())).into(imageView);
    }

    public static void loadThumbnailImage(String url, ImageView imageView, float sizeMultiplier) {
        ComponentCallbacks2C2485a.with(imageView.getContext()).load(url).thumbnail(sizeMultiplier).apply((cu0<?>) getDefaultRequestOptions()).into(imageView);
    }

    public static void loadTransformImage(String url, ImageView imageView, int ambiguity) {
        ComponentCallbacks2C2485a.with(imageView.getContext()).load(url).apply((cu0<?>) getDefaultRequestOptions().transform(new aa1(ambiguity))).into(imageView);
    }

    public static void showGifImg(Context context, int id, ImageView imageView) {
        try {
            ComponentCallbacks2C2485a.with(context).asGif().load(Integer.valueOf(id)).error(C2531R.drawable.error).centerCrop().apply((cu0<?>) mRequestOptions).placeholder(C2531R.drawable.placeholder).into(imageView);
        } catch (Exception unused) {
        }
    }

    public static void loadRoundedImage(Context context, Uri url, ImageView imageView, int radius) {
        loadRoundedImage(context, url, imageView, radius, CornerType.ALL);
    }

    public static void loadRoundedImage(Context context, byte[] bytes, ImageView imageView, int radius) {
        ComponentCallbacks2C2485a.with(context).load(bytes).apply((cu0<?>) getDefaultRequestOptions().transform(new MultiRadiusRoundTransform(dpToPx(context, radius), CornerType.ALL, imageView.getWidth(), imageView.getHeight()))).into(imageView);
    }

    public static void loadCropTransformationImage(Context context, String url, ImageView imageView, int width, int height) {
        loadCropTransformationImage(context, url, imageView, width, height, x83.EnumC14982b.CENTER);
    }

    public static void loadGifImage(String url, ImageView imageView) {
        loadGifImage(imageView.getContext(), url, imageView);
    }

    public static void loadRoundedImage(final Context context, final String url, final ImageView imageView, final int radius, final CornerType cornerType) {
        imageView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.eyevue.glassapp.utils.glide.GlideUtil.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                imageView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                if (imageView.getWidth() <= 0 || imageView.getHeight() <= 0) {
                    return;
                }
                ComponentCallbacks2C2485a.with(context).load(url).apply((cu0<?>) GlideUtil.getDefaultRequestOptions().transform(new MultiRadiusRoundTransform(GlideUtil.dpToPx(context, radius), cornerType, imageView.getWidth(), imageView.getHeight()))).diskCacheStrategy(ne4.f64117a).into(imageView);
            }
        });
    }

    public static void loadRoundedImage(final Context context, final Uri url, final ImageView imageView, final int radius, final CornerType cornerType) {
        imageView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.eyevue.glassapp.utils.glide.GlideUtil.2
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                imageView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                if (imageView.getWidth() <= 0 || imageView.getHeight() <= 0) {
                    return;
                }
                ComponentCallbacks2C2485a.with(context).load(url).apply((cu0<?>) GlideUtil.getDefaultRequestOptions().transform(new MultiRadiusRoundTransform(GlideUtil.dpToPx(context, radius), cornerType, imageView.getWidth(), imageView.getHeight()))).into(imageView);
            }
        });
    }
}
