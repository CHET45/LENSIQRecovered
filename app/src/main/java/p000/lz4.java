package p000;

/* JADX INFO: loaded from: classes8.dex */
public abstract class lz4 implements x54 {

    /* JADX INFO: renamed from: a */
    public final char f59324a;

    public lz4(char c) {
        this.f59324a = c;
    }

    @Override // p000.x54
    public char getClosingCharacter() {
        return this.f59324a;
    }

    @Override // p000.x54
    public int getDelimiterUse(y54 y54Var, y54 y54Var2) {
        if ((y54Var.canClose() || y54Var2.canOpen()) && y54Var2.originalLength() % 3 != 0 && (y54Var.originalLength() + y54Var2.originalLength()) % 3 == 0) {
            return 0;
        }
        return (y54Var.length() < 2 || y54Var2.length() < 2) ? 1 : 2;
    }

    @Override // p000.x54
    public int getMinLength() {
        return 1;
    }

    @Override // p000.x54
    public char getOpeningCharacter() {
        return this.f59324a;
    }

    @Override // p000.x54
    public void process(zpg zpgVar, zpg zpgVar2, int i) {
        deb iagVar;
        String strValueOf = String.valueOf(getOpeningCharacter());
        if (i == 1) {
            iagVar = new kz4(strValueOf);
        } else {
            iagVar = new iag(strValueOf + strValueOf);
        }
        deb next = zpgVar.getNext();
        while (next != null && next != zpgVar2) {
            deb next2 = next.getNext();
            iagVar.appendChild(next);
            next = next2;
        }
        zpgVar.insertAfter(iagVar);
    }
}
