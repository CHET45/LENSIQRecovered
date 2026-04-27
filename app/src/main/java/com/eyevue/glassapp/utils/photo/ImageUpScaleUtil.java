package com.eyevue.glassapp.utils.photo;

import android.graphics.Bitmap;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AbstractC1143j;
import androidx.lifecycle.InterfaceC1154n;
import java.lang.ref.WeakReference;
import java.util.concurrent.CancellationException;
import p000.bth;
import p000.bw7;
import p000.e0g;
import p000.fg1;
import p000.g59;
import p000.gib;
import p000.h59;
import p000.jj8;
import p000.jt3;
import p000.md8;
import p000.qy6;
import p000.yfb;
import p000.yn8;

/* JADX INFO: loaded from: classes4.dex */
@e0g(parameters = 0)
public class ImageUpScaleUtil implements InterfaceC1154n {
    public static final int CODE_FAILED = -1;
    public static final int CODE_SUCCESS = 0;

    @yfb
    private final WeakReference<FragmentActivity> activityWeakRef;

    @gib
    private bw7 imageUpscaler;
    private boolean isDestroyed;

    @gib
    private jj8 mJob;

    @yfb
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        public /* synthetic */ Companion(jt3 jt3Var) {
            this();
        }

        @yfb
        public final ImageUpScaleUtil init(@yfb FragmentActivity fragmentActivity) {
            md8.checkNotNullParameter(fragmentActivity, "activity");
            ImageUpScaleUtil imageUpScaleUtil = new ImageUpScaleUtil(fragmentActivity, null);
            fragmentActivity.getLifecycle().addObserver(imageUpScaleUtil);
            return imageUpScaleUtil;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ImageUpScaleUtil(FragmentActivity fragmentActivity, jt3 jt3Var) {
        this(fragmentActivity);
    }

    public static /* synthetic */ void applyImageUpScale$default(ImageUpScaleUtil imageUpScaleUtil, Bitmap bitmap, boolean z, float f, boolean z2, bw7.EnumC2079b enumC2079b, qy6 qy6Var, qy6 qy6Var2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: applyImageUpScale");
        }
        imageUpScaleUtil.applyImageUpScale(bitmap, (i & 2) != 0 ? false : z, (i & 4) != 0 ? 0.75f : f, (i & 8) != 0 ? true : z2, (i & 16) != 0 ? bw7.EnumC2079b.f15032b : enumC2079b, qy6Var, qy6Var2);
    }

    private final FragmentActivity getMActivity() {
        if (isActive()) {
            return this.activityWeakRef.get();
        }
        return null;
    }

    @yn8
    public final void applyImageUpScale(@yfb Bitmap bitmap, @yfb qy6<? super Float, bth> qy6Var, @yfb qy6<? super ImageUpScaleResult, bth> qy6Var2) {
        md8.checkNotNullParameter(bitmap, "originBitmap");
        md8.checkNotNullParameter(qy6Var, "progressCallback");
        md8.checkNotNullParameter(qy6Var2, "block");
        applyImageUpScale$default(this, bitmap, false, 0.0f, false, null, qy6Var, qy6Var2, 30, null);
    }

    public final void cancelRun() {
        jj8 jj8Var = this.mJob;
        if (jj8Var != null) {
            jj8.C7916a.cancel$default(jj8Var, (CancellationException) null, 1, (Object) null);
        }
    }

    public final boolean isActive() {
        FragmentActivity fragmentActivity;
        return !this.isDestroyed && ((fragmentActivity = this.activityWeakRef.get()) == null || !fragmentActivity.isFinishing());
    }

    @Override // androidx.lifecycle.InterfaceC1154n
    public void onStateChanged(@yfb g59 g59Var, @yfb AbstractC1143j.a aVar) {
        md8.checkNotNullParameter(g59Var, "source");
        md8.checkNotNullParameter(aVar, "event");
        if (aVar == AbstractC1143j.a.ON_DESTROY) {
            release();
            g59Var.getLifecycle().removeObserver(this);
        }
    }

    public final void release() {
        this.isDestroyed = true;
        jj8 jj8Var = this.mJob;
        if (jj8Var != null) {
            jj8.C7916a.cancel$default(jj8Var, (CancellationException) null, 1, (Object) null);
        }
        this.activityWeakRef.clear();
    }

    private ImageUpScaleUtil(FragmentActivity fragmentActivity) {
        this.activityWeakRef = new WeakReference<>(fragmentActivity);
    }

    @yn8
    public final void applyImageUpScale(@yfb Bitmap bitmap, boolean z, float f, @yfb qy6<? super Float, bth> qy6Var, @yfb qy6<? super ImageUpScaleResult, bth> qy6Var2) {
        md8.checkNotNullParameter(bitmap, "originBitmap");
        md8.checkNotNullParameter(qy6Var, "progressCallback");
        md8.checkNotNullParameter(qy6Var2, "block");
        applyImageUpScale$default(this, bitmap, z, f, false, null, qy6Var, qy6Var2, 24, null);
    }

    @yn8
    public final void applyImageUpScale(@yfb Bitmap bitmap, boolean z, float f, boolean z2, @yfb qy6<? super Float, bth> qy6Var, @yfb qy6<? super ImageUpScaleResult, bth> qy6Var2) {
        md8.checkNotNullParameter(bitmap, "originBitmap");
        md8.checkNotNullParameter(qy6Var, "progressCallback");
        md8.checkNotNullParameter(qy6Var2, "block");
        applyImageUpScale$default(this, bitmap, z, f, z2, null, qy6Var, qy6Var2, 16, null);
    }

