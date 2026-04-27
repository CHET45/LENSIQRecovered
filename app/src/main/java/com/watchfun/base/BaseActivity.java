package com.watchfun.base;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;
import androidx.lifecycle.AbstractC1143j;
import p000.gu8;
import p000.j8i;
import p000.kq7;
import p000.mf4;
import p000.qr0;
import p000.wu0;

/* JADX INFO: loaded from: classes6.dex */
public abstract class BaseActivity<T extends j8i> extends AppCompatActivity implements wu0 {
    private static boolean theme;
    private static kq7 themeDelegate;
    protected T binding;
    private qr0 mBaseLifecycle;
    protected String mFrom;

    public static void setThemeDelegate(kq7 kq7Var, boolean z) {
        themeDelegate = kq7Var;
        theme = z;
    }

    @Override // p000.wu0
    public void addNetDisposable(mf4 mf4Var) {
        this.mBaseLifecycle.addNetDisposable(mf4Var);
    }

    public String getPageName() {
        return getClass().getName();
    }

    public abstract T getViewBinding();

    @Override // p000.wu0
    public AbstractC1143j getViewLifecycle() {
        return getLifecycle();
    }

    public void initData() {
    }

    public void initFrom() {
    }

    public void initVariables() {
    }

    public void initView() {
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        kq7 kq7Var = themeDelegate;
        if (kq7Var != null) {
            kq7Var.initTheme(this);
            themeDelegate.setStatusBarDark(this, theme, false, false);
        }
        requestWindowFeature(1);
        gu8.setLanguage(this);
        super.onCreate(bundle);
        T t = (T) getViewBinding();
        this.binding = t;
        if (t != null) {
            setContentView(t.getRoot());
        }
        this.mBaseLifecycle = new qr0();
        getLifecycle().addObserver(this.mBaseLifecycle);
        initVariables();
        initView(bundle);
        initView();
        initData();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    public void showDialogFragment(DialogFragment dialogFragment) {
        showDialogFragment(dialogFragment, dialogFragment.getTag() != null ? dialogFragment.getTag() : dialogFragment.getClass().getSimpleName());
    }

    public void initView(Bundle bundle) {
    }

    public void showDialogFragment(DialogFragment dialogFragment, String str) {
        dialogFragment.show(getSupportFragmentManager(), str);
    }
}
