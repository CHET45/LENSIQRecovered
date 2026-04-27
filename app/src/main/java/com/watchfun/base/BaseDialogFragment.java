package com.watchfun.base;

import android.content.DialogInterface;
import android.util.DisplayMetrics;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import p000.efb;

/* JADX INFO: loaded from: classes6.dex */
public abstract class BaseDialogFragment extends DialogFragment {

    /* JADX INFO: renamed from: b */
    public static String f25068b = "BaseDialogFragment";

    /* JADX INFO: renamed from: a */
    public boolean f25069a = false;

    private DisplayMetrics getDisplayMetrics() {
        if (getContext() == null || getContext().getResources() == null) {
            return null;
        }
        return getContext().getResources().getDisplayMetrics();
    }

    private void setShow(boolean z) {
        this.f25069a = z;
    }

    @Override // androidx.fragment.app.DialogFragment
    public void dismiss() {
        setShow(false);
        super.dismissAllowingStateLoss();
    }

    public int getScreenHeight() {
        DisplayMetrics displayMetrics = getDisplayMetrics();
        if (displayMetrics == null) {
            return 0;
        }
        return displayMetrics.heightPixels;
    }

    public int getScreenWidth() {
        DisplayMetrics displayMetrics = getDisplayMetrics();
        if (displayMetrics == null) {
            return 0;
        }
        return displayMetrics.widthPixels;
    }

    public boolean isShow() {
        return this.f25069a;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        setShow(false);
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@efb DialogInterface dialogInterface) {
        setShow(false);
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        setShow(true);
        super.onResume();
    }

    @Override // androidx.fragment.app.DialogFragment
    public void show(FragmentManager fragmentManager, String str) {
        setShow(true);
        FragmentTransaction fragmentTransactionBeginTransaction = fragmentManager.beginTransaction();
        fragmentTransactionBeginTransaction.add(this, str);
        fragmentTransactionBeginTransaction.commitAllowingStateLoss();
    }
}
