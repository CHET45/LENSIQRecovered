package com.eyevue.common.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.eyevue.common.C2531R;
import p000.cd9;
import p000.igg;

/* JADX INFO: loaded from: classes4.dex */
public class LoadingView extends FrameLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final cd9 f17946a;

    /* JADX INFO: renamed from: b */
    public InterfaceC2535a f17947b;

    /* JADX INFO: renamed from: com.eyevue.common.widget.LoadingView$a */
    public interface InterfaceC2535a {
        void onRetry();
    }

    public LoadingView(Context context) {
        this(context, null);
    }

    private void setViewHide(View... views) {
        for (View view : views) {
            if (view.getVisibility() != 8) {
                view.setVisibility(8);
            }
        }
    }

    private void setViewShow(View... views) {
        for (View view : views) {
            if (view.getVisibility() != 0) {
                view.setVisibility(0);
            }
        }
    }

    public cd9 getBinding() {
        return this.f17946a;
    }

    public void hide() {
        setVisibility(8);
    }

    public void hideAllView() {
        setViewHide(this);
    }

    @Override // android.view.View.OnClickListener
    @igg({"NonConstantResourceId"})
    public void onClick(View v) {
        InterfaceC2535a interfaceC2535a;
        if (v.getId() != C2531R.id.tv_again || (interfaceC2535a = this.f17947b) == null) {
            return;
        }
        interfaceC2535a.onRetry();
    }

    public void setLoadingViewCallBack(InterfaceC2535a callBack) {
        this.f17947b = callBack;
    }

    public void showLoadingView() {
        cd9 cd9Var = this.f17946a;
        setViewShow(this, cd9Var.f16291b, cd9Var.f16294e);
        cd9 cd9Var2 = this.f17946a;
        setViewHide(cd9Var2.f16295f, cd9Var2.f16296m, cd9Var2.f16293d);
    }

    public void showNoDataView() {
        setViewShow(this, this.f17946a.f16295f);
        cd9 cd9Var = this.f17946a;
        setViewHide(cd9Var.f16291b, cd9Var.f16294e, cd9Var.f16296m, cd9Var.f16293d);
    }

    public void showNoNetView() {
        cd9 cd9Var = this.f17946a;
        setViewShow(this, cd9Var.f16296m, cd9Var.f16293d);
        cd9 cd9Var2 = this.f17946a;
        setViewHide(cd9Var2.f16291b, cd9Var2.f16294e, cd9Var2.f16295f);
    }

    public LoadingView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public LoadingView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        cd9 cd9VarInflate = cd9.inflate(LayoutInflater.from(context));
        this.f17946a = cd9VarInflate;
        showLoadingView();
        cd9VarInflate.f16293d.setOnClickListener(this);
        cd9VarInflate.f16293d.setEnabled(true);
        addView(cd9VarInflate.getRoot());
    }
}
