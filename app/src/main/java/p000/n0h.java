package p000;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes5.dex */
public interface n0h {

    /* JADX INFO: renamed from: n0h$a */
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC9638a {
    }

    /* JADX INFO: renamed from: n0h$b */
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC9639b {
    }

    void setActiveSelection(int i);

    void setHandRotation(float f);

    void setValues(String[] strArr, @g8g int i);

    void updateTime(int i, int i2, @h78(from = 0) int i3);
}
