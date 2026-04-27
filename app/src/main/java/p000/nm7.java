package p000;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public interface nm7 {

    /* JADX INFO: renamed from: a */
    public static final int f64988a = -1;

    /* JADX INFO: renamed from: nm7$a */
    public interface InterfaceC9940a extends nm7 {
        @efb
        List<InterfaceC9940a> children();

        boolean isRoot();

        @hib
        InterfaceC9940a parent();
    }

    /* JADX INFO: renamed from: nm7$b */
    public interface InterfaceC9941b extends nm7 {
    }

    @efb
    Map<String, String> attributes();

    int end();

    @efb
    InterfaceC9940a getAsBlock();

    @efb
    InterfaceC9941b getAsInline();

    boolean isBlock();

    boolean isClosed();

    boolean isEmpty();

    boolean isInline();

    @efb
    String name();

    int start();
}
