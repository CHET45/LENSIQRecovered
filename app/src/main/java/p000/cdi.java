package p000;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes5.dex */
public interface cdi {
    @hib
    Animator createAppear(@efb ViewGroup viewGroup, @efb View view);

    @hib
    Animator createDisappear(@efb ViewGroup viewGroup, @efb View view);
}
