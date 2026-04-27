package com.draggable.library.core;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.bumptech.glide.ComponentCallbacks2C2485a;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import com.bumptech.glide.request.RequestOptions;
import com.draggable.library.core.DraggableImageView;
import com.draggable.library.core.DraggableZoomCore;
import com.draggable.library.core.photoview.PhotoView;
import com.draggable.library.extension.Utils;
import com.draggable.library.extension.entities.DraggableImageInfo;
import com.draggable.library.extension.glide.GlideHelper;
import com.drawable.library.C2530R;
import java.util.HashMap;
import p000.afh;
import p000.bth;
import p000.cu0;
import p000.gib;
import p000.gjf;
import p000.kz6;
import p000.md8;
import p000.mf4;
import p000.mlh;
import p000.tt8;
import p000.yfb;

/* JADX INFO: loaded from: classes4.dex */
public final class DraggableImageView extends FrameLayout {
    private final String TAG;
    private HashMap _$_findViewCache;

    @gib
    private ActionListener actionListener;
    private String currentLoadUrl;
    private mf4 downloadDisposable;
    private DraggableImageInfo draggableImageInfo;
    private DraggableImageView.draggableZoomActionListener$1 draggableZoomActionListener;
    private DraggableZoomCore draggableZoomCore;
    private final DraggableImageView$exitAnimatorCallback$1 exitAnimatorCallback;
    private boolean needFitCenter;
    private float viewSelfWhRadio;

    public interface ActionListener {
        void onExit();
    }

    /* JADX INFO: renamed from: com.draggable.library.core.DraggableImageView$showImage$1 */
    public static final class C25071 extends tt8 implements kz6<Boolean, Float, Boolean, bth> {
        final /* synthetic */ DraggableImageInfo $paramsInfo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25071(DraggableImageInfo draggableImageInfo) {
            super(3);
            this.$paramsInfo = draggableImageInfo;
        }

        @Override // p000.kz6
        public /* bridge */ /* synthetic */ bth invoke(Boolean bool, Float f, Boolean bool2) {
            invoke(bool.booleanValue(), f.floatValue(), bool2.booleanValue());
            return bth.f14751a;
        }

