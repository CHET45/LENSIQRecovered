package p000;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes7.dex */
public final class y69 implements vye<String> {

    /* JADX INFO: renamed from: a */
    @yfb
    public final BufferedReader f100493a;

    /* JADX INFO: renamed from: y69$a */
    public static final class C15504a implements Iterator<String>, uo8 {

        /* JADX INFO: renamed from: a */
        public String f100494a;

        /* JADX INFO: renamed from: b */
        public boolean f100495b;

        public C15504a() {
        }

        @Override // java.util.Iterator
        public boolean hasNext() throws IOException {
            if (this.f100494a == null && !this.f100495b) {
                String line = y69.this.f100493a.readLine();
                this.f100494a = line;
                if (line == null) {
                    this.f100495b = true;
                }
            }
            return this.f100494a != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Iterator
        public String next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            String str = this.f100494a;
            this.f100494a = null;
            md8.checkNotNull(str);
            return str;
        }
    }

    public y69(@yfb BufferedReader bufferedReader) {
        md8.checkNotNullParameter(bufferedReader, "reader");
        this.f100493a = bufferedReader;
    }

    @Override // p000.vye
    @yfb
    public Iterator<String> iterator() {
        return new C15504a();
    }
}
