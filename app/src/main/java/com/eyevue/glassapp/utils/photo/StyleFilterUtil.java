package com.eyevue.glassapp.utils.photo;

import android.graphics.Bitmap;
import android.util.Log;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AbstractC1143j;
import androidx.lifecycle.InterfaceC1154n;
import cn.watchfun.stylefilter.WQStyleFilter;
import com.eyevue.glassapp.view.photo.C2865a;
import java.lang.ref.WeakReference;
import p000.bth;
import p000.e0g;
import p000.fg1;
import p000.g59;
import p000.gib;
import p000.h59;
import p000.igg;
import p000.jt3;
import p000.md8;
import p000.qy6;
import p000.yfb;

/* JADX INFO: loaded from: classes4.dex */
@e0g(parameters = 0)
public class StyleFilterUtil implements InterfaceC1154n {
    public static final int CODE_STYLE_FILTER_FAILED = -1;
    public static final int CODE_SUCCESS = 0;

    @gib
    @igg({"StaticFieldLeak"})
    private static WQStyleFilter styleFilter;

    @yfb
    private final WeakReference<FragmentActivity> activityWeakRef;
    private boolean isDestroyed;

    @yfb
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        public /* synthetic */ Companion(jt3 jt3Var) {
            this();
        }

        @gib
        public final WQStyleFilter getStyleFilter() {
            return StyleFilterUtil.styleFilter;
        }

        @yfb
        public final StyleFilterUtil init(@yfb FragmentActivity fragmentActivity) {
            md8.checkNotNullParameter(fragmentActivity, "activity");
            StyleFilterUtil styleFilterUtil = new StyleFilterUtil(fragmentActivity, null);
            fragmentActivity.getLifecycle().addObserver(styleFilterUtil);
            return styleFilterUtil;
        }

        public final void setStyleFilter(@gib WQStyleFilter wQStyleFilter) {
            StyleFilterUtil.styleFilter = wQStyleFilter;
        }

