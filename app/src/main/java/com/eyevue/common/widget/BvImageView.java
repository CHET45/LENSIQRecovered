package com.eyevue.common.widget;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ImageView;
import com.blankj.utilcode.util.C2473f;
import com.bumptech.glide.ComponentCallbacks2C2485a;
import com.bumptech.glide.request.RequestOptions;
import com.eyevue.common.C2531R;
import java.util.Random;
import p000.bce;
import p000.c1i;
import p000.cu0;
import p000.g3b;
import p000.hib;
import p000.igg;
import p000.in4;
import p000.k1i;
import p000.xz1;

/* JADX INFO: loaded from: classes4.dex */
@igg({"AppCompatCustomView"})
public class BvImageView extends ImageView {

    /* JADX INFO: renamed from: m */
    public static final String f17921m = "BvImageView";

    /* JADX INFO: renamed from: a */
    public boolean f17922a;

    /* JADX INFO: renamed from: b */
    public boolean f17923b;

    /* JADX INFO: renamed from: c */
    public int f17924c;

    /* JADX INFO: renamed from: d */
    public Drawable f17925d;

    /* JADX INFO: renamed from: e */
    public Rect f17926e;

    /* JADX INFO: renamed from: f */
    public final RequestOptions f17927f;

    public BvImageView(Context context) {
        super(context);
        this.f17922a = false;
        this.f17923b = true;
        this.f17924c = 10;
        this.f17927f = new RequestOptions().set(in4.f47584k, Boolean.TRUE);
        init();
    }

