package com.eyevue.common.widget.bottomnav;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.eyevue.common.C2531R;
import java.util.Locale;
import p000.c1i;
import p000.efb;
import p000.hib;

/* JADX INFO: loaded from: classes4.dex */
public class BottomBarItem extends LinearLayout {

    /* JADX INFO: renamed from: C */
    public int f18044C;

    /* JADX INFO: renamed from: F */
    public int f18045F;

    /* JADX INFO: renamed from: H */
    public boolean f18046H;

    /* JADX INFO: renamed from: L */
    public Drawable f18047L;

    /* JADX INFO: renamed from: M */
    public int f18048M;

    /* JADX INFO: renamed from: M1 */
    public int f18049M1;

    /* JADX INFO: renamed from: N */
    public int f18050N;

    /* JADX INFO: renamed from: Q */
    public int f18051Q;

    /* JADX INFO: renamed from: V1 */
    public int f18052V1;

    /* JADX INFO: renamed from: Z1 */
    public int f18053Z1;

    /* JADX INFO: renamed from: a */
    public Context f18054a;

    /* JADX INFO: renamed from: a2 */
    public Drawable f18055a2;

    /* JADX INFO: renamed from: b */
    public Drawable f18056b;

    /* JADX INFO: renamed from: b2 */
    public int f18057b2;

    /* JADX INFO: renamed from: c */
    public Drawable f18058c;

    /* JADX INFO: renamed from: c2 */
    public int f18059c2;

    /* JADX INFO: renamed from: d */
    public String f18060d;

    /* JADX INFO: renamed from: d2 */
    public Drawable f18061d2;

    /* JADX INFO: renamed from: e */
    public boolean f18062e;

    /* JADX INFO: renamed from: e2 */
    public Drawable f18063e2;

    /* JADX INFO: renamed from: f */
    public int f18064f;

    /* JADX INFO: renamed from: f2 */
    public String f18065f2;

    /* JADX INFO: renamed from: g2 */
    public boolean f18066g2;

    /* JADX INFO: renamed from: h2 */
    public ImageView f18067h2;

    /* JADX INFO: renamed from: i2 */
    public LottieAnimationView f18068i2;

    /* JADX INFO: renamed from: j2 */
    public TextView f18069j2;

    /* JADX INFO: renamed from: k2 */
    public TextView f18070k2;

    /* JADX INFO: renamed from: l2 */
    public TextView f18071l2;

    /* JADX INFO: renamed from: m */
    public int f18072m;

    /* JADX INFO: renamed from: m2 */
    public TextView f18073m2;

    /* JADX INFO: renamed from: com.eyevue.common.widget.bottomnav.BottomBarItem$a */
    public static final class C2543a {

        /* JADX INFO: renamed from: a */
        public final Context f18074a;

        /* JADX INFO: renamed from: b */
        public Drawable f18075b;

        /* JADX INFO: renamed from: c */
        public Drawable f18076c;

        /* JADX INFO: renamed from: d */
        public String f18077d;

        /* JADX INFO: renamed from: f */
        public int f18079f;

        /* JADX INFO: renamed from: i */
        public int f18082i;

        /* JADX INFO: renamed from: j */
        public boolean f18083j;

        /* JADX INFO: renamed from: k */
        public Drawable f18084k;

        /* JADX INFO: renamed from: l */
        public int f18085l;

        /* JADX INFO: renamed from: m */
        public int f18086m;

        /* JADX INFO: renamed from: n */
        public int f18087n;

        /* JADX INFO: renamed from: o */
        public int f18088o;

        /* JADX INFO: renamed from: r */
        public Drawable f18091r;

        /* JADX INFO: renamed from: s */
        public int f18092s;

        /* JADX INFO: renamed from: u */
        public Drawable f18094u;

        /* JADX INFO: renamed from: v */
        public Drawable f18095v;

        /* JADX INFO: renamed from: w */
        public String f18096w;

