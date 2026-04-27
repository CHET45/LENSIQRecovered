package p000;

/* JADX INFO: loaded from: classes.dex */
public final class en6 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final String f33585a = "\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n";

    /* JADX INFO: renamed from: b */
    @yfb
    public static final String f33586b = "\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n";
}
