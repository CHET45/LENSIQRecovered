package com.eyevue.glassapp.utils.photo;

import android.graphics.Bitmap;
import com.eyevue.glassapp.utils.photo.ImageUpScale2Util;
import com.eyevue.glassapp.utils.photo.ImageUpScale2Util$applyImageUpScale$1$1;
import p000.bth;
import p000.ck3;
import p000.df4;
import p000.dg1;
import p000.gz6;
import p000.m13;
import p000.md8;
import p000.pd8;
import p000.qy6;
import p000.ugg;
import p000.x13;
import p000.y7e;
import p000.zy2;
import watchfun.enhance.ImageEnhancer;

/* JADX INFO: loaded from: classes4.dex */
@ck3(m4009c = "com.eyevue.glassapp.utils.photo.ImageUpScale2Util$applyImageUpScale$1$1", m4010f = "ImageUpScale2Util.kt", m4011i = {}, m4012l = {46}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
public final class ImageUpScale2Util$applyImageUpScale$1$1 extends ugg implements gz6<x13, zy2<? super bth>, Object> {
    final /* synthetic */ qy6<ImageUpScale2Util.ImageUpScaleResult, bth> $block;
    final /* synthetic */ ImageEnhancer.DenoiseMethod $denoiseMethod;
    final /* synthetic */ boolean $enableSharpen;
    final /* synthetic */ Bitmap $originBitmap;
    final /* synthetic */ qy6<Float, bth> $progressCallback;
    final /* synthetic */ boolean $saveAfterUpscaled;
    int label;
    final /* synthetic */ ImageUpScale2Util this$0;

    /* JADX INFO: renamed from: com.eyevue.glassapp.utils.photo.ImageUpScale2Util$applyImageUpScale$1$1$1 */
    @ck3(m4009c = "com.eyevue.glassapp.utils.photo.ImageUpScale2Util$applyImageUpScale$1$1$1", m4010f = "ImageUpScale2Util.kt", m4011i = {}, m4012l = {47}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C26821 extends ugg implements gz6<x13, zy2<? super bth>, Object> {
        final /* synthetic */ qy6<ImageUpScale2Util.ImageUpScaleResult, bth> $block;
        final /* synthetic */ ImageEnhancer.DenoiseMethod $denoiseMethod;
        final /* synthetic */ boolean $enableSharpen;
        final /* synthetic */ Bitmap $originBitmap;
        final /* synthetic */ qy6<Float, bth> $progressCallback;
        final /* synthetic */ boolean $saveAfterUpscaled;
        int label;
        final /* synthetic */ ImageUpScale2Util this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C26821(ImageUpScale2Util imageUpScale2Util, Bitmap bitmap, boolean z, ImageEnhancer.DenoiseMethod denoiseMethod, boolean z2, qy6<? super ImageUpScale2Util.ImageUpScaleResult, bth> qy6Var, qy6<? super Float, bth> qy6Var2, zy2<? super C26821> zy2Var) {
            super(2, zy2Var);
            this.this$0 = imageUpScale2Util;
            this.$originBitmap = bitmap;
            this.$saveAfterUpscaled = z;
            this.$denoiseMethod = denoiseMethod;
            this.$enableSharpen = z2;
            this.$block = qy6Var;
            this.$progressCallback = qy6Var2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final bth invokeSuspend$lambda$0(qy6 qy6Var, float f) {
            qy6Var.invoke(Float.valueOf(f));
            return bth.f14751a;
        }

        @Override // p000.tq0
        public final zy2<bth> create(Object obj, zy2<?> zy2Var) {
            return new C26821(this.this$0, this.$originBitmap, this.$saveAfterUpscaled, this.$denoiseMethod, this.$enableSharpen, this.$block, this.$progressCallback, zy2Var);
        }

        @Override // p000.gz6
        public final Object invoke(x13 x13Var, zy2<? super bth> zy2Var) {
            return ((C26821) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        public final Object invokeSuspend(Object obj) {
            Object objEnhanceBitmap;
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                ImageEnhancer imageEnhancer = this.this$0.imageUpscaler;
                md8.checkNotNull(imageEnhancer);
                Bitmap bitmap = this.$originBitmap;
                boolean z = this.$saveAfterUpscaled;
                ImageEnhancer.DenoiseMethod denoiseMethod = this.$denoiseMethod;
                boolean z2 = this.$enableSharpen;
                final qy6<Float, bth> qy6Var = this.$progressCallback;
                qy6 qy6Var2 = new qy6() { // from class: com.eyevue.glassapp.utils.photo.b
                    @Override // p000.qy6
                    public final Object invoke(Object obj2) {
                        return ImageUpScale2Util$applyImageUpScale$1$1.C26821.invokeSuspend$lambda$0(qy6Var, ((Float) obj2).floatValue());
                    }
                };
                this.label = 1;
                objEnhanceBitmap = imageEnhancer.enhanceBitmap(bitmap, (2032 & 2) != 0 ? false : z, (2032 & 4) != 0 ? ImageEnhancer.DenoiseMethod.FAST_NL_MEANS : denoiseMethod, (2032 & 8) != 0 ? false : z2, (2032 & 16) != 0 ? 8 : 0, (2032 & 32) != 0 ? 50.0d : 0.0d, (2032 & 64) != 0 ? 30.0d : 0.0d, (2032 & 128) != 0 ? 2 : 0, (2032 & 256) != 0 ? 1.0d : 0.0d, (2032 & 512) != 0 ? 1.5d : 0.0d, (2032 & 1024) != 0 ? false : false, (2032 & 2048) != 0 ? null : qy6Var2, this);
                if (objEnhanceBitmap == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                y7e.throwOnFailure(obj);
                objEnhanceBitmap = obj;
            }
            ImageEnhancer.EnhanceResult enhanceResult = (ImageEnhancer.EnhanceResult) objEnhanceBitmap;
            if (!enhanceResult.getSuccess() || enhanceResult.getOutputBitmap() == null) {
                qy6<ImageUpScale2Util.ImageUpScaleResult, bth> qy6Var3 = this.$block;
                String errorMessage = enhanceResult.getErrorMessage();
                if (errorMessage == null) {
                    errorMessage = "";
                }
                qy6Var3.invoke(new ImageUpScale2Util.ImageUpScaleResult(-1, errorMessage, null, 0L, 12, null));
            } else {
                this.$block.invoke(new ImageUpScale2Util.ImageUpScaleResult(0, null, enhanceResult.getOutputBitmap(), 0L, 10, null));
            }
            return bth.f14751a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ImageUpScale2Util$applyImageUpScale$1$1(ImageUpScale2Util imageUpScale2Util, Bitmap bitmap, boolean z, ImageEnhancer.DenoiseMethod denoiseMethod, boolean z2, qy6<? super ImageUpScale2Util.ImageUpScaleResult, bth> qy6Var, qy6<? super Float, bth> qy6Var2, zy2<? super ImageUpScale2Util$applyImageUpScale$1$1> zy2Var) {
        super(2, zy2Var);
        this.this$0 = imageUpScale2Util;
        this.$originBitmap = bitmap;
        this.$saveAfterUpscaled = z;
        this.$denoiseMethod = denoiseMethod;
        this.$enableSharpen = z2;
        this.$block = qy6Var;
        this.$progressCallback = qy6Var2;
    }

    @Override // p000.tq0
    public final zy2<bth> create(Object obj, zy2<?> zy2Var) {
        return new ImageUpScale2Util$applyImageUpScale$1$1(this.this$0, this.$originBitmap, this.$saveAfterUpscaled, this.$denoiseMethod, this.$enableSharpen, this.$block, this.$progressCallback, zy2Var);
    }

    @Override // p000.gz6
    public final Object invoke(x13 x13Var, zy2<? super bth> zy2Var) {
        return ((ImageUpScale2Util$applyImageUpScale$1$1) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
    }

    @Override // p000.tq0
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            y7e.throwOnFailure(obj);
            m13 io2 = df4.getIO();
            C26821 c26821 = new C26821(this.this$0, this.$originBitmap, this.$saveAfterUpscaled, this.$denoiseMethod, this.$enableSharpen, this.$block, this.$progressCallback, null);
            this.label = 1;
            if (dg1.withContext(io2, c26821, this) == coroutine_suspended) {
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
