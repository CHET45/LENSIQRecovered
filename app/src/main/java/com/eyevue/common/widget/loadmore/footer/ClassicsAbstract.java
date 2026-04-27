package com.eyevue.common.widget.loadmore.footer;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.eyevue.common.widget.loadmore.footer.ClassicsAbstract;
import com.scwang.smart.refresh.layout.simple.SimpleComponent;
import p000.bwd;
import p000.efb;
import p000.g92;
import p000.gq4;
import p000.gwd;
import p000.hwd;
import p000.jyf;
import p000.kcc;
import p000.lx2;
import p000.w92;
import p000.yrf;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ClassicsAbstract<T extends ClassicsAbstract<?>> extends SimpleComponent implements bwd {

    /* JADX INFO: renamed from: C */
    public kcc f18111C;

    /* JADX INFO: renamed from: F */
    public kcc f18112F;

    /* JADX INFO: renamed from: H */
    public boolean f18113H;

    /* JADX INFO: renamed from: L */
    public boolean f18114L;

    /* JADX INFO: renamed from: M */
    public int f18115M;

    /* JADX INFO: renamed from: M1 */
    public int f18116M1;

    /* JADX INFO: renamed from: N */
    public int f18117N;

    /* JADX INFO: renamed from: Q */
    public int f18118Q;

    /* JADX INFO: renamed from: V1 */
    public int f18119V1;

    /* JADX INFO: renamed from: d */
    public TextView f18120d;

    /* JADX INFO: renamed from: e */
    public ImageView f18121e;

    /* JADX INFO: renamed from: f */
    public ImageView f18122f;

    /* JADX INFO: renamed from: m */
    public gwd f18123m;

    public ClassicsAbstract(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f18117N = 500;
        this.f18118Q = 20;
        this.f18116M1 = 20;
        this.f18119V1 = 0;
        this.f24824b = jyf.f52244d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public T m4427a() {
        return this;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ImageView imageView = this.f18121e;
        ImageView imageView2 = this.f18122f;
        imageView.animate().cancel();
        imageView2.animate().cancel();
        Object drawable = this.f18122f.getDrawable();
        if (drawable instanceof Animatable) {
            Animatable animatable = (Animatable) drawable;
            if (animatable.isRunning()) {
                animatable.stop();
            }
        }
    }

    @Override // com.scwang.smart.refresh.layout.simple.SimpleComponent, p000.bwd
    public int onFinish(@efb hwd refreshLayout, boolean success) {
        ImageView imageView = this.f18122f;
        Object drawable = imageView.getDrawable();
        if (drawable instanceof Animatable) {
            Animatable animatable = (Animatable) drawable;
            if (animatable.isRunning()) {
                animatable.stop();
            }
        } else {
            imageView.animate().rotation(0.0f).setDuration(0L);
        }
        imageView.setVisibility(8);
        return this.f18117N;
    }

    @Override // com.scwang.smart.refresh.layout.simple.SimpleComponent, p000.bwd
    public void onInitialized(@efb gwd kernel, int height, int maxDragHeight) {
        this.f18123m = kernel;
        kernel.requestDrawBackgroundFor(this, this.f18115M);
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (this.f18119V1 == 0) {
            this.f18118Q = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            this.f18116M1 = paddingBottom;
            if (this.f18118Q == 0 || paddingBottom == 0) {
                int paddingLeft = getPaddingLeft();
                int paddingRight = getPaddingRight();
                int iDp2px = this.f18118Q;
                if (iDp2px == 0) {
                    iDp2px = yrf.dp2px(20.0f);
                }
                this.f18118Q = iDp2px;
                int iDp2px2 = this.f18116M1;
                if (iDp2px2 == 0) {
                    iDp2px2 = yrf.dp2px(20.0f);
                }
                this.f18116M1 = iDp2px2;
                setPadding(paddingLeft, this.f18118Q, paddingRight, iDp2px2);
            }
            setClipToPadding(false);
        }
        if (View.MeasureSpec.getMode(heightMeasureSpec) == 1073741824) {
            int size = View.MeasureSpec.getSize(heightMeasureSpec);
            int i = this.f18119V1;
            if (size < i) {
                int i2 = (size - i) / 2;
                setPadding(getPaddingLeft(), i2, getPaddingRight(), i2);
            } else {
                setPadding(getPaddingLeft(), 0, getPaddingRight(), 0);
            }
        } else {
            setPadding(getPaddingLeft(), this.f18118Q, getPaddingRight(), this.f18116M1);
        }
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        if (this.f18119V1 == 0) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                int measuredHeight = getChildAt(i3).getMeasuredHeight();
                if (this.f18119V1 < measuredHeight) {
                    this.f18119V1 = measuredHeight;
                }
            }
        }
    }

    @Override // com.scwang.smart.refresh.layout.simple.SimpleComponent, p000.bwd
    public void onReleased(@efb hwd refreshLayout, int height, int maxDragHeight) {
        onStartAnimator(refreshLayout, height, maxDragHeight);
    }

    @Override // com.scwang.smart.refresh.layout.simple.SimpleComponent, p000.bwd
    public void onStartAnimator(@efb hwd refreshLayout, int height, int maxDragHeight) {
        ImageView imageView = this.f18122f;
        if (imageView.getVisibility() != 0) {
            imageView.setVisibility(0);
            Object drawable = this.f18122f.getDrawable();
            if (drawable instanceof Animatable) {
                ((Animatable) drawable).start();
            } else {
                imageView.animate().rotation(36000.0f).setDuration(100000L);
            }
        }
    }

    public T setAccentColor(@g92 int i) {
        this.f18113H = true;
        this.f18120d.setTextColor(i);
        kcc kccVar = this.f18111C;
        if (kccVar != null) {
            kccVar.setColor(i);
            this.f18121e.invalidateDrawable(this.f18111C);
        }
        kcc kccVar2 = this.f18112F;
        if (kccVar2 != null) {
            kccVar2.setColor(i);
            this.f18122f.invalidateDrawable(this.f18112F);
        }
        return (T) m4427a();
    }

    public T setAccentColorId(@w92 int i) {
        setAccentColor(lx2.getColor(getContext(), i));
        return (T) m4427a();
    }

    public T setArrowBitmap(Bitmap bitmap) {
        this.f18111C = null;
        this.f18121e.setImageBitmap(bitmap);
        return (T) m4427a();
    }

    public T setArrowDrawable(Drawable drawable) {
        this.f18111C = null;
        this.f18121e.setImageDrawable(drawable);
        return (T) m4427a();
    }

    public T setArrowResource(@gq4 int i) {
        this.f18111C = null;
        this.f18121e.setImageResource(i);
        return (T) m4427a();
    }

    public T setDrawableArrowSize(float f) {
        ImageView imageView = this.f18121e;
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        int iDp2px = yrf.dp2px(f);
        layoutParams.width = iDp2px;
        layoutParams.height = iDp2px;
        imageView.setLayoutParams(layoutParams);
        return (T) m4427a();
    }

    public T setDrawableArrowSizePx(int i) {
        ViewGroup.LayoutParams layoutParams = this.f18121e.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i;
        this.f18121e.setLayoutParams(layoutParams);
        return (T) m4427a();
    }

    public T setDrawableMarginRight(float f) {
        ImageView imageView = this.f18121e;
        ImageView imageView2 = this.f18122f;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) imageView2.getLayoutParams();
        int iDp2px = yrf.dp2px(f);
        marginLayoutParams2.rightMargin = iDp2px;
        marginLayoutParams.rightMargin = iDp2px;
        imageView.setLayoutParams(marginLayoutParams);
        imageView2.setLayoutParams(marginLayoutParams2);
        return (T) m4427a();
    }

    public T setDrawableMarginRightPx(int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f18121e.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f18122f.getLayoutParams();
        marginLayoutParams2.rightMargin = i;
        marginLayoutParams.rightMargin = i;
        this.f18121e.setLayoutParams(marginLayoutParams);
        this.f18122f.setLayoutParams(marginLayoutParams2);
        return (T) m4427a();
    }

    public T setDrawableProgressSize(float f) {
        ImageView imageView = this.f18122f;
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        int iDp2px = yrf.dp2px(f);
        layoutParams.width = iDp2px;
        layoutParams.height = iDp2px;
        imageView.setLayoutParams(layoutParams);
        return (T) m4427a();
    }

    public T setDrawableProgressSizePx(int i) {
        ViewGroup.LayoutParams layoutParams = this.f18122f.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i;
        this.f18122f.setLayoutParams(layoutParams);
        return (T) m4427a();
    }

    public T setDrawableSize(float f) {
        ImageView imageView = this.f18121e;
        ImageView imageView2 = this.f18122f;
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        ViewGroup.LayoutParams layoutParams2 = imageView2.getLayoutParams();
        int iDp2px = yrf.dp2px(f);
        layoutParams2.width = iDp2px;
        layoutParams.width = iDp2px;
        int iDp2px2 = yrf.dp2px(f);
        layoutParams2.height = iDp2px2;
        layoutParams.height = iDp2px2;
        imageView.setLayoutParams(layoutParams);
        imageView2.setLayoutParams(layoutParams2);
        return (T) m4427a();
    }

    public T setDrawableSizePx(int i) {
        ViewGroup.LayoutParams layoutParams = this.f18121e.getLayoutParams();
        ViewGroup.LayoutParams layoutParams2 = this.f18122f.getLayoutParams();
        layoutParams2.width = i;
        layoutParams.width = i;
        layoutParams2.height = i;
        layoutParams.height = i;
        this.f18121e.setLayoutParams(layoutParams);
        this.f18122f.setLayoutParams(layoutParams2);
        return (T) m4427a();
    }

    public T setFinishDuration(int i) {
        this.f18117N = i;
        return (T) m4427a();
    }

    public T setPrimaryColor(@g92 int i) {
        this.f18114L = true;
        this.f18115M = i;
        gwd gwdVar = this.f18123m;
        if (gwdVar != null) {
            gwdVar.requestDrawBackgroundFor(this, i);
        }
        return (T) m4427a();
    }

    public T setPrimaryColorId(@w92 int i) {
        setPrimaryColor(lx2.getColor(getContext(), i));
        return (T) m4427a();
    }

    @Override // com.scwang.smart.refresh.layout.simple.SimpleComponent, p000.bwd
    public void setPrimaryColors(@g92 int... colors) {
        if (colors.length > 0) {
            if (!(getBackground() instanceof BitmapDrawable) && !this.f18114L) {
                setPrimaryColor(colors[0]);
                this.f18114L = false;
            }
            if (this.f18113H) {
                return;
            }
            if (colors.length > 1) {
                setAccentColor(colors[1]);
            }
            this.f18113H = false;
        }
    }

    public T setProgressBitmap(Bitmap bitmap) {
        this.f18112F = null;
        this.f18122f.setImageBitmap(bitmap);
        return (T) m4427a();
    }

    public T setProgressDrawable(Drawable drawable) {
        this.f18112F = null;
        this.f18122f.setImageDrawable(drawable);
        return (T) m4427a();
    }

    public T setProgressResource(@gq4 int i) {
        this.f18112F = null;
        this.f18122f.setImageResource(i);
        return (T) m4427a();
    }

    public T setSpinnerStyle(jyf jyfVar) {
        this.f24824b = jyfVar;
        return (T) m4427a();
    }

    public T setTextSizeTitle(float f) {
        this.f18120d.setTextSize(f);
        gwd gwdVar = this.f18123m;
        if (gwdVar != null) {
            gwdVar.requestRemeasureHeightFor(this);
        }
        return (T) m4427a();
    }

    public T setTextSizeTitle(int i, float f) {
        this.f18120d.setTextSize(i, f);
        gwd gwdVar = this.f18123m;
        if (gwdVar != null) {
            gwdVar.requestRemeasureHeightFor(this);
        }
        return (T) m4427a();
    }
}
