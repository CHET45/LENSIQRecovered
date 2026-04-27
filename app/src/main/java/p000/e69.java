package p000;

/* JADX INFO: loaded from: classes.dex */
public final class e69 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final int packBytes(int i, int i2, int i3) {
        return i | (i2 << 8) | (i3 << 16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int unpackByte1(int i) {
        return i & 255;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int unpackByte2(int i) {
        return (i >> 8) & 255;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int unpackByte3(int i) {
        return (i >> 16) & 255;
    }
}
