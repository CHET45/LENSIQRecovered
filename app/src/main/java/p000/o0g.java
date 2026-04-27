package p000;

import java.util.LinkedList;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes8.dex */
public class o0g implements x54 {

    /* JADX INFO: renamed from: a */
    public final char f66181a;

    /* JADX INFO: renamed from: b */
    public int f66182b = 0;

    /* JADX INFO: renamed from: c */
    public LinkedList<x54> f66183c = new LinkedList<>();

    public o0g(char c) {
        this.f66181a = c;
    }

    private x54 findProcessor(int i) {
        for (x54 x54Var : this.f66183c) {
            if (x54Var.getMinLength() <= i) {
                return x54Var;
            }
        }
        return this.f66183c.getFirst();
    }

    /* JADX INFO: renamed from: a */
    public void m18246a(x54 x54Var) {
        int minLength = x54Var.getMinLength();
        ListIterator<x54> listIterator = this.f66183c.listIterator();
        while (listIterator.hasNext()) {
            int minLength2 = listIterator.next().getMinLength();
            if (minLength > minLength2) {
                listIterator.previous();
                listIterator.add(x54Var);
                return;
            } else if (minLength == minLength2) {
                throw new IllegalArgumentException("Cannot add two delimiter processors for char '" + this.f66181a + "' and minimum length " + minLength);
            }
        }
        this.f66183c.add(x54Var);
        this.f66182b = minLength;
    }

    @Override // p000.x54
    public char getClosingCharacter() {
        return this.f66181a;
    }

    @Override // p000.x54
    public int getDelimiterUse(y54 y54Var, y54 y54Var2) {
        return findProcessor(y54Var.length()).getDelimiterUse(y54Var, y54Var2);
    }

    @Override // p000.x54
    public int getMinLength() {
        return this.f66182b;
    }

    @Override // p000.x54
    public char getOpeningCharacter() {
        return this.f66181a;
    }

    @Override // p000.x54
    public void process(zpg zpgVar, zpg zpgVar2, int i) {
        findProcessor(i).process(zpgVar, zpgVar2, i);
    }
}
