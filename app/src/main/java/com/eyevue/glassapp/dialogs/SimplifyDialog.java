package com.eyevue.glassapp.dialogs;

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
import com.eyevue.glassapp.C2558R;
import p000.efb;
import p000.hib;

/* JADX INFO: loaded from: classes4.dex */
public class SimplifyDialog extends DialogFragment {

    /* JADX INFO: renamed from: a */
    public final String f18249a = getClass().getSimpleName();

    /* JADX INFO: renamed from: b */
    public boolean f18250b = false;

    /* JADX INFO: renamed from: c */
    public Builder f18251c;

    /* JADX INFO: renamed from: com.eyevue.glassapp.dialogs.SimplifyDialog$a */
    public class ViewOnClickListenerC2634a implements View.OnClickListener {
        public ViewOnClickListenerC2634a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            if (SimplifyDialog.this.f18251c.f18264Z1 != null) {
                SimplifyDialog.this.f18251c.f18264Z1.onClick(v, SimplifyDialog.this);
            }
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.dialogs.SimplifyDialog$b */
    public class ViewOnClickListenerC2635b implements View.OnClickListener {
        public ViewOnClickListenerC2635b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            if (SimplifyDialog.this.f18251c.f18266a2 != null) {
                SimplifyDialog.this.f18251c.f18266a2.onClick(v, SimplifyDialog.this);
            }
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.dialogs.SimplifyDialog$c */
    public interface InterfaceC2636c {
        void onClick(View v, DialogFragment dialogFragment);
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
        TextView textView = (TextView) view.findViewById(C2558R.id.tv_left);
        TextView textView2 = (TextView) view.findViewById(C2558R.id.tv_right);
        if (TextUtils.isEmpty(this.f18251c.f18270e) && TextUtils.isEmpty(this.f18251c.f18271f)) {
            view.findViewById(C2558R.id.dialog_notify_ll).setVisibility(8);
            view.findViewById(C2558R.id.line_id).setVisibility(8);
            return;
        }
        view.findViewById(C2558R.id.dialog_notify_ll).setVisibility(0);
        view.findViewById(C2558R.id.line_id).setVisibility(0);
        if (this.f18251c.f18253F != -2) {
            textView.setTextColor(this.f18251c.f18253F);
        }
        if (this.f18251c.f18254H != -2) {
            textView2.setTextColor(this.f18251c.f18254H);
        }
        if (!TextUtils.isEmpty(this.f18251c.f18270e) && TextUtils.isEmpty(this.f18251c.f18271f)) {
            textView.setVisibility(0);
            textView.setText(this.f18251c.f18270e);
        } else if (!TextUtils.isEmpty(this.f18251c.f18270e) || TextUtils.isEmpty(this.f18251c.f18271f)) {
            textView2.setVisibility(0);
            textView2.setText(this.f18251c.f18271f);
            view.findViewById(C2558R.id.divider_id).setVisibility(0);
            textView.setVisibility(0);
            textView.setText(this.f18251c.f18270e);
        } else {
            textView2.setVisibility(0);
            textView2.setText(this.f18251c.f18271f);
        }
        textView.setOnClickListener(new ViewOnClickListenerC2634a());
        textView2.setOnClickListener(new ViewOnClickListenerC2635b());
    }

    private void initContent(View view) {
        RelativeLayout relativeLayout;
        if (this.f18251c.f18259Q == null && this.f18251c.f18258N == 0) {
            relativeLayout = null;
        } else {
            relativeLayout = (RelativeLayout) view.findViewById(C2558R.id.dialog_content_container);
            relativeLayout.setVisibility(0);
            relativeLayout.removeAllViews();
        }
        if (this.f18251c.f18259Q != null) {
            ViewGroup viewGroup = (ViewGroup) this.f18251c.f18259Q.getParent();
            if (viewGroup != null) {
                viewGroup.removeAllViews();
            }
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams.addRule(13);
            relativeLayout.addView(this.f18251c.f18259Q, layoutParams);
            return;
        }
        if (this.f18251c.f18258N != 0) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(this.f18251c.f18258N, (ViewGroup) relativeLayout, false);
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) viewInflate.getLayoutParams();
            layoutParams2.addRule(13);
            view.setLayoutParams(layoutParams2);
            relativeLayout.addView(viewInflate);
            return;
        }
        if (!TextUtils.isEmpty(this.f18251c.f18272m) || this.f18251c.f18260V1) {
            view.findViewById(C2558R.id.content_parent).setVisibility(0);
            if (!TextUtils.isEmpty(this.f18251c.f18272m)) {
                TextView textView = (TextView) view.findViewById(C2558R.id.tv_content);
                textView.setVisibility(0);
                textView.setText(this.f18251c.f18272m);
                textView.setGravity(this.f18251c.f18256M);
                if (this.f18251c.f18255L != -2) {
                    textView.setTextColor(this.f18251c.f18255L);
                }
            }
            ((ProgressBar) view.findViewById(C2558R.id.progressBar)).setVisibility(this.f18251c.f18260V1 ? 0 : 8);
        }
    }