        /* JADX INFO: renamed from: e */
        public boolean f18078e = false;

        /* JADX INFO: renamed from: g */
        public int f18080g = getColor(C2531R.color.base_tab_text_99999);

        /* JADX INFO: renamed from: h */
        public int f18081h = getColor(C2531R.color.base_common_red);

        /* JADX INFO: renamed from: q */
        public int f18090q = getColor(C2531R.color.base_common_white);

        /* JADX INFO: renamed from: p */
        public int f18089p = 99;

        /* JADX INFO: renamed from: t */
        public int f18093t = getColor(C2531R.color.base_common_white);

        public C2543a(Context context) {
            this.f18074a = context;
            this.f18079f = c1i.sp2px(context, 12.0f);
            this.f18088o = c1i.sp2px(context, 10.0f);
            this.f18092s = c1i.sp2px(context, 6.0f);
        }

        private int getColor(int colorId) {
            return this.f18074a.getResources().getColor(colorId);
        }

        public BottomBarItem create(Drawable normalIcon, Drawable selectedIcon, String text) {
            this.f18075b = normalIcon;
            this.f18076c = selectedIcon;
            this.f18077d = text;
            return new BottomBarItem(this.f18074a).create(this);
        }

        public C2543a iconHeight(int iconHeight) {
            this.f18086m = iconHeight;
            return this;
        }

        public C2543a iconWidth(int iconWidth) {
            this.f18085l = iconWidth;
            return this;
        }

        public C2543a itemPadding(int itemPadding) {
            this.f18087n = itemPadding;
            return this;
        }

        public C2543a lottieJson(String lottieJson) {
            this.f18096w = lottieJson;
            return this;
        }

        public C2543a marginTop(int marginTop) {
            this.f18082i = marginTop;
            return this;
        }

        public C2543a msgTextBg(Drawable msgTextBg) {
            this.f18094u = msgTextBg;
            return this;
        }

        public C2543a msgTextColor(int msgTextColor) {
            this.f18093t = getColor(msgTextColor);
            return this;
        }

        public C2543a msgTextSize(int msgTextSize) {
            this.f18092s = c1i.sp2px(this.f18074a, msgTextSize);
            return this;
        }

        public C2543a normalIcon(Drawable normalIcon) {
            this.f18075b = normalIcon;
            return this;
        }

        public C2543a notifyPointBg(Drawable notifyPointBg) {
            this.f18095v = notifyPointBg;
            return this;
        }

        public C2543a openTouchBg(boolean openTouchBg) {
            this.f18083j = openTouchBg;
            return this;
        }

        public C2543a selectedIcon(Drawable selectedIcon) {
            this.f18076c = selectedIcon;
            return this;
        }

        public C2543a title(int titleId) {
            this.f18077d = this.f18074a.getString(titleId);
            return this;
        }

        public C2543a titleNormalColor(int titleNormalColor) {
            this.f18080g = getColor(titleNormalColor);
            return this;
        }

        public C2543a titleSelectedColor(int titleSelectedColor) {
            this.f18081h = getColor(titleSelectedColor);
            return this;
        }

        public C2543a titleTextBold(boolean titleTextBold) {
            this.f18078e = titleTextBold;
            return this;
        }

        public C2543a titleTextSize(int titleTextSize) {
            this.f18079f = c1i.sp2px(this.f18074a, titleTextSize);
            return this;
        }

        public C2543a touchDrawable(Drawable touchDrawable) {
            this.f18084k = touchDrawable;
            return this;
        }

        public C2543a unreadNumThreshold(int unreadNumThreshold) {
            this.f18089p = unreadNumThreshold;
            return this;
        }

        public C2543a unreadTextBg(Drawable unreadTextBg) {
            this.f18091r = unreadTextBg;
            return this;
        }

