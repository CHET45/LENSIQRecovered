package com.draggable.library.extension.glide;

import android.graphics.drawable.Drawable;
import java.io.File;
import p000.afh;
import p000.gib;
import p000.gqf;
import p000.jmg;
import p000.md8;
import p000.q3e;
import p000.yfb;

/* JADX INFO: loaded from: classes4.dex */
public class FileTarget implements jmg<File> {
    @Override // p000.jmg
    @gib
    public q3e getRequest() {
        return null;
    }

    @Override // p000.jmg
    public void getSize(@yfb gqf gqfVar) {
        md8.checkParameterIsNotNull(gqfVar, "cb");
    }

    @Override // p000.e59
    public void onDestroy() {
    }

    @Override // p000.jmg
    public void onLoadCleared(@gib Drawable drawable) {
    }

    @Override // p000.jmg
    public void onLoadFailed(@gib Drawable drawable) {
    }

    @Override // p000.jmg
    public void onLoadStarted(@gib Drawable drawable) {
    }

    @Override // p000.jmg
    public void onResourceReady(@yfb File file, @gib afh<? super File> afhVar) {
        md8.checkParameterIsNotNull(file, "resource");
    }

    @Override // p000.e59
    public void onStart() {
    }

    @Override // p000.e59
    public void onStop() {
    }

    @Override // p000.jmg
    public void removeCallback(@yfb gqf gqfVar) {
        md8.checkParameterIsNotNull(gqfVar, "cb");
        gqfVar.onSizeReady(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @Override // p000.jmg
    public void setRequest(@gib q3e q3eVar) {
    }
}