    private GradientDrawable buildDrawable(float radius) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(radius);
        gradientDrawable.setStroke(c1i.dip2px(1), c1i.getColor(C2531R.color.image_stroke_color));
        gradientDrawable.setColor(0);
        return gradientDrawable;
    }

    private void changeLight(ImageView imageview, int brightness) {
        ColorMatrix colorMatrix = new ColorMatrix();
        float f = brightness;
        colorMatrix.set(new float[]{1.0f, 0.0f, 0.0f, 0.0f, f, 0.0f, 1.0f, 0.0f, 0.0f, f, 0.0f, 0.0f, 1.0f, 0.0f, f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
        imageview.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
    }

    private Context getLoadScopeContext() {
        Context context = getContext();
        return ((context instanceof Activity) && ((Activity) context).isDestroyed()) ? k1i.getAppContext() : context;
    }

    private void init() {
        if (this.f17922a) {
            this.f17925d = buildDrawable(c1i.dip2px(this.f17924c));
        }
    }

    private void initAttributeSet(AttributeSet attrs) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attrs, C2531R.styleable.BvImageView);
        this.f17922a = typedArrayObtainStyledAttributes.getBoolean(C2531R.styleable.BvImageView_isShowBorder, false);
        this.f17924c = typedArrayObtainStyledAttributes.getInteger(C2531R.styleable.BvImageView_cornersRadius, this.f17924c);
        typedArrayObtainStyledAttributes.recycle();
    }

    public GradientDrawable buildRandomDrawable() {
        Random random = new Random();
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(Color.argb(255, random.nextInt(256), random.nextInt(256), random.nextInt(256)));
        gradientDrawable.setCornerRadius(c1i.dip2px(this.f17924c));
        gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
        gradientDrawable.setAlpha(30);
        return gradientDrawable;
    }

    public void disablePressSelector(boolean disable) {
        this.f17923b = disable;
    }

    @Override // android.view.View
    public void dispatchSetPressed(boolean pressed) {
        if (this.f17923b) {
            return;
        }
        if (pressed) {
            changeLight(this, -80);
        } else {
            setColorFilter((ColorFilter) null);
        }
        super.dispatchSetPressed(pressed);
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent event) {
        return super.dispatchTouchEvent(event);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f17922a) {
            if (this.f17926e == null && this.f17925d != null) {
                Rect rect = new Rect(0, 0, getWidth(), getHeight());
                this.f17926e = rect;
                this.f17925d.setBounds(rect);
            }
            Drawable drawable = this.f17925d;
            if (drawable != null) {
                drawable.draw(canvas);
            }
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        return super.onTouchEvent(event);
    }

    public void showFullImg(String url, int defaultImgResId) {
        try {
            ComponentCallbacks2C2485a.with(getLoadScopeContext()).load(url).error(defaultImgResId).apply((cu0<?>) this.f17927f).placeholder(defaultImgResId).skipMemoryCache(true).into(this);
        } catch (Exception e) {
            C2473f.m4168e(f17921m, "showFullRoundImg Exception:", e);
        }
    }

    public void showHomeImg(String url) {
        try {
            ComponentCallbacks2C2485a.with(getLoadScopeContext()).load(url).centerCrop().apply((cu0<?>) this.f17927f).placeholder(C2531R.drawable.ic_default_icon).skipMemoryCache(true).into(this);
        } catch (Exception e) {
            C2473f.m4168e(f17921m, "showRoundImg Exception:", e);
        }
    }

    public void showImg(String url) {
        try {
            ComponentCallbacks2C2485a.with(getLoadScopeContext()).load(url).centerCrop().apply((cu0<?>) this.f17927f).into(this);
        } catch (Exception e) {
            C2473f.m4168e(f17921m, "showRoundImg Exception:", e);
        }
    }

    public void showImgWithRadius(String url, int radius) {
        try {
            ComponentCallbacks2C2485a.with(getLoadScopeContext()).load(url).placeholder(C2531R.drawable.dialog_bg).error(C2531R.drawable.dialog_bg).apply((cu0<?>) RequestOptions.bitmapTransform(new g3b(new bce(c1i.dip2px(radius), 0, bce.EnumC1832b.ALL)))).dontAnimate().into(this);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void showMusicBg(String url) {
        showMusicBg(url, null);
    }

    public void showRoundHeadImg(String url, int defaultImgResId) {
        try {
            ComponentCallbacks2C2485a.with(getLoadScopeContext()).load(url).error(defaultImgResId).apply((cu0<?>) RequestOptions.bitmapTransform(new xz1())).placeholder(defaultImgResId).into(this);
        } catch (Exception e) {
            C2473f.m4168e(f17921m, "showRoundImg Exception:", e);
        }
    }

    public void showRoundImg(String url) {
        try {
            ComponentCallbacks2C2485a.with(getLoadScopeContext()).load(url).error(C2531R.drawable.dialog_bg).apply((cu0<?>) RequestOptions.bitmapTransform(new g3b(new bce(c1i.dip2px(this.f17924c), 0, bce.EnumC1832b.ALL)))).placeholder(C2531R.drawable.dialog_bg).into(this);
        } catch (Exception e) {
            C2473f.m4168e(f17921m, "showRoundImg Exception:", e);
        }
    }

    public void showMusicBg(String url, GradientDrawable drawable) {
        try {
            g3b g3bVar = new g3b(new bce(c1i.dip2px(this.f17924c), 0, bce.EnumC1832b.ALL));
            if (drawable == null) {
                drawable = buildRandomDrawable();
            }
            ComponentCallbacks2C2485a.with(getLoadScopeContext()).load(url).error((Drawable) drawable).apply((cu0<?>) RequestOptions.bitmapTransform(g3bVar)).placeholder(drawable).into(this);
        } catch (Exception e) {
            C2473f.m4168e(f17921m, "showRoundImg Exception:", e);
        }
    }

    public BvImageView(Context context, @hib AttributeSet attrs) {
        super(context, attrs);
        this.f17922a = false;
        this.f17923b = true;
        this.f17924c = 10;
        this.f17927f = new RequestOptions().set(in4.f47584k, Boolean.TRUE);
        initAttributeSet(attrs);
        init();
    }

    public void showImg(String url, int defaultImgResId) {
        try {
            ComponentCallbacks2C2485a.with(getLoadScopeContext()).load(url).error(defaultImgResId).apply((cu0<?>) RequestOptions.bitmapTransform(new g3b(new bce(c1i.dip2px(this.f17924c), 0, bce.EnumC1832b.ALL)))).placeholder(defaultImgResId).into(this);
        } catch (Exception e) {
            C2473f.m4168e(f17921m, "showRoundImg Exception:", e);
        }
    }

    public BvImageView(Context context, @hib AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f17922a = false;
        this.f17923b = true;
        this.f17924c = 10;
        this.f17927f = new RequestOptions().set(in4.f47584k, Boolean.TRUE);
        initAttributeSet(attrs);
        init();
    }

    public void showImg(String url, int defaultImgResId, int radius) {
        try {
            ComponentCallbacks2C2485a.with(getLoadScopeContext()).load(url).error(defaultImgResId).apply((cu0<?>) RequestOptions.bitmapTransform(new g3b(new bce(c1i.dip2px(radius), 0, bce.EnumC1832b.ALL)))).placeholder(defaultImgResId).into(this);
        } catch (Exception e) {
            C2473f.m4168e(f17921m, "showRoundImg Exception:", e);
        }
    }

    public BvImageView(Context context, @hib AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        this.f17922a = false;
        this.f17923b = true;
        this.f17924c = 10;
        this.f17927f = new RequestOptions().set(in4.f47584k, Boolean.TRUE);
        initAttributeSet(attrs);
        init();
    }
}
