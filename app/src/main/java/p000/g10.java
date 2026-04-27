package p000;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface g10 extends ssa {
    oua getMethods(int index);

    int getMethodsCount();

    List<oua> getMethodsList();

    kwa getMixins(int index);

    int getMixinsCount();

    List<kwa> getMixinsList();

    String getName();

    wj1 getNameBytes();

    u6c getOptions(int index);

    int getOptionsCount();

    List<u6c> getOptionsList();

    xvf getSourceContext();

    pig getSyntax();

    int getSyntaxValue();

    String getVersion();

    wj1 getVersionBytes();

    boolean hasSourceContext();
}
