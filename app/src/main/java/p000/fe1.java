package p000;

import android.app.PendingIntent;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.browser.C0553R;
import androidx.browser.browseractions.BrowserActionsFallbackMenuView;
import java.util.ArrayList;
import java.util.List;
import p000.p7e;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class fe1 implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: f */
    public static final String f36251f = "BrowserActionskMenuUi";

    /* JADX INFO: renamed from: a */
    public final Context f36252a;

    /* JADX INFO: renamed from: b */
    public final Uri f36253b;

    /* JADX INFO: renamed from: c */
    public final List<ce1> f36254c;

    /* JADX INFO: renamed from: d */
    @hib
    public InterfaceC5741d f36255d;

    /* JADX INFO: renamed from: e */
    @hib
    public ee1 f36256e;

    /* JADX INFO: renamed from: fe1$a */
    public class RunnableC5738a implements Runnable {
        public RunnableC5738a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ((ClipboardManager) fe1.this.f36252a.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("url", fe1.this.f36253b.toString()));
            Toast.makeText(fe1.this.f36252a, fe1.this.f36252a.getString(C0553R.string.copy_toast_msg), 0).show();
        }
    }

    /* JADX INFO: renamed from: fe1$b */
    public class DialogInterfaceOnShowListenerC5739b implements DialogInterface.OnShowListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f36258a;

        public DialogInterfaceOnShowListenerC5739b(View view) {
            this.f36258a = view;
        }

        @Override // android.content.DialogInterface.OnShowListener
        public void onShow(DialogInterface dialogInterface) {
            InterfaceC5741d interfaceC5741d = fe1.this.f36255d;
            if (interfaceC5741d == null) {
                Log.e(fe1.f36251f, "Cannot trigger menu item listener, it is null");
            } else {
                interfaceC5741d.onMenuShown(this.f36258a);
            }
        }
    }

    /* JADX INFO: renamed from: fe1$c */
    public class ViewOnClickListenerC5740c implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ TextView f36260a;

        public ViewOnClickListenerC5740c(TextView textView) {
            this.f36260a = textView;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (pwg.getMaxLines(this.f36260a) == Integer.MAX_VALUE) {
                this.f36260a.setMaxLines(1);
                this.f36260a.setEllipsize(TextUtils.TruncateAt.END);
            } else {
                this.f36260a.setMaxLines(Integer.MAX_VALUE);
                this.f36260a.setEllipsize(null);
            }
        }
    }

    /* JADX INFO: renamed from: fe1$d */
    @fdi
    @p7e({p7e.EnumC10826a.f69936c})
    public interface InterfaceC5741d {
        void onMenuShown(View view);
    }

    public fe1(@efb Context context, @efb Uri uri, @efb List<ce1> list) {
        this.f36252a = context;
        this.f36253b = uri;
        this.f36254c = buildFallbackMenuItemList(list);
    }

    private Runnable buildCopyAction() {
        return new RunnableC5738a();
    }

    @efb
    private List<ce1> buildFallbackMenuItemList(List<ce1> list) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ce1(this.f36252a.getString(C0553R.string.fallback_menu_item_open_in_browser), buildOpenInBrowserAction()));
        arrayList.add(new ce1(this.f36252a.getString(C0553R.string.fallback_menu_item_copy_link), buildCopyAction()));
        arrayList.add(new ce1(this.f36252a.getString(C0553R.string.fallback_menu_item_share_link), buildShareAction()));
        arrayList.addAll(list);
        return arrayList;
    }

    private PendingIntent buildOpenInBrowserAction() {
        return PendingIntent.getActivity(this.f36252a, 0, new Intent("android.intent.action.VIEW", this.f36253b), 67108864);
    }

    private PendingIntent buildShareAction() {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.TEXT", this.f36253b.toString());
        intent.setType("text/plain");
        return PendingIntent.getActivity(this.f36252a, 0, intent, 67108864);
    }

    private BrowserActionsFallbackMenuView initMenuView(View view) {
        BrowserActionsFallbackMenuView browserActionsFallbackMenuView = (BrowserActionsFallbackMenuView) view.findViewById(C0553R.id.browser_actions_menu_view);
        TextView textView = (TextView) view.findViewById(C0553R.id.browser_actions_header_text);
        textView.setText(this.f36253b.toString());
        textView.setOnClickListener(new ViewOnClickListenerC5740c(textView));
        ListView listView = (ListView) view.findViewById(C0553R.id.browser_actions_menu_items);
        listView.setAdapter((ListAdapter) new de1(this.f36254c, this.f36252a));
        listView.setOnItemClickListener(this);
        return browserActionsFallbackMenuView;
    }

    @fdi
    @p7e({p7e.EnumC10826a.f69936c})
    /* JADX INFO: renamed from: a */
    public void m10852a(@hib InterfaceC5741d interfaceC5741d) {
        this.f36255d = interfaceC5741d;
    }

    public void displayMenu() {
        View viewInflate = LayoutInflater.from(this.f36252a).inflate(C0553R.layout.browser_actions_context_menu_page, (ViewGroup) null);
        ee1 ee1Var = new ee1(this.f36252a, initMenuView(viewInflate));
        this.f36256e = ee1Var;
        ee1Var.setContentView(viewInflate);
        if (this.f36255d != null) {
            this.f36256e.setOnShowListener(new DialogInterfaceOnShowListenerC5739b(viewInflate));
        }
        this.f36256e.show();
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ce1 ce1Var = this.f36254c.get(i);
        if (ce1Var.getAction() != null) {
            try {
                ce1Var.getAction().send();
            } catch (PendingIntent.CanceledException e) {
                Log.e(f36251f, "Failed to send custom item action", e);
            }
        } else if (ce1Var.m3914a() != null) {
            ce1Var.m3914a().run();
        }
        ee1 ee1Var = this.f36256e;
        if (ee1Var == null) {
            Log.e(f36251f, "Cannot dismiss dialog, it has already been dismissed.");
        } else {
            ee1Var.dismiss();
        }
    }
}
