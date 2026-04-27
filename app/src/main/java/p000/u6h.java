package p000;

import androidx.media3.common.C1213a;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public interface u6h {

    /* JADX INFO: renamed from: a */
    public static final int f86907a = 0;

    /* JADX INFO: renamed from: b */
    public static final int f86908b = 10000;

    /* JADX INFO: renamed from: u6h$a */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC13380a {
    }

    C1213a getFormat(int i);

    int getIndexInTrackGroup(int i);

    h6h getTrackGroup();

    int getType();

    int indexOf(int i);

    int indexOf(C1213a c1213a);

    int length();
}
