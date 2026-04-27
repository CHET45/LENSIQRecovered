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
public class Jl_Dialog extends DialogFragment {

    /* JADX INFO: renamed from: a */
    public final String f26506a = getClass().getSimpleName();

    /* JADX INFO: renamed from: b */
    public boolean f26507b = false;

    /* JADX INFO: renamed from: c */
    public Builder f26508c;

    /* JADX INFO: renamed from: com.watchfun.voicenotes.widget.Jl_Dialog$a */
    public class ViewOnClickListenerC4381a implements View.OnClickListener {
        public ViewOnClickListenerC4381a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (Jl_Dialog.this.f26508c.f26521Z1 != null) {
                Jl_Dialog.this.f26508c.f26521Z1.onClick(view, Jl_Dialog.this);
            }
        }
    }

    /* JADX INFO: renamed from: com.watchfun.voicenotes.widget.Jl_Dialog$b */
    public class ViewOnClickListenerC4382b implements View.OnClickListener {
        public ViewOnClickListenerC4382b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (Jl_Dialog.this.f26508c.f26523a2 != null) {
                Jl_Dialog.this.f26508c.f26523a2.onClick(view, Jl_Dialog.this);
            }
        }
    }

    /* JADX INFO: renamed from: com.watchfun.voicenotes.widget.Jl_Dialog$c */
    public interface InterfaceC4383c {
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
        if (TextUtils.isEmpty(this.f26508c.f26527e) && TextUtils.isEmpty(this.f26508c.f26528f)) {
            view.findViewById(C4297R.id.dialog_notify_ll).setVisibility(8);
            view.findViewById(C4297R.id.line_id).setVisibility(8);
            return;
        }
        view.findViewById(C4297R.id.dialog_notify_ll).setVisibility(0);
        view.findViewById(C4297R.id.line_id).setVisibility(0);
        if (this.f26508c.f26510F != -2) {
            textView.setTextColor(this.f26508c.f26510F);
        }
        if (this.f26508c.f26511H != -2) {
            textView2.setTextColor(this.f26508c.f26511H);
        }
        if (!TextUtils.isEmpty(this.f26508c.f26527e) && TextUtils.isEmpty(this.f26508c.f26528f)) {
            textView.setVisibility(0);
            textView.setText(this.f26508c.f26527e);
        } else if (!TextUtils.isEmpty(this.f26508c.f26527e) || TextUtils.isEmpty(this.f26508c.f26528f)) {
            textView2.setVisibility(0);
            textView2.setText(this.f26508c.f26528f);
            view.findViewById(C4297R.id.divider_id).setVisibility(0);
            textView.setVisibility(0);
            textView.setText(this.f26508c.f26527e);
        } else {
            textView2.setVisibility(0);
            textView2.setText(this.f26508c.f26528f);
        }
        textView.setOnClickListener(new ViewOnClickListenerC4381a());
        textView2.setOnClickListener(new ViewOnClickListenerC4382b());
    }

    private void initContent(View view) {
        RelativeLayout relativeLayout;
        if (this.f26508c.f26516Q == null && this.f26508c.f26515N == 0) {
            relativeLayout = null;
        } else {
            relativeLayout = (RelativeLayout) view.findViewById(C4297R.id.dialog_content_container);
            relativeLayout.setVisibility(0);
            relativeLayout.removeAllViews();
        }
        if (this.f26508c.f26516Q != null) {
            ViewGroup viewGroup = (ViewGroup) this.f26508c.f26516Q.getParent();
            if (viewGroup != null) {
                viewGroup.removeAllViews();
            }
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams.addRule(13);
            relativeLayout.addView(this.f26508c.f26516Q, layoutParams);
            return;
        }
        if (this.f26508c.f26515N != 0) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(this.f26508c.f26515N, (ViewGroup) relativeLayout, false);
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) viewInflate.getLayoutParams();
            layoutParams2.addRule(13);
            view.setLayoutParams(layoutParams2);
            relativeLayout.addView(viewInflate);
            return;
        }
        if (!TextUtils.isEmpty(this.f26508c.f26529m) || this.f26508c.f26517V1) {
            view.findViewById(C4297R.id.content_parent).setVisibility(0);
            if (!TextUtils.isEmpty(this.f26508c.f26529m)) {
                TextView textView = (TextView) view.findViewById(C4297R.id.tv_content);
                textView.setVisibility(0);
                textView.setText(this.f26508c.f26529m);
                textView.setGravity(this.f26508c.f26513M);
                if (this.f26508c.f26512L != -2) {
                    textView.setTextColor(this.f26508c.f26512L);
                }
            }
            ((ProgressBar) view.findViewById(C4297R.id.progressBar)).setVisibility(this.f26508c.f26517V1 ? 0 : 8);
        }
    }

    private void initHeader(View view) {
        if (TextUtils.isEmpty(this.f26508c.f26526d)) {
            return;
        }
        TextView textView = (TextView) view.findViewById(C4297R.id.tv_title);
        textView.setVisibility(0);
        textView.setText(this.f26508c.f26526d);
        if (this.f26508c.f26509C != -2) {
            textView.setTextColor(this.f26508c.f26509C);
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public void dismiss() {
        this.f26507b = false;
        super.dismissAllowingStateLoss();
    }

    public Builder getBuilder() {
        return this.f26508c;
    }

    public void intiDefaultDialog(View view) {
        if (this.f26508c.f26518X != -2) {
            view.findViewById(C4297R.id.ll_dialog_container).setBackgroundColor(this.f26508c.f26518X);
        }
        initHeader(view);
        initContent(view);
        initBottom(view);
    }

    public boolean isShow() {
        return this.f26507b;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (getDialog().getWindow() != null) {
            WindowManager.LayoutParams attributes = getDialog().getWindow().getAttributes();
            if (this.f26508c.f26522a != 0) {
                attributes.windowAnimations = this.f26508c.f26522a;
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
        if (this.f26508c == null && bundle != null && bundle.getParcelable("builder") != null) {
            this.f26508c = (Builder) bundle.get("builder");
        }
        Builder builder = this.f26508c;
        if (builder == null || builder.f26524b == 0) {
            Builder builder2 = this.f26508c;
            if (builder2 == null || builder2.f26525c == null) {
                viewInflate = layoutInflater.inflate(C4297R.layout.dialog_ai_voice_note_container, viewGroup, false);
                intiDefaultDialog(viewInflate);
            } else {
                viewInflate = layoutInflater.inflate(C4297R.layout.dialog_ai_voice_note_container, viewGroup, false);
                ViewGroup viewGroup2 = (ViewGroup) viewInflate.findViewById(C4297R.id.ll_dialog_container);
                viewGroup2.removeAllViews();
                ViewGroup viewGroup3 = (ViewGroup) this.f26508c.f26525c.getParent();
                if (viewGroup3 != null) {
                    viewGroup3.removeAllViews();
                }
                viewGroup2.addView(this.f26508c.f26525c);
            }
        } else {
            viewInflate = layoutInflater.inflate(this.f26508c.f26524b, viewGroup, false);
        }
        getDialog().requestWindowFeature(1);
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        this.f26507b = false;
        super.onDestroy();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        this.f26507b = false;
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        this.f26507b = true;
        super.onResume();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(@efb Bundle bundle) {
        bundle.putParcelable("builder", this.f26508c);
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
        attributes.width = this.f26508c.f26519Y < 0.0f ? -2 : (int) (this.f26508c.f26519Y * getScreenWidth());
        attributes.height = this.f26508c.f26520Z >= 0.0f ? (int) (this.f26508c.f26520Z * getScreenHeight()) : -2;
        window.getDecorView().getRootView().setBackgroundColor(0);
        window.setAttributes(attributes);
        setCancelable(this.f26508c.f26514M1);
    }

    @Override // androidx.fragment.app.DialogFragment
    public void show(FragmentManager fragmentManager, String str) {
        this.f26507b = true;
        FragmentTransaction fragmentTransactionBeginTransaction = fragmentManager.beginTransaction();
        fragmentTransactionBeginTransaction.add(this, str);
        fragmentTransactionBeginTransaction.commitAllowingStateLoss();
    }

    public static class Builder implements Parcelable {
        public static final Parcelable.Creator<Builder> CREATOR = new C4380a();

        /* JADX INFO: renamed from: C */
        public int f26509C;

        /* JADX INFO: renamed from: F */
        public int f26510F;

        /* JADX INFO: renamed from: H */
        public int f26511H;

        /* JADX INFO: renamed from: L */
        public int f26512L;

        /* JADX INFO: renamed from: M */
        public int f26513M;

        /* JADX INFO: renamed from: M1 */
        public boolean f26514M1;

        /* JADX INFO: renamed from: N */
        public int f26515N;

        /* JADX INFO: renamed from: Q */
        public View f26516Q;

        /* JADX INFO: renamed from: V1 */
        public boolean f26517V1;

        /* JADX INFO: renamed from: X */
        public int f26518X;

        /* JADX INFO: renamed from: Y */
        public float f26519Y;

        /* JADX INFO: renamed from: Z */
        public float f26520Z;

        /* JADX INFO: renamed from: Z1 */
        public InterfaceC4383c f26521Z1;

        /* JADX INFO: renamed from: a */
        public int f26522a;

        /* JADX INFO: renamed from: a2 */
        public InterfaceC4383c f26523a2;

        /* JADX INFO: renamed from: b */
        public int f26524b;

        /* JADX INFO: renamed from: c */
        public View f26525c;

        /* JADX INFO: renamed from: d */
        public String f26526d;

        /* JADX INFO: renamed from: e */
        public String f26527e;

        /* JADX INFO: renamed from: f */
        public String f26528f;

        /* JADX INFO: renamed from: m */
        public String f26529m;

        /* JADX INFO: renamed from: com.watchfun.voicenotes.widget.Jl_Dialog$Builder$a */
        public class C4380a implements Parcelable.Creator<Builder> {
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
            this.f26509C = -2;
            this.f26510F = -2;
            this.f26511H = -2;
            this.f26512L = -2;
            this.f26513M = 17;
            this.f26518X = -2;
            this.f26519Y = -1.0f;
            this.f26520Z = -1.0f;
            this.f26514M1 = true;
            this.f26517V1 = false;
        }

        public Builder animations(int i) {
            this.f26522a = i;
            return this;
        }

        public Builder backgroundColor(int i) {
            this.f26518X = i;
            return this;
        }

        public Jl_Dialog build() {
            Jl_Dialog jl_Dialog = new Jl_Dialog();
            jl_Dialog.f26508c = this;
            return jl_Dialog;
        }

        public Builder cancel(boolean z) {
            this.f26514M1 = z;
            return this;
        }

        public Builder container(int i) {
            this.f26524b = i;
            return this;
        }

        public Builder containerView(View view) {
            this.f26525c = view;
            return this;
        }

        public Builder content(String str) {
            this.f26529m = str;
            return this;
        }

        public Builder contentColor(int i) {
            this.f26512L = i;
            return this;
        }

        public Builder contentGravity(int i) {
            this.f26513M = i;
            return this;
        }

        public Builder contentLayoutRes(int i) {
            this.f26515N = i;
            return this;
        }

        public Builder contentLayoutView(View view) {
            this.f26516Q = view;
            return this;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public Builder height(float f) {
            this.f26520Z = f;
            return this;
        }

        public Builder left(String str) {
            this.f26527e = str;
            return this;
        }

        public Builder leftClickListener(InterfaceC4383c interfaceC4383c) {
            this.f26521Z1 = interfaceC4383c;
            return this;
        }

        public Builder leftColor(int i) {
            this.f26510F = i;
            return this;
        }

        public Builder right(String str) {
            this.f26528f = str;
            return this;
        }

        public Builder rightClickListener(InterfaceC4383c interfaceC4383c) {
            this.f26523a2 = interfaceC4383c;
            return this;
        }

        public Builder rightColor(int i) {
            this.f26511H = i;
            return this;
        }

        public Builder showProgressBar(boolean z) {
            this.f26517V1 = z;
            return this;
        }

        public Builder title(String str) {
            this.f26526d = str;
            return this;
        }

        public Builder titleColor(int i) {
            this.f26509C = i;
            return this;
        }

        public Builder width(float f) {
            this.f26519Y = f;
            return this;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f26522a);
            parcel.writeInt(this.f26524b);
            parcel.writeString(this.f26526d);
            parcel.writeString(this.f26527e);
            parcel.writeString(this.f26528f);
            parcel.writeString(this.f26529m);
            parcel.writeInt(this.f26509C);
            parcel.writeInt(this.f26510F);
            parcel.writeInt(this.f26511H);
            parcel.writeInt(this.f26512L);
            parcel.writeInt(this.f26513M);
            parcel.writeInt(this.f26515N);
            parcel.writeInt(this.f26518X);
            parcel.writeByte(this.f26514M1 ? (byte) 1 : (byte) 0);
        }

        public Builder(Parcel parcel) {
            this.f26509C = -2;
            this.f26510F = -2;
            this.f26511H = -2;
            this.f26512L = -2;
            this.f26513M = 17;
            this.f26518X = -2;
            this.f26519Y = -1.0f;
            this.f26520Z = -1.0f;
            this.f26514M1 = true;
            this.f26517V1 = false;
            this.f26522a = parcel.readInt();
            this.f26524b = parcel.readInt();
            this.f26525c = (View) parcel.readParcelable(View.class.getClassLoader());
            this.f26526d = parcel.readString();
            this.f26527e = parcel.readString();
            this.f26528f = parcel.readString();
            this.f26529m = parcel.readString();
            this.f26509C = parcel.readInt();
            this.f26510F = parcel.readInt();
            this.f26511H = parcel.readInt();
            this.f26512L = parcel.readInt();
            this.f26513M = parcel.readInt();
            this.f26515N = parcel.readInt();
            this.f26516Q = (View) parcel.readParcelable(View.class.getClassLoader());
            this.f26518X = parcel.readInt();
            this.f26514M1 = parcel.readByte() != 0;
            this.f26521Z1 = (InterfaceC4383c) parcel.readParcelable(InterfaceC4383c.class.getClassLoader());
            this.f26523a2 = (InterfaceC4383c) parcel.readParcelable(InterfaceC4383c.class.getClassLoader());
        }
    }
}
