package com.eyevue.glassapp.utils.photo;

import android.graphics.Bitmap;
import android.util.Log;
import androidx.fragment.app.FragmentActivity;
import cn.watchfun.stylefilter.WQStyleFilter;
import com.eyevue.glassapp.utils.photo.StyleFilterUtil;
import java.io.File;
import p000.a18;
import p000.bth;
import p000.ck3;
import p000.df4;
import p000.dg1;
import p000.gz6;
import p000.h9g;
import p000.m13;
import p000.md8;
import p000.mu5;
import p000.pd8;
import p000.qy6;
import p000.ugg;
import p000.x13;
import p000.y7e;
import p000.zy2;

/* JADX INFO: loaded from: classes4.dex */
@ck3(m4009c = "com.eyevue.glassapp.utils.photo.StyleFilterUtil$applyWaterMask$1$1", m4010f = "StyleFilterUtil.kt", m4011i = {}, m4012l = {112}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
public final class StyleFilterUtil$applyWaterMask$1$1 extends ugg implements gz6<x13, zy2<? super bth>, Object> {
    final /* synthetic */ FragmentActivity $activity;
    final /* synthetic */ qy6<StyleFilterUtil.StyleFilterResult, bth> $block;
    final /* synthetic */ String $inputImagePath;
    final /* synthetic */ int $margin;
    final /* synthetic */ WQStyleFilter.WatermarkPosition $position;
    final /* synthetic */ String $watermarkImagePath;
    final /* synthetic */ float $watermarkScale;
    int label;

    /* JADX INFO: renamed from: com.eyevue.glassapp.utils.photo.StyleFilterUtil$applyWaterMask$1$1$1 */
    @ck3(m4009c = "com.eyevue.glassapp.utils.photo.StyleFilterUtil$applyWaterMask$1$1$1", m4010f = "StyleFilterUtil.kt", m4011i = {}, m4012l = {}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C26861 extends ugg implements gz6<x13, zy2<? super bth>, Object> {
        final /* synthetic */ FragmentActivity $activity;
        final /* synthetic */ qy6<StyleFilterUtil.StyleFilterResult, bth> $block;
        final /* synthetic */ String $inputImagePath;
        final /* synthetic */ int $margin;
        final /* synthetic */ WQStyleFilter.WatermarkPosition $position;
        final /* synthetic */ long $startTime;
        final /* synthetic */ String $watermarkImagePath;
        final /* synthetic */ float $watermarkScale;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C26861(String str, FragmentActivity fragmentActivity, String str2, WQStyleFilter.WatermarkPosition watermarkPosition, int i, float f, long j, qy6<? super StyleFilterUtil.StyleFilterResult, bth> qy6Var, zy2<? super C26861> zy2Var) {
            super(2, zy2Var);
            this.$inputImagePath = str;
            this.$activity = fragmentActivity;
            this.$watermarkImagePath = str2;
            this.$position = watermarkPosition;
            this.$margin = i;
            this.$watermarkScale = f;
            this.$startTime = j;
            this.$block = qy6Var;
        }

        @Override // p000.tq0
        public final zy2<bth> create(Object obj, zy2<?> zy2Var) {
            return new C26861(this.$inputImagePath, this.$activity, this.$watermarkImagePath, this.$position, this.$margin, this.$watermarkScale, this.$startTime, this.$block, zy2Var);
        }

        @Override // p000.gz6
        public final Object invoke(x13 x13Var, zy2<? super bth> zy2Var) {
            return ((C26861) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        public final Object invokeSuspend(Object obj) {
            String path;
            pd8.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y7e.throwOnFailure(obj);
            File file = new File(this.$inputImagePath);
            if (h9g.endsWith$default(mu5.getNameWithoutExtension(file), "_filter", false, 2, null)) {
                File cacheDir = this.$activity.getCacheDir();
                StringBuilder sb = new StringBuilder();
                String name = file.getName();
                md8.checkNotNullExpressionValue(name, "getName(...)");
                sb.append(h9g.replace$default(h9g.replace$default(name, a18.f100c + mu5.getExtension(file), "", false, 4, (Object) null), "_filter", "", false, 4, (Object) null));
                sb.append("_watermask_filter.");
                sb.append(mu5.getExtension(file));
                path = new File(cacheDir, sb.toString()).getPath();
            } else {
                File cacheDir2 = this.$activity.getCacheDir();
                StringBuilder sb2 = new StringBuilder();
                String name2 = file.getName();
                md8.checkNotNullExpressionValue(name2, "getName(...)");
                sb2.append(h9g.replace$default(name2, a18.f100c + mu5.getExtension(file), "", false, 4, (Object) null));
                sb2.append("_watermask.");
                sb2.append(mu5.getExtension(file));
                path = new File(cacheDir2, sb2.toString()).getPath();
            }
            Log.e("xtest", "水印输出路径：" + path);
            WQStyleFilter styleFilter = StyleFilterUtil.Companion.getStyleFilter();
            md8.checkNotNull(styleFilter);
            WQStyleFilter.WatermarkResult watermarkResultAddWatermarkFromFileWithScale = styleFilter.addWatermarkFromFileWithScale(this.$inputImagePath, this.$watermarkImagePath, path, this.$position, this.$margin, this.$watermarkScale, true);
            long jCurrentTimeMillis = System.currentTimeMillis() - this.$startTime;
            if (!watermarkResultAddWatermarkFromFileWithScale.getSuccess()) {
                qy6<StyleFilterUtil.StyleFilterResult, bth> qy6Var = this.$block;
                String errorMessage = watermarkResultAddWatermarkFromFileWithScale.getErrorMessage();
                if (errorMessage == null) {
                    errorMessage = "";
                }
                qy6Var.invoke(new StyleFilterUtil.StyleFilterResult(-1, errorMessage, null, jCurrentTimeMillis, null, 20, null));
            } else if (watermarkResultAddWatermarkFromFileWithScale.getOutputBitmap() != null) {
                qy6<StyleFilterUtil.StyleFilterResult, bth> qy6Var2 = this.$block;
                Bitmap outputBitmap = watermarkResultAddWatermarkFromFileWithScale.getOutputBitmap();
                md8.checkNotNull(path);
                qy6Var2.invoke(new StyleFilterUtil.StyleFilterResult(0, null, outputBitmap, jCurrentTimeMillis, path, 2, null));
            } else {
                this.$block.invoke(new StyleFilterUtil.StyleFilterResult(-1, "unknown error", null, jCurrentTimeMillis, null, 20, null));
            }
            return bth.f14751a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public StyleFilterUtil$applyWaterMask$1$1(String str, FragmentActivity fragmentActivity, String str2, WQStyleFilter.WatermarkPosition watermarkPosition, int i, float f, qy6<? super StyleFilterUtil.StyleFilterResult, bth> qy6Var, zy2<? super StyleFilterUtil$applyWaterMask$1$1> zy2Var) {
        super(2, zy2Var);
        this.$inputImagePath = str;
        this.$activity = fragmentActivity;
        this.$watermarkImagePath = str2;
        this.$position = watermarkPosition;
        this.$margin = i;
        this.$watermarkScale = f;
        this.$block = qy6Var;
    }

    @Override // p000.tq0
    public final zy2<bth> create(Object obj, zy2<?> zy2Var) {
        return new StyleFilterUtil$applyWaterMask$1$1(this.$inputImagePath, this.$activity, this.$watermarkImagePath, this.$position, this.$margin, this.$watermarkScale, this.$block, zy2Var);
    }

    @Override // p000.gz6
    public final Object invoke(x13 x13Var, zy2<? super bth> zy2Var) {
        return ((StyleFilterUtil$applyWaterMask$1$1) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
    }

    @Override // p000.tq0
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            y7e.throwOnFailure(obj);
            long jCurrentTimeMillis = System.currentTimeMillis();
            m13 io2 = df4.getIO();
            C26861 c26861 = new C26861(this.$inputImagePath, this.$activity, this.$watermarkImagePath, this.$position, this.$margin, this.$watermarkScale, jCurrentTimeMillis, this.$block, null);
            this.label = 1;
            if (dg1.withContext(io2, c26861, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y7e.throwOnFailure(obj);
        }
        return bth.f14751a;
    }
}
