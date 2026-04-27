package p000;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: r1 */
/* JADX INFO: loaded from: classes5.dex */
@xx4
@tw7
public abstract class AbstractC11839r1 implements lh7 {
    @Override // p000.lh7
    public jh7 hashBytes(byte[] input) {
        return hashBytes(input, 0, input.length);
    }

    @Override // p000.lh7
    public jh7 hashInt(int input) {
        return newHasher(4).putInt(input).hash();
    }

    @Override // p000.lh7
    public jh7 hashLong(long input) {
        return newHasher(8).putLong(input).hash();
    }

    @Override // p000.lh7
    public <T> jh7 hashObject(@hgc T instance, s07<? super T> funnel) {
        return newHasher().putObject(instance, funnel).hash();
    }

    @Override // p000.lh7
    public jh7 hashString(CharSequence input, Charset charset) {
        return newHasher().putString(input, charset).hash();
    }

    @Override // p000.lh7
    public jh7 hashUnencodedChars(CharSequence input) {
        return newHasher(input.length() * 2).putUnencodedChars(input).hash();
    }

    @Override // p000.lh7
    public wh7 newHasher(int expectedInputSize) {
        v7d.checkArgument(expectedInputSize >= 0, "expectedInputSize must be >= 0 but was %s", expectedInputSize);
        return newHasher();
    }

    @Override // p000.lh7
    public jh7 hashBytes(byte[] input, int off, int len) {
        v7d.checkPositionIndexes(off, off + len, input.length);
        return newHasher(len).putBytes(input, off, len).hash();
    }

    @Override // p000.lh7
    public jh7 hashBytes(ByteBuffer input) {
        return newHasher(input.remaining()).putBytes(input).hash();
    }
}
