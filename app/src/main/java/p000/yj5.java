package p000;

import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public interface yj5 {

    /* JADX INFO: renamed from: a */
    public static final int f101789a = 0;

    /* JADX INFO: renamed from: b */
    public static final int f101790b = 1;

    /* JADX INFO: renamed from: c */
    public static final int f101791c = -1;

    /* JADX INFO: renamed from: yj5$a */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC15690a {
    }

    void init(ck5 ck5Var);

    int read(zj5 zj5Var, c5d c5dVar) throws IOException;

    void release();

    void seek(long j, long j2);

    boolean sniff(zj5 zj5Var) throws IOException;
}
