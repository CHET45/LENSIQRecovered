package p000;

import android.util.AtomicFile;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nAtomicFile.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AtomicFile.kt\nandroidx/core/util/AtomicFileKt\n*L\n1#1,76:1\n30#1,13:77\n*S KotlinDebug\n*F\n+ 1 AtomicFile.kt\nandroidx/core/util/AtomicFileKt\n*L\n48#1:77,13\n*E\n"})
public final class ub0 {
    @yfb
    public static final byte[] readBytes(@yfb AtomicFile atomicFile) {
        return atomicFile.readFully();
    }

    @yfb
    public static final String readText(@yfb AtomicFile atomicFile, @yfb Charset charset) {
        return new String(atomicFile.readFully(), charset);
    }

    public static /* synthetic */ String readText$default(AtomicFile atomicFile, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = xw1.f99524b;
        }
        return readText(atomicFile, charset);
    }

    public static final void tryWrite(@yfb AtomicFile atomicFile, @yfb qy6<? super FileOutputStream, bth> qy6Var) throws IOException {
        FileOutputStream fileOutputStreamStartWrite = atomicFile.startWrite();
        try {
            qy6Var.invoke(fileOutputStreamStartWrite);
            o28.finallyStart(1);
            atomicFile.finishWrite(fileOutputStreamStartWrite);
            o28.finallyEnd(1);
        } catch (Throwable th) {
            o28.finallyStart(1);
            atomicFile.failWrite(fileOutputStreamStartWrite);
            o28.finallyEnd(1);
            throw th;
        }
    }

    public static final void writeBytes(@yfb AtomicFile atomicFile, @yfb byte[] bArr) throws IOException {
        FileOutputStream fileOutputStreamStartWrite = atomicFile.startWrite();
        try {
            fileOutputStreamStartWrite.write(bArr);
            atomicFile.finishWrite(fileOutputStreamStartWrite);
        } catch (Throwable th) {
            atomicFile.failWrite(fileOutputStreamStartWrite);
            throw th;
        }
    }

    public static final void writeText(@yfb AtomicFile atomicFile, @yfb String str, @yfb Charset charset) throws IOException {
        byte[] bytes = str.getBytes(charset);
        md8.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        writeBytes(atomicFile, bytes);
    }

    public static /* synthetic */ void writeText$default(AtomicFile atomicFile, String str, Charset charset, int i, Object obj) throws IOException {
        if ((i & 2) != 0) {
            charset = xw1.f99524b;
        }
        writeText(atomicFile, str, charset);
    }
}