        public C2543a unreadTextColor(int unreadTextColor) {
            this.f18090q = getColor(unreadTextColor);
            return this;
        }

        public C2543a unreadTextSize(int unreadTextSize) {
            this.f18088o = c1i.sp2px(this.f18074a, unreadTextSize);
            return this;
        }

        public C2543a title(String title) {
            this.f18077d = title;
            return this;
        }

        public BottomBarItem create(int normalIconId, int selectedIconId, String text) {
            return create(c1i.getDrawable(this.f18074a, normalIconId), c1i.getDrawable(this.f18074a, selectedIconId), text);
        }
    }

    public BottomBarItem(Context context) {
        super(context);
        this.f18062e = false;
        this.f18064f = 12;
        this.f18045F = 0;
        this.f18046H = false;
        this.f18049M1 = 10;
        this.f18052V1 = 99;
        this.f18057b2 = 6;
    }

    private void checkValues() {
        boolean z = this.f18066g2;
        if (!z && this.f18056b == null) {
            throw new IllegalStateException("You have not set the normal icon");
        }
        if (!z && this.f18058c == null) {
            throw new IllegalStateException("You have not set the selected icon");
        }
        if (this.f18046H && this.f18047L == null) {
            throw new IllegalStateException("Touch effect is turned on, but touchDrawable is not specified");
        }
        if (this.f18055a2 == null) {
            this.f18055a2 = getResources().getDrawable(C2531R.drawable.base_shape_unread, null);
        }
        if (this.f18061d2 == null) {
            this.f18061d2 = getResources().getDrawable(C2531R.drawable.base_shape_msg, null);
        }
        if (this.f18063e2 == null) {
            this.f18063e2 = getResources().getDrawable(C2531R.drawable.base_shape_notify_point, null);
        }
    }

    private void init() {
        int i;
        setOrientation(1);
        setGravity(17);
        View viewInitView = initView();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f18067h2.getLayoutParams();
        int i2 = this.f18048M;
        if (i2 != 0 && (i = this.f18050N) != 0) {
            layoutParams.width = i2;
            layoutParams.height = i;
        }
        if (this.f18066g2) {
            this.f18068i2.setLayoutParams(layoutParams);
            this.f18068i2.setAnimation(this.f18065f2);
            this.f18068i2.setRepeatCount(0);
        } else {
            this.f18067h2.setImageDrawable(this.f18056b);
            this.f18067h2.setLayoutParams(layoutParams);
        }
        this.f18073m2.setTextSize(0, this.f18064f);
        this.f18073m2.getPaint().setFakeBoldText(this.f18062e);
        this.f18069j2.setTextSize(0, this.f18049M1);
        this.f18069j2.setTextColor(this.f18053Z1);
        this.f18069j2.setBackground(this.f18055a2);
        this.f18071l2.setTextSize(0, this.f18057b2);
        this.f18071l2.setTextColor(this.f18059c2);
        this.f18071l2.setBackground(this.f18061d2);
        this.f18070k2.setBackground(this.f18063e2);
        this.f18073m2.setTextColor(this.f18072m);
        this.f18073m2.setText(this.f18060d);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f18073m2.getLayoutParams();
        layoutParams2.topMargin = this.f18045F;
        this.f18073m2.setLayoutParams(layoutParams2);
        if (this.f18046H) {
            setBackground(this.f18047L);
        }
        addView(viewInitView);
    }

