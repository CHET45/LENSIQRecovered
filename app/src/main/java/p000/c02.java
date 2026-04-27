package p000;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.animation.Animation;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes3.dex */
public class c02 extends ImageView {

    /* JADX INFO: renamed from: C */
    public static final int f15410C = 4;

    /* JADX INFO: renamed from: c */
    public static final int f15411c = 503316480;

    /* JADX INFO: renamed from: d */
    public static final int f15412d = 1023410176;

    /* JADX INFO: renamed from: e */
    public static final float f15413e = 0.0f;

    /* JADX INFO: renamed from: f */
    public static final float f15414f = 1.75f;

    /* JADX INFO: renamed from: m */
    public static final float f15415m = 3.5f;

    /* JADX INFO: renamed from: a */
    public Animation.AnimationListener f15416a;

    /* JADX INFO: renamed from: b */
    public int f15417b;

    /* JADX INFO: renamed from: c02$a */
    public class C2136a extends OvalShape {

        /* JADX INFO: renamed from: a */
        public RadialGradient f15418a;

        /* JADX INFO: renamed from: b */
        public Paint f15419b = new Paint();

        public C2136a(int i) {
            c02.this.f15417b = i;
            updateRadialGradient((int) rect().width());
        }

        private void updateRadialGradient(int i) {
            float f = i / 2;
            RadialGradient radialGradient = new RadialGradient(f, f, c02.this.f15417b, new int[]{1023410176, 0}, (float[]) null, Shader.TileMode.CLAMP);
            this.f15418a = radialGradient;
            this.f15419b.setShader(radialGradient);
        }

        @Override // android.graphics.drawable.shapes.OvalShape, android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
        public void draw(Canvas canvas, Paint paint) {
            float width = c02.this.getWidth() / 2;
            float height = c02.this.getHeight() / 2;
            canvas.drawCircle(width, height, width, this.f15419b);
            canvas.drawCircle(width, height, r0 - c02.this.f15417b, paint);
        }

        @Override // android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
        public void onResize(float f, float f2) {
            super.onResize(f, f2);
            updateRadialGradient((int) f);
        }
    }

    public c02(Context context, int i) {
        ShapeDrawable shapeDrawable;
        super(context);
        float f = getContext().getResources().getDisplayMetrics().density;
        int i2 = (int) (1.75f * f);
        int i3 = (int) (0.0f * f);
        this.f15417b = (int) (3.5f * f);
        if (elevationSupported()) {
            shapeDrawable = new ShapeDrawable(new OvalShape());
            o8i.setElevation(this, f * 4.0f);
        } else {
            ShapeDrawable shapeDrawable2 = new ShapeDrawable(new C2136a(this.f15417b));
            setLayerType(1, shapeDrawable2.getPaint());
            shapeDrawable2.getPaint().setShadowLayer(this.f15417b, i3, i2, 503316480);
            int i4 = this.f15417b;
            setPadding(i4, i4, i4, i4);
            shapeDrawable = shapeDrawable2;
        }
        shapeDrawable.getPaint().setColor(i);
        o8i.setBackground(this, shapeDrawable);
    }

    private boolean elevationSupported() {
        return true;
    }

    @Override // android.view.View
    public void onAnimationEnd() {
        super.onAnimationEnd();
        Animation.AnimationListener animationListener = this.f15416a;
        if (animationListener != null) {
            animationListener.onAnimationEnd(getAnimation());
        }
    }

    @Override // android.view.View
    public void onAnimationStart() {
        super.onAnimationStart();
        Animation.AnimationListener animationListener = this.f15416a;
        if (animationListener != null) {
            animationListener.onAnimationStart(getAnimation());
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (elevationSupported()) {
            return;
        }
        setMeasuredDimension(getMeasuredWidth() + (this.f15417b * 2), getMeasuredHeight() + (this.f15417b * 2));
    }

    public void setAnimationListener(Animation.AnimationListener animationListener) {
        this.f15416a = animationListener;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i);
        }
    }

    public void setBackgroundColorRes(int i) {
        setBackgroundColor(lx2.getColor(getContext(), i));
    }
}
