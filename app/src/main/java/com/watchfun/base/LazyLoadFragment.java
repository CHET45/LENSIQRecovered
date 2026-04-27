package com.watchfun.base;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import java.util.List;
import p000.hib;

/* JADX INFO: loaded from: classes6.dex */
public abstract class LazyLoadFragment extends Fragment {
    private Handler mHandler;
    private boolean mIsFirstVisible = true;
    private boolean isViewCreated = false;
    private boolean currentVisibleState = false;

    private void dispatchChildVisibleState(boolean z) {
        if (isAdded()) {
            List<Fragment> fragments = getChildFragmentManager().getFragments();
            if (fragments.isEmpty()) {
                return;
            }
            for (Fragment fragment : fragments) {
                if ((fragment instanceof LazyLoadFragment) && fragment.isAdded() && !fragment.isHidden() && fragment.getUserVisibleHint()) {
                    ((LazyLoadFragment) fragment).dispatchUserVisibleHint(z);
                }
            }
        }
    }

    private void dispatchUserVisibleHint(boolean z) {
        if ((z && isParentInvisible()) || this.currentVisibleState == z) {
            return;
        }
        this.currentVisibleState = z;
        if (!z) {
            dispatchChildVisibleState(false);
            onFragmentPause();
        } else if (isAdded()) {
            if (this.mIsFirstVisible) {
                onFragmentFirstVisible();
                onFragmentResume(true);
                this.mIsFirstVisible = false;
            } else {
                onFragmentResume(false);
            }
            onFragmentResume();
            enqueueDispatchVisible();
        }
    }

    private void enqueueDispatchVisible() {
        getHandler().post(new Runnable() { // from class: o19
            @Override // java.lang.Runnable
            public final void run() {
                this.f66207a.lambda$enqueueDispatchVisible$0();
            }
        });
    }

    private Handler getHandler() {
        if (this.mHandler == null) {
            this.mHandler = new Handler(Looper.getMainLooper());
        }
        return this.mHandler;
    }

    private boolean isParentInvisible() {
        if (getParentFragment() instanceof LazyLoadFragment) {
            return !((LazyLoadFragment) r0).isSupportVisible();
        }
        return false;
    }

    private boolean isSupportVisible() {
        return this.currentVisibleState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$enqueueDispatchVisible$0() {
        dispatchChildVisibleState(true);
    }

    public boolean hasFirstVisible() {
        return !this.mIsFirstVisible;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(@hib Bundle bundle) {
        super.onActivityCreated(bundle);
        this.isViewCreated = true;
        if (isHidden() || !getUserVisibleHint()) {
            return;
        }
        dispatchUserVisibleHint(true);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.isViewCreated = false;
        this.mIsFirstVisible = true;
    }

    public void onFragmentFirstVisible() {
    }

    public void onFragmentPause() {
    }

    public void onFragmentResume() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        dispatchUserVisibleHint(!z);
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        if (this.currentVisibleState && getUserVisibleHint()) {
            dispatchUserVisibleHint(false);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.mIsFirstVisible || isHidden() || this.currentVisibleState || !getUserVisibleHint()) {
            return;
        }
        dispatchUserVisibleHint(true);
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        if (this.isViewCreated) {
            if (z && !this.currentVisibleState) {
                dispatchUserVisibleHint(true);
            } else {
                if (z || !this.currentVisibleState) {
                    return;
                }
                dispatchUserVisibleHint(false);
            }
        }
    }

    public void onFragmentResume(boolean z) {
    }
}
