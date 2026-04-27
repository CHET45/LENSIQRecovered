package p000;

/* JADX INFO: loaded from: classes8.dex */
public interface m61 {
    void addLine(CharSequence charSequence);

    boolean canContain(b61 b61Var);

    boolean canHaveLazyContinuationLines();

    void closeBlock();

    b61 getBlock();

    boolean isContainer();

    void parseInlines(u28 u28Var);

    d61 tryContinue(zhc zhcVar);
}
