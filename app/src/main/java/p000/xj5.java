package p000;

import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public interface xj5 {

    /* JADX INFO: renamed from: a */
    public static final int f98190a = 0;

    /* JADX INFO: renamed from: b */
    public static final int f98191b = 1;

    /* JADX INFO: renamed from: c */
    public static final int f98192c = -1;

    /* JADX INFO: renamed from: xj5$a */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC15151a {
    }

    default List<huf> getSniffFailureDetails() {
        return kx7.m15110of();
    }

    @vbf
    default xj5 getUnderlyingImplementation() {
        return this;
    }

    void init(bk5 bk5Var);

    int read(ak5 ak5Var, d5d d5dVar) throws IOException;

    void release();

    void seek(long j, long j2);

    boolean sniff(ak5 ak5Var) throws IOException;
}
