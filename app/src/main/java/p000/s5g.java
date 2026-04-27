package p000;

import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes7.dex */
public class s5g {
    @jjf(version = "1.8")
    @yfb
    @xg5
    public static final InputStream decodingWith(@yfb InputStream inputStream, @yfb bq0 bq0Var) {
        md8.checkNotNullParameter(inputStream, "<this>");
        md8.checkNotNullParameter(bq0Var, "base64");
        return new el3(inputStream, bq0Var);
    }

    @jjf(version = "1.8")
    @yfb
    @xg5
    public static final OutputStream encodingWith(@yfb OutputStream outputStream, @yfb bq0 bq0Var) {
        md8.checkNotNullParameter(outputStream, "<this>");
        md8.checkNotNullParameter(bq0Var, "base64");
        return new f15(outputStream, bq0Var);
    }
}
