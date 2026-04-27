package p000;

import android.graphics.Bitmap;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
public class jo9 {

    /* JADX INFO: renamed from: a */
    public final int f51344a;

    /* JADX INFO: renamed from: b */
    public final int f51345b;

    /* JADX INFO: renamed from: c */
    public final String f51346c;

    /* JADX INFO: renamed from: d */
    public final String f51347d;

    /* JADX INFO: renamed from: e */
    public final String f51348e;

    /* JADX INFO: renamed from: f */
    @hib
    public Bitmap f51349f;

    @p7e({p7e.EnumC10826a.f69934a})
    public jo9(int i, int i2, String str, String str2, String str3) {
        this.f51344a = i;
        this.f51345b = i2;
        this.f51346c = str;
        this.f51347d = str2;
        this.f51348e = str3;
    }

    @hib
    public Bitmap getBitmap() {
        return this.f51349f;
    }

    public String getDirName() {
        return this.f51348e;
    }

    public String getFileName() {
        return this.f51347d;
    }

    public int getHeight() {
        return this.f51345b;
    }

    public String getId() {
        return this.f51346c;
    }

    public int getWidth() {
        return this.f51344a;
    }

    public boolean hasBitmap() {
        return this.f51349f != null || (this.f51347d.startsWith("data:") && this.f51347d.indexOf("base64,") > 0);
    }

    public void setBitmap(@hib Bitmap bitmap) {
        this.f51349f = bitmap;
    }
}
