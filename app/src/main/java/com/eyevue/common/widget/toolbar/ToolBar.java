package com.eyevue.common.widget.toolbar;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.eyevue.common.C2531R;
import com.watchfun.base.BaseActivity;
import p000.c1i;
import p000.c40;
import p000.efb;
import p000.g4h;
import p000.g8g;
import p000.gc0;
import p000.hib;
import p000.hu8;

/* JADX INFO: loaded from: classes4.dex */
public class ToolBar extends FrameLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public g4h f18142a;

    /* JADX INFO: renamed from: b */
    public int f18143b;

    /* JADX INFO: renamed from: c */
    public int f18144c;

    public ToolBar(@efb Context context) {
        super(context);
        this.f18143b = 0;
        this.f18144c = 0;
        hu8.setLanguage(context);
        init(context);
    }

    private void init(Context context) {
        g4h g4hVarInflate = g4h.inflate(LayoutInflater.from(context));
        this.f18142a = g4hVarInflate;
        addView(g4hVarInflate.getRoot());
        this.f18142a.f38775b.setOnClickListener(this);
        showLeftIcon();
    }

    public TextView getTitleTextView() {
        return this.f18142a.f38777d;
    }

    public void hideAllView() {
        hideLeftIvon();
        hideContent();
        hideBottomLine();
    }

    public void hideBottomLine() {
        this.f18142a.f38778e.setVisibility(8);
    }

    public void hideContent() {
        this.f18142a.f38776c.setVisibility(8);
        this.f18142a.f38778e.setVisibility(8);
    }

    public void hideLeftIvon() {
        this.f18142a.f38775b.setVisibility(4);
        int iDip2px = c1i.dip2px(14);
        this.f18143b = iDip2px;
        this.f18142a.f38777d.setPadding(iDip2px, 0, this.f18144c, 0);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v) {
        BaseActivity baseActivityScanForBaseActivity;
        if (v.getId() != C2531R.id.iv_back || (baseActivityScanForBaseActivity = c40.scanForBaseActivity(getContext())) == null) {
            return;
        }
        baseActivityScanForBaseActivity.finish();
    }

    public void setTitle(@g8g int titleResId, Context context) {
        setTitle(context.getResources().getString(titleResId));
    }

    public void showBottomLine() {
        this.f18142a.f38778e.setVisibility(0);
    }

    public void showLeftIcon() {
        this.f18142a.f38775b.setVisibility(0);
        this.f18143b = 0;
        this.f18142a.f38777d.setPadding(0, 0, this.f18144c, 0);
    }

    public void setTitle(String title) {
        if (TextUtils.isEmpty(title)) {
            this.f18142a.f38777d.setText("");
        } else {
            this.f18142a.f38777d.setText(title);
        }
    }

    public ToolBar(@efb Context context, @hib AttributeSet attrs) {
        super(context, attrs);
        this.f18143b = 0;
        this.f18144c = 0;
        init(context);
    }

    public ToolBar(@efb Context context, @hib AttributeSet attrs, @gc0 int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f18143b = 0;
        this.f18144c = 0;
        init(context);
    }
}
