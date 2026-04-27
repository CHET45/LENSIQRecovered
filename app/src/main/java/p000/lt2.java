package p000;

import java.io.InputStream;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes7.dex */
@xn8(name = "ConsoleKt")
public final class lt2 {
    @t28
    private static final void print(Object obj) {
        System.out.print(obj);
    }

    @t28
    private static final void println(Object obj) {
        System.out.println(obj);
    }

    @gib
    public static final String readLine() {
        m69 m69Var = m69.f60010a;
        InputStream inputStream = System.in;
        md8.checkNotNullExpressionValue(inputStream, "in");
        Charset charsetDefaultCharset = Charset.defaultCharset();
        md8.checkNotNullExpressionValue(charsetDefaultCharset, "defaultCharset(...)");
        return m69Var.readLine(inputStream, charsetDefaultCharset);
    }

    @jjf(version = "1.6")
    @yfb
    public static final String readln() {
        String str = readlnOrNull();
        if (str != null) {
            return str;
        }
        throw new pqd("EOF has already been reached");
    }

    @gib
    @jjf(version = "1.6")
    public static final String readlnOrNull() {
        return readLine();
    }

    @t28
    private static final void print(int i) {
        System.out.print(i);
    }

    @t28
    private static final void println(int i) {
        System.out.println(i);
    }

    @t28
    private static final void print(long j) {
        System.out.print(j);
    }

    @t28
    private static final void println(long j) {
        System.out.println(j);
    }

    @t28
    private static final void print(byte b) {
        System.out.print(Byte.valueOf(b));
    }

    @t28
    private static final void println(byte b) {
        System.out.println(Byte.valueOf(b));
    }

    @t28
    private static final void print(short s) {
        System.out.print(Short.valueOf(s));
    }

    @t28
    private static final void println(short s) {
        System.out.println(Short.valueOf(s));
    }

    @t28
    private static final void print(char c) {
        System.out.print(c);
    }

    @t28
    private static final void println(char c) {
        System.out.println(c);
    }

    @t28
    private static final void print(boolean z) {
        System.out.print(z);
    }

    @t28
    private static final void println(boolean z) {
        System.out.println(z);
    }

    @t28
    private static final void print(float f) {
        System.out.print(f);
    }

    @t28
    private static final void println(float f) {
        System.out.println(f);
    }

    @t28
    private static final void print(double d) {
        System.out.print(d);
    }

    @t28
    private static final void println(double d) {
        System.out.println(d);
    }

    @t28
    private static final void print(char[] cArr) {
        md8.checkNotNullParameter(cArr, g55.f38799h);
        System.out.print(cArr);
    }

    @t28
    private static final void println(char[] cArr) {
        md8.checkNotNullParameter(cArr, g55.f38799h);
        System.out.println(cArr);
    }

    @t28
    private static final void println() {
        System.out.println();
    }
}
