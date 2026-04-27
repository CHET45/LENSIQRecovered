package p000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringReader;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
@zx4
@jd7
@yg8
public abstract class hw1 {

    /* JADX INFO: renamed from: hw1$a */
    public final class C7059a extends rj1 {

        /* JADX INFO: renamed from: a */
        public final Charset f45113a;

        public C7059a(Charset charset) {
            this.f45113a = (Charset) v7d.checkNotNull(charset);
        }

        @Override // p000.rj1
        public hw1 asCharSource(Charset charset) {
            return charset.equals(this.f45113a) ? hw1.this : super.asCharSource(charset);
        }

        @Override // p000.rj1
        public InputStream openStream() throws IOException {
            return new jrd(hw1.this.openStream(), this.f45113a, 8192);
        }

        public String toString() {
            return hw1.this.toString() + ".asByteSource(" + this.f45113a + c0b.f15434d;
        }
    }

    /* JADX INFO: renamed from: hw1$b */
    public static class C7060b extends hw1 {

        /* JADX INFO: renamed from: b */
        public static final azf f45115b = azf.onPattern("\r\n|\n|\r");

        /* JADX INFO: renamed from: a */
        public final CharSequence f45116a;

        /* JADX INFO: renamed from: hw1$b$a */
        public class a extends AbstractC0012a2<String> {

            /* JADX INFO: renamed from: c */
            public Iterator<String> f45117c;

            public a() {
                this.f45117c = C7060b.f45115b.split(C7060b.this.f45116a).iterator();
            }

            @Override // p000.AbstractC0012a2
            @wx1
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public String computeNext() {
                if (this.f45117c.hasNext()) {
                    String next = this.f45117c.next();
                    if (this.f45117c.hasNext() || !next.isEmpty()) {
                        return next;
                    }
                }
                return m25a();
            }
        }

        public C7060b(CharSequence seq) {
            this.f45116a = (CharSequence) v7d.checkNotNull(seq);
        }

        private Iterator<String> linesIterator() {
            return new a();
        }

        @Override // p000.hw1
        public boolean isEmpty() {
            return this.f45116a.length() == 0;
        }

        @Override // p000.hw1
        public long length() {
            return this.f45116a.length();
        }

        @Override // p000.hw1
        public z6c<Long> lengthIfKnown() {
            return z6c.m26593of(Long.valueOf(this.f45116a.length()));
        }

        @Override // p000.hw1
        public Reader openStream() {
            return new ew1(this.f45116a);
        }

        @Override // p000.hw1
        public String read() {
            return this.f45116a.toString();
        }

        @Override // p000.hw1
        @wx1
        public String readFirstLine() {
            Iterator<String> itLinesIterator = linesIterator();
            if (itLinesIterator.hasNext()) {
                return itLinesIterator.next();
            }
            return null;
        }

        @Override // p000.hw1
        public kx7<String> readLines() {
            return kx7.copyOf(linesIterator());
        }

        public String toString() {
            return "CharSource.wrap(" + i80.truncate(this.f45116a, 30, "...") + c0b.f15434d;
        }

        @Override // p000.hw1
        @jgc
        public <T> T readLines(k69<T> processor) throws IOException {
            Iterator<String> itLinesIterator = linesIterator();
            while (itLinesIterator.hasNext() && processor.processLine(itLinesIterator.next())) {
            }
            return processor.getResult();
        }
    }

    /* JADX INFO: renamed from: hw1$c */
    public static final class C7061c extends hw1 {

        /* JADX INFO: renamed from: a */
        public final Iterable<? extends hw1> f45119a;

        public C7061c(Iterable<? extends hw1> sources) {
            this.f45119a = (Iterable) v7d.checkNotNull(sources);
        }

        @Override // p000.hw1
        public boolean isEmpty() throws IOException {
            Iterator<? extends hw1> it = this.f45119a.iterator();
            while (it.hasNext()) {
                if (!it.next().isEmpty()) {
                    return false;
                }
            }
            return true;
        }

        @Override // p000.hw1
        public long length() throws IOException {
            Iterator<? extends hw1> it = this.f45119a.iterator();
            long length = 0;
            while (it.hasNext()) {
                length += it.next().length();
            }
            return length;
        }

        @Override // p000.hw1
        public z6c<Long> lengthIfKnown() {
            Iterator<? extends hw1> it = this.f45119a.iterator();
            long jLongValue = 0;
            while (it.hasNext()) {
                z6c<Long> z6cVarLengthIfKnown = it.next().lengthIfKnown();
                if (!z6cVarLengthIfKnown.isPresent()) {
                    return z6c.absent();
                }
                jLongValue += z6cVarLengthIfKnown.get().longValue();
            }
            return z6c.m26593of(Long.valueOf(jLongValue));
        }

        @Override // p000.hw1
        public Reader openStream() throws IOException {
            return new e3b(this.f45119a.iterator());
        }

