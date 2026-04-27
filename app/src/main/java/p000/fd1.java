package p000;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes7.dex */
public class fd1 {

    /* JADX INFO: renamed from: a */
    public final SharedPreferences f36154a;

    public fd1(Context context) {
        this.f36154a = context.getSharedPreferences("upload_breakpoints", 0);
    }

    public void clear(String str) {
        this.f36154a.edit().remove(str).apply();
    }

    public void clearAll() {
        this.f36154a.edit().clear().apply();
    }

    public long getUploadedSize(String str) {
        return this.f36154a.getLong(str, 0L);
    }

    public void saveUploadedSize(String str, long j) {
        this.f36154a.edit().putLong(str, j).apply();
    }
}