        private Companion() {
        }
    }

    public /* synthetic */ StyleFilterUtil(FragmentActivity fragmentActivity, jt3 jt3Var) {
        this(fragmentActivity);
    }

    public static /* synthetic */ void applyWaterMask$default(StyleFilterUtil styleFilterUtil, String str, String str2, WQStyleFilter.WatermarkPosition watermarkPosition, int i, float f, qy6 qy6Var, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: applyWaterMask");
        }
        if ((i2 & 4) != 0) {
            watermarkPosition = WQStyleFilter.WatermarkPosition.BOTTOM_CENTER;
        }
        WQStyleFilter.WatermarkPosition watermarkPosition2 = watermarkPosition;
        if ((i2 & 16) != 0) {
            f = 1.0f;
        }
        styleFilterUtil.applyWaterMask(str, str2, watermarkPosition2, i, f, qy6Var);
    }

    private final FragmentActivity getMActivity() {
        if (isActive()) {
            return this.activityWeakRef.get();
        }
        return null;
    }

    public void applyStyleFilter(@yfb String str, @yfb Bitmap bitmap, @yfb qy6<? super StyleFilterResult, bth> qy6Var) {
        md8.checkNotNullParameter(str, "cubePath");
        md8.checkNotNullParameter(bitmap, "originBitmap");
        md8.checkNotNullParameter(qy6Var, "block");
        FragmentActivity mActivity = getMActivity();
        if (mActivity == null) {
            qy6Var.invoke(new StyleFilterResult(-1, "The activity has been destroyed.", null, 0L, null, 28, null));
            return;
        }
        if (styleFilter == null) {
            Log.e("xtest", "调用applyStyleFilter初始化");
            styleFilter = new WQStyleFilter(mActivity, "lut", false);
        }
        try {
            fg1.launch$default(h59.getLifecycleScope(mActivity), null, null, new StyleFilterUtil$applyStyleFilter$1$1(mActivity, bitmap, str, qy6Var, null), 3, null);
        } catch (Exception e) {
            e.printStackTrace();
            String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            qy6Var.invoke(new StyleFilterResult(-1, message, null, 0L, null, 28, null));
        }
    }

    public void applyWaterMask(@yfb String str, @yfb String str2, @yfb WQStyleFilter.WatermarkPosition watermarkPosition, int i, float f, @yfb qy6<? super StyleFilterResult, bth> qy6Var) {
        md8.checkNotNullParameter(str, "inputImagePath");
        md8.checkNotNullParameter(str2, "watermarkImagePath");
        md8.checkNotNullParameter(watermarkPosition, C2865a.f19004r);
        md8.checkNotNullParameter(qy6Var, "block");
        FragmentActivity mActivity = getMActivity();
        if (mActivity == null) {
            qy6Var.invoke(new StyleFilterResult(-1, "The activity has been destroyed.", null, 0L, null, 28, null));
            return;
        }
        if (styleFilter == null) {
            Log.e("xtest", "调用applyStyleFilter初始化");
            styleFilter = new WQStyleFilter(mActivity, "lut", false);
        }
        try {
            fg1.launch$default(h59.getLifecycleScope(mActivity), null, null, new StyleFilterUtil$applyWaterMask$1$1(str, mActivity, str2, watermarkPosition, i, f, qy6Var, null), 3, null);
        } catch (Exception e) {
            e.printStackTrace();
            String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            qy6Var.invoke(new StyleFilterResult(-1, message, null, 0L, null, 28, null));
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

    public void preloadAllLutFiles() {
        FragmentActivity mActivity = getMActivity();
        if (mActivity == null || styleFilter != null) {
            return;
        }
        Log.e("xtest", "调用preloadAllLutFiles初始化");
        styleFilter = new WQStyleFilter(mActivity, "lut", true);
    }

    public final void release() {
        this.isDestroyed = true;
        this.activityWeakRef.clear();
    }

    private StyleFilterUtil(FragmentActivity fragmentActivity) {
        this.activityWeakRef = new WeakReference<>(fragmentActivity);
    }

    @e0g(parameters = 0)
    public static final class StyleFilterResult {
        public static final int $stable = 8;

        @gib
        private final Bitmap bitmap;
        private final long duration;
        private final int errorCode;

        @yfb
        private final String errorMsg;

        @yfb
        private final String outputPath;

        public StyleFilterResult(int i, @yfb String str, @gib Bitmap bitmap, long j, @yfb String str2) {
            md8.checkNotNullParameter(str, "errorMsg");
            md8.checkNotNullParameter(str2, "outputPath");
            this.errorCode = i;
            this.errorMsg = str;
            this.bitmap = bitmap;
            this.duration = j;
            this.outputPath = str2;
        }

        public static /* synthetic */ StyleFilterResult copy$default(StyleFilterResult styleFilterResult, int i, String str, Bitmap bitmap, long j, String str2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = styleFilterResult.errorCode;
            }
            if ((i2 & 2) != 0) {
                str = styleFilterResult.errorMsg;
            }
            String str3 = str;
            if ((i2 & 4) != 0) {
                bitmap = styleFilterResult.bitmap;
            }
            Bitmap bitmap2 = bitmap;
            if ((i2 & 8) != 0) {
                j = styleFilterResult.duration;
            }
            long j2 = j;
            if ((i2 & 16) != 0) {
                str2 = styleFilterResult.outputPath;
            }
            return styleFilterResult.copy(i, str3, bitmap2, j2, str2);
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
        public final String component5() {
            return this.outputPath;
        }

        @yfb
        public final StyleFilterResult copy(int i, @yfb String str, @gib Bitmap bitmap, long j, @yfb String str2) {
            md8.checkNotNullParameter(str, "errorMsg");
            md8.checkNotNullParameter(str2, "outputPath");
            return new StyleFilterResult(i, str, bitmap, j, str2);
        }

        public boolean equals(@gib Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StyleFilterResult)) {
                return false;
            }
            StyleFilterResult styleFilterResult = (StyleFilterResult) obj;
            return this.errorCode == styleFilterResult.errorCode && md8.areEqual(this.errorMsg, styleFilterResult.errorMsg) && md8.areEqual(this.bitmap, styleFilterResult.bitmap) && this.duration == styleFilterResult.duration && md8.areEqual(this.outputPath, styleFilterResult.outputPath);
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

        @yfb
        public final String getOutputPath() {
            return this.outputPath;
        }

        public int hashCode() {
            int iHashCode = ((Integer.hashCode(this.errorCode) * 31) + this.errorMsg.hashCode()) * 31;
            Bitmap bitmap = this.bitmap;
            return ((((iHashCode + (bitmap == null ? 0 : bitmap.hashCode())) * 31) + Long.hashCode(this.duration)) * 31) + this.outputPath.hashCode();
        }

        @yfb
        public String toString() {
            return "StyleFilterResult(errorCode=" + this.errorCode + ", errorMsg=" + this.errorMsg + ", bitmap=" + this.bitmap + ", duration=" + this.duration + ", outputPath=" + this.outputPath + ')';
        }

        public /* synthetic */ StyleFilterResult(int i, String str, Bitmap bitmap, long j, String str2, int i2, jt3 jt3Var) {
            this(i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? null : bitmap, (i2 & 8) != 0 ? 0L : j, (i2 & 16) == 0 ? str2 : "");
        }
    }
}
