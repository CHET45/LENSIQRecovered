package com.watchfun.voicenotes.widget.toolbar;

import android.content.Context;
import android.content.ContextWrapper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.watchfun.base.BaseActivity;
import com.watchfun.voicenotes.C4297R;
import p000.c1i;
import p000.efb;
import p000.g8g;
import p000.gc0;
import p000.gu8;
import p000.hib;
import p000.i4h;
import p000.xrf;

/* JADX INFO: loaded from: classes7.dex */
public class ToolBar extends FrameLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public i4h f26558a;

    /* JADX INFO: renamed from: b */
    public int f26559b;

    /* JADX INFO: renamed from: c */
    public int f26560c;

    public ToolBar(@efb Context context) {
        super(context);
        this.f26559b = 0;
        this.f26560c = 0;
        gu8.setLanguage(context);
        init(context);
    }

    private void init(Context context) {
        i4h i4hVarInflate = i4h.inflate(LayoutInflater.from(context));
        this.f26558a = i4hVarInflate;
        addView(i4hVarInflate.getRoot());
        this.f26558a.f45750b.setOnClickListener(this);
        showLeftIcon();
    }

    public static BaseActivity scanForBaseActivity(Context context) {
        if (context == null) {
            return null;
        }
        if (context instanceof BaseActivity) {
            return (BaseActivity) context;
        }
        if (context instanceof ContextWrapper) {
            return scanForBaseActivity(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public TextView getTitleTextView() {
        return this.f26558a.f45752d;
    }

    public void hideAllView() {
        hideLeftIvon();
        hideContent();
        hideBottomLine();
    }

    public void hideBottomLine() {
        this.f26558a.f45753e.setVisibility(8);
    }

    public void hideContent() {
        this.f26558a.f45751c.setVisibility(8);
        this.f26558a.f45753e.setVisibility(8);
    }

    public void hideLeftIvon() {
        this.f26558a.f45750b.setVisibility(4);
        int iDip2px = c1i.dip2px(14);
        this.f26559b = iDip2px;
        this.f26558a.f45752d.setPadding(iDip2px, 0, this.f26560c, 0);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        BaseActivity baseActivityScanForBaseActivity;
        if (view.getId() != C4297R.id.iv_back || (baseActivityScanForBaseActivity = scanForBaseActivity(getContext())) == null) {
            return;
        }
        baseActivityScanForBaseActivity.finish();
    }

    public void setLeftIcon(int i, int i2, int i3) {
        this.f26558a.f45750b.setBackground(getResources().getDrawable(i));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(xrf.dp2px(i2), xrf.dp2px(i3));
        layoutParams.leftMargin = xrf.dp2px(20.0f);
        this.f26558a.f45750b.setLayoutParams(layoutParams);
    }

    public void setTitle(@g8g int i, Context context) {
        setTitle(context.getResources().getString(i));
    }

    public void showBottomLine() {
        this.f26558a.f45753e.setVisibility(0);
    }

    public void showLeftIcon() {
        this.f26558a.f45750b.setVisibility(0);
        this.f26559b = 0;
        this.f26558a.f45752d.setPadding(0, 0, this.f26560c, 0);
    }

    public void setTitle(String str) {
        if (TextUtils.isEmpty(str)) {
            this.f26558a.f45752d.setText("");
        } else {
            this.f26558a.f45752d.setText(str);
        }
    }

    public ToolBar(@efb Context context, @hib AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f26559b = 0;
        this.f26560c = 0;
        init(context);
    }

    public ToolBar(@efb Context context, @hib AttributeSet attributeSet, @gc0 int i) {
        super(context, attributeSet, i);
        this.f26559b = 0;
        this.f26560c = 0;
        init(context);
    }
}