    private void initHeader(View view) {
        if (TextUtils.isEmpty(this.f18251c.f18269d)) {
            return;
        }
        TextView textView = (TextView) view.findViewById(C2558R.id.tv_title);
        textView.setVisibility(0);
        textView.setText(this.f18251c.f18269d);
        if (this.f18251c.f18252C != -2) {
            textView.setTextColor(this.f18251c.f18252C);
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public void dismiss() {
        this.f18250b = false;
        super.dismissAllowingStateLoss();
    }

    public Builder getBuilder() {
        return this.f18251c;
    }

    public void intiDefaultDialog(View view) {
        if (this.f18251c.f18261X != -2) {
            view.findViewById(C2558R.id.ll_dialog_container).setBackgroundColor(this.f18251c.f18261X);
        }
        initHeader(view);
        initContent(view);
        initBottom(view);
    }

    public boolean isShow() {
        return this.f18250b;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        if (getDialog().getWindow() != null) {
            WindowManager.LayoutParams attributes = getDialog().getWindow().getAttributes();
            if (this.f18251c.f18265a != 0) {
                attributes.windowAnimations = this.f18251c.f18265a;
            }
        }
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }

    @Override // androidx.fragment.app.Fragment
    @hib
    public View onCreateView(@efb LayoutInflater inflater, @hib ViewGroup container, @hib Bundle savedInstanceState) {
        View viewInflate;
        if (this.f18251c == null && savedInstanceState != null && savedInstanceState.getParcelable("builder") != null) {
            this.f18251c = (Builder) savedInstanceState.get("builder");
        }
        Builder builder = this.f18251c;
        if (builder == null || builder.f18267b == 0) {
            Builder builder2 = this.f18251c;
            if (builder2 == null || builder2.f18268c == null) {
                viewInflate = inflater.inflate(C2558R.layout.dialog_container, container, false);
                intiDefaultDialog(viewInflate);
            } else {
                viewInflate = inflater.inflate(C2558R.layout.dialog_container, container, false);
                ViewGroup viewGroup = (ViewGroup) viewInflate.findViewById(C2558R.id.ll_dialog_container);
                viewGroup.removeAllViews();
                ViewGroup viewGroup2 = (ViewGroup) this.f18251c.f18268c.getParent();
                if (viewGroup2 != null) {
                    viewGroup2.removeAllViews();
                }
                viewGroup.addView(this.f18251c.f18268c);
            }
        } else {
            viewInflate = inflater.inflate(this.f18251c.f18267b, container, false);
        }
        getDialog().requestWindowFeature(1);
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        this.f18250b = false;
        super.onDestroy();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialog) {
        this.f18250b = false;
        super.onDismiss(dialog);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        this.f18250b = true;
        super.onResume();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(@efb Bundle outState) {
        outState.putParcelable("builder", this.f18251c);
        super.onSaveInstanceState(outState);
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
        attributes.width = this.f18251c.f18262Y < 0.0f ? -2 : (int) (this.f18251c.f18262Y * getScreenWidth());
        attributes.height = this.f18251c.f18263Z >= 0.0f ? (int) (this.f18251c.f18263Z * getScreenHeight()) : -2;
        window.getDecorView().getRootView().setBackgroundColor(0);
        window.setAttributes(attributes);
        setCancelable(this.f18251c.f18257M1);
    }

    @Override // androidx.fragment.app.DialogFragment
    public void show(FragmentManager manager, String tag) {
        this.f18250b = true;
        FragmentTransaction fragmentTransactionBeginTransaction = manager.beginTransaction();
        fragmentTransactionBeginTransaction.add(this, tag);
        fragmentTransactionBeginTransaction.commitAllowingStateLoss();
    }

    public static class Builder implements Parcelable {
        public static final Parcelable.Creator<Builder> CREATOR = new C2633a();

        /* JADX INFO: renamed from: C */
        public int f18252C;

        /* JADX INFO: renamed from: F */
        public int f18253F;

        /* JADX INFO: renamed from: H */
        public int f18254H;

        /* JADX INFO: renamed from: L */
        public int f18255L;

        /* JADX INFO: renamed from: M */
        public int f18256M;

        /* JADX INFO: renamed from: M1 */
        public boolean f18257M1;

        /* JADX INFO: renamed from: N */
        public int f18258N;

        /* JADX INFO: renamed from: Q */
        public View f18259Q;

        /* JADX INFO: renamed from: V1 */
        public boolean f18260V1;

        /* JADX INFO: renamed from: X */
        public int f18261X;

        /* JADX INFO: renamed from: Y */
        public float f18262Y;

        /* JADX INFO: renamed from: Z */
        public float f18263Z;

        /* JADX INFO: renamed from: Z1 */
        public InterfaceC2636c f18264Z1;

        /* JADX INFO: renamed from: a */
        public int f18265a;

        /* JADX INFO: renamed from: a2 */
        public InterfaceC2636c f18266a2;

        /* JADX INFO: renamed from: b */
        public int f18267b;

        /* JADX INFO: renamed from: c */
        public View f18268c;

        /* JADX INFO: renamed from: d */
        public String f18269d;

        /* JADX INFO: renamed from: e */
        public String f18270e;

        /* JADX INFO: renamed from: f */
        public String f18271f;

        /* JADX INFO: renamed from: m */
        public String f18272m;

        /* JADX INFO: renamed from: com.eyevue.glassapp.dialogs.SimplifyDialog$Builder$a */
        public class C2633a implements Parcelable.Creator<Builder> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public Builder createFromParcel(Parcel source) {
                return new Builder(source);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public Builder[] newArray(int size) {
                return new Builder[size];
            }
        }

        public Builder() {
            this.f18252C = -2;
            this.f18253F = -2;
            this.f18254H = -2;
            this.f18255L = -2;
            this.f18256M = 17;
            this.f18261X = -2;
            this.f18262Y = -1.0f;
            this.f18263Z = -1.0f;
            this.f18257M1 = true;
            this.f18260V1 = false;
        }

        public Builder animations(int animalRes) {
            this.f18265a = animalRes;
            return this;
        }

        public Builder backgroundColor(int backgroundColor) {
            this.f18261X = backgroundColor;
            return this;
        }

        public SimplifyDialog build() {
            SimplifyDialog simplifyDialog = new SimplifyDialog();
            simplifyDialog.f18251c = this;
            return simplifyDialog;
        }

        public Builder cancel(boolean cancel) {
            this.f18257M1 = cancel;
            return this;
        }

        public Builder container(int containerRes) {
            this.f18267b = containerRes;
            return this;
        }

        public Builder containerView(View containerView) {
            this.f18268c = containerView;
            return this;
        }

        public Builder content(String content) {
            this.f18272m = content;
            return this;
        }

        public Builder contentColor(int color) {
            this.f18255L = color;
            return this;
        }

        public Builder contentGravity(int gravity) {
            this.f18256M = gravity;
            return this;
        }

        public Builder contentLayoutRes(int contentLayoutRes) {
            this.f18258N = contentLayoutRes;
            return this;
        }

        public Builder contentLayoutView(View contentLayoutView) {
            this.f18259Q = contentLayoutView;
            return this;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public Builder height(float percent) {
            this.f18263Z = percent;
            return this;
        }

        public Builder left(String left) {
            this.f18270e = left;
            return this;
        }

        public Builder leftClickListener(InterfaceC2636c onClickListener) {
            this.f18264Z1 = onClickListener;
            return this;
        }

        public Builder leftColor(int color) {
            this.f18253F = color;
            return this;
        }

        public Builder right(String right) {
            this.f18271f = right;
            return this;
        }

        public Builder rightClickListener(InterfaceC2636c onClickListener) {
            this.f18266a2 = onClickListener;
            return this;
        }

        public Builder rightColor(int color) {
            this.f18254H = color;
            return this;
        }

        public Builder showProgressBar(boolean showProgressBar) {
            this.f18260V1 = showProgressBar;
            return this;
        }

        public Builder title(String title) {
            this.f18269d = title;
            return this;
        }

        public Builder titleColor(int color) {
            this.f18252C = color;
            return this;
        }

        public Builder width(float percent) {
            this.f18262Y = percent;
            return this;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f18265a);
            parcel.writeInt(this.f18267b);
            parcel.writeString(this.f18269d);
            parcel.writeString(this.f18270e);
            parcel.writeString(this.f18271f);
            parcel.writeString(this.f18272m);
            parcel.writeInt(this.f18252C);
            parcel.writeInt(this.f18253F);
            parcel.writeInt(this.f18254H);
            parcel.writeInt(this.f18255L);
            parcel.writeInt(this.f18256M);
            parcel.writeInt(this.f18258N);
            parcel.writeInt(this.f18261X);
            parcel.writeByte(this.f18257M1 ? (byte) 1 : (byte) 0);
        }

        public Builder(Parcel in) {
            this.f18252C = -2;
            this.f18253F = -2;
            this.f18254H = -2;
            this.f18255L = -2;
            this.f18256M = 17;
            this.f18261X = -2;
            this.f18262Y = -1.0f;
            this.f18263Z = -1.0f;
            this.f18257M1 = true;
            this.f18260V1 = false;
            this.f18265a = in.readInt();
            this.f18267b = in.readInt();
            this.f18268c = (View) in.readParcelable(View.class.getClassLoader());
            this.f18269d = in.readString();
            this.f18270e = in.readString();
            this.f18271f = in.readString();
            this.f18272m = in.readString();
            this.f18252C = in.readInt();
            this.f18253F = in.readInt();
            this.f18254H = in.readInt();
            this.f18255L = in.readInt();
            this.f18256M = in.readInt();
            this.f18258N = in.readInt();
            this.f18259Q = (View) in.readParcelable(View.class.getClassLoader());
            this.f18261X = in.readInt();
            this.f18257M1 = in.readByte() != 0;
            this.f18264Z1 = (InterfaceC2636c) in.readParcelable(InterfaceC2636c.class.getClassLoader());
            this.f18266a2 = (InterfaceC2636c) in.readParcelable(InterfaceC2636c.class.getClassLoader());
        }
    }
}