        public String toString() {
            return "CharSource.concat(" + this.f45119a + c0b.f15434d;
        }
    }

    /* JADX INFO: renamed from: hw1$d */
    public static final class C7062d extends C7063e {

        /* JADX INFO: renamed from: c */
        public static final C7062d f45120c = new C7062d();

        private C7062d() {
            super("");
        }

        @Override // p000.hw1.C7060b
        public String toString() {
            return "CharSource.empty()";
        }
    }

    public static hw1 concat(Iterable<? extends hw1> sources) {
        return new C7061c(sources);
    }

    private long countBySkipping(Reader reader) throws IOException {
        long j = 0;
        while (true) {
            long jSkip = reader.skip(Long.MAX_VALUE);
            if (jSkip == 0) {
                return j;
            }
            j += jSkip;
        }
    }

    public static hw1 empty() {
        return C7062d.f45120c;
    }

    public static hw1 wrap(CharSequence charSequence) {
        return charSequence instanceof String ? new C7063e((String) charSequence) : new C7060b(charSequence);
    }

    public rj1 asByteSource(Charset charset) {
        return new C7059a(charset);
    }

    @op1
    public long copyTo(Appendable appendable) throws IOException {
        v7d.checkNotNull(appendable);
        try {
            return jw1.copy((Reader) d62.create().register(openStream()), appendable);
        } finally {
        }
    }

    public boolean isEmpty() throws IOException {
        z6c<Long> z6cVarLengthIfKnown = lengthIfKnown();
        if (z6cVarLengthIfKnown.isPresent()) {
            return z6cVarLengthIfKnown.get().longValue() == 0;
        }
        d62 d62VarCreate = d62.create();
        try {
            return ((Reader) d62VarCreate.register(openStream())).read() == -1;
        } catch (Throwable th) {
            try {
                throw d62VarCreate.rethrow(th);
            } finally {
                d62VarCreate.close();
            }
        }
    }

    public long length() throws IOException {
        z6c<Long> z6cVarLengthIfKnown = lengthIfKnown();
        if (z6cVarLengthIfKnown.isPresent()) {
            return z6cVarLengthIfKnown.get().longValue();
        }
        try {
            return countBySkipping((Reader) d62.create().register(openStream()));
        } finally {
        }
    }

    public z6c<Long> lengthIfKnown() {
        return z6c.absent();
    }

    public BufferedReader openBufferedStream() throws IOException {
        Reader readerOpenStream = openStream();
        return readerOpenStream instanceof BufferedReader ? (BufferedReader) readerOpenStream : new BufferedReader(readerOpenStream);
    }

    public abstract Reader openStream() throws IOException;

    public String read() throws IOException {
        try {
            return jw1.toString((Reader) d62.create().register(openStream()));
        } finally {
        }
    }

    @wx1
    public String readFirstLine() throws IOException {
        try {
            return ((BufferedReader) d62.create().register(openBufferedStream())).readLine();
        } finally {
        }
    }

    public kx7<String> readLines() throws IOException {
        try {
            BufferedReader bufferedReader = (BufferedReader) d62.create().register(openBufferedStream());
            ArrayList arrayListNewArrayList = eb9.newArrayList();
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    return kx7.copyOf((Collection) arrayListNewArrayList);
                }
                arrayListNewArrayList.add(line);
            }
        } finally {
        }
    }

    /* JADX INFO: renamed from: hw1$e */
    public static class C7063e extends C7060b {
        public C7063e(String seq) {
            super(seq);
        }

        @Override // p000.hw1
        public long copyTo(Appendable appendable) throws IOException {
            appendable.append(this.f45116a);
            return this.f45116a.length();
        }

        @Override // p000.hw1.C7060b, p000.hw1
        public Reader openStream() {
            return new StringReader((String) this.f45116a);
        }

        @Override // p000.hw1
        public long copyTo(gw1 sink) throws IOException {
            v7d.checkNotNull(sink);
            try {
                ((Writer) d62.create().register(sink.openStream())).write((String) this.f45116a);
                return this.f45116a.length();
            } finally {
            }
        }
    }

    public static hw1 concat(Iterator<? extends hw1> sources) {
        return concat(kx7.copyOf(sources));
    }

    public static hw1 concat(hw1... sources) {
        return concat(kx7.copyOf(sources));
    }

    @op1
    public long copyTo(gw1 sink) throws IOException {
        v7d.checkNotNull(sink);
        d62 d62VarCreate = d62.create();
        try {
            return jw1.copy((Reader) d62VarCreate.register(openStream()), (Writer) d62VarCreate.register(sink.openStream()));
        } finally {
        }
    }

    @jgc
    @op1
    public <T> T readLines(k69<T> k69Var) throws IOException {
        v7d.checkNotNull(k69Var);
        try {
            return (T) jw1.readLines((Reader) d62.create().register(openStream()), k69Var);
        } finally {
        }
    }
}
