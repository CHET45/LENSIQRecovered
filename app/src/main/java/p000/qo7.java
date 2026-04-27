package p000;

import java.util.List;
import p000.po7;

/* JADX INFO: loaded from: classes5.dex */
public interface qo7 extends rsa {
    po7 getAdditionalBindings(int i);

    int getAdditionalBindingsCount();

    List<po7> getAdditionalBindingsList();

    String getBody();

    vj1 getBodyBytes();

    cd3 getCustom();

    String getDelete();

    vj1 getDeleteBytes();

    String getGet();

    vj1 getGetBytes();

    String getPatch();

    vj1 getPatchBytes();

    po7.EnumC11055c getPatternCase();

    String getPost();

    vj1 getPostBytes();

    String getPut();

    vj1 getPutBytes();

    String getResponseBody();

    vj1 getResponseBodyBytes();

    String getSelector();

    vj1 getSelectorBytes();

    boolean hasCustom();

    boolean hasDelete();

    boolean hasGet();

    boolean hasPatch();

    boolean hasPost();

    boolean hasPut();
}
