package p000;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
@zx4
@jd7
@yg8
public abstract class gw1 {
    public Writer openBufferedStream() throws IOException {
        Writer writerOpenStream = openStream();
        return writerOpenStream instanceof BufferedWriter ? (BufferedWriter) writerOpenStream : new BufferedWriter(writerOpenStream);
    }

    public abstract Writer openStream() throws IOException;

    public void write(CharSequence charSequence) throws IOException {
        v7d.checkNotNull(charSequence);
        try {
            Writer writer = (Writer) d62.create().register(openStream());
            writer.append(charSequence);
            writer.flush();
        } finally {
        }
    }

    @op1
    public long writeFrom(Readable readable) throws IOException {
        v7d.checkNotNull(readable);
        try {
            Writer writer = (Writer) d62.create().register(openStream());
            long jCopy = jw1.copy(readable, writer);
            writer.flush();
            return jCopy;
        } finally {
        }
    }

    public void writeLines(Iterable<? extends CharSequence> lines) throws IOException {
        writeLines(lines, System.getProperty("line.separator"));
    }

    public void writeLines(Iterable<? extends CharSequence> lines, String lineSeparator) throws IOException {
        v7d.checkNotNull(lines);
        v7d.checkNotNull(lineSeparator);
        try {
            Writer writer = (Writer) d62.create().register(openBufferedStream());
            Iterator<? extends CharSequence> it = lines.iterator();
            while (it.hasNext()) {
                writer.append(it.next()).append((CharSequence) lineSeparator);
            }
            writer.flush();
        } finally {
        }
    }
}
