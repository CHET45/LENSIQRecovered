package com.eyevue.common.widget.loadmore.footer;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.eyevue.common.C2531R;
import p000.efb;
import p000.ewd;
import p000.g80;
import p000.g92;
import p000.hwd;
import p000.iwd;
import p000.jyf;
import p000.ked;
import p000.yrf;

/* JADX INFO: loaded from: classes4.dex */
public class ClassicsFooter extends ClassicsAbstract<ClassicsFooter> implements ewd {

    /* JADX INFO: renamed from: h2 */
    public static String f18124h2;

    /* JADX INFO: renamed from: i2 */
    public static String f18125i2;

    /* JADX INFO: renamed from: j2 */
    public static String f18126j2;

    /* JADX INFO: renamed from: k2 */
    public static String f18127k2;

    /* JADX INFO: renamed from: l2 */
    public static String f18128l2;

    /* JADX INFO: renamed from: m2 */
    public static String f18129m2;

    /* JADX INFO: renamed from: n2 */
    public static String f18130n2;

    /* JADX INFO: renamed from: Z1 */
    public String f18131Z1;

    /* JADX INFO: renamed from: a2 */
    public String f18132a2;

    /* JADX INFO: renamed from: b2 */
    public String f18133b2;

    /* JADX INFO: renamed from: c2 */
    public String f18134c2;

    /* JADX INFO: renamed from: d2 */
    public String f18135d2;

    /* JADX INFO: renamed from: e2 */
    public String f18136e2;

    /* JADX INFO: renamed from: f2 */
    public String f18137f2;

    /* JADX INFO: renamed from: g2 */
    public boolean f18138g2;

    /* JADX INFO: renamed from: com.eyevue.common.widget.loadmore.footer.ClassicsFooter$a */
    public static /* synthetic */ class C2546a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f18139a;

