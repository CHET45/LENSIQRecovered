package p000;

import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public interface sv4 {

    /* JADX INFO: renamed from: a */
    public static final int f82942a = 0;

    /* JADX INFO: renamed from: b */
    public static final int f82943b = 1;

    /* JADX INFO: renamed from: c */
    public static final int f82944c = 2;

    /* JADX INFO: renamed from: d */
    public static final int f82945d = 3;

    /* JADX INFO: renamed from: e */
    public static final int f82946e = 4;

    /* JADX INFO: renamed from: f */
    public static final int f82947f = 5;

    /* JADX INFO: renamed from: sv4$a */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC12799a {
    }

    void binaryElement(int i, int i2, ak5 ak5Var) throws IOException;

    void endMasterElement(int i) throws yhc;

    void floatElement(int i, double d) throws yhc;

    int getElementType(int i);

    void integerElement(int i, long j) throws yhc;

    boolean isLevel1Element(int i);

    void startMasterElement(int i, long j, long j2) throws yhc;

    void stringElement(int i, String str) throws yhc;
}
