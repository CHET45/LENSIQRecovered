package p000;

import com.blankj.utilcode.util.C2473f;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public class oqg {

    /* JADX INFO: renamed from: a */
    public final Appendable f68330a;

    /* JADX INFO: renamed from: b */
    public char f68331b;

    public oqg(Appendable appendable) {
        this.f68330a = appendable;
    }

    private void append(String str) {
        try {
            this.f68330a.append(str);
            int length = str.length();
            if (length != 0) {
                this.f68331b = str.charAt(length - 1);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void colon() {
        char c = this.f68331b;
        if (c == 0 || c == ':') {
            return;
        }
        append(':');
    }

    public void line() {
        char c = this.f68331b;
        if (c == 0 || c == '\n') {
            return;
        }
        append('\n');
    }

    public void whitespace() {
        char c = this.f68331b;
        if (c == 0 || c == ' ') {
            return;
        }
        append(' ');
    }

    public void write(String str) {
        append(str);
    }

    public void writeStripped(String str) {
        append(str.replaceAll("[\\r\\n\\s]+", C2473f.f17566z));
    }

    public void write(char c) {
        append(c);
    }

    private void append(char c) {
        try {
            this.f68330a.append(c);
            this.f68331b = c;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
