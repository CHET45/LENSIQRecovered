package com.eyevue.common.widget.bottomnav;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import com.airbnb.lottie.LottieAnimationView;

/* JADX INFO: loaded from: classes4.dex */
public class FunLottieAnimationView extends LottieAnimationView {
    public FunLottieAnimationView(Context context) {
        super(context);
    }

    @Override // com.airbnb.lottie.LottieAnimationView, android.view.View
    public Parcelable onSaveInstanceState() {
        super.onSaveInstanceState();
        return null;
    }

    public FunLottieAnimationView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public FunLottieAnimationView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
}
