package com.eyevue.glassapp.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import java.security.MessageDigest;
import p000.e41;
import p000.l41;

/* JADX INFO: loaded from: classes4.dex */
public class BlurTransformation extends l41 {
    private int radius;

    /* JADX INFO: renamed from: rs */
    private RenderScript f18331rs;

    public BlurTransformation(Context context, int radius) {
        this.f18331rs = RenderScript.create(context);
        this.radius = radius;
    }

    @Override // p000.l41
    public Bitmap transform(e41 pool, Bitmap toTransform, int outWidth, int outHeight) {
        Bitmap bitmapCopy = toTransform.copy(Bitmap.Config.ARGB_8888, true);
        Allocation allocationCreateFromBitmap = Allocation.createFromBitmap(this.f18331rs, bitmapCopy, Allocation.MipmapControl.MIPMAP_FULL, 128);
        Allocation allocationCreateTyped = Allocation.createTyped(this.f18331rs, allocationCreateFromBitmap.getType());
        RenderScript renderScript = this.f18331rs;
        ScriptIntrinsicBlur scriptIntrinsicBlurCreate = ScriptIntrinsicBlur.create(renderScript, Element.U8_4(renderScript));
        scriptIntrinsicBlurCreate.setInput(allocationCreateFromBitmap);
        scriptIntrinsicBlurCreate.setRadius(this.radius);
        scriptIntrinsicBlurCreate.forEach(allocationCreateTyped);
        allocationCreateTyped.copyTo(bitmapCopy);
        return bitmapCopy;
    }

    @Override // p000.eq8
    public void updateDiskCacheKey(MessageDigest messageDigest) {
        messageDigest.update("blur transformation".getBytes());
    }
}
