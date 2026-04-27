package p000;

import android.content.Context;
import java.lang.annotation.Annotation;
import java.util.concurrent.Executor;
import p000.ej2;

/* JADX INFO: loaded from: classes5.dex */
public final class xy5 {

    /* JADX INFO: renamed from: xy5$a */
    public static final class C15346a<T> implements tj2 {

        /* JADX INFO: renamed from: a */
        public static final C15346a<T> f99655a = new C15346a<>();

        @Override // p000.tj2
        public final m13 create(mj2 mj2Var) {
            md8.reifiedOperationMarker(4, "T");
            Object obj = mj2Var.get(pkd.qualified(Annotation.class, Executor.class));
            md8.checkNotNullExpressionValue(obj, "get(...)");
            return a95.from((Executor) obj);
        }
    }

    @yfb
    public static final lw5 app(@yfb hw5 hw5Var, @yfb String str) {
        md8.checkNotNullParameter(hw5Var, "<this>");
        md8.checkNotNullParameter(str, "name");
        lw5 lw5Var = lw5.getInstance(str);
        md8.checkNotNullExpressionValue(lw5Var, "getInstance(...)");
        return lw5Var;
    }

    private static final /* synthetic */ <T extends Annotation> ej2<m13> coroutineDispatcher() {
        md8.reifiedOperationMarker(4, "T");
        ej2.C5340b c5340bBuilder = ej2.builder(pkd.qualified(Annotation.class, m13.class));
        md8.reifiedOperationMarker(4, "T");
        ej2.C5340b c5340bAdd = c5340bBuilder.add(i64.required((pkd<?>) pkd.qualified(Annotation.class, Executor.class)));
        md8.needClassReification();
        ej2<m13> ej2VarBuild = c5340bAdd.factory(C15346a.f99655a).build();
        md8.checkNotNullExpressionValue(ej2VarBuild, "build(...)");
        return ej2VarBuild;
    }

    @yfb
    public static final lw5 getApp(@yfb hw5 hw5Var) {
        md8.checkNotNullParameter(hw5Var, "<this>");
        lw5 lw5Var = lw5.getInstance();
        md8.checkNotNullExpressionValue(lw5Var, "getInstance(...)");
        return lw5Var;
    }

    @yfb
    public static final az5 getOptions(@yfb hw5 hw5Var) {
        md8.checkNotNullParameter(hw5Var, "<this>");
        az5 options = getApp(hw5.f45141a).getOptions();
        md8.checkNotNullExpressionValue(options, "getOptions(...)");
        return options;
    }

    @gib
    public static final lw5 initialize(@yfb hw5 hw5Var, @yfb Context context) {
        md8.checkNotNullParameter(hw5Var, "<this>");
        md8.checkNotNullParameter(context, "context");
        return lw5.initializeApp(context);
    }

    @yfb
    public static final lw5 initialize(@yfb hw5 hw5Var, @yfb Context context, @yfb az5 az5Var) {
        md8.checkNotNullParameter(hw5Var, "<this>");
        md8.checkNotNullParameter(context, "context");
        md8.checkNotNullParameter(az5Var, "options");
        lw5 lw5VarInitializeApp = lw5.initializeApp(context, az5Var);
        md8.checkNotNullExpressionValue(lw5VarInitializeApp, "initializeApp(...)");
        return lw5VarInitializeApp;
    }

    @yfb
    public static final lw5 initialize(@yfb hw5 hw5Var, @yfb Context context, @yfb az5 az5Var, @yfb String str) {
        md8.checkNotNullParameter(hw5Var, "<this>");
        md8.checkNotNullParameter(context, "context");
        md8.checkNotNullParameter(az5Var, "options");
        md8.checkNotNullParameter(str, "name");
        lw5 lw5VarInitializeApp = lw5.initializeApp(context, az5Var, str);
        md8.checkNotNullExpressionValue(lw5VarInitializeApp, "initializeApp(...)");
        return lw5VarInitializeApp;
    }
}
