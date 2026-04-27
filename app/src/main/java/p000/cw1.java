package p000;

import java.text.CharacterIterator;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public final class cw1 implements CharacterIterator {

    /* JADX INFO: renamed from: e */
    public static final int f27908e = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final CharSequence f27909a;

    /* JADX INFO: renamed from: b */
    public final int f27910b;

    /* JADX INFO: renamed from: c */
    public final int f27911c;

    /* JADX INFO: renamed from: d */
    public int f27912d;

    public cw1(@yfb CharSequence charSequence, int i, int i2) {
        this.f27909a = charSequence;
        this.f27910b = i;
        this.f27911c = i2;
        this.f27912d = i;
    }

    @Override // java.text.CharacterIterator
    @yfb
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // java.text.CharacterIterator
    public char current() {
        int i = this.f27912d;
        if (i == this.f27911c) {
            return (char) 65535;
        }
        return this.f27909a.charAt(i);
    }

    @Override // java.text.CharacterIterator
    public char first() {
        this.f27912d = this.f27910b;
        return current();
    }

    @Override // java.text.CharacterIterator
    public int getBeginIndex() {
        return this.f27910b;
    }

    @Override // java.text.CharacterIterator
    public int getEndIndex() {
        return this.f27911c;
    }

    @Override // java.text.CharacterIterator
    public int getIndex() {
        return this.f27912d;
    }

    @Override // java.text.CharacterIterator
    public char last() {
        int i = this.f27910b;
        int i2 = this.f27911c;
        if (i == i2) {
            this.f27912d = i2;
            return (char) 65535;
        }
        int i3 = i2 - 1;
        this.f27912d = i3;
        return this.f27909a.charAt(i3);
    }

    @Override // java.text.CharacterIterator
    public char next() {
        int i = this.f27912d + 1;
        this.f27912d = i;
        int i2 = this.f27911c;
        if (i < i2) {
            return this.f27909a.charAt(i);
        }
        this.f27912d = i2;
        return (char) 65535;
    }

    @Override // java.text.CharacterIterator
    public char previous() {
        int i = this.f27912d;
        if (i <= this.f27910b) {
            return (char) 65535;
        }
        int i2 = i - 1;
        this.f27912d = i2;
        return this.f27909a.charAt(i2);
    }

    @Override // java.text.CharacterIterator
    public char setIndex(int i) {
        int i2 = this.f27910b;
        if (i > this.f27911c || i2 > i) {
            throw new IllegalArgumentException("invalid position");
        }
        this.f27912d = i;
        return current();
    }
}
