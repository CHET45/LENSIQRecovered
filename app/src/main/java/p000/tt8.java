package p000;

import java.io.Serializable;

/* JADX INFO: loaded from: classes7.dex */
public abstract class tt8<R> implements h07<R>, Serializable {
    private final int arity;

    public tt8(int i) {
        this.arity = i;
    }

    @Override // p000.h07
    public int getArity() {
        return this.arity;
    }

    @yfb
    public String toString() {
        String strRenderLambdaToString = vvd.renderLambdaToString((tt8) this);
        md8.checkNotNullExpressionValue(strRenderLambdaToString, "renderLambdaToString(...)");
        return strRenderLambdaToString;
    }
}