    private void initAttrs(TypedArray ta) {
        this.f18056b = ta.getDrawable(C2531R.styleable.BottomBarItem_iconNormal);
        this.f18058c = ta.getDrawable(C2531R.styleable.BottomBarItem_iconSelected);
        this.f18060d = ta.getString(C2531R.styleable.BottomBarItem_itemText);
        this.f18062e = ta.getBoolean(C2531R.styleable.BottomBarItem_itemTextBold, this.f18062e);
        this.f18064f = ta.getDimensionPixelSize(C2531R.styleable.BottomBarItem_itemTextSize, c1i.sp2px(this.f18054a, this.f18064f));
        this.f18072m = ta.getColor(C2531R.styleable.BottomBarItem_textColorNormal, c1i.getColor(this.f18054a, C2531R.color.base_tab_text_normal_color));
        this.f18044C = ta.getColor(C2531R.styleable.BottomBarItem_textColorSelected, c1i.getColor(this.f18054a, C2531R.color.base_tab_text_selected_color));
        this.f18045F = ta.getDimensionPixelSize(C2531R.styleable.BottomBarItem_itemMarginTop, c1i.dip2Px(this.f18054a, this.f18045F));
        this.f18046H = ta.getBoolean(C2531R.styleable.BottomBarItem_openTouchBg, this.f18046H);
        this.f18047L = ta.getDrawable(C2531R.styleable.BottomBarItem_touchDrawable);
        this.f18048M = ta.getDimensionPixelSize(C2531R.styleable.BottomBarItem_iconWidth, 0);
        this.f18050N = ta.getDimensionPixelSize(C2531R.styleable.BottomBarItem_iconHeight, 0);
        this.f18051Q = ta.getDimensionPixelSize(C2531R.styleable.BottomBarItem_itemPadding, 0);
        this.f18049M1 = ta.getDimensionPixelSize(C2531R.styleable.BottomBarItem_unreadTextSize, c1i.sp2px(this.f18054a, this.f18049M1));
        this.f18053Z1 = ta.getColor(C2531R.styleable.BottomBarItem_unreadTextColor, c1i.getColor(this.f18054a, C2531R.color.base_common_white));
        this.f18055a2 = ta.getDrawable(C2531R.styleable.BottomBarItem_unreadTextBg);
        this.f18057b2 = ta.getDimensionPixelSize(C2531R.styleable.BottomBarItem_msgTextSize, c1i.sp2px(this.f18054a, this.f18057b2));
        this.f18059c2 = ta.getColor(C2531R.styleable.BottomBarItem_msgTextColor, c1i.getColor(this.f18054a, C2531R.color.base_common_white));
        this.f18061d2 = ta.getDrawable(C2531R.styleable.BottomBarItem_msgTextBg);
        this.f18063e2 = ta.getDrawable(C2531R.styleable.BottomBarItem_notifyPointBg);
        this.f18052V1 = ta.getInteger(C2531R.styleable.BottomBarItem_unreadThreshold, this.f18052V1);
        this.f18065f2 = ta.getString(C2531R.styleable.BottomBarItem_lottieJson);
        this.f18066g2 = !TextUtils.isEmpty(r4);
    }

    @efb
    private View initView() {
        View viewInflate = View.inflate(this.f18054a, C2531R.layout.base_item_bottom_bar, null);
        int i = this.f18051Q;
        if (i != 0) {
            viewInflate.setPadding(i, i, i, i);
        }
        this.f18067h2 = (ImageView) viewInflate.findViewById(C2531R.id.iv_icon);
        this.f18068i2 = (LottieAnimationView) viewInflate.findViewById(C2531R.id.lottieView);
        this.f18069j2 = (TextView) viewInflate.findViewById(C2531R.id.tv_unred_num);
        this.f18071l2 = (TextView) viewInflate.findViewById(C2531R.id.tv_msg);
        this.f18070k2 = (TextView) viewInflate.findViewById(C2531R.id.tv_point);
        this.f18073m2 = (TextView) viewInflate.findViewById(C2531R.id.tv_text);
        this.f18067h2.setVisibility(this.f18066g2 ? 8 : 0);
        this.f18068i2.setVisibility(this.f18066g2 ? 0 : 8);
        return viewInflate;
    }

    private void setTvVisible(TextView tv) {
        this.f18069j2.setVisibility(8);
        this.f18071l2.setVisibility(8);
        this.f18070k2.setVisibility(8);
        tv.setVisibility(0);
    }

