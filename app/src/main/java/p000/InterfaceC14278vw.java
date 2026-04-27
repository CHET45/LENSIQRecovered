package p000;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: vw */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC14278vw extends Animatable {

    /* JADX INFO: renamed from: vw$a */
    public static abstract class a {

        /* JADX INFO: renamed from: a */
        public Animatable2.AnimationCallback f92400a;

        /* JADX INFO: renamed from: vw$a$a, reason: collision with other inner class name */
        public class C16547a extends Animatable2.AnimationCallback {
            public C16547a() {
            }

            @Override // android.graphics.drawable.Animatable2.AnimationCallback
            public void onAnimationEnd(Drawable drawable) {
                a.this.onAnimationEnd(drawable);
            }

            @Override // android.graphics.drawable.Animatable2.AnimationCallback
            public void onAnimationStart(Drawable drawable) {
                a.this.onAnimationStart(drawable);
            }
        }

        @c5e(23)
        /* JADX INFO: renamed from: a */
        public Animatable2.AnimationCallback m24210a() {
            if (this.f92400a == null) {
                this.f92400a = new C16547a();
            }
            return this.f92400a;
        }

        public void onAnimationEnd(Drawable drawable) {
        }

        public void onAnimationStart(Drawable drawable) {
        }
    }

    void clearAnimationCallbacks();

    void registerAnimationCallback(@efb a aVar);

    boolean unregisterAnimationCallback(@efb a aVar);
}
