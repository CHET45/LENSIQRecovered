package com.watchfun.base;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.AbstractC1143j;
import p000.j8i;
import p000.kr7;
import p000.mf4;
import p000.nm2;
import p000.wu0;
import p000.yfb;

/* JADX INFO: loaded from: classes6.dex */
public abstract class BaseFragment<T extends j8i> extends LazyLoadFragment implements wu0 {
    protected T binding;
    protected BaseActivity mActivity;
    protected nm2 mDisposables;

    public void addNetDisposable(mf4 mf4Var) {
        if (this.mDisposables == null) {
            this.mDisposables = new nm2();
        }
        this.mDisposables.add(mf4Var);
    }

    public void dispose() {
        nm2 nm2Var = this.mDisposables;
        if (nm2Var != null) {
            nm2Var.dispose();
            this.mDisposables.clear();
        }
    }

    public View findView(@kr7 int i) {
        return this.binding.getRoot().findViewById(i);
    }

    public String getPageName() {
        return "";
    }

    public View getRootView() {
        return this.binding.getRoot();
    }

    public AbstractC1143j getViewLifecycle() {
        return getLifecycle();
    }

    public void initListener() {
    }

    public void initView() {
    }

    public boolean isFragmentValid() {
        return !isDetached() && isAdded();
    }

    public abstract void loadData();

    @Override // androidx.fragment.app.Fragment
    public void onAttach(@yfb Context context) {
        super.onAttach(context);
        this.mActivity = (BaseActivity) context;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(@yfb LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        T t = this.binding;
        if (t == null) {
            this.binding = (T) provideViewBinding(viewGroup);
            initView();
            initListener();
        } else {
            ViewGroup viewGroup2 = (ViewGroup) t.getRoot().getParent();
            if (viewGroup2 != null) {
                viewGroup2.removeView(this.binding.getRoot());
            }
        }
        return this.binding.getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        dispose();
    }

    @Override // com.watchfun.base.LazyLoadFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.binding = null;
    }

    @Override // com.watchfun.base.LazyLoadFragment
    public void onFragmentFirstVisible() {
        loadData();
    }

    @Override // com.watchfun.base.LazyLoadFragment
    public void onFragmentResume() {
        super.onFragmentResume();
    }

    @Override // com.watchfun.base.LazyLoadFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
    }

    public abstract T provideViewBinding(ViewGroup viewGroup);

    public void replaceFragmentReload(int i, String str, Bundle bundle) {
        FragmentManager childFragmentManager = getChildFragmentManager();
        Fragment fragmentFindFragmentByTag = childFragmentManager.findFragmentByTag(str);
        if (fragmentFindFragmentByTag == null && str != null) {
            try {
                fragmentFindFragmentByTag = (Fragment) Class.forName(str).newInstance();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (fragmentFindFragmentByTag != null) {
            FragmentTransaction fragmentTransactionBeginTransaction = childFragmentManager.beginTransaction();
            if (bundle != null) {
                fragmentFindFragmentByTag.setArguments(bundle);
            }
            fragmentTransactionBeginTransaction.replace(i, fragmentFindFragmentByTag);
            fragmentTransactionBeginTransaction.commitAllowingStateLoss();
        }
    }
}
