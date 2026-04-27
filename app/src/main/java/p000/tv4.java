package p000;

import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public interface tv4 {

    /* JADX INFO: renamed from: a */
    public static final int f86060a = 0;

    /* JADX INFO: renamed from: b */
    public static final int f86061b = 1;

    /* JADX INFO: renamed from: c */
    public static final int f86062c = 2;

    /* JADX INFO: renamed from: d */
    public static final int f86063d = 3;

    /* JADX INFO: renamed from: e */
    public static final int f86064e = 4;

    /* JADX INFO: renamed from: f */
    public static final int f86065f = 5;

    /* JADX INFO: renamed from: tv4$a */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC13252a {
    }

    void binaryElement(int i, int i2, zj5 zj5Var) throws IOException;

    void endMasterElement(int i) throws xhc;

    void floatElement(int i, double d) throws xhc;

    int getElementType(int i);

    void integerElement(int i, long j) throws xhc;

    boolean isLevel1Element(int i);

    void startMasterElement(int i, long j, long j2) throws xhc;

    void stringElement(int i, String str) throws xhc;
}