    public BottomBarItem create(C2543a builder) {
        this.f18054a = builder.f18074a;
        this.f18056b = builder.f18075b;
        this.f18058c = builder.f18076c;
        this.f18060d = builder.f18077d;
        this.f18062e = builder.f18078e;
        this.f18064f = builder.f18079f;
        this.f18072m = builder.f18080g;
        this.f18044C = builder.f18081h;
        this.f18045F = builder.f18082i;
        this.f18046H = builder.f18083j;
        this.f18047L = builder.f18084k;
        this.f18048M = builder.f18085l;
        this.f18050N = builder.f18086m;
        this.f18051Q = builder.f18087n;
        this.f18049M1 = builder.f18088o;
        this.f18053Z1 = builder.f18090q;
        this.f18055a2 = builder.f18091r;
        this.f18052V1 = builder.f18089p;
        this.f18057b2 = builder.f18092s;
        this.f18059c2 = builder.f18093t;
        this.f18061d2 = builder.f18094u;
        this.f18063e2 = builder.f18095v;
        this.f18065f2 = builder.f18096w;
        checkValues();
        init();
        return this;
    }

    public ImageView getImageView() {
        return this.f18067h2;
    }

    public TextView getTextView() {
        return this.f18073m2;
    }

    public int getUnreadNumThreshold() {
        return this.f18052V1;
    }

    public void hideMsg() {
        this.f18071l2.setVisibility(8);
    }

    public void hideNotify() {
        this.f18070k2.setVisibility(8);
    }

    public void refreshTab(boolean isSelected) {
        setSelected(isSelected);
        refreshTab();
    }

    public void setMsg(String msg) {
        setTvVisible(this.f18071l2);
        this.f18071l2.setText(msg);
    }

    public void setNormalIcon(Drawable normalIcon) {
        this.f18056b = normalIcon;
        refreshTab();
    }

    public void setSelectedIcon(Drawable selectedIcon) {
        this.f18058c = selectedIcon;
        refreshTab();
    }

    public void setUnreadNum(int unreadNum) {
        setTvVisible(this.f18069j2);
        if (unreadNum <= 0) {
            this.f18069j2.setVisibility(8);
            return;
        }
        int i = this.f18052V1;
        if (unreadNum <= i) {
            this.f18069j2.setText(String.valueOf(unreadNum));
        } else {
            this.f18069j2.setText(String.format(Locale.CHINA, "%d+", Integer.valueOf(i)));
        }
    }

    public void setUnreadNumThreshold(int unreadNumThreshold) {
        this.f18052V1 = unreadNumThreshold;
    }

    public void showNotify() {
        setTvVisible(this.f18070k2);
    }

    public void refreshTab() {
        if (this.f18066g2) {
            if (isSelected()) {
                this.f18068i2.playAnimation();
            } else {
                this.f18068i2.cancelAnimation();
                this.f18068i2.setProgress(0.0f);
            }
        } else {
            this.f18067h2.setImageDrawable(isSelected() ? this.f18058c : this.f18056b);
        }
        this.f18073m2.setTextColor(isSelected() ? this.f18044C : this.f18072m);
    }

    public void setNormalIcon(int resId) {
        setNormalIcon(c1i.getDrawable(this.f18054a, resId));
    }

    public void setSelectedIcon(int resId) {
        setSelectedIcon(c1i.getDrawable(this.f18054a, resId));
    }

    public BottomBarItem(Context context, @hib AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public BottomBarItem(Context context, @hib AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f18062e = false;
        this.f18064f = 12;
        this.f18045F = 0;
        this.f18046H = false;
        this.f18049M1 = 10;
        this.f18052V1 = 99;
        this.f18057b2 = 6;
        this.f18054a = context;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, C2531R.styleable.BottomBarItem);
        initAttrs(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
        checkValues();
        init();
    }
}