        static {
            int[] iArr = new int[iwd.values().length];
            f18139a = iArr;
            try {
                iArr[iwd.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18139a[iwd.PullUpToLoad.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18139a[iwd.Loading.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f18139a[iwd.LoadReleased.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f18139a[iwd.ReleaseToLoad.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f18139a[iwd.Refreshing.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public ClassicsFooter(Context context) {
        this(context, null);
    }

    @Override // com.eyevue.common.widget.loadmore.footer.ClassicsAbstract, com.scwang.smart.refresh.layout.simple.SimpleComponent, p000.bwd
    public int onFinish(@efb hwd layout, boolean success) {
        super.onFinish(layout, success);
        if (this.f18138g2) {
            return 0;
        }
        this.f18120d.setText(success ? this.f18135d2 : this.f18136e2);
        return this.f18117N;
    }

    @Override // com.scwang.smart.refresh.layout.simple.SimpleComponent, p000.u4c
    public void onStateChanged(@efb hwd refreshLayout, @efb iwd oldState, @efb iwd newState) {
        ImageView imageView = this.f18121e;
        if (this.f18138g2) {
            return;
        }
        switch (C2546a.f18139a[newState.ordinal()]) {
            case 1:
                imageView.setVisibility(0);
                break;
            case 2:
                break;
            case 3:
            case 4:
                imageView.setVisibility(8);
                this.f18120d.setText(this.f18133b2);
                return;
            case 5:
                this.f18120d.setText(this.f18132a2);
                imageView.animate().rotation(0.0f);
                return;
            case 6:
                this.f18120d.setText(this.f18134c2);
                imageView.setVisibility(8);
                return;
            default:
                return;
        }
        this.f18120d.setText(this.f18131Z1);
        imageView.animate().rotation(180.0f);
    }

    @Override // com.scwang.smart.refresh.layout.simple.SimpleComponent, p000.ewd
    public boolean setNoMoreData(boolean noMoreData) {
        if (this.f18138g2 == noMoreData) {
            return true;
        }
        this.f18138g2 = noMoreData;
        ImageView imageView = this.f18121e;
        if (noMoreData) {
            this.f18120d.setText(this.f18137f2);
            imageView.setVisibility(8);
            return true;
        }
        this.f18120d.setText(this.f18131Z1);
        imageView.setVisibility(0);
        return true;
    }

    @Override // com.eyevue.common.widget.loadmore.footer.ClassicsAbstract, com.scwang.smart.refresh.layout.simple.SimpleComponent, p000.bwd
    @Deprecated
    public void setPrimaryColors(@g92 int... colors) {
        if (this.f24824b == jyf.f52246f) {
            super.setPrimaryColors(colors);
        }
    }

    public ClassicsFooter(Context context, AttributeSet attrs) {
        super(context, attrs, 0);
        this.f18138g2 = false;
        View.inflate(context, C2531R.layout.srl_classics_footer, this);
        ImageView imageView = (ImageView) findViewById(C2531R.id.srl_classics_arrow);
        this.f18121e = imageView;
        ImageView imageView2 = (ImageView) findViewById(C2531R.id.srl_classics_progress);
        this.f18122f = imageView2;
        this.f18120d = (TextView) findViewById(C2531R.id.srl_classics_title);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, C2531R.styleable.ClassicsFooter);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) imageView.getLayoutParams();
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) imageView2.getLayoutParams();
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2531R.styleable.ClassicsFooter_srlDrawableMarginRight, yrf.dp2px(20.0f));
        layoutParams2.rightMargin = dimensionPixelSize;
        layoutParams.rightMargin = dimensionPixelSize;
        layoutParams.width = typedArrayObtainStyledAttributes.getLayoutDimension(C2531R.styleable.ClassicsFooter_srlDrawableArrowSize, layoutParams.width);
        layoutParams.height = typedArrayObtainStyledAttributes.getLayoutDimension(C2531R.styleable.ClassicsFooter_srlDrawableArrowSize, layoutParams.height);
        layoutParams2.width = typedArrayObtainStyledAttributes.getLayoutDimension(C2531R.styleable.ClassicsFooter_srlDrawableProgressSize, layoutParams2.width);
        layoutParams2.height = typedArrayObtainStyledAttributes.getLayoutDimension(C2531R.styleable.ClassicsFooter_srlDrawableProgressSize, layoutParams2.height);
        layoutParams.width = typedArrayObtainStyledAttributes.getLayoutDimension(C2531R.styleable.ClassicsFooter_srlDrawableSize, layoutParams.width);
        layoutParams.height = typedArrayObtainStyledAttributes.getLayoutDimension(C2531R.styleable.ClassicsFooter_srlDrawableSize, layoutParams.height);
        layoutParams2.width = typedArrayObtainStyledAttributes.getLayoutDimension(C2531R.styleable.ClassicsFooter_srlDrawableSize, layoutParams2.width);
        layoutParams2.height = typedArrayObtainStyledAttributes.getLayoutDimension(C2531R.styleable.ClassicsFooter_srlDrawableSize, layoutParams2.height);
        this.f18117N = typedArrayObtainStyledAttributes.getInt(C2531R.styleable.ClassicsFooter_srlFinishDuration, this.f18117N);
        this.f24824b = jyf.f52249i[typedArrayObtainStyledAttributes.getInt(C2531R.styleable.ClassicsFooter_srlClassicsSpinnerStyle, this.f24824b.f52250a)];
        if (typedArrayObtainStyledAttributes.hasValue(C2531R.styleable.ClassicsFooter_srlDrawableArrow)) {
            this.f18121e.setImageDrawable(typedArrayObtainStyledAttributes.getDrawable(C2531R.styleable.ClassicsFooter_srlDrawableArrow));
        } else if (this.f18121e.getDrawable() == null) {
            g80 g80Var = new g80();
            this.f18111C = g80Var;
            g80Var.setColor(-10066330);
            this.f18121e.setImageDrawable(this.f18111C);
        }
        if (typedArrayObtainStyledAttributes.hasValue(C2531R.styleable.ClassicsFooter_srlDrawableProgress)) {
            this.f18122f.setImageDrawable(typedArrayObtainStyledAttributes.getDrawable(C2531R.styleable.ClassicsFooter_srlDrawableProgress));
        } else if (this.f18122f.getDrawable() == null) {
            ked kedVar = new ked();
            this.f18112F = kedVar;
            kedVar.setColor(-10066330);
            this.f18122f.setImageDrawable(this.f18112F);
        }
        if (typedArrayObtainStyledAttributes.hasValue(C2531R.styleable.ClassicsFooter_srlTextSizeTitle)) {
            this.f18120d.setTextSize(0, typedArrayObtainStyledAttributes.getDimensionPixelSize(C2531R.styleable.ClassicsFooter_srlTextSizeTitle, yrf.dp2px(16.0f)));
        }
        if (typedArrayObtainStyledAttributes.hasValue(C2531R.styleable.ClassicsFooter_srlPrimaryColor)) {
            super.setPrimaryColor(typedArrayObtainStyledAttributes.getColor(C2531R.styleable.ClassicsFooter_srlPrimaryColor, 0));
        }
        if (typedArrayObtainStyledAttributes.hasValue(C2531R.styleable.ClassicsFooter_srlAccentColor)) {
            super.setAccentColor(typedArrayObtainStyledAttributes.getColor(C2531R.styleable.ClassicsFooter_srlAccentColor, 0));
        }
        if (typedArrayObtainStyledAttributes.hasValue(C2531R.styleable.ClassicsFooter_srlTextPulling)) {
            this.f18131Z1 = typedArrayObtainStyledAttributes.getString(C2531R.styleable.ClassicsFooter_srlTextPulling);
        } else {
            String str = f18124h2;
            if (str != null) {
                this.f18131Z1 = str;
            } else {
                this.f18131Z1 = context.getString(C2531R.string.eyevue_srl_footer_pulling);
            }
        }
        if (typedArrayObtainStyledAttributes.hasValue(C2531R.styleable.ClassicsFooter_srlTextRelease)) {
            this.f18132a2 = typedArrayObtainStyledAttributes.getString(C2531R.styleable.ClassicsFooter_srlTextRelease);
        } else {
            String str2 = f18125i2;
            if (str2 != null) {
                this.f18132a2 = str2;
            } else {
                this.f18132a2 = context.getString(C2531R.string.eyevue_srl_footer_release);
            }
        }
        if (typedArrayObtainStyledAttributes.hasValue(C2531R.styleable.ClassicsFooter_srlTextLoading)) {
            this.f18133b2 = typedArrayObtainStyledAttributes.getString(C2531R.styleable.ClassicsFooter_srlTextLoading);
        } else {
            String str3 = f18126j2;
            if (str3 != null) {
                this.f18133b2 = str3;
            } else {
                this.f18133b2 = context.getString(C2531R.string.eyevue_srl_footer_loading);
            }
        }
        if (typedArrayObtainStyledAttributes.hasValue(C2531R.styleable.ClassicsFooter_srlTextRefreshing)) {
            this.f18134c2 = typedArrayObtainStyledAttributes.getString(C2531R.styleable.ClassicsFooter_srlTextRefreshing);
        } else {
            String str4 = f18127k2;
            if (str4 != null) {
                this.f18134c2 = str4;
            } else {
                this.f18134c2 = context.getString(C2531R.string.eyevue_srl_footer_refreshing);
            }
        }
        if (typedArrayObtainStyledAttributes.hasValue(C2531R.styleable.ClassicsFooter_srlTextFinish)) {
            this.f18135d2 = typedArrayObtainStyledAttributes.getString(C2531R.styleable.ClassicsFooter_srlTextFinish);
        } else {
            String str5 = f18128l2;
            if (str5 != null) {
                this.f18135d2 = str5;
            } else {
                this.f18135d2 = context.getString(C2531R.string.eyevue_srl_footer_finish);
            }
        }
        if (typedArrayObtainStyledAttributes.hasValue(C2531R.styleable.ClassicsFooter_srlTextFailed)) {
            this.f18136e2 = typedArrayObtainStyledAttributes.getString(C2531R.styleable.ClassicsFooter_srlTextFailed);
        } else {
            String str6 = f18129m2;
            if (str6 != null) {
                this.f18136e2 = str6;
            } else {
                this.f18136e2 = context.getString(C2531R.string.eyevue_srl_footer_failed);
            }
        }
        if (typedArrayObtainStyledAttributes.hasValue(C2531R.styleable.ClassicsFooter_srlTextNothing)) {
            this.f18137f2 = typedArrayObtainStyledAttributes.getString(C2531R.styleable.ClassicsFooter_srlTextNothing);
        } else {
            String str7 = f18130n2;
            if (str7 != null) {
                this.f18137f2 = str7;
            } else {
                this.f18137f2 = context.getString(C2531R.string.eyevue_srl_footer_nothing);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        imageView2.animate().setInterpolator(null);
        this.f18120d.setText(isInEditMode() ? this.f18133b2 : this.f18131Z1);
        if (isInEditMode()) {
            imageView.setVisibility(8);
        } else {
            imageView2.setVisibility(8);
        }
    }
}
