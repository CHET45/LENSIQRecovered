package p000;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes5.dex */
@xx4
@tw7
public interface lh7 {
    int bits();

    jh7 hashBytes(ByteBuffer input);

    jh7 hashBytes(byte[] input);

    jh7 hashBytes(byte[] input, int off, int len);

    jh7 hashInt(int input);

    jh7 hashLong(long input);

    <T> jh7 hashObject(@hgc T instance, s07<? super T> funnel);

    jh7 hashString(CharSequence input, Charset charset);

    jh7 hashUnencodedChars(CharSequence input);

    wh7 newHasher();

    wh7 newHasher(int expectedInputSize);
}
