package com.watchfun.voicenotes.widget;

import android.content.DialogInterface;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.watchfun.voicenotes.C4297R;
import p000.efb;
import p000.hib;

/* JADX INFO: loaded from: classes7.dex */
public class WatchDialog extends DialogFragment {

    /* JADX INFO: renamed from: a */
    public final String f26532a = getClass().getSimpleName();

    /* JADX INFO: renamed from: b */
    public boolean f26533b = false;

    /* JADX INFO: renamed from: c */
    public Builder f26534c;

    /* JADX INFO: renamed from: com.watchfun.voicenotes.widget.WatchDialog$a */
    public class ViewOnClickListenerC4385a implements View.OnClickListener {
        public ViewOnClickListenerC4385a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (WatchDialog.this.f26534c.f26547Z1 != null) {
                WatchDialog.this.f26534c.f26547Z1.onClick(view, WatchDialog.this);
            }
        }
    }

    /* JADX INFO: renamed from: com.watchfun.voicenotes.widget.WatchDialog$b */
    public class ViewOnClickListenerC4386b implements View.OnClickListener {
        public ViewOnClickListenerC4386b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (WatchDialog.this.f26534c.f26549a2 != null) {
                WatchDialog.this.f26534c.f26549a2.onClick(view, WatchDialog.this);
            }
        }
    }

    /* JADX INFO: renamed from: com.watchfun.voicenotes.widget.WatchDialog$c */
    public interface InterfaceC4387c {
        void onClick(View view, DialogFragment dialogFragment);
    }

    public static Builder builder() {
        return new Builder();
    }

    private int getScreenHeight() {
        if (getContext() == null) {
            return 0;
        }
        return getContext().getResources().getDisplayMetrics().heightPixels;
    }

    private int getScreenWidth() {
        if (getContext() == null) {
            return 0;
        }
        return getContext().getResources().getDisplayMetrics().widthPixels;
    }

    private void initBottom(View view) {
        TextView textView = (TextView) view.findViewById(C4297R.id.tv_left);
        TextView textView2 = (TextView) view.findViewById(C4297R.id.tv_right);
        if (TextUtils.isEmpty(this.f26534c.f26553e) && TextUtils.isEmpty(this.f26534c.f26554f)) {
            view.findViewById(C4297R.id.dialog_notify_ll).setVisibility(8);
            view.findViewById(C4297R.id.line_id).setVisibility(8);
            return;
        }
        view.findViewById(C4297R.id.dialog_notify_ll).setVisibility(0);
        view.findViewById(C4297R.id.line_id).setVisibility(0);
        if (this.f26534c.f26536F != -2) {
            textView.setTextColor(this.f26534c.f26536F);
        }
        if (this.f26534c.f26537H != -2) {
            textView2.setTextColor(this.f26534c.f26537H);
        }
        if (!TextUtils.isEmpty(this.f26534c.f26553e) && TextUtils.isEmpty(this.f26534c.f26554f)) {
            textView.setVisibility(0);
            textView.setText(this.f26534c.f26553e);
        } else if (!TextUtils.isEmpty(this.f26534c.f26553e) || TextUtils.isEmpty(this.f26534c.f26554f)) {
            textView2.setVisibility(0);
            textView2.setText(this.f26534c.f26554f);
            view.findViewById(C4297R.id.divider_id).setVisibility(0);
            textView.setVisibility(0);
            textView.setText(this.f26534c.f26553e);
        } else {
            textView2.setVisibility(0);
            textView2.setText(this.f26534c.f26554f);
        }
        textView.setOnClickListener(new ViewOnClickListenerC4385a());
        textView2.setOnClickListener(new ViewOnClickListenerC4386b());
    }

    private void initContent(View view) {
        RelativeLayout relativeLayout;
        if (this.f26534c.f26542Q == null && this.f26534c.f26541N == 0) {
            relativeLayout = null;
        } else {
            relativeLayout = (RelativeLayout) view.findViewById(C4297R.id.dialog_content_container);
            relativeLayout.setVisibility(0);
            relativeLayout.removeAllViews();
        }
        if (this.f26534c.f26542Q != null) {
            ViewGroup viewGroup = (ViewGroup) this.f26534c.f26542Q.getParent();
            if (viewGroup != null) {
                viewGroup.removeAllViews();
            }
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams.addRule(13);
            relativeLayout.addView(this.f26534c.f26542Q, layoutParams);
            return;
        }
        if (this.f26534c.f26541N != 0) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(this.f26534c.f26541N, (ViewGroup) relativeLayout, false);
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) viewInflate.getLayoutParams();
            layoutParams2.addRule(13);
            view.setLayoutParams(layoutParams2);
            relativeLayout.addView(viewInflate);
            return;
        }
        if (!TextUtils.isEmpty(this.f26534c.f26555m) || this.f26534c.f26543V1) {
            view.findViewById(C4297R.id.content_parent).setVisibility(0);
            if (!TextUtils.isEmpty(this.f26534c.f26555m)) {
                TextView textView = (TextView) view.findViewById(C4297R.id.tv_content);
                textView.setVisibility(0);
                textView.setText(this.f26534c.f26555m);
                textView.setGravity(this.f26534c.f26539M);
                if (this.f26534c.f26538L != -2) {
                    textView.setTextColor(this.f26534c.f26538L);
                }
            }
            ((ProgressBar) view.findViewById(C4297R.id.progressBar)).setVisibility(this.f26534c.f26543V1 ? 0 : 8);
        }
    }

    private void initHeader(View view) {
        if (TextUtils.isEmpty(this.f26534c.f26552d)) {
            return;
        }
        TextView textView = (TextView) view.findViewById(C4297R.id.tv_title);
        textView.setVisibility(0);
        textView.setText(this.f26534c.f26552d);
        if (this.f26534c.f26535C != -2) {
            textView.setTextColor(this.f26534c.f26535C);
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public void dismiss() {
        this.f26533b = false;
        super.dismissAllowingStateLoss();
    }

    public Builder getBuilder() {
        return this.f26534c;
    }

    public void intiDefaultDialog(View view) {
        if (this.f26534c.f26544X != -2) {
            view.findViewById(C4297R.id.ll_dialog_container).setBackgroundColor(this.f26534c.f26544X);
        }
        initHeader(view);
        initContent(view);
        initBottom(view);
    }

    public boolean isShow() {
        return this.f26533b;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (getDialog().getWindow() != null) {
            WindowManager.LayoutParams attributes = getDialog().getWindow().getAttributes();
            if (this.f26534c.f26548a != 0) {
                attributes.windowAnimations = this.f26534c.f26548a;
            }
        }
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // androidx.fragment.app.Fragment
    @hib
    public View onCreateView(@efb LayoutInflater layoutInflater, @hib ViewGroup viewGroup, @hib Bundle bundle) {
        View viewInflate;
        if (this.f26534c == null && bundle != null && bundle.getParcelable("builder") != null) {
            this.f26534c = (Builder) bundle.get("builder");
        }
        Builder builder = this.f26534c;
        if (builder == null || builder.f26550b == 0) {
            Builder builder2 = this.f26534c;
            if (builder2 == null || builder2.f26551c == null) {
                viewInflate = layoutInflater.inflate(C4297R.layout.dialog_container, viewGroup, false);
                intiDefaultDialog(viewInflate);
            } else {
                viewInflate = layoutInflater.inflate(C4297R.layout.dialog_container, viewGroup, false);
                ViewGroup viewGroup2 = (ViewGroup) viewInflate.findViewById(C4297R.id.ll_dialog_container);
                viewGroup2.removeAllViews();
                ViewGroup viewGroup3 = (ViewGroup) this.f26534c.f26551c.getParent();
                if (viewGroup3 != null) {
                    viewGroup3.removeAllViews();
                }
                viewGroup2.addView(this.f26534c.f26551c);
            }
        } else {
            viewInflate = layoutInflater.inflate(this.f26534c.f26550b, viewGroup, false);
        }
        getDialog().requestWindowFeature(1);
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        this.f26533b = false;
        super.onDestroy();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        this.f26533b = false;
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        this.f26533b = true;
        super.onResume();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(@efb Bundle bundle) {
        bundle.putParcelable("builder", this.f26534c);
        super.onSaveInstanceState(bundle);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Window window = getDialog().getWindow();
        if (window == null) {
            return;
        }
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.dimAmount = 0.5f;
        attributes.flags |= 2;
        attributes.width = this.f26534c.f26545Y < 0.0f ? -2 : (int) (this.f26534c.f26545Y * getScreenWidth());
        attributes.height = this.f26534c.f26546Z >= 0.0f ? (int) (this.f26534c.f26546Z * getScreenHeight()) : -2;
        window.getDecorView().getRootView().setBackgroundColor(0);
        window.setAttributes(attributes);
        setCancelable(this.f26534c.f26540M1);
    }

    @Override // androidx.fragment.app.DialogFragment
    public void show(FragmentManager fragmentManager, String str) {
        this.f26533b = true;
        FragmentTransaction fragmentTransactionBeginTransaction = fragmentManager.beginTransaction();
        fragmentTransactionBeginTransaction.add(this, str);
        fragmentTransactionBeginTransaction.commitAllowingStateLoss();
    }

    public static class Builder implements Parcelable {
        public static final Parcelable.Creator<Builder> CREATOR = new C4384a();

        /* JADX INFO: renamed from: C */
        public int f26535C;

        /* JADX INFO: renamed from: F */
        public int f26536F;

        /* JADX INFO: renamed from: H */
        public int f26537H;

        /* JADX INFO: renamed from: L */
        public int f26538L;

        /* JADX INFO: renamed from: M */
        public int f26539M;

        /* JADX INFO: renamed from: M1 */
        public boolean f26540M1;

        /* JADX INFO: renamed from: N */
        public int f26541N;

        /* JADX INFO: renamed from: Q */
        public View f26542Q;

        /* JADX INFO: renamed from: V1 */
        public boolean f26543V1;

        /* JADX INFO: renamed from: X */
        public int f26544X;

        /* JADX INFO: renamed from: Y */
        public float f26545Y;

        /* JADX INFO: renamed from: Z */
        public float f26546Z;

        /* JADX INFO: renamed from: Z1 */
        public InterfaceC4387c f26547Z1;

        /* JADX INFO: renamed from: a */
        public int f26548a;

        /* JADX INFO: renamed from: a2 */
        public InterfaceC4387c f26549a2;

        /* JADX INFO: renamed from: b */
        public int f26550b;

        /* JADX INFO: renamed from: c */
        public View f26551c;

        /* JADX INFO: renamed from: d */
        public String f26552d;

        /* JADX INFO: renamed from: e */
        public String f26553e;

        /* JADX INFO: renamed from: f */
        public String f26554f;

        /* JADX INFO: renamed from: m */
        public String f26555m;

        /* JADX INFO: renamed from: com.watchfun.voicenotes.widget.WatchDialog$Builder$a */
        public class C4384a implements Parcelable.Creator<Builder> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public Builder createFromParcel(Parcel parcel) {
                return new Builder(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public Builder[] newArray(int i) {
                return new Builder[i];
            }
        }

        public Builder() {
            this.f26535C = -2;
            this.f26536F = -2;
            this.f26537H = -2;
            this.f26538L = -2;
            this.f26539M = 17;
            this.f26544X = -2;
            this.f26545Y = -1.0f;
            this.f26546Z = -1.0f;
            this.f26540M1 = true;
            this.f26543V1 = false;
        }

        public Builder animations(int i) {
            this.f26548a = i;
            return this;
        }

        public Builder backgroundColor(int i) {
            this.f26544X = i;
            return this;
        }

        public WatchDialog build() {
            WatchDialog watchDialog = new WatchDialog();
            watchDialog.f26534c = this;
            return watchDialog;
        }

        public Builder cancel(boolean z) {
            this.f26540M1 = z;
            return this;
        }

        public Builder container(int i) {
            this.f26550b = i;
            return this;
        }

        public Builder containerView(View view) {
            this.f26551c = view;
            return this;
        }

        public Builder content(String str) {
            this.f26555m = str;
            return this;
        }

        public Builder contentColor(int i) {
            this.f26538L = i;
            return this;
        }

        public Builder contentGravity(int i) {
            this.f26539M = i;
            return this;
        }

        public Builder contentLayoutRes(int i) {
            this.f26541N = i;
            return this;
        }

        public Builder contentLayoutView(View view) {
            this.f26542Q = view;
            return this;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public Builder height(float f) {
            this.f26546Z = f;
            return this;
        }

        public Builder left(String str) {
            this.f26553e = str;
            return this;
        }

        public Builder leftClickListener(InterfaceC4387c interfaceC4387c) {
            this.f26547Z1 = interfaceC4387c;
            return this;
        }

        public Builder leftColor(int i) {
            this.f26536F = i;
            return this;
        }

        public Builder right(String str) {
            this.f26554f = str;
            return this;
        }

        public Builder rightClickListener(InterfaceC4387c interfaceC4387c) {
            this.f26549a2 = interfaceC4387c;
            return this;
        }

        public Builder rightColor(int i) {
            this.f26537H = i;
            return this;
        }

        public Builder showProgressBar(boolean z) {
            this.f26543V1 = z;
            return this;
        }

        public Builder title(String str) {
            this.f26552d = str;
            return this;
        }

        public Builder titleColor(int i) {
            this.f26535C = i;
            return this;
        }

        public Builder width(float f) {
            this.f26545Y = f;
            return this;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f26548a);
            parcel.writeInt(this.f26550b);
            parcel.writeString(this.f26552d);
            parcel.writeString(this.f26553e);
            parcel.writeString(this.f26554f);
            parcel.writeString(this.f26555m);
            parcel.writeInt(this.f26535C);
            parcel.writeInt(this.f26536F);
            parcel.writeInt(this.f26537H);
            parcel.writeInt(this.f26538L);
            parcel.writeInt(this.f26539M);
            parcel.writeInt(this.f26541N);
            parcel.writeInt(this.f26544X);
            parcel.writeByte(this.f26540M1 ? (byte) 1 : (byte) 0);
        }

        public Builder(Parcel parcel) {
            this.f26535C = -2;
            this.f26536F = -2;
            this.f26537H = -2;
            this.f26538L = -2;
            this.f26539M = 17;
            this.f26544X = -2;
            this.f26545Y = -1.0f;
            this.f26546Z = -1.0f;
            this.f26540M1 = true;
            this.f26543V1 = false;
            this.f26548a = parcel.readInt();
            this.f26550b = parcel.readInt();
            this.f26551c = (View) parcel.readParcelable(View.class.getClassLoader());
            this.f26552d = parcel.readString();
            this.f26553e = parcel.readString();
            this.f26554f = parcel.readString();
            this.f26555m = parcel.readString();
            this.f26535C = parcel.readInt();
            this.f26536F = parcel.readInt();
            this.f26537H = parcel.readInt();
            this.f26538L = parcel.readInt();
            this.f26539M = parcel.readInt();
            this.f26541N = parcel.readInt();
            this.f26542Q = (View) parcel.readParcelable(View.class.getClassLoader());
            this.f26544X = parcel.readInt();
            this.f26540M1 = parcel.readByte() != 0;
            this.f26547Z1 = (InterfaceC4387c) parcel.readParcelable(InterfaceC4387c.class.getClassLoader());
            this.f26549a2 = (InterfaceC4387c) parcel.readParcelable(InterfaceC4387c.class.getClassLoader());
        }
    }
}
