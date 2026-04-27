package com.eyevue.glassapp.dialogs;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.eyevue.common.C2531R;
import com.eyevue.glassapp.C2558R;
import com.watchfun.base.BaseApplication;
import p000.efb;
import p000.f7e;
import p000.hib;
import p000.igg;

/* JADX INFO: loaded from: classes4.dex */
public class WaitingDialog extends DialogFragment {

    /* JADX INFO: renamed from: a */
    public boolean f18275a;

    /* JADX INFO: renamed from: b */
    public final boolean f18276b;

    /* JADX INFO: renamed from: c */
    public ImageView f18277c;

    public WaitingDialog() {
        this(false);
    }

    public static WaitingDialog newInstance(String param1, String param2) {
        WaitingDialog waitingDialog = new WaitingDialog();
        waitingDialog.setArguments(new Bundle());
        return waitingDialog;
    }

    private void startSyncAnim() {
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(BaseApplication.getInstance(), C2531R.anim.rotate_anim);
        animationLoadAnimation.setInterpolator(new LinearInterpolator());
        this.f18277c.startAnimation(animationLoadAnimation);
    }

    @Override // androidx.fragment.app.DialogFragment
    public void dismiss() {
        super.dismiss();
    }

    public boolean isShow() {
        return this.f18275a;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(@hib Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        getDialog().getWindow().setBackgroundDrawable(f7e.getDrawable(getResources(), C2531R.drawable.bg_card_white_shape, requireActivity().getTheme()));
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setCancelable(this.f18276b);
    }

    @Override // androidx.fragment.app.Fragment
    @igg({"MissingInflatedId"})
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View viewInflate = inflater.inflate(C2558R.layout.dialog_waiting, container, false);
        this.f18277c = (ImageView) viewInflate.findViewById(C2558R.id.pb_waiting);
        startSyncAnim();
        return viewInflate;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@efb DialogInterface dialog) {
        this.f18275a = false;
        ImageView imageView = this.f18277c;
        if (imageView != null) {
            imageView.clearAnimation();
        }
        super.onDismiss(dialog);
    }

    @Override // androidx.fragment.app.DialogFragment
    public void show(FragmentManager manager, String tag) {
        if (this.f18275a) {
            return;
        }
        this.f18275a = true;
        String str = tag + hashCode();
        Fragment fragmentFindFragmentByTag = manager.findFragmentByTag(str);
        FragmentTransaction fragmentTransactionBeginTransaction = manager.beginTransaction();
        if (fragmentFindFragmentByTag != null) {
            fragmentTransactionBeginTransaction.show(fragmentFindFragmentByTag);
        } else {
            fragmentTransactionBeginTransaction.add(this, str);
        }
        fragmentTransactionBeginTransaction.commitAllowingStateLoss();
    }

    public WaitingDialog(boolean isCancelable) {
        this.f18276b = isCancelable;
    }
}