    @yn8
    public final void applyImageUpScale(@yfb Bitmap bitmap, boolean z, @yfb qy6<? super Float, bth> qy6Var, @yfb qy6<? super ImageUpScaleResult, bth> qy6Var2) {
        md8.checkNotNullParameter(bitmap, "originBitmap");
        md8.checkNotNullParameter(qy6Var, "progressCallback");
        md8.checkNotNullParameter(qy6Var2, "block");
        applyImageUpScale$default(this, bitmap, z, 0.0f, false, null, qy6Var, qy6Var2, 28, null);
    }

    @e0g(parameters = 0)
    public static final class ImageUpScaleResult {
        public static final int $stable = 8;

        @gib
        private final Bitmap bitmap;
        private final long duration;
        private final int errorCode;

        @yfb
        private final String errorMsg;

        public ImageUpScaleResult(int i, @yfb String str, @gib Bitmap bitmap, long j) {
            md8.checkNotNullParameter(str, "errorMsg");
            this.errorCode = i;
            this.errorMsg = str;
            this.bitmap = bitmap;
            this.duration = j;
        }

        public static /* synthetic */ ImageUpScaleResult copy$default(ImageUpScaleResult imageUpScaleResult, int i, String str, Bitmap bitmap, long j, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = imageUpScaleResult.errorCode;
            }
            if ((i2 & 2) != 0) {
                str = imageUpScaleResult.errorMsg;
            }
            String str2 = str;
            if ((i2 & 4) != 0) {
                bitmap = imageUpScaleResult.bitmap;
            }
            Bitmap bitmap2 = bitmap;
            if ((i2 & 8) != 0) {
                j = imageUpScaleResult.duration;
            }
            return imageUpScaleResult.copy(i, str2, bitmap2, j);
        }

        public final int component1() {
            return this.errorCode;
        }

        @yfb
        public final String component2() {
            return this.errorMsg;
        }

        @gib
        public final Bitmap component3() {
            return this.bitmap;
        }

        public final long component4() {
            return this.duration;
        }

        @yfb
        public final ImageUpScaleResult copy(int i, @yfb String str, @gib Bitmap bitmap, long j) {
            md8.checkNotNullParameter(str, "errorMsg");
            return new ImageUpScaleResult(i, str, bitmap, j);
        }

        public boolean equals(@gib Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ImageUpScaleResult)) {
                return false;
            }
            ImageUpScaleResult imageUpScaleResult = (ImageUpScaleResult) obj;
            return this.errorCode == imageUpScaleResult.errorCode && md8.areEqual(this.errorMsg, imageUpScaleResult.errorMsg) && md8.areEqual(this.bitmap, imageUpScaleResult.bitmap) && this.duration == imageUpScaleResult.duration;
        }

        @gib
        public final Bitmap getBitmap() {
            return this.bitmap;
        }

        public final long getDuration() {
            return this.duration;
        }

        public final int getErrorCode() {
            return this.errorCode;
        }

        @yfb
        public final String getErrorMsg() {
            return this.errorMsg;
        }

        public int hashCode() {
            int iHashCode = ((Integer.hashCode(this.errorCode) * 31) + this.errorMsg.hashCode()) * 31;
            Bitmap bitmap = this.bitmap;
            return ((iHashCode + (bitmap == null ? 0 : bitmap.hashCode())) * 31) + Long.hashCode(this.duration);
        }

        @yfb
        public String toString() {
            return "ImageUpScaleResult(errorCode=" + this.errorCode + ", errorMsg=" + this.errorMsg + ", bitmap=" + this.bitmap + ", duration=" + this.duration + ')';
        }

        public /* synthetic */ ImageUpScaleResult(int i, String str, Bitmap bitmap, long j, int i2, jt3 jt3Var) {
            this(i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? null : bitmap, (i2 & 8) != 0 ? 0L : j);
        }
    }

    @yn8
    public void applyImageUpScale(@yfb Bitmap bitmap, boolean z, float f, boolean z2, @yfb bw7.EnumC2079b enumC2079b, @yfb qy6<? super Float, bth> qy6Var, @yfb qy6<? super ImageUpScaleResult, bth> qy6Var2) {
        md8.checkNotNullParameter(bitmap, "originBitmap");
        md8.checkNotNullParameter(enumC2079b, "delegate");
        md8.checkNotNullParameter(qy6Var, "progressCallback");
        md8.checkNotNullParameter(qy6Var2, "block");
        FragmentActivity mActivity = getMActivity();
        if (mActivity != null) {
            if (this.imageUpscaler == null) {
                this.imageUpscaler = new bw7(mActivity);
            }
            try {
                this.mJob = fg1.launch$default(h59.getLifecycleScope(mActivity), null, null, new ImageUpScaleUtil$applyImageUpScale$1$1(this, mActivity, bitmap, z, f, z2, enumC2079b, qy6Var, qy6Var2, null), 3, null);
                return;
            } catch (Exception e) {
                e.printStackTrace();
                String message = e.getMessage();
                if (message == null) {
                    message = "";
                }
                qy6Var2.invoke(new ImageUpScaleResult(-1, message, null, 0L, 12, null));
                return;
            }
        }
        qy6Var2.invoke(new ImageUpScaleResult(-1, "The activity has been destroyed.", null, 0L, 12, null));
    }
}
