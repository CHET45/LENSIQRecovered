package com.eyevue.glassapp.utils;

import p000.vfe;
import p000.zp7;

/* JADX INFO: loaded from: classes4.dex */
public class GlassesLanguageStorage implements zp7 {
    @Override // p000.zp7
    public boolean getBoolean(String key, boolean values) {
        return vfe.getInstance().getBoolean(key, values);
    }

    @Override // p000.zp7
    public String getString(String key, String values) {
        return vfe.getInstance().getString(key, values);
    }

    @Override // p000.zp7
    public void putBoolean(String key, boolean values) {
        vfe.getInstance().putBoolean(key, values);
    }

    @Override // p000.zp7
    public void putString(String key, String values) {
        vfe.getInstance().putString(key, values);
    }
}
