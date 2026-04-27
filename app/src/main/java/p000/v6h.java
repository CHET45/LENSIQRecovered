package p000;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public interface v6h {

    /* JADX INFO: renamed from: a */
    public static final int f90121a = 0;

    /* JADX INFO: renamed from: b */
    public static final int f90122b = 10000;

    /* JADX INFO: renamed from: v6h$a */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC13894a {
    }

    kq6 getFormat(int i);

    int getIndexInTrackGroup(int i);

    g6h getTrackGroup();

    int getType();

    int indexOf(int i);

    int indexOf(kq6 kq6Var);

    int length();
}
