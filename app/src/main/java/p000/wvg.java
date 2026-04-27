package p000;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nReadWrite.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReadWrite.kt\nkotlin/io/TextStreamsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,157:1\n57#1:158\n1#2:159\n1#2:162\n1317#3,2:160\n*S KotlinDebug\n*F\n+ 1 ReadWrite.kt\nkotlin/io/TextStreamsKt\n*L\n35#1:158\n35#1:159\n35#1:160,2\n*E\n"})
@xn8(name = "TextStreamsKt")
public final class wvg {
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ BufferedReader m24843b(Reader reader, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 8192;
        }
        md8.checkNotNullParameter(reader, "<this>");
        return reader instanceof BufferedReader ? (BufferedReader) reader : new BufferedReader(reader, i);
    }

    @t28
    private static final BufferedReader buffered(Reader reader, int i) {
        md8.checkNotNullParameter(reader, "<this>");
        return reader instanceof BufferedReader ? (BufferedReader) reader : new BufferedReader(reader, i);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ BufferedWriter m24844c(Writer writer, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 8192;
        }
        md8.checkNotNullParameter(writer, "<this>");
        return writer instanceof BufferedWriter ? (BufferedWriter) writer : new BufferedWriter(writer, i);
    }

    public static final long copyTo(@yfb Reader reader, @yfb Writer writer, int i) throws IOException {
        md8.checkNotNullParameter(reader, "<this>");
        md8.checkNotNullParameter(writer, "out");
        char[] cArr = new char[i];
        int i2 = reader.read(cArr);
        long j = 0;
        while (i2 >= 0) {
            writer.write(cArr, 0, i2);
            j += (long) i2;
            i2 = reader.read(cArr);
        }
        return j;
    }

    public static /* synthetic */ long copyTo$default(Reader reader, Writer writer, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 8192;
        }
        return copyTo(reader, writer, i);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ String m24845d(URL url, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = xw1.f99524b;
        }
        md8.checkNotNullParameter(url, "<this>");
        md8.checkNotNullParameter(charset, ypa.f102547g);
        return new String(readBytes(url), charset);
    }

    public static final void forEachLine(@yfb Reader reader, @yfb qy6<? super String, bth> qy6Var) {
        md8.checkNotNullParameter(reader, "<this>");
        md8.checkNotNullParameter(qy6Var, "action");
        BufferedReader bufferedReader = reader instanceof BufferedReader ? (BufferedReader) reader : new BufferedReader(reader, 8192);
        try {
            Iterator<String> it = lineSequence(bufferedReader).iterator();
            while (it.hasNext()) {
                qy6Var.invoke(it.next());
            }
            bth bthVar = bth.f14751a;
            u52.closeFinally(bufferedReader, null);
        } finally {
        }
    }

    @yfb
    public static final vye<String> lineSequence(@yfb BufferedReader bufferedReader) {
        md8.checkNotNullParameter(bufferedReader, "<this>");
        return ize.constrainOnce(new y69(bufferedReader));
    }

    @yfb
    public static final byte[] readBytes(@yfb URL url) throws IOException {
        md8.checkNotNullParameter(url, "<this>");
        InputStream inputStreamOpenStream = url.openStream();
        try {
            md8.checkNotNull(inputStreamOpenStream);
            byte[] bytes = uj1.readBytes(inputStreamOpenStream);
            u52.closeFinally(inputStreamOpenStream, null);
            return bytes;
        } finally {
        }
    }

    @yfb
    public static final List<String> readLines(@yfb Reader reader) {
        md8.checkNotNullParameter(reader, "<this>");
        final ArrayList arrayList = new ArrayList();
        forEachLine(reader, new qy6() { // from class: vvg
            @Override // p000.qy6
            public final Object invoke(Object obj) {
                return wvg.readLines$lambda$1(arrayList, (String) obj);
            }
        });
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final bth readLines$lambda$1(ArrayList arrayList, String str) {
        md8.checkNotNullParameter(str, "it");
        arrayList.add(str);
        return bth.f14751a;
    }

    @yfb
    public static final String readText(@yfb Reader reader) {
        md8.checkNotNullParameter(reader, "<this>");
        StringWriter stringWriter = new StringWriter();
        copyTo$default(reader, stringWriter, 0, 2, null);
        String string = stringWriter.toString();
        md8.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @t28
    private static final StringReader reader(String str) {
        md8.checkNotNullParameter(str, "<this>");
        return new StringReader(str);
    }

    public static final <T> T useLines(@yfb Reader reader, @yfb qy6<? super vye<String>, ? extends T> qy6Var) throws IOException {
        md8.checkNotNullParameter(reader, "<this>");
        md8.checkNotNullParameter(qy6Var, "block");
        BufferedReader bufferedReader = reader instanceof BufferedReader ? (BufferedReader) reader : new BufferedReader(reader, 8192);
        try {
            T tInvoke = qy6Var.invoke(lineSequence(bufferedReader));
            o28.finallyStart(1);
            if (dxc.apiVersionIsAtLeast(1, 1, 0)) {
                u52.closeFinally(bufferedReader, null);
            } else {
                bufferedReader.close();
            }
            o28.finallyEnd(1);
            return tInvoke;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                o28.finallyStart(1);
                if (dxc.apiVersionIsAtLeast(1, 1, 0)) {
                    u52.closeFinally(bufferedReader, th);
                } else {
                    try {
                        bufferedReader.close();
                    } catch (Throwable unused) {
                    }
                }
                o28.finallyEnd(1);
                throw th2;
            }
        }
    }

    @t28
    private static final BufferedWriter buffered(Writer writer, int i) {
        md8.checkNotNullParameter(writer, "<this>");
        return writer instanceof BufferedWriter ? (BufferedWriter) writer : new BufferedWriter(writer, i);
    }

    @t28
    private static final String readText(URL url, Charset charset) {
        md8.checkNotNullParameter(url, "<this>");
        md8.checkNotNullParameter(charset, ypa.f102547g);
        return new String(readBytes(url), charset);
    }
}
