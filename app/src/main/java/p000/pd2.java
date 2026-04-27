package p000;

import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public class pd2 {

    /* JADX INFO: renamed from: a */
    public static final int f70428a = 16;

    public static void postOnAnimation(View view, Runnable runnable) {
        postOnAnimationJellyBean(view, runnable);
    }

    @omg(16)
    private static void postOnAnimationJellyBean(View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }
}
