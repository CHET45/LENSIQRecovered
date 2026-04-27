package p000;

import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.CharBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
@zx4
@jd7
@yg8
public final class jw1 {

    /* JADX INFO: renamed from: a */
    public static final int f52119a = 2048;

    /* JADX INFO: renamed from: jw1$a */
    public static final class C8126a extends Writer {

        /* JADX INFO: renamed from: a */
        public static final C8126a f52120a = new C8126a();

        private C8126a() {
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
        }

        public String toString() {
            return "CharStreams.nullWriter()";
        }

        @Override // java.io.Writer
        public void write(int c) {
        }

        @Override // java.io.Writer
        public void write(char[] cbuf) {
            v7d.checkNotNull(cbuf);
        }

        @Override // java.io.Writer
        public void write(char[] cbuf, int off, int len) {
            v7d.checkPositionIndexes(off, len + off, cbuf.length);
        }

        @Override // java.io.Writer, java.lang.Appendable
        public Writer append(@wx1 CharSequence csq) {
            return this;
        }

        @Override // java.io.Writer
        public void write(String str) {
            v7d.checkNotNull(str);
        }

        @Override // java.io.Writer, java.lang.Appendable
        public Writer append(@wx1 CharSequence csq, int start, int end) {
            v7d.checkPositionIndexes(start, end, csq == null ? 4 : csq.length());
            return this;
        }

        @Override // java.io.Writer
        public void write(String str, int off, int len) {
            v7d.checkPositionIndexes(off, len + off, str.length());
        }

        @Override // java.io.Writer, java.lang.Appendable
        public Writer append(char c) {
            return this;
        }
    }

    private jw1() {
    }

    @op1
    /* JADX INFO: renamed from: a */
    public static long m14359a(Reader from, StringBuilder to) throws IOException {
        v7d.checkNotNull(from);
        v7d.checkNotNull(to);
        char[] cArr = new char[2048];
        long j = 0;
        while (true) {
            int i = from.read(cArr);
            if (i == -1) {
                return j;
            }
            to.append(cArr, 0, i);
            j += (long) i;
        }
    }

    public static Writer asWriter(Appendable target) {
        return target instanceof Writer ? (Writer) target : new j40(target);
    }

    @op1
    /* JADX INFO: renamed from: b */
    public static long m14360b(Reader from, Writer to) throws IOException {
        v7d.checkNotNull(from);
        v7d.checkNotNull(to);
        char[] cArr = new char[2048];
        long j = 0;
        while (true) {
            int i = from.read(cArr);
            if (i == -1) {
                return j;
            }
            to.write(cArr, 0, i);
            j += (long) i;
        }
    }

    /* JADX INFO: renamed from: c */
    public static CharBuffer m14361c() {
        return CharBuffer.allocate(2048);
    }

    @op1
    public static long copy(Readable from, Appendable to) throws IOException {
        if (from instanceof Reader) {
            return to instanceof StringBuilder ? m14359a((Reader) from, (StringBuilder) to) : m14360b((Reader) from, asWriter(to));
        }
        v7d.checkNotNull(from);
        v7d.checkNotNull(to);
        CharBuffer charBufferM14361c = m14361c();
        long jRemaining = 0;
        while (from.read(charBufferM14361c) != -1) {
            ki8.m14758b(charBufferM14361c);
            to.append(charBufferM14361c);
            jRemaining += (long) charBufferM14361c.remaining();
            ki8.m14757a(charBufferM14361c);
        }
        return jRemaining;
    }

    @op1
    public static long exhaust(Readable readable) throws IOException {
        CharBuffer charBufferM14361c = m14361c();
        long j = 0;
        while (true) {
            long j2 = readable.read(charBufferM14361c);
            if (j2 == -1) {
                return j;
            }
            j += j2;
            ki8.m14757a(charBufferM14361c);
        }
    }

    public static Writer nullWriter() {
        return C8126a.f52120a;
    }

    public static List<String> readLines(Readable r) throws IOException {
        ArrayList arrayList = new ArrayList();
        l69 l69Var = new l69(r);
        while (true) {
            String line = l69Var.readLine();
            if (line == null) {
                return arrayList;
            }
            arrayList.add(line);
        }
    }

    public static void skipFully(Reader reader, long n) throws IOException {
        v7d.checkNotNull(reader);
        while (n > 0) {
            long jSkip = reader.skip(n);
            if (jSkip == 0) {
                throw new EOFException();
            }
            n -= jSkip;
        }
    }

    public static String toString(Readable r) throws IOException {
        return toStringBuilder(r).toString();
    }

    private static StringBuilder toStringBuilder(Readable r) throws IOException {
        StringBuilder sb = new StringBuilder();
        if (r instanceof Reader) {
            m14359a((Reader) r, sb);
        } else {
            copy(r, sb);
        }
        return sb;
    }

    @jgc
    @op1
    public static <T> T readLines(Readable readable, k69<T> processor) throws IOException {
        String line;
        v7d.checkNotNull(readable);
        v7d.checkNotNull(processor);
        l69 l69Var = new l69(readable);
        do {
            line = l69Var.readLine();
            if (line == null) {
                break;
            }
        } while (processor.processLine(line));
        return processor.getResult();
    }
}
