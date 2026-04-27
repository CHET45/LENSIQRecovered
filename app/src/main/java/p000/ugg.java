package p000;

/* JADX INFO: loaded from: classes7.dex */
@jjf(version = "1.3")
public abstract class ugg extends cz2 implements h07<Object>, sgg {
    private final int arity;

    public ugg(int i, @gib zy2<Object> zy2Var) {
        super(zy2Var);
        this.arity = i;
    }

    @Override // p000.h07
    public int getArity() {
        return this.arity;
    }

    @Override // p000.tq0
    @yfb
    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        String strRenderLambdaToString = vvd.renderLambdaToString(this);
        md8.checkNotNullExpressionValue(strRenderLambdaToString, "renderLambdaToString(...)");
        return strRenderLambdaToString;
    }

    public ugg(int i) {
        this(i, null);
    }
}