        public final void invoke(final boolean z, final float f, boolean z2) {
            DraggableParamsInfo draggableInfo;
            DraggableImageInfo draggableImageInfo = DraggableImageView.this.draggableImageInfo;
            if (draggableImageInfo != null && (draggableInfo = draggableImageInfo.getDraggableInfo()) != null) {
                draggableInfo.setScaledViewWhRadio(f);
            }
            DraggableImageView.this.post(new Runnable() { // from class: com.draggable.library.core.DraggableImageView.showImage.1.1
                @Override // java.lang.Runnable
                public final void run() {
                    DraggableImageView.this.viewSelfWhRadio = (r0.getWidth() * 1.0f) / DraggableImageView.this.getHeight();
                    DraggableImageView draggableImageView = DraggableImageView.this;
                    draggableImageView.needFitCenter = f > draggableImageView.viewSelfWhRadio;
                    C25071 c25071 = C25071.this;
                    DraggableImageView draggableImageView2 = DraggableImageView.this;
                    DraggableParamsInfo draggableInfo2 = c25071.$paramsInfo.getDraggableInfo();
                    PhotoView photoView = (PhotoView) DraggableImageView.this._$_findCachedViewById(C2530R.id.mDraggableImageViewPhotoView);
                    md8.checkExpressionValueIsNotNull(photoView, "mDraggableImageViewPhotoView");
                    draggableImageView2.draggableZoomCore = new DraggableZoomCore(draggableInfo2, photoView, DraggableImageView.this.getWidth(), DraggableImageView.this.getHeight(), DraggableImageView.this.draggableZoomActionListener, DraggableImageView.this.exitAnimatorCallback);
                    DraggableZoomCore draggableZoomCore = DraggableImageView.this.draggableZoomCore;
                    if (draggableZoomCore != null) {
                        draggableZoomCore.adjustScaleViewToCorrectLocation();
                    }
                    DraggableImageView.this.loadAvailableImage(false, z);
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.draggable.library.core.DraggableImageView$showImageWithAnimator$1 */
    public static final class C25081 extends tt8 implements kz6<Boolean, Float, Boolean, bth> {
        final /* synthetic */ DraggableImageInfo $paramsInfo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25081(DraggableImageInfo draggableImageInfo) {
            super(3);
            this.$paramsInfo = draggableImageInfo;
        }

        @Override // p000.kz6
        public /* bridge */ /* synthetic */ bth invoke(Boolean bool, Float f, Boolean bool2) {
            invoke(bool.booleanValue(), f.floatValue(), bool2.booleanValue());
            return bth.f14751a;
        }

        public final void invoke(final boolean z, final float f, final boolean z2) {
            DraggableParamsInfo draggableInfo;
            DraggableImageInfo draggableImageInfo = DraggableImageView.this.draggableImageInfo;
            if (draggableImageInfo != null && (draggableInfo = draggableImageInfo.getDraggableInfo()) != null) {
                draggableInfo.setScaledViewWhRadio(f);
            }
            DraggableImageView.this.post(new Runnable() { // from class: com.draggable.library.core.DraggableImageView.showImageWithAnimator.1.1
                @Override // java.lang.Runnable
                public final void run() {
                    DraggableImageView.this.viewSelfWhRadio = (r0.getWidth() * 1.0f) / DraggableImageView.this.getHeight();
                    DraggableImageView draggableImageView = DraggableImageView.this;
                    draggableImageView.needFitCenter = f > draggableImageView.viewSelfWhRadio;
                    if (!C25081.this.$paramsInfo.getDraggableInfo().isValid() || (z2 && !DraggableImageView.this.needFitCenter)) {
                        C25081.this.$paramsInfo.setDraggableInfo(new DraggableParamsInfo(0, 0, 0, 0, 0.0f, 31, null));
                        C25081 c25081 = C25081.this;
                        DraggableImageView.this.showImage(c25081.$paramsInfo);
                        return;
                    }
                    C25081 c250812 = C25081.this;
                    DraggableImageView draggableImageView2 = DraggableImageView.this;
                    DraggableParamsInfo draggableInfo2 = c250812.$paramsInfo.getDraggableInfo();
                    PhotoView photoView = (PhotoView) DraggableImageView.this._$_findCachedViewById(C2530R.id.mDraggableImageViewPhotoView);
                    md8.checkExpressionValueIsNotNull(photoView, "mDraggableImageViewPhotoView");
                    draggableImageView2.draggableZoomCore = new DraggableZoomCore(draggableInfo2, photoView, DraggableImageView.this.getWidth(), DraggableImageView.this.getHeight(), DraggableImageView.this.draggableZoomActionListener, DraggableImageView.this.exitAnimatorCallback);
                    DraggableZoomCore draggableZoomCore = DraggableImageView.this.draggableZoomCore;
                    if (draggableZoomCore != null) {
                        draggableZoomCore.adjustScaleViewToInitLocation();
                    }
                    DraggableImageView.this.loadAvailableImage(true, z);
                }
            });
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v6, types: [com.draggable.library.core.DraggableImageView$draggableZoomActionListener$1] */
    /* JADX WARN: Type inference failed for: r2v7, types: [com.draggable.library.core.DraggableImageView$exitAnimatorCallback$1] */
    public DraggableImageView(@yfb Context context) {
        super(context);
        md8.checkParameterIsNotNull(context, "context");
        this.TAG = DraggableImageView.class.getSimpleName();
        this.currentLoadUrl = "";
        this.needFitCenter = true;
        this.viewSelfWhRadio = 1.0f;
        this.draggableZoomActionListener = new DraggableZoomCore.ActionListener() { // from class: com.draggable.library.core.DraggableImageView$draggableZoomActionListener$1
            @Override // com.draggable.library.core.DraggableZoomCore.ActionListener
            public void currentAlphaValue(int i) {
                this.this$0.setBackground(new ColorDrawable(Color.argb(i, 0, 0, 0)));
            }

            @Override // com.draggable.library.core.DraggableZoomCore.ActionListener
            public void onExit() {
                DraggableImageView.ActionListener actionListener = this.this$0.getActionListener();
                if (actionListener != null) {
                    actionListener.onExit();
                }
            }
        };
        this.exitAnimatorCallback = new DraggableZoomCore.ExitAnimatorCallback() { // from class: com.draggable.library.core.DraggableImageView$exitAnimatorCallback$1
            @Override // com.draggable.library.core.DraggableZoomCore.ExitAnimatorCallback
            public void onStartInitAnimatorParams() {
                PhotoView photoView = (PhotoView) this.this$0._$_findCachedViewById(C2530R.id.mDraggableImageViewPhotoView);
                md8.checkExpressionValueIsNotNull(photoView, "mDraggableImageViewPhotoView");
                photoView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            }
        };
        initView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void clickToExit() {
        DraggableZoomCore draggableZoomCore = this.draggableZoomCore;
        if (draggableZoomCore == null || !draggableZoomCore.isAnimating()) {
            ProgressBar progressBar = (ProgressBar) _$_findCachedViewById(C2530R.id.mDraggableImageViewViewOProgressBar);
            md8.checkExpressionValueIsNotNull(progressBar, "mDraggableImageViewViewOProgressBar");
            progressBar.setVisibility(8);
            PhotoView photoView = (PhotoView) _$_findCachedViewById(C2530R.id.mDraggableImageViewPhotoView);
            md8.checkExpressionValueIsNotNull(photoView, "mDraggableImageViewPhotoView");
            if (photoView.getScale() != 1.0f) {
                ((PhotoView) _$_findCachedViewById(C2530R.id.mDraggableImageViewPhotoView)).setScale(1.0f, true);
                return;
            }
            DraggableZoomCore draggableZoomCore2 = this.draggableZoomCore;
            if (draggableZoomCore2 != null) {
                draggableZoomCore2.adjustScaleViewToCorrectLocation();
            }
            DraggableZoomCore draggableZoomCore3 = this.draggableZoomCore;
            if (draggableZoomCore3 != null) {
                draggableZoomCore3.exitWithAnimator(false);
            }
            mf4 mf4Var = this.downloadDisposable;
            if (mf4Var != null) {
                mf4Var.dispose();
            }
        }
    }

    private final void initView() {
        LayoutInflater.from(getContext()).inflate(C2530R.layout.view_draggable_simple_image, this);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        setOnClickListener(new View.OnClickListener() { // from class: com.draggable.library.core.DraggableImageView.initView.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DraggableImageView.this.clickToExit();
            }
        });
        ((PhotoView) _$_findCachedViewById(C2530R.id.mDraggableImageViewPhotoView)).setOnClickListener(new View.OnClickListener() { // from class: com.draggable.library.core.DraggableImageView.initView.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DraggableImageView.this.clickToExit();
            }
        });
        ((TextView) _$_findCachedViewById(C2530R.id.mDraggableImageViewViewOriginImage)).setOnClickListener(new View.OnClickListener() { // from class: com.draggable.library.core.DraggableImageView.initView.3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String originImg;
                DraggableImageView draggableImageView = DraggableImageView.this;
                DraggableImageInfo draggableImageInfo = draggableImageView.draggableImageInfo;
                if (draggableImageInfo == null || (originImg = draggableImageInfo.getOriginImg()) == null) {
                    originImg = "";
                }
                draggableImageView.loadImage(originImg, false);
            }
        });
        ProgressBar progressBar = (ProgressBar) _$_findCachedViewById(C2530R.id.mDraggableImageViewViewOProgressBar);
        md8.checkExpressionValueIsNotNull(progressBar, "mDraggableImageViewViewOProgressBar");
        progressBar.getIndeterminateDrawable().setColorFilter(Color.parseColor("#ebebeb"), PorterDuff.Mode.MULTIPLY);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadAvailableImage(boolean z, boolean z2) {
        DraggableZoomCore draggableZoomCore;
        Context context = getContext();
        if (!(context instanceof AppCompatActivity)) {
            context = null;
        }
        AppCompatActivity appCompatActivity = (AppCompatActivity) context;
        if (appCompatActivity == null || !appCompatActivity.isDestroyed()) {
            Context context2 = getContext();
            AppCompatActivity appCompatActivity2 = (AppCompatActivity) (context2 instanceof AppCompatActivity ? context2 : null);
            if (appCompatActivity2 == null || !appCompatActivity2.isFinishing()) {
                PhotoView photoView = (PhotoView) _$_findCachedViewById(C2530R.id.mDraggableImageViewPhotoView);
                md8.checkExpressionValueIsNotNull(photoView, "mDraggableImageViewPhotoView");
                photoView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                ((PhotoView) _$_findCachedViewById(C2530R.id.mDraggableImageViewPhotoView)).setImageResource(C2530R.drawable.place_holder_transparent);
                DraggableImageInfo draggableImageInfo = this.draggableImageInfo;
                if (draggableImageInfo == null) {
                    md8.throwNpe();
                }
                String thumbnailImg = draggableImageInfo.getThumbnailImg();
                DraggableImageInfo draggableImageInfo2 = this.draggableImageInfo;
                if (draggableImageInfo2 == null) {
                    md8.throwNpe();
                }
                String originImg = draggableImageInfo2.getOriginImg();
                Utils utils = Utils.INSTANCE;
                Context context3 = getContext();
                md8.checkExpressionValueIsNotNull(context3, "context");
                boolean zIsWifiConnected = utils.isWifiConnected(context3);
                GlideHelper glideHelper = GlideHelper.INSTANCE;
                Context context4 = getContext();
                md8.checkExpressionValueIsNotNull(context4, "context");
                final boolean zImageIsInCache = glideHelper.imageIsInCache(context4, originImg);
                final String str = (zIsWifiConnected || zImageIsInCache) ? originImg : thumbnailImg;
                setViewOriginImageBtnVisible(true ^ md8.areEqual(str, originImg));
                if (z2) {
                    loadImage(thumbnailImg, zImageIsInCache);
                }
                if (z2 && z) {
                    DraggableZoomCore draggableZoomCore2 = this.draggableZoomCore;
                    if (draggableZoomCore2 != null) {
                        draggableZoomCore2.enterWithAnimator(new DraggableZoomCore.EnterAnimatorCallback() { // from class: com.draggable.library.core.DraggableImageView.loadAvailableImage.1
                            @Override // com.draggable.library.core.DraggableZoomCore.EnterAnimatorCallback
                            public void onEnterAnimatorEnd() {
                                if (DraggableImageView.this.needFitCenter) {
                                    PhotoView photoView2 = (PhotoView) DraggableImageView.this._$_findCachedViewById(C2530R.id.mDraggableImageViewPhotoView);
                                    md8.checkExpressionValueIsNotNull(photoView2, "mDraggableImageViewPhotoView");
                                    photoView2.setScaleType(ImageView.ScaleType.FIT_CENTER);
                                    DraggableZoomCore draggableZoomCore3 = DraggableImageView.this.draggableZoomCore;
                                    if (draggableZoomCore3 != null) {
                                        draggableZoomCore3.adjustViewToMatchParent();
                                    }
                                }
                                DraggableImageView.this.loadImage(str, zImageIsInCache);
                            }

                            @Override // com.draggable.library.core.DraggableZoomCore.EnterAnimatorCallback
                            public void onEnterAnimatorStart() {
                                PhotoView photoView2 = (PhotoView) DraggableImageView.this._$_findCachedViewById(C2530R.id.mDraggableImageViewPhotoView);
                                md8.checkExpressionValueIsNotNull(photoView2, "mDraggableImageViewPhotoView");
                                photoView2.setScaleType(ImageView.ScaleType.CENTER_CROP);
                            }
                        });
                        return;
                    }
                    return;
                }
                loadImage(str, zImageIsInCache);
                if (!this.needFitCenter || (draggableZoomCore = this.draggableZoomCore) == null) {
                    return;
                }
                draggableZoomCore.adjustViewToMatchParent();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadImage(final String str, boolean z) {
        if (md8.areEqual(str, this.currentLoadUrl)) {
            return;
        }
        if (getContext() instanceof Activity) {
            Context context = getContext();
            if (context == null) {
                throw new mlh("null cannot be cast to non-null type android.app.Activity");
            }
            if (((Activity) context).isFinishing()) {
                return;
            }
            Context context2 = getContext();
            if (context2 == null) {
                throw new mlh("null cannot be cast to non-null type android.app.Activity");
            }
            if (((Activity) context2).isDestroyed()) {
                return;
            }
        }
        this.currentLoadUrl = str;
        DraggableImageInfo draggableImageInfo = this.draggableImageInfo;
        if (md8.areEqual(str, draggableImageInfo != null ? draggableImageInfo.getOriginImg() : null) && !z) {
            ProgressBar progressBar = (ProgressBar) _$_findCachedViewById(C2530R.id.mDraggableImageViewViewOProgressBar);
            md8.checkExpressionValueIsNotNull(progressBar, "mDraggableImageViewViewOProgressBar");
            progressBar.setVisibility(0);
        }
        RequestOptions requestOptionsPriority = new RequestOptions().priority(Priority.HIGH);
        md8.checkExpressionValueIsNotNull(requestOptionsPriority, "RequestOptions().priority(Priority.HIGH)");
        ComponentCallbacks2C2485a.with(getContext()).load(str).apply((cu0<?>) requestOptionsPriority).into(new gjf<Drawable>() { // from class: com.draggable.library.core.DraggableImageView.loadImage.1
            @Override // p000.gu0, p000.jmg
            public void onLoadFailed(@gib Drawable drawable) {
                super.onLoadFailed(drawable);
                ProgressBar progressBar2 = (ProgressBar) DraggableImageView.this._$_findCachedViewById(C2530R.id.mDraggableImageViewViewOProgressBar);
                md8.checkExpressionValueIsNotNull(progressBar2, "mDraggableImageViewViewOProgressBar");
                progressBar2.setVisibility(8);
            }

            @Override // p000.jmg
            public /* bridge */ /* synthetic */ void onResourceReady(Object obj, afh afhVar) {
                onResourceReady((Drawable) obj, (afh<? super Drawable>) afhVar);
            }

            public void onResourceReady(@yfb Drawable drawable, @gib afh<? super Drawable> afhVar) {
                md8.checkParameterIsNotNull(drawable, "resource");
                boolean z2 = drawable instanceof GifDrawable;
                ProgressBar progressBar2 = (ProgressBar) DraggableImageView.this._$_findCachedViewById(C2530R.id.mDraggableImageViewViewOProgressBar);
                md8.checkExpressionValueIsNotNull(progressBar2, "mDraggableImageViewViewOProgressBar");
                progressBar2.setVisibility(8);
                boolean z3 = (((float) drawable.getIntrinsicWidth()) * 1.0f) / ((float) drawable.getIntrinsicHeight()) < DraggableImageView.this.viewSelfWhRadio;
                if (z2) {
                    if (z3) {
                        PhotoView photoView = (PhotoView) DraggableImageView.this._$_findCachedViewById(C2530R.id.mDraggableImageViewPhotoView);
                        md8.checkExpressionValueIsNotNull(photoView, "mDraggableImageViewPhotoView");
                        photoView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                    }
                    md8.checkExpressionValueIsNotNull(ComponentCallbacks2C2485a.with(DraggableImageView.this.getContext()).load(str).into((PhotoView) DraggableImageView.this._$_findCachedViewById(C2530R.id.mDraggableImageViewPhotoView)), "Glide.with(context).load…ggableImageViewPhotoView)");
                } else {
                    PhotoView photoView2 = (PhotoView) DraggableImageView.this._$_findCachedViewById(C2530R.id.mDraggableImageViewPhotoView);
                    md8.checkExpressionValueIsNotNull(photoView2, "mDraggableImageViewPhotoView");
                    photoView2.setScaleType(z3 ? ImageView.ScaleType.CENTER_CROP : ImageView.ScaleType.FIT_CENTER);
                    ((PhotoView) DraggableImageView.this._$_findCachedViewById(C2530R.id.mDraggableImageViewPhotoView)).setImageBitmap(DraggableImageView.this.translateToFixedBitmap(drawable));
                }
                String str2 = str;
                DraggableImageInfo draggableImageInfo2 = DraggableImageView.this.draggableImageInfo;
                if (md8.areEqual(str2, draggableImageInfo2 != null ? draggableImageInfo2.getOriginImg() : null)) {
                    TextView textView = (TextView) DraggableImageView.this._$_findCachedViewById(C2530R.id.mDraggableImageViewViewOriginImage);
                    md8.checkExpressionValueIsNotNull(textView, "mDraggableImageViewViewOriginImage");
                    textView.setVisibility(8);
                }
            }
        });
    }

    private final void refreshOriginImageInfo() {
        DraggableImageInfo draggableImageInfo = this.draggableImageInfo;
        if (draggableImageInfo == null) {
            md8.throwNpe();
        }
        if (draggableImageInfo.getImageSize() <= 0) {
            TextView textView = (TextView) _$_findCachedViewById(C2530R.id.mDraggableImageViewViewOriginImage);
            md8.checkExpressionValueIsNotNull(textView, "mDraggableImageViewViewOriginImage");
            textView.setText("查看原图");
            return;
        }
        TextView textView2 = (TextView) _$_findCachedViewById(C2530R.id.mDraggableImageViewViewOriginImage);
        md8.checkExpressionValueIsNotNull(textView2, "mDraggableImageViewViewOriginImage");
        StringBuilder sb = new StringBuilder();
        sb.append("查看原图(");
        Utils utils = Utils.INSTANCE;
        DraggableImageInfo draggableImageInfo2 = this.draggableImageInfo;
        sb.append(utils.formatImageSize(draggableImageInfo2 != null ? draggableImageInfo2.getImageSize() : 0L));
        sb.append(')');
        textView2.setText(sb.toString());
    }

    private final void setViewOriginImageBtnVisible(boolean z) {
        TextView textView = (TextView) _$_findCachedViewById(C2530R.id.mDraggableImageViewViewOriginImage);
        md8.checkExpressionValueIsNotNull(textView, "mDraggableImageViewViewOriginImage");
        textView.setVisibility(z ? 0 : 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Bitmap translateToFixedBitmap(Drawable drawable) {
        float intrinsicWidth = (drawable.getIntrinsicWidth() * 1.0f) / drawable.getIntrinsicHeight();
        int screenWidth = Utils.getScreenWidth();
        int width = getWidth() != 0 ? drawable.getIntrinsicWidth() > getWidth() ? getWidth() : drawable.getIntrinsicWidth() : drawable.getIntrinsicWidth() > screenWidth ? screenWidth : drawable.getIntrinsicWidth();
        if (width <= screenWidth) {
            screenWidth = width;
        }
        int i = (int) ((screenWidth * 1.0f) / intrinsicWidth);
        StringBuilder sb = new StringBuilder();
        sb.append("bpWidth : ");
        sb.append(screenWidth);
        sb.append("  bpHeight : ");
        sb.append(i);
        ComponentCallbacks2C2485a componentCallbacks2C2485a = ComponentCallbacks2C2485a.get(getContext());
        md8.checkExpressionValueIsNotNull(componentCallbacks2C2485a, "Glide.get(context)");
        Bitmap bitmapCreateBitmap = componentCallbacks2C2485a.getBitmapPool().get(screenWidth, i, i > 4000 ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888);
        md8.checkExpressionValueIsNotNull(bitmapCreateBitmap, "Glide.get(context).bitma…onfig.ARGB_8888\n        )");
        if (bitmapCreateBitmap == null) {
            bitmapCreateBitmap = Bitmap.createBitmap(screenWidth, i, Bitmap.Config.ARGB_8888);
            md8.checkExpressionValueIsNotNull(bitmapCreateBitmap, "Bitmap.createBitmap(\n   …g.ARGB_8888\n            )");
        }
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, screenWidth, i);
        drawable.draw(canvas);
        return bitmapCreateBitmap;
    }

    public void _$_clearFindViewByIdCache() {
        HashMap map = this._$_findViewCache;
        if (map != null) {
            map.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }
        View view = (View) this._$_findViewCache.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(i);
        this._$_findViewCache.put(Integer.valueOf(i), viewFindViewById);
        return viewFindViewById;
    }

    public final void closeWithAnimator() {
        DraggableZoomCore draggableZoomCore = this.draggableZoomCore;
        if (draggableZoomCore != null) {
            draggableZoomCore.adjustScaleViewToCorrectLocation();
        }
        DraggableZoomCore draggableZoomCore2 = this.draggableZoomCore;
        if (draggableZoomCore2 != null) {
            draggableZoomCore2.exitWithAnimator(false);
        }
        mf4 mf4Var = this.downloadDisposable;
        if (mf4Var != null) {
            mf4Var.dispose();
        }
    }

    @gib
    public final ActionListener getActionListener() {
        return this.actionListener;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(@yfb MotionEvent motionEvent) {
        DraggableZoomCore draggableZoomCore;
        md8.checkParameterIsNotNull(motionEvent, "ev");
        boolean zOnInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        DraggableZoomCore draggableZoomCore2 = this.draggableZoomCore;
        if (draggableZoomCore2 != null && draggableZoomCore2.isAnimating()) {
            return false;
        }
        PhotoView photoView = (PhotoView) _$_findCachedViewById(C2530R.id.mDraggableImageViewPhotoView);
        md8.checkExpressionValueIsNotNull(photoView, "mDraggableImageViewPhotoView");
        if (photoView.getScale() != 1.0f) {
            return false;
        }
        PhotoView photoView2 = (PhotoView) _$_findCachedViewById(C2530R.id.mDraggableImageViewPhotoView);
        md8.checkExpressionValueIsNotNull(photoView2, "mDraggableImageViewPhotoView");
        if (!photoView2.getAttacher().displyRectIsFromTop()) {
            return false;
        }
        ProgressBar progressBar = (ProgressBar) _$_findCachedViewById(C2530R.id.mDraggableImageViewViewOProgressBar);
        md8.checkExpressionValueIsNotNull(progressBar, "mDraggableImageViewViewOProgressBar");
        if (progressBar.getVisibility() == 0 || (draggableZoomCore = this.draggableZoomCore) == null) {
            return false;
        }
        return draggableZoomCore.onInterceptTouchEvent(zOnInterceptTouchEvent, motionEvent);
    }

    @Override // android.view.View
    public boolean onTouchEvent(@yfb MotionEvent motionEvent) {
        md8.checkParameterIsNotNull(motionEvent, "event");
        DraggableZoomCore draggableZoomCore = this.draggableZoomCore;
        if (draggableZoomCore != null) {
            draggableZoomCore.onTouchEvent(motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setActionListener(@gib ActionListener actionListener) {
        this.actionListener = actionListener;
    }

    public final void showImage(@yfb DraggableImageInfo draggableImageInfo) {
        md8.checkParameterIsNotNull(draggableImageInfo, "paramsInfo");
        this.draggableImageInfo = draggableImageInfo;
        this.currentLoadUrl = "";
        refreshOriginImageInfo();
        GlideHelper glideHelper = GlideHelper.INSTANCE;
        Context context = getContext();
        md8.checkExpressionValueIsNotNull(context, "context");
        glideHelper.retrieveImageWhRadioFromMemoryCache(context, draggableImageInfo.getThumbnailImg(), new C25071(draggableImageInfo));
    }

    public final void showImageWithAnimator(@yfb DraggableImageInfo draggableImageInfo) {
        md8.checkParameterIsNotNull(draggableImageInfo, "paramsInfo");
        this.draggableImageInfo = draggableImageInfo;
        this.currentLoadUrl = "";
        refreshOriginImageInfo();
        GlideHelper glideHelper = GlideHelper.INSTANCE;
        Context context = getContext();
        md8.checkExpressionValueIsNotNull(context, "context");
        glideHelper.retrieveImageWhRadioFromMemoryCache(context, draggableImageInfo.getThumbnailImg(), new C25081(draggableImageInfo));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v6, types: [com.draggable.library.core.DraggableImageView$draggableZoomActionListener$1] */
    /* JADX WARN: Type inference failed for: r2v7, types: [com.draggable.library.core.DraggableImageView$exitAnimatorCallback$1] */
    public DraggableImageView(@yfb Context context, @yfb AttributeSet attributeSet) {
        super(context, attributeSet);
        md8.checkParameterIsNotNull(context, "context");
        md8.checkParameterIsNotNull(attributeSet, "attributeSet");
        this.TAG = DraggableImageView.class.getSimpleName();
        this.currentLoadUrl = "";
        this.needFitCenter = true;
        this.viewSelfWhRadio = 1.0f;
        this.draggableZoomActionListener = new DraggableZoomCore.ActionListener() { // from class: com.draggable.library.core.DraggableImageView$draggableZoomActionListener$1
            @Override // com.draggable.library.core.DraggableZoomCore.ActionListener
            public void currentAlphaValue(int i) {
                this.this$0.setBackground(new ColorDrawable(Color.argb(i, 0, 0, 0)));
            }

            @Override // com.draggable.library.core.DraggableZoomCore.ActionListener
            public void onExit() {
                DraggableImageView.ActionListener actionListener = this.this$0.getActionListener();
                if (actionListener != null) {
                    actionListener.onExit();
                }
            }
        };
        this.exitAnimatorCallback = new DraggableZoomCore.ExitAnimatorCallback() { // from class: com.draggable.library.core.DraggableImageView$exitAnimatorCallback$1
            @Override // com.draggable.library.core.DraggableZoomCore.ExitAnimatorCallback
            public void onStartInitAnimatorParams() {
                PhotoView photoView = (PhotoView) this.this$0._$_findCachedViewById(C2530R.id.mDraggableImageViewPhotoView);
                md8.checkExpressionValueIsNotNull(photoView, "mDraggableImageViewPhotoView");
                photoView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            }
        };
        initView();
    }
}
